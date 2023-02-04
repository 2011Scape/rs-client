package com.jagex.runescape;

public class ItemDefinition
{
	static int anInt1848;
	protected int anInt1849;
	private short[] textureFind;
	protected int anInt1851 = -1;
	protected int anInt1852;
	protected int maleModel0;
	static int anInt1854;
	static int anInt1855;
	private short[] colorFind;
	protected int notedTemplate;
	static int anInt1858;
	protected int anInt1859;
	protected String name;
	static int anInt1861;
	protected int anInt1862;
	protected int femaleHeadModel;
	protected int anInt1864;
	protected short[] colorReplace;
	protected int zan2d;
	protected int maleModel2;
	protected Class86 aClass86_1868;
	protected int yan2d;
	static int anInt1870;
	protected boolean members;
	protected int[] countCo;
	protected HashTable aHashTable1873;
	protected int zoom2d;
	protected int yOffset2d;
	private int anInt1876;
	protected int anInt1877;
	protected int maleModel1;
	protected int unknownValueOp18;
	protected int femaleModel0;
	static int anInt1881;
	private byte[] aByteArray1882;
	protected int femaleModel1;
	protected int xan2d;
	static int anInt1885;
	private int anInt1886;
	protected int notedID;
	protected int maleHeadModel2;
	protected int anInt1889;
	private int anInt1890;
	protected int anInt1891;
	protected int stackable;
	private int anInt1893;
	static int anInt1894;
	private int anInt1895;
	private int anInt1896;
	protected int femaleHeadModel2;
	private int inventoryModel;
	protected int anInt1899;
	protected int anInt1900;
	protected String[] interfaceOptions;
	static int anInt1902;
	static int anInt1903;
	private int anInt1904;
	protected int xOffset2d;
	static int anInt1906;
	static int anInt1907;
	protected int anInt1908;
	protected short[] textureReplace;
	static int anInt1910;
	private int anInt1911;
	static int anInt1912;
	protected int maleHeadModel;
	protected int anInt1914;
	protected int femaleModel2;
	private int anInt1916;
	static int anInt1917;
	protected int[] countObj;
	protected int anInt1919;
	protected String[] options;
	static int anInt1921;
	static int anInt1923;
	protected int cost;
	static Node_Sub43 aNode_Sub43_1925;
	protected int[] anIntArray1926;
	protected int anInt1927;
	protected int anInt1928;
	static int anInt1929;
	private int anInt1930;
	private int anInt1931;
	static int anInt1932;
	protected boolean isTradeable;
	
	static final void method1673(int i, int i_0_) {
		anInt1855++;
		if (Class151.anInt1843 == 7 && (Node_Sub38_Sub8.anInt10163 == 0 && Class4.anInt124 == 0)) {
			Node_Sub38_Sub23.anInt10347 = i;
			if (i_0_ != 2) {
				method1690((byte) 19);
			}
			Class48.method478(9, (byte) 113);
		}
	}
	
	final ItemDefinition method1674(int i) {
		anInt1902++;
		if (countObj != null && i > 1) {
			int i_2_ = -1;
			for (int i_3_ = 0; i_3_ < 10; i_3_++) {
				if (i >= countCo[i_3_] && countCo[i_3_] != 0) {
					i_2_ = countObj[i_3_];
				}
			}
			if (i_2_ != -1) {
				return aClass86_1868.method1010(i_2_, 14434);
			}
		}
		return this;
	}
	
	final void method1675(Buffer buffer, byte b) {
		int i = 111 % ((-29 - b) / 57);
		anInt1861++;
		for (;;) {
			int i_4_ = buffer.readUnsignedByte();
			if (i_4_ == 0) {
				break;
			}
			decodeValues(buffer, i_4_);
		}
	}
	
	final void method1676(byte b, ItemDefinition itemdefinition_5_, ItemDefinition itemdefinition_6_) {
		colorReplace = itemdefinition_5_.colorReplace;
		maleHeadModel = itemdefinition_5_.maleHeadModel;
		maleHeadModel2 = itemdefinition_5_.maleHeadModel2;
		maleModel2 = itemdefinition_5_.maleModel2;
		anInt1899 = itemdefinition_5_.anInt1899;
		aHashTable1873 = itemdefinition_5_.aHashTable1873;
		members = itemdefinition_5_.members;
		textureReplace = itemdefinition_5_.textureReplace;
		anInt1930 = itemdefinition_5_.anInt1930;
		femaleModel1 = itemdefinition_5_.femaleModel1;
		zan2d = itemdefinition_6_.zan2d;
		options = itemdefinition_5_.options;
		anInt1923++;
		femaleHeadModel2 = itemdefinition_5_.femaleHeadModel2;
		aByteArray1882 = itemdefinition_5_.aByteArray1882;
		if (b < 74) {
			method1673(-71, 35);
		}
		anInt1893 = itemdefinition_5_.anInt1893;
		xan2d = itemdefinition_6_.xan2d;
		femaleModel0 = itemdefinition_5_.femaleModel0;
		inventoryModel = itemdefinition_6_.inventoryModel;
		interfaceOptions = new String[5];
		yan2d = itemdefinition_6_.yan2d;
		yOffset2d = itemdefinition_6_.yOffset2d;
		textureFind = itemdefinition_5_.textureFind;
		anInt1890 = itemdefinition_5_.anInt1890;
		maleModel1 = itemdefinition_5_.maleModel1;
		cost = 0;
		anInt1895 = itemdefinition_5_.anInt1895;
		colorFind = itemdefinition_5_.colorFind;
		xOffset2d = itemdefinition_6_.xOffset2d;
		anInt1916 = itemdefinition_5_.anInt1916;
		femaleHeadModel = itemdefinition_5_.femaleHeadModel;
		zoom2d = itemdefinition_6_.zoom2d;
		name = itemdefinition_5_.name;
		femaleModel2 = itemdefinition_5_.femaleModel2;
		maleModel0 = itemdefinition_5_.maleModel0;
		anInt1931 = itemdefinition_5_.anInt1931;
		if (itemdefinition_5_.interfaceOptions != null) {
			for (int i = 0; i < 4; i++)
				interfaceOptions[i] = itemdefinition_5_.interfaceOptions[i];
		}
		interfaceOptions[4] = Class22.aClass22_369.method297(-12273, aClass86_1868.anInt1161);
	}
	
