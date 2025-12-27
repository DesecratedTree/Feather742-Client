package deob;

import java.util.Iterator;

public abstract class Class145 {

	public static float aFloat1584 = Float.POSITIVE_INFINITY;

	public Class260 aClass260_1589 = new Class260();

	public Class260 aClass260_1579 = new Class260();

	public Class260 aClass260_1592 = new Class260();

	public Class260 aClass260_1593 = new Class260();

	public Class260 aClass260_1594 = new Class260();

	public Class260 aClass260_1595 = new Class260();

	public int anInt1604 = 0;

	public float aFloat1605 = 1.0F;

	public Class497 aClass497_1606 = new Class497(8);

	public Class132 aClass132_1581;

	public Interface4 anInterface4_1585;

	public float aFloat1587;

	public float aFloat1588;

	public float aFloat1596;

	public float aFloat1597;

	public float aFloat1598;

	public float aFloat1599;

	public float aFloat1601;

	public int anInt1590;

	public Class130 aClass130_1578;

	public Class133 aClass133_1580;

	public Class136 aClass136_1591;

	public Class144 aClass144_1586;

	public Class146 aClass146_1603;

	public Class166 aClass166_1600;

	public Class475 aClass475_1582;

	public boolean aBoolean1583;

	public boolean aBoolean1602;

	public Class145(Class132 arg0, Interface4 arg1) {
		this.aClass132_1581 = arg0;
		this.anInterface4_1585 = arg1;
		this.method1714(true, -1876289556);
	}

	public void method1672(boolean arg0, float arg1, Class260 arg2, Class244 arg3, Class260 arg4, Class260 arg5, int arg6) {
		try {
			if (Class144.aClass144_1572 == this.aClass144_1586) {
				Class395.method4648(arg1, arg2, arg4, arg5, arg0 ? this.aClass260_1593 : this.aClass260_1592, arg0 ? this.aClass260_1579 : this.aClass260_1589, (float) this.anInt1604, this.aFloat1605, (byte) 52);
			} else if (Class144.aClass144_1576 == this.aClass144_1586) {
				Class373.method4336(arg1, arg2, arg3, arg4, arg5, arg0 ? this.aClass260_1593 : this.aClass260_1592, arg0 ? this.aClass260_1579 : this.aClass260_1589, (float) this.anInt1604, this.aFloat1605, -1906950552);
			} else if (Class144.aClass144_1574 == this.aClass144_1586) {
				Class342.method3990(arg1, arg2, arg3, arg4, arg5, arg0 ? this.aClass260_1595 : this.aClass260_1594, arg0 ? this.aFloat1597 : this.aFloat1596, -1698325368);
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "fw.i(" + ')');
		}
	}

