package deob;

public class Class334 {

	public Class334() throws Throwable {
		throw new Error();
	}

	public static final void method3931(Class430 arg0, byte arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub15_7902.method5792(981226512);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nx.ame(" + ')');
		}
	}

	public static final void method3932(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			if (Class361.aClass_ra3793.ac()) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub9_7899.method5716(var2, -1761361320);
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 3;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nx.aqs(" + ')');
		}
	}

	public static final void method3933(byte arg0) {
		try {
			for (int var1 = 0; var1 < client.anInt9017; var1++) {
				int var2 = client.anIntArray9018[var1];
				Class330_Sub35 var3 = (Class330_Sub35) client.aClass497_9014.method6094((long) var2);
				if (var3 != null) {
					NPC var4 = (NPC) var3.anObject7733;
					Class520.method6223(var4, false, 1801294468);
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "nx.hb(" + ')');
		}
	}

	public static final void method3934(int arg0, byte arg1) {
		try {
			method3935((short) -12406);
			int var2 = Class366_Sub4.aClass231_8007.method2346(arg0, -1999941769).anInt6672;
			if (var2 != 0) {
				int var3 = Class158.aClass561_6474.anIntArray6980[arg0];
				if (var2 == 5) {
					client.anInt9145 = var3;
				}
				if (var2 == 6) {
					client.anInt9011 = var3;
				}
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "nx.la(" + ')');
		}
	}

	public static void method3935(short arg0) {
		try {
			Class330_Sub20 var1;
			for (var1 = (Class330_Sub20) Class330_Sub20.aClass471_7649.method5869(539664854); var1 != null; var1 = (Class330_Sub20) Class330_Sub20.aClass471_7649.method5873((byte) -9)) {
				if (var1.aBoolean7653) {
					var1.method3373((byte) -58);
				}
			}
			for (var1 = (Class330_Sub20) Class330_Sub20.aClass471_7650.method5869(539664854); var1 != null; var1 = (Class330_Sub20) Class330_Sub20.aClass471_7650.method5873((byte) -15)) {
				if (var1.aBoolean7653) {
					var1.method3373((byte) -43);
				}
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "nx.j(" + ')');
		}
	}

	public static final void method3936(Class430 arg0, int arg1) {
		try {
			arg0.anInt4378 -= 2;
			arg0.anInt4376 -= 2;
			String var2 = (String) arg0.anObjectArray4386[arg0.anInt4378];
			int var3 = arg0.anIntArray4387[arg0.anInt4376];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			String var5 = (String) arg0.anObjectArray4386[arg0.anInt4378 + 1];
			Class339.method3967(var2, var3 == 1, var4, var5, (byte) 3);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class440.anInt4482;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "nx.abr(" + ')');
		}
	}

	public static int method3937(Class330_Sub46_Sub2 arg0, int arg1) {
		try {
			int var2 = arg0.readBits(2);
			int var3;
			if (var2 == 0) {
				var3 = 0;
			} else if (var2 == 1) {
				var3 = arg0.readBits(5);
			} else if (var2 == 2) {
				var3 = arg0.readBits(8);
			} else {
				var3 = arg0.readBits(11);
			}
			return var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "nx.p(" + ')');
		}
	}
}
