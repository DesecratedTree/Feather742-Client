package deob;

import java.io.IOException;

public class Class330_Sub41 extends Class330 {

	public static boolean aBoolean7789 = false;

	public int anInt7804 = 0;

	public int anInt7806 = 0;

	public int anInt7773;

	public int anInt7775;

	public static int anInt7779;

	public static int anInt7780;

	public static int anInt7781;

	public int anInt7785;

	public int anInt7787;

	public int anInt7792;

	public static int anInt7800;

	public int anInt7801;

	public int anInt7805;

	public boolean aBoolean7772;

	public boolean aBoolean7777;

	public static byte[] aByteArray7778;

	public static float[] aFloatArray7774;

	public static float[] aFloatArray7782;

	public float[] aFloatArray7790;

	public static float[] aFloatArray7791;

	public static float[] aFloatArray7793;

	public static float[] aFloatArray7797;

	public static float[] aFloatArray7798;

	public static float[] aFloatArray7799;

	public float[] aFloatArray7803;

	public static int[] anIntArray7788;

	public static int[] anIntArray7796;

	public static int[] anIntArray7802;

	public static Class289[] aClass289Array7783;

	public static Class290[] aClass290Array7784;

	public static Class298[] aClass298Array7786;

	public static Class320[] aClass320Array7795;

	public static boolean[] aBooleanArray7794;

	public byte[][] aByteArrayArray7776;

	public Class330_Sub41(byte[] arg0) throws IOException {
		this.method3695(arg0);
	}

	public static void method3692(byte[] arg0, int arg1) {
		aByteArray7778 = arg0;
		anInt7779 = arg1;
		anInt7780 = 0;
	}

	public int method3693() {
		return this.anInt7804;
	}

	public static int method3694(int arg0) {
		int var1 = 0;
		int var2 = 0;
		int var3;
		while (arg0 >= 8 - anInt7780) {
			var3 = 8 - anInt7780;
			int var4 = (0x1 << var3) - 1;
			var1 += (aByteArray7778[anInt7779] >> anInt7780 & var4) << var2;
			anInt7780 = 0;
			anInt7779++;
			var2 += var3;
			arg0 -= var3;
		}
		if (arg0 > 0) {
			var3 = (0x1 << arg0) - 1;
			var1 += (aByteArray7778[anInt7779] >> anInt7780 & var3) << var2;
			anInt7780 += arg0;
		}
		return var1;
	}

	public void method3695(byte[] arg0) throws IOException {
		Buffer var2 = new Buffer(arg0);
		this.anInt7773 = var2.readInt((byte) 9);
		this.anInt7792 = var2.readInt((byte) 42);
		this.anInt7775 = var2.readInt((byte) 14);
		this.anInt7787 = var2.readInt((byte) 61);
		if (this.anInt7787 < 0) {
			this.anInt7787 = ~this.anInt7787;
			this.aBoolean7777 = true;
		}
		int var3 = var2.readInt((byte) 95);
		if (var3 < 0) {
			throw new IOException();
		}
		this.aByteArrayArray7776 = new byte[var3][];
		for (int var4 = 0; var4 < var3; var4++) {
			int var5 = 0;
			int var6;
			do {
				var6 = var2.readUnsignedByte(31792929);
				var5 += var6;
			} while (var6 >= 255);
			byte[] var7 = new byte[var5];
			var2.readBytes(var7, 0, var5, 1274334002);
			this.aByteArrayArray7776[var4] = var7;
		}
	}

	public static boolean method3696(IndexTable arg0) {
		if (!aBoolean7789) {
			byte[] var1 = arg0.getFile(0, 0);
			if (var1 == null) {
				return false;
			}
			method3705(var1);
		}
		return true;
	}

	public static Class330_Sub41 method3697(IndexTable arg0, int arg1) {
		if (!method3696(arg0)) {
			arg0.method2750(arg1, -1476418872);
			return null;
		}
		byte[] var2 = arg0.method2761(arg1, 2138157519);
		if (var2 == null) {
			return null;
		}
		Class330_Sub41 var3 = null;
		try {
			var3 = new Class330_Sub41(var2);
		} catch (IOException var5) {
			var5.printStackTrace();
		}
		return var3;
	}

