package deob;

public class Class349 {

	public static int anInt3445 = 31;

	public static int anInt3446 = 8;

	public static int anInt3447 = 2;

	public static int anInt3448 = 1;

	public static int anInt3449 = 4;

	public static int anInt3450 = 1;

	public static int anInt3453 = 4;

	public static int anInt3455 = 6;

	public static int anInt3457 = 7;

	public static int anInt3458 = 9;

	public static int anInt3459 = 10;

	public static int anInt3460 = 11;

	public static int anInt3461 = 12;

	public static int anInt3462 = 13;

	public static int anInt3463 = 14;

	public static int anInt3464 = 15;

	public static int anInt3465 = 16;

	public static int anInt3468 = 1;

	public static int anInt3471 = 1;

	public static int anInt3476 = 1;

	public static int anInt3477 = 2;

	public static int anInt3478 = 0;

	public int anInt3470;

	public boolean aBoolean3456;

	public boolean aBoolean3469;

	public short[] aShortArray3454;

	public int anInt3472;

	public int anInt3475;

	public int anInt3452;

	public int anInt3466;

	public int anInt3473;

	public int anInt3474;

	public Class330_Sub14 aClass330_Sub14_3467;

	public static int[] anIntArray3451;

	public void method4021(Class_ra arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		try {
			this.aClass330_Sub14_3467 = arg0.method4799(arg1, arg2, arg3, arg4, arg5, 1.0F);
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "on.r(" + ')');
		}
	}

	public void method4022(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			this.anInt3473 = arg0;
			this.anInt3452 = arg3;
			this.anInt3466 = arg2;
			this.anInt3474 = arg1;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "on.j(" + ')');
		}
	}

	public void method4023(int arg0) {
		try {
			switch(this.anInt3472) {
				case 2:
					this.anInt3473 = 1;
					this.anInt3452 = 0;
					this.anInt3466 = 2048;
					this.anInt3474 = 2048;
					break;
				case 3:
					this.anInt3473 = 1;
					this.anInt3452 = 0;
					this.anInt3466 = 2048;
					this.anInt3474 = 4096;
					break;
				case 4:
					this.anInt3473 = 4;
					this.anInt3452 = 0;
					this.anInt3466 = 2048;
					this.anInt3474 = 2048;
					break;
				case 5:
					this.anInt3473 = 4;
					this.anInt3452 = 0;
					this.anInt3466 = 2048;
					this.anInt3474 = 8192;
					break;
				case 6:
					this.anInt3473 = 3;
					this.anInt3452 = 1280;
					this.anInt3466 = 768;
					this.anInt3474 = 2048;
					break;
				case 7:
					this.anInt3473 = 3;
					this.anInt3452 = 1280;
					this.anInt3466 = 768;
					this.anInt3474 = 4096;
					break;
				case 8:
					this.anInt3473 = 3;
					this.anInt3452 = 1024;
					this.anInt3466 = 1024;
					this.anInt3474 = 2048;
					break;
				case 9:
					this.anInt3473 = 3;
					this.anInt3452 = 1024;
					this.anInt3466 = 1024;
					this.anInt3474 = 4096;
					break;
				case 10:
					this.anInt3473 = 3;
					this.anInt3452 = 1536;
					this.anInt3466 = 512;
					this.anInt3474 = 2048;
					break;
				case 11:
					this.anInt3473 = 3;
					this.anInt3452 = 1536;
					this.anInt3466 = 512;
					this.anInt3474 = 4096;
					break;
				case 12:
					this.anInt3473 = 2;
					this.anInt3452 = 0;
					this.anInt3466 = 2048;
					this.anInt3474 = 2048;
					break;
				case 13:
					this.anInt3473 = 2;
					this.anInt3452 = 0;
					this.anInt3466 = 2048;
					this.anInt3474 = 8192;
					break;
				case 14:
					this.anInt3473 = 1;
					this.anInt3452 = 1280;
					this.anInt3466 = 768;
					this.anInt3474 = 2048;
					break;
				case 15:
					this.anInt3473 = 1;
					this.anInt3452 = 1536;
					this.anInt3466 = 512;
					this.anInt3474 = 4096;
					break;
				case 16:
					this.anInt3473 = 1;
					this.anInt3452 = 1792;
					this.anInt3466 = 256;
					this.anInt3474 = 8192;
					break;
				default:
					this.anInt3452 = 0;
					this.anInt3473 = 0;
					this.anInt3466 = 2048;
					this.anInt3474 = 2048;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "on.i(" + ')');
		}
	}

	public void method4024(int arg0, boolean arg1, int arg2) {
		try {
			int var4;
			if (arg1) {
				var4 = 2048;
			} else {
				int var5 = this.anInt3474 * arg0 / 50 + this.anInt3475 & 0x7FF;
				switch(this.anInt3473) {
					case 1:
						var4 = (Class257.anIntArray2683[var5 << 3] >> 4) + 1024;
						break;
					case 2:
						var4 = var5;
						break;
					case 3:
						var4 = anIntArray3451[var5] >> 1;
						break;
					case 4:
						var4 = var5 >> 10 << 11;
						break;
					case 5:
						var4 = (var5 < 1024 ? var5 : 2048 - var5) << 1;
						break;
					default:
						var4 = 2048;
				}
			}
			this.aClass330_Sub14_3467.method3314((float) ((var4 * this.anInt3466 >> 11) + this.anInt3452) / 2048.0F, 332226163);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "on.p(" + ')');
		}
	}

	public Class349(Class_ra arg0, int arg1, Buffer arg2, int arg3) {
		if (anIntArray3451 == null) {
			Class7.method414(-888588343);
		}
		this.anInt3470 = arg2.readUnsignedByte(1462585861);
		this.aBoolean3456 = (this.anInt3470 & 0x8) != 0;
		this.aBoolean3469 = (this.anInt3470 & 0x10) != 0;
		this.anInt3470 &= 0x7;
		int var5 = arg2.readUnsignedShort(1254488090) << arg3;
		int var6 = arg2.readUnsignedShort(2035575563) << arg3;
		int var7 = arg2.readUnsignedShort(628753678) << arg3;
		int var8 = arg2.readUnsignedByte(1122648727);
		int var9 = var8 * 2 + 1;
		this.aShortArray3454 = new short[var9];
		int var10;
		for (var10 = 0; var10 < this.aShortArray3454.length; var10++) {
			short var11 = (short) arg2.readUnsignedShort(538800911);
			int var12 = var11 >>> 8;
			int var13 = var11 & 0xFF;
			if (var12 >= var9) {
				var12 = var9 - 1;
			}
			if (var13 > var9 - var12) {
				var13 = var9 - var12;
			}
			this.aShortArray3454[var10] = (short) (var12 << 8 | var13);
		}
		var8 = (var8 << arg1) + (0x1 << arg1 >> 1);
		var10 = Console.colorArray == null ? Console.anIntArray4263[Class356.modifyColor(arg2.readUnsignedShort(902908774), (byte) 1) & 0xFFFF] : Console.colorArray[arg2.readUnsignedShort(279645154)];
		int var14 = arg2.readUnsignedByte(2003102048);
		this.anInt3472 = var14 & 0x1F;
		this.anInt3475 = (var14 & 0xE0) << 3;
		if (this.anInt3472 != 31) {
			this.method4023(-2106397823);
		}
		this.method4021(arg0, var5, var7, var6, var8, var10, -1712440806);
	}

	public static final void method4025(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class436.method5579(var3, var4, arg0, 1053108473);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "on.ns(" + ')');
		}
	}

	public static String method4026(CharSequence arg0, int arg1) {
		try {
			String var2 = Class211.method2222(Class96.method1179(arg0, -1842608537));
			if (var2 == null) {
				var2 = "";
			}
			return var2;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "on.p(" + ')');
		}
	}
}
