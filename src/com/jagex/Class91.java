package com.jagex;

public class Class91
{
	protected int anInt1202;
	protected byte aByte1203;
	protected boolean aBoolean1204;
	protected boolean aBoolean1205;
	protected int anInt1206;
	protected byte aByte1207;
	static int anInt1208;
	static int anInt1209;
	protected boolean aBoolean1210;
	protected byte aByte1211;
	protected boolean aBoolean1212;
	protected byte aByte1213;
	protected byte aByte1214;
	protected boolean aBoolean1215;
	protected boolean aBoolean1216;
	protected byte aByte1217;
	static Class192 aClass192_1218 = new Class192(22, 10);
	static int anInt1219;
	static Class318 aClass318_1220 = new Class318(33, 0);
	protected short aShort1221;
	protected boolean aBoolean1222;
	protected boolean aBoolean1223;
	static int anInt1224;
	protected byte aByte1225;
	protected int anInt1226;
	static int anInt1227;
	static long[][][] aLongArrayArrayArray1228;
	
	static final void method1032(int i, Player player, int i_0_, Packet packet, int i_1_) {
		anInt1209++;
		byte b = -1;
		if ((0x8000 & i_1_) != 0) {
			int i_2_ = packet.method2233(255);
			int[] is = new int[i_2_];
			int[] is_3_ = new int[i_2_];
			int[] is_4_ = new int[i_2_];
			for (int i_5_ = 0; i_2_ > i_5_; i_5_++) {
				int i_6_ = packet.method2219(-130546744);
				if (i_6_ == 65535) {
					i_6_ = -1;
				}
				is[i_5_] = i_6_;
				is_3_[i_5_] = packet.method2238(true);
				is_4_[i_5_] = packet.method2243(false);
			}
			Node_Sub38_Sub13.method2831(is_4_, -31813, is, is_3_, player);
		}
		if ((0x40 & i_1_ ^ 0xffffffff) != -1) {
			int[] is = new int[4];
			for (int i_7_ = 0; i_7_ < 4; i_7_++) {
				is[i_7_] = packet.method2209((byte) -125);
				if ((is[i_7_] ^ 0xffffffff) == -65536) {
					is[i_7_] = -1;
				}
			}
			int i_8_ = packet.method2211(4255);
			Class352.method4011(is, i_8_, false, player, -63);
		}
		if ((i_1_ & 0x40000) != 0) {
			int i_9_ = packet.method2243(false);
			int i_10_ = packet.method2208(true);
			if (i_9_ == 65535) {
				i_9_ = -1;
			}
			int i_11_ = packet.method2238(true);
			int i_12_ = 0x7 & i_11_;
			int i_13_ = 0xf & i_11_ >> 3;
			if (i_13_ == 15) {
				i_13_ = -1;
			}
			boolean bool = ((i_11_ & 0xca) >> 7 ^ 0xffffffff) == -2;
			player.method860(2, i_12_, bool, i_10_, i_13_, i_9_, -108);
		}
		if ((i_1_ & 0x20000 ^ 0xffffffff) != -1) {
			player.aByte10896 = packet.method2185(false);
			player.aByte10878 = packet.method2185(false);
			player.aByte10884 = packet.method2236(i + -735307887);
			player.aByte10888 = (byte) packet.method2233(255);
			player.anInt10895 = Class174.anInt2092 - -packet.method2243(false);
			player.anInt10882 = Class174.anInt2092 + packet.method2219(-130546744);
		}
		if ((0x200 & i_1_) != 0) {
			b = packet.method2236(-735307888);
		}
		if ((0x2000 & i_1_ ^ 0xffffffff) != -1) {
			int i_14_ = packet.method2224(-602457616);
			player.anInt10856 = packet.method2233(i ^ ~0xff);
			player.anInt10848 = packet.method2238(true);
			player.aBoolean10871 = (i_14_ & 0x8000 ^ 0xffffffff) != -1;
			player.anInt10855 = i_14_ & 0x7fff;
			player.anInt10835 = player.anInt10856 + player.anInt10855 + Class174.anInt2092;
		}
		if ((0x80000 & i_1_ ^ 0xffffffff) != -1) {
			int i_15_ = packet.method2209((byte) 13);
			int i_16_ = packet.method2208(true);
			if ((i_15_ ^ 0xffffffff) == -65536) {
				i_15_ = -1;
			}
			int i_17_ = packet.method2238(true);
			int i_18_ = 0x7 & i_17_;
			int i_19_ = (i_17_ & 0x7c) >> 3;
			if ((i_19_ ^ 0xffffffff) == -16) {
				i_19_ = -1;
			}
			boolean bool = (i_17_ & 0xac) >> 7 == 1;
			player.method860(3, i_18_, bool, i_16_, i_19_, i_15_, -86);
		}
		if ((0x100000 & i_1_ ^ 0xffffffff) != -1) {
			player.aBoolean11135 = (packet.method2238(true) ^ 0xffffffff) == -2;
		}
		if ((0x4 & i_1_ ^ 0xffffffff) != -1) {
			int i_20_ = packet.method2233(i ^ ~0xff);
			if ((i_20_ ^ 0xffffffff) < -1) {
				for (int i_21_ = 0; i_21_ < i_20_; i_21_++) {
					int i_22_ = -1;
					int i_23_ = -1;
					int i_24_ = packet.method2227(true);
					int i_25_ = -1;
					if (i_24_ == 32767) {
						i_24_ = packet.method2227(true);
						i_23_ = packet.method2227(true);
						i_22_ = packet.method2227(true);
						i_25_ = packet.method2227(true);
					} else if (i_24_ == 32766) {
						i_24_ = -1;
					} else {
						i_23_ = packet.method2227(true);
					}
					int i_26_ = packet.method2227(true);
					int i_27_ = packet.method2238(true);
					player.method852(i_25_, i_26_, i_27_, (byte) -122, i_23_, Class174.anInt2092, i_22_, i_24_);
				}
			}
		}
		if ((i_1_ & 0x10000 ^ 0xffffffff) != -1) {
			int i_28_ = packet.method2213((byte) 125);
			int[] is = new int[i_28_];
			int[] is_29_ = new int[i_28_];
			for (int i_30_ = 0; (i_30_ ^ 0xffffffff) > (i_28_ ^ 0xffffffff); i_30_++) {
				int i_31_ = packet.method2224(-602457616);
				if ((i_31_ & 0xc000) != 49152) {
					is[i_30_] = i_31_;
				} else {
					int i_32_ = packet.method2219(-130546744);
					is[i_30_] = Node_Sub16.method2590(i_32_, i_31_ << 16);
				}
				is_29_[i_30_] = packet.method2224(Node_Sub19.method2612(i, 602457615));
			}
			player.method866(is_29_, is, (byte) 103);
		}
		if ((0x8 & i_1_) != 0) {
			int i_33_ = packet.method2213((byte) 104);
			byte[] bs = new byte[i_33_];
			Buffer buffer = new Buffer(bs);
			packet.method2181(0, i_33_, bs, i + -19416);
			Class249.aBufferArray3154[i_0_] = buffer;
			player.method889(buffer, i + 1);
		}
		if ((i_1_ & 0x4000 ^ 0xffffffff) != -1) {
			String string = packet.method2195(i);
			if (string.charAt(0) == '~') {
				string = string.substring(1);
				Class28.method331(string, player.method893(false, true), -110, 0, player.aString11132, player.method891(false, i + 2), 2);
			} else if (player == Class295.aPlayer3692) {
				Class28.method331(string, player.method893(false, true), i + -62, 0, player.aString11132, player.method891(false, 1), 2);
			}
			player.method882(0, 0, string, (byte) 117);
		}
		if ((i_1_ & 0x400) != 0) {
			player.aBoolean11157 = packet.method2213((byte) 102) == 1;
		}
		if ((0x1 & i_1_ ^ 0xffffffff) != -1) {
			Class73.aByteArray981[i_0_] = packet.method2185(false);
		}
		if ((i_1_ & 0x10 ^ 0xffffffff) != i) {
			int i_34_ = packet.method2224(i + -602457615);
			if (i_34_ == 65535) {
				i_34_ = -1;
			}
			player.anInt10838 = i_34_;
		}
		if ((i_1_ & 0x1000 ^ 0xffffffff) != -1) {
			player.anInt10879 = packet.method2185(false);
			player.anInt10883 = packet.method2214((byte) 124);
			player.anInt10897 = packet.method2242((byte) -12);
			player.anInt10891 = packet.method2242((byte) -12);
			player.anInt10892 = packet.method2209((byte) 14) - -Class174.anInt2092;
			player.anInt10887 = packet.method2243(false) + Class174.anInt2092;
			player.anInt10885 = packet.method2211(i + 4256);
			if (!player.aBoolean11156) {
				player.anInt10897 += player.anIntArray10910[0];
				player.anInt10904 = 1;
				player.anInt10891 += player.anIntArray10908[0];
				player.anInt10883 += player.anIntArray10908[0];
				player.anInt10879 += player.anIntArray10910[0];
			} else {
				player.anInt10904 = 0;
				player.anInt10891 += player.anInt11160;
				player.anInt10879 += player.anInt11147;
				player.anInt10883 += player.anInt11160;
				player.anInt10897 += player.anInt11147;
			}
			player.anInt10900 = 0;
		}
		if ((0x20 & i_1_) != 0) {
			player.anInt11180 = packet.method2219(-130546744);
			if ((player.anInt10904 ^ 0xffffffff) == -1) {
				player.method856((byte) -107, player.anInt11180);
				player.anInt11180 = -1;
			}
		}
		if ((0x2 & i_1_) != 0) {
			int i_35_ = packet.method2219(i ^ 0x7c7fc37);
			int i_36_ = packet.method2176((byte) -119);
			if ((i_35_ ^ 0xffffffff) == -65536) {
				i_35_ = -1;
			}
			int i_37_ = packet.method2211(i + 4256);
			int i_38_ = 0x7 & i_37_;
			int i_39_ = i_37_ >> 3 & 0xf;
			if (i_39_ == 15) {
				i_39_ = -1;
			}
			boolean bool = (i_37_ & 0xd8) >> 7 == 1;
			player.method860(0, i_38_, bool, i_36_, i_39_, i_35_, -81);
		}
		if ((i_1_ & 0x100) != 0) {
			int i_40_ = packet.method2243(false);
			if (i_40_ == 65535) {
				i_40_ = -1;
			}
			int i_41_ = packet.method2208(true);
			int i_42_ = packet.method2238(true);
			int i_43_ = 0x7 & i_42_;
			int i_44_ = (0x7c & i_42_) >> 3;
			if ((i_44_ ^ 0xffffffff) == -16) {
				i_44_ = -1;
			}
			boolean bool = (i_42_ >> 7 & 0x1) == 1;
			player.method860(1, i_43_, bool, i_41_, i_44_, i_40_, -91);
		}
		if (player.aBoolean11156) {
			if ((b ^ 0xffffffff) != -128) {
				byte b_45_;
				if ((b ^ 0xffffffff) != 0) {
					b_45_ = b;
				} else {
					b_45_ = Class73.aByteArray981[i_0_];
				}
				Class372.method4103(65, player, b_45_);
				player.method894(player.anInt11160, player.anInt11147, i + -9379, b_45_);
			} else {
				player.method888(player.anInt11147, -89, player.anInt11160);
			}
		}
	}
	
