package deob;

public class Class514 {

	public int anInt5967 = 1;

	public static int anInt5968 = 1;

	public static int anInt5970 = 0;

	public char aChar5969;

	public void method6199(Buffer arg0, int arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(4497355);
				if (var3 == 0) {
					if (arg1 >= -1687185181) {
						throw new IllegalStateException();
					}
					return;
				}
				this.method6200(arg0, var3, (byte) 106);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "vg.r(" + ')');
		}
	}

	public void method6200(Buffer arg0, int arg1, byte arg2) {
		try {
			if (arg1 == 1) {
				this.aChar5969 = Class127.method1546(arg0.readByte((byte) -9), -2083396432);
			} else if (arg1 == 2) {
				this.anInt5967 = 0;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "vg.j(" + ')');
		}
	}

	public static final void method6201(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			Class472 var4 = Class354.method4082(var2 >> 14 & 0x3FFF, var2 & 0x3FFF);
			boolean var5 = false;
			for (Class330_Sub36_Sub12 var6 = (Class330_Sub36_Sub12) var4.method5884((byte) 112); var6 != null; var6 = (Class330_Sub36_Sub12) var4.method5886((short) 8192)) {
				if (var6.anInt9708 == var3) {
					var5 = true;
					break;
				}
			}
			if (var5) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 1;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "vg.aes(" + ')');
		}
	}

	public static final void method6202(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -291201542);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class304.method3035(var3, var4, arg0, (byte) -115);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "vg.ja(" + ')');
		}
	}
}
