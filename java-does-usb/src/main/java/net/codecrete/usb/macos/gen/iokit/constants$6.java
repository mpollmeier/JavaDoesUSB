// Generated by jextract

package net.codecrete.usb.macos.gen.iokit;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$6 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$6() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(IOUSBDeviceStruct187.AddRef.class, "apply", constants$5.const$5);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        constants$5.const$5
    );
    static final VarHandle const$2 = constants$4.const$5.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(IOUSBDeviceStruct187.Release.class, "apply", constants$5.const$5);
    static final VarHandle const$4 = constants$4.const$5.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
}


