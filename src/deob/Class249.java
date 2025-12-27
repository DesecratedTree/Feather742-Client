package deob;

public class Class249 {

	public static Class249 aClass249_2630 = new Class249();

	public float[] aFloatArray2631 = new float[16];

	public Class249(Class249 arg0) {
		this.method2510(arg0);
	}

	public void method2482(float[] arg0) {
		float var2 = arg0[0];
		float var3 = arg0[1];
		float var4 = arg0[2];
		arg0[0] = this.aFloatArray2631[0] * var2 + this.aFloatArray2631[4] * var3 + this.aFloatArray2631[8] * var4 + this.aFloatArray2631[12];
		arg0[1] = this.aFloatArray2631[1] * var2 + this.aFloatArray2631[5] * var3 + this.aFloatArray2631[9] * var4 + this.aFloatArray2631[13];
		arg0[2] = this.aFloatArray2631[2] * var2 + this.aFloatArray2631[6] * var3 + this.aFloatArray2631[10] * var4 + this.aFloatArray2631[14];
	}

	public void method2483(Class249 arg0) {
		float var2 = this.aFloatArray2631[0] * arg0.aFloatArray2631[0] + this.aFloatArray2631[1] * arg0.aFloatArray2631[4] + this.aFloatArray2631[2] * arg0.aFloatArray2631[8] + this.aFloatArray2631[3] * arg0.aFloatArray2631[12];
		float var3 = this.aFloatArray2631[0] * arg0.aFloatArray2631[1] + this.aFloatArray2631[1] * arg0.aFloatArray2631[5] + this.aFloatArray2631[2] * arg0.aFloatArray2631[9] + this.aFloatArray2631[3] * arg0.aFloatArray2631[13];
		float var4 = this.aFloatArray2631[0] * arg0.aFloatArray2631[2] + this.aFloatArray2631[1] * arg0.aFloatArray2631[6] + this.aFloatArray2631[2] * arg0.aFloatArray2631[10] + this.aFloatArray2631[3] * arg0.aFloatArray2631[14];
		float var5 = this.aFloatArray2631[0] * arg0.aFloatArray2631[3] + this.aFloatArray2631[1] * arg0.aFloatArray2631[7] + this.aFloatArray2631[2] * arg0.aFloatArray2631[11] + this.aFloatArray2631[3] * arg0.aFloatArray2631[15];
		float var6 = this.aFloatArray2631[4] * arg0.aFloatArray2631[0] + this.aFloatArray2631[5] * arg0.aFloatArray2631[4] + this.aFloatArray2631[6] * arg0.aFloatArray2631[8] + this.aFloatArray2631[7] * arg0.aFloatArray2631[12];
		float var7 = this.aFloatArray2631[4] * arg0.aFloatArray2631[1] + this.aFloatArray2631[5] * arg0.aFloatArray2631[5] + this.aFloatArray2631[6] * arg0.aFloatArray2631[9] + this.aFloatArray2631[7] * arg0.aFloatArray2631[13];
		float var8 = this.aFloatArray2631[4] * arg0.aFloatArray2631[2] + this.aFloatArray2631[5] * arg0.aFloatArray2631[6] + this.aFloatArray2631[6] * arg0.aFloatArray2631[10] + this.aFloatArray2631[7] * arg0.aFloatArray2631[14];
		float var9 = this.aFloatArray2631[4] * arg0.aFloatArray2631[3] + this.aFloatArray2631[5] * arg0.aFloatArray2631[7] + this.aFloatArray2631[6] * arg0.aFloatArray2631[11] + this.aFloatArray2631[7] * arg0.aFloatArray2631[15];
		float var10 = this.aFloatArray2631[8] * arg0.aFloatArray2631[0] + this.aFloatArray2631[9] * arg0.aFloatArray2631[4] + this.aFloatArray2631[10] * arg0.aFloatArray2631[8] + this.aFloatArray2631[11] * arg0.aFloatArray2631[12];
		float var11 = this.aFloatArray2631[8] * arg0.aFloatArray2631[1] + this.aFloatArray2631[9] * arg0.aFloatArray2631[5] + this.aFloatArray2631[10] * arg0.aFloatArray2631[9] + this.aFloatArray2631[11] * arg0.aFloatArray2631[13];
		float var12 = this.aFloatArray2631[8] * arg0.aFloatArray2631[2] + this.aFloatArray2631[9] * arg0.aFloatArray2631[6] + this.aFloatArray2631[10] * arg0.aFloatArray2631[10] + this.aFloatArray2631[11] * arg0.aFloatArray2631[14];
		float var13 = this.aFloatArray2631[8] * arg0.aFloatArray2631[3] + this.aFloatArray2631[9] * arg0.aFloatArray2631[7] + this.aFloatArray2631[10] * arg0.aFloatArray2631[11] + this.aFloatArray2631[11] * arg0.aFloatArray2631[15];
		float var14 = this.aFloatArray2631[12] * arg0.aFloatArray2631[0] + this.aFloatArray2631[13] * arg0.aFloatArray2631[4] + this.aFloatArray2631[14] * arg0.aFloatArray2631[8] + this.aFloatArray2631[15] * arg0.aFloatArray2631[12];
		float var15 = this.aFloatArray2631[12] * arg0.aFloatArray2631[1] + this.aFloatArray2631[13] * arg0.aFloatArray2631[5] + this.aFloatArray2631[14] * arg0.aFloatArray2631[9] + this.aFloatArray2631[15] * arg0.aFloatArray2631[13];
		float var16 = this.aFloatArray2631[12] * arg0.aFloatArray2631[2] + this.aFloatArray2631[13] * arg0.aFloatArray2631[6] + this.aFloatArray2631[14] * arg0.aFloatArray2631[10] + this.aFloatArray2631[15] * arg0.aFloatArray2631[14];
		float var17 = this.aFloatArray2631[12] * arg0.aFloatArray2631[3] + this.aFloatArray2631[13] * arg0.aFloatArray2631[7] + this.aFloatArray2631[14] * arg0.aFloatArray2631[11] + this.aFloatArray2631[15] * arg0.aFloatArray2631[15];
		this.aFloatArray2631[0] = var2;
		this.aFloatArray2631[1] = var3;
		this.aFloatArray2631[2] = var4;
		this.aFloatArray2631[3] = var5;
		this.aFloatArray2631[4] = var6;
		this.aFloatArray2631[5] = var7;
		this.aFloatArray2631[6] = var8;
		this.aFloatArray2631[7] = var9;
		this.aFloatArray2631[8] = var10;
		this.aFloatArray2631[9] = var11;
		this.aFloatArray2631[10] = var12;
		this.aFloatArray2631[11] = var13;
		this.aFloatArray2631[12] = var14;
		this.aFloatArray2631[13] = var15;
		this.aFloatArray2631[14] = var16;
		this.aFloatArray2631[15] = var17;
	}

