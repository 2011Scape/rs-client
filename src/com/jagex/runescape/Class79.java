package com.jagex.runescape;
import java.lang.reflect.Method;

public class Class79
{
	private int anInt1042;
	static int anInt1043;
	private int anInt1044 = -1;
	protected String aString1045;
	static int anInt1046;
	protected boolean aBoolean1047;
	private int anInt1048;
	protected int[] anIntArray1049;
	protected int anInt1050 = -1;
	protected int anInt1051;
	static boolean aBoolean1052 = false;
	private HashTable aHashTable1053;
	protected int anInt1054;
	protected int anInt1055;
	protected int anInt1056;
	protected byte[] aByteArray1057;
	protected int anInt1058;
	static int anInt1059;
	protected int anInt1060;
	static int anInt1061;
	protected int anInt1062;
	protected boolean aBoolean1063;
	protected boolean aBoolean1064;
	protected String[] aStringArray1065;
	protected int[] anIntArray1066;
	protected int anInt1067;
	protected int anInt1068;
	private int anInt1069;
	static int[][] anIntArrayArray1070;
	protected int anInt1071;
	private int anInt1072;
	static int anInt1073;
	protected int anInt1074;
	static int anInt1075;
	protected Class215 aClass215_1076;
	protected int anInt1077;
	private int anInt1078;
	protected boolean aBoolean1079;
	protected int anInt1080;
	protected int anInt1081;
	static Widget[][] aWidgetArrayArray1082;
	static int anInt1083;
	protected int anInt1084;
	protected String aString1085;
	static int anInt1086;
	private int anInt1087;
	static int anInt1088;
	protected int anInt1089;
	protected int anInt1090;
	private int anInt1091;
	protected int anInt1092;
	private int anInt1093;
	 static Class aClass1094;
	
	final void method782(byte b, Buffer buffer) {
		if (b <= -59) {
			anInt1088++;
			for (;;) {
				int i = buffer.readUnsignedByte();
				if (i == 0) {
					break;
				}
				method791((byte) 54, buffer, i);
			}
		}
	}
	
	public static void method783(int i) {
		anIntArrayArray1070 = null;
		aWidgetArrayArray1082 = null;
		if (i != 5621) {
			aBoolean1052 = true;
		}
	}
	
	final boolean method784(byte b, Interface17 interface17) {
		if (b <= 75) {
			aByteArray1057 = null;
		}
		anInt1073++;
		int i;
		if (anInt1091 == -1) {
			if (anInt1069 == -1) {
				return true;
			}
			i = interface17.method64(anInt1069, (byte) -42);
		} else {
			i = interface17.method65(anInt1091, -43);
		}
		if (anInt1087 > i || anInt1042 < i) {
			return false;
		}
		boolean bool = false;
		int i_0_;
		if (anInt1044 == -1) {
			if (anInt1048 != -1) {
				i_0_ = interface17.method64(anInt1048, (byte) -42);
			} else {
				return true;
			}
		} else {
			i_0_ = interface17.method65(anInt1044, -56);
		}
		return i_0_ >= anInt1078 && anInt1072 >= i_0_;
	}
	
	final String method785(int i, int i_1_, String string) {
		anInt1059++;
		if (aHashTable1053 == null) {
			return string;
		}
		Node_Sub18 node_sub18 = (Node_Sub18) aHashTable1053.method1518(3512, (long) i);
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
		Node_Sub32 node_sub32 = (Node_Sub32) aHashTable1053.method1518(3512, (long) i_3_);
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
		GLSprite glsprite = (GLSprite) aClass215_1076.aClass61_2543.method607((long) (0x20000 | anInt1093 | graphicstoolkit.anInt1537 << 29), 0);
		if (glsprite != null) {
			return glsprite;
		}
		aClass215_1076.aClass302_2541.method3510(anInt1093, (byte) 63);
		Class383 class383 = Class383.method4194(aClass215_1076.aClass302_2541, anInt1093, 0);
		if (class383 != null) {
			glsprite = graphicstoolkit.a(class383, true);
			aClass215_1076.aClass61_2543.method601(glsprite, i + -6828, (long) (anInt1093 | 0x20000 | graphicstoolkit.anInt1537 << 29));
		}
		return glsprite;
	}
	
	static final void method788(boolean bool) {
		anInt1061++;
		try {
			if (bool != true) {
				aWidgetArrayArray1082 = null;
			}
			Method method = (aClass1094 == null ? aClass1094 = method792("java.lang.Runtime") : aClass1094).getMethod("availableProcessors", new Class[0]);
			if (method != null) {
				try {
					Runtime runtime = Runtime.getRuntime();
					Integer integer = (Integer) method.invoke(runtime, null);
					Class263.anInt3336 = integer.intValue();
				} catch (Throwable throwable) {

				}
			}
		} catch (Exception exception) {

		}
	}
	
