package com.jagex;

import java.util.Random;

public class Archive {
    static Random aRandom283 = new Random();
    static GLSprite[] aGLSpriteArray284;
    static int anInt286;
    static int anInt297;
    static int anInt302;
    protected int[] anIntArray285;
    protected int[] anIntArray287;
    protected Class75[] aClass75Array288;
    protected int[][] anIntArrayArray290;
    protected int anInt291;
    protected int anInt292;
    protected int[] anIntArray293;
    protected int anInt294;
    protected int[] anIntArray295;
    protected int anInt296;
    protected byte[][] aByteArrayArray298;
    protected int[] anIntArray299;
    protected int[] anIntArray300;
    protected Class75 aClass75_301;
    protected int[][] anIntArrayArray303;

    Archive(byte[] bs, int i, byte[] bs_33_) {
        anInt291 = Class66_Sub2_Sub1.method728(bs.length, false, bs);
        if ((~i) != (~anInt291)) {
            throw new RuntimeException();
        }
        if (bs_33_ != null) {
            if (bs_33_.length != 64) {
                throw new RuntimeException();
            }
            byte[] aByteArray289 = GLXToolkit.method1399((byte) 119, bs, bs.length, 0);
            for (int i_34_ = 0; i_34_ < 64; i_34_++) {
                if ((~bs_33_[i_34_]) != (~aByteArray289[i_34_])) {
                    throw new RuntimeException();
                }
            }
        }
        method263(bs, false);
    }

    public static void method264(int i) {
        aRandom283 = null;
        if (i < 108) {
            anInt286 = -16;
        }
        aGLSpriteArray284 = null;
    }

