package com.jagex;
import java.math.BigInteger;

class Buffer extends Node
{
	static int anInt6952;
	static int anInt6953;
	static int anInt6954;
	static int anInt6955;
	static int anInt6956;
	static int anInt6957;
	static int anInt6958;
	static int anInt6959;
	static int anInt6960;
	static int anInt6961;
	static int anInt6962;
	static int anInt6963;
	static int anInt6964;
	static int anInt6965;
	static int anInt6966;
	static int anInt6967;
	static int anInt6968;
	static int anInt6969;
	static int anInt6970;
	static int anInt6971;
	static int anInt6972;
	static int anInt6973;
	static int anInt6974;
	static int anInt6975;
	static int anInt6976;
	static int anInt6977;
	static int anInt6978;
	static int anInt6979;
	static int anInt6980;
	static int anInt6981;
	static int anInt6982;
	static int anInt6983;
	static int anInt6984;
	static int anInt6985;
	static int anInt6986;
	static int anInt6987;
	static int anInt6988;
	static int anInt6989;
	static int anInt6990;
	static int anInt6991;
	static int anInt6992;
	static int anInt6993;
	static int anInt6994;
	static int anInt6995;
	static int anInt6996;
	static int anInt6997;
	static int anInt6998;
	static int anInt6999;
	static int anInt7000;
	static int anInt7001;
	protected int anInt7002;
	static int anInt7003;
	static int anInt7004;
	static int anInt7005;
	static int anInt7006;
	static int anInt7007;
	static int anInt7008;
	static int anInt7009;
	static int anInt7010;
	static int anInt7011;
	static int anInt7012;
	static int anInt7013;
	static Class192 aClass192_7014 = new Class192(136, 6);
	static int anInt7015;
	static int anInt7016;
	static int anInt7017;
	static int anInt7018;
	protected byte[] aByteArray7019;
	static int anInt7020;
	static int anInt7021;
	static int anInt7022;
	static int anInt7023;
	static int anInt7024;
	static int anInt7025;
	
	final int method2176(byte b) {
		if (b > -116) {
			method2241(-29);
		}
		anInt7004++;
		anInt7002 += 4;
		return (0xff & aByteArray7019[-4 + anInt7002]) + (((0xff & aByteArray7019[-2 + anInt7002]) << 16) + (aByteArray7019[-1 + anInt7002] << 24 & ~0xffffff)) - -((0xff & aByteArray7019[-3 + anInt7002]) << 8);
	}
	
	final int method2177(int i) {
		anInt7002 += 4;
		if (i != -13578) {
			return -73;
		}
		anInt7006++;
		return ((aByteArray7019[anInt7002 + -1] & 0xff) << 16) + ((aByteArray7019[anInt7002 - 2] << 24 & ~0xffffff) - (-((aByteArray7019[-4 + anInt7002] & 0xff) << 8) + -(aByteArray7019[-3 + anInt7002] & 0xff)));
	}
	
	final void method2178(int i, boolean bool) {
		if (bool == true) {
			aByteArray7019[anInt7002++] = (byte) -i;
			anInt6973++;
		}
	}
	
	final void method2179(byte b, int i) {
		if (b != -5) {
			aByteArray7019 = null;
		}
		aByteArray7019[anInt7002++] = (byte) (i >> 24);
		anInt6980++;
		aByteArray7019[anInt7002++] = (byte) (i >> 16);
		aByteArray7019[anInt7002++] = (byte) (i >> 8);
		aByteArray7019[anInt7002++] = (byte) i;
	}
	
