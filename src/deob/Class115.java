package deob;

public class Class115 {

	public byte[] aByteArray1364;

	public int anInt1363;

	public int method1413(int arg0) {
		try {
			short var2 = 0;
			for (int var3 = 0; var3 < 2; var3++) {
				var2 = (short) (var2 | (this.aByteArray1364[++this.anInt1363 - 1] & 0xFF) << var3 * 8);
			}
			return var2;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "eq.r(" + ')');
		}
	}

	public Class115(byte[] arg0) {
		this.aByteArray1364 = arg0;
		this.anInt1363 = 0;
	}

	public String method1414(int arg0) {
		try {
			int var2 = this.method1413(-976535413);
			if (var2 == -1) {
				return null;
			} else if (var2 > 256) {
				throw new RuntimeException_Sub3();
			} else {
				String var3 = new String(this.aByteArray1364, this.anInt1363, var2);
				this.anInt1363 += var2;
				return var3;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "eq.j(" + ')');
		}
	}

	public static Class316 method1415(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
		try {
			if (Class448.aClass330_Sub50_5555.aClass464_Sub30_7894.method5841(-2146155267) == 0 || arg1 == 0 || Class333.anInt3360 >= 50 || arg0 == -1) {
				return null;
			} else {
				Class316 var6 = new Class316((byte) 1, arg0, arg1, arg2, arg3, 0, arg4, null);
				Class333.aClass316Array3347[++Class333.anInt3360 - 1] = var6;
				return var6;
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "eq.b(" + ')');
		}
	}
}
