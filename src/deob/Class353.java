package deob;

import java.util.Stack;

public class Class353 {

	public static Stack aStack3488 = new Stack();

	public Class338 aClass338_3490;

	public Class432_Sub1 aClass432_Sub1_3489;

	public boolean aBoolean3487;

	public boolean method4073(Class_ra arg0, int arg1, int arg2, int arg3) {
		try {
			int var5 = this.aClass432_Sub1_3489.method5359(-1687176248);
			if (this.aClass432_Sub1_3489.aClass80Array8656 != null) {
				for (int var6 = 0; var6 < this.aClass432_Sub1_3489.aClass80Array8656.length; var6++) {
					this.aClass432_Sub1_3489.aClass80Array8656[var6].anInt673 <<= var5;
					if (this.aClass432_Sub1_3489.aClass80Array8656[var6].method944(this.aClass338_3490.anInt3371 + arg1, arg2 + this.aClass338_3490.anInt3372) && this.aClass432_Sub1_3489.method5358(arg0, arg1, arg2, -13178752)) {
						this.aClass432_Sub1_3489.aClass80Array8656[var6].anInt673 >>= var5;
						return true;
					}
					this.aClass432_Sub1_3489.aClass80Array8656[var6].anInt673 >>= var5;
				}
			}
			return false;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "os.p(" + ')');
		}
	}

	public static final void method4074(Class430 arg0, byte arg1) {
		try {
			arg0.anInt4376 -= 2;
			if (arg0.anIntArray4387[arg0.anInt4376] < arg0.anIntArray4387[arg0.anInt4376 + 1]) {
				arg0.anInt4397 += arg0.anIntArray4394[arg0.anInt4397];
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "os.ay(" + ')');
		}
	}

	public static final void method4075(Class430 arg0, int arg1) {
		try {
			Class434.method5566((byte) 50);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "os.agb(" + ')');
		}
	}

	public static boolean method4076(byte arg0) {
		try {
			return Class50.aBoolean479;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "os.i(" + ')');
		}
	}

	public static final void method4077(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -1343473746);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class1.method386(var3, var4, arg0, 2032797425);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "os.eq(" + ')');
		}
	}

	public static final void method4078(byte arg0) {
		try {
			if (client.anInt9013 != -1 && client.anInt9183 != -1) {
				int var1 = ((client.anInt9089 - client.anInt9088) * client.anInt9087 >> 16) + client.anInt9088;
				client.anInt9087 += var1;
				if (client.anInt9087 >= 65535) {
					client.anInt9087 = 65535;
					if (client.aBoolean9091) {
						client.aBoolean9090 = false;
					} else {
						client.aBoolean9090 = true;
					}
					client.aBoolean9091 = true;
				} else {
					client.aBoolean9090 = false;
					client.aBoolean9091 = false;
				}
				float var2 = (float) client.anInt9087 / 65535.0F;
				float[] var3 = new float[3];
				int var4 = client.anInt9085 * 2;
				int var7;
				int var8;
				int var9;
				int var10;
				int var11;
				int var12;
				for (int var5 = 0; var5 < 3; var5++) {
					int var6 = client.anIntArrayArrayArray9082[client.anInt9013][var4][var5] * 3;
					var7 = client.anIntArrayArrayArray9082[client.anInt9013][var4 + 1][var5] * 3;
					var8 = (client.anIntArrayArrayArray9082[client.anInt9013][var4 + 2][var5] - (client.anIntArrayArrayArray9082[client.anInt9013][var4 + 3][var5] - client.anIntArrayArrayArray9082[client.anInt9013][var4 + 2][var5])) * 3;
					var9 = client.anIntArrayArrayArray9082[client.anInt9013][var4][var5];
					var10 = var7 - var6;
					var11 = var8 + (var6 - var7 * 2);
					var12 = client.anIntArrayArrayArray9082[client.anInt9013][var4 + 2][var5] - var9 + var7 - var8;
					var3[var5] = (float) var9 + ((float) var10 + var2 * (var2 * (float) var12 + (float) var11)) * var2;
				}
				Class381 var17 = client.aClass304_9030.method3022(-522787707);
				Class471.anInt5612 = (int) var3[0] - var17.gameSceneBaseX * 512;
				Gfx.anInt578 = (int) var3[1] * -1;
				Class325_Sub3.anInt7484 = (int) var3[2] - var17.gameSceneBaseY * 512;
				float[] var18 = new float[3];
				var7 = client.anInt9086 * 2;
				for (var8 = 0; var8 < 3; var8++) {
					var9 = client.anIntArrayArrayArray9082[client.anInt9183][var7][var8] * 3;
					var10 = client.anIntArrayArrayArray9082[client.anInt9183][var7 + 1][var8] * 3;
					var11 = (client.anIntArrayArrayArray9082[client.anInt9183][var7 + 2][var8] - (client.anIntArrayArrayArray9082[client.anInt9183][var7 + 3][var8] - client.anIntArrayArrayArray9082[client.anInt9183][var7 + 2][var8])) * 3;
					var12 = client.anIntArrayArrayArray9082[client.anInt9183][var7][var8];
					int var13 = var10 - var9;
					int var14 = var11 + (var9 - var10 * 2);
					int var15 = var10 + (client.anIntArrayArrayArray9082[client.anInt9183][var7 + 2][var8] - var12) - var11;
					var18[var8] = var2 * (var2 * ((float) var14 + (float) var15 * var2) + (float) var13) + (float) var12;
				}
				float var19 = var18[0] - var3[0];
				float var20 = (var18[1] - var3[1]) * -1.0F;
				float var21 = var18[2] - var3[2];
				double var22 = Math.sqrt((double) (var19 * var19 + var21 * var21));
				Class321.anInt7018 = (int) (Math.atan2((double) var20, var22) * 2607.5945876176133D) & 0x3FFF;
				Class145_Sub1.anInt7266 = (int) (-Math.atan2((double) var19, (double) var21) * 2607.5945876176133D) & 0x3FFF;
				Class119.anInt1399 = (client.anInt9087 * (client.anIntArrayArrayArray9082[client.anInt9013][var4 + 2][3] - client.anIntArrayArrayArray9082[client.anInt9013][var4][3]) >> 16) + client.anIntArrayArrayArray9082[client.anInt9013][var4][3];
			}
		} catch (RuntimeException var16) {
			throw Class476.method5964(var16, "os.hv(" + ')');
		}
	}

	public static final void method4079(long arg0) {
		try {
			if (client.aClass304_9030.method3023(-400722441) != null) {
				if (Class147.anInt1621 == 4 || Class147.anInt1621 == 6) {
					Class132.method1568(arg0);
				} else if (Class147.anInt1621 == 5) {
					Class330_Sub40_Sub1.method3571(arg0);
				}
			}
			Class263.method2619(Class361.aClass_ra3793, (long) client.anInt8981);
			if (client.windowPaneId != -1) {
				Class355_Sub1.method4131(client.windowPaneId, -221969333);
			}
			int var2;
			for (var2 = 0; var2 < client.anInt9213; var2++) {
				client.aBooleanArray9263[var2] = client.aBooleanArray9230[var2];
				client.aBooleanArray9230[var2] = false;
			}
			client.anInt9214 = client.anInt8981;
			Class_na.method3513(-1, -1, (byte) 76);
			if (client.windowPaneId != -1) {
				client.anInt9213 = 0;
				Class286.method2873(1912494886);
			}
			Class361.aClass_ra3793.L();
			Class305.method3049(Class361.aClass_ra3793, (byte) -72);
			var2 = Class403.method4731((byte) 99);
			if (var2 == -1) {
				var2 = client.anInt9147;
			}
			if (var2 == -1) {
				var2 = client.anInt9215;
			}
			Class373.method4339(var2, (byte) -28);
			int var3 = Class263_Sub2.myPlayer.method5453(-1923731169) << 8;
			Class260 var4 = Class263_Sub2.myPlayer.method5346().aClass260_2606;
			Class330_Sub33.method3435(Class263_Sub2.myPlayer.aByte8658, var3 + (int) var4.aFloat2716, (int) var4.aFloat2711 + var3, client.anInt9210, -269766656);
			client.anInt9210 = 0;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "os.ia(" + ')');
		}
	}

	public static final void method4080(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.aClass286Array9234[var2].anInt2950;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "os.yl(" + ')');
		}
	}

	public static final void method4081(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class372 var3 = Class79.aClass380_666.method4387(var2, (byte) -89);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt3876;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "os.aov(" + ')');
		}
	}
}
