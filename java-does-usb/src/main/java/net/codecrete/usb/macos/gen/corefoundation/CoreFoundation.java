// Generated by jextract

package net.codecrete.usb.macos.gen.corefoundation;

import java.lang.foreign.Addressable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
public class CoreFoundation  {

    /* package-private */ CoreFoundation() {}
    public static OfByte C_CHAR = Constants$root.C_CHAR$LAYOUT;
    public static OfShort C_SHORT = Constants$root.C_SHORT$LAYOUT;
    public static OfInt C_INT = Constants$root.C_INT$LAYOUT;
    public static OfLong C_LONG = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong C_LONG_LONG = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfFloat C_FLOAT = Constants$root.C_FLOAT$LAYOUT;
    public static OfDouble C_DOUBLE = Constants$root.C_DOUBLE$LAYOUT;
    public static OfAddress C_POINTER = Constants$root.C_POINTER$LAYOUT;
    public static MethodHandle CFGetTypeID$MH() {
        return RuntimeHelper.requireNonNull(constants$0.CFGetTypeID$MH,"CFGetTypeID");
    }
    public static long CFGetTypeID ( Addressable cf) {
        var mh$ = CFGetTypeID$MH();
        try {
            return (long)mh$.invokeExact(cf);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle CFRelease$MH() {
        return RuntimeHelper.requireNonNull(constants$0.CFRelease$MH,"CFRelease");
    }
    public static void CFRelease ( Addressable cf) {
        var mh$ = CFRelease$MH();
        try {
            mh$.invokeExact(cf);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle CFStringGetTypeID$MH() {
        return RuntimeHelper.requireNonNull(constants$0.CFStringGetTypeID$MH,"CFStringGetTypeID");
    }
    public static long CFStringGetTypeID () {
        var mh$ = CFStringGetTypeID$MH();
        try {
            return (long)mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle CFStringCreateWithCharacters$MH() {
        return RuntimeHelper.requireNonNull(constants$0.CFStringCreateWithCharacters$MH,"CFStringCreateWithCharacters");
    }
    public static MemoryAddress CFStringCreateWithCharacters ( Addressable alloc,  Addressable chars,  long numChars) {
        var mh$ = CFStringCreateWithCharacters$MH();
        try {
            return (java.lang.foreign.MemoryAddress)mh$.invokeExact(alloc, chars, numChars);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle CFStringGetLength$MH() {
        return RuntimeHelper.requireNonNull(constants$0.CFStringGetLength$MH,"CFStringGetLength");
    }
    public static long CFStringGetLength ( Addressable theString) {
        var mh$ = CFStringGetLength$MH();
        try {
            return (long)mh$.invokeExact(theString);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle CFStringGetCharacters$MH() {
        return RuntimeHelper.requireNonNull(constants$0.CFStringGetCharacters$MH,"CFStringGetCharacters");
    }
    public static void CFStringGetCharacters ( Addressable theString,  MemorySegment range,  Addressable buffer) {
        var mh$ = CFStringGetCharacters$MH();
        try {
            mh$.invokeExact(theString, range, buffer);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static int kCFNumberSInt32Type() {
        return (int)3L;
    }
    public static MethodHandle CFNumberGetTypeID$MH() {
        return RuntimeHelper.requireNonNull(constants$1.CFNumberGetTypeID$MH,"CFNumberGetTypeID");
    }
    public static long CFNumberGetTypeID () {
        var mh$ = CFNumberGetTypeID$MH();
        try {
            return (long)mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle CFNumberGetValue$MH() {
        return RuntimeHelper.requireNonNull(constants$1.CFNumberGetValue$MH,"CFNumberGetValue");
    }
    public static byte CFNumberGetValue ( Addressable number,  long theType,  Addressable valuePtr) {
        var mh$ = CFNumberGetValue$MH();
        try {
            return (byte)mh$.invokeExact(number, theType, valuePtr);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle CFRunLoopGetCurrent$MH() {
        return RuntimeHelper.requireNonNull(constants$1.CFRunLoopGetCurrent$MH,"CFRunLoopGetCurrent");
    }
    public static MemoryAddress CFRunLoopGetCurrent () {
        var mh$ = CFRunLoopGetCurrent$MH();
        try {
            return (java.lang.foreign.MemoryAddress)mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle CFRunLoopRun$MH() {
        return RuntimeHelper.requireNonNull(constants$1.CFRunLoopRun$MH,"CFRunLoopRun");
    }
    public static void CFRunLoopRun () {
        var mh$ = CFRunLoopRun$MH();
        try {
            mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle CFRunLoopAddSource$MH() {
        return RuntimeHelper.requireNonNull(constants$1.CFRunLoopAddSource$MH,"CFRunLoopAddSource");
    }
    public static void CFRunLoopAddSource ( Addressable rl,  Addressable source,  Addressable mode) {
        var mh$ = CFRunLoopAddSource$MH();
        try {
            mh$.invokeExact(rl, source, mode);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle CFUUIDCreateFromUUIDBytes$MH() {
        return RuntimeHelper.requireNonNull(constants$1.CFUUIDCreateFromUUIDBytes$MH,"CFUUIDCreateFromUUIDBytes");
    }
    public static MemoryAddress CFUUIDCreateFromUUIDBytes ( Addressable alloc,  MemorySegment bytes) {
        var mh$ = CFUUIDCreateFromUUIDBytes$MH();
        try {
            return (java.lang.foreign.MemoryAddress)mh$.invokeExact(alloc, bytes);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}


