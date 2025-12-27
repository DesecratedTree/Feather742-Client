package deob;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;

public class Class8 {

	public static String aString129 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ";

	public static int anInt130 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".length();

	public static int[] anIntArray135 = new int[256];

	public boolean aBoolean132 = false;

	public int[] anIntArray131 = new int[4];

	public Class61[] aClass61Array133;

	public int[] anIntArray134;

	public int anInt136;

	public int anInt137;

	static {
		for (int var0 = 0; var0 < 256; var0++) {
			int var1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".indexOf(var0);
			if (var1 == -1) {
				var1 = 74;
			}
			anIntArray135[var0] = var1;
		}
	}

	public Class8(Class_ra arg0, int arg1, boolean arg2, Component arg3) {
		this.aBoolean132 = false;
		this.aClass61Array133 = new Class61[256];
		this.anIntArray134 = new int[256];
		Font var5 = new Font("Helvetica", arg2 ? 1 : 0, arg1);
		FontMetrics var6 = arg3.getFontMetrics(var5);
		int var7;
		for (var7 = 0; var7 < anInt130; var7++) {
			this.method416(arg0, var5, var6, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var7), var7, false);
		}
		if (arg2 && this.aBoolean132) {
			this.aBoolean132 = false;
			var5 = new Font("Helvetica", 0, arg1);
			var6 = arg3.getFontMetrics(var5);
			for (var7 = 0; var7 < anInt130; var7++) {
				this.method416(arg0, var5, var6, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var7), var7, false);
			}
			if (!this.aBoolean132) {
				this.aBoolean132 = false;
				for (var7 = 0; var7 < anInt130; var7++) {
					this.method416(arg0, var5, var6, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var7), var7, true);
				}
			}
		}
	}

	public int method415() {
		return this.anInt137;
	}

	public void method416(Class_ra arg0, Font arg1, FontMetrics arg2, char arg3, int arg4, boolean arg5) {
		int var7 = arg2.charWidth(arg3);
		int var8 = var7;
		if (arg5) {
			try {
				if (arg3 == '/') {
					arg5 = false;
				}
				if (arg3 == 'f' || arg3 == 't' || arg3 == 'w' || arg3 == 'v' || arg3 == 'k' || arg3 == 'x' || arg3 == 'y' || arg3 == 'A' || arg3 == 'V' || arg3 == 'W') {
					var7++;
				}
			} catch (Exception var22) {
			}
		}
		int var9 = arg2.getMaxAscent();
		int var10 = arg2.getMaxAscent() + arg2.getMaxDescent();
		int var11 = arg2.getHeight();
		Image var12 = Class475.aCanvas5700.createImage(var7, var10);
		Graphics var13 = var12.getGraphics();
		var13.setColor(Color.black);
		var13.fillRect(0, 0, var7, var10);
		var13.setColor(Color.white);
		var13.setFont(arg1);
		var13.drawString(arg3 + "", 0, var9);
		if (arg5) {
			var13.drawString(arg3 + "", 1, var9);
		}
		int[] var14 = new int[var7 * var10];
		PixelGrabber var15 = new PixelGrabber(var12, 0, 0, var7, var10, var14, 0, var7);
		try {
			var15.grabPixels();
		} catch (Exception var21) {
		}
		var12.flush();
		Object var16 = null;
		int var17 = 0;
		int var18;
		label64: for (var18 = 0; var18 < var10; var18++) {
			for (int var19 = 0; var19 < var7; var19++) {
				int var20 = var14[var19 + var18 * var7];
				if ((var20 & 0xFFFFFF) != 0) {
					var17 = var18;
					break label64;
				}
			}
		}
		for (var18 = 0; var18 < var14.length; var18++) {
			if ((var14[var18] & 0xFFFFFF) == 0) {
				var14[var18] = 0;
			}
		}
		this.anInt137 = var9 - var17;
		this.anInt136 = var11;
		this.anIntArray134[arg4] = var8;
		this.aClass61Array133[arg4] = arg0.method4795(var14, 0, var7, var7, var10, (byte) -96);
	}

	public int method417(String arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			int var4 = anIntArray135[arg0.charAt(var3)];
			var2 += this.anIntArray134[var4];
		}
		return var2;
	}

	public void method418(Class_ra arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = this.method417(arg1) / 2;
		arg0.qa(this.anIntArray131);
		if (arg2 - var7 <= this.anIntArray131[2] && arg2 + var7 >= this.anIntArray131[0] && arg3 - this.anInt137 <= this.anIntArray131[3] && arg3 + this.anInt136 >= this.anIntArray131[1]) {
			this.method419(arg0, arg1, this.anIntArray131, arg2 - var7, arg3, arg4, arg5);
		}
	}

	public void method419(Class_ra arg0, String arg1, int[] arg2, int arg3, int arg4, int arg5, boolean arg6) {
		if (arg5 == 0) {
			arg6 = false;
		}
		int var10 = arg5 | 0xFF000000;
		for (int var8 = 0; var8 < arg1.length(); var8++) {
			int var9 = anIntArray135[arg1.charAt(var8)];
			if (arg6) {
				this.aClass61Array133[var9].method688(arg3 + 1, arg4 + 1, 0, -16777216, 1);
			}
			this.aClass61Array133[var9].method688(arg3, arg4, 0, var10, 1);
			arg3 += this.anIntArray134[var9];
		}
	}

	public int method420() {
		return this.anInt136 - 1;
	}
}
