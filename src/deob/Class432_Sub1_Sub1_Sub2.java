package deob;

public class Class432_Sub1_Sub1_Sub2 extends Class432_Sub1_Sub1 {

	public boolean aBoolean10187 = false;

	public int anInt10194 = 0;

	public boolean aBoolean10195 = false;

	public int anInt10191 = 0;

	public int anInt10192;

	public int anInt10179;

	public int anInt10182;

	public int anInt10181;

	public int anInt10197;

	public int anInt10186;

	public int anInt10184;

	public int anInt10188;

	public int anInt10178;

	public boolean aBoolean10177;

	public int anInt10176;

	public Class477 aClass477_10193;

	public double aDouble10180;

	public double aDouble10183;

	public double aDouble10185;

	public double aDouble10189;

	public double aDouble10190;

	public Class388 aClass388_10196;

	public Class432_Sub1_Sub1_Sub2(Class356 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14, int arg15, int arg16) {
		super(arg0, arg2, arg3, arg4, Class431.method5342(arg4, arg5, arg2, 1996761881) - arg6, arg5, arg4 >> 9, arg4 >> 9, arg5 >> 9, arg5 >> 9, false, (byte) 0);
		this.anInt10192 = arg1;
		this.anInt10179 = arg7;
		this.anInt10182 = arg8;
		this.anInt10181 = arg9;
		this.anInt10197 = arg10;
		this.anInt10186 = arg11;
		this.anInt10184 = arg12;
		this.anInt10188 = arg6;
		this.anInt10178 = arg13;
		this.aBoolean10177 = arg14;
		this.aBoolean10187 = false;
		this.anInt10176 = arg15;
		this.anInt10191 = arg16;
		int var18 = Class136.aClass416_1527.method5254(this.anInt10192, 1450833416).anInt4431;
		this.aClass477_10193 = new Class477_Sub2(this, false);
		this.aClass477_10193.method5988(var18, (byte) 42);
		this.method5373(1, 605208091);
	}

	public void method5490() {
		Class260 var1 = this.method5346().aClass260_2606;
		this.aShort9922 = this.aShort9920 = (short) (var1.aFloat2716 / 512.0F);
		this.aShort9921 = this.aShort9923 = (short) (var1.aFloat2711 / 512.0F);
	}

