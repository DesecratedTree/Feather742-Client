package deob;

import java.nio.ByteBuffer;

public class Class182 {

	public boolean aBoolean1794 = true;

	public int anInt1797 = -1;

	public Class_ra_Sub2 aClass_ra_Sub2_1792;

	public Class183 aClass183_1799;

	public int anInt1790;

	public int anInt1791;

	public int anInt1802;

	public int anInt1801;

	public Interface9_Impl2 anInterface9_Impl2_1796;

	public int anInt1798;

	public Interface11_Impl3 anInterface11_Impl3_1793;

	public static int anInt1795 = 7;

	public static int anInt1800 = 128;

	public byte[] aByteArray1804;

	public int[] anIntArray1803;

	public Class182(Class_ra_Sub2 arg0, Class183 arg1, Class_xa_Sub2 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		this.aClass_ra_Sub2_1792 = arg0;
		this.aClass183_1799 = arg1;
		this.anInt1790 = arg6;
		this.anInt1791 = arg7;
		int var9 = 0x1 << arg5;
		int var10 = 0;
		int var11 = arg3 << arg5;
		int var12 = arg4 << arg5;
		int var14;
		int var15;
		for (int var13 = 0; var13 < var9; var13++) {
			var14 = (var12 + var13) * arg2.anInt6397 + var11;
			for (var15 = 0; var15 < var9; var15++) {
				short[] var16 = arg2.aShortArrayArray8798[var14++];
				if (var16 != null) {
					var10 += var16.length;
				}
			}
		}
		if (var10 > 0) {
			this.anInt1802 = Integer.MIN_VALUE;
			this.anInt1801 = Integer.MAX_VALUE;
			this.anInterface9_Impl2_1796 = this.aClass_ra_Sub2_1792.method4975(false);
			this.anInterface9_Impl2_1796.method148(var10);
			ByteBuffer var20 = this.aClass_ra_Sub2_1792.aByteBuffer8458;
			var20.clear();
			for (var14 = 0; var14 < var9; var14++) {
				var15 = (var12 + var14) * arg2.anInt6397 + var11;
				for (int var21 = 0; var21 < var9; var21++) {
					short[] var17 = arg2.aShortArrayArray8798[var15++];
					if (var17 != null) {
						for (int var18 = 0; var18 < var17.length; var18++) {
							int var19 = var17[var18] & 0xFFFF;
							if (var19 < this.anInt1801) {
								this.anInt1801 = var19;
							}
							if (var19 > this.anInt1802) {
								this.anInt1802 = var19;
							}
							var20.putShort((short) var19);
						}
					}
				}
			}
			this.anInterface9_Impl2_1796.method97(0, var20.position(), this.aClass_ra_Sub2_1792.aLong8459);
			this.anInt1798 = var10 / 3;
		} else {
			this.anInt1798 = 0;
			this.anInterface11_Impl3_1793 = null;
		}
	}

	public void method2063(Class140 arg0) {
		this.method2064(arg0, this.anInterface9_Impl2_1796, 0, this.anInt1798);
	}

	public void method2064(Class140 arg0, Interface9_Impl2 arg1, int arg2, int arg3) {
		if (arg3 <= 0) {
			return;
		}
		this.method2065();
		this.aClass_ra_Sub2_1792.method4979(arg1);
		arg0.anInterface11_Impl3_1540 = this.anInterface11_Impl3_1793;
		arg0.anInt1555 = this.anInt1801;
		arg0.anInt1556 = this.anInt1802 - this.anInt1801 + 1;
		arg0.anInt1557 = arg2;
		arg0.anInt1552 = arg3;
		arg0.method1619(false);
	}

	public void method2065() {
		if (!this.aBoolean1794) {
			return;
		}
		this.aBoolean1794 = false;
		byte[] var1 = this.aClass183_1799.aByteArray1809;
		int var2 = 0;
		int var3 = this.aClass183_1799.anInt1807;
		int var4 = this.anInt1790 + this.anInt1791 * this.aClass183_1799.anInt1807;
		int var5;
		for (var5 = -128; var5 < 0; var5++) {
			var2 = (var2 << 8) - var2;
			for (int var6 = -128; var6 < 0; var6++) {
				if (var1[var4++] != 0) {
					var2++;
				}
			}
			var4 += var3 - 128;
		}
		if (this.anInterface11_Impl3_1793 != null && this.anInt1797 == var2) {
			this.aBoolean1794 = false;
			return;
		}
		this.anInt1797 = var2;
		var5 = 0;
		var4 = this.anInt1790 + this.anInt1791 * var3;
		int var7;
		int var8;
		int var9;
		if (!this.aClass_ra_Sub2_1792.method5006(Class72.aClass72_611, Class86.aClass86_714)) {
			if (this.anIntArray1803 == null) {
				this.anIntArray1803 = new int[16384];
			}
			int[] var11 = this.anIntArray1803;
			for (var7 = -128; var7 < 0; var7++) {
				for (var8 = -128; var8 < 0; var8++) {
					if (var1[var4] == 0) {
						var9 = 0;
						if (var1[var4 - 1] != 0) {
							var9++;
						}
						if (var1[var4 + 1] != 0) {
							var9++;
						}
						if (var1[var4 - var3] != 0) {
							var9++;
						}
						if (var1[var4 + var3] != 0) {
							var9++;
						}
						var11[var5++] = var9 * 17 << 24;
					} else {
						var11[var5++] = 1140850688;
					}
					var4++;
				}
				var4 += this.aClass183_1799.anInt1807 - 128;
			}
			if (this.anInterface11_Impl3_1793 == null) {
				this.anInterface11_Impl3_1793 = this.aClass_ra_Sub2_1792.method4944(128, 128, false, this.anIntArray1803);
				this.anInterface11_Impl3_1793.method109(false, false);
			} else {
				this.anInterface11_Impl3_1793.method118(0, 0, 128, 128, this.anIntArray1803, 0, 128);
			}
			return;
		}
		if (this.aByteArray1804 == null) {
			this.aByteArray1804 = new byte[16384];
		}
		byte[] var10 = this.aByteArray1804;
		for (var7 = -128; var7 < 0; var7++) {
			for (var8 = -128; var8 < 0; var8++) {
				if (var1[var4] == 0) {
					var9 = 0;
					if (var1[var4 - 1] != 0) {
						var9++;
					}
					if (var1[var4 + 1] != 0) {
						var9++;
					}
					if (var1[var4 - var3] != 0) {
						var9++;
					}
					if (var1[var4 + var3] != 0) {
						var9++;
					}
					var10[var5++] = (byte) (var9 * 17);
				} else {
					var10[var5++] = 68;
				}
				var4++;
			}
			var4 += this.aClass183_1799.anInt1807 - 128;
		}
		if (this.anInterface11_Impl3_1793 == null) {
			this.anInterface11_Impl3_1793 = this.aClass_ra_Sub2_1792.method4945(Class72.aClass72_611, 128, 128, false, this.aByteArray1804);
			this.anInterface11_Impl3_1793.method109(false, false);
		} else {
			this.anInterface11_Impl3_1793.method117(0, 0, 128, 128, this.aByteArray1804, Class72.aClass72_611, 0, 128);
		}
	}
}
