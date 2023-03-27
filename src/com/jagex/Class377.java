package com.jagex;

abstract class Class377
{
	static Class318 aClass318_4663;
	static int anInt4664 = 0;
	static int anInt4665;
	static int anInt4666;
	static int anInt4667;
	static int anInt4668;
	static int anInt4669;
	static int anInt4670;
	protected int anInt4671;
	static int anInt4672;
	protected int anInt4673;
	protected int anInt4674;
	static Class379 aClass379_4675;
	
	final boolean method4120(boolean bool) {
		if (bool != true) {
			return true;
		}
		anInt4669++;
		if ((anInt4673 & 0x2 ^ 0xffffffff) == -1) {
			return false;
		}
		return true;
	}
	
	public static void method4121(boolean bool) {
		aClass318_4663 = null;
		aClass379_4675 = null;
		if (bool != false) {
			aClass379_4675 = null;
		}
	}
	
	final boolean method4122(int i) {
		int i_0_ = -28 / ((34 - i) / 61);
		anInt4665++;
		if ((anInt4673 & 0x4) == 0) {
			return false;
		}
		return true;
	}
	
	final boolean method4123(int i) {
		anInt4668++;
		if (i != 27647) {
			return true;
		}
		if ((anInt4673 & 0x1) == 0) {
			return false;
		}
		return true;
	}
	
	static final void method4124(int i, Widget widget, Widget widget_1_) {
		anInt4667++;
		Class3.anInt5162++;
		Node_Sub13 node_sub13 = FloatBuffer.method2250(i + -27933, Class357.aClass318_4441, Class218.worldResponseBuffer.anIsaacCipher1571);
		node_sub13.aPacket7113.method2210(widget_1_.anInt4718, i ^ ~0x6bf7);
		node_sub13.aPacket7113.method2199(widget.anInt4687, -1);
		if (i == 27547) {
			node_sub13.aPacket7113.method2230(widget.anInt4718, 128);
			node_sub13.aPacket7113.method2187(true, widget.anInt4822);
			node_sub13.aPacket7113.method2199(widget_1_.anInt4687, -1);
			node_sub13.aPacket7113.method2184(widget_1_.anInt4822, (byte) -79);
			Class218.worldResponseBuffer.method1514(126, node_sub13);
		}
	}
	
	static final void method4125(int i) {
		anInt4670++;
		for (EntityNode_Sub1 entitynode_sub1 = (EntityNode_Sub1) Class82.aClass103_1120.method1106(68); entitynode_sub1 != null; entitynode_sub1 = (EntityNode_Sub1) Class82.aClass103_1120.method1106(35))
			Class373.method4108(entitynode_sub1, 86);
		int i_2_;
		int i_3_;
		if (Class213.aNode_Sub27_2512.aClass320_Sub19_7301.method3751(false) == 1) {
			i_2_ = 0;
			i_3_ = 3;
		} else {
			i_2_ = i_3_ = Class94.anInt1249;
		}
		if (i >= 94) {
			if ((aa.anInt101 ^ 0xffffffff) == -4) {
				for (int i_4_ = i_2_; i_4_ <= i_3_; i_4_++)
					client.method106(i_4_);
				client.method104();
			} else {
				client.method107();
				for (int i_5_ = i_2_; i_5_ <= i_3_; i_5_++) {
					client.method117();
					client.method122(i_5_);
					client.method106(i_5_);
				}
				client.method116();
				client.method104();
			}
		}
	}
	
	final boolean method4126(boolean bool) {
		if (bool != true) {
			method4123(66);
		}
		anInt4666++;
		if ((0x8 & anInt4673 ^ 0xffffffff) == -1) {
			return false;
		}
		return true;
	}
	
	public Class377() {
		/* empty */
	}
	
	static final boolean method4127(int i, int i_6_, int i_7_) {
		if (i_6_ != -31997) {
			return false;
		}
		anInt4672++;
		return false;
	}
	
	static {
		aClass318_4663 = new Class318(52, 8);
		aClass379_4675 = new Class379();
	}
}
