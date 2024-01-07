package com.jagex;

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
		anIntArray561[0] = itemdefinition.anInt1853;
		anIntArray561[1] = itemdefinition.anInt1878;
		anIntArray561[2] = itemdefinition.anInt1867;
		anIntArray566[0] = itemdefinition.anInt1880;
		anIntArray566[1] = itemdefinition.anInt1883;
		anIntArray566[2] = itemdefinition.anInt1915;
		anIntArray564[0] = itemdefinition.anInt1913;
		anIntArray564[1] = itemdefinition.anInt1888;
		anIntArray568[0] = itemdefinition.anInt1863;
		anIntArray568[1] = itemdefinition.anInt1897;
		if (itemdefinition.aShortArray1865 != null) {
			aShortArray567 = new short[itemdefinition.aShortArray1865.length];
			Class311.method3606(itemdefinition.aShortArray1865, 0, aShortArray567, 0, aShortArray567.length);
		}
		if (itemdefinition.aShortArray1909 != null) {
			aShortArray563 = new short[itemdefinition.aShortArray1909.length];
			Class311.method3606(itemdefinition.aShortArray1909, 0, aShortArray563, 0, aShortArray563.length);
		}
	}
}
