package deob;

public class Class192_Sub1 extends Class192 {

	public static float aFloat7339 = 0.25F;

	public static float aFloat7340 = 1.0F;

	public static float aFloat7341 = 1.0F;

	public static float aFloat7342 = 1.0F;

	public static int anInt7346 = 256;

	public Class105 aClass105_7354;

	public Class123 aClass123_7343;

	public Class123 aClass123_7345;

	public Class123 aClass123_7347;

	public Class123 aClass123_7348;

	public Class123 aClass123_7355;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7338;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7349;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7350;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7351;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7352;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7353;

	public boolean aBoolean7344;

	public void method2115(int arg0, int arg1) {
	}

	public boolean method2128() {
		return this.aClass_ra_Sub2_1879.aBoolean8594 && this.aClass_ra_Sub2_1879.method4886();
	}

	public boolean method2099() {
		return this.aBoolean7344;
	}

	public boolean method2113() {
		return this.aBoolean7344;
	}

	public void method2120(int arg0) {
		this.aClass105_7354.method1250();
	}

	public int method2105() {
		return 4;
	}

	public Class192_Sub1(Class_ra_Sub2 arg0) {
		super(arg0);
	}

	public void method2104(int arg0, Class76_Sub2 arg1, Interface11_Impl3 arg2, Interface8_Impl1_Impl1 arg3, Interface11_Impl3 arg4) {
		float var6 = this.aClass_ra_Sub2_1879.method4901();
		float var7 = (float) arg1.method856();
		float var8 = (float) arg1.method857();
		Interface11_Impl3 var9 = arg2;
		float var10 = var6 * 2.0F / var7;
		float var11 = -var6 * 2.0F / var8;
		float[] var12 = new float[] { -1.0F + var10, var11 + 1.0F, 0.0F, 0.0F, -1.0F + var10, -3.0F + var11, 0.0F, 2.0F, var10 + 3.0F, var11 + 1.0F, 2.0F, 0.0F };
		int var13 = (int) var7;
		int var14 = (int) var8;
		int var15 = var13;
		int var16 = var14;
		if (arg0 == 0) {
			var13 = 256;
			var14 = 256;
			this.aClass105_7354.method1258(this.aClass123_7345);
			this.aClass105_7354.method1249();
		} else if (arg0 == 1) {
			var13 = 256;
			var14 = 256;
			var15 = var13;
			var16 = var14;
			this.aClass105_7354.method1258(this.aClass123_7355);
			this.aClass105_7354.method1249();
			this.aClass105_7354.method1262(this.aClass330_Sub15_Sub1_7351, aFloat7342 / var7, 0.0F, (byte) 95);
		} else if (arg0 == 2) {
			var13 = 256;
			var14 = 256;
			var15 = var13;
			var16 = var14;
			this.aClass105_7354.method1258(this.aClass123_7355);
			this.aClass105_7354.method1249();
			this.aClass105_7354.method1262(this.aClass330_Sub15_Sub1_7351, 0.0F, aFloat7342 / var8, (byte) 78);
		} else if (arg0 == 3) {
			this.aClass105_7354.method1258(this.aClass123_7347);
			var9 = arg4;
			this.aClass105_7354.method1270(this.aClass330_Sub15_Sub1_7350, 1, arg2, (byte) 116);
			this.aClass105_7354.method1249();
		}
		float var17 = (float) var13 / var7;
		float var18 = (float) var14 / var8;
		float var19 = (float) var15 / var7;
		float var20 = (float) var16 / var8;
		var12[8] = (var12[8] + 1.0F) * var17 - 1.0F;
		var12[5] = (var12[5] - 1.0F) * var18 + 1.0F;
		var12[10] *= var19;
		var12[7] *= var20;
		this.aClass105_7354.method1267(this.aClass330_Sub15_Sub1_7338, var12, -738302762);
		this.aClass105_7354.method1270(this.aClass330_Sub15_Sub1_7349, 0, var9, (byte) 121);
		this.aClass105_7354.method1264(this.aClass330_Sub15_Sub1_7352, aFloat7341, aFloat7339, aFloat7340, 0.0F, -187379429);
		this.aClass105_7354.method1264(this.aClass330_Sub15_Sub1_7353, 0.0F, 0.0F, 256.0F / var7, 256.0F / var8, 234403533);
		this.aClass_ra_Sub2_1879.ae(0, 0, var13, var14);
		this.aClass_ra_Sub2_1879.r(0, 0, var13, var14);
	}

