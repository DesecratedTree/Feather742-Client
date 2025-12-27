package deob;

import jaggl.OpenGL;

public class Class330_Sub19_Sub1 extends Class330_Sub19 {

	public static float aFloat9550 = 0.25F;

	public static String aString9551 = "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n";

	public static String aString9553 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";

	public static String aString9556 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n";

	public static String aString9557 = "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";

	public static float aFloat9558 = 1.0F;

	public static int anInt9562 = 256;

	public static float aFloat9549 = 1.0F;

	public int anInt9555;

	public int anInt9563;

	public int anInt9564;

	public int anInt9565;

	public Class28 aClass28_9566;

	public Class28 aClass28_9567;

	public Class28 aClass28_9568;

	public Class28 aClass28_9569;

	public Class36_Sub1 aClass36_Sub1_9559;

	public Class36_Sub1 aClass36_Sub1_9560;

	public Class76_Sub2_Sub2 aClass76_Sub2_Sub2_9552;

	public Class76_Sub2_Sub2 aClass76_Sub2_Sub2_9554;

	public Class36_Sub1[] aClass36_Sub1Array9561;

	public Class330_Sub19_Sub1(Class_ra_Sub1 arg0) {
		super(arg0);
	}

	public void method3351(int arg0) {
		OpenGL.glUseProgram(0);
		this.aClass_ra_Sub1_7647.method4843(1);
		this.aClass_ra_Sub1_7647.method4844(null);
		this.aClass_ra_Sub1_7647.method4843(0);
	}

	public boolean method3345() {
		return this.aClass76_Sub2_Sub2_9552 != null;
	}

	public Class86 method3354() {
		return Class86.aClass86_716;
	}

	public void method3349(int arg0, int arg1) {
		this.anInt9564 = arg0;
		this.anInt9563 = arg1;
		int var3 = Class385.method4425(this.anInt9564, (short) 1619);
		int var4 = Class385.method4425(this.anInt9563, (short) 25598);
		if (this.anInt9555 == var3 && this.anInt9565 == var4) {
			return;
		}
		int var5;
		if (this.aClass36_Sub1Array9561 != null) {
			for (var5 = 0; var5 < this.aClass36_Sub1Array9561.length; var5++) {
				this.aClass36_Sub1Array9561[var5].method509();
			}
			this.aClass36_Sub1Array9561 = null;
		}
		if (var3 <= 256 && var4 <= 256) {
			this.aClass76_Sub2_Sub2_9554 = null;
		} else {
			var5 = var3;
			int var6 = var4;
			int var7 = 0;
			label59: while (true) {
				if (var5 <= 256 && var6 <= 256) {
					if (this.aClass76_Sub2_Sub2_9554 == null) {
						this.aClass76_Sub2_Sub2_9554 = new Class76_Sub2_Sub2(this.aClass_ra_Sub1_7647);
					}
					this.aClass36_Sub1Array9561 = new Class36_Sub1[var7];
					var5 = var3;
					var6 = var4;
					var7 = 0;
					while (true) {
						if (var5 <= 256 && var6 <= 256) {
							break label59;
						}
						this.aClass36_Sub1Array9561[var7++] = new Class36_Sub1(this.aClass_ra_Sub1_7647, 3553, Class72.aClass72_620, Class86.aClass86_716, var5, var6);
						if (var5 > 256) {
							var5 >>= 0x1;
						}
						if (var6 > 256) {
							var6 >>= 0x1;
						}
					}
				}
				if (var5 > 256) {
					var5 >>= 0x1;
				}
				if (var6 > 256) {
					var6 >>= 0x1;
				}
				var7++;
			}
		}
		this.anInt9555 = var3;
		this.anInt9565 = var4;
	}

	public boolean method3369() {
		return this.aClass_ra_Sub1_7647.aBoolean8429 && this.aClass_ra_Sub1_7647.aBoolean8355 && this.aClass_ra_Sub1_7647.aBoolean8389;
	}

	public Class86 method3370() {
		return Class86.aClass86_716;
	}

