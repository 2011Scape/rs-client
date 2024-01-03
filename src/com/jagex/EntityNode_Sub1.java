package com.jagex;

public class EntityNode_Sub1 extends EntityNode {
    static int anInt5924;
    static Class318 aClass318_5927 = new Class318(38, -1);
    static Node_Sub9_Sub1 aNode_Sub9_Sub1_5929;
    protected int anInt5922;
    protected int anInt5923;
    protected Actor anActor5925;
    protected int anInt5926;
    protected int anInt5928;

    EntityNode_Sub1() {
        /* empty */
    }

    public static void method804(boolean bool) {
        aNode_Sub9_Sub1_5929 = null;
        aClass318_5927 = null;
        if (!bool) {
            aClass318_5927 = null;
        }
    }

    static Class253 method805(int i, int i_0_) {
        anInt5924++;
        if (i_0_ != -26296) {
            aNode_Sub9_Sub1_5929 = null;
        }
        if ((~i) > -1 || i >= 100) {
            return null;
        }
        return r_Sub2.aClass253Array11063[i];
    }
}
