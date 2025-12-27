package deob;

public class Class61_Sub1 extends Class61 {

	public boolean aBoolean9305;

	public int anInt9313;

	public int anInt9308;

	public int anInt9303;

	public int anInt9300;

	public Class_ra_Sub2 aClass_ra_Sub2_9309;

	public int anInt9306;

	public int anInt9304;

	public Interface11_Impl3 anInterface11_Impl3_9301;

	public Interface8_Impl1_Impl2 anInterface8_Impl1_Impl2_9302;

	public boolean aBoolean9310;

	public boolean aBoolean9311;

	public boolean aBoolean9312;

	public boolean aBoolean9307;

	public Class61_Sub1(Class_ra_Sub2 arg0, Interface11_Impl3 arg1, int arg2, int arg3) {
		this.aBoolean9305 = false;
		this.anInt9313 = 0;
		this.anInt9308 = 0;
		this.anInt9303 = 0;
		this.anInt9300 = 0;
		this.aClass_ra_Sub2_9309 = arg0;
		this.anInt9306 = arg2;
		this.anInt9304 = arg3;
		this.anInterface11_Impl3_9301 = arg1;
		this.anInterface8_Impl1_Impl2_9302 = null;
		this.aBoolean9310 = this.anInterface11_Impl3_9301.method137() != arg2;
		this.aBoolean9311 = this.anInterface11_Impl3_9301.method108() != arg3;
		this.aBoolean9312 = !this.aBoolean9310 && this.anInterface11_Impl3_9301.method113();
		this.aBoolean9307 = !this.aBoolean9311 && this.anInterface11_Impl3_9301.method113();
		this.aClass_ra_Sub2_9309.method4894(12);
	}

	public Class61_Sub1(Class_ra_Sub2 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
		this.aBoolean9305 = false;
		this.anInt9313 = 0;
		this.anInt9308 = 0;
		this.anInt9303 = 0;
		this.anInt9300 = 0;
		this.aClass_ra_Sub2_9309 = arg0;
		this.anInt9306 = arg1;
		this.anInt9304 = arg2;
		this.anInterface8_Impl1_Impl2_9302 = null;
		this.anInterface11_Impl3_9301 = arg0.method4950(arg1, arg2, false, arg3, arg4, arg5);
		this.anInterface11_Impl3_9301.method109(true, true);
		this.aBoolean9310 = this.anInterface11_Impl3_9301.method137() != arg1;
		this.aBoolean9311 = this.anInterface11_Impl3_9301.method108() != arg2;
		this.aBoolean9312 = !this.aBoolean9310 && this.anInterface11_Impl3_9301.method113();
		this.aBoolean9307 = !this.aBoolean9311 && this.anInterface11_Impl3_9301.method113();
		this.aClass_ra_Sub2_9309.method4894(12);
	}

	public Class61_Sub1(Class_ra_Sub2 arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
		this.aBoolean9305 = false;
		this.anInt9313 = 0;
		this.anInt9308 = 0;
		this.anInt9303 = 0;
		this.anInt9300 = 0;
		this.aClass_ra_Sub2_9309 = arg0;
		this.anInt9306 = arg1;
		this.anInt9304 = arg2;
		if (arg4) {
			Interface11_Impl3_Impl1 var6 = arg0.method4953(arg3 ? Class72.aClass72_620 : Class72.aClass72_614, Class86.aClass86_714, arg1, arg2);
			this.anInterface8_Impl1_Impl2_9302 = var6.method169(0);
			this.anInterface11_Impl3_9301 = var6;
		} else {
			this.anInterface11_Impl3_9301 = arg0.method4904(arg3 ? Class72.aClass72_620 : Class72.aClass72_614, Class86.aClass86_714, arg1, arg2);
			this.anInterface8_Impl1_Impl2_9302 = null;
		}
		this.anInterface11_Impl3_9301.method109(true, true);
		this.aBoolean9310 = this.anInterface11_Impl3_9301.method137() != arg1;
		this.aBoolean9311 = this.anInterface11_Impl3_9301.method108() != arg2;
		this.aBoolean9312 = !this.aBoolean9310 && this.anInterface11_Impl3_9301.method113();
		this.aBoolean9307 = !this.aBoolean9311 && this.anInterface11_Impl3_9301.method113();
		this.aClass_ra_Sub2_9309.method4894(12);
	}

