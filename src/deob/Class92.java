package deob;

public abstract class Class92 {

	public static final void method1070(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class215.method2236(var3, var4, arg0, (byte) 59);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ds.cf(" + ')');
		}
	}

	public static final void method1071(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class43.method585(var3, var4, arg0, 822953439);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ds.ic(" + ')');
		}
	}

	public static final void method1072(Class430 arg0, byte arg1) {
		try {
			arg0.anInt4376 -= 4;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			boolean var3 = arg0.anIntArray4387[arg0.anInt4376 + 1] == 1;
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			boolean var5 = arg0.anIntArray4387[arg0.anInt4376 + 3] == 1;
			Class534.method6306(var2, var3, var4, var5, 1774464394);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ds.ank(" + ')');
		}
	}

	public static final void method1073(Class430 arg0, int arg1) throws Exception_Sub4 {
		try {
			arg0.anInt4376 -= 4;
			float var2 = (float) arg0.anIntArray4387[arg0.anInt4376];
			float var3 = (float) arg0.anIntArray4387[arg0.anInt4376 + 1];
			float var4 = (float) arg0.anIntArray4387[arg0.anInt4376 + 2];
			float var5 = (float) arg0.anIntArray4387[arg0.anInt4376 + 3] / 1000.0F;
			Class401_Sub1.aClass145_Sub1_8249.method1681(Class260.method2577(var2, var3, var4), var5, (short) -9391);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ds.aih(" + ')');
		}
	}
}
