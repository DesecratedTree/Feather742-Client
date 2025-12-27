package deob;

import jaggl.OpenGL;

public abstract class Class36 {

	public static int anInt367 = 3552;

	public static int anInt368 = 3553;

	public static int anInt369 = 1;

	public static int anInt371 = 1;

	public static int anInt372 = 5121;

	public static int anInt377 = 1;

	public static int[] anIntArray381 = new int[1];

	public boolean aBoolean379 = false;

	public Class_ra_Sub1 aClass_ra_Sub1_373;

	public int anInt375;

	public Class72 aClass72_376;

	public Class86 aClass86_370;

	public boolean aBoolean378;

	public int anInt380;

	public int anInt374;

	public Class36(Class_ra_Sub1 arg0, int arg1, Class72 arg2, Class86 arg3, int arg4, boolean arg5) {
		this.aClass_ra_Sub1_373 = arg0;
		this.anInt375 = arg1;
		this.aClass72_376 = arg2;
		this.aClass86_370 = arg3;
		this.aBoolean378 = arg5;
		this.anInt380 = arg4;
		OpenGL.glGenTextures(1, anIntArray381, 0);
		this.anInt374 = anIntArray381[0];
		this.method511(0);
	}

	public void method507() {
		this.aClass_ra_Sub1_373.method4844(this);
		if (this.aBoolean379) {
			OpenGL.glTexParameteri(this.anInt375, 10241, this.aBoolean378 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt375, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt375, 10241, this.aBoolean378 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt375, 10240, 9728);
		}
	}

	public void method508(boolean arg0) {
		if (this.aBoolean378 != arg0) {
			int var2 = this.method512();
			this.aBoolean378 = true;
			this.method507();
			this.method511(var2);
		}
	}

	public void method509() {
		if (this.anInt374 > 0) {
			this.aClass_ra_Sub1_373.anInt8310 -= this.method512();
			int[] var1 = new int[] { this.anInt374 };
			OpenGL.glDeleteTextures(1, var1, 0);
			this.anInt374 = 0;
		}
	}

	public void method510() {
		if (this.anInt374 > 0) {
			this.aClass_ra_Sub1_373.method4814(this.anInt374, this.method512());
			this.anInt374 = 0;
		}
	}

	public void method511(int arg0) {
		this.aClass_ra_Sub1_373.anInt8310 -= arg0;
		this.aClass_ra_Sub1_373.anInt8310 += this.method512();
	}

	public int method512() {
		int var1 = this.aClass72_376.anInt609 * this.aClass86_370.anInt724 * this.anInt380;
		return this.aBoolean378 ? var1 * 4 / 3 : var1;
	}

