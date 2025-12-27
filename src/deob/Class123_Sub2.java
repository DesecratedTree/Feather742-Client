package deob;

import jaggl.OpenGL;

public class Class123_Sub2 extends Class123 {

	public static int anInt8890 = 35632;

	public static int anInt8891 = 13;

	public static int anInt8898 = 1;

	public static boolean aBoolean8901 = !Class123_Sub2.class.desiredAssertionStatus();

	public static int[] anIntArray8889 = new int[2];

	public static float[] aFloatArray8900 = new float[16];

	public int anInt8906;

	public int anInt8908;

	public int anInt8896;

	public boolean aBoolean8895;

	public int[] anIntArray8897;

	public String aString8905;

	public String aString8907;

	public Class105_Sub2 aClass105_Sub2_8893;

	public Class_ra_Sub2_Sub1 aClass_ra_Sub2_Sub1_8892;

	public float[] aFloatArray8899;

	public float[] aFloatArray8902;

	public float[] aFloatArray8903;

	public float[] aFloatArray8904;

	public int[] anIntArray8894;

	public Class123_Sub2(Class_ra_Sub2_Sub1 arg0, Class118 arg1) {
		this.anInt8906 = 0;
		this.anInt8908 = 0;
		this.anInt8896 = 0;
		this.aBoolean8895 = false;
		this.anIntArray8897 = new int[13];
		this.aString6481 = arg1.aString1391;
		StringBuilder var3 = new StringBuilder();
		Class100[] var4;
		int var5;
		Class100 var6;
		if (arg1.aString1388 != null) {
			this.aString6480 = arg1.aString1388;
			if (arg1.aClass100Array1392 != null) {
				var4 = arg1.aClass100Array1392;
				for (var5 = 0; var5 < var4.length; var5++) {
					var6 = var4[var5];
					var3.append("#define " + var6.aString919 + " " + var6.aString920 + '\n');
				}
			}
			var3.append(new String(arg0.method5148(this.aString6480)));
			this.aString8905 = var3.toString();
		}
		if (arg1.aString1390 != null) {
			this.aString6482 = arg1.aString1390;
			var3.setLength(0);
			if (arg1.aClass100Array1389 != null) {
				var4 = arg1.aClass100Array1389;
				for (var5 = 0; var5 < var4.length; var5++) {
					var6 = var4[var5];
					var3.append("#define " + var6.aString919 + " " + var6.aString920 + '\n');
				}
			}
			var3.append(new String(arg0.method5148(this.aString6482)));
			this.aString8907 = var3.toString();
		}
		Class453.method5643(this.anIntArray8897, 0, this.anIntArray8897.length, -1);
	}

	public void method1490(int arg0, Class249 arg1) {
		OpenGL.glUniform3fv(arg0, 3, arg1.method2503(aFloatArray8900), 0);
	}

