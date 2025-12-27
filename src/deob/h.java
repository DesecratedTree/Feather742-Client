package deob;

@ObfuscatedName("h")
public class h extends Class387 implements Interface28 {

	public ja aJa6934;

	public ba aBa6935;

	public Class93[] aClass93Array6936;

	public Class64[] aClass64Array6937;

	public long nativeid;

	public void method4486(byte arg0, byte[] arg1) {
		this.IA(arg0, arg1);
	}

	public void finalize() {
		if (this.nativeid != 0L) {
			Class71.method827(this, -80632000);
		}
	}

	public void method4461(Class247 arg0, Class80 arg1, int arg2) {
		if (arg1 == null) {
			this.aJa6934.nd().method350(this, arg0, null, arg2);
			return;
		}
		ja.anIntArray6962[5] = 0;
		this.aJa6934.nd().method350(this, arg0, ja.anIntArray6962, arg2);
		arg1.anInt669 = ja.anIntArray6962[0];
		arg1.anInt670 = ja.anIntArray6962[1];
		arg1.anInt668 = ja.anIntArray6962[2];
		arg1.anInt672 = ja.anIntArray6962[3];
		arg1.anInt673 = ja.anIntArray6962[4];
		arg1.aBoolean671 = ja.anIntArray6962[5] != 0;
	}

	public Class387 method4446(byte arg0, int arg1, boolean arg2) {
		return this.aJa6934.nd().method355(this, arg0, arg1, arg2);
	}

	public void method4479() {
	}

	public Class64[] method4485() {
		return this.aClass64Array6937;
	}

	public void method4477(Class247 arg0, int arg1, boolean arg2) {
		Class249 var4 = this.aJa6934.nd().aClass249_6931;
		var4.method2508(arg0);
		this.aa(var4.aFloatArray2631, arg1, arg2);
	}

	public void method4455() {
		if (this.aJa6934.anInt6955 <= 1) {
			return;
		}
		synchronized (this) {
			while (this.aBoolean3990) {
				try {
					this.wait();
				} catch (InterruptedException var4) {
				}
			}
			this.aBoolean3990 = true;
		}
	}

	public void method4448() {
		if (this.aJa6934.anInt6955 > 1) {
			synchronized (this) {
				this.aBoolean3990 = false;
				this.notifyAll();
			}
		}
	}

