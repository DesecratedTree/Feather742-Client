package deob;

import java.util.Stack;

public class Class227 {

	public static Class227 aClass227_2413 = new Class227(14, 0);

	public static Class227 aClass227_2412 = new Class227(15, -1);

	public static Class227 aClass227_2416 = new Class227(16, -2);

	public static Class227 aClass227_2414 = new Class227(19, -2);

	public static Class227 aClass227_2415 = new Class227(23, 4);

	public static Class227 aClass227_2411 = new Class227(24, -1);

	public static Class227 aClass227_2417 = new Class227(26, 0);

	public static Class227 aClass227_2418 = new Class227(27, 0);

	public static Class227 aClass227_2419 = new Class227(28, -2);

	public static Class227 aClass227_2420 = new Class227(29, -2);

	public static Class227 aClass227_2421 = new Class227(30, -2);

	public static Class227[] aClass227Array2423 = new Class227[32];

	public int anInt2422;

	public static boolean aBoolean2424;

	static {
		Class227[] var0 = Class410.method5223((byte) -76);
		for (int var1 = 0; var1 < var0.length; var1++) {
			aClass227Array2423[var0[var1].anInt2422] = var0[var1];
		}
	}

	public Class227(int arg0, int arg1) {
		this.anInt2422 = arg0;
	}

	public static final void method2310(Class430 arg0, byte arg1) {
		try {
			arg0.aLongArray4379[++arg0.anInt4380 - 1] = arg0.aClass330_Sub36_Sub8_4393.aLongArray9675[arg0.anInt4397];
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "jn.bs(" + ')');
		}
	}

	public static void method2311(int arg0, int arg1) {
		try {
			if (client.anInt8995 != arg0) {
				client.anInt9199 = 0;
				if (arg0 == 9 || arg0 == 0) {
					Class371.method4321(2097298366);
				}
				if (arg0 != 9 && Class274.aClass357_2852 != null) {
					Class274.aClass357_2852.method4197(1463544803);
					Class274.aClass357_2852 = null;
				}
				if (arg0 == 6) {
					Class210.method2216(client.anInt8995 == 14 || client.anInt8995 == 8 || Class396.aClass417_4108.anInt4272 != client.windowPaneId, 629730926);
				}
				if (arg0 == 15) {
					Class_ta.method5680(client.windowPaneId != Class396.aClass417_4108.anInt4284, 33071);
				}
				if (arg0 == 3 || arg0 == 4) {
					if (!Class26.method489(1782132682)) {
						return;
					}
				} else if (arg0 == 18 || arg0 == 11 && client.anInt8995 != 7) {
					if (!Class371.method4321(1771857101)) {
						return;
					}
				} else if (arg0 == 8) {
					Class545.method6348((byte) 66);
				}
				if (Class438.method5593(arg0, -1964757127)) {
					client.aClass304_9030.method3004((byte) 22);
					Class517.method6212(true, 371449206);
				}
				if (arg0 == 16 || arg0 == 6) {
					Class408.method4766(405347915);
				}
				boolean var2 = arg0 == 10 || Class522.method6230(arg0, -2131895214) || Class226.method2307(arg0, (byte) 49);
				boolean var3 = client.anInt8995 == 10 || Class522.method6230(client.anInt8995, 423131101) || Class226.method2307(client.anInt8995, (byte) 49);
				if (var3 != var2) {
					if (var2) {
						Class333.musicId = Class333.anInt3346;
						if (Class448.aClass330_Sub50_5555.aClass464_Sub30_7909.method5841(-1824075931) == 0) {
							Class400.method4704(2, (byte) 29);
						} else {
							Class6.method408(2, Class89.aClass280_735, Class333.anInt3346, 0, Class448.aClass330_Sub50_5555.aClass464_Sub30_7909.method5841(-1999523874), false, -1816789524);
							Class479.method6014(-1286168111);
						}
						Class140_Sub1.aClass285_7263.method2839(false, 2050348790);
					} else {
						Class400.method4704(2, (byte) 16);
						Class140_Sub1.aClass285_7263.method2839(true, -512706772);
					}
				}
				if (Class438.method5593(arg0, 190940593) || arg0 == 9 || arg0 == 0) {
					Class361.aClass_ra3793.am();
				}
				client.anInt8995 = arg0;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "jn.fg(" + ')');
		}
	}

	public static void method2312(Class353 arg0, int arg1) {
		try {
			arg0.aClass432_Sub1_3489 = null;
			Stack var2 = Class353.aStack3488;
			synchronized (Class353.aStack3488) {
				if (Class353.aStack3488.size() < 200) {
					Class353.aStack3488.push(arg0);
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "jn.j(" + ')');
		}
	}
}
