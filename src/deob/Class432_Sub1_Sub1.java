package deob;

public abstract class Class432_Sub1_Sub1 extends Class432_Sub1 {

	public short aShort9922;

	public short aShort9920;

	public short aShort9921;

	public short aShort9923;

	public boolean aBoolean9924;

	public byte aByte9919;

	public int method5368(Class330_Sub14[] arg0, byte arg1) {
		try {
			int var3 = 0;
			int var4;
			int var5;
			int var10;
			label126: for (var4 = this.aShort9922; var4 <= this.aShort9920; var4++) {
				label124: for (var5 = this.aShort9921; var5 <= this.aShort9923; var5++) {
					long var6 = this.aClass356_8655.aLongArrayArrayArray3652[this.aByte8658][var4][var5];
					long var8 = 0L;
					while (true) {
						label119: while (true) {
							if (var8 > 48L) {
								continue label124;
							}
							var10 = (int) (var6 >>> (int) var8 & 0xFFFFL);
							if (var10 <= 0) {
								continue label124;
							}
							Class349 var11 = this.aClass356_8655.aClass349Array3679[var10 - 1];
							for (int var12 = 0; var12 < var3; var12++) {
								if (var11.aClass330_Sub14_3467 == arg0[var12]) {
									var8 += 16L;
									continue label119;
								}
							}
							arg0[var3++] = var11.aClass330_Sub14_3467;
							if (var3 == 4) {
								if (arg1 >= 12) {
									throw new IllegalStateException();
								}
								break label126;
							}
							var8 += 16L;
						}
					}
				}
			}
			for (var4 = var3; var4 < 4; var4++) {
				arg0[var4] = null;
			}
			if (this.aByte9919 != 0) {
				var4 = this.aShort9922 - this.aClass356_8655.anInt3640;
				var5 = this.aShort9921 - this.aClass356_8655.anInt3651;
				int var7;
				short var9;
				short var15;
				int var16;
				if (this.aByte9919 == 1) {
					if (var5 > var4) {
						var15 = this.aShort9922;
						var7 = this.aShort9921 - 1;
						var16 = this.aShort9922 + 1;
						var9 = this.aShort9921;
					} else {
						var15 = this.aShort9922;
						var7 = this.aShort9921 + 1;
						var16 = this.aShort9922 - 1;
						var9 = this.aShort9921;
					}
				} else if (var5 > -var4) {
					var15 = this.aShort9922;
					var7 = this.aShort9921 - 1;
					var16 = this.aShort9922 - 1;
					var9 = this.aShort9921;
				} else {
					var15 = this.aShort9922;
					var7 = this.aShort9921 + 1;
					var16 = this.aShort9922 + 1;
					var9 = this.aShort9921;
				}
				label90: for (var10 = 0; var10 < var3; var10++) {
					long var17 = this.aClass356_8655.aLongArrayArrayArray3652[this.aByte8658][var15][var7];
					Class349 var13;
					while (var17 != 0L) {
						var13 = this.aClass356_8655.aClass349Array3679[(int) ((var17 & 0xFFFFL) - 1L)];
						var17 >>>= 0x10;
						if (arg0[var10] == var13.aClass330_Sub14_3467) {
							if (arg1 >= 12) {
							}
							continue label90;
						}
					}
					var17 = this.aClass356_8655.aLongArrayArrayArray3652[this.aByte8658][var16][var9];
					while (var17 != 0L) {
						var13 = this.aClass356_8655.aClass349Array3679[(int) ((var17 & 0xFFFFL) - 1L)];
						var17 >>>= 0x10;
						if (arg0[var10] == var13.aClass330_Sub14_3467) {
							if (arg1 >= 12) {
							}
							continue label90;
						}
					}
					for (int var18 = var10; var18 < var3 - 1; var18++) {
						arg0[var18] = arg0[var18 + 1];
					}
					var3--;
				}
			}
			return var3;
		} catch (RuntimeException var14) {
			throw Class476.method5964(var14, "akb.fb(" + ')');
		}
	}

	public void method5406(int arg0) {
	}

	public boolean method5365(Class_ra arg0) {
		return this.aClass356_8655.aClass358_3649.method4227(this.aByte8654, this.aShort9922, this.aShort9920, this.aShort9921, this.aShort9923, this.method5383(arg0, -296919301));
	}