	public boolean method1454() {
		if (this.aBoolean8895) {
			return true;
		}
		this.aClass_ra_Sub2_Sub1_8892.aClass123_Sub2_9875 = null;
		this.anInt8908 = this.method1518(35633, this.aString8905, this.aString6480);
		this.anInt8896 = this.method1518(35632, this.aString8907, this.aString6482);
		if (this.anInt8908 == 0 || this.anInt8896 == 0) {
			if (this.anInt8908 != 0) {
				OpenGL.glDeleteShader(this.anInt8908);
			}
			if (this.anInt8896 != 0) {
				OpenGL.glDeleteShader(this.anInt8896);
			}
			return false;
		}
		this.anInt8906 = OpenGL.glCreateProgram();
		if (this.anInt8908 != 0) {
			OpenGL.glAttachShader(this.anInt8906, this.anInt8908);
		}
		if (this.anInt8896 != 0) {
			OpenGL.glAttachShader(this.anInt8906, this.anInt8896);
		}
		OpenGL.glLinkProgram(this.anInt8906);
		OpenGL.glGetProgramiv(this.anInt8906, 35714, anIntArray8889, 0);
		if (anIntArray8889[0] == 0) {
			if (this.anInt8908 != 0) {
				OpenGL.glDetachShader(this.anInt8906, this.anInt8908);
				OpenGL.glDeleteShader(this.anInt8908);
			}
			if (this.anInt8896 != 0) {
				OpenGL.glDetachShader(this.anInt8906, this.anInt8896);
				OpenGL.glDeleteShader(this.anInt8896);
			}
			OpenGL.glDeleteProgram(this.anInt8906);
			return false;
		}
		OpenGL.glUseProgram(this.anInt8906);
		int var1 = -1;
		int var2;
		for (var2 = 0; var2 < this.aClass105_Sub2_8893.method1255((byte) -26); var2++) {
			if (this.aClass105_Sub2_8893.method1256(var2, -1260254540) == this) {
				var1 = var2;
				break;
			}
		}
		if (var1 == -1) {
			return false;
		}
		var2 = 0;
		int var3 = 0;
		int var4;
		Class330_Sub15_Sub1 var5;
		Class109 var6;
		int var7;
		for (var4 = 0; var4 < this.aClass105_Sub2_8893.method1282((byte) 4); var4++) {
			var5 = this.aClass105_Sub2_8893.method1298(var4, -929781559);
			if (var5 != null) {
				var5.method3329(var1);
				var6 = var5.method3323(1632830751);
				var7 = ((Class330_Sub15_Sub1_Sub1) var5).anIntArray10129[var1];
				if (var6 == Class109.aClass109_1050 || var6 == Class109.aClass109_1096 || var6 == Class109.aClass109_1149 || var6 == Class109.aClass109_1052 || var6 == Class109.aClass109_1027) {
					var2 = Math.max(var7, var2);
				} else {
					var3 = Math.max(var7, var3);
				}
			}
		}
		for (var4 = 0; var4 < this.aClass105_Sub2_8893.method1279(-498540798); var4++) {
			var5 = this.aClass105_Sub2_8893.method1280(var4, -1974573142);
			if (var5 != null) {
				var5.method3329(var1);
				var6 = var5.method3323(1632830751);
				var7 = ((Class330_Sub15_Sub1_Sub1) var5).anIntArray10129[var1];
				if (var6 == Class109.aClass109_1050 || var6 == Class109.aClass109_1096 || var6 == Class109.aClass109_1149 || var6 == Class109.aClass109_1052 || var6 == Class109.aClass109_1027) {
					var2 = Math.max(var7, var2);
				} else {
					var3 = Math.max(var7, var3);
				}
			}
		}
		this.aFloatArray8903 = new float[var2 + 1];
		this.aFloatArray8902 = new float[var2 + 1];
		this.aFloatArray8899 = new float[var2 + 1];
		this.aFloatArray8904 = new float[var2 + 1];
		this.anIntArray8894 = new int[var3 + 1];
		for (var4 = 0; var4 < this.anIntArray8894.length; var4++) {
			this.anIntArray8894[var4] = -1;
		}
		this.aString8905 = null;
		this.aString8907 = null;
		this.aBoolean8895 = true;
		return true;
	}

	public void method1456(Class330_Sub15_Sub1 arg0, float arg1, float arg2) {
		int var4 = ((Class330_Sub15_Sub1_Sub1) arg0).method3333();
		if (var4 == -1 || this.aFloatArray8903[var4] == arg1 && this.aFloatArray8902[var4] == arg2) {
			return;
		}
		this.aFloatArray8903[var4] = arg1;
		this.aFloatArray8902[var4] = arg2;
		if (arg0.method3323(1632830751) != Class109.aClass109_1149) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform2f(var4, arg1, arg2);
	}

	public void method1489(Class330_Sub15_Sub1 arg0, Class249 arg1) {
		if (!aBoolean8901 && arg0.method3323(1632830751) != Class109.aClass109_1069) {
			throw new AssertionError();
		}
		int var3 = ((Class330_Sub15_Sub1_Sub1) arg0).method3333();
		if (var3 != -1) {
			OpenGL.glUniform4fv(var3, 4, arg1.method2514(aFloatArray8900), 0);
		}
	}

