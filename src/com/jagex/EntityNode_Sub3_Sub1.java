package com.jagex;

public class EntityNode_Sub3_Sub1 extends EntityNode_Sub3 {
    static String[] aStringArray9157 = new String[200];
    static int anInt9158;
    static Class318 aClass318_9159;
    static int anInt9160;
    static int[] anIntArray9161;
    static int anInt9163 = 0;
    static short[] aShortArray9165;
    static Class86 aClass86_9166;

    static {
        aClass318_9159 = new Class318(42, 15);
        aShortArray9165 = new short[256];
    }

    protected String aString9156;
    protected int anInt9162 = (int) (Class313.method3650(false) / 1000L);
    protected short aShort9164;

    EntityNode_Sub3_Sub1(String string, int i) {
        aString9156 = string;
        aShort9164 = (short) i;
    }

    public static void method942(boolean bool) {
        if (bool != false) {
            anInt9163 = 37;
        }
        aClass86_9166 = null;
        anIntArray9161 = null;
        aShortArray9165 = null;
        aStringArray9157 = null;
        aClass318_9159 = null;
    }

    static String method943(byte b, int i) {
        if (b >= -11) {
            method943((byte) 88, -59);
        }
        anInt9158++;
        return String.valueOf(0xff & i >> 24) + "." + (0xff & i >> 16) + "." + (0xff & i >> 8) + "." + (0xff & i);
    }

    static void method944(int i) {
        if (i != -7733) {
            method943((byte) -114, 116);
        }
        anInt9160++;
        if (Class243.aClass340_3069 != null) {
            Class243.aClass340_3069.method3952(100);
        }
        if (Class132.aThread1677 != null) {
            for (; ; ) {
                try {
                    Class132.aThread1677.join();
                    break;
                } catch (InterruptedException interruptedexception) {
                    /* empty */
                }
            }
        }
    }
}
