package com.jagex;
import java.awt.Component;

import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;

public class Callback_Sub1 extends Callback
{
	private volatile int anInt1;
	private volatile int anInt2;
	private volatile boolean aBoolean3 = true;
	private int anInt4;
	private boolean aBoolean5;
	
	final synchronized int method80(int i, int i_0_, int i_1_, int i_2_) {
		if (anInt2 != i) {
			int i_3_ = User32.GetWindowLong(i, -4);
			return User32.CallWindowProc(i_3_, i, i_0_, i_1_, i_2_);
		}
		if ((i_0_ ^ 0xffffffff) == -33) {
			int i_4_ = i_2_ & 0xffff;
			if ((i_4_ ^ 0xffffffff) == -2) {
				User32.SetCursor(aBoolean3 ? anInt4 : 0);
				return 0;
			}
		}
		if (i_0_ == 101024) {
			User32.SetCursor(aBoolean3 ? anInt4 : 0);
			return 0;
		}
		if ((i_0_ ^ 0xffffffff) == -2) {
			anInt2 = 0;
			aBoolean3 = true;
		}
		return User32.CallWindowProc(anInt1, i, i_0_, i_1_, i_2_);
	}
	
	final void method81(int i, int i_5_, int i_6_) {
		if (i_5_ == -33) {
			User32.SetCursorPos(i, i_6_);
		}
	}

	Callback_Sub1() {
		/* empty */
	}
}
