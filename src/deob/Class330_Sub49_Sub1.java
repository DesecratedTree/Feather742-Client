package deob;

public class Class330_Sub49_Sub1 extends Class330_Sub49 {

	public static int anInt9841 = 4;

	public static int anInt9843 = 4;

	public static int anInt9844 = 0;

	public static int anInt9848 = 1638;

	public static boolean aBoolean9854 = true;

	public static int anInt9855 = 8;

	public byte[] aByteArray9842 = new byte[512];

	public int anInt9849 = 0;

	public int anInt9850 = 4;

	public int anInt9851 = 4;

	public int anInt9852 = 4;

	public int anInt9846 = 1638;

	public boolean aBoolean9853 = true;

	public short[] aShortArray9845;

	public short[] aShortArray9847;

	public Class330_Sub49_Sub1() {
		super(0, true);
	}

	public void method3849(int arg0, int[] arg1, byte arg2) {
		try {
			int var4 = Class511.anIntArray5954[arg0] * this.anInt9851;
			short var5;
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var13;
			int var14;
			int var15;
			int var16;
			int var17;
			if (this.anInt9852 == 1) {
				var5 = this.aShortArray9845[0];
				var6 = this.aShortArray9847[0] << 12;
				var7 = var6 * this.anInt9851 >> 12;
				var8 = this.anInt9850 * var6 >> 12;
				var9 = var6 * var4 >> 12;
				var10 = var9 >> 12;
				var11 = var10 + 1;
				if (var11 >= var7) {
					var11 = 0;
				}
				var9 &= 0xFFF;
				var12 = Class223.anIntArray2362[var9];
				var13 = this.aByteArray9842[var10 & 0xFF] & 0xFF;
				var14 = this.aByteArray9842[var11 & 0xFF] & 0xFF;
				if (this.aBoolean9853) {
					for (var15 = 0; var15 < Class511.anInt5948; var15++) {
						var16 = this.anInt9850 * Class511.anIntArray5949[var15];
						var17 = this.method3852(var6 * var16 >> 12, var9, var13, var14, var12, var8, 570450423);
						int var20 = var5 * var17 >> 12;
						arg1[var15] = (var20 >> 1) + 2048;
					}
				} else {
					for (var15 = 0; var15 < Class511.anInt5948; var15++) {
						var16 = this.anInt9850 * Class511.anIntArray5949[var15];
						var17 = this.method3852(var6 * var16 >> 12, var9, var13, var14, var12, var8, 1736448918);
						arg1[var15] = var5 * var17 >> 12;
					}
				}
			} else {
				var5 = this.aShortArray9845[0];
				if (var5 > 8 || var5 < -8) {
					var6 = this.aShortArray9847[0] << 12;
					var7 = this.anInt9851 * var6 >> 12;
					var8 = this.anInt9850 * var6 >> 12;
					var9 = var4 * var6 >> 12;
					var10 = var9 >> 12;
					var11 = var10 + 1;
					if (var11 >= var7) {
						var11 = 0;
					}
					var9 &= 0xFFF;
					var12 = Class223.anIntArray2362[var9];
					var13 = this.aByteArray9842[var10 & 0xFF] & 0xFF;
					var14 = this.aByteArray9842[var11 & 0xFF] & 0xFF;
					for (var15 = 0; var15 < Class511.anInt5948; var15++) {
						var16 = this.anInt9850 * Class511.anIntArray5949[var15];
						var17 = this.method3852(var16 * var6 >> 12, var9, var13, var14, var12, var8, 1315923484);
						arg1[var15] = var17 * var5 >> 12;
					}
				}
				for (var6 = 1; var6 < this.anInt9852; var6++) {
					var5 = this.aShortArray9845[var6];
					if (var5 > 8 || var5 < -8) {
						var7 = this.aShortArray9847[var6] << 12;
						var8 = this.anInt9851 * var7 >> 12;
						var9 = this.anInt9850 * var7 >> 12;
						var10 = var7 * var4 >> 12;
						var11 = var10 >> 12;
						var12 = var11 + 1;
						if (var12 >= var8) {
							var12 = 0;
						}
						var10 &= 0xFFF;
						var13 = Class223.anIntArray2362[var10];
						var14 = this.aByteArray9842[var11 & 0xFF] & 0xFF;
						var15 = this.aByteArray9842[var12 & 0xFF] & 0xFF;
						int var18;
						if (this.aBoolean9853 && var6 == this.anInt9852 - 1) {
							for (var16 = 0; var16 < Class511.anInt5948; var16++) {
								var17 = Class511.anIntArray5949[var16] * this.anInt9850;
								var18 = this.method3852(var17 * var7 >> 12, var10, var14, var15, var13, var9, 466053670);
								var18 = arg1[var16] + (var18 * var5 >> 12);
								arg1[var16] = (var18 >> 1) + 2048;
							}
						} else {
							for (var16 = 0; var16 < Class511.anInt5948; var16++) {
								var17 = Class511.anIntArray5949[var16] * this.anInt9850;
								var18 = this.method3852(var17 * var7 >> 12, var10, var14, var15, var13, var9, 1322077465);
								arg1[var16] += var18 * var5 >> 12;
							}
						}
					}
				}
			}
		} catch (RuntimeException var19) {
			throw Class476.method5964(var19, "ajv.r(" + ')');
		}
	}

