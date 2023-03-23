// Generated by jextract

package net.codecrete.usb.linux.gen.usbdevice_fs;

import static java.lang.foreign.ValueLayout.*;
public class usbdevice_fs  {

    public static final OfByte C_CHAR = Constants$root.C_CHAR$LAYOUT;
    public static final OfShort C_SHORT = Constants$root.C_SHORT$LAYOUT;
    public static final OfInt C_INT = Constants$root.C_INT$LAYOUT;
    public static final OfLong C_LONG = Constants$root.C_LONG_LONG$LAYOUT;
    public static final OfLong C_LONG_LONG = Constants$root.C_LONG_LONG$LAYOUT;
    public static final OfFloat C_FLOAT = Constants$root.C_FLOAT$LAYOUT;
    public static final OfDouble C_DOUBLE = Constants$root.C_DOUBLE$LAYOUT;
    public static final OfAddress C_POINTER = Constants$root.C_POINTER$LAYOUT;
    /**
     * {@snippet :
     * #define USBDEVFS_URB_TYPE_ISO 0
     * }
     */
    public static int USBDEVFS_URB_TYPE_ISO() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * #define USBDEVFS_URB_TYPE_INTERRUPT 1
     * }
     */
    public static int USBDEVFS_URB_TYPE_INTERRUPT() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define USBDEVFS_URB_TYPE_CONTROL 2
     * }
     */
    public static int USBDEVFS_URB_TYPE_CONTROL() {
        return (int)2L;
    }
    /**
     * {@snippet :
     * #define USBDEVFS_URB_TYPE_BULK 3
     * }
     */
    public static int USBDEVFS_URB_TYPE_BULK() {
        return (int)3L;
    }
}


