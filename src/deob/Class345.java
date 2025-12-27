package deob;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.io.OutputStream;

public class Class345 implements Runnable {

	public int anInt3415 = 0;

	public int anInt3416 = 0;

	public OutputStream anOutputStream3412;

	public int anInt3418;

	public byte[] aByteArray3414;

	public Thread aThread3413;

	public IOException anIOException3417;

	public boolean aBoolean3411;

	public Class345(OutputStream arg0, int arg1) {
		this.anOutputStream3412 = arg0;
		this.anInt3418 = arg1 + 1;
		this.aByteArray3414 = new byte[this.anInt3418];
		this.aThread3413 = new Thread(this);
		this.aThread3413.setDaemon(true);
		this.aThread3413.start();
	}

	public void method4004(int arg0) {
		try {
			synchronized (this) {
				this.aBoolean3411 = true;
				this.notifyAll();
			}
			try {
				this.aThread3413.join();
			} catch (InterruptedException var4) {
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "oj.i(" + ')');
		}
	}

	public void run() {
		try {
			do {
				int var1;
				synchronized (this) {
					while (true) {
						if (this.anIOException3417 != null) {
							return;
						}
						if (this.anInt3415 <= this.anInt3416) {
							var1 = this.anInt3416 - this.anInt3415;
						} else {
							var1 = this.anInt3418 - this.anInt3415 + this.anInt3416;
						}
						if (var1 > 0) {
							break;
						}
						try {
							this.anOutputStream3412.flush();
						} catch (IOException var9) {
							this.anIOException3417 = var9;
							return;
						}
						if (this.method4007(-2024573179)) {
							return;
						}
						try {
							this.wait();
						} catch (InterruptedException var10) {
						}
					}
				}
				try {
					if (this.anInt3415 + var1 <= this.anInt3418) {
						this.anOutputStream3412.write(this.aByteArray3414, this.anInt3415, var1);
					} else {
						int var14 = this.anInt3418 - this.anInt3415;
						this.anOutputStream3412.write(this.aByteArray3414, this.anInt3415, var14);
						this.anOutputStream3412.write(this.aByteArray3414, 0, var1 - var14);
					}
				} catch (IOException var11) {
					IOException var2 = var11;
					synchronized (this) {
						this.anIOException3417 = var2;
						return;
					}
				}
				synchronized (this) {
					this.anInt3415 = (this.anInt3415 + var1) % this.anInt3418;
				}
			} while (!this.method4007(-1464936691));
		} catch (RuntimeException var13) {
			throw Class476.method5964(var13, "oj.run(" + ')');
		}
	}

