package deob;

public class Class427 {

	public Class381 aClass381_4348;

	public int anInt4349;

	public int anInt4347;

	public static Preferences aClass294_4350;

	public Interface2 method5319(byte arg0) {
		try {
			int var2 = this.aClass381_4348.anInt3963;
			Class381 var3 = client.aClass304_9030.method3022(-355131208);
			int var4 = this.aClass381_4348.gameSceneBaseX - var3.gameSceneBaseX;
			int var5 = this.aClass381_4348.gameSceneBaseY - var3.gameSceneBaseY;
			if (var4 < 0 || var5 < 0 || var4 >= client.aClass304_9030.method2990(-1909689917) || var5 >= client.aClass304_9030.method3033((byte) -53)) {
				return null;
			}
			switch(this.method5321(-1627650745)) {
				case 0:
					return (Interface2) client.aClass304_9030.method3023(-400722441).method4154(var2, var4, var5, -2040838155);
				case 1:
					return (Interface2) client.aClass304_9030.method3023(-400722441).method4156(var2, var4, var5, -1679447298);
				case 2:
					return (Interface2) client.aClass304_9030.method3023(-400722441).method4158(var2, var4, var5, client.anInterface19_9266, (byte) 41);
				case 3:
					return (Interface2) client.aClass304_9030.method3023(-400722441).method4177(var2, var4, var5, 1315717432);
				default:
					return null;
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "rt.i(" + ')');
		}
	}

	public Interface2 method5320(byte arg0) {
		try {
			Interface2 var2 = this.method5319((byte) 3);
			if (var2 == null) {
				return null;
			} else if (var2.method34((short) -2203) == this.anInt4347) {
				return var2;
			} else {
				return null;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "rt.j(" + ')');
		}
	}

	public Class427(Class381 arg0, int arg1, int arg2, int arg3) {
		this.aClass381_4348 = arg0;
		this.anInt4349 = arg1;
		this.anInt4347 = arg3;
	}

	public int method5321(int arg0) {
		try {
			return client.anIntArray9036[this.anInt4349];
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "rt.r(" + ')');
		}
	}

	public static int method5322(int arg0, int arg1, int arg2, int arg3) {
		try {
			if (Class354_Sub1.anInt7977 < 100) {
				return -2;
			}
			int var4 = -2;
			int var5 = Integer.MAX_VALUE;
			int var6 = arg1 - Class354_Sub1.anInt3510;
			int var7 = arg2 - Class354_Sub1.anInt3516;
			for (Class330_Sub38 var8 = (Class330_Sub38) Class354_Sub1.aClass471_3509.method5869(539664854); var8 != null; var8 = (Class330_Sub38) Class354_Sub1.aClass471_3509.method5873((byte) -34)) {
				if (var8.anInt7755 == arg0) {
					int var9 = var8.anInt7756;
					int var10 = var8.anInt7753;
					int var11 = Class354_Sub1.anInt3510 + var9 << 14 | Class354_Sub1.anInt3516 + var10;
					int var12 = (var6 - var9) * (var6 - var9) + (var7 - var10) * (var7 - var10);
					if (var4 < 0 || var12 < var5) {
						var4 = var11;
						var5 = var12;
					}
				} else if (arg3 >= -708765691) {
					throw new IllegalStateException();
				}
			}
			return var4;
		} catch (RuntimeException var13) {
			throw Class476.method5964(var13, "rt.ca(" + ')');
		}
	}
}
