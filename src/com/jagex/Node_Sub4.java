package com.jagex;

public class Node_Sub4 extends Node
{
	protected HashTable aHashTable6950;
	protected byte[] aByteArray6951;
	
	static final Node_Sub4 method2173(Class302 class302, int i, int i_0_) {
		byte[] bs = class302.method3524(false, i_0_, i);
		if (bs == null) {
			return null;
		}
		return new Node_Sub4(new Buffer(bs));
	}
	
	final void method2174() {
		if (aHashTable6950 == null) {
			aHashTable6950 = new HashTable(16);
			int[] is = new int[16];
			int[] is_1_ = new int[16];
			is[9] = is_1_[9] = 128;
			Class27 class27 = new Class27(aByteArray6951);
			int i = class27.method330();
			for (int i_2_ = 0; i_2_ < i; i_2_++) {
				class27.method323(i_2_);
				class27.method329(i_2_);
				class27.method318(i_2_);
			}
		while_6_:
			for (;;) {
				int i_3_ = class27.method322();
				int i_4_ = class27.anIntArray459[i_3_];
				while (class27.anIntArray459[i_3_] == i_4_) {
					class27.method323(i_3_);
					int i_5_ = class27.method317(i_3_);
					if (i_5_ == 1) {
						class27.method324();
						class27.method318(i_3_);
						if (!class27.method328()) {
							break;
						}
						break while_6_;
					}
					int i_6_ = i_5_ & 0xf0;
					if (i_6_ == 176) {
						int i_7_ = i_5_ & 0xf;
						int i_8_ = i_5_ >> 8 & 0x7f;
						int i_9_ = i_5_ >> 16 & 0x7f;
						if (i_8_ == 0) {
							is[i_7_] = (is[i_7_] & ~0x1fc000) + (i_9_ << 14);
						}
						if (i_8_ == 32) {
							is[i_7_] = (is[i_7_] & ~0x3f80) + (i_9_ << 7);
						}
					}
					if (i_6_ == 192) {
						int i_10_ = i_5_ & 0xf;
						int i_11_ = i_5_ >> 8 & 0x7f;
						is_1_[i_10_] = is[i_10_] + i_11_;
					}
					if (i_6_ == 144) {
						int i_12_ = i_5_ & 0xf;
						int i_13_ = i_5_ >> 8 & 0x7f;
						int i_14_ = i_5_ >> 16 & 0x7f;
						if (i_14_ > 0) {
							int i_15_ = is_1_[i_12_];
							Node_Sub51 node_sub51 = (Node_Sub51) aHashTable6950.method1518(3512, (long) i_15_);
							if (node_sub51 == null) {
								node_sub51 = new Node_Sub51(new byte[128]);
								aHashTable6950.method1515((long) i_15_, node_sub51, -123);
							}
							node_sub51.aByteArray7631[i_13_] = (byte) 1;
						}
					}
					class27.method329(i_3_);
					class27.method318(i_3_);
				}
			}
		}
	}
	
	final void method2175() {
		aHashTable6950 = null;
	}
	
