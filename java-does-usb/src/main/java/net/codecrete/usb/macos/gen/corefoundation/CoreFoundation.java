// Generated by jextract

package net.codecrete.usb.macos.gen.corefoundation;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.stream.Collectors;

import static java.lang.foreign.ValueLayout.JAVA_BYTE;

public class CoreFoundation {

    CoreFoundation() {
        // Should not be called directly
    }

    static final Arena LIBRARY_ARENA = Arena.ofAuto();
    static final boolean TRACE_DOWNCALLS = Boolean.getBoolean("jextract.trace.downcalls");

    static void traceDowncall(String name, Object... args) {
         String traceArgs = Arrays.stream(args)
                       .map(Object::toString)
                       .collect(Collectors.joining(", "));
         System.out.printf("%s(%s)\n", name, traceArgs);
    }

    static MemorySegment findOrThrow(String symbol) {
        return SYMBOL_LOOKUP.find(symbol)
            .orElseThrow(() -> new UnsatisfiedLinkError("unresolved symbol: " + symbol));
    }

    static MethodHandle upcallHandle(Class<?> fi, String name, FunctionDescriptor fdesc) {
        try {
            return MethodHandles.lookup().findVirtual(fi, name, fdesc.toMethodType());
        } catch (ReflectiveOperationException ex) {
            throw new AssertionError(ex);
        }
    }

    static MemoryLayout align(MemoryLayout layout, long align) {
        return switch (layout) {
            case PaddingLayout p -> p;
            case ValueLayout v -> v.withByteAlignment(align);
            case GroupLayout g -> {
                MemoryLayout[] alignedMembers = g.memberLayouts().stream()
                        .map(m -> align(m, align)).toArray(MemoryLayout[]::new);
                yield g instanceof StructLayout ?
                        MemoryLayout.structLayout(alignedMembers) : MemoryLayout.unionLayout(alignedMembers);
            }
            case SequenceLayout s -> MemoryLayout.sequenceLayout(s.elementCount(), align(s.elementLayout(), align));
        };
    }

    // Manually fix. Otherwise, system library will not be found
    // static final SymbolLookup SYMBOL_LOOKUP = SymbolLookup.libraryLookup(System.mapLibraryName("CoreFoundation.framework"), LIBRARY_ARENA)
    static final SymbolLookup SYMBOL_LOOKUP = SymbolLookup.libraryLookup("/System/Library/Frameworks/CoreFoundation.framework/CoreFoundation", LIBRARY_ARENA)
            .or(SymbolLookup.loaderLookup())
            .or(Linker.nativeLinker().defaultLookup());

    public static final ValueLayout.OfBoolean C_BOOL = ValueLayout.JAVA_BOOLEAN;
    public static final ValueLayout.OfByte C_CHAR = ValueLayout.JAVA_BYTE;
    public static final ValueLayout.OfShort C_SHORT = ValueLayout.JAVA_SHORT;
    public static final ValueLayout.OfInt C_INT = ValueLayout.JAVA_INT;
    public static final ValueLayout.OfLong C_LONG_LONG = ValueLayout.JAVA_LONG;
    public static final ValueLayout.OfFloat C_FLOAT = ValueLayout.JAVA_FLOAT;
    public static final ValueLayout.OfDouble C_DOUBLE = ValueLayout.JAVA_DOUBLE;
    public static final AddressLayout C_POINTER = ValueLayout.ADDRESS
            .withTargetLayout(MemoryLayout.sequenceLayout(java.lang.Long.MAX_VALUE, JAVA_BYTE));
    public static final ValueLayout.OfLong C_LONG = ValueLayout.JAVA_LONG;