	final void method1677(ItemDefinition itemdefinition_7_, int i, ItemDefinition itemdefinition_8_) {
		int i_9_ = 8 % ((-32 - i) / 32);
		yOffset2d = itemdefinition_7_.yOffset2d;
		colorFind = itemdefinition_7_.colorFind;
		cost = itemdefinition_8_.cost;
		name = itemdefinition_8_.name;
		textureReplace = itemdefinition_7_.textureReplace;
		yan2d = itemdefinition_7_.yan2d;
		zan2d = itemdefinition_7_.zan2d;
		textureFind = itemdefinition_7_.textureFind;
		inventoryModel = itemdefinition_7_.inventoryModel;
		zoom2d = itemdefinition_7_.zoom2d;
		aByteArray1882 = itemdefinition_7_.aByteArray1882;
		stackable = 1;
		xan2d = itemdefinition_7_.xan2d;
		xOffset2d = itemdefinition_7_.xOffset2d;
		members = itemdefinition_8_.members;
		colorReplace = itemdefinition_7_.colorReplace;
		anInt1894++;
	}
	
	final int method1678(int i, int i_10_, int i_11_) {
		anInt1870++;
		if (aHashTable1873 == null) {
			return i_10_;
		}
		Node_Sub32 node_sub32 = (Node_Sub32) aHashTable1873.method1518(i_11_ ^ 0x25bf, (long) i);
		if (i_11_ != 10247) {
			anInt1900 = 69;
		}
		if (node_sub32 == null) {
			return i_10_;
		}
		return node_sub32.anInt7381;
	}
	
	private final int[] method1679(int i, int i_12_, int[] is) {
		anInt1912++;
		int[] is_13_ = new int[1152];
		int i_14_ = 0;
		for (int i_15_ = 0; i_15_ < 32; i_15_++) {
			for (int i_16_ = 0; i_16_ < 36; i_16_++) {
				int i_17_ = is[i_14_];
				if (i_17_ == 0) {
					if (i_16_ <= 0 || is[-1 + i_14_] == 0) {
						if (i_15_ > 0 && is[i_14_ - 36] != 0) {
							i_17_ = i_12_;
						} else if (i_16_ < 35 && is[i_14_ - -1] != 0) {
							i_17_ = i_12_;
						} else if (i_15_ < 31 && is[36 + i_14_] != 0) {
							i_17_ = i_12_;
						}
					} else {
						i_17_ = i_12_;
					}
				}
				is_13_[i_14_++] = i_17_;
			}
		}
		if (i != -1) {
			colorFind = null;
		}
		return is_13_;
	}
	
	public static void method1680(byte b) {
		if (b <= 84) {
			anInt1858 = -85;
		}
		aNode_Sub43_1925 = null;
	}
	
