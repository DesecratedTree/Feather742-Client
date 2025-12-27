package deob;

import java.util.ArrayList;

public class Class428 {

	public static int anInt4352 = 2000000;

	public static int anInt4353 = 0;

	public static int[] anIntArray4354 = new int[3];

	public static Class367 aClass367_4355 = new Class367(4);

	public static int anInt4356 = 200000;

	public static Class260[] aClass260Array4359 = new Class260[2];

	public static boolean aBoolean4357 = false;

	public static String aString4358 = null;

	public static ArrayList anArrayList4351 = new ArrayList();

	public static int anInt4360 = 0;

	public static int anInt4361 = 0;

	public static Class370 aClass370_4364;

	public static Class540 aClass540_4363;

	public static IndexTable aClass280_4362;

	public Class428() throws Throwable {
		throw new Error();
	}

	public static final void method5323(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.anIntArray9143[var2];
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ru.ta(" + ')');
		}
	}

	public static int method5324(int arg0, int arg1, int arg2) {
		try {
			int var3;
			if (arg1 > arg0) {
				var3 = arg0;
				arg0 = arg1;
				arg1 = var3;
			}
			while (arg1 != 0) {
				var3 = arg0 % arg1;
				arg0 = arg1;
				arg1 = var3;
			}
			return arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ru.j(" + ')');
		}
	}
}
