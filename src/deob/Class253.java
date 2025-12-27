package deob;

public class Class253 {

	public Class260[] aClass260Array2637 = new Class260[4];

	public float aFloat2636;

	public float[] aFloatArray2638;

	public Class253() {
		for (int var1 = 0; var1 < 4; var1++) {
			this.aClass260Array2637[var1] = new Class260();
		}
		this.method2528();
	}

	public void method2528() {
		this.aFloat2636 = -1.0F;
		this.aFloatArray2638 = null;
	}

	public void method2529(int arg0, Class260 arg1) {
		this.aClass260Array2637[arg0].method2582(arg1);
		this.method2528();
	}

	public Class260 method2530(float arg0) {
		Class260 var2 = new Class260();
		float var3 = arg0 * arg0;
		float var4 = var3 * arg0;
		float var5 = (this.aClass260Array2637[1].aFloat2716 - this.aClass260Array2637[0].aFloat2716) * 3.0F;
		float var6 = (this.aClass260Array2637[2].aFloat2716 - this.aClass260Array2637[1].aFloat2716) * 3.0F - var5;
		float var7 = this.aClass260Array2637[3].aFloat2716 - this.aClass260Array2637[0].aFloat2716 - var5 - var6;
		var2.aFloat2716 = var7 * var4 + var6 * var3 + var5 * arg0 + this.aClass260Array2637[0].aFloat2716;
		float var8 = (this.aClass260Array2637[1].aFloat2715 - this.aClass260Array2637[0].aFloat2715) * 3.0F;
		float var10 = (this.aClass260Array2637[2].aFloat2715 - this.aClass260Array2637[1].aFloat2715) * 3.0F - var8;
		float var12 = this.aClass260Array2637[3].aFloat2715 - this.aClass260Array2637[0].aFloat2715 - var8 - var10;
		var2.aFloat2715 = var12 * var4 + var10 * var3 + var8 * arg0 + this.aClass260Array2637[0].aFloat2715;
		float var9 = (this.aClass260Array2637[1].aFloat2711 - this.aClass260Array2637[0].aFloat2711) * 3.0F;
		float var11 = (this.aClass260Array2637[2].aFloat2711 - this.aClass260Array2637[1].aFloat2711) * 3.0F - var9;
		float var13 = this.aClass260Array2637[3].aFloat2711 - this.aClass260Array2637[0].aFloat2711 - var9 - var11;
		var2.aFloat2711 = var13 * var4 + var11 * var3 + var9 * arg0 + this.aClass260Array2637[0].aFloat2711;
		return var2;
	}

	public float method2531() {
		if (this.aFloat2636 == -1.0F) {
			this.method2533();
		}
		return this.aFloat2636;
	}

	public float method2532(float arg0) {
		if (this.aFloat2636 == -1.0F) {
			this.method2533();
		}
		if (arg0 <= 0.0F) {
			return 0.0F;
		} else if (arg0 >= this.aFloat2636) {
			return 1.0F;
		} else {
			float var2 = 0.0F;
			float var3 = this.aFloatArray2638[0];
			float var5;
			for (int var4 = 0; var4 < this.aFloatArray2638.length; var4++) {
				if (arg0 < var3) {
					var5 = (arg0 - var2) / (var3 - var2);
					float var6 = (float) (var4 - 1) / (float) this.aFloatArray2638.length;
					float var7 = (float) var4 / (float) this.aFloatArray2638.length;
					return var6 + (var7 - var6) * var5;
				}
				var2 = var3;
				var3 += this.aFloatArray2638[var4];
			}
			float var8 = (arg0 - var2) / (var3 - var2);
			var5 = (float) (this.aFloatArray2638.length - 1) / (float) this.aFloatArray2638.length;
			return var5 + (1.0F - var5) * var8;
		}
	}

	public void method2533() {
		byte var1 = 20;
		Class260 var2 = this.method2530(0.0F);
		float var3 = 0.0F;
		int var4;
		for (var4 = 1; var4 <= var1; var4++) {
			Class260 var5 = this.method2530((float) var4 / (float) var1);
			var3 += Class260.method2561(var5, var2).method2565();
			var2 = var5;
		}
		var4 = (int) (var3 / 20.0F);
		if (var4 < var1) {
			var4 = var1;
		}
		this.aFloatArray2638 = new float[var4];
		var2 = this.method2530(0.0F);
		float var9 = 0.0F;
		for (int var6 = 1; var6 <= var4; var6++) {
			Class260 var7 = this.method2530((float) var6 / (float) var4);
			float var8 = Class260.method2561(var7, var2).method2565();
			var9 += var8;
			this.aFloatArray2638[var6 - 1] = var8;
			var2 = var7;
		}
		this.aFloat2636 = var9;
	}

	public Class260 method2534(int arg0) {
		return this.aClass260Array2637[arg0];
	}
}