	public void method2484(Class249 arg0, Class249 arg1) {
		float var3 = arg0.aFloatArray2631[0] * arg1.aFloatArray2631[0] + arg0.aFloatArray2631[1] * arg1.aFloatArray2631[4] + arg0.aFloatArray2631[2] * arg1.aFloatArray2631[8] + arg0.aFloatArray2631[3] * arg1.aFloatArray2631[12];
		float var4 = arg0.aFloatArray2631[0] * arg1.aFloatArray2631[1] + arg0.aFloatArray2631[1] * arg1.aFloatArray2631[5] + arg0.aFloatArray2631[2] * arg1.aFloatArray2631[9] + arg0.aFloatArray2631[3] * arg1.aFloatArray2631[13];
		float var5 = arg0.aFloatArray2631[0] * arg1.aFloatArray2631[2] + arg0.aFloatArray2631[1] * arg1.aFloatArray2631[6] + arg0.aFloatArray2631[2] * arg1.aFloatArray2631[10] + arg0.aFloatArray2631[3] * arg1.aFloatArray2631[14];
		float var6 = arg0.aFloatArray2631[0] * arg1.aFloatArray2631[3] + arg0.aFloatArray2631[1] * arg1.aFloatArray2631[7] + arg0.aFloatArray2631[2] * arg1.aFloatArray2631[11] + arg0.aFloatArray2631[3] * arg1.aFloatArray2631[15];
		float var7 = arg0.aFloatArray2631[4] * arg1.aFloatArray2631[0] + arg0.aFloatArray2631[5] * arg1.aFloatArray2631[4] + arg0.aFloatArray2631[6] * arg1.aFloatArray2631[8] + arg0.aFloatArray2631[7] * arg1.aFloatArray2631[12];
		float var8 = arg0.aFloatArray2631[4] * arg1.aFloatArray2631[1] + arg0.aFloatArray2631[5] * arg1.aFloatArray2631[5] + arg0.aFloatArray2631[6] * arg1.aFloatArray2631[9] + arg0.aFloatArray2631[7] * arg1.aFloatArray2631[13];
		float var9 = arg0.aFloatArray2631[4] * arg1.aFloatArray2631[2] + arg0.aFloatArray2631[5] * arg1.aFloatArray2631[6] + arg0.aFloatArray2631[6] * arg1.aFloatArray2631[10] + arg0.aFloatArray2631[7] * arg1.aFloatArray2631[14];
		float var10 = arg0.aFloatArray2631[4] * arg1.aFloatArray2631[3] + arg0.aFloatArray2631[5] * arg1.aFloatArray2631[7] + arg0.aFloatArray2631[6] * arg1.aFloatArray2631[11] + arg0.aFloatArray2631[7] * arg1.aFloatArray2631[15];
		float var11 = arg0.aFloatArray2631[8] * arg1.aFloatArray2631[0] + arg0.aFloatArray2631[9] * arg1.aFloatArray2631[4] + arg0.aFloatArray2631[10] * arg1.aFloatArray2631[8] + arg0.aFloatArray2631[11] * arg1.aFloatArray2631[12];
		float var12 = arg0.aFloatArray2631[8] * arg1.aFloatArray2631[1] + arg0.aFloatArray2631[9] * arg1.aFloatArray2631[5] + arg0.aFloatArray2631[10] * arg1.aFloatArray2631[9] + arg0.aFloatArray2631[11] * arg1.aFloatArray2631[13];
		float var13 = arg0.aFloatArray2631[8] * arg1.aFloatArray2631[2] + arg0.aFloatArray2631[9] * arg1.aFloatArray2631[6] + arg0.aFloatArray2631[10] * arg1.aFloatArray2631[10] + arg0.aFloatArray2631[11] * arg1.aFloatArray2631[14];
		float var14 = arg0.aFloatArray2631[8] * arg1.aFloatArray2631[3] + arg0.aFloatArray2631[9] * arg1.aFloatArray2631[7] + arg0.aFloatArray2631[10] * arg1.aFloatArray2631[11] + arg0.aFloatArray2631[11] * arg1.aFloatArray2631[15];
		float var15 = arg0.aFloatArray2631[12] * arg1.aFloatArray2631[0] + arg0.aFloatArray2631[13] * arg1.aFloatArray2631[4] + arg0.aFloatArray2631[14] * arg1.aFloatArray2631[8] + arg0.aFloatArray2631[15] * arg1.aFloatArray2631[12];
		float var16 = arg0.aFloatArray2631[12] * arg1.aFloatArray2631[1] + arg0.aFloatArray2631[13] * arg1.aFloatArray2631[5] + arg0.aFloatArray2631[14] * arg1.aFloatArray2631[9] + arg0.aFloatArray2631[15] * arg1.aFloatArray2631[13];
		float var17 = arg0.aFloatArray2631[12] * arg1.aFloatArray2631[2] + arg0.aFloatArray2631[13] * arg1.aFloatArray2631[6] + arg0.aFloatArray2631[14] * arg1.aFloatArray2631[10] + arg0.aFloatArray2631[15] * arg1.aFloatArray2631[14];
		float var18 = arg0.aFloatArray2631[12] * arg1.aFloatArray2631[3] + arg0.aFloatArray2631[13] * arg1.aFloatArray2631[7] + arg0.aFloatArray2631[14] * arg1.aFloatArray2631[11] + arg0.aFloatArray2631[15] * arg1.aFloatArray2631[15];
		this.aFloatArray2631[0] = var3;
		this.aFloatArray2631[1] = var4;
		this.aFloatArray2631[2] = var5;
		this.aFloatArray2631[3] = var6;
		this.aFloatArray2631[4] = var7;
		this.aFloatArray2631[5] = var8;
		this.aFloatArray2631[6] = var9;
		this.aFloatArray2631[7] = var10;
		this.aFloatArray2631[8] = var11;
		this.aFloatArray2631[9] = var12;
		this.aFloatArray2631[10] = var13;
		this.aFloatArray2631[11] = var14;
		this.aFloatArray2631[12] = var15;
		this.aFloatArray2631[13] = var16;
		this.aFloatArray2631[14] = var17;
		this.aFloatArray2631[15] = var18;
	}

