package deob;

import java.util.Iterator;

public class Class491 {

	public int anInt5860 = 0;

	public int anInt5856 = -1;

	public int anInt5857 = 512;

	public boolean aBoolean5858 = true;

	public boolean aBoolean5859 = true;

	public int anInt5855;

	public int anInt5861;

	public int anInt5862;

	public int anInt5863;

	public void method6072(Buffer arg0, int arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(-194729773);
				if (var3 == 0) {
					if (arg1 == 1632830751) {
					}
					return;
				}
				this.method6073(arg0, var3, -1483301317);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "uh.r(" + ')');
		}
	}

	public void method6073(Buffer arg0, int arg1, int arg2) {
		try {
			if (arg1 == 1) {
				this.anInt5860 = arg0.readUnsignedTriByte(-1401356047);
				this.method6074(this.anInt5860, (byte) 122);
			} else if (arg1 == 2) {
				this.anInt5856 = arg0.readUnsignedShort(910537626);
				if (this.anInt5856 == 65535) {
					this.anInt5856 = -1;
				}
			} else if (arg1 == 3) {
				this.anInt5857 = arg0.readUnsignedShort(-58779536) << 2;
			} else if (arg1 == 4) {
				this.aBoolean5858 = false;
			} else if (arg1 == 5) {
				this.aBoolean5859 = false;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "uh.j(" + ')');
		}
	}

	public void method6074(int arg0, byte arg1) {
		try {
			double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
			double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
			double var7 = (double) (arg0 & 0xFF) / 256.0D;
			double var9 = var3;
			if (var5 < var3) {
				var9 = var5;
			}
			if (var7 < var9) {
				var9 = var7;
			}
			double var11 = var3;
			if (var5 > var3) {
				var11 = var5;
			}
			if (var7 > var11) {
				var11 = var7;
			}
			double var13 = 0.0D;
			double var15 = 0.0D;
			double var17 = (var11 + var9) / 2.0D;
			if (var11 != var9) {
				if (var17 < 0.5D) {
					var15 = (var11 - var9) / (var9 + var11);
				}
				if (var17 >= 0.5D) {
					var15 = (var11 - var9) / (2.0D - var11 - var9);
				}
				if (var3 == var11) {
					var13 = (var5 - var7) / (var11 - var9);
				} else if (var11 == var5) {
					var13 = (var7 - var3) / (var11 - var9) + 2.0D;
				} else if (var7 == var11) {
					var13 = (var3 - var5) / (var11 - var9) + 4.0D;
				}
			}
			var13 /= 6.0D;
			this.anInt5861 = (int) (var15 * 256.0D);
			this.anInt5862 = (int) (var17 * 256.0D);
			if (this.anInt5861 < 0) {
				this.anInt5861 = 0;
			} else if (this.anInt5861 > 255) {
				this.anInt5861 = 255;
			}
			if (this.anInt5862 < 0) {
				this.anInt5862 = 0;
			} else if (this.anInt5862 > 255) {
				this.anInt5862 = 255;
			}
			if (var17 > 0.5D) {
				this.anInt5863 = (int) (var15 * (1.0D - var17) * 512.0D);
			} else {
				this.anInt5863 = (int) (var17 * 512.0D * var15);
			}
			if (this.anInt5863 < 1) {
				this.anInt5863 = 1;
			}
			this.anInt5855 = (int) (var13 * (double) this.anInt5863);
		} catch (RuntimeException var19) {
			throw Class476.method5964(var19, "uh.i(" + ')');
		}
	}

	public static void method6075(int arg0) {
		try {
			Class391.aClass497_4062 = new Class497(8);
			Class391.anInt4061 = 0;
			Iterator var1 = Class391.aList4056.iterator();
			while (var1.hasNext()) {
				Class388 var2 = (Class388) var1.next();
				var2.method4564();
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "uh.p(" + ')');
		}
	}

	public static final void method6076(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1329;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "uh.pk(" + ')');
		}
	}
}
