package com.jagex;

public class Class152
{
	protected int anInt1934;
	protected int anInt1935;
	protected int anInt1936;
	protected int anInt1937;
	static int anInt1938;
	static Class192 aClass192_1939 = new Class192(65, 6);
	static SignLink aSignLink1940;
	static int loginResponseOpcode = -2;
	static boolean aBoolean1942 = false;
	
	public static void method1694(byte b) {
		aClass192_1939 = null;
		aSignLink1940 = null;
		int i = -91 / ((14 - b) / 45);
	}
	
	static final Class224 method1695(boolean bool, int i, Class302 class302, String string) {
		anInt1938++;
		int i_0_ = class302.method3519(string, (byte) 84);
		if (i == (i_0_ ^ 0xffffffff)) {
			return new Class224(0);
		}
		int[] is = class302.method3532(i_0_, 0);
		Class224 class224 = new Class224(is.length);
		int i_1_ = 0;
		int i_2_ = 0;
		while (class224.anInt2670 > i_1_) {
			Buffer buffer = new Buffer(class302.method3524(false, is[i_2_++], i_0_));
			int i_3_ = buffer.method2186(74);
			int i_4_ = buffer.method2219(i ^ ~0x7c7fc37);
			int i_5_ = buffer.method2233(255);
			if (!bool && (i_5_ ^ 0xffffffff) == -2) {
				class224.anInt2670--;
			} else {
				class224.anIntArray2668[i_1_] = i_3_;
				class224.anIntArray2669[i_1_] = i_4_;
				i_1_++;
			}
		}
		return class224;
	}
}
