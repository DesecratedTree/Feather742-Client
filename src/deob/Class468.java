package deob;

public class Class468 implements Interface26 {

	public static Class468 aClass468_6861 = new Class468(-2);

	public static Class468 aClass468_6857 = new Class468(-3);

	public static Class468 aClass468_6858 = new Class468(2);

	public static Class468 aClass468_6856 = new Class468(3);

	public static Class468 aClass468_6860 = new Class468(21);

	public static Class468 aClass468_6862 = new Class468(20);

	public int anInt6859;

	public Class468(int arg0) {
		this.anInt6859 = arg0;
	}

	public int method297(short arg0) {
		try {
			return this.anInt6859;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tk.j(" + ')');
		}
	}

	public int method300() {
		return this.anInt6859 * -251514439 * -575634295;
	}

	public int method299() {
		return this.anInt6859 * -251514439 * -575634295;
	}

	public int method298() {
		return this.anInt6859 * -251514439 * -575634295;
	}

	public int method301() {
		return this.anInt6859 * -251514439 * -575634295;
	}

	public static final void method5860(Class430 arg0, byte arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.aBoolean9083 && !client.aBoolean9228 ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tk.aoz(" + ')');
		}
	}

	public static final void method5861(Class430 arg0, int arg1) {
	}

	public static final void method5862(boolean arg0, int arg1) {
		try {
			Class330_Sub46_Sub2 var2 = client.aClass1_9025.aClass330_Sub46_Sub2_17;
			while (true) {
				if (var2.method3827(client.aClass1_9025.anInt26, -559716322) < 15) {
					if (arg1 != 791376098) {
						return;
					}
					break;
				}
				int var3 = var2.readBits(15);
				if (var3 == 32767) {
					if (arg1 != 791376098) {
						return;
					}
					break;
				}
				boolean var4 = false;
				Class330_Sub35 var5 = (Class330_Sub35) client.aClass497_9014.method6094((long) var3);
				NPC var6;
				if (var5 == null) {
					var6 = new NPC(client.aClass304_9030.method3023(-400722441));
					var6.anInt10008 = var3;
					var5 = new Class330_Sub35(var6);
					client.aClass497_9014.method6097(var5, (long) var3);
					client.aClass330_Sub35Array9015[++client.anInt9232 - 1] = var5;
					var4 = true;
				}
				var6 = (NPC) var5.anObject7733;
				client.anIntArray9018[++client.anInt9017 - 1] = var3;
				var6.anInt10069 = client.anInt8996;
				if (var6.aClass551_10251 != null && var6.aClass551_10251.method6372((byte) -12)) {
					Class324.method3202(var6, 1031641468);
				}
				int var7 = var2.readBits(1);
				int var8 = var2.readBits(3) + 4 << 11 & 0x3FFF;
				int var9 = var2.readBits(2);
				int var10;
				if (arg0) {
					var10 = var2.readBits(8);
					if (var10 > 127) {
						var10 -= 256;
					}
				} else {
					var10 = var2.readBits(5);
					if (var10 > 15) {
						var10 -= 32;
					}
				}
				var6.method5475(Class158_Sub3.aClass553_8875.method6392(var2.readBits(15), -463617992), 1918950667);
				int var11 = var2.readBits(1);
				if (var11 == 1) {
					client.anIntArray9020[++client.anInt9019 - 1] = var3;
				}
				int var12;
				if (arg0) {
					var12 = var2.readBits(8);
					if (var12 > 127) {
						var12 -= 256;
					}
				} else {
					var12 = var2.readBits(5);
					if (var12 > 15) {
						var12 -= 32;
					}
				}
				var6.method5420(var6.aClass551_10251.anInt6295, (short) -1191);
				var6.anInt10051 = var6.aClass551_10251.anInt6325 << 3;
				if (var4) {
					var6.method5411(var8, true, 735631152);
				}
				var6.method5478(var9, Class263_Sub2.myPlayer.anIntArray10018[0] + var12, Class263_Sub2.myPlayer.anIntArray10059[0] + var10, var7 == 1, var6.method5453(-2068687708), -1737258822);
				if (var6.aClass551_10251.method6372((byte) -23)) {
					Class_ra.method4809(var6.aByte8658, var6.anIntArray10018[0], var6.anIntArray10059[0], 0, null, var6, null, 682839506);
				}
			}
			var2.method3824(233374033);
		} catch (RuntimeException var13) {
			throw Class476.method5964(var13, "tk.kb(" + ')');
		}
	}
}