	public final void method4470(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		this.J(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	public void method4488(Class247 arg0, int arg1, boolean arg2) {
		Class249 var4 = this.aJa6934.nd().aClass249_6931;
		var4.method2508(arg0);
		this.aa(var4.aFloatArray2631, arg1, arg2);
	}

	public void method4475(Class247 arg0, Class80 arg1, int arg2) {
		if (arg1 == null) {
			this.aJa6934.nd().method350(this, arg0, null, arg2);
			return;
		}
		ja.anIntArray6962[5] = 0;
		this.aJa6934.nd().method350(this, arg0, ja.anIntArray6962, arg2);
		arg1.anInt669 = ja.anIntArray6962[0];
		arg1.anInt670 = ja.anIntArray6962[1];
		arg1.anInt668 = ja.anIntArray6962[2];
		arg1.anInt672 = ja.anIntArray6962[3];
		arg1.anInt673 = ja.anIntArray6962[4];
		arg1.aBoolean671 = ja.anIntArray6962[5] != 0;
	}

	public Class64[] method4445() {
		return this.aClass64Array6937;
	}

	public void method4460(byte arg0, byte[] arg1) {
		this.IA(arg0, arg1);
	}

	public boolean method4462() {
		return true;
	}

	public Class93[] method4464() {
		return this.aClass93Array6936;
	}

	public void method4490(Class387 arg0, int arg1, int arg2, int arg3, boolean arg4) {
		this.aJa6934.nd().method376(this, arg0, arg1, arg2, arg3, arg4);
	}

	public void method4491() {
	}

	public void method4466(Class387 arg0, int arg1, int arg2, int arg3, boolean arg4) {
		this.aJa6934.nd().method376(this, arg0, arg1, arg2, arg3, arg4);
	}

	public void method4478(Class247 arg0, int arg1, boolean arg2) {
		Class249 var4 = this.aJa6934.nd().aClass249_6931;
		var4.method2508(arg0);
		this.aa(var4.aFloatArray2631, arg1, arg2);
	}

	public h(ja arg0) {
		this.aJa6934 = arg0;
		this.aBa6935 = null;
		this.ba(arg0);
	}

	public void method4557(int[] arg0, Class247 arg1) {
		this.aJa6934.nd().method352(this, arg0, arg1);
	}

	public Class64[] method4484() {
		return this.aClass64Array6937;
	}

	public void method4467(Class387 arg0, int arg1, int arg2, int arg3, boolean arg4) {
		this.aJa6934.nd().method376(this, arg0, arg1, arg2, arg3, arg4);
	}

	public boolean method4458(int arg0, int arg1, Class247 arg2, boolean arg3, int arg4) {
		return this.aJa6934.nd().method351(this, arg0, arg1, arg2, arg3);
	}

	public void method4472() {
		if (this.aJa6934.anInt6955 > 1) {
			synchronized (this) {
				this.aBoolean3990 = false;
				this.notifyAll();
			}
		}
	}

	public final void method4473(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		this.J(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	public final void method4474(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		this.J(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	public final void method4451(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		this.J(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	public void method4558() {
		if (this.nativeid != 0L) {
			Class71.method827(this, -85607329);
		}
	}

	public void method4440(Class247 arg0, Class80 arg1, int arg2) {
		if (arg1 == null) {
			this.aJa6934.nd().method350(this, arg0, null, arg2);
			return;
		}
		ja.anIntArray6962[5] = 0;
		this.aJa6934.nd().method350(this, arg0, ja.anIntArray6962, arg2);
		arg1.anInt669 = ja.anIntArray6962[0];
		arg1.anInt670 = ja.anIntArray6962[1];
		arg1.anInt668 = ja.anIntArray6962[2];
		arg1.anInt672 = ja.anIntArray6962[3];
		arg1.anInt673 = ja.anIntArray6962[4];
		arg1.aBoolean671 = ja.anIntArray6962[5] != 0;
	}

	public void method4481(Class247 arg0, int arg1, boolean arg2) {
		Class249 var4 = this.aJa6934.nd().aClass249_6931;
		var4.method2508(arg0);
		this.aa(var4.aFloatArray2631, arg1, arg2);
	}

	public void method4465(Class247 arg0) {
		this.method4557(ja.anIntArray6946, arg0);
		int var2 = 0;
		int var3;
		if (this.aClass93Array6936 != null) {
			for (var3 = 0; var3 < this.aClass93Array6936.length; var3++) {
				Class93 var4 = this.aClass93Array6936[var3];
				var4.anInt838 = ja.anIntArray6946[var2++] * 432673201 * -1343121583;
				var4.anInt832 = ja.anIntArray6946[var2++] * -1138862783 * 76626625;
				var4.anInt840 = ja.anIntArray6946[var2++] * -555868357 * 214524403;
				var4.anInt837 = ja.anIntArray6946[var2++] * -707023853 * -37814757;
				var4.anInt842 = ja.anIntArray6946[var2++] * -648890367 * -1964161023;
				var4.anInt845 = ja.anIntArray6946[var2++] * -1672139309 * 1731506779;
				var4.anInt839 = ja.anIntArray6946[var2++] * 488615051 * 599939875;
				var4.anInt844 = ja.anIntArray6946[var2++] * 197668655 * 1664972751;
				var4.anInt846 = ja.anIntArray6946[var2++] * 471540135 * 1194030615;
			}
		}
		if (this.aClass64Array6937 == null) {
			return;
		}
		for (var3 = 0; var3 < this.aClass64Array6937.length; var3++) {
			Class64 var6 = this.aClass64Array6937[var3];
			Class64 var5 = var6;
			if (var6.aClass64_562 != null) {
				var5 = var6.aClass64_562;
			}
			if (var6.aClass249_568 == null) {
				var6.aClass249_568 = new Class249();
			}
			var6.aClass249_568.method2508(arg0);
			var5.anInt565 = ja.anIntArray6946[var2++] * -686746519 * -1407861799;
			var5.anInt563 = ja.anIntArray6946[var2++] * -635472619 * -1713950147;
			var5.anInt567 = ja.anIntArray6946[var2++] * 1225142127 * -1854140529;
		}
	}

	public boolean method4469(int arg0, int arg1, Class247 arg2, boolean arg3, int arg4) {
		return this.aJa6934.nd().method351(this, arg0, arg1, arg2, arg3);
	}

	public h(ja arg0, ba arg1, Model arg2, int arg3, int arg4, int arg5, int arg6) {
		this.aJa6934 = arg0;
		this.aBa6935 = arg1;
		this.aClass93Array6936 = arg2.aClass93Array878;
		this.aClass64Array6937 = arg2.aClass64Array893;
		int var8 = arg2.aClass93Array878 == null ? 0 : arg2.aClass93Array878.length;
		int var9 = arg2.aClass64Array893 == null ? 0 : arg2.aClass64Array893.length;
		int var10 = 0;
		int[] var11 = new int[var8 * 3 + var9];
		int var12;
		for (var12 = 0; var12 < var8; var12++) {
			var11[var10++] = this.aClass93Array6936[var12].anInt841;
			var11[var10++] = this.aClass93Array6936[var12].anInt835;
			var11[var10++] = this.aClass93Array6936[var12].anInt836;
		}
		for (var12 = 0; var12 < var9; var12++) {
			var11[var10++] = this.aClass64Array6937[var12].anInt566;
		}
		var12 = arg2.aClass94Array908 == null ? 0 : arg2.aClass94Array908.length;
		int[] var13 = new int[var12 * 8];
		int var14 = 0;
		int var15;
		Class94 var16;
		for (var15 = 0; var15 < var12; var15++) {
			var16 = arg2.aClass94Array908[var15];
			Class207 var17 = Class511.method6180(var16.anInt850, (byte) 76);
			var13[var14++] = var16.anInt848;
			var13[var14++] = var17.anInt1945;
			var13[var14++] = var17.anInt1946;
			var13[var14++] = var17.anInt1950;
			var13[var14++] = var17.anInt1941;
			var13[var14++] = var17.anInt1947;
			var13[var14++] = var17.aBoolean1948 ? -1 : 0;
		}
		for (var15 = 0; var15 < var12; var15++) {
			var16 = arg2.aClass94Array908[var15];
			var13[var14++] = var16.anInt847;
		}
		this.U(this.aJa6934, this.aBa6935, arg2.anInt897, arg2.anInt874, arg2.anIntArray875, arg2.anIntArray889, arg2.anIntArray877, arg2.anIntArray880, arg2.aShortArray879, arg2.anInt904, arg2.aShortArray888, arg2.aShortArray907, arg2.aShortArray883, arg2.aByteArray884, arg2.aByteArray885, arg2.aByteArray876, arg2.aByteArray887, arg2.aShortArray873, arg2.aShortArray896, arg2.anIntArray890, arg2.aByte891, arg2.aShortArray892, arg2.anInt882, arg2.aByteArray894, arg2.aShortArray895, arg2.aShortArray903, arg2.aShortArray886, arg2.anIntArray898, arg2.anIntArray899, arg2.anIntArray900, arg2.aByteArray906, arg2.aByteArray905, arg2.anIntArray901, arg2.anIntArray902, arg2.anIntArray872, var11, var8, var9, arg3, arg4, arg5, arg6, var13);
	}

	public void method4482(byte arg0, byte[] arg1) {
		this.IA(arg0, arg1);
	}

	public void method4463(Class247 arg0) {
		this.method4557(ja.anIntArray6946, arg0);
		int var2 = 0;
		int var3;
		if (this.aClass93Array6936 != null) {
			for (var3 = 0; var3 < this.aClass93Array6936.length; var3++) {
				Class93 var4 = this.aClass93Array6936[var3];
				var4.anInt838 = ja.anIntArray6946[var2++];
				var4.anInt832 = ja.anIntArray6946[var2++];
				var4.anInt840 = ja.anIntArray6946[var2++];
				var4.anInt837 = ja.anIntArray6946[var2++];
				var4.anInt842 = ja.anIntArray6946[var2++];
				var4.anInt845 = ja.anIntArray6946[var2++];
				var4.anInt839 = ja.anIntArray6946[var2++];
				var4.anInt844 = ja.anIntArray6946[var2++];
				var4.anInt846 = ja.anIntArray6946[var2++];
			}
		}
		if (this.aClass64Array6937 == null) {
			return;
		}
		for (var3 = 0; var3 < this.aClass64Array6937.length; var3++) {
			Class64 var6 = this.aClass64Array6937[var3];
			Class64 var5 = var6;
			if (var6.aClass64_562 != null) {
				var5 = var6.aClass64_562;
			}
			if (var6.aClass249_568 == null) {
				var6.aClass249_568 = new Class249();
			}
			var6.aClass249_568.method2508(arg0);
			var5.anInt565 = ja.anIntArray6946[var2++];
			var5.anInt563 = ja.anIntArray6946[var2++];
			var5.anInt567 = ja.anIntArray6946[var2++];
		}
	}

	public Class93[] method4476() {
		return this.aClass93Array6936;
	}

	public Class93[] method4483() {
		return this.aClass93Array6936;
	}

	public Class64[] method4452() {
		return this.aClass64Array6937;
	}

	public boolean method4487() {
		return true;
	}

	public boolean method4471() {
		return true;
	}

	public void method4559() {
		if (this.nativeid != 0L) {
			Class71.method827(this, -1162074582);
		}
	}

	public void method4480(Class387 arg0, int arg1, int arg2, int arg3, boolean arg4) {
		this.aJa6934.nd().method376(this, arg0, arg1, arg2, arg3, arg4);
	}

	public void method4560(int[] arg0, Class247 arg1) {
		this.aJa6934.nd().method352(this, arg0, arg1);
	}

	public void method4489() {
		if (this.aJa6934.anInt6955 <= 1) {
			return;
		}
		synchronized (this) {
			while (this.aBoolean3990) {
				try {
					this.wait();
				} catch (InterruptedException var4) {
				}
			}
			this.aBoolean3990 = true;
		}
	}

	public Class387 method4468(byte arg0, int arg1, boolean arg2) {
		return this.aJa6934.nd().method355(this, arg0, arg1, arg2);
	}

	@ObfuscatedName("h.p(I)V")
	public native void p(int arg0);

	@ObfuscatedName("h.U(Lja;Lba;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	public native void U(ja arg0, ba arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

	@ObfuscatedName("h.dg()[B")
	public native byte[] dg();

	@ObfuscatedName("h.x(Z)V")
	public native void x(boolean arg0);

	@ObfuscatedName("h.em()Z")
	public native boolean em();

	@ObfuscatedName("h.BA(Lh;Lh;IZZ)V")
	public native void BA(h arg0, h arg1, int arg2, boolean arg3, boolean arg4);

	@ObfuscatedName("h.KA(I)V")
	public native void KA(int arg0);

	@ObfuscatedName("h.m()I")
	public native int m();

	@ObfuscatedName("h.f(I)V")
	public native void f(int arg0);

	@ObfuscatedName("h.S(I)V")
	public native void S(int arg0);

	@ObfuscatedName("h.ca()I")
	public native int ca();

	@ObfuscatedName("h.EA(I)V")
	public native void EA(int arg0);

	@ObfuscatedName("h.ia(III)V")
	public native void ia(int arg0, int arg1, int arg2);

	@ObfuscatedName("h.pa(IILClass_xa;LClass_xa;III)V")
	public native void pa(int arg0, int arg1, Class_xa arg2, Class_xa arg3, int arg4, int arg5, int arg6);

	@ObfuscatedName("h.ea()Z")
	public native boolean ea();

	@ObfuscatedName("h.J(JI[IIIIIZ)V")
	public native void J(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

	@ObfuscatedName("h.bl(I)V")
	public native void bl(int arg0);

	@ObfuscatedName("h.w(IIII)V")
	public native void w(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("h.ct()I")
	public native int ct();

	@ObfuscatedName("h.aa([FIZ)V")
	public native void aa(float[] arg0, int arg1, boolean arg2);

	@ObfuscatedName("h.cz()I")
	public native int cz();

	@ObfuscatedName("h.bt(I)V")
	public native void bt(int arg0);

	@ObfuscatedName("h.ao(I)V")
	public native void ao(int arg0);

	@ObfuscatedName("h.RA()I")
	public native int RA();

	@ObfuscatedName("h.ya()I")
	public native int ya();

	@ObfuscatedName("h.YA()I")
	public native int YA();

	@ObfuscatedName("h.o()I")
	public native int o();

	@ObfuscatedName("h.ba(Lja;)V")
	public native void ba(ja arg0);

	@ObfuscatedName("h.bo(I)V")
	public native void bo(int arg0);

	@ObfuscatedName("h.ga(LClass_na;)LClass_na;")
	public native Class_na ga(Class_na arg0);

	@ObfuscatedName("h.Q(I)V")
	public native void Q(int arg0);

	@ObfuscatedName("h.c()I")
	public native int c();

	@ObfuscatedName("h.Z()I")
	public native int Z();

	@ObfuscatedName("h.as()[B")
	public native byte[] as();

	@ObfuscatedName("h.gn(B[B)V")
	public native void gn(byte arg0, byte[] arg1);

	@ObfuscatedName("h.N()I")
	public native int N();

	@ObfuscatedName("h.AA()I")
	public native int AA();

	@ObfuscatedName("h.PA(IIII)V")
	public native void PA(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("h.i()Z")
	public native boolean i();

	@ObfuscatedName("h.u()Z")
	public native boolean u();

	@ObfuscatedName("h.t(I)V")
	public native void t(int arg0);

	@ObfuscatedName("h.el()Z")
	public native boolean el();

	@ObfuscatedName("h.du(IIII)V")
	public native void du(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("h.ah()I")
	public native int ah();

	@ObfuscatedName("h.ar()I")
	public native int ar();

	@ObfuscatedName("h.am()I")
	public native int am();

	@ObfuscatedName("h.au(I)V")
	public native void au(int arg0);

	@ObfuscatedName("h.bg(I)V")
	public native void bg(int arg0);

	@ObfuscatedName("h.bs(I)V")
	public native void bs(int arg0);

	@ObfuscatedName("h.ka()V")
	public native void ka();

	@ObfuscatedName("h.bf(I)V")
	public native void bf(int arg0);

	public native void paintTexture(short arg0, short arg1);

	@ObfuscatedName("h.br(I)V")
	public native void br(int arg0);

	@ObfuscatedName("h.bi(III)V")
	public native void bi(int arg0, int arg1, int arg2);

	public native void color(short arg0, short arg1);

	@ObfuscatedName("h.be(III)V")
	public native void be(int arg0, int arg1, int arg2);

	@ObfuscatedName("h.ma(Z)V")
	public native void ma(boolean arg0);

	@ObfuscatedName("h.bx()V")
	public native void bx();

	@ObfuscatedName("h.bu(IIII)V")
	public native void bu(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("h.fd(JI[IIIIIZ)V")
	public native void fd(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

	@ObfuscatedName("h.cx()I")
	public native int cx();

	@ObfuscatedName("h.wa()V")
	public native void wa();

	@ObfuscatedName("h.by(IILClass_xa;LClass_xa;III)V")
	public native void by(int arg0, int arg1, Class_xa arg2, Class_xa arg3, int arg4, int arg5, int arg6);

	@ObfuscatedName("h.bz(III)V")
	public native void bz(int arg0, int arg1, int arg2);

	@ObfuscatedName("h.cj()I")
	public native int cj();

	@ObfuscatedName("h.cy()I")
	public native int cy();

	@ObfuscatedName("h.cb()I")
	public native int cb();

	@ObfuscatedName("h.co()I")
	public native int co();

	@ObfuscatedName("h.cd()I")
	public native int cd();

	@ObfuscatedName("h.cn()I")
	public native int cn();

	@ObfuscatedName("h.cm()I")
	public native int cm();

	@ObfuscatedName("h.cw()I")
	public native int cw();

	@ObfuscatedName("h.cq()I")
	public native int cq();

	@ObfuscatedName("h.ci()I")
	public native int ci();

	@ObfuscatedName("h.cs()I")
	public native int cs();

	@ObfuscatedName("h.cr()I")
	public native int cr();

	@ObfuscatedName("h.cv(I)V")
	public native void cv(int arg0);

	@ObfuscatedName("h.ck(I)V")
	public native void ck(int arg0);

	@ObfuscatedName("h.cl(I)V")
	public native void cl(int arg0);

	@ObfuscatedName("h.cp(I)V")
	public native void cp(int arg0);

	@ObfuscatedName("h.cf(I)V")
	public native void cf(int arg0);

	@ObfuscatedName("h.cu(I)V")
	public native void cu(int arg0);

	@ObfuscatedName("h.bk(I)V")
	public native void bk(int arg0);

	@ObfuscatedName("h.cg()I")
	public native int cg();

	@ObfuscatedName("h.cc()I")
	public native int cc();

	@ObfuscatedName("h.e(I[IIIIZI[I)V")
	public native void e(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

	@ObfuscatedName("h.ds()I")
	public native int ds();

	@ObfuscatedName("h.bc(I)V")
	public native void bc(int arg0);

	@ObfuscatedName("h.dz()[B")
	public native byte[] dz();

	@ObfuscatedName("h.dr()[B")
	public native byte[] dr();

	public native void method_do(short arg0, short arg1);

	@ObfuscatedName("h.ha()I")
	public native int ha();

	@ObfuscatedName("h.dh(SS)V")
	public native void dh(short arg0, short arg1);

	@ObfuscatedName("h.dt(SS)V")
	public native void dt(short arg0, short arg1);

	@ObfuscatedName("h.dq(SS)V")
	public native void dq(short arg0, short arg1);

	@ObfuscatedName("h.dj(SS)V")
	public native void dj(short arg0, short arg1);

	@ObfuscatedName("h.ce(LClass_na;)LClass_na;")
	public native Class_na ce(Class_na arg0);

	@ObfuscatedName("h.dm(IIII)V")
	public native void dm(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("h.av()I")
	public native int av();

	@ObfuscatedName("h.df(IIII)V")
	public native void df(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("h.fp(B[B)V")
	public native void fp(byte arg0, byte[] arg1);

	@ObfuscatedName("h.IA(B[B)V")
	public native void IA(byte arg0, byte[] arg1);

	@ObfuscatedName("h.dw()Z")
	public native boolean dw();

	@ObfuscatedName("h.dp()Z")
	public native boolean dp();

	@ObfuscatedName("h.n()I")
	public native int n();

	@ObfuscatedName("h.ej()V")
	public native void ej();

	@ObfuscatedName("h.ew()Z")
	public native boolean ew();

	@ObfuscatedName("h.db()I")
	public native int db();

	@ObfuscatedName("h.ei()Z")
	public native boolean ei();

	@ObfuscatedName("h.er(I[IIIIZI[I)V")
	public native void er(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

	@ObfuscatedName("h.en(I[IIIIZI[I)V")
	public native void en(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

	@ObfuscatedName("h.ee(I[IIIIZI[I)V")
	public native void ee(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

	@ObfuscatedName("h.da(SS)V")
	public native void da(short arg0, short arg1);

	@ObfuscatedName("h.fl(Lja;)V")
	public native void fl(ja arg0);

	@ObfuscatedName("h.ff(Lh;Lh;IZZ)V")
	public native void ff(h arg0, h arg1, int arg2, boolean arg3, boolean arg4);

	@ObfuscatedName("h.fi(JI[IIIIIZ)V")
	public native void fi(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

	@ObfuscatedName("h.fn(JI[IIIIIZ)V")
	public native void fn(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

	@ObfuscatedName("h.fq(JI[IIIIIZ)V")
	public native void fq(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

	@ObfuscatedName("h.ed(I)V")
	public native void ed(int arg0);

	@ObfuscatedName("h.fx([FIZ)V")
	public native void fx(float[] arg0, int arg1, boolean arg2);

	@ObfuscatedName("h.fw(B[B)V")
	public native void fw(byte arg0, byte[] arg1);

	@ObfuscatedName("h.oa(III)V")
	public native void oa(int arg0, int arg1, int arg2);

	@ObfuscatedName("h.fb(B[B)V")
	public native void fb(byte arg0, byte[] arg1);

	@ObfuscatedName("h.gb(B[B)V")
	public native void gb(byte arg0, byte[] arg1);

	@ObfuscatedName("h.dl(SS)V")
	public native void dl(short arg0, short arg1);
}