	public static int method3698() {
		int var0 = aByteArray7778[anInt7779] >> anInt7780 & 0x1;
		anInt7780++;
		anInt7779 += anInt7780 >> 3;
		anInt7780 &= 0x7;
		return var0;
	}

	public Class330_Sub29_Sub1_Sub1 method3699() {
		Class279.method2745(this, -1575652650);
		return this.method3701() && (this.anInt7804 <= this.anInt7773 || this.anInt7806 <= this.anInt7773 / Class362.method4257(-641066210)) ? null : new Class330_Sub29_Sub1_Sub1(this.anInt7773, this, this.aFloatArray7803, this.anInt7775, this.anInt7787, this.aBoolean7777);
	}

	public int method3700(int arg0) {
		int var2 = 0;
		if (this.aFloatArray7803 == null) {
			this.anInt7785 = 0;
			this.aFloatArray7790 = new float[anInt7800];
			this.aFloatArray7803 = new float[this.anInt7792];
			this.anInt7804 = 0;
			this.anInt7805 = 0;
		}
		while (arg0 > this.anInt7804 && this.anInt7805 < this.aByteArrayArray7776.length) {
			float[] var3 = this.method3707(this.anInt7805);
			if (var3 != null) {
				int var4 = this.anInt7804;
				int var5 = var3.length;
				if (var5 > this.anInt7792 - var4) {
					var5 = this.anInt7792 - var4;
				}
				for (int var6 = 0; var6 < var5; var6++) {
					this.aFloatArray7803[var4++] = var3[var6];
				}
				var2 += var4 - this.anInt7804;
				this.anInt7804 = var4;
			}
			this.anInt7805++;
		}
		return var2;
	}

	public boolean method3701() {
		return this.anInt7804 < this.anInt7792 - 1;
	}

	public int method3702() {
		return this.anInt7773;
	}

	public static Class330_Sub41 method3703(IndexTable arg0, int arg1, int arg2) {
		if (!method3696(arg0)) {
			arg0.hasStoredFile(arg1, arg2, (byte) 32);
			return null;
		}
		byte[] var3 = arg0.getFile(arg1, arg2);
		if (var3 == null) {
			return null;
		}
		Class330_Sub41 var4 = null;
		try {
			var4 = new Class330_Sub41(var3);
		} catch (IOException var6) {
			var6.printStackTrace();
		}
		return var4;
	}

	public void method3704(int arg0) {
		if (arg0 > this.anInt7792 - 1) {
			arg0 = this.anInt7792 - 1;
		}
		if (arg0 > this.anInt7804) {
			this.anInt7806 = this.method3700(arg0);
		} else {
			this.anInt7806 = 0;
		}
		if (!this.method3701()) {
			this.aFloatArray7790 = null;
		}
	}

