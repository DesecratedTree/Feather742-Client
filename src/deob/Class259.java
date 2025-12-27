package deob;

public class Class259 {

	public static void method2547(Class260 arg0, Class260 arg1, Class260 arg2, float arg3, Class260[] arg4) {
		Class260 var5 = Class260.method2561(arg0, arg2);
		float var6 = Class260.method2562(var5, var5) - arg3 * arg3;
		float var7 = Class260.method2562(arg1, var5);
		float var8 = var7 * var7 - var6;
		if (var8 < 0.0F) {
			arg4[1] = null;
			arg4[0] = null;
		} else if (var8 >= 9.765625E-4F) {
			float var9 = (float) Math.sqrt((double) var8);
			arg4[0] = Class260.method2548();
			arg4[0].method2582(arg0);
			arg4[0].method2558(Class260.method2574(Class260.method2549(arg1), -var7 - var9));
			arg4[1] = Class260.method2548();
			arg4[1].method2582(arg0);
			arg4[1].method2558(Class260.method2574(Class260.method2549(arg1), -var7 + var9));
		} else {
			arg4[0] = Class260.method2548();
			arg4[0].method2582(arg0);
			arg4[0].method2558(Class260.method2574(Class260.method2549(arg1), -var7));
			arg4[1] = null;
		}
	}

	public Class259() throws Throwable {
		throw new Error();
	}
}
