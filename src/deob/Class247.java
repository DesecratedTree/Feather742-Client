package deob;

public class Class247 {

	public static Class247 aClass247_2621 = new Class247();

	public float aFloat2617;

	public float aFloat2618;

	public float aFloat2619;

	public float aFloat2620;

	public float aFloat2622;

	public float aFloat2623;

	public float aFloat2624;

	public float aFloat2625;

	public float aFloat2626;

	public float aFloat2627;

	public float aFloat2628;

	public float aFloat2629;

	public Class247(Class247 arg0) {
		this.method2454(arg0);
	}

	public void method2454(Class247 arg0) {
		this.aFloat2618 = arg0.aFloat2618;
		this.aFloat2620 = arg0.aFloat2620;
		this.aFloat2626 = arg0.aFloat2626;
		this.aFloat2627 = arg0.aFloat2627;
		this.aFloat2619 = arg0.aFloat2619;
		this.aFloat2622 = arg0.aFloat2622;
		this.aFloat2625 = arg0.aFloat2625;
		this.aFloat2628 = arg0.aFloat2628;
		this.aFloat2617 = arg0.aFloat2617;
		this.aFloat2623 = arg0.aFloat2623;
		this.aFloat2624 = arg0.aFloat2624;
		this.aFloat2629 = arg0.aFloat2629;
	}

	public void method2455(Class241 arg0) {
		this.method2464(arg0.aClass244_2607);
		this.method2466(arg0.aClass260_2606);
	}

	public void method2456(Class241 arg0) {
		float var2 = arg0.aClass244_2607.aFloat2614 * arg0.aClass244_2607.aFloat2614;
		float var3 = arg0.aClass244_2607.aFloat2614 * arg0.aClass244_2607.aFloat2608;
		float var4 = arg0.aClass244_2607.aFloat2614 * arg0.aClass244_2607.aFloat2612;
		float var5 = arg0.aClass244_2607.aFloat2614 * arg0.aClass244_2607.aFloat2613;
		float var6 = arg0.aClass244_2607.aFloat2608 * arg0.aClass244_2607.aFloat2608;
		float var7 = arg0.aClass244_2607.aFloat2608 * arg0.aClass244_2607.aFloat2612;
		float var8 = arg0.aClass244_2607.aFloat2608 * arg0.aClass244_2607.aFloat2613;
		float var9 = arg0.aClass244_2607.aFloat2612 * arg0.aClass244_2607.aFloat2612;
		float var10 = arg0.aClass244_2607.aFloat2612 * arg0.aClass244_2607.aFloat2613;
		float var11 = arg0.aClass244_2607.aFloat2613 * arg0.aClass244_2607.aFloat2613;
		this.aFloat2618 = var6 + var2 - var11 - var9;
		this.aFloat2619 = var7 + var5 + var7 + var5;
		this.aFloat2617 = var8 - var4 - var4 + var8;
		this.aFloat2620 = var7 - var5 - var5 + var7;
		this.aFloat2622 = var9 + var2 - var6 - var11;
		this.aFloat2623 = var10 + var3 + var10 + var3;
		this.aFloat2626 = var8 + var4 + var8 + var4;
		this.aFloat2625 = var10 - var3 - var3 + var10;
		this.aFloat2624 = var11 + var2 - var9 - var6;
		this.aFloat2627 = arg0.aClass260_2606.aFloat2716;
		this.aFloat2628 = arg0.aClass260_2606.aFloat2715;
		this.aFloat2629 = arg0.aClass260_2606.aFloat2711;
	}

