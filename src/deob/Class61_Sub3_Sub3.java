package deob;

public class Class61_Sub3_Sub3 extends Class61_Sub3 {

	public byte[] aByteArray10095;

	public int[] anIntArray10096;

	public void method708(int arg0, int arg1, Class_ta arg2, int arg3, int arg4) {
		if (this.aClass_ra_Sub3_9355.method5187()) {
			throw new IllegalStateException();
		}
		int[] var6 = this.aClass_ra_Sub3_9355.anIntArray8630;
		if (var6 == null) {
			return;
		}
		arg0 += this.anInt9352;
		arg1 += this.anInt9327;
		int var7 = 0;
		int var8 = this.aClass_ra_Sub3_9355.anInt8618 * -29235085 * -1504772933;
		int var9 = this.anInt9358;
		int var10 = this.anInt9325;
		int var11 = var8 - var9;
		int var12 = 0;
		int var13 = arg0 + arg1 * var8;
		int var14;
		if (arg1 < this.aClass_ra_Sub3_9355.anInt8623 * 766013039 * -1679642481) {
			var14 = this.aClass_ra_Sub3_9355.anInt8623 * 766013039 * -1679642481 - arg1;
			var10 -= var14;
			arg1 = this.aClass_ra_Sub3_9355.anInt8623 * 766013039 * -1679642481;
			var7 += var14 * var9;
			var13 += var14 * var8;
		}
		if (arg1 + var10 > this.aClass_ra_Sub3_9355.anInt8624 * -550983163 * 31822541) {
			var10 -= arg1 + var10 - this.aClass_ra_Sub3_9355.anInt8624 * -550983163 * 31822541;
		}
		if (arg0 < this.aClass_ra_Sub3_9355.anInt8621 * 1907727929 * 512290825) {
			var14 = this.aClass_ra_Sub3_9355.anInt8621 * 1907727929 * 512290825 - arg0;
			var9 -= var14;
			arg0 = this.aClass_ra_Sub3_9355.anInt8621 * 1907727929 * 512290825;
			var7 += var14;
			var13 += var14;
			var12 += var14;
			var11 += var14;
		}
		if (arg0 + var9 > this.aClass_ra_Sub3_9355.anInt8635 * -711985315 * -1071049483) {
			var14 = arg0 + var9 - this.aClass_ra_Sub3_9355.anInt8635 * -711985315 * -1071049483;
			var9 -= var14;
			var12 += var14;
			var11 += var14;
		}
		if (var9 <= 0 || var10 <= 0) {
			return;
		}
		Class_ta_Sub3 var26 = (Class_ta_Sub3) arg2;
		int[] var15 = var26.anIntArray8661;
		int[] var16 = var26.anIntArray8662;
		int var17 = arg1;
		if (arg4 > arg1) {
			var17 = arg4;
			var13 += (arg4 - arg1) * var8;
			var7 += (arg4 - arg1) * this.anInt9358;
		}
		int var18 = arg4 + var15.length < arg1 + var10 ? arg4 + var15.length : arg1 + var10;
		for (int var19 = var17; var19 < var18; var19++) {
			int var20 = var15[var19 - arg4] + arg3;
			int var21 = var16[var19 - arg4];
			int var22 = var9;
			int var23;
			if (arg0 > var20) {
				var23 = arg0 - var20;
				if (var23 >= var21) {
					var7 += var9 + var12;
					var13 += var9 + var11;
					continue;
				}
				var21 -= var23;
			} else {
				var23 = var20 - arg0;
				if (var23 >= var9) {
					var7 += var9 + var12;
					var13 += var9 + var11;
					continue;
				}
				var7 += var23;
				var22 = var9 - var23;
				var13 += var23;
			}
			var23 = 0;
			if (var22 < var21) {
				var21 = var22;
			} else {
				var23 = var22 - var21;
			}
			for (int var24 = -var21; var24 < 0; var24++) {
				byte var25 = this.aByteArray10095[var7++];
				if (var25 == 0) {
					var13++;
				} else {
					var6[var13++] = this.anIntArray10096[var25 & 0xFF];
				}
			}
			var7 += var23 + var12;
			var13 += var23 + var11;
		}
	}

	public void method737(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		throw new IllegalStateException();
	}

	public void method722(int arg0, int arg1, int arg2) {
		throw new IllegalStateException();
	}

	public void method685(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (this.aClass_ra_Sub3_9355.method5187()) {
			throw new IllegalStateException();
		}
		int[] var6 = this.aClass_ra_Sub3_9355.anIntArray8630;
		if (var6 == null) {
			return;
		}
		int var7 = this.aClass_ra_Sub3_9355.anInt8618 * -29235085 * -1504772933;
		arg0 += this.anInt9352;
		arg1 += this.anInt9327;
		int var8 = arg1 * var7 + arg0;
		int var9 = 0;
		int var10 = this.anInt9325;
		int var11 = this.anInt9358;
		int var12 = var7 - var11;
		int var13 = 0;
		int var14;
		if (arg1 < this.aClass_ra_Sub3_9355.anInt8623 * 766013039 * -1679642481) {
			var14 = this.aClass_ra_Sub3_9355.anInt8623 * 766013039 * -1679642481 - arg1;
			var10 -= var14;
			arg1 = this.aClass_ra_Sub3_9355.anInt8623 * 766013039 * -1679642481;
			var9 += var14 * var11;
			var8 += var14 * var7;
		}
		if (arg1 + var10 > this.aClass_ra_Sub3_9355.anInt8624 * -550983163 * 31822541) {
			var10 -= arg1 + var10 - this.aClass_ra_Sub3_9355.anInt8624 * -550983163 * 31822541;
		}
		if (arg0 < this.aClass_ra_Sub3_9355.anInt8621 * 1907727929 * 512290825) {
			var14 = this.aClass_ra_Sub3_9355.anInt8621 * 1907727929 * 512290825 - arg0;
			var11 -= var14;
			arg0 = this.aClass_ra_Sub3_9355.anInt8621 * 1907727929 * 512290825;
			var9 += var14;
			var8 += var14;
			var13 += var14;
			var12 += var14;
		}
		if (arg0 + var11 > this.aClass_ra_Sub3_9355.anInt8635 * -711985315 * -1071049483) {
			var14 = arg0 + var11 - this.aClass_ra_Sub3_9355.anInt8635 * -711985315 * -1071049483;
			var11 -= var14;
			var13 += var14;
			var12 += var14;
		}
		if (var11 <= 0 || var10 <= 0) {
			return;
		}
		int var15;
		int var16;
		int var17;
		int var18;
		int var19;
		int var20;
		int var21;
		int var22;
		int var27;
		if (arg4 != 0) {
			int var23;
			int var24;
			int var25;
			int var26;
			byte var28;
			byte var33;
			if (arg4 != 1) {
				if (arg4 != 2) {
					throw new IllegalArgumentException();
				}
				if (arg2 == 1) {
					for (var14 = -var10; var14 < 0; var14++) {
						for (var15 = -var11; var15 < 0; var15++) {
							var28 = this.aByteArray10095[var9++];
							if (var28 == 0) {
								var8++;
							} else {
								var17 = this.anIntArray10096[var28 & 0xFF];
								var18 = var6[var8];
								var19 = var17 + var18;
								var20 = (var17 & 0xFF00FF) + (var18 & 0xFF00FF);
								var18 = (var20 & 0x1000100) + (var19 - var20 & 0x10000);
								var6[var8++] = var19 - var18 | var18 - (var18 >>> 8);
							}
						}
						var8 += var12;
						var9 += var13;
					}
				} else if (arg2 == 0) {
					var14 = arg3 >> 16 & 0xFF;
					var15 = arg3 >> 8 & 0xFF;
					var16 = arg3 & 0xFF;
					for (var17 = -var10; var17 < 0; var17++) {
						for (var18 = -var11; var18 < 0; var18++) {
							byte var34 = this.aByteArray10095[var9++];
							if (var34 == 0) {
								var8++;
							} else {
								var20 = this.anIntArray10096[var34 & 0xFF];
								var21 = (var20 & 0xFF0000) * var14 & 0xFF000000;
								var22 = (var20 & 0xFF00) * var15 & 0xFF0000;
								var23 = (var20 & 0xFF) * var16 & 0xFF00;
								var20 = (var21 | var22 | var23) >>> 8;
								var24 = var6[var8];
								var25 = var20 + var24;
								var26 = (var20 & 0xFF00FF) + (var24 & 0xFF00FF);
								var24 = (var26 & 0x1000100) + (var25 - var26 & 0x10000);
								var6[var8++] = var25 - var24 | var24 - (var24 >>> 8);
							}
						}
						var8 += var12;
						var9 += var13;
					}
				} else if (arg2 == 3) {
					for (var14 = -var10; var14 < 0; var14++) {
						for (var15 = -var11; var15 < 0; var15++) {
							var28 = this.aByteArray10095[var9++];
							var17 = var28 > 0 ? this.anIntArray10096[var28] : 0;
							var18 = var17 + arg3;
							var19 = (var17 & 0xFF00FF) + (arg3 & 0xFF00FF);
							var20 = (var19 & 0x1000100) + (var18 - var19 & 0x10000);
							var17 = var18 - var20 | var20 - (var20 >>> 8);
							var20 = var6[var8];
							var18 = var17 + var20;
							var19 = (var17 & 0xFF00FF) + (var20 & 0xFF00FF);
							var20 = (var19 & 0x1000100) + (var18 - var19 & 0x10000);
							var6[var8++] = var18 - var20 | var20 - (var20 >>> 8);
						}
						var8 += var12;
						var9 += var13;
					}
				} else if (arg2 == 2) {
					var14 = arg3 >>> 24;
					var15 = 256 - var14;
					var16 = (arg3 & 0xFF00FF) * var15 & 0xFF00FF00;
					var17 = (arg3 & 0xFF00) * var15 & 0xFF0000;
					var27 = (var16 | var17) >>> 8;
					for (var18 = -var10; var18 < 0; var18++) {
						for (var19 = -var11; var19 < 0; var19++) {
							var33 = this.aByteArray10095[var9++];
							if (var33 == 0) {
								var8++;
							} else {
								var21 = this.anIntArray10096[var33 & 0xFF];
								var16 = (var21 & 0xFF00FF) * var14 & 0xFF00FF00;
								var17 = (var21 & 0xFF00) * var14 & 0xFF0000;
								var21 = ((var16 | var17) >>> 8) + var27;
								var22 = var6[var8];
								var23 = var21 + var22;
								var24 = (var21 & 0xFF00FF) + (var22 & 0xFF00FF);
								var22 = (var24 & 0x1000100) + (var23 - var24 & 0x10000);
								var6[var8++] = var23 - var22 | var22 - (var22 >>> 8);
							}
						}
						var8 += var12;
						var9 += var13;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg2 == 1) {
				for (var14 = -var10; var14 < 0; var14++) {
					for (var15 = -var11; var15 < 0; var15++) {
						var28 = this.aByteArray10095[var9++];
						if (var28 == 0) {
							var8++;
						} else {
							var17 = this.anIntArray10096[var28 & 0xFF] | 0xFF000000;
							short var29 = 255;
							byte var31 = 0;
							var20 = var6[var8];
							var6[var8++] = ((var17 & 0xFF00FF) * var29 + (var20 & 0xFF00FF) * var31 >> 8 & 0xFFFF00FF) + (((var17 & 0xFF00FF00) >>> 8) * var29 + ((var20 & 0xFF00FF00) >>> 8) * var31 & 0xFF00FF00);
						}
					}
					var8 += var12;
					var9 += var13;
				}
			} else {
				byte var30;
				if (arg2 == 0) {
					if ((arg3 & 0xFFFFFF) == 16777215) {
						var14 = arg3 >>> 24;
						var15 = 256 - var14;
						for (var16 = -var10; var16 < 0; var16++) {
							for (var17 = -var11; var17 < 0; var17++) {
								var30 = this.aByteArray10095[var9++];
								if (var30 == 0) {
									var8++;
								} else {
									var19 = this.anIntArray10096[var30 & 0xFF];
									var20 = var6[var8];
									var6[var8++] = ((var19 & 0xFF00FF) * var14 + (var20 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var19 & 0xFF00) * var14 + (var20 & 0xFF00) * var15 & 0xFF0000) >> 8;
								}
							}
							var8 += var12;
							var9 += var13;
						}
					} else {
						var14 = arg3 >> 16 & 0xFF;
						var15 = arg3 >> 8 & 0xFF;
						var16 = arg3 & 0xFF;
						var17 = arg3 >>> 24;
						var18 = 256 - var17;
						for (var19 = -var10; var19 < 0; var19++) {
							for (var20 = -var11; var20 < 0; var20++) {
								byte var32 = this.aByteArray10095[var9++];
								if (var32 == 0) {
									var8++;
								} else {
									var22 = this.anIntArray10096[var32 & 0xFF];
									if (var17 == 255) {
										var23 = (var22 & 0xFF0000) * var14 & 0xFF000000;
										var24 = (var22 & 0xFF00) * var15 & 0xFF0000;
										var25 = (var22 & 0xFF) * var16 & 0xFF00;
										var6[var8++] = (var23 | var24 | var25) >>> 8;
									} else {
										var23 = (var22 & 0xFF0000) * var14 & 0xFF000000;
										var24 = (var22 & 0xFF00) * var15 & 0xFF0000;
										var25 = (var22 & 0xFF) * var16 & 0xFF00;
										var22 = (var23 | var24 | var25) >>> 8;
										var26 = var6[var8];
										var6[var8++] = ((var22 & 0xFF00FF) * var17 + (var26 & 0xFF00FF) * var18 & 0xFF00FF00) + ((var22 & 0xFF00) * var17 + (var26 & 0xFF00) * var18 & 0xFF0000) >> 8;
									}
								}
							}
							var8 += var12;
							var9 += var13;
						}
					}
				} else if (arg2 == 3) {
					var14 = arg3 >>> 24;
					var15 = 256 - var14;
					for (var16 = -var10; var16 < 0; var16++) {
						for (var17 = -var11; var17 < 0; var17++) {
							var30 = this.aByteArray10095[var9++];
							var19 = var30 > 0 ? this.anIntArray10096[var30] : 0;
							var20 = var19 + arg3;
							var21 = (var19 & 0xFF00FF) + (arg3 & 0xFF00FF);
							var22 = (var21 & 0x1000100) + (var20 - var21 & 0x10000);
							var22 = var20 - var22 | var22 - (var22 >>> 8);
							if (var19 == 0 && var14 != 255) {
								var19 = var22;
								var22 = var6[var8];
								var22 = ((var19 & 0xFF00FF) * var14 + (var22 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var19 & 0xFF00) * var14 + (var22 & 0xFF00) * var15 & 0xFF0000) >> 8;
							}
							var6[var8++] = var22;
						}
						var8 += var12;
						var9 += var13;
					}
				} else if (arg2 == 2) {
					var14 = arg3 >>> 24;
					var15 = 256 - var14;
					var16 = (arg3 & 0xFF00FF) * var15 & 0xFF00FF00;
					var17 = (arg3 & 0xFF00) * var15 & 0xFF0000;
					var27 = (var16 | var17) >>> 8;
					for (var18 = -var10; var18 < 0; var18++) {
						for (var19 = -var11; var19 < 0; var19++) {
							var33 = this.aByteArray10095[var9++];
							if (var33 == 0) {
								var8++;
							} else {
								var21 = this.anIntArray10096[var33 & 0xFF];
								var16 = (var21 & 0xFF00FF) * var14 & 0xFF00FF00;
								var17 = (var21 & 0xFF00) * var14 & 0xFF0000;
								var6[var8++] = ((var16 | var17) >>> 8) + var27;
							}
						}
						var8 += var12;
						var9 += var13;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg2 == 1) {
			for (var14 = -var10; var14 < 0; var14++) {
				var15 = var8 + var11 - 3;
				while (var8 < var15) {
					var6[var8++] = this.anIntArray10096[this.aByteArray10095[var9++] & 0xFF];
					var6[var8++] = this.anIntArray10096[this.aByteArray10095[var9++] & 0xFF];
					var6[var8++] = this.anIntArray10096[this.aByteArray10095[var9++] & 0xFF];
					var6[var8++] = this.anIntArray10096[this.aByteArray10095[var9++] & 0xFF];
				}
				var15 += 3;
				while (var8 < var15) {
					var6[var8++] = this.anIntArray10096[this.aByteArray10095[var9++] & 0xFF];
				}
				var8 += var12;
				var9 += var13;
			}
		} else if (arg2 == 0) {
			var14 = arg3 >> 16 & 0xFF;
			var15 = arg3 >> 8 & 0xFF;
			var16 = arg3 & 0xFF;
			for (var17 = -var10; var17 < 0; var17++) {
				for (var18 = -var11; var18 < 0; var18++) {
					var19 = this.anIntArray10096[this.aByteArray10095[var9++] & 0xFF];
					var20 = (var19 & 0xFF0000) * var14 & 0xFF000000;
					var21 = (var19 & 0xFF00) * var15 & 0xFF0000;
					var22 = (var19 & 0xFF) * var16 & 0xFF00;
					var6[var8++] = (var20 | var21 | var22) >>> 8;
				}
				var8 += var12;
				var9 += var13;
			}
		} else if (arg2 == 3) {
			for (var14 = -var10; var14 < 0; var14++) {
				for (var15 = -var11; var15 < 0; var15++) {
					var16 = this.anIntArray10096[this.aByteArray10095[var9++] & 0xFF];
					var17 = var16 + arg3;
					var18 = (var16 & 0xFF00FF) + (arg3 & 0xFF00FF);
					var19 = (var18 & 0x1000100) + (var17 - var18 & 0x10000);
					var6[var8++] = var17 - var19 | var19 - (var19 >>> 8);
				}
				var8 += var12;
				var9 += var13;
			}
		} else if (arg2 == 2) {
			var14 = arg3 >>> 24;
			var15 = 256 - var14;
			var16 = (arg3 & 0xFF00FF) * var15 & 0xFF00FF00;
			var17 = (arg3 & 0xFF00) * var15 & 0xFF0000;
			var27 = (var16 | var17) >>> 8;
			for (var18 = -var10; var18 < 0; var18++) {
				for (var19 = -var11; var19 < 0; var19++) {
					var20 = this.anIntArray10096[this.aByteArray10095[var9++] & 0xFF];
					var16 = (var20 & 0xFF00FF) * var14 & 0xFF00FF00;
					var17 = (var20 & 0xFF00) * var14 & 0xFF0000;
					var6[var8++] = ((var16 | var17) >>> 8) + var27;
				}
				var8 += var12;
				var9 += var13;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method688(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (this.aClass_ra_Sub3_9355.method5187()) {
			throw new IllegalStateException();
		}
		int[] var6 = this.aClass_ra_Sub3_9355.anIntArray8630;
		if (var6 == null) {
			return;
		}
		int var7 = this.aClass_ra_Sub3_9355.anInt8618;
		arg0 += this.anInt9352;
		arg1 += this.anInt9327;
		int var8 = arg1 * var7 + arg0;
		int var9 = 0;
		int var10 = this.anInt9325;
		int var11 = this.anInt9358;
		int var12 = var7 - var11;
		int var13 = 0;
		int var14;
		if (arg1 < this.aClass_ra_Sub3_9355.anInt8623) {
			var14 = this.aClass_ra_Sub3_9355.anInt8623 - arg1;
			var10 -= var14;
			arg1 = this.aClass_ra_Sub3_9355.anInt8623;
			var9 += var14 * var11;
			var8 += var14 * var7;
		}
		if (arg1 + var10 > this.aClass_ra_Sub3_9355.anInt8624) {
			var10 -= arg1 + var10 - this.aClass_ra_Sub3_9355.anInt8624;
		}
		if (arg0 < this.aClass_ra_Sub3_9355.anInt8621) {
			var14 = this.aClass_ra_Sub3_9355.anInt8621 - arg0;
			var11 -= var14;
			arg0 = this.aClass_ra_Sub3_9355.anInt8621;
			var9 += var14;
			var8 += var14;
			var13 += var14;
			var12 += var14;
		}
		if (arg0 + var11 > this.aClass_ra_Sub3_9355.anInt8635) {
			var14 = arg0 + var11 - this.aClass_ra_Sub3_9355.anInt8635;
			var11 -= var14;
			var13 += var14;
			var12 += var14;
		}
		if (var11 <= 0 || var10 <= 0) {
			return;
		}
		int var15;
		int var16;
		int var17;
		int var18;
		int var19;
		int var20;
		int var21;
		int var22;
		int var27;
		if (arg4 != 0) {
			int var23;
			int var24;
			int var25;
			int var26;
			byte var28;
			byte var33;
			if (arg4 != 1) {
				if (arg4 != 2) {
					throw new IllegalArgumentException();
				}
				if (arg2 == 1) {
					for (var14 = -var10; var14 < 0; var14++) {
						for (var15 = -var11; var15 < 0; var15++) {
							var28 = this.aByteArray10095[var9++];
							if (var28 == 0) {
								var8++;
							} else {
								var17 = this.anIntArray10096[var28 & 0xFF];
								var18 = var6[var8];
								var19 = var17 + var18;
								var20 = (var17 & 0xFF00FF) + (var18 & 0xFF00FF);
								var18 = (var20 & 0x1000100) + (var19 - var20 & 0x10000);
								var6[var8++] = var19 - var18 | var18 - (var18 >>> 8);
							}
						}
						var8 += var12;
						var9 += var13;
					}
				} else if (arg2 == 0) {
					var14 = arg3 >> 16 & 0xFF;
					var15 = arg3 >> 8 & 0xFF;
					var16 = arg3 & 0xFF;
					for (var17 = -var10; var17 < 0; var17++) {
						for (var18 = -var11; var18 < 0; var18++) {
							byte var34 = this.aByteArray10095[var9++];
							if (var34 == 0) {
								var8++;
							} else {
								var20 = this.anIntArray10096[var34 & 0xFF];
								var21 = (var20 & 0xFF0000) * var14 & 0xFF000000;
								var22 = (var20 & 0xFF00) * var15 & 0xFF0000;
								var23 = (var20 & 0xFF) * var16 & 0xFF00;
								var20 = (var21 | var22 | var23) >>> 8;
								var24 = var6[var8];
								var25 = var20 + var24;
								var26 = (var20 & 0xFF00FF) + (var24 & 0xFF00FF);
								var24 = (var26 & 0x1000100) + (var25 - var26 & 0x10000);
								var6[var8++] = var25 - var24 | var24 - (var24 >>> 8);
							}
						}
						var8 += var12;
						var9 += var13;
					}
				} else if (arg2 == 3) {
					for (var14 = -var10; var14 < 0; var14++) {
						for (var15 = -var11; var15 < 0; var15++) {
							var28 = this.aByteArray10095[var9++];
							var17 = var28 > 0 ? this.anIntArray10096[var28] : 0;
							var18 = var17 + arg3;
							var19 = (var17 & 0xFF00FF) + (arg3 & 0xFF00FF);
							var20 = (var19 & 0x1000100) + (var18 - var19 & 0x10000);
							var17 = var18 - var20 | var20 - (var20 >>> 8);
							var20 = var6[var8];
							var18 = var17 + var20;
							var19 = (var17 & 0xFF00FF) + (var20 & 0xFF00FF);
							var20 = (var19 & 0x1000100) + (var18 - var19 & 0x10000);
							var6[var8++] = var18 - var20 | var20 - (var20 >>> 8);
						}
						var8 += var12;
						var9 += var13;
					}
				} else if (arg2 == 2) {
					var14 = arg3 >>> 24;
					var15 = 256 - var14;
					var16 = (arg3 & 0xFF00FF) * var15 & 0xFF00FF00;
					var17 = (arg3 & 0xFF00) * var15 & 0xFF0000;
					var27 = (var16 | var17) >>> 8;
					for (var18 = -var10; var18 < 0; var18++) {
						for (var19 = -var11; var19 < 0; var19++) {
							var33 = this.aByteArray10095[var9++];
							if (var33 == 0) {
								var8++;
							} else {
								var21 = this.anIntArray10096[var33 & 0xFF];
								var16 = (var21 & 0xFF00FF) * var14 & 0xFF00FF00;
								var17 = (var21 & 0xFF00) * var14 & 0xFF0000;
								var21 = ((var16 | var17) >>> 8) + var27;
								var22 = var6[var8];
								var23 = var21 + var22;
								var24 = (var21 & 0xFF00FF) + (var22 & 0xFF00FF);
								var22 = (var24 & 0x1000100) + (var23 - var24 & 0x10000);
								var6[var8++] = var23 - var22 | var22 - (var22 >>> 8);
							}
						}
						var8 += var12;
						var9 += var13;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg2 == 1) {
				for (var14 = -var10; var14 < 0; var14++) {
					for (var15 = -var11; var15 < 0; var15++) {
						var28 = this.aByteArray10095[var9++];
						if (var28 == 0) {
							var8++;
						} else {
							var17 = this.anIntArray10096[var28 & 0xFF] | 0xFF000000;
							short var29 = 255;
							byte var31 = 0;
							var20 = var6[var8];
							var6[var8++] = ((var17 & 0xFF00FF) * var29 + (var20 & 0xFF00FF) * var31 >> 8 & 0xFFFF00FF) + (((var17 & 0xFF00FF00) >>> 8) * var29 + ((var20 & 0xFF00FF00) >>> 8) * var31 & 0xFF00FF00);
						}
					}
					var8 += var12;
					var9 += var13;
				}
			} else {
				byte var30;
				if (arg2 == 0) {
					if ((arg3 & 0xFFFFFF) == 16777215) {
						var14 = arg3 >>> 24;
						var15 = 256 - var14;
						for (var16 = -var10; var16 < 0; var16++) {
							for (var17 = -var11; var17 < 0; var17++) {
								var30 = this.aByteArray10095[var9++];
								if (var30 == 0) {
									var8++;
								} else {
									var19 = this.anIntArray10096[var30 & 0xFF];
									var20 = var6[var8];
									var6[var8++] = ((var19 & 0xFF00FF) * var14 + (var20 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var19 & 0xFF00) * var14 + (var20 & 0xFF00) * var15 & 0xFF0000) >> 8;
								}
							}
							var8 += var12;
							var9 += var13;
						}
					} else {
						var14 = arg3 >> 16 & 0xFF;
						var15 = arg3 >> 8 & 0xFF;
						var16 = arg3 & 0xFF;
						var17 = arg3 >>> 24;
						var18 = 256 - var17;
						for (var19 = -var10; var19 < 0; var19++) {
							for (var20 = -var11; var20 < 0; var20++) {
								byte var32 = this.aByteArray10095[var9++];
								if (var32 == 0) {
									var8++;
								} else {
									var22 = this.anIntArray10096[var32 & 0xFF];
									if (var17 == 255) {
										var23 = (var22 & 0xFF0000) * var14 & 0xFF000000;
										var24 = (var22 & 0xFF00) * var15 & 0xFF0000;
										var25 = (var22 & 0xFF) * var16 & 0xFF00;
										var6[var8++] = (var23 | var24 | var25) >>> 8;
									} else {
										var23 = (var22 & 0xFF0000) * var14 & 0xFF000000;
										var24 = (var22 & 0xFF00) * var15 & 0xFF0000;
										var25 = (var22 & 0xFF) * var16 & 0xFF00;
										var22 = (var23 | var24 | var25) >>> 8;
										var26 = var6[var8];
										var6[var8++] = ((var22 & 0xFF00FF) * var17 + (var26 & 0xFF00FF) * var18 & 0xFF00FF00) + ((var22 & 0xFF00) * var17 + (var26 & 0xFF00) * var18 & 0xFF0000) >> 8;
									}
								}
							}
							var8 += var12;
							var9 += var13;
						}
					}
				} else if (arg2 == 3) {
					var14 = arg3 >>> 24;
					var15 = 256 - var14;
					for (var16 = -var10; var16 < 0; var16++) {
						for (var17 = -var11; var17 < 0; var17++) {
							var30 = this.aByteArray10095[var9++];
							var19 = var30 > 0 ? this.anIntArray10096[var30] : 0;
							var20 = var19 + arg3;
							var21 = (var19 & 0xFF00FF) + (arg3 & 0xFF00FF);
							var22 = (var21 & 0x1000100) + (var20 - var21 & 0x10000);
							var22 = var20 - var22 | var22 - (var22 >>> 8);
							if (var19 == 0 && var14 != 255) {
								var19 = var22;
								var22 = var6[var8];
								var22 = ((var19 & 0xFF00FF) * var14 + (var22 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var19 & 0xFF00) * var14 + (var22 & 0xFF00) * var15 & 0xFF0000) >> 8;
							}
							var6[var8++] = var22;
						}
						var8 += var12;
						var9 += var13;
					}
				} else if (arg2 == 2) {
					var14 = arg3 >>> 24;
					var15 = 256 - var14;
					var16 = (arg3 & 0xFF00FF) * var15 & 0xFF00FF00;
					var17 = (arg3 & 0xFF00) * var15 & 0xFF0000;
					var27 = (var16 | var17) >>> 8;
					for (var18 = -var10; var18 < 0; var18++) {
						for (var19 = -var11; var19 < 0; var19++) {
							var33 = this.aByteArray10095[var9++];
							if (var33 == 0) {
								var8++;
							} else {
								var21 = this.anIntArray10096[var33 & 0xFF];
								var16 = (var21 & 0xFF00FF) * var14 & 0xFF00FF00;
								var17 = (var21 & 0xFF00) * var14 & 0xFF0000;
								var6[var8++] = ((var16 | var17) >>> 8) + var27;
							}
						}
						var8 += var12;
						var9 += var13;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg2 == 1) {
			for (var14 = -var10; var14 < 0; var14++) {
				var15 = var8 + var11 - 3;
				while (var8 < var15) {
					var6[var8++] = this.anIntArray10096[this.aByteArray10095[var9++] & 0xFF];
					var6[var8++] = this.anIntArray10096[this.aByteArray10095[var9++] & 0xFF];
					var6[var8++] = this.anIntArray10096[this.aByteArray10095[var9++] & 0xFF];
					var6[var8++] = this.anIntArray10096[this.aByteArray10095[var9++] & 0xFF];
				}
				var15 += 3;
				while (var8 < var15) {
					var6[var8++] = this.anIntArray10096[this.aByteArray10095[var9++] & 0xFF];
				}
				var8 += var12;
				var9 += var13;
			}
		} else if (arg2 == 0) {
			var14 = arg3 >> 16 & 0xFF;
			var15 = arg3 >> 8 & 0xFF;
			var16 = arg3 & 0xFF;
			for (var17 = -var10; var17 < 0; var17++) {
				for (var18 = -var11; var18 < 0; var18++) {
					var19 = this.anIntArray10096[this.aByteArray10095[var9++] & 0xFF];
					var20 = (var19 & 0xFF0000) * var14 & 0xFF000000;
					var21 = (var19 & 0xFF00) * var15 & 0xFF0000;
					var22 = (var19 & 0xFF) * var16 & 0xFF00;
					var6[var8++] = (var20 | var21 | var22) >>> 8;
				}
				var8 += var12;
				var9 += var13;
			}
		} else if (arg2 == 3) {
			for (var14 = -var10; var14 < 0; var14++) {
				for (var15 = -var11; var15 < 0; var15++) {
					var16 = this.anIntArray10096[this.aByteArray10095[var9++] & 0xFF];
					var17 = var16 + arg3;
					var18 = (var16 & 0xFF00FF) + (arg3 & 0xFF00FF);
					var19 = (var18 & 0x1000100) + (var17 - var18 & 0x10000);
					var6[var8++] = var17 - var19 | var19 - (var19 >>> 8);
				}
				var8 += var12;
				var9 += var13;
			}
		} else if (arg2 == 2) {
			var14 = arg3 >>> 24;
			var15 = 256 - var14;
			var16 = (arg3 & 0xFF00FF) * var15 & 0xFF00FF00;
			var17 = (arg3 & 0xFF00) * var15 & 0xFF0000;
			var27 = (var16 | var17) >>> 8;
			for (var18 = -var10; var18 < 0; var18++) {
				for (var19 = -var11; var19 < 0; var19++) {
					var20 = this.anIntArray10096[this.aByteArray10095[var9++] & 0xFF];
					var16 = (var20 & 0xFF00FF) * var14 & 0xFF00FF00;
					var17 = (var20 & 0xFF00) * var14 & 0xFF0000;
					var6[var8++] = ((var16 | var17) >>> 8) + var27;
				}
				var8 += var12;
				var9 += var13;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method742(boolean arg0, boolean arg1, boolean arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
		if (arg6 <= 0 || arg7 <= 0 || !arg0 && !arg1) {
			return;
		}
		int var14 = 0;
		int var15 = 0;
		int var16 = this.anInt9352 + this.anInt9358 + this.anInt9328;
		int var17 = this.anInt9327 + this.anInt9325 + this.anInt9337;
		int var18 = (var16 << 16) / arg6;
		int var19 = (var17 << 16) / arg7;
		int var20;
		if (this.anInt9352 > 0) {
			var20 = ((this.anInt9352 << 16) + var18 - 1) / var18;
			arg3 += var20;
			var14 += var20 * var18 - (this.anInt9352 << 16);
		}
		if (this.anInt9327 > 0) {
			var20 = ((this.anInt9327 << 16) + var19 - 1) / var19;
			arg4 += var20;
			var15 += var20 * var19 - (this.anInt9327 << 16);
		}
		if (this.anInt9358 < var16) {
			arg6 = ((this.anInt9358 << 16) - var14 + var18 - 1) / var18;
		}
		if (this.anInt9325 < var17) {
			arg7 = ((this.anInt9325 << 16) - var15 + var19 - 1) / var19;
		}
		var20 = arg3 + arg4 * this.aClass_ra_Sub3_9355.anInt8618;
		int var21 = this.aClass_ra_Sub3_9355.anInt8618 - arg6;
		if (arg4 + arg7 > this.aClass_ra_Sub3_9355.anInt8624) {
			arg7 -= arg4 + arg7 - this.aClass_ra_Sub3_9355.anInt8624;
		}
		int var22;
		if (arg4 < this.aClass_ra_Sub3_9355.anInt8623) {
			var22 = this.aClass_ra_Sub3_9355.anInt8623 - arg4;
			arg7 -= var22;
			var20 += var22 * this.aClass_ra_Sub3_9355.anInt8618;
			var15 += var19 * var22;
		}
		if (arg3 + arg6 > this.aClass_ra_Sub3_9355.anInt8635) {
			var22 = arg3 + arg6 - this.aClass_ra_Sub3_9355.anInt8635;
			arg6 -= var22;
			var21 += var22;
		}
		if (arg3 < this.aClass_ra_Sub3_9355.anInt8621) {
			var22 = this.aClass_ra_Sub3_9355.anInt8621 - arg3;
			arg6 -= var22;
			var20 += var22;
			var14 += var18 * var22;
			var21 += var22;
		}
		float[] var40 = this.aClass_ra_Sub3_9355.aFloatArray8620;
		int[] var23 = this.aClass_ra_Sub3_9355.anIntArray8630;
		int var24;
		int var25;
		int var26;
		int var27;
		int var28;
		int var29;
		int var30;
		int var31;
		int var32;
		int var33;
		int var34;
		int var39;
		byte var41;
		if (arg10 != 0) {
			int var35;
			int var36;
			int var37;
			int var38;
			byte var44;
			if (arg10 != 1) {
				if (arg10 != 2) {
					throw new IllegalArgumentException();
				}
				if (arg8 == 1) {
					var24 = var14;
					for (var25 = -arg7; var25 < 0; var25++) {
						var26 = (var15 >> 16) * this.anInt9358;
						for (var27 = -arg6; var27 < 0; var27++) {
							if (!arg1 || arg5 < var40[var20]) {
								var41 = this.aByteArray10095[(var14 >> 16) + var26];
								if (var41 != 0) {
									if (arg0) {
										var29 = this.anIntArray10096[var41 & 0xFF];
										var30 = var23[var20];
										var31 = var29 + var30;
										var32 = (var29 & 0xFF00FF) + (var30 & 0xFF00FF);
										var30 = (var32 & 0x1000100) + (var31 - var32 & 0x10000);
										var23[var20] = var31 - var30 | var30 - (var30 >>> 8);
									}
									if (arg1 && arg12) {
										var40[var20] = arg5;
									}
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var24;
						var20 += var21;
					}
				} else if (arg8 == 0) {
					var24 = var14;
					var25 = arg9 >> 16 & 0xFF;
					var26 = arg9 >> 8 & 0xFF;
					var27 = arg9 & 0xFF;
					for (var28 = -arg7; var28 < 0; var28++) {
						var29 = (var15 >> 16) * this.anInt9358;
						for (var30 = -arg6; var30 < 0; var30++) {
							if (!arg1 || arg5 < var40[var20]) {
								byte var45 = this.aByteArray10095[(var14 >> 16) + var29];
								if (var45 != 0) {
									if (arg0) {
										var32 = this.anIntArray10096[var45 & 0xFF];
										var33 = (var32 & 0xFF0000) * var25 & 0xFF000000;
										var34 = (var32 & 0xFF00) * var26 & 0xFF0000;
										var35 = (var32 & 0xFF) * var27 & 0xFF00;
										var32 = (var33 | var34 | var35) >>> 8;
										var36 = var23[var20];
										var37 = var32 + var36;
										var38 = (var32 & 0xFF00FF) + (var36 & 0xFF00FF);
										var36 = (var38 & 0x1000100) + (var37 - var38 & 0x10000);
										var23[var20] = var37 - var36 | var36 - (var36 >>> 8);
									}
									if (arg1 && arg12) {
										var40[var20] = arg5;
									}
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var24;
						var20 += var21;
					}
				} else if (arg8 == 3) {
					var24 = var14;
					for (var25 = -arg7; var25 < 0; var25++) {
						var26 = (var15 >> 16) * this.anInt9358;
						for (var27 = -arg6; var27 < 0; var27++) {
							if (!arg1 || arg5 < var40[var20]) {
								if (arg0) {
									var41 = this.aByteArray10095[(var14 >> 16) + var26];
									var29 = var41 > 0 ? this.anIntArray10096[var41] : 0;
									var30 = var29 + arg9;
									var31 = (var29 & 0xFF00FF) + (arg9 & 0xFF00FF);
									var32 = (var31 & 0x1000100) + (var30 - var31 & 0x10000);
									var29 = var30 - var32 | var32 - (var32 >>> 8);
									var32 = var23[var20];
									var30 = var29 + var32;
									var31 = (var29 & 0xFF00FF) + (var32 & 0xFF00FF);
									var32 = (var31 & 0x1000100) + (var30 - var31 & 0x10000);
									var23[var20] = var30 - var32 | var32 - (var32 >>> 8);
								}
								if (arg1 && arg12) {
									var40[var20] = arg5;
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var24;
						var20 += var21;
					}
				} else if (arg8 == 2) {
					var24 = arg9 >>> 24;
					var25 = 256 - var24;
					var26 = (arg9 & 0xFF00FF) * var25 & 0xFF00FF00;
					var27 = (arg9 & 0xFF00) * var25 & 0xFF0000;
					var39 = (var26 | var27) >>> 8;
					var28 = var14;
					for (var29 = -arg7; var29 < 0; var29++) {
						var30 = (var15 >> 16) * this.anInt9358;
						for (var31 = -arg6; var31 < 0; var31++) {
							if (!arg1 || arg5 < var40[var20]) {
								var44 = this.aByteArray10095[(var14 >> 16) + var30];
								if (var44 != 0) {
									if (arg0) {
										var33 = this.anIntArray10096[var44 & 0xFF];
										var26 = (var33 & 0xFF00FF) * var24 & 0xFF00FF00;
										var27 = (var33 & 0xFF00) * var24 & 0xFF0000;
										var33 = ((var26 | var27) >>> 8) + var39;
										var34 = var23[var20];
										var35 = var33 + var34;
										var36 = (var33 & 0xFF00FF) + (var34 & 0xFF00FF);
										var34 = (var36 & 0x1000100) + (var35 - var36 & 0x10000);
										var23[var20] = var35 - var34 | var34 - (var34 >>> 8);
									}
									if (arg1 && arg12) {
										var40[var20] = arg5;
									}
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var28;
						var20 += var21;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg8 == 1) {
				var24 = var14;
				for (var25 = -arg7; var25 < 0; var25++) {
					var26 = (var15 >> 16) * this.anInt9358;
					for (var27 = -arg6; var27 < 0; var27++) {
						if (!arg1 || arg5 < var40[var20]) {
							var41 = this.aByteArray10095[(var14 >> 16) + var26];
							if (var41 != 0) {
								if (arg0) {
									var23[var20] = this.anIntArray10096[var41 & 0xFF];
								}
								if (arg1 && arg12) {
									var40[var20] = arg5;
								}
							}
						}
						var14 += var18;
						var20++;
					}
					var15 += var19;
					var14 = var24;
					var20 += var21;
				}
			} else {
				byte var42;
				if (arg8 == 0) {
					var24 = var14;
					if ((arg9 & 0xFFFFFF) == 16777215) {
						var25 = arg9 >>> 24;
						var26 = 256 - var25;
						for (var27 = -arg7; var27 < 0; var27++) {
							var28 = (var15 >> 16) * this.anInt9358;
							for (var29 = -arg6; var29 < 0; var29++) {
								if (!arg1 || arg5 < var40[var20]) {
									var42 = this.aByteArray10095[(var14 >> 16) + var28];
									if (var42 != 0) {
										if (arg0) {
											var31 = this.anIntArray10096[var42 & 0xFF];
											var32 = var23[var20];
											var23[var20] = ((var31 & 0xFF00FF) * var25 + (var32 & 0xFF00FF) * var26 & 0xFF00FF00) + ((var31 & 0xFF00) * var25 + (var32 & 0xFF00) * var26 & 0xFF0000) >> 8;
										}
										if (arg1 && arg12) {
											var40[var20] = arg5;
										}
									}
								}
								var14 += var18;
								var20++;
							}
							var15 += var19;
							var14 = var24;
							var20 += var21;
						}
					} else {
						var25 = arg9 >> 16 & 0xFF;
						var26 = arg9 >> 8 & 0xFF;
						var27 = arg9 & 0xFF;
						var28 = arg9 >>> 24;
						var29 = 256 - var28;
						for (var30 = -arg7; var30 < 0; var30++) {
							var31 = (var15 >> 16) * this.anInt9358;
							for (var32 = -arg6; var32 < 0; var32++) {
								if (!arg1 || arg5 < var40[var20]) {
									byte var43 = this.aByteArray10095[(var14 >> 16) + var31];
									if (var43 != 0) {
										var34 = this.anIntArray10096[var43 & 0xFF];
										if (var28 == 255) {
											if (arg0) {
												var35 = (var34 & 0xFF0000) * var25 & 0xFF000000;
												var36 = (var34 & 0xFF00) * var26 & 0xFF0000;
												var37 = (var34 & 0xFF) * var27 & 0xFF00;
												var23[var20] = (var35 | var36 | var37) >>> 8;
											}
											if (arg1 && arg12) {
												var40[var20] = arg5;
											}
										} else {
											if (arg0) {
												var35 = (var34 & 0xFF0000) * var25 & 0xFF000000;
												var36 = (var34 & 0xFF00) * var26 & 0xFF0000;
												var37 = (var34 & 0xFF) * var27 & 0xFF00;
												var34 = (var35 | var36 | var37) >>> 8;
												var38 = var23[var20];
												var23[var20] = ((var34 & 0xFF00FF) * var28 + (var38 & 0xFF00FF) * var29 & 0xFF00FF00) + ((var34 & 0xFF00) * var28 + (var38 & 0xFF00) * var29 & 0xFF0000) >> 8;
											}
											if (arg1 && arg12) {
												var40[var20] = arg5;
											}
										}
									}
								}
								var14 += var18;
								var20++;
							}
							var15 += var19;
							var14 = var24;
							var20 += var21;
						}
					}
				} else if (arg8 == 3) {
					var24 = var14;
					var25 = arg9 >>> 24;
					var26 = 256 - var25;
					for (var27 = -arg7; var27 < 0; var27++) {
						var28 = (var15 >> 16) * this.anInt9358;
						for (var29 = -arg6; var29 < 0; var29++) {
							if (!arg1 || arg5 < var40[var20]) {
								if (arg0) {
									var42 = this.aByteArray10095[(var14 >> 16) + var28];
									var31 = var42 > 0 ? this.anIntArray10096[var42] : 0;
									var32 = var31 + arg9;
									var33 = (var31 & 0xFF00FF) + (arg9 & 0xFF00FF);
									var34 = (var33 & 0x1000100) + (var32 - var33 & 0x10000);
									var34 = var32 - var34 | var34 - (var34 >>> 8);
									if (var31 == 0 && var25 != 255) {
										var31 = var34;
										var34 = var23[var20];
										var34 = ((var31 & 0xFF00FF) * var25 + (var34 & 0xFF00FF) * var26 & 0xFF00FF00) + ((var31 & 0xFF00) * var25 + (var34 & 0xFF00) * var26 & 0xFF0000) >> 8;
									}
									var23[var20] = var34;
								}
								if (arg1 && arg12) {
									var40[var20] = arg5;
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var24;
						var20 += var21;
					}
				} else if (arg8 == 2) {
					var24 = arg9 >>> 24;
					var25 = 256 - var24;
					var26 = (arg9 & 0xFF00FF) * var25 & 0xFF00FF00;
					var27 = (arg9 & 0xFF00) * var25 & 0xFF0000;
					var39 = (var26 | var27) >>> 8;
					var28 = var14;
					for (var29 = -arg7; var29 < 0; var29++) {
						var30 = (var15 >> 16) * this.anInt9358;
						for (var31 = -arg6; var31 < 0; var31++) {
							if (!arg1 || arg5 < var40[var20]) {
								var44 = this.aByteArray10095[(var14 >> 16) + var30];
								if (var44 != 0) {
									if (arg0) {
										var33 = this.anIntArray10096[var44 & 0xFF];
										var26 = (var33 & 0xFF00FF) * var24 & 0xFF00FF00;
										var27 = (var33 & 0xFF00) * var24 & 0xFF0000;
										var23[var20] = ((var26 | var27) >>> 8) + var39;
									}
									if (arg1 && arg12) {
										var40[var20] = arg5;
									}
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var28;
						var20 += var21;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg8 == 1) {
			var24 = var14;
			for (var25 = -arg7; var25 < 0; var25++) {
				var26 = (var15 >> 16) * this.anInt9358;
				for (var27 = -arg6; var27 < 0; var27++) {
					if (!arg1 || arg5 < var40[var20]) {
						if (arg0) {
							var23[var20] = this.anIntArray10096[this.aByteArray10095[(var14 >> 16) + var26] & 0xFF];
						}
						if (arg1 && arg12) {
							var40[var20] = arg5;
						}
					}
					var14 += var18;
					var20++;
				}
				var15 += var19;
				var14 = var24;
				var20 += var21;
			}
		} else if (arg8 == 0) {
			var24 = arg9 >> 16 & 0xFF;
			var25 = arg9 >> 8 & 0xFF;
			var26 = arg9 & 0xFF;
			var27 = var14;
			for (var28 = -arg7; var28 < 0; var28++) {
				var29 = (var15 >> 16) * this.anInt9358;
				for (var30 = -arg6; var30 < 0; var30++) {
					if (!arg1 || arg5 < var40[var20]) {
						if (arg0) {
							var31 = this.anIntArray10096[this.aByteArray10095[(var14 >> 16) + var29] & 0xFF];
							var32 = (var31 & 0xFF0000) * var24 & 0xFF000000;
							var33 = (var31 & 0xFF00) * var25 & 0xFF0000;
							var34 = (var31 & 0xFF) * var26 & 0xFF00;
							var23[var20] = (var32 | var33 | var34) >>> 8;
						}
						if (arg1 && arg12) {
							var40[var20] = arg5;
						}
					}
					var14 += var18;
					var20++;
				}
				var15 += var19;
				var14 = var27;
				var20 += var21;
			}
		} else if (arg8 == 3) {
			var24 = var14;
			for (var25 = -arg7; var25 < 0; var25++) {
				var26 = (var15 >> 16) * this.anInt9358;
				for (var27 = -arg6; var27 < 0; var27++) {
					if (!arg1 || arg5 < var40[var20]) {
						if (arg0) {
							var41 = this.aByteArray10095[(var14 >> 16) + var26];
							var29 = var41 > 0 ? this.anIntArray10096[var41] : 0;
							var30 = var29 + arg9;
							var31 = (var29 & 0xFF00FF) + (arg9 & 0xFF00FF);
							var32 = (var31 & 0x1000100) + (var30 - var31 & 0x10000);
							var23[var20] = var30 - var32 | var32 - (var32 >>> 8);
						}
						if (arg1 && arg12) {
							var40[var20] = arg5;
						}
					}
					var14 += var18;
					var20++;
				}
				var15 += var19;
				var14 = var24;
				var20 += var21;
			}
		} else if (arg8 == 2) {
			var24 = arg9 >>> 24;
			var25 = 256 - var24;
			var26 = (arg9 & 0xFF00FF) * var25 & 0xFF00FF00;
			var27 = (arg9 & 0xFF00) * var25 & 0xFF0000;
			var39 = (var26 | var27) >>> 8;
			var28 = var14;
			for (var29 = -arg7; var29 < 0; var29++) {
				var30 = (var15 >> 16) * this.anInt9358;
				for (var31 = -arg6; var31 < 0; var31++) {
					if (!arg1 || arg5 < var40[var20]) {
						if (arg0) {
							var32 = this.anIntArray10096[this.aByteArray10095[(var14 >> 16) + var30] & 0xFF];
							var26 = (var32 & 0xFF00FF) * var24 & 0xFF00FF00;
							var27 = (var32 & 0xFF00) * var24 & 0xFF0000;
							var23[var20] = ((var26 | var27) >>> 8) + var39;
						}
						if (arg1 && arg12) {
							var40[var20] = arg5;
						}
					}
					var14 += var18;
					var20++;
				}
				var15 += var19;
				var14 = var28;
				var20 += var21;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	public Interface8_Impl1_Impl2 method678() {
		throw new IllegalStateException();
	}

	public Interface8_Impl1_Impl2 method729() {
		throw new IllegalStateException();
	}

	public void method736(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (this.aClass_ra_Sub3_9355.method5187()) {
			throw new IllegalStateException();
		} else if (arg2 > 0 && arg3 > 0) {
			int[] var9 = this.aClass_ra_Sub3_9355.anIntArray8630;
			if (var9 != null) {
				int var10 = 0;
				int var11 = 0;
				int var12 = this.aClass_ra_Sub3_9355.anInt8618;
				int var13 = this.anInt9352 + this.anInt9358 + this.anInt9328;
				int var14 = this.anInt9327 + this.anInt9325 + this.anInt9337;
				int var15 = (var13 << 16) / arg2;
				int var16 = (var14 << 16) / arg3;
				int var17;
				if (this.anInt9352 > 0) {
					var17 = ((this.anInt9352 << 16) + var15 - 1) / var15;
					arg0 += var17;
					var10 += var17 * var15 - (this.anInt9352 << 16);
				}
				if (this.anInt9327 > 0) {
					var17 = ((this.anInt9327 << 16) + var16 - 1) / var16;
					arg1 += var17;
					var11 += var17 * var16 - (this.anInt9327 << 16);
				}
				if (this.anInt9358 < var13) {
					arg2 = ((this.anInt9358 << 16) - var10 + var15 - 1) / var15;
				}
				if (this.anInt9325 < var14) {
					arg3 = ((this.anInt9325 << 16) - var11 + var16 - 1) / var16;
				}
				var17 = arg0 + arg1 * var12;
				int var18 = var12 - arg2;
				if (arg1 + arg3 > this.aClass_ra_Sub3_9355.anInt8624) {
					arg3 -= arg1 + arg3 - this.aClass_ra_Sub3_9355.anInt8624;
				}
				int var19;
				if (arg1 < this.aClass_ra_Sub3_9355.anInt8623) {
					var19 = this.aClass_ra_Sub3_9355.anInt8623 - arg1;
					arg3 -= var19;
					var17 += var19 * var12;
					var11 += var16 * var19;
				}
				if (arg0 + arg2 > this.aClass_ra_Sub3_9355.anInt8635) {
					var19 = arg0 + arg2 - this.aClass_ra_Sub3_9355.anInt8635;
					arg2 -= var19;
					var18 += var19;
				}
				if (arg0 < this.aClass_ra_Sub3_9355.anInt8621) {
					var19 = this.aClass_ra_Sub3_9355.anInt8621 - arg0;
					arg2 -= var19;
					var17 += var19;
					var10 += var15 * var19;
					var18 += var19;
				}
				int var20;
				int var21;
				int var22;
				int var23;
				int var24;
				int var25;
				int var26;
				int var27;
				int var28;
				int var29;
				int var34;
				byte var35;
				if (arg6 != 0) {
					int var30;
					int var31;
					int var32;
					int var33;
					byte var38;
					if (arg6 != 1) {
						if (arg6 != 2) {
							throw new IllegalArgumentException();
						}
						if (arg4 == 1) {
							var19 = var10;
							for (var20 = -arg3; var20 < 0; var20++) {
								var21 = (var11 >> 16) * this.anInt9358;
								for (var22 = -arg2; var22 < 0; var22++) {
									var35 = this.aByteArray10095[(var10 >> 16) + var21];
									if (var35 == 0) {
										var17++;
									} else {
										var24 = this.anIntArray10096[var35 & 0xFF];
										var25 = var9[var17];
										var26 = var24 + var25;
										var27 = (var24 & 0xFF00FF) + (var25 & 0xFF00FF);
										var25 = (var27 & 0x1000100) + (var26 - var27 & 0x10000);
										var9[var17++] = var26 - var25 | var25 - (var25 >>> 8);
									}
									var10 += var15;
								}
								var11 += var16;
								var10 = var19;
								var17 += var18;
							}
						} else if (arg4 == 0) {
							var19 = var10;
							var20 = arg5 >> 16 & 0xFF;
							var21 = arg5 >> 8 & 0xFF;
							var22 = arg5 & 0xFF;
							for (var23 = -arg3; var23 < 0; var23++) {
								var24 = (var11 >> 16) * this.anInt9358;
								for (var25 = -arg2; var25 < 0; var25++) {
									byte var39 = this.aByteArray10095[(var10 >> 16) + var24];
									if (var39 == 0) {
										var17++;
									} else {
										var27 = this.anIntArray10096[var39 & 0xFF];
										var28 = (var27 & 0xFF0000) * var20 & 0xFF000000;
										var29 = (var27 & 0xFF00) * var21 & 0xFF0000;
										var30 = (var27 & 0xFF) * var22 & 0xFF00;
										var27 = (var28 | var29 | var30) >>> 8;
										var31 = var9[var17];
										var32 = var27 + var31;
										var33 = (var27 & 0xFF00FF) + (var31 & 0xFF00FF);
										var31 = (var33 & 0x1000100) + (var32 - var33 & 0x10000);
										var9[var17++] = var32 - var31 | var31 - (var31 >>> 8);
									}
									var10 += var15;
								}
								var11 += var16;
								var10 = var19;
								var17 += var18;
							}
						} else if (arg4 == 3) {
							var19 = var10;
							for (var20 = -arg3; var20 < 0; var20++) {
								var21 = (var11 >> 16) * this.anInt9358;
								for (var22 = -arg2; var22 < 0; var22++) {
									var35 = this.aByteArray10095[(var10 >> 16) + var21];
									var24 = var35 > 0 ? this.anIntArray10096[var35] : 0;
									var25 = var24 + arg5;
									var26 = (var24 & 0xFF00FF) + (arg5 & 0xFF00FF);
									var27 = (var26 & 0x1000100) + (var25 - var26 & 0x10000);
									var24 = var25 - var27 | var27 - (var27 >>> 8);
									var27 = var9[var17];
									var25 = var24 + var27;
									var26 = (var24 & 0xFF00FF) + (var27 & 0xFF00FF);
									var27 = (var26 & 0x1000100) + (var25 - var26 & 0x10000);
									var9[var17++] = var25 - var27 | var27 - (var27 >>> 8);
									var10 += var15;
								}
								var11 += var16;
								var10 = var19;
								var17 += var18;
							}
						} else if (arg4 == 2) {
							var19 = arg5 >>> 24;
							var20 = 256 - var19;
							var21 = (arg5 & 0xFF00FF) * var20 & 0xFF00FF00;
							var22 = (arg5 & 0xFF00) * var20 & 0xFF0000;
							var34 = (var21 | var22) >>> 8;
							var23 = var10;
							for (var24 = -arg3; var24 < 0; var24++) {
								var25 = (var11 >> 16) * this.anInt9358;
								for (var26 = -arg2; var26 < 0; var26++) {
									var38 = this.aByteArray10095[(var10 >> 16) + var25];
									if (var38 == 0) {
										var17++;
									} else {
										var28 = this.anIntArray10096[var38 & 0xFF];
										var21 = (var28 & 0xFF00FF) * var19 & 0xFF00FF00;
										var22 = (var28 & 0xFF00) * var19 & 0xFF0000;
										var28 = ((var21 | var22) >>> 8) + var34;
										var29 = var9[var17];
										var30 = var28 + var29;
										var31 = (var28 & 0xFF00FF) + (var29 & 0xFF00FF);
										var29 = (var31 & 0x1000100) + (var30 - var31 & 0x10000);
										var9[var17++] = var30 - var29 | var29 - (var29 >>> 8);
									}
									var10 += var15;
								}
								var11 += var16;
								var10 = var23;
								var17 += var18;
							}
						} else {
							throw new IllegalArgumentException();
						}
					} else if (arg4 == 1) {
						var19 = var10;
						for (var20 = -arg3; var20 < 0; var20++) {
							var21 = (var11 >> 16) * this.anInt9358;
							for (var22 = -arg2; var22 < 0; var22++) {
								var35 = this.aByteArray10095[(var10 >> 16) + var21];
								if (var35 == 0) {
									var17++;
								} else {
									var9[var17++] = this.anIntArray10096[var35 & 0xFF];
								}
								var10 += var15;
							}
							var11 += var16;
							var10 = var19;
							var17 += var18;
						}
					} else {
						byte var36;
						if (arg4 == 0) {
							var19 = var10;
							if ((arg5 & 0xFFFFFF) == 16777215) {
								var20 = arg5 >>> 24;
								var21 = 256 - var20;
								for (var22 = -arg3; var22 < 0; var22++) {
									var23 = (var11 >> 16) * this.anInt9358;
									for (var24 = -arg2; var24 < 0; var24++) {
										var36 = this.aByteArray10095[(var10 >> 16) + var23];
										if (var36 == 0) {
											var17++;
										} else {
											var26 = this.anIntArray10096[var36 & 0xFF];
											var27 = var9[var17];
											var9[var17++] = ((var26 & 0xFF00FF) * var20 + (var27 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var26 & 0xFF00) * var20 + (var27 & 0xFF00) * var21 & 0xFF0000) >> 8;
										}
										var10 += var15;
									}
									var11 += var16;
									var10 = var19;
									var17 += var18;
								}
							} else {
								var20 = arg5 >> 16 & 0xFF;
								var21 = arg5 >> 8 & 0xFF;
								var22 = arg5 & 0xFF;
								var23 = arg5 >>> 24;
								var24 = 256 - var23;
								for (var25 = -arg3; var25 < 0; var25++) {
									var26 = (var11 >> 16) * this.anInt9358;
									for (var27 = -arg2; var27 < 0; var27++) {
										byte var37 = this.aByteArray10095[(var10 >> 16) + var26];
										if (var37 == 0) {
											var17++;
										} else {
											var29 = this.anIntArray10096[var37 & 0xFF];
											if (var23 == 255) {
												var30 = (var29 & 0xFF0000) * var20 & 0xFF000000;
												var31 = (var29 & 0xFF00) * var21 & 0xFF0000;
												var32 = (var29 & 0xFF) * var22 & 0xFF00;
												var9[var17++] = (var30 | var31 | var32) >>> 8;
											} else {
												var30 = (var29 & 0xFF0000) * var20 & 0xFF000000;
												var31 = (var29 & 0xFF00) * var21 & 0xFF0000;
												var32 = (var29 & 0xFF) * var22 & 0xFF00;
												var29 = (var30 | var31 | var32) >>> 8;
												var33 = var9[var17];
												var9[var17++] = ((var29 & 0xFF00FF) * var23 + (var33 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var29 & 0xFF00) * var23 + (var33 & 0xFF00) * var24 & 0xFF0000) >> 8;
											}
										}
										var10 += var15;
									}
									var11 += var16;
									var10 = var19;
									var17 += var18;
								}
							}
						} else if (arg4 == 3) {
							var19 = var10;
							var20 = arg5 >>> 24;
							var21 = 256 - var20;
							for (var22 = -arg3; var22 < 0; var22++) {
								var23 = (var11 >> 16) * this.anInt9358;
								for (var24 = -arg2; var24 < 0; var24++) {
									var36 = this.aByteArray10095[(var10 >> 16) + var23];
									var26 = var36 > 0 ? this.anIntArray10096[var36] : 0;
									var27 = var26 + arg5;
									var28 = (var26 & 0xFF00FF) + (arg5 & 0xFF00FF);
									var29 = (var28 & 0x1000100) + (var27 - var28 & 0x10000);
									var29 = var27 - var29 | var29 - (var29 >>> 8);
									if (var26 == 0 && var20 != 255) {
										var26 = var29;
										var29 = var9[var17];
										var29 = ((var26 & 0xFF00FF) * var20 + (var29 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var26 & 0xFF00) * var20 + (var29 & 0xFF00) * var21 & 0xFF0000) >> 8;
									}
									var9[var17++] = var29;
									var10 += var15;
								}
								var11 += var16;
								var10 = var19;
								var17 += var18;
							}
						} else if (arg4 == 2) {
							var19 = arg5 >>> 24;
							var20 = 256 - var19;
							var21 = (arg5 & 0xFF00FF) * var20 & 0xFF00FF00;
							var22 = (arg5 & 0xFF00) * var20 & 0xFF0000;
							var34 = (var21 | var22) >>> 8;
							var23 = var10;
							for (var24 = -arg3; var24 < 0; var24++) {
								var25 = (var11 >> 16) * this.anInt9358;
								for (var26 = -arg2; var26 < 0; var26++) {
									var38 = this.aByteArray10095[(var10 >> 16) + var25];
									if (var38 == 0) {
										var17++;
									} else {
										var28 = this.anIntArray10096[var38 & 0xFF];
										var21 = (var28 & 0xFF00FF) * var19 & 0xFF00FF00;
										var22 = (var28 & 0xFF00) * var19 & 0xFF0000;
										var9[var17++] = ((var21 | var22) >>> 8) + var34;
									}
									var10 += var15;
								}
								var11 += var16;
								var10 = var23;
								var17 += var18;
							}
						} else {
							throw new IllegalArgumentException();
						}
					}
				} else if (arg4 == 1) {
					var19 = var10;
					for (var20 = -arg3; var20 < 0; var20++) {
						var21 = (var11 >> 16) * this.anInt9358;
						for (var22 = -arg2; var22 < 0; var22++) {
							var9[var17++] = this.anIntArray10096[this.aByteArray10095[(var10 >> 16) + var21] & 0xFF];
							var10 += var15;
						}
						var11 += var16;
						var10 = var19;
						var17 += var18;
					}
				} else if (arg4 == 0) {
					var19 = arg5 >> 16 & 0xFF;
					var20 = arg5 >> 8 & 0xFF;
					var21 = arg5 & 0xFF;
					var22 = var10;
					for (var23 = -arg3; var23 < 0; var23++) {
						var24 = (var11 >> 16) * this.anInt9358;
						for (var25 = -arg2; var25 < 0; var25++) {
							var26 = this.anIntArray10096[this.aByteArray10095[(var10 >> 16) + var24] & 0xFF];
							var27 = (var26 & 0xFF0000) * var19 & 0xFF000000;
							var28 = (var26 & 0xFF00) * var20 & 0xFF0000;
							var29 = (var26 & 0xFF) * var21 & 0xFF00;
							var9[var17++] = (var27 | var28 | var29) >>> 8;
							var10 += var15;
						}
						var11 += var16;
						var10 = var22;
						var17 += var18;
					}
				} else if (arg4 == 3) {
					var19 = var10;
					for (var20 = -arg3; var20 < 0; var20++) {
						var21 = (var11 >> 16) * this.anInt9358;
						for (var22 = -arg2; var22 < 0; var22++) {
							var35 = this.aByteArray10095[(var10 >> 16) + var21];
							var24 = var35 > 0 ? this.anIntArray10096[var35] : 0;
							var25 = var24 + arg5;
							var26 = (var24 & 0xFF00FF) + (arg5 & 0xFF00FF);
							var27 = (var26 & 0x1000100) + (var25 - var26 & 0x10000);
							var9[var17++] = var25 - var27 | var27 - (var27 >>> 8);
							var10 += var15;
						}
						var11 += var16;
						var10 = var19;
						var17 += var18;
					}
				} else if (arg4 == 2) {
					var19 = arg5 >>> 24;
					var20 = 256 - var19;
					var21 = (arg5 & 0xFF00FF) * var20 & 0xFF00FF00;
					var22 = (arg5 & 0xFF00) * var20 & 0xFF0000;
					var34 = (var21 | var22) >>> 8;
					var23 = var10;
					for (var24 = -arg3; var24 < 0; var24++) {
						var25 = (var11 >> 16) * this.anInt9358;
						for (var26 = -arg2; var26 < 0; var26++) {
							var27 = this.anIntArray10096[this.aByteArray10095[(var10 >> 16) + var25] & 0xFF];
							var21 = (var27 & 0xFF00FF) * var19 & 0xFF00FF00;
							var22 = (var27 & 0xFF00) * var19 & 0xFF0000;
							var9[var17++] = ((var21 | var22) >>> 8) + var34;
							var10 += var15;
						}
						var11 += var16;
						var10 = var23;
						var17 += var18;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		}
	}

	public void method745(int[] arg0, int[] arg1, int arg2, int arg3) {
		int[] var5 = this.aClass_ra_Sub3_9355.anIntArray8630;
		if (var5 == null) {
			return;
		}
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		byte var16;
		int var23;
		if (anInt9340 == 0) {
			if (anInt9341 == 0) {
				var6 = anInt9356;
				while (var6 < 0) {
					var7 = var6 + arg3;
					if (var7 >= 0) {
						if (var7 >= arg0.length) {
							break;
						}
						var8 = anInt9339;
						var9 = anInt9346;
						var10 = anInt9324;
						var11 = anInt9347;
						if (var9 >= 0 && var10 >= 0 && var9 - (this.anInt9358 << 12) < 0 && var10 - (this.anInt9325 << 12) < 0) {
							var12 = arg0[var7] - arg2;
							var13 = -arg1[var7];
							var14 = var12 - (var8 - anInt9339);
							if (var14 > 0) {
								var8 += var14;
								var11 += var14;
								var9 += anInt9340 * var14;
								var10 += anInt9341 * var14;
							} else {
								var13 -= var14;
							}
							if (var11 < var13) {
								var11 = var13;
							}
							while (var11 < 0) {
								byte var15 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
								if (var15 == 0) {
									var8++;
								} else {
									var5[var8++] = this.anIntArray10096[var15 & 0xFF];
								}
								var11++;
							}
						}
					}
					var6++;
					anInt9339 += anInt9338;
				}
			} else if (anInt9341 < 0) {
				var6 = anInt9356;
				while (var6 < 0) {
					var7 = var6 + arg3;
					if (var7 >= 0) {
						if (var7 >= arg0.length) {
							break;
						}
						var8 = anInt9339;
						var9 = anInt9346;
						var10 = anInt9324 + anInt9349;
						var11 = anInt9347;
						if (var9 >= 0 && var9 - (this.anInt9358 << 12) < 0) {
							int var17;
							if ((var17 = var10 - (this.anInt9325 << 12)) >= 0) {
								var12 = (anInt9341 - var17) / anInt9341;
								var11 += var12;
								var10 += anInt9341 * var12;
								var8 += var12;
							}
							int var18;
							if ((var18 = (var10 - anInt9341) / anInt9341) > var11) {
								var11 = var18;
							}
							var13 = arg0[var7] - arg2;
							var14 = -arg1[var7];
							var23 = var13 - (var8 - anInt9339);
							if (var23 > 0) {
								var8 += var23;
								var11 += var23;
								var9 += anInt9340 * var23;
								var10 += anInt9341 * var23;
							} else {
								var14 -= var23;
							}
							if (var11 < var14) {
								var11 = var14;
							}
							while (var11 < 0) {
								var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
								if (var16 == 0) {
									var8++;
								} else {
									var5[var8++] = this.anIntArray10096[var16 & 0xFF];
								}
								var10 += anInt9341;
								var11++;
							}
						}
					}
					var6++;
					anInt9346 += anInt9342;
					anInt9339 += anInt9338;
				}
			} else {
				var6 = anInt9356;
				while (var6 < 0) {
					var7 = var6 + arg3;
					if (var7 >= 0) {
						if (var7 >= arg0.length) {
							break;
						}
						var8 = anInt9339;
						var9 = anInt9346;
						var10 = anInt9324 + anInt9349;
						var11 = anInt9347;
						if (var9 >= 0 && var9 - (this.anInt9358 << 12) < 0) {
							if (var10 < 0) {
								var12 = (anInt9341 - 1 - var10) / anInt9341;
								var11 += var12;
								var10 += anInt9341 * var12;
								var8 += var12;
							}
							int var19;
							if ((var19 = (var10 + 1 - (this.anInt9325 << 12) - anInt9341) / anInt9341) > var11) {
								var11 = var19;
							}
							var13 = arg0[var7] - arg2;
							var14 = -arg1[var7];
							var23 = var13 - (var8 - anInt9339);
							if (var23 > 0) {
								var8 += var23;
								var11 += var23;
								var9 += anInt9340 * var23;
								var10 += anInt9341 * var23;
							} else {
								var14 -= var23;
							}
							if (var11 < var14) {
								var11 = var14;
							}
							while (var11 < 0) {
								var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
								if (var16 == 0) {
									var8++;
								} else {
									var5[var8++] = this.anIntArray10096[var16 & 0xFF];
								}
								var10 += anInt9341;
								var11++;
							}
						}
					}
					var6++;
					anInt9346 += anInt9342;
					anInt9339 += anInt9338;
				}
			}
		} else if (anInt9340 < 0) {
			if (anInt9341 == 0) {
				var6 = anInt9356;
				while (var6 < 0) {
					var7 = var6 + arg3;
					if (var7 >= 0) {
						if (var7 >= arg0.length) {
							break;
						}
						var8 = anInt9339;
						var9 = anInt9346 + anInt9348;
						var10 = anInt9324;
						var11 = anInt9347;
						if (var10 >= 0 && var10 - (this.anInt9325 << 12) < 0) {
							int var20;
							if ((var20 = var9 - (this.anInt9358 << 12)) >= 0) {
								var12 = (anInt9340 - var20) / anInt9340;
								var11 += var12;
								var9 += anInt9340 * var12;
								var8 += var12;
							}
							int var21;
							if ((var21 = (var9 - anInt9340) / anInt9340) > var11) {
								var11 = var21;
							}
							var13 = arg0[var7] - arg2;
							var14 = -arg1[var7];
							var23 = var13 - (var8 - anInt9339);
							if (var23 > 0) {
								var8 += var23;
								var11 += var23;
								var9 += anInt9340 * var23;
								var10 += anInt9341 * var23;
							} else {
								var14 -= var23;
							}
							if (var11 < var14) {
								var11 = var14;
							}
							while (var11 < 0) {
								var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
								if (var16 == 0) {
									var8++;
								} else {
									var5[var8++] = this.anIntArray10096[var16 & 0xFF];
								}
								var9 += anInt9340;
								var11++;
							}
						}
					}
					var6++;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else if (anInt9341 < 0) {
				var6 = anInt9356;
				while (var6 < 0) {
					var7 = var6 + arg3;
					if (var7 >= 0) {
						if (var7 >= arg0.length) {
							break;
						}
						var8 = anInt9339;
						var9 = anInt9346 + anInt9348;
						var10 = anInt9324 + anInt9349;
						var11 = anInt9347;
						int var22;
						if ((var22 = var9 - (this.anInt9358 << 12)) >= 0) {
							var12 = (anInt9340 - var22) / anInt9340;
							var11 += var12;
							var9 += anInt9340 * var12;
							var10 += anInt9341 * var12;
							var8 += var12;
						}
						int var24;
						if ((var24 = (var9 - anInt9340) / anInt9340) > var11) {
							var11 = var24;
						}
						int var25;
						if ((var25 = var10 - (this.anInt9325 << 12)) >= 0) {
							var12 = (anInt9341 - var25) / anInt9341;
							var11 += var12;
							var9 += anInt9340 * var12;
							var10 += anInt9341 * var12;
							var8 += var12;
						}
						int var26;
						if ((var26 = (var10 - anInt9341) / anInt9341) > var11) {
							var11 = var26;
						}
						var13 = arg0[var7] - arg2;
						var14 = -arg1[var7];
						var23 = var13 - (var8 - anInt9339);
						if (var23 > 0) {
							var8 += var23;
							var11 += var23;
							var9 += anInt9340 * var23;
							var10 += anInt9341 * var23;
						} else {
							var14 -= var23;
						}
						if (var11 < var14) {
							var11 = var14;
						}
						while (var11 < 0) {
							var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
							if (var16 == 0) {
								var8++;
							} else {
								var5[var8++] = this.anIntArray10096[var16 & 0xFF];
							}
							var9 += anInt9340;
							var10 += anInt9341;
							var11++;
						}
					}
					var6++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else {
				var6 = anInt9356;
				while (var6 < 0) {
					var7 = var6 + arg3;
					if (var7 >= 0) {
						if (var7 >= arg0.length) {
							break;
						}
						var8 = anInt9339;
						var9 = anInt9346 + anInt9348;
						var10 = anInt9324 + anInt9349;
						var11 = anInt9347;
						int var27;
						if ((var27 = var9 - (this.anInt9358 << 12)) >= 0) {
							var12 = (anInt9340 - var27) / anInt9340;
							var11 += var12;
							var9 += anInt9340 * var12;
							var10 += anInt9341 * var12;
							var8 += var12;
						}
						int var28;
						if ((var28 = (var9 - anInt9340) / anInt9340) > var11) {
							var11 = var28;
						}
						if (var10 < 0) {
							var12 = (anInt9341 - 1 - var10) / anInt9341;
							var11 += var12;
							var9 += anInt9340 * var12;
							var10 += anInt9341 * var12;
							var8 += var12;
						}
						int var29;
						if ((var29 = (var10 + 1 - (this.anInt9325 << 12) - anInt9341) / anInt9341) > var11) {
							var11 = var29;
						}
						var13 = arg0[var7] - arg2;
						var14 = -arg1[var7];
						var23 = var13 - (var8 - anInt9339);
						if (var23 > 0) {
							var8 += var23;
							var11 += var23;
							var9 += anInt9340 * var23;
							var10 += anInt9341 * var23;
						} else {
							var14 -= var23;
						}
						if (var11 < var14) {
							var11 = var14;
						}
						while (var11 < 0) {
							var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
							if (var16 == 0) {
								var8++;
							} else {
								var5[var8++] = this.anIntArray10096[var16 & 0xFF];
							}
							var9 += anInt9340;
							var10 += anInt9341;
							var11++;
						}
					}
					var6++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			}
		} else if (anInt9341 == 0) {
			var6 = anInt9356;
			while (var6 < 0) {
				var7 = var6 + arg3;
				if (var7 >= 0) {
					if (var7 >= arg0.length) {
						break;
					}
					var8 = anInt9339;
					var9 = anInt9346 + anInt9348;
					var10 = anInt9324;
					var11 = anInt9347;
					if (var10 >= 0 && var10 - (this.anInt9325 << 12) < 0) {
						if (var9 < 0) {
							var12 = (anInt9340 - 1 - var9) / anInt9340;
							var11 += var12;
							var9 += anInt9340 * var12;
							var8 += var12;
						}
						int var30;
						if ((var30 = (var9 + 1 - (this.anInt9358 << 12) - anInt9340) / anInt9340) > var11) {
							var11 = var30;
						}
						var13 = arg0[var7] - arg2;
						var14 = -arg1[var7];
						var23 = var13 - (var8 - anInt9339);
						if (var23 > 0) {
							var8 += var23;
							var11 += var23;
							var9 += anInt9340 * var23;
							var10 += anInt9341 * var23;
						} else {
							var14 -= var23;
						}
						if (var11 < var14) {
							var11 = var14;
						}
						while (var11 < 0) {
							var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
							if (var16 == 0) {
								var8++;
							} else {
								var5[var8++] = this.anIntArray10096[var16 & 0xFF];
							}
							var9 += anInt9340;
							var11++;
						}
					}
				}
				var6++;
				anInt9346 += anInt9342;
				anInt9324 += anInt9343;
				anInt9339 += anInt9338;
			}
		} else if (anInt9341 < 0) {
			var6 = anInt9356;
			while (var6 < 0) {
				var7 = var6 + arg3;
				if (var7 >= 0) {
					if (var7 >= arg0.length) {
						break;
					}
					var8 = anInt9339;
					var9 = anInt9346 + anInt9348;
					var10 = anInt9324 + anInt9349;
					var11 = anInt9347;
					if (var9 < 0) {
						var12 = (anInt9340 - 1 - var9) / anInt9340;
						var11 += var12;
						var9 += anInt9340 * var12;
						var10 += anInt9341 * var12;
						var8 += var12;
					}
					int var31;
					if ((var31 = (var9 + 1 - (this.anInt9358 << 12) - anInt9340) / anInt9340) > var11) {
						var11 = var31;
					}
					int var32;
					if ((var32 = var10 - (this.anInt9325 << 12)) >= 0) {
						var12 = (anInt9341 - var32) / anInt9341;
						var11 += var12;
						var9 += anInt9340 * var12;
						var10 += anInt9341 * var12;
						var8 += var12;
					}
					int var33;
					if ((var33 = (var10 - anInt9341) / anInt9341) > var11) {
						var11 = var33;
					}
					var13 = arg0[var7] - arg2;
					var14 = -arg1[var7];
					var23 = var13 - (var8 - anInt9339);
					if (var23 > 0) {
						var8 += var23;
						var11 += var23;
						var9 += anInt9340 * var23;
						var10 += anInt9341 * var23;
					} else {
						var14 -= var23;
					}
					if (var11 < var14) {
						var11 = var14;
					}
					while (var11 < 0) {
						var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
						if (var16 == 0) {
							var8++;
						} else {
							var5[var8++] = this.anIntArray10096[var16 & 0xFF];
						}
						var9 += anInt9340;
						var10 += anInt9341;
						var11++;
					}
				}
				var6++;
				anInt9346 += anInt9342;
				anInt9324 += anInt9343;
				anInt9339 += anInt9338;
			}
		} else {
			var6 = anInt9356;
			while (var6 < 0) {
				var7 = var6 + arg3;
				if (var7 >= 0) {
					if (var7 >= arg0.length) {
						break;
					}
					var8 = anInt9339;
					var9 = anInt9346 + anInt9348;
					var10 = anInt9324 + anInt9349;
					var11 = anInt9347;
					if (var9 < 0) {
						var12 = (anInt9340 - 1 - var9) / anInt9340;
						var11 += var12;
						var9 += anInt9340 * var12;
						var10 += anInt9341 * var12;
						var8 += var12;
					}
					int var34;
					if ((var34 = (var9 + 1 - (this.anInt9358 << 12) - anInt9340) / anInt9340) > var11) {
						var11 = var34;
					}
					if (var10 < 0) {
						var12 = (anInt9341 - 1 - var10) / anInt9341;
						var11 += var12;
						var9 += anInt9340 * var12;
						var10 += anInt9341 * var12;
						var8 += var12;
					}
					int var35;
					if ((var35 = (var10 + 1 - (this.anInt9325 << 12) - anInt9341) / anInt9341) > var11) {
						var11 = var35;
					}
					var13 = arg0[var7] - arg2;
					var14 = -arg1[var7];
					var23 = var13 - (var8 - anInt9339);
					if (var23 > 0) {
						var8 += var23;
						var11 += var23;
						var9 += anInt9340 * var23;
						var10 += anInt9341 * var23;
					} else {
						var14 -= var23;
					}
					if (var11 < var14) {
						var11 = var14;
					}
					while (var11 < 0) {
						var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
						if (var16 == 0) {
							var8++;
						} else {
							var5[var8++] = this.anIntArray10096[var16 & 0xFF];
						}
						var9 += anInt9340;
						var10 += anInt9341;
						var11++;
					}
				}
				var6++;
				anInt9346 += anInt9342;
				anInt9324 += anInt9343;
				anInt9339 += anInt9338;
			}
		}
	}

	public void method689(int arg0, int arg1, Class_ta arg2, int arg3, int arg4) {
		if (this.aClass_ra_Sub3_9355.method5187()) {
			throw new IllegalStateException();
		}
		int[] var6 = this.aClass_ra_Sub3_9355.anIntArray8630;
		if (var6 == null) {
			return;
		}
		arg0 += this.anInt9352;
		arg1 += this.anInt9327;
		int var7 = 0;
		int var8 = this.aClass_ra_Sub3_9355.anInt8618;
		int var9 = this.anInt9358;
		int var10 = this.anInt9325;
		int var11 = var8 - var9;
		int var12 = 0;
		int var13 = arg0 + arg1 * var8;
		int var14;
		if (arg1 < this.aClass_ra_Sub3_9355.anInt8623) {
			var14 = this.aClass_ra_Sub3_9355.anInt8623 - arg1;
			var10 -= var14;
			arg1 = this.aClass_ra_Sub3_9355.anInt8623;
			var7 += var14 * var9;
			var13 += var14 * var8;
		}
		if (arg1 + var10 > this.aClass_ra_Sub3_9355.anInt8624) {
			var10 -= arg1 + var10 - this.aClass_ra_Sub3_9355.anInt8624;
		}
		if (arg0 < this.aClass_ra_Sub3_9355.anInt8621) {
			var14 = this.aClass_ra_Sub3_9355.anInt8621 - arg0;
			var9 -= var14;
			arg0 = this.aClass_ra_Sub3_9355.anInt8621;
			var7 += var14;
			var13 += var14;
			var12 += var14;
			var11 += var14;
		}
		if (arg0 + var9 > this.aClass_ra_Sub3_9355.anInt8635) {
			var14 = arg0 + var9 - this.aClass_ra_Sub3_9355.anInt8635;
			var9 -= var14;
			var12 += var14;
			var11 += var14;
		}
		if (var9 <= 0 || var10 <= 0) {
			return;
		}
		Class_ta_Sub3 var26 = (Class_ta_Sub3) arg2;
		int[] var15 = var26.anIntArray8661;
		int[] var16 = var26.anIntArray8662;
		int var17 = arg1;
		if (arg4 > arg1) {
			var17 = arg4;
			var13 += (arg4 - arg1) * var8;
			var7 += (arg4 - arg1) * this.anInt9358;
		}
		int var18 = arg4 + var15.length < arg1 + var10 ? arg4 + var15.length : arg1 + var10;
		for (int var19 = var17; var19 < var18; var19++) {
			int var20 = var15[var19 - arg4] + arg3;
			int var21 = var16[var19 - arg4];
			int var22 = var9;
			int var23;
			if (arg0 > var20) {
				var23 = arg0 - var20;
				if (var23 >= var21) {
					var7 += var9 + var12;
					var13 += var9 + var11;
					continue;
				}
				var21 -= var23;
			} else {
				var23 = var20 - arg0;
				if (var23 >= var9) {
					var7 += var9 + var12;
					var13 += var9 + var11;
					continue;
				}
				var7 += var23;
				var22 = var9 - var23;
				var13 += var23;
			}
			var23 = 0;
			if (var22 < var21) {
				var21 = var22;
			} else {
				var23 = var22 - var21;
			}
			for (int var24 = -var21; var24 < 0; var24++) {
				byte var25 = this.aByteArray10095[var7++];
				if (var25 == 0) {
					var13++;
				} else {
					var6[var13++] = this.anIntArray10096[var25 & 0xFF];
				}
			}
			var7 += var23 + var12;
			var13 += var23 + var11;
		}
	}

	public void method705(int arg0, int arg1, int arg2) {
		throw new IllegalStateException();
	}

	public Interface8_Impl1_Impl2 method713() {
		throw new IllegalStateException();
	}

	public void method756(int arg0, int arg1) {
		int[] var3 = this.aClass_ra_Sub3_9355.anIntArray8630;
		if (var3 == null) {
			return;
		}
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var15;
		int var16;
		int var17;
		int var18;
		int var19;
		byte var37;
		if (anInt9340 == 0) {
			if (anInt9341 == 0) {
				var4 = anInt9356;
				while (var4 < 0) {
					var5 = anInt9339;
					var6 = anInt9346;
					var7 = anInt9324;
					var8 = anInt9347;
					if (var6 >= 0 && var7 >= 0 && var6 - (this.anInt9358 << 12) < 0 && var7 - (this.anInt9325 << 12) < 0) {
						while (var8 < 0) {
							var9 = (var7 >> 12) * this.anInt9358 + (var6 >> 12);
							var10 = var5++;
							if (arg1 != 0) {
								byte var26;
								if (arg1 != 1) {
									if (arg1 != 2) {
										throw new IllegalArgumentException();
									}
									if (arg0 == 1) {
										var26 = this.aByteArray10095[var9];
										if (var26 != 0) {
											var12 = this.anIntArray10096[var26 & 0xFF];
											var13 = var3[var10];
											var14 = var12 + var13;
											var15 = (var12 & 0xFF00FF) + (var13 & 0xFF00FF);
											var13 = (var15 & 0x1000100) + (var14 - var15 & 0x10000);
											var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
										}
									} else if (arg0 == 0) {
										var26 = this.aByteArray10095[var9];
										if (var26 != 0) {
											var12 = this.anIntArray10096[var26 & 0xFF];
											var13 = (var12 & 0xFF0000) * anInt9353 & 0xFF000000;
											var14 = (var12 & 0xFF00) * anInt9354 & 0xFF0000;
											var15 = (var12 & 0xFF) * anInt9333 & 0xFF00;
											var12 = (var13 | var14 | var15) >>> 8;
											var16 = var3[var10];
											var17 = var12 + var16;
											var18 = (var12 & 0xFF00FF) + (var16 & 0xFF00FF);
											var16 = (var18 & 0x1000100) + (var17 - var18 & 0x10000);
											var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
										}
									} else if (arg0 == 3) {
										var26 = this.aByteArray10095[var9];
										var12 = var26 > 0 ? this.anIntArray10096[var26] : 0;
										var13 = anInt9350;
										var14 = var12 + var13;
										var15 = (var12 & 0xFF00FF) + (var13 & 0xFF00FF);
										var16 = (var15 & 0x1000100) + (var14 - var15 & 0x10000);
										var16 = var14 - var16 | var16 - (var16 >>> 8);
										if (var12 == 0 && anInt9351 != 255) {
											var12 = var16;
											var16 = var3[var10];
											var16 = ((var12 & 0xFF00FF) * anInt9351 + (var16 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var12 & 0xFF00) * anInt9351 + (var16 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
										}
										var3[var10] = var16;
									} else if (arg0 == 2) {
										var26 = this.aByteArray10095[var9];
										if (var26 != 0) {
											var12 = this.anIntArray10096[var26 & 0xFF];
											var13 = (var12 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
											var14 = (var12 & 0xFF00) * anInt9351 & 0xFF0000;
											var12 = ((var13 | var14) >>> 8) + anInt9323;
											var15 = var3[var10];
											var16 = var12 + var15;
											var17 = (var12 & 0xFF00FF) + (var15 & 0xFF00FF);
											var15 = (var17 & 0x1000100) + (var16 - var17 & 0x10000);
											var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
										}
									}
								} else if (arg0 == 1) {
									var26 = this.aByteArray10095[var9];
									if (var26 != 0) {
										var3[var10] = this.anIntArray10096[var26 & 0xFF];
									}
								} else if (arg0 == 0) {
									var26 = this.aByteArray10095[var9];
									if (var26 != 0) {
										var12 = this.anIntArray10096[var26 & 0xFF];
										if ((anInt9350 & 0xFFFFFF) == 16777215) {
											var13 = anInt9350 >>> 24;
											var14 = 256 - var13;
											var15 = var3[var10];
											var3[var10] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
										} else if (anInt9351 == 255) {
											var13 = (var12 & 0xFF0000) * anInt9353 & 0xFF000000;
											var14 = (var12 & 0xFF00) * anInt9354 & 0xFF0000;
											var15 = (var12 & 0xFF) * anInt9333 & 0xFF00;
											var3[var10] = (var13 | var14 | var15) >>> 8;
										} else {
											var13 = (var12 & 0xFF0000) * anInt9353 & 0xFF000000;
											var14 = (var12 & 0xFF00) * anInt9354 & 0xFF0000;
											var15 = (var12 & 0xFF) * anInt9333 & 0xFF00;
											var12 = (var13 | var14 | var15) >>> 8;
											var16 = var3[var10];
											var3[var10] = ((var12 & 0xFF00FF) * anInt9351 + (var16 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var12 & 0xFF00) * anInt9351 + (var16 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
										}
									}
								} else if (arg0 == 3) {
									var26 = this.aByteArray10095[var9];
									var12 = var26 > 0 ? this.anIntArray10096[var26] : 0;
									var13 = anInt9350;
									var14 = var12 + var13;
									var15 = (var12 & 0xFF00FF) + (var13 & 0xFF00FF);
									var16 = (var15 & 0x1000100) + (var14 - var15 & 0x10000);
									var16 = var14 - var16 | var16 - (var16 >>> 8);
									if (var12 == 0 && anInt9351 != 255) {
										var12 = var16;
										var16 = var3[var10];
										var16 = ((var12 & 0xFF00FF) * anInt9351 + (var16 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var12 & 0xFF00) * anInt9351 + (var16 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
									}
									var3[var10] = var16;
								} else if (arg0 == 2) {
									var26 = this.aByteArray10095[var9];
									if (var26 != 0) {
										var12 = this.anIntArray10096[var26 & 0xFF];
										var13 = (var12 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
										var14 = (var12 & 0xFF00) * anInt9351 & 0xFF0000;
										var3[var10++] = ((var13 | var14) >>> 8) + anInt9323;
									}
								} else {
									throw new IllegalArgumentException();
								}
							} else if (arg0 == 1) {
								var3[var10] = this.anIntArray10096[this.aByteArray10095[var9] & 0xFF];
							} else if (arg0 == 0) {
								var11 = this.anIntArray10096[this.aByteArray10095[var9] & 0xFF];
								var12 = (var11 & 0xFF0000) * anInt9353 & 0xFF000000;
								var13 = (var11 & 0xFF00) * anInt9354 & 0xFF0000;
								var14 = (var11 & 0xFF) * anInt9333 & 0xFF00;
								var3[var10] = (var12 | var13 | var14) >>> 8;
							} else if (arg0 == 3) {
								var11 = this.anIntArray10096[this.aByteArray10095[var9] & 0xFF];
								var12 = anInt9350;
								var13 = var11 + var12;
								var14 = (var11 & 0xFF00FF) + (var12 & 0xFF00FF);
								var15 = (var14 & 0x1000100) + (var13 - var14 & 0x10000);
								var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
							} else if (arg0 == 2) {
								var11 = this.anIntArray10096[this.aByteArray10095[var9] & 0xFF];
								var12 = (var11 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
								var13 = (var11 & 0xFF00) * anInt9351 & 0xFF0000;
								var3[var10] = ((var12 | var13) >>> 8) + anInt9323;
							} else {
								throw new IllegalArgumentException();
							}
							var8++;
						}
					}
					var4++;
					anInt9339 += anInt9338;
				}
			} else if (anInt9341 < 0) {
				var4 = anInt9356;
				while (var4 < 0) {
					var5 = anInt9339;
					var6 = anInt9346;
					var7 = anInt9324 + anInt9349;
					var8 = anInt9347;
					if (var6 >= 0 && var6 - (this.anInt9358 << 12) < 0) {
						int var20;
						if ((var20 = var7 - (this.anInt9325 << 12)) >= 0) {
							var9 = (anInt9341 - var20) / anInt9341;
							var8 += var9;
							var7 += anInt9341 * var9;
							var5 += var9;
						}
						int var21;
						if ((var21 = (var7 - anInt9341) / anInt9341) > var8) {
							var8 = var21;
						}
						while (var8 < 0) {
							var10 = (var7 >> 12) * this.anInt9358 + (var6 >> 12);
							var11 = var5++;
							if (arg1 == 0) {
								if (arg0 == 1) {
									var3[var11] = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								} else if (arg0 == 0) {
									var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
									var13 = (var12 & 0xFF0000) * anInt9353 & 0xFF000000;
									var14 = (var12 & 0xFF00) * anInt9354 & 0xFF0000;
									var15 = (var12 & 0xFF) * anInt9333 & 0xFF00;
									var3[var11] = (var13 | var14 | var15) >>> 8;
								} else if (arg0 == 3) {
									var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
									var13 = anInt9350;
									var14 = var12 + var13;
									var15 = (var12 & 0xFF00FF) + (var13 & 0xFF00FF);
									var16 = (var15 & 0x1000100) + (var14 - var15 & 0x10000);
									var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
								} else if (arg0 == 2) {
									var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
									var13 = (var12 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
									var14 = (var12 & 0xFF00) * anInt9351 & 0xFF0000;
									var3[var11] = ((var13 | var14) >>> 8) + anInt9323;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (arg1 != 1) {
								if (arg1 != 2) {
									throw new IllegalArgumentException();
								}
								if (arg0 == 1) {
									var37 = this.aByteArray10095[var10];
									if (var37 != 0) {
										var13 = this.anIntArray10096[var37 & 0xFF];
										var14 = var3[var11];
										var15 = var13 + var14;
										var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
										var14 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
										var3[var11] = var15 - var14 | var14 - (var14 >>> 8);
									}
								} else if (arg0 == 0) {
									var37 = this.aByteArray10095[var10];
									if (var37 != 0) {
										var13 = this.anIntArray10096[var37 & 0xFF];
										var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
										var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
										var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
										var13 = (var14 | var15 | var16) >>> 8;
										var17 = var3[var11];
										var18 = var13 + var17;
										var19 = (var13 & 0xFF00FF) + (var17 & 0xFF00FF);
										var17 = (var19 & 0x1000100) + (var18 - var19 & 0x10000);
										var3[var11] = var18 - var17 | var17 - (var17 >>> 8);
									}
								} else if (arg0 == 3) {
									var37 = this.aByteArray10095[var10];
									var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
									var14 = anInt9350;
									var15 = var13 + var14;
									var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
									var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
									var17 = var15 - var17 | var17 - (var17 >>> 8);
									if (var13 == 0 && anInt9351 != 255) {
										var13 = var17;
										var17 = var3[var11];
										var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
									}
									var3[var11] = var17;
								} else if (arg0 == 2) {
									var37 = this.aByteArray10095[var10];
									if (var37 != 0) {
										var13 = this.anIntArray10096[var37 & 0xFF];
										var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
										var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
										var13 = ((var14 | var15) >>> 8) + anInt9323;
										var16 = var3[var11];
										var17 = var13 + var16;
										var18 = (var13 & 0xFF00FF) + (var16 & 0xFF00FF);
										var16 = (var18 & 0x1000100) + (var17 - var18 & 0x10000);
										var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
									}
								}
							} else if (arg0 == 1) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var3[var11] = this.anIntArray10096[var37 & 0xFF];
								}
							} else if (arg0 == 0) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									if ((anInt9350 & 0xFFFFFF) == 16777215) {
										var14 = anInt9350 >>> 24;
										var15 = 256 - var14;
										var16 = var3[var11];
										var3[var11] = ((var13 & 0xFF00FF) * var14 + (var16 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var13 & 0xFF00) * var14 + (var16 & 0xFF00) * var15 & 0xFF0000) >> 8;
									} else if (anInt9351 == 255) {
										var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
										var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
										var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
										var3[var11] = (var14 | var15 | var16) >>> 8;
									} else {
										var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
										var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
										var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
										var13 = (var14 | var15 | var16) >>> 8;
										var17 = var3[var11];
										var3[var11] = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								var37 = this.aByteArray10095[var10];
								var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
								var14 = anInt9350;
								var15 = var13 + var14;
								var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
								var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
								var17 = var15 - var17 | var17 - (var17 >>> 8);
								if (var13 == 0 && anInt9351 != 255) {
									var13 = var17;
									var17 = var3[var11];
									var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
								}
								var3[var11] = var17;
							} else if (arg0 == 2) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
									var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
									var3[var11++] = ((var14 | var15) >>> 8) + anInt9323;
								}
							} else {
								throw new IllegalArgumentException();
							}
							var7 += anInt9341;
							var8++;
						}
					}
					var4++;
					anInt9346 += anInt9342;
					anInt9339 += anInt9338;
				}
			} else {
				var4 = anInt9356;
				while (var4 < 0) {
					var5 = anInt9339;
					var6 = anInt9346;
					var7 = anInt9324 + anInt9349;
					var8 = anInt9347;
					if (var6 >= 0 && var6 - (this.anInt9358 << 12) < 0) {
						if (var7 < 0) {
							var9 = (anInt9341 - 1 - var7) / anInt9341;
							var8 += var9;
							var7 += anInt9341 * var9;
							var5 += var9;
						}
						int var22;
						if ((var22 = (var7 + 1 - (this.anInt9325 << 12) - anInt9341) / anInt9341) > var8) {
							var8 = var22;
						}
						while (var8 < 0) {
							var10 = (var7 >> 12) * this.anInt9358 + (var6 >> 12);
							var11 = var5++;
							if (arg1 == 0) {
								if (arg0 == 1) {
									var3[var11] = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								} else if (arg0 == 0) {
									var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
									var13 = (var12 & 0xFF0000) * anInt9353 & 0xFF000000;
									var14 = (var12 & 0xFF00) * anInt9354 & 0xFF0000;
									var15 = (var12 & 0xFF) * anInt9333 & 0xFF00;
									var3[var11] = (var13 | var14 | var15) >>> 8;
								} else if (arg0 == 3) {
									var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
									var13 = anInt9350;
									var14 = var12 + var13;
									var15 = (var12 & 0xFF00FF) + (var13 & 0xFF00FF);
									var16 = (var15 & 0x1000100) + (var14 - var15 & 0x10000);
									var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
								} else if (arg0 == 2) {
									var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
									var13 = (var12 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
									var14 = (var12 & 0xFF00) * anInt9351 & 0xFF0000;
									var3[var11] = ((var13 | var14) >>> 8) + anInt9323;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (arg1 != 1) {
								if (arg1 != 2) {
									throw new IllegalArgumentException();
								}
								if (arg0 == 1) {
									var37 = this.aByteArray10095[var10];
									if (var37 != 0) {
										var13 = this.anIntArray10096[var37 & 0xFF];
										var14 = var3[var11];
										var15 = var13 + var14;
										var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
										var14 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
										var3[var11] = var15 - var14 | var14 - (var14 >>> 8);
									}
								} else if (arg0 == 0) {
									var37 = this.aByteArray10095[var10];
									if (var37 != 0) {
										var13 = this.anIntArray10096[var37 & 0xFF];
										var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
										var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
										var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
										var13 = (var14 | var15 | var16) >>> 8;
										var17 = var3[var11];
										var18 = var13 + var17;
										var19 = (var13 & 0xFF00FF) + (var17 & 0xFF00FF);
										var17 = (var19 & 0x1000100) + (var18 - var19 & 0x10000);
										var3[var11] = var18 - var17 | var17 - (var17 >>> 8);
									}
								} else if (arg0 == 3) {
									var37 = this.aByteArray10095[var10];
									var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
									var14 = anInt9350;
									var15 = var13 + var14;
									var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
									var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
									var17 = var15 - var17 | var17 - (var17 >>> 8);
									if (var13 == 0 && anInt9351 != 255) {
										var13 = var17;
										var17 = var3[var11];
										var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
									}
									var3[var11] = var17;
								} else if (arg0 == 2) {
									var37 = this.aByteArray10095[var10];
									if (var37 != 0) {
										var13 = this.anIntArray10096[var37 & 0xFF];
										var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
										var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
										var13 = ((var14 | var15) >>> 8) + anInt9323;
										var16 = var3[var11];
										var17 = var13 + var16;
										var18 = (var13 & 0xFF00FF) + (var16 & 0xFF00FF);
										var16 = (var18 & 0x1000100) + (var17 - var18 & 0x10000);
										var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
									}
								}
							} else if (arg0 == 1) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var3[var11] = this.anIntArray10096[var37 & 0xFF];
								}
							} else if (arg0 == 0) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									if ((anInt9350 & 0xFFFFFF) == 16777215) {
										var14 = anInt9350 >>> 24;
										var15 = 256 - var14;
										var16 = var3[var11];
										var3[var11] = ((var13 & 0xFF00FF) * var14 + (var16 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var13 & 0xFF00) * var14 + (var16 & 0xFF00) * var15 & 0xFF0000) >> 8;
									} else if (anInt9351 == 255) {
										var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
										var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
										var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
										var3[var11] = (var14 | var15 | var16) >>> 8;
									} else {
										var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
										var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
										var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
										var13 = (var14 | var15 | var16) >>> 8;
										var17 = var3[var11];
										var3[var11] = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								var37 = this.aByteArray10095[var10];
								var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
								var14 = anInt9350;
								var15 = var13 + var14;
								var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
								var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
								var17 = var15 - var17 | var17 - (var17 >>> 8);
								if (var13 == 0 && anInt9351 != 255) {
									var13 = var17;
									var17 = var3[var11];
									var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
								}
								var3[var11] = var17;
							} else if (arg0 == 2) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
									var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
									var3[var11++] = ((var14 | var15) >>> 8) + anInt9323;
								}
							} else {
								throw new IllegalArgumentException();
							}
							var7 += anInt9341;
							var8++;
						}
					}
					var4++;
					anInt9346 += anInt9342;
					anInt9339 += anInt9338;
				}
			}
		} else if (anInt9340 < 0) {
			if (anInt9341 == 0) {
				var4 = anInt9356;
				while (var4 < 0) {
					var5 = anInt9339;
					var6 = anInt9346 + anInt9348;
					var7 = anInt9324;
					var8 = anInt9347;
					if (var7 >= 0 && var7 - (this.anInt9325 << 12) < 0) {
						int var23;
						if ((var23 = var6 - (this.anInt9358 << 12)) >= 0) {
							var9 = (anInt9340 - var23) / anInt9340;
							var8 += var9;
							var6 += anInt9340 * var9;
							var5 += var9;
						}
						int var24;
						if ((var24 = (var6 - anInt9340) / anInt9340) > var8) {
							var8 = var24;
						}
						while (var8 < 0) {
							var10 = (var7 >> 12) * this.anInt9358 + (var6 >> 12);
							var11 = var5++;
							if (arg1 == 0) {
								if (arg0 == 1) {
									var3[var11] = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								} else if (arg0 == 0) {
									var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
									var13 = (var12 & 0xFF0000) * anInt9353 & 0xFF000000;
									var14 = (var12 & 0xFF00) * anInt9354 & 0xFF0000;
									var15 = (var12 & 0xFF) * anInt9333 & 0xFF00;
									var3[var11] = (var13 | var14 | var15) >>> 8;
								} else if (arg0 == 3) {
									var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
									var13 = anInt9350;
									var14 = var12 + var13;
									var15 = (var12 & 0xFF00FF) + (var13 & 0xFF00FF);
									var16 = (var15 & 0x1000100) + (var14 - var15 & 0x10000);
									var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
								} else if (arg0 == 2) {
									var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
									var13 = (var12 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
									var14 = (var12 & 0xFF00) * anInt9351 & 0xFF0000;
									var3[var11] = ((var13 | var14) >>> 8) + anInt9323;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (arg1 != 1) {
								if (arg1 != 2) {
									throw new IllegalArgumentException();
								}
								if (arg0 == 1) {
									var37 = this.aByteArray10095[var10];
									if (var37 != 0) {
										var13 = this.anIntArray10096[var37 & 0xFF];
										var14 = var3[var11];
										var15 = var13 + var14;
										var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
										var14 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
										var3[var11] = var15 - var14 | var14 - (var14 >>> 8);
									}
								} else if (arg0 == 0) {
									var37 = this.aByteArray10095[var10];
									if (var37 != 0) {
										var13 = this.anIntArray10096[var37 & 0xFF];
										var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
										var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
										var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
										var13 = (var14 | var15 | var16) >>> 8;
										var17 = var3[var11];
										var18 = var13 + var17;
										var19 = (var13 & 0xFF00FF) + (var17 & 0xFF00FF);
										var17 = (var19 & 0x1000100) + (var18 - var19 & 0x10000);
										var3[var11] = var18 - var17 | var17 - (var17 >>> 8);
									}
								} else if (arg0 == 3) {
									var37 = this.aByteArray10095[var10];
									var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
									var14 = anInt9350;
									var15 = var13 + var14;
									var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
									var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
									var17 = var15 - var17 | var17 - (var17 >>> 8);
									if (var13 == 0 && anInt9351 != 255) {
										var13 = var17;
										var17 = var3[var11];
										var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
									}
									var3[var11] = var17;
								} else if (arg0 == 2) {
									var37 = this.aByteArray10095[var10];
									if (var37 != 0) {
										var13 = this.anIntArray10096[var37 & 0xFF];
										var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
										var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
										var13 = ((var14 | var15) >>> 8) + anInt9323;
										var16 = var3[var11];
										var17 = var13 + var16;
										var18 = (var13 & 0xFF00FF) + (var16 & 0xFF00FF);
										var16 = (var18 & 0x1000100) + (var17 - var18 & 0x10000);
										var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
									}
								}
							} else if (arg0 == 1) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var3[var11] = this.anIntArray10096[var37 & 0xFF];
								}
							} else if (arg0 == 0) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									if ((anInt9350 & 0xFFFFFF) == 16777215) {
										var14 = anInt9350 >>> 24;
										var15 = 256 - var14;
										var16 = var3[var11];
										var3[var11] = ((var13 & 0xFF00FF) * var14 + (var16 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var13 & 0xFF00) * var14 + (var16 & 0xFF00) * var15 & 0xFF0000) >> 8;
									} else if (anInt9351 == 255) {
										var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
										var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
										var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
										var3[var11] = (var14 | var15 | var16) >>> 8;
									} else {
										var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
										var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
										var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
										var13 = (var14 | var15 | var16) >>> 8;
										var17 = var3[var11];
										var3[var11] = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								var37 = this.aByteArray10095[var10];
								var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
								var14 = anInt9350;
								var15 = var13 + var14;
								var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
								var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
								var17 = var15 - var17 | var17 - (var17 >>> 8);
								if (var13 == 0 && anInt9351 != 255) {
									var13 = var17;
									var17 = var3[var11];
									var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
								}
								var3[var11] = var17;
							} else if (arg0 == 2) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
									var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
									var3[var11++] = ((var14 | var15) >>> 8) + anInt9323;
								}
							} else {
								throw new IllegalArgumentException();
							}
							var6 += anInt9340;
							var8++;
						}
					}
					var4++;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else if (anInt9341 < 0) {
				var4 = anInt9356;
				while (var4 < 0) {
					var5 = anInt9339;
					var6 = anInt9346 + anInt9348;
					var7 = anInt9324 + anInt9349;
					var8 = anInt9347;
					int var25;
					if ((var25 = var6 - (this.anInt9358 << 12)) >= 0) {
						var9 = (anInt9340 - var25) / anInt9340;
						var8 += var9;
						var6 += anInt9340 * var9;
						var7 += anInt9341 * var9;
						var5 += var9;
					}
					int var27;
					if ((var27 = (var6 - anInt9340) / anInt9340) > var8) {
						var8 = var27;
					}
					int var28;
					if ((var28 = var7 - (this.anInt9325 << 12)) >= 0) {
						var9 = (anInt9341 - var28) / anInt9341;
						var8 += var9;
						var6 += anInt9340 * var9;
						var7 += anInt9341 * var9;
						var5 += var9;
					}
					int var29;
					if ((var29 = (var7 - anInt9341) / anInt9341) > var8) {
						var8 = var29;
					}
					while (var8 < 0) {
						var10 = (var7 >> 12) * this.anInt9358 + (var6 >> 12);
						var11 = var5++;
						if (arg1 == 0) {
							if (arg0 == 1) {
								var3[var11] = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
							} else if (arg0 == 0) {
								var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								var13 = (var12 & 0xFF0000) * anInt9353 & 0xFF000000;
								var14 = (var12 & 0xFF00) * anInt9354 & 0xFF0000;
								var15 = (var12 & 0xFF) * anInt9333 & 0xFF00;
								var3[var11] = (var13 | var14 | var15) >>> 8;
							} else if (arg0 == 3) {
								var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								var13 = anInt9350;
								var14 = var12 + var13;
								var15 = (var12 & 0xFF00FF) + (var13 & 0xFF00FF);
								var16 = (var15 & 0x1000100) + (var14 - var15 & 0x10000);
								var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
							} else if (arg0 == 2) {
								var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								var13 = (var12 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
								var14 = (var12 & 0xFF00) * anInt9351 & 0xFF0000;
								var3[var11] = ((var13 | var14) >>> 8) + anInt9323;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (arg1 != 1) {
							if (arg1 != 2) {
								throw new IllegalArgumentException();
							}
							if (arg0 == 1) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = var3[var11];
									var15 = var13 + var14;
									var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
									var14 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
									var3[var11] = var15 - var14 | var14 - (var14 >>> 8);
								}
							} else if (arg0 == 0) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
									var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
									var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
									var13 = (var14 | var15 | var16) >>> 8;
									var17 = var3[var11];
									var18 = var13 + var17;
									var19 = (var13 & 0xFF00FF) + (var17 & 0xFF00FF);
									var17 = (var19 & 0x1000100) + (var18 - var19 & 0x10000);
									var3[var11] = var18 - var17 | var17 - (var17 >>> 8);
								}
							} else if (arg0 == 3) {
								var37 = this.aByteArray10095[var10];
								var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
								var14 = anInt9350;
								var15 = var13 + var14;
								var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
								var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
								var17 = var15 - var17 | var17 - (var17 >>> 8);
								if (var13 == 0 && anInt9351 != 255) {
									var13 = var17;
									var17 = var3[var11];
									var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
								}
								var3[var11] = var17;
							} else if (arg0 == 2) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
									var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
									var13 = ((var14 | var15) >>> 8) + anInt9323;
									var16 = var3[var11];
									var17 = var13 + var16;
									var18 = (var13 & 0xFF00FF) + (var16 & 0xFF00FF);
									var16 = (var18 & 0x1000100) + (var17 - var18 & 0x10000);
									var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
								}
							}
						} else if (arg0 == 1) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var3[var11] = this.anIntArray10096[var37 & 0xFF];
							}
						} else if (arg0 == 0) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								if ((anInt9350 & 0xFFFFFF) == 16777215) {
									var14 = anInt9350 >>> 24;
									var15 = 256 - var14;
									var16 = var3[var11];
									var3[var11] = ((var13 & 0xFF00FF) * var14 + (var16 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var13 & 0xFF00) * var14 + (var16 & 0xFF00) * var15 & 0xFF0000) >> 8;
								} else if (anInt9351 == 255) {
									var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
									var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
									var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
									var3[var11] = (var14 | var15 | var16) >>> 8;
								} else {
									var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
									var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
									var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
									var13 = (var14 | var15 | var16) >>> 8;
									var17 = var3[var11];
									var3[var11] = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							var37 = this.aByteArray10095[var10];
							var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
							var14 = anInt9350;
							var15 = var13 + var14;
							var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
							var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
							var17 = var15 - var17 | var17 - (var17 >>> 8);
							if (var13 == 0 && anInt9351 != 255) {
								var13 = var17;
								var17 = var3[var11];
								var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
							}
							var3[var11] = var17;
						} else if (arg0 == 2) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
								var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
								var3[var11++] = ((var14 | var15) >>> 8) + anInt9323;
							}
						} else {
							throw new IllegalArgumentException();
						}
						var6 += anInt9340;
						var7 += anInt9341;
						var8++;
					}
					var4++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else {
				var4 = anInt9356;
				while (var4 < 0) {
					var5 = anInt9339;
					var6 = anInt9346 + anInt9348;
					var7 = anInt9324 + anInt9349;
					var8 = anInt9347;
					int var30;
					if ((var30 = var6 - (this.anInt9358 << 12)) >= 0) {
						var9 = (anInt9340 - var30) / anInt9340;
						var8 += var9;
						var6 += anInt9340 * var9;
						var7 += anInt9341 * var9;
						var5 += var9;
					}
					int var31;
					if ((var31 = (var6 - anInt9340) / anInt9340) > var8) {
						var8 = var31;
					}
					if (var7 < 0) {
						var9 = (anInt9341 - 1 - var7) / anInt9341;
						var8 += var9;
						var6 += anInt9340 * var9;
						var7 += anInt9341 * var9;
						var5 += var9;
					}
					int var32;
					if ((var32 = (var7 + 1 - (this.anInt9325 << 12) - anInt9341) / anInt9341) > var8) {
						var8 = var32;
					}
					while (var8 < 0) {
						var10 = (var7 >> 12) * this.anInt9358 + (var6 >> 12);
						var11 = var5++;
						if (arg1 == 0) {
							if (arg0 == 1) {
								var3[var11] = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
							} else if (arg0 == 0) {
								var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								var13 = (var12 & 0xFF0000) * anInt9353 & 0xFF000000;
								var14 = (var12 & 0xFF00) * anInt9354 & 0xFF0000;
								var15 = (var12 & 0xFF) * anInt9333 & 0xFF00;
								var3[var11] = (var13 | var14 | var15) >>> 8;
							} else if (arg0 == 3) {
								var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								var13 = anInt9350;
								var14 = var12 + var13;
								var15 = (var12 & 0xFF00FF) + (var13 & 0xFF00FF);
								var16 = (var15 & 0x1000100) + (var14 - var15 & 0x10000);
								var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
							} else if (arg0 == 2) {
								var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								var13 = (var12 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
								var14 = (var12 & 0xFF00) * anInt9351 & 0xFF0000;
								var3[var11] = ((var13 | var14) >>> 8) + anInt9323;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (arg1 != 1) {
							if (arg1 != 2) {
								throw new IllegalArgumentException();
							}
							if (arg0 == 1) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = var3[var11];
									var15 = var13 + var14;
									var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
									var14 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
									var3[var11] = var15 - var14 | var14 - (var14 >>> 8);
								}
							} else if (arg0 == 0) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
									var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
									var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
									var13 = (var14 | var15 | var16) >>> 8;
									var17 = var3[var11];
									var18 = var13 + var17;
									var19 = (var13 & 0xFF00FF) + (var17 & 0xFF00FF);
									var17 = (var19 & 0x1000100) + (var18 - var19 & 0x10000);
									var3[var11] = var18 - var17 | var17 - (var17 >>> 8);
								}
							} else if (arg0 == 3) {
								var37 = this.aByteArray10095[var10];
								var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
								var14 = anInt9350;
								var15 = var13 + var14;
								var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
								var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
								var17 = var15 - var17 | var17 - (var17 >>> 8);
								if (var13 == 0 && anInt9351 != 255) {
									var13 = var17;
									var17 = var3[var11];
									var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
								}
								var3[var11] = var17;
							} else if (arg0 == 2) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
									var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
									var13 = ((var14 | var15) >>> 8) + anInt9323;
									var16 = var3[var11];
									var17 = var13 + var16;
									var18 = (var13 & 0xFF00FF) + (var16 & 0xFF00FF);
									var16 = (var18 & 0x1000100) + (var17 - var18 & 0x10000);
									var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
								}
							}
						} else if (arg0 == 1) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var3[var11] = this.anIntArray10096[var37 & 0xFF];
							}
						} else if (arg0 == 0) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								if ((anInt9350 & 0xFFFFFF) == 16777215) {
									var14 = anInt9350 >>> 24;
									var15 = 256 - var14;
									var16 = var3[var11];
									var3[var11] = ((var13 & 0xFF00FF) * var14 + (var16 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var13 & 0xFF00) * var14 + (var16 & 0xFF00) * var15 & 0xFF0000) >> 8;
								} else if (anInt9351 == 255) {
									var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
									var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
									var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
									var3[var11] = (var14 | var15 | var16) >>> 8;
								} else {
									var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
									var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
									var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
									var13 = (var14 | var15 | var16) >>> 8;
									var17 = var3[var11];
									var3[var11] = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							var37 = this.aByteArray10095[var10];
							var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
							var14 = anInt9350;
							var15 = var13 + var14;
							var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
							var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
							var17 = var15 - var17 | var17 - (var17 >>> 8);
							if (var13 == 0 && anInt9351 != 255) {
								var13 = var17;
								var17 = var3[var11];
								var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
							}
							var3[var11] = var17;
						} else if (arg0 == 2) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
								var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
								var3[var11++] = ((var14 | var15) >>> 8) + anInt9323;
							}
						} else {
							throw new IllegalArgumentException();
						}
						var6 += anInt9340;
						var7 += anInt9341;
						var8++;
					}
					var4++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			}
		} else if (anInt9341 == 0) {
			var4 = anInt9356;
			while (var4 < 0) {
				var5 = anInt9339;
				var6 = anInt9346 + anInt9348;
				var7 = anInt9324;
				var8 = anInt9347;
				if (var7 >= 0 && var7 - (this.anInt9325 << 12) < 0) {
					if (var6 < 0) {
						var9 = (anInt9340 - 1 - var6) / anInt9340;
						var8 += var9;
						var6 += anInt9340 * var9;
						var5 += var9;
					}
					int var33;
					if ((var33 = (var6 + 1 - (this.anInt9358 << 12) - anInt9340) / anInt9340) > var8) {
						var8 = var33;
					}
					while (var8 < 0) {
						var10 = (var7 >> 12) * this.anInt9358 + (var6 >> 12);
						var11 = var5++;
						if (arg1 == 0) {
							if (arg0 == 1) {
								var3[var11] = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
							} else if (arg0 == 0) {
								var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								var13 = (var12 & 0xFF0000) * anInt9353 & 0xFF000000;
								var14 = (var12 & 0xFF00) * anInt9354 & 0xFF0000;
								var15 = (var12 & 0xFF) * anInt9333 & 0xFF00;
								var3[var11] = (var13 | var14 | var15) >>> 8;
							} else if (arg0 == 3) {
								var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								var13 = anInt9350;
								var14 = var12 + var13;
								var15 = (var12 & 0xFF00FF) + (var13 & 0xFF00FF);
								var16 = (var15 & 0x1000100) + (var14 - var15 & 0x10000);
								var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
							} else if (arg0 == 2) {
								var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								var13 = (var12 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
								var14 = (var12 & 0xFF00) * anInt9351 & 0xFF0000;
								var3[var11] = ((var13 | var14) >>> 8) + anInt9323;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (arg1 != 1) {
							if (arg1 != 2) {
								throw new IllegalArgumentException();
							}
							if (arg0 == 1) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = var3[var11];
									var15 = var13 + var14;
									var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
									var14 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
									var3[var11] = var15 - var14 | var14 - (var14 >>> 8);
								}
							} else if (arg0 == 0) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
									var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
									var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
									var13 = (var14 | var15 | var16) >>> 8;
									var17 = var3[var11];
									var18 = var13 + var17;
									var19 = (var13 & 0xFF00FF) + (var17 & 0xFF00FF);
									var17 = (var19 & 0x1000100) + (var18 - var19 & 0x10000);
									var3[var11] = var18 - var17 | var17 - (var17 >>> 8);
								}
							} else if (arg0 == 3) {
								var37 = this.aByteArray10095[var10];
								var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
								var14 = anInt9350;
								var15 = var13 + var14;
								var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
								var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
								var17 = var15 - var17 | var17 - (var17 >>> 8);
								if (var13 == 0 && anInt9351 != 255) {
									var13 = var17;
									var17 = var3[var11];
									var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
								}
								var3[var11] = var17;
							} else if (arg0 == 2) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
									var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
									var13 = ((var14 | var15) >>> 8) + anInt9323;
									var16 = var3[var11];
									var17 = var13 + var16;
									var18 = (var13 & 0xFF00FF) + (var16 & 0xFF00FF);
									var16 = (var18 & 0x1000100) + (var17 - var18 & 0x10000);
									var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
								}
							}
						} else if (arg0 == 1) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var3[var11] = this.anIntArray10096[var37 & 0xFF];
							}
						} else if (arg0 == 0) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								if ((anInt9350 & 0xFFFFFF) == 16777215) {
									var14 = anInt9350 >>> 24;
									var15 = 256 - var14;
									var16 = var3[var11];
									var3[var11] = ((var13 & 0xFF00FF) * var14 + (var16 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var13 & 0xFF00) * var14 + (var16 & 0xFF00) * var15 & 0xFF0000) >> 8;
								} else if (anInt9351 == 255) {
									var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
									var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
									var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
									var3[var11] = (var14 | var15 | var16) >>> 8;
								} else {
									var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
									var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
									var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
									var13 = (var14 | var15 | var16) >>> 8;
									var17 = var3[var11];
									var3[var11] = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							var37 = this.aByteArray10095[var10];
							var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
							var14 = anInt9350;
							var15 = var13 + var14;
							var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
							var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
							var17 = var15 - var17 | var17 - (var17 >>> 8);
							if (var13 == 0 && anInt9351 != 255) {
								var13 = var17;
								var17 = var3[var11];
								var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
							}
							var3[var11] = var17;
						} else if (arg0 == 2) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
								var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
								var3[var11++] = ((var14 | var15) >>> 8) + anInt9323;
							}
						} else {
							throw new IllegalArgumentException();
						}
						var6 += anInt9340;
						var8++;
					}
				}
				var4++;
				anInt9346 += anInt9342;
				anInt9324 += anInt9343;
				anInt9339 += anInt9338;
			}
		} else if (anInt9341 < 0) {
			for (var4 = anInt9356; var4 < 0; var4++) {
				var5 = anInt9339;
				var6 = anInt9346 + anInt9348;
				var7 = anInt9324 + anInt9349;
				var8 = anInt9347;
				if (var6 < 0) {
					var9 = (anInt9340 - 1 - var6) / anInt9340;
					var8 += var9;
					var6 += anInt9340 * var9;
					var7 += anInt9341 * var9;
					var5 += var9;
				}
				int var34;
				if ((var34 = (var6 + 1 - (this.anInt9358 << 12) - anInt9340) / anInt9340) > var8) {
					var8 = var34;
				}
				int var35;
				if ((var35 = var7 - (this.anInt9325 << 12)) >= 0) {
					var9 = (anInt9341 - var35) / anInt9341;
					var8 += var9;
					var6 += anInt9340 * var9;
					var7 += anInt9341 * var9;
					var5 += var9;
				}
				int var36;
				if ((var36 = (var7 - anInt9341) / anInt9341) > var8) {
					var8 = var36;
				}
				while (var8 < 0) {
					var10 = (var7 >> 12) * this.anInt9358 + (var6 >> 12);
					var11 = var5++;
					if (arg1 == 0) {
						if (arg0 == 1) {
							var3[var11] = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
						} else if (arg0 == 0) {
							var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
							var13 = (var12 & 0xFF0000) * anInt9353 & 0xFF000000;
							var14 = (var12 & 0xFF00) * anInt9354 & 0xFF0000;
							var15 = (var12 & 0xFF) * anInt9333 & 0xFF00;
							var3[var11] = (var13 | var14 | var15) >>> 8;
						} else if (arg0 == 3) {
							var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
							var13 = anInt9350;
							var14 = var12 + var13;
							var15 = (var12 & 0xFF00FF) + (var13 & 0xFF00FF);
							var16 = (var15 & 0x1000100) + (var14 - var15 & 0x10000);
							var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
						} else if (arg0 == 2) {
							var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
							var13 = (var12 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
							var14 = (var12 & 0xFF00) * anInt9351 & 0xFF0000;
							var3[var11] = ((var13 | var14) >>> 8) + anInt9323;
						} else {
							throw new IllegalArgumentException();
						}
					} else if (arg1 != 1) {
						if (arg1 != 2) {
							throw new IllegalArgumentException();
						}
						if (arg0 == 1) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								var14 = var3[var11];
								var15 = var13 + var14;
								var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
								var14 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
								var3[var11] = var15 - var14 | var14 - (var14 >>> 8);
							}
						} else if (arg0 == 0) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
								var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
								var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
								var13 = (var14 | var15 | var16) >>> 8;
								var17 = var3[var11];
								var18 = var13 + var17;
								var19 = (var13 & 0xFF00FF) + (var17 & 0xFF00FF);
								var17 = (var19 & 0x1000100) + (var18 - var19 & 0x10000);
								var3[var11] = var18 - var17 | var17 - (var17 >>> 8);
							}
						} else if (arg0 == 3) {
							var37 = this.aByteArray10095[var10];
							var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
							var14 = anInt9350;
							var15 = var13 + var14;
							var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
							var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
							var17 = var15 - var17 | var17 - (var17 >>> 8);
							if (var13 == 0 && anInt9351 != 255) {
								var13 = var17;
								var17 = var3[var11];
								var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
							}
							var3[var11] = var17;
						} else if (arg0 == 2) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
								var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
								var13 = ((var14 | var15) >>> 8) + anInt9323;
								var16 = var3[var11];
								var17 = var13 + var16;
								var18 = (var13 & 0xFF00FF) + (var16 & 0xFF00FF);
								var16 = (var18 & 0x1000100) + (var17 - var18 & 0x10000);
								var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
							}
						}
					} else if (arg0 == 1) {
						var37 = this.aByteArray10095[var10];
						if (var37 != 0) {
							var3[var11] = this.anIntArray10096[var37 & 0xFF];
						}
					} else if (arg0 == 0) {
						var37 = this.aByteArray10095[var10];
						if (var37 != 0) {
							var13 = this.anIntArray10096[var37 & 0xFF];
							if ((anInt9350 & 0xFFFFFF) == 16777215) {
								var14 = anInt9350 >>> 24;
								var15 = 256 - var14;
								var16 = var3[var11];
								var3[var11] = ((var13 & 0xFF00FF) * var14 + (var16 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var13 & 0xFF00) * var14 + (var16 & 0xFF00) * var15 & 0xFF0000) >> 8;
							} else if (anInt9351 == 255) {
								var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
								var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
								var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
								var3[var11] = (var14 | var15 | var16) >>> 8;
							} else {
								var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
								var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
								var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
								var13 = (var14 | var15 | var16) >>> 8;
								var17 = var3[var11];
								var3[var11] = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
							}
						}
					} else if (arg0 == 3) {
						var37 = this.aByteArray10095[var10];
						var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
						var14 = anInt9350;
						var15 = var13 + var14;
						var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
						var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
						var17 = var15 - var17 | var17 - (var17 >>> 8);
						if (var13 == 0 && anInt9351 != 255) {
							var13 = var17;
							var17 = var3[var11];
							var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
						}
						var3[var11] = var17;
					} else if (arg0 == 2) {
						var37 = this.aByteArray10095[var10];
						if (var37 != 0) {
							var13 = this.anIntArray10096[var37 & 0xFF];
							var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
							var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
							var3[var11++] = ((var14 | var15) >>> 8) + anInt9323;
						}
					} else {
						throw new IllegalArgumentException();
					}
					var6 += anInt9340;
					var7 += anInt9341;
					var8++;
				}
				anInt9346 += anInt9342;
				anInt9324 += anInt9343;
				anInt9339 += anInt9338;
			}
		} else {
			for (var4 = anInt9356; var4 < 0; var4++) {
				var5 = anInt9339;
				var6 = anInt9346 + anInt9348;
				var7 = anInt9324 + anInt9349;
				var8 = anInt9347;
				if (var6 < 0) {
					var9 = (anInt9340 - 1 - var6) / anInt9340;
					var8 += var9;
					var6 += anInt9340 * var9;
					var7 += anInt9341 * var9;
					var5 += var9;
				}
				int var38;
				if ((var38 = (var6 + 1 - (this.anInt9358 << 12) - anInt9340) / anInt9340) > var8) {
					var8 = var38;
				}
				if (var7 < 0) {
					var9 = (anInt9341 - 1 - var7) / anInt9341;
					var8 += var9;
					var6 += anInt9340 * var9;
					var7 += anInt9341 * var9;
					var5 += var9;
				}
				int var39;
				if ((var39 = (var7 + 1 - (this.anInt9325 << 12) - anInt9341) / anInt9341) > var8) {
					var8 = var39;
				}
				while (var8 < 0) {
					var10 = (var7 >> 12) * this.anInt9358 + (var6 >> 12);
					var11 = var5++;
					if (arg1 == 0) {
						if (arg0 == 1) {
							var3[var11] = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
						} else if (arg0 == 0) {
							var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
							var13 = (var12 & 0xFF0000) * anInt9353 & 0xFF000000;
							var14 = (var12 & 0xFF00) * anInt9354 & 0xFF0000;
							var15 = (var12 & 0xFF) * anInt9333 & 0xFF00;
							var3[var11] = (var13 | var14 | var15) >>> 8;
						} else if (arg0 == 3) {
							var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
							var13 = anInt9350;
							var14 = var12 + var13;
							var15 = (var12 & 0xFF00FF) + (var13 & 0xFF00FF);
							var16 = (var15 & 0x1000100) + (var14 - var15 & 0x10000);
							var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
						} else if (arg0 == 2) {
							var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
							var13 = (var12 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
							var14 = (var12 & 0xFF00) * anInt9351 & 0xFF0000;
							var3[var11] = ((var13 | var14) >>> 8) + anInt9323;
						} else {
							throw new IllegalArgumentException();
						}
					} else if (arg1 != 1) {
						if (arg1 != 2) {
							throw new IllegalArgumentException();
						}
						if (arg0 == 1) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								var14 = var3[var11];
								var15 = var13 + var14;
								var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
								var14 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
								var3[var11] = var15 - var14 | var14 - (var14 >>> 8);
							}
						} else if (arg0 == 0) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
								var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
								var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
								var13 = (var14 | var15 | var16) >>> 8;
								var17 = var3[var11];
								var18 = var13 + var17;
								var19 = (var13 & 0xFF00FF) + (var17 & 0xFF00FF);
								var17 = (var19 & 0x1000100) + (var18 - var19 & 0x10000);
								var3[var11] = var18 - var17 | var17 - (var17 >>> 8);
							}
						} else if (arg0 == 3) {
							var37 = this.aByteArray10095[var10];
							var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
							var14 = anInt9350;
							var15 = var13 + var14;
							var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
							var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
							var17 = var15 - var17 | var17 - (var17 >>> 8);
							if (var13 == 0 && anInt9351 != 255) {
								var13 = var17;
								var17 = var3[var11];
								var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
							}
							var3[var11] = var17;
						} else if (arg0 == 2) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
								var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
								var13 = ((var14 | var15) >>> 8) + anInt9323;
								var16 = var3[var11];
								var17 = var13 + var16;
								var18 = (var13 & 0xFF00FF) + (var16 & 0xFF00FF);
								var16 = (var18 & 0x1000100) + (var17 - var18 & 0x10000);
								var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
							}
						}
					} else if (arg0 == 1) {
						var37 = this.aByteArray10095[var10];
						if (var37 != 0) {
							var3[var11] = this.anIntArray10096[var37 & 0xFF];
						}
					} else if (arg0 == 0) {
						var37 = this.aByteArray10095[var10];
						if (var37 != 0) {
							var13 = this.anIntArray10096[var37 & 0xFF];
							if ((anInt9350 & 0xFFFFFF) == 16777215) {
								var14 = anInt9350 >>> 24;
								var15 = 256 - var14;
								var16 = var3[var11];
								var3[var11] = ((var13 & 0xFF00FF) * var14 + (var16 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var13 & 0xFF00) * var14 + (var16 & 0xFF00) * var15 & 0xFF0000) >> 8;
							} else if (anInt9351 == 255) {
								var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
								var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
								var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
								var3[var11] = (var14 | var15 | var16) >>> 8;
							} else {
								var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
								var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
								var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
								var13 = (var14 | var15 | var16) >>> 8;
								var17 = var3[var11];
								var3[var11] = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
							}
						}
					} else if (arg0 == 3) {
						var37 = this.aByteArray10095[var10];
						var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
						var14 = anInt9350;
						var15 = var13 + var14;
						var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
						var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
						var17 = var15 - var17 | var17 - (var17 >>> 8);
						if (var13 == 0 && anInt9351 != 255) {
							var13 = var17;
							var17 = var3[var11];
							var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
						}
						var3[var11] = var17;
					} else if (arg0 == 2) {
						var37 = this.aByteArray10095[var10];
						if (var37 != 0) {
							var13 = this.anIntArray10096[var37 & 0xFF];
							var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
							var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
							var3[var11++] = ((var14 | var15) >>> 8) + anInt9323;
						}
					} else {
						throw new IllegalArgumentException();
					}
					var6 += anInt9340;
					var7 += anInt9341;
					var8++;
				}
				anInt9346 += anInt9342;
				anInt9324 += anInt9343;
				anInt9339 += anInt9338;
			}
		}
	}

	public void method704(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		throw new IllegalStateException();
	}

	public Interface8_Impl1_Impl2 method684() {
		throw new IllegalStateException();
	}

	public void method700(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (this.aClass_ra_Sub3_9355.method5187()) {
			throw new IllegalStateException();
		}
		int[] var6 = this.aClass_ra_Sub3_9355.anIntArray8630;
		if (var6 == null) {
			return;
		}
		int var7 = this.aClass_ra_Sub3_9355.anInt8618 * -29235085 * -1504772933;
		arg0 += this.anInt9352;
		arg1 += this.anInt9327;
		int var8 = arg1 * var7 + arg0;
		int var9 = 0;
		int var10 = this.anInt9325;
		int var11 = this.anInt9358;
		int var12 = var7 - var11;
		int var13 = 0;
		int var14;
		if (arg1 < this.aClass_ra_Sub3_9355.anInt8623 * 766013039 * -1679642481) {
			var14 = this.aClass_ra_Sub3_9355.anInt8623 * 766013039 * -1679642481 - arg1;
			var10 -= var14;
			arg1 = this.aClass_ra_Sub3_9355.anInt8623 * 766013039 * -1679642481;
			var9 += var14 * var11;
			var8 += var14 * var7;
		}
		if (arg1 + var10 > this.aClass_ra_Sub3_9355.anInt8624 * -550983163 * 31822541) {
			var10 -= arg1 + var10 - this.aClass_ra_Sub3_9355.anInt8624 * -550983163 * 31822541;
		}
		if (arg0 < this.aClass_ra_Sub3_9355.anInt8621 * 1907727929 * 512290825) {
			var14 = this.aClass_ra_Sub3_9355.anInt8621 * 1907727929 * 512290825 - arg0;
			var11 -= var14;
			arg0 = this.aClass_ra_Sub3_9355.anInt8621 * 1907727929 * 512290825;
			var9 += var14;
			var8 += var14;
			var13 += var14;
			var12 += var14;
		}
		if (arg0 + var11 > this.aClass_ra_Sub3_9355.anInt8635 * -711985315 * -1071049483) {
			var14 = arg0 + var11 - this.aClass_ra_Sub3_9355.anInt8635 * -711985315 * -1071049483;
			var11 -= var14;
			var13 += var14;
			var12 += var14;
		}
		if (var11 <= 0 || var10 <= 0) {
			return;
		}
		int var15;
		int var16;
		int var17;
		int var18;
		int var19;
		int var20;
		int var21;
		int var22;
		int var27;
		if (arg4 != 0) {
			int var23;
			int var24;
			int var25;
			int var26;
			byte var28;
			byte var33;
			if (arg4 != 1) {
				if (arg4 != 2) {
					throw new IllegalArgumentException();
				}
				if (arg2 == 1) {
					for (var14 = -var10; var14 < 0; var14++) {
						for (var15 = -var11; var15 < 0; var15++) {
							var28 = this.aByteArray10095[var9++];
							if (var28 == 0) {
								var8++;
							} else {
								var17 = this.anIntArray10096[var28 & 0xFF];
								var18 = var6[var8];
								var19 = var17 + var18;
								var20 = (var17 & 0xFF00FF) + (var18 & 0xFF00FF);
								var18 = (var20 & 0x1000100) + (var19 - var20 & 0x10000);
								var6[var8++] = var19 - var18 | var18 - (var18 >>> 8);
							}
						}
						var8 += var12;
						var9 += var13;
					}
				} else if (arg2 == 0) {
					var14 = arg3 >> 16 & 0xFF;
					var15 = arg3 >> 8 & 0xFF;
					var16 = arg3 & 0xFF;
					for (var17 = -var10; var17 < 0; var17++) {
						for (var18 = -var11; var18 < 0; var18++) {
							byte var34 = this.aByteArray10095[var9++];
							if (var34 == 0) {
								var8++;
							} else {
								var20 = this.anIntArray10096[var34 & 0xFF];
								var21 = (var20 & 0xFF0000) * var14 & 0xFF000000;
								var22 = (var20 & 0xFF00) * var15 & 0xFF0000;
								var23 = (var20 & 0xFF) * var16 & 0xFF00;
								var20 = (var21 | var22 | var23) >>> 8;
								var24 = var6[var8];
								var25 = var20 + var24;
								var26 = (var20 & 0xFF00FF) + (var24 & 0xFF00FF);
								var24 = (var26 & 0x1000100) + (var25 - var26 & 0x10000);
								var6[var8++] = var25 - var24 | var24 - (var24 >>> 8);
							}
						}
						var8 += var12;
						var9 += var13;
					}
				} else if (arg2 == 3) {
					for (var14 = -var10; var14 < 0; var14++) {
						for (var15 = -var11; var15 < 0; var15++) {
							var28 = this.aByteArray10095[var9++];
							var17 = var28 > 0 ? this.anIntArray10096[var28] : 0;
							var18 = var17 + arg3;
							var19 = (var17 & 0xFF00FF) + (arg3 & 0xFF00FF);
							var20 = (var19 & 0x1000100) + (var18 - var19 & 0x10000);
							var17 = var18 - var20 | var20 - (var20 >>> 8);
							var20 = var6[var8];
							var18 = var17 + var20;
							var19 = (var17 & 0xFF00FF) + (var20 & 0xFF00FF);
							var20 = (var19 & 0x1000100) + (var18 - var19 & 0x10000);
							var6[var8++] = var18 - var20 | var20 - (var20 >>> 8);
						}
						var8 += var12;
						var9 += var13;
					}
				} else if (arg2 == 2) {
					var14 = arg3 >>> 24;
					var15 = 256 - var14;
					var16 = (arg3 & 0xFF00FF) * var15 & 0xFF00FF00;
					var17 = (arg3 & 0xFF00) * var15 & 0xFF0000;
					var27 = (var16 | var17) >>> 8;
					for (var18 = -var10; var18 < 0; var18++) {
						for (var19 = -var11; var19 < 0; var19++) {
							var33 = this.aByteArray10095[var9++];
							if (var33 == 0) {
								var8++;
							} else {
								var21 = this.anIntArray10096[var33 & 0xFF];
								var16 = (var21 & 0xFF00FF) * var14 & 0xFF00FF00;
								var17 = (var21 & 0xFF00) * var14 & 0xFF0000;
								var21 = ((var16 | var17) >>> 8) + var27;
								var22 = var6[var8];
								var23 = var21 + var22;
								var24 = (var21 & 0xFF00FF) + (var22 & 0xFF00FF);
								var22 = (var24 & 0x1000100) + (var23 - var24 & 0x10000);
								var6[var8++] = var23 - var22 | var22 - (var22 >>> 8);
							}
						}
						var8 += var12;
						var9 += var13;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg2 == 1) {
				for (var14 = -var10; var14 < 0; var14++) {
					for (var15 = -var11; var15 < 0; var15++) {
						var28 = this.aByteArray10095[var9++];
						if (var28 == 0) {
							var8++;
						} else {
							var17 = this.anIntArray10096[var28 & 0xFF] | 0xFF000000;
							short var29 = 255;
							byte var31 = 0;
							var20 = var6[var8];
							var6[var8++] = ((var17 & 0xFF00FF) * var29 + (var20 & 0xFF00FF) * var31 >> 8 & 0xFFFF00FF) + (((var17 & 0xFF00FF00) >>> 8) * var29 + ((var20 & 0xFF00FF00) >>> 8) * var31 & 0xFF00FF00);
						}
					}
					var8 += var12;
					var9 += var13;
				}
			} else {
				byte var30;
				if (arg2 == 0) {
					if ((arg3 & 0xFFFFFF) == 16777215) {
						var14 = arg3 >>> 24;
						var15 = 256 - var14;
						for (var16 = -var10; var16 < 0; var16++) {
							for (var17 = -var11; var17 < 0; var17++) {
								var30 = this.aByteArray10095[var9++];
								if (var30 == 0) {
									var8++;
								} else {
									var19 = this.anIntArray10096[var30 & 0xFF];
									var20 = var6[var8];
									var6[var8++] = ((var19 & 0xFF00FF) * var14 + (var20 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var19 & 0xFF00) * var14 + (var20 & 0xFF00) * var15 & 0xFF0000) >> 8;
								}
							}
							var8 += var12;
							var9 += var13;
						}
					} else {
						var14 = arg3 >> 16 & 0xFF;
						var15 = arg3 >> 8 & 0xFF;
						var16 = arg3 & 0xFF;
						var17 = arg3 >>> 24;
						var18 = 256 - var17;
						for (var19 = -var10; var19 < 0; var19++) {
							for (var20 = -var11; var20 < 0; var20++) {
								byte var32 = this.aByteArray10095[var9++];
								if (var32 == 0) {
									var8++;
								} else {
									var22 = this.anIntArray10096[var32 & 0xFF];
									if (var17 == 255) {
										var23 = (var22 & 0xFF0000) * var14 & 0xFF000000;
										var24 = (var22 & 0xFF00) * var15 & 0xFF0000;
										var25 = (var22 & 0xFF) * var16 & 0xFF00;
										var6[var8++] = (var23 | var24 | var25) >>> 8;
									} else {
										var23 = (var22 & 0xFF0000) * var14 & 0xFF000000;
										var24 = (var22 & 0xFF00) * var15 & 0xFF0000;
										var25 = (var22 & 0xFF) * var16 & 0xFF00;
										var22 = (var23 | var24 | var25) >>> 8;
										var26 = var6[var8];
										var6[var8++] = ((var22 & 0xFF00FF) * var17 + (var26 & 0xFF00FF) * var18 & 0xFF00FF00) + ((var22 & 0xFF00) * var17 + (var26 & 0xFF00) * var18 & 0xFF0000) >> 8;
									}
								}
							}
							var8 += var12;
							var9 += var13;
						}
					}
				} else if (arg2 == 3) {
					var14 = arg3 >>> 24;
					var15 = 256 - var14;
					for (var16 = -var10; var16 < 0; var16++) {
						for (var17 = -var11; var17 < 0; var17++) {
							var30 = this.aByteArray10095[var9++];
							var19 = var30 > 0 ? this.anIntArray10096[var30] : 0;
							var20 = var19 + arg3;
							var21 = (var19 & 0xFF00FF) + (arg3 & 0xFF00FF);
							var22 = (var21 & 0x1000100) + (var20 - var21 & 0x10000);
							var22 = var20 - var22 | var22 - (var22 >>> 8);
							if (var19 == 0 && var14 != 255) {
								var19 = var22;
								var22 = var6[var8];
								var22 = ((var19 & 0xFF00FF) * var14 + (var22 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var19 & 0xFF00) * var14 + (var22 & 0xFF00) * var15 & 0xFF0000) >> 8;
							}
							var6[var8++] = var22;
						}
						var8 += var12;
						var9 += var13;
					}
				} else if (arg2 == 2) {
					var14 = arg3 >>> 24;
					var15 = 256 - var14;
					var16 = (arg3 & 0xFF00FF) * var15 & 0xFF00FF00;
					var17 = (arg3 & 0xFF00) * var15 & 0xFF0000;
					var27 = (var16 | var17) >>> 8;
					for (var18 = -var10; var18 < 0; var18++) {
						for (var19 = -var11; var19 < 0; var19++) {
							var33 = this.aByteArray10095[var9++];
							if (var33 == 0) {
								var8++;
							} else {
								var21 = this.anIntArray10096[var33 & 0xFF];
								var16 = (var21 & 0xFF00FF) * var14 & 0xFF00FF00;
								var17 = (var21 & 0xFF00) * var14 & 0xFF0000;
								var6[var8++] = ((var16 | var17) >>> 8) + var27;
							}
						}
						var8 += var12;
						var9 += var13;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg2 == 1) {
			for (var14 = -var10; var14 < 0; var14++) {
				var15 = var8 + var11 - 3;
				while (var8 < var15) {
					var6[var8++] = this.anIntArray10096[this.aByteArray10095[var9++] & 0xFF];
					var6[var8++] = this.anIntArray10096[this.aByteArray10095[var9++] & 0xFF];
					var6[var8++] = this.anIntArray10096[this.aByteArray10095[var9++] & 0xFF];
					var6[var8++] = this.anIntArray10096[this.aByteArray10095[var9++] & 0xFF];
				}
				var15 += 3;
				while (var8 < var15) {
					var6[var8++] = this.anIntArray10096[this.aByteArray10095[var9++] & 0xFF];
				}
				var8 += var12;
				var9 += var13;
			}
		} else if (arg2 == 0) {
			var14 = arg3 >> 16 & 0xFF;
			var15 = arg3 >> 8 & 0xFF;
			var16 = arg3 & 0xFF;
			for (var17 = -var10; var17 < 0; var17++) {
				for (var18 = -var11; var18 < 0; var18++) {
					var19 = this.anIntArray10096[this.aByteArray10095[var9++] & 0xFF];
					var20 = (var19 & 0xFF0000) * var14 & 0xFF000000;
					var21 = (var19 & 0xFF00) * var15 & 0xFF0000;
					var22 = (var19 & 0xFF) * var16 & 0xFF00;
					var6[var8++] = (var20 | var21 | var22) >>> 8;
				}
				var8 += var12;
				var9 += var13;
			}
		} else if (arg2 == 3) {
			for (var14 = -var10; var14 < 0; var14++) {
				for (var15 = -var11; var15 < 0; var15++) {
					var16 = this.anIntArray10096[this.aByteArray10095[var9++] & 0xFF];
					var17 = var16 + arg3;
					var18 = (var16 & 0xFF00FF) + (arg3 & 0xFF00FF);
					var19 = (var18 & 0x1000100) + (var17 - var18 & 0x10000);
					var6[var8++] = var17 - var19 | var19 - (var19 >>> 8);
				}
				var8 += var12;
				var9 += var13;
			}
		} else if (arg2 == 2) {
			var14 = arg3 >>> 24;
			var15 = 256 - var14;
			var16 = (arg3 & 0xFF00FF) * var15 & 0xFF00FF00;
			var17 = (arg3 & 0xFF00) * var15 & 0xFF0000;
			var27 = (var16 | var17) >>> 8;
			for (var18 = -var10; var18 < 0; var18++) {
				for (var19 = -var11; var19 < 0; var19++) {
					var20 = this.anIntArray10096[this.aByteArray10095[var9++] & 0xFF];
					var16 = (var20 & 0xFF00FF) * var14 & 0xFF00FF00;
					var17 = (var20 & 0xFF00) * var14 & 0xFF0000;
					var6[var8++] = ((var16 | var17) >>> 8) + var27;
				}
				var8 += var12;
				var9 += var13;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method709(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (this.aClass_ra_Sub3_9355.method5187()) {
			throw new IllegalStateException();
		} else if (arg2 > 0 && arg3 > 0) {
			int[] var9 = this.aClass_ra_Sub3_9355.anIntArray8630;
			if (var9 != null) {
				int var10 = 0;
				int var11 = 0;
				int var12 = this.aClass_ra_Sub3_9355.anInt8618 * -29235085 * -1504772933;
				int var13 = this.anInt9352 + this.anInt9358 + this.anInt9328;
				int var14 = this.anInt9327 + this.anInt9325 + this.anInt9337;
				int var15 = (var13 << 16) / arg2;
				int var16 = (var14 << 16) / arg3;
				int var17;
				if (this.anInt9352 > 0) {
					var17 = ((this.anInt9352 << 16) + var15 - 1) / var15;
					arg0 += var17;
					var10 += var17 * var15 - (this.anInt9352 << 16);
				}
				if (this.anInt9327 > 0) {
					var17 = ((this.anInt9327 << 16) + var16 - 1) / var16;
					arg1 += var17;
					var11 += var17 * var16 - (this.anInt9327 << 16);
				}
				if (this.anInt9358 < var13) {
					arg2 = ((this.anInt9358 << 16) - var10 + var15 - 1) / var15;
				}
				if (this.anInt9325 < var14) {
					arg3 = ((this.anInt9325 << 16) - var11 + var16 - 1) / var16;
				}
				var17 = arg0 + arg1 * var12;
				int var18 = var12 - arg2;
				if (arg1 + arg3 > this.aClass_ra_Sub3_9355.anInt8624 * -550983163 * 31822541) {
					arg3 -= arg1 + arg3 - this.aClass_ra_Sub3_9355.anInt8624 * -550983163 * 31822541;
				}
				int var19;
				if (arg1 < this.aClass_ra_Sub3_9355.anInt8623 * 766013039 * -1679642481) {
					var19 = this.aClass_ra_Sub3_9355.anInt8623 * 766013039 * -1679642481 - arg1;
					arg3 -= var19;
					var17 += var19 * var12;
					var11 += var16 * var19;
				}
				if (arg0 + arg2 > this.aClass_ra_Sub3_9355.anInt8635 * -711985315 * -1071049483) {
					var19 = arg0 + arg2 - this.aClass_ra_Sub3_9355.anInt8635 * -711985315 * -1071049483;
					arg2 -= var19;
					var18 += var19;
				}
				if (arg0 < this.aClass_ra_Sub3_9355.anInt8621 * 1907727929 * 512290825) {
					var19 = this.aClass_ra_Sub3_9355.anInt8621 * 1907727929 * 512290825 - arg0;
					arg2 -= var19;
					var17 += var19;
					var10 += var15 * var19;
					var18 += var19;
				}
				int var20;
				int var21;
				int var22;
				int var23;
				int var24;
				int var25;
				int var26;
				int var27;
				int var28;
				int var29;
				int var34;
				byte var35;
				if (arg6 != 0) {
					int var30;
					int var31;
					int var32;
					int var33;
					byte var38;
					if (arg6 != 1) {
						if (arg6 != 2) {
							throw new IllegalArgumentException();
						}
						if (arg4 == 1) {
							var19 = var10;
							for (var20 = -arg3; var20 < 0; var20++) {
								var21 = (var11 >> 16) * this.anInt9358;
								for (var22 = -arg2; var22 < 0; var22++) {
									var35 = this.aByteArray10095[(var10 >> 16) + var21];
									if (var35 == 0) {
										var17++;
									} else {
										var24 = this.anIntArray10096[var35 & 0xFF];
										var25 = var9[var17];
										var26 = var24 + var25;
										var27 = (var24 & 0xFF00FF) + (var25 & 0xFF00FF);
										var25 = (var27 & 0x1000100) + (var26 - var27 & 0x10000);
										var9[var17++] = var26 - var25 | var25 - (var25 >>> 8);
									}
									var10 += var15;
								}
								var11 += var16;
								var10 = var19;
								var17 += var18;
							}
						} else if (arg4 == 0) {
							var19 = var10;
							var20 = arg5 >> 16 & 0xFF;
							var21 = arg5 >> 8 & 0xFF;
							var22 = arg5 & 0xFF;
							for (var23 = -arg3; var23 < 0; var23++) {
								var24 = (var11 >> 16) * this.anInt9358;
								for (var25 = -arg2; var25 < 0; var25++) {
									byte var39 = this.aByteArray10095[(var10 >> 16) + var24];
									if (var39 == 0) {
										var17++;
									} else {
										var27 = this.anIntArray10096[var39 & 0xFF];
										var28 = (var27 & 0xFF0000) * var20 & 0xFF000000;
										var29 = (var27 & 0xFF00) * var21 & 0xFF0000;
										var30 = (var27 & 0xFF) * var22 & 0xFF00;
										var27 = (var28 | var29 | var30) >>> 8;
										var31 = var9[var17];
										var32 = var27 + var31;
										var33 = (var27 & 0xFF00FF) + (var31 & 0xFF00FF);
										var31 = (var33 & 0x1000100) + (var32 - var33 & 0x10000);
										var9[var17++] = var32 - var31 | var31 - (var31 >>> 8);
									}
									var10 += var15;
								}
								var11 += var16;
								var10 = var19;
								var17 += var18;
							}
						} else if (arg4 == 3) {
							var19 = var10;
							for (var20 = -arg3; var20 < 0; var20++) {
								var21 = (var11 >> 16) * this.anInt9358;
								for (var22 = -arg2; var22 < 0; var22++) {
									var35 = this.aByteArray10095[(var10 >> 16) + var21];
									var24 = var35 > 0 ? this.anIntArray10096[var35] : 0;
									var25 = var24 + arg5;
									var26 = (var24 & 0xFF00FF) + (arg5 & 0xFF00FF);
									var27 = (var26 & 0x1000100) + (var25 - var26 & 0x10000);
									var24 = var25 - var27 | var27 - (var27 >>> 8);
									var27 = var9[var17];
									var25 = var24 + var27;
									var26 = (var24 & 0xFF00FF) + (var27 & 0xFF00FF);
									var27 = (var26 & 0x1000100) + (var25 - var26 & 0x10000);
									var9[var17++] = var25 - var27 | var27 - (var27 >>> 8);
									var10 += var15;
								}
								var11 += var16;
								var10 = var19;
								var17 += var18;
							}
						} else if (arg4 == 2) {
							var19 = arg5 >>> 24;
							var20 = 256 - var19;
							var21 = (arg5 & 0xFF00FF) * var20 & 0xFF00FF00;
							var22 = (arg5 & 0xFF00) * var20 & 0xFF0000;
							var34 = (var21 | var22) >>> 8;
							var23 = var10;
							for (var24 = -arg3; var24 < 0; var24++) {
								var25 = (var11 >> 16) * this.anInt9358;
								for (var26 = -arg2; var26 < 0; var26++) {
									var38 = this.aByteArray10095[(var10 >> 16) + var25];
									if (var38 == 0) {
										var17++;
									} else {
										var28 = this.anIntArray10096[var38 & 0xFF];
										var21 = (var28 & 0xFF00FF) * var19 & 0xFF00FF00;
										var22 = (var28 & 0xFF00) * var19 & 0xFF0000;
										var28 = ((var21 | var22) >>> 8) + var34;
										var29 = var9[var17];
										var30 = var28 + var29;
										var31 = (var28 & 0xFF00FF) + (var29 & 0xFF00FF);
										var29 = (var31 & 0x1000100) + (var30 - var31 & 0x10000);
										var9[var17++] = var30 - var29 | var29 - (var29 >>> 8);
									}
									var10 += var15;
								}
								var11 += var16;
								var10 = var23;
								var17 += var18;
							}
						} else {
							throw new IllegalArgumentException();
						}
					} else if (arg4 == 1) {
						var19 = var10;
						for (var20 = -arg3; var20 < 0; var20++) {
							var21 = (var11 >> 16) * this.anInt9358;
							for (var22 = -arg2; var22 < 0; var22++) {
								var35 = this.aByteArray10095[(var10 >> 16) + var21];
								if (var35 == 0) {
									var17++;
								} else {
									var9[var17++] = this.anIntArray10096[var35 & 0xFF];
								}
								var10 += var15;
							}
							var11 += var16;
							var10 = var19;
							var17 += var18;
						}
					} else {
						byte var36;
						if (arg4 == 0) {
							var19 = var10;
							if ((arg5 & 0xFFFFFF) == 16777215) {
								var20 = arg5 >>> 24;
								var21 = 256 - var20;
								for (var22 = -arg3; var22 < 0; var22++) {
									var23 = (var11 >> 16) * this.anInt9358;
									for (var24 = -arg2; var24 < 0; var24++) {
										var36 = this.aByteArray10095[(var10 >> 16) + var23];
										if (var36 == 0) {
											var17++;
										} else {
											var26 = this.anIntArray10096[var36 & 0xFF];
											var27 = var9[var17];
											var9[var17++] = ((var26 & 0xFF00FF) * var20 + (var27 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var26 & 0xFF00) * var20 + (var27 & 0xFF00) * var21 & 0xFF0000) >> 8;
										}
										var10 += var15;
									}
									var11 += var16;
									var10 = var19;
									var17 += var18;
								}
							} else {
								var20 = arg5 >> 16 & 0xFF;
								var21 = arg5 >> 8 & 0xFF;
								var22 = arg5 & 0xFF;
								var23 = arg5 >>> 24;
								var24 = 256 - var23;
								for (var25 = -arg3; var25 < 0; var25++) {
									var26 = (var11 >> 16) * this.anInt9358;
									for (var27 = -arg2; var27 < 0; var27++) {
										byte var37 = this.aByteArray10095[(var10 >> 16) + var26];
										if (var37 == 0) {
											var17++;
										} else {
											var29 = this.anIntArray10096[var37 & 0xFF];
											if (var23 == 255) {
												var30 = (var29 & 0xFF0000) * var20 & 0xFF000000;
												var31 = (var29 & 0xFF00) * var21 & 0xFF0000;
												var32 = (var29 & 0xFF) * var22 & 0xFF00;
												var9[var17++] = (var30 | var31 | var32) >>> 8;
											} else {
												var30 = (var29 & 0xFF0000) * var20 & 0xFF000000;
												var31 = (var29 & 0xFF00) * var21 & 0xFF0000;
												var32 = (var29 & 0xFF) * var22 & 0xFF00;
												var29 = (var30 | var31 | var32) >>> 8;
												var33 = var9[var17];
												var9[var17++] = ((var29 & 0xFF00FF) * var23 + (var33 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var29 & 0xFF00) * var23 + (var33 & 0xFF00) * var24 & 0xFF0000) >> 8;
											}
										}
										var10 += var15;
									}
									var11 += var16;
									var10 = var19;
									var17 += var18;
								}
							}
						} else if (arg4 == 3) {
							var19 = var10;
							var20 = arg5 >>> 24;
							var21 = 256 - var20;
							for (var22 = -arg3; var22 < 0; var22++) {
								var23 = (var11 >> 16) * this.anInt9358;
								for (var24 = -arg2; var24 < 0; var24++) {
									var36 = this.aByteArray10095[(var10 >> 16) + var23];
									var26 = var36 > 0 ? this.anIntArray10096[var36] : 0;
									var27 = var26 + arg5;
									var28 = (var26 & 0xFF00FF) + (arg5 & 0xFF00FF);
									var29 = (var28 & 0x1000100) + (var27 - var28 & 0x10000);
									var29 = var27 - var29 | var29 - (var29 >>> 8);
									if (var26 == 0 && var20 != 255) {
										var26 = var29;
										var29 = var9[var17];
										var29 = ((var26 & 0xFF00FF) * var20 + (var29 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var26 & 0xFF00) * var20 + (var29 & 0xFF00) * var21 & 0xFF0000) >> 8;
									}
									var9[var17++] = var29;
									var10 += var15;
								}
								var11 += var16;
								var10 = var19;
								var17 += var18;
							}
						} else if (arg4 == 2) {
							var19 = arg5 >>> 24;
							var20 = 256 - var19;
							var21 = (arg5 & 0xFF00FF) * var20 & 0xFF00FF00;
							var22 = (arg5 & 0xFF00) * var20 & 0xFF0000;
							var34 = (var21 | var22) >>> 8;
							var23 = var10;
							for (var24 = -arg3; var24 < 0; var24++) {
								var25 = (var11 >> 16) * this.anInt9358;
								for (var26 = -arg2; var26 < 0; var26++) {
									var38 = this.aByteArray10095[(var10 >> 16) + var25];
									if (var38 == 0) {
										var17++;
									} else {
										var28 = this.anIntArray10096[var38 & 0xFF];
										var21 = (var28 & 0xFF00FF) * var19 & 0xFF00FF00;
										var22 = (var28 & 0xFF00) * var19 & 0xFF0000;
										var9[var17++] = ((var21 | var22) >>> 8) + var34;
									}
									var10 += var15;
								}
								var11 += var16;
								var10 = var23;
								var17 += var18;
							}
						} else {
							throw new IllegalArgumentException();
						}
					}
				} else if (arg4 == 1) {
					var19 = var10;
					for (var20 = -arg3; var20 < 0; var20++) {
						var21 = (var11 >> 16) * this.anInt9358;
						for (var22 = -arg2; var22 < 0; var22++) {
							var9[var17++] = this.anIntArray10096[this.aByteArray10095[(var10 >> 16) + var21] & 0xFF];
							var10 += var15;
						}
						var11 += var16;
						var10 = var19;
						var17 += var18;
					}
				} else if (arg4 == 0) {
					var19 = arg5 >> 16 & 0xFF;
					var20 = arg5 >> 8 & 0xFF;
					var21 = arg5 & 0xFF;
					var22 = var10;
					for (var23 = -arg3; var23 < 0; var23++) {
						var24 = (var11 >> 16) * this.anInt9358;
						for (var25 = -arg2; var25 < 0; var25++) {
							var26 = this.anIntArray10096[this.aByteArray10095[(var10 >> 16) + var24] & 0xFF];
							var27 = (var26 & 0xFF0000) * var19 & 0xFF000000;
							var28 = (var26 & 0xFF00) * var20 & 0xFF0000;
							var29 = (var26 & 0xFF) * var21 & 0xFF00;
							var9[var17++] = (var27 | var28 | var29) >>> 8;
							var10 += var15;
						}
						var11 += var16;
						var10 = var22;
						var17 += var18;
					}
				} else if (arg4 == 3) {
					var19 = var10;
					for (var20 = -arg3; var20 < 0; var20++) {
						var21 = (var11 >> 16) * this.anInt9358;
						for (var22 = -arg2; var22 < 0; var22++) {
							var35 = this.aByteArray10095[(var10 >> 16) + var21];
							var24 = var35 > 0 ? this.anIntArray10096[var35] : 0;
							var25 = var24 + arg5;
							var26 = (var24 & 0xFF00FF) + (arg5 & 0xFF00FF);
							var27 = (var26 & 0x1000100) + (var25 - var26 & 0x10000);
							var9[var17++] = var25 - var27 | var27 - (var27 >>> 8);
							var10 += var15;
						}
						var11 += var16;
						var10 = var19;
						var17 += var18;
					}
				} else if (arg4 == 2) {
					var19 = arg5 >>> 24;
					var20 = 256 - var19;
					var21 = (arg5 & 0xFF00FF) * var20 & 0xFF00FF00;
					var22 = (arg5 & 0xFF00) * var20 & 0xFF0000;
					var34 = (var21 | var22) >>> 8;
					var23 = var10;
					for (var24 = -arg3; var24 < 0; var24++) {
						var25 = (var11 >> 16) * this.anInt9358;
						for (var26 = -arg2; var26 < 0; var26++) {
							var27 = this.anIntArray10096[this.aByteArray10095[(var10 >> 16) + var25] & 0xFF];
							var21 = (var27 & 0xFF00FF) * var19 & 0xFF00FF00;
							var22 = (var27 & 0xFF00) * var19 & 0xFF0000;
							var9[var17++] = ((var21 | var22) >>> 8) + var34;
							var10 += var15;
						}
						var11 += var16;
						var10 = var23;
						var17 += var18;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		}
	}

	public void method706(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (this.aClass_ra_Sub3_9355.method5187()) {
			throw new IllegalStateException();
		} else if (arg2 > 0 && arg3 > 0) {
			int[] var9 = this.aClass_ra_Sub3_9355.anIntArray8630;
			if (var9 != null) {
				int var10 = 0;
				int var11 = 0;
				int var12 = this.aClass_ra_Sub3_9355.anInt8618 * -29235085 * -1504772933;
				int var13 = this.anInt9352 + this.anInt9358 + this.anInt9328;
				int var14 = this.anInt9327 + this.anInt9325 + this.anInt9337;
				int var15 = (var13 << 16) / arg2;
				int var16 = (var14 << 16) / arg3;
				int var17;
				if (this.anInt9352 > 0) {
					var17 = ((this.anInt9352 << 16) + var15 - 1) / var15;
					arg0 += var17;
					var10 += var17 * var15 - (this.anInt9352 << 16);
				}
				if (this.anInt9327 > 0) {
					var17 = ((this.anInt9327 << 16) + var16 - 1) / var16;
					arg1 += var17;
					var11 += var17 * var16 - (this.anInt9327 << 16);
				}
				if (this.anInt9358 < var13) {
					arg2 = ((this.anInt9358 << 16) - var10 + var15 - 1) / var15;
				}
				if (this.anInt9325 < var14) {
					arg3 = ((this.anInt9325 << 16) - var11 + var16 - 1) / var16;
				}
				var17 = arg0 + arg1 * var12;
				int var18 = var12 - arg2;
				if (arg1 + arg3 > this.aClass_ra_Sub3_9355.anInt8624 * -550983163 * 31822541) {
					arg3 -= arg1 + arg3 - this.aClass_ra_Sub3_9355.anInt8624 * -550983163 * 31822541;
				}
				int var19;
				if (arg1 < this.aClass_ra_Sub3_9355.anInt8623 * 766013039 * -1679642481) {
					var19 = this.aClass_ra_Sub3_9355.anInt8623 * 766013039 * -1679642481 - arg1;
					arg3 -= var19;
					var17 += var19 * var12;
					var11 += var16 * var19;
				}
				if (arg0 + arg2 > this.aClass_ra_Sub3_9355.anInt8635 * -711985315 * -1071049483) {
					var19 = arg0 + arg2 - this.aClass_ra_Sub3_9355.anInt8635 * -711985315 * -1071049483;
					arg2 -= var19;
					var18 += var19;
				}
				if (arg0 < this.aClass_ra_Sub3_9355.anInt8621 * 1907727929 * 512290825) {
					var19 = this.aClass_ra_Sub3_9355.anInt8621 * 1907727929 * 512290825 - arg0;
					arg2 -= var19;
					var17 += var19;
					var10 += var15 * var19;
					var18 += var19;
				}
				int var20;
				int var21;
				int var22;
				int var23;
				int var24;
				int var25;
				int var26;
				int var27;
				int var28;
				int var29;
				int var34;
				byte var35;
				if (arg6 != 0) {
					int var30;
					int var31;
					int var32;
					int var33;
					byte var38;
					if (arg6 != 1) {
						if (arg6 != 2) {
							throw new IllegalArgumentException();
						}
						if (arg4 == 1) {
							var19 = var10;
							for (var20 = -arg3; var20 < 0; var20++) {
								var21 = (var11 >> 16) * this.anInt9358;
								for (var22 = -arg2; var22 < 0; var22++) {
									var35 = this.aByteArray10095[(var10 >> 16) + var21];
									if (var35 == 0) {
										var17++;
									} else {
										var24 = this.anIntArray10096[var35 & 0xFF];
										var25 = var9[var17];
										var26 = var24 + var25;
										var27 = (var24 & 0xFF00FF) + (var25 & 0xFF00FF);
										var25 = (var27 & 0x1000100) + (var26 - var27 & 0x10000);
										var9[var17++] = var26 - var25 | var25 - (var25 >>> 8);
									}
									var10 += var15;
								}
								var11 += var16;
								var10 = var19;
								var17 += var18;
							}
						} else if (arg4 == 0) {
							var19 = var10;
							var20 = arg5 >> 16 & 0xFF;
							var21 = arg5 >> 8 & 0xFF;
							var22 = arg5 & 0xFF;
							for (var23 = -arg3; var23 < 0; var23++) {
								var24 = (var11 >> 16) * this.anInt9358;
								for (var25 = -arg2; var25 < 0; var25++) {
									byte var39 = this.aByteArray10095[(var10 >> 16) + var24];
									if (var39 == 0) {
										var17++;
									} else {
										var27 = this.anIntArray10096[var39 & 0xFF];
										var28 = (var27 & 0xFF0000) * var20 & 0xFF000000;
										var29 = (var27 & 0xFF00) * var21 & 0xFF0000;
										var30 = (var27 & 0xFF) * var22 & 0xFF00;
										var27 = (var28 | var29 | var30) >>> 8;
										var31 = var9[var17];
										var32 = var27 + var31;
										var33 = (var27 & 0xFF00FF) + (var31 & 0xFF00FF);
										var31 = (var33 & 0x1000100) + (var32 - var33 & 0x10000);
										var9[var17++] = var32 - var31 | var31 - (var31 >>> 8);
									}
									var10 += var15;
								}
								var11 += var16;
								var10 = var19;
								var17 += var18;
							}
						} else if (arg4 == 3) {
							var19 = var10;
							for (var20 = -arg3; var20 < 0; var20++) {
								var21 = (var11 >> 16) * this.anInt9358;
								for (var22 = -arg2; var22 < 0; var22++) {
									var35 = this.aByteArray10095[(var10 >> 16) + var21];
									var24 = var35 > 0 ? this.anIntArray10096[var35] : 0;
									var25 = var24 + arg5;
									var26 = (var24 & 0xFF00FF) + (arg5 & 0xFF00FF);
									var27 = (var26 & 0x1000100) + (var25 - var26 & 0x10000);
									var24 = var25 - var27 | var27 - (var27 >>> 8);
									var27 = var9[var17];
									var25 = var24 + var27;
									var26 = (var24 & 0xFF00FF) + (var27 & 0xFF00FF);
									var27 = (var26 & 0x1000100) + (var25 - var26 & 0x10000);
									var9[var17++] = var25 - var27 | var27 - (var27 >>> 8);
									var10 += var15;
								}
								var11 += var16;
								var10 = var19;
								var17 += var18;
							}
						} else if (arg4 == 2) {
							var19 = arg5 >>> 24;
							var20 = 256 - var19;
							var21 = (arg5 & 0xFF00FF) * var20 & 0xFF00FF00;
							var22 = (arg5 & 0xFF00) * var20 & 0xFF0000;
							var34 = (var21 | var22) >>> 8;
							var23 = var10;
							for (var24 = -arg3; var24 < 0; var24++) {
								var25 = (var11 >> 16) * this.anInt9358;
								for (var26 = -arg2; var26 < 0; var26++) {
									var38 = this.aByteArray10095[(var10 >> 16) + var25];
									if (var38 == 0) {
										var17++;
									} else {
										var28 = this.anIntArray10096[var38 & 0xFF];
										var21 = (var28 & 0xFF00FF) * var19 & 0xFF00FF00;
										var22 = (var28 & 0xFF00) * var19 & 0xFF0000;
										var28 = ((var21 | var22) >>> 8) + var34;
										var29 = var9[var17];
										var30 = var28 + var29;
										var31 = (var28 & 0xFF00FF) + (var29 & 0xFF00FF);
										var29 = (var31 & 0x1000100) + (var30 - var31 & 0x10000);
										var9[var17++] = var30 - var29 | var29 - (var29 >>> 8);
									}
									var10 += var15;
								}
								var11 += var16;
								var10 = var23;
								var17 += var18;
							}
						} else {
							throw new IllegalArgumentException();
						}
					} else if (arg4 == 1) {
						var19 = var10;
						for (var20 = -arg3; var20 < 0; var20++) {
							var21 = (var11 >> 16) * this.anInt9358;
							for (var22 = -arg2; var22 < 0; var22++) {
								var35 = this.aByteArray10095[(var10 >> 16) + var21];
								if (var35 == 0) {
									var17++;
								} else {
									var9[var17++] = this.anIntArray10096[var35 & 0xFF];
								}
								var10 += var15;
							}
							var11 += var16;
							var10 = var19;
							var17 += var18;
						}
					} else {
						byte var36;
						if (arg4 == 0) {
							var19 = var10;
							if ((arg5 & 0xFFFFFF) == 16777215) {
								var20 = arg5 >>> 24;
								var21 = 256 - var20;
								for (var22 = -arg3; var22 < 0; var22++) {
									var23 = (var11 >> 16) * this.anInt9358;
									for (var24 = -arg2; var24 < 0; var24++) {
										var36 = this.aByteArray10095[(var10 >> 16) + var23];
										if (var36 == 0) {
											var17++;
										} else {
											var26 = this.anIntArray10096[var36 & 0xFF];
											var27 = var9[var17];
											var9[var17++] = ((var26 & 0xFF00FF) * var20 + (var27 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var26 & 0xFF00) * var20 + (var27 & 0xFF00) * var21 & 0xFF0000) >> 8;
										}
										var10 += var15;
									}
									var11 += var16;
									var10 = var19;
									var17 += var18;
								}
							} else {
								var20 = arg5 >> 16 & 0xFF;
								var21 = arg5 >> 8 & 0xFF;
								var22 = arg5 & 0xFF;
								var23 = arg5 >>> 24;
								var24 = 256 - var23;
								for (var25 = -arg3; var25 < 0; var25++) {
									var26 = (var11 >> 16) * this.anInt9358;
									for (var27 = -arg2; var27 < 0; var27++) {
										byte var37 = this.aByteArray10095[(var10 >> 16) + var26];
										if (var37 == 0) {
											var17++;
										} else {
											var29 = this.anIntArray10096[var37 & 0xFF];
											if (var23 == 255) {
												var30 = (var29 & 0xFF0000) * var20 & 0xFF000000;
												var31 = (var29 & 0xFF00) * var21 & 0xFF0000;
												var32 = (var29 & 0xFF) * var22 & 0xFF00;
												var9[var17++] = (var30 | var31 | var32) >>> 8;
											} else {
												var30 = (var29 & 0xFF0000) * var20 & 0xFF000000;
												var31 = (var29 & 0xFF00) * var21 & 0xFF0000;
												var32 = (var29 & 0xFF) * var22 & 0xFF00;
												var29 = (var30 | var31 | var32) >>> 8;
												var33 = var9[var17];
												var9[var17++] = ((var29 & 0xFF00FF) * var23 + (var33 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var29 & 0xFF00) * var23 + (var33 & 0xFF00) * var24 & 0xFF0000) >> 8;
											}
										}
										var10 += var15;
									}
									var11 += var16;
									var10 = var19;
									var17 += var18;
								}
							}
						} else if (arg4 == 3) {
							var19 = var10;
							var20 = arg5 >>> 24;
							var21 = 256 - var20;
							for (var22 = -arg3; var22 < 0; var22++) {
								var23 = (var11 >> 16) * this.anInt9358;
								for (var24 = -arg2; var24 < 0; var24++) {
									var36 = this.aByteArray10095[(var10 >> 16) + var23];
									var26 = var36 > 0 ? this.anIntArray10096[var36] : 0;
									var27 = var26 + arg5;
									var28 = (var26 & 0xFF00FF) + (arg5 & 0xFF00FF);
									var29 = (var28 & 0x1000100) + (var27 - var28 & 0x10000);
									var29 = var27 - var29 | var29 - (var29 >>> 8);
									if (var26 == 0 && var20 != 255) {
										var26 = var29;
										var29 = var9[var17];
										var29 = ((var26 & 0xFF00FF) * var20 + (var29 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var26 & 0xFF00) * var20 + (var29 & 0xFF00) * var21 & 0xFF0000) >> 8;
									}
									var9[var17++] = var29;
									var10 += var15;
								}
								var11 += var16;
								var10 = var19;
								var17 += var18;
							}
						} else if (arg4 == 2) {
							var19 = arg5 >>> 24;
							var20 = 256 - var19;
							var21 = (arg5 & 0xFF00FF) * var20 & 0xFF00FF00;
							var22 = (arg5 & 0xFF00) * var20 & 0xFF0000;
							var34 = (var21 | var22) >>> 8;
							var23 = var10;
							for (var24 = -arg3; var24 < 0; var24++) {
								var25 = (var11 >> 16) * this.anInt9358;
								for (var26 = -arg2; var26 < 0; var26++) {
									var38 = this.aByteArray10095[(var10 >> 16) + var25];
									if (var38 == 0) {
										var17++;
									} else {
										var28 = this.anIntArray10096[var38 & 0xFF];
										var21 = (var28 & 0xFF00FF) * var19 & 0xFF00FF00;
										var22 = (var28 & 0xFF00) * var19 & 0xFF0000;
										var9[var17++] = ((var21 | var22) >>> 8) + var34;
									}
									var10 += var15;
								}
								var11 += var16;
								var10 = var23;
								var17 += var18;
							}
						} else {
							throw new IllegalArgumentException();
						}
					}
				} else if (arg4 == 1) {
					var19 = var10;
					for (var20 = -arg3; var20 < 0; var20++) {
						var21 = (var11 >> 16) * this.anInt9358;
						for (var22 = -arg2; var22 < 0; var22++) {
							var9[var17++] = this.anIntArray10096[this.aByteArray10095[(var10 >> 16) + var21] & 0xFF];
							var10 += var15;
						}
						var11 += var16;
						var10 = var19;
						var17 += var18;
					}
				} else if (arg4 == 0) {
					var19 = arg5 >> 16 & 0xFF;
					var20 = arg5 >> 8 & 0xFF;
					var21 = arg5 & 0xFF;
					var22 = var10;
					for (var23 = -arg3; var23 < 0; var23++) {
						var24 = (var11 >> 16) * this.anInt9358;
						for (var25 = -arg2; var25 < 0; var25++) {
							var26 = this.anIntArray10096[this.aByteArray10095[(var10 >> 16) + var24] & 0xFF];
							var27 = (var26 & 0xFF0000) * var19 & 0xFF000000;
							var28 = (var26 & 0xFF00) * var20 & 0xFF0000;
							var29 = (var26 & 0xFF) * var21 & 0xFF00;
							var9[var17++] = (var27 | var28 | var29) >>> 8;
							var10 += var15;
						}
						var11 += var16;
						var10 = var22;
						var17 += var18;
					}
				} else if (arg4 == 3) {
					var19 = var10;
					for (var20 = -arg3; var20 < 0; var20++) {
						var21 = (var11 >> 16) * this.anInt9358;
						for (var22 = -arg2; var22 < 0; var22++) {
							var35 = this.aByteArray10095[(var10 >> 16) + var21];
							var24 = var35 > 0 ? this.anIntArray10096[var35] : 0;
							var25 = var24 + arg5;
							var26 = (var24 & 0xFF00FF) + (arg5 & 0xFF00FF);
							var27 = (var26 & 0x1000100) + (var25 - var26 & 0x10000);
							var9[var17++] = var25 - var27 | var27 - (var27 >>> 8);
							var10 += var15;
						}
						var11 += var16;
						var10 = var19;
						var17 += var18;
					}
				} else if (arg4 == 2) {
					var19 = arg5 >>> 24;
					var20 = 256 - var19;
					var21 = (arg5 & 0xFF00FF) * var20 & 0xFF00FF00;
					var22 = (arg5 & 0xFF00) * var20 & 0xFF0000;
					var34 = (var21 | var22) >>> 8;
					var23 = var10;
					for (var24 = -arg3; var24 < 0; var24++) {
						var25 = (var11 >> 16) * this.anInt9358;
						for (var26 = -arg2; var26 < 0; var26++) {
							var27 = this.anIntArray10096[this.aByteArray10095[(var10 >> 16) + var25] & 0xFF];
							var21 = (var27 & 0xFF00FF) * var19 & 0xFF00FF00;
							var22 = (var27 & 0xFF00) * var19 & 0xFF0000;
							var9[var17++] = ((var21 | var22) >>> 8) + var34;
							var10 += var15;
						}
						var11 += var16;
						var10 = var23;
						var17 += var18;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		}
	}

	public Class61_Sub3_Sub3(Class_ra_Sub3 arg0, byte[] arg1, int[] arg2, int arg3, int arg4) {
		super(arg0, arg3, arg4);
		this.aByteArray10095 = arg1;
		this.anIntArray10096 = arg2;
	}

	public void method710(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (this.aClass_ra_Sub3_9355.method5187()) {
			throw new IllegalStateException();
		} else if (arg2 > 0 && arg3 > 0) {
			int[] var9 = this.aClass_ra_Sub3_9355.anIntArray8630;
			if (var9 != null) {
				int var10 = 0;
				int var11 = 0;
				int var12 = this.aClass_ra_Sub3_9355.anInt8618 * -29235085 * -1504772933;
				int var13 = this.anInt9352 + this.anInt9358 + this.anInt9328;
				int var14 = this.anInt9327 + this.anInt9325 + this.anInt9337;
				int var15 = (var13 << 16) / arg2;
				int var16 = (var14 << 16) / arg3;
				int var17;
				if (this.anInt9352 > 0) {
					var17 = ((this.anInt9352 << 16) + var15 - 1) / var15;
					arg0 += var17;
					var10 += var17 * var15 - (this.anInt9352 << 16);
				}
				if (this.anInt9327 > 0) {
					var17 = ((this.anInt9327 << 16) + var16 - 1) / var16;
					arg1 += var17;
					var11 += var17 * var16 - (this.anInt9327 << 16);
				}
				if (this.anInt9358 < var13) {
					arg2 = ((this.anInt9358 << 16) - var10 + var15 - 1) / var15;
				}
				if (this.anInt9325 < var14) {
					arg3 = ((this.anInt9325 << 16) - var11 + var16 - 1) / var16;
				}
				var17 = arg0 + arg1 * var12;
				int var18 = var12 - arg2;
				if (arg1 + arg3 > this.aClass_ra_Sub3_9355.anInt8624 * -550983163 * 31822541) {
					arg3 -= arg1 + arg3 - this.aClass_ra_Sub3_9355.anInt8624 * -550983163 * 31822541;
				}
				int var19;
				if (arg1 < this.aClass_ra_Sub3_9355.anInt8623 * 766013039 * -1679642481) {
					var19 = this.aClass_ra_Sub3_9355.anInt8623 * 766013039 * -1679642481 - arg1;
					arg3 -= var19;
					var17 += var19 * var12;
					var11 += var16 * var19;
				}
				if (arg0 + arg2 > this.aClass_ra_Sub3_9355.anInt8635 * -711985315 * -1071049483) {
					var19 = arg0 + arg2 - this.aClass_ra_Sub3_9355.anInt8635 * -711985315 * -1071049483;
					arg2 -= var19;
					var18 += var19;
				}
				if (arg0 < this.aClass_ra_Sub3_9355.anInt8621 * 1907727929 * 512290825) {
					var19 = this.aClass_ra_Sub3_9355.anInt8621 * 1907727929 * 512290825 - arg0;
					arg2 -= var19;
					var17 += var19;
					var10 += var15 * var19;
					var18 += var19;
				}
				int var20;
				int var21;
				int var22;
				int var23;
				int var24;
				int var25;
				int var26;
				int var27;
				int var28;
				int var29;
				int var34;
				byte var35;
				if (arg6 != 0) {
					int var30;
					int var31;
					int var32;
					int var33;
					byte var38;
					if (arg6 != 1) {
						if (arg6 != 2) {
							throw new IllegalArgumentException();
						}
						if (arg4 == 1) {
							var19 = var10;
							for (var20 = -arg3; var20 < 0; var20++) {
								var21 = (var11 >> 16) * this.anInt9358;
								for (var22 = -arg2; var22 < 0; var22++) {
									var35 = this.aByteArray10095[(var10 >> 16) + var21];
									if (var35 == 0) {
										var17++;
									} else {
										var24 = this.anIntArray10096[var35 & 0xFF];
										var25 = var9[var17];
										var26 = var24 + var25;
										var27 = (var24 & 0xFF00FF) + (var25 & 0xFF00FF);
										var25 = (var27 & 0x1000100) + (var26 - var27 & 0x10000);
										var9[var17++] = var26 - var25 | var25 - (var25 >>> 8);
									}
									var10 += var15;
								}
								var11 += var16;
								var10 = var19;
								var17 += var18;
							}
						} else if (arg4 == 0) {
							var19 = var10;
							var20 = arg5 >> 16 & 0xFF;
							var21 = arg5 >> 8 & 0xFF;
							var22 = arg5 & 0xFF;
							for (var23 = -arg3; var23 < 0; var23++) {
								var24 = (var11 >> 16) * this.anInt9358;
								for (var25 = -arg2; var25 < 0; var25++) {
									byte var39 = this.aByteArray10095[(var10 >> 16) + var24];
									if (var39 == 0) {
										var17++;
									} else {
										var27 = this.anIntArray10096[var39 & 0xFF];
										var28 = (var27 & 0xFF0000) * var20 & 0xFF000000;
										var29 = (var27 & 0xFF00) * var21 & 0xFF0000;
										var30 = (var27 & 0xFF) * var22 & 0xFF00;
										var27 = (var28 | var29 | var30) >>> 8;
										var31 = var9[var17];
										var32 = var27 + var31;
										var33 = (var27 & 0xFF00FF) + (var31 & 0xFF00FF);
										var31 = (var33 & 0x1000100) + (var32 - var33 & 0x10000);
										var9[var17++] = var32 - var31 | var31 - (var31 >>> 8);
									}
									var10 += var15;
								}
								var11 += var16;
								var10 = var19;
								var17 += var18;
							}
						} else if (arg4 == 3) {
							var19 = var10;
							for (var20 = -arg3; var20 < 0; var20++) {
								var21 = (var11 >> 16) * this.anInt9358;
								for (var22 = -arg2; var22 < 0; var22++) {
									var35 = this.aByteArray10095[(var10 >> 16) + var21];
									var24 = var35 > 0 ? this.anIntArray10096[var35] : 0;
									var25 = var24 + arg5;
									var26 = (var24 & 0xFF00FF) + (arg5 & 0xFF00FF);
									var27 = (var26 & 0x1000100) + (var25 - var26 & 0x10000);
									var24 = var25 - var27 | var27 - (var27 >>> 8);
									var27 = var9[var17];
									var25 = var24 + var27;
									var26 = (var24 & 0xFF00FF) + (var27 & 0xFF00FF);
									var27 = (var26 & 0x1000100) + (var25 - var26 & 0x10000);
									var9[var17++] = var25 - var27 | var27 - (var27 >>> 8);
									var10 += var15;
								}
								var11 += var16;
								var10 = var19;
								var17 += var18;
							}
						} else if (arg4 == 2) {
							var19 = arg5 >>> 24;
							var20 = 256 - var19;
							var21 = (arg5 & 0xFF00FF) * var20 & 0xFF00FF00;
							var22 = (arg5 & 0xFF00) * var20 & 0xFF0000;
							var34 = (var21 | var22) >>> 8;
							var23 = var10;
							for (var24 = -arg3; var24 < 0; var24++) {
								var25 = (var11 >> 16) * this.anInt9358;
								for (var26 = -arg2; var26 < 0; var26++) {
									var38 = this.aByteArray10095[(var10 >> 16) + var25];
									if (var38 == 0) {
										var17++;
									} else {
										var28 = this.anIntArray10096[var38 & 0xFF];
										var21 = (var28 & 0xFF00FF) * var19 & 0xFF00FF00;
										var22 = (var28 & 0xFF00) * var19 & 0xFF0000;
										var28 = ((var21 | var22) >>> 8) + var34;
										var29 = var9[var17];
										var30 = var28 + var29;
										var31 = (var28 & 0xFF00FF) + (var29 & 0xFF00FF);
										var29 = (var31 & 0x1000100) + (var30 - var31 & 0x10000);
										var9[var17++] = var30 - var29 | var29 - (var29 >>> 8);
									}
									var10 += var15;
								}
								var11 += var16;
								var10 = var23;
								var17 += var18;
							}
						} else {
							throw new IllegalArgumentException();
						}
					} else if (arg4 == 1) {
						var19 = var10;
						for (var20 = -arg3; var20 < 0; var20++) {
							var21 = (var11 >> 16) * this.anInt9358;
							for (var22 = -arg2; var22 < 0; var22++) {
								var35 = this.aByteArray10095[(var10 >> 16) + var21];
								if (var35 == 0) {
									var17++;
								} else {
									var9[var17++] = this.anIntArray10096[var35 & 0xFF];
								}
								var10 += var15;
							}
							var11 += var16;
							var10 = var19;
							var17 += var18;
						}
					} else {
						byte var36;
						if (arg4 == 0) {
							var19 = var10;
							if ((arg5 & 0xFFFFFF) == 16777215) {
								var20 = arg5 >>> 24;
								var21 = 256 - var20;
								for (var22 = -arg3; var22 < 0; var22++) {
									var23 = (var11 >> 16) * this.anInt9358;
									for (var24 = -arg2; var24 < 0; var24++) {
										var36 = this.aByteArray10095[(var10 >> 16) + var23];
										if (var36 == 0) {
											var17++;
										} else {
											var26 = this.anIntArray10096[var36 & 0xFF];
											var27 = var9[var17];
											var9[var17++] = ((var26 & 0xFF00FF) * var20 + (var27 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var26 & 0xFF00) * var20 + (var27 & 0xFF00) * var21 & 0xFF0000) >> 8;
										}
										var10 += var15;
									}
									var11 += var16;
									var10 = var19;
									var17 += var18;
								}
							} else {
								var20 = arg5 >> 16 & 0xFF;
								var21 = arg5 >> 8 & 0xFF;
								var22 = arg5 & 0xFF;
								var23 = arg5 >>> 24;
								var24 = 256 - var23;
								for (var25 = -arg3; var25 < 0; var25++) {
									var26 = (var11 >> 16) * this.anInt9358;
									for (var27 = -arg2; var27 < 0; var27++) {
										byte var37 = this.aByteArray10095[(var10 >> 16) + var26];
										if (var37 == 0) {
											var17++;
										} else {
											var29 = this.anIntArray10096[var37 & 0xFF];
											if (var23 == 255) {
												var30 = (var29 & 0xFF0000) * var20 & 0xFF000000;
												var31 = (var29 & 0xFF00) * var21 & 0xFF0000;
												var32 = (var29 & 0xFF) * var22 & 0xFF00;
												var9[var17++] = (var30 | var31 | var32) >>> 8;
											} else {
												var30 = (var29 & 0xFF0000) * var20 & 0xFF000000;
												var31 = (var29 & 0xFF00) * var21 & 0xFF0000;
												var32 = (var29 & 0xFF) * var22 & 0xFF00;
												var29 = (var30 | var31 | var32) >>> 8;
												var33 = var9[var17];
												var9[var17++] = ((var29 & 0xFF00FF) * var23 + (var33 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var29 & 0xFF00) * var23 + (var33 & 0xFF00) * var24 & 0xFF0000) >> 8;
											}
										}
										var10 += var15;
									}
									var11 += var16;
									var10 = var19;
									var17 += var18;
								}
							}
						} else if (arg4 == 3) {
							var19 = var10;
							var20 = arg5 >>> 24;
							var21 = 256 - var20;
							for (var22 = -arg3; var22 < 0; var22++) {
								var23 = (var11 >> 16) * this.anInt9358;
								for (var24 = -arg2; var24 < 0; var24++) {
									var36 = this.aByteArray10095[(var10 >> 16) + var23];
									var26 = var36 > 0 ? this.anIntArray10096[var36] : 0;
									var27 = var26 + arg5;
									var28 = (var26 & 0xFF00FF) + (arg5 & 0xFF00FF);
									var29 = (var28 & 0x1000100) + (var27 - var28 & 0x10000);
									var29 = var27 - var29 | var29 - (var29 >>> 8);
									if (var26 == 0 && var20 != 255) {
										var26 = var29;
										var29 = var9[var17];
										var29 = ((var26 & 0xFF00FF) * var20 + (var29 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var26 & 0xFF00) * var20 + (var29 & 0xFF00) * var21 & 0xFF0000) >> 8;
									}
									var9[var17++] = var29;
									var10 += var15;
								}
								var11 += var16;
								var10 = var19;
								var17 += var18;
							}
						} else if (arg4 == 2) {
							var19 = arg5 >>> 24;
							var20 = 256 - var19;
							var21 = (arg5 & 0xFF00FF) * var20 & 0xFF00FF00;
							var22 = (arg5 & 0xFF00) * var20 & 0xFF0000;
							var34 = (var21 | var22) >>> 8;
							var23 = var10;
							for (var24 = -arg3; var24 < 0; var24++) {
								var25 = (var11 >> 16) * this.anInt9358;
								for (var26 = -arg2; var26 < 0; var26++) {
									var38 = this.aByteArray10095[(var10 >> 16) + var25];
									if (var38 == 0) {
										var17++;
									} else {
										var28 = this.anIntArray10096[var38 & 0xFF];
										var21 = (var28 & 0xFF00FF) * var19 & 0xFF00FF00;
										var22 = (var28 & 0xFF00) * var19 & 0xFF0000;
										var9[var17++] = ((var21 | var22) >>> 8) + var34;
									}
									var10 += var15;
								}
								var11 += var16;
								var10 = var23;
								var17 += var18;
							}
						} else {
							throw new IllegalArgumentException();
						}
					}
				} else if (arg4 == 1) {
					var19 = var10;
					for (var20 = -arg3; var20 < 0; var20++) {
						var21 = (var11 >> 16) * this.anInt9358;
						for (var22 = -arg2; var22 < 0; var22++) {
							var9[var17++] = this.anIntArray10096[this.aByteArray10095[(var10 >> 16) + var21] & 0xFF];
							var10 += var15;
						}
						var11 += var16;
						var10 = var19;
						var17 += var18;
					}
				} else if (arg4 == 0) {
					var19 = arg5 >> 16 & 0xFF;
					var20 = arg5 >> 8 & 0xFF;
					var21 = arg5 & 0xFF;
					var22 = var10;
					for (var23 = -arg3; var23 < 0; var23++) {
						var24 = (var11 >> 16) * this.anInt9358;
						for (var25 = -arg2; var25 < 0; var25++) {
							var26 = this.anIntArray10096[this.aByteArray10095[(var10 >> 16) + var24] & 0xFF];
							var27 = (var26 & 0xFF0000) * var19 & 0xFF000000;
							var28 = (var26 & 0xFF00) * var20 & 0xFF0000;
							var29 = (var26 & 0xFF) * var21 & 0xFF00;
							var9[var17++] = (var27 | var28 | var29) >>> 8;
							var10 += var15;
						}
						var11 += var16;
						var10 = var22;
						var17 += var18;
					}
				} else if (arg4 == 3) {
					var19 = var10;
					for (var20 = -arg3; var20 < 0; var20++) {
						var21 = (var11 >> 16) * this.anInt9358;
						for (var22 = -arg2; var22 < 0; var22++) {
							var35 = this.aByteArray10095[(var10 >> 16) + var21];
							var24 = var35 > 0 ? this.anIntArray10096[var35] : 0;
							var25 = var24 + arg5;
							var26 = (var24 & 0xFF00FF) + (arg5 & 0xFF00FF);
							var27 = (var26 & 0x1000100) + (var25 - var26 & 0x10000);
							var9[var17++] = var25 - var27 | var27 - (var27 >>> 8);
							var10 += var15;
						}
						var11 += var16;
						var10 = var19;
						var17 += var18;
					}
				} else if (arg4 == 2) {
					var19 = arg5 >>> 24;
					var20 = 256 - var19;
					var21 = (arg5 & 0xFF00FF) * var20 & 0xFF00FF00;
					var22 = (arg5 & 0xFF00) * var20 & 0xFF0000;
					var34 = (var21 | var22) >>> 8;
					var23 = var10;
					for (var24 = -arg3; var24 < 0; var24++) {
						var25 = (var11 >> 16) * this.anInt9358;
						for (var26 = -arg2; var26 < 0; var26++) {
							var27 = this.anIntArray10096[this.aByteArray10095[(var10 >> 16) + var25] & 0xFF];
							var21 = (var27 & 0xFF00FF) * var19 & 0xFF00FF00;
							var22 = (var27 & 0xFF00) * var19 & 0xFF0000;
							var9[var17++] = ((var21 | var22) >>> 8) + var34;
							var10 += var15;
						}
						var11 += var16;
						var10 = var23;
						var17 += var18;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		}
	}

	public Interface8_Impl1_Impl2 method707() {
		throw new IllegalStateException();
	}

	public void method712(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (this.aClass_ra_Sub3_9355.method5187()) {
			throw new IllegalStateException();
		} else if (arg2 > 0 && arg3 > 0) {
			int[] var9 = this.aClass_ra_Sub3_9355.anIntArray8630;
			if (var9 != null) {
				int var10 = 0;
				int var11 = 0;
				int var12 = this.aClass_ra_Sub3_9355.anInt8618 * -29235085 * -1504772933;
				int var13 = this.anInt9352 + this.anInt9358 + this.anInt9328;
				int var14 = this.anInt9327 + this.anInt9325 + this.anInt9337;
				int var15 = (var13 << 16) / arg2;
				int var16 = (var14 << 16) / arg3;
				int var17;
				if (this.anInt9352 > 0) {
					var17 = ((this.anInt9352 << 16) + var15 - 1) / var15;
					arg0 += var17;
					var10 += var17 * var15 - (this.anInt9352 << 16);
				}
				if (this.anInt9327 > 0) {
					var17 = ((this.anInt9327 << 16) + var16 - 1) / var16;
					arg1 += var17;
					var11 += var17 * var16 - (this.anInt9327 << 16);
				}
				if (this.anInt9358 < var13) {
					arg2 = ((this.anInt9358 << 16) - var10 + var15 - 1) / var15;
				}
				if (this.anInt9325 < var14) {
					arg3 = ((this.anInt9325 << 16) - var11 + var16 - 1) / var16;
				}
				var17 = arg0 + arg1 * var12;
				int var18 = var12 - arg2;
				if (arg1 + arg3 > this.aClass_ra_Sub3_9355.anInt8624 * -550983163 * 31822541) {
					arg3 -= arg1 + arg3 - this.aClass_ra_Sub3_9355.anInt8624 * -550983163 * 31822541;
				}
				int var19;
				if (arg1 < this.aClass_ra_Sub3_9355.anInt8623 * 766013039 * -1679642481) {
					var19 = this.aClass_ra_Sub3_9355.anInt8623 * 766013039 * -1679642481 - arg1;
					arg3 -= var19;
					var17 += var19 * var12;
					var11 += var16 * var19;
				}
				if (arg0 + arg2 > this.aClass_ra_Sub3_9355.anInt8635 * -711985315 * -1071049483) {
					var19 = arg0 + arg2 - this.aClass_ra_Sub3_9355.anInt8635 * -711985315 * -1071049483;
					arg2 -= var19;
					var18 += var19;
				}
				if (arg0 < this.aClass_ra_Sub3_9355.anInt8621 * 1907727929 * 512290825) {
					var19 = this.aClass_ra_Sub3_9355.anInt8621 * 1907727929 * 512290825 - arg0;
					arg2 -= var19;
					var17 += var19;
					var10 += var15 * var19;
					var18 += var19;
				}
				int var20;
				int var21;
				int var22;
				int var23;
				int var24;
				int var25;
				int var26;
				int var27;
				int var28;
				int var29;
				int var34;
				byte var35;
				if (arg6 != 0) {
					int var30;
					int var31;
					int var32;
					int var33;
					byte var38;
					if (arg6 != 1) {
						if (arg6 != 2) {
							throw new IllegalArgumentException();
						}
						if (arg4 == 1) {
							var19 = var10;
							for (var20 = -arg3; var20 < 0; var20++) {
								var21 = (var11 >> 16) * this.anInt9358;
								for (var22 = -arg2; var22 < 0; var22++) {
									var35 = this.aByteArray10095[(var10 >> 16) + var21];
									if (var35 == 0) {
										var17++;
									} else {
										var24 = this.anIntArray10096[var35 & 0xFF];
										var25 = var9[var17];
										var26 = var24 + var25;
										var27 = (var24 & 0xFF00FF) + (var25 & 0xFF00FF);
										var25 = (var27 & 0x1000100) + (var26 - var27 & 0x10000);
										var9[var17++] = var26 - var25 | var25 - (var25 >>> 8);
									}
									var10 += var15;
								}
								var11 += var16;
								var10 = var19;
								var17 += var18;
							}
						} else if (arg4 == 0) {
							var19 = var10;
							var20 = arg5 >> 16 & 0xFF;
							var21 = arg5 >> 8 & 0xFF;
							var22 = arg5 & 0xFF;
							for (var23 = -arg3; var23 < 0; var23++) {
								var24 = (var11 >> 16) * this.anInt9358;
								for (var25 = -arg2; var25 < 0; var25++) {
									byte var39 = this.aByteArray10095[(var10 >> 16) + var24];
									if (var39 == 0) {
										var17++;
									} else {
										var27 = this.anIntArray10096[var39 & 0xFF];
										var28 = (var27 & 0xFF0000) * var20 & 0xFF000000;
										var29 = (var27 & 0xFF00) * var21 & 0xFF0000;
										var30 = (var27 & 0xFF) * var22 & 0xFF00;
										var27 = (var28 | var29 | var30) >>> 8;
										var31 = var9[var17];
										var32 = var27 + var31;
										var33 = (var27 & 0xFF00FF) + (var31 & 0xFF00FF);
										var31 = (var33 & 0x1000100) + (var32 - var33 & 0x10000);
										var9[var17++] = var32 - var31 | var31 - (var31 >>> 8);
									}
									var10 += var15;
								}
								var11 += var16;
								var10 = var19;
								var17 += var18;
							}
						} else if (arg4 == 3) {
							var19 = var10;
							for (var20 = -arg3; var20 < 0; var20++) {
								var21 = (var11 >> 16) * this.anInt9358;
								for (var22 = -arg2; var22 < 0; var22++) {
									var35 = this.aByteArray10095[(var10 >> 16) + var21];
									var24 = var35 > 0 ? this.anIntArray10096[var35] : 0;
									var25 = var24 + arg5;
									var26 = (var24 & 0xFF00FF) + (arg5 & 0xFF00FF);
									var27 = (var26 & 0x1000100) + (var25 - var26 & 0x10000);
									var24 = var25 - var27 | var27 - (var27 >>> 8);
									var27 = var9[var17];
									var25 = var24 + var27;
									var26 = (var24 & 0xFF00FF) + (var27 & 0xFF00FF);
									var27 = (var26 & 0x1000100) + (var25 - var26 & 0x10000);
									var9[var17++] = var25 - var27 | var27 - (var27 >>> 8);
									var10 += var15;
								}
								var11 += var16;
								var10 = var19;
								var17 += var18;
							}
						} else if (arg4 == 2) {
							var19 = arg5 >>> 24;
							var20 = 256 - var19;
							var21 = (arg5 & 0xFF00FF) * var20 & 0xFF00FF00;
							var22 = (arg5 & 0xFF00) * var20 & 0xFF0000;
							var34 = (var21 | var22) >>> 8;
							var23 = var10;
							for (var24 = -arg3; var24 < 0; var24++) {
								var25 = (var11 >> 16) * this.anInt9358;
								for (var26 = -arg2; var26 < 0; var26++) {
									var38 = this.aByteArray10095[(var10 >> 16) + var25];
									if (var38 == 0) {
										var17++;
									} else {
										var28 = this.anIntArray10096[var38 & 0xFF];
										var21 = (var28 & 0xFF00FF) * var19 & 0xFF00FF00;
										var22 = (var28 & 0xFF00) * var19 & 0xFF0000;
										var28 = ((var21 | var22) >>> 8) + var34;
										var29 = var9[var17];
										var30 = var28 + var29;
										var31 = (var28 & 0xFF00FF) + (var29 & 0xFF00FF);
										var29 = (var31 & 0x1000100) + (var30 - var31 & 0x10000);
										var9[var17++] = var30 - var29 | var29 - (var29 >>> 8);
									}
									var10 += var15;
								}
								var11 += var16;
								var10 = var23;
								var17 += var18;
							}
						} else {
							throw new IllegalArgumentException();
						}
					} else if (arg4 == 1) {
						var19 = var10;
						for (var20 = -arg3; var20 < 0; var20++) {
							var21 = (var11 >> 16) * this.anInt9358;
							for (var22 = -arg2; var22 < 0; var22++) {
								var35 = this.aByteArray10095[(var10 >> 16) + var21];
								if (var35 == 0) {
									var17++;
								} else {
									var9[var17++] = this.anIntArray10096[var35 & 0xFF];
								}
								var10 += var15;
							}
							var11 += var16;
							var10 = var19;
							var17 += var18;
						}
					} else {
						byte var36;
						if (arg4 == 0) {
							var19 = var10;
							if ((arg5 & 0xFFFFFF) == 16777215) {
								var20 = arg5 >>> 24;
								var21 = 256 - var20;
								for (var22 = -arg3; var22 < 0; var22++) {
									var23 = (var11 >> 16) * this.anInt9358;
									for (var24 = -arg2; var24 < 0; var24++) {
										var36 = this.aByteArray10095[(var10 >> 16) + var23];
										if (var36 == 0) {
											var17++;
										} else {
											var26 = this.anIntArray10096[var36 & 0xFF];
											var27 = var9[var17];
											var9[var17++] = ((var26 & 0xFF00FF) * var20 + (var27 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var26 & 0xFF00) * var20 + (var27 & 0xFF00) * var21 & 0xFF0000) >> 8;
										}
										var10 += var15;
									}
									var11 += var16;
									var10 = var19;
									var17 += var18;
								}
							} else {
								var20 = arg5 >> 16 & 0xFF;
								var21 = arg5 >> 8 & 0xFF;
								var22 = arg5 & 0xFF;
								var23 = arg5 >>> 24;
								var24 = 256 - var23;
								for (var25 = -arg3; var25 < 0; var25++) {
									var26 = (var11 >> 16) * this.anInt9358;
									for (var27 = -arg2; var27 < 0; var27++) {
										byte var37 = this.aByteArray10095[(var10 >> 16) + var26];
										if (var37 == 0) {
											var17++;
										} else {
											var29 = this.anIntArray10096[var37 & 0xFF];
											if (var23 == 255) {
												var30 = (var29 & 0xFF0000) * var20 & 0xFF000000;
												var31 = (var29 & 0xFF00) * var21 & 0xFF0000;
												var32 = (var29 & 0xFF) * var22 & 0xFF00;
												var9[var17++] = (var30 | var31 | var32) >>> 8;
											} else {
												var30 = (var29 & 0xFF0000) * var20 & 0xFF000000;
												var31 = (var29 & 0xFF00) * var21 & 0xFF0000;
												var32 = (var29 & 0xFF) * var22 & 0xFF00;
												var29 = (var30 | var31 | var32) >>> 8;
												var33 = var9[var17];
												var9[var17++] = ((var29 & 0xFF00FF) * var23 + (var33 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var29 & 0xFF00) * var23 + (var33 & 0xFF00) * var24 & 0xFF0000) >> 8;
											}
										}
										var10 += var15;
									}
									var11 += var16;
									var10 = var19;
									var17 += var18;
								}
							}
						} else if (arg4 == 3) {
							var19 = var10;
							var20 = arg5 >>> 24;
							var21 = 256 - var20;
							for (var22 = -arg3; var22 < 0; var22++) {
								var23 = (var11 >> 16) * this.anInt9358;
								for (var24 = -arg2; var24 < 0; var24++) {
									var36 = this.aByteArray10095[(var10 >> 16) + var23];
									var26 = var36 > 0 ? this.anIntArray10096[var36] : 0;
									var27 = var26 + arg5;
									var28 = (var26 & 0xFF00FF) + (arg5 & 0xFF00FF);
									var29 = (var28 & 0x1000100) + (var27 - var28 & 0x10000);
									var29 = var27 - var29 | var29 - (var29 >>> 8);
									if (var26 == 0 && var20 != 255) {
										var26 = var29;
										var29 = var9[var17];
										var29 = ((var26 & 0xFF00FF) * var20 + (var29 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var26 & 0xFF00) * var20 + (var29 & 0xFF00) * var21 & 0xFF0000) >> 8;
									}
									var9[var17++] = var29;
									var10 += var15;
								}
								var11 += var16;
								var10 = var19;
								var17 += var18;
							}
						} else if (arg4 == 2) {
							var19 = arg5 >>> 24;
							var20 = 256 - var19;
							var21 = (arg5 & 0xFF00FF) * var20 & 0xFF00FF00;
							var22 = (arg5 & 0xFF00) * var20 & 0xFF0000;
							var34 = (var21 | var22) >>> 8;
							var23 = var10;
							for (var24 = -arg3; var24 < 0; var24++) {
								var25 = (var11 >> 16) * this.anInt9358;
								for (var26 = -arg2; var26 < 0; var26++) {
									var38 = this.aByteArray10095[(var10 >> 16) + var25];
									if (var38 == 0) {
										var17++;
									} else {
										var28 = this.anIntArray10096[var38 & 0xFF];
										var21 = (var28 & 0xFF00FF) * var19 & 0xFF00FF00;
										var22 = (var28 & 0xFF00) * var19 & 0xFF0000;
										var9[var17++] = ((var21 | var22) >>> 8) + var34;
									}
									var10 += var15;
								}
								var11 += var16;
								var10 = var23;
								var17 += var18;
							}
						} else {
							throw new IllegalArgumentException();
						}
					}
				} else if (arg4 == 1) {
					var19 = var10;
					for (var20 = -arg3; var20 < 0; var20++) {
						var21 = (var11 >> 16) * this.anInt9358;
						for (var22 = -arg2; var22 < 0; var22++) {
							var9[var17++] = this.anIntArray10096[this.aByteArray10095[(var10 >> 16) + var21] & 0xFF];
							var10 += var15;
						}
						var11 += var16;
						var10 = var19;
						var17 += var18;
					}
				} else if (arg4 == 0) {
					var19 = arg5 >> 16 & 0xFF;
					var20 = arg5 >> 8 & 0xFF;
					var21 = arg5 & 0xFF;
					var22 = var10;
					for (var23 = -arg3; var23 < 0; var23++) {
						var24 = (var11 >> 16) * this.anInt9358;
						for (var25 = -arg2; var25 < 0; var25++) {
							var26 = this.anIntArray10096[this.aByteArray10095[(var10 >> 16) + var24] & 0xFF];
							var27 = (var26 & 0xFF0000) * var19 & 0xFF000000;
							var28 = (var26 & 0xFF00) * var20 & 0xFF0000;
							var29 = (var26 & 0xFF) * var21 & 0xFF00;
							var9[var17++] = (var27 | var28 | var29) >>> 8;
							var10 += var15;
						}
						var11 += var16;
						var10 = var22;
						var17 += var18;
					}
				} else if (arg4 == 3) {
					var19 = var10;
					for (var20 = -arg3; var20 < 0; var20++) {
						var21 = (var11 >> 16) * this.anInt9358;
						for (var22 = -arg2; var22 < 0; var22++) {
							var35 = this.aByteArray10095[(var10 >> 16) + var21];
							var24 = var35 > 0 ? this.anIntArray10096[var35] : 0;
							var25 = var24 + arg5;
							var26 = (var24 & 0xFF00FF) + (arg5 & 0xFF00FF);
							var27 = (var26 & 0x1000100) + (var25 - var26 & 0x10000);
							var9[var17++] = var25 - var27 | var27 - (var27 >>> 8);
							var10 += var15;
						}
						var11 += var16;
						var10 = var19;
						var17 += var18;
					}
				} else if (arg4 == 2) {
					var19 = arg5 >>> 24;
					var20 = 256 - var19;
					var21 = (arg5 & 0xFF00FF) * var20 & 0xFF00FF00;
					var22 = (arg5 & 0xFF00) * var20 & 0xFF0000;
					var34 = (var21 | var22) >>> 8;
					var23 = var10;
					for (var24 = -arg3; var24 < 0; var24++) {
						var25 = (var11 >> 16) * this.anInt9358;
						for (var26 = -arg2; var26 < 0; var26++) {
							var27 = this.anIntArray10096[this.aByteArray10095[(var10 >> 16) + var25] & 0xFF];
							var21 = (var27 & 0xFF00FF) * var19 & 0xFF00FF00;
							var22 = (var27 & 0xFF00) * var19 & 0xFF0000;
							var9[var17++] = ((var21 | var22) >>> 8) + var34;
							var10 += var15;
						}
						var11 += var16;
						var10 = var23;
						var17 += var18;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		}
	}

	public void method747(boolean arg0, boolean arg1, boolean arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
		if (arg6 <= 0 || arg7 <= 0 || !arg0 && !arg1) {
			return;
		}
		int var14 = 0;
		int var15 = 0;
		int var16 = this.anInt9352 + this.anInt9358 + this.anInt9328;
		int var17 = this.anInt9327 + this.anInt9325 + this.anInt9337;
		int var18 = (var16 << 16) / arg6;
		int var19 = (var17 << 16) / arg7;
		int var20;
		if (this.anInt9352 > 0) {
			var20 = ((this.anInt9352 << 16) + var18 - 1) / var18;
			arg3 += var20;
			var14 += var20 * var18 - (this.anInt9352 << 16);
		}
		if (this.anInt9327 > 0) {
			var20 = ((this.anInt9327 << 16) + var19 - 1) / var19;
			arg4 += var20;
			var15 += var20 * var19 - (this.anInt9327 << 16);
		}
		if (this.anInt9358 < var16) {
			arg6 = ((this.anInt9358 << 16) - var14 + var18 - 1) / var18;
		}
		if (this.anInt9325 < var17) {
			arg7 = ((this.anInt9325 << 16) - var15 + var19 - 1) / var19;
		}
		var20 = arg3 + arg4 * this.aClass_ra_Sub3_9355.anInt8618 * -29235085 * -1504772933;
		int var21 = this.aClass_ra_Sub3_9355.anInt8618 * -29235085 * -1504772933 - arg6;
		if (arg4 + arg7 > this.aClass_ra_Sub3_9355.anInt8624 * -550983163 * 31822541) {
			arg7 -= arg4 + arg7 - this.aClass_ra_Sub3_9355.anInt8624 * -550983163 * 31822541;
		}
		int var22;
		if (arg4 < this.aClass_ra_Sub3_9355.anInt8623 * 766013039 * -1679642481) {
			var22 = this.aClass_ra_Sub3_9355.anInt8623 * 766013039 * -1679642481 - arg4;
			arg7 -= var22;
			var20 += var22 * this.aClass_ra_Sub3_9355.anInt8618 * -29235085 * -1504772933;
			var15 += var19 * var22;
		}
		if (arg3 + arg6 > this.aClass_ra_Sub3_9355.anInt8635 * -711985315 * -1071049483) {
			var22 = arg3 + arg6 - this.aClass_ra_Sub3_9355.anInt8635 * -711985315 * -1071049483;
			arg6 -= var22;
			var21 += var22;
		}
		if (arg3 < this.aClass_ra_Sub3_9355.anInt8621 * 1907727929 * 512290825) {
			var22 = this.aClass_ra_Sub3_9355.anInt8621 * 1907727929 * 512290825 - arg3;
			arg6 -= var22;
			var20 += var22;
			var14 += var18 * var22;
			var21 += var22;
		}
		float[] var40 = this.aClass_ra_Sub3_9355.aFloatArray8620;
		int[] var23 = this.aClass_ra_Sub3_9355.anIntArray8630;
		int var24;
		int var25;
		int var26;
		int var27;
		int var28;
		int var29;
		int var30;
		int var31;
		int var32;
		int var33;
		int var34;
		int var39;
		byte var41;
		if (arg10 != 0) {
			int var35;
			int var36;
			int var37;
			int var38;
			byte var44;
			if (arg10 != 1) {
				if (arg10 != 2) {
					throw new IllegalArgumentException();
				}
				if (arg8 == 1) {
					var24 = var14;
					for (var25 = -arg7; var25 < 0; var25++) {
						var26 = (var15 >> 16) * this.anInt9358;
						for (var27 = -arg6; var27 < 0; var27++) {
							if (!arg1 || arg5 < var40[var20]) {
								var41 = this.aByteArray10095[(var14 >> 16) + var26];
								if (var41 != 0) {
									if (arg0) {
										var29 = this.anIntArray10096[var41 & 0xFF];
										var30 = var23[var20];
										var31 = var29 + var30;
										var32 = (var29 & 0xFF00FF) + (var30 & 0xFF00FF);
										var30 = (var32 & 0x1000100) + (var31 - var32 & 0x10000);
										var23[var20] = var31 - var30 | var30 - (var30 >>> 8);
									}
									if (arg1 && arg12) {
										var40[var20] = arg5;
									}
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var24;
						var20 += var21;
					}
				} else if (arg8 == 0) {
					var24 = var14;
					var25 = arg9 >> 16 & 0xFF;
					var26 = arg9 >> 8 & 0xFF;
					var27 = arg9 & 0xFF;
					for (var28 = -arg7; var28 < 0; var28++) {
						var29 = (var15 >> 16) * this.anInt9358;
						for (var30 = -arg6; var30 < 0; var30++) {
							if (!arg1 || arg5 < var40[var20]) {
								byte var45 = this.aByteArray10095[(var14 >> 16) + var29];
								if (var45 != 0) {
									if (arg0) {
										var32 = this.anIntArray10096[var45 & 0xFF];
										var33 = (var32 & 0xFF0000) * var25 & 0xFF000000;
										var34 = (var32 & 0xFF00) * var26 & 0xFF0000;
										var35 = (var32 & 0xFF) * var27 & 0xFF00;
										var32 = (var33 | var34 | var35) >>> 8;
										var36 = var23[var20];
										var37 = var32 + var36;
										var38 = (var32 & 0xFF00FF) + (var36 & 0xFF00FF);
										var36 = (var38 & 0x1000100) + (var37 - var38 & 0x10000);
										var23[var20] = var37 - var36 | var36 - (var36 >>> 8);
									}
									if (arg1 && arg12) {
										var40[var20] = arg5;
									}
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var24;
						var20 += var21;
					}
				} else if (arg8 == 3) {
					var24 = var14;
					for (var25 = -arg7; var25 < 0; var25++) {
						var26 = (var15 >> 16) * this.anInt9358;
						for (var27 = -arg6; var27 < 0; var27++) {
							if (!arg1 || arg5 < var40[var20]) {
								if (arg0) {
									var41 = this.aByteArray10095[(var14 >> 16) + var26];
									var29 = var41 > 0 ? this.anIntArray10096[var41] : 0;
									var30 = var29 + arg9;
									var31 = (var29 & 0xFF00FF) + (arg9 & 0xFF00FF);
									var32 = (var31 & 0x1000100) + (var30 - var31 & 0x10000);
									var29 = var30 - var32 | var32 - (var32 >>> 8);
									var32 = var23[var20];
									var30 = var29 + var32;
									var31 = (var29 & 0xFF00FF) + (var32 & 0xFF00FF);
									var32 = (var31 & 0x1000100) + (var30 - var31 & 0x10000);
									var23[var20] = var30 - var32 | var32 - (var32 >>> 8);
								}
								if (arg1 && arg12) {
									var40[var20] = arg5;
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var24;
						var20 += var21;
					}
				} else if (arg8 == 2) {
					var24 = arg9 >>> 24;
					var25 = 256 - var24;
					var26 = (arg9 & 0xFF00FF) * var25 & 0xFF00FF00;
					var27 = (arg9 & 0xFF00) * var25 & 0xFF0000;
					var39 = (var26 | var27) >>> 8;
					var28 = var14;
					for (var29 = -arg7; var29 < 0; var29++) {
						var30 = (var15 >> 16) * this.anInt9358;
						for (var31 = -arg6; var31 < 0; var31++) {
							if (!arg1 || arg5 < var40[var20]) {
								var44 = this.aByteArray10095[(var14 >> 16) + var30];
								if (var44 != 0) {
									if (arg0) {
										var33 = this.anIntArray10096[var44 & 0xFF];
										var26 = (var33 & 0xFF00FF) * var24 & 0xFF00FF00;
										var27 = (var33 & 0xFF00) * var24 & 0xFF0000;
										var33 = ((var26 | var27) >>> 8) + var39;
										var34 = var23[var20];
										var35 = var33 + var34;
										var36 = (var33 & 0xFF00FF) + (var34 & 0xFF00FF);
										var34 = (var36 & 0x1000100) + (var35 - var36 & 0x10000);
										var23[var20] = var35 - var34 | var34 - (var34 >>> 8);
									}
									if (arg1 && arg12) {
										var40[var20] = arg5;
									}
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var28;
						var20 += var21;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg8 == 1) {
				var24 = var14;
				for (var25 = -arg7; var25 < 0; var25++) {
					var26 = (var15 >> 16) * this.anInt9358;
					for (var27 = -arg6; var27 < 0; var27++) {
						if (!arg1 || arg5 < var40[var20]) {
							var41 = this.aByteArray10095[(var14 >> 16) + var26];
							if (var41 != 0) {
								if (arg0) {
									var23[var20] = this.anIntArray10096[var41 & 0xFF];
								}
								if (arg1 && arg12) {
									var40[var20] = arg5;
								}
							}
						}
						var14 += var18;
						var20++;
					}
					var15 += var19;
					var14 = var24;
					var20 += var21;
				}
			} else {
				byte var42;
				if (arg8 == 0) {
					var24 = var14;
					if ((arg9 & 0xFFFFFF) == 16777215) {
						var25 = arg9 >>> 24;
						var26 = 256 - var25;
						for (var27 = -arg7; var27 < 0; var27++) {
							var28 = (var15 >> 16) * this.anInt9358;
							for (var29 = -arg6; var29 < 0; var29++) {
								if (!arg1 || arg5 < var40[var20]) {
									var42 = this.aByteArray10095[(var14 >> 16) + var28];
									if (var42 != 0) {
										if (arg0) {
											var31 = this.anIntArray10096[var42 & 0xFF];
											var32 = var23[var20];
											var23[var20] = ((var31 & 0xFF00FF) * var25 + (var32 & 0xFF00FF) * var26 & 0xFF00FF00) + ((var31 & 0xFF00) * var25 + (var32 & 0xFF00) * var26 & 0xFF0000) >> 8;
										}
										if (arg1 && arg12) {
											var40[var20] = arg5;
										}
									}
								}
								var14 += var18;
								var20++;
							}
							var15 += var19;
							var14 = var24;
							var20 += var21;
						}
					} else {
						var25 = arg9 >> 16 & 0xFF;
						var26 = arg9 >> 8 & 0xFF;
						var27 = arg9 & 0xFF;
						var28 = arg9 >>> 24;
						var29 = 256 - var28;
						for (var30 = -arg7; var30 < 0; var30++) {
							var31 = (var15 >> 16) * this.anInt9358;
							for (var32 = -arg6; var32 < 0; var32++) {
								if (!arg1 || arg5 < var40[var20]) {
									byte var43 = this.aByteArray10095[(var14 >> 16) + var31];
									if (var43 != 0) {
										var34 = this.anIntArray10096[var43 & 0xFF];
										if (var28 == 255) {
											if (arg0) {
												var35 = (var34 & 0xFF0000) * var25 & 0xFF000000;
												var36 = (var34 & 0xFF00) * var26 & 0xFF0000;
												var37 = (var34 & 0xFF) * var27 & 0xFF00;
												var23[var20] = (var35 | var36 | var37) >>> 8;
											}
											if (arg1 && arg12) {
												var40[var20] = arg5;
											}
										} else {
											if (arg0) {
												var35 = (var34 & 0xFF0000) * var25 & 0xFF000000;
												var36 = (var34 & 0xFF00) * var26 & 0xFF0000;
												var37 = (var34 & 0xFF) * var27 & 0xFF00;
												var34 = (var35 | var36 | var37) >>> 8;
												var38 = var23[var20];
												var23[var20] = ((var34 & 0xFF00FF) * var28 + (var38 & 0xFF00FF) * var29 & 0xFF00FF00) + ((var34 & 0xFF00) * var28 + (var38 & 0xFF00) * var29 & 0xFF0000) >> 8;
											}
											if (arg1 && arg12) {
												var40[var20] = arg5;
											}
										}
									}
								}
								var14 += var18;
								var20++;
							}
							var15 += var19;
							var14 = var24;
							var20 += var21;
						}
					}
				} else if (arg8 == 3) {
					var24 = var14;
					var25 = arg9 >>> 24;
					var26 = 256 - var25;
					for (var27 = -arg7; var27 < 0; var27++) {
						var28 = (var15 >> 16) * this.anInt9358;
						for (var29 = -arg6; var29 < 0; var29++) {
							if (!arg1 || arg5 < var40[var20]) {
								if (arg0) {
									var42 = this.aByteArray10095[(var14 >> 16) + var28];
									var31 = var42 > 0 ? this.anIntArray10096[var42] : 0;
									var32 = var31 + arg9;
									var33 = (var31 & 0xFF00FF) + (arg9 & 0xFF00FF);
									var34 = (var33 & 0x1000100) + (var32 - var33 & 0x10000);
									var34 = var32 - var34 | var34 - (var34 >>> 8);
									if (var31 == 0 && var25 != 255) {
										var31 = var34;
										var34 = var23[var20];
										var34 = ((var31 & 0xFF00FF) * var25 + (var34 & 0xFF00FF) * var26 & 0xFF00FF00) + ((var31 & 0xFF00) * var25 + (var34 & 0xFF00) * var26 & 0xFF0000) >> 8;
									}
									var23[var20] = var34;
								}
								if (arg1 && arg12) {
									var40[var20] = arg5;
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var24;
						var20 += var21;
					}
				} else if (arg8 == 2) {
					var24 = arg9 >>> 24;
					var25 = 256 - var24;
					var26 = (arg9 & 0xFF00FF) * var25 & 0xFF00FF00;
					var27 = (arg9 & 0xFF00) * var25 & 0xFF0000;
					var39 = (var26 | var27) >>> 8;
					var28 = var14;
					for (var29 = -arg7; var29 < 0; var29++) {
						var30 = (var15 >> 16) * this.anInt9358;
						for (var31 = -arg6; var31 < 0; var31++) {
							if (!arg1 || arg5 < var40[var20]) {
								var44 = this.aByteArray10095[(var14 >> 16) + var30];
								if (var44 != 0) {
									if (arg0) {
										var33 = this.anIntArray10096[var44 & 0xFF];
										var26 = (var33 & 0xFF00FF) * var24 & 0xFF00FF00;
										var27 = (var33 & 0xFF00) * var24 & 0xFF0000;
										var23[var20] = ((var26 | var27) >>> 8) + var39;
									}
									if (arg1 && arg12) {
										var40[var20] = arg5;
									}
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var28;
						var20 += var21;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg8 == 1) {
			var24 = var14;
			for (var25 = -arg7; var25 < 0; var25++) {
				var26 = (var15 >> 16) * this.anInt9358;
				for (var27 = -arg6; var27 < 0; var27++) {
					if (!arg1 || arg5 < var40[var20]) {
						if (arg0) {
							var23[var20] = this.anIntArray10096[this.aByteArray10095[(var14 >> 16) + var26] & 0xFF];
						}
						if (arg1 && arg12) {
							var40[var20] = arg5;
						}
					}
					var14 += var18;
					var20++;
				}
				var15 += var19;
				var14 = var24;
				var20 += var21;
			}
		} else if (arg8 == 0) {
			var24 = arg9 >> 16 & 0xFF;
			var25 = arg9 >> 8 & 0xFF;
			var26 = arg9 & 0xFF;
			var27 = var14;
			for (var28 = -arg7; var28 < 0; var28++) {
				var29 = (var15 >> 16) * this.anInt9358;
				for (var30 = -arg6; var30 < 0; var30++) {
					if (!arg1 || arg5 < var40[var20]) {
						if (arg0) {
							var31 = this.anIntArray10096[this.aByteArray10095[(var14 >> 16) + var29] & 0xFF];
							var32 = (var31 & 0xFF0000) * var24 & 0xFF000000;
							var33 = (var31 & 0xFF00) * var25 & 0xFF0000;
							var34 = (var31 & 0xFF) * var26 & 0xFF00;
							var23[var20] = (var32 | var33 | var34) >>> 8;
						}
						if (arg1 && arg12) {
							var40[var20] = arg5;
						}
					}
					var14 += var18;
					var20++;
				}
				var15 += var19;
				var14 = var27;
				var20 += var21;
			}
		} else if (arg8 == 3) {
			var24 = var14;
			for (var25 = -arg7; var25 < 0; var25++) {
				var26 = (var15 >> 16) * this.anInt9358;
				for (var27 = -arg6; var27 < 0; var27++) {
					if (!arg1 || arg5 < var40[var20]) {
						if (arg0) {
							var41 = this.aByteArray10095[(var14 >> 16) + var26];
							var29 = var41 > 0 ? this.anIntArray10096[var41] : 0;
							var30 = var29 + arg9;
							var31 = (var29 & 0xFF00FF) + (arg9 & 0xFF00FF);
							var32 = (var31 & 0x1000100) + (var30 - var31 & 0x10000);
							var23[var20] = var30 - var32 | var32 - (var32 >>> 8);
						}
						if (arg1 && arg12) {
							var40[var20] = arg5;
						}
					}
					var14 += var18;
					var20++;
				}
				var15 += var19;
				var14 = var24;
				var20 += var21;
			}
		} else if (arg8 == 2) {
			var24 = arg9 >>> 24;
			var25 = 256 - var24;
			var26 = (arg9 & 0xFF00FF) * var25 & 0xFF00FF00;
			var27 = (arg9 & 0xFF00) * var25 & 0xFF0000;
			var39 = (var26 | var27) >>> 8;
			var28 = var14;
			for (var29 = -arg7; var29 < 0; var29++) {
				var30 = (var15 >> 16) * this.anInt9358;
				for (var31 = -arg6; var31 < 0; var31++) {
					if (!arg1 || arg5 < var40[var20]) {
						if (arg0) {
							var32 = this.anIntArray10096[this.aByteArray10095[(var14 >> 16) + var30] & 0xFF];
							var26 = (var32 & 0xFF00FF) * var24 & 0xFF00FF00;
							var27 = (var32 & 0xFF00) * var24 & 0xFF0000;
							var23[var20] = ((var26 | var27) >>> 8) + var39;
						}
						if (arg1 && arg12) {
							var40[var20] = arg5;
						}
					}
					var14 += var18;
					var20++;
				}
				var15 += var19;
				var14 = var28;
				var20 += var21;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method744(boolean arg0, boolean arg1, boolean arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
		if (arg6 <= 0 || arg7 <= 0 || !arg0 && !arg1) {
			return;
		}
		int var14 = 0;
		int var15 = 0;
		int var16 = this.anInt9352 + this.anInt9358 + this.anInt9328;
		int var17 = this.anInt9327 + this.anInt9325 + this.anInt9337;
		int var18 = (var16 << 16) / arg6;
		int var19 = (var17 << 16) / arg7;
		int var20;
		if (this.anInt9352 > 0) {
			var20 = ((this.anInt9352 << 16) + var18 - 1) / var18;
			arg3 += var20;
			var14 += var20 * var18 - (this.anInt9352 << 16);
		}
		if (this.anInt9327 > 0) {
			var20 = ((this.anInt9327 << 16) + var19 - 1) / var19;
			arg4 += var20;
			var15 += var20 * var19 - (this.anInt9327 << 16);
		}
		if (this.anInt9358 < var16) {
			arg6 = ((this.anInt9358 << 16) - var14 + var18 - 1) / var18;
		}
		if (this.anInt9325 < var17) {
			arg7 = ((this.anInt9325 << 16) - var15 + var19 - 1) / var19;
		}
		var20 = arg3 + arg4 * this.aClass_ra_Sub3_9355.anInt8618 * -29235085 * -1504772933;
		int var21 = this.aClass_ra_Sub3_9355.anInt8618 * -29235085 * -1504772933 - arg6;
		if (arg4 + arg7 > this.aClass_ra_Sub3_9355.anInt8624 * -550983163 * 31822541) {
			arg7 -= arg4 + arg7 - this.aClass_ra_Sub3_9355.anInt8624 * -550983163 * 31822541;
		}
		int var22;
		if (arg4 < this.aClass_ra_Sub3_9355.anInt8623 * 766013039 * -1679642481) {
			var22 = this.aClass_ra_Sub3_9355.anInt8623 * 766013039 * -1679642481 - arg4;
			arg7 -= var22;
			var20 += var22 * this.aClass_ra_Sub3_9355.anInt8618 * -29235085 * -1504772933;
			var15 += var19 * var22;
		}
		if (arg3 + arg6 > this.aClass_ra_Sub3_9355.anInt8635 * -711985315 * -1071049483) {
			var22 = arg3 + arg6 - this.aClass_ra_Sub3_9355.anInt8635 * -711985315 * -1071049483;
			arg6 -= var22;
			var21 += var22;
		}
		if (arg3 < this.aClass_ra_Sub3_9355.anInt8621 * 1907727929 * 512290825) {
			var22 = this.aClass_ra_Sub3_9355.anInt8621 * 1907727929 * 512290825 - arg3;
			arg6 -= var22;
			var20 += var22;
			var14 += var18 * var22;
			var21 += var22;
		}
		float[] var40 = this.aClass_ra_Sub3_9355.aFloatArray8620;
		int[] var23 = this.aClass_ra_Sub3_9355.anIntArray8630;
		int var24;
		int var25;
		int var26;
		int var27;
		int var28;
		int var29;
		int var30;
		int var31;
		int var32;
		int var33;
		int var34;
		int var39;
		byte var41;
		if (arg10 != 0) {
			int var35;
			int var36;
			int var37;
			int var38;
			byte var44;
			if (arg10 != 1) {
				if (arg10 != 2) {
					throw new IllegalArgumentException();
				}
				if (arg8 == 1) {
					var24 = var14;
					for (var25 = -arg7; var25 < 0; var25++) {
						var26 = (var15 >> 16) * this.anInt9358;
						for (var27 = -arg6; var27 < 0; var27++) {
							if (!arg1 || arg5 < var40[var20]) {
								var41 = this.aByteArray10095[(var14 >> 16) + var26];
								if (var41 != 0) {
									if (arg0) {
										var29 = this.anIntArray10096[var41 & 0xFF];
										var30 = var23[var20];
										var31 = var29 + var30;
										var32 = (var29 & 0xFF00FF) + (var30 & 0xFF00FF);
										var30 = (var32 & 0x1000100) + (var31 - var32 & 0x10000);
										var23[var20] = var31 - var30 | var30 - (var30 >>> 8);
									}
									if (arg1 && arg12) {
										var40[var20] = arg5;
									}
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var24;
						var20 += var21;
					}
				} else if (arg8 == 0) {
					var24 = var14;
					var25 = arg9 >> 16 & 0xFF;
					var26 = arg9 >> 8 & 0xFF;
					var27 = arg9 & 0xFF;
					for (var28 = -arg7; var28 < 0; var28++) {
						var29 = (var15 >> 16) * this.anInt9358;
						for (var30 = -arg6; var30 < 0; var30++) {
							if (!arg1 || arg5 < var40[var20]) {
								byte var45 = this.aByteArray10095[(var14 >> 16) + var29];
								if (var45 != 0) {
									if (arg0) {
										var32 = this.anIntArray10096[var45 & 0xFF];
										var33 = (var32 & 0xFF0000) * var25 & 0xFF000000;
										var34 = (var32 & 0xFF00) * var26 & 0xFF0000;
										var35 = (var32 & 0xFF) * var27 & 0xFF00;
										var32 = (var33 | var34 | var35) >>> 8;
										var36 = var23[var20];
										var37 = var32 + var36;
										var38 = (var32 & 0xFF00FF) + (var36 & 0xFF00FF);
										var36 = (var38 & 0x1000100) + (var37 - var38 & 0x10000);
										var23[var20] = var37 - var36 | var36 - (var36 >>> 8);
									}
									if (arg1 && arg12) {
										var40[var20] = arg5;
									}
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var24;
						var20 += var21;
					}
				} else if (arg8 == 3) {
					var24 = var14;
					for (var25 = -arg7; var25 < 0; var25++) {
						var26 = (var15 >> 16) * this.anInt9358;
						for (var27 = -arg6; var27 < 0; var27++) {
							if (!arg1 || arg5 < var40[var20]) {
								if (arg0) {
									var41 = this.aByteArray10095[(var14 >> 16) + var26];
									var29 = var41 > 0 ? this.anIntArray10096[var41] : 0;
									var30 = var29 + arg9;
									var31 = (var29 & 0xFF00FF) + (arg9 & 0xFF00FF);
									var32 = (var31 & 0x1000100) + (var30 - var31 & 0x10000);
									var29 = var30 - var32 | var32 - (var32 >>> 8);
									var32 = var23[var20];
									var30 = var29 + var32;
									var31 = (var29 & 0xFF00FF) + (var32 & 0xFF00FF);
									var32 = (var31 & 0x1000100) + (var30 - var31 & 0x10000);
									var23[var20] = var30 - var32 | var32 - (var32 >>> 8);
								}
								if (arg1 && arg12) {
									var40[var20] = arg5;
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var24;
						var20 += var21;
					}
				} else if (arg8 == 2) {
					var24 = arg9 >>> 24;
					var25 = 256 - var24;
					var26 = (arg9 & 0xFF00FF) * var25 & 0xFF00FF00;
					var27 = (arg9 & 0xFF00) * var25 & 0xFF0000;
					var39 = (var26 | var27) >>> 8;
					var28 = var14;
					for (var29 = -arg7; var29 < 0; var29++) {
						var30 = (var15 >> 16) * this.anInt9358;
						for (var31 = -arg6; var31 < 0; var31++) {
							if (!arg1 || arg5 < var40[var20]) {
								var44 = this.aByteArray10095[(var14 >> 16) + var30];
								if (var44 != 0) {
									if (arg0) {
										var33 = this.anIntArray10096[var44 & 0xFF];
										var26 = (var33 & 0xFF00FF) * var24 & 0xFF00FF00;
										var27 = (var33 & 0xFF00) * var24 & 0xFF0000;
										var33 = ((var26 | var27) >>> 8) + var39;
										var34 = var23[var20];
										var35 = var33 + var34;
										var36 = (var33 & 0xFF00FF) + (var34 & 0xFF00FF);
										var34 = (var36 & 0x1000100) + (var35 - var36 & 0x10000);
										var23[var20] = var35 - var34 | var34 - (var34 >>> 8);
									}
									if (arg1 && arg12) {
										var40[var20] = arg5;
									}
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var28;
						var20 += var21;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg8 == 1) {
				var24 = var14;
				for (var25 = -arg7; var25 < 0; var25++) {
					var26 = (var15 >> 16) * this.anInt9358;
					for (var27 = -arg6; var27 < 0; var27++) {
						if (!arg1 || arg5 < var40[var20]) {
							var41 = this.aByteArray10095[(var14 >> 16) + var26];
							if (var41 != 0) {
								if (arg0) {
									var23[var20] = this.anIntArray10096[var41 & 0xFF];
								}
								if (arg1 && arg12) {
									var40[var20] = arg5;
								}
							}
						}
						var14 += var18;
						var20++;
					}
					var15 += var19;
					var14 = var24;
					var20 += var21;
				}
			} else {
				byte var42;
				if (arg8 == 0) {
					var24 = var14;
					if ((arg9 & 0xFFFFFF) == 16777215) {
						var25 = arg9 >>> 24;
						var26 = 256 - var25;
						for (var27 = -arg7; var27 < 0; var27++) {
							var28 = (var15 >> 16) * this.anInt9358;
							for (var29 = -arg6; var29 < 0; var29++) {
								if (!arg1 || arg5 < var40[var20]) {
									var42 = this.aByteArray10095[(var14 >> 16) + var28];
									if (var42 != 0) {
										if (arg0) {
											var31 = this.anIntArray10096[var42 & 0xFF];
											var32 = var23[var20];
											var23[var20] = ((var31 & 0xFF00FF) * var25 + (var32 & 0xFF00FF) * var26 & 0xFF00FF00) + ((var31 & 0xFF00) * var25 + (var32 & 0xFF00) * var26 & 0xFF0000) >> 8;
										}
										if (arg1 && arg12) {
											var40[var20] = arg5;
										}
									}
								}
								var14 += var18;
								var20++;
							}
							var15 += var19;
							var14 = var24;
							var20 += var21;
						}
					} else {
						var25 = arg9 >> 16 & 0xFF;
						var26 = arg9 >> 8 & 0xFF;
						var27 = arg9 & 0xFF;
						var28 = arg9 >>> 24;
						var29 = 256 - var28;
						for (var30 = -arg7; var30 < 0; var30++) {
							var31 = (var15 >> 16) * this.anInt9358;
							for (var32 = -arg6; var32 < 0; var32++) {
								if (!arg1 || arg5 < var40[var20]) {
									byte var43 = this.aByteArray10095[(var14 >> 16) + var31];
									if (var43 != 0) {
										var34 = this.anIntArray10096[var43 & 0xFF];
										if (var28 == 255) {
											if (arg0) {
												var35 = (var34 & 0xFF0000) * var25 & 0xFF000000;
												var36 = (var34 & 0xFF00) * var26 & 0xFF0000;
												var37 = (var34 & 0xFF) * var27 & 0xFF00;
												var23[var20] = (var35 | var36 | var37) >>> 8;
											}
											if (arg1 && arg12) {
												var40[var20] = arg5;
											}
										} else {
											if (arg0) {
												var35 = (var34 & 0xFF0000) * var25 & 0xFF000000;
												var36 = (var34 & 0xFF00) * var26 & 0xFF0000;
												var37 = (var34 & 0xFF) * var27 & 0xFF00;
												var34 = (var35 | var36 | var37) >>> 8;
												var38 = var23[var20];
												var23[var20] = ((var34 & 0xFF00FF) * var28 + (var38 & 0xFF00FF) * var29 & 0xFF00FF00) + ((var34 & 0xFF00) * var28 + (var38 & 0xFF00) * var29 & 0xFF0000) >> 8;
											}
											if (arg1 && arg12) {
												var40[var20] = arg5;
											}
										}
									}
								}
								var14 += var18;
								var20++;
							}
							var15 += var19;
							var14 = var24;
							var20 += var21;
						}
					}
				} else if (arg8 == 3) {
					var24 = var14;
					var25 = arg9 >>> 24;
					var26 = 256 - var25;
					for (var27 = -arg7; var27 < 0; var27++) {
						var28 = (var15 >> 16) * this.anInt9358;
						for (var29 = -arg6; var29 < 0; var29++) {
							if (!arg1 || arg5 < var40[var20]) {
								if (arg0) {
									var42 = this.aByteArray10095[(var14 >> 16) + var28];
									var31 = var42 > 0 ? this.anIntArray10096[var42] : 0;
									var32 = var31 + arg9;
									var33 = (var31 & 0xFF00FF) + (arg9 & 0xFF00FF);
									var34 = (var33 & 0x1000100) + (var32 - var33 & 0x10000);
									var34 = var32 - var34 | var34 - (var34 >>> 8);
									if (var31 == 0 && var25 != 255) {
										var31 = var34;
										var34 = var23[var20];
										var34 = ((var31 & 0xFF00FF) * var25 + (var34 & 0xFF00FF) * var26 & 0xFF00FF00) + ((var31 & 0xFF00) * var25 + (var34 & 0xFF00) * var26 & 0xFF0000) >> 8;
									}
									var23[var20] = var34;
								}
								if (arg1 && arg12) {
									var40[var20] = arg5;
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var24;
						var20 += var21;
					}
				} else if (arg8 == 2) {
					var24 = arg9 >>> 24;
					var25 = 256 - var24;
					var26 = (arg9 & 0xFF00FF) * var25 & 0xFF00FF00;
					var27 = (arg9 & 0xFF00) * var25 & 0xFF0000;
					var39 = (var26 | var27) >>> 8;
					var28 = var14;
					for (var29 = -arg7; var29 < 0; var29++) {
						var30 = (var15 >> 16) * this.anInt9358;
						for (var31 = -arg6; var31 < 0; var31++) {
							if (!arg1 || arg5 < var40[var20]) {
								var44 = this.aByteArray10095[(var14 >> 16) + var30];
								if (var44 != 0) {
									if (arg0) {
										var33 = this.anIntArray10096[var44 & 0xFF];
										var26 = (var33 & 0xFF00FF) * var24 & 0xFF00FF00;
										var27 = (var33 & 0xFF00) * var24 & 0xFF0000;
										var23[var20] = ((var26 | var27) >>> 8) + var39;
									}
									if (arg1 && arg12) {
										var40[var20] = arg5;
									}
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var28;
						var20 += var21;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg8 == 1) {
			var24 = var14;
			for (var25 = -arg7; var25 < 0; var25++) {
				var26 = (var15 >> 16) * this.anInt9358;
				for (var27 = -arg6; var27 < 0; var27++) {
					if (!arg1 || arg5 < var40[var20]) {
						if (arg0) {
							var23[var20] = this.anIntArray10096[this.aByteArray10095[(var14 >> 16) + var26] & 0xFF];
						}
						if (arg1 && arg12) {
							var40[var20] = arg5;
						}
					}
					var14 += var18;
					var20++;
				}
				var15 += var19;
				var14 = var24;
				var20 += var21;
			}
		} else if (arg8 == 0) {
			var24 = arg9 >> 16 & 0xFF;
			var25 = arg9 >> 8 & 0xFF;
			var26 = arg9 & 0xFF;
			var27 = var14;
			for (var28 = -arg7; var28 < 0; var28++) {
				var29 = (var15 >> 16) * this.anInt9358;
				for (var30 = -arg6; var30 < 0; var30++) {
					if (!arg1 || arg5 < var40[var20]) {
						if (arg0) {
							var31 = this.anIntArray10096[this.aByteArray10095[(var14 >> 16) + var29] & 0xFF];
							var32 = (var31 & 0xFF0000) * var24 & 0xFF000000;
							var33 = (var31 & 0xFF00) * var25 & 0xFF0000;
							var34 = (var31 & 0xFF) * var26 & 0xFF00;
							var23[var20] = (var32 | var33 | var34) >>> 8;
						}
						if (arg1 && arg12) {
							var40[var20] = arg5;
						}
					}
					var14 += var18;
					var20++;
				}
				var15 += var19;
				var14 = var27;
				var20 += var21;
			}
		} else if (arg8 == 3) {
			var24 = var14;
			for (var25 = -arg7; var25 < 0; var25++) {
				var26 = (var15 >> 16) * this.anInt9358;
				for (var27 = -arg6; var27 < 0; var27++) {
					if (!arg1 || arg5 < var40[var20]) {
						if (arg0) {
							var41 = this.aByteArray10095[(var14 >> 16) + var26];
							var29 = var41 > 0 ? this.anIntArray10096[var41] : 0;
							var30 = var29 + arg9;
							var31 = (var29 & 0xFF00FF) + (arg9 & 0xFF00FF);
							var32 = (var31 & 0x1000100) + (var30 - var31 & 0x10000);
							var23[var20] = var30 - var32 | var32 - (var32 >>> 8);
						}
						if (arg1 && arg12) {
							var40[var20] = arg5;
						}
					}
					var14 += var18;
					var20++;
				}
				var15 += var19;
				var14 = var24;
				var20 += var21;
			}
		} else if (arg8 == 2) {
			var24 = arg9 >>> 24;
			var25 = 256 - var24;
			var26 = (arg9 & 0xFF00FF) * var25 & 0xFF00FF00;
			var27 = (arg9 & 0xFF00) * var25 & 0xFF0000;
			var39 = (var26 | var27) >>> 8;
			var28 = var14;
			for (var29 = -arg7; var29 < 0; var29++) {
				var30 = (var15 >> 16) * this.anInt9358;
				for (var31 = -arg6; var31 < 0; var31++) {
					if (!arg1 || arg5 < var40[var20]) {
						if (arg0) {
							var32 = this.anIntArray10096[this.aByteArray10095[(var14 >> 16) + var30] & 0xFF];
							var26 = (var32 & 0xFF00FF) * var24 & 0xFF00FF00;
							var27 = (var32 & 0xFF00) * var24 & 0xFF0000;
							var23[var20] = ((var26 | var27) >>> 8) + var39;
						}
						if (arg1 && arg12) {
							var40[var20] = arg5;
						}
					}
					var14 += var18;
					var20++;
				}
				var15 += var19;
				var14 = var28;
				var20 += var21;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method754(boolean arg0, boolean arg1, boolean arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
		if (arg6 <= 0 || arg7 <= 0 || !arg0 && !arg1) {
			return;
		}
		int var14 = 0;
		int var15 = 0;
		int var16 = this.anInt9352 + this.anInt9358 + this.anInt9328;
		int var17 = this.anInt9327 + this.anInt9325 + this.anInt9337;
		int var18 = (var16 << 16) / arg6;
		int var19 = (var17 << 16) / arg7;
		int var20;
		if (this.anInt9352 > 0) {
			var20 = ((this.anInt9352 << 16) + var18 - 1) / var18;
			arg3 += var20;
			var14 += var20 * var18 - (this.anInt9352 << 16);
		}
		if (this.anInt9327 > 0) {
			var20 = ((this.anInt9327 << 16) + var19 - 1) / var19;
			arg4 += var20;
			var15 += var20 * var19 - (this.anInt9327 << 16);
		}
		if (this.anInt9358 < var16) {
			arg6 = ((this.anInt9358 << 16) - var14 + var18 - 1) / var18;
		}
		if (this.anInt9325 < var17) {
			arg7 = ((this.anInt9325 << 16) - var15 + var19 - 1) / var19;
		}
		var20 = arg3 + arg4 * this.aClass_ra_Sub3_9355.anInt8618 * -29235085 * -1504772933;
		int var21 = this.aClass_ra_Sub3_9355.anInt8618 * -29235085 * -1504772933 - arg6;
		if (arg4 + arg7 > this.aClass_ra_Sub3_9355.anInt8624 * -550983163 * 31822541) {
			arg7 -= arg4 + arg7 - this.aClass_ra_Sub3_9355.anInt8624 * -550983163 * 31822541;
		}
		int var22;
		if (arg4 < this.aClass_ra_Sub3_9355.anInt8623 * 766013039 * -1679642481) {
			var22 = this.aClass_ra_Sub3_9355.anInt8623 * 766013039 * -1679642481 - arg4;
			arg7 -= var22;
			var20 += var22 * this.aClass_ra_Sub3_9355.anInt8618 * -29235085 * -1504772933;
			var15 += var19 * var22;
		}
		if (arg3 + arg6 > this.aClass_ra_Sub3_9355.anInt8635 * -711985315 * -1071049483) {
			var22 = arg3 + arg6 - this.aClass_ra_Sub3_9355.anInt8635 * -711985315 * -1071049483;
			arg6 -= var22;
			var21 += var22;
		}
		if (arg3 < this.aClass_ra_Sub3_9355.anInt8621 * 1907727929 * 512290825) {
			var22 = this.aClass_ra_Sub3_9355.anInt8621 * 1907727929 * 512290825 - arg3;
			arg6 -= var22;
			var20 += var22;
			var14 += var18 * var22;
			var21 += var22;
		}
		float[] var40 = this.aClass_ra_Sub3_9355.aFloatArray8620;
		int[] var23 = this.aClass_ra_Sub3_9355.anIntArray8630;
		int var24;
		int var25;
		int var26;
		int var27;
		int var28;
		int var29;
		int var30;
		int var31;
		int var32;
		int var33;
		int var34;
		int var39;
		byte var41;
		if (arg10 != 0) {
			int var35;
			int var36;
			int var37;
			int var38;
			byte var44;
			if (arg10 != 1) {
				if (arg10 != 2) {
					throw new IllegalArgumentException();
				}
				if (arg8 == 1) {
					var24 = var14;
					for (var25 = -arg7; var25 < 0; var25++) {
						var26 = (var15 >> 16) * this.anInt9358;
						for (var27 = -arg6; var27 < 0; var27++) {
							if (!arg1 || arg5 < var40[var20]) {
								var41 = this.aByteArray10095[(var14 >> 16) + var26];
								if (var41 != 0) {
									if (arg0) {
										var29 = this.anIntArray10096[var41 & 0xFF];
										var30 = var23[var20];
										var31 = var29 + var30;
										var32 = (var29 & 0xFF00FF) + (var30 & 0xFF00FF);
										var30 = (var32 & 0x1000100) + (var31 - var32 & 0x10000);
										var23[var20] = var31 - var30 | var30 - (var30 >>> 8);
									}
									if (arg1 && arg12) {
										var40[var20] = arg5;
									}
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var24;
						var20 += var21;
					}
				} else if (arg8 == 0) {
					var24 = var14;
					var25 = arg9 >> 16 & 0xFF;
					var26 = arg9 >> 8 & 0xFF;
					var27 = arg9 & 0xFF;
					for (var28 = -arg7; var28 < 0; var28++) {
						var29 = (var15 >> 16) * this.anInt9358;
						for (var30 = -arg6; var30 < 0; var30++) {
							if (!arg1 || arg5 < var40[var20]) {
								byte var45 = this.aByteArray10095[(var14 >> 16) + var29];
								if (var45 != 0) {
									if (arg0) {
										var32 = this.anIntArray10096[var45 & 0xFF];
										var33 = (var32 & 0xFF0000) * var25 & 0xFF000000;
										var34 = (var32 & 0xFF00) * var26 & 0xFF0000;
										var35 = (var32 & 0xFF) * var27 & 0xFF00;
										var32 = (var33 | var34 | var35) >>> 8;
										var36 = var23[var20];
										var37 = var32 + var36;
										var38 = (var32 & 0xFF00FF) + (var36 & 0xFF00FF);
										var36 = (var38 & 0x1000100) + (var37 - var38 & 0x10000);
										var23[var20] = var37 - var36 | var36 - (var36 >>> 8);
									}
									if (arg1 && arg12) {
										var40[var20] = arg5;
									}
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var24;
						var20 += var21;
					}
				} else if (arg8 == 3) {
					var24 = var14;
					for (var25 = -arg7; var25 < 0; var25++) {
						var26 = (var15 >> 16) * this.anInt9358;
						for (var27 = -arg6; var27 < 0; var27++) {
							if (!arg1 || arg5 < var40[var20]) {
								if (arg0) {
									var41 = this.aByteArray10095[(var14 >> 16) + var26];
									var29 = var41 > 0 ? this.anIntArray10096[var41] : 0;
									var30 = var29 + arg9;
									var31 = (var29 & 0xFF00FF) + (arg9 & 0xFF00FF);
									var32 = (var31 & 0x1000100) + (var30 - var31 & 0x10000);
									var29 = var30 - var32 | var32 - (var32 >>> 8);
									var32 = var23[var20];
									var30 = var29 + var32;
									var31 = (var29 & 0xFF00FF) + (var32 & 0xFF00FF);
									var32 = (var31 & 0x1000100) + (var30 - var31 & 0x10000);
									var23[var20] = var30 - var32 | var32 - (var32 >>> 8);
								}
								if (arg1 && arg12) {
									var40[var20] = arg5;
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var24;
						var20 += var21;
					}
				} else if (arg8 == 2) {
					var24 = arg9 >>> 24;
					var25 = 256 - var24;
					var26 = (arg9 & 0xFF00FF) * var25 & 0xFF00FF00;
					var27 = (arg9 & 0xFF00) * var25 & 0xFF0000;
					var39 = (var26 | var27) >>> 8;
					var28 = var14;
					for (var29 = -arg7; var29 < 0; var29++) {
						var30 = (var15 >> 16) * this.anInt9358;
						for (var31 = -arg6; var31 < 0; var31++) {
							if (!arg1 || arg5 < var40[var20]) {
								var44 = this.aByteArray10095[(var14 >> 16) + var30];
								if (var44 != 0) {
									if (arg0) {
										var33 = this.anIntArray10096[var44 & 0xFF];
										var26 = (var33 & 0xFF00FF) * var24 & 0xFF00FF00;
										var27 = (var33 & 0xFF00) * var24 & 0xFF0000;
										var33 = ((var26 | var27) >>> 8) + var39;
										var34 = var23[var20];
										var35 = var33 + var34;
										var36 = (var33 & 0xFF00FF) + (var34 & 0xFF00FF);
										var34 = (var36 & 0x1000100) + (var35 - var36 & 0x10000);
										var23[var20] = var35 - var34 | var34 - (var34 >>> 8);
									}
									if (arg1 && arg12) {
										var40[var20] = arg5;
									}
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var28;
						var20 += var21;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg8 == 1) {
				var24 = var14;
				for (var25 = -arg7; var25 < 0; var25++) {
					var26 = (var15 >> 16) * this.anInt9358;
					for (var27 = -arg6; var27 < 0; var27++) {
						if (!arg1 || arg5 < var40[var20]) {
							var41 = this.aByteArray10095[(var14 >> 16) + var26];
							if (var41 != 0) {
								if (arg0) {
									var23[var20] = this.anIntArray10096[var41 & 0xFF];
								}
								if (arg1 && arg12) {
									var40[var20] = arg5;
								}
							}
						}
						var14 += var18;
						var20++;
					}
					var15 += var19;
					var14 = var24;
					var20 += var21;
				}
			} else {
				byte var42;
				if (arg8 == 0) {
					var24 = var14;
					if ((arg9 & 0xFFFFFF) == 16777215) {
						var25 = arg9 >>> 24;
						var26 = 256 - var25;
						for (var27 = -arg7; var27 < 0; var27++) {
							var28 = (var15 >> 16) * this.anInt9358;
							for (var29 = -arg6; var29 < 0; var29++) {
								if (!arg1 || arg5 < var40[var20]) {
									var42 = this.aByteArray10095[(var14 >> 16) + var28];
									if (var42 != 0) {
										if (arg0) {
											var31 = this.anIntArray10096[var42 & 0xFF];
											var32 = var23[var20];
											var23[var20] = ((var31 & 0xFF00FF) * var25 + (var32 & 0xFF00FF) * var26 & 0xFF00FF00) + ((var31 & 0xFF00) * var25 + (var32 & 0xFF00) * var26 & 0xFF0000) >> 8;
										}
										if (arg1 && arg12) {
											var40[var20] = arg5;
										}
									}
								}
								var14 += var18;
								var20++;
							}
							var15 += var19;
							var14 = var24;
							var20 += var21;
						}
					} else {
						var25 = arg9 >> 16 & 0xFF;
						var26 = arg9 >> 8 & 0xFF;
						var27 = arg9 & 0xFF;
						var28 = arg9 >>> 24;
						var29 = 256 - var28;
						for (var30 = -arg7; var30 < 0; var30++) {
							var31 = (var15 >> 16) * this.anInt9358;
							for (var32 = -arg6; var32 < 0; var32++) {
								if (!arg1 || arg5 < var40[var20]) {
									byte var43 = this.aByteArray10095[(var14 >> 16) + var31];
									if (var43 != 0) {
										var34 = this.anIntArray10096[var43 & 0xFF];
										if (var28 == 255) {
											if (arg0) {
												var35 = (var34 & 0xFF0000) * var25 & 0xFF000000;
												var36 = (var34 & 0xFF00) * var26 & 0xFF0000;
												var37 = (var34 & 0xFF) * var27 & 0xFF00;
												var23[var20] = (var35 | var36 | var37) >>> 8;
											}
											if (arg1 && arg12) {
												var40[var20] = arg5;
											}
										} else {
											if (arg0) {
												var35 = (var34 & 0xFF0000) * var25 & 0xFF000000;
												var36 = (var34 & 0xFF00) * var26 & 0xFF0000;
												var37 = (var34 & 0xFF) * var27 & 0xFF00;
												var34 = (var35 | var36 | var37) >>> 8;
												var38 = var23[var20];
												var23[var20] = ((var34 & 0xFF00FF) * var28 + (var38 & 0xFF00FF) * var29 & 0xFF00FF00) + ((var34 & 0xFF00) * var28 + (var38 & 0xFF00) * var29 & 0xFF0000) >> 8;
											}
											if (arg1 && arg12) {
												var40[var20] = arg5;
											}
										}
									}
								}
								var14 += var18;
								var20++;
							}
							var15 += var19;
							var14 = var24;
							var20 += var21;
						}
					}
				} else if (arg8 == 3) {
					var24 = var14;
					var25 = arg9 >>> 24;
					var26 = 256 - var25;
					for (var27 = -arg7; var27 < 0; var27++) {
						var28 = (var15 >> 16) * this.anInt9358;
						for (var29 = -arg6; var29 < 0; var29++) {
							if (!arg1 || arg5 < var40[var20]) {
								if (arg0) {
									var42 = this.aByteArray10095[(var14 >> 16) + var28];
									var31 = var42 > 0 ? this.anIntArray10096[var42] : 0;
									var32 = var31 + arg9;
									var33 = (var31 & 0xFF00FF) + (arg9 & 0xFF00FF);
									var34 = (var33 & 0x1000100) + (var32 - var33 & 0x10000);
									var34 = var32 - var34 | var34 - (var34 >>> 8);
									if (var31 == 0 && var25 != 255) {
										var31 = var34;
										var34 = var23[var20];
										var34 = ((var31 & 0xFF00FF) * var25 + (var34 & 0xFF00FF) * var26 & 0xFF00FF00) + ((var31 & 0xFF00) * var25 + (var34 & 0xFF00) * var26 & 0xFF0000) >> 8;
									}
									var23[var20] = var34;
								}
								if (arg1 && arg12) {
									var40[var20] = arg5;
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var24;
						var20 += var21;
					}
				} else if (arg8 == 2) {
					var24 = arg9 >>> 24;
					var25 = 256 - var24;
					var26 = (arg9 & 0xFF00FF) * var25 & 0xFF00FF00;
					var27 = (arg9 & 0xFF00) * var25 & 0xFF0000;
					var39 = (var26 | var27) >>> 8;
					var28 = var14;
					for (var29 = -arg7; var29 < 0; var29++) {
						var30 = (var15 >> 16) * this.anInt9358;
						for (var31 = -arg6; var31 < 0; var31++) {
							if (!arg1 || arg5 < var40[var20]) {
								var44 = this.aByteArray10095[(var14 >> 16) + var30];
								if (var44 != 0) {
									if (arg0) {
										var33 = this.anIntArray10096[var44 & 0xFF];
										var26 = (var33 & 0xFF00FF) * var24 & 0xFF00FF00;
										var27 = (var33 & 0xFF00) * var24 & 0xFF0000;
										var23[var20] = ((var26 | var27) >>> 8) + var39;
									}
									if (arg1 && arg12) {
										var40[var20] = arg5;
									}
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var28;
						var20 += var21;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg8 == 1) {
			var24 = var14;
			for (var25 = -arg7; var25 < 0; var25++) {
				var26 = (var15 >> 16) * this.anInt9358;
				for (var27 = -arg6; var27 < 0; var27++) {
					if (!arg1 || arg5 < var40[var20]) {
						if (arg0) {
							var23[var20] = this.anIntArray10096[this.aByteArray10095[(var14 >> 16) + var26] & 0xFF];
						}
						if (arg1 && arg12) {
							var40[var20] = arg5;
						}
					}
					var14 += var18;
					var20++;
				}
				var15 += var19;
				var14 = var24;
				var20 += var21;
			}
		} else if (arg8 == 0) {
			var24 = arg9 >> 16 & 0xFF;
			var25 = arg9 >> 8 & 0xFF;
			var26 = arg9 & 0xFF;
			var27 = var14;
			for (var28 = -arg7; var28 < 0; var28++) {
				var29 = (var15 >> 16) * this.anInt9358;
				for (var30 = -arg6; var30 < 0; var30++) {
					if (!arg1 || arg5 < var40[var20]) {
						if (arg0) {
							var31 = this.anIntArray10096[this.aByteArray10095[(var14 >> 16) + var29] & 0xFF];
							var32 = (var31 & 0xFF0000) * var24 & 0xFF000000;
							var33 = (var31 & 0xFF00) * var25 & 0xFF0000;
							var34 = (var31 & 0xFF) * var26 & 0xFF00;
							var23[var20] = (var32 | var33 | var34) >>> 8;
						}
						if (arg1 && arg12) {
							var40[var20] = arg5;
						}
					}
					var14 += var18;
					var20++;
				}
				var15 += var19;
				var14 = var27;
				var20 += var21;
			}
		} else if (arg8 == 3) {
			var24 = var14;
			for (var25 = -arg7; var25 < 0; var25++) {
				var26 = (var15 >> 16) * this.anInt9358;
				for (var27 = -arg6; var27 < 0; var27++) {
					if (!arg1 || arg5 < var40[var20]) {
						if (arg0) {
							var41 = this.aByteArray10095[(var14 >> 16) + var26];
							var29 = var41 > 0 ? this.anIntArray10096[var41] : 0;
							var30 = var29 + arg9;
							var31 = (var29 & 0xFF00FF) + (arg9 & 0xFF00FF);
							var32 = (var31 & 0x1000100) + (var30 - var31 & 0x10000);
							var23[var20] = var30 - var32 | var32 - (var32 >>> 8);
						}
						if (arg1 && arg12) {
							var40[var20] = arg5;
						}
					}
					var14 += var18;
					var20++;
				}
				var15 += var19;
				var14 = var24;
				var20 += var21;
			}
		} else if (arg8 == 2) {
			var24 = arg9 >>> 24;
			var25 = 256 - var24;
			var26 = (arg9 & 0xFF00FF) * var25 & 0xFF00FF00;
			var27 = (arg9 & 0xFF00) * var25 & 0xFF0000;
			var39 = (var26 | var27) >>> 8;
			var28 = var14;
			for (var29 = -arg7; var29 < 0; var29++) {
				var30 = (var15 >> 16) * this.anInt9358;
				for (var31 = -arg6; var31 < 0; var31++) {
					if (!arg1 || arg5 < var40[var20]) {
						if (arg0) {
							var32 = this.anIntArray10096[this.aByteArray10095[(var14 >> 16) + var30] & 0xFF];
							var26 = (var32 & 0xFF00FF) * var24 & 0xFF00FF00;
							var27 = (var32 & 0xFF00) * var24 & 0xFF0000;
							var23[var20] = ((var26 | var27) >>> 8) + var39;
						}
						if (arg1 && arg12) {
							var40[var20] = arg5;
						}
					}
					var14 += var18;
					var20++;
				}
				var15 += var19;
				var14 = var28;
				var20 += var21;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method748(boolean arg0, boolean arg1, boolean arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
		if (arg6 <= 0 || arg7 <= 0 || !arg0 && !arg1) {
			return;
		}
		int var14 = 0;
		int var15 = 0;
		int var16 = this.anInt9352 + this.anInt9358 + this.anInt9328;
		int var17 = this.anInt9327 + this.anInt9325 + this.anInt9337;
		int var18 = (var16 << 16) / arg6;
		int var19 = (var17 << 16) / arg7;
		int var20;
		if (this.anInt9352 > 0) {
			var20 = ((this.anInt9352 << 16) + var18 - 1) / var18;
			arg3 += var20;
			var14 += var20 * var18 - (this.anInt9352 << 16);
		}
		if (this.anInt9327 > 0) {
			var20 = ((this.anInt9327 << 16) + var19 - 1) / var19;
			arg4 += var20;
			var15 += var20 * var19 - (this.anInt9327 << 16);
		}
		if (this.anInt9358 < var16) {
			arg6 = ((this.anInt9358 << 16) - var14 + var18 - 1) / var18;
		}
		if (this.anInt9325 < var17) {
			arg7 = ((this.anInt9325 << 16) - var15 + var19 - 1) / var19;
		}
		var20 = arg3 + arg4 * this.aClass_ra_Sub3_9355.anInt8618 * -29235085 * -1504772933;
		int var21 = this.aClass_ra_Sub3_9355.anInt8618 * -29235085 * -1504772933 - arg6;
		if (arg4 + arg7 > this.aClass_ra_Sub3_9355.anInt8624 * -550983163 * 31822541) {
			arg7 -= arg4 + arg7 - this.aClass_ra_Sub3_9355.anInt8624 * -550983163 * 31822541;
		}
		int var22;
		if (arg4 < this.aClass_ra_Sub3_9355.anInt8623 * 766013039 * -1679642481) {
			var22 = this.aClass_ra_Sub3_9355.anInt8623 * 766013039 * -1679642481 - arg4;
			arg7 -= var22;
			var20 += var22 * this.aClass_ra_Sub3_9355.anInt8618 * -29235085 * -1504772933;
			var15 += var19 * var22;
		}
		if (arg3 + arg6 > this.aClass_ra_Sub3_9355.anInt8635 * -711985315 * -1071049483) {
			var22 = arg3 + arg6 - this.aClass_ra_Sub3_9355.anInt8635 * -711985315 * -1071049483;
			arg6 -= var22;
			var21 += var22;
		}
		if (arg3 < this.aClass_ra_Sub3_9355.anInt8621 * 1907727929 * 512290825) {
			var22 = this.aClass_ra_Sub3_9355.anInt8621 * 1907727929 * 512290825 - arg3;
			arg6 -= var22;
			var20 += var22;
			var14 += var18 * var22;
			var21 += var22;
		}
		float[] var40 = this.aClass_ra_Sub3_9355.aFloatArray8620;
		int[] var23 = this.aClass_ra_Sub3_9355.anIntArray8630;
		int var24;
		int var25;
		int var26;
		int var27;
		int var28;
		int var29;
		int var30;
		int var31;
		int var32;
		int var33;
		int var34;
		int var39;
		byte var41;
		if (arg10 != 0) {
			int var35;
			int var36;
			int var37;
			int var38;
			byte var44;
			if (arg10 != 1) {
				if (arg10 != 2) {
					throw new IllegalArgumentException();
				}
				if (arg8 == 1) {
					var24 = var14;
					for (var25 = -arg7; var25 < 0; var25++) {
						var26 = (var15 >> 16) * this.anInt9358;
						for (var27 = -arg6; var27 < 0; var27++) {
							if (!arg1 || arg5 < var40[var20]) {
								var41 = this.aByteArray10095[(var14 >> 16) + var26];
								if (var41 != 0) {
									if (arg0) {
										var29 = this.anIntArray10096[var41 & 0xFF];
										var30 = var23[var20];
										var31 = var29 + var30;
										var32 = (var29 & 0xFF00FF) + (var30 & 0xFF00FF);
										var30 = (var32 & 0x1000100) + (var31 - var32 & 0x10000);
										var23[var20] = var31 - var30 | var30 - (var30 >>> 8);
									}
									if (arg1 && arg12) {
										var40[var20] = arg5;
									}
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var24;
						var20 += var21;
					}
				} else if (arg8 == 0) {
					var24 = var14;
					var25 = arg9 >> 16 & 0xFF;
					var26 = arg9 >> 8 & 0xFF;
					var27 = arg9 & 0xFF;
					for (var28 = -arg7; var28 < 0; var28++) {
						var29 = (var15 >> 16) * this.anInt9358;
						for (var30 = -arg6; var30 < 0; var30++) {
							if (!arg1 || arg5 < var40[var20]) {
								byte var45 = this.aByteArray10095[(var14 >> 16) + var29];
								if (var45 != 0) {
									if (arg0) {
										var32 = this.anIntArray10096[var45 & 0xFF];
										var33 = (var32 & 0xFF0000) * var25 & 0xFF000000;
										var34 = (var32 & 0xFF00) * var26 & 0xFF0000;
										var35 = (var32 & 0xFF) * var27 & 0xFF00;
										var32 = (var33 | var34 | var35) >>> 8;
										var36 = var23[var20];
										var37 = var32 + var36;
										var38 = (var32 & 0xFF00FF) + (var36 & 0xFF00FF);
										var36 = (var38 & 0x1000100) + (var37 - var38 & 0x10000);
										var23[var20] = var37 - var36 | var36 - (var36 >>> 8);
									}
									if (arg1 && arg12) {
										var40[var20] = arg5;
									}
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var24;
						var20 += var21;
					}
				} else if (arg8 == 3) {
					var24 = var14;
					for (var25 = -arg7; var25 < 0; var25++) {
						var26 = (var15 >> 16) * this.anInt9358;
						for (var27 = -arg6; var27 < 0; var27++) {
							if (!arg1 || arg5 < var40[var20]) {
								if (arg0) {
									var41 = this.aByteArray10095[(var14 >> 16) + var26];
									var29 = var41 > 0 ? this.anIntArray10096[var41] : 0;
									var30 = var29 + arg9;
									var31 = (var29 & 0xFF00FF) + (arg9 & 0xFF00FF);
									var32 = (var31 & 0x1000100) + (var30 - var31 & 0x10000);
									var29 = var30 - var32 | var32 - (var32 >>> 8);
									var32 = var23[var20];
									var30 = var29 + var32;
									var31 = (var29 & 0xFF00FF) + (var32 & 0xFF00FF);
									var32 = (var31 & 0x1000100) + (var30 - var31 & 0x10000);
									var23[var20] = var30 - var32 | var32 - (var32 >>> 8);
								}
								if (arg1 && arg12) {
									var40[var20] = arg5;
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var24;
						var20 += var21;
					}
				} else if (arg8 == 2) {
					var24 = arg9 >>> 24;
					var25 = 256 - var24;
					var26 = (arg9 & 0xFF00FF) * var25 & 0xFF00FF00;
					var27 = (arg9 & 0xFF00) * var25 & 0xFF0000;
					var39 = (var26 | var27) >>> 8;
					var28 = var14;
					for (var29 = -arg7; var29 < 0; var29++) {
						var30 = (var15 >> 16) * this.anInt9358;
						for (var31 = -arg6; var31 < 0; var31++) {
							if (!arg1 || arg5 < var40[var20]) {
								var44 = this.aByteArray10095[(var14 >> 16) + var30];
								if (var44 != 0) {
									if (arg0) {
										var33 = this.anIntArray10096[var44 & 0xFF];
										var26 = (var33 & 0xFF00FF) * var24 & 0xFF00FF00;
										var27 = (var33 & 0xFF00) * var24 & 0xFF0000;
										var33 = ((var26 | var27) >>> 8) + var39;
										var34 = var23[var20];
										var35 = var33 + var34;
										var36 = (var33 & 0xFF00FF) + (var34 & 0xFF00FF);
										var34 = (var36 & 0x1000100) + (var35 - var36 & 0x10000);
										var23[var20] = var35 - var34 | var34 - (var34 >>> 8);
									}
									if (arg1 && arg12) {
										var40[var20] = arg5;
									}
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var28;
						var20 += var21;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg8 == 1) {
				var24 = var14;
				for (var25 = -arg7; var25 < 0; var25++) {
					var26 = (var15 >> 16) * this.anInt9358;
					for (var27 = -arg6; var27 < 0; var27++) {
						if (!arg1 || arg5 < var40[var20]) {
							var41 = this.aByteArray10095[(var14 >> 16) + var26];
							if (var41 != 0) {
								if (arg0) {
									var23[var20] = this.anIntArray10096[var41 & 0xFF];
								}
								if (arg1 && arg12) {
									var40[var20] = arg5;
								}
							}
						}
						var14 += var18;
						var20++;
					}
					var15 += var19;
					var14 = var24;
					var20 += var21;
				}
			} else {
				byte var42;
				if (arg8 == 0) {
					var24 = var14;
					if ((arg9 & 0xFFFFFF) == 16777215) {
						var25 = arg9 >>> 24;
						var26 = 256 - var25;
						for (var27 = -arg7; var27 < 0; var27++) {
							var28 = (var15 >> 16) * this.anInt9358;
							for (var29 = -arg6; var29 < 0; var29++) {
								if (!arg1 || arg5 < var40[var20]) {
									var42 = this.aByteArray10095[(var14 >> 16) + var28];
									if (var42 != 0) {
										if (arg0) {
											var31 = this.anIntArray10096[var42 & 0xFF];
											var32 = var23[var20];
											var23[var20] = ((var31 & 0xFF00FF) * var25 + (var32 & 0xFF00FF) * var26 & 0xFF00FF00) + ((var31 & 0xFF00) * var25 + (var32 & 0xFF00) * var26 & 0xFF0000) >> 8;
										}
										if (arg1 && arg12) {
											var40[var20] = arg5;
										}
									}
								}
								var14 += var18;
								var20++;
							}
							var15 += var19;
							var14 = var24;
							var20 += var21;
						}
					} else {
						var25 = arg9 >> 16 & 0xFF;
						var26 = arg9 >> 8 & 0xFF;
						var27 = arg9 & 0xFF;
						var28 = arg9 >>> 24;
						var29 = 256 - var28;
						for (var30 = -arg7; var30 < 0; var30++) {
							var31 = (var15 >> 16) * this.anInt9358;
							for (var32 = -arg6; var32 < 0; var32++) {
								if (!arg1 || arg5 < var40[var20]) {
									byte var43 = this.aByteArray10095[(var14 >> 16) + var31];
									if (var43 != 0) {
										var34 = this.anIntArray10096[var43 & 0xFF];
										if (var28 == 255) {
											if (arg0) {
												var35 = (var34 & 0xFF0000) * var25 & 0xFF000000;
												var36 = (var34 & 0xFF00) * var26 & 0xFF0000;
												var37 = (var34 & 0xFF) * var27 & 0xFF00;
												var23[var20] = (var35 | var36 | var37) >>> 8;
											}
											if (arg1 && arg12) {
												var40[var20] = arg5;
											}
										} else {
											if (arg0) {
												var35 = (var34 & 0xFF0000) * var25 & 0xFF000000;
												var36 = (var34 & 0xFF00) * var26 & 0xFF0000;
												var37 = (var34 & 0xFF) * var27 & 0xFF00;
												var34 = (var35 | var36 | var37) >>> 8;
												var38 = var23[var20];
												var23[var20] = ((var34 & 0xFF00FF) * var28 + (var38 & 0xFF00FF) * var29 & 0xFF00FF00) + ((var34 & 0xFF00) * var28 + (var38 & 0xFF00) * var29 & 0xFF0000) >> 8;
											}
											if (arg1 && arg12) {
												var40[var20] = arg5;
											}
										}
									}
								}
								var14 += var18;
								var20++;
							}
							var15 += var19;
							var14 = var24;
							var20 += var21;
						}
					}
				} else if (arg8 == 3) {
					var24 = var14;
					var25 = arg9 >>> 24;
					var26 = 256 - var25;
					for (var27 = -arg7; var27 < 0; var27++) {
						var28 = (var15 >> 16) * this.anInt9358;
						for (var29 = -arg6; var29 < 0; var29++) {
							if (!arg1 || arg5 < var40[var20]) {
								if (arg0) {
									var42 = this.aByteArray10095[(var14 >> 16) + var28];
									var31 = var42 > 0 ? this.anIntArray10096[var42] : 0;
									var32 = var31 + arg9;
									var33 = (var31 & 0xFF00FF) + (arg9 & 0xFF00FF);
									var34 = (var33 & 0x1000100) + (var32 - var33 & 0x10000);
									var34 = var32 - var34 | var34 - (var34 >>> 8);
									if (var31 == 0 && var25 != 255) {
										var31 = var34;
										var34 = var23[var20];
										var34 = ((var31 & 0xFF00FF) * var25 + (var34 & 0xFF00FF) * var26 & 0xFF00FF00) + ((var31 & 0xFF00) * var25 + (var34 & 0xFF00) * var26 & 0xFF0000) >> 8;
									}
									var23[var20] = var34;
								}
								if (arg1 && arg12) {
									var40[var20] = arg5;
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var24;
						var20 += var21;
					}
				} else if (arg8 == 2) {
					var24 = arg9 >>> 24;
					var25 = 256 - var24;
					var26 = (arg9 & 0xFF00FF) * var25 & 0xFF00FF00;
					var27 = (arg9 & 0xFF00) * var25 & 0xFF0000;
					var39 = (var26 | var27) >>> 8;
					var28 = var14;
					for (var29 = -arg7; var29 < 0; var29++) {
						var30 = (var15 >> 16) * this.anInt9358;
						for (var31 = -arg6; var31 < 0; var31++) {
							if (!arg1 || arg5 < var40[var20]) {
								var44 = this.aByteArray10095[(var14 >> 16) + var30];
								if (var44 != 0) {
									if (arg0) {
										var33 = this.anIntArray10096[var44 & 0xFF];
										var26 = (var33 & 0xFF00FF) * var24 & 0xFF00FF00;
										var27 = (var33 & 0xFF00) * var24 & 0xFF0000;
										var23[var20] = ((var26 | var27) >>> 8) + var39;
									}
									if (arg1 && arg12) {
										var40[var20] = arg5;
									}
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var28;
						var20 += var21;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg8 == 1) {
			var24 = var14;
			for (var25 = -arg7; var25 < 0; var25++) {
				var26 = (var15 >> 16) * this.anInt9358;
				for (var27 = -arg6; var27 < 0; var27++) {
					if (!arg1 || arg5 < var40[var20]) {
						if (arg0) {
							var23[var20] = this.anIntArray10096[this.aByteArray10095[(var14 >> 16) + var26] & 0xFF];
						}
						if (arg1 && arg12) {
							var40[var20] = arg5;
						}
					}
					var14 += var18;
					var20++;
				}
				var15 += var19;
				var14 = var24;
				var20 += var21;
			}
		} else if (arg8 == 0) {
			var24 = arg9 >> 16 & 0xFF;
			var25 = arg9 >> 8 & 0xFF;
			var26 = arg9 & 0xFF;
			var27 = var14;
			for (var28 = -arg7; var28 < 0; var28++) {
				var29 = (var15 >> 16) * this.anInt9358;
				for (var30 = -arg6; var30 < 0; var30++) {
					if (!arg1 || arg5 < var40[var20]) {
						if (arg0) {
							var31 = this.anIntArray10096[this.aByteArray10095[(var14 >> 16) + var29] & 0xFF];
							var32 = (var31 & 0xFF0000) * var24 & 0xFF000000;
							var33 = (var31 & 0xFF00) * var25 & 0xFF0000;
							var34 = (var31 & 0xFF) * var26 & 0xFF00;
							var23[var20] = (var32 | var33 | var34) >>> 8;
						}
						if (arg1 && arg12) {
							var40[var20] = arg5;
						}
					}
					var14 += var18;
					var20++;
				}
				var15 += var19;
				var14 = var27;
				var20 += var21;
			}
		} else if (arg8 == 3) {
			var24 = var14;
			for (var25 = -arg7; var25 < 0; var25++) {
				var26 = (var15 >> 16) * this.anInt9358;
				for (var27 = -arg6; var27 < 0; var27++) {
					if (!arg1 || arg5 < var40[var20]) {
						if (arg0) {
							var41 = this.aByteArray10095[(var14 >> 16) + var26];
							var29 = var41 > 0 ? this.anIntArray10096[var41] : 0;
							var30 = var29 + arg9;
							var31 = (var29 & 0xFF00FF) + (arg9 & 0xFF00FF);
							var32 = (var31 & 0x1000100) + (var30 - var31 & 0x10000);
							var23[var20] = var30 - var32 | var32 - (var32 >>> 8);
						}
						if (arg1 && arg12) {
							var40[var20] = arg5;
						}
					}
					var14 += var18;
					var20++;
				}
				var15 += var19;
				var14 = var24;
				var20 += var21;
			}
		} else if (arg8 == 2) {
			var24 = arg9 >>> 24;
			var25 = 256 - var24;
			var26 = (arg9 & 0xFF00FF) * var25 & 0xFF00FF00;
			var27 = (arg9 & 0xFF00) * var25 & 0xFF0000;
			var39 = (var26 | var27) >>> 8;
			var28 = var14;
			for (var29 = -arg7; var29 < 0; var29++) {
				var30 = (var15 >> 16) * this.anInt9358;
				for (var31 = -arg6; var31 < 0; var31++) {
					if (!arg1 || arg5 < var40[var20]) {
						if (arg0) {
							var32 = this.anIntArray10096[this.aByteArray10095[(var14 >> 16) + var30] & 0xFF];
							var26 = (var32 & 0xFF00FF) * var24 & 0xFF00FF00;
							var27 = (var32 & 0xFF00) * var24 & 0xFF0000;
							var23[var20] = ((var26 | var27) >>> 8) + var39;
						}
						if (arg1 && arg12) {
							var40[var20] = arg5;
						}
					}
					var14 += var18;
					var20++;
				}
				var15 += var19;
				var14 = var28;
				var20 += var21;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method749(boolean arg0, boolean arg1, boolean arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
		if (arg6 <= 0 || arg7 <= 0 || !arg0 && !arg1) {
			return;
		}
		int var14 = 0;
		int var15 = 0;
		int var16 = this.anInt9352 + this.anInt9358 + this.anInt9328;
		int var17 = this.anInt9327 + this.anInt9325 + this.anInt9337;
		int var18 = (var16 << 16) / arg6;
		int var19 = (var17 << 16) / arg7;
		int var20;
		if (this.anInt9352 > 0) {
			var20 = ((this.anInt9352 << 16) + var18 - 1) / var18;
			arg3 += var20;
			var14 += var20 * var18 - (this.anInt9352 << 16);
		}
		if (this.anInt9327 > 0) {
			var20 = ((this.anInt9327 << 16) + var19 - 1) / var19;
			arg4 += var20;
			var15 += var20 * var19 - (this.anInt9327 << 16);
		}
		if (this.anInt9358 < var16) {
			arg6 = ((this.anInt9358 << 16) - var14 + var18 - 1) / var18;
		}
		if (this.anInt9325 < var17) {
			arg7 = ((this.anInt9325 << 16) - var15 + var19 - 1) / var19;
		}
		var20 = arg3 + arg4 * this.aClass_ra_Sub3_9355.anInt8618 * -29235085 * -1504772933;
		int var21 = this.aClass_ra_Sub3_9355.anInt8618 * -29235085 * -1504772933 - arg6;
		if (arg4 + arg7 > this.aClass_ra_Sub3_9355.anInt8624 * -550983163 * 31822541) {
			arg7 -= arg4 + arg7 - this.aClass_ra_Sub3_9355.anInt8624 * -550983163 * 31822541;
		}
		int var22;
		if (arg4 < this.aClass_ra_Sub3_9355.anInt8623 * 766013039 * -1679642481) {
			var22 = this.aClass_ra_Sub3_9355.anInt8623 * 766013039 * -1679642481 - arg4;
			arg7 -= var22;
			var20 += var22 * this.aClass_ra_Sub3_9355.anInt8618 * -29235085 * -1504772933;
			var15 += var19 * var22;
		}
		if (arg3 + arg6 > this.aClass_ra_Sub3_9355.anInt8635 * -711985315 * -1071049483) {
			var22 = arg3 + arg6 - this.aClass_ra_Sub3_9355.anInt8635 * -711985315 * -1071049483;
			arg6 -= var22;
			var21 += var22;
		}
		if (arg3 < this.aClass_ra_Sub3_9355.anInt8621 * 1907727929 * 512290825) {
			var22 = this.aClass_ra_Sub3_9355.anInt8621 * 1907727929 * 512290825 - arg3;
			arg6 -= var22;
			var20 += var22;
			var14 += var18 * var22;
			var21 += var22;
		}
		float[] var40 = this.aClass_ra_Sub3_9355.aFloatArray8620;
		int[] var23 = this.aClass_ra_Sub3_9355.anIntArray8630;
		int var24;
		int var25;
		int var26;
		int var27;
		int var28;
		int var29;
		int var30;
		int var31;
		int var32;
		int var33;
		int var34;
		int var39;
		byte var41;
		if (arg10 != 0) {
			int var35;
			int var36;
			int var37;
			int var38;
			byte var44;
			if (arg10 != 1) {
				if (arg10 != 2) {
					throw new IllegalArgumentException();
				}
				if (arg8 == 1) {
					var24 = var14;
					for (var25 = -arg7; var25 < 0; var25++) {
						var26 = (var15 >> 16) * this.anInt9358;
						for (var27 = -arg6; var27 < 0; var27++) {
							if (!arg1 || arg5 < var40[var20]) {
								var41 = this.aByteArray10095[(var14 >> 16) + var26];
								if (var41 != 0) {
									if (arg0) {
										var29 = this.anIntArray10096[var41 & 0xFF];
										var30 = var23[var20];
										var31 = var29 + var30;
										var32 = (var29 & 0xFF00FF) + (var30 & 0xFF00FF);
										var30 = (var32 & 0x1000100) + (var31 - var32 & 0x10000);
										var23[var20] = var31 - var30 | var30 - (var30 >>> 8);
									}
									if (arg1 && arg12) {
										var40[var20] = arg5;
									}
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var24;
						var20 += var21;
					}
				} else if (arg8 == 0) {
					var24 = var14;
					var25 = arg9 >> 16 & 0xFF;
					var26 = arg9 >> 8 & 0xFF;
					var27 = arg9 & 0xFF;
					for (var28 = -arg7; var28 < 0; var28++) {
						var29 = (var15 >> 16) * this.anInt9358;
						for (var30 = -arg6; var30 < 0; var30++) {
							if (!arg1 || arg5 < var40[var20]) {
								byte var45 = this.aByteArray10095[(var14 >> 16) + var29];
								if (var45 != 0) {
									if (arg0) {
										var32 = this.anIntArray10096[var45 & 0xFF];
										var33 = (var32 & 0xFF0000) * var25 & 0xFF000000;
										var34 = (var32 & 0xFF00) * var26 & 0xFF0000;
										var35 = (var32 & 0xFF) * var27 & 0xFF00;
										var32 = (var33 | var34 | var35) >>> 8;
										var36 = var23[var20];
										var37 = var32 + var36;
										var38 = (var32 & 0xFF00FF) + (var36 & 0xFF00FF);
										var36 = (var38 & 0x1000100) + (var37 - var38 & 0x10000);
										var23[var20] = var37 - var36 | var36 - (var36 >>> 8);
									}
									if (arg1 && arg12) {
										var40[var20] = arg5;
									}
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var24;
						var20 += var21;
					}
				} else if (arg8 == 3) {
					var24 = var14;
					for (var25 = -arg7; var25 < 0; var25++) {
						var26 = (var15 >> 16) * this.anInt9358;
						for (var27 = -arg6; var27 < 0; var27++) {
							if (!arg1 || arg5 < var40[var20]) {
								if (arg0) {
									var41 = this.aByteArray10095[(var14 >> 16) + var26];
									var29 = var41 > 0 ? this.anIntArray10096[var41] : 0;
									var30 = var29 + arg9;
									var31 = (var29 & 0xFF00FF) + (arg9 & 0xFF00FF);
									var32 = (var31 & 0x1000100) + (var30 - var31 & 0x10000);
									var29 = var30 - var32 | var32 - (var32 >>> 8);
									var32 = var23[var20];
									var30 = var29 + var32;
									var31 = (var29 & 0xFF00FF) + (var32 & 0xFF00FF);
									var32 = (var31 & 0x1000100) + (var30 - var31 & 0x10000);
									var23[var20] = var30 - var32 | var32 - (var32 >>> 8);
								}
								if (arg1 && arg12) {
									var40[var20] = arg5;
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var24;
						var20 += var21;
					}
				} else if (arg8 == 2) {
					var24 = arg9 >>> 24;
					var25 = 256 - var24;
					var26 = (arg9 & 0xFF00FF) * var25 & 0xFF00FF00;
					var27 = (arg9 & 0xFF00) * var25 & 0xFF0000;
					var39 = (var26 | var27) >>> 8;
					var28 = var14;
					for (var29 = -arg7; var29 < 0; var29++) {
						var30 = (var15 >> 16) * this.anInt9358;
						for (var31 = -arg6; var31 < 0; var31++) {
							if (!arg1 || arg5 < var40[var20]) {
								var44 = this.aByteArray10095[(var14 >> 16) + var30];
								if (var44 != 0) {
									if (arg0) {
										var33 = this.anIntArray10096[var44 & 0xFF];
										var26 = (var33 & 0xFF00FF) * var24 & 0xFF00FF00;
										var27 = (var33 & 0xFF00) * var24 & 0xFF0000;
										var33 = ((var26 | var27) >>> 8) + var39;
										var34 = var23[var20];
										var35 = var33 + var34;
										var36 = (var33 & 0xFF00FF) + (var34 & 0xFF00FF);
										var34 = (var36 & 0x1000100) + (var35 - var36 & 0x10000);
										var23[var20] = var35 - var34 | var34 - (var34 >>> 8);
									}
									if (arg1 && arg12) {
										var40[var20] = arg5;
									}
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var28;
						var20 += var21;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg8 == 1) {
				var24 = var14;
				for (var25 = -arg7; var25 < 0; var25++) {
					var26 = (var15 >> 16) * this.anInt9358;
					for (var27 = -arg6; var27 < 0; var27++) {
						if (!arg1 || arg5 < var40[var20]) {
							var41 = this.aByteArray10095[(var14 >> 16) + var26];
							if (var41 != 0) {
								if (arg0) {
									var23[var20] = this.anIntArray10096[var41 & 0xFF];
								}
								if (arg1 && arg12) {
									var40[var20] = arg5;
								}
							}
						}
						var14 += var18;
						var20++;
					}
					var15 += var19;
					var14 = var24;
					var20 += var21;
				}
			} else {
				byte var42;
				if (arg8 == 0) {
					var24 = var14;
					if ((arg9 & 0xFFFFFF) == 16777215) {
						var25 = arg9 >>> 24;
						var26 = 256 - var25;
						for (var27 = -arg7; var27 < 0; var27++) {
							var28 = (var15 >> 16) * this.anInt9358;
							for (var29 = -arg6; var29 < 0; var29++) {
								if (!arg1 || arg5 < var40[var20]) {
									var42 = this.aByteArray10095[(var14 >> 16) + var28];
									if (var42 != 0) {
										if (arg0) {
											var31 = this.anIntArray10096[var42 & 0xFF];
											var32 = var23[var20];
											var23[var20] = ((var31 & 0xFF00FF) * var25 + (var32 & 0xFF00FF) * var26 & 0xFF00FF00) + ((var31 & 0xFF00) * var25 + (var32 & 0xFF00) * var26 & 0xFF0000) >> 8;
										}
										if (arg1 && arg12) {
											var40[var20] = arg5;
										}
									}
								}
								var14 += var18;
								var20++;
							}
							var15 += var19;
							var14 = var24;
							var20 += var21;
						}
					} else {
						var25 = arg9 >> 16 & 0xFF;
						var26 = arg9 >> 8 & 0xFF;
						var27 = arg9 & 0xFF;
						var28 = arg9 >>> 24;
						var29 = 256 - var28;
						for (var30 = -arg7; var30 < 0; var30++) {
							var31 = (var15 >> 16) * this.anInt9358;
							for (var32 = -arg6; var32 < 0; var32++) {
								if (!arg1 || arg5 < var40[var20]) {
									byte var43 = this.aByteArray10095[(var14 >> 16) + var31];
									if (var43 != 0) {
										var34 = this.anIntArray10096[var43 & 0xFF];
										if (var28 == 255) {
											if (arg0) {
												var35 = (var34 & 0xFF0000) * var25 & 0xFF000000;
												var36 = (var34 & 0xFF00) * var26 & 0xFF0000;
												var37 = (var34 & 0xFF) * var27 & 0xFF00;
												var23[var20] = (var35 | var36 | var37) >>> 8;
											}
											if (arg1 && arg12) {
												var40[var20] = arg5;
											}
										} else {
											if (arg0) {
												var35 = (var34 & 0xFF0000) * var25 & 0xFF000000;
												var36 = (var34 & 0xFF00) * var26 & 0xFF0000;
												var37 = (var34 & 0xFF) * var27 & 0xFF00;
												var34 = (var35 | var36 | var37) >>> 8;
												var38 = var23[var20];
												var23[var20] = ((var34 & 0xFF00FF) * var28 + (var38 & 0xFF00FF) * var29 & 0xFF00FF00) + ((var34 & 0xFF00) * var28 + (var38 & 0xFF00) * var29 & 0xFF0000) >> 8;
											}
											if (arg1 && arg12) {
												var40[var20] = arg5;
											}
										}
									}
								}
								var14 += var18;
								var20++;
							}
							var15 += var19;
							var14 = var24;
							var20 += var21;
						}
					}
				} else if (arg8 == 3) {
					var24 = var14;
					var25 = arg9 >>> 24;
					var26 = 256 - var25;
					for (var27 = -arg7; var27 < 0; var27++) {
						var28 = (var15 >> 16) * this.anInt9358;
						for (var29 = -arg6; var29 < 0; var29++) {
							if (!arg1 || arg5 < var40[var20]) {
								if (arg0) {
									var42 = this.aByteArray10095[(var14 >> 16) + var28];
									var31 = var42 > 0 ? this.anIntArray10096[var42] : 0;
									var32 = var31 + arg9;
									var33 = (var31 & 0xFF00FF) + (arg9 & 0xFF00FF);
									var34 = (var33 & 0x1000100) + (var32 - var33 & 0x10000);
									var34 = var32 - var34 | var34 - (var34 >>> 8);
									if (var31 == 0 && var25 != 255) {
										var31 = var34;
										var34 = var23[var20];
										var34 = ((var31 & 0xFF00FF) * var25 + (var34 & 0xFF00FF) * var26 & 0xFF00FF00) + ((var31 & 0xFF00) * var25 + (var34 & 0xFF00) * var26 & 0xFF0000) >> 8;
									}
									var23[var20] = var34;
								}
								if (arg1 && arg12) {
									var40[var20] = arg5;
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var24;
						var20 += var21;
					}
				} else if (arg8 == 2) {
					var24 = arg9 >>> 24;
					var25 = 256 - var24;
					var26 = (arg9 & 0xFF00FF) * var25 & 0xFF00FF00;
					var27 = (arg9 & 0xFF00) * var25 & 0xFF0000;
					var39 = (var26 | var27) >>> 8;
					var28 = var14;
					for (var29 = -arg7; var29 < 0; var29++) {
						var30 = (var15 >> 16) * this.anInt9358;
						for (var31 = -arg6; var31 < 0; var31++) {
							if (!arg1 || arg5 < var40[var20]) {
								var44 = this.aByteArray10095[(var14 >> 16) + var30];
								if (var44 != 0) {
									if (arg0) {
										var33 = this.anIntArray10096[var44 & 0xFF];
										var26 = (var33 & 0xFF00FF) * var24 & 0xFF00FF00;
										var27 = (var33 & 0xFF00) * var24 & 0xFF0000;
										var23[var20] = ((var26 | var27) >>> 8) + var39;
									}
									if (arg1 && arg12) {
										var40[var20] = arg5;
									}
								}
							}
							var14 += var18;
							var20++;
						}
						var15 += var19;
						var14 = var28;
						var20 += var21;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg8 == 1) {
			var24 = var14;
			for (var25 = -arg7; var25 < 0; var25++) {
				var26 = (var15 >> 16) * this.anInt9358;
				for (var27 = -arg6; var27 < 0; var27++) {
					if (!arg1 || arg5 < var40[var20]) {
						if (arg0) {
							var23[var20] = this.anIntArray10096[this.aByteArray10095[(var14 >> 16) + var26] & 0xFF];
						}
						if (arg1 && arg12) {
							var40[var20] = arg5;
						}
					}
					var14 += var18;
					var20++;
				}
				var15 += var19;
				var14 = var24;
				var20 += var21;
			}
		} else if (arg8 == 0) {
			var24 = arg9 >> 16 & 0xFF;
			var25 = arg9 >> 8 & 0xFF;
			var26 = arg9 & 0xFF;
			var27 = var14;
			for (var28 = -arg7; var28 < 0; var28++) {
				var29 = (var15 >> 16) * this.anInt9358;
				for (var30 = -arg6; var30 < 0; var30++) {
					if (!arg1 || arg5 < var40[var20]) {
						if (arg0) {
							var31 = this.anIntArray10096[this.aByteArray10095[(var14 >> 16) + var29] & 0xFF];
							var32 = (var31 & 0xFF0000) * var24 & 0xFF000000;
							var33 = (var31 & 0xFF00) * var25 & 0xFF0000;
							var34 = (var31 & 0xFF) * var26 & 0xFF00;
							var23[var20] = (var32 | var33 | var34) >>> 8;
						}
						if (arg1 && arg12) {
							var40[var20] = arg5;
						}
					}
					var14 += var18;
					var20++;
				}
				var15 += var19;
				var14 = var27;
				var20 += var21;
			}
		} else if (arg8 == 3) {
			var24 = var14;
			for (var25 = -arg7; var25 < 0; var25++) {
				var26 = (var15 >> 16) * this.anInt9358;
				for (var27 = -arg6; var27 < 0; var27++) {
					if (!arg1 || arg5 < var40[var20]) {
						if (arg0) {
							var41 = this.aByteArray10095[(var14 >> 16) + var26];
							var29 = var41 > 0 ? this.anIntArray10096[var41] : 0;
							var30 = var29 + arg9;
							var31 = (var29 & 0xFF00FF) + (arg9 & 0xFF00FF);
							var32 = (var31 & 0x1000100) + (var30 - var31 & 0x10000);
							var23[var20] = var30 - var32 | var32 - (var32 >>> 8);
						}
						if (arg1 && arg12) {
							var40[var20] = arg5;
						}
					}
					var14 += var18;
					var20++;
				}
				var15 += var19;
				var14 = var24;
				var20 += var21;
			}
		} else if (arg8 == 2) {
			var24 = arg9 >>> 24;
			var25 = 256 - var24;
			var26 = (arg9 & 0xFF00FF) * var25 & 0xFF00FF00;
			var27 = (arg9 & 0xFF00) * var25 & 0xFF0000;
			var39 = (var26 | var27) >>> 8;
			var28 = var14;
			for (var29 = -arg7; var29 < 0; var29++) {
				var30 = (var15 >> 16) * this.anInt9358;
				for (var31 = -arg6; var31 < 0; var31++) {
					if (!arg1 || arg5 < var40[var20]) {
						if (arg0) {
							var32 = this.anIntArray10096[this.aByteArray10095[(var14 >> 16) + var30] & 0xFF];
							var26 = (var32 & 0xFF00FF) * var24 & 0xFF00FF00;
							var27 = (var32 & 0xFF00) * var24 & 0xFF0000;
							var23[var20] = ((var26 | var27) >>> 8) + var39;
						}
						if (arg1 && arg12) {
							var40[var20] = arg5;
						}
					}
					var14 += var18;
					var20++;
				}
				var15 += var19;
				var14 = var28;
				var20 += var21;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method755(int arg0, int arg1) {
		int[] var3 = this.aClass_ra_Sub3_9355.anIntArray8630;
		if (var3 == null) {
			return;
		}
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var15;
		int var16;
		int var17;
		int var18;
		int var19;
		byte var37;
		if (anInt9340 == 0) {
			if (anInt9341 == 0) {
				var4 = anInt9356;
				while (var4 < 0) {
					var5 = anInt9339 * -29235085 * -1504772933;
					var6 = anInt9346;
					var7 = anInt9324;
					var8 = anInt9347;
					if (var6 >= 0 && var7 >= 0 && var6 - (this.anInt9358 << 12) < 0 && var7 - (this.anInt9325 << 12) < 0) {
						while (var8 < 0) {
							var9 = (var7 >> 12) * this.anInt9358 + (var6 >> 12);
							var10 = var5++;
							if (arg1 != 0) {
								byte var26;
								if (arg1 != 1) {
									if (arg1 != 2) {
										throw new IllegalArgumentException();
									}
									if (arg0 == 1) {
										var26 = this.aByteArray10095[var9];
										if (var26 != 0) {
											var12 = this.anIntArray10096[var26 & 0xFF];
											var13 = var3[var10];
											var14 = var12 + var13;
											var15 = (var12 & 0xFF00FF) + (var13 & 0xFF00FF);
											var13 = (var15 & 0x1000100) + (var14 - var15 & 0x10000);
											var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
										}
									} else if (arg0 == 0) {
										var26 = this.aByteArray10095[var9];
										if (var26 != 0) {
											var12 = this.anIntArray10096[var26 & 0xFF];
											var13 = (var12 & 0xFF0000) * anInt9353 & 0xFF000000;
											var14 = (var12 & 0xFF00) * anInt9354 & 0xFF0000;
											var15 = (var12 & 0xFF) * anInt9333 & 0xFF00;
											var12 = (var13 | var14 | var15) >>> 8;
											var16 = var3[var10];
											var17 = var12 + var16;
											var18 = (var12 & 0xFF00FF) + (var16 & 0xFF00FF);
											var16 = (var18 & 0x1000100) + (var17 - var18 & 0x10000);
											var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
										}
									} else if (arg0 == 3) {
										var26 = this.aByteArray10095[var9];
										var12 = var26 > 0 ? this.anIntArray10096[var26] : 0;
										var13 = anInt9350;
										var14 = var12 + var13;
										var15 = (var12 & 0xFF00FF) + (var13 & 0xFF00FF);
										var16 = (var15 & 0x1000100) + (var14 - var15 & 0x10000);
										var16 = var14 - var16 | var16 - (var16 >>> 8);
										if (var12 == 0 && anInt9351 != 255) {
											var12 = var16;
											var16 = var3[var10];
											var16 = ((var12 & 0xFF00FF) * anInt9351 + (var16 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var12 & 0xFF00) * anInt9351 + (var16 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
										}
										var3[var10] = var16;
									} else if (arg0 == 2) {
										var26 = this.aByteArray10095[var9];
										if (var26 != 0) {
											var12 = this.anIntArray10096[var26 & 0xFF];
											var13 = (var12 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
											var14 = (var12 & 0xFF00) * anInt9351 & 0xFF0000;
											var12 = ((var13 | var14) >>> 8) + anInt9323;
											var15 = var3[var10];
											var16 = var12 + var15;
											var17 = (var12 & 0xFF00FF) + (var15 & 0xFF00FF);
											var15 = (var17 & 0x1000100) + (var16 - var17 & 0x10000);
											var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
										}
									}
								} else if (arg0 == 1) {
									var26 = this.aByteArray10095[var9];
									if (var26 != 0) {
										var3[var10] = this.anIntArray10096[var26 & 0xFF];
									}
								} else if (arg0 == 0) {
									var26 = this.aByteArray10095[var9];
									if (var26 != 0) {
										var12 = this.anIntArray10096[var26 & 0xFF];
										if ((anInt9350 & 0xFFFFFF) == 16777215) {
											var13 = anInt9350 >>> 24;
											var14 = 256 - var13;
											var15 = var3[var10];
											var3[var10] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
										} else if (anInt9351 == 255) {
											var13 = (var12 & 0xFF0000) * anInt9353 & 0xFF000000;
											var14 = (var12 & 0xFF00) * anInt9354 & 0xFF0000;
											var15 = (var12 & 0xFF) * anInt9333 & 0xFF00;
											var3[var10] = (var13 | var14 | var15) >>> 8;
										} else {
											var13 = (var12 & 0xFF0000) * anInt9353 & 0xFF000000;
											var14 = (var12 & 0xFF00) * anInt9354 & 0xFF0000;
											var15 = (var12 & 0xFF) * anInt9333 & 0xFF00;
											var12 = (var13 | var14 | var15) >>> 8;
											var16 = var3[var10];
											var3[var10] = ((var12 & 0xFF00FF) * anInt9351 + (var16 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var12 & 0xFF00) * anInt9351 + (var16 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
										}
									}
								} else if (arg0 == 3) {
									var26 = this.aByteArray10095[var9];
									var12 = var26 > 0 ? this.anIntArray10096[var26] : 0;
									var13 = anInt9350;
									var14 = var12 + var13;
									var15 = (var12 & 0xFF00FF) + (var13 & 0xFF00FF);
									var16 = (var15 & 0x1000100) + (var14 - var15 & 0x10000);
									var16 = var14 - var16 | var16 - (var16 >>> 8);
									if (var12 == 0 && anInt9351 != 255) {
										var12 = var16;
										var16 = var3[var10];
										var16 = ((var12 & 0xFF00FF) * anInt9351 + (var16 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var12 & 0xFF00) * anInt9351 + (var16 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
									}
									var3[var10] = var16;
								} else if (arg0 == 2) {
									var26 = this.aByteArray10095[var9];
									if (var26 != 0) {
										var12 = this.anIntArray10096[var26 & 0xFF];
										var13 = (var12 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
										var14 = (var12 & 0xFF00) * anInt9351 & 0xFF0000;
										var3[var10++] = ((var13 | var14) >>> 8) + anInt9323;
									}
								} else {
									throw new IllegalArgumentException();
								}
							} else if (arg0 == 1) {
								var3[var10] = this.anIntArray10096[this.aByteArray10095[var9] & 0xFF];
							} else if (arg0 == 0) {
								var11 = this.anIntArray10096[this.aByteArray10095[var9] & 0xFF];
								var12 = (var11 & 0xFF0000) * anInt9353 & 0xFF000000;
								var13 = (var11 & 0xFF00) * anInt9354 & 0xFF0000;
								var14 = (var11 & 0xFF) * anInt9333 & 0xFF00;
								var3[var10] = (var12 | var13 | var14) >>> 8;
							} else if (arg0 == 3) {
								var11 = this.anIntArray10096[this.aByteArray10095[var9] & 0xFF];
								var12 = anInt9350;
								var13 = var11 + var12;
								var14 = (var11 & 0xFF00FF) + (var12 & 0xFF00FF);
								var15 = (var14 & 0x1000100) + (var13 - var14 & 0x10000);
								var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
							} else if (arg0 == 2) {
								var11 = this.anIntArray10096[this.aByteArray10095[var9] & 0xFF];
								var12 = (var11 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
								var13 = (var11 & 0xFF00) * anInt9351 & 0xFF0000;
								var3[var10] = ((var12 | var13) >>> 8) + anInt9323;
							} else {
								throw new IllegalArgumentException();
							}
							var8++;
						}
					}
					var4++;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			} else if (anInt9341 < 0) {
				var4 = anInt9356;
				while (var4 < 0) {
					var5 = anInt9339 * -29235085 * -1504772933;
					var6 = anInt9346;
					var7 = anInt9324 + anInt9349;
					var8 = anInt9347;
					if (var6 >= 0 && var6 - (this.anInt9358 << 12) < 0) {
						int var20;
						if ((var20 = var7 - (this.anInt9325 << 12)) >= 0) {
							var9 = (anInt9341 - var20) / anInt9341;
							var8 += var9;
							var7 += anInt9341 * var9;
							var5 += var9;
						}
						int var21;
						if ((var21 = (var7 - anInt9341) / anInt9341) > var8) {
							var8 = var21;
						}
						while (var8 < 0) {
							var10 = (var7 >> 12) * this.anInt9358 + (var6 >> 12);
							var11 = var5++;
							if (arg1 == 0) {
								if (arg0 == 1) {
									var3[var11] = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								} else if (arg0 == 0) {
									var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
									var13 = (var12 & 0xFF0000) * anInt9353 & 0xFF000000;
									var14 = (var12 & 0xFF00) * anInt9354 & 0xFF0000;
									var15 = (var12 & 0xFF) * anInt9333 & 0xFF00;
									var3[var11] = (var13 | var14 | var15) >>> 8;
								} else if (arg0 == 3) {
									var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
									var13 = anInt9350;
									var14 = var12 + var13;
									var15 = (var12 & 0xFF00FF) + (var13 & 0xFF00FF);
									var16 = (var15 & 0x1000100) + (var14 - var15 & 0x10000);
									var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
								} else if (arg0 == 2) {
									var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
									var13 = (var12 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
									var14 = (var12 & 0xFF00) * anInt9351 & 0xFF0000;
									var3[var11] = ((var13 | var14) >>> 8) + anInt9323;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (arg1 != 1) {
								if (arg1 != 2) {
									throw new IllegalArgumentException();
								}
								if (arg0 == 1) {
									var37 = this.aByteArray10095[var10];
									if (var37 != 0) {
										var13 = this.anIntArray10096[var37 & 0xFF];
										var14 = var3[var11];
										var15 = var13 + var14;
										var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
										var14 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
										var3[var11] = var15 - var14 | var14 - (var14 >>> 8);
									}
								} else if (arg0 == 0) {
									var37 = this.aByteArray10095[var10];
									if (var37 != 0) {
										var13 = this.anIntArray10096[var37 & 0xFF];
										var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
										var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
										var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
										var13 = (var14 | var15 | var16) >>> 8;
										var17 = var3[var11];
										var18 = var13 + var17;
										var19 = (var13 & 0xFF00FF) + (var17 & 0xFF00FF);
										var17 = (var19 & 0x1000100) + (var18 - var19 & 0x10000);
										var3[var11] = var18 - var17 | var17 - (var17 >>> 8);
									}
								} else if (arg0 == 3) {
									var37 = this.aByteArray10095[var10];
									var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
									var14 = anInt9350;
									var15 = var13 + var14;
									var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
									var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
									var17 = var15 - var17 | var17 - (var17 >>> 8);
									if (var13 == 0 && anInt9351 != 255) {
										var13 = var17;
										var17 = var3[var11];
										var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
									}
									var3[var11] = var17;
								} else if (arg0 == 2) {
									var37 = this.aByteArray10095[var10];
									if (var37 != 0) {
										var13 = this.anIntArray10096[var37 & 0xFF];
										var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
										var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
										var13 = ((var14 | var15) >>> 8) + anInt9323;
										var16 = var3[var11];
										var17 = var13 + var16;
										var18 = (var13 & 0xFF00FF) + (var16 & 0xFF00FF);
										var16 = (var18 & 0x1000100) + (var17 - var18 & 0x10000);
										var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
									}
								}
							} else if (arg0 == 1) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var3[var11] = this.anIntArray10096[var37 & 0xFF];
								}
							} else if (arg0 == 0) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									if ((anInt9350 & 0xFFFFFF) == 16777215) {
										var14 = anInt9350 >>> 24;
										var15 = 256 - var14;
										var16 = var3[var11];
										var3[var11] = ((var13 & 0xFF00FF) * var14 + (var16 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var13 & 0xFF00) * var14 + (var16 & 0xFF00) * var15 & 0xFF0000) >> 8;
									} else if (anInt9351 == 255) {
										var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
										var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
										var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
										var3[var11] = (var14 | var15 | var16) >>> 8;
									} else {
										var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
										var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
										var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
										var13 = (var14 | var15 | var16) >>> 8;
										var17 = var3[var11];
										var3[var11] = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								var37 = this.aByteArray10095[var10];
								var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
								var14 = anInt9350;
								var15 = var13 + var14;
								var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
								var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
								var17 = var15 - var17 | var17 - (var17 >>> 8);
								if (var13 == 0 && anInt9351 != 255) {
									var13 = var17;
									var17 = var3[var11];
									var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
								}
								var3[var11] = var17;
							} else if (arg0 == 2) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
									var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
									var3[var11++] = ((var14 | var15) >>> 8) + anInt9323;
								}
							} else {
								throw new IllegalArgumentException();
							}
							var7 += anInt9341;
							var8++;
						}
					}
					var4++;
					anInt9346 += anInt9342;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			} else {
				var4 = anInt9356;
				while (var4 < 0) {
					var5 = anInt9339 * -29235085 * -1504772933;
					var6 = anInt9346;
					var7 = anInt9324 + anInt9349;
					var8 = anInt9347;
					if (var6 >= 0 && var6 - (this.anInt9358 << 12) < 0) {
						if (var7 < 0) {
							var9 = (anInt9341 - 1 - var7) / anInt9341;
							var8 += var9;
							var7 += anInt9341 * var9;
							var5 += var9;
						}
						int var22;
						if ((var22 = (var7 + 1 - (this.anInt9325 << 12) - anInt9341) / anInt9341) > var8) {
							var8 = var22;
						}
						while (var8 < 0) {
							var10 = (var7 >> 12) * this.anInt9358 + (var6 >> 12);
							var11 = var5++;
							if (arg1 == 0) {
								if (arg0 == 1) {
									var3[var11] = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								} else if (arg0 == 0) {
									var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
									var13 = (var12 & 0xFF0000) * anInt9353 & 0xFF000000;
									var14 = (var12 & 0xFF00) * anInt9354 & 0xFF0000;
									var15 = (var12 & 0xFF) * anInt9333 & 0xFF00;
									var3[var11] = (var13 | var14 | var15) >>> 8;
								} else if (arg0 == 3) {
									var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
									var13 = anInt9350;
									var14 = var12 + var13;
									var15 = (var12 & 0xFF00FF) + (var13 & 0xFF00FF);
									var16 = (var15 & 0x1000100) + (var14 - var15 & 0x10000);
									var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
								} else if (arg0 == 2) {
									var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
									var13 = (var12 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
									var14 = (var12 & 0xFF00) * anInt9351 & 0xFF0000;
									var3[var11] = ((var13 | var14) >>> 8) + anInt9323;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (arg1 != 1) {
								if (arg1 != 2) {
									throw new IllegalArgumentException();
								}
								if (arg0 == 1) {
									var37 = this.aByteArray10095[var10];
									if (var37 != 0) {
										var13 = this.anIntArray10096[var37 & 0xFF];
										var14 = var3[var11];
										var15 = var13 + var14;
										var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
										var14 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
										var3[var11] = var15 - var14 | var14 - (var14 >>> 8);
									}
								} else if (arg0 == 0) {
									var37 = this.aByteArray10095[var10];
									if (var37 != 0) {
										var13 = this.anIntArray10096[var37 & 0xFF];
										var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
										var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
										var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
										var13 = (var14 | var15 | var16) >>> 8;
										var17 = var3[var11];
										var18 = var13 + var17;
										var19 = (var13 & 0xFF00FF) + (var17 & 0xFF00FF);
										var17 = (var19 & 0x1000100) + (var18 - var19 & 0x10000);
										var3[var11] = var18 - var17 | var17 - (var17 >>> 8);
									}
								} else if (arg0 == 3) {
									var37 = this.aByteArray10095[var10];
									var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
									var14 = anInt9350;
									var15 = var13 + var14;
									var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
									var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
									var17 = var15 - var17 | var17 - (var17 >>> 8);
									if (var13 == 0 && anInt9351 != 255) {
										var13 = var17;
										var17 = var3[var11];
										var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
									}
									var3[var11] = var17;
								} else if (arg0 == 2) {
									var37 = this.aByteArray10095[var10];
									if (var37 != 0) {
										var13 = this.anIntArray10096[var37 & 0xFF];
										var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
										var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
										var13 = ((var14 | var15) >>> 8) + anInt9323;
										var16 = var3[var11];
										var17 = var13 + var16;
										var18 = (var13 & 0xFF00FF) + (var16 & 0xFF00FF);
										var16 = (var18 & 0x1000100) + (var17 - var18 & 0x10000);
										var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
									}
								}
							} else if (arg0 == 1) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var3[var11] = this.anIntArray10096[var37 & 0xFF];
								}
							} else if (arg0 == 0) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									if ((anInt9350 & 0xFFFFFF) == 16777215) {
										var14 = anInt9350 >>> 24;
										var15 = 256 - var14;
										var16 = var3[var11];
										var3[var11] = ((var13 & 0xFF00FF) * var14 + (var16 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var13 & 0xFF00) * var14 + (var16 & 0xFF00) * var15 & 0xFF0000) >> 8;
									} else if (anInt9351 == 255) {
										var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
										var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
										var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
										var3[var11] = (var14 | var15 | var16) >>> 8;
									} else {
										var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
										var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
										var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
										var13 = (var14 | var15 | var16) >>> 8;
										var17 = var3[var11];
										var3[var11] = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								var37 = this.aByteArray10095[var10];
								var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
								var14 = anInt9350;
								var15 = var13 + var14;
								var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
								var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
								var17 = var15 - var17 | var17 - (var17 >>> 8);
								if (var13 == 0 && anInt9351 != 255) {
									var13 = var17;
									var17 = var3[var11];
									var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
								}
								var3[var11] = var17;
							} else if (arg0 == 2) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
									var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
									var3[var11++] = ((var14 | var15) >>> 8) + anInt9323;
								}
							} else {
								throw new IllegalArgumentException();
							}
							var7 += anInt9341;
							var8++;
						}
					}
					var4++;
					anInt9346 += anInt9342;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			}
		} else if (anInt9340 < 0) {
			if (anInt9341 == 0) {
				var4 = anInt9356;
				while (var4 < 0) {
					var5 = anInt9339 * -29235085 * -1504772933;
					var6 = anInt9346 + anInt9348;
					var7 = anInt9324;
					var8 = anInt9347;
					if (var7 >= 0 && var7 - (this.anInt9325 << 12) < 0) {
						int var23;
						if ((var23 = var6 - (this.anInt9358 << 12)) >= 0) {
							var9 = (anInt9340 - var23) / anInt9340;
							var8 += var9;
							var6 += anInt9340 * var9;
							var5 += var9;
						}
						int var24;
						if ((var24 = (var6 - anInt9340) / anInt9340) > var8) {
							var8 = var24;
						}
						while (var8 < 0) {
							var10 = (var7 >> 12) * this.anInt9358 + (var6 >> 12);
							var11 = var5++;
							if (arg1 == 0) {
								if (arg0 == 1) {
									var3[var11] = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								} else if (arg0 == 0) {
									var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
									var13 = (var12 & 0xFF0000) * anInt9353 & 0xFF000000;
									var14 = (var12 & 0xFF00) * anInt9354 & 0xFF0000;
									var15 = (var12 & 0xFF) * anInt9333 & 0xFF00;
									var3[var11] = (var13 | var14 | var15) >>> 8;
								} else if (arg0 == 3) {
									var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
									var13 = anInt9350;
									var14 = var12 + var13;
									var15 = (var12 & 0xFF00FF) + (var13 & 0xFF00FF);
									var16 = (var15 & 0x1000100) + (var14 - var15 & 0x10000);
									var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
								} else if (arg0 == 2) {
									var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
									var13 = (var12 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
									var14 = (var12 & 0xFF00) * anInt9351 & 0xFF0000;
									var3[var11] = ((var13 | var14) >>> 8) + anInt9323;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (arg1 != 1) {
								if (arg1 != 2) {
									throw new IllegalArgumentException();
								}
								if (arg0 == 1) {
									var37 = this.aByteArray10095[var10];
									if (var37 != 0) {
										var13 = this.anIntArray10096[var37 & 0xFF];
										var14 = var3[var11];
										var15 = var13 + var14;
										var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
										var14 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
										var3[var11] = var15 - var14 | var14 - (var14 >>> 8);
									}
								} else if (arg0 == 0) {
									var37 = this.aByteArray10095[var10];
									if (var37 != 0) {
										var13 = this.anIntArray10096[var37 & 0xFF];
										var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
										var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
										var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
										var13 = (var14 | var15 | var16) >>> 8;
										var17 = var3[var11];
										var18 = var13 + var17;
										var19 = (var13 & 0xFF00FF) + (var17 & 0xFF00FF);
										var17 = (var19 & 0x1000100) + (var18 - var19 & 0x10000);
										var3[var11] = var18 - var17 | var17 - (var17 >>> 8);
									}
								} else if (arg0 == 3) {
									var37 = this.aByteArray10095[var10];
									var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
									var14 = anInt9350;
									var15 = var13 + var14;
									var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
									var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
									var17 = var15 - var17 | var17 - (var17 >>> 8);
									if (var13 == 0 && anInt9351 != 255) {
										var13 = var17;
										var17 = var3[var11];
										var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
									}
									var3[var11] = var17;
								} else if (arg0 == 2) {
									var37 = this.aByteArray10095[var10];
									if (var37 != 0) {
										var13 = this.anIntArray10096[var37 & 0xFF];
										var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
										var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
										var13 = ((var14 | var15) >>> 8) + anInt9323;
										var16 = var3[var11];
										var17 = var13 + var16;
										var18 = (var13 & 0xFF00FF) + (var16 & 0xFF00FF);
										var16 = (var18 & 0x1000100) + (var17 - var18 & 0x10000);
										var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
									}
								}
							} else if (arg0 == 1) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var3[var11] = this.anIntArray10096[var37 & 0xFF];
								}
							} else if (arg0 == 0) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									if ((anInt9350 & 0xFFFFFF) == 16777215) {
										var14 = anInt9350 >>> 24;
										var15 = 256 - var14;
										var16 = var3[var11];
										var3[var11] = ((var13 & 0xFF00FF) * var14 + (var16 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var13 & 0xFF00) * var14 + (var16 & 0xFF00) * var15 & 0xFF0000) >> 8;
									} else if (anInt9351 == 255) {
										var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
										var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
										var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
										var3[var11] = (var14 | var15 | var16) >>> 8;
									} else {
										var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
										var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
										var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
										var13 = (var14 | var15 | var16) >>> 8;
										var17 = var3[var11];
										var3[var11] = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								var37 = this.aByteArray10095[var10];
								var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
								var14 = anInt9350;
								var15 = var13 + var14;
								var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
								var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
								var17 = var15 - var17 | var17 - (var17 >>> 8);
								if (var13 == 0 && anInt9351 != 255) {
									var13 = var17;
									var17 = var3[var11];
									var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
								}
								var3[var11] = var17;
							} else if (arg0 == 2) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
									var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
									var3[var11++] = ((var14 | var15) >>> 8) + anInt9323;
								}
							} else {
								throw new IllegalArgumentException();
							}
							var6 += anInt9340;
							var8++;
						}
					}
					var4++;
					anInt9324 += anInt9343;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			} else if (anInt9341 < 0) {
				var4 = anInt9356;
				while (var4 < 0) {
					var5 = anInt9339 * -29235085 * -1504772933;
					var6 = anInt9346 + anInt9348;
					var7 = anInt9324 + anInt9349;
					var8 = anInt9347;
					int var25;
					if ((var25 = var6 - (this.anInt9358 << 12)) >= 0) {
						var9 = (anInt9340 - var25) / anInt9340;
						var8 += var9;
						var6 += anInt9340 * var9;
						var7 += anInt9341 * var9;
						var5 += var9;
					}
					int var27;
					if ((var27 = (var6 - anInt9340) / anInt9340) > var8) {
						var8 = var27;
					}
					int var28;
					if ((var28 = var7 - (this.anInt9325 << 12)) >= 0) {
						var9 = (anInt9341 - var28) / anInt9341;
						var8 += var9;
						var6 += anInt9340 * var9;
						var7 += anInt9341 * var9;
						var5 += var9;
					}
					int var29;
					if ((var29 = (var7 - anInt9341) / anInt9341) > var8) {
						var8 = var29;
					}
					while (var8 < 0) {
						var10 = (var7 >> 12) * this.anInt9358 + (var6 >> 12);
						var11 = var5++;
						if (arg1 == 0) {
							if (arg0 == 1) {
								var3[var11] = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
							} else if (arg0 == 0) {
								var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								var13 = (var12 & 0xFF0000) * anInt9353 & 0xFF000000;
								var14 = (var12 & 0xFF00) * anInt9354 & 0xFF0000;
								var15 = (var12 & 0xFF) * anInt9333 & 0xFF00;
								var3[var11] = (var13 | var14 | var15) >>> 8;
							} else if (arg0 == 3) {
								var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								var13 = anInt9350;
								var14 = var12 + var13;
								var15 = (var12 & 0xFF00FF) + (var13 & 0xFF00FF);
								var16 = (var15 & 0x1000100) + (var14 - var15 & 0x10000);
								var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
							} else if (arg0 == 2) {
								var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								var13 = (var12 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
								var14 = (var12 & 0xFF00) * anInt9351 & 0xFF0000;
								var3[var11] = ((var13 | var14) >>> 8) + anInt9323;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (arg1 != 1) {
							if (arg1 != 2) {
								throw new IllegalArgumentException();
							}
							if (arg0 == 1) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = var3[var11];
									var15 = var13 + var14;
									var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
									var14 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
									var3[var11] = var15 - var14 | var14 - (var14 >>> 8);
								}
							} else if (arg0 == 0) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
									var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
									var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
									var13 = (var14 | var15 | var16) >>> 8;
									var17 = var3[var11];
									var18 = var13 + var17;
									var19 = (var13 & 0xFF00FF) + (var17 & 0xFF00FF);
									var17 = (var19 & 0x1000100) + (var18 - var19 & 0x10000);
									var3[var11] = var18 - var17 | var17 - (var17 >>> 8);
								}
							} else if (arg0 == 3) {
								var37 = this.aByteArray10095[var10];
								var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
								var14 = anInt9350;
								var15 = var13 + var14;
								var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
								var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
								var17 = var15 - var17 | var17 - (var17 >>> 8);
								if (var13 == 0 && anInt9351 != 255) {
									var13 = var17;
									var17 = var3[var11];
									var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
								}
								var3[var11] = var17;
							} else if (arg0 == 2) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
									var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
									var13 = ((var14 | var15) >>> 8) + anInt9323;
									var16 = var3[var11];
									var17 = var13 + var16;
									var18 = (var13 & 0xFF00FF) + (var16 & 0xFF00FF);
									var16 = (var18 & 0x1000100) + (var17 - var18 & 0x10000);
									var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
								}
							}
						} else if (arg0 == 1) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var3[var11] = this.anIntArray10096[var37 & 0xFF];
							}
						} else if (arg0 == 0) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								if ((anInt9350 & 0xFFFFFF) == 16777215) {
									var14 = anInt9350 >>> 24;
									var15 = 256 - var14;
									var16 = var3[var11];
									var3[var11] = ((var13 & 0xFF00FF) * var14 + (var16 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var13 & 0xFF00) * var14 + (var16 & 0xFF00) * var15 & 0xFF0000) >> 8;
								} else if (anInt9351 == 255) {
									var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
									var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
									var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
									var3[var11] = (var14 | var15 | var16) >>> 8;
								} else {
									var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
									var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
									var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
									var13 = (var14 | var15 | var16) >>> 8;
									var17 = var3[var11];
									var3[var11] = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							var37 = this.aByteArray10095[var10];
							var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
							var14 = anInt9350;
							var15 = var13 + var14;
							var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
							var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
							var17 = var15 - var17 | var17 - (var17 >>> 8);
							if (var13 == 0 && anInt9351 != 255) {
								var13 = var17;
								var17 = var3[var11];
								var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
							}
							var3[var11] = var17;
						} else if (arg0 == 2) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
								var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
								var3[var11++] = ((var14 | var15) >>> 8) + anInt9323;
							}
						} else {
							throw new IllegalArgumentException();
						}
						var6 += anInt9340;
						var7 += anInt9341;
						var8++;
					}
					var4++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			} else {
				var4 = anInt9356;
				while (var4 < 0) {
					var5 = anInt9339 * -29235085 * -1504772933;
					var6 = anInt9346 + anInt9348;
					var7 = anInt9324 + anInt9349;
					var8 = anInt9347;
					int var30;
					if ((var30 = var6 - (this.anInt9358 << 12)) >= 0) {
						var9 = (anInt9340 - var30) / anInt9340;
						var8 += var9;
						var6 += anInt9340 * var9;
						var7 += anInt9341 * var9;
						var5 += var9;
					}
					int var31;
					if ((var31 = (var6 - anInt9340) / anInt9340) > var8) {
						var8 = var31;
					}
					if (var7 < 0) {
						var9 = (anInt9341 - 1 - var7) / anInt9341;
						var8 += var9;
						var6 += anInt9340 * var9;
						var7 += anInt9341 * var9;
						var5 += var9;
					}
					int var32;
					if ((var32 = (var7 + 1 - (this.anInt9325 << 12) - anInt9341) / anInt9341) > var8) {
						var8 = var32;
					}
					while (var8 < 0) {
						var10 = (var7 >> 12) * this.anInt9358 + (var6 >> 12);
						var11 = var5++;
						if (arg1 == 0) {
							if (arg0 == 1) {
								var3[var11] = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
							} else if (arg0 == 0) {
								var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								var13 = (var12 & 0xFF0000) * anInt9353 & 0xFF000000;
								var14 = (var12 & 0xFF00) * anInt9354 & 0xFF0000;
								var15 = (var12 & 0xFF) * anInt9333 & 0xFF00;
								var3[var11] = (var13 | var14 | var15) >>> 8;
							} else if (arg0 == 3) {
								var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								var13 = anInt9350;
								var14 = var12 + var13;
								var15 = (var12 & 0xFF00FF) + (var13 & 0xFF00FF);
								var16 = (var15 & 0x1000100) + (var14 - var15 & 0x10000);
								var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
							} else if (arg0 == 2) {
								var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								var13 = (var12 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
								var14 = (var12 & 0xFF00) * anInt9351 & 0xFF0000;
								var3[var11] = ((var13 | var14) >>> 8) + anInt9323;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (arg1 != 1) {
							if (arg1 != 2) {
								throw new IllegalArgumentException();
							}
							if (arg0 == 1) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = var3[var11];
									var15 = var13 + var14;
									var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
									var14 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
									var3[var11] = var15 - var14 | var14 - (var14 >>> 8);
								}
							} else if (arg0 == 0) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
									var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
									var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
									var13 = (var14 | var15 | var16) >>> 8;
									var17 = var3[var11];
									var18 = var13 + var17;
									var19 = (var13 & 0xFF00FF) + (var17 & 0xFF00FF);
									var17 = (var19 & 0x1000100) + (var18 - var19 & 0x10000);
									var3[var11] = var18 - var17 | var17 - (var17 >>> 8);
								}
							} else if (arg0 == 3) {
								var37 = this.aByteArray10095[var10];
								var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
								var14 = anInt9350;
								var15 = var13 + var14;
								var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
								var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
								var17 = var15 - var17 | var17 - (var17 >>> 8);
								if (var13 == 0 && anInt9351 != 255) {
									var13 = var17;
									var17 = var3[var11];
									var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
								}
								var3[var11] = var17;
							} else if (arg0 == 2) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
									var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
									var13 = ((var14 | var15) >>> 8) + anInt9323;
									var16 = var3[var11];
									var17 = var13 + var16;
									var18 = (var13 & 0xFF00FF) + (var16 & 0xFF00FF);
									var16 = (var18 & 0x1000100) + (var17 - var18 & 0x10000);
									var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
								}
							}
						} else if (arg0 == 1) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var3[var11] = this.anIntArray10096[var37 & 0xFF];
							}
						} else if (arg0 == 0) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								if ((anInt9350 & 0xFFFFFF) == 16777215) {
									var14 = anInt9350 >>> 24;
									var15 = 256 - var14;
									var16 = var3[var11];
									var3[var11] = ((var13 & 0xFF00FF) * var14 + (var16 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var13 & 0xFF00) * var14 + (var16 & 0xFF00) * var15 & 0xFF0000) >> 8;
								} else if (anInt9351 == 255) {
									var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
									var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
									var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
									var3[var11] = (var14 | var15 | var16) >>> 8;
								} else {
									var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
									var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
									var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
									var13 = (var14 | var15 | var16) >>> 8;
									var17 = var3[var11];
									var3[var11] = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							var37 = this.aByteArray10095[var10];
							var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
							var14 = anInt9350;
							var15 = var13 + var14;
							var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
							var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
							var17 = var15 - var17 | var17 - (var17 >>> 8);
							if (var13 == 0 && anInt9351 != 255) {
								var13 = var17;
								var17 = var3[var11];
								var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
							}
							var3[var11] = var17;
						} else if (arg0 == 2) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
								var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
								var3[var11++] = ((var14 | var15) >>> 8) + anInt9323;
							}
						} else {
							throw new IllegalArgumentException();
						}
						var6 += anInt9340;
						var7 += anInt9341;
						var8++;
					}
					var4++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			}
		} else if (anInt9341 == 0) {
			var4 = anInt9356;
			while (var4 < 0) {
				var5 = anInt9339 * -29235085 * -1504772933;
				var6 = anInt9346 + anInt9348;
				var7 = anInt9324;
				var8 = anInt9347;
				if (var7 >= 0 && var7 - (this.anInt9325 << 12) < 0) {
					if (var6 < 0) {
						var9 = (anInt9340 - 1 - var6) / anInt9340;
						var8 += var9;
						var6 += anInt9340 * var9;
						var5 += var9;
					}
					int var33;
					if ((var33 = (var6 + 1 - (this.anInt9358 << 12) - anInt9340) / anInt9340) > var8) {
						var8 = var33;
					}
					while (var8 < 0) {
						var10 = (var7 >> 12) * this.anInt9358 + (var6 >> 12);
						var11 = var5++;
						if (arg1 == 0) {
							if (arg0 == 1) {
								var3[var11] = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
							} else if (arg0 == 0) {
								var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								var13 = (var12 & 0xFF0000) * anInt9353 & 0xFF000000;
								var14 = (var12 & 0xFF00) * anInt9354 & 0xFF0000;
								var15 = (var12 & 0xFF) * anInt9333 & 0xFF00;
								var3[var11] = (var13 | var14 | var15) >>> 8;
							} else if (arg0 == 3) {
								var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								var13 = anInt9350;
								var14 = var12 + var13;
								var15 = (var12 & 0xFF00FF) + (var13 & 0xFF00FF);
								var16 = (var15 & 0x1000100) + (var14 - var15 & 0x10000);
								var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
							} else if (arg0 == 2) {
								var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								var13 = (var12 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
								var14 = (var12 & 0xFF00) * anInt9351 & 0xFF0000;
								var3[var11] = ((var13 | var14) >>> 8) + anInt9323;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (arg1 != 1) {
							if (arg1 != 2) {
								throw new IllegalArgumentException();
							}
							if (arg0 == 1) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = var3[var11];
									var15 = var13 + var14;
									var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
									var14 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
									var3[var11] = var15 - var14 | var14 - (var14 >>> 8);
								}
							} else if (arg0 == 0) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
									var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
									var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
									var13 = (var14 | var15 | var16) >>> 8;
									var17 = var3[var11];
									var18 = var13 + var17;
									var19 = (var13 & 0xFF00FF) + (var17 & 0xFF00FF);
									var17 = (var19 & 0x1000100) + (var18 - var19 & 0x10000);
									var3[var11] = var18 - var17 | var17 - (var17 >>> 8);
								}
							} else if (arg0 == 3) {
								var37 = this.aByteArray10095[var10];
								var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
								var14 = anInt9350;
								var15 = var13 + var14;
								var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
								var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
								var17 = var15 - var17 | var17 - (var17 >>> 8);
								if (var13 == 0 && anInt9351 != 255) {
									var13 = var17;
									var17 = var3[var11];
									var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
								}
								var3[var11] = var17;
							} else if (arg0 == 2) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
									var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
									var13 = ((var14 | var15) >>> 8) + anInt9323;
									var16 = var3[var11];
									var17 = var13 + var16;
									var18 = (var13 & 0xFF00FF) + (var16 & 0xFF00FF);
									var16 = (var18 & 0x1000100) + (var17 - var18 & 0x10000);
									var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
								}
							}
						} else if (arg0 == 1) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var3[var11] = this.anIntArray10096[var37 & 0xFF];
							}
						} else if (arg0 == 0) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								if ((anInt9350 & 0xFFFFFF) == 16777215) {
									var14 = anInt9350 >>> 24;
									var15 = 256 - var14;
									var16 = var3[var11];
									var3[var11] = ((var13 & 0xFF00FF) * var14 + (var16 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var13 & 0xFF00) * var14 + (var16 & 0xFF00) * var15 & 0xFF0000) >> 8;
								} else if (anInt9351 == 255) {
									var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
									var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
									var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
									var3[var11] = (var14 | var15 | var16) >>> 8;
								} else {
									var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
									var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
									var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
									var13 = (var14 | var15 | var16) >>> 8;
									var17 = var3[var11];
									var3[var11] = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							var37 = this.aByteArray10095[var10];
							var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
							var14 = anInt9350;
							var15 = var13 + var14;
							var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
							var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
							var17 = var15 - var17 | var17 - (var17 >>> 8);
							if (var13 == 0 && anInt9351 != 255) {
								var13 = var17;
								var17 = var3[var11];
								var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
							}
							var3[var11] = var17;
						} else if (arg0 == 2) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
								var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
								var3[var11++] = ((var14 | var15) >>> 8) + anInt9323;
							}
						} else {
							throw new IllegalArgumentException();
						}
						var6 += anInt9340;
						var8++;
					}
				}
				var4++;
				anInt9346 += anInt9342;
				anInt9324 += anInt9343;
				anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
			}
		} else if (anInt9341 < 0) {
			for (var4 = anInt9356; var4 < 0; var4++) {
				var5 = anInt9339 * -29235085 * -1504772933;
				var6 = anInt9346 + anInt9348;
				var7 = anInt9324 + anInt9349;
				var8 = anInt9347;
				if (var6 < 0) {
					var9 = (anInt9340 - 1 - var6) / anInt9340;
					var8 += var9;
					var6 += anInt9340 * var9;
					var7 += anInt9341 * var9;
					var5 += var9;
				}
				int var34;
				if ((var34 = (var6 + 1 - (this.anInt9358 << 12) - anInt9340) / anInt9340) > var8) {
					var8 = var34;
				}
				int var35;
				if ((var35 = var7 - (this.anInt9325 << 12)) >= 0) {
					var9 = (anInt9341 - var35) / anInt9341;
					var8 += var9;
					var6 += anInt9340 * var9;
					var7 += anInt9341 * var9;
					var5 += var9;
				}
				int var36;
				if ((var36 = (var7 - anInt9341) / anInt9341) > var8) {
					var8 = var36;
				}
				while (var8 < 0) {
					var10 = (var7 >> 12) * this.anInt9358 + (var6 >> 12);
					var11 = var5++;
					if (arg1 == 0) {
						if (arg0 == 1) {
							var3[var11] = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
						} else if (arg0 == 0) {
							var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
							var13 = (var12 & 0xFF0000) * anInt9353 & 0xFF000000;
							var14 = (var12 & 0xFF00) * anInt9354 & 0xFF0000;
							var15 = (var12 & 0xFF) * anInt9333 & 0xFF00;
							var3[var11] = (var13 | var14 | var15) >>> 8;
						} else if (arg0 == 3) {
							var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
							var13 = anInt9350;
							var14 = var12 + var13;
							var15 = (var12 & 0xFF00FF) + (var13 & 0xFF00FF);
							var16 = (var15 & 0x1000100) + (var14 - var15 & 0x10000);
							var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
						} else if (arg0 == 2) {
							var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
							var13 = (var12 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
							var14 = (var12 & 0xFF00) * anInt9351 & 0xFF0000;
							var3[var11] = ((var13 | var14) >>> 8) + anInt9323;
						} else {
							throw new IllegalArgumentException();
						}
					} else if (arg1 != 1) {
						if (arg1 != 2) {
							throw new IllegalArgumentException();
						}
						if (arg0 == 1) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								var14 = var3[var11];
								var15 = var13 + var14;
								var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
								var14 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
								var3[var11] = var15 - var14 | var14 - (var14 >>> 8);
							}
						} else if (arg0 == 0) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
								var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
								var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
								var13 = (var14 | var15 | var16) >>> 8;
								var17 = var3[var11];
								var18 = var13 + var17;
								var19 = (var13 & 0xFF00FF) + (var17 & 0xFF00FF);
								var17 = (var19 & 0x1000100) + (var18 - var19 & 0x10000);
								var3[var11] = var18 - var17 | var17 - (var17 >>> 8);
							}
						} else if (arg0 == 3) {
							var37 = this.aByteArray10095[var10];
							var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
							var14 = anInt9350;
							var15 = var13 + var14;
							var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
							var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
							var17 = var15 - var17 | var17 - (var17 >>> 8);
							if (var13 == 0 && anInt9351 != 255) {
								var13 = var17;
								var17 = var3[var11];
								var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
							}
							var3[var11] = var17;
						} else if (arg0 == 2) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
								var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
								var13 = ((var14 | var15) >>> 8) + anInt9323;
								var16 = var3[var11];
								var17 = var13 + var16;
								var18 = (var13 & 0xFF00FF) + (var16 & 0xFF00FF);
								var16 = (var18 & 0x1000100) + (var17 - var18 & 0x10000);
								var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
							}
						}
					} else if (arg0 == 1) {
						var37 = this.aByteArray10095[var10];
						if (var37 != 0) {
							var3[var11] = this.anIntArray10096[var37 & 0xFF];
						}
					} else if (arg0 == 0) {
						var37 = this.aByteArray10095[var10];
						if (var37 != 0) {
							var13 = this.anIntArray10096[var37 & 0xFF];
							if ((anInt9350 & 0xFFFFFF) == 16777215) {
								var14 = anInt9350 >>> 24;
								var15 = 256 - var14;
								var16 = var3[var11];
								var3[var11] = ((var13 & 0xFF00FF) * var14 + (var16 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var13 & 0xFF00) * var14 + (var16 & 0xFF00) * var15 & 0xFF0000) >> 8;
							} else if (anInt9351 == 255) {
								var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
								var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
								var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
								var3[var11] = (var14 | var15 | var16) >>> 8;
							} else {
								var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
								var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
								var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
								var13 = (var14 | var15 | var16) >>> 8;
								var17 = var3[var11];
								var3[var11] = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
							}
						}
					} else if (arg0 == 3) {
						var37 = this.aByteArray10095[var10];
						var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
						var14 = anInt9350;
						var15 = var13 + var14;
						var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
						var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
						var17 = var15 - var17 | var17 - (var17 >>> 8);
						if (var13 == 0 && anInt9351 != 255) {
							var13 = var17;
							var17 = var3[var11];
							var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
						}
						var3[var11] = var17;
					} else if (arg0 == 2) {
						var37 = this.aByteArray10095[var10];
						if (var37 != 0) {
							var13 = this.anIntArray10096[var37 & 0xFF];
							var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
							var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
							var3[var11++] = ((var14 | var15) >>> 8) + anInt9323;
						}
					} else {
						throw new IllegalArgumentException();
					}
					var6 += anInt9340;
					var7 += anInt9341;
					var8++;
				}
				anInt9346 += anInt9342;
				anInt9324 += anInt9343;
				anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
			}
		} else {
			for (var4 = anInt9356; var4 < 0; var4++) {
				var5 = anInt9339 * -29235085 * -1504772933;
				var6 = anInt9346 + anInt9348;
				var7 = anInt9324 + anInt9349;
				var8 = anInt9347;
				if (var6 < 0) {
					var9 = (anInt9340 - 1 - var6) / anInt9340;
					var8 += var9;
					var6 += anInt9340 * var9;
					var7 += anInt9341 * var9;
					var5 += var9;
				}
				int var38;
				if ((var38 = (var6 + 1 - (this.anInt9358 << 12) - anInt9340) / anInt9340) > var8) {
					var8 = var38;
				}
				if (var7 < 0) {
					var9 = (anInt9341 - 1 - var7) / anInt9341;
					var8 += var9;
					var6 += anInt9340 * var9;
					var7 += anInt9341 * var9;
					var5 += var9;
				}
				int var39;
				if ((var39 = (var7 + 1 - (this.anInt9325 << 12) - anInt9341) / anInt9341) > var8) {
					var8 = var39;
				}
				while (var8 < 0) {
					var10 = (var7 >> 12) * this.anInt9358 + (var6 >> 12);
					var11 = var5++;
					if (arg1 == 0) {
						if (arg0 == 1) {
							var3[var11] = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
						} else if (arg0 == 0) {
							var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
							var13 = (var12 & 0xFF0000) * anInt9353 & 0xFF000000;
							var14 = (var12 & 0xFF00) * anInt9354 & 0xFF0000;
							var15 = (var12 & 0xFF) * anInt9333 & 0xFF00;
							var3[var11] = (var13 | var14 | var15) >>> 8;
						} else if (arg0 == 3) {
							var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
							var13 = anInt9350;
							var14 = var12 + var13;
							var15 = (var12 & 0xFF00FF) + (var13 & 0xFF00FF);
							var16 = (var15 & 0x1000100) + (var14 - var15 & 0x10000);
							var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
						} else if (arg0 == 2) {
							var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
							var13 = (var12 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
							var14 = (var12 & 0xFF00) * anInt9351 & 0xFF0000;
							var3[var11] = ((var13 | var14) >>> 8) + anInt9323;
						} else {
							throw new IllegalArgumentException();
						}
					} else if (arg1 != 1) {
						if (arg1 != 2) {
							throw new IllegalArgumentException();
						}
						if (arg0 == 1) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								var14 = var3[var11];
								var15 = var13 + var14;
								var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
								var14 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
								var3[var11] = var15 - var14 | var14 - (var14 >>> 8);
							}
						} else if (arg0 == 0) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
								var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
								var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
								var13 = (var14 | var15 | var16) >>> 8;
								var17 = var3[var11];
								var18 = var13 + var17;
								var19 = (var13 & 0xFF00FF) + (var17 & 0xFF00FF);
								var17 = (var19 & 0x1000100) + (var18 - var19 & 0x10000);
								var3[var11] = var18 - var17 | var17 - (var17 >>> 8);
							}
						} else if (arg0 == 3) {
							var37 = this.aByteArray10095[var10];
							var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
							var14 = anInt9350;
							var15 = var13 + var14;
							var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
							var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
							var17 = var15 - var17 | var17 - (var17 >>> 8);
							if (var13 == 0 && anInt9351 != 255) {
								var13 = var17;
								var17 = var3[var11];
								var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
							}
							var3[var11] = var17;
						} else if (arg0 == 2) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
								var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
								var13 = ((var14 | var15) >>> 8) + anInt9323;
								var16 = var3[var11];
								var17 = var13 + var16;
								var18 = (var13 & 0xFF00FF) + (var16 & 0xFF00FF);
								var16 = (var18 & 0x1000100) + (var17 - var18 & 0x10000);
								var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
							}
						}
					} else if (arg0 == 1) {
						var37 = this.aByteArray10095[var10];
						if (var37 != 0) {
							var3[var11] = this.anIntArray10096[var37 & 0xFF];
						}
					} else if (arg0 == 0) {
						var37 = this.aByteArray10095[var10];
						if (var37 != 0) {
							var13 = this.anIntArray10096[var37 & 0xFF];
							if ((anInt9350 & 0xFFFFFF) == 16777215) {
								var14 = anInt9350 >>> 24;
								var15 = 256 - var14;
								var16 = var3[var11];
								var3[var11] = ((var13 & 0xFF00FF) * var14 + (var16 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var13 & 0xFF00) * var14 + (var16 & 0xFF00) * var15 & 0xFF0000) >> 8;
							} else if (anInt9351 == 255) {
								var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
								var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
								var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
								var3[var11] = (var14 | var15 | var16) >>> 8;
							} else {
								var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
								var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
								var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
								var13 = (var14 | var15 | var16) >>> 8;
								var17 = var3[var11];
								var3[var11] = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
							}
						}
					} else if (arg0 == 3) {
						var37 = this.aByteArray10095[var10];
						var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
						var14 = anInt9350;
						var15 = var13 + var14;
						var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
						var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
						var17 = var15 - var17 | var17 - (var17 >>> 8);
						if (var13 == 0 && anInt9351 != 255) {
							var13 = var17;
							var17 = var3[var11];
							var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
						}
						var3[var11] = var17;
					} else if (arg0 == 2) {
						var37 = this.aByteArray10095[var10];
						if (var37 != 0) {
							var13 = this.anIntArray10096[var37 & 0xFF];
							var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
							var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
							var3[var11++] = ((var14 | var15) >>> 8) + anInt9323;
						}
					} else {
						throw new IllegalArgumentException();
					}
					var6 += anInt9340;
					var7 += anInt9341;
					var8++;
				}
				anInt9346 += anInt9342;
				anInt9324 += anInt9343;
				anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
			}
		}
	}

	public void method750(int arg0, int arg1) {
		int[] var3 = this.aClass_ra_Sub3_9355.anIntArray8630;
		if (var3 == null) {
			return;
		}
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var15;
		int var16;
		int var17;
		int var18;
		int var19;
		byte var37;
		if (anInt9340 == 0) {
			if (anInt9341 == 0) {
				var4 = anInt9356;
				while (var4 < 0) {
					var5 = anInt9339 * -29235085 * -1504772933;
					var6 = anInt9346;
					var7 = anInt9324;
					var8 = anInt9347;
					if (var6 >= 0 && var7 >= 0 && var6 - (this.anInt9358 << 12) < 0 && var7 - (this.anInt9325 << 12) < 0) {
						while (var8 < 0) {
							var9 = (var7 >> 12) * this.anInt9358 + (var6 >> 12);
							var10 = var5++;
							if (arg1 != 0) {
								byte var26;
								if (arg1 != 1) {
									if (arg1 != 2) {
										throw new IllegalArgumentException();
									}
									if (arg0 == 1) {
										var26 = this.aByteArray10095[var9];
										if (var26 != 0) {
											var12 = this.anIntArray10096[var26 & 0xFF];
											var13 = var3[var10];
											var14 = var12 + var13;
											var15 = (var12 & 0xFF00FF) + (var13 & 0xFF00FF);
											var13 = (var15 & 0x1000100) + (var14 - var15 & 0x10000);
											var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
										}
									} else if (arg0 == 0) {
										var26 = this.aByteArray10095[var9];
										if (var26 != 0) {
											var12 = this.anIntArray10096[var26 & 0xFF];
											var13 = (var12 & 0xFF0000) * anInt9353 & 0xFF000000;
											var14 = (var12 & 0xFF00) * anInt9354 & 0xFF0000;
											var15 = (var12 & 0xFF) * anInt9333 & 0xFF00;
											var12 = (var13 | var14 | var15) >>> 8;
											var16 = var3[var10];
											var17 = var12 + var16;
											var18 = (var12 & 0xFF00FF) + (var16 & 0xFF00FF);
											var16 = (var18 & 0x1000100) + (var17 - var18 & 0x10000);
											var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
										}
									} else if (arg0 == 3) {
										var26 = this.aByteArray10095[var9];
										var12 = var26 > 0 ? this.anIntArray10096[var26] : 0;
										var13 = anInt9350;
										var14 = var12 + var13;
										var15 = (var12 & 0xFF00FF) + (var13 & 0xFF00FF);
										var16 = (var15 & 0x1000100) + (var14 - var15 & 0x10000);
										var16 = var14 - var16 | var16 - (var16 >>> 8);
										if (var12 == 0 && anInt9351 != 255) {
											var12 = var16;
											var16 = var3[var10];
											var16 = ((var12 & 0xFF00FF) * anInt9351 + (var16 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var12 & 0xFF00) * anInt9351 + (var16 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
										}
										var3[var10] = var16;
									} else if (arg0 == 2) {
										var26 = this.aByteArray10095[var9];
										if (var26 != 0) {
											var12 = this.anIntArray10096[var26 & 0xFF];
											var13 = (var12 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
											var14 = (var12 & 0xFF00) * anInt9351 & 0xFF0000;
											var12 = ((var13 | var14) >>> 8) + anInt9323;
											var15 = var3[var10];
											var16 = var12 + var15;
											var17 = (var12 & 0xFF00FF) + (var15 & 0xFF00FF);
											var15 = (var17 & 0x1000100) + (var16 - var17 & 0x10000);
											var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
										}
									}
								} else if (arg0 == 1) {
									var26 = this.aByteArray10095[var9];
									if (var26 != 0) {
										var3[var10] = this.anIntArray10096[var26 & 0xFF];
									}
								} else if (arg0 == 0) {
									var26 = this.aByteArray10095[var9];
									if (var26 != 0) {
										var12 = this.anIntArray10096[var26 & 0xFF];
										if ((anInt9350 & 0xFFFFFF) == 16777215) {
											var13 = anInt9350 >>> 24;
											var14 = 256 - var13;
											var15 = var3[var10];
											var3[var10] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
										} else if (anInt9351 == 255) {
											var13 = (var12 & 0xFF0000) * anInt9353 & 0xFF000000;
											var14 = (var12 & 0xFF00) * anInt9354 & 0xFF0000;
											var15 = (var12 & 0xFF) * anInt9333 & 0xFF00;
											var3[var10] = (var13 | var14 | var15) >>> 8;
										} else {
											var13 = (var12 & 0xFF0000) * anInt9353 & 0xFF000000;
											var14 = (var12 & 0xFF00) * anInt9354 & 0xFF0000;
											var15 = (var12 & 0xFF) * anInt9333 & 0xFF00;
											var12 = (var13 | var14 | var15) >>> 8;
											var16 = var3[var10];
											var3[var10] = ((var12 & 0xFF00FF) * anInt9351 + (var16 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var12 & 0xFF00) * anInt9351 + (var16 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
										}
									}
								} else if (arg0 == 3) {
									var26 = this.aByteArray10095[var9];
									var12 = var26 > 0 ? this.anIntArray10096[var26] : 0;
									var13 = anInt9350;
									var14 = var12 + var13;
									var15 = (var12 & 0xFF00FF) + (var13 & 0xFF00FF);
									var16 = (var15 & 0x1000100) + (var14 - var15 & 0x10000);
									var16 = var14 - var16 | var16 - (var16 >>> 8);
									if (var12 == 0 && anInt9351 != 255) {
										var12 = var16;
										var16 = var3[var10];
										var16 = ((var12 & 0xFF00FF) * anInt9351 + (var16 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var12 & 0xFF00) * anInt9351 + (var16 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
									}
									var3[var10] = var16;
								} else if (arg0 == 2) {
									var26 = this.aByteArray10095[var9];
									if (var26 != 0) {
										var12 = this.anIntArray10096[var26 & 0xFF];
										var13 = (var12 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
										var14 = (var12 & 0xFF00) * anInt9351 & 0xFF0000;
										var3[var10++] = ((var13 | var14) >>> 8) + anInt9323;
									}
								} else {
									throw new IllegalArgumentException();
								}
							} else if (arg0 == 1) {
								var3[var10] = this.anIntArray10096[this.aByteArray10095[var9] & 0xFF];
							} else if (arg0 == 0) {
								var11 = this.anIntArray10096[this.aByteArray10095[var9] & 0xFF];
								var12 = (var11 & 0xFF0000) * anInt9353 & 0xFF000000;
								var13 = (var11 & 0xFF00) * anInt9354 & 0xFF0000;
								var14 = (var11 & 0xFF) * anInt9333 & 0xFF00;
								var3[var10] = (var12 | var13 | var14) >>> 8;
							} else if (arg0 == 3) {
								var11 = this.anIntArray10096[this.aByteArray10095[var9] & 0xFF];
								var12 = anInt9350;
								var13 = var11 + var12;
								var14 = (var11 & 0xFF00FF) + (var12 & 0xFF00FF);
								var15 = (var14 & 0x1000100) + (var13 - var14 & 0x10000);
								var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
							} else if (arg0 == 2) {
								var11 = this.anIntArray10096[this.aByteArray10095[var9] & 0xFF];
								var12 = (var11 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
								var13 = (var11 & 0xFF00) * anInt9351 & 0xFF0000;
								var3[var10] = ((var12 | var13) >>> 8) + anInt9323;
							} else {
								throw new IllegalArgumentException();
							}
							var8++;
						}
					}
					var4++;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			} else if (anInt9341 < 0) {
				var4 = anInt9356;
				while (var4 < 0) {
					var5 = anInt9339 * -29235085 * -1504772933;
					var6 = anInt9346;
					var7 = anInt9324 + anInt9349;
					var8 = anInt9347;
					if (var6 >= 0 && var6 - (this.anInt9358 << 12) < 0) {
						int var20;
						if ((var20 = var7 - (this.anInt9325 << 12)) >= 0) {
							var9 = (anInt9341 - var20) / anInt9341;
							var8 += var9;
							var7 += anInt9341 * var9;
							var5 += var9;
						}
						int var21;
						if ((var21 = (var7 - anInt9341) / anInt9341) > var8) {
							var8 = var21;
						}
						while (var8 < 0) {
							var10 = (var7 >> 12) * this.anInt9358 + (var6 >> 12);
							var11 = var5++;
							if (arg1 == 0) {
								if (arg0 == 1) {
									var3[var11] = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								} else if (arg0 == 0) {
									var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
									var13 = (var12 & 0xFF0000) * anInt9353 & 0xFF000000;
									var14 = (var12 & 0xFF00) * anInt9354 & 0xFF0000;
									var15 = (var12 & 0xFF) * anInt9333 & 0xFF00;
									var3[var11] = (var13 | var14 | var15) >>> 8;
								} else if (arg0 == 3) {
									var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
									var13 = anInt9350;
									var14 = var12 + var13;
									var15 = (var12 & 0xFF00FF) + (var13 & 0xFF00FF);
									var16 = (var15 & 0x1000100) + (var14 - var15 & 0x10000);
									var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
								} else if (arg0 == 2) {
									var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
									var13 = (var12 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
									var14 = (var12 & 0xFF00) * anInt9351 & 0xFF0000;
									var3[var11] = ((var13 | var14) >>> 8) + anInt9323;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (arg1 != 1) {
								if (arg1 != 2) {
									throw new IllegalArgumentException();
								}
								if (arg0 == 1) {
									var37 = this.aByteArray10095[var10];
									if (var37 != 0) {
										var13 = this.anIntArray10096[var37 & 0xFF];
										var14 = var3[var11];
										var15 = var13 + var14;
										var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
										var14 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
										var3[var11] = var15 - var14 | var14 - (var14 >>> 8);
									}
								} else if (arg0 == 0) {
									var37 = this.aByteArray10095[var10];
									if (var37 != 0) {
										var13 = this.anIntArray10096[var37 & 0xFF];
										var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
										var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
										var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
										var13 = (var14 | var15 | var16) >>> 8;
										var17 = var3[var11];
										var18 = var13 + var17;
										var19 = (var13 & 0xFF00FF) + (var17 & 0xFF00FF);
										var17 = (var19 & 0x1000100) + (var18 - var19 & 0x10000);
										var3[var11] = var18 - var17 | var17 - (var17 >>> 8);
									}
								} else if (arg0 == 3) {
									var37 = this.aByteArray10095[var10];
									var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
									var14 = anInt9350;
									var15 = var13 + var14;
									var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
									var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
									var17 = var15 - var17 | var17 - (var17 >>> 8);
									if (var13 == 0 && anInt9351 != 255) {
										var13 = var17;
										var17 = var3[var11];
										var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
									}
									var3[var11] = var17;
								} else if (arg0 == 2) {
									var37 = this.aByteArray10095[var10];
									if (var37 != 0) {
										var13 = this.anIntArray10096[var37 & 0xFF];
										var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
										var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
										var13 = ((var14 | var15) >>> 8) + anInt9323;
										var16 = var3[var11];
										var17 = var13 + var16;
										var18 = (var13 & 0xFF00FF) + (var16 & 0xFF00FF);
										var16 = (var18 & 0x1000100) + (var17 - var18 & 0x10000);
										var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
									}
								}
							} else if (arg0 == 1) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var3[var11] = this.anIntArray10096[var37 & 0xFF];
								}
							} else if (arg0 == 0) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									if ((anInt9350 & 0xFFFFFF) == 16777215) {
										var14 = anInt9350 >>> 24;
										var15 = 256 - var14;
										var16 = var3[var11];
										var3[var11] = ((var13 & 0xFF00FF) * var14 + (var16 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var13 & 0xFF00) * var14 + (var16 & 0xFF00) * var15 & 0xFF0000) >> 8;
									} else if (anInt9351 == 255) {
										var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
										var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
										var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
										var3[var11] = (var14 | var15 | var16) >>> 8;
									} else {
										var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
										var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
										var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
										var13 = (var14 | var15 | var16) >>> 8;
										var17 = var3[var11];
										var3[var11] = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								var37 = this.aByteArray10095[var10];
								var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
								var14 = anInt9350;
								var15 = var13 + var14;
								var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
								var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
								var17 = var15 - var17 | var17 - (var17 >>> 8);
								if (var13 == 0 && anInt9351 != 255) {
									var13 = var17;
									var17 = var3[var11];
									var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
								}
								var3[var11] = var17;
							} else if (arg0 == 2) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
									var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
									var3[var11++] = ((var14 | var15) >>> 8) + anInt9323;
								}
							} else {
								throw new IllegalArgumentException();
							}
							var7 += anInt9341;
							var8++;
						}
					}
					var4++;
					anInt9346 += anInt9342;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			} else {
				var4 = anInt9356;
				while (var4 < 0) {
					var5 = anInt9339 * -29235085 * -1504772933;
					var6 = anInt9346;
					var7 = anInt9324 + anInt9349;
					var8 = anInt9347;
					if (var6 >= 0 && var6 - (this.anInt9358 << 12) < 0) {
						if (var7 < 0) {
							var9 = (anInt9341 - 1 - var7) / anInt9341;
							var8 += var9;
							var7 += anInt9341 * var9;
							var5 += var9;
						}
						int var22;
						if ((var22 = (var7 + 1 - (this.anInt9325 << 12) - anInt9341) / anInt9341) > var8) {
							var8 = var22;
						}
						while (var8 < 0) {
							var10 = (var7 >> 12) * this.anInt9358 + (var6 >> 12);
							var11 = var5++;
							if (arg1 == 0) {
								if (arg0 == 1) {
									var3[var11] = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								} else if (arg0 == 0) {
									var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
									var13 = (var12 & 0xFF0000) * anInt9353 & 0xFF000000;
									var14 = (var12 & 0xFF00) * anInt9354 & 0xFF0000;
									var15 = (var12 & 0xFF) * anInt9333 & 0xFF00;
									var3[var11] = (var13 | var14 | var15) >>> 8;
								} else if (arg0 == 3) {
									var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
									var13 = anInt9350;
									var14 = var12 + var13;
									var15 = (var12 & 0xFF00FF) + (var13 & 0xFF00FF);
									var16 = (var15 & 0x1000100) + (var14 - var15 & 0x10000);
									var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
								} else if (arg0 == 2) {
									var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
									var13 = (var12 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
									var14 = (var12 & 0xFF00) * anInt9351 & 0xFF0000;
									var3[var11] = ((var13 | var14) >>> 8) + anInt9323;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (arg1 != 1) {
								if (arg1 != 2) {
									throw new IllegalArgumentException();
								}
								if (arg0 == 1) {
									var37 = this.aByteArray10095[var10];
									if (var37 != 0) {
										var13 = this.anIntArray10096[var37 & 0xFF];
										var14 = var3[var11];
										var15 = var13 + var14;
										var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
										var14 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
										var3[var11] = var15 - var14 | var14 - (var14 >>> 8);
									}
								} else if (arg0 == 0) {
									var37 = this.aByteArray10095[var10];
									if (var37 != 0) {
										var13 = this.anIntArray10096[var37 & 0xFF];
										var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
										var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
										var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
										var13 = (var14 | var15 | var16) >>> 8;
										var17 = var3[var11];
										var18 = var13 + var17;
										var19 = (var13 & 0xFF00FF) + (var17 & 0xFF00FF);
										var17 = (var19 & 0x1000100) + (var18 - var19 & 0x10000);
										var3[var11] = var18 - var17 | var17 - (var17 >>> 8);
									}
								} else if (arg0 == 3) {
									var37 = this.aByteArray10095[var10];
									var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
									var14 = anInt9350;
									var15 = var13 + var14;
									var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
									var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
									var17 = var15 - var17 | var17 - (var17 >>> 8);
									if (var13 == 0 && anInt9351 != 255) {
										var13 = var17;
										var17 = var3[var11];
										var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
									}
									var3[var11] = var17;
								} else if (arg0 == 2) {
									var37 = this.aByteArray10095[var10];
									if (var37 != 0) {
										var13 = this.anIntArray10096[var37 & 0xFF];
										var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
										var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
										var13 = ((var14 | var15) >>> 8) + anInt9323;
										var16 = var3[var11];
										var17 = var13 + var16;
										var18 = (var13 & 0xFF00FF) + (var16 & 0xFF00FF);
										var16 = (var18 & 0x1000100) + (var17 - var18 & 0x10000);
										var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
									}
								}
							} else if (arg0 == 1) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var3[var11] = this.anIntArray10096[var37 & 0xFF];
								}
							} else if (arg0 == 0) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									if ((anInt9350 & 0xFFFFFF) == 16777215) {
										var14 = anInt9350 >>> 24;
										var15 = 256 - var14;
										var16 = var3[var11];
										var3[var11] = ((var13 & 0xFF00FF) * var14 + (var16 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var13 & 0xFF00) * var14 + (var16 & 0xFF00) * var15 & 0xFF0000) >> 8;
									} else if (anInt9351 == 255) {
										var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
										var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
										var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
										var3[var11] = (var14 | var15 | var16) >>> 8;
									} else {
										var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
										var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
										var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
										var13 = (var14 | var15 | var16) >>> 8;
										var17 = var3[var11];
										var3[var11] = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								var37 = this.aByteArray10095[var10];
								var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
								var14 = anInt9350;
								var15 = var13 + var14;
								var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
								var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
								var17 = var15 - var17 | var17 - (var17 >>> 8);
								if (var13 == 0 && anInt9351 != 255) {
									var13 = var17;
									var17 = var3[var11];
									var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
								}
								var3[var11] = var17;
							} else if (arg0 == 2) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
									var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
									var3[var11++] = ((var14 | var15) >>> 8) + anInt9323;
								}
							} else {
								throw new IllegalArgumentException();
							}
							var7 += anInt9341;
							var8++;
						}
					}
					var4++;
					anInt9346 += anInt9342;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			}
		} else if (anInt9340 < 0) {
			if (anInt9341 == 0) {
				var4 = anInt9356;
				while (var4 < 0) {
					var5 = anInt9339 * -29235085 * -1504772933;
					var6 = anInt9346 + anInt9348;
					var7 = anInt9324;
					var8 = anInt9347;
					if (var7 >= 0 && var7 - (this.anInt9325 << 12) < 0) {
						int var23;
						if ((var23 = var6 - (this.anInt9358 << 12)) >= 0) {
							var9 = (anInt9340 - var23) / anInt9340;
							var8 += var9;
							var6 += anInt9340 * var9;
							var5 += var9;
						}
						int var24;
						if ((var24 = (var6 - anInt9340) / anInt9340) > var8) {
							var8 = var24;
						}
						while (var8 < 0) {
							var10 = (var7 >> 12) * this.anInt9358 + (var6 >> 12);
							var11 = var5++;
							if (arg1 == 0) {
								if (arg0 == 1) {
									var3[var11] = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								} else if (arg0 == 0) {
									var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
									var13 = (var12 & 0xFF0000) * anInt9353 & 0xFF000000;
									var14 = (var12 & 0xFF00) * anInt9354 & 0xFF0000;
									var15 = (var12 & 0xFF) * anInt9333 & 0xFF00;
									var3[var11] = (var13 | var14 | var15) >>> 8;
								} else if (arg0 == 3) {
									var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
									var13 = anInt9350;
									var14 = var12 + var13;
									var15 = (var12 & 0xFF00FF) + (var13 & 0xFF00FF);
									var16 = (var15 & 0x1000100) + (var14 - var15 & 0x10000);
									var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
								} else if (arg0 == 2) {
									var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
									var13 = (var12 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
									var14 = (var12 & 0xFF00) * anInt9351 & 0xFF0000;
									var3[var11] = ((var13 | var14) >>> 8) + anInt9323;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (arg1 != 1) {
								if (arg1 != 2) {
									throw new IllegalArgumentException();
								}
								if (arg0 == 1) {
									var37 = this.aByteArray10095[var10];
									if (var37 != 0) {
										var13 = this.anIntArray10096[var37 & 0xFF];
										var14 = var3[var11];
										var15 = var13 + var14;
										var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
										var14 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
										var3[var11] = var15 - var14 | var14 - (var14 >>> 8);
									}
								} else if (arg0 == 0) {
									var37 = this.aByteArray10095[var10];
									if (var37 != 0) {
										var13 = this.anIntArray10096[var37 & 0xFF];
										var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
										var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
										var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
										var13 = (var14 | var15 | var16) >>> 8;
										var17 = var3[var11];
										var18 = var13 + var17;
										var19 = (var13 & 0xFF00FF) + (var17 & 0xFF00FF);
										var17 = (var19 & 0x1000100) + (var18 - var19 & 0x10000);
										var3[var11] = var18 - var17 | var17 - (var17 >>> 8);
									}
								} else if (arg0 == 3) {
									var37 = this.aByteArray10095[var10];
									var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
									var14 = anInt9350;
									var15 = var13 + var14;
									var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
									var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
									var17 = var15 - var17 | var17 - (var17 >>> 8);
									if (var13 == 0 && anInt9351 != 255) {
										var13 = var17;
										var17 = var3[var11];
										var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
									}
									var3[var11] = var17;
								} else if (arg0 == 2) {
									var37 = this.aByteArray10095[var10];
									if (var37 != 0) {
										var13 = this.anIntArray10096[var37 & 0xFF];
										var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
										var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
										var13 = ((var14 | var15) >>> 8) + anInt9323;
										var16 = var3[var11];
										var17 = var13 + var16;
										var18 = (var13 & 0xFF00FF) + (var16 & 0xFF00FF);
										var16 = (var18 & 0x1000100) + (var17 - var18 & 0x10000);
										var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
									}
								}
							} else if (arg0 == 1) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var3[var11] = this.anIntArray10096[var37 & 0xFF];
								}
							} else if (arg0 == 0) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									if ((anInt9350 & 0xFFFFFF) == 16777215) {
										var14 = anInt9350 >>> 24;
										var15 = 256 - var14;
										var16 = var3[var11];
										var3[var11] = ((var13 & 0xFF00FF) * var14 + (var16 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var13 & 0xFF00) * var14 + (var16 & 0xFF00) * var15 & 0xFF0000) >> 8;
									} else if (anInt9351 == 255) {
										var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
										var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
										var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
										var3[var11] = (var14 | var15 | var16) >>> 8;
									} else {
										var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
										var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
										var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
										var13 = (var14 | var15 | var16) >>> 8;
										var17 = var3[var11];
										var3[var11] = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								var37 = this.aByteArray10095[var10];
								var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
								var14 = anInt9350;
								var15 = var13 + var14;
								var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
								var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
								var17 = var15 - var17 | var17 - (var17 >>> 8);
								if (var13 == 0 && anInt9351 != 255) {
									var13 = var17;
									var17 = var3[var11];
									var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
								}
								var3[var11] = var17;
							} else if (arg0 == 2) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
									var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
									var3[var11++] = ((var14 | var15) >>> 8) + anInt9323;
								}
							} else {
								throw new IllegalArgumentException();
							}
							var6 += anInt9340;
							var8++;
						}
					}
					var4++;
					anInt9324 += anInt9343;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			} else if (anInt9341 < 0) {
				var4 = anInt9356;
				while (var4 < 0) {
					var5 = anInt9339 * -29235085 * -1504772933;
					var6 = anInt9346 + anInt9348;
					var7 = anInt9324 + anInt9349;
					var8 = anInt9347;
					int var25;
					if ((var25 = var6 - (this.anInt9358 << 12)) >= 0) {
						var9 = (anInt9340 - var25) / anInt9340;
						var8 += var9;
						var6 += anInt9340 * var9;
						var7 += anInt9341 * var9;
						var5 += var9;
					}
					int var27;
					if ((var27 = (var6 - anInt9340) / anInt9340) > var8) {
						var8 = var27;
					}
					int var28;
					if ((var28 = var7 - (this.anInt9325 << 12)) >= 0) {
						var9 = (anInt9341 - var28) / anInt9341;
						var8 += var9;
						var6 += anInt9340 * var9;
						var7 += anInt9341 * var9;
						var5 += var9;
					}
					int var29;
					if ((var29 = (var7 - anInt9341) / anInt9341) > var8) {
						var8 = var29;
					}
					while (var8 < 0) {
						var10 = (var7 >> 12) * this.anInt9358 + (var6 >> 12);
						var11 = var5++;
						if (arg1 == 0) {
							if (arg0 == 1) {
								var3[var11] = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
							} else if (arg0 == 0) {
								var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								var13 = (var12 & 0xFF0000) * anInt9353 & 0xFF000000;
								var14 = (var12 & 0xFF00) * anInt9354 & 0xFF0000;
								var15 = (var12 & 0xFF) * anInt9333 & 0xFF00;
								var3[var11] = (var13 | var14 | var15) >>> 8;
							} else if (arg0 == 3) {
								var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								var13 = anInt9350;
								var14 = var12 + var13;
								var15 = (var12 & 0xFF00FF) + (var13 & 0xFF00FF);
								var16 = (var15 & 0x1000100) + (var14 - var15 & 0x10000);
								var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
							} else if (arg0 == 2) {
								var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								var13 = (var12 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
								var14 = (var12 & 0xFF00) * anInt9351 & 0xFF0000;
								var3[var11] = ((var13 | var14) >>> 8) + anInt9323;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (arg1 != 1) {
							if (arg1 != 2) {
								throw new IllegalArgumentException();
							}
							if (arg0 == 1) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = var3[var11];
									var15 = var13 + var14;
									var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
									var14 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
									var3[var11] = var15 - var14 | var14 - (var14 >>> 8);
								}
							} else if (arg0 == 0) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
									var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
									var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
									var13 = (var14 | var15 | var16) >>> 8;
									var17 = var3[var11];
									var18 = var13 + var17;
									var19 = (var13 & 0xFF00FF) + (var17 & 0xFF00FF);
									var17 = (var19 & 0x1000100) + (var18 - var19 & 0x10000);
									var3[var11] = var18 - var17 | var17 - (var17 >>> 8);
								}
							} else if (arg0 == 3) {
								var37 = this.aByteArray10095[var10];
								var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
								var14 = anInt9350;
								var15 = var13 + var14;
								var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
								var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
								var17 = var15 - var17 | var17 - (var17 >>> 8);
								if (var13 == 0 && anInt9351 != 255) {
									var13 = var17;
									var17 = var3[var11];
									var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
								}
								var3[var11] = var17;
							} else if (arg0 == 2) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
									var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
									var13 = ((var14 | var15) >>> 8) + anInt9323;
									var16 = var3[var11];
									var17 = var13 + var16;
									var18 = (var13 & 0xFF00FF) + (var16 & 0xFF00FF);
									var16 = (var18 & 0x1000100) + (var17 - var18 & 0x10000);
									var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
								}
							}
						} else if (arg0 == 1) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var3[var11] = this.anIntArray10096[var37 & 0xFF];
							}
						} else if (arg0 == 0) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								if ((anInt9350 & 0xFFFFFF) == 16777215) {
									var14 = anInt9350 >>> 24;
									var15 = 256 - var14;
									var16 = var3[var11];
									var3[var11] = ((var13 & 0xFF00FF) * var14 + (var16 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var13 & 0xFF00) * var14 + (var16 & 0xFF00) * var15 & 0xFF0000) >> 8;
								} else if (anInt9351 == 255) {
									var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
									var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
									var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
									var3[var11] = (var14 | var15 | var16) >>> 8;
								} else {
									var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
									var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
									var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
									var13 = (var14 | var15 | var16) >>> 8;
									var17 = var3[var11];
									var3[var11] = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							var37 = this.aByteArray10095[var10];
							var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
							var14 = anInt9350;
							var15 = var13 + var14;
							var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
							var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
							var17 = var15 - var17 | var17 - (var17 >>> 8);
							if (var13 == 0 && anInt9351 != 255) {
								var13 = var17;
								var17 = var3[var11];
								var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
							}
							var3[var11] = var17;
						} else if (arg0 == 2) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
								var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
								var3[var11++] = ((var14 | var15) >>> 8) + anInt9323;
							}
						} else {
							throw new IllegalArgumentException();
						}
						var6 += anInt9340;
						var7 += anInt9341;
						var8++;
					}
					var4++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			} else {
				var4 = anInt9356;
				while (var4 < 0) {
					var5 = anInt9339 * -29235085 * -1504772933;
					var6 = anInt9346 + anInt9348;
					var7 = anInt9324 + anInt9349;
					var8 = anInt9347;
					int var30;
					if ((var30 = var6 - (this.anInt9358 << 12)) >= 0) {
						var9 = (anInt9340 - var30) / anInt9340;
						var8 += var9;
						var6 += anInt9340 * var9;
						var7 += anInt9341 * var9;
						var5 += var9;
					}
					int var31;
					if ((var31 = (var6 - anInt9340) / anInt9340) > var8) {
						var8 = var31;
					}
					if (var7 < 0) {
						var9 = (anInt9341 - 1 - var7) / anInt9341;
						var8 += var9;
						var6 += anInt9340 * var9;
						var7 += anInt9341 * var9;
						var5 += var9;
					}
					int var32;
					if ((var32 = (var7 + 1 - (this.anInt9325 << 12) - anInt9341) / anInt9341) > var8) {
						var8 = var32;
					}
					while (var8 < 0) {
						var10 = (var7 >> 12) * this.anInt9358 + (var6 >> 12);
						var11 = var5++;
						if (arg1 == 0) {
							if (arg0 == 1) {
								var3[var11] = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
							} else if (arg0 == 0) {
								var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								var13 = (var12 & 0xFF0000) * anInt9353 & 0xFF000000;
								var14 = (var12 & 0xFF00) * anInt9354 & 0xFF0000;
								var15 = (var12 & 0xFF) * anInt9333 & 0xFF00;
								var3[var11] = (var13 | var14 | var15) >>> 8;
							} else if (arg0 == 3) {
								var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								var13 = anInt9350;
								var14 = var12 + var13;
								var15 = (var12 & 0xFF00FF) + (var13 & 0xFF00FF);
								var16 = (var15 & 0x1000100) + (var14 - var15 & 0x10000);
								var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
							} else if (arg0 == 2) {
								var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								var13 = (var12 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
								var14 = (var12 & 0xFF00) * anInt9351 & 0xFF0000;
								var3[var11] = ((var13 | var14) >>> 8) + anInt9323;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (arg1 != 1) {
							if (arg1 != 2) {
								throw new IllegalArgumentException();
							}
							if (arg0 == 1) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = var3[var11];
									var15 = var13 + var14;
									var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
									var14 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
									var3[var11] = var15 - var14 | var14 - (var14 >>> 8);
								}
							} else if (arg0 == 0) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
									var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
									var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
									var13 = (var14 | var15 | var16) >>> 8;
									var17 = var3[var11];
									var18 = var13 + var17;
									var19 = (var13 & 0xFF00FF) + (var17 & 0xFF00FF);
									var17 = (var19 & 0x1000100) + (var18 - var19 & 0x10000);
									var3[var11] = var18 - var17 | var17 - (var17 >>> 8);
								}
							} else if (arg0 == 3) {
								var37 = this.aByteArray10095[var10];
								var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
								var14 = anInt9350;
								var15 = var13 + var14;
								var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
								var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
								var17 = var15 - var17 | var17 - (var17 >>> 8);
								if (var13 == 0 && anInt9351 != 255) {
									var13 = var17;
									var17 = var3[var11];
									var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
								}
								var3[var11] = var17;
							} else if (arg0 == 2) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
									var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
									var13 = ((var14 | var15) >>> 8) + anInt9323;
									var16 = var3[var11];
									var17 = var13 + var16;
									var18 = (var13 & 0xFF00FF) + (var16 & 0xFF00FF);
									var16 = (var18 & 0x1000100) + (var17 - var18 & 0x10000);
									var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
								}
							}
						} else if (arg0 == 1) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var3[var11] = this.anIntArray10096[var37 & 0xFF];
							}
						} else if (arg0 == 0) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								if ((anInt9350 & 0xFFFFFF) == 16777215) {
									var14 = anInt9350 >>> 24;
									var15 = 256 - var14;
									var16 = var3[var11];
									var3[var11] = ((var13 & 0xFF00FF) * var14 + (var16 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var13 & 0xFF00) * var14 + (var16 & 0xFF00) * var15 & 0xFF0000) >> 8;
								} else if (anInt9351 == 255) {
									var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
									var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
									var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
									var3[var11] = (var14 | var15 | var16) >>> 8;
								} else {
									var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
									var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
									var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
									var13 = (var14 | var15 | var16) >>> 8;
									var17 = var3[var11];
									var3[var11] = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							var37 = this.aByteArray10095[var10];
							var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
							var14 = anInt9350;
							var15 = var13 + var14;
							var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
							var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
							var17 = var15 - var17 | var17 - (var17 >>> 8);
							if (var13 == 0 && anInt9351 != 255) {
								var13 = var17;
								var17 = var3[var11];
								var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
							}
							var3[var11] = var17;
						} else if (arg0 == 2) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
								var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
								var3[var11++] = ((var14 | var15) >>> 8) + anInt9323;
							}
						} else {
							throw new IllegalArgumentException();
						}
						var6 += anInt9340;
						var7 += anInt9341;
						var8++;
					}
					var4++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			}
		} else if (anInt9341 == 0) {
			var4 = anInt9356;
			while (var4 < 0) {
				var5 = anInt9339 * -29235085 * -1504772933;
				var6 = anInt9346 + anInt9348;
				var7 = anInt9324;
				var8 = anInt9347;
				if (var7 >= 0 && var7 - (this.anInt9325 << 12) < 0) {
					if (var6 < 0) {
						var9 = (anInt9340 - 1 - var6) / anInt9340;
						var8 += var9;
						var6 += anInt9340 * var9;
						var5 += var9;
					}
					int var33;
					if ((var33 = (var6 + 1 - (this.anInt9358 << 12) - anInt9340) / anInt9340) > var8) {
						var8 = var33;
					}
					while (var8 < 0) {
						var10 = (var7 >> 12) * this.anInt9358 + (var6 >> 12);
						var11 = var5++;
						if (arg1 == 0) {
							if (arg0 == 1) {
								var3[var11] = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
							} else if (arg0 == 0) {
								var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								var13 = (var12 & 0xFF0000) * anInt9353 & 0xFF000000;
								var14 = (var12 & 0xFF00) * anInt9354 & 0xFF0000;
								var15 = (var12 & 0xFF) * anInt9333 & 0xFF00;
								var3[var11] = (var13 | var14 | var15) >>> 8;
							} else if (arg0 == 3) {
								var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								var13 = anInt9350;
								var14 = var12 + var13;
								var15 = (var12 & 0xFF00FF) + (var13 & 0xFF00FF);
								var16 = (var15 & 0x1000100) + (var14 - var15 & 0x10000);
								var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
							} else if (arg0 == 2) {
								var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
								var13 = (var12 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
								var14 = (var12 & 0xFF00) * anInt9351 & 0xFF0000;
								var3[var11] = ((var13 | var14) >>> 8) + anInt9323;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (arg1 != 1) {
							if (arg1 != 2) {
								throw new IllegalArgumentException();
							}
							if (arg0 == 1) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = var3[var11];
									var15 = var13 + var14;
									var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
									var14 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
									var3[var11] = var15 - var14 | var14 - (var14 >>> 8);
								}
							} else if (arg0 == 0) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
									var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
									var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
									var13 = (var14 | var15 | var16) >>> 8;
									var17 = var3[var11];
									var18 = var13 + var17;
									var19 = (var13 & 0xFF00FF) + (var17 & 0xFF00FF);
									var17 = (var19 & 0x1000100) + (var18 - var19 & 0x10000);
									var3[var11] = var18 - var17 | var17 - (var17 >>> 8);
								}
							} else if (arg0 == 3) {
								var37 = this.aByteArray10095[var10];
								var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
								var14 = anInt9350;
								var15 = var13 + var14;
								var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
								var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
								var17 = var15 - var17 | var17 - (var17 >>> 8);
								if (var13 == 0 && anInt9351 != 255) {
									var13 = var17;
									var17 = var3[var11];
									var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
								}
								var3[var11] = var17;
							} else if (arg0 == 2) {
								var37 = this.aByteArray10095[var10];
								if (var37 != 0) {
									var13 = this.anIntArray10096[var37 & 0xFF];
									var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
									var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
									var13 = ((var14 | var15) >>> 8) + anInt9323;
									var16 = var3[var11];
									var17 = var13 + var16;
									var18 = (var13 & 0xFF00FF) + (var16 & 0xFF00FF);
									var16 = (var18 & 0x1000100) + (var17 - var18 & 0x10000);
									var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
								}
							}
						} else if (arg0 == 1) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var3[var11] = this.anIntArray10096[var37 & 0xFF];
							}
						} else if (arg0 == 0) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								if ((anInt9350 & 0xFFFFFF) == 16777215) {
									var14 = anInt9350 >>> 24;
									var15 = 256 - var14;
									var16 = var3[var11];
									var3[var11] = ((var13 & 0xFF00FF) * var14 + (var16 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var13 & 0xFF00) * var14 + (var16 & 0xFF00) * var15 & 0xFF0000) >> 8;
								} else if (anInt9351 == 255) {
									var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
									var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
									var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
									var3[var11] = (var14 | var15 | var16) >>> 8;
								} else {
									var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
									var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
									var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
									var13 = (var14 | var15 | var16) >>> 8;
									var17 = var3[var11];
									var3[var11] = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							var37 = this.aByteArray10095[var10];
							var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
							var14 = anInt9350;
							var15 = var13 + var14;
							var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
							var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
							var17 = var15 - var17 | var17 - (var17 >>> 8);
							if (var13 == 0 && anInt9351 != 255) {
								var13 = var17;
								var17 = var3[var11];
								var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
							}
							var3[var11] = var17;
						} else if (arg0 == 2) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
								var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
								var3[var11++] = ((var14 | var15) >>> 8) + anInt9323;
							}
						} else {
							throw new IllegalArgumentException();
						}
						var6 += anInt9340;
						var8++;
					}
				}
				var4++;
				anInt9346 += anInt9342;
				anInt9324 += anInt9343;
				anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
			}
		} else if (anInt9341 < 0) {
			for (var4 = anInt9356; var4 < 0; var4++) {
				var5 = anInt9339 * -29235085 * -1504772933;
				var6 = anInt9346 + anInt9348;
				var7 = anInt9324 + anInt9349;
				var8 = anInt9347;
				if (var6 < 0) {
					var9 = (anInt9340 - 1 - var6) / anInt9340;
					var8 += var9;
					var6 += anInt9340 * var9;
					var7 += anInt9341 * var9;
					var5 += var9;
				}
				int var34;
				if ((var34 = (var6 + 1 - (this.anInt9358 << 12) - anInt9340) / anInt9340) > var8) {
					var8 = var34;
				}
				int var35;
				if ((var35 = var7 - (this.anInt9325 << 12)) >= 0) {
					var9 = (anInt9341 - var35) / anInt9341;
					var8 += var9;
					var6 += anInt9340 * var9;
					var7 += anInt9341 * var9;
					var5 += var9;
				}
				int var36;
				if ((var36 = (var7 - anInt9341) / anInt9341) > var8) {
					var8 = var36;
				}
				while (var8 < 0) {
					var10 = (var7 >> 12) * this.anInt9358 + (var6 >> 12);
					var11 = var5++;
					if (arg1 == 0) {
						if (arg0 == 1) {
							var3[var11] = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
						} else if (arg0 == 0) {
							var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
							var13 = (var12 & 0xFF0000) * anInt9353 & 0xFF000000;
							var14 = (var12 & 0xFF00) * anInt9354 & 0xFF0000;
							var15 = (var12 & 0xFF) * anInt9333 & 0xFF00;
							var3[var11] = (var13 | var14 | var15) >>> 8;
						} else if (arg0 == 3) {
							var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
							var13 = anInt9350;
							var14 = var12 + var13;
							var15 = (var12 & 0xFF00FF) + (var13 & 0xFF00FF);
							var16 = (var15 & 0x1000100) + (var14 - var15 & 0x10000);
							var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
						} else if (arg0 == 2) {
							var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
							var13 = (var12 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
							var14 = (var12 & 0xFF00) * anInt9351 & 0xFF0000;
							var3[var11] = ((var13 | var14) >>> 8) + anInt9323;
						} else {
							throw new IllegalArgumentException();
						}
					} else if (arg1 != 1) {
						if (arg1 != 2) {
							throw new IllegalArgumentException();
						}
						if (arg0 == 1) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								var14 = var3[var11];
								var15 = var13 + var14;
								var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
								var14 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
								var3[var11] = var15 - var14 | var14 - (var14 >>> 8);
							}
						} else if (arg0 == 0) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
								var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
								var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
								var13 = (var14 | var15 | var16) >>> 8;
								var17 = var3[var11];
								var18 = var13 + var17;
								var19 = (var13 & 0xFF00FF) + (var17 & 0xFF00FF);
								var17 = (var19 & 0x1000100) + (var18 - var19 & 0x10000);
								var3[var11] = var18 - var17 | var17 - (var17 >>> 8);
							}
						} else if (arg0 == 3) {
							var37 = this.aByteArray10095[var10];
							var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
							var14 = anInt9350;
							var15 = var13 + var14;
							var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
							var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
							var17 = var15 - var17 | var17 - (var17 >>> 8);
							if (var13 == 0 && anInt9351 != 255) {
								var13 = var17;
								var17 = var3[var11];
								var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
							}
							var3[var11] = var17;
						} else if (arg0 == 2) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
								var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
								var13 = ((var14 | var15) >>> 8) + anInt9323;
								var16 = var3[var11];
								var17 = var13 + var16;
								var18 = (var13 & 0xFF00FF) + (var16 & 0xFF00FF);
								var16 = (var18 & 0x1000100) + (var17 - var18 & 0x10000);
								var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
							}
						}
					} else if (arg0 == 1) {
						var37 = this.aByteArray10095[var10];
						if (var37 != 0) {
							var3[var11] = this.anIntArray10096[var37 & 0xFF];
						}
					} else if (arg0 == 0) {
						var37 = this.aByteArray10095[var10];
						if (var37 != 0) {
							var13 = this.anIntArray10096[var37 & 0xFF];
							if ((anInt9350 & 0xFFFFFF) == 16777215) {
								var14 = anInt9350 >>> 24;
								var15 = 256 - var14;
								var16 = var3[var11];
								var3[var11] = ((var13 & 0xFF00FF) * var14 + (var16 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var13 & 0xFF00) * var14 + (var16 & 0xFF00) * var15 & 0xFF0000) >> 8;
							} else if (anInt9351 == 255) {
								var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
								var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
								var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
								var3[var11] = (var14 | var15 | var16) >>> 8;
							} else {
								var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
								var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
								var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
								var13 = (var14 | var15 | var16) >>> 8;
								var17 = var3[var11];
								var3[var11] = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
							}
						}
					} else if (arg0 == 3) {
						var37 = this.aByteArray10095[var10];
						var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
						var14 = anInt9350;
						var15 = var13 + var14;
						var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
						var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
						var17 = var15 - var17 | var17 - (var17 >>> 8);
						if (var13 == 0 && anInt9351 != 255) {
							var13 = var17;
							var17 = var3[var11];
							var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
						}
						var3[var11] = var17;
					} else if (arg0 == 2) {
						var37 = this.aByteArray10095[var10];
						if (var37 != 0) {
							var13 = this.anIntArray10096[var37 & 0xFF];
							var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
							var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
							var3[var11++] = ((var14 | var15) >>> 8) + anInt9323;
						}
					} else {
						throw new IllegalArgumentException();
					}
					var6 += anInt9340;
					var7 += anInt9341;
					var8++;
				}
				anInt9346 += anInt9342;
				anInt9324 += anInt9343;
				anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
			}
		} else {
			for (var4 = anInt9356; var4 < 0; var4++) {
				var5 = anInt9339 * -29235085 * -1504772933;
				var6 = anInt9346 + anInt9348;
				var7 = anInt9324 + anInt9349;
				var8 = anInt9347;
				if (var6 < 0) {
					var9 = (anInt9340 - 1 - var6) / anInt9340;
					var8 += var9;
					var6 += anInt9340 * var9;
					var7 += anInt9341 * var9;
					var5 += var9;
				}
				int var38;
				if ((var38 = (var6 + 1 - (this.anInt9358 << 12) - anInt9340) / anInt9340) > var8) {
					var8 = var38;
				}
				if (var7 < 0) {
					var9 = (anInt9341 - 1 - var7) / anInt9341;
					var8 += var9;
					var6 += anInt9340 * var9;
					var7 += anInt9341 * var9;
					var5 += var9;
				}
				int var39;
				if ((var39 = (var7 + 1 - (this.anInt9325 << 12) - anInt9341) / anInt9341) > var8) {
					var8 = var39;
				}
				while (var8 < 0) {
					var10 = (var7 >> 12) * this.anInt9358 + (var6 >> 12);
					var11 = var5++;
					if (arg1 == 0) {
						if (arg0 == 1) {
							var3[var11] = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
						} else if (arg0 == 0) {
							var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
							var13 = (var12 & 0xFF0000) * anInt9353 & 0xFF000000;
							var14 = (var12 & 0xFF00) * anInt9354 & 0xFF0000;
							var15 = (var12 & 0xFF) * anInt9333 & 0xFF00;
							var3[var11] = (var13 | var14 | var15) >>> 8;
						} else if (arg0 == 3) {
							var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
							var13 = anInt9350;
							var14 = var12 + var13;
							var15 = (var12 & 0xFF00FF) + (var13 & 0xFF00FF);
							var16 = (var15 & 0x1000100) + (var14 - var15 & 0x10000);
							var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
						} else if (arg0 == 2) {
							var12 = this.anIntArray10096[this.aByteArray10095[var10] & 0xFF];
							var13 = (var12 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
							var14 = (var12 & 0xFF00) * anInt9351 & 0xFF0000;
							var3[var11] = ((var13 | var14) >>> 8) + anInt9323;
						} else {
							throw new IllegalArgumentException();
						}
					} else if (arg1 != 1) {
						if (arg1 != 2) {
							throw new IllegalArgumentException();
						}
						if (arg0 == 1) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								var14 = var3[var11];
								var15 = var13 + var14;
								var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
								var14 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
								var3[var11] = var15 - var14 | var14 - (var14 >>> 8);
							}
						} else if (arg0 == 0) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
								var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
								var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
								var13 = (var14 | var15 | var16) >>> 8;
								var17 = var3[var11];
								var18 = var13 + var17;
								var19 = (var13 & 0xFF00FF) + (var17 & 0xFF00FF);
								var17 = (var19 & 0x1000100) + (var18 - var19 & 0x10000);
								var3[var11] = var18 - var17 | var17 - (var17 >>> 8);
							}
						} else if (arg0 == 3) {
							var37 = this.aByteArray10095[var10];
							var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
							var14 = anInt9350;
							var15 = var13 + var14;
							var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
							var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
							var17 = var15 - var17 | var17 - (var17 >>> 8);
							if (var13 == 0 && anInt9351 != 255) {
								var13 = var17;
								var17 = var3[var11];
								var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
							}
							var3[var11] = var17;
						} else if (arg0 == 2) {
							var37 = this.aByteArray10095[var10];
							if (var37 != 0) {
								var13 = this.anIntArray10096[var37 & 0xFF];
								var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
								var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
								var13 = ((var14 | var15) >>> 8) + anInt9323;
								var16 = var3[var11];
								var17 = var13 + var16;
								var18 = (var13 & 0xFF00FF) + (var16 & 0xFF00FF);
								var16 = (var18 & 0x1000100) + (var17 - var18 & 0x10000);
								var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
							}
						}
					} else if (arg0 == 1) {
						var37 = this.aByteArray10095[var10];
						if (var37 != 0) {
							var3[var11] = this.anIntArray10096[var37 & 0xFF];
						}
					} else if (arg0 == 0) {
						var37 = this.aByteArray10095[var10];
						if (var37 != 0) {
							var13 = this.anIntArray10096[var37 & 0xFF];
							if ((anInt9350 & 0xFFFFFF) == 16777215) {
								var14 = anInt9350 >>> 24;
								var15 = 256 - var14;
								var16 = var3[var11];
								var3[var11] = ((var13 & 0xFF00FF) * var14 + (var16 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var13 & 0xFF00) * var14 + (var16 & 0xFF00) * var15 & 0xFF0000) >> 8;
							} else if (anInt9351 == 255) {
								var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
								var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
								var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
								var3[var11] = (var14 | var15 | var16) >>> 8;
							} else {
								var14 = (var13 & 0xFF0000) * anInt9353 & 0xFF000000;
								var15 = (var13 & 0xFF00) * anInt9354 & 0xFF0000;
								var16 = (var13 & 0xFF) * anInt9333 & 0xFF00;
								var13 = (var14 | var15 | var16) >>> 8;
								var17 = var3[var11];
								var3[var11] = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
							}
						}
					} else if (arg0 == 3) {
						var37 = this.aByteArray10095[var10];
						var13 = var37 > 0 ? this.anIntArray10096[var37] : 0;
						var14 = anInt9350;
						var15 = var13 + var14;
						var16 = (var13 & 0xFF00FF) + (var14 & 0xFF00FF);
						var17 = (var16 & 0x1000100) + (var15 - var16 & 0x10000);
						var17 = var15 - var17 | var17 - (var17 >>> 8);
						if (var13 == 0 && anInt9351 != 255) {
							var13 = var17;
							var17 = var3[var11];
							var17 = ((var13 & 0xFF00FF) * anInt9351 + (var17 & 0xFF00FF) * anInt9335 & 0xFF00FF00) + ((var13 & 0xFF00) * anInt9351 + (var17 & 0xFF00) * anInt9335 & 0xFF0000) >> 8;
						}
						var3[var11] = var17;
					} else if (arg0 == 2) {
						var37 = this.aByteArray10095[var10];
						if (var37 != 0) {
							var13 = this.anIntArray10096[var37 & 0xFF];
							var14 = (var13 & 0xFF00FF) * anInt9351 & 0xFF00FF00;
							var15 = (var13 & 0xFF00) * anInt9351 & 0xFF0000;
							var3[var11++] = ((var14 | var15) >>> 8) + anInt9323;
						}
					} else {
						throw new IllegalArgumentException();
					}
					var6 += anInt9340;
					var7 += anInt9341;
					var8++;
				}
				anInt9346 += anInt9342;
				anInt9324 += anInt9343;
				anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
			}
		}
	}

	public void method746(int[] arg0, int[] arg1, int arg2, int arg3) {
		int[] var5 = this.aClass_ra_Sub3_9355.anIntArray8630;
		if (var5 == null) {
			return;
		}
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		byte var16;
		int var23;
		if (anInt9340 == 0) {
			if (anInt9341 == 0) {
				var6 = anInt9356;
				while (var6 < 0) {
					var7 = var6 + arg3;
					if (var7 >= 0) {
						if (var7 >= arg0.length) {
							break;
						}
						var8 = anInt9339 * -29235085 * -1504772933;
						var9 = anInt9346;
						var10 = anInt9324;
						var11 = anInt9347;
						if (var9 >= 0 && var10 >= 0 && var9 - (this.anInt9358 << 12) < 0 && var10 - (this.anInt9325 << 12) < 0) {
							var12 = arg0[var7] - arg2;
							var13 = -arg1[var7];
							var14 = var12 - (var8 - anInt9339 * -29235085 * -1504772933);
							if (var14 > 0) {
								var8 += var14;
								var11 += var14;
								var9 += anInt9340 * var14;
								var10 += anInt9341 * var14;
							} else {
								var13 -= var14;
							}
							if (var11 < var13) {
								var11 = var13;
							}
							while (var11 < 0) {
								byte var15 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
								if (var15 == 0) {
									var8++;
								} else {
									var5[var8++] = this.anIntArray10096[var15 & 0xFF];
								}
								var11++;
							}
						}
					}
					var6++;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			} else if (anInt9341 < 0) {
				var6 = anInt9356;
				while (var6 < 0) {
					var7 = var6 + arg3;
					if (var7 >= 0) {
						if (var7 >= arg0.length) {
							break;
						}
						var8 = anInt9339 * -29235085 * -1504772933;
						var9 = anInt9346;
						var10 = anInt9324 + anInt9349;
						var11 = anInt9347;
						if (var9 >= 0 && var9 - (this.anInt9358 << 12) < 0) {
							int var17;
							if ((var17 = var10 - (this.anInt9325 << 12)) >= 0) {
								var12 = (anInt9341 - var17) / anInt9341;
								var11 += var12;
								var10 += anInt9341 * var12;
								var8 += var12;
							}
							int var18;
							if ((var18 = (var10 - anInt9341) / anInt9341) > var11) {
								var11 = var18;
							}
							var13 = arg0[var7] - arg2;
							var14 = -arg1[var7];
							var23 = var13 - (var8 - anInt9339 * -29235085 * -1504772933);
							if (var23 > 0) {
								var8 += var23;
								var11 += var23;
								var9 += anInt9340 * var23;
								var10 += anInt9341 * var23;
							} else {
								var14 -= var23;
							}
							if (var11 < var14) {
								var11 = var14;
							}
							while (var11 < 0) {
								var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
								if (var16 == 0) {
									var8++;
								} else {
									var5[var8++] = this.anIntArray10096[var16 & 0xFF];
								}
								var10 += anInt9341;
								var11++;
							}
						}
					}
					var6++;
					anInt9346 += anInt9342;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			} else {
				var6 = anInt9356;
				while (var6 < 0) {
					var7 = var6 + arg3;
					if (var7 >= 0) {
						if (var7 >= arg0.length) {
							break;
						}
						var8 = anInt9339 * -29235085 * -1504772933;
						var9 = anInt9346;
						var10 = anInt9324 + anInt9349;
						var11 = anInt9347;
						if (var9 >= 0 && var9 - (this.anInt9358 << 12) < 0) {
							if (var10 < 0) {
								var12 = (anInt9341 - 1 - var10) / anInt9341;
								var11 += var12;
								var10 += anInt9341 * var12;
								var8 += var12;
							}
							int var19;
							if ((var19 = (var10 + 1 - (this.anInt9325 << 12) - anInt9341) / anInt9341) > var11) {
								var11 = var19;
							}
							var13 = arg0[var7] - arg2;
							var14 = -arg1[var7];
							var23 = var13 - (var8 - anInt9339 * -29235085 * -1504772933);
							if (var23 > 0) {
								var8 += var23;
								var11 += var23;
								var9 += anInt9340 * var23;
								var10 += anInt9341 * var23;
							} else {
								var14 -= var23;
							}
							if (var11 < var14) {
								var11 = var14;
							}
							while (var11 < 0) {
								var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
								if (var16 == 0) {
									var8++;
								} else {
									var5[var8++] = this.anIntArray10096[var16 & 0xFF];
								}
								var10 += anInt9341;
								var11++;
							}
						}
					}
					var6++;
					anInt9346 += anInt9342;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			}
		} else if (anInt9340 < 0) {
			if (anInt9341 == 0) {
				var6 = anInt9356;
				while (var6 < 0) {
					var7 = var6 + arg3;
					if (var7 >= 0) {
						if (var7 >= arg0.length) {
							break;
						}
						var8 = anInt9339 * -29235085 * -1504772933;
						var9 = anInt9346 + anInt9348;
						var10 = anInt9324;
						var11 = anInt9347;
						if (var10 >= 0 && var10 - (this.anInt9325 << 12) < 0) {
							int var20;
							if ((var20 = var9 - (this.anInt9358 << 12)) >= 0) {
								var12 = (anInt9340 - var20) / anInt9340;
								var11 += var12;
								var9 += anInt9340 * var12;
								var8 += var12;
							}
							int var21;
							if ((var21 = (var9 - anInt9340) / anInt9340) > var11) {
								var11 = var21;
							}
							var13 = arg0[var7] - arg2;
							var14 = -arg1[var7];
							var23 = var13 - (var8 - anInt9339 * -29235085 * -1504772933);
							if (var23 > 0) {
								var8 += var23;
								var11 += var23;
								var9 += anInt9340 * var23;
								var10 += anInt9341 * var23;
							} else {
								var14 -= var23;
							}
							if (var11 < var14) {
								var11 = var14;
							}
							while (var11 < 0) {
								var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
								if (var16 == 0) {
									var8++;
								} else {
									var5[var8++] = this.anIntArray10096[var16 & 0xFF];
								}
								var9 += anInt9340;
								var11++;
							}
						}
					}
					var6++;
					anInt9324 += anInt9343;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			} else if (anInt9341 < 0) {
				var6 = anInt9356;
				while (var6 < 0) {
					var7 = var6 + arg3;
					if (var7 >= 0) {
						if (var7 >= arg0.length) {
							break;
						}
						var8 = anInt9339 * -29235085 * -1504772933;
						var9 = anInt9346 + anInt9348;
						var10 = anInt9324 + anInt9349;
						var11 = anInt9347;
						int var22;
						if ((var22 = var9 - (this.anInt9358 << 12)) >= 0) {
							var12 = (anInt9340 - var22) / anInt9340;
							var11 += var12;
							var9 += anInt9340 * var12;
							var10 += anInt9341 * var12;
							var8 += var12;
						}
						int var24;
						if ((var24 = (var9 - anInt9340) / anInt9340) > var11) {
							var11 = var24;
						}
						int var25;
						if ((var25 = var10 - (this.anInt9325 << 12)) >= 0) {
							var12 = (anInt9341 - var25) / anInt9341;
							var11 += var12;
							var9 += anInt9340 * var12;
							var10 += anInt9341 * var12;
							var8 += var12;
						}
						int var26;
						if ((var26 = (var10 - anInt9341) / anInt9341) > var11) {
							var11 = var26;
						}
						var13 = arg0[var7] - arg2;
						var14 = -arg1[var7];
						var23 = var13 - (var8 - anInt9339 * -29235085 * -1504772933);
						if (var23 > 0) {
							var8 += var23;
							var11 += var23;
							var9 += anInt9340 * var23;
							var10 += anInt9341 * var23;
						} else {
							var14 -= var23;
						}
						if (var11 < var14) {
							var11 = var14;
						}
						while (var11 < 0) {
							var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
							if (var16 == 0) {
								var8++;
							} else {
								var5[var8++] = this.anIntArray10096[var16 & 0xFF];
							}
							var9 += anInt9340;
							var10 += anInt9341;
							var11++;
						}
					}
					var6++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			} else {
				var6 = anInt9356;
				while (var6 < 0) {
					var7 = var6 + arg3;
					if (var7 >= 0) {
						if (var7 >= arg0.length) {
							break;
						}
						var8 = anInt9339 * -29235085 * -1504772933;
						var9 = anInt9346 + anInt9348;
						var10 = anInt9324 + anInt9349;
						var11 = anInt9347;
						int var27;
						if ((var27 = var9 - (this.anInt9358 << 12)) >= 0) {
							var12 = (anInt9340 - var27) / anInt9340;
							var11 += var12;
							var9 += anInt9340 * var12;
							var10 += anInt9341 * var12;
							var8 += var12;
						}
						int var28;
						if ((var28 = (var9 - anInt9340) / anInt9340) > var11) {
							var11 = var28;
						}
						if (var10 < 0) {
							var12 = (anInt9341 - 1 - var10) / anInt9341;
							var11 += var12;
							var9 += anInt9340 * var12;
							var10 += anInt9341 * var12;
							var8 += var12;
						}
						int var29;
						if ((var29 = (var10 + 1 - (this.anInt9325 << 12) - anInt9341) / anInt9341) > var11) {
							var11 = var29;
						}
						var13 = arg0[var7] - arg2;
						var14 = -arg1[var7];
						var23 = var13 - (var8 - anInt9339 * -29235085 * -1504772933);
						if (var23 > 0) {
							var8 += var23;
							var11 += var23;
							var9 += anInt9340 * var23;
							var10 += anInt9341 * var23;
						} else {
							var14 -= var23;
						}
						if (var11 < var14) {
							var11 = var14;
						}
						while (var11 < 0) {
							var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
							if (var16 == 0) {
								var8++;
							} else {
								var5[var8++] = this.anIntArray10096[var16 & 0xFF];
							}
							var9 += anInt9340;
							var10 += anInt9341;
							var11++;
						}
					}
					var6++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			}
		} else if (anInt9341 == 0) {
			var6 = anInt9356;
			while (var6 < 0) {
				var7 = var6 + arg3;
				if (var7 >= 0) {
					if (var7 >= arg0.length) {
						break;
					}
					var8 = anInt9339 * -29235085 * -1504772933;
					var9 = anInt9346 + anInt9348;
					var10 = anInt9324;
					var11 = anInt9347;
					if (var10 >= 0 && var10 - (this.anInt9325 << 12) < 0) {
						if (var9 < 0) {
							var12 = (anInt9340 - 1 - var9) / anInt9340;
							var11 += var12;
							var9 += anInt9340 * var12;
							var8 += var12;
						}
						int var30;
						if ((var30 = (var9 + 1 - (this.anInt9358 << 12) - anInt9340) / anInt9340) > var11) {
							var11 = var30;
						}
						var13 = arg0[var7] - arg2;
						var14 = -arg1[var7];
						var23 = var13 - (var8 - anInt9339 * -29235085 * -1504772933);
						if (var23 > 0) {
							var8 += var23;
							var11 += var23;
							var9 += anInt9340 * var23;
							var10 += anInt9341 * var23;
						} else {
							var14 -= var23;
						}
						if (var11 < var14) {
							var11 = var14;
						}
						while (var11 < 0) {
							var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
							if (var16 == 0) {
								var8++;
							} else {
								var5[var8++] = this.anIntArray10096[var16 & 0xFF];
							}
							var9 += anInt9340;
							var11++;
						}
					}
				}
				var6++;
				anInt9346 += anInt9342;
				anInt9324 += anInt9343;
				anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
			}
		} else if (anInt9341 < 0) {
			var6 = anInt9356;
			while (var6 < 0) {
				var7 = var6 + arg3;
				if (var7 >= 0) {
					if (var7 >= arg0.length) {
						break;
					}
					var8 = anInt9339 * -29235085 * -1504772933;
					var9 = anInt9346 + anInt9348;
					var10 = anInt9324 + anInt9349;
					var11 = anInt9347;
					if (var9 < 0) {
						var12 = (anInt9340 - 1 - var9) / anInt9340;
						var11 += var12;
						var9 += anInt9340 * var12;
						var10 += anInt9341 * var12;
						var8 += var12;
					}
					int var31;
					if ((var31 = (var9 + 1 - (this.anInt9358 << 12) - anInt9340) / anInt9340) > var11) {
						var11 = var31;
					}
					int var32;
					if ((var32 = var10 - (this.anInt9325 << 12)) >= 0) {
						var12 = (anInt9341 - var32) / anInt9341;
						var11 += var12;
						var9 += anInt9340 * var12;
						var10 += anInt9341 * var12;
						var8 += var12;
					}
					int var33;
					if ((var33 = (var10 - anInt9341) / anInt9341) > var11) {
						var11 = var33;
					}
					var13 = arg0[var7] - arg2;
					var14 = -arg1[var7];
					var23 = var13 - (var8 - anInt9339 * -29235085 * -1504772933);
					if (var23 > 0) {
						var8 += var23;
						var11 += var23;
						var9 += anInt9340 * var23;
						var10 += anInt9341 * var23;
					} else {
						var14 -= var23;
					}
					if (var11 < var14) {
						var11 = var14;
					}
					while (var11 < 0) {
						var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
						if (var16 == 0) {
							var8++;
						} else {
							var5[var8++] = this.anIntArray10096[var16 & 0xFF];
						}
						var9 += anInt9340;
						var10 += anInt9341;
						var11++;
					}
				}
				var6++;
				anInt9346 += anInt9342;
				anInt9324 += anInt9343;
				anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
			}
		} else {
			var6 = anInt9356;
			while (var6 < 0) {
				var7 = var6 + arg3;
				if (var7 >= 0) {
					if (var7 >= arg0.length) {
						break;
					}
					var8 = anInt9339 * -29235085 * -1504772933;
					var9 = anInt9346 + anInt9348;
					var10 = anInt9324 + anInt9349;
					var11 = anInt9347;
					if (var9 < 0) {
						var12 = (anInt9340 - 1 - var9) / anInt9340;
						var11 += var12;
						var9 += anInt9340 * var12;
						var10 += anInt9341 * var12;
						var8 += var12;
					}
					int var34;
					if ((var34 = (var9 + 1 - (this.anInt9358 << 12) - anInt9340) / anInt9340) > var11) {
						var11 = var34;
					}
					if (var10 < 0) {
						var12 = (anInt9341 - 1 - var10) / anInt9341;
						var11 += var12;
						var9 += anInt9340 * var12;
						var10 += anInt9341 * var12;
						var8 += var12;
					}
					int var35;
					if ((var35 = (var10 + 1 - (this.anInt9325 << 12) - anInt9341) / anInt9341) > var11) {
						var11 = var35;
					}
					var13 = arg0[var7] - arg2;
					var14 = -arg1[var7];
					var23 = var13 - (var8 - anInt9339 * -29235085 * -1504772933);
					if (var23 > 0) {
						var8 += var23;
						var11 += var23;
						var9 += anInt9340 * var23;
						var10 += anInt9341 * var23;
					} else {
						var14 -= var23;
					}
					if (var11 < var14) {
						var11 = var14;
					}
					while (var11 < 0) {
						var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
						if (var16 == 0) {
							var8++;
						} else {
							var5[var8++] = this.anIntArray10096[var16 & 0xFF];
						}
						var9 += anInt9340;
						var10 += anInt9341;
						var11++;
					}
				}
				var6++;
				anInt9346 += anInt9342;
				anInt9324 += anInt9343;
				anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
			}
		}
	}

	public void method751(int[] arg0, int[] arg1, int arg2, int arg3) {
		int[] var5 = this.aClass_ra_Sub3_9355.anIntArray8630;
		if (var5 == null) {
			return;
		}
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		byte var16;
		int var23;
		if (anInt9340 == 0) {
			if (anInt9341 == 0) {
				var6 = anInt9356;
				while (var6 < 0) {
					var7 = var6 + arg3;
					if (var7 >= 0) {
						if (var7 >= arg0.length) {
							break;
						}
						var8 = anInt9339 * -29235085 * -1504772933;
						var9 = anInt9346;
						var10 = anInt9324;
						var11 = anInt9347;
						if (var9 >= 0 && var10 >= 0 && var9 - (this.anInt9358 << 12) < 0 && var10 - (this.anInt9325 << 12) < 0) {
							var12 = arg0[var7] - arg2;
							var13 = -arg1[var7];
							var14 = var12 - (var8 - anInt9339 * -29235085 * -1504772933);
							if (var14 > 0) {
								var8 += var14;
								var11 += var14;
								var9 += anInt9340 * var14;
								var10 += anInt9341 * var14;
							} else {
								var13 -= var14;
							}
							if (var11 < var13) {
								var11 = var13;
							}
							while (var11 < 0) {
								byte var15 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
								if (var15 == 0) {
									var8++;
								} else {
									var5[var8++] = this.anIntArray10096[var15 & 0xFF];
								}
								var11++;
							}
						}
					}
					var6++;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			} else if (anInt9341 < 0) {
				var6 = anInt9356;
				while (var6 < 0) {
					var7 = var6 + arg3;
					if (var7 >= 0) {
						if (var7 >= arg0.length) {
							break;
						}
						var8 = anInt9339 * -29235085 * -1504772933;
						var9 = anInt9346;
						var10 = anInt9324 + anInt9349;
						var11 = anInt9347;
						if (var9 >= 0 && var9 - (this.anInt9358 << 12) < 0) {
							int var17;
							if ((var17 = var10 - (this.anInt9325 << 12)) >= 0) {
								var12 = (anInt9341 - var17) / anInt9341;
								var11 += var12;
								var10 += anInt9341 * var12;
								var8 += var12;
							}
							int var18;
							if ((var18 = (var10 - anInt9341) / anInt9341) > var11) {
								var11 = var18;
							}
							var13 = arg0[var7] - arg2;
							var14 = -arg1[var7];
							var23 = var13 - (var8 - anInt9339 * -29235085 * -1504772933);
							if (var23 > 0) {
								var8 += var23;
								var11 += var23;
								var9 += anInt9340 * var23;
								var10 += anInt9341 * var23;
							} else {
								var14 -= var23;
							}
							if (var11 < var14) {
								var11 = var14;
							}
							while (var11 < 0) {
								var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
								if (var16 == 0) {
									var8++;
								} else {
									var5[var8++] = this.anIntArray10096[var16 & 0xFF];
								}
								var10 += anInt9341;
								var11++;
							}
						}
					}
					var6++;
					anInt9346 += anInt9342;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			} else {
				var6 = anInt9356;
				while (var6 < 0) {
					var7 = var6 + arg3;
					if (var7 >= 0) {
						if (var7 >= arg0.length) {
							break;
						}
						var8 = anInt9339 * -29235085 * -1504772933;
						var9 = anInt9346;
						var10 = anInt9324 + anInt9349;
						var11 = anInt9347;
						if (var9 >= 0 && var9 - (this.anInt9358 << 12) < 0) {
							if (var10 < 0) {
								var12 = (anInt9341 - 1 - var10) / anInt9341;
								var11 += var12;
								var10 += anInt9341 * var12;
								var8 += var12;
							}
							int var19;
							if ((var19 = (var10 + 1 - (this.anInt9325 << 12) - anInt9341) / anInt9341) > var11) {
								var11 = var19;
							}
							var13 = arg0[var7] - arg2;
							var14 = -arg1[var7];
							var23 = var13 - (var8 - anInt9339 * -29235085 * -1504772933);
							if (var23 > 0) {
								var8 += var23;
								var11 += var23;
								var9 += anInt9340 * var23;
								var10 += anInt9341 * var23;
							} else {
								var14 -= var23;
							}
							if (var11 < var14) {
								var11 = var14;
							}
							while (var11 < 0) {
								var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
								if (var16 == 0) {
									var8++;
								} else {
									var5[var8++] = this.anIntArray10096[var16 & 0xFF];
								}
								var10 += anInt9341;
								var11++;
							}
						}
					}
					var6++;
					anInt9346 += anInt9342;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			}
		} else if (anInt9340 < 0) {
			if (anInt9341 == 0) {
				var6 = anInt9356;
				while (var6 < 0) {
					var7 = var6 + arg3;
					if (var7 >= 0) {
						if (var7 >= arg0.length) {
							break;
						}
						var8 = anInt9339 * -29235085 * -1504772933;
						var9 = anInt9346 + anInt9348;
						var10 = anInt9324;
						var11 = anInt9347;
						if (var10 >= 0 && var10 - (this.anInt9325 << 12) < 0) {
							int var20;
							if ((var20 = var9 - (this.anInt9358 << 12)) >= 0) {
								var12 = (anInt9340 - var20) / anInt9340;
								var11 += var12;
								var9 += anInt9340 * var12;
								var8 += var12;
							}
							int var21;
							if ((var21 = (var9 - anInt9340) / anInt9340) > var11) {
								var11 = var21;
							}
							var13 = arg0[var7] - arg2;
							var14 = -arg1[var7];
							var23 = var13 - (var8 - anInt9339 * -29235085 * -1504772933);
							if (var23 > 0) {
								var8 += var23;
								var11 += var23;
								var9 += anInt9340 * var23;
								var10 += anInt9341 * var23;
							} else {
								var14 -= var23;
							}
							if (var11 < var14) {
								var11 = var14;
							}
							while (var11 < 0) {
								var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
								if (var16 == 0) {
									var8++;
								} else {
									var5[var8++] = this.anIntArray10096[var16 & 0xFF];
								}
								var9 += anInt9340;
								var11++;
							}
						}
					}
					var6++;
					anInt9324 += anInt9343;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			} else if (anInt9341 < 0) {
				var6 = anInt9356;
				while (var6 < 0) {
					var7 = var6 + arg3;
					if (var7 >= 0) {
						if (var7 >= arg0.length) {
							break;
						}
						var8 = anInt9339 * -29235085 * -1504772933;
						var9 = anInt9346 + anInt9348;
						var10 = anInt9324 + anInt9349;
						var11 = anInt9347;
						int var22;
						if ((var22 = var9 - (this.anInt9358 << 12)) >= 0) {
							var12 = (anInt9340 - var22) / anInt9340;
							var11 += var12;
							var9 += anInt9340 * var12;
							var10 += anInt9341 * var12;
							var8 += var12;
						}
						int var24;
						if ((var24 = (var9 - anInt9340) / anInt9340) > var11) {
							var11 = var24;
						}
						int var25;
						if ((var25 = var10 - (this.anInt9325 << 12)) >= 0) {
							var12 = (anInt9341 - var25) / anInt9341;
							var11 += var12;
							var9 += anInt9340 * var12;
							var10 += anInt9341 * var12;
							var8 += var12;
						}
						int var26;
						if ((var26 = (var10 - anInt9341) / anInt9341) > var11) {
							var11 = var26;
						}
						var13 = arg0[var7] - arg2;
						var14 = -arg1[var7];
						var23 = var13 - (var8 - anInt9339 * -29235085 * -1504772933);
						if (var23 > 0) {
							var8 += var23;
							var11 += var23;
							var9 += anInt9340 * var23;
							var10 += anInt9341 * var23;
						} else {
							var14 -= var23;
						}
						if (var11 < var14) {
							var11 = var14;
						}
						while (var11 < 0) {
							var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
							if (var16 == 0) {
								var8++;
							} else {
								var5[var8++] = this.anIntArray10096[var16 & 0xFF];
							}
							var9 += anInt9340;
							var10 += anInt9341;
							var11++;
						}
					}
					var6++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			} else {
				var6 = anInt9356;
				while (var6 < 0) {
					var7 = var6 + arg3;
					if (var7 >= 0) {
						if (var7 >= arg0.length) {
							break;
						}
						var8 = anInt9339 * -29235085 * -1504772933;
						var9 = anInt9346 + anInt9348;
						var10 = anInt9324 + anInt9349;
						var11 = anInt9347;
						int var27;
						if ((var27 = var9 - (this.anInt9358 << 12)) >= 0) {
							var12 = (anInt9340 - var27) / anInt9340;
							var11 += var12;
							var9 += anInt9340 * var12;
							var10 += anInt9341 * var12;
							var8 += var12;
						}
						int var28;
						if ((var28 = (var9 - anInt9340) / anInt9340) > var11) {
							var11 = var28;
						}
						if (var10 < 0) {
							var12 = (anInt9341 - 1 - var10) / anInt9341;
							var11 += var12;
							var9 += anInt9340 * var12;
							var10 += anInt9341 * var12;
							var8 += var12;
						}
						int var29;
						if ((var29 = (var10 + 1 - (this.anInt9325 << 12) - anInt9341) / anInt9341) > var11) {
							var11 = var29;
						}
						var13 = arg0[var7] - arg2;
						var14 = -arg1[var7];
						var23 = var13 - (var8 - anInt9339 * -29235085 * -1504772933);
						if (var23 > 0) {
							var8 += var23;
							var11 += var23;
							var9 += anInt9340 * var23;
							var10 += anInt9341 * var23;
						} else {
							var14 -= var23;
						}
						if (var11 < var14) {
							var11 = var14;
						}
						while (var11 < 0) {
							var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
							if (var16 == 0) {
								var8++;
							} else {
								var5[var8++] = this.anIntArray10096[var16 & 0xFF];
							}
							var9 += anInt9340;
							var10 += anInt9341;
							var11++;
						}
					}
					var6++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			}
		} else if (anInt9341 == 0) {
			var6 = anInt9356;
			while (var6 < 0) {
				var7 = var6 + arg3;
				if (var7 >= 0) {
					if (var7 >= arg0.length) {
						break;
					}
					var8 = anInt9339 * -29235085 * -1504772933;
					var9 = anInt9346 + anInt9348;
					var10 = anInt9324;
					var11 = anInt9347;
					if (var10 >= 0 && var10 - (this.anInt9325 << 12) < 0) {
						if (var9 < 0) {
							var12 = (anInt9340 - 1 - var9) / anInt9340;
							var11 += var12;
							var9 += anInt9340 * var12;
							var8 += var12;
						}
						int var30;
						if ((var30 = (var9 + 1 - (this.anInt9358 << 12) - anInt9340) / anInt9340) > var11) {
							var11 = var30;
						}
						var13 = arg0[var7] - arg2;
						var14 = -arg1[var7];
						var23 = var13 - (var8 - anInt9339 * -29235085 * -1504772933);
						if (var23 > 0) {
							var8 += var23;
							var11 += var23;
							var9 += anInt9340 * var23;
							var10 += anInt9341 * var23;
						} else {
							var14 -= var23;
						}
						if (var11 < var14) {
							var11 = var14;
						}
						while (var11 < 0) {
							var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
							if (var16 == 0) {
								var8++;
							} else {
								var5[var8++] = this.anIntArray10096[var16 & 0xFF];
							}
							var9 += anInt9340;
							var11++;
						}
					}
				}
				var6++;
				anInt9346 += anInt9342;
				anInt9324 += anInt9343;
				anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
			}
		} else if (anInt9341 < 0) {
			var6 = anInt9356;
			while (var6 < 0) {
				var7 = var6 + arg3;
				if (var7 >= 0) {
					if (var7 >= arg0.length) {
						break;
					}
					var8 = anInt9339 * -29235085 * -1504772933;
					var9 = anInt9346 + anInt9348;
					var10 = anInt9324 + anInt9349;
					var11 = anInt9347;
					if (var9 < 0) {
						var12 = (anInt9340 - 1 - var9) / anInt9340;
						var11 += var12;
						var9 += anInt9340 * var12;
						var10 += anInt9341 * var12;
						var8 += var12;
					}
					int var31;
					if ((var31 = (var9 + 1 - (this.anInt9358 << 12) - anInt9340) / anInt9340) > var11) {
						var11 = var31;
					}
					int var32;
					if ((var32 = var10 - (this.anInt9325 << 12)) >= 0) {
						var12 = (anInt9341 - var32) / anInt9341;
						var11 += var12;
						var9 += anInt9340 * var12;
						var10 += anInt9341 * var12;
						var8 += var12;
					}
					int var33;
					if ((var33 = (var10 - anInt9341) / anInt9341) > var11) {
						var11 = var33;
					}
					var13 = arg0[var7] - arg2;
					var14 = -arg1[var7];
					var23 = var13 - (var8 - anInt9339 * -29235085 * -1504772933);
					if (var23 > 0) {
						var8 += var23;
						var11 += var23;
						var9 += anInt9340 * var23;
						var10 += anInt9341 * var23;
					} else {
						var14 -= var23;
					}
					if (var11 < var14) {
						var11 = var14;
					}
					while (var11 < 0) {
						var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
						if (var16 == 0) {
							var8++;
						} else {
							var5[var8++] = this.anIntArray10096[var16 & 0xFF];
						}
						var9 += anInt9340;
						var10 += anInt9341;
						var11++;
					}
				}
				var6++;
				anInt9346 += anInt9342;
				anInt9324 += anInt9343;
				anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
			}
		} else {
			var6 = anInt9356;
			while (var6 < 0) {
				var7 = var6 + arg3;
				if (var7 >= 0) {
					if (var7 >= arg0.length) {
						break;
					}
					var8 = anInt9339 * -29235085 * -1504772933;
					var9 = anInt9346 + anInt9348;
					var10 = anInt9324 + anInt9349;
					var11 = anInt9347;
					if (var9 < 0) {
						var12 = (anInt9340 - 1 - var9) / anInt9340;
						var11 += var12;
						var9 += anInt9340 * var12;
						var10 += anInt9341 * var12;
						var8 += var12;
					}
					int var34;
					if ((var34 = (var9 + 1 - (this.anInt9358 << 12) - anInt9340) / anInt9340) > var11) {
						var11 = var34;
					}
					if (var10 < 0) {
						var12 = (anInt9341 - 1 - var10) / anInt9341;
						var11 += var12;
						var9 += anInt9340 * var12;
						var10 += anInt9341 * var12;
						var8 += var12;
					}
					int var35;
					if ((var35 = (var10 + 1 - (this.anInt9325 << 12) - anInt9341) / anInt9341) > var11) {
						var11 = var35;
					}
					var13 = arg0[var7] - arg2;
					var14 = -arg1[var7];
					var23 = var13 - (var8 - anInt9339 * -29235085 * -1504772933);
					if (var23 > 0) {
						var8 += var23;
						var11 += var23;
						var9 += anInt9340 * var23;
						var10 += anInt9341 * var23;
					} else {
						var14 -= var23;
					}
					if (var11 < var14) {
						var11 = var14;
					}
					while (var11 < 0) {
						var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
						if (var16 == 0) {
							var8++;
						} else {
							var5[var8++] = this.anIntArray10096[var16 & 0xFF];
						}
						var9 += anInt9340;
						var10 += anInt9341;
						var11++;
					}
				}
				var6++;
				anInt9346 += anInt9342;
				anInt9324 += anInt9343;
				anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
			}
		}
	}

	public void method752(int[] arg0, int[] arg1, int arg2, int arg3) {
		int[] var5 = this.aClass_ra_Sub3_9355.anIntArray8630;
		if (var5 == null) {
			return;
		}
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		byte var16;
		int var23;
		if (anInt9340 == 0) {
			if (anInt9341 == 0) {
				var6 = anInt9356;
				while (var6 < 0) {
					var7 = var6 + arg3;
					if (var7 >= 0) {
						if (var7 >= arg0.length) {
							break;
						}
						var8 = anInt9339 * -29235085 * -1504772933;
						var9 = anInt9346;
						var10 = anInt9324;
						var11 = anInt9347;
						if (var9 >= 0 && var10 >= 0 && var9 - (this.anInt9358 << 12) < 0 && var10 - (this.anInt9325 << 12) < 0) {
							var12 = arg0[var7] - arg2;
							var13 = -arg1[var7];
							var14 = var12 - (var8 - anInt9339 * -29235085 * -1504772933);
							if (var14 > 0) {
								var8 += var14;
								var11 += var14;
								var9 += anInt9340 * var14;
								var10 += anInt9341 * var14;
							} else {
								var13 -= var14;
							}
							if (var11 < var13) {
								var11 = var13;
							}
							while (var11 < 0) {
								byte var15 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
								if (var15 == 0) {
									var8++;
								} else {
									var5[var8++] = this.anIntArray10096[var15 & 0xFF];
								}
								var11++;
							}
						}
					}
					var6++;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			} else if (anInt9341 < 0) {
				var6 = anInt9356;
				while (var6 < 0) {
					var7 = var6 + arg3;
					if (var7 >= 0) {
						if (var7 >= arg0.length) {
							break;
						}
						var8 = anInt9339 * -29235085 * -1504772933;
						var9 = anInt9346;
						var10 = anInt9324 + anInt9349;
						var11 = anInt9347;
						if (var9 >= 0 && var9 - (this.anInt9358 << 12) < 0) {
							int var17;
							if ((var17 = var10 - (this.anInt9325 << 12)) >= 0) {
								var12 = (anInt9341 - var17) / anInt9341;
								var11 += var12;
								var10 += anInt9341 * var12;
								var8 += var12;
							}
							int var18;
							if ((var18 = (var10 - anInt9341) / anInt9341) > var11) {
								var11 = var18;
							}
							var13 = arg0[var7] - arg2;
							var14 = -arg1[var7];
							var23 = var13 - (var8 - anInt9339 * -29235085 * -1504772933);
							if (var23 > 0) {
								var8 += var23;
								var11 += var23;
								var9 += anInt9340 * var23;
								var10 += anInt9341 * var23;
							} else {
								var14 -= var23;
							}
							if (var11 < var14) {
								var11 = var14;
							}
							while (var11 < 0) {
								var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
								if (var16 == 0) {
									var8++;
								} else {
									var5[var8++] = this.anIntArray10096[var16 & 0xFF];
								}
								var10 += anInt9341;
								var11++;
							}
						}
					}
					var6++;
					anInt9346 += anInt9342;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			} else {
				var6 = anInt9356;
				while (var6 < 0) {
					var7 = var6 + arg3;
					if (var7 >= 0) {
						if (var7 >= arg0.length) {
							break;
						}
						var8 = anInt9339 * -29235085 * -1504772933;
						var9 = anInt9346;
						var10 = anInt9324 + anInt9349;
						var11 = anInt9347;
						if (var9 >= 0 && var9 - (this.anInt9358 << 12) < 0) {
							if (var10 < 0) {
								var12 = (anInt9341 - 1 - var10) / anInt9341;
								var11 += var12;
								var10 += anInt9341 * var12;
								var8 += var12;
							}
							int var19;
							if ((var19 = (var10 + 1 - (this.anInt9325 << 12) - anInt9341) / anInt9341) > var11) {
								var11 = var19;
							}
							var13 = arg0[var7] - arg2;
							var14 = -arg1[var7];
							var23 = var13 - (var8 - anInt9339 * -29235085 * -1504772933);
							if (var23 > 0) {
								var8 += var23;
								var11 += var23;
								var9 += anInt9340 * var23;
								var10 += anInt9341 * var23;
							} else {
								var14 -= var23;
							}
							if (var11 < var14) {
								var11 = var14;
							}
							while (var11 < 0) {
								var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
								if (var16 == 0) {
									var8++;
								} else {
									var5[var8++] = this.anIntArray10096[var16 & 0xFF];
								}
								var10 += anInt9341;
								var11++;
							}
						}
					}
					var6++;
					anInt9346 += anInt9342;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			}
		} else if (anInt9340 < 0) {
			if (anInt9341 == 0) {
				var6 = anInt9356;
				while (var6 < 0) {
					var7 = var6 + arg3;
					if (var7 >= 0) {
						if (var7 >= arg0.length) {
							break;
						}
						var8 = anInt9339 * -29235085 * -1504772933;
						var9 = anInt9346 + anInt9348;
						var10 = anInt9324;
						var11 = anInt9347;
						if (var10 >= 0 && var10 - (this.anInt9325 << 12) < 0) {
							int var20;
							if ((var20 = var9 - (this.anInt9358 << 12)) >= 0) {
								var12 = (anInt9340 - var20) / anInt9340;
								var11 += var12;
								var9 += anInt9340 * var12;
								var8 += var12;
							}
							int var21;
							if ((var21 = (var9 - anInt9340) / anInt9340) > var11) {
								var11 = var21;
							}
							var13 = arg0[var7] - arg2;
							var14 = -arg1[var7];
							var23 = var13 - (var8 - anInt9339 * -29235085 * -1504772933);
							if (var23 > 0) {
								var8 += var23;
								var11 += var23;
								var9 += anInt9340 * var23;
								var10 += anInt9341 * var23;
							} else {
								var14 -= var23;
							}
							if (var11 < var14) {
								var11 = var14;
							}
							while (var11 < 0) {
								var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
								if (var16 == 0) {
									var8++;
								} else {
									var5[var8++] = this.anIntArray10096[var16 & 0xFF];
								}
								var9 += anInt9340;
								var11++;
							}
						}
					}
					var6++;
					anInt9324 += anInt9343;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			} else if (anInt9341 < 0) {
				var6 = anInt9356;
				while (var6 < 0) {
					var7 = var6 + arg3;
					if (var7 >= 0) {
						if (var7 >= arg0.length) {
							break;
						}
						var8 = anInt9339 * -29235085 * -1504772933;
						var9 = anInt9346 + anInt9348;
						var10 = anInt9324 + anInt9349;
						var11 = anInt9347;
						int var22;
						if ((var22 = var9 - (this.anInt9358 << 12)) >= 0) {
							var12 = (anInt9340 - var22) / anInt9340;
							var11 += var12;
							var9 += anInt9340 * var12;
							var10 += anInt9341 * var12;
							var8 += var12;
						}
						int var24;
						if ((var24 = (var9 - anInt9340) / anInt9340) > var11) {
							var11 = var24;
						}
						int var25;
						if ((var25 = var10 - (this.anInt9325 << 12)) >= 0) {
							var12 = (anInt9341 - var25) / anInt9341;
							var11 += var12;
							var9 += anInt9340 * var12;
							var10 += anInt9341 * var12;
							var8 += var12;
						}
						int var26;
						if ((var26 = (var10 - anInt9341) / anInt9341) > var11) {
							var11 = var26;
						}
						var13 = arg0[var7] - arg2;
						var14 = -arg1[var7];
						var23 = var13 - (var8 - anInt9339 * -29235085 * -1504772933);
						if (var23 > 0) {
							var8 += var23;
							var11 += var23;
							var9 += anInt9340 * var23;
							var10 += anInt9341 * var23;
						} else {
							var14 -= var23;
						}
						if (var11 < var14) {
							var11 = var14;
						}
						while (var11 < 0) {
							var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
							if (var16 == 0) {
								var8++;
							} else {
								var5[var8++] = this.anIntArray10096[var16 & 0xFF];
							}
							var9 += anInt9340;
							var10 += anInt9341;
							var11++;
						}
					}
					var6++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			} else {
				var6 = anInt9356;
				while (var6 < 0) {
					var7 = var6 + arg3;
					if (var7 >= 0) {
						if (var7 >= arg0.length) {
							break;
						}
						var8 = anInt9339 * -29235085 * -1504772933;
						var9 = anInt9346 + anInt9348;
						var10 = anInt9324 + anInt9349;
						var11 = anInt9347;
						int var27;
						if ((var27 = var9 - (this.anInt9358 << 12)) >= 0) {
							var12 = (anInt9340 - var27) / anInt9340;
							var11 += var12;
							var9 += anInt9340 * var12;
							var10 += anInt9341 * var12;
							var8 += var12;
						}
						int var28;
						if ((var28 = (var9 - anInt9340) / anInt9340) > var11) {
							var11 = var28;
						}
						if (var10 < 0) {
							var12 = (anInt9341 - 1 - var10) / anInt9341;
							var11 += var12;
							var9 += anInt9340 * var12;
							var10 += anInt9341 * var12;
							var8 += var12;
						}
						int var29;
						if ((var29 = (var10 + 1 - (this.anInt9325 << 12) - anInt9341) / anInt9341) > var11) {
							var11 = var29;
						}
						var13 = arg0[var7] - arg2;
						var14 = -arg1[var7];
						var23 = var13 - (var8 - anInt9339 * -29235085 * -1504772933);
						if (var23 > 0) {
							var8 += var23;
							var11 += var23;
							var9 += anInt9340 * var23;
							var10 += anInt9341 * var23;
						} else {
							var14 -= var23;
						}
						if (var11 < var14) {
							var11 = var14;
						}
						while (var11 < 0) {
							var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
							if (var16 == 0) {
								var8++;
							} else {
								var5[var8++] = this.anIntArray10096[var16 & 0xFF];
							}
							var9 += anInt9340;
							var10 += anInt9341;
							var11++;
						}
					}
					var6++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			}
		} else if (anInt9341 == 0) {
			var6 = anInt9356;
			while (var6 < 0) {
				var7 = var6 + arg3;
				if (var7 >= 0) {
					if (var7 >= arg0.length) {
						break;
					}
					var8 = anInt9339 * -29235085 * -1504772933;
					var9 = anInt9346 + anInt9348;
					var10 = anInt9324;
					var11 = anInt9347;
					if (var10 >= 0 && var10 - (this.anInt9325 << 12) < 0) {
						if (var9 < 0) {
							var12 = (anInt9340 - 1 - var9) / anInt9340;
							var11 += var12;
							var9 += anInt9340 * var12;
							var8 += var12;
						}
						int var30;
						if ((var30 = (var9 + 1 - (this.anInt9358 << 12) - anInt9340) / anInt9340) > var11) {
							var11 = var30;
						}
						var13 = arg0[var7] - arg2;
						var14 = -arg1[var7];
						var23 = var13 - (var8 - anInt9339 * -29235085 * -1504772933);
						if (var23 > 0) {
							var8 += var23;
							var11 += var23;
							var9 += anInt9340 * var23;
							var10 += anInt9341 * var23;
						} else {
							var14 -= var23;
						}
						if (var11 < var14) {
							var11 = var14;
						}
						while (var11 < 0) {
							var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
							if (var16 == 0) {
								var8++;
							} else {
								var5[var8++] = this.anIntArray10096[var16 & 0xFF];
							}
							var9 += anInt9340;
							var11++;
						}
					}
				}
				var6++;
				anInt9346 += anInt9342;
				anInt9324 += anInt9343;
				anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
			}
		} else if (anInt9341 < 0) {
			var6 = anInt9356;
			while (var6 < 0) {
				var7 = var6 + arg3;
				if (var7 >= 0) {
					if (var7 >= arg0.length) {
						break;
					}
					var8 = anInt9339 * -29235085 * -1504772933;
					var9 = anInt9346 + anInt9348;
					var10 = anInt9324 + anInt9349;
					var11 = anInt9347;
					if (var9 < 0) {
						var12 = (anInt9340 - 1 - var9) / anInt9340;
						var11 += var12;
						var9 += anInt9340 * var12;
						var10 += anInt9341 * var12;
						var8 += var12;
					}
					int var31;
					if ((var31 = (var9 + 1 - (this.anInt9358 << 12) - anInt9340) / anInt9340) > var11) {
						var11 = var31;
					}
					int var32;
					if ((var32 = var10 - (this.anInt9325 << 12)) >= 0) {
						var12 = (anInt9341 - var32) / anInt9341;
						var11 += var12;
						var9 += anInt9340 * var12;
						var10 += anInt9341 * var12;
						var8 += var12;
					}
					int var33;
					if ((var33 = (var10 - anInt9341) / anInt9341) > var11) {
						var11 = var33;
					}
					var13 = arg0[var7] - arg2;
					var14 = -arg1[var7];
					var23 = var13 - (var8 - anInt9339 * -29235085 * -1504772933);
					if (var23 > 0) {
						var8 += var23;
						var11 += var23;
						var9 += anInt9340 * var23;
						var10 += anInt9341 * var23;
					} else {
						var14 -= var23;
					}
					if (var11 < var14) {
						var11 = var14;
					}
					while (var11 < 0) {
						var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
						if (var16 == 0) {
							var8++;
						} else {
							var5[var8++] = this.anIntArray10096[var16 & 0xFF];
						}
						var9 += anInt9340;
						var10 += anInt9341;
						var11++;
					}
				}
				var6++;
				anInt9346 += anInt9342;
				anInt9324 += anInt9343;
				anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
			}
		} else {
			var6 = anInt9356;
			while (var6 < 0) {
				var7 = var6 + arg3;
				if (var7 >= 0) {
					if (var7 >= arg0.length) {
						break;
					}
					var8 = anInt9339 * -29235085 * -1504772933;
					var9 = anInt9346 + anInt9348;
					var10 = anInt9324 + anInt9349;
					var11 = anInt9347;
					if (var9 < 0) {
						var12 = (anInt9340 - 1 - var9) / anInt9340;
						var11 += var12;
						var9 += anInt9340 * var12;
						var10 += anInt9341 * var12;
						var8 += var12;
					}
					int var34;
					if ((var34 = (var9 + 1 - (this.anInt9358 << 12) - anInt9340) / anInt9340) > var11) {
						var11 = var34;
					}
					if (var10 < 0) {
						var12 = (anInt9341 - 1 - var10) / anInt9341;
						var11 += var12;
						var9 += anInt9340 * var12;
						var10 += anInt9341 * var12;
						var8 += var12;
					}
					int var35;
					if ((var35 = (var10 + 1 - (this.anInt9325 << 12) - anInt9341) / anInt9341) > var11) {
						var11 = var35;
					}
					var13 = arg0[var7] - arg2;
					var14 = -arg1[var7];
					var23 = var13 - (var8 - anInt9339 * -29235085 * -1504772933);
					if (var23 > 0) {
						var8 += var23;
						var11 += var23;
						var9 += anInt9340 * var23;
						var10 += anInt9341 * var23;
					} else {
						var14 -= var23;
					}
					if (var11 < var14) {
						var11 = var14;
					}
					while (var11 < 0) {
						var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
						if (var16 == 0) {
							var8++;
						} else {
							var5[var8++] = this.anIntArray10096[var16 & 0xFF];
						}
						var9 += anInt9340;
						var10 += anInt9341;
						var11++;
					}
				}
				var6++;
				anInt9346 += anInt9342;
				anInt9324 += anInt9343;
				anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
			}
		}
	}

	public void method753(int[] arg0, int[] arg1, int arg2, int arg3) {
		int[] var5 = this.aClass_ra_Sub3_9355.anIntArray8630;
		if (var5 == null) {
			return;
		}
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		byte var16;
		int var23;
		if (anInt9340 == 0) {
			if (anInt9341 == 0) {
				var6 = anInt9356;
				while (var6 < 0) {
					var7 = var6 + arg3;
					if (var7 >= 0) {
						if (var7 >= arg0.length) {
							break;
						}
						var8 = anInt9339 * -29235085 * -1504772933;
						var9 = anInt9346;
						var10 = anInt9324;
						var11 = anInt9347;
						if (var9 >= 0 && var10 >= 0 && var9 - (this.anInt9358 << 12) < 0 && var10 - (this.anInt9325 << 12) < 0) {
							var12 = arg0[var7] - arg2;
							var13 = -arg1[var7];
							var14 = var12 - (var8 - anInt9339 * -29235085 * -1504772933);
							if (var14 > 0) {
								var8 += var14;
								var11 += var14;
								var9 += anInt9340 * var14;
								var10 += anInt9341 * var14;
							} else {
								var13 -= var14;
							}
							if (var11 < var13) {
								var11 = var13;
							}
							while (var11 < 0) {
								byte var15 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
								if (var15 == 0) {
									var8++;
								} else {
									var5[var8++] = this.anIntArray10096[var15 & 0xFF];
								}
								var11++;
							}
						}
					}
					var6++;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			} else if (anInt9341 < 0) {
				var6 = anInt9356;
				while (var6 < 0) {
					var7 = var6 + arg3;
					if (var7 >= 0) {
						if (var7 >= arg0.length) {
							break;
						}
						var8 = anInt9339 * -29235085 * -1504772933;
						var9 = anInt9346;
						var10 = anInt9324 + anInt9349;
						var11 = anInt9347;
						if (var9 >= 0 && var9 - (this.anInt9358 << 12) < 0) {
							int var17;
							if ((var17 = var10 - (this.anInt9325 << 12)) >= 0) {
								var12 = (anInt9341 - var17) / anInt9341;
								var11 += var12;
								var10 += anInt9341 * var12;
								var8 += var12;
							}
							int var18;
							if ((var18 = (var10 - anInt9341) / anInt9341) > var11) {
								var11 = var18;
							}
							var13 = arg0[var7] - arg2;
							var14 = -arg1[var7];
							var23 = var13 - (var8 - anInt9339 * -29235085 * -1504772933);
							if (var23 > 0) {
								var8 += var23;
								var11 += var23;
								var9 += anInt9340 * var23;
								var10 += anInt9341 * var23;
							} else {
								var14 -= var23;
							}
							if (var11 < var14) {
								var11 = var14;
							}
							while (var11 < 0) {
								var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
								if (var16 == 0) {
									var8++;
								} else {
									var5[var8++] = this.anIntArray10096[var16 & 0xFF];
								}
								var10 += anInt9341;
								var11++;
							}
						}
					}
					var6++;
					anInt9346 += anInt9342;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			} else {
				var6 = anInt9356;
				while (var6 < 0) {
					var7 = var6 + arg3;
					if (var7 >= 0) {
						if (var7 >= arg0.length) {
							break;
						}
						var8 = anInt9339 * -29235085 * -1504772933;
						var9 = anInt9346;
						var10 = anInt9324 + anInt9349;
						var11 = anInt9347;
						if (var9 >= 0 && var9 - (this.anInt9358 << 12) < 0) {
							if (var10 < 0) {
								var12 = (anInt9341 - 1 - var10) / anInt9341;
								var11 += var12;
								var10 += anInt9341 * var12;
								var8 += var12;
							}
							int var19;
							if ((var19 = (var10 + 1 - (this.anInt9325 << 12) - anInt9341) / anInt9341) > var11) {
								var11 = var19;
							}
							var13 = arg0[var7] - arg2;
							var14 = -arg1[var7];
							var23 = var13 - (var8 - anInt9339 * -29235085 * -1504772933);
							if (var23 > 0) {
								var8 += var23;
								var11 += var23;
								var9 += anInt9340 * var23;
								var10 += anInt9341 * var23;
							} else {
								var14 -= var23;
							}
							if (var11 < var14) {
								var11 = var14;
							}
							while (var11 < 0) {
								var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
								if (var16 == 0) {
									var8++;
								} else {
									var5[var8++] = this.anIntArray10096[var16 & 0xFF];
								}
								var10 += anInt9341;
								var11++;
							}
						}
					}
					var6++;
					anInt9346 += anInt9342;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			}
		} else if (anInt9340 < 0) {
			if (anInt9341 == 0) {
				var6 = anInt9356;
				while (var6 < 0) {
					var7 = var6 + arg3;
					if (var7 >= 0) {
						if (var7 >= arg0.length) {
							break;
						}
						var8 = anInt9339 * -29235085 * -1504772933;
						var9 = anInt9346 + anInt9348;
						var10 = anInt9324;
						var11 = anInt9347;
						if (var10 >= 0 && var10 - (this.anInt9325 << 12) < 0) {
							int var20;
							if ((var20 = var9 - (this.anInt9358 << 12)) >= 0) {
								var12 = (anInt9340 - var20) / anInt9340;
								var11 += var12;
								var9 += anInt9340 * var12;
								var8 += var12;
							}
							int var21;
							if ((var21 = (var9 - anInt9340) / anInt9340) > var11) {
								var11 = var21;
							}
							var13 = arg0[var7] - arg2;
							var14 = -arg1[var7];
							var23 = var13 - (var8 - anInt9339 * -29235085 * -1504772933);
							if (var23 > 0) {
								var8 += var23;
								var11 += var23;
								var9 += anInt9340 * var23;
								var10 += anInt9341 * var23;
							} else {
								var14 -= var23;
							}
							if (var11 < var14) {
								var11 = var14;
							}
							while (var11 < 0) {
								var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
								if (var16 == 0) {
									var8++;
								} else {
									var5[var8++] = this.anIntArray10096[var16 & 0xFF];
								}
								var9 += anInt9340;
								var11++;
							}
						}
					}
					var6++;
					anInt9324 += anInt9343;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			} else if (anInt9341 < 0) {
				var6 = anInt9356;
				while (var6 < 0) {
					var7 = var6 + arg3;
					if (var7 >= 0) {
						if (var7 >= arg0.length) {
							break;
						}
						var8 = anInt9339 * -29235085 * -1504772933;
						var9 = anInt9346 + anInt9348;
						var10 = anInt9324 + anInt9349;
						var11 = anInt9347;
						int var22;
						if ((var22 = var9 - (this.anInt9358 << 12)) >= 0) {
							var12 = (anInt9340 - var22) / anInt9340;
							var11 += var12;
							var9 += anInt9340 * var12;
							var10 += anInt9341 * var12;
							var8 += var12;
						}
						int var24;
						if ((var24 = (var9 - anInt9340) / anInt9340) > var11) {
							var11 = var24;
						}
						int var25;
						if ((var25 = var10 - (this.anInt9325 << 12)) >= 0) {
							var12 = (anInt9341 - var25) / anInt9341;
							var11 += var12;
							var9 += anInt9340 * var12;
							var10 += anInt9341 * var12;
							var8 += var12;
						}
						int var26;
						if ((var26 = (var10 - anInt9341) / anInt9341) > var11) {
							var11 = var26;
						}
						var13 = arg0[var7] - arg2;
						var14 = -arg1[var7];
						var23 = var13 - (var8 - anInt9339 * -29235085 * -1504772933);
						if (var23 > 0) {
							var8 += var23;
							var11 += var23;
							var9 += anInt9340 * var23;
							var10 += anInt9341 * var23;
						} else {
							var14 -= var23;
						}
						if (var11 < var14) {
							var11 = var14;
						}
						while (var11 < 0) {
							var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
							if (var16 == 0) {
								var8++;
							} else {
								var5[var8++] = this.anIntArray10096[var16 & 0xFF];
							}
							var9 += anInt9340;
							var10 += anInt9341;
							var11++;
						}
					}
					var6++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			} else {
				var6 = anInt9356;
				while (var6 < 0) {
					var7 = var6 + arg3;
					if (var7 >= 0) {
						if (var7 >= arg0.length) {
							break;
						}
						var8 = anInt9339 * -29235085 * -1504772933;
						var9 = anInt9346 + anInt9348;
						var10 = anInt9324 + anInt9349;
						var11 = anInt9347;
						int var27;
						if ((var27 = var9 - (this.anInt9358 << 12)) >= 0) {
							var12 = (anInt9340 - var27) / anInt9340;
							var11 += var12;
							var9 += anInt9340 * var12;
							var10 += anInt9341 * var12;
							var8 += var12;
						}
						int var28;
						if ((var28 = (var9 - anInt9340) / anInt9340) > var11) {
							var11 = var28;
						}
						if (var10 < 0) {
							var12 = (anInt9341 - 1 - var10) / anInt9341;
							var11 += var12;
							var9 += anInt9340 * var12;
							var10 += anInt9341 * var12;
							var8 += var12;
						}
						int var29;
						if ((var29 = (var10 + 1 - (this.anInt9325 << 12) - anInt9341) / anInt9341) > var11) {
							var11 = var29;
						}
						var13 = arg0[var7] - arg2;
						var14 = -arg1[var7];
						var23 = var13 - (var8 - anInt9339 * -29235085 * -1504772933);
						if (var23 > 0) {
							var8 += var23;
							var11 += var23;
							var9 += anInt9340 * var23;
							var10 += anInt9341 * var23;
						} else {
							var14 -= var23;
						}
						if (var11 < var14) {
							var11 = var14;
						}
						while (var11 < 0) {
							var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
							if (var16 == 0) {
								var8++;
							} else {
								var5[var8++] = this.anIntArray10096[var16 & 0xFF];
							}
							var9 += anInt9340;
							var10 += anInt9341;
							var11++;
						}
					}
					var6++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
				}
			}
		} else if (anInt9341 == 0) {
			var6 = anInt9356;
			while (var6 < 0) {
				var7 = var6 + arg3;
				if (var7 >= 0) {
					if (var7 >= arg0.length) {
						break;
					}
					var8 = anInt9339 * -29235085 * -1504772933;
					var9 = anInt9346 + anInt9348;
					var10 = anInt9324;
					var11 = anInt9347;
					if (var10 >= 0 && var10 - (this.anInt9325 << 12) < 0) {
						if (var9 < 0) {
							var12 = (anInt9340 - 1 - var9) / anInt9340;
							var11 += var12;
							var9 += anInt9340 * var12;
							var8 += var12;
						}
						int var30;
						if ((var30 = (var9 + 1 - (this.anInt9358 << 12) - anInt9340) / anInt9340) > var11) {
							var11 = var30;
						}
						var13 = arg0[var7] - arg2;
						var14 = -arg1[var7];
						var23 = var13 - (var8 - anInt9339 * -29235085 * -1504772933);
						if (var23 > 0) {
							var8 += var23;
							var11 += var23;
							var9 += anInt9340 * var23;
							var10 += anInt9341 * var23;
						} else {
							var14 -= var23;
						}
						if (var11 < var14) {
							var11 = var14;
						}
						while (var11 < 0) {
							var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
							if (var16 == 0) {
								var8++;
							} else {
								var5[var8++] = this.anIntArray10096[var16 & 0xFF];
							}
							var9 += anInt9340;
							var11++;
						}
					}
				}
				var6++;
				anInt9346 += anInt9342;
				anInt9324 += anInt9343;
				anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
			}
		} else if (anInt9341 < 0) {
			var6 = anInt9356;
			while (var6 < 0) {
				var7 = var6 + arg3;
				if (var7 >= 0) {
					if (var7 >= arg0.length) {
						break;
					}
					var8 = anInt9339 * -29235085 * -1504772933;
					var9 = anInt9346 + anInt9348;
					var10 = anInt9324 + anInt9349;
					var11 = anInt9347;
					if (var9 < 0) {
						var12 = (anInt9340 - 1 - var9) / anInt9340;
						var11 += var12;
						var9 += anInt9340 * var12;
						var10 += anInt9341 * var12;
						var8 += var12;
					}
					int var31;
					if ((var31 = (var9 + 1 - (this.anInt9358 << 12) - anInt9340) / anInt9340) > var11) {
						var11 = var31;
					}
					int var32;
					if ((var32 = var10 - (this.anInt9325 << 12)) >= 0) {
						var12 = (anInt9341 - var32) / anInt9341;
						var11 += var12;
						var9 += anInt9340 * var12;
						var10 += anInt9341 * var12;
						var8 += var12;
					}
					int var33;
					if ((var33 = (var10 - anInt9341) / anInt9341) > var11) {
						var11 = var33;
					}
					var13 = arg0[var7] - arg2;
					var14 = -arg1[var7];
					var23 = var13 - (var8 - anInt9339 * -29235085 * -1504772933);
					if (var23 > 0) {
						var8 += var23;
						var11 += var23;
						var9 += anInt9340 * var23;
						var10 += anInt9341 * var23;
					} else {
						var14 -= var23;
					}
					if (var11 < var14) {
						var11 = var14;
					}
					while (var11 < 0) {
						var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
						if (var16 == 0) {
							var8++;
						} else {
							var5[var8++] = this.anIntArray10096[var16 & 0xFF];
						}
						var9 += anInt9340;
						var10 += anInt9341;
						var11++;
					}
				}
				var6++;
				anInt9346 += anInt9342;
				anInt9324 += anInt9343;
				anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
			}
		} else {
			var6 = anInt9356;
			while (var6 < 0) {
				var7 = var6 + arg3;
				if (var7 >= 0) {
					if (var7 >= arg0.length) {
						break;
					}
					var8 = anInt9339 * -29235085 * -1504772933;
					var9 = anInt9346 + anInt9348;
					var10 = anInt9324 + anInt9349;
					var11 = anInt9347;
					if (var9 < 0) {
						var12 = (anInt9340 - 1 - var9) / anInt9340;
						var11 += var12;
						var9 += anInt9340 * var12;
						var10 += anInt9341 * var12;
						var8 += var12;
					}
					int var34;
					if ((var34 = (var9 + 1 - (this.anInt9358 << 12) - anInt9340) / anInt9340) > var11) {
						var11 = var34;
					}
					if (var10 < 0) {
						var12 = (anInt9341 - 1 - var10) / anInt9341;
						var11 += var12;
						var9 += anInt9340 * var12;
						var10 += anInt9341 * var12;
						var8 += var12;
					}
					int var35;
					if ((var35 = (var10 + 1 - (this.anInt9325 << 12) - anInt9341) / anInt9341) > var11) {
						var11 = var35;
					}
					var13 = arg0[var7] - arg2;
					var14 = -arg1[var7];
					var23 = var13 - (var8 - anInt9339 * -29235085 * -1504772933);
					if (var23 > 0) {
						var8 += var23;
						var11 += var23;
						var9 += anInt9340 * var23;
						var10 += anInt9341 * var23;
					} else {
						var14 -= var23;
					}
					if (var11 < var14) {
						var11 = var14;
					}
					while (var11 < 0) {
						var16 = this.aByteArray10095[(var10 >> 12) * this.anInt9358 + (var9 >> 12)];
						if (var16 == 0) {
							var8++;
						} else {
							var5[var8++] = this.anIntArray10096[var16 & 0xFF];
						}
						var9 += anInt9340;
						var10 += anInt9341;
						var11++;
					}
				}
				var6++;
				anInt9346 += anInt9342;
				anInt9324 += anInt9343;
				anInt9339 = (anInt9339 * -29235085 * -1504772933 + anInt9338 * -29235085 * -1504772933 * -29235085 * -1504772933) * -29235085 * -1504772933;
			}
		}
	}
}
