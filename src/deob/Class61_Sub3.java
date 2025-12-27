package deob;

public abstract class Class61_Sub3 extends Class61 {

	public static int anInt9331 = 12;

	public static int anInt9332 = 8;

	public static int anInt9345 = 4;

	public static int anInt9351 = 0;

	public static int anInt9335 = 0;

	public static int anInt9353 = 0;

	public static int anInt9354 = 0;

	public static int anInt9333 = 0;

	public static int anInt9329 = 0;

	public static int anInt9357 = 0;

	public static int anInt9323 = 0;

	public Class_ra_Sub3 aClass_ra_Sub3_9355;

	public int anInt9358;

	public int anInt9325;

	public static int anInt9324;

	public static int anInt9326;

	public int anInt9327;

	public int anInt9328;

	public static int anInt9334;

	public static int anInt9336;

	public int anInt9337;

	public static int anInt9338;

	public static int anInt9339;

	public static int anInt9340;

	public static int anInt9341;

	public static int anInt9342;

	public static int anInt9343;

	public static int anInt9344;

	public static int anInt9346;

	public static int anInt9347;

	public static int anInt9348;

	public static int anInt9349;

	public static int anInt9350;

	public int anInt9352;

	public static int anInt9356;

	public int[] anIntArray9330;

	public void method717(int arg0, int arg1, int arg2, int arg3) {
		this.anInt9352 = arg0;
		this.anInt9327 = arg1;
		this.anInt9328 = arg2;
		this.anInt9337 = arg3;
	}

	public int method711() {
		return this.anInt9327 + this.anInt9325 + this.anInt9337;
	}

	public int method681() {
		return this.anInt9358;
	}

	public int method682() {
		return this.anInt9325;
	}

	public int method318() {
		return this.anInt9352 + this.anInt9358 + this.anInt9328;
	}

	public int method683() {
		return this.anInt9327 + this.anInt9325 + this.anInt9337;
	}

	public void method701(int arg0, int arg1, int arg2, int arg3) {
		this.anInt9352 = arg0;
		this.anInt9327 = arg1;
		this.anInt9328 = arg2;
		this.anInt9337 = arg3;
	}

	public void method694(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (this.aClass_ra_Sub3_9355.method5187()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray9330 == null) {
			this.anIntArray9330 = new int[4];
		}
		this.aClass_ra_Sub3_9355.qa(this.anIntArray9330);
		this.aClass_ra_Sub3_9355.o(this.aClass_ra_Sub3_9355.anInt8621, this.aClass_ra_Sub3_9355.anInt8623, arg0 + arg2, arg1 + arg3);
		int var8 = this.method318();
		int var9 = this.method683();
		int var10 = (arg2 + var8 - 1) / var8;
		int var11 = (arg3 + var9 - 1) / var9;
		for (int var12 = 0; var12 < var11; var12++) {
			int var13 = var12 * var9;
			for (int var14 = 0; var14 < var10; var14++) {
				this.method688(arg0 + var14 * var8, arg1 + var13, arg4, arg5, arg6);
			}
		}
		this.aClass_ra_Sub3_9355.r(this.anIntArray9330[0], this.anIntArray9330[1], this.anIntArray9330[2], this.anIntArray9330[3]);
	}

