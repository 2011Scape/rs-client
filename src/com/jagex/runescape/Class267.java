package com.jagex.runescape;

public class Class267
{
	protected boolean aBoolean3442 = true;
	protected int anInt3443;
	private char aChar3444;
	static Class318 aClass318_3445 = new Class318(12, 5);
	static int anInt3446;
	static int anInt3447;
	static int anInt3448;
	static Class266 aClass266_3449;
	protected String aString3450;
	
	public static void method3286(byte b) {
		if (b == -20) {
			aClass318_3445 = null;
			aClass266_3449 = null;
		}
	}
	
	final boolean method3287(byte b) {
		anInt3448++;
		int i = 83 / ((38 - b) / 60);
        return aChar3444 == 115;
    }
	
	final void method3288(Buffer buffer, byte b) {
		for (;;) {
			int i = buffer.readUnsignedByte();
			if (i == 0) {
				break;
			}
			method3289(b ^ 0x21, i, buffer);
		}
		if (b == 87) {
			anInt3446++;
		}
	}
	
	private final void method3289(int i, int i_0_, Buffer buffer) {
		if (i <= 92) {
			aChar3444 = '0';
		}
		if (i_0_ != 1) {
			if (i_0_ == 2) {
				anInt3443 = buffer.readInt();
			} else if (i_0_ == 4) {
				aBoolean3442 = false;
			} else if (i_0_ == 5) {
				aString3450 = buffer.readString();
			}
		} else {
			aChar3444 = Class20_Sub1.method294(buffer.readByte(), (byte) 124);
		}
		anInt3447++;
	}
}
