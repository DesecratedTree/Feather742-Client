package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Class12 implements Interface8_Impl1_Impl2 {

	public int anInt10075;

	public int anInt10074;

	public int[] anIntArray10076;

	public static Class61[] aClass61Array10077;

	public int method57() {
		return this.anInt10075 * -26429815 * -917921863;
	}

	public Class12(int arg0, int arg1, int[] arg2) {
		this.anInt10075 = arg0;
		this.anInt10074 = arg1;
		this.anIntArray10076 = arg2;
	}

	public void method52() {
	}

	public int method55() {
		try {
			return this.anInt10074;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "am.i(" + ')');
		}
	}

	public void method53() {
	}

	public Class12(int arg0, int arg1) {
		this(arg0, arg1, new int[arg0 * arg1]);
	}

	public int method61() {
		return this.anInt10074 * 736022019 * -78197589;
	}

	public int method56() {
		return this.anInt10075 * -26429815 * -917921863;
	}

	public int method59() {
		return this.anInt10074 * 736022019 * -78197589;
	}

	public int method60() {
		return this.anInt10074 * 736022019 * -78197589;
	}

	public int method54() {
		try {
			return this.anInt10075;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "am.r(" + ')');
		}
	}

	public int method58() {
		return this.anInt10075 * -26429815 * -917921863;
	}

	public static final void method434(Class430 arg0, int arg1) {
		try {
			boolean var2 = false;
			if (client.aBoolean9198) {
				try {
					Object var3 = Class232.aClass232_2453.method2355(new Object[] { Class284.anInt2928, Class263_Sub2.myPlayer.female == 1, arg0.anIntArray4387[--arg0.anInt4376] }, 522592630);
					if (var3 != null) {
						var2 = (Boolean) var3;
					}
				} catch (Throwable var4) {
				}
			}
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2 ? 1 : 0;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "am.apo(" + ')');
		}
	}

	public static void method435(Class330_Sub46_Sub2 arg0, byte arg1) {
		try {
			Class330_Sub47 var2 = (Class330_Sub47) Class520.aClass471_6016.method5869(539664854);
			if (var2 != null) {
				int var3 = arg0.offset;
				arg0.addInt(var2.anInt7856, 1965508160);
				for (int var4 = 0; var4 < var2.anInt7852; var4++) {
					if (var2.anIntArray7851[var4] == 0) {
						try {
							int var5 = var2.anIntArray7853[var4];
							Field var6;
							int var7;
							if (var5 == 0) {
								var6 = var2.aFieldArray7855[var4];
								var7 = var6.getInt(null);
								arg0.addByte(0, (byte) 89);
								arg0.addInt(var7, 1965508160);
							} else if (var5 == 1) {
								var6 = var2.aFieldArray7855[var4];
								var6.setInt(null, var2.anIntArray7854[var4]);
								arg0.addByte(0, (byte) 47);
							} else if (var5 == 2) {
								var6 = var2.aFieldArray7855[var4];
								var7 = var6.getModifiers();
								arg0.addByte(0, (byte) 1);
								arg0.addInt(var7, 1965508160);
							}
							Method var24;
							if (var5 == 3) {
								var24 = var2.aMethodArray7857[var4];
								byte[][] var25 = var2.aByteArrayArrayArray7858[var4];
								Object[] var8 = new Object[var25.length];
								for (int var9 = 0; var9 < var25.length; var9++) {
									ObjectInputStream var10 = new ObjectInputStream(new ByteArrayInputStream(var25[var9]));
									var8[var9] = var10.readObject();
								}
								Object var26 = var24.invoke(null, var8);
								if (var26 == null) {
									arg0.addByte(0, (byte) 108);
								} else if (var26 instanceof Number) {
									arg0.addByte(1, (byte) 49);
									arg0.method3802(((Number) var26).longValue());
								} else if (var26 instanceof String) {
									arg0.addByte(2, (byte) 127);
									arg0.addString((String) var26, (byte) -58);
								} else {
									arg0.addByte(4, (byte) 16);
								}
							} else if (var5 == 4) {
								var24 = var2.aMethodArray7857[var4];
								var7 = var24.getModifiers();
								arg0.addByte(0, (byte) 68);
								arg0.addInt(var7, 1965508160);
							}
						} catch (ClassNotFoundException var11) {
							arg0.addByte(-10, (byte) 72);
						} catch (InvalidClassException var12) {
							arg0.addByte(-11, (byte) 99);
						} catch (StreamCorruptedException var13) {
							arg0.addByte(-12, (byte) 11);
						} catch (OptionalDataException var14) {
							arg0.addByte(-13, (byte) 39);
						} catch (IllegalAccessException var15) {
							arg0.addByte(-14, (byte) 91);
						} catch (IllegalArgumentException var16) {
							arg0.addByte(-15, (byte) 1);
						} catch (InvocationTargetException var17) {
							arg0.addByte(-16, (byte) 89);
						} catch (SecurityException var18) {
							arg0.addByte(-17, (byte) 26);
						} catch (IOException var19) {
							arg0.addByte(-18, (byte) 90);
						} catch (NullPointerException var20) {
							arg0.addByte(-19, (byte) 78);
						} catch (Exception var21) {
							arg0.addByte(-20, (byte) 19);
						} catch (Throwable var22) {
							arg0.addByte(-21, (byte) 46);
						}
					} else {
						arg0.addByte(var2.anIntArray7851[var4], (byte) 83);
					}
				}
				arg0.method3775(var3, 1246563230);
				var2.method3252(1096719115);
			}
		} catch (RuntimeException var23) {
			throw Class476.method5964(var23, "am.i(" + ')');
		}
	}

	public static void method436(IComponentDefinitions arg0, IComponentDefinitions arg1, int arg2) {
		try {
			Class330_Sub34 var3 = Class238.method2377(OutgoingPacket.SWITCH_ITEM_INTERFACE_PACKET, client.aClass1_9025.aClass488_22, 978508465);
			var3.aClass330_Sub46_Sub2_7729.addShort(arg0.anInt1287, (byte) 81);
			var3.aClass330_Sub46_Sub2_7729.addLEShortA(arg0.anInt1335, 205372277);
			var3.aClass330_Sub46_Sub2_7729.addShortA(arg1.anInt1335, -1051905614);
			var3.aClass330_Sub46_Sub2_7729.addLEShort(arg1.anInt1287, -676872267);
			var3.aClass330_Sub46_Sub2_7729.addLEInt(arg0.anInt1196, -2117284179);
			var3.aClass330_Sub46_Sub2_7729.addInt(arg1.anInt1196, 1965508160);
			client.aClass1_9025.method378(var3, -827529014);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "am.kc(" + ')');
		}
	}

	public static boolean method437(Class_ra arg0, Class330_Sub38 arg1, Class372 arg2, int arg3, int arg4, int arg5) {
		try {
			int var6 = Integer.MAX_VALUE;
			int var7 = Integer.MIN_VALUE;
			int var8 = Integer.MAX_VALUE;
			int var9 = Integer.MIN_VALUE;
			if (arg2.anIntArray3897 != null) {
				var6 = (Class354_Sub1.anInt3511 - Class354_Sub1.anInt3527) * (arg1.anInt7756 + arg2.anInt3898 - Class354_Sub1.anInt3523) / (Class354_Sub1.anInt3514 - Class354_Sub1.anInt3523) + Class354_Sub1.anInt3527;
				var7 = (Class354_Sub1.anInt3511 - Class354_Sub1.anInt3527) * (arg1.anInt7756 + arg2.anInt3870 - Class354_Sub1.anInt3523) / (Class354_Sub1.anInt3514 - Class354_Sub1.anInt3523) + Class354_Sub1.anInt3527;
				var9 = Class354_Sub1.anInt3530 - (arg2.anInt3899 + arg1.anInt7753 - Class354_Sub1.anInt3526) * (Class354_Sub1.anInt3530 - Class354_Sub1.anInt3528) / (Class354_Sub1.anInt3494 - Class354_Sub1.anInt3526);
				var8 = Class354_Sub1.anInt3530 - (Class354_Sub1.anInt3530 - Class354_Sub1.anInt3528) * (arg2.anInt3892 + arg1.anInt7753 - Class354_Sub1.anInt3526) / (Class354_Sub1.anInt3494 - Class354_Sub1.anInt3526);
			}
			Class61 var10 = null;
			int var11 = 0;
			int var12 = 0;
			int var13 = 0;
			int var14 = 0;
			if (arg2.anInt3872 != -1) {
				if (arg1.aBoolean7752 && arg2.anInt3873 != -1) {
					var10 = arg2.method4325(arg0, true, -1705907130);
				} else {
					var10 = arg2.method4325(arg0, false, -2080797751);
				}
				if (var10 != null) {
					var11 = arg1.anInt7754 - (var10.method318() + 1 >> 1);
					if (var11 < var6) {
						var6 = var11;
					}
					var12 = arg1.anInt7754 + (var10.method318() + 1 >> 1);
					if (var12 > var7) {
						var7 = var12;
					}
					var13 = arg1.anInt7750 - (var10.method683() + 1 >> 1);
					if (var13 < var8) {
						var8 = var13;
					}
					var14 = arg1.anInt7750 + (var10.method683() + 1 >> 1);
					if (var14 > var9) {
						var9 = var14;
					}
				}
			}
			Class8 var15 = null;
			int var16 = 0;
			int var17 = 0;
			int var18 = 0;
			int var19 = 0;
			int var20 = 0;
			int var21 = 0;
			int var22 = 0;
			int var23 = 0;
			int var24;
			if (arg2.aString3909 != null) {
				var15 = Buffer.method3816(arg2.anInt3876, 1307075156);
				if (var15 != null) {
					var16 = Class543.aClass524_6254.method6244(arg2.aString3909, null, Class354_Sub1.aStringArray7988, null, 1783245796);
					var17 = arg2.anInt3901 * (Class354_Sub1.anInt3511 - Class354_Sub1.anInt3527) / (Class354_Sub1.anInt3514 - Class354_Sub1.anInt3523) + arg1.anInt7754;
					var18 = arg1.anInt7750 - arg2.anInt3877 * (Class354_Sub1.anInt3530 - Class354_Sub1.anInt3528) / (Class354_Sub1.anInt3494 - Class354_Sub1.anInt3526);
					if (var10 == null) {
						var18 -= var15.method415() * var16 / 2;
					} else {
						var18 -= (var10.method683() >> 1) + var15.method420() * var16;
					}
					for (var24 = 0; var24 < var16; var24++) {
						String var25 = Class354_Sub1.aStringArray7988[var24];
						if (var24 < var16 - 1) {
							var25 = var25.substring(0, var25.length() - 4);
						}
						int var26 = var15.method417(var25);
						if (var26 > var19) {
							var19 = var26;
						}
					}
					var20 = arg3 + (var17 - var19 / 2);
					if (var20 < var6) {
						var6 = var20;
					}
					var21 = arg3 + var19 / 2 + var17;
					if (var21 > var7) {
						var7 = var21;
					}
					var22 = arg4 + var18;
					if (var22 < var8) {
						var8 = var22;
					}
					var23 = var18 + var16 * var15.method420() + arg4;
					if (var23 > var9) {
						var9 = var23;
					}
				}
			}
			if (var7 < Class354_Sub1.anInt3527 || var6 > Class354_Sub1.anInt3511 || var9 < Class354_Sub1.anInt3528 || var8 > Class354_Sub1.anInt3530) {
				return true;
			}
			Class354_Sub1.method4097(arg0, arg1, arg2);
			if (var10 != null) {
				if (Class448.anInt5556 > 0 && (Class354_Sub1.anInt7987 != -1 && Class354_Sub1.anInt7987 == arg1.anInt7755 || Class354_Sub1.anInt7980 != -1 && Class354_Sub1.anInt7980 == arg2.anInt3911)) {
					if (Class101.anInt6456 > 50) {
						var24 = 200 - Class101.anInt6456 * 2;
					} else {
						var24 = Class101.anInt6456 * 2;
					}
					int var29 = var24 << 24 | 0xFFFF00;
					arg0.method4793(arg1.anInt7754, arg1.anInt7750, var10.method681() / 2 + 7, var29, -1750445026);
					arg0.method4793(arg1.anInt7754, arg1.anInt7750, var10.method681() / 2 + 5, var29, -1974497261);
					arg0.method4793(arg1.anInt7754, arg1.anInt7750, var10.method681() / 2 + 3, var29, -1063125568);
					arg0.method4793(arg1.anInt7754, arg1.anInt7750, var10.method681() / 2 + 1, var29, 188638214);
					arg0.method4793(arg1.anInt7754, arg1.anInt7750, var10.method681() / 2, var29, 164670799);
				}
				var10.method687(arg1.anInt7754 - (var10.method318() >> 1), arg1.anInt7750 - (var10.method683() >> 1));
			}
			if (arg2.aString3909 != null && var15 != null) {
				Class232.method2359(arg0, arg1, arg2, var16, var17, var18, var19, var15, (byte) -12);
			}
			if (arg2.anInt3872 != -1 || arg2.aString3909 != null) {
				Class330_Sub7 var28 = new Class330_Sub7(arg1);
				var28.anInt7546 = var11;
				var28.anInt7553 = var12;
				var28.anInt7548 = var13;
				var28.anInt7545 = var14;
				var28.anInt7549 = var20;
				var28.anInt7550 = var21;
				var28.anInt7551 = var22;
				var28.anInt7547 = var23;
				Class171.aClass471_1730.method5878(var28, (short) 8192);
			}
			return false;
		} catch (RuntimeException var27) {
			throw Class476.method5964(var27, "am.cy(" + ')');
		}
	}
}