	public boolean method743(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		int var7 = this.anInt9352 + this.anInt9358 + this.anInt9328;
		int var8 = this.anInt9327 + this.anInt9325 + this.anInt9337;
		float var9;
		float var10;
		float var11;
		float var12;
		float var13;
		float var14;
		float var15;
		float var16;
		if (var7 != this.anInt9358 || var8 != this.anInt9325) {
			var9 = (arg2 - arg0) / (float) var7;
			var10 = (arg3 - arg1) / (float) var7;
			var11 = (arg4 - arg0) / (float) var8;
			var12 = (arg5 - arg1) / (float) var8;
			var13 = var11 * (float) this.anInt9327;
			var14 = var12 * (float) this.anInt9327;
			var15 = var9 * (float) this.anInt9352;
			var16 = var10 * (float) this.anInt9352;
			float var17 = -var9 * (float) this.anInt9328;
			float var18 = -var10 * (float) this.anInt9328;
			float var19 = -var11 * (float) this.anInt9337;
			float var20 = -var12 * (float) this.anInt9337;
			arg0 += var15 + var13;
			arg1 += var16 + var14;
			arg2 += var17 + var13;
			arg3 += var18 + var14;
			arg4 += var15 + var19;
			arg5 += var16 + var20;
		}
		var9 = arg4 + (arg2 - arg0);
		var10 = arg3 + (arg5 - arg1);
		if (arg0 < arg2) {
			var11 = arg0;
			var12 = arg2;
		} else {
			var11 = arg2;
			var12 = arg0;
		}
		if (arg4 < var11) {
			var11 = arg4;
		}
		if (var9 < var11) {
			var11 = var9;
		}
		if (arg4 > var12) {
			var12 = arg4;
		}
		if (var9 > var12) {
			var12 = var9;
		}
		if (arg1 < arg3) {
			var13 = arg1;
			var14 = arg3;
		} else {
			var13 = arg3;
			var14 = arg1;
		}
		if (arg5 < var13) {
			var13 = arg5;
		}
		if (var10 < var13) {
			var13 = var10;
		}
		if (arg5 > var14) {
			var14 = arg5;
		}
		if (var10 > var14) {
			var14 = var10;
		}
		if (var11 < (float) this.aClass_ra_Sub3_9355.anInt8621) {
			var11 = this.aClass_ra_Sub3_9355.anInt8621;
		}
		if (var12 > (float) this.aClass_ra_Sub3_9355.anInt8635) {
			var12 = this.aClass_ra_Sub3_9355.anInt8635;
		}
		if (var13 < (float) this.aClass_ra_Sub3_9355.anInt8623) {
			var13 = this.aClass_ra_Sub3_9355.anInt8623;
		}
		if (var14 > (float) this.aClass_ra_Sub3_9355.anInt8624) {
			var14 = this.aClass_ra_Sub3_9355.anInt8624;
		}
		var12 = var11 - var12;
		if (var12 >= 0.0F) {
			return false;
		}
		var14 = var13 - var14;
		if (var14 >= 0.0F) {
			return false;
		}
		anInt9338 = this.aClass_ra_Sub3_9355.anInt8618;
		anInt9339 = (int) ((float) ((int) var13 * anInt9338) + var11);
		var15 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		var16 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		anInt9340 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt9358 / var15);
		anInt9341 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt9325 / var16);
		anInt9342 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt9358 / var16);
		anInt9343 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt9325 / var15);
		anInt9344 = (int) (var11 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var9) / 4.0F * 16.0F);
		anInt9326 = (int) (var13 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var10) / 4.0F * 16.0F);
		anInt9346 = (this.anInt9358 >> 1 << 12) + (anInt9326 * anInt9342 >> 4);
		anInt9324 = (this.anInt9325 >> 1 << 12) + (anInt9326 * anInt9343 >> 4);
		anInt9348 = anInt9344 * anInt9340 >> 4;
		anInt9349 = anInt9344 * anInt9341 >> 4;
		anInt9334 = (int) var11;
		anInt9347 = (int) var12;
		anInt9336 = (int) var13;
		anInt9356 = (int) var14;
		return true;
	}

	public void method726(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (this.aClass_ra_Sub3_9355.method5187()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray9330 == null) {
			this.anIntArray9330 = new int[4];
		}
		this.aClass_ra_Sub3_9355.qa(this.anIntArray9330);
		this.aClass_ra_Sub3_9355.o(this.aClass_ra_Sub3_9355.anInt8621 * 1907727929 * 512290825, this.aClass_ra_Sub3_9355.anInt8623 * 766013039 * -1679642481, arg0 + arg2, arg1 + arg3);
		int var8 = this.method318();
		int var9 = this.method683();
		int var10 = (arg2 + var8 - 1) / var8;
		int var11 = (arg3 + var9 - 1) / var9;
		for (int var12 = 0; var12 < var11; var12++) {
			int var13 = var12 * var9;
			for (int var14 = 0; var14 < var10; var14++) {
				this.method688(arg0 + var14 * var8, arg1 + var13, arg4, arg5, arg6);
			}
		}
		this.aClass_ra_Sub3_9355.r(this.anIntArray9330[0], this.anIntArray9330[1], this.anIntArray9330[2], this.anIntArray9330[3]);
	}

	public void method680(int[] arg0) {
		arg0[0] = this.anInt9352;
		arg0[1] = this.anInt9327;
		arg0[2] = this.anInt9328;
		arg0[3] = this.anInt9337;
	}

	public void method730(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
		if (this.aClass_ra_Sub3_9355.method5187()) {
			throw new IllegalStateException();
		} else if (this.method743(arg0, arg1, arg2, arg3, arg4, arg5)) {
			anInt9350 = arg7;
			if (arg6 != 1) {
				anInt9351 = arg7 >>> 24;
				anInt9335 = 256 - anInt9351;
				if (arg6 == 0) {
					anInt9353 = arg7 >> 16 & 0xFF;
					anInt9354 = arg7 >> 8 & 0xFF;
					anInt9333 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					anInt9329 = arg7 >>> 24;
					anInt9357 = 256 - anInt9329;
					int var11 = (arg7 & 0xFF00FF) * anInt9357 & 0xFF00FF00;
					int var12 = (arg7 & 0xFF00) * anInt9357 & 0xFF0000;
					anInt9323 = (var11 | var12) >>> 8;
				}
			}
			this.method756(arg6, arg8);
		}
	}

	public int method702() {
		return this.anInt9358;
	}

	public void method732(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, Class_ta arg7, int arg8, int arg9) {
		if (this.aClass_ra_Sub3_9355.method5187()) {
			throw new IllegalStateException();
		} else if (this.method743(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Class_ta_Sub3 var11 = (Class_ta_Sub3) arg7;
			this.method745(var11.anIntArray8661, var11.anIntArray8662, anInt9334 - arg8, -arg9 - (anInt9356 - anInt9336));
		}
	}

	public int method714() {
		return this.anInt9358;
	}

	public int method699() {
		return this.anInt9358;
	}

	public int method716() {
		return this.anInt9358;
	}

	public int method693() {
		return this.anInt9325;
	}

	public int method718() {
		return this.anInt9325;
	}

	public int method719() {
		return this.anInt9325;
	}

	public int method316() {
		return this.anInt9352 + this.anInt9358 + this.anInt9328;
	}

	public int method315() {
		return this.anInt9352 + this.anInt9358 + this.anInt9328;
	}

	public int method724() {
		return this.anInt9327 + this.anInt9325 + this.anInt9337;
	}

	public int method723() {
		return this.anInt9327 + this.anInt9325 + this.anInt9337;
	}

	public int method317() {
		return this.anInt9352 + this.anInt9358 + this.anInt9328;
	}

	public void method725(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (this.aClass_ra_Sub3_9355.method5187()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray9330 == null) {
			this.anIntArray9330 = new int[4];
		}
		this.aClass_ra_Sub3_9355.qa(this.anIntArray9330);
		this.aClass_ra_Sub3_9355.o(this.aClass_ra_Sub3_9355.anInt8621 * 1907727929 * 512290825, this.aClass_ra_Sub3_9355.anInt8623 * 766013039 * -1679642481, arg0 + arg2, arg1 + arg3);
		int var8 = this.method318();
		int var9 = this.method683();
		int var10 = (arg2 + var8 - 1) / var8;
		int var11 = (arg3 + var9 - 1) / var9;
		for (int var12 = 0; var12 < var11; var12++) {
			int var13 = var12 * var9;
			for (int var14 = 0; var14 < var10; var14++) {
				this.method688(arg0 + var14 * var8, arg1 + var13, arg4, arg5, arg6);
			}
		}
		this.aClass_ra_Sub3_9355.r(this.anIntArray9330[0], this.anIntArray9330[1], this.anIntArray9330[2], this.anIntArray9330[3]);
	}

	public void method733(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, Class_ta arg7, int arg8, int arg9) {
		if (this.aClass_ra_Sub3_9355.method5187()) {
			throw new IllegalStateException();
		} else if (this.method743(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Class_ta_Sub3 var11 = (Class_ta_Sub3) arg7;
			this.method745(var11.anIntArray8661, var11.anIntArray8662, anInt9334 - arg8, -arg9 - (anInt9356 - anInt9336));
		}
	}

	public void method727(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (this.aClass_ra_Sub3_9355.method5187()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray9330 == null) {
			this.anIntArray9330 = new int[4];
		}
		this.aClass_ra_Sub3_9355.qa(this.anIntArray9330);
		this.aClass_ra_Sub3_9355.o(this.aClass_ra_Sub3_9355.anInt8621 * 1907727929 * 512290825, this.aClass_ra_Sub3_9355.anInt8623 * 766013039 * -1679642481, arg0 + arg2, arg1 + arg3);
		int var8 = this.method318();
		int var9 = this.method683();
		int var10 = (arg2 + var8 - 1) / var8;
		int var11 = (arg3 + var9 - 1) / var9;
		for (int var12 = 0; var12 < var11; var12++) {
			int var13 = var12 * var9;
			for (int var14 = 0; var14 < var10; var14++) {
				this.method688(arg0 + var14 * var8, arg1 + var13, arg4, arg5, arg6);
			}
		}
		this.aClass_ra_Sub3_9355.r(this.anIntArray9330[0], this.anIntArray9330[1], this.anIntArray9330[2], this.anIntArray9330[3]);
	}

	public void method703(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, Class_ta arg7, int arg8, int arg9) {
		if (this.aClass_ra_Sub3_9355.method5187()) {
			throw new IllegalStateException();
		} else if (this.method743(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Class_ta_Sub3 var11 = (Class_ta_Sub3) arg7;
			this.method745(var11.anIntArray8661, var11.anIntArray8662, anInt9334 - arg8, -arg9 - (anInt9356 - anInt9336));
		}
	}

	public Class61_Sub3(Class_ra_Sub3 arg0, int arg1, int arg2) {
		this.aClass_ra_Sub3_9355 = arg0;
		this.anInt9358 = arg1;
		this.anInt9325 = arg2;
	}

	public void method728(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
		if (this.aClass_ra_Sub3_9355.method5187()) {
			throw new IllegalStateException();
		} else if (this.method743(arg0, arg1, arg2, arg3, arg4, arg5)) {
			anInt9350 = arg7;
			if (arg6 != 1) {
				anInt9351 = arg7 >>> 24;
				anInt9335 = 256 - anInt9351;
				if (arg6 == 0) {
					anInt9353 = arg7 >> 16 & 0xFF;
					anInt9354 = arg7 >> 8 & 0xFF;
					anInt9333 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					anInt9329 = arg7 >>> 24;
					anInt9357 = 256 - anInt9329;
					int var11 = (arg7 & 0xFF00FF) * anInt9357 & 0xFF00FF00;
					int var12 = (arg7 & 0xFF00) * anInt9357 & 0xFF0000;
					anInt9323 = (var11 | var12) >>> 8;
				}
			}
			this.method756(arg6, arg8);
		}
	}

	public void method692(int[] arg0) {
		arg0[0] = this.anInt9352;
		arg0[1] = this.anInt9327;
		arg0[2] = this.anInt9328;
		arg0[3] = this.anInt9337;
	}

	public void method720(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, Class_ta arg7, int arg8, int arg9) {
		if (this.aClass_ra_Sub3_9355.method5187()) {
			throw new IllegalStateException();
		} else if (this.method743(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Class_ta_Sub3 var11 = (Class_ta_Sub3) arg7;
			this.method745(var11.anIntArray8661, var11.anIntArray8662, anInt9334 - arg8, -arg9 - (anInt9356 - anInt9336));
		}
	}

	public void method731(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, Class_ta arg7, int arg8, int arg9) {
		if (this.aClass_ra_Sub3_9355.method5187()) {
			throw new IllegalStateException();
		} else if (this.method743(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Class_ta_Sub3 var11 = (Class_ta_Sub3) arg7;
			this.method745(var11.anIntArray8661, var11.anIntArray8662, anInt9334 - arg8, -arg9 - (anInt9356 - anInt9336));
		}
	}

	public void method735(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
		if (this.aClass_ra_Sub3_9355.method5187()) {
			throw new IllegalStateException();
		} else if (this.method743(arg0, arg1, arg2, arg3, arg4, arg5)) {
			anInt9350 = arg7;
			if (arg6 != 1) {
				anInt9351 = arg7 >>> 24;
				anInt9335 = 256 - anInt9351;
				if (arg6 == 0) {
					anInt9353 = arg7 >> 16 & 0xFF;
					anInt9354 = arg7 >> 8 & 0xFF;
					anInt9333 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					anInt9329 = arg7 >>> 24;
					anInt9357 = 256 - anInt9329;
					int var11 = (arg7 & 0xFF00FF) * anInt9357 & 0xFF00FF00;
					int var12 = (arg7 & 0xFF00) * anInt9357 & 0xFF0000;
					anInt9323 = (var11 | var12) >>> 8;
				}
			}
			this.method756(arg6, arg8);
		}
	}

	public int method696() {
		return this.anInt9327 + this.anInt9325 + this.anInt9337;
	}

	public abstract void method688(int arg0, int arg1, int arg2, int arg3, int arg4);

	public abstract void method689(int arg0, int arg1, Class_ta arg2, int arg3, int arg4);

	public abstract void method742(boolean arg0, boolean arg1, boolean arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12);

	public abstract void method744(boolean arg0, boolean arg1, boolean arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12);

	public abstract void method745(int[] arg0, int[] arg1, int arg2, int arg3);

	public abstract void method685(int arg0, int arg1, int arg2, int arg3, int arg4);

	public abstract void method746(int[] arg0, int[] arg1, int arg2, int arg3);

	public abstract void method709(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

	public abstract void method710(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

	public abstract void method706(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

	public abstract void method712(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

	public abstract void method747(boolean arg0, boolean arg1, boolean arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12);

	public abstract void method736(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

	public abstract void method748(boolean arg0, boolean arg1, boolean arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12);

	public abstract void method749(boolean arg0, boolean arg1, boolean arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12);

	public abstract void method708(int arg0, int arg1, Class_ta arg2, int arg3, int arg4);

	public abstract void method750(int arg0, int arg1);

	public abstract void method751(int[] arg0, int[] arg1, int arg2, int arg3);

	public abstract void method752(int[] arg0, int[] arg1, int arg2, int arg3);

	public abstract void method753(int[] arg0, int[] arg1, int arg2, int arg3);

	public abstract void method754(boolean arg0, boolean arg1, boolean arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12);

	public abstract void method755(int arg0, int arg1);

	public abstract void method756(int arg0, int arg1);

	public abstract void method700(int arg0, int arg1, int arg2, int arg3, int arg4);
}
