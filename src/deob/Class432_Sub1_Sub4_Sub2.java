package deob;

public class Class432_Sub1_Sub4_Sub2 extends Class432_Sub1_Sub4 implements Interface2 {

	public Class463 aClass463_10000;

	public int anInt9995;

	public boolean aBoolean9997;

	public byte aByte9999;

	public boolean aBoolean9998;

	public boolean aBoolean9991;

	public boolean aBoolean9996;

	public Class387 aClass387_9992;

	public Class_na aClass_na9993;

	public static int anInt10001;

	public Class348 aClass348_9994;

	public void method5369(Class_ra arg0, Class432_Sub1 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (arg1 instanceof Class432_Sub1_Sub4_Sub2) {
			Class432_Sub1_Sub4_Sub2 var7 = (Class432_Sub1_Sub4_Sub2) arg1;
			if (this.aClass387_9992 != null && var7.aClass387_9992 != null) {
				this.aClass387_9992.method4490(var7.aClass387_9992, arg2, arg3, arg4, arg5);
			}
		}
	}

	public boolean method5382(int arg0) {
		try {
			if (this.aClass387_9992 == null) {
				return true;
			} else {
				return !this.aClass387_9992.u();
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ys.ao(" + ')');
		}
	}

	public boolean method5395(int arg0) {
		try {
			return this.aClass387_9992 == null ? false : this.aClass387_9992.i();
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ys.bg(" + ')');
		}
	}

	public int method39() {
		return this.aByte9999;
	}

	public Class387 method5541(Class_ra arg0, int arg1, int arg2) {
		try {
			if (this.aClass387_9992 != null && arg0.ct(this.aClass387_9992.m(), arg1) == 0) {
				return this.aClass387_9992;
			} else {
				Class485 var4 = this.method5542(arg0, arg1, false, -1836358889);
				return var4 == null ? null : (Class387) var4.anObject5824;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ys.bs(" + ')');
		}
	}

	public Class485 method5542(Class_ra arg0, int arg1, boolean arg2, int arg3) {
		try {
			Class473 var5 = this.aClass463_10000.method5705(this.anInt9995, (byte) -122);
			Class_xa var6;
			Class_xa var7;
			if (this.aBoolean9997) {
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
			return var5.method5897(arg0, arg1, Class476.aClass476_6900.anInt6882, this.aByte9999, var6, var7, (int) var8.aFloat2716, (int) var8.aFloat2715, (int) var8.aFloat2711, arg2, null, (byte) -87);
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "ys.bk(" + ')');
		}
	}

	public Class348 method5383(Class_ra arg0, int arg1) {
		try {
			Class260 var3 = this.method5346().aClass260_2606;
			if (this.aClass348_9994 == null) {
				this.aClass348_9994 = Class201_Sub2.method2171((int) var3.aFloat2716, (int) var3.aFloat2715, (int) var3.aFloat2711, this.method5541(arg0, 0, -1337894225), (byte) 24);
			}
			return this.aClass348_9994;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ys.bt(" + ')');
		}
	}

	public Class353 method5405(Class_ra arg0, int arg1) {
		try {
			if (this.aClass387_9992 == null) {
				return null;
			} else {
				Class247 var3 = this.method5355();
				Class353 var4 = Class497.method6105(this.aBoolean9998, (byte) 16);
				this.aClass387_9992.method4475(var3, this.aClass80Array8656[0], 0);
				return var4;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ys.bf(" + ')');
		}
	}

	public boolean method5374() {
		if (this.aClass387_9992 == null) {
			return true;
		} else {
			return !this.aClass387_9992.u();
		}
	}

	public int method5394() {
		return this.aClass387_9992 == null ? 0 : this.aClass387_9992.YA();
	}

	public boolean method5360(short arg0) {
		try {
			return this.aBoolean9991;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ys.bi(" + ')');
		}
	}

	public void method5392(Class_ra arg0, Class432_Sub1 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
		try {
			if (arg1 instanceof Class432_Sub1_Sub4_Sub2) {
				Class432_Sub1_Sub4_Sub2 var8 = (Class432_Sub1_Sub4_Sub2) arg1;
				if (this.aClass387_9992 != null && var8.aClass387_9992 != null) {
					this.aClass387_9992.method4490(var8.aClass387_9992, arg2, arg3, arg4, arg5);
				}
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "ys.bz(" + ')');
		}
	}

	public void method25(Class_ra arg0, int arg1) {
		try {
			Object var3 = null;
			Class_na var4;
			if (this.aClass_na9993 == null && this.aBoolean9996) {
				Class485 var5 = this.method5542(arg0, 262144, true, -99363422);
				var4 = (Class_na) (var5 == null ? null : var5.anObject5823);
			} else {
				var4 = this.aClass_na9993;
				this.aClass_na9993 = null;
			}
			Class260 var7 = this.method5346().aClass260_2606;
			if (var4 != null) {
				this.aClass356_8655.method4185(var4, this.aByte8654, (int) var7.aFloat2716, (int) var7.aFloat2711, null, (byte) 9);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ys.s(" + ')');
		}
	}

	public int method34(short arg0) {
		try {
			return this.anInt9995;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ys.r(" + ')');
		}
	}

	public int method33(byte arg0) {
		try {
			return this.aByte9999;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ys.i(" + ')');
		}
	}

	public void method5404(Class_ra arg0, int arg1) {
	}

	public void method23(int arg0) {
		try {
			if (this.aClass387_9992 != null) {
				this.aClass387_9992.method4479();
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ys.p(" + ')');
		}
	}

	public boolean method31(int arg0) {
		try {
			return this.aBoolean9996;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ys.o(" + ')');
		}
	}

	public Class348 method5401(Class_ra arg0) {
		Class260 var2 = this.method5346().aClass260_2606;
		if (this.aClass348_9994 == null) {
			this.aClass348_9994 = Class201_Sub2.method2171((int) var2.aFloat2716, (int) var2.aFloat2715, (int) var2.aFloat2711, this.method5541(arg0, 0, -1333639920), (byte) -1);
		}
		return this.aClass348_9994;
	}

	public boolean method5375() {
		if (this.aClass387_9992 == null) {
			return true;
		} else {
			return !this.aClass387_9992.u();
		}
	}

	public int method27() {
		return this.anInt9995 * -1888651679 * -2117489247;
	}

	public int method28() {
		return Class476.aClass476_6900.anInt6882 * -266033331 * -344921723;
	}

	public int method29() {
		return Class476.aClass476_6900.anInt6882 * -266033331 * -344921723;
	}

	public int method24() {
		return this.aByte9999;
	}

	public void method40(Class_ra arg0) {
		Object var2 = null;
		Class_na var3;
		if (this.aClass_na9993 == null && this.aBoolean9996) {
			Class485 var4 = this.method5542(arg0, 262144, true, -1566260123);
			var3 = (Class_na) (var4 == null ? null : var4.anObject5823);
		} else {
			var3 = this.aClass_na9993;
			this.aClass_na9993 = null;
		}
		Class260 var5 = this.method5346().aClass260_2606;
		if (var3 != null) {
			this.aClass356_8655.method4167(var3, this.aByte8654, (int) var5.aFloat2716, (int) var5.aFloat2711, null, (byte) 56);
		}
	}

	public void method32() {
		if (this.aClass387_9992 != null) {
			this.aClass387_9992.method4479();
		}
	}

	public int method5381() {
		return this.aClass387_9992 == null ? 0 : this.aClass387_9992.YA();
	}

	public boolean method30() {
		return this.aBoolean9996;
	}

	public boolean method22() {
		return this.aBoolean9996;
	}

	public void method5397(Class_ra arg0, Class432_Sub1 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (arg1 instanceof Class432_Sub1_Sub4_Sub2) {
			Class432_Sub1_Sub4_Sub2 var7 = (Class432_Sub1_Sub4_Sub2) arg1;
			if (this.aClass387_9992 != null && var7.aClass387_9992 != null) {
				this.aClass387_9992.method4490(var7.aClass387_9992, arg2, arg3, arg4, arg5);
			}
		}
	}

	public void method37(Class_ra arg0) {
		Object var2 = null;
		Class_na var3;
		if (this.aClass_na9993 == null && this.aBoolean9996) {
			Class485 var4 = this.method5542(arg0, 262144, true, -1381249531);
			var3 = (Class_na) (var4 == null ? null : var4.anObject5823);
		} else {
			var3 = this.aClass_na9993;
			this.aClass_na9993 = null;
		}
		Class260 var5 = this.method5346().aClass260_2606;
		if (var3 != null) {
			this.aClass356_8655.method4185(var3, this.aByte8654, (int) var5.aFloat2716, (int) var5.aFloat2711, null, (byte) -27);
		}
	}

	public int method21(int arg0) {
		try {
			return Class476.aClass476_6900.anInt6882;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ys.j(" + ')');
		}
	}

	public void method20() {
		if (this.aClass387_9992 != null) {
			this.aClass387_9992.method4479();
		}
	}

	public void method5393(int arg0) {
		try {
			this.aBoolean9991 = false;
			if (this.aClass387_9992 != null) {
				this.aClass387_9992.KA(this.aClass387_9992.m() & 0xFFFEFFFF);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ys.be(" + ')');
		}
	}

	public void method5361(Class_ra arg0) {
	}

	public boolean method5376() {
		if (this.aClass387_9992 == null) {
			return true;
		} else {
			return !this.aClass387_9992.u();
		}
	}

	public boolean method5377() {
		return this.aClass387_9992 == null ? false : this.aClass387_9992.i();
	}

	public boolean method5378() {
		return this.aClass387_9992 == null ? false : this.aClass387_9992.i();
	}

	public boolean method5379() {
		return this.aClass387_9992 == null ? false : this.aClass387_9992.i();
	}

	public Class348 method5357(Class_ra arg0) {
		Class260 var2 = this.method5346().aClass260_2606;
		if (this.aClass348_9994 == null) {
			this.aClass348_9994 = Class201_Sub2.method2171((int) var2.aFloat2716, (int) var2.aFloat2715, (int) var2.aFloat2711, this.method5541(arg0, 0, -1323777278), (byte) 71);
		}
		return this.aClass348_9994;
	}

	public boolean method36() {
		return this.aBoolean9996;
	}

	public int method5364() {
		return this.aClass387_9992 == null ? 0 : this.aClass387_9992.YA();
	}

	public int method5366() {
		return this.aClass387_9992 == null ? 0 : this.aClass387_9992.YA();
	}

	public int method5370(int arg0) {
		try {
			return this.aClass387_9992 == null ? 0 : this.aClass387_9992.YA();
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ys.bo(" + ')');
		}
	}

	public void method35(Class_ra arg0) {
		Object var2 = null;
		Class_na var3;
		if (this.aClass_na9993 == null && this.aBoolean9996) {
			Class485 var4 = this.method5542(arg0, 262144, true, -1174581762);
			var3 = (Class_na) (var4 == null ? null : var4.anObject5823);
		} else {
			var3 = this.aClass_na9993;
			this.aClass_na9993 = null;
		}
		Class260 var5 = this.method5346().aClass260_2606;
		if (var3 != null) {
			this.aClass356_8655.method4185(var3, this.aByte8654, (int) var5.aFloat2716, (int) var5.aFloat2711, null, (byte) 6);
		}
	}

	public Class348 method5386(Class_ra arg0) {
		Class260 var2 = this.method5346().aClass260_2606;
		if (this.aClass348_9994 == null) {
			this.aClass348_9994 = Class201_Sub2.method2171((int) var2.aFloat2716, (int) var2.aFloat2715, (int) var2.aFloat2711, this.method5541(arg0, 0, 102764209), (byte) 6);
		}
		return this.aClass348_9994;
	}

	public Class348 method5362(Class_ra arg0) {
		Class260 var2 = this.method5346().aClass260_2606;
		if (this.aClass348_9994 == null) {
			this.aClass348_9994 = Class201_Sub2.method2171((int) var2.aFloat2716, (int) var2.aFloat2715, (int) var2.aFloat2711, this.method5541(arg0, 0, -2140913453), (byte) 34);
		}
		return this.aClass348_9994;
	}

	public Class348 method5388(Class_ra arg0) {
		Class260 var2 = this.method5346().aClass260_2606;
		if (this.aClass348_9994 == null) {
			this.aClass348_9994 = Class201_Sub2.method2171((int) var2.aFloat2716, (int) var2.aFloat2715, (int) var2.aFloat2711, this.method5541(arg0, 0, -575532409), (byte) 50);
		}
		return this.aClass348_9994;
	}

	public Class353 method5380(Class_ra arg0) {
		if (this.aClass387_9992 == null) {
			return null;
		} else {
			Class247 var2 = this.method5355();
			Class353 var3 = Class497.method6105(this.aBoolean9998, (byte) 16);
			this.aClass387_9992.method4475(var2, this.aClass80Array8656[0], 0);
			return var3;
		}
	}

	public Class348 method5385(Class_ra arg0) {
		Class260 var2 = this.method5346().aClass260_2606;
		if (this.aClass348_9994 == null) {
			this.aClass348_9994 = Class201_Sub2.method2171((int) var2.aFloat2716, (int) var2.aFloat2715, (int) var2.aFloat2711, this.method5541(arg0, 0, -1598369893), (byte) -39);
		}
		return this.aClass348_9994;
	}

	public void method26(Class_ra arg0, int arg1) {
		try {
			Object var3 = null;
			Class_na var4;
			if (this.aClass_na9993 == null && this.aBoolean9996) {
				Class485 var5 = this.method5542(arg0, 262144, true, -778317483);
				var4 = (Class_na) (var5 == null ? null : var5.anObject5823);
			} else {
				var4 = this.aClass_na9993;
				this.aClass_na9993 = null;
			}
			Class260 var7 = this.method5346().aClass260_2606;
			if (var4 != null) {
				this.aClass356_8655.method4167(var4, this.aByte8654, (int) var7.aFloat2716, (int) var7.aFloat2711, null, (byte) 103);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ys.f(" + ')');
		}
	}

	public boolean method5390(Class_ra arg0, int arg1, int arg2) {
		Class387 var4 = this.method5541(arg0, 131072, -1036456960);
		if (var4 == null) {
			return false;
		} else {
			Class247 var5 = this.method5355();
			return var4.method4458(arg1, arg2, var5, false, 0);
		}
	}

	public boolean method5391() {
		return this.aBoolean9991;
	}

	public void method5387() {
		this.aBoolean9991 = false;
		if (this.aClass387_9992 != null) {
			this.aClass387_9992.KA(this.aClass387_9992.m() & 0xFFFEFFFF);
		}
	}

	public void method5384() {
		this.aBoolean9991 = false;
		if (this.aClass387_9992 != null) {
			this.aClass387_9992.KA(this.aClass387_9992.m() & 0xFFFEFFFF);
		}
	}

	public void method38(Class_ra arg0) {
		Object var2 = null;
		Class_na var3;
		if (this.aClass_na9993 == null && this.aBoolean9996) {
			Class485 var4 = this.method5542(arg0, 262144, true, -96034231);
			var3 = (Class_na) (var4 == null ? null : var4.anObject5823);
		} else {
			var3 = this.aClass_na9993;
			this.aClass_na9993 = null;
		}
		Class260 var5 = this.method5346().aClass260_2606;
		if (var3 != null) {
			this.aClass356_8655.method4185(var3, this.aByte8654, (int) var5.aFloat2716, (int) var5.aFloat2711, null, (byte) -14);
		}
	}

	public void method41(Class_ra arg0) {
		Object var2 = null;
		Class_na var3;
		if (this.aClass_na9993 == null && this.aBoolean9996) {
			Class485 var4 = this.method5542(arg0, 262144, true, -2004766065);
			var3 = (Class_na) (var4 == null ? null : var4.anObject5823);
		} else {
			var3 = this.aClass_na9993;
			this.aClass_na9993 = null;
		}
		Class260 var5 = this.method5346().aClass260_2606;
		if (var3 != null) {
			this.aClass356_8655.method4167(var3, this.aByte8654, (int) var5.aFloat2716, (int) var5.aFloat2711, null, (byte) 109);
		}
	}

	public boolean method5358(Class_ra arg0, int arg1, int arg2, int arg3) {
		try {
			Class387 var5 = this.method5541(arg0, 131072, 220688116);
			if (var5 == null) {
				return false;
			} else {
				Class247 var6 = this.method5355();
				return var5.method4458(arg1, arg2, var6, false, 0);
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ys.br(" + ')');
		}
	}

	public void method5396(Class_ra arg0, Class432_Sub1 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (arg1 instanceof Class432_Sub1_Sub4_Sub2) {
			Class432_Sub1_Sub4_Sub2 var7 = (Class432_Sub1_Sub4_Sub2) arg1;
			if (this.aClass387_9992 != null && var7.aClass387_9992 != null) {
				this.aClass387_9992.method4490(var7.aClass387_9992, arg2, arg3, arg4, arg5);
			}
		}
	}

	public boolean method5389(Class_ra arg0, int arg1, int arg2) {
		Class387 var4 = this.method5541(arg0, 131072, -1960920544);
		if (var4 == null) {
			return false;
		} else {
			Class247 var5 = this.method5355();
			return var4.method4458(arg1, arg2, var5, false, 0);
		}
	}

	public Class432_Sub1_Sub4_Sub2(Class356 arg0, Class_ra arg1, Class463 arg2, Class473 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, boolean arg11) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, arg3.anInt5670);
		this.aClass463_10000 = arg2;
		this.anInt9995 = arg3.anInt5657;
		this.aBoolean9997 = arg9;
		this.aByte9999 = (byte) arg10;
		this.aBoolean9998 = arg3.anInt5637 != 0 && !arg9;
		this.aBoolean9991 = arg11;
		this.aBoolean9996 = arg1.y() && arg3.aBoolean5685 && !this.aBoolean9997 && Class448.aClass330_Sub50_5555.aClass464_Sub28_7885.method5837(670688942) != 0;
		int var13 = 2048;
		if (this.aBoolean9991) {
			var13 |= 0x10000;
		}
		if (arg3.aBoolean5683) {
			var13 |= 0x80000;
		}
		Class485 var14 = this.method5542(arg1, var13, this.aBoolean9996, -1346071709);
		if (var14 != null) {
			this.aClass387_9992 = (Class387) var14.anObject5824;
			this.aClass_na9993 = (Class_na) var14.anObject5823;
			if (this.aBoolean9991 || arg3.aBoolean5683) {
				this.aClass387_9992 = this.aClass387_9992.method4446((byte) 0, var13, false);
				if (arg3.aBoolean5683) {
					Class312 var15 = client.aClass304_9030.method3027((byte) -20);
					this.aClass387_9992.PA(var15.anInt3250, var15.anInt3248, var15.anInt3249, var15.anInt3247);
				}
			}
		}
		this.method5373(1, 960872847);
	}

	public static final void method5543(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub2_7868.method5736((byte) 0) == 1 ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ys.alx(" + ')');
		}
	}

	public static Class330_Sub44_Sub2 method5544(int arg0, int arg1, int arg2, long arg3, int arg4, int arg5) {
		try {
			Class330_Sub44_Sub2[] var7 = Class330_Sub44_Sub2.aClass330_Sub44_Sub2Array9830;
			synchronized (Class330_Sub44_Sub2.aClass330_Sub44_Sub2Array9830) {
				Class330_Sub44_Sub2 var8;
				if (Class369.anInt6820 == 0) {
					var8 = new Class330_Sub44_Sub2();
				} else {
					var8 = Class330_Sub44_Sub2.aClass330_Sub44_Sub2Array9830[--Class369.anInt6820];
				}
				var8.anInt9829 = arg0;
				var8.anInt9833 = arg1;
				var8.anInt9828 = arg2;
				var8.aLong9832 = arg3;
				var8.anInt9831 = arg4;
				return var8;
			}
		} catch (RuntimeException var12) {
			throw Class476.method5964(var12, "ys.at(" + ')');
		}
	}
}
