package com.jagex;

public class Class316 {
    static int anInt4036;
    static int anInt4037;

    static boolean method3661(int i, int i_0_, byte b) {
        anInt4037++;
        if (b != 69) {
            return false;
        }
        return (i & 0x180) != 0;
    }

    static boolean method3662(boolean bool, char c) {
        anInt4036++;
        if (bool) {
            method3662(true, '%');
        }
        return ((~c) <= -49 && (~c) >= -58) || (c >= 65 && (~c) >= -91) || (c >= 97 && c <= 122);
    }
}
