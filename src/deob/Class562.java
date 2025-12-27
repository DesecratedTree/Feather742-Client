package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;

public class Class562 {

	public static Class562 aClass562_6435 = new Class562();

	public static Class562 aClass562_6436 = new Class562();

	public static IndexTable aClass280_6437;

	public static void method6471(String arg0, boolean arg1, boolean arg2, String arg3, boolean arg4, boolean arg5, byte arg6) {
		try {
			if (arg1) {
				if (!arg4 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
					try {
						Desktop.getDesktop().browse(new URI(arg0));
						return;
					} catch (Exception var8) {
					}
				}
				if (Class212.aString6533.startsWith("win") && !arg4) {
					RuntimeException_Sub2.method6482(arg0, 0, 358284561);
				} else if (Class212.aString6533.startsWith("mac")) {
					Class239.method2379(arg0, 1, arg3, (byte) 0);
				} else {
					RuntimeException_Sub2.method6482(arg0, 2, -1592822800);
				}
			} else {
				RuntimeException_Sub2.method6482(arg0, 3, 351553780);
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "z.j(" + ')');
		}
	}

	public static void method6472(byte arg0) {
		try {
			Class333.aClass316Array3347 = new Class316[50];
			Class333.anInt3360 = 0;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "z.z(" + ')');
		}
	}

	public static byte[] method6473(byte[] arg0, int arg1, int arg2, byte arg3) {
		try {
			byte[] var4;
			if (arg1 > 0) {
				var4 = new byte[arg2];
				for (int var5 = 0; var5 < arg2; var5++) {
					var4[var5] = arg0[arg1 + var5];
				}
			} else {
				var4 = arg0;
			}
			Class502 var8 = new Class502();
			var8.method6130(1744702071);
			var8.method6128(var4, (long) (arg2 * 8));
			byte[] var6 = new byte[64];
			var8.method6131(var6, 0, 97356391);
			return var6;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "z.o(" + ')');
		}
	}

	public static final boolean method6474(int[][] arg0, int[][] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, short arg7) {
		try {
			for (int var8 = arg3; var8 <= arg5; var8++) {
				for (int var9 = arg4; var9 <= arg6; var9++) {
					if (arg2 == arg0[var8][var9] && arg1[var8][var9] <= 1) {
						return true;
					}
				}
			}
			return false;
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "z.it(" + ')');
		}
	}

	public static final void method6475(IComponentDefinitions[] arg0, int arg1, byte arg2) {
		try {
			for (int var3 = 0; var3 < arg0.length; var3++) {
				IComponentDefinitions var4 = arg0[var3];
				if (var4 != null) {
					if (var4.anInt1198 == 0) {
						if (var4.aClass114Array1219 != null) {
							method6475(var4.aClass114Array1219, arg1, (byte) -48);
						}
						Class330_Sub48 var5 = (Class330_Sub48) client.aClass497_9284.method6094((long) var4.anInt1196);
						if (var5 != null) {
							Class527.method6268(var5.anInt7859, arg1, (byte) 125);
						}
					}
					Class330_Sub42 var7;
					if (arg1 == 0 && var4.anObjectArray1330 != null) {
						var7 = new Class330_Sub42();
						var7.aClass114_7809 = var4;
						var7.anObjectArray7817 = var4.anObjectArray1330;
						Class117.method1423(var7, -1631194987);
					}
					if (arg1 == 1 && var4.anObjectArray1288 != null) {
						if (var4.anInt1287 >= 0) {
							IComponentDefinitions var8 = Class95.method1101(var4.anInt1196, -1797245165);
							if (var8 == null || var8.aClass114Array1347 == null || var4.anInt1287 >= var8.aClass114Array1347.length) {
								continue;
							}
							if (var8.aClass114Array1347[var4.anInt1287] != var4) {
								if (arg2 >= 0) {
									throw new IllegalStateException();
								}
								continue;
							}
						}
						var7 = new Class330_Sub42();
						var7.aClass114_7809 = var4;
						var7.anObjectArray7817 = var4.anObjectArray1288;
						Class117.method1423(var7, -1631194987);
					}
				} else if (arg2 >= 0) {
					throw new IllegalStateException();
				}
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "z.lk(" + ')');
		}
	}

	public static float method6476(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7) {
		try {
			float var8 = 0.0F;
			float var9 = arg3 - arg0;
			float var10 = arg4 - arg1;
			float var11 = arg5 - arg2;
			float var12 = 0.0F;
			float var13 = 0.0F;
			float var14 = 0.0F;
			Class356 var15 = client.aClass304_9030.method3023(-400722441);
			while (var8 < 1.1F) {
				float var16 = var9 * var8 + arg0;
				float var17 = arg1 + var10 * var8;
				float var18 = arg2 + var11 * var8;
				int var19 = (int) var16 >> 9;
				int var20 = (int) var18 >> 9;
				if (var19 > 0 && var20 > 0 && var19 < client.aClass304_9030.method2990(-1101883407) && var20 < client.aClass304_9030.method3033((byte) -52)) {
					int var21 = Class263_Sub2.myPlayer.aByte8658;
					if (var21 < 3 && (client.aClass304_9030.method2995(751555154).aByteArrayArrayArray2916[1][var19][var20] & 0x2) != 0) {
						var21++;
					}
					int var22 = var15.aClass_xaArray3701[var21].method6416((int) var16, (int) var18, 113779001);
					if ((float) var22 < var17) {
						if (arg6 >= 2) {
							return var8 - 0.1F + method6476(var12, var13, var14, var16, var17, var18, arg6 - 1, 1655677594) * 0.1F;
						}
						return var8;
					}
				}
				var12 = var16;
				var13 = var17;
				var14 = var18;
				var8 += 0.1F;
			}
			return -1.0F;
		} catch (RuntimeException var23) {
			throw Class476.method5964(var23, "z.bu(" + ')');
		}
	}

	public static final void method6477(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class450.method5630(var3, var4, arg0, -835107449);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "z.hf(" + ')');
		}
	}
}
