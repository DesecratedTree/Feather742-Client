package deob;

import java.nio.ByteBuffer;

public class Class186 {

	public int anInt1827 = 64;

	public int anInt1828 = 768;

	public int anInt1829 = 1600;

	public int anInt1830 = Class64.method779(1600, -1470758270);

	public int anInt1832 = 64;

	public int[] anIntArray1826 = new int[8191];

	public int[] anIntArray1833 = new int[1600];

	public int[] anIntArray1834 = new int[64];

	public Class325_Sub3_Sub1[][] aClass325_Sub3_Sub1ArrayArray1835 = new Class325_Sub3_Sub1[1600][64];

	public Class325_Sub3_Sub1[][] aClass325_Sub3_Sub1ArrayArray1836 = new Class325_Sub3_Sub1[64][768];

	public int anInt1837 = 0;

	public Class184 aClass184_1824;

	public Interface9_Impl1 anInterface9_Impl1_1825;

	public Interface9_Impl1 anInterface9_Impl1_1838;

	public Interface9_Impl2 anInterface9_Impl2_1823;

	public static float aFloat1831;

	public Class186(Class_ra_Sub2 arg0) {
		this.aClass184_1824 = arg0.method4977(new Class193[] { new Class193(new Class191[] { Class191.aClass191_1863, Class191.aClass191_1862, Class191.aClass191_1864 }), new Class193(Class191.aClass191_1872) });
		this.anInterface9_Impl1_1825 = arg0.method4976(true);
		this.anInterface9_Impl1_1838 = arg0.method4976(false);
		this.anInterface9_Impl1_1838.method142(393168, 12);
		this.anInterface9_Impl2_1823 = arg0.method4975(false);
		this.anInterface9_Impl2_1823.method148(49146);
		ByteBuffer var2 = arg0.aByteBuffer8458;
		var2.clear();
		int var3;
		for (var3 = 0; var3 < 8191; var3++) {
			int var4 = var3 * 4;
			var2.putShort((short) var4);
			var2.putShort((short) (var4 + 1));
			var2.putShort((short) (var4 + 2));
			var2.putShort((short) (var4 + 2));
			var2.putShort((short) (var4 + 3));
			var2.putShort((short) var4);
		}
		this.anInterface9_Impl2_1823.method97(0, var2.position(), arg0.aLong8459);
		var2.clear();
		for (var3 = 0; var3 < 8191; var3++) {
			var2.putFloat(0.0F);
			var2.putFloat(-1.0F);
			var2.putFloat(0.0F);
			var2.putFloat(0.0F);
			var2.putFloat(-1.0F);
			var2.putFloat(0.0F);
			var2.putFloat(0.0F);
			var2.putFloat(-1.0F);
			var2.putFloat(0.0F);
			var2.putFloat(0.0F);
			var2.putFloat(-1.0F);
			var2.putFloat(0.0F);
		}
		this.anInterface9_Impl1_1838.method97(0, var2.position(), arg0.aLong8459);
	}

	public void method2077(Class_ra_Sub2 arg0) {
		this.anInterface9_Impl1_1825.method142(786336, 24);
	}

	public void method2078(int arg0, Class325_Sub3_Sub1 arg1) {
		if (arg0 >= 1600) {
			return;
		}
		if (this.anIntArray1833[arg0] < 64) {
			this.aClass325_Sub3_Sub1ArrayArray1835[arg0][this.anIntArray1833[arg0]++] = arg1;
			return;
		}
		if (this.anIntArray1833[arg0] == 64) {
			if (this.anInt1837 == 64) {
				return;
			}
			this.anIntArray1833[arg0] += this.anInt1837++ + 1;
		}
		this.aClass325_Sub3_Sub1ArrayArray1836[this.anIntArray1833[arg0] - 64 - 1][this.anIntArray1834[this.anIntArray1833[arg0] - 64 - 1]++] = arg1;
	}

