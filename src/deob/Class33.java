package deob;

import jaggl.OpenGL;

public class Class33 {

	public int anInt359;

	public void method502() {
		OpenGL.glEndList();
	}

	public void method503(char arg0) {
		OpenGL.glCallList(this.anInt359 + arg0);
	}

	public void method504(int arg0) {
		OpenGL.glNewList(this.anInt359 + arg0, 4864);
	}

	public Class33(Class_ra_Sub1 arg0, int arg1) {
		this.anInt359 = OpenGL.glGenLists(arg1);
	}
}
