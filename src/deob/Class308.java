package deob;

public class Class308 {

	public static int anInt3171 = 512;

	public int anInt3177 = -1;

	public boolean aBoolean3185 = true;

	public int anInt3178;

	public int anInt3184;

	public int anInt3180;

	public int anInt3174;

	public Class311[] aClass311Array3182;

	public Class344 aClass344_3176;

	public Class311[] aClass311Array3175;

	public Class311 aClass311_3190;

	public int anInt3186;

	public int anInt3170;

	public int anInt3172;

	public int anInt3173;

	public int anInt3179;

	public int anInt3183;

	public int anInt3191;

	public int anInt3192;

	public static int anInt3194;

	public Class308 aClass308_3193;

	public Class387 aClass387_3187;

	public Class61 aClass61_3181;

	public boolean aBoolean3189;

	public byte[] aByteArray3188;

	public Class308(int arg0, Class311[] arg1, int arg2, int arg3, int arg4, int arg5, Class344 arg6, int arg7) {
		this.anInt3178 = arg3;
		this.anInt3184 = arg4;
		this.anInt3180 = arg5;
		this.anInt3174 = arg0;
		this.aClass311Array3182 = arg1;
		this.aClass344_3176 = arg6;
		if (arg1 == null) {
			this.aClass311Array3175 = null;
			this.aClass311_3190 = null;
		} else {
			this.aClass311Array3175 = new Class311[arg1.length];
			this.aClass311_3190 = arg2 >= 0 ? arg1[arg2] : null;
		}
		this.anInt3186 = arg7;
	}

