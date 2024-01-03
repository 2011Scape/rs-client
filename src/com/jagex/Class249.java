package com.jagex;

public class Class249 {
    static int anInt3149;
    static int[] anIntArray3151;
    static int anInt3153;
    static Buffer[] aBufferArray3154 = new Buffer[2048];
    static int anInt3159;
    static int anInt3161;

    static {
        anIntArray3151 = new int[]{4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1};
    }

    protected int anInt3148;
    protected int anInt3150;
    protected int anInt3152;
    protected int anInt3155 = 0;
    protected long aLong3156;
    protected int anInt3157;
    protected int anInt3158;
    protected int anInt3160;
    protected int anInt3162 = 0;
    protected int anInt3163;
    protected int anInt3164;
    protected int anInt3166;
    private boolean aBoolean3165 = false;
    private int anInt3167;

    static int method3086(int i, int i_0_, byte b) {
        anInt3159++;
        int i_1_ = i >>> 24;
        i = (~0xff00ff & (0xff00ff & i) * i_1_ | 0xff0000 & (i & 0xff00) * i_1_) >>> 8;
        if (b != -56) {
            method3086(30, -58, (byte) 18);
        }
        int i_2_ = -i_1_ + 255;
        return i + ((0xff0000 & i_2_ * (i_0_ & 0xff00) | i_2_ * (i_0_ & 0xff00ff) & ~0xff00ff) >>> 8);
    }

    public static void method3088(byte b) {
        if (b < 92) {
            method3086(99, -54, (byte) 56);
        }
        aBufferArray3154 = null;
        anIntArray3151 = null;
    }

    private void method3087(Buffer buffer, int i, int i_3_) {
        if (i_3_ != 1) {
            if ((~i_3_) == -3) {
                buffer.method2233(i + 253);
            } else if ((~i_3_) == -4) {
                anInt3157 = buffer.method2186(-82);
                anInt3166 = buffer.method2186(i ^ 0x30);
                anInt3150 = buffer.method2186(-89);
            } else if ((~i_3_) != -5) {
                if (i_3_ == 6) {
                    anInt3160 = buffer.method2233(255);
                } else if ((~i_3_) != -9) {
                    if ((~i_3_) != -10) {
                        if (i_3_ == 10) {
                            aBoolean3165 = true;
                        }
                    } else {
                        anInt3162 = 1;
                    }
                } else {
                    anInt3155 = 1;
                }
            } else {
                anInt3163 = buffer.method2233(255);
                anInt3148 = buffer.method2186(122);
            }
        } else {
            anInt3167 = buffer.method2219(i ^ ~0x7c7fc35);
        }
        anInt3153++;
        if (i != 2) {
            anInt3152 = 73;
        }
    }

    final void method3089(byte b) {
        anInt3161++;
        anInt3152 = Class335.anIntArray4165[anInt3167 << 3];
        long l = (long) anInt3157;
        long l_4_ = (long) anInt3166;
        long l_5_ = (long) anInt3150;
        if (b <= 111) {
            aBoolean3165 = false;
        }
        anInt3164 = (int) Math.sqrt((double) (l * l - (-(l_4_ * l_4_) - (l_5_ * l_5_))));
        if (anInt3148 == 0) {
            anInt3148 = 1;
        }
        if (anInt3163 == 0) {
            aLong3156 = 2147483647L;
        } else if ((~anInt3163) != -2) {
            if ((~anInt3163) == -3) {
                aLong3156 = (long) (8 * anInt3164 / anInt3148);
            }
        } else {
            aLong3156 = (long) (anInt3164 * 8 / anInt3148);
            aLong3156 *= aLong3156;
        }
        if (aBoolean3165) {
            anInt3164 *= -1;
        }
    }

    final void method3090(byte b, Buffer buffer) {
        anInt3149++;
        if (b > -16) {
            method3086(58, -104, (byte) 30);
        }
        for (; ; ) {
            int i = buffer.method2233(255);
            if ((~i) == -1) {
                break;
            }
            method3087(buffer, 2, i);
        }
    }
}
