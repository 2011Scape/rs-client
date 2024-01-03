package com.jagex;

public class Class70 {
    static int anInt945;
    static int anInt947;
    static int anInt949;
    protected int anInt946;
    protected int anInt948;
    protected int anInt950;

    static void method738(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
        if (i_7_ == 1) {
            anInt947++;
            if ((~i_8_) == (~i_3_)) {
                OutputStream_Sub2.method138(i_2_, i_8_, i_5_, (byte) 91, i, i_4_, i_6_);
            } else if (Class262_Sub4.anInt7722 > i_4_ - i_8_ || (~(i_8_ + i_4_)) < (~za_Sub2.anInt10513) || (~Class384.anInt4906) < (~(i - i_3_)) || (~Node_Sub25_Sub1.anInt9936) > (~(i_3_ + i))) {
                Class263.method3223(i_4_, i_8_, -21595, i_3_, i_5_, i, i_6_, i_2_);
            } else {
                Class188_Sub2.method1903(i_6_, i_8_, i_5_, i_3_, i_2_, 3, i, i_4_);
            }
        }
    }

    final void method737(int i, Buffer buffer) {
        int i_0_ = 0 / ((71 - i) / 50);
        for (; ; ) {
            int i_1_ = buffer.method2233(255);
            if ((~i_1_) == -1) {
                break;
            }
            method739(-31, buffer, i_1_);
        }
        anInt945++;
    }

    private void method739(int i, Buffer buffer, int i_9_) {
        int i_10_ = -10 % ((10 - i) / 34);
        anInt949++;
        if (i_9_ == 1) {
            anInt950 = buffer.method2219(-130546744);
            anInt946 = buffer.method2233(255);
            anInt948 = buffer.method2233(255);
        }
    }
}
