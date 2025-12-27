package deob;

public class Class330_Sub36_Sub15_Sub2 extends Class330_Sub36_Sub15 {

	public Class141 aClass141_10144;

	public float aFloat10143;

	public float aFloat10145;

	public float aFloat10142;

	public void method3496(Buffer arg0, int arg1) {
		try {
			this.aClass141_10144 = Class217.method2247(arg0.readUnsignedByte(333760996), -1946172084);
			this.aFloat10143 = arg0.method3760(-1279245802);
			this.aFloat10145 = arg0.method3760(-1279245802);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "all.p(" + ')');
		}
	}

	public Class330_Sub36_Sub15_Sub2(int arg0, Buffer arg1) {
		super(arg0);
		this.aClass141_10144 = Class217.method2247(arg1.readUnsignedByte(1297642114), -206582960);
		this.aFloat10143 = arg1.method3760(-1279245802);
		this.aFloat10145 = arg1.method3760(-1279245802);
	}

	public void method3502(float arg0, byte arg1) {
		try {
			this.aFloat10142 += arg0 * this.aFloat10145;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "all.j(" + ')');
		}
	}

	public void method3495(Class138 arg0, Class247 arg1, Class249 arg2, int arg3) {
		try {
			float var5 = (float) Math.sin((double) this.aFloat10142);
			float var6 = this.aFloat10143 * var5;
			if (this.aClass141_10144 == Class141.aClass141_1560) {
				arg0.anInt1532 = (int) (var6 + (float) arg0.anInt1532);
				arg1.method2474(var6, 0.0F, 0.0F);
			} else if (this.aClass141_10144 == Class141.aClass141_1561) {
				arg0.anInt1531 = (int) ((float) arg0.anInt1531 + var6);
				arg1.method2474(0.0F, var6, 0.0F);
			} else if (Class141.aClass141_1563 == this.aClass141_10144) {
				arg0.anInt1533 = (int) (var6 + (float) arg0.anInt1533);
				arg1.method2474(0.0F, 0.0F, var6);
			} else if (Class141.aClass141_1562 == this.aClass141_10144) {
				arg1.method2462(1.0F, 0.0F, 0.0F, var6);
			} else if (Class141.aClass141_1559 == this.aClass141_10144) {
				arg1.method2462(0.0F, 1.0F, 0.0F, var6);
			} else if (Class141.aClass141_1564 == this.aClass141_10144) {
				arg1.method2462(0.0F, 0.0F, 1.0F, var6);
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "all.i(" + ')');
		}
	}

	public void method3499(float arg0) {
		this.aFloat10142 += arg0 * this.aFloat10145;
	}

	public void method3497(float arg0) {
		this.aFloat10142 += arg0 * this.aFloat10145;
	}

	public void method3498(float arg0) {
		this.aFloat10142 += arg0 * this.aFloat10145;
	}

	public void method3501(Class138 arg0, Class247 arg1, Class249 arg2) {
		float var4 = (float) Math.sin((double) this.aFloat10142);
		float var5 = this.aFloat10143 * var4;
		if (this.aClass141_10144 == Class141.aClass141_1560) {
			arg0.anInt1532 = (int) (var5 + (float) (arg0.anInt1532 * -581921585 * -1708658129)) * -581921585 * -1708658129;
			arg1.method2474(var5, 0.0F, 0.0F);
		} else if (this.aClass141_10144 == Class141.aClass141_1561) {
			arg0.anInt1531 = (int) ((float) (arg0.anInt1531 * -1724005309 * 1868671083) + var5) * 1868671083 * -1724005309;
			arg1.method2474(0.0F, var5, 0.0F);
		} else if (Class141.aClass141_1563 == this.aClass141_10144) {
			arg0.anInt1533 = (int) (var5 + (float) (arg0.anInt1533 * -950728209 * 1914258703)) * -950728209 * 1914258703;
			arg1.method2474(0.0F, 0.0F, var5);
		} else if (Class141.aClass141_1562 == this.aClass141_10144) {
			arg1.method2462(1.0F, 0.0F, 0.0F, var5);
		} else if (Class141.aClass141_1559 == this.aClass141_10144) {
			arg1.method2462(0.0F, 1.0F, 0.0F, var5);
		} else if (Class141.aClass141_1564 == this.aClass141_10144) {
			arg1.method2462(0.0F, 0.0F, 1.0F, var5);
		}
	}

	public void method3494(Class138 arg0, Class247 arg1, Class249 arg2) {
		float var4 = (float) Math.sin((double) this.aFloat10142);
		float var5 = this.aFloat10143 * var4;
		if (this.aClass141_10144 == Class141.aClass141_1560) {
			arg0.anInt1532 = (int) (var5 + (float) (arg0.anInt1532 * -581921585 * -1708658129)) * -581921585 * -1708658129;
			arg1.method2474(var5, 0.0F, 0.0F);
		} else if (this.aClass141_10144 == Class141.aClass141_1561) {
			arg0.anInt1531 = (int) ((float) (arg0.anInt1531 * -1724005309 * 1868671083) + var5) * 1868671083 * -1724005309;
			arg1.method2474(0.0F, var5, 0.0F);
		} else if (Class141.aClass141_1563 == this.aClass141_10144) {
			arg0.anInt1533 = (int) (var5 + (float) (arg0.anInt1533 * -950728209 * 1914258703)) * -950728209 * 1914258703;
			arg1.method2474(0.0F, 0.0F, var5);
		} else if (Class141.aClass141_1562 == this.aClass141_10144) {
			arg1.method2462(1.0F, 0.0F, 0.0F, var5);
		} else if (Class141.aClass141_1559 == this.aClass141_10144) {
			arg1.method2462(0.0F, 1.0F, 0.0F, var5);
		} else if (Class141.aClass141_1564 == this.aClass141_10144) {
			arg1.method2462(0.0F, 0.0F, 1.0F, var5);
		}
	}

	public void method3500(Class138 arg0, Class247 arg1, Class249 arg2) {
		float var4 = (float) Math.sin((double) this.aFloat10142);
		float var5 = this.aFloat10143 * var4;
		if (this.aClass141_10144 == Class141.aClass141_1560) {
			arg0.anInt1532 = (int) (var5 + (float) (arg0.anInt1532 * -581921585 * -1708658129)) * -581921585 * -1708658129;
			arg1.method2474(var5, 0.0F, 0.0F);
		} else if (this.aClass141_10144 == Class141.aClass141_1561) {
			arg0.anInt1531 = (int) ((float) (arg0.anInt1531 * -1724005309 * 1868671083) + var5) * 1868671083 * -1724005309;
			arg1.method2474(0.0F, var5, 0.0F);
		} else if (Class141.aClass141_1563 == this.aClass141_10144) {
			arg0.anInt1533 = (int) (var5 + (float) (arg0.anInt1533 * -950728209 * 1914258703)) * -950728209 * 1914258703;
			arg1.method2474(0.0F, 0.0F, var5);
		} else if (Class141.aClass141_1562 == this.aClass141_10144) {
			arg1.method2462(1.0F, 0.0F, 0.0F, var5);
		} else if (Class141.aClass141_1559 == this.aClass141_10144) {
			arg1.method2462(0.0F, 1.0F, 0.0F, var5);
		} else if (Class141.aClass141_1564 == this.aClass141_10144) {
			arg1.method2462(0.0F, 0.0F, 1.0F, var5);
		}
	}

	public Class330_Sub36_Sub15_Sub2(int arg0, Class141 arg1, float arg2, float arg3) {
		super(arg0);
		this.aClass141_10144 = arg1;
		this.aFloat10143 = arg2;
		this.aFloat10145 = arg3;
	}

	public void method3493(Buffer arg0) {
		this.aClass141_10144 = Class217.method2247(arg0.readUnsignedByte(1064307750), -1484218123);
		this.aFloat10143 = arg0.method3760(-1279245802);
		this.aFloat10145 = arg0.method3760(-1279245802);
	}
}
