package com.jagex;

public class Class320_Sub29 extends Class320
{
	static int anInt8478;
	static int anInt8479;
	static int anInt8480;
	static Class192 aClass192_8481;
	static int anInt8482;
	static int anInt8483;
	static int anInt8484;
	static int anInt8485;
	protected boolean aBoolean8486 = false;
	static int anInt8487;
	static Widget aWidget8488 = null;
	static int anInt8489;
	private boolean aBoolean8490 = true;
	static int anInt8491;
	
	static final void method3788(int i, Class257 class257) {
		anInt8478++;
		Packet packet = Class218.worldResponseBuffer.aPacket1570;
		if (class257 == Class189_Sub1.aClass257_6882) {
			int i_0_ = packet.method2233(255);
			int i_1_ = (0x7 & i_0_) + Node_Sub21.anInt7184;
			int i_2_ = Class320_Sub4.anInt8243 + i_1_;
			int i_3_ = Class333.anInt4155 - -(i_0_ >> 4 & 0x7);
			int i_4_ = Node_Sub53.anInt7668 + i_3_;
			int i_5_ = packet.method2219(-130546744);
			int i_6_ = packet.method2219(-130546744);
			int i_7_ = packet.method2219(i ^ ~0x7c7fc37);
			if (Class266.aHashTable3380 != null) {
				Node_Sub11 node_sub11 = (Node_Sub11) Class266.aHashTable3380.method1518(3512, (long) (Class50.anInt783 << 28 | i_2_ << 14 | i_4_));
				if (node_sub11 != null) {
					for (Node_Sub8 node_sub8 = (Node_Sub8) node_sub11.aClass312_7104.method3613(65280); node_sub8 != null; node_sub8 = (Node_Sub8) node_sub11.aClass312_7104.method3620(16776960)) {
						if ((i_5_ & 0x7fff ^ 0xffffffff) == (node_sub8.anInt7065 ^ 0xffffffff) && node_sub8.anInt7067 == i_6_) {
							node_sub8.method2160((byte) 39);
							node_sub8.anInt7067 = i_7_;
							Node_Sub38_Sub1.method2789(Class50.anInt783, (byte) -108, i_2_, i_4_, node_sub8);
							break;
						}
					}
					if ((i_3_ ^ 0xffffffff) <= -1 && (i_1_ ^ 0xffffffff) <= -1 && Node_Sub54.anInt7675 > i_3_ && (Class377_Sub1.anInt8774 ^ 0xffffffff) < (i_1_ ^ 0xffffffff)) {
						Node_Sub36.method2750(false, Class50.anInt783, i_1_, i_3_);
					}
				}
			}
		} else if (Node_Sub38_Sub17.aClass257_10270 == class257) {
			int i_8_ = packet.method2211(4255);
			int i_9_ = i_8_ >> 2;
			int i_10_ = Node_Sub38_Sub13.anIntArray10232[i_9_];
			int i_11_ = packet.method2233(i ^ 0xff);
			int i_12_ = packet.method2213((byte) 110);
			int i_13_ = Class333.anInt4155 + ((0x71 & i_12_) >> 4);
			int i_14_ = (i_12_ & 0x7) + Node_Sub21.anInt7184;
			int i_15_ = packet.method2209((byte) 102);
			if (i_9_ == 11) {
				i_9_ = 10;
			}
			ObjectDefinition objectdefinition = Class186.aClass112_2256.method1145(i_15_, 87);
			int i_16_ = 0;
			if (objectdefinition.aByteArray2967 != null) {
				int i_17_ = -1;
				for (int i_18_ = 0; objectdefinition.aByteArray2967.length > i_18_; i_18_++) {
					if (objectdefinition.aByteArray2967[i_18_] == i_9_) {
						i_17_ = i_18_;
						break;
					}
				}
				i_16_ = objectdefinition.anIntArrayArray3031[i_17_].length;
			}
			int i_19_ = 0;
			if (objectdefinition.aShortArray3025 != null) {
				i_19_ = objectdefinition.aShortArray3025.length;
			}
			int i_20_ = 0;
			if (objectdefinition.aShortArray2988 != null) {
				i_20_ = objectdefinition.aShortArray2988.length;
			}
			if ((i_11_ & 0x1 ^ 0xffffffff) != -2) {
				int[] is = null;
				if ((0x2 & i_11_ ^ 0xffffffff) == -3) {
					is = new int[i_16_];
					for (int i_21_ = 0; (i_16_ ^ 0xffffffff) < (i_21_ ^ 0xffffffff); i_21_++)
						is[i_21_] = packet.method2219(-130546744);
				}
				short[] ses = null;
				if ((i_11_ & 0x4 ^ 0xffffffff) == -5) {
					ses = new short[i_19_];
					for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > (i_19_ ^ 0xffffffff); i_22_++)
						ses[i_22_] = (short) packet.method2219(-130546744);
				}
				short[] ses_23_ = null;
				if ((0x8 & i_11_) == 8) {
					ses_23_ = new short[i_20_];
					for (int i_24_ = 0; (i_20_ ^ 0xffffffff) < (i_24_ ^ 0xffffffff); i_24_++)
						ses_23_[i_24_] = (short) packet.method2219(-130546744);
				}
				Class320_Sub12.method3727(new Class121(Class187.aLong2275++, is, ses, ses_23_), (byte) -126, Class50.anInt783, i_10_, i_13_, i_14_);
			} else {
				Class320_Sub12.method3727(null, (byte) 65, Class50.anInt783, i_10_, i_13_, i_14_);
			}
		} else if (class257 == Class225.aClass257_2674) {
			int i_25_ = packet.method2243(false);
			if (i_25_ == 65535) {
				i_25_ = -1;
			}
			int i_26_ = packet.method2211(4255);
			int i_27_ = Class333.anInt4155 - -(0x7 & i_26_ >> 4);
			int i_28_ = (i_26_ & 0x7) + Node_Sub21.anInt7184;
			int i_29_ = packet.method2233(255);
			int i_30_ = i_29_ >> 2;
			int i_31_ = i_29_ & 0x3;
			int i_32_ = Node_Sub38_Sub13.anIntArray10232[i_30_];
			Class110.method1131(Class50.anInt783, i_28_, i_30_, i_25_, i_27_, i_31_, -4, i_32_);
		} else if (class257 == Node_Sub38_Sub15.aClass257_10262) {
			int i_33_ = packet.method2219(-130546744);
			int i_34_ = packet.method2233(255);
			Class186.aClass112_2256.method1145(i_33_, i + 82).method3041(i_34_, 86);
		} else if (i == 0) {
			if (class257 == Node_Sub37.aClass257_7443) {
				int i_35_ = packet.method2233(255);
				int i_36_ = Class333.anInt4155 - -(0x7 & i_35_ >> 4);
				int i_37_ = (i_35_ & 0x7) + Node_Sub21.anInt7184;
				int i_38_ = packet.method2219(-130546744);
				if (i_38_ == 65535) {
					i_38_ = -1;
				}
				int i_39_ = packet.method2233(i ^ 0xff);
				int i_40_ = 0xf & i_39_ >> 4;
				int i_41_ = i_39_ & 0x7;
				int i_42_ = packet.method2233(255);
				int i_43_ = packet.method2233(255);
				int i_44_ = packet.method2219(-130546744);
				if (i_36_ >= 0 && (i_37_ ^ 0xffffffff) <= -1 && (i_36_ ^ 0xffffffff) > (Node_Sub54.anInt7675 ^ 0xffffffff) && (Class377_Sub1.anInt8774 ^ 0xffffffff) < (i_37_ ^ 0xffffffff)) {
					int i_45_ = i_40_ - -1;
					if (-i_45_ + i_36_ <= Class295.aPlayer3692.anIntArray10910[0] && i_45_ + i_36_ >= Class295.aPlayer3692.anIntArray10910[0] && Class295.aPlayer3692.anIntArray10908[0] >= -i_45_ + i_37_ && (i_45_ + i_37_ ^ 0xffffffff) <= (Class295.aPlayer3692.anIntArray10908[0] ^ 0xffffffff)) {
						Class95.method1067(i_43_, i_42_, (byte) 35, i_38_, i_41_, i_44_, i_40_ + ((i_37_ << 8) + (Class50.anInt783 << 24)) - -(i_36_ << 16));
					}
				}
			} else if (class257 == Node_Sub15_Sub9.aClass257_9838) {
				int i_46_ = packet.method2233(255);
				int i_47_ = Class333.anInt4155 - -(i_46_ >> 4 & 0x7);
				int i_48_ = (i_46_ & 0x7) + Node_Sub21.anInt7184;
				int i_49_ = packet.method2233(255);
				int i_50_ = i_49_ >> 2;
				int i_51_ = i_49_ & 0x3;
				int i_52_ = Node_Sub38_Sub13.anIntArray10232[i_50_];
				int i_53_ = packet.method2224(-602457616);
				if (Class134_Sub1.method1581(Class61.anInt898, -25900) || (i_47_ ^ 0xffffffff) <= -1 && i_48_ >= 0 && Node_Sub54.anInt7675 > i_47_ && (Class377_Sub1.anInt8774 ^ 0xffffffff) < (i_48_ ^ 0xffffffff)) {
					Class262_Sub19.method3200(i_51_, i_53_, i_52_, i_47_, Class50.anInt783, i_50_, i_48_, false);
				}
			} else if (class257 == CacheNode_Sub1.aClass257_9421) {
				int i_54_ = packet.method2233(255);
				int i_55_ = Class333.anInt4155 * 2 + ((i_54_ & 0xfe) >> 4);
				int i_56_ = (0xf & i_54_) + 2 * Node_Sub21.anInt7184;
				int i_57_ = packet.method2233(255);
				boolean bool = (i_57_ & 0x1 ^ 0xffffffff) != -1;
				boolean bool_58_ = (0x2 & i_57_) != 0;
				int i_59_ = !bool_58_ ? -1 : i_57_ >> 2;
				int i_60_ = packet.method2214((byte) -64) + i_55_;
				int i_61_ = i_56_ + packet.method2214((byte) -68);
				int i_62_ = packet.method2193(-47);
				int i_63_ = packet.method2193(i ^ ~0x10);
				int i_64_ = packet.method2219(-130546744);
				int i_65_ = packet.method2233(255);
				if (!bool_58_) {
					i_65_ *= 4;
				} else {
					i_65_ = (byte) i_65_;
				}
				int i_66_ = 4 * packet.method2233(255);
				int i_67_ = packet.method2219(i ^ ~0x7c7fc37);
				int i_68_ = packet.method2219(-130546744);
				int i_69_ = packet.method2233(255);
				int i_70_ = packet.method2219(-130546744);
				if (i_69_ == 255) {
					i_69_ = -1;
				}
				if (i_55_ >= 0 && (i_56_ ^ 0xffffffff) <= -1 && (i_55_ ^ 0xffffffff) > (Node_Sub54.anInt7675 * 2 ^ 0xffffffff) && i_56_ < Node_Sub54.anInt7675 * 2 && i_60_ >= 0 && i_61_ >= 0 && 2 * Class377_Sub1.anInt8774 > i_60_ && Class377_Sub1.anInt8774 * 2 > i_61_ && (i_64_ ^ 0xffffffff) != -65536) {
					i_60_ = 256 * i_60_;
					i_70_ <<= 2;
					i_56_ = 256 * i_56_;
					i_61_ *= 256;
					i_65_ <<= 2;
					i_66_ <<= 2;
					i_55_ *= 256;
					if ((i_62_ ^ 0xffffffff) != -1 && i_59_ != -1) {
						Actor actor = null;
						if ((i_62_ ^ 0xffffffff) <= -1) {
							int i_71_ = i_62_ + -1;
							Node_Sub41 node_sub41 = (Node_Sub41) Class12.aHashTable187.method1518(3512, (long) i_71_);
							if (node_sub41 != null) {
								actor = node_sub41.aNpc7518;
							}
						} else {
							int i_72_ = -1 + -i_62_;
							if (i_72_ != Class166.anInt5099) {
								actor = Class270_Sub2.aPlayerArray8038[i_72_];
							} else {
								actor = Class295.aPlayer3692;
							}
						}
						if (actor != null) {
							Class259 class259 = actor.method868((byte) -123);
							if (class259.anIntArrayArray3273 != null && class259.anIntArrayArray3273[i_59_] != null) {
								i_65_ -= class259.anIntArrayArray3273[i_59_][1];
							}
							if (class259.anIntArrayArray3249 != null && class259.anIntArrayArray3249[i_59_] != null) {
								i_65_ -= class259.anIntArrayArray3249[i_59_][1];
							}
						}
					}
					Mobile_Sub1 mobile_sub1 = new Mobile_Sub1(i_64_, Class50.anInt783, Class50.anInt783, i_55_, i_56_, i_65_, i_67_ - -Class174.anInt2092, Class174.anInt2092 + i_68_, i_69_, i_70_, i_62_, i_63_, i_66_, bool, i_59_);
					mobile_sub1.method895(Node_Sub38_Sub7.method2809(Class50.anInt783, -29754, i_61_, i_60_) - i_66_, false, i_67_ + Class174.anInt2092, i_61_, i_60_);
					Class270.aClass312_3477.method3625((byte) -54, new CacheNode_Sub12(mobile_sub1));
				}
			} else if (Class46.aClass257_674 == class257) {
				int i_73_ = packet.method2224(-602457616);
				int i_74_ = packet.method2211(i + 4255);
				int i_75_ = Node_Sub21.anInt7184 + (i_74_ & 0x7);
				int i_76_ = i_75_ - -Class320_Sub4.anInt8243;
				int i_77_ = Class333.anInt4155 - -((0x7e & i_74_) >> 4);
				int i_78_ = Node_Sub53.anInt7668 + i_77_;
				int i_79_ = packet.method2209((byte) 126);
				int i_80_ = packet.method2219(-130546744);
				if (i_73_ != Class166.anInt5099) {
					boolean bool = i_77_ >= 0 && i_75_ >= 0 && Node_Sub54.anInt7675 > i_77_ && (i_75_ ^ 0xffffffff) > (Class377_Sub1.anInt8774 ^ 0xffffffff);
					if (bool || Class134_Sub1.method1581(Class61.anInt898, i + -25900)) {
						Node_Sub38_Sub1.method2789(Class50.anInt783, (byte) -108, i_76_, i_78_, new Node_Sub8(i_79_, i_80_));
						if (bool) {
							Node_Sub36.method2750(false, Class50.anInt783, i_75_, i_77_);
						}
					}
				}
			} else if (client.aClass257_5467 == class257) {
				int i_81_ = packet.method2233(255);
				int i_82_ = ((0x76 & i_81_) >> 4) + Class333.anInt4155;
				int i_83_ = (0x7 & i_81_) + Node_Sub21.anInt7184;
				int i_84_ = packet.method2219(-130546744);
				if (i_84_ == 65535) {
					i_84_ = -1;
				}
				int i_85_ = packet.method2233(255);
				int i_86_ = 0xf & i_85_ >> 4;
				int i_87_ = i_85_ & 0x7;
				int i_88_ = packet.method2233(255);
				int i_89_ = packet.method2233(255);
				int i_90_ = packet.method2219(-130546744);
				if (i_82_ >= 0 && i_83_ >= 0 && Node_Sub54.anInt7675 > i_82_ && (Class377_Sub1.anInt8774 ^ 0xffffffff) < (i_83_ ^ 0xffffffff)) {
					int i_91_ = 1 + i_86_;
					if (Class295.aPlayer3692.anIntArray10910[0] >= -i_91_ + i_82_ && (i_91_ + i_82_ ^ 0xffffffff) <= (Class295.aPlayer3692.anIntArray10910[0] ^ 0xffffffff) && (Class295.aPlayer3692.anIntArray10908[0] ^ 0xffffffff) <= (-i_91_ + i_83_ ^ 0xffffffff) && Class295.aPlayer3692.anIntArray10908[0] <= i_83_ + i_91_) {
						Node_Sub13.method2549(i_87_, i_88_, i_86_ + (i_83_ << 8) + ((Class50.anInt783 << 24) + (i_82_ << 16)), i + -620649727, false, i_90_, i_89_, i_84_);
					}
				}
			} else if (class257 == Class169_Sub2.aClass257_8804) {
				int i_92_ = packet.method2219(-130546744);
				int i_93_ = packet.method2233(255);
				int i_94_ = (0x7 & i_93_) + Node_Sub21.anInt7184;
				int i_95_ = i_94_ - -Class320_Sub4.anInt8243;
				int i_96_ = (i_93_ >> 4 & 0x7) + Class333.anInt4155;
				int i_97_ = i_96_ - -Node_Sub53.anInt7668;
				Node_Sub11 node_sub11 = (Node_Sub11) Class266.aHashTable3380.method1518(i ^ 0xdb8, (long) (i_95_ << 14 | Class50.anInt783 << 28 | i_97_));
				if (node_sub11 != null) {
					for (Node_Sub8 node_sub8 = (Node_Sub8) node_sub11.aClass312_7104.method3613(i ^ 0xff00); node_sub8 != null; node_sub8 = (Node_Sub8) node_sub11.aClass312_7104.method3620(i + 16776960)) {
						if (node_sub8.anInt7065 == (i_92_ & 0x7fff)) {
							node_sub8.method2160((byte) 111);
							break;
						}
					}
					if (node_sub11.aClass312_7104.method3616(i)) {
						node_sub11.method2160((byte) 127);
					}
					if (i_96_ >= 0 && (i_94_ ^ 0xffffffff) <= -1 && i_96_ < Node_Sub54.anInt7675 && i_94_ < Class377_Sub1.anInt8774) {
						Node_Sub36.method2750(false, Class50.anInt783, i_94_, i_96_);
					}
				}
			} else if (Class262_Sub13.aClass257_7801 == class257) {
				packet.method2233(i ^ 0xff);
				int i_98_ = packet.method2233(255);
				int i_99_ = Class333.anInt4155 - -((0x74 & i_98_) >> 4);
				int i_100_ = (0x7 & i_98_) + Node_Sub21.anInt7184;
				int i_101_ = packet.method2219(-130546744);
				int i_102_ = packet.method2233(255);
				int i_103_ = packet.method2220(i ^ 0x6c7753eb);
				String string = packet.method2195(-1);
				r.method2360(-22840, Class50.anInt783, i_101_, string, i_103_, i_102_, i_99_, i_100_);
			} else if (Actor.aClass257_10823 == class257) {
				int i_104_ = packet.method2233(255);
				boolean bool = (i_104_ & 0x80 ^ 0xffffffff) != -1;
				int i_105_ = Class333.anInt4155 - -(i_104_ >> 3 & 0x7);
				int i_106_ = (0x7 & i_104_) + Node_Sub21.anInt7184;
				int i_107_ = i_105_ + packet.method2214((byte) -66);
				int i_108_ = i_106_ - -packet.method2214((byte) 27);
				int i_109_ = packet.method2193(-119);
				int i_110_ = packet.method2219(-130546744);
				int i_111_ = 4 * packet.method2233(i + 255);
				int i_112_ = 4 * packet.method2233(255);
				int i_113_ = packet.method2219(-130546744);
				int i_114_ = packet.method2219(i ^ ~0x7c7fc37);
				int i_115_ = packet.method2233(255);
				int i_116_ = packet.method2219(-130546744);
				if (i_115_ == 255) {
					i_115_ = -1;
				}
				if ((i_105_ ^ 0xffffffff) <= -1 && (i_106_ ^ 0xffffffff) <= -1 && (Node_Sub54.anInt7675 ^ 0xffffffff) < (i_105_ ^ 0xffffffff) && i_106_ < Class377_Sub1.anInt8774 && i_107_ >= 0 && i_108_ >= 0 && (Node_Sub54.anInt7675 ^ 0xffffffff) < (i_107_ ^ 0xffffffff) && i_108_ < Class377_Sub1.anInt8774 && (i_110_ ^ 0xffffffff) != -65536) {
					i_108_ = 256 + i_108_ * 512;
					i_116_ <<= 2;
					i_111_ <<= 2;
					i_105_ = 256 + i_105_ * 512;
					i_112_ <<= 2;
					i_107_ = 256 + i_107_ * 512;
					i_106_ = i_106_ * 512 - -256;
					Mobile_Sub1 mobile_sub1 = new Mobile_Sub1(i_110_, Class50.anInt783, Class50.anInt783, i_105_, i_106_, i_111_, i_113_ - -Class174.anInt2092, i_114_ + Class174.anInt2092, i_115_, i_116_, 0, i_109_, i_112_, bool, -1);
					mobile_sub1.method895(-i_112_ + Node_Sub38_Sub7.method2809(Class50.anInt783, -29754, i_108_, i_107_), false, Class174.anInt2092 + i_113_, i_108_, i_107_);
					Class270.aClass312_3477.method3625((byte) -54, new CacheNode_Sub12(mobile_sub1));
				}
			} else if (Class66_Sub1.aClass257_8984 == class257) {
				int i_117_ = packet.method2238(true);
				int i_118_ = Class333.anInt4155 + (i_117_ >> 4 & 0x7);
				int i_119_ = (i_117_ & 0x7) + Node_Sub21.anInt7184;
				int i_120_ = packet.method2233(255);
				int i_121_ = i_120_ >> 2;
				int i_122_ = 0x3 & i_120_;
				int i_123_ = Node_Sub38_Sub13.anIntArray10232[i_121_];
				if (Class134_Sub1.method1581(Class61.anInt898, -25900) || i_118_ >= 0 && i_119_ >= 0 && Node_Sub54.anInt7675 > i_118_ && i_119_ < Class377_Sub1.anInt8774) {
					Class262_Sub19.method3200(i_122_, -1, i_123_, i_118_, Class50.anInt783, i_121_, i_119_, false);
				}
			} else if (Class12.aClass257_198 == class257) {
				int i_124_ = packet.method2238(true);
				int i_125_ = Node_Sub21.anInt7184 - -(0x7 & i_124_);
				int i_126_ = i_125_ + Class320_Sub4.anInt8243;
				int i_127_ = (i_124_ >> 4 & 0x7) + Class333.anInt4155;
				int i_128_ = Node_Sub53.anInt7668 + i_127_;
				int i_129_ = packet.method2224(-602457616);
				int i_130_ = packet.method2219(-130546744);
				boolean bool = i_127_ >= 0 && i_125_ >= 0 && (i_127_ ^ 0xffffffff) > (Node_Sub54.anInt7675 ^ 0xffffffff) && i_125_ < Class377_Sub1.anInt8774;
				if (bool || Class134_Sub1.method1581(Class61.anInt898, -25900)) {
					Node_Sub38_Sub1.method2789(Class50.anInt783, (byte) -108, i_126_, i_128_, new Node_Sub8(i_129_, i_130_));
					if (bool) {
						Node_Sub36.method2750(false, Class50.anInt783, i_125_, i_127_);
					}
				}
			} else if (class257 == Class262_Sub23.aClass257_7883) {
				int i_131_ = packet.method2233(i ^ 0xff);
				int i_132_ = Class333.anInt4155 + (0x7 & i_131_ >> 4);
				int i_133_ = (0x7 & i_131_) + Node_Sub21.anInt7184;
				int i_134_ = packet.method2219(-130546744);
				if (i_134_ == 65535) {
					i_134_ = -1;
				}
				int i_135_ = packet.method2233(255);
				int i_136_ = packet.method2219(-130546744);
				int i_137_ = packet.method2233(i ^ 0xff);
				if ((i_132_ ^ 0xffffffff) <= -1 && (i_133_ ^ 0xffffffff) <= -1 && i_132_ < Node_Sub54.anInt7675 && (Class377_Sub1.anInt8774 ^ 0xffffffff) < (i_133_ ^ 0xffffffff)) {
					if (i_134_ == -1) {
						CacheNode_Sub18 cachenode_sub18 = (CacheNode_Sub18) Class20_Sub1.aHashTable5508.method1518(3512, (long) (i_132_ << 16 | i_133_));
						if (cachenode_sub18 != null) {
							cachenode_sub18.aMobile_Sub4_9606.method914(-128);
							cachenode_sub18.method2160((byte) 123);
						}
					} else {
						int i_138_ = 256 + 512 * i_132_;
						int i_139_ = 512 * i_133_ + 256;
						int i_140_ = Class50.anInt783;
						if (i_140_ < 3 && Class238.method3021(i_133_, i_132_, 112)) {
							i_140_++;
						}
						Mobile_Sub4 mobile_sub4 = new Mobile_Sub4(i_134_, i_136_, Class50.anInt783, i_140_, i_138_, Node_Sub38_Sub7.method2809(Class50.anInt783, -29754, i_139_, i_138_) - i_135_, i_139_, i_132_, i_132_, i_133_, i_133_, i_137_, false);
						Class20_Sub1.aHashTable5508.method1515((long) (i_132_ << 16 | i_133_), new CacheNode_Sub18(mobile_sub4), i ^ ~0x7d);
					}
				}
			} else {
				ClanChat.method507(null, "T3 - " + class257, i ^ ~0x74);
				Class127.method1542(11582, false);
			}
		}
	}
	
	final boolean method3789(int i) {
		anInt8484++;
		if (i != -1) {
			aBoolean8486 = false;
		}
		return aBoolean8490;
	}
	
	static final void method3790(byte b) {
		anInt8491++;
		Class359.anInt4467 = -1;
		if (b != -56) {
			aClass192_8481 = null;
		}
		Class262_Sub20.anInt7861 = 0;
		Node_Sub15_Sub4.anInt9798 = -1;
	}
	
	final int method3791(boolean bool) {
		anInt8480++;
		if (bool != false) {
			aBoolean8486 = true;
		}
		return anInt4064;
	}
	
	final void method3673(byte b) {
		if (b > -35) {
			aBoolean8486 = false;
		}
		if (!aNode_Sub27_4063.method2694(-13725).method1883(55)) {
			anInt4064 = 0;
		}
		anInt8485++;
		if (anInt4064 < 0 || anInt4064 > 5) {
			anInt4064 = method3677(0);
		}
	}
	
	public static void method3792(boolean bool) {
		aWidget8488 = null;
		aClass192_8481 = null;
		if (bool != true) {
			method3788(24, null);
		}
	}
	
	Class320_Sub29(int i, Node_Sub27 node_sub27) {
		super(i, node_sub27);
	}
	
	Class320_Sub29(Node_Sub27 node_sub27) {
		super(node_sub27);
	}
	
	final int method3677(int i) {
		if (i != 0) {
			return 37;
		}
		aBoolean8486 = true;
		anInt8482++;
		if (!aNode_Sub27_4063.method2694(-13725).method1883(38)) {
			return 0;
		}
		return 2;
	}
	
	final void method3676(boolean bool, int i) {
		aBoolean8486 = bool;
		anInt8487++;
		anInt4064 = i;
	}
	
	final boolean method3793(byte b) {
		anInt8483++;
		if (!aNode_Sub27_4063.method2694(-13725).method1883(101)) {
			return false;
		}
		if (b < 63) {
			aBoolean8490 = false;
		}
		return true;
	}
	
	final void method3794(boolean bool, byte b) {
		aBoolean8490 = bool;
		anInt8489++;
		if (b != 99) {
			aWidget8488 = null;
		}
	}
	
	final int method3675(int i, byte b) {
		anInt8479++;
		if (!aNode_Sub27_4063.method2694(b ^ ~0x35aa).method1883(88)) {
			return 3;
		}
		if (b != 54) {
			method3793((byte) 1);
		}
		if (i == 3 && !Class235.method2157("jagdx", b + -7800)) {
			return 3;
		}
		return 2;
	}
	
	static {
		aClass192_8481 = new Class192(108, 12);
	}
}
