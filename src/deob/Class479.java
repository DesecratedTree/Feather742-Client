package deob;

import java.util.Iterator;

public class Class479 implements Iterator {

	public Class330_Sub36 aClass330_Sub36_5727 = null;

	public Class472 aClass472_5728;

	public Class330_Sub36 aClass330_Sub36_5726;

	public Class479(Class472 arg0) {
		this.aClass472_5728 = arg0;
		this.aClass330_Sub36_5726 = this.aClass472_5728.aClass330_Sub36_5613.aClass330_Sub36_7735;
		this.aClass330_Sub36_5727 = null;
	}

	public void method6010(int arg0) {
		try {
			this.aClass330_Sub36_5726 = this.aClass472_5728.aClass330_Sub36_5613.aClass330_Sub36_7735;
			this.aClass330_Sub36_5727 = null;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tv.f(" + ')');
		}
	}

	public Object next() {
		try {
			Class330_Sub36 var1 = this.aClass330_Sub36_5726;
			if (var1 == this.aClass472_5728.aClass330_Sub36_5613) {
				var1 = null;
				this.aClass330_Sub36_5726 = null;
			} else {
				this.aClass330_Sub36_5726 = var1.aClass330_Sub36_7735;
			}
			this.aClass330_Sub36_5727 = var1;
			return var1;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "tv.next(" + ')');
		}
	}

	public void remove() {
		try {
			if (this.aClass330_Sub36_5727 == null) {
				throw new IllegalStateException();
			}
			this.aClass330_Sub36_5727.method3439((byte) -106);
			this.aClass330_Sub36_5727 = null;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "tv.remove(" + ')');
		}
	}

	public boolean hasNext() {
		try {
			return this.aClass472_5728.aClass330_Sub36_5613 != this.aClass330_Sub36_5726;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "tv.hasNext(" + ')');
		}
	}

	public Class330_Sub36 method6011(byte arg0) {
		try {
			this.method6010(743443457);
			return (Class330_Sub36) this.next();
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tv.z(" + ')');
		}
	}

	public static void method6012(byte arg0) {
		try {
			for (Class330_Sub43 var1 = (Class330_Sub43) Class442.aClass497_4489.method6099((byte) 20); var1 != null; var1 = (Class330_Sub43) Class442.aClass497_4489.method6098((short) -32768)) {
				Class502.method6132(var1.anInt7819, (byte) -19);
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "tv.w(" + ')');
		}
	}

	public static final void method6013(Class432_Sub1 arg0, int arg1, int arg2) {
		try {
			Class276.method2729(arg0, arg1, false, -2128331407);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "tv.jo(" + ')');
		}
	}

	public static void method6014(int arg0) {
		try {
			Class95_Sub11.method1129(-1, 255, 1749277043);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "tv.y(" + ')');
		}
	}

	public static Interface26 method6015(Interface26[] arg0, int arg1, byte arg2) {
		try {
			Interface26[] var3 = arg0;
			for (int var4 = 0; var4 < var3.length; var4++) {
				Interface26 var5 = var3[var4];
				if (arg1 == var5.method297((short) -7218)) {
					return var5;
				}
			}
			return null;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "tv.r(" + ')');
		}
	}

	public static final void method6016(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 3;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			Class498.method6110(9, var2 << 16 | var3, var4, "", (byte) 41);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "tv.anb(" + ')');
		}
	}
}
