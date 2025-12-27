package deob;

import java.util.Iterator;

public class Class325_Sub3_Sub1_Sub1 extends Class325_Sub3_Sub1 {

	public Class406 aClass406_10127;

	public short aShort10123;

	public short aShort10120;

	public short aShort10126;

	public short aShort10122;

	public short aShort10128;

	public int anInt10125;

	public int anInt10124;

	public short aShort10121;

	public void method3217() {
		int var1 = this.aClass406_10127.aClass388_4177.anInt3995;
		if (this.aClass406_10127.aClass388_4177.aClass325_Sub3_Sub1_Sub1Array3994[var1] != null) {
			this.aClass406_10127.aClass388_4177.aClass325_Sub3_Sub1_Sub1Array3994[var1].method3221();
		}
		this.aClass406_10127.aClass388_4177.aClass325_Sub3_Sub1_Sub1Array3994[var1] = this;
		this.aShort10121 = (short) this.aClass406_10127.aClass388_4177.anInt3995;
		this.aClass406_10127.aClass388_4177.anInt3995 = var1 + 1 & 0x1FFF;
		this.aClass406_10127.aClass467_4179.method5852(this, (byte) 1);
	}

	public void method3218(Class406 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
		this.aClass406_10127 = arg0;
		this.anInt9497 = arg1 << 12;
		this.anInt9493 = arg2 << 12;
		this.anInt9489 = arg3 << 12;
		this.anInt9490 = arg9;
		this.aShort10120 = this.aShort10123 = (short) arg8;
		this.anInt9494 = arg10;
		this.anInt9492 = arg11;
		this.aBoolean9496 = arg13;
		this.aShort10126 = (short) arg4;
		this.aShort10122 = (short) arg5;
		this.aShort10128 = (short) arg6;
		this.anInt10125 = arg7;
		this.aByte9488 = this.aClass406_10127.aClass93_4178.aByte834;
		this.method3217();
	}

