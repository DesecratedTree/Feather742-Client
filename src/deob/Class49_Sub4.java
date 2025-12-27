package deob;

import jaggl.OpenGL;

public class Class49_Sub4 extends Class49 {

	public static char aChar7056 = 1;

	public static char aChar7059 = 0;

	public static String aString7061 = "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND";

	public static float[] aFloatArray7065 = new float[4];

	public Class47 aClass47_7064;

	public Class29 aClass29_7063;

	public float[] aFloatArray7058;

	public float aFloat7062;

	public int anInt7060;

	public Class33 aClass33_7057;

	public void method602(boolean arg0) {
		if (this.aClass33_7057 == null) {
			return;
		}
		this.aClass33_7057.method503('\u0000');
		this.aClass_ra_Sub1_478.method4843(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass_ra_Sub1_478.aClass249_8359.aFloatArray2631, 0);
		OpenGL.glMatrixMode(5888);
		this.aClass_ra_Sub1_478.method4843(0);
		if (this.anInt7060 == this.aClass_ra_Sub1_478.anInt8304) {
			return;
		}
		int var2 = this.aClass_ra_Sub1_478.anInt8304 % 5000 * 128 / 5000;
		for (int var3 = 0; var3 < 64; var3++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, var3, this.aFloatArray7058, var2);
			var2 += 2;
		}
		if (this.aClass47_7064.aBoolean462) {
			this.aFloat7062 = (float) (this.aClass_ra_Sub1_478.anInt8304 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt7060 = this.aClass_ra_Sub1_478.anInt8304;
	}

	public void method625() {
		this.aClass33_7057 = new Class33(this.aClass_ra_Sub1_478, 2);
		this.aClass33_7057.method504(0);
		this.aClass_ra_Sub1_478.method4843(1);
		this.aClass_ra_Sub1_478.method4849(-16777216);
		this.aClass_ra_Sub1_478.method4831(260, 7681);
		this.aClass_ra_Sub1_478.method4848(0, 34166, 770);
		this.aClass_ra_Sub1_478.method4843(0);
		OpenGL.glBindProgramARB(34336, this.aClass29_7063.anInt338);
		OpenGL.glEnable(34336);
		this.aClass33_7057.method502();
		this.aClass33_7057.method504(1);
		this.aClass_ra_Sub1_478.method4843(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		this.aClass_ra_Sub1_478.method4836(0);
		this.aClass_ra_Sub1_478.method4848(0, 5890, 770);
		this.aClass_ra_Sub1_478.method4843(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass33_7057.method502();
	}

	public void method612(boolean arg0) {
	}

	public void method608(boolean arg0) {
	}

	public void method604() {
		if (this.aClass33_7057 != null) {
			this.aClass33_7057.method503('\u0001');
			this.aClass_ra_Sub1_478.method4843(1);
			this.aClass_ra_Sub1_478.method4844(null);
			this.aClass_ra_Sub1_478.method4843(0);
		}
	}

	public void method606(int arg0, int arg1) {
		if (this.aClass33_7057 == null) {
			return;
		}
		this.aClass_ra_Sub1_478.method4843(1);
		int var3;
		if ((arg0 & 0x80) != 0) {
			this.aClass_ra_Sub1_478.method4844(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass47_7064.aBoolean462) {
				this.aClass_ra_Sub1_478.method4844(this.aClass47_7064.aClass36_Sub2_464);
			} else {
				this.aClass_ra_Sub1_478.method4844(this.aClass47_7064.aClass36_Sub1Array461[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass47_7064.aBoolean462) {
			this.aClass_ra_Sub1_478.method4844(this.aClass47_7064.aClass36_Sub2_464);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat7062, 0.0F, 0.0F, 1.0F);
		} else {
			var3 = this.aClass_ra_Sub1_478.anInt8304 % 4000 * 16 / 4000;
			this.aClass_ra_Sub1_478.method4844(this.aClass47_7064.aClass36_Sub1Array461[var3]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.aClass_ra_Sub1_478.method4843(0);
		if ((arg0 & 0x40) == 0) {
			aFloatArray7065[0] = this.aClass_ra_Sub1_478.aFloat8372 * this.aClass_ra_Sub1_478.aFloat8250;
			aFloatArray7065[1] = this.aClass_ra_Sub1_478.aFloat8372 * this.aClass_ra_Sub1_478.aFloat8370;
			aFloatArray7065[2] = this.aClass_ra_Sub1_478.aFloat8372 * this.aClass_ra_Sub1_478.aFloat8371;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray7065, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		var3 = arg0 & 0x3;
		if (var3 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (var3 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	public void method614() {
		if (this.aClass33_7057 != null) {
			this.aClass33_7057.method503('\u0001');
			this.aClass_ra_Sub1_478.method4843(1);
			this.aClass_ra_Sub1_478.method4844(null);
			this.aClass_ra_Sub1_478.method4843(0);
		}
	}

	public void method619(int arg0, int arg1) {
		if (this.aClass33_7057 == null) {
			return;
		}
		this.aClass_ra_Sub1_478.method4843(1);
		int var3;
		if ((arg0 & 0x80) != 0) {
			this.aClass_ra_Sub1_478.method4844(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass47_7064.aBoolean462) {
				this.aClass_ra_Sub1_478.method4844(this.aClass47_7064.aClass36_Sub2_464);
			} else {
				this.aClass_ra_Sub1_478.method4844(this.aClass47_7064.aClass36_Sub1Array461[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass47_7064.aBoolean462) {
			this.aClass_ra_Sub1_478.method4844(this.aClass47_7064.aClass36_Sub2_464);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat7062, 0.0F, 0.0F, 1.0F);
		} else {
			var3 = this.aClass_ra_Sub1_478.anInt8304 % 4000 * 16 / 4000;
			this.aClass_ra_Sub1_478.method4844(this.aClass47_7064.aClass36_Sub1Array461[var3]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.aClass_ra_Sub1_478.method4843(0);
		if ((arg0 & 0x40) == 0) {
			aFloatArray7065[0] = this.aClass_ra_Sub1_478.aFloat8372 * this.aClass_ra_Sub1_478.aFloat8250;
			aFloatArray7065[1] = this.aClass_ra_Sub1_478.aFloat8372 * this.aClass_ra_Sub1_478.aFloat8370;
			aFloatArray7065[2] = this.aClass_ra_Sub1_478.aFloat8372 * this.aClass_ra_Sub1_478.aFloat8371;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray7065, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		var3 = arg0 & 0x3;
		if (var3 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (var3 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	public boolean method611() {
		return true;
	}

	public void method610(boolean arg0) {
	}

	public void method600(Class36 arg0, int arg1) {
		this.aClass_ra_Sub1_478.method4844(arg0);
		this.aClass_ra_Sub1_478.method4836(arg1);
	}

	public void method609(boolean arg0) {
		if (this.aClass33_7057 == null) {
			return;
		}
		this.aClass33_7057.method503('\u0000');
		this.aClass_ra_Sub1_478.method4843(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass_ra_Sub1_478.aClass249_8359.aFloatArray2631, 0);
		OpenGL.glMatrixMode(5888);
		this.aClass_ra_Sub1_478.method4843(0);
		if (this.anInt7060 == this.aClass_ra_Sub1_478.anInt8304) {
			return;
		}
		int var2 = this.aClass_ra_Sub1_478.anInt8304 % 5000 * 128 / 5000;
		for (int var3 = 0; var3 < 64; var3++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, var3, this.aFloatArray7058, var2);
			var2 += 2;
		}
		if (this.aClass47_7064.aBoolean462) {
			this.aFloat7062 = (float) (this.aClass_ra_Sub1_478.anInt8304 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt7060 = this.aClass_ra_Sub1_478.anInt8304;
	}

	public void method616(Class36 arg0, int arg1) {
		this.aClass_ra_Sub1_478.method4844(arg0);
		this.aClass_ra_Sub1_478.method4836(arg1);
	}

	public void method607(boolean arg0) {
	}

	public boolean method605() {
		return true;
	}

	public void method617(int arg0, int arg1) {
		if (this.aClass33_7057 == null) {
			return;
		}
		this.aClass_ra_Sub1_478.method4843(1);
		int var3;
		if ((arg0 & 0x80) != 0) {
			this.aClass_ra_Sub1_478.method4844(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass47_7064.aBoolean462) {
				this.aClass_ra_Sub1_478.method4844(this.aClass47_7064.aClass36_Sub2_464);
			} else {
				this.aClass_ra_Sub1_478.method4844(this.aClass47_7064.aClass36_Sub1Array461[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass47_7064.aBoolean462) {
			this.aClass_ra_Sub1_478.method4844(this.aClass47_7064.aClass36_Sub2_464);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat7062, 0.0F, 0.0F, 1.0F);
		} else {
			var3 = this.aClass_ra_Sub1_478.anInt8304 % 4000 * 16 / 4000;
			this.aClass_ra_Sub1_478.method4844(this.aClass47_7064.aClass36_Sub1Array461[var3]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.aClass_ra_Sub1_478.method4843(0);
		if ((arg0 & 0x40) == 0) {
			aFloatArray7065[0] = this.aClass_ra_Sub1_478.aFloat8372 * this.aClass_ra_Sub1_478.aFloat8250;
			aFloatArray7065[1] = this.aClass_ra_Sub1_478.aFloat8372 * this.aClass_ra_Sub1_478.aFloat8370;
			aFloatArray7065[2] = this.aClass_ra_Sub1_478.aFloat8372 * this.aClass_ra_Sub1_478.aFloat8371;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray7065, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		var3 = arg0 & 0x3;
		if (var3 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (var3 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	public void method613() {
		if (this.aClass33_7057 != null) {
			this.aClass33_7057.method503('\u0001');
			this.aClass_ra_Sub1_478.method4843(1);
			this.aClass_ra_Sub1_478.method4844(null);
			this.aClass_ra_Sub1_478.method4843(0);
		}
	}

	public void method615(Class36 arg0, int arg1) {
		this.aClass_ra_Sub1_478.method4844(arg0);
		this.aClass_ra_Sub1_478.method4836(arg1);
	}

	public void method603() {
		if (this.aClass33_7057 != null) {
			this.aClass33_7057.method503('\u0001');
			this.aClass_ra_Sub1_478.method4843(1);
			this.aClass_ra_Sub1_478.method4844(null);
			this.aClass_ra_Sub1_478.method4843(0);
		}
	}

	public boolean method601() {
		return true;
	}

	public void method618(int arg0, int arg1) {
		if (this.aClass33_7057 == null) {
			return;
		}
		this.aClass_ra_Sub1_478.method4843(1);
		int var3;
		if ((arg0 & 0x80) != 0) {
			this.aClass_ra_Sub1_478.method4844(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass47_7064.aBoolean462) {
				this.aClass_ra_Sub1_478.method4844(this.aClass47_7064.aClass36_Sub2_464);
			} else {
				this.aClass_ra_Sub1_478.method4844(this.aClass47_7064.aClass36_Sub1Array461[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass47_7064.aBoolean462) {
			this.aClass_ra_Sub1_478.method4844(this.aClass47_7064.aClass36_Sub2_464);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat7062, 0.0F, 0.0F, 1.0F);
		} else {
			var3 = this.aClass_ra_Sub1_478.anInt8304 % 4000 * 16 / 4000;
			this.aClass_ra_Sub1_478.method4844(this.aClass47_7064.aClass36_Sub1Array461[var3]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.aClass_ra_Sub1_478.method4843(0);
		if ((arg0 & 0x40) == 0) {
			aFloatArray7065[0] = this.aClass_ra_Sub1_478.aFloat8372 * this.aClass_ra_Sub1_478.aFloat8250;
			aFloatArray7065[1] = this.aClass_ra_Sub1_478.aFloat8372 * this.aClass_ra_Sub1_478.aFloat8370;
			aFloatArray7065[2] = this.aClass_ra_Sub1_478.aFloat8372 * this.aClass_ra_Sub1_478.aFloat8371;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray7065, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		var3 = arg0 & 0x3;
		if (var3 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (var3 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	public Class49_Sub4(Class_ra_Sub1 arg0, Class47 arg1) {
		super(arg0);
		this.aClass47_7064 = arg1;
		if (this.aClass_ra_Sub1_478.aBoolean8425 && this.aClass_ra_Sub1_478.anInt8409 >= 2) {
			this.aClass29_7063 = Class29.method497(this.aClass_ra_Sub1_478, 34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass29_7063 != null) {
				int[][] var3 = Class330_Sub22.method3378(64, 256, 0, 4, 4, 3, 0.4F, false, -1001769298);
				int[][] var4 = Class330_Sub22.method3378(64, 256, 8, 4, 4, 3, 0.4F, false, -1849448326);
				int var5 = 0;
				this.aFloatArray7058 = new float[32768];
				for (int var6 = 0; var6 < 256; var6++) {
					int[] var7 = var3[var6];
					int[] var8 = var4[var6];
					for (int var9 = 0; var9 < 64; var9++) {
						this.aFloatArray7058[var5++] = (float) var7[var9] / 4096.0F;
						this.aFloatArray7058[var5++] = (float) var8[var9] / 4096.0F;
					}
				}
				this.method625();
			}
		}
	}

	public void method620(int arg0, int arg1) {
		if (this.aClass33_7057 == null) {
			return;
		}
		this.aClass_ra_Sub1_478.method4843(1);
		int var3;
		if ((arg0 & 0x80) != 0) {
			this.aClass_ra_Sub1_478.method4844(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass47_7064.aBoolean462) {
				this.aClass_ra_Sub1_478.method4844(this.aClass47_7064.aClass36_Sub2_464);
			} else {
				this.aClass_ra_Sub1_478.method4844(this.aClass47_7064.aClass36_Sub1Array461[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass47_7064.aBoolean462) {
			this.aClass_ra_Sub1_478.method4844(this.aClass47_7064.aClass36_Sub2_464);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat7062, 0.0F, 0.0F, 1.0F);
		} else {
			var3 = this.aClass_ra_Sub1_478.anInt8304 % 4000 * 16 / 4000;
			this.aClass_ra_Sub1_478.method4844(this.aClass47_7064.aClass36_Sub1Array461[var3]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.aClass_ra_Sub1_478.method4843(0);
		if ((arg0 & 0x40) == 0) {
			aFloatArray7065[0] = this.aClass_ra_Sub1_478.aFloat8372 * this.aClass_ra_Sub1_478.aFloat8250;
			aFloatArray7065[1] = this.aClass_ra_Sub1_478.aFloat8372 * this.aClass_ra_Sub1_478.aFloat8370;
			aFloatArray7065[2] = this.aClass_ra_Sub1_478.aFloat8372 * this.aClass_ra_Sub1_478.aFloat8371;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray7065, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		var3 = arg0 & 0x3;
		if (var3 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (var3 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	public void method621(int arg0, int arg1) {
		if (this.aClass33_7057 == null) {
			return;
		}
		this.aClass_ra_Sub1_478.method4843(1);
		int var3;
		if ((arg0 & 0x80) != 0) {
			this.aClass_ra_Sub1_478.method4844(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass47_7064.aBoolean462) {
				this.aClass_ra_Sub1_478.method4844(this.aClass47_7064.aClass36_Sub2_464);
			} else {
				this.aClass_ra_Sub1_478.method4844(this.aClass47_7064.aClass36_Sub1Array461[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass47_7064.aBoolean462) {
			this.aClass_ra_Sub1_478.method4844(this.aClass47_7064.aClass36_Sub2_464);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat7062, 0.0F, 0.0F, 1.0F);
		} else {
			var3 = this.aClass_ra_Sub1_478.anInt8304 % 4000 * 16 / 4000;
			this.aClass_ra_Sub1_478.method4844(this.aClass47_7064.aClass36_Sub1Array461[var3]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.aClass_ra_Sub1_478.method4843(0);
		if ((arg0 & 0x40) == 0) {
			aFloatArray7065[0] = this.aClass_ra_Sub1_478.aFloat8372 * this.aClass_ra_Sub1_478.aFloat8250;
			aFloatArray7065[1] = this.aClass_ra_Sub1_478.aFloat8372 * this.aClass_ra_Sub1_478.aFloat8370;
			aFloatArray7065[2] = this.aClass_ra_Sub1_478.aFloat8372 * this.aClass_ra_Sub1_478.aFloat8371;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray7065, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		var3 = arg0 & 0x3;
		if (var3 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (var3 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}
}
