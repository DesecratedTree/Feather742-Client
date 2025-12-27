package deob;

public class Class325 {

	public Class325 aClass325_3314;

	public Class325 aClass325_3315;

	public void method3204(int arg0) {
		try {
			if (this.aClass325_3315 != null) {
				this.aClass325_3315.aClass325_3314 = this.aClass325_3314;
				this.aClass325_3314.aClass325_3315 = this.aClass325_3315;
				this.aClass325_3314 = null;
				this.aClass325_3315 = null;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nn.r(" + ')');
		}
	}

	public static void method3205(Class430 arg0, byte arg1) {
		try {
			arg0.anIntArray4387[arg0.anInt4376 - 1] = Class131.aClass407_1502.method4752(arg0.anIntArray4387[arg0.anInt4376 - 1], -1495153743).anInt4088;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nn.i(" + ')');
		}
	}

	public static final void method3206(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = arg0.anIntArray4388[arg0.anIntArray4394[arg0.anInt4397]];
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nn.an(" + ')');
		}
	}

	public static final void method3207(Class430 arg0, int arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			Class330_Sub34 var3 = Class238.method2377(OutgoingPacket.ENTER_NAME_PACKET, client.aClass1_9025.aClass488_22, -113546669);
			var3.aClass330_Sub46_Sub2_7729.addByte(var2.length() + 1, (byte) 117);
			var3.aClass330_Sub46_Sub2_7729.addString(var2, (byte) -68);
			client.aClass1_9025.method378(var3, -333960194);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "nn.ss(" + ')');
		}
	}

	public static void method3208(int arg0, String arg1, String arg2, int arg3) {
		try {
			if (client.aClass1_9025 != null) {
				Class330_Sub34 var4 = Class238.method2377(OutgoingPacket.aClass234_2565, client.aClass1_9025.aClass488_22, 933136751);
				var4.aClass330_Sub46_Sub2_7729.addShort(Class158_Sub3.method1856(arg1, -1844058675) + 1 + Class158_Sub3.method1856(arg2, -1844058675), (byte) 90);
				var4.aClass330_Sub46_Sub2_7729.addByte(arg0, (byte) 23);
				var4.aClass330_Sub46_Sub2_7729.method3794(arg2, -437351536);
				var4.aClass330_Sub46_Sub2_7729.method3794(arg1, -733313873);
				client.aClass1_9025.method378(var4, -386502775);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "nn.aru(" + ')');
		}
	}

	public static Class401_Sub1 method3209(int arg0) {
		try {
			Class507.anInt5936 = 0;
			return Class426.method5318(-344813259);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "nn.s(" + ')');
		}
	}

	public static final void method3210(Class430 arg0, short arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.aBoolean9198 ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nn.agx(" + ')');
		}
	}

	public static final void method3211(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			arg0.aClass209_4385.anIntArray1983[var2] = var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "nn.adl(" + ')');
		}
	}

	public static void method3212(int arg0) {
		try {
			if (Class332.anInt6637 > 1) {
				Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub26_7901, 4, 108878142);
			} else {
				Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub26_7901, 2, -735371252);
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "nn.b(" + ')');
		}
	}
}
