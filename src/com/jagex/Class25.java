package com.jagex;
import jaggl.OpenGL;

public class Class25
{
	static int anInt444;
	static int anInt445;
	static int anInt446 = 0;
	private int anInt447;
	static int anInt448;
	static int anInt449;
	static int anInt450;
	static int anInt451;
	static int anInt452 = 0;
	
	static final void method306(int i, int i_0_, long l, int i_1_) {
		anInt449++;
		int i_2_ = (0x7d32b & (int) l) >> 14;
		int i_3_ = ((int) l & 0x3b48d1) >> 20;
		if (i < -4) {
			int i_4_ = 0x7fffffff & (int) (l >>> 32);
			if (i_2_ != 10 && i_2_ != 11 && (i_2_ ^ 0xffffffff) != -23) {
				Class78.method778(i_3_, i_1_, 0, true, i_0_, 0, i_2_, 48, 0);
			} else {
				ObjectDefinition objectdefinition = Class186.aClass112_2256.method1145(i_4_, 63);
				int i_5_;
				int i_6_;
				if ((i_3_ ^ 0xffffffff) == -1 || i_3_ == 2) {
					i_5_ = objectdefinition.anInt3055;
					i_6_ = objectdefinition.anInt2986;
				} else {
					i_5_ = objectdefinition.anInt2986;
					i_6_ = objectdefinition.anInt3055;
				}
				int i_7_ = objectdefinition.anInt3040;
				if (i_3_ != 0) {
					i_7_ = (0xf & i_7_ << i_3_) - -(i_7_ >> -i_3_ + 4);
				}
				Class78.method778(0, i_1_, i_6_, true, i_0_, i_7_, 0, 127, i_5_);
			}
		}
	}
	
	final void method307(int i, int i_8_) {
		OpenGL.glNewList(anInt447 + i, i_8_);
		anInt445++;
	}
	
	static final long method308(int i, boolean bool) {
		anInt451++;
		if (bool != false) {
			return -106L;
		}
		return 86400000L * (long) (11745 + i);
	}
	
	final void method309(boolean bool) {
		anInt448++;
		OpenGL.glEndList();
		if (bool != false) {
			anInt447 = 43;
		}
	}
	
	final void method310(char c, byte b) {
		if (b >= -13) {
			method309(false);
		}
		anInt450++;
		OpenGL.glCallList(c + anInt447);
	}
	
	Class25(GLToolkit gltoolkit, int i) {
		anInt447 = OpenGL.glGenLists(i);
	}
}
