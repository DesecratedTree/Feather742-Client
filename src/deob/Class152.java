package deob;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class Class152 implements Runnable {

	public static Class8 aClass8_1630;

	public static String aString1629;

	public Thread aThread1627;

	public volatile boolean aBoolean1628;

	public Class171[] aClass171Array1626;

	public Class171 method1782(int arg0, int arg1) {
		try {
			return this.aClass171Array1626 == null || arg0 < 0 || arg0 >= this.aClass171Array1626.length ? null : this.aClass171Array1626[arg0];
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ge.r(" + ')');
		}
	}

	public void run() {
		try {
			try {
				int var1 = Class404.aClass457_4162 == Class457.aClass457_6834 ? 80 : Class507.aClass498_5932.anInt5889 + 7000;
				BufferedReader var2 = new BufferedReader(new InputStreamReader(new DataInputStream((new URL("http://" + Class507.aClass498_5932.aString5886 + ":" + var1 + "/news.ws?game=" + client.aClass435_9146.anInt4417)).openStream())));
				String var3 = var2.readLine();
				ArrayList var4 = new ArrayList();
				while (var3 != null) {
					var4.add(var3);
					var3 = var2.readLine();
				}
				String[] var5 = new String[var4.size()];
				var4.toArray(var5);
				if (var5.length % 3 != 0) {
					return;
				}
				this.aClass171Array1626 = new Class171[var5.length / 3];
				for (int var6 = 0; var6 < var5.length; var6 += 3) {
					this.aClass171Array1626[var6 / 3] = new Class171(var5[var6], var5[var6 + 1], var5[var6 + 2]);
				}
			} catch (IOException var7) {
			}
			this.aBoolean1628 = true;
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "ge.run(" + ')');
		}
	}

	public boolean method1783(byte arg0) {
		try {
			if (this.aBoolean1628) {
				return true;
			}
			if (this.aThread1627 == null) {
				this.aThread1627 = new Thread(this);
				this.aThread1627.start();
			}
			return this.aBoolean1628;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ge.j(" + ')');
		}
	}

	public static final void method1784(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, byte arg3) {
		try {
			arg0.anInt1238 = 1;
			arg0.anInt1239 = arg2.anIntArray4387[--arg2.anInt4376];
			Class404.method4738(arg0, 1288744543);
			if (arg0.anInt1287 == -1 && !arg1.aBoolean1402) {
				Class70.method822(arg0.anInt1196, -1410831977);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ge.di(" + ')');
		}
	}

	public static final void method1785(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class363.method4259(var3, var4, arg0, (byte) 25);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ge.jk(" + ')');
		}
	}

	public static final void method1786(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = arg0.aClass154_4391.anIntArray1652[var2];
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ge.ya(" + ')');
		}
	}

	public static final void method1787(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 1463804573);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class439.method5599(var3, var4, true, 2, arg0, (byte) 70);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ge.hs(" + ')');
		}
	}

	public static final void method1788(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			arg0.aStringArray1284 = null;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ge.jj(" + ')');
		}
	}

	public static final void method1789(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class2.aClass523_44.method6233(var2, 2087882064).method3455(1839779665);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ge.adq(" + ')');
		}
	}

	public static void method1790(int arg0, int arg1) {
		try {
			if (arg0 != -1 && !Class382.aBooleanArray6678[arg0]) {
				Class330_Sub12_Sub9.aClass280_9534.removeFromStore(arg0, (byte) -78);
				Class3.aClass120Array56[arg0] = null;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ge.f(" + ')');
		}
	}
}