	public void method3219(long arg0, int arg1) {
		this.aShort10123 = (short) (this.aShort10123 - arg1);
		if (this.aShort10123 <= 0) {
			this.method3221();
			return;
		}
		int var4 = this.anInt9497 >> 12;
		int var5 = this.anInt9493 >> 12;
		int var6 = this.anInt9489 >> 12;
		Class388 var7 = this.aClass406_10127.aClass388_4177;
		Class210 var8 = this.aClass406_10127.aClass210_4176;
		if (var8.anInt2044 != 0) {
			int var9;
			if (this.aShort10120 - this.aShort10123 <= var8.anInt2022) {
				var9 = (this.anInt9490 >> 8 & 0xFF00) + (this.anInt10124 >> 16 & 0xFF) + var8.anInt2042 * arg1;
				int var10 = (this.anInt9490 & 0xFF00) + (this.anInt10124 >> 8 & 0xFF) + var8.anInt2051 * arg1;
				int var11 = ((this.anInt9490 & 0xFF) << 8) + (this.anInt10124 & 0xFF) + var8.anInt2052 * arg1;
				if (var9 < 0) {
					var9 = 0;
				} else if (var9 > 65535) {
					var9 = 65535;
				}
				if (var10 < 0) {
					var10 = 0;
				} else if (var10 > 65535) {
					var10 = 65535;
				}
				if (var11 < 0) {
					var11 = 0;
				} else if (var11 > 65535) {
					var11 = 65535;
				}
				this.anInt9490 &= 0xFF000000;
				this.anInt9490 |= ((var9 & 0xFF00) << 8) + (var10 & 0xFF00) + (var11 >> 8 & 0xFF);
				this.anInt10124 &= 0xFF000000;
				this.anInt10124 |= ((var9 & 0xFF) << 16) + ((var10 & 0xFF) << 8) + (var11 & 0xFF);
			}
			if (this.aShort10120 - this.aShort10123 <= var8.anInt2023) {
				var9 = (this.anInt9490 >> 16 & 0xFF00) + (this.anInt10124 >> 24 & 0xFF) + var8.anInt1989 * arg1;
				if (var9 < 0) {
					var9 = 0;
				} else if (var9 > 65535) {
					var9 = 65535;
				}
				this.anInt9490 &= 0xFFFFFF;
				this.anInt9490 |= (var9 & 0xFF00) << 16;
				this.anInt10124 &= 0xFFFFFF;
				this.anInt10124 |= (var9 & 0xFF) << 24;
			}
		}
		if (var8.anInt1999 != -1 && this.aShort10120 - this.aShort10123 <= var8.anInt2054) {
			this.anInt10125 += var8.anInt2055 * arg1;
		}
		if (var8.anInt2024 != -1 && this.aShort10120 - this.aShort10123 <= var8.anInt2056) {
			this.anInt9494 += var8.anInt2057 * arg1;
		}
		double var40 = (double) this.aShort10126;
		double var41 = (double) this.aShort10122;
		double var13 = (double) this.aShort10128;
		boolean var15 = false;
		int var16;
		int var17;
		int var18;
		int var19;
		long var20;
		if (var8.anInt1997 == 1) {
			var16 = var4 - this.aClass406_10127.aClass405_4182.anInt4165;
			var17 = var5 - this.aClass406_10127.aClass405_4182.anInt4173;
			var18 = var6 - this.aClass406_10127.aClass405_4182.anInt4169;
			var19 = (int) Math.sqrt((double) (var16 * var16 + var17 * var17 + var18 * var18)) >> 2;
			var20 = var8.anInt1998 * var19 * arg1;
			this.anInt10125 = (int) ((long) this.anInt10125 - ((long) this.anInt10125 * var20 >> 18));
		} else if (var8.anInt1997 == 2) {
			var16 = var4 - this.aClass406_10127.aClass405_4182.anInt4165;
			var17 = var5 - this.aClass406_10127.aClass405_4182.anInt4173;
			var18 = var6 - this.aClass406_10127.aClass405_4182.anInt4169;
			var19 = var16 * var16 + var17 * var17 + var18 * var18;
			var20 = var8.anInt1998 * var19 * arg1;
			this.anInt10125 = (int) ((long) this.anInt10125 - ((long) this.anInt10125 * var20 >> 28));
		}
		Class330_Sub21 var43;
		Class208 var44;
		if (var8.anIntArray2016 != null) {
			Iterator var42 = var7.aList4000.iterator();
			label214: while (true) {
				do {
					if (!var42.hasNext()) {
						break label214;
					}
					var43 = (Class330_Sub21) var42.next();
					var44 = var43.aClass208_7685;
				} while (var44.anInt1968 == 1);
				boolean var46 = false;
				for (int var47 = 0; var47 < var8.anIntArray2016.length; var47++) {
					if (var8.anIntArray2016[var47] == var44.anInt1967) {
						var46 = true;
						break;
					}
				}
				if (var46) {
					double var49 = (double) (var4 - var43.anInt7686);
					double var22 = (double) (var5 - var43.anInt7687);
					double var24 = (double) (var6 - var43.anInt7689);
					double var26 = var49 * var49 + var22 * var22 + var24 * var24;
					if (!(var26 > (double) var44.aLong1978)) {
						double var28 = Math.sqrt(var26);
						if (var28 == 0.0D) {
							var28 = 1.0D;
						}
						double var30 = (var49 * (double) var43.aFloat7684 + var22 * (double) var44.anInt1953 + var24 * (double) var43.aFloat7688) * 65535.0D / ((double) var44.anInt1962 * var28);
						if (!(var30 < (double) var44.anInt1980)) {
							double var32 = 0.0D;
							if (var44.anInt1959 == 1) {
								var32 = var28 / 16.0D * (double) var44.anInt1974;
							} else if (var44.anInt1959 == 2) {
								var32 = var28 / 16.0D * (var28 / 16.0D) * (double) var44.anInt1974;
							}
							if (var44.anInt1976 != 0) {
								double var34 = var49 / var28 * (double) var44.anInt1962;
								double var36 = var22 / var28 * (double) var44.anInt1962;
								double var38 = var24 / var28 * (double) var44.anInt1962;
								if (var44.anInt1965 == 0) {
									var40 += var34 * (double) arg1;
									var41 += var36 * (double) arg1;
									var13 += var38 * (double) arg1;
									var15 = true;
								} else {
									this.anInt9497 = (int) ((double) this.anInt9497 + var34 * (double) arg1);
									this.anInt9493 = (int) ((double) this.anInt9493 + var36 * (double) arg1);
									this.anInt9489 = (int) ((double) this.anInt9489 + var38 * (double) arg1);
								}
							} else if (var44.anInt1965 == 0) {
								var40 += ((double) var43.aFloat7684 - var32) * (double) arg1;
								var41 += ((double) var44.anInt1953 - var32) * (double) arg1;
								var13 += ((double) var43.aFloat7688 - var32) * (double) arg1;
								var15 = true;
							} else {
								this.anInt9497 = (int) ((double) this.anInt9497 + ((double) var43.aFloat7684 - var32) * (double) arg1);
								this.anInt9493 = (int) ((double) this.anInt9493 + ((double) var44.anInt1953 - var32) * (double) arg1);
								this.anInt9489 = (int) ((double) this.anInt9489 + ((double) var43.aFloat7688 - var32) * (double) arg1);
							}
						}
					}
				}
			}
		}
		if (var8.anIntArray2017 != null) {
			for (var16 = 0; var16 < var8.anIntArray2017.length; var16++) {
				var43 = (Class330_Sub21) Class391.aClass497_4062.method6094((long) var8.anIntArray2017[var16]);
				while (var43 != null) {
					var44 = var43.aClass208_7685;
					double var48 = (double) (var4 - var43.anInt7686);
					double var21 = (double) (var5 - var43.anInt7687);
					double var23 = (double) (var6 - var43.anInt7689);
					double var25 = var48 * var48 + var21 * var21 + var23 * var23;
					if (var25 > (double) var44.aLong1978) {
						var43 = (Class330_Sub21) Class391.aClass497_4062.method6095(1390003649);
					} else {
						double var27 = Math.sqrt(var25);
						if (var27 == 0.0D) {
							var27 = 1.0D;
						}
						double var29 = (var48 * (double) var43.aFloat7684 + var21 * (double) var44.anInt1953 + var23 * (double) var43.aFloat7688) * 65535.0D / ((double) var44.anInt1962 * var27);
						if (var29 < (double) var44.anInt1980) {
							var43 = (Class330_Sub21) Class391.aClass497_4062.method6095(101274128);
						} else {
							double var31 = 0.0D;
							if (var44.anInt1959 == 1) {
								var31 = var27 / 16.0D * (double) var44.anInt1974;
							} else if (var44.anInt1959 == 2) {
								var31 = var27 / 16.0D * (var27 / 16.0D) * (double) var44.anInt1974;
							}
							if (var44.anInt1976 != 0) {
								double var33 = var48 / var27 * (double) var44.anInt1962;
								double var35 = var21 / var27 * (double) var44.anInt1962;
								double var37 = var23 / var27 * (double) var44.anInt1962;
								if (var44.anInt1965 == 0) {
									var40 += var33 * (double) arg1;
									var41 += var35 * (double) arg1;
									var13 += var37 * (double) arg1;
									var15 = true;
								} else {
									this.anInt9497 = (int) ((double) this.anInt9497 + var33 * (double) arg1);
									this.anInt9493 = (int) ((double) this.anInt9493 + var35 * (double) arg1);
									this.anInt9489 = (int) ((double) this.anInt9489 + var37 * (double) arg1);
								}
							} else if (var44.anInt1965 == 0) {
								var40 += ((double) var43.aFloat7684 - var31) * (double) arg1;
								var41 += ((double) var44.anInt1953 - var31) * (double) arg1;
								var13 += ((double) var43.aFloat7688 - var31) * (double) arg1;
								var15 = true;
							} else {
								this.anInt9497 = (int) ((double) this.anInt9497 + ((double) var43.aFloat7684 - var31) * (double) arg1);
								this.anInt9493 = (int) ((double) this.anInt9493 + ((double) var44.anInt1953 - var31) * (double) arg1);
								this.anInt9489 = (int) ((double) this.anInt9489 + ((double) var43.aFloat7688 - var31) * (double) arg1);
							}
							var43 = (Class330_Sub21) Class391.aClass497_4062.method6095(1220121017);
						}
					}
				}
			}
		}
		if (var8.anIntArray2018 != null) {
			if (var8.anIntArray2019 == null) {
				var8.anIntArray2019 = new int[var8.anIntArray2018.length];
				for (var16 = 0; var16 < var8.anIntArray2018.length; var16++) {
					Class539.method6326(var8.anIntArray2018[var16], -40784406);
					var8.anIntArray2019[var16] = ((Class330_Sub23) Class208.aClass497_1964.method6094((long) var8.anIntArray2018[var16])).anInt7693;
				}
			}
			for (var16 = 0; var16 < var8.anIntArray2019.length; var16++) {
				Class208 var45 = Class208.aClass208Array1963[var8.anIntArray2019[var16]];
				if (var45.anInt1965 == 0) {
					var40 += var45.anInt1970 * arg1;
					var41 += var45.anInt1953 * arg1;
					var13 += var45.anInt1972 * arg1;
					var15 = true;
				} else {
					this.anInt9497 += var45.anInt1970 * arg1;
					this.anInt9493 += var45.anInt1953 * arg1;
					this.anInt9489 += var45.anInt1972 * arg1;
				}
			}
		}
		if (var15) {
			while (true) {
				if (!(var40 > 32767.0D) && !(var41 > 32767.0D) && !(var13 > 32767.0D) && !(var40 < -32767.0D) && !(var41 < -32767.0D) && !(var13 < -32767.0D)) {
					this.aShort10126 = (short) var40;
					this.aShort10122 = (short) var41;
					this.aShort10128 = (short) var13;
					break;
				}
				var40 /= 2.0D;
				var41 /= 2.0D;
				var13 /= 2.0D;
				this.anInt10125 <<= 0x1;
			}
		}
		this.anInt9497 = (int) ((long) this.anInt9497 + ((long) this.aShort10126 * (long) (this.anInt10125 << 2) >> 23) * (long) arg1);
		this.anInt9493 = (int) ((long) this.anInt9493 + ((long) this.aShort10122 * (long) (this.anInt10125 << 2) >> 23) * (long) arg1);
		this.anInt9489 = (int) ((long) this.anInt9489 + ((long) this.aShort10128 * (long) (this.anInt10125 << 2) >> 23) * (long) arg1);
	}

