// Generated by jextract

package net.codecrete.usb.linux.gen.udev;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;
class constants$1 {

    static final FunctionDescriptor udev_device_get_sysattr_value$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle udev_device_get_sysattr_value$MH = RuntimeHelper.downcallHandle(
        "udev_device_get_sysattr_value",
        constants$1.udev_device_get_sysattr_value$FUNC
    );
    static final FunctionDescriptor udev_enumerate_unref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle udev_enumerate_unref$MH = RuntimeHelper.downcallHandle(
        "udev_enumerate_unref",
        constants$1.udev_enumerate_unref$FUNC
    );
    static final FunctionDescriptor udev_enumerate_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle udev_enumerate_new$MH = RuntimeHelper.downcallHandle(
        "udev_enumerate_new",
        constants$1.udev_enumerate_new$FUNC
    );
    static final FunctionDescriptor udev_enumerate_add_match_subsystem$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle udev_enumerate_add_match_subsystem$MH = RuntimeHelper.downcallHandle(
        "udev_enumerate_add_match_subsystem",
        constants$1.udev_enumerate_add_match_subsystem$FUNC
    );
    static final FunctionDescriptor udev_enumerate_scan_devices$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle udev_enumerate_scan_devices$MH = RuntimeHelper.downcallHandle(
        "udev_enumerate_scan_devices",
        constants$1.udev_enumerate_scan_devices$FUNC
    );
    static final FunctionDescriptor udev_enumerate_get_list_entry$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle udev_enumerate_get_list_entry$MH = RuntimeHelper.downcallHandle(
        "udev_enumerate_get_list_entry",
        constants$1.udev_enumerate_get_list_entry$FUNC
    );
}


