package com.jagex;

public class Node_Sub38_Sub38 extends Node_Sub38
{
	private boolean aBoolean10483;
	static Class302 aClass302_10484;
	static int anInt10485;
	private boolean aBoolean10486 = true;
	static int anInt10487;
	static int anInt10488;
	static int anInt10489;
	static int anInt10490;
	static int anInt10491;
	private static int anInt10492 = 1;
	static int anInt10493;
	
	public Node_Sub38_Sub38() {
		super(1, false);
		aBoolean10483 = true;
	}
	
	static final Class169_Sub2_Sub1 method2913(int i, boolean bool, int i_0_, int i_1_, GLToolkit gltoolkit) {
		if (bool != false) {
			return null;
		}
		anInt10487++;
		if (gltoolkit.aBoolean6652 || Class371.method4094(i_0_, false) && Class371.method4094(i, bool)) {
			return new Class169_Sub2_Sub1(gltoolkit, 3553, i_1_, i_0_, i);
		}
		if (!gltoolkit.aBoolean6649) {
			return new Class169_Sub2_Sub1(gltoolkit, i_1_, i_0_, i, Class320_Sub19.method3753(i_0_, -729073628), Class320_Sub19.method3753(i, -729073628));
		}
		return new Class169_Sub2_Sub1(gltoolkit, 34037, i_1_, i_0_, i);
	}
	
	static final void method2914(int i) {
		if (Node_Sub25_Sub4.aClass110Array10006 == null) {
			Node_Sub25_Sub4.aClass110Array10006 = Class110.method1133((byte) 118);
			Class252.aClass110_3189 = Node_Sub25_Sub4.aClass110Array10006[0];
			Class43.aLong663 = Class313.method3650(false);
		}
		anInt10491++;
		if (Class243.aClass340_3069 == null) {
			Class124.method1525(53);
		}
		Class110 class110 = Class252.aClass110_3189;
		if (i == -15103) {
			int i_2_ = Class194_Sub3.method1977(1);
			if (Class252.aClass110_3189 == class110) {
				Node_Sub15_Sub12.aString9867 = Class252.aClass110_3189.aClass22_1379.method297(-12273, Class35.anInt537);
				if (Class252.aClass110_3189.aBoolean1393) {
					Class204.anInt2453 = Class252.aClass110_3189.anInt1383 - -(i_2_ * (Class252.aClass110_3189.anInt1382 - Class252.aClass110_3189.anInt1383) / 100);
				}
				if (Class252.aClass110_3189.aBoolean1387) {
					Node_Sub15_Sub12.aString9867 += Class204.anInt2453 + "%";
				}
			} else if (Class110.aClass110_1411 == Class252.aClass110_3189) {
				Class243.aClass340_3069 = null;
				Class48.method478(3, (byte) 127);
			} else {
				Node_Sub15_Sub12.aString9867 = class110.aClass22_1389.method297(i ^ 0x150e, Class35.anInt537);
				if (Class252.aClass110_3189.aBoolean1387) {
					Node_Sub15_Sub12.aString9867 += class110.anInt1382 + "%";
				}
				Class204.anInt2453 = class110.anInt1382;
				if (Class252.aClass110_3189.aBoolean1393 || class110.aBoolean1393) {
					Class43.aLong663 = Class313.method3650(false);
				}
			}
			if (Class243.aClass340_3069 != null) {
				Class243.aClass340_3069.method3954(Class204.anInt2453, Node_Sub15_Sub12.aString9867, Class252.aClass110_3189, 121, Class43.aLong663);
				if (Class235_Sub1.anInterface16Array8978 != null) {
					for (int i_3_ = Class51_Sub1.anInt9064 - -1; Class235_Sub1.anInterface16Array8978.length > i_3_; i_3_++) {
						if (Class235_Sub1.anInterface16Array8978[i_3_].method58(27285) >= 100 && Class51_Sub1.anInt9064 == -1 + i_3_ && (Class151.anInt1843 ^ 0xffffffff) <= -2 && Class243.aClass340_3069.method3956(-79)) {
							try {
								Class235_Sub1.anInterface16Array8978[i_3_].method62(i ^ ~0x3d6d);
							} catch (Exception exception) {
								Class235_Sub1.anInterface16Array8978 = null;
								break;
							}
							Class243.aClass340_3069.method3953((byte) -68, Class235_Sub1.anInterface16Array8978[i_3_]);
							Class51_Sub1.anInt9064++;
							if (Class51_Sub1.anInt9064 >= -1 + Class235_Sub1.anInterface16Array8978.length && Class235_Sub1.anInterface16Array8978.length > 1) {
								Class51_Sub1.anInt9064 = Class174.aClass250_2094.method3092(false) ? 0 : -1;
							}
						}
					}
				}
			}
		}
	}
	
	public static void method2915(int i) {
		aClass302_10484 = null;
		if (i != -1) {
			method2915(7);
		}
	}
	
