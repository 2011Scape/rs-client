package com.jagex;

public class Class126
{
	static int anInt1611;
	private int anInt1612;
	static int anInt1613;
	static int anInt1614;
	static int anInt1615;
	static int anInt1616;
	private Class372 aClass372_1617;
	static int anInt1618;
	static int anInt1619;
	static Class126 aClass126_1620 = new Class126(0, 3, Class372.aClass372_4598);
	protected int anInt1621;
	static int anInt1622;
	static int anInt1623;
	protected int anInt1624;
	static Class126 aClass126_1625 = new Class126(1, 3, Class372.aClass372_4598);
	static Class126 aClass126_1626 = new Class126(2, 4, Class372.aClass372_4594);
	static Class126 aClass126_1627 = new Class126(3, 1, Class372.aClass372_4598);
	static Class126 aClass126_1628 = new Class126(4, 2, Class372.aClass372_4598);
	static Class126 aClass126_1629 = new Class126(5, 3, Class372.aClass372_4598);
	static Class126 aClass126_1630 = new Class126(6, 4, Class372.aClass372_4598);
	static int anInt1631 = Node_Sub38_Sub20.method2855(16, (byte) -71);
	static Class318 aClass318_1632 = new Class318(34, 4);
	static Class192 aClass192_1633 = new Class192(34, 6);
	static int anInt1634;
	
