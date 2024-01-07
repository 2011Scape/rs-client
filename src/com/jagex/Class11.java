package com.jagex;
import java.awt.Frame;

import com.ms.awt.WComponentPeer;
import com.ms.com.IUnknown;
import com.ms.directX.DDSurfaceDesc;
import com.ms.directX.DirectDraw;
import com.ms.directX.IEnumModesCallback;
import com.ms.win32.User32;

public class Class11 implements IEnumModesCallback
{
	private static int anInt177;
	private DirectDraw aDirectDraw178 = new DirectDraw();
	private static int[] anIntArray179;
	public Class11() {
		aDirectDraw178.initialize(null);
	}
	
	final void method192(Frame frame, int i) {
		aDirectDraw178.restoreDisplayMode();
		aDirectDraw178.setCooperativeLevel((java.awt.Component) frame, i);
	}
	
	final int[] method193(int i) {
		aDirectDraw178.enumDisplayModes(0, null, null, this);
		anIntArray179 = new int[anInt177];
		anInt177 = 0;
		aDirectDraw178.enumDisplayModes(0, null, null, this);
		int[] is = anIntArray179;
		anIntArray179 = null;
		anInt177 = i;
		return is;
	}
	
	public final void method194(DDSurfaceDesc ddsurfacedesc, IUnknown iunknown) {
		if (anIntArray179 != null) {
			anIntArray179[anInt177++] = ddsurfacedesc.width;
			anIntArray179[anInt177++] = ddsurfacedesc.height;
			anIntArray179[anInt177++] = ddsurfacedesc.rgbBitCount;
			anIntArray179[anInt177++] = ddsurfacedesc.refreshRate;
		} else {
			anInt177 += 4;
		}
	}
}
