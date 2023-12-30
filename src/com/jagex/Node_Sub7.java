package com.jagex;
import java.util.Date;

public class Node_Sub7 extends Node
{
	volatile int anInt7060 = -1;
	static int anInt7061;
	static int anInt7062;
	static int anInt7063;
	volatile String aString7064;
	
	static final void method2421(byte b) {
		anInt7061++;
		for (CacheNode_Sub4 cachenode_sub4 = (CacheNode_Sub4) Class184.aClass158_2189.method1723(13); cachenode_sub4 != null; cachenode_sub4 = (CacheNode_Sub4) Class184.aClass158_2189.method1721(0)) {
			if (cachenode_sub4.anInt9462 > 1) {
				cachenode_sub4.anInt9462 = 0;
				Class200_Sub2.aClass61_4941.method601(cachenode_sub4, b ^ 0x63bc, ((CacheNode_Sub13) cachenode_sub4.aClass158_9457.aCacheNode1984.aCacheNode7035).aLong9564);
				cachenode_sub4.aClass158_9457.method1722(true);
			}
		}
		Class315.anInt4035 = 0;
		Class21.anInt355 = 0;
		if (b != 98) {
			anInt7063 = 47;
		}
		Class368.aClass312_4549.method3614(-601);
		Class261.aHashTable3306.method1517(false);
		Class184.aClass158_2189.method1722(true);
		client.method114((byte) 118, Class277.aCacheNode_Sub13_3509);
	}
	
	static void generateTimestamp(byte b, String logMessage) {
	    incrementCounter();
	    initializeStringArray();

	    String timestamp = generateTimestampString();
	    String[] messages = splitMessages(logMessage, '\n');

	    for (String message : messages) {
	        updateStringArray(timestamp, message);
	        writeToFile();
	        updateCounters();
	    }
	}

	private static void incrementCounter() {
	    anInt7062++;
	}

	private static void initializeStringArray() {
	    if (Class210.aStringArray2502 == null) {
	        Class147.method1647(87);
	    }
	}

	private static String generateTimestampString() {
	    Class247.aCalendar3144.setTime(new Date(Class313.method3650(false)));
	    int hour = Class247.aCalendar3144.get(11);
	    int minute = Class247.aCalendar3144.get(12);
	    int second = Class247.aCalendar3144.get(13);

	    return String.format("%d%d:%d%d:%d%d", hour / 10, hour % 10, minute / 10, minute % 10, second / 10, second % 10);
	}

	private static String[] splitMessages(String logMessage, char delimiter) {
	    return Class106.method1120((byte) -113, logMessage, delimiter);
	}

	private static void updateStringArray(String timestamp, String message) {
	    for (int i = Class144_Sub4.anInt6848; i > 0; i--) {
	        Class210.aStringArray2502[i] = Class210.aStringArray2502[i - 1];
	    }
	    Class210.aStringArray2502[0] = timestamp + ": " + message;
	}

	private static void writeToFile() {
	    if (Class270_Sub1.aFileOutputStream8027 != null) {
	        try {
	            Class270_Sub1.aFileOutputStream8027.write(Class320_Sub21.method3763(-128, Class210.aStringArray2502[0] + "\n"));
	        } catch (java.io.IOException ignored) {
	            /* empty */
	        }
	    }
	}

	private static void updateCounters() {
	    if (Class144_Sub4.anInt6848 < Class210.aStringArray2502.length - 1) {
	        Class144_Sub4.anInt6848++;
	        if (Class118.anInt5406 > 0) {
	            Class118.anInt5406++;
	        }
	    }
	}

	
	Node_Sub7(String string) {
		aString7064 = string;
	}
}
