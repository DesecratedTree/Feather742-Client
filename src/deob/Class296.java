package deob;

import java.awt.Component;
import java.util.Arrays;

public class Class296 {

	public static int anInt3021 = 1;

	public static int anInt3024 = 256;

	public static boolean aBoolean3032 = false;

	public static int anInt3034 = 16384;

	public static int anInt3042 = 1;

	public static int anInt3044 = 2;

	public static int anInt3045 = 4;

	public static int anInt3046 = 8;

	public boolean aBoolean3029 = false;

	public int anInt3041 = 32;

	public long aLong3037 = Class312.method3111((byte) 106);

	public long aLong3036 = 0L;

	public int anInt3043 = 0;

	public int anInt3038 = 0;

	public int anInt3031 = 0;

	public long aLong3027 = 0L;

	public boolean aBoolean3040 = true;

	public int anInt3026 = 0;

	public Class330_Sub40[] aClass330_Sub40Array3048 = new Class330_Sub40[8];

	public Class330_Sub40[] aClass330_Sub40Array3049 = new Class330_Sub40[8];

	public int anInt3022;

	public int anInt3033;

	public int anInt3035;

	public static int anInt3039;

	public static int anInt3047;

	public static Class291 aClass291_3025;

	public Class330_Sub40 aClass330_Sub40_3030;

	public static boolean aBoolean3023;

	public int[] anIntArray3028;

	public final synchronized void method2932() {
		if (this.aBoolean3029) {
			return;
		}
		long var1 = Class312.method3111((byte) 38);
		try {
			if (var1 > this.aLong3037 + 6000L) {
				this.aLong3037 = var1 - 6000L;
			}
			while (var1 > this.aLong3037 + 5000L) {
				this.method2942(256);
				this.aLong3037 += 256000 / anInt3047;
				var1 = Class312.method3111((byte) 89);
			}
		} catch (Exception var6) {
			this.aLong3037 = var1;
		}
		if (this.anIntArray3028 == null) {
			return;
		}
		try {
			if (this.aLong3036 != 0L) {
				if (var1 < this.aLong3036) {
					return;
				}
				this.method2949(this.anInt3033);
				this.aLong3036 = 0L;
				this.aBoolean3040 = true;
			}
			int var3 = this.method2940();
			if (this.anInt3031 - var3 > this.anInt3043) {
				this.anInt3043 = this.anInt3031 - var3;
			}
			int var4 = this.anInt3022 + this.anInt3035;
			if (var4 + 256 > 16384) {
				var4 = 16128;
			}
			if (var4 + 256 > this.anInt3033) {
				this.anInt3033 += 1024;
				if (this.anInt3033 > 16384) {
					this.anInt3033 = 16384;
				}
				this.method2945(false);
				this.method2949(this.anInt3033);
				var3 = 0;
				this.aBoolean3040 = true;
				if (var4 + 256 > this.anInt3033) {
					var4 = this.anInt3033 - 256;
					this.anInt3035 = var4 - this.anInt3022;
				}
			}
			while (var3 < var4) {
				this.method2947(this.anIntArray3028, 256);
				this.method2948();
				var3 += 256;
			}
			if (var1 > this.aLong3027) {
				if (this.aBoolean3040) {
					this.aBoolean3040 = false;
				} else if (this.anInt3043 == 0 && this.anInt3038 == 0) {
					this.method2945(false);
					this.aLong3036 = var1 + 2000L;
					return;
				} else {
					this.anInt3035 = Math.min(this.anInt3038, this.anInt3043);
					this.anInt3038 = this.anInt3043;
				}
				this.anInt3043 = 0;
				this.aLong3027 = var1 + 2000L;
			}
			this.anInt3031 = var3;
		} catch (Exception var5) {
			this.method2945(false);
			this.aLong3036 = var1 + 2000L;
		}
	}

