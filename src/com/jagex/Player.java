package com.jagex;

public class Player extends Actor
{
	static int[][] anIntArrayArray11128;
	protected int anInt11129 = -1;
	protected int anInt11130;
	protected boolean aBoolean11131;
	protected String aString11132;
	static int anInt11133;
	protected int anInt11134;
	protected boolean aBoolean11135;
	static int anInt11136;
	protected PlayerDefinition aPlayerDefinition11137;
	static int anInt11138;
	protected int anInt11139;
	static Node_Sub4 aNode_Sub4_11140 = null;
	protected int anInt11141;
	protected String aString11142;
	static int anInt11143;
	static int anInt11144;
	private byte aByte11145;
	static int anInt11146;
	protected int anInt11147;
	static int anInt11148;
	protected boolean aBoolean11149;
	private byte aByte11150 = 0;
	private int anInt11151;
	protected int anInt11152;
	protected int anInt11153;
	private byte aByte11154;
	static Node_Sub4 aNode_Sub4_11155;
	protected boolean aBoolean11156;
	protected boolean aBoolean11157;
	static int anInt11158;
	static int anInt11159;
	protected int anInt11160;
	static int anInt11161;
	static int anInt11162;
	static int anInt11163;
	protected int anInt11164;
	static int anInt11165;
	static int anInt11166;
	protected int anInt11167;
	static int anInt11168;
	protected boolean aBoolean11169;
	static int anInt11170;
	static int anInt11171;
	protected int anInt11172;
	protected int anInt11173;
	static int anInt11174;
	static int anInt11175;
	static int anInt11176;
	static int anInt11177;
	static int anInt11178;
	static int anInt11179;
	protected int anInt11180;
	static int anInt11181;
	protected int anInt11182;
	static int anInt11183;
	protected int anInt11184;
	
