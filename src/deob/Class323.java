package deob;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;

public class Class323 {

	public Robot aRobot3298 = new Robot();

	public void method3179(Component arg0, int[] arg1, int arg2, int arg3, Point arg4) {
		try {
			if (arg1 == null) {
				arg0.setCursor(null);
			} else {
				BufferedImage var6 = new BufferedImage(arg2, arg3, 2);
				var6.setRGB(0, 0, arg2, arg3, arg1, 0, arg2);
				arg0.setCursor(arg0.getToolkit().createCustomCursor(var6, arg4, null));
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "nl.setcustomcursor(" + ')');
		}
	}

	public Class323() throws Exception {
	}

	public void method3180(int arg0, int arg1) {
		try {
			this.aRobot3298.mouseMove(arg0, arg1);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "nl.movemouse(" + ')');
		}
	}
}
