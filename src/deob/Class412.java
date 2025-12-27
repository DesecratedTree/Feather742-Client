package deob;

import java.lang.management.GarbageCollectorMXBean;

public class Class412 {

	public int anInt4253;

	public int anInt4254;

	public static int anInt4256;

	public static Class154 aClass154_4258;

	public Class365 aClass365_4246;

	public Class365 aClass365_4250;

	public Class365 aClass365_4252;

	public Interface20 anInterface20_4247;

	public Interface20 anInterface20_4248;

	public Interface20 anInterface20_4249;

	public Interface20 anInterface20_4251;

	public static GarbageCollectorMXBean aGarbageCollectorMXBean4257;

	public boolean aBoolean4255;

	public void method5234(Buffer arg0, byte arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(-169445277);
				if (var3 == 0) {
					if (arg1 <= 9) {
						throw new IllegalStateException();
					}
					return;
				}
				if (var3 == 1) {
					this.anInterface20_4251 = Class297.method2965(arg0, (byte) -1);
				} else if (var3 == 2) {
					this.anInterface20_4249 = Class297.method2965(arg0, (byte) 50);
				} else if (var3 == 3) {
					this.anInterface20_4248 = Class297.method2965(arg0, (byte) -63);
				} else if (var3 == 4) {
					this.anInterface20_4247 = Class297.method2965(arg0, (byte) -45);
				} else if (var3 == 5) {
					this.aClass365_4250 = IsaacCipher.method6052(arg0, -1615091388);
				} else if (var3 == 6) {
					this.aClass365_4252 = IsaacCipher.method6052(arg0, -1630669571);
				} else if (var3 == 7) {
					this.aClass365_4246 = IsaacCipher.method6052(arg0, -1807956549);
				} else if (var3 == 8) {
					Class297.method2965(arg0, (byte) -48);
				} else if (var3 == 9) {
					Class297.method2965(arg0, (byte) -21);
				} else if (var3 == 10) {
					Class297.method2965(arg0, (byte) 3);
				} else if (var3 == 11) {
					this.aBoolean4255 = true;
				} else if (var3 == 12) {
					this.anInt4253 = arg0.readInt((byte) 83);
				} else if (var3 == 13) {
					this.anInt4254 = arg0.readInt((byte) 71);
				}
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "rd.r(" + ')');
		}
	}

	public Class412(IndexTable arg0) {
		byte[] var2 = arg0.method2761(Class420.aClass420_4305.anInt4307, 1972904746);
		this.method5234(new Buffer(var2), (byte) 113);
	}

	public static final void method5235(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			arg0.aBoolean1270 = arg2.anIntArray4387[--arg2.anInt4376] == 1;
			Class404.method4738(arg0, 1150942058);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "rd.eb(" + ')');
		}
	}

	public static final void method5236(Class430 arg0, int arg1) {
		try {
			Class112.method1379(961447076);
			Class484.aBoolean5807 = false;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "rd.afv(" + ')');
		}
	}

	public static int method5237(NPC arg0, int arg1) {
		try {
			Class551 var2 = arg0.aClass551_10251;
			if (var2.anIntArray6326 != null) {
				var2 = var2.method6371(Class158.aClass561_6474, (byte) 114);
				if (var2 == null) {
					return -1;
				}
			}
			int var3 = var2.anInt6341;
			Class364 var4 = arg0.method5436(1582279048);
			int var5 = arg0.aClass477_Sub3_10039.method5967((byte) -81);
			if (var5 == -1 || arg0.aClass477_Sub3_10039.aBoolean8752) {
				var3 = var2.anInt6339;
			} else if (var5 == var4.anInt3818 || var5 == var4.anInt3819 || var4.anInt3821 == var5 || var5 == var4.anInt3851) {
				var3 = var2.anInt6342;
			} else if (var5 == var4.anInt3822 || var4.anInt3823 == var5 || var4.anInt3825 == var5 || var4.anInt3824 == var5) {
				var3 = var2.anInt6355;
			}
			return var3;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "rd.w(" + ')');
		}
	}
}
