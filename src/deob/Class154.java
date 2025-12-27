package deob;

public class Class154 {

	public static byte aByte1639 = 127;

	public static byte aByte1646 = -1;

	public static byte aByte1660 = 125;

	public static byte aByte1661 = 126;

	public static byte aByte1663 = 0;

	public static int anInt1664 = 1;

	public int anInt1643 = 0;

	public String aString1640 = null;

	public int anInt1641 = 0;

	public int anInt1653 = -1;

	public int anInt1649 = -1;

	public byte aByte1635;

	public byte aByte1638;

	public byte aByte1644;

	public byte aByte1645;

	public int anInt1647;

	public int anInt1655;

	public long aLong1648;

	public Class497 aClass497_1659;

	public boolean aBoolean1637;

	public boolean aBoolean1642;

	public boolean aBoolean1662;

	public byte[] aByteArray1654;

	public int[] anIntArray1650;

	public int[] anIntArray1651;

	public int[] anIntArray1652;

	public long[] aLongArray1636;

	public long[] aLongArray1656;

	public String[] aStringArray1657;

	public String[] aStringArray1658;

	public Class154(Buffer arg0) {
		this.method1811(arg0, 527769308);
	}

	public void method1797(int arg0, byte arg1) {
		try {
			this.anInt1655--;
			if (this.anInt1655 == 0) {
				this.aLongArray1656 = null;
				this.aStringArray1658 = null;
			} else {
				if (this.aLongArray1656 != null) {
					Class453.method5639(this.aLongArray1656, arg0 + 1, this.aLongArray1656, arg0, this.anInt1655 - arg0);
				}
				if (this.aStringArray1658 != null) {
					Class453.method5641(this.aStringArray1658, arg0 + 1, this.aStringArray1658, arg0, this.anInt1655 - arg0);
				}
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "gg.q(" + ')');
		}
	}

	public void method1798(int arg0, int arg1) {
		try {
			if (this.aBoolean1662) {
				if (this.aLongArray1656 == null) {
					this.aLongArray1656 = new long[arg0];
				} else {
					Class453.method5639(this.aLongArray1656, 0, this.aLongArray1656 = new long[arg0], 0, this.anInt1655);
				}
			}
			if (this.aBoolean1637) {
				if (this.aStringArray1658 == null) {
					this.aStringArray1658 = new String[arg0];
				} else {
					Class453.method5641(this.aStringArray1658, 0, this.aStringArray1658 = new String[arg0], 0, this.anInt1655);
				}
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "gg.j(" + ')');
		}
	}