	public void method1471(Class330_Sub15_Sub1 arg0, float arg1) {
		int var3 = ((Class330_Sub15_Sub1_Sub1) arg0).method3333();
		if (var3 == -1 || this.aFloatArray8903[var3] == arg1) {
			return;
		}
		this.aFloatArray8903[var3] = arg1;
		if (arg0.method3323(1632830751) != Class109.aClass109_1050 && arg0.method3323(1632830751) != Class109.aClass109_1096) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform1f(var3, arg1);
	}

	public void method1496(int arg0, Class249 arg1) {
		OpenGL.glUniform2fv(arg0, 4, arg1.method2505(aFloatArray8900), 0);
	}

	public void method1460(Class330_Sub15_Sub1 arg0, Class249 arg1) {
		if (!aBoolean8901 && arg0.method3323(1632830751) != Class109.aClass109_1116) {
			throw new AssertionError();
		}
		int var3 = ((Class330_Sub15_Sub1_Sub1) arg0).method3333();
		if (var3 != -1) {
			OpenGL.glUniform2fv(var3, 4, arg1.method2505(aFloatArray8900), 0);
		}
	}

	public void method1461(Class330_Sub15_Sub1 arg0, Class249 arg1) {
		if (!aBoolean8901 && arg0.method3323(1632830751) != Class109.aClass109_1069) {
			throw new AssertionError();
		}
		int var3 = ((Class330_Sub15_Sub1_Sub1) arg0).method3333();
		if (var3 != -1) {
			OpenGL.glUniform4fv(var3, 4, arg1.method2514(aFloatArray8900), 0);
		}
	}

	public void method1462(Class330_Sub15_Sub1 arg0, int arg1, Interface11 arg2) {
		int var4 = ((Class330_Sub15_Sub1_Sub1) arg0).method3333();
		if (var4 == -1) {
			return;
		}
		if (arg2 == null) {
			arg2 = this.aClass_ra_Sub2_Sub1_8892.anInterface11_Impl3_8551;
		}
		if (arg1 < this.aClass_ra_Sub2_Sub1_8892.anInt8592) {
			this.aClass_ra_Sub2_Sub1_8892.method4955(arg1);
			this.aClass_ra_Sub2_Sub1_8892.method4956(arg2);
		} else {
			OpenGL.glActiveTexture(arg1 + 33984);
			OpenGL.glBindTexture(((Class287) arg2).anInt6554, ((Class287) arg2).anInt6551);
		}
		if (this.anIntArray8894[var4] != arg1) {
			this.anIntArray8894[var4] = arg1;
			OpenGL.glUniform1i(var4, arg1);
		}
	}

	public void method1463(int arg0, float arg1, float arg2, float arg3) {
		OpenGL.glUniform3f(arg0, arg1, arg2, arg3);
	}

	public void method1464(int arg0, float arg1, float arg2, float arg3, float arg4) {
		OpenGL.glUniform4f(arg0, arg1, arg2, arg3, arg4);
	}

	public void method1488(int arg0, float[] arg1, int arg2) {
		OpenGL.glUniform4fv(arg0, arg2, arg1, 0);
	}

	public void method1498(int arg0, Class249 arg1) {
		OpenGL.glUniform3fv(arg0, 3, arg1.method2503(aFloatArray8900), 0);
	}

	public void method1480(int arg0, float arg1, float arg2, float arg3, float arg4) {
		OpenGL.glUniform4f(arg0, arg1, arg2, arg3, arg4);
	}

	public void method1467(int arg0, Class249 arg1) {
		OpenGL.glUniform4fv(arg0, 4, arg1.method2514(aFloatArray8900), 0);
	}

	public void method1484(Class330_Sub15_Sub1 arg0, Class249 arg1) {
		if (!aBoolean8901 && arg0.method3323(1632830751) != Class109.aClass109_1069) {
			throw new AssertionError();
		}
		int var3 = ((Class330_Sub15_Sub1_Sub1) arg0).method3333();
		if (var3 != -1) {
			OpenGL.glUniform4fv(var3, 4, arg1.method2514(aFloatArray8900), 0);
		}
	}

