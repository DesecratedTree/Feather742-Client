package deob;

public class Class240 implements Runnable {

	public Interface14 anInterface14_2600 = new Class246();

	public Interface14 anInterface14_2597 = null;

	public int anInt2595;

	public int anInt2603;

	public static int anInt2605;

	public long aLong2599;

	public long aLong2601;

	public Class258 aClass258_2604;

	public String aString2602;

	public boolean aBoolean2596;

	public volatile boolean aBoolean2598;

	public int method2384(int arg0) {
		try {
			return this.anInt2603;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "kb.r(" + ')');
		}
	}

	public synchronized void method2385(Interface14 arg0, int arg1) {
		try {
			this.anInterface14_2597 = this.anInterface14_2600;
			this.anInterface14_2600 = arg0;
			this.aLong2599 = Class312.method3111((byte) 22);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "kb.p(" + ')');
		}
	}

	public synchronized void method2386(long arg0, String arg1, int arg2, Class258 arg3, int arg4) {
		try {
			this.aLong2601 = arg0;
			this.aString2602 = arg1;
			this.anInt2595 = arg2;
			this.aClass258_2604 = arg3;
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "kb.o(" + ')');
		}
	}

	public int method2387(int arg0) {
		try {
			if (this.aClass258_2604 == null) {
				return 0;
			}
			int var2 = this.aClass258_2604.anInt2703;
			if (this.aClass258_2604.aBoolean2704 && this.anInt2595 < this.aClass258_2604.anInt2707) {
				return this.anInt2595 + 1;
			} else if (var2 >= 0 && var2 < Class239.aClass258Array2585.length - 1) {
				return this.aClass258_2604.anInt2706 == this.anInt2595 ? this.aClass258_2604.anInt2707 : this.aClass258_2604.anInt2706;
			} else {
				return 100;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "kb.s(" + ')');
		}
	}

	public int method2388(byte arg0) {
		try {
			return this.anInt2595;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "kb.f(" + ')');
		}
	}

	public long method2389(int arg0) {
		try {
			return this.aLong2601;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "kb.w(" + ')');
		}
	}

	public Class258 method2390(int arg0) {
		try {
			return this.aClass258_2604;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "kb.n(" + ')');
		}
	}

	public void method2391(int arg0) {
		try {
			this.aBoolean2598 = true;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "kb.u(" + ')');
		}
	}

	public void run() {
		try {
			while (!this.aBoolean2598) {
				long var1 = Class312.method3111((byte) 14);
				synchronized (this) {
					try {
						this.anInt2603++;
						if (this.anInterface14_2600 instanceof Class246) {
							this.anInterface14_2600.method196(this.aBoolean2596, -242675555);
						} else {
							long var4 = Class312.method3111((byte) 26);
							if (Class361.aClass_ra3793 == null || this.anInterface14_2597 == null || this.anInterface14_2597.method199(2086389581) == 0 || this.aLong2599 < var4 - (long) this.anInterface14_2597.method199(-1828147931)) {
								if (this.anInterface14_2597 != null) {
									this.aBoolean2596 = true;
									this.anInterface14_2597.method209((byte) 70);
									this.anInterface14_2597 = null;
								}
								if (this.aBoolean2596) {
									Class113.method1384(-1903047813);
									if (Class361.aClass_ra3793 != null) {
										Class361.aClass_ra3793.ba(1, 0);
									}
								}
								this.anInterface14_2600.method196(this.aBoolean2596 || Class361.aClass_ra3793 != null && Class361.aClass_ra3793.e(), -854239332);
							} else {
								int var6 = (int) ((var4 - this.aLong2599) * 255L / (long) this.anInterface14_2597.method199(1758483732));
								int var7 = 255 - var6;
								int var15 = var6 << 24 | 0xFFFFFF;
								int var16 = var7 << 24 | 0xFFFFFF;
								Class113.method1384(-1954782965);
								Class361.aClass_ra3793.ba(1, 0);
								Class61 var8 = Class361.aClass_ra3793.method4794(Class300.anInt3058, Class146.anInt1615, true, 575622491);
								Class76_Sub2 var9 = Class361.aClass_ra3793.ag();
								var9.method901(0, var8.method684());
								Class361.aClass_ra3793.method4785(var9, (byte) 1);
								this.anInterface14_2597.method196(true, 1516694199);
								Class361.aClass_ra3793.method4802(var9, (byte) 0);
								var8.method688(0, 0, 0, var16, 1);
								Class361.aClass_ra3793.method4785(var9, (byte) 1);
								Class361.aClass_ra3793.ba(1, 0);
								this.anInterface14_2600.method196(true, -592016454);
								Class361.aClass_ra3793.method4802(var9, (byte) 0);
								var8.method688(0, 0, 0, var15, 1);
							}
							try {
								if (Class361.aClass_ra3793 != null && !(this.anInterface14_2600 instanceof Class246)) {
									Class361.aClass_ra3793.method4786(494718246);
								}
							} catch (Exception_Sub1 var11) {
								Class207.method2195(var11.getMessage() + Class394.aClient4082.method3886(1379625429), var11, -306254718);
								Class171.method2046(0, true, -1081950430);
							}
						}
						this.aBoolean2596 = false;
						if (Class361.aClass_ra3793 != null && !(this.anInterface14_2600 instanceof Class246) && this.aClass258_2604.anInt2703 < Class258.aClass258_2700.anInt2703) {
							Class16.method450(-561104478);
						}
					} catch (Exception var12) {
						continue;
					}
				}
				long var3 = Class312.method3111((byte) 67);
				int var5 = (int) (20L - (var3 - var1));
				if (var5 > 0) {
					Class464_Sub21.method5813((long) var5);
				}
			}
		} catch (RuntimeException var14) {
			throw Class476.method5964(var14, "kb.run(" + ')');
		}
	}

	public synchronized void method2392(byte arg0) {
		try {
			this.aBoolean2596 = true;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "kb.j(" + ')');
		}
	}

	public String method2393(byte arg0) {
		try {
			return this.aString2602;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "kb.z(" + ')');
		}
	}

	public synchronized boolean method2394(int arg0) {
		try {
			return this.anInterface14_2600.method198(this.aLong2599);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "kb.i(" + ')');
		}
	}

	public static float method2395(Class244 arg0, int arg1) {
		try {
			Class260 var2 = Class260.method2577(0.0F, 0.0F, 1.0F);
			var2.method2570(arg0);
			double var3 = 1.5707963267948966D - Math.acos((double) var2.aFloat2715);
			var2.method2550();
			return (float) var3;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "kb.r(" + ')');
		}
	}

	public static final void method2396(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = ~var2;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "kb.zf(" + ')');
		}
	}

	public static final void method2397(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1221;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "kb.pp(" + ')');
		}
	}

	public static final void method2398(Class430 arg0, byte arg1) {
		try {
			Class416.method5256(arg0.aClass432_Sub1_Sub1_Sub1_4396, arg0.anIntArray4387[--arg0.anInt4376], 1760074814);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = (int) client.aFloatArray9253[0];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = (int) client.aFloatArray9253[1];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = (int) client.aFloatArray9253[2];
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "kb.arb(" + ')');
		}
	}

	public static int method2399(CharSequence arg0, int arg1, boolean arg2, int arg3) {
		try {
			if (arg1 < 2 || arg1 > 36) {
				throw new IllegalArgumentException("" + arg1);
			}
			boolean var4 = false;
			boolean var5 = false;
			int var6 = 0;
			int var7 = arg0.length();
			for (int var8 = 0; var8 < var7; var8++) {
				char var9 = arg0.charAt(var8);
				if (var8 == 0) {
					if (var9 == '-') {
						var4 = true;
						continue;
					}
					if (var9 == '+' && arg2) {
						if (arg3 >= -1189042212) {
						}
						continue;
					}
				}
				int var12;
				if (var9 >= '0' && var9 <= '9') {
					var12 = var9 - '0';
				} else if (var9 >= 'A' && var9 <= 'Z') {
					var12 = var9 - '7';
				} else if (var9 >= 'a' && var9 <= 'z') {
					var12 = var9 - 'W';
				} else {
					throw new NumberFormatException();
				}
				if (var12 >= arg1) {
					throw new NumberFormatException();
				}
				if (var4) {
					var12 = -var12;
				}
				int var10 = var12 + var6 * arg1;
				if (var10 / arg1 != var6) {
					throw new NumberFormatException();
				}
				var6 = var10;
				var5 = true;
			}
			if (!var5) {
				throw new NumberFormatException();
			}
			return var6;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "kb.f(" + ')');
		}
	}
}
