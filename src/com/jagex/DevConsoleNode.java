package com.jagex;

import java.io.File;
import java.io.FileOutputStream;

import jagex3.jagmisc.jagmisc;

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

	static final void processConsoleCommands(int i, boolean bool, boolean bool_11_, String string) {
		Class126.anInt1618++;
		try {
			if (string.equalsIgnoreCase("commands") || string.equalsIgnoreCase("help")) {
				Node_Sub7.generateTimestamp((byte) 43, "commands - This command");
				Node_Sub7.generateTimestamp((byte) 43, "cls - Clear console");
				Node_Sub7.generateTimestamp((byte) 43, "displayfps - Toggle FPS and other information");
				Node_Sub7.generateTimestamp((byte) 43, "renderer - Print graphics renderer information");
				Node_Sub7.generateTimestamp((byte) 43, "heap - Print java memory information");
				Node_Sub7.generateTimestamp((byte) 43, "getcamerapos - Print location and direction of camera for use in bug reports");
				return;
			}
			if (string.equalsIgnoreCase("cls")) {
				Class118.anInt5406 = 0;
				Class144_Sub4.anInt6848 = 0;
				return;
			}
			if (i < 74) {
				return;
			}
			if (string.equalsIgnoreCase("displayfps")) {
				Node_Sub15_Sub2.displayRenderData = !Node_Sub15_Sub2.displayRenderData;
				if (!Node_Sub15_Sub2.displayRenderData) {
					Node_Sub7.generateTimestamp((byte) 43, "FPS off");
				} else {
					Node_Sub7.generateTimestamp((byte) 43, "FPS on");
					return;
				}
				return;
			}
			if (string.equals("renderer")) {
				Renderer renderer = Class93.aGraphicsToolkit1241.c();
				Node_Sub7.generateTimestamp((byte) 43, "Vendor: " + renderer.vendorName);
				Node_Sub7.generateTimestamp((byte) 43, "Name: " + renderer.aString3664);
				Node_Sub7.generateTimestamp((byte) 43, "Version: " + renderer.anInt3658);
				Node_Sub7.generateTimestamp((byte) 43, "Device: " + renderer.aString3660);
				Node_Sub7.generateTimestamp((byte) 43, "Driver Version: " + renderer.graphicsDriverVersion);
				return;
			}
			if (string.equals("heap")) {
				Node_Sub7.generateTimestamp((byte) 43, "Heap: " + Class201.anInt2446 + "MB");
				return;
			}
			if (string.equalsIgnoreCase("getcamerapos")) {
				Node_Sub7.generateTimestamp((byte) 43, "Pos: " + Class295.aPlayer3692.aByte5933 + "," + ((Class98.anInt5061 >> 9) + Node_Sub53.anInt7668 >> 6) + "," + ((Node_Sub10.anInt7079 >> 9) - -Class320_Sub4.anInt8243 >> 6) + "," + ((Class98.anInt5061 >> 9) - -Node_Sub53.anInt7668 & 0x3f) + "," + ((Node_Sub10.anInt7079 >> 9) - -Class320_Sub4.anInt8243 & 0x3f) + " Height: " + (Node_Sub38_Sub7.method2809(Class295.aPlayer3692.aByte5933, -29754, Node_Sub10.anInt7079, Class98.anInt5061) + -Class190.anInt2331));
				Node_Sub7.generateTimestamp((byte) 43, "Look: " + Class295.aPlayer3692.aByte5933 + "," + (Class238.anInt2911 + Node_Sub53.anInt7668 >> 6) + "," + (Class320_Sub4.anInt8243 + Class10.anInt174 >> 6) + "," + (0x3f & Node_Sub53.anInt7668 + Class238.anInt2911) + "," + (0x3f & Class320_Sub4.anInt8243 + Class10.anInt174) + " Height: " + (Node_Sub38_Sub7.method2809(Class295.aPlayer3692.aByte5933, -29754, Class10.anInt174, Class238.anInt2911) + -Class134_Sub1.anInt9015));
				return;
			}
		} catch (Exception exception) {
			Node_Sub7.generateTimestamp((byte) 43, Localization.commandError.getLocalizationString(-12273, Class35.clientLanguage));
			return;
		}
		if (Class240.aClass329_2943 != Node_Sub38_Sub1.aClass329_10086 || Class339_Sub7.playerPrivilege >= 2) {
			if (string.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (string.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (string.equalsIgnoreCase("printfps")) {
					Node_Sub7.generateTimestamp((byte) 43, "FPS: " + Node_Sub9_Sub4.currentFPS);
					return;
				}
				if (string.equalsIgnoreCase("occlude")) {
					Class12.occlusionEnabled = !Class12.occlusionEnabled;
					if (!Class12.occlusionEnabled) {
						Node_Sub7.generateTimestamp((byte) 43, "Occlusion now off!");
					} else {
						Node_Sub7.generateTimestamp((byte) 43, "Occlusion now on!");
						return;
					}
					return;
				}
				if (string.equalsIgnoreCase("fpson")) {
					Node_Sub15_Sub2.displayRenderData = true;
					Node_Sub7.generateTimestamp((byte) 43, "fps debug enabled");
					return;
				}
				if (string.equalsIgnoreCase("fpsoff")) {
					Node_Sub15_Sub2.displayRenderData = false;
					Node_Sub7.generateTimestamp((byte) 43, "fps debug disabled");
					return;
				}
				if (string.equalsIgnoreCase("fpsoff")) {
					Node_Sub15_Sub2.displayRenderData = false;
					Node_Sub7.generateTimestamp((byte) 43, "fps debug disabled");
					return;
				}
				if (string.equalsIgnoreCase("privilege")) {
					Node_Sub7.generateTimestamp((byte) 43, "privilege: " + Class339_Sub7.playerPrivilege);
					return;
				}
				if (string.equals("systemmem")) {
					try {
						Node_Sub7.generateTimestamp((byte) 43, "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + Node_Sub23.instance.anInt7484 + "Mb");
					} catch (Throwable throwable) {
						/* empty */
					}
					return;
				}
				if (string.equalsIgnoreCase("cleartext")) {
					Class226.aClass103_2684.method1112((byte) -122);
					Node_Sub7.generateTimestamp((byte) 43, "Text coords cleared");
					return;
				}
				if (string.equalsIgnoreCase("gc")) {
					Class355.method4021(60);
					for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > -11; i_12_++)
						System.gc();
					Runtime runtime = Runtime.getRuntime();
					int i_13_ = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
					Node_Sub7.generateTimestamp((byte) 43, "mem=" + i_13_ + "k");
					return;
				}
				if (string.equalsIgnoreCase("compact")) {
					Class355.method4021(49);
					for (int i_14_ = 0; i_14_ < 10; i_14_++)
						System.gc();
					Runtime runtime = Runtime.getRuntime();
					int i_15_ = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
					Node_Sub7.generateTimestamp((byte) 43, "Memory before cleanup=" + i_15_ + "k");
					Class189.method1934((byte) 17);
					Class355.method4021(112);
					for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > -11; i_16_++)
						System.gc();
					i_15_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
					Node_Sub7.generateTimestamp((byte) 43, "Memory after cleanup=" + i_15_ + "k");
					return;
				}
				if (string.equalsIgnoreCase("unloadnatives")) {
					Node_Sub7.generateTimestamp((byte) 43, !Class377_Sub1.method4128(0) ? "Library unloading failed!" : "Libraries unloaded");
					return;
				}
				if (string.equalsIgnoreCase("clientdrop")) {
					Node_Sub7.generateTimestamp((byte) 43, "Dropped client connection");
					if (Class151.anInt1843 != 11) {
						if (Class151.anInt1843 == 12) {
							Class218.worldResponseBuffer.aBoolean1580 = true;
						}
					} else {
						Class262_Sub13.method3182(false);
					}
					return;
				}
				if (string.equalsIgnoreCase("rotateconnectmethods")) {
					Class181.aClass197_2155.method1997(17418);
					Node_Sub7.generateTimestamp((byte) 43, "Rotated connection methods");
					return;
				}
				if (string.equalsIgnoreCase("clientjs5drop")) {
					Class267.aClass266_3449.method3235(false);
					Node_Sub7.generateTimestamp((byte) 43, "Dropped client js5 net queue");
					return;
				}
				if (string.equalsIgnoreCase("serverjs5drop")) {
					Class267.aClass266_3449.method3242(-110);
					Node_Sub7.generateTimestamp((byte) 43, "Dropped server js5 net queue");
					return;
				}
				if (string.equalsIgnoreCase("breakcon")) {
					Class240.aSignLink2946.method3644((byte) -64);
					Class123[] class123s = Class218.aClass123Array2567;
					for (int i_17_ = 0; (class123s.length ^ 0xffffffff) < (i_17_ ^ 0xffffffff); i_17_++) {
						Class123 class123 = class123s[i_17_];
						if (class123.aClass365_1557 != null) {
							class123.aClass365_1557.method4063(0);
						}
					}
					Class267.aClass266_3449.method3245(-2);
					Node_Sub7.generateTimestamp((byte) 43, "Breaking new connections for 5 seconds");
					return;
				}
				if (string.equalsIgnoreCase("rebuild")) {
					Class243.method3061(7);
					Node_Sub18.method2606(126);
					Node_Sub7.generateTimestamp((byte) 43, "Rebuilding map");
					return;
				}
				if (string.equalsIgnoreCase("rebuildprofile")) {
					Class366.aLong4528 = Class313.method3650(false);
					Class19.aBoolean313 = true;
					Class243.method3061(7);
					Node_Sub18.method2606(126);
					Node_Sub7.generateTimestamp((byte) 43, "Rebuilding map (with profiling)");
					return;
				}
				if (string.equalsIgnoreCase("wm1")) {
					Node_Sub38_Sub19.method2850(3, 1, -1, false, -1);
					if (Class188_Sub2_Sub1.method1908(3) != 1) {
						Node_Sub7.generateTimestamp((byte) 43, "wm1 failed");
					} else {
						Node_Sub7.generateTimestamp((byte) 43, "wm1 succeeded");
						return;
					}
					return;
				}
				if (string.equalsIgnoreCase("wm2")) {
					Node_Sub38_Sub19.method2850(3, 2, -1, false, -1);
					if (Class188_Sub2_Sub1.method1908(3) != 2) {
						Node_Sub7.generateTimestamp((byte) 43, "wm2 failed");
					} else {
						Node_Sub7.generateTimestamp((byte) 43, "wm2 succeeded");
						return;
					}
					return;
				}
				if (string.equalsIgnoreCase("wm3")) {
					Node_Sub38_Sub19.method2850(3, 3, 1024, false, 768);
					if (Class188_Sub2_Sub1.method1908(3) != 3) {
						Node_Sub7.generateTimestamp((byte) 43, "wm3 failed");
					} else {
						Node_Sub7.generateTimestamp((byte) 43, "wm3 succeeded");
						return;
					}
					return;
				}
				if (string.equalsIgnoreCase("tk0")) {
					Localization.method300(0, true, false);
					if ((Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791(false) ^ 0xffffffff) == -1) {
						Node_Sub7.generateTimestamp((byte) 43, "Entered tk0");
						Class213.aNode_Sub27_2512.method2690(102, 0, Class213.aNode_Sub27_2512.aClass320_Sub29_7291);
						Node_Sub38_Sub31.method2893(1);
						Class269.aBoolean3472 = false;
					} else {
						Node_Sub7.generateTimestamp((byte) 43, "Failed to enter tk0");
						return;
					}
					return;
				}
				if (string.equalsIgnoreCase("tk1")) {
					Localization.method300(1, true, false);
					if (Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791(false) == 1) {
						Node_Sub7.generateTimestamp((byte) 43, "Entered tk1");
						Class213.aNode_Sub27_2512.method2690(103, 1, Class213.aNode_Sub27_2512.aClass320_Sub29_7291);
						Node_Sub38_Sub31.method2893(1);
						Class269.aBoolean3472 = false;
					} else {
						Node_Sub7.generateTimestamp((byte) 43, "Failed to enter tk1");
						return;
					}
					return;
				}
				if (string.equalsIgnoreCase("tk2")) {
					Localization.method300(2, true, false);
					if (Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791(false) == 2) {
						Node_Sub7.generateTimestamp((byte) 43, "Entered tk2");
						Class213.aNode_Sub27_2512.method2690(104, 2, Class213.aNode_Sub27_2512.aClass320_Sub29_7291);
						Node_Sub38_Sub31.method2893(1);
						Class269.aBoolean3472 = false;
					} else {
						Node_Sub7.generateTimestamp((byte) 43, "Failed to enter tk2");
						return;
					}
					return;
				}
				if (string.equalsIgnoreCase("tk3")) {
					Localization.method300(3, true, false);
					if (Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791(false) != 3) {
						Node_Sub7.generateTimestamp((byte) 43, "Failed to enter tk3");
					} else {
						Node_Sub7.generateTimestamp((byte) 43, "Entered tk3");
						Class213.aNode_Sub27_2512.method2690(27, 3, Class213.aNode_Sub27_2512.aClass320_Sub29_7291);
						Node_Sub38_Sub31.method2893(1);
						Class269.aBoolean3472 = false;
						return;
					}
					return;
				}
				if (string.equalsIgnoreCase("tk5")) {
					Localization.method300(5, true, false);
					if (Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791(false) == 5) {
						Node_Sub7.generateTimestamp((byte) 43, "Entered tk5");
						Class213.aNode_Sub27_2512.method2690(127, 5, Class213.aNode_Sub27_2512.aClass320_Sub29_7291);
						Node_Sub38_Sub31.method2893(1);
						Class269.aBoolean3472 = false;
					} else {
						Node_Sub7.generateTimestamp((byte) 43, "Failed to enter tk5");
						return;
					}
					return;
				}
				if (string.startsWith("setba")) {
					if (string.length() < 6) {
						Node_Sub7.generateTimestamp((byte) 43, "Invalid buildarea value");
					} else {
						int i_18_ = Class350.method3998(string.substring(6), -1);
						if (i_18_ < 0 || (i_18_ ^ 0xffffffff) < (Class248.method3084(Class201.anInt2446, 128) ^ 0xffffffff)) {
							Node_Sub7.generateTimestamp((byte) 43, "Invalid buildarea value");
						} else {
							Class213.aNode_Sub27_2512.method2690(28, i_18_, Class213.aNode_Sub27_2512.aClass320_Sub5_7297);
							Node_Sub38_Sub31.method2893(1);
							Class269.aBoolean3472 = false;
							Node_Sub7.generateTimestamp((byte) 43, "maxbuildarea=" + Class213.aNode_Sub27_2512.aClass320_Sub5_7297.method3697(false));
							return;
						}
						return;
					}
					return;
				}
				if (string.startsWith("rect_debug")) {
					if ((string.length() ^ 0xffffffff) > -11) {
						Node_Sub7.generateTimestamp((byte) 43, "Invalid rect_debug value");
					} else {
						Class12.anInt193 = Class350.method3998(string.substring(10).trim(), -1);
						Node_Sub7.generateTimestamp((byte) 43, "rect_debug=" + Class12.anInt193);
						return;
					}
					return;
				}
				if (string.equalsIgnoreCase("qa_op_test")) {
					Class54.aBoolean817 = true;
					Node_Sub7.generateTimestamp((byte) 43, "qa_op_test=" + Class54.aBoolean817);
					return;
				}
				if (string.equalsIgnoreCase("clipcomponents")) {
					Class204.aBoolean2454 = !Class204.aBoolean2454;
					Node_Sub7.generateTimestamp((byte) 43, "clipcomponents=" + Class204.aBoolean2454);
					return;
				}
				if (string.startsWith("bloom")) {
					boolean bloomEnabled = Class93.aGraphicsToolkit1241.w();
					if (Node_Sub19.method2610((byte) -58, !bloomEnabled)) {
						if (bloomEnabled) {
							Node_Sub7.generateTimestamp((byte) 43, "Bloom disabled");
						} else {
							Node_Sub7.generateTimestamp((byte) 43, "Bloom enabled");
						}
					} else {
						Node_Sub7.generateTimestamp((byte) 43, "Failed to enable bloom");
						return;
					}
					return;
				}
				if (string.equalsIgnoreCase("tween")) {
					if (!Class320_Sub12.forceTweening) {
						Class320_Sub12.forceTweening = true;
						Node_Sub7.generateTimestamp((byte) 43, "Forced tweening ENABLED!");
					} else {
						Class320_Sub12.forceTweening = false;
						Node_Sub7.generateTimestamp((byte) 43, "Forced tweening disabled.");
						return;
					}
					return;
				}
				if (string.equalsIgnoreCase("shiftclick")) {
					if (Class116.shiftClickEnabled) {
						Node_Sub7.generateTimestamp((byte) 43, "Shift-click disabled.");
						Class116.shiftClickEnabled = false;
					} else {
						Node_Sub7.generateTimestamp((byte) 43, "Shift-click ENABLED!");
						Class116.shiftClickEnabled = true;
						return;
					}
					return;
				}
				if (string.equalsIgnoreCase("getcgcoord")) {
					//tele
					Node_Sub7.generateTimestamp((byte) 43, "x:" + (Class295.aPlayer3692.anInt5934 >> 9) + " z:" + (Class295.aPlayer3692.anInt5940 >> 9));
					return;
				}
				if (string.equalsIgnoreCase("getheight")) {
					Node_Sub7.generateTimestamp((byte) 43, "Height: " + Class320_Sub10.aPlaneArray8300[Class295.aPlayer3692.aByte5933].method3251(Class295.aPlayer3692.anInt5940 >> 9, Class295.aPlayer3692.anInt5934 >> 9, (byte) -118));
					return;
				}
				if (string.equalsIgnoreCase("resetminimap")) {
					Node_Sub38_Sub39.aClass302_10500.method3523((byte) -46);
					Node_Sub38_Sub39.aClass302_10500.method3521((byte) -18);
					Node_Sub54.aClass338_7671.method3908(-32478);
					Class304.aClass215_3834.method2071(7);
					Node_Sub18.method2606(126);
					Node_Sub7.generateTimestamp((byte) 43, "Minimap reset");
					return;
				}
				if (string.startsWith("mc")) {
					if (Class93.aGraphicsToolkit1241.s()) {
						int i_20_ = Integer.parseInt(string.substring(3));
						if ((i_20_ ^ 0xffffffff) <= -2) {
							if ((i_20_ ^ 0xffffffff) < -5) {
								i_20_ = 4;
							}
						} else {
							i_20_ = 1;
						}
						Class244.rendererCores = i_20_;
						Class243.method3061(7);
						Node_Sub7.generateTimestamp((byte) 43, "Render cores now: " + Class244.rendererCores);
					} else {
						Node_Sub7.generateTimestamp((byte) 43, "Current toolkit doesn't support multiple cores");
						return;
					}
					return;
				}
				if (string.startsWith("cachespace")) {
					Node_Sub7.generateTimestamp((byte) 43, "I(s): " + Class252.aClass61_3190.method595(1188) + "/" + Class252.aClass61_3190.method597(22349));
					Node_Sub7.generateTimestamp((byte) 43, "I(m): " + Class166.aClass61_5097.method595(1188) + "/" + Class166.aClass61_5097.method597(22349));
					Node_Sub7.generateTimestamp((byte) 43, "O(s): " + EntityNode_Sub3_Sub1.aClass86_9166.aClass12_1179.method201(48) + "/" + EntityNode_Sub3_Sub1.aClass86_9166.aClass12_1179.method200(0));
					return;
				}
				if (string.equals("renderprofile") || string.equals("rp")) {
					Class186.aBoolean2259 = !Class186.aBoolean2259;
					Class93.aGraphicsToolkit1241.b(Class186.aBoolean2259);
					Class64.method712(25053);
					Node_Sub7.generateTimestamp((byte) 43, "showprofiling=" + Class186.aBoolean2259);
					return;
				}
				if (string.startsWith("performancetest")) {
					int i_21_ = -1;
					int i_22_ = 1000;
					if (string.length() > 15) {
						String[] strings = Class106.method1120((byte) -128, string, ' ');
						try {
							if ((strings.length ^ 0xffffffff) < -2) {
								i_22_ = Integer.parseInt(strings[1]);
							}
						} catch (Throwable throwable) {
							/* empty */
						}
						try {
							if (strings.length > 2) {
								i_21_ = Integer.parseInt(strings[2]);
							}
						} catch (Throwable throwable) {
							/* empty */
						}
					}
					if ((i_21_ ^ 0xffffffff) != 0) {
						Node_Sub7.generateTimestamp((byte) 43, "Performance: " + Class194.method1961(i_22_, i_21_, 13968));
					} else {
						Node_Sub7.generateTimestamp((byte) 43, "Java toolkit: " + Class194.method1961(i_22_, 0, 13968));
						Node_Sub7.generateTimestamp((byte) 43, "SSE toolkit:  " + Class194.method1961(i_22_, 2, 13968));
						Node_Sub7.generateTimestamp((byte) 43, "D3D toolkit:  " + Class194.method1961(i_22_, 3, 13968));
						Node_Sub7.generateTimestamp((byte) 43, "GL toolkit:   " + Class194.method1961(i_22_, 1, 13968));
						Node_Sub7.generateTimestamp((byte) 43, "GLX toolkit:  " + Class194.method1961(i_22_, 5, 13968));
						return;
					}
					return;
				}
				if (string.equals("nonpcs")) {
					Node_Sub29.areNpcsHidden = !Node_Sub29.areNpcsHidden;
					Node_Sub7.generateTimestamp((byte) 43, "nonpcs=" + Node_Sub29.areNpcsHidden);
					return;
				}
				if (string.equals("autoworld")) {
					EntityNode.method802(2126);
					Node_Sub7.generateTimestamp((byte) 43, "auto world selected");
					return;
				}
				if (string.startsWith("switchworld")) {
					int i_23_ = Integer.parseInt(string.substring(12));
					Class188_Sub1_Sub2.method1899(i_23_, (byte) 27, Class327.method3823(100, i_23_).aString8773);
					Node_Sub7.generateTimestamp((byte) 43, "switched");
					return;
				}
				if (string.equals("getworld")) {
					Node_Sub7.generateTimestamp((byte) 43, "w: " + Class181.aClass197_2155.worldId);
					return;
				}
				if (string.startsWith("pc")) {
					Class123 class123 = Class262_Sub23.method3213((byte) -60);
					Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class133.aClass318_1687, class123.anIsaacCipher1571);
					node_sub13.aPacket7113.method2226(0, false);
					int i_24_ = node_sub13.aPacket7113.bufferLength;
					int i_25_ = string.indexOf(" ", 4);
					node_sub13.aPacket7113.method2228(string.substring(3, i_25_), 64);
					Class194_Sub3.method1975(69, node_sub13.aPacket7113, string.substring(i_25_));
					node_sub13.aPacket7113.method2217(-i_24_ + node_sub13.aPacket7113.bufferLength, (byte) -128);
					class123.method1514(126, node_sub13);
					return;
				}
				if (string.equals("savevarcs")) {
					Class144.method1631((byte) 125);
					Node_Sub7.generateTimestamp((byte) 43, "perm varcs saved");
					return;
				}
				if (string.equals("scramblevarcs")) {
					for (int i_26_ = 0; i_26_ < Class320_Sub22.anIntArray8417.length; i_26_++) {
						if (FileOnDisk.aBooleanArray1332[i_26_]) {
							Class320_Sub22.anIntArray8417[i_26_] = (int) (99999.0 * Math.random());
							if (Math.random() > 0.5) {
								Class320_Sub22.anIntArray8417[i_26_] *= -1;
							}
						}
					}
					Class144.method1631((byte) 118);
					Node_Sub7.generateTimestamp((byte) 43, "perm varcs scrambled");
					return;
				}
				if (string.equals("showcolmap")) {
					Class320_Sub3.aBoolean8235 = true;
					Node_Sub18.method2606(126);
					Node_Sub7.generateTimestamp((byte) 43, "colmap is shown");
					return;
				}
				if (string.equals("hidecolmap")) {
					Class320_Sub3.aBoolean8235 = false;
					Node_Sub18.method2606(126);
					Node_Sub7.generateTimestamp((byte) 43, "colmap is hidden");
					return;
				}
				if (string.equals("resetcache")) {
					Node_Sub36_Sub2.method2761((byte) 125);
					Node_Sub7.generateTimestamp((byte) 43, "Caches reset");
					return;
				}
				if (string.equals("profilecpu")) {
					Node_Sub7.generateTimestamp((byte) 43, String.valueOf(CacheNode_Sub4.method2302((byte) 88)) + "ms");
					return;
				}
				if (string.startsWith("getclientvarpbit")) {
					int i_27_ = Integer.parseInt(string.substring(17));
					Node_Sub7.generateTimestamp((byte) 43, "varpbit=" + Class24.aClass275_442.method64(i_27_, (byte) -42));
					return;
				}
				if (string.startsWith("getclientvarp")) {
					int i_28_ = Integer.parseInt(string.substring(14));
					Node_Sub7.generateTimestamp((byte) 43, "varp=" + Class24.aClass275_442.method65(i_28_, 107));
					return;
				}
				if (string.startsWith("directlogin")) {
					String[] strings = Class106.method1120((byte) 115, string.substring(12), ' ');
					if (strings.length >= 2) {
						int i_29_ = (strings.length ^ 0xffffffff) < -3 ? Integer.parseInt(strings[2]) : 0;
						Class39.method415(i_29_, strings[1], strings[0], 106);
						return;
					}
				}
				if (string.startsWith("snlogin ")) {
					String[] strings = Class106.method1120((byte) -110, string.substring(8), ' ');
					int i_30_ = Integer.parseInt(strings[0]);
					int i_31_ = strings.length == 2 ? Integer.parseInt(strings[1]) : 0;
					Animable.method822(i_30_, i_31_, 4);
					return;
				}
				if (string.startsWith("csprofileclear")) {
					Class305.method3564();
					return;
				}
				if (string.startsWith("csprofileoutputc")) {
					Class305.method3554(100, false);
					return;
				}
				if (string.startsWith("csprofileoutputt")) {
					Class305.method3554(10, true);
					return;
				}
				if (string.startsWith("texsize")) {
					int i_32_ = Integer.parseInt(string.substring(8));
					Class93.aGraphicsToolkit1241.f(i_32_);
					return;
				}
				if (string.equals("soundstreamcount")) {
					Node_Sub7.generateTimestamp((byte) 43, "Active streams: " + Class176.aNode_Sub9_Sub3_2106.method2512());
					return;
				}
				if (string.equals("autosetup")) {
					Node_Sub41.method2931((byte) -103);
					Node_Sub7.generateTimestamp((byte) 43, "Complete. Toolkit now: " + Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791(false));
					return;
				}
				if (string.equals("errormessage")) {
					Node_Sub7.generateTimestamp((byte) 43, Class158.aClient1983.method100(10));
					return;
				}
				if (string.equals("heapdump")) {
					if (!SignLink.osName.startsWith("win")) {
						AbstractToolkit.method1272(0, new File("/tmp/heap.dump"), false);
					} else {
						AbstractToolkit.method1272(0, new File("C:\\Temp\\heap.dump"), false);
					}
					Node_Sub7.generateTimestamp((byte) 43, "Done");
					return;
				}
				if (string.equals("os")) {
					Node_Sub7.generateTimestamp((byte) 43, "Name: " + SignLink.osName);
					Node_Sub7.generateTimestamp((byte) 43, "Arch: " + SignLink.osArchitecture);
					Node_Sub7.generateTimestamp((byte) 43, "Ver: " + SignLink.osVersion);
					return;
				}
				if (string.startsWith("w2debug")) {
					int i_33_ = Integer.parseInt(string.substring(8, 9));
					Node_Sub9_Sub5.anInt9766 = i_33_;
					Class243.method3061(7);
					Node_Sub7.generateTimestamp((byte) 43, "Toggled!");
					return;
				}
				if (string.startsWith("ortho ")) {
					int i_34_ = string.indexOf(' ');
					if ((i_34_ ^ 0xffffffff) > -1) {
						Node_Sub7.generateTimestamp((byte) 43, "Syntax: ortho <n>");
					} else {
						int i_35_ = Class350.method3998(string.substring(i_34_ + 1), -1);
						Class213.aNode_Sub27_2512.method2690(119, i_35_, Class213.aNode_Sub27_2512.aClass320_Sub3_7298);
						Node_Sub38_Sub31.method2893(1);
						Class269.aBoolean3472 = false;
						Class34_Sub1.method378(-4);
						if (i_35_ != Class213.aNode_Sub27_2512.aClass320_Sub3_7298.method3691(false)) {
							Node_Sub7.generateTimestamp((byte) 43, "Failed to change ortho mode");
						} else {
							Node_Sub7.generateTimestamp((byte) 43, "Successfully changed ortho mode");
							return;
						}
						return;
					}
					return;
				}
				if (string.startsWith("orthozoom ")) {
					if ((Class213.aNode_Sub27_2512.aClass320_Sub3_7298.method3691(false) ^ 0xffffffff) == -1) {
						Node_Sub7.generateTimestamp((byte) 43, "enable ortho mode first (use 'ortho <n>')");
					} else {
						int i_36_ = Class350.method3998(string.substring(1 + string.indexOf(' ')), -1);
						Class308.anInt3916 = i_36_;
						Node_Sub7.generateTimestamp((byte) 43, "orthozoom=" + Class308.anInt3916);
						return;
					}
					return;
				}
				if (string.startsWith("orthotilesize ")) {
					int i_37_ = Class350.method3998(string.substring(1 + string.indexOf(' ')), -1);
					Localization.anInt432 = Node_Sub36_Sub1.anInt10039 = i_37_;
					Node_Sub7.generateTimestamp((byte) 43, "ortho tile size=" + i_37_);
					Class34_Sub1.method378(-4);
					return;
				}
				if (string.equals("orthocamlock")) {
					Class336_Sub2.aBoolean8588 = !Class336_Sub2.aBoolean8588;
					Node_Sub7.generateTimestamp((byte) 43, "ortho camera lock is " + (Class336_Sub2.aBoolean8588 ? "on" : "off"));
					return;
				}
				if (string.startsWith("skydetail ")) {
					int i_38_ = Class350.method3998(string.substring(string.indexOf(' ') - -1), -1);
					Class213.aNode_Sub27_2512.method2690(36, i_38_, Class213.aNode_Sub27_2512.aClass320_Sub2_7272);
					Node_Sub7.generateTimestamp((byte) 43, "skydetail is " + (Class213.aNode_Sub27_2512.aClass320_Sub2_7272.method3686(false) != 0 ? "high" : "low"));
					return;
				}
				if (string.startsWith("setoutput ")) {
					File file = new File(string.substring(10));
					if (file.exists()) {
						file = new File(string.substring(10) + "." + Class313.method3650(false) + ".log");
						if (file.exists()) {
							Node_Sub7.generateTimestamp((byte) 43, "file already exists!");
							return;
						}
					}
					if (Class270_Sub1.aFileOutputStream8027 != null) {
						Class270_Sub1.aFileOutputStream8027.close();
						Class270_Sub1.aFileOutputStream8027 = null;
					}
					try {
						Class270_Sub1.aFileOutputStream8027 = new FileOutputStream(file);
					} catch (java.io.FileNotFoundException filenotfoundexception) {
						Node_Sub7.generateTimestamp((byte) 43, "Could not create " + file.getName());
					} catch (SecurityException securityexception) {
						Node_Sub7.generateTimestamp((byte) 43, "Cannot write to " + file.getName());
					}
					return;
				}
				if (string.equals("closeoutput")) {
					if (Class270_Sub1.aFileOutputStream8027 != null) {
						Class270_Sub1.aFileOutputStream8027.close();
					}
					Class270_Sub1.aFileOutputStream8027 = null;
					return;
				}
				if (string.startsWith("runscript ")) {
					File file = new File(string.substring(10));
					if (!file.exists()) {
						Node_Sub7.generateTimestamp((byte) 43, "No such file");
						return;
					}
					byte[] bs = Class337.method3904((byte) 113, file);
					if (bs == null) {
						Node_Sub7.generateTimestamp((byte) 43, "Failed to read file");
						return;
					}
					String[] strings = Class106.method1120((byte) -57, Class197.method1998(Class329.method3835(bs, true), "", (byte) 26, '\r'), '\n');
					Class194.method1960(-32416, strings);
				}
				if (string.startsWith("zoom ")) {
					short s = (short) Class350.method3998(string.substring(5), -1);
					if (s > 0) {
						Class268.zoom = s;
					}
					return;
				}
				if (string.startsWith("cs2debug")) {
					if ((string.length() ^ 0xffffffff) >= -10 || (string.charAt(8) ^ 0xffffffff) != -33) {
						Class305.aString3870 = null;
						Class305.aBoolean3868 = !Class305.aBoolean3868;
						Node_Sub7.generateTimestamp((byte) 43, "cs2debug:" + Class305.aBoolean3868);
					} else {
						Class305.aString3870 = string.substring(9);
						Class305.aBoolean3868 = true;
						Node_Sub7.generateTimestamp((byte) 43, "cs2debug: (" + Class305.aString3870 + ")");
						return;
					}
					return;
				}
				if ((Class151.anInt1843 ^ 0xffffffff) == -12) {
					CacheNode_Sub6.anInt9483++;
					Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class247.aClass318_3130, Class218.worldResponseBuffer.anIsaacCipher1571);
					node_sub13.aPacket7113.method2226(3 + string.length(), false);
					node_sub13.aPacket7113.method2226(!bool ? 0 : 1, false);
					node_sub13.aPacket7113.method2226(bool_11_ ? 1 : 0, false);
					node_sub13.aPacket7113.method2228(string, 87);
					Class218.worldResponseBuffer.method1514(127, node_sub13);
				}
				if (string.startsWith("fps ") && Node_Sub38_Sub1.aClass329_10086 != Class240.aClass329_2943) {
					Class384.method4203(Class350.method3998(string.substring(4), -1), 0);
					return;
				}
			} catch (Exception exception) {
				Node_Sub7.generateTimestamp((byte) 43, Localization.commandError.getLocalizationString(-12273, Class35.clientLanguage));
				return;
			}
		}
		if (Class151.anInt1843 != 11) {
			Node_Sub7.generateTimestamp((byte) 43, Localization.unknownCommand.getLocalizationString(-12273, Class35.clientLanguage) + string);
		}
	}
}