	public void method53() {
		if (this.anInt8906 == 0) {
			return;
		}
		this.aClass_ra_Sub2_Sub1_8892.method5146(this.anInt8906);
		if (this.anInt8908 != 0) {
			this.aClass_ra_Sub2_Sub1_8892.method5145((long) this.anInt8908);
		}
		if (this.anInt8896 != 0) {
			this.aClass_ra_Sub2_Sub1_8892.method5145((long) this.anInt8896);
		}
		this.anInt8906 = 0;
		this.anInt8908 = 0;
		this.anInt8896 = 0;
	}

	public void method1494(Class330_Sub15_Sub1 arg0, float[] arg1, int arg2) {
		int var4 = ((Class330_Sub15_Sub1_Sub1) arg0).method3333();
		if (var4 != -1) {
			OpenGL.glUniform4fv(var4, arg2, arg1, 0);
		}
	}

	public void method52() {
		if (this.anInt8906 == 0) {
			return;
		}
		this.aClass_ra_Sub2_Sub1_8892.method5146(this.anInt8906);
		if (this.anInt8908 != 0) {
			this.aClass_ra_Sub2_Sub1_8892.method5145((long) this.anInt8908);
		}
		if (this.anInt8896 != 0) {
			this.aClass_ra_Sub2_Sub1_8892.method5145((long) this.anInt8896);
		}
		this.anInt8906 = 0;
		this.anInt8908 = 0;
		this.anInt8896 = 0;
	}

	public void method1475(Class330_Sub15_Sub1 arg0, float arg1, float arg2, float arg3, float arg4) {
		int var6 = ((Class330_Sub15_Sub1_Sub1) arg0).method3333();
		if (var6 == -1 || this.aFloatArray8903[var6] == arg1 && this.aFloatArray8902[var6] == arg2 && this.aFloatArray8899[var6] == arg3 && this.aFloatArray8904[var6] == arg4) {
			return;
		}
		this.aFloatArray8903[var6] = arg1;
		this.aFloatArray8902[var6] = arg2;
		this.aFloatArray8899[var6] = arg3;
		this.aFloatArray8904[var6] = arg4;
		if (arg0.method3323(1632830751) != Class109.aClass109_1027) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform4f(var6, arg1, arg2, arg3, arg4);
	}

	public int method1518(int arg0, String arg1, String arg2) {
		if (arg1 == null) {
			return 0;
		}
		int var4 = OpenGL.glCreateShader(arg0);
		OpenGL.glShaderSource(var4, arg1);
		OpenGL.glCompileShader(var4);
		OpenGL.glGetShaderiv(var4, 35713, anIntArray8889, 0);
		if (anIntArray8889[0] == 0) {
			OpenGL.glDeleteShader(var4);
			var4 = 0;
		}
		return var4;
	}

