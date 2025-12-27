package deob;

import java.util.Iterator;

public class Class268 {

	public Class367 aClass367_2743 = new Class367(64);

	public IndexTable aClass280_2741;

	public IndexTable aClass280_2742;

	public static int anInt2745 = 0;

	public static int anInt2747 = 32768;

	public static int anInt2744;

	public static int anInt2748;

	public static boolean aBoolean2746;

	public Class268(Class454 arg0, IndexTable arg1, IndexTable arg2) {
		this.aClass280_2741 = arg1;
		this.aClass280_2742 = arg2;
		if (this.aClass280_2741 != null) {
			this.aClass280_2741.method2763(0, -2141712958);
		}
		if (this.aClass280_2742 != null) {
			this.aClass280_2742.method2763(0, -2125762463);
		}
	}

	public Class330_Sub36_Sub9 method2659(int arg0, int arg1) {
		try {
			Class330_Sub36_Sub9 var3 = (Class330_Sub36_Sub9) this.aClass367_2743.get((long) arg0);
			if (var3 != null) {
				return var3;
			}
			byte[] var4;
			if (arg0 >= 32768) {
				var4 = this.aClass280_2742.getFile(0, arg0 & 0x7FFF);
			} else {
				var4 = this.aClass280_2741.getFile(0, arg0);
			}
			var3 = new Class330_Sub36_Sub9();
			if (var4 != null) {
				var3.method3476(new Buffer(var4), (byte) 1);
			}
			if (arg0 >= 32768) {
				var3.method3479(-9525558);
			}
			this.aClass367_2743.put(var3, (long) arg0);
			return var3;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "le.r(" + ')');
		}
	}

	public static Class366 method2660(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			Class363.aClass366_Sub6_3803.anInt3854 = arg0;
			Class363.aClass366_Sub6_3803.anInt3853 = arg1;
			Class363.aClass366_Sub6_3803.anInt3852 = arg2;
			Class363.aClass366_Sub6_3803.anInt3855 = arg3;
			Class363.aClass366_Sub6_3803.anInt8009 = arg4;
			return Class363.aClass366_Sub6_3803;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "le.p(" + ')');
		}
	}

	public static final void method2661(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class24.method483(var3, arg0, -267729105);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "le.qb(" + ')');
		}
	}

	public static final void method2662(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = Class146.method1738(var2, -849826454);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "le.zr(" + ')');
		}
	}

	public static final void method2663(int arg0) {
		try {
			Iterator var1 = client.aClass497_9216.iterator();
			while (var1.hasNext()) {
				Class330_Sub36_Sub2 var2 = (Class330_Sub36_Sub2) var1.next();
				Class432_Sub1_Sub1_Sub4 var3 = var2.aClass432_Sub1_Sub1_Sub4_9624;
				var3.method5499(1, 2131930905);
				if (var3.method5505(-1390004513)) {
					var2.method3252(-1452763994);
					var3.method5503(888749273);
				}
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "le.jc(" + ')');
		}
	}
}
