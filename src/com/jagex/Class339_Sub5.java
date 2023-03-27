package com.jagex;
import jaggl.OpenGL;

public class Class339_Sub5 extends Class339
{
	static int anInt8681;
	static int anInt8682;
	static int anInt8683;
	static int anInt8684 = -1;
	static Class192 aClass192_8685 = new Class192(50, -2);
	static int anInt8686;
	static int anInt8687;
	private Class301 aClass301_8688;
	static int anInt8689;
	static int anInt8690;
	static int anInt8691;
	private Class25 aClass25_8692;
	
	static final boolean method3935(int i, Packet packet, int i_0_) {
		if (i_0_ != 28460) {
			method3937((byte) 38, -89, -42);
		}
		anInt8681++;
		int i_1_ = packet.method2256((byte) -9, 2);
		if ((i_1_ ^ 0xffffffff) == -1) {
			if ((packet.method2256((byte) -128, 1) ^ 0xffffffff) != -1) {
				method3935(i, packet, 28460);
			}
			int i_2_ = packet.method2256((byte) -127, 6);
			int i_3_ = packet.method2256((byte) 81, 6);
			boolean bool = (packet.method2256((byte) 125, 1) ^ 0xffffffff) == -2;
			if (bool) {
				Node_Sub23_Sub1.anIntArray9928[Node_Sub9_Sub4.anInt9733++] = i;
			}
			if (Class270_Sub2.aPlayerArray8038[i] != null) {
				throw new RuntimeException("hr:lr");
			}
			Class323 class323 = Class320_Sub10.aClass323Array8296[i];
			Player player = Class270_Sub2.aPlayerArray8038[i] = new Player();
			player.anInt10858 = i;
			if (Class249.aBufferArray3154[i] != null) {
				player.method889(Class249.aBufferArray3154[i], 0);
			}
			player.method849(class323.anInt4079, -73, true);
			player.anInt10838 = class323.anInt4074;
			int i_4_ = class323.anInt4077;
			int i_5_ = i_4_ >> 28;
			int i_6_ = i_4_ >> 14 & 0xff;
			int i_7_ = i_4_ & 0xff;
			int i_8_ = (i_6_ << 6) + (i_2_ - Node_Sub53.anInt7668);
			player.aBoolean11135 = class323.aBoolean4082;
			int i_9_ = (i_7_ << 6) + i_3_ - Class320_Sub4.anInt8243;
			player.aBoolean11157 = class323.aBoolean4076;
			player.aByteArray10905[0] = Class73.aByteArray981[i];
			player.aByte5933 = player.aByte5931 = (byte) i_5_;
			if (Class238.method3021(i_9_, i_8_, -87)) {
				player.aByte5931++;
			}
			player.method888(i_8_, -100, i_9_);
			player.aBoolean11156 = false;
			Class320_Sub10.aClass323Array8296[i] = null;
			return true;
		}
		if ((i_1_ ^ 0xffffffff) == -2) {
			int i_10_ = packet.method2256((byte) -126, 2);
			int i_11_ = Class320_Sub10.aClass323Array8296[i].anInt4077;
			Class320_Sub10.aClass323Array8296[i].anInt4077 = ((0x3 & (i_11_ >> 28) + i_10_) << 28) + (i_11_ & 0xfffffff);
			return false;
		}
		if (i_1_ == 2) {
			int i_12_ = packet.method2256((byte) -124, 5);
			int i_13_ = i_12_ >> 3;
			int i_14_ = i_12_ & 0x7;
			int i_15_ = Class320_Sub10.aClass323Array8296[i].anInt4077;
			int i_16_ = 0x3 & (i_15_ >> 28) - -i_13_;
			int i_17_ = i_15_ >> 14 & 0xff;
			int i_18_ = 0xff & i_15_;
			if (i_14_ == 0) {
				i_18_--;
				i_17_--;
			}
			if ((i_14_ ^ 0xffffffff) == -2) {
				i_18_--;
			}
			if (i_14_ == 2) {
				i_17_++;
				i_18_--;
			}
			if ((i_14_ ^ 0xffffffff) == -4) {
				i_17_--;
			}
			if (i_14_ == 4) {
				i_17_++;
			}
			if ((i_14_ ^ 0xffffffff) == -6) {
				i_17_--;
				i_18_++;
			}
			if (i_14_ == 6) {
				i_18_++;
			}
			if (i_14_ == 7) {
				i_17_++;
				i_18_++;
			}
			Class320_Sub10.aClass323Array8296[i].anInt4077 = i_18_ + ((i_17_ << 14) + (i_16_ << 28));
			return false;
		}
		int i_19_ = packet.method2256((byte) -127, 18);
		int i_20_ = i_19_ >> 16;
		int i_21_ = i_19_ >> 8 & 0xff;
		int i_22_ = 0xff & i_19_;
		int i_23_ = Class320_Sub10.aClass323Array8296[i].anInt4077;
		int i_24_ = i_20_ + (i_23_ >> 28) & 0x3;
		int i_25_ = 0xff & i_21_ + (i_23_ >> 14);
		int i_26_ = 0xff & i_23_ - -i_22_;
		Class320_Sub10.aClass323Array8296[i].anInt4077 = i_26_ + ((i_25_ << 14) + (i_24_ << 28));
		return false;
	}
	
