package deob;

import java.nio.ByteBuffer;

public class Class263_Sub5 extends Class263 {

	public byte[] aByteArray7397 = new byte[512];

	public Class_ra_Sub2 aClass_ra_Sub2_7394;

	public int anInt7399;

	public int anInt7398;

	public Interface11_Impl3 anInterface11_Impl3_7395;

	public Interface9_Impl1 anInterface9_Impl1_7396;

	public Class263_Sub5(Class_ra_Sub2 arg0, Class524 arg1, Class87_Sub2[] arg2, boolean arg3) {
		super(arg0, arg1);
		this.aClass_ra_Sub2_7394 = arg0;
		this.anInt7399 = 0;
		for (int var5 = 0; var5 < 256; var5++) {
			Class87_Sub2 var6 = arg2[var5];
			if (var6.anInt7107 > this.anInt7399) {
				this.anInt7399 = var6.anInt7107;
			}
			if (var6.anInt7112 > this.anInt7399) {
				this.anInt7399 = var6.anInt7112;
			}
		}
		this.anInt7398 = this.anInt7399 * 16;
		Class87_Sub2 var7;
		int var8;
		int var10;
		int var11;
		int var12;
		int var13;
		int var15;
		int var16;
		int var22;
		if (arg3) {
			byte[] var20 = new byte[this.anInt7398 * this.anInt7398];
			for (var22 = 0; var22 < 256; var22++) {
				var7 = arg2[var22];
				var8 = var7.anInt7107;
				int var9 = var7.anInt7112;
				var10 = var22 % 16 * this.anInt7399;
				var11 = var22 / 16 * this.anInt7399;
				var12 = var11 * this.anInt7398 + var10;
				var13 = 0;
				byte[] var14;
				if (var7.aByteArray7115 == null) {
					var14 = var7.aByteArray7114;
					for (var15 = 0; var15 < var8; var15++) {
						for (var16 = 0; var16 < var9; var16++) {
							var20[var12++] = (byte) (var14[var13++] == 0 ? 0 : -1);
						}
						var12 += this.anInt7398 - var9;
					}
				} else {
					var14 = var7.aByteArray7115;
					for (var15 = 0; var15 < var8; var15++) {
						for (var16 = 0; var16 < var9; var16++) {
							var20[var12++] = var14[var13++];
						}
						var12 += this.anInt7398 - var9;
					}
				}
			}
			int[] var24 = new int[var20.length];
			for (int var25 = 0; var25 < var20.length; var25++) {
				var24[var25] = var20[var25] << 24 | var20[var25] << 16 | var20[var25] << 8 | var20[var25];
			}
			this.anInterface11_Impl3_7395 = arg0.method4944(this.anInt7398, this.anInt7398, false, var24);
		} else {
			int[] var21 = new int[this.anInt7398 * this.anInt7398];
			for (var22 = 0; var22 < 256; var22++) {
				var7 = arg2[var22];
				int[] var27 = var7.anIntArray7113;
				byte[] var29 = var7.aByteArray7115;
				byte[] var31 = var7.aByteArray7114;
				var11 = var7.anInt7107;
				var12 = var7.anInt7112;
				var13 = var22 % 16 * this.anInt7399;
				int var32 = var22 / 16 * this.anInt7399;
				var15 = var32 * this.anInt7398 + var13;
				var16 = 0;
				int var17;
				int var18;
				if (var29 == null) {
					for (var17 = 0; var17 < var11; var17++) {
						for (var18 = 0; var18 < var12; var18++) {
							byte var19;
							if ((var19 = var31[var16++]) == 0) {
								var15++;
							} else {
								var21[var15++] = var27[var19 & 0xFF] | 0xFF000000;
							}
						}
						var15 += this.anInt7398 - var12;
					}
				} else {
					for (var17 = 0; var17 < var11; var17++) {
						for (var18 = 0; var18 < var12; var18++) {
							var21[var15++] = var29[var16] << 24 | var27[var31[var16] & 0xFF];
							var16++;
						}
						var15 += this.anInt7398 - var12;
					}
				}
			}
			this.anInterface11_Impl3_7395 = arg0.method4944(this.anInt7398, this.anInt7398, false, var21);
		}
		this.anInterface11_Impl3_7395.method163(Class189.aClass189_1855);
		this.anInterface9_Impl1_7396 = arg0.method4976(false);
		this.anInterface9_Impl1_7396.method142(20480, 20);
		ByteBuffer var23 = this.aClass_ra_Sub2_7394.aByteBuffer8458;
		var23.clear();
		float var26 = this.anInterface11_Impl3_7395.method106((float) this.anInt7398) / (float) this.anInt7398;
		float var28 = this.anInterface11_Impl3_7395.method104((float) this.anInt7398) / (float) this.anInt7398;
		Class87_Sub2 var30;
		for (var8 = 0; var8 < 256; var8++) {
			var30 = arg2[var8];
			var10 = var30.anInt7107;
			var11 = var30.anInt7112;
			var12 = var30.anInt7111;
			var13 = var30.anInt7109;
			float var33 = (float) (var8 % 16 * this.anInt7399);
			float var34 = (float) (var8 / 16 * this.anInt7399);
			float var35 = var33 * var26;
			float var36 = var34 * var28;
			float var37 = (var33 + (float) var11) * var26;
			float var38 = (var34 + (float) var10) * var28;
			var23.putFloat((float) var13);
			var23.putFloat((float) var12);
			var23.putFloat(0.0F);
			var23.putFloat(var35);
			var23.putFloat(var36);
			var23.putFloat((float) var13);
			var23.putFloat((float) (var12 + var10));
			var23.putFloat(0.0F);
			var23.putFloat(var35);
			var23.putFloat(var38);
			var23.putFloat((float) (var13 + var11));
			var23.putFloat((float) (var12 + var10));
			var23.putFloat(0.0F);
			var23.putFloat(var37);
			var23.putFloat(var38);
			var23.putFloat((float) (var13 + var11));
			var23.putFloat((float) var12);
			var23.putFloat(0.0F);
			var23.putFloat(var37);
			var23.putFloat(var36);
		}
		this.anInterface9_Impl1_7396.method97(0, var23.position(), this.aClass_ra_Sub2_7394.aLong8459);
		arg0.method4894(12);
		for (var8 = 0; var8 < 256; var8++) {
			var30 = arg2[var8];
			this.aByteArray7397[var8 * 2] = (byte) var30.anInt7109;
			this.aByteArray7397[var8 * 2 + 1] = (byte) var30.anInt7111;
		}
	}

