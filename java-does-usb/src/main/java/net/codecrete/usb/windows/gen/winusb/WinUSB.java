// Generated by jextract

package net.codecrete.usb.windows.gen.winusb;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
public class WinUSB  {

    public static final OfByte C_CHAR = Constants$root.C_CHAR$LAYOUT;
    public static final OfShort C_SHORT = Constants$root.C_SHORT$LAYOUT;
    public static final OfInt C_INT = Constants$root.C_LONG$LAYOUT;
    public static final OfInt C_LONG = Constants$root.C_LONG$LAYOUT;
    public static final OfLong C_LONG_LONG = Constants$root.C_LONG_LONG$LAYOUT;
    public static final OfFloat C_FLOAT = Constants$root.C_FLOAT$LAYOUT;
    public static final OfDouble C_DOUBLE = Constants$root.C_DOUBLE$LAYOUT;
    public static final OfAddress C_POINTER = Constants$root.C_POINTER$LAYOUT;
    /**
     * {@snippet :
     * #define PIPE_TRANSFER_TIMEOUT 3
     * }
     */
    public static int PIPE_TRANSFER_TIMEOUT() {
        return (int)3L;
    }
    /**
     * {@snippet :
     * #define RAW_IO 7
     * }
     */
    public static int RAW_IO() {
        return (int)7L;
    }
    public static MethodHandle WinUsb_Free$MH() {
        return RuntimeHelper.requireNonNull(constants$0.WinUsb_Free$MH,"WinUsb_Free");
    }
    /**
     * {@snippet :
     * BOOL WinUsb_Free(WINUSB_INTERFACE_HANDLE InterfaceHandle);
     * }
     */
    public static int WinUsb_Free(MemorySegment InterfaceHandle) {
        var mh$ = WinUsb_Free$MH();
        try {
            return (int)mh$.invokeExact(InterfaceHandle);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}


