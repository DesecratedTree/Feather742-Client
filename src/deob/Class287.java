package deob;

import jaggl.OpenGL;

public abstract class Class287 implements Interface11 {

	public static int anInt6547 = 0;

	public static int anInt6549 = 1;

	public static int anInt6552 = 3553;

	public static int anInt6553 = 1;

	public static int anInt6556 = 1;

	public static int[] anIntArray6558 = new int[1];

	public Class189 aClass189_6557 = Class189.aClass189_1856;

	public Class_ra_Sub2_Sub1 aClass_ra_Sub2_Sub1_6550;

	public int anInt6554;

	public Class72 aClass72_6546;

	public Class86 aClass86_6545;

	public boolean aBoolean6555;

	public int anInt6548;

	public int anInt6551;

	public Class287(Class_ra_Sub2_Sub1 arg0, int arg1, Class72 arg2, Class86 arg3, int arg4, boolean arg5) {
		this.aClass_ra_Sub2_Sub1_6550 = arg0;
		this.anInt6554 = arg1;
		this.aClass72_6546 = arg2;
		this.aClass86_6545 = arg3;
		this.aBoolean6555 = arg5;
		this.anInt6548 = arg4;
		OpenGL.glGenTextures(1, anIntArray6558, 0);
		this.anInt6551 = anIntArray6558[0];
		this.method2877();
		this.method2880(0);
	}

	public void method2877() {
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		if (this.aClass189_6557 == Class189.aClass189_1856) {
			OpenGL.glTexParameteri(this.anInt6554, 10241, this.aBoolean6555 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt6554, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt6554, 10241, this.aBoolean6555 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt6554, 10240, 9728);
		}
	}

	public void method166() {
		int var1 = this.aClass_ra_Sub2_Sub1_6550.method4954();
		int var2 = this.aClass_ra_Sub2_Sub1_6550.anIntArray9874[var1];
		if (var2 != this.anInt6554) {
			if (var2 != 0) {
				OpenGL.glBindTexture(var2, 0);
				OpenGL.glDisable(var2);
			}
			OpenGL.glEnable(this.anInt6554);
			this.aClass_ra_Sub2_Sub1_6550.anIntArray9874[var1] = this.anInt6554;
		}
		OpenGL.glBindTexture(this.anInt6554, this.anInt6551);
	}

	public void method163(Class189 arg0) {
		if (this.aClass189_6557 != arg0) {
			this.aClass189_6557 = arg0;
			this.method2877();
		}
	}

	public boolean method115() {
		int var1 = this.method2879();
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glGenerateMipmapEXT(this.anInt6554);
		this.aBoolean6555 = true;
		this.method2877();
		this.method2880(var1);
		return true;
	}

