package com.jagex;

public class Class6
{
	private SeekableFile aSeekableFile134 = null;
	static int[] anIntArray135 = new int[2];
	static Class192 aClass192_136 = new Class192(98, 6);
	private SeekableFile aSeekableFile137 = null;
	static int anInt138;
	private int anInt139 = 65000;
	static int anInt140;
	static int anInt141;
	static int anInt142;
	private int anInt143;
	static float aFloat144;
	static int anInt145;
	static int[] anIntArray146 = new int[3];
	static int anInt147;
	static int anInt148;
	
	static final void method174(byte b) {
		Class315.aClass61_4031.method608(false);
		anInt141++;
		int i = -61 / ((-52 - b) / 45);
	}
	
	static final void method175(byte[] bs, boolean bool) {
		if (bool == true) {
			anInt142++;
			Buffer buffer = new Buffer(bs);
			for (;;) {
				int i = buffer.method2233(255);
				if ((i ^ 0xffffffff) == -1) {
					break;
				}
				if ((i ^ 0xffffffff) == -2) {
					int i_0_ = buffer.method2219(-130546744);
					if (Class317.anInt4038 == -1) {
						Class317.anInt4038 = i_0_;
					}
				}
			}
		}
	}
	
	public final String toString() {
		anInt138++;
		return "Cache:" + anInt143;
	}
	
	final boolean method176(int i, byte[] bs, int i_1_, boolean bool) {
		anInt140++;
		synchronized (aSeekableFile134) {
			if ((i ^ 0xffffffff) > -1 || i > anInt139) {
				throw new IllegalArgumentException();
			}
			boolean bool_2_ = method179(bs, 11233, i_1_, i, bool);
			if (!bool_2_) {
				bool_2_ = method179(bs, 11233, i_1_, i, false);
			}
			return bool_2_;
		}
	}
	
	final byte[] method177(int i, int i_3_) {
		anInt145++;
		synchronized (aSeekableFile134) {
			try {
				if ((aSeekableFile137.method3573(-1) ^ 0xffffffffffffffffL) > ((long) (i * 6 - -6) ^ 0xffffffffffffffffL)) {
					return null;
				}
				aSeekableFile137.method3577((long) (i * 6), false);
				aSeekableFile137.method3568(-63, 6, Class157.aByteArray1973, 0);
				int i_4_ = ((0xff & Class157.aByteArray1973[1]) << 8) + ((0xff0000 & Class157.aByteArray1973[0] << 16) + (0xff & Class157.aByteArray1973[2]));
				int i_5_ = (Class157.aByteArray1973[5] & 0xff) + (((0xff & Class157.aByteArray1973[4]) << 8) + ((0xff & Class157.aByteArray1973[3]) << 16));
				if (i_4_ < 0 || i_4_ > anInt139) {
					return null;
				}
				if ((i_5_ ^ 0xffffffff) >= -1 || aSeekableFile134.method3573(-1) / 520L < (long) i_5_) {
					return null;
				}
				byte[] bs = new byte[i_4_];
				int i_6_ = 0;
				if (i_3_ != 512) {
					method178(-80);
				}
				int i_7_ = 0;
				while ((i_4_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff)) {
					if (i_5_ == 0) {
						return null;
					}
					aSeekableFile134.method3577((long) (i_5_ * 520), false);
					int i_8_ = i_4_ - i_6_;
					if ((i_8_ ^ 0xffffffff) < -513) {
						i_8_ = 512;
					}
					aSeekableFile134.method3568(-92, i_8_ - -8, Class157.aByteArray1973, 0);
					int i_9_ = ((Class157.aByteArray1973[0] & 0xff) << 8) + (Class157.aByteArray1973[1] & 0xff);
					int i_10_ = (Class157.aByteArray1973[3] & 0xff) + ((0xff & Class157.aByteArray1973[2]) << 8);
					int i_11_ = (Class157.aByteArray1973[5] << 8 & 0xff00) + ((Class157.aByteArray1973[4] << 16 & 0xff0000) + (Class157.aByteArray1973[6] & 0xff));
					int i_12_ = 0xff & Class157.aByteArray1973[7];
					if ((i ^ 0xffffffff) != (i_9_ ^ 0xffffffff) || (i_7_ ^ 0xffffffff) != (i_10_ ^ 0xffffffff) || (i_12_ ^ 0xffffffff) != (anInt143 ^ 0xffffffff)) {
						return null;
					}
					if ((i_11_ ^ 0xffffffff) > -1 || (long) i_11_ > aSeekableFile134.method3573(-1) / 520L) {
						return null;
					}
					i_7_++;
					for (int i_13_ = 0; i_8_ > i_13_; i_13_++)
						bs[i_6_++] = Class157.aByteArray1973[8 + i_13_];
					i_5_ = i_11_;
				}
				return bs;
			} catch (java.io.IOException ioexception) {
				return null;
			}
		}
	}
	
	public static void method178(int i) {
		anIntArray135 = null;
		anIntArray146 = null;
		aClass192_136 = null;
		if (i <= 14) {
			aFloat144 = -1.2132012F;
		}
	}
	
