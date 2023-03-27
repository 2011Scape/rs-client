package com.jagex;

public class Class324
{
	static Widget aWidget4085 = null;
	static int anInt4086;
	static int anInt4087;
	
	static final void method3812(int i, Packet packet, int i_0_) {
		anInt4086++;
		boolean bool = packet.method2256((byte) 45, 1) == 1;
		if (bool) {
			Node_Sub23_Sub1.anIntArray9928[Node_Sub9_Sub4.anInt9733++] = i;
		}
		int i_1_ = packet.method2256((byte) 126, 2);
		Player player = Class270_Sub2.aPlayerArray8038[i];
		if ((i_1_ ^ 0xffffffff) == -1) {
			if (bool) {
				player.aBoolean11156 = false;
			} else {
				if (Class166.anInt5099 == i) {
					throw new RuntimeException("s:lr");
				}
				Class323 class323 = Class320_Sub10.aClass323Array8296[i] = new Class323();
				class323.anInt4077 = (player.aByte5933 << 28) + ((Node_Sub53.anInt7668 + player.anIntArray10910[0] >> 6 << 14) - -(Class320_Sub4.anInt8243 + player.anIntArray10908[0] >> 6));
				if ((player.anInt11180 ^ 0xffffffff) != 0) {
					class323.anInt4079 = player.anInt11180;
				} else {
					class323.anInt4079 = player.aClass99_10893.method1086(16383);
				}
				class323.anInt4074 = player.anInt10838;
				class323.aBoolean4076 = player.aBoolean11157;
				class323.aBoolean4082 = player.aBoolean11135;
				if (player.anInt11164 > 0) {
					Class45.method462((byte) 49, player);
				}
				Class270_Sub2.aPlayerArray8038[i] = null;
				if (packet.method2256((byte) 72, 1) != 0) {
					Class339_Sub5.method3935(i, packet, 28460);
				}
			}
		} else if ((i_1_ ^ 0xffffffff) == -2) {
			int i_2_ = packet.method2256((byte) 1, 3);
			int i_3_ = player.anIntArray10910[0];
			int i_4_ = player.anIntArray10908[0];
			if (i_2_ != 0) {
				if (i_2_ == 1) {
					i_4_--;
				} else if ((i_2_ ^ 0xffffffff) == -3) {
					i_4_--;
					i_3_++;
				} else if ((i_2_ ^ 0xffffffff) == -4) {
					i_3_--;
				} else if (i_2_ != 4) {
					if ((i_2_ ^ 0xffffffff) != -6) {
						if (i_2_ != 6) {
							if ((i_2_ ^ 0xffffffff) == -8) {
								i_3_++;
								i_4_++;
							}
						} else {
							i_4_++;
						}
					} else {
						i_4_++;
						i_3_--;
					}
				} else {
					i_3_++;
				}
			} else {
				i_4_--;
				i_3_--;
			}
			if (!bool) {
				player.method894(i_4_, i_3_, -9380, Class73.aByteArray981[i]);
			} else {
				player.anInt11160 = i_4_;
				player.anInt11147 = i_3_;
				player.aBoolean11156 = true;
			}
		} else if ((i_1_ ^ 0xffffffff) == -3) {
			int i_5_ = packet.method2256((byte) 95, 4);
			int i_6_ = player.anIntArray10910[0];
			int i_7_ = player.anIntArray10908[0];
			if ((i_5_ ^ 0xffffffff) == -1) {
				i_6_ -= 2;
				i_7_ -= 2;
			} else if ((i_5_ ^ 0xffffffff) == -2) {
				i_6_--;
				i_7_ -= 2;
			} else if (i_5_ == 2) {
				i_7_ -= 2;
			} else if ((i_5_ ^ 0xffffffff) == -4) {
				i_6_++;
				i_7_ -= 2;
			} else if ((i_5_ ^ 0xffffffff) != -5) {
				if ((i_5_ ^ 0xffffffff) != -6) {
					if (i_5_ != 6) {
						if (i_5_ != 7) {
							if ((i_5_ ^ 0xffffffff) != -9) {
								if ((i_5_ ^ 0xffffffff) != -10) {
									if (i_5_ != 10) {
										if ((i_5_ ^ 0xffffffff) != -12) {
											if ((i_5_ ^ 0xffffffff) != -13) {
												if (i_5_ != 13) {
													if ((i_5_ ^ 0xffffffff) == -15) {
														i_7_ += 2;
														i_6_++;
													} else if (i_5_ == 15) {
														i_6_ += 2;
														i_7_ += 2;
													}
												} else {
													i_7_ += 2;
												}
											} else {
												i_7_ += 2;
												i_6_--;
											}
										} else {
											i_7_ += 2;
											i_6_ -= 2;
										}
									} else {
										i_6_ += 2;
										i_7_++;
									}
								} else {
									i_6_ -= 2;
									i_7_++;
								}
							} else {
								i_6_ += 2;
							}
						} else {
							i_6_ -= 2;
						}
					} else {
						i_6_ += 2;
						i_7_--;
					}
				} else {
					i_7_--;
					i_6_ -= 2;
				}
			} else {
				i_7_ -= 2;
				i_6_ += 2;
			}
			if (!bool) {
				player.method894(i_7_, i_6_, -9380, Class73.aByteArray981[i]);
			} else {
				player.anInt11147 = i_6_;
				player.anInt11160 = i_7_;
				player.aBoolean11156 = true;
			}
		} else {
			int i_8_ = packet.method2256((byte) -126, 1);
			if ((i_8_ ^ 0xffffffff) == -1) {
				int i_9_ = packet.method2256((byte) -128, 12);
				int i_10_ = i_9_ >> 10;
				int i_11_ = i_9_ >> 5 & 0x1f;
				if ((i_11_ ^ 0xffffffff) < -16) {
					i_11_ -= 32;
				}
				int i_12_ = 0x1f & i_9_;
				if ((i_12_ ^ 0xffffffff) < -16) {
					i_12_ -= 32;
				}
				int i_13_ = player.anIntArray10910[0] + i_11_;
				int i_14_ = i_12_ + player.anIntArray10908[0];
				if (!bool) {
					player.method894(i_14_, i_13_, -9380, Class73.aByteArray981[i]);
				} else {
					player.anInt11147 = i_13_;
					player.aBoolean11156 = true;
					player.anInt11160 = i_14_;
				}
				player.aByte5933 = player.aByte5931 = (byte) (player.aByte5933 + i_10_ & 0x3);
				if (Class238.method3021(i_14_, i_13_, -53)) {
					player.aByte5931++;
				}
				if ((Class166.anInt5099 ^ 0xffffffff) == (i ^ 0xffffffff)) {
					if ((player.aByte5933 ^ 0xffffffff) != (CacheNode_Sub20_Sub1.anInt11089 ^ 0xffffffff)) {
						Class194_Sub1.aBoolean6892 = true;
					}
					CacheNode_Sub20_Sub1.anInt11089 = player.aByte5933;
				}
			} else {
				int i_15_ = packet.method2256((byte) 66, 30);
				int i_16_ = i_15_ >> 28;
				int i_17_ = 0x3fff & i_15_ >> 14;
				if (i_0_ >= 18) {
					int i_18_ = i_15_ & 0x3fff;
					int i_19_ = -Node_Sub53.anInt7668 + (player.anIntArray10910[0] - -Node_Sub53.anInt7668 - -i_17_ & 0x3fff);
					int i_20_ = -Class320_Sub4.anInt8243 + (0x3fff & i_18_ + (player.anIntArray10908[0] + Class320_Sub4.anInt8243));
					if (bool) {
						player.aBoolean11156 = true;
						player.anInt11160 = i_20_;
						player.anInt11147 = i_19_;
					} else {
						player.method894(i_20_, i_19_, -9380, Class73.aByteArray981[i]);
					}
					player.aByte5933 = player.aByte5931 = (byte) (0x3 & i_16_ + player.aByte5933);
					if (Class238.method3021(i_20_, i_19_, -108)) {
						player.aByte5931++;
					}
					if ((Class166.anInt5099 ^ 0xffffffff) == (i ^ 0xffffffff)) {
						CacheNode_Sub20_Sub1.anInt11089 = player.aByte5933;
					}
				}
			}
		}
	}
	
	public static void method3813(int i) {
		aWidget4085 = null;
		if (i != 10) {
			method3813(-58);
		}
	}
}
