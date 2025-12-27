package deob;

public class Class256 {

	public static float[] aFloatArray2665 = new float[16384];

	public static float[] aFloatArray2666 = new float[16384];

	static {
		double var0 = 3.834951969714103E-4D;
		for (int var2 = 0; var2 < 16384; var2++) {
			aFloatArray2665[var2] = (float) Math.sin((double) var2 * var0);
			aFloatArray2666[var2] = (float) Math.cos((double) var2 * var0);
		}
	}

	public Class256() throws Throwable {
		throw new Error();
	}
}
