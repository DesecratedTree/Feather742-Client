package deob;

import java.io.EOFException;
import java.io.IOException;

public class Class339 {

	public Class489 aClass489_3376 = null;

	public Class489 aClass489_3375 = null;

	public int anInt3377 = 65000;

	public int anInt3378;

	public static byte[] aByteArray3379 = new byte[520];

	public Class339(int arg0, Class489 arg1, Class489 arg2, int arg3) {
		this.anInt3378 = arg0;
		this.aClass489_3376 = arg1;
		this.aClass489_3375 = arg2;
		this.anInt3377 = arg3;
	}

	public byte[] method3961(int arg0, byte arg1) {
		try {
			Class489 var3 = this.aClass489_3376;
			synchronized (this.aClass489_3376) {
				Object var10000;
				try {
					if (this.aClass489_3375.method6056(1964420626) < (long) (arg0 * 6 + 6)) {
						Object var22 = null;
						var10000 = var22;
						return (byte[]) var10000;
					}
					this.aClass489_3375.method6055((long) (arg0 * 6));
					this.aClass489_3375.method6057(aByteArray3379, 0, 6, (byte) 0);
					int var5 = ((aByteArray3379[1] & 0xFF) << 8) + ((aByteArray3379[0] & 0xFF) << 16) + (aByteArray3379[2] & 0xFF);
					int var6 = (aByteArray3379[5] & 0xFF) + ((aByteArray3379[3] & 0xFF) << 16) + ((aByteArray3379[4] & 0xFF) << 8);
					Object var23;
					if (var5 < 0 || var5 > this.anInt3377) {
						var23 = null;
						var10000 = var23;
						return (byte[]) var10000;
					}
					if (var6 > 0 && (long) var6 <= this.aClass489_3376.method6056(1346259262) / 520L) {
						byte[] var7 = new byte[var5];
						int var8 = 0;
						int var9 = 0;
						while (var8 < var5) {
							if (var6 == 0) {
								Object var24 = null;
								var10000 = var24;
								return (byte[]) var10000;
							}
							this.aClass489_3376.method6055((long) (var6 * 520));
							int var10 = var5 - var8;
							byte var11;
							int var12;
							int var13;
							int var14;
							int var15;
							if (arg0 > 65535) {
								if (var10 > 510) {
									var10 = 510;
								}
								var11 = 10;
								this.aClass489_3376.method6057(aByteArray3379, 0, var10 + var11, (byte) 0);
								var12 = ((aByteArray3379[2] & 0xFF) << 8) + ((aByteArray3379[0] & 0xFF) << 24) + ((aByteArray3379[1] & 0xFF) << 16) + (aByteArray3379[3] & 0xFF);
								var13 = (aByteArray3379[5] & 0xFF) + ((aByteArray3379[4] & 0xFF) << 8);
								var14 = (aByteArray3379[8] & 0xFF) + ((aByteArray3379[6] & 0xFF) << 16) + ((aByteArray3379[7] & 0xFF) << 8);
								var15 = aByteArray3379[9] & 0xFF;
							} else {
								if (var10 > 512) {
									var10 = 512;
								}
								var11 = 8;
								this.aClass489_3376.method6057(aByteArray3379, 0, var11 + var10, (byte) 0);
								var12 = (aByteArray3379[1] & 0xFF) + ((aByteArray3379[0] & 0xFF) << 8);
								var13 = (aByteArray3379[3] & 0xFF) + ((aByteArray3379[2] & 0xFF) << 8);
								var14 = ((aByteArray3379[4] & 0xFF) << 16) + ((aByteArray3379[5] & 0xFF) << 8) + (aByteArray3379[6] & 0xFF);
								var15 = aByteArray3379[7] & 0xFF;
							}
							Object var25;
							if (arg0 != var12 || var13 != var9 || this.anInt3378 != var15) {
								var25 = null;
								var10000 = var25;
								return (byte[]) var10000;
							}
							if (var14 < 0 || (long) var14 > this.aClass489_3376.method6056(1587944818) / 520L) {
								var25 = null;
								var10000 = var25;
								return (byte[]) var10000;
							}
							int var16 = var10 + var11;
							for (int var17 = var11; var17 < var16; var17++) {
								var7[var8++] = aByteArray3379[var17];
							}
							var6 = var14;
							var9++;
						}
						byte[] var4 = var7;
						return var4;
					}
					var23 = null;
					var10000 = var23;
				} catch (IOException var19) {
					return null;
				}
				return (byte[]) var10000;
			}
		} catch (RuntimeException var21) {
			throw Class476.method5964(var21, "od.r(" + ')');
		}
	}

