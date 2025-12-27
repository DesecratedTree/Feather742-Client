package deob;

public class Class410 {

	public Class381 aClass381_4243;

	public int anInt4244;

	public Class410(Class381 arg0, int arg1) {
		this.aClass381_4243 = arg0;
		this.anInt4244 = arg1;
	}

	public Class432_Sub1_Sub2_Sub1 method5219(byte arg0) {
		try {
			Class330_Sub9 var2 = (Class330_Sub9) client.aClass497_9138.method6094((long) (this.aClass381_4243.anInt3963 << 28 | this.aClass381_4243.gameSceneBaseY << 14 | this.aClass381_4243.gameSceneBaseX));
			if (var2 == null) {
				return null;
			}
			Class381 var3 = client.aClass304_9030.method3022(-114433940);
			int var4 = this.aClass381_4243.gameSceneBaseX - var3.gameSceneBaseX;
			int var5 = this.aClass381_4243.gameSceneBaseY - var3.gameSceneBaseY;
			if (var4 >= 0 && var5 >= 0 && var4 < client.aClass304_9030.method2990(-756605541) && var5 < client.aClass304_9030.method3033((byte) -98)) {
				for (Class330_Sub3 var6 = (Class330_Sub3) var2.aClass471_7573.method5869(539664854); var6 != null; var6 = (Class330_Sub3) var2.aClass471_7573.method5873((byte) -89)) {
					if (var6.anInt7513 == this.anInt4244) {
						return (Class432_Sub1_Sub2_Sub1) client.aClass304_9030.method3023(-400722441).method4178(this.aClass381_4243.anInt3963, var4, var5, -140754170);
					}
				}
			}
			return null;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "rb.r(" + ')');
		}
	}

	public static final void method5220(Class430 arg0, byte arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub10_7873.method5772(355910202);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "rb.amk(" + ')');
		}
	}

	public static final void method5221(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			arg0.anInt1271 = arg2.anIntArray4387[--arg2.anInt4376];
			Class404.method4738(arg0, 1523447317);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "rb.gn(" + ')');
		}
	}

	public static final void method5222(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class95_Sub17.anInt7193;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "rb.aog(" + ')');
		}
	}

	public static Class227[] method5223(byte arg0) {
		try {
			return new Class227[] { Class227.aClass227_2418, Class227.aClass227_2411, Class227.aClass227_2414, Class227.aClass227_2417, Class227.aClass227_2421, Class227.aClass227_2416, Class227.aClass227_2413, Class227.aClass227_2412, Class227.aClass227_2420, Class227.aClass227_2419, Class227.aClass227_2415 };
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "rb.r(" + ')');
		}
	}
}
