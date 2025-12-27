package deob;

public class Class325_Sub6 extends Class325 {

	public int anInt7490;

	public int anInt7491;

	public int anInt7492;

	public int anInt7493;

	public int anInt7494;

	public int anInt7495;

	public String aString7496;

	public static Class330_Sub38 method3228(int arg0) {
		try {
			if (Class354_Sub1.aClass471_3509 == null || Class354_Sub1.aClass474_7992 == null) {
				return null;
			}
			for (Class330_Sub38 var1 = (Class330_Sub38) Class354_Sub1.aClass474_7992.next(); var1 != null; var1 = (Class330_Sub38) Class354_Sub1.aClass474_7992.next()) {
				Class372 var2 = Class354_Sub1.aClass380_3529.method4387(var1.anInt7755, (byte) -98);
				if (var2 != null && var2.aBoolean3910 && var2.method4327(Class354_Sub1.anInterface29_3496, (byte) 55)) {
					return var1;
				}
			}
			return null;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "acv.cx(" + ')');
		}
	}

	public static final Class430 method3229(byte arg0) {
		try {
			if (Class428.anInt4360 == Class428.anArrayList4351.size()) {
				Class428.anArrayList4351.add(new Class430());
			}
			Class430 var1 = (Class430) Class428.anArrayList4351.get(Class428.anInt4360);
			Class428.anInt4360++;
			return var1;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "acv.r(" + ')');
		}
	}
}
