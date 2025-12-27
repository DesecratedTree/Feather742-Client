package deob;

public class Class406 {

	public int anInt4193 = 0;

	public boolean aBoolean4187 = false;

	public Class405 aClass405_4182 = new Class405();

	public Class405 aClass405_4184 = new Class405();

	public boolean aBoolean4185 = false;

	public boolean aBoolean4188 = false;

	public Class93 aClass93_4178;

	public Class388 aClass388_4177;

	public long aLong4181;

	public Class210 aClass210_4176;

	public Class467 aClass467_4179;

	public int anInt4175;

	public int anInt4180;

	public int anInt4183;

	public int anInt4186;

	public int anInt4189;

	public int anInt4190;

	public int anInt4191;

	public int anInt4192;

	public static int anInt4194;

	public static int anInt4195;

	public Class406(Class_ra arg0, Class93 arg1, Class388 arg2, long arg3) {
		this.aClass93_4178 = arg1;
		this.aClass388_4177 = arg2;
		this.aLong4181 = arg3;
		this.aClass210_4176 = this.aClass93_4178.method1085(-1589428855);
		if (!arg0.al() && this.aClass210_4176.anInt2030 != -1) {
			this.aClass210_4176 = Class85.method974(this.aClass210_4176.anInt2030, 1927511350);
		}
		this.aClass467_4179 = new Class467();
		this.anInt4193 = (int) ((double) this.anInt4193 + Math.random() * 64.0D);
		this.method4748(1791692328);
		this.aClass405_4184.anInt4164 = this.aClass405_4182.anInt4164;
		this.aClass405_4184.anInt4172 = this.aClass405_4182.anInt4172;
		this.aClass405_4184.anInt4174 = this.aClass405_4182.anInt4174;
		this.aClass405_4184.anInt4166 = this.aClass405_4182.anInt4166;
		this.aClass405_4184.anInt4167 = this.aClass405_4182.anInt4167;
		this.aClass405_4184.anInt4168 = this.aClass405_4182.anInt4168;
		this.aClass405_4184.anInt4163 = this.aClass405_4182.anInt4163;
		this.aClass405_4184.anInt4170 = this.aClass405_4182.anInt4170;
		this.aClass405_4184.anInt4171 = this.aClass405_4182.anInt4171;
	}

