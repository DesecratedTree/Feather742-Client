package deob;

import jaggl.OpenGL;

public class Class49_Sub6 extends Class49 {

	public boolean aBoolean7071 = false;

	public boolean aBoolean7075 = false;

	public Class47 aClass47_7072;

	public Class28 aClass28_7073;

	public static String aString7074 = "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";

	public static String aString7076 = "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";

	public Class49_Sub6(Class_ra_Sub1 arg0, Class47 arg1) {
		super(arg0);
		this.aClass47_7072 = arg1;
		if (this.aClass47_7072.aClass36_Sub2_459 != null && this.aClass_ra_Sub1_478.aBoolean8426 && this.aClass_ra_Sub1_478.aBoolean8355) {
			Class35 var3 = Class35.method506(this.aClass_ra_Sub1_478, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			Class35 var4 = Class35.method506(this.aClass_ra_Sub1_478, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass28_7073 = Class28.method496(this.aClass_ra_Sub1_478, new Class35[] { var3, var4 });
			this.aBoolean7075 = this.aClass28_7073 != null;
		}
	}

	public boolean method601() {
		return this.aBoolean7075;
	}

	public void method612(boolean arg0) {
	}

	public void method602(boolean arg0) {
		Class36_Sub3 var2 = this.aClass_ra_Sub1_478.method4832();
		if (!this.aBoolean7075 || var2 == null) {
			return;
		}
		float var3 = (1.0F - Math.abs(this.aClass_ra_Sub1_478.aFloatArray8366[1])) * 2.0F + 1.0F;
		this.aClass_ra_Sub1_478.method4843(1);
		this.aClass_ra_Sub1_478.method4844(var2);
		this.aClass_ra_Sub1_478.method4843(0);
		this.aClass_ra_Sub1_478.method4844(this.aClass47_7072.aClass36_Sub2_459);
		int var4 = this.aClass28_7073.anInt333;
		OpenGL.glUseProgram(var4);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var4, "normalSampler"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var4, "envMapSampler"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var4, "sunDir"), -this.aClass_ra_Sub1_478.aFloatArray8366[0], -this.aClass_ra_Sub1_478.aFloatArray8366[1], -this.aClass_ra_Sub1_478.aFloatArray8366[2]);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(var4, "sunColour"), this.aClass_ra_Sub1_478.aFloat8250 * var3, this.aClass_ra_Sub1_478.aFloat8370 * var3, this.aClass_ra_Sub1_478.aFloat8371 * var3, 1.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var4, "sunExponent"), Math.abs(this.aClass_ra_Sub1_478.aFloatArray8366[1]) * 928.0F + 64.0F);
		this.aBoolean7071 = true;
	}

	public void method608(boolean arg0) {
	}

	public void method604() {
		if (!this.aBoolean7071) {
			return;
		}
		this.aClass_ra_Sub1_478.method4843(1);
		this.aClass_ra_Sub1_478.method4844(null);
		this.aClass_ra_Sub1_478.method4843(0);
		this.aClass_ra_Sub1_478.method4844(null);
		OpenGL.glUseProgram(0);
		this.aBoolean7071 = false;
	}

	public void method613() {
		if (!this.aBoolean7071) {
			return;
		}
		this.aClass_ra_Sub1_478.method4843(1);
		this.aClass_ra_Sub1_478.method4844(null);
		this.aClass_ra_Sub1_478.method4843(0);
		this.aClass_ra_Sub1_478.method4844(null);
		OpenGL.glUseProgram(0);
		this.aBoolean7071 = false;
	}

	public void method600(Class36 arg0, int arg1) {
		if (!this.aBoolean7071) {
			this.aClass_ra_Sub1_478.method4844(arg0);
			this.aClass_ra_Sub1_478.method4836(arg1);
		}
	}

	public void method614() {
		if (!this.aBoolean7071) {
			return;
		}
		this.aClass_ra_Sub1_478.method4843(1);
		this.aClass_ra_Sub1_478.method4844(null);
		this.aClass_ra_Sub1_478.method4843(0);
		this.aClass_ra_Sub1_478.method4844(null);
		OpenGL.glUseProgram(0);
		this.aBoolean7071 = false;
	}

	public void method620(int arg0, int arg1) {
		if (!this.aBoolean7071) {
			return;
		}
		int var3 = 0x1 << (arg0 & 0x3);
		float var4 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		int var5 = arg1 & 0xFFFF;
		float var6 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		float var7 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		float var8 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		int var9 = arg1 >> 27 & 0xF;
		int var10 = this.aClass28_7073.anInt333;
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "time"), (float) (var3 * this.aClass_ra_Sub1_478.anInt8304 % 40000) / 40000.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "scale"), var4);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "breakWaterDepth"), (float) var5);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "breakWaterOffset"), var6);
		OpenGL.glUniform2f(OpenGL.glGetUniformLocation(var10, "waveIntensity"), var8, var7);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "waveExponent"), (float) var9);
	}

	public void method609(boolean arg0) {
		Class36_Sub3 var2 = this.aClass_ra_Sub1_478.method4832();
		if (!this.aBoolean7075 || var2 == null) {
			return;
		}
		float var3 = (1.0F - Math.abs(this.aClass_ra_Sub1_478.aFloatArray8366[1])) * 2.0F + 1.0F;
		this.aClass_ra_Sub1_478.method4843(1);
		this.aClass_ra_Sub1_478.method4844(var2);
		this.aClass_ra_Sub1_478.method4843(0);
		this.aClass_ra_Sub1_478.method4844(this.aClass47_7072.aClass36_Sub2_459);
		int var4 = this.aClass28_7073.anInt333;
		OpenGL.glUseProgram(var4);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var4, "normalSampler"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var4, "envMapSampler"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var4, "sunDir"), -this.aClass_ra_Sub1_478.aFloatArray8366[0], -this.aClass_ra_Sub1_478.aFloatArray8366[1], -this.aClass_ra_Sub1_478.aFloatArray8366[2]);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(var4, "sunColour"), this.aClass_ra_Sub1_478.aFloat8250 * var3, this.aClass_ra_Sub1_478.aFloat8370 * var3, this.aClass_ra_Sub1_478.aFloat8371 * var3, 1.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var4, "sunExponent"), Math.abs(this.aClass_ra_Sub1_478.aFloatArray8366[1]) * 928.0F + 64.0F);
		this.aBoolean7071 = true;
	}

	public boolean method611() {
		return this.aBoolean7075;
	}

	public boolean method605() {
		return this.aBoolean7075;
	}

	public void method606(int arg0, int arg1) {
		if (!this.aBoolean7071) {
			return;
		}
		int var3 = 0x1 << (arg0 & 0x3);
		float var4 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		int var5 = arg1 & 0xFFFF;
		float var6 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		float var7 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		float var8 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		int var9 = arg1 >> 27 & 0xF;
		int var10 = this.aClass28_7073.anInt333;
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "time"), (float) (var3 * this.aClass_ra_Sub1_478.anInt8304 % 40000) / 40000.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "scale"), var4);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "breakWaterDepth"), (float) var5);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "breakWaterOffset"), var6);
		OpenGL.glUniform2f(OpenGL.glGetUniformLocation(var10, "waveIntensity"), var8, var7);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "waveExponent"), (float) var9);
	}

	public void method610(boolean arg0) {
	}

	public void method619(int arg0, int arg1) {
		if (!this.aBoolean7071) {
			return;
		}
		int var3 = 0x1 << (arg0 & 0x3);
		float var4 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		int var5 = arg1 & 0xFFFF;
		float var6 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		float var7 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		float var8 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		int var9 = arg1 >> 27 & 0xF;
		int var10 = this.aClass28_7073.anInt333;
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "time"), (float) (var3 * this.aClass_ra_Sub1_478.anInt8304 % 40000) / 40000.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "scale"), var4);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "breakWaterDepth"), (float) var5);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "breakWaterOffset"), var6);
		OpenGL.glUniform2f(OpenGL.glGetUniformLocation(var10, "waveIntensity"), var8, var7);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "waveExponent"), (float) var9);
	}

	public void method603() {
		if (!this.aBoolean7071) {
			return;
		}
		this.aClass_ra_Sub1_478.method4843(1);
		this.aClass_ra_Sub1_478.method4844(null);
		this.aClass_ra_Sub1_478.method4843(0);
		this.aClass_ra_Sub1_478.method4844(null);
		OpenGL.glUseProgram(0);
		this.aBoolean7071 = false;
	}

	public void method615(Class36 arg0, int arg1) {
		if (!this.aBoolean7071) {
			this.aClass_ra_Sub1_478.method4844(arg0);
			this.aClass_ra_Sub1_478.method4836(arg1);
		}
	}

	public void method616(Class36 arg0, int arg1) {
		if (!this.aBoolean7071) {
			this.aClass_ra_Sub1_478.method4844(arg0);
			this.aClass_ra_Sub1_478.method4836(arg1);
		}
	}

	public void method617(int arg0, int arg1) {
		if (!this.aBoolean7071) {
			return;
		}
		int var3 = 0x1 << (arg0 & 0x3);
		float var4 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		int var5 = arg1 & 0xFFFF;
		float var6 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		float var7 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		float var8 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		int var9 = arg1 >> 27 & 0xF;
		int var10 = this.aClass28_7073.anInt333;
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "time"), (float) (var3 * this.aClass_ra_Sub1_478.anInt8304 % 40000) / 40000.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "scale"), var4);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "breakWaterDepth"), (float) var5);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "breakWaterOffset"), var6);
		OpenGL.glUniform2f(OpenGL.glGetUniformLocation(var10, "waveIntensity"), var8, var7);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "waveExponent"), (float) var9);
	}

	public void method618(int arg0, int arg1) {
		if (!this.aBoolean7071) {
			return;
		}
		int var3 = 0x1 << (arg0 & 0x3);
		float var4 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		int var5 = arg1 & 0xFFFF;
		float var6 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		float var7 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		float var8 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		int var9 = arg1 >> 27 & 0xF;
		int var10 = this.aClass28_7073.anInt333;
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "time"), (float) (var3 * this.aClass_ra_Sub1_478.anInt8304 % 40000) / 40000.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "scale"), var4);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "breakWaterDepth"), (float) var5);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "breakWaterOffset"), var6);
		OpenGL.glUniform2f(OpenGL.glGetUniformLocation(var10, "waveIntensity"), var8, var7);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "waveExponent"), (float) var9);
	}

	public void method607(boolean arg0) {
	}

	public void method621(int arg0, int arg1) {
		if (!this.aBoolean7071) {
			return;
		}
		int var3 = 0x1 << (arg0 & 0x3);
		float var4 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		int var5 = arg1 & 0xFFFF;
		float var6 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		float var7 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		float var8 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		int var9 = arg1 >> 27 & 0xF;
		int var10 = this.aClass28_7073.anInt333;
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "time"), (float) (var3 * this.aClass_ra_Sub1_478.anInt8304 % 40000) / 40000.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "scale"), var4);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "breakWaterDepth"), (float) var5);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "breakWaterOffset"), var6);
		OpenGL.glUniform2f(OpenGL.glGetUniformLocation(var10, "waveIntensity"), var8, var7);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "waveExponent"), (float) var9);
	}
}
