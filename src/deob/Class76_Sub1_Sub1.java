package deob;

import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;

public class Class76_Sub1_Sub1 extends Class76_Sub1 {

	public boolean aBoolean9371;

	public Class_ra_Sub1 aClass_ra_Sub1_9365;

	public Canvas aCanvas9370;

	public OpenGL anOpenGL9366;

	public long aLong9368;

	public int anInt9367;

	public int anInt9369;

	public Class76_Sub1_Sub1(Class_ra_Sub1 arg0, Canvas arg1, long arg2) {
		this.aBoolean9371 = false;
		this.aClass_ra_Sub1_9365 = arg0;
		this.aCanvas9370 = arg1;
		this.anOpenGL9366 = arg0.anOpenGL8309;
		this.aLong9368 = arg2;
		this.method887();
	}

	public boolean method863() {
		return true;
	}

	public boolean method176() {
		if (this.aBoolean9371) {
			throw new IllegalStateException();
		}
		this.anOpenGL9366.setSurface(this.aLong9368);
		this.aClass_ra_Sub1_9365.method4813();
		return true;
	}

	public int method875(int arg0, int arg1) {
		return 0;
	}

	public void method876(int arg0, int arg1) {
		if (this.aBoolean9371) {
			throw new IllegalStateException();
		}
		this.anOpenGL9366.surfaceResized(this.aLong9368);
		this.method887();
		if (this.aClass_ra_Sub1_9365.method4782((byte) 0) == this) {
			this.aClass_ra_Sub1_9365.method4866();
		}
	}

	public void method887() {
		Dimension var1 = this.aCanvas9370.getSize();
		this.anInt9367 = var1.height;
		this.anInt9369 = var1.width;
	}

	public void method183() {
		if (this.aBoolean9371) {
			throw new IllegalStateException();
		}
		this.anOpenGL9366.releaseSurface(this.aCanvas9370, this.aLong9368);
		this.aBoolean9371 = true;
	}

	public int method883(int arg0, int arg1) {
		return 0;
	}

	public boolean method862() {
		return true;
	}

	public void method180() {
		if (this.aBoolean9371) {
			throw new IllegalStateException();
		}
		this.anOpenGL9366.releaseSurface(this.aCanvas9370, this.aLong9368);
		this.aBoolean9371 = true;
	}

	public void method179() {
		if (this.aBoolean9371) {
			throw new IllegalStateException();
		}
		this.anOpenGL9366.releaseSurface(this.aCanvas9370, this.aLong9368);
		this.aBoolean9371 = true;
	}

	public int method864() {
		return this.anInt9369;
	}

	public int method858() {
		return this.anInt9369;
	}

	public int method859() {
		return this.anInt9369;
	}

	public int method861() {
		return this.anInt9367;
	}

	public int method855() {
		return this.anInt9367;
	}

	public int method860() {
		return this.anInt9367;
	}

	public Class76_Sub1_Sub1(Class_ra_Sub1 arg0, Canvas arg1) {
		this(arg0, arg1, arg0.anOpenGL8309.prepareSurface(arg1));
	}

	public boolean method182() {
		if (this.aBoolean9371) {
			throw new IllegalStateException();
		}
		this.anOpenGL9366.setSurface(this.aLong9368);
		this.aClass_ra_Sub1_9365.method4813();
		return true;
	}

	public boolean method178() {
		if (this.aBoolean9371) {
			throw new IllegalStateException();
		}
		this.anOpenGL9366.setSurface(this.aLong9368);
		this.aClass_ra_Sub1_9365.method4813();
		return true;
	}

	public int method856() {
		return this.anInt9369;
	}

	public boolean method865() {
		return true;
	}

	public void method185() {
		if (this.aBoolean9371) {
			throw new IllegalStateException();
		}
		this.anOpenGL9366.releaseSurface(this.aCanvas9370, this.aLong9368);
		this.aBoolean9371 = true;
	}

	public int method857() {
		return this.anInt9367;
	}

	public void method181() {
		if (this.aBoolean9371) {
			throw new IllegalStateException();
		}
		this.anOpenGL9366.releaseSurface(this.aCanvas9370, this.aLong9368);
		this.aBoolean9371 = true;
	}

	public boolean method174() {
		if (this.aBoolean9371) {
			throw new IllegalStateException();
		}
		this.anOpenGL9366.setSurface(this.aLong9368);
		this.aClass_ra_Sub1_9365.method4813();
		return true;
	}

	public int method877() {
		if (this.aBoolean9371) {
			throw new IllegalStateException();
		}
		this.anOpenGL9366.swapBuffers(this.aLong9368);
		return 0;
	}

	public int method878() {
		if (this.aBoolean9371) {
			throw new IllegalStateException();
		}
		this.anOpenGL9366.swapBuffers(this.aLong9368);
		return 0;
	}

	public int method879() {
		if (this.aBoolean9371) {
			throw new IllegalStateException();
		}
		this.anOpenGL9366.swapBuffers(this.aLong9368);
		return 0;
	}

	public int method880(int arg0, int arg1) {
		return 0;
	}

	public int method881(int arg0, int arg1) {
		return 0;
	}

	public int method873(int arg0, int arg1) {
		return 0;
	}

	public int method884(int arg0, int arg1) {
		return 0;
	}

	public int method874() {
		if (this.aBoolean9371) {
			throw new IllegalStateException();
		}
		this.anOpenGL9366.swapBuffers(this.aLong9368);
		return 0;
	}

	public int method885(int arg0, int arg1) {
		return 0;
	}

	public void method882(int arg0, int arg1) {
		if (this.aBoolean9371) {
			throw new IllegalStateException();
		}
		this.anOpenGL9366.surfaceResized(this.aLong9368);
		this.method887();
		if (this.aClass_ra_Sub1_9365.method4782((byte) 0) == this) {
			this.aClass_ra_Sub1_9365.method4866();
		}
	}
}
