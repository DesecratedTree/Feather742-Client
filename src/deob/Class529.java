package deob;

public class Class529 {

	public int anInt6218;

	public int anInt6219;

	public int anInt6221;

	public Class527 aClass527_6220;

	public void method6273(Buffer arg0, int arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(1399514942);
				if (var3 == 0) {
					if (arg1 != 609806336) {
					}
					return;
				}
				this.method6274(arg0, var3, (short) 17671);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "vx.r(" + ')');
		}
	}

	public void method6274(Buffer arg0, int arg1, short arg2) {
		try {
			if (arg1 == 1) {
				this.anInt6218 = arg0.readBigSmart(-1784916531);
			} else if (arg1 == 2) {
				this.anInt6219 = arg0.readUnsignedByte(387303657);
				this.anInt6221 = arg0.readUnsignedByte(892673228);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "vx.j(" + ')');
		}
	}

	public synchronized Class87 method6275(int arg0) {
		try {
			Class87 var2 = (Class87) this.aClass527_6220.aClass367_6212.get((long) this.anInt6218);
			if (var2 != null) {
				return var2;
			}
			var2 = Class53.method643(this.aClass527_6220.aClass280_6209, this.anInt6218, 0);
			if (var2 != null) {
				this.aClass527_6220.aClass367_6212.put(var2, (long) this.anInt6218);
			}
			return var2;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "vx.i(" + ')');
		}
	}

	public static boolean method6276(int arg0, byte arg1) {
		try {
			return arg0 == 11 || arg0 == 7;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "vx.fs(" + ')');
		}
	}
}