	public static void method3705(byte[] arg0) {
		method3692(arg0, 0);
		anInt7781 = 0x1 << method3694(4);
		anInt7800 = 0x1 << method3694(4);
		aFloatArray7791 = new float[anInt7800];
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		for (var1 = 0; var1 < 2; var1++) {
			var2 = var1 == 0 ? anInt7781 : anInt7800;
			var3 = var2 >> 1;
			var4 = var2 >> 2;
			var5 = var2 >> 3;
			float[] var6 = new float[var3];
			for (int var7 = 0; var7 < var4; var7++) {
				var6[var7 * 2] = (float) Math.cos((double) (var7 * 4) * 3.141592653589793D / (double) var2);
				var6[var7 * 2 + 1] = -((float) Math.sin((double) (var7 * 4) * 3.141592653589793D / (double) var2));
			}
			float[] var13 = new float[var3];
			for (int var8 = 0; var8 < var4; var8++) {
				var13[var8 * 2] = (float) Math.cos((double) (var8 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
				var13[var8 * 2 + 1] = (float) Math.sin((double) (var8 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
			}
			float[] var14 = new float[var4];
			for (int var9 = 0; var9 < var5; var9++) {
				var14[var9 * 2] = (float) Math.cos((double) (var9 * 4 + 2) * 3.141592653589793D / (double) var2);
				var14[var9 * 2 + 1] = -((float) Math.sin((double) (var9 * 4 + 2) * 3.141592653589793D / (double) var2));
			}
			int[] var15 = new int[var5];
			int var10 = Class64.method779(var5 - 1, -1064394116);
			for (int var11 = 0; var11 < var5; var11++) {
				var15[var11] = Class307.method3073(var11, var10, -833340950);
			}
			if (var1 == 0) {
				aFloatArray7774 = var6;
				aFloatArray7793 = var13;
				aFloatArray7797 = var14;
				anIntArray7788 = var15;
			} else {
				aFloatArray7798 = var6;
				aFloatArray7799 = var13;
				aFloatArray7782 = var14;
				anIntArray7802 = var15;
			}
		}
		var1 = method3694(8) + 1;
		aClass289Array7783 = new Class289[var1];
		for (var2 = 0; var2 < var1; var2++) {
			aClass289Array7783[var2] = new Class289();
		}
		var2 = method3694(6) + 1;
		for (var3 = 0; var3 < var2; var3++) {
			method3694(16);
		}
		var2 = method3694(6) + 1;
		aClass290Array7784 = new Class290[var2];
		for (var3 = 0; var3 < var2; var3++) {
			aClass290Array7784[var3] = new Class290();
		}
		var3 = method3694(6) + 1;
		aClass320Array7795 = new Class320[var3];
		for (var4 = 0; var4 < var3; var4++) {
			aClass320Array7795[var4] = new Class320();
		}
		var4 = method3694(6) + 1;
		aClass298Array7786 = new Class298[var4];
		for (var5 = 0; var5 < var4; var5++) {
			aClass298Array7786[var5] = new Class298();
		}
		var5 = method3694(6) + 1;
		aBooleanArray7794 = new boolean[var5];
		anIntArray7796 = new int[var5];
		for (int var12 = 0; var12 < var5; var12++) {
			aBooleanArray7794[var12] = method3698() != 0;
			method3694(16);
			method3694(16);
			anIntArray7796[var12] = method3694(8);
		}
		aBoolean7789 = true;
	}

	public static float method3706(int arg0) {
		int var1 = arg0 & 0x1FFFFF;
		int var2 = arg0 & Integer.MIN_VALUE;
		int var3 = arg0 >> 21 & 0x3FF;
		if (var2 != 0) {
			var1 = -var1;
		}
		return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
	}

	public float[] method3707(int arg0) {
		method3692(this.aByteArrayArray7776[arg0], 0);
		method3698();
		int var2 = method3694(Class64.method779(anIntArray7796.length - 1, -2049844321));
		boolean var3 = aBooleanArray7794[var2];
		int var4 = var3 ? anInt7800 : anInt7781;
		boolean var5 = false;
		boolean var6 = false;
		if (var3) {
			var5 = method3698() != 0;
			var6 = method3698() != 0;
		}
		int var7 = var4 >> 1;
		int var8;
		int var9;
		int var10;
		if (var3 && !var5) {
			var8 = (var4 >> 2) - (anInt7781 >> 2);
			var9 = (var4 >> 2) + (anInt7781 >> 2);
			var10 = anInt7781 >> 1;
		} else {
			var8 = 0;
			var9 = var7;
			var10 = var4 >> 1;
		}
		int var11;
		int var12;
		int var13;
		if (var3 && !var6) {
			var11 = var4 - (var4 >> 2) - (anInt7781 >> 2);
			var12 = var4 - (var4 >> 2) + (anInt7781 >> 2);
			var13 = anInt7781 >> 1;
		} else {
			var11 = var7;
			var12 = var4;
			var13 = var4 >> 1;
		}
		Class298 var14 = aClass298Array7786[anIntArray7796[var2]];
		int var15 = var14.anInt3055;
		int var16 = var14.anIntArray3054[var15];
		boolean var17 = !aClass290Array7784[var16].method2898();
		boolean var18 = var17;
		float[] var20;
		for (int var55 = 0; var55 < var14.anInt3053; var55++) {
			Class320 var19 = aClass320Array7795[var14.anIntArray3052[var55]];
			var20 = aFloatArray7791;
			var19.method3170(var20, var4 >> 1, var18);
		}
		int var41;
		if (!var17) {
			var16 = var14.anInt3055;
			var41 = var14.anIntArray3054[var16];
			aClass290Array7784[var41].method2895(aFloatArray7791, var4 >> 1);
		}
		int var22;
		int var43;
		if (var17) {
			for (var16 = var4 >> 1; var16 < var4; var16++) {
				aFloatArray7791[var16] = 0.0F;
			}
		} else {
			var16 = var4 >> 1;
			var41 = var4 >> 2;
			var43 = var4 >> 3;
			float[] var21 = aFloatArray7791;
			for (var22 = 0; var22 < var16; var22++) {
				var21[var22] *= 0.5F;
			}
			for (var22 = var16; var22 < var4; var22++) {
				var21[var22] = -var21[var4 - var22 - 1];
			}
			float[] var45 = var3 ? aFloatArray7798 : aFloatArray7774;
			float[] var23 = var3 ? aFloatArray7799 : aFloatArray7793;
			float[] var24 = var3 ? aFloatArray7782 : aFloatArray7797;
			int[] var25 = var3 ? anIntArray7802 : anIntArray7788;
			int var26;
			float var27;
			float var28;
			float var29;
			float var30;
			for (var26 = 0; var26 < var41; var26++) {
				var27 = var21[var26 * 4] - var21[var4 - var26 * 4 - 1];
				var28 = var21[var26 * 4 + 2] - var21[var4 - var26 * 4 - 3];
				var29 = var45[var26 * 2];
				var30 = var45[var26 * 2 + 1];
				var21[var4 - var26 * 4 - 1] = var27 * var29 - var28 * var30;
				var21[var4 - var26 * 4 - 3] = var27 * var30 + var28 * var29;
			}
			float var31;
			float var32;
			for (var26 = 0; var26 < var43; var26++) {
				var27 = var21[var16 + 3 + var26 * 4];
				var28 = var21[var16 + 1 + var26 * 4];
				var29 = var21[var26 * 4 + 3];
				var30 = var21[var26 * 4 + 1];
				var21[var16 + 3 + var26 * 4] = var27 + var29;
				var21[var16 + 1 + var26 * 4] = var28 + var30;
				var31 = var45[var16 - 4 - var26 * 4];
				var32 = var45[var16 - 3 - var26 * 4];
				var21[var26 * 4 + 3] = (var27 - var29) * var31 - (var28 - var30) * var32;
				var21[var26 * 4 + 1] = (var28 - var30) * var31 + (var27 - var29) * var32;
			}
			var26 = Class64.method779(var4 - 1, -1919924175);
			int var46;
			int var47;
			int var48;
			int var49;
			for (var46 = 0; var46 < var26 - 3; var46++) {
				var47 = var4 >> var46 + 2;
				var48 = 0x8 << var46;
				for (var49 = 0; var49 < 0x2 << var46; var49++) {
					int var50 = var4 - var47 * 2 * var49;
					int var51 = var4 - var47 * (var49 * 2 + 1);
					for (int var33 = 0; var33 < var4 >> var46 + 4; var33++) {
						int var34 = var33 * 4;
						float var35 = var21[var50 - 1 - var34];
						float var36 = var21[var50 - 3 - var34];
						float var37 = var21[var51 - 1 - var34];
						float var38 = var21[var51 - 3 - var34];
						var21[var50 - 1 - var34] = var35 + var37;
						var21[var50 - 3 - var34] = var36 + var38;
						float var39 = var45[var33 * var48];
						float var40 = var45[var33 * var48 + 1];
						var21[var51 - 1 - var34] = (var35 - var37) * var39 - (var36 - var38) * var40;
						var21[var51 - 3 - var34] = (var36 - var38) * var39 + (var35 - var37) * var40;
					}
				}
			}
			for (var46 = 1; var46 < var43 - 1; var46++) {
				var47 = var25[var46];
				if (var46 < var47) {
					var48 = var46 * 8;
					var49 = var47 * 8;
					var31 = var21[var48 + 1];
					var21[var48 + 1] = var21[var49 + 1];
					var21[var49 + 1] = var31;
					var31 = var21[var48 + 3];
					var21[var48 + 3] = var21[var49 + 3];
					var21[var49 + 3] = var31;
					var31 = var21[var48 + 5];
					var21[var48 + 5] = var21[var49 + 5];
					var21[var49 + 5] = var31;
					var31 = var21[var48 + 7];
					var21[var48 + 7] = var21[var49 + 7];
					var21[var49 + 7] = var31;
				}
			}
			for (var46 = 0; var46 < var16; var46++) {
				var21[var46] = var21[var46 * 2 + 1];
			}
			for (var46 = 0; var46 < var43; var46++) {
				var21[var4 - 1 - var46 * 2] = var21[var46 * 4];
				var21[var4 - 2 - var46 * 2] = var21[var46 * 4 + 1];
				var21[var4 - var41 - 1 - var46 * 2] = var21[var46 * 4 + 2];
				var21[var4 - var41 - 2 - var46 * 2] = var21[var46 * 4 + 3];
			}
			for (var46 = 0; var46 < var43; var46++) {
				var28 = var24[var46 * 2];
				var29 = var24[var46 * 2 + 1];
				var30 = var21[var16 + var46 * 2];
				var31 = var21[var16 + var46 * 2 + 1];
				var32 = var21[var4 - 2 - var46 * 2];
				float var52 = var21[var4 - 1 - var46 * 2];
				float var53 = var29 * (var30 - var32) + var28 * (var31 + var52);
				var21[var16 + var46 * 2] = (var30 + var32 + var53) * 0.5F;
				var21[var4 - 2 - var46 * 2] = (var30 + var32 - var53) * 0.5F;
				float var54 = var29 * (var31 + var52) - var28 * (var30 - var32);
				var21[var16 + var46 * 2 + 1] = (var31 - var52 + var54) * 0.5F;
				var21[var4 - 1 - var46 * 2] = (-var31 + var52 + var54) * 0.5F;
			}
			for (var46 = 0; var46 < var41; var46++) {
				var21[var46] = var21[var46 * 2 + var16] * var23[var46 * 2] + var21[var46 * 2 + 1 + var16] * var23[var46 * 2 + 1];
				var21[var16 - 1 - var46] = var21[var46 * 2 + var16] * var23[var46 * 2 + 1] - var21[var46 * 2 + 1 + var16] * var23[var46 * 2];
			}
			for (var46 = 0; var46 < var41; var46++) {
				var21[var4 - var41 + var46] = -var21[var46];
			}
			for (var46 = 0; var46 < var41; var46++) {
				var21[var46] = var21[var41 + var46];
			}
			for (var46 = 0; var46 < var41; var46++) {
				var21[var41 + var46] = -var21[var41 - var46 - 1];
			}
			for (var46 = 0; var46 < var41; var46++) {
				var21[var16 + var46] = var21[var4 - var46 - 1];
			}
			for (var46 = var8; var46 < var9; var46++) {
				var28 = (float) Math.sin(((double) (var46 - var8) + 0.5D) / (double) var10 * 0.5D * 3.141592653589793D);
				aFloatArray7791[var46] *= (float) Math.sin((double) var28 * 1.5707963267948966D * (double) var28);
			}
			for (var46 = var11; var46 < var12; var46++) {
				var28 = (float) Math.sin(((double) (var46 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				aFloatArray7791[var46] *= (float) Math.sin((double) var28 * 1.5707963267948966D * (double) var28);
			}
		}
		float[] var42 = null;
		if (this.anInt7785 > 0) {
			var43 = this.anInt7785 + var4 >> 2;
			var42 = new float[var43];
			int var44;
			if (!this.aBoolean7772) {
				for (var44 = 0; var44 < this.anInt7801; var44++) {
					var22 = (this.anInt7785 >> 1) + var44;
					var42[var44] += this.aFloatArray7790[var22];
				}
			}
			if (!var17) {
				for (var44 = var8; var44 < var4 >> 1; var44++) {
					var22 = var42.length - (var4 >> 1) + var44;
					var42[var22] += aFloatArray7791[var44];
				}
			}
		}
		var20 = this.aFloatArray7790;
		this.aFloatArray7790 = aFloatArray7791;
		aFloatArray7791 = var20;
		this.anInt7785 = var4;
		this.anInt7801 = var12 - (var4 >> 1);
		this.aBoolean7772 = var17;
		return var42;
	}
}
