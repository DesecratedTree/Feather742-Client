package deob;

public class Class10 {

	public float aFloat154 = 1.0F;

	public float aFloat155 = 1.0F;

	public int anInt163;

	public int anInt159;

	public int anInt157;

	public int anInt158;

	public float aFloat161;

	public int anInt153;

	public int anInt156;

	public int anInt160;

	public int anInt162;

	public Class10(int arg0, float arg1, float arg2, int arg3, int arg4, int arg5) {
		this.anInt163 = arg0;
		this.aFloat154 = arg1;
		this.aFloat155 = arg2;
		this.anInt159 = arg3;
		this.anInt157 = arg4;
		this.anInt158 = arg5;
	}

	public Class10(int arg0) {
		this.anInt163 = arg0;
	}

	public Class10 method424(int arg0) {
		try {
			return new Class10(this.anInt163, this.aFloat154, this.aFloat155, this.anInt159, this.anInt157, this.anInt158);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ak.r(" + ')');
		}
	}

	public void method425(Class10 arg0, int arg1) {
		try {
			this.aFloat154 = arg0.aFloat154;
			this.aFloat155 = arg0.aFloat155;
			this.anInt159 = arg0.anInt159;
			this.anInt157 = arg0.anInt157;
			this.anInt163 = arg0.anInt163;
			this.anInt158 = arg0.anInt158;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ak.j(" + ')');
		}
	}

	public static void method426(boolean arg0, int arg1) {
		try {
			if (client.anInt8987 != 1 && client.anInt8987 != 2) {
				if (!arg0) {
					Class95[] var2 = Class467.aClass95Array5599;
					for (int var3 = 0; var3 < var2.length; var3++) {
						Class95 var4 = var2[var3];
						var4.method1096(1779244518);
					}
					if (Class96.anInt864 != -1) {
						Class365.method4271(-1586241968);
						Class333.musicId = -1;
						Class18.method452(Class96.anInt864, 255, 50, 700681306);
					}
				}
				client.anInt8987 = 1;
				Class140_Sub1.anIntArrayArray7262 = null;
				Class444.aClass330_Sub46_4496 = null;
				client.aBoolean9039 = false;
				if (Class96.anInt852 > 0) {
					Class230.method2339(Class545.aClass545_7010, Class96.anInt852, -1, 360281091);
				}
				Class515.method6204(742822054);
				Class330_Sub34 var6 = Class238.method2377(OutgoingPacket.aClass234_2473, client.aClass1_9025.aClass488_22, 1578916159);
				var6.aClass330_Sub46_Sub2_7729.addByte(arg0 ? 1 : 0, (byte) 14);
				client.aClass1_9025.method378(var6, -1697077815);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ak.o(" + ')');
		}
	}

	public static int method427(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
		try {
			Class330_Sub1 var5 = Class321.method3178(arg0, arg3, (short) 3513);
			if (var5 == null) {
				return 0;
			}
			int var6 = 0;
			for (int var7 = 0; var7 < var5.anIntArray7500.length; var7++) {
				if (var5.anIntArray7500[var7] >= 0 && var5.anIntArray7500[var7] < Class556.aClass510_6392.anInt6777) {
					ItemDefinitions var8 = Class556.aClass510_6392.getItemDefinitions(var5.anIntArray7500[var7], (byte) -75);
					int var9 = var8.method6287(arg1, Class301.aClass543_3059.method6339(arg1, -1764913508).anInt6235, -1497870693);
					if (arg2) {
						var6 += var9 * var5.anIntArray7497[var7];
					} else {
						var6 += var9;
					}
				}
			}
			return var6;
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "ak.p(" + ')');
		}
	}
}
