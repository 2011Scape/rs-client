package com.jagex;

public class Class129
{
	static int[] anIntArray1661 = { 104, 120, 136, 168 };
	protected int anInt1662;
	static float aFloat1663;
	static int anInt1664;
	static short[] aShortArray1665;
	static int anInt1666;
	static int anInt1667;
	static int anInt1668;
	static int[] anIntArray1669 = new int[4];
	
	static final Class357 method1553(int i, int i_0_, Class302 class302) {
		anInt1667++;
		byte[] bs = class302.method3518((byte) 118, i_0_);
		if (bs == null) {
			return null;
		}
		if (i != -1) {
			return null;
		}
		return new Class357(bs);
	}
	
	final int method1554(boolean bool) {
		if (bool != false) {
			anIntArray1661 = null;
		}
		anInt1666++;
		return anInt1662;
	}
	
	public static void method1555(int i) {
		anIntArray1669 = null;
		int i_1_ = 104 % ((16 - i) / 42);
		anIntArray1661 = null;
		aShortArray1665 = null;
	}
	
	static final void method1556(boolean bool, String string, boolean bool_2_, boolean bool_3_, String string_4_) {
		if (!bool_3_) {
			Class336_Sub2.anInt8586 = -1;
		}
		Node_Sub5.aString7030 = string_4_;
		Class243.aString3076 = string;
		FixedAnimator.aBoolean5503 = bool;
		Class296.aBoolean5428 = bool_3_;
		anInt1664++;
		if (!Class296.aBoolean5428 && (Class243.aString3076.equals("") || Node_Sub5.aString7030.equals(""))) {
			Animable_Sub2.method836(3, true);
		} else {
			Class320_Sub23.aClass123_8432.aBoolean1580 = false;
			if (Class159.anInt1996 != 1) {
				FileOnDisk.anInt1326 = 0;
				GameStub.anInt45 = -1;
				Class187.anInt2276 = -1;
			}
			Animable_Sub2.method836(-3, bool_2_);
			Node_Sub38_Sub8.anInt10163 = 1;
			Class262_Sub12.anInt7791 = 0;
			Class45.anInt5264 = 0;
		}
	}
	
	public final String toString() {
		anInt1668++;
		throw new IllegalStateException();
	}
	
	Class129(String string, int i) {
		anInt1662 = i;
	}
	
	static {
		aShortArray1665 = new short[256];
	}
}
