package deob;

public class Class226 {

	public static int anInt2363 = 1024;

	public static int anInt2364 = 16384;

	public static int anInt2365 = 16;

	public static int anInt2366 = 128;

	public static int anInt2367 = 4;

	public static int anInt2368 = 16;

	public static int anInt2369 = 1;

	public static int anInt2370 = 8;

	public static int anInt2371 = 512;

	public static int anInt2372 = 4096;

	public static int anInt2373 = 2;

	public static int anInt2374 = 32768;

	public static int anInt2375 = 16384;

	public static int anInt2376 = 32;

	public static int anInt2377 = 64;

	public static int anInt2378 = 512;

	public static int anInt2379 = 2097152;

	public static int anInt2380 = 131072;

	public static int anInt2381 = 4096;

	public static int anInt2382 = 4194304;

	public static int anInt2383 = 1048576;

	public static int anInt2384 = 524288;

	public static int anInt2385 = 65536;

	public static int anInt2386 = 256;

	public static int anInt2387 = 1;

	public static int anInt2388 = 32;

	public static int anInt2389 = 8388608;

	public static int anInt2390 = 8;

	public static int anInt2391 = 128;

	public static int anInt2392 = 1048576;

	public static int anInt2393 = 4;

	public static int anInt2394 = 256;

	public static int anInt2395 = 8192;

	public static int anInt2396 = 8192;

	public static int anInt2397 = 32768;

	public static int anInt2398 = 2;

	public static int anInt2399 = 65536;

	public static int anInt2400 = 1024;

	public static int anInt2401 = 64;

	public static int anInt2402 = 262144;

	public static int anInt2403 = 8388608;

	public static int anInt2404 = 524288;

	public static int anInt2405 = 4194304;

	public static int anInt2406 = 2097152;

	public static int anInt2407 = 262144;

	public static int anInt2408 = 131072;

	public static int anInt2409 = 33554432;

	public static int anInt2410 = 16777216;

	public Class226() throws Throwable {
		throw new Error();
	}

	public static final void method2305(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class307.method3076(var3, arg0, (byte) 0);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "jm.qf(" + ')');
		}
	}

	public static final void method2306(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 1273695140);
			Class337.method3953(var3, arg0, 483580969);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "jm.rj(" + ')');
		}
	}

	public static boolean method2307(int arg0, byte arg1) {
		try {
			return arg0 == 15 || arg0 == 19 || arg0 == 11 || arg0 == 7;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "jm.fa(" + ')');
		}
	}

	public static final void method2308(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2 + var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "jm.zz(" + ')');
		}
	}

	public static String[] method2309(String arg0, char arg1, byte arg2) {
		try {
			int var3 = Class404.method4737(arg0, arg1, (byte) -97);
			String[] var4 = new String[var3 + 1];
			int var5 = 0;
			int var6 = 0;
			for (int var7 = 0; var7 < var3; var7++) {
				int var8;
				for (var8 = var6; arg0.charAt(var8) != arg1; var8++) {
				}
				var4[var5++] = arg0.substring(var6, var8);
				var6 = var8 + 1;
			}
			var4[var3] = arg0.substring(var6);
			return var4;
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "jm.g(" + ')');
		}
	}
}
