package com.jagex.runescape;

public class Class262_Sub12 extends Class262
{
	static Class124 aClass124_7785 = new Class124(70);
	private int anInt7786;
	static int anInt7787;
	static Class318 aClass318_7788 = new Class318(3, 4);
	private int anInt7789;
	private Node_Sub4 aNode_Sub4_7790;
	static int anInt7791 = 0;
	static int anInt7792;
	static String[] aStringArray7793 = new String[200];
	
	Class262_Sub12(Buffer buffer) {
		super(buffer);
		anInt7786 = buffer.readUnsignedShort();
		anInt7789 = buffer.readUnsignedByte();
	}
	
	final boolean method3145(boolean bool) {
		if (aNode_Sub4_7790 == null) {
			aNode_Sub4_7790 = Node_Sub4.method2173(SeekableFile.aClass302_3881, anInt7786, 0);
		}
		anInt7792++;
		if (aNode_Sub4_7790 == null) {
			return false;
		}
		if (bool != true) {
			return true;
		}
        return FixedAnimator.method257(aNode_Sub4_7790, 0);
    }
	
	public static void method3180(int i) {
		aStringArray7793 = null;
		aClass124_7785 = null;
		aClass318_7788 = null;
	}
	
	final void method3148(int i) {
		anInt7787++;
		if (i <= -102) {
			Node_Sub38_Sub37.method2908((byte) 66, aNode_Sub4_7790, anInt7789);
		}
	}
}
