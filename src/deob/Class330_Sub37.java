package deob;

import java.nio.ByteBuffer;

public class Class330_Sub37 extends Class330 {

	public int anInt7738 = 0;

	public int anInt7746 = 0;

	public int anInt7747 = 0;

	public int anInt7748 = 0;

	public Class_xa_Sub2 aClass_xa_Sub2_7739;

	public Class_ra_Sub2 aClass_ra_Sub2_7742;

	public int anInt7740;

	public float aFloat7741;

	public Class77 aClass77_7745;

	public int[] anIntArray7744;

	public long aLong7749;

	public Interface9_Impl1 anInterface9_Impl1_7743;

	public Class330_Sub37(Class_xa_Sub2 arg0, int arg1, int arg2, Class77 arg3) {
		this.aClass_xa_Sub2_7739 = arg0;
		this.aClass_ra_Sub2_7742 = this.aClass_xa_Sub2_7739.aClass_ra_Sub2_8791;
		this.anInt7740 = arg1;
		this.aFloat7741 = arg2;
		this.aClass77_7745 = arg3;
		this.anIntArray7744 = new int[this.aClass_xa_Sub2_7739.anInt6397 * this.aClass_xa_Sub2_7739.anInt6393];
		byte var5 = 10;
		if (arg1 >= 0) {
			Class56 var6 = this.aClass_ra_Sub2_7742.anInterface_ma4227.method221(arg1, -1952499394);
			if (var6.aByte525 > 0) {
				var5 = var6.aByte525;
			}
		}
		this.aClass_ra_Sub2_7742.method4894(var5);
		this.aClass_ra_Sub2_7742.method4894(3);
	}

	public void method3535(int[] arg0, int arg1) {
		this.anInt7746 = 0;
		this.anInt7747 = 32767;
		this.anInt7748 = -32768;
		ByteBuffer var3 = this.aClass_ra_Sub2_7742.aByteBuffer8458;
		label49: for (int var4 = 0; var4 < arg1; var4++) {
			int var5 = arg0[var4];
			short[] var6 = this.aClass_xa_Sub2_7739.aShortArrayArray8798[var5];
			int var7 = this.anIntArray7744[var5];
			if (var7 != 0 && var6 != null) {
				int var8 = 0;
				int var9 = 0;
				while (true) {
					while (true) {
						if (var9 >= var6.length) {
							continue label49;
						}
						if ((var7 & 0x1 << var8++) == 0) {
							var9 += 3;
						} else {
							for (int var10 = 0; var10 < 3; var10++) {
								int var11 = var6[var9++] & 0xFFFF;
								if (var11 > this.anInt7748) {
									this.anInt7748 = var11;
								}
								if (var11 < this.anInt7747) {
									this.anInt7747 = var11;
								}
								var3.putShort((short) var11);
							}
							this.anInt7746 += 3;
						}
					}
				}
			}
		}
	}

	public void method3536(int arg0) {
		this.aClass_ra_Sub2_7742.anUnsafe8461.putByte(this.aLong7749 + (long) (arg0 * 4) + 3L, (byte) -1);
	}

	public void method3537(int arg0) {
		this.aLong7749 = this.aClass_ra_Sub2_7742.anUnsafe8461.allocateMemory((long) (arg0 * 4));
		for (int var2 = 3; var2 < arg0 * 4; var2 += 4) {
			this.aClass_ra_Sub2_7742.anUnsafe8461.putByte(this.aLong7749 + (long) var2, (byte) 0);
		}
	}

	public void method3538(int arg0) {
		this.anInterface9_Impl1_7743 = this.aClass_ra_Sub2_7742.method4976(false);
		this.anInterface9_Impl1_7743.method142(arg0 * 4, 4);
		this.anInterface9_Impl1_7743.method97(0, arg0 * 4, this.aLong7749);
		this.aClass_ra_Sub2_7742.anUnsafe8461.freeMemory(this.aLong7749);
	}

	public void method3539(int arg0, int arg1, int arg2, float arg3) {
		int var6;
		int var7;
		if (this.anInt7740 != -1) {
			Class56 var5 = this.aClass_ra_Sub2_7742.anInterface_ma4227.method221(this.anInt7740, 1653191935);
			var6 = var5.aByte529 & 0xFF;
			int var9;
			if (var6 != 0 && var5.aByte525 != 4) {
				if (arg2 < 0) {
					var7 = 0;
				} else if (arg2 > 127) {
					var7 = 16777215;
				} else {
					var7 = arg2 * 131586;
				}
				if (var6 == 256) {
					arg1 = var7;
				} else {
					var9 = 256 - var6;
					arg1 = ((var7 & 0xFF00FF) * var6 + (arg1 & 0xFF00FF) * var9 & 0xFF00FF00) + ((var7 & 0xFF00) * var6 + (arg1 & 0xFF00) * var9 & 0xFF0000) >> 8;
				}
			}
			var7 = var5.aByte534 & 0xFF;
			if (var7 != 0) {
				var7 += 256;
				int var8 = (arg1 >> 16 & 0xFF) * var7;
				if (var8 > 65535) {
					var8 = 65535;
				}
				var9 = (arg1 >> 8 & 0xFF) * var7;
				if (var9 > 65535) {
					var9 = 65535;
				}
				int var10 = (arg1 & 0xFF) * var7;
				if (var10 > 65535) {
					var10 = 65535;
				}
				arg1 = ((var8 & 0xFF00) << 8) + (var9 & 0xFF00) + (var10 >> 8);
			}
		}
		if (arg3 != 1.0F) {
			int var11 = arg1 >> 16 & 0xFF;
			var6 = arg1 >> 8 & 0xFF;
			var7 = arg1 & 0xFF;
			var11 = (int) ((float) var11 * arg3);
			if (var11 < 0) {
				var11 = 0;
			} else if (var11 > 255) {
				var11 = 255;
			}
			var6 = (int) ((float) var6 * arg3);
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}
			var7 = (int) ((float) var7 * arg3);
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}
			arg1 = var11 << 16 | var6 << 8 | var7;
		}
		if (this.aClass_ra_Sub2_7742.anInt8591 == 0) {
			this.aClass_ra_Sub2_7742.anUnsafe8461.putByte(this.aLong7749 + (long) (arg0 * 4), (byte) (arg1 >> 16));
			this.aClass_ra_Sub2_7742.anUnsafe8461.putByte(this.aLong7749 + (long) (arg0 * 4) + 1L, (byte) (arg1 >> 8));
			this.aClass_ra_Sub2_7742.anUnsafe8461.putByte(this.aLong7749 + (long) (arg0 * 4) + 2L, (byte) arg1);
		} else {
			this.aClass_ra_Sub2_7742.anUnsafe8461.putByte(this.aLong7749 + (long) (arg0 * 4), (byte) arg1);
			this.aClass_ra_Sub2_7742.anUnsafe8461.putByte(this.aLong7749 + (long) (arg0 * 4) + 1L, (byte) (arg1 >> 8));
			this.aClass_ra_Sub2_7742.anUnsafe8461.putByte(this.aLong7749 + (long) (arg0 * 4) + 2L, (byte) (arg1 >> 16));
		}
	}

	public void method3540(int arg0, int arg1, int arg2) {
		this.anIntArray7744[arg1 * this.aClass_xa_Sub2_7739.anInt6397 + arg0] |= 0x1 << arg2;
		this.anInt7738++;
	}
}
