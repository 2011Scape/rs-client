package com.jagex;

class EntityNode
{
	protected EntityNode anEntityNode1124;
	static int anInt1125;
	protected EntityNode anEntityNode1126;
	static int anInt1127;
	static boolean aBoolean1128 = true;
	
	static final void method802(int i) {
		anInt1125++;
		if (Class240.aSignLink2946.aBoolean4005 && (Class262_Sub23.aClass197_7884.worldId ^ 0xffffffff) != 0) {
			Class188_Sub1_Sub2.method1899(Class262_Sub23.aClass197_7884.worldId, (byte) 27, Class262_Sub23.aClass197_7884.aString2422);
		}
		if (i != 2126) {
			method802(-121);
		}
	}
	
	final void method803(boolean bool) {
		anInt1127++;
		if (anEntityNode1124 != null && bool == false) {
			anEntityNode1124.anEntityNode1126 = anEntityNode1126;
			anEntityNode1126.anEntityNode1124 = anEntityNode1124;
			anEntityNode1126 = null;
			anEntityNode1124 = null;
		}
	}
	
	public EntityNode() {
		/* empty */
	}
}