	public void method3363() {
		this.anInt9565 = -1;
		this.anInt9555 = -1;
		this.aClass76_Sub2_Sub2_9554 = null;
		this.aClass36_Sub1Array9561 = null;
		this.aClass76_Sub2_Sub2_9552 = null;
		this.aClass36_Sub1_9559 = null;
		this.aClass36_Sub1_9560 = null;
		this.aClass28_9569 = null;
		this.aClass28_9568 = null;
		this.aClass28_9567 = null;
		this.aClass28_9566 = null;
	}

	public void method3352(int arg0, Class36_Sub1 arg1, Class36_Sub1 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		int var4;
		int var5;
		if (this.aClass36_Sub1Array9561 == null) {
			this.aClass_ra_Sub1_7647.method4844(arg1);
			this.aClass_ra_Sub1_7647.method4785(this.aClass76_Sub2_Sub2_9552, (byte) 1);
			this.aClass76_Sub2_Sub2_9552.method918(0);
			OpenGL.glViewport(0, 0, 256, 256);
			var4 = this.aClass28_9569.anInt333;
			OpenGL.glUseProgram(var4);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var4, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var4, "params"), aFloat9549, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt9564, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt9564, (float) this.anInt9563);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt9563);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			this.aClass_ra_Sub1_7647.method4785(this.aClass76_Sub2_Sub2_9554, (byte) 1);
			var4 = Class385.method4425(this.anInt9564, (short) 4170);
			var5 = Class385.method4425(this.anInt9563, (short) 30339);
			int var6 = 0;
			while (var4 > 256 || var5 > 256) {
				OpenGL.glViewport(0, 0, var4, var5);
				this.aClass76_Sub2_Sub2_9554.method901(0, this.aClass36_Sub1Array9561[var6].method523(0));
				if (var6 == 0) {
					this.aClass_ra_Sub1_7647.method4844(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt9564, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt9564, (float) this.anInt9563);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt9563);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					this.aClass_ra_Sub1_7647.method4844(this.aClass36_Sub1Array9561[var6 - 1]);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(1.0F, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f(1.0F, 1.0F);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, 1.0F);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				}
				if (var4 > 256) {
					var4 >>= 0x1;
				}
				if (var5 > 256) {
					var5 >>= 0x1;
				}
				var6++;
			}
			this.aClass_ra_Sub1_7647.method4802(this.aClass76_Sub2_Sub2_9554, (byte) 0);
			this.aClass_ra_Sub1_7647.method4844(this.aClass36_Sub1Array9561[var6 - 1]);
			this.aClass_ra_Sub1_7647.method4785(this.aClass76_Sub2_Sub2_9552, (byte) 1);
			this.aClass76_Sub2_Sub2_9552.method918(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int var7 = this.aClass28_9568.anInt333;
			OpenGL.glUseProgram(var7);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var7, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var7, "params"), aFloat9549, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f(1.0F, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f(1.0F, 1.0F);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, 1.0F);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		this.aClass76_Sub2_Sub2_9552.method918(1);
		this.aClass_ra_Sub1_7647.method4844(this.aClass36_Sub1_9559);
		var4 = this.aClass28_9566.anInt333;
		OpenGL.glUseProgram(var4);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var4, "baseTex"), 0);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var4, "step"), 0.00390625F, 0.0F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		this.aClass76_Sub2_Sub2_9552.method918(0);
		this.aClass_ra_Sub1_7647.method4844(this.aClass36_Sub1_9560);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var4, "step"), 0.0F, 0.00390625F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		OpenGL.glPopAttrib();
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
		this.aClass_ra_Sub1_7647.method4802(this.aClass76_Sub2_Sub2_9552, (byte) 0);
		var5 = this.aClass28_9567.anInt333;
		OpenGL.glUseProgram(var5);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var5, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var5, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var5, "params"), aFloat9550, aFloat9558, 0.0F);
		this.aClass_ra_Sub1_7647.method4843(1);
		this.aClass_ra_Sub1_7647.method4844(this.aClass36_Sub1_9559);
		this.aClass_ra_Sub1_7647.method4843(0);
		this.aClass_ra_Sub1_7647.method4844(arg1);
	}

	public boolean method3360() {
		if (!this.aClass_ra_Sub1_7647.aBoolean8429 || !this.aClass_ra_Sub1_7647.aBoolean8355 || !this.aClass_ra_Sub1_7647.aBoolean8389) {
			return false;
		}
		this.aClass76_Sub2_Sub2_9552 = new Class76_Sub2_Sub2(this.aClass_ra_Sub1_7647);
		this.aClass36_Sub1_9559 = new Class36_Sub1(this.aClass_ra_Sub1_7647, 3553, Class72.aClass72_620, Class86.aClass86_716, 256, 256);
		this.aClass36_Sub1_9559.method518(false, false);
		this.aClass36_Sub1_9560 = new Class36_Sub1(this.aClass_ra_Sub1_7647, 3553, Class72.aClass72_620, Class86.aClass86_716, 256, 256);
		this.aClass36_Sub1_9560.method518(false, false);
		this.aClass_ra_Sub1_7647.method4785(this.aClass76_Sub2_Sub2_9552, (byte) 1);
		this.aClass76_Sub2_Sub2_9552.method901(0, this.aClass36_Sub1_9559.method523(0));
		this.aClass76_Sub2_Sub2_9552.method901(1, this.aClass36_Sub1_9560.method523(0));
		this.aClass76_Sub2_Sub2_9552.method918(0);
		if (!this.aClass76_Sub2_Sub2_9552.method902()) {
			this.aClass_ra_Sub1_7647.method4802(this.aClass76_Sub2_Sub2_9552, (byte) 0);
			return false;
		}
		this.aClass_ra_Sub1_7647.method4802(this.aClass76_Sub2_Sub2_9552, (byte) 0);
		this.aClass28_9569 = Class28.method496(this.aClass_ra_Sub1_7647, new Class35[] { Class35.method506(this.aClass_ra_Sub1_7647, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass28_9568 = Class28.method496(this.aClass_ra_Sub1_7647, new Class35[] { Class35.method506(this.aClass_ra_Sub1_7647, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass28_9567 = Class28.method496(this.aClass_ra_Sub1_7647, new Class35[] { Class35.method506(this.aClass_ra_Sub1_7647, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass28_9566 = Class28.method496(this.aClass_ra_Sub1_7647, new Class35[] { Class35.method506(this.aClass_ra_Sub1_7647, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass28_9568 != null && this.aClass28_9569 != null && this.aClass28_9567 != null && this.aClass28_9566 != null;
	}

	public boolean method3361() {
		return this.aClass76_Sub2_Sub2_9552 != null;
	}

	public boolean method3348() {
		return this.aClass76_Sub2_Sub2_9552 != null;
	}

	public boolean method3350() {
		return this.aClass76_Sub2_Sub2_9552 != null;
	}

	public boolean method3358() {
		if (!this.aClass_ra_Sub1_7647.aBoolean8429 || !this.aClass_ra_Sub1_7647.aBoolean8355 || !this.aClass_ra_Sub1_7647.aBoolean8389) {
			return false;
		}
		this.aClass76_Sub2_Sub2_9552 = new Class76_Sub2_Sub2(this.aClass_ra_Sub1_7647);
		this.aClass36_Sub1_9559 = new Class36_Sub1(this.aClass_ra_Sub1_7647, 3553, Class72.aClass72_620, Class86.aClass86_716, 256, 256);
		this.aClass36_Sub1_9559.method518(false, false);
		this.aClass36_Sub1_9560 = new Class36_Sub1(this.aClass_ra_Sub1_7647, 3553, Class72.aClass72_620, Class86.aClass86_716, 256, 256);
		this.aClass36_Sub1_9560.method518(false, false);
		this.aClass_ra_Sub1_7647.method4785(this.aClass76_Sub2_Sub2_9552, (byte) 1);
		this.aClass76_Sub2_Sub2_9552.method901(0, this.aClass36_Sub1_9559.method523(0));
		this.aClass76_Sub2_Sub2_9552.method901(1, this.aClass36_Sub1_9560.method523(0));
		this.aClass76_Sub2_Sub2_9552.method918(0);
		if (!this.aClass76_Sub2_Sub2_9552.method902()) {
			this.aClass_ra_Sub1_7647.method4802(this.aClass76_Sub2_Sub2_9552, (byte) 0);
			return false;
		}
		this.aClass_ra_Sub1_7647.method4802(this.aClass76_Sub2_Sub2_9552, (byte) 0);
		this.aClass28_9569 = Class28.method496(this.aClass_ra_Sub1_7647, new Class35[] { Class35.method506(this.aClass_ra_Sub1_7647, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass28_9568 = Class28.method496(this.aClass_ra_Sub1_7647, new Class35[] { Class35.method506(this.aClass_ra_Sub1_7647, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass28_9567 = Class28.method496(this.aClass_ra_Sub1_7647, new Class35[] { Class35.method506(this.aClass_ra_Sub1_7647, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass28_9566 = Class28.method496(this.aClass_ra_Sub1_7647, new Class35[] { Class35.method506(this.aClass_ra_Sub1_7647, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass28_9568 != null && this.aClass28_9569 != null && this.aClass28_9567 != null && this.aClass28_9566 != null;
	}

	public boolean method3359() {
		if (!this.aClass_ra_Sub1_7647.aBoolean8429 || !this.aClass_ra_Sub1_7647.aBoolean8355 || !this.aClass_ra_Sub1_7647.aBoolean8389) {
			return false;
		}
		this.aClass76_Sub2_Sub2_9552 = new Class76_Sub2_Sub2(this.aClass_ra_Sub1_7647);
		this.aClass36_Sub1_9559 = new Class36_Sub1(this.aClass_ra_Sub1_7647, 3553, Class72.aClass72_620, Class86.aClass86_716, 256, 256);
		this.aClass36_Sub1_9559.method518(false, false);
		this.aClass36_Sub1_9560 = new Class36_Sub1(this.aClass_ra_Sub1_7647, 3553, Class72.aClass72_620, Class86.aClass86_716, 256, 256);
		this.aClass36_Sub1_9560.method518(false, false);
		this.aClass_ra_Sub1_7647.method4785(this.aClass76_Sub2_Sub2_9552, (byte) 1);
		this.aClass76_Sub2_Sub2_9552.method901(0, this.aClass36_Sub1_9559.method523(0));
		this.aClass76_Sub2_Sub2_9552.method901(1, this.aClass36_Sub1_9560.method523(0));
		this.aClass76_Sub2_Sub2_9552.method918(0);
		if (!this.aClass76_Sub2_Sub2_9552.method902()) {
			this.aClass_ra_Sub1_7647.method4802(this.aClass76_Sub2_Sub2_9552, (byte) 0);
			return false;
		}
		this.aClass_ra_Sub1_7647.method4802(this.aClass76_Sub2_Sub2_9552, (byte) 0);
		this.aClass28_9569 = Class28.method496(this.aClass_ra_Sub1_7647, new Class35[] { Class35.method506(this.aClass_ra_Sub1_7647, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass28_9568 = Class28.method496(this.aClass_ra_Sub1_7647, new Class35[] { Class35.method506(this.aClass_ra_Sub1_7647, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass28_9567 = Class28.method496(this.aClass_ra_Sub1_7647, new Class35[] { Class35.method506(this.aClass_ra_Sub1_7647, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass28_9566 = Class28.method496(this.aClass_ra_Sub1_7647, new Class35[] { Class35.method506(this.aClass_ra_Sub1_7647, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass28_9568 != null && this.aClass28_9569 != null && this.aClass28_9567 != null && this.aClass28_9566 != null;
	}

	public void method3367(int arg0, int arg1) {
		this.anInt9564 = arg0;
		this.anInt9563 = arg1;
		int var3 = Class385.method4425(this.anInt9564, (short) 29603);
		int var4 = Class385.method4425(this.anInt9563, (short) 19473);
		if (this.anInt9555 == var3 && this.anInt9565 == var4) {
			return;
		}
		int var5;
		if (this.aClass36_Sub1Array9561 != null) {
			for (var5 = 0; var5 < this.aClass36_Sub1Array9561.length; var5++) {
				this.aClass36_Sub1Array9561[var5].method509();
			}
			this.aClass36_Sub1Array9561 = null;
		}
		if (var3 <= 256 && var4 <= 256) {
			this.aClass76_Sub2_Sub2_9554 = null;
		} else {
			var5 = var3;
			int var6 = var4;
			int var7 = 0;
			label59: while (true) {
				if (var5 <= 256 && var6 <= 256) {
					if (this.aClass76_Sub2_Sub2_9554 == null) {
						this.aClass76_Sub2_Sub2_9554 = new Class76_Sub2_Sub2(this.aClass_ra_Sub1_7647);
					}
					this.aClass36_Sub1Array9561 = new Class36_Sub1[var7];
					var5 = var3;
					var6 = var4;
					var7 = 0;
					while (true) {
						if (var5 <= 256 && var6 <= 256) {
							break label59;
						}
						this.aClass36_Sub1Array9561[var7++] = new Class36_Sub1(this.aClass_ra_Sub1_7647, 3553, Class72.aClass72_620, Class86.aClass86_716, var5, var6);
						if (var5 > 256) {
							var5 >>= 0x1;
						}
						if (var6 > 256) {
							var6 >>= 0x1;
						}
					}
				}
				if (var5 > 256) {
					var5 >>= 0x1;
				}
				if (var6 > 256) {
					var6 >>= 0x1;
				}
				var7++;
			}
		}
		this.anInt9555 = var3;
		this.anInt9565 = var4;
	}

	public void method3357() {
		this.anInt9565 = -1;
		this.anInt9555 = -1;
		this.aClass76_Sub2_Sub2_9554 = null;
		this.aClass36_Sub1Array9561 = null;
		this.aClass76_Sub2_Sub2_9552 = null;
		this.aClass36_Sub1_9559 = null;
		this.aClass36_Sub1_9560 = null;
		this.aClass28_9569 = null;
		this.aClass28_9568 = null;
		this.aClass28_9567 = null;
		this.aClass28_9566 = null;
	}

	public void method3362() {
		this.anInt9565 = -1;
		this.anInt9555 = -1;
		this.aClass76_Sub2_Sub2_9554 = null;
		this.aClass36_Sub1Array9561 = null;
		this.aClass76_Sub2_Sub2_9552 = null;
		this.aClass36_Sub1_9559 = null;
		this.aClass36_Sub1_9560 = null;
		this.aClass28_9569 = null;
		this.aClass28_9568 = null;
		this.aClass28_9567 = null;
		this.aClass28_9566 = null;
	}

	public void method3364(int arg0, int arg1) {
		this.anInt9564 = arg0;
		this.anInt9563 = arg1;
		int var3 = Class385.method4425(this.anInt9564, (short) 16953);
		int var4 = Class385.method4425(this.anInt9563, (short) 15445);
		if (this.anInt9555 == var3 && this.anInt9565 == var4) {
			return;
		}
		int var5;
		if (this.aClass36_Sub1Array9561 != null) {
			for (var5 = 0; var5 < this.aClass36_Sub1Array9561.length; var5++) {
				this.aClass36_Sub1Array9561[var5].method509();
			}
			this.aClass36_Sub1Array9561 = null;
		}
		if (var3 <= 256 && var4 <= 256) {
			this.aClass76_Sub2_Sub2_9554 = null;
		} else {
			var5 = var3;
			int var6 = var4;
			int var7 = 0;
			label59: while (true) {
				if (var5 <= 256 && var6 <= 256) {
					if (this.aClass76_Sub2_Sub2_9554 == null) {
						this.aClass76_Sub2_Sub2_9554 = new Class76_Sub2_Sub2(this.aClass_ra_Sub1_7647);
					}
					this.aClass36_Sub1Array9561 = new Class36_Sub1[var7];
					var5 = var3;
					var6 = var4;
					var7 = 0;
					while (true) {
						if (var5 <= 256 && var6 <= 256) {
							break label59;
						}
						this.aClass36_Sub1Array9561[var7++] = new Class36_Sub1(this.aClass_ra_Sub1_7647, 3553, Class72.aClass72_620, Class86.aClass86_716, var5, var6);
						if (var5 > 256) {
							var5 >>= 0x1;
						}
						if (var6 > 256) {
							var6 >>= 0x1;
						}
					}
				}
				if (var5 > 256) {
					var5 >>= 0x1;
				}
				if (var6 > 256) {
					var6 >>= 0x1;
				}
				var7++;
			}
		}
		this.anInt9555 = var3;
		this.anInt9565 = var4;
	}

	public void method3365(int arg0, Class36_Sub1 arg1, Class36_Sub1 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		int var4;
		int var5;
		if (this.aClass36_Sub1Array9561 == null) {
			this.aClass_ra_Sub1_7647.method4844(arg1);
			this.aClass_ra_Sub1_7647.method4785(this.aClass76_Sub2_Sub2_9552, (byte) 1);
			this.aClass76_Sub2_Sub2_9552.method918(0);
			OpenGL.glViewport(0, 0, 256, 256);
			var4 = this.aClass28_9569.anInt333;
			OpenGL.glUseProgram(var4);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var4, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var4, "params"), aFloat9549, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt9564, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt9564, (float) this.anInt9563);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt9563);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			this.aClass_ra_Sub1_7647.method4785(this.aClass76_Sub2_Sub2_9554, (byte) 1);
			var4 = Class385.method4425(this.anInt9564, (short) 7546);
			var5 = Class385.method4425(this.anInt9563, (short) 3084);
			int var6 = 0;
			while (var4 > 256 || var5 > 256) {
				OpenGL.glViewport(0, 0, var4, var5);
				this.aClass76_Sub2_Sub2_9554.method901(0, this.aClass36_Sub1Array9561[var6].method523(0));
				if (var6 == 0) {
					this.aClass_ra_Sub1_7647.method4844(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt9564, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt9564, (float) this.anInt9563);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt9563);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					this.aClass_ra_Sub1_7647.method4844(this.aClass36_Sub1Array9561[var6 - 1]);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(1.0F, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f(1.0F, 1.0F);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, 1.0F);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				}
				if (var4 > 256) {
					var4 >>= 0x1;
				}
				if (var5 > 256) {
					var5 >>= 0x1;
				}
				var6++;
			}
			this.aClass_ra_Sub1_7647.method4802(this.aClass76_Sub2_Sub2_9554, (byte) 0);
			this.aClass_ra_Sub1_7647.method4844(this.aClass36_Sub1Array9561[var6 - 1]);
			this.aClass_ra_Sub1_7647.method4785(this.aClass76_Sub2_Sub2_9552, (byte) 1);
			this.aClass76_Sub2_Sub2_9552.method918(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int var7 = this.aClass28_9568.anInt333;
			OpenGL.glUseProgram(var7);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var7, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var7, "params"), aFloat9549, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f(1.0F, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f(1.0F, 1.0F);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, 1.0F);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		this.aClass76_Sub2_Sub2_9552.method918(1);
		this.aClass_ra_Sub1_7647.method4844(this.aClass36_Sub1_9559);
		var4 = this.aClass28_9566.anInt333;
		OpenGL.glUseProgram(var4);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var4, "baseTex"), 0);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var4, "step"), 0.00390625F, 0.0F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		this.aClass76_Sub2_Sub2_9552.method918(0);
		this.aClass_ra_Sub1_7647.method4844(this.aClass36_Sub1_9560);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var4, "step"), 0.0F, 0.00390625F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		OpenGL.glPopAttrib();
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
		this.aClass_ra_Sub1_7647.method4802(this.aClass76_Sub2_Sub2_9552, (byte) 0);
		var5 = this.aClass28_9567.anInt333;
		OpenGL.glUseProgram(var5);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var5, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var5, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var5, "params"), aFloat9550, aFloat9558, 0.0F);
		this.aClass_ra_Sub1_7647.method4843(1);
		this.aClass_ra_Sub1_7647.method4844(this.aClass36_Sub1_9559);
		this.aClass_ra_Sub1_7647.method4843(0);
		this.aClass_ra_Sub1_7647.method4844(arg1);
	}

	public Class86 method3371() {
		return Class86.aClass86_716;
	}

	public void method3368(int arg0) {
		OpenGL.glUseProgram(0);
		this.aClass_ra_Sub1_7647.method4843(1);
		this.aClass_ra_Sub1_7647.method4844(null);
		this.aClass_ra_Sub1_7647.method4843(0);
	}

	public Class86 method3372() {
		return Class86.aClass86_716;
	}

	public boolean method3347() {
		if (!this.aClass_ra_Sub1_7647.aBoolean8429 || !this.aClass_ra_Sub1_7647.aBoolean8355 || !this.aClass_ra_Sub1_7647.aBoolean8389) {
			return false;
		}
		this.aClass76_Sub2_Sub2_9552 = new Class76_Sub2_Sub2(this.aClass_ra_Sub1_7647);
		this.aClass36_Sub1_9559 = new Class36_Sub1(this.aClass_ra_Sub1_7647, 3553, Class72.aClass72_620, Class86.aClass86_716, 256, 256);
		this.aClass36_Sub1_9559.method518(false, false);
		this.aClass36_Sub1_9560 = new Class36_Sub1(this.aClass_ra_Sub1_7647, 3553, Class72.aClass72_620, Class86.aClass86_716, 256, 256);
		this.aClass36_Sub1_9560.method518(false, false);
		this.aClass_ra_Sub1_7647.method4785(this.aClass76_Sub2_Sub2_9552, (byte) 1);
		this.aClass76_Sub2_Sub2_9552.method901(0, this.aClass36_Sub1_9559.method523(0));
		this.aClass76_Sub2_Sub2_9552.method901(1, this.aClass36_Sub1_9560.method523(0));
		this.aClass76_Sub2_Sub2_9552.method918(0);
		if (!this.aClass76_Sub2_Sub2_9552.method902()) {
			this.aClass_ra_Sub1_7647.method4802(this.aClass76_Sub2_Sub2_9552, (byte) 0);
			return false;
		}
		this.aClass_ra_Sub1_7647.method4802(this.aClass76_Sub2_Sub2_9552, (byte) 0);
		this.aClass28_9569 = Class28.method496(this.aClass_ra_Sub1_7647, new Class35[] { Class35.method506(this.aClass_ra_Sub1_7647, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass28_9568 = Class28.method496(this.aClass_ra_Sub1_7647, new Class35[] { Class35.method506(this.aClass_ra_Sub1_7647, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass28_9567 = Class28.method496(this.aClass_ra_Sub1_7647, new Class35[] { Class35.method506(this.aClass_ra_Sub1_7647, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass28_9566 = Class28.method496(this.aClass_ra_Sub1_7647, new Class35[] { Class35.method506(this.aClass_ra_Sub1_7647, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass28_9568 != null && this.aClass28_9569 != null && this.aClass28_9567 != null && this.aClass28_9566 != null;
	}

	public void method3346(int arg0) {
		OpenGL.glUseProgram(0);
		this.aClass_ra_Sub1_7647.method4843(1);
		this.aClass_ra_Sub1_7647.method4844(null);
		this.aClass_ra_Sub1_7647.method4843(0);
	}

	public void method3366(int arg0) {
		OpenGL.glUseProgram(0);
		this.aClass_ra_Sub1_7647.method4843(1);
		this.aClass_ra_Sub1_7647.method4844(null);
		this.aClass_ra_Sub1_7647.method4843(0);
	}
}