	private Node_Sub4(Buffer buffer) {
		buffer.anInt7002 = buffer.aByteArray7019.length - 3;
		int i = buffer.method2233(255);
		int i_16_ = buffer.method2219(-130546744);
		int i_17_ = 14 + i * 10;
		buffer.anInt7002 = 0;
		int i_18_ = 0;
		int i_19_ = 0;
		int i_20_ = 0;
		int i_21_ = 0;
		int i_22_ = 0;
		int i_23_ = 0;
		int i_24_ = 0;
		int i_25_ = 0;
	while_4_:
		for (int i_26_ = 0; i_26_ < i; i_26_++) {
			int i_27_ = -1;
			for (;;) {
				int i_28_ = buffer.method2233(255);
				if (i_28_ != i_27_) {
					i_17_++;
				}
				i_27_ = i_28_ & 0xf;
				if (i_28_ == 7) {
					continue while_4_;
				}
				if (i_28_ == 23) {
					i_18_++;
				} else if (i_27_ == 0) {
					i_20_++;
				} else if (i_27_ == 1) {
					i_21_++;
				} else if (i_27_ == 2) {
					i_19_++;
				} else if (i_27_ == 3) {
					i_22_++;
				} else if (i_27_ == 4) {
					i_23_++;
				} else if (i_27_ == 5) {
					i_24_++;
				} else {
					if (i_27_ != 6) {
						break;
					}
					i_25_++;
				}
			}
			throw new RuntimeException();
		}
		i_17_ += 5 * i_18_;
		i_17_ += 2 * (i_20_ + i_21_ + i_19_ + i_22_ + i_24_);
		i_17_ += i_23_ + i_25_;
		int i_29_ = buffer.anInt7002;
		int i_30_ = i + i_18_ + i_19_ + i_20_ + i_21_ + i_22_ + i_23_ + i_24_ + i_25_;
		for (int i_31_ = 0; i_31_ < i_30_; i_31_++)
			buffer.method2239(0);
		i_17_ += buffer.anInt7002 - i_29_;
		int i_32_ = buffer.anInt7002;
		int i_33_ = 0;
		int i_34_ = 0;
		int i_35_ = 0;
		int i_36_ = 0;
		int i_37_ = 0;
		int i_38_ = 0;
		int i_39_ = 0;
		int i_40_ = 0;
		int i_41_ = 0;
		int i_42_ = 0;
		int i_43_ = 0;
		int i_44_ = 0;
		int i_45_ = 0;
		for (int i_46_ = 0; i_46_ < i_19_; i_46_++) {
			i_45_ = i_45_ + buffer.method2233(255) & 0x7f;
			if (i_45_ == 0 || i_45_ == 32) {
				i_25_++;
			} else if (i_45_ == 1) {
				i_33_++;
			} else if (i_45_ == 33) {
				i_34_++;
			} else if (i_45_ == 7) {
				i_35_++;
			} else if (i_45_ == 39) {
				i_36_++;
			} else if (i_45_ == 10) {
				i_37_++;
			} else if (i_45_ == 42) {
				i_38_++;
			} else if (i_45_ == 99) {
				i_39_++;
			} else if (i_45_ == 98) {
				i_40_++;
			} else if (i_45_ == 101) {
				i_41_++;
			} else if (i_45_ == 100) {
				i_42_++;
			} else if (i_45_ == 64 || i_45_ == 65 || i_45_ == 120 || i_45_ == 121 || i_45_ == 123) {
				i_43_++;
			} else {
				i_44_++;
			}
		}
		int i_47_ = 0;
		int i_48_ = buffer.anInt7002;
		buffer.anInt7002 += i_43_;
		int i_49_ = buffer.anInt7002;
		buffer.anInt7002 += i_24_;
		int i_50_ = buffer.anInt7002;
		buffer.anInt7002 += i_23_;
		int i_51_ = buffer.anInt7002;
		buffer.anInt7002 += i_22_;
		int i_52_ = buffer.anInt7002;
		buffer.anInt7002 += i_33_;
		int i_53_ = buffer.anInt7002;
		buffer.anInt7002 += i_35_;
		int i_54_ = buffer.anInt7002;
		buffer.anInt7002 += i_37_;
		int i_55_ = buffer.anInt7002;
		buffer.anInt7002 += i_20_ + i_21_ + i_24_;
		int i_56_ = buffer.anInt7002;
		buffer.anInt7002 += i_20_;
		int i_57_ = buffer.anInt7002;
		buffer.anInt7002 += i_44_;
		int i_58_ = buffer.anInt7002;
		buffer.anInt7002 += i_21_;
		int i_59_ = buffer.anInt7002;
		buffer.anInt7002 += i_34_;
		int i_60_ = buffer.anInt7002;
		buffer.anInt7002 += i_36_;
		int i_61_ = buffer.anInt7002;
		buffer.anInt7002 += i_38_;
		int i_62_ = buffer.anInt7002;
		buffer.anInt7002 += i_25_;
		int i_63_ = buffer.anInt7002;
		buffer.anInt7002 += i_22_;
		int i_64_ = buffer.anInt7002;
		buffer.anInt7002 += i_39_;
		int i_65_ = buffer.anInt7002;
		buffer.anInt7002 += i_40_;
		int i_66_ = buffer.anInt7002;
		buffer.anInt7002 += i_41_;
		int i_67_ = buffer.anInt7002;
		buffer.anInt7002 += i_42_;
		int i_68_ = buffer.anInt7002;
		buffer.anInt7002 += i_18_ * 3;
		aByteArray6951 = new byte[i_17_];
		Buffer buffer_69_ = new Buffer(aByteArray6951);
		buffer_69_.method2179((byte) -5, 1297377380);
		buffer_69_.method2179((byte) -5, 6);
		buffer_69_.method2210(i > 1 ? 1 : 0, -42);
		buffer_69_.method2210(i, -124);
		buffer_69_.method2210(i_16_, -114);
		buffer.anInt7002 = i_29_;
		int i_70_ = 0;
		int i_71_ = 0;
		int i_72_ = 0;
		int i_73_ = 0;
		int i_74_ = 0;
		int i_75_ = 0;
		int i_76_ = 0;
		int[] is = new int[128];
		i_45_ = 0;
		for (int i_77_ = 0; i_77_ < i; i_77_++) {
			buffer_69_.method2179((byte) -5, 1297379947);
			buffer_69_.anInt7002 += 4;
			int i_78_ = buffer_69_.anInt7002;
			int i_79_ = -1;
		while_5_:
			do {
				for (;;) {
					int i_80_ = buffer.method2239(0);
					buffer_69_.method2232(65280, i_80_);
					int i_81_ = buffer.aByteArray7019[i_47_++] & 0xff;
					boolean bool = i_81_ != i_79_;
					i_79_ = i_81_ & 0xf;
					if (i_81_ == 7) {
						if (bool) {
							buffer_69_.method2226(255, false);
						}
						buffer_69_.method2226(47, false);
						buffer_69_.method2226(0, false);
						break while_5_;
					}
					if (i_81_ == 23) {
						if (bool) {
							buffer_69_.method2226(255, false);
						}
						buffer_69_.method2226(81, false);
						buffer_69_.method2226(3, false);
						buffer_69_.method2226(buffer.aByteArray7019[i_68_++], false);
						buffer_69_.method2226(buffer.aByteArray7019[i_68_++], false);
						buffer_69_.method2226(buffer.aByteArray7019[i_68_++], false);
					} else {
						i_70_ ^= i_81_ >> 4;
						if (i_79_ == 0) {
							if (bool) {
								buffer_69_.method2226(144 + i_70_, false);
							}
							i_71_ += buffer.aByteArray7019[i_55_++];
							i_72_ += buffer.aByteArray7019[i_56_++];
							buffer_69_.method2226(i_71_ & 0x7f, false);
							buffer_69_.method2226(i_72_ & 0x7f, false);
						} else if (i_79_ == 1) {
							if (bool) {
								buffer_69_.method2226(128 + i_70_, false);
							}
							i_71_ += buffer.aByteArray7019[i_55_++];
							i_73_ += buffer.aByteArray7019[i_58_++];
							buffer_69_.method2226(i_71_ & 0x7f, false);
							buffer_69_.method2226(i_73_ & 0x7f, false);
						} else if (i_79_ == 2) {
							if (bool) {
								buffer_69_.method2226(176 + i_70_, false);
							}
							i_45_ = i_45_ + buffer.aByteArray7019[i_32_++] & 0x7f;
							buffer_69_.method2226(i_45_, false);
							int i_82_;
							if (i_45_ == 0 || i_45_ == 32) {
								i_82_ = buffer.aByteArray7019[i_62_++];
							} else if (i_45_ == 1) {
								i_82_ = buffer.aByteArray7019[i_52_++];
							} else if (i_45_ == 33) {
								i_82_ = buffer.aByteArray7019[i_59_++];
							} else if (i_45_ == 7) {
								i_82_ = buffer.aByteArray7019[i_53_++];
							} else if (i_45_ == 39) {
								i_82_ = buffer.aByteArray7019[i_60_++];
							} else if (i_45_ == 10) {
								i_82_ = buffer.aByteArray7019[i_54_++];
							} else if (i_45_ == 42) {
								i_82_ = buffer.aByteArray7019[i_61_++];
							} else if (i_45_ == 99) {
								i_82_ = buffer.aByteArray7019[i_64_++];
							} else if (i_45_ == 98) {
								i_82_ = buffer.aByteArray7019[i_65_++];
							} else if (i_45_ == 101) {
								i_82_ = buffer.aByteArray7019[i_66_++];
							} else if (i_45_ == 100) {
								i_82_ = buffer.aByteArray7019[i_67_++];
							} else if (i_45_ == 64 || i_45_ == 65 || i_45_ == 120 || i_45_ == 121 || i_45_ == 123) {
								i_82_ = buffer.aByteArray7019[i_48_++];
							} else {
								i_82_ = buffer.aByteArray7019[i_57_++];
							}
							i_82_ += is[i_45_];
							is[i_45_] = i_82_;
							buffer_69_.method2226(i_82_ & 0x7f, false);
						} else if (i_79_ == 3) {
							if (bool) {
								buffer_69_.method2226(224 + i_70_, false);
							}
							i_74_ += buffer.aByteArray7019[i_63_++];
							i_74_ += buffer.aByteArray7019[i_51_++] << 7;
							buffer_69_.method2226(i_74_ & 0x7f, false);
							buffer_69_.method2226(i_74_ >> 7 & 0x7f, false);
						} else if (i_79_ == 4) {
							if (bool) {
								buffer_69_.method2226(208 + i_70_, false);
							}
							i_75_ += buffer.aByteArray7019[i_50_++];
							buffer_69_.method2226(i_75_ & 0x7f, false);
						} else if (i_79_ == 5) {
							if (bool) {
								buffer_69_.method2226(160 + i_70_, false);
							}
							i_71_ += buffer.aByteArray7019[i_55_++];
							i_76_ += buffer.aByteArray7019[i_49_++];
							buffer_69_.method2226(i_71_ & 0x7f, false);
							buffer_69_.method2226(i_76_ & 0x7f, false);
						} else {
							if (i_79_ != 6) {
								break;
							}
							if (bool) {
								buffer_69_.method2226(192 + i_70_, false);
							}
							buffer_69_.method2226(buffer.aByteArray7019[i_62_++], false);
						}
					}
				}
				throw new RuntimeException();
			} while (false);
			buffer_69_.method2204(buffer_69_.anInt7002 - i_78_, (byte) 127);
		}
	}
}
