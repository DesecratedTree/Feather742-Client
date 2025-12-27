package deob;

import java.lang.ref.SoftReference;

public class Class330_Sub36_Sub7_Sub2 extends Class330_Sub36_Sub7 {

	public SoftReference aSoftReference10137;

	public boolean method3470() {
		return true;
	}

	public Class330_Sub36_Sub7_Sub2(Interface22 arg0, Object arg1, int arg2) {
		super(arg0, arg2);
		this.aSoftReference10137 = new SoftReference(arg1);
	}

	public boolean method3467() {
		return true;
	}

	public Object method3469() {
		return this.aSoftReference10137.get();
	}

	public Object method3468() {
		return this.aSoftReference10137.get();
	}

	public boolean method3471() {
		return true;
	}
}
