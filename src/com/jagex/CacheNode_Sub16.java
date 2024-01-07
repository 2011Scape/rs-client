package com.jagex;
import java.applet.Applet;

abstract class CacheNode_Sub16 extends CacheNode
{
	protected boolean aBoolean9597;
	protected boolean aBoolean9598;
	static Class318 aClass318_9599 = new Class318(24, 7);
	static Class312 aClass312_9600 = new Class312();
	static Applet anApplet9601;
	volatile boolean aBoolean9602 = true;
	
	public static void method2384(byte b) {
		anApplet9601 = null;
		aClass318_9599 = null;
		if (b == 63) {
			aClass312_9600 = null;
		}
	}
	
	abstract byte[] method2385(int i);
	
	abstract int method2386(byte b);
	
	public CacheNode_Sub16() {
		/* empty */
	}
}
