package deob;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AbstractQueue_Sub1 extends AbstractQueue {

	public int anInt6450;

	public Class196[] aClass196Array6448;

	public Map aMap6447;

	public Comparator aComparator6446;

	public int anInt6449;

	public AbstractQueue_Sub1(int arg0, Comparator arg1) {
		this.anInt6450 = 0;
		this.aClass196Array6448 = new Class196[arg0];
		this.aMap6447 = new HashMap();
		this.aComparator6446 = arg1;
	}

	public void method6483(int arg0) {
		try {
			int var2 = (this.aClass196Array6448.length << 1) + 1;
			this.aClass196Array6448 = (Class196[]) Arrays.copyOf(this.aClass196Array6448, var2);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "akf.r(" + ')');
		}
	}

	public AbstractQueue_Sub1(int arg0) {
		this(arg0, (Comparator) null);
	}

	public boolean offer(Object arg0) {
		try {
			if (this.aMap6447.containsKey(arg0)) {
				throw new IllegalArgumentException("");
			}
			this.anInt6450++;
			int var2 = this.anInt6449;
			if (var2 >= this.aClass196Array6448.length) {
				this.method6483(1197059748);
			}
			this.anInt6449++;
			if (var2 == 0) {
				this.aClass196Array6448[0] = new Class196(arg0, 0);
				this.aMap6447.put(arg0, this.aClass196Array6448[0]);
			} else {
				this.aClass196Array6448[var2] = new Class196(arg0, var2);
				this.aMap6447.put(arg0, this.aClass196Array6448[var2]);
				this.method6484(var2, (byte) 80);
			}
			return true;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "akf.offer(" + ')');
		}
	}

	public void method6484(int arg0, byte arg1) {
		try {
			Class196 var3 = this.aClass196Array6448[arg0];
			while (arg0 > 0) {
				int var4 = arg0 - 1 >>> 1;
				Class196 var5 = this.aClass196Array6448[var4];
				if (this.aComparator6446 == null) {
					if (((Comparable) var3.anObject1891).compareTo(var5.anObject1891) >= 0) {
						if (arg1 <= 2) {
							return;
						}
						break;
					}
				} else if (this.aComparator6446.compare(var3.anObject1891, var5.anObject1891) >= 0) {
					if (arg1 <= 2) {
					}
					break;
				}
				this.aClass196Array6448[arg0] = var5;
				this.aClass196Array6448[arg0].anInt1890 = arg0;
				arg0 = var4;
			}
			this.aClass196Array6448[arg0] = var3;
			this.aClass196Array6448[arg0].anInt1890 = arg0;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "akf.j(" + ')');
		}
	}

	public Object poll() {
		try {
			if (this.anInt6449 == 0) {
				return null;
			}
			this.anInt6450++;
			Object var1 = this.aClass196Array6448[0].anObject1891;
			this.aMap6447.remove(var1);
			this.anInt6449--;
			if (this.anInt6449 == 0) {
				this.aClass196Array6448[this.anInt6449] = null;
			} else {
				this.aClass196Array6448[0] = this.aClass196Array6448[this.anInt6449];
				this.aClass196Array6448[0].anInt1890 = 0;
				this.aClass196Array6448[this.anInt6449] = null;
				this.method6485(0, (byte) 113);
			}
			return var1;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "akf.poll(" + ')');
		}
	}

	public boolean remove(Object arg0) {
		try {
			Class196 var2 = (Class196) this.aMap6447.remove(arg0);
			if (var2 == null) {
				return false;
			}
			this.anInt6450++;
			this.anInt6449--;
			if (var2.anInt1890 == this.anInt6449) {
				this.aClass196Array6448[this.anInt6449] = null;
				return true;
			}
			Class196 var3 = this.aClass196Array6448[this.anInt6449];
			this.aClass196Array6448[this.anInt6449] = null;
			this.aClass196Array6448[var2.anInt1890] = var3;
			this.aClass196Array6448[var2.anInt1890].anInt1890 = var2.anInt1890;
			this.method6485(var2.anInt1890, (byte) 85);
			if (var3 == this.aClass196Array6448[var2.anInt1890]) {
				this.method6484(var2.anInt1890, (byte) 29);
			}
			return true;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "akf.remove(" + ')');
		}
	}

	public void method6485(int arg0, byte arg1) {
		try {
			Class196 var3 = this.aClass196Array6448[arg0];
			int var5 = this.anInt6449 >>> 1;
			while (arg0 < var5) {
				int var6 = (arg0 << 1) + 1;
				Class196 var7 = this.aClass196Array6448[var6];
				int var8 = (arg0 << 1) + 2;
				Class196 var9 = this.aClass196Array6448[var8];
				int var4;
				if (this.aComparator6446 == null) {
					if (var8 < this.anInt6449 && ((Comparable) var7.anObject1891).compareTo(var9.anObject1891) > 0) {
						var4 = var8;
					} else {
						var4 = var6;
					}
				} else if (var8 < this.anInt6449 && this.aComparator6446.compare(var7.anObject1891, var9.anObject1891) > 0) {
					var4 = var8;
				} else {
					var4 = var6;
				}
				if (this.aComparator6446 == null) {
					if (((Comparable) var3.anObject1891).compareTo(this.aClass196Array6448[var4].anObject1891) <= 0) {
						if (arg1 <= 8) {
						}
						break;
					}
				} else if (this.aComparator6446.compare(var3.anObject1891, this.aClass196Array6448[var4].anObject1891) <= 0) {
					if (arg1 <= 8) {
						throw new IllegalStateException();
					}
					break;
				}
				this.aClass196Array6448[arg0] = this.aClass196Array6448[var4];
				this.aClass196Array6448[arg0].anInt1890 = arg0;
				arg0 = var4;
			}
			this.aClass196Array6448[arg0] = var3;
			this.aClass196Array6448[arg0].anInt1890 = arg0;
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "akf.i(" + ')');
		}
	}

	public boolean contains(Object arg0) {
		try {
			return this.aMap6447.containsKey(arg0);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "akf.contains(" + ')');
		}
	}

	public Iterator iterator() {
		try {
			return new Class202(this);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "akf.iterator(" + ')');
		}
	}

	public Object[] toArray() {
		try {
			Object[] var1 = super.toArray();
			if (this.aComparator6446 == null) {
				Arrays.sort(var1);
			} else {
				Arrays.sort(var1, this.aComparator6446);
			}
			return var1;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "akf.toArray(" + ')');
		}
	}

	public int size() {
		try {
			return this.anInt6449;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "akf.size(" + ')');
		}
	}

	public Object peek() {
		try {
			return this.anInt6449 == 0 ? null : this.aClass196Array6448[0].anObject1891;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "akf.peek(" + ')');
		}
	}

	public static final int method6486(int arg0, int arg1, byte arg2) {
		try {
			int var3 = arg0 + arg1 * 57;
			int var6 = var3 << 13 ^ var3;
			int var4 = (var6 * 15731 * var6 + 789221) * var6 + 1376312589 & Integer.MAX_VALUE;
			return var4 >> 19 & 0xFF;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "akf.v(" + ')');
		}
	}
}