	final void method3920(int i, boolean bool) {
		if (i != -1) {
			method3923(false, -21);
		}
		anInt8690++;
	}
	
	Class339_Sub5(GLToolkit gltoolkit, Class301 class301) {
		super(gltoolkit);
		aClass301_8688 = class301;
		aClass25_8692 = new Class25(gltoolkit, 2);
		aClass25_8692.method307(0, 4864);
		aGLToolkit4202.method1457(33984, 1);
		if (aClass301_8688.aBoolean3780) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		aGLToolkit4202.method1457(33984, 0);
		aClass25_8692.method309(false);
		aClass25_8692.method307(1, 4864);
		aGLToolkit4202.method1457(33984, 1);
		if (aClass301_8688.aBoolean3780) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		aGLToolkit4202.method1457(33984, 0);
		aClass25_8692.method309(false);
	}
	
	final boolean method3922(byte b) {
		if (b > -44) {
			return false;
		}
		anInt8683++;
		return true;
	}
	
	public static void method3936(int i) {
		if (i <= 111) {
			method3936(-111);
		}
		aClass192_8685 = null;
	}
	
	final void method3917(Class169 class169, int i, int i_27_) {
		aGLToolkit4202.method1444(-2, class169);
		if (i_27_ != -28289) {
			method3922((byte) 64);
		}
		anInt8687++;
		aGLToolkit4202.method1434((byte) -57, i);
	}
	
	final void method3918(int i) {
		aClass25_8692.method310('\001', (byte) -48);
		if (i != 20937) {
			aClass192_8685 = null;
		}
		anInt8691++;
		aGLToolkit4202.method1457(i ^ 0xd509, 1);
		aGLToolkit4202.method1444(-2, null);
		aGLToolkit4202.method1457(33984, 0);
	}
	
	final void method3923(boolean bool, int i) {
		aClass25_8692.method310('\0', (byte) -75);
		if (i != 0) {
			anInt8684 = 111;
		}
		anInt8682++;
		if (aClass301_8688.aBoolean3780) {
			aGLToolkit4202.method1457(33984, 1);
			aGLToolkit4202.method1444(-2, aClass301_8688.aClass169_Sub3_3776);
			aGLToolkit4202.method1457(33984, 0);
		}
	}
	
	final void method3919(int i, int i_28_, int i_29_) {
		anInt8689++;
		float f = -5.0E-4F * (float) (1 + (i_29_ & 0x3));
		float f_30_ = (float) ((0x3 & i_29_ >> 3) + 1) * 5.0E-4F;
		float f_31_ = (i_29_ & 0x40 ^ 0xffffffff) == -1 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (0x80 & i_29_ ^ 0xffffffff) != -1;
		aGLToolkit4202.method1457(i + 47421, 1);
		if (bool) {
			Class290_Sub11.aFloatArray8183[1] = 0.0F;
			Class290_Sub11.aFloatArray8183[2] = 0.0F;
			Class290_Sub11.aFloatArray8183[0] = f_31_;
			Class290_Sub11.aFloatArray8183[3] = 0.0F;
		} else {
			Class290_Sub11.aFloatArray8183[1] = 0.0F;
			Class290_Sub11.aFloatArray8183[0] = 0.0F;
			Class290_Sub11.aFloatArray8183[3] = 0.0F;
			Class290_Sub11.aFloatArray8183[2] = f_31_;
		}
		OpenGL.glTexGenfv(8192, 9474, Class290_Sub11.aFloatArray8183, 0);
		Class290_Sub11.aFloatArray8183[2] = 0.0F;
		if (i == -13437) {
			Class290_Sub11.aFloatArray8183[1] = f_31_;
			Class290_Sub11.aFloatArray8183[0] = 0.0F;
			Class290_Sub11.aFloatArray8183[3] = (float) aGLToolkit4202.anInt6605 * f % 1.0F;
			OpenGL.glTexGenfv(8193, 9474, Class290_Sub11.aFloatArray8183, 0);
			if (!aClass301_8688.aBoolean3780) {
				int i_32_ = (int) (16.0F * ((float) aGLToolkit4202.anInt6605 * f_30_));
				aGLToolkit4202.method1444(-2, aClass301_8688.aClass169_Sub2Array3779[i_32_ % 16]);
			} else {
				Class290_Sub11.aFloatArray8183[3] = (float) aGLToolkit4202.anInt6605 * f_30_ % 1.0F;
				Class290_Sub11.aFloatArray8183[0] = 0.0F;
				Class290_Sub11.aFloatArray8183[1] = 0.0F;
				Class290_Sub11.aFloatArray8183[2] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Class290_Sub11.aFloatArray8183, 0);
			}
			aGLToolkit4202.method1457(33984, 0);
		}
	}
	
	static final boolean method3937(byte b, int i, int i_33_) {
		anInt8686++;
		if (b != -97) {
			return false;
		}
		if (!((0x800 & i_33_) != 0 | Class294.method3466(i_33_, b + 96, i)) && !Node_Sub41.method2932(b ^ 0x5, i_33_, i)) {
			return false;
		}
		return true;
	}
}
