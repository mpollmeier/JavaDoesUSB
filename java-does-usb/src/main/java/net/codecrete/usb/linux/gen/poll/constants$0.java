// Generated by jextract

package net.codecrete.usb.linux.gen.poll;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.*;
final class constants$0 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$0() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("fd"),
        JAVA_SHORT.withName("events"),
        JAVA_SHORT.withName("revents")
    ).withName("pollfd");
    static final VarHandle const$1 = constants$0.const$0.varHandle(MemoryLayout.PathElement.groupElement("fd"));
    static final VarHandle const$2 = constants$0.const$0.varHandle(MemoryLayout.PathElement.groupElement("events"));
    static final VarHandle const$3 = constants$0.const$0.varHandle(MemoryLayout.PathElement.groupElement("revents"));
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_INT
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "poll",
        constants$0.const$4
    );
}


