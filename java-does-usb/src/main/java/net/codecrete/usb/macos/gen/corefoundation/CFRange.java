// Generated by jextract

package net.codecrete.usb.macos.gen.corefoundation;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;
public class CFRange {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("location"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("length")
    );
    public static MemoryLayout $LAYOUT() {
        return CFRange.$struct$LAYOUT;
    }
    static final VarHandle location$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("location"));
    public static VarHandle location$VH() {
        return CFRange.location$VH;
    }
    public static long location$get(MemorySegment seg) {
        return (long)CFRange.location$VH.get(seg);
    }
    public static void location$set( MemorySegment seg, long x) {
        CFRange.location$VH.set(seg, x);
    }
    public static long location$get(MemorySegment seg, long index) {
        return (long)CFRange.location$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void location$set(MemorySegment seg, long index, long x) {
        CFRange.location$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("length"));
    public static VarHandle length$VH() {
        return CFRange.length$VH;
    }
    public static long length$get(MemorySegment seg) {
        return (long)CFRange.length$VH.get(seg);
    }
    public static void length$set( MemorySegment seg, long x) {
        CFRange.length$VH.set(seg, x);
    }
    public static long length$get(MemorySegment seg, long index) {
        return (long)CFRange.length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void length$set(MemorySegment seg, long index, long x) {
        CFRange.length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


