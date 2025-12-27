package deob;

public class Class459 {

	public static Class367 aClass367_5566 = new Class367(32);

	public static int anInt5567;

	public Class459() throws Throwable {
		throw new Error();
	}

	public static final void method5672(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class556.aClass510_6392.getItemDefinitions(var2, (byte) -27).anInt6714;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "t.abi(" + ')');
		}
	}

	public static final void method5673(Class430 arg0, byte arg1) {
		try {
			arg0.anInt4378 -= 2;
			String var2 = (String) arg0.anObjectArray4386[arg0.anInt4378];
			String var3 = (String) arg0.anObjectArray4386[arg0.anInt4378 + 1];
			arg0.anInt4376 -= 2;
			int var4 = arg0.anIntArray4387[arg0.anInt4376];
			int var5 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			if (var3 == null) {
				var3 = "";
			}
			if (var3.length() > 80) {
				var3 = var3.substring(0, 80);
			}
			Class1 var6 = Class426.method5317(2006112440);
			Class330_Sub34 var7 = Class238.method2377(OutgoingPacket.aClass234_2545, var6.aClass488_22, 1536146643);
			var7.aClass330_Sub46_Sub2_7729.addByte(Class57.method659(var2, -1666314798) + 2 + Class57.method659(var3, -1666390519), (byte) 49);
			var7.aClass330_Sub46_Sub2_7729.addString(var2, (byte) -29);
			var7.aClass330_Sub46_Sub2_7729.addByte(var4 - 1, (byte) 8);
			var7.aClass330_Sub46_Sub2_7729.addByte(var5, (byte) 43);
			var7.aClass330_Sub46_Sub2_7729.addString(var3, (byte) 0);
			var6.method378(var7, -486173055);
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "t.acm(" + ')');
		}
	}
}