	public boolean method3078(Class_ra arg0, int arg1, int arg2, int arg3) {
		try {
			if (arg1 != this.anInt3177) {
				this.anInt3177 = arg1;
				int var5 = Class385.method4425(arg1, (short) 15527);
				if (var5 > 512) {
					var5 = 512;
				}
				if (var5 <= 0) {
					var5 = 1;
				}
				if (this.anInt3172 != var5) {
					this.anInt3172 = var5;
					this.aClass61_3181 = null;
				}
				if (this.aClass311Array3182 != null) {
					this.anInt3179 = 0;
					int[] var6 = new int[this.aClass311Array3182.length];
					for (int var7 = 0; var7 < this.aClass311Array3182.length; var7++) {
						Class311 var8 = this.aClass311Array3182[var7];
						if (var8.method3103(this.anInt3178, this.anInt3184, this.anInt3180, this.anInt3177)) {
							var6[this.anInt3179] = var8.anInt3230;
							this.aClass311Array3175[++this.anInt3179 - 1] = var8;
						}
					}
					Class77.method926(var6, this.aClass311Array3175, 0, this.anInt3179 - 1, -164632396);
				}
				this.aBoolean3185 = true;
			}
			boolean var11 = false;
			if (this.aBoolean3185) {
				this.aBoolean3185 = false;
				for (int var10 = this.anInt3179 - 1; var10 >= 0; var10--) {
					boolean var12 = this.aClass311Array3175[var10].method3104(arg0, this.aClass311_3190);
					this.aBoolean3185 |= !var12;
					var11 |= var12;
				}
			}
			if (arg2 == 0 || !arg0.ay()) {
				this.aClass387_3187 = null;
			} else if (this.aClass387_3187 == null && this.anInt3186 >= 0) {
				this.method3087(arg0, (short) -21583);
			}
			if (this.aClass308_3193 != null && this.aClass308_3193 != this) {
				this.aClass308_3193.method3079((byte) -1);
				var11 |= this.aClass308_3193.method3078(arg0, arg1, arg2, 209825844);
			}
			return var11;
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "mv.z(" + ')');
		}
	}

	public void method3079(byte arg0) {
		try {
			this.aBoolean3189 = false;
			this.aClass308_3193 = null;
			this.anInt3191 = 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mv.o(" + ')');
		}
	}

	public void method3080(Class_ra arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10) {
		try {
			this.method3082(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, 0, arg9, true, false, 560629645);
		} catch (RuntimeException var13) {
			throw Class476.method5964(var13, "mv.n(" + ')');
		}
	}

	public Class308 method3081(int arg0) {
		try {
			return this.aClass308_3193;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mv.f(" + ')');
		}
	}

	public void method3082(Class_ra arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, boolean arg11, int arg12) {
		try {
			int var14 = 0;
			if (this.aBoolean3189) {
				var14 = this.anInt3191;
			}
			if (this.aClass308_3193 == null) {
				this.method3085(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, var14, (short) 2929);
			} else {
				Class308 var15 = this;
				Class308 var16 = this.aClass308_3193;
				if (this.hashCode() > var16.hashCode()) {
					var15 = this.aClass308_3193;
					var16 = this;
					var14 = 255 - var14;
				}
				var15.method3085(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, var14, (short) 2929);
				var16.method3085(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, arg11, 255 - var14, (short) 2929);
			}
		} catch (RuntimeException var17) {
			throw Class476.method5964(var17, "mv.l(" + ')');
		}
	}

	public void method3083(int arg0, int arg1, short arg2) {
		try {
			if (this.aBoolean3189) {
			}
			this.anInt3191 = this.anInt3170 + arg0 * (arg1 - this.anInt3170) / 255;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "mv.i(" + ')');
		}
	}

	public void method3084(Class308 arg0, int arg1) {
		try {
			if (this.aBoolean3189) {
				this.anInt3170 = this.anInt3191;
			} else if (arg0 != null && arg0.aBoolean3189) {
				this.anInt3170 = 255 - arg0.anInt3191;
			} else {
				this.anInt3170 = 0;
			}
			this.aBoolean3189 = true;
			this.aClass308_3193 = arg0;
			this.anInt3191 = 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "mv.p(" + ')');
		}
	}

	public void method3085(Class_ra arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, boolean arg11, int arg12, short arg13) {
		try {
			int var15 = 255 - arg12;
			arg0.method4796();
			if (this.aClass387_3187 == null) {
				arg0.ba(2, 0);
				arg7 = arg7 + arg1 & 0x3FFF;
				if (this.anInt3174 == -1 || this.anInt3172 == 0) {
					arg0.B(arg2, arg3, arg4, arg5, var15 << 24 | arg9, 1);
				} else {
					Class56 var16 = Class209.anInterface_ma1984.method221(this.anInt3174, -227895114);
					if (this.aClass61_3181 == null && Class209.anInterface_ma1984.method237(this.anInt3174, var16.aClass369_524 == Class369.aClass369_6817 ? Class377.aClass377_3935 : Class377.aClass377_3934, 0.7F, this.anInt3172, this.anInt3172, false, 2135230875)) {
						int[] var17 = Class369.aClass369_6817 == var16.aClass369_524 ? Class209.anInterface_ma1984.method231(this.anInt3174, 0.7F, this.anInt3172, this.anInt3172, false, -443337019) : Class209.anInterface_ma1984.method220(this.anInt3174, 0.7F, this.anInt3172, this.anInt3172, false, -1934755840);
						this.anInt3183 = var17[0];
						this.anInt3173 = var17[var17.length - 1];
						this.aClass61_3181 = arg0.method4795(var17, 0, var16.anInt532, var16.anInt532, var16.anInt532, (byte) -49);
					}
					int var25 = var15 == 255 ? (Class369.aClass369_6817 == var16.aClass369_524 ? 1 : 0) : 1;
					if (var25 == 1 && arg10) {
						arg0.B(arg2, arg3, arg4, arg5, arg9, 0);
					}
					if (this.aClass61_3181 != null) {
						int var18 = arg5 * arg6 / -4096;
						int var19;
						for (var19 = (arg4 - arg5) / 2 + arg7 * arg5 / 4096; var19 > arg5; var19 -= arg5) {
						}
						while (var19 < 0) {
							var19 += arg5;
						}
						int var20;
						if (this.aClass344_3176 == Class344.aClass344_6811) {
							for (var20 = var19 - arg5; var20 < arg4; var20 += arg5) {
								this.aClass61_3181.method691(arg2 + var20, arg3 + var18, arg5, arg5, 0, var15 << 24 | 0xFFFFFF, var25);
							}
							if ((this.anInt3183 & 0xFF000000) != 0) {
								arg0.method4789(0, 0, arg4, arg3 + var18 + 1, this.anInt3183, 463754225);
							}
							if ((this.anInt3173 & 0xFF000000) != 0) {
								arg0.method4789(0, var18 + arg3 + arg5, arg4, arg5 - (arg5 + arg3 + var18), this.anInt3173, 463754225);
							}
						} else {
							while (var18 > arg5) {
								var18 -= arg5;
							}
							while (var18 < 0) {
								var18 += arg5;
							}
							for (var20 = var19 - arg5; var20 < arg4; var20 += arg5) {
								for (int var21 = var18 - arg5; var21 < arg5; var21 += arg5) {
									this.aClass61_3181.method691(arg2 + var20, arg3 + var21, arg5, arg5, 0, var15 << 24 | 0xFFFFFF, var25);
								}
							}
						}
					}
				}
			} else if (arg11) {
				Class249 var23 = arg0.cs();
				Class249 var26 = arg0.cs();
				var23.aFloatArray2631[2] = var23.aFloatArray2631[3];
				var23.aFloatArray2631[6] = var23.aFloatArray2631[7];
				var23.aFloatArray2631[10] = var23.aFloatArray2631[11];
				var23.aFloatArray2631[14] = var23.aFloatArray2631[15];
				arg0.ci(var23);
				this.method3086(arg0, arg6, arg7, arg8, arg12, 24865515);
				arg0.ci(var26);
			} else {
				if (arg10) {
					arg0.ba(3, arg9);
				}
				this.method3086(arg0, arg6, arg7, arg8, arg12, 1756178562);
			}
			for (int var24 = this.anInt3179 - 1; var24 >= 0; var24--) {
				this.aClass311Array3175[var24].method3105(arg0, arg2, arg3, arg4, arg5, arg6, arg7, this.anInt3178, this.anInt3184, this.anInt3180, var15);
			}
			arg0.ba(2, 0);
			arg0.method4797();
		} catch (RuntimeException var22) {
			throw Class476.method5964(var22, "mv.b(" + ')');
		}
	}

	public void method3086(Class_ra arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			Class247 var7 = arg0.cq();
			Class247 var8 = new Class247();
			var8.method2476(0.0F, 0.0F, 0.0F);
			var8.method2462(0.0F, -1.0F, 0.0F, Class257.method2541(-arg2 & 0x3FFF));
			var8.method2462(-1.0F, 0.0F, 0.0F, Class257.method2541(-arg1 & 0x3FFF));
			var8.method2462(0.0F, 0.0F, -1.0F, Class257.method2541(-arg3 & 0x3FFF));
			arg0.cw(var8);
			Class247 var9 = new Class247();
			if (arg4 != this.anInt3192) {
				this.aClass387_3187.method4460((byte) arg4, this.aByteArray3188);
				this.anInt3192 = arg4;
			}
			this.aClass387_3187.method4475(var9, null, 0);
			arg0.cw(var7);
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "mv.k(" + ')');
		}
	}

	public void method3087(Class_ra arg0, short arg1) {
		try {
			try {
				boolean var3 = Class126_Sub2.aClass280_7229.method2777(this.anInt3186, (byte) 67);
				if (var3) {
					arg0.m(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
					Model var4 = Model.loadModel(Class126_Sub2.aClass280_7229, this.anInt3186, 0);
					this.aClass387_3187 = arg0.cb(var4, 1099776, 0, 255, 1);
					byte[] var5 = this.aClass387_3187.as();
					if (var5 == null) {
						this.aByteArray3188 = null;
					} else {
						this.aByteArray3188 = new byte[var5.length];
						System.arraycopy(var5, 0, this.aByteArray3188, 0, var5.length);
					}
				}
			} catch (Exception var6) {
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "mv.w(" + ')');
		}
	}

	public boolean method3088(int arg0) {
		try {
			return this.aBoolean3189;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mv.s(" + ')');
		}
	}

	public static final void method3089(Class430 arg0, int arg1) {
		try {
			if (client.anInt9257 == 0) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = -2;
			} else if (client.anInt9257 == 1) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = -1;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.anInt9256;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mv.ve(" + ')');
		}
	}

	public static final void method3090(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			if (var2 != Class448.aClass330_Sub50_5555.aClass464_Sub7_7891.method5760((byte) -24)) {
				Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub7_7891, var2, 519831538);
				Class435.method5568(1474846444);
				client.aBoolean9194 = false;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mv.alv(" + ')');
		}
	}

	public static void method3091(int arg0, byte arg1) {
		try {
			Class382.aBooleanArray6678[arg0] = false;
			Class152.method1790(arg0, -1180587285);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mv.z(" + ')');
		}
	}

	public static final void method3092(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376--;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			Class330_Sub48 var3 = (Class330_Sub48) client.aClass497_9284.method6094((long) var2);
			if (var3 != null && var3.anInt7860 == 3) {
				Class75.method854(var3, true, true, -1760837025);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "mv.se(" + ')');
		}
	}
}
