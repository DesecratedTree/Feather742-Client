package deob;

public abstract class Class330_Sub12 extends Class330 {

	public static void method3302(ClientScript arg0, int arg1, Class430 arg2, int arg3) {
		try {
			arg2.anInt4376 = 0;
			arg2.anInt4378 = 0;
			arg2.anInt4397 = -1;
			arg2.aClass330_Sub36_Sub8_4393 = arg0;
			arg2.aClass445Array4383 = arg2.aClass330_Sub36_Sub8_4393.aClass445Array9670;
			arg2.anIntArray4394 = arg2.aClass330_Sub36_Sub8_4393.anIntArray9673;
			Class445 var4 = null;
			arg2.anInt4371 = 0;
			try {
				try {
					Class428.anInt4353 = 0;
					while (true) {
						Class428.anInt4353++;
						if (Class428.anInt4353 > arg1) {
							throw new RuntimeException("");
						}
						var4 = arg2.aClass445Array4383[++arg2.anInt4397];
						if (Class428.aBoolean4357 && (Class428.aString4358 == null || arg2.aClass330_Sub36_Sub8_4393.aString9681 != null && arg2.aClass330_Sub36_Sub8_4393.aString9681.indexOf(Class428.aString4358) != -1)) {
							System.out.println(arg2.aClass330_Sub36_Sub8_4393.aString9681 + ": " + var4);
						}
						if (arg2.anIntArray4394[arg2.anInt4397] == 1) {
							arg2.aBoolean4398 = true;
						} else {
							arg2.aBoolean4398 = false;
						}
						if (var4 == Class445.aClass445_5406 && arg2.anInt4371 == 0) {
							Class316.method3147((byte) -49);
							break;
						}
						OutgoingPacketManager.method3099(var4, arg2, 2117696086);
					}
				} catch (Exception var8) {
					StringBuilder var6 = new StringBuilder(30);
					var6.append("").append(arg2.aClass330_Sub36_Sub8_4393.aLong3341).append(" ");
					for (int var7 = arg2.anInt4371 - 1; var7 >= 0; var7--) {
						var6.append("").append(arg2.aClass433Array4382[var7].aClass330_Sub36_Sub8_4413.aLong3341).append(" ");
					}
					var6.append("").append(var4.anInt5543);
					Class207.method2195(var6.toString(), var8, -306254718);
					Class316.method3147((byte) -65);
				}
			} catch (RuntimeException var9) {
				Class316.method3147((byte) 41);
				throw var9;
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "acr.k(" + ')');
		}
	}

	public static final void method3303(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anInt4378 -= 2;
			String var3 = (String) arg0.anObjectArray4386[arg0.anInt4378];
			String var4 = (String) arg0.anObjectArray4386[arg0.anInt4378 + 1];
			if (var3.length() <= 500 && var4.length() <= 500) {
				Class325.method3208(var2, var3, var4, -1274842118);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "acr.arq(" + ')');
		}
	}

	public abstract void method3293(Class154 arg0, int arg1);

	public abstract void method3294(Buffer arg0, byte arg1);

	public abstract void method3295(Class154 arg0);

	public abstract void method3296(Buffer arg0);

	public abstract void method3297(Buffer arg0);

	public abstract void method3298(Class154 arg0);

	public abstract void method3299(Buffer arg0);

	public abstract void method3300(Class154 arg0);

	public abstract void method3301(Buffer arg0);
}
