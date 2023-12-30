package com.jagex;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

public class DevConsoleNode extends Node
{
	static int anInt7520;
	protected int anInt7521;
	protected String aString7522;
	static Class318 aClass318_7523 = new Class318(66, 3);
	static int anInt7524;
	static int anInt7525;
	static Class318 aClass318_7526 = new Class318(61, 8);
	static int anInt7527;
	
	public static void method2933(int i) {
		aClass318_7523 = null;
		if (i == -3239) {
			aClass318_7526 = null;
		}
	}
	
	static final Class151[] method2934(int i) {
		if (i >= -6) {
			anInt7527 = -24;
		}
		anInt7524++;
		return new Class151[] { Class216.aClass151_2550, Node_Sub44.aClass151_7549, Node_Sub38_Sub33.aClass151_10439, ClanChat.aClass151_756, Class35.aClass151_535, Class345.aClass151_4267, Node_Sub8.aClass151_7066, Class194.aClass151_2372, Node_Sub39.aClass151_7493, Class150_Sub1.aClass151_8949, Class323.aClass151_4080, Class50.aClass151_781, Node_Sub20.aClass151_7178, Class374.aClass151_4614 };
	}
	
	public DevConsoleNode() {
		/* empty */
	}
	
	static final boolean method2935(byte b, int i, int i_0_) {
		anInt7520++;
		if (i_0_ >= 1000 && (i ^ 0xffffffff) > -1001) {
			return true;
		}
		if (i_0_ < 1000 && (i ^ 0xffffffff) > -1001) {
			if (Node_Sub27.method2699(18, i)) {
				return true;
			}
			if (Node_Sub27.method2699(18, i_0_)) {
				return false;
			}
			return true;
		}
		if (i_0_ >= 1000 && (i ^ 0xffffffff) <= -1001) {
			return true;
		}
		if (b != 69) {
			method2934(85);
		}
		return false;
	}
	
	DevConsoleNode(String string, int i) {
		anInt7521 = i;
		aString7522 = string;
	}
	
	
	static final void drawDevConsole(GraphicsToolkit graphicstoolkit, int i) {
		int offsetX = 0;
		int offsetY = 0;
		int totalHeight = 350;
		int totalWidth = Class360.windowWidth;
		int consoleColor = 0x332277;
		
		if (Class71.aBoolean967) {
	        offsetX = Class67.method733(-82);
	        offsetY = Class226.method2112(256);
	    }

		graphicstoolkit.KA(offsetX, offsetY, totalWidth + offsetX, totalHeight + offsetY);
	    graphicstoolkit.aa(offsetX, offsetY, totalWidth, totalHeight, consoleColor | (Class298.anInt3740 << 24), 1);
	    Class362.method4053(offsetY, totalHeight + offsetY, offsetX, (byte) -108, totalWidth + offsetX);
	    
	    // Drawing scroll bar
	    drawScrollBar(graphicstoolkit, offsetX, offsetY, totalWidth);

	    // Drawing footer
	    drawFooter(graphicstoolkit, offsetX, offsetY, totalWidth);
		
	}
	
	private static void drawFooter(GraphicsToolkit graphicstoolkit, int offsetX, int offsetY, int totalWidth) {
	    // Draw Build version
	    CacheNode_Sub18.aClass52_9609.method543((byte) -117, totalWidth + (offsetX - 25), "Build: 667", -1, -16777216,
	            offsetY + 350 - 20);

	    // Draw background rectangle
	    graphicstoolkit.KA(offsetX, offsetY, totalWidth + offsetX, 350 + offsetY);

	    // Draw separator line
	    graphicstoolkit.method1242(350 - Class347.anInt4282 + offsetY, -1, offsetX, false, totalWidth);

	    // Draw additional text
	    Class262_Sub4.aClass52_7721.method538(offsetX + 10,
	            offsetY + (350 - Class262_Sub15_Sub1.aClass357_10524.anInt4442 + 1),
	            "--> " + Class188_Sub2_Sub2.method1914(Node_Sub10.aString7081, 51), -16777216, 1, -1);

	    // Draw dynamic text color if Class51.aBoolean5331 is true
	    if (Class51.aBoolean5331) {
	        int textColor = -1;
	        if ((Class174.anInt2092 % 30) > 15) {
	            textColor = 0xFFFFFF; // Change color dynamically
	        }

	        graphicstoolkit.method1243(12, offsetY + 350 - Class262_Sub15_Sub1.aClass357_10524.anInt4442 - 11, textColor,
	                Class262_Sub15_Sub1.aClass357_10524.method4033((byte) -6,
	                        "--> " + Class188_Sub2_Sub2.method1914(Node_Sub10.aString7081, -118)
	                                .substring(0, Class315.anInt4034))
	                        + 10 + offsetX,
	                2);
	    }
	}
	
	private static void drawScrollBar(GraphicsToolkit graphicstoolkit, int offsetX, int offsetY, int totalWidth) {
	    int scrollBarHeight = 350 / Class91.anInt1227;

	    if (Class144_Sub4.anInt6848 > 0) {
	        int scrollBarLength = 346 - (Class91.anInt1227 + 4);
	        int scrollThumbHeight = scrollBarHeight * scrollBarLength / (-1 + scrollBarHeight + Class144_Sub4.anInt6848);
	        int scrollThumbOffset = 4;

	        if (Class144_Sub4.anInt6848 > 1) {
	            scrollThumbOffset += (-Class118.anInt5406 + -1 + Class144_Sub4.anInt6848) * (scrollBarLength - scrollThumbHeight) / (-1 + Class144_Sub4.anInt6848);
	        }

	        // Draw scrollbar
	        graphicstoolkit.aa(-16 + (totalWidth + offsetX), offsetY + scrollThumbOffset, 12, scrollThumbHeight,
	                (Class298.anInt3740 << 24) | 0x332277, 2);

	        // Draw scrollbar text
	        for (int i = Class118.anInt5406; i < Class118.anInt5406 + scrollBarHeight; i++) {
	            if (Class144_Sub4.anInt6848 <= i) {
	                break;
	            }
	            String[] strings = Class106.method1120((byte) 46, Class210.aStringArray2502[i], '\010');
	            int textWidth = (totalWidth - 8 - 16) / strings.length;

	            for (int j = 0; j < strings.length; j++) {
	                int textOffset = j * textWidth + 8;
	                graphicstoolkit.KA(offsetX + textOffset, offsetY, offsetX + textOffset + textWidth, offsetY + 350);
	                StandardSprite.aClass52_8945.method538(offsetX + textOffset,
	                        -Class169_Sub3.aClass357_8820.anInt4442 + (-2 + offsetY + (350 - Class347.anInt4282) - ((i - Class118.anInt5406) * Class91.anInt1227)),
	                        Class188_Sub2_Sub2.method1914(strings[j], 42), -16777216, 1, -1);
	            }
	        }
	    }
	}
}
