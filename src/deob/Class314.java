package deob;

import java.io.IOException;

public class Class314 {

	public static int anInt3251 = 1;

	public static int anInt3252 = 1;

	public static int anInt3253 = 2;

	public static int anInt3254 = 0;

	public static IndexTable aClass280_3256;

	public static String aString3255;

	public Class314() throws Throwable {
		throw new Error();
	}

	public static void method3119(byte arg0) {
		try {
			if (Class215.aFileOutputStream2086 != null) {
				try {
					Class215.aFileOutputStream2086.close();
				} catch (IOException var2) {
				}
			}
			Class215.aFileOutputStream2086 = null;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nb.o(" + ')');
		}
	}

	public static final void method3120(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1264;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "nb.qm(" + ')');
		}
	}

	public static final void method3121(Class430 arg0, byte arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			if (client.aBoolean9198) {
				try {
					Class232.aClass232_2460.method2355(new Object[] { var2 }, -774363616);
				} catch (Throwable var4) {
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "nb.apj(" + ')');
		}
	}
}
