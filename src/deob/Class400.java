package deob;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class Class400 {

	public Class367 aClass367_4124 = new Class367(64);

	public IndexTable aClass280_4125;

	public static IndexTable clientVarpBitDefinitions;

	public Class400(Class435 arg0, Class454 arg1, IndexTable arg2) {
		this.aClass280_4125 = arg2;
		if (this.aClass280_4125 != null) {
			this.aClass280_4125.method2763(Class103.aClass103_977.anInt982, -2048999840);
		}
	}

	public void method4698(byte arg0) {
		try {
			Class367 var2 = this.aClass367_4124;
			synchronized (this.aClass367_4124) {
				this.aClass367_4124.method4298((byte) 31);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qn.j(" + ')');
		}
	}

	public void method4699(int arg0) {
		try {
			Class367 var2 = this.aClass367_4124;
			synchronized (this.aClass367_4124) {
				this.aClass367_4124.method4296(-370493554);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qn.p(" + ')');
		}
	}

	public Class402 method4700(int arg0, int arg1) {
		try {
			Class367 var4 = this.aClass367_4124;
			Class402 var3;
			synchronized (this.aClass367_4124) {
				var3 = (Class402) this.aClass367_4124.get((long) arg0);
			}
			if (var3 != null) {
				return var3;
			}
			IndexTable var5 = this.aClass280_4125;
			byte[] var13;
			synchronized (this.aClass280_4125) {
				var13 = this.aClass280_4125.getFile(Class103.aClass103_977.anInt982, arg0);
			}
			var3 = new Class402();
			if (var13 != null) {
				var3.method4724(new Buffer(var13), -1390213322);
			}
			Class367 var12 = this.aClass367_4124;
			synchronized (this.aClass367_4124) {
				this.aClass367_4124.put(var3, (long) arg0);
			}
			return var3;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "qn.r(" + ')');
		}
	}

	public void method4701(int arg0, int arg1) {
		try {
			Class367 var3 = this.aClass367_4124;
			synchronized (this.aClass367_4124) {
				this.aClass367_4124.method4292(arg0, (byte) 121);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "qn.i(" + ')');
		}
	}

	public static final void method4702(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1211;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qn.pq(" + ')');
		}
	}

	public static final void method4703(Class430 arg0, byte arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			boolean var3 = arg0.anIntArray4387[arg0.anInt4376 + 1] == 1;
			if (Class354_Sub1.aClass497_7991 != null) {
				Class330 var4 = Class354_Sub1.aClass497_7991.method6094((long) var2);
				if (var4 != null && !var3) {
					var4.method3252(-10324747);
				} else if (var4 == null && var3) {
					var4 = new Class330();
					Class354_Sub1.aClass497_7991.method6097(var4, (long) var2);
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qn.aey(" + ')');
		}
	}

	public static void method4704(int arg0, byte arg1) {
		try {
			Class110.anInt1152 = 1;
			Class110.aClass280_1161 = null;
			Class110.musicId = -1;
			Class369.anInt6819 = -1;
			Class288.aClass330_Sub40_Sub2_2955 = null;
			Class121.volume = 0;
			Class268.aBoolean2746 = false;
			Class457.anInt6843 = arg0;
			Class403.aClass111_4138 = null;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qn.l(" + ')');
		}
	}

	public static final void method4705(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -2111697421);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1222;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qn.rp(" + ')');
		}
	}

	public static final void method4706(Class430 arg0, byte arg1) {
		try {
			Class432_Sub1_Sub4_Sub1.method5540(arg0, -1157517901);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qn.sq(" + ')');
		}
	}

	public static byte[] method4707(Object arg0, boolean arg1, int arg2) {
		try {
			if (arg0 == null) {
				return null;
			} else if (arg0 instanceof byte[]) {
				byte[] var6 = (byte[]) arg0;
				return arg1 ? Arrays.copyOf(var6, var6.length) : var6;
			} else if (arg0 instanceof ByteBuffer) {
				ByteBuffer var3 = (ByteBuffer) arg0;
				byte[] var4 = new byte[var3.capacity()];
				var3.position(0);
				var3.get(var4);
				return var4;
			} else {
				throw new IllegalArgumentException();
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qn.j(" + ')');
		}
	}

	public static void method4708(IComponentDefinitions arg0, int arg1, int arg2, int arg3) {
		try {
			if (arg0 != null) {
				if (arg0.anObjectArray1304 != null) {
					Class330_Sub42 var4 = new Class330_Sub42();
					var4.aClass114_7809 = arg0;
					var4.anObjectArray7817 = arg0.anObjectArray1304;
					Class117.method1423(var4, -1631194987);
				}
				client.aBoolean9150 = true;
				Class368.anInt3869 = arg0.anInt1196;
				client.anInt9151 = arg0.anInt1287;
				Class503.anInt5916 = arg1;
				OutgoingPacket.anInt2579 = arg2;
				client.anInt9104 = arg0.anInt1335;
				Class271.anInt2756 = arg0.anInt1216;
				client.anInt9147 = arg0.anInt1217;
				Class404.method4738(arg0, 2005050657);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qn.ku(" + ')');
		}
	}
}