	public Class249() {
		this.method2516();
	}

	public void method2485() {
		float var1 = 1.0F / this.method2513();
		float var2 = (this.aFloatArray2631[5] * this.aFloatArray2631[10] * this.aFloatArray2631[15] - this.aFloatArray2631[5] * this.aFloatArray2631[11] * this.aFloatArray2631[14] - this.aFloatArray2631[6] * this.aFloatArray2631[9] * this.aFloatArray2631[15] + this.aFloatArray2631[6] * this.aFloatArray2631[11] * this.aFloatArray2631[13] + this.aFloatArray2631[7] * this.aFloatArray2631[9] * this.aFloatArray2631[14] - this.aFloatArray2631[7] * this.aFloatArray2631[10] * this.aFloatArray2631[13]) * var1;
		float var3 = (-this.aFloatArray2631[1] * this.aFloatArray2631[10] * this.aFloatArray2631[15] + this.aFloatArray2631[1] * this.aFloatArray2631[11] * this.aFloatArray2631[14] + this.aFloatArray2631[2] * this.aFloatArray2631[9] * this.aFloatArray2631[15] - this.aFloatArray2631[2] * this.aFloatArray2631[11] * this.aFloatArray2631[13] - this.aFloatArray2631[3] * this.aFloatArray2631[9] * this.aFloatArray2631[14] + this.aFloatArray2631[3] * this.aFloatArray2631[10] * this.aFloatArray2631[13]) * var1;
		float var4 = (this.aFloatArray2631[1] * this.aFloatArray2631[6] * this.aFloatArray2631[15] - this.aFloatArray2631[1] * this.aFloatArray2631[7] * this.aFloatArray2631[14] - this.aFloatArray2631[2] * this.aFloatArray2631[5] * this.aFloatArray2631[15] + this.aFloatArray2631[2] * this.aFloatArray2631[7] * this.aFloatArray2631[13] + this.aFloatArray2631[3] * this.aFloatArray2631[5] * this.aFloatArray2631[14] - this.aFloatArray2631[3] * this.aFloatArray2631[6] * this.aFloatArray2631[13]) * var1;
		float var5 = (-this.aFloatArray2631[1] * this.aFloatArray2631[6] * this.aFloatArray2631[11] + this.aFloatArray2631[1] * this.aFloatArray2631[7] * this.aFloatArray2631[10] + this.aFloatArray2631[2] * this.aFloatArray2631[5] * this.aFloatArray2631[11] - this.aFloatArray2631[2] * this.aFloatArray2631[7] * this.aFloatArray2631[9] - this.aFloatArray2631[3] * this.aFloatArray2631[5] * this.aFloatArray2631[10] + this.aFloatArray2631[3] * this.aFloatArray2631[6] * this.aFloatArray2631[9]) * var1;
		float var6 = (-this.aFloatArray2631[4] * this.aFloatArray2631[10] * this.aFloatArray2631[15] + this.aFloatArray2631[4] * this.aFloatArray2631[11] * this.aFloatArray2631[14] + this.aFloatArray2631[6] * this.aFloatArray2631[8] * this.aFloatArray2631[15] - this.aFloatArray2631[6] * this.aFloatArray2631[11] * this.aFloatArray2631[12] - this.aFloatArray2631[7] * this.aFloatArray2631[8] * this.aFloatArray2631[14] + this.aFloatArray2631[7] * this.aFloatArray2631[10] * this.aFloatArray2631[12]) * var1;
		float var7 = (this.aFloatArray2631[0] * this.aFloatArray2631[10] * this.aFloatArray2631[15] - this.aFloatArray2631[0] * this.aFloatArray2631[11] * this.aFloatArray2631[14] - this.aFloatArray2631[2] * this.aFloatArray2631[8] * this.aFloatArray2631[15] + this.aFloatArray2631[2] * this.aFloatArray2631[11] * this.aFloatArray2631[12] + this.aFloatArray2631[3] * this.aFloatArray2631[8] * this.aFloatArray2631[14] - this.aFloatArray2631[3] * this.aFloatArray2631[10] * this.aFloatArray2631[12]) * var1;
		float var8 = (-this.aFloatArray2631[0] * this.aFloatArray2631[6] * this.aFloatArray2631[15] + this.aFloatArray2631[0] * this.aFloatArray2631[7] * this.aFloatArray2631[14] + this.aFloatArray2631[2] * this.aFloatArray2631[4] * this.aFloatArray2631[15] - this.aFloatArray2631[2] * this.aFloatArray2631[7] * this.aFloatArray2631[12] - this.aFloatArray2631[3] * this.aFloatArray2631[4] * this.aFloatArray2631[14] + this.aFloatArray2631[3] * this.aFloatArray2631[6] * this.aFloatArray2631[12]) * var1;
		float var9 = (this.aFloatArray2631[0] * this.aFloatArray2631[6] * this.aFloatArray2631[11] - this.aFloatArray2631[0] * this.aFloatArray2631[7] * this.aFloatArray2631[10] - this.aFloatArray2631[2] * this.aFloatArray2631[4] * this.aFloatArray2631[11] + this.aFloatArray2631[2] * this.aFloatArray2631[7] * this.aFloatArray2631[8] + this.aFloatArray2631[3] * this.aFloatArray2631[4] * this.aFloatArray2631[10] - this.aFloatArray2631[3] * this.aFloatArray2631[6] * this.aFloatArray2631[8]) * var1;
		float var10 = (this.aFloatArray2631[4] * this.aFloatArray2631[9] * this.aFloatArray2631[15] - this.aFloatArray2631[4] * this.aFloatArray2631[11] * this.aFloatArray2631[13] - this.aFloatArray2631[5] * this.aFloatArray2631[8] * this.aFloatArray2631[15] + this.aFloatArray2631[5] * this.aFloatArray2631[11] * this.aFloatArray2631[12] + this.aFloatArray2631[7] * this.aFloatArray2631[8] * this.aFloatArray2631[13] - this.aFloatArray2631[7] * this.aFloatArray2631[9] * this.aFloatArray2631[12]) * var1;
		float var11 = (-this.aFloatArray2631[0] * this.aFloatArray2631[9] * this.aFloatArray2631[15] + this.aFloatArray2631[0] * this.aFloatArray2631[11] * this.aFloatArray2631[13] + this.aFloatArray2631[1] * this.aFloatArray2631[8] * this.aFloatArray2631[15] - this.aFloatArray2631[1] * this.aFloatArray2631[11] * this.aFloatArray2631[12] - this.aFloatArray2631[3] * this.aFloatArray2631[8] * this.aFloatArray2631[13] + this.aFloatArray2631[3] * this.aFloatArray2631[9] * this.aFloatArray2631[12]) * var1;
		float var12 = (this.aFloatArray2631[0] * this.aFloatArray2631[5] * this.aFloatArray2631[15] - this.aFloatArray2631[0] * this.aFloatArray2631[7] * this.aFloatArray2631[13] - this.aFloatArray2631[1] * this.aFloatArray2631[4] * this.aFloatArray2631[15] + this.aFloatArray2631[1] * this.aFloatArray2631[7] * this.aFloatArray2631[12] + this.aFloatArray2631[3] * this.aFloatArray2631[4] * this.aFloatArray2631[13] - this.aFloatArray2631[3] * this.aFloatArray2631[5] * this.aFloatArray2631[12]) * var1;
		float var13 = (-this.aFloatArray2631[0] * this.aFloatArray2631[5] * this.aFloatArray2631[11] + this.aFloatArray2631[0] * this.aFloatArray2631[7] * this.aFloatArray2631[9] + this.aFloatArray2631[1] * this.aFloatArray2631[4] * this.aFloatArray2631[11] - this.aFloatArray2631[1] * this.aFloatArray2631[7] * this.aFloatArray2631[8] - this.aFloatArray2631[3] * this.aFloatArray2631[4] * this.aFloatArray2631[9] + this.aFloatArray2631[3] * this.aFloatArray2631[5] * this.aFloatArray2631[8]) * var1;
		float var14 = (-this.aFloatArray2631[4] * this.aFloatArray2631[9] * this.aFloatArray2631[14] + this.aFloatArray2631[4] * this.aFloatArray2631[10] * this.aFloatArray2631[13] + this.aFloatArray2631[5] * this.aFloatArray2631[8] * this.aFloatArray2631[14] - this.aFloatArray2631[5] * this.aFloatArray2631[10] * this.aFloatArray2631[12] - this.aFloatArray2631[6] * this.aFloatArray2631[8] * this.aFloatArray2631[13] + this.aFloatArray2631[6] * this.aFloatArray2631[9] * this.aFloatArray2631[12]) * var1;
		float var15 = (this.aFloatArray2631[0] * this.aFloatArray2631[9] * this.aFloatArray2631[14] - this.aFloatArray2631[0] * this.aFloatArray2631[10] * this.aFloatArray2631[13] - this.aFloatArray2631[1] * this.aFloatArray2631[8] * this.aFloatArray2631[14] + this.aFloatArray2631[1] * this.aFloatArray2631[10] * this.aFloatArray2631[12] + this.aFloatArray2631[2] * this.aFloatArray2631[8] * this.aFloatArray2631[13] - this.aFloatArray2631[2] * this.aFloatArray2631[9] * this.aFloatArray2631[12]) * var1;
		float var16 = (-this.aFloatArray2631[0] * this.aFloatArray2631[5] * this.aFloatArray2631[14] + this.aFloatArray2631[0] * this.aFloatArray2631[6] * this.aFloatArray2631[13] + this.aFloatArray2631[1] * this.aFloatArray2631[4] * this.aFloatArray2631[14] - this.aFloatArray2631[1] * this.aFloatArray2631[6] * this.aFloatArray2631[12] - this.aFloatArray2631[2] * this.aFloatArray2631[4] * this.aFloatArray2631[13] + this.aFloatArray2631[2] * this.aFloatArray2631[5] * this.aFloatArray2631[12]) * var1;
		float var17 = (this.aFloatArray2631[0] * this.aFloatArray2631[5] * this.aFloatArray2631[10] - this.aFloatArray2631[0] * this.aFloatArray2631[6] * this.aFloatArray2631[9] - this.aFloatArray2631[1] * this.aFloatArray2631[4] * this.aFloatArray2631[10] + this.aFloatArray2631[1] * this.aFloatArray2631[6] * this.aFloatArray2631[8] + this.aFloatArray2631[2] * this.aFloatArray2631[4] * this.aFloatArray2631[9] - this.aFloatArray2631[2] * this.aFloatArray2631[5] * this.aFloatArray2631[8]) * var1;
		this.aFloatArray2631[0] = var2;
		this.aFloatArray2631[1] = var3;
		this.aFloatArray2631[2] = var4;
		this.aFloatArray2631[3] = var5;
		this.aFloatArray2631[4] = var6;
		this.aFloatArray2631[5] = var7;
		this.aFloatArray2631[6] = var8;
		this.aFloatArray2631[7] = var9;
		this.aFloatArray2631[8] = var10;
		this.aFloatArray2631[9] = var11;
		this.aFloatArray2631[10] = var12;
		this.aFloatArray2631[11] = var13;
		this.aFloatArray2631[12] = var14;
		this.aFloatArray2631[13] = var15;
		this.aFloatArray2631[14] = var16;
		this.aFloatArray2631[15] = var17;
	}