	public void method4748(int arg0) {
		try {
			this.aClass405_4182.anInt4164 = this.aClass93_4178.anInt838;
			this.aClass405_4182.anInt4172 = this.aClass93_4178.anInt832;
			this.aClass405_4182.anInt4174 = this.aClass93_4178.anInt840;
			this.aClass405_4182.anInt4166 = this.aClass93_4178.anInt837;
			this.aClass405_4182.anInt4167 = this.aClass93_4178.anInt842;
			this.aClass405_4182.anInt4168 = this.aClass93_4178.anInt845;
			this.aClass405_4182.anInt4163 = this.aClass93_4178.anInt839;
			this.aClass405_4182.anInt4170 = this.aClass93_4178.anInt844;
			this.aClass405_4182.anInt4171 = this.aClass93_4178.anInt846;
			if (this.aClass405_4182.anInt4164 == this.aClass405_4182.anInt4166 && this.aClass405_4182.anInt4163 == this.aClass405_4182.anInt4166 && this.aClass405_4182.anInt4167 == this.aClass405_4182.anInt4172 && this.aClass405_4182.anInt4170 == this.aClass405_4182.anInt4167 && this.aClass405_4182.anInt4174 == this.aClass405_4182.anInt4168 && this.aClass405_4182.anInt4171 == this.aClass405_4182.anInt4168) {
				this.aBoolean4185 = true;
			} else if (this.aBoolean4185) {
				this.aBoolean4185 = false;
				this.aClass405_4184.anInt4164 = this.aClass405_4182.anInt4164;
				this.aClass405_4184.anInt4172 = this.aClass405_4182.anInt4172;
				this.aClass405_4184.anInt4174 = this.aClass405_4182.anInt4174;
				this.aClass405_4184.anInt4166 = this.aClass405_4182.anInt4166;
				this.aClass405_4184.anInt4167 = this.aClass405_4182.anInt4167;
				this.aClass405_4184.anInt4168 = this.aClass405_4182.anInt4168;
				this.aClass405_4184.anInt4163 = this.aClass405_4182.anInt4163;
				this.aClass405_4184.anInt4170 = this.aClass405_4182.anInt4170;
				this.aClass405_4184.anInt4171 = this.aClass405_4182.anInt4171;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qw.r(" + ')');
		}
	}

	public void method4749(Class_ra arg0, long arg1, int arg2, boolean arg3, int arg4) {
		try {
			int var7;
			if (this.aBoolean4187) {
				arg3 = false;
			} else if (Class391.anInt4053 < this.aClass210_4176.anInt1990) {
				arg3 = false;
			} else if (Class391.anInt4059 > Class91.anIntArray819[Class391.anInt4053]) {
				arg3 = false;
			} else if (this.aBoolean4185) {
				arg3 = false;
			} else if (this.aClass210_4176.anInt2027 != -1) {
				var7 = (int) (arg1 - this.aLong4181);
				if (this.aClass210_4176.aBoolean2025 || var7 <= this.aClass210_4176.anInt2027) {
					var7 %= this.aClass210_4176.anInt2027;
				} else {
					arg3 = false;
				}
				if (!this.aClass210_4176.aBoolean2006 && var7 < this.aClass210_4176.anInt2028) {
					arg3 = false;
				}
				if (this.aClass210_4176.aBoolean2006 && var7 >= this.aClass210_4176.anInt2028) {
					arg3 = false;
				}
			}
			this.anInt4180 = 0;
			for (Class325_Sub3_Sub1_Sub1 var30 = (Class325_Sub3_Sub1_Sub1) this.aClass467_4179.method5854(-53933781); var30 != null; var30 = (Class325_Sub3_Sub1_Sub1) this.aClass467_4179.method5857(-1919739880)) {
				var30.method3219(arg1, arg2);
				this.anInt4180++;
			}
			if (arg3) {
				var7 = (this.aClass405_4182.anInt4163 + this.aClass405_4182.anInt4164 + this.aClass405_4182.anInt4166) / 3;
				int var8 = (this.aClass405_4182.anInt4170 + this.aClass405_4182.anInt4167 + this.aClass405_4182.anInt4172) / 3;
				int var9 = (this.aClass405_4182.anInt4171 + this.aClass405_4182.anInt4174 + this.aClass405_4182.anInt4168) / 3;
				int var10;
				int var11;
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				if (this.aClass405_4182.anInt4165 != var7 || this.aClass405_4182.anInt4173 != var8 || this.aClass405_4182.anInt4169 != var9 || !this.aBoolean4188) {
					this.aClass405_4182.anInt4165 = var7;
					this.aClass405_4182.anInt4173 = var8;
					this.aClass405_4182.anInt4169 = var9;
					var10 = this.aClass405_4182.anInt4166 - this.aClass405_4182.anInt4164;
					var11 = this.aClass405_4182.anInt4167 - this.aClass405_4182.anInt4172;
					var12 = this.aClass405_4182.anInt4168 - this.aClass405_4182.anInt4174;
					var13 = this.aClass405_4182.anInt4163 - this.aClass405_4182.anInt4164;
					var14 = this.aClass405_4182.anInt4170 - this.aClass405_4182.anInt4172;
					var15 = this.aClass405_4182.anInt4171 - this.aClass405_4182.anInt4174;
					this.anInt4183 = var11 * var15 - var12 * var14;
					this.anInt4186 = var13 * var12 - var10 * var15;
					this.anInt4175 = var14 * var10 - var13 * var11;
					while (true) {
						if (this.anInt4183 <= 32767 && this.anInt4186 <= 32767 && this.anInt4175 <= 32767 && this.anInt4183 >= -32767 && this.anInt4186 >= -32767 && this.anInt4175 >= -32767) {
							var16 = (int) Math.sqrt((double) (this.anInt4175 * this.anInt4175 + this.anInt4186 * this.anInt4186 + this.anInt4183 * this.anInt4183));
							if (var16 <= 0) {
								var16 = 1;
							}
							this.anInt4183 = this.anInt4183 * 32767 / var16;
							this.anInt4186 = this.anInt4186 * 32767 / var16;
							this.anInt4175 = this.anInt4175 * 32767 / var16;
							if (this.aClass210_4176.aShort2003 > 0 || this.aClass210_4176.aShort2039 > 0) {
								var17 = (int) (Math.atan2((double) this.anInt4175, (double) this.anInt4183) * 2607.5945876176133D);
								var18 = (int) (Math.atan2((double) this.anInt4186, Math.sqrt((double) (this.anInt4183 * this.anInt4183 + this.anInt4175 * this.anInt4175))) * 2607.5945876176133D);
								this.anInt4189 = this.aClass210_4176.aShort2003 - this.aClass210_4176.aShort1991;
								this.anInt4192 = var17 + this.aClass210_4176.aShort1991 - (this.anInt4189 >> 1);
								this.anInt4191 = this.aClass210_4176.aShort2039 - this.aClass210_4176.aShort1993;
								this.anInt4190 = var18 + this.aClass210_4176.aShort1993 - (this.anInt4191 >> 1);
							}
							this.aBoolean4188 = true;
							break;
						}
						this.anInt4183 >>= 0x1;
						this.anInt4186 >>= 0x1;
						this.anInt4175 >>= 0x1;
					}
				}
				this.anInt4193 += (int) ((double) arg2 * ((double) this.aClass210_4176.anInt2050 + Math.random() * (double) (this.aClass210_4176.anInt2015 - this.aClass210_4176.anInt2050)));
				if (this.anInt4193 > 63) {
					var10 = this.anInt4193 >> 6;
					this.anInt4193 &= 0x3F;
					var11 = (arg2 << 8) / var10;
					var12 = 0;
					var13 = 0;
					while (var13 < var10) {
						int var20;
						int var21;
						int var22;
						if (this.aClass210_4176.aShort2003 <= 0 && this.aClass210_4176.aShort2039 <= 0) {
							var14 = this.anInt4183;
							var15 = this.anInt4186;
							var16 = this.anInt4175;
						} else {
							var17 = this.anInt4192 + (int) ((double) this.anInt4189 * Math.random());
							var17 &= 0x3FFF;
							var18 = Class257.anIntArray2683[var17];
							int var19 = Class257.anIntArray2684[var17];
							var20 = this.anInt4190 + (int) ((double) this.anInt4191 * Math.random());
							int var35 = var20 & 0x1FFF;
							var21 = Class257.anIntArray2683[var35];
							var22 = Class257.anIntArray2684[var35];
							byte var23 = 13;
							var14 = var21 * var19 >> var23;
							var15 = (var22 << 1) * -1;
							var16 = var21 * var18 >> var23;
						}
						float var32 = (float) Math.random();
						float var33 = (float) Math.random();
						if (var32 + var33 > 1.0F) {
							var32 = 1.0F - var32;
							var33 = 1.0F - var33;
						}
						float var34 = 1.0F - (var32 + var33);
						var20 = (int) ((float) this.aClass405_4182.anInt4166 * var33 + (float) this.aClass405_4182.anInt4164 * var32 + var34 * (float) this.aClass405_4182.anInt4163);
						var21 = (int) (var34 * (float) this.aClass405_4182.anInt4170 + var32 * (float) this.aClass405_4182.anInt4172 + var33 * (float) this.aClass405_4182.anInt4167);
						var22 = (int) ((float) this.aClass405_4182.anInt4171 * var34 + var33 * (float) this.aClass405_4182.anInt4168 + var32 * (float) this.aClass405_4182.anInt4174);
						int var36 = this.aClass210_4176.anInt1995 + (int) (Math.random() * (double) (this.aClass210_4176.anInt1996 - this.aClass210_4176.anInt1995));
						int var24 = this.aClass210_4176.anInt2001 + (int) (Math.random() * (double) (this.aClass210_4176.anInt2013 - this.aClass210_4176.anInt2001));
						int var25 = this.aClass210_4176.anInt1986 + (int) (Math.random() * (double) (this.aClass210_4176.anInt2002 - this.aClass210_4176.anInt1986));
						int var26;
						if (this.aClass210_4176.aBoolean2007) {
							double var27 = Math.random();
							var26 = (int) ((double) this.aClass210_4176.anInt2036 + var27 * (double) this.aClass210_4176.anInt2038) << 16 | (int) (var27 * (double) this.aClass210_4176.anInt2012 + (double) this.aClass210_4176.anInt2047) << 8 | (int) (var27 * (double) this.aClass210_4176.anInt1992 + (double) this.aClass210_4176.anInt2011) | (int) ((double) this.aClass210_4176.anInt2045 + Math.random() * (double) this.aClass210_4176.anInt2049) << 24;
						} else {
							var26 = (int) ((double) this.aClass210_4176.anInt2036 + Math.random() * (double) this.aClass210_4176.anInt2038) << 16 | (int) ((double) this.aClass210_4176.anInt2047 + Math.random() * (double) this.aClass210_4176.anInt2012) << 8 | (int) ((double) this.aClass210_4176.anInt2011 + Math.random() * (double) this.aClass210_4176.anInt1992) | (int) ((double) this.aClass210_4176.anInt2045 + Math.random() * (double) this.aClass210_4176.anInt2049) << 24;
						}
						int var37 = this.aClass210_4176.anInt2005;
						if (!arg0.al() && !this.aClass210_4176.aBoolean2031) {
							var37 = -1;
						}
						Class325_Sub3_Sub1_Sub1 var28;
						if (Class391.anInt4054 == Class391.anInt4055) {
							var28 = new Class325_Sub3_Sub1_Sub1(this, var20, var21, var22, var14, var15, var16, var36, var24, var26, var25, var37, this.aClass210_4176.aBoolean2029, this.aClass210_4176.aBoolean2032);
						} else {
							var28 = Class391.aClass325_Sub3_Sub1_Sub1Array4052[Class391.anInt4054];
							Class391.anInt4054 = Class391.anInt4054 + 1 & 0x3FF;
							var28.method3218(this, var20, var21, var22, var14, var15, var16, var36, var24, var26, var25, var37, this.aClass210_4176.aBoolean2029, this.aClass210_4176.aBoolean2032);
						}
						if (var12 > 256) {
							var28.method3219(arg1, var12 >> 8);
						}
						this.anInt4180++;
						var13++;
						var12 += var11;
					}
				}
			}
			if (!this.aClass405_4182.method4740(this.aClass405_4184, -310818348)) {
				Class405 var31 = this.aClass405_4184;
				this.aClass405_4184 = this.aClass405_4182;
				this.aClass405_4182 = var31;
				this.aClass405_4182.anInt4164 = this.aClass93_4178.anInt838;
				this.aClass405_4182.anInt4172 = this.aClass93_4178.anInt832;
				this.aClass405_4182.anInt4174 = this.aClass93_4178.anInt840;
				this.aClass405_4182.anInt4166 = this.aClass93_4178.anInt837;
				this.aClass405_4182.anInt4167 = this.aClass93_4178.anInt842;
				this.aClass405_4182.anInt4168 = this.aClass93_4178.anInt845;
				this.aClass405_4182.anInt4163 = this.aClass93_4178.anInt839;
				this.aClass405_4182.anInt4170 = this.aClass93_4178.anInt844;
				this.aClass405_4182.anInt4171 = this.aClass93_4178.anInt846;
				this.aClass405_4182.anInt4165 = this.aClass405_4184.anInt4165;
				this.aClass405_4182.anInt4173 = this.aClass405_4184.anInt4173;
				this.aClass405_4182.anInt4169 = this.aClass405_4184.anInt4169;
			}
			Class391.anInt4058 += this.anInt4180;
		} catch (RuntimeException var29) {
			throw Class476.method5964(var29, "qw.j(" + ')');
		}
	}

	public void method4750(Class356 arg0, Class_ra arg1, long arg2) {
		try {
			for (Class325_Sub3_Sub1_Sub1 var5 = (Class325_Sub3_Sub1_Sub1) this.aClass467_4179.method5854(-1945574610); var5 != null; var5 = (Class325_Sub3_Sub1_Sub1) this.aClass467_4179.method5857(-1941130535)) {
				var5.method3220(arg0, arg1, arg2);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "qw.i(" + ')');
		}
	}

	public static final void method4751(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			String var3 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			if (client.anInt8995 == 15 && !Class434.method5564(-1779748958)) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = IndexTable.method2783(var2, var3, 2132921735) ? 1 : 0;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qw.and(" + ')');
		}
	}
}
