package deob;

public class Class94 {

	public int anInt850;

	public int anInt848;

	public int anInt847;

	public int anInt849;

	public Class94 method1090(int arg0, byte arg1) {
		try {
			return new Class94(this.anInt850, arg0, this.anInt847, this.anInt849);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "du.r(" + ')');
		}
	}

	public Class94(int arg0, int arg1, int arg2, int arg3) {
		this.anInt850 = arg0;
		this.anInt848 = arg1;
		this.anInt847 = arg2;
		this.anInt849 = arg3;
	}

	public static void method1091(IComponentDefinitions[] arg0, byte arg1) {
		try {
			for (int var2 = 0; var2 < arg0.length; var2++) {
				IComponentDefinitions var3 = arg0[var2];
				if (var3.anObjectArray1302 != null) {
					Class330_Sub42 var4 = new Class330_Sub42();
					var4.aClass114_7809 = var3;
					var4.anObjectArray7817 = var3.anObjectArray1302;
					Class163.method1921(var4, 2000000, (byte) -67);
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "du.o(" + ')');
		}
	}

	public static final void method1092(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class100.method1208(var3, var4, arg0, 423212371);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "du.mr(" + ')');
		}
	}

	public static final void method1093(Class430 arg0, int arg1) {
		try {
			arg0.anInt4380 -= 2;
			if (arg0.aLongArray4379[arg0.anInt4380 + 1] == arg0.aLongArray4379[arg0.anInt4380]) {
				arg0.anInt4397 += arg0.anIntArray4394[arg0.anInt4397];
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "du.bl(" + ')');
		}
	}

	public static final void method1094(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -1005589482);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class460.method5691(var3, var4, arg0, -125160014);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "du.ci(" + ')');
		}
	}
}
