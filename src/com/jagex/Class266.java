package com.jagex;
import java.io.IOException;

public class Class266
{
	static int anInt3368;
	static int anInt3369;
	static int anInt3370;
	static int anInt3371;
	static int anInt3372;
	static int anInt3373;
	static int anInt3374;
	static int anInt3375;
	static int anInt3376;
	static int anInt3377;
	static int anInt3378;
	static int anInt3379;
	static HashTable aHashTable3380 = new HashTable(64);
	static int anInt3381;
	static int anInt3382;
	static int anInt3383;
	private Class158 aClass158_3384 = new Class158();
	static boolean aBoolean3385;
	private Class158 aClass158_3386 = new Class158();
	private Class158 aClass158_3387 = new Class158();
	private Class158 aClass158_3388 = new Class158();
	private BufferedConnection aBufferedConnection3389;
	private int anInt3390;
	private long aLong3391;
	private Buffer aBuffer3392 = new Buffer(4);
	volatile int anInt3393;
	volatile int anInt3394 = 0;
	private byte aByte3395;
	private Buffer aBuffer3396;
	private CacheNode_Sub16_Sub1 aCacheNode_Sub16_Sub1_3397;
	
	final void method3233(byte b) {
		try {
			aBufferedConnection3389.method430(20692);
		} catch (Exception exception) {
			/* empty */
		}
		anInt3373++;
		aBufferedConnection3389 = null;
		if (b != 98) {
			aClass158_3386 = null;
		}
		anInt3393 = -1;
		aByte3395 = (byte) (int) (Math.random() * 255.0 + 1.0);
		anInt3394++;
	}
	
	private final void method3234(byte b) {
		anInt3371++;
		if (aBufferedConnection3389 != null) {
			try {
				aBuffer3392.anInt7002 = 0;
				aBuffer3392.method2226(6, false);
				aBuffer3392.method2225((byte) 109, 3);
				aBufferedConnection3389.method429(0, 4, aBuffer3392.aByteArray7019, (byte) 78);
			} catch (IOException ioexception) {
				try {
					aBufferedConnection3389.method430(20692);
				} catch (Exception exception) {
					/* empty */
				}
				anInt3394++;
				anInt3393 = -2;
				aBufferedConnection3389 = null;
			}
			if (b != 0) {
				method3243(-90, null);
			}
		}
	}
	
	final void method3235(boolean bool) {
		if (bool != false) {
			method3235(false);
		}
		if (aBufferedConnection3389 != null) {
			aBufferedConnection3389.method430(20692);
		}
		anInt3377++;
	}
	
	final int method3236(int i) {
		if (i != 0) {
			return 87;
		}
		anInt3375++;
		return aClass158_3384.method1720((byte) -122) + aClass158_3386.method1720((byte) 20);
	}
	
	static final void method3237(int i, GraphicsToolkit graphicstoolkit) {
		for (EntityNode_Sub4 entitynode_sub4 = (EntityNode_Sub4) Animable_Sub2.aClass103_9116.method1113((byte) -45); entitynode_sub4 != null; entitynode_sub4 = (EntityNode_Sub4) Animable_Sub2.aClass103_9116.method1108(65)) {
			if (entitynode_sub4.aBoolean5978) {
				entitynode_sub4.method955(graphicstoolkit);
			}
		}
		anInt3374++;
		if (i != 0) {
			aHashTable3380 = null;
		}
	}
	
