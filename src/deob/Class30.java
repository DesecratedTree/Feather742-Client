package deob;

public class Class30 {

	public boolean aBoolean342 = true;

	public int anInt347 = -1;

	public Class_ra_Sub1 aClass_ra_Sub1_341;

	public Class58 aClass58_343;

	public int anInt340;

	public int anInt345;

	public int anInt348;

	public Interface3 anInterface3_349;

	public Class34_Sub1 aClass34_Sub1_350;

	public Class36_Sub1 aClass36_Sub1_346;

	public static int anInt344 = 128;

	public static int anInt351 = 7;

	public Class30(Class_ra_Sub1 arg0, Class58 arg1, Class_xa_Sub1 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		this.aClass_ra_Sub1_341 = arg0;
		this.aClass58_343 = arg1;
		this.anInt340 = arg6;
		this.anInt345 = arg7;
		int var9 = 0x1 << arg5;
		int var10 = 0;
		int var11 = arg3 << arg5;
		int var12 = arg4 << arg5;
		int var14;
		int var15;
		for (int var13 = 0; var13 < var9; var13++) {
			var14 = (var12 + var13) * arg2.anInt6397 + var11;
			for (var15 = 0; var15 < var9; var15++) {
				short[] var16 = arg2.aShortArrayArray8756[var14++];
				if (var16 != null) {
					var10 += var16.length;
				}
			}
		}
		this.anInt348 = var10;
		if (var10 > 0) {
			Buffer var19 = new Buffer(var10 * 2);
			short[] var17;
			int var18;
			int var20;
			if (this.aClass_ra_Sub1_341.aBoolean8407) {
				for (var14 = 0; var14 < var9; var14++) {
					var15 = (var12 + var14) * arg2.anInt6397 + var11;
					for (var20 = 0; var20 < var9; var20++) {
						var17 = arg2.aShortArrayArray8756[var15++];
						if (var17 != null) {
							for (var18 = 0; var18 < var17.length; var18++) {
								var19.addShort(var17[var18] & 0xFFFF, (byte) 54);
							}
						}
					}
				}
			} else {
				for (var14 = 0; var14 < var9; var14++) {
					var15 = (var12 + var14) * arg2.anInt6397 + var11;
					for (var20 = 0; var20 < var9; var20++) {
						var17 = arg2.aShortArrayArray8756[var15++];
						if (var17 != null) {
							for (var18 = 0; var18 < var17.length; var18++) {
								var19.method3742(var17[var18] & 0xFFFF, (short) -3992);
							}
						}
					}
				}
			}
			this.anInterface3_349 = this.aClass_ra_Sub1_341.method4834(5123, var19.payload, var19.offset, false);
			this.aClass34_Sub1_350 = new Class34_Sub1(this.aClass_ra_Sub1_341, 5123, null, 1);
		} else {
			this.aClass36_Sub1_346 = null;
		}
	}

	public void method498() {
		this.method501(this.anInterface3_349, this.anInt348);
	}

	public void method499() {
		if (!this.aBoolean342) {
			return;
		}
		this.aBoolean342 = false;
		byte[] var1 = this.aClass58_343.aByteArray546;
		byte[] var2 = this.aClass_ra_Sub1_341.aByteArray8444;
		int var3 = 0;
		int var4 = this.aClass58_343.anInt544;
		int var5 = this.anInt340 + this.anInt345 * this.aClass58_343.anInt544;
		int var6;
		int var7;
		for (var6 = -128; var6 < 0; var6++) {
			var3 = (var3 << 8) - var3;
			for (var7 = -128; var7 < 0; var7++) {
				if (var1[var5++] != 0) {
					var3++;
				}
			}
			var5 += var4 - 128;
		}
		if (this.aClass36_Sub1_346 != null && this.anInt347 == var3) {
			this.aBoolean342 = false;
			return;
		}
		this.anInt347 = var3;
		var6 = 0;
		var5 = this.anInt340 + this.anInt345 * var4;
		for (var7 = -128; var7 < 0; var7++) {
			for (int var8 = -128; var8 < 0; var8++) {
				if (var1[var5] == 0) {
					int var9 = 0;
					if (var1[var5 - 1] != 0) {
						var9++;
					}
					if (var1[var5 + 1] != 0) {
						var9++;
					}
					if (var1[var5 - var4] != 0) {
						var9++;
					}
					if (var1[var5 + var4] != 0) {
						var9++;
					}
					var2[var6++] = (byte) (var9 * 17);
				} else {
					var2[var6++] = 68;
				}
				var5++;
			}
			var5 += this.aClass58_343.anInt544 - 128;
		}
		if (this.aClass36_Sub1_346 == null) {
			this.aClass36_Sub1_346 = new Class36_Sub1(this.aClass_ra_Sub1_341, 3553, Class72.aClass72_611, Class86.aClass86_714, 128, 128, false, this.aClass_ra_Sub1_341.aByteArray8444, Class72.aClass72_611, false);
			this.aClass36_Sub1_346.method518(false, false);
			this.aClass36_Sub1_346.method515(true);
		} else {
			this.aClass36_Sub1_346.method519(0, 0, 128, 128, this.aClass_ra_Sub1_341.aByteArray8444, Class72.aClass72_611, 0, 0, false);
		}
	}

	public void method500(byte[] arg0, int arg1) {
		this.aClass34_Sub1_350.method42(5123, arg0, arg1 * 2);
		this.method501(this.aClass34_Sub1_350, arg1);
	}

	public void method501(Interface3 arg0, int arg1) {
		if (arg1 != 0) {
			this.method499();
			this.aClass_ra_Sub1_341.method4844(this.aClass36_Sub1_346);
			this.aClass_ra_Sub1_341.method4837(arg0, 4, 0, arg1);
		}
	}
}
