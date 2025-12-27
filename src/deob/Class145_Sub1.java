package deob;

import java.util.Iterator;

public class Class145_Sub1 extends Class145 {

	public int anInt7264 = 0;

	public static int anInt7266;

	public static IndexTable aClass280_7265;

	public Class145_Sub1(Interface4 arg0) {
		super(Class132.aClass132_1503, arg0);
	}

	public void method1727(Buffer arg0, int arg1, int arg2) {
		try {
			int var4 = arg0.offset;
			int var5 = arg0.readUnsignedByte(1317483128);
			this.method1673(Class129.method1555(var5 & 0x1, 2072699582), (byte) 55);
			Class146 var6 = Class96.method1180(var5 >> 1 & 0x3, 308874360);
			if (this.aClass146_1603 != var6) {
				try {
					this.method1696(var6, true, (byte) -118);
				} catch (Exception_Sub4 var18) {
					var18.printStackTrace();
				}
			}
			Class136 var7 = Class386.method4430(var5 >> 3 & 0x3, (byte) 69);
			if (this.aClass136_1591 != var7) {
				try {
					this.method1674(var7, true, 1046104551);
				} catch (Exception_Sub4 var17) {
					var17.printStackTrace();
				}
			}
			if ((var5 >> 7 & 0x1) == 1) {
				int var8 = arg0.readUnsignedShort(717579802);
				if ((var8 >> Class129.aClass129_1481.anInt1486 & 0x1) == 1) {
					this.aClass260_1589.method2552(arg0);
				}
				if ((var8 >> Class129.aClass129_1480.anInt1486 & 0x1) == 1) {
					this.aClass260_1579.method2552(arg0);
				}
				if ((var8 >> Class129.aClass129_1483.anInt1486 & 0x1) == 1) {
					this.aClass260_1592.method2552(arg0);
				}
				if ((var8 >> Class129.aClass129_1487.anInt1486 & 0x1) == 1) {
					this.aClass260_1593.method2552(arg0);
				}
				if ((var8 >> Class129.aClass129_1479.anInt1486 & 0x1) == 1) {
					this.aFloat1598 = arg0.method3760(-1279245802);
					this.aFloat1599 = arg0.method3760(-1279245802);
				}
				if ((var8 >> Class129.aClass129_1484.anInt1486 & 0x1) == 1) {
					this.aFloat1587 = arg0.method3760(-1279245802);
					this.aFloat1601 = arg0.method3760(-1279245802);
				}
				if ((var8 >> Class129.aClass129_1485.anInt1486 & 0x1) == 1) {
					this.aClass133_1580 = Class330_Sub5.method3273(arg0.readUnsignedByte(1292420589), 1803946782);
				}
				if ((var8 >> Class129.aClass129_1488.anInt1486 & 0x1) == 1) {
					this.anInt1590 = arg0.readUnsignedTriByte(-1401356047);
					arg0.readUnsignedByte(1183260959);
				}
				int var9;
				if ((var8 >> Class129.aClass129_1482.anInt1486 & 0x1) == 1) {
					var9 = arg0.readUnsignedByte(202100840);
					this.aBoolean1602 = (var9 & 0x1) == 1;
					this.aBoolean1583 = (var9 & 0x2) == 2;
				}
				if ((var8 >> Class129.aClass129_1494.anInt1486 & 0x1) == 1) {
					var9 = arg0.readUnsignedByte(-200578333);
					for (int var10 = 0; var10 < var9; var10++) {
						int var11 = arg0.readUnsignedByte(-196566626);
						int var12 = arg0.readUnsignedByte(1928000123);
						if (var11 == 0) {
							this.method1717(var12, 177236322);
						} else {
							Class137 var13 = Class383.method4409(arg0.readUnsignedByte(1153037376), (byte) 94);
							boolean var14 = true;
							Iterator var15 = this.aClass497_1606.iterator();
							while (var15.hasNext()) {
								Class330_Sub36_Sub15 var16 = (Class330_Sub36_Sub15) var15.next();
								if (var12 == var16.anInt9720) {
									var16.method3496(arg0, 1850389994);
									var14 = false;
									break;
								}
							}
							if (var14) {
								this.method1702(Class153.method1796(var12, var13, arg0, 2023911982), 1403027746);
							}
						}
					}
				}
				if ((var8 >> Class129.aClass129_1489.anInt1486 & 0x1) == 1) {
					this.anInt1604 = arg0.readUnsignedShort(963581451);
					this.aFloat1605 = arg0.method3760(-1279245802);
				}
				if ((var8 >> Class129.aClass129_1490.anInt1486 & 0x1) == 1) {
					this.aClass144_1586 = Preferences.method2922(arg0.readUnsignedByte(1852968428), 1612656512);
				}
				if ((var8 >> Class129.aClass129_1491.anInt1486 & 0x1) == 1) {
					this.aClass260_1594.method2552(arg0);
					this.aClass260_1595.method2552(arg0);
					this.aFloat1596 = arg0.method3760(-1279245802);
					this.aFloat1597 = arg0.method3760(-1279245802);
				}
				if ((var8 >> Class129.aClass129_1492.anInt1486 & 0x1) == 1) {
					arg0.method3760(-1279245802);
				}
				if ((var8 >> Class129.aClass129_1493.anInt1486 & 0x1) == 1) {
					this.aFloat1588 = arg0.method3760(-1279245802);
				}
			}
			if (this.aClass475_1582 != null && (var5 >> 5 & 0x1) == 1) {
				this.aClass475_1582.method5925(arg0, 1768937742);
			}
			if (this.aClass166_1600 != null && (var5 >> 6 & 0x1) == 1) {
				this.aClass166_1600.method1974(arg0, (short) 780);
			}
			if (arg0.offset - var4 != arg1) {
				throw new RuntimeException(arg0.offset - var4 + "," + arg1);
			}
		} catch (RuntimeException var19) {
			throw Class476.method5964(var19, "aae.fa(" + ')');
		}
	}

	public int method1728(int arg0) {
		try {
			this.anInt7264++;
			if (this.anInt7264 == 126) {
				this.anInt7264 = 0;
			}
			return this.anInt7264;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aae.fj(" + ')');
		}
	}

	public static final void method1729(Class430 arg0, byte arg1) {
		try {
			String var2;
			if (Class263_Sub2.myPlayer == null || Class263_Sub2.myPlayer.displayName == null) {
				var2 = "";
			} else {
				var2 = Class263_Sub2.myPlayer.method5460(false, -1136046573);
			}
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var2;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aae.act(" + ')');
		}
	}
}