	public void method2602(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
	}

	@ObfuscatedName("Class263_Sub5.UA(CIIIZ)V")
	public void UA(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
		if (this.aClass_ra_Sub2_7394.method4903() != Class161.aClass161_1688) {
			int var9 = arg1 + this.aByteArray7397[arg0 * 2];
			int var10 = arg2 + this.aByteArray7397[arg0 * 2 + 1];
			this.aClass_ra_Sub2_7394.aClass187_8556.method2086((float) var9, (float) var10, (float) (var9 + this.anInt7399), (float) (var10 + this.anInt7399), (float) (arg0 % 16) / 16.0F * this.anInterface11_Impl3_7395.method123(), (float) (arg0 / 16) / 16.0F * this.anInterface11_Impl3_7395.method114(), (float) (arg0 % 16 + 1) / 16.0F * this.anInterface11_Impl3_7395.method123(), (float) (arg0 / 16 + 1) / 16.0F * this.anInterface11_Impl3_7395.method114(), this.anInterface11_Impl3_7395, arg3);
			return;
		}
		this.aClass_ra_Sub2_7394.method4925();
		this.aClass_ra_Sub2_7394.method4970(1);
		Class159 var6 = this.aClass_ra_Sub2_7394.aClass159_8590;
		var6.anInterface11_Impl3_1679 = this.anInterface11_Impl3_7395;
		var6.method1861(0, arg3);
		float var7 = (float) this.aClass_ra_Sub2_7394.method4782((byte) 0).method856();
		float var8 = (float) this.aClass_ra_Sub2_7394.method4782((byte) 0).method857();
		var6.aClass249_1681.method2486(2.0F / var7, 2.0F / var8, 1.0F, 1.0F);
		var6.aClass249_1681.aFloatArray2631[12] = ((float) arg1 + this.aClass_ra_Sub2_7394.method4901()) * 2.0F / var7 - 1.0F;
		var6.aClass249_1681.aFloatArray2631[13] = ((float) arg2 + this.aClass_ra_Sub2_7394.method4901()) * 2.0F / var8 - 1.0F;
		var6.aClass249_1681.aFloatArray2631[14] = -1.0F;
		var6.aClass249_1682.method2516();
		var6.anInterface9_Impl1_1678 = this.anInterface9_Impl1_7396;
		var6.anInt1685 = arg0 * 4;
		var6.aClass184_1686 = this.aClass_ra_Sub2_7394.aClass184_8606;
		var6.method1862();
	}