	final boolean method3238(byte b) {
		if (aBufferedConnection3389 != null) {
			long l = Class313.method3650(false);
			int i = (int) (-aLong3391 + l);
			aLong3391 = l;
			if (i > 200) {
				i = 200;
			}
			anInt3390 += i;
			if ((anInt3390 ^ 0xffffffff) < -30001) {
				try {
					aBufferedConnection3389.method430(b + 20622);
				} catch (Exception exception) {
					/* empty */
				}
				aBufferedConnection3389 = null;
			}
		}
		anInt3379++;
		if (aBufferedConnection3389 == null) {
			if (method3236(b ^ 0x46) != 0 || (method3246((byte) 111) ^ 0xffffffff) != -1) {
				return false;
			}
			return true;
		}
		try {
			aBufferedConnection3389.method423(-1650936088);
			CacheNode_Sub16_Sub1 cachenode_sub16_sub1 = (CacheNode_Sub16_Sub1) aClass158_3384.method1723(13);
			if (b != 70) {
				aClass158_3386 = null;
			}
			for (/**/; cachenode_sub16_sub1 != null; cachenode_sub16_sub1 = (CacheNode_Sub16_Sub1) aClass158_3384.method1721(0)) {
				aBuffer3392.anInt7002 = 0;
				aBuffer3392.method2226(1, false);
				aBuffer3392.method2225((byte) 66, (int) cachenode_sub16_sub1.aLong7037);
				aBufferedConnection3389.method429(0, 4, aBuffer3392.aByteArray7019, (byte) 78);
				aClass158_3386.method1719(true, cachenode_sub16_sub1);
			}
			for (CacheNode_Sub16_Sub1 cachenode_sub16_sub1_0_ = (CacheNode_Sub16_Sub1) aClass158_3387.method1723(b ^ 0x4b); cachenode_sub16_sub1_0_ != null; cachenode_sub16_sub1_0_ = (CacheNode_Sub16_Sub1) aClass158_3387.method1721(0)) {
				aBuffer3392.anInt7002 = 0;
				aBuffer3392.method2226(0, false);
				aBuffer3392.method2225((byte) 99, (int) cachenode_sub16_sub1_0_.aLong7037);
				aBufferedConnection3389.method429(0, 4, aBuffer3392.aByteArray7019, (byte) 78);
				aClass158_3388.method1719(true, cachenode_sub16_sub1_0_);
			}
			for (int i = 0; i < 100; i++) {
				int i_1_ = aBufferedConnection3389.method428(0);
				if (i_1_ < 0) {
					throw new IOException();
				}
				if (i_1_ == 0) {
					break;
				}
				anInt3390 = 0;
				int i_2_ = 0;
				if (aCacheNode_Sub16_Sub1_3397 == null) {
					i_2_ = 8;
				} else if (aCacheNode_Sub16_Sub1_3397.anInt11070 == 0) {
					i_2_ = 1;
				}
				if (i_2_ > 0) {
					int i_3_ = -aBuffer3396.anInt7002 + i_2_;
					if (i_1_ < i_3_) {
						i_3_ = i_1_;
					}
					aBufferedConnection3389.method425(i_3_, (byte) 48, aBuffer3396.anInt7002, aBuffer3396.aByteArray7019);
					if ((aByte3395 ^ 0xffffffff) != -1) {
						for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff); i_4_++)
							aBuffer3396.aByteArray7019[aBuffer3396.anInt7002 - -i_4_] = (byte) Node_Sub19.method2612(aBuffer3396.aByteArray7019[aBuffer3396.anInt7002 + i_4_], aByte3395);
					}
					aBuffer3396.anInt7002 += i_3_;
					if (i_2_ <= aBuffer3396.anInt7002) {
						if (aCacheNode_Sub16_Sub1_3397 == null) {
							aBuffer3396.anInt7002 = 0;
							int i_5_ = aBuffer3396.method2233(255);
							int i_6_ = aBuffer3396.method2219(-130546744);
							int i_7_ = aBuffer3396.method2233(255);
							int i_8_ = aBuffer3396.method2186(100);
							int i_9_ = 0x7f & i_7_;
							boolean bool = (i_7_ & 0x80 ^ 0xffffffff) != -1;
							long l = (long) (i_6_ + (i_5_ << 16));
							Object object = null;
							CacheNode_Sub16_Sub1 cachenode_sub16_sub1_10_;
							if (!bool) {
								for (cachenode_sub16_sub1_10_ = (CacheNode_Sub16_Sub1) aClass158_3386.method1723(13); cachenode_sub16_sub1_10_ != null; cachenode_sub16_sub1_10_ = (CacheNode_Sub16_Sub1) aClass158_3386.method1721(0)) {
									if ((cachenode_sub16_sub1_10_.aLong7037 ^ 0xffffffffffffffffL) == (l ^ 0xffffffffffffffffL)) {
										break;
									}
								}
							} else {
								for (cachenode_sub16_sub1_10_ = (CacheNode_Sub16_Sub1) aClass158_3388.method1723(13); cachenode_sub16_sub1_10_ != null; cachenode_sub16_sub1_10_ = (CacheNode_Sub16_Sub1) aClass158_3388.method1721(0)) {
									if ((cachenode_sub16_sub1_10_.aLong7037 ^ 0xffffffffffffffffL) == (l ^ 0xffffffffffffffffL)) {
										break;
									}
								}
							}
							if (cachenode_sub16_sub1_10_ == null) {
								throw new IOException();
							}
							aCacheNode_Sub16_Sub1_3397 = cachenode_sub16_sub1_10_;
							int i_11_ = (i_9_ ^ 0xffffffff) != -1 ? 9 : 5;
							aCacheNode_Sub16_Sub1_3397.aBuffer11072 = new Buffer(i_11_ + i_8_ - -aCacheNode_Sub16_Sub1_3397.aByte11069);
							aCacheNode_Sub16_Sub1_3397.aBuffer11072.method2226(i_9_, false);
							aCacheNode_Sub16_Sub1_3397.aBuffer11072.method2179((byte) -5, i_8_);
							aCacheNode_Sub16_Sub1_3397.anInt11070 = 8;
							aBuffer3396.anInt7002 = 0;
						} else if (aCacheNode_Sub16_Sub1_3397.anInt11070 == 0) {
							if (aBuffer3396.aByteArray7019[0] != -1) {
								aCacheNode_Sub16_Sub1_3397 = null;
							} else {
								aBuffer3396.anInt7002 = 0;
								aCacheNode_Sub16_Sub1_3397.anInt11070 = 1;
							}
						} else {
							throw new IOException();
						}
					}
				} else {
					int i_12_ = -aCacheNode_Sub16_Sub1_3397.aByte11069 + aCacheNode_Sub16_Sub1_3397.aBuffer11072.aByteArray7019.length;
					int i_13_ = 512 - aCacheNode_Sub16_Sub1_3397.anInt11070;
					if ((i_13_ ^ 0xffffffff) < (-aCacheNode_Sub16_Sub1_3397.aBuffer11072.anInt7002 + i_12_ ^ 0xffffffff)) {
						i_13_ = -aCacheNode_Sub16_Sub1_3397.aBuffer11072.anInt7002 + i_12_;
					}
					if (i_13_ > i_1_) {
						i_13_ = i_1_;
					}
					aBufferedConnection3389.method425(i_13_, (byte) 67, aCacheNode_Sub16_Sub1_3397.aBuffer11072.anInt7002, aCacheNode_Sub16_Sub1_3397.aBuffer11072.aByteArray7019);
					if ((aByte3395 ^ 0xffffffff) != -1) {
						for (int i_14_ = 0; i_14_ < i_13_; i_14_++)
							aCacheNode_Sub16_Sub1_3397.aBuffer11072.aByteArray7019[aCacheNode_Sub16_Sub1_3397.aBuffer11072.anInt7002 - -i_14_] = (byte) Node_Sub19.method2612(aCacheNode_Sub16_Sub1_3397.aBuffer11072.aByteArray7019[aCacheNode_Sub16_Sub1_3397.aBuffer11072.anInt7002 + i_14_], aByte3395);
					}
					aCacheNode_Sub16_Sub1_3397.aBuffer11072.anInt7002 += i_13_;
					aCacheNode_Sub16_Sub1_3397.anInt11070 += i_13_;
					if ((i_12_ ^ 0xffffffff) == (aCacheNode_Sub16_Sub1_3397.aBuffer11072.anInt7002 ^ 0xffffffff)) {
						aCacheNode_Sub16_Sub1_3397.method2275(-65);
						aCacheNode_Sub16_Sub1_3397.aBoolean9602 = false;
						aCacheNode_Sub16_Sub1_3397 = null;
					} else if (aCacheNode_Sub16_Sub1_3397.anInt11070 == 512) {
						aCacheNode_Sub16_Sub1_3397.anInt11070 = 0;
					}
				}
			}
			return true;
		} catch (IOException ioexception) {
			try {
				aBufferedConnection3389.method430(b + 20622);
			} catch (Exception exception) {
				/* empty */
			}
			aBufferedConnection3389 = null;
			anInt3394++;
			anInt3393 = -2;
			if (method3236(0) == 0 && (method3246((byte) 71) ^ 0xffffffff) == -1) {
				return true;
			}
			return false;
		}
	}
	
	final boolean method3239(int i) {
		if (i != 255) {
			return false;
		}
		anInt3376++;
		if ((method3246((byte) 121) ^ 0xffffffff) > -21) {
			return false;
		}
		return true;
	}
	
	final void method3240(boolean bool, int i) {
		anInt3378++;
		if (aBufferedConnection3389 != null) {
			try {
				aBuffer3392.anInt7002 = i;
				aBuffer3392.method2226(bool ? 2 : 3, false);
				aBuffer3392.method2225((byte) 85, 0);
				aBufferedConnection3389.method429(0, 4, aBuffer3392.aByteArray7019, (byte) 78);
			} catch (IOException ioexception) {
				try {
					aBufferedConnection3389.method430(20692);
				} catch (Exception exception) {
					/* empty */
				}
				aBufferedConnection3389 = null;
				anInt3393 = -2;
				anInt3394++;
			}
		}
	}
	
	final void method3241(boolean bool, int i, BufferedConnection bufferedconnection) {
		anInt3370++;
		if (aBufferedConnection3389 != null) {
			try {
				aBufferedConnection3389.method430(20692);
			} catch (Exception exception) {
				/* empty */
			}
			aBufferedConnection3389 = null;
		}
		aBufferedConnection3389 = bufferedconnection;
		if (i >= -7) {
			method3234((byte) -124);
		}
		method3234((byte) 0);
		method3240(bool, 0);
		aCacheNode_Sub16_Sub1_3397 = null;
		aBuffer3396.anInt7002 = 0;
		for (;;) {
			CacheNode_Sub16_Sub1 cachenode_sub16_sub1 = (CacheNode_Sub16_Sub1) aClass158_3386.method1717(-119);
			if (cachenode_sub16_sub1 == null) {
				break;
			}
			aClass158_3384.method1719(true, cachenode_sub16_sub1);
		}
		for (;;) {
			CacheNode_Sub16_Sub1 cachenode_sub16_sub1 = (CacheNode_Sub16_Sub1) aClass158_3388.method1717(-128);
			if (cachenode_sub16_sub1 == null) {
				break;
			}
			aClass158_3387.method1719(true, cachenode_sub16_sub1);
		}
		if (aByte3395 != 0) {
			try {
				aBuffer3392.anInt7002 = 0;
				aBuffer3392.method2226(4, false);
				aBuffer3392.method2226(aByte3395, false);
				aBuffer3392.method2210(0, -85);
				aBufferedConnection3389.method429(0, 4, aBuffer3392.aByteArray7019, (byte) 78);
			} catch (IOException ioexception) {
				try {
					aBufferedConnection3389.method430(20692);
				} catch (Exception exception) {
					/* empty */
				}
				anInt3394++;
				aBufferedConnection3389 = null;
				anInt3393 = -2;
			}
		}
		anInt3390 = 0;
		aLong3391 = Class313.method3650(false);
	}
	
	final void method3242(int i) {
		anInt3369++;
		if (aBufferedConnection3389 != null) {
			try {
				aBuffer3392.anInt7002 = 0;
				aBuffer3392.method2226(7, false);
				if (i >= -104) {
					method3244(-53);
				}
				aBuffer3392.method2225((byte) 65, 0);
				aBufferedConnection3389.method429(0, 4, aBuffer3392.aByteArray7019, (byte) 78);
			} catch (IOException ioexception) {
				try {
					aBufferedConnection3389.method430(20692);
				} catch (Exception exception) {
					/* empty */
				}
				aBufferedConnection3389 = null;
				anInt3393 = -2;
				anInt3394++;
			}
		}
	}
	
	static final int method3243(int i, Npc npc) {
		anInt3383++;
		NpcDefinition npcdefinition = npc.aNpcDefinition11122;
		if (npcdefinition.anIntArray2827 != null) {
			npcdefinition = npcdefinition.method2999(65535, Class24.aClass275_442);
			if (npcdefinition == null) {
				return -1;
			}
		}
		int i_15_ = npcdefinition.anInt2809;
		if (i > -25) {
			return -110;
		}
		Class259 class259 = npc.method868((byte) -124);
		int i_16_ = npc.anAnimator10860.method250((byte) 81);
		if (i_16_ != -1 && !npc.aBoolean10867) {
			if (class259.anInt3252 != i_16_ && class259.anInt3271 != i_16_ && (class259.anInt3293 ^ 0xffffffff) != (i_16_ ^ 0xffffffff) && (i_16_ ^ 0xffffffff) != (class259.anInt3270 ^ 0xffffffff)) {
				if (class259.anInt3262 == i_16_ || (i_16_ ^ 0xffffffff) == (class259.anInt3297 ^ 0xffffffff) || (class259.anInt3304 ^ 0xffffffff) == (i_16_ ^ 0xffffffff) || (class259.anInt3269 ^ 0xffffffff) == (i_16_ ^ 0xffffffff)) {
					i_15_ = npcdefinition.anInt2833;
				}
			} else {
				i_15_ = npcdefinition.anInt2810;
			}
		} else {
			i_15_ = npcdefinition.anInt2812;
		}
		return i_15_;
	}
	
	final boolean method3244(int i) {
		if (i != 24365) {
			aByte3395 = (byte) -93;
		}
		anInt3368++;
		if ((method3236(0) ^ 0xffffffff) > -21) {
			return false;
		}
		return true;
	}
	
	final void method3245(int i) {
		if (i != -2) {
			anInt3394 = 79;
		}
		if (aBufferedConnection3389 != null) {
			aBufferedConnection3389.method426((byte) -120);
		}
		anInt3382++;
	}
	
	private final int method3246(byte b) {
		anInt3381++;
		if (b < 31) {
			return -79;
		}
		return aClass158_3387.method1720((byte) 86) - -aClass158_3388.method1720((byte) -95);
	}
	
	final CacheNode_Sub16_Sub1 method3247(int i, int i_17_, byte b, boolean bool, byte b_18_) {
		anInt3372++;
		if (b != -79) {
			method3236(-28);
		}
		long l = (long) ((i << 16) + i_17_);
		CacheNode_Sub16_Sub1 cachenode_sub16_sub1 = new CacheNode_Sub16_Sub1();
		cachenode_sub16_sub1.aBoolean9598 = bool;
		cachenode_sub16_sub1.aByte11069 = b_18_;
		cachenode_sub16_sub1.aLong7037 = l;
		if (bool) {
			if ((method3236(0) ^ 0xffffffff) <= -21) {
				throw new RuntimeException();
			}
			aClass158_3384.method1719(true, cachenode_sub16_sub1);
		} else {
			if (method3246((byte) 85) >= 20) {
				throw new RuntimeException();
			}
			aClass158_3387.method1719(true, cachenode_sub16_sub1);
		}
		return cachenode_sub16_sub1;
	}
	
	public static void method3248(int i) {
		aHashTable3380 = null;
		if (i != 0) {
			method3248(-48);
		}
	}
	
	public Class266() {
		anInt3393 = 0;
		aByte3395 = (byte) 0;
		aBuffer3396 = new Buffer(8);
	}
}
