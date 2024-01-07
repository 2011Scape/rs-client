package com.jagex;

public class Class262_Sub7 extends Class262
{
	static int anInt7749;
	static Class192 aClass192_7750 = new Class192(131, -1);
	private int anInt7751;
	private String aString7752;
	
	Class262_Sub7(Buffer buffer) {
		super(buffer);
		aString7752 = buffer.method2195(-1);
		anInt7751 = buffer.method2219(-130546744);
	}
	
	final void method3148(int i) {
		if (i <= -102) {
			if ((Class200_Sub2.anInt4935 ^ 0xffffffff) != 0) {
				Class305.method3563(Class200_Sub2.anInt4935, aString7752, anInt7751);
			}
			anInt7749++;
		}
	}
	
	public static void method3167(boolean bool) {
		if (bool != false) {
			method3167(false);
		}
		aClass192_7750 = null;
	}
}
