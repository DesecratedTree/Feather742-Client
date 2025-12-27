package deob;

public class Class257 {

	public static int anInt2667 = 6144;

	public static int anInt2668 = 16383;

	public static int anInt2669 = 14;

	public static double aDouble2670 = 2607.5945876176133D;

	public static int anInt2671 = 16384;

	public static int anInt2672 = 16384;

	public static int anInt2673 = 14;

	public static int anInt2674 = 10240;

	public static int anInt2675 = 16383;

	public static int anInt2676 = 4096;

	public static int anInt2677 = 1024;

	public static int anInt2678 = 8192;

	public static int anInt2679 = 12288;

	public static int anInt2680 = 2048;

	public static int anInt2681 = 14336;

	public static int anInt2682 = 16384;

	public static int[] anIntArray2683 = new int[16384];

	public static int[] anIntArray2684 = new int[16384];

	static {
		double var0 = 3.834951969714103E-4D;
		for (int var2 = 0; var2 < 16384; var2++) {
			anIntArray2683[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
			anIntArray2684[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
		}
	}

	public Class257() throws Throwable {
		throw new Error();
	}

	public static float method2541(int arg0) {
		int var1 = arg0 & 0x3FFF;
		return (float) ((double) ((float) var1 / 16384.0F) * 6.283185307179586D);
	}
}
