package deob;

import java.util.zip.CRC32;

public class Class282_Sub1 extends Class282 {

	public static int anInt7421 = 1;

	public static byte aByte7424 = 0;

	public static byte aByte7425 = 1;

	public static byte aByte7426 = -1;

	public static int anInt7435 = 0;

	public static int anInt7437 = 1000;

	public static int anInt7438 = 250;

	public static CRC32 aCRC32_7440 = new CRC32();

	public static int anInt7442 = 2;

	public int anInt7427 = 0;

	public Class497 aClass497_7439 = new Class497(16);

	public int anInt7432 = 0;

	public Class471 aClass471_7434 = new Class471();

	public long aLong7436 = 0L;

	public int anInt7422;

	public Class339 aClass339_7417;

	public boolean aBoolean7420;

	public Class471 aClass471_7433;

	public Class339 aClass339_7418;

	public Class285 aClass285_7415;

	public Class267 aClass267_7416;

	public int anInt7428;

	public byte[] aByteArray7414;

	public int anInt7429;

	public boolean aBoolean7441;

	public Class330_Sub36_Sub16 aClass330_Sub36_Sub16_7419;

	public Class278 aClass278_7423;

	public boolean aBoolean7430;

	public byte[] aByteArray7431;

	public static short[] aShortArray7443;

	public Class282_Sub1(int arg0, Class339 arg1, Class339 arg2, Class285 arg3, Class267 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
		this.anInt7422 = arg0;
		this.aClass339_7417 = arg1;
		if (this.aClass339_7417 == null) {
			this.aBoolean7420 = false;
		} else {
			this.aBoolean7420 = true;
			this.aClass471_7433 = new Class471();
		}
		this.aClass339_7418 = arg2;
		this.aClass285_7415 = arg3;
		this.aClass267_7416 = arg4;
		this.anInt7428 = arg5;
		this.aByteArray7414 = arg6;
		this.anInt7429 = arg7;
		this.aBoolean7441 = arg8;
		if (this.aClass339_7418 != null) {
			this.aClass330_Sub36_Sub16_7419 = this.aClass267_7416.method2649(this.anInt7422, this.aClass339_7418, (byte) 9);
		}
	}

	public int method2798(int arg0) {
		Class330_Sub36_Sub16 var2 = (Class330_Sub36_Sub16) this.aClass497_7439.method6094((long) arg0);
		return var2 == null ? 0 : var2.method3506((byte) 33);
	}

	public byte[] read(int arg0, byte arg1) {
		try {
			Class330_Sub36_Sub16 var3 = this.method2821(arg0, 0, -708504793);
			if (var3 == null) {
				return null;
			} else {
				byte[] var4 = var3.method3511(356740128);
				var3.method3252(1336328257);
				return var4;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "abu.j(" + ')');
		}
	}