	public int method1799(String arg0, int arg1) {
		try {
			if (arg0 == null || arg0.length() == 0) {
				return -1;
			}
			for (int var3 = 0; var3 < this.anInt1647; var3++) {
				if (this.aStringArray1657[var3].equals(arg0)) {
					return var3;
				}
			}
			return -1;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "gg.i(" + ')');
		}
	}

	public Integer method1800(int arg0, int arg1, int arg2, byte arg3) {
		try {
			if (this.aClass497_1659 == null) {
				return null;
			}
			Class330 var5 = this.aClass497_1659.method6094((long) arg0);
			if (var5 != null && var5 instanceof Class330_Sub23) {
				int var6 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
				return Integer.valueOf((((Class330_Sub23) var5).anInt7693 & var6) >>> arg1);
			} else {
				return null;
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "gg.s(" + ')');
		}
	}

	public Long method1801(int arg0, int arg1) {
		try {
			if (this.aClass497_1659 == null) {
				return null;
			} else {
				Class330 var3 = this.aClass497_1659.method6094((long) arg0);
				return var3 != null && var3 instanceof Class330_Sub22 ? Long.valueOf(((Class330_Sub22) var3).aLong7692) : null;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "gg.f(" + ')');
		}
	}

	public int[] method1802(int arg0) {
		try {
			if (this.anIntArray1650 == null) {
				String[] var2 = new String[this.anInt1647];
				this.anIntArray1650 = new int[this.anInt1647];
				int var3 = 0;
				while (var3 < this.anInt1647) {
					var2[var3] = this.aStringArray1657[var3];
					this.anIntArray1650[var3] = var3++;
				}
				Class105.method1308(var2, this.anIntArray1650, -345551316);
			}
			return this.anIntArray1650;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "gg.w(" + ')');
		}
	}

	public void method1803(long arg0, String arg1, int arg2, int arg3) {
		try {
			if (arg1 != null && arg1.length() == 0) {
				arg1 = null;
			}
			if (this.aBoolean1662 != arg0 > 0L) {
				throw new RuntimeException("");
			} else if ((arg1 != null) == this.aBoolean1637) {
				if (arg0 > 0L && (this.aLongArray1636 == null || this.anInt1647 >= this.aLongArray1636.length) || arg1 != null && (this.aStringArray1657 == null || this.anInt1647 >= this.aStringArray1657.length)) {
					this.method1812(this.anInt1647 + 5, -1618544187);
				}
				if (this.aLongArray1636 != null) {
					this.aLongArray1636[this.anInt1647] = arg0;
				}
				if (this.aStringArray1657 != null) {
					this.aStringArray1657[this.anInt1647] = arg1;
				}
				if (this.anInt1653 == -1) {
					this.anInt1653 = this.anInt1647;
					this.aByteArray1654[this.anInt1647] = 126;
				} else {
					this.aByteArray1654[this.anInt1647] = 0;
				}
				this.anIntArray1651[this.anInt1647] = 0;
				this.anIntArray1652[this.anInt1647] = arg2;
				this.anInt1647++;
				this.anIntArray1650 = null;
			} else {
				throw new RuntimeException("");
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "gg.n(" + ')');
		}
	}

	public void method1804(int arg0, byte arg1) {
		try {
			if (arg0 < 0 || arg0 >= this.anInt1647) {
				throw new RuntimeException("");
			}
			this.anInt1647--;
			this.anIntArray1650 = null;
			if (this.anInt1647 == 0) {
				this.aLongArray1636 = null;
				this.aStringArray1657 = null;
				this.aByteArray1654 = null;
				this.anIntArray1651 = null;
				this.anIntArray1652 = null;
				this.anInt1653 = -1;
				this.anInt1649 = -1;
			} else {
				Class453.method5638(this.aByteArray1654, arg0 + 1, this.aByteArray1654, arg0, this.anInt1647 - arg0);
				Class453.method5642(this.anIntArray1651, arg0 + 1, this.anIntArray1651, arg0, this.anInt1647 - arg0);
				Class453.method5642(this.anIntArray1652, arg0 + 1, this.anIntArray1652, arg0, this.anInt1647 - arg0);
				if (this.aLongArray1636 != null) {
					Class453.method5639(this.aLongArray1636, arg0 + 1, this.aLongArray1636, arg0, this.anInt1647 - arg0);
				}
				if (this.aStringArray1657 != null) {
					Class453.method5641(this.aStringArray1657, arg0 + 1, this.aStringArray1657, arg0, this.anInt1647 - arg0);
				}
				if (arg0 == this.anInt1653 || this.anInt1649 == arg0) {
					this.method1813(112931592);
				}
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "gg.l(" + ')');
		}
	}

	public void method1805(long arg0, String arg1, int arg2) {
		try {
			if (arg1 != null && arg1.length() == 0) {
				arg1 = null;
			}
			if (arg0 > 0L != this.aBoolean1662) {
				throw new RuntimeException("");
			} else if ((arg1 != null) == this.aBoolean1637) {
				if (arg0 > 0L && (this.aLongArray1656 == null || this.anInt1655 >= this.aLongArray1656.length) || arg1 != null && (this.aStringArray1658 == null || this.anInt1655 >= this.aStringArray1658.length)) {
					this.method1798(this.anInt1655 + 5, -85497674);
				}
				if (this.aLongArray1656 != null) {
					this.aLongArray1656[this.anInt1655] = arg0;
				}
				if (this.aStringArray1658 != null) {
					this.aStringArray1658[this.anInt1655] = arg1;
				}
				this.anInt1655++;
			} else {
				throw new RuntimeException("");
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "gg.k(" + ')');
		}
	}

	public Integer method1806(int arg0, byte arg1) {
		try {
			if (this.aClass497_1659 == null) {
				return null;
			} else {
				Class330 var3 = this.aClass497_1659.method6094((long) arg0);
				return var3 != null && var3 instanceof Class330_Sub23 ? Integer.valueOf(((Class330_Sub23) var3).anInt7693) : null;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "gg.o(" + ')');
		}
	}

	public int method1807(int arg0, byte arg1, int arg2) {
		try {
			if (arg1 == 126 || arg1 == 127) {
				return -1;
			} else if (arg0 == this.anInt1653 && (this.anInt1649 == -1 || this.aByteArray1654[this.anInt1649] < 125)) {
				return -1;
			} else if (arg1 == this.aByteArray1654[arg0]) {
				return -1;
			} else {
				this.aByteArray1654[arg0] = arg1;
				this.method1813(112931592);
				return arg0;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "gg.u(" + ')');
		}
	}

	public boolean method1808(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			int var6 = (0x1 << arg2) - 1;
			int var7 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
			int var8 = var7 ^ var6;
			int var14 = arg1 << arg2;
			int var15 = var14 & var8;
			if (this.aClass497_1659 == null) {
				this.aClass497_1659 = new Class497(4);
			} else {
				Class330 var9 = this.aClass497_1659.method6094((long) arg0);
				if (var9 != null) {
					if (var9 instanceof Class330_Sub23) {
						Class330_Sub23 var10 = (Class330_Sub23) var9;
						if ((var10.anInt7693 & var8) == var15) {
							return false;
						}
						var10.anInt7693 &= ~var8;
						var10.anInt7693 |= var15;
						return true;
					}
					var9.method3252(-2084258202);
				}
			}
			this.aClass497_1659.method6097(new Class330_Sub23(var15), (long) arg0);
			return true;
		} catch (RuntimeException var13) {
			throw Class476.method5964(var13, "gg.d(" + ')');
		}
	}

	public boolean method1809(int arg0, int arg1, int arg2) {
		try {
			if (this.aClass497_1659 == null) {
				this.aClass497_1659 = new Class497(4);
			} else {
				Class330 var4 = this.aClass497_1659.method6094((long) arg0);
				if (var4 != null) {
					if (var4 instanceof Class330_Sub23) {
						Class330_Sub23 var5 = (Class330_Sub23) var4;
						if (arg1 == var5.anInt7693) {
							return false;
						}
						var5.anInt7693 = arg1;
						return true;
					}
					var4.method3252(-1681535914);
				}
			}
			this.aClass497_1659.method6097(new Class330_Sub23(arg1), (long) arg0);
			return true;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "gg.g(" + ')');
		}
	}

	public boolean method1810(int arg0, long arg1) {
		try {
			if (this.aClass497_1659 == null) {
				this.aClass497_1659 = new Class497(4);
			} else {
				Class330 var4 = this.aClass497_1659.method6094((long) arg0);
				if (var4 != null) {
					if (var4 instanceof Class330_Sub22) {
						Class330_Sub22 var5 = (Class330_Sub22) var4;
						if (var5.aLong7692 == arg1) {
							return false;
						}
						var5.aLong7692 = arg1;
						return true;
					}
					var4.method3252(612428669);
				}
			}
			this.aClass497_1659.method6097(new Class330_Sub22(arg1), (long) arg0);
			return true;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "gg.c(" + ')');
		}
	}

	public void method1811(Buffer arg0, int arg1) {
		try {
			int var3 = arg0.readUnsignedByte(1075117659);
			if (var3 < 1 || var3 > 5) {
				throw new RuntimeException("" + var3);
			}
			int var4 = arg0.readUnsignedByte(422492806);
			if ((var4 & 0x1) != 0) {
				this.aBoolean1662 = true;
			}
			if ((var4 & 0x2) != 0) {
				this.aBoolean1637 = true;
			}
			if (!this.aBoolean1662) {
				this.aLongArray1636 = null;
				this.aLongArray1656 = null;
			}
			if (!this.aBoolean1637) {
				this.aStringArray1657 = null;
				this.aStringArray1658 = null;
			}
			this.anInt1643 = arg0.readInt((byte) 108);
			this.anInt1641 = arg0.readInt((byte) 66);
			if (var3 <= 3 && this.anInt1641 != 0) {
				this.anInt1641 += 16912800;
			}
			this.anInt1647 = arg0.readUnsignedShort(1924824369);
			this.anInt1655 = arg0.readUnsignedByte(2145051414);
			this.aString1640 = arg0.readString(1335890066);
			if (var3 >= 4) {
				arg0.readInt((byte) 63);
			}
			this.aBoolean1642 = arg0.readUnsignedByte(1824142558) == 1;
			this.aByte1638 = arg0.readByte((byte) -31);
			this.aByte1644 = arg0.readByte((byte) 56);
			this.aByte1645 = arg0.readByte((byte) -15);
			this.aByte1635 = arg0.readByte((byte) -43);
			int var5;
			if (this.anInt1647 > 0) {
				if (this.aBoolean1662 && (this.aLongArray1636 == null || this.aLongArray1636.length < this.anInt1647)) {
					this.aLongArray1636 = new long[this.anInt1647];
				}
				if (this.aBoolean1637 && (this.aStringArray1657 == null || this.aStringArray1657.length < this.anInt1647)) {
					this.aStringArray1657 = new String[this.anInt1647];
				}
				if (this.aByteArray1654 == null || this.aByteArray1654.length < this.anInt1647) {
					this.aByteArray1654 = new byte[this.anInt1647];
				}
				if (this.anIntArray1651 == null || this.anIntArray1651.length < this.anInt1647) {
					this.anIntArray1651 = new int[this.anInt1647];
				}
				if (this.anIntArray1652 == null || this.anIntArray1652.length < this.anInt1647) {
					this.anIntArray1652 = new int[this.anInt1647];
				}
				for (var5 = 0; var5 < this.anInt1647; var5++) {
					if (this.aBoolean1662) {
						this.aLongArray1636[var5] = arg0.readLong(-344476850);
					}
					if (this.aBoolean1637) {
						this.aStringArray1657[var5] = arg0.method3761(1945513232);
					}
					this.aByteArray1654[var5] = arg0.readByte((byte) -16);
					if (var3 >= 2) {
						this.anIntArray1651[var5] = arg0.readInt((byte) 87);
					}
					if (var3 >= 5) {
						this.anIntArray1652[var5] = arg0.readUnsignedShort(600640112);
					} else {
						this.anIntArray1652[var5] = 0;
					}
				}
				this.method1813(112931592);
			}
			if (this.anInt1655 > 0) {
				if (this.aBoolean1662 && (this.aLongArray1656 == null || this.aLongArray1656.length < this.anInt1655)) {
					this.aLongArray1656 = new long[this.anInt1655];
				}
				if (this.aBoolean1637 && (this.aStringArray1658 == null || this.aStringArray1658.length < this.anInt1655)) {
					this.aStringArray1658 = new String[this.anInt1655];
				}
				for (var5 = 0; var5 < this.anInt1655; var5++) {
					if (this.aBoolean1662) {
						this.aLongArray1656[var5] = arg0.readLong(-62924618);
					}
					if (this.aBoolean1637) {
						this.aStringArray1658[var5] = arg0.method3761(2021076509);
					}
				}
			}
			if (var3 >= 3) {
				var5 = arg0.readUnsignedShort(857113077);
				if (var5 > 0) {
					this.aClass497_1659 = new Class497(var5 < 16 ? Class136.method1594(var5, 1860956109) : 16);
					while (var5-- > 0) {
						int var6 = arg0.readInt((byte) 79);
						int var7 = var6 & 0x3FFFFFFF;
						int var8 = var6 >>> 30;
						if (var8 == 0) {
							int var9 = arg0.readInt((byte) 121);
							this.aClass497_1659.method6097(new Class330_Sub23(var9), (long) var7);
						} else if (var8 == 1) {
							long var12 = arg0.readLong(-2118139348);
							this.aClass497_1659.method6097(new Class330_Sub22(var12), (long) var7);
						} else if (var8 == 2) {
							String var13 = arg0.readString(1696221985);
							this.aClass497_1659.method6097(new Class330_Sub35(var13), (long) var7);
						}
					}
				}
			}
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "gg.e(" + ')');
		}
	}

	public void method1812(int arg0, int arg1) {
		try {
			if (this.aBoolean1662) {
				if (this.aLongArray1636 == null) {
					this.aLongArray1636 = new long[arg0];
				} else {
					Class453.method5639(this.aLongArray1636, 0, this.aLongArray1636 = new long[arg0], 0, this.anInt1647);
				}
			}
			if (this.aBoolean1637) {
				if (this.aStringArray1657 == null) {
					this.aStringArray1657 = new String[arg0];
				} else {
					Class453.method5641(this.aStringArray1657, 0, this.aStringArray1657 = new String[arg0], 0, this.anInt1647);
				}
			}
			if (this.aByteArray1654 == null) {
				this.aByteArray1654 = new byte[arg0];
			} else {
				Class453.method5638(this.aByteArray1654, 0, this.aByteArray1654 = new byte[arg0], 0, this.anInt1647);
			}
			if (this.anIntArray1651 == null) {
				this.anIntArray1651 = new int[arg0];
			} else {
				Class453.method5642(this.anIntArray1651, 0, this.anIntArray1651 = new int[arg0], 0, this.anInt1647);
			}
			if (this.anIntArray1652 == null) {
				this.anIntArray1652 = new int[arg0];
			} else {
				Class453.method5642(this.anIntArray1652, 0, this.anIntArray1652 = new int[arg0], 0, this.anInt1647);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "gg.r(" + ')');
		}
	}

	public void method1813(int arg0) {
		try {
			if (this.anInt1647 == 0) {
				this.anInt1653 = -1;
				this.anInt1649 = -1;
			} else {
				this.anInt1653 = -1;
				this.anInt1649 = -1;
				int var2 = 0;
				byte var3 = this.aByteArray1654[0];
				for (int var4 = 1; var4 < this.anInt1647; var4++) {
					if (this.aByteArray1654[var4] > var3) {
						if (var3 == 125) {
							this.anInt1649 = var2;
						}
						var2 = var4;
						var3 = this.aByteArray1654[var4];
					} else if (this.anInt1649 == -1 && this.aByteArray1654[var4] == 125) {
						this.anInt1649 = var4;
					}
				}
				this.anInt1653 = var2;
				if (this.anInt1653 != -1) {
					this.aByteArray1654[this.anInt1653] = 126;
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "gg.b(" + ')');
		}
	}

	public boolean method1814(int arg0, String arg1, int arg2) {
		try {
			if (arg1 == null) {
				arg1 = "";
			} else if (arg1.length() > 80) {
				arg1 = arg1.substring(0, 80);
			}
			if (this.aClass497_1659 == null) {
				this.aClass497_1659 = new Class497(4);
			} else {
				Class330 var4 = this.aClass497_1659.method6094((long) arg0);
				if (var4 != null) {
					if (var4 instanceof Class330_Sub35) {
						Class330_Sub35 var5 = (Class330_Sub35) var4;
						if (var5.anObject7733 instanceof String) {
							if (arg1.equals(var5.anObject7733)) {
								return false;
							}
							var5.method3252(1601631902);
							var5.method3252(-590527831);
							this.aClass497_1659.method6097(new Class330_Sub35(arg1), var5.aLong3341);
							return true;
						}
					}
					var4.method3252(-2129185818);
				}
			}
			this.aClass497_1659.method6097(new Class330_Sub35(arg1), (long) arg0);
			return true;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "gg.a(" + ')');
		}
	}

	public int method1815(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			int var6 = (0x1 << arg2) - 1;
			int var7 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
			int var8 = var7 ^ var6;
			int var11 = arg1 << arg2;
			int var12 = var11 & var8;
			int var9 = this.anIntArray1651[arg0];
			if ((var9 & var8) == var12) {
				return -1;
			} else {
				var9 &= ~var8;
				this.anIntArray1651[arg0] = var9 | var12;
				return arg0;
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "gg.x(" + ')');
		}
	}

	public int method1816(int arg0, int arg1, int arg2, byte arg3) {
		try {
			int var5 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
			return (this.anIntArray1651[arg0] & var5) >>> arg1;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "gg.p(" + ')');
		}
	}

	public String method1817(int arg0, byte arg1) {
		try {
			if (this.aClass497_1659 == null) {
				return null;
			} else {
				Class330 var3 = this.aClass497_1659.method6094((long) arg0);
				return var3 != null && var3 instanceof Class330_Sub35 ? (String) ((Class330_Sub35) var3).anObject7733 : null;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "gg.z(" + ')');
		}
	}

	public static final void method1818(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, byte arg3) {
		try {
			String var4 = (String) arg2.anObjectArray4386[--arg2.anInt4378];
			int[] var5 = Class278.method2740(var4, arg2, (byte) 0);
			if (var5 != null) {
				var4 = var4.substring(0, var4.length() - 1);
			}
			arg0.anObjectArray1318 = Class288.method2886(var4, arg2, 1304112104);
			arg0.anIntArray1309 = var5;
			arg0.aBoolean1293 = true;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "gg.mm(" + ')');
		}
	}

	public static final void method1819(Class430 arg0, int arg1) {
		try {
			Class401_Sub1 var2 = Class426.method5318(275028254);
			if (var2 == null) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = -1;
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = "";
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = "";
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = "";
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2.anInt8245;
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2.anInt4131;
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var2.aString8246;
				Class396 var3 = var2.method4720(-841263739);
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt4106;
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var3.aString4107;
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2.anInt4133;
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2.anInt8248;
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var2.aString8247;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "gg.anu(" + ')');
		}
	}

	public static final void method1820(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class99.method1206(var2, var3, true, (byte) 91);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "gg.ur(" + ')');
		}
	}

	public static void method1821(String arg0, int arg1) {
		try {
			Class5.aString73 = arg0;
			Class5.anInt76 = Class5.aString73.length();
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "gg.n(" + ')');
		}
	}

	public static final void method1822(Class430 arg0, byte arg1) {
		try {
			Class416.method5256((Class432_Sub1) arg0.anInterface2_4389, arg0.anIntArray4387[--arg0.anInt4376], 999151532);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = (int) client.aFloatArray9253[0];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = (int) client.aFloatArray9253[1];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = (int) client.aFloatArray9253[2];
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "gg.arn(" + ')');
		}
	}
}
