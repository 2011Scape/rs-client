package com.jagex;

public class Class32
{
	static Class359 aClass359_508;
	static int anInt509;
	static int anInt510;
	static int anInt511;
	static int anInt512;
	static int anInt513;
	static int anInt514;
	static int anInt515;
	static Animable[] anAnimableArray516;
	private Class302 aClass302_517;
	private Class61 aClass61_518 = new Class61(64);
	
	final void method352(byte b) {
		anInt510++;
		synchronized (aClass61_518) {
			aClass61_518.method602((byte) -121);
		}
		if (b != -75) {
			method353(37, (byte) -82);
		}
	}
	
	final Class184 method353(int i, byte b) {
		anInt514++;
		Class184 class184;
		synchronized (aClass61_518) {
			class184 = (Class184) aClass61_518.method607((long) i, 0);
		}
		if (class184 != null) {
			return class184;
		}
		byte[] bs;
		synchronized (aClass302_517) {
			bs = aClass302_517.method3524(false, i, 35);
		}
		class184 = new Class184();
		if (bs != null) {
			class184.method1847(new Buffer(bs), 6991);
		}
		class184.method1843(-18);
		synchronized (aClass61_518) {
			aClass61_518.method601(class184, 25566, (long) i);
			int i_0_ = -65 % ((b - -7) / 37);
		}
		return class184;
	}
	
	static final int method354(int i, int i_1_, byte b, int i_2_, int i_3_, int i_4_, int i_5_) {
		i_5_ &= 0x3;
		if ((i_3_ & 0x1) == 1) {
			int i_6_ = i;
			i = i_2_;
			i_2_ = i_6_;
		}
		anInt509++;
		int i_7_ = 78 % ((b - -54) / 47);
		if (i_5_ == 0) {
			return i_4_;
		}
		if ((i_5_ ^ 0xffffffff) == -2) {
			return i_1_;
		}
		if (i_5_ == 2) {
			return -i_4_ + 7 + -i + 1;
		}
		return -i_1_ + 7 - (-1 + i_2_);
	}
	
	final void method355(int i, int i_8_) {
		if (i != -2) {
			method359(null, -91);
		}
		synchronized (aClass61_518) {
			aClass61_518.method598(i_8_, -11819);
		}
		anInt512++;
	}
	
	static final CacheNode_Sub9 method356(byte[] bs, boolean bool) {
		anInt513++;
		CacheNode_Sub9 cachenode_sub9 = new CacheNode_Sub9();
		Buffer buffer = new Buffer(bs);
		buffer.anInt7002 = -2 + buffer.aByteArray7019.length;
		int i = buffer.method2219(-130546744);
		int i_9_ = buffer.aByteArray7019.length - (2 - -i) - 16;
		if (bool != false) {
			method359(null, -93);
		}
		buffer.anInt7002 = i_9_;
		int i_10_ = buffer.method2186(-107);
		cachenode_sub9.anInt9499 = buffer.method2219(-130546744);
		cachenode_sub9.anInt9506 = buffer.method2219(-130546744);
		cachenode_sub9.anInt9502 = buffer.method2219(-130546744);
		cachenode_sub9.anInt9507 = buffer.method2219(-130546744);
		cachenode_sub9.anInt9511 = buffer.method2219(-130546744);
		cachenode_sub9.anInt9512 = buffer.method2219(-130546744);
		int i_11_ = buffer.method2233(255);
		if ((i_11_ ^ 0xffffffff) < -1) {
			cachenode_sub9.aHashTableArray9503 = new HashTable[i_11_];
			for (int i_12_ = 0; i_11_ > i_12_; i_12_++) {
				int i_13_ = buffer.method2219(-130546744);
				HashTable hashtable = new HashTable(Class320_Sub19.method3753(i_13_, -729073628));
				cachenode_sub9.aHashTableArray9503[i_12_] = hashtable;
				while ((i_13_-- ^ 0xffffffff) < -1) {
					int i_14_ = buffer.method2186(66);
					int i_15_ = buffer.method2186(-64);
					hashtable.method1515((long) i_14_, new Node_Sub32(i_15_), -128);
				}
			}
		}
		buffer.anInt7002 = 0;
		cachenode_sub9.aString9497 = buffer.method2240((byte) -46);
		cachenode_sub9.anIntArray9500 = new int[i_10_];
		int i_16_ = 0;
		while (buffer.anInt7002 < i_9_) {
			int i_17_ = buffer.method2219(-130546744);
			if ((i_17_ ^ 0xffffffff) == -4) {
				if (cachenode_sub9.aStringArray9504 == null) {
					cachenode_sub9.aStringArray9504 = new String[i_10_];
				}
				cachenode_sub9.aStringArray9504[i_16_] = buffer.method2195(-1).intern();
			} else if ((i_17_ ^ 0xffffffff) != -55) {
				if (cachenode_sub9.anIntArray9508 == null) {
					cachenode_sub9.anIntArray9508 = new int[i_10_];
				}
				if ((i_17_ ^ 0xffffffff) > -151 && i_17_ != 21 && i_17_ != 38 && i_17_ != 39) {
					cachenode_sub9.anIntArray9508[i_16_] = buffer.method2186(-106);
				} else {
					cachenode_sub9.anIntArray9508[i_16_] = buffer.method2233(255);
				}
			} else {
				if (cachenode_sub9.aLongArray9501 == null) {
					cachenode_sub9.aLongArray9501 = new long[i_10_];
				}
				cachenode_sub9.aLongArray9501[i_16_] = buffer.method2235(-2023329376);
			}
			cachenode_sub9.anIntArray9500[i_16_++] = i_17_;
		}
		return cachenode_sub9;
	}
	
	final void method357(int i) {
		synchronized (aClass61_518) {
			aClass61_518.method608(false);
		}
		anInt515++;
		if (i != 23415) {
			method353(99, (byte) 57);
		}
	}
	
	public static void method358(int i) {
		if (i != 7) {
			anAnimableArray516 = null;
		}
		aClass359_508 = null;
		anAnimableArray516 = null;
	}
	
	static final Node_Sub9_Sub1 method359(Node_Sub9_Sub1 node_sub9_sub1, int i) {
		anInt511++;
		Node_Sub9_Sub1 node_sub9_sub1_18_ = node_sub9_sub1 != null ? new Node_Sub9_Sub1(node_sub9_sub1) : new Node_Sub9_Sub1();
		if (i != -9293) {
			return null;
		}
		node_sub9_sub1_18_.method2452(128, 9, (byte) -101);
		return node_sub9_sub1_18_;
	}
	
	Class32(Class353 class353, int i, Class302 class302) {
		aClass302_517 = class302;
		if (aClass302_517 != null) {
			aClass302_517.method3537(-2, 35);
		}
	}
}
