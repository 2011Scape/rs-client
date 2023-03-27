package com.jagex;

public class Class262_Sub3 extends Class262
{
	private int anInt7711;
	private int anInt7712;
	static int[] anIntArray7713 = new int[5];
	private int anInt7714;
	static Class302 aClass302_7715;
	static int anInt7716;
	private int anInt7717;
	private int anInt7718;
	static int anInt7719;
	static int anInt7720;
	
	static final int method3156(int i) {
		if (i < 56) {
			return 118;
		}
		anInt7719++;
		return Class251.anInt3185;
	}
	
	Class262_Sub3(Buffer buffer) {
		super(buffer);
		anInt7718 = buffer.method2219(-130546744);
		int i = buffer.method2186(-123);
		anInt7711 = i >>> 16;
		anInt7714 = 0xffff & i;
		anInt7712 = buffer.method2233(255);
		anInt7717 = buffer.method2197(-129);
	}
	
	static final boolean method3157(int i, byte b) {
		if (b != 28) {
			return false;
		}
		anInt7720++;
		if (i != 1 && (i ^ 0xffffffff) != -4 && i != 5) {
			return false;
		}
		return true;
	}
	
	public static void method3158(int i) {
		aClass302_7715 = null;
		if (i == 1) {
			anIntArray7713 = null;
		}
	}
	
	final void method3148(int i) {
		Class121.aClass206Array1529[anInt7718].method2038((byte) 67, anInt7717, anInt7712, anInt7711, anInt7714);
		if (i > -102) {
			method3156(-127);
		}
		anInt7716++;
	}
}
