package com.jagex;

public class Class316
{
	static int anInt4036;
	static int anInt4037;
	
	static final boolean method3661(int i, int i_0_, byte b) {
		anInt4037++;
		if (b != 69) {
			return false;
		}
		if ((i & 0x180) == 0) {
			return false;
		}
		return true;
	}
	
	static final boolean method3662(boolean bool, char c) {
		anInt4036++;
		if (bool != false) {
			method3662(true, '%');
		}
		if (((c ^ 0xffffffff) > -49 || (c ^ 0xffffffff) < -58) && (c < 65 || (c ^ 0xffffffff) < -91) && (c < 97 || c > 122)) {
			return false;
		}
		return true;
	}
}
