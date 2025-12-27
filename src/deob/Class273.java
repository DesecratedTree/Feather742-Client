package deob;

import java.util.HashMap;
import java.util.Map;

public class Class273 {

	public long aLong2761;

	public int anInt2758;

	public Class271 aClass271_2762;

	public Map aMap2763;

	public AbstractQueue_Sub1 anAbstractQueue_Sub1_2759;

	public AbstractQueue_Sub1 anAbstractQueue_Sub1_2760;

	public Object method2674(Object arg0, int arg1) {
		try {
			synchronized (this) {
				if (this.aLong2761 != -1L) {
					this.method2679((short) 4095);
				}
				Class288 var4 = (Class288) this.aMap2763.remove(arg0);
				if (var4 == null) {
					return null;
				}
				this.anAbstractQueue_Sub1_2759.remove(var4);
				if (this.method2675((byte) -50)) {
					this.anAbstractQueue_Sub1_2760.remove(var4);
				}
				return var4.anObject2951;
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "lj.p(" + ')');
		}
	}

	public boolean method2675(byte arg0) {
		try {
			return this.anInt2758 != -1;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "lj.r(" + ')');
		}
	}

	public Object method2676(Object arg0, Object arg1, int arg2) {
		try {
			synchronized (this) {
				if (this.aLong2761 != -1L) {
					this.method2679((short) 4095);
				}
				Class288 var5 = (Class288) this.aMap2763.get(arg0);
				if (var5 != null) {
					Object var11 = var5.anObject2951;
					var5.anObject2951 = arg1;
					this.method2677(var5, false, 1312741157);
					return var11;
				}
				Class288 var6;
				if (this.method2675((byte) -55) && this.aMap2763.size() == this.anInt2758) {
					var6 = (Class288) this.anAbstractQueue_Sub1_2760.remove();
					this.aMap2763.remove(var6.anObject2952);
					this.anAbstractQueue_Sub1_2759.remove(var6);
				}
				var6 = new Class288(arg1, arg0);
				this.aMap2763.put(arg0, var6);
				this.method2677(var6, true, 1673824885);
				return null;
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "lj.i(" + ')');
		}
	}

	public void method2677(Class288 arg0, boolean arg1, int arg2) {
		try {
			if (!arg1) {
				this.anAbstractQueue_Sub1_2759.remove(arg0);
				if (this.method2675((byte) -86) && !this.anAbstractQueue_Sub1_2760.remove(arg0)) {
					throw new IllegalStateException("");
				}
			}
			arg0.aLong2953 = System.currentTimeMillis();
			if (this.method2675((byte) -5)) {
				switch(this.aClass271_2762.anInt2753) {
					case 0:
						arg0.aLong2954++;
						break;
					case 1:
						arg0.aLong2954 = arg0.aLong2953;
				}
				this.anAbstractQueue_Sub1_2760.add(arg0);
			}
			this.anAbstractQueue_Sub1_2759.add(arg0);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "lj.o(" + ')');
		}
	}

	public void method2678(int arg0) {
		try {
			synchronized (this) {
				this.aMap2763.clear();
				this.anAbstractQueue_Sub1_2759.clear();
				if (this.method2675((byte) -57)) {
					this.anAbstractQueue_Sub1_2760.clear();
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "lj.f(" + ')');
		}
	}

	public void method2679(short arg0) {
		try {
			if (this.aLong2761 == -1L) {
				throw new IllegalStateException("");
			}
			long var2 = System.currentTimeMillis() - this.aLong2761;
			while (!this.anAbstractQueue_Sub1_2759.isEmpty()) {
				Class288 var4 = (Class288) this.anAbstractQueue_Sub1_2759.peek();
				if (var4.aLong2953 >= var2) {
					break;
				}
				this.aMap2763.remove(var4.anObject2952);
				this.anAbstractQueue_Sub1_2759.remove(var4);
				if (this.method2675((byte) -127)) {
					this.anAbstractQueue_Sub1_2760.remove(var4);
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "lj.s(" + ')');
		}
	}

	public Class273(int arg0, Class271 arg1) {
		this(-1L, arg0, arg1);
	}

	public Object method2680(Object arg0, int arg1) {
		try {
			synchronized (this) {
				if (this.aLong2761 != -1L) {
					this.method2679((short) 4095);
				}
				Class288 var4 = (Class288) this.aMap2763.get(arg0);
				if (var4 == null) {
					return null;
				} else {
					this.method2677(var4, false, 940462608);
					return var4.anObject2951;
				}
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "lj.j(" + ')');
		}
	}

	public Class273(long arg0, int arg1, Class271 arg2) {
		this.aLong2761 = arg0;
		this.anInt2758 = arg1;
		this.aClass271_2762 = arg2;
		if (this.anInt2758 == -1) {
			this.aMap2763 = new HashMap(64);
			this.anAbstractQueue_Sub1_2759 = new AbstractQueue_Sub1(64);
			this.anAbstractQueue_Sub1_2760 = null;
		} else if (this.aClass271_2762 == null) {
			throw new IllegalArgumentException("");
		} else {
			this.aMap2763 = new HashMap(this.anInt2758);
			this.anAbstractQueue_Sub1_2759 = new AbstractQueue_Sub1(this.anInt2758);
			this.anAbstractQueue_Sub1_2760 = new AbstractQueue_Sub1(this.anInt2758);
		}
	}

	public static final void method2681(Class430 arg0, byte arg1) {
		try {
			boolean var2 = true;
			if (client.aBoolean9198) {
				try {
					Object var3 = Class232.aClass232_2456.method2356(1860764593);
					if (var3 != null) {
						var2 = (Boolean) var3;
					}
				} catch (Throwable var4) {
				}
			}
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2 ? 1 : 0;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "lj.apc(" + ')');
		}
	}

	public static final void method2682(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub12_7906.method5783((byte) 0) ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "lj.apg(" + ')');
		}
	}

	public static void method2683(String arg0, int arg1, int arg2) {
		try {
			if (Class507.aClass498_5937 == null) {
				Class507.aClass498_5937 = new Class498();
			}
			Class507.aClass498_5937.aString5886 = arg0;
			Class507.aClass498_5937.anInt5889 = arg1 + 1099;
			Class507.aClass498_5937.anInt5887 = Class507.aClass498_5937.anInt5889 * 1467410725 + 1405932864;
			Class507.aClass498_5937.anInt5885 = Class507.aClass498_5937.anInt5889 * -1473668237 + 1047080176;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "lj.i(" + ')');
		}
	}
}
