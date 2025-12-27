package deob;

public class Class432_Sub1_Sub5_Sub1 extends Class432_Sub1_Sub5 implements Interface2 {

	public static int[] anIntArray9959 = new int[] { 1, 2, 4, 8 };

	public static int[] anIntArray9951 = new int[] { 16, 32, 64, 128 };

	public Class463 aClass463_9952;

	public int anInt9956;

	public boolean aBoolean9953;

	public byte aByte9958;

	public byte aByte9957;

	public boolean aBoolean9955;

	public boolean aBoolean9961;

	public boolean aBoolean9954;

	public Class387 aClass387_9962;

	public Class_na aClass_na9950;

	public static int anInt9963;

	public Class348 aClass348_9960;

	public Class353 method5405(Class_ra arg0, int arg1) {
		try {
			if (this.aClass387_9962 == null) {
				return null;
			} else {
				Class247 var3 = this.method5355();
				Class353 var4 = Class497.method6105(this.aBoolean9955, (byte) 16);
				this.aClass387_9962.method4475(var3, this.aClass80Array8656[0], 0);
				return var4;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ya.bf(" + ')');
		}
	}

	public boolean method5382(int arg0) {
		try {
			if (this.aClass387_9962 == null) {
				return true;
			} else {
				return !this.aClass387_9962.u();
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ya.ao(" + ')');
		}
	}

	public boolean method5395(int arg0) {
		try {
			return this.aClass387_9962 == null ? false : this.aClass387_9962.i();
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ya.bg(" + ')');
		}
	}

	public Class432_Sub1_Sub5_Sub1(Class356 arg0, Class_ra arg1, Class463 arg2, Class473 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, boolean arg12) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, Class112.method1377(arg10, arg11, -635999601));
		this.aClass463_9952 = arg2;
		this.anInt9956 = arg3.anInt5657;
		this.aBoolean9953 = arg9;
		this.aByte9958 = (byte) arg10;
		this.aByte9957 = (byte) arg11;
		this.aBoolean9955 = arg3.anInt5637 != 0 && !arg9;
		this.aBoolean9961 = arg12;
		this.aBoolean9954 = arg1.y() && arg3.aBoolean5685 && !this.aBoolean9953 && Class448.aClass330_Sub50_5555.aClass464_Sub28_7885.method5837(-343351218) != 0;
		int var14 = 2048;
		if (this.aBoolean9961) {
			var14 |= 0x10000;
		}
		if (arg3.aBoolean5683) {
			var14 |= 0x80000;
		}
		Class485 var15 = this.method5545(arg1, var14, this.aBoolean9954, (byte) -72);
		if (var15 != null) {
			this.aClass387_9962 = (Class387) var15.anObject5824;
			this.aClass_na9950 = (Class_na) var15.anObject5823;
			if (this.aBoolean9961 || arg3.aBoolean5683) {
				this.aClass387_9962 = this.aClass387_9962.method4446((byte) 0, var14, false);
				if (arg3.aBoolean5683) {
					Class312 var16 = client.aClass304_9030.method3027((byte) -64);
					this.aClass387_9962.PA(var16.anInt3250, var16.anInt3248, var16.anInt3249, var16.anInt3247);
				}
			}
		}
		this.method5373(1, 1005016715);
	}

	public boolean method5360(short arg0) {
		try {
			return this.aBoolean9961;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ya.bi(" + ')');
		}
	}

	public Class485 method5545(Class_ra arg0, int arg1, boolean arg2, byte arg3) {
		try {
			Class473 var5 = this.aClass463_9952.method5705(this.anInt9956, (byte) -101);
			Class_xa var6;
			Class_xa var7;
			if (this.aBoolean9953) {
				var6 = this.aClass356_8655.aClass_xaArray3658[this.aByte8654];
				var7 = this.aClass356_8655.aClass_xaArray3701[0];
			} else {
				var6 = this.aClass356_8655.aClass_xaArray3701[this.aByte8654];
				if (this.aByte8654 < 3) {
					var7 = this.aClass356_8655.aClass_xaArray3701[this.aByte8654 + 1];
				} else {
					var7 = null;
				}
			}
			Class260 var8 = this.method5346().aClass260_2606;
			return var5.method5897(arg0, arg1, this.aByte9958, this.aByte9957, var6, var7, (int) var8.aFloat2716, (int) var8.aFloat2715, (int) var8.aFloat2711, arg2, null, (byte) -63);
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "ya.bn(" + ')');
		}
	}

	public Class348 method5383(Class_ra arg0, int arg1) {
		try {
			Class260 var3 = this.method5346().aClass260_2606;
			if (this.aClass348_9960 == null) {
				this.aClass348_9960 = Class201_Sub2.method2171((int) var3.aFloat2716, (int) var3.aFloat2715, (int) var3.aFloat2711, this.method5546(arg0, 0, -1483969281), (byte) -22);
			}
			return this.aClass348_9960;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ya.bt(" + ')');
		}
	}

	public boolean method30() {
		return this.aBoolean9954;
	}

	public void method5404(Class_ra arg0, int arg1) {
	}

	public boolean method5358(Class_ra arg0, int arg1, int arg2, int arg3) {
		try {
			Class387 var5 = this.method5546(arg0, 131072, -2045316852);
			if (var5 == null) {
				return false;
			} else {
				Class247 var6 = this.method5355();
				return var5.method4458(arg1, arg2, var6, false, 0);
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ya.br(" + ')');
		}
	}

	public Class387 method5546(Class_ra arg0, int arg1, int arg2) {
		try {
			if (this.aClass387_9962 != null && arg0.ct(this.aClass387_9962.m(), arg1) == 0) {
				return this.aClass387_9962;
			} else {
				Class485 var4 = this.method5545(arg0, arg1, false, (byte) -9);
				return var4 == null ? null : (Class387) var4.anObject5824;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ya.bk(" + ')');
		}
	}

	public boolean method5379() {
		return this.aClass387_9962 == null ? false : this.aClass387_9962.i();
	}

	public void method5393(int arg0) {
		try {
			this.aBoolean9961 = false;
			if (this.aClass387_9962 != null) {
				this.aClass387_9962.KA(this.aClass387_9962.m() & 0xFFFEFFFF);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ya.be(" + ')');
		}
	}

	public int method34(short arg0) {
		try {
			return this.anInt9956;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ya.r(" + ')');
		}
	}

	public void method32() {
		if (this.aClass387_9962 != null) {
			this.aClass387_9962.method4479();
		}
	}

	public int method33(byte arg0) {
		try {
			return this.aByte9957;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ya.i(" + ')');
		}
	}

	public void method23(int arg0) {
		try {
			if (this.aClass387_9962 != null) {
				this.aClass387_9962.method4479();
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ya.p(" + ')');
		}
	}

	public void method25(Class_ra arg0, int arg1) {
		try {
			Object var3 = null;
			Class_na var4;
			if (this.aClass_na9950 == null && this.aBoolean9954) {
				Class485 var5 = this.method5545(arg0, 262144, true, (byte) -63);
				var4 = (Class_na) (var5 == null ? null : var5.anObject5823);
			} else {
				var4 = this.aClass_na9950;
				this.aClass_na9950 = null;
			}
			Class260 var7 = this.method5346().aClass260_2606;
			if (var4 != null) {
				this.aClass356_8655.method4185(var4, this.aByte8654, (int) var7.aFloat2716, (int) var7.aFloat2711, null, (byte) 5);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ya.s(" + ')');
		}
	}

	public boolean method36() {
		return this.aBoolean9954;
	}

	public void method26(Class_ra arg0, int arg1) {
		try {
			Object var3 = null;
			Class_na var4;
			if (this.aClass_na9950 == null && this.aBoolean9954) {
				Class485 var5 = this.method5545(arg0, 262144, true, (byte) -15);
				var4 = (Class_na) (var5 == null ? null : var5.anObject5823);
			} else {
				var4 = this.aClass_na9950;
				this.aClass_na9950 = null;
			}
			Class260 var7 = this.method5346().aClass260_2606;
			if (var4 != null) {
				this.aClass356_8655.method4167(var4, this.aByte8654, (int) var7.aFloat2716, (int) var7.aFloat2711, null, (byte) 94);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ya.f(" + ')');
		}
	}

	public int method27() {
		return this.anInt9956 * 1121842865 * -11234735;
	}

	public int method28() {
		return this.aByte9958;
	}

	public int method29() {
		return this.aByte9958;
	}

	public int method24() {
		return this.aByte9957;
	}

	public int method39() {
		return this.aByte9957;
	}

	public boolean method31(int arg0) {
		try {
			return this.aBoolean9954;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ya.o(" + ')');
		}
	}

	public void method20() {
		if (this.aClass387_9962 != null) {
			this.aClass387_9962.method4479();
		}
	}

	public void method35(Class_ra arg0) {
		Object var2 = null;
		Class_na var3;
		if (this.aClass_na9950 == null && this.aBoolean9954) {
			Class485 var4 = this.method5545(arg0, 262144, true, (byte) -107);
			var3 = (Class_na) (var4 == null ? null : var4.anObject5823);
		} else {
			var3 = this.aClass_na9950;
			this.aClass_na9950 = null;
		}
		Class260 var5 = this.method5346().aClass260_2606;
		if (var3 != null) {
			this.aClass356_8655.method4185(var3, this.aByte8654, (int) var5.aFloat2716, (int) var5.aFloat2711, null, (byte) 84);
		}
	}

	public boolean method22() {
		return this.aBoolean9954;
	}

	public int method5381() {
		return this.aClass387_9962 == null ? 0 : this.aClass387_9962.YA();
	}

	public void method37(Class_ra arg0) {
		Object var2 = null;
		Class_na var3;
		if (this.aClass_na9950 == null && this.aBoolean9954) {
			Class485 var4 = this.method5545(arg0, 262144, true, (byte) -85);
			var3 = (Class_na) (var4 == null ? null : var4.anObject5823);
		} else {
			var3 = this.aClass_na9950;
			this.aClass_na9950 = null;
		}
		Class260 var5 = this.method5346().aClass260_2606;
		if (var3 != null) {
			this.aClass356_8655.method4185(var3, this.aByte8654, (int) var5.aFloat2716, (int) var5.aFloat2711, null, (byte) -29);
		}
	}

	public void method38(Class_ra arg0) {
		Object var2 = null;
		Class_na var3;
		if (this.aClass_na9950 == null && this.aBoolean9954) {
			Class485 var4 = this.method5545(arg0, 262144, true, (byte) -20);
			var3 = (Class_na) (var4 == null ? null : var4.anObject5823);
		} else {
			var3 = this.aClass_na9950;
			this.aClass_na9950 = null;
		}
		Class260 var5 = this.method5346().aClass260_2606;
		if (var3 != null) {
			this.aClass356_8655.method4185(var3, this.aByte8654, (int) var5.aFloat2716, (int) var5.aFloat2711, null, (byte) -3);
		}
	}

	public boolean method5374() {
		if (this.aClass387_9962 == null) {
			return true;
		} else {
			return !this.aClass387_9962.u();
		}
	}

	public boolean method5375() {
		if (this.aClass387_9962 == null) {
			return true;
		} else {
			return !this.aClass387_9962.u();
		}
	}

	public boolean method5376() {
		if (this.aClass387_9962 == null) {
			return true;
		} else {
			return !this.aClass387_9962.u();
		}
	}

	public boolean method5377() {
		return this.aClass387_9962 == null ? false : this.aClass387_9962.i();
	}

	public void method5396(Class_ra arg0, Class432_Sub1 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (arg1 instanceof Class432_Sub1_Sub5_Sub1) {
			Class432_Sub1_Sub5_Sub1 var7 = (Class432_Sub1_Sub5_Sub1) arg1;
			if (this.aClass387_9962 != null && var7.aClass387_9962 != null) {
				this.aClass387_9962.method4490(var7.aClass387_9962, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class432_Sub1_Sub1_Sub6) {
			Class432_Sub1_Sub1_Sub6 var8 = (Class432_Sub1_Sub1_Sub6) arg1;
			if (this.aClass387_9962 != null && var8.aClass387_9974 != null) {
				this.aClass387_9962.method4490(var8.aClass387_9974, arg2, arg3, arg4, arg5);
			}
		}
	}

	public Class348 method5386(Class_ra arg0) {
		Class260 var2 = this.method5346().aClass260_2606;
		if (this.aClass348_9960 == null) {
			this.aClass348_9960 = Class201_Sub2.method2171((int) var2.aFloat2716, (int) var2.aFloat2715, (int) var2.aFloat2711, this.method5546(arg0, 0, -2033893069), (byte) -46);
		}
		return this.aClass348_9960;
	}

	public int method5394() {
		return this.aClass387_9962 == null ? 0 : this.aClass387_9962.YA();
	}

	public void method5369(Class_ra arg0, Class432_Sub1 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (arg1 instanceof Class432_Sub1_Sub5_Sub1) {
			Class432_Sub1_Sub5_Sub1 var7 = (Class432_Sub1_Sub5_Sub1) arg1;
			if (this.aClass387_9962 != null && var7.aClass387_9962 != null) {
				this.aClass387_9962.method4490(var7.aClass387_9962, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class432_Sub1_Sub1_Sub6) {
			Class432_Sub1_Sub1_Sub6 var8 = (Class432_Sub1_Sub1_Sub6) arg1;
			if (this.aClass387_9962 != null && var8.aClass387_9974 != null) {
				this.aClass387_9962.method4490(var8.aClass387_9974, arg2, arg3, arg4, arg5);
			}
		}
	}

	public int method5364() {
		return this.aClass387_9962 == null ? 0 : this.aClass387_9962.YA();
	}

	public int method5366() {
		return this.aClass387_9962 == null ? 0 : this.aClass387_9962.YA();
	}

	public boolean method5389(Class_ra arg0, int arg1, int arg2) {
		Class387 var4 = this.method5546(arg0, 131072, -1656373047);
		if (var4 == null) {
			return false;
		} else {
			Class247 var5 = this.method5355();
			return var4.method4458(arg1, arg2, var5, false, 0);
		}
	}

	public int method5370(int arg0) {
		try {
			return this.aClass387_9962 == null ? 0 : this.aClass387_9962.YA();
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ya.bo(" + ')');
		}
	}

	public Class348 method5357(Class_ra arg0) {
		Class260 var2 = this.method5346().aClass260_2606;
		if (this.aClass348_9960 == null) {
			this.aClass348_9960 = Class201_Sub2.method2171((int) var2.aFloat2716, (int) var2.aFloat2715, (int) var2.aFloat2711, this.method5546(arg0, 0, -1760684843), (byte) -51);
		}
		return this.aClass348_9960;
	}

	public Class348 method5362(Class_ra arg0) {
		Class260 var2 = this.method5346().aClass260_2606;
		if (this.aClass348_9960 == null) {
			this.aClass348_9960 = Class201_Sub2.method2171((int) var2.aFloat2716, (int) var2.aFloat2715, (int) var2.aFloat2711, this.method5546(arg0, 0, -2129836909), (byte) -53);
		}
		return this.aClass348_9960;
	}

	public Class348 method5388(Class_ra arg0) {
		Class260 var2 = this.method5346().aClass260_2606;
		if (this.aClass348_9960 == null) {
			this.aClass348_9960 = Class201_Sub2.method2171((int) var2.aFloat2716, (int) var2.aFloat2715, (int) var2.aFloat2711, this.method5546(arg0, 0, -1880455783), (byte) 13);
		}
		return this.aClass348_9960;
	}

	public Class353 method5380(Class_ra arg0) {
		if (this.aClass387_9962 == null) {
			return null;
		} else {
			Class247 var2 = this.method5355();
			Class353 var3 = Class497.method6105(this.aBoolean9955, (byte) 16);
			this.aClass387_9962.method4475(var2, this.aClass80Array8656[0], 0);
			return var3;
		}
	}

	public void method5361(Class_ra arg0) {
	}

	public Class348 method5385(Class_ra arg0) {
		Class260 var2 = this.method5346().aClass260_2606;
		if (this.aClass348_9960 == null) {
			this.aClass348_9960 = Class201_Sub2.method2171((int) var2.aFloat2716, (int) var2.aFloat2715, (int) var2.aFloat2711, this.method5546(arg0, 0, -2030977374), (byte) -68);
		}
		return this.aClass348_9960;
	}

	public boolean method5390(Class_ra arg0, int arg1, int arg2) {
		Class387 var4 = this.method5546(arg0, 131072, -2057002282);
		if (var4 == null) {
			return false;
		} else {
			Class247 var5 = this.method5355();
			return var4.method4458(arg1, arg2, var5, false, 0);
		}
	}

	public boolean method5391() {
		return this.aBoolean9961;
	}

	public void method5387() {
		this.aBoolean9961 = false;
		if (this.aClass387_9962 != null) {
			this.aClass387_9962.KA(this.aClass387_9962.m() & 0xFFFEFFFF);
		}
	}

	public void method5384() {
		this.aBoolean9961 = false;
		if (this.aClass387_9962 != null) {
			this.aClass387_9962.KA(this.aClass387_9962.m() & 0xFFFEFFFF);
		}
	}

	public void method40(Class_ra arg0) {
		Object var2 = null;
		Class_na var3;
		if (this.aClass_na9950 == null && this.aBoolean9954) {
			Class485 var4 = this.method5545(arg0, 262144, true, (byte) 10);
			var3 = (Class_na) (var4 == null ? null : var4.anObject5823);
		} else {
			var3 = this.aClass_na9950;
			this.aClass_na9950 = null;
		}
		Class260 var5 = this.method5346().aClass260_2606;
		if (var3 != null) {
			this.aClass356_8655.method4167(var3, this.aByte8654, (int) var5.aFloat2716, (int) var5.aFloat2711, null, (byte) 65);
		}
	}

	public void method41(Class_ra arg0) {
		Object var2 = null;
		Class_na var3;
		if (this.aClass_na9950 == null && this.aBoolean9954) {
			Class485 var4 = this.method5545(arg0, 262144, true, (byte) -27);
			var3 = (Class_na) (var4 == null ? null : var4.anObject5823);
		} else {
			var3 = this.aClass_na9950;
			this.aClass_na9950 = null;
		}
		Class260 var5 = this.method5346().aClass260_2606;
		if (var3 != null) {
			this.aClass356_8655.method4167(var3, this.aByte8654, (int) var5.aFloat2716, (int) var5.aFloat2711, null, (byte) 70);
		}
	}

	public void method5392(Class_ra arg0, Class432_Sub1 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
		try {
			if (arg1 instanceof Class432_Sub1_Sub5_Sub1) {
				Class432_Sub1_Sub5_Sub1 var8 = (Class432_Sub1_Sub5_Sub1) arg1;
				if (this.aClass387_9962 != null && var8.aClass387_9962 != null) {
					this.aClass387_9962.method4490(var8.aClass387_9962, arg2, arg3, arg4, arg5);
				}
			} else if (arg1 instanceof Class432_Sub1_Sub1_Sub6) {
				Class432_Sub1_Sub1_Sub6 var10 = (Class432_Sub1_Sub1_Sub6) arg1;
				if (this.aClass387_9962 != null && var10.aClass387_9974 != null) {
					this.aClass387_9962.method4490(var10.aClass387_9974, arg2, arg3, arg4, arg5);
				}
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "ya.bz(" + ')');
		}
	}

	public void method5397(Class_ra arg0, Class432_Sub1 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (arg1 instanceof Class432_Sub1_Sub5_Sub1) {
			Class432_Sub1_Sub5_Sub1 var7 = (Class432_Sub1_Sub5_Sub1) arg1;
			if (this.aClass387_9962 != null && var7.aClass387_9962 != null) {
				this.aClass387_9962.method4490(var7.aClass387_9962, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class432_Sub1_Sub1_Sub6) {
			Class432_Sub1_Sub1_Sub6 var8 = (Class432_Sub1_Sub1_Sub6) arg1;
			if (this.aClass387_9962 != null && var8.aClass387_9974 != null) {
				this.aClass387_9962.method4490(var8.aClass387_9974, arg2, arg3, arg4, arg5);
			}
		}
	}

	public Class348 method5401(Class_ra arg0) {
		Class260 var2 = this.method5346().aClass260_2606;
		if (this.aClass348_9960 == null) {
			this.aClass348_9960 = Class201_Sub2.method2171((int) var2.aFloat2716, (int) var2.aFloat2715, (int) var2.aFloat2711, this.method5546(arg0, 0, -1937263081), (byte) 38);
		}
		return this.aClass348_9960;
	}

	public boolean method5378() {
		return this.aClass387_9962 == null ? false : this.aClass387_9962.i();
	}

	public int method21(int arg0) {
		try {
			return this.aByte9958;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ya.j(" + ')');
		}
	}

	public static Class468 method5547(int arg0) {
		try {
			return Class357.aClass468_3702 == null ? Class468.aClass468_6861 : Class357.aClass468_3702;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "ya.w(" + ')');
		}
	}

	public static final void method5548(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.aClass286Array9234[var2].method2869(-570443529);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ya.yg(" + ')');
		}
	}

	public static final void method5549(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[arg0.anInt4376 - 1] = arg0.aClass330_Sub39_4395.method3547((byte) -59)[arg0.anIntArray4387[arg0.anInt4376 - 1]];
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ya.ym(" + ')');
		}
	}
}
