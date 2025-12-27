package deob;

import java.awt.Point;
import java.awt.Rectangle;

public class Class524 {

	public static String[] aStringArray6032 = new String[100];

	public byte[] aByteArray6034;

	public byte[][] aByteArrayArray6031;

	public int anInt6030;

	public int anInt6033;

	public int anInt6035;

	public Class524(byte[] arg0) {
		Buffer var2 = new Buffer(arg0);
		int var3 = var2.readUnsignedByte(73371845);
		if (var3 != 0) {
			throw new RuntimeException("");
		}
		boolean var4 = var2.readUnsignedByte(1853911395) == 1;
		this.aByteArray6034 = new byte[256];
		var2.readBytes(this.aByteArray6034, 0, 256, 1274334002);
		if (var4) {
			int[] var5 = new int[256];
			int[] var6 = new int[256];
			int var7;
			for (var7 = 0; var7 < 256; var7++) {
				var5[var7] = var2.readUnsignedByte(404093276);
			}
			for (var7 = 0; var7 < 256; var7++) {
				var6[var7] = var2.readUnsignedByte(1799313809);
			}
			byte[][] var12 = new byte[256][];
			int var10;
			for (int var8 = 0; var8 < 256; var8++) {
				var12[var8] = new byte[var5[var8]];
				byte var9 = 0;
				for (var10 = 0; var10 < var12[var8].length; var10++) {
					var9 += var2.readByte((byte) -4);
					var12[var8][var10] = var9;
				}
			}
			byte[][] var13 = new byte[256][];
			int var14;
			for (var14 = 0; var14 < 256; var14++) {
				var13[var14] = new byte[var5[var14]];
				byte var15 = 0;
				for (int var11 = 0; var11 < var13[var14].length; var11++) {
					var15 += var2.readByte((byte) -22);
					var13[var14][var11] = var15;
				}
			}
			this.aByteArrayArray6031 = new byte[256][256];
			for (var14 = 0; var14 < 256; var14++) {
				if (var14 != 32) {
					for (var10 = 0; var10 < 256; var10++) {
						if (var10 != 32) {
							this.aByteArrayArray6031[var14][var10] = (byte) Class105.method1310(var12, var13, var6, this.aByteArray6034, var5, var14, var10, (byte) -40);
						}
					}
				}
			}
			this.anInt6030 = var6[32] + var5[32];
		} else {
			this.anInt6030 = var2.readUnsignedByte(-39509533);
		}
		var2.readUnsignedByte(672795436);
		var2.readUnsignedByte(-129219704);
		this.anInt6033 = var2.readUnsignedByte(1632989591);
		this.anInt6035 = var2.readUnsignedByte(1635495176);
	}

