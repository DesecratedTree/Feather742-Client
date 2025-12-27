package deob;

public class Class432_Sub1_Sub1_Sub6 extends Class432_Sub1_Sub1 implements Interface2 {

	public Class463 aClass463_9965;

	public int anInt9968;

	public boolean aBoolean9971;

	public byte aByte9969;

	public byte aByte9970;

	public boolean aBoolean9967;

	public boolean aBoolean9972;

	public boolean aBoolean9973;

	public Class387 aClass387_9974;

	public Class_na aClass_na9966;

	public Class348 aClass348_9964;

	public boolean method5382(int arg0) {
		try {
			if (this.aClass387_9974 == null) {
				return true;
			} else {
				return !this.aClass387_9974.u();
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "yc.ao(" + ')');
		}
	}

	public boolean method5395(int arg0) {
		try {
			return this.aClass387_9974 == null ? false : this.aClass387_9974.i();
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "yc.bg(" + ')');
		}
	}

	public int method5370(int arg0) {
		try {
			return this.aClass387_9974 == null ? 0 : this.aClass387_9974.YA();
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "yc.bo(" + ')');
		}
	}

	public Class485 method5511(Class_ra arg0, int arg1, boolean arg2, int arg3) {
		try {
			Class473 var5 = this.aClass463_9965.method5705(this.anInt9968, (byte) -21);
			Class_xa var6;
			Class_xa var7;
			if (this.aBoolean9971) {
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
			return var5.method5897(arg0, arg1, Class476.aClass476_6878.anInt6882 == this.aByte9969 ? Class476.aClass476_6898.anInt6882 : this.aByte9969, Class476.aClass476_6878.anInt6882 == this.aByte9969 ? this.aByte9970 + 4 : this.aByte9970, var6, var7, (int) var8.aFloat2716, (int) var8.aFloat2715, (int) var8.aFloat2711, arg2, null, (byte) -32);
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "yc.bn(" + ')');
		}
	}

	public Class348 method5383(Class_ra arg0, int arg1) {
		try {
			Class260 var3 = this.method5346().aClass260_2606;
			if (this.aClass348_9964 == null) {
				this.aClass348_9964 = Class201_Sub2.method2171((int) var3.aFloat2716, (int) var3.aFloat2715, (int) var3.aFloat2711, this.method5513(arg0, 0, (byte) -26), (byte) 10);
			}
			return this.aClass348_9964;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "yc.bt(" + ')');
		}
	}

	public Class353 method5405(Class_ra arg0, int arg1) {
		try {
			if (this.aClass387_9974 == null) {
				return null;
			} else {
				Class247 var3 = this.method5355();
				Class353 var4 = Class497.method6105(this.aBoolean9967, (byte) 16);
				this.aClass387_9974.method4475(var3, this.aClass80Array8656[0], 0);
				return var4;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "yc.bf(" + ')');
		}
	}

	public boolean method5358(Class_ra arg0, int arg1, int arg2, int arg3) {
		try {
			Class387 var5 = this.method5513(arg0, 131072, (byte) -69);
			if (var5 == null) {
				return false;
			} else {
				Class247 var6 = this.method5355();
				return var5.method4458(arg1, arg2, var6, false, 0);
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "yc.br(" + ')');
		}
	}

	public void method5361(Class_ra arg0) {
	}

	public void method5392(Class_ra arg0, Class432_Sub1 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
		try {
			if (arg1 instanceof Class432_Sub1_Sub5_Sub1) {
				Class432_Sub1_Sub5_Sub1 var8 = (Class432_Sub1_Sub5_Sub1) arg1;
				if (this.aClass387_9974 != null && var8.aClass387_9962 != null) {
					this.aClass387_9974.method4490(var8.aClass387_9962, arg2, arg3, arg4, arg5);
				}
			} else if (arg1 instanceof Class432_Sub1_Sub1_Sub6) {
				Class432_Sub1_Sub1_Sub6 var10 = (Class432_Sub1_Sub1_Sub6) arg1;
				if (this.aClass387_9974 != null && var10.aClass387_9974 != null) {
					this.aClass387_9974.method4490(var10.aClass387_9974, arg2, arg3, arg4, arg5);
				}
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "yc.bz(" + ')');
		}
	}

	public void method5393(int arg0) {
		try {
			this.aBoolean9972 = false;
			if (this.aClass387_9974 != null) {
				this.aClass387_9974.KA(this.aClass387_9974.m() & 0xFFFEFFFF);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "yc.be(" + ')');
		}
	}

	public int method34(short arg0) {
		try {
			return this.anInt9968;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "yc.r(" + ')');
		}
	}

	public int method21(int arg0) {
		try {
			return this.aByte9969;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "yc.j(" + ')');
		}
	}

	public int method33(byte arg0) {
		try {
			return this.aByte9970;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "yc.i(" + ')');
		}
	}

	public void method23(int arg0) {
		try {
			if (this.aClass387_9974 != null) {
				this.aClass387_9974.method4479();
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "yc.p(" + ')');
		}
	}

	public boolean method31(int arg0) {
		try {
			return this.aBoolean9973;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "yc.o(" + ')');
		}
	}

	public void method25(Class_ra arg0, int arg1) {
		try {
			Object var3 = null;
			Class_na var4;
			if (this.aClass_na9966 == null && this.aBoolean9973) {
				Class485 var5 = this.method5511(arg0, 262144, true, 2144404482);
				var4 = (Class_na) (var5 == null ? null : var5.anObject5823);
			} else {
				var4 = this.aClass_na9966;
				this.aClass_na9966 = null;
			}
			Class260 var7 = this.method5346().aClass260_2606;
			if (var4 != null) {
				this.aClass356_8655.method4185(var4, this.aByte8654, (int) var7.aFloat2716, (int) var7.aFloat2711, null, (byte) -71);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "yc.s(" + ')');
		}
	}

	public void method26(Class_ra arg0, int arg1) {
		try {
			Object var3 = null;
			Class_na var4;
			if (this.aClass_na9966 == null && this.aBoolean9973) {
				Class485 var5 = this.method5511(arg0, 262144, true, 273301998);
				var4 = (Class_na) (var5 == null ? null : var5.anObject5823);
			} else {
				var4 = this.aClass_na9966;
				this.aClass_na9966 = null;
			}
			Class260 var7 = this.method5346().aClass260_2606;
			if (var4 != null) {
				this.aClass356_8655.method4167(var4, this.aByte8654, (int) var7.aFloat2716, (int) var7.aFloat2711, null, (byte) 75);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "yc.f(" + ')');
		}
	}

	public boolean method5360(short arg0) {
		try {
			return this.aBoolean9972;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "yc.bi(" + ')');
		}
	}

	public int method27() {
		return this.anInt9968 * -311559079 * -708211735;
	}

	public int method28() {
		return this.aByte9969;
	}

	public Class353 method5380(Class_ra arg0) {
		if (this.aClass387_9974 == null) {
			return null;
		} else {
			Class247 var2 = this.method5355();
			Class353 var3 = Class497.method6105(this.aBoolean9967, (byte) 16);
			this.aClass387_9974.method4475(var2, this.aClass80Array8656[0], 0);
			return var3;
		}
	}

	public int method24() {
		return this.aByte9970;
	}

	public boolean method5389(Class_ra arg0, int arg1, int arg2) {
		Class387 var4 = this.method5513(arg0, 131072, (byte) -70);
		if (var4 == null) {
			return false;
		} else {
			Class247 var5 = this.method5355();
			return var4.method4458(arg1, arg2, var5, false, 0);
		}
	}

	public void method32() {
		if (this.aClass387_9974 != null) {
			this.aClass387_9974.method4479();
		}
	}

	public void method20() {
		if (this.aClass387_9974 != null) {
			this.aClass387_9974.method4479();
		}
	}

	public void method38(Class_ra arg0) {
		Object var2 = null;
		Class_na var3;
		if (this.aClass_na9966 == null && this.aBoolean9973) {
			Class485 var4 = this.method5511(arg0, 262144, true, -864801136);
			var3 = (Class_na) (var4 == null ? null : var4.anObject5823);
		} else {
			var3 = this.aClass_na9966;
			this.aClass_na9966 = null;
		}
		Class260 var5 = this.method5346().aClass260_2606;
		if (var3 != null) {
			this.aClass356_8655.method4185(var3, this.aByte8654, (int) var5.aFloat2716, (int) var5.aFloat2711, null, (byte) -72);
		}
	}

	public boolean method5378() {
		return this.aClass387_9974 == null ? false : this.aClass387_9974.i();
	}

	public boolean method36() {
		return this.aBoolean9973;
	}

	public void method37(Class_ra arg0) {
		Object var2 = null;
		Class_na var3;
		if (this.aClass_na9966 == null && this.aBoolean9973) {
			Class485 var4 = this.method5511(arg0, 262144, true, -1084533347);
			var3 = (Class_na) (var4 == null ? null : var4.anObject5823);
		} else {
			var3 = this.aClass_na9966;
			this.aClass_na9966 = null;
		}
		Class260 var5 = this.method5346().aClass260_2606;
		if (var3 != null) {
			this.aClass356_8655.method4185(var3, this.aByte8654, (int) var5.aFloat2716, (int) var5.aFloat2711, null, (byte) 36);
		}
	}

	public int method5512(int arg0) {
		try {
			return this.aClass387_9974 == null ? 15 : this.aClass387_9974.N() / 4;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "yc.bu(" + ')');
		}
	}

	public boolean method22() {
		return this.aBoolean9973;
	}

	public void method35(Class_ra arg0) {
		Object var2 = null;
		Class_na var3;
		if (this.aClass_na9966 == null && this.aBoolean9973) {
			Class485 var4 = this.method5511(arg0, 262144, true, 461681657);
			var3 = (Class_na) (var4 == null ? null : var4.anObject5823);
		} else {
			var3 = this.aClass_na9966;
			this.aClass_na9966 = null;
		}
		Class260 var5 = this.method5346().aClass260_2606;
		if (var3 != null) {
			this.aClass356_8655.method4185(var3, this.aByte8654, (int) var5.aFloat2716, (int) var5.aFloat2711, null, (byte) 18);
		}
	}

	public boolean method5375() {
		if (this.aClass387_9974 == null) {
			return true;
		} else {
			return !this.aClass387_9974.u();
		}
	}

	public boolean method5376() {
		if (this.aClass387_9974 == null) {
			return true;
		} else {
			return !this.aClass387_9974.u();
		}
	}

	public boolean method5377() {
		return this.aClass387_9974 == null ? false : this.aClass387_9974.i();
	}

	public void method41(Class_ra arg0) {
		Object var2 = null;
		Class_na var3;
		if (this.aClass_na9966 == null && this.aBoolean9973) {
			Class485 var4 = this.method5511(arg0, 262144, true, 1647707379);
			var3 = (Class_na) (var4 == null ? null : var4.anObject5823);
		} else {
			var3 = this.aClass_na9966;
			this.aClass_na9966 = null;
		}
		Class260 var5 = this.method5346().aClass260_2606;
		if (var3 != null) {
			this.aClass356_8655.method4167(var3, this.aByte8654, (int) var5.aFloat2716, (int) var5.aFloat2711, null, (byte) 7);
		}
	}

	public boolean method5379() {
		return this.aClass387_9974 == null ? false : this.aClass387_9974.i();
	}

	public void method5369(Class_ra arg0, Class432_Sub1 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (arg1 instanceof Class432_Sub1_Sub5_Sub1) {
			Class432_Sub1_Sub5_Sub1 var7 = (Class432_Sub1_Sub5_Sub1) arg1;
			if (this.aClass387_9974 != null && var7.aClass387_9962 != null) {
				this.aClass387_9974.method4490(var7.aClass387_9962, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class432_Sub1_Sub1_Sub6) {
			Class432_Sub1_Sub1_Sub6 var8 = (Class432_Sub1_Sub1_Sub6) arg1;
			if (this.aClass387_9974 != null && var8.aClass387_9974 != null) {
				this.aClass387_9974.method4490(var8.aClass387_9974, arg2, arg3, arg4, arg5);
			}
		}
	}

	public boolean method5374() {
		if (this.aClass387_9974 == null) {
			return true;
		} else {
			return !this.aClass387_9974.u();
		}
	}

	public int method5381() {
		return this.aClass387_9974 == null ? 0 : this.aClass387_9974.YA();
	}

	public int method5366() {
		return this.aClass387_9974 == null ? 0 : this.aClass387_9974.YA();
	}

	public Class348 method5401(Class_ra arg0) {
		Class260 var2 = this.method5346().aClass260_2606;
		if (this.aClass348_9964 == null) {
			this.aClass348_9964 = Class201_Sub2.method2171((int) var2.aFloat2716, (int) var2.aFloat2715, (int) var2.aFloat2711, this.method5513(arg0, 0, (byte) -20), (byte) 74);
		}
		return this.aClass348_9964;
	}

	public Class348 method5357(Class_ra arg0) {
		Class260 var2 = this.method5346().aClass260_2606;
		if (this.aClass348_9964 == null) {
			this.aClass348_9964 = Class201_Sub2.method2171((int) var2.aFloat2716, (int) var2.aFloat2715, (int) var2.aFloat2711, this.method5513(arg0, 0, (byte) -37), (byte) 73);
		}
		return this.aClass348_9964;
	}

	public void method5384() {
		this.aBoolean9972 = false;
		if (this.aClass387_9974 != null) {
			this.aClass387_9974.KA(this.aClass387_9974.m() & 0xFFFEFFFF);
		}
	}

	public Class348 method5386(Class_ra arg0) {
		Class260 var2 = this.method5346().aClass260_2606;
		if (this.aClass348_9964 == null) {
			this.aClass348_9964 = Class201_Sub2.method2171((int) var2.aFloat2716, (int) var2.aFloat2715, (int) var2.aFloat2711, this.method5513(arg0, 0, (byte) -78), (byte) -55);
		}
		return this.aClass348_9964;
	}

	public Class348 method5362(Class_ra arg0) {
		Class260 var2 = this.method5346().aClass260_2606;
		if (this.aClass348_9964 == null) {
			this.aClass348_9964 = Class201_Sub2.method2171((int) var2.aFloat2716, (int) var2.aFloat2715, (int) var2.aFloat2711, this.method5513(arg0, 0, (byte) -76), (byte) 74);
		}
		return this.aClass348_9964;
	}

	public Class348 method5388(Class_ra arg0) {
		Class260 var2 = this.method5346().aClass260_2606;
		if (this.aClass348_9964 == null) {
			this.aClass348_9964 = Class201_Sub2.method2171((int) var2.aFloat2716, (int) var2.aFloat2715, (int) var2.aFloat2711, this.method5513(arg0, 0, (byte) -71), (byte) -39);
		}
		return this.aClass348_9964;
	}

	public void method5404(Class_ra arg0, int arg1) {
	}

	public int method5364() {
		return this.aClass387_9974 == null ? 0 : this.aClass387_9974.YA();
	}

	public int method39() {
		return this.aByte9970;
	}

	public boolean method5390(Class_ra arg0, int arg1, int arg2) {
		Class387 var4 = this.method5513(arg0, 131072, (byte) -92);
		if (var4 == null) {
			return false;
		} else {
			Class247 var5 = this.method5355();
			return var4.method4458(arg1, arg2, var5, false, 0);
		}
	}

	public boolean method5391() {
		return this.aBoolean9972;
	}

	public Class348 method5385(Class_ra arg0) {
		Class260 var2 = this.method5346().aClass260_2606;
		if (this.aClass348_9964 == null) {
			this.aClass348_9964 = Class201_Sub2.method2171((int) var2.aFloat2716, (int) var2.aFloat2715, (int) var2.aFloat2711, this.method5513(arg0, 0, (byte) -27), (byte) 10);
		}
		return this.aClass348_9964;
	}

	public Class432_Sub1_Sub1_Sub6(Class356 arg0, Class_ra arg1, Class463 arg2, Class473 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, boolean arg16) {
		super(arg0, arg4, arg5, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg3.anInt5640 == 1, Class447.method5627(arg14, arg15, (byte) -98));
		this.aClass463_9965 = arg2;
		this.anInt9968 = arg3.anInt5657;
		this.aByte8654 = (byte) arg5;
		this.aBoolean9971 = arg9;
		this.aByte9969 = (byte) arg14;
		this.aByte9970 = (byte) arg15;
		this.aBoolean9967 = arg3.anInt5637 != 0 && !arg9;
		this.aBoolean9972 = arg16;
		this.aBoolean9973 = arg1.y() && arg3.aBoolean5685 && !this.aBoolean9971 && Class448.aClass330_Sub50_5555.aClass464_Sub28_7885.method5837(624994758) != 0;
		int var18 = 2048;
		if (this.aBoolean9972) {
			var18 |= 0x10000;
		}
		if (arg3.aBoolean5683) {
			var18 |= 0x80000;
		}
		Class485 var19 = this.method5511(arg1, var18, this.aBoolean9973, 2010925701);
		if (var19 != null) {
			this.aClass387_9974 = (Class387) var19.anObject5824;
			this.aClass_na9966 = (Class_na) var19.anObject5823;
			if (this.aBoolean9972 || arg3.aBoolean5683) {
				this.aClass387_9974 = this.aClass387_9974.method4446((byte) 0, var18, false);
				if (arg3.aBoolean5683) {
					Class312 var20 = client.aClass304_9030.method3027((byte) -58);
					this.aClass387_9974.PA(var20.anInt3250, var20.anInt3248, var20.anInt3249, var20.anInt3247);
				}
			}
		}
		this.method5373(1, 1096281109);
	}

	public void method40(Class_ra arg0) {
		Object var2 = null;
		Class_na var3;
		if (this.aClass_na9966 == null && this.aBoolean9973) {
			Class485 var4 = this.method5511(arg0, 262144, true, 2126445631);
			var3 = (Class_na) (var4 == null ? null : var4.anObject5823);
		} else {
			var3 = this.aClass_na9966;
			this.aClass_na9966 = null;
		}
		Class260 var5 = this.method5346().aClass260_2606;
		if (var3 != null) {
			this.aClass356_8655.method4167(var3, this.aByte8654, (int) var5.aFloat2716, (int) var5.aFloat2711, null, (byte) 124);
		}
	}

	public int method5394() {
		return this.aClass387_9974 == null ? 0 : this.aClass387_9974.YA();
	}

	public int method29() {
		return this.aByte9969;
	}

	public Class387 method5513(Class_ra arg0, int arg1, byte arg2) {
		try {
			if (this.aClass387_9974 != null && arg0.ct(this.aClass387_9974.m(), arg1) == 0) {
				return this.aClass387_9974;
			} else {
				Class485 var4 = this.method5511(arg0, arg1, false, 273627868);
				return var4 == null ? null : (Class387) var4.anObject5824;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "yc.bk(" + ')');
		}
	}

	public void method5387() {
		this.aBoolean9972 = false;
		if (this.aClass387_9974 != null) {
			this.aClass387_9974.KA(this.aClass387_9974.m() & 0xFFFEFFFF);
		}
	}

	public void method5396(Class_ra arg0, Class432_Sub1 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (arg1 instanceof Class432_Sub1_Sub5_Sub1) {
			Class432_Sub1_Sub5_Sub1 var7 = (Class432_Sub1_Sub5_Sub1) arg1;
			if (this.aClass387_9974 != null && var7.aClass387_9962 != null) {
				this.aClass387_9974.method4490(var7.aClass387_9962, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class432_Sub1_Sub1_Sub6) {
			Class432_Sub1_Sub1_Sub6 var8 = (Class432_Sub1_Sub1_Sub6) arg1;
			if (this.aClass387_9974 != null && var8.aClass387_9974 != null) {
				this.aClass387_9974.method4490(var8.aClass387_9974, arg2, arg3, arg4, arg5);
			}
		}
	}

	public void method5397(Class_ra arg0, Class432_Sub1 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (arg1 instanceof Class432_Sub1_Sub5_Sub1) {
			Class432_Sub1_Sub5_Sub1 var7 = (Class432_Sub1_Sub5_Sub1) arg1;
			if (this.aClass387_9974 != null && var7.aClass387_9962 != null) {
				this.aClass387_9974.method4490(var7.aClass387_9962, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class432_Sub1_Sub1_Sub6) {
			Class432_Sub1_Sub1_Sub6 var8 = (Class432_Sub1_Sub1_Sub6) arg1;
			if (this.aClass387_9974 != null && var8.aClass387_9974 != null) {
				this.aClass387_9974.method4490(var8.aClass387_9974, arg2, arg3, arg4, arg5);
			}
		}
	}

	public boolean method30() {
		return this.aBoolean9973;
	}

	public static void method5514(int arg0, int arg1) {
		try {
			for (Class330 var2 = client.aClass497_9211.method6099((byte) 39); var2 != null; var2 = client.aClass497_9211.method6098((short) -32768)) {
				if ((var2.aLong3341 >> 48 & 0xFFFFL) == (long) arg0) {
					var2.method3252(-483664394);
				}
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "yc.mp(" + ')');
		}
	}

	public static final void method5515(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4394[arg0.anInt4397];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class158.aClass561_6474.anIntArray6980[var2];
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "yc.e(" + ')');
		}
	}

	public static void method5516(IComponentDefinitions arg0, int arg1, int arg2, byte arg3) {
		try {
			Class122 var4 = arg0.method1396(Class361.aClass_ra3793, (byte) -11);
			if (var4 != null) {
				Class361.aClass_ra3793.r(arg1, arg2, arg0.anInt1210 + arg1, arg2 + arg0.anInt1348);
				if (Class9.anInt140 < 3) {
					int var5;
					if (Class147.anInt1621 == 2) {
						var5 = (int) ((double) Class401_Sub1.aClass145_Sub1_8249.method1713(436623662) * 2607.5945876176133D);
					} else {
						var5 = (int) -client.aFloat9141;
					}
					var5 = client.anInt9149 * 2 + var5 & 0x3FFF;
					var5 <<= 0x2;
					Class116.aClass61_1376.method698((float) arg0.anInt1210 / 2.0F + (float) arg1, (float) arg2 + (float) arg0.anInt1348 / 2.0F, 4449, var5, var4.aClass_ta1408, arg1, arg2);
				} else {
					Class361.aClass_ra3793.DA(-16777216, var4.aClass_ta1408, arg1, arg2);
				}
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "yc.mt(" + ')');
		}
	}
}
