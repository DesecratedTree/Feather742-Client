package deob;

import java.awt.Canvas;

@ObfuscatedName("ja")
public class ja extends Class_ra implements Interface28 {

	public static int anInt6957 = 4;

	public static int anInt6958 = 104;

	public static int anInt6959 = 20;

	public static int anInt6961 = 24573;

	public static int[] anIntArray6972 = new int[Math.max(Math.max(104, 20), 24573)];

	public static int anInt6973 = 20;

	public static float[] aFloatArray6963 = new float[20];

	public static int[] anIntArray6962 = new int[6];

	public static int[] anIntArray6940 = anIntArray6972;

	public static float[] aFloatArray6966 = aFloatArray6963;

	public static int[] anIntArray6946 = anIntArray6972;

	public static int[] anIntArray6968 = anIntArray6972;

	public static int[] anIntArray6969 = new int[8191];

	public static int[] anIntArray6970 = new int[8191];

	public static short[] aShortArray6971 = new short[8191];

	public static byte[] aByteArray6951 = new byte[8191];

	public boolean aBoolean6964 = false;

	public long nativeid = 0L;

	public Class471 aClass471_6965 = new Class471();

	public int anInt6954 = 4096;

	public int anInt6942 = 4096;

	public boolean aBoolean6956 = false;

	public Class249 aClass249_6945;

	public Class247 aClass247_6952;

	public Class249 aClass249_6943;

	public Class249 aClass249_6949;

	public Class249 aClass249_6950;

	public float aFloat6944;

	public float aFloat6948;

	public float aFloat6953;

	public float aFloat6960;

	public int anInt6955;

	public Class247 aClass247_6947;

	public ba aBa6941;

	public a[] anAArray6967;

