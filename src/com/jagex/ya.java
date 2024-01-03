package com.jagex;

public class ya extends za implements Interface3 {
    protected long nativeid;

    ya(oa var_oa, int i) {
        aa(var_oa, i);
    }

    final native void ga();

    protected final void finalize() {
        if (nativeid != 0L) {
            Class164.method1739(0, this);
        }
    }

    private native void aa(oa var_oa, int i);

    final native void r();

    public final native void w(boolean bool);
}