	public boolean method1469() {
		if (this.aBoolean8895) {
			return true;
		}
		this.aClass_ra_Sub2_Sub1_8892.aClass123_Sub2_9875 = null;
		this.anInt8908 = this.method1518(35633, this.aString8905, this.aString6480);
		this.anInt8896 = this.method1518(35632, this.aString8907, this.aString6482);
		if (this.anInt8908 == 0 || this.anInt8896 == 0) {
			if (this.anInt8908 != 0) {
				OpenGL.glDeleteShader(this.anInt8908);
			}
			if (this.anInt8896 != 0) {
				OpenGL.glDeleteShader(this.anInt8896);
			}
			return false;
		}
		this.anInt8906 = OpenGL.glCreateProgram();
		if (this.anInt8908 != 0) {
			OpenGL.glAttachShader(this.anInt8906, this.anInt8908);
		}
		if (this.anInt8896 != 0) {
			OpenGL.glAttachShader(this.anInt8906, this.anInt8896);
		}
		OpenGL.glLinkProgram(this.anInt8906);
		OpenGL.glGetProgramiv(this.anInt8906, 35714, anIntArray8889, 0);
		if (anIntArray8889[0] == 0) {
			if (this.anInt8908 != 0) {
				OpenGL.glDetachShader(this.anInt8906, this.anInt8908);
				OpenGL.glDeleteShader(this.anInt8908);
			}
			if (this.anInt8896 != 0) {
				OpenGL.glDetachShader(this.anInt8906, this.anInt8896);
				OpenGL.glDeleteShader(this.anInt8896);
			}
			OpenGL.glDeleteProgram(this.anInt8906);
			return false;
		}
		OpenGL.glUseProgram(this.anInt8906);
		int var1 = -1;
		int var2;
		for (var2 = 0; var2 < this.aClass105_Sub2_8893.method1255((byte) 22); var2++) {
			if (this.aClass105_Sub2_8893.method1256(var2, -508368673) == this) {
				var1 = var2;
				break;
			}
		}
		if (var1 == -1) {
			return false;
		}
		var2 = 0;
		int var3 = 0;
		int var4;
		Class330_Sub15_Sub1 var5;
		Class109 var6;
		int var7;
		for (var4 = 0; var4 < this.aClass105_Sub2_8893.method1282((byte) 4); var4++) {
			var5 = this.aClass105_Sub2_8893.method1298(var4, -929781559);
			if (var5 != null) {
				var5.method3329(var1);
				var6 = var5.method3323(1632830751);
				var7 = ((Class330_Sub15_Sub1_Sub1) var5).anIntArray10129[var1];
				if (var6 == Class109.aClass109_1050 || var6 == Class109.aClass109_1096 || var6 == Class109.aClass109_1149 || var6 == Class109.aClass109_1052 || var6 == Class109.aClass109_1027) {
					var2 = Math.max(var7, var2);
				} else {
					var3 = Math.max(var7, var3);
				}
			}
		}
		for (var4 = 0; var4 < this.aClass105_Sub2_8893.method1279(373853230); var4++) {
			var5 = this.aClass105_Sub2_8893.method1280(var4, -436882078);
			if (var5 != null) {
				var5.method3329(var1);
				var6 = var5.method3323(1632830751);
				var7 = ((Class330_Sub15_Sub1_Sub1) var5).anIntArray10129[var1];
				if (var6 == Class109.aClass109_1050 || var6 == Class109.aClass109_1096 || var6 == Class109.aClass109_1149 || var6 == Class109.aClass109_1052 || var6 == Class109.aClass109_1027) {
					var2 = Math.max(var7, var2);
				} else {
					var3 = Math.max(var7, var3);
				}
			}
		}
		this.aFloatArray8903 = new float[var2 + 1];
		this.aFloatArray8902 = new float[var2 + 1];
		this.aFloatArray8899 = new float[var2 + 1];
		this.aFloatArray8904 = new float[var2 + 1];
		this.anIntArray8894 = new int[var3 + 1];
		for (var4 = 0; var4 < this.anIntArray8894.length; var4++) {
			this.anIntArray8894[var4] = -1;
		}
		this.aString8905 = null;
		this.aString8907 = null;
		this.aBoolean8895 = true;
		return true;
	}

	public void method1455(Class330_Sub15_Sub1 arg0, float arg1) {
		int var3 = ((Class330_Sub15_Sub1_Sub1) arg0).method3333();
		if (var3 == -1 || this.aFloatArray8903[var3] == arg1) {
			return;
		}
		this.aFloatArray8903[var3] = arg1;
		if (arg0.method3323(1632830751) != Class109.aClass109_1050 && arg0.method3323(1632830751) != Class109.aClass109_1096) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform1f(var3, arg1);
	}

	public void method1468(int arg0, int arg1, Interface11 arg2) {
		this.aClass_ra_Sub2_Sub1_8892.method4955(arg1);
		this.aClass_ra_Sub2_Sub1_8892.method4956(arg2);
		OpenGL.glUniform1i(arg0, arg1);
	}

