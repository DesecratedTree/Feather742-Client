package deob;

public class Class378 {

	public Class330_Sub36 aClass330_Sub36_3937 = new Class330_Sub36();

	public Class472 aClass472_3939 = new Class472();

	public int anInt3938;

	public int anInt3941;

	public Class497 aClass497_3940;

	public static IndexTable aClass280_3942;

	public Class378(int arg0) {
		this.anInt3938 = arg0;
		this.anInt3941 = arg0;
		int var2;
		for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
		}
		this.aClass497_3940 = new Class497(var2);
	}

	public Class330_Sub36 method4377(long arg0) {
		try {
			Class330_Sub36 var3 = (Class330_Sub36) this.aClass497_3940.method6094(arg0);
			if (var3 != null) {
				this.aClass472_3939.method5883(var3, -1295715783);
			}
			return var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ps.r(" + ')');
		}
	}

	public void method4378(Class330_Sub36 arg0, long arg1) {
		try {
			if (this.anInt3941 == 0) {
				Class330_Sub36 var4 = this.aClass472_3939.method5888(1267797375);
				var4.method3252(-2146721993);
				var4.method3439((byte) -16);
				if (this.aClass330_Sub36_3937 == var4) {
					var4 = this.aClass472_3939.method5888(1211373612);
					var4.method3252(88815751);
					var4.method3439((byte) -13);
				}
			} else {
				this.anInt3941--;
			}
			this.aClass497_3940.method6097(arg0, arg1);
			this.aClass472_3939.method5883(arg0, -1908642547);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ps.j(" + ')');
		}
	}

	public void method4379(int arg0) {
		try {
			this.aClass472_3939.method5889(-769668064);
			this.aClass497_3940.method6100(65280);
			this.aClass330_Sub36_3937 = new Class330_Sub36();
			this.anInt3941 = this.anInt3938;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ps.i(" + ')');
		}
	}

	public static boolean method4380(int arg0, int arg1) {
		try {
			for (Class330_Sub36_Sub10 var2 = (Class330_Sub36_Sub10) Class484.aClass471_5791.method5869(539664854); var2 != null; var2 = (Class330_Sub36_Sub10) Class484.aClass471_5791.method5873((byte) -124)) {
				if (Class531.method6298(var2.anInt9699, 1778654871) && (long) arg0 == var2.aLong9697) {
					return true;
				}
			}
			return false;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ps.h(" + ')');
		}
	}

	public static final void method4381(Class430 arg0, byte arg1) {
		try {
			if (Class503.aBoolean5914 && Class130.aFrame1498 != null) {
				Class96.method1182(Class448.aClass330_Sub50_5555.aClass464_Sub8_7897.method5763(-1204319837), -1, -1, false, 897546528);
			}
			if (Class147.method1739((byte) -70) == Class331.aClass331_3343) {
				Class330_Sub11.method3291(-1964403917);
				System.exit(0);
			} else {
				Class150_Sub2.method1771(-411908669);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ps.afq(" + ')');
		}
	}
}
