package deob;

public class Class95_Sub3 extends Class95 {

	public static int anInt7122 = 1;

	public static int anInt7126 = 0;

	public int anInt7121;

	public int anInt7131;

	public int anInt7124;

	public int anInt7129;

	public int anInt7130;

	public int anInt7123;

	public int anInt7132;

	public int anInt7125;

	public int anInt7127;

	public int anInt7128;

	public int anInt7133;

	public int anInt7134;

	public int anInt7135;

	public Class95_Sub3(Buffer arg0, int arg1, int arg2) {
		super(arg0);
		int var4;
		if (arg1 == 0) {
			var4 = arg0.readInt((byte) 108);
			this.anInt7121 = var4 >>> 16;
			this.anInt7131 = var4 & 0xFFFF;
			this.anInt7124 = -1;
		} else {
			this.anInt7121 = -1;
			this.anInt7131 = -1;
			this.anInt7124 = arg0.readUnsignedShort(-421967354);
		}
		if (arg2 == 0) {
			var4 = arg0.readInt((byte) 105);
			this.anInt7129 = var4 >>> 16;
			this.anInt7130 = var4 & 0xFFFF;
			this.anInt7123 = -1;
		} else {
			this.anInt7129 = -1;
			this.anInt7130 = -1;
			this.anInt7123 = arg0.readUnsignedShort(753892096);
		}
		if (arg1 == 0 && arg2 == 0) {
			this.anInt7132 = arg0.readUnsignedByte(-104973052);
		} else {
			this.anInt7132 = -1;
		}
		this.anInt7125 = arg0.readUnsignedShort(1991424883);
		this.anInt7127 = arg0.readUnsignedByte(941496691);
		this.anInt7128 = arg0.readUnsignedByte(1306363313);
		this.anInt7133 = arg0.readUnsignedTriByte(-1401356047);
		this.anInt7134 = arg0.readUnsignedShort(1686421556);
		this.anInt7135 = arg0.readUnsignedByte(1100239917);
	}

	public boolean method1097(int arg0) {
		try {
			Class437 var2 = Class136.aClass416_1527.method5254(this.anInt7125, 1701653816);
			boolean var3 = var2.method5584((byte) -125);
			Class440 var4 = Class201.aClass436_6511.method5570(var2.anInt4431, -69118074);
			return var3 & var4.method5600(2134034420);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aag.p(" + ')');
		}
	}

	public void method1095(int arg0) {
		try {
			int var2;
			int var3;
			int var4;
			if (this.anInt7121 >= 0) {
				var2 = this.anInt7121 * 512 + 256;
				var3 = this.anInt7131 * 512 + 256;
				var4 = this.anInt7132;
			} else {
				Class432_Sub1_Sub1_Sub1 var5 = Class96.aClass85Array854[this.anInt7124].method973(-1160484525);
				Class260 var6 = var5.method5346().aClass260_2606;
				var2 = (int) var6.aFloat2716;
				var3 = (int) var6.aFloat2711;
				var4 = var5.aByte8658;
			}
			int var10;
			int var11;
			if (this.anInt7131 >= 0) {
				var10 = this.anInt7129 * 512 + 256;
				var11 = this.anInt7130 * 512 + 256;
			} else {
				Class432_Sub1_Sub1_Sub1 var7 = Class96.aClass85Array854[this.anInt7123].method973(-1160484525);
				Class260 var8 = var7.method5346().aClass260_2606;
				var10 = (int) var8.aFloat2716;
				var11 = (int) var8.aFloat2711;
				if (var4 < 0) {
					var4 = var7.aByte8658;
				}
			}
			int var12 = this.anInt7135 << 2;
			Class432_Sub1_Sub1_Sub2 var13 = new Class432_Sub1_Sub1_Sub2(client.aClass304_9030.method3023(-400722441), this.anInt7125, var4, var4, var2, var3, this.anInt7127 << 2, client.anInt8981, this.anInt7133 + client.anInt8981, this.anInt7134, var12, this.anInt7124 + 1, this.anInt7123 + 1, this.anInt7128 << 2, false, 0, 0);
			var13.method5498(var10, var11, this.anInt7128 << 2, this.anInt7133 + client.anInt8981, 1222236922);
			client.aClass471_9139.method5878(new Class330_Sub36_Sub11(var13), (short) 8192);
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "aag.j(" + ')');
		}
	}