	public void method1473(Class330_Sub15_Sub1 arg0, float arg1) {
		int var3 = ((Class330_Sub15_Sub1_Sub1) arg0).method3333();
		if (var3 == -1 || this.aFloatArray8903[var3] == arg1) {
			return;
		}
		this.aFloatArray8903[var3] = arg1;
		if (arg0.method3323(1632830751) != Class109.aClass109_1050 && arg0.method3323(1632830751) != Class109.aClass109_1096) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform1f(var3, arg1);
	}

	public void method1474(Class330_Sub15_Sub1 arg0, float arg1, float arg2, float arg3) {
		int var5 = ((Class330_Sub15_Sub1_Sub1) arg0).method3333();
		if (var5 == -1 || this.aFloatArray8903[var5] == arg1 && this.aFloatArray8902[var5] == arg2 && this.aFloatArray8899[var5] == arg3) {
			return;
		}
		this.aFloatArray8903[var5] = arg1;
		this.aFloatArray8902[var5] = arg2;
		this.aFloatArray8899[var5] = arg3;
		if (arg0.method3323(1632830751) != Class109.aClass109_1052) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform3f(var5, arg1, arg2, arg3);
	}

	public void method1452(Class330_Sub15_Sub1 arg0, float arg1, float arg2, float arg3) {
		int var5 = ((Class330_Sub15_Sub1_Sub1) arg0).method3333();
		if (var5 == -1 || this.aFloatArray8903[var5] == arg1 && this.aFloatArray8902[var5] == arg2 && this.aFloatArray8899[var5] == arg3) {
			return;
		}
		this.aFloatArray8903[var5] = arg1;
		this.aFloatArray8902[var5] = arg2;
		this.aFloatArray8899[var5] = arg3;
		if (arg0.method3323(1632830751) != Class109.aClass109_1052) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform3f(var5, arg1, arg2, arg3);
	}

	public void method1476(Class330_Sub15_Sub1 arg0, float arg1, float arg2, float arg3, float arg4) {
		int var6 = ((Class330_Sub15_Sub1_Sub1) arg0).method3333();
		if (var6 == -1 || this.aFloatArray8903[var6] == arg1 && this.aFloatArray8902[var6] == arg2 && this.aFloatArray8899[var6] == arg3 && this.aFloatArray8904[var6] == arg4) {
			return;
		}
		this.aFloatArray8903[var6] = arg1;
		this.aFloatArray8902[var6] = arg2;
		this.aFloatArray8899[var6] = arg3;
		this.aFloatArray8904[var6] = arg4;
		if (arg0.method3323(1632830751) != Class109.aClass109_1027) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform4f(var6, arg1, arg2, arg3, arg4);
	}

	public void method1477(Class330_Sub15_Sub1 arg0, float[] arg1, int arg2) {
		int var4 = ((Class330_Sub15_Sub1_Sub1) arg0).method3333();
		if (var4 != -1) {
			OpenGL.glUniform4fv(var4, arg2, arg1, 0);
		}
	}

	public void method1479(Class330_Sub15_Sub1 arg0, float[] arg1, int arg2) {
		int var4 = ((Class330_Sub15_Sub1_Sub1) arg0).method3333();
		if (var4 != -1) {
			OpenGL.glUniform4fv(var4, arg2, arg1, 0);
		}
	}

	public void method1501(Class330_Sub15_Sub1 arg0, Class249 arg1) {
		if (!aBoolean8901 && arg0.method3323(1632830751) != Class109.aClass109_1116) {
			throw new AssertionError();
		}
		int var3 = ((Class330_Sub15_Sub1_Sub1) arg0).method3333();
		if (var3 != -1) {
			OpenGL.glUniform2fv(var3, 4, arg1.method2505(aFloatArray8900), 0);
		}
	}

	public void method1495(Class330_Sub15_Sub1 arg0, float[] arg1, int arg2) {
		int var4 = ((Class330_Sub15_Sub1_Sub1) arg0).method3333();
		if (var4 != -1) {
			OpenGL.glUniform4fv(var4, arg2, arg1, 0);
		}
	}

	public void method1466(int arg0, Class249 arg1) {
		OpenGL.glUniform2fv(arg0, 4, arg1.method2505(aFloatArray8900), 0);
	}

