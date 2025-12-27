package deob;

public class Class330_Sub36_Sub6 extends Class330_Sub36 {

	public Class497 aClass497_9667;

	public void method3463(Buffer arg0, int arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(750370960);
				if (var3 == 0) {
					if (arg1 >= -2085937792) {
					}
					return;
				}
				this.method3465(arg0, var3, (byte) 9);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ajd.r(" + ')');
		}
	}

	public String method3464(int arg0, String arg1, int arg2) {
		try {
			if (this.aClass497_9667 == null) {
				return arg1;
			} else {
				Class330_Sub35 var4 = (Class330_Sub35) this.aClass497_9667.method6094((long) arg0);
				return var4 == null ? arg1 : (String) var4.anObject7733;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ajd.p(" + ')');
		}
	}

	public void method3465(Buffer arg0, int arg1, byte arg2) {
		try {
			if (arg1 == 249) {
				int var4 = arg0.readUnsignedByte(1226316665);
				int var5;
				if (this.aClass497_9667 == null) {
					var5 = Class136.method1594(var4, 1554656200);
					this.aClass497_9667 = new Class497(var5);
				}
				for (var5 = 0; var5 < var4; var5++) {
					boolean var6 = arg0.readUnsignedByte(1007287524) == 1;
					int var7 = arg0.readUnsignedTriByte(-1401356047);
					Class330 var8;
					if (var6) {
						var8 = new Class330_Sub35(arg0.readString(1217162218));
					} else {
						var8 = new Class330_Sub23(arg0.readInt((byte) 34));
					}
					this.aClass497_9667.method6097(var8, (long) var7);
				}
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "ajd.j(" + ')');
		}
	}

	public int method3466(int arg0, int arg1, int arg2) {
		try {
			if (this.aClass497_9667 == null) {
				return arg1;
			} else {
				Class330_Sub23 var4 = (Class330_Sub23) this.aClass497_9667.method6094((long) arg0);
				return var4 == null ? arg1 : var4.anInt7693;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ajd.i(" + ')');
		}
	}
}