	public void method2878(int arg0, int arg1, int arg2, byte[] arg3) {
		if (arg1 > 0 && !Class380.method4393(arg1, -957524527)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Class380.method4393(arg2, -1554843569)) {
			int var5 = this.aClass72_6546.anInt609;
			int var6 = 0;
			int var7 = arg1 < arg2 ? arg1 : arg2;
			int var8 = arg1 >> 1;
			int var9 = arg2 >> 1;
			byte[] var10 = arg3;
			byte[] var11 = new byte[var8 * var9 * var5];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, var6, Class_ra_Sub2_Sub1.method5141(this.aClass72_6546, this.aClass86_6545), arg1, arg2, 0, Class_ra_Sub2_Sub1.method5152(this.aClass72_6546), 5121, var10, 0);
				if (var7 <= 1) {
					return;
				}
				int var12 = arg1 * var5;
				for (int var13 = 0; var13 < var5; var13++) {
					int var14 = var13;
					int var15 = var13;
					int var16 = var13 + var12;
					for (int var17 = 0; var17 < var9; var17++) {
						for (int var18 = 0; var18 < var8; var18++) {
							byte var19 = var10[var15];
							var15 += var5;
							int var21 = var19 + var10[var15];
							var15 += var5;
							int var22 = var21 + var10[var16];
							var16 += var5;
							int var23 = var22 + var10[var16];
							var16 += var5;
							var11[var14] = (byte) (var23 >> 2);
							var14 += var5;
						}
						var15 += var12;
						var16 += var12;
					}
				}
				byte[] var20 = var11;
				var11 = var10;
				var10 = var20;
				arg1 = var8;
				arg2 = var9;
				var8 >>= 0x1;
				var9 >>= 0x1;
				var7 >>= 0x1;
				var6++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	public int method2879() {
		int var1 = this.aClass72_6546.anInt609 * this.aClass86_6545.anInt724 * this.anInt6548;
		return this.aBoolean6555 ? var1 * 4 / 3 : var1;
	}

	public void method2880(int arg0) {
		this.aClass_ra_Sub2_Sub1_6550.anInt8465 -= arg0;
		this.aClass_ra_Sub2_Sub1_6550.anInt8465 += this.method2879();
	}

	public void method2881(int arg0, int arg1, int arg2, int[] arg3) {
		if (arg1 > 0 && !Class380.method4393(arg1, -1805114641)) {
			throw new IllegalArgumentException("");
		} else if (arg2 > 0 && !Class380.method4393(arg2, -1428923774)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass72_6546 == Class72.aClass72_620) {
			int var5 = 0;
			int var6 = arg1 < arg2 ? arg1 : arg2;
			int var7 = arg1 >> 1;
			int var8 = arg2 >> 1;
			int[] var9 = arg3;
			int[] var10 = new int[var7 * var8];
			while (true) {
				OpenGL.glTexImage2Di(arg0, var5, Class_ra_Sub2_Sub1.method5141(this.aClass72_6546, this.aClass86_6545), arg1, arg2, 0, 32993, this.aClass_ra_Sub2_Sub1_6550.anInt9884, var9, 0);
				if (var6 <= 1) {
					return;
				}
				int var11 = 0;
				int var12 = 0;
				int var13 = var12 + arg1;
				for (int var14 = 0; var14 < var8; var14++) {
					for (int var15 = 0; var15 < var7; var15++) {
						int var16 = var9[var12++];
						int var17 = var9[var12++];
						int var18 = var9[var13++];
						int var19 = var9[var13++];
						int var20 = var16 >> 24 & 0xFF;
						int var21 = var16 >> 16 & 0xFF;
						int var22 = var16 >> 8 & 0xFF;
						int var23 = var16 & 0xFF;
						int var29 = var20 + (var17 >> 24 & 0xFF);
						int var32 = var21 + (var17 >> 16 & 0xFF);
						int var35 = var22 + (var17 >> 8 & 0xFF);
						int var38 = var23 + (var17 & 0xFF);
						int var30 = var29 + (var18 >> 24 & 0xFF);
						int var33 = var32 + (var18 >> 16 & 0xFF);
						int var36 = var35 + (var18 >> 8 & 0xFF);
						int var39 = var38 + (var18 & 0xFF);
						int var31 = var30 + (var19 >> 24 & 0xFF);
						int var34 = var33 + (var19 >> 16 & 0xFF);
						int var37 = var36 + (var19 >> 8 & 0xFF);
						int var40 = var39 + (var19 & 0xFF);
						var10[var11++] = (var31 & 0x3FC) << 22 | (var34 & 0x3FC) << 14 | (var37 & 0x3FC) << 6 | var40 >> 2 & 0xFF;
					}
					var12 += arg1;
					var13 += arg1;
				}
				int[] var24 = var10;
				var10 = var9;
				var9 = var24;
				arg1 = var7;
				arg2 = var8;
				var7 >>= 0x1;
				var8 >>= 0x1;
				var6 >>= 0x1;
				var5++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	public void method162() {
		int var1 = this.aClass_ra_Sub2_Sub1_6550.method4954();
		int var2 = this.aClass_ra_Sub2_Sub1_6550.anIntArray9874[var1];
		if (var2 != this.anInt6554) {
			if (var2 != 0) {
				OpenGL.glBindTexture(var2, 0);
				OpenGL.glDisable(var2);
			}
			OpenGL.glEnable(this.anInt6554);
			this.aClass_ra_Sub2_Sub1_6550.anIntArray9874[var1] = this.anInt6554;
		}
		OpenGL.glBindTexture(this.anInt6554, this.anInt6551);
	}

	public void method52() {
		if (this.anInt6551 > 0) {
			this.aClass_ra_Sub2_Sub1_6550.method5153(this.anInt6551, this.method2879());
			this.anInt6551 = 0;
		}
	}

	public void method164() {
		int var1 = this.aClass_ra_Sub2_Sub1_6550.method4954();
		int var2 = this.aClass_ra_Sub2_Sub1_6550.anIntArray9874[var1];
		if (var2 != this.anInt6554) {
			if (var2 != 0) {
				OpenGL.glBindTexture(var2, 0);
				OpenGL.glDisable(var2);
			}
			OpenGL.glEnable(this.anInt6554);
			this.aClass_ra_Sub2_Sub1_6550.anIntArray9874[var1] = this.anInt6554;
		}
		OpenGL.glBindTexture(this.anInt6554, this.anInt6551);
	}

	public void method165() {
		int var1 = this.aClass_ra_Sub2_Sub1_6550.method4954();
		int var2 = this.aClass_ra_Sub2_Sub1_6550.anIntArray9874[var1];
		if (var2 != this.anInt6554) {
			if (var2 != 0) {
				OpenGL.glBindTexture(var2, 0);
				OpenGL.glDisable(var2);
			}
			OpenGL.glEnable(this.anInt6554);
			this.aClass_ra_Sub2_Sub1_6550.anIntArray9874[var1] = this.anInt6554;
		}
		OpenGL.glBindTexture(this.anInt6554, this.anInt6551);
	}

	public void method167(Class189 arg0) {
		if (this.aClass189_6557 != arg0) {
			this.aClass189_6557 = arg0;
			this.method2877();
		}
	}

	public void method2882(int arg0, int arg1, int arg2, float[] arg3) {
		if (arg1 > 0 && !Class380.method4393(arg1, 74045787)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Class380.method4393(arg2, -1234209220)) {
			int var5 = this.aClass72_6546.anInt609;
			int var6 = 0;
			int var7 = arg1 < arg2 ? arg1 : arg2;
			int var8 = arg1 >> 1;
			int var9 = arg2 >> 1;
			float[] var10 = arg3;
			float[] var11 = new float[var8 * var9 * var5];
			while (true) {
				OpenGL.glTexImage2Df(arg0, var6, Class_ra_Sub2_Sub1.method5141(this.aClass72_6546, this.aClass86_6545), arg1, arg2, 0, Class_ra_Sub2_Sub1.method5152(this.aClass72_6546), 5126, var10, 0);
				if (var7 <= 1) {
					return;
				}
				int var12 = arg1 * var5;
				for (int var13 = 0; var13 < var5; var13++) {
					int var14 = var13;
					int var15 = var13;
					int var16 = var13 + var12;
					for (int var17 = 0; var17 < var9; var17++) {
						for (int var18 = 0; var18 < var8; var18++) {
							float var19 = var10[var15];
							var15 += var5;
							float var21 = var19 + var10[var15];
							var15 += var5;
							float var22 = var21 + var10[var16];
							var16 += var5;
							float var23 = var22 + var10[var16];
							var16 += var5;
							var11[var14] = var23 * 0.25F;
							var14 += var5;
						}
						var15 += var12;
						var16 += var12;
					}
				}
				float[] var20 = var11;
				var11 = var10;
				var10 = var20;
				arg1 = var8;
				arg2 = var9;
				var8 >>= 0x1;
				var9 >>= 0x1;
				var7 >>= 0x1;
				var6++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	public void method53() {
		if (this.anInt6551 > 0) {
			this.aClass_ra_Sub2_Sub1_6550.method5153(this.anInt6551, this.method2879());
			this.anInt6551 = 0;
		}
	}
}
