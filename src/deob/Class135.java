package deob;

public class Class135 {

	public Class497 aClass497_1519;

	public Class330_Sub15[] aClass330_Sub15Array1520;

	public Interface5 anInterface5_1521;

	public Class330_Sub15 method1579(int arg0, int arg1) {
		try {
			return arg0 >= this.aClass330_Sub15Array1520.length ? null : this.aClass330_Sub15Array1520[arg0];
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "fk.r(" + ')');
		}
	}

	public Class330_Sub15 method1580(String arg0, byte arg1) {
		try {
			long var3 = this.anInterface5_1521.method68(arg0, 2054191954);
			for (Class330_Sub15 var5 = (Class330_Sub15) this.aClass497_1519.method6094(var3); var5 != null; var5 = (Class330_Sub15) this.aClass497_1519.method6095(431045678)) {
				if (var5.aString7609.equals(arg0)) {
					return var5;
				}
			}
			return null;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "fk.j(" + ')');
		}
	}

	public void method1581(int arg0, byte arg1) {
		try {
			Class330_Sub15 var3 = this.method1579(arg0, 1439297907);
			if (var3 != null) {
				var3.method3252(669167766);
				this.aClass330_Sub15Array1520[var3.anInt7610] = null;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "fk.i(" + ')');
		}
	}

	public Class135(int arg0, Interface5 arg1) {
		int var3;
		for (var3 = 1; var3 < arg0; var3 += var3) {
		}
		this.aClass497_1519 = new Class497(var3);
		this.aClass330_Sub15Array1520 = new Class330_Sub15[var3];
		this.anInterface5_1521 = arg1;
	}

	public void method1582(int arg0, String arg1, Class330_Sub15 arg2, int arg3) {
		try {
			Class330_Sub15 var5 = this.method1580(arg1, (byte) -128);
			if (var5 != null && arg0 != var5.anInt7610) {
				throw new IllegalArgumentException(arg1);
			}
			this.method1581(arg0, (byte) 117);
			if (arg0 >= this.aClass330_Sub15Array1520.length) {
				int var6;
				for (var6 = this.aClass330_Sub15Array1520.length; var6 <= arg0; var6 += var6) {
				}
				this.aClass497_1519 = new Class497(var6);
				for (int var7 = 0; var7 < this.aClass330_Sub15Array1520.length; var7++) {
					Class330_Sub15 var8 = this.aClass330_Sub15Array1520[var7];
					if (var8 != null) {
						this.aClass497_1519.method6097(var8, var8.aLong3341);
					}
				}
				Class330_Sub15[] var10 = new Class330_Sub15[var6];
				for (int var11 = 0; var11 < this.aClass330_Sub15Array1520.length; var11++) {
					var10[var11] = this.aClass330_Sub15Array1520[var11];
				}
				this.aClass330_Sub15Array1520 = var10;
			}
			arg2.anInt7610 = arg0;
			arg2.aString7609 = arg1;
			this.aClass497_1519.method6097(arg2, this.anInterface5_1521.method68(arg1, 2110969517));
			this.aClass330_Sub15Array1520[arg0] = arg2;
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "fk.p(" + ')');
		}
	}

	public static final void method1583(Class430 arg0, int arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			arg0.anInt4376 -= 2;
			int var3 = arg0.anIntArray4387[arg0.anInt4376];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2.indexOf(var3, var4);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fk.aax(" + ')');
		}
	}

	public static final void method1584(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			int var3 = client.aClass286Array9234[var2].method2868(401952846);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3 == 2 ? 1 : 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "fk.yo(" + ')');
		}
	}

	public static final void method1585(String arg0, int arg1, int arg2) {
		try {
			Class1 var3 = Class426.method5317(1765610418);
			Class330_Sub34 var4 = Class238.method2377(OutgoingPacket.FRIENDS_CHAT_RANK_PACKET, var3.aClass488_22, 581176510);
			var4.aClass330_Sub46_Sub2_7729.addByte(Class57.method659(arg0, -1087782953) + 1, (byte) 93);
			var4.aClass330_Sub46_Sub2_7729.addString(arg0, (byte) -86);
			var4.aClass330_Sub46_Sub2_7729.addByte(arg1, (byte) 70);
			var3.method378(var4, -494476027);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fk.mu(" + ')');
		}
	}

	public static final void method1586(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class220.method2262(var3, var4, arg0, 1032565);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fk.ok(" + ')');
		}
	}
}
