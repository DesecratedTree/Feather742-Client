package deob;

import jaggl.OpenGL;

public class Class59 {

	public static String aString551 = "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n";

	public Class_ra_Sub1 aClass_ra_Sub1_552;

	public Class28 aClass28_553;

	public Class59(Class_ra_Sub1 arg0) {
		this.aClass_ra_Sub1_552 = arg0;
	}

	public boolean method669(Class36_Sub2 arg0, Class36_Sub2 arg1, float arg2) {
		if (!this.method670()) {
			return false;
		}
		Class76_Sub2_Sub2 var4 = this.aClass_ra_Sub1_552.aClass76_Sub2_Sub2_8434;
		Class330_Sub36_Sub17 var5 = new Class330_Sub36_Sub17(this.aClass_ra_Sub1_552, Class72.aClass72_620, Class86.aClass86_714, arg0.anInt7022, arg0.anInt7021);
		boolean var6 = false;
		this.aClass_ra_Sub1_552.method4785(var4, (byte) 1);
		var4.method901(0, var5);
		if (var4.method902()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt7022, arg0.anInt7021);
			OpenGL.glUseProgram(this.aClass28_553.anInt333);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(this.aClass28_553.anInt333, "heightMap"), 0);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(this.aClass28_553.anInt333, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(this.aClass28_553.anInt333, "sampleSize"), 1.0F / (float) arg1.anInt7022, 1.0F / (float) arg1.anInt7021);
			for (int var7 = 0; var7 < arg0.anInt7023; var7++) {
				float var8 = (float) var7 / (float) arg0.anInt7023;
				this.aClass_ra_Sub1_552.method4844(arg1);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, var8);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, var8);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, var8);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, var8);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg0.method531(0, 0, var7, arg0.anInt7022, arg0.anInt7021, 0, 0);
			}
			OpenGL.glUseProgram(0);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			var6 = true;
		}
		var4.method901(0, null);
		this.aClass_ra_Sub1_552.method4802(var4, (byte) 0);
		return var6;
	}

	public boolean method670() {
		if (this.aClass_ra_Sub1_552.aBoolean8429 && this.aClass_ra_Sub1_552.aBoolean8355 && this.aClass28_553 == null) {
			Class35 var1 = Class35.method506(this.aClass_ra_Sub1_552, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (var1 != null) {
				this.aClass28_553 = Class28.method496(this.aClass_ra_Sub1_552, new Class35[] { var1 });
			}
		}
		return this.aClass28_553 != null;
	}
}
