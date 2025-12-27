package deob;

public class Class475_Sub2_Sub1 extends Class475_Sub2 {

	public float aFloat9938;

	public float aFloat9939;

	public float method5949(float arg0, float arg1, float arg2) {
		float var4 = this.aFloat8740 / arg0;
		if (var4 < 0.0F) {
			var4 = 0.0F;
		}
		if (var4 > 1.0F) {
			var4 = 1.0F;
		}
		return this.aFloat9938 + (this.aFloat9939 - this.aFloat9938) * var4;
	}

	public float method5951(float arg0, float arg1, float arg2, int arg3) {
		try {
			float var5 = this.aFloat8740 / arg0;
			if (var5 < 0.0F) {
				var5 = 0.0F;
			}
			if (var5 > 1.0F) {
				var5 = 1.0F;
			}
			return this.aFloat9938 + (this.aFloat9939 - this.aFloat9938) * var5;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "akc.g(" + ')');
		}
	}

	public float method5950(float arg0, float arg1, float arg2) {
		float var4 = this.aFloat8740 / arg0;
		if (var4 < 0.0F) {
			var4 = 0.0F;
		}
		if (var4 > 1.0F) {
			var4 = 1.0F;
		}
		return this.aFloat9938 + (this.aFloat9939 - this.aFloat9938) * var4;
	}

	public Class475_Sub2_Sub1(Class145 arg0) {
		super(arg0);
	}
}
