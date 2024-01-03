package com.jagex;

public class EntityNode_Sub2 extends EntityNode {
    static int anInt5949;
    static Class192 aClass192_5952 = new Class192(74, 11);
    static Class192 aClass192_5954 = new Class192(39, 6);
    static Class192 aClass192_5956 = new Class192(132, -2);
    static Class192 aClass192_5958 = new Class192(15, 0);
    protected int anInt5947;
    protected int anInt5948;
    protected int anInt5950;
    protected int anInt5951;
    protected String aString5953;
    protected int anInt5955;
    protected int anInt5957;

    public static void method935(int i) {
        aClass192_5952 = null;
        if (i == -7576) {
            aClass192_5958 = null;
            aClass192_5954 = null;
            aClass192_5956 = null;
        }
    }

    static long method936(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, byte b) {
        anInt5949++;
        Class141.aCalendar1754.clear();
        Class141.aCalendar1754.set(i_1_, i, i_3_, i_4_, i_2_, i_0_);
        if (b <= 71) {
            return -52L;
        }
        return Class141.aCalendar1754.getTime().getTime();
    }
}