	final void method2780(boolean bool, Buffer buffer, int i) {
		anInt10485++;
		int i_4_ = i;
	while_268_:
		do {
			do {
				if (i_4_ != 0) {
					if (i_4_ != 1) {
						if (i_4_ == 2) {
							break;
						}
						break while_268_;
					}
				} else {
					aBoolean10483 = (buffer.method2233(255) ^ 0xffffffff) == -2;
					break while_268_;
				}
				aBoolean10486 = (buffer.method2233(255) ^ 0xffffffff) == -2;
				break while_268_;
			} while (false);
			aBoolean7463 = buffer.method2233(255) == 1;
		} while (false);
		if (bool != false) {
			method2778(121, true);
		}
	}
	
	static final void method2916(int i) {
		anInt10489++;
		if (Node_Sub19.anInt7163 > 1) {
			Node_Sub19.anInt7163--;
			Node_Sub23_Sub1.anInt9926 = Class345.anInt4270;
		}
		if (Class218.worldResponseBuffer.aBoolean1580) {
			Class218.worldResponseBuffer.aBoolean1580 = false;
			Class262_Sub13.method3182(false);
		} else {
			if (!Class213.aBoolean2510) {
				Node_Sub7.method2421((byte) 98);
			}
			for (int i_5_ = 0; i_5_ < 100; i_5_++) {
				if (!Class194_Sub3_Sub1.method1980(Class218.worldResponseBuffer, i ^ 0x28fe)) {
					break;
				}
			}
			if ((Class151.anInt1843 ^ 0xffffffff) == -12) {
				while (Widget.method4152(i ^ 0x6f753f36)) {
					Node_Sub13 node_sub13 = FloatBuffer.method2250(i ^ ~0x397f, Class338.aClass318_4184, Class218.worldResponseBuffer.anIsaacCipher1571);
					node_sub13.aPacket7113.method2226(0, false);
					int i_6_ = node_sub13.aPacket7113.anInt7002;
					StandardSprite.method1213(-2, node_sub13.aPacket7113);
					node_sub13.aPacket7113.method2217(node_sub13.aPacket7113.anInt7002 + -i_6_, (byte) -128);
					Class218.worldResponseBuffer.method1514(i + -14463, node_sub13);
				}
				if (Class117.aNode_Sub7_1472 != null) {
					if (Class117.aNode_Sub7_1472.anInt7060 != -1) {
						Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class34.aClass318_528, Class218.worldResponseBuffer.anIsaacCipher1571);
						node_sub13.aPacket7113.method2210(Class117.aNode_Sub7_1472.anInt7060, i ^ ~0x38de);
						Class218.worldResponseBuffer.method1514(i ^ 0x3880, node_sub13);
						Class117.aNode_Sub7_1472 = null;
						Class359.aLong4466 = 30000L + Class313.method3650(false);
					}
				} else if (Class359.aLong4466 <= Class313.method3650(false)) {
					Class117.aNode_Sub7_1472 = Animable.aClass193_5936.method1959((byte) -60, Class181.aClass197_2155.aString2422);
				}
				Node_Sub5 node_sub5 = (Node_Sub5) GraphicsToolkit.aClass312_1545.method3613(i + 50690);
				if (node_sub5 != null || Class38.aLong562 < Class313.method3650(false) + -2000L) {
					Node_Sub13 node_sub13 = null;
					int i_7_ = 0;
					for (Node_Sub5 node_sub5_8_ = (Node_Sub5) Node_Sub38_Sub35.aClass312_10452.method3613(65280); node_sub5_8_ != null; node_sub5_8_ = (Node_Sub5) Node_Sub38_Sub35.aClass312_10452.method3620(16776960)) {
						if (node_sub13 != null && (-i_7_ + node_sub13.aPacket7113.anInt7002 ^ 0xffffffff) <= -241) {
							break;
						}
						node_sub5_8_.method2160((byte) 50);
						int i_9_ = node_sub5_8_.method2272(i + -14585);
						if (i_9_ < -1) {
							i_9_ = -1;
						} else if (i_9_ > 65534) {
							i_9_ = 65534;
						}
						int i_10_ = node_sub5_8_.method2270(2);
						if (i_10_ >= -1) {
							if (i_10_ > 65534) {
								i_10_ = 65534;
							}
						} else {
							i_10_ = -1;
						}
						if (Class99.anInt1283 != i_10_ || (i_9_ ^ 0xffffffff) != (Class340.anInt4217 ^ 0xffffffff)) {
							if (node_sub13 == null) {
								Class57.anInt842++;
								node_sub13 = FloatBuffer.method2250(i + -14976, Class277_Sub1.aClass318_8050, Class218.worldResponseBuffer.anIsaacCipher1571);
								node_sub13.aPacket7113.method2226(0, false);
								i_7_ = node_sub13.aPacket7113.anInt7002;
							}
							int i_11_ = -Class99.anInt1283 + i_10_;
							Class99.anInt1283 = i_10_;
							int i_12_ = i_9_ - Class340.anInt4217;
							Class340.anInt4217 = i_9_;
							int i_13_ = (int) ((node_sub5_8_.method2273((byte) -69) + -Class38.aLong562) / 20L);
							if (i_13_ >= 8 || i_11_ < -32 || i_11_ > 31 || (i_12_ ^ 0xffffffff) > 31 || i_12_ > 31) {
								if (i_13_ < 32 && i_11_ >= -128 && i_11_ <= 127 && i_12_ >= -128 && (i_12_ ^ 0xffffffff) >= -128) {
									node_sub13.aPacket7113.method2226(128 - -i_13_, false);
									i_11_ += 128;
									i_12_ += 128;
									node_sub13.aPacket7113.method2210(i_12_ + (i_11_ << 8), i ^ ~0x3896);
								} else if (i_13_ >= 32) {
									node_sub13.aPacket7113.method2210(57344 - -i_13_, -100);
									if ((i_10_ ^ 0xffffffff) == -2 || i_9_ == -1) {
										node_sub13.aPacket7113.method2179((byte) -5, -2147483648);
									} else {
										node_sub13.aPacket7113.method2179((byte) -5, i_10_ | i_9_ << 16);
									}
								} else {
									node_sub13.aPacket7113.method2226(i_13_ + 192, false);
									if ((i_10_ ^ 0xffffffff) != -2 && (i_9_ ^ 0xffffffff) != 0) {
										node_sub13.aPacket7113.method2179((byte) -5, i_9_ << 16 | i_10_);
									} else {
										node_sub13.aPacket7113.method2179((byte) -5, -2147483648);
									}
								}
							} else {
								i_11_ += 32;
								i_12_ += 32;
								node_sub13.aPacket7113.method2210((i_13_ << 12) + (i_11_ << 6) + i_12_, -122);
							}
							Class38.aLong562 = node_sub5_8_.method2273((byte) -69);
						}
					}
					if (node_sub13 != null) {
						node_sub13.aPacket7113.method2217(-i_7_ + node_sub13.aPacket7113.anInt7002, (byte) -128);
						Class218.worldResponseBuffer.method1514(126, node_sub13);
					}
				}
				if (node_sub5 != null) {
					long l = (node_sub5.method2273((byte) -69) + -Class262_Sub4.aLong7727) / 50L;
					if (l > 32767L) {
						l = 32767L;
					}
					Class262_Sub4.aLong7727 = node_sub5.method2273((byte) -69);
					int i_14_ = node_sub5.method2272(5);
					if ((i_14_ ^ 0xffffffff) > -1) {
						i_14_ = 0;
					} else if (i_14_ > 65535) {
						i_14_ = 65535;
					}
					int i_15_ = node_sub5.method2270(2);
					if ((i_15_ ^ 0xffffffff) <= -1) {
						if ((i_15_ ^ 0xffffffff) < -65536) {
							i_15_ = 65535;
						}
					} else {
						i_15_ = 0;
					}
					int i_16_ = 0;
					if ((node_sub5.method2267(true) ^ 0xffffffff) == -3) {
						i_16_ = 1;
					}
					Animable.anInt5942++;
					int i_17_ = (int) l;
					Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, za_Sub2.aClass318_10512, Class218.worldResponseBuffer.anIsaacCipher1571);
					node_sub13.aPacket7113.method2207(21226, i_16_ << 15 | i_17_);
					node_sub13.aPacket7113.method2187(true, i_15_ | i_14_ << 16);
					Class218.worldResponseBuffer.method1514(126, node_sub13);
				}
				if (Class320_Sub8.anInt8281 > 0) {
					Animable_Sub2.anInt9111++;
					Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Node_Sub38_Sub9.aClass318_10184, Class218.worldResponseBuffer.anIsaacCipher1571);
					node_sub13.aPacket7113.method2226(Class320_Sub8.anInt8281 * 3, false);
					for (int i_18_ = 0; i_18_ < Class320_Sub8.anInt8281; i_18_++) {
						Interface21 interface21 = Class66_Sub2_Sub1.anInterface21Array10578[i_18_];
						long l = (interface21.method76(-31100) - Class339_Sub4.aLong8671) / 50L;
						if ((l ^ 0xffffffffffffffffL) < -65536L) {
							l = 65535L;
						}
						Class339_Sub4.aLong8671 = interface21.method76(i + -45690);
						node_sub13.aPacket7113.method2226(interface21.method75(-29764), false);
						node_sub13.aPacket7113.method2210((int) l, -113);
					}
					Class218.worldResponseBuffer.method1514(i ^ 0x3881, node_sub13);
				}
				if (Widget.anInt4725 > 0) {
					Widget.anInt4725--;
				}
				if (Node_Sub25_Sub1.aBoolean9950 && Widget.anInt4725 <= 0) {
					Node_Sub25_Sub1.aBoolean9950 = false;
					Widget.anInt4725 = 20;
					Class148.anInt1826++;
					Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class128.aClass318_1651, Class218.worldResponseBuffer.anIsaacCipher1571);
					node_sub13.aPacket7113.method2210((int) Class257.aFloat3243 >> 3, -126);
					node_sub13.aPacket7113.method2210((int) Node_Sub12.aFloat5450 >> 3, -35);
					Class218.worldResponseBuffer.method1514(126, node_sub13);
				}
				if (Class51.aBoolean5331 == !Class34.aBoolean531) {
					Class34.aBoolean531 = Class51.aBoolean5331;
					Class240.anInt2939++;
					Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class270_Sub2.aClass318_8037, Class218.worldResponseBuffer.anIsaacCipher1571);
					node_sub13.aPacket7113.method2226(Class51.aBoolean5331 ? 1 : 0, false);
					Class218.worldResponseBuffer.method1514(127, node_sub13);
				}
				if (!Class269.aBoolean3472) {
					Class243.anInt3071++;
					Node_Sub13 node_sub13 = FloatBuffer.method2250(i ^ ~0x397f, Animable_Sub3_Sub1.aClass318_11004, Class218.worldResponseBuffer.anIsaacCipher1571);
					node_sub13.aPacket7113.method2226(0, false);
					int i_19_ = node_sub13.aPacket7113.anInt7002;
					Buffer buffer = Class213.aNode_Sub27_2512.method2696(i ^ 0x156f);
					node_sub13.aPacket7113.method2223(buffer.anInt7002, (byte) 4, buffer.aByteArray7019, 0);
					node_sub13.aPacket7113.method2217(-i_19_ + node_sub13.aPacket7113.anInt7002, (byte) -128);
					Class218.worldResponseBuffer.method1514(127, node_sub13);
					Class269.aBoolean3472 = true;
				}
				if (Class175.aClass261ArrayArrayArray2099 != null) {
					if (Class320_Sub22.anInt8415 == 2) {
						Class314.method3652(66);
					} else if (Class320_Sub22.anInt8415 == 3) {
						Class309.method3586(92);
					}
				}
				if (!Mobile_Sub4.aBoolean10988) {
					Node_Sub36_Sub1.aFloat10038 /= 2.0F;
				} else {
					Mobile_Sub4.aBoolean10988 = false;
				}
				if (!Node_Sub3.aBoolean6948) {
					Class291.aFloat3666 /= 2.0F;
				} else {
					Node_Sub3.aBoolean6948 = false;
				}
				Class320_Sub30.method3798(-17132);
				if (Class151.anInt1843 == 11) {
					Class89.method1022(false);
					Node_Sub15_Sub5.method2569((byte) 17);
					Node_Sub9_Sub1.method2441(-126);
					Class218.worldResponseBuffer.anInt1578++;
					if ((Class218.worldResponseBuffer.anInt1578 ^ 0xffffffff) < -751) {
						Class262_Sub13.method3182(false);
					} else {
						if (aa.anInt101 != 0) {
							if ((aa.anInt101 ^ 0xffffffff) == -2 && Class191.method1944(Class200_Sub2.anInt4935, i ^ 0x38b7)) {
								Class144.method1628(0);
								aa.anInt101 = 2;
							}
							if ((aa.anInt101 ^ 0xffffffff) == -3 && (Class151.anInt1843 ^ 0xffffffff) != -13) {
								Class18.aHashTable308.method1517(false);
								Class320_Sub19.anInt8385 = 0;
								GLXToolkit.anInt9276 = Class174.anInt2092;
								aa.anInt101 = 3;
								Class246.method3072((byte) 31);
							}
							if (aa.anInt101 == 3) {
								int i_20_ = Class174.anInt2092 + -GLXToolkit.anInt9276;
								if ((Class214.aClass262Array2528.length ^ 0xffffffff) < (Class320_Sub19.anInt8385 ^ 0xffffffff)) {
									do {
										Class262 class262 = Class214.aClass262Array2528[Class320_Sub19.anInt8385];
										if (class262.anInt3323 > i_20_) {
											break;
										}
										class262.method3148(i + -14708);
										if ((aa.anInt101 ^ 0xffffffff) != -4) {
											break;
										}
									} while ((++Class320_Sub19.anInt8385 ^ 0xffffffff) > (Class214.aClass262Array2528.length ^ 0xffffffff));
								}
								if ((aa.anInt101 ^ 0xffffffff) == -4) {
									for (int i_21_ = 0; Class121.aClass206Array1529.length > i_21_; i_21_++) {
										Class206 class206 = Class121.aClass206Array1529[i_21_];
										if (class206.aBoolean2472) {
											Actor actor = class206.method2037(-61);
											r_Sub2.method2375(true, (byte) -49, actor);
										}
									}
								}
							}
						} else {
							Class49.method485((byte) -59);
							Node_Sub2.method2167(0);
						}
						Node_Sub15_Sub1.method2558(-1);
						if (!Node_Sub36_Sub1.aBoolean10030) {
							Class318.method3668(true);
							Node_Sub36_Sub1.aBoolean10030 = true;
						}
						for (int i_22_ = Class24.aClass275_442.method3334(-114, true); (i_22_ ^ 0xffffffff) != 0; i_22_ = Class24.aClass275_442.method3334(i ^ ~0x3891, false)) {
							Class188_Sub2_Sub1.method1907(i_22_, (byte) 108);
							Class75.anIntArray1005[Node_Sub30.method2723(Class341.anInt4231++, 31)] = i_22_;
						}
						for (CacheNode_Sub2 cachenode_sub2 = Class48.method479(1); cachenode_sub2 != null; cachenode_sub2 = Class48.method479(1)) {
							int i_23_ = cachenode_sub2.method2289(255);
							long l = cachenode_sub2.method2290(118);
							if (i_23_ != 1) {
								if (i_23_ != 2) {
									if (i_23_ != 3) {
										if ((i_23_ ^ 0xffffffff) != -5) {
											if (i_23_ == 5) {
												Widget widget = Class76.method771((byte) 107, (int) l);
												if ((widget.anInt4773 ^ 0xffffffff) != (cachenode_sub2.anInt9434 ^ 0xffffffff)) {
													if ((cachenode_sub2.anInt9434 ^ 0xffffffff) == 0) {
														widget.anAnimator4755 = null;
													} else {
														if (widget.anAnimator4755 == null) {
															widget.anAnimator4755 = new FixedAnimator();
														}
														widget.anAnimator4755.method249(true, cachenode_sub2.anInt9434);
													}
													widget.anInt4773 = cachenode_sub2.anInt9434;
													CacheNode_Sub9.method2321(i ^ ~0x38fe, widget);
												}
											} else if (i_23_ != 6) {
												if (i_23_ != 7) {
													if ((i_23_ ^ 0xffffffff) != -9) {
														if ((i_23_ ^ 0xffffffff) == -10) {
															Widget widget = Class76.method771((byte) 107, (int) l);
															if ((cachenode_sub2.anInt9434 ^ 0xffffffff) != (widget.anInt4718 ^ 0xffffffff) || cachenode_sub2.anInt9432 != widget.anInt4831) {
																widget.anInt4831 = cachenode_sub2.anInt9432;
																widget.anInt4718 = cachenode_sub2.anInt9434;
																CacheNode_Sub9.method2321(i ^ ~0x38fe, widget);
															}
														} else if ((i_23_ ^ 0xffffffff) == -11) {
															Widget widget = Class76.method771((byte) 107, (int) l);
															if (cachenode_sub2.anInt9434 != widget.anInt4681 || (widget.anInt4811 ^ 0xffffffff) != (cachenode_sub2.anInt9432 ^ 0xffffffff) || cachenode_sub2.anInt9429 != widget.anInt4682) {
																widget.anInt4681 = cachenode_sub2.anInt9434;
																widget.anInt4811 = cachenode_sub2.anInt9432;
																widget.anInt4682 = cachenode_sub2.anInt9429;
																CacheNode_Sub9.method2321(i + -14591, widget);
															}
														} else if ((i_23_ ^ 0xffffffff) != -12) {
															if (i_23_ == 12) {
																Widget widget = Class76.method771((byte) 107, (int) l);
																int i_24_ = cachenode_sub2.anInt9434;
																if (widget != null && (widget.anInt4841 ^ 0xffffffff) == -1) {
																	if ((i_24_ ^ 0xffffffff) < (widget.anInt4691 - widget.anInt4695 ^ 0xffffffff)) {
																		i_24_ = -widget.anInt4695 + widget.anInt4691;
																	}
																	if ((i_24_ ^ 0xffffffff) > -1) {
																		i_24_ = 0;
																	}
																	if (widget.anInt4734 != i_24_) {
																		widget.anInt4734 = i_24_;
																		CacheNode_Sub9.method2321(-1, widget);
																	}
																}
															} else if ((i_23_ ^ 0xffffffff) != -15) {
																if ((i_23_ ^ 0xffffffff) == -16) {
																	Node_Sub15_Sub4.anInt9798 = cachenode_sub2.anInt9432;
																	Class144.aBoolean1791 = true;
																	Class359.anInt4467 = cachenode_sub2.anInt9434;
																} else if (i_23_ == 16) {
																	Widget widget = Class76.method771((byte) 107, (int) l);
																	widget.anInt4759 = cachenode_sub2.anInt9434;
																} else if (i_23_ != 20) {
																	if (i_23_ != 21) {
																		if (i_23_ != 17) {
																			if ((i_23_ ^ 0xffffffff) != -19) {
																				if (i_23_ == 19) {
																					Widget widget = Class76.method771((byte) 107, (int) l);
																					int i_25_ = (int) (l >> 32);
																					widget.method4140((short) cachenode_sub2.anInt9434, -48, i_25_, (short) cachenode_sub2.anInt9432);
																				}
																			} else {
																				Widget widget = Class76.method771((byte) 107, (int) l);
																				int i_26_ = (int) (l >> 32);
																				widget.method4158(5, (short) cachenode_sub2.anInt9432, i_26_, (short) cachenode_sub2.anInt9434);
																			}
																		} else {
																			Widget widget = Class76.method771((byte) 107, (int) l);
																			widget.anInt4694 = cachenode_sub2.anInt9434;
																		}
																	} else {
																		Widget widget = Class76.method771((byte) 107, (int) l);
																		widget.aBoolean4782 = (cachenode_sub2.anInt9434 ^ 0xffffffff) == -2;
																	}
																} else {
																	Widget widget = Class76.method771((byte) 107, (int) l);
																	widget.aBoolean4832 = cachenode_sub2.anInt9434 == 1;
																}
															} else {
																Widget widget = Class76.method771((byte) 107, (int) l);
																widget.anInt4820 = cachenode_sub2.anInt9434;
															}
														} else {
															Widget widget = Class76.method771((byte) 107, (int) l);
															widget.aByte4851 = (byte) 0;
															widget.anInt4762 = widget.anInt4816 = cachenode_sub2.anInt9432;
															widget.anInt4679 = widget.anInt4850 = cachenode_sub2.anInt9434;
															widget.aByte4720 = (byte) 0;
															CacheNode_Sub9.method2321(i + -14591, widget);
														}
													} else {
														Widget widget = Class76.method771((byte) 107, (int) l);
														if ((cachenode_sub2.anInt9434 ^ 0xffffffff) != (widget.anInt4815 ^ 0xffffffff) || cachenode_sub2.anInt9432 != widget.anInt4821 || (widget.anInt4787 ^ 0xffffffff) != (cachenode_sub2.anInt9429 ^ 0xffffffff)) {
															widget.anInt4815 = cachenode_sub2.anInt9434;
															widget.anInt4821 = cachenode_sub2.anInt9432;
															widget.anInt4787 = cachenode_sub2.anInt9429;
															if ((widget.anInt4718 ^ 0xffffffff) != 0) {
																if ((widget.anInt4800 ^ 0xffffffff) < -1) {
																	widget.anInt4787 = widget.anInt4787 * 32 / widget.anInt4800;
																} else if ((widget.anInt4693 ^ 0xffffffff) < -1) {
																	widget.anInt4787 = 32 * widget.anInt4787 / widget.anInt4693;
																}
															}
															CacheNode_Sub9.method2321(i ^ ~0x38fe, widget);
														}
													}
												} else {
													Widget widget = Class76.method771((byte) 107, (int) l);
													boolean bool = (cachenode_sub2.anInt9434 ^ 0xffffffff) == -2;
													if (!bool == widget.aBoolean4689) {
														widget.aBoolean4689 = bool;
														CacheNode_Sub9.method2321(-1, widget);
													}
												}
											} else {
												int i_27_ = cachenode_sub2.anInt9434;
												int i_28_ = i_27_ >> 10 & 0x1f;
												int i_29_ = i_27_ >> 5 & 0x1f;
												int i_30_ = i_27_ & 0x1f;
												int i_31_ = (i_29_ << 11) + ((i_28_ << 19) + (i_30_ << 3));
												Widget widget = Class76.method771((byte) 107, (int) l);
												if ((widget.anInt4754 ^ 0xffffffff) != (i_31_ ^ 0xffffffff)) {
													widget.anInt4754 = i_31_;
													CacheNode_Sub9.method2321(-1, widget);
												}
											}
										} else {
											Widget widget = Class76.method771((byte) 107, (int) l);
											int i_32_ = cachenode_sub2.anInt9434;
											int i_33_ = cachenode_sub2.anInt9432;
											int i_34_ = cachenode_sub2.anInt9429;
											if (i_32_ != widget.anInt4844 || i_33_ != widget.anInt4864 || i_34_ != widget.anInt4683) {
												widget.anInt4683 = i_34_;
												widget.anInt4844 = i_32_;
												widget.anInt4864 = i_33_;
												CacheNode_Sub9.method2321(-1, widget);
											}
										}
									} else {
										Widget widget = Class76.method771((byte) 107, (int) l);
										if (!cachenode_sub2.aString9428.equals(widget.aString4790)) {
											widget.aString4790 = cachenode_sub2.aString9428;
											CacheNode_Sub9.method2321(i ^ ~0x38fe, widget);
										}
									}
								} else {
									Node_Sub38_Sub3.aStringArray10105[(int) l] = cachenode_sub2.aString9428;
									CacheNode_Sub10.anIntArray9520[Node_Sub30.method2723(31, Class244.anInt3083++)] = (int) l;
								}
							} else {
								Class320_Sub22.anIntArray8417[(int) l] = cachenode_sub2.anInt9434;
								Class331.aBoolean4129 |= FileOnDisk.aBooleanArray1332[(int) l];
								Node_Sub38_Sub11.anIntArray10217[Node_Sub30.method2723(Class36.anInt548++, 31)] = (int) l;
							}
						}
						Node_Sub9_Sub1.anInt9637++;
						if (Node_Sub38_Sub28.anInt10403 != 0) {
							Node_Sub37.anInt7431 += 20;
							if ((Node_Sub37.anInt7431 ^ 0xffffffff) <= -401) {
								Node_Sub38_Sub28.anInt10403 = 0;
							}
						}
						if (Class41.aWidget622 != null) {
							GLPlane.anInt7937++;
							if ((GLPlane.anInt7937 ^ 0xffffffff) <= -16) {
								CacheNode_Sub9.method2321(-1, Class41.aWidget622);
								Class41.aWidget622 = null;
							}
						}
						Class66_Sub1.aWidget8983 = null;
						Class180.aBoolean2135 = false;
						Class372.aBoolean4599 = false;
						Node_Sub38_Sub14.aWidget10244 = null;
						CacheNode_Sub4.method2305(-1, true, -1, null);
						if (!Class87.aBoolean1185) {
							Class239.anInt2928 = -1;
						}
						Node_Sub34.method2741(false);
						Class345.anInt4270++;
						if (FileOnDisk.aBoolean1319) {
							Class314.anInt4016++;
							Node_Sub13 node_sub13 = FloatBuffer.method2250(i ^ ~0x397f, Class69.aClass318_941, Class218.worldResponseBuffer.anIsaacCipher1571);
							node_sub13.aPacket7113.method2184(Class326.anInt4098 | (CacheNode_Sub16_Sub2.anInt11087 << 28 | Class269.anInt3473 << 14), (byte) -8);
							Class218.worldResponseBuffer.method1514(i + -14464, node_sub13);
							FileOnDisk.aBoolean1319 = false;
						}
						for (;;) {
							Node_Sub37 node_sub37 = (Node_Sub37) CacheNode_Sub14_Sub2.aClass312_11039.method3619(-77);
							if (node_sub37 == null) {
								break;
							}
							Widget widget = node_sub37.aWidget7437;
							if ((widget.anInt4687 ^ 0xffffffff) <= -1) {
								Widget widget_35_ = Class76.method771((byte) 107, widget.anInt4692);
								if (widget_35_ == null || widget_35_.aWidgetArray4804 == null || widget_35_.aWidgetArray4804.length <= widget.anInt4687 || widget_35_.aWidgetArray4804[widget.anInt4687] != widget) {
									continue;
								}
							}
							Class305.method3556(node_sub37);
						}
						for (;;) {
							Node_Sub37 node_sub37 = (Node_Sub37) Node_Sub5.aClass312_7028.method3619(i ^ ~0x38b7);
							if (node_sub37 == null) {
								break;
							}
							Widget widget = node_sub37.aWidget7437;
							if ((widget.anInt4687 ^ 0xffffffff) <= -1) {
								Widget widget_36_ = Class76.method771((byte) 107, widget.anInt4692);
								if (widget_36_ == null || widget_36_.aWidgetArray4804 == null || (widget.anInt4687 ^ 0xffffffff) <= (widget_36_.aWidgetArray4804.length ^ 0xffffffff) || widget_36_.aWidgetArray4804[widget.anInt4687] != widget) {
									continue;
								}
							}
							Class305.method3556(node_sub37);
						}
						for (;;) {
							Node_Sub37 node_sub37 = (Node_Sub37) Class275.aClass312_5419.method3619(-116);
							if (node_sub37 == null) {
								break;
							}
							Widget widget = node_sub37.aWidget7437;
							if (widget.anInt4687 >= 0) {
								Widget widget_37_ = Class76.method771((byte) 107, widget.anInt4692);
								if (widget_37_ == null || widget_37_.aWidgetArray4804 == null || (widget_37_.aWidgetArray4804.length ^ 0xffffffff) >= (widget.anInt4687 ^ 0xffffffff) || widget != widget_37_.aWidgetArray4804[widget.anInt4687]) {
									continue;
								}
							}
							Class305.method3556(node_sub37);
						}
						if (Class66_Sub1.aWidget8983 == null) {
							Class290_Sub6.anInt8116 = 0;
						}
						if (Class58.aWidget861 != null) {
							Class277_Sub1.method3357(true);
						}
						if ((Class339_Sub7.anInt8729 ^ 0xffffffff) < -1 && Class175.aClass291_2100.method3450(i ^ 0x38a0, 82) && Class175.aClass291_2100.method3450(-71, 81) && (Class339_Sub8.anInt8739 ^ 0xffffffff) != -1) {
							int i_38_ = -Class339_Sub8.anInt8739 + Class295.aPlayer3692.aByte5933;
							if (i_38_ >= 0) {
								if (i_38_ > 3) {
									i_38_ = 3;
								}
							} else {
								i_38_ = 0;
							}
							Class331.method3843(false, i_38_, Class295.aPlayer3692.anIntArray10908[0] + Class320_Sub4.anInt8243, Node_Sub53.anInt7668 - -Class295.aPlayer3692.anIntArray10910[0]);
						}
						Class168.method1754(true);
						for (int i_39_ = 0; (i_39_ ^ 0xffffffff) > -6; i_39_++)
							Class320_Sub7.anIntArray8271[i_39_]++;
						if (Class331.aBoolean4129 && Animable_Sub2_Sub1.aLong10630 < Class313.method3650(false) - 60000L) {
							Class144.method1631((byte) 123);
						}
						for (EntityNode_Sub3_Sub1 entitynode_sub3_sub1 = (EntityNode_Sub3_Sub1) Class97.aClass103_1277.method1113((byte) 100); entitynode_sub3_sub1 != null; entitynode_sub3_sub1 = (EntityNode_Sub3_Sub1) Class97.aClass103_1277.method1108(73)) {
							if (Class313.method3650(false) / 1000L + -5L > (long) entitynode_sub3_sub1.anInt9162) {
								if ((entitynode_sub3_sub1.aShort9164 ^ 0xffffffff) < -1) {
									Class28.method331(entitynode_sub3_sub1.aString9156 + Class22.aClass22_382.method297(i ^ ~0x170e, Class35.anInt537), "", -37, 0, "", "", 5);
								}
								if (entitynode_sub3_sub1.aShort9164 == 0) {
									Class28.method331(entitynode_sub3_sub1.aString9156 + Class22.aClass22_383.method297(-12273, Class35.anInt537), "", 99, 0, "", "", 5);
								}
								entitynode_sub3_sub1.method803(false);
							}
						}
						if (i != 14590) {
							anInt10490 = -107;
						}
						Class209.anInt2492++;
						if ((Class209.anInt2492 ^ 0xffffffff) < -501) {
							Class209.anInt2492 = 0;
							int i_40_ = (int) (8.0 * Math.random());
							if ((i_40_ & 0x2) == 2) {
								Class76.anInt1011 += Class203.anInt2449;
							}
							if ((0x1 & i_40_) == 1) {
								Class262_Sub17.anInt7839 += Class294.anInt3687;
							}
							if ((0x4 & i_40_ ^ 0xffffffff) == -5) {
								Node_Sub36_Sub1.anInt10040 += anInt10492;
							}
						}
						if (Class262_Sub17.anInt7839 < -50) {
							Class294.anInt3687 = 2;
						}
						if ((Class262_Sub17.anInt7839 ^ 0xffffffff) < -51) {
							Class294.anInt3687 = -2;
						}
						if (Class76.anInt1011 < -55) {
							Class203.anInt2449 = 2;
						}
						if ((Node_Sub36_Sub1.anInt10040 ^ 0xffffffff) > 39) {
							anInt10492 = 1;
						}
						if (Class76.anInt1011 > 55) {
							Class203.anInt2449 = -2;
						}
						Class237.anInt2908++;
						if (Node_Sub36_Sub1.anInt10040 > 40) {
							anInt10492 = -1;
						}
						if ((Class237.anInt2908 ^ 0xffffffff) < -501) {
							Class237.anInt2908 = 0;
							int i_41_ = (int) (Math.random() * 8.0);
							if ((0x1 & i_41_ ^ 0xffffffff) == -2) {
								Mobile_Sub1.anInt10960 += Class353.anInt4342;
							}
							if ((i_41_ & 0x2 ^ 0xffffffff) == -3) {
								Node_Sub15_Sub13.anInt9870 += Node_Sub12.anInt5464;
							}
						}
						if ((Mobile_Sub1.anInt10960 ^ 0xffffffff) > 59) {
							Class353.anInt4342 = 2;
						}
						if ((Mobile_Sub1.anInt10960 ^ 0xffffffff) < -61) {
							Class353.anInt4342 = -2;
						}
						if ((Node_Sub15_Sub13.anInt9870 ^ 0xffffffff) > 19) {
							Node_Sub12.anInt5464 = 1;
						}
						Class218.worldResponseBuffer.anInt1579++;
						if ((Node_Sub15_Sub13.anInt9870 ^ 0xffffffff) < -11) {
							Node_Sub12.anInt5464 = -1;
						}
						if ((Class218.worldResponseBuffer.anInt1579 ^ 0xffffffff) < -51) {
							Class365.anInt4524++;
							Node_Sub13 node_sub13 = FloatBuffer.method2250(i + -14976, Class224.aClass318_2671, Class218.worldResponseBuffer.anIsaacCipher1571);
							Class218.worldResponseBuffer.method1514(126, node_sub13);
						}
						if (Animable_Sub1_Sub2.aBoolean10649) {
							Animable_Sub1.method824((byte) 90);
							Animable_Sub1_Sub2.aBoolean10649 = false;
						}
						try {
							Class218.worldResponseBuffer.method1512((byte) -89);
						} catch (java.io.IOException ioexception) {
							Class262_Sub13.method3182(false);
						}
					}
				}
			}
		}
	}
	
	final int[][] method2778(int i, boolean bool) {
		anInt10493++;
		if (bool != true) {
			anInt10492 = 36;
		}
		int[][] is = aClass348_7454.method3981(i, 3168);
		if (aClass348_7454.aBoolean4300) {
			int[][] is_42_ = this.method2777(-92, 0, aBoolean10486 ? -i + r_Sub2.anInt11054 : i);
			int[] is_43_ = is_42_[0];
			int[] is_44_ = is_42_[1];
			int[] is_45_ = is_42_[2];
			int[] is_46_ = is[0];
			int[] is_47_ = is[1];
			int[] is_48_ = is[2];
			if (!aBoolean10483) {
				for (int i_49_ = 0; (Class339_Sub7.anInt8728 ^ 0xffffffff) < (i_49_ ^ 0xffffffff); i_49_++) {
					is_46_[i_49_] = is_43_[i_49_];
					is_47_[i_49_] = is_44_[i_49_];
					is_48_[i_49_] = is_45_[i_49_];
				}
			} else {
				for (int i_50_ = 0; (i_50_ ^ 0xffffffff) > (Class339_Sub7.anInt8728 ^ 0xffffffff); i_50_++) {
					is_46_[i_50_] = is_43_[-i_50_ + Class303.anInt3824];
					is_47_[i_50_] = is_44_[Class303.anInt3824 + -i_50_];
					is_48_[i_50_] = is_45_[-i_50_ + Class303.anInt3824];
				}
			}
		}
		return is;
	}
	
	final int[] method2775(int i, int i_51_) {
		anInt10488++;
		int[] is = aClass146_7460.method1645(27356, i_51_);
		if (i < 107) {
			return null;
		}
		if (aClass146_7460.aBoolean1819) {
			int[] is_52_ = this.method2786(!aBoolean10486 ? i_51_ : r_Sub2.anInt11054 - i_51_, 0, 0);
			if (!aBoolean10483) {
				Class311.method3609(is_52_, 0, is, 0, Class339_Sub7.anInt8728);
			} else {
				for (int i_53_ = 0; Class339_Sub7.anInt8728 > i_53_; i_53_++)
					is[i_53_] = is_52_[-i_53_ + Class303.anInt3824];
			}
		}
		return is;
	}
}
