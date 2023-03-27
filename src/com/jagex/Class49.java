package com.jagex;

public class Class49
{
	static int anInt719;
	static int anInt720;
	protected Class52 aClass52_721 = null;
	protected Class357 aClass357_722 = null;
	
	static final void method484(byte b, Class302 class302, Class302 class302_0_, int[] is) {
		Class294.aClass302_3690 = class302_0_;
		Class188_Sub1.aClass302_6849 = class302;
		anInt720++;
		if (is != null) {
			Class291.anIntArray3665 = is;
		}
		if (b > 68) {
			/* empty */
		}
	}
	
	static final void method485(byte b) {
		anInt719++;
		int i = Class178.anInt2120;
		int[] is = Class66_Sub1.anIntArray8987;
		if (b == -59) {
			for (int i_1_ = 0; i > i_1_; i_1_++) {
				Player player = Class270_Sub2.aPlayerArray8038[is[i_1_]];
				if (player != null) {
					r_Sub2.method2375(false, (byte) -49, player);
				}
			}
		}
	}
	
	Class49(Class52 class52) {
		aClass52_721 = class52;
	}
	
	Class49(Class52 class52, Class357 class357) {
		aClass52_721 = class52;
		aClass357_722 = class357;
	}
}
