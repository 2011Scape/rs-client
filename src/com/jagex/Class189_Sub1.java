package com.jagex;
import java.io.IOException;

public class Class189_Sub1 extends Class189
{
	static int anInt6879;
	private Class302 aClass302_6880;
	private int anInt6881;
	static Class257 aClass257_6882 = new Class257(8, 7);
	private Buffer aBuffer6883;
	private byte[][] aByteArrayArray6884 = new byte[10][];
	static int anInt6885;
	private int[] anIntArray6886;
	static Class329 aClass329_6887 = new Class329("WTRC", "office", "_rc", 1);
	private int anInt6888;
	private Buffer aBuffer6889;
	
	public static void method1936(int i) {
		if (i == 1) {
			aClass257_6882 = null;
			aClass329_6887 = null;
		}
	}
	
	Class189_Sub1(int i, Class302 class302, int i_0_) {
		super(i);
		aBuffer6883 = new Buffer(null);
		aBuffer6889 = new Buffer(null);
		aClass302_6880 = class302;
		anInt6881 = i_0_;
	}
	
	final void method1937(int i) {
		anInt6879++;
		if (anIntArray6886 != null) {
			for (int i_1_ = 0; i_1_ < 10; i_1_++) {
				if ((i_1_ + anInt6888 ^ 0xffffffff) <= (anIntArray6886.length ^ 0xffffffff)) {
					break;
				}
				if (aByteArrayArray6884[i_1_] == null && aClass302_6880.method3515(0, anIntArray6886[anInt6888 - -i_1_], 0)) {
					aByteArrayArray6884[i_1_] = aClass302_6880.method3524(false, 0, anIntArray6886[anInt6888 + i_1_]);
				}
			}
			if (i < 93) {
				aByteArrayArray6884 = null;
			}
		}
	}
	
	final int method1929(byte[] bs, int i) throws IOException {
		anInt6885++;
		if (anIntArray6886 == null) {
			if (!aClass302_6880.method3515(0, anInt6881, 0)) {
				return 0;
			}
			byte[] bs_2_ = aClass302_6880.method3524(false, 0, anInt6881);
			if (bs_2_ == null) {
				throw new IllegalStateException("");
			}
			aBuffer6889.aByteArray7019 = bs_2_;
			aBuffer6889.anInt7002 = 0;
			int i_3_ = bs_2_.length >> 1;
			anIntArray6886 = new int[i_3_];
			for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff); i_4_++)
				anIntArray6886[i_4_] = aBuffer6889.method2219(-130546744);
		}
		if ((anInt6888 ^ 0xffffffff) <= (anIntArray6886.length ^ 0xffffffff)) {
			return -1;
		}
		method1937(103);
		aBuffer6889.aByteArray7019 = bs;
		aBuffer6889.anInt7002 = 0;
		while ((aBuffer6889.anInt7002 ^ 0xffffffff) > (aBuffer6889.aByteArray7019.length ^ 0xffffffff)) {
			if (aBuffer6883.aByteArray7019 == null) {
				if (aByteArrayArray6884[0] == null) {
					aBuffer6889.aByteArray7019 = null;
					return aBuffer6889.anInt7002;
				}
				aBuffer6883.aByteArray7019 = aByteArrayArray6884[0];
			}
			int i_5_ = -aBuffer6889.anInt7002 + aBuffer6889.aByteArray7019.length;
			int i_6_ = -aBuffer6883.anInt7002 + aBuffer6883.aByteArray7019.length;
			if ((i_6_ ^ 0xffffffff) >= (i_5_ ^ 0xffffffff)) {
				aBuffer6889.method2223(i_6_, (byte) 4, aBuffer6883.aByteArray7019, aBuffer6883.anInt7002);
				aBuffer6883.anInt7002 = 0;
				anInt6888++;
				aBuffer6883.aByteArray7019 = null;
				for (int i_7_ = 0; i_7_ < 9; i_7_++)
					aByteArrayArray6884[i_7_] = aByteArrayArray6884[1 + i_7_];
				aByteArrayArray6884[9] = null;
				if ((anIntArray6886.length ^ 0xffffffff) >= (anInt6888 ^ 0xffffffff)) {
					aBuffer6889.aByteArray7019 = null;
					return aBuffer6889.anInt7002;
				}
			} else {
				aBuffer6883.method2181(aBuffer6889.anInt7002, i_5_, aBuffer6889.aByteArray7019, -19417);
				aBuffer6889.aByteArray7019 = null;
				return bs.length;
			}
		}
		if (i != 1) {
			anInt6888 = 98;
		}
		aBuffer6889.aByteArray7019 = null;
		return bs.length;
	}
}