	public void method2123(int arg0, Class76_Sub2 arg1, Interface11_Impl3 arg2, Interface8_Impl1_Impl1 arg3, Interface11_Impl3 arg4) {
		float var6 = this.aClass_ra_Sub2_1879.method4901();
		float var7 = (float) arg1.method856();
		float var8 = (float) arg1.method857();
		Interface11_Impl3 var9 = arg2;
		float var10 = var6 * 2.0F / var7;
		float var11 = -var6 * 2.0F / var8;
		float[] var12 = new float[] { -1.0F + var10, var11 + 1.0F, 0.0F, 0.0F, -1.0F + var10, -3.0F + var11, 0.0F, 2.0F, var10 + 3.0F, var11 + 1.0F, 2.0F, 0.0F };
		int var13 = (int) var7;
		int var14 = (int) var8;
		int var15 = var13;
		int var16 = var14;
		if (arg0 == 0) {
			var13 = 256;
			var14 = 256;
			this.aClass105_7354.method1258(this.aClass123_7345);
			this.aClass105_7354.method1249();
		} else if (arg0 == 1) {
			var13 = 256;
			var14 = 256;
			var15 = var13;
			var16 = var14;
			this.aClass105_7354.method1258(this.aClass123_7355);
			this.aClass105_7354.method1249();
			this.aClass105_7354.method1262(this.aClass330_Sub15_Sub1_7351, aFloat7342 / var7, 0.0F, (byte) 89);
		} else if (arg0 == 2) {
			var13 = 256;
			var14 = 256;
			var15 = var13;
			var16 = var14;
			this.aClass105_7354.method1258(this.aClass123_7355);
			this.aClass105_7354.method1249();
			this.aClass105_7354.method1262(this.aClass330_Sub15_Sub1_7351, 0.0F, aFloat7342 / var8, (byte) 73);
		} else if (arg0 == 3) {
			this.aClass105_7354.method1258(this.aClass123_7347);
			var9 = arg4;
			this.aClass105_7354.method1270(this.aClass330_Sub15_Sub1_7350, 1, arg2, (byte) 16);
			this.aClass105_7354.method1249();
		}
		float var17 = (float) var13 / var7;
		float var18 = (float) var14 / var8;
		float var19 = (float) var15 / var7;
		float var20 = (float) var16 / var8;
		var12[8] = (var12[8] + 1.0F) * var17 - 1.0F;
		var12[5] = (var12[5] - 1.0F) * var18 + 1.0F;
		var12[10] *= var19;
		var12[7] *= var20;
		this.aClass105_7354.method1267(this.aClass330_Sub15_Sub1_7338, var12, -468052265);
		this.aClass105_7354.method1270(this.aClass330_Sub15_Sub1_7349, 0, var9, (byte) 7);
		this.aClass105_7354.method1264(this.aClass330_Sub15_Sub1_7352, aFloat7341, aFloat7339, aFloat7340, 0.0F, -134148007);
		this.aClass105_7354.method1264(this.aClass330_Sub15_Sub1_7353, 0.0F, 0.0F, 256.0F / var7, 256.0F / var8, 1472371638);
		this.aClass_ra_Sub2_1879.ae(0, 0, var13, var14);
		this.aClass_ra_Sub2_1879.r(0, 0, var13, var14);
	}

	public boolean method2121() {
		return this.aBoolean7344;
	}

