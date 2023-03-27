package com.jagex;

abstract class Class144
{
	static byte[][] aByteArrayArray1782 = new byte[1000][];
	static int anInt1783;
	static int anInt1784;
	protected int anInt1785;
	static Class192 aClass192_1786 = new Class192(138, -1);
	protected int anInt1787;
	protected int anInt1788;
	static int[] anIntArray1789;
	static Class192 aClass192_1790;
	static boolean aBoolean1791 = true;
	
	abstract void method1626(int i, int i_0_, int i_1_);
	
	public static void method1627(boolean bool) {
		aByteArrayArray1782 = null;
		if (bool != false) {
			aClass192_1786 = null;
		}
		aClass192_1790 = null;
		aClass192_1786 = null;
		anIntArray1789 = null;
	}
	
	static final void method1628(int i) {
		Node_Sub38_Sub7.anInt10153 = Class61.anInt898 = -1;
		anInt1783++;
		Animable_Sub2.method837((byte) -97, 0);
		for (int i_2_ = i; (i_2_ ^ 0xffffffff) > -5; i_2_++) {
			for (int i_3_ = 0; (Node_Sub54.anInt7675 >> 3 ^ 0xffffffff) < (i_3_ ^ 0xffffffff); i_3_++) {
				for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (Class377_Sub1.anInt8774 >> 3 ^ 0xffffffff); i_4_++)
					Class330.anIntArrayArrayArray4128[i_2_][i_3_][i_4_] = -1;
			}
		}
		for (Node_Sub28 node_sub28 = (Node_Sub28) Class320_Sub16.aClass312_8358.method3613(65280); node_sub28 != null; node_sub28 = (Node_Sub28) Class320_Sub16.aClass312_8358.method3620(i + 16776960)) {
			int i_5_ = node_sub28.anInt7323;
			boolean bool = (i_5_ & 0x1 ^ 0xffffffff) == -2;
			int i_6_ = node_sub28.anInt7325 >> 3;
			int i_7_ = node_sub28.anInt7326 >> 3;
			int i_8_ = node_sub28.anInt7319;
			int i_9_ = node_sub28.anInt7332;
			int i_10_ = node_sub28.anInt7330;
			int i_11_ = node_sub28.anInt7324;
			int i_12_ = node_sub28.anInt7320;
			int i_13_ = node_sub28.anInt7328;
			int i_14_ = 0;
			int i_15_ = 0;
			int i_16_ = 1;
			int i_17_ = 1;
			if (i_5_ != 1) {
				if (i_5_ != 2) {
					if ((i_5_ ^ 0xffffffff) == -4) {
						i_16_ = 1;
						i_14_ = i_13_ - 1;
						i_17_ = -1;
					}
				} else {
					i_17_ = -1;
					i_16_ = -1;
					i_15_ = i_12_ - 1;
					i_14_ = i_13_ + -1;
				}
			} else {
				i_16_ = -1;
				i_15_ = i_12_ + -1;
			}
			for (int i_18_ = i_7_; i_13_ + i_7_ > i_18_; i_18_++) {
				int i_19_ = i_15_;
				int i_20_ = i_6_;
				while (i_20_ < i_6_ - -i_12_) {
					if (bool) {
						Class330.anIntArrayArrayArray4128[i_11_][i_14_ + i_8_][i_19_ + i_9_] = (i_18_ << 3) + ((i_20_ << 14) + (i_10_ << 24)) + (i_5_ << 1);
					} else {
						Class330.anIntArrayArrayArray4128[i_11_][i_19_ + i_8_][i_9_ + i_14_] = (i_5_ << 1) + ((i_18_ << 3) + (i_10_ << 24) + (i_20_ << 14));
					}
					i_20_++;
					i_19_ += i_16_;
				}
				i_14_ += i_17_;
			}
		}
		int i_21_ = Class169.anIntArrayArray4954.length;
		anIntArray1789 = new int[i_21_];
		Class262_Sub1.anIntArray7704 = new int[i_21_];
		Class188_Sub1_Sub1.aByteArrayArray9334 = new byte[i_21_][];
		ProducingGraphicsBuffer.anIntArray9895 = new int[i_21_];
		Class194.aByteArrayArray2373 = null;
		FileOnDisk.aByteArrayArray1331 = new byte[i_21_][];
		Class320_Sub6.aByteArrayArray8263 = new byte[i_21_][];
		StandardPlane.anIntArray7980 = new int[i_21_];
		Class42.anIntArray645 = new int[i_21_];
		Class204.anIntArray2460 = null;
		Class320_Sub18.aByteArrayArray8378 = new byte[i_21_][];
		i_21_ = 0;
		for (Node_Sub28 node_sub28 = (Node_Sub28) Class320_Sub16.aClass312_8358.method3613(65280); node_sub28 != null; node_sub28 = (Node_Sub28) Class320_Sub16.aClass312_8358.method3620(16776960)) {
			int i_22_ = node_sub28.anInt7325 >>> -2127211805;
			int i_23_ = node_sub28.anInt7326 >>> 3;
			int i_24_ = node_sub28.anInt7320 + i_22_;
			if ((i_24_ & 0x7 ^ 0xffffffff) == -1) {
				i_24_--;
			}
			i_24_ >>>= 3;
			int i_25_ = i_23_ - -node_sub28.anInt7328;
			if ((0x7 & i_25_ ^ 0xffffffff) == -1) {
				i_25_--;
			}
			i_25_ >>>= 3;
			for (int i_26_ = i_22_ >>> 3; i_24_ >= i_26_; i_26_++) {
			while_142_:
				for (int i_27_ = i_23_ >>> 3; i_27_ <= i_25_; i_27_++) {
					int i_28_ = i_26_ << 8 | i_27_;
					for (int i_29_ = 0; i_29_ < i_21_; i_29_++) {
						if ((i_28_ ^ 0xffffffff) == (Class262_Sub1.anIntArray7704[i_29_] ^ 0xffffffff)) {
							continue while_142_;
						}
					}
					Class262_Sub1.anIntArray7704[i_21_] = i_28_;
					StandardPlane.anIntArray7980[i_21_] = Animable_Sub1_Sub1.aClass302_10618.method3519("m" + i_26_ + "_" + i_27_, (byte) 119);
					anIntArray1789[i_21_] = Animable_Sub1_Sub1.aClass302_10618.method3519("l" + i_26_ + "_" + i_27_, (byte) 23);
					Class42.anIntArray645[i_21_] = Animable_Sub1_Sub1.aClass302_10618.method3519("um" + i_26_ + "_" + i_27_, (byte) 120);
					ProducingGraphicsBuffer.anIntArray9895[i_21_] = Animable_Sub1_Sub1.aClass302_10618.method3519("ul" + i_26_ + "_" + i_27_, (byte) 121);
					i_21_++;
				}
			}
		}
		Class15.anIntArrayArray224 = Class169.anIntArrayArray4954;
		Class169.anIntArrayArray4954 = null;
		Class364.method4057(false, Node_Sub54.anInt7675 >> 4, 12, Class377_Sub1.anInt8774 >> 4, (byte) -36);
	}
	
	abstract void method1629(int i, int i_30_, int i_31_);
	
	abstract void method1630(int i, int i_32_, int i_33_);
	
	static final void method1631(byte b) {
		anInt1784++;
		FileOnDisk fileondisk = null;
		try {
			fileondisk = SignLink.method3633(-15, "2");
			if (b < 114) {
				aClass192_1786 = null;
			}
			Buffer buffer = new Buffer(Class188_Sub1_Sub1.anInt9333 * 6 + 3);
			buffer.method2226(1, false);
			buffer.method2210(Class188_Sub1_Sub1.anInt9333, -28);
			for (int i = 0; Class320_Sub22.anIntArray8417.length > i; i++) {
				if (FileOnDisk.aBooleanArray1332[i]) {
					buffer.method2210(i, -25);
					buffer.method2179((byte) -5, Class320_Sub22.anIntArray8417[i]);
				}
			}
			fileondisk.method1102((byte) 76, buffer.aByteArray7019, 0, buffer.anInt7002);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (fileondisk != null) {
				fileondisk.method1098(true);
			}
		} catch (Exception exception) {
			/* empty */
		}
		Animable_Sub2_Sub1.aLong10630 = Class313.method3650(false);
		Class331.aBoolean4129 = false;
	}
	
	Class144(int i, int i_34_, int i_35_) {
		anInt1788 = i_35_;
		anInt1787 = i_34_;
		anInt1785 = i;
	}
	
	static {
		aClass192_1790 = new Class192(109, 10);
	}
}
