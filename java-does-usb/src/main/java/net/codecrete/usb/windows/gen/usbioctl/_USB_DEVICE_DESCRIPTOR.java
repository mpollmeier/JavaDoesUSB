// Generated by jextract

package net.codecrete.usb.windows.gen.usbioctl;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct _USB_DEVICE_DESCRIPTOR {
 *     UCHAR bLength;
 *     UCHAR bDescriptorType;
 *     USHORT bcdUSB;
 *     UCHAR bDeviceClass;
 *     UCHAR bDeviceSubClass;
 *     UCHAR bDeviceProtocol;
 *     UCHAR bMaxPacketSize0;
 *     USHORT idVendor;
 *     USHORT idProduct;
 *     USHORT bcdDevice;
 *     UCHAR iManufacturer;
 *     UCHAR iProduct;
 *     UCHAR iSerialNumber;
 *     UCHAR bNumConfigurations;
 * }
 * }
 */
public class _USB_DEVICE_DESCRIPTOR {

    _USB_DEVICE_DESCRIPTOR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        USBIoctl.C_CHAR.withName("bLength"),
        USBIoctl.C_CHAR.withName("bDescriptorType"),
        USBIoctl.align(USBIoctl.C_SHORT, 1).withName("bcdUSB"),
        USBIoctl.C_CHAR.withName("bDeviceClass"),
        USBIoctl.C_CHAR.withName("bDeviceSubClass"),
        USBIoctl.C_CHAR.withName("bDeviceProtocol"),
        USBIoctl.C_CHAR.withName("bMaxPacketSize0"),
        USBIoctl.align(USBIoctl.C_SHORT, 1).withName("idVendor"),
        USBIoctl.align(USBIoctl.C_SHORT, 1).withName("idProduct"),
        USBIoctl.align(USBIoctl.C_SHORT, 1).withName("bcdDevice"),
        USBIoctl.C_CHAR.withName("iManufacturer"),
        USBIoctl.C_CHAR.withName("iProduct"),
        USBIoctl.C_CHAR.withName("iSerialNumber"),
        USBIoctl.C_CHAR.withName("bNumConfigurations")
    ).withName("_USB_DEVICE_DESCRIPTOR");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfByte bLength$LAYOUT = (OfByte)$LAYOUT.select(groupElement("bLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UCHAR bLength
     * }
     */
    public static final OfByte bLength$layout() {
        return bLength$LAYOUT;
    }

    private static final long bLength$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UCHAR bLength
     * }
     */
    public static final long bLength$offset() {
        return bLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UCHAR bLength
     * }
     */
    public static byte bLength(MemorySegment struct) {
        return struct.get(bLength$LAYOUT, bLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UCHAR bLength
     * }
     */
    public static void bLength(MemorySegment struct, byte fieldValue) {
        struct.set(bLength$LAYOUT, bLength$OFFSET, fieldValue);
    }

    private static final OfByte bDescriptorType$LAYOUT = (OfByte)$LAYOUT.select(groupElement("bDescriptorType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UCHAR bDescriptorType
     * }
     */
    public static final OfByte bDescriptorType$layout() {
        return bDescriptorType$LAYOUT;
    }

    private static final long bDescriptorType$OFFSET = 1;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UCHAR bDescriptorType
     * }
     */
    public static final long bDescriptorType$offset() {
        return bDescriptorType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UCHAR bDescriptorType
     * }
     */
    public static byte bDescriptorType(MemorySegment struct) {
        return struct.get(bDescriptorType$LAYOUT, bDescriptorType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UCHAR bDescriptorType
     * }
     */
    public static void bDescriptorType(MemorySegment struct, byte fieldValue) {
        struct.set(bDescriptorType$LAYOUT, bDescriptorType$OFFSET, fieldValue);
    }

    private static final OfShort bcdUSB$LAYOUT = (OfShort)$LAYOUT.select(groupElement("bcdUSB"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * USHORT bcdUSB
     * }
     */
    public static final OfShort bcdUSB$layout() {
        return bcdUSB$LAYOUT;
    }

    private static final long bcdUSB$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * USHORT bcdUSB
     * }
     */
    public static final long bcdUSB$offset() {
        return bcdUSB$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * USHORT bcdUSB
     * }
     */
    public static short bcdUSB(MemorySegment struct) {
        return struct.get(bcdUSB$LAYOUT, bcdUSB$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * USHORT bcdUSB
     * }
     */
    public static void bcdUSB(MemorySegment struct, short fieldValue) {
        struct.set(bcdUSB$LAYOUT, bcdUSB$OFFSET, fieldValue);
    }

    private static final OfByte bDeviceClass$LAYOUT = (OfByte)$LAYOUT.select(groupElement("bDeviceClass"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UCHAR bDeviceClass
     * }
     */
    public static final OfByte bDeviceClass$layout() {
        return bDeviceClass$LAYOUT;
    }

    private static final long bDeviceClass$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UCHAR bDeviceClass
     * }
     */
    public static final long bDeviceClass$offset() {
        return bDeviceClass$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UCHAR bDeviceClass
     * }
     */
    public static byte bDeviceClass(MemorySegment struct) {
        return struct.get(bDeviceClass$LAYOUT, bDeviceClass$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UCHAR bDeviceClass
     * }
     */
    public static void bDeviceClass(MemorySegment struct, byte fieldValue) {
        struct.set(bDeviceClass$LAYOUT, bDeviceClass$OFFSET, fieldValue);
    }

    private static final OfByte bDeviceSubClass$LAYOUT = (OfByte)$LAYOUT.select(groupElement("bDeviceSubClass"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UCHAR bDeviceSubClass
     * }
     */
    public static final OfByte bDeviceSubClass$layout() {
        return bDeviceSubClass$LAYOUT;
    }

    private static final long bDeviceSubClass$OFFSET = 5;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UCHAR bDeviceSubClass
     * }
     */
    public static final long bDeviceSubClass$offset() {
        return bDeviceSubClass$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UCHAR bDeviceSubClass
     * }
     */
    public static byte bDeviceSubClass(MemorySegment struct) {
        return struct.get(bDeviceSubClass$LAYOUT, bDeviceSubClass$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UCHAR bDeviceSubClass
     * }
     */
    public static void bDeviceSubClass(MemorySegment struct, byte fieldValue) {
        struct.set(bDeviceSubClass$LAYOUT, bDeviceSubClass$OFFSET, fieldValue);
    }

    private static final OfByte bDeviceProtocol$LAYOUT = (OfByte)$LAYOUT.select(groupElement("bDeviceProtocol"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UCHAR bDeviceProtocol
     * }
     */
    public static final OfByte bDeviceProtocol$layout() {
        return bDeviceProtocol$LAYOUT;
    }

    private static final long bDeviceProtocol$OFFSET = 6;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UCHAR bDeviceProtocol
     * }
     */
    public static final long bDeviceProtocol$offset() {
        return bDeviceProtocol$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UCHAR bDeviceProtocol
     * }
     */
    public static byte bDeviceProtocol(MemorySegment struct) {
        return struct.get(bDeviceProtocol$LAYOUT, bDeviceProtocol$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UCHAR bDeviceProtocol
     * }
     */
    public static void bDeviceProtocol(MemorySegment struct, byte fieldValue) {
        struct.set(bDeviceProtocol$LAYOUT, bDeviceProtocol$OFFSET, fieldValue);
    }

    private static final OfByte bMaxPacketSize0$LAYOUT = (OfByte)$LAYOUT.select(groupElement("bMaxPacketSize0"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UCHAR bMaxPacketSize0
     * }
     */
    public static final OfByte bMaxPacketSize0$layout() {
        return bMaxPacketSize0$LAYOUT;
    }

    private static final long bMaxPacketSize0$OFFSET = 7;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UCHAR bMaxPacketSize0
     * }
     */
    public static final long bMaxPacketSize0$offset() {
        return bMaxPacketSize0$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UCHAR bMaxPacketSize0
     * }
     */
    public static byte bMaxPacketSize0(MemorySegment struct) {
        return struct.get(bMaxPacketSize0$LAYOUT, bMaxPacketSize0$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UCHAR bMaxPacketSize0
     * }
     */
    public static void bMaxPacketSize0(MemorySegment struct, byte fieldValue) {
        struct.set(bMaxPacketSize0$LAYOUT, bMaxPacketSize0$OFFSET, fieldValue);
    }

    private static final OfShort idVendor$LAYOUT = (OfShort)$LAYOUT.select(groupElement("idVendor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * USHORT idVendor
     * }
     */
    public static final OfShort idVendor$layout() {
        return idVendor$LAYOUT;
    }

    private static final long idVendor$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * USHORT idVendor
     * }
     */
    public static final long idVendor$offset() {
        return idVendor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * USHORT idVendor
     * }
     */
    public static short idVendor(MemorySegment struct) {
        return struct.get(idVendor$LAYOUT, idVendor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * USHORT idVendor
     * }
     */
    public static void idVendor(MemorySegment struct, short fieldValue) {
        struct.set(idVendor$LAYOUT, idVendor$OFFSET, fieldValue);
    }

    private static final OfShort idProduct$LAYOUT = (OfShort)$LAYOUT.select(groupElement("idProduct"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * USHORT idProduct
     * }
     */
    public static final OfShort idProduct$layout() {
        return idProduct$LAYOUT;
    }

    private static final long idProduct$OFFSET = 10;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * USHORT idProduct
     * }
     */
    public static final long idProduct$offset() {
        return idProduct$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * USHORT idProduct
     * }
     */
    public static short idProduct(MemorySegment struct) {
        return struct.get(idProduct$LAYOUT, idProduct$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * USHORT idProduct
     * }
     */
    public static void idProduct(MemorySegment struct, short fieldValue) {
        struct.set(idProduct$LAYOUT, idProduct$OFFSET, fieldValue);
    }

    private static final OfShort bcdDevice$LAYOUT = (OfShort)$LAYOUT.select(groupElement("bcdDevice"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * USHORT bcdDevice
     * }
     */
    public static final OfShort bcdDevice$layout() {
        return bcdDevice$LAYOUT;
    }

    private static final long bcdDevice$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * USHORT bcdDevice
     * }
     */
    public static final long bcdDevice$offset() {
        return bcdDevice$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * USHORT bcdDevice
     * }
     */
    public static short bcdDevice(MemorySegment struct) {
        return struct.get(bcdDevice$LAYOUT, bcdDevice$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * USHORT bcdDevice
     * }
     */
    public static void bcdDevice(MemorySegment struct, short fieldValue) {
        struct.set(bcdDevice$LAYOUT, bcdDevice$OFFSET, fieldValue);
    }

    private static final OfByte iManufacturer$LAYOUT = (OfByte)$LAYOUT.select(groupElement("iManufacturer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UCHAR iManufacturer
     * }
     */
    public static final OfByte iManufacturer$layout() {
        return iManufacturer$LAYOUT;
    }

    private static final long iManufacturer$OFFSET = 14;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UCHAR iManufacturer
     * }
     */
    public static final long iManufacturer$offset() {
        return iManufacturer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UCHAR iManufacturer
     * }
     */
    public static byte iManufacturer(MemorySegment struct) {
        return struct.get(iManufacturer$LAYOUT, iManufacturer$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UCHAR iManufacturer
     * }
     */
    public static void iManufacturer(MemorySegment struct, byte fieldValue) {
        struct.set(iManufacturer$LAYOUT, iManufacturer$OFFSET, fieldValue);
    }

    private static final OfByte iProduct$LAYOUT = (OfByte)$LAYOUT.select(groupElement("iProduct"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UCHAR iProduct
     * }
     */
    public static final OfByte iProduct$layout() {
        return iProduct$LAYOUT;
    }

    private static final long iProduct$OFFSET = 15;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UCHAR iProduct
     * }
     */
    public static final long iProduct$offset() {
        return iProduct$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UCHAR iProduct
     * }
     */
    public static byte iProduct(MemorySegment struct) {
        return struct.get(iProduct$LAYOUT, iProduct$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UCHAR iProduct
     * }
     */
    public static void iProduct(MemorySegment struct, byte fieldValue) {
        struct.set(iProduct$LAYOUT, iProduct$OFFSET, fieldValue);
    }

    private static final OfByte iSerialNumber$LAYOUT = (OfByte)$LAYOUT.select(groupElement("iSerialNumber"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UCHAR iSerialNumber
     * }
     */
    public static final OfByte iSerialNumber$layout() {
        return iSerialNumber$LAYOUT;
    }

    private static final long iSerialNumber$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UCHAR iSerialNumber
     * }
     */
    public static final long iSerialNumber$offset() {
        return iSerialNumber$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UCHAR iSerialNumber
     * }
     */
    public static byte iSerialNumber(MemorySegment struct) {
        return struct.get(iSerialNumber$LAYOUT, iSerialNumber$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UCHAR iSerialNumber
     * }
     */
    public static void iSerialNumber(MemorySegment struct, byte fieldValue) {
        struct.set(iSerialNumber$LAYOUT, iSerialNumber$OFFSET, fieldValue);
    }

    private static final OfByte bNumConfigurations$LAYOUT = (OfByte)$LAYOUT.select(groupElement("bNumConfigurations"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UCHAR bNumConfigurations
     * }
     */
    public static final OfByte bNumConfigurations$layout() {
        return bNumConfigurations$LAYOUT;
    }

    private static final long bNumConfigurations$OFFSET = 17;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UCHAR bNumConfigurations
     * }
     */
    public static final long bNumConfigurations$offset() {
        return bNumConfigurations$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UCHAR bNumConfigurations
     * }
     */
    public static byte bNumConfigurations(MemorySegment struct) {
        return struct.get(bNumConfigurations$LAYOUT, bNumConfigurations$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UCHAR bNumConfigurations
     * }
     */
    public static void bNumConfigurations(MemorySegment struct, byte fieldValue) {
        struct.set(bNumConfigurations$LAYOUT, bNumConfigurations$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

