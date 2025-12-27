package deob;

public class Class432_Sub1_Sub1_Sub4 extends Class432_Sub1_Sub1 {

	public int anInt10201 = 0;

	public int anInt10206 = 0;

	public boolean aBoolean10200 = true;

	public int anInt10203 = 0;

	public int anInt10204;

	public Class477 aClass477_10202;

	public Class388 aClass388_10205;

	public Class432_Sub1_Sub1_Sub4(Class356 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, boolean arg13, int arg14) {
		super(arg0, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt10204 = arg1;
		this.anInt10201 = arg12;
		this.anInt10203 = arg14;
		Class437 var16 = Class136.aClass416_1527.method5254(this.anInt10204, -635018090);
		int var17 = var16.anInt4431;
		if (var17 != -1) {
			this.aClass477_10202 = new Class477_Sub2(this, false);
			int var18 = var16.aBoolean4443 ? 0 : 2;
			if (arg13) {
				var18 = 1;
			}
			this.aClass477_10202.method5970(var17, arg2, var18, false, -2036723180);
		}
		this.method5373(1, 152543098);
	}

	public Class353 method5380(Class_ra arg0) {
		Class387 var2 = this.method5501(arg0, (this.anInt10201 * -977203539 * 1149076773 == 0 ? 0 : 5) | 0x800, this.anInt10204 * 1999706379 * -768873821, (byte) 5);
		if (var2 == null) {
			return null;
		}
		if (this.anInt10201 * 1149076773 * -977203539 != 0) {
			var2.f(this.anInt10201 * 1149076773 * 141912064);
		}
		Class247 var3 = this.method5355();
		this.method5502(arg0, var2, var3, -515813395);
		Class353 var4 = Class497.method6105(false, (byte) 16);
		var2.method4475(var3, this.aClass80Array8656[0], 0);
		if (this.aClass388_10205 != null) {
			Class81 var5 = this.aClass388_10205.method4570();
			arg0.cm(var5);
		}
		this.aBoolean10200 = var2.i();
		this.anInt10206 = var2.YA() * 1348466845 * -1367978571;
		var2.n();
		return var4;
	}

	public int method5370(int arg0) {
		try {
			return this.anInt10206;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "als.bo(" + ')');
		}
	}

	public void method5361(Class_ra arg0) {
		Class387 var2 = this.method5501(arg0, 0, this.anInt10204 * 1999706379 * -768873821, (byte) 5);
		if (var2 != null) {
			this.method5502(arg0, var2, this.method5355(), -515813395);
		}
	}

