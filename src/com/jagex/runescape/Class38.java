package com.jagex.runescape;

public class Class38
{
	protected int[] anIntArray561;
	static long aLong562 = -1L;
	protected short[] aShortArray563;
	protected int[] anIntArray564;
	static d aD565;
	protected int[] anIntArray566;
	protected short[] aShortArray567;
	protected int[] anIntArray568 = new int[2];
	static int anInt569;
	
	public static void method402(int i) {
		aD565 = null;
		if (i != 0) {
			aLong562 = 8L;
		}
	}
	
	static final void method403(int i) {
		anInt569++;
		if (Node_Sub38_Sub8.anInt10163 != i) {
			Class320_Sub23.aClass123_8432.method1513(i ^ ~0x6e0f);
			Class375.method4115((byte) -97);
			Class297.method3479((byte) -119);
		}
	}
	
	Class38(ItemDefinition itemdefinition) {
		anIntArray564 = new int[2];
		anIntArray561 = new int[3];
		anIntArray566 = new int[3];
		anIntArray561[0] = itemdefinition.maleModel0;
		anIntArray561[1] = itemdefinition.maleModel1;
		anIntArray561[2] = itemdefinition.maleModel2;
		anIntArray566[0] = itemdefinition.femaleModel0;
		anIntArray566[1] = itemdefinition.femaleModel1;
		anIntArray566[2] = itemdefinition.femaleModel2;
		anIntArray564[0] = itemdefinition.maleHeadModel;
		anIntArray564[1] = itemdefinition.maleHeadModel2;
		anIntArray568[0] = itemdefinition.femaleHeadModel;
		anIntArray568[1] = itemdefinition.femaleHeadModel2;
		if (itemdefinition.colorReplace != null) {
			aShortArray567 = new short[itemdefinition.colorReplace.length];
			Class311.method3606(itemdefinition.colorReplace, 0, aShortArray567, 0, aShortArray567.length);
		}
		if (itemdefinition.textureReplace != null) {
			aShortArray563 = new short[itemdefinition.textureReplace.length];
			Class311.method3606(itemdefinition.textureReplace, 0, aShortArray563, 0, aShortArray563.length);
		}
	}
}
