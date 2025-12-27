package deob;

import jaggl.OpenGL;

public class Class49_Sub2 extends Class49 {

	public static String aString7038 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";

	public static String aString7039 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";

	public static String aString7041 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";

	public static String aString7043 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";

	public static float[] aFloatArray7051 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	public boolean aBoolean7040 = false;

	public Class29 aClass29_7050;

	public Class29 aClass29_7049;

	public Class29 aClass29_7048;

	public Class29 aClass29_7045;

	public Class36_Sub1 aClass36_Sub1_7046;

	public boolean aBoolean7042;

	public boolean aBoolean7044;

	public boolean aBoolean7047;

	public Class49_Sub2(Class_ra_Sub1 arg0) {
		super(arg0);
		if (this.aClass_ra_Sub1_478.aBoolean8425) {
			this.aClass29_7050 = Class29.method497(this.aClass_ra_Sub1_478, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass29_7049 = Class29.method497(this.aClass_ra_Sub1_478, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass29_7048 = Class29.method497(this.aClass_ra_Sub1_478, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			this.aClass29_7045 = Class29.method497(this.aClass_ra_Sub1_478, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			if (this.aClass29_7050 != null & this.aClass29_7049 != null & this.aClass29_7048 != null & this.aClass29_7045 != null) {
				this.aClass36_Sub1_7046 = new Class36_Sub1(arg0, 3553, Class72.aClass72_611, Class86.aClass86_714, 2, 1, false, new byte[] { 0, -1 }, Class72.aClass72_611, false);
				this.aClass36_Sub1_7046.method518(false, false);
				this.aBoolean7042 = true;
			} else {
				this.aBoolean7042 = false;
			}
		} else {
			this.aBoolean7042 = false;
		}
	}

	public void method606(int arg0, int arg1) {
	}

	public boolean method601() {
		return this.aBoolean7042;
	}

	public void method623() {
		if (!this.aBoolean7044) {
			return;
		}
		float var1 = this.aClass_ra_Sub1_478.aFloat8344;
		float var2 = this.aClass_ra_Sub1_478.aFloat8343;
		float var3 = var1 - (var1 - var2) * 0.125F;
		float var4 = var1 - (var1 - var2) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, var4, var3, 256.0F / (float) this.aClass_ra_Sub1_478.aClass77_8391.anInt650, (float) this.aClass_ra_Sub1_478.aClass77_8391.anInt651 / 255.0F);
		this.aClass_ra_Sub1_478.method4843(1);
		this.aClass_ra_Sub1_478.method4849(this.aClass_ra_Sub1_478.aClass77_8391.anInt652);
		this.aClass_ra_Sub1_478.method4843(0);
	}

	public void method608(boolean arg0) {
	}

	public void method604() {
		if (this.aBoolean7044) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean7044 = false;
		}
		this.aClass_ra_Sub1_478.method4843(1);
		this.aClass_ra_Sub1_478.method4844(null);
		this.aClass_ra_Sub1_478.method4831(8448, 8448);
		this.aClass_ra_Sub1_478.method4847(0, 5890, 768);
		this.aClass_ra_Sub1_478.method4847(2, 34166, 770);
		this.aClass_ra_Sub1_478.method4848(0, 5890, 770);
		this.aClass_ra_Sub1_478.method4843(0);
		if (this.aBoolean7040) {
			this.aClass_ra_Sub1_478.method4847(0, 5890, 768);
			this.aClass_ra_Sub1_478.method4848(0, 5890, 770);
			this.aBoolean7040 = false;
		}
	}

	public void method624() {
		Class249 var1 = this.aClass_ra_Sub1_478.aClass249_8378;
		if (this.aBoolean7047) {
			OpenGL.glBindProgramARB(34336, this.aClass_ra_Sub1_478.anInt8390 == Integer.MAX_VALUE ? this.aClass29_7049.anInt338 : this.aClass29_7045.anInt338);
		} else {
			OpenGL.glBindProgramARB(34336, this.aClass_ra_Sub1_478.anInt8390 == Integer.MAX_VALUE ? this.aClass29_7050.anInt338 : this.aClass29_7048.anInt338);
		}
		float var2 = (float) this.aClass_ra_Sub1_478.anInt8390;
		float var3 = var1.aFloatArray2631[4] * var2 + var1.aFloatArray2631[12];
		float var4 = var1.aFloatArray2631[5] * var2 + var1.aFloatArray2631[13];
		float var5 = var1.aFloatArray2631[6] * var2 + var1.aFloatArray2631[14];
		aFloatArray7051[0] = -var1.aFloatArray2631[4];
		aFloatArray7051[1] = -var1.aFloatArray2631[5];
		aFloatArray7051[2] = -var1.aFloatArray2631[6];
		aFloatArray7051[3] = -(aFloatArray7051[0] * var3 + aFloatArray7051[1] * var4 + aFloatArray7051[2] * var5);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray7051[0], aFloatArray7051[1], aFloatArray7051[2], aFloatArray7051[3]);
		OpenGL.glEnable(34336);
		this.aBoolean7044 = true;
		this.method623();
	}

	public void method620(int arg0, int arg1) {
	}

	public void method619(int arg0, int arg1) {
	}

	public void method600(Class36 arg0, int arg1) {
		if (arg0 != null) {
			if (this.aBoolean7040) {
				this.aClass_ra_Sub1_478.method4847(0, 5890, 768);
				this.aClass_ra_Sub1_478.method4848(0, 5890, 770);
				this.aBoolean7040 = false;
			}
			this.aClass_ra_Sub1_478.method4844(arg0);
			this.aClass_ra_Sub1_478.method4836(arg1);
		} else if (!this.aBoolean7040) {
			this.aClass_ra_Sub1_478.method4844(this.aClass_ra_Sub1_478.aClass36_Sub1_8400);
			this.aClass_ra_Sub1_478.method4836(1);
			this.aClass_ra_Sub1_478.method4847(0, 34168, 768);
			this.aClass_ra_Sub1_478.method4848(0, 34168, 770);
			this.aBoolean7040 = true;
		}
	}

	public boolean method605() {
		return this.aBoolean7042;
	}

	public void method616(Class36 arg0, int arg1) {
		if (arg0 != null) {
			if (this.aBoolean7040) {
				this.aClass_ra_Sub1_478.method4847(0, 5890, 768);
				this.aClass_ra_Sub1_478.method4848(0, 5890, 770);
				this.aBoolean7040 = false;
			}
			this.aClass_ra_Sub1_478.method4844(arg0);
			this.aClass_ra_Sub1_478.method4836(arg1);
		} else if (!this.aBoolean7040) {
			this.aClass_ra_Sub1_478.method4844(this.aClass_ra_Sub1_478.aClass36_Sub1_8400);
			this.aClass_ra_Sub1_478.method4836(1);
			this.aClass_ra_Sub1_478.method4847(0, 34168, 768);
			this.aClass_ra_Sub1_478.method4848(0, 34168, 770);
			this.aBoolean7040 = true;
		}
	}

	public void method602(boolean arg0) {
		this.aBoolean7047 = arg0;
		this.aClass_ra_Sub1_478.method4843(1);
		this.aClass_ra_Sub1_478.method4844(this.aClass36_Sub1_7046);
		this.aClass_ra_Sub1_478.method4831(34165, 7681);
		this.aClass_ra_Sub1_478.method4847(0, 34166, 768);
		this.aClass_ra_Sub1_478.method4847(2, 5890, 770);
		this.aClass_ra_Sub1_478.method4848(0, 34168, 770);
		this.aClass_ra_Sub1_478.method4843(0);
		this.method624();
	}

	public void method610(boolean arg0) {
	}

	public void method607(boolean arg0) {
	}

	public void method612(boolean arg0) {
	}

	public void method613() {
		if (this.aBoolean7044) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean7044 = false;
		}
		this.aClass_ra_Sub1_478.method4843(1);
		this.aClass_ra_Sub1_478.method4844(null);
		this.aClass_ra_Sub1_478.method4831(8448, 8448);
		this.aClass_ra_Sub1_478.method4847(0, 5890, 768);
		this.aClass_ra_Sub1_478.method4847(2, 34166, 770);
		this.aClass_ra_Sub1_478.method4848(0, 5890, 770);
		this.aClass_ra_Sub1_478.method4843(0);
		if (this.aBoolean7040) {
			this.aClass_ra_Sub1_478.method4847(0, 5890, 768);
			this.aClass_ra_Sub1_478.method4848(0, 5890, 770);
			this.aBoolean7040 = false;
		}
	}