	public int method6240(String arg0, int arg1) {
		try {
			return this.method6248(arg0, null, -1774747465);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "vs.s(" + ')');
		}
	}

	public int method6241(int arg0, int arg1) {
		try {
			return this.aByteArray6034[arg0] & 0xFF;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "vs.o(" + ')');
		}
	}

	public Point method6242(String arg0, int arg1, int arg2, int arg3, Interface30[] arg4, int arg5) {
		try {
			if (arg3 <= 0) {
				return new Point(0, this.anInt6033 + arg2);
			}
			if (arg3 > arg0.length()) {
				arg3 = arg0.length();
			}
			if (arg2 == 0) {
				arg2 = this.anInt6030;
			}
			int var7 = this.method6245(arg0, new int[] { arg1 }, aStringArray6032, arg4, false, -1743176441);
			int var8 = 0;
			for (int var9 = 0; var9 < var7; var9++) {
				int var10 = aStringArray6032[var9].length();
				if (var10 + var8 > arg3 || var9 == var7 - 1 && arg3 == arg0.length()) {
					String var11 = arg0.substring(var8, arg3);
					if (var11.endsWith("<br>")) {
						var11 = "";
						int var10000 = var8 + var10;
						var9++;
					}
					int var12 = this.method6248(var11, arg4, -1867621405);
					int var13 = var9 * arg2 + this.anInt6033;
					return new Point(var12, var13);
				}
				var8 += var10;
			}
			return null;
		} catch (RuntimeException var14) {
			throw Class476.method5964(var14, "vs.q(" + ')');
		}
	}

	public int method6243(String arg0, int arg1, int arg2, int arg3, int arg4, Interface30[] arg5, int arg6) {
		try {
			if (arg2 == 0) {
				arg2 = this.anInt6030;
			}
			int var8 = this.method6244(arg0, new int[] { arg1 }, aStringArray6032, arg5, 1780988145);
			if (var8 == 0) {
				return 0;
			}
			if (arg4 < 0) {
				arg4 = 0;
			}
			arg4 /= arg2;
			if (arg4 >= var8) {
				arg4 = var8 - 1;
			}
			String var9 = aStringArray6032[arg4];
			int var10 = 0;
			int var11 = 0;
			int var12;
			for (var12 = 0; var12 < arg3 && var10 < var9.length(); var12 = this.method6248(var9.substring(0, var10), arg5, -480261031)) {
				var11 = var12;
				var10++;
			}
			if (var10 == var9.length() && var9.endsWith("<br>")) {
				var10 -= 4;
			}
			if (arg3 - var11 < var12 - arg3) {
				var10--;
			}
			for (int var13 = 0; var13 < arg4; var13++) {
				var10 += aStringArray6032[var13].length();
			}
			return var10;
		} catch (RuntimeException var14) {
			throw Class476.method5964(var14, "vs.u(" + ')');
		}
	}

	public int method6244(String arg0, int[] arg1, String[] arg2, Interface30[] arg3, int arg4) {
		try {
			return this.method6245(arg0, arg1, arg2, arg3, true, -1975373308);
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "vs.w(" + ')');
		}
	}

	public int method6245(String arg0, int[] arg1, String[] arg2, Interface30[] arg3, boolean arg4, int arg5) {
		try {
			if (arg0 == null) {
				return 0;
			}
			int var7 = 0;
			int var8 = 0;
			int var9 = -1;
			int var10 = 0;
			int var11 = 0;
			int var12 = -1;
			int var13 = -1;
			int var14 = 0;
			int var15 = arg0.length();
			for (int var16 = 0; var16 < var15; var16++) {
				int var17 = ItemEquipDefinitions.method6216(arg0.charAt(var16), -2036175662) & 0xFF;
				int var18 = 0;
				if (var17 == 60) {
					var12 = var16;
				} else {
					int var19;
					if (var12 == -1) {
						var19 = var16;
						var18 += this.method6241(var17, -1580242009);
						if (this.aByteArrayArray6031 != null && var13 != -1) {
							var18 += this.aByteArrayArray6031[var13][var17];
						}
						var13 = var17;
					} else {
						if (var17 != 62) {
							if (arg5 >= -1676046053) {
							}
							continue;
						}
						var19 = var12;
						String var20 = arg0.substring(var12 + 1, var16);
						var12 = -1;
						if (var20.equals("br")) {
							arg2[var14] = arg0.substring(var8, var16 + 1);
							var14++;
							if (var14 >= arg2.length) {
								return 0;
							}
							var8 = var16 + 1;
							var7 = 0;
							var9 = -1;
							var13 = -1;
							continue;
						}
						if (var20.equals("lt")) {
							var18 += this.method6241(60, -1850026793);
							if (this.aByteArrayArray6031 != null && var13 != -1) {
								var18 += this.aByteArrayArray6031[var13][60];
							}
							var13 = 60;
						} else if (var20.equals("gt")) {
							var18 += this.method6241(62, -1604514117);
							if (this.aByteArrayArray6031 != null && var13 != -1) {
								var18 += this.aByteArrayArray6031[var13][62];
							}
							var13 = 62;
						} else if (var20.equals("nbsp")) {
							var18 += this.method6241(160, -1547339744);
							if (this.aByteArrayArray6031 != null && var13 != -1) {
								var18 += this.aByteArrayArray6031[var13][160];
							}
							var13 = 160;
						} else if (var20.equals("shy")) {
							var18 += this.method6241(173, -1795071349);
							if (this.aByteArrayArray6031 != null && var13 != -1) {
								var18 += this.aByteArrayArray6031[var13][173];
							}
							var13 = 173;
						} else if (var20.equals("times")) {
							var18 += this.method6241(215, -1600259427);
							if (this.aByteArrayArray6031 != null && var13 != -1) {
								var18 += this.aByteArrayArray6031[var13][215];
							}
							var13 = 215;
						} else if (var20.equals("euro")) {
							var18 += this.method6241(8364, -1644532263);
							if (this.aByteArrayArray6031 != null && var13 != -1) {
								var18 += this.aByteArrayArray6031[var13][8364];
							}
							var13 = 8364;
						} else if (var20.equals("copy")) {
							var18 += this.method6241(169, -2013742664);
							if (this.aByteArrayArray6031 != null && var13 != -1) {
								var18 += this.aByteArrayArray6031[var13][169];
							}
							var13 = 169;
						} else if (var20.equals("reg")) {
							var18 += this.method6241(174, -2098046533);
							if (this.aByteArrayArray6031 != null && var13 != -1) {
								var18 += this.aByteArrayArray6031[var13][174];
							}
							var13 = 174;
						} else if (var20.startsWith("img=") && arg3 != null) {
							try {
								int var21 = Class204.method2185(var20.substring(4), (byte) -61);
								var18 += arg3[var21].method318();
								var13 = -1;
							} catch (Exception var22) {
							}
						}
						var17 = -1;
					}
					if (var18 > 0) {
						var7 += var18;
						if (arg1 != null) {
							if (var17 == 32) {
								var9 = var16;
								var10 = var7;
								var11 = arg4 ? 1 : 0;
							}
							if (var7 > arg1[var14 < arg1.length ? var14 : arg1.length - 1]) {
								if (var9 >= 0) {
									arg2[var14] = arg0.substring(var8, var9 + 1 - var11);
									var14++;
									if (var14 >= arg2.length) {
										return 0;
									}
									var8 = var9 + 1;
									var9 = -1;
									var7 -= var10;
									var13 = -1;
								} else {
									arg2[var14] = arg0.substring(var8, var19);
									var14++;
									if (var14 >= arg2.length) {
										return 0;
									}
									var8 = var19;
									var9 = -1;
									var7 = var18;
									var13 = -1;
								}
							}
							if (var17 == 45) {
								var9 = var16;
								var10 = var7;
								var11 = 0;
							}
						}
					}
				}
			}
			if (arg0.length() > var8) {
				arg2[var14] = arg0.substring(var8, arg0.length());
				var14++;
			}
			return var14;
		} catch (RuntimeException var23) {
			throw Class476.method5964(var23, "vs.n(" + ')');
		}
	}

	public int method6246(String arg0, int arg1, Interface30[] arg2, byte arg3) {
		try {
			int var5 = this.method6244(arg0, new int[] { arg1 }, aStringArray6032, arg2, 1596377651);
			int var6 = 0;
			for (int var7 = 0; var7 < var5; var7++) {
				int var8 = this.method6248(aStringArray6032[var7], arg2, -1981663298);
				if (var8 > var6) {
					var6 = var8;
				}
			}
			return var6;
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "vs.l(" + ')');
		}
	}

	public int method6247(String arg0, int arg1, int arg2, Interface30[] arg3, int arg4) {
		try {
			if (arg2 == 0) {
				arg2 = this.anInt6030;
			}
			int var6 = this.method6244(arg0, new int[] { arg1 }, aStringArray6032, arg3, 813727579);
			int var7 = (var6 - 1) * arg2;
			return this.anInt6033 + var7 + this.anInt6035;
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "vs.k(" + ')');
		}
	}

	public int method6248(String arg0, Interface30[] arg1, int arg2) {
		try {
			if (arg0 == null) {
				return 0;
			}
			int var4 = -1;
			int var5 = -1;
			int var6 = 0;
			int var7 = arg0.length();
			for (int var8 = 0; var8 < var7; var8++) {
				char var9 = arg0.charAt(var8);
				if (var9 == '<') {
					var4 = var8;
				} else {
					if (var9 == '>' && var4 != -1) {
						String var10 = arg0.substring(var4 + 1, var8);
						var4 = -1;
						if (var10.equals("lt")) {
							var9 = '<';
						} else if (var10.equals("gt")) {
							var9 = '>';
						} else if (var10.equals("nbsp")) {
							var9 = 160;
						} else if (var10.equals("shy")) {
							var9 = 173;
						} else if (var10.equals("times")) {
							var9 = 215;
						} else if (var10.equals("euro")) {
							var9 = 8364;
						} else if (var10.equals("copy")) {
							var9 = 169;
						} else {
							if (!var10.equals("reg")) {
								if (var10.startsWith("img=") && arg1 != null) {
									try {
										int var11 = Class204.method2185(var10.substring(4), (byte) -10);
										var6 += arg1[var11].method318();
										var5 = -1;
									} catch (Exception var12) {
									}
								}
								continue;
							}
							var9 = 174;
						}
					}
					if (var4 == -1) {
						var6 += this.aByteArray6034[ItemEquipDefinitions.method6216(var9, -238617280) & 0xFF] & 0xFF;
						if (this.aByteArrayArray6031 != null && var5 != -1) {
							var6 += this.aByteArrayArray6031[var5][var9];
						}
						var5 = var9;
					}
				}
			}
			return var6;
		} catch (RuntimeException var13) {
			throw Class476.method5964(var13, "vs.f(" + ')');
		}
	}

	public String method6249(String arg0, int arg1, Interface30[] arg2, int arg3) {
		try {
			if (this.method6248(arg0, arg2, -232280159) <= arg1) {
				return arg0;
			}
			int var16 = arg1 - this.method6248("...", null, -1003403732);
			int var5 = -1;
			int var6 = -1;
			int var7 = 0;
			int var8 = arg0.length();
			String var9 = "";
			for (int var10 = 0; var10 < var8; var10++) {
				char var11 = arg0.charAt(var10);
				if (var11 == '<') {
					var5 = var10;
				} else {
					if (var11 == '>' && var5 != -1) {
						String var12 = arg0.substring(var5 + 1, var10);
						var5 = -1;
						if (var12.equals("lt")) {
							var11 = '<';
						} else if (var12.equals("gt")) {
							var11 = '>';
						} else if (var12.equals("nbsp")) {
							var11 = 160;
						} else if (var12.equals("shy")) {
							var11 = 173;
						} else if (var12.equals("times")) {
							var11 = 215;
						} else if (var12.equals("euro")) {
							var11 = 8364;
						} else if (var12.equals("copy")) {
							var11 = 169;
						} else {
							if (!var12.equals("reg")) {
								if (var12.startsWith("img=") && arg2 != null) {
									try {
										int var13 = Class204.method2185(var12.substring(4), (byte) -31);
										var7 += arg2[var13].method318();
										var6 = -1;
										if (var7 > var16) {
											return var9 + "...";
										}
										var9 = arg0.substring(0, var10 + 1);
									} catch (Exception var14) {
									}
								}
								continue;
							}
							var11 = 174;
						}
					}
					if (var5 == -1) {
						var7 += this.aByteArray6034[ItemEquipDefinitions.method6216(var11, 934780369) & 0xFF] & 0xFF;
						if (this.aByteArrayArray6031 != null && var6 != -1) {
							var7 += this.aByteArrayArray6031[var6][var11];
						}
						var6 = var11;
						int var17 = var7;
						if (this.aByteArrayArray6031 != null) {
							var17 = var7 + this.aByteArrayArray6031[var11][46];
						}
						if (var17 > var16) {
							return var9 + "...";
						}
						var9 = arg0.substring(0, var10 + 1);
					}
				}
			}
			return arg0;
		} catch (RuntimeException var15) {
			throw Class476.method5964(var15, "vs.z(" + ')');
		}
	}

	public int method6250(int arg0, char arg1, byte arg2) {
		try {
			return this.aByteArrayArray6031 == null ? 0 : this.aByteArrayArray6031[arg0][arg1];
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "vs.p(" + ')');
		}
	}

	public int method6251(String arg0, int arg1, Interface30[] arg2, int arg3) {
		try {
			return this.method6244(arg0, new int[] { arg1 }, aStringArray6032, arg2, 825091338);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "vs.b(" + ')');
		}
	}

	public static final void method6252(int arg0, int arg1, int arg2, int arg3, byte arg4) {
		try {
			for (int var5 = 0; var5 < client.anInt9213; var5++) {
				Rectangle var6 = client.aRectangleArray9252[var5];
				if (var6.width + var6.x > arg0 && var6.x < arg0 + arg2 && var6.height + var6.y > arg1 && var6.y < arg3 + arg1) {
					client.aBooleanArray9230[var5] = true;
				}
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "vs.ka(" + ')');
		}
	}

	public static void method6253(Class430 arg0, byte arg1) {
		try {
			arg0.anIntArray4387[arg0.anInt4376 - 1] = Class131.aClass407_1502.method4752(arg0.anIntArray4387[arg0.anInt4376 - 1], -2036141784).aBoolean4101 ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "vs.o(" + ')');
		}
	}

	public static void method6254(byte arg0) {
		try {
			client.aClass304_9030.method3003(-450519937);
			Class_ta.method5674((byte) 1);
			Class50.method632(true, (byte) 11);
			Class479.method6012((byte) 125);
			System.gc();
			Class361.aClass_ra3793.ba(2, 0);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "vs.lt(" + ')');
		}
	}
}
