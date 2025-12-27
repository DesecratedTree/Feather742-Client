package deob;

public class Class261 {

	public float aFloat2717;

	public float aFloat2718;

	public float aFloat2719;

	public float aFloat2720;

	public final void method2583(float arg0) {
		this.aFloat2717 *= arg0;
		this.aFloat2718 *= arg0;
		this.aFloat2720 *= arg0;
		this.aFloat2719 *= arg0;
	}

	public Class261(float arg0, float arg1, float arg2, float arg3) {
		this.method2588(arg0, arg1, arg2, arg3);
	}

	public void method2584(Class261 arg0) {
		this.method2588(arg0.aFloat2717, arg0.aFloat2718, arg0.aFloat2720, arg0.aFloat2719);
	}

	public void method2585(int arg0) {
		this.method2588((float) (arg0 >> 16 & 0xFF) * 0.003921569F, (float) (arg0 >> 8 & 0xFF) * 0.003921569F, (float) (arg0 >> 0 & 0xFF) * 0.003921569F, (float) (arg0 >> 24 & 0xFF) * 0.003921569F);
	}

	public final void method2586() {
		this.aFloat2719 = 0.0F;
		this.aFloat2720 = 0.0F;
		this.aFloat2718 = 0.0F;
		this.aFloat2717 = 0.0F;
	}

	public final void method2587() {
		this.aFloat2717 = -this.aFloat2717;
		this.aFloat2718 = -this.aFloat2718;
		this.aFloat2720 = -this.aFloat2720;
		this.aFloat2719 = -this.aFloat2719;
	}

	public void method2588(float arg0, float arg1, float arg2, float arg3) {
		this.aFloat2717 = arg0;
		this.aFloat2718 = arg1;
		this.aFloat2720 = arg2;
		this.aFloat2719 = arg3;
	}

	public final void method2589(Class249 arg0) {
		float var2 = this.aFloat2717;
		float var3 = this.aFloat2718;
		float var4 = this.aFloat2720;
		float var5 = this.aFloat2719;
		this.aFloat2717 = arg0.aFloatArray2631[0] * var2 + arg0.aFloatArray2631[4] * var3 + arg0.aFloatArray2631[8] * var4 + arg0.aFloatArray2631[12] * var5;
		this.aFloat2718 = arg0.aFloatArray2631[1] * var2 + arg0.aFloatArray2631[5] * var3 + arg0.aFloatArray2631[9] * var4 + arg0.aFloatArray2631[13] * var5;
		this.aFloat2720 = arg0.aFloatArray2631[2] * var2 + arg0.aFloatArray2631[6] * var3 + arg0.aFloatArray2631[10] * var4 + arg0.aFloatArray2631[14] * var5;
		this.aFloat2719 = arg0.aFloatArray2631[3] * var2 + arg0.aFloatArray2631[7] * var3 + arg0.aFloatArray2631[11] * var4 + arg0.aFloatArray2631[15] * var5;
	}

	public Class261() {
		this.method2586();
	}
}