	public boolean method5395(int arg0) {
		try {
			return this.aBoolean10195;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "alj.bg(" + ')');
		}
	}

	public void method5491() {
		Class260 var1 = this.method5346().aClass260_2606;
		this.aShort9922 = this.aShort9920 = (short) (var1.aFloat2716 / 512.0F);
		this.aShort9921 = this.aShort9923 = (short) (var1.aFloat2711 / 512.0F);
	}

	public int method5492(byte arg0) {
		try {
			return this.anInt10191;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "alj.r(" + ')');
		}
	}

	public Class348 method5383(Class_ra arg0, int arg1) {
		try {
			return null;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "alj.bt(" + ')');
		}
	}

	public void method5493(byte arg0) {
		try {
			if (!this.aBoolean10187 && this.anInt10186 != 0) {
				Class432_Sub1_Sub1_Sub1 var2 = null;
				if (client.anInt8987 == 0) {
					var2 = Class96.aClass85Array854[this.anInt10186 - 1].method973(-1160484525);
				} else {
					int var3;
					if (this.anInt10186 < 0) {
						var3 = -this.anInt10186 - 1;
						if (client.anInt9121 == var3) {
							var2 = Class263_Sub2.myPlayer;
						} else {
							var2 = client.players[var3];
						}
					} else {
						var3 = this.anInt10186 - 1;
						Class330_Sub35 var4 = (Class330_Sub35) client.aClass497_9014.method6094((long) var3);
						if (var4 != null) {
							var2 = (Class432_Sub1_Sub1_Sub1) var4.anObject7733;
						}
					}
				}
				if (var2 != null) {
					Class260 var15 = var2.method5346().aClass260_2606;
					this.method5348(var15.aFloat2716, (float) (Class431.method5342((int) var15.aFloat2716, (int) var15.aFloat2711, this.aByte8658, 1996761881) - this.anInt10188), var15.aFloat2711);
					if (this.anInt10176 >= 0) {
						Class364 var16 = var2.method5436(-1179227035);
						int var5 = 0;
						int var6 = 0;
						if (var16.anIntArrayArray3807 != null && var16.anIntArrayArray3807[this.anInt10176] != null) {
							var5 += var16.anIntArrayArray3807[this.anInt10176][0];
							var6 += var16.anIntArrayArray3807[this.anInt10176][2];
						}
						if (var16.anIntArrayArray3845 != null && var16.anIntArrayArray3845[this.anInt10176] != null) {
							var5 += var16.anIntArrayArray3845[this.anInt10176][0];
							var6 += var16.anIntArrayArray3845[this.anInt10176][2];
						}
						if (var5 != 0 || var6 != 0) {
							int var7 = var2.aClass238_10053.method2370(90316937);
							int var8 = var7;
							if (var2.anIntArray10049 != null && var2.anIntArray10049[this.anInt10176] != -1) {
								var8 = var2.anIntArray10049[this.anInt10176];
							}
							int var9 = var8 - var7 & 0x3FFF;
							int var10 = Class257.anIntArray2683[var9];
							int var11 = Class257.anIntArray2684[var9];
							int var12 = var11 * var5 + var10 * var6 >> 14;
							var6 = var6 * var11 - var5 * var10 >> 14;
							Class260 var13 = Class260.method2549(this.method5346().aClass260_2606);
							var13.aFloat2716 += var12;
							var13.aFloat2711 += var6;
							this.method5349(var13);
							var13.method2550();
						}
					}
				}
			}
		} catch (RuntimeException var14) {
			throw Class476.method5964(var14, "alj.i(" + ')');
		}
	}

	public final void method5392(Class_ra arg0, Class432_Sub1 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "alj.bz(" + ')');
		}
	}

	public final void method5494(int arg0, int arg1) {
		try {
			this.aBoolean10187 = true;
			Class241 var3 = new Class241(this.method5346());
			var3.aClass260_2606.aFloat2716 = (float) ((double) var3.aClass260_2606.aFloat2716 + this.aDouble10180 * (double) arg0);
			var3.aClass260_2606.aFloat2711 = (float) ((double) var3.aClass260_2606.aFloat2711 + (double) arg0 * this.aDouble10189);
			if (this.aBoolean10177) {
				var3.aClass260_2606.aFloat2715 = Class431.method5342((int) var3.aClass260_2606.aFloat2716, (int) var3.aClass260_2606.aFloat2711, this.aByte8658, 1996761881) - this.anInt10188;
			} else if (this.anInt10181 == -1) {
				var3.aClass260_2606.aFloat2715 = (float) ((double) var3.aClass260_2606.aFloat2715 + this.aDouble10185 * (double) arg0);
			} else {
				var3.aClass260_2606.aFloat2715 = (float) ((double) var3.aClass260_2606.aFloat2715 + (double) arg0 * this.aDouble10185 + this.aDouble10183 * 0.5D * (double) arg0 * (double) arg0);
				this.aDouble10185 += this.aDouble10183 * (double) arg0;
			}
			var3.aClass244_2607.method2427(1.0F, 0.0F, 0.0F, (float) Math.atan2(this.aDouble10185, this.aDouble10190));
			Class244 var4 = Class244.method2428();
			var4.method2427(0.0F, 1.0F, 0.0F, (float) Math.atan2(this.aDouble10180, this.aDouble10189) - 3.1415927F);
			var3.aClass244_2607.method2429(var4);
			var4.method2417();
			this.method5353(var3);
			if (this.aClass477_10193.method5981(1, 636984754) && this.aClass477_10193.method5978((byte) -124)) {
				this.aClass477_10193.method5979((byte) -37);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "alj.p(" + ')');
		}
	}

	public Class387 method5495(Class_ra arg0, int arg1, byte arg2) {
		try {
			Class437 var4 = Class136.aClass416_1527.method5254(this.anInt10192, 1684752020);
			return var4.method5583(arg0, arg1, this.aClass477_10193, (byte) 2, 1319777347);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "alj.o(" + ')');
		}
	}

	public Class353 method5405(Class_ra arg0, int arg1) {
		try {
			Class387 var3 = this.method5495(arg0, 2048, (byte) -28);
			if (var3 == null) {
				return null;
			}
			Class247 var4 = this.method5355();
			this.method5496(arg0, var3, var4, -1882958789);
			Class353 var5 = Class497.method6105(false, (byte) 16);
			var3.method4475(var4, this.aClass80Array8656[0], 0);
			if (this.aClass388_10196 != null) {
				Class81 var6 = this.aClass388_10196.method4570();
				arg0.cm(var6);
			}
			this.aBoolean10195 = var3.i();
			var3.n();
			this.anInt10194 = var3.YA();
			return var5;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "alj.bf(" + ')');
		}
	}

	public void method5404(Class_ra arg0, int arg1) {
		try {
			Class387 var3 = this.method5495(arg0, 0, (byte) -121);
			if (var3 != null) {
				Class247 var4 = this.method5355();
				this.anInt10194 = var3.YA();
				var3.n();
				this.method5496(arg0, var3, var4, -591685766);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "alj.bl(" + ')');
		}
	}

	public void method5406(int arg0) {
		try {
			Class260 var2 = this.method5346().aClass260_2606;
			this.aShort9922 = this.aShort9920 = (short) (var2.aFloat2716 / 512.0F);
			this.aShort9921 = this.aShort9923 = (short) (var2.aFloat2711 / 512.0F);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "alj.ca(" + ')');
		}
	}

	public void method5496(Class_ra arg0, Class387 arg1, Class247 arg2, int arg3) {
		try {
			arg1.method4463(arg2);
			Class93[] var5 = arg1.method4464();
			Class64[] var6 = arg1.method4445();
			if ((this.aClass388_10196 == null || this.aClass388_10196.aBoolean3992) && (var5 != null || var6 != null)) {
				this.aClass388_10196 = Class388.method4571(client.anInt8981, true);
			}
			if (this.aClass388_10196 != null) {
				this.aClass388_10196.method4568(arg0, (long) client.anInt8981, var5, var6, false);
				this.aClass388_10196.method4573(this.aByte8658, this.aShort9922, this.aShort9920, this.aShort9921, this.aShort9923);
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "alj.s(" + ')');
		}
	}

	public void method5497(int arg0) {
		try {
			if (this.aClass388_10196 != null) {
				this.aClass388_10196.method4572();
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "alj.f(" + ')');
		}
	}

	public boolean method5358(Class_ra arg0, int arg1, int arg2, int arg3) {
		try {
			return false;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "alj.br(" + ')');
		}
	}

	public final boolean method5360(short arg0) {
		try {
			return false;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "alj.bi(" + ')');
		}
	}

	public final boolean method5391() {
		return false;
	}

	public final void method5393(int arg0) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "alj.be(" + ')');
		}
	}

	public boolean method5375() {
		return false;
	}

	public boolean method5376() {
		return false;
	}

	public boolean method5377() {
		return this.aBoolean10195;
	}

	public boolean method5378() {
		return this.aBoolean10195;
	}

	public boolean method5379() {
		return this.aBoolean10195;
	}

	public int method5364() {
		return this.anInt10194 * 281048457 * -2032234311;
	}

	public boolean method5390(Class_ra arg0, int arg1, int arg2) {
		return false;
	}

	public int method5394() {
		return this.anInt10194 * 281048457 * -2032234311;
	}

	public int method5381() {
		return this.anInt10194 * 281048457 * -2032234311;
	}

	public Class348 method5357(Class_ra arg0) {
		return null;
	}

	public Class348 method5385(Class_ra arg0) {
		return null;
	}

	public Class348 method5386(Class_ra arg0) {
		return null;
	}

	public Class348 method5362(Class_ra arg0) {
		return null;
	}

	public Class348 method5388(Class_ra arg0) {
		return null;
	}

	public Class353 method5380(Class_ra arg0) {
		Class387 var2 = this.method5495(arg0, 2048, (byte) -24);
		if (var2 == null) {
			return null;
		}
		Class247 var3 = this.method5355();
		this.method5496(arg0, var2, var3, -217670607);
		Class353 var4 = Class497.method6105(false, (byte) 16);
		var2.method4475(var3, this.aClass80Array8656[0], 0);
		if (this.aClass388_10196 != null) {
			Class81 var5 = this.aClass388_10196.method4570();
			arg0.cm(var5);
		}
		this.aBoolean10195 = var2.i();
		var2.n();
		this.anInt10194 = var2.YA() * 281048457 * -2032234311;
		return var4;
	}

	public boolean method5382(int arg0) {
		try {
			return false;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "alj.ao(" + ')');
		}
	}

	public boolean method5389(Class_ra arg0, int arg1, int arg2) {
		return false;
	}

	public boolean method5374() {
		return false;
	}

	public final void method5498(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			Class260 var6 = Class260.method2549(this.method5346().aClass260_2606);
			if (!this.aBoolean10187) {
				float var7 = (float) arg0 - var6.aFloat2716;
				float var8 = (float) arg1 - var6.aFloat2711;
				float var9 = (float) Math.sqrt((double) (var7 * var7 + var8 * var8));
				if (var9 != 0.0F) {
					var6.aFloat2716 += (float) this.anInt10197 * var7 / var9;
					var6.aFloat2711 += (float) this.anInt10197 * var8 / var9;
				}
				if (this.aBoolean10177) {
					var6.aFloat2715 = Class431.method5342((int) var6.aFloat2716, (int) var6.aFloat2711, this.aByte8658, 1996761881) - this.anInt10188;
				}
				this.method5349(var6);
			}
			double var11 = (double) (this.anInt10182 + 1 - arg3);
			this.aDouble10180 = (double) ((float) arg0 - var6.aFloat2716) / var11;
			this.aDouble10189 = (double) ((float) arg1 - var6.aFloat2711) / var11;
			this.aDouble10190 = Math.sqrt(this.aDouble10189 * this.aDouble10189 + this.aDouble10180 * this.aDouble10180);
			if (this.anInt10181 == -1) {
				this.aDouble10185 = (double) ((float) arg2 - var6.aFloat2715) / var11;
			} else {
				if (!this.aBoolean10187) {
					this.aDouble10185 = -this.aDouble10190 * Math.tan((double) this.anInt10181 * 0.02454369D);
				}
				this.aDouble10183 = ((double) ((float) arg2 - var6.aFloat2715) - var11 * this.aDouble10185) * 2.0D / (var11 * var11);
			}
			var6.method2550();
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "alj.j(" + ')');
		}
	}

	public final void method5387() {
		throw new IllegalStateException();
	}

	public final void method5384() {
		throw new IllegalStateException();
	}

	public int method5370(int arg0) {
		try {
			return this.anInt10194;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "alj.bo(" + ')');
		}
	}

	public Class348 method5401(Class_ra arg0) {
		return null;
	}

	public final void method5369(Class_ra arg0, Class432_Sub1 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	public final void method5396(Class_ra arg0, Class432_Sub1 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	public final void method5397(Class_ra arg0, Class432_Sub1 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	public int method5366() {
		return this.anInt10194 * 281048457 * -2032234311;
	}

	public void method5361(Class_ra arg0) {
		Class387 var2 = this.method5495(arg0, 0, (byte) -90);
		if (var2 != null) {
			Class247 var3 = this.method5355();
			this.anInt10194 = var2.YA() * 281048457 * -2032234311;
			var2.n();
			this.method5496(arg0, var2, var3, 1900721819);
		}
	}
}
