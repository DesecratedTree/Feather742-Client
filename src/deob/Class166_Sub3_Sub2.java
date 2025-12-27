package deob;

public class Class166_Sub3_Sub2 extends Class166_Sub3 {

	public float aFloat9481;

	public float aFloat9482;

	public static Class263 aClass263_9483;

	public float method2013(float arg0, float arg1, float arg2) {
		float var4 = this.aFloat7335 / arg0;
		if (var4 < 0.0F) {
			var4 = 0.0F;
		}
		if (var4 > 1.0F) {
			var4 = 1.0F;
		}
		return this.aFloat9482 + (this.aFloat9481 - this.aFloat9482) * var4;
	}

	public Class166_Sub3_Sub2(Class145 arg0) {
		super(arg0);
	}

	public float method2014(float arg0, float arg1, float arg2, int arg3) {
		try {
			float var5 = this.aFloat7335 / arg0;
			if (var5 < 0.0F) {
				var5 = 0.0F;
			}
			if (var5 > 1.0F) {
				var5 = 1.0F;
			}
			return this.aFloat9482 + (this.aFloat9481 - this.aFloat9482) * var5;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "aht.y(" + ')');
		}
	}
}
