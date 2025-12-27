package deob;

public class Class330_Sub21 extends Class330 {

	public static float[] aFloatArray7691 = new float[3];

	public Class64 aClass64_7690;

	public Class208 aClass208_7685;

	public float aFloat7684;

	public float aFloat7688;

	public int anInt7686;

	public int anInt7687;

	public int anInt7689;

	public void method3375(byte arg0) {
		try {
			this.anInt7686 = this.aClass64_7690.anInt565;
			this.anInt7687 = this.aClass64_7690.anInt563;
			this.anInt7689 = this.aClass64_7690.anInt567;
			if (this.aClass64_7690.aClass249_568 != null) {
				this.aClass64_7690.aClass249_568.method2488((float) this.aClass208_7685.anInt1970, (float) this.aClass208_7685.anInt1953, (float) this.aClass208_7685.anInt1972, aFloatArray7691);
			}
			this.aFloat7684 = aFloatArray7691[0];
			this.aFloat7688 = aFloatArray7691[2];
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "adb.r(" + ')');
		}
	}

	public Class330_Sub21(Class64 arg0, Class388 arg1) {
		this.aClass64_7690 = arg0;
		this.aClass208_7685 = this.aClass64_7690.method771(-1907493266);
		this.method3375((byte) 105);
	}
}