	static final void method1532(int i) {
		if (Class93.aGraphicsToolkit1241 != null) {
			if (Class71.aBoolean967) {
				Class94.method1065(113);
			}
			Node_Sub36_Sub3.aClass179_10058.method1815((byte) 74);
			Class320_Sub26.method3777();
			Node_Sub18.method2606(126);
			GameStub.method101(-15332);
			Class262_Sub22.method3206(0);
			CacheNode_Sub4.method2304(-62);
			Class48.method481(0);
			Node_Sub36_Sub2.method2761((byte) 125);
			Class113.method1150((byte) -99);
			Animable_Sub1.method825((byte) -68);
			Class262_Sub23.method3212(false, 1295);
			for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -2049; i_0_++) {
				Player player = Class270_Sub2.aPlayerArray8038[i_0_];
				if (player != null) {
					for (int i_1_ = 0; player.aDrawableModelArray10909.length > i_1_; i_1_++)
						player.aDrawableModelArray10909[i_1_] = null;
				}
			}
			for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (Node_Sub32.anInt7380 ^ 0xffffffff); i_2_++) {
				Npc npc = Class314.aNode_Sub41Array4017[i_2_].aNpc7518;
				if (npc != null) {
					for (int i_3_ = 0; i_3_ < npc.aDrawableModelArray10909.length; i_3_++)
						npc.aDrawableModelArray10909[i_3_] = null;
				}
			}
			Node_Sub5.aClass336_7032 = null;
			Class290_Sub6.aClass336_8114 = null;
			Class93.aGraphicsToolkit1241.method1233(-7751);
			Class93.aGraphicsToolkit1241 = null;
		}
		anInt1623++;
		int i_4_ = 73 / ((16 - i) / 49);
	}
	
	public static void method1533(int i) {
		aClass192_1633 = null;
		aClass126_1629 = null;
		aClass126_1628 = null;
		aClass126_1626 = null;
		if (i == 1) {
			aClass126_1620 = null;
			aClass318_1632 = null;
			aClass126_1627 = null;
			aClass126_1625 = null;
			aClass126_1630 = null;
		}
	}
	
	public final String toString() {
		anInt1615++;
		throw new IllegalStateException();
	}
	
	static final Class126 method1534(int i, int i_5_) {
		anInt1613++;
		if (i_5_ > -103) {
			aClass192_1633 = null;
		}
		int i_6_ = i;
	while_108_:
		do {
		while_107_:
			do {
			while_106_:
				do {
				while_105_:
					do {
					while_104_:
						do {
							do {
								if ((i_6_ ^ 0xffffffff) != -1) {
									if (i_6_ != 1) {
										if ((i_6_ ^ 0xffffffff) != -3) {
											if (i_6_ != 3) {
												if (i_6_ != 4) {
													if (i_6_ != 5) {
														if ((i_6_ ^ 0xffffffff) == -7) {
															break while_107_;
														}
														break while_108_;
													}
												} else {
													break while_105_;
												}
												break while_106_;
											}
										} else {
											break;
										}
										break while_104_;
									}
								} else {
									return aClass126_1620;
								}
								return aClass126_1625;
							} while (false);
							return aClass126_1626;
						} while (false);
						return aClass126_1627;
					} while (false);
					return aClass126_1628;
				} while (false);
				return aClass126_1629;
			} while (false);
			return aClass126_1630;
		} while (false);
		return null;
	}
	
	static final void method1535(int i, int i_7_, int i_8_, int i_9_, int i_10_) {
		anInt1614++;
		CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 8, (long) i_9_);
		cachenode_sub2.method2288(0);
		if (i_8_ < 91) {
			DevConsoleNode.processConsoleCommands(54, false, false, null);
		}
		cachenode_sub2.anInt9432 = i_10_;
		cachenode_sub2.anInt9429 = i_7_;
		cachenode_sub2.anInt9434 = i;
	}
	
	static final int method1536(int i, String string) {
		if (i != -20826) {
			return -51;
		}
		anInt1611++;
		return string.length() - -1;
	}
	
	static final RuntimeException_Sub1 method1537(Throwable throwable, String string) {
		anInt1619++;
		RuntimeException_Sub1 runtimeexception_sub1;
		if (!(throwable instanceof RuntimeException_Sub1)) {
			runtimeexception_sub1 = new RuntimeException_Sub1(throwable, string);
		} else {
			runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
			runtimeexception_sub1.aString4919 += ' ' + (String) string;
		}
		return runtimeexception_sub1;
	}
	
	static final void method1539(boolean bool, String string, byte b) {
		anInt1622++;
		if (string != null) {
			if ((Class235.anInt5122 ^ 0xffffffff) <= -101) {
				Class41.method436(b ^ ~0x7326, Localization.fullIgnoreList.getLocalizationString(-12273, Class35.clientLanguage), 4);
			} else {
				String string_39_ = Node_Sub25_Sub3.method2671(-13472, string);
				if (string_39_ != null) {
					for (int i = 0; Class235.anInt5122 > i; i++) {
						String string_40_ = Node_Sub25_Sub3.method2671(-13472, Class338.aStringArray4197[i]);
						if (string_40_ != null && string_40_.equals(string_39_)) {
							Class41.method436(29459, string + Localization.alreadyOnIgnoreList.getLocalizationString(-12273, Class35.clientLanguage), 4);
							return;
						}
						if (Class7.aStringArray164[i] != null) {
							String string_41_ = Node_Sub25_Sub3.method2671(b + -13418, Class7.aStringArray164[i]);
							if (string_41_ != null && string_41_.equals(string_39_)) {
								Class41.method436(29459, string + Localization.alreadyOnIgnoreList.getLocalizationString(-12273, Class35.clientLanguage), 4);
								return;
							}
						}
					}
					for (int i = 0; (Node_Sub38_Sub14.anInt10242 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
						String string_42_ = Node_Sub25_Sub3.method2671(b ^ 0x34aa, Class262_Sub12.aStringArray7793[i]);
						if (string_42_ != null && string_42_.equals(string_39_)) {
							Class41.method436(29459, Localization.pleaseRemoveFriendPrefix.getLocalizationString(-12273, Class35.clientLanguage) + string + Localization.pleaseRemoveFriendSuffix.getLocalizationString(-12273, Class35.clientLanguage), 4);
							return;
						}
						if (Plane.aStringArray3403[i] != null) {
							String string_43_ = Node_Sub25_Sub3.method2671(-13472, Plane.aStringArray3403[i]);
							if (string_43_ != null && string_43_.equals(string_39_)) {
								Class41.method436(29459, Localization.pleaseRemoveFriendPrefix.getLocalizationString(-12273, Class35.clientLanguage) + string + Localization.pleaseRemoveFriendSuffix.getLocalizationString(-12273, Class35.clientLanguage), 4);
								return;
							}
						}
					}
					if (Node_Sub25_Sub3.method2671(-13472, Class295.aPlayer3692.aString11142).equals(string_39_)) {
						Class41.method436(29459, Localization.cantAddSelfIgnore.getLocalizationString(-12273, Class35.clientLanguage), 4);
					} else {
						Class239.anInt2927++;
						Class123 class123 = Class262_Sub23.method3213((byte) -95);
						Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class320_Sub3.aClass318_8233, class123.anIsaacCipher1571);
						node_sub13.aPacket7113.method2226(method1536(-20826, string) + 1, false);
						if (b != -54) {
							anInt1631 = -43;
						}
						node_sub13.aPacket7113.method2228(string, 103);
						node_sub13.aPacket7113.method2226(!bool ? 0 : 1, false);
						class123.method1514(127, node_sub13);
					}
				}
			}
		}
	}
	
	private Class126(int i, int i_44_, Class372 class372) {
		anInt1612 = i_44_;
		aClass372_1617 = class372;
		anInt1621 = i;
		anInt1624 = anInt1612 * aClass372_1617.anInt4591;
		if ((anInt1621 ^ 0xffffffff) <= -17) {
			throw new RuntimeException();
		}
	}
}