	public void method1483(Class330_Sub15_Sub1 arg0, Class249 arg1) {
		if (!aBoolean8901 && arg0.method3323(1632830751) != Class109.aClass109_1069) {
			throw new AssertionError();
		}
		int var3 = ((Class330_Sub15_Sub1_Sub1) arg0).method3333();
		if (var3 != -1) {
			OpenGL.glUniform4fv(var3, 4, arg1.method2514(aFloatArray8900), 0);
		}
	}

	public void method1481(int arg0, Class249 arg1) {
		OpenGL.glUniform2fv(arg0, 4, arg1.method2505(aFloatArray8900), 0);
	}

	public void method1485(Class330_Sub15_Sub1 arg0, int arg1, Interface11 arg2) {
		int var4 = ((Class330_Sub15_Sub1_Sub1) arg0).method3333();
		if (var4 == -1) {
			return;
		}
		if (arg2 == null) {
			arg2 = this.aClass_ra_Sub2_Sub1_8892.anInterface11_Impl3_8551;
		}
		if (arg1 < this.aClass_ra_Sub2_Sub1_8892.anInt8592) {
			this.aClass_ra_Sub2_Sub1_8892.method4955(arg1);
			this.aClass_ra_Sub2_Sub1_8892.method4956(arg2);
		} else {
			OpenGL.glActiveTexture(arg1 + 33984);
			OpenGL.glBindTexture(((Class287) arg2).anInt6554, ((Class287) arg2).anInt6551);
		}
		if (this.anIntArray8894[var4] != arg1) {
			this.anIntArray8894[var4] = arg1;
			OpenGL.glUniform1i(var4, arg1);
		}
	}

	public void method1486(Class330_Sub15_Sub1 arg0, int arg1, Interface11 arg2) {
		int var4 = ((Class330_Sub15_Sub1_Sub1) arg0).method3333();
		if (var4 == -1) {
			return;
		}
		if (arg2 == null) {
			arg2 = this.aClass_ra_Sub2_Sub1_8892.anInterface11_Impl3_8551;
		}
		if (arg1 < this.aClass_ra_Sub2_Sub1_8892.anInt8592) {
			this.aClass_ra_Sub2_Sub1_8892.method4955(arg1);
			this.aClass_ra_Sub2_Sub1_8892.method4956(arg2);
		} else {
			OpenGL.glActiveTexture(arg1 + 33984);
			OpenGL.glBindTexture(((Class287) arg2).anInt6554, ((Class287) arg2).anInt6551);
		}
		if (this.anIntArray8894[var4] != arg1) {
			this.anIntArray8894[var4] = arg1;
			OpenGL.glUniform1i(var4, arg1);
		}
	}

	public void method1487(int arg0, float arg1, float arg2, float arg3) {
		OpenGL.glUniform3f(arg0, arg1, arg2, arg3);
	}

	public void method1497(Class330_Sub15_Sub1 arg0, Class249 arg1) {
		if (!aBoolean8901 && arg0.method3323(1632830751) != Class109.aClass109_1116) {
			throw new AssertionError();
		}
		int var3 = ((Class330_Sub15_Sub1_Sub1) arg0).method3333();
		if (var3 != -1) {
			OpenGL.glUniform2fv(var3, 4, arg1.method2505(aFloatArray8900), 0);
		}
	}

	public void method1472(int arg0, float arg1, float arg2, float arg3) {
		OpenGL.glUniform3f(arg0, arg1, arg2, arg3);
	}

	public void method1482(int arg0, float arg1, float arg2, float arg3, float arg4) {
		OpenGL.glUniform4f(arg0, arg1, arg2, arg3, arg4);
	}

	public void method1503(int arg0, float arg1, float arg2, float arg3, float arg4) {
		OpenGL.glUniform4f(arg0, arg1, arg2, arg3, arg4);
	}

	public Class123_Sub2(Class_ra_Sub2_Sub1 arg0, Class105_Sub2 arg1, Class118 arg2) {
		this(arg0, arg2);
		this.aClass105_Sub2_8893 = arg1;
		this.aClass_ra_Sub2_Sub1_8892 = arg0;
	}

