package deob;

public class Class291_Sub1 extends Class291 implements Runnable {

	public void run() {
		try {
			this.aBoolean2976 = true;
			try {
				try {
					while (!this.aBoolean2975) {
						for (int var1 = 0; var1 < 2; var1++) {
							Class296 var2 = this.aClass296Array2977[var1];
							if (var2 != null) {
								var2.method2932();
							}
						}
						Class464_Sub21.method5813(10L);
						Class285.method2862(null, -2126639242);
					}
				} catch (Exception var3) {
					Class207.method2195(null, var3, -306254718);
					this.aBoolean2976 = false;
					return;
				}
				this.aBoolean2976 = false;
			} catch (RuntimeException var4) {
				this.aBoolean2976 = false;
				throw var4;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "xi.run(" + ')');
		}
	}

	public static final void method2907(int arg0) {
		try {
			if (Class226.method2307(client.anInt8995, (byte) 49) || Class522.method6230(client.anInt8995, 283322534)) {
				Class330_Sub31.logout(false, 1312762687);
			} else {
				Class274.aClass357_2852 = client.aClass1_9025.method380(-511214244);
				client.aClass1_9025.method377(-1665250286);
				Class227.method2311(9, -1188873169);
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "xi.gs(" + ')');
		}
	}

	public static Class366 method2908(int arg0, int arg1, int arg2, int arg3, Class476 arg4, int arg5, int arg6) {
		try {
			Class363.aClass366_Sub2_3805.anInt3854 = arg0;
			Class363.aClass366_Sub2_3805.anInt3853 = arg1;
			Class363.aClass366_Sub2_3805.anInt3852 = arg2;
			Class363.aClass366_Sub2_3805.anInt3855 = arg3;
			Class363.aClass366_Sub2_3805.aClass476_8004 = arg4;
			Class363.aClass366_Sub2_3805.anInt8003 = arg5;
			return Class363.aClass366_Sub2_3805;
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "xi.s(" + ')');
		}
	}
}
