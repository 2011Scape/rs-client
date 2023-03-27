package com.jagex;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStream_Sub1 extends OutputStream
{
	static Class124 aClass124_88 = new Class124(53);
	static int anInt89;
	static int anInt90;
	static int anInt91;
	
	OutputStream_Sub1() {
		/* empty */
	}
	
	static final void method134(byte b, Packet packet, int i) {
		anInt91++;
		int i_0_ = 109 / ((b - -49) / 58);
		Node_Sub9_Sub4.anInt9733 = 0;
		Class189.aBoolean2318 = false;
		Class142.method1621(packet, 2);
		CacheNode_Sub14_Sub2.method2355(packet, (byte) -117);
		if (Class189.aBoolean2318) {
			System.out.println("---endgpp---");
		}
		if ((packet.anInt7002 ^ 0xffffffff) != (i ^ 0xffffffff)) {
			throw new RuntimeException("gpi1 pos:" + packet.anInt7002 + " psize:" + i);
		}
	}
	
	public final void write(int i) throws IOException {
		anInt89++;
		throw new IOException();
	}
	
	public static void method135(byte b) {
		if (b >= -7) {
			aClass124_88 = null;
		}
		aClass124_88 = null;
	}
	
	static final String method136(int i, String string) {
		anInt90++;
		if (Class223.aString2660.startsWith("win")) {
			return string + ".dll";
		}
		if (!Class223.aString2660.startsWith("linux")) {
			if (Class223.aString2660.startsWith("mac")) {
				return "lib" + string + ".dylib";
			}
		} else {
			return "lib" + string + ".so";
		}
		int i_1_ = 35 / ((i - 66) / 55);
		return null;
	}
}
