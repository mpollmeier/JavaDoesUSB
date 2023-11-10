//
// Java Does USB
// Copyright (c) 2022 Manuel Bleichenbacher
// Licensed under MIT License
// https://opensource.org/licenses/MIT
//
// Unit tests for transfers with timeout
//

package net.codecrete.usb;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TimeoutTest extends TestDeviceBase {

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS)
    void bulkTransferIn_timesOut() {
        assertThrows(UsbTimeoutException.class, () -> testDevice.transferIn(LOOPBACK_EP_IN, 200));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS)
    void bulkTransfer_doesNotTimeOut() {
        var data = generateRandomBytes(20, 7280277392L);
        testDevice.transferOut(LOOPBACK_EP_OUT, data);

       var received = testDevice.transferIn(LOOPBACK_EP_IN, 200);
        assertArrayEquals(data, received);

    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS)
    void bulkTransferOut_timesOut() {
        // The test device has an internal buffer of about 2KB for full-speed
        // and 16KB for high-speed. The first transfer should not time out.
        final var bufferSize = 32 * testDevice
                .getEndpoint(UsbDirection.OUT, LOOPBACK_EP_OUT).getPacketSize();

        var data = generateRandomBytes(100, 9383073929L);
        testDevice.transferOut(LOOPBACK_EP_OUT, data, 200);

        assertThrows(UsbTimeoutException.class, () -> {
            for (var i = 0; i < bufferSize / data.length; i++) {
                testDevice.transferOut(LOOPBACK_EP_OUT, data, 200);
            }
        });

        // drain data in loopback loop
        while (true) {
            try {
                testDevice.transferIn(LOOPBACK_EP_IN, 200);
            } catch (UsbTimeoutException e) {
                break;
            }
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS)
    void interruptTransferIn_timesOut() {
        Assumptions.assumeTrue(isLoopbackDevice(),
                "Interrupt transfer only supported by loopback test device");

        assertThrows(UsbTimeoutException.class, () -> testDevice.transferIn(ECHO_EP_IN, 200));
    }

    @Test
    void interruptTransfer_doesNotTimeOut() {
        Assumptions.assumeTrue(isLoopbackDevice(),
                "Interrupt transfer only supported by loopback test device");

        var sampleData = generateRandomBytes(12, 293872394);
        testDevice.transferOut(ECHO_EP_OUT, sampleData, 200);

        // receive first echo
        var echo = testDevice.transferIn(ECHO_EP_IN, 200);
        assertArrayEquals(sampleData, echo);

        // receive second echo
        echo = testDevice.transferIn(ECHO_EP_IN, 200);
        assertArrayEquals(sampleData, echo);
    }
}