	public void method2126(int arg0, Class76_Sub2 arg1, Interface11_Impl3 arg2, Interface8_Impl1_Impl1 arg3, Interface11_Impl3 arg4) {
		float var6 = this.aClass_ra_Sub2_1879.method4901();
		float var7 = (float) arg1.method856();
		float var8 = (float) arg1.method857();
		Interface11_Impl3 var9 = arg2;
		float var10 = var6 * 2.0F / var7;
		float var11 = -var6 * 2.0F / var8;
		float[] var12 = new float[] { -1.0F + var10, var11 + 1.0F, 0.0F, 0.0F, -1.0F + var10, -3.0F + var11, 0.0F, 2.0F, var10 + 3.0F, var11 + 1.0F, 2.0F, 0.0F };
		int var13 = (int) var7;
		int var14 = (int) var8;
		int var15 = var13;
		int var16 = var14;
		if (arg0 == 0) {
			var13 = 256;
			var14 = 256;
			this.aClass105_7354.method1258(this.aClass123_7345);
			this.aClass105_7354.method1249();
		} else if (arg0 == 1) {
			var13 = 256;
			var14 = 256;
			var15 = var13;
			var16 = var14;
			this.aClass105_7354.method1258(this.aClass123_7355);
			this.aClass105_7354.method1249();
			this.aClass105_7354.method1262(this.aClass330_Sub15_Sub1_7351, aFloat7342 / var7, 0.0F, (byte) 107);
		} else if (arg0 == 2) {
			var13 = 256;
			var14 = 256;
			var15 = var13;
			var16 = var14;
			this.aClass105_7354.method1258(this.aClass123_7355);
			this.aClass105_7354.method1249();
			this.aClass105_7354.method1262(this.aClass330_Sub15_Sub1_7351, 0.0F, aFloat7342 / var8, (byte) 48);
		} else if (arg0 == 3) {
			this.aClass105_7354.method1258(this.aClass123_7347);
			var9 = arg4;
			this.aClass105_7354.method1270(this.aClass330_Sub15_Sub1_7350, 1, arg2, (byte) 100);
			this.aClass105_7354.method1249();
		}
		float var17 = (float) var13 / var7;
		float var18 = (float) var14 / var8;
		float var19 = (float) var15 / var7;
		float var20 = (float) var16 / var8;
		var12[8] = (var12[8] + 1.0F) * var17 - 1.0F;
		var12[5] = (var12[5] - 1.0F) * var18 + 1.0F;
		var12[10] *= var19;
		var12[7] *= var20;
		this.aClass105_7354.method1267(this.aClass330_Sub15_Sub1_7338, var12, -1774497982);
		this.aClass105_7354.method1270(this.aClass330_Sub15_Sub1_7349, 0, var9, (byte) 118);
		this.aClass105_7354.method1264(this.aClass330_Sub15_Sub1_7352, aFloat7341, aFloat7339, aFloat7340, 0.0F, 489186722);
		this.aClass105_7354.method1264(this.aClass330_Sub15_Sub1_7353, 0.0F, 0.0F, 256.0F / var7, 256.0F / var8, -922719645);
		this.aClass_ra_Sub2_1879.ae(0, 0, var13, var14);
		this.aClass_ra_Sub2_1879.r(0, 0, var13, var14);
	}

	public boolean method2109() {
		return this.aBoolean7344;
	}

	public boolean method2110() {
		if (!this.method2128()) {
			return false;
		}
		this.aClass105_7354 = this.aClass_ra_Sub2_1879.method4888("FilterBloom");
		if (this.aClass105_7354 == null) {
			return false;
		}
		try {
			this.aClass330_Sub15_Sub1_7349 = this.aClass105_7354.method1295("sceneTex", (byte) -12);
			this.aClass330_Sub15_Sub1_7350 = this.aClass105_7354.method1295("bloomTex1", (byte) -8);
			this.aClass330_Sub15_Sub1_7352 = this.aClass105_7354.method1295("params", (byte) -24);
			this.aClass330_Sub15_Sub1_7351 = this.aClass105_7354.method1295("sampleSize", (byte) -123);
			this.aClass330_Sub15_Sub1_7353 = this.aClass105_7354.method1295("pixelOffsetAndBloomScale", (byte) -55);
			this.aClass330_Sub15_Sub1_7338 = this.aClass105_7354.method1295("PosAndTexCoords", (byte) -106);
			this.aClass105_7354.method1254("test", -335117481);
			this.aClass123_7343 = this.aClass105_7354.method1254("techFullscreenTri", 1848981497);
			this.aClass123_7345 = this.aClass105_7354.method1254("brightpass", 598092328);
			this.aClass123_7355 = this.aClass105_7354.method1254("blur", -1092593792);
			this.aClass123_7347 = this.aClass105_7354.method1254("composite", -1644520841);
			this.aClass123_7348 = this.aClass105_7354.method1254("techDefault", -939790492);
		} catch (Exception_Sub2_Sub2 var2) {
			return false;
		} catch (Exception_Sub2_Sub1 var3) {
			return false;
		}
		if (!this.aClass123_7343.method1454()) {
			return false;
		} else if (!this.aClass123_7345.method1454()) {
			return false;
		} else if (!this.aClass123_7355.method1454()) {
			return false;
		} else if (!this.aClass123_7347.method1454()) {
			return false;
		} else if (this.aClass123_7348.method1454()) {
			this.aBoolean7344 = true;
			return true;
		} else {
			return false;
		}
	}

	public boolean method2111() {
		return this.aBoolean7344;
	}

	public void method2114() {
	}

	public void method2108() {
	}

	public int method2107() {
		return 1;
	}

	public void method2100() {
	}

	public int method2129() {
		return 4;
	}

	public void method2116(int arg0, int arg1) {
	}

	public void method2117(int arg0, int arg1) {
	}

