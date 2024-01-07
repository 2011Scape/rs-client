package com.jagex;

public class Node_Sub35 extends Node
{
	static int anInt7412;
	protected int anInt7413;
	static int anInt7414;
	static int anInt7415;
	static int anInt7416;
	static int anInt7417;
	protected int anInt7418;
	static int anInt7419;
	static Class192 aClass192_7420 = new Class192(140, -2);
	static Class135 aClass135_7421 = new Class135();
	
	final int method2743(int i) {
		anInt7415++;
		if (i >= -20) {
			anInt7413 = -17;
		}
		return Animable_Sub4.method925(anInt7418, 34933);
	}
	
	final boolean method2744(byte b) {
		anInt7416++;
		if (b < 70) {
			return true;
		}
		if ((0x1 & anInt7418 >> 22) == 0) {
			return false;
		}
		return true;
	}
	
	final int method2745(int i) {
		if (i > -70) {
			aClass192_7420 = null;
		}
		anInt7414++;
		return (0x1d36c1 & anInt7418) >> 18;
	}
	
	final boolean method2746(int i) {
		if (i != 9336) {
			method2743(115);
		}
		anInt7419++;
		if ((0x1 & anInt7418 ^ 0xffffffff) == -1) {
			return false;
		}
		return true;
	}
	
	final boolean method2747(int i) {
		if (i != 1) {
			anInt7418 = -80;
		}
		anInt7412++;
		if ((0x1 & anInt7418 >> 21) == 0) {
			return false;
		}
		return true;
	}
	
	final boolean method2748(byte b, int i) {
		if (b >= -33) {
			return true;
		}
		anInt7417++;
		if ((0x1 & anInt7418 >> i + 1) == 0) {
			return false;
		}
		return true;
	}
	
	public static void method2749(int i) {
		aClass135_7421 = null;
		aClass192_7420 = null;
		if (i != 1914561) {
			method2749(-83);
		}
	}
	
	Node_Sub35(int i, int i_0_) {
		anInt7413 = i_0_;
		anInt7418 = i;
	}
}