	public int method2814(int arg0) {
		try {
			return this.aClass278_7423 == null ? 0 : this.aClass278_7423.anInt2883;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "abu.t(" + ')');
		}
	}

	public void method2815(int arg0) {
		try {
			if (this.aClass471_7433 != null && this.method2804((byte) 37) != null) {
				for (Class330 var2 = this.aClass471_7434.method5869(539664854); var2 != null; var2 = this.aClass471_7434.method5873((byte) -99)) {
					int var3 = (int) var2.aLong3341;
					if (var3 < 0 || var3 >= this.aClass278_7423.archiveSize || this.aClass278_7423.anIntArray2872[var3] == 0) {
						var2.method3252(-445398432);
					} else {
						if (this.aByteArray7431[var3] == 0) {
							this.method2821(var3, 1, 988876361);
						}
						if (this.aByteArray7431[var3] == -1) {
							this.method2821(var3, 2, -1716227022);
						}
						if (this.aByteArray7431[var3] == 1) {
							var2.method3252(745113656);
						}
					}
				}
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "abu.e(" + ')');
		}
	}

	public void method2816(byte arg0) {
		try {
			if (this.aClass471_7433 != null) {
				if (this.method2804((byte) 105) == null) {
					return;
				}
				boolean var2;
				Class330 var3;
				int var4;
				if (this.aBoolean7420) {
					var2 = true;
					for (var3 = this.aClass471_7433.method5869(539664854); var3 != null; var3 = this.aClass471_7433.method5873((byte) -111)) {
						var4 = (int) var3.aLong3341;
						if (this.aByteArray7431[var4] == 0) {
							this.method2821(var4, 1, -1108904907);
						}
						if (this.aByteArray7431[var4] == 0) {
							var2 = false;
						} else {
							var3.method3252(-1761912239);
						}
					}
					while (this.anInt7432 < this.aClass278_7423.anIntArray2872.length) {
						if (this.aClass278_7423.anIntArray2872[this.anInt7432] == 0) {
							this.anInt7432++;
						} else {
							if (this.aClass267_7416.anInt2737 >= 250) {
								var2 = false;
								break;
							}
							if (this.aByteArray7431[this.anInt7432] == 0) {
								this.method2821(this.anInt7432, 1, -1084005907);
							}
							if (this.aByteArray7431[this.anInt7432] == 0) {
								var3 = new Class330();
								var3.aLong3341 = (long) (this.anInt7432 * -265601633) * 1888788063L;
								this.aClass471_7433.method5878(var3, (short) 8192);
								var2 = false;
							}
							this.anInt7432++;
						}
					}
					if (var2) {
						this.aBoolean7420 = false;
						this.anInt7432 = 0;
					}
				} else if (this.aBoolean7430) {
					var2 = true;
					for (var3 = this.aClass471_7433.method5869(539664854); var3 != null; var3 = this.aClass471_7433.method5873((byte) -41)) {
						var4 = (int) var3.aLong3341;
						if (this.aByteArray7431[var4] != 1) {
							this.method2821(var4, 2, 1876055387);
						}
						if (this.aByteArray7431[var4] == 1) {
							var3.method3252(-1939721848);
						} else {
							var2 = false;
						}
					}
					while (this.anInt7432 < this.aClass278_7423.anIntArray2872.length) {
						if (this.aClass278_7423.anIntArray2872[this.anInt7432] == 0) {
							this.anInt7432++;
						} else {
							if (this.aClass285_7415.method2844((byte) 7)) {
								var2 = false;
								break;
							}
							if (this.aByteArray7431[this.anInt7432] != 1) {
								this.method2821(this.anInt7432, 2, -1781992553);
							}
							if (this.aByteArray7431[this.anInt7432] != 1) {
								var3 = new Class330();
								var3.aLong3341 = (long) (this.anInt7432 * -265601633) * 1888788063L;
								this.aClass471_7433.method5878(var3, (short) 8192);
								var2 = false;
							}
							this.anInt7432++;
						}
					}
					if (var2) {
						this.aBoolean7430 = false;
						this.anInt7432 = 0;
					}
				} else {
					this.aClass471_7433 = null;
				}
			}
			if (this.aBoolean7441 && Class312.method3111((byte) 22) >= this.aLong7436) {
				for (Class330_Sub36_Sub16 var6 = (Class330_Sub36_Sub16) this.aClass497_7439.method6099((byte) 54); var6 != null; var6 = (Class330_Sub36_Sub16) this.aClass497_7439.method6098((short) -32768)) {
					if (var6.aBoolean9721) {
						if (arg0 <= 15) {
							return;
						}
					} else if (var6.aBoolean9722) {
						if (!var6.aBoolean9723) {
							throw new RuntimeException();
						}
						var6.method3252(1438559418);
					} else {
						var6.aBoolean9722 = true;
					}
				}
				this.aLong7436 = Class312.method3111((byte) 26) + 1000L;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "abu.m(" + ')');
		}
	}

	public int method2817(int arg0) {
		try {
			return this.anInt7427;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "abu.h(" + ')');
		}
	}

	public int method2818(int arg0) {
		try {
			if (this.aClass278_7423 == null) {
				return 0;
			} else if (this.aBoolean7420) {
				Class330 var2 = this.aClass471_7433.method5869(539664854);
				return var2 == null ? 0 : (int) var2.aLong3341;
			} else {
				return this.aClass278_7423.anInt2883;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "abu.y(" + ')');
		}
	}

	public void method2819(int arg0) {
		try {
			if (this.aClass339_7417 != null) {
				this.aBoolean7430 = true;
				if (this.aClass471_7433 == null) {
					this.aClass471_7433 = new Class471();
				}
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "abu.v(" + ')');
		}
	}

	public void method2796(int arg0, int arg1) {
		try {
			if (this.aClass339_7417 != null) {
				Class330 var3;
				for (var3 = this.aClass471_7434.method5869(539664854); var3 != null; var3 = this.aClass471_7434.method5873((byte) -46)) {
					if (var3.aLong3341 == (long) arg0) {
						return;
					}
				}
				var3 = new Class330();
				var3.aLong3341 = arg0;
				this.aClass471_7434.method5878(var3, (short) 8192);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "abu.i(" + ')');
		}
	}

	public int method2797(int arg0, short arg1) {
		try {
			Class330_Sub36_Sub16 var3 = (Class330_Sub36_Sub16) this.aClass497_7439.method6094((long) arg0);
			return var3 == null ? 0 : var3.method3506((byte) -21);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "abu.p(" + ')');
		}
	}

	public Class278 method2793() {
		if (this.aClass278_7423 != null) {
			return this.aClass278_7423;
		}
		if (this.aClass330_Sub36_Sub16_7419 == null) {
			if (this.aClass285_7415.method2833((byte) 2)) {
				return null;
			}
			this.aClass330_Sub36_Sub16_7419 = this.aClass285_7415.method2832(255, this.anInt7422 * 83252385 * 1726254945, (byte) 0, true, (byte) -115);
		}
		if (this.aClass330_Sub36_Sub16_7419.aBoolean9721) {
			return null;
		}
		byte[] var1 = this.aClass330_Sub36_Sub16_7419.method3511(356740128);
		if (this.aClass330_Sub36_Sub16_7419 instanceof Class330_Sub36_Sub16_Sub1) {
			try {
				if (var1 == null) {
					throw new RuntimeException();
				}
				this.aClass278_7423 = new Class278(var1, this.anInt7428 * -1598705661 * -1516864853, this.aByteArray7414);
				if (this.aClass278_7423.anInt2874 * 187081643 * 265240323 != this.anInt7429 * -505581729 * -1512264545) {
					throw new RuntimeException();
				}
			} catch (RuntimeException var3) {
				this.aClass278_7423 = null;
				if (this.aClass285_7415.method2833((byte) 2)) {
					this.aClass330_Sub36_Sub16_7419 = null;
				} else {
					this.aClass330_Sub36_Sub16_7419 = this.aClass285_7415.method2832(255, this.anInt7422 * 83252385 * 1726254945, (byte) 0, true, (byte) -85);
				}
				return null;
			}
		} else {
			try {
				if (var1 == null) {
					throw new RuntimeException();
				}
				this.aClass278_7423 = new Class278(var1, this.anInt7428 * -1598705661 * -1516864853, this.aByteArray7414);
			} catch (RuntimeException var4) {
				this.aClass285_7415.method2836(2109587941);
				this.aClass278_7423 = null;
				if (this.aClass285_7415.method2833((byte) 2)) {
					this.aClass330_Sub36_Sub16_7419 = null;
				} else {
					this.aClass330_Sub36_Sub16_7419 = this.aClass285_7415.method2832(255, this.anInt7422 * 1726254945 * 83252385, (byte) 0, true, (byte) -36);
				}
				return null;
			}
			if (this.aClass339_7418 != null) {
				this.aClass267_7416.method2652(this.anInt7422 * 83252385 * 1726254945, var1, this.aClass339_7418, -1869465837);
			}
		}
		this.aClass330_Sub36_Sub16_7419 = null;
		if (this.aClass339_7417 != null) {
			this.aByteArray7431 = new byte[this.aClass278_7423.archiveSize * 554055083 * 1334516995];
			this.anInt7427 = 0 * 654102305;
		}
		return this.aClass278_7423;
	}

	public void method2805(int arg0) {
		if (this.aClass339_7417 == null) {
			return;
		}
		Class330 var2;
		for (var2 = this.aClass471_7434.method5869(539664854); var2 != null; var2 = this.aClass471_7434.method5873((byte) -38)) {
			if (var2.aLong3341 * -6154793640677333111L * -1420004262915178823L == (long) arg0) {
				return;
			}
		}
		var2 = new Class330();
		var2.aLong3341 = (long) arg0 * -1420004262915178823L * -6154793640677333111L;
		this.aClass471_7434.method5878(var2, (short) 8192);
	}

	public int method2820(short arg0) {
		try {
			if (this.method2804((byte) 107) == null) {
				return this.aClass330_Sub36_Sub16_7419 == null ? 0 : this.aClass330_Sub36_Sub16_7419.method3506((byte) 79);
			} else {
				return 100;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "abu.c(" + ')');
		}
	}

	public byte[] method2794(int arg0) {
		Class330_Sub36_Sub16 var2 = this.method2821(arg0, 0, -2006932428);
		if (var2 == null) {
			return null;
		} else {
			byte[] var3 = var2.method3511(356740128);
			var2.method3252(1005229954);
			return var3;
		}
	}

	public byte[] method2802(int arg0) {
		Class330_Sub36_Sub16 var2 = this.method2821(arg0, 0, -1220713350);
		if (var2 == null) {
			return null;
		} else {
			byte[] var3 = var2.method3511(356740128);
			var2.method3252(-530121896);
			return var3;
		}
	}

	public byte[] method2803(int arg0) {
		Class330_Sub36_Sub16 var2 = this.method2821(arg0, 0, -1637769584);
		if (var2 == null) {
			return null;
		} else {
			byte[] var3 = var2.method3511(356740128);
			var2.method3252(-1323530776);
			return var3;
		}
	}

	public Class330_Sub36_Sub16 method2821(int arg0, int arg1, int arg2) {
		try {
			Class330_Sub36_Sub16 var4 = (Class330_Sub36_Sub16) this.aClass497_7439.method6094((long) arg0);
			if (var4 != null && arg1 == 0 && !var4.aBoolean9723 && var4.aBoolean9721) {
				var4.method3252(-1174528287);
				var4 = null;
			}
			if (var4 == null) {
				if (arg1 == 0) {
					if (this.aClass339_7417 == null || this.aByteArray7431[arg0] == -1) {
						if (this.aClass285_7415.method2833((byte) 2)) {
							return null;
						}
						var4 = this.aClass285_7415.method2832(this.anInt7422, arg0, (byte) 2, true, (byte) -109);
					} else {
						var4 = this.aClass267_7416.method2649(arg0, this.aClass339_7417, (byte) 122);
					}
				} else if (arg1 == 1) {
					if (this.aClass339_7417 == null) {
						throw new RuntimeException();
					}
					var4 = this.aClass267_7416.method2651(arg0, this.aClass339_7417, 650742825);
				} else if (arg1 == 2) {
					if (this.aClass339_7417 == null) {
						throw new RuntimeException();
					}
					if (this.aByteArray7431[arg0] != -1) {
						throw new RuntimeException();
					}
					if (this.aClass285_7415.method2844((byte) 36)) {
						return null;
					}
					var4 = this.aClass285_7415.method2832(this.anInt7422, arg0, (byte) 2, false, (byte) -46);
				} else {
					throw new RuntimeException();
				}
				this.aClass497_7439.method6097(var4, (long) arg0);
			}
			if (var4.aBoolean9721) {
				return null;
			}
			byte[] var5 = var4.method3511(356740128);
			byte[] var8;
			if (!(var4 instanceof Class330_Sub36_Sub16_Sub1)) {
				try {
					if (var5 == null || var5.length <= 2) {
						throw new RuntimeException();
					}
					aCRC32_7440.reset();
					aCRC32_7440.update(var5, 0, var5.length - 2);
					int var6 = (int) aCRC32_7440.getValue();
					if (var6 != this.aClass278_7423.anIntArray2878[arg0]) {
						throw new RuntimeException();
					}
					if (this.aClass278_7423.aByteArrayArray2879 != null && this.aClass278_7423.aByteArrayArray2879[arg0] != null) {
						byte[] var15 = this.aClass278_7423.aByteArrayArray2879[arg0];
						var8 = Class562.method6473(var5, 0, var5.length - 2, (byte) -125);
						for (int var9 = 0; var9 < 64; var9++) {
							if (var8[var9] != var15[var9]) {
								throw new RuntimeException();
							}
						}
					}
					this.aClass285_7415.anInt2941 = 0;
					this.aClass285_7415.anInt2932 = 0;
				} catch (RuntimeException var12) {
					this.aClass285_7415.method2836(2028855050);
					var4.method3252(675504416);
					if (var4.aBoolean9723 && !this.aClass285_7415.method2833((byte) 2)) {
						Class330_Sub36_Sub16_Sub2 var7 = this.aClass285_7415.method2832(this.anInt7422, arg0, (byte) 2, true, (byte) -69);
						this.aClass497_7439.method6097(var7, (long) arg0);
					}
					return null;
				}
				var5[var5.length - 2] = (byte) (this.aClass278_7423.anIntArray2880[arg0] >>> 8);
				var5[var5.length - 1] = (byte) this.aClass278_7423.anIntArray2880[arg0];
				if (this.aClass339_7417 != null) {
					this.aClass267_7416.method2652(arg0, var5, this.aClass339_7417, 681967698);
					if (this.aByteArray7431[arg0] != 1) {
						this.anInt7427++;
						this.aByteArray7431[arg0] = 1;
					}
				}
				if (!var4.aBoolean9723) {
					var4.method3252(24153533);
				}
				return var4;
			}
			try {
				if (var5 == null || var5.length <= 2) {
					throw new RuntimeException();
				}
				aCRC32_7440.reset();
				aCRC32_7440.update(var5, 0, var5.length - 2);
				int var16 = (int) aCRC32_7440.getValue();
				if (var16 != this.aClass278_7423.anIntArray2878[arg0]) {
					throw new RuntimeException();
				}
				if (this.aClass278_7423.aByteArrayArray2879 != null && this.aClass278_7423.aByteArrayArray2879[arg0] != null) {
					var8 = this.aClass278_7423.aByteArrayArray2879[arg0];
					byte[] var19 = Class562.method6473(var5, 0, var5.length - 2, (byte) -87);
					for (int var10 = 0; var10 < 64; var10++) {
						if (var19[var10] != var8[var10]) {
							throw new RuntimeException();
						}
					}
				}
				int var18 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
				if (var18 != (this.aClass278_7423.anIntArray2880[arg0] & 0xFFFF)) {
					throw new RuntimeException();
				}
				if (this.aByteArray7431[arg0] != 1) {
					if (this.aByteArray7431[arg0] != 0) {
					}
					this.anInt7427++;
					this.aByteArray7431[arg0] = 1;
				}
				if (!var4.aBoolean9723) {
					var4.method3252(-247918713);
				}
				Class330_Sub36_Sub16 var14 = var4;
				return var14;
			} catch (Exception var11) {
				this.aByteArray7431[arg0] = -1;
				var4.method3252(375307671);
				if (var4.aBoolean9723 && !this.aClass285_7415.method2833((byte) 2)) {
					Class330_Sub36_Sub16_Sub2 var17 = this.aClass285_7415.method2832(this.anInt7422, arg0, (byte) 2, true, (byte) -65);
					this.aClass497_7439.method6097(var17, (long) arg0);
				}
				return null;
			}
		} catch (RuntimeException var13) {
			throw Class476.method5964(var13, "abu.a(" + ')');
		}
	}

	public void method2807(int arg0) {
		if (this.aClass339_7417 == null) {
			return;
		}
		Class330 var2;
		for (var2 = this.aClass471_7434.method5869(539664854); var2 != null; var2 = this.aClass471_7434.method5873((byte) -105)) {
			if (var2.aLong3341 * -6154793640677333111L * -1420004262915178823L == (long) arg0) {
				return;
			}
		}
		var2 = new Class330();
		var2.aLong3341 = (long) arg0 * -1420004262915178823L * -6154793640677333111L;
		this.aClass471_7434.method5878(var2, (short) 8192);
	}

	public Class330_Sub36_Sub16 method2822(int arg0, int arg1) {
		Class330_Sub36_Sub16 var3 = (Class330_Sub36_Sub16) this.aClass497_7439.method6094((long) arg0);
		if (var3 != null && arg1 == 0 && !var3.aBoolean9723 && var3.aBoolean9721) {
			var3.method3252(396956555);
			var3 = null;
		}
		if (var3 == null) {
			if (arg1 == 0) {
				if (this.aClass339_7417 == null || this.aByteArray7431[arg0] == -1) {
					if (this.aClass285_7415.method2833((byte) 2)) {
						return null;
					}
					var3 = this.aClass285_7415.method2832(this.anInt7422 * 1726254945 * 83252385, arg0, (byte) 2, true, (byte) -106);
				} else {
					var3 = this.aClass267_7416.method2649(arg0, this.aClass339_7417, (byte) 108);
				}
			} else if (arg1 == 1) {
				if (this.aClass339_7417 == null) {
					throw new RuntimeException();
				}
				var3 = this.aClass267_7416.method2651(arg0, this.aClass339_7417, -1372477285);
			} else if (arg1 == 2) {
				if (this.aClass339_7417 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray7431[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass285_7415.method2844((byte) 56)) {
					return null;
				}
				var3 = this.aClass285_7415.method2832(this.anInt7422 * 1726254945 * 83252385, arg0, (byte) 2, false, (byte) -33);
			} else {
				throw new RuntimeException();
			}
			this.aClass497_7439.method6097(var3, (long) arg0);
		}
		if (var3.aBoolean9721) {
			return null;
		}
		byte[] var4 = var3.method3511(356740128);
		byte[] var7;
		if (!(var3 instanceof Class330_Sub36_Sub16_Sub1)) {
			try {
				label162: {
					if (var4 != null && var4.length > 2) {
						aCRC32_7440.reset();
						aCRC32_7440.update(var4, 0, var4.length - 2);
						int var5 = (int) aCRC32_7440.getValue();
						if (var5 != this.aClass278_7423.anIntArray2878[arg0]) {
							throw new RuntimeException();
						}
						if (this.aClass278_7423.aByteArrayArray2879 == null || this.aClass278_7423.aByteArrayArray2879[arg0] == null) {
							break label162;
						}
						byte[] var12 = this.aClass278_7423.aByteArrayArray2879[arg0];
						var7 = Class562.method6473(var4, 0, var4.length - 2, (byte) -14);
						int var8 = 0;
						while (true) {
							if (var8 >= 64) {
								break label162;
							}
							if (var7[var8] != var12[var8]) {
								throw new RuntimeException();
							}
							var8++;
						}
					}
					throw new RuntimeException();
				}
				this.aClass285_7415.anInt2941 = 0 * 1048270057;
				this.aClass285_7415.anInt2932 = 0 * -1288212373;
			} catch (RuntimeException var11) {
				this.aClass285_7415.method2836(1982838528);
				var3.method3252(1119055332);
				if (var3.aBoolean9723 && !this.aClass285_7415.method2833((byte) 2)) {
					Class330_Sub36_Sub16_Sub2 var6 = this.aClass285_7415.method2832(this.anInt7422 * 1726254945 * 83252385, arg0, (byte) 2, true, (byte) -72);
					this.aClass497_7439.method6097(var6, (long) arg0);
				}
				return null;
			}
			var4[var4.length - 2] = (byte) (this.aClass278_7423.anIntArray2880[arg0] >>> 8);
			var4[var4.length - 1] = (byte) this.aClass278_7423.anIntArray2880[arg0];
			if (this.aClass339_7417 != null) {
				this.aClass267_7416.method2652(arg0, var4, this.aClass339_7417, 1741459170);
				if (this.aByteArray7431[arg0] != 1) {
					this.anInt7427 = (this.anInt7427 * 2123592929 + 2123592929) * 654102305;
					this.aByteArray7431[arg0] = 1;
				}
			}
			if (!var3.aBoolean9723) {
				var3.method3252(-589580067);
			}
			return var3;
		}
		try {
			if (var4 == null || var4.length <= 2) {
				throw new RuntimeException();
			}
			aCRC32_7440.reset();
			aCRC32_7440.update(var4, 0, var4.length - 2);
			int var13 = (int) aCRC32_7440.getValue();
			if (var13 != this.aClass278_7423.anIntArray2878[arg0]) {
				throw new RuntimeException();
			}
			if (this.aClass278_7423.aByteArrayArray2879 != null && this.aClass278_7423.aByteArrayArray2879[arg0] != null) {
				var7 = this.aClass278_7423.aByteArrayArray2879[arg0];
				byte[] var16 = Class562.method6473(var4, 0, var4.length - 2, (byte) -100);
				for (int var9 = 0; var9 < 64; var9++) {
					if (var16[var9] != var7[var9]) {
						throw new RuntimeException();
					}
				}
			}
			int var15 = ((var4[var4.length - 2] & 0xFF) << 8) + (var4[var4.length - 1] & 0xFF);
			if (var15 != (this.aClass278_7423.anIntArray2880[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray7431[arg0] != 1) {
				if (this.aByteArray7431[arg0] != 0) {
				}
				this.anInt7427 = (this.anInt7427 * 2123592929 + 2123592929) * 654102305;
				this.aByteArray7431[arg0] = 1;
			}
			if (!var3.aBoolean9723) {
				var3.method3252(941346893);
			}
			return var3;
		} catch (Exception var10) {
			this.aByteArray7431[arg0] = -1;
			var3.method3252(-772592185);
			if (var3.aBoolean9723 && !this.aClass285_7415.method2833((byte) 2)) {
				Class330_Sub36_Sub16_Sub2 var14 = this.aClass285_7415.method2832(this.anInt7422 * 1726254945 * 83252385, arg0, (byte) 2, true, (byte) -6);
				this.aClass497_7439.method6097(var14, (long) arg0);
			}
			return null;
		}
	}

	public void method2806(int arg0) {
		if (this.aClass339_7417 == null) {
			return;
		}
		Class330 var2;
		for (var2 = this.aClass471_7434.method5869(539664854); var2 != null; var2 = this.aClass471_7434.method5873((byte) -78)) {
			if (var2.aLong3341 * -6154793640677333111L * -1420004262915178823L == (long) arg0) {
				return;
			}
		}
		var2 = new Class330();
		var2.aLong3341 = (long) arg0 * -1420004262915178823L * -6154793640677333111L;
		this.aClass471_7434.method5878(var2, (short) 8192);
	}

	public Class278 method2799() {
		if (this.aClass278_7423 != null) {
			return this.aClass278_7423;
		}
		if (this.aClass330_Sub36_Sub16_7419 == null) {
			if (this.aClass285_7415.method2833((byte) 2)) {
				return null;
			}
			this.aClass330_Sub36_Sub16_7419 = this.aClass285_7415.method2832(255, this.anInt7422 * 83252385 * 1726254945, (byte) 0, true, (byte) -56);
		}
		if (this.aClass330_Sub36_Sub16_7419.aBoolean9721) {
			return null;
		}
		byte[] var1 = this.aClass330_Sub36_Sub16_7419.method3511(356740128);
		if (this.aClass330_Sub36_Sub16_7419 instanceof Class330_Sub36_Sub16_Sub1) {
			try {
				if (var1 == null) {
					throw new RuntimeException();
				}
				this.aClass278_7423 = new Class278(var1, this.anInt7428 * -1598705661 * -1516864853, this.aByteArray7414);
				if (this.aClass278_7423.anInt2874 * 187081643 * 265240323 != this.anInt7429 * -505581729 * -1512264545) {
					throw new RuntimeException();
				}
			} catch (RuntimeException var3) {
				this.aClass278_7423 = null;
				if (this.aClass285_7415.method2833((byte) 2)) {
					this.aClass330_Sub36_Sub16_7419 = null;
				} else {
					this.aClass330_Sub36_Sub16_7419 = this.aClass285_7415.method2832(255, this.anInt7422 * 83252385 * 1726254945, (byte) 0, true, (byte) -43);
				}
				return null;
			}
		} else {
			try {
				if (var1 == null) {
					throw new RuntimeException();
				}
				this.aClass278_7423 = new Class278(var1, this.anInt7428 * -1598705661 * -1516864853, this.aByteArray7414);
			} catch (RuntimeException var4) {
				this.aClass285_7415.method2836(1990457273);
				this.aClass278_7423 = null;
				if (this.aClass285_7415.method2833((byte) 2)) {
					this.aClass330_Sub36_Sub16_7419 = null;
				} else {
					this.aClass330_Sub36_Sub16_7419 = this.aClass285_7415.method2832(255, this.anInt7422 * 1726254945 * 83252385, (byte) 0, true, (byte) -70);
				}
				return null;
			}
			if (this.aClass339_7418 != null) {
				this.aClass267_7416.method2652(this.anInt7422 * 83252385 * 1726254945, var1, this.aClass339_7418, -1475069715);
			}
		}
		this.aClass330_Sub36_Sub16_7419 = null;
		if (this.aClass339_7417 != null) {
			this.aByteArray7431 = new byte[this.aClass278_7423.archiveSize * 554055083 * 1334516995];
			this.anInt7427 = 0 * 654102305;
		}
		return this.aClass278_7423;
	}

	public int method2809(int arg0) {
		Class330_Sub36_Sub16 var2 = (Class330_Sub36_Sub16) this.aClass497_7439.method6094((long) arg0);
		return var2 == null ? 0 : var2.method3506((byte) 42);
	}

	public Class330_Sub36_Sub16 method2823(int arg0, int arg1) {
		Class330_Sub36_Sub16 var3 = (Class330_Sub36_Sub16) this.aClass497_7439.method6094((long) arg0);
		if (var3 != null && arg1 == 0 && !var3.aBoolean9723 && var3.aBoolean9721) {
			var3.method3252(1270212212);
			var3 = null;
		}
		if (var3 == null) {
			if (arg1 == 0) {
				if (this.aClass339_7417 == null || this.aByteArray7431[arg0] == -1) {
					if (this.aClass285_7415.method2833((byte) 2)) {
						return null;
					}
					var3 = this.aClass285_7415.method2832(this.anInt7422 * 1726254945 * 83252385, arg0, (byte) 2, true, (byte) -127);
				} else {
					var3 = this.aClass267_7416.method2649(arg0, this.aClass339_7417, (byte) 96);
				}
			} else if (arg1 == 1) {
				if (this.aClass339_7417 == null) {
					throw new RuntimeException();
				}
				var3 = this.aClass267_7416.method2651(arg0, this.aClass339_7417, -1315817421);
			} else if (arg1 == 2) {
				if (this.aClass339_7417 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray7431[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass285_7415.method2844((byte) 82)) {
					return null;
				}
				var3 = this.aClass285_7415.method2832(this.anInt7422 * 1726254945 * 83252385, arg0, (byte) 2, false, (byte) -50);
			} else {
				throw new RuntimeException();
			}
			this.aClass497_7439.method6097(var3, (long) arg0);
		}
		if (var3.aBoolean9721) {
			return null;
		}
		byte[] var4 = var3.method3511(356740128);
		byte[] var7;
		if (!(var3 instanceof Class330_Sub36_Sub16_Sub1)) {
			try {
				label162: {
					if (var4 != null && var4.length > 2) {
						aCRC32_7440.reset();
						aCRC32_7440.update(var4, 0, var4.length - 2);
						int var5 = (int) aCRC32_7440.getValue();
						if (var5 != this.aClass278_7423.anIntArray2878[arg0]) {
							throw new RuntimeException();
						}
						if (this.aClass278_7423.aByteArrayArray2879 == null || this.aClass278_7423.aByteArrayArray2879[arg0] == null) {
							break label162;
						}
						byte[] var12 = this.aClass278_7423.aByteArrayArray2879[arg0];
						var7 = Class562.method6473(var4, 0, var4.length - 2, (byte) -96);
						int var8 = 0;
						while (true) {
							if (var8 >= 64) {
								break label162;
							}
							if (var7[var8] != var12[var8]) {
								throw new RuntimeException();
							}
							var8++;
						}
					}
					throw new RuntimeException();
				}
				this.aClass285_7415.anInt2941 = 0 * 1048270057;
				this.aClass285_7415.anInt2932 = 0 * -1288212373;
			} catch (RuntimeException var11) {
				this.aClass285_7415.method2836(1956559192);
				var3.method3252(-2026285854);
				if (var3.aBoolean9723 && !this.aClass285_7415.method2833((byte) 2)) {
					Class330_Sub36_Sub16_Sub2 var6 = this.aClass285_7415.method2832(this.anInt7422 * 1726254945 * 83252385, arg0, (byte) 2, true, (byte) -121);
					this.aClass497_7439.method6097(var6, (long) arg0);
				}
				return null;
			}
			var4[var4.length - 2] = (byte) (this.aClass278_7423.anIntArray2880[arg0] >>> 8);
			var4[var4.length - 1] = (byte) this.aClass278_7423.anIntArray2880[arg0];
			if (this.aClass339_7417 != null) {
				this.aClass267_7416.method2652(arg0, var4, this.aClass339_7417, 170355722);
				if (this.aByteArray7431[arg0] != 1) {
					this.anInt7427 = (this.anInt7427 * 2123592929 + 2123592929) * 654102305;
					this.aByteArray7431[arg0] = 1;
				}
			}
			if (!var3.aBoolean9723) {
				var3.method3252(-854194468);
			}
			return var3;
		}
		try {
			if (var4 == null || var4.length <= 2) {
				throw new RuntimeException();
			}
			aCRC32_7440.reset();
			aCRC32_7440.update(var4, 0, var4.length - 2);
			int var13 = (int) aCRC32_7440.getValue();
			if (var13 != this.aClass278_7423.anIntArray2878[arg0]) {
				throw new RuntimeException();
			}
			if (this.aClass278_7423.aByteArrayArray2879 != null && this.aClass278_7423.aByteArrayArray2879[arg0] != null) {
				var7 = this.aClass278_7423.aByteArrayArray2879[arg0];
				byte[] var16 = Class562.method6473(var4, 0, var4.length - 2, (byte) -34);
				for (int var9 = 0; var9 < 64; var9++) {
					if (var16[var9] != var7[var9]) {
						throw new RuntimeException();
					}
				}
			}
			int var15 = ((var4[var4.length - 2] & 0xFF) << 8) + (var4[var4.length - 1] & 0xFF);
			if (var15 != (this.aClass278_7423.anIntArray2880[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray7431[arg0] != 1) {
				if (this.aByteArray7431[arg0] != 0) {
				}
				this.anInt7427 = (this.anInt7427 * 2123592929 + 2123592929) * 654102305;
				this.aByteArray7431[arg0] = 1;
			}
			if (!var3.aBoolean9723) {
				var3.method3252(-959928223);
			}
			return var3;
		} catch (Exception var10) {
			this.aByteArray7431[arg0] = -1;
			var3.method3252(-855057364);
			if (var3.aBoolean9723 && !this.aClass285_7415.method2833((byte) 2)) {
				Class330_Sub36_Sub16_Sub2 var14 = this.aClass285_7415.method2832(this.anInt7422 * 1726254945 * 83252385, arg0, (byte) 2, true, (byte) -114);
				this.aClass497_7439.method6097(var14, (long) arg0);
			}
			return null;
		}
	}

	public void method2795(int arg0) {
		if (this.aClass339_7417 == null) {
			return;
		}
		Class330 var2;
		for (var2 = this.aClass471_7434.method5869(539664854); var2 != null; var2 = this.aClass471_7434.method5873((byte) -10)) {
			if (var2.aLong3341 * -6154793640677333111L * -1420004262915178823L == (long) arg0) {
				return;
			}
		}
		var2 = new Class330();
		var2.aLong3341 = (long) arg0 * -1420004262915178823L * -6154793640677333111L;
		this.aClass471_7434.method5878(var2, (short) 8192);
	}

	public void method2824(int arg0, byte[] arg1, int arg2, int arg3) {
		try {
			if (this.anInt7428 == arg0 && this.anInt7429 == arg2) {
				boolean var5 = true;
				for (int var6 = 0; var6 < this.aByteArray7414.length; var6++) {
					if (this.aByteArray7414[var6] != arg1[var6]) {
						var5 = false;
						break;
					}
				}
				if (var5) {
					return;
				}
			}
			this.anInt7428 = arg0;
			this.aByteArray7414 = arg1;
			this.anInt7429 = arg2;
			this.aClass278_7423 = null;
			this.aClass330_Sub36_Sub16_7419 = null;
			if (!this.aClass285_7415.method2833((byte) 2)) {
				this.aClass330_Sub36_Sub16_7419 = this.aClass285_7415.method2832(255, this.anInt7422, (byte) 0, true, (byte) -107);
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "abu.d(" + ')');
		}
	}

	public Class278 method2800() {
		if (this.aClass278_7423 != null) {
			return this.aClass278_7423;
		}
		if (this.aClass330_Sub36_Sub16_7419 == null) {
			if (this.aClass285_7415.method2833((byte) 2)) {
				return null;
			}
			this.aClass330_Sub36_Sub16_7419 = this.aClass285_7415.method2832(255, this.anInt7422 * 83252385 * 1726254945, (byte) 0, true, (byte) -1);
		}
		if (this.aClass330_Sub36_Sub16_7419.aBoolean9721) {
			return null;
		}
		byte[] var1 = this.aClass330_Sub36_Sub16_7419.method3511(356740128);
		if (this.aClass330_Sub36_Sub16_7419 instanceof Class330_Sub36_Sub16_Sub1) {
			try {
				if (var1 == null) {
					throw new RuntimeException();
				}
				this.aClass278_7423 = new Class278(var1, this.anInt7428 * -1598705661 * -1516864853, this.aByteArray7414);
				if (this.aClass278_7423.anInt2874 * 187081643 * 265240323 != this.anInt7429 * -505581729 * -1512264545) {
					throw new RuntimeException();
				}
			} catch (RuntimeException var3) {
				this.aClass278_7423 = null;
				if (this.aClass285_7415.method2833((byte) 2)) {
					this.aClass330_Sub36_Sub16_7419 = null;
				} else {
					this.aClass330_Sub36_Sub16_7419 = this.aClass285_7415.method2832(255, this.anInt7422 * 83252385 * 1726254945, (byte) 0, true, (byte) -113);
				}
				return null;
			}
		} else {
			try {
				if (var1 == null) {
					throw new RuntimeException();
				}
				this.aClass278_7423 = new Class278(var1, this.anInt7428 * -1598705661 * -1516864853, this.aByteArray7414);
			} catch (RuntimeException var4) {
				this.aClass285_7415.method2836(2005909325);
				this.aClass278_7423 = null;
				if (this.aClass285_7415.method2833((byte) 2)) {
					this.aClass330_Sub36_Sub16_7419 = null;
				} else {
					this.aClass330_Sub36_Sub16_7419 = this.aClass285_7415.method2832(255, this.anInt7422 * 1726254945 * 83252385, (byte) 0, true, (byte) -98);
				}
				return null;
			}
			if (this.aClass339_7418 != null) {
				this.aClass267_7416.method2652(this.anInt7422 * 83252385 * 1726254945, var1, this.aClass339_7418, -1865937593);
			}
		}
		this.aClass330_Sub36_Sub16_7419 = null;
		if (this.aClass339_7417 != null) {
			this.aByteArray7431 = new byte[this.aClass278_7423.archiveSize * 554055083 * 1334516995];
			this.anInt7427 = 0 * 654102305;
		}
		return this.aClass278_7423;
	}

	public Class278 method2804(byte arg0) {
		try {
			if (this.aClass278_7423 != null) {
				return this.aClass278_7423;
			}
			if (this.aClass330_Sub36_Sub16_7419 == null) {
				if (this.aClass285_7415.method2833((byte) 2)) {
					return null;
				}
				this.aClass330_Sub36_Sub16_7419 = this.aClass285_7415.method2832(255, this.anInt7422, (byte) 0, true, (byte) -109);
			}
			if (this.aClass330_Sub36_Sub16_7419.aBoolean9721) {
				return null;
			}
			byte[] var2 = this.aClass330_Sub36_Sub16_7419.method3511(356740128);
			if (this.aClass330_Sub36_Sub16_7419 instanceof Class330_Sub36_Sub16_Sub1) {
				try {
					if (var2 == null) {
						throw new RuntimeException();
					}
					this.aClass278_7423 = new Class278(var2, this.anInt7428, this.aByteArray7414);
					if (this.aClass278_7423.anInt2874 != this.anInt7429) {
						throw new RuntimeException();
					}
				} catch (RuntimeException var4) {
					this.aClass278_7423 = null;
					if (this.aClass285_7415.method2833((byte) 2)) {
						this.aClass330_Sub36_Sub16_7419 = null;
					} else {
						this.aClass330_Sub36_Sub16_7419 = this.aClass285_7415.method2832(255, this.anInt7422, (byte) 0, true, (byte) -54);
					}
					return null;
				}
			} else {
				try {
					if (var2 == null) {
						throw new RuntimeException();
					}
					this.aClass278_7423 = new Class278(var2, this.anInt7428, this.aByteArray7414);
				} catch (RuntimeException var5) {
					this.aClass285_7415.method2836(2024384844);
					this.aClass278_7423 = null;
					if (this.aClass285_7415.method2833((byte) 2)) {
						this.aClass330_Sub36_Sub16_7419 = null;
					} else {
						this.aClass330_Sub36_Sub16_7419 = this.aClass285_7415.method2832(255, this.anInt7422, (byte) 0, true, (byte) -63);
					}
					return null;
				}
				if (this.aClass339_7418 != null) {
					this.aClass267_7416.method2652(this.anInt7422, var2, this.aClass339_7418, -2033978310);
				}
			}
			this.aClass330_Sub36_Sub16_7419 = null;
			if (this.aClass339_7417 != null) {
				this.aByteArray7431 = new byte[this.aClass278_7423.archiveSize];
				this.anInt7427 = 0;
			}
			return this.aClass278_7423;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "abu.r(" + ')');
		}
	}

	public int method2808(int arg0) {
		Class330_Sub36_Sub16 var2 = (Class330_Sub36_Sub16) this.aClass497_7439.method6094((long) arg0);
		return var2 == null ? 0 : var2.method3506((byte) -28);
	}
}