	public ja(Canvas arg0, Interface_ma arg1, int arg2, int arg3) {
		super(arg1);
		try {
			if (!Class489.method6063(-1102372689).method327("sw3d", -1803295169)) {
				throw new RuntimeException("");
			}
			Class71.method823((short) 17894);
			this.q(this.anInterface_ma4227, this.anInterface_ma4227.method219(-333379895), 0);
			Class318.method3166(false, true, -1368286637);
			this.aBoolean6956 = true;
			this.aClass249_6945 = new Class249();
			new Class260();
			this.aClass247_6952 = new Class247();
			new Class244();
			this.aClass249_6943 = new Class249();
			this.aClass249_6949 = new Class249();
			this.aClass249_6950 = new Class249();
			this.cw(new Class247());
			this.ci(new Class249());
			this.nr(1);
			this.nf(0);
			if (arg0 != null) {
				this.method4780(arg0, arg2, arg3, (short) -2793);
				this.method4784(arg0, -949621299);
			}
			int var5 = this.anInterface_ma4227.method219(-333379895);
			for (short var6 = 0; var6 < var5; var6++) {
				Class56 var7 = this.anInterface_ma4227.method221(var6, -82786481);
				if (var7 != null) {
					this.V(var6, var7.aShort523, var7.aClass369_524.method297((short) -4947), var7.aByte525, var7.aByte526, var7.anInt527, var7.anInt532 == 64, var7.aByte529, var7.aByte534, var7.aByte531, var7.aByte530, var7.aBoolean533, var7.aBoolean519, var7.aBoolean517, var7.aBoolean536, var7.aBoolean537, var7.aByte538, var7.aBoolean508, var7.aBoolean514, var7.anInt520);
				}
			}
		} catch (Throwable var8) {
			this.method4781(628001038);
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ja.gs(I)LClass_v;")
	public Class_v gs(int arg0) {
		ba var2 = new ba(this, arg0);
		this.aClass471_6965.method5878(var2, (short) 8192);
		return var2;
	}

	@ObfuscatedName("ja.ac()Z")
	public boolean ac() {
		return false;
	}

	@ObfuscatedName("ja.WA()Ljava/lang/Object;")
	public Object WA() {
		return new aa(this);
	}

	@ObfuscatedName("ja.fq(IIIIII)V")
	public void fq(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		this.XA(arg0, arg1, arg2, arg4, arg5);
		this.XA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.G(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.G(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@ObfuscatedName("ja.ei()Z")
	public boolean ei() {
		return true;
	}

	public void finalize() {
		this.method4781(628001038);
		if (this.nativeid != 0L) {
			Class71.method827(this, -149503806);
		}
	}

	@ObfuscatedName("ja.bj(IIIIZ)LClass61;")
	public Class61 bj(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		return new fa(this, arg0, arg1, arg2, arg3, !arg4);
	}

	@ObfuscatedName("ja.f()LClass51;")
	public Class51 f() {
		return new Class51(0, "SSE", 1, "CPU", 0L);
	}

	@ObfuscatedName("ja.hd(II)I")
	public int hd(int arg0, int arg1) {
		return arg0 | arg1;
	}

	@ObfuscatedName("ja.SA(S)Z")
	public boolean SA(short arg0) {
		Interface_ma var2 = this.anInterface_ma4227;
		synchronized (this.anInterface_ma4227) {
			Class56 var3 = this.anInterface_ma4227.method221(arg0, -228034789);
			if (var3 == null) {
				return false;
			}
			int var4 = var3.anInt532 * -1086060503 * -1963453415;
			if (!this.anInterface_ma4227.method237(arg0, var3.aClass369_524 == Class369.aClass369_6817 ? Class377.aClass377_3935 : Class377.aClass377_3934, 0.7F, var4, var4, true, 2146191042)) {
				return false;
			}
			int[] var5;
			if (var3.aClass369_524 == Class369.aClass369_6817) {
				var5 = this.anInterface_ma4227.method231(arg0, 0.7F, var4, var4, true, 458532706);
			} else {
				var5 = this.anInterface_ma4227.method220(arg0, 0.7F, var4, var4, true, -1802565290);
			}
			int[] var6;
			if (var4 == 64) {
				var6 = new int[16384];
				for (int var7 = 0; var7 < var4; var7++) {
					for (int var8 = 0; var8 < var4; var8++) {
						int var9 = (var7 + var8 * 128) * 2;
						var6[var9] = var6[var9 + 1] = var6[var9 + 128] = var6[var9 + 128 + 1] = var5[var7 + var8 * var4];
					}
				}
			} else {
				var6 = var5;
			}
			this.F(arg0, var6, var3.aShort523, var3.aClass369_524.method297((short) 10327), var3.aByte525, var3.aByte526, var3.anInt527 * 1851609729 * -2120684159, var3.anInt532 * -1086060503 * -1963453415 == 64, var3.aByte529, var3.aByte534, var3.aByte531, var3.aByte530, var3.aBoolean533, var3.aBoolean519, var3.aBoolean517, var3.aBoolean536, var3.aBoolean537, var3.aByte538, var3.aBoolean508, var3.aBoolean514, var3.anInt520 * 1396477331 * -721577829);
			return true;
		}
	}

	@ObfuscatedName("ja.u()V")
	public void u() {
		if (this.aBoolean6964) {
			return;
		}
		this.anAArray6967 = null;
		this.aBa6941 = null;
		this.aClass249_6945 = null;
		for (ba var1 = (ba) this.aClass471_6965.method5869(539664854); var1 != null; var1 = (ba) this.aClass471_6965.method5873((byte) -29)) {
			var1.ha();
		}
		this.aClass471_6965.method5866(613065745);
		this.da();
		if (this.aBoolean6956) {
			Class95_Sub12.method1137(false, true, 796132207);
			this.aBoolean6956 = false;
		}
		this.h();
		Class71.method824(-612430983);
		this.aBoolean6964 = true;
	}

	@ObfuscatedName("ja.ec()Z")
	public boolean ec() {
		return false;
	}

	@ObfuscatedName("ja.kx()LClass247;")
	public Class247 kx() {
		return this.aClass247_6952;
	}

	@ObfuscatedName("ja.e()Z")
	public boolean e() {
		return true;
	}

	@ObfuscatedName("ja.t()Z")
	public boolean t() {
		return true;
	}

	@ObfuscatedName("ja.v()Z")
	public boolean v() {
		return false;
	}

	@ObfuscatedName("ja.ay()Z")
	public boolean ay() {
		return false;
	}

	@ObfuscatedName("ja.y()Z")
	public boolean y() {
		return true;
	}

	@ObfuscatedName("ja.ha(IIZZ)LClass61;")
	public Class61 ha(int arg0, int arg1, boolean arg2, boolean arg3) {
		return new fa(this, arg0, arg1, arg3);
	}

	@ObfuscatedName("ja.at()Z")
	public boolean at() {
		return true;
	}

	@ObfuscatedName("ja.w(II)V")
	public void w(int arg0, int arg1) throws Exception_Sub1 {
		za var3 = (za) this.method4800(-924859015);
		if (var3 == null) {
			throw new IllegalStateException();
		}
		var3.method883(arg0, arg1);
		if (this.anInterface_ma4227 != null) {
			this.anInterface_ma4227.method224((short) -20408);
		}
	}

	@ObfuscatedName("ja.am()V")
	public void am() {
	}

	@ObfuscatedName("ja.ak(Ljava/awt/Canvas;II)LClass76_Sub1;")
	public Class76_Sub1 ak(Canvas arg0, int arg1, int arg2) {
		return new za(this, arg0, arg1, arg2);
	}

	@ObfuscatedName("ja.au()V")
	public void au() {
		this.aFloat6953 = (float) this.method4782((byte) 0).method856() / 2.0F;
		this.aFloat6948 = (float) this.method4782((byte) 0).method857() / 2.0F;
		this.aFloat6960 = this.aFloat6953;
		this.aFloat6944 = this.aFloat6948;
		this.k();
	}

	@ObfuscatedName("ja.kl(LClass247;)V")
	public void kl(Class247 arg0) {
		this.aClass247_6947 = arg0;
		this.aClass249_6943.method2508(arg0);
		this.AA(this.aClass249_6943.aFloatArray2631);
		this.aClass249_6950.method2484(this.aClass249_6943, this.aClass249_6949);
	}

	@ObfuscatedName("ja.bl(IIIIII)V")
	public void bl(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		this.XA(arg0, arg1, arg2, arg4, arg5);
		this.XA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.G(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.G(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	public void method_do(float arg0, float arg1, float arg2, float[] arg3) {
		float var5 = this.aClass249_6950.aFloatArray2631[15] + this.aClass249_6950.aFloatArray2631[3] * arg0 + this.aClass249_6950.aFloatArray2631[7] * arg1 + this.aClass249_6950.aFloatArray2631[11] * arg2;
		float var6 = this.aClass249_6950.aFloatArray2631[12] + this.aClass249_6950.aFloatArray2631[0] * arg0 + this.aClass249_6950.aFloatArray2631[4] * arg1 + this.aClass249_6950.aFloatArray2631[8] * arg2;
		float var7 = this.aClass249_6950.aFloatArray2631[13] + this.aClass249_6950.aFloatArray2631[1] * arg0 + this.aClass249_6950.aFloatArray2631[5] * arg1 + this.aClass249_6950.aFloatArray2631[9] * arg2;
		float var8 = this.aClass249_6943.aFloatArray2631[14] + this.aClass249_6943.aFloatArray2631[2] * arg0 + this.aClass249_6943.aFloatArray2631[6] * arg1 + this.aClass249_6943.aFloatArray2631[10] * arg2;
		arg3[0] = this.aFloat6960 + this.aFloat6953 * var6 / var5;
		arg3[1] = this.aFloat6944 + this.aFloat6948 * var7 / var5;
		arg3[2] = var8;
	}

	@ObfuscatedName("ja.kt(IIIIIILClass_ta;IIIII)V")
	public void kt(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Class_ta arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
	}

	@ObfuscatedName("ja.br(IIIIII)V")
	public void br(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		this.YA(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("ja.bi(IIIIIILClass_ta;II)V")
	public void bi(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Class_ta arg6, int arg7, int arg8) {
		this.R(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@ObfuscatedName("ja.iy(FFFFFF)V")
	public void iy(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
	}

	@ObfuscatedName("ja.eh()Z")
	public boolean eh() {
		return true;
	}

	@ObfuscatedName("ja.bp(IIIIII)I")
	public int bp(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 0;
		float var8 = this.aClass249_6950.aFloatArray2631[14] + this.aClass249_6950.aFloatArray2631[2] * (float) arg0 + this.aClass249_6950.aFloatArray2631[6] * (float) arg1 + this.aClass249_6950.aFloatArray2631[10] * (float) arg2;
		float var9 = this.aClass249_6950.aFloatArray2631[14] + this.aClass249_6950.aFloatArray2631[2] * (float) arg3 + this.aClass249_6950.aFloatArray2631[6] * (float) arg4 + this.aClass249_6950.aFloatArray2631[10] * (float) arg5;
		float var10 = this.aClass249_6950.aFloatArray2631[15] + this.aClass249_6950.aFloatArray2631[3] * (float) arg0 + this.aClass249_6950.aFloatArray2631[7] * (float) arg1 + this.aClass249_6950.aFloatArray2631[11] * (float) arg2;
		float var11 = this.aClass249_6950.aFloatArray2631[15] + this.aClass249_6950.aFloatArray2631[3] * (float) arg3 + this.aClass249_6950.aFloatArray2631[7] * (float) arg4 + this.aClass249_6950.aFloatArray2631[11] * (float) arg5;
		if (var8 < -var10 && var9 < -var11) {
			var7 |= 0x10;
		} else if (var8 > var10 && var9 > var11) {
			var7 |= 0x20;
		}
		float var12 = this.aClass249_6950.aFloatArray2631[12] + this.aClass249_6950.aFloatArray2631[0] * (float) arg0 + this.aClass249_6950.aFloatArray2631[4] * (float) arg1 + this.aClass249_6950.aFloatArray2631[8] * (float) arg2;
		float var13 = this.aClass249_6950.aFloatArray2631[12] + this.aClass249_6950.aFloatArray2631[0] * (float) arg3 + this.aClass249_6950.aFloatArray2631[4] * (float) arg4 + this.aClass249_6950.aFloatArray2631[8] * (float) arg5;
		if (var12 < -var10 && var13 < -var11) {
			var7 |= 0x1;
		}
		if (var12 > var10 && var13 > var11) {
			var7 |= 0x2;
		}
		float var14 = this.aClass249_6950.aFloatArray2631[13] + this.aClass249_6950.aFloatArray2631[1] * (float) arg0 + this.aClass249_6950.aFloatArray2631[5] * (float) arg1 + this.aClass249_6950.aFloatArray2631[9] * (float) arg2;
		float var15 = this.aClass249_6950.aFloatArray2631[13] + this.aClass249_6950.aFloatArray2631[1] * (float) arg3 + this.aClass249_6950.aFloatArray2631[5] * (float) arg4 + this.aClass249_6950.aFloatArray2631[9] * (float) arg5;
		if (var14 < -var10 && var15 < -var11) {
			var7 |= 0x4;
		}
		if (var14 > var10 && var15 > var11) {
			var7 |= 0x8;
		}
		return var7;
	}

	@ObfuscatedName("ja.cr()I")
	public int cr() {
		return 4;
	}

	@ObfuscatedName("ja.dr(FFF[F)V")
	public void dr(float arg0, float arg1, float arg2, float[] arg3) {
		float var5 = this.aClass249_6950.aFloatArray2631[14] + this.aClass249_6950.aFloatArray2631[2] * arg0 + this.aClass249_6950.aFloatArray2631[6] * arg1 + this.aClass249_6950.aFloatArray2631[10] * arg2;
		float var6 = this.aClass249_6950.aFloatArray2631[15] + this.aClass249_6950.aFloatArray2631[3] * arg0 + this.aClass249_6950.aFloatArray2631[7] * arg1 + this.aClass249_6950.aFloatArray2631[11] * arg2;
		if (var5 < -var6 || var5 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		float var7 = this.aClass249_6950.aFloatArray2631[12] + this.aClass249_6950.aFloatArray2631[0] * arg0 + this.aClass249_6950.aFloatArray2631[4] * arg1 + this.aClass249_6950.aFloatArray2631[8] * arg2;
		if (var7 < -var6 || var7 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		float var8 = this.aClass249_6950.aFloatArray2631[13] + this.aClass249_6950.aFloatArray2631[1] * arg0 + this.aClass249_6950.aFloatArray2631[5] * arg1 + this.aClass249_6950.aFloatArray2631[9] * arg2;
		if (var8 < -var6 || var8 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			float var9 = this.aClass249_6943.aFloatArray2631[14] + this.aClass249_6943.aFloatArray2631[2] * arg0 + this.aClass249_6943.aFloatArray2631[6] * arg1 + this.aClass249_6943.aFloatArray2631[10] * arg2;
			arg3[0] = this.aFloat6960 + this.aFloat6953 * var7 / var6;
			arg3[1] = this.aFloat6944 + this.aFloat6948 * var8 / var6;
			arg3[2] = var9;
		}
	}

	@ObfuscatedName("ja.bx(I)LClass_v;")
	public Class_v bx(int arg0) {
		ba var2 = new ba(this, arg0);
		this.aClass471_6965.method5878(var2, (short) 8192);
		return var2;
	}

	@ObfuscatedName("ja.bm(LClass_v;)V")
	public void bm(Class_v arg0) {
		this.aBa6941 = (ba) arg0;
		this.n(arg0);
	}

	@ObfuscatedName("ja.bn(IIZZ)LClass61;")
	public Class61 bn(int arg0, int arg1, boolean arg2, boolean arg3) {
		return new fa(this, arg0, arg1, arg3);
	}

	@ObfuscatedName("ja.bu([IIIIIZ)LClass61;")
	public Class61 bu(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		return new fa(this, arg0, arg1, arg2, arg3, arg4, false);
	}

	@ObfuscatedName("ja.a()Z")
	public boolean a() {
		return true;
	}

	@ObfuscatedName("ja.dg(ILClass77;)V")
	public final void dg(int arg0, Class77 arg1) {
		this.M(arg0, arg1.anInt652, arg1.anInt650, arg1.anInt651);
	}

	@ObfuscatedName("ja.ce(LClass524;[LClass87_Sub2;Z)LClass263;")
	public Class263 ce(Class524 arg0, Class87_Sub2[] arg1, boolean arg2) {
		int[] var4 = new int[arg1.length];
		int[] var5 = new int[arg1.length];
		boolean var6 = false;
		for (int var7 = 0; var7 < arg1.length; var7++) {
			var4[var7] = arg1[var7].anInt7112;
			var5[var7] = arg1[var7].anInt7107;
			if (arg1[var7].aByteArray7115 != null) {
				var6 = true;
			}
		}
		if (arg2) {
			if (var6) {
				return new ea(this, this.aBa6941, arg0, arg1, null);
			} else {
				return new m(this, this.aBa6941, arg0, arg1, null);
			}
		} else if (var6) {
			throw new IllegalArgumentException("");
		} else {
			return new ia(this, this.aBa6941, arg0, arg1, null);
		}
	}

	@ObfuscatedName("ja.cy(I)V")
	public void cy(int arg0) {
		this.anInt6954 = this.anInt6942 = arg0;
		if (this.anInt6955 > 1) {
			throw new IllegalStateException();
		}
		this.nr(this.anInt6955);
		this.nf(0);
	}

	@ObfuscatedName("ja.cb(LModel;IIII)LClass387;")
	public Class387 cb(Model arg0, int arg1, int arg2, int arg3, int arg4) {
		return new h(this, this.aBa6941, arg0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("ja.cd(II)I")
	public int cd(int arg0, int arg1) {
		return arg0 | arg1;
	}

	@ObfuscatedName("ja.px(II)LInterface8_Impl1_Impl2;")
	public Interface8_Impl1_Impl2 px(int arg0, int arg1) {
		return (fa) this.bn(arg0, arg1, false, true);
	}

	@ObfuscatedName("ja.cz()LClass249;")
	public Class249 cz() {
		return this.aClass249_6945;
	}

	@ObfuscatedName("ja.cj()LClass247;")
	public Class247 cj() {
		return this.aClass247_6952;
	}

	@ObfuscatedName("ja.nr(I)V")
	public void nr(int arg0) {
		this.anInt6955 = arg0;
		this.anAArray6967 = new a[this.anInt6955];
		for (int var2 = 0; var2 < this.anInt6955; var2++) {
			this.anAArray6967[var2] = new a(this, this.anInt6954, this.anInt6942);
		}
	}

	@ObfuscatedName("ja.nf(I)V")
	public void nf(int arg0) {
		this.anAArray6967[arg0].method345();
	}

	@ObfuscatedName("ja.nd()La;")
	public a nd() {
		for (int var1 = 0; var1 < this.anInt6955; var1++) {
			if (this.anAArray6967[var1].aRunnable6930 == Thread.currentThread()) {
				return this.anAArray6967[var1];
			}
		}
		return null;
	}

	@ObfuscatedName("ja.cm(LClass81;)V")
	public void cm(Class81 arg0) {
		if (!arg0.aClass461_675.method5698(107915522)) {
			this.nc(arg0, false);
			this.nd().method369(this, anIntArray6968, anIntArray6969, anIntArray6970, aShortArray6971, arg0.aClass461_675.method5697(698144030));
		}
	}

	@ObfuscatedName("ja.jc(FFFFFF)V")
	public void jc(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
	}

	@ObfuscatedName("ja.cq()LClass247;")
	public Class247 cq() {
		return this.aClass247_6947;
	}

	@ObfuscatedName("ja.ci(LClass249;)V")
	public void ci(Class249 arg0) {
		this.aClass249_6949 = arg0;
		this.wa(this.aClass249_6949.aFloatArray2631);
		this.aClass249_6950.method2484(this.aClass249_6943, this.aClass249_6949);
	}

	@ObfuscatedName("ja.kk()V")
	public void kk() {
		this.aFloat6953 = (float) this.method4782((byte) 0).method856() / 2.0F;
		this.aFloat6948 = (float) this.method4782((byte) 0).method857() / 2.0F;
		this.aFloat6960 = this.aFloat6953;
		this.aFloat6944 = this.aFloat6948;
		this.k();
	}

	@ObfuscatedName("ja.ck(I[LClass330_Sub14;)V")
	public void ck(int arg0, Class330_Sub14[] arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < arg0; var4++) {
			anIntArray6940[var3++] = arg1[var4].method3318(598949538);
			anIntArray6940[var3++] = arg1[var4].method3311((byte) -42);
			anIntArray6940[var3++] = arg1[var4].method3312((short) -13455);
			anIntArray6940[var3++] = arg1[var4].method3316((byte) 7);
			aFloatArray6966[var4] = arg1[var4].method3317(1379340223);
			anIntArray6940[var3++] = arg1[var4].method3313(-934085165);
		}
		this.Q(arg0, anIntArray6940, aFloatArray6966);
	}

	@ObfuscatedName("ja.cl(IIIIII)LClass92;")
	public Class92 cl(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return null;
	}

	@ObfuscatedName("ja.cp(LClass92;LClass92;FLClass92;)LClass92;")
	public Class92 cp(Class92 arg0, Class92 arg1, float arg2, Class92 arg3) {
		return null;
	}

	@ObfuscatedName("ja.cf(LClass92;)V")
	public void cf(Class92 arg0) {
	}

	@ObfuscatedName("ja.db(IIII)V")
	public void db(int arg0, int arg1, int arg2, int arg3) {
	}

	@ObfuscatedName("ja.bz(IIIIIIIII)V")
	public void bz(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
	}

	@ObfuscatedName("ja.ca()V")
	public void ca() {
	}

	@ObfuscatedName("ja.dz(ILClass77;)V")
	public final void dz(int arg0, Class77 arg1) {
		this.JA(arg0, arg1.anInt652, arg1.anInt650, arg1.anInt651);
	}

	@ObfuscatedName("ja.lo()I")
	public int lo() {
		return 4;
	}

	@ObfuscatedName("ja.no(II)LInterface8_Impl1_Impl2;")
	public Interface8_Impl1_Impl2 no(int arg0, int arg1) {
		return (fa) this.bn(arg0, arg1, false, true);
	}

	@ObfuscatedName("ja.az(IILClass72;LClass86;I)LInterface8_Impl1_Impl2;")
	public Interface8_Impl1_Impl2 az(int arg0, int arg1, Class72 arg2, Class86 arg3, int arg4) {
		return this.no(arg0, arg1);
	}

	@ObfuscatedName("ja.dh(Z)V")
	public void dh(boolean arg0) {
	}

	@ObfuscatedName("ja.av(III)LInterface8_Impl1_Impl1;")
	public Interface8_Impl1_Impl1 av(int arg0, int arg1, int arg2) {
		return new oa(arg0, arg1);
	}

	@ObfuscatedName("ja.dq()LClass51;")
	public Class51 dq() {
		return new Class51(0, "SSE", 1, "CPU", 0L);
	}

	@ObfuscatedName("ja.dv(II)V")
	public void dv(int arg0, int arg1) throws Exception_Sub1 {
		za var3 = (za) this.method4800(-924859015);
		if (var3 == null) {
			throw new IllegalStateException();
		}
		var3.method883(arg0, arg1);
		if (this.anInterface_ma4227 != null) {
			this.anInterface_ma4227.method224((short) -6895);
		}
	}

	@ObfuscatedName("ja.dc(II)V")
	public void dc(int arg0, int arg1) throws Exception_Sub1 {
		za var3 = (za) this.method4800(-924859015);
		if (var3 == null) {
			throw new IllegalStateException();
		}
		var3.method883(arg0, arg1);
		if (this.anInterface_ma4227 != null) {
			this.anInterface_ma4227.method224((short) 3178);
		}
	}

	@ObfuscatedName("ja.dl(II)V")
	public void dl(int arg0, int arg1) throws Exception_Sub1 {
		za var3 = (za) this.method4800(-924859015);
		if (var3 == null) {
			throw new IllegalStateException();
		}
		var3.method883(arg0, arg1);
		if (this.anInterface_ma4227 != null) {
			this.anInterface_ma4227.method224((short) -1884);
		}
	}

	@ObfuscatedName("ja.dm(II)V")
	public void dm(int arg0, int arg1) throws Exception_Sub1 {
		za var3 = (za) this.method4800(-924859015);
		if (var3 == null) {
			throw new IllegalStateException();
		}
		var3.method883(arg0, arg1);
		if (this.anInterface_ma4227 != null) {
			this.anInterface_ma4227.method224((short) 4585);
		}
	}

	@ObfuscatedName("ja.du()V")
	public void du() {
	}

	@ObfuscatedName("ja.ho(LClass524;[LClass87_Sub2;Z)LClass263;")
	public Class263 ho(Class524 arg0, Class87_Sub2[] arg1, boolean arg2) {
		int[] var4 = new int[arg1.length];
		int[] var5 = new int[arg1.length];
		boolean var6 = false;
		for (int var7 = 0; var7 < arg1.length; var7++) {
			var4[var7] = arg1[var7].anInt7112;
			var5[var7] = arg1[var7].anInt7107;
			if (arg1[var7].aByteArray7115 != null) {
				var6 = true;
			}
		}
		if (arg2) {
			if (var6) {
				return new ea(this, this.aBa6941, arg0, arg1, null);
			} else {
				return new m(this, this.aBa6941, arg0, arg1, null);
			}
		} else if (var6) {
			throw new IllegalArgumentException("");
		} else {
			return new ia(this, this.aBa6941, arg0, arg1, null);
		}
	}

	@ObfuscatedName("ja.dy()V")
	public void dy() {
	}

	@ObfuscatedName("ja.dx()V")
	public void dx() {
	}

	@ObfuscatedName("ja.dd()V")
	public void dd() {
		if (this.aBoolean6964) {
			return;
		}
		this.anAArray6967 = null;
		this.aBa6941 = null;
		this.aClass249_6945 = null;
		for (ba var1 = (ba) this.aClass471_6965.method5869(539664854); var1 != null; var1 = (ba) this.aClass471_6965.method5873((byte) -105)) {
			var1.ha();
		}
		this.aClass471_6965.method5866(613065745);
		this.da();
		if (this.aBoolean6956) {
			Class95_Sub12.method1137(false, true, -153353186);
			this.aBoolean6956 = false;
		}
		this.h();
		Class71.method824(-1538331687);
		this.aBoolean6964 = true;
	}

	@ObfuscatedName("ja.de()V")
	public void de() {
		if (this.aBoolean6964) {
			return;
		}
		this.anAArray6967 = null;
		this.aBa6941 = null;
		this.aClass249_6945 = null;
		for (ba var1 = (ba) this.aClass471_6965.method5869(539664854); var1 != null; var1 = (ba) this.aClass471_6965.method5873((byte) -114)) {
			var1.ha();
		}
		this.aClass471_6965.method5866(613065745);
		this.da();
		if (this.aBoolean6956) {
			Class95_Sub12.method1137(false, true, -259053021);
			this.aBoolean6956 = false;
		}
		this.h();
		Class71.method824(649268242);
		this.aBoolean6964 = true;
	}

	@ObfuscatedName("ja.di()V")
	public void di() {
		if (this.aBoolean6964) {
			return;
		}
		this.anAArray6967 = null;
		this.aBa6941 = null;
		this.aClass249_6945 = null;
		for (ba var1 = (ba) this.aClass471_6965.method5869(539664854); var1 != null; var1 = (ba) this.aClass471_6965.method5873((byte) -65)) {
			var1.ha();
		}
		this.aClass471_6965.method5866(613065745);
		this.da();
		if (this.aBoolean6956) {
			Class95_Sub12.method1137(false, true, 1950593660);
			this.aBoolean6956 = false;
		}
		this.h();
		Class71.method824(39901464);
		this.aBoolean6964 = true;
	}

	@ObfuscatedName("ja.dk(I)V")
	public void dk(int arg0) {
		Class71.method826(-35950879);
		this.Y(arg0);
		for (ba var2 = (ba) this.aClass471_6965.method5869(539664854); var2 != null; var2 = (ba) this.aClass471_6965.method5873((byte) -74)) {
			var2.u();
		}
	}

	@ObfuscatedName("ja.bk(IIFIIFIIFIIII)V")
	public void bk(int arg0, int arg1, float arg2, int arg3, int arg4, float arg5, int arg6, int arg7, float arg8, int arg9, int arg10, int arg11, int arg12) {
		throw new IllegalStateException();
	}

	@ObfuscatedName("ja.ed()Z")
	public boolean ed() {
		return true;
	}

	@ObfuscatedName("ja.ea()Z")
	public boolean ea() {
		return true;
	}

	@ObfuscatedName("ja.ds()V")
	public void ds() {
	}

	@ObfuscatedName("ja.ew()Z")
	public boolean ew() {
		return true;
	}

	@ObfuscatedName("ja.kc()LClass249;")
	public Class249 kc() {
		return this.aClass249_6945;
	}

	@ObfuscatedName("ja.em()Z")
	public boolean em() {
		return true;
	}

	@ObfuscatedName("ja.by(IIIIIII)V")
	public void by(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		this.nd().method361(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@ObfuscatedName("ja.dn()V")
	public void dn() {
		if (this.aBoolean6964) {
			return;
		}
		this.anAArray6967 = null;
		this.aBa6941 = null;
		this.aClass249_6945 = null;
		for (ba var1 = (ba) this.aClass471_6965.method5869(539664854); var1 != null; var1 = (ba) this.aClass471_6965.method5873((byte) -125)) {
			var1.ha();
		}
		this.aClass471_6965.method5866(613065745);
		this.da();
		if (this.aBoolean6956) {
			Class95_Sub12.method1137(false, true, 1263109120);
			this.aBoolean6956 = false;
		}
		this.h();
		Class71.method824(1829269278);
		this.aBoolean6964 = true;
	}

	@ObfuscatedName("ja.ee()Z")
	public boolean ee() {
		return false;
	}

	@ObfuscatedName("ja.ez()Z")
	public boolean ez() {
		return true;
	}

	@ObfuscatedName("ja.ex()Z")
	public boolean ex() {
		return true;
	}

	@ObfuscatedName("ja.ev()Z")
	public boolean ev() {
		return false;
	}

	@ObfuscatedName("ja.et()Z")
	public boolean et() {
		return true;
	}

	@ObfuscatedName("ja.ey()Z")
	public boolean ey() {
		return true;
	}

	@ObfuscatedName("ja.ej()Z")
	public boolean ej() {
		return true;
	}

	@ObfuscatedName("ja.ek()Z")
	public boolean ek() {
		return true;
	}

	@ObfuscatedName("ja.eb()Z")
	public boolean eb() {
		return true;
	}

	@ObfuscatedName("ja.eg()Z")
	public boolean eg() {
		return true;
	}

	@ObfuscatedName("ja.eo(Z)V")
	public void eo(boolean arg0) {
	}

	@ObfuscatedName("ja.ah(II)LInterface8_Impl1_Impl1;")
	public Interface8_Impl1_Impl1 ah(int arg0, int arg1) {
		return new oa(arg0, arg1);
	}

	@ObfuscatedName("ja.eu(Z)V")
	public void eu(boolean arg0) {
	}

	@ObfuscatedName("ja.es(Ljava/awt/Canvas;II)LClass76_Sub1;")
	public Class76_Sub1 es(Canvas arg0, int arg1, int arg2) {
		return new za(this, arg0, arg1, arg2);
	}

	@ObfuscatedName("ja.fu(Ljava/awt/Canvas;II)LClass76_Sub1;")
	public Class76_Sub1 fu(Canvas arg0, int arg1, int arg2) {
		return new za(this, arg0, arg1, arg2);
	}

	@ObfuscatedName("ja.ft(Ljava/awt/Canvas;II)LClass76_Sub1;")
	public Class76_Sub1 ft(Canvas arg0, int arg1, int arg2) {
		return new za(this, arg0, arg1, arg2);
	}

	@ObfuscatedName("ja.cg()Z")
	public boolean cg() {
		return false;
	}

	@ObfuscatedName("ja.fo(IIII)V")
	public void fo(int arg0, int arg1, int arg2, int arg3) {
		this.aFloat6953 = (float) arg2 / 2.0F;
		this.aFloat6948 = (float) arg3 / 2.0F;
		this.aFloat6960 = (float) arg0 + this.aFloat6953;
		this.aFloat6944 = (float) arg1 + this.aFloat6948;
		this.A(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("ja.fj(IIII)V")
	public void fj(int arg0, int arg1, int arg2, int arg3) {
		this.aFloat6953 = (float) arg2 / 2.0F;
		this.aFloat6948 = (float) arg3 / 2.0F;
		this.aFloat6960 = (float) arg0 + this.aFloat6953;
		this.aFloat6944 = (float) arg1 + this.aFloat6948;
		this.A(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("ja.kb(III)LInterface8_Impl1_Impl1;")
	public Interface8_Impl1_Impl1 kb(int arg0, int arg1, int arg2) {
		return new oa(arg0, arg1);
	}

	@ObfuscatedName("ja.ji(IIII)V")
	public void ji(int arg0, int arg1, int arg2, int arg3) {
	}

	@ObfuscatedName("ja.cu()Z")
	public boolean cu() {
		return false;
	}

	@ObfuscatedName("ja.ch(II[I[I)LClass_ta;")
	public Class_ta ch(int arg0, int arg1, int[] arg2, int[] arg3) {
		return new wa(this, this.aBa6941, arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("ja.gv(IIIIII)I")
	public int gv(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 0;
		float var8 = this.aClass249_6950.aFloatArray2631[14] + this.aClass249_6950.aFloatArray2631[2] * (float) arg0 + this.aClass249_6950.aFloatArray2631[6] * (float) arg1 + this.aClass249_6950.aFloatArray2631[10] * (float) arg2;
		float var9 = this.aClass249_6950.aFloatArray2631[14] + this.aClass249_6950.aFloatArray2631[2] * (float) arg3 + this.aClass249_6950.aFloatArray2631[6] * (float) arg4 + this.aClass249_6950.aFloatArray2631[10] * (float) arg5;
		float var10 = this.aClass249_6950.aFloatArray2631[15] + this.aClass249_6950.aFloatArray2631[3] * (float) arg0 + this.aClass249_6950.aFloatArray2631[7] * (float) arg1 + this.aClass249_6950.aFloatArray2631[11] * (float) arg2;
		float var11 = this.aClass249_6950.aFloatArray2631[15] + this.aClass249_6950.aFloatArray2631[3] * (float) arg3 + this.aClass249_6950.aFloatArray2631[7] * (float) arg4 + this.aClass249_6950.aFloatArray2631[11] * (float) arg5;
		if (var8 < -var10 && var9 < -var11) {
			var7 |= 0x10;
		} else if (var8 > var10 && var9 > var11) {
			var7 |= 0x20;
		}
		float var12 = this.aClass249_6950.aFloatArray2631[12] + this.aClass249_6950.aFloatArray2631[0] * (float) arg0 + this.aClass249_6950.aFloatArray2631[4] * (float) arg1 + this.aClass249_6950.aFloatArray2631[8] * (float) arg2;
		float var13 = this.aClass249_6950.aFloatArray2631[12] + this.aClass249_6950.aFloatArray2631[0] * (float) arg3 + this.aClass249_6950.aFloatArray2631[4] * (float) arg4 + this.aClass249_6950.aFloatArray2631[8] * (float) arg5;
		if (var12 < -var10 && var13 < -var11) {
			var7 |= 0x1;
		}
		if (var12 > var10 && var13 > var11) {
			var7 |= 0x2;
		}
		float var14 = this.aClass249_6950.aFloatArray2631[13] + this.aClass249_6950.aFloatArray2631[1] * (float) arg0 + this.aClass249_6950.aFloatArray2631[5] * (float) arg1 + this.aClass249_6950.aFloatArray2631[9] * (float) arg2;
		float var15 = this.aClass249_6950.aFloatArray2631[13] + this.aClass249_6950.aFloatArray2631[1] * (float) arg3 + this.aClass249_6950.aFloatArray2631[5] * (float) arg4 + this.aClass249_6950.aFloatArray2631[9] * (float) arg5;
		if (var14 < -var10 && var15 < -var11) {
			var7 |= 0x4;
		}
		if (var14 > var10 && var15 > var11) {
			var7 |= 0x8;
		}
		return var7;
	}

	@ObfuscatedName("ja.gz(IIIIII)V")
	public void gz(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		this.YA(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("ja.ie()Z")
	public boolean ie() {
		return false;
	}

	@ObfuscatedName("ja.gk(IIIIIIIII)V")
	public void gk(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
	}

	@ObfuscatedName("ja.gw(IIIIIILClass_ta;II)V")
	public void gw(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Class_ta arg6, int arg7, int arg8) {
		this.R(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@ObfuscatedName("ja.ge(IIIIIII)V")
	public void ge(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		this.nd().method361(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@ObfuscatedName("ja.df()V")
	public void df() {
	}

	@ObfuscatedName("ja.gq(IIIIIII)V")
	public void gq(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		this.nd().method361(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@ObfuscatedName("ja.be(IIIIIILClass_ta;IIIII)V")
	public void be(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Class_ta arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
	}

	@ObfuscatedName("ja.gf(IIIIII)I")
	public int gf(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 0;
		float var8 = this.aClass249_6950.aFloatArray2631[14] + this.aClass249_6950.aFloatArray2631[2] * (float) arg0 + this.aClass249_6950.aFloatArray2631[6] * (float) arg1 + this.aClass249_6950.aFloatArray2631[10] * (float) arg2;
		float var9 = this.aClass249_6950.aFloatArray2631[14] + this.aClass249_6950.aFloatArray2631[2] * (float) arg3 + this.aClass249_6950.aFloatArray2631[6] * (float) arg4 + this.aClass249_6950.aFloatArray2631[10] * (float) arg5;
		float var10 = this.aClass249_6950.aFloatArray2631[15] + this.aClass249_6950.aFloatArray2631[3] * (float) arg0 + this.aClass249_6950.aFloatArray2631[7] * (float) arg1 + this.aClass249_6950.aFloatArray2631[11] * (float) arg2;
		float var11 = this.aClass249_6950.aFloatArray2631[15] + this.aClass249_6950.aFloatArray2631[3] * (float) arg3 + this.aClass249_6950.aFloatArray2631[7] * (float) arg4 + this.aClass249_6950.aFloatArray2631[11] * (float) arg5;
		if (var8 < -var10 && var9 < -var11) {
			var7 |= 0x10;
		} else if (var8 > var10 && var9 > var11) {
			var7 |= 0x20;
		}
		float var12 = this.aClass249_6950.aFloatArray2631[12] + this.aClass249_6950.aFloatArray2631[0] * (float) arg0 + this.aClass249_6950.aFloatArray2631[4] * (float) arg1 + this.aClass249_6950.aFloatArray2631[8] * (float) arg2;
		float var13 = this.aClass249_6950.aFloatArray2631[12] + this.aClass249_6950.aFloatArray2631[0] * (float) arg3 + this.aClass249_6950.aFloatArray2631[4] * (float) arg4 + this.aClass249_6950.aFloatArray2631[8] * (float) arg5;
		if (var12 < -var10 && var13 < -var11) {
			var7 |= 0x1;
		}
		if (var12 > var10 && var13 > var11) {
			var7 |= 0x2;
		}
		float var14 = this.aClass249_6950.aFloatArray2631[13] + this.aClass249_6950.aFloatArray2631[1] * (float) arg0 + this.aClass249_6950.aFloatArray2631[5] * (float) arg1 + this.aClass249_6950.aFloatArray2631[9] * (float) arg2;
		float var15 = this.aClass249_6950.aFloatArray2631[13] + this.aClass249_6950.aFloatArray2631[1] * (float) arg3 + this.aClass249_6950.aFloatArray2631[5] * (float) arg4 + this.aClass249_6950.aFloatArray2631[9] * (float) arg5;
		if (var14 < -var10 && var15 < -var11) {
			var7 |= 0x4;
		}
		if (var14 > var10 && var15 > var11) {
			var7 |= 0x8;
		}
		return var7;
	}

	@ObfuscatedName("ja.kv(III)LInterface8_Impl1_Impl1;")
	public Interface8_Impl1_Impl1 kv(int arg0, int arg1, int arg2) {
		return new oa(arg0, arg1);
	}

	@ObfuscatedName("ja.gi(I)LClass_v;")
	public Class_v gi(int arg0) {
		ba var2 = new ba(this, arg0);
		this.aClass471_6965.method5878(var2, (short) 8192);
		return var2;
	}

	@ObfuscatedName("ja.go(LClass_v;)V")
	public void go(Class_v arg0) {
		this.aBa6941 = (ba) arg0;
		this.n(arg0);
	}

	@ObfuscatedName("ja.jk()LClass76_Sub2;")
	public Class76_Sub2 jk() {
		return new o(this);
	}

	@ObfuscatedName("ja.gc(LClass_v;)V")
	public void gc(Class_v arg0) {
		this.aBa6941 = (ba) arg0;
		this.n(arg0);
	}

	@ObfuscatedName("ja.gt(IIZZ)LClass61;")
	public Class61 gt(int arg0, int arg1, boolean arg2, boolean arg3) {
		return new fa(this, arg0, arg1, arg3);
	}

	@ObfuscatedName("ja.gm(IIZZ)LClass61;")
	public Class61 gm(int arg0, int arg1, boolean arg2, boolean arg3) {
		return new fa(this, arg0, arg1, arg3);
	}

	@ObfuscatedName("ja.dw(I)V")
	public void dw(int arg0) {
		Class71.method826(-1305512390);
		this.Y(arg0);
		for (ba var2 = (ba) this.aClass471_6965.method5869(539664854); var2 != null; var2 = (ba) this.aClass471_6965.method5873((byte) -44)) {
			var2.u();
		}
	}

	@ObfuscatedName("ja.hm([IIIIIZ)LClass61;")
	public Class61 hm(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		return new fa(this, arg0, arg1, arg2, arg3, arg4, false);
	}

	@ObfuscatedName("ja.hv([IIIIIZ)LClass61;")
	public Class61 hv(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		return new fa(this, arg0, arg1, arg2, arg3, arg4, false);
	}

	@ObfuscatedName("ja.hi(LClass87;Z)LClass61;")
	public Class61 hi(Class87 arg0, boolean arg1) {
		fa var3 = new fa(this, arg0.method1031(false), 0, arg0.method986(), arg0.method986(), arg0.method994(), false);
		var3.method717(arg0.method983(), arg0.method990(), arg0.method989(), arg0.method991());
		return var3;
	}

	@ObfuscatedName("ja.hq(LClass87;Z)LClass61;")
	public Class61 hq(Class87 arg0, boolean arg1) {
		fa var3 = new fa(this, arg0.method1031(false), 0, arg0.method986(), arg0.method986(), arg0.method994(), false);
		var3.method717(arg0.method983(), arg0.method990(), arg0.method989(), arg0.method991());
		return var3;
	}

	@ObfuscatedName("ja.fa(IIII)V")
	public void fa(int arg0, int arg1, int arg2, int arg3) {
		this.aFloat6953 = (float) arg2 / 2.0F;
		this.aFloat6948 = (float) arg3 / 2.0F;
		this.aFloat6960 = (float) arg0 + this.aFloat6953;
		this.aFloat6944 = (float) arg1 + this.aFloat6948;
		this.A(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("ja.ht(IIIIZ)LClass61;")
	public Class61 ht(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		return new fa(this, arg0, arg1, arg2, arg3, !arg4);
	}

	@ObfuscatedName("ja.hc(II[I[I)LClass_ta;")
	public Class_ta hc(int arg0, int arg1, int[] arg2, int[] arg3) {
		return new wa(this, this.aBa6941, arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("ja.hy(II[I[I)LClass_ta;")
	public Class_ta hy(int arg0, int arg1, int[] arg2, int[] arg3) {
		return new wa(this, this.aBa6941, arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("ja.jm(ILClass77;)V")
	public final void jm(int arg0, Class77 arg1) {
		this.M(arg0, arg1.anInt652 * -1037349593 * -576105833, arg1.anInt650 * -2010008277 * -348036733, arg1.anInt651 * -533215263 * -892945375);
	}

	@ObfuscatedName("ja.hw(I)V")
	public void hw(int arg0) {
		this.anInt6954 = this.anInt6942 = arg0;
		if (this.anInt6955 > 1) {
			throw new IllegalStateException();
		}
		this.nr(this.anInt6955);
		this.nf(0);
	}

	@ObfuscatedName("ja.jp()LClass76_Sub2;")
	public Class76_Sub2 jp() {
		return new o(this);
	}

	@ObfuscatedName("ja.hb(LModel;IIII)LClass387;")
	public Class387 hb(Model arg0, int arg1, int arg2, int arg3, int arg4) {
		return new h(this, this.aBa6941, arg0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("ja.he(II)I")
	public int he(int arg0, int arg1) {
		int var3 = arg0 & 0xFFFFF;
		int var4 = arg1 & 0xFFFFF;
		return var3 & var4 ^ var4;
	}

	@ObfuscatedName("ja.hg(LModel;IIII)LClass387;")
	public Class387 hg(Model arg0, int arg1, int arg2, int arg3, int arg4) {
		return new h(this, this.aBa6941, arg0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("ja.hj(II)I")
	public int hj(int arg0, int arg1) {
		return arg0 | arg1;
	}

	@ObfuscatedName("ja.hx(II[[I[[IIII)LClass_xa;")
	public Class_xa hx(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
		return new i(this, this.aBa6941, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@ObfuscatedName("ja.hp(II[[I[[IIII)LClass_xa;")
	public Class_xa hp(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
		return new i(this, this.aBa6941, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@ObfuscatedName("ja.ii(I[LClass330_Sub14;)V")
	public void ii(int arg0, Class330_Sub14[] arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < arg0; var4++) {
			anIntArray6940[var3++] = arg1[var4].method3318(-1475966422);
			anIntArray6940[var3++] = arg1[var4].method3311((byte) 15);
			anIntArray6940[var3++] = arg1[var4].method3312((short) 23360);
			anIntArray6940[var3++] = arg1[var4].method3316((byte) -90);
			aFloatArray6966[var4] = arg1[var4].method3317(176628296);
			anIntArray6940[var3++] = arg1[var4].method3313(-1570836542);
		}
		this.Q(arg0, anIntArray6940, aFloatArray6966);
	}

	@ObfuscatedName("ja.ih()LClass247;")
	public Class247 ih() {
		return this.aClass247_6947;
	}

	@ObfuscatedName("ja.ir(LClass249;)V")
	public void ir(Class249 arg0) {
		this.aClass249_6949 = arg0;
		this.wa(this.aClass249_6949.aFloatArray2631);
		this.aClass249_6950.method2484(this.aClass249_6943, this.aClass249_6949);
	}

	@ObfuscatedName("ja.io()LClass249;")
	public Class249 io() {
		return this.aClass249_6949;
	}

	@ObfuscatedName("ja.ic()LClass249;")
	public Class249 ic() {
		return this.aClass249_6949;
	}

	@ObfuscatedName("ja.od(LClass81;Z)V")
	public void od(Class81 arg0, boolean arg1) {
		int var3 = 0;
		int var4 = 0;
		int var5 = 0;
		int var6 = 0;
		int var7 = 0;
		for (Class325_Sub3_Sub1 var8 = (Class325_Sub3_Sub1) arg0.aClass461_675.method5694(74598965); var8 != null; var8 = (Class325_Sub3_Sub1) arg0.aClass461_675.method5695(1102015006)) {
			anIntArray6968[var3++] = var8.anInt9497;
			anIntArray6968[var3++] = var8.anInt9493;
			anIntArray6968[var3++] = var8.anInt9489;
			anIntArray6969[var4++] = var8.anInt9490;
			aShortArray6971[var6++] = (short) var8.anInt9492;
			anIntArray6970[var5++] = var8.anInt9494;
			if (arg1) {
				aByteArray6951[var7++] = var8.aByte9488;
			}
		}
	}

	@ObfuscatedName("ja.g(I)V")
	public void g(int arg0) {
		Class71.method826(-1594867633);
		this.Y(arg0);
		for (ba var2 = (ba) this.aClass471_6965.method5869(539664854); var2 != null; var2 = (ba) this.aClass471_6965.method5873((byte) -50)) {
			var2.u();
		}
	}

	@ObfuscatedName("ja.jw()LClass76_Sub2;")
	public Class76_Sub2 jw() {
		return new o(this);
	}

	@ObfuscatedName("ja.al()Z")
	public boolean al() {
		return true;
	}

	@ObfuscatedName("ja.ix(IIIIII)LClass92;")
	public Class92 ix(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return null;
	}

	@ObfuscatedName("ja.fr()V")
	public void fr() {
	}

	@ObfuscatedName("ja.ip(IIIIII)LClass92;")
	public Class92 ip(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return null;
	}

	@ObfuscatedName("ja.hl(IIIIZ)LClass61;")
	public Class61 hl(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		return new fa(this, arg0, arg1, arg2, arg3, !arg4);
	}

	@ObfuscatedName("ja.in(LClass92;LClass92;FLClass92;)LClass92;")
	public Class92 in(Class92 arg0, Class92 arg1, float arg2, Class92 arg3) {
		return null;
	}

	@ObfuscatedName("ja.is(LClass92;)V")
	public void is(Class92 arg0) {
	}

	@ObfuscatedName("ja.iv()Z")
	public boolean iv() {
		return false;
	}

	@ObfuscatedName("ja.it()Z")
	public boolean it() {
		return false;
	}

	@ObfuscatedName("ja.id()V")
	public void id() {
	}

	@ObfuscatedName("ja.im()V")
	public void im() {
	}

	@ObfuscatedName("ja.ct(II)I")
	public int ct(int arg0, int arg1) {
		int var3 = arg0 & 0xFFFFF;
		int var4 = arg1 & 0xFFFFF;
		return var3 & var4 ^ var4;
	}

	@ObfuscatedName("ja.iq(IIIIII)LClass92;")
	public Class92 iq(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return null;
	}

	@ObfuscatedName("ja.ju(FFFFFF)V")
	public void ju(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
	}

	@ObfuscatedName("ja.jn(IIII)V")
	public void jn(int arg0, int arg1, int arg2, int arg3) {
	}

	@ObfuscatedName("ja.jg(IIII)V")
	public void jg(int arg0, int arg1, int arg2, int arg3) {
	}

	@ObfuscatedName("ja.kw()LClass247;")
	public Class247 kw() {
		return this.aClass247_6952;
	}

	@ObfuscatedName("ja.eq()Z")
	public boolean eq() {
		return true;
	}

	@ObfuscatedName("ja.jt()V")
	public void jt() {
	}

	@ObfuscatedName("ja.ja(ILClass77;)V")
	public final void ja(int arg0, Class77 arg1) {
		this.M(arg0, arg1.anInt652 * -1037349593 * -576105833, arg1.anInt650 * -2010008277 * -348036733, arg1.anInt651 * -533215263 * -892945375);
	}

	@ObfuscatedName("ja.hf(IIIIZ)LClass61;")
	public Class61 hf(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		return new fa(this, arg0, arg1, arg2, arg3, !arg4);
	}

	@ObfuscatedName("ja.bw(LClass87;Z)LClass61;")
	public Class61 bw(Class87 arg0, boolean arg1) {
		fa var3 = new fa(this, arg0.method1031(false), 0, arg0.method986(), arg0.method986(), arg0.method994(), false);
		var3.method717(arg0.method983(), arg0.method990(), arg0.method989(), arg0.method991());
		return var3;
	}

	@ObfuscatedName("ja.jf(ILClass77;)V")
	public final void jf(int arg0, Class77 arg1) {
		this.M(arg0, arg1.anInt652 * -1037349593 * -576105833, arg1.anInt650 * -2010008277 * -348036733, arg1.anInt651 * -533215263 * -892945375);
	}

	@ObfuscatedName("ja.jb(ILClass77;)V")
	public final void jb(int arg0, Class77 arg1) {
		this.M(arg0, arg1.anInt652 * -1037349593 * -576105833, arg1.anInt650 * -2010008277 * -348036733, arg1.anInt651 * -533215263 * -892945375);
	}

	@ObfuscatedName("ja.jj(ILClass77;)V")
	public final void jj(int arg0, Class77 arg1) {
		this.JA(arg0, arg1.anInt652 * -1037349593 * -576105833, arg1.anInt650 * -2010008277 * -348036733, arg1.anInt651 * -533215263 * -892945375);
	}

	@ObfuscatedName("ja.jq(ILClass77;)V")
	public final void jq(int arg0, Class77 arg1) {
		this.JA(arg0, arg1.anInt652 * -1037349593 * -576105833, arg1.anInt650 * -2010008277 * -348036733, arg1.anInt651 * -533215263 * -892945375);
	}

	@ObfuscatedName("ja.aw()Z")
	public boolean aw() {
		return true;
	}

	@ObfuscatedName("ja.jr(IIFIIFIIFIIII)V")
	public void jr(int arg0, int arg1, float arg2, int arg3, int arg4, float arg5, int arg6, int arg7, float arg8, int arg9, int arg10, int arg11, int arg12) {
		throw new IllegalStateException();
	}

	@ObfuscatedName("ja.hk(IIIIZ)LClass61;")
	public Class61 hk(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		return new fa(this, arg0, arg1, arg2, arg3, !arg4);
	}

	@ObfuscatedName("ja.en()Z")
	public boolean en() {
		return true;
	}

	@ObfuscatedName("ja.hz(IIZZ)LClass61;")
	public Class61 hz(int arg0, int arg1, boolean arg2, boolean arg3) {
		return new fa(this, arg0, arg1, arg3);
	}

	@ObfuscatedName("ja.jy()LClass76_Sub2;")
	public Class76_Sub2 jy() {
		return new o(this);
	}

	@ObfuscatedName("ja.jz(FFF[F)V")
	public void jz(float arg0, float arg1, float arg2, float[] arg3) {
		float var5 = this.aClass249_6950.aFloatArray2631[15] + this.aClass249_6950.aFloatArray2631[3] * arg0 + this.aClass249_6950.aFloatArray2631[7] * arg1 + this.aClass249_6950.aFloatArray2631[11] * arg2;
		float var6 = this.aClass249_6950.aFloatArray2631[12] + this.aClass249_6950.aFloatArray2631[0] * arg0 + this.aClass249_6950.aFloatArray2631[4] * arg1 + this.aClass249_6950.aFloatArray2631[8] * arg2;
		float var7 = this.aClass249_6950.aFloatArray2631[13] + this.aClass249_6950.aFloatArray2631[1] * arg0 + this.aClass249_6950.aFloatArray2631[5] * arg1 + this.aClass249_6950.aFloatArray2631[9] * arg2;
		float var8 = this.aClass249_6943.aFloatArray2631[14] + this.aClass249_6943.aFloatArray2631[2] * arg0 + this.aClass249_6943.aFloatArray2631[6] * arg1 + this.aClass249_6943.aFloatArray2631[10] * arg2;
		arg3[0] = this.aFloat6960 + this.aFloat6953 * var6 / var5;
		arg3[1] = this.aFloat6944 + this.aFloat6948 * var7 / var5;
		arg3[2] = var8;
	}

	@ObfuscatedName("ja.jv()LClass76_Sub2;")
	public Class76_Sub2 jv() {
		return new o(this);
	}

	@ObfuscatedName("ja.jx(IILClass72;LClass86;I)LInterface8_Impl1_Impl2;")
	public Interface8_Impl1_Impl2 jx(int arg0, int arg1, Class72 arg2, Class86 arg3, int arg4) {
		return this.no(arg0, arg1);
	}

	@ObfuscatedName("ja.kp(II)LInterface8_Impl1_Impl1;")
	public Interface8_Impl1_Impl1 kp(int arg0, int arg1) {
		return new oa(arg0, arg1);
	}

	@ObfuscatedName("ja.je(ILClass77;)V")
	public final void je(int arg0, Class77 arg1) {
		this.JA(arg0, arg1.anInt652 * -1037349593 * -576105833, arg1.anInt650 * -2010008277 * -348036733, arg1.anInt651 * -533215263 * -892945375);
	}

	@ObfuscatedName("ja.kh(III)LInterface8_Impl1_Impl1;")
	public Interface8_Impl1_Impl1 kh(int arg0, int arg1, int arg2) {
		return new oa(arg0, arg1);
	}

	@ObfuscatedName("ja.cw(LClass247;)V")
	public void cw(Class247 arg0) {
		this.aClass247_6947 = arg0;
		this.aClass249_6943.method2508(arg0);
		this.AA(this.aClass249_6943.aFloatArray2631);
		this.aClass249_6950.method2484(this.aClass249_6943, this.aClass249_6949);
	}

	@ObfuscatedName("ja.er()Z")
	public boolean er() {
		return true;
	}

	@ObfuscatedName("ja.gy()V")
	public synchronized void gy() {
		this.method4781(628001038);
		if (this.nativeid != 0L) {
			Class71.method827(this, -873273575);
		}
	}

	@ObfuscatedName("ja.kj()Z")
	public boolean kj() {
		return true;
	}

	@ObfuscatedName("ja.ka()Z")
	public boolean ka() {
		return true;
	}

	@ObfuscatedName("ja.km()Z")
	public boolean km() {
		return true;
	}

	@ObfuscatedName("ja.ky()Z")
	public boolean ky() {
		return false;
	}

	@ObfuscatedName("ja.ku()Z")
	public boolean ku() {
		return false;
	}

	@ObfuscatedName("ja.ae(IIII)V")
	public void ae(int arg0, int arg1, int arg2, int arg3) {
		this.aFloat6953 = (float) arg2 / 2.0F;
		this.aFloat6948 = (float) arg3 / 2.0F;
		this.aFloat6960 = (float) arg0 + this.aFloat6953;
		this.aFloat6944 = (float) arg1 + this.aFloat6948;
		this.A(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("ja.ef(Z)V")
	public void ef(boolean arg0) {
	}

	@ObfuscatedName("ja.kf()LClass249;")
	public Class249 kf() {
		return this.aClass249_6945;
	}

	@ObfuscatedName("ja.el()Z")
	public boolean el() {
		return true;
	}

	@ObfuscatedName("ja.gp(LClass_v;)V")
	public void gp(Class_v arg0) {
		this.aBa6941 = (ba) arg0;
		this.n(arg0);
	}

	@ObfuscatedName("ja.ol()La;")
	public a ol() {
		for (int var1 = 0; var1 < this.anInt6955; var1++) {
			if (this.anAArray6967[var1].aRunnable6930 == Thread.currentThread()) {
				return this.anAArray6967[var1];
			}
		}
		return null;
	}

	@ObfuscatedName("ja.kq()V")
	public void kq() {
		this.aFloat6953 = (float) this.method4782((byte) 0).method856() / 2.0F;
		this.aFloat6948 = (float) this.method4782((byte) 0).method857() / 2.0F;
		this.aFloat6960 = this.aFloat6953;
		this.aFloat6944 = this.aFloat6948;
		this.k();
	}

	@ObfuscatedName("ja.kg()V")
	public void kg() {
		this.aFloat6953 = (float) this.method4782((byte) 0).method856() / 2.0F;
		this.aFloat6948 = (float) this.method4782((byte) 0).method857() / 2.0F;
		this.aFloat6960 = this.aFloat6953;
		this.aFloat6944 = this.aFloat6948;
		this.k();
	}

	@ObfuscatedName("ja.nc(LClass81;Z)V")
	public void nc(Class81 arg0, boolean arg1) {
		int var3 = 0;
		int var4 = 0;
		int var5 = 0;
		int var6 = 0;
		int var7 = 0;
		for (Class325_Sub3_Sub1 var8 = (Class325_Sub3_Sub1) arg0.aClass461_675.method5694(1991035183); var8 != null; var8 = (Class325_Sub3_Sub1) arg0.aClass461_675.method5695(316000903)) {
			anIntArray6968[var3++] = var8.anInt9497;
			anIntArray6968[var3++] = var8.anInt9493;
			anIntArray6968[var3++] = var8.anInt9489;
			anIntArray6969[var4++] = var8.anInt9490;
			aShortArray6971[var6++] = (short) var8.anInt9492;
			anIntArray6970[var5++] = var8.anInt9494;
			if (arg1) {
				aByteArray6951[var7++] = var8.aByte9488;
			}
		}
	}

	@ObfuscatedName("ja.kd(LClass247;)V")
	public void kd(Class247 arg0) {
		this.aClass247_6947 = arg0;
		this.aClass249_6943.method2508(arg0);
		this.AA(this.aClass249_6943.aFloatArray2631);
		this.aClass249_6950.method2484(this.aClass249_6943, this.aClass249_6949);
	}

	@ObfuscatedName("ja.hs(LModel;IIII)LClass387;")
	public Class387 hs(Model arg0, int arg1, int arg2, int arg3, int arg4) {
		return new h(this, this.aBa6941, arg0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("ja.ln()I")
	public int ln() {
		return 4;
	}

	@ObfuscatedName("ja.gg()V")
	public synchronized void gg() {
		this.method4781(628001038);
		if (this.nativeid != 0L) {
			Class71.method827(this, -1037215170);
		}
	}

	@ObfuscatedName("ja.gh(IIIIIII)V")
	public void gh(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		this.nd().method361(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@ObfuscatedName("ja.cn(II[[I[[IIII)LClass_xa;")
	public Class_xa cn(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
		return new i(this, this.aBa6941, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@ObfuscatedName("ja.cs()LClass249;")
	public Class249 cs() {
		return this.aClass249_6949;
	}

	@ObfuscatedName("ja.ep()Z")
	public boolean ep() {
		return false;
	}

	@ObfuscatedName("ja.ag()LClass76_Sub2;")
	public Class76_Sub2 ag() {
		return new o(this);
	}

	@ObfuscatedName("ja.gr(IIIIII)V")
	public void gr(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		this.YA(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("ja.jd(FFF[F)V")
	public void jd(float arg0, float arg1, float arg2, float[] arg3) {
		float var5 = this.aClass249_6950.aFloatArray2631[15] + this.aClass249_6950.aFloatArray2631[3] * arg0 + this.aClass249_6950.aFloatArray2631[7] * arg1 + this.aClass249_6950.aFloatArray2631[11] * arg2;
		float var6 = this.aClass249_6950.aFloatArray2631[12] + this.aClass249_6950.aFloatArray2631[0] * arg0 + this.aClass249_6950.aFloatArray2631[4] * arg1 + this.aClass249_6950.aFloatArray2631[8] * arg2;
		float var7 = this.aClass249_6950.aFloatArray2631[13] + this.aClass249_6950.aFloatArray2631[1] * arg0 + this.aClass249_6950.aFloatArray2631[5] * arg1 + this.aClass249_6950.aFloatArray2631[9] * arg2;
		float var8 = this.aClass249_6943.aFloatArray2631[14] + this.aClass249_6943.aFloatArray2631[2] * arg0 + this.aClass249_6943.aFloatArray2631[6] * arg1 + this.aClass249_6943.aFloatArray2631[10] * arg2;
		arg3[0] = this.aFloat6960 + this.aFloat6953 * var6 / var5;
		arg3[1] = this.aFloat6944 + this.aFloat6948 * var7 / var5;
		arg3[2] = var8;
	}

	@ObfuscatedName("ja.l()V")
	public void l() {
	}

	@ObfuscatedName("ja.dj(II)V")
	public void dj(int arg0, int arg1) throws Exception_Sub1 {
		za var3 = (za) this.method4800(-924859015);
		if (var3 == null) {
			throw new IllegalStateException();
		}
		var3.method883(arg0, arg1);
		if (this.anInterface_ma4227 != null) {
			this.anInterface_ma4227.method224((short) 27553);
		}
	}

	@ObfuscatedName("ja.hn(I)V")
	public void hn(int arg0) {
		this.anInt6954 = this.anInt6942 = arg0;
		if (this.anInt6955 > 1) {
			throw new IllegalStateException();
		}
		this.nr(this.anInt6955);
		this.nf(0);
	}

	@ObfuscatedName("ja.cc(FFFFFF)V")
	public void cc(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
	}

	@ObfuscatedName("ja.h()V")
	public void h() {
		System.gc();
		System.runFinalization();
		Class71.method826(-384631976);
	}

	@ObfuscatedName("ja.dt()LClass51;")
	public Class51 dt() {
		return new Class51(0, "SSE", 1, "CPU", 0L);
	}

	@ObfuscatedName("ja.jo(ILClass77;)V")
	public final void jo(int arg0, Class77 arg1) {
		this.M(arg0, arg1.anInt652 * -1037349593 * -576105833, arg1.anInt650 * -2010008277 * -348036733, arg1.anInt651 * -533215263 * -892945375);
	}

	@ObfuscatedName("ja.oc(I)V")
	public void oc(int arg0) {
		this.anAArray6967[arg0].method345();
	}

	@ObfuscatedName("ja.jl(FFF[F)V")
	public void jl(float arg0, float arg1, float arg2, float[] arg3) {
		float var5 = this.aClass249_6950.aFloatArray2631[14] + this.aClass249_6950.aFloatArray2631[2] * arg0 + this.aClass249_6950.aFloatArray2631[6] * arg1 + this.aClass249_6950.aFloatArray2631[10] * arg2;
		float var6 = this.aClass249_6950.aFloatArray2631[15] + this.aClass249_6950.aFloatArray2631[3] * arg0 + this.aClass249_6950.aFloatArray2631[7] * arg1 + this.aClass249_6950.aFloatArray2631[11] * arg2;
		if (var5 < -var6 || var5 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		float var7 = this.aClass249_6950.aFloatArray2631[12] + this.aClass249_6950.aFloatArray2631[0] * arg0 + this.aClass249_6950.aFloatArray2631[4] * arg1 + this.aClass249_6950.aFloatArray2631[8] * arg2;
		if (var7 < -var6 || var7 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		float var8 = this.aClass249_6950.aFloatArray2631[13] + this.aClass249_6950.aFloatArray2631[1] * arg0 + this.aClass249_6950.aFloatArray2631[5] * arg1 + this.aClass249_6950.aFloatArray2631[9] * arg2;
		if (var8 < -var6 || var8 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			float var9 = this.aClass249_6943.aFloatArray2631[14] + this.aClass249_6943.aFloatArray2631[2] * arg0 + this.aClass249_6943.aFloatArray2631[6] * arg1 + this.aClass249_6943.aFloatArray2631[10] * arg2;
			arg3[0] = this.aFloat6960 + this.aFloat6953 * var7 / var6;
			arg3[1] = this.aFloat6944 + this.aFloat6948 * var8 / var6;
			arg3[2] = var9;
		}
	}

	@ObfuscatedName("ja.ow()La;")
	public a ow() {
		for (int var1 = 0; var1 < this.anInt6955; var1++) {
			if (this.anAArray6967[var1].aRunnable6930 == Thread.currentThread()) {
				return this.anAArray6967[var1];
			}
		}
		return null;
	}

	@ObfuscatedName("ja.js(IIII)V")
	public void js(int arg0, int arg1, int arg2, int arg3) {
	}

	@ObfuscatedName("ja.gu(IIIIIII)V")
	public void gu(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		this.nd().method361(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@ObfuscatedName("ja.iu(LClass92;LClass92;FLClass92;)LClass92;")
	public Class92 iu(Class92 arg0, Class92 arg1, float arg2, Class92 arg3) {
		return null;
	}

	@ObfuscatedName("ja.kn(LClass81;)V")
	public void kn(Class81 arg0) {
		if (!arg0.aClass461_675.method5698(-1515781372)) {
			this.nc(arg0, false);
			this.nd().method369(this, anIntArray6968, anIntArray6969, anIntArray6970, aShortArray6971, arg0.aClass461_675.method5697(66131531));
		}
	}

	@ObfuscatedName("ja.ki(IIIIIILClass_ta;IIIII)V")
	public void ki(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Class_ta arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
	}

	@ObfuscatedName("ja.pn(II)LInterface8_Impl1_Impl2;")
	public Interface8_Impl1_Impl2 pn(int arg0, int arg1) {
		return (fa) this.bn(arg0, arg1, false, true);
	}

	@ObfuscatedName("ja.pq(II)LInterface8_Impl1_Impl2;")
	public Interface8_Impl1_Impl2 pq(int arg0, int arg1) {
		return (fa) this.bn(arg0, arg1, false, true);
	}

	@ObfuscatedName("ja.YA(IIIIII)V")
	public native void YA(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("ja.J(I)V")
	public native void J(int arg0);

	@ObfuscatedName("ja.da()V")
	public native void da();

	@ObfuscatedName("ja.Y(I)V")
	public native void Y(int arg0);

	@ObfuscatedName("ja.n(LClass_v;)V")
	public native void n(Class_v arg0);

	@ObfuscatedName("ja.Q(I[I[F)V")
	public native void Q(int arg0, int[] arg1, float[] arg2);

	@ObfuscatedName("ja.F(S[ISIBBIZBBBBZZZZZBZZI)V")
	public native void F(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

	@ObfuscatedName("ja.ng()V")
	public native void ng();

	@ObfuscatedName("ja.ma(Z)V")
	public native void ma(boolean arg0);

	@ObfuscatedName("ja.nk(I[I[F)V")
	public native void nk(int arg0, int[] arg1, float[] arg2);

	@ObfuscatedName("ja.ou(Lza;)V")
	public native void ou(za arg0);

	@ObfuscatedName("ja.AA([F)V")
	public native void AA(float[] arg0);

	@ObfuscatedName("ja.ok(SSIBBIZBBBBZZZZZBZZI)V")
	public native void ok(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

	@ObfuscatedName("ja.ar(IIII)[I")
	public native int[] ar(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("ja.PA(Lza;)V")
	public native void PA(za arg0);

	@ObfuscatedName("ja.d(JJ)V")
	public native void d(long arg0, long arg1);

	@ObfuscatedName("ja.k()V")
	public native void k();

	@ObfuscatedName("ja.A(IIII)V")
	public native void A(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("ja.GA(FF)V")
	public native void GA(float arg0, float arg1);

	@ObfuscatedName("ja.L()V")
	public native void L();

	@ObfuscatedName("ja.r(IIII)V")
	public native void r(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("ja.o(IIII)V")
	public native void o(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("ja.qa([I)V")
	public native void qa(int[] arg0);

	@ObfuscatedName("ja.ba(II)V")
	public native void ba(int arg0, int arg1);

	@ObfuscatedName("ja.B(IIIIII)V")
	public native void B(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("ja.XA(IIIII)V")
	public native void XA(int arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("ja.G(IIIII)V")
	public native void G(int arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("ja.CA(IIIII)V")
	public native void CA(int arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("ja.fg(IIII)V")
	public native void fg(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("ja.jh()V")
	public native void jh();

	@ObfuscatedName("ja.ny()V")
	public native void ny();

	@ObfuscatedName("ja.pz(IIII)V")
	public native void pz(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("ja.ij(F)V")
	public native void ij(float arg0);

	@ObfuscatedName("ja.wa([F)V")
	public native void wa(float[] arg0);

	@ObfuscatedName("ja.IA(F)V")
	public native void IA(float arg0);

	@ObfuscatedName("ja.na(I[I[F)V")
	public native void na(int arg0, int[] arg1, float[] arg2);

	@ObfuscatedName("ja.fx(IIIIII)V")
	public native void fx(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("ja.c(III)V")
	public native void c(int arg0, int arg1, int arg2);

	@ObfuscatedName("ja.RA(Z)V")
	public native void RA(boolean arg0);

	@ObfuscatedName("ja.q(LInterface_ma;II)V")
	public native void q(Interface_ma arg0, int arg1, int arg2);

	@ObfuscatedName("ja.pk(IIII)V")
	public native void pk(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("ja.on([F)V")
	public native void on(float[] arg0);

	@ObfuscatedName("ja.JA(IIII)V")
	public native void JA(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("ja.O()V")
	public native void O();

	@ObfuscatedName("ja.M(IIII)V")
	public native void M(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("ja.ov([F)V")
	public native void ov(float[] arg0);

	@ObfuscatedName("ja.ob(IIII)V")
	public native void ob(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("ja.ks(Z)V")
	public native void ks(boolean arg0);

	@ObfuscatedName("ja.gx(IIIII)V")
	public native void gx(int arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("ja.DA(ILClass_ta;II)V")
	public native void DA(int arg0, Class_ta arg1, int arg2, int arg3);

	@ObfuscatedName("ja.dp()I")
	public native int dp();

	@ObfuscatedName("ja.za()I")
	public native int za();

	@ObfuscatedName("ja.gb(IIIIII[BII)V")
	public native void gb(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

	@ObfuscatedName("ja.oz(S[ISIBBIZBBBBZZZZZBZZI)V")
	public native void oz(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

	@ObfuscatedName("ja.fm(IIII)[I")
	public native int[] fm(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("ja.gj(IIIII)V")
	public native void gj(int arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("ja.fz(FF)V")
	public native void fz(float arg0, float arg1);

	@ObfuscatedName("ja.fc(IIII)V")
	public native void fc(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("ja.fy(IIII)V")
	public native void fy(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("ja.fh(IIII)V")
	public native void fh(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("ja.fl([I)V")
	public native void fl(int[] arg0);

	@ObfuscatedName("ja.fv([I)V")
	public native void fv(int[] arg0);

	@ObfuscatedName("ja.ff([I)V")
	public native void ff(int[] arg0);

	@ObfuscatedName("ja.fn(II)V")
	public native void fn(int arg0, int arg1);

	@ObfuscatedName("ja.ik(IFFFFF)V")
	public native void ik(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

	@ObfuscatedName("ja.fd(IIIIII)V")
	public native void fd(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("ja.ga(IIIII)V")
	public native void ga(int arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("ja.fw(IIIIII)V")
	public native void fw(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("ja.fp(IIIIII[BII)V")
	public native void fp(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

	@ObfuscatedName("ja.fb(IIIIII[BII)V")
	public native void fb(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

	@ObfuscatedName("ja.gn(IIIII)V")
	public native void gn(int arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("ja.gd(IIIII)V")
	public native void gd(int arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("ja.N(IIIIII[BII)V")
	public native void N(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

	@ObfuscatedName("ja.ib(III)V")
	public native void ib(int arg0, int arg1, int arg2);

	@ObfuscatedName("ja.gl(IIIII)V")
	public native void gl(int arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("ja.oq(I[I[F)V")
	public native void oq(int arg0, int[] arg1, float[] arg2);

	@ObfuscatedName("ja.oa(S[ISIBBIZBBBBZZZZZBZZI)V")
	public native void oa(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

	@ObfuscatedName("ja.oh()V")
	public native void oh();

	@ObfuscatedName("ja.x(Z)V")
	public native void x(boolean arg0);

	@ObfuscatedName("ja.hu(ILClass_ta;II)V")
	public native void hu(int arg0, Class_ta arg1, int arg2, int arg3);

	@ObfuscatedName("ja.hr(ILClass_ta;II)V")
	public native void hr(int arg0, Class_ta arg1, int arg2, int arg3);

	@ObfuscatedName("ja.V(SSIBBIZBBBBZZZZZBZZI)V")
	public native void V(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

	@ObfuscatedName("ja.oo(JJ)V")
	public native void oo(long arg0, long arg1);

	@ObfuscatedName("ja.ia(F)V")
	public native void ia(float arg0);

	@ObfuscatedName("ja.og(IIII)V")
	public native void og(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("ja.iw(I)V")
	public native void iw(int arg0);

	@ObfuscatedName("ja.iz(IFFFFF)V")
	public native void iz(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

	@ObfuscatedName("ja.ig(III)V")
	public native void ig(int arg0, int arg1, int arg2);

	@ObfuscatedName("ja.nx(LClass_v;)V")
	public native void nx(Class_v arg0);

	public native void method_if(int arg0, int arg1, int arg2);

	@ObfuscatedName("ja.oe([F)V")
	public native void oe(float[] arg0);

	@ObfuscatedName("ja.fe(IIII)V")
	public native void fe(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("ja.fi(II)V")
	public native void fi(int arg0, int arg1);

	@ObfuscatedName("ja.il(I)V")
	public native void il(int arg0);

	@ObfuscatedName("ja.ko()V")
	public native void ko();

	@ObfuscatedName("ja.kz()V")
	public native void kz();

	@ObfuscatedName("ja.ox(Lza;)V")
	public native void ox(za arg0);

	@ObfuscatedName("ja.kr(Z)V")
	public native void kr(boolean arg0);

	@ObfuscatedName("ja.lp(Z)V")
	public native void lp(boolean arg0);

	@ObfuscatedName("ja.nw(LInterface_ma;II)V")
	public native void nw(Interface_ma arg0, int arg1, int arg2);

	@ObfuscatedName("ja.np(LInterface_ma;II)V")
	public native void np(Interface_ma arg0, int arg1, int arg2);

	@ObfuscatedName("ja.nz(IIIIII)V")
	public native void nz(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("ja.nn(IIIIII)V")
	public native void nn(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("ja.nt()V")
	public native void nt();

	@ObfuscatedName("ja.ns(I)V")
	public native void ns(int arg0);

	@ObfuscatedName("ja.nm(I)V")
	public native void nm(int arg0);

	@ObfuscatedName("ja.m(IFFFFF)V")
	public native void m(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

	@ObfuscatedName("ja.R(IIIIIILClass_ta;II)V")
	public native void R(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Class_ta arg6, int arg7, int arg8);

	@ObfuscatedName("ja.ot(SSIBBIZBBBBZZZZZBZZI)V")
	public native void ot(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

	@ObfuscatedName("ja.ke()V")
	public native void ke();

	@ObfuscatedName("ja.oj(Lza;)V")
	public native void oj(za arg0);

	@ObfuscatedName("ja.op(JJ)V")
	public native void op(long arg0, long arg1);

	@ObfuscatedName("ja.of()V")
	public native void of();

	@ObfuscatedName("ja.os([F)V")
	public native void os(float[] arg0);

	@ObfuscatedName("ja.oy([F)V")
	public native void oy(float[] arg0);

	@ObfuscatedName("ja.om(IIII)V")
	public native void om(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("ja.or(IIII)V")
	public native void or(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("ja.pw(IIII)V")
	public native void pw(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("ja.pd(IIII)V")
	public native void pd(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("ja.pg(IIII)V")
	public native void pg(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("ja.oi(IIII)V")
	public native void oi(int arg0, int arg1, int arg2, int arg3);
}
