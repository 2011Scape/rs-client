package com.jagex;

import java.lang.reflect.Method;

public class Class79 {
    static int anInt1043;
    static int anInt1046;
    static boolean aBoolean1052 = false;
    static int anInt1059;
    static int anInt1061;
    static int[][] anIntArrayArray1070;
    static int anInt1073;
    static int anInt1075;
    static Widget[][] aWidgetArrayArray1082;
    static int anInt1083;
    static int anInt1086;
    static int anInt1088;
    /*synthetic*/ static Class aClass1094;
    protected String aString1045;
    protected boolean aBoolean1047;
    protected int[] anIntArray1049;
    protected int anInt1050 = -1;
    protected int anInt1051;
    protected int anInt1054;
    protected int anInt1055;
    protected int anInt1056;
    protected byte[] aByteArray1057;
    protected int anInt1058;
    protected int anInt1060;
    protected int anInt1062;
    protected boolean aBoolean1063;
    protected boolean aBoolean1064;
    protected String[] aStringArray1065;
    protected int[] anIntArray1066;
    protected int anInt1067;
    protected int anInt1068;
    protected int anInt1071;
    protected int anInt1074;
    protected Class215 aClass215_1076;
    protected int anInt1077;
    protected boolean aBoolean1079;
    protected int anInt1080;
    protected int anInt1081;
    protected int anInt1084;
    protected String aString1085;
    protected int anInt1089;
    protected int anInt1090;
    protected int anInt1092;
    private int anInt1042;
    private int anInt1044 = -1;
    private int anInt1048;
    private HashTable aHashTable1053;
    private int anInt1069;
    private int anInt1072;
    private int anInt1078;
    private int anInt1087;
    private int anInt1091;
    private int anInt1093;

    public Class79() {
        anInt1048 = -1;
        anInt1062 = -1;
        anInt1060 = -2147483648;
        anInt1056 = -1;
        aBoolean1047 = true;
        aBoolean1063 = true;
        anInt1069 = -1;
        anInt1051 = 2147483647;
        anInt1067 = -1;
        aStringArray1065 = new String[5];
        anInt1054 = -1;
        anInt1074 = -1;
        aBoolean1064 = true;
        aBoolean1079 = false;
        anInt1068 = 2147483647;
        anInt1089 = -2147483648;
        anInt1091 = -1;
        anInt1080 = -1;
        anInt1093 = -1;
        anInt1090 = 0;
    }

    public static void method783(int i) {
        anIntArrayArray1070 = null;
        aWidgetArrayArray1082 = null;
        if (i != 5621) {
            aBoolean1052 = true;
        }
    }

    static void method788(boolean bool) {
        anInt1061++;
        try {
            if (!bool) {
                aWidgetArrayArray1082 = null;
            }
            Method method = (aClass1094 == null ? aClass1094 = method792("java.lang.Runtime") : aClass1094).getMethod("availableProcessors");
            if (method != null) {
                try {
                    Runtime runtime = Runtime.getRuntime();
                    Integer integer = (Integer) method.invoke(runtime, null);
                    Class263.anInt3336 = integer.intValue();
                } catch (Throwable throwable) {
                    /* empty */
                }
            }
        } catch (Exception exception) {
            /* empty */
        }
    }

    /*synthetic*/
    static Class method792(String string) {
        Class var_class;
        try {
            var_class = Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw (NoClassDefFoundError) new NoClassDefFoundError().initCause(classnotfoundexception);
        }
        return var_class;
    }

    final void method782(byte b, Buffer buffer) {
        if (b <= -59) {
            anInt1088++;
            for (; ; ) {
                int i = buffer.method2233(255);
                if (i == 0) {
                    break;
                }
                method791((byte) 54, buffer, i);
            }
        }
    }

    final boolean method784(byte b, Interface17 interface17) {
        if (b <= 75) {
            aByteArray1057 = null;
        }
        anInt1073++;
        int i;
        if ((~anInt1091) == 0) {
            if (anInt1069 == -1) {
                return true;
            }
            i = interface17.method64(anInt1069, (byte) -42);
        } else {
            i = interface17.method65(anInt1091, -43);
        }
        if ((~i) > (~anInt1087) || (~i) < (~anInt1042)) {
            return false;
        }
        boolean bool = false;
        int i_0_;
        if (anInt1044 == -1) {
            if ((~anInt1048) != 0) {
                i_0_ = interface17.method64(anInt1048, (byte) -42);
            } else {
                return true;
            }
        } else {
            i_0_ = interface17.method65(anInt1044, -56);
        }
        return (~anInt1078) >= (~i_0_) && anInt1072 >= i_0_;
    }