	public void method2079(Class_ra_Sub2 arg0, Class81 arg1) {
		arg0.RA(false);
		aFloat1831 = arg0.aFloat8533;
		float var3 = arg0.aClass249_8472.aFloatArray2631[2];
		float var4 = arg0.aClass249_8472.aFloatArray2631[6];
		float var5 = arg0.aClass249_8472.aFloatArray2631[10];
		float var6 = arg0.aClass249_8472.aFloatArray2631[14];
		int var7 = 0;
		int var8 = Integer.MAX_VALUE;
		int var9 = 0;
		Class325_Sub3 var10 = arg1.aClass461_675.aClass325_Sub3_5569;
		for (Class325_Sub3 var11 = var10.aClass325_Sub3_7483; var11 != var10; var11 = var11.aClass325_Sub3_7483) {
			Class325_Sub3_Sub1 var12 = (Class325_Sub3_Sub1) var11;
			int var13 = (int) (var3 * (float) (var12.anInt9497 >> 12) + var4 * (float) (var12.anInt9493 >> 12) + var5 * (float) (var12.anInt9489 >> 12) + var6);
			if (var13 > var9) {
				var9 = var13;
			}
			if (var13 < var8) {
				var8 = var13;
			}
			this.anIntArray1826[var7++] = var13;
		}
		int var14 = var9 - var8;
		int var15;
		if (var14 + 2 > 1600) {
			var15 = Class64.method779(var14, -1239245241) + 1 - this.anInt1830;
			var14 = (var14 >> var15) + 2;
		} else {
			var15 = 0;
			var14 += 2;
		}
		arg0.method4979(this.anInterface9_Impl2_1823);
		Class126 var16 = arg0.aClass126_8562;
		var16.method1532(Class249.aClass249_2630);
		var16.aClass249_1460.method2516();
		var16.anInt1462 = -1;
		this.method2082(arg0, var10, var14, var8, var15, var16);
		if (arg0.aFloat8533 != aFloat1831) {
			arg0.IA(aFloat1831);
		}
		arg0.RA(true);
	}

	public void method2080() {
		this.anInterface9_Impl1_1825.method53();
	}

	public void method2081(Class_ra_Sub2 arg0, int arg1) {
		int var3 = 0;
		Class249 var4 = arg0.aClass249_8472;
		float var5 = var4.aFloatArray2631[0];
		float var6 = var4.aFloatArray2631[4];
		float var7 = var4.aFloatArray2631[8];
		float var8 = var4.aFloatArray2631[1];
		float var9 = var4.aFloatArray2631[5];
		float var10 = var4.aFloatArray2631[9];
		float var11 = var5 + var8;
		float var12 = var6 + var9;
		float var13 = var7 + var10;
		float var14 = var5 - var8;
		float var15 = var6 - var9;
		float var16 = var7 - var10;
		float var17 = var8 - var5;
		float var18 = var9 - var6;
		float var19 = var10 - var7;
		ByteBuffer var20 = arg0.aByteBuffer8458;
		var20.clear();
		for (int var21 = arg1 - 1; var21 >= 0; var21--) {
			int var22 = this.anIntArray1833[var21] > 64 ? 64 : this.anIntArray1833[var21];
			if (var22 > 0) {
				int var23;
				byte var27;
				byte var28;
				byte var29;
				byte var30;
				float var31;
				float var32;
				for (var23 = var22 - 1; var23 >= 0; var23--) {
					Class325_Sub3_Sub1 var24 = this.aClass325_Sub3_Sub1ArrayArray1835[var21][var23];
					int var25 = var24.anInt9490;
					byte var26 = (byte) (var25 >> 16);
					var27 = (byte) (var25 >> 8);
					var28 = (byte) var25;
					var29 = (byte) (var25 >>> 24);
					if (arg0.anInt8591 == 0) {
						var30 = var26;
						var26 = var28;
						var28 = var30;
					}
					float var39 = (float) (var24.anInt9497 >> 12);
					var31 = var24.anInt9493 >> 12;
					var32 = var24.anInt9489 >> 12;
					int var33 = var24.anInt9494 >> 12;
					var20.putFloat(var39 + var11 * (float) -var33);
					var20.putFloat(var31 + var12 * (float) -var33);
					var20.putFloat(var32 + var13 * (float) -var33);
					var20.put(var26);
					var20.put(var27);
					var20.put(var28);
					var20.put(var29);
					var20.putFloat(0.0F);
					var20.putFloat(0.0F);
					var20.putFloat(var39 + var17 * (float) var33);
					var20.putFloat(var31 + var18 * (float) var33);
					var20.putFloat(var32 + var19 * (float) var33);
					var20.put(var26);
					var20.put(var27);
					var20.put(var28);
					var20.put(var29);
					var20.putFloat(0.0F);
					var20.putFloat(1.0F);
					var20.putFloat(var39 + var11 * (float) var33);
					var20.putFloat(var31 + var12 * (float) var33);
					var20.putFloat(var32 + var13 * (float) var33);
					var20.put(var26);
					var20.put(var27);
					var20.put(var28);
					var20.put(var29);
					var20.putFloat(1.0F);
					var20.putFloat(1.0F);
					var20.putFloat(var39 + var14 * (float) var33);
					var20.putFloat(var31 + var15 * (float) var33);
					var20.putFloat(var32 + var16 * (float) var33);
					var20.put(var26);
					var20.put(var27);
					var20.put(var28);
					var20.put(var29);
					var20.putFloat(1.0F);
					var20.putFloat(0.0F);
					var3++;
				}
				if (this.anIntArray1833[var21] > 64) {
					var23 = this.anIntArray1833[var21] - 64 - 1;
					for (int var36 = this.anIntArray1834[var23] - 1; var36 >= 0; var36--) {
						Class325_Sub3_Sub1 var37 = this.aClass325_Sub3_Sub1ArrayArray1836[var23][var36];
						int var38 = var37.anInt9490;
						var27 = (byte) (var38 >> 16);
						var28 = (byte) (var38 >> 8);
						var29 = (byte) var38;
						var30 = (byte) (var38 >>> 24);
						if (arg0.anInt8591 == 0) {
							byte var40 = var27;
							var27 = var29;
							var29 = var40;
						}
						var31 = var37.anInt9497 >> 12;
						var32 = var37.anInt9493 >> 12;
						float var41 = (float) (var37.anInt9489 >> 12);
						int var34 = var37.anInt9494 >> 12;
						var20.putFloat(var31 + var11 * (float) -var34);
						var20.putFloat(var32 + var12 * (float) -var34);
						var20.putFloat(var41 + var13 * (float) -var34);
						var20.put(var27);
						var20.put(var28);
						var20.put(var29);
						var20.put(var30);
						var20.putFloat(0.0F);
						var20.putFloat(0.0F);
						var20.putFloat(var31 + var17 * (float) var34);
						var20.putFloat(var32 + var18 * (float) var34);
						var20.putFloat(var41 + var19 * (float) var34);
						var20.put(var27);
						var20.put(var28);
						var20.put(var29);
						var20.put(var30);
						var20.putFloat(0.0F);
						var20.putFloat(1.0F);
						var20.putFloat(var31 + var11 * (float) var34);
						var20.putFloat(var32 + var12 * (float) var34);
						var20.putFloat(var41 + var13 * (float) var34);
						var20.put(var27);
						var20.put(var28);
						var20.put(var29);
						var20.put(var30);
						var20.putFloat(1.0F);
						var20.putFloat(1.0F);
						var20.putFloat(var31 + var14 * (float) var34);
						var20.putFloat(var32 + var15 * (float) var34);
						var20.putFloat(var41 + var16 * (float) var34);
						var20.put(var27);
						var20.put(var28);
						var20.put(var29);
						var20.put(var30);
						var20.putFloat(1.0F);
						var20.putFloat(0.0F);
						var3++;
					}
				}
			}
		}
		this.anInterface9_Impl1_1825.method97(0, var20.position(), arg0.aLong8459);
		arg0.method5081(0, this.anInterface9_Impl1_1825);
		arg0.method5081(1, this.anInterface9_Impl1_1838);
		arg0.method4978(this.aClass184_1824);
		Class126 var35 = arg0.aClass126_8562;
		var35.method1534(var3);
	}