	public void method1493(int arg0, float[] arg1, int arg2) {
		OpenGL.glUniform4fv(arg0, arg2, arg1, 0);
	}

	public void method1465(int arg0, float arg1, float arg2, float arg3) {
		OpenGL.glUniform3f(arg0, arg1, arg2, arg3);
	}

	public void method1453(int arg0, Class249 arg1) {
		OpenGL.glUniform2fv(arg0, 4, arg1.method2505(aFloatArray8900), 0);
	}

	public void method1457(Class330_Sub15_Sub1 arg0, float arg1, float arg2, float arg3) {
		int var5 = ((Class330_Sub15_Sub1_Sub1) arg0).method3333();
		if (var5 == -1 || this.aFloatArray8903[var5] == arg1 && this.aFloatArray8902[var5] == arg2 && this.aFloatArray8899[var5] == arg3) {
			return;
		}
		this.aFloatArray8903[var5] = arg1;
		this.aFloatArray8902[var5] = arg2;
		this.aFloatArray8899[var5] = arg3;
		if (arg0.method3323(1632830751) != Class109.aClass109_1052) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform3f(var5, arg1, arg2, arg3);
	}

	public void method1492(int arg0, Class249 arg1) {
		OpenGL.glUniform2fv(arg0, 4, arg1.method2505(aFloatArray8900), 0);
	}

	public void method1500(Class330_Sub15_Sub1 arg0, float arg1, float arg2) {
		int var4 = ((Class330_Sub15_Sub1_Sub1) arg0).method3333();
		if (var4 == -1 || this.aFloatArray8903[var4] == arg1 && this.aFloatArray8902[var4] == arg2) {
			return;
		}
		this.aFloatArray8903[var4] = arg1;
		this.aFloatArray8902[var4] = arg2;
		if (arg0.method3323(1632830751) != Class109.aClass109_1149) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform2f(var4, arg1, arg2);
	}

	public void method1499(int arg0, int arg1, Interface11 arg2) {
		this.aClass_ra_Sub2_Sub1_8892.method4955(arg1);
		this.aClass_ra_Sub2_Sub1_8892.method4956(arg2);
		OpenGL.glUniform1i(arg0, arg1);
	}

	public void method1458(Class330_Sub15_Sub1 arg0, float arg1) {
		int var3 = ((Class330_Sub15_Sub1_Sub1) arg0).method3333();
		if (var3 == -1 || this.aFloatArray8903[var3] == arg1) {
			return;
		}
		this.aFloatArray8903[var3] = arg1;
		if (arg0.method3323(1632830751) != Class109.aClass109_1050 && arg0.method3323(1632830751) != Class109.aClass109_1096) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform1f(var3, arg1);
	}

	public void method1478(int arg0, Class249 arg1) {
		OpenGL.glUniform4fv(arg0, 4, arg1.method2514(aFloatArray8900), 0);
	}

	public void method1502(int arg0, Class249 arg1) {
		OpenGL.glUniform4fv(arg0, 4, arg1.method2514(aFloatArray8900), 0);
	}

	public void method1459(int arg0, Class249 arg1) {
		OpenGL.glUniform4fv(arg0, 4, arg1.method2514(aFloatArray8900), 0);
	}

	public void method1504(int arg0, Class249 arg1) {
		OpenGL.glUniform4fv(arg0, 4, arg1.method2514(aFloatArray8900), 0);
	}

	public void method1470(Class330_Sub15_Sub1 arg0, float arg1) {
		int var3 = ((Class330_Sub15_Sub1_Sub1) arg0).method3333();
		if (var3 == -1 || this.aFloatArray8903[var3] == arg1) {
			return;
		}
		this.aFloatArray8903[var3] = arg1;
		if (arg0.method3323(1632830751) != Class109.aClass109_1050 && arg0.method3323(1632830751) != Class109.aClass109_1096) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform1f(var3, arg1);
	}
}
