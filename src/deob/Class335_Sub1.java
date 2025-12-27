package deob;

import java.util.Random;

public class Class335_Sub1 extends Class335 {

	public int[] anIntArray7961 = new int[512];

	public static float[][] aFloatArrayArray7962 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	public Class335_Sub1(int arg0) {
		Random var2 = new Random((long) arg0);
		int var3;
		for (var3 = 0; var3 < 256; var3++) {
			this.anIntArray7961[var3] = this.anIntArray7961[var3 + 256] = var3;
		}
		for (var3 = 0; var3 < 256; var3++) {
			int var4 = var2.nextInt() & 0xFF;
			int var5 = this.anIntArray7961[var4];
			this.anIntArray7961[var4] = this.anIntArray7961[var4 + 256] = this.anIntArray7961[var3];
			this.anIntArray7961[var3] = this.anIntArray7961[var3 + 256] = var5;
		}
	}

	public static final float method3940(float arg0, float arg1, float arg2) {
		return arg0 + (arg1 - arg0) * arg2;
	}

	public static final float method3941(float arg0) {
		return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
	}

	public static final float method3942(int arg0, float arg1, float arg2, float arg3) {
		float[] var4 = aFloatArrayArray7962[arg0];
		return var4[0] * arg1 + var4[1] * arg2 + var4[2] * arg3;
	}

	public void method3939(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6, float arg7, float[] arg8, int arg9) {
		int var11 = (int) ((float) arg1 * arg4 - 1.0F);
		int var40 = var11 & 0xFF;
		int var12 = (int) ((float) arg2 * arg5 - 1.0F);
		int var41 = var12 & 0xFF;
		int var13 = (int) ((float) arg3 * arg6 - 1.0F);
		int var42 = var13 & 0xFF;
		float var14 = (float) arg0 * arg6;
		int var15 = (int) var14;
		int var16 = var15 + 1;
		float var17 = var14 - (float) var15;
		float var18 = 1.0F - var17;
		float var19 = method3941(var17);
		int var43 = var15 & var42;
		int var44 = var16 & var42;
		int var20 = this.anIntArray7961[var43];
		int var21 = this.anIntArray7961[var44];
		for (int var22 = 0; var22 < arg2; var22++) {
			float var23 = (float) var22 * arg5;
			int var24 = (int) var23;
			int var25 = var24 + 1;
			float var26 = var23 - (float) var24;
			float var27 = 1.0F - var26;
			float var28 = method3941(var26);
			int var45 = var24 & var41;
			int var46 = var25 & var41;
			int var29 = this.anIntArray7961[var45 + var20];
			int var30 = this.anIntArray7961[var46 + var20];
			int var31 = this.anIntArray7961[var45 + var21];
			int var32 = this.anIntArray7961[var46 + var21];
			for (int var33 = 0; var33 < arg1; var33++) {
				float var34 = (float) var33 * arg4;
				int var35 = (int) var34;
				int var36 = var35 + 1;
				float var37 = var34 - (float) var35;
				float var38 = 1.0F - var37;
				float var39 = method3941(var37);
				int var47 = var35 & var40;
				int var48 = var36 & var40;
				arg8[arg9++] = arg7 * method3940(method3940(method3940(method3942(this.anIntArray7961[var47 + var29] & 0x7, var38, var27, var18), method3942(this.anIntArray7961[var48 + var29] & 0x7, var37, var27, var18), var39), method3940(method3942(this.anIntArray7961[var47 + var30] & 0x7, var38, var26, var18), method3942(this.anIntArray7961[var48 + var30] & 0x7, var37, var26, var18), var39), var28), method3940(method3940(method3942(this.anIntArray7961[var47 + var31] & 0x7, var38, var27, var17), method3942(this.anIntArray7961[var48 + var31] & 0x7, var37, var27, var17), var39), method3940(method3942(this.anIntArray7961[var47 + var32] & 0x7, var38, var26, var17), method3942(this.anIntArray7961[var48 + var32] & 0x7, var37, var26, var17), var39), var28), var19);
			}
		}
	}

	public void method3938(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6, float arg7, float[] arg8, int arg9) {
		int var11 = (int) ((float) arg1 * arg4 - 1.0F);
		int var40 = var11 & 0xFF;
		int var12 = (int) ((float) arg2 * arg5 - 1.0F);
		int var41 = var12 & 0xFF;
		int var13 = (int) ((float) arg3 * arg6 - 1.0F);
		int var42 = var13 & 0xFF;
		float var14 = (float) arg0 * arg6;
		int var15 = (int) var14;
		int var16 = var15 + 1;
		float var17 = var14 - (float) var15;
		float var18 = 1.0F - var17;
		float var19 = method3941(var17);
		int var43 = var15 & var42;
		int var44 = var16 & var42;
		int var20 = this.anIntArray7961[var43];
		int var21 = this.anIntArray7961[var44];
		for (int var22 = 0; var22 < arg2; var22++) {
			float var23 = (float) var22 * arg5;
			int var24 = (int) var23;
			int var25 = var24 + 1;
			float var26 = var23 - (float) var24;
			float var27 = 1.0F - var26;
			float var28 = method3941(var26);
			int var45 = var24 & var41;
			int var46 = var25 & var41;
			int var29 = this.anIntArray7961[var45 + var20];
			int var30 = this.anIntArray7961[var46 + var20];
			int var31 = this.anIntArray7961[var45 + var21];
			int var32 = this.anIntArray7961[var46 + var21];
			for (int var33 = 0; var33 < arg1; var33++) {
				float var34 = (float) var33 * arg4;
				int var35 = (int) var34;
				int var36 = var35 + 1;
				float var37 = var34 - (float) var35;
				float var38 = 1.0F - var37;
				float var39 = method3941(var37);
				int var47 = var35 & var40;
				int var48 = var36 & var40;
				arg8[arg9++] = arg7 * method3940(method3940(method3940(method3942(this.anIntArray7961[var47 + var29] & 0x7, var38, var27, var18), method3942(this.anIntArray7961[var48 + var29] & 0x7, var37, var27, var18), var39), method3940(method3942(this.anIntArray7961[var47 + var30] & 0x7, var38, var26, var18), method3942(this.anIntArray7961[var48 + var30] & 0x7, var37, var26, var18), var39), var28), method3940(method3940(method3942(this.anIntArray7961[var47 + var31] & 0x7, var38, var27, var17), method3942(this.anIntArray7961[var48 + var31] & 0x7, var37, var27, var17), var39), method3940(method3942(this.anIntArray7961[var47 + var32] & 0x7, var38, var26, var17), method3942(this.anIntArray7961[var48 + var32] & 0x7, var37, var26, var17), var39), var28), var19);
			}
		}
	}
}