	public void method3220(Class356 arg0, Class_ra arg1, long arg2) {
		int var5 = this.anInt9497 >> arg0.anInt3641 + 12;
		int var6 = this.anInt9489 >> arg0.anInt3641 + 12;
		int var7 = this.anInt9493 >> 12;
		if (var7 > 262144 || var7 < -262144 || var5 < 0 || var5 >= arg0.anInt3667 || var6 < 0 || var6 >= arg0.anInt3654) {
			this.method3221();
			return;
		}
		Class388 var8 = this.aClass406_10127.aClass388_4177;
		Class210 var9 = this.aClass406_10127.aClass210_4176;
		Class_xa[] var10 = arg0.aClass_xaArray3676;
		int var11 = var8.anInt4004;
		Class340 var12 = arg0.aClass340ArrayArrayArray3653[var8.anInt4004][var5][var6];
		if (var12 != null) {
			var11 = var12.aByte3381;
		}
		int var13 = var10[var11].method6417(var5, var6, 1230044336);
		int var14;
		if (var11 < arg0.anInt3650 - 1) {
			var14 = var10[var11 + 1].method6417(var5, var6, 1604783685);
		} else {
			var14 = var13 - (0x8 << arg0.anInt3641);
		}
		if (var9.aBoolean2035) {
			if (var9.anInt2021 == -1 && var7 > var13) {
				this.method3221();
				return;
			}
			if (var9.anInt2021 >= 0 && var7 > var10[var9.anInt2021].method6417(var5, var6, 1362596885)) {
				this.method3221();
				return;
			}
			if (var9.anInt2053 == -1 && var7 < var14) {
				this.method3221();
				return;
			}
			if (var9.anInt2053 >= 0 && var7 < var10[var9.anInt2053 + 1].method6417(var5, var6, 218365687)) {
				this.method3221();
				return;
			}
		}
		int var15;
		for (var15 = arg0.anInt3650 - 1; var15 > 0 && var7 > var10[var15].method6417(var5, var6, 326686185); var15--) {
		}
		if (var9.aBoolean2034 && var15 == 0 && var7 > var10[0].method6417(var5, var6, 880417465)) {
			this.method3221();
		} else if (var15 == arg0.anInt3650 - 1 && var10[var15].method6417(var5, var6, 152523206) - var7 > 0x8 << arg0.anInt3641) {
			this.method3221();
		} else {
			var12 = arg0.aClass340ArrayArrayArray3653[var15][var5][var6];
			int var17;
			if (var12 == null) {
				if (var15 == 0 || arg0.aClass340ArrayArrayArray3653[0][var5][var6] == null) {
					var12 = arg0.aClass340ArrayArrayArray3653[0][var5][var6] = new Class340(0);
				}
				boolean var16 = arg0.aClass340ArrayArrayArray3653[0][var5][var6].aClass340_3380 != null;
				if (var15 == 3 && var16) {
					this.method3221();
					return;
				}
				for (var17 = 1; var17 <= var15; var17++) {
					if (arg0.aClass340ArrayArrayArray3653[var17][var5][var6] == null) {
						var12 = arg0.aClass340ArrayArrayArray3653[var17][var5][var6] = new Class340(var17);
						if (var16) {
							var12.aByte3381++;
						}
					}
				}
			}
			if (var9.aBoolean2026) {
				int var20 = this.anInt9497 >> 12;
				var17 = this.anInt9489 >> 12;
				Class348 var18;
				if (var12.aClass432_Sub1_Sub5_3382 != null) {
					var18 = var12.aClass432_Sub1_Sub5_3382.method5383(arg1, -296919301);
					if (var18 != null && var18.method4019(var20, var7, var17)) {
						this.method3221();
						return;
					}
				}
				if (var12.aClass432_Sub1_Sub5_3383 != null) {
					var18 = var12.aClass432_Sub1_Sub5_3383.method5383(arg1, -296919301);
					if (var18 != null && var18.method4019(var20, var7, var17)) {
						this.method3221();
						return;
					}
				}
				if (var12.aClass432_Sub1_Sub4_3386 != null) {
					var18 = var12.aClass432_Sub1_Sub4_3386.method5383(arg1, -296919301);
					if (var18 != null && var18.method4019(var20, var7, var17)) {
						this.method3221();
						return;
					}
				}
				for (Class352 var21 = var12.aClass352_3388; var21 != null; var21 = var21.aClass352_3483) {
					Class348 var19 = var21.aClass432_Sub1_Sub1_3484.method5383(arg1, -296919301);
					if (var19 != null && var19.method4019(var20, var7, var17)) {
						this.method3221();
						return;
					}
				}
			}
			var8.aClass81_3996.aClass461_675.method5693(this, -56061671);
		}
	}

	public Class325_Sub3_Sub1_Sub1(Class406 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
		this.aClass406_10127 = arg0;
		this.anInt9497 = arg1 << 12;
		this.anInt9493 = arg2 << 12;
		this.anInt9489 = arg3 << 12;
		this.anInt9490 = arg9;
		this.aShort10120 = this.aShort10123 = (short) arg8;
		this.anInt9494 = arg10;
		this.anInt9492 = arg11;
		this.aBoolean9496 = arg13;
		this.aShort10126 = (short) arg4;
		this.aShort10122 = (short) arg5;
		this.aShort10128 = (short) arg6;
		this.anInt10125 = arg7;
		this.aByte9488 = this.aClass406_10127.aClass93_4178.aByte834;
		this.method3217();
	}

	public void method3221() {
		this.aClass406_10127.aClass388_4177.aClass325_Sub3_Sub1_Sub1Array3994[this.aShort10121] = null;
		Class391.aClass325_Sub3_Sub1_Sub1Array4052[Class391.anInt4055] = this;
		Class391.anInt4055 = Class391.anInt4055 + 1 & 0x3FF;
		this.method3204(364680980);
		this.method3216((byte) -74);
	}
}
