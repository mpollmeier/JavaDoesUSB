// Generated by jextract

package net.codecrete.usb.linux.gen.unistd;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;
final class constants$0 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$0() {}
    static final FunctionDescriptor close$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle close$MH = RuntimeHelper.downcallHandle(
        "close",
        constants$0.close$FUNC
    );
}


