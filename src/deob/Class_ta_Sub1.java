package deob;

public class Class_ta_Sub1 extends Class_ta {

	public Interface11_Impl3 anInterface11_Impl3_8659;

	public static Class_ta_Sub1 method5682(Class_ra_Sub2 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
		int var6;
		int var7;
		int var8;
		if (!arg0.method5006(Class72.aClass72_611, Class86.aClass86_714)) {
			int[] var5 = new int[arg1 * arg2];
			for (var6 = 0; var6 < arg2; var6++) {
				var7 = var6 * arg1 + arg3[var6];
				for (var8 = 0; var8 < arg4[var6]; var8++) {
					var5[var7++] = -16777216;
				}
			}
			return new Class_ta_Sub1(arg0, arg1, arg2, var5);
		}
		byte[] var9 = new byte[arg1 * arg2];
		for (var6 = 0; var6 < arg2; var6++) {
			var7 = var6 * arg1 + arg3[var6];
			for (var8 = 0; var8 < arg4[var6]; var8++) {
				var9[var7++] = -1;
			}
		}
		return new Class_ta_Sub1(arg0, arg1, arg2, var9);
	}

	public Class_ta_Sub1(Class_ra_Sub2 arg0, int arg1, int arg2, int[] arg3) {
		this.anInterface11_Impl3_8659 = arg0.method4944(arg1, arg2, false, arg3);
		this.anInterface11_Impl3_8659.method109(false, false);
	}

	public Class_ta_Sub1(Class_ra_Sub2 arg0, int arg1, int arg2, byte[] arg3) {
		this.anInterface11_Impl3_8659 = arg0.method4945(Class72.aClass72_611, arg1, arg2, false, arg3);
		this.anInterface11_Impl3_8659.method109(false, false);
	}
}
