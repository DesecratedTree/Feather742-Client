package deob;

public class Class381 {

	public int anInt3963;

	public int gameSceneBaseX;

	public int gameSceneBaseY;

	public static IndexTable aClass280_3964;

	public Class381() {
		this.anInt3963 = -1;
	}

	public Class381(int arg0, int arg1, int arg2) {
		this.anInt3963 = arg0;
		this.gameSceneBaseX = arg1;
		this.gameSceneBaseY = arg2;
	}

	public Class381(int arg0) {
		if (arg0 == -1) {
			this.anInt3963 = -1;
		} else {
			this.anInt3963 = arg0 >> 28 & 0x3;
			this.gameSceneBaseX = arg0 >> 14 & 0x3FFF;
			this.gameSceneBaseY = arg0 & 0x3FFF;
		}
	}

	public String toString() {
		try {
			return this.anInt3963 + "," + (this.gameSceneBaseX >> 6) + "," + (this.gameSceneBaseY >> 6) + "," + (this.gameSceneBaseX & 0x3F) + "," + (this.gameSceneBaseY & 0x3F);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "pv.toString(" + ')');
		}
	}

	public static void method4396(Class545 arg0, int arg1, int arg2, Interface2 arg3, int arg4) {
		try {
			Class430 var5 = Class325_Sub6.method3229((byte) 56);
			var5.anInterface2_4389 = arg3;
			Class217.method2252(arg0, arg1, arg2, var5, -1424915238);
			var5.anInterface2_4389 = null;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "pv.z(" + ')');
		}
	}

	public static final void method4397(Class430 arg0, int arg1) {
		try {
			arg0.anObjectArray4375[arg0.anIntArray4394[arg0.anInt4397]] = arg0.anObjectArray4386[--arg0.anInt4378];
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "pv.aa(" + ')');
		}
	}

	public static final void method4398(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -92133796);
			Class330_Sub31.method3418(var3, arg0, -1402133545);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "pv.qk(" + ')');
		}
	}

	public static final void method4399(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 1133079779);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1321;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "pv.rw(" + ')');
		}
	}

	public static final void method4400(Class430 arg0, byte arg1) {
		try {
			String var2;
			if (Class263_Sub2.myPlayer == null || Class263_Sub2.myPlayer.displayName == null) {
				var2 = "";
			} else {
				var2 = Class263_Sub2.myPlayer.method5471(true, 1119838160);
			}
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var2;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "pv.acs(" + ')');
		}
	}

	public static void method4401(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Class481 arg6, int arg7) {
		try {
			Class330_Sub10 var8 = null;
			for (Class330_Sub10 var9 = (Class330_Sub10) Class330_Sub10.aClass471_7588.method5869(539664854); var9 != null; var9 = (Class330_Sub10) Class330_Sub10.aClass471_7588.method5873((byte) -59)) {
				if (arg0 == var9.anInt7581 && var9.anInt7582 == arg1 && var9.anInt7577 == arg2 && arg3 == var9.anInt7575) {
					var8 = var9;
					break;
				}
			}
			if (var8 == null) {
				var8 = new Class330_Sub10();
				var8.anInt7581 = arg0;
				var8.anInt7575 = arg3;
				var8.anInt7582 = arg1;
				var8.anInt7577 = arg2;
				Class330_Sub10.aClass471_7588.method5878(var8, (short) 8192);
			}
			var8.anInt7589 = arg4;
			var8.anInt7585 = arg5;
			var8.aClass481_7584 = arg6;
			var8.aBoolean7583 = true;
			var8.aBoolean7586 = false;
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "pv.j(" + ')');
		}
	}

	public static final void method4402(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1224;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "pv.pe(" + ')');
		}
	}
}