	public void method2604(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
	}

	@ObfuscatedName("Class263_Sub5.c(CIIIZ)V")
	public void c(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
		if (this.aClass_ra_Sub2_7394.method4903() != Class161.aClass161_1688) {
			int var9 = arg1 + this.aByteArray7397[arg0 * 2];
			int var10 = arg2 + this.aByteArray7397[arg0 * 2 + 1];
			this.aClass_ra_Sub2_7394.aClass187_8556.method2086((float) var9, (float) var10, (float) (var9 + this.anInt7399), (float) (var10 + this.anInt7399), (float) (arg0 % 16) / 16.0F * this.anInterface11_Impl3_7395.method123(), (float) (arg0 / 16) / 16.0F * this.anInterface11_Impl3_7395.method114(), (float) (arg0 % 16 + 1) / 16.0F * this.anInterface11_Impl3_7395.method123(), (float) (arg0 / 16 + 1) / 16.0F * this.anInterface11_Impl3_7395.method114(), this.anInterface11_Impl3_7395, arg3);
			return;
		}
		this.aClass_ra_Sub2_7394.method4925();
		this.aClass_ra_Sub2_7394.method4970(1);
		Class159 var6 = this.aClass_ra_Sub2_7394.aClass159_8590;
		var6.anInterface11_Impl3_1679 = this.anInterface11_Impl3_7395;
		var6.method1861(0, arg3);
		float var7 = (float) this.aClass_ra_Sub2_7394.method4782((byte) 0).method856();
		float var8 = (float) this.aClass_ra_Sub2_7394.method4782((byte) 0).method857();
		var6.aClass249_1681.method2486(2.0F / var7, 2.0F / var8, 1.0F, 1.0F);
		var6.aClass249_1681.aFloatArray2631[12] = ((float) arg1 + this.aClass_ra_Sub2_7394.method4901()) * 2.0F / var7 - 1.0F;
		var6.aClass249_1681.aFloatArray2631[13] = ((float) arg2 + this.aClass_ra_Sub2_7394.method4901()) * 2.0F / var8 - 1.0F;
		var6.aClass249_1681.aFloatArray2631[14] = -1.0F;
		var6.aClass249_1682.method2516();
		var6.anInterface9_Impl1_1678 = this.anInterface9_Impl1_7396;
		var6.anInt1685 = arg0 * 4;
		var6.aClass184_1686 = this.aClass_ra_Sub2_7394.aClass184_8606;
		var6.method1862();
	}

	public void method2609(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
	}

	public void method2603(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
	}

	public void method2610(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
	}
}
