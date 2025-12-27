package deob;

import jaclib.ping.Ping;
import java.net.InetAddress;
import java.util.LinkedList;
import java.util.Queue;

public class Class423 implements Runnable {

	public Object anObject4324 = new Object();

	public Queue aQueue4325 = new LinkedList();

	public Thread aThread4323 = new Thread(this);

	public Class423() {
		this.aThread4323.setDaemon(true);
		this.aThread4323.start();
	}

	public Class422 method5298(String arg0, int arg1) {
		try {
			if (this.aThread4323 == null) {
				throw new IllegalStateException("");
			} else if (arg0 == null) {
				throw new IllegalArgumentException("");
			} else {
				Class422 var3 = new Class422(arg0);
				this.method5300(var3, 927494319);
				return var3;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "rp.r(" + ')');
		}
	}

	public void method5299(int arg0) {
		try {
			if (this.aThread4323 != null) {
				this.method5300(this.anObject4324, -1886794477);
				try {
					this.aThread4323.join();
				} catch (InterruptedException var3) {
				}
				this.aThread4323 = null;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "rp.j(" + ')');
		}
	}

	public void method5300(Object arg0, int arg1) {
		try {
			Queue var3 = this.aQueue4325;
			synchronized (this.aQueue4325) {
				this.aQueue4325.add(arg0);
				this.aQueue4325.notify();
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "rp.i(" + ')');
		}
	}

	public void run() {
		try {
			while (true) {
				Queue var2 = this.aQueue4325;
				Class422 var1;
				synchronized (this.aQueue4325) {
					Object var3;
					for (var3 = this.aQueue4325.poll(); var3 == null; var3 = this.aQueue4325.poll()) {
						try {
							this.aQueue4325.wait();
						} catch (InterruptedException var7) {
						}
					}
					if (var3 == this.anObject4324) {
						return;
					}
					var1 = (Class422) var3;
				}
				int var10;
				try {
					byte[] var11 = InetAddress.getByName(var1.aString4320).getAddress();
					var10 = Ping.r(var11[0], var11[1], var11[2], var11[3], 1000L);
				} catch (Throwable var6) {
					var10 = 1000;
				}
				var1.anInt4319 = var10;
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "rp.run(" + ')');
		}
	}

	public static void method5301(int arg0) {
		try {
			Class96.aShort865 = client.aShort9249;
			Class13.aShort175 = client.aShort8965;
			Class96.aShort859 = client.aShort9191;
			Class139.aShort1535 = client.aShort9203;
			Class96.aBoolean861 = true;
			Class96.anInt864 = Class333.musicId;
			if (Class96.anInt860 != 0 && Class96.anInt863 != 0) {
				client.aShort9191 = 334;
				client.aShort9203 = 334;
				client.aShort8965 = client.aShort9249 = (short) (Class96.anInt860 * 512 / Class96.anInt863);
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "rp.p(" + ')');
		}
	}

	public static final Class330_Sub48 method5302(int arg0, Class330_Sub48 arg1, int[] arg2, boolean arg3, short arg4) {
		try {
			Class330_Sub48 var5 = (Class330_Sub48) client.aClass497_9284.method6094((long) arg0);
			if (var5 != null) {
				Class75.method854(var5, arg1.anInt7859 != var5.anInt7859, arg3, -875833488);
			}
			client.aClass497_9284.method6097(arg1, (long) arg0);
			Class441.method5610(arg1.anInt7859, arg2, (byte) 6);
			IComponentDefinitions var6 = Class95.method1101(arg0, 94873876);
			if (var6 != null) {
				Class404.method4738(var6, 1825261932);
			}
			if (client.aClass114_9078 != null) {
				Class404.method4738(client.aClass114_9078, 1190397429);
				client.aClass114_9078 = null;
			}
			Class70.method818(-239640105);
			if (var6 != null) {
				Class156.method1829(Class3.aClass120Array56[var6.anInt1196 >>> 16], var6, !arg3, 1339530533);
			}
			if (!arg3) {
				Class460.method5692(arg1.anInt7859, arg2, 344267282);
			}
			if (!arg3 && client.windowPaneId != -1) {
				Class527.method6268(client.windowPaneId, 1, (byte) 49);
			}
			return arg1;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "rp.lm(" + ')');
		}
	}

	public static int method5303(int arg0, int arg1, boolean arg2, int arg3) {
		try {
			Class330_Sub1 var4 = Class321.method3178(arg0, arg2, (short) 25832);
			if (var4 == null) {
				return -1;
			} else if (arg1 >= 0 && arg1 < var4.anIntArray7500.length) {
				return var4.anIntArray7500[arg1];
			} else {
				return -1;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "rp.r(" + ')');
		}
	}

	public static final void method5304(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class281.method2789(var3, var4, arg0, 878662689);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "rp.fq(" + ')');
		}
	}
}
