package deob;

public class Class330_Sub1 extends Class330 {

	public int[] anIntArray7500 = new int[] { -1 };

	public int[] anIntArray7497 = new int[] { 0 };

	public static Class497 aClass497_7501 = new Class497(32);

	public static Class367 aClass367_7498 = new Class367(10);

	public static int anInt7499;

	public long method3259(int[] arg0, int arg1, int[] arg2, boolean arg3, int arg4) {
		try {
			long[] var6 = Buffer.aLongArray7850;
			long var7 = -1L;
			long var11 = var7 >>> 8 ^ var6[(int) ((var7 ^ (long) (arg1 >> 8)) & 0xFFL)];
			var7 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) arg1) & 0xFFL)];
			int var9;
			for (var9 = 0; var9 < arg0.length; var9++) {
				var7 = var7 >>> 8 ^ var6[(int) ((var7 ^ (long) (arg0[var9] >> 24)) & 0xFFL)];
				var7 = var7 >>> 8 ^ var6[(int) ((var7 ^ (long) (arg0[var9] >> 16)) & 0xFFL)];
				var7 = var7 >>> 8 ^ var6[(int) ((var7 ^ (long) (arg0[var9] >> 8)) & 0xFFL)];
				var7 = var7 >>> 8 ^ var6[(int) ((var7 ^ (long) arg0[var9]) & 0xFFL)];
			}
			if (arg2 != null) {
				for (var9 = 0; var9 < 5; var9++) {
					var7 = var7 >>> 8 ^ var6[(int) ((var7 ^ (long) arg2[var9]) & 0xFFL)];
				}
			}
			return var7 >>> 8 ^ var6[(int) ((var7 ^ (long) (arg3 ? 1 : 0)) & 0xFFL)];
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "aca.l(" + ')');
		}
	}

	public final Class387 method3260(Class_ra arg0, int arg1, Class477 arg2, int arg3, boolean arg4, Class408 arg5, byte arg6) {
		try {
			Class387 var8 = null;
			int var9 = arg1;
			Class364 var10 = null;
			if (arg3 != -1) {
				var10 = Class102.aClass362_924.method4254(arg3, 113028296);
			}
			int[] var11 = this.anIntArray7500;
			if (var10 != null && var10.anIntArray3813 != null) {
				var11 = new int[var10.anIntArray3813.length];
				for (int var12 = 0; var12 < var10.anIntArray3813.length; var12++) {
					int var13 = var10.anIntArray3813[var12];
					if (var13 >= 0 && var13 < this.anIntArray7500.length) {
						var11[var12] = this.anIntArray7500[var13];
					} else {
						var11[var12] = -1;
					}
				}
			}
			if (arg2 != null) {
				var9 = arg1 | arg2.method5975(-205650189);
			}
			long var25 = this.method3259(var11, arg3, arg5 == null ? null : arg5.anIntArray4205, arg4, 1414352065);
			if (aClass367_7498 != null) {
				var8 = (Class387) aClass367_7498.get(var25);
			}
			if (var8 == null || arg0.ct(var8.m(), var9) != 0) {
				if (var8 != null) {
					var9 = arg0.cd(var9, var8.m());
				}
				int var14 = var9;
				boolean var15 = false;
				for (int var16 = 0; var16 < var11.length; var16++) {
					if (var11[var16] == -1) {
						if (arg6 <= 0) {
							throw new IllegalStateException();
						}
					} else if (!Class556.aClass510_6392.getItemDefinitions(var11[var16], (byte) -73).missingFile(arg4, null, 500491407)) {
						var15 = true;
					}
				}
				if (var15) {
					return null;
				}
				Model[] var27 = new Model[var11.length];
				int var17;
				for (var17 = 0; var17 < var11.length; var17++) {
					if (var11[var17] != -1) {
						var27[var17] = Class556.aClass510_6392.getItemDefinitions(var11[var17], (byte) -58).getEquipmentInformation(arg4, null, 1444633947);
					} else if (arg6 <= 0) {
					}
				}
				int var18;
				int var19;
				if (var10 != null && var10.anIntArrayArray3807 != null) {
					for (var17 = 0; var17 < var10.anIntArrayArray3807.length; var17++) {
						if (var10.anIntArrayArray3807[var17] != null) {
							if (var27[var17] != null) {
								var18 = var10.anIntArrayArray3807[var17][0];
								var19 = var10.anIntArrayArray3807[var17][1];
								int var20 = var10.anIntArrayArray3807[var17][2];
								int var21 = var10.anIntArrayArray3807[var17][3];
								int var22 = var10.anIntArrayArray3807[var17][4];
								int var23 = var10.anIntArrayArray3807[var17][5];
								if (var21 != 0 || var22 != 0 || var23 != 0) {
									var27[var17].method1195(var21, var22, var23);
								}
								if (var18 != 0 || var19 != 0 || var20 != 0) {
									var27[var17].method1194(var18, var19, var20);
								}
							} else if (arg6 <= 0) {
								throw new IllegalStateException();
							}
						}
					}
				}
				Model var28 = new Model(var27, var27.length);
				if (arg5 != null) {
					var14 = var9 | 0x4000;
				}
				var8 = arg0.cb(var28, var14, anInt7499, 66, 850);
				if (arg5 != null) {
					for (var18 = 0; var18 < 10; var18++) {
						for (var19 = 0; var19 < Class408.modelColors[var18].length; var19++) {
							if (arg5.anIntArray4205[var18] < Class408.modifiedModelColors[var18][var19].length) {
								var8.color(Class408.modelColors[var18][var19], Class408.modifiedModelColors[var18][var19][arg5.anIntArray4205[var18]]);
							}
						}
					}
				}
				if (aClass367_7498 != null) {
					var8.KA(var9);
					aClass367_7498.put(var8, var25);
				}
			}
			if (arg2 == null) {
				return var8;
			} else {
				Class387 var26 = var8.method4446((byte) 1, var9, true);
				arg2.method5976(var26, 0, 603913132);
				return var26;
			}
		} catch (RuntimeException var24) {
			throw Class476.method5964(var24, "aca.b(" + ')');
		}
	}

	public static final void method3261(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			String var4 = (String) arg2.anObjectArray4386[--arg2.anInt4378];
			if (Class278.method2740(var4, arg2, (byte) 0) != null) {
				var4 = var4.substring(0, var4.length() - 1);
			}
			arg0.anObjectArray1326 = Class288.method2886(var4, arg2, 1976553059);
			arg0.aBoolean1293 = true;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aca.ol(" + ')');
		}
	}
}