    final String method785(int i, int i_1_, String string) {
        anInt1059++;
        if (aHashTable1053 == null) {
            return string;
        }
        Node_Sub18 node_sub18 = (Node_Sub18) aHashTable1053.method1518(3512, i);
        if (node_sub18 == null) {
            return string;
        }
        if (i_1_ != -18740) {
            anIntArrayArray1070 = null;
        }
        return node_sub18.aString7149;
    }

    final int method786(int i, int i_2_, int i_3_) {
        anInt1046++;
        if (aHashTable1053 == null) {
            return i_2_;
        }
        if (i != 0) {
            method786(20, 39, 79);
        }
        Node_Sub32 node_sub32 = (Node_Sub32) aHashTable1053.method1518(3512, i_3_);
        if (node_sub32 == null) {
            return i_2_;
        }
        return node_sub32.anInt7381;
    }

    final GLSprite method787(int i, GraphicsToolkit graphicstoolkit) {
        anInt1043++;
        if (i != 32394) {
            method789(true);
        }
        GLSprite glsprite = (GLSprite) aClass215_1076.aClass61_2543.method607(0x20000 | anInt1093 | (long) graphicstoolkit.anInt1537 << 29, 0);
        if (glsprite != null) {
            return glsprite;
        }
        aClass215_1076.aClass302_2541.method3510(anInt1093, (byte) 63);
        Class383 class383 = Class383.method4194(aClass215_1076.aClass302_2541, anInt1093, 0);
        if (class383 != null) {
            glsprite = graphicstoolkit.a(class383, true);
            aClass215_1076.aClass61_2543.method601(glsprite, i - 6828, anInt1093 | 0x20000 | (long) graphicstoolkit.anInt1537 << 29);
        }
        return glsprite;
    }

    final void method789(boolean bool) {
        anInt1083++;
        if (bool) {
            aString1085 = null;
        }
        if (anIntArray1049 != null) {
            for (int i = 0; (~i) > (~anIntArray1049.length); i += 2) {
                if (anIntArray1049[i] >= anInt1068) {
                    if (anInt1089 < anIntArray1049[i]) {
                        anInt1089 = anIntArray1049[i];
                    }
                } else {
                    anInt1068 = anIntArray1049[i];
                }
                if (anInt1051 > anIntArray1049[i + 1]) {
                    anInt1051 = anIntArray1049[1 + i];
                } else if ((~anInt1060) > (~anIntArray1049[1 + i])) {
                    anInt1060 = anIntArray1049[i + 1];
                }
            }
        }
    }

    final GLSprite method790(boolean bool, byte b, GraphicsToolkit graphicstoolkit) {
        if (b >= -90) {
            method787(-5, null);
        }
        anInt1086++;
        int i = !bool ? anInt1062 : anInt1056;
        int i_4_ = graphicstoolkit.anInt1537 << 29 | i;
        GLSprite glsprite = (GLSprite) aClass215_1076.aClass61_2543.method607(i_4_, 0);
        if (glsprite != null) {
            return glsprite;
        }
        if (!aClass215_1076.aClass302_2541.method3510(i, (byte) 63)) {
            return null;
        }
        Class383 class383 = Class383.method4194(aClass215_1076.aClass302_2541, i, 0);
        if (class383 != null) {
            glsprite = graphicstoolkit.a(class383, true);
            aClass215_1076.aClass61_2543.method601(glsprite, 25566, i_4_);
        }
        return glsprite;
    }

