package deob;

public class Class55 {

	public static float[] aFloatArray506 = new float[16384];

	public static float[] aFloatArray507 = new float[16384];

	static {
		double var0 = 3.834951969714103E-4D;
		for (int var2 = 0; var2 < 16384; var2++) {
			aFloatArray506[var2] = (float) Math.sin((double) var2 * var0);
			aFloatArray507[var2] = (float) Math.cos((double) var2 * var0);
		}
	}

	public Class55() throws Throwable {
		throw new Error();
	}
}
