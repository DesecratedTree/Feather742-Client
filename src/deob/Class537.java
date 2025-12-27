package deob;

public class Class537 {

	public boolean aBoolean6237 = true;

	public char aChar6234;

	public int anInt6235;

	public static int anInt6238;

	public String aString6236;

	public void method6320(Buffer arg0, byte arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(1015577442);
				if (var3 == 0) {
					if (arg1 != 1) {
					}
					return;
				}
				this.method6322(arg0, var3, (byte) -69);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "wg.r(" + ')');
		}
	}

	public boolean method6321(byte arg0) {
		try {
			return this.aChar6234 == 's';
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "wg.i(" + ')');
		}
	}

	public void method6322(Buffer arg0, int arg1, byte arg2) {
		try {
			if (arg1 == 1) {
				this.aChar6234 = Class127.method1546(arg0.readByte((byte) -63), -2019015116);
			} else if (arg1 == 2) {
				this.anInt6235 = arg0.readInt((byte) 121);
			} else if (arg1 == 4) {
				this.aBoolean6237 = false;
			} else if (arg1 == 5) {
				this.aString6236 = arg0.readString(-793671361);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "wg.j(" + ')');
		}
	}

	public static final void method6323(Class330_Sub46_Sub2 arg0, int arg1, int arg2) {
		try {
			Class15.anInt197 = 0;
			Class383.method4414(arg0, 1315716352);
			Class76_Sub2.method912(arg0, (byte) 13);
			if (arg1 == arg0.offset) {
				;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "wg.j(" + ')');
		}
	}
}
