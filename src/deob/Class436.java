package deob;

import java.io.File;

public class Class436 {

	public Class367 aClass367_4426 = new Class367(64);

	public Class367 aClass367_4425 = new Class367(100);

	public IndexTable aClass280_4427;

	public Class436(Class435 arg0, Class454 arg1, IndexTable arg2, IndexTable arg3, IndexTable arg4) {
		this.aClass280_4427 = arg2;
		if (this.aClass280_4427 != null) {
			int var6 = this.aClass280_4427.method2764(1283392631) - 1;
			Class103.aClass103_936.method1226((byte) 0);
			this.aClass280_4427.method2763(var6, -2055639482);
		}
		Class76_Sub2.method913(arg3, arg4, 2, -1973767305);
	}

	public Class440 method5570(int arg0, int arg1) {
		try {
			Class367 var4 = this.aClass367_4426;
			Class440 var3;
			synchronized (this.aClass367_4426) {
				var3 = (Class440) this.aClass367_4426.get((long) arg0);
			}
			if (var3 != null) {
				return var3;
			}
			IndexTable var5 = this.aClass280_4427;
			byte[] var12;
			synchronized (this.aClass280_4427) {
				var12 = this.aClass280_4427.getFile(Class103.aClass103_936.method1228(arg0, -1282308389), Class103.aClass103_936.method1227(arg0, (byte) 81));
			}
			var3 = new Class440();
			var3.anInt4459 = arg0;
			var3.aClass436_4458 = this;
			if (var12 != null) {
				var3.method5601(new Buffer(var12), 1039140702);
			}
			var3.method5605(1771702874);
			Class367 var13 = this.aClass367_4426;
			synchronized (this.aClass367_4426) {
				this.aClass367_4426.put(var3, (long) arg0);
			}
			return var3;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "sb.r(" + ')');
		}
	}

	public void method5571(int arg0, int arg1) {
		try {
			Class367 var3 = this.aClass367_4426;
			synchronized (this.aClass367_4426) {
				this.aClass367_4426.method4292(arg0, (byte) 36);
			}
			var3 = this.aClass367_4425;
			synchronized (this.aClass367_4425) {
				this.aClass367_4425.method4292(arg0, (byte) 76);
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "sb.p(" + ')');
		}
	}

	public void method5572(int arg0) {
		try {
			Class367 var2 = this.aClass367_4426;
			synchronized (this.aClass367_4426) {
				this.aClass367_4426.method4296(77203997);
			}
			var2 = this.aClass367_4425;
			synchronized (this.aClass367_4425) {
				this.aClass367_4425.method4296(328490044);
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "sb.o(" + ')');
		}
	}

	public void method5573(short arg0) {
		try {
			Class367 var2 = this.aClass367_4426;
			synchronized (this.aClass367_4426) {
				this.aClass367_4426.method4298((byte) 46);
			}
			var2 = this.aClass367_4425;
			synchronized (this.aClass367_4425) {
				this.aClass367_4425.method4298((byte) 4);
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "sb.i(" + ')');
		}
	}

	public Class330_Sub36_Sub5 method5574(int arg0, int arg1) {
		try {
			Class367 var4 = this.aClass367_4425;
			Class330_Sub36_Sub5 var3;
			synchronized (this.aClass367_4425) {
				var3 = (Class330_Sub36_Sub5) this.aClass367_4425.get((long) arg0);
				if (var3 == null) {
					var3 = new Class330_Sub36_Sub5(arg0);
					this.aClass367_4425.put(var3, (long) arg0);
				}
				if (!var3.method3458(1748918469)) {
					return null;
				}
			}
			return var3;
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "sb.j(" + ')');
		}
	}

	public static Class387 method5575(Class_ra arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Class387 arg6, int arg7, int arg8, int arg9, int arg10, Class477 arg11, byte arg12) {
		try {
			if (arg6 == null) {
				return null;
			}
			int var13 = 2055;
			if (arg11 != null) {
				var13 |= arg11.method5975(-586180680);
				var13 &= 0xFFFFFDFF;
			}
			long var14 = ((long) arg8 << 48) + ((long) arg7 << 32) + (long) (arg5 + (arg9 << 16) + (arg10 << 24));
			Class367 var17 = Class459.aClass367_5566;
			Class387 var16;
			synchronized (Class459.aClass367_5566) {
				var16 = (Class387) Class459.aClass367_5566.get(var14);
			}
			if (var16 == null || arg0.ct(var16.m(), var13) != 0) {
				if (var16 != null) {
					var13 = arg0.cd(var13, var16.m());
				}
				byte var34;
				if (arg5 == 1) {
					var34 = 9;
				} else if (arg5 == 2) {
					var34 = 12;
				} else if (arg5 == 3) {
					var34 = 15;
				} else if (arg5 == 4) {
					var34 = 18;
				} else {
					var34 = 21;
				}
				byte var18 = 3;
				int[] var19 = new int[] { 64, 96, 128 };
				Model var20 = new Model(var18 * var34 + 1, var18 * 2 * var34 - var34, 0);
				int var21 = var20.method1189(0, 0, 0);
				int[][] var22 = new int[var18][var34];
				int var23;
				int var24;
				int var25;
				int var28;
				for (var23 = 0; var23 < var18; var23++) {
					var24 = var19[var23];
					var25 = var19[var23];
					for (int var26 = 0; var26 < var34; var26++) {
						int var27 = (var26 << 14) / var34;
						var28 = Class257.anIntArray2683[var27] * var24 >> 14;
						int var29 = Class257.anIntArray2684[var27] * var25 >> 14;
						var22[var23][var26] = var20.method1189(var28, 0, var29);
					}
				}
				for (var23 = 0; var23 < var18; var23++) {
					var24 = (var23 * 256 + 128) / var18;
					var25 = 256 - var24;
					byte var40 = (byte) (var24 * arg10 + var25 * arg9 >> 8);
					short var41 = (short) ((var24 * (arg8 & 0x7F) + (arg7 & 0x7F) * var25 & 0x7F00) + (var25 * (arg7 & 0x380) + var24 * (arg8 & 0x380) & 0x38000) + (var24 * (arg8 & 0xFC00) + var25 * (arg7 & 0xFC00) & 0xFC0000) >> 8);
					for (var28 = 0; var28 < var34; var28++) {
						if (var23 == 0) {
							var20.method1190(var21, var22[0][(var28 + 1) % var34], var22[0][var28], (byte) 1, (byte) -1, var41, var40, (short) -1);
						} else {
							var20.method1190(var22[var23 - 1][var28], var22[var23 - 1][(var28 + 1) % var34], var22[var23][(var28 + 1) % var34], (byte) 1, (byte) -1, var41, var40, (short) -1);
							var20.method1190(var22[var23 - 1][var28], var22[var23][(var28 + 1) % var34], var22[var23][var28], (byte) 1, (byte) -1, var41, var40, (short) -1);
						}
					}
				}
				var16 = arg0.cb(var20, var13, Class459.anInt5567, 64, 768);
				Class367 var39 = Class459.aClass367_5566;
				synchronized (Class459.aClass367_5566) {
					Class459.aClass367_5566.put(var16, var14);
				}
			}
			int var36 = arg6.RA();
			int var35 = arg6.ya();
			int var37 = arg6.AA();
			int var38 = arg6.ha();
			if (arg11 == null) {
				var16 = var16.method4446((byte) 3, var13, true);
				var16.oa(var35 - var36 >> 1, 128, var38 - var37 >> 1);
				var16.ia(var36 + var35 >> 1, 0, var37 + var38 >> 1);
			} else {
				var16 = var16.method4446((byte) 3, var13, true);
				var16.oa(var35 - var36 >> 1, 128, var38 - var37 >> 1);
				var16.ia(var36 + var35 >> 1, 0, var38 + var37 >> 1);
				arg11.method5977(var16, -1602451758);
			}
			if (arg2 != 0) {
				var16.t(arg2);
			}
			if (arg3 != 0) {
				var16.EA(arg3);
			}
			if (arg4 != 0) {
				var16.ia(0, arg4, 0);
			}
			return var16;
		} catch (RuntimeException var33) {
			throw Class476.method5964(var33, "sb.r(" + ')');
		}
	}

	public static void method5576(Class_ra arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
		try {
			arg0.method4789(arg1, arg2, arg3, arg4, arg5, 463754225);
			arg0.method4789(arg1 + 1, arg2 + 1, arg3 - 2, 16, arg6, 463754225);
			arg0.method4788(arg1 + 1, arg2 + 18, arg3 - 2, arg4 - 19, arg6, (byte) -55);
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "sb.ah(" + ')');
		}
	}

	public static byte[] method5577(File arg0, int arg1) {
		try {
			return Class396.method4653(arg0, (int) arg0.length(), 978957823);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "sb.i(" + ')');
		}
	}

	public static final void method5578(Class430 arg0, byte arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub10_7873.method5771(-318107161) ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "sb.aqr(" + ')');
		}
	}

	public static final void method5579(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			String var4 = (String) arg2.anObjectArray4386[--arg2.anInt4378];
			if (Class278.method2740(var4, arg2, (byte) 0) != null) {
				var4 = var4.substring(0, var4.length() - 1);
			}
			arg0.anObjectArray1330 = Class288.method2886(var4, arg2, 1916679088);
			arg0.aBoolean1293 = true;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "sb.ny(" + ')');
		}
	}
}
