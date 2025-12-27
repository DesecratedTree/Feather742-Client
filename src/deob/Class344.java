package deob;

public class Class344 implements Interface26 {

	public static Class344 aClass344_6813 = new Class344(0);

	public static Class344 aClass344_6811 = new Class344(1);

	public int anInt6812;

	public static int anInt6814;

	public int method299() {
		return this.anInt6812 * -1815606911 * -80595327;
	}

	public Class344(int arg0) {
		this.anInt6812 = arg0;
	}

	public int method297(short arg0) {
		try {
			return this.anInt6812;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "oi.j(" + ')');
		}
	}

	public int method298() {
		return this.anInt6812 * -1815606911 * -80595327;
	}

	public int method300() {
		return this.anInt6812 * -1815606911 * -80595327;
	}

	public int method301() {
		return this.anInt6812 * -1815606911 * -80595327;
	}

	public static final void method4002(Class430 arg0, int arg1) {
		try {
			arg0.anInt4378 -= 2;
			String var2 = (String) arg0.anObjectArray4386[arg0.anInt4378];
			String var3 = (String) arg0.anObjectArray4386[arg0.anInt4378 + 1];
			if (Class263_Sub2.myPlayer.aClass408_10240 != null && Class263_Sub2.myPlayer.aClass408_10240.aBoolean4213) {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var3;
			} else {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var2;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "oi.aaf(" + ')');
		}
	}

	public static final void method4003(int arg0) {
		try {
			if (client.aFloat9250 < 1034.0F) {
				client.aFloat9250 = 1034.0F;
			}
			if (client.aFloat9250 > 2839.0F) {
				client.aFloat9250 = 2839.0F;
			}
			while (client.aFloat9141 >= 16384.0F) {
				client.aFloat9141 -= 16384.0F;
			}
			while (client.aFloat9141 < 0.0F) {
				client.aFloat9141 += 16384.0F;
			}
			Class281 var1 = client.aClass304_9030.method2995(1812381571);
			Class356 var2 = client.aClass304_9030.method3023(-400722441);
			int var3 = IndexTable.anInt2906 >> 9;
			int var4 = Class308.anInt3194 >> 9;
			int var5 = Class431.method5342(IndexTable.anInt2906, Class308.anInt3194, Class85.anInt712, 1996761881);
			int var6 = 0;
			int var7;
			if (var3 > 3 && var4 > 3 && var3 < client.aClass304_9030.method2990(-877386405) - 4 && var4 < client.aClass304_9030.method3033((byte) -103) - 4) {
				for (var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = Class85.anInt712;
						if (var9 < 3 && var1.method2788(var7, var8, (byte) -26)) {
							var9++;
						}
						int var10 = 0;
						byte[][] var11 = client.aClass304_9030.method2994(var9, 1087692644);
						if (var11 != null) {
							var10 = (var11[var7][var8] & 0xFF) * 8 << 2;
						}
						if (var2.aClass_xaArray3676 != null && var2.aClass_xaArray3676[var9] != null) {
							int var12 = var5 - (var2.aClass_xaArray3676[var9].method6417(var7, var8, -627582710) - var10);
							if (var12 > var6) {
								var6 = var12;
							}
						}
					}
				}
			}
			var7 = (var6 >> 2) * 1536;
			if (var7 > 786432) {
				var7 = 786432;
			}
			if (var7 < 262144) {
				var7 = 262144;
			}
			if (var7 > client.anInt9272) {
				client.anInt9272 += (var7 - client.anInt9272) / 24;
			} else if (var7 < client.anInt9272) {
				client.anInt9272 += (var7 - client.anInt9272) / 80;
			}
		} catch (RuntimeException var13) {
			throw Class476.method5964(var13, "oi.hr(" + ')');
		}
	}
}
