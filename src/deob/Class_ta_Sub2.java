package deob;

public class Class_ta_Sub2 extends Class_ta {

	public Class36_Sub1_Sub1 aClass36_Sub1_Sub1_8660;

	public static Class_ta_Sub2 method5683(Class_ra_Sub1 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
		byte[] var5 = new byte[arg1 * arg2];
		for (int var6 = 0; var6 < arg2; var6++) {
			int var7 = var6 * arg1 + arg3[var6];
			for (int var8 = 0; var8 < arg4[var6]; var8++) {
				var5[var7++] = -1;
			}
		}
		return new Class_ta_Sub2(arg0, arg1, arg2, var5);
	}

	public Class_ta_Sub2(Class_ra_Sub1 arg0, int arg1, int arg2, byte[] arg3) {
		this.aClass36_Sub1_Sub1_8660 = Class36_Sub1_Sub1.method526(arg0, Class72.aClass72_611, Class86.aClass86_714, arg1, arg2, false, arg3, Class72.aClass72_611);
		this.aClass36_Sub1_Sub1_8660.method518(false, false);
	}
}
