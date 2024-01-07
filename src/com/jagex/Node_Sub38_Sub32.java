package com.jagex;

public class Node_Sub38_Sub32 extends Node_Sub38
{
	private int anInt10424;
	private int anInt10425 = 3216;
	private int anInt10426 = 3216;
	static int anInt10427;
	static int anInt10428;
	static int anInt10429;
	static int anInt10431;
	private int[] anIntArray10432;
	static Class192 aClass192_10433 = new Class192(29, 6);
	static int anInt10434;
	static int anInt10435;
	static int anInt10436;
	
	final void method2780(boolean bool, Buffer buffer, int i) {
		anInt10429++;
		if (bool != false) {
			method2780(false, null, 34);
		}
		int i_0_ = i;
	while_263_:
		do {
			do {
				if ((i_0_ ^ 0xffffffff) != -1) {
					if ((i_0_ ^ 0xffffffff) != -2) {
						if (i_0_ == 2) {
							break;
						}
						break while_263_;
					}
				} else {
					anInt10424 = buffer.method2219(-130546744);
					return;
				}
				anInt10425 = buffer.method2219(-130546744);
				return;
			} while (false);
			anInt10426 = buffer.method2219(-130546744);
		} while (false);
	}
	
	public Node_Sub38_Sub32() {
		super(1, true);
		anInt10424 = 4096;
		anIntArray10432 = new int[3];
	}
	
	final int[] method2775(int i, int i_1_) {
		anInt10427++;
		int[] is = aClass146_7460.method1645(27356, i_1_);
		if (aClass146_7460.aBoolean1819) {
			int i_2_ = Class359.anInt4468 * anInt10424 >> 12;
			int[] is_3_ = this.method2786(r_Sub2.anInt11054 & i_1_ - 1, 0, 0);
			int[] is_4_ = this.method2786(i_1_, 0, 0);
			int[] is_5_ = this.method2786(i_1_ + 1 & r_Sub2.anInt11054, 0, 0);
			for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (Class339_Sub7.anInt8728 ^ 0xffffffff); i_6_++) {
				int i_7_ = i_2_ * (is_5_[i_6_] + -is_3_[i_6_]) >> 12;
				int i_8_ = (-is_4_[Class303.anInt3824 & i_6_ - -1] + is_4_[Class303.anInt3824 & i_6_ - 1]) * i_2_ >> 12;
				int i_9_ = i_8_ >> 4;
				if (i_9_ < 0) {
					i_9_ = -i_9_;
				}
				int i_10_ = i_7_ >> 4;
				if (i_9_ > 255) {
					i_9_ = 255;
				}
				if ((i_10_ ^ 0xffffffff) > -1) {
					i_10_ = -i_10_;
				}
				if ((i_10_ ^ 0xffffffff) < -256) {
					i_10_ = 255;
				}
				int i_11_ = Node_Sub25.aByteArray7239[i_9_ + ((1 + i_10_) * i_10_ >> 1)] & 0xff;
				int i_12_ = i_8_ * i_11_ >> 8;
				int i_13_ = i_7_ * i_11_ >> 8;
				int i_14_ = i_11_ * 4096 >> 8;
				i_12_ = anIntArray10432[0] * i_12_ >> 12;
				i_13_ = anIntArray10432[1] * i_13_ >> 12;
				i_14_ = i_14_ * anIntArray10432[2] >> 12;
				is[i_6_] = i_14_ + i_13_ + i_12_;
			}
		}
		if (i < 107) {
			method2896((byte) 87);
		}
		return is;
	}
	
	static final int method2894(int i, int i_15_, int i_16_, int i_17_) {
		anInt10435++;
		if (i_16_ != 929798380) {
			return 77;
		}
		if ((i_17_ ^ 0xffffffff) <= (i ^ 0xffffffff)) {
			if (i_15_ < i_17_) {
				return i_15_;
			}
			return i_17_;
		}
		return i;
	}
	
	public static void method2895(boolean bool) {
		if (bool == true) {
			aClass192_10433 = null;
			RS2Loader.js5Modulus = null;
		}
	}
	
	private final void method2896(byte b) {
		anInt10434++;
		double d = Math.cos((double) ((float) anInt10426 / 4096.0F));
		anIntArray10432[0] = (int) (d * Math.sin((double) ((float) anInt10425 / 4096.0F)) * 4096.0);
		if (b > -113) {
			method2895(true);
		}
		anIntArray10432[1] = (int) (4096.0 * (d * Math.cos((double) ((float) anInt10425 / 4096.0F))));
		anIntArray10432[2] = (int) (4096.0 * Math.sin((double) ((float) anInt10426 / 4096.0F)));
		int i = anIntArray10432[0] * anIntArray10432[0] >> 12;
		int i_18_ = anIntArray10432[1] * anIntArray10432[1] >> 12;
		int i_19_ = anIntArray10432[2] * anIntArray10432[2] >> 12;
		int i_20_ = (int) (Math.sqrt((double) (i + (i_18_ + i_19_) >> 12)) * 4096.0);
		if ((i_20_ ^ 0xffffffff) != -1) {
			anIntArray10432[0] = (anIntArray10432[0] << 12) / i_20_;
			anIntArray10432[1] = (anIntArray10432[1] << 12) / i_20_;
			anIntArray10432[2] = (anIntArray10432[2] << 12) / i_20_;
		}
	}
	
	final void method2785(int i) {
		if (i != 7) {
			anInt10426 = 8;
		}
		anInt10431++;
		method2896((byte) -119);
	}
	
	static final void method2897(int i) {
		if (Class143.aByteArray1773 == null) {
			if (Class336_Sub2.anInt8586 == -1) {
				Node_Sub14.method2553(Node_Sub5.aString7030, Node_Sub38_Sub23.anInt10347, Class243.aString3076, 2);
			} else {
				Class320_Sub3.method3690(-11055, Node_Sub38_Sub23.anInt10347);
			}
		} else {
			Class328.method3829(Node_Sub38_Sub23.anInt10347, -11951);
		}
		if (i != 29) {
			method2895(false);
		}
		anInt10428++;
	}
}