	public static final void method2933(int arg0, boolean arg1, int arg2) {
		if (arg0 < 8000 || arg0 > 48000) {
			throw new IllegalArgumentException();
		}
		anInt3047 = arg0;
		aBoolean3023 = arg1;
		anInt3039 = arg2;
	}

	public static final Class296 method2934(Component arg0, int arg1, int arg2) {
		if (anInt3047 == 0) {
			throw new IllegalStateException();
		} else if (arg1 >= 0 && arg1 < 2) {
			int var3 = arg2;
			if (arg2 < 256) {
				var3 = 256;
			}
			if (!aBoolean3032) {
				try {
					Class296_Sub1 var5 = new Class296_Sub1();
					var5.anIntArray3028 = new int[(aBoolean3023 ? 2 : 1) * 256];
					var5.anInt3022 = var3;
					var5.method2944(arg0);
					var5.anInt3033 = (var3 & 0xFFFFFC00) + 1024;
					if (var5.anInt3033 > 16384) {
						var5.anInt3033 = 16384;
					}
					var5.method2949(var5.anInt3033);
					if (anInt3039 > 0 && aClass291_3025 == null) {
						aClass291_3025 = new Class291_Sub1();
						Thread var6 = new Thread(aClass291_3025);
						var6.setDaemon(true);
						var6.start();
						var6.setPriority(anInt3039);
					}
					if (aClass291_3025 != null) {
						if (aClass291_3025.aClass296Array2977[arg1] != null) {
							throw new IllegalArgumentException();
						}
						aClass291_3025.aClass296Array2977[arg1] = var5;
					}
					return var5;
				} catch (Throwable var7) {
				}
			}
			return new Class296();
		} else {
			throw new IllegalArgumentException();
		}
	}

	public final synchronized void method2935(Class330_Sub40 arg0) {
		this.aClass330_Sub40_3030 = arg0;
	}

	public final synchronized void method2936() {
		this.aBoolean3040 = true;
		try {
			this.method2946();
		} catch (Exception var2) {
			this.method2945(false);
			this.aLong3036 = Class312.method3111((byte) 123) + 2000L;
		}
	}

	public final synchronized void method2937() {
		this.method2938(false);
		this.method2945(true);
		this.anIntArray3028 = null;
		this.aBoolean3029 = true;
	}

	public final synchronized void method2938(boolean arg0) {
		if (aClass291_3025 == null) {
			return;
		}
		boolean var2 = true;
		for (int var3 = 0; var3 < 2; var3++) {
			if (arg0 || aClass291_3025.aClass296Array2977[var3] == this) {
				aClass291_3025.aClass296Array2977[var3] = null;
			}
			if (aClass291_3025.aClass296Array2977[var3] != null) {
				var2 = false;
			}
		}
		if (!var2) {
			return;
		}
		aClass291_3025.aBoolean2975 = true;
		while (aClass291_3025.aBoolean2976) {
			Class464_Sub21.method5813(50L);
		}
		aClass291_3025 = null;
	}

	public void method2939() {
		this.method2938(true);
		this.anIntArray3028 = null;
		this.aBoolean3029 = true;
		aBoolean3032 = true;
	}

	public int method2940() throws Exception {
		return this.anInt3033;
	}

	public final void method2941(Class330_Sub40 arg0, int arg1) {
		int var3 = arg1 >> 5;
		Class330_Sub40 var4 = this.aClass330_Sub40Array3049[var3];
		if (var4 == null) {
			this.aClass330_Sub40Array3048[var3] = arg0;
		} else {
			var4.aClass330_Sub40_7771 = arg0;
		}
		this.aClass330_Sub40Array3049[var3] = arg0;
		arg0.anInt7769 = arg1;
	}

	public final void method2942(int arg0) {
		this.anInt3026 -= arg0;
		if (this.anInt3026 < 0) {
			this.anInt3026 = 0;
		}
		if (this.aClass330_Sub40_3030 != null) {
			this.aClass330_Sub40_3030.method3555(arg0);
		}
	}