	public void method2486(float arg0, float arg1, float arg2, float arg3) {
		this.aFloatArray2631[0] = arg0;
		this.aFloatArray2631[1] = 0.0F;
		this.aFloatArray2631[2] = 0.0F;
		this.aFloatArray2631[3] = 0.0F;
		this.aFloatArray2631[4] = 0.0F;
		this.aFloatArray2631[5] = arg1;
		this.aFloatArray2631[6] = 0.0F;
		this.aFloatArray2631[7] = 0.0F;
		this.aFloatArray2631[8] = 0.0F;
		this.aFloatArray2631[9] = 0.0F;
		this.aFloatArray2631[10] = arg2;
		this.aFloatArray2631[11] = 0.0F;
		this.aFloatArray2631[12] = 0.0F;
		this.aFloatArray2631[13] = 0.0F;
		this.aFloatArray2631[14] = 0.0F;
		this.aFloatArray2631[15] = arg3;
	}

	public boolean method2487() {
		return this.aFloatArray2631[0] == 1.0F && this.aFloatArray2631[1] == 0.0F && this.aFloatArray2631[2] == 0.0F && this.aFloatArray2631[3] == 0.0F && this.aFloatArray2631[4] == 0.0F && this.aFloatArray2631[5] == 1.0F && this.aFloatArray2631[6] == 0.0F && this.aFloatArray2631[7] == 0.0F && this.aFloatArray2631[8] == 0.0F && this.aFloatArray2631[9] == 0.0F && this.aFloatArray2631[10] == 1.0F && this.aFloatArray2631[11] == 0.0F && this.aFloatArray2631[12] == 0.0F && this.aFloatArray2631[13] == 0.0F && this.aFloatArray2631[14] == 0.0F && this.aFloatArray2631[15] == 1.0F;
	}