    private void method791(byte b, Buffer buffer, int i) {
        anInt1075++;
        int i_5_ = 28 % ((-34 - b) / 37);
        if (i == 1) {
            anInt1062 = buffer.method2219(-130546744);
        } else if ((~i) == -3) {
            anInt1056 = buffer.method2219(-130546744);
        } else if ((~i) == -4) {
            aString1085 = buffer.method2195(-1);
        } else if (i == 4) {
            anInt1058 = buffer.method2220(1819759595);
        } else if ((~i) != -6) {
            if (i != 6) {
                if (i == 7) {
                    int i_6_ = buffer.method2233(255);
                    if ((0x1 & i_6_) == 0) {
                        aBoolean1047 = false;
                    }
                    if ((~(i_6_ & 0x2)) == -3) {
                        aBoolean1079 = true;
                    }
                } else if (i != 8) {
                    if (i != 9) {
                        if ((~i) <= -11 && i <= 14) {
                            aStringArray1065[i - 10] = buffer.method2195(-1);
                        } else if (i != 15) {
                            if ((~i) == -17) {
                                aBoolean1064 = false;
                            } else if ((~i) != -18) {
                                if (i == 18) {
                                    anInt1093 = buffer.method2219(-130546744);
                                } else if ((~i) == -20) {
                                    anInt1067 = buffer.method2219(-130546744);
                                } else if ((~i) == -21) {
                                    anInt1048 = buffer.method2219(-130546744);
                                    if ((~anInt1048) == -65536) {
                                        anInt1048 = -1;
                                    }
                                    anInt1044 = buffer.method2219(-130546744);
                                    if (anInt1044 == 65535) {
                                        anInt1044 = -1;
                                    }
                                    anInt1078 = buffer.method2186(119);
                                    anInt1072 = buffer.method2186(120);
                                } else if (i == 21) {
                                    anInt1081 = buffer.method2186(-88);
                                } else if (i == 22) {
                                    anInt1077 = buffer.method2186(-47);
                                } else if (i == 23) {
                                    anInt1074 = buffer.method2233(255);
                                    anInt1050 = buffer.method2233(255);
                                    anInt1080 = buffer.method2233(255);
                                } else if ((~i) == -25) {
                                    anInt1071 = buffer.method2193(-65);
                                    anInt1092 = buffer.method2193(-75);
                                } else if ((~i) == -250) {
                                    int i_7_ = buffer.method2233(255);
                                    if (aHashTable1053 == null) {
                                        int i_8_ = Class320_Sub19.method3753(i_7_, -729073628);
                                        aHashTable1053 = new HashTable(i_8_);
                                    }
                                    for (int i_9_ = 0; (~i_9_) > (~i_7_); i_9_++) {
                                        boolean bool = buffer.method2233(255) == 1;
                                        int i_10_ = buffer.method2220(1819759595);
                                        Node node;
                                        if (bool) {
                                            node = new Node_Sub18(buffer.method2195(-1));
                                        } else {
                                            node = new Node_Sub32(buffer.method2186(-90));
                                        }
                                        aHashTable1053.method1515(i_10_, node, -126);
                                    }
                                }
                            } else {
                                aString1045 = buffer.method2195(-1);
                            }
                        } else {
                            int i_11_ = buffer.method2233(255);
                            anIntArray1049 = new int[i_11_ * 2];
                            for (int i_12_ = 0; i_12_ < 2 * i_11_; i_12_++)
                                anIntArray1049[i_12_] = buffer.method2193(-67);
                            anInt1084 = buffer.method2186(96);
                            int i_13_ = buffer.method2233(255);
                            anIntArray1066 = new int[i_13_];
                            for (int i_14_ = 0; (~i_14_) > (~anIntArray1066.length); i_14_++)
                                anIntArray1066[i_14_] = buffer.method2186(84);
                            aByteArray1057 = new byte[i_11_];
                            for (int i_15_ = 0; (~i_11_) < (~i_15_); i_15_++)
                                aByteArray1057[i_15_] = buffer.method2214((byte) -109);
                        }
                    } else {
                        anInt1069 = buffer.method2219(-130546744);
                        if ((~anInt1069) == -65536) {
                            anInt1069 = -1;
                        }
                        anInt1091 = buffer.method2219(-130546744);
                        if ((~anInt1091) == -65536) {
                            anInt1091 = -1;
                        }
                        anInt1087 = buffer.method2186(105);
                        anInt1042 = buffer.method2186(-128);
                    }
                } else {
                    aBoolean1063 = buffer.method2233(255) == 1;
                }
            } else {
                anInt1090 = buffer.method2233(255);
            }
        } else {
            anInt1054 = buffer.method2220(1819759595);
        }
    }
}
