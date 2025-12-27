package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Class490 {

	public RandomAccessFile aRandomAccessFile5851;

	public long aLong5852;

	public long aLong5853;

	public static long aLong5854;

	public final void method6064(int arg0) throws IOException {
		try {
			if (this.aRandomAccessFile5851 != null) {
				this.aRandomAccessFile5851.close();
				this.aRandomAccessFile5851 = null;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ug.i(" + ')');
		}
	}

	public final void method6065(long arg0) throws IOException {
		try {
			this.aRandomAccessFile5851.seek(arg0);
			this.aLong5853 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ug.r(" + ')');
		}
	}

	public final long method6066(int arg0) throws IOException {
		try {
			return this.aRandomAccessFile5851.length();
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ug.p(" + ')');
		}
	}

	public final int method6067(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
		try {
			int var5 = this.aRandomAccessFile5851.read(arg0, arg1, arg2);
			if (var5 > 0) {
				this.aLong5853 += var5;
			}
			return var5;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ug.o(" + ')');
		}
	}

	public void finalize() throws Throwable {
		try {
			if (this.aRandomAccessFile5851 != null) {
				this.method6064(-243446463);
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "ug.finalize(" + ')');
		}
	}

	public Class490(File arg0, String arg1, long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile5851 = new RandomAccessFile(arg0, arg1);
		this.aLong5852 = arg2;
		this.aLong5853 = 0L;
		int var5 = this.aRandomAccessFile5851.read();
		if (var5 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile5851.seek(0L);
			this.aRandomAccessFile5851.write(var5);
		}
		this.aRandomAccessFile5851.seek(0L);
	}

	public final void method6068(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
		try {
			if ((long) arg2 + this.aLong5853 > this.aLong5852) {
				this.aRandomAccessFile5851.seek(this.aLong5852);
				this.aRandomAccessFile5851.write(1);
				throw new EOFException();
			} else {
				this.aRandomAccessFile5851.write(arg0, arg1, arg2);
				this.aLong5853 += arg2;
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ug.j(" + ')');
		}
	}

	public static void method6069(Class120 arg0, IComponentDefinitions arg1, int arg2) {
		try {
			if (arg1 != null) {
				int var4;
				if (arg1.anInt1287 == -1) {
					IComponentDefinitions[] var7 = arg0.method1441(889022062);
					for (var4 = 0; var4 < var7.length; var4++) {
						if (arg1 == var7[var4]) {
							if (arg2 >= 16711935) {
							}
							break;
						}
					}
					if (var4 < var7.length) {
						Class453.method5641(var7, var4 + 1, var7, var4, var7.length - var4 - 1);
						var7[var7.length - 1] = arg1;
					}
				} else {
					IComponentDefinitions var3 = arg0.method1440(arg1.anInt1211, (byte) -48);
					if (var3 != null) {
						if (var3.aClass114Array1219 == var3.aClass114Array1347) {
							var3.aClass114Array1219 = new IComponentDefinitions[var3.aClass114Array1347.length];
							var3.aClass114Array1219[var3.aClass114Array1219.length - 1] = arg1;
							Class453.method5641(var3.aClass114Array1347, 0, var3.aClass114Array1219, 0, arg1.anInt1287);
							Class453.method5641(var3.aClass114Array1347, arg1.anInt1287 + 1, var3.aClass114Array1219, arg1.anInt1287, var3.aClass114Array1347.length - arg1.anInt1287 - 1);
						} else {
							var4 = 0;
							IComponentDefinitions[] var5 = var3.aClass114Array1219;
							while (var4 < var5.length) {
								if (arg1 == var5[var4]) {
									if (arg2 >= 16711935) {
										throw new IllegalStateException();
									}
									break;
								}
								var4++;
							}
							if (var4 < var5.length) {
								Class453.method5641(var5, var4 + 1, var5, var4, var5.length - var4 - 1);
								var5[var3.aClass114Array1219.length - 1] = arg1;
							}
						}
					}
				}
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ug.u(" + ')');
		}
	}

	public static final void method6070(int arg0) {
		try {
			client.anInt9265 = -1;
			client.anInt8987 = 2;
			Class140_Sub1.anIntArrayArray7262 = null;
			Class444.aClass330_Sub46_4496 = null;
			Class515.method6204(2056362057);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "ug.gh(" + ')');
		}
	}

	public static void method6071(int arg0) {
		try {
			if (client.aBoolean9150) {
				IComponentDefinitions var1 = Class166.method1993(Class368.anInt3869, client.anInt9151, 534399539);
				if (var1 != null && var1.anObjectArray1305 != null) {
					Class330_Sub42 var2 = new Class330_Sub42();
					var2.aClass114_7809 = var1;
					var2.anObjectArray7817 = var1.anObjectArray1305;
					Class117.method1423(var2, -1631194987);
				}
				client.anInt9147 = -1;
				client.anInt9104 = -1;
				client.aBoolean9150 = false;
				if (var1 != null) {
					Class404.method4738(var1, 1501884348);
				}
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ug.kt(" + ')');
		}
	}
}