	public boolean method611() {
		return this.aBoolean7042;
	}

	public void method603() {
		if (this.aBoolean7044) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean7044 = false;
		}
		this.aClass_ra_Sub1_478.method4843(1);
		this.aClass_ra_Sub1_478.method4844(null);
		this.aClass_ra_Sub1_478.method4831(8448, 8448);
		this.aClass_ra_Sub1_478.method4847(0, 5890, 768);
		this.aClass_ra_Sub1_478.method4847(2, 34166, 770);
		this.aClass_ra_Sub1_478.method4848(0, 5890, 770);
		this.aClass_ra_Sub1_478.method4843(0);
		if (this.aBoolean7040) {
			this.aClass_ra_Sub1_478.method4847(0, 5890, 768);
			this.aClass_ra_Sub1_478.method4848(0, 5890, 770);
			this.aBoolean7040 = false;
		}
	}

	public void method615(Class36 arg0, int arg1) {
		if (arg0 != null) {
			if (this.aBoolean7040) {
				this.aClass_ra_Sub1_478.method4847(0, 5890, 768);
				this.aClass_ra_Sub1_478.method4848(0, 5890, 770);
				this.aBoolean7040 = false;
			}
			this.aClass_ra_Sub1_478.method4844(arg0);
			this.aClass_ra_Sub1_478.method4836(arg1);
		} else if (!this.aBoolean7040) {
			this.aClass_ra_Sub1_478.method4844(this.aClass_ra_Sub1_478.aClass36_Sub1_8400);
			this.aClass_ra_Sub1_478.method4836(1);
			this.aClass_ra_Sub1_478.method4847(0, 34168, 768);
			this.aClass_ra_Sub1_478.method4848(0, 34168, 770);
			this.aBoolean7040 = true;
		}
	}

	public void method617(int arg0, int arg1) {
	}

	public void method618(int arg0, int arg1) {
	}

	public void method614() {
		if (this.aBoolean7044) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean7044 = false;
		}
		this.aClass_ra_Sub1_478.method4843(1);
		this.aClass_ra_Sub1_478.method4844(null);
		this.aClass_ra_Sub1_478.method4831(8448, 8448);
		this.aClass_ra_Sub1_478.method4847(0, 5890, 768);
		this.aClass_ra_Sub1_478.method4847(2, 34166, 770);
		this.aClass_ra_Sub1_478.method4848(0, 5890, 770);
		this.aClass_ra_Sub1_478.method4843(0);
		if (this.aBoolean7040) {
			this.aClass_ra_Sub1_478.method4847(0, 5890, 768);
			this.aClass_ra_Sub1_478.method4848(0, 5890, 770);
			this.aBoolean7040 = false;
		}
	}

	public void method609(boolean arg0) {
		this.aBoolean7047 = arg0;
		this.aClass_ra_Sub1_478.method4843(1);
		this.aClass_ra_Sub1_478.method4844(this.aClass36_Sub1_7046);
		this.aClass_ra_Sub1_478.method4831(34165, 7681);
		this.aClass_ra_Sub1_478.method4847(0, 34166, 768);
		this.aClass_ra_Sub1_478.method4847(2, 5890, 770);
		this.aClass_ra_Sub1_478.method4848(0, 34168, 770);
		this.aClass_ra_Sub1_478.method4843(0);
		this.method624();
	}

	public void method621(int arg0, int arg1) {
	}
}
