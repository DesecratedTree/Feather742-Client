package deob;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Class330_Sub47 extends Class330 {

	public int anInt7852;

	public int anInt7856;

	public int[] anIntArray7851;

	public int[] anIntArray7853;

	public int[] anIntArray7854;

	public Field[] aFieldArray7855;

	public Method[] aMethodArray7857;

	public byte[][][] aByteArrayArrayArray7858;

	public static final void method3829(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 691450575);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class367.method4300(var3, var4, arg0, -1955436595);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aec.ov(" + ')');
		}
	}

	public static final void method3830(Class430 arg0, byte arg1) {
		try {
			arg0.anInt4376 -= 3;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			Class330_Sub36_Sub4 var5 = Class2.aClass523_44.method6233(var2, 1287053266);
			if (var5.method3452(var3, 1760973362).anInt4048 != 0) {
				throw new RuntimeException("");
			}
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var5.method3453(var3, var4, (byte) -86);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "aec.adm(" + ')');
		}
	}
}