	public boolean method3962(int arg0, byte[] arg1, int arg2, short arg3) {
		try {
			Class489 var5 = this.aClass489_3376;
			synchronized (this.aClass489_3376) {
				if (arg2 < 0 || arg2 > this.anInt3377) {
					throw new IllegalArgumentException();
				}
				boolean var6 = this.method3963(arg0, arg1, arg2, true, (byte) 1);
				if (!var6) {
					var6 = this.method3963(arg0, arg1, arg2, false, (byte) 1);
				}
				return var6;
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "od.j(" + ')');
		}
	}

	public String toString() {
		try {
			return "" + this.anInt3378;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "od.toString(" + ')');
		}
	}

	public boolean method3963(int arg0, byte[] arg1, int arg2, boolean arg3, byte arg4) {
		try {
			Class489 var6 = this.aClass489_3376;
			synchronized (this.aClass489_3376) {
				try {
					int var8;
					boolean var10000;
					if (arg3) {
						boolean var22;
						if (this.aClass489_3375.method6056(1717947132) < (long) (arg0 * 6 + 6)) {
							var22 = false;
							var10000 = var22;
							return var10000;
						}
						this.aClass489_3375.method6055((long) (arg0 * 6));
						this.aClass489_3375.method6057(aByteArray3379, 0, 6, (byte) 0);
						var8 = ((aByteArray3379[3] & 0xFF) << 16) + ((aByteArray3379[4] & 0xFF) << 8) + (aByteArray3379[5] & 0xFF);
						if (var8 <= 0 || (long) var8 > this.aClass489_3376.method6056(1664669101) / 520L) {
							var22 = false;
							var10000 = var22;
							return var10000;
						}
					} else {
						var8 = (int) ((this.aClass489_3376.method6056(2059038941) + 519L) / 520L);
						if (var8 == 0) {
							var8 = 1;
						}
					}
					aByteArray3379[0] = (byte) (arg2 >> 16);
					aByteArray3379[1] = (byte) (arg2 >> 8);
					aByteArray3379[2] = (byte) arg2;
					aByteArray3379[3] = (byte) (var8 >> 16);
					aByteArray3379[4] = (byte) (var8 >> 8);
					aByteArray3379[5] = (byte) var8;
					this.aClass489_3375.method6055((long) (arg0 * 6));
					this.aClass489_3375.method6053(aByteArray3379, 0, 6, -2105283850);
					int var9 = 0;
					int var10 = 0;
					while (true) {
						if (var9 < arg2) {
							label156: {
								int var11 = 0;
								int var12;
								if (arg3) {
									this.aClass489_3376.method6055((long) (var8 * 520));
									int var13;
									int var14;
									if (arg0 > 65535) {
										try {
											this.aClass489_3376.method6057(aByteArray3379, 0, 10, (byte) 0);
										} catch (EOFException var18) {
											break label156;
										}
										var12 = (aByteArray3379[3] & 0xFF) + ((aByteArray3379[1] & 0xFF) << 16) + ((aByteArray3379[0] & 0xFF) << 24) + ((aByteArray3379[2] & 0xFF) << 8);
										var13 = (aByteArray3379[5] & 0xFF) + ((aByteArray3379[4] & 0xFF) << 8);
										var11 = ((aByteArray3379[6] & 0xFF) << 16) + ((aByteArray3379[7] & 0xFF) << 8) + (aByteArray3379[8] & 0xFF);
										var14 = aByteArray3379[9] & 0xFF;
									} else {
										try {
											this.aClass489_3376.method6057(aByteArray3379, 0, 8, (byte) 0);
										} catch (EOFException var17) {
											break label156;
										}
										var12 = ((aByteArray3379[0] & 0xFF) << 8) + (aByteArray3379[1] & 0xFF);
										var13 = ((aByteArray3379[2] & 0xFF) << 8) + (aByteArray3379[3] & 0xFF);
										var11 = ((aByteArray3379[5] & 0xFF) << 8) + ((aByteArray3379[4] & 0xFF) << 16) + (aByteArray3379[6] & 0xFF);
										var14 = aByteArray3379[7] & 0xFF;
									}
									boolean var15;
									if (arg0 != var12 || var10 != var13 || this.anInt3378 != var14) {
										var15 = false;
										var10000 = var15;
										return var10000;
									}
									if (var11 < 0 || (long) var11 > this.aClass489_3376.method6056(2099186270) / 520L) {
										var15 = false;
										var10000 = var15;
										return var10000;
									}
								}
								if (var11 == 0) {
									arg3 = false;
									var11 = (int) ((this.aClass489_3376.method6056(1106838837) + 519L) / 520L);
									if (var11 == 0) {
										var11++;
									}
									if (var8 == var11) {
										var11++;
									}
								}
								if (arg2 - var9 <= 512) {
									var11 = 0;
								}
								if (arg0 > 65535) {
									aByteArray3379[0] = (byte) (arg0 >> 24);
									aByteArray3379[1] = (byte) (arg0 >> 16);
									aByteArray3379[2] = (byte) (arg0 >> 8);
									aByteArray3379[3] = (byte) arg0;
									aByteArray3379[4] = (byte) (var10 >> 8);
									aByteArray3379[5] = (byte) var10;
									aByteArray3379[6] = (byte) (var11 >> 16);
									aByteArray3379[7] = (byte) (var11 >> 8);
									aByteArray3379[8] = (byte) var11;
									aByteArray3379[9] = (byte) this.anInt3378;
									this.aClass489_3376.method6055((long) (var8 * 520));
									this.aClass489_3376.method6053(aByteArray3379, 0, 10, -2105283850);
									var12 = arg2 - var9;
									if (var12 > 510) {
										var12 = 510;
									}
									this.aClass489_3376.method6053(arg1, var9, var12, -2105283850);
									var9 += var12;
								} else {
									aByteArray3379[0] = (byte) (arg0 >> 8);
									aByteArray3379[1] = (byte) arg0;
									aByteArray3379[2] = (byte) (var10 >> 8);
									aByteArray3379[3] = (byte) var10;
									aByteArray3379[4] = (byte) (var11 >> 16);
									aByteArray3379[5] = (byte) (var11 >> 8);
									aByteArray3379[6] = (byte) var11;
									aByteArray3379[7] = (byte) this.anInt3378;
									this.aClass489_3376.method6055((long) (var8 * 520));
									this.aClass489_3376.method6053(aByteArray3379, 0, 8, -2105283850);
									var12 = arg2 - var9;
									if (var12 > 512) {
										var12 = 512;
									}
									this.aClass489_3376.method6053(arg1, var9, var12, -2105283850);
									var9 += var12;
								}
								var8 = var11;
								var10++;
								continue;
							}
						}
						boolean var7 = true;
						return var7;
					}
				} catch (IOException var19) {
					return false;
				}
			}
		} catch (RuntimeException var21) {
			throw Class476.method5964(var21, "od.i(" + ')');
		}
	}

	public static final void method3964(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2 >> 14 & 0x3FFF;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "od.td(" + ')');
		}
	}

	public static final void method3965(Class430 arg0, int arg1) {
		try {
			Class95_Sub12_Sub1.method1141(-1696107092);
			client.aClass304_9030.method3032(768219532);
			Class435.method5568(1905725687);
			client.aBoolean9194 = false;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "od.aoo(" + ')');
		}
	}

	public static final void method3966(Class430 arg0, int arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			Class307.method3074(var2, 1980644324);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "od.we(" + ')');
		}
	}

	public static void method3967(String arg0, boolean arg1, int arg2, String arg3, byte arg4) {
		try {
			Class283.method2825(arg0, arg1, arg2, -1, arg3, true, 1759280233);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "od.me(" + ')');
		}
	}
}