	public void method1100() {
		int var1;
		int var2;
		int var3;
		if (this.anInt7121 * -965007875 * 1806294869 >= 0) {
			var1 = this.anInt7121 * 1405004288 * -965007875 + 256;
			var2 = this.anInt7131 * 1445521713 * -140533248 + 256;
			var3 = this.anInt7132 * -621291839 * 505526593;
		} else {
			Class432_Sub1_Sub1_Sub1 var4 = Class96.aClass85Array854[this.anInt7124 * 1645003869 * 217526261].method973(-1160484525);
			Class260 var5 = var4.method5346().aClass260_2606;
			var1 = (int) var5.aFloat2716;
			var2 = (int) var5.aFloat2711;
			var3 = var4.aByte8658;
		}
		int var8;
		int var9;
		if (this.anInt7131 * 1445521713 * -1040461871 >= 0) {
			var8 = this.anInt7129 * 103980577 * 1087095296 + 256;
			var9 = this.anInt7130 * 1214436757 * 26966528 + 256;
		} else {
			Class432_Sub1_Sub1_Sub1 var6 = Class96.aClass85Array854[this.anInt7123 * -2123455745 * 130571519].method973(-1160484525);
			Class260 var7 = var6.method5346().aClass260_2606;
			var8 = (int) var7.aFloat2716;
			var9 = (int) var7.aFloat2711;
			if (var3 < 0) {
				var3 = var6.aByte8658;
			}
		}
		int var10 = this.anInt7135 * 252707241 * -809749863 << 2;
		Class432_Sub1_Sub1_Sub2 var11 = new Class432_Sub1_Sub1_Sub2(client.aClass304_9030.method3023(-400722441), this.anInt7125 * 1171334127 * 719743759, var3, var3, var1, var2, this.anInt7127 * 1745375479 * -1198821177 << 2, client.anInt8981 * 822953439 * 659076639, this.anInt7133 * 674332561 * -2065358479 + client.anInt8981 * 659076639 * 822953439, this.anInt7134 * 1244903957 * -659471043, var10, this.anInt7124 * 1645003869 * 217526261 + 1, this.anInt7123 * 130571519 * -2123455745 + 1, this.anInt7128 * -1840391287 * 1520503481 << 2, false, 0, 0);
		var11.method5498(var8, var9, this.anInt7128 * 1520503481 * -1840391287 << 2, this.anInt7133 * -2065358479 * 674332561 + client.anInt8981 * 822953439 * 659076639, -296788785);
		client.aClass471_9139.method5878(new Class330_Sub36_Sub11(var11), (short) 8192);
	}

