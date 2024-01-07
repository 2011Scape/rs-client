package com.jagex;
import java.awt.Canvas;

public class Class306
{
	static GraphicsToolkit initD3D(Class302 class302, int i, d var_d, Canvas canvas) {
		GraphicsToolkit graphicstoolkit;

		try {
			if (!Class352.method4012(71)) {
				throw new RuntimeException("");
			}

			if (!Node_Sub38_Sub2.method2793(1, "jagdx")) {
				throw new RuntimeException("");
			}

			graphicstoolkit = D3DToolkit.createToolkit(canvas, var_d, class302, i);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			throw new RuntimeException("");
		}

		return graphicstoolkit;
	}
}
