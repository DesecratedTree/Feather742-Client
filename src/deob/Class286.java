package deob;

public class Class286 {

	public byte aByte2949;

	public int anInt2947;

	public int anInt2945;

	public int anInt2948;

	public int anInt2946;

	public int anInt2950;

	public Class286(Buffer arg0) {
		this.aByte2949 = arg0.readByte((byte) -73);
		this.anInt2947 = arg0.readUnsignedShort(1407017287);
		this.anInt2945 = arg0.readInt((byte) 96);
		this.anInt2948 = arg0.readInt((byte) 32);
		this.anInt2946 = arg0.readInt((byte) 17);
		this.anInt2950 = arg0.readInt((byte) 121);
	}

	public int method2868(int arg0) {
		try {
			return this.aByte2949 & 0x7;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "lx.r(" + ')');
		}
	}

	public int method2869(int arg0) {
		try {
			return (this.aByte2949 & 0x8) == 8 ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "lx.j(" + ')');
		}
	}

	public Class286() {
	}

	public static final void method2870(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4394[arg0.anInt4397];
			Class535 var3 = Class95_Sub7.aClass536_7157.method6315(var2, 1600259515);
			if (var3.aChar6227 != 1) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			}
			Integer var4 = (Integer) Class332.anObjectArray6640[var3.anInt6226];
			if (var4 == null) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			} else {
				int var5 = var3.anInt6225 == 31 ? -1 : (0x1 << var3.anInt6225 + 1) - 1;
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = (var4 & var5) >>> var3.anInt6228;
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "lx.bx(" + ')');
		}
	}

	public static final void method2871(Class430 arg0, byte arg1) {
		try {
			int var2 = client.aClass497_9284.method6096(1428254711);
			if (client.windowPaneId != -1) {
				var2++;
			}
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "lx.anf(" + ')');
		}
	}

	public static int method2872(int arg0, int arg1) {
		try {
			if (arg0 == 0) {
				return 128;
			} else if (arg0 == 1) {
				return 64;
			} else if (arg0 == 2) {
				return 256;
			} else if (arg0 == 3) {
				return 512;
			} else {
				throw new IllegalArgumentException();
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "lx.r(" + ')');
		}
	}

	public static final void method2873(int arg0) {
		try {
			Class379.aClass114Array3952 = null;
			Class330_Sub38.method3541(client.windowPaneId, 0, 0, Class300.anInt3058, Class146.anInt1615, 0, 0, -1, (byte) 3);
			if (Class379.aClass114Array3952 != null) {
				Class556.method6408(Class379.aClass114Array3952, -1412584499, 0, 0, Class300.anInt3058, Class146.anInt1615, Class430.anInt4399, Class550.anInt6289, IsaacCipher.aClass114_5838 == client.aClass114_9242 ? -1 : client.aClass114_9242.anInt1358, true, -809270634);
				Class379.aClass114Array3952 = null;
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "lx.kn(" + ')');
		}
	}

	public static final void method2874(Class430 arg0, byte arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class360.anInt3760;
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class360.anInt3785;
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class360.anInt3784;
			Class360.anInt3760 = -2;
			Class360.anInt3785 = -1;
			Class360.anInt3784 = -1;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "lx.ajz(" + ')');
		}
	}

	public static Class330_Sub36_Sub12 method2875(IndexTable arg0, int arg1, int arg2, byte arg3) {
		try {
			Buffer var4 = new Buffer(arg0.getFile(arg1, arg2));
			Class330_Sub36_Sub12 var5 = new Class330_Sub36_Sub12(arg2, var4.readString(-802929058), var4.readString(-215525662), var4.readInt((byte) 85), var4.readInt((byte) 117), var4.readUnsignedByte(1722253571) == 1, var4.readUnsignedByte(2049999455), var4.readUnsignedByte(520598759));
			int var6 = var4.readUnsignedByte(1270752187);
			for (int var7 = 0; var7 < var6; var7++) {
				var5.aClass471_9711.method5878(new Class330_Sub45(var4.readUnsignedByte(99693839), var4.readUnsignedShort(1821206440), var4.readUnsignedShort(1204294714), var4.readUnsignedShort(28180444), var4.readUnsignedShort(1656593943), var4.readUnsignedShort(239449846), var4.readUnsignedShort(507596865), var4.readUnsignedShort(221192694), var4.readUnsignedShort(379598483)), (short) 8192);
			}
			var5.method3483(-1539117435);
			return var5;
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "lx.s(" + ')');
		}
	}

	public static final String method2876(String arg0, String arg1, String arg2, int arg3) {
		try {
			for (int var4 = arg0.indexOf(arg1); var4 != -1; var4 = arg0.indexOf(arg1, var4 + arg2.length())) {
				arg0 = arg0.substring(0, var4) + arg2 + arg0.substring(var4 + arg1.length());
			}
			return arg0;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "lx.o(" + ')');
		}
	}
}