	public void method1098() {
		int var1;
		int var2;
		int var3;
		if (this.anInt7121 * -965007875 * 1806294869 >= 0) {
			var1 = this.anInt7121 * 1405004288 * -965007875 + 256;
			var2 = this.anInt7131 * 1445521713 * -140533248 + 256;
			var3 = this.anInt7132 * -621291839 * 505526593;
		} else {
			Class432_Sub1_Sub1_Sub1 var4 = Class96.aClass85Array854[this.anInt7124 * 1645003869 * 217526261].method973(-1160484525);
			Class260 var5 = var4.method5346().aClass260_2606;
			var1 = (int) var5.aFloat2716;
			var2 = (int) var5.aFloat2711;
			var3 = var4.aByte8658;
		}
		int var8;
		int var9;
		if (this.anInt7131 * 1445521713 * -1040461871 >= 0) {
			var8 = this.anInt7129 * 103980577 * 1087095296 + 256;
			var9 = this.anInt7130 * 1214436757 * 26966528 + 256;
		} else {
			Class432_Sub1_Sub1_Sub1 var6 = Class96.aClass85Array854[this.anInt7123 * -2123455745 * 130571519].method973(-1160484525);
			Class260 var7 = var6.method5346().aClass260_2606;
			var8 = (int) var7.aFloat2716;
			var9 = (int) var7.aFloat2711;
			if (var3 < 0) {
				var3 = var6.aByte8658;
			}
		}
		int var10 = this.anInt7135 * 252707241 * -809749863 << 2;
		Class432_Sub1_Sub1_Sub2 var11 = new Class432_Sub1_Sub1_Sub2(client.aClass304_9030.method3023(-400722441), this.anInt7125 * 1171334127 * 719743759, var3, var3, var1, var2, this.anInt7127 * 1745375479 * -1198821177 << 2, client.anInt8981 * 822953439 * 659076639, this.anInt7133 * 674332561 * -2065358479 + client.anInt8981 * 659076639 * 822953439, this.anInt7134 * 1244903957 * -659471043, var10, this.anInt7124 * 1645003869 * 217526261 + 1, this.anInt7123 * 130571519 * -2123455745 + 1, this.anInt7128 * -1840391287 * 1520503481 << 2, false, 0, 0);
		var11.method5498(var8, var9, this.anInt7128 * 1520503481 * -1840391287 << 2, this.anInt7133 * -2065358479 * 674332561 + client.anInt8981 * 822953439 * 659076639, -2084501140);
		client.aClass471_9139.method5878(new Class330_Sub36_Sub11(var11), (short) 8192);
	}

	public void method1099() {
		int var1;
		int var2;
		int var3;
		if (this.anInt7121 * -965007875 * 1806294869 >= 0) {
			var1 = this.anInt7121 * 1405004288 * -965007875 + 256;
			var2 = this.anInt7131 * 1445521713 * -140533248 + 256;
			var3 = this.anInt7132 * -621291839 * 505526593;
		} else {
			Class432_Sub1_Sub1_Sub1 var4 = Class96.aClass85Array854[this.anInt7124 * 1645003869 * 217526261].method973(-1160484525);
			Class260 var5 = var4.method5346().aClass260_2606;
			var1 = (int) var5.aFloat2716;
			var2 = (int) var5.aFloat2711;
			var3 = var4.aByte8658;
		}
		int var8;
		int var9;
		if (this.anInt7131 * 1445521713 * -1040461871 >= 0) {
			var8 = this.anInt7129 * 103980577 * 1087095296 + 256;
			var9 = this.anInt7130 * 1214436757 * 26966528 + 256;
		} else {
			Class432_Sub1_Sub1_Sub1 var6 = Class96.aClass85Array854[this.anInt7123 * -2123455745 * 130571519].method973(-1160484525);
			Class260 var7 = var6.method5346().aClass260_2606;
			var8 = (int) var7.aFloat2716;
			var9 = (int) var7.aFloat2711;
			if (var3 < 0) {
				var3 = var6.aByte8658;
			}
		}
		int var10 = this.anInt7135 * 252707241 * -809749863 << 2;
		Class432_Sub1_Sub1_Sub2 var11 = new Class432_Sub1_Sub1_Sub2(client.aClass304_9030.method3023(-400722441), this.anInt7125 * 1171334127 * 719743759, var3, var3, var1, var2, this.anInt7127 * 1745375479 * -1198821177 << 2, client.anInt8981 * 822953439 * 659076639, this.anInt7133 * 674332561 * -2065358479 + client.anInt8981 * 659076639 * 822953439, this.anInt7134 * 1244903957 * -659471043, var10, this.anInt7124 * 1645003869 * 217526261 + 1, this.anInt7123 * 130571519 * -2123455745 + 1, this.anInt7128 * -1840391287 * 1520503481 << 2, false, 0, 0);
		var11.method5498(var8, var9, this.anInt7128 * 1520503481 * -1840391287 << 2, this.anInt7133 * -2065358479 * 674332561 + client.anInt8981 * 822953439 * 659076639, 1048798493);
		client.aClass471_9139.method5878(new Class330_Sub36_Sub11(var11), (short) 8192);
	}

