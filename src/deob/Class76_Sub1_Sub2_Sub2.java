package deob;

import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;

public class Class76_Sub1_Sub2_Sub2 extends Class76_Sub1_Sub2 {

	public Canvas aCanvas10097;

	public OpenGL anOpenGL10098;

	public long aLong10099;

	public int anInt10100;

	public int anInt10101;

	public void method876(int arg0, int arg1) {
		this.anOpenGL10098.surfaceResized(this.aLong10099);
		this.method889();
		super.method876(arg0, arg1);
	}

	public Class76_Sub1_Sub2_Sub2(Class_ra_Sub2_Sub1 arg0, Canvas arg1, long arg2) {
		super(arg0);
		this.aCanvas10097 = arg1;
		this.anOpenGL10098 = arg0.anOpenGL9881;
		this.aLong10099 = arg2;
		this.method889();
	}

	public int method873(int arg0, int arg1) {
		return 0;
	}

	public int method857() {
		return this.anInt10101;
	}

	public int method880(int arg0, int arg1) {
		return 0;
	}

	public int method861() {
		return this.anInt10101;
	}

	public int method874() {
		this.anOpenGL10098.swapBuffers(this.aLong10099);
		return 0;
	}

	public int method883(int arg0, int arg1) {
		return 0;
	}

	public boolean method174() {
		return this.anOpenGL10098.setSurface(this.aLong10099) && super.method174();
	}

	public int method856() {
		return this.anInt10100;
	}

	public void method179() {
		this.anOpenGL10098.releaseSurface(this.aCanvas10097, this.aLong10099);
	}

	public int method864() {
		return this.anInt10100;
	}

	public void method889() {
		Dimension var1 = this.aCanvas10097.getSize();
		this.anInt10101 = var1.height;
		this.anInt10100 = var1.width;
	}

	public int method859() {
		return this.anInt10100;
	}

	public int method860() {
		return this.anInt10101;
	}

	public int method855() {
		return this.anInt10101;
	}

	public int method884(int arg0, int arg1) {
		return 0;
	}

	public boolean method176() {
		return this.anOpenGL10098.setSurface(this.aLong10099) && super.method174();
	}

	public boolean method182() {
		return this.anOpenGL10098.setSurface(this.aLong10099) && super.method174();
	}

	public int method875(int arg0, int arg1) {
		return 0;
	}

	public boolean method863() {
		return true;
	}

	public int method881(int arg0, int arg1) {
		return 0;
	}

	public void method185() {
		this.anOpenGL10098.releaseSurface(this.aCanvas10097, this.aLong10099);
	}

	public void method180() {
		this.anOpenGL10098.releaseSurface(this.aCanvas10097, this.aLong10099);
	}

	public Class76_Sub1_Sub2_Sub2(Class_ra_Sub2_Sub1 arg0, Canvas arg1) {
		this(arg0, arg1, arg0.anOpenGL9881.prepareSurface(arg1));
	}

	public void method183() {
		this.anOpenGL10098.releaseSurface(this.aCanvas10097, this.aLong10099);
	}

	public int method877() {
		this.anOpenGL10098.swapBuffers(this.aLong10099);
		return 0;
	}

	public int method878() {
		this.anOpenGL10098.swapBuffers(this.aLong10099);
		return 0;
	}

	public int method879() {
		this.anOpenGL10098.swapBuffers(this.aLong10099);
		return 0;
	}

	public boolean method178() {
		return this.anOpenGL10098.setSurface(this.aLong10099) && super.method174();
	}

	public void method181() {
		this.anOpenGL10098.releaseSurface(this.aCanvas10097, this.aLong10099);
	}

	public void method882(int arg0, int arg1) {
		this.anOpenGL10098.surfaceResized(this.aLong10099);
		this.method889();
		super.method876(arg0, arg1);
	}

	public boolean method862() {
		return true;
	}

	public int method858() {
		return this.anInt10100;
	}

	public int method885(int arg0, int arg1) {
		return 0;
	}

	public boolean method865() {
		return true;
	}
}
