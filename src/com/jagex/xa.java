package com.jagex;

public class xa implements Interface20, Interface3 {
    protected long nativeid = 0L;

    xa(int i, int i_1_) {
        r(i, i_1_);
    }

    protected final void finalize() {
        if (nativeid != 0L) {
            Class164.method1739(0, this);
        }
    }

    private native void r(int i, int i_0_);

    private native void va(long l, boolean bool);

    public final void w(boolean bool) {
        va(nativeid, bool);
    }
}
