package com.jagex;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public class Class97
{
	static int anInt1274;
	static int anInt1275;
	static int anInt1276;
	static Class103 aClass103_1277 = new Class103();
	static int anInt1278;
	static int anInt1279;
	
	static final void method1076(Packet packet, int i) {
		anInt1274++;
		packet.method2261(107347906);
		int i_0_ = Class166.anInt5099;
		Player player = Class295.aPlayer3692 = Class270_Sub2.aPlayerArray8038[i_0_] = new Player();
		player.anInt10858 = i_0_;
		int i_1_ = packet.method2256((byte) -124, 30);
		byte b = (byte) (i_1_ >> 28);
		int i_2_ = i_1_ >> 14 & 0x3fff;
		player.anIntArray10910[0] = i_2_ + -Node_Sub53.anInt7668;
		int i_3_ = i_1_ & 0x3fff;
		player.anInt5934 = (player.anIntArray10910[0] << 9) - -(player.method853((byte) 53) << 8);
		player.anIntArray10908[0] = i_3_ + -Class320_Sub4.anInt8243;
		if (i >= 15) {
			player.anInt5940 = (player.anIntArray10908[0] << 9) + (player.method853((byte) 65) << 8);
			CacheNode_Sub20_Sub1.anInt11089 = player.aByte5933 = player.aByte5931 = b;
			if (Class238.method3021(player.anIntArray10908[0], player.anIntArray10910[0], -77)) {
				player.aByte5931++;
			}
			if (Class249.aBufferArray3154[i_0_] != null) {
				player.method889(Class249.aBufferArray3154[i_0_], 0);
			}
			Class178.anInt2120 = 0;
			Class66_Sub1.anIntArray8987[Class178.anInt2120++] = i_0_;
			Class215.aByteArray2538[i_0_] = (byte) 0;
			Class35.anInt538 = 0;
			for (int i_4_ = 1; i_4_ < 2048; i_4_++) {
				if (i_0_ != i_4_) {
					int i_5_ = packet.method2256((byte) 107, 18);
					int i_6_ = i_5_ >> 16;
					int i_7_ = (i_5_ & 0xff72) >> 8;
					int i_8_ = 0xff & i_5_;
					Class323 class323 = Class320_Sub10.aClass323Array8296[i_4_] = new Class323();
					class323.aBoolean4076 = false;
					class323.anInt4074 = -1;
					class323.anInt4077 = i_8_ + (i_7_ << 14) + (i_6_ << 28);
					class323.anInt4079 = 0;
					class323.aBoolean4082 = false;
					Node_Sub38_Sub19.anIntArray10292[Class35.anInt538++] = i_4_;
					Class215.aByteArray2538[i_4_] = (byte) 0;
				}
			}
			packet.method2255(-1431454110);
		}
	}
	
	static final GLSprite method1077(int i, byte[] bs) {
		if (i > -123) {
			aClass103_1277 = null;
		}
		anInt1276++;
		if (bs == null) {
			throw new RuntimeException("");
		}
		for (;;) {
			try {
				Image image = Toolkit.getDefaultToolkit().createImage(bs);
				MediaTracker mediatracker = new MediaTracker(Class158.aClient1983);
				mediatracker.addImage(image, 0);
				mediatracker.waitForAll();
				int i_9_ = image.getWidth(Class158.aClient1983);
				int i_10_ = image.getHeight(Class158.aClient1983);
				if (mediatracker.isErrorAny() || i_9_ < 0 || (i_10_ ^ 0xffffffff) > -1) {
					throw new RuntimeException("");
				}
				int[] is = new int[i_10_ * i_9_];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, i_9_, i_10_, is, 0, i_9_);
				pixelgrabber.grabPixels();
				return Class93.aGraphicsToolkit1241.method1235(i_9_, i_9_, i_10_, is, 0, 7468);
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
		}
	}
	
	public static void method1078(int i) {
		if (i != 7750473) {
			anInt1279 = 89;
		}
		aClass103_1277 = null;
	}
	
	static final void method1079(byte b, int i, int i_11_, boolean bool, int i_12_, boolean bool_13_, int i_14_) {
		if ((i ^ 0xffffffff) < (i_11_ ^ 0xffffffff)) {
			int i_15_ = (i_11_ - -i) / 2;
			int i_16_ = i_11_;
			Class377_Sub1 class377_sub1 = Class180.aClass377_Sub1Array2143[i_15_];
			Class180.aClass377_Sub1Array2143[i_15_] = Class180.aClass377_Sub1Array2143[i];
			Class180.aClass377_Sub1Array2143[i] = class377_sub1;
			for (int i_17_ = i_11_; i_17_ < i; i_17_++) {
				if (Node_Sub38_Sub29.method2889(class377_sub1, i_12_, i_14_, bool_13_, 70, Class180.aClass377_Sub1Array2143[i_17_], bool) <= 0) {
					Class377_Sub1 class377_sub1_18_ = Class180.aClass377_Sub1Array2143[i_17_];
					Class180.aClass377_Sub1Array2143[i_17_] = Class180.aClass377_Sub1Array2143[i_16_];
					Class180.aClass377_Sub1Array2143[i_16_++] = class377_sub1_18_;
				}
			}
			Class180.aClass377_Sub1Array2143[i] = Class180.aClass377_Sub1Array2143[i_16_];
			Class180.aClass377_Sub1Array2143[i_16_] = class377_sub1;
			method1079((byte) -86, i_16_ - 1, i_11_, bool, i_12_, bool_13_, i_14_);
			method1079((byte) -86, i, 1 + i_16_, bool, i_12_, bool_13_, i_14_);
		}
		anInt1275++;
		if (b != -86) {
			aClass103_1277 = null;
		}
	}
	
	static final void method1080(int i, byte b, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_) {
		anInt1278++;
		if (b >= 62) {
			if ((Class262_Sub4.anInt7722 ^ 0xffffffff) >= (i_23_ ^ 0xffffffff) && za_Sub2.anInt10513 >= i_21_ && Class384.anInt4906 <= i_22_ && Node_Sub25_Sub1.anInt9936 >= i) {
				if (i_20_ == 1) {
					Class102.method1097(i, i_22_, i_19_, i_21_, i_23_, (byte) 96);
				} else {
					Class289.method3405(i_19_, i_23_, i_21_, i, i_20_, i_22_, (byte) 44);
				}
			} else if (i_20_ != 1) {
				Node_Sub19.method2608(i_20_, (byte) 97, i_22_, i_21_, i, i_23_, i_19_);
			} else {
				GLSprite_Sub1.method1201(i, i_23_, i_19_, -12935, i_21_, i_22_);
			}
		}
	}
}