	public void method4005(int arg0) {
		try {
			this.anOutputStream3412 = new OutputStream_Sub1();
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "oj.p(" + ')');
		}
	}

	public void method4006(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
		try {
			if (arg2 < 0 || arg1 < 0 || arg2 + arg1 > arg0.length) {
				throw new IOException();
			}
			synchronized (this) {
				if (this.anIOException3417 != null) {
					throw new IOException(this.anIOException3417.toString());
				}
				int var6;
				if (this.anInt3415 <= this.anInt3416) {
					var6 = this.anInt3418 - this.anInt3416 + this.anInt3415 - 1;
				} else {
					var6 = this.anInt3415 - this.anInt3416 - 1;
				}
				if (var6 < arg2) {
					throw new IOException("");
				}
				if (arg2 + this.anInt3416 <= this.anInt3418) {
					System.arraycopy(arg0, arg1, this.aByteArray3414, this.anInt3416, arg2);
				} else {
					int var7 = this.anInt3418 - this.anInt3416;
					System.arraycopy(arg0, arg1, this.aByteArray3414, this.anInt3416, var7);
					System.arraycopy(arg0, var7 + arg1, this.aByteArray3414, 0, arg2 - var7);
				}
				this.anInt3416 = (arg2 + this.anInt3416) % this.anInt3418;
				this.notifyAll();
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "oj.j(" + ')');
		}
	}

	public boolean method4007(int arg0) {
		try {
			if (!this.aBoolean3411) {
				return false;
			}
			try {
				this.anOutputStream3412.close();
				if (this.anIOException3417 == null) {
					this.anIOException3417 = new IOException("");
				}
			} catch (IOException var3) {
				if (this.anIOException3417 == null) {
					this.anIOException3417 = new IOException(var3);
				}
			}
			return true;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "oj.r(" + ')');
		}
	}

	public static final void method4008(Class430 arg0, int arg1) {
		try {
			String var2 = "";
			if (Class391.aClipboard4063 != null) {
				Transferable var3 = Class391.aClipboard4063.getContents(null);
				if (var3 != null) {
					try {
						var2 = (String) var3.getTransferData(DataFlavor.stringFlavor);
						if (var2 == null) {
							var2 = "";
						}
					} catch (Exception var5) {
					}
				}
			}
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var2;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "oj.agg(" + ')');
		}
	}

	public static void method4009(Class_ra arg0, int arg1) {
		try {
			int var2 = -10660793;
			Class436.method5576(arg0, Class89.anInt736, Class85.anInt713, Class550.anInt6288, Class406.anInt4194, var2, -16777216, (byte) -76);
			Class166_Sub3_Sub2.aClass263_9483.method2594(Class526.aClass526_6062.method6257(Class429.aClass454_4369, 991479434), Class89.anInt736 + 3, Class85.anInt713 + 14, var2, -1, 1330171679);
			int var3 = Class464_Sub23.aClass350_8712.method4030(34823472);
			int var4 = Class464_Sub23.aClass350_8712.method4031((short) 28704);
			int var5;
			Class330_Sub36_Sub10 var6;
			int var7;
			if (Class484.aBoolean5783) {
				var5 = 0;
				for (Class330_Sub36_Sub13 var9 = (Class330_Sub36_Sub13) Class484.aClass472_5793.method5884((byte) 72); var9 != null; var9 = (Class330_Sub36_Sub13) Class484.aClass472_5793.method5886((short) 8192)) {
					var7 = Class484.anInt5779 * var5 + 31 + Class85.anInt713;
					if (var9.anInt9715 == 1) {
						Class330_Sub36_Sub5.method3462(var3, var4, Class89.anInt736, Class85.anInt713, Class550.anInt6288, Class406.anInt4194, var7, (Class330_Sub36_Sub10) var9.aClass472_9716.aClass330_Sub36_5613.aClass330_Sub36_7735, Class166_Sub3_Sub2.aClass263_9483, Class477_Sub1.aClass524_8749, -1, -256, -863786004);
					} else {
						Class392.method4613(var3, var4, Class89.anInt736, Class85.anInt713, Class550.anInt6288, Class406.anInt4194, var7, var9, Class166_Sub3_Sub2.aClass263_9483, Class477_Sub1.aClass524_8749, -1, -256, 337718199);
					}
					var5++;
				}
				if (Class484.aClass330_Sub36_Sub13_5784 != null) {
					Class436.method5576(arg0, Class62.anInt561, Class246.anInt6586, Class116.anInt1374, Class95_Sub13.anInt7181, var2, -16777216, (byte) 0);
					Class166_Sub3_Sub2.aClass263_9483.method2594(Class484.aClass330_Sub36_Sub13_5784.aString9717, Class62.anInt561 + 3, Class246.anInt6586 + 14, var2, -1, -287485124);
					var5 = 0;
					for (var6 = (Class330_Sub36_Sub10) Class484.aClass330_Sub36_Sub13_5784.aClass472_9716.method5884((byte) 124); var6 != null; var6 = (Class330_Sub36_Sub10) Class484.aClass330_Sub36_Sub13_5784.aClass472_9716.method5886((short) 8192)) {
						var7 = Class246.anInt6586 + 31 + var5 * Class484.anInt5779;
						Class330_Sub36_Sub5.method3462(var3, var4, Class62.anInt561, Class246.anInt6586, Class116.anInt1374, Class95_Sub13.anInt7181, var7, var6, Class166_Sub3_Sub2.aClass263_9483, Class477_Sub1.aClass524_8749, -1, -256, -1478355531);
						var5++;
					}
				}
			} else {
				var5 = 0;
				for (var6 = (Class330_Sub36_Sub10) Class484.aClass471_5791.method5869(539664854); var6 != null; var6 = (Class330_Sub36_Sub10) Class484.aClass471_5791.method5873((byte) -87)) {
					var7 = Class85.anInt713 + 31 + (Class484.anInt5786 - 1 - var5) * Class484.anInt5779;
					Class330_Sub36_Sub5.method3462(var3, var4, Class89.anInt736, Class85.anInt713, Class550.anInt6288, Class406.anInt4194, var7, var6, Class166_Sub3_Sub2.aClass263_9483, Class477_Sub1.aClass524_8749, -1, -256, -1690337276);
					var5++;
				}
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "oj.au(" + ')');
		}
	}

	public static void method4010(int arg0, int arg1, int arg2) {
		try {
			if (Class484.anInt5816 == 1) {
				Class243.method2413(Class79.aClass330_Sub36_Sub10_667, arg0, arg1, (byte) -24);
			} else if (Class484.anInt5816 == 2) {
				Class330.method3258(arg0, arg1, 957698344);
			}
			Class484.anInt5816 = 0;
			Class79.aClass330_Sub36_Sub10_667 = null;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "oj.z(" + ')');
		}
	}

	public static int method4011(int arg0, boolean arg1, int arg2) {
		try {
			if (arg1) {
				return 0;
			}
			Class330_Sub1 var3 = Class321.method3178(arg0, arg1, (short) 26739);
			if (var3 == null) {
				return OutgoingPacket.aClass534_2580.method6305(arg0, (byte) 120).anInt9290;
			}
			int var4 = 0;
			for (int var5 = 0; var5 < var3.anIntArray7500.length; var5++) {
				if (var3.anIntArray7500[var5] == -1) {
					var4++;
				}
			}
			return var4 + (OutgoingPacket.aClass534_2580.method6305(arg0, (byte) 34).anInt9290 - var3.anIntArray7500.length);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "oj.o(" + ')');
		}
	}

	public static void method4012(Class549_Sub1 arg0, short arg1) {
		try {
			Class128.method1551(arg0, -8248891);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "oj.r(" + ')');
		}
	}

	public static final void method4013(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Exception_Sub2.method343(212104928);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "oj.alz(" + ')');
		}
	}
}
