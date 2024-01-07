package com.jagex;
import java.io.IOException;

public class Class123
{
	protected Class365 aClass365_1557;
	private Class312 aClass312_1558 = new Class312();
	static int anInt1559;
	static int anInt1560;
	static int anInt1561;
	static Class192 aClass192_1562 = new Class192(57, -2);
	static int anInt1563;
	static Class129 aClass129_1564 = new Class129("WIP", 2);
	protected Class241 aClass241_1565;
	private Buffer aBuffer1566;
	private int anInt1567 = 0;
	static int anInt1568;
	static int anInt1569;
	protected Packet aPacket1570;
	protected IsaacCipher anIsaacCipher1571;
	protected int anInt1572;
	protected Class192 aClass192_1573;
	protected Class192 aClass192_1574;
	protected int anInt1575;
	protected Class192 aClass192_1576;
	protected int anInt1577;
	protected int anInt1578;
	protected int anInt1579;
	protected boolean aBoolean1580;
	protected int anInt1581;
	protected Class192 aClass192_1582;
	private int anInt1583;
	protected boolean aBoolean1584;
	
	public static void method1509(int i) {
		aClass192_1562 = null;
		int i_0_ = 36 % ((-23 - i) / 47);
		aClass129_1564 = null;
	}
	
	final void method1510(int i) {
		if (Class174.anInt2092 % 50 == 0) {
			anInt1572 = anInt1583;
			anInt1577 = anInt1575;
			anInt1583 = 0;
			anInt1575 = 0;
		}
		if (i > -62) {
			anInt1572 = -99;
		}
		anInt1560++;
	}
	
	final void method1511(byte b) {
		anInt1563++;
		aClass312_1558.method3614(-601);
		anInt1567 = 0;
		if (b <= 35) {
			anInt1583 = -42;
		}
	}
	
	final void method1512(byte b) throws IOException {
		anInt1561++;
		if (aClass365_1557 != null && anInt1567 > 0) {
			aBuffer1566.anInt7002 = 0;
			for (;;) {
				Node_Sub13 node_sub13 = (Node_Sub13) aClass312_1558.method3613(65280);
				if (node_sub13 == null || (node_sub13.anInt7114 ^ 0xffffffff) < (aBuffer1566.aByteArray7019.length + -aBuffer1566.anInt7002 ^ 0xffffffff)) {
					break;
				}
				aBuffer1566.method2223(node_sub13.anInt7114, (byte) 4, node_sub13.aPacket7113.aByteArray7019, 0);
				anInt1567 -= node_sub13.anInt7114;
				node_sub13.method2160((byte) 36);
				node_sub13.aPacket7113.method2202(b ^ 0x2a);
				node_sub13.method2547(false);
			}
			aClass365_1557.method4067(aBuffer1566.aByteArray7019, aBuffer1566.anInt7002, (byte) -29, 0);
			anInt1579 = 0;
			anInt1583 += aBuffer1566.anInt7002;
		}
		if (b != -89) {
			method1513(23);
		}
	}
	
	final void method1513(int i) {
		anInt1569++;
		if (aClass365_1557 != null) {
			aClass365_1557.method4062(-2);
			aClass365_1557 = null;
		}
		if (i != -28176) {
			method1511((byte) 11);
		}
	}
	
	final void method1514(int i, Node_Sub13 node_sub13) {
		anInt1559++;
		aClass312_1558.method3625((byte) -54, node_sub13);
		node_sub13.anInt7114 = node_sub13.aPacket7113.anInt7002;
		node_sub13.aPacket7113.anInt7002 = 0;
		anInt1567 += node_sub13.anInt7114;
		if (i <= 125) {
			method1510(57);
		}
	}
	
	public Class123() {
		aBuffer1566 = new Buffer(1350);
		aPacket1570 = new Packet(15000);
		aClass192_1576 = null;
		anInt1581 = 0;
		anInt1579 = 0;
		aBoolean1580 = false;
		aBoolean1584 = true;
		anInt1578 = 0;
	}
}