	public static final void method2943(Class330_Sub40 arg0) {
		arg0.aBoolean7768 = false;
		if (arg0.aClass330_Sub29_7770 != null) {
			arg0.aClass330_Sub29_7770.anInt7720 = 0;
		}
		for (Class330_Sub40 var1 = arg0.method3552(); var1 != null; var1 = arg0.method3550()) {
			method2943(var1);
		}
	}

	public void method2944(Component arg0) throws Exception {
	}

	public void method2945(boolean arg0) {
	}

	public void method2946() throws Exception {
	}

	public final void method2947(int[] arg0, int arg1) {
		int var3 = arg1;
		if (aBoolean3023) {
			var3 = arg1 << 1;
		}
		Arrays.fill(arg0, 0, var3, 0);
		this.anInt3026 -= arg1;
		if (this.aClass330_Sub40_3030 != null && this.anInt3026 <= 0) {
			this.anInt3026 += anInt3047 >> 4;
			method2943(this.aClass330_Sub40_3030);
			this.method2941(this.aClass330_Sub40_3030, this.aClass330_Sub40_3030.method3551());
			int var4 = 0;
			int var5 = 255;
			int var6 = 7;
			Class330_Sub40 var10;
			label105: while (var5 != 0) {
				int var7;
				int var8;
				if (var6 < 0) {
					var7 = var6 & 0x3;
					var8 = -(var6 >> 2);
				} else {
					var7 = var6;
					var8 = 0;
				}
				for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
					if ((var9 & 0x1) != 0) {
						var5 &= ~(0x1 << var7);
						var10 = null;
						Class330_Sub40 var11 = this.aClass330_Sub40Array3048[var7];
						label99: while (true) {
							while (true) {
								if (var11 == null) {
									break label99;
								}
								Class330_Sub29 var12 = var11.aClass330_Sub29_7770;
								if (var12 == null || var12.anInt7720 <= var8) {
									var11.aBoolean7768 = true;
									int var13 = var11.method3562();
									var4 += var13;
									if (var12 != null) {
										var12.anInt7720 += var13;
									}
									if (var4 >= this.anInt3041) {
										break label105;
									}
									Class330_Sub40 var14 = var11.method3552();
									if (var14 != null) {
										int var15 = var11.anInt7769;
										while (var14 != null) {
											this.method2941(var14, var15 * var14.method3551() >> 8);
											var14 = var11.method3550();
										}
									}
									Class330_Sub40 var18 = var11.aClass330_Sub40_7771;
									var11.aClass330_Sub40_7771 = null;
									if (var10 == null) {
										this.aClass330_Sub40Array3048[var7] = var18;
									} else {
										var10.aClass330_Sub40_7771 = var18;
									}
									if (var18 == null) {
										this.aClass330_Sub40Array3049[var7] = var10;
									}
									var11 = var18;
								} else {
									var5 |= 0x1 << var7;
									var10 = var11;
									var11 = var11.aClass330_Sub40_7771;
								}
							}
						}
					}
					var7 += 4;
					var8++;
				}
				var6--;
			}
			for (var6 = 0; var6 < 8; var6++) {
				Class330_Sub40 var16 = this.aClass330_Sub40Array3048[var6];
				Class330_Sub40[] var17 = this.aClass330_Sub40Array3048;
				this.aClass330_Sub40Array3049[var6] = null;
				var17[var6] = null;
				while (var16 != null) {
					var10 = var16.aClass330_Sub40_7771;
					var16.aClass330_Sub40_7771 = null;
					var16 = var10;
				}
			}
		}
		if (this.anInt3026 < 0) {
			this.anInt3026 = 0;
		}
		if (this.aClass330_Sub40_3030 != null) {
			this.aClass330_Sub40_3030.method3564(arg0, 0, arg1);
		}
		this.aLong3037 = Class312.method3111((byte) 5);
	}

	public void method2948() throws Exception {
	}

	public void method2949(int arg0) throws Exception {
	}
}
