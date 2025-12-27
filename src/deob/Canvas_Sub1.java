package deob;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public class Canvas_Sub1 extends Canvas {

	public Component aComponent11;

	public static int[] anIntArray10;

	public Canvas_Sub1(Component arg0) {
		this.aComponent11 = arg0;
	}

	public final void update(Graphics arg0) {
		try {
			this.aComponent11.update(arg0);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "akk.update(" + ')');
		}
	}

	public final void paint(Graphics arg0) {
		try {
			this.aComponent11.paint(arg0);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "akk.paint(" + ')');
		}
	}
}
