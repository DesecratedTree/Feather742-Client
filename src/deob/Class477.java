package deob;

public class Class477 {

	public static int anInt5703 = 0;

	public static int anInt5704 = 2;

	public static int anInt5708 = 1;

	public boolean aBoolean5711 = false;

	public boolean aBoolean5709 = false;

	public int anInt5702 = 0;

	public boolean aBoolean5716 = false;

	public Class478 aClass478_5712;

	public Class478 aClass478_5717;

	public int anInt5706;

	public int anInt5707;

	public int anInt5710;

	public int anInt5713;

	public int anInt5714;

	public static int anInt5718;

	public static Class436 aClass436_5715;

	public Class440 aClass440_5705;

	public Class477(boolean arg0) {
		this.aBoolean5709 = arg0;
		this.aClass478_5712 = new Class478();
		if (this.aBoolean5709) {
			this.aClass478_5717 = new Class478();
		} else {
			this.aClass478_5717 = null;
		}
	}

	public final void method5965(Class477 arg0, int arg1) {
		try {
			this.aClass440_5705 = arg0.aClass440_5705;
			this.aBoolean5711 = arg0.aBoolean5711;
			this.aBoolean5709 = arg0.aBoolean5709;
			this.anInt5707 = arg0.anInt5707;
			this.anInt5713 = arg0.anInt5713;
			this.anInt5714 = arg0.anInt5714;
			this.anInt5710 = arg0.anInt5710;
			this.anInt5706 = arg0.anInt5706;
			this.method5983((short) 255);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "tt.j(" + ')');
		}
	}

	public final boolean method5966(int arg0) {
		try {
			return this.aClass440_5705 != null;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tt.i(" + ')');
		}
	}

	public final int method5967(byte arg0) {
		try {
			return this.aClass440_5705 == null ? -1 : this.aClass440_5705.anInt4459;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tt.o(" + ')');
		}
	}

	public final void method5968(int arg0, int arg1) {
		try {
			this.anInt5707 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "tt.q(" + ')');
		}
	}

	public final void method5969(int arg0, boolean arg1, boolean arg2, int arg3) {
		try {
			this.method5990(arg0, 0, 0, arg1, arg2, -1994748098);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "tt.w(" + ')');
		}
	}

	public final void method5970(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
		try {
			this.method5990(arg0, arg1, arg2, arg3, false, 1011405038);
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "tt.n(" + ')');
		}
	}

	public final boolean method5971(int arg0, int arg1) {
		try {
			int var5;
			return this.aClass440_5705 == null | (var5 = arg0 - this.anInt5707) <= 0 ? false : this.aClass440_5705.aBoolean4479 | var5 + this.anInt5706 > this.aClass440_5705.anIntArray4466[this.anInt5714];
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "tt.y(" + ')');
		}
	}

	public final boolean method5972(int arg0) {
		try {
			return this.anInt5707 != 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tt.b(" + ')');
		}
	}

	public final int method5973(byte arg0) {
		try {
			return this.anInt5707;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tt.k(" + ')');
		}
	}

	public final boolean method5974(int arg0) {
		try {
			if (this.aClass440_5705 == null) {
				return false;
			}
			boolean var2 = this.aClass478_5712.method6005(aClass436_5715, this.aClass440_5705, this.anInt5714, this.anInt5710, this.aClass440_5705.anIntArray4471, (byte) 98);
			if (var2 && this.aBoolean5709 && this.aClass440_5705.anIntArray4461 != null) {
				this.aClass478_5717.method6005(aClass436_5715, this.aClass440_5705, this.anInt5714, this.anInt5710, this.aClass440_5705.anIntArray4461, (byte) 33);
			}
			return var2;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tt.ay(" + ')');
		}
	}

	public final int method5975(int arg0) {
		try {
			if (!this.method5974(-104209603)) {
				return 0;
			}
			int var2 = 0;
			if (this.method5974(659048120)) {
				var2 |= this.aClass478_5712.anInt5721;
				if (this.aBoolean5709 && this.aClass440_5705.anIntArray4461 != null) {
					var2 |= this.aClass478_5717.anInt5721;
				}
			}
			return var2;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tt.u(" + ')');
		}
	}

	public final void method5976(Class387 arg0, int arg1, int arg2) {
		try {
			if (this.aClass440_5705 != null && this.aClass440_5705.anIntArray4471 != null && this.method5974(-66292292)) {
				arg0.method4449(this.aClass478_5712.aClass330_Sub36_Sub5_5724, this.aClass478_5712.anInt5720, this.aClass478_5712.aClass330_Sub36_Sub5_5723, this.aClass478_5712.anInt5719, this.anInt5706, this.aClass440_5705.anIntArray4466[this.anInt5714], arg1, this.aClass440_5705.aBoolean4473);
				if (this.aBoolean5709 && this.aClass440_5705.anIntArray4461 != null && this.aClass478_5717.aBoolean5722) {
					arg0.method4449(this.aClass478_5717.aClass330_Sub36_Sub5_5724, this.aClass478_5717.anInt5720, this.aClass478_5717.aClass330_Sub36_Sub5_5723, this.aClass478_5717.anInt5719, this.anInt5706, this.aClass440_5705.anIntArray4466[this.anInt5714], arg1, this.aClass440_5705.aBoolean4473);
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "tt.x(" + ')');
		}
	}

	public final void method5977(Class387 arg0, int arg1) {
		try {
			if (this.aClass440_5705.anIntArray4471 != null && this.method5974(-898561092)) {
				arg0.method4456(this.aClass478_5712.aClass330_Sub36_Sub5_5724, this.aClass478_5712.anInt5720);
				if (this.aBoolean5709 && this.aClass440_5705.anIntArray4461 != null && this.aClass478_5717.aBoolean5722) {
					arg0.method4456(this.aClass478_5717.aClass330_Sub36_Sub5_5724, this.aClass478_5717.anInt5720);
				}
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "tt.d(" + ')');
		}
	}

	public final boolean method5978(byte arg0) {
		try {
			return this.aBoolean5711;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tt.a(" + ')');
		}
	}

	public final void method5979(byte arg0) {
		try {
			this.method5989(0, 237584619);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tt.m(" + ')');
		}
	}

	public final void method5980(byte arg0) {
		try {
			this.anInt5713 = 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tt.e(" + ')');
		}
	}

	public final boolean method5981(int arg0, int arg1) {
		try {
			if (this.aClass440_5705 == null || arg0 == 0) {
				return false;
			}
			if (this.anInt5707 > 0) {
				if (this.anInt5707 >= arg0) {
					this.anInt5707 -= arg0;
					return false;
				}
				arg0 -= this.anInt5707;
				this.anInt5707 = 0;
				this.method5982(this.aClass440_5705, this.anInt5714, (byte) -102);
			}
			arg0 += this.anInt5706;
			boolean var3 = this.aClass440_5705.aBoolean4479 | Class440.aBoolean4457;
			if (arg0 > 100 && this.aClass440_5705.anInt4464 > 0) {
				int var4 = this.aClass440_5705.anIntArray4471.length - this.aClass440_5705.anInt4464;
				while (this.anInt5714 < var4 && arg0 > this.aClass440_5705.anIntArray4466[this.anInt5714]) {
					arg0 -= this.aClass440_5705.anIntArray4466[this.anInt5714];
					this.anInt5714++;
				}
				if (this.anInt5714 >= var4) {
					int var5 = 0;
					for (int var6 = var4; var6 < this.aClass440_5705.anIntArray4471.length; var6++) {
						var5 += this.aClass440_5705.anIntArray4466[var6];
					}
					if (this.anInt5702 == 0) {
						this.anInt5713 += arg0 / var5;
					}
					arg0 %= var5;
				}
				this.anInt5710 = this.anInt5714 + 1;
				if (this.anInt5710 >= this.aClass440_5705.anIntArray4471.length) {
					if (this.aClass440_5705.anInt4464 == -1 && this.aBoolean5716) {
						this.anInt5710 = 0;
					} else {
						this.anInt5710 -= this.aClass440_5705.anInt4464;
					}
					if (this.anInt5710 < 0 || this.anInt5710 >= this.aClass440_5705.anIntArray4471.length) {
						this.anInt5710 = -1;
					}
				}
				var3 = true;
			}
			while (arg0 > this.aClass440_5705.anIntArray4466[this.anInt5714]) {
				var3 = true;
				arg0 -= this.aClass440_5705.anIntArray4466[++this.anInt5714 - 1];
				if (this.anInt5714 >= this.aClass440_5705.anIntArray4471.length) {
					if (this.aClass440_5705.anInt4464 != -1 && this.anInt5702 != 2) {
						this.anInt5714 -= this.aClass440_5705.anInt4464;
						if (this.anInt5702 == 0) {
							this.anInt5713++;
						}
					}
					if (this.anInt5713 >= this.aClass440_5705.anInt4469 || this.anInt5714 < 0 || this.anInt5714 >= this.aClass440_5705.anIntArray4471.length) {
						this.aBoolean5711 = true;
						break;
					}
				}
				this.method5982(this.aClass440_5705, this.anInt5714, (byte) 1);
				this.anInt5710 = this.anInt5714 + 1;
				if (this.anInt5710 >= this.aClass440_5705.anIntArray4471.length) {
					if (this.aClass440_5705.anInt4464 == -1 && this.aBoolean5716) {
						this.anInt5710 = 0;
					} else {
						this.anInt5710 -= this.aClass440_5705.anInt4464;
					}
					if (this.anInt5710 < 0 || this.anInt5710 >= this.aClass440_5705.anIntArray4471.length) {
						this.anInt5710 = -1;
					}
				}
			}
			this.anInt5706 = arg0;
			if (var3) {
				this.method5983((short) 255);
			}
			return var3;
		} catch (NullPointerException var7) {
			var7.printStackTrace();
			return false;
		}
	}

	public void method5982(Class440 arg0, int arg1, byte arg2) {
	}

	public final void method5983(short arg0) {
		try {
			this.aClass478_5712.method6006((byte) 9);
			if (this.aBoolean5709) {
				this.aClass478_5717.method6006((byte) -47);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tt.ac(" + ')');
		}
	}

	public final void method5984(int arg0, int arg1, short arg2) {
		try {
			this.method5970(arg0, arg1, 0, false, -2013997277);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "tt.f(" + ')');
		}
	}

	public final void method5985(Class387 arg0, int arg1, int arg2, int arg3) {
		try {
			if (this.aClass440_5705.anIntArray4471 != null && this.method5974(790146927)) {
				arg0.method4450(this.aClass478_5712.aClass330_Sub36_Sub5_5724, this.aClass478_5712.anInt5720, this.aClass478_5712.aClass330_Sub36_Sub5_5723, this.aClass478_5712.anInt5719, this.anInt5706, this.aClass440_5705.anIntArray4466[this.anInt5714], arg1, arg2, this.aClass440_5705.aBoolean4473, null);
				if (this.aBoolean5709 && this.aClass440_5705.anIntArray4461 != null && this.aClass478_5717.aBoolean5722) {
					arg0.method4450(this.aClass478_5717.aClass330_Sub36_Sub5_5724, this.aClass478_5717.anInt5720, this.aClass478_5717.aClass330_Sub36_Sub5_5723, this.aClass478_5717.anInt5719, this.anInt5706, this.aClass440_5705.anIntArray4466[this.anInt5714], arg1, arg2, this.aClass440_5705.aBoolean4473, null);
				}
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "tt.g(" + ')');
		}
	}

	public final Class440 method5986(byte arg0) {
		try {
			return this.aClass440_5705;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tt.p(" + ')');
		}
	}

	public final void method5987(int arg0, boolean arg1, int arg2) {
		try {
			this.method5970(arg0, 0, 0, arg1, -2080648535);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "tt.z(" + ')');
		}
	}

	public final void method5988(int arg0, byte arg1) {
		try {
			this.method5970(arg0, 0, 0, false, -1943488785);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "tt.s(" + ')');
		}
	}

	public final void method5989(int arg0, int arg1) {
		try {
			this.anInt5714 = 0;
			this.anInt5710 = this.aClass440_5705.anIntArray4471.length > 1 ? 1 : -1;
			this.anInt5706 = 0;
			this.aBoolean5711 = false;
			this.anInt5707 = arg0;
			this.anInt5713 = 0;
			if (this.aClass440_5705 != null & this.aClass440_5705.anIntArray4471 != null) {
				this.method5982(this.aClass440_5705, this.anInt5714, (byte) -70);
				this.method5983((short) 255);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "tt.t(" + ')');
		}
	}

	public final void method5990(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
		try {
			if (arg0 != this.method5967((byte) -113)) {
				if (arg0 == -1) {
					this.aClass440_5705 = null;
				} else {
					if (this.aClass440_5705 == null || this.aClass440_5705.anInt4459 != arg0) {
						this.aClass440_5705 = aClass436_5715.method5570(arg0, -1935082713);
					} else if (this.aClass440_5705.anInt4472 == 0) {
						return;
					}
					this.anInt5713 = 0;
					this.anInt5707 = arg1;
					this.anInt5702 = arg2;
					this.aBoolean5716 = arg4;
					if (arg3) {
						this.anInt5714 = (int) (Math.random() * (double) this.aClass440_5705.anIntArray4471.length);
						this.anInt5706 = (int) (Math.random() * (double) this.aClass440_5705.anIntArray4466[this.anInt5714]);
					} else {
						this.anInt5714 = 0;
						this.anInt5706 = 0;
					}
					this.anInt5710 = this.anInt5714 + 1;
					if (this.aClass440_5705 != null && this.aClass440_5705.anIntArray4471 != null && (this.anInt5710 < 0 || this.anInt5710 >= this.aClass440_5705.anIntArray4471.length)) {
						this.anInt5710 = -1;
					}
					if (this.anInt5707 == 0) {
						this.method5982(this.aClass440_5705, this.anInt5714, (byte) -84);
					}
					this.aBoolean5711 = false;
				}
				this.method5983((short) 255);
			}
		} catch (NullPointerException var8) {
			var8.printStackTrace();
		}
	}

	public static Class198[] method5991(int arg0) {
		try {
			return new Class198[] { Class198.aClass198_1915, Class198.aClass198_1919, Class198.aClass198_1922, Class198.aClass198_1917, Class198.aClass198_1918, Class198.aClass198_1920, Class198.aClass198_1916, Class198.aClass198_1921, Class198.aClass198_1914, Class198.aClass198_1923 };
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "tt.r(" + ')');
		}
	}

	public static final void method5992(Class430 arg0, int arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			int var3 = arg0.anIntArray4387[--arg0.anInt4376];
			Class524 var4 = Class461.method5699(Class484.aClass280_5822, var3, 0, 1479980784);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var4.method6248(var2, Class57.aClass61Array6599, -863870136);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "tt.aaw(" + ')');
		}
	}

	public static final void method5993(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub30_7894.method5841(-1999499582);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tt.als(" + ')');
		}
	}
}
