package deob;

import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;

public class Class555 {

	public ReferenceQueue aReferenceQueue6381 = new ReferenceQueue();

	public WeakReference_Sub1[] aWeakReference_Sub1Array6380 = new WeakReference_Sub1[16];

	public int anInt6379;

	public static int anInt6384;

	public static Class8 aClass8_6383;

	public static int[] anIntArray6382;

	public void method6396(Object arg0, Object arg1, byte arg2) {
		try {
			if (arg0 == null) {
				throw new NullPointerException();
			}
			this.method6399(-118291727);
			int var4 = System.identityHashCode(arg0);
			int var5 = var4 & this.aWeakReference_Sub1Array6380.length - 1;
			WeakReference_Sub1 var6 = this.aWeakReference_Sub1Array6380[var5];
			if (var6 == null) {
				this.aWeakReference_Sub1Array6380[var5] = new WeakReference_Sub1(arg0, this.aReferenceQueue6381, var4, arg1);
				this.anInt6379++;
				if (this.anInt6379 >= this.aWeakReference_Sub1Array6380.length) {
					this.method6398(-1470707170);
				}
			} else {
				while (var6.get() != arg0) {
					if (var6.aWeakReference_Sub1_6438 == null) {
						var6.aWeakReference_Sub1_6438 = new WeakReference_Sub1(arg0, this.aReferenceQueue6381, var4, arg1);
						this.anInt6379++;
						if (this.anInt6379 >= this.aWeakReference_Sub1Array6380.length) {
							this.method6398(-1470707170);
						}
						return;
					}
					var6 = var6.aWeakReference_Sub1_6438;
				}
				if (arg2 < 0) {
				}
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "wz.r(" + ')');
		}
	}

	public void method6397(Object arg0, int arg1) {
		try {
			if (arg0 == null) {
				throw new NullPointerException();
			}
			this.method6399(-282229675);
			int var3 = System.identityHashCode(arg0);
			int var4 = var3 & this.aWeakReference_Sub1Array6380.length - 1;
			WeakReference_Sub1 var5 = this.aWeakReference_Sub1Array6380[var4];
			if (var5 != null) {
				if (var5.get() == arg0) {
					this.aWeakReference_Sub1Array6380[var4] = var5.aWeakReference_Sub1_6438;
					this.anInt6379--;
				} else {
					while (true) {
						WeakReference_Sub1 var6 = var5.aWeakReference_Sub1_6438;
						if (var6 == null) {
							if (arg1 != -1956893969) {
								throw new IllegalStateException();
							}
							break;
						}
						if (var6.get() == arg0) {
							var5.aWeakReference_Sub1_6438 = var6.aWeakReference_Sub1_6438;
							this.anInt6379--;
							break;
						}
						var5 = var6;
					}
				}
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "wz.j(" + ')');
		}
	}

	public void method6398(int arg0) {
		try {
			WeakReference_Sub1[] var2 = this.aWeakReference_Sub1Array6380;
			this.aWeakReference_Sub1Array6380 = new WeakReference_Sub1[var2.length * 2];
			WeakReference_Sub1[] var3 = var2;
			WeakReference_Sub1 var5;
			for (int var4 = 0; var4 < var3.length; var4++) {
				for (WeakReference_Sub1 var6 = var3[var4]; var6 != null; var6 = var5) {
					var5 = var6.aWeakReference_Sub1_6438;
					int var7 = var6.anInt6439 & this.aWeakReference_Sub1Array6380.length - 1;
					var6.aWeakReference_Sub1_6438 = this.aWeakReference_Sub1Array6380[var7];
					this.aWeakReference_Sub1Array6380[var7] = var6;
				}
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "wz.p(" + ')');
		}
	}

	public void method6399(int arg0) {
		try {
			while (true) {
				WeakReference_Sub1 var2 = (WeakReference_Sub1) this.aReferenceQueue6381.poll();
				if (var2 == null) {
					return;
				}
				int var3 = var2.anInt6439 & this.aWeakReference_Sub1Array6380.length - 1;
				WeakReference_Sub1 var4 = this.aWeakReference_Sub1Array6380[var3];
				if (var4 == var2) {
					this.aWeakReference_Sub1Array6380[var3] = var2.aWeakReference_Sub1_6438;
					this.anInt6379--;
				} else {
					while (var4 != null && var4.aWeakReference_Sub1_6438 != var2) {
						var4 = var4.aWeakReference_Sub1_6438;
					}
					if (var4 != null) {
						var4.aWeakReference_Sub1_6438 = var2.aWeakReference_Sub1_6438;
						this.anInt6379--;
					}
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "wz.o(" + ')');
		}
	}

	public ArrayList method6400(byte arg0) {
		try {
			this.method6399(-1322691468);
			ArrayList var2 = new ArrayList(this.anInt6379);
			WeakReference_Sub1[] var3 = this.aWeakReference_Sub1Array6380;
			for (int var4 = 0; var4 < var3.length; var4++) {
				for (WeakReference_Sub1 var5 = var3[var4]; var5 != null; var5 = var5.aWeakReference_Sub1_6438) {
					Object var6 = var5.get();
					if (var6 != null) {
						var2.add(var6);
					}
				}
			}
			return var2;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "wz.i(" + ')');
		}
	}

	public static final void method6401(Class430 arg0, byte arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.aBoolean9123 ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "wz.uu(" + ')');
		}
	}

	public static final void method6402(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class330_Sub36_Sub12 var3 = Class354.method4100(var2 >> 14 & 0x3FFF, var2 & 0x3FFF);
			if (var3 == null) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = -1;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt9708;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "wz.aeh(" + ')');
		}
	}
}