	final void method820(GraphicsToolkit graphicstoolkit, int i) {
		anInt11158++;
		if (aPlayerDefinition11137 != null && (aBoolean10906 || method890(0, -119, graphicstoolkit))) {
			Class336 class336 = graphicstoolkit.A();
			class336.method3860(aClass99_10893.method1086(i ^ ~0x3ffb));
			class336.method3863(anInt5934, i + anInt5937, anInt5940);
			this.method870(graphicstoolkit, (byte) 45, aBoolean10906, aDrawableModelArray10909, class336);
			for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > (aDrawableModelArray10909.length ^ 0xffffffff); i_0_++)
				aDrawableModelArray10909[i_0_] = null;
		}
	}
	
	final void method882(int i, int i_1_, String string, byte b) {
		this.method864(Node_Sub15_Sub10.method2578((byte) 124) * CacheNode_Sub4.aClass1_9466.anInt118, string, false, i_1_, i);
		anInt11183++;
		int i_2_ = -10 / ((b - -4) / 49);
	}
	
	private final void method883(byte b, int i, int i_3_, int i_4_, DrawableModel drawablemodel, Class336 class336, GraphicsToolkit graphicstoolkit, int i_5_) {
		anInt11159++;
		if (b != -74) {
			method820(null, 41);
		}
		int i_6_ = i_5_ * i_5_ + i * i;
		if ((i_6_ ^ 0xffffffff) <= -262145 && (i_6_ ^ 0xffffffff) >= (i_3_ ^ 0xffffffff)) {
			int i_7_ = (int) (2607.5945876176133 * Math.atan2((double) i, (double) i_5_) - (double) aClass99_10893.method1086(16383)) & 0x3fff;
			DrawableModel drawablemodel_8_ = Node_Sub53.method2978(anInt10872, anInt10862, 76, i_4_, anInt10832, i_7_, graphicstoolkit);
			if (drawablemodel_8_ != null) {
				graphicstoolkit.C(false);
				drawablemodel_8_.method611(class336, null, 0);
				graphicstoolkit.C(true);
			}
		}
	}
	
	public static void method884(int i) {
		anIntArrayArray11128 = null;
		if (i != 16053) {
			method892(-8, -121);
		}
		aNode_Sub4_11155 = null;
		aNode_Sub4_11140 = null;
	}
	
	final Class171 method809(GraphicsToolkit graphicstoolkit, int i) {
		anInt11163++;
		if (i > -93) {
			method893(true, true);
		}
		return null;
	}
	
	final boolean method810(int i, int i_9_, boolean bool, GraphicsToolkit graphicstoolkit) {
		anInt11170++;
		if (aPlayerDefinition11137 == null || !method890(131072, -113, graphicstoolkit)) {
			return false;
		}
		Class336 class336 = graphicstoolkit.A();
		int i_10_ = aClass99_10893.method1086(16383);
		class336.method3860(i_10_);
		class336.method3863(anInt5934, anInt5937, anInt5940);
		boolean bool_11_ = bool;
		for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > (aDrawableModelArray10909.length ^ 0xffffffff); i_12_++) {
			if (aDrawableModelArray10909[i_12_] != null && (!Node_Sub15_Sub10.aBoolean9850 ? aDrawableModelArray10909[i_12_].method624(i_9_, i, class336, true, 0) : aDrawableModelArray10909[i_12_].method621(i_9_, i, class336, true, 0, Class308.anInt3912))) {
				bool_11_ = true;
				break;
			}
		}
		for (int i_13_ = 0; i_13_ < aDrawableModelArray10909.length; i_13_++)
			aDrawableModelArray10909[i_13_] = null;
		return bool_11_;
	}
	
	final boolean method821(int i) {
		anInt11177++;
		if (i != 0) {
			method883((byte) 124, 20, -110, 30, null, null, null, 15);
		}
		return false;
	}
	
	final int method855(byte b) {
		anInt11161++;
		if (b > -48) {
			method869(-126);
		}
		return -1;
	}
	
	final void method816(int i, boolean bool, GraphicsToolkit graphicstoolkit, int i_14_, byte b, int i_15_, Animable animable) {
		if (b >= 101) {
			anInt11133++;
			throw new IllegalStateException();
		}
	}
	
	final int method871(int i) {
		anInt11162++;
		if (i != 0) {
			anInt11152 = -112;
		}
		return anInt11151;
	}
	
	private final void method885(DrawableModel drawablemodel, int i, byte b, GraphicsToolkit graphicstoolkit, int i_16_, int i_17_, Class336 class336, int i_18_, int i_19_) {
		anInt11174++;
		int i_20_ = i_17_ * i_17_ - -(i_19_ * i_19_);
		if ((i_20_ ^ 0xffffffff) <= -262145 && (i_20_ ^ 0xffffffff) >= (i ^ 0xffffffff)) {
			if (b > -15) {
				anInt11172 = -60;
			}
			int i_21_ = (int) (Math.atan2((double) i_17_, (double) i_19_) * 2607.5945876176133 - (double) aClass99_10893.method1086(16383)) & 0x3fff;
			DrawableModel drawablemodel_22_ = Node_Sub53.method2978(anInt10872, anInt10862, 104, i_16_, anInt10832, i_21_, graphicstoolkit);
			if (drawablemodel_22_ != null) {
				graphicstoolkit.C(false);
				drawablemodel_22_.method622(class336, null, i_18_, 0);
				graphicstoolkit.C(true);
			}
		}
	}
	
	final boolean method886(byte b) {
		int i = -95 / ((b - 1) / 43);
		anInt11165++;
		if (aPlayerDefinition11137 == null) {
			return false;
		}
		return true;
	}
	
	final void method887(int i, int i_23_, int i_24_, byte b) {
		if (anInt10904 < anIntArray10910.length - 1) {
			anInt10904++;
		}
		anInt11138++;
		for (int i_25_ = anInt10904; i_25_ > 0; i_25_--) {
			anIntArray10910[i_25_] = anIntArray10910[-1 + i_25_];
			anIntArray10908[i_25_] = anIntArray10908[-1 + i_25_];
			aByteArray10905[i_25_] = aByteArray10905[i_25_ - 1];
		}
		anIntArray10910[0] = i_24_;
		aByteArray10905[0] = b;
		if (i != -24527) {
			method855((byte) -13);
		}
		anIntArray10908[0] = i_23_;
	}
	
	final int method853(byte b) {
		anInt11146++;
		if (aPlayerDefinition11137 != null && (aPlayerDefinition11137.anInt3439 ^ 0xffffffff) != 0) {
			return Class366.aClass279_4526.method3376(aPlayerDefinition11137.anInt3439, (byte) 107).anInt2811;
		}
		if (b < 43) {
			anInt11173 = 1;
		}
		return super.method853((byte) 76);
	}
	
	final void method888(int i, int i_26_, int i_27_) {
		anInt10904 = 0;
		anIntArray10910[0] = i;
		anInt11176++;
		anInt10901 = 0;
		anInt10900 = 0;
		anIntArray10908[0] = i_27_;
		int i_28_ = method853((byte) 84);
		if (i_26_ < -69) {
			anInt5934 = i_28_ * 256 + 512 * anIntArray10910[0];
			anInt5940 = 512 * anIntArray10908[0] - -(i_28_ * 256);
			if (Class295.aPlayer3692 == this) {
				Class120.method1228(-125);
			}
			if (anEntityNode_Sub4_10902 != null) {
				anEntityNode_Sub4_10902.method965();
			}
		}
	}
	
	final void method811(int i) {
		if (i != 27811) {
			aBoolean11156 = true;
		}
		anInt11168++;
		throw new IllegalStateException();
	}
	
	final EntityNode_Sub6 method807(int i, GraphicsToolkit graphicstoolkit) {
		anInt11171++;
		if (aPlayerDefinition11137 == null || !method890(2048, -112, graphicstoolkit)) {
			return null;
		}
		Class336 class336 = graphicstoolkit.A();
		int i_29_ = aClass99_10893.method1086(16383);
		class336.method3860(i_29_);
		int i_30_ = -33 % ((-22 - i) / 61);
		Class261 class261 = Class175.aClass261ArrayArrayArray2099[aByte5933][anInt5934 >> Class36.anInt549][anInt5940 >> Class36.anInt549];
		if (class261 != null && class261.anAnimable_Sub1_3317 != null) {
			int i_31_ = anInt10849 + -class261.anAnimable_Sub1_3317.aShort9102;
			anInt10849 -= (float) i_31_ / 10.0F;
		} else {
			anInt10849 -= (float) anInt10849 / 10.0F;
		}
		class336.method3863(anInt5934, -anInt10849 + anInt5937 + -20, anInt5940);
		aBoolean10903 = false;
		EntityNode_Sub6 entitynode_sub6 = null;
		if ((Class213.aNode_Sub27_2512.aClass320_Sub7_7308.method3708(false) ^ 0xffffffff) == -2) {
			Class259 class259 = this.method868((byte) -126);
			if (class259.aBoolean3267 && (aPlayerDefinition11137.anInt3439 == -1 || Class366.aClass279_4526.method3376(aPlayerDefinition11137.anInt3439, (byte) 107).aBoolean2875)) {
				Animator animator = !anAnimator10876.method245(-125) || !anAnimator10876.method242((byte) -77) ? null : anAnimator10876;
				Animator animator_32_ = anAnimator10860.method245(-128) && (!aBoolean10867 || animator == null) ? anAnimator10860 : null;
				DrawableModel drawablemodel = CacheNode_Sub14_Sub2.method2356(240, aDrawableModelArray10909[0], anInt10862, 0, anInt10832, 1, true, graphicstoolkit, 160, animator_32_ != null ? animator_32_ : animator, anInt10872, i_29_, 0);
				if (drawablemodel != null) {
					entitynode_sub6 = Class345.method3972(true, (byte) 72, aDrawableModelArray10909.length + 1);
					aBoolean10903 = true;
					graphicstoolkit.C(false);
					if (Node_Sub15_Sub10.aBoolean9850) {
						drawablemodel.method622(class336, entitynode_sub6.anEntityNode_Sub5Array5995[aDrawableModelArray10909.length], Class308.anInt3912, 0);
					} else {
						drawablemodel.method611(class336, entitynode_sub6.anEntityNode_Sub5Array5995[aDrawableModelArray10909.length], 0);
					}
					graphicstoolkit.C(true);
				}
			}
		}
		if (Class295.aPlayer3692 == this) {
			for (int i_33_ = Class320_Sub24.aClass223Array8438.length + -1; (i_33_ ^ 0xffffffff) <= -1; i_33_--) {
				Class223 class223 = Class320_Sub24.aClass223Array8438[i_33_];
				if (class223 != null && (class223.anInt2666 ^ 0xffffffff) != 0) {
					if (class223.anInt2654 == 1) {
						Node_Sub41 node_sub41 = (Node_Sub41) Class12.aHashTable187.method1518(3512, (long) class223.anInt2658);
						if (node_sub41 != null) {
							Npc npc = node_sub41.aNpc7518;
							int i_34_ = -Class295.aPlayer3692.anInt5934 + npc.anInt5934;
							int i_35_ = npc.anInt5940 - Class295.aPlayer3692.anInt5940;
							if (Node_Sub15_Sub10.aBoolean9850) {
								method885(aDrawableModelArray10909[0], 92160000, (byte) -57, graphicstoolkit, class223.anInt2666, i_34_, class336, Class308.anInt3912, i_35_);
							} else {
								method883((byte) -74, i_34_, 92160000, class223.anInt2666, aDrawableModelArray10909[0], class336, graphicstoolkit, i_35_);
							}
						}
					}
					if (class223.anInt2654 == 2) {
						int i_36_ = -Class295.aPlayer3692.anInt5934 + class223.anInt2662;
						int i_37_ = -Class295.aPlayer3692.anInt5940 + class223.anInt2653;
						int i_38_ = class223.anInt2655 << 9;
						i_38_ *= i_38_;
						if (!Node_Sub15_Sub10.aBoolean9850) {
							method883((byte) -74, i_36_, i_38_, class223.anInt2666, aDrawableModelArray10909[0], class336, graphicstoolkit, i_37_);
						} else {
							method885(aDrawableModelArray10909[0], i_38_, (byte) -36, graphicstoolkit, class223.anInt2666, i_36_, class336, Class308.anInt3912, i_37_);
						}
					}
					if (class223.anInt2654 == 10 && class223.anInt2658 >= 0 && class223.anInt2658 < Class270_Sub2.aPlayerArray8038.length) {
						Player player_39_ = Class270_Sub2.aPlayerArray8038[class223.anInt2658];
						if (player_39_ != null) {
							int i_40_ = player_39_.anInt5934 - Class295.aPlayer3692.anInt5934;
							int i_41_ = -Class295.aPlayer3692.anInt5940 + player_39_.anInt5940;
							if (Node_Sub15_Sub10.aBoolean9850) {
								method885(aDrawableModelArray10909[0], 92160000, (byte) -23, graphicstoolkit, class223.anInt2666, i_40_, class336, Class308.anInt3912, i_41_);
							} else {
								method883((byte) -74, i_40_, 92160000, class223.anInt2666, aDrawableModelArray10909[0], class336, graphicstoolkit, i_41_);
							}
						}
					}
				}
			}
			class336.method3860(i_29_);
			class336.method3863(anInt5934, anInt5937, anInt5940);
		}
		class336.method3860(i_29_);
		class336.method3863(anInt5934, -anInt10849 + anInt5937 - 5, anInt5940);
		if (entitynode_sub6 == null) {
			entitynode_sub6 = Class345.method3972(true, (byte) 103, aDrawableModelArray10909.length);
		}
		this.method870(graphicstoolkit, (byte) 45, false, aDrawableModelArray10909, class336);
		if (Node_Sub15_Sub10.aBoolean9850) {
			for (int i_42_ = 0; i_42_ < aDrawableModelArray10909.length; i_42_++) {
				if (aDrawableModelArray10909[i_42_] != null) {
					aDrawableModelArray10909[i_42_].method622(class336, entitynode_sub6.anEntityNode_Sub5Array5995[i_42_], Class308.anInt3912, this == Class295.aPlayer3692 ? 1 : 0);
				}
			}
		} else {
			for (int i_43_ = 0; i_43_ < aDrawableModelArray10909.length; i_43_++) {
				if (aDrawableModelArray10909[i_43_] != null) {
					aDrawableModelArray10909[i_43_].method611(class336, entitynode_sub6.anEntityNode_Sub5Array5995[i_43_], Class295.aPlayer3692 == this ? 1 : 0);
				}
			}
		}
		if (anEntityNode_Sub4_10902 != null) {
			Class198 class198 = anEntityNode_Sub4_10902.method954();
			if (Node_Sub15_Sub10.aBoolean9850) {
				graphicstoolkit.a(class198, Class308.anInt3912);
			} else {
				graphicstoolkit.a(class198);
			}
		}
		for (int i_44_ = 0; (i_44_ ^ 0xffffffff) > (aDrawableModelArray10909.length ^ 0xffffffff); i_44_++) {
			if (aDrawableModelArray10909[i_44_] != null) {
				aBoolean10903 |= aDrawableModelArray10909[i_44_].F();
			}
			aDrawableModelArray10909[i_44_] = null;
		}
		anInt10815 = Class110.anInt1412;
		return entitynode_sub6;
	}
	
	final void method889(Buffer buffer, int i) {
		buffer.anInt7002 = 0;
		anInt11181++;
		int i_45_ = buffer.method2233(255);
		aByte11150 = (byte) (0x1 & i_45_);
		boolean bool = aBoolean11149;
		aBoolean11149 = (0x2 & i_45_) != 0;
		boolean bool_46_ = (i_45_ & 0x4) != 0;
		int i_47_ = super.method853((byte) 85);
		this.method861(-1000, 1 + (0x7 & i_45_ >> 3));
		aByte11145 = (byte) ((0xf2 & i_45_) >> 6);
		anInt5934 += -i_47_ + method853((byte) 44) << 8;
		anInt5940 += -i_47_ + method853((byte) 111) << 8;
		aByte11154 = buffer.method2214((byte) -78);
		anInt11129 = buffer.method2214((byte) 96);
		anInt11130 = buffer.method2214((byte) -81);
		aBoolean11131 = (buffer.method2214((byte) 32) ^ 0xffffffff) == -2;
		if (Class240.aClass329_2943 == Node_Sub38_Sub1.aClass329_10086 && Class339_Sub7.anInt8729 >= 2) {
			aBoolean11131 = false;
		}
		anInt11134 = 0;
		int i_48_ = -1;
		int[] is = new int[Class63.aClass363_922.anIntArray4508.length];
		Class38[] class38s = new Class38[Class63.aClass363_922.anIntArray4508.length];
		ItemDefinition[] itemdefinitions = new ItemDefinition[Class63.aClass363_922.anIntArray4508.length];
		for (int i_49_ = 0; Class63.aClass363_922.anIntArray4508.length > i_49_; i_49_++) {
			if (Class63.aClass363_922.anIntArray4508[i_49_] != 1) {
				int i_50_ = buffer.method2233(255);
				if ((i_50_ ^ 0xffffffff) == -1) {
					is[i_49_] = 0;
				} else {
					int i_51_ = buffer.method2233(i + 255);
					int i_52_ = (i_50_ << 8) - -i_51_;
					if (i_49_ == 0 && i_52_ == 65535) {
						i_48_ = buffer.method2219(-130546744);
						anInt11134 = buffer.method2233(i ^ 0xff);
						break;
					}
					if (i_52_ >= 32768) {
						i_52_ = Node_Sub28.anIntArray7329[-32768 + i_52_];
						is[i_49_] = Node_Sub16.method2590(1073741824, i_52_);
						itemdefinitions[i_49_] = EntityNode_Sub3_Sub1.aClass86_9166.method1010(i_52_, 14434);
						int i_53_ = itemdefinitions[i_49_].anInt1899;
						if ((i_53_ ^ 0xffffffff) != -1) {
							anInt11134 = i_53_;
						}
					} else {
						is[i_49_] = Node_Sub16.method2590(i_52_ + -256, -2147483648);
					}
				}
			}
		}
		if ((i_48_ ^ 0xffffffff) == 0) {
			int i_54_ = buffer.method2219(-130546744);
			int i_55_ = 0;
			for (int i_56_ = 0; (Class63.aClass363_922.anIntArray4508.length ^ 0xffffffff) < (i_56_ ^ 0xffffffff); i_56_++) {
				if ((Class63.aClass363_922.anIntArray4508[i_56_] ^ 0xffffffff) == -1) {
					if ((i_54_ & 1 << i_55_ ^ 0xffffffff) != -1) {
						class38s[i_56_] = Node_Sub38_Sub27.method2882(buffer, itemdefinitions[i_56_], 0);
					}
					i_55_++;
				}
			}
		}
		int[] is_57_ = new int[10];
		for (int i_58_ = i; (i_58_ ^ 0xffffffff) > -11; i_58_++) {
			int i_59_ = buffer.method2233(255);
			if ((i_58_ ^ 0xffffffff) <= (Class117_Sub2.aShortArrayArrayArray5151.length ^ 0xffffffff) || i_59_ < 0 || (Class117_Sub2.aShortArrayArrayArray5151[i_58_][0].length ^ 0xffffffff) >= (i_59_ ^ 0xffffffff)) {
				i_59_ = 0;
			}
			is_57_[i_58_] = i_59_;
		}
		anInt11151 = buffer.method2219(-130546744);
		aString11132 = buffer.method2195(-1);
		if (this == Class295.aPlayer3692) {
			Node_Sub40.aString7513 = aString11132;
		}
		aString11142 = aString11132;
		anInt11152 = buffer.method2233(255);
		if (!bool_46_) {
			anInt11139 = 0;
			anInt11141 = buffer.method2233(i + 255);
			anInt11184 = buffer.method2233(255);
			if (anInt11184 == 255) {
				anInt11184 = -1;
			}
		} else {
			anInt11139 = buffer.method2219(-130546744);
			anInt11141 = anInt11152;
			if (anInt11139 == 65535) {
				anInt11139 = -1;
			}
			anInt11184 = -1;
		}
		int i_60_ = anInt11164;
		anInt11164 = buffer.method2233(255);
		if ((anInt11164 ^ 0xffffffff) == -1) {
			Class45.method462((byte) 69, this);
		} else {
			int i_61_ = anInt11167;
			int i_62_ = anInt11172;
			int i_63_ = anInt11153;
			int i_64_ = anInt11182;
			int i_65_ = anInt11173;
			anInt11167 = buffer.method2219(-130546744);
			anInt11172 = buffer.method2219(i ^ ~0x7c7fc37);
			anInt11153 = buffer.method2219(-130546744);
			anInt11182 = buffer.method2219(-130546744);
			anInt11173 = buffer.method2233(255);
			if (aBoolean11149 == !bool || (anInt11164 ^ 0xffffffff) != (i_60_ ^ 0xffffffff) || i_61_ != anInt11167 || (i_62_ ^ 0xffffffff) != (anInt11172 ^ 0xffffffff) || anInt11153 != i_63_ || (anInt11182 ^ 0xffffffff) != (i_64_ ^ 0xffffffff) || i_65_ != anInt11173) {
				Class135.method1587(113, this);
			}
		}
		if (aPlayerDefinition11137 == null) {
			aPlayerDefinition11137 = new PlayerDefinition();
		}
		int i_66_ = aPlayerDefinition11137.anInt3439;
		int[] is_67_ = aPlayerDefinition11137.anIntArray3430;
		aPlayerDefinition11137.method3278(is_57_, is, class38s, i_48_, method871(0), (aByte11150 ^ 0xffffffff) == -2, (byte) -110);
		if (i_48_ != i_66_) {
			anInt5934 = (anIntArray10910[0] << 9) - -(method853((byte) 83) << 8);
			anInt5940 = (anIntArray10908[0] << 9) + (method853((byte) 45) << 8);
		}
		if (Class166.anInt5099 == anInt10858 && is_67_ != null) {
			for (int i_68_ = 0; i_68_ < is_57_.length; i_68_++) {
				if (is_57_[i_68_] != is_67_[i_68_]) {
					EntityNode_Sub3_Sub1.aClass86_9166.method1008(50);
					break;
				}
			}
		}
		if (anEntityNode_Sub4_10902 != null) {
			anEntityNode_Sub4_10902.method965();
		}
		if (anAnimator10860.method245(-128) && aBoolean10867) {
			Class259 class259 = this.method868((byte) -123);
			if (!class259.method3130(anAnimator10860.method250((byte) -60), (byte) -127)) {
				anAnimator10860.method249(true, -1);
				aBoolean10867 = false;
			}
		}
	}
	
	private final boolean method890(int i, int i_69_, GraphicsToolkit graphicstoolkit) {
		anInt11144++;
		int i_70_ = i;
		if (i_69_ >= -110) {
			return true;
		}
		Class259 class259 = this.method868((byte) -128);
		Animator animator = !anAnimator10876.method245(-125) || anAnimator10876.method242((byte) -77) ? null : anAnimator10876;
		Animator animator_71_ = anAnimator10860.method245(-127) && !aBoolean11169 && (!aBoolean10867 || animator == null) ? anAnimator10860 : null;
		int i_72_ = class259.anInt3261;
		int i_73_ = class259.anInt3266;
		if ((i_72_ ^ 0xffffffff) != -1 || i_73_ != 0 || class259.anInt3250 != 0 || (class259.anInt3285 ^ 0xffffffff) != -1) {
			i |= 0x7;
		}
		int i_74_ = aClass99_10893.method1086(16383);
		boolean bool = aByte10888 != 0 && (Class174.anInt2092 ^ 0xffffffff) <= (anInt10895 ^ 0xffffffff) && Class174.anInt2092 < anInt10882;
		if (bool) {
			i |= 0x80000;
		}
		DrawableModel drawablemodel = aDrawableModelArray10909[0] = aPlayerDefinition11137.method3279(EntityNode_Sub3_Sub1.aClass86_9166, animator, 77, true, InputStream_Sub2.aClass281_83, Class18.aClass37_306, i, anIntArray10881, Class63.aClass363_922, Class42.aClass181_643, graphicstoolkit, Class366.aClass279_4526, anAnimableAnimator_Sub1Array10894, i_74_, animator_71_, Class24.aClass275_442);
		int i_75_ = Class290_Sub5.method3435(-85);
		if ((Class201.anInt2446 ^ 0xffffffff) > -97 && i_75_ > 50) {
			Class189.method1934((byte) 17);
		}
		if (Class240.aClass329_2943 != Node_Sub38_Sub1.aClass329_10086 && i_75_ < 50) {
			int i_76_;
			for (i_76_ = 50 - i_75_; (Class57.anInt849 ^ 0xffffffff) > (i_76_ ^ 0xffffffff); Class57.anInt849++)
				Class93.aByteArrayArray1244[Class57.anInt849] = new byte[102400];
			while (i_76_ < Class57.anInt849) {
				Class57.anInt849--;
				Class93.aByteArrayArray1244[Class57.anInt849] = null;
			}
		} else if (Class240.aClass329_2943 != Node_Sub38_Sub1.aClass329_10086) {
			Class57.anInt849 = 0;
			Class93.aByteArrayArray1244 = new byte[50][];
		}
		if (drawablemodel == null) {
			return false;
		}
		anInt10875 = drawablemodel.fa();
		anInt10844 = drawablemodel.ma();
		this.method857(drawablemodel, false);
		if ((i_72_ ^ 0xffffffff) == -1 && (i_73_ ^ 0xffffffff) == -1) {
			this.method865(i_74_, 0, 0, method853((byte) 59) << 9, method853((byte) 126) << 9, -81);
		} else {
			this.method865(i_74_, class259.anInt3263, class259.anInt3291, i_72_, i_73_, -104);
			if (anInt10872 != 0) {
				drawablemodel.FA(anInt10872);
			}
			if (anInt10862 != 0) {
				drawablemodel.VA(anInt10862);
			}
			if (anInt10832 != 0) {
				drawablemodel.H(0, anInt10832, 0);
			}
		}
		if (bool) {
			drawablemodel.method626(aByte10896, aByte10878, aByte10884, 0xff & aByte10888);
		}
		if (!aBoolean11169) {
			this.method848(i_70_, i_73_, graphicstoolkit, class259, i_74_, i_72_, -105);
		}
		return true;
	}
	
	final boolean method862(byte b) {
		anInt11175++;
		if (b != -93) {
			anInt11172 = -110;
		}
		return CacheNode_Sub4.aClass1_9466.aBoolean111;
	}
	
	final String method891(boolean bool, int i) {
		if (i != 1) {
			return null;
		}
		anInt11179++;
		if (!bool) {
			return aString11142;
		}
		return aString11132;
	}
	
	static final void method892(int i, int i_77_) {
		int i_78_ = 4 / ((i_77_ - 56) / 49);
		anInt11166++;
		CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 5, (long) i);
		cachenode_sub2.method2291((byte) 121);
	}
	
	Player(int i) {
		super(i);
		aBoolean11131 = false;
		aByte11154 = (byte) 0;
		anInt11134 = 0;
		aBoolean11135 = false;
		anInt11130 = -1;
		aBoolean11149 = false;
		anInt11141 = 0;
		anInt11139 = 0;
		anInt11164 = 0;
		aBoolean11156 = false;
		anInt11167 = -1;
		aBoolean11169 = false;
		anInt11152 = 0;
		aBoolean11157 = false;
		aByte11145 = (byte) 0;
		anInt11172 = -1;
		anInt11173 = 255;
		anInt11153 = -1;
		anInt11182 = -1;
		anInt11180 = -1;
		anInt11184 = -1;
	}
	
	public Player() {
		aBoolean11131 = false;
		aByte11154 = (byte) 0;
		anInt11134 = 0;
		aBoolean11135 = false;
		anInt11130 = -1;
		aBoolean11149 = false;
		anInt11141 = 0;
		anInt11139 = 0;
		anInt11164 = 0;
		aBoolean11156 = false;
		anInt11167 = -1;
		aBoolean11169 = false;
		anInt11152 = 0;
		aBoolean11157 = false;
		aByte11145 = (byte) 0;
		anInt11172 = -1;
		anInt11173 = 255;
		anInt11153 = -1;
		anInt11182 = -1;
		anInt11180 = -1;
		anInt11184 = -1;
	}
	
	final String method893(boolean bool, boolean bool_79_) {
		anInt11136++;
		String string = "";
		if (CacheNode_Sub19.aStringArray9622 != null) {
			string += CacheNode_Sub19.aStringArray9622[aByte11145];
		}
		if (bool != false) {
			method821(106);
		}
		int[] is;
		if ((aByte11150 ^ 0xffffffff) == -2 && Class83.anIntArray5188 != null) {
			is = Class83.anIntArray5188;
		} else {
			is = InputStream_Sub1.anIntArray77;
		}
		if (is != null && (is[aByte11145] ^ 0xffffffff) != 0) {
			Class39 class39 = Class328.aClass362_4112.method4051(is[aByte11145], -752);
			if (class39.aChar587 == 's') {
				string += class39.method412(-3470, aByte11154 & 0xff);
			} else {
				ClanChat.method507(new Throwable(), "gdn1", -125);
				is[aByte11145] = -1;
			}
		}
		if (!bool_79_) {
			string += aString11142;
		} else {
			string += aString11132;
		}
		if (Class320_Sub15.aStringArray8354 != null) {
			string += Class320_Sub15.aStringArray8354[aByte11145];
		}
		return string;
	}
	
	final Class59 method869(int i) {
		if (i != -3109) {
			aBoolean11157 = false;
		}
		anInt11148++;
		if (aClass59_10861 != null) {
			if (aClass59_10861.aString877 == null) {
				return null;
			}
			if ((Class69.anInt943 ^ 0xffffffff) == -1 || (Class69.anInt943 ^ 0xffffffff) == -4 || Class69.anInt943 == 1 && Class193.method1955(i + 3109, aString11142)) {
				return aClass59_10861;
			}
		}
		return null;
	}
	
	final void method894(int i, int i_80_, int i_81_, byte b) {
		if (anAnimator10876.method245(-126) && (anAnimator10876.method243((byte) -24).anInt718 ^ 0xffffffff) == -2) {
			anIntArray10817 = null;
			anAnimator10876.method249(true, -1);
		}
		anInt11143++;
		for (int i_82_ = 0; (i_82_ ^ 0xffffffff) > (aClass165Array10886.length ^ 0xffffffff); i_82_++) {
			if ((aClass165Array10886[i_82_].anInt2030 ^ 0xffffffff) != 0) {
				Class195 class195 = Class16.aClass101_228.method1090(i_81_ ^ ~0x24c3, aClass165Array10886[i_82_].anInt2030);
				if (class195.aBoolean2402 && (class195.anInt2394 ^ 0xffffffff) != 0 && Class18.aClass37_306.method395(class195.anInt2394, (byte) -107).anInt718 == 1) {
					aClass165Array10886[i_82_].anAnimator2026.method249(true, -1);
					aClass165Array10886[i_82_].anInt2030 = -1;
				}
			}
		}
		if (i_81_ != -9380) {
			method853((byte) -74);
		}
		anInt11180 = -1;
		if (i_80_ >= 0 && (Node_Sub54.anInt7675 ^ 0xffffffff) < (i_80_ ^ 0xffffffff) && (i ^ 0xffffffff) <= -1 && (Class377_Sub1.anInt8774 ^ 0xffffffff) < (i ^ 0xffffffff)) {
			if ((anIntArray10910[0] ^ 0xffffffff) > -1 || (anIntArray10910[0] ^ 0xffffffff) <= (Node_Sub54.anInt7675 ^ 0xffffffff) || anIntArray10908[0] < 0 || (Class377_Sub1.anInt8774 ^ 0xffffffff) >= (anIntArray10908[0] ^ 0xffffffff)) {
				method888(i_80_, -97, i);
			} else {
				if ((b ^ 0xffffffff) == -3) {
					Class191.method1946(this, i_80_, true, (byte) 2, i);
				}
				method887(-24527, i, i_80_, b);
			}
		} else {
			method888(i_80_, -117, i);
		}
	}
}