	private final boolean method179(byte[] bs, int i, int i_14_, int i_15_, boolean bool) {
		anInt147++;
		synchronized (aSeekableFile134) {
			if (i != 11233) {
				method177(114, 33);
			}
			try {
				int i_16_;
				if (bool) {
					if ((aSeekableFile137.method3573(-1) ^ 0xffffffffffffffffL) > ((long) (6 + i_14_ * 6) ^ 0xffffffffffffffffL)) {
						return false;
					}
					aSeekableFile137.method3577((long) (i_14_ * 6), false);
					aSeekableFile137.method3568(i + -11299, 6, Class157.aByteArray1973, 0);
					i_16_ = (0xff & Class157.aByteArray1973[5]) + ((0xff0000 & Class157.aByteArray1973[3] << 16) - -(Class157.aByteArray1973[4] << 8 & 0xff00));
					if (i_16_ <= 0 || aSeekableFile134.method3573(-1) / 520L < (long) i_16_) {
						return false;
					}
				} else {
					i_16_ = (int) ((519L + aSeekableFile134.method3573(-1)) / 520L);
					if (i_16_ == 0) {
						i_16_ = 1;
					}
				}
				Class157.aByteArray1973[3] = (byte) (i_16_ >> 16);
				Class157.aByteArray1973[2] = (byte) i_15_;
				Class157.aByteArray1973[0] = (byte) (i_15_ >> 16);
				Class157.aByteArray1973[1] = (byte) (i_15_ >> 8);
				Class157.aByteArray1973[5] = (byte) i_16_;
				Class157.aByteArray1973[4] = (byte) (i_16_ >> 8);
				aSeekableFile137.method3577((long) (i_14_ * 6), false);
				aSeekableFile137.method3570(5033, 0, 6, Class157.aByteArray1973);
				int i_17_ = 0;
				int i_18_ = 0;
				while (i_17_ < i_15_) {
					int i_19_ = 0;
					if (bool) {
						aSeekableFile134.method3577((long) (i_16_ * 520), false);
						try {
							aSeekableFile134.method3568(-116, 8, Class157.aByteArray1973, 0);
						} catch (java.io.EOFException eofexception) {
							break;
						}
						int i_20_ = (0xff & Class157.aByteArray1973[1]) + ((0xff & Class157.aByteArray1973[0]) << 8);
						int i_21_ = (Class157.aByteArray1973[3] & 0xff) + (Class157.aByteArray1973[2] << 8 & 0xff00);
						i_19_ = (0xff & Class157.aByteArray1973[6]) + (((0xff & Class157.aByteArray1973[4]) << 16) - -((0xff & Class157.aByteArray1973[5]) << 8));
						int i_22_ = Class157.aByteArray1973[7] & 0xff;
						if ((i_14_ ^ 0xffffffff) != (i_20_ ^ 0xffffffff) || (i_18_ ^ 0xffffffff) != (i_21_ ^ 0xffffffff) || i_22_ != anInt143) {
							return false;
						}
						if ((i_19_ ^ 0xffffffff) > -1 || (aSeekableFile134.method3573(i + -11234) / 520L ^ 0xffffffffffffffffL) > ((long) i_19_ ^ 0xffffffffffffffffL)) {
							return false;
						}
					}
					if ((i_19_ ^ 0xffffffff) == -1) {
						bool = false;
						i_19_ = (int) ((519L + aSeekableFile134.method3573(i + -11234)) / 520L);
						if ((i_19_ ^ 0xffffffff) == -1) {
							i_19_++;
						}
						if ((i_19_ ^ 0xffffffff) == (i_16_ ^ 0xffffffff)) {
							i_19_++;
						}
					}
					if ((i_15_ + -i_17_ ^ 0xffffffff) >= -513) {
						i_19_ = 0;
					}
					Class157.aByteArray1973[3] = (byte) i_18_;
					Class157.aByteArray1973[2] = (byte) (i_18_ >> 8);
					Class157.aByteArray1973[1] = (byte) i_14_;
					Class157.aByteArray1973[0] = (byte) (i_14_ >> 8);
					Class157.aByteArray1973[4] = (byte) (i_19_ >> 16);
					Class157.aByteArray1973[5] = (byte) (i_19_ >> 8);
					Class157.aByteArray1973[6] = (byte) i_19_;
					Class157.aByteArray1973[7] = (byte) anInt143;
					aSeekableFile134.method3577((long) (520 * i_16_), false);
					aSeekableFile134.method3570(5033, 0, 8, Class157.aByteArray1973);
					int i_23_ = -i_17_ + i_15_;
					if ((i_23_ ^ 0xffffffff) < -513) {
						i_23_ = 512;
					}
					aSeekableFile134.method3570(5033, i_17_, i_23_, bs);
					i_16_ = i_19_;
					i_17_ += i_23_;
					i_18_++;
				}
				return true;
			} catch (java.io.IOException ioexception) {
				return false;
			}
		}
	}
	
	Class6(int i, SeekableFile seekablefile, SeekableFile seekablefile_24_, int i_25_) {
		aSeekableFile137 = seekablefile_24_;
		anInt143 = i;
		anInt139 = i_25_;
		aSeekableFile134 = seekablefile;
	}
}
