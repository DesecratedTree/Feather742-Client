package deob;

@ObfuscatedName("i")
public class i extends Class_xa implements Interface28 {

	public Class471 aClass471_6939 = new Class471();

	public ja aJa6938;

	public long nativeid;

	public i(ja arg0, ba arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
		super(arg2, arg3, arg6, arg4);
		this.aJa6938 = arg0;
		this.G(this.aJa6938, arg1, arg2, arg3, this.anIntArrayArray6394, arg5, arg6, arg7, arg8);
	}

	public void finalize() {
		if (this.nativeid != 0L) {
			Class71.method827(this, 242671403);
		}
	}

	public void method6412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
		this.aJa6938.nd().method354(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public void method6423(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
		int var7 = 0;
		float[] var8 = new float[this.aClass471_6939.method5875(-181868484)];
		for (Class330_Sub14 var9 = (Class330_Sub14) this.aClass471_6939.method5869(539664854); var9 != null; var9 = (Class330_Sub14) this.aClass471_6939.method5873((byte) -103)) {
			var8[var7++] = var9.method3317(1005991516);
		}
		this.t(var8);
		for (int var13 = 0; var13 < arg2 + arg2; var13++) {
			for (int var10 = 0; var10 < arg2 + arg2; var10++) {
				if (arg3[var13][var10]) {
					int var11 = arg0 - arg2 + var13;
					int var12 = arg1 - arg2 + var10;
					if (var11 >= 0 && var11 < this.anInt6397 && var12 >= 0 && var12 < this.anInt6393) {
						this.aJa6938.nd().method363(this, var11, var12);
					}
				}
			}
		}
	}

	public void method6415(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
		this.aJa6938.nd().method354(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public boolean method6418(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		return true;
	}

	public void method6420(Class330_Sub14 arg0, int[] arg1) {
		this.aClass471_6939.method5878(arg0, (short) 8192);
		this.A(arg0.hashCode(), arg0.method3318(1015243074), arg0.method3311((byte) 71), arg0.method3312((short) -12371), arg0.method3316((byte) 4), arg0.method3313(-1097585580), arg1);
	}

	public final void method6422(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, Class77 arg10, boolean arg11) {
		this.ya(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10.anInt652 * -1037349593 * -576105833, arg10.anInt650 * -2010008277 * -348036733, arg10.anInt651 * -533215263 * -892945375, arg11);
	}

	public final void method6419(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, Class77 arg10, boolean arg11) {
		this.ya(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10.anInt652 * -1037349593 * -576105833, arg10.anInt650 * -2010008277 * -348036733, arg10.anInt651 * -533215263 * -892945375, arg11);
	}

	public void method6421(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
		int var7 = 0;
		float[] var8 = new float[this.aClass471_6939.method5875(801494646)];
		for (Class330_Sub14 var9 = (Class330_Sub14) this.aClass471_6939.method5869(539664854); var9 != null; var9 = (Class330_Sub14) this.aClass471_6939.method5873((byte) -81)) {
			var8[var7++] = var9.method3317(-786700961);
		}
		this.t(var8);
		for (int var13 = 0; var13 < arg2 + arg2; var13++) {
			for (int var10 = 0; var10 < arg2 + arg2; var10++) {
				if (arg3[var13][var10]) {
					int var11 = arg0 - arg2 + var13;
					int var12 = arg1 - arg2 + var10;
					if (var11 >= 0 && var11 < this.anInt6397 * -1250378663 * 1972554729 && var12 >= 0 && var12 < this.anInt6393 * -1805935063 * 24567321) {
						this.aJa6938.nd().method363(this, var11, var12);
					}
				}
			}
		}
	}

	public void method6428(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
		this.aJa6938.nd().method354(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public void method6414(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, Class77 arg13, boolean arg14) {
		boolean var16 = false;
		if (arg9 != null) {
			int[] var17 = arg9;
			for (int var18 = 0; var18 < var17.length; var18++) {
				int var19 = var17[var18];
				if (var19 != -1) {
					var16 = true;
					break;
				}
			}
		}
		int var31 = arg9.length;
		int[] var32 = new int[var31 * 3];
		int[] var33 = new int[var31 * 3];
		int[] var20 = new int[var31 * 3];
		int[] var21 = new int[var31 * 3];
		int[] var22 = new int[var31 * 3];
		int[] var23 = arg10 == null ? null : new int[var31 * 3];
		int[] var24 = arg3 == null ? null : new int[var31 * 3];
		int[] var25 = arg5 == null ? null : new int[var31 * 3];
		int var26 = 0;
		for (int var27 = 0; var27 < var31; var27++) {
			int var28 = arg6[var27];
			int var29 = arg7[var27];
			int var30 = arg8[var27];
			var32[var26] = arg2[var28];
			var33[var26] = arg4[var28];
			var20[var26] = arg9[var27];
			var21[var26] = arg11[var27];
			var22[var26] = arg12[var27];
			if (arg10 != null) {
				var23[var26] = arg10[var27];
			}
			if (arg3 != null) {
				var24[var26] = arg3[var28];
			}
			if (arg5 != null) {
				var25[var26] = arg5[var28];
			}
			var26++;
			var32[var26] = arg2[var29];
			var33[var26] = arg4[var29];
			var20[var26] = arg9[var27];
			var21[var26] = arg11[var27];
			var22[var26] = arg12[var27];
			if (arg10 != null) {
				var23[var26] = arg10[var27];
			}
			if (arg3 != null) {
				var24[var26] = arg3[var29];
			}
			if (arg5 != null) {
				var25[var26] = arg5[var29];
			}
			var26++;
			var32[var26] = arg2[var30];
			var33[var26] = arg4[var30];
			var20[var26] = arg9[var27];
			var21[var26] = arg11[var27];
			var22[var26] = arg12[var27];
			if (arg10 != null) {
				var23[var26] = arg10[var27];
			}
			if (arg3 != null) {
				var24[var26] = arg3[var30];
			}
			if (arg5 != null) {
				var25[var26] = arg5[var30];
			}
			var26++;
		}
		if (var16 || var23 != null) {
			this.ya(arg0, arg1, var32, var24, var33, var25, var20, var23, var21, var22, arg13.anInt652 * -1037349593 * -576105833, arg13.anInt650 * -2010008277 * -348036733, arg13.anInt651 * -533215263 * -892945375, arg14);
		}
	}

	public boolean method6424(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		return true;
	}

	public final void method6425(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, Class77 arg10, boolean arg11) {
		this.ya(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10.anInt652, arg10.anInt650, arg10.anInt651, arg11);
	}

	public void method6427(Class330_Sub14 arg0, int[] arg1) {
		this.aClass471_6939.method5878(arg0, (short) 8192);
		this.A(arg0.hashCode(), arg0.method3318(-609610609), arg0.method3311((byte) -77), arg0.method3312((short) 7995), arg0.method3316((byte) -20), arg0.method3313(-1641840770), arg1);
	}

	public void method6429(Class330_Sub14 arg0, int[] arg1) {
		this.aClass471_6939.method5878(arg0, (short) 8192);
		this.A(arg0.hashCode(), arg0.method3318(-1449530980), arg0.method3311((byte) -1), arg0.method3312((short) 14945), arg0.method3316((byte) -52), arg0.method3313(-938611038), arg1);
	}

	public void method6450() {
		if (this.nativeid != 0L) {
			Class71.method827(this, 1890972237);
		}
	}

	public void method6451() {
		if (this.nativeid != 0L) {
			Class71.method827(this, -1227547993);
		}
	}

	public void method6426(Class330_Sub14 arg0, int[] arg1) {
		this.aClass471_6939.method5878(arg0, (short) 8192);
		this.A(arg0.hashCode(), arg0.method3318(1533626295), arg0.method3311((byte) 114), arg0.method3312((short) 16690), arg0.method3316((byte) 30), arg0.method3313(-646407257), arg1);
	}

	public void method6411(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, Class77 arg13, boolean arg14) {
		boolean var16 = false;
		if (arg9 != null) {
			int[] var17 = arg9;
			for (int var18 = 0; var18 < var17.length; var18++) {
				int var19 = var17[var18];
				if (var19 != -1) {
					var16 = true;
					break;
				}
			}
		}
		int var31 = arg9.length;
		int[] var32 = new int[var31 * 3];
		int[] var33 = new int[var31 * 3];
		int[] var20 = new int[var31 * 3];
		int[] var21 = new int[var31 * 3];
		int[] var22 = new int[var31 * 3];
		int[] var23 = arg10 == null ? null : new int[var31 * 3];
		int[] var24 = arg3 == null ? null : new int[var31 * 3];
		int[] var25 = arg5 == null ? null : new int[var31 * 3];
		int var26 = 0;
		for (int var27 = 0; var27 < var31; var27++) {
			int var28 = arg6[var27];
			int var29 = arg7[var27];
			int var30 = arg8[var27];
			var32[var26] = arg2[var28];
			var33[var26] = arg4[var28];
			var20[var26] = arg9[var27];
			var21[var26] = arg11[var27];
			var22[var26] = arg12[var27];
			if (arg10 != null) {
				var23[var26] = arg10[var27];
			}
			if (arg3 != null) {
				var24[var26] = arg3[var28];
			}
			if (arg5 != null) {
				var25[var26] = arg5[var28];
			}
			var26++;
			var32[var26] = arg2[var29];
			var33[var26] = arg4[var29];
			var20[var26] = arg9[var27];
			var21[var26] = arg11[var27];
			var22[var26] = arg12[var27];
			if (arg10 != null) {
				var23[var26] = arg10[var27];
			}
			if (arg3 != null) {
				var24[var26] = arg3[var29];
			}
			if (arg5 != null) {
				var25[var26] = arg5[var29];
			}
			var26++;
			var32[var26] = arg2[var30];
			var33[var26] = arg4[var30];
			var20[var26] = arg9[var27];
			var21[var26] = arg11[var27];
			var22[var26] = arg12[var27];
			if (arg10 != null) {
				var23[var26] = arg10[var27];
			}
			if (arg3 != null) {
				var24[var26] = arg3[var30];
			}
			if (arg5 != null) {
				var25[var26] = arg5[var30];
			}
			var26++;
		}
		if (var16 || var23 != null) {
			this.ya(arg0, arg1, var32, var24, var33, var25, var20, var23, var21, var22, arg13.anInt652 * -1037349593 * -576105833, arg13.anInt650 * -2010008277 * -348036733, arg13.anInt651 * -533215263 * -892945375, arg14);
		}
	}

	public void method6413(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, Class77 arg13, boolean arg14) {
		boolean var16 = false;
		if (arg9 != null) {
			int[] var17 = arg9;
			for (int var18 = 0; var18 < var17.length; var18++) {
				int var19 = var17[var18];
				if (var19 != -1) {
					var16 = true;
					break;
				}
			}
		}
		int var31 = arg9.length;
		int[] var32 = new int[var31 * 3];
		int[] var33 = new int[var31 * 3];
		int[] var20 = new int[var31 * 3];
		int[] var21 = new int[var31 * 3];
		int[] var22 = new int[var31 * 3];
		int[] var23 = arg10 == null ? null : new int[var31 * 3];
		int[] var24 = arg3 == null ? null : new int[var31 * 3];
		int[] var25 = arg5 == null ? null : new int[var31 * 3];
		int var26 = 0;
		for (int var27 = 0; var27 < var31; var27++) {
			int var28 = arg6[var27];
			int var29 = arg7[var27];
			int var30 = arg8[var27];
			var32[var26] = arg2[var28];
			var33[var26] = arg4[var28];
			var20[var26] = arg9[var27];
			var21[var26] = arg11[var27];
			var22[var26] = arg12[var27];
			if (arg10 != null) {
				var23[var26] = arg10[var27];
			}
			if (arg3 != null) {
				var24[var26] = arg3[var28];
			}
			if (arg5 != null) {
				var25[var26] = arg5[var28];
			}
			var26++;
			var32[var26] = arg2[var29];
			var33[var26] = arg4[var29];
			var20[var26] = arg9[var27];
			var21[var26] = arg11[var27];
			var22[var26] = arg12[var27];
			if (arg10 != null) {
				var23[var26] = arg10[var27];
			}
			if (arg3 != null) {
				var24[var26] = arg3[var29];
			}
			if (arg5 != null) {
				var25[var26] = arg5[var29];
			}
			var26++;
			var32[var26] = arg2[var30];
			var33[var26] = arg4[var30];
			var20[var26] = arg9[var27];
			var21[var26] = arg11[var27];
			var22[var26] = arg12[var27];
			if (arg10 != null) {
				var23[var26] = arg10[var27];
			}
			if (arg3 != null) {
				var24[var26] = arg3[var30];
			}
			if (arg5 != null) {
				var25[var26] = arg5[var30];
			}
			var26++;
		}
		if (var16 || var23 != null) {
			this.ya(arg0, arg1, var32, var24, var33, var25, var20, var23, var21, var22, arg13.anInt652, arg13.anInt650, arg13.anInt651, arg14);
		}
	}

	@ObfuscatedName("i.ar(IIIIII[I)V")
	public native void ar(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

	@ObfuscatedName("i.G(Lja;Lba;II[[I[[IIII)V")
	public native void G(ja arg0, ba arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

	@ObfuscatedName("i.ma(Z)V")
	public native void ma(boolean arg0);

	@ObfuscatedName("i.ak(Lja;Lba;II[[I[[IIII)V")
	public native void ak(ja arg0, ba arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

	@ObfuscatedName("i.y(IILClass_na;)LClass_na;")
	public native Class_na y(int arg0, int arg1, Class_na arg2);

	@ObfuscatedName("i.A(IIIIII[I)V")
	public native void A(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

	@ObfuscatedName("i.t([F)V")
	public native void t(float[] arg0);

	@ObfuscatedName("i.w(IILClass_na;)LClass_na;")
	public native Class_na w(int arg0, int arg1, Class_na arg2);

	@ObfuscatedName("i.UA(LClass_na;IIIIZ)V")
	public native void UA(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

	@ObfuscatedName("i.h(IILClass_na;)LClass_na;")
	public native Class_na h(int arg0, int arg1, Class_na arg2);

	@ObfuscatedName("i.az(II[I[I[I[I[I[I[I[IIIIZ)V")
	public native void az(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

	@ObfuscatedName("i.n(III)V")
	public native void n(int arg0, int arg1, int arg2);

	@ObfuscatedName("i.LA(III)V")
	public native void LA(int arg0, int arg1, int arg2);

	@ObfuscatedName("i.b(III)V")
	public native void b(int arg0, int arg1, int arg2);

	@ObfuscatedName("i.SA()V")
	public native void SA();

	@ObfuscatedName("i.ya(II[I[I[I[I[I[I[I[IIIIZ)V")
	public native void ya(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

	@ObfuscatedName("i.d()V")
	public native void d();

	@ObfuscatedName("i.c()V")
	public native void c();

	@ObfuscatedName("i.NA(LClass_na;IIIIZ)V")
	public native void NA(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

	@ObfuscatedName("i.x(Z)V")
	public native void x(boolean arg0);

	@ObfuscatedName("i.ai(LClass_na;IIIIZ)V")
	public native void ai(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

	@ObfuscatedName("i.ac(LClass_na;IIIIZ)V")
	public native void ac(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

	@ObfuscatedName("i.al(LClass_na;IIIIZ)V")
	public native void al(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

	@ObfuscatedName("i.ay(LClass_na;IIIIZ)V")
	public native void ay(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

	@ObfuscatedName("i.ag(Lja;Lba;II[[I[[IIII)V")
	public native void ag(ja arg0, ba arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

	@ObfuscatedName("i.ah(II[I[I[I[I[I[I[I[IIIIZ)V")
	public native void ah(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

	@ObfuscatedName("i.av(II[I[I[I[I[I[I[I[IIIIZ)V")
	public native void av(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

	@ObfuscatedName("i.l(III)V")
	public native void l(int arg0, int arg1, int arg2);

	@ObfuscatedName("i.aj(LClass_na;IIIIZ)V")
	public native void aj(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

	@ObfuscatedName("i.as(LClass_na;IIIIZ)V")
	public native void as(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

	@ObfuscatedName("i.am(IIIIII[I)V")
	public native void am(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

	@ObfuscatedName("i.au(IIIIII[I)V")
	public native void au(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

	@ObfuscatedName("i.ae([F)V")
	public native void ae(float[] arg0);

	@ObfuscatedName("i.ao([F)V")
	public native void ao(float[] arg0);

	@ObfuscatedName("i.bg([F)V")
	public native void bg(float[] arg0);
}