	public int method5398(Class330_Sub14[] arg0) {
		int var2 = 0;
		int var3;
		int var4;
		int var9;
		label116: for (var3 = this.aShort9922; var3 <= this.aShort9920; var3++) {
			label114: for (var4 = this.aShort9921; var4 <= this.aShort9923; var4++) {
				long var5 = this.aClass356_8655.aLongArrayArrayArray3652[this.aByte8658][var3][var4];
				long var7 = 0L;
				while (true) {
					label109: while (true) {
						if (var7 > 48L) {
							continue label114;
						}
						var9 = (int) (var5 >>> (int) var7 & 0xFFFFL);
						if (var9 <= 0) {
							continue label114;
						}
						Class349 var10 = this.aClass356_8655.aClass349Array3679[var9 - 1];
						for (int var11 = 0; var11 < var2; var11++) {
							if (var10.aClass330_Sub14_3467 == arg0[var11]) {
								var7 += 16L;
								continue label109;
							}
						}
						arg0[var2++] = var10.aClass330_Sub14_3467;
						if (var2 == 4) {
							break label116;
						}
						var7 += 16L;
					}
				}
			}
		}
		for (var3 = var2; var3 < 4; var3++) {
			arg0[var3] = null;
		}
		if (this.aByte9919 != 0) {
			var3 = this.aShort9922 - this.aClass356_8655.anInt3640 * 383801333 * 315907165;
			var4 = this.aShort9921 - this.aClass356_8655.anInt3651 * 2047960133 * 875564685;
			int var6;
			short var8;
			short var13;
			int var14;
			if (this.aByte9919 == 1) {
				if (var4 > var3) {
					var13 = this.aShort9922;
					var6 = this.aShort9921 - 1;
					var14 = this.aShort9922 + 1;
					var8 = this.aShort9921;
				} else {
					var13 = this.aShort9922;
					var6 = this.aShort9921 + 1;
					var14 = this.aShort9922 - 1;
					var8 = this.aShort9921;
				}
			} else if (var4 > -var3) {
				var13 = this.aShort9922;
				var6 = this.aShort9921 - 1;
				var14 = this.aShort9922 - 1;
				var8 = this.aShort9921;
			} else {
				var13 = this.aShort9922;
				var6 = this.aShort9921 + 1;
				var14 = this.aShort9922 + 1;
				var8 = this.aShort9921;
			}
			label80: for (var9 = 0; var9 < var2; var9++) {
				long var15 = this.aClass356_8655.aLongArrayArrayArray3652[this.aByte8658][var13][var6];
				Class349 var12;
				while (var15 != 0L) {
					var12 = this.aClass356_8655.aClass349Array3679[(int) ((var15 & 0xFFFFL) - 1L)];
					var15 >>>= 0x10;
					if (arg0[var9] == var12.aClass330_Sub14_3467) {
						continue label80;
					}
				}
				var15 = this.aClass356_8655.aLongArrayArrayArray3652[this.aByte8658][var14][var8];
				while (var15 != 0L) {
					var12 = this.aClass356_8655.aClass349Array3679[(int) ((var15 & 0xFFFFL) - 1L)];
					var15 >>>= 0x10;
					if (arg0[var9] == var12.aClass330_Sub14_3467) {
						continue label80;
					}
				}
				for (int var16 = var9; var16 < var2 - 1; var16++) {
					arg0[var16] = arg0[var16 + 1];
				}
				var2--;
			}
		}
		return var2;
	}

