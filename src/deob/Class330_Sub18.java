package deob;

public class Class330_Sub18 extends Class330 {

	public static int anInt7630 = 8;

	public static int anInt7631 = 1;

	public static int anInt7632 = 2;

	public static int anInt7634 = 1;

	public static int anInt7635 = 1;

	public static int anInt7636 = 0;

	public static int anInt7637 = 6;

	public static int anInt7638 = 9;

	public static int anInt7639 = 10;

	public static int anInt7645 = 7;

	public int anInt7633;

	public int anInt7640;

	public int[] anIntArray7642;

	public int[][] anIntArrayArray7643;

	public boolean[] aBooleanArray7644;

	public int[] anIntArray7641;

	public Class330_Sub18(int arg0, byte[] arg1) {
		this.anInt7633 = arg0;
		Buffer var3 = new Buffer(arg1);
		this.anInt7640 = var3.readUnsignedShort(1428570095);
		this.anIntArray7642 = new int[this.anInt7640];
		this.anIntArrayArray7643 = new int[this.anInt7640][];
		this.aBooleanArray7644 = new boolean[this.anInt7640];
		this.anIntArray7641 = new int[this.anInt7640];
		int var4;
		for (var4 = 0; var4 < this.anInt7640; var4++) {
			this.anIntArray7642[var4] = var3.readUnsignedByte(1121978661);
			if (this.anIntArray7642[var4] == 6) {
				this.anIntArray7642[var4] = 2;
			}
		}
		for (var4 = 0; var4 < this.anInt7640; var4++) {
			this.aBooleanArray7644[var4] = var3.readUnsignedByte(2065880094) == 1;
		}
		for (var4 = 0; var4 < this.anInt7640; var4++) {
			this.anIntArray7641[var4] = var3.readUnsignedShort(588361147);
		}
		for (var4 = 0; var4 < this.anInt7640; var4++) {
			this.anIntArrayArray7643[var4] = new int[var3.readSmart(232057517)];
		}
		for (var4 = 0; var4 < this.anInt7640; var4++) {
			for (int var5 = 0; var5 < this.anIntArrayArray7643[var4].length; var5++) {
				this.anIntArrayArray7643[var4][var5] = var3.readSmart(-359897616);
			}
		}
	}

	public static void method3342(boolean arg0, int arg1) {
		try {
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub20_7888, 1, 1643393160);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub20_7889, 1, 426637317);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub6_7882, 0, 2125089922);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub3_7880, 0, 1479435987);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub27_7881, 0, -154770496);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub4_7883, 0, -31466921);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub11_7879, 0, -8393597);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub22_7892, 0, -1979288907);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub28_7885, 0, -429956049);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub13_7893, 0, 2122942101);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub2_7868, 0, 950009946);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub25_7896, 0, 3138234);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub9_7899, 0, -2145296168);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub9_7874, 0, -881429868);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub12_7906, 0, -1958194477);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub18_7877, Class134.aClass134_1515.anInt1516, -576790075);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub21_7875, 0, -1844529967);
			if (Class361.aClass_ra3793 != null && Class361.aClass_ra3793.v() && Class361.aClass_ra3793.cg()) {
				Class361.aClass_ra3793.ca();
			}
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub7_7891, 0, 219989694);
			Class325.method3212(1675488771);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub5_7890, 2, 879987659);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub16_7900, 1, -329193915);
			Class22.method473((byte) -31);
			client.aClass304_9030.method3008(1875739763).method4582(1636586836);
			client.aBoolean8992 = true;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "acy.l(" + ')');
		}
	}

	public static final void method3343(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -1061433034);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class146.method1737(var3, var4, arg0, -591748167);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "acy.fj(" + ')');
		}
	}

	public static void method3344(int arg0, int arg1) {
		try {
			Class330_Sub36_Sub3 var2 = Class464_Sub4.method5750(3, (long) arg0);
			var2.method3444(1908091451);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "acy.s(" + ')');
		}
	}
}
