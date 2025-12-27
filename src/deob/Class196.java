package deob;

import java.util.Iterator;

public class Class196 {

	public Object anObject1891;

	public int anInt1890;

	public Class196(Object arg0, int arg1) {
		this.anObject1891 = arg0;
		this.anInt1890 = arg1;
	}

	public static void method2141(byte arg0) {
		try {
			int var1 = Class297.aLinkedList3050.size();
			Iterator var2 = Class297.aLinkedList3050.iterator();
			while (var2.hasNext()) {
				Class330_Sub41 var3 = (Class330_Sub41) var2.next();
				var3.method3704(var3.method3693() + var3.method3702() / (var1 * 2));
				if (!var3.method3701()) {
					var2.remove();
				}
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "id.r(" + ')');
		}
	}

	public static final void method2142(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -2073890654);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class170.method2044(var3, var4, arg0, -1191354716);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "id.li(" + ')');
		}
	}

	public static final void method2143(Class430 arg0, short arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class360.anInt3754;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "id.ail(" + ')');
		}
	}

	public static final void method2144(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, byte arg3) {
		try {
			String var4 = (String) arg2.anObjectArray4386[--arg2.anInt4378];
			if (Class278.method2740(var4, arg2, (byte) 0) != null) {
				var4 = var4.substring(0, var4.length() - 1);
			}
			arg0.anObjectArray1304 = Class288.method2886(var4, arg2, 1443674303);
			arg0.aBoolean1293 = true;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "id.mw(" + ')');
		}
	}

	public static final void method2145(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -1009147002);
			Class543.method6343(var3, arg0, 741273024);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "id.cz(" + ')');
		}
	}

	public static final void method2146(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, byte arg3) {
		try {
			arg0.anInt1224 = arg2.anIntArray4387[--arg2.anInt4376];
			Class404.method4738(arg0, 1700961564);
			if (arg0.anInt1287 == -1 && !arg1.aBoolean1402) {
				Class330_Sub22.method3377(arg0.anInt1196, (byte) 17);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "id.ds(" + ')');
		}
	}
}
