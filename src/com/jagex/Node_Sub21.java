package com.jagex;

public class Node_Sub21 extends Node {
    static int anInt7182;
    static Class96 aClass96_7183 = null;
    static int anInt7184;
    static Class243 aClass243_7185 = new Class243();
    static int anInt7186;
    protected int anInt7181;
    protected int anInt7187;

    Node_Sub21(int i, int i_1_) {
        anInt7187 = i;
        anInt7181 = i_1_;
    }

    public static void method2617(int i) {
        aClass243_7185 = null;
        int i_0_ = 75 % ((i + 6) / 55);
        aClass96_7183 = null;
    }

    static void method2618(boolean bool, int i) {
        anInt7182++;
        if (Node_Sub10.aString7081.length() != 0) {
            Node_Sub7.generateTimestamp((byte) 43, "--> " + Node_Sub10.aString7081);
            DevConsoleNode.processConsoleCommands(120, false, bool, Node_Sub10.aString7081);
            Class332.anInt4145 = i;
            if (!bool) {
                Class315.anInt4034 = 0;
                Node_Sub10.aString7081 = "";
            }
        }
    }
}
