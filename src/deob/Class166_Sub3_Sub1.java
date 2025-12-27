package deob;

public class Class166_Sub3_Sub1 extends Class166_Sub3 {

	public Class166_Sub3_Sub1(Class145 arg0) {
		super(arg0);
	}

	public float method2014(float arg0, float arg1, float arg2, int arg3) {
		try {
			float var5 = arg0 - this.aFloat7335;
			if (this.aClass145_1699.method1699(74607982).aFloat2716 == Float.POSITIVE_INFINITY) {
				arg1 = this.aClass145_1699.method1708(-1014367402).method2565();
			} else {
				float var6 = arg1 / this.aClass145_1699.method1699(1960728991).method2565();
				float var7 = arg1 / 2.0F * var6;
				if (var7 > var5) {
					arg1 -= this.aClass145_1699.method1699(-729212258).method2565() * arg2;
					if (arg1 < 0.0F) {
						arg1 = 0.0F;
					}
				} else if (arg1 < this.aClass145_1699.method1708(-168579731).method2565()) {
					arg1 += this.aClass145_1699.method1699(484456408).method2565() * arg2;
					if (arg1 > this.aClass145_1699.method1708(-217103587).method2565()) {
						arg1 = this.aClass145_1699.method1708(-182630427).method2565();
					}
				}
			}
			return arg1;
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "ahc.y(" + ')');
		}
	}

	public float method2013(float arg0, float arg1, float arg2) {
		float var4 = arg0 - this.aFloat7335;
		if (this.aClass145_1699.method1699(-1083416753).aFloat2716 == Float.POSITIVE_INFINITY) {
			arg1 = this.aClass145_1699.method1708(-622694018).method2565();
		} else {
			float var5 = arg1 / this.aClass145_1699.method1699(856727831).method2565();
			float var6 = arg1 / 2.0F * var5;
			if (var6 > var4) {
				arg1 -= this.aClass145_1699.method1699(289227826).method2565() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.aClass145_1699.method1708(97374367).method2565()) {
				arg1 += this.aClass145_1699.method1699(193536057).method2565() * arg2;
				if (arg1 > this.aClass145_1699.method1708(1409735172).method2565()) {
					arg1 = this.aClass145_1699.method1708(2125405307).method2565();
				}
			}
		}
		return arg1;
	}

	public static final void method2016(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class330_Sub36_Sub12 var3 = Class354.method4083(var2);
			if (var3 == null) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt9706 - var3.anInt9709;
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt9712 - var3.anInt9704;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ahc.aen(" + ')');
		}
	}
}
