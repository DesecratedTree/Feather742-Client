package deob;

public class Class312 {

	public int anInt3250;

	public int anInt3248;

	public int anInt3249;

	public int anInt3247;

	public Class312(int arg0, int arg1, int arg2, int arg3) {
		this.anInt3250 = arg0;
		this.anInt3248 = arg1;
		this.anInt3249 = arg2;
		this.anInt3247 = arg3;
	}

	public Class312() {
		this.anInt3250 = (int) (Math.random() * 4.0D) + 32;
		this.anInt3248 = (int) (Math.random() * 2.0D) + 3;
		this.anInt3249 = (int) (Math.random() * 3.0D) + 16;
		if (Class448.aClass330_Sub50_5555.aClass464_Sub13_7893.method5787(1571691871) == 1) {
			this.anInt3247 = (int) (Math.random() * 6.0D);
		} else {
			this.anInt3247 = (int) (Math.random() * 12.0D);
		}
	}

	public static final synchronized long method3111(byte arg0) {
		try {
			long var1 = System.currentTimeMillis();
			if (var1 < Class108.aLong1025) {
				Class108.aLong1024 += Class108.aLong1025 - var1;
			}
			Class108.aLong1025 = var1;
			return var1 + Class108.aLong1024;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mz.r(" + ')');
		}
	}

	public static final void method3112(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.aClass286Array9234[var2].anInt2947;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mz.yt(" + ')');
		}
	}

	public static final void method3113(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			if (Class401_Sub1.aClass145_Sub1_8249.method1693(-1298010140) != Class136.aClass136_1523 || Class401_Sub1.aClass145_Sub1_8249.method1718(2074961554) != Class146.aClass146_1611) {
				throw new RuntimeException();
			}
			Class166_Sub2 var3 = (Class166_Sub2) Class401_Sub1.aClass145_Sub1_8249.method1707(2014979518);
			Class475_Sub1 var4 = (Class475_Sub1) Class401_Sub1.aClass145_Sub1_8249.method1715(-1343207523);
			Class260 var5 = var3.method2006(-1731595532);
			Class260 var6 = Class260.method2549(var5);
			var6.aFloat2715 += var2;
			Class260 var7 = Class260.method2561(var4.method5932(-1038912688), var6);
			var7.method2557();
			float var8 = var3.method2009(-946247409).method2565();
			Class259.method2547(var4.method5932(-1199286102), var7, var5, var8, Class428.aClass260Array4359);
			Object var9 = null;
			if (Class428.aClass260Array4359[0] == null) {
				throw new RuntimeException("");
			}
			Class260 var10;
			if (Class428.aClass260Array4359[1] == null) {
				var10 = Class428.aClass260Array4359[0];
			} else if (Class260.method2561(var4.method5932(374371048), Class428.aClass260Array4359[0]).method2565() < Class260.method2561(var4.method5932(-1789719193), Class428.aClass260Array4359[1]).method2565()) {
				var10 = Class428.aClass260Array4359[1];
			} else {
				var10 = Class428.aClass260Array4359[0];
			}
			float var11 = Class382.method4408(var5.aFloat2716 - var10.aFloat2716, var5.aFloat2711 - var10.aFloat2711, -172237676);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = (int) ((double) var11 * 2607.5945876176133D) & 0x3FFF;
		} catch (RuntimeException var12) {
			throw Class476.method5964(var12, "mz.ait(" + ')');
		}
	}

	public static boolean method3114(int arg0, int arg1) {
		try {
			return arg0 == 1 || arg0 == 3 || arg0 == 5;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mz.p(" + ')');
		}
	}
}
