package deob;

public class Class516 {

	public static int anInt5974;

	public Class516() throws Throwable {
		throw new Error();
	}

	public static final void method6206(Class_ra arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			arg0.r(arg1, arg2, arg1 + arg3, arg2 + arg4);
			arg0.method4789(arg1, arg2, arg3, arg4, -16777216, 463754225);
			if (Class354_Sub1.anInt7977 >= 100) {
				float var6 = (float) Class354_Sub1.anInt3513 / (float) Class354_Sub1.anInt3524;
				int var7 = arg3;
				int var8 = arg4;
				if (var6 < 1.0F) {
					var8 = (int) ((float) arg3 * var6);
				} else {
					var7 = (int) ((float) arg4 / var6);
				}
				int var20 = arg1 + (arg3 - var7) / 2;
				int var21 = arg2 + (arg4 - var8) / 2;
				if (Class201_Sub2.aClass61_8943 == null || Class201_Sub2.aClass61_8943.method681() != arg3 || Class201_Sub2.aClass61_8943.method682() != arg4) {
					Class354_Sub1.method4090(Class354_Sub1.anInt3510, Class354_Sub1.anInt3513 + Class354_Sub1.anInt3516, Class354_Sub1.anInt3524 + Class354_Sub1.anInt3510, Class354_Sub1.anInt3516, var20, var21, var7 + var20, var21 + var8);
					Class354_Sub1.method4091(arg0);
					Class201_Sub2.aClass61_8943 = arg0.bj(var20, var21, var7, var8, false);
				}
				Class201_Sub2.aClass61_8943.method687(var20, var21);
				int var9 = Class379.anInt3953 * var7 / Class354_Sub1.anInt3524;
				int var10 = Class525.anInt6037 * var8 / Class354_Sub1.anInt3513;
				int var11 = var20 + Class557.anInt6399 * var7 / Class354_Sub1.anInt3524;
				int var12 = var21 + var8 - var8 * Class475.anInt5701 / Class354_Sub1.anInt3513 - var10;
				int var13 = -1996554240;
				if (Class435.aClass435_4416 == client.aClass435_9146) {
					var13 = -1996488705;
				}
				arg0.B(var11, var12, var9, var10, var13, 1);
				arg0.bl(var11, var12, var9, var10, var13, 0);
				if (Class448.anInt5556 > 0) {
					int var14;
					if (Class101.anInt6456 > 50) {
						var14 = 500 - Class101.anInt6456 * 5;
					} else {
						var14 = Class101.anInt6456 * 5;
					}
					for (Class330_Sub38 var15 = (Class330_Sub38) Class354_Sub1.aClass471_3509.method5869(539664854); var15 != null; var15 = (Class330_Sub38) Class354_Sub1.aClass471_3509.method5873((byte) 6)) {
						Class372 var16 = Class354_Sub1.aClass380_3529.method4387(var15.anInt7755, (byte) -61);
						if (Class411.method5232(var16, -115239456)) {
							int var17;
							int var18;
							if (var15.anInt7755 == Class354_Sub1.anInt7987) {
								var17 = var7 * var15.anInt7756 / Class354_Sub1.anInt3524 + var20;
								var18 = var8 * (Class354_Sub1.anInt3513 - var15.anInt7753) / Class354_Sub1.anInt3513 + var21;
								arg0.method4789(var17 - 2, var18 - 2, 4, 4, var14 << 24 | 0xFFFF00, 463754225);
							} else if (Class354_Sub1.anInt7980 != -1 && Class354_Sub1.anInt7980 == var16.anInt3911) {
								var17 = var7 * var15.anInt7756 / Class354_Sub1.anInt3524 + var20;
								var18 = (Class354_Sub1.anInt3513 - var15.anInt7753) * var8 / Class354_Sub1.anInt3513 + var21;
								arg0.method4789(var17 - 2, var18 - 2, 4, 4, var14 << 24 | 0xFFFF00, 463754225);
							}
						} else if (arg5 == -73386531) {
						}
					}
				}
			}
		} catch (RuntimeException var19) {
			throw Class476.method5964(var19, "vi.cn(" + ')');
		}
	}
}