	public boolean method5372(Class_ra arg0, int arg1) {
		try {
			return this.aClass356_8655.aClass358_3649.method4227(this.aByte8654, this.aShort9922, this.aShort9920, this.aShort9921, this.aShort9923, this.method5383(arg0, -296919301));
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "akb.gb(" + ')');
		}
	}

	public boolean method5403() {
		for (int var1 = this.aShort9922; var1 <= this.aShort9920; var1++) {
			for (int var2 = this.aShort9921; var2 <= this.aShort9923; var2++) {
				int var3 = var1 - this.aClass356_8655.anInt3640 * 315907165 * 383801333 + this.aClass356_8655.anInt3673 * -139136607 * 316617313;
				if (var3 >= 0 && var3 < this.aClass356_8655.aBooleanArrayArray3700.length) {
					int var4 = var2 - this.aClass356_8655.anInt3651 * 2047960133 * 875564685 + this.aClass356_8655.anInt3673 * -139136607 * 316617313;
					if (var4 >= 0 && var4 < this.aClass356_8655.aBooleanArrayArray3700.length && this.aClass356_8655.aBooleanArrayArray3700[var3][var4]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public Class432_Sub1_Sub1(Class356 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, byte arg11) {
		super(arg0);
		this.aByte8658 = (byte) arg1;
		this.aByte8654 = (byte) arg2;
		this.method5349(new Class260((float) arg3, (float) arg4, (float) arg5));
		this.aShort9922 = (short) arg6;
		this.aShort9920 = (short) arg7;
		this.aShort9921 = (short) arg8;
		this.aShort9923 = (short) arg9;
		this.aBoolean9924 = arg10;
		this.aByte9919 = arg11;
	}

	public int method5399(Class330_Sub14[] arg0) {
		int var2 = 0;
		int var3;
		int var4;
		int var9;
		label116: for (var3 = this.aShort9922; var3 <= this.aShort9920; var3++) {
			label114: for (var4 = this.aShort9921; var4 <= this.aShort9923; var4++) {
				long var5 = this.aClass356_8655.aLongArrayArrayArray3652[this.aByte8658][var3][var4];
				long var7 = 0L;
				while (true) {
					label109: while (true) {
						if (var7 > 48L) {
							continue label114;
						}
						var9 = (int) (var5 >>> (int) var7 & 0xFFFFL);
						if (var9 <= 0) {
							continue label114;
						}
						Class349 var10 = this.aClass356_8655.aClass349Array3679[var9 - 1];
						for (int var11 = 0; var11 < var2; var11++) {
							if (var10.aClass330_Sub14_3467 == arg0[var11]) {
								var7 += 16L;
								continue label109;
							}
						}
						arg0[var2++] = var10.aClass330_Sub14_3467;
						if (var2 == 4) {
							break label116;
						}
						var7 += 16L;
					}
				}
			}
		}
		for (var3 = var2; var3 < 4; var3++) {
			arg0[var3] = null;
		}
		if (this.aByte9919 != 0) {
			var3 = this.aShort9922 - this.aClass356_8655.anInt3640 * 383801333 * 315907165;
			var4 = this.aShort9921 - this.aClass356_8655.anInt3651 * 2047960133 * 875564685;
			int var6;
			short var8;
			short var13;
			int var14;
			if (this.aByte9919 == 1) {
				if (var4 > var3) {
					var13 = this.aShort9922;
					var6 = this.aShort9921 - 1;
					var14 = this.aShort9922 + 1;
					var8 = this.aShort9921;
				} else {
					var13 = this.aShort9922;
					var6 = this.aShort9921 + 1;
					var14 = this.aShort9922 - 1;
					var8 = this.aShort9921;
				}
			} else if (var4 > -var3) {
				var13 = this.aShort9922;
				var6 = this.aShort9921 - 1;
				var14 = this.aShort9922 - 1;
				var8 = this.aShort9921;
			} else {
				var13 = this.aShort9922;
				var6 = this.aShort9921 + 1;
				var14 = this.aShort9922 + 1;
				var8 = this.aShort9921;
			}
			label80: for (var9 = 0; var9 < var2; var9++) {
				long var15 = this.aClass356_8655.aLongArrayArrayArray3652[this.aByte8658][var13][var6];
				Class349 var12;
				while (var15 != 0L) {
					var12 = this.aClass356_8655.aClass349Array3679[(int) ((var15 & 0xFFFFL) - 1L)];
					var15 >>>= 0x10;
					if (arg0[var9] == var12.aClass330_Sub14_3467) {
						continue label80;
					}
				}
				var15 = this.aClass356_8655.aLongArrayArrayArray3652[this.aByte8658][var14][var8];
				while (var15 != 0L) {
					var12 = this.aClass356_8655.aClass349Array3679[(int) ((var15 & 0xFFFFL) - 1L)];
					var15 >>>= 0x10;
					if (arg0[var9] == var12.aClass330_Sub14_3467) {
						continue label80;
					}
				}
				for (int var16 = var9; var16 < var2 - 1; var16++) {
					arg0[var16] = arg0[var16 + 1];
				}
				var2--;
			}
		}
		return var2;
	}

	public boolean method5400(Class_ra arg0) {
		return this.aClass356_8655.aClass358_3649.method4227(this.aByte8654, this.aShort9922, this.aShort9920, this.aShort9921, this.aShort9923, this.method5383(arg0, -296919301));
	}

	public boolean method5402(Class_ra arg0) {
		return this.aClass356_8655.aClass358_3649.method4227(this.aByte8654, this.aShort9922, this.aShort9920, this.aShort9921, this.aShort9923, this.method5383(arg0, -296919301));
	}

	public boolean method5367(byte arg0) {
		try {
			for (int var2 = this.aShort9922; var2 <= this.aShort9920; var2++) {
				for (int var3 = this.aShort9921; var3 <= this.aShort9923; var3++) {
					int var4 = var2 - this.aClass356_8655.anInt3640 + this.aClass356_8655.anInt3673;
					if (var4 >= 0) {
						if (var4 < this.aClass356_8655.aBooleanArrayArray3700.length) {
							int var5 = var3 - this.aClass356_8655.anInt3651 + this.aClass356_8655.anInt3673;
							if (var5 >= 0) {
								if (var5 >= this.aClass356_8655.aBooleanArrayArray3700.length) {
									if (arg0 >= 1) {
									}
								} else if (this.aClass356_8655.aBooleanArrayArray3700[var4][var5]) {
									return true;
								}
							}
						} else if (arg0 >= 1) {
							throw new IllegalStateException();
						}
					}
				}
			}
			return false;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "akb.gn(" + ')');
		}
	}

	public static final void method5407(Class430 arg0, short arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -957997072);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class162.method1912(var3, var4, arg0, 37711779);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "akb.iq(" + ')');
		}
	}
}
