package deob;

import java.lang.ref.SoftReference;

public class Class330_Sub36_Sub14_Sub1 extends Class330_Sub36_Sub14 {

	public SoftReference aSoftReference10139;

	public static Thread aThread10138;

	public Object method3491() {
		return this.aSoftReference10139.get();
	}

	public Object method3489(int arg0) {
		try {
			return this.aSoftReference10139.get();
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ald.r(" + ')');
		}
	}

	public boolean method3490(int arg0) {
		try {
			return true;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ald.j(" + ')');
		}
	}

	public boolean method3492() {
		return true;
	}

	public boolean method3488() {
		return true;
	}

	public Class330_Sub36_Sub14_Sub1(Object arg0, int arg1) {
		super(arg1);
		this.aSoftReference10139 = new SoftReference(arg0);
	}
}