	public boolean method2112() {
		if (!this.method2128()) {
			return false;
		}
		this.aClass105_7354 = this.aClass_ra_Sub2_1879.method4888("FilterBloom");
		if (this.aClass105_7354 == null) {
			return false;
		}
		try {
			this.aClass330_Sub15_Sub1_7349 = this.aClass105_7354.method1295("sceneTex", (byte) -64);
			this.aClass330_Sub15_Sub1_7350 = this.aClass105_7354.method1295("bloomTex1", (byte) -113);
			this.aClass330_Sub15_Sub1_7352 = this.aClass105_7354.method1295("params", (byte) -39);
			this.aClass330_Sub15_Sub1_7351 = this.aClass105_7354.method1295("sampleSize", (byte) -59);
			this.aClass330_Sub15_Sub1_7353 = this.aClass105_7354.method1295("pixelOffsetAndBloomScale", (byte) -14);
			this.aClass330_Sub15_Sub1_7338 = this.aClass105_7354.method1295("PosAndTexCoords", (byte) -8);
			this.aClass105_7354.method1254("test", -1480986540);
			this.aClass123_7343 = this.aClass105_7354.method1254("techFullscreenTri", 220206553);
			this.aClass123_7345 = this.aClass105_7354.method1254("brightpass", -1834924054);
			this.aClass123_7355 = this.aClass105_7354.method1254("blur", -693825801);
			this.aClass123_7347 = this.aClass105_7354.method1254("composite", 518750803);
			this.aClass123_7348 = this.aClass105_7354.method1254("techDefault", 621422092);
		} catch (Exception_Sub2_Sub2 var2) {
			return false;
		} catch (Exception_Sub2_Sub1 var3) {
			return false;
		}
		if (!this.aClass123_7343.method1454()) {
			return false;
		} else if (!this.aClass123_7345.method1454()) {
			return false;
		} else if (!this.aClass123_7355.method1454()) {
			return false;
		} else if (!this.aClass123_7347.method1454()) {
			return false;
		} else if (this.aClass123_7348.method1454()) {
			this.aBoolean7344 = true;
			return true;
		} else {
			return false;
		}
	}

	public int method2130() {
		return 4;
	}

	public int method2131() {
		return 1;
	}

	public int method2132() {
		return 1;
	}

	public void method2103(int arg0, int arg1) {
	}

	public boolean method2119() {
		return this.aBoolean7344;
	}

	public void method2124(int arg0, Class76_Sub2 arg1, Interface11_Impl3 arg2, Interface8_Impl1_Impl1 arg3, Interface11_Impl3 arg4) {
		float var6 = this.aClass_ra_Sub2_1879.method4901();
		float var7 = (float) arg1.method856();
		float var8 = (float) arg1.method857();
		Interface11_Impl3 var9 = arg2;
		float var10 = var6 * 2.0F / var7;
		float var11 = -var6 * 2.0F / var8;
		float[] var12 = new float[] { -1.0F + var10, var11 + 1.0F, 0.0F, 0.0F, -1.0F + var10, -3.0F + var11, 0.0F, 2.0F, var10 + 3.0F, var11 + 1.0F, 2.0F, 0.0F };
		int var13 = (int) var7;
		int var14 = (int) var8;
		int var15 = var13;
		int var16 = var14;
		if (arg0 == 0) {
			var13 = 256;
			var14 = 256;
			this.aClass105_7354.method1258(this.aClass123_7345);
			this.aClass105_7354.method1249();
		} else if (arg0 == 1) {
			var13 = 256;
			var14 = 256;
			var15 = var13;
			var16 = var14;
			this.aClass105_7354.method1258(this.aClass123_7355);
			this.aClass105_7354.method1249();
			this.aClass105_7354.method1262(this.aClass330_Sub15_Sub1_7351, aFloat7342 / var7, 0.0F, (byte) 42);
		} else if (arg0 == 2) {
			var13 = 256;
			var14 = 256;
			var15 = var13;
			var16 = var14;
			this.aClass105_7354.method1258(this.aClass123_7355);
			this.aClass105_7354.method1249();
			this.aClass105_7354.method1262(this.aClass330_Sub15_Sub1_7351, 0.0F, aFloat7342 / var8, (byte) 71);
		} else if (arg0 == 3) {
			this.aClass105_7354.method1258(this.aClass123_7347);
			var9 = arg4;
			this.aClass105_7354.method1270(this.aClass330_Sub15_Sub1_7350, 1, arg2, (byte) 116);
			this.aClass105_7354.method1249();
		}
		float var17 = (float) var13 / var7;
		float var18 = (float) var14 / var8;
		float var19 = (float) var15 / var7;
		float var20 = (float) var16 / var8;
		var12[8] = (var12[8] + 1.0F) * var17 - 1.0F;
		var12[5] = (var12[5] - 1.0F) * var18 + 1.0F;
		var12[10] *= var19;
		var12[7] *= var20;
		this.aClass105_7354.method1267(this.aClass330_Sub15_Sub1_7338, var12, -652851859);
		this.aClass105_7354.method1270(this.aClass330_Sub15_Sub1_7349, 0, var9, (byte) 116);
		this.aClass105_7354.method1264(this.aClass330_Sub15_Sub1_7352, aFloat7341, aFloat7339, aFloat7340, 0.0F, 1967515417);
		this.aClass105_7354.method1264(this.aClass330_Sub15_Sub1_7353, 0.0F, 0.0F, 256.0F / var7, 256.0F / var8, -1064840047);
		this.aClass_ra_Sub2_1879.ae(0, 0, var13, var14);
		this.aClass_ra_Sub2_1879.r(0, 0, var13, var14);
	}

