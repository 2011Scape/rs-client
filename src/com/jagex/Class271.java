package com.jagex;
import java.util.zip.Inflater;

public class Class271
{
	static int anInt3478;
	static int anInt3479;
	private Inflater anInflater3480;
	static int anInt3481;
	static int anInt3482;
	
	final void method3311(int i, Buffer buffer, byte[] bs) {
		anInt3481++;
		if ((buffer.aByteArray7019[buffer.anInt7002] ^ 0xffffffff) != -32 || buffer.aByteArray7019[buffer.anInt7002 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (anInflater3480 == null) {
			anInflater3480 = new Inflater(true);
		}
		try {
			anInflater3480.setInput(buffer.aByteArray7019, i + buffer.anInt7002, -8 - buffer.anInt7002 - (10 - buffer.aByteArray7019.length));
			anInflater3480.inflate(bs);
		} catch (Exception exception) {
			anInflater3480.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		anInflater3480.reset();
	}
	
	final byte[] method3312(byte[] bs, boolean bool) {
		anInt3482++;
		Buffer buffer = new Buffer(bs);
		if (bool != true) {
			return null;
		}
		buffer.anInt7002 = bs.length - 4;
		int i = buffer.method2188(117);
		byte[] bs_0_ = new byte[i];
		buffer.anInt7002 = 0;
		method3311(10, buffer, bs_0_);
		return bs_0_;
	}
	
	static final void method3313(Object[] objects, int[] is, byte b) {
		Class238.method3019(is.length - 1, 0, is, objects, false);
		anInt3478++;
		if (b != -83) {
			method3313(null, null, (byte) 102);
		}
	}
	
	private Class271(int i, int i_1_, int i_2_) {
		/* empty */
	}
	
	public Class271() {
		this(-1, 1000000, 1000000);
	}
}