    private static class CFGetTypeID {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            CoreFoundation.C_LONG,
            CoreFoundation.C_POINTER
        );

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(
                    CoreFoundation.findOrThrow("CFGetTypeID"),
                    DESC);
    }

    /**
     * Function descriptor for:
     * {@snippet lang=c :
     * extern CFTypeID CFGetTypeID(CFTypeRef cf)
     * }
     */
    public static FunctionDescriptor CFGetTypeID$descriptor() {
        return CFGetTypeID.DESC;
    }

    /**
     * Downcall method handle for:
     * {@snippet lang=c :
     * extern CFTypeID CFGetTypeID(CFTypeRef cf)
     * }
     */
    public static MethodHandle CFGetTypeID$handle() {
        return CFGetTypeID.HANDLE;
    }
    /**
     * {@snippet lang=c :
     * extern CFTypeID CFGetTypeID(CFTypeRef cf)
     * }
     */
    public static long CFGetTypeID(MemorySegment cf) {
        var mh$ = CFGetTypeID.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("CFGetTypeID", cf);
            }
            return (long)mh$.invokeExact(cf);
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class CFRelease {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
            CoreFoundation.C_POINTER
        );

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(
                    CoreFoundation.findOrThrow("CFRelease"),
                    DESC);
    }

    /**
     * Function descriptor for:
     * {@snippet lang=c :
     * extern void CFRelease(CFTypeRef cf)
     * }
     */
    public static FunctionDescriptor CFRelease$descriptor() {
        return CFRelease.DESC;
    }

    /**
     * Downcall method handle for:
     * {@snippet lang=c :
     * extern void CFRelease(CFTypeRef cf)
     * }
     */
    public static MethodHandle CFRelease$handle() {
        return CFRelease.HANDLE;
    }
    /**
     * {@snippet lang=c :
     * extern void CFRelease(CFTypeRef cf)
     * }
     */
    public static void CFRelease(MemorySegment cf) {
        var mh$ = CFRelease.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("CFRelease", cf);
            }
            mh$.invokeExact(cf);
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class CFStringGetTypeID {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            CoreFoundation.C_LONG    );

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(
                    CoreFoundation.findOrThrow("CFStringGetTypeID"),
                    DESC);
    }

    /**
     * Function descriptor for:
     * {@snippet lang=c :
     * extern CFTypeID CFStringGetTypeID(void)
     * }
     */
    public static FunctionDescriptor CFStringGetTypeID$descriptor() {
        return CFStringGetTypeID.DESC;
    }

    /**
     * Downcall method handle for:
     * {@snippet lang=c :
     * extern CFTypeID CFStringGetTypeID(void)
     * }
     */
    public static MethodHandle CFStringGetTypeID$handle() {
        return CFStringGetTypeID.HANDLE;
    }
    /**
     * {@snippet lang=c :
     * extern CFTypeID CFStringGetTypeID(void)
     * }
     */
    public static long CFStringGetTypeID() {
        var mh$ = CFStringGetTypeID.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("CFStringGetTypeID");
            }
            return (long)mh$.invokeExact();
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class CFStringCreateWithCharacters {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            CoreFoundation.C_POINTER,
            CoreFoundation.C_POINTER,
            CoreFoundation.C_POINTER,
            CoreFoundation.C_LONG
        );

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(
                    CoreFoundation.findOrThrow("CFStringCreateWithCharacters"),
                    DESC);
    }

    /**
     * Function descriptor for:
     * {@snippet lang=c :
     * extern CFStringRef CFStringCreateWithCharacters(CFAllocatorRef alloc, const UniChar *chars, CFIndex numChars)
     * }
     */
    public static FunctionDescriptor CFStringCreateWithCharacters$descriptor() {
        return CFStringCreateWithCharacters.DESC;
    }

    /**
     * Downcall method handle for:
     * {@snippet lang=c :
     * extern CFStringRef CFStringCreateWithCharacters(CFAllocatorRef alloc, const UniChar *chars, CFIndex numChars)
     * }
     */
    public static MethodHandle CFStringCreateWithCharacters$handle() {
        return CFStringCreateWithCharacters.HANDLE;
    }
    /**
     * {@snippet lang=c :
     * extern CFStringRef CFStringCreateWithCharacters(CFAllocatorRef alloc, const UniChar *chars, CFIndex numChars)
     * }
     */
    public static MemorySegment CFStringCreateWithCharacters(MemorySegment alloc, MemorySegment chars, long numChars) {
        var mh$ = CFStringCreateWithCharacters.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("CFStringCreateWithCharacters", alloc, chars, numChars);
            }
            return (MemorySegment)mh$.invokeExact(alloc, chars, numChars);
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class CFStringGetLength {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            CoreFoundation.C_LONG,
            CoreFoundation.C_POINTER
        );

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(
                    CoreFoundation.findOrThrow("CFStringGetLength"),
                    DESC);
    }

    /**
     * Function descriptor for:
     * {@snippet lang=c :
     * extern CFIndex CFStringGetLength(CFStringRef theString)
     * }
     */
    public static FunctionDescriptor CFStringGetLength$descriptor() {
        return CFStringGetLength.DESC;
    }

    /**
     * Downcall method handle for:
     * {@snippet lang=c :
     * extern CFIndex CFStringGetLength(CFStringRef theString)
     * }
     */
    public static MethodHandle CFStringGetLength$handle() {
        return CFStringGetLength.HANDLE;
    }
    /**
     * {@snippet lang=c :
     * extern CFIndex CFStringGetLength(CFStringRef theString)
     * }
     */
    public static long CFStringGetLength(MemorySegment theString) {
        var mh$ = CFStringGetLength.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("CFStringGetLength", theString);
            }
            return (long)mh$.invokeExact(theString);
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class CFStringGetCharacters {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
            CoreFoundation.C_POINTER,
            CFRange.layout(),
            CoreFoundation.C_POINTER
        );

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(
                    CoreFoundation.findOrThrow("CFStringGetCharacters"),
                    DESC);
    }

    /**
     * Function descriptor for:
     * {@snippet lang=c :
     * extern void CFStringGetCharacters(CFStringRef theString, CFRange range, UniChar *buffer)
     * }
     */
    public static FunctionDescriptor CFStringGetCharacters$descriptor() {
        return CFStringGetCharacters.DESC;
    }

    /**
     * Downcall method handle for:
     * {@snippet lang=c :
     * extern void CFStringGetCharacters(CFStringRef theString, CFRange range, UniChar *buffer)
     * }
     */
    public static MethodHandle CFStringGetCharacters$handle() {
        return CFStringGetCharacters.HANDLE;
    }
    /**
     * {@snippet lang=c :
     * extern void CFStringGetCharacters(CFStringRef theString, CFRange range, UniChar *buffer)
     * }
     */
    public static void CFStringGetCharacters(MemorySegment theString, MemorySegment range, MemorySegment buffer) {
        var mh$ = CFStringGetCharacters.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("CFStringGetCharacters", theString, range, buffer);
            }
            mh$.invokeExact(theString, range, buffer);
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }
    private static final int kCFNumberSInt32Type = (int)3L;
    /**
     * {@snippet lang=c :
     * enum enum (unnamed at /Applications/Xcode.app/Contents/Developer/Platforms/MacOSX.platform/Developer/SDKs/MacOSX.sdk/System/Library/Frameworks/CoreFoundation.framework/Headers/CFNumber.h:31:9).kCFNumberSInt32Type = 3
     * }
     */
    public static int kCFNumberSInt32Type() {
        return kCFNumberSInt32Type;
    }

    private static class CFNumberGetTypeID {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            CoreFoundation.C_LONG    );

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(
                    CoreFoundation.findOrThrow("CFNumberGetTypeID"),
                    DESC);
    }

    /**
     * Function descriptor for:
     * {@snippet lang=c :
     * extern CFTypeID CFNumberGetTypeID(void)
     * }
     */
    public static FunctionDescriptor CFNumberGetTypeID$descriptor() {
        return CFNumberGetTypeID.DESC;
    }

    /**
     * Downcall method handle for:
     * {@snippet lang=c :
     * extern CFTypeID CFNumberGetTypeID(void)
     * }
     */
    public static MethodHandle CFNumberGetTypeID$handle() {
        return CFNumberGetTypeID.HANDLE;
    }
    /**
     * {@snippet lang=c :
     * extern CFTypeID CFNumberGetTypeID(void)
     * }
     */
    public static long CFNumberGetTypeID() {
        var mh$ = CFNumberGetTypeID.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("CFNumberGetTypeID");
            }
            return (long)mh$.invokeExact();
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class CFNumberGetValue {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            CoreFoundation.C_CHAR,
            CoreFoundation.C_POINTER,
            CoreFoundation.C_LONG,
            CoreFoundation.C_POINTER
        );

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(
                    CoreFoundation.findOrThrow("CFNumberGetValue"),
                    DESC);
    }

    /**
     * Function descriptor for:
     * {@snippet lang=c :
     * extern Boolean CFNumberGetValue(CFNumberRef number, CFNumberType theType, void *valuePtr)
     * }
     */
    public static FunctionDescriptor CFNumberGetValue$descriptor() {
        return CFNumberGetValue.DESC;
    }

    /**
     * Downcall method handle for:
     * {@snippet lang=c :
     * extern Boolean CFNumberGetValue(CFNumberRef number, CFNumberType theType, void *valuePtr)
     * }
     */
    public static MethodHandle CFNumberGetValue$handle() {
        return CFNumberGetValue.HANDLE;
    }
    /**
     * {@snippet lang=c :
     * extern Boolean CFNumberGetValue(CFNumberRef number, CFNumberType theType, void *valuePtr)
     * }
     */
    public static byte CFNumberGetValue(MemorySegment number, long theType, MemorySegment valuePtr) {
        var mh$ = CFNumberGetValue.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("CFNumberGetValue", number, theType, valuePtr);
            }
            return (byte)mh$.invokeExact(number, theType, valuePtr);
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class CFRunLoopGetCurrent {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            CoreFoundation.C_POINTER    );

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(
                    CoreFoundation.findOrThrow("CFRunLoopGetCurrent"),
                    DESC);
    }

    /**
     * Function descriptor for:
     * {@snippet lang=c :
     * extern CFRunLoopRef CFRunLoopGetCurrent(void)
     * }
     */
    public static FunctionDescriptor CFRunLoopGetCurrent$descriptor() {
        return CFRunLoopGetCurrent.DESC;
    }

    /**
     * Downcall method handle for:
     * {@snippet lang=c :
     * extern CFRunLoopRef CFRunLoopGetCurrent(void)
     * }
     */
    public static MethodHandle CFRunLoopGetCurrent$handle() {
        return CFRunLoopGetCurrent.HANDLE;
    }
    /**
     * {@snippet lang=c :
     * extern CFRunLoopRef CFRunLoopGetCurrent(void)
     * }
     */
    public static MemorySegment CFRunLoopGetCurrent() {
        var mh$ = CFRunLoopGetCurrent.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("CFRunLoopGetCurrent");
            }
            return (MemorySegment)mh$.invokeExact();
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class CFRunLoopRun {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid(    );

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(
                    CoreFoundation.findOrThrow("CFRunLoopRun"),
                    DESC);
    }

    /**
     * Function descriptor for:
     * {@snippet lang=c :
     * extern void CFRunLoopRun(void)
     * }
     */
    public static FunctionDescriptor CFRunLoopRun$descriptor() {
        return CFRunLoopRun.DESC;
    }

    /**
     * Downcall method handle for:
     * {@snippet lang=c :
     * extern void CFRunLoopRun(void)
     * }
     */
    public static MethodHandle CFRunLoopRun$handle() {
        return CFRunLoopRun.HANDLE;
    }
    /**
     * {@snippet lang=c :
     * extern void CFRunLoopRun(void)
     * }
     */
    public static void CFRunLoopRun() {
        var mh$ = CFRunLoopRun.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("CFRunLoopRun");
            }
            mh$.invokeExact();
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class CFRunLoopAddSource {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
            CoreFoundation.C_POINTER,
            CoreFoundation.C_POINTER,
            CoreFoundation.C_POINTER
        );

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(
                    CoreFoundation.findOrThrow("CFRunLoopAddSource"),
                    DESC);
    }

    /**
     * Function descriptor for:
     * {@snippet lang=c :
     * extern void CFRunLoopAddSource(CFRunLoopRef rl, CFRunLoopSourceRef source, CFRunLoopMode mode)
     * }
     */
    public static FunctionDescriptor CFRunLoopAddSource$descriptor() {
        return CFRunLoopAddSource.DESC;
    }

    /**
     * Downcall method handle for:
     * {@snippet lang=c :
     * extern void CFRunLoopAddSource(CFRunLoopRef rl, CFRunLoopSourceRef source, CFRunLoopMode mode)
     * }
     */
    public static MethodHandle CFRunLoopAddSource$handle() {
        return CFRunLoopAddSource.HANDLE;
    }
    /**
     * {@snippet lang=c :
     * extern void CFRunLoopAddSource(CFRunLoopRef rl, CFRunLoopSourceRef source, CFRunLoopMode mode)
     * }
     */
    public static void CFRunLoopAddSource(MemorySegment rl, MemorySegment source, MemorySegment mode) {
        var mh$ = CFRunLoopAddSource.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("CFRunLoopAddSource", rl, source, mode);
            }
            mh$.invokeExact(rl, source, mode);
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class CFRunLoopRemoveSource {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
            CoreFoundation.C_POINTER,
            CoreFoundation.C_POINTER,
            CoreFoundation.C_POINTER
        );

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(
                    CoreFoundation.findOrThrow("CFRunLoopRemoveSource"),
                    DESC);
    }

    /**
     * Function descriptor for:
     * {@snippet lang=c :
     * extern void CFRunLoopRemoveSource(CFRunLoopRef rl, CFRunLoopSourceRef source, CFRunLoopMode mode)
     * }
     */
    public static FunctionDescriptor CFRunLoopRemoveSource$descriptor() {
        return CFRunLoopRemoveSource.DESC;
    }

    /**
     * Downcall method handle for:
     * {@snippet lang=c :
     * extern void CFRunLoopRemoveSource(CFRunLoopRef rl, CFRunLoopSourceRef source, CFRunLoopMode mode)
     * }
     */
    public static MethodHandle CFRunLoopRemoveSource$handle() {
        return CFRunLoopRemoveSource.HANDLE;
    }
    /**
     * {@snippet lang=c :
     * extern void CFRunLoopRemoveSource(CFRunLoopRef rl, CFRunLoopSourceRef source, CFRunLoopMode mode)
     * }
     */
    public static void CFRunLoopRemoveSource(MemorySegment rl, MemorySegment source, MemorySegment mode) {
        var mh$ = CFRunLoopRemoveSource.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("CFRunLoopRemoveSource", rl, source, mode);
            }
            mh$.invokeExact(rl, source, mode);
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class CFUUIDGetUUIDBytes {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            CFUUIDBytes.layout(),
            CoreFoundation.C_POINTER
        );

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(
                    CoreFoundation.findOrThrow("CFUUIDGetUUIDBytes"),
                    DESC);
    }

    /**
     * Function descriptor for:
     * {@snippet lang=c :
     * extern CFUUIDBytes CFUUIDGetUUIDBytes(CFUUIDRef uuid)
     * }
     */
    public static FunctionDescriptor CFUUIDGetUUIDBytes$descriptor() {
        return CFUUIDGetUUIDBytes.DESC;
    }

    /**
     * Downcall method handle for:
     * {@snippet lang=c :
     * extern CFUUIDBytes CFUUIDGetUUIDBytes(CFUUIDRef uuid)
     * }
     */
    public static MethodHandle CFUUIDGetUUIDBytes$handle() {
        return CFUUIDGetUUIDBytes.HANDLE;
    }
    /**
     * {@snippet lang=c :
     * extern CFUUIDBytes CFUUIDGetUUIDBytes(CFUUIDRef uuid)
     * }
     */
    public static MemorySegment CFUUIDGetUUIDBytes(SegmentAllocator allocator, MemorySegment uuid) {
        var mh$ = CFUUIDGetUUIDBytes.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("CFUUIDGetUUIDBytes", allocator, uuid);
            }
            return (MemorySegment)mh$.invokeExact(allocator, uuid);
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class CFUUIDCreateFromUUIDBytes {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            CoreFoundation.C_POINTER,
            CoreFoundation.C_POINTER,
            CFUUIDBytes.layout()
        );

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(
                    CoreFoundation.findOrThrow("CFUUIDCreateFromUUIDBytes"),
                    DESC);
    }

    /**
     * Function descriptor for:
     * {@snippet lang=c :
     * extern CFUUIDRef CFUUIDCreateFromUUIDBytes(CFAllocatorRef alloc, CFUUIDBytes bytes)
     * }
     */
    public static FunctionDescriptor CFUUIDCreateFromUUIDBytes$descriptor() {
        return CFUUIDCreateFromUUIDBytes.DESC;
    }

    /**
     * Downcall method handle for:
     * {@snippet lang=c :
     * extern CFUUIDRef CFUUIDCreateFromUUIDBytes(CFAllocatorRef alloc, CFUUIDBytes bytes)
     * }
     */
    public static MethodHandle CFUUIDCreateFromUUIDBytes$handle() {
        return CFUUIDCreateFromUUIDBytes.HANDLE;
    }
    /**
     * {@snippet lang=c :
     * extern CFUUIDRef CFUUIDCreateFromUUIDBytes(CFAllocatorRef alloc, CFUUIDBytes bytes)
     * }
     */
    public static MemorySegment CFUUIDCreateFromUUIDBytes(MemorySegment alloc, MemorySegment bytes) {
        var mh$ = CFUUIDCreateFromUUIDBytes.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("CFUUIDCreateFromUUIDBytes", alloc, bytes);
            }
            return (MemorySegment)mh$.invokeExact(alloc, bytes);
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }
}

