package deob;

public class Class245 {

	public Class253[] aClass253Array2615 = new Class253[1];

	public float[] aFloatArray2616 = new float[2];

	public Class245(Buffer arg0) {
		int var2 = arg0.readSmart(-105201095);
		this.aClass253Array2615[0] = new Class253();
		this.aClass253Array2615[0].method2529(0, new Class260(arg0));
		this.aClass253Array2615[0].method2529(1, new Class260(arg0));
		this.aFloatArray2616[0] = arg0.method3760(-1279245802);
		this.aClass253Array2615[0].method2529(3, new Class260(arg0));
		this.aClass253Array2615[0].method2529(2, new Class260(arg0));
		this.aFloatArray2616[1] = arg0.method3760(-1279245802);
		for (int var3 = 2; var3 < var2; var3++) {
			Class260 var4 = new Class260(arg0);
			Class260 var5 = new Class260(arg0);
			this.method2445(var4, var5, arg0.method3760(-1279245802));
		}
	}

	public float method2440(float arg0) {
		int var2 = (int) arg0;
		if (var2 + 1 < this.aFloatArray2616.length) {
			float var3 = this.aFloatArray2616[var2];
			float var4 = this.aFloatArray2616[var2 + 1];
			float var5 = arg0 - (float) var2;
			return (1.0F - var5) * var3 + var5 * var4;
		} else {
			return this.aFloatArray2616[this.aFloatArray2616.length - 1];
		}
	}

	public float method2441(int arg0) {
		return this.aFloatArray2616[arg0];
	}

	public Class260 method2442(float arg0) {
		int var2 = (int) arg0;
		return var2 < this.aClass253Array2615.length ? this.aClass253Array2615[var2].method2530(arg0 - (float) var2) : this.aClass253Array2615[this.aClass253Array2615.length - 1].method2530(1.0F);
	}

	public Class260 method2443(float arg0) {
		float var2 = 0.0F;
		float var3 = 0.0F;
		for (int var4 = 0; var4 < this.aClass253Array2615.length; var4++) {
			var3 += this.aClass253Array2615[var4].method2531();
			if (arg0 < var3) {
				float var5 = this.aClass253Array2615[var4].method2532(arg0 - var2);
				return this.aClass253Array2615[var4].method2530(var5);
			}
			var2 = var3;
		}
		return this.aClass253Array2615[this.aClass253Array2615.length - 1].method2530(1.0F);
	}

	public float method2444(float arg0) {
		float var2 = 0.0F;
		float var3 = 0.0F;
		for (int var4 = 0; var4 < this.aClass253Array2615.length; var4++) {
			var3 += this.aClass253Array2615[var4].method2531();
			if (arg0 < var3) {
				return this.aClass253Array2615[var4].method2532(arg0 - var2) + (float) var4;
			}
			var2 = var3;
		}
		return (float) this.aClass253Array2615.length;
	}

	public void method2445(Class260 arg0, Class260 arg1, float arg2) {
		Class253[] var4 = new Class253[this.aClass253Array2615.length + 1];
		System.arraycopy(this.aClass253Array2615, 0, var4, 0, this.aClass253Array2615.length);
		Class253 var5 = new Class253();
		Class253 var6 = this.aClass253Array2615[this.aClass253Array2615.length - 1];
		var5.method2529(0, var6.method2534(3));
		Class260 var7 = Class260.method2561(var6.method2534(3), var6.method2534(2));
		var5.method2529(1, Class260.method2578(var6.method2534(3), var7));
		var5.method2529(3, arg0);
		var5.method2529(2, arg1);
		var4[var4.length - 1] = var5;
		this.aClass253Array2615 = var4;
		float[] var8 = new float[this.aFloatArray2616.length + 1];
		System.arraycopy(this.aFloatArray2616, 0, var8, 0, this.aFloatArray2616.length);
		var8[var8.length - 1] = arg2;
		this.aFloatArray2616 = var8;
	}

	public float method2446(float arg0) {
		float var2 = 0.0F;
		float var3 = 0.0F;
		float var4 = this.method2441(0);
		float var5 = 0.0F;
		for (int var6 = 0; var6 < this.aClass253Array2615.length; var6++) {
			var3 += this.aClass253Array2615[var6].method2531();
			var5 = this.method2441(var6 + 1);
			if (arg0 < var3) {
				float var7 = (arg0 - var2) / (var3 - var2);
				float var8 = var5 - var4;
				if ((double) var8 > 3.141592653589793D) {
					var8 -= 6.2831855F;
				} else if ((double) var8 < -3.141592653589793D) {
					var8 += 6.2831855F;
				}
				return var4 + var8 * var7;
			}
			var2 = var3;
			var4 = var5;
		}
		return this.aFloatArray2616[this.aFloatArray2616.length - 1];
	}

	public float method2447() {
		float var1 = 0.0F;
		for (int var2 = 0; var2 < this.aClass253Array2615.length; var2++) {
			var1 += this.aClass253Array2615[var2].method2531();
		}
		return var1;
	}
}
