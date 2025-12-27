package deob;

import jaggl.OpenGL;

public abstract class Class46 {

	public static int anInt449 = 1;

	public static int anInt451 = 34962;

	public static int[] anIntArray457 = new int[1];

	public boolean aBoolean450 = false;

	public Class_ra_Sub1 aClass_ra_Sub1_452;

	public int anInt456;

	public int anInt454;

	public boolean aBoolean455;

	public int anInt453;

	public Class46(Class_ra_Sub1 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
		this.aClass_ra_Sub1_452 = arg0;
		this.anInt456 = arg1;
		this.anInt454 = arg3;
		this.aBoolean455 = arg4;
		OpenGL.glGenBuffersARB(1, anIntArray457, 0);
		this.anInt453 = anIntArray457[0];
		this.method593();
		OpenGL.glBufferDataARBub(arg1, this.anInt454, arg2, 0, this.aBoolean455 ? 35040 : 35044);
		this.aClass_ra_Sub1_452.anInt8311 += this.anInt454;
	}

	public Class46(Class_ra_Sub1 arg0, int arg1, jaclib.memory.Buffer arg2, int arg3, boolean arg4) {
		this.aClass_ra_Sub1_452 = arg0;
		this.anInt456 = arg1;
		this.anInt454 = arg3;
		this.aBoolean455 = arg4;
		OpenGL.glGenBuffersARB(1, anIntArray457, 0);
		this.anInt453 = anIntArray457[0];
		this.method593();
		OpenGL.glBufferDataARBa(arg1, this.anInt454, arg2.j(), this.aBoolean455 ? 35040 : 35044);
		this.aClass_ra_Sub1_452.anInt8311 += this.anInt454;
	}

	public void method594(byte[] arg0, int arg1) {
		this.method593();
		if (arg1 > this.anInt454) {
			OpenGL.glBufferDataARBub(this.anInt456, arg1, arg0, 0, this.aBoolean455 ? 35040 : 35044);
			this.aClass_ra_Sub1_452.anInt8311 += arg1 - this.anInt454;
			this.anInt454 = arg1;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt456, 0, arg1, arg0, 0);
		}
	}

	public abstract void method592();

	public abstract void method593();

	public abstract void method595();
}
