package com.jagex;

public class ba extends r implements Interface3 {
    protected long nativeid;

    ba(oa var_oa) {
        /* empty */
    }

    public final native void w(boolean bool);

    protected final void finalize() {
        if (nativeid != 0L) {
            Class164.method1739(0, this);
        }
    }
}
