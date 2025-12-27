package deob;

import jaggl.OpenGL;

public class Class330_Sub15_Sub1_Sub1 extends Class330_Sub15_Sub1 {

	public int[] anIntArray10129 = null;

	public Class105_Sub2 aClass105_Sub2_10130;

	public Class330_Sub15_Sub1_Sub1(Class105_Sub2 arg0, Class104 arg1) {
		super(arg1);
		this.aClass105_Sub2_10130 = arg0;
	}

	public final int method3333() {
		return this.anIntArray10129[this.aClass105_Sub2_10130.method1260((short) 11701)];
	}

	public boolean method3329(int arg0) {
		if (this.anIntArray10129 == null) {
			this.anIntArray10129 = new int[this.aClass105_Sub2_10130.method1255((byte) -96)];
		}
		Class123_Sub2 var2 = (Class123_Sub2) this.aClass105_Sub2_10130.method1256(arg0, 1454171623);
		this.anIntArray10129[arg0] = OpenGL.glGetUniformLocation(var2.anInt8906, this.method3324((byte) 22));
		return this.anIntArray10129[arg0] != -1;
	}

	public final int method3328(int arg0) {
		return this.anIntArray10129[arg0];
	}

	public boolean method3322(int arg0) {
		if (this.anIntArray10129 == null) {
			this.anIntArray10129 = new int[this.aClass105_Sub2_10130.method1255((byte) 62)];
		}
		Class123_Sub2 var2 = (Class123_Sub2) this.aClass105_Sub2_10130.method1256(arg0, 221882929);
		this.anIntArray10129[arg0] = OpenGL.glGetUniformLocation(var2.anInt8906, this.method3324((byte) -60));
		return this.anIntArray10129[arg0] != -1;
	}

	public final int method3327(int arg0) {
		return this.anIntArray10129[arg0];
	}

	public final int method3331(int arg0) {
		return this.anIntArray10129[arg0];
	}

	public final int method3330(int arg0) {
		return this.anIntArray10129[arg0];
	}
}
