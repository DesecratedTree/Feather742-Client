package deob;

public class Class342 {

	public Class367 aClass367_3398 = new Class367(16);

	public IndexTable aClass280_3399;

	public Class342(Class435 arg0, Class454 arg1, IndexTable arg2) {
		this.aClass280_3399 = arg2;
		this.aClass280_3399.method2763(Class103.aClass103_953.anInt982, -2066818594);
	}

	public void method3983(int arg0) {
		try {
			Class367 var2 = this.aClass367_3398;
			synchronized (this.aClass367_3398) {
				this.aClass367_3398.method4298((byte) 36);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "og.i(" + ')');
		}
	}

	public Class337 method3984(int arg0, int arg1) {
		try {
			Class367 var4 = this.aClass367_3398;
			Class337 var3;
			synchronized (this.aClass367_3398) {
				var3 = (Class337) this.aClass367_3398.get((long) arg0);
			}
			if (var3 != null) {
				return var3;
			}
			IndexTable var5 = this.aClass280_3399;
			byte[] var13;
			synchronized (this.aClass280_3399) {
				var13 = this.aClass280_3399.getFile(Class103.aClass103_953.anInt982, arg0);
			}
			var3 = new Class337();
			if (var13 != null) {
				var3.method3947(new Buffer(var13), -1186925657);
			}
			Class367 var12 = this.aClass367_3398;
			synchronized (this.aClass367_3398) {
				this.aClass367_3398.put(var3, (long) arg0);
			}
			return var3;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "og.r(" + ')');
		}
	}

	public Class308 method3985(int arg0, int arg1, int arg2, int arg3, Class131 arg4, byte arg5) {
		try {
			Class311[] var7 = null;
			Class337 var8 = this.method3984(arg0, 166743);
			if (var8.anIntArray3367 != null) {
				var7 = new Class311[var8.anIntArray3367.length];
				for (int var9 = 0; var9 < var7.length; var9++) {
					Class127 var10 = arg4.method1561(var8.anIntArray3367[var9], (byte) -11);
					var7[var9] = new Class311(var10.anInt1468, var10.anInt1471, var10.anInt1466, var10.anInt1467, var10.anInt1465, var10.anInt1473, var10.anInt1470, var10.aBoolean1469, var10.anInt1472, var10.anInt1464, var10.anInt1474);
				}
			}
			return new Class308(var8.anInt3365, var7, var8.anInt3369, arg1, arg2, arg3, var8.aClass344_3368, var8.anInt3366);
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "og.j(" + ')');
		}
	}

	public void method3986(int arg0) {
		try {
			Class367 var2 = this.aClass367_3398;
			synchronized (this.aClass367_3398) {
				this.aClass367_3398.method4296(-354865469);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "og.o(" + ')');
		}
	}

	public void method3987(int arg0, int arg1) {
		try {
			Class367 var3 = this.aClass367_3398;
			synchronized (this.aClass367_3398) {
				this.aClass367_3398.method4292(arg0, (byte) 73);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "og.p(" + ')');
		}
	}

	public static final void method3988(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class391.method4603(var3, var4, arg0, -1004775530);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "og.hy(" + ')');
		}
	}

	public static final void method3989(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -1168145827);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1245;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "og.ra(" + ')');
		}
	}

	public static void method3990(float arg0, Class260 arg1, Class244 arg2, Class260 arg3, Class260 arg4, Class260 arg5, float arg6, int arg7) {
		try {
			if (!arg3.method2555(arg1)) {
				Class260 var8 = Class260.method2577(0.0F, 0.0F, 0.0F);
				Class260 var9 = Class260.method2549(Class260.method2561(arg3, arg1));
				var9.method2570(arg2);
				Class260 var10 = Class260.method2561(var9, var8);
				float var11 = var10.method2565();
				if (arg5.aFloat2716 == Float.POSITIVE_INFINITY || Float.isNaN(arg1.aFloat2716) || var11 > 5120.0F) {
					arg1.method2582(arg3);
					arg4.method2554();
				} else {
					arg2.method2423();
					Class260 var12 = Class260.method2577(1.0F, 0.0F, 0.0F);
					Class260 var13 = Class260.method2577(0.0F, 1.0F, 0.0F);
					Class260 var14 = Class260.method2577(0.0F, 0.0F, 1.0F);
					var12.method2570(arg2);
					var13.method2570(arg2);
					var14.method2570(arg2);
					Class260 var15 = Class260.method2577(Class260.method2562(var12, arg4), Class260.method2562(var13, arg4), Class260.method2562(var14, arg4));
					Class260 var16 = Class260.method2549(var15);
					Class260 var17 = Class260.method2577(var10.aFloat2716 * arg5.aFloat2716, arg5.aFloat2715 * var10.aFloat2715, arg5.aFloat2711 * var10.aFloat2711);
					var16.method2571(var17, arg0);
					var16.method2569(arg6);
					Class260 var18 = Class260.method2574(var12, var16.aFloat2716);
					var18.method2571(var13, var16.aFloat2715);
					var18.method2571(var14, var16.aFloat2711);
					arg4.method2582(var18);
					if (var11 < 1.0F) {
						arg1.method2582(arg3);
						arg4.method2554();
					} else {
						arg1.method2558(Class260.method2574(arg4, arg0));
					}
				}
			}
		} catch (RuntimeException var19) {
			throw Class476.method5964(var19, "og.r(" + ')');
		}
	}

	public static final void method3991(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4394[arg0.anInt4397];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class158.aClass561_6474.method310(var2, -1799781963);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "og.as(" + ')');
		}
	}
}
