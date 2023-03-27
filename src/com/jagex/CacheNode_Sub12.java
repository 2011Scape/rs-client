package com.jagex;

public class CacheNode_Sub12 extends CacheNode
{
	static Class192 aClass192_9552;
	static int anInt9553;
	protected Mobile_Sub1 aMobile_Sub1_9554;
	static int anInt9555 = 0;
	static Class61 aClass61_9556;
	static int anInt9557;
	
	static final Class98 method2341(int i, Buffer buffer) {
		anInt9557++;
		String string = buffer.method2195(-1);
		Class379 class379 = Class23.method302(1476280292)[buffer.method2233(255)];
		Class77 class77 = PlayerDefinition.method3277(12247)[buffer.method2233(i ^ 0xfe)];
		int i_0_ = buffer.method2193(-65);
		int i_1_ = buffer.method2193(i ^ ~0x7a);
		int i_2_ = buffer.method2233(i + 254);
		if (i != 1) {
			return null;
		}
		int i_3_ = buffer.method2233(255);
		int i_4_ = buffer.method2233(255);
		int i_5_ = buffer.method2219(-130546744);
		int i_6_ = buffer.method2219(-130546744);
		int i_7_ = buffer.method2186(-53);
		int i_8_ = buffer.method2186(-49);
		int i_9_ = buffer.method2186(118);
		return new Class98(string, class379, class77, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_);
	}
	
	public static void method2342(byte b) {
		aClass61_9556 = null;
		if (b >= -68) {
			method2343(null, (byte) -25, 7, null, -1, -19);
		}
		aClass192_9552 = null;
	}
	
	CacheNode_Sub12(Mobile_Sub1 mobile_sub1) {
		aMobile_Sub1_9554 = mobile_sub1;
	}
	
	static final void method2343(ObjectDefinition objectdefinition, byte b, int i, GraphicsToolkit graphicstoolkit, int i_10_, int i_11_) {
		anInt9553++;
		Class140 class140 = Node_Sub54.aClass338_7671.method3909(objectdefinition.anInt3006, 34);
		if ((class140.anInt1740 ^ 0xffffffff) != 0) {
			if (objectdefinition.aBoolean3056) {
				i += objectdefinition.anInt2958;
				i &= 0x3;
			} else {
				i = 0;
			}
			GLSprite glsprite = class140.method1606(i, graphicstoolkit, objectdefinition.aBoolean3007, 0);
			if (glsprite != null) {
				int i_12_ = objectdefinition.anInt3055;
				int i_13_ = objectdefinition.anInt2986;
				if (b < 79) {
					anInt9555 = 47;
				}
				if ((i & 0x1 ^ 0xffffffff) == -2) {
					i_12_ = objectdefinition.anInt2986;
					i_13_ = objectdefinition.anInt3055;
				}
				int i_14_ = glsprite.method1197();
				int i_15_ = glsprite.method1186();
				if (class140.aBoolean1741) {
					i_15_ = i_13_ * 4;
					i_14_ = i_12_ * 4;
				}
				if (class140.anInt1737 != 0) {
					glsprite.method1199(i_10_, -((i_13_ + -1) * 4) + i_11_, i_14_, i_15_, 0, ~0xffffff | class140.anInt1737, 1);
				} else {
					glsprite.method1200(i_10_, -(4 * i_13_) + 4 + i_11_, i_14_, i_15_);
				}
			}
		}
	}
	
	static {
		aClass192_9552 = new Class192(44, 10);
		aClass61_9556 = new Class61(8);
	}
}
