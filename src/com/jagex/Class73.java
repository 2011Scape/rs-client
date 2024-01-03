package com.jagex;

public class Class73 {
    static byte[] aByteArray981 = new byte[2048];
    static int anInt983;
    static int anInt985;
    static CacheNode_Sub4 aCacheNode_Sub4_988 = null;
    static int anInt990;
    static int anInt992;
    protected Class339_Sub6 aClass339_Sub6_986;
    private Class301 aClass301_980;
    private Class339[] aClass339Array982;
    private GLToolkit aGLToolkit984;
    private int anInt987 = 0;
    private int anInt989 = 0;
    private int anInt991 = 0;

    Class73(GLToolkit gltoolkit) {
        aGLToolkit984 = gltoolkit;
        aClass301_980 = new Class301(gltoolkit);
        aClass339Array982 = new Class339[10];
        aClass339Array982[1] = new Class339_Sub1(gltoolkit);
        aClass339Array982[2] = new Class339_Sub9(gltoolkit, aClass301_980);
        aClass339Array982[4] = new Class339_Sub2(gltoolkit, aClass301_980);
        aClass339Array982[5] = new Class339_Sub5(gltoolkit, aClass301_980);
        aClass339Array982[6] = new Class339_Sub8(gltoolkit);
        aClass339Array982[7] = new Class339_Sub3(gltoolkit);
        aClass339Array982[3] = aClass339_Sub6_986 = new Class339_Sub6(gltoolkit);
        aClass339Array982[8] = new Class339_Sub4(gltoolkit, aClass301_980);
        aClass339Array982[9] = new Class339_Sub7(gltoolkit, aClass301_980);
        if (!aClass339Array982[8].method3922((byte) -71)) {
            aClass339Array982[8] = aClass339Array982[4];
        }
        if (!aClass339Array982[9].method3922((byte) -60)) {
            aClass339Array982[9] = aClass339Array982[8];
        }
    }

    static boolean method749(byte b, int i, int i_0_) {
        if (b != -65) {
            method749((byte) 11, -103, -77);
        }
        anInt983++;
        return (i & 0x18) != 0 | (i & 0x220) == 544;
    }

    public static void method752(int i) {
        aCacheNode_Sub4_988 = null;
        aByteArray981 = null;
        if (i < 116) {
            method752(-94);
        }
    }

    final boolean method748(int i, byte b) {
        if (b < 21) {
            return true;
        }
        anInt990++;
        return aClass339Array982[i].method3922((byte) -73);
    }

    final boolean method750(byte b, int i, Class169 class169) {
        if (b <= 97) {
            return false;
        }
        anInt992++;
        if (anInt987 == 0) {
            return false;
        }
        aClass339Array982[0x7fffffff & anInt987].method3917(class169, i, -28289);
        return true;
    }

    final void method751(int i, int i_1_, boolean bool, boolean bool_2_, int i_3_, int i_4_) {
        anInt985++;
        bool &= aGLToolkit984.z();
        if (i >= -72) {
            aClass301_980 = null;
        }
        if (!bool && ((~i_4_) == -5 || i_4_ == 8 || (~i_4_) == -10)) {
            if (i_4_ == 4) {
                i_1_ = i_3_;
            }
            i_4_ = 2;
        }
        if (i_4_ != 0 && bool_2_) {
            i_4_ |= ~0x7fffffff;
        }
        if ((~i_4_) == (~anInt987)) {
            if ((~anInt987) != -1) {
                aClass339Array982[anInt987 & 0x7fffffff].method3920(-1, bool_2_);
                if (anInt991 != i_3_ || (~anInt989) != (~i_1_)) {
                    aClass339Array982[anInt987 & 0x7fffffff].method3919(-13437, i_1_, i_3_);
                    anInt989 = i_1_;
                    anInt991 = i_3_;
                }
            }
        } else {
            if (anInt987 != 0) {
                aClass339Array982[anInt987 & 0x7fffffff].method3918(20937);
            }
            if (i_4_ != 0) {
                aClass339Array982[0x7fffffff & i_4_].method3923(bool_2_, 0);
                aClass339Array982[i_4_ & 0x7fffffff].method3920(-1, bool_2_);
                aClass339Array982[i_4_ & 0x7fffffff].method3919(-13437, i_1_, i_3_);
            }
            anInt989 = i_1_;
            anInt991 = i_3_;
            anInt987 = i_4_;
        }
    }
}
