package deob;

public class Class330_Sub36_Sub4 extends Class330_Sub36 {

	public boolean aBoolean9662 = true;

	public Class523 aClass523_9657;

	public int[] anIntArray9659;

	public int[] anIntArray9661;

	public String[] aStringArray9660;

	public int[][] anIntArrayArray9658;

	public void method3449(Buffer arg0, int arg1, byte arg2) {
		try {
			if (arg1 == 1) {
				this.aStringArray9660 = Class226.method2309(arg0.readString(1200913188), '<', (byte) -85);
			} else {
				int var4;
				int var5;
				if (arg1 == 2) {
					var4 = arg0.readUnsignedByte(889901555);
					this.anIntArray9661 = new int[var4];
					for (var5 = 0; var5 < var4; var5++) {
						this.anIntArray9661[var5] = arg0.readUnsignedShort(740945578);
					}
				} else if (arg1 == 3) {
					var4 = arg0.readUnsignedByte(2065498163);
					this.anIntArray9659 = new int[var4];
					this.anIntArrayArray9658 = new int[var4][];
					for (var5 = 0; var5 < var4; var5++) {
						int var6 = arg0.readUnsignedShort(549215125);
						Class390 var7 = Class146.method1731(var6, -1631019388);
						if (var7 != null) {
							this.anIntArray9659[var5] = var6;
							this.anIntArrayArray9658[var5] = new int[var7.anInt4039];
							for (int var8 = 0; var8 < var7.anInt4039; var8++) {
								this.anIntArrayArray9658[var5][var8] = arg0.readUnsignedShort(-7689393);
							}
						}
					}
				} else if (arg1 == 4) {
					this.aBoolean9662 = false;
				}
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "aja.j(" + ')');
		}
	}

	public void method3450(Buffer arg0, int[] arg1, byte arg2) {
		try {
			if (this.anIntArray9659 != null) {
				for (int var4 = 0; var4 < this.anIntArray9659.length && var4 < arg1.length; var4++) {
					int var5 = this.method3452(var4, -1229205941).anInt4049;
					if (var5 > 0) {
						arg0.method3747((long) arg1[var4], var5, (byte) -103);
					}
				}
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "aja.i(" + ')');
		}
	}

	public String method3451(byte arg0) {
		try {
			StringBuilder var2 = new StringBuilder(80);
			if (this.aStringArray9660 == null) {
				return "";
			}
			var2.append(this.aStringArray9660[0]);
			for (int var3 = 1; var3 < this.aStringArray9660.length; var3++) {
				for (int var4 = 0; var4 < 3; var4++) {
					var2.append('.');
				}
				var2.append(this.aStringArray9660[var3]);
			}
			return var2.toString();
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aja.o(" + ')');
		}
	}

	public Class390 method3452(int arg0, int arg1) {
		try {
			return this.anIntArray9659 == null || arg0 < 0 || arg0 > this.anIntArray9659.length ? null : Class146.method1731(this.anIntArray9659[arg0], -1792326722);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aja.f(" + ')');
		}
	}

	public int method3453(int arg0, int arg1, byte arg2) {
		try {
			if (this.anIntArray9659 == null || arg0 < 0 || arg0 > this.anIntArray9659.length) {
				return -1;
			} else if (this.anIntArrayArray9658[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray9658[arg0].length) {
				return -1;
			} else {
				return this.anIntArrayArray9658[arg0][arg1];
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aja.z(" + ')');
		}
	}

	public void method3454(int arg0) {
		try {
			if (this.anIntArray9661 != null) {
				for (int var2 = 0; var2 < this.anIntArray9661.length; var2++) {
					this.anIntArray9661[var2] |= 0x8000;
				}
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aja.w(" + ')');
		}
	}

	public int method3455(int arg0) {
		try {
			return this.anIntArray9659 == null ? 0 : this.anIntArray9659.length;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aja.s(" + ')');
		}
	}

	public void method3456(Buffer arg0, byte arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(652498462);
				if (var3 == 0) {
					if (arg1 <= 0) {
					}
					return;
				}
				this.method3449(arg0, var3, (byte) 14);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aja.r(" + ')');
		}
	}

	public String method3457(Buffer arg0, int arg1) {
		try {
			StringBuilder var3 = new StringBuilder(80);
			if (this.anIntArray9659 != null) {
				for (int var4 = 0; var4 < this.anIntArray9659.length; var4++) {
					var3.append(this.aStringArray9660[var4]);
					var3.append(this.aClass523_9657.method6232(this.method3452(var4, -1161912705), this.anIntArrayArray9658[var4], arg0.method3759(Class146.method1731(this.anIntArray9659[var4], 1758375864).anInt4050, 1674049190)));
				}
			}
			var3.append(this.aStringArray9660[this.aStringArray9660.length - 1]);
			return var3.toString();
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aja.p(" + ')');
		}
	}
}
