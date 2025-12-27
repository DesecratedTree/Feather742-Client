package deob;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class123_Sub1 extends Class123 {

	public boolean aBoolean8878;

	public float[][] aFloatArrayArray8887;

	public boolean[] aBooleanArray8886;

	public byte[] aByteArray8883;

	public byte[] aByteArray8877;

	public static float[] aFloatArray8880 = new float[16];

	public static int anInt8884 = 1;

	public static int anInt8885 = 0;

	public Class_ra_Sub2_Sub2 aClass_ra_Sub2_Sub2_8882;

	public Class105_Sub1 aClass105_Sub1_8879;

	public long aLong8881;

	public long aLong8888;

	public Class123_Sub1(Class_ra_Sub2_Sub2 arg0, Class118 arg1) {
		this.aBoolean8878 = false;
		this.aFloatArrayArray8887 = new float[2][];
		this.aBooleanArray8886 = new boolean[2];
		this.aString6481 = arg1.aString1391;
		if (arg1.aString1388 != null) {
			this.aString6480 = arg1.aString1388;
			this.aByteArray8883 = arg0.method5169(this.aString6480);
		}
		if (arg1.aString1390 != null) {
			this.aString6482 = arg1.aString1390;
			this.aByteArray8877 = arg0.method5169(this.aString6482);
		}
		arg0.method4993(this);
	}

	public void method1496(int arg0, Class249 arg1) {
		int var3 = arg0 >> 16;
		int var4 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method2509(aFloatArray8880), 0, this.aFloatArrayArray8887[var3], var4, 8);
		this.aBooleanArray8886[var3] = true;
	}

	public void method1494(Class330_Sub15_Sub1 arg0, float[] arg1, int arg2) {
		int var4 = ((Class330_Sub15_Sub1_Sub2) arg0).method3334();
		int var5 = ((Class330_Sub15_Sub1_Sub2) arg0).method3335();
		if (arg0.method3323(1632830751) != Class109.aClass109_1028) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (var4 >= 0) {
			this.method1517(var4, arg1, arg2);
		}
		if (var5 >= 0) {
			this.method1514(var5, arg1, arg2);
		}
	}

	public boolean method1469() {
		if (this.aBoolean8878) {
			return true;
		}
		this.aLong8888 = this.aByteArray8883 == null ? 0L : IDirect3DDevice.CreateVertexShader(this.aClass_ra_Sub2_Sub2_8882.aLong9891, this.aByteArray8883);
		this.aLong8881 = this.aByteArray8877 == null ? 0L : IDirect3DDevice.CreatePixelShader(this.aClass_ra_Sub2_Sub2_8882.aLong9891, this.aByteArray8877);
		if (this.aLong8888 == 0L && this.aLong8881 == 0L) {
			return false;
		}
		int var1 = -1;
		int var2;
		for (var2 = 0; var2 < this.aClass105_Sub1_8879.method1255((byte) 1); var2++) {
			if (this.aClass105_Sub1_8879.method1256(var2, 1814689) == this) {
				var1 = var2;
				break;
			}
		}
		var2 = this.aClass105_Sub1_8879.method1282((byte) 4);
		int var3 = this.aClass105_Sub1_8879.method1279(1709217003);
		int var4;
		Class330_Sub15_Sub1 var5;
		for (var4 = 0; var4 < var2; var4++) {
			var5 = this.aClass105_Sub1_8879.method1298(var4, -929781559);
			var5.method3329(var1);
		}
		for (var4 = 0; var4 < var3; var4++) {
			var5 = this.aClass105_Sub1_8879.method1280(var4, 207187206);
			var5.method3329(var1);
		}
		var4 = 0;
		int var12 = 0;
		int var6 = this.aClass105_Sub1_8879.method1297(this, 468926985);
		for (int var7 = 0; var7 < var2 + var3; var7++) {
			Class330_Sub15_Sub1_Sub2 var8 = (Class330_Sub15_Sub1_Sub2) (var7 < var2 ? this.aClass105_Sub1_8879.method1298(var7, -929781559) : this.aClass105_Sub1_8879.method1280(var7 - var2, -1991034839));
			Class109 var9 = var8.method3323(1632830751);
			int var10 = 1;
			if (var9 == Class109.aClass109_1028) {
				var9 = var8.method3325(-944615731);
				var10 = var8.method3326(2883842);
			}
			switch(var9.anInt1104 * -676635159 * -1162917287) {
				case 7:
				case 51:
				case 62:
				case 118:
					break;
				case 13:
				case 31:
				case 91:
				case 115:
					var10 *= 2;
					break;
				case 17:
				case 28:
				case 79:
				case 81:
					var10 *= 4;
					break;
				case 19:
				case 44:
				case 80:
				case 114:
					var10 *= 3;
					break;
				default:
					var10 = 0;
			}
			int var11;
			if (var8.anIntArray10131[var6] >= 0) {
				var11 = var8.anIntArray10131[var6] + var10;
				if (var4 < var11) {
					var4 = var11;
				}
			}
			if (var8.anIntArray10132[var6] >= 0) {
				var11 = var8.anIntArray10132[var6] + var10;
				if (var12 < var11) {
					var12 = var11;
				}
			}
		}
		this.aFloatArrayArray8887[0] = new float[var4 * 4];
		this.aFloatArrayArray8887[1] = new float[var12 * 4];
		this.aBoolean8878 = true;
		return true;
	}

	public void method1456(Class330_Sub15_Sub1 arg0, float arg1, float arg2) {
		int var4 = ((Class330_Sub15_Sub1_Sub2) arg0).method3334();
		int var5 = ((Class330_Sub15_Sub1_Sub2) arg0).method3335();
		if (arg0.method3323(1632830751) != Class109.aClass109_1149) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (var4 >= 0) {
			var4 *= 4;
			this.aFloatArrayArray8887[0][var4] = arg1;
			this.aFloatArrayArray8887[0][var4 + 1] = arg2;
			this.aBooleanArray8886[0] = true;
		}
		if (var5 >= 0) {
			var5 *= 4;
			this.aFloatArrayArray8887[1][var5] = arg1;
			this.aFloatArrayArray8887[1][var5 + 1] = arg2;
			this.aBooleanArray8886[1] = true;
		}
	}

	public void method1457(Class330_Sub15_Sub1 arg0, float arg1, float arg2, float arg3) {
		int var5 = ((Class330_Sub15_Sub1_Sub2) arg0).method3334();
		int var6 = ((Class330_Sub15_Sub1_Sub2) arg0).method3335();
		if (arg0.method3323(1632830751) != Class109.aClass109_1052) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (var5 >= 0) {
			var5 *= 4;
			this.aFloatArrayArray8887[0][var5] = arg1;
			this.aFloatArrayArray8887[0][var5 + 1] = arg2;
			this.aFloatArrayArray8887[0][var5 + 2] = arg3;
			this.aBooleanArray8886[0] = true;
		}
		if (var6 < 0) {
			return;
		}
		var6 *= 4;
		this.aFloatArrayArray8887[1][var6] = arg1;
		this.aFloatArrayArray8887[1][var6 + 1] = arg2;
		this.aFloatArrayArray8887[1][var6 + 2] = arg3;
		this.aBooleanArray8886[1] = true;
	}

	public void method1475(Class330_Sub15_Sub1 arg0, float arg1, float arg2, float arg3, float arg4) {
		int var6 = ((Class330_Sub15_Sub1_Sub2) arg0).method3334();
		int var7 = ((Class330_Sub15_Sub1_Sub2) arg0).method3335();
		if (arg0.method3323(1632830751) != Class109.aClass109_1027) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (var6 >= 0) {
			var6 *= 4;
			this.aFloatArrayArray8887[0][var6] = arg1;
			this.aFloatArrayArray8887[0][var6 + 1] = arg2;
			this.aFloatArrayArray8887[0][var6 + 2] = arg3;
			this.aFloatArrayArray8887[0][var6 + 3] = arg4;
			this.aBooleanArray8886[0] = true;
		}
		if (var7 < 0) {
			return;
		}
		var7 *= 4;
		this.aFloatArrayArray8887[1][var7] = arg1;
		this.aFloatArrayArray8887[1][var7 + 1] = arg2;
		this.aFloatArrayArray8887[1][var7 + 2] = arg3;
		this.aFloatArrayArray8887[1][var7 + 3] = arg4;
		this.aBooleanArray8886[1] = true;
	}

	public void method1460(Class330_Sub15_Sub1 arg0, Class249 arg1) {
		int var3 = ((Class330_Sub15_Sub1_Sub2) arg0).method3334();
		int var4 = ((Class330_Sub15_Sub1_Sub2) arg0).method3335();
		if (arg0.method3323(1632830751) != Class109.aClass109_1116) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (var3 >= 0) {
			this.method1517(var3, arg1.method2509(aFloatArray8880), 8);
		}
		if (var4 >= 0) {
			this.method1514(var4, arg1.method2509(aFloatArray8880), 8);
		}
	}

	public void method1462(Class330_Sub15_Sub1 arg0, int arg1, Interface11 arg2) {
		this.aClass_ra_Sub2_Sub2_8882.method4955(arg1);
		this.aClass_ra_Sub2_Sub2_8882.method4956(arg2);
	}

	public void method1455(Class330_Sub15_Sub1 arg0, float arg1) {
		int var3 = ((Class330_Sub15_Sub1_Sub2) arg0).method3334();
		int var4 = ((Class330_Sub15_Sub1_Sub2) arg0).method3335();
		if (arg0.method3323(1632830751) != Class109.aClass109_1050 && arg0.method3323(1632830751) != Class109.aClass109_1096) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (var3 >= 0) {
			var3 *= 4;
			this.aFloatArrayArray8887[0][var3] = arg1;
			this.aBooleanArray8886[0] = true;
		}
		if (var4 >= 0) {
			var4 *= 4;
			this.aFloatArrayArray8887[1][var4] = arg1;
			this.aBooleanArray8886[1] = true;
		}
	}

	public boolean method1454() {
		if (this.aBoolean8878) {
			return true;
		}
		this.aLong8888 = this.aByteArray8883 == null ? 0L : IDirect3DDevice.CreateVertexShader(this.aClass_ra_Sub2_Sub2_8882.aLong9891, this.aByteArray8883);
		this.aLong8881 = this.aByteArray8877 == null ? 0L : IDirect3DDevice.CreatePixelShader(this.aClass_ra_Sub2_Sub2_8882.aLong9891, this.aByteArray8877);
		if (this.aLong8888 == 0L && this.aLong8881 == 0L) {
			return false;
		}
		int var1 = -1;
		int var2;
		for (var2 = 0; var2 < this.aClass105_Sub1_8879.method1255((byte) 112); var2++) {
			if (this.aClass105_Sub1_8879.method1256(var2, -1744506044) == this) {
				var1 = var2;
				break;
			}
		}
		var2 = this.aClass105_Sub1_8879.method1282((byte) 4);
		int var3 = this.aClass105_Sub1_8879.method1279(865089682);
		int var4;
		Class330_Sub15_Sub1 var5;
		for (var4 = 0; var4 < var2; var4++) {
			var5 = this.aClass105_Sub1_8879.method1298(var4, -929781559);
			var5.method3329(var1);
		}
		for (var4 = 0; var4 < var3; var4++) {
			var5 = this.aClass105_Sub1_8879.method1280(var4, -1868075267);
			var5.method3329(var1);
		}
		var4 = 0;
		int var12 = 0;
		int var6 = this.aClass105_Sub1_8879.method1297(this, -250560090);
		for (int var7 = 0; var7 < var2 + var3; var7++) {
			Class330_Sub15_Sub1_Sub2 var8 = (Class330_Sub15_Sub1_Sub2) (var7 < var2 ? this.aClass105_Sub1_8879.method1298(var7, -929781559) : this.aClass105_Sub1_8879.method1280(var7 - var2, 749784491));
			Class109 var9 = var8.method3323(1632830751);
			int var10 = 1;
			if (var9 == Class109.aClass109_1028) {
				var9 = var8.method3325(-944615731);
				var10 = var8.method3326(2883842);
			}
			switch(var9.anInt1104) {
				case 7:
				case 51:
				case 62:
				case 118:
					break;
				case 13:
				case 31:
				case 91:
				case 115:
					var10 *= 2;
					break;
				case 17:
				case 28:
				case 79:
				case 81:
					var10 *= 4;
					break;
				case 19:
				case 44:
				case 80:
				case 114:
					var10 *= 3;
					break;
				default:
					var10 = 0;
			}
			int var11;
			if (var8.anIntArray10131[var6] >= 0) {
				var11 = var8.anIntArray10131[var6] + var10;
				if (var4 < var11) {
					var4 = var11;
				}
			}
			if (var8.anIntArray10132[var6] >= 0) {
				var11 = var8.anIntArray10132[var6] + var10;
				if (var12 < var11) {
					var12 = var11;
				}
			}
		}
		this.aFloatArrayArray8887[0] = new float[var4 * 4];
		this.aFloatArrayArray8887[1] = new float[var12 * 4];
		this.aBoolean8878 = true;
		return true;
	}

	public void method1463(int arg0, float arg1, float arg2, float arg3) {
		int var5 = arg0 >> 16;
		int var6 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray8887[var5][var6] = arg1;
		this.aFloatArrayArray8887[var5][var6 + 1] = arg2;
		this.aFloatArrayArray8887[var5][var6 + 2] = arg3;
		this.aBooleanArray8886[var5] = true;
	}

	public void method1502(int arg0, Class249 arg1) {
		int var3 = arg0 >> 16;
		int var4 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method2504(aFloatArray8880), 0, this.aFloatArrayArray8887[var3], var4, 16);
		this.aBooleanArray8886[var3] = true;
	}

	public void method1498(int arg0, Class249 arg1) {
		int var3 = arg0 >> 16;
		int var4 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method2504(aFloatArray8880), 0, this.aFloatArrayArray8887[var3], var4, 12);
		this.aBooleanArray8886[var3] = true;
	}

	public void method1466(int arg0, Class249 arg1) {
		int var3 = arg0 >> 16;
		int var4 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method2509(aFloatArray8880), 0, this.aFloatArrayArray8887[var3], var4, 8);
		this.aBooleanArray8886[var3] = true;
	}

	public void method1467(int arg0, Class249 arg1) {
		int var3 = arg0 >> 16;
		int var4 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method2504(aFloatArray8880), 0, this.aFloatArrayArray8887[var3], var4, 16);
		this.aBooleanArray8886[var3] = true;
	}

	public void method1465(int arg0, float arg1, float arg2, float arg3) {
		int var5 = arg0 >> 16;
		int var6 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray8887[var5][var6] = arg1;
		this.aFloatArrayArray8887[var5][var6 + 1] = arg2;
		this.aFloatArrayArray8887[var5][var6 + 2] = arg3;
		this.aBooleanArray8886[var5] = true;
	}

	public void method1497(Class330_Sub15_Sub1 arg0, Class249 arg1) {
		int var3 = ((Class330_Sub15_Sub1_Sub2) arg0).method3334();
		int var4 = ((Class330_Sub15_Sub1_Sub2) arg0).method3335();
		if (arg0.method3323(1632830751) != Class109.aClass109_1116) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (var3 >= 0) {
			this.method1517(var3, arg1.method2509(aFloatArray8880), 8);
		}
		if (var4 >= 0) {
			this.method1514(var4, arg1.method2509(aFloatArray8880), 8);
		}
	}

	public final void method1514(int arg0, float[] arg1, int arg2) {
		Class453.method5640(arg1, 0, this.aFloatArrayArray8887[1], arg0 * 4, arg2);
		this.aBooleanArray8886[1] = true;
	}

	public void method1453(int arg0, Class249 arg1) {
		int var3 = arg0 >> 16;
		int var4 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method2509(aFloatArray8880), 0, this.aFloatArrayArray8887[var3], var4, 8);
		this.aBooleanArray8886[var3] = true;
	}

	public void method1515() {
		int var1;
		if (this.aBooleanArray8886[0]) {
			for (var1 = 0; var1 < this.aFloatArrayArray8887[0].length; var1++) {
				this.aClass_ra_Sub2_Sub2_8882.anUnsafe8461.putFloat(this.aClass_ra_Sub2_Sub2_8882.aLong8459 + (long) (var1 * 4), this.aFloatArrayArray8887[0][var1]);
			}
			IDirect3DDevice.SetVertexShaderConstantF(this.aClass_ra_Sub2_Sub2_8882.aLong9891, 0, this.aClass_ra_Sub2_Sub2_8882.aLong8459, this.aFloatArrayArray8887[0].length / 4);
			this.aBooleanArray8886[0] = false;
		}
		if (!this.aBooleanArray8886[1]) {
			return;
		}
		for (var1 = 0; var1 < this.aFloatArrayArray8887[1].length; var1++) {
			this.aClass_ra_Sub2_Sub2_8882.anUnsafe8461.putFloat(this.aClass_ra_Sub2_Sub2_8882.aLong8459 + (long) (var1 * 4), this.aFloatArrayArray8887[1][var1]);
		}
		IDirect3DDevice.SetPixelShaderConstantF(this.aClass_ra_Sub2_Sub2_8882.aLong9891, 0, this.aClass_ra_Sub2_Sub2_8882.aLong8459, this.aFloatArrayArray8887[1].length / 4);
		this.aBooleanArray8886[1] = false;
	}

	public void method53() {
		if (this.aLong8888 != 0L) {
			IUnknown.Release(this.aLong8888);
			this.aLong8888 = 0L;
		}
		if (this.aLong8881 != 0L) {
			IUnknown.Release(this.aLong8881);
			this.aLong8881 = 0L;
		}
		this.aClass_ra_Sub2_Sub2_8882.method4883(this);
	}

	public void method1516() {
		if (this.aLong8888 != 0L) {
			this.aClass_ra_Sub2_Sub2_8882.method5173(this.aLong8888);
			this.aLong8888 = 0L;
		}
		if (this.aLong8881 != 0L) {
			this.aClass_ra_Sub2_Sub2_8882.method5173(this.aLong8881);
			this.aLong8881 = 0L;
		}
	}

	public void method52() {
		if (this.aLong8888 != 0L) {
			IUnknown.Release(this.aLong8888);
			this.aLong8888 = 0L;
		}
		if (this.aLong8881 != 0L) {
			IUnknown.Release(this.aLong8881);
			this.aLong8881 = 0L;
		}
		this.aClass_ra_Sub2_Sub2_8882.method4883(this);
	}

	public void method1479(Class330_Sub15_Sub1 arg0, float[] arg1, int arg2) {
		int var4 = ((Class330_Sub15_Sub1_Sub2) arg0).method3334();
		int var5 = ((Class330_Sub15_Sub1_Sub2) arg0).method3335();
		if (arg0.method3323(1632830751) != Class109.aClass109_1028) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (var4 >= 0) {
			this.method1517(var4, arg1, arg2);
		}
		if (var5 >= 0) {
			this.method1514(var5, arg1, arg2);
		}
	}

	public void method1470(Class330_Sub15_Sub1 arg0, float arg1) {
		int var3 = ((Class330_Sub15_Sub1_Sub2) arg0).method3334();
		int var4 = ((Class330_Sub15_Sub1_Sub2) arg0).method3335();
		if (arg0.method3323(1632830751) != Class109.aClass109_1050 && arg0.method3323(1632830751) != Class109.aClass109_1096) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (var3 >= 0) {
			var3 *= 4;
			this.aFloatArrayArray8887[0][var3] = arg1;
			this.aBooleanArray8886[0] = true;
		}
		if (var4 >= 0) {
			var4 *= 4;
			this.aFloatArrayArray8887[1][var4] = arg1;
			this.aBooleanArray8886[1] = true;
		}
	}

	public void method1468(int arg0, int arg1, Interface11 arg2) {
		this.aClass_ra_Sub2_Sub2_8882.method4955(arg1);
		this.aClass_ra_Sub2_Sub2_8882.method4956(arg2);
	}

	public void method1458(Class330_Sub15_Sub1 arg0, float arg1) {
		int var3 = ((Class330_Sub15_Sub1_Sub2) arg0).method3334();
		int var4 = ((Class330_Sub15_Sub1_Sub2) arg0).method3335();
		if (arg0.method3323(1632830751) != Class109.aClass109_1050 && arg0.method3323(1632830751) != Class109.aClass109_1096) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (var3 >= 0) {
			var3 *= 4;
			this.aFloatArrayArray8887[0][var3] = arg1;
			this.aBooleanArray8886[0] = true;
		}
		if (var4 >= 0) {
			var4 *= 4;
			this.aFloatArrayArray8887[1][var4] = arg1;
			this.aBooleanArray8886[1] = true;
		}
	}

	public void method1473(Class330_Sub15_Sub1 arg0, float arg1) {
		int var3 = ((Class330_Sub15_Sub1_Sub2) arg0).method3334();
		int var4 = ((Class330_Sub15_Sub1_Sub2) arg0).method3335();
		if (arg0.method3323(1632830751) != Class109.aClass109_1050 && arg0.method3323(1632830751) != Class109.aClass109_1096) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (var3 >= 0) {
			var3 *= 4;
			this.aFloatArrayArray8887[0][var3] = arg1;
			this.aBooleanArray8886[0] = true;
		}
		if (var4 >= 0) {
			var4 *= 4;
			this.aFloatArrayArray8887[1][var4] = arg1;
			this.aBooleanArray8886[1] = true;
		}
	}

	public void method1474(Class330_Sub15_Sub1 arg0, float arg1, float arg2, float arg3) {
		int var5 = ((Class330_Sub15_Sub1_Sub2) arg0).method3334();
		int var6 = ((Class330_Sub15_Sub1_Sub2) arg0).method3335();
		if (arg0.method3323(1632830751) != Class109.aClass109_1052) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (var5 >= 0) {
			var5 *= 4;
			this.aFloatArrayArray8887[0][var5] = arg1;
			this.aFloatArrayArray8887[0][var5 + 1] = arg2;
			this.aFloatArrayArray8887[0][var5 + 2] = arg3;
			this.aBooleanArray8886[0] = true;
		}
		if (var6 < 0) {
			return;
		}
		var6 *= 4;
		this.aFloatArrayArray8887[1][var6] = arg1;
		this.aFloatArrayArray8887[1][var6 + 1] = arg2;
		this.aFloatArrayArray8887[1][var6 + 2] = arg3;
		this.aBooleanArray8886[1] = true;
	}

	public void method1452(Class330_Sub15_Sub1 arg0, float arg1, float arg2, float arg3) {
		int var5 = ((Class330_Sub15_Sub1_Sub2) arg0).method3334();
		int var6 = ((Class330_Sub15_Sub1_Sub2) arg0).method3335();
		if (arg0.method3323(1632830751) != Class109.aClass109_1052) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (var5 >= 0) {
			var5 *= 4;
			this.aFloatArrayArray8887[0][var5] = arg1;
			this.aFloatArrayArray8887[0][var5 + 1] = arg2;
			this.aFloatArrayArray8887[0][var5 + 2] = arg3;
			this.aBooleanArray8886[0] = true;
		}
		if (var6 < 0) {
			return;
		}
		var6 *= 4;
		this.aFloatArrayArray8887[1][var6] = arg1;
		this.aFloatArrayArray8887[1][var6 + 1] = arg2;
		this.aFloatArrayArray8887[1][var6 + 2] = arg3;
		this.aBooleanArray8886[1] = true;
	}

	public void method1476(Class330_Sub15_Sub1 arg0, float arg1, float arg2, float arg3, float arg4) {
		int var6 = ((Class330_Sub15_Sub1_Sub2) arg0).method3334();
		int var7 = ((Class330_Sub15_Sub1_Sub2) arg0).method3335();
		if (arg0.method3323(1632830751) != Class109.aClass109_1027) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (var6 >= 0) {
			var6 *= 4;
			this.aFloatArrayArray8887[0][var6] = arg1;
			this.aFloatArrayArray8887[0][var6 + 1] = arg2;
			this.aFloatArrayArray8887[0][var6 + 2] = arg3;
			this.aFloatArrayArray8887[0][var6 + 3] = arg4;
			this.aBooleanArray8886[0] = true;
		}
		if (var7 < 0) {
			return;
		}
		var7 *= 4;
		this.aFloatArrayArray8887[1][var7] = arg1;
		this.aFloatArrayArray8887[1][var7 + 1] = arg2;
		this.aFloatArrayArray8887[1][var7 + 2] = arg3;
		this.aFloatArrayArray8887[1][var7 + 3] = arg4;
		this.aBooleanArray8886[1] = true;
	}

	public Class123_Sub1(Class_ra_Sub2_Sub2 arg0, Class105_Sub1 arg1, Class118 arg2) {
		this(arg0, arg2);
		this.aClass_ra_Sub2_Sub2_8882 = arg0;
		this.aClass105_Sub1_8879 = arg1;
	}

	public void method1471(Class330_Sub15_Sub1 arg0, float arg1) {
		int var3 = ((Class330_Sub15_Sub1_Sub2) arg0).method3334();
		int var4 = ((Class330_Sub15_Sub1_Sub2) arg0).method3335();
		if (arg0.method3323(1632830751) != Class109.aClass109_1050 && arg0.method3323(1632830751) != Class109.aClass109_1096) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (var3 >= 0) {
			var3 *= 4;
			this.aFloatArrayArray8887[0][var3] = arg1;
			this.aBooleanArray8886[0] = true;
		}
		if (var4 >= 0) {
			var4 *= 4;
			this.aFloatArrayArray8887[1][var4] = arg1;
			this.aBooleanArray8886[1] = true;
		}
	}

	public final void method1517(int arg0, float[] arg1, int arg2) {
		Class453.method5640(arg1, 0, this.aFloatArrayArray8887[0], arg0 * 4, arg2);
		this.aBooleanArray8886[0] = true;
	}

	public void method1488(int arg0, float[] arg1, int arg2) {
		int var4 = arg0 >> 16;
		int var5 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1, 0, this.aFloatArrayArray8887[var4], var5, arg2);
		this.aBooleanArray8886[var4] = true;
	}

	public void method1495(Class330_Sub15_Sub1 arg0, float[] arg1, int arg2) {
		int var4 = ((Class330_Sub15_Sub1_Sub2) arg0).method3334();
		int var5 = ((Class330_Sub15_Sub1_Sub2) arg0).method3335();
		if (arg0.method3323(1632830751) != Class109.aClass109_1028) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (var4 >= 0) {
			this.method1517(var4, arg1, arg2);
		}
		if (var5 >= 0) {
			this.method1514(var5, arg1, arg2);
		}
	}

	public void method1489(Class330_Sub15_Sub1 arg0, Class249 arg1) {
		int var3 = ((Class330_Sub15_Sub1_Sub2) arg0).method3334();
		int var4 = ((Class330_Sub15_Sub1_Sub2) arg0).method3335();
		if (arg0.method3323(1632830751) != Class109.aClass109_1069) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (var3 >= 0) {
			this.method1517(var3, arg1.method2504(aFloatArray8880), 16);
		}
		if (var4 >= 0) {
			this.method1514(var4, arg1.method2504(aFloatArray8880), 16);
		}
	}

	public void method1483(Class330_Sub15_Sub1 arg0, Class249 arg1) {
		int var3 = ((Class330_Sub15_Sub1_Sub2) arg0).method3334();
		int var4 = ((Class330_Sub15_Sub1_Sub2) arg0).method3335();
		if (arg0.method3323(1632830751) != Class109.aClass109_1069) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (var3 >= 0) {
			this.method1517(var3, arg1.method2504(aFloatArray8880), 16);
		}
		if (var4 >= 0) {
			this.method1514(var4, arg1.method2504(aFloatArray8880), 16);
		}
	}

	public void method1484(Class330_Sub15_Sub1 arg0, Class249 arg1) {
		int var3 = ((Class330_Sub15_Sub1_Sub2) arg0).method3334();
		int var4 = ((Class330_Sub15_Sub1_Sub2) arg0).method3335();
		if (arg0.method3323(1632830751) != Class109.aClass109_1069) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (var3 >= 0) {
			this.method1517(var3, arg1.method2504(aFloatArray8880), 16);
		}
		if (var4 >= 0) {
			this.method1514(var4, arg1.method2504(aFloatArray8880), 16);
		}
	}

	public void method1485(Class330_Sub15_Sub1 arg0, int arg1, Interface11 arg2) {
		this.aClass_ra_Sub2_Sub2_8882.method4955(arg1);
		this.aClass_ra_Sub2_Sub2_8882.method4956(arg2);
	}

	public void method1486(Class330_Sub15_Sub1 arg0, int arg1, Interface11 arg2) {
		this.aClass_ra_Sub2_Sub2_8882.method4955(arg1);
		this.aClass_ra_Sub2_Sub2_8882.method4956(arg2);
	}

	public void method1487(int arg0, float arg1, float arg2, float arg3) {
		int var5 = arg0 >> 16;
		int var6 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray8887[var5][var6] = arg1;
		this.aFloatArrayArray8887[var5][var6 + 1] = arg2;
		this.aFloatArrayArray8887[var5][var6 + 2] = arg3;
		this.aBooleanArray8886[var5] = true;
	}

	public void method1464(int arg0, float arg1, float arg2, float arg3, float arg4) {
		int var6 = arg0 >> 16;
		int var7 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray8887[var6][var7] = arg1;
		this.aFloatArrayArray8887[var6][var7 + 1] = arg2;
		this.aFloatArrayArray8887[var6][var7 + 2] = arg3;
		this.aFloatArrayArray8887[var6][var7 + 3] = arg4;
		this.aBooleanArray8886[var6] = true;
	}

	public void method1472(int arg0, float arg1, float arg2, float arg3) {
		int var5 = arg0 >> 16;
		int var6 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray8887[var5][var6] = arg1;
		this.aFloatArrayArray8887[var5][var6 + 1] = arg2;
		this.aFloatArrayArray8887[var5][var6 + 2] = arg3;
		this.aBooleanArray8886[var5] = true;
	}

	public void method1501(Class330_Sub15_Sub1 arg0, Class249 arg1) {
		int var3 = ((Class330_Sub15_Sub1_Sub2) arg0).method3334();
		int var4 = ((Class330_Sub15_Sub1_Sub2) arg0).method3335();
		if (arg0.method3323(1632830751) != Class109.aClass109_1116) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (var3 >= 0) {
			this.method1517(var3, arg1.method2509(aFloatArray8880), 8);
		}
		if (var4 >= 0) {
			this.method1514(var4, arg1.method2509(aFloatArray8880), 8);
		}
	}

	public void method1503(int arg0, float arg1, float arg2, float arg3, float arg4) {
		int var6 = arg0 >> 16;
		int var7 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray8887[var6][var7] = arg1;
		this.aFloatArrayArray8887[var6][var7 + 1] = arg2;
		this.aFloatArrayArray8887[var6][var7 + 2] = arg3;
		this.aFloatArrayArray8887[var6][var7 + 3] = arg4;
		this.aBooleanArray8886[var6] = true;
	}

	public void method1480(int arg0, float arg1, float arg2, float arg3, float arg4) {
		int var6 = arg0 >> 16;
		int var7 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray8887[var6][var7] = arg1;
		this.aFloatArrayArray8887[var6][var7 + 1] = arg2;
		this.aFloatArrayArray8887[var6][var7 + 2] = arg3;
		this.aFloatArrayArray8887[var6][var7 + 3] = arg4;
		this.aBooleanArray8886[var6] = true;
	}

	public void method1461(Class330_Sub15_Sub1 arg0, Class249 arg1) {
		int var3 = ((Class330_Sub15_Sub1_Sub2) arg0).method3334();
		int var4 = ((Class330_Sub15_Sub1_Sub2) arg0).method3335();
		if (arg0.method3323(1632830751) != Class109.aClass109_1069) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (var3 >= 0) {
			this.method1517(var3, arg1.method2504(aFloatArray8880), 16);
		}
		if (var4 >= 0) {
			this.method1514(var4, arg1.method2504(aFloatArray8880), 16);
		}
	}

	public void method1490(int arg0, Class249 arg1) {
		int var3 = arg0 >> 16;
		int var4 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method2504(aFloatArray8880), 0, this.aFloatArrayArray8887[var3], var4, 12);
		this.aBooleanArray8886[var3] = true;
	}

	public void method1477(Class330_Sub15_Sub1 arg0, float[] arg1, int arg2) {
		int var4 = ((Class330_Sub15_Sub1_Sub2) arg0).method3334();
		int var5 = ((Class330_Sub15_Sub1_Sub2) arg0).method3335();
		if (arg0.method3323(1632830751) != Class109.aClass109_1028) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (var4 >= 0) {
			this.method1517(var4, arg1, arg2);
		}
		if (var5 >= 0) {
			this.method1514(var5, arg1, arg2);
		}
	}

	public void method1482(int arg0, float arg1, float arg2, float arg3, float arg4) {
		int var6 = arg0 >> 16;
		int var7 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray8887[var6][var7] = arg1;
		this.aFloatArrayArray8887[var6][var7 + 1] = arg2;
		this.aFloatArrayArray8887[var6][var7 + 2] = arg3;
		this.aFloatArrayArray8887[var6][var7 + 3] = arg4;
		this.aBooleanArray8886[var6] = true;
	}

	public void method1492(int arg0, Class249 arg1) {
		int var3 = arg0 >> 16;
		int var4 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method2509(aFloatArray8880), 0, this.aFloatArrayArray8887[var3], var4, 8);
		this.aBooleanArray8886[var3] = true;
	}

	public void method1481(int arg0, Class249 arg1) {
		int var3 = arg0 >> 16;
		int var4 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method2509(aFloatArray8880), 0, this.aFloatArrayArray8887[var3], var4, 8);
		this.aBooleanArray8886[var3] = true;
	}

	public void method1500(Class330_Sub15_Sub1 arg0, float arg1, float arg2) {
		int var4 = ((Class330_Sub15_Sub1_Sub2) arg0).method3334();
		int var5 = ((Class330_Sub15_Sub1_Sub2) arg0).method3335();
		if (arg0.method3323(1632830751) != Class109.aClass109_1149) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (var4 >= 0) {
			var4 *= 4;
			this.aFloatArrayArray8887[0][var4] = arg1;
			this.aFloatArrayArray8887[0][var4 + 1] = arg2;
			this.aBooleanArray8886[0] = true;
		}
		if (var5 >= 0) {
			var5 *= 4;
			this.aFloatArrayArray8887[1][var5] = arg1;
			this.aFloatArrayArray8887[1][var5 + 1] = arg2;
			this.aBooleanArray8886[1] = true;
		}
	}

	public void method1478(int arg0, Class249 arg1) {
		int var3 = arg0 >> 16;
		int var4 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method2504(aFloatArray8880), 0, this.aFloatArrayArray8887[var3], var4, 16);
		this.aBooleanArray8886[var3] = true;
	}

	public void method1493(int arg0, float[] arg1, int arg2) {
		int var4 = arg0 >> 16;
		int var5 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1, 0, this.aFloatArrayArray8887[var4], var5, arg2);
		this.aBooleanArray8886[var4] = true;
	}

	public void method1459(int arg0, Class249 arg1) {
		int var3 = arg0 >> 16;
		int var4 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method2504(aFloatArray8880), 0, this.aFloatArrayArray8887[var3], var4, 16);
		this.aBooleanArray8886[var3] = true;
	}

	public void method1504(int arg0, Class249 arg1) {
		int var3 = arg0 >> 16;
		int var4 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method2504(aFloatArray8880), 0, this.aFloatArrayArray8887[var3], var4, 16);
		this.aBooleanArray8886[var3] = true;
	}

	public void method1499(int arg0, int arg1, Interface11 arg2) {
		this.aClass_ra_Sub2_Sub2_8882.method4955(arg1);
		this.aClass_ra_Sub2_Sub2_8882.method4956(arg2);
	}
}