	private void decodeValues(Buffer buffer, int opcode) {
		if (opcode == 1) {
			inventoryModel = buffer.readUnsignedShort();
		} else if (opcode == 2) {
			name = buffer.readString();
		} else if (opcode == 4) {
			zoom2d = buffer.readUnsignedShort();
		} else if (opcode == 5) {
			xan2d = buffer.readUnsignedShort();
		} else if (opcode == 6) {
			yan2d = buffer.readUnsignedShort();
		} else if (opcode == 7) {
			xOffset2d = buffer.readUnsignedShort();
			if (xOffset2d > 32767) {
				xOffset2d -= 65536;
			}
		} else if (opcode == 8) {
			yOffset2d = buffer.readUnsignedShort();
			if (yOffset2d > 32767) {
				yOffset2d -= 65536;
			}
		} else if (opcode == 11) {
			stackable = 1;
		} else if (opcode == 12) {
			cost = buffer.readInt();
		} else if (opcode == 16) {
			members = true;
		} else if (opcode == 18) {
			unknownValueOp18 = buffer.readUnsignedShort();
		} else if (opcode == 23) {
			maleModel0 = buffer.readUnsignedShort();
		} else if (opcode == 24) {
			maleModel1 = buffer.readUnsignedShort();
		} else if (opcode == 25) {
			femaleModel0 = buffer.readUnsignedShort();
		} else if (opcode == 26) {
			femaleModel1 = buffer.readUnsignedShort();
		} else if (opcode >= 30 && opcode < 35) {
			options[opcode + -30] = buffer.readString();
		} else if (opcode >= 35 && opcode < 40) {
			interfaceOptions[-35 + opcode] = buffer.readString();
		} else if (opcode == 40) {
			int length = buffer.readUnsignedByte();
			colorFind = new short[length];
			colorReplace = new short[length];
			for (int i = 0; i < length; i++) {
				colorFind[i] = (short) buffer.readUnsignedShort();
				colorReplace[i] = (short) buffer.readUnsignedShort();
			}
		} else if (opcode == 41) {
			int length = buffer.readUnsignedByte();
			textureFind = new short[length];
			textureReplace = new short[length];
			for (int i = 0; i < length; i++) {
				textureFind[i] = (short) buffer.readUnsignedShort();
				textureReplace[i] = (short) buffer.readUnsignedShort();
			}
		} else if (opcode == 42) {
			int i_27_ = buffer.readUnsignedByte();
			aByteArray1882 = new byte[i_27_];
			for (int i_28_ = 0; i_27_ > i_28_; i_28_++)
				aByteArray1882[i_28_] = buffer.readByte();
		} else if (opcode == 65) {
			isTradeable = true;
		} else if (opcode == 78) {
			maleModel2 = buffer.readUnsignedShort();
		} else if (opcode == 79) {
			femaleModel2 = buffer.readUnsignedShort();
		} else if (opcode == 90) {
			maleHeadModel = buffer.readUnsignedShort();
		} else if (opcode == 91) {
			femaleHeadModel = buffer.readUnsignedShort();
		} else if (opcode == 92) {
			maleHeadModel2 = buffer.readUnsignedShort();
		} else if (opcode == 93) {
			femaleHeadModel2 = buffer.readUnsignedShort();
		} else if (opcode == 95) {
			zan2d = buffer.readUnsignedShort();
		} else if (opcode == 96) {
			anInt1877 = buffer.readUnsignedByte();
		} else if (opcode == 97) {
			notedID = buffer.readUnsignedShort();
		} else if (opcode == 98) {
			notedTemplate = buffer.readUnsignedShort();
		} else if (opcode >= 100 && opcode < 110) {
			if (countObj == null) {
				countCo = new int[10];
				countObj = new int[10];
			}
			countObj[opcode - 100] = buffer.readUnsignedShort();
			countCo[-100 + opcode] = buffer.readUnsignedShort();
		} else if (opcode == 110) {
			anInt1904 = buffer.readUnsignedShort();
		} else if (opcode == 111) {
			anInt1911 = buffer.readUnsignedShort();
		} else if (opcode == 112) {
			anInt1896 = buffer.readUnsignedShort();
		} else if (opcode == 113) {
			anInt1876 = buffer.readByte();
		} else if (opcode == 114) {
			anInt1886 = buffer.readByte() * 5;
		} else if (opcode == 115) {
			anInt1899 = buffer.readUnsignedByte();
		} else if (opcode == 121) {
			anInt1927 = buffer.readUnsignedShort();
		} else if (opcode == 122) {
			anInt1852 = buffer.readUnsignedShort();
		} else if (opcode == 125) {
			anInt1931 = buffer.readByte() << 2;
			anInt1930 = buffer.readByte() << 2;
			anInt1895 = buffer.readByte() << 2;
		} else if (opcode == 126) {
			anInt1890 = buffer.readByte() << 2;
			anInt1893 = buffer.readByte() << 2;
			anInt1916 = buffer.readByte() << 2;
		} else if (opcode == 127) {
			anInt1908 = buffer.readUnsignedByte();
			anInt1889 = buffer.readUnsignedShort();
		} else if (opcode == 128) {
			anInt1849 = buffer.readUnsignedByte();
			anInt1851 = buffer.readUnsignedShort();
		} else if (opcode == 129) {
			anInt1900 = buffer.readUnsignedByte();
			anInt1859 = buffer.readUnsignedShort();
		} else if (opcode == 130) {
			anInt1864 = buffer.readUnsignedByte();
			anInt1862 = buffer.readUnsignedShort();
		} else if (opcode == 132) {
			int i_20_ = buffer.readUnsignedByte();
			anIntArray1926 = new int[i_20_];
			for (int i_21_ = 0; i_20_ > i_21_; i_21_++)
				anIntArray1926[i_21_] = buffer.readUnsignedShort();
		} else if (opcode == 134) {
			anInt1919 = buffer.readUnsignedByte();
		} else if (opcode == 139) {
			anInt1891 = buffer.readUnsignedShort();
		} else if (opcode == 140) {
			anInt1928 = buffer.readUnsignedShort();
		} else if (opcode == 249) {
			int i_22_ = buffer.readUnsignedByte();
			if (aHashTable1873 == null) {
				int i_23_ = Class320_Sub19.method3753(i_22_, -729073628);
				aHashTable1873 = new HashTable(i_23_);
			}
			for (int i_24_ = 0; i_22_ > i_24_; i_24_++) {
				boolean bool_25_ = buffer.readUnsignedByte() == 1;
				int i_26_ = buffer.read24BitInt();
				Node node;
				if (bool_25_) {
					node = new Node_Sub18(buffer.readString());
				} else {
					node = new Node_Sub32(buffer.readInt());
				}
				aHashTable1873.method1515((long) i_26_, node, -127);
			}
		}
	}
	
