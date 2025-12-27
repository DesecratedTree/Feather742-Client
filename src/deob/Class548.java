package deob;

public class Class548 {

	public int anInt6264;

	public int anInt6263;

	public int anInt6262;

	public Class548(int arg0, int arg1, int arg2) {
		this.anInt6264 = arg0;
		this.anInt6263 = arg1;
		this.anInt6262 = arg2;
	}

	public static final void method6357(Class430 arg0, byte arg1) {
		try {
			arg0.anIntArray4388[arg0.anIntArray4394[arg0.anInt4397]] = arg0.anIntArray4387[--arg0.anInt4376];
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "wr.af(" + ')');
		}
	}

	public static Class432_Sub1_Sub1_Sub1 method6358(int arg0, int arg1, int arg2, int arg3) {
		try {
			Class340 var4 = client.aClass304_9030.method3023(-400722441).aClass340ArrayArrayArray3653[arg0][arg1][arg2];
			if (var4 == null) {
				return null;
			}
			Class432_Sub1_Sub1_Sub1 var5 = null;
			int var6 = -1;
			for (Class352 var7 = var4.aClass352_3388; var7 != null; var7 = var7.aClass352_3483) {
				Class432_Sub1_Sub1 var8 = var7.aClass432_Sub1_Sub1_3484;
				if (var8 instanceof Class432_Sub1_Sub1_Sub1) {
					Class432_Sub1_Sub1_Sub1 var9 = (Class432_Sub1_Sub1_Sub1) var8;
					int var10 = (var9.method5453(-1776431320) - 1) * 256 + 252;
					Class260 var11 = var9.method5346().aClass260_2606;
					int var12 = (int) var11.aFloat2716 - var10 >> 9;
					int var13 = (int) var11.aFloat2711 - var10 >> 9;
					int var14 = var10 + (int) var11.aFloat2716 >> 9;
					int var15 = var10 + (int) var11.aFloat2711 >> 9;
					if (var12 <= arg1 && var13 <= arg2 && var14 >= arg1 && var15 >= arg2) {
						int var16 = (var14 + 1 - arg1) * (var15 + 1 - arg2);
						if (var16 > var6) {
							var5 = var9;
							var6 = var16;
						}
					}
				}
			}
			return var5;
		} catch (RuntimeException var17) {
			throw Class476.method5964(var17, "wr.im(" + ')');
		}
	}
}
