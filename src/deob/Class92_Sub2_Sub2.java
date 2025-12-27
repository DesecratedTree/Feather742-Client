package deob;

import jaggl.OpenGL;

public class Class92_Sub2_Sub2 extends Class92_Sub2 {

	public static int[] anIntArray9422 = new int[4];

	public Class_ra_Sub1 aClass_ra_Sub1_9424;

	public Class36_Sub3 aClass36_Sub3_9423;

	public int method1083() {
		return this.aClass36_Sub3_9423.anInt7030;
	}

	public Class36_Sub3 method1079() {
		return this.aClass36_Sub3_9423;
	}

	public boolean method1084(Class36_Sub3 arg0, Class36_Sub3 arg1, float arg2) {
		boolean var4 = true;
		Class76_Sub2_Sub2 var5 = this.aClass_ra_Sub1_9424.aClass76_Sub2_Sub2_8434;
		this.aClass_ra_Sub1_9424.qa(anIntArray9422);
		this.aClass_ra_Sub1_9424.L();
		this.aClass_ra_Sub1_9424.method4874();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass36_Sub3_9423.anInt7030, this.aClass36_Sub3_9423.anInt7030);
		this.aClass_ra_Sub1_9424.method4853(false);
		this.aClass_ra_Sub1_9424.method4854(false);
		this.aClass_ra_Sub1_9424.method4816(false);
		this.aClass_ra_Sub1_9424.method4815(false);
		this.aClass_ra_Sub1_9424.method4841(-2);
		this.aClass_ra_Sub1_9424.method4843(1);
		this.aClass_ra_Sub1_9424.method4850(0.0F, 0.0F, 0.0F, arg2);
		this.aClass_ra_Sub1_9424.method4831(34165, 34165);
		this.aClass_ra_Sub1_9424.method4844(arg1);
		this.aClass_ra_Sub1_9424.method4843(0);
		this.aClass_ra_Sub1_9424.method4836(1);
		this.aClass_ra_Sub1_9424.method4844(arg0);
		this.aClass_ra_Sub1_9424.method4785(var5, (byte) 1);
		for (int var6 = 0; var6 < 6; var6++) {
			int var7 = var6 + 34069;
			var5.method901(0, this.aClass36_Sub3_9423.method532(var7, 0));
			var5.method918(0);
			if (!var5.method902()) {
				var4 = false;
				break;
			}
			OpenGL.glBegin(7);
			switch(var7) {
				case 34069:
					OpenGL.glTexCoord3i(65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34070:
					OpenGL.glTexCoord3i(-65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34071:
					OpenGL.glTexCoord3i(-65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34072:
					OpenGL.glTexCoord3i(-65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34073:
					OpenGL.glTexCoord3i(-65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34074:
					OpenGL.glTexCoord3i(65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
			}
			OpenGL.glEnd();
		}
		var5.method901(0, null);
		this.aClass_ra_Sub1_9424.method4802(var5, (byte) 0);
		this.aClass_ra_Sub1_9424.method4843(1);
		this.aClass_ra_Sub1_9424.method4844(null);
		this.aClass_ra_Sub1_9424.method4831(8448, 8448);
		this.aClass_ra_Sub1_9424.method4843(0);
		this.aClass_ra_Sub1_9424.method4844(null);
		OpenGL.glPopAttrib();
		this.aClass_ra_Sub1_9424.r(anIntArray9422[0], anIntArray9422[1], anIntArray9422[2], anIntArray9422[3]);
		if (var4 && !this.aClass_ra_Sub1_9424.aBoolean8403) {
			this.aClass36_Sub3_9423.method516();
		}
		return var4;
	}

	public Class36_Sub3 method1078() {
		return this.aClass36_Sub3_9423;
	}

	public Class36_Sub3 method1080() {
		return this.aClass36_Sub3_9423;
	}

	public Class92_Sub2_Sub2(Class_ra_Sub1 arg0, int arg1) {
		this.aClass_ra_Sub1_9424 = arg0;
		this.aClass36_Sub3_9423 = new Class36_Sub3(arg0, Class72.aClass72_620, Class86.aClass86_714, arg1);
	}

	public Class36_Sub3 method1081() {
		return this.aClass36_Sub3_9423;
	}

	public Class36_Sub3 method1082() {
		return this.aClass36_Sub3_9423;
	}
}
