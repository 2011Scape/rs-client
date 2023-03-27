package com.jagex;
import java.lang.reflect.Method;

public class Class306
{
	static final GraphicsToolkit method3566(Class302 class302, int i, int i_0_, d var_d, java.awt.Canvas canvas) {
		GraphicsToolkit graphicstoolkit;
		try {
			if (!Class352.method4012(71)) {
				throw new RuntimeException("");
			}
			if (!Node_Sub38_Sub2.method2793(1, "jagdx")) {
				throw new RuntimeException("");
			}
			Class var_class = Class.forName("kea");
			int i_1_ = -80 % ((-68 - i_0_) / 51);
			Method method = var_class.getDeclaredMethod("createToolkit", new Class[] { Class.forName("java.awt.Canvas"), Class.forName("com.jagex.d"), Class.forName("com.jagex.Class302"), Class.forName("java.lang.Integer") });
			graphicstoolkit = (GraphicsToolkit) method.invoke(null, new Object[] { canvas, var_d, class302, new Integer(i) });
		} catch (Throwable throwable) {
			throw new RuntimeException("");
		}
		return graphicstoolkit;
	}
}
