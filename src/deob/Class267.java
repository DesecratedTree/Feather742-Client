package deob;

import java.awt.Frame;

public class Class267 implements Runnable {

	public Class472 aClass472_2739 = new Class472();

	public int anInt2737 = 0;

	public boolean aBoolean2738 = false;

	public Thread aThread2736 = new Thread(this);

	public static Frame aFrame2740;

	public Class267() {
		this.aThread2736.setDaemon(true);
		this.aThread2736.start();
		this.aThread2736.setPriority(1);
	}

	public Class330_Sub36_Sub16_Sub1 method2649(int arg0, Class339 arg1, byte arg2) {
		try {
			Class330_Sub36_Sub16_Sub1 var4 = new Class330_Sub36_Sub16_Sub1();
			var4.anInt10146 = 1;
			Class472 var5 = this.aClass472_2739;
			synchronized (this.aClass472_2739) {
				for (Class330_Sub36_Sub16_Sub1 var6 = (Class330_Sub36_Sub16_Sub1) this.aClass472_2739.method5884((byte) 78); var6 != null; var6 = (Class330_Sub36_Sub16_Sub1) this.aClass472_2739.method5886((short) 8192)) {
					if ((long) arg0 == var6.aLong7734 && var6.aClass339_10150 == arg1 && var6.anInt10146 == 2) {
						var4.aByteArray10151 = var6.aByteArray10151;
						var4.aBoolean9721 = false;
						return var4;
					}
				}
			}
			var4.aByteArray10151 = arg1.method3961(arg0, (byte) -44);
			var4.aBoolean9721 = false;
			var4.aBoolean9723 = true;
			return var4;
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "ld.r(" + ')');
		}
	}

	public void method2650(Class330_Sub36_Sub16_Sub1 arg0, int arg1) {
		try {
			Class472 var3 = this.aClass472_2739;
			synchronized (this.aClass472_2739) {
				this.aClass472_2739.method5883(arg0, -1235251704);
				this.anInt2737++;
				this.aClass472_2739.notifyAll();
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ld.p(" + ')');
		}
	}

	public Class330_Sub36_Sub16_Sub1 method2651(int arg0, Class339 arg1, int arg2) {
		try {
			Class330_Sub36_Sub16_Sub1 var4 = new Class330_Sub36_Sub16_Sub1();
			var4.anInt10146 = 3;
			var4.aLong7734 = arg0;
			var4.aClass339_10150 = arg1;
			var4.aBoolean9723 = false;
			this.method2650(var4, 1330655408);
			return var4;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ld.i(" + ')');
		}
	}

	public void run() {
		try {
			while (!this.aBoolean2738) {
				Class472 var2 = this.aClass472_2739;
				Class330_Sub36_Sub16_Sub1 var1;
				synchronized (this.aClass472_2739) {
					var1 = (Class330_Sub36_Sub16_Sub1) this.aClass472_2739.method5888(1625224277);
					if (var1 == null) {
						try {
							this.aClass472_2739.wait();
						} catch (InterruptedException var6) {
						}
						continue;
					}
					this.anInt2737--;
				}
				try {
					if (var1.anInt10146 == 2) {
						var1.aClass339_10150.method3962((int) var1.aLong7734, var1.aByteArray10151, var1.aByteArray10151.length, (short) -16630);
					} else if (var1.anInt10146 == 3) {
						var1.aByteArray10151 = var1.aClass339_10150.method3961((int) var1.aLong7734, (byte) -49);
					}
				} catch (Exception var5) {
					Class207.method2195(null, var5, -306254718);
				}
				var1.aBoolean9721 = false;
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "ld.run(" + ')');
		}
	}

	public Class330_Sub36_Sub16_Sub1 method2652(int arg0, byte[] arg1, Class339 arg2, int arg3) {
		try {
			Class330_Sub36_Sub16_Sub1 var5 = new Class330_Sub36_Sub16_Sub1();
			var5.anInt10146 = 2;
			var5.aLong7734 = arg0;
			var5.aByteArray10151 = arg1;
			var5.aClass339_10150 = arg2;
			var5.aBoolean9723 = false;
			this.method2650(var5, -725239778);
			return var5;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ld.j(" + ')');
		}
	}

	public void method2653(byte arg0) {
		try {
			this.aBoolean2738 = true;
			Class472 var2 = this.aClass472_2739;
			synchronized (this.aClass472_2739) {
				this.aClass472_2739.notifyAll();
			}
			try {
				this.aThread2736.join();
			} catch (InterruptedException var4) {
			}
			this.aThread2736 = null;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ld.o(" + ')');
		}
	}

	public static final void method2654(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1354;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ld.pc(" + ')');
		}
	}

	public static final void method2655(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 4;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			boolean var5 = arg0.anIntArray4387[arg0.anInt4376 + 3] == 1;
			if (Class401_Sub1.aClass145_Sub1_8249.method1718(1948853394) != Class146.aClass146_1611) {
				throw new RuntimeException();
			}
			Class475_Sub1 var6 = (Class475_Sub1) Class401_Sub1.aClass145_Sub1_8249.method1715(-1089224319);
			Player var7 = Class263_Sub2.myPlayer;
			if (var7 != null) {
				var6.method5945(var7, new Class260((float) var2, (float) var3, (float) var4), var5, (short) 128);
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "ld.ahi(" + ')');
		}
	}

	public static final void method2656(Class430 arg0, int arg1) {
		try {
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub9_7899, arg0.anIntArray4387[--arg0.anInt4376], 450416033);
			Class435.method5568(1427327421);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ld.aky(" + ')');
		}
	}

	public static final void method2657(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = arg0.aClass330_Sub39_4395.aByte7764;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ld.ye(" + ')');
		}
	}

	public static final void method2658(Class430 arg0, short arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1335;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ld.qj(" + ')');
		}
	}
}
