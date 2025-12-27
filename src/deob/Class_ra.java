package deob;

import java.awt.Canvas;
import java.util.Enumeration;
import java.util.Hashtable;

public abstract class Class_ra {

	public static int anInt4219 = 8;

	public static int anInt4220 = 1;

	public static int anInt4221 = 1;

	public static int anInt4222 = 1;

	public static int anInt4223 = 1;

	public static int anInt4224 = 8;

	public static int anInt4225 = 0;

	public static int anInt4229 = 4;

	public static int anInt4230 = 2;

	public static int anInt4232 = 2;

	public static int anInt4233 = 4;

	public static int anInt4235 = 16;

	public static int anInt4236 = 32;

	public static boolean[] aBooleanArray4237 = new boolean[8];

	public static int anInt4239 = 2;

	public static int anInt4240 = 1;

	public static int anInt4241 = 0;

	public int anInt4238 = -1;

	public Hashtable aHashtable4231 = new Hashtable();

	public Class76_Sub2[] aClass76_Sub2Array4242 = new Class76_Sub2[4];

	public Interface_ma anInterface_ma4227;

	public int anInt4226;

	public Class76 aClass76_4228;

	public Class76_Sub1 aClass76_Sub1_4234;

	public Class_ra(Interface_ma arg0) {
		this.anInterface_ma4227 = arg0;
		int var2 = -1;
		for (int var3 = 0; var3 < 8; var3++) {
			if (!aBooleanArray4237[var3]) {
				aBooleanArray4237[var3] = true;
				var2 = var3;
				break;
			}
		}
		if (var2 == -1) {
			throw new IllegalStateException("");
		}
		this.anInt4226 = var2;
	}

