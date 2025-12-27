package deob;

public class Class166_Sub2 extends Class166 {

	public Class260 aClass260_7332 = new Class260();

	public Class244 aClass244_7327 = new Class244();

	public int anInt7329 = 200;

	public Class260 aClass260_7331 = new Class260(Float.NaN, Float.NaN, Float.NaN);

	public Class260 aClass260_7326 = new Class260(Float.NaN, Float.NaN, Float.NaN);

	public Class260 aClass260_7325 = new Class260();

	public Class244 aClass244_7334 = new Class244();

	public int anInt7330;

	public Interface6 anInterface6_7333;

	public boolean aBoolean7328;

	public Class166_Sub2(Class145 arg0) {
		super(arg0);
	}

	public void method2003(Interface6 arg0, Class260 arg1, Class244 arg2, boolean arg3, int arg4, Class307 arg5, int[][][] arg6, short arg7) {
		try {
			this.anInterface6_7333 = arg0;
			this.aClass260_7332.method2582(arg1);
			this.aClass244_7327.method2419(arg2);
			this.aBoolean7328 = arg3;
			this.anInt7329 = arg4;
			this.anInt7330 = this.anInterface6_7333.method79(489096283).anInt7716;
			this.method2005(arg5, arg6, -1997398250);
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "aap.h(" + ')');
		}
	}

	public void method1966(float arg0, Class307 arg1, int[][][] arg2, int arg3) {
		try {
			if (this.anInterface6_7333 != null) {
				this.method2005(arg1, arg2, -1103196287);
				Class244 var5 = this.method2004(-491302188);
				this.aClass244_7334.method2432(var5, this.aClass145_1699.method1700((byte) -56));
				var5.method2417();
				this.aClass260_7326.method2582(this.anInterface6_7333.method79(375211176).method3400(2087905371));
				this.aClass145_1699.method1672(true, arg0, this.aClass260_7331, this.aClass145_1699.method1712(652552364), this.aClass260_7326, this.aClass260_7325, 2045801888);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "aap.r(" + ')');
		}
	}

	public Class244 method2004(int arg0) {
		try {
			Class244 var2 = Class244.method2416(this.aClass244_7327);
			if (this.aBoolean7328) {
				Class260 var3 = this.anInterface6_7333.method73(277101108);
				if (var3.method2565() < (float) this.anInt7329) {
					var3 = Class260.method2577(0.0F, 0.0F, 1.0F);
					Class244 var4 = this.anInterface6_7333.method72(1590898014);
					var3.method2570(var4);
				}
				var3.aFloat2715 = 0.0F;
				float var7 = (float) Math.atan2((double) var3.aFloat2716, (double) var3.aFloat2711);
				var3.method2550();
				Class244 var5 = new Class244();
				var5.method2427(0.0F, 1.0F, 0.0F, var7);
				var2.method2429(var5);
			}
			return var2;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "aap.y(" + ')');
		}
	}

	public void method2005(Class307 arg0, int[][][] arg1, int arg2) {
		try {
			if (this.method1985(641774542) && (this.aClass145_1699.method1697(-956706899) || this.aClass145_1699.method1706(-1852801526))) {
				Class244 var4 = this.method2004(1950223614);
				if (this.aClass145_1699.method1706(-1842659433) && arg1 == null) {
				}
				var4.method2417();
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aap.v(" + ')');
		}
	}

	public boolean method1985(int arg0) {
		try {
			return !Float.isNaN(this.aClass260_7331.aFloat2716);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aap.j(" + ')');
		}
	}

	public void method1967(Class138 arg0, int arg1, int arg2) {
		Class260 var4 = this.method1968((byte) -1);
		arg0.anInt1532 = ((int) var4.aFloat2716 - arg1) * -581921585 * -1708658129;
		arg0.anInt1531 = (int) -var4.aFloat2715 * 1868671083 * -1724005309;
		arg0.anInt1533 = ((int) var4.aFloat2711 - arg2) * -950728209 * 1914258703;
		var4.method2550();
	}

	public Class330_Sub28 method1969(byte arg0) {
		try {
			Class260 var2 = this.method1968((byte) -1);
			Class330_Sub28 var3 = new Class330_Sub28(this.anInt7330, (int) var2.aFloat2716, (int) var2.aFloat2715, (int) var2.aFloat2711);
			var2.method2550();
			return var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aap.p(" + ')');
		}
	}

	public Class260 method2006(int arg0) {
		try {
			return this.aClass260_7331;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aap.ay(" + ')');
		}
	}

	public Class260 method1979() {
		Class260 var1 = Class260.method2549(this.aClass260_7332);
		var1.method2570(this.aClass244_7334);
		Class260 var2 = Class260.method2578(this.aClass260_7331, var1);
		var1.method2550();
		return var2;
	}

	public float method2007(int arg0) {
		try {
			return Class240.method2395(this.aClass244_7327, 1206398271);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aap.al(" + ')');
		}
	}

	public boolean method1978() {
		return !Float.isNaN(this.aClass260_7331.aFloat2716);
	}

	public void method1974(Buffer arg0, short arg1) {
		try {
			Class128 var3 = Class501.method6125(arg0.readUnsignedByte(482752623), -522124439);
			int var4 = arg0.readUnsignedShort(-418609180);
			this.aClass260_7332.method2552(arg0);
			this.aClass244_7327.method2434(arg0);
			if (arg0.readUnsignedByte(2053050793) == 1) {
				this.aBoolean7328 = true;
			} else {
				this.aBoolean7328 = false;
			}
			this.anInt7329 = arg0.readUnsignedShort(386164312);
			this.anInterface6_7333 = this.aClass145_1699.method1691(-157373441).method65(var3, var4, (byte) 31);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aap.s(" + ')');
		}
	}

	public void method1986(Class138 arg0, int arg1, int arg2) {
		Class260 var4 = this.method1968((byte) -1);
		arg0.anInt1532 = ((int) var4.aFloat2716 - arg1) * -581921585 * -1708658129;
		arg0.anInt1531 = (int) -var4.aFloat2715 * 1868671083 * -1724005309;
		arg0.anInt1533 = ((int) var4.aFloat2711 - arg2) * -950728209 * 1914258703;
		var4.method2550();
	}

	public float method2008(int arg0) {
		try {
			return Class101.method1214(this.aClass244_7327, -975059291);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aap.at(" + ')');
		}
	}

	public boolean method1975() {
		return !Float.isNaN(this.aClass260_7331.aFloat2716);
	}

	public boolean method1976() {
		return !Float.isNaN(this.aClass260_7331.aFloat2716);
	}

	public boolean method1971() {
		return !Float.isNaN(this.aClass260_7331.aFloat2716);
	}

	public Class330_Sub28 method1984() {
		Class260 var1 = this.method1968((byte) -1);
		Class330_Sub28 var2 = new Class330_Sub28(this.anInt7330 * 2004391893 * -205919875, (int) var1.aFloat2716, (int) var1.aFloat2715, (int) var1.aFloat2711);
		var1.method2550();
		return var2;
	}

	public Class330_Sub28 method1980() {
		Class260 var1 = this.method1968((byte) -1);
		Class330_Sub28 var2 = new Class330_Sub28(this.anInt7330 * 2004391893 * -205919875, (int) var1.aFloat2716, (int) var1.aFloat2715, (int) var1.aFloat2711);
		var1.method2550();
		return var2;
	}

	public Class330_Sub28 method1981() {
		Class260 var1 = this.method1968((byte) -1);
		Class330_Sub28 var2 = new Class330_Sub28(this.anInt7330 * 2004391893 * -205919875, (int) var1.aFloat2716, (int) var1.aFloat2715, (int) var1.aFloat2711);
		var1.method2550();
		return var2;
	}

	public Class330_Sub28 method1987() {
		Class260 var1 = this.method1968((byte) -1);
		Class330_Sub28 var2 = new Class330_Sub28(this.anInt7330 * 2004391893 * -205919875, (int) var1.aFloat2716, (int) var1.aFloat2715, (int) var1.aFloat2711);
		var1.method2550();
		return var2;
	}

	public Class330_Sub28 method1982() {
		Class260 var1 = this.method1968((byte) -1);
		Class330_Sub28 var2 = new Class330_Sub28(this.anInt7330 * 2004391893 * -205919875, (int) var1.aFloat2716, (int) var1.aFloat2715, (int) var1.aFloat2711);
		var1.method2550();
		return var2;
	}

	public void method1972(float arg0, Class307 arg1, int[][][] arg2) {
		if (this.anInterface6_7333 == null) {
			return;
		}
		this.method2005(arg1, arg2, -838040077);
		Class244 var4 = this.method2004(-264819384);
		this.aClass244_7334.method2432(var4, this.aClass145_1699.method1700((byte) 92));
		var4.method2417();
		this.aClass260_7326.method2582(this.anInterface6_7333.method79(1954580103).method3400(2087905371));
		this.aClass145_1699.method1672(true, arg0, this.aClass260_7331, this.aClass145_1699.method1712(652552364), this.aClass260_7326, this.aClass260_7325, 1706202642);
	}

	public void method1977(Class138 arg0, int arg1, int arg2) {
		Class260 var4 = this.method1968((byte) -1);
		arg0.anInt1532 = ((int) var4.aFloat2716 - arg1) * -581921585 * -1708658129;
		arg0.anInt1531 = (int) -var4.aFloat2715 * 1868671083 * -1724005309;
		arg0.anInt1533 = ((int) var4.aFloat2711 - arg2) * -950728209 * 1914258703;
		var4.method2550();
	}

	public Class260 method2009(int arg0) {
		try {
			return this.aClass260_7332;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aap.ac(" + ')');
		}
	}

	public void method1965(Buffer arg0) {
		Class128 var2 = Class501.method6125(arg0.readUnsignedByte(1140909014), -1829711598);
		int var3 = arg0.readUnsignedShort(1166616648);
		this.aClass260_7332.method2552(arg0);
		this.aClass244_7327.method2434(arg0);
		if (arg0.readUnsignedByte(411796957) == 1) {
			this.aBoolean7328 = true;
		} else {
			this.aBoolean7328 = false;
		}
		this.anInt7329 = arg0.readUnsignedShort(619619368) * -1553361817 * 798639959;
		this.anInterface6_7333 = this.aClass145_1699.method1691(1537947687).method65(var2, var3, (byte) 23);
	}

	public void method1970(Class138 arg0, int arg1, int arg2, byte arg3) {
		try {
			Class260 var5 = this.method1968((byte) -1);
			arg0.anInt1532 = (int) var5.aFloat2716 - arg1;
			arg0.anInt1531 = (int) -var5.aFloat2715;
			arg0.anInt1533 = (int) var5.aFloat2711 - arg2;
			var5.method2550();
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "aap.o(" + ')');
		}
	}

	public void method1983(float arg0, Class307 arg1, int[][][] arg2) {
		if (this.anInterface6_7333 == null) {
			return;
		}
		this.method2005(arg1, arg2, -1358648903);
		Class244 var4 = this.method2004(-272424000);
		this.aClass244_7334.method2432(var4, this.aClass145_1699.method1700((byte) 7));
		var4.method2417();
		this.aClass260_7326.method2582(this.anInterface6_7333.method79(103454714).method3400(2087905371));
		this.aClass145_1699.method1672(true, arg0, this.aClass260_7331, this.aClass145_1699.method1712(652552364), this.aClass260_7326, this.aClass260_7325, 2068218413);
	}

	public Class260 method1968(byte arg0) {
		try {
			Class260 var2 = Class260.method2549(this.aClass260_7332);
			var2.method2570(this.aClass244_7334);
			Class260 var3 = Class260.method2578(this.aClass260_7331, var2);
			var2.method2550();
			return var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aap.i(" + ')');
		}
	}

	public void method1973(float arg0, Class307 arg1, int[][][] arg2) {
		if (this.anInterface6_7333 == null) {
			return;
		}
		this.method2005(arg1, arg2, -1062053454);
		Class244 var4 = this.method2004(-2042363967);
		this.aClass244_7334.method2432(var4, this.aClass145_1699.method1700((byte) -12));
		var4.method2417();
		this.aClass260_7326.method2582(this.anInterface6_7333.method79(852097621).method3400(2087905371));
		this.aClass145_1699.method1672(true, arg0, this.aClass260_7331, this.aClass145_1699.method1712(652552364), this.aClass260_7326, this.aClass260_7325, 2045675399);
	}

	public static final void method2010(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		try {
			Class3[] var7 = client.aClass3Array8986;
			for (int var8 = 0; var8 < var7.length; var8++) {
				Class3 var9 = var7[var8];
				if (var9 != null) {
					if (var9.anInt53 == 2) {
						Class281.method2791(var9.anInt48, var9.anInt51, var9.anInt50, var9.anInt55 * 2, (byte) -63);
						if (client.aFloatArray9253[0] > -1.0F && client.anInt8981 % 20 < 10) {
							Class61 var10 = Class125.aClass61Array1457[var9.anInt46];
							int var11 = (int) (client.aFloatArray9253[0] + (float) arg0 - 12.0F);
							int var12 = (int) (client.aFloatArray9253[1] + (float) arg1 - 28.0F);
							var10.method687(var11, var12);
						}
					} else if (arg6 >= -1972183939) {
						throw new IllegalStateException();
					}
				}
			}
		} catch (RuntimeException var13) {
			throw Class476.method5964(var13, "aap.jg(" + ')');
		}
	}

	public static final void method2011(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class543.method6343(var3, arg0, 689585817);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aap.cj(" + ')');
		}
	}
}