	public void method738(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		this.anInterface11_Impl3_9301.method118(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	public void method694(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var13;
		int var14;
		int var15;
		int var16;
		if (this.aClass_ra_Sub2_9309.method4903() != Class161.aClass161_1688) {
			int var8 = arg1 + arg3;
			int var9 = arg0 + arg2;
			int var10 = this.method318();
			int var11 = this.method683();
			int var12 = arg1 + this.anInt9313;
			for (var13 = var12 + this.anInt9304; var13 <= var8; var13 += var11) {
				var14 = arg0 + this.anInt9308;
				for (var15 = var14 + this.anInt9306; var15 <= var9; var15 += var10) {
					this.aClass_ra_Sub2_9309.aClass187_8556.method2086((float) var14, (float) var12, (float) (var14 + this.anInt9306), (float) (var12 + this.anInt9304), 0.0F, 0.0F, this.anInterface11_Impl3_9301.method123(), this.anInterface11_Impl3_9301.method114(), this.anInterface11_Impl3_9301, arg5);
					var14 += var10;
				}
				if (var14 < var9) {
					var15 = var9 - var14;
					this.aClass_ra_Sub2_9309.aClass187_8556.method2086((float) var14, (float) var12, (float) (var14 + var15), (float) (var12 + this.anInt9304), 0.0F, 0.0F, (float) var15 / (float) this.anInt9306 * this.anInterface11_Impl3_9301.method123(), this.anInterface11_Impl3_9301.method114(), this.anInterface11_Impl3_9301, arg5);
				}
				var12 += var11;
			}
			if (var12 < var8) {
				var13 = var8 - var12;
				float var26 = (float) var13 / (float) this.anInt9304 * this.anInterface11_Impl3_9301.method114();
				var15 = arg0 + this.anInt9308;
				for (var16 = var15 + this.anInt9306; var16 <= var9; var16 += var10) {
					this.aClass_ra_Sub2_9309.aClass187_8556.method2086((float) var15, (float) var12, (float) (var15 + this.anInt9306), (float) (var12 + var13), 0.0F, 0.0F, this.anInterface11_Impl3_9301.method123(), var26, this.anInterface11_Impl3_9301, arg5);
					var15 += var10;
				}
				if (var15 < var9) {
					var16 = var9 - var15;
					this.aClass_ra_Sub2_9309.aClass187_8556.method2086((float) var15, (float) var12, (float) (var15 + var16), (float) (var12 + var13), 0.0F, 0.0F, (float) var16 / (float) this.anInt9306 * this.anInterface11_Impl3_9301.method123(), var26, this.anInterface11_Impl3_9301, arg5);
				}
			}
			return;
		}
		this.aClass_ra_Sub2_9309.method4925();
		this.aClass_ra_Sub2_9309.method4970(arg6);
		Class159 var21 = this.aClass_ra_Sub2_9309.aClass159_8590;
		var21.anInterface11_Impl3_1679 = this.anInterface11_Impl3_9301;
		var21.method1861(arg4, arg5);
		float var22 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method856();
		float var23 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method857();
		var21.anInterface9_Impl1_1678 = this.aClass_ra_Sub2_9309.anInterface9_Impl1_8600;
		var21.anInt1685 = 0;
		var21.aClass184_1686 = this.aClass_ra_Sub2_9309.aClass184_8603;
		boolean var24 = this.aBoolean9307 && this.anInt9313 == 0 && this.anInt9303 == 0;
		boolean var25 = this.aBoolean9312 && this.anInt9308 == 0 && this.anInt9300 == 0;
		if (var25 & var24) {
			var21.aClass249_1681.method2486((float) arg2 * 2.0F / var22, (float) arg3 * 2.0F / var23, 1.0F, 1.0F);
			var21.aClass249_1681.aFloatArray2631[12] = ((float) arg0 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
			var21.aClass249_1681.aFloatArray2631[13] = ((float) arg1 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
			var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
			var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) arg2), this.anInterface11_Impl3_9301.method104((float) arg3), 1.0F, 1.0F);
			var21.method1862();
		} else if (var25) {
			var13 = arg1 + arg3;
			var14 = this.method683();
			var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) arg2), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), 1.0F, 1.0F);
			var15 = arg1 + this.anInt9313;
			for (var16 = var15 + this.anInt9304; var16 <= var13; var16 += var14) {
				var21.aClass249_1681.method2486((float) arg2 * 2.0F / var22, (float) this.anInt9304 * 2.0F / var23, 1.0F, 1.0F);
				var21.aClass249_1681.aFloatArray2631[12] = ((float) arg0 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
				var21.aClass249_1681.aFloatArray2631[13] = ((float) var15 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
				var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
				var21.method1862();
				var15 += var14;
			}
			if (var15 < var13) {
				var16 = var13 - var15;
				var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) arg2), this.anInterface11_Impl3_9301.method104((float) var16), 1.0F, 1.0F);
				var21.aClass249_1681.method2486((float) arg2 * 2.0F / var22, (float) var16 * 2.0F / var23, 1.0F, 1.0F);
				var21.aClass249_1681.aFloatArray2631[12] = ((float) arg0 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
				var21.aClass249_1681.aFloatArray2631[13] = ((float) var15 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
				var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
				var21.method1862();
			}
		} else if (var24) {
			var13 = arg0 + arg2;
			var14 = this.method318();
			var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) arg3), 1.0F, 1.0F);
			var15 = arg0 + this.anInt9308;
			for (var16 = var15 + this.anInt9306; var16 <= var13; var16 += var14) {
				var21.aClass249_1681.method2486((float) this.anInt9306 * 2.0F / var22, (float) arg3 * 2.0F / var23, 1.0F, 1.0F);
				var21.aClass249_1681.aFloatArray2631[12] = ((float) var15 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
				var21.aClass249_1681.aFloatArray2631[13] = ((float) arg1 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
				var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
				var21.method1862();
				var15 += var14;
			}
			if (var15 < var13) {
				var16 = var13 - var15;
				var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) var16), this.anInterface11_Impl3_9301.method104((float) arg3), 1.0F, 1.0F);
				var21.aClass249_1681.method2486((float) var16 * 2.0F / var22, (float) arg3 * 2.0F / var23, 1.0F, 1.0F);
				var21.aClass249_1681.aFloatArray2631[12] = ((float) var15 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
				var21.aClass249_1681.aFloatArray2631[13] = ((float) arg1 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
				var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
				var21.method1862();
			}
		} else {
			var13 = arg1 + arg3;
			var14 = arg0 + arg2;
			var15 = this.method318();
			var16 = this.method683();
			int var17 = arg1 + this.anInt9313;
			int var18;
			int var19;
			int var20;
			for (var18 = var17 + this.anInt9304; var18 <= var13; var18 += var16) {
				var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), 1.0F, 1.0F);
				var19 = arg0 + this.anInt9308;
				for (var20 = var19 + this.anInt9306; var20 <= var14; var20 += var15) {
					var21.aClass249_1681.method2486((float) this.anInt9306 * 2.0F / var22, (float) this.anInt9304 * 2.0F / var23, 1.0F, 1.0F);
					var21.aClass249_1681.aFloatArray2631[12] = ((float) var19 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
					var21.aClass249_1681.aFloatArray2631[13] = ((float) var17 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
					var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
					var21.method1862();
					var19 += var15;
				}
				if (var19 < var14) {
					var20 = var14 - var19;
					var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) var20), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), 1.0F, 1.0F);
					var21.aClass249_1681.method2486((float) var20 * 2.0F / var22, (float) this.anInt9304 * 2.0F / var23, 1.0F, 1.0F);
					var21.aClass249_1681.aFloatArray2631[12] = ((float) var19 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
					var21.aClass249_1681.aFloatArray2631[13] = ((float) var17 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
					var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
					var21.method1862();
				}
				var17 += var16;
			}
			if (var17 < var13) {
				var18 = var13 - var17;
				var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) var18), 1.0F, 1.0F);
				var19 = arg0 + this.anInt9308;
				for (var20 = var19 + this.anInt9306; var20 <= var14; var20 += var15) {
					var21.aClass249_1681.method2486((float) this.anInt9306 * 2.0F / var22, (float) var18 * 2.0F / var23, 1.0F, 1.0F);
					var21.aClass249_1681.aFloatArray2631[12] = ((float) var19 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
					var21.aClass249_1681.aFloatArray2631[13] = ((float) var17 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
					var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
					var21.method1862();
					var19 += var15;
				}
				if (var19 < var14) {
					var20 = var14 - var19;
					var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) var20), this.anInterface11_Impl3_9301.method104((float) var18), 1.0F, 1.0F);
					var21.aClass249_1681.method2486((float) var20 * 2.0F / var22, (float) var18 * 2.0F / var23, 1.0F, 1.0F);
					var21.aClass249_1681.aFloatArray2631[12] = ((float) var19 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
					var21.aClass249_1681.aFloatArray2631[13] = ((float) var17 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
					var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
					var21.method1862();
				}
			}
		}
	}

	public Class61_Sub1(Class_ra_Sub2 arg0, Interface11_Impl3 arg1) {
		this(arg0, arg1, arg1.method137(), arg1.method108());
	}

	public void method722(int arg0, int arg1, int arg2) {
		int[] var4 = this.aClass_ra_Sub2_9309.ar(arg0, arg1, this.anInt9306, this.anInt9304);
		int[] var5 = new int[this.anInt9306 * this.anInt9304];
		this.anInterface11_Impl3_9301.method110(0, 0, this.anInt9306, this.anInt9304, var5, 0);
		int var6;
		int var7;
		int var8;
		if (arg2 == 0) {
			for (var6 = 0; var6 < this.anInt9304; var6++) {
				var7 = var6 * this.anInt9306;
				for (var8 = 0; var8 < this.anInt9306; var8++) {
					var5[var7 + var8] = var5[var7 + var8] & 0xFFFFFF | (var4[var7 + var8] & 0xFF0000) << 8;
				}
			}
		} else if (arg2 == 1) {
			for (var6 = 0; var6 < this.anInt9304; var6++) {
				var7 = var6 * this.anInt9306;
				for (var8 = 0; var8 < this.anInt9306; var8++) {
					var5[var7 + var8] = var5[var7 + var8] & 0xFFFFFF | (var4[var7 + var8] & 0xFF00) << 16;
				}
			}
		} else if (arg2 == 2) {
			for (var6 = 0; var6 < this.anInt9304; var6++) {
				var7 = var6 * this.anInt9306;
				for (var8 = 0; var8 < this.anInt9306; var8++) {
					var5[var7 + var8] = var5[var7 + var8] & 0xFFFFFF | (var4[var7 + var8] & 0xFF) << 24;
				}
			}
		} else if (arg2 == 3) {
			for (var6 = 0; var6 < this.anInt9304; var6++) {
				var7 = var6 * this.anInt9306;
				for (var8 = 0; var8 < this.anInt9306; var8++) {
					var5[var7 + var8] = var5[var7 + var8] & 0xFFFFFF | (var4[var7 + var8] == 0 ? 0 : -16777216);
				}
			}
		}
		this.method738(0, 0, this.anInt9306, this.anInt9304, var5, 0, this.anInt9306);
	}

	public void method717(int arg0, int arg1, int arg2, int arg3) {
		this.anInt9308 = arg0;
		this.anInt9313 = arg1;
		this.anInt9300 = arg2;
		this.anInt9303 = arg3;
		this.aBoolean9305 = this.anInt9308 != 0 || this.anInt9313 != 0 || this.anInt9300 != 0 || this.anInt9303 != 0;
	}

	public void method680(int[] arg0) {
		arg0[0] = this.anInt9308;
		arg0[1] = this.anInt9313;
		arg0[2] = this.anInt9300;
		arg0[3] = this.anInt9303;
	}

	public int method681() {
		return this.anInt9306;
	}

	public int method318() {
		return this.anInt9306 + this.anInt9308 + this.anInt9300;
	}

	public int method682() {
		return this.anInt9304;
	}

	public int method683() {
		return this.anInt9304 + this.anInt9313 + this.anInt9303;
	}

	public Interface8_Impl1_Impl2 method684() {
		return this.anInterface8_Impl1_Impl2_9302;
	}

	public int method315() {
		return this.anInt9306 + this.anInt9308 + this.anInt9300;
	}

	public void method737(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int[] var7 = this.aClass_ra_Sub2_9309.ar(arg4, arg5, arg2, arg3);
		if (var7 != null) {
			for (int var8 = 0; var8 < var7.length; var8++) {
				var7[var8] |= 0xFF000000;
			}
			this.method738(arg0, arg1, arg2, arg3, var7, 0, arg2);
		}
	}

	public void method689(int arg0, int arg1, Class_ta arg2, int arg3, int arg4) {
		this.aClass_ra_Sub2_9309.method4925();
		Class159 var6 = this.aClass_ra_Sub2_9309.aClass159_8590;
		var6.anInterface11_Impl3_1679 = this.anInterface11_Impl3_9301;
		var6.method1861(1, -1);
		int var10 = arg0 + this.anInt9308;
		int var11 = arg1 + this.anInt9313;
		float var7 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method856();
		float var8 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method857();
		var6.aClass249_1681.method2486((float) this.anInt9306 * 2.0F / var7, (float) this.anInt9304 * 2.0F / var8, 1.0F, 1.0F);
		var6.aClass249_1681.aFloatArray2631[12] = ((float) var10 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var7 - 1.0F;
		var6.aClass249_1681.aFloatArray2631[13] = ((float) var11 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var8 - 1.0F;
		var6.aClass249_1681.aFloatArray2631[14] = -1.0F;
		var6.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), 1.0F, 1.0F);
		var6.anInterface9_Impl1_1678 = this.aClass_ra_Sub2_9309.anInterface9_Impl1_8600;
		var6.anInt1685 = 0;
		var6.aClass184_1686 = this.aClass_ra_Sub2_9309.aClass184_8603;
		Interface11_Impl3 var9 = ((Class_ta_Sub1) arg2).anInterface11_Impl3_8659;
		var6.anInterface11_Impl3_1680 = var9;
		var6.aClass249_1683.method2486(var9.method106((float) this.anInt9306), var9.method104((float) this.anInt9304), 1.0F, 1.0F);
		var6.aClass249_1683.aFloatArray2631[12] = var9.method106((float) (var10 - arg3));
		var6.aClass249_1683.aFloatArray2631[13] = var9.method104((float) (var11 - arg4));
		var6.method1864();
	}

	public void method720(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, Class_ta arg7, int arg8, int arg9) {
		this.aClass_ra_Sub2_9309.method4925();
		Class159 var11 = this.aClass_ra_Sub2_9309.aClass159_8590;
		var11.anInterface11_Impl3_1679 = this.anInterface11_Impl3_9301;
		var11.method1861(1, -1);
		float var12 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method856();
		float var13 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method857();
		var11.aClass249_1681.method2516();
		if (this.aBoolean9305) {
			float var14 = (float) this.anInt9306 / (float) this.method318();
			float var15 = (float) this.anInt9304 / (float) this.method683();
			var11.aClass249_1681.aFloatArray2631[0] = (arg2 - arg0) * var14;
			var11.aClass249_1681.aFloatArray2631[1] = (arg3 - arg1) * var14;
			var11.aClass249_1681.aFloatArray2631[4] = (arg4 - arg0) * var15;
			var11.aClass249_1681.aFloatArray2631[5] = (arg5 - arg1) * var15;
			var11.aClass249_1681.aFloatArray2631[12] = (arg0 + (float) this.anInt9308) * var14 + this.aClass_ra_Sub2_9309.method4901();
			var11.aClass249_1681.aFloatArray2631[13] = (arg1 + (float) this.anInt9313) * var15 + this.aClass_ra_Sub2_9309.method4901();
		} else {
			var11.aClass249_1681.aFloatArray2631[0] = arg2 - arg0;
			var11.aClass249_1681.aFloatArray2631[1] = arg3 - arg1;
			var11.aClass249_1681.aFloatArray2631[4] = arg4 - arg0;
			var11.aClass249_1681.aFloatArray2631[5] = arg5 - arg1;
			var11.aClass249_1681.aFloatArray2631[12] = arg0 + this.aClass_ra_Sub2_9309.method4901();
			var11.aClass249_1681.aFloatArray2631[13] = arg1 + this.aClass_ra_Sub2_9309.method4901();
		}
		Class249 var16 = this.aClass_ra_Sub2_9309.aClass249_8576;
		var16.method2516();
		var16.aFloatArray2631[0] = 2.0F / var12;
		var16.aFloatArray2631[5] = 2.0F / var13;
		var16.aFloatArray2631[12] = -1.0F;
		var16.aFloatArray2631[13] = -1.0F;
		var16.aFloatArray2631[14] = -1.0F;
		var11.aClass249_1681.method2483(var16);
		var11.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), 1.0F, 1.0F);
		var11.anInterface9_Impl1_1678 = this.aClass_ra_Sub2_9309.anInterface9_Impl1_8600;
		var11.anInt1685 = 0;
		var11.aClass184_1686 = this.aClass_ra_Sub2_9309.aClass184_8603;
		Interface11_Impl3 var17 = ((Class_ta_Sub1) arg7).anInterface11_Impl3_8659;
		var11.anInterface11_Impl3_1680 = var17;
		var11.aClass249_1683.method2516();
		var11.aClass249_1683.aFloatArray2631[0] = (arg2 - arg0) * var17.method106(1.0F);
		var11.aClass249_1683.aFloatArray2631[1] = (arg3 - arg1) * var17.method106(1.0F);
		var11.aClass249_1683.aFloatArray2631[4] = (arg4 - arg0) * var17.method104(1.0F);
		var11.aClass249_1683.aFloatArray2631[5] = (arg5 - arg1) * var17.method104(1.0F);
		var11.aClass249_1683.aFloatArray2631[12] = (arg0 - (float) arg8) * var17.method106(1.0F);
		var11.aClass249_1683.aFloatArray2631[13] = (arg1 - (float) arg9) * var17.method104(1.0F);
		var11.method1864();
	}

	public int method693() {
		return this.anInt9304;
	}

	public void method735(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
		if (this.aClass_ra_Sub2_9309.method4903() != Class161.aClass161_1688) {
			this.aClass_ra_Sub2_9309.aClass187_8556.method2092(arg0, arg1, arg2, arg3, arg4, arg5, arg2 + arg4 - arg0, arg3 + arg5 - arg1, 0.0F, 0.0F, this.anInterface11_Impl3_9301.method123(), 0.0F, 0.0F, this.anInterface11_Impl3_9301.method114(), this.anInterface11_Impl3_9301.method123(), this.anInterface11_Impl3_9301.method114(), this.anInterface11_Impl3_9301, arg7);
			return;
		}
		this.aClass_ra_Sub2_9309.method4925();
		this.aClass_ra_Sub2_9309.method4970(arg8);
		float var12;
		float var13;
		if (this.aBoolean9305) {
			float var11 = (float) this.method318();
			var12 = this.method683();
			var13 = (arg2 - arg0) / var11;
			float var14 = (arg3 - arg1) / var11;
			float var15 = (arg4 - arg0) / var12;
			float var16 = (arg5 - arg1) / var12;
			float var17 = var15 * (float) this.anInt9313;
			float var18 = var16 * (float) this.anInt9313;
			float var19 = var13 * (float) this.anInt9308;
			float var20 = var14 * (float) this.anInt9308;
			float var21 = -var13 * (float) this.anInt9300;
			float var22 = -var14 * (float) this.anInt9300;
			float var23 = -var15 * (float) this.anInt9303;
			float var24 = -var16 * (float) this.anInt9303;
			arg0 = arg0 + var19 + var17;
			arg1 = arg1 + var20 + var18;
			arg2 = arg2 + var21 + var17;
			arg3 = arg3 + var22 + var18;
			arg4 = arg4 + var19 + var23;
			arg5 = arg5 + var20 + var24;
		}
		Class159 var25 = this.aClass_ra_Sub2_9309.aClass159_8590;
		var25.anInterface11_Impl3_1679 = this.anInterface11_Impl3_9301;
		var25.method1861(arg6, arg7);
		var12 = this.aClass_ra_Sub2_9309.method4782((byte) 0).method856();
		var13 = this.aClass_ra_Sub2_9309.method4782((byte) 0).method857();
		var25.aClass249_1681.method2516();
		var25.aClass249_1681.aFloatArray2631[0] = (arg2 - arg0) * 2.0F / var12;
		var25.aClass249_1681.aFloatArray2631[1] = (arg3 - arg1) * 2.0F / var13;
		var25.aClass249_1681.aFloatArray2631[4] = (arg4 - arg0) * 2.0F / var12;
		var25.aClass249_1681.aFloatArray2631[5] = (arg5 - arg1) * 2.0F / var13;
		var25.aClass249_1681.aFloatArray2631[12] = (arg0 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var12 - 1.0F;
		var25.aClass249_1681.aFloatArray2631[13] = (arg1 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var13 - 1.0F;
		var25.aClass249_1681.aFloatArray2631[14] = -1.0F;
		var25.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), 1.0F, 1.0F);
		var25.anInterface9_Impl1_1678 = this.aClass_ra_Sub2_9309.anInterface9_Impl1_8600;
		var25.anInt1685 = 0;
		var25.aClass184_1686 = this.aClass_ra_Sub2_9309.aClass184_8603;
		var25.method1862();
	}

	public void method703(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, Class_ta arg7, int arg8, int arg9) {
		this.aClass_ra_Sub2_9309.method4925();
		Class159 var11 = this.aClass_ra_Sub2_9309.aClass159_8590;
		var11.anInterface11_Impl3_1679 = this.anInterface11_Impl3_9301;
		var11.method1861(1, -1);
		float var12 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method856();
		float var13 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method857();
		var11.aClass249_1681.method2516();
		if (this.aBoolean9305) {
			float var14 = (float) this.anInt9306 / (float) this.method318();
			float var15 = (float) this.anInt9304 / (float) this.method683();
			var11.aClass249_1681.aFloatArray2631[0] = (arg2 - arg0) * var14;
			var11.aClass249_1681.aFloatArray2631[1] = (arg3 - arg1) * var14;
			var11.aClass249_1681.aFloatArray2631[4] = (arg4 - arg0) * var15;
			var11.aClass249_1681.aFloatArray2631[5] = (arg5 - arg1) * var15;
			var11.aClass249_1681.aFloatArray2631[12] = (arg0 + (float) this.anInt9308) * var14 + this.aClass_ra_Sub2_9309.method4901();
			var11.aClass249_1681.aFloatArray2631[13] = (arg1 + (float) this.anInt9313) * var15 + this.aClass_ra_Sub2_9309.method4901();
		} else {
			var11.aClass249_1681.aFloatArray2631[0] = arg2 - arg0;
			var11.aClass249_1681.aFloatArray2631[1] = arg3 - arg1;
			var11.aClass249_1681.aFloatArray2631[4] = arg4 - arg0;
			var11.aClass249_1681.aFloatArray2631[5] = arg5 - arg1;
			var11.aClass249_1681.aFloatArray2631[12] = arg0 + this.aClass_ra_Sub2_9309.method4901();
			var11.aClass249_1681.aFloatArray2631[13] = arg1 + this.aClass_ra_Sub2_9309.method4901();
		}
		Class249 var16 = this.aClass_ra_Sub2_9309.aClass249_8576;
		var16.method2516();
		var16.aFloatArray2631[0] = 2.0F / var12;
		var16.aFloatArray2631[5] = 2.0F / var13;
		var16.aFloatArray2631[12] = -1.0F;
		var16.aFloatArray2631[13] = -1.0F;
		var16.aFloatArray2631[14] = -1.0F;
		var11.aClass249_1681.method2483(var16);
		var11.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), 1.0F, 1.0F);
		var11.anInterface9_Impl1_1678 = this.aClass_ra_Sub2_9309.anInterface9_Impl1_8600;
		var11.anInt1685 = 0;
		var11.aClass184_1686 = this.aClass_ra_Sub2_9309.aClass184_8603;
		Interface11_Impl3 var17 = ((Class_ta_Sub1) arg7).anInterface11_Impl3_8659;
		var11.anInterface11_Impl3_1680 = var17;
		var11.aClass249_1683.method2516();
		var11.aClass249_1683.aFloatArray2631[0] = (arg2 - arg0) * var17.method106(1.0F);
		var11.aClass249_1683.aFloatArray2631[1] = (arg3 - arg1) * var17.method106(1.0F);
		var11.aClass249_1683.aFloatArray2631[4] = (arg4 - arg0) * var17.method104(1.0F);
		var11.aClass249_1683.aFloatArray2631[5] = (arg5 - arg1) * var17.method104(1.0F);
		var11.aClass249_1683.aFloatArray2631[12] = (arg0 - (float) arg8) * var17.method106(1.0F);
		var11.aClass249_1683.aFloatArray2631[13] = (arg1 - (float) arg9) * var17.method104(1.0F);
		var11.method1864();
	}

	public Interface8_Impl1_Impl2 method713() {
		return this.anInterface8_Impl1_Impl2_9302;
	}

	public void method705(int arg0, int arg1, int arg2) {
		int[] var4 = this.aClass_ra_Sub2_9309.ar(arg0, arg1, this.anInt9306, this.anInt9304);
		int[] var5 = new int[this.anInt9306 * this.anInt9304];
		this.anInterface11_Impl3_9301.method110(0, 0, this.anInt9306, this.anInt9304, var5, 0);
		int var6;
		int var7;
		int var8;
		if (arg2 == 0) {
			for (var6 = 0; var6 < this.anInt9304; var6++) {
				var7 = var6 * this.anInt9306;
				for (var8 = 0; var8 < this.anInt9306; var8++) {
					var5[var7 + var8] = var5[var7 + var8] & 0xFFFFFF | (var4[var7 + var8] & 0xFF0000) << 8;
				}
			}
		} else if (arg2 == 1) {
			for (var6 = 0; var6 < this.anInt9304; var6++) {
				var7 = var6 * this.anInt9306;
				for (var8 = 0; var8 < this.anInt9306; var8++) {
					var5[var7 + var8] = var5[var7 + var8] & 0xFFFFFF | (var4[var7 + var8] & 0xFF00) << 16;
				}
			}
		} else if (arg2 == 2) {
			for (var6 = 0; var6 < this.anInt9304; var6++) {
				var7 = var6 * this.anInt9306;
				for (var8 = 0; var8 < this.anInt9306; var8++) {
					var5[var7 + var8] = var5[var7 + var8] & 0xFFFFFF | (var4[var7 + var8] & 0xFF) << 24;
				}
			}
		} else if (arg2 == 3) {
			for (var6 = 0; var6 < this.anInt9304; var6++) {
				var7 = var6 * this.anInt9306;
				for (var8 = 0; var8 < this.anInt9306; var8++) {
					var5[var7 + var8] = var5[var7 + var8] & 0xFFFFFF | (var4[var7 + var8] == 0 ? 0 : -16777216);
				}
			}
		}
		this.method738(0, 0, this.anInt9306, this.anInt9304, var5, 0, this.anInt9306);
	}

	public int method714() {
		return this.anInt9306;
	}

	public void method685(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var9;
		int var10;
		if (this.aClass_ra_Sub2_9309.method4903() != Class161.aClass161_1688) {
			var9 = arg0 + this.anInt9308;
			var10 = arg1 + this.anInt9313;
			this.aClass_ra_Sub2_9309.aClass187_8556.method2086((float) var9, (float) var10, (float) (var9 + this.anInt9306), (float) (var10 + this.anInt9304), 0.0F, 0.0F, this.anInterface11_Impl3_9301.method123(), this.anInterface11_Impl3_9301.method114(), this.anInterface11_Impl3_9301, arg3);
			return;
		}
		this.aClass_ra_Sub2_9309.method4925();
		this.aClass_ra_Sub2_9309.method4970(arg4);
		Class159 var6 = this.aClass_ra_Sub2_9309.aClass159_8590;
		var6.anInterface11_Impl3_1679 = this.anInterface11_Impl3_9301;
		var6.method1861(arg2, arg3);
		var9 = arg0 + this.anInt9308;
		var10 = arg1 + this.anInt9313;
		float var7 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method856();
		float var8 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method857();
		var6.aClass249_1681.method2486((float) this.anInt9306 * 2.0F / var7, (float) this.anInt9304 * 2.0F / var8, 1.0F, 1.0F);
		var6.aClass249_1681.aFloatArray2631[12] = ((float) var9 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var7 - 1.0F;
		var6.aClass249_1681.aFloatArray2631[13] = ((float) var10 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var8 - 1.0F;
		var6.aClass249_1681.aFloatArray2631[14] = -1.0F;
		var6.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), 1.0F, 1.0F);
		var6.anInterface9_Impl1_1678 = this.aClass_ra_Sub2_9309.anInterface9_Impl1_8600;
		var6.anInt1685 = 0;
		var6.aClass184_1686 = this.aClass_ra_Sub2_9309.aClass184_8603;
		var6.method1862();
	}

	public int method702() {
		return this.anInt9306;
	}

	public Interface8_Impl1_Impl2 method678() {
		return this.anInterface8_Impl1_Impl2_9302;
	}

	public void method700(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var9;
		int var10;
		if (this.aClass_ra_Sub2_9309.method4903() != Class161.aClass161_1688) {
			var9 = arg0 + this.anInt9308;
			var10 = arg1 + this.anInt9313;
			this.aClass_ra_Sub2_9309.aClass187_8556.method2086((float) var9, (float) var10, (float) (var9 + this.anInt9306), (float) (var10 + this.anInt9304), 0.0F, 0.0F, this.anInterface11_Impl3_9301.method123(), this.anInterface11_Impl3_9301.method114(), this.anInterface11_Impl3_9301, arg3);
			return;
		}
		this.aClass_ra_Sub2_9309.method4925();
		this.aClass_ra_Sub2_9309.method4970(arg4);
		Class159 var6 = this.aClass_ra_Sub2_9309.aClass159_8590;
		var6.anInterface11_Impl3_1679 = this.anInterface11_Impl3_9301;
		var6.method1861(arg2, arg3);
		var9 = arg0 + this.anInt9308;
		var10 = arg1 + this.anInt9313;
		float var7 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method856();
		float var8 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method857();
		var6.aClass249_1681.method2486((float) this.anInt9306 * 2.0F / var7, (float) this.anInt9304 * 2.0F / var8, 1.0F, 1.0F);
		var6.aClass249_1681.aFloatArray2631[12] = ((float) var9 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var7 - 1.0F;
		var6.aClass249_1681.aFloatArray2631[13] = ((float) var10 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var8 - 1.0F;
		var6.aClass249_1681.aFloatArray2631[14] = -1.0F;
		var6.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), 1.0F, 1.0F);
		var6.anInterface9_Impl1_1678 = this.aClass_ra_Sub2_9309.anInterface9_Impl1_8600;
		var6.anInt1685 = 0;
		var6.aClass184_1686 = this.aClass_ra_Sub2_9309.aClass184_8603;
		var6.method1862();
	}

	public void method692(int[] arg0) {
		arg0[0] = this.anInt9308;
		arg0[1] = this.anInt9313;
		arg0[2] = this.anInt9300;
		arg0[3] = this.anInt9303;
	}

	public void method708(int arg0, int arg1, Class_ta arg2, int arg3, int arg4) {
		this.aClass_ra_Sub2_9309.method4925();
		Class159 var6 = this.aClass_ra_Sub2_9309.aClass159_8590;
		var6.anInterface11_Impl3_1679 = this.anInterface11_Impl3_9301;
		var6.method1861(1, -1);
		int var10 = arg0 + this.anInt9308;
		int var11 = arg1 + this.anInt9313;
		float var7 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method856();
		float var8 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method857();
		var6.aClass249_1681.method2486((float) this.anInt9306 * 2.0F / var7, (float) this.anInt9304 * 2.0F / var8, 1.0F, 1.0F);
		var6.aClass249_1681.aFloatArray2631[12] = ((float) var10 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var7 - 1.0F;
		var6.aClass249_1681.aFloatArray2631[13] = ((float) var11 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var8 - 1.0F;
		var6.aClass249_1681.aFloatArray2631[14] = -1.0F;
		var6.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), 1.0F, 1.0F);
		var6.anInterface9_Impl1_1678 = this.aClass_ra_Sub2_9309.anInterface9_Impl1_8600;
		var6.anInt1685 = 0;
		var6.aClass184_1686 = this.aClass_ra_Sub2_9309.aClass184_8603;
		Interface11_Impl3 var9 = ((Class_ta_Sub1) arg2).anInterface11_Impl3_8659;
		var6.anInterface11_Impl3_1680 = var9;
		var6.aClass249_1683.method2486(var9.method106((float) this.anInt9306), var9.method104((float) this.anInt9304), 1.0F, 1.0F);
		var6.aClass249_1683.aFloatArray2631[12] = var9.method106((float) (var10 - arg3));
		var6.aClass249_1683.aFloatArray2631[13] = var9.method104((float) (var11 - arg4));
		var6.method1864();
	}

	public void method704(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int[] var7 = this.aClass_ra_Sub2_9309.ar(arg4, arg5, arg2, arg3);
		if (var7 != null) {
			for (int var8 = 0; var8 < var7.length; var8++) {
				var7[var8] |= 0xFF000000;
			}
			this.method738(arg0, arg1, arg2, arg3, var7, 0, arg2);
		}
	}

	public void method710(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (this.aClass_ra_Sub2_9309.method4903() != Class161.aClass161_1688) {
			if (this.aBoolean9305) {
				arg2 = arg2 * this.anInt9306 / this.method318();
				arg3 = arg3 * this.anInt9304 / this.method683();
				arg0 += this.anInt9308 * arg2 / this.anInt9306;
				arg1 += this.anInt9313 * arg3 / this.anInt9304;
			}
			this.aClass_ra_Sub2_9309.aClass187_8556.method2086((float) arg0, (float) arg1, (float) (arg0 + arg2), (float) (arg1 + arg3), this.anInterface11_Impl3_9301.method106(0.0F), this.anInterface11_Impl3_9301.method104(0.0F), this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), this.anInterface11_Impl3_9301, arg5);
			return;
		}
		this.aClass_ra_Sub2_9309.method4925();
		this.aClass_ra_Sub2_9309.method4970(arg6);
		Class159 var9 = this.aClass_ra_Sub2_9309.aClass159_8590;
		var9.anInterface11_Impl3_1679 = this.anInterface11_Impl3_9301;
		var9.method1861(arg4, arg5);
		if (this.aBoolean9305) {
			arg2 = arg2 * this.anInt9306 / this.method318();
			arg3 = arg3 * this.anInt9304 / this.method683();
			arg0 += this.anInt9308 * arg2 / this.anInt9306;
			arg1 += this.anInt9313 * arg3 / this.anInt9304;
		}
		float var10 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method856();
		float var11 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method857();
		var9.aClass249_1681.method2486((float) arg2 * 2.0F / var10, (float) arg3 * 2.0F / var11, 1.0F, 1.0F);
		var9.aClass249_1681.aFloatArray2631[12] = ((float) arg0 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var10 - 1.0F;
		var9.aClass249_1681.aFloatArray2631[13] = ((float) arg1 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var11 - 1.0F;
		var9.aClass249_1681.aFloatArray2631[14] = -1.0F;
		var9.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), 1.0F, 1.0F);
		var9.anInterface9_Impl1_1678 = this.aClass_ra_Sub2_9309.anInterface9_Impl1_8600;
		var9.anInt1685 = 0;
		var9.aClass184_1686 = this.aClass_ra_Sub2_9309.aClass184_8603;
		var9.method1862();
	}

	public void method706(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (this.aClass_ra_Sub2_9309.method4903() != Class161.aClass161_1688) {
			if (this.aBoolean9305) {
				arg2 = arg2 * this.anInt9306 / this.method318();
				arg3 = arg3 * this.anInt9304 / this.method683();
				arg0 += this.anInt9308 * arg2 / this.anInt9306;
				arg1 += this.anInt9313 * arg3 / this.anInt9304;
			}
			this.aClass_ra_Sub2_9309.aClass187_8556.method2086((float) arg0, (float) arg1, (float) (arg0 + arg2), (float) (arg1 + arg3), this.anInterface11_Impl3_9301.method106(0.0F), this.anInterface11_Impl3_9301.method104(0.0F), this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), this.anInterface11_Impl3_9301, arg5);
			return;
		}
		this.aClass_ra_Sub2_9309.method4925();
		this.aClass_ra_Sub2_9309.method4970(arg6);
		Class159 var9 = this.aClass_ra_Sub2_9309.aClass159_8590;
		var9.anInterface11_Impl3_1679 = this.anInterface11_Impl3_9301;
		var9.method1861(arg4, arg5);
		if (this.aBoolean9305) {
			arg2 = arg2 * this.anInt9306 / this.method318();
			arg3 = arg3 * this.anInt9304 / this.method683();
			arg0 += this.anInt9308 * arg2 / this.anInt9306;
			arg1 += this.anInt9313 * arg3 / this.anInt9304;
		}
		float var10 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method856();
		float var11 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method857();
		var9.aClass249_1681.method2486((float) arg2 * 2.0F / var10, (float) arg3 * 2.0F / var11, 1.0F, 1.0F);
		var9.aClass249_1681.aFloatArray2631[12] = ((float) arg0 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var10 - 1.0F;
		var9.aClass249_1681.aFloatArray2631[13] = ((float) arg1 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var11 - 1.0F;
		var9.aClass249_1681.aFloatArray2631[14] = -1.0F;
		var9.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), 1.0F, 1.0F);
		var9.anInterface9_Impl1_1678 = this.aClass_ra_Sub2_9309.anInterface9_Impl1_8600;
		var9.anInt1685 = 0;
		var9.aClass184_1686 = this.aClass_ra_Sub2_9309.aClass184_8603;
		var9.method1862();
	}

	public void method712(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (this.aClass_ra_Sub2_9309.method4903() != Class161.aClass161_1688) {
			if (this.aBoolean9305) {
				arg2 = arg2 * this.anInt9306 / this.method318();
				arg3 = arg3 * this.anInt9304 / this.method683();
				arg0 += this.anInt9308 * arg2 / this.anInt9306;
				arg1 += this.anInt9313 * arg3 / this.anInt9304;
			}
			this.aClass_ra_Sub2_9309.aClass187_8556.method2086((float) arg0, (float) arg1, (float) (arg0 + arg2), (float) (arg1 + arg3), this.anInterface11_Impl3_9301.method106(0.0F), this.anInterface11_Impl3_9301.method104(0.0F), this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), this.anInterface11_Impl3_9301, arg5);
			return;
		}
		this.aClass_ra_Sub2_9309.method4925();
		this.aClass_ra_Sub2_9309.method4970(arg6);
		Class159 var9 = this.aClass_ra_Sub2_9309.aClass159_8590;
		var9.anInterface11_Impl3_1679 = this.anInterface11_Impl3_9301;
		var9.method1861(arg4, arg5);
		if (this.aBoolean9305) {
			arg2 = arg2 * this.anInt9306 / this.method318();
			arg3 = arg3 * this.anInt9304 / this.method683();
			arg0 += this.anInt9308 * arg2 / this.anInt9306;
			arg1 += this.anInt9313 * arg3 / this.anInt9304;
		}
		float var10 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method856();
		float var11 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method857();
		var9.aClass249_1681.method2486((float) arg2 * 2.0F / var10, (float) arg3 * 2.0F / var11, 1.0F, 1.0F);
		var9.aClass249_1681.aFloatArray2631[12] = ((float) arg0 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var10 - 1.0F;
		var9.aClass249_1681.aFloatArray2631[13] = ((float) arg1 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var11 - 1.0F;
		var9.aClass249_1681.aFloatArray2631[14] = -1.0F;
		var9.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), 1.0F, 1.0F);
		var9.anInterface9_Impl1_1678 = this.aClass_ra_Sub2_9309.anInterface9_Impl1_8600;
		var9.anInt1685 = 0;
		var9.aClass184_1686 = this.aClass_ra_Sub2_9309.aClass184_8603;
		var9.method1862();
	}

	public void method701(int arg0, int arg1, int arg2, int arg3) {
		this.anInt9308 = arg0;
		this.anInt9313 = arg1;
		this.anInt9300 = arg2;
		this.anInt9303 = arg3;
		this.aBoolean9305 = this.anInt9308 != 0 || this.anInt9313 != 0 || this.anInt9300 != 0 || this.anInt9303 != 0;
	}

	public void method728(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
		if (this.aClass_ra_Sub2_9309.method4903() != Class161.aClass161_1688) {
			this.aClass_ra_Sub2_9309.aClass187_8556.method2092(arg0, arg1, arg2, arg3, arg4, arg5, arg2 + arg4 - arg0, arg3 + arg5 - arg1, 0.0F, 0.0F, this.anInterface11_Impl3_9301.method123(), 0.0F, 0.0F, this.anInterface11_Impl3_9301.method114(), this.anInterface11_Impl3_9301.method123(), this.anInterface11_Impl3_9301.method114(), this.anInterface11_Impl3_9301, arg7);
			return;
		}
		this.aClass_ra_Sub2_9309.method4925();
		this.aClass_ra_Sub2_9309.method4970(arg8);
		float var12;
		float var13;
		if (this.aBoolean9305) {
			float var11 = (float) this.method318();
			var12 = this.method683();
			var13 = (arg2 - arg0) / var11;
			float var14 = (arg3 - arg1) / var11;
			float var15 = (arg4 - arg0) / var12;
			float var16 = (arg5 - arg1) / var12;
			float var17 = var15 * (float) this.anInt9313;
			float var18 = var16 * (float) this.anInt9313;
			float var19 = var13 * (float) this.anInt9308;
			float var20 = var14 * (float) this.anInt9308;
			float var21 = -var13 * (float) this.anInt9300;
			float var22 = -var14 * (float) this.anInt9300;
			float var23 = -var15 * (float) this.anInt9303;
			float var24 = -var16 * (float) this.anInt9303;
			arg0 = arg0 + var19 + var17;
			arg1 = arg1 + var20 + var18;
			arg2 = arg2 + var21 + var17;
			arg3 = arg3 + var22 + var18;
			arg4 = arg4 + var19 + var23;
			arg5 = arg5 + var20 + var24;
		}
		Class159 var25 = this.aClass_ra_Sub2_9309.aClass159_8590;
		var25.anInterface11_Impl3_1679 = this.anInterface11_Impl3_9301;
		var25.method1861(arg6, arg7);
		var12 = this.aClass_ra_Sub2_9309.method4782((byte) 0).method856();
		var13 = this.aClass_ra_Sub2_9309.method4782((byte) 0).method857();
		var25.aClass249_1681.method2516();
		var25.aClass249_1681.aFloatArray2631[0] = (arg2 - arg0) * 2.0F / var12;
		var25.aClass249_1681.aFloatArray2631[1] = (arg3 - arg1) * 2.0F / var13;
		var25.aClass249_1681.aFloatArray2631[4] = (arg4 - arg0) * 2.0F / var12;
		var25.aClass249_1681.aFloatArray2631[5] = (arg5 - arg1) * 2.0F / var13;
		var25.aClass249_1681.aFloatArray2631[12] = (arg0 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var12 - 1.0F;
		var25.aClass249_1681.aFloatArray2631[13] = (arg1 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var13 - 1.0F;
		var25.aClass249_1681.aFloatArray2631[14] = -1.0F;
		var25.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), 1.0F, 1.0F);
		var25.anInterface9_Impl1_1678 = this.aClass_ra_Sub2_9309.anInterface9_Impl1_8600;
		var25.anInt1685 = 0;
		var25.aClass184_1686 = this.aClass_ra_Sub2_9309.aClass184_8603;
		var25.method1862();
	}

	public int method699() {
		return this.anInt9306;
	}

	public Interface8_Impl1_Impl2 method729() {
		return this.anInterface8_Impl1_Impl2_9302;
	}

	public void method688(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var9;
		int var10;
		if (this.aClass_ra_Sub2_9309.method4903() != Class161.aClass161_1688) {
			var9 = arg0 + this.anInt9308;
			var10 = arg1 + this.anInt9313;
			this.aClass_ra_Sub2_9309.aClass187_8556.method2086((float) var9, (float) var10, (float) (var9 + this.anInt9306), (float) (var10 + this.anInt9304), 0.0F, 0.0F, this.anInterface11_Impl3_9301.method123(), this.anInterface11_Impl3_9301.method114(), this.anInterface11_Impl3_9301, arg3);
			return;
		}
		this.aClass_ra_Sub2_9309.method4925();
		this.aClass_ra_Sub2_9309.method4970(arg4);
		Class159 var6 = this.aClass_ra_Sub2_9309.aClass159_8590;
		var6.anInterface11_Impl3_1679 = this.anInterface11_Impl3_9301;
		var6.method1861(arg2, arg3);
		var9 = arg0 + this.anInt9308;
		var10 = arg1 + this.anInt9313;
		float var7 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method856();
		float var8 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method857();
		var6.aClass249_1681.method2486((float) this.anInt9306 * 2.0F / var7, (float) this.anInt9304 * 2.0F / var8, 1.0F, 1.0F);
		var6.aClass249_1681.aFloatArray2631[12] = ((float) var9 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var7 - 1.0F;
		var6.aClass249_1681.aFloatArray2631[13] = ((float) var10 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var8 - 1.0F;
		var6.aClass249_1681.aFloatArray2631[14] = -1.0F;
		var6.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), 1.0F, 1.0F);
		var6.anInterface9_Impl1_1678 = this.aClass_ra_Sub2_9309.anInterface9_Impl1_8600;
		var6.anInt1685 = 0;
		var6.aClass184_1686 = this.aClass_ra_Sub2_9309.aClass184_8603;
		var6.method1862();
	}

	public int method718() {
		return this.anInt9304;
	}

	public int method719() {
		return this.anInt9304;
	}

	public int method316() {
		return this.anInt9306 + this.anInt9308 + this.anInt9300;
	}

	public Interface8_Impl1_Impl2 method707() {
		return this.anInterface8_Impl1_Impl2_9302;
	}

	public int method317() {
		return this.anInt9306 + this.anInt9308 + this.anInt9300;
	}

	public int method711() {
		return this.anInt9304 + this.anInt9313 + this.anInt9303;
	}

	public int method724() {
		return this.anInt9304 + this.anInt9313 + this.anInt9303;
	}

	public int method723() {
		return this.anInt9304 + this.anInt9313 + this.anInt9303;
	}

	public int method696() {
		return this.anInt9304 + this.anInt9313 + this.anInt9303;
	}

	public void method709(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (this.aClass_ra_Sub2_9309.method4903() != Class161.aClass161_1688) {
			if (this.aBoolean9305) {
				arg2 = arg2 * this.anInt9306 / this.method318();
				arg3 = arg3 * this.anInt9304 / this.method683();
				arg0 += this.anInt9308 * arg2 / this.anInt9306;
				arg1 += this.anInt9313 * arg3 / this.anInt9304;
			}
			this.aClass_ra_Sub2_9309.aClass187_8556.method2086((float) arg0, (float) arg1, (float) (arg0 + arg2), (float) (arg1 + arg3), this.anInterface11_Impl3_9301.method106(0.0F), this.anInterface11_Impl3_9301.method104(0.0F), this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), this.anInterface11_Impl3_9301, arg5);
			return;
		}
		this.aClass_ra_Sub2_9309.method4925();
		this.aClass_ra_Sub2_9309.method4970(arg6);
		Class159 var9 = this.aClass_ra_Sub2_9309.aClass159_8590;
		var9.anInterface11_Impl3_1679 = this.anInterface11_Impl3_9301;
		var9.method1861(arg4, arg5);
		if (this.aBoolean9305) {
			arg2 = arg2 * this.anInt9306 / this.method318();
			arg3 = arg3 * this.anInt9304 / this.method683();
			arg0 += this.anInt9308 * arg2 / this.anInt9306;
			arg1 += this.anInt9313 * arg3 / this.anInt9304;
		}
		float var10 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method856();
		float var11 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method857();
		var9.aClass249_1681.method2486((float) arg2 * 2.0F / var10, (float) arg3 * 2.0F / var11, 1.0F, 1.0F);
		var9.aClass249_1681.aFloatArray2631[12] = ((float) arg0 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var10 - 1.0F;
		var9.aClass249_1681.aFloatArray2631[13] = ((float) arg1 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var11 - 1.0F;
		var9.aClass249_1681.aFloatArray2631[14] = -1.0F;
		var9.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), 1.0F, 1.0F);
		var9.anInterface9_Impl1_1678 = this.aClass_ra_Sub2_9309.anInterface9_Impl1_8600;
		var9.anInt1685 = 0;
		var9.aClass184_1686 = this.aClass_ra_Sub2_9309.aClass184_8603;
		var9.method1862();
	}

	public void method726(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var13;
		int var14;
		int var15;
		int var16;
		if (this.aClass_ra_Sub2_9309.method4903() != Class161.aClass161_1688) {
			int var8 = arg1 + arg3;
			int var9 = arg0 + arg2;
			int var10 = this.method318();
			int var11 = this.method683();
			int var12 = arg1 + this.anInt9313;
			for (var13 = var12 + this.anInt9304; var13 <= var8; var13 += var11) {
				var14 = arg0 + this.anInt9308;
				for (var15 = var14 + this.anInt9306; var15 <= var9; var15 += var10) {
					this.aClass_ra_Sub2_9309.aClass187_8556.method2086((float) var14, (float) var12, (float) (var14 + this.anInt9306), (float) (var12 + this.anInt9304), 0.0F, 0.0F, this.anInterface11_Impl3_9301.method123(), this.anInterface11_Impl3_9301.method114(), this.anInterface11_Impl3_9301, arg5);
					var14 += var10;
				}
				if (var14 < var9) {
					var15 = var9 - var14;
					this.aClass_ra_Sub2_9309.aClass187_8556.method2086((float) var14, (float) var12, (float) (var14 + var15), (float) (var12 + this.anInt9304), 0.0F, 0.0F, (float) var15 / (float) this.anInt9306 * this.anInterface11_Impl3_9301.method123(), this.anInterface11_Impl3_9301.method114(), this.anInterface11_Impl3_9301, arg5);
				}
				var12 += var11;
			}
			if (var12 < var8) {
				var13 = var8 - var12;
				float var26 = (float) var13 / (float) this.anInt9304 * this.anInterface11_Impl3_9301.method114();
				var15 = arg0 + this.anInt9308;
				for (var16 = var15 + this.anInt9306; var16 <= var9; var16 += var10) {
					this.aClass_ra_Sub2_9309.aClass187_8556.method2086((float) var15, (float) var12, (float) (var15 + this.anInt9306), (float) (var12 + var13), 0.0F, 0.0F, this.anInterface11_Impl3_9301.method123(), var26, this.anInterface11_Impl3_9301, arg5);
					var15 += var10;
				}
				if (var15 < var9) {
					var16 = var9 - var15;
					this.aClass_ra_Sub2_9309.aClass187_8556.method2086((float) var15, (float) var12, (float) (var15 + var16), (float) (var12 + var13), 0.0F, 0.0F, (float) var16 / (float) this.anInt9306 * this.anInterface11_Impl3_9301.method123(), var26, this.anInterface11_Impl3_9301, arg5);
				}
			}
			return;
		}
		this.aClass_ra_Sub2_9309.method4925();
		this.aClass_ra_Sub2_9309.method4970(arg6);
		Class159 var21 = this.aClass_ra_Sub2_9309.aClass159_8590;
		var21.anInterface11_Impl3_1679 = this.anInterface11_Impl3_9301;
		var21.method1861(arg4, arg5);
		float var22 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method856();
		float var23 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method857();
		var21.anInterface9_Impl1_1678 = this.aClass_ra_Sub2_9309.anInterface9_Impl1_8600;
		var21.anInt1685 = 0;
		var21.aClass184_1686 = this.aClass_ra_Sub2_9309.aClass184_8603;
		boolean var24 = this.aBoolean9307 && this.anInt9313 == 0 && this.anInt9303 == 0;
		boolean var25 = this.aBoolean9312 && this.anInt9308 == 0 && this.anInt9300 == 0;
		if (var25 & var24) {
			var21.aClass249_1681.method2486((float) arg2 * 2.0F / var22, (float) arg3 * 2.0F / var23, 1.0F, 1.0F);
			var21.aClass249_1681.aFloatArray2631[12] = ((float) arg0 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
			var21.aClass249_1681.aFloatArray2631[13] = ((float) arg1 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
			var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
			var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) arg2), this.anInterface11_Impl3_9301.method104((float) arg3), 1.0F, 1.0F);
			var21.method1862();
		} else if (var25) {
			var13 = arg1 + arg3;
			var14 = this.method683();
			var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) arg2), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), 1.0F, 1.0F);
			var15 = arg1 + this.anInt9313;
			for (var16 = var15 + this.anInt9304; var16 <= var13; var16 += var14) {
				var21.aClass249_1681.method2486((float) arg2 * 2.0F / var22, (float) this.anInt9304 * 2.0F / var23, 1.0F, 1.0F);
				var21.aClass249_1681.aFloatArray2631[12] = ((float) arg0 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
				var21.aClass249_1681.aFloatArray2631[13] = ((float) var15 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
				var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
				var21.method1862();
				var15 += var14;
			}
			if (var15 < var13) {
				var16 = var13 - var15;
				var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) arg2), this.anInterface11_Impl3_9301.method104((float) var16), 1.0F, 1.0F);
				var21.aClass249_1681.method2486((float) arg2 * 2.0F / var22, (float) var16 * 2.0F / var23, 1.0F, 1.0F);
				var21.aClass249_1681.aFloatArray2631[12] = ((float) arg0 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
				var21.aClass249_1681.aFloatArray2631[13] = ((float) var15 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
				var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
				var21.method1862();
			}
		} else if (var24) {
			var13 = arg0 + arg2;
			var14 = this.method318();
			var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) arg3), 1.0F, 1.0F);
			var15 = arg0 + this.anInt9308;
			for (var16 = var15 + this.anInt9306; var16 <= var13; var16 += var14) {
				var21.aClass249_1681.method2486((float) this.anInt9306 * 2.0F / var22, (float) arg3 * 2.0F / var23, 1.0F, 1.0F);
				var21.aClass249_1681.aFloatArray2631[12] = ((float) var15 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
				var21.aClass249_1681.aFloatArray2631[13] = ((float) arg1 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
				var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
				var21.method1862();
				var15 += var14;
			}
			if (var15 < var13) {
				var16 = var13 - var15;
				var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) var16), this.anInterface11_Impl3_9301.method104((float) arg3), 1.0F, 1.0F);
				var21.aClass249_1681.method2486((float) var16 * 2.0F / var22, (float) arg3 * 2.0F / var23, 1.0F, 1.0F);
				var21.aClass249_1681.aFloatArray2631[12] = ((float) var15 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
				var21.aClass249_1681.aFloatArray2631[13] = ((float) arg1 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
				var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
				var21.method1862();
			}
		} else {
			var13 = arg1 + arg3;
			var14 = arg0 + arg2;
			var15 = this.method318();
			var16 = this.method683();
			int var17 = arg1 + this.anInt9313;
			int var18;
			int var19;
			int var20;
			for (var18 = var17 + this.anInt9304; var18 <= var13; var18 += var16) {
				var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), 1.0F, 1.0F);
				var19 = arg0 + this.anInt9308;
				for (var20 = var19 + this.anInt9306; var20 <= var14; var20 += var15) {
					var21.aClass249_1681.method2486((float) this.anInt9306 * 2.0F / var22, (float) this.anInt9304 * 2.0F / var23, 1.0F, 1.0F);
					var21.aClass249_1681.aFloatArray2631[12] = ((float) var19 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
					var21.aClass249_1681.aFloatArray2631[13] = ((float) var17 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
					var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
					var21.method1862();
					var19 += var15;
				}
				if (var19 < var14) {
					var20 = var14 - var19;
					var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) var20), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), 1.0F, 1.0F);
					var21.aClass249_1681.method2486((float) var20 * 2.0F / var22, (float) this.anInt9304 * 2.0F / var23, 1.0F, 1.0F);
					var21.aClass249_1681.aFloatArray2631[12] = ((float) var19 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
					var21.aClass249_1681.aFloatArray2631[13] = ((float) var17 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
					var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
					var21.method1862();
				}
				var17 += var16;
			}
			if (var17 < var13) {
				var18 = var13 - var17;
				var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) var18), 1.0F, 1.0F);
				var19 = arg0 + this.anInt9308;
				for (var20 = var19 + this.anInt9306; var20 <= var14; var20 += var15) {
					var21.aClass249_1681.method2486((float) this.anInt9306 * 2.0F / var22, (float) var18 * 2.0F / var23, 1.0F, 1.0F);
					var21.aClass249_1681.aFloatArray2631[12] = ((float) var19 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
					var21.aClass249_1681.aFloatArray2631[13] = ((float) var17 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
					var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
					var21.method1862();
					var19 += var15;
				}
				if (var19 < var14) {
					var20 = var14 - var19;
					var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) var20), this.anInterface11_Impl3_9301.method104((float) var18), 1.0F, 1.0F);
					var21.aClass249_1681.method2486((float) var20 * 2.0F / var22, (float) var18 * 2.0F / var23, 1.0F, 1.0F);
					var21.aClass249_1681.aFloatArray2631[12] = ((float) var19 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
					var21.aClass249_1681.aFloatArray2631[13] = ((float) var17 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
					var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
					var21.method1862();
				}
			}
		}
	}

	public void method727(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var13;
		int var14;
		int var15;
		int var16;
		if (this.aClass_ra_Sub2_9309.method4903() != Class161.aClass161_1688) {
			int var8 = arg1 + arg3;
			int var9 = arg0 + arg2;
			int var10 = this.method318();
			int var11 = this.method683();
			int var12 = arg1 + this.anInt9313;
			for (var13 = var12 + this.anInt9304; var13 <= var8; var13 += var11) {
				var14 = arg0 + this.anInt9308;
				for (var15 = var14 + this.anInt9306; var15 <= var9; var15 += var10) {
					this.aClass_ra_Sub2_9309.aClass187_8556.method2086((float) var14, (float) var12, (float) (var14 + this.anInt9306), (float) (var12 + this.anInt9304), 0.0F, 0.0F, this.anInterface11_Impl3_9301.method123(), this.anInterface11_Impl3_9301.method114(), this.anInterface11_Impl3_9301, arg5);
					var14 += var10;
				}
				if (var14 < var9) {
					var15 = var9 - var14;
					this.aClass_ra_Sub2_9309.aClass187_8556.method2086((float) var14, (float) var12, (float) (var14 + var15), (float) (var12 + this.anInt9304), 0.0F, 0.0F, (float) var15 / (float) this.anInt9306 * this.anInterface11_Impl3_9301.method123(), this.anInterface11_Impl3_9301.method114(), this.anInterface11_Impl3_9301, arg5);
				}
				var12 += var11;
			}
			if (var12 < var8) {
				var13 = var8 - var12;
				float var26 = (float) var13 / (float) this.anInt9304 * this.anInterface11_Impl3_9301.method114();
				var15 = arg0 + this.anInt9308;
				for (var16 = var15 + this.anInt9306; var16 <= var9; var16 += var10) {
					this.aClass_ra_Sub2_9309.aClass187_8556.method2086((float) var15, (float) var12, (float) (var15 + this.anInt9306), (float) (var12 + var13), 0.0F, 0.0F, this.anInterface11_Impl3_9301.method123(), var26, this.anInterface11_Impl3_9301, arg5);
					var15 += var10;
				}
				if (var15 < var9) {
					var16 = var9 - var15;
					this.aClass_ra_Sub2_9309.aClass187_8556.method2086((float) var15, (float) var12, (float) (var15 + var16), (float) (var12 + var13), 0.0F, 0.0F, (float) var16 / (float) this.anInt9306 * this.anInterface11_Impl3_9301.method123(), var26, this.anInterface11_Impl3_9301, arg5);
				}
			}
			return;
		}
		this.aClass_ra_Sub2_9309.method4925();
		this.aClass_ra_Sub2_9309.method4970(arg6);
		Class159 var21 = this.aClass_ra_Sub2_9309.aClass159_8590;
		var21.anInterface11_Impl3_1679 = this.anInterface11_Impl3_9301;
		var21.method1861(arg4, arg5);
		float var22 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method856();
		float var23 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method857();
		var21.anInterface9_Impl1_1678 = this.aClass_ra_Sub2_9309.anInterface9_Impl1_8600;
		var21.anInt1685 = 0;
		var21.aClass184_1686 = this.aClass_ra_Sub2_9309.aClass184_8603;
		boolean var24 = this.aBoolean9307 && this.anInt9313 == 0 && this.anInt9303 == 0;
		boolean var25 = this.aBoolean9312 && this.anInt9308 == 0 && this.anInt9300 == 0;
		if (var25 & var24) {
			var21.aClass249_1681.method2486((float) arg2 * 2.0F / var22, (float) arg3 * 2.0F / var23, 1.0F, 1.0F);
			var21.aClass249_1681.aFloatArray2631[12] = ((float) arg0 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
			var21.aClass249_1681.aFloatArray2631[13] = ((float) arg1 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
			var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
			var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) arg2), this.anInterface11_Impl3_9301.method104((float) arg3), 1.0F, 1.0F);
			var21.method1862();
		} else if (var25) {
			var13 = arg1 + arg3;
			var14 = this.method683();
			var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) arg2), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), 1.0F, 1.0F);
			var15 = arg1 + this.anInt9313;
			for (var16 = var15 + this.anInt9304; var16 <= var13; var16 += var14) {
				var21.aClass249_1681.method2486((float) arg2 * 2.0F / var22, (float) this.anInt9304 * 2.0F / var23, 1.0F, 1.0F);
				var21.aClass249_1681.aFloatArray2631[12] = ((float) arg0 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
				var21.aClass249_1681.aFloatArray2631[13] = ((float) var15 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
				var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
				var21.method1862();
				var15 += var14;
			}
			if (var15 < var13) {
				var16 = var13 - var15;
				var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) arg2), this.anInterface11_Impl3_9301.method104((float) var16), 1.0F, 1.0F);
				var21.aClass249_1681.method2486((float) arg2 * 2.0F / var22, (float) var16 * 2.0F / var23, 1.0F, 1.0F);
				var21.aClass249_1681.aFloatArray2631[12] = ((float) arg0 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
				var21.aClass249_1681.aFloatArray2631[13] = ((float) var15 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
				var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
				var21.method1862();
			}
		} else if (var24) {
			var13 = arg0 + arg2;
			var14 = this.method318();
			var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) arg3), 1.0F, 1.0F);
			var15 = arg0 + this.anInt9308;
			for (var16 = var15 + this.anInt9306; var16 <= var13; var16 += var14) {
				var21.aClass249_1681.method2486((float) this.anInt9306 * 2.0F / var22, (float) arg3 * 2.0F / var23, 1.0F, 1.0F);
				var21.aClass249_1681.aFloatArray2631[12] = ((float) var15 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
				var21.aClass249_1681.aFloatArray2631[13] = ((float) arg1 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
				var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
				var21.method1862();
				var15 += var14;
			}
			if (var15 < var13) {
				var16 = var13 - var15;
				var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) var16), this.anInterface11_Impl3_9301.method104((float) arg3), 1.0F, 1.0F);
				var21.aClass249_1681.method2486((float) var16 * 2.0F / var22, (float) arg3 * 2.0F / var23, 1.0F, 1.0F);
				var21.aClass249_1681.aFloatArray2631[12] = ((float) var15 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
				var21.aClass249_1681.aFloatArray2631[13] = ((float) arg1 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
				var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
				var21.method1862();
			}
		} else {
			var13 = arg1 + arg3;
			var14 = arg0 + arg2;
			var15 = this.method318();
			var16 = this.method683();
			int var17 = arg1 + this.anInt9313;
			int var18;
			int var19;
			int var20;
			for (var18 = var17 + this.anInt9304; var18 <= var13; var18 += var16) {
				var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), 1.0F, 1.0F);
				var19 = arg0 + this.anInt9308;
				for (var20 = var19 + this.anInt9306; var20 <= var14; var20 += var15) {
					var21.aClass249_1681.method2486((float) this.anInt9306 * 2.0F / var22, (float) this.anInt9304 * 2.0F / var23, 1.0F, 1.0F);
					var21.aClass249_1681.aFloatArray2631[12] = ((float) var19 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
					var21.aClass249_1681.aFloatArray2631[13] = ((float) var17 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
					var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
					var21.method1862();
					var19 += var15;
				}
				if (var19 < var14) {
					var20 = var14 - var19;
					var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) var20), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), 1.0F, 1.0F);
					var21.aClass249_1681.method2486((float) var20 * 2.0F / var22, (float) this.anInt9304 * 2.0F / var23, 1.0F, 1.0F);
					var21.aClass249_1681.aFloatArray2631[12] = ((float) var19 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
					var21.aClass249_1681.aFloatArray2631[13] = ((float) var17 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
					var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
					var21.method1862();
				}
				var17 += var16;
			}
			if (var17 < var13) {
				var18 = var13 - var17;
				var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) var18), 1.0F, 1.0F);
				var19 = arg0 + this.anInt9308;
				for (var20 = var19 + this.anInt9306; var20 <= var14; var20 += var15) {
					var21.aClass249_1681.method2486((float) this.anInt9306 * 2.0F / var22, (float) var18 * 2.0F / var23, 1.0F, 1.0F);
					var21.aClass249_1681.aFloatArray2631[12] = ((float) var19 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
					var21.aClass249_1681.aFloatArray2631[13] = ((float) var17 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
					var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
					var21.method1862();
					var19 += var15;
				}
				if (var19 < var14) {
					var20 = var14 - var19;
					var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) var20), this.anInterface11_Impl3_9301.method104((float) var18), 1.0F, 1.0F);
					var21.aClass249_1681.method2486((float) var20 * 2.0F / var22, (float) var18 * 2.0F / var23, 1.0F, 1.0F);
					var21.aClass249_1681.aFloatArray2631[12] = ((float) var19 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
					var21.aClass249_1681.aFloatArray2631[13] = ((float) var17 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
					var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
					var21.method1862();
				}
			}
		}
	}

	public void method730(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
		if (this.aClass_ra_Sub2_9309.method4903() != Class161.aClass161_1688) {
			this.aClass_ra_Sub2_9309.aClass187_8556.method2092(arg0, arg1, arg2, arg3, arg4, arg5, arg2 + arg4 - arg0, arg3 + arg5 - arg1, 0.0F, 0.0F, this.anInterface11_Impl3_9301.method123(), 0.0F, 0.0F, this.anInterface11_Impl3_9301.method114(), this.anInterface11_Impl3_9301.method123(), this.anInterface11_Impl3_9301.method114(), this.anInterface11_Impl3_9301, arg7);
			return;
		}
		this.aClass_ra_Sub2_9309.method4925();
		this.aClass_ra_Sub2_9309.method4970(arg8);
		float var12;
		float var13;
		if (this.aBoolean9305) {
			float var11 = (float) this.method318();
			var12 = this.method683();
			var13 = (arg2 - arg0) / var11;
			float var14 = (arg3 - arg1) / var11;
			float var15 = (arg4 - arg0) / var12;
			float var16 = (arg5 - arg1) / var12;
			float var17 = var15 * (float) this.anInt9313;
			float var18 = var16 * (float) this.anInt9313;
			float var19 = var13 * (float) this.anInt9308;
			float var20 = var14 * (float) this.anInt9308;
			float var21 = -var13 * (float) this.anInt9300;
			float var22 = -var14 * (float) this.anInt9300;
			float var23 = -var15 * (float) this.anInt9303;
			float var24 = -var16 * (float) this.anInt9303;
			arg0 = arg0 + var19 + var17;
			arg1 = arg1 + var20 + var18;
			arg2 = arg2 + var21 + var17;
			arg3 = arg3 + var22 + var18;
			arg4 = arg4 + var19 + var23;
			arg5 = arg5 + var20 + var24;
		}
		Class159 var25 = this.aClass_ra_Sub2_9309.aClass159_8590;
		var25.anInterface11_Impl3_1679 = this.anInterface11_Impl3_9301;
		var25.method1861(arg6, arg7);
		var12 = this.aClass_ra_Sub2_9309.method4782((byte) 0).method856();
		var13 = this.aClass_ra_Sub2_9309.method4782((byte) 0).method857();
		var25.aClass249_1681.method2516();
		var25.aClass249_1681.aFloatArray2631[0] = (arg2 - arg0) * 2.0F / var12;
		var25.aClass249_1681.aFloatArray2631[1] = (arg3 - arg1) * 2.0F / var13;
		var25.aClass249_1681.aFloatArray2631[4] = (arg4 - arg0) * 2.0F / var12;
		var25.aClass249_1681.aFloatArray2631[5] = (arg5 - arg1) * 2.0F / var13;
		var25.aClass249_1681.aFloatArray2631[12] = (arg0 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var12 - 1.0F;
		var25.aClass249_1681.aFloatArray2631[13] = (arg1 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var13 - 1.0F;
		var25.aClass249_1681.aFloatArray2631[14] = -1.0F;
		var25.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), 1.0F, 1.0F);
		var25.anInterface9_Impl1_1678 = this.aClass_ra_Sub2_9309.anInterface9_Impl1_8600;
		var25.anInt1685 = 0;
		var25.aClass184_1686 = this.aClass_ra_Sub2_9309.aClass184_8603;
		var25.method1862();
	}

	public void method736(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (this.aClass_ra_Sub2_9309.method4903() != Class161.aClass161_1688) {
			if (this.aBoolean9305) {
				arg2 = arg2 * this.anInt9306 / this.method318();
				arg3 = arg3 * this.anInt9304 / this.method683();
				arg0 += this.anInt9308 * arg2 / this.anInt9306;
				arg1 += this.anInt9313 * arg3 / this.anInt9304;
			}
			this.aClass_ra_Sub2_9309.aClass187_8556.method2086((float) arg0, (float) arg1, (float) (arg0 + arg2), (float) (arg1 + arg3), this.anInterface11_Impl3_9301.method106(0.0F), this.anInterface11_Impl3_9301.method104(0.0F), this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), this.anInterface11_Impl3_9301, arg5);
			return;
		}
		this.aClass_ra_Sub2_9309.method4925();
		this.aClass_ra_Sub2_9309.method4970(arg6);
		Class159 var9 = this.aClass_ra_Sub2_9309.aClass159_8590;
		var9.anInterface11_Impl3_1679 = this.anInterface11_Impl3_9301;
		var9.method1861(arg4, arg5);
		if (this.aBoolean9305) {
			arg2 = arg2 * this.anInt9306 / this.method318();
			arg3 = arg3 * this.anInt9304 / this.method683();
			arg0 += this.anInt9308 * arg2 / this.anInt9306;
			arg1 += this.anInt9313 * arg3 / this.anInt9304;
		}
		float var10 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method856();
		float var11 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method857();
		var9.aClass249_1681.method2486((float) arg2 * 2.0F / var10, (float) arg3 * 2.0F / var11, 1.0F, 1.0F);
		var9.aClass249_1681.aFloatArray2631[12] = ((float) arg0 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var10 - 1.0F;
		var9.aClass249_1681.aFloatArray2631[13] = ((float) arg1 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var11 - 1.0F;
		var9.aClass249_1681.aFloatArray2631[14] = -1.0F;
		var9.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), 1.0F, 1.0F);
		var9.anInterface9_Impl1_1678 = this.aClass_ra_Sub2_9309.anInterface9_Impl1_8600;
		var9.anInt1685 = 0;
		var9.aClass184_1686 = this.aClass_ra_Sub2_9309.aClass184_8603;
		var9.method1862();
	}

	public int method716() {
		return this.anInt9306;
	}

	public void method731(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, Class_ta arg7, int arg8, int arg9) {
		this.aClass_ra_Sub2_9309.method4925();
		Class159 var11 = this.aClass_ra_Sub2_9309.aClass159_8590;
		var11.anInterface11_Impl3_1679 = this.anInterface11_Impl3_9301;
		var11.method1861(1, -1);
		float var12 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method856();
		float var13 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method857();
		var11.aClass249_1681.method2516();
		if (this.aBoolean9305) {
			float var14 = (float) this.anInt9306 / (float) this.method318();
			float var15 = (float) this.anInt9304 / (float) this.method683();
			var11.aClass249_1681.aFloatArray2631[0] = (arg2 - arg0) * var14;
			var11.aClass249_1681.aFloatArray2631[1] = (arg3 - arg1) * var14;
			var11.aClass249_1681.aFloatArray2631[4] = (arg4 - arg0) * var15;
			var11.aClass249_1681.aFloatArray2631[5] = (arg5 - arg1) * var15;
			var11.aClass249_1681.aFloatArray2631[12] = (arg0 + (float) this.anInt9308) * var14 + this.aClass_ra_Sub2_9309.method4901();
			var11.aClass249_1681.aFloatArray2631[13] = (arg1 + (float) this.anInt9313) * var15 + this.aClass_ra_Sub2_9309.method4901();
		} else {
			var11.aClass249_1681.aFloatArray2631[0] = arg2 - arg0;
			var11.aClass249_1681.aFloatArray2631[1] = arg3 - arg1;
			var11.aClass249_1681.aFloatArray2631[4] = arg4 - arg0;
			var11.aClass249_1681.aFloatArray2631[5] = arg5 - arg1;
			var11.aClass249_1681.aFloatArray2631[12] = arg0 + this.aClass_ra_Sub2_9309.method4901();
			var11.aClass249_1681.aFloatArray2631[13] = arg1 + this.aClass_ra_Sub2_9309.method4901();
		}
		Class249 var16 = this.aClass_ra_Sub2_9309.aClass249_8576;
		var16.method2516();
		var16.aFloatArray2631[0] = 2.0F / var12;
		var16.aFloatArray2631[5] = 2.0F / var13;
		var16.aFloatArray2631[12] = -1.0F;
		var16.aFloatArray2631[13] = -1.0F;
		var16.aFloatArray2631[14] = -1.0F;
		var11.aClass249_1681.method2483(var16);
		var11.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), 1.0F, 1.0F);
		var11.anInterface9_Impl1_1678 = this.aClass_ra_Sub2_9309.anInterface9_Impl1_8600;
		var11.anInt1685 = 0;
		var11.aClass184_1686 = this.aClass_ra_Sub2_9309.aClass184_8603;
		Interface11_Impl3 var17 = ((Class_ta_Sub1) arg7).anInterface11_Impl3_8659;
		var11.anInterface11_Impl3_1680 = var17;
		var11.aClass249_1683.method2516();
		var11.aClass249_1683.aFloatArray2631[0] = (arg2 - arg0) * var17.method106(1.0F);
		var11.aClass249_1683.aFloatArray2631[1] = (arg3 - arg1) * var17.method106(1.0F);
		var11.aClass249_1683.aFloatArray2631[4] = (arg4 - arg0) * var17.method104(1.0F);
		var11.aClass249_1683.aFloatArray2631[5] = (arg5 - arg1) * var17.method104(1.0F);
		var11.aClass249_1683.aFloatArray2631[12] = (arg0 - (float) arg8) * var17.method106(1.0F);
		var11.aClass249_1683.aFloatArray2631[13] = (arg1 - (float) arg9) * var17.method104(1.0F);
		var11.method1864();
	}

	public void method732(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, Class_ta arg7, int arg8, int arg9) {
		this.aClass_ra_Sub2_9309.method4925();
		Class159 var11 = this.aClass_ra_Sub2_9309.aClass159_8590;
		var11.anInterface11_Impl3_1679 = this.anInterface11_Impl3_9301;
		var11.method1861(1, -1);
		float var12 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method856();
		float var13 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method857();
		var11.aClass249_1681.method2516();
		if (this.aBoolean9305) {
			float var14 = (float) this.anInt9306 / (float) this.method318();
			float var15 = (float) this.anInt9304 / (float) this.method683();
			var11.aClass249_1681.aFloatArray2631[0] = (arg2 - arg0) * var14;
			var11.aClass249_1681.aFloatArray2631[1] = (arg3 - arg1) * var14;
			var11.aClass249_1681.aFloatArray2631[4] = (arg4 - arg0) * var15;
			var11.aClass249_1681.aFloatArray2631[5] = (arg5 - arg1) * var15;
			var11.aClass249_1681.aFloatArray2631[12] = (arg0 + (float) this.anInt9308) * var14 + this.aClass_ra_Sub2_9309.method4901();
			var11.aClass249_1681.aFloatArray2631[13] = (arg1 + (float) this.anInt9313) * var15 + this.aClass_ra_Sub2_9309.method4901();
		} else {
			var11.aClass249_1681.aFloatArray2631[0] = arg2 - arg0;
			var11.aClass249_1681.aFloatArray2631[1] = arg3 - arg1;
			var11.aClass249_1681.aFloatArray2631[4] = arg4 - arg0;
			var11.aClass249_1681.aFloatArray2631[5] = arg5 - arg1;
			var11.aClass249_1681.aFloatArray2631[12] = arg0 + this.aClass_ra_Sub2_9309.method4901();
			var11.aClass249_1681.aFloatArray2631[13] = arg1 + this.aClass_ra_Sub2_9309.method4901();
		}
		Class249 var16 = this.aClass_ra_Sub2_9309.aClass249_8576;
		var16.method2516();
		var16.aFloatArray2631[0] = 2.0F / var12;
		var16.aFloatArray2631[5] = 2.0F / var13;
		var16.aFloatArray2631[12] = -1.0F;
		var16.aFloatArray2631[13] = -1.0F;
		var16.aFloatArray2631[14] = -1.0F;
		var11.aClass249_1681.method2483(var16);
		var11.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), 1.0F, 1.0F);
		var11.anInterface9_Impl1_1678 = this.aClass_ra_Sub2_9309.anInterface9_Impl1_8600;
		var11.anInt1685 = 0;
		var11.aClass184_1686 = this.aClass_ra_Sub2_9309.aClass184_8603;
		Interface11_Impl3 var17 = ((Class_ta_Sub1) arg7).anInterface11_Impl3_8659;
		var11.anInterface11_Impl3_1680 = var17;
		var11.aClass249_1683.method2516();
		var11.aClass249_1683.aFloatArray2631[0] = (arg2 - arg0) * var17.method106(1.0F);
		var11.aClass249_1683.aFloatArray2631[1] = (arg3 - arg1) * var17.method106(1.0F);
		var11.aClass249_1683.aFloatArray2631[4] = (arg4 - arg0) * var17.method104(1.0F);
		var11.aClass249_1683.aFloatArray2631[5] = (arg5 - arg1) * var17.method104(1.0F);
		var11.aClass249_1683.aFloatArray2631[12] = (arg0 - (float) arg8) * var17.method106(1.0F);
		var11.aClass249_1683.aFloatArray2631[13] = (arg1 - (float) arg9) * var17.method104(1.0F);
		var11.method1864();
	}

	public void method733(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, Class_ta arg7, int arg8, int arg9) {
		this.aClass_ra_Sub2_9309.method4925();
		Class159 var11 = this.aClass_ra_Sub2_9309.aClass159_8590;
		var11.anInterface11_Impl3_1679 = this.anInterface11_Impl3_9301;
		var11.method1861(1, -1);
		float var12 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method856();
		float var13 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method857();
		var11.aClass249_1681.method2516();
		if (this.aBoolean9305) {
			float var14 = (float) this.anInt9306 / (float) this.method318();
			float var15 = (float) this.anInt9304 / (float) this.method683();
			var11.aClass249_1681.aFloatArray2631[0] = (arg2 - arg0) * var14;
			var11.aClass249_1681.aFloatArray2631[1] = (arg3 - arg1) * var14;
			var11.aClass249_1681.aFloatArray2631[4] = (arg4 - arg0) * var15;
			var11.aClass249_1681.aFloatArray2631[5] = (arg5 - arg1) * var15;
			var11.aClass249_1681.aFloatArray2631[12] = (arg0 + (float) this.anInt9308) * var14 + this.aClass_ra_Sub2_9309.method4901();
			var11.aClass249_1681.aFloatArray2631[13] = (arg1 + (float) this.anInt9313) * var15 + this.aClass_ra_Sub2_9309.method4901();
		} else {
			var11.aClass249_1681.aFloatArray2631[0] = arg2 - arg0;
			var11.aClass249_1681.aFloatArray2631[1] = arg3 - arg1;
			var11.aClass249_1681.aFloatArray2631[4] = arg4 - arg0;
			var11.aClass249_1681.aFloatArray2631[5] = arg5 - arg1;
			var11.aClass249_1681.aFloatArray2631[12] = arg0 + this.aClass_ra_Sub2_9309.method4901();
			var11.aClass249_1681.aFloatArray2631[13] = arg1 + this.aClass_ra_Sub2_9309.method4901();
		}
		Class249 var16 = this.aClass_ra_Sub2_9309.aClass249_8576;
		var16.method2516();
		var16.aFloatArray2631[0] = 2.0F / var12;
		var16.aFloatArray2631[5] = 2.0F / var13;
		var16.aFloatArray2631[12] = -1.0F;
		var16.aFloatArray2631[13] = -1.0F;
		var16.aFloatArray2631[14] = -1.0F;
		var11.aClass249_1681.method2483(var16);
		var11.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), 1.0F, 1.0F);
		var11.anInterface9_Impl1_1678 = this.aClass_ra_Sub2_9309.anInterface9_Impl1_8600;
		var11.anInt1685 = 0;
		var11.aClass184_1686 = this.aClass_ra_Sub2_9309.aClass184_8603;
		Interface11_Impl3 var17 = ((Class_ta_Sub1) arg7).anInterface11_Impl3_8659;
		var11.anInterface11_Impl3_1680 = var17;
		var11.aClass249_1683.method2516();
		var11.aClass249_1683.aFloatArray2631[0] = (arg2 - arg0) * var17.method106(1.0F);
		var11.aClass249_1683.aFloatArray2631[1] = (arg3 - arg1) * var17.method106(1.0F);
		var11.aClass249_1683.aFloatArray2631[4] = (arg4 - arg0) * var17.method104(1.0F);
		var11.aClass249_1683.aFloatArray2631[5] = (arg5 - arg1) * var17.method104(1.0F);
		var11.aClass249_1683.aFloatArray2631[12] = (arg0 - (float) arg8) * var17.method106(1.0F);
		var11.aClass249_1683.aFloatArray2631[13] = (arg1 - (float) arg9) * var17.method104(1.0F);
		var11.method1864();
	}

	public void method725(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var13;
		int var14;
		int var15;
		int var16;
		if (this.aClass_ra_Sub2_9309.method4903() != Class161.aClass161_1688) {
			int var8 = arg1 + arg3;
			int var9 = arg0 + arg2;
			int var10 = this.method318();
			int var11 = this.method683();
			int var12 = arg1 + this.anInt9313;
			for (var13 = var12 + this.anInt9304; var13 <= var8; var13 += var11) {
				var14 = arg0 + this.anInt9308;
				for (var15 = var14 + this.anInt9306; var15 <= var9; var15 += var10) {
					this.aClass_ra_Sub2_9309.aClass187_8556.method2086((float) var14, (float) var12, (float) (var14 + this.anInt9306), (float) (var12 + this.anInt9304), 0.0F, 0.0F, this.anInterface11_Impl3_9301.method123(), this.anInterface11_Impl3_9301.method114(), this.anInterface11_Impl3_9301, arg5);
					var14 += var10;
				}
				if (var14 < var9) {
					var15 = var9 - var14;
					this.aClass_ra_Sub2_9309.aClass187_8556.method2086((float) var14, (float) var12, (float) (var14 + var15), (float) (var12 + this.anInt9304), 0.0F, 0.0F, (float) var15 / (float) this.anInt9306 * this.anInterface11_Impl3_9301.method123(), this.anInterface11_Impl3_9301.method114(), this.anInterface11_Impl3_9301, arg5);
				}
				var12 += var11;
			}
			if (var12 < var8) {
				var13 = var8 - var12;
				float var26 = (float) var13 / (float) this.anInt9304 * this.anInterface11_Impl3_9301.method114();
				var15 = arg0 + this.anInt9308;
				for (var16 = var15 + this.anInt9306; var16 <= var9; var16 += var10) {
					this.aClass_ra_Sub2_9309.aClass187_8556.method2086((float) var15, (float) var12, (float) (var15 + this.anInt9306), (float) (var12 + var13), 0.0F, 0.0F, this.anInterface11_Impl3_9301.method123(), var26, this.anInterface11_Impl3_9301, arg5);
					var15 += var10;
				}
				if (var15 < var9) {
					var16 = var9 - var15;
					this.aClass_ra_Sub2_9309.aClass187_8556.method2086((float) var15, (float) var12, (float) (var15 + var16), (float) (var12 + var13), 0.0F, 0.0F, (float) var16 / (float) this.anInt9306 * this.anInterface11_Impl3_9301.method123(), var26, this.anInterface11_Impl3_9301, arg5);
				}
			}
			return;
		}
		this.aClass_ra_Sub2_9309.method4925();
		this.aClass_ra_Sub2_9309.method4970(arg6);
		Class159 var21 = this.aClass_ra_Sub2_9309.aClass159_8590;
		var21.anInterface11_Impl3_1679 = this.anInterface11_Impl3_9301;
		var21.method1861(arg4, arg5);
		float var22 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method856();
		float var23 = (float) this.aClass_ra_Sub2_9309.method4782((byte) 0).method857();
		var21.anInterface9_Impl1_1678 = this.aClass_ra_Sub2_9309.anInterface9_Impl1_8600;
		var21.anInt1685 = 0;
		var21.aClass184_1686 = this.aClass_ra_Sub2_9309.aClass184_8603;
		boolean var24 = this.aBoolean9307 && this.anInt9313 == 0 && this.anInt9303 == 0;
		boolean var25 = this.aBoolean9312 && this.anInt9308 == 0 && this.anInt9300 == 0;
		if (var25 & var24) {
			var21.aClass249_1681.method2486((float) arg2 * 2.0F / var22, (float) arg3 * 2.0F / var23, 1.0F, 1.0F);
			var21.aClass249_1681.aFloatArray2631[12] = ((float) arg0 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
			var21.aClass249_1681.aFloatArray2631[13] = ((float) arg1 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
			var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
			var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) arg2), this.anInterface11_Impl3_9301.method104((float) arg3), 1.0F, 1.0F);
			var21.method1862();
		} else if (var25) {
			var13 = arg1 + arg3;
			var14 = this.method683();
			var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) arg2), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), 1.0F, 1.0F);
			var15 = arg1 + this.anInt9313;
			for (var16 = var15 + this.anInt9304; var16 <= var13; var16 += var14) {
				var21.aClass249_1681.method2486((float) arg2 * 2.0F / var22, (float) this.anInt9304 * 2.0F / var23, 1.0F, 1.0F);
				var21.aClass249_1681.aFloatArray2631[12] = ((float) arg0 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
				var21.aClass249_1681.aFloatArray2631[13] = ((float) var15 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
				var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
				var21.method1862();
				var15 += var14;
			}
			if (var15 < var13) {
				var16 = var13 - var15;
				var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) arg2), this.anInterface11_Impl3_9301.method104((float) var16), 1.0F, 1.0F);
				var21.aClass249_1681.method2486((float) arg2 * 2.0F / var22, (float) var16 * 2.0F / var23, 1.0F, 1.0F);
				var21.aClass249_1681.aFloatArray2631[12] = ((float) arg0 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
				var21.aClass249_1681.aFloatArray2631[13] = ((float) var15 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
				var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
				var21.method1862();
			}
		} else if (var24) {
			var13 = arg0 + arg2;
			var14 = this.method318();
			var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) arg3), 1.0F, 1.0F);
			var15 = arg0 + this.anInt9308;
			for (var16 = var15 + this.anInt9306; var16 <= var13; var16 += var14) {
				var21.aClass249_1681.method2486((float) this.anInt9306 * 2.0F / var22, (float) arg3 * 2.0F / var23, 1.0F, 1.0F);
				var21.aClass249_1681.aFloatArray2631[12] = ((float) var15 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
				var21.aClass249_1681.aFloatArray2631[13] = ((float) arg1 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
				var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
				var21.method1862();
				var15 += var14;
			}
			if (var15 < var13) {
				var16 = var13 - var15;
				var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) var16), this.anInterface11_Impl3_9301.method104((float) arg3), 1.0F, 1.0F);
				var21.aClass249_1681.method2486((float) var16 * 2.0F / var22, (float) arg3 * 2.0F / var23, 1.0F, 1.0F);
				var21.aClass249_1681.aFloatArray2631[12] = ((float) var15 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
				var21.aClass249_1681.aFloatArray2631[13] = ((float) arg1 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
				var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
				var21.method1862();
			}
		} else {
			var13 = arg1 + arg3;
			var14 = arg0 + arg2;
			var15 = this.method318();
			var16 = this.method683();
			int var17 = arg1 + this.anInt9313;
			int var18;
			int var19;
			int var20;
			for (var18 = var17 + this.anInt9304; var18 <= var13; var18 += var16) {
				var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), 1.0F, 1.0F);
				var19 = arg0 + this.anInt9308;
				for (var20 = var19 + this.anInt9306; var20 <= var14; var20 += var15) {
					var21.aClass249_1681.method2486((float) this.anInt9306 * 2.0F / var22, (float) this.anInt9304 * 2.0F / var23, 1.0F, 1.0F);
					var21.aClass249_1681.aFloatArray2631[12] = ((float) var19 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
					var21.aClass249_1681.aFloatArray2631[13] = ((float) var17 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
					var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
					var21.method1862();
					var19 += var15;
				}
				if (var19 < var14) {
					var20 = var14 - var19;
					var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) var20), this.anInterface11_Impl3_9301.method104((float) this.anInt9304), 1.0F, 1.0F);
					var21.aClass249_1681.method2486((float) var20 * 2.0F / var22, (float) this.anInt9304 * 2.0F / var23, 1.0F, 1.0F);
					var21.aClass249_1681.aFloatArray2631[12] = ((float) var19 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
					var21.aClass249_1681.aFloatArray2631[13] = ((float) var17 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
					var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
					var21.method1862();
				}
				var17 += var16;
			}
			if (var17 < var13) {
				var18 = var13 - var17;
				var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) this.anInt9306), this.anInterface11_Impl3_9301.method104((float) var18), 1.0F, 1.0F);
				var19 = arg0 + this.anInt9308;
				for (var20 = var19 + this.anInt9306; var20 <= var14; var20 += var15) {
					var21.aClass249_1681.method2486((float) this.anInt9306 * 2.0F / var22, (float) var18 * 2.0F / var23, 1.0F, 1.0F);
					var21.aClass249_1681.aFloatArray2631[12] = ((float) var19 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
					var21.aClass249_1681.aFloatArray2631[13] = ((float) var17 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
					var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
					var21.method1862();
					var19 += var15;
				}
				if (var19 < var14) {
					var20 = var14 - var19;
					var21.aClass249_1682.method2486(this.anInterface11_Impl3_9301.method106((float) var20), this.anInterface11_Impl3_9301.method104((float) var18), 1.0F, 1.0F);
					var21.aClass249_1681.method2486((float) var20 * 2.0F / var22, (float) var18 * 2.0F / var23, 1.0F, 1.0F);
					var21.aClass249_1681.aFloatArray2631[12] = ((float) var19 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var22 - 1.0F;
					var21.aClass249_1681.aFloatArray2631[13] = ((float) var17 + this.aClass_ra_Sub2_9309.method4901()) * 2.0F / var23 - 1.0F;
					var21.aClass249_1681.aFloatArray2631[14] = -1.0F;
					var21.method1862();
				}
			}
		}
	}
}
