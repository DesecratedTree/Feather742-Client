package deob;

import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

public abstract class Class266 implements Interface9 {

	public static int anInt6489 = 34962;

	public static int[] anIntArray6495 = new int[1];

	public static int anInt6498 = 1;

	public int anInt6490 = -1;

	public Class_ra_Sub2_Sub1 aClass_ra_Sub2_Sub1_6491;

	public int anInt6492;

	public boolean aBoolean6493;

	public int anInt6494;

	public int anInt6496;

	public NativeHeapBuffer aNativeHeapBuffer6497;

	public Class266(Class_ra_Sub2_Sub1 arg0, int arg1, boolean arg2) {
		this.aClass_ra_Sub2_Sub1_6491 = arg0;
		this.anInt6492 = arg1;
		this.aBoolean6493 = arg2;
	}

	public void method2645() {
		if (this.anInt6490 >= 0) {
			return;
		}
		if (this.aClass_ra_Sub2_Sub1_6491.aBoolean9879) {
			OpenGL.glGenBuffersARB(1, anIntArray6495, 0);
			this.anInt6490 = anIntArray6495[0];
			OpenGL.glBindBufferARB(this.anInt6492, this.anInt6490);
		} else {
			this.anInt6490 = 0;
		}
	}

	public long method2646() {
		return this.anInt6490 == 0 ? this.aNativeHeapBuffer6497.j() : 0L;
	}

	public boolean method98(int arg0, int arg1, long arg2) {
		this.method2645();
		if (this.anInt6490 > 0) {
			OpenGL.glBindBufferARB(this.anInt6492, this.anInt6490);
			OpenGL.glBufferSubDataARBa(this.anInt6492, arg0, arg1, arg2);
		} else {
			this.aNativeHeapBuffer6497.j.copy(this.aNativeHeapBuffer6497.j() + (long) arg0, arg2, arg1);
		}
		return true;
	}

	public void method148(int arg0) {
		if (arg0 > this.anInt6496) {
			this.method2645();
			if (this.anInt6490 > 0) {
				OpenGL.glBindBufferARB(this.anInt6492, this.anInt6490);
				OpenGL.glBufferDataARBub(this.anInt6492, arg0, null, 0, this.aBoolean6493 ? 35040 : 35044);
				this.aClass_ra_Sub2_Sub1_6491.anInt8466 += arg0 - this.anInt6496;
			} else {
				this.aNativeHeapBuffer6497 = this.aClass_ra_Sub2_Sub1_6491.method4908(arg0, false);
			}
			this.anInt6496 = arg0;
		}
		this.anInt6494 = arg0;
	}

	public long method94(int arg0, int arg1) {
		OpenGL.glBindBufferARB(this.anInt6492, this.anInt6490);
		return OpenGL.glMapBufferARB(this.anInt6492, 35001) + (long) arg0;
	}

	public int method93() {
		return this.anInt6494;
	}

	public boolean method97(int arg0, int arg1, long arg2) {
		this.method2645();
		if (this.anInt6490 > 0) {
			OpenGL.glBindBufferARB(this.anInt6492, this.anInt6490);
			OpenGL.glBufferSubDataARBa(this.anInt6492, arg0, arg1, arg2);
		} else {
			this.aNativeHeapBuffer6497.j.copy(this.aNativeHeapBuffer6497.j() + (long) arg0, arg2, arg1);
		}
		return true;
	}

	public void method53() {
		if (this.anInt6490 > 0) {
			this.aClass_ra_Sub2_Sub1_6491.method5154(this.anInt6490, this.anInt6494);
			this.anInt6490 = -1;
		}
	}

	public void method103() {
		OpenGL.glUnmapBufferARB(this.anInt6492);
	}

	public int method100() {
		return this.anInt6494;
	}

	public int method96() {
		return this.anInt6494;
	}

	public void method2647() {
		if (this.aClass_ra_Sub2_Sub1_6491.aBoolean9879) {
			OpenGL.glBindBufferARB(this.anInt6492, this.anInt6490);
		}
	}

	public void method95() {
		OpenGL.glUnmapBufferARB(this.anInt6492);
	}

	public boolean method99(int arg0, int arg1, long arg2) {
		this.method2645();
		if (this.anInt6490 > 0) {
			OpenGL.glBindBufferARB(this.anInt6492, this.anInt6490);
			OpenGL.glBufferSubDataARBa(this.anInt6492, arg0, arg1, arg2);
		} else {
			this.aNativeHeapBuffer6497.j.copy(this.aNativeHeapBuffer6497.j() + (long) arg0, arg2, arg1);
		}
		return true;
	}

	public long method101(int arg0, int arg1) {
		OpenGL.glBindBufferARB(this.anInt6492, this.anInt6490);
		return OpenGL.glMapBufferARB(this.anInt6492, 35001) + (long) arg0;
	}

	public long method102(int arg0, int arg1) {
		OpenGL.glBindBufferARB(this.anInt6492, this.anInt6490);
		return OpenGL.glMapBufferARB(this.anInt6492, 35001) + (long) arg0;
	}

	public long method92(int arg0, int arg1) {
		OpenGL.glBindBufferARB(this.anInt6492, this.anInt6490);
		return OpenGL.glMapBufferARB(this.anInt6492, 35001) + (long) arg0;
	}
}