	public static void method513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
		if (arg2 > 0 && !Class380.method4393(arg2, -1761810254)) {
			throw new IllegalArgumentException("");
		} else if (arg3 > 0 && !Class380.method4393(arg3, 797060375)) {
			throw new IllegalArgumentException("");
		} else if (arg4 == 32993) {
			int var7 = 0;
			int var8 = arg2 < arg3 ? arg2 : arg3;
			int var9 = arg2 >> 1;
			int var10 = arg3 >> 1;
			int[] var11 = arg6;
			int[] var12 = new int[var9 * var10];
			while (true) {
				OpenGL.glTexImage2Di(arg0, var7, arg1, arg2, arg3, 0, arg4, arg5, var11, 0);
				if (var8 <= 1) {
					return;
				}
				int var13 = 0;
				int var14 = 0;
				int var15 = var14 + arg2;
				for (int var16 = 0; var16 < var10; var16++) {
					for (int var17 = 0; var17 < var9; var17++) {
						int var18 = var11[var14++];
						int var19 = var11[var14++];
						int var20 = var11[var15++];
						int var21 = var11[var15++];
						int var22 = var18 >> 24 & 0xFF;
						int var23 = var18 >> 16 & 0xFF;
						int var24 = var18 >> 8 & 0xFF;
						int var25 = var18 & 0xFF;
						int var31 = var22 + (var19 >> 24 & 0xFF);
						int var34 = var23 + (var19 >> 16 & 0xFF);
						int var37 = var24 + (var19 >> 8 & 0xFF);
						int var40 = var25 + (var19 & 0xFF);
						int var32 = var31 + (var20 >> 24 & 0xFF);
						int var35 = var34 + (var20 >> 16 & 0xFF);
						int var38 = var37 + (var20 >> 8 & 0xFF);
						int var41 = var40 + (var20 & 0xFF);
						int var33 = var32 + (var21 >> 24 & 0xFF);
						int var36 = var35 + (var21 >> 16 & 0xFF);
						int var39 = var38 + (var21 >> 8 & 0xFF);
						int var42 = var41 + (var21 & 0xFF);
						var12[var13++] = (var33 & 0x3FC) << 22 | (var36 & 0x3FC) << 14 | (var39 & 0x3FC) << 6 | var42 >> 2 & 0xFF;
					}
					var14 += arg2;
					var15 += arg2;
				}
				int[] var26 = var12;
				var12 = var11;
				var11 = var26;
				arg2 = var9;
				arg3 = var10;
				var9 >>= 0x1;
				var10 >>= 0x1;
				var8 >>= 0x1;
				var7++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	public static void method514(int arg0, int arg1, int arg2, int arg3, Class72 arg4, byte[] arg5) {
		if (arg2 > 0 && !Class380.method4393(arg2, -1318755597)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Class380.method4393(arg3, -6817872)) {
			int var6 = arg4.anInt609;
			int var7 = 0;
			int var8 = arg2 < arg3 ? arg2 : arg3;
			int var9 = arg2 >> 1;
			int var10 = arg3 >> 1;
			byte[] var11 = arg5;
			byte[] var12 = new byte[var9 * var10 * var6];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, var7, arg1, arg2, arg3, 0, Class_ra_Sub1.method4864(arg4), 5121, var11, 0);
				if (var8 <= 1) {
					return;
				}
				int var13 = arg2 * var6;
				for (int var14 = 0; var14 < var6; var14++) {
					int var15 = var14;
					int var16 = var14;
					int var17 = var14 + var13;
					for (int var18 = 0; var18 < var10; var18++) {
						for (int var19 = 0; var19 < var9; var19++) {
							byte var20 = var11[var16];
							var16 += var6;
							int var22 = var20 + var11[var16];
							var16 += var6;
							int var23 = var22 + var11[var17];
							var17 += var6;
							int var24 = var23 + var11[var17];
							var17 += var6;
							var12[var15] = (byte) (var24 >> 2);
							var15 += var6;
						}
						var16 += var13;
						var17 += var13;
					}
				}
				byte[] var21 = var12;
				var12 = var11;
				var11 = var21;
				arg2 = var9;
				arg3 = var10;
				var9 >>= 0x1;
				var10 >>= 0x1;
				var8 >>= 0x1;
				var7++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	public void method515(boolean arg0) {
		if (this.aBoolean379 != arg0) {
			this.aBoolean379 = arg0;
			this.method507();
		}
	}

	public boolean method516() {
		if (!this.aClass_ra_Sub1_373.aBoolean8429) {
			return false;
		}
		int var1 = this.method512();
		this.aClass_ra_Sub1_373.method4844(this);
		OpenGL.glGenerateMipmapEXT(this.anInt375);
		this.aBoolean378 = true;
		this.method507();
		this.method511(var1);
		return true;
	}

	public static void method517(int arg0, int arg1, int arg2, int arg3, Class72 arg4, float[] arg5) {
		if (arg2 > 0 && !Class380.method4393(arg2, -66493799)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Class380.method4393(arg3, -1238641233)) {
			int var6 = arg4.anInt609;
			int var7 = 0;
			int var8 = arg2 < arg3 ? arg2 : arg3;
			int var9 = arg2 >> 1;
			int var10 = arg3 >> 1;
			float[] var11 = arg5;
			float[] var12 = new float[var9 * var10 * var6];
			while (true) {
				OpenGL.glTexImage2Df(arg0, var7, arg1, arg2, arg3, 0, Class_ra_Sub1.method4864(arg4), 5126, var11, 0);
				if (var8 <= 1) {
					return;
				}
				int var13 = arg2 * var6;
				for (int var14 = 0; var14 < var6; var14++) {
					int var15 = var14;
					int var16 = var14;
					int var17 = var14 + var13;
					for (int var18 = 0; var18 < var10; var18++) {
						for (int var19 = 0; var19 < var9; var19++) {
							float var20 = var11[var16];
							var16 += var6;
							float var22 = var20 + var11[var16];
							var16 += var6;
							float var23 = var22 + var11[var17];
							var17 += var6;
							float var24 = var23 + var11[var17];
							var17 += var6;
							var12[var15] = var24 * 0.25F;
							var15 += var6;
						}
						var16 += var13;
						var17 += var13;
					}
				}
				float[] var21 = var12;
				var12 = var11;
				var11 = var21;
				arg2 = var9;
				arg3 = var10;
				var9 >>= 0x1;
				var10 >>= 0x1;
				var8 >>= 0x1;
				var7++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