	public void method2457(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8) {
		float var10 = arg3 - arg0;
		float var11 = arg4 - arg1;
		float var12 = arg5 - arg2;
		float var13 = arg7 * var12 - arg8 * var11;
		float var14 = arg8 * var10 - arg6 * var12;
		float var15 = arg6 * var11 - arg7 * var10;
		float var16 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + var14 * var14 + var15 * var15)));
		float var17 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11 + var12 * var12)));
		this.aFloat2618 = var13 * var16;
		this.aFloat2620 = var14 * var16;
		this.aFloat2626 = var15 * var16;
		this.aFloat2617 = var10 * var17;
		this.aFloat2623 = var11 * var17;
		this.aFloat2624 = var12 * var17;
		this.aFloat2619 = this.aFloat2623 * this.aFloat2626 - this.aFloat2624 * this.aFloat2620;
		this.aFloat2622 = this.aFloat2624 * this.aFloat2618 - this.aFloat2617 * this.aFloat2626;
		this.aFloat2625 = this.aFloat2617 * this.aFloat2620 - this.aFloat2623 * this.aFloat2618;
		this.aFloat2627 = -(arg0 * this.aFloat2618 + arg1 * this.aFloat2620 + arg2 * this.aFloat2626);
		this.aFloat2628 = -(arg0 * this.aFloat2619 + arg1 * this.aFloat2622 + arg2 * this.aFloat2625);
		this.aFloat2629 = -(arg0 * this.aFloat2617 + arg1 * this.aFloat2623 + arg2 * this.aFloat2624);
	}

	public void method2458(Class247 arg0) {
		if (arg0 == this) {
			this.method2459();
			return;
		}
		this.aFloat2618 = arg0.aFloat2618;
		this.aFloat2620 = arg0.aFloat2619;
		this.aFloat2626 = arg0.aFloat2617;
		this.aFloat2619 = arg0.aFloat2620;
		this.aFloat2622 = arg0.aFloat2622;
		this.aFloat2625 = arg0.aFloat2623;
		this.aFloat2617 = arg0.aFloat2626;
		this.aFloat2623 = arg0.aFloat2625;
		this.aFloat2624 = arg0.aFloat2624;
		this.aFloat2627 = -(arg0.aFloat2627 * this.aFloat2618 + arg0.aFloat2628 * this.aFloat2620 + arg0.aFloat2629 * this.aFloat2626);
		this.aFloat2628 = -(arg0.aFloat2627 * this.aFloat2619 + arg0.aFloat2628 * this.aFloat2622 + arg0.aFloat2629 * this.aFloat2625);
		this.aFloat2629 = -(arg0.aFloat2627 * this.aFloat2617 + arg0.aFloat2628 * this.aFloat2623 + arg0.aFloat2629 * this.aFloat2624);
	}

	public void method2459() {
		float var1 = this.aFloat2627;
		float var2 = this.aFloat2628;
		float var3 = this.aFloat2620;
		this.aFloat2620 = this.aFloat2619;
		this.aFloat2619 = var3;
		float var4 = this.aFloat2626;
		this.aFloat2626 = this.aFloat2617;
		this.aFloat2617 = var4;
		float var5 = this.aFloat2625;
		this.aFloat2625 = this.aFloat2623;
		this.aFloat2623 = var5;
		this.aFloat2627 = -(var1 * this.aFloat2618 + var2 * this.aFloat2620 + this.aFloat2629 * this.aFloat2626);
		this.aFloat2628 = -(var1 * this.aFloat2619 + var2 * this.aFloat2622 + this.aFloat2629 * this.aFloat2625);
		this.aFloat2629 = -(var1 * this.aFloat2617 + var2 * this.aFloat2623 + this.aFloat2629 * this.aFloat2624);
	}

	public void method2460() {
		this.aFloat2629 = 0.0F;
		this.aFloat2628 = 0.0F;
		this.aFloat2627 = 0.0F;
		this.aFloat2625 = 0.0F;
		this.aFloat2626 = 0.0F;
		this.aFloat2623 = 0.0F;
		this.aFloat2620 = 0.0F;
		this.aFloat2617 = 0.0F;
		this.aFloat2619 = 0.0F;
		this.aFloat2624 = 1.0F;
		this.aFloat2622 = 1.0F;
		this.aFloat2618 = 1.0F;
	}

	public void method2461(float arg0, float arg1, float arg2, float arg3) {
		float var5 = arg0 * arg0;
		float var6 = arg0 * arg1;
		float var7 = arg0 * arg2;
		float var8 = arg0 * arg3;
		float var9 = arg1 * arg1;
		float var10 = arg1 * arg2;
		float var11 = arg1 * arg3;
		float var12 = arg2 * arg2;
		float var13 = arg2 * arg3;
		this.aFloat2618 = 1.0F - (var9 + var12) * 2.0F;
		this.aFloat2620 = (var6 - var13) * 2.0F;
		this.aFloat2626 = (var7 + var11) * 2.0F;
		this.aFloat2619 = (var6 + var13) * 2.0F;
		this.aFloat2622 = 1.0F - (var5 + var12) * 2.0F;
		this.aFloat2625 = (var10 - var8) * 2.0F;
		this.aFloat2617 = (var7 - var11) * 2.0F;
		this.aFloat2623 = (var10 + var8) * 2.0F;
		this.aFloat2624 = 1.0F - (var5 + var9) * 2.0F;
		this.aFloat2629 = 0.0F;
		this.aFloat2628 = 0.0F;
		this.aFloat2627 = 0.0F;
	}

	public void method2462(float arg0, float arg1, float arg2, float arg3) {
		float var5 = (float) Math.cos((double) arg3);
		float var6 = (float) Math.sin((double) arg3);
		float var7 = var5 + arg0 * arg0 * (1.0F - var5);
		float var8 = arg2 * var6 + arg1 * arg0 * (1.0F - var5);
		float var9 = -arg1 * var6 + arg2 * arg0 * (1.0F - var5);
		float var10 = -arg2 * var6 + arg0 * arg1 * (1.0F - var5);
		float var11 = var5 + arg1 * arg1 * (1.0F - var5);
		float var12 = arg0 * var6 + arg2 * arg1 * (1.0F - var5);
		float var13 = arg1 * var6 + arg0 * arg2 * (1.0F - var5);
		float var14 = -arg0 * var6 + arg1 * arg2 * (1.0F - var5);
		float var15 = var5 + arg2 * arg2 * (1.0F - var5);
		float var16 = this.aFloat2618;
		float var17 = this.aFloat2619;
		float var18 = this.aFloat2620;
		float var19 = this.aFloat2622;
		float var20 = this.aFloat2626;
		float var21 = this.aFloat2625;
		float var22 = this.aFloat2627;
		float var23 = this.aFloat2628;
		this.aFloat2618 = var16 * var7 + var17 * var10 + this.aFloat2617 * var13;
		this.aFloat2619 = var16 * var8 + var17 * var11 + this.aFloat2617 * var14;
		this.aFloat2617 = var16 * var9 + var17 * var12 + this.aFloat2617 * var15;
		this.aFloat2620 = var18 * var7 + var19 * var10 + this.aFloat2623 * var13;
		this.aFloat2622 = var18 * var8 + var19 * var11 + this.aFloat2623 * var14;
		this.aFloat2623 = var18 * var9 + var19 * var12 + this.aFloat2623 * var15;
		this.aFloat2626 = var20 * var7 + var21 * var10 + this.aFloat2624 * var13;
		this.aFloat2625 = var20 * var8 + var21 * var11 + this.aFloat2624 * var14;
		this.aFloat2624 = var20 * var9 + var21 * var12 + this.aFloat2624 * var15;
		this.aFloat2627 = var22 * var7 + var23 * var10 + this.aFloat2629 * var13;
		this.aFloat2628 = var22 * var8 + var23 * var11 + this.aFloat2629 * var14;
		this.aFloat2629 = var22 * var9 + var23 * var12 + this.aFloat2629 * var15;
	}

	public void method2463(float arg0, float arg1, float arg2) {
		this.aFloat2618 = arg0;
		this.aFloat2620 = 0.0F;
		this.aFloat2626 = 0.0F;
		this.aFloat2627 = 0.0F;
		this.aFloat2619 = 0.0F;
		this.aFloat2622 = arg1;
		this.aFloat2625 = 0.0F;
		this.aFloat2628 = 0.0F;
		this.aFloat2617 = 0.0F;
		this.aFloat2623 = 0.0F;
		this.aFloat2624 = arg2;
		this.aFloat2629 = 0.0F;
	}

	public void method2464(Class244 arg0) {
		this.method2461(arg0.aFloat2608, arg0.aFloat2612, arg0.aFloat2613, arg0.aFloat2614);
	}

	public void method2465(float arg0, float arg1, float arg2, float[] arg3) {
		arg3[0] = this.aFloat2618 * arg0 + this.aFloat2620 * arg1 + this.aFloat2626 * arg2 + this.aFloat2627;
		arg3[1] = this.aFloat2619 * arg0 + this.aFloat2622 * arg1 + this.aFloat2625 * arg2 + this.aFloat2628;
		arg3[2] = this.aFloat2617 * arg0 + this.aFloat2623 * arg1 + this.aFloat2624 * arg2 + this.aFloat2629;
	}

	public void method2466(Class260 arg0) {
		this.method2474(arg0.aFloat2716, arg0.aFloat2715, arg0.aFloat2711);
	}

	public void method2467(Class247 arg0) {
		float var2 = this.aFloat2618;
		float var3 = this.aFloat2619;
		float var4 = this.aFloat2620;
		float var5 = this.aFloat2622;
		float var6 = this.aFloat2626;
		float var7 = this.aFloat2625;
		float var8 = this.aFloat2627;
		float var9 = this.aFloat2628;
		float var10 = this.aFloat2617;
		float var11 = this.aFloat2623;
		float var12 = this.aFloat2624;
		float var13 = this.aFloat2629;
		this.aFloat2618 = var2 * arg0.aFloat2618 + var3 * arg0.aFloat2620 + var10 * arg0.aFloat2626;
		this.aFloat2619 = var2 * arg0.aFloat2619 + var3 * arg0.aFloat2622 + var10 * arg0.aFloat2625;
		this.aFloat2617 = var2 * arg0.aFloat2617 + var3 * arg0.aFloat2623 + var10 * arg0.aFloat2624;
		this.aFloat2620 = var4 * arg0.aFloat2618 + var5 * arg0.aFloat2620 + var11 * arg0.aFloat2626;
		this.aFloat2622 = var4 * arg0.aFloat2619 + var5 * arg0.aFloat2622 + var11 * arg0.aFloat2625;
		this.aFloat2623 = var4 * arg0.aFloat2617 + var5 * arg0.aFloat2623 + var11 * arg0.aFloat2624;
		this.aFloat2626 = var6 * arg0.aFloat2618 + var7 * arg0.aFloat2620 + var12 * arg0.aFloat2626;
		this.aFloat2625 = var6 * arg0.aFloat2619 + var7 * arg0.aFloat2622 + var12 * arg0.aFloat2625;
		this.aFloat2624 = var6 * arg0.aFloat2617 + var7 * arg0.aFloat2623 + var12 * arg0.aFloat2624;
		this.aFloat2627 = var8 * arg0.aFloat2618 + var9 * arg0.aFloat2620 + var13 * arg0.aFloat2626 + arg0.aFloat2627;
		this.aFloat2628 = var8 * arg0.aFloat2619 + var9 * arg0.aFloat2622 + var13 * arg0.aFloat2625 + arg0.aFloat2628;
		this.aFloat2629 = var8 * arg0.aFloat2617 + var9 * arg0.aFloat2623 + var13 * arg0.aFloat2624 + arg0.aFloat2629;
	}

	public void method2468(float arg0, float arg1, float arg2) {
		this.aFloat2618 *= arg0;
		this.aFloat2620 *= arg0;
		this.aFloat2626 *= arg0;
		this.aFloat2627 *= arg0;
		this.aFloat2619 *= arg1;
		this.aFloat2622 *= arg1;
		this.aFloat2625 *= arg1;
		this.aFloat2628 *= arg1;
		this.aFloat2617 *= arg2;
		this.aFloat2623 *= arg2;
		this.aFloat2624 *= arg2;
		this.aFloat2629 *= arg2;
	}

	public void method2469(float arg0, float arg1, float arg2, float[] arg3) {
		float var5 = arg0 - this.aFloat2627;
		float var6 = arg1 - this.aFloat2628;
		float var7 = arg2 - this.aFloat2629;
		arg3[0] = (float) (this.aFloat2618 * var5 + this.aFloat2619 * var6 + this.aFloat2617 * var7);
		arg3[1] = (float) (this.aFloat2620 * var5 + this.aFloat2622 * var6 + this.aFloat2623 * var7);
		arg3[2] = (float) (this.aFloat2626 * var5 + this.aFloat2625 * var6 + this.aFloat2624 * var7);
	}

	public void method2470(float[] arg0) {
		float var2 = arg0[0] - this.aFloat2627;
		float var3 = arg0[1] - this.aFloat2628;
		float var4 = arg0[2] - this.aFloat2629;
		arg0[0] = (float) (this.aFloat2618 * var2 + this.aFloat2619 * var3 + this.aFloat2617 * var4);
		arg0[1] = (float) (this.aFloat2620 * var2 + this.aFloat2622 * var3 + this.aFloat2623 * var4);
		arg0[2] = (float) (this.aFloat2626 * var2 + this.aFloat2625 * var3 + this.aFloat2624 * var4);
	}

	public void method2471(float[] arg0) {
		float var2 = arg0[0];
		float var3 = arg0[1];
		float var4 = arg0[2];
		arg0[0] = this.aFloat2618 * var2 + this.aFloat2619 * var3 + this.aFloat2617 * var4;
		arg0[1] = this.aFloat2620 * var2 + this.aFloat2622 * var3 + this.aFloat2623 * var4;
		arg0[2] = this.aFloat2626 * var2 + this.aFloat2625 * var3 + this.aFloat2624 * var4;
	}

	public float[] method2472(float[] arg0) {
		arg0[0] = this.aFloat2627;
		arg0[1] = this.aFloat2628;
		arg0[2] = this.aFloat2629;
		return arg0;
	}

	public void method2473(float arg0, float arg1, float arg2, float arg3) {
		float var5 = (float) Math.cos((double) arg3);
		float var6 = (float) Math.sin((double) arg3);
		this.aFloat2618 = var5 + arg0 * arg0 * (1.0F - var5);
		this.aFloat2619 = arg2 * var6 + arg1 * arg0 * (1.0F - var5);
		this.aFloat2617 = -arg1 * var6 + arg2 * arg0 * (1.0F - var5);
		this.aFloat2620 = -arg2 * var6 + arg0 * arg1 * (1.0F - var5);
		this.aFloat2622 = var5 + arg1 * arg1 * (1.0F - var5);
		this.aFloat2623 = arg0 * var6 + arg2 * arg1 * (1.0F - var5);
		this.aFloat2626 = arg1 * var6 + arg0 * arg2 * (1.0F - var5);
		this.aFloat2625 = -arg0 * var6 + arg1 * arg2 * (1.0F - var5);
		this.aFloat2624 = var5 + arg2 * arg2 * (1.0F - var5);
		this.aFloat2629 = 0.0F;
		this.aFloat2628 = 0.0F;
		this.aFloat2627 = 0.0F;
	}

	public void method2474(float arg0, float arg1, float arg2) {
		this.aFloat2627 += arg0;
		this.aFloat2628 += arg1;
		this.aFloat2629 += arg2;
	}

	public void method2475(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5) {
		if (arg0 == 0) {
			this.aFloat2625 = 0.0F;
			this.aFloat2626 = 0.0F;
			this.aFloat2623 = 0.0F;
			this.aFloat2620 = 0.0F;
			this.aFloat2617 = 0.0F;
			this.aFloat2619 = 0.0F;
			this.aFloat2618 = arg1 * 2;
			this.aFloat2622 = arg2 * 2;
			this.aFloat2624 = 1.0F;
			this.aFloat2627 = arg3 - (float) arg1;
			this.aFloat2628 = arg4 - (float) arg2;
			this.aFloat2629 = arg5;
			return;
		}
		float var7 = Class256.aFloatArray2666[arg0 & 0x3FFF];
		float var8 = Class256.aFloatArray2665[arg0 & 0x3FFF];
		this.aFloat2624 = 1.0F;
		this.aFloat2625 = 0.0F;
		this.aFloat2626 = 0.0F;
		this.aFloat2623 = 0.0F;
		this.aFloat2617 = 0.0F;
		this.aFloat2618 = var7 * 2.0F * (float) arg1;
		this.aFloat2622 = var7 * 2.0F * (float) arg2;
		this.aFloat2619 = var8 * 2.0F * (float) arg1;
		this.aFloat2620 = -2.0F * var8 * (float) arg2;
		this.aFloat2627 = (float) (arg1 * 2) * (var8 * 0.5F - var7 * 0.5F) + arg3;
		this.aFloat2628 = (float) (arg2 * 2) * (-0.5F * var8 - var7 * 0.5F) + arg4;
		this.aFloat2629 = arg5;
	}

	public void method2476(float arg0, float arg1, float arg2) {
		this.aFloat2625 = 0.0F;
		this.aFloat2626 = 0.0F;
		this.aFloat2623 = 0.0F;
		this.aFloat2620 = 0.0F;
		this.aFloat2617 = 0.0F;
		this.aFloat2619 = 0.0F;
		this.aFloat2624 = 1.0F;
		this.aFloat2622 = 1.0F;
		this.aFloat2618 = 1.0F;
		this.aFloat2627 = arg0;
		this.aFloat2628 = arg1;
		this.aFloat2629 = arg2;
	}

	public void method2477(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8) {
		this.aFloat2618 = arg0;
		this.aFloat2620 = arg3;
		this.aFloat2626 = arg6;
		this.aFloat2627 = 0.0F;
		this.aFloat2619 = arg1;
		this.aFloat2622 = arg4;
		this.aFloat2625 = arg7;
		this.aFloat2628 = 0.0F;
		this.aFloat2617 = arg2;
		this.aFloat2623 = arg5;
		this.aFloat2624 = arg8;
		this.aFloat2629 = 0.0F;
	}

	public void method2478(Class247 arg0, Class247 arg1) {
		this.aFloat2618 = arg0.aFloat2618 * arg1.aFloat2618 + arg0.aFloat2619 * arg1.aFloat2620 + arg0.aFloat2617 * arg1.aFloat2626;
		this.aFloat2619 = arg0.aFloat2618 * arg1.aFloat2619 + arg0.aFloat2619 * arg1.aFloat2622 + arg0.aFloat2617 * arg1.aFloat2625;
		this.aFloat2617 = arg0.aFloat2618 * arg1.aFloat2617 + arg0.aFloat2619 * arg1.aFloat2623 + arg0.aFloat2617 * arg1.aFloat2624;
		this.aFloat2620 = arg0.aFloat2620 * arg1.aFloat2618 + arg0.aFloat2622 * arg1.aFloat2620 + arg0.aFloat2623 * arg1.aFloat2626;
		this.aFloat2622 = arg0.aFloat2620 * arg1.aFloat2619 + arg0.aFloat2622 * arg1.aFloat2622 + arg0.aFloat2623 * arg1.aFloat2625;
		this.aFloat2623 = arg0.aFloat2620 * arg1.aFloat2617 + arg0.aFloat2622 * arg1.aFloat2623 + arg0.aFloat2623 * arg1.aFloat2624;
		this.aFloat2626 = arg0.aFloat2626 * arg1.aFloat2618 + arg0.aFloat2625 * arg1.aFloat2620 + arg0.aFloat2624 * arg1.aFloat2626;
		this.aFloat2625 = arg0.aFloat2626 * arg1.aFloat2619 + arg0.aFloat2625 * arg1.aFloat2622 + arg0.aFloat2624 * arg1.aFloat2625;
		this.aFloat2624 = arg0.aFloat2626 * arg1.aFloat2617 + arg0.aFloat2625 * arg1.aFloat2623 + arg0.aFloat2624 * arg1.aFloat2624;
		this.aFloat2627 = arg0.aFloat2627 * arg1.aFloat2618 + arg0.aFloat2628 * arg1.aFloat2620 + arg0.aFloat2629 * arg1.aFloat2626 + arg1.aFloat2627;
		this.aFloat2628 = arg0.aFloat2627 * arg1.aFloat2619 + arg0.aFloat2628 * arg1.aFloat2622 + arg0.aFloat2629 * arg1.aFloat2625 + arg1.aFloat2628;
		this.aFloat2629 = arg0.aFloat2627 * arg1.aFloat2617 + arg0.aFloat2628 * arg1.aFloat2623 + arg0.aFloat2629 * arg1.aFloat2624 + arg1.aFloat2629;
	}

	public Class247() {
		this.method2460();
	}
}
