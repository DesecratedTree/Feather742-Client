package deob;

public class Class540 {

	public IndexTable aClass280_6247;

	public int anInt6248;

	public static IndexTable aClass280_6249;

	public Class540(Class435 arg0, Class454 arg1, IndexTable arg2) {
		new Class367(64);
		this.aClass280_6247 = arg2;
		this.anInt6248 = this.aClass280_6247.method2763(Class103.aClass103_939.anInt982, -2017620823);
	}

	public static void method6327(IComponentDefinitions[] arg0, IComponentDefinitions arg1, boolean arg2, int arg3) {
		try {
			int var4 = arg1.anInt1222 == 0 ? arg1.anInt1210 : arg1.anInt1222;
			int var5 = arg1.anInt1223 == 0 ? arg1.anInt1348 : arg1.anInt1223;
			ItemEquipDefinitions.method6214(arg0, arg1.anInt1196, var4, var5, arg2, (byte) 65);
			if (arg1.aClass114Array1219 != null) {
				ItemEquipDefinitions.method6214(arg1.aClass114Array1219, arg1.anInt1196, var4, var5, arg2, (byte) 65);
			}
			Class330_Sub48 var6 = (Class330_Sub48) client.aClass497_9284.method6094((long) arg1.anInt1196);
			if (var6 != null) {
				Class559.method6458(var6.anInt7859, var4, var5, arg2, 29658018);
			}
			if (arg1 == client.aClass114_9163) {
				int var7 = Class15.anInt192;
				int[] var8 = Class15.anIntArray187;
				int var9;
				for (var9 = 0; var9 < var7; var9++) {
					Player var10 = client.players[var8[var9]];
					if (var10 != null) {
						var10.method5433(var4, var5, arg2, 1977009717);
					}
				}
				for (var9 = 0; var9 < client.anInt9017; var9++) {
					int var13 = client.anIntArray9018[var9];
					Class330_Sub35 var11 = (Class330_Sub35) client.aClass497_9014.method6094((long) var13);
					if (var11 != null) {
						((Class432_Sub1_Sub1_Sub1) var11.anObject7733).method5433(var4, var5, arg2, 1160835437);
					}
				}
			}
		} catch (RuntimeException var12) {
			throw Class476.method5964(var12, "wj.ks(" + ')');
		}
	}

	public static Class209 method6328(Buffer arg0, int arg1) {
		try {
			Class209 var2 = new Class209();
			var2.anInt1981 = arg0.readUnsignedShort(1148369639);
			var2.aClass330_Sub36_Sub4_1982 = Class2.aClass523_44.method6233(var2.anInt1981, 1358793636);
			return var2;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "wj.r(" + ')');
		}
	}
}