	public void method2125(int arg0, Class76_Sub2 arg1, Interface11_Impl3 arg2, Interface8_Impl1_Impl1 arg3, Interface11_Impl3 arg4) {
		float var6 = this.aClass_ra_Sub2_1879.method4901();
		float var7 = (float) arg1.method856();
		float var8 = (float) arg1.method857();
		Interface11_Impl3 var9 = arg2;
		float var10 = var6 * 2.0F / var7;
		float var11 = -var6 * 2.0F / var8;
		float[] var12 = new float[] { -1.0F + var10, var11 + 1.0F, 0.0F, 0.0F, -1.0F + var10, -3.0F + var11, 0.0F, 2.0F, var10 + 3.0F, var11 + 1.0F, 2.0F, 0.0F };
		int var13 = (int) var7;
		int var14 = (int) var8;
		int var15 = var13;
		int var16 = var14;
		if (arg0 == 0) {
			var13 = 256;
			var14 = 256;
			this.aClass105_7354.method1258(this.aClass123_7345);
			this.aClass105_7354.method1249();
		} else if (arg0 == 1) {
			var13 = 256;
			var14 = 256;
			var15 = var13;
			var16 = var14;
			this.aClass105_7354.method1258(this.aClass123_7355);
			this.aClass105_7354.method1249();
			this.aClass105_7354.method1262(this.aClass330_Sub15_Sub1_7351, aFloat7342 / var7, 0.0F, (byte) 77);
		} else if (arg0 == 2) {
			var13 = 256;
			var14 = 256;
			var15 = var13;
			var16 = var14;
			this.aClass105_7354.method1258(this.aClass123_7355);
			this.aClass105_7354.method1249();
			this.aClass105_7354.method1262(this.aClass330_Sub15_Sub1_7351, 0.0F, aFloat7342 / var8, (byte) 35);
		} else if (arg0 == 3) {
			this.aClass105_7354.method1258(this.aClass123_7347);
			var9 = arg4;
			this.aClass105_7354.method1270(this.aClass330_Sub15_Sub1_7350, 1, arg2, (byte) 25);
			this.aClass105_7354.method1249();
		}
		float var17 = (float) var13 / var7;
		float var18 = (float) var14 / var8;
		float var19 = (float) var15 / var7;
		float var20 = (float) var16 / var8;
		var12[8] = (var12[8] + 1.0F) * var17 - 1.0F;
		var12[5] = (var12[5] - 1.0F) * var18 + 1.0F;
		var12[10] *= var19;
		var12[7] *= var20;
		this.aClass105_7354.method1267(this.aClass330_Sub15_Sub1_7338, var12, -613379005);
		this.aClass105_7354.method1270(this.aClass330_Sub15_Sub1_7349, 0, var9, (byte) 44);
		this.aClass105_7354.method1264(this.aClass330_Sub15_Sub1_7352, aFloat7341, aFloat7339, aFloat7340, 0.0F, 1600105292);
		this.aClass105_7354.method1264(this.aClass330_Sub15_Sub1_7353, 0.0F, 0.0F, 256.0F / var7, 256.0F / var8, 1752044431);
		this.aClass_ra_Sub2_1879.ae(0, 0, var13, var14);
		this.aClass_ra_Sub2_1879.r(0, 0, var13, var14);
	}

	public void method2101() {
	}

	public void method2118(int arg0) {
		this.aClass105_7354.method1250();
	}

	public void method2127(int arg0) {
		this.aClass105_7354.method1250();
	}
}
