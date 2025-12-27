package deob;

public class ClientScript extends Class330_Sub36 {

	public int anInt9671;

	public int anInt9672;

	public int anInt9676;

	public int anInt9677;

	public int anInt9678;

	public int anInt9680;

	public Class545 aClass545_9679;

	public String aString9681;

	public int[] anIntArray9673;

	public long[] aLongArray9675;

	public Class445[] aClass445Array9670;

	public Class497[] aClass497Array9682;

	public Object[] anObjectArray9674;

	public Class445 method3472(Buffer arg0, Class445[] arg1, int arg2) {
		try {
			int var4 = arg0.readUnsignedShort(822296001);
			if (var4 < 0 || var4 >= arg1.length) {
				throw new RuntimeException("");
			}
			return arg1[var4];
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ajg.r(" + ')');
		}
	}

	public int method3473(Buffer arg0, int arg1) {
		try {
			arg0.offset = arg0.payload.length - 2;
			int var3 = arg0.readUnsignedShort(992975005);
			int var4 = arg0.payload.length - 2 - var3 - 16;
			arg0.offset = var4;
			int var5 = arg0.readInt((byte) 35);
			this.anInt9676 = arg0.readUnsignedShort(790112023);
			this.anInt9672 = arg0.readUnsignedShort(710005760);
			this.anInt9671 = arg0.readUnsignedShort(679445045);
			this.anInt9678 = arg0.readUnsignedShort(249909246);
			this.anInt9680 = arg0.readUnsignedShort(625984341);
			this.anInt9677 = arg0.readUnsignedShort(-347350395);
			int var6 = arg0.readUnsignedByte(1009079752);
			if (var6 > 0) {
				this.aClass497Array9682 = new Class497[var6];
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = arg0.readUnsignedShort(-275180063);
					Class497 var9 = new Class497(Class136.method1594(var8, 1549187435));
					this.aClass497Array9682[var7] = var9;
					while (var8-- > 0) {
						int var10 = arg0.readInt((byte) 103);
						int var11 = arg0.readInt((byte) 100);
						var9.method6097(new Class330_Sub23(var11), (long) var10);
					}
				}
			}
			arg0.offset = 0;
			this.aString9681 = arg0.method3761(1849010562);
			this.aClass445Array9670 = new Class445[var5];
			return var4;
		} catch (RuntimeException var12) {
			throw Class476.method5964(var12, "ajg.j(" + ')');
		}
	}

	public void method3474(Buffer arg0, int arg1, Class445 arg2, int arg3) {
		try {
			int var5 = this.aClass445Array9670.length;
			if (arg2 == Class445.aClass445_4559) {
				if (this.anObjectArray9674 == null) {
					this.anObjectArray9674 = new String[var5];
				}
				String var6 = arg0.readString(1105217997);
				this.anObjectArray9674[arg1] = var6.intern();
			} else if (arg2 == Class445.aClass445_4531) {
				if (this.aLongArray9675 == null) {
					this.aLongArray9675 = new long[var5];
				}
				this.aLongArray9675[arg1] = arg0.readLong(-877579005);
			} else {
				if (this.anIntArray9673 == null) {
					this.anIntArray9673 = new int[var5];
				}
				if (arg2.aBoolean5544) {
					this.anIntArray9673[arg1] = arg0.readInt((byte) 73);
				} else {
					this.anIntArray9673[arg1] = arg0.readUnsignedByte(502594360);
				}
			}
			this.aClass445Array9670[arg1] = arg2;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ajg.i(" + ')');
		}
	}

	public ClientScript(Buffer arg0) {
		int var2 = this.method3473(arg0, 168562736);
		int var3 = 0;
		Class445[] var4 = Class111_Sub1.method1370(-2135202728);
		while (arg0.offset < var2) {
			Class445 var5 = this.method3472(arg0, var4, 186278129);
			this.method3474(arg0, var3, var5, -2057980928);
			var3++;
		}
	}
}
