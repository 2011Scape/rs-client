package com.jagex;
import java.math.BigInteger;

public class Class262_Sub10 extends Class262
{
	static int anInt7767;
	private int anInt7768;
	private int anInt7769;
	private int anInt7770;
	private int anInt7771;
	private int anInt7772;
	static int[] anIntArray7773 = new int[13];
	static int anInt7774;
	static BigInteger aBigInteger7775 = new BigInteger("10001", 16);
	static Class302 aClass302_7776;
	
	public static void method3172(boolean bool) {
		aClass302_7776 = null;
		anIntArray7773 = null;
		if (bool != true) {
			anIntArray7773 = null;
		}
		aBigInteger7775 = null;
	}
	
	static final void method3173(boolean bool) {
		anInt7774++;
		Packet packet = Class218.worldResponseBuffer.aPacket1570;
		packet.method2261(107347906);
		int i = packet.method2256((byte) -127, 8);
		if (Node_Sub25_Sub3.anInt9987 > i) {
			for (int i_0_ = i; Node_Sub25_Sub3.anInt9987 > i_0_; i_0_++)
				FileOnDisk.anIntArray1322[Class270_Sub2_Sub1.anInt10543++] = Class54.anIntArray816[i_0_];
		}
		if (bool != false) {
			method3173(false);
		}
		if ((i ^ 0xffffffff) < (Node_Sub25_Sub3.anInt9987 ^ 0xffffffff)) {
			throw new RuntimeException("gnpov1");
		}
		Node_Sub25_Sub3.anInt9987 = 0;
		for (int i_1_ = 0; i > i_1_; i_1_++) {
			int i_2_ = Class54.anIntArray816[i_1_];
			Npc npc = ((Node_Sub41) Class12.aHashTable187.method1518(3512, (long) i_2_)).aNpc7518;
			int i_3_ = packet.method2256((byte) -123, 1);
			if (i_3_ == 0) {
				Class54.anIntArray816[Node_Sub25_Sub3.anInt9987++] = i_2_;
				npc.anInt10880 = Plane.anInt3423;
			} else {
				int i_4_ = packet.method2256((byte) -128, 2);
				if (i_4_ == 0) {
					Class54.anIntArray816[Node_Sub25_Sub3.anInt9987++] = i_2_;
					npc.anInt10880 = Plane.anInt3423;
					Class194_Sub1_Sub1.anIntArray9370[Node_Sub38_Sub6.anInt10132++] = i_2_;
				} else if ((i_4_ ^ 0xffffffff) == -2) {
					Class54.anIntArray816[Node_Sub25_Sub3.anInt9987++] = i_2_;
					npc.anInt10880 = Plane.anInt3423;
					int i_5_ = packet.method2256((byte) -128, 3);
					npc.method876(1, i_5_, (byte) -111);
					int i_6_ = packet.method2256((byte) 82, 1);
					if (i_6_ == 1) {
						Class194_Sub1_Sub1.anIntArray9370[Node_Sub38_Sub6.anInt10132++] = i_2_;
					}
				} else if (i_4_ == 2) {
					Class54.anIntArray816[Node_Sub25_Sub3.anInt9987++] = i_2_;
					npc.anInt10880 = Plane.anInt3423;
					if ((packet.method2256((byte) 81, 1) ^ 0xffffffff) == -2) {
						int i_7_ = packet.method2256((byte) 53, 3);
						npc.method876(2, i_7_, (byte) -123);
						int i_8_ = packet.method2256((byte) 81, 3);
						npc.method876(2, i_8_, (byte) -113);
					} else {
						int i_9_ = packet.method2256((byte) -127, 3);
						npc.method876(0, i_9_, (byte) -126);
					}
					int i_10_ = packet.method2256((byte) -2, 1);
					if ((i_10_ ^ 0xffffffff) == -2) {
						Class194_Sub1_Sub1.anIntArray9370[Node_Sub38_Sub6.anInt10132++] = i_2_;
					}
				} else if ((i_4_ ^ 0xffffffff) == -4) {
					FileOnDisk.anIntArray1322[Class270_Sub2_Sub1.anInt10543++] = i_2_;
				}
			}
		}
	}
	
	Class262_Sub10(Buffer buffer) {
		super(buffer);
		anInt7772 = buffer.method2219(-130546744);
		anInt7771 = buffer.method2219(-130546744);
		anInt7770 = buffer.method2219(-130546744);
		anInt7768 = buffer.method2219(-130546744);
		anInt7769 = buffer.method2219(-130546744);
	}
	
	final void method3148(int i) {
		Class188_Sub1_Sub1.method1895(anInt7772, false, 100, (byte) 21, anInt7771, anInt7770, 100);
		if (i < -102) {
			anInt7767++;
			Node_Sub38_Sub24.method2868(3, 0, anInt7769, anInt7768);
			Class320_Sub18.aBoolean8375 = true;
		}
	}
}