	public final void method4780(Canvas arg0, int arg1, int arg2, short arg3) {
		try {
			if (!this.aHashtable4231.containsKey(arg0)) {
				Class377.method4375(arg0, -1433851980);
				this.method4805(arg0, this.ak(arg0, arg1, arg2), 1850446711);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ra.ax(" + ')');
		}
	}

	public void method4781(int arg0) {
		try {
			aBooleanArray4237[this.anInt4226] = false;
			Enumeration var2 = this.aHashtable4231.keys();
			while (var2.hasMoreElements()) {
				Canvas var3 = (Canvas) var2.nextElement();
				Class76_Sub1 var4 = (Class76_Sub1) this.aHashtable4231.get(var3);
				var4.method179();
			}
			this.u();
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ra.b(" + ')');
		}
	}

	public final Class76 method4782(byte arg0) {
		try {
			return this.aClass76_4228;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ra.as(" + ')');
		}
	}

	public final void method4783(Canvas arg0, int arg1) {
		try {
			if (this.aHashtable4231.containsKey(arg0)) {
				Class76_Sub1 var3 = (Class76_Sub1) this.aHashtable4231.get(arg0);
				var3.method179();
				this.aHashtable4231.remove(arg0);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ra.an(" + ')');
		}
	}

	public final void method4784(Canvas arg0, int arg1) {
		try {
			Class76_Sub1 var3 = (Class76_Sub1) this.aHashtable4231.get(arg0);
			if (var3 == null) {
				throw new RuntimeException();
			} else if (this.anInt4238 <= 0 && this.aClass76_4228 == this.aClass76_Sub1_4234) {
				if (this.aClass76_4228 != null) {
					this.aClass76_4228.method862();
				}
				if (this.anInt4238 < 0) {
					this.aClass76_4228 = var3;
				}
				this.aClass76_Sub1_4234 = var3;
				var3.method174();
			} else {
				throw new RuntimeException();
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ra.af(" + ')');
		}
	}

	public final void method4785(Class76_Sub2 arg0, byte arg1) {
		try {
			if (this.anInt4238 >= 3) {
				throw new RuntimeException();
			}
			if (this.anInt4238 >= 0) {
				this.aClass76_Sub2Array4242[this.anInt4238].method862();
			} else {
				this.aClass76_Sub1_4234.method862();
			}
			this.aClass76_4228 = this.aClass76_Sub2Array4242[++this.anInt4238] = arg0;
			arg0.method174();
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ra.aa(" + ')');
		}
	}

	public final void method4786(int arg0) throws Exception_Sub1 {
		try {
			this.w(0, 0);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ra.z(" + ')');
		}
	}

	public void method4787(boolean arg0) {
	}

	public final void method4788(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
		try {
			this.bl(arg0, arg1, arg2, arg3, arg4, 1);
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "ra.bg(" + ')');
		}
	}

	public final void method4789(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			this.B(arg0, arg1, arg2, arg3, arg4, 1);
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "ra.bs(" + ')');
		}
	}

	public boolean method4790(byte arg0) {
		try {
			return true;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ra.co(" + ')');
		}
	}

	public final void method4791(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
		try {
			this.br(arg0, arg1, arg2, arg3, arg4, 1);
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "ra.bf(" + ')');
		}
	}

	public final void method4792(int arg0, int arg1, int arg2, int arg3, short arg4) {
		try {
			this.XA(arg0, arg1, arg2, arg3, 1);
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ra.bt(" + ')');
		}
	}

	public final void method4793(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			this.CA(arg0, arg1, arg2, arg3, 1);
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ra.bo(" + ')');
		}
	}

	public Class61 method4794(int arg0, int arg1, boolean arg2, int arg3) {
		try {
			return this.bn(arg0, arg1, arg2, false);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ra.bq(" + ')');
		}
	}

	public Class61 method4795(int[] arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
		try {
			return this.bu(arg0, arg1, arg2, arg3, arg4, true);
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "ra.bv(" + ')');
		}
	}

	public void method4796() {
	}

	public void method4797() {
	}

	public void method4798(float arg0, float arg1, float arg2, int arg3) {
		try {
			this.cc(arg0, arg1, arg2, 0.0F, 1.0F, 1.0F);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ra.cx(" + ')');
		}
	}

	public Class330_Sub14 method4799(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
		try {
			return new Class330_Sub14(arg0, arg1, arg2, arg3, arg4, arg5);
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "ra.cv(" + ')');
		}
	}

	public final Class76_Sub1 method4800(int arg0) {
		try {
			return this.aClass76_Sub1_4234;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ra.aj(" + ')');
		}
	}

	public final void method4801(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			this.G(arg0, arg1, arg2, arg3, 1);
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ra.bc(" + ')');
		}
	}

	public final void method4802(Class76_Sub2 arg0, byte arg1) {
		try {
			if (this.anInt4238 < 0 || arg0 != this.aClass76_Sub2Array4242[this.anInt4238]) {
				throw new RuntimeException();
			}
			this.aClass76_Sub2Array4242[--this.anInt4238 + 1] = null;
			arg0.method862();
			if (this.anInt4238 >= 0) {
				this.aClass76_4228 = this.aClass76_Sub2Array4242[this.anInt4238];
				this.aClass76_Sub2Array4242[this.anInt4238].method174();
			} else {
				this.aClass76_4228 = this.aClass76_Sub1_4234;
				this.aClass76_Sub1_4234.method174();
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ra.ab(" + ')');
		}
	}

	public void method4803(int[] arg0) {
		try {
			if (this.aClass76_Sub1_4234 == null) {
				arg0[1] = 0;
				arg0[0] = 0;
			} else {
				arg0[0] = this.aClass76_Sub1_4234.method856();
				arg0[1] = this.aClass76_Sub1_4234.method857();
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ra.ai(" + ')');
		}
	}

	public void method4804() {
	}

	public final void method4805(Canvas arg0, Class76_Sub1 arg1, int arg2) {
		try {
			if (arg1 == null) {
				throw new RuntimeException();
			}
			this.aHashtable4231.put(arg0, arg1);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ra.ad(" + ')');
		}
	}

	public void finalize() {
		try {
			this.method4781(628001038);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "ra.finalize(" + ')');
		}
	}

	public final void method4806(Canvas arg0, int arg1, int arg2, byte arg3) {
		try {
			Class76_Sub1 var5 = (Class76_Sub1) this.aHashtable4231.get(arg0);
			if (var5 == null) {
				throw new RuntimeException();
			}
			var5.method876(arg1, arg2);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ra.aq(" + ')');
		}
	}

	public static final void method4807(Class430 arg0, byte arg1) {
		try {
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub28_7885, arg0.anIntArray4387[--arg0.anInt4376], -440047250);
			client.aClass304_9030.method3032(451712917);
			Class435.method5568(2134993785);
			client.aBoolean9194 = false;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ra.akq(" + ')');
		}
	}

	public static void method4808(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			Class18.method452(arg5, arg6, 100, 1943615713);
			Class333.aClass326_3363 = new Class326(arg0, arg1 << 9, arg2 << 9, arg3 << 8, arg4 * 8);
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "ra.x(" + ')');
		}
	}

	public static void method4809(int arg0, int arg1, int arg2, int arg3, Class473 arg4, NPC arg5, Player arg6, int arg7) {
		try {
			Class330_Sub20 var8 = new Class330_Sub20();
			var8.anInt7652 = arg0;
			var8.anInt7671 = arg1 << 9;
			var8.anInt7654 = arg2 << 9;
			if (arg4 != null) {
				var8.aClass473_7682 = arg4;
				int var9 = arg4.anInt5674;
				int var10 = arg4.anInt5680;
				if (arg3 == 1 || arg3 == 3) {
					var9 = arg4.anInt5680;
					var10 = arg4.anInt5674;
				}
				var8.anInt7656 = arg1 + var9 << 9;
				var8.anInt7668 = arg2 + var10 << 9;
				var8.anInt7655 = arg4.anInt5650;
				var8.aBoolean7672 = arg4.aBoolean5615;
				var8.anInt7658 = arg4.anInt5675 << 9;
				var8.anInt7659 = arg4.anInt5677;
				var8.anInt7676 = arg4.anInt5679;
				var8.anInt7677 = arg4.anInt5628;
				var8.anIntArray7678 = arg4.anIntArray5681;
				var8.aBoolean7662 = arg4.aBoolean5616;
				var8.anInt7680 = arg4.anInt5662;
				var8.anInt7669 = arg4.anInt5689;
				var8.anInt7679 = arg4.anInt5676 << 9;
				if (arg4.anIntArray5678 != null) {
					var8.aBoolean7653 = true;
					var8.method3373((byte) -44);
				}
				if (var8.anIntArray7678 != null) {
					var8.anInt7670 = var8.anInt7676 + (int) (Math.random() * (double) (var8.anInt7677 - var8.anInt7676));
				}
				Class330_Sub20.aClass471_7649.method5878(var8, (short) 8192);
			} else if (arg5 != null) {
				var8.aClass432_Sub1_Sub1_Sub1_Sub2_7661 = arg5;
				Class551 var12 = arg5.aClass551_10251;
				if (var12.anIntArray6326 != null) {
					var8.aBoolean7653 = true;
					var12 = var12.method6371(Class158.aClass561_6474, (byte) 77);
				}
				if (var12 != null) {
					var8.anInt7656 = var12.anInt6295 + arg1 << 9;
					var8.anInt7668 = var12.anInt6295 + arg2 << 9;
					var8.anInt7655 = Class412.method5237(arg5, 114678110);
					var8.aBoolean7672 = var12.aBoolean6346;
					var8.anInt7658 = var12.anInt6343 << 9;
					var8.anInt7659 = var12.anInt6320;
					var8.anInt7680 = var12.anInt6350;
					var8.anInt7669 = var12.anInt6354;
					var8.anInt7679 = var12.anInt6290 << 9;
				}
				Class330_Sub20.aClass471_7650.method5878(var8, (short) 8192);
			} else if (arg6 != null) {
				var8.aClass432_Sub1_Sub1_Sub1_Sub1_7667 = arg6;
				var8.anInt7656 = arg1 + arg6.method5453(-1307347299) << 9;
				var8.anInt7668 = arg2 + arg6.method5453(-1605842940) << 9;
				var8.anInt7655 = Class162.method1918(arg6, (byte) -56);
				var8.aBoolean7672 = arg6.isNPC;
				var8.anInt7658 = arg6.anInt10236 << 9;
				var8.anInt7659 = arg6.anInt10239;
				var8.anInt7680 = 256;
				var8.anInt7669 = 256;
				var8.anInt7679 = 0;
				Class330_Sub20.aClass497_7651.method6097(var8, (long) arg6.anInt10008);
			}
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "ra.p(" + ')');
		}
	}

	@ObfuscatedName("Class_ra.em()Z")
	public abstract boolean em();

	@ObfuscatedName("Class_ra.bu([IIIIIZ)LClass61;")
	public abstract Class61 bu(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

	@ObfuscatedName("Class_ra.w(II)V")
	public abstract void w(int arg0, int arg1) throws Exception_Sub1;

	@ObfuscatedName("Class_ra.l()V")
	public abstract void l();

	@ObfuscatedName("Class_ra.ec()Z")
	public abstract boolean ec();

	@ObfuscatedName("Class_ra.fq(IIIIII)V")
	public abstract void fq(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("Class_ra.gh(IIIIIII)V")
	public abstract void gh(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

	@ObfuscatedName("Class_ra.a()Z")
	public abstract boolean a();

	@ObfuscatedName("Class_ra.ef(Z)V")
	public abstract void ef(boolean arg0);

	@ObfuscatedName("Class_ra.t()Z")
	public abstract boolean t();

	@ObfuscatedName("Class_ra.B(IIIIII)V")
	public abstract void B(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("Class_ra.v()Z")
	public abstract boolean v();

	@ObfuscatedName("Class_ra.ay()Z")
	public abstract boolean ay();

	@ObfuscatedName("Class_ra.al()Z")
	public abstract boolean al();

	@ObfuscatedName("Class_ra.iu(LClass92;LClass92;FLClass92;)LClass92;")
	public abstract Class92 iu(Class92 arg0, Class92 arg1, float arg2, Class92 arg3);

	@ObfuscatedName("Class_ra.aw()Z")
	public abstract boolean aw();

	@ObfuscatedName("Class_ra.kf()LClass249;")
	public abstract Class249 kf();

	@ObfuscatedName("Class_ra.id()V")
	public abstract void id();

	@ObfuscatedName("Class_ra.gd(IIIII)V")
	public abstract void gd(int arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("Class_ra.js(IIII)V")
	public abstract void js(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("Class_ra.by(IIIIIII)V")
	public abstract void by(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

	@ObfuscatedName("Class_ra.fu(Ljava/awt/Canvas;II)LClass76_Sub1;")
	public abstract Class76_Sub1 fu(Canvas arg0, int arg1, int arg2);

	@ObfuscatedName("Class_ra.ak(Ljava/awt/Canvas;II)LClass76_Sub1;")
	public abstract Class76_Sub1 ak(Canvas arg0, int arg1, int arg2);

	@ObfuscatedName("Class_ra.dn()V")
	public abstract void dn();

	@ObfuscatedName("Class_ra.ah(II)LInterface8_Impl1_Impl1;")
	public abstract Interface8_Impl1_Impl1 ah(int arg0, int arg1);

	@ObfuscatedName("Class_ra.gr(IIIIII)V")
	public abstract void gr(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("Class_ra.am()V")
	public abstract void am();

	@ObfuscatedName("Class_ra.ae(IIII)V")
	public abstract void ae(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("Class_ra.GA(FF)V")
	public abstract void GA(float arg0, float arg1);

	@ObfuscatedName("Class_ra.e()Z")
	public abstract boolean e();

	@ObfuscatedName("Class_ra.r(IIII)V")
	public abstract void r(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("Class_ra.o(IIII)V")
	public abstract void o(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("Class_ra.qa([I)V")
	public abstract void qa(int[] arg0);

	@ObfuscatedName("Class_ra.ea()Z")
	public abstract boolean ea();

	@ObfuscatedName("Class_ra.cq()LClass247;")
	public abstract Class247 cq();

	@ObfuscatedName("Class_ra.cp(LClass92;LClass92;FLClass92;)LClass92;")
	public abstract Class92 cp(Class92 arg0, Class92 arg1, float arg2, Class92 arg3);

	@ObfuscatedName("Class_ra.bl(IIIIII)V")
	public abstract void bl(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("Class_ra.ag()LClass76_Sub2;")
	public abstract Class76_Sub2 ag();

	@ObfuscatedName("Class_ra.N(IIIIII[BII)V")
	public abstract void N(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

	@ObfuscatedName("Class_ra.gi(I)LClass_v;")
	public abstract Class_v gi(int arg0);

	@ObfuscatedName("Class_ra.G(IIIII)V")
	public abstract void G(int arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("Class_ra.br(IIIIII)V")
	public abstract void br(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("Class_ra.ig(III)V")
	public abstract void ig(int arg0, int arg1, int arg2);

	@ObfuscatedName("Class_ra.bz(IIIIIIIII)V")
	public abstract void bz(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

	@ObfuscatedName("Class_ra.be(IIIIIILClass_ta;IIIII)V")
	public abstract void be(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Class_ta arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

	@ObfuscatedName("Class_ra.dd()V")
	public abstract void dd();

	@ObfuscatedName("Class_ra.bx(I)LClass_v;")
	public abstract Class_v bx(int arg0);

	@ObfuscatedName("Class_ra.bm(LClass_v;)V")
	public abstract void bm(Class_v arg0);

	@ObfuscatedName("Class_ra.bn(IIZZ)LClass61;")
	public abstract Class61 bn(int arg0, int arg1, boolean arg2, boolean arg3);

	@ObfuscatedName("Class_ra.g(I)V")
	public abstract void g(int arg0);

	@ObfuscatedName("Class_ra.bj(IIIIZ)LClass61;")
	public abstract Class61 bj(int arg0, int arg1, int arg2, int arg3, boolean arg4);

	@ObfuscatedName("Class_ra.bi(IIIIIILClass_ta;II)V")
	public abstract void bi(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Class_ta arg6, int arg7, int arg8);

	@ObfuscatedName("Class_ra.ch(II[I[I)LClass_ta;")
	public abstract Class_ta ch(int arg0, int arg1, int[] arg2, int[] arg3);

	@ObfuscatedName("Class_ra.DA(ILClass_ta;II)V")
	public abstract void DA(int arg0, Class_ta arg1, int arg2, int arg3);

	@ObfuscatedName("Class_ra.ce(LClass524;[LClass87_Sub2;Z)LClass263;")
	public abstract Class263 ce(Class524 arg0, Class87_Sub2[] arg1, boolean arg2);

	@ObfuscatedName("Class_ra.cz()LClass249;")
	public abstract Class249 cz();

	@ObfuscatedName("Class_ra.cj()LClass247;")
	public abstract Class247 cj();

	@ObfuscatedName("Class_ra.cy(I)V")
	public abstract void cy(int arg0);

	@ObfuscatedName("Class_ra.cb(LModel;IIII)LClass387;")
	public abstract Class387 cb(Model arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("Class_ra.ct(II)I")
	public abstract int ct(int arg0, int arg1);

	@ObfuscatedName("Class_ra.az(IILClass72;LClass86;I)LInterface8_Impl1_Impl2;")
	public abstract Interface8_Impl1_Impl2 az(int arg0, int arg1, Class72 arg2, Class86 arg3, int arg4);

	@ObfuscatedName("Class_ra.cn(II[[I[[IIII)LClass_xa;")
	public abstract Class_xa cn(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

	@ObfuscatedName("Class_ra.kc()LClass249;")
	public abstract Class249 kc();

	@ObfuscatedName("Class_ra.hn(I)V")
	public abstract void hn(int arg0);

	@ObfuscatedName("Class_ra.y()Z")
	public abstract boolean y();

	@ObfuscatedName("Class_ra.hx(II[[I[[IIII)LClass_xa;")
	public abstract Class_xa hx(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

	@ObfuscatedName("Class_ra.RA(Z)V")
	public abstract void RA(boolean arg0);

	@ObfuscatedName("Class_ra.cs()LClass249;")
	public abstract Class249 cs();

	@ObfuscatedName("Class_ra.fr()V")
	public abstract void fr();

	@ObfuscatedName("Class_ra.m(IFFFFF)V")
	public abstract void m(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

	@ObfuscatedName("Class_ra.ds()V")
	public abstract void ds();

	@ObfuscatedName("Class_ra.c(III)V")
	public abstract void c(int arg0, int arg1, int arg2);

	@ObfuscatedName("Class_ra.cr()I")
	public abstract int cr();

	@ObfuscatedName("Class_ra.ck(I[LClass330_Sub14;)V")
	public abstract void ck(int arg0, Class330_Sub14[] arg1);

	@ObfuscatedName("Class_ra.ko()V")
	public abstract void ko();

	@ObfuscatedName("Class_ra.gu(IIIIIII)V")
	public abstract void gu(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

	@ObfuscatedName("Class_ra.cf(LClass92;)V")
	public abstract void cf(Class92 arg0);

	@ObfuscatedName("Class_ra.cu()Z")
	public abstract boolean cu();

	@ObfuscatedName("Class_ra.ca()V")
	public abstract void ca();

	@ObfuscatedName("Class_ra.cg()Z")
	public abstract boolean cg();

	@ObfuscatedName("Class_ra.hi(LClass87;Z)LClass61;")
	public abstract Class61 hi(Class87 arg0, boolean arg1);

	@ObfuscatedName("Class_ra.db(IIII)V")
	public abstract void db(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("Class_ra.dg(ILClass77;)V")
	public abstract void dg(int arg0, Class77 arg1);

	@ObfuscatedName("Class_ra.dz(ILClass77;)V")
	public abstract void dz(int arg0, Class77 arg1);

	@ObfuscatedName("Class_ra.O()V")
	public abstract void O();

	@ObfuscatedName("Class_ra.dr(FFF[F)V")
	public abstract void dr(float arg0, float arg1, float arg2, float[] arg3);

	public abstract void method_do(float arg0, float arg1, float arg2, float[] arg3);

	@ObfuscatedName("Class_ra.dh(Z)V")
	public abstract void dh(boolean arg0);

	@ObfuscatedName("Class_ra.dt()LClass51;")
	public abstract Class51 dt();

	@ObfuscatedName("Class_ra.dq()LClass51;")
	public abstract Class51 dq();

	@ObfuscatedName("Class_ra.dv(II)V")
	public abstract void dv(int arg0, int arg1) throws Exception_Sub1;

	@ObfuscatedName("Class_ra.dc(II)V")
	public abstract void dc(int arg0, int arg1) throws Exception_Sub1;

	@ObfuscatedName("Class_ra.gp(LClass_v;)V")
	public abstract void gp(Class_v arg0);

	@ObfuscatedName("Class_ra.dm(II)V")
	public abstract void dm(int arg0, int arg1) throws Exception_Sub1;

	@ObfuscatedName("Class_ra.df()V")
	public abstract void df();

	@ObfuscatedName("Class_ra.dy()V")
	public abstract void dy();

	@ObfuscatedName("Class_ra.fc(IIII)V")
	public abstract void fc(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("Class_ra.IA(F)V")
	public abstract void IA(float arg0);

	@ObfuscatedName("Class_ra.de()V")
	public abstract void de();

	@ObfuscatedName("Class_ra.gv(IIIIII)I")
	public abstract int gv(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("Class_ra.di()V")
	public abstract void di();

	@ObfuscatedName("Class_ra.dk(I)V")
	public abstract void dk(int arg0);

	@ObfuscatedName("Class_ra.dw(I)V")
	public abstract void dw(int arg0);

	@ObfuscatedName("Class_ra.dp()I")
	public abstract int dp();

	@ObfuscatedName("Class_ra.ed()Z")
	public abstract boolean ed();

	@ObfuscatedName("Class_ra.en()Z")
	public abstract boolean en();

	@ObfuscatedName("Class_ra.ej()Z")
	public abstract boolean ej();

	@ObfuscatedName("Class_ra.ew()Z")
	public abstract boolean ew();

	@ObfuscatedName("Class_ra.J(I)V")
	public abstract void J(int arg0);

	@ObfuscatedName("Class_ra.eh()Z")
	public abstract boolean eh();

	@ObfuscatedName("Class_ra.ip(IIIIII)LClass92;")
	public abstract Class92 ip(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("Class_ra.ar(IIII)[I")
	public abstract int[] ar(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("Class_ra.ee()Z")
	public abstract boolean ee();

	@ObfuscatedName("Class_ra.ez()Z")
	public abstract boolean ez();

	@ObfuscatedName("Class_ra.ex()Z")
	public abstract boolean ex();

	@ObfuscatedName("Class_ra.kv(III)LInterface8_Impl1_Impl1;")
	public abstract Interface8_Impl1_Impl1 kv(int arg0, int arg1, int arg2);

	@ObfuscatedName("Class_ra.cc(FFFFFF)V")
	public abstract void cc(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

	@ObfuscatedName("Class_ra.ix(IIIIII)LClass92;")
	public abstract Class92 ix(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("Class_ra.er()Z")
	public abstract boolean er();

	@ObfuscatedName("Class_ra.jf(ILClass77;)V")
	public abstract void jf(int arg0, Class77 arg1);

	@ObfuscatedName("Class_ra.eq()Z")
	public abstract boolean eq();

	@ObfuscatedName("Class_ra.jz(FFF[F)V")
	public abstract void jz(float arg0, float arg1, float arg2, float[] arg3);

	@ObfuscatedName("Class_ra.eb()Z")
	public abstract boolean eb();

	@ObfuscatedName("Class_ra.eg()Z")
	public abstract boolean eg();

	@ObfuscatedName("Class_ra.eo(Z)V")
	public abstract void eo(boolean arg0);

	@ObfuscatedName("Class_ra.dx()V")
	public abstract void dx();

	@ObfuscatedName("Class_ra.eu(Z)V")
	public abstract void eu(boolean arg0);

	@ObfuscatedName("Class_ra.es(Ljava/awt/Canvas;II)LClass76_Sub1;")
	public abstract Class76_Sub1 es(Canvas arg0, int arg1, int arg2);

	@ObfuscatedName("Class_ra.ac()Z")
	public abstract boolean ac();

	@ObfuscatedName("Class_ra.ft(Ljava/awt/Canvas;II)LClass76_Sub1;")
	public abstract Class76_Sub1 ft(Canvas arg0, int arg1, int arg2);

	@ObfuscatedName("Class_ra.dl(II)V")
	public abstract void dl(int arg0, int arg1) throws Exception_Sub1;

	@ObfuscatedName("Class_ra.fo(IIII)V")
	public abstract void fo(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("Class_ra.fj(IIII)V")
	public abstract void fj(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("Class_ra.fa(IIII)V")
	public abstract void fa(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("Class_ra.ju(FFFFFF)V")
	public abstract void ju(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

	@ObfuscatedName("Class_ra.fg(IIII)V")
	public abstract void fg(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("Class_ra.fy(IIII)V")
	public abstract void fy(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("Class_ra.fe(IIII)V")
	public abstract void fe(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("Class_ra.fh(IIII)V")
	public abstract void fh(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("Class_ra.fl([I)V")
	public abstract void fl(int[] arg0);

	@ObfuscatedName("Class_ra.ek()Z")
	public abstract boolean ek();

	@ObfuscatedName("Class_ra.bk(IIFIIFIIFIIII)V")
	public abstract void bk(int arg0, int arg1, float arg2, int arg3, int arg4, float arg5, int arg6, int arg7, float arg8, int arg9, int arg10, int arg11, int arg12);

	@ObfuscatedName("Class_ra.fi(II)V")
	public abstract void fi(int arg0, int arg1);

	@ObfuscatedName("Class_ra.fn(II)V")
	public abstract void fn(int arg0, int arg1);

	@ObfuscatedName("Class_ra.cm(LClass81;)V")
	public abstract void cm(Class81 arg0);

	@ObfuscatedName("Class_ra.ks(Z)V")
	public abstract void ks(boolean arg0);

	@ObfuscatedName("Class_ra.fx(IIIIII)V")
	public abstract void fx(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("Class_ra.fw(IIIIII)V")
	public abstract void fw(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("Class_ra.fp(IIIIII[BII)V")
	public abstract void fp(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

	@ObfuscatedName("Class_ra.au()V")
	public abstract void au();

	@ObfuscatedName("Class_ra.gb(IIIIII[BII)V")
	public abstract void gb(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

	@ObfuscatedName("Class_ra.gn(IIIII)V")
	public abstract void gn(int arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("Class_ra.fm(IIII)[I")
	public abstract int[] fm(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("Class_ra.gx(IIIII)V")
	public abstract void gx(int arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("Class_ra.ga(IIIII)V")
	public abstract void ga(int arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("Class_ra.gl(IIIII)V")
	public abstract void gl(int arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("Class_ra.gz(IIIIII)V")
	public abstract void gz(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("Class_ra.ei()Z")
	public abstract boolean ei();

	@ObfuscatedName("Class_ra.gk(IIIIIIIII)V")
	public abstract void gk(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

	@ObfuscatedName("Class_ra.za()I")
	public abstract int za();

	@ObfuscatedName("Class_ra.ge(IIIIIII)V")
	public abstract void ge(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

	@ObfuscatedName("Class_ra.jn(IIII)V")
	public abstract void jn(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("Class_ra.gq(IIIIIII)V")
	public abstract void gq(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

	@ObfuscatedName("Class_ra.bp(IIIIII)I")
	public abstract int bp(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("Class_ra.gf(IIIIII)I")
	public abstract int gf(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("Class_ra.ep()Z")
	public abstract boolean ep();

	@ObfuscatedName("Class_ra.gs(I)LClass_v;")
	public abstract Class_v gs(int arg0);

	@ObfuscatedName("Class_ra.go(LClass_v;)V")
	public abstract void go(Class_v arg0);

	@ObfuscatedName("Class_ra.ji(IIII)V")
	public abstract void ji(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("Class_ra.dj(II)V")
	public abstract void dj(int arg0, int arg1) throws Exception_Sub1;

	@ObfuscatedName("Class_ra.gt(IIZZ)LClass61;")
	public abstract Class61 gt(int arg0, int arg1, boolean arg2, boolean arg3);

	@ObfuscatedName("Class_ra.gm(IIZZ)LClass61;")
	public abstract Class61 gm(int arg0, int arg1, boolean arg2, boolean arg3);

	@ObfuscatedName("Class_ra.ba(II)V")
	public abstract void ba(int arg0, int arg1);

	@ObfuscatedName("Class_ra.ha(IIZZ)LClass61;")
	public abstract Class61 ha(int arg0, int arg1, boolean arg2, boolean arg3);

	@ObfuscatedName("Class_ra.hm([IIIIIZ)LClass61;")
	public abstract Class61 hm(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

	@ObfuscatedName("Class_ra.hv([IIIIIZ)LClass61;")
	public abstract Class61 hv(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

	@ObfuscatedName("Class_ra.bw(LClass87;Z)LClass61;")
	public abstract Class61 bw(Class87 arg0, boolean arg1);

	@ObfuscatedName("Class_ra.ci(LClass249;)V")
	public abstract void ci(Class249 arg0);

	@ObfuscatedName("Class_ra.hk(IIIIZ)LClass61;")
	public abstract Class61 hk(int arg0, int arg1, int arg2, int arg3, boolean arg4);

	@ObfuscatedName("Class_ra.hl(IIIIZ)LClass61;")
	public abstract Class61 hl(int arg0, int arg1, int arg2, int arg3, boolean arg4);

	@ObfuscatedName("Class_ra.hf(IIIIZ)LClass61;")
	public abstract Class61 hf(int arg0, int arg1, int arg2, int arg3, boolean arg4);

	@ObfuscatedName("Class_ra.ht(IIIIZ)LClass61;")
	public abstract Class61 ht(int arg0, int arg1, int arg2, int arg3, boolean arg4);

	@ObfuscatedName("Class_ra.hc(II[I[I)LClass_ta;")
	public abstract Class_ta hc(int arg0, int arg1, int[] arg2, int[] arg3);

	@ObfuscatedName("Class_ra.hy(II[I[I)LClass_ta;")
	public abstract Class_ta hy(int arg0, int arg1, int[] arg2, int[] arg3);

	@ObfuscatedName("Class_ra.kh(III)LInterface8_Impl1_Impl1;")
	public abstract Interface8_Impl1_Impl1 kh(int arg0, int arg1, int arg2);

	@ObfuscatedName("Class_ra.hr(ILClass_ta;II)V")
	public abstract void hr(int arg0, Class_ta arg1, int arg2, int arg3);

	@ObfuscatedName("Class_ra.cw(LClass247;)V")
	public abstract void cw(Class247 arg0);

	@ObfuscatedName("Class_ra.hw(I)V")
	public abstract void hw(int arg0);

	@ObfuscatedName("Class_ra.et()Z")
	public abstract boolean et();

	@ObfuscatedName("Class_ra.hg(LModel;IIII)LClass387;")
	public abstract Class387 hg(Model arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("Class_ra.hb(LModel;IIII)LClass387;")
	public abstract Class387 hb(Model arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("Class_ra.he(II)I")
	public abstract int he(int arg0, int arg1);

	@ObfuscatedName("Class_ra.hd(II)I")
	public abstract int hd(int arg0, int arg1);

	@ObfuscatedName("Class_ra.hj(II)I")
	public abstract int hj(int arg0, int arg1);

	@ObfuscatedName("Class_ra.cd(II)I")
	public abstract int cd(int arg0, int arg1);

	@ObfuscatedName("Class_ra.hp(II[[I[[IIII)LClass_xa;")
	public abstract Class_xa hp(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

	@ObfuscatedName("Class_ra.ii(I[LClass330_Sub14;)V")
	public abstract void ii(int arg0, Class330_Sub14[] arg1);

	@ObfuscatedName("Class_ra.ih()LClass247;")
	public abstract Class247 ih();

	@ObfuscatedName("Class_ra.io()LClass249;")
	public abstract Class249 io();

	@ObfuscatedName("Class_ra.ic()LClass249;")
	public abstract Class249 ic();

	@ObfuscatedName("Class_ra.ij(F)V")
	public abstract void ij(float arg0);

	@ObfuscatedName("Class_ra.ia(F)V")
	public abstract void ia(float arg0);

	@ObfuscatedName("Class_ra.ik(IFFFFF)V")
	public abstract void ik(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

	@ObfuscatedName("Class_ra.iz(IFFFFF)V")
	public abstract void iz(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

	@ObfuscatedName("Class_ra.il(I)V")
	public abstract void il(int arg0);

	@ObfuscatedName("Class_ra.iw(I)V")
	public abstract void iw(int arg0);

	public abstract void method_if(int arg0, int arg1, int arg2);

	@ObfuscatedName("Class_ra.ib(III)V")
	public abstract void ib(int arg0, int arg1, int arg2);

	@ObfuscatedName("Class_ra.jq(ILClass77;)V")
	public abstract void jq(int arg0, Class77 arg1);

	@ObfuscatedName("Class_ra.iq(IIIIII)LClass92;")
	public abstract Class92 iq(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("Class_ra.fv([I)V")
	public abstract void fv(int[] arg0);

	@ObfuscatedName("Class_ra.XA(IIIII)V")
	public abstract void XA(int arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("Class_ra.in(LClass92;LClass92;FLClass92;)LClass92;")
	public abstract Class92 in(Class92 arg0, Class92 arg1, float arg2, Class92 arg3);

	@ObfuscatedName("Class_ra.is(LClass92;)V")
	public abstract void is(Class92 arg0);

	@ObfuscatedName("Class_ra.iv()Z")
	public abstract boolean iv();

	@ObfuscatedName("Class_ra.it()Z")
	public abstract boolean it();

	@ObfuscatedName("Class_ra.iy(FFFFFF)V")
	public abstract void iy(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

	@ObfuscatedName("Class_ra.im()V")
	public abstract void im();

	@ObfuscatedName("Class_ra.ie()Z")
	public abstract boolean ie();

	@ObfuscatedName("Class_ra.ff([I)V")
	public abstract void ff(int[] arg0);

	@ObfuscatedName("Class_ra.jc(FFFFFF)V")
	public abstract void jc(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

	@ObfuscatedName("Class_ra.av(III)LInterface8_Impl1_Impl1;")
	public abstract Interface8_Impl1_Impl1 av(int arg0, int arg1, int arg2);

	@ObfuscatedName("Class_ra.ke()V")
	public abstract void ke();

	@ObfuscatedName("Class_ra.jg(IIII)V")
	public abstract void jg(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("Class_ra.jv()LClass76_Sub2;")
	public abstract Class76_Sub2 jv();

	@ObfuscatedName("Class_ra.jt()V")
	public abstract void jt();

	@ObfuscatedName("Class_ra.ja(ILClass77;)V")
	public abstract void ja(int arg0, Class77 arg1);

	@ObfuscatedName("Class_ra.jm(ILClass77;)V")
	public abstract void jm(int arg0, Class77 arg1);

	@ObfuscatedName("Class_ra.L()V")
	public abstract void L();

	@ObfuscatedName("Class_ra.du()V")
	public abstract void du();

	@ObfuscatedName("Class_ra.jb(ILClass77;)V")
	public abstract void jb(int arg0, Class77 arg1);

	@ObfuscatedName("Class_ra.jj(ILClass77;)V")
	public abstract void jj(int arg0, Class77 arg1);

	@ObfuscatedName("Class_ra.f()LClass51;")
	public abstract Class51 f();

	@ObfuscatedName("Class_ra.jh()V")
	public abstract void jh();

	@ObfuscatedName("Class_ra.jr(IIFIIFIIFIIII)V")
	public abstract void jr(int arg0, int arg1, float arg2, int arg3, int arg4, float arg5, int arg6, int arg7, float arg8, int arg9, int arg10, int arg11, int arg12);

	@ObfuscatedName("Class_ra.jd(FFF[F)V")
	public abstract void jd(float arg0, float arg1, float arg2, float[] arg3);

	@ObfuscatedName("Class_ra.jl(FFF[F)V")
	public abstract void jl(float arg0, float arg1, float arg2, float[] arg3);

	@ObfuscatedName("Class_ra.jw()LClass76_Sub2;")
	public abstract Class76_Sub2 jw();

	@ObfuscatedName("Class_ra.jy()LClass76_Sub2;")
	public abstract Class76_Sub2 jy();

	@ObfuscatedName("Class_ra.jp()LClass76_Sub2;")
	public abstract Class76_Sub2 jp();

	@ObfuscatedName("Class_ra.jk()LClass76_Sub2;")
	public abstract Class76_Sub2 jk();

	@ObfuscatedName("Class_ra.ho(LClass524;[LClass87_Sub2;Z)LClass263;")
	public abstract Class263 ho(Class524 arg0, Class87_Sub2[] arg1, boolean arg2);

	@ObfuscatedName("Class_ra.jx(IILClass72;LClass86;I)LInterface8_Impl1_Impl2;")
	public abstract Interface8_Impl1_Impl2 jx(int arg0, int arg1, Class72 arg2, Class86 arg3, int arg4);

	@ObfuscatedName("Class_ra.kp(II)LInterface8_Impl1_Impl1;")
	public abstract Interface8_Impl1_Impl1 kp(int arg0, int arg1);

	@ObfuscatedName("Class_ra.kb(III)LInterface8_Impl1_Impl1;")
	public abstract Interface8_Impl1_Impl1 kb(int arg0, int arg1, int arg2);

	@ObfuscatedName("Class_ra.ev()Z")
	public abstract boolean ev();

	@ObfuscatedName("Class_ra.kr(Z)V")
	public abstract void kr(boolean arg0);

	@ObfuscatedName("Class_ra.cl(IIIIII)LClass92;")
	public abstract Class92 cl(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("Class_ra.fz(FF)V")
	public abstract void fz(float arg0, float arg1);

	@ObfuscatedName("Class_ra.km()Z")
	public abstract boolean km();

	@ObfuscatedName("Class_ra.ky()Z")
	public abstract boolean ky();

	@ObfuscatedName("Class_ra.ku()Z")
	public abstract boolean ku();

	@ObfuscatedName("Class_ra.kt(IIIIIILClass_ta;IIIII)V")
	public abstract void kt(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Class_ta arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

	@ObfuscatedName("Class_ra.ki(IIIIIILClass_ta;IIIII)V")
	public abstract void ki(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Class_ta arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

	@ObfuscatedName("Class_ra.hq(LClass87;Z)LClass61;")
	public abstract Class61 hq(Class87 arg0, boolean arg1);

	@ObfuscatedName("Class_ra.u()V")
	public abstract void u();

	@ObfuscatedName("Class_ra.kx()LClass247;")
	public abstract Class247 kx();

	@ObfuscatedName("Class_ra.kw()LClass247;")
	public abstract Class247 kw();

	@ObfuscatedName("Class_ra.kn(LClass81;)V")
	public abstract void kn(Class81 arg0);

	@ObfuscatedName("Class_ra.kk()V")
	public abstract void kk();

	@ObfuscatedName("Class_ra.kg()V")
	public abstract void kg();

	@ObfuscatedName("Class_ra.kq()V")
	public abstract void kq();

	@ObfuscatedName("Class_ra.kz()V")
	public abstract void kz();

	@ObfuscatedName("Class_ra.kl(LClass247;)V")
	public abstract void kl(Class247 arg0);

	@ObfuscatedName("Class_ra.kd(LClass247;)V")
	public abstract void kd(Class247 arg0);

	@ObfuscatedName("Class_ra.gw(IIIIIILClass_ta;II)V")
	public abstract void gw(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Class_ta arg6, int arg7, int arg8);

	@ObfuscatedName("Class_ra.hu(ILClass_ta;II)V")
	public abstract void hu(int arg0, Class_ta arg1, int arg2, int arg3);

	@ObfuscatedName("Class_ra.lp(Z)V")
	public abstract void lp(boolean arg0);

	@ObfuscatedName("Class_ra.ln()I")
	public abstract int ln();

	@ObfuscatedName("Class_ra.lo()I")
	public abstract int lo();

	@ObfuscatedName("Class_ra.ka()Z")
	public abstract boolean ka();

	@ObfuscatedName("Class_ra.at()Z")
	public abstract boolean at();

	@ObfuscatedName("Class_ra.gj(IIIII)V")
	public abstract void gj(int arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("Class_ra.kj()Z")
	public abstract boolean kj();

	@ObfuscatedName("Class_ra.fd(IIIIII)V")
	public abstract void fd(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("Class_ra.CA(IIIII)V")
	public abstract void CA(int arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("Class_ra.hz(IIZZ)LClass61;")
	public abstract Class61 hz(int arg0, int arg1, boolean arg2, boolean arg3);

	@ObfuscatedName("Class_ra.gc(LClass_v;)V")
	public abstract void gc(Class_v arg0);

	@ObfuscatedName("Class_ra.fb(IIIIII[BII)V")
	public abstract void fb(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

	@ObfuscatedName("Class_ra.ir(LClass249;)V")
	public abstract void ir(Class249 arg0);

	@ObfuscatedName("Class_ra.el()Z")
	public abstract boolean el();

	@ObfuscatedName("Class_ra.jo(ILClass77;)V")
	public abstract void jo(int arg0, Class77 arg1);

	@ObfuscatedName("Class_ra.ey()Z")
	public abstract boolean ey();

	@ObfuscatedName("Class_ra.je(ILClass77;)V")
	public abstract void je(int arg0, Class77 arg1);

	@ObfuscatedName("Class_ra.hs(LModel;IIII)LClass387;")
	public abstract Class387 hs(Model arg0, int arg1, int arg2, int arg3, int arg4);
}
