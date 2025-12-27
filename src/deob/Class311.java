package deob;

public class Class311 {

	public static int anInt3216 = 128;

	public static int anInt3217 = 512;

	public static int anInt3219 = 2;

	public static int anInt3226 = 16;

	public static int anInt3231 = 1;

	public static int anInt3237 = 24;

	public static int anInt3238 = 24;

	public static int anInt3239 = 192;

	public static int anInt3240 = 0;

	public static int anInt3241 = 13;

	public static int[] anIntArray3246 = new int[4];

	public int anInt3222;

	public int anInt3223;

	public int anInt3236;

	public boolean aBoolean3225;

	public int anInt3220;

	public int anInt3227;

	public int anInt3218;

	public int anInt3234;

	public int anInt3242;

	public int anInt3235;

	public int anInt3244;

	public int anInt3224;

	public int anInt3228;

	public int anInt3229;

	public int anInt3230;

	public int anInt3232;

	public static Class387 aClass387_3243;

	public static Class61 aClass61_3221;

	public Class61 aClass61_3233;

	public static Class61 aClass61_3245;

	public static void method3102() {
		aClass387_3243 = null;
		aClass61_3245 = null;
	}

	public boolean method3103(int arg0, int arg1, int arg2, int arg3) {
		int var5;
		int var6;
		int var7;
		if (this.aBoolean3225) {
			this.anInt3230 = 1073741823;
			var5 = this.anInt3222;
			var6 = this.anInt3223;
			var7 = this.anInt3236;
		} else {
			var5 = this.anInt3222 - arg0;
			var6 = this.anInt3223 - arg1;
			var7 = this.anInt3236 - arg2;
			this.anInt3230 = (int) Math.sqrt((double) (var5 * var5 + var6 * var6 + var7 * var7));
			if (this.anInt3230 == 0) {
				this.anInt3230 = 1;
			}
			var5 = (var5 << 8) / this.anInt3230;
			var6 = (var6 << 8) / this.anInt3230;
			var7 = (var7 << 8) / this.anInt3230;
		}
		int var8 = (int) (Math.sqrt((double) (var5 * var5 + var6 * var6 + var7 * var7)) * 256.0D);
		if (var8 > 128) {
			var5 = (var5 << 16) / var8;
			var6 = (var6 << 16) / var8;
			var7 = (var7 << 16) / var8;
			this.anInt3232 = this.anInt3218 * arg3 / (this.aBoolean3225 ? 1024 : this.anInt3230);
		} else {
			this.anInt3232 = 0;
		}
		if (this.anInt3232 < 8) {
			this.aClass61_3233 = null;
			return false;
		}
		int var9 = Class136.method1594(this.anInt3232, 2014059947);
		if (var9 > arg3) {
			var9 = Class385.method4425(arg3, (short) 8776);
		}
		if (var9 > 512) {
			var9 = 512;
		}
		if (var9 != this.anInt3224) {
			this.anInt3224 = var9;
		}
		this.anInt3228 = (int) (Math.asin((double) ((float) var6 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt3229 = (int) (Math.atan2((double) var5, (double) -var7) * 2607.5945876176133D) & 0x3FFF;
		this.aClass61_3233 = null;
		return true;
	}

	public boolean method3104(Class_ra arg0, Class311 arg1) {
		return this.aClass61_3233 != null || this.method3106(arg0, arg1);
	}

	public void method3105(Class_ra arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		if (this.aClass61_3233 == null) {
			return;
		}
		float[] var12 = new float[3];
		float var13 = (float) -(this.anInt3222 - arg7 << 16);
		float var14 = (float) (this.anInt3223 - arg8 << 15);
		float var15 = (float) -(this.anInt3236 - arg9 << 16);
		float[] var16 = new float[3];
		arg0.cq().method2472(var16);
		float var19 = var13 + var16[0];
		float var20 = var14 + var16[1];
		float var21 = var15 + var16[2];
		arg0.method_do(var19, var20, var21, var12);
		if (var12[2] < 0.0F) {
			return;
		}
		int var17 = (int) (var12[0] - (float) (this.anInt3232 / 2));
		int var18 = (int) (var12[1] - (float) (this.anInt3232 / 2));
		if (var18 < arg4 && var18 + this.anInt3232 > 0 && var17 < arg3 && var17 + this.anInt3232 > 0) {
			this.aClass61_3233.method691(var17, var18, this.anInt3232, this.anInt3232, 0, arg10 << 24 | 0xFFFFFF, 1);
		}
	}

	public boolean method3106(Class_ra arg0, Class311 arg1) {
		if (this.aClass61_3233 == null) {
			if (this.anInt3234 == 0) {
				if (Class209.anInterface_ma1984.method237(this.anInt3220, Class377.aClass377_3935, 0.7F, this.anInt3224, this.anInt3224, false, 2137334619)) {
					int[] var3 = Class209.anInterface_ma1984.method231(this.anInt3220, 0.7F, this.anInt3224, this.anInt3224, false, -1487262537);
					this.aClass61_3233 = arg0.method4795(var3, 0, this.anInt3224, this.anInt3224, this.anInt3224, (byte) -103);
				}
			} else if (this.anInt3234 == 2) {
				this.method3107(arg0, arg1);
			} else if (this.anInt3234 == 1) {
				this.method3110(arg0, arg1);
			}
		}
		return this.aClass61_3233 != null;
	}

	public void method3107(Class_ra arg0, Class311 arg1) {
		Model var3 = Model.loadModel(Class126_Sub2.aClass280_7229, this.anInt3220, 0);
		if (var3 == null) {
			return;
		}
		arg0.qa(anIntArray3246);
		arg0.r(0, 0, this.anInt3224, this.anInt3224);
		arg0.ba(2, 0);
		arg0.B(0, 0, this.anInt3224, this.anInt3224, 0, 0);
		int var4 = 0;
		int var5 = 0;
		int var6 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean3225) {
				var4 = -arg1.anInt3222;
				var5 = -arg1.anInt3223;
				var6 = -arg1.anInt3236;
			} else {
				var4 = this.anInt3222 - arg1.anInt3222;
				var5 = this.anInt3223 - arg1.anInt3223;
				var6 = this.anInt3236 - arg1.anInt3236;
			}
		}
		int var7;
		int var8;
		int var9;
		int var10;
		if (this.anInt3228 != 0) {
			var7 = -this.anInt3228 & 0x3FFF;
			var8 = Class257.anIntArray2683[var7];
			var9 = Class257.anIntArray2684[var7];
			var10 = var5 * var9 - var6 * var8 >> 14;
			var6 = var5 * var8 + var6 * var9 >> 14;
			var5 = var10;
		}
		if (this.anInt3229 != 0) {
			var7 = -this.anInt3229 & 0x3FFF;
			var8 = Class257.anIntArray2683[var7];
			var9 = Class257.anIntArray2684[var7];
			var10 = var6 * var8 + var4 * var9 >> 14;
			var6 = var6 * var9 - var4 * var8 >> 14;
			var4 = var10;
		}
		arg0.IA(1.0F);
		arg0.m(this.anInt3227, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
		var3.method1195(this.anInt3242 & 0x3FFF, this.anInt3235 & 0x3FFF, this.anInt3244 & 0x3FFF);
		Class387 var16 = arg0.cb(var3, 2048, 0, 64, 768);
		var8 = var16.ya() - var16.RA();
		var9 = var16.o() - var16.YA();
		var10 = var8 > var9 ? var8 : var9;
		int var11 = this.anInt3224 * 1024 / var10;
		Class249 var12 = arg0.cs();
		Class249 var13 = arg0.cz();
		var13.method2494((float) (this.anInt3224 / 2), (float) (this.anInt3224 / 2), (float) var11, (float) var11, 50.0F, 50000.0F, (float) arg0.method4782((byte) 0).method856(), (float) arg0.method4782((byte) 0).method857(), 1024.0F);
		arg0.ci(var13);
		Class247 var14 = new Class247();
		arg0.cw(var14);
		Class247 var15 = arg0.cj();
		var15.method2476(0.0F, 0.0F, (float) (50 - var16.AA()));
		var16.method4475(var15, null, 1);
		this.aClass61_3233 = arg0.bj(0, 0, this.anInt3224, this.anInt3224, true);
		this.aClass61_3233.method722(0, 0, 3);
		arg0.ci(var12);
		arg0.r(anIntArray3246[0], anIntArray3246[1], anIntArray3246[2], anIntArray3246[3]);
	}

	public static void method3108(Class_ra arg0) {
		if (aClass387_3243 != null) {
			return;
		}
		Model var1 = new Model(580, 1104, 1);
		var1.method1191((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
		var1.method1189(0, 128, 0);
		var1.method1189(0, -128, 0);
		for (int var2 = 0; var2 <= 24; var2++) {
			int var3 = var2 * 8192 / 24;
			int var4 = Class257.anIntArray2683[var3];
			int var5 = Class257.anIntArray2684[var3];
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			for (var6 = 1; var6 < 24; var6++) {
				var7 = var6 * 8192 / 24;
				var8 = Class257.anIntArray2684[var7] >> 7;
				var9 = Class257.anIntArray2683[var7] * var4 >> 21;
				var10 = Class257.anIntArray2683[var7] * var5 >> 21;
				var1.method1189(var10, var8, -var9);
			}
			if (var2 > 0) {
				var6 = var2 * 23 + 2;
				var7 = var6 - 23;
				var1.method1190(0, var7, var6, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				for (var8 = 1; var8 < 23; var8++) {
					var9 = var7 + 1;
					var10 = var6 + 1;
					var1.method1190(var7, var9, var6, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					var1.method1190(var9, var10, var6, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					var7 = var9;
					var6 = var10;
				}
				var1.method1190(var6, var7, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
			}
		}
		var1.anInt874 = var1.anInt897;
		var1.anIntArray890 = null;
		var1.anIntArray880 = null;
		var1.aByteArray885 = null;
		aClass387_3243 = arg0.cb(var1, 51200, 33, 64, 768);
	}

	public static void method3109(Class_ra arg0) {
		if (aClass61_3245 != null) {
			return;
		}
		int[] var1 = new int[16384];
		int[] var2 = new int[16384];
		for (int var3 = 0; var3 < 64; var3++) {
			int var4 = 64 - var3;
			int var13 = var4 * var4;
			int var5 = 128 - var3 - 1;
			int var6 = var3 * 128;
			int var7 = var5 * 128;
			for (int var8 = 0; var8 < 64; var8++) {
				int var9 = 64 - var8;
				int var14 = var9 * var9;
				int var10 = 128 - var8 - 1;
				int var11 = 256 - (var14 + var13 << 8) / 4096;
				var11 = var11 * 3072 / 1536;
				if (var11 < 0) {
					var11 = 0;
				} else if (var11 > 255) {
					var11 = 255;
				}
				int var12 = var11 / 2;
				var2[var6 + var8] = var2[var6 + var10] = var2[var7 + var8] = var2[var7 + var10] = (var11 | 0xFF00) << 16;
				var1[var6 + var8] = var1[var6 + var10] = var1[var7 + var8] = var1[var7 + var10] = 127 - var12 << 24 | 0xFFFFFF;
			}
		}
		aClass61_3245 = arg0.method4795(var2, 0, 128, 128, 128, (byte) -119);
		aClass61_3221 = arg0.method4795(var1, 0, 128, 128, 128, (byte) -39);
	}

	public void method3110(Class_ra arg0, Class311 arg1) {
		method3108(arg0);
		method3109(arg0);
		arg0.qa(anIntArray3246);
		arg0.r(0, 0, this.anInt3224, this.anInt3224);
		arg0.ba(2, 0);
		arg0.B(0, 0, this.anInt3224, this.anInt3224, this.anInt3227 | 0xFF000000, 0);
		int var3 = 0;
		int var4 = 0;
		int var5 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean3225) {
				var3 = -arg1.anInt3222;
				var4 = -arg1.anInt3223;
				var5 = -arg1.anInt3236;
			} else {
				var3 = arg1.anInt3222 - this.anInt3222;
				var4 = arg1.anInt3223 - this.anInt3223;
				var5 = arg1.anInt3236 - this.anInt3236;
			}
		}
		int var6;
		int var7;
		int var8;
		if (this.anInt3228 != 0) {
			var6 = Class257.anIntArray2683[this.anInt3228];
			var7 = Class257.anIntArray2684[this.anInt3228];
			var8 = var4 * var7 - var5 * var6 >> 14;
			var5 = var4 * var6 + var5 * var7 >> 14;
			var4 = var8;
		}
		if (this.anInt3229 != 0) {
			var6 = Class257.anIntArray2683[this.anInt3229];
			var7 = Class257.anIntArray2684[this.anInt3229];
			var8 = var5 * var6 + var3 * var7 >> 14;
			var5 = var5 * var7 - var3 * var6 >> 14;
			var3 = var8;
		}
		Class387 var13 = aClass387_3243.method4446((byte) 0, 51200, true);
		var13.paintTexture((short) 0, (short) this.anInt3220);
		arg0.IA(1.0F);
		arg0.m(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
		var7 = this.anInt3224 * 1024 / (var13.ya() - var13.RA());
		if (this.anInt3227 != 0) {
			var7 = var7 * 13 / 16;
		}
		Class249 var14 = arg0.cs();
		Class249 var9 = arg0.cz();
		var9.method2494((float) (this.anInt3224 / 2), (float) (this.anInt3224 / 2), (float) var7, (float) var7, 50.0F, 50000.0F, (float) arg0.method4782((byte) 0).method856(), (float) arg0.method4782((byte) 0).method857(), 1024.0F);
		arg0.ci(var9);
		arg0.cw(new Class247());
		Class247 var10 = new Class247();
		var10.method2476(0.0F, 0.0F, (float) (50 - var13.AA()));
		var13.method4475(var10, null, 1);
		int var11 = this.anInt3224 * 13 / 16;
		int var12 = (this.anInt3224 - var11) / 2;
		aClass61_3221.method691(var12, var12, var11, var11, 0, this.anInt3227 | 0xFF000000, 1);
		this.aClass61_3233 = arg0.bj(0, 0, this.anInt3224, this.anInt3224, true);
		arg0.ba(2, 0);
		arg0.B(0, 0, this.anInt3224, this.anInt3224, 0, 0);
		aClass61_3245.method691(0, 0, this.anInt3224, this.anInt3224, 1, 0, 0);
		this.aClass61_3233.method722(0, 0, 3);
		arg0.ci(var14);
		arg0.r(anIntArray3246[0], anIntArray3246[1], anIntArray3246[2], anIntArray3246[3]);
	}

	public Class311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
		this.anInt3222 = arg2;
		this.anInt3223 = arg3;
		this.anInt3236 = arg4;
		this.aBoolean3225 = arg7;
		this.anInt3220 = arg1;
		this.anInt3227 = arg6;
		this.anInt3218 = arg5;
		this.anInt3234 = arg0;
		this.anInt3242 = arg8;
		this.anInt3235 = arg9;
		this.anInt3244 = arg10;
	}
}