	public Class348 method5383(Class_ra arg0, int arg1) {
		try {
			return null;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "als.bt(" + ')');
		}
	}

	public final void method5499(int arg0, int arg1) {
		try {
			if (this.aClass477_10202 != null && !this.aClass477_10202.method5978((byte) -51)) {
				this.aClass477_10202.method5981(arg0, 678275014);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "als.j(" + ')');
		}
	}

	public final boolean method5500(int arg0) {
		try {
			return this.aClass477_10202 != null && !this.aClass477_10202.method5972(-776556553);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "als.i(" + ')');
		}
	}

	public final void method5397(Class_ra arg0, Class432_Sub1 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	public Class387 method5501(Class_ra arg0, int arg1, int arg2, byte arg3) {
		try {
			Class437 var5 = Class136.aClass416_1527.method5254(arg2, -1502801890);
			Class_xa var6 = this.aClass356_8655.aClass_xaArray3701[this.aByte8658];
			Class_xa var7 = this.aByte8654 < 3 ? this.aClass356_8655.aClass_xaArray3701[this.aByte8654 + 1] : null;
			Class260 var8 = this.method5346().aClass260_2606;
			return this.aClass477_10202 == null || this.aClass477_10202.method5978((byte) 0) ? var5.method5581(arg0, arg1, true, var6, var7, (int) var8.aFloat2716, (int) var8.aFloat2715, (int) var8.aFloat2711, null, (byte) 2, 1302193374) : var5.method5581(arg0, arg1, true, var6, var7, (int) var8.aFloat2716, (int) var8.aFloat2715, (int) var8.aFloat2711, this.aClass477_10202, (byte) 2, 1943596878);
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "als.o(" + ')');
		}
	}

	public Class348 method5401(Class_ra arg0) {
		return null;
	}

	public boolean method5377() {
		return this.aBoolean10200;
	}

	public void method5502(Class_ra arg0, Class387 arg1, Class247 arg2, int arg3) {
		try {
			arg1.method4463(arg2);
			Class93[] var5 = arg1.method4464();
			Class64[] var6 = arg1.method4445();
			if ((this.aClass388_10205 == null || this.aClass388_10205.aBoolean3992) && (var5 != null || var6 != null)) {
				this.aClass388_10205 = Class388.method4571(client.anInt8981, true);
			}
			if (this.aClass388_10205 != null) {
				this.aClass388_10205.method4568(arg0, (long) client.anInt8981, var5, var6, false);
				this.aClass388_10205.method4573(this.aByte8658, this.aShort9922, this.aShort9920, this.aShort9921, this.aShort9923);
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "als.s(" + ')');
		}
	}

	public void method5503(int arg0) {
		try {
			if (this.aClass388_10205 != null) {
				this.aClass388_10205.method4572();
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "als.f(" + ')');
		}
	}

	public Class348 method5357(Class_ra arg0) {
		return null;
	}

	public final boolean method5360(short arg0) {
		try {
			return false;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "als.bi(" + ')');
		}
	}

	public final void method5392(Class_ra arg0, Class432_Sub1 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "als.bz(" + ')');
		}
	}

	public final void method5393(int arg0) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "als.be(" + ')');
		}
	}

	public boolean method5374() {
		return false;
	}

	public boolean method5375() {
		return false;
	}

	public boolean method5376() {
		return false;
	}

	public Class348 method5385(Class_ra arg0) {
		return null;
	}

	public boolean method5378() {
		return this.aBoolean10200;
	}

	public boolean method5379() {
		return this.aBoolean10200;
	}

	public int method5394() {
		return this.anInt10206 * 1348466845 * -1367978571;
	}

	public int method5381() {
		return this.anInt10206 * 1348466845 * -1367978571;
	}

	public int method5364() {
		return this.anInt10206 * 1348466845 * -1367978571;
	}

	public int method5366() {
		return this.anInt10206 * 1348466845 * -1367978571;
	}

	public final void method5396(Class_ra arg0, Class432_Sub1 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	public Class348 method5386(Class_ra arg0) {
		return null;
	}

	public Class348 method5362(Class_ra arg0) {
		return null;
	}

	public Class348 method5388(Class_ra arg0) {
		return null;
	}

	public void method5404(Class_ra arg0, int arg1) {
		try {
			Class387 var3 = this.method5501(arg0, 0, this.anInt10204, (byte) 5);
			if (var3 != null) {
				this.method5502(arg0, var3, this.method5355(), -515813395);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "als.bl(" + ')');
		}
	}

	public int method5504(byte arg0) {
		try {
			return this.anInt10203;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "als.r(" + ')');
		}
	}

	public boolean method5389(Class_ra arg0, int arg1, int arg2) {
		return false;
	}

	public boolean method5390(Class_ra arg0, int arg1, int arg2) {
		return false;
	}

	public final boolean method5391() {
		return false;
	}

	public final void method5387() {
		throw new IllegalStateException();
	}

	public final void method5384() {
		throw new IllegalStateException();
	}

	public final void method5369(Class_ra arg0, Class432_Sub1 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	public boolean method5358(Class_ra arg0, int arg1, int arg2, int arg3) {
		try {
			return false;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "als.br(" + ')');
		}
	}

	public final boolean method5505(int arg0) {
		try {
			return this.aClass477_10202 == null || this.aClass477_10202.method5978((byte) -115);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "als.p(" + ')');
		}
	}

	public Class353 method5405(Class_ra arg0, int arg1) {
		try {
			Class387 var3 = this.method5501(arg0, (this.anInt10201 == 0 ? 0 : 5) | 0x800, this.anInt10204, (byte) 5);
			if (var3 == null) {
				return null;
			}
			if (this.anInt10201 != 0) {
				var3.f(this.anInt10201 * 2048);
			}
			Class247 var4 = this.method5355();
			this.method5502(arg0, var3, var4, -515813395);
			Class353 var5 = Class497.method6105(false, (byte) 16);
			var3.method4475(var4, this.aClass80Array8656[0], 0);
			if (this.aClass388_10205 != null) {
				Class81 var6 = this.aClass388_10205.method4570();
				arg0.cm(var6);
			}
			this.aBoolean10200 = var3.i();
			this.anInt10206 = var3.YA();
			var3.n();
			return var5;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "als.bf(" + ')');
		}
	}

	public boolean method5395(int arg0) {
		try {
			return this.aBoolean10200;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "als.bg(" + ')');
		}
	}

	public boolean method5382(int arg0) {
		try {
			return false;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "als.ao(" + ')');
		}
	}
}