	final int[] method1682(int i, GraphicsToolkit graphicstoolkit, int i_31_, byte b, int i_32_, boolean bool, PlayerDefinition playerdefinition, GraphicsToolkit graphicstoolkit_33_, Class52 class52, int i_34_) {
		anInt1854++;
		Model model = Renderer.method3448(inventoryModel, 7, 0, aClass86_1868.aClass302_1168);
		if (model == null) {
			return null;
		}
		if (model.anInt2614 < 13) {
			model.method2081(2, 0);
		}
		if (colorFind != null) {
			for (int i_35_ = 0; colorFind.length > i_35_; i_35_++) {
				if (aByteArray1882 == null || aByteArray1882.length <= i_35_) {
					model.method2089(colorFind[i_35_], colorReplace[i_35_], -126);
				} else {
					model.method2089(colorFind[i_35_], Class129.aShortArray1665[0xff & aByteArray1882[i_35_]], -89);
				}
			}
		}
		if (textureFind != null) {
			for (int i_36_ = 0; i_36_ < textureFind.length; i_36_++)
				model.method2087(textureFind[i_36_], textureReplace[i_36_], -78);
		}
		if (playerdefinition != null) {
			for (int i_37_ = 0; i_37_ < 10; i_37_++) {
				for (int i_38_ = 0; i_38_ < Class45.aShortArrayArray5265[i_37_].length; i_38_++) {
					if (Class117_Sub2.aShortArrayArrayArray5151[i_37_][i_38_].length > playerdefinition.anIntArray3430[i_37_]) {
						model.method2089(Class45.aShortArrayArray5265[i_37_][i_38_], Class117_Sub2.aShortArrayArrayArray5151[i_37_][i_38_][playerdefinition.anIntArray3430[i_37_]], -60);
					}
				}
			}
		}
		int i_39_ = 2048;
		boolean bool_40_ = false;
		if (anInt1904 != 128 || anInt1911 != 128 || anInt1896 != 128) {
			bool_40_ = true;
			i_39_ |= 0x7;
		}
		DrawableModel drawablemodel = graphicstoolkit_33_.a(model, i_39_, 64, anInt1876 + 64, anInt1886 + 768);
		int i_41_ = -50 % ((b - 75) / 34);
		if (!drawablemodel.method612()) {
			return null;
		}
		if (bool_40_) {
			drawablemodel.O(anInt1904, anInt1911, anInt1896);
		}
		GLSprite glsprite = null;
		if (notedTemplate != -1) {
			glsprite = aClass86_1868.method1002(1, graphicstoolkit_33_, graphicstoolkit, playerdefinition, true, 0, 10, true, 0, class52, notedID, -16139);
			if (glsprite == null) {
				return null;
			}
		} else if (anInt1852 != -1) {
			glsprite = aClass86_1868.method1002(i_34_, graphicstoolkit_33_, graphicstoolkit, playerdefinition, true, i_32_, i_31_, false, 0, class52, anInt1927, -16139);
			if (glsprite == null) {
				return null;
			}
		} else if (anInt1928 != -1) {
			glsprite = aClass86_1868.method1002(i_34_, graphicstoolkit_33_, graphicstoolkit, playerdefinition, true, i_32_, i_31_, false, 0, class52, anInt1891, -16139);
			if (glsprite == null) {
				return null;
			}
		}
		int i_42_;
		if (bool) {
			i_42_ = (int) (1.5 * (double) zoom2d) << 2;
		} else if (i_34_ == 2) {
			i_42_ = (int) ((double) zoom2d * 1.04) << 2;
		} else {
			i_42_ = zoom2d << 2;
		}
		graphicstoolkit_33_.DA(16, 16, 512, 512);
		Class336 class336 = graphicstoolkit_33_.y();
		class336.method3862();
		graphicstoolkit_33_.a(class336);
		graphicstoolkit_33_.xa(1.0F);
		graphicstoolkit_33_.ZA(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
		Class336 class336_43_ = graphicstoolkit_33_.A();
		class336_43_.method3861(-zan2d << 3);
		class336_43_.method3856(yan2d << 3);
		class336_43_.method3863(xOffset2d << 2, (Class335.anIntArray4167[xan2d << 3] * i_42_ >> 14) + -(drawablemodel.fa() / 2) - -(yOffset2d << 2), (Class335.anIntArray4165[xan2d << 3] * i_42_ >> 14) - -(yOffset2d << 2));
		class336_43_.method3859(xan2d << 3);
		int i_44_ = graphicstoolkit_33_.i();
		int i_45_ = graphicstoolkit_33_.XA();
		graphicstoolkit_33_.f(50, 2147483647);
		graphicstoolkit_33_.ya();
		graphicstoolkit_33_.la();
		graphicstoolkit_33_.aa(0, 0, 36, 32, 0, 0);
		drawablemodel.method611(class336_43_, null, 1);
		graphicstoolkit_33_.f(i_44_, i_45_);
		int[] is = graphicstoolkit_33_.na(0, 0, 36, 32);
		if (i_34_ >= 1) {
			is = method1679(-1, -16777214, is);
			if (i_34_ >= 2) {
				is = method1679(-1, -1, is);
			}
		}
		if (i_32_ != 0) {
			method1688(i_32_, is, -7048);
		}
		graphicstoolkit_33_.method1235(36, 36, 32, is, 0, 7468).method1196(0, 0);
		if (notedTemplate == -1) {
			if (anInt1852 != -1) {
				glsprite.method1196(0, 0);
			} else if (anInt1928 != -1) {
				glsprite.method1196(0, 0);
			}
		} else {
			glsprite.method1196(0, 0);
		}
		if (i == 1 || i == 2 && (stackable == 1 || i_31_ != 1) && i_31_ != -1) {
			class52.method538(0, 9, method1687(22050, i_31_), -16777215, 1, -256);
		}
		is = graphicstoolkit_33_.na(0, 0, 36, 32);
		for (int i_46_ = 0; i_46_ < is.length; i_46_++) {
			if ((0xffffff & is[i_46_]) == 0) {
				is[i_46_] = 0;
			} else {
				is[i_46_] = Node_Sub16.method2590(is[i_46_], -16777216);
			}
		}
		return is;
	}
	
	final Model method1683(Class38 class38, boolean bool, int i) {
		anInt1917++;
		int i_47_;
		int i_48_;
		int i_49_;
		if (!bool) {
			if (class38 == null || class38.anIntArray561 == null) {
				i_49_ = maleModel2;
				i_47_ = maleModel0;
				i_48_ = maleModel1;
			} else {
				i_47_ = class38.anIntArray561[0];
				i_48_ = class38.anIntArray561[1];
				i_49_ = class38.anIntArray561[2];
			}
		} else if (class38 == null || class38.anIntArray566 == null) {
			i_47_ = femaleModel0;
			i_48_ = femaleModel1;
			i_49_ = femaleModel2;
		} else {
			i_49_ = class38.anIntArray566[2];
			i_47_ = class38.anIntArray566[0];
			i_48_ = class38.anIntArray566[1];
		}
		if (i_47_ == -1) {
			return null;
		}
		Model model = Renderer.method3448(i_47_, 7, 0, aClass86_1868.aClass302_1168);
		if (model == null) {
			return null;
		}
		if (model.anInt2614 < 13) {
			model.method2081(2, 0);
		}
		if (i_48_ != -1) {
			Model model_50_ = Renderer.method3448(i_48_, 7, 0, aClass86_1868.aClass302_1168);
			if (model_50_.anInt2614 < 13) {
				model_50_.method2081(2, 0);
			}
			if (i_49_ == -1) {
				Model[] models = { model, model_50_ };
				model = new Model(models, 2);
			} else {
				Model model_51_ = Renderer.method3448(i_49_, 7, 0, aClass86_1868.aClass302_1168);
				if (model_51_.anInt2614 < 13) {
					model_51_.method2081(2, 0);
				}
				Model[] models = { model, model_50_, model_51_ };
				model = new Model(models, 3);
			}
		}
		if (!bool && (anInt1931 != 0 || anInt1930 != 0 || anInt1895 != 0)) {
			model.method2082(anInt1931, anInt1930, -102, anInt1895);
		}
		if (bool && (anInt1890 != 0 || anInt1893 != 0 || anInt1916 != 0)) {
			model.method2082(anInt1890, anInt1893, 96, anInt1916);
		}
		if (colorFind != null) {
			short[] ses;
			if (class38 == null || class38.aShortArray567 == null) {
				ses = colorReplace;
			} else {
				ses = class38.aShortArray567;
			}
			for (int i_52_ = 0; i_52_ < colorFind.length; i_52_++)
				model.method2089(colorFind[i_52_], ses[i_52_], 76);
		}
		if (textureFind != null) {
			short[] ses;
			if (class38 == null || class38.aShortArray563 == null) {
				ses = textureReplace;
			} else {
				ses = class38.aShortArray563;
			}
			for (int i_53_ = 0; i_53_ < textureFind.length; i_53_++)
				model.method2087(textureFind[i_53_], ses[i_53_], -84);
		}
		if (i >= -34) {
			return null;
		}
		return model;
	}
	
	final String method1684(String string, int i, int i_54_) {
		anInt1881++;
		if (aHashTable1873 == null) {
			return string;
		}
		Node_Sub18 node_sub18 = (Node_Sub18) aHashTable1873.method1518(3512, (long) i_54_);
		if (i != -32525) {
			return null;
		}
		if (node_sub18 == null) {
			return string;
		}
		return node_sub18.aString7149;
	}
	
	final Model method1685(boolean bool, Class38 class38, int i) {
		anInt1848++;
		int i_55_;
		int i_56_;
		if (!bool) {
			if (class38 == null || class38.anIntArray564 == null) {
				i_56_ = maleHeadModel2;
				i_55_ = maleHeadModel;
			} else {
				i_55_ = class38.anIntArray564[0];
				i_56_ = class38.anIntArray564[1];
			}
		} else if (class38 == null || class38.anIntArray568 == null) {
			i_55_ = femaleHeadModel;
			i_56_ = femaleHeadModel2;
		} else {
			i_56_ = class38.anIntArray568[1];
			i_55_ = class38.anIntArray568[0];
		}
		if (i_55_ == -1) {
			return null;
		}
		if (i > -33) {
			return null;
		}
		Model model = Renderer.method3448(i_55_, 7, 0, aClass86_1868.aClass302_1168);
		if (model.anInt2614 < 13) {
			model.method2081(2, 0);
		}
		if (i_56_ != -1) {
			Model model_57_ = Renderer.method3448(i_56_, 7, 0, aClass86_1868.aClass302_1168);
			if (model_57_.anInt2614 < 13) {
				model_57_.method2081(2, 0);
			}
			Model[] models = { model, model_57_ };
			model = new Model(models, 2);
		}
		if (colorFind != null) {
			short[] ses;
			if (class38 == null || class38.aShortArray567 == null) {
				ses = colorReplace;
			} else {
				ses = class38.aShortArray567;
			}
			for (int i_58_ = 0; colorFind.length > i_58_; i_58_++)
				model.method2089(colorFind[i_58_], ses[i_58_], 115);
		}
		if (textureFind != null) {
			short[] ses;
			if (class38 == null || class38.aShortArray563 == null) {
				ses = textureReplace;
			} else {
				ses = class38.aShortArray563;
			}
			for (int i_59_ = 0; i_59_ < textureFind.length; i_59_++)
				model.method2087(textureFind[i_59_], ses[i_59_], 101);
		}
		return model;
	}
	
	final boolean method1686(boolean bool, Class38 class38, int i) {
		anInt1885++;
		int i_60_;
		int i_61_;
		int i_62_;
		if (bool) {
			if (class38 == null || class38.anIntArray566 == null) {
				i_61_ = femaleModel0;
				i_60_ = femaleModel2;
				i_62_ = femaleModel1;
			} else {
				i_61_ = class38.anIntArray566[0];
				i_62_ = class38.anIntArray566[1];
				i_60_ = class38.anIntArray566[2];
			}
		} else if (class38 == null || class38.anIntArray561 == null) {
			i_60_ = maleModel2;
			i_61_ = maleModel0;
			i_62_ = maleModel1;
		} else {
			i_62_ = class38.anIntArray561[1];
			i_60_ = class38.anIntArray561[2];
			i_61_ = class38.anIntArray561[0];
		}
		int i_63_ = 116 / ((i - 34) / 52);
		if (i_61_ == -1) {
			return true;
		}
		boolean bool_64_ = aClass86_1868.aClass302_1168.method3515(0, i_61_, 0);
        if (i_62_ != -1 && !aClass86_1868.aClass302_1168.method3515(0, i_62_, 0)) {
			bool_64_ = false;
		}
		if (i_60_ != -1 && !aClass86_1868.aClass302_1168.method3515(0, i_60_, 0)) {
			bool_64_ = false;
		}
		return bool_64_;
	}
	
	private final String method1687(int i, int i_65_) {
		if (i != 22050) {
			method1693(null, (byte) 39, null);
		}
		anInt1932++;
		if (i_65_ < 100000) {
			return "<col=ffff00>" + i_65_ + "</col>";
		}
		if (i_65_ < 10000000) {
			return "<col=ffffff>" + i_65_ / 1000 + Class22.aClass22_399.method297(-12273, aClass86_1868.anInt1161) + "</col>";
		}
		return "<col=00ff80>" + i_65_ / 1000000 + Class22.aClass22_397.method297(i + -34323, aClass86_1868.anInt1161) + "</col>";
	}
	
	private final void method1688(int i, int[] is, int i_66_) {
		if (i_66_ != -7048) {
			anInt1895 = -54;
		}
		for (int i_67_ = 31; i_67_ > 0; i_67_--) {
			int i_68_ = 36 * i_67_;
			for (int i_69_ = 35; i_69_ > 0; i_69_--) {
				if (is[i_69_ - -i_68_] == 0 && is[i_68_ + (i_69_ + -1) - 36] != 0) {
					is[i_69_ + i_68_] = i;
				}
			}
		}
		anInt1907++;
	}
	
	final DrawableModel method1689(Animator animator, int i, PlayerDefinition playerdefinition, int i_70_, GraphicsToolkit graphicstoolkit, int i_71_) {
		anInt1906++;
		if (countObj != null && i_70_ > 1) {
			int i_72_ = -1;
			for (int i_73_ = 0; i_73_ < 10; i_73_++) {
				if (countCo[i_73_] <= i_70_ && countCo[i_73_] != 0) {
					i_72_ = countObj[i_73_];
				}
			}
			if (i_72_ != -1) {
				return aClass86_1868.method1010(i_72_, 14434).method1689(animator, i, playerdefinition, 1, graphicstoolkit, 87);
			}
		}
		int i_74_ = i;
		if (animator != null) {
			i_74_ |= animator.method237((byte) -128);
		}
		DrawableModel drawablemodel;
		synchronized (aClass86_1868.aClass61_1176) {
			drawablemodel = (DrawableModel) aClass86_1868.aClass61_1176.method607((long) (anInt1914 | graphicstoolkit.anInt1537 << 29), 0);
		}
		if (i_71_ <= 64) {
			return null;
		}
		if (drawablemodel == null || graphicstoolkit.b(drawablemodel.ua(), i_74_) != 0) {
			if (drawablemodel != null) {
				i_74_ = graphicstoolkit.c(i_74_, drawablemodel.ua());
			}
			int i_75_ = i_74_;
			if (textureFind != null) {
				i_75_ |= 0x8000;
			}
			if (colorFind != null || playerdefinition != null) {
				i_75_ |= 0x4000;
			}
			if (anInt1904 != 128) {
				i_75_ |= 0x1;
			}
			if (anInt1904 != 128) {
				i_75_ |= 0x2;
			}
			if (anInt1904 != 128) {
				i_75_ |= 0x4;
			}
			Model model = Renderer.method3448(inventoryModel, 7, 0, aClass86_1868.aClass302_1168);
			if (model == null) {
				return null;
			}
			if (model.anInt2614 < 13) {
				model.method2081(2, 0);
			}
			drawablemodel = graphicstoolkit.a(model, i_75_, aClass86_1868.anInt1181, 64 + anInt1876, 850 - -anInt1886);
			if (anInt1904 != 128 || anInt1911 != 128 || anInt1896 != 128) {
				drawablemodel.O(anInt1904, anInt1911, anInt1896);
			}
			if (colorFind != null) {
				for (int i_76_ = 0; colorFind.length > i_76_; i_76_++) {
					if (aByteArray1882 == null || i_76_ >= aByteArray1882.length) {
						drawablemodel.ia(colorFind[i_76_], colorReplace[i_76_]);
					} else {
						drawablemodel.ia(colorFind[i_76_], Class129.aShortArray1665[aByteArray1882[i_76_] & 0xff]);
					}
				}
			}
			if (textureFind != null) {
				for (int i_77_ = 0; i_77_ < textureFind.length; i_77_++)
					drawablemodel.aa(textureFind[i_77_], textureReplace[i_77_]);
			}
			if (playerdefinition != null) {
				for (int i_78_ = 0; i_78_ < 10; i_78_++) {
					for (int i_79_ = 0; i_79_ < Class45.aShortArrayArray5265[i_78_].length; i_79_++) {
						if (playerdefinition.anIntArray3430[i_78_] < Class117_Sub2.aShortArrayArrayArray5151[i_78_][i_79_].length) {
							drawablemodel.ia(Class45.aShortArrayArray5265[i_78_][i_79_], Class117_Sub2.aShortArrayArrayArray5151[i_78_][i_79_][playerdefinition.anIntArray3430[i_78_]]);
						}
					}
				}
			}
			drawablemodel.s(i_74_);
			synchronized (aClass86_1868.aClass61_1176) {
				aClass86_1868.aClass61_1176.method601(drawablemodel, 25566, (long) (anInt1914 | graphicstoolkit.anInt1537 << 29));
			}
		}
		if (animator != null) {
			drawablemodel = drawablemodel.method633((byte) 1, i_74_, true);
			animator.method225(0, drawablemodel, 0);
		}
		drawablemodel.s(i);
		return drawablemodel;
	}
	
	static final void method1690(byte b) {
		Class274.method3325(Class213.aNode_Sub27_2512.aClass320_Sub17_7311.method3747(false) == 1, 122, 22050, 2);
		if (b <= -102) {
			anInt1903++;
			AnimableAnimator.aClass42_5498 = Class262_Sub22.method3207(Class240.aSignLink2946, (byte) -27, 0, 22050, Node_Sub38_Sub20.aCanvas10309);
			AnimableAnimator_Sub1.method256(true, 1405, Class32.method359(null, -9293));
			Packet.aClass42_9402 = Class262_Sub22.method3207(Class240.aSignLink2946, (byte) -27, 1, 2048, Node_Sub38_Sub20.aCanvas10309);
			Class176.aNode_Sub9_Sub3_2106 = new Node_Sub9_Sub3();
			Packet.aClass42_9402.method441(11757, Class176.aNode_Sub9_Sub3_2106);
			Class361.aClass191_4486 = new Class191(22050, Class365.anInt4523);
			EntityNode_Sub7.method979(17285);
		}
	}
	
	final void method1691(byte b) {
		if (b <= 77) {
			isTradeable = true;
		}
		anInt1910++;
	}
	
	final boolean method1692(int i, Class38 class38, boolean bool) {
		anInt1921++;
		int i_80_;
		int i_81_;
		if (bool) {
			if (class38 == null || class38.anIntArray568 == null) {
				i_81_ = femaleHeadModel;
				i_80_ = femaleHeadModel2;
			} else {
				i_81_ = class38.anIntArray568[0];
				i_80_ = class38.anIntArray568[1];
			}
		} else if (class38 == null || class38.anIntArray564 == null) {
			i_80_ = maleHeadModel2;
			i_81_ = maleHeadModel;
		} else {
			i_80_ = class38.anIntArray564[1];
			i_81_ = class38.anIntArray564[0];
		}
		if (i_81_ == -1) {
			return true;
		}
		boolean bool_82_ = aClass86_1868.aClass302_1168.method3515(i, i_81_, 0);
        if (i_80_ != -1 && !aClass86_1868.aClass302_1168.method3515(0, i_80_, 0)) {
			bool_82_ = false;
		}
		return bool_82_;
	}
	
	final void method1693(ItemDefinition itemdefinition_83_, byte b, ItemDefinition itemdefinition_84_) {
		cost = 0;
		maleModel2 = itemdefinition_84_.maleModel2;
		stackable = itemdefinition_84_.stackable;
		members = itemdefinition_84_.members;
		aByteArray1882 = itemdefinition_84_.aByteArray1882;
		yOffset2d = itemdefinition_83_.yOffset2d;
		anInt1899 = itemdefinition_84_.anInt1899;
		maleModel1 = itemdefinition_84_.maleModel1;
		interfaceOptions = new String[5];
		options = itemdefinition_84_.options;
		anInt1930 = itemdefinition_84_.anInt1930;
		maleHeadModel = itemdefinition_84_.maleHeadModel;
		anInt1893 = itemdefinition_84_.anInt1893;
		name = itemdefinition_84_.name;
		zoom2d = itemdefinition_83_.zoom2d;
		colorFind = itemdefinition_84_.colorFind;
		femaleHeadModel2 = itemdefinition_84_.femaleHeadModel2;
		aHashTable1873 = itemdefinition_84_.aHashTable1873;
		femaleModel0 = itemdefinition_84_.femaleModel0;
		anInt1929++;
		xan2d = itemdefinition_83_.xan2d;
		yan2d = itemdefinition_83_.yan2d;
		anInt1890 = itemdefinition_84_.anInt1890;
		maleHeadModel2 = itemdefinition_84_.maleHeadModel2;
		femaleModel2 = itemdefinition_84_.femaleModel2;
		textureReplace = itemdefinition_84_.textureReplace;
		anInt1931 = itemdefinition_84_.anInt1931;
		femaleHeadModel = itemdefinition_84_.femaleHeadModel;
		inventoryModel = itemdefinition_83_.inventoryModel;
		colorReplace = itemdefinition_84_.colorReplace;
		femaleModel1 = itemdefinition_84_.femaleModel1;
		xOffset2d = itemdefinition_83_.xOffset2d;
		zan2d = itemdefinition_83_.zan2d;
		if (b > -104) {
			method1687(-128, -32);
		}
		maleModel0 = itemdefinition_84_.maleModel0;
		anInt1916 = itemdefinition_84_.anInt1916;
		anInt1895 = itemdefinition_84_.anInt1895;
		textureFind = itemdefinition_84_.textureFind;
		if (itemdefinition_84_.interfaceOptions != null) {
			for (int i = 0; i < 4; i++)
				interfaceOptions[i] = itemdefinition_84_.interfaceOptions[i];
		}
		interfaceOptions[4] = Class22.aClass22_370.method297(-12273, aClass86_1868.anInt1161);
	}
	
	public ItemDefinition() {
		anInt1849 = -1;
		maleModel0 = -1;
		anInt1864 = -1;
		maleModel1 = -1;
		zan2d = 0;
		anInt1852 = -1;
		anInt1862 = -1;
		anInt1891 = -1;
		maleModel2 = -1;
		anInt1876 = 0;
		anInt1886 = 0;
		femaleHeadModel = -1;
		zoom2d = 2000;
		unknownValueOp18 = -1;
		anInt1899 = 0;
		members = false;
		anInt1911 = 128;
		xOffset2d = 0;
		name = "null";
		anInt1859 = -1;
		anInt1904 = 128;
		maleHeadModel2 = -1;
		femaleHeadModel2 = -1;
		anInt1908 = -1;
		yan2d = 0;
		anInt1895 = 0;
		anInt1889 = -1;
		anInt1900 = -1;
		anInt1893 = 0;
		femaleModel1 = -1;
		yOffset2d = 0;
		anInt1890 = 0;
		maleHeadModel = -1;
		anInt1919 = 0;
		stackable = 0;
		anInt1896 = 128;
		femaleModel2 = -1;
		notedTemplate = -1;
		notedID = -1;
		cost = 1;
		anInt1877 = 0;
		anInt1928 = -1;
		xan2d = 0;
		anInt1927 = -1;
		femaleModel0 = -1;
		anInt1930 = 0;
		anInt1916 = 0;
		anInt1931 = 0;
		isTradeable = false;
	}
}
