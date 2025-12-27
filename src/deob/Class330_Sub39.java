package deob;

import java.util.BitSet;

public class Class330_Sub39 extends Class330 {

	public boolean aBoolean7758 = true;

	public int anInt7760 = 0;

	public String aString7757 = null;

	public byte aByte7764;

	public byte aByte7765;

	public static int anInt7766;

	public static int anInt7767;

	public long aLong7762;

	public boolean aBoolean7763;

	public int[] anIntArray7761;

	public Class153[] aClass153Array7759;

	public Class330_Sub39(Buffer arg0) {
		this.method3545(arg0, 415958865);
	}

	public void method3542(int arg0, byte arg1) {
		try {
			if (this.aClass153Array7759 == null) {
				this.aClass153Array7759 = new Class153[arg0];
			} else {
				Class453.method5641(this.aClass153Array7759, 0, this.aClass153Array7759 = new Class153[arg0], 0, this.anInt7760);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "adt.r(" + ')');
		}
	}

	public void method3543(Class153 arg0, byte arg1) {
		try {
			if (this.aClass153Array7759 == null || this.anInt7760 >= this.aClass153Array7759.length) {
				this.method3542(this.anInt7760 + 5, (byte) -24);
			}
			this.aClass153Array7759[++this.anInt7760 - 1] = arg0;
			this.anIntArray7761 = null;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "adt.i(" + ')');
		}
	}

	public int method3544(String arg0, byte arg1) {
		try {
			for (int var3 = 0; var3 < this.anInt7760; var3++) {
				if (this.aClass153Array7759[var3].aString1633.equalsIgnoreCase(arg0)) {
					return var3;
				}
			}
			return -1;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "adt.o(" + ')');
		}
	}

	public void method3545(Buffer arg0, int arg1) {
		try {
			int var3 = arg0.readUnsignedByte(-10979315);
			if ((var3 & 0x1) != 0) {
				this.aBoolean7763 = true;
			}
			if ((var3 & 0x2) != 0) {
				this.aBoolean7758 = true;
			}
			this.aLong3341 = arg0.readLong(71676423);
			this.aLong7762 = arg0.readLong(-1530886990);
			this.aString7757 = arg0.readString(685293473);
			arg0.readUnsignedByte(-272150195);
			this.aByte7765 = arg0.readByte((byte) 41);
			this.aByte7764 = arg0.readByte((byte) 17);
			this.anInt7760 = arg0.readUnsignedShort(166721554);
			if (this.anInt7760 > 0) {
				this.aClass153Array7759 = new Class153[this.anInt7760];
				for (int var4 = 0; var4 < this.anInt7760; var4++) {
					Class153 var5 = new Class153();
					if (this.aBoolean7763) {
						arg0.readLong(650409941);
					}
					if (this.aBoolean7758) {
						var5.aString1633 = arg0.readString(-1619970436);
					}
					var5.aByte1632 = arg0.readByte((byte) 20);
					var5.anInt1631 = arg0.readUnsignedShort(2037161824);
					this.aClass153Array7759[var4] = var5;
				}
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "adt.s(" + ')');
		}
	}

	public void method3546(int arg0, int arg1) {
		try {
			this.anInt7760--;
			if (this.anInt7760 == 0) {
				this.aClass153Array7759 = null;
			} else {
				Class453.method5641(this.aClass153Array7759, arg0 + 1, this.aClass153Array7759, arg0, this.anInt7760 - arg0);
			}
			this.anIntArray7761 = null;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "adt.p(" + ')');
		}
	}

	static {
		new BitSet(65536);
	}

	public int[] method3547(byte arg0) {
		try {
			if (this.anIntArray7761 == null) {
				String[] var2 = new String[this.anInt7760];
				this.anIntArray7761 = new int[this.anInt7760];
				int var3 = 0;
				while (var3 < this.anInt7760) {
					var2[var3] = this.aClass153Array7759[var3].aString1633;
					this.anIntArray7761[var3] = var3++;
				}
				Class105.method1308(var2, this.anIntArray7761, -345551316);
			}
			return this.anIntArray7761;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "adt.j(" + ')');
		}
	}

	public static Class330_Sub34 method3548(int arg0) {
		try {
			Class330_Sub34 var1 = Class239.method2383((byte) -18);
			var1.aClass234_7732 = null;
			var1.anInt7728 = 0;
			var1.aClass330_Sub46_Sub2_7729 = new Class330_Sub46_Sub2(5000);
			return var1;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "adt.i(" + ')');
		}
	}

	public static void method3549(int arg0, boolean arg1, int arg2) {
		try {
			Class330_Sub36_Sub3 var3 = Class464_Sub4.method5750(22, (long) arg0);
			var3.method3445((byte) 0);
			var3.anInt9629 = arg1 ? 1 : 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "adt.ad(" + ')');
		}
	}
}
