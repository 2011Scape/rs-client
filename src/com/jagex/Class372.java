package com.jagex;

public class Class372 {
    static int anInt4587;
    static Class372 aClass372_4588 = new Class372(1);
    static int anInt4589;
    static int anInt4590;
    static Class372 aClass372_4592 = new Class372(2);
    static Class372 aClass372_4593 = new Class372(4);
    static Class372 aClass372_4594 = new Class372(1);
    static Class372 aClass372_4595 = new Class372(2);
    static Class372 aClass372_4596 = new Class372(4);
    static Class372 aClass372_4597 = new Class372(2);
    static Class372 aClass372_4598 = new Class372(4);
    static boolean aBoolean4599 = false;
    static int anInt4600;
    protected int anInt4591;

    private Class372(int i) {
        anInt4591 = i;
    }

    public static void method4102(byte b) {
        aClass372_4593 = null;
        aClass372_4597 = null;
        aClass372_4594 = null;
        aClass372_4595 = null;
        aClass372_4596 = null;
        aClass372_4598 = null;
        aClass372_4588 = null;
        if (b >= -51) {
            aClass372_4588 = null;
        }
        aClass372_4592 = null;
    }

    static void method4103(int i, Actor actor, int i_0_) {
        anInt4587++;
        if (actor.anIntArray10817 != null) {
            if (i_0_ > actor.anIntArray10817.length) {
                i_0_ = actor.anIntArray10817.length - 2;
            }
            int i_1_ = actor.anIntArray10817[1 + i_0_];
            if (actor.anAnimator10876.method250((byte) -126) != i_1_) {
                actor.anAnimator10876.method234(actor.anAnimator10876.method223(88), i_1_, 127);
                actor.anInt10900 = actor.anInt10904;
            }
        }
        if (i != 65) {
            method4102((byte) 37);
        }
    }

    static boolean method4104(boolean bool, int i, String string, int i_2_) {
        anInt4590++;
        if (i_2_ < 2 || i_2_ > 36) {
            throw new IllegalArgumentException("Invalid radix:" + i_2_);
        }
        boolean bool_3_ = false;
        boolean bool_4_ = false;
        int i_5_ = i;
        int i_6_ = string.length();
        for (int i_7_ = 0; (~i_6_) < (~i_7_); i_7_++) {
            int i_8_ = string.charAt(i_7_);
            if (i_7_ == 0) {
                if ((~i_8_) == -46) {
                    bool_3_ = true;
                    continue;
                }
                if (i_8_ == 43 && bool) {
                    continue;
                }
            }
            if (i_8_ >= 48 && (~i_8_) >= -58) {
                i_8_ -= 48;
            } else if (i_8_ >= 65 && (~i_8_) >= -91) {
                i_8_ -= 55;
            } else if ((~i_8_) <= -98 && i_8_ <= 122) {
                i_8_ -= 87;
            } else {
                return false;
            }
            if ((~i_8_) <= (~i_2_)) {
                return false;
            }
            if (bool_3_) {
                i_8_ = -i_8_;
            }
            int i_9_ = i_8_ + i_5_ * i_2_;
            if (i_5_ != i_9_ / i_2_) {
                return false;
            }
            i_5_ = i_9_;
            bool_4_ = true;
        }
        return bool_4_;
    }

    public final String toString() {
        anInt4589++;
        throw new IllegalStateException();
    }
}
