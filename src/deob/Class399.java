package deob;

public class Class399 {

	public Class472 aClass472_4120 = new Class472();

	public int anInt4123;

	public int anInt4121;

	public Class497 aClass497_4122;

	public Class399(int arg0) {
		this.anInt4123 = arg0;
		this.anInt4121 = arg0;
		int var2;
		for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
		}
		this.aClass497_4122 = new Class497(var2);
	}

	public final Object method4688(Interface22 arg0) {
		long var2 = arg0.method288();
		for (Class330_Sub36_Sub7 var4 = (Class330_Sub36_Sub7) this.aClass497_4122.method6094(var2); var4 != null; var4 = (Class330_Sub36_Sub7) this.aClass497_4122.method6095(1914750334)) {
			if (var4.anInterface22_9669.method287(arg0)) {
				Object var5 = var4.method3468();
				if (var5 != null) {
					if (var4.method3467()) {
						Class330_Sub36_Sub7_Sub1 var6 = new Class330_Sub36_Sub7_Sub1(arg0, var5, var4.anInt9668);
						this.aClass497_4122.method6097(var6, var4.aLong3341);
						this.aClass472_4120.method5883(var6, -27235115);
						var6.aLong7734 = 0L;
						var4.method3252(522994679);
						var4.method3439((byte) -79);
					} else {
						this.aClass472_4120.method5883(var4, -2092260984);
						var4.aLong7734 = 0L;
					}
					return var5;
				}
				var4.method3252(-57952718);
				var4.method3439((byte) -58);
				this.anInt4121 += var4.anInt9668;
			}
		}
		return null;
	}

	public final void method4689(Interface22 arg0) {
		long var2 = arg0.method288();
		for (Class330_Sub36_Sub7 var4 = (Class330_Sub36_Sub7) this.aClass497_4122.method6094(var2); var4 != null; var4 = (Class330_Sub36_Sub7) this.aClass497_4122.method6095(1300281323)) {
			if (var4.anInterface22_9669.method287(arg0)) {
				this.method4690(var4);
				break;
			}
		}
	}

	public final void method4690(Class330_Sub36_Sub7 arg0) {
		if (arg0 != null) {
			arg0.method3252(-1802552979);
			arg0.method3439((byte) -123);
			this.anInt4121 += arg0.anInt9668;
		}
	}

	public final void method4691(int arg0) {
		for (Class330_Sub36_Sub7 var2 = (Class330_Sub36_Sub7) this.aClass472_4120.method5884((byte) 35); var2 != null; var2 = (Class330_Sub36_Sub7) this.aClass472_4120.method5886((short) 8192)) {
			if (var2.method3467()) {
				if (var2.method3468() == null) {
					var2.method3252(1523871594);
					var2.method3439((byte) -89);
					this.anInt4121 += var2.anInt9668;
				}
			} else if (++var2.aLong7734 > (long) arg0) {
				Class330_Sub36_Sub7_Sub2 var3 = new Class330_Sub36_Sub7_Sub2(var2.anInterface22_9669, var2.method3468(), var2.anInt9668);
				this.aClass497_4122.method6097(var3, var2.aLong3341);
				Class215.method2239(var3, var2, -1673762223);
				var2.method3252(-1341789521);
				var2.method3439((byte) -46);
			}
		}
	}

	public final void method4692() {
		this.aClass472_4120.method5889(-1601226350);
		this.aClass497_4122.method6100(65280);
		this.anInt4121 = this.anInt4123;
	}

	public final void method4693() {
		for (Class330_Sub36_Sub7 var1 = (Class330_Sub36_Sub7) this.aClass472_4120.method5884((byte) 65); var1 != null; var1 = (Class330_Sub36_Sub7) this.aClass472_4120.method5886((short) 8192)) {
			if (var1.method3467()) {
				var1.method3252(-1018699090);
				var1.method3439((byte) -72);
				this.anInt4121 += var1.anInt9668;
			}
		}
	}

	public final int method4694() {
		return this.anInt4123;
	}

	public final void method4695(Object arg0, Interface22 arg1, int arg2) {
		if (arg2 > this.anInt4123) {
			throw new IllegalStateException();
		}
		this.method4689(arg1);
		this.anInt4121 -= arg2;
		while (this.anInt4121 < 0) {
			Class330_Sub36_Sub7 var4 = (Class330_Sub36_Sub7) this.aClass472_4120.method5888(525653981);
			this.method4690(var4);
		}
		Class330_Sub36_Sub7_Sub1 var5 = new Class330_Sub36_Sub7_Sub1(arg1, arg0, arg2);
		this.aClass497_4122.method6097(var5, arg1.method288());
		this.aClass472_4120.method5883(var5, -1135696655);
		var5.aLong7734 = 0L;
	}

	public final void method4696(Object arg0, Interface22 arg1) {
		this.method4695(arg0, arg1, 1);
	}

	public final int method4697() {
		return this.anInt4121;
	}
}
