package deob;

public class Class328 {

	public int[] anIntArray3328 = new int[2];

	public int[][][] anIntArrayArrayArray3330 = new int[2][2][4];

	public int[][][] anIntArrayArrayArray3331 = new int[2][2][4];

	public int[] anIntArray3332 = new int[2];

	public static float aFloat3329 = 8.0F;

	public static float[][] aFloatArrayArray3333 = new float[2][8];

	public static int anInt3334 = 4;

	public static float aFloat3337 = 100.0F;

	public static float aFloat3338 = 32.703197F;

	public static int[][] anIntArrayArray3339 = new int[2][8];

	public static float aFloat3335;

	public static int anInt3336;

	public float method3242(int arg0, int arg1, float arg2) {
		float var4 = (float) this.anIntArrayArrayArray3331[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray3331[arg0][1][arg1] - this.anIntArrayArrayArray3331[arg0][0][arg1]);
		float var5 = var4 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
	}

	public static float method3243(float arg0) {
		float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return var1 * 3.1415927F / 11025.0F;
	}

	public float method3244(int arg0, int arg1, float arg2) {
		float var4 = (float) this.anIntArrayArrayArray3330[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray3330[arg0][1][arg1] - this.anIntArrayArrayArray3330[arg0][0][arg1]);
		float var5 = var4 * 1.2207031E-4F;
		return method3243(var5);
	}

	public int method3245(int arg0, float arg1) {
		float var3;
		if (arg0 == 0) {
			var3 = (float) this.anIntArray3332[0] + (float) (this.anIntArray3332[1] - this.anIntArray3332[0]) * arg1;
			float var8 = var3 * 0.0030517578F;
			aFloat3335 = (float) Math.pow(0.1D, (double) (var8 / 20.0F));
			anInt3336 = (int) (aFloat3335 * 65536.0F);
		}
		if (this.anIntArray3328[arg0] == 0) {
			return 0;
		}
		var3 = this.method3242(arg0, 0, arg1);
		aFloatArrayArray3333[arg0][0] = -2.0F * var3 * (float) Math.cos((double) this.method3244(arg0, 0, arg1));
		aFloatArrayArray3333[arg0][1] = var3 * var3;
		int var4;
		for (var4 = 1; var4 < this.anIntArray3328[arg0]; var4++) {
			var3 = this.method3242(arg0, var4, arg1);
			float var5 = -2.0F * var3 * (float) Math.cos((double) this.method3244(arg0, var4, arg1));
			float var6 = var3 * var3;
			aFloatArrayArray3333[arg0][var4 * 2 + 1] = aFloatArrayArray3333[arg0][var4 * 2 - 1] * var6;
			aFloatArrayArray3333[arg0][var4 * 2] = aFloatArrayArray3333[arg0][var4 * 2 - 1] * var5 + aFloatArrayArray3333[arg0][var4 * 2 - 2] * var6;
			for (int var7 = var4 * 2 - 1; var7 >= 2; var7--) {
				aFloatArrayArray3333[arg0][var7] += aFloatArrayArray3333[arg0][var7 - 1] * var5 + aFloatArrayArray3333[arg0][var7 - 2] * var6;
			}
			aFloatArrayArray3333[arg0][1] += aFloatArrayArray3333[arg0][0] * var5 + var6;
			aFloatArrayArray3333[arg0][0] += var5;
		}
		if (arg0 == 0) {
			for (var4 = 0; var4 < this.anIntArray3328[0] * 2; var4++) {
				aFloatArrayArray3333[0][var4] *= aFloat3335;
			}
		}
		for (var4 = 0; var4 < this.anIntArray3328[arg0] * 2; var4++) {
			anIntArrayArray3339[arg0][var4] = (int) (aFloatArrayArray3333[arg0][var4] * 65536.0F);
		}
		return this.anIntArray3328[arg0] * 2;
	}

	public final void method3246(Buffer arg0, Class309 arg1) {
		int var3 = arg0.readUnsignedByte(1960559461);
		this.anIntArray3328[0] = var3 >> 4;
		this.anIntArray3328[1] = var3 & 0xF;
		if (var3 == 0) {
			int[] var7 = this.anIntArray3332;
			this.anIntArray3332[1] = 0;
			var7[0] = 0;
			return;
		}
		this.anIntArray3332[0] = arg0.readUnsignedShort(-237157167);
		this.anIntArray3332[1] = arg0.readUnsignedShort(1238998448);
		int var4 = arg0.readUnsignedByte(2086873983);
		int var5;
		int var6;
		for (var5 = 0; var5 < 2; var5++) {
			for (var6 = 0; var6 < this.anIntArray3328[var5]; var6++) {
				this.anIntArrayArrayArray3330[var5][0][var6] = arg0.readUnsignedShort(886404091);
				this.anIntArrayArrayArray3331[var5][0][var6] = arg0.readUnsignedShort(1371281231);
			}
		}
		for (var5 = 0; var5 < 2; var5++) {
			for (var6 = 0; var6 < this.anIntArray3328[var5]; var6++) {
				if ((var4 & 0x1 << var5 * 4 << var6) == 0) {
					this.anIntArrayArrayArray3330[var5][1][var6] = this.anIntArrayArrayArray3330[var5][0][var6];
					this.anIntArrayArrayArray3331[var5][1][var6] = this.anIntArrayArrayArray3331[var5][0][var6];
				} else {
					this.anIntArrayArrayArray3330[var5][1][var6] = arg0.readUnsignedShort(132401599);
					this.anIntArrayArrayArray3331[var5][1][var6] = arg0.readUnsignedShort(-28267792);
				}
			}
		}
		if (var4 != 0 || this.anIntArray3332[1] != this.anIntArray3332[0]) {
			arg1.method3094(arg0);
		}
	}
}
