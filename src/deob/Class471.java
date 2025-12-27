package deob;

import java.util.Collection;
import java.util.Iterator;

public class Class471 implements Iterable, Collection {

	public Class330 aClass330_5611 = new Class330();

	public static int anInt5612;

	public Class330 aClass330_5610;

	public Class471() {
		this.aClass330_5611.aClass330_3340 = this.aClass330_5611;
		this.aClass330_5611.aClass330_3342 = this.aClass330_5611;
	}

	public void method5866(int arg0) {
		try {
			while (this.aClass330_5611.aClass330_3340 != this.aClass330_5611) {
				this.aClass330_5611.aClass330_3340.method3252(-2140518504);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tn.r(" + ')');
		}
	}

	public Class330 method5867(short arg0) {
		try {
			Class330 var2 = this.aClass330_5611.aClass330_3340;
			if (this.aClass330_5611 == var2) {
				return null;
			} else {
				var2.method3252(-1917353511);
				return var2;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tn.o(" + ')');
		}
	}

	public void method5868(Class471 arg0, int arg1) {
		try {
			if (this.aClass330_5611 != this.aClass330_5611.aClass330_3340) {
				this.method5881(arg0, this.aClass330_5611.aClass330_3340, -2034260786);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "tn.f(" + ')');
		}
	}

	public Class330 method5869(int arg0) {
		try {
			return this.method5870(null, (byte) 114);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tn.z(" + ')');
		}
	}

	public Class330 method5870(Class330 arg0, byte arg1) {
		try {
			Class330 var3;
			if (arg0 == null) {
				var3 = this.aClass330_5611.aClass330_3340;
			} else {
				var3 = arg0;
			}
			if (var3 == this.aClass330_5611) {
				this.aClass330_5610 = null;
				return null;
			} else {
				this.aClass330_5610 = var3.aClass330_3340;
				return var3;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "tn.w(" + ')');
		}
	}

	public Class330 method5871(byte arg0) {
		try {
			return this.method5872(null, 719943586);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tn.n(" + ')');
		}
	}

	public Class330 method5872(Class330 arg0, int arg1) {
		try {
			Class330 var3;
			if (arg0 == null) {
				var3 = this.aClass330_5611.aClass330_3342;
			} else {
				var3 = arg0;
			}
			if (var3 == this.aClass330_5611) {
				this.aClass330_5610 = null;
				return null;
			} else {
				this.aClass330_5610 = var3.aClass330_3342;
				return var3;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "tn.l(" + ')');
		}
	}

	public Class330 method5873(byte arg0) {
		try {
			Class330 var2 = this.aClass330_5610;
			if (this.aClass330_5611 == var2) {
				this.aClass330_5610 = null;
				return null;
			} else {
				this.aClass330_5610 = var2.aClass330_3340;
				return var2;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tn.b(" + ')');
		}
	}

	public Class330 method5874(int arg0) {
		try {
			Class330 var2 = this.aClass330_5610;
			if (var2 == this.aClass330_5611) {
				this.aClass330_5610 = null;
				return null;
			} else {
				this.aClass330_5610 = var2.aClass330_3342;
				return var2;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tn.k(" + ')');
		}
	}

	public int method5875(int arg0) {
		try {
			int var2 = 0;
			for (Class330 var3 = this.aClass330_5611.aClass330_3340; var3 != this.aClass330_5611; var3 = var3.aClass330_3340) {
				var2++;
			}
			return var2;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "tn.q(" + ')');
		}
	}

	public boolean method5876(int arg0) {
		try {
			return this.aClass330_5611.aClass330_3340 == this.aClass330_5611;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tn.u(" + ')');
		}
	}

	public Class330[] method5877(int arg0) {
		try {
			Class330[] var2 = new Class330[this.method5875(-71234698)];
			int var3 = 0;
			for (Class330 var4 = this.aClass330_5611.aClass330_3340; var4 != this.aClass330_5611; var4 = var4.aClass330_3340) {
				var2[var3++] = var4;
			}
			return var2;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "tn.x(" + ')');
		}
	}

	public Iterator iterator() {
		try {
			return new Class474(this);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "tn.iterator(" + ')');
		}
	}

	public int size() {
		try {
			return this.method5875(70865779);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "tn.size(" + ')');
		}
	}

	public boolean isEmpty() {
		try {
			return this.method5876(-1982313833);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "tn.isEmpty(" + ')');
		}
	}

	public void method5878(Class330 arg0, short arg1) {
		try {
			if (arg0.aClass330_3342 != null) {
				arg0.method3252(-2003600256);
			}
			arg0.aClass330_3342 = this.aClass330_5611.aClass330_3342;
			arg0.aClass330_3340 = this.aClass330_5611;
			arg0.aClass330_3342.aClass330_3340 = arg0;
			arg0.aClass330_3340.aClass330_3342 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "tn.j(" + ')');
		}
	}

	public Object[] toArray(Object[] arg0) {
		try {
			int var2 = 0;
			for (Class330 var3 = this.aClass330_5611.aClass330_3340; var3 != this.aClass330_5611; var3 = var3.aClass330_3340) {
				arg0[var2++] = var3;
			}
			return arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "tn.toArray(" + ')');
		}
	}

	public boolean method5879(Class330 arg0, int arg1) {
		try {
			this.method5878(arg0, (short) 8192);
			return true;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "tn.g(" + ')');
		}
	}

	public boolean remove(Object arg0) {
		try {
			throw new RuntimeException();
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tn.remove(" + ')');
		}
	}

	public boolean containsAll(Collection arg0) {
		try {
			throw new RuntimeException();
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tn.containsAll(" + ')');
		}
	}

	public boolean removeAll(Collection arg0) {
		try {
			throw new RuntimeException();
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tn.removeAll(" + ')');
		}
	}

	public void clear() {
		try {
			this.method5866(613065745);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "tn.clear(" + ')');
		}
	}

	public boolean add(Object arg0) {
		try {
			return this.method5879((Class330) arg0, -1191937432);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tn.add(" + ')');
		}
	}

	public boolean equals(Object arg0) {
		try {
			return super.equals(arg0);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tn.equals(" + ')');
		}
	}

	public int hashCode() {
		try {
			return super.hashCode();
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "tn.hashCode(" + ')');
		}
	}

	public boolean retainAll(Collection arg0) {
		try {
			throw new RuntimeException();
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tn.retainAll(" + ')');
		}
	}

	public Object[] toArray() {
		try {
			return this.method5877(394530557);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "tn.toArray(" + ')');
		}
	}

	public void method5880(Class330 arg0, int arg1) {
		try {
			if (arg0.aClass330_3342 != null) {
				arg0.method3252(-2084037272);
			}
			arg0.aClass330_3342 = this.aClass330_5611;
			arg0.aClass330_3340 = this.aClass330_5611.aClass330_3340;
			arg0.aClass330_3342.aClass330_3340 = arg0;
			arg0.aClass330_3340.aClass330_3342 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "tn.i(" + ')');
		}
	}

	public boolean contains(Object arg0) {
		try {
			throw new RuntimeException();
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tn.contains(" + ')');
		}
	}

	public boolean addAll(Collection arg0) {
		try {
			throw new RuntimeException();
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tn.addAll(" + ')');
		}
	}

	public void method5881(Class471 arg0, Class330 arg1, int arg2) {
		try {
			Class330 var4 = this.aClass330_5611.aClass330_3342;
			this.aClass330_5611.aClass330_3342 = arg1.aClass330_3342;
			arg1.aClass330_3342.aClass330_3340 = this.aClass330_5611;
			if (this.aClass330_5611 != arg1) {
				arg1.aClass330_3342 = arg0.aClass330_5611.aClass330_3342;
				arg1.aClass330_3342.aClass330_3340 = arg1;
				var4.aClass330_3340 = arg0.aClass330_5611;
				arg0.aClass330_5611.aClass330_3342 = var4;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "tn.s(" + ')');
		}
	}

	public static final void method5882(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 1276123904);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class101.method1216(var3, var4, arg0, 705611080);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "tn.ia(" + ')');
		}
	}
}