	public boolean method1111() {
		Class437 var1 = Class136.aClass416_1527.method5254(this.anInt7125 * 1171334127 * 719743759, -1510480095);
		boolean var2 = var1.method5584((byte) -31);
		Class440 var3 = Class201.aClass436_6511.method5570(var1.anInt4431 * -872235369 * 1258856743, -1408324732);
		return var2 & var3.method5600(2097210661);
	}

	public boolean method1112() {
		Class437 var1 = Class136.aClass416_1527.method5254(this.anInt7125 * 1171334127 * 719743759, 1395166200);
		boolean var2 = var1.method5584((byte) -10);
		Class440 var3 = Class201.aClass436_6511.method5570(var1.anInt4431 * -872235369 * 1258856743, 658479723);
		return var2 & var3.method5600(2033844314);
	}

	public boolean method1113() {
		Class437 var1 = Class136.aClass416_1527.method5254(this.anInt7125 * 1171334127 * 719743759, -1622236372);
		boolean var2 = var1.method5584((byte) -88);
		Class440 var3 = Class201.aClass436_6511.method5570(var1.anInt4431 * -872235369 * 1258856743, -1285754425);
		return var2 & var3.method5600(792072944);
	}

	public static final int method1114(Class432_Sub1_Sub1_Sub1 arg0, byte arg1) {
		try {
			if (arg0.anInt10051 == 0) {
				return 0;
			}
			int var5;
			Class260 var9;
			if (arg0.anInt10028 != -1) {
				Class432_Sub1_Sub1_Sub1 var2 = null;
				if (arg0.anInt10028 < 32768) {
					Class330_Sub35 var3 = (Class330_Sub35) client.aClass497_9014.method6094((long) arg0.anInt10028);
					if (var3 != null) {
						var2 = (Class432_Sub1_Sub1_Sub1) var3.anObject7733;
					}
				} else if (arg0.anInt10028 >= 32768) {
					var2 = client.players[arg0.anInt10028 - 32768];
				}
				if (var2 != null) {
					var9 = Class260.method2561(arg0.method5346().aClass260_2606, var2.method5346().aClass260_2606);
					int var4 = (int) var9.aFloat2716;
					var5 = (int) var9.aFloat2711;
					if (var4 != 0 || var5 != 0) {
						arg0.method5410((int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF, (byte) -44);
					}
				}
			}
			if (arg0 instanceof Player) {
				Player var8 = (Player) arg0;
				if (var8.anInt10232 != -1 && (var8.anInt10056 == 0 || var8.anInt10060 > 0)) {
					var8.method5410(var8.anInt10232, (byte) -95);
					var8.anInt10232 = -1;
				}
			} else if (arg0 instanceof NPC) {
				NPC var10 = (NPC) arg0;
				if (var10.anInt10261 != -1 && (var10.anInt10056 == 0 || var10.anInt10060 > 0)) {
					var9 = var10.method5346().aClass260_2606;
					Class381 var11 = client.aClass304_9030.method3022(1660793861);
					var5 = (int) var9.aFloat2716 - (var10.anInt10261 * 256 - var11.gameSceneBaseX * 256 - var11.gameSceneBaseX * 256);
					int var6 = (int) var9.aFloat2711 - (var10.anInt10252 * 256 - var11.gameSceneBaseY * 256 - var11.gameSceneBaseY * 256);
					if (var5 != 0 || var6 != 0) {
						var10.method5410((int) (Math.atan2((double) var5, (double) var6) * 2607.5945876176133D) & 0x3FFF, (byte) -42);
					}
					var10.anInt10261 = -1;
				}
			}
			return arg0.method5412(1946076715);
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "aag.hp(" + ')');
		}
	}
}