	final void method789(boolean bool) {
		anInt1083++;
		if (bool != false) {
			aString1085 = null;
		}
		if (anIntArray1049 != null) {
			for (int i = 0; anIntArray1049.length > i; i += 2) {
				if (anIntArray1049[i] >= anInt1068) {
					if (anInt1089 < anIntArray1049[i]) {
						anInt1089 = anIntArray1049[i];
					}
				} else {
					anInt1068 = anIntArray1049[i];
				}
				if (anInt1051 > anIntArray1049[i + 1]) {
					anInt1051 = anIntArray1049[1 + i];
				} else if (anIntArray1049[1 + i] > anInt1060) {
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
		GLSprite glsprite = (GLSprite) aClass215_1076.aClass61_2543.method607((long) i_4_, 0);
		if (glsprite != null) {
			return glsprite;
		}
		if (!aClass215_1076.aClass302_2541.method3510(i, (byte) 63)) {
			return null;
		}
		Class383 class383 = Class383.method4194(aClass215_1076.aClass302_2541, i, 0);
		if (class383 != null) {
			glsprite = graphicstoolkit.a(class383, true);
			aClass215_1076.aClass61_2543.method601(glsprite, 25566, (long) i_4_);
		}
		return glsprite;
	}
	
	private final void method791(byte b, Buffer buffer, int i) {
		anInt1075++;
		int i_5_ = 28 % ((-34 - b) / 37);
		if (i == 1) {
			anInt1062 = buffer.readUnsignedShort();
		} else if (i == 2) {
			anInt1056 = buffer.readUnsignedShort();
		} else if (i == 3) {
			aString1085 = buffer.readString();
		} else if (i == 4) {
			anInt1058 = buffer.read24BitInt();
		} else if (i != 5) {
			if (i != 6) {
				if (i == 7) {
					int i_6_ = buffer.readUnsignedByte();
					if ((0x1 & i_6_) == 0) {
						aBoolean1047 = false;
					}
					if ((i_6_ & 0x2) == 2) {
						aBoolean1079 = true;
					}
				} else if (i != 8) {
					if (i != 9) {
						if (i >= 10 && i <= 14) {
							aStringArray1065[i + -10] = buffer.readString();
						} else if (i != 15) {
							if (i == 16) {
								aBoolean1064 = false;
							} else if (i != 17) {
								if (i == 18) {
									anInt1093 = buffer.readUnsignedShort();
								} else if (i == 19) {
									anInt1067 = buffer.readUnsignedShort();
								} else if (i == 20) {
									anInt1048 = buffer.readUnsignedShort();
									if (anInt1048 == 65535) {
										anInt1048 = -1;
									}
									anInt1044 = buffer.readUnsignedShort();
									if (anInt1044 == 65535) {
										anInt1044 = -1;
									}
									anInt1078 = buffer.readInt();
									anInt1072 = buffer.readInt();
								} else if (i == 21) {
									anInt1081 = buffer.readInt();
								} else if (i == 22) {
									anInt1077 = buffer.readInt();
								} else if (i == 23) {
									anInt1074 = buffer.readUnsignedByte();
									anInt1050 = buffer.readUnsignedByte();
									anInt1080 = buffer.readUnsignedByte();
								} else if (i == 24) {
									anInt1071 = buffer.method2193(-65);
									anInt1092 = buffer.method2193(-75);
								} else if (i == 249) {
									int i_7_ = buffer.readUnsignedByte();
									if (aHashTable1053 == null) {
										int i_8_ = Class320_Sub19.method3753(i_7_, -729073628);
										aHashTable1053 = new HashTable(i_8_);
									}
									for (int i_9_ = 0; i_7_ > i_9_; i_9_++) {
										boolean bool = buffer.readUnsignedByte() == 1;
										int i_10_ = buffer.read24BitInt();
										Node node;
										if (bool) {
											node = new Node_Sub18(buffer.readString());
										} else {
											node = new Node_Sub32(buffer.readInt());
										}
										aHashTable1053.method1515((long) i_10_, node, -126);
									}
								}
							} else {
								aString1045 = buffer.readString();
							}
						} else {
							int i_11_ = buffer.readUnsignedByte();
							anIntArray1049 = new int[i_11_ * 2];
							for (int i_12_ = 0; i_12_ < 2 * i_11_; i_12_++)
								anIntArray1049[i_12_] = buffer.method2193(-67);
							anInt1084 = buffer.readInt();
							int i_13_ = buffer.readUnsignedByte();
							anIntArray1066 = new int[i_13_];
							for (int i_14_ = 0; anIntArray1066.length > i_14_; i_14_++)
								anIntArray1066[i_14_] = buffer.readInt();
							aByteArray1057 = new byte[i_11_];
							for (int i_15_ = 0; i_15_ < i_11_; i_15_++)
								aByteArray1057[i_15_] = buffer.readByte();
						}
					} else {
						anInt1069 = buffer.readUnsignedShort();
						if (anInt1069 == 65535) {
							anInt1069 = -1;
						}
						anInt1091 = buffer.readUnsignedShort();
						if (anInt1091 == 65535) {
							anInt1091 = -1;
						}
						anInt1087 = buffer.readInt();
						anInt1042 = buffer.readInt();
					}
				} else {
					aBoolean1063 = buffer.readUnsignedByte() == 1;
				}
			} else {
				anInt1090 = buffer.readUnsignedByte();
			}
		} else {
			anInt1054 = buffer.read24BitInt();
		}
	}
	
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
	
	 static Class method792(String string) {
		Class var_class;
		try {
			var_class = Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw (NoClassDefFoundError) new NoClassDefFoundError().initCause(classnotfoundexception);
		}
		return var_class;
	}
}
