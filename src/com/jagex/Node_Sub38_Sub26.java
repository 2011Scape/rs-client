package com.jagex;

public class Node_Sub38_Sub26 extends Node_Sub38
{
	static int anInt10361;
	static int anInt10362;
	private int anInt10363;
	private int anInt10364;
	private int anInt10365;
	static int anInt10366;
	static int anInt10367;
	static Class192 aClass192_10368 = new Class192(25, 0);
	static int anInt10369;
	static int[] anIntArray10370 = new int[6];
	
	private final void method2873(int i, int i_0_) {
		anInt10364 = (0xff00 & i_0_) >> 4;
		anInt10363 = 0xff0 & i_0_ << 4;
		anInt10365 = (i_0_ & i) >> 12;
		anInt10369++;
	}
	
	final void method2780(boolean bool, Buffer buffer, int i) {
		int i_1_ = i;
		if (i_1_ == 0) {
			method2873(16711680, buffer.method2220(1819759595));
		}
		if (bool != false) {
			anIntArray10370 = null;
		}
		anInt10361++;
	}
	
	public Node_Sub38_Sub26() {
		this(0);
	}
	
	final int[][] method2778(int i, boolean bool) {
		if (bool != true) {
			return null;
		}
		anInt10367++;
		int[][] is = aClass348_7454.method3981(i, 3168);
		if (aClass348_7454.aBoolean4300) {
			int[] is_2_ = is[0];
			int[] is_3_ = is[1];
			int[] is_4_ = is[2];
			for (int i_5_ = 0; Class339_Sub7.anInt8728 > i_5_; i_5_++) {
				is_2_[i_5_] = anInt10365;
				is_3_[i_5_] = anInt10364;
				is_4_[i_5_] = anInt10363;
			}
		}
		return is;
	}
	
	public static void method2874(int i) {
		anIntArray10370 = null;
		aClass192_10368 = null;
		int i_6_ = 125 / ((i - -40) / 32);
	}
	
	static final byte[] method2875(byte[] bs, byte b) {
		anInt10362++;
		Buffer buffer = new Buffer(bs);
		if (b != -104) {
			return null;
		}
		int i = buffer.method2233(255);
		int i_7_ = buffer.method2186(112);
		if (i_7_ < 0 || Class59.anInt866 != 0 && Class59.anInt866 < i_7_) {
			throw new RuntimeException();
		}
		if (i != 0) {
			int i_8_ = buffer.method2186(-63);
			if (i_8_ < 0 || (Class59.anInt866 ^ 0xffffffff) != -1 && i_8_ > Class59.anInt866) {
				throw new RuntimeException();
			}
			byte[] bs_9_ = new byte[i_8_];
			if ((i ^ 0xffffffff) != -2) {
				synchronized (Class262_Sub11.aClass271_7779) {
					Class262_Sub11.aClass271_7779.method3311(10, buffer, bs_9_);
				}
			} else {
				Class90.method1023(bs_9_, i_8_, bs, i_7_, 9);
			}
			return bs_9_;
		}
		byte[] bs_10_ = new byte[i_7_];
		buffer.method2181(0, i_7_, bs_10_, b + -19313);
		return bs_10_;
	}
	
	static final void method2876(Animable[] animables, int i, int i_11_) {
		if (i < i_11_) {
			int i_12_ = (i + i_11_) / 2;
			int i_13_ = i;
			Animable animable = animables[i_12_];
			animables[i_12_] = animables[i_11_];
			animables[i_11_] = animable;
			int i_14_ = animable.anInt5944;
			for (int i_15_ = i; i_15_ < i_11_; i_15_++) {
				if (animables[i_15_].anInt5944 < i_14_ + (i_15_ & 0x1)) {
					Animable animable_16_ = animables[i_15_];
					animables[i_15_] = animables[i_13_];
					animables[i_13_++] = animable_16_;
				}
			}
			animables[i_11_] = animables[i_13_];
			animables[i_13_] = animable;
			method2876(animables, i, i_13_ - 1);
			method2876(animables, i_13_ + 1, i_11_);
		}
	}
	
	private Node_Sub38_Sub26(int i) {
		super(0, false);
		method2873(16711680, i);
	}
	
	static final boolean method2877(int i, int i_17_, int i_18_) {
		anInt10366++;
		if (i_18_ < 82) {
			aClass192_10368 = null;
		}
		if ((i_17_ & 0x22 ^ 0xffffffff) == -1) {
			return false;
		}
		return true;
	}
}