	final String method2180(byte b) {
		anInt7025++;
		byte b_0_ = aByteArray7019[anInt7002++];
		if (b_0_ != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		int i = anInt7002;
		int i_1_ = -53 % ((21 - b) / 50);
		while (aByteArray7019[anInt7002++] != 0) {
			/* empty */
		}
		int i_2_ = anInt7002 + -i + -1;
		if ((i_2_ ^ 0xffffffff) == -1) {
			return "";
		}
		return Class184.method1846(i, aByteArray7019, i_2_, (byte) -127);
	}
	
	final void method2181(int i, int i_3_, byte[] bs, int i_4_) {
		for (int i_5_ = i; (i_5_ ^ 0xffffffff) > (i_3_ + i ^ 0xffffffff); i_5_++)
			bs[i_5_] = aByteArray7019[anInt7002++];
		if (i_4_ == -19417) {
			anInt6959++;
		}
	}
	
	final int method2182(boolean bool) {
		anInt6964++;
		int i = 0;
		int i_6_;
		for (i_6_ = method2227(bool); i_6_ == 32767; i_6_ = method2227(true))
			i += 32767;
		i += i_6_;
		if (bool != true) {
			aByteArray7019 = null;
		}
		return i;
	}
	
	final int method2183(boolean bool) {
		anInt6982++;
		if (aByteArray7019[anInt7002] < 0) {
			return method2186(127) & 0x7fffffff;
		}
		if (bool != false) {
			return -12;
		}
		int i = method2219(-130546744);
		if ((i ^ 0xffffffff) == -32768) {
			return -1;
		}
		return i;
	}
	
	final void method2184(int i, byte b) {
		anInt6955++;
		aByteArray7019[anInt7002++] = (byte) (i >> 16);
		aByteArray7019[anInt7002++] = (byte) (i >> 24);
		int i_7_ = 18 % ((b - 53) / 59);
		aByteArray7019[anInt7002++] = (byte) i;
		aByteArray7019[anInt7002++] = (byte) (i >> 8);
	}
	
	final byte method2185(boolean bool) {
		anInt6994++;
		if (bool != false) {
			method2229((byte) -73);
		}
		return (byte) (128 + -aByteArray7019[anInt7002++]);
	}
	
	final int method2186(int i) {
		anInt7002 += 4;
		int i_8_ = -75 / ((i - 1) / 44);
		anInt6971++;
		return ((0xff & aByteArray7019[anInt7002 + -4]) << 24) - (-((0xff & aByteArray7019[-3 + anInt7002]) << 16) - (aByteArray7019[anInt7002 - 2] << 8 & 0xff00) - (aByteArray7019[-1 + anInt7002] & 0xff));
	}
	
	final void method2187(boolean bool, int i) {
		anInt7009++;
		aByteArray7019[anInt7002++] = (byte) (i >> 8);
		aByteArray7019[anInt7002++] = (byte) i;
		aByteArray7019[anInt7002++] = (byte) (i >> 24);
		aByteArray7019[anInt7002++] = (byte) (i >> 16);
		if (bool != true) {
			method2184(30, (byte) -93);
		}
	}
	
	final int method2188(int i) {
		if (i <= 110) {
			return 97;
		}
		anInt7008++;
		anInt7002 += 4;
		return (0xff & aByteArray7019[-4 + anInt7002]) + ((aByteArray7019[anInt7002 + -1] << 24 & ~0xffffff) + ((aByteArray7019[-2 + anInt7002] & 0xff) << 16) - -(0xff00 & aByteArray7019[anInt7002 + -3] << 8));
	}
	
	final void method2189(int i, int i_9_) {
		anInt6968++;
		if (i_9_ != 32768) {
			method2197(71);
		}
		if (i >= 0 && i < 128) {
			method2226(i, false);
		} else if ((i ^ 0xffffffff) <= -1 && i < 32768) {
			method2210(i + 32768, -112);
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	final int method2190(int i, boolean bool) {
		if (bool != false) {
			anInt7023 = -121;
		}
		anInt6979++;
		int i_10_ = Class10.method188((byte) -58, anInt7002, i, aByteArray7019);
		method2179((byte) -5, i_10_);
		return i_10_;
	}
	
	final void method2191(int i, int i_11_) {
		aByteArray7019[anInt7002++] = (byte) i_11_;
		anInt6981++;
		if (i <= -24) {
			aByteArray7019[anInt7002++] = (byte) (i_11_ >> 8);
		}
	}
	
	final void method2192(int[] is, int i) {
		if (i <= 96) {
			anInt7023 = -75;
		}
		anInt6985++;
		int i_12_ = anInt7002 / 8;
		anInt7002 = 0;
		for (int i_13_ = 0; i_12_ > i_13_; i_13_++) {
			int i_14_ = method2186(-47);
			int i_15_ = method2186(75);
			int i_16_ = -957401312;
			int i_17_ = -1640531527;
			int i_18_ = 32;
			while (i_18_-- > 0) {
				i_15_ -= (i_14_ >>> 5 ^ i_14_ << 4) - -i_14_ ^ i_16_ - -is[(i_16_ & 0x1834) >>> 11];
				i_16_ -= i_17_;
				i_14_ -= i_16_ + is[i_16_ & 0x3] ^ i_15_ + (i_15_ << 4 ^ i_15_ >>> 5);
			}
			anInt7002 -= 8;
			method2179((byte) -5, i_14_);
			method2179((byte) -5, i_15_);
		}
	}
	
	final int method2193(int i) {
		if (i > -16) {
			method2223(17, (byte) 70, null, 80);
		}
		anInt6997++;
		anInt7002 += 2;
		int i_19_ = (0xff & aByteArray7019[-1 + anInt7002]) + ((aByteArray7019[-2 + anInt7002] & 0xff) << 8);
		if ((i_19_ ^ 0xffffffff) < -32768) {
			i_19_ -= 65536;
		}
		return i_19_;
	}
	
	final void method2194(int i, int i_20_) {
		anInt6988++;
		aByteArray7019[anInt7002 + -i - 2] = (byte) (i >> 8);
		aByteArray7019[-1 + (anInt7002 - i)] = (byte) i;
		if (i_20_ != -2887) {
			method2240((byte) 8);
		}
	}
	
	final String method2195(int i) {
		anInt6953++;
		int i_21_ = anInt7002;
		while ((aByteArray7019[anInt7002++] ^ 0xffffffff) != -1) {
			/* empty */
		}
		int i_22_ = anInt7002 + (-i_21_ - 1);
		if (i != -1) {
			return null;
		}
		if (i_22_ == 0) {
			return "";
		}
		return Class184.method1846(i_21_, aByteArray7019, i_22_, (byte) -118);
	}
	
	final long method2196(byte b) {
		if (b != -104) {
			return -23L;
		}
		anInt7003++;
		long l = 0xffffffffL & (long) method2188(114);
		long l_23_ = 0xffffffffL & (long) method2188(112);
		return l + (l_23_ << 32);
	}
	
	final int method2197(int i) {
		anInt6975++;
		int i_24_ = aByteArray7019[anInt7002] & 0xff;
		if ((i_24_ ^ 0xffffffff) > i) {
			return method2233(i + 384) - 64;
		}
		return -49152 + method2219(-130546744);
	}
	
	final void method2198(String string, int i) {
		int i_25_ = -10 / ((-32 - i) / 53);
		anInt6977++;
		int i_26_ = string.indexOf('\0');
		if (i_26_ >= 0) {
			throw new IllegalArgumentException("NUL character at " + i_26_ + " - cannot pjstr2");
		}
		aByteArray7019[anInt7002++] = (byte) 0;
		anInt7002 += Class173.method1801(string, string.length(), aByteArray7019, true, anInt7002, 0);
		aByteArray7019[anInt7002++] = (byte) 0;
	}
	
	final void method2199(int i, int i_27_) {
		aByteArray7019[anInt7002++] = (byte) i;
		anInt7016++;
		aByteArray7019[anInt7002++] = (byte) (i >> 8);
		if (i_27_ != -1) {
			aClass192_7014 = null;
		}
	}
	
	final void method2200(long l, int i) {
		aByteArray7019[anInt7002++] = (byte) (int) (l >> 56);
		anInt6986++;
		aByteArray7019[anInt7002++] = (byte) (int) (l >> 48);
		aByteArray7019[anInt7002++] = (byte) (int) (l >> 40);
		aByteArray7019[anInt7002++] = (byte) (int) (l >> 32);
		if (i != 1817671800) {
			method2211(-93);
		}
		aByteArray7019[anInt7002++] = (byte) (int) (l >> 24);
		aByteArray7019[anInt7002++] = (byte) (int) (l >> 16);
		aByteArray7019[anInt7002++] = (byte) (int) (l >> 8);
		aByteArray7019[anInt7002++] = (byte) (int) l;
	}
	
	final int method2201(boolean bool) {
		anInt6965++;
		if (bool != true) {
			method2225((byte) -68, 84);
		}
		if ((aByteArray7019[anInt7002] ^ 0xffffffff) <= -1) {
			return method2219(-130546744);
		}
		return method2186(125) & 0x7fffffff;
	}
	
	final void method2202(int i) {
		anInt7011++;
		if (aByteArray7019 != null) {
			Class111.method1137(aByteArray7019, -251);
		}
		int i_28_ = -99 / ((60 - i) / 50);
		aByteArray7019 = null;
	}
	
	final void method2203(int[] is, int i, boolean bool, int i_29_) {
		anInt7012++;
		int i_30_ = anInt7002;
		anInt7002 = i;
		int i_31_ = (i_29_ - i) / 8;
		for (int i_32_ = 0; i_32_ < i_31_; i_32_++) {
			int i_33_ = method2186(-51);
			int i_34_ = method2186(-126);
			int i_35_ = 0;
			int i_36_ = -1640531527;
			int i_37_ = 32;
			while ((i_37_-- ^ 0xffffffff) < -1) {
				i_33_ += i_34_ + (i_34_ << 4 ^ i_34_ >>> 5) ^ i_35_ + is[0x3 & i_35_];
				i_35_ += i_36_;
				i_34_ += (i_33_ >>> 5 ^ i_33_ << 4) + i_33_ ^ i_35_ + is[i_35_ >>> 11 & ~0x173ffffc];
			}
			anInt7002 -= 8;
			method2179((byte) -5, i_33_);
			method2179((byte) -5, i_34_);
		}
		if (bool != false) {
			method2238(true);
		}
		anInt7002 = i_30_;
	}
	
	final void method2204(int i, byte b) {
		anInt6999++;
		aByteArray7019[-i + (anInt7002 + -4)] = (byte) (i >> 24);
		aByteArray7019[-3 + (-i + anInt7002)] = (byte) (i >> 16);
		aByteArray7019[anInt7002 - i + -2] = (byte) (i >> 8);
		aByteArray7019[anInt7002 + -i - 1] = (byte) i;
		if (b < 126) {
			method2205(-97, null, null);
		}
	}
	
	static final void method2205(int i, Node node, Node node_38_) {
		if (node_38_.aNode2799 != null) {
			node_38_.method2160((byte) 31);
		}
		anInt6960++;
		int i_39_ = -102 / ((3 - i) / 52);
		node_38_.aNode2800 = node;
		node_38_.aNode2799 = node.aNode2799;
		node_38_.aNode2799.aNode2800 = node_38_;
		node_38_.aNode2800.aNode2799 = node_38_;
	}
	
	final void method2206(byte b, int i, long l) {
		i--;
		anInt7010++;
		if (b <= 112) {
			aByteArray7019 = null;
		}
		if (i < 0 || (i ^ 0xffffffff) < -8) {
			throw new IllegalArgumentException();
		}
		for (int i_40_ = 8 * i; i_40_ >= 0; i_40_ -= 8)
			aByteArray7019[anInt7002++] = (byte) (int) (l >> i_40_);
	}
	
	final void method2207(int i, int i_41_) {
		aByteArray7019[anInt7002++] = (byte) (i_41_ - -128);
		if (i != 21226) {
			anInt7002 = 72;
		}
		anInt6991++;
		aByteArray7019[anInt7002++] = (byte) (i_41_ >> 8);
	}
	
	final int method2208(boolean bool) {
		anInt7024++;
		anInt7002 += 4;
		if (bool != true) {
			anInt7002 = -26;
		}
		return (aByteArray7019[anInt7002 + -4] << 16 & 0xff0000) + (((aByteArray7019[anInt7002 + -3] & 0xff) << 24) - -((0xff & aByteArray7019[anInt7002 + -1]) << 8)) - -(aByteArray7019[anInt7002 - 2] & 0xff);
	}
	
	final int method2209(byte b) {
		int i = 117 / ((-44 - b) / 57);
		anInt7002 += 2;
		anInt6987++;
		return ((0xff & aByteArray7019[-1 + anInt7002]) << 8) + (0xff & aByteArray7019[anInt7002 + -2]);
	}
	
	final void method2210(int i, int i_42_) {
		anInt6961++;
		aByteArray7019[anInt7002++] = (byte) (i >> 8);
		aByteArray7019[anInt7002++] = (byte) i;
		if (i_42_ >= -24) {
			method2208(true);
		}
	}
	
	final int method2211(int i) {
		anInt6984++;
		if (i != 4255) {
			return -56;
		}
		return aByteArray7019[anInt7002++] + -128 & 0xff;
	}
	
	final int method2212(int i) {
		anInt7018++;
		anInt7002 += 2;
		int i_43_ = (aByteArray7019[anInt7002 + -1] << 8 & 0xff00) + (0xff & aByteArray7019[-2 + anInt7002] + i);
		if (i_43_ > 32767) {
			i_43_ -= 65536;
		}
		return i_43_;
	}
	
	final int method2213(byte b) {
		if (b <= 97) {
			return 17;
		}
		anInt7013++;
		return 0xff & -aByteArray7019[anInt7002++] + 128;
	}
	
	final byte method2214(byte b) {
		int i = -29 / ((-21 - b) / 35);
		anInt6966++;
		return aByteArray7019[anInt7002++];
	}
	
	final void method2215(int i, int i_44_) {
		if (i == 792958640) {
			aByteArray7019[anInt7002++] = (byte) i_44_;
			anInt6978++;
			aByteArray7019[anInt7002++] = (byte) (i_44_ >> 8);
			aByteArray7019[anInt7002++] = (byte) (i_44_ >> 16);
			aByteArray7019[anInt7002++] = (byte) (i_44_ >> 24);
		}
	}
	
	final boolean method2216(int i) {
		anInt6995++;
		anInt7002 -= 4;
		int i_45_ = Class10.method188((byte) -58, anInt7002, i, aByteArray7019);
		int i_46_ = method2186(-56);
		if (i_45_ == i_46_) {
			return true;
		}
		return false;
	}
	
	final void method2217(int i, byte b) {
		anInt7017++;
		aByteArray7019[anInt7002 - (i + 1)] = (byte) i;
		if (b != -128) {
			method2181(43, 11, null, 99);
		}
	}
	
	final int method2218(int i) {
		int i_47_ = -108 % ((18 - i) / 52);
		anInt7002 += 2;
		anInt6976++;
		int i_48_ = (0xff & aByteArray7019[-2 + anInt7002]) + (aByteArray7019[anInt7002 - 1] << 8 & 0xff00);
		if (i_48_ > 32767) {
			i_48_ -= 65536;
		}
		return i_48_;
	}
	
	final int method2219(int i) {
		if (i != -130546744) {
			aClass192_7014 = null;
		}
		anInt6996++;
		anInt7002 += 2;
		return (0xff & aByteArray7019[-1 + anInt7002]) + ((aByteArray7019[-2 + anInt7002] & 0xff) << 8);
	}
	
	final int method2220(int i) {
		anInt7002 += 3;
		if (i != 1819759595) {
			return 70;
		}
		anInt7005++;
		return ((aByteArray7019[anInt7002 - 2] & 0xff) << 8) + ((0xff & aByteArray7019[anInt7002 - 3]) << 16) - -(aByteArray7019[-1 + anInt7002] & 0xff);
	}
	
	final void method2221(int i, byte b) {
		if (b == 127) {
			anInt6972++;
			aByteArray7019[anInt7002++] = (byte) (i + 128);
		}
	}
	
	final void method2222(int i, BigInteger biginteger, BigInteger biginteger_49_) {
		anInt7001++;
		int i_50_ = anInt7002;
		anInt7002 = 0;
		byte[] bs = new byte[i_50_];
		method2181(i, i_50_, bs, -19417);
		BigInteger biginteger_51_ = new BigInteger(bs);
		BigInteger biginteger_52_ = biginteger_51_.modPow(biginteger_49_, biginteger);
		byte[] bs_53_ = biginteger_52_.toByteArray();
		anInt7002 = 0;
		method2210(bs_53_.length, -126);
		method2223(bs_53_.length, (byte) 4, bs_53_, 0);
	}
	
	final void method2223(int i, byte b, byte[] bs, int i_54_) {
		if (b == 4) {
			for (int i_55_ = i_54_; i + i_54_ > i_55_; i_55_++)
				aByteArray7019[anInt7002++] = bs[i_55_];
			anInt7021++;
		}
	}
	
	final int method2224(int i) {
		anInt7002 += 2;
		if (i != -602457616) {
			return 12;
		}
		anInt6983++;
		return (0xff00 & aByteArray7019[anInt7002 + -2] << 8) - -(-128 + aByteArray7019[anInt7002 - 1] & 0xff);
	}
	
	final void method2225(byte b, int i) {
		aByteArray7019[anInt7002++] = (byte) (i >> 16);
		anInt6990++;
		aByteArray7019[anInt7002++] = (byte) (i >> 8);
		if (b < 54) {
			method2187(false, 89);
		}
		aByteArray7019[anInt7002++] = (byte) i;
	}
	
	final void method2226(int i, boolean bool) {
		anInt6969++;
		aByteArray7019[anInt7002++] = (byte) i;
		if (bool != false) {
			method2240((byte) -31);
		}
	}
	
	final int method2227(boolean bool) {
		anInt7007++;
		if (bool != true) {
			method2214((byte) 19);
		}
		int i = aByteArray7019[anInt7002] & 0xff;
		if ((i ^ 0xffffffff) > -129) {
			return method2233(255);
		}
		return method2219(-130546744) + -32768;
	}
	
	final void method2228(String string, int i) {
		anInt6963++;
		int i_56_ = string.indexOf('\0');
		if (i_56_ >= 0) {
			throw new IllegalArgumentException("NUL character at " + i_56_ + " - cannot pjstr");
		}
		if (i <= 56) {
			method2237(99, -121);
		}
		anInt7002 += Class173.method1801(string, string.length(), aByteArray7019, true, anInt7002, 0);
		aByteArray7019[anInt7002++] = (byte) 0;
	}
	
	final int method2229(byte b) {
		anInt7000++;
		anInt7002 += 3;
		int i = (0xff & aByteArray7019[-1 + anInt7002]) + (((0xff & aByteArray7019[-3 + anInt7002]) << 16) + ((aByteArray7019[-2 + anInt7002] & 0xff) << 8));
		int i_57_ = -123 / ((b - 33) / 33);
		if ((i ^ 0xffffffff) < -8388608) {
			i -= 16777216;
		}
		return i;
	}
	
	final void method2230(int i, int i_58_) {
		anInt6989++;
		aByteArray7019[anInt7002++] = (byte) (i >> 8);
		aByteArray7019[anInt7002++] = (byte) (i_58_ + i);
	}
	
	final void method2231(int i, int[] is, int i_59_, int i_60_) {
		anInt6970++;
		int i_61_ = anInt7002;
		anInt7002 = i;
		int i_62_ = (-i + i_59_) / 8;
		if (i_60_ != -4901) {
			method2246(-11);
		}
		for (int i_63_ = 0; (i_63_ ^ 0xffffffff) > (i_62_ ^ 0xffffffff); i_63_++) {
			int i_64_ = method2186(i_60_ + 4968);
			int i_65_ = method2186(-62);
			int i_66_ = -957401312;
			int i_67_ = -1640531527;
			int i_68_ = 32;
			while (i_68_-- > 0) {
				i_65_ -= (i_64_ << 4 ^ i_64_ >>> 5) + i_64_ ^ is[(0x1efb & i_66_) >>> 11] + i_66_;
				i_66_ -= i_67_;
				i_64_ -= i_65_ + (i_65_ >>> 5 ^ i_65_ << 4) ^ i_66_ - -is[i_66_ & 0x3];
			}
			anInt7002 -= 8;
			method2179((byte) -5, i_64_);
			method2179((byte) -5, i_65_);
		}
		anInt7002 = i_61_;
	}
	
	final void method2232(int i, int i_69_) {
		if ((i_69_ & ~0x7f ^ 0xffffffff) != -1) {
			if ((i_69_ & ~0x3fff ^ 0xffffffff) != -1) {
				if ((~0x1fffff & i_69_) != 0) {
					if ((~0xfffffff & i_69_ ^ 0xffffffff) != -1) {
						method2226(i_69_ >>> 28 | 0x80, false);
					}
					method2226((i_69_ | 0x1012b0d2) >>> 21, false);
				}
				method2226((i_69_ | 0x203f43) >>> 14, false);
			}
			method2226((i_69_ | 0x403a) >>> 7, false);
		}
		anInt7022++;
		method2226(0x7f & i_69_, false);
		if (i != 65280) {
			method2235(21);
		}
	}
	
	final int method2233(int i) {
		if (i != 255) {
			return 36;
		}
		anInt6993++;
		return aByteArray7019[anInt7002++] & 0xff;
	}
	
	public static void method2234(boolean bool) {
		aClass192_7014 = null;
		if (bool != true) {
			method2205(-95, null, null);
		}
	}
	
	final long method2235(int i) {
		anInt7015++;
		long l = 0xffffffffL & (long) method2186(47);
		long l_70_ = 0xffffffffL & (long) method2186(i + 2023329290);
		if (i != -2023329376) {
			return -62L;
		}
		return l_70_ + (l << 32);
	}
	
	final byte method2236(int i) {
		anInt6974++;
		if (i != -735307888) {
			aClass192_7014 = null;
		}
		return (byte) -aByteArray7019[anInt7002++];
	}
	
	final void method2237(int i, int i_71_) {
		anInt6958++;
		if (i != 0) {
			aByteArray7019 = null;
		}
		aByteArray7019[anInt7002++] = (byte) i_71_;
		aByteArray7019[anInt7002++] = (byte) (i_71_ >> 8);
		aByteArray7019[anInt7002++] = (byte) (i_71_ >> 16);
		aByteArray7019[anInt7002++] = (byte) (i_71_ >> 24);
	}
	
	final int method2238(boolean bool) {
		if (bool != true) {
			method2183(true);
		}
		anInt6992++;
		return 0xff & -aByteArray7019[anInt7002++];
	}
	
	final int method2239(int i) {
		anInt6962++;
		int i_72_ = aByteArray7019[anInt7002++];
		int i_73_ = i;
		for (/**/; i_72_ < 0; i_72_ = aByteArray7019[anInt7002++])
			i_73_ = (i_73_ | 0x7f & i_72_) << 7;
		return i_72_ | i_73_;
	}
	
	final String method2240(byte b) {
		if (b != -46) {
			aClass192_7014 = null;
		}
		anInt6957++;
		if (aByteArray7019[anInt7002] == 0) {
			anInt7002++;
			return null;
		}
		return method2195(-1);
	}
	
	final long method2241(int i) {
		anInt6998++;
		if (i > -53) {
			return -50L;
		}
		long l = 0xffffffffL & (long) method2233(255);
		long l_74_ = 0xffffffffL & (long) method2186(65);
		return l_74_ + (l << 32);
	}
	
	Buffer(int i) {
		anInt7002 = 0;
		aByteArray7019 = Class111.method1139(true, i);
	}
	
	final byte method2242(byte b) {
		anInt6952++;
		if (b != -12) {
			method2177(35);
		}
		return (byte) (aByteArray7019[anInt7002++] - 128);
	}
	
	final int method2243(boolean bool) {
		if (bool != false) {
			return 0;
		}
		anInt6956++;
		anInt7002 += 2;
		return ((0xff & aByteArray7019[anInt7002 + -1]) << 8) - -(-128 + aByteArray7019[anInt7002 + -2] & 0xff);
	}
	
	final long method2244(int i, int i_75_) {
		anInt7020++;
		if ((--i ^ 0xffffffff) > -1 || i > 7) {
			throw new IllegalArgumentException();
		}
		int i_76_ = i * i_75_;
		long l = 0L;
		for (/**/; i_76_ >= 0; i_76_ -= 8)
			l |= (0xffL & (long) aByteArray7019[anInt7002++]) << i_76_;
		return l;
	}
	
	Buffer(byte[] bs) {
		aByteArray7019 = bs;
		anInt7002 = 0;
	}
	
	final void method2245(int i, int i_77_) {
		aByteArray7019[anInt7002++] = (byte) (-i_77_ + 128);
		anInt6954++;
		if (i != -3528) {
			method2193(-49);
		}
	}
	
	final int method2246(int i) {
		anInt6967++;
		if (i != -22301) {
			anInt7002 = -18;
		}
		anInt7002 += 3;
		return ((0xff & aByteArray7019[anInt7002 - 3]) << 16) - (-(aByteArray7019[anInt7002 - 1] << 8 & 0xff00) - (0xff & aByteArray7019[-2 + anInt7002]));
	}
}
