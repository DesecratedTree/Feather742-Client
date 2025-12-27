package deob;

public abstract class Class432_Sub1_Sub5 extends Class432_Sub1 {

	public static int anInt9928 = 8;

	public static int anInt9929 = 4;

	public static int anInt9930 = 1;

	public static int anInt9932 = 16;

	public static int anInt9933 = 32;

	public static int anInt9934 = 64;

	public static int anInt9935 = 2;

	public static int[] anIntArray9936 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	public static int anInt9937 = 128;

	public short aShort9931;

	public boolean method5372(Class_ra arg0, int arg1) {
		try {
			Class260 var3 = this.method5346().aClass260_2606;
			return this.aClass356_8655.aClass358_3649.method4230(this, this.aByte8654, (int) var3.aFloat2716 >> this.aClass356_8655.anInt3641, (int) var3.aFloat2711 >> this.aClass356_8655.anInt3641);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "akq.gb(" + ')');
		}
	}

	public boolean method5365(Class_ra arg0) {
		Class260 var2 = this.method5346().aClass260_2606;
		return this.aClass356_8655.aClass358_3649.method4230(this, this.aByte8654, (int) var2.aFloat2716 >> this.aClass356_8655.anInt3641 * -1075721091 * 916917461, (int) var2.aFloat2711 >> this.aClass356_8655.anInt3641 * 916917461 * -1075721091);
	}

	public int method5368(Class330_Sub14[] arg0, byte arg1) {
		try {
			Class260 var3 = this.method5346().aClass260_2606;
			int var4 = (int) var3.aFloat2716 >> this.aClass356_8655.anInt3641;
			int var5 = (int) var3.aFloat2711 >> this.aClass356_8655.anInt3641;
			int var6 = 0;
			if (var4 == this.aClass356_8655.anInt3640) {
				var6++;
			} else if (this.aClass356_8655.anInt3640 < var4) {
				var6 += 2;
			}
			if (var5 == this.aClass356_8655.anInt3651) {
				var6 += 3;
			} else if (this.aClass356_8655.anInt3651 > var5) {
				var6 += 6;
			}
			int var7 = anIntArray9936[var6];
			if ((this.aShort9931 & var7) != 0) {
				return this.method5371(var4, var5, arg0, (byte) 58);
			} else if (this.aShort9931 == 1 && var4 > 0) {
				return this.method5371(var4 - 1, var5, arg0, (byte) 107);
			} else if (this.aShort9931 == 4 && var4 <= this.aClass356_8655.anInt3667) {
				return this.method5371(var4 + 1, var5, arg0, (byte) 52);
			} else if (this.aShort9931 == 8 && var5 > 0) {
				return this.method5371(var4, var5 - 1, arg0, (byte) 82);
			} else if (this.aShort9931 == 2 && var5 <= this.aClass356_8655.anInt3654) {
				return this.method5371(var4, var5 + 1, arg0, (byte) 37);
			} else if (this.aShort9931 == 16 && var4 > 0 && var5 <= this.aClass356_8655.anInt3654) {
				return this.method5371(var4 - 1, var5 + 1, arg0, (byte) 23);
			} else if (this.aShort9931 == 32 && var4 <= this.aClass356_8655.anInt3667 && var5 <= this.aClass356_8655.anInt3654) {
				return this.method5371(var4 + 1, var5 + 1, arg0, (byte) 20);
			} else if (this.aShort9931 == 128 && var4 > 0 && var5 > 0) {
				return this.method5371(var4 - 1, var5 - 1, arg0, (byte) 20);
			} else if (this.aShort9931 == 64 && var4 <= this.aClass356_8655.anInt3667 && var5 > 0) {
				return this.method5371(var4 + 1, var5 - 1, arg0, (byte) 21);
			} else {
				throw new RuntimeException("");
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "akq.fb(" + ')');
		}
	}

	public boolean method5367(byte arg0) {
		try {
			Class260 var2 = this.method5346().aClass260_2606;
			return this.aClass356_8655.aBooleanArrayArray3700[((int) var2.aFloat2716 >> this.aClass356_8655.anInt3641) - this.aClass356_8655.anInt3640 + this.aClass356_8655.anInt3673][this.aClass356_8655.anInt3673 + (((int) var2.aFloat2711 >> this.aClass356_8655.anInt3641) - this.aClass356_8655.anInt3651)];
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "akq.gn(" + ')');
		}
	}

	public int method5398(Class330_Sub14[] arg0) {
		Class260 var2 = this.method5346().aClass260_2606;
		int var3 = (int) var2.aFloat2716 >> this.aClass356_8655.anInt3641 * 916917461 * -1075721091;
		int var4 = (int) var2.aFloat2711 >> this.aClass356_8655.anInt3641 * -1075721091 * 916917461;
		int var5 = 0;
		if (var3 == this.aClass356_8655.anInt3640 * 315907165 * 383801333) {
			var5++;
		} else if (this.aClass356_8655.anInt3640 * 315907165 * 383801333 < var3) {
			var5 += 2;
		}
		if (var4 == this.aClass356_8655.anInt3651 * 875564685 * 2047960133) {
			var5 += 3;
		} else if (this.aClass356_8655.anInt3651 * 875564685 * 2047960133 > var4) {
			var5 += 6;
		}
		int var6 = anIntArray9936[var5];
		if ((this.aShort9931 & var6) != 0) {
			return this.method5371(var3, var4, arg0, (byte) 49);
		} else if (this.aShort9931 == 1 && var3 > 0) {
			return this.method5371(var3 - 1, var4, arg0, (byte) 16);
		} else if (this.aShort9931 == 4 && var3 <= this.aClass356_8655.anInt3667 * -265955713 * -58726017) {
			return this.method5371(var3 + 1, var4, arg0, (byte) 76);
		} else if (this.aShort9931 == 8 && var4 > 0) {
			return this.method5371(var3, var4 - 1, arg0, (byte) 116);
		} else if (this.aShort9931 == 2 && var4 <= this.aClass356_8655.anInt3654 * 95955317 * 1358339805) {
			return this.method5371(var3, var4 + 1, arg0, (byte) 53);
		} else if (this.aShort9931 == 16 && var3 > 0 && var4 <= this.aClass356_8655.anInt3654 * 1358339805 * 95955317) {
			return this.method5371(var3 - 1, var4 + 1, arg0, (byte) 113);
		} else if (this.aShort9931 == 32 && var3 <= this.aClass356_8655.anInt3667 * -58726017 * -265955713 && var4 <= this.aClass356_8655.anInt3654 * 1358339805 * 95955317) {
			return this.method5371(var3 + 1, var4 + 1, arg0, (byte) 73);
		} else if (this.aShort9931 == 128 && var3 > 0 && var4 > 0) {
			return this.method5371(var3 - 1, var4 - 1, arg0, (byte) 33);
		} else if (this.aShort9931 == 64 && var3 <= this.aClass356_8655.anInt3667 * -265955713 * -58726017 && var4 > 0) {
			return this.method5371(var3 + 1, var4 - 1, arg0, (byte) 109);
		} else {
			throw new RuntimeException("");
		}
	}

	public int method5399(Class330_Sub14[] arg0) {
		Class260 var2 = this.method5346().aClass260_2606;
		int var3 = (int) var2.aFloat2716 >> this.aClass356_8655.anInt3641 * 916917461 * -1075721091;
		int var4 = (int) var2.aFloat2711 >> this.aClass356_8655.anInt3641 * -1075721091 * 916917461;
		int var5 = 0;
		if (var3 == this.aClass356_8655.anInt3640 * 315907165 * 383801333) {
			var5++;
		} else if (this.aClass356_8655.anInt3640 * 315907165 * 383801333 < var3) {
			var5 += 2;
		}
		if (var4 == this.aClass356_8655.anInt3651 * 875564685 * 2047960133) {
			var5 += 3;
		} else if (this.aClass356_8655.anInt3651 * 875564685 * 2047960133 > var4) {
			var5 += 6;
		}
		int var6 = anIntArray9936[var5];
		if ((this.aShort9931 & var6) != 0) {
			return this.method5371(var3, var4, arg0, (byte) 126);
		} else if (this.aShort9931 == 1 && var3 > 0) {
			return this.method5371(var3 - 1, var4, arg0, (byte) 123);
		} else if (this.aShort9931 == 4 && var3 <= this.aClass356_8655.anInt3667 * -265955713 * -58726017) {
			return this.method5371(var3 + 1, var4, arg0, (byte) 76);
		} else if (this.aShort9931 == 8 && var4 > 0) {
			return this.method5371(var3, var4 - 1, arg0, (byte) 89);
		} else if (this.aShort9931 == 2 && var4 <= this.aClass356_8655.anInt3654 * 95955317 * 1358339805) {
			return this.method5371(var3, var4 + 1, arg0, (byte) 107);
		} else if (this.aShort9931 == 16 && var3 > 0 && var4 <= this.aClass356_8655.anInt3654 * 1358339805 * 95955317) {
			return this.method5371(var3 - 1, var4 + 1, arg0, (byte) 77);
		} else if (this.aShort9931 == 32 && var3 <= this.aClass356_8655.anInt3667 * -58726017 * -265955713 && var4 <= this.aClass356_8655.anInt3654 * 1358339805 * 95955317) {
			return this.method5371(var3 + 1, var4 + 1, arg0, (byte) 8);
		} else if (this.aShort9931 == 128 && var3 > 0 && var4 > 0) {
			return this.method5371(var3 - 1, var4 - 1, arg0, (byte) 94);
		} else if (this.aShort9931 == 64 && var3 <= this.aClass356_8655.anInt3667 * -265955713 * -58726017 && var4 > 0) {
			return this.method5371(var3 + 1, var4 - 1, arg0, (byte) 30);
		} else {
			throw new RuntimeException("");
		}
	}

	public boolean method5400(Class_ra arg0) {
		Class260 var2 = this.method5346().aClass260_2606;
		return this.aClass356_8655.aClass358_3649.method4230(this, this.aByte8654, (int) var2.aFloat2716 >> this.aClass356_8655.anInt3641 * -1075721091 * 916917461, (int) var2.aFloat2711 >> this.aClass356_8655.anInt3641 * 916917461 * -1075721091);
	}

	public Class432_Sub1_Sub5(Class356 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		super(arg0);
		this.aByte8658 = (byte) arg4;
		this.aByte8654 = (byte) arg5;
		this.aShort9931 = (short) arg6;
		this.method5349(new Class260((float) arg1, (float) arg2, (float) arg3));
	}

	public boolean method5402(Class_ra arg0) {
		Class260 var2 = this.method5346().aClass260_2606;
		return this.aClass356_8655.aClass358_3649.method4230(this, this.aByte8654, (int) var2.aFloat2716 >> this.aClass356_8655.anInt3641 * -1075721091 * 916917461, (int) var2.aFloat2711 >> this.aClass356_8655.anInt3641 * 916917461 * -1075721091);
	}

	public boolean method5403() {
		Class260 var1 = this.method5346().aClass260_2606;
		return this.aClass356_8655.aBooleanArrayArray3700[((int) var1.aFloat2716 >> this.aClass356_8655.anInt3641 * -1075721091 * 916917461) - this.aClass356_8655.anInt3640 * 315907165 * 383801333 + this.aClass356_8655.anInt3673 * 316617313 * -139136607][this.aClass356_8655.anInt3673 * -139136607 * 316617313 + (((int) var1.aFloat2711 >> this.aClass356_8655.anInt3641 * 916917461 * -1075721091) - this.aClass356_8655.anInt3651 * 2047960133 * 875564685)];
	}
}
