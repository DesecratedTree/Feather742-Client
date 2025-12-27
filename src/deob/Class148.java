package deob;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Class148 implements Runnable {

	public InetAddress anInetAddress1622;

	public volatile String aString1623;

	public String method1746(int arg0) {
		try {
			return this.aString1623;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "g.r(" + ')');
		}
	}

	public void run() {
		try {
			this.aString1623 = this.anInetAddress1622.getHostName();
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "g.run(" + ')');
		}
	}

	public Class148(int arg0) throws UnknownHostException {
		this.anInetAddress1622 = InetAddress.getByAddress(new byte[] { (byte) (arg0 >> 24 & 0xFF), (byte) (arg0 >> 16 & 0xFF), (byte) (arg0 >> 8 & 0xFF), (byte) (arg0 & 0xFF) });
	}

	public static final void method1747(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 2007105397);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class439.method5599(var3, var4, false, 0, arg0, (byte) 94);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "g.hw(" + ')');
		}
	}

	public static final void method1748(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			arg0.anInt4376 -= 10;
			byte[] var4 = null;
			byte[] var5 = null;
			int var6;
			for (var6 = 0; var6 < 10; var6 += 2) {
				if (arg0.anIntArray4387[arg0.anInt4376 + var6] < 0) {
					if (arg1 != 975148730) {
					}
					break;
				}
			}
			if (var6 > 0) {
				var4 = new byte[var6 / 2];
				var5 = new byte[var6 / 2];
				for (var6 -= 2; var6 >= 0; var6 -= 2) {
					var4[var6 / 2] = (byte) arg0.anIntArray4387[var6 + arg0.anInt4376];
					var5[var6 / 2] = (byte) arg0.anIntArray4387[var6 + arg0.anInt4376 + 1];
				}
			}
			Class123.method1507(var3, var4, var5, arg0, -2031668772);
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "g.kc(" + ')');
		}
	}

	public static final void method1749(Class430 arg0, byte arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			if (client.anInt8995 != 15 || Class434.method5564(-1908258007)) {
				client.aByte9283 = -5;
			} else if (var2.length() > 20) {
				client.aByte9283 = -4;
			} else {
				client.aByte9283 = -1;
				Class330_Sub34 var3 = Class238.method2377(OutgoingPacket.aClass234_2543, client.aClass1_9060.aClass488_22, -449004703);
				var3.aClass330_Sub46_Sub2_7729.addByte(0, (byte) 28);
				int var4 = var3.aClass330_Sub46_Sub2_7729.offset;
				var3.aClass330_Sub46_Sub2_7729.addString(var2, (byte) -113);
				var3.aClass330_Sub46_Sub2_7729.method3751(var3.aClass330_Sub46_Sub2_7729.offset - var4, 1720365324);
				client.aClass1_9060.method378(var3, -277698596);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "g.abm(" + ')');
		}
	}

	public static final void method1750(Class430 arg0, int arg1) {
		try {
			Class330_Sub38 var2 = Class158_Sub3.method1857(16711935);
			if (var2 == null) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = -1;
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = -1;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2.anInt7755;
				int var3 = var2.anInt7751 << 28 | var2.anInt7756 + Class354.anInt3510 << 14 | Class354.anInt3516 + var2.anInt7753;
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "g.aei(" + ')');
		}
	}

	public static final void method1751(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			client.aShort9245 = (short) arg0.anIntArray4387[arg0.anInt4376];
			if (client.aShort9245 <= 0) {
				client.aShort9245 = 256;
			}
			client.aShort9016 = (short) arg0.anIntArray4387[arg0.anInt4376 + 1];
			if (client.aShort9016 <= 0) {
				client.aShort9016 = 320;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "g.amy(" + ')');
		}
	}

	public static final void method1752(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			Class537 var4 = Class301.aClass543_3059.method6339(var3, -1460827564);
			if (var4.method6321((byte) 38)) {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = Class79.aClass380_666.method4387(var2, (byte) -54).method4328(var3, var4.aString6236, (short) 4937);
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class79.aClass380_666.method4387(var2, (byte) -90).method4329(var3, var4.anInt6235, (byte) 43);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "g.aoa(" + ')');
		}
	}

	public static final void method1753(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class354_Sub1.anInt7977 == 100 ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "g.aem(" + ')');
		}
	}

	public static final void method1754(Class430 arg0, int arg1) {
		try {
			Class432_Sub1_Sub4_Sub1.method5540(arg0, -1685413346);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "g.sz(" + ')');
		}
	}

	public static void method1755(Class61[] arg0, int arg1) {
		try {
			Class144.anInt1577 = arg0.length;
			Class_na.aClass61Array9725 = new Class61[Class144.anInt1577 + 10];
			Class444.anIntArray4495 = new int[Class144.anInt1577 + 10];
			System.arraycopy(arg0, 0, Class_na.aClass61Array9725, 0, Class144.anInt1577);
			int var2;
			for (var2 = 0; var2 < Class144.anInt1577; var2++) {
				Class444.anIntArray4495[var2] = Class_na.aClass61Array9725[var2].method683();
			}
			for (var2 = Class144.anInt1577; var2 < Class_na.aClass61Array9725.length; var2++) {
				Class444.anIntArray4495[var2] = 12;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "g.aw(" + ')');
		}
	}
}