	public void method3850(int arg0) {
		try {
			this.aByteArray9842 = Class511.method6176(this.anInt9849, (byte) -53);
			this.method3851((byte) 1);
			for (int var2 = this.anInt9852 - 1; var2 >= 1; var2--) {
				short var3 = this.aShortArray9845[var2];
				if (var3 > 8 || var3 < -8) {
					break;
				}
				this.anInt9852--;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ajv.i(" + ')');
		}
	}

	public void method3851(byte arg0) {
		try {
			int var2;
			if (this.anInt9846 > 0) {
				this.aShortArray9845 = new short[this.anInt9852];
				this.aShortArray9847 = new short[this.anInt9852];
				for (var2 = 0; var2 < this.anInt9852; var2++) {
					this.aShortArray9845[var2] = (short) (Math.pow((double) ((float) this.anInt9846 / 4096.0F), (double) var2) * 4096.0D);
					this.aShortArray9847[var2] = (short) Math.pow(2.0D, (double) var2);
				}
			} else if (this.aShortArray9845 != null && this.aShortArray9845.length == this.anInt9852) {
				this.aShortArray9847 = new short[this.anInt9852];
				for (var2 = 0; var2 < this.anInt9852; var2++) {
					this.aShortArray9847[var2] = (short) Math.pow(2.0D, (double) var2);
				}
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ajv.p(" + ')');
		}
	}

	public int method3852(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		try {
			int var8 = arg0 >> 12;
			int var9 = var8 + 1;
			if (var9 >= arg5) {
				var9 = 0;
			}
			int var19 = arg0 & 0xFFF;
			var8 &= 0xFF;
			var9 &= 0xFF;
			int var10 = var19 - 4096;
			int var11 = arg1 - 4096;
			int var12 = Class223.anIntArray2362[var19];
			int var13 = this.aByteArray9842[var8 + arg2] & 0x3;
			int var14;
			if (var13 <= 1) {
				var14 = var13 == 0 ? arg1 + var19 : arg1 - var19;
			} else {
				var14 = var13 == 2 ? var19 - arg1 : -var19 - arg1;
			}
			var13 = this.aByteArray9842[var9 + arg2] & 0x3;
			int var15;
			if (var13 <= 1) {
				var15 = var13 == 0 ? arg1 + var10 : arg1 - var10;
			} else {
				var15 = var13 == 2 ? var10 - arg1 : -var10 - arg1;
			}
			int var16 = (var12 * (var15 - var14) >> 12) + var14;
			var13 = this.aByteArray9842[arg3 + var8] & 0x3;
			if (var13 <= 1) {
				var14 = var13 == 0 ? var19 + var11 : var11 - var19;
			} else {
				var14 = var13 == 2 ? var19 - var11 : -var19 - var11;
			}
			var13 = this.aByteArray9842[arg3 + var9] & 0x3;
			if (var13 <= 1) {
				var15 = var13 == 0 ? var11 + var10 : var11 - var10;
			} else {
				var15 = var13 == 2 ? var10 - var11 : -var10 - var11;
			}
			int var17 = ((var15 - var14) * var12 >> 12) + var14;
			return var16 + ((var17 - var16) * arg4 >> 12);
		} catch (RuntimeException var18) {
			throw Class476.method5964(var18, "ajv.j(" + ')');
		}
	}
}
