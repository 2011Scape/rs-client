package com.jagex;

public class Class142
{
	static int[] anIntArray1759 = new int[2];
	protected int anInt1760;
	static int anInt1761;
	private Class302 aClass302_1762;
	static int anInt1763;
	
	public static void method1619(boolean bool) {
		anIntArray1759 = null;
		if (bool != false) {
			anIntArray1759 = null;
		}
	}
	
	static final void method1620(boolean bool, int i, int i_0_, int i_1_, String string) {
		anInt1763++;
		int i_2_ = -5 % ((i - 67) / 48);
		FixedAnimator.method258(false, (byte) -50, bool, i_0_, i_1_, string, null);
	}
	
	Class142(Class353 class353, int i, Class302 class302) {
		new Class61(64);
		aClass302_1762 = class302;
		anInt1760 = aClass302_1762.method3537(-2, 15);
	}
	
	static final void method1621(Packet packet, int i) {
		anInt1761++;
		packet.method2261(107347906);
		int i_3_ = 0;
		for (int i_4_ = 0; Class178.anInt2120 > i_4_; i_4_++) {
			int i_5_ = Class66_Sub1.anIntArray8987[i_4_];
			if ((Class215.aByteArray2538[i_5_] & 0x1 ^ 0xffffffff) == -1) {
				if (i_3_ > 0) {
					Class215.aByteArray2538[i_5_] = (byte) Node_Sub16.method2590(Class215.aByteArray2538[i_5_], 2);
					i_3_--;
				} else {
					int i_6_ = packet.method2256((byte) 45, 1);
					if (i_6_ == 0) {
						i_3_ = Node_Sub5.method2268(packet, -24974);
						Class215.aByteArray2538[i_5_] = (byte) Node_Sub16.method2590(Class215.aByteArray2538[i_5_], 2);
					} else {
						Class324.method3812(i_5_, packet, i ^ 0x75);
					}
				}
			}
		}
		packet.method2255(i + -1431454112);
		if (i_3_ != 0) {
			throw new RuntimeException("nsn0");
		}
		packet.method2261(i + 107347904);
		for (int i_7_ = 0; i_7_ < Class178.anInt2120; i_7_++) {
			int i_8_ = Class66_Sub1.anIntArray8987[i_7_];
			if ((0x1 & Class215.aByteArray2538[i_8_]) != 0) {
				if (i_3_ > 0) {
					i_3_--;
					Class215.aByteArray2538[i_8_] = (byte) Node_Sub16.method2590(Class215.aByteArray2538[i_8_], 2);
				} else {
					int i_9_ = packet.method2256((byte) 126, 1);
					if ((i_9_ ^ 0xffffffff) == -1) {
						i_3_ = Node_Sub5.method2268(packet, -24974);
						Class215.aByteArray2538[i_8_] = (byte) Node_Sub16.method2590(Class215.aByteArray2538[i_8_], 2);
					} else {
						Class324.method3812(i_8_, packet, i + 40);
					}
				}
			}
		}
		packet.method2255(-1431454110);
		if ((i_3_ ^ 0xffffffff) != -1) {
			throw new RuntimeException("nsn1");
		}
		packet.method2261(i + 107347904);
		for (int i_10_ = 0; i_10_ < Class35.anInt538; i_10_++) {
			int i_11_ = Node_Sub38_Sub19.anIntArray10292[i_10_];
			if ((Class215.aByteArray2538[i_11_] & 0x1) != 0) {
				if ((i_3_ ^ 0xffffffff) < -1) {
					Class215.aByteArray2538[i_11_] = (byte) Node_Sub16.method2590(Class215.aByteArray2538[i_11_], 2);
					i_3_--;
				} else {
					int i_12_ = packet.method2256((byte) -125, 1);
					if (i_12_ == 0) {
						i_3_ = Node_Sub5.method2268(packet, -24974);
						Class215.aByteArray2538[i_11_] = (byte) Node_Sub16.method2590(Class215.aByteArray2538[i_11_], 2);
					} else if (Class339_Sub5.method3935(i_11_, packet, 28460)) {
						Class215.aByteArray2538[i_11_] = (byte) Node_Sub16.method2590(Class215.aByteArray2538[i_11_], 2);
					}
				}
			}
		}
		packet.method2255(-1431454110);
		if (i_3_ != 0) {
			throw new RuntimeException("nsn2");
		}
		packet.method2261(107347906);
		if (i != 2) {
			anIntArray1759 = null;
		}
		for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > (Class35.anInt538 ^ 0xffffffff); i_13_++) {
			int i_14_ = Node_Sub38_Sub19.anIntArray10292[i_13_];
			if ((0x1 & Class215.aByteArray2538[i_14_]) == 0) {
				if ((i_3_ ^ 0xffffffff) < -1) {
					i_3_--;
					Class215.aByteArray2538[i_14_] = (byte) Node_Sub16.method2590(Class215.aByteArray2538[i_14_], 2);
				} else {
					int i_15_ = packet.method2256((byte) 47, 1);
					if (i_15_ == 0) {
						i_3_ = Node_Sub5.method2268(packet, -24974);
						Class215.aByteArray2538[i_14_] = (byte) Node_Sub16.method2590(Class215.aByteArray2538[i_14_], 2);
					} else if (Class339_Sub5.method3935(i_14_, packet, 28460)) {
						Class215.aByteArray2538[i_14_] = (byte) Node_Sub16.method2590(Class215.aByteArray2538[i_14_], 2);
					}
				}
			}
		}
		packet.method2255(-1431454110);
		if (i_3_ != 0) {
			throw new RuntimeException("nsn3");
		}
		Class35.anInt538 = 0;
		Class178.anInt2120 = 0;
		for (int i_16_ = 1; i_16_ < 2048; i_16_++) {
			Class215.aByteArray2538[i_16_] >>= 1;
			Player player = Class270_Sub2.aPlayerArray8038[i_16_];
			if (player == null) {
				Node_Sub38_Sub19.anIntArray10292[Class35.anInt538++] = i_16_;
			} else {
				Class66_Sub1.anIntArray8987[Class178.anInt2120++] = i_16_;
			}
		}
	}
}
