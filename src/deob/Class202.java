package deob;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Class202 implements Iterator {

	public int anInt1933 = 0;

	public AbstractQueue_Sub1 anAbstractQueue_Sub1_1935;

	public int anInt1934 = this.anAbstractQueue_Sub1_1935.anInt6450;

	public static int anInt1936;

	public Class202(AbstractQueue_Sub1 arg0) {
		this.anAbstractQueue_Sub1_1935 = arg0;
	}

	public boolean hasNext() {
		try {
			return this.anInt1933 < this.anAbstractQueue_Sub1_1935.anInt6449;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "im.hasNext(" + ')');
		}
	}

	public void remove() {
		try {
			throw new UnsupportedOperationException();
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "im.remove(" + ')');
		}
	}

	public Object next() {
		try {
			if (this.anAbstractQueue_Sub1_1935.anInt6450 != this.anInt1934) {
				throw new ConcurrentModificationException();
			} else if (this.anInt1933 < this.anAbstractQueue_Sub1_1935.anInt6449) {
				Object var1 = this.anAbstractQueue_Sub1_1935.aClass196Array6448[this.anInt1933].anObject1891;
				this.anInt1933++;
				return var1;
			} else {
				throw new NoSuchElementException();
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "im.next(" + ')');
		}
	}

	public static final void method2172(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class457.method5661(var3, var4, arg0, (short) -26820);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "im.dq(" + ')');
		}
	}

	public static boolean method2173(Interface2 arg0, int arg1) {
		try {
			Class473 var2 = client.aClass304_9030.method3025((byte) 13).method5705(arg0.method34((short) -10103), (byte) -34);
			if (var2.anInt5652 == -1) {
				return true;
			} else {
				Class522 var3 = Class497.aClass552_5884.method6382(var2.anInt5652, 1416209437);
				return var3.anInt6019 == -1 ? true : var3.method6229(1913467043);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "im.f(" + ')');
		}
	}

	public static final void method2174(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1321;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "im.pf(" + ')');
		}
	}
}