	public void method2488(float arg0, float arg1, float arg2, float[] arg3) {
		arg3[0] = this.aFloatArray2631[0] * arg0 + this.aFloatArray2631[4] * arg1 + this.aFloatArray2631[8] * arg2;
		arg3[1] = this.aFloatArray2631[1] * arg0 + this.aFloatArray2631[5] * arg1 + this.aFloatArray2631[9] * arg2;
		arg3[2] = this.aFloatArray2631[2] * arg0 + this.aFloatArray2631[6] * arg1 + this.aFloatArray2631[10] * arg2;
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray2631[3] * arg0 + this.aFloatArray2631[7] * arg1 + this.aFloatArray2631[11] * arg2;
		}
	}

	public void method2489(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		this.aFloatArray2631[0] = 2.0F / (arg1 - arg0);
		this.aFloatArray2631[1] = 0.0F;
		this.aFloatArray2631[2] = 0.0F;
		this.aFloatArray2631[3] = 0.0F;
		this.aFloatArray2631[4] = 0.0F;
		this.aFloatArray2631[5] = 2.0F / (arg3 - arg2);
		this.aFloatArray2631[6] = 0.0F;
		this.aFloatArray2631[7] = 0.0F;
		this.aFloatArray2631[8] = 0.0F;
		this.aFloatArray2631[9] = 0.0F;
		this.aFloatArray2631[10] = 2.0F / (arg5 - arg4);
		this.aFloatArray2631[11] = 0.0F;
		this.aFloatArray2631[12] = -(arg1 + arg0) / (arg1 - arg0);
		this.aFloatArray2631[13] = -(arg3 + arg2) / (arg3 - arg2);
		this.aFloatArray2631[14] = -(arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray2631[15] = 1.0F;
	}

	public void method2490(float arg0, float arg1, float arg2, float arg3) {
		float var5 = (float) (Math.tan((double) (arg2 / 2.0F)) * (double) arg0);
		float var6 = (float) (Math.tan((double) (arg3 / 2.0F)) * (double) arg0);
		this.method2492(-var5, var5, -var6, var6, arg0, arg1);
	}

	public void method2491(float arg0, float arg1, float arg2) {
		this.method2489(-10000.0F / arg2, 10000.0F / arg2, -10000.0F / arg2, 10000.0F / arg2, arg0, arg1);
	}

	public void method2492(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		this.aFloatArray2631[0] = arg4 * 2.0F / (arg1 - arg0);
		this.aFloatArray2631[1] = 0.0F;
		this.aFloatArray2631[2] = 0.0F;
		this.aFloatArray2631[3] = 0.0F;
		this.aFloatArray2631[4] = 0.0F;
		this.aFloatArray2631[5] = arg4 * 2.0F / (arg3 - arg2);
		this.aFloatArray2631[6] = 0.0F;
		this.aFloatArray2631[7] = 0.0F;
		this.aFloatArray2631[8] = (arg1 + arg0) / (arg1 - arg0);
		this.aFloatArray2631[9] = (arg3 + arg2) / (arg3 - arg2);
		this.aFloatArray2631[10] = (arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray2631[11] = 1.0F;
		this.aFloatArray2631[12] = 0.0F;
		this.aFloatArray2631[13] = 0.0F;
		this.aFloatArray2631[14] = -(arg5 * 2.0F * arg4) / (arg5 - arg4);
		this.aFloatArray2631[15] = 0.0F;
	}

	public void method2493(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7) {
		this.aFloatArray2631[0] = arg2 * 2.0F / arg6;
		this.aFloatArray2631[1] = 0.0F;
		this.aFloatArray2631[2] = 0.0F;
		this.aFloatArray2631[3] = 0.0F;
		this.aFloatArray2631[4] = 0.0F;
		this.aFloatArray2631[5] = arg3 * 2.0F / arg7;
		this.aFloatArray2631[6] = 0.0F;
		this.aFloatArray2631[7] = 0.0F;
		this.aFloatArray2631[8] = arg0 * 2.0F / arg6 - 1.0F;
		this.aFloatArray2631[9] = arg1 * 2.0F / arg7 - 1.0F;
		this.aFloatArray2631[10] = (arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray2631[11] = 1.0F;
		this.aFloatArray2631[12] = 0.0F;
		this.aFloatArray2631[13] = 0.0F;
		this.aFloatArray2631[14] = arg5 * 2.0F * arg4 / (arg4 - arg5);
		this.aFloatArray2631[15] = 0.0F;
	}

	public void method2494(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8) {
		this.method2489(-(arg0 * arg8) / arg2, arg8 * (arg6 - arg0) / arg2, -(arg1 * arg8) / arg3, arg8 * (arg7 - arg1) / arg3, arg4, arg5);
	}

	public float method2495() {
		return -(this.aFloatArray2631[15] + this.aFloatArray2631[14]) / (this.aFloatArray2631[11] + this.aFloatArray2631[10]);
	}

	public float method2496() {
		return (this.aFloatArray2631[14] - this.aFloatArray2631[15]) / (this.aFloatArray2631[11] - this.aFloatArray2631[10]);
	}

	public float[] method2497(float[] arg0) {
		float var2 = this.aFloatArray2631[3] + this.aFloatArray2631[0];
		float var3 = this.aFloatArray2631[7] + this.aFloatArray2631[4];
		float var4 = this.aFloatArray2631[11] + this.aFloatArray2631[8];
		double var5 = Math.sqrt((double) (var2 * var2 + var3 * var3 + var4 * var4));
		arg0[0] = (float) ((double) var2 / var5);
		arg0[1] = (float) ((double) var3 / var5);
		arg0[2] = (float) ((double) var4 / var5);
		arg0[3] = (float) ((double) (this.aFloatArray2631[15] + this.aFloatArray2631[12]) / var5);
		return arg0;
	}

	public float[] method2498(float[] arg0) {
		float var2 = this.aFloatArray2631[3] - this.aFloatArray2631[1];
		float var3 = this.aFloatArray2631[7] - this.aFloatArray2631[5];
		float var4 = this.aFloatArray2631[11] - this.aFloatArray2631[9];
		double var5 = Math.sqrt((double) (var2 * var2 + var3 * var3 + var4 * var4));
		arg0[0] = (float) ((double) var2 / var5);
		arg0[1] = (float) ((double) var3 / var5);
		arg0[2] = (float) ((double) var4 / var5);
		arg0[3] = (float) ((double) (this.aFloatArray2631[15] - this.aFloatArray2631[13]) / var5);
		return arg0;
	}

	public float[] method2499(float[] arg0) {
		float var2 = this.aFloatArray2631[3] + this.aFloatArray2631[2];
		float var3 = this.aFloatArray2631[7] + this.aFloatArray2631[6];
		float var4 = this.aFloatArray2631[11] + this.aFloatArray2631[10];
		double var5 = Math.sqrt((double) (var2 * var2 + var3 * var3 + var4 * var4));
		arg0[0] = (float) ((double) var2 / var5);
		arg0[1] = (float) ((double) var3 / var5);
		arg0[2] = (float) ((double) var4 / var5);
		arg0[3] = (float) ((double) (this.aFloatArray2631[15] + this.aFloatArray2631[14]) / var5);
		return arg0;
	}

	public float[] method2500(float[] arg0) {
		float var2 = this.aFloatArray2631[3] - this.aFloatArray2631[2];
		float var3 = this.aFloatArray2631[7] - this.aFloatArray2631[6];
		float var4 = this.aFloatArray2631[11] - this.aFloatArray2631[10];
		double var5 = Math.sqrt((double) (var2 * var2 + var3 * var3 + var4 * var4));
		arg0[0] = (float) ((double) var2 / var5);
		arg0[1] = (float) ((double) var3 / var5);
		arg0[2] = (float) ((double) var4 / var5);
		arg0[3] = (float) ((double) (this.aFloatArray2631[15] - this.aFloatArray2631[14]) / var5);
		return arg0;
	}

	public void method2501() {
		float var1 = this.aFloatArray2631[0];
		float var2 = this.aFloatArray2631[4];
		float var3 = this.aFloatArray2631[8];
		float var4 = this.aFloatArray2631[12];
		float var5 = this.aFloatArray2631[1];
		float var6 = this.aFloatArray2631[5];
		float var7 = this.aFloatArray2631[9];
		float var8 = this.aFloatArray2631[13];
		float var9 = this.aFloatArray2631[2];
		float var10 = this.aFloatArray2631[6];
		float var11 = this.aFloatArray2631[10];
		float var12 = this.aFloatArray2631[14];
		float var13 = this.aFloatArray2631[3];
		float var14 = this.aFloatArray2631[7];
		float var15 = this.aFloatArray2631[11];
		float var16 = this.aFloatArray2631[15];
		this.aFloatArray2631[0] = var1;
		this.aFloatArray2631[1] = var2;
		this.aFloatArray2631[2] = var3;
		this.aFloatArray2631[3] = var4;
		this.aFloatArray2631[4] = var5;
		this.aFloatArray2631[5] = var6;
		this.aFloatArray2631[6] = var7;
		this.aFloatArray2631[7] = var8;
		this.aFloatArray2631[8] = var9;
		this.aFloatArray2631[9] = var10;
		this.aFloatArray2631[10] = var11;
		this.aFloatArray2631[11] = var12;
		this.aFloatArray2631[12] = var13;
		this.aFloatArray2631[13] = var14;
		this.aFloatArray2631[14] = var15;
		this.aFloatArray2631[15] = var16;
	}

	public float[] method2502(float[] arg0) {
		System.arraycopy(this.aFloatArray2631, 0, arg0, 0, 16);
		arg0[3] = 0.0F;
		arg0[7] = 0.0F;
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[15] = 1.0F;
		return arg0;
	}

	public float[] method2503(float[] arg0) {
		arg0[0] = this.aFloatArray2631[0];
		arg0[1] = this.aFloatArray2631[1];
		arg0[2] = this.aFloatArray2631[2];
		arg0[3] = this.aFloatArray2631[4];
		arg0[4] = this.aFloatArray2631[5];
		arg0[5] = this.aFloatArray2631[6];
		arg0[6] = this.aFloatArray2631[8];
		arg0[7] = this.aFloatArray2631[9];
		arg0[8] = this.aFloatArray2631[10];
		return arg0;
	}

	public float[] method2504(float[] arg0) {
		arg0[0] = this.aFloatArray2631[0];
		arg0[1] = this.aFloatArray2631[4];
		arg0[2] = this.aFloatArray2631[8];
		arg0[3] = this.aFloatArray2631[12];
		arg0[4] = this.aFloatArray2631[1];
		arg0[5] = this.aFloatArray2631[5];
		arg0[6] = this.aFloatArray2631[9];
		arg0[7] = this.aFloatArray2631[13];
		arg0[8] = this.aFloatArray2631[2];
		arg0[9] = this.aFloatArray2631[6];
		arg0[10] = this.aFloatArray2631[10];
		arg0[11] = this.aFloatArray2631[14];
		arg0[12] = this.aFloatArray2631[3];
		arg0[13] = this.aFloatArray2631[7];
		arg0[14] = this.aFloatArray2631[11];
		arg0[15] = this.aFloatArray2631[15];
		return arg0;
	}

	public float[] method2505(float[] arg0) {
		arg0[0] = this.aFloatArray2631[0];
		arg0[1] = this.aFloatArray2631[1];
		arg0[2] = this.aFloatArray2631[4];
		arg0[3] = this.aFloatArray2631[5];
		arg0[4] = this.aFloatArray2631[8];
		arg0[5] = this.aFloatArray2631[9];
		arg0[6] = this.aFloatArray2631[12];
		arg0[7] = this.aFloatArray2631[13];
		return arg0;
	}

	public float[] method2506(float[] arg0) {
		arg0[0] = this.aFloatArray2631[0];
		arg0[1] = this.aFloatArray2631[1];
		arg0[2] = 0.0F;
		arg0[3] = 0.0F;
		arg0[4] = this.aFloatArray2631[4];
		arg0[5] = this.aFloatArray2631[5];
		arg0[6] = 0.0F;
		arg0[7] = 0.0F;
		arg0[8] = this.aFloatArray2631[12];
		arg0[9] = this.aFloatArray2631[13];
		arg0[10] = this.aFloatArray2631[14];
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[15] = 1.0F;
		return arg0;
	}

	public void method2507(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5) {
		float[] var9;
		float[] var10;
		float[] var11;
		float[] var12;
		float[] var13;
		if (arg0 == 0) {
			this.aFloatArray2631[0] = arg1;
			this.aFloatArray2631[5] = arg2;
			this.aFloatArray2631[10] = 1.0F;
			var12 = this.aFloatArray2631;
			var13 = this.aFloatArray2631;
			var9 = this.aFloatArray2631;
			var10 = this.aFloatArray2631;
			var11 = this.aFloatArray2631;
			this.aFloatArray2631[9] = 0.0F;
			var11[8] = 0.0F;
			var10[6] = 0.0F;
			var9[4] = 0.0F;
			var13[2] = 0.0F;
			var12[1] = 0.0F;
		} else {
			float var7 = Class256.aFloatArray2666[arg0 & 0x3FFF];
			float var8 = Class256.aFloatArray2665[arg0 & 0x3FFF];
			this.aFloatArray2631[0] = var7 * (float) arg1;
			this.aFloatArray2631[5] = var7 * (float) arg2;
			this.aFloatArray2631[1] = var8 * (float) arg1;
			this.aFloatArray2631[4] = -var8 * (float) arg2;
			this.aFloatArray2631[10] = 1.0F;
			var9 = this.aFloatArray2631;
			var10 = this.aFloatArray2631;
			var11 = this.aFloatArray2631;
			this.aFloatArray2631[9] = 0.0F;
			var11[8] = 0.0F;
			var10[6] = 0.0F;
			var9[2] = 0.0F;
		}
		var12 = this.aFloatArray2631;
		var13 = this.aFloatArray2631;
		this.aFloatArray2631[11] = 0.0F;
		var13[7] = 0.0F;
		var12[3] = 0.0F;
		this.aFloatArray2631[15] = 1.0F;
		this.aFloatArray2631[12] = arg3;
		this.aFloatArray2631[13] = arg4;
		this.aFloatArray2631[14] = arg5;
	}

	public void method2508(Class247 arg0) {
		this.aFloatArray2631[0] = arg0.aFloat2618;
		this.aFloatArray2631[1] = arg0.aFloat2619;
		this.aFloatArray2631[2] = arg0.aFloat2617;
		this.aFloatArray2631[3] = 0.0F;
		this.aFloatArray2631[4] = arg0.aFloat2620;
		this.aFloatArray2631[5] = arg0.aFloat2622;
		this.aFloatArray2631[6] = arg0.aFloat2623;
		this.aFloatArray2631[7] = 0.0F;
		this.aFloatArray2631[8] = arg0.aFloat2626;
		this.aFloatArray2631[9] = arg0.aFloat2625;
		this.aFloatArray2631[10] = arg0.aFloat2624;
		this.aFloatArray2631[11] = 0.0F;
		this.aFloatArray2631[12] = arg0.aFloat2627;
		this.aFloatArray2631[13] = arg0.aFloat2628;
		this.aFloatArray2631[14] = arg0.aFloat2629;
		this.aFloatArray2631[15] = 1.0F;
	}

	public float[] method2509(float[] arg0) {
		arg0[0] = this.aFloatArray2631[0];
		arg0[1] = this.aFloatArray2631[4];
		arg0[2] = this.aFloatArray2631[8];
		arg0[3] = this.aFloatArray2631[12];
		arg0[4] = this.aFloatArray2631[1];
		arg0[5] = this.aFloatArray2631[5];
		arg0[6] = this.aFloatArray2631[9];
		arg0[7] = this.aFloatArray2631[13];
		return arg0;
	}

	public void method2510(Class249 arg0) {
		System.arraycopy(arg0.aFloatArray2631, 0, this.aFloatArray2631, 0, 16);
	}

	public void method2511(float arg0, float arg1, float arg2, float[] arg3) {
		arg3[0] = this.aFloatArray2631[0] * arg0 + this.aFloatArray2631[4] * arg1 + this.aFloatArray2631[8] * arg2 + this.aFloatArray2631[12];
		arg3[1] = this.aFloatArray2631[1] * arg0 + this.aFloatArray2631[5] * arg1 + this.aFloatArray2631[9] * arg2 + this.aFloatArray2631[13];
		arg3[2] = this.aFloatArray2631[2] * arg0 + this.aFloatArray2631[6] * arg1 + this.aFloatArray2631[10] * arg2 + this.aFloatArray2631[14];
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray2631[3] * arg0 + this.aFloatArray2631[7] * arg1 + this.aFloatArray2631[11] * arg2 + this.aFloatArray2631[15];
		}
	}

	public float[] method2512(float[] arg0) {
		float var2 = this.aFloatArray2631[3] + this.aFloatArray2631[1];
		float var3 = this.aFloatArray2631[7] + this.aFloatArray2631[5];
		float var4 = this.aFloatArray2631[11] + this.aFloatArray2631[9];
		double var5 = Math.sqrt((double) (var2 * var2 + var3 * var3 + var4 * var4));
		arg0[0] = (float) ((double) var2 / var5);
		arg0[1] = (float) ((double) var3 / var5);
		arg0[2] = (float) ((double) var4 / var5);
		arg0[3] = (float) ((double) (this.aFloatArray2631[15] + this.aFloatArray2631[13]) / var5);
		return arg0;
	}

	public float method2513() {
		return this.aFloatArray2631[0] * this.aFloatArray2631[5] * this.aFloatArray2631[10] * this.aFloatArray2631[15] - this.aFloatArray2631[0] * this.aFloatArray2631[5] * this.aFloatArray2631[11] * this.aFloatArray2631[14] - this.aFloatArray2631[0] * this.aFloatArray2631[6] * this.aFloatArray2631[9] * this.aFloatArray2631[15] + this.aFloatArray2631[0] * this.aFloatArray2631[6] * this.aFloatArray2631[11] * this.aFloatArray2631[13] + this.aFloatArray2631[0] * this.aFloatArray2631[7] * this.aFloatArray2631[9] * this.aFloatArray2631[14] - this.aFloatArray2631[0] * this.aFloatArray2631[7] * this.aFloatArray2631[10] * this.aFloatArray2631[13] - this.aFloatArray2631[1] * this.aFloatArray2631[4] * this.aFloatArray2631[10] * this.aFloatArray2631[15] + this.aFloatArray2631[1] * this.aFloatArray2631[4] * this.aFloatArray2631[11] * this.aFloatArray2631[14] + this.aFloatArray2631[1] * this.aFloatArray2631[6] * this.aFloatArray2631[8] * this.aFloatArray2631[15] - this.aFloatArray2631[1] * this.aFloatArray2631[6] * this.aFloatArray2631[11] * this.aFloatArray2631[12] - this.aFloatArray2631[1] * this.aFloatArray2631[7] * this.aFloatArray2631[8] * this.aFloatArray2631[14] + this.aFloatArray2631[1] * this.aFloatArray2631[7] * this.aFloatArray2631[10] * this.aFloatArray2631[12] + this.aFloatArray2631[2] * this.aFloatArray2631[4] * this.aFloatArray2631[9] * this.aFloatArray2631[15] - this.aFloatArray2631[2] * this.aFloatArray2631[4] * this.aFloatArray2631[11] * this.aFloatArray2631[13] - this.aFloatArray2631[2] * this.aFloatArray2631[5] * this.aFloatArray2631[8] * this.aFloatArray2631[15] + this.aFloatArray2631[2] * this.aFloatArray2631[5] * this.aFloatArray2631[11] * this.aFloatArray2631[12] + this.aFloatArray2631[2] * this.aFloatArray2631[7] * this.aFloatArray2631[8] * this.aFloatArray2631[13] - this.aFloatArray2631[2] * this.aFloatArray2631[7] * this.aFloatArray2631[9] * this.aFloatArray2631[12] - this.aFloatArray2631[3] * this.aFloatArray2631[4] * this.aFloatArray2631[9] * this.aFloatArray2631[14] + this.aFloatArray2631[3] * this.aFloatArray2631[4] * this.aFloatArray2631[10] * this.aFloatArray2631[13] + this.aFloatArray2631[3] * this.aFloatArray2631[5] * this.aFloatArray2631[8] * this.aFloatArray2631[14] - this.aFloatArray2631[3] * this.aFloatArray2631[5] * this.aFloatArray2631[10] * this.aFloatArray2631[12] - this.aFloatArray2631[3] * this.aFloatArray2631[6] * this.aFloatArray2631[8] * this.aFloatArray2631[13] + this.aFloatArray2631[3] * this.aFloatArray2631[6] * this.aFloatArray2631[9] * this.aFloatArray2631[12];
	}

	public float[] method2514(float[] arg0) {
		System.arraycopy(this.aFloatArray2631, 0, arg0, 0, 16);
		return arg0;
	}

	public float[] method2515(float[] arg0) {
		float var2 = this.aFloatArray2631[3] - this.aFloatArray2631[0];
		float var3 = this.aFloatArray2631[7] - this.aFloatArray2631[4];
		float var4 = this.aFloatArray2631[11] - this.aFloatArray2631[8];
		double var5 = Math.sqrt((double) (var2 * var2 + var3 * var3 + var4 * var4));
		arg0[0] = (float) ((double) var2 / var5);
		arg0[1] = (float) ((double) var3 / var5);
		arg0[2] = (float) ((double) var4 / var5);
		arg0[3] = (float) ((double) (this.aFloatArray2631[15] - this.aFloatArray2631[12]) / var5);
		return arg0;
	}

	public void method2516() {
		this.aFloatArray2631[0] = 1.0F;
		this.aFloatArray2631[1] = 0.0F;
		this.aFloatArray2631[2] = 0.0F;
		this.aFloatArray2631[3] = 0.0F;
		this.aFloatArray2631[4] = 0.0F;
		this.aFloatArray2631[5] = 1.0F;
		this.aFloatArray2631[6] = 0.0F;
		this.aFloatArray2631[7] = 0.0F;
		this.aFloatArray2631[8] = 0.0F;
		this.aFloatArray2631[9] = 0.0F;
		this.aFloatArray2631[10] = 1.0F;
		this.aFloatArray2631[11] = 0.0F;
		this.aFloatArray2631[12] = 0.0F;
		this.aFloatArray2631[13] = 0.0F;
		this.aFloatArray2631[14] = 0.0F;
		this.aFloatArray2631[15] = 1.0F;
	}
}
