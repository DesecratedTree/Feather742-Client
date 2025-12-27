package deob;

@ObfuscatedName("a")
public class a implements Interface28 {

	public h[] aHArray6933 = new h[7];

	public h[] aHArray6932 = new h[7];

	public ja aJa6929;

	public Class249 aClass249_6931;

	public long nativeid;

	public Runnable aRunnable6930;

	public a(ja arg0, int arg1, int arg2) {
		this.aJa6929 = arg0;
		for (int var4 = 0; var4 < 7; var4++) {
			this.aHArray6933[var4] = new h(this.aJa6929);
			this.aHArray6932[var4] = new h(this.aJa6929);
		}
		this.aClass249_6931 = new Class249();
		this.ha(this.nativeid, arg0, arg1, arg2);
	}

	public void method345() {
		this.aRunnable6930 = Thread.currentThread();
		this.method346();
	}

	public void finalize() {
		if (this.nativeid != 0L) {
			Class71.method827(this, 1121399368);
		}
	}

	@ObfuscatedName("a.ma(Z)V")
	public void ma(boolean arg0) {
		this.R(this.nativeid, arg0);
	}

	public void method346() {
		this.JA(this.nativeid);
	}

	public void method347(Class_ra arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		this.K(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public void method348(Class_ra arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		this.K(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public void method349(Class_ra arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
		this.b(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public void method350(Class387 arg0, Class247 arg1, int[] arg2, int arg3) {
		this.aClass249_6931.method2508(arg1);
		this.wa(this.nativeid, ((h) arg0).nativeid, this.aClass249_6931.aFloatArray2631, arg2, arg3);
	}

	public boolean method351(Class387 arg0, int arg1, int arg2, Class247 arg3, boolean arg4) {
		this.aClass249_6931.method2508(arg3);
		return this.ya(this.nativeid, ((h) arg0).nativeid, arg1, arg2, this.aClass249_6931.aFloatArray2631, arg4);
	}

	public void method352(Class387 arg0, int[] arg1, Class247 arg2) {
		this.aClass249_6931.method2508(arg2);
		this.J(this.nativeid, ((h) arg0).nativeid, arg1, this.aClass249_6931.aFloatArray2631);
	}

	public void method353() {
		if (this.nativeid != 0L) {
			Class71.method827(this, -25912037);
		}
	}

	public void method354(Class_xa arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8) {
		this.i(this.nativeid, ((i) arg0).nativeid, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	public Class387 method355(h arg0, byte arg1, int arg2, boolean arg3) {
		boolean var5 = false;
		h var6;
		h var7;
		if (arg1 > 0 && arg1 <= 7) {
			var7 = this.aHArray6932[arg1 - 1];
			var6 = this.aHArray6933[arg1 - 1];
			var5 = true;
		} else {
			var6 = var7 = new h(this.aJa6929);
		}
		arg0.BA(var6, var7, arg2, var5, arg3);
		var6.aClass93Array6936 = arg0.aClass93Array6936;
		var6.aClass64Array6937 = arg0.aClass64Array6937;
		return var6;
	}

	public void method356() {
		if (this.nativeid != 0L) {
			Class71.method827(this, -110768144);
		}
	}

	@ObfuscatedName("a.x(Z)V")
	public void x(boolean arg0) {
		this.R(this.nativeid, arg0);
	}

	public void method357() {
		this.aRunnable6930 = Thread.currentThread();
		this.method346();
	}

	public void method358() {
		this.aRunnable6930 = Thread.currentThread();
		this.method346();
	}

	public void method359(Class_ra arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
		this.b(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public Class387 method360(h arg0, byte arg1, int arg2, boolean arg3) {
		boolean var5 = false;
		h var6;
		h var7;
		if (arg1 > 0 && arg1 <= 7) {
			var7 = this.aHArray6932[arg1 - 1];
			var6 = this.aHArray6933[arg1 - 1];
			var5 = true;
		} else {
			var6 = var7 = new h(this.aJa6929);
		}
		arg0.BA(var6, var7, arg2, var5, arg3);
		var6.aClass93Array6936 = arg0.aClass93Array6936;
		var6.aClass64Array6937 = arg0.aClass64Array6937;
		return var6;
	}

	public void method361(Class_ra arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		this.K(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public void method362(Class_ra arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
		this.b(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public void method363(Class_xa arg0, int arg1, int arg2) {
		this.v(this.nativeid, ((i) arg0).nativeid, arg1, arg2);
	}

	public void method364(Class387 arg0, Class387 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		this.P(this.nativeid, ((h) arg0).nativeid, ((h) arg1).nativeid, arg2, arg3, arg4, arg5);
	}

	public void method365(Class387 arg0, Class387 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		this.P(this.nativeid, ((h) arg0).nativeid, ((h) arg1).nativeid, arg2, arg3, arg4, arg5);
	}

	public void method366(Class387 arg0, Class387 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		this.P(this.nativeid, ((h) arg0).nativeid, ((h) arg1).nativeid, arg2, arg3, arg4, arg5);
	}

	public void method367(Class387 arg0, Class387 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		this.P(this.nativeid, ((h) arg0).nativeid, ((h) arg1).nativeid, arg2, arg3, arg4, arg5);
	}

	public void method368(Class387 arg0, Class247 arg1, int[] arg2, int arg3) {
		this.aClass249_6931.method2508(arg1);
		this.wa(this.nativeid, ((h) arg0).nativeid, this.aClass249_6931.aFloatArray2631, arg2, arg3);
	}

	public void method369(Class_ra arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
		this.b(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public boolean method370(Class387 arg0, int arg1, int arg2, Class247 arg3, boolean arg4) {
		this.aClass249_6931.method2508(arg3);
		return this.ya(this.nativeid, ((h) arg0).nativeid, arg1, arg2, this.aClass249_6931.aFloatArray2631, arg4);
	}

	public void method371(Class387 arg0, int[] arg1, Class247 arg2) {
		this.aClass249_6931.method2508(arg2);
		this.J(this.nativeid, ((h) arg0).nativeid, arg1, this.aClass249_6931.aFloatArray2631);
	}

	public void method372(Class387 arg0, int[] arg1, Class247 arg2) {
		this.aClass249_6931.method2508(arg2);
		this.J(this.nativeid, ((h) arg0).nativeid, arg1, this.aClass249_6931.aFloatArray2631);
	}

	public void method373(Class_xa arg0, int arg1, int arg2) {
		this.v(this.nativeid, ((i) arg0).nativeid, arg1, arg2);
	}

	public void method374(Class_xa arg0, int arg1, int arg2) {
		this.v(this.nativeid, ((i) arg0).nativeid, arg1, arg2);
	}

	public Class387 method375(h arg0, byte arg1, int arg2, boolean arg3) {
		boolean var5 = false;
		h var6;
		h var7;
		if (arg1 > 0 && arg1 <= 7) {
			var7 = this.aHArray6932[arg1 - 1];
			var6 = this.aHArray6933[arg1 - 1];
			var5 = true;
		} else {
			var6 = var7 = new h(this.aJa6929);
		}
		arg0.BA(var6, var7, arg2, var5, arg3);
		var6.aClass93Array6936 = arg0.aClass93Array6936;
		var6.aClass64Array6937 = arg0.aClass64Array6937;
		return var6;
	}

	public void method376(Class387 arg0, Class387 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		this.P(this.nativeid, ((h) arg0).nativeid, ((h) arg1).nativeid, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("a.ae(JJIIIIIII[[Z)V")
	public native void ae(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

	@ObfuscatedName("a.K(JLClass_ra;IIIIIII)V")
	public native void K(long arg0, Class_ra arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

	@ObfuscatedName("a.ha(JLClass_ra;II)V")
	public native void ha(long arg0, Class_ra arg1, int arg2, int arg3);

	@ObfuscatedName("a.R(JZ)V")
	public native void R(long arg0, boolean arg1);

	@ObfuscatedName("a.JA(J)V")
	public native void JA(long arg0);

	@ObfuscatedName("a.ax(JJJIIIZ)V")
	public native void ax(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);

	@ObfuscatedName("a.b(JLClass_ra;[I[I[I[SI)V")
	public native void b(long arg0, Class_ra arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

	@ObfuscatedName("a.aw(JLClass_ra;IIIIIII)V")
	public native void aw(long arg0, Class_ra arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

	@ObfuscatedName("a.at(JLClass_ra;IIIIIII)V")
	public native void at(long arg0, Class_ra arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

	@ObfuscatedName("a.ar(JJII)V")
	public native void ar(long arg0, long arg1, int arg2, int arg3);

	@ObfuscatedName("a.J(JJ[I[F)V")
	public native void J(long arg0, long arg1, int[] arg2, float[] arg3);

	@ObfuscatedName("a.v(JJII)V")
	public native void v(long arg0, long arg1, int arg2, int arg3);

	@ObfuscatedName("a.ya(JJII[FZ)Z")
	public native boolean ya(long arg0, long arg1, int arg2, int arg3, float[] arg4, boolean arg5);

	@ObfuscatedName("a.P(JJJIIIZ)V")
	public native void P(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);

	@ObfuscatedName("a.e(JZ)V")
	public native void e(long arg0, boolean arg1);

	@ObfuscatedName("a.ao(JJIIIIIII[[Z)V")
	public native void ao(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

	@ObfuscatedName("a.y(JLClass_ra;[I[I[I[SI)V")
	public native void y(long arg0, Class_ra arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

	@ObfuscatedName("a.i(JJIIIIIII[[Z)V")
	public native void i(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

	@ObfuscatedName("a.ak(JJ[I[F)V")
	public native void ak(long arg0, long arg1, int[] arg2, float[] arg3);

	@ObfuscatedName("a.c(JLClass_ra;II)V")
	public native void c(long arg0, Class_ra arg1, int arg2, int arg3);

	@ObfuscatedName("a.wa(JJ[F[II)V")
	public native void wa(long arg0, long arg1, float[] arg2, int[] arg3, int arg4);

	@ObfuscatedName("a.an(JJ[F[II)V")
	public native void an(long arg0, long arg1, float[] arg2, int[] arg3, int arg4);

	@ObfuscatedName("a.ab(JJ[I[F)V")
	public native void ab(long arg0, long arg1, int[] arg2, float[] arg3);

	@ObfuscatedName("a.a(JZ)V")
	public native void a(long arg0, boolean arg1);

	@ObfuscatedName("a.ah(JJII)V")
	public native void ah(long arg0, long arg1, int arg2, int arg3);

	@ObfuscatedName("a.av(JJII)V")
	public native void av(long arg0, long arg1, int arg2, int arg3);

	@ObfuscatedName("a.am(JJII)V")
	public native void am(long arg0, long arg1, int arg2, int arg3);

	@ObfuscatedName("a.au(JJII)V")
	public native void au(long arg0, long arg1, int arg2, int arg3);

	@ObfuscatedName("a.ay(JLClass_ra;[I[I[I[SI)V")
	public native void ay(long arg0, Class_ra arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

	@ObfuscatedName("a.bg(JJIIIIIII[[Z)V")
	public native void bg(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);
}