	static final void method1033(int i, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_) {
		anInt1224++;
		if (i_50_ != Class213.aNode_Sub27_2512.aClass320_Sub25_7295.method3776(false) && i_48_ != 0 && (Class23.anInt434 ^ 0xffffffff) > -51 && (i_47_ ^ 0xffffffff) != 0) {
			Node_Sub38_Sub19.aClass78Array10284[Class23.anInt434++] = new Class78((byte) 1, i_47_, i_48_, i_46_, i_49_, 0, i, null);
		}
	}
	
	public static void method1034(byte b) {
		aClass192_1218 = null;
		aLongArrayArrayArray1228 = null;
		if (b < -7) {
			aClass318_1220 = null;
		}
	}
	
	static final void method1035(int i) {
		anInt1219++;
		Packet packet = Class218.worldResponseBuffer.aPacket1570;
		while ((packet.method2264(Class218.worldResponseBuffer.anInt1581, -92) ^ 0xffffffff) <= -16) {
			int i_51_ = packet.method2256((byte) -124, 15);
			if ((i_51_ ^ 0xffffffff) == -32768) {
				break;
			}
			boolean bool = false;
			Node_Sub41 node_sub41 = (Node_Sub41) Class12.aHashTable187.method1518(3512, (long) i_51_);
			if (node_sub41 == null) {
				Npc npc = new Npc();
				npc.anInt10858 = i_51_;
				node_sub41 = new Node_Sub41(npc);
				Class12.aHashTable187.method1515((long) i_51_, node_sub41, -123);
				Class314.aNode_Sub41Array4017[Node_Sub32.anInt7380++] = node_sub41;
				bool = true;
			}
			Npc npc = node_sub41.aNpc7518;
			Class54.anIntArray816[Node_Sub25_Sub3.anInt9987++] = i_51_;
			npc.anInt10880 = Plane.anInt3423;
			if (npc.aNpcDefinition11122 != null && npc.aNpcDefinition11122.method2998((byte) 91)) {
				Node_Sub38_Sub4.method2799(i + -107, npc);
			}
			int i_52_ = 0x3a6e & 4 + packet.method2256((byte) -125, 3) << 11;
			int i_53_ = packet.method2256((byte) -126, 1);
			if (i_53_ == 1) {
				Class194_Sub1_Sub1.anIntArray9370[Node_Sub38_Sub6.anInt10132++] = i_51_;
			}
			int i_54_ = packet.method2256((byte) -6, 5);
			if ((i_54_ ^ 0xffffffff) < -16) {
				i_54_ -= 32;
			}
			int i_55_ = packet.method2256((byte) -125, 2);
			npc.method879(Class366.aClass279_4526.method3376(packet.method2256((byte) 28, 15), (byte) 107), true);
			int i_56_ = packet.method2256((byte) -125, 5);
			if (i_56_ > 15) {
				i_56_ -= 32;
			}
			int i_57_ = packet.method2256((byte) 46, 1);
			npc.method861(-1000, npc.aNpcDefinition11122.anInt2811);
			npc.anInt10890 = npc.aNpcDefinition11122.anInt2876 << 3;
			if (bool) {
				npc.method849(i_52_, -62, true);
			}
			npc.method877(-15694, i_57_ == 1, i_54_ + Class295.aPlayer3692.anIntArray10908[0], i_56_ + Class295.aPlayer3692.anIntArray10910[0], i_55_, npc.method853((byte) 91));
			if (npc.aNpcDefinition11122.method2998((byte) 91)) {
				Class262_Sub1.method3150(npc.aByte5933, null, npc.anIntArray10910[0], npc.anIntArray10908[0], npc, null, (byte) -8, 0);
			}
		}
		packet.method2255(-1431454110);
		if (i != 4) {
			method1033(-63, -75, 81, -64, -90, 72);
		}
	}
	
	static final int method1036(int i, float f, float f_58_, float f_59_) {
		anInt1208++;
		if (i != 2) {
			method1034((byte) -50);
		}
		float f_60_ = !(f_58_ < 0.0F) ? f_58_ : -f_58_;
		float f_61_ = f_59_ < 0.0F ? -f_59_ : f_59_;
		float f_62_ = !(f < 0.0F) ? f : -f;
		if (!(f_61_ > f_60_) || !(f_62_ < f_61_)) {
			if (!(f_60_ < f_62_) || !(f_61_ < f_62_)) {
				if (f_58_ > 0.0F) {
					return 4;
				}
				return 5;
			}
			if (!(f > 0.0F)) {
				return 3;
			}
			return 2;
		}
		if (!(f_59_ > 0.0F)) {
			return 1;
		}
		return 0;
	}
}
