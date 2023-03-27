package com.jagex;
import jaggl.OpenGL;

public class Class134_Sub1 extends Class134 implements Interface13_Impl3
{
	static int anInt9014 = 0;
	static int anInt9015;
	static int anInt9016;
	static int anInt9017;
	private int anInt9018;
	private int anInt9019;
	private int anInt9020;
	
	Class134_Sub1(GLXToolkit glxtoolkit, Class68 class68, int i, int i_0_, int i_1_, byte[] bs) {
		super(glxtoolkit, 32879, class68, Class372.aClass372_4594, i * (i_0_ * i_1_), false);
		anInt9018 = i_1_;
		anInt9020 = i;
		anInt9019 = i_0_;
		aGLXToolkit5299.method1312((byte) -21, this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(anInt5296, 0, this.method1570(10242), anInt9020, anInt9019, anInt9018, 0, Node_Sub36.method2753((byte) -18, aClass68_5317), 5121, bs, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
	
	static final void method1580(int i, int i_2_, CacheNode_Sub13 cachenode_sub13, int i_3_) {
		anInt9017++;
		if (cachenode_sub13 != null && cachenode_sub13 != Class368.aClass312_4549.aNode3958) {
			int i_4_ = cachenode_sub13.anInt9568;
			int i_5_ = cachenode_sub13.anInt9561;
			int i_6_ = cachenode_sub13.anInt9562;
			int i_7_ = (int) cachenode_sub13.aLong9563;
			if (i_6_ >= 2000) {
				i_6_ -= 2000;
			}
			long l = cachenode_sub13.aLong9563;
			if ((i_6_ ^ 0xffffffff) == -45) {
				Player player = Class270_Sub2.aPlayerArray8038[i_7_];
				if (player != null) {
					Node_Sub37.anInt7431 = 0;
					Class93_Sub2.anInt6067 = i_3_;
					Class270.anInt3475++;
					Node_Sub38_Sub28.anInt10403 = 2;
					Class163.anInt2014 = i;
					Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class355.aClass318_4396, Class218.worldResponseBuffer.anIsaacCipher1571);
					node_sub13.aPacket7113.method2199(i_7_, -1);
					node_sub13.aPacket7113.method2215(i_2_ ^ 0x2f4396b1, Node_Sub15_Sub9.anInt9839);
					node_sub13.aPacket7113.method2210(Class92.anInt1230, -33);
					node_sub13.aPacket7113.method2245(-3528, !Class175.aClass291_2100.method3450(93, 82) ? 0 : 1);
					node_sub13.aPacket7113.method2207(21226, Class46.anInt681);
					Class218.worldResponseBuffer.method1514(126, node_sub13);
					Class78.method778(0, player.anIntArray10908[0], player.method853((byte) 99), true, player.anIntArray10910[0], 0, -2, 32, player.method853((byte) 110));
				}
			}
			if ((i_6_ ^ 0xffffffff) == -5) {
				Node_Sub38_Sub28.anInt10403 = 2;
				Class163.anInt2014 = i;
				Node_Sub37.anInt7431 = 0;
				Class93_Sub2.anInt6067 = i_3_;
				Class270.anInt3475++;
				Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class355.aClass318_4396, Class218.worldResponseBuffer.anIsaacCipher1571);
				node_sub13.aPacket7113.method2199(Class295.aPlayer3692.anInt10858, -1);
				node_sub13.aPacket7113.method2215(792958640, Node_Sub15_Sub9.anInt9839);
				node_sub13.aPacket7113.method2210(Class92.anInt1230, -52);
				node_sub13.aPacket7113.method2245(-3528, Class175.aClass291_2100.method3450(i_2_ ^ ~0x20, 82) ? 1 : 0);
				node_sub13.aPacket7113.method2207(21226, Class46.anInt681);
				Class218.worldResponseBuffer.method1514(127, node_sub13);
			}
			if (i_6_ == 12) {
				Widget widget = Node_Sub3.method2169(i_2_ ^ ~0x65, i_4_, i_5_);
				if (widget != null) {
					Node_Sub38_Sub23.method2863(i_2_ ^ ~0x4b72);
					Node_Sub35 node_sub35 = client.method113(widget);
					Node_Sub38_Sub18.method2846(node_sub35.method2743(-49), (byte) -109, widget, node_sub35.anInt7413);
					Class84.aString1148 = Class205.method2033(widget, (byte) -104);
					Class66.aString5177 = widget.aString4779 + "<col=ffffff>";
					if (Class84.aString1148 == null) {
						Class84.aString1148 = "Null";
					}
				}
			} else {
				if (i_6_ == 58) {
					if ((Class339_Sub7.anInt8729 ^ 0xffffffff) >= -1 || !Class175.aClass291_2100.method3450(119, 82) || !Class175.aClass291_2100.method3450(i_2_ ^ 0x6a, 81)) {
						Node_Sub13 node_sub13 = Class22.method298(i_4_, (byte) 125, i_5_, i_7_);
						if (i_7_ == 1) {
							node_sub13.aPacket7113.method2226(-1, false);
							node_sub13.aPacket7113.method2226(-1, false);
							node_sub13.aPacket7113.method2210((int) Node_Sub12.aFloat5450, -26);
							node_sub13.aPacket7113.method2226(57, false);
							node_sub13.aPacket7113.method2226(Mobile_Sub1.anInt10960, false);
							node_sub13.aPacket7113.method2226(Node_Sub15_Sub13.anInt9870, false);
							node_sub13.aPacket7113.method2226(89, false);
							node_sub13.aPacket7113.method2210(Class295.aPlayer3692.anInt5934, -48);
							node_sub13.aPacket7113.method2210(Class295.aPlayer3692.anInt5940, -50);
							node_sub13.aPacket7113.method2226(63, false);
						} else {
							Class163.anInt2014 = i;
							Node_Sub38_Sub28.anInt10403 = 1;
							Node_Sub37.anInt7431 = 0;
							Class93_Sub2.anInt6067 = i_3_;
						}
						Class218.worldResponseBuffer.method1514(126, node_sub13);
						Class78.method778(0, i_5_, 1, true, i_4_, 0, -4, i_2_ ^ ~0x6b, 1);
					} else {
						Class331.method3843(false, Class295.aPlayer3692.aByte5933, Class320_Sub4.anInt8243 - -i_5_, Node_Sub53.anInt7668 + i_4_);
					}
				}
				if (i_6_ == 10 && Node_Sub25_Sub3.aWidget9990 == null) {
					Class257.method3121(i_4_, true, i_5_);
					Node_Sub25_Sub3.aWidget9990 = Node_Sub3.method2169(-101, i_4_, i_5_);
					CacheNode_Sub9.method2321(-1, Node_Sub25_Sub3.aWidget9990);
				}
				Class318 class318 = null;
				if ((i_6_ ^ 0xffffffff) == -3) {
					class318 = Class228.aClass318_2720;
				} else if ((i_6_ ^ 0xffffffff) != -23) {
					if ((i_6_ ^ 0xffffffff) == -53) {
						class318 = OutputStream_Sub2.aClass318_93;
					} else if (i_6_ != 30) {
						if ((i_6_ ^ 0xffffffff) != -54) {
							if (i_6_ == 9) {
								class318 = Class290_Sub4.aClass318_8089;
							} else if ((i_6_ ^ 0xffffffff) != -52) {
								if ((i_6_ ^ 0xffffffff) == -16) {
									class318 = Mobile_Sub4.aClass318_10992;
								} else if (i_6_ == 48) {
									class318 = CacheNode_Sub15.aClass318_9590;
								} else if (i_6_ == 16) {
									class318 = Node_Sub38_Sub23.aClass318_10329;
								}
							} else {
								class318 = Node_Sub25_Sub1.aClass318_9953;
							}
						} else {
							class318 = Class359.aClass318_4463;
						}
					} else {
						class318 = Class312.aClass318_3973;
					}
				} else {
					class318 = Class37.aClass318_557;
				}
				if (class318 != null) {
					Player player = Class270_Sub2.aPlayerArray8038[i_7_];
					if (player != null) {
						Node_Sub37.anInt7431 = 0;
						Class188_Sub1.anInt6852++;
						Class163.anInt2014 = i;
						Node_Sub38_Sub28.anInt10403 = 2;
						Class93_Sub2.anInt6067 = i_3_;
						Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, class318, Class218.worldResponseBuffer.anIsaacCipher1571);
						node_sub13.aPacket7113.method2226(Class175.aClass291_2100.method3450(-42, 82) ? 1 : 0, false);
						node_sub13.aPacket7113.method2210(i_7_, -117);
						Class218.worldResponseBuffer.method1514(i_2_ + 125, node_sub13);
						Class78.method778(0, player.anIntArray10908[0], player.method853((byte) 125), true, player.anIntArray10910[0], 0, -2, 127, player.method853((byte) 60));
					}
				}
				if (i_2_ != 1) {
					anInt9015 = 28;
				}
				Class318 class318_8_ = null;
				if (i_6_ != 25) {
					if (i_6_ != 5) {
						if (i_6_ == 50) {
							class318_8_ = CacheNode_Sub16.aClass318_9599;
						} else if ((i_6_ ^ 0xffffffff) != -7) {
							if ((i_6_ ^ 0xffffffff) != -46) {
								if ((i_6_ ^ 0xffffffff) == -1008) {
									class318_8_ = Class51_Sub1.aClass318_9061;
								}
							} else {
								class318_8_ = Class50.aClass318_780;
							}
						} else {
							class318_8_ = Class294.aClass318_3685;
						}
					} else {
						class318_8_ = Class218.aClass318_2570;
					}
				} else {
					class318_8_ = Class128.aClass318_1658;
				}
				if (class318_8_ != null) {
					Class163.anInt2014 = i;
					Node_Sub37.anInt7431 = 0;
					Node_Sub38_Sub28.anInt10403 = 2;
					Class93_Sub2.anInt6067 = i_3_;
					Class282.anInt3587++;
					Node_Sub13 node_sub13 = FloatBuffer.method2250(i_2_ ^ ~0x180, class318_8_, Class218.worldResponseBuffer.anIsaacCipher1571);
					node_sub13.aPacket7113.method2230(i_7_, 128);
					node_sub13.aPacket7113.method2226(!Class175.aClass291_2100.method3450(94, 82) ? 0 : 1, false);
					node_sub13.aPacket7113.method2210(i_5_ + Class320_Sub4.anInt8243, -95);
					node_sub13.aPacket7113.method2199(Node_Sub53.anInt7668 + i_4_, -1);
					Class218.worldResponseBuffer.method1514(126, node_sub13);
					Class223.method2104(0, i_5_, i_4_);
				}
				if (i_6_ == 11) {
					if ((Class339_Sub7.anInt8729 ^ 0xffffffff) < -1 && Class175.aClass291_2100.method3450(-121, 82) && Class175.aClass291_2100.method3450(111, 81)) {
						Class331.method3843(false, Class295.aPlayer3692.aByte5933, Class320_Sub4.anInt8243 + i_5_, Node_Sub53.anInt7668 + i_4_);
					} else {
						Node_Sub37.anInt7431 = 0;
						Class131.anInt5443++;
						Class93_Sub2.anInt6067 = i_3_;
						Node_Sub38_Sub28.anInt10403 = 1;
						Class163.anInt2014 = i;
						Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class144_Sub4.aClass318_6847, Class218.worldResponseBuffer.anIsaacCipher1571);
						node_sub13.aPacket7113.method2207(21226, i_5_ + Class320_Sub4.anInt8243);
						node_sub13.aPacket7113.method2199(Node_Sub53.anInt7668 + i_4_, -1);
						Class218.worldResponseBuffer.method1514(126, node_sub13);
					}
				}
				if ((i_6_ ^ 0xffffffff) == -19) {
					Widget widget = Node_Sub3.method2169(-101, i_4_, i_5_);
					if (widget != null) {
						Class166.method1747((byte) -53, widget);
					}
				}
				Class318 class318_9_ = null;
				if (i_6_ != 49) {
					if (i_6_ != 59) {
						if ((i_6_ ^ 0xffffffff) == -48) {
							class318_9_ = Class68.aClass318_933;
						} else if ((i_6_ ^ 0xffffffff) == -58) {
							class318_9_ = Class163.aClass318_2018;
						} else if (i_6_ != 3) {
							if ((i_6_ ^ 0xffffffff) == -1012) {
								class318_9_ = Class66_Sub2_Sub1.aClass318_10581;
							}
						} else {
							class318_9_ = Class225.aClass318_2679;
						}
					} else {
						class318_9_ = Node_Sub42.aClass318_7523;
					}
				} else {
					class318_9_ = Class320_Sub13.aClass318_8334;
				}
				if (class318_9_ != null) {
					Node_Sub41 node_sub41 = (Node_Sub41) Class12.aHashTable187.method1518(3512, (long) i_7_);
					if (node_sub41 != null) {
						Class93_Sub2.anInt6067 = i_3_;
						Npc npc = node_sub41.aNpc7518;
						Class260.anInt5228++;
						Node_Sub38_Sub28.anInt10403 = 2;
						Class163.anInt2014 = i;
						Node_Sub37.anInt7431 = 0;
						Node_Sub13 node_sub13 = FloatBuffer.method2250(i_2_ ^ ~0x180, class318_9_, Class218.worldResponseBuffer.anIsaacCipher1571);
						node_sub13.aPacket7113.method2221(!Class175.aClass291_2100.method3450(i_2_ ^ 0x54, 82) ? 0 : 1, (byte) 127);
						node_sub13.aPacket7113.method2230(i_7_, 128);
						Class218.worldResponseBuffer.method1514(126, node_sub13);
						Class78.method778(0, npc.anIntArray10908[0], npc.method853((byte) 76), true, npc.anIntArray10910[0], 0, -2, 116, npc.method853((byte) 103));
					}
				}
				Class318 class318_10_ = null;
				if (i_6_ != 19) {
					if (i_6_ != 13) {
						if ((i_6_ ^ 0xffffffff) != -47) {
							if (i_6_ != 8) {
								if ((i_6_ ^ 0xffffffff) == -1011) {
									class318_10_ = Class194_Sub3_Sub1.aClass318_9373;
								} else if ((i_6_ ^ 0xffffffff) == -1009) {
									class318_10_ = Animable_Sub2.aClass318_9114;
								}
							} else {
								class318_10_ = Class117_Sub1.aClass318_4932;
							}
						} else {
							class318_10_ = Class215.aClass318_2529;
						}
					} else {
						class318_10_ = Class262_Sub4.aClass318_7726;
					}
				} else {
					class318_10_ = Class39.aClass318_584;
				}
				if (class318_10_ != null) {
					Class163.anInt2014 = i;
					Node_Sub38_Sub28.anInt10403 = 2;
					Node_Sub37.anInt7431 = 0;
					Class93_Sub2.anInt6067 = i_3_;
					Class317.anInt4039++;
					Node_Sub13 node_sub13 = FloatBuffer.method2250(i_2_ ^ ~0x180, class318_10_, Class218.worldResponseBuffer.anIsaacCipher1571);
					node_sub13.aPacket7113.method2221(Class175.aClass291_2100.method3450(99, 82) ? 1 : 0, (byte) 127);
					node_sub13.aPacket7113.method2230(Node_Sub53.anInt7668 + i_4_, i_2_ ^ 0x81);
					node_sub13.aPacket7113.method2207(21226, (int) (l >>> 32) & 0x7fffffff);
					node_sub13.aPacket7113.method2199(i_5_ - -Class320_Sub4.anInt8243, -1);
					Class218.worldResponseBuffer.method1514(i_2_ + 125, node_sub13);
					Class25.method306(-43, i_4_, l, i_5_);
				}
				if ((i_6_ ^ 0xffffffff) == -1004 || (i_6_ ^ 0xffffffff) == -1002 || i_6_ == 1006 || i_6_ == 1009 || i_6_ == 1004) {
					Class262_Sub20.method3204((byte) -121, i_4_, i_7_, i_6_);
				}
				if ((i_6_ ^ 0xffffffff) == -22) {
					Class93_Sub2.anInt6067 = i_3_;
					Node_Sub38_Sub28.anInt10403 = 1;
					Class163.anInt2014 = i;
					ObjectDefinition.anInt2959++;
					Node_Sub37.anInt7431 = 0;
					Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, RuntimeException_Sub1.aClass318_4920, Class218.worldResponseBuffer.anIsaacCipher1571);
					node_sub13.aPacket7113.method2230(Node_Sub53.anInt7668 - -i_4_, 128);
					node_sub13.aPacket7113.method2199(Class92.anInt1230, -1);
					node_sub13.aPacket7113.method2187(true, Node_Sub15_Sub9.anInt9839);
					node_sub13.aPacket7113.method2230(Class320_Sub4.anInt8243 + i_5_, i_2_ + 127);
					node_sub13.aPacket7113.method2210(Class46.anInt681, i_2_ ^ ~0x31);
					Class218.worldResponseBuffer.method1514(127, node_sub13);
					Class78.method778(0, i_5_, 1, true, i_4_, 0, -4, -107, 1);
				}
				if ((i_6_ ^ 0xffffffff) == -18) {
					Node_Sub38_Sub28.anInt10403 = 2;
					Node_Sub37.anInt7431 = 0;
					Class163.anInt2014 = i;
					Class93_Sub2.anInt6067 = i_3_;
					Class188_Sub1_Sub1.anInt9329++;
					Node_Sub13 node_sub13 = FloatBuffer.method2250(i_2_ + -387, Class102.aClass318_1314, Class218.worldResponseBuffer.anIsaacCipher1571);
					node_sub13.aPacket7113.method2210(i_4_ + Node_Sub53.anInt7668, -96);
					node_sub13.aPacket7113.method2210(Class320_Sub4.anInt8243 + i_5_, -105);
					node_sub13.aPacket7113.method2207(21226, Class92.anInt1230);
					node_sub13.aPacket7113.method2184(Node_Sub15_Sub9.anInt9839, (byte) -122);
					node_sub13.aPacket7113.method2199(Class46.anInt681, i_2_ ^ ~0x1);
					node_sub13.aPacket7113.method2226(!Class175.aClass291_2100.method3450(125, 82) ? 0 : 1, false);
					node_sub13.aPacket7113.method2199(i_7_, -1);
					Class218.worldResponseBuffer.method1514(127, node_sub13);
					Class223.method2104(0, i_5_, i_4_);
				}
				if ((i_6_ ^ 0xffffffff) == -24) {
					Node_Sub41 node_sub41 = (Node_Sub41) Class12.aHashTable187.method1518(3512, (long) i_7_);
					if (node_sub41 != null) {
						Npc npc = node_sub41.aNpc7518;
						Node_Sub37.anInt7431 = 0;
						Class122.anInt1552++;
						Node_Sub38_Sub28.anInt10403 = 2;
						Class93_Sub2.anInt6067 = i_3_;
						Class163.anInt2014 = i;
						Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class269.aClass318_3470, Class218.worldResponseBuffer.anIsaacCipher1571);
						node_sub13.aPacket7113.method2207(21226, Class46.anInt681);
						node_sub13.aPacket7113.method2199(Class92.anInt1230, -1);
						node_sub13.aPacket7113.method2199(i_7_, -1);
						node_sub13.aPacket7113.method2184(Node_Sub15_Sub9.anInt9839, (byte) -34);
						node_sub13.aPacket7113.method2226(!Class175.aClass291_2100.method3450(-40, 82) ? 0 : 1, false);
						Class218.worldResponseBuffer.method1514(127, node_sub13);
						Class78.method778(0, npc.anIntArray10908[0], npc.method853((byte) 44), true, npc.anIntArray10910[0], 0, -2, i_2_ ^ ~0x5b, npc.method853((byte) 50));
					}
				}
				if ((i_6_ ^ 0xffffffff) == -21 || (i_6_ ^ 0xffffffff) == -1003) {
					r_Sub1.method2364(-54, i_5_, i_4_, cachenode_sub13.aString9558, i_7_);
				}
				if (i_6_ == 60) {
					Class93_Sub2.anInt6067 = i_3_;
					Node_Sub37.anInt7431 = 0;
					Class163.anInt2014 = i;
					Node_Sub38_Sub28.anInt10403 = 2;
					NpcDefinition.anInt2845++;
					Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, EntityNode_Sub3_Sub1.aClass318_9159, Class218.worldResponseBuffer.anIsaacCipher1571);
					node_sub13.aPacket7113.method2178(Class175.aClass291_2100.method3450(-61, 82) ? 1 : 0, true);
					node_sub13.aPacket7113.method2199(Class320_Sub4.anInt8243 + i_5_, -1);
					node_sub13.aPacket7113.method2199(Class46.anInt681, -1);
					node_sub13.aPacket7113.method2215(792958640, Node_Sub15_Sub9.anInt9839);
					node_sub13.aPacket7113.method2207(21226, Class92.anInt1230);
					node_sub13.aPacket7113.method2199(i_4_ - -Node_Sub53.anInt7668, -1);
					node_sub13.aPacket7113.method2230(0x7fffffff & (int) (l >>> 32), 128);
					Class218.worldResponseBuffer.method1514(127, node_sub13);
					Class25.method306(-65, i_4_, l, i_5_);
				}
				if (Class87.aBoolean1185) {
					Node_Sub38_Sub23.method2863(-19316);
				}
				if (Class41.aWidget622 != null && GLPlane.anInt7937 == 0) {
					CacheNode_Sub9.method2321(-1, Class41.aWidget622);
				}
			}
		}
	}
	
	static final boolean method1581(int i, int i_11_) {
		anInt9016++;
		if (i_11_ != -25900) {
			anInt9014 = -33;
		}
		if (i != 3 && (i ^ 0xffffffff) != -5) {
			return false;
		}
		return true;
	}
}