	public void method1673(Class130 arg0, byte arg1) {
		try {
			this.aClass130_1578 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "fw.p(" + ')');
		}
	}

	public Class166 method1674(Class136 arg0, boolean arg1, int arg2) throws Exception_Sub4 {
		try {
			if (this.aClass130_1578 == Class130.aClass130_1497 && !arg1) {
				throw new Exception_Sub4();
			}
			this.aClass136_1591 = arg0;
			if (Class136.aClass136_1523 == arg0) {
				this.aClass166_1600 = new Class166_Sub2(this);
			} else if (arg0 == Class136.aClass136_1524) {
				this.aClass166_1600 = new Class166_Sub1(this);
			} else if (Class136.aClass136_1525 == arg0) {
				this.aClass166_1600 = new Class166_Sub3_Sub1(this);
			} else if (Class136.aClass136_1526 == arg0) {
				this.aClass166_1600 = new Class166_Sub3_Sub2(this);
			}
			return this.aClass166_1600;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fw.s(" + ')');
		}
	}

	public void method1675(float arg0, int arg1) throws Exception_Sub4 {
		try {
			if (!this.method1710((byte) 31)) {
				throw new Exception_Sub4();
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "fw.z(" + ')');
		}
	}

	public void method1676(Class260 arg0, int arg1) throws Exception_Sub4 {
		try {
			if (!this.method1710((byte) 19) || !this.aClass144_1586.aBoolean1573) {
				throw new Exception_Sub4();
			}
			this.aClass260_1592.method2582(arg0);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "fw.l(" + ')');
		}
	}

	public void method1677(float arg0, Class307 arg1, int[][][] arg2, int arg3) {
		try {
			if (this.aClass475_1582 != null) {
				this.aClass475_1582.method5923(arg0, -2006090027);
			}
			if (this.aClass166_1600 != null) {
				this.aClass166_1600.method1966(arg0, arg1, arg2, 50036488);
			}
			Iterator var5 = this.aClass497_1606.iterator();
			while (var5.hasNext()) {
				Class330_Sub36_Sub15 var6 = (Class330_Sub36_Sub15) var5.next();
				var6.method3502(arg0, (byte) 8);
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "fw.j(" + ')');
		}
	}

	public void method1678(Class260 arg0, byte arg1) throws Exception_Sub4 {
		try {
			if (!this.method1710((byte) 49) || !this.aClass144_1586.aBoolean1573) {
				throw new Exception_Sub4();
			}
			this.aClass260_1579.method2582(arg0);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "fw.q(" + ')');
		}
	}

	public void method1679(Class260 arg0, float arg1, int arg2) throws Exception_Sub4 {
		try {
			if (!this.method1710((byte) 43) || this.aClass144_1586.aBoolean1573) {
				throw new Exception_Sub4();
			}
			this.aClass260_1594.method2582(arg0);
			this.aClass260_1595.method2582(arg0);
			this.aFloat1596 = arg1;
			this.aFloat1597 = arg1;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fw.u(" + ')');
		}
	}

	public void method1680(Class260 arg0, float arg1, int arg2) throws Exception_Sub4 {
		try {
			if (!this.method1710((byte) -46) || this.aClass144_1586.aBoolean1573) {
				throw new Exception_Sub4();
			}
			this.aClass260_1594.method2582(arg0);
			this.aFloat1596 = arg1;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fw.x(" + ')');
		}
	}

	public void method1681(Class260 arg0, float arg1, short arg2) throws Exception_Sub4 {
		try {
			if (!this.method1710((byte) -32) || this.aClass144_1586.aBoolean1573) {
				throw new Exception_Sub4();
			}
			this.aClass260_1595.method2582(arg0);
			this.aFloat1597 = arg1;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fw.g(" + ')');
		}
	}

	public void method1682(float arg0, float arg1, byte arg2) throws Exception_Sub4 {
		try {
			if (!this.method1710((byte) -53)) {
				throw new Exception_Sub4();
			}
			this.aFloat1598 = arg0;
			this.aFloat1599 = arg1;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fw.d(" + ')');
		}
	}

	public void method1683(int arg0, float arg1, int arg2) throws Exception_Sub4 {
		try {
			if (!this.method1710((byte) 47) || !this.aClass144_1586.aBoolean1573) {
				throw new Exception_Sub4();
			}
			this.anInt1604 = arg0;
			this.aFloat1605 = arg1;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fw.e(" + ')');
		}
	}

	public void method1684(Class260 arg0, byte arg1) throws Exception_Sub4 {
		try {
			if (!this.method1710((byte) 54) || !this.aClass144_1586.aBoolean1573) {
				throw new Exception_Sub4();
			}
			this.aClass260_1593.method2582(arg0);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "fw.b(" + ')');
		}
	}

	public Class330_Sub36_Sub15 method1685(int arg0, int arg1) {
		try {
			return (Class330_Sub36_Sub15) this.aClass497_1606.method6094((long) arg0);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "fw.h(" + ')');
		}
	}

	public void method1686(int arg0) {
		try {
			this.aClass497_1606.method6100(65280);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fw.y(" + ')');
		}
	}

	public boolean method1687(byte arg0) {
		try {
			if (this.aClass475_1582 == null || this.aClass166_1600 == null) {
				return false;
			} else if (this.aClass475_1582.method5924(-821839442)) {
				return this.aClass166_1600.method1985(-1085885033);
			} else {
				return false;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fw.v(" + ')');
		}
	}

	public void method1688(Class138 arg0, Class247 arg1, Class249 arg2, int arg3, int arg4, int arg5) {
		try {
			if (this.aClass475_1582 != null && this.aClass166_1600 != null) {
				this.aClass475_1582.method5922(arg0, arg1, arg3, arg4, 880244218);
				this.aClass166_1600.method1970(arg0, arg3, arg4, (byte) 1);
				if (this.aClass133_1580 == Class133.aClass133_1508) {
					arg2.method2490(this.aFloat1598, this.aFloat1599, this.aFloat1587, this.aFloat1601);
				} else {
					arg2.method2491(this.aFloat1598, this.aFloat1599, (float) this.anInt1590);
				}
				Iterator var7 = this.aClass497_1606.iterator();
				while (var7.hasNext()) {
					Class330_Sub36_Sub15 var8 = (Class330_Sub36_Sub15) var7.next();
					var8.method3495(arg0, arg1, arg2, 456307467);
				}
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "fw.ay(" + ')');
		}
	}

	public Class130 method1689(int arg0) {
		try {
			return this.aClass130_1578;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fw.ac(" + ')');
		}
	}

	public void method1690(float arg0, float arg1, int arg2) throws Exception_Sub4 {
		try {
			if (!this.method1710((byte) -88)) {
				throw new Exception_Sub4();
			}
			this.aFloat1587 = arg0;
			this.aFloat1601 = arg1;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fw.c(" + ')');
		}
	}

	public Interface4 method1691(int arg0) {
		try {
			return this.anInterface4_1585;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fw.aw(" + ')');
		}
	}

	public void method1692(Class144 arg0, int arg1) throws Exception_Sub4 {
		try {
			if (!this.method1710((byte) -24)) {
				throw new Exception_Sub4();
			}
			this.aClass144_1586 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "fw.n(" + ')');
		}
	}

	public Class136 method1693(int arg0) {
		try {
			return this.aClass136_1591;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fw.ai(" + ')');
		}
	}

	public Class330_Sub28 method1694(int arg0) {
		try {
			return this.aClass166_1600 == null ? null : this.aClass166_1600.method1969((byte) 39);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fw.ax(" + ')');
		}
	}

	public Class260 method1695(byte arg0) {
		try {
			return this.aClass475_1582 == null ? null : this.aClass475_1582.method5932(-491773170);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fw.aj(" + ')');
		}
	}

	public Class475 method1696(Class146 arg0, boolean arg1, byte arg2) throws Exception_Sub4 {
		try {
			if (Class130.aClass130_1497 == this.aClass130_1578 && !arg1) {
				throw new Exception_Sub4();
			}
			this.aClass146_1603 = arg0;
			if (Class146.aClass146_1611 == arg0) {
				this.aClass475_1582 = new Class475_Sub1(this);
			} else if (arg0 == Class146.aClass146_1610) {
				this.aClass475_1582 = new Class475_Sub3(this);
			} else if (arg0 == Class146.aClass146_1607) {
				this.aClass475_1582 = new Class475_Sub4(this);
			} else if (arg0 == Class146.aClass146_1609) {
				this.aClass475_1582 = new Class475_Sub2_Sub2(this);
			} else if (arg0 == Class146.aClass146_1608) {
				this.aClass475_1582 = new Class475_Sub2_Sub1(this);
			} else if (arg0 == Class146.aClass146_1612) {
				this.aClass475_1582 = new Class475_Sub5(this);
			}
			return this.aClass475_1582;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fw.o(" + ')');
		}
	}

	public boolean method1697(int arg0) {
		try {
			return this.aBoolean1602;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fw.ar(" + ')');
		}
	}

	public Class260 method1698(int arg0) {
		try {
			return this.aClass260_1592;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fw.aa(" + ')');
		}
	}

	public Class260 method1699(int arg0) {
		try {
			return this.aClass260_1593;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fw.ab(" + ')');
		}
	}

	public float method1700(byte arg0) {
		try {
			return this.aFloat1588;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fw.ak(" + ')');
		}
	}

	public Class260 method1701(short arg0) {
		try {
			return this.aClass260_1589;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fw.ag(" + ')');
		}
	}

	public void method1702(Class330_Sub36_Sub15 arg0, int arg1) {
		try {
			this.aClass497_1606.method6097(arg0, (long) arg0.anInt9720);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "fw.m(" + ')');
		}
	}

	public float method1703(int arg0) {
		try {
			return this.aFloat1598;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fw.ah(" + ')');
		}
	}

	public float method1704(int arg0) {
		try {
			return this.aFloat1599;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fw.av(" + ')');
		}
	}

	public Class260 method1705(int arg0) {
		try {
			return this.aClass166_1600 == null ? null : this.aClass166_1600.method1968((byte) -1);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fw.as(" + ')');
		}
	}

	public boolean method1706(int arg0) {
		try {
			return this.aBoolean1583;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fw.am(" + ')');
		}
	}

	public Class166 method1707(int arg0) {
		try {
			return this.aClass166_1600;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fw.al(" + ')');
		}
	}

	public Class260 method1708(int arg0) {
		try {
			return this.aClass260_1579;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fw.az(" + ')');
		}
	}

	public void method1709(boolean arg0, boolean arg1, byte arg2) throws Exception_Sub4 {
		try {
			if (!this.method1710((byte) 6)) {
				throw new Exception_Sub4();
			}
			this.aBoolean1602 = arg0;
			this.aBoolean1583 = arg1;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fw.a(" + ')');
		}
	}

	public boolean method1710(byte arg0) {
		try {
			if (this.aClass132_1581 == Class132.aClass132_1504 && this.aClass130_1578 == Class130.aClass130_1497) {
				return true;
			} else {
				return Class132.aClass132_1503 == this.aClass132_1581 && this.aClass130_1578 == Class130.aClass130_1495;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fw.f(" + ')');
		}
	}

	public float method1711(byte arg0) {
		try {
			Class260 var2 = this.method1705(-1961940011);
			Class260 var3 = this.method1695((byte) 3);
			float var4 = 0.0F;
			if (var2 != null && var3 != null) {
				Class260 var5 = Class260.method2561(var3, var2);
				float var6 = (float) Math.sqrt((double) (var5.aFloat2711 * var5.aFloat2711 + var5.aFloat2716 * var5.aFloat2716));
				var4 = (float) Math.atan2((double) -var5.aFloat2715, (double) var6);
				var2.method2550();
				var3.method2550();
			}
			return var4;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "fw.ad(" + ')');
		}
	}

	public Class244 method1712(int arg0) {
		try {
			Class244 var2 = Class244.method2428();
			var2.method2420(this.method1713(1933043069), this.method1711((byte) 2), this.method1720((short) 941));
			return var2;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fw.aq(" + ')');
		}
	}

	public float method1713(int arg0) {
		try {
			Class260 var2 = this.method1705(1309596061);
			Class260 var3 = this.method1695((byte) 3);
			float var4 = 0.0F;
			if (var2 != null && var3 != null) {
				Class260 var5 = Class260.method2561(var2, var3);
				var5.aFloat2715 = 0.0F;
				var4 = (float) Math.atan2((double) var5.aFloat2716, (double) var5.aFloat2711);
				var2.method2550();
				var3.method2550();
			}
			return (float) (3.141592653589793D - (double) var4);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "fw.an(" + ')');
		}
	}

	public void method1714(boolean arg0, int arg1) {
		try {
			this.aClass133_1580 = Class133.aClass133_1508;
			this.aClass146_1603 = null;
			this.aClass475_1582 = null;
			this.aClass136_1591 = null;
			this.aClass166_1600 = null;
			if (this.aClass132_1581 != Class132.aClass132_1504 && arg0) {
				this.aClass130_1578 = Class130.aClass130_1495;
			} else {
				this.aClass130_1578 = Class130.aClass130_1497;
			}
			this.aClass144_1586 = Class144.aClass144_1576;
			this.aClass260_1589.method2553(100.0F, 100.0F, 100.0F);
			this.aClass260_1579.method2553(100.0F, 100.0F, 100.0F);
			this.aFloat1588 = 0.05F;
			this.aClass260_1592.method2553(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
			this.aClass260_1593.method2553(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
			this.aClass260_1594.method2553(1.0F, 1.0F, 1.0F);
			this.aClass260_1595.method2553(1.0F, 1.0F, 1.0F);
			this.aFloat1596 = 1.1F;
			this.aFloat1597 = 1.1F;
			this.aFloat1598 = 50.0F;
			this.aFloat1599 = 10000.0F;
			this.aFloat1601 = 1.5707964F;
			this.aFloat1587 = 1.5707964F;
			this.anInt1590 = 5;
			this.aBoolean1602 = true;
			this.aBoolean1583 = true;
			this.anInt1604 = 0;
			this.aFloat1605 = 1.0F;
			this.aClass497_1606.method6100(65280);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "fw.r(" + ')');
		}
	}

	public Class475 method1715(int arg0) {
		try {
			return this.aClass475_1582;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fw.at(" + ')');
		}
	}

	public void method1716(Class260 arg0, int arg1) throws Exception_Sub4 {
		try {
			if (!this.method1710((byte) -50) || !this.aClass144_1586.aBoolean1573) {
				throw new Exception_Sub4();
			}
			this.aClass260_1589.method2582(arg0);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "fw.k(" + ')');
		}
	}

	public void method1717(int arg0, int arg1) {
		try {
			Class330_Sub36_Sub15 var3 = (Class330_Sub36_Sub15) this.aClass497_1606.method6094((long) arg0);
			if (var3 != null) {
				var3.method3252(-2078176685);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "fw.t(" + ')');
		}
	}

	public Class146 method1718(int arg0) {
		try {
			return this.aClass146_1603;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fw.ap(" + ')');
		}
	}

	public void method1719(float arg0, int arg1) throws Exception_Sub4 {
		try {
			if (!this.method1710((byte) -57)) {
				throw new Exception_Sub4();
			}
			this.aFloat1588 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "fw.w(" + ')');
		}
	}

	public float method1720(short arg0) {
		try {
			return 0.0F;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fw.af(" + ')');
		}
	}

	public static final void method1721(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 11;
			Class195[] var2 = Class457.method5665(-1882618819);
			Class211[] var3 = Class7.method412((byte) -79);
			Class_na.method3518(var2[arg0.anIntArray4387[arg0.anInt4376]], var3[arg0.anIntArray4387[arg0.anInt4376 + 1]], arg0.anIntArray4387[arg0.anInt4376 + 2], arg0.anIntArray4387[arg0.anInt4376 + 3], arg0.anIntArray4387[arg0.anInt4376 + 4], arg0.anIntArray4387[arg0.anInt4376 + 5], arg0.anIntArray4387[arg0.anInt4376 + 6], arg0.anIntArray4387[arg0.anInt4376 + 7], arg0.anIntArray4387[arg0.anInt4376 + 8], arg0.anIntArray4387[arg0.anInt4376 + 9], arg0.anIntArray4387[arg0.anInt4376 + 10], 1523385482);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "fw.tm(" + ')');
		}
	}

	public static final void method1722(Class430 arg0, short arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class396.method4655(var2, 1841589740);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fw.ajb(" + ')');
		}
	}

	public static final void method1723(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub9_7899.method5767(1840616943) && Class361.aClass_ra3793.ac() ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fw.apd(" + ')');
		}
	}

	public static final void method1724(Class430 arg0, byte arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = arg0.aClass432_Sub1_Sub2_Sub1_4390.method5363(-1869787685);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fw.arm(" + ')');
		}
	}

	public static int method1725(CharSequence arg0, CharSequence arg1, Class454 arg2, int arg3) {
		try {
			int var4 = arg0.length();
			int var5 = arg1.length();
			int var6 = 0;
			int var7 = 0;
			char var8 = 0;
			char var9 = 0;
			while (var6 - var8 < var4 || var7 - var9 < var5) {
				if (var6 - var8 >= var4) {
					return -1;
				}
				if (var7 - var9 >= var5) {
					return 1;
				}
				char var10;
				boolean var12;
				if (var8 == 0) {
					var10 = arg0.charAt(var6++);
				} else {
					var10 = var8;
					var12 = false;
				}
				char var11;
				if (var9 == 0) {
					var11 = arg1.charAt(var7++);
				} else {
					var11 = var9;
					var12 = false;
				}
				var8 = Class359.method4240(var10, 709416512);
				var9 = Class359.method4240(var11, -884728575);
				var10 = Class424.method5305(var10, arg2, (byte) 71);
				var11 = Class424.method5305(var11, arg2, (byte) 26);
				if (var10 != var11 && Character.toUpperCase(var10) != Character.toUpperCase(var11)) {
					var10 = Character.toLowerCase(var10);
					var11 = Character.toLowerCase(var11);
					if (var11 != var10) {
						return Class330_Sub9.method3285(var10, arg2, 896185717) - Class330_Sub9.method3285(var11, arg2, 896185717);
					}
				}
			}
			if (arg3 >= -336792257) {
			}
			int var16 = Math.min(var4, var5);
			char var13;
			int var17;
			for (var17 = 0; var17 < var16; var17++) {
				if (Class454.aClass454_6830 == arg2) {
					var6 = var4 - 1 - var17;
					var7 = var5 - 1 - var17;
				} else {
					var7 = var17;
					var6 = var17;
				}
				char var18 = arg0.charAt(var6);
				var13 = arg1.charAt(var7);
				if (var13 != var18 && Character.toUpperCase(var18) != Character.toUpperCase(var13)) {
					var18 = Character.toLowerCase(var18);
					var13 = Character.toLowerCase(var13);
					if (var18 != var13) {
						return Class330_Sub9.method3285(var18, arg2, 896185717) - Class330_Sub9.method3285(var13, arg2, 896185717);
					}
				}
			}
			var17 = var4 - var5;
			if (var17 != 0) {
				return var17;
			}
			for (int var19 = 0; var19 < var16; var19++) {
				var13 = arg0.charAt(var19);
				char var14 = arg1.charAt(var19);
				if (var13 != var14) {
					return Class330_Sub9.method3285(var13, arg2, 896185717) - Class330_Sub9.method3285(var14, arg2, 896185717);
				}
			}
			return 0;
		} catch (RuntimeException var15) {
			throw Class476.method5964(var15, "fw.r(" + ')');
		}
	}

	public static final void method1726(Class330_Sub48 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, short arg10) {
		try {
			if (Class397_Sub1.method4681(arg1, null, 1346530658)) {
				if (arg0 == null || arg0.method3831((byte) -1)) {
					Class120 var11 = Class3.aClass120Array56[arg1];
					client.method3917(var11, var11.method1442((byte) 4), -1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
				} else {
					Class75.method854(arg0, true, false, 508568198);
				}
			}
		} catch (RuntimeException var12) {
			throw Class476.method5964(var12, "fw.ld(" + ')');
		}
	}
}