    private void method263(byte[] bs, boolean bool) {
        anInt297++;
        Buffer buffer = new Buffer(Node_Sub38_Sub26.method2875(bs, (byte) -104));
        int i = buffer.method2233(255);
        if ((~i) > -6 || i > 7) {
            throw new RuntimeException();
        }
        if ((~i) <= -7) {
            anInt292 = buffer.method2186(-66);
        } else {
            anInt292 = 0;
        }
        int i_0_ = buffer.method2233(255);
        boolean bool_1_ = (0x1 & i_0_) != 0;
        boolean bool_2_ = (~(0x2 & i_0_)) != -1;
        if (i >= 7) {
            anInt294 = buffer.method2201(!bool);
        } else {
            anInt294 = buffer.method2219(-130546744);
        }
        int i_3_ = 0;
        int i_4_ = -1;
        anIntArray300 = new int[anInt294];
        if ((~i) <= -8) {
            for (int i_5_ = 0; anInt294 > i_5_; i_5_++) {
                anIntArray300[i_5_] = i_3_ += buffer.method2201(true);
                if ((~anIntArray300[i_5_]) < (~i_4_)) {
                    i_4_ = anIntArray300[i_5_];
                }
            }
        } else {
            for (int i_6_ = 0; (~anInt294) < (~i_6_); i_6_++) {
                anIntArray300[i_6_] = i_3_ += buffer.method2219(-130546744);
                if ((~i_4_) > (~anIntArray300[i_6_])) {
                    i_4_ = anIntArray300[i_6_];
                }
            }
        }
        anInt296 = i_4_ + 1;
        anIntArray299 = new int[anInt296];
        if (bool_2_) {
            aByteArrayArray298 = new byte[anInt296][];
        }
        anIntArray293 = new int[anInt296];
        anIntArray285 = new int[anInt296];
        anIntArray295 = new int[anInt296];
        anIntArrayArray290 = new int[anInt296][];
        if (bool_1_) {
            anIntArray287 = new int[anInt296];
            for (int i_7_ = 0; (~anInt296) < (~i_7_); i_7_++)
                anIntArray287[i_7_] = -1;
            for (int i_8_ = 0; (~anInt294) < (~i_8_); i_8_++)
                anIntArray287[anIntArray300[i_8_]] = buffer.method2186(94);
            aClass75_301 = new Class75(anIntArray287);
        }
        for (int i_9_ = 0; (~anInt294) < (~i_9_); i_9_++)
            anIntArray299[anIntArray300[i_9_]] = buffer.method2186(50);
        if (bool_2_) {
            for (int i_10_ = 0; (~i_10_) > (~anInt294); i_10_++) {
                byte[] bs_11_ = new byte[64];
                buffer.method2181(0, 64, bs_11_, -19417);
                aByteArrayArray298[anIntArray300[i_10_]] = bs_11_;
            }
        }
        for (int i_12_ = 0; (~i_12_) > (~anInt294); i_12_++)
            anIntArray293[anIntArray300[i_12_]] = buffer.method2186(70);
        if ((~i) > -8) {
            for (int i_13_ = 0; (~i_13_) > (~anInt294); i_13_++)
                anIntArray295[anIntArray300[i_13_]] = buffer.method2219(-130546744);
            for (int i_14_ = 0; i_14_ < anInt294; i_14_++) {
                int i_15_ = anIntArray300[i_14_];
                i_3_ = 0;
                int i_16_ = anIntArray295[i_15_];
                int i_17_ = -1;
                anIntArrayArray290[i_15_] = new int[i_16_];
                for (int i_18_ = 0; i_18_ < i_16_; i_18_++) {
                    int i_19_ = anIntArrayArray290[i_15_][i_18_] = i_3_ += buffer.method2219(-130546744);
                    if ((~i_17_) > (~i_19_)) {
                        i_17_ = i_19_;
                    }
                }
                anIntArray285[i_15_] = 1 + i_17_;
                if (i_16_ == i_17_ + 1) {
                    anIntArrayArray290[i_15_] = null;
                }
            }
        } else {
            for (int i_20_ = 0; anInt294 > i_20_; i_20_++)
                anIntArray295[anIntArray300[i_20_]] = buffer.method2201(true);
            for (int i_21_ = 0; (~anInt294) < (~i_21_); i_21_++) {
                int i_22_ = anIntArray300[i_21_];
                int i_23_ = anIntArray295[i_22_];
                i_3_ = 0;
                int i_24_ = -1;
                anIntArrayArray290[i_22_] = new int[i_23_];
                for (int i_25_ = 0; i_23_ > i_25_; i_25_++) {
                    int i_26_ = anIntArrayArray290[i_22_][i_25_] = i_3_ += buffer.method2201(true);
                    if ((~i_26_) < (~i_24_)) {
                        i_24_ = i_26_;
                    }
                }
                anIntArray285[i_22_] = i_24_ + 1;
                if (1 + i_24_ == i_23_) {
                    anIntArrayArray290[i_22_] = null;
                }
            }
        }
        if (bool_1_) {
            aClass75Array288 = new Class75[1 + i_4_];
            anIntArrayArray303 = new int[1 + i_4_][];
            for (int i_27_ = 0; i_27_ < anInt294; i_27_++) {
                int i_28_ = anIntArray300[i_27_];
                int i_29_ = anIntArray295[i_28_];
                anIntArrayArray303[i_28_] = new int[anIntArray285[i_28_]];
                for (int i_30_ = 0; (~anIntArray285[i_28_]) < (~i_30_); i_30_++)
                    anIntArrayArray303[i_28_][i_30_] = -1;
                for (int i_31_ = 0; (~i_29_) < (~i_31_); i_31_++) {
                    int i_32_;
                    if (anIntArrayArray290[i_28_] != null) {
                        i_32_ = anIntArrayArray290[i_28_][i_31_];
                    } else {
                        i_32_ = i_31_;
                    }
                    anIntArrayArray303[i_28_][i_32_] = buffer.method2186(-69);
                }
                aClass75Array288[i_28_] = new Class75(anIntArrayArray303[i_28_]);
            }
        }
        if (bool) {
            method264(-19);
        }
    }
}
