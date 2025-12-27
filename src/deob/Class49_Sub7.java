package deob;

import jaggl.OpenGL;

public class Class49_Sub7 extends Class49 {

	public boolean aBoolean7077 = false;

	public Class36_Sub3[] aClass36_Sub3Array7089;

	public static int anInt7078 = 1;

	public static int anInt7079 = 24;

	public static float aFloat7080 = -12.0F;

	public static float aFloat7081 = 26.0F;

	public static int anInt7082 = 128;

	public static float aFloat7083 = 0.0F;

	public static char aChar7084 = 0;

	public static char aChar7085 = 1;

	public static int anInt7088 = 128;

	public Class33 aClass33_7086;

	public boolean aBoolean7087;

	public Class49_Sub7(Class_ra_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean8420) {
			byte[][] var2 = new byte[6][16384];
			byte[][] var3 = new byte[6][16384];
			byte[][] var4 = new byte[6][16384];
			int var5 = 0;
			Class260 var6 = new Class260(0.0F, -1.0F, 0.0F);
			for (int var7 = 0; var7 < 128; var7++) {
				for (int var8 = 0; var8 < 128; var8++) {
					float var9 = (float) var8 * 2.0F / 128.0F - 1.0F;
					float var10 = (float) var7 * 2.0F / 128.0F - 1.0F;
					float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + 1.0F + var10 * var10)));
					float var18 = var9 * var11;
					float var19 = var10 * var11;
					for (int var12 = 0; var12 < 6; var12++) {
						Class260 var13;
						if (var12 == 0) {
							var13 = new Class260(-var11, -var18, var19);
						} else if (var12 == 1) {
							var13 = new Class260(var11, var18, var19);
						} else if (var12 == 2) {
							var13 = new Class260(-var18, var19, -var11);
						} else if (var12 == 3) {
							var13 = new Class260(-var18, -var19, var11);
						} else if (var12 == 4) {
							var13 = new Class260(var18, var11, -var19);
						} else {
							var13 = new Class260(var18, -var11, var19);
						}
						float var14 = var13.method2576(var6);
						float var20 = Math.max(0.0F, Math.min(1.0F, var14));
						int var15;
						int var16;
						int var17;
						if (var20 > 0.0F) {
							var17 = Math.min(255, (int) (Math.pow((double) var20, 128.0D) * 400.0D));
							var16 = Math.min(255, (int) (Math.pow((double) var20, 24.0D) * 400.0D));
							var15 = Math.min(255, (int) (Math.pow((double) var20, 5.0D) * 400.0D));
						} else {
							var15 = 0;
							var16 = 0;
							var17 = 0;
						}
						var3[var12][var5] = (byte) var17;
						var4[var12][var5] = (byte) var16;
						var2[var12][var5] = (byte) var15;
					}
					var5++;
				}
			}
			this.aClass36_Sub3Array7089 = new Class36_Sub3[3];
			this.aClass36_Sub3Array7089[0] = new Class36_Sub3(this.aClass_ra_Sub1_478, Class72.aClass72_611, Class86.aClass86_714, 128, false, var3, Class72.aClass72_611);
			this.aClass36_Sub3Array7089[1] = new Class36_Sub3(this.aClass_ra_Sub1_478, Class72.aClass72_611, Class86.aClass86_714, 128, false, var4, Class72.aClass72_611);
			this.aClass36_Sub3Array7089[2] = new Class36_Sub3(this.aClass_ra_Sub1_478, Class72.aClass72_611, Class86.aClass86_714, 128, false, var2, Class72.aClass72_611);
			this.method626();
		}
	}

	public void method607(boolean arg0) {
		this.aClass_ra_Sub1_478.method4831(8448, 7681);
	}

	public boolean method601() {
		return true;
	}

	public void method604() {
		if (this.aBoolean7077) {
			if (!this.aBoolean7087) {
				this.aClass_ra_Sub1_478.method4843(2);
				this.aClass_ra_Sub1_478.method4844(null);
			}
			this.aClass_ra_Sub1_478.method4843(1);
			this.aClass_ra_Sub1_478.method4844(null);
			this.aClass_ra_Sub1_478.method4843(0);
			this.aClass33_7086.method503('\u0001');
			this.aBoolean7077 = false;
		} else {
			this.aClass_ra_Sub1_478.method4848(0, 5890, 770);
		}
		this.aClass_ra_Sub1_478.method4831(8448, 8448);
	}

	public void method618(int arg0, int arg1) {
		if (this.aBoolean7077) {
			this.aClass_ra_Sub1_478.method4843(1);
			this.aClass_ra_Sub1_478.method4844(this.aClass36_Sub3Array7089[arg0 - 1]);
			this.aClass_ra_Sub1_478.method4843(0);
		}
	}

	public void method603() {
		if (this.aBoolean7077) {
			if (!this.aBoolean7087) {
				this.aClass_ra_Sub1_478.method4843(2);
				this.aClass_ra_Sub1_478.method4844(null);
			}
			this.aClass_ra_Sub1_478.method4843(1);
			this.aClass_ra_Sub1_478.method4844(null);
			this.aClass_ra_Sub1_478.method4843(0);
			this.aClass33_7086.method503('\u0001');
			this.aBoolean7077 = false;
		} else {
			this.aClass_ra_Sub1_478.method4848(0, 5890, 770);
		}
		this.aClass_ra_Sub1_478.method4831(8448, 8448);
	}

	public void method608(boolean arg0) {
		this.aClass_ra_Sub1_478.method4831(8448, 7681);
	}

	public void method606(int arg0, int arg1) {
		if (this.aBoolean7077) {
			this.aClass_ra_Sub1_478.method4843(1);
			this.aClass_ra_Sub1_478.method4844(this.aClass36_Sub3Array7089[arg0 - 1]);
			this.aClass_ra_Sub1_478.method4843(0);
		}
	}

	public void method600(Class36 arg0, int arg1) {
		this.aClass_ra_Sub1_478.method4844(arg0);
		this.aClass_ra_Sub1_478.method4836(arg1);
	}

	public boolean method605() {
		return true;
	}

	public boolean method611() {
		return true;
	}

	public void method612(boolean arg0) {
		this.aClass_ra_Sub1_478.method4831(8448, 7681);
	}

	public void method610(boolean arg0) {
		this.aClass_ra_Sub1_478.method4831(8448, 7681);
	}

	public void method602(boolean arg0) {
		if (this.aClass33_7086 == null || !arg0) {
			this.aClass_ra_Sub1_478.method4848(0, 34168, 770);
			return;
		}
		if (!this.aBoolean7087) {
			this.aClass_ra_Sub1_478.method4843(2);
			this.aClass_ra_Sub1_478.method4844(this.aClass_ra_Sub1_478.aClass36_Sub1_8400);
			this.aClass_ra_Sub1_478.method4843(0);
		}
		this.aClass33_7086.method503('\u0000');
		this.aBoolean7077 = true;
	}

	public void method616(Class36 arg0, int arg1) {
		this.aClass_ra_Sub1_478.method4844(arg0);
		this.aClass_ra_Sub1_478.method4836(arg1);
	}

	public void method614() {
		if (this.aBoolean7077) {
			if (!this.aBoolean7087) {
				this.aClass_ra_Sub1_478.method4843(2);
				this.aClass_ra_Sub1_478.method4844(null);
			}
			this.aClass_ra_Sub1_478.method4843(1);
			this.aClass_ra_Sub1_478.method4844(null);
			this.aClass_ra_Sub1_478.method4843(0);
			this.aClass33_7086.method503('\u0001');
			this.aBoolean7077 = false;
		} else {
			this.aClass_ra_Sub1_478.method4848(0, 5890, 770);
		}
		this.aClass_ra_Sub1_478.method4831(8448, 8448);
	}

	public void method613() {
		if (this.aBoolean7077) {
			if (!this.aBoolean7087) {
				this.aClass_ra_Sub1_478.method4843(2);
				this.aClass_ra_Sub1_478.method4844(null);
			}
			this.aClass_ra_Sub1_478.method4843(1);
			this.aClass_ra_Sub1_478.method4844(null);
			this.aClass_ra_Sub1_478.method4843(0);
			this.aClass33_7086.method503('\u0001');
			this.aBoolean7077 = false;
		} else {
			this.aClass_ra_Sub1_478.method4848(0, 5890, 770);
		}
		this.aClass_ra_Sub1_478.method4831(8448, 8448);
	}

	public void method615(Class36 arg0, int arg1) {
		this.aClass_ra_Sub1_478.method4844(arg0);
		this.aClass_ra_Sub1_478.method4836(arg1);
	}

	public void method626() {
		this.aClass33_7086 = new Class33(this.aClass_ra_Sub1_478, 2);
		this.aClass33_7086.method504(0);
		this.aClass_ra_Sub1_478.method4843(1);
		OpenGL.glTexGeni(8192, 9472, 34065);
		OpenGL.glTexGeni(8193, 9472, 34065);
		OpenGL.glTexGeni(8194, 9472, 34065);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glEnable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(26.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glRotatef(-12.0F, 0.0F, 1.0F, 0.0F);
		OpenGL.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean7087) {
			this.aClass_ra_Sub1_478.method4831(260, 7681);
			this.aClass_ra_Sub1_478.method4847(0, 5890, 770);
			this.aClass_ra_Sub1_478.method4848(0, 34167, 770);
		} else {
			this.aClass_ra_Sub1_478.method4831(7681, 8448);
			this.aClass_ra_Sub1_478.method4847(0, 34168, 768);
			this.aClass_ra_Sub1_478.method4843(2);
			this.aClass_ra_Sub1_478.method4831(260, 7681);
			this.aClass_ra_Sub1_478.method4847(0, 34168, 768);
			this.aClass_ra_Sub1_478.method4847(1, 34168, 770);
			this.aClass_ra_Sub1_478.method4848(0, 34167, 770);
		}
		this.aClass_ra_Sub1_478.method4843(0);
		this.aClass33_7086.method502();
		this.aClass33_7086.method504(1);
		this.aClass_ra_Sub1_478.method4843(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean7087) {
			this.aClass_ra_Sub1_478.method4831(8448, 8448);
			this.aClass_ra_Sub1_478.method4847(0, 5890, 768);
			this.aClass_ra_Sub1_478.method4848(0, 5890, 770);
		} else {
			this.aClass_ra_Sub1_478.method4831(8448, 8448);
			this.aClass_ra_Sub1_478.method4847(0, 5890, 768);
			this.aClass_ra_Sub1_478.method4843(2);
			this.aClass_ra_Sub1_478.method4831(8448, 8448);
			this.aClass_ra_Sub1_478.method4847(0, 5890, 768);
			this.aClass_ra_Sub1_478.method4847(1, 34168, 768);
			this.aClass_ra_Sub1_478.method4848(0, 5890, 770);
		}
		this.aClass_ra_Sub1_478.method4843(0);
		this.aClass33_7086.method502();
	}

	public void method609(boolean arg0) {
		if (this.aClass33_7086 == null || !arg0) {
			this.aClass_ra_Sub1_478.method4848(0, 34168, 770);
			return;
		}
		if (!this.aBoolean7087) {
			this.aClass_ra_Sub1_478.method4843(2);
			this.aClass_ra_Sub1_478.method4844(this.aClass_ra_Sub1_478.aClass36_Sub1_8400);
			this.aClass_ra_Sub1_478.method4843(0);
		}
		this.aClass33_7086.method503('\u0000');
		this.aBoolean7077 = true;
	}

	public void method617(int arg0, int arg1) {
		if (this.aBoolean7077) {
			this.aClass_ra_Sub1_478.method4843(1);
			this.aClass_ra_Sub1_478.method4844(this.aClass36_Sub3Array7089[arg0 - 1]);
			this.aClass_ra_Sub1_478.method4843(0);
		}
	}

	public void method619(int arg0, int arg1) {
		if (this.aBoolean7077) {
			this.aClass_ra_Sub1_478.method4843(1);
			this.aClass_ra_Sub1_478.method4844(this.aClass36_Sub3Array7089[arg0 - 1]);
			this.aClass_ra_Sub1_478.method4843(0);
		}
	}

	public void method620(int arg0, int arg1) {
		if (this.aBoolean7077) {
			this.aClass_ra_Sub1_478.method4843(1);
			this.aClass_ra_Sub1_478.method4844(this.aClass36_Sub3Array7089[arg0 - 1]);
			this.aClass_ra_Sub1_478.method4843(0);
		}
	}

	public void method621(int arg0, int arg1) {
		if (this.aBoolean7077) {
			this.aClass_ra_Sub1_478.method4843(1);
			this.aClass_ra_Sub1_478.method4844(this.aClass36_Sub3Array7089[arg0 - 1]);
			this.aClass_ra_Sub1_478.method4843(0);
		}
	}
}