	public void method2082(Class_ra_Sub2 arg0, Class325_Sub3 arg1, int arg2, int arg3, int arg4, Class126 arg5) {
		Class325_Sub3 var7 = arg1.aClass325_Sub3_7483;
		int var8 = 0;
		int var9 = -2;
		boolean var10 = true;
		boolean var11 = true;
		while (var7 != arg1) {
			this.anInt1837 = 0;
			int var12;
			for (var12 = 0; var12 < arg2; var12++) {
				this.anIntArray1833[var12] = 0;
			}
			for (var12 = 0; var12 < 64; var12++) {
				this.anIntArray1834[var12] = 0;
			}
			while (var7 != arg1) {
				Class325_Sub3_Sub1 var13 = (Class325_Sub3_Sub1) var7;
				if (var11) {
					var9 = var13.anInt9492;
					var10 = var13.aBoolean9496;
					var11 = false;
				}
				if (var8 > 0 && (var9 != var13.anInt9492 || var10 != var13.aBoolean9496)) {
					var11 = true;
					break;
				}
				this.method2078(this.anIntArray1826[var8++] - arg3 >> arg4, var13);
				var7 = var7.aClass325_Sub3_7483;
			}
			arg5.anInterface11_Impl3_1461 = var9 >= 0 ? arg0.aClass188_8552.method2093(var9) : null;
			if (var10 && arg0.aFloat8533 != aFloat1831) {
				arg0.IA(aFloat1831);
			} else if (arg0.aFloat8533 != 1.0F) {
				arg0.IA(1.0F);
			}
			this.method2081(arg0, arg2);
		}
	}
}
