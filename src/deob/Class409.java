package deob;

import jaclib.ping.Ping;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Class409 implements Runnable {

	public volatile long aLong4217 = -1L;

	public volatile boolean aBoolean4218 = true;

	public String aString4215;

	public InetAddress anInetAddress4216;

	public void method4770(String arg0, short arg1) {
		try {
			this.aString4215 = arg0;
			this.anInetAddress4216 = null;
			this.aLong4217 = -1L;
			if (this.aString4215 != null) {
				try {
					this.anInetAddress4216 = InetAddress.getByName(this.aString4215);
				} catch (UnknownHostException var4) {
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "r.r(" + ')');
		}
	}

	public long method4771(int arg0) {
		try {
			return this.aLong4217;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "r.j(" + ')');
		}
	}

	public void method4772(int arg0) {
		try {
			this.aBoolean4218 = false;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "r.i(" + ')');
		}
	}

	public void method4773(byte arg0) {
		try {
			if (this.anInetAddress4216 != null) {
				try {
					byte[] var2 = this.anInetAddress4216.getAddress();
					this.aLong4217 = Ping.r(var2[0], var2[1], var2[2], var2[3], 10000L);
				} catch (Throwable var3) {
				}
			}
			Class464_Sub21.method5813(1000L);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "r.p(" + ')');
		}
	}

	public void run() {
		try {
			while (this.aBoolean4218) {
				this.method4773((byte) -90);
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "r.run(" + ')');
		}
	}

	public static final void method4774(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -366439384);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1226;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "r.ru(" + ')');
		}
	}

	public static final void method4775(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			Class423.method5302(var2, new Class330_Sub48(var3, 3), null, true, (short) 16385);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "r.st(" + ')');
		}
	}

	public static final void method4776(Class430 arg0, int arg1) {
		try {
			long var2 = arg0.aLongArray4379[--arg0.anInt4380];
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var2 == -1L ? "" : Long.toString(var2, 36).toUpperCase();
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "r.aak(" + ')');
		}
	}

	public static final void method4777(Class430 arg0, int arg1) {
		try {
			Class367.method4303(523001132);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "r.ajs(" + ')');
		}
	}

	public static final void method4778(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub6_7882.method5755(-621127415) ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "r.apy(" + ')');
		}
	}

	public static final void method4779(Class430 arg0, int arg1) {
		try {
			Class456.method5655(arg0.anIntArray4387[--arg0.anInt4376], (byte) -1);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "r.adx(" + ')');
		}
	}
}
