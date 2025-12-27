package deob;

public class Class88 {

	public int anInt728;

	public Class476 aClass476_726;

	public int anInt725;

	public int anInt727;

	public int anInt729;

	public int anInt730;

	public void method1048(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			IncomingPacket.method2272(arg0, arg1, arg2, this.aClass476_726.anInt6901, this.anInt728, this.aClass476_726.anInt6882, arg3, -1519253705);
			this.anInt725 = arg0;
			this.anInt727 = arg1;
			this.anInt729 = arg2;
			this.anInt730 = arg3;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "dn.r(" + ')');
		}
	}

	public void method1049(int arg0) {
		try {
			IncomingPacket.method2272(this.anInt725, this.anInt727, this.anInt729, this.aClass476_726.anInt6901, -1, this.aClass476_726.anInt6882, this.anInt730, -432124637);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "dn.j(" + ')');
		}
	}

	public boolean method1050(int arg0) {
		try {
			if (this.anInt728 < 0) {
				return true;
			}
			Class473 var2 = Class201.aClass463_6510.method5705(this.anInt728, (byte) -33);
			boolean var3 = var2.method5895(this.aClass476_726.anInt6882, (byte) -103);
			int[] var4 = var2.method5905(-401787340);
			if (var4 != null) {
				int[] var5 = var4;
				for (int var6 = 0; var6 < var5.length; var6++) {
					int var7 = var5[var6];
					var3 &= Class201.aClass436_6511.method5570(var7, -2080479661).method5600(2018969373);
				}
			}
			return var3;
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "dn.i(" + ')');
		}
	}

	public Class88(Buffer arg0) {
		this.anInt728 = arg0.readBigSmart(-2115176254);
		this.aClass476_726 = (Class476) Class479.method6015(Class329.method3250(2121020296), arg0.readUnsignedByte(516218932), (byte) 107);
	}

	public static final void method1051(Class430 arg0, short arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 1955655997);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class473.method5913(var3, var4, arg0, 2112186201);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "dn.cm(" + ')');
		}
	}

	public static final void method1052(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 1588291391);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class122.method1451(var3, var4, arg0, (byte) 16);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "dn.lr(" + ')');
		}
	}

	public static final void method1053(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = arg0.aClass330_Sub39_4395.method3544((String) arg0.anObjectArray4386[--arg0.anInt4378], (byte) 8);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "dn.yf(" + ')');
		}
	}

	public static void method1054(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		try {
			long var6 = (long) (arg0 | (arg4 ? Integer.MIN_VALUE : 0));
			Class330_Sub1 var8 = (Class330_Sub1) Class330_Sub1.aClass497_7501.method6094(var6);
			if (var8 == null) {
				var8 = new Class330_Sub1();
				Class330_Sub1.aClass497_7501.method6097(var8, var6);
			}
			if (var8.anIntArray7500.length <= arg1) {
				int[] var9 = new int[arg1 + 1];
				int[] var10 = new int[arg1 + 1];
				int var11;
				for (var11 = 0; var11 < var8.anIntArray7500.length; var11++) {
					var9[var11] = var8.anIntArray7500[var11];
					var10[var11] = var8.anIntArray7497[var11];
				}
				for (var11 = var8.anIntArray7500.length; var11 < arg1; var11++) {
					var9[var11] = -1;
					var10[var11] = 0;
				}
				var8.anIntArray7500 = var9;
				var8.anIntArray7497 = var10;
			}
			var8.anIntArray7500[arg1] = arg2;
			var8.anIntArray7497[arg1] = arg3;
		} catch (RuntimeException var12) {
			throw Class476.method5964(var12, "dn.f(" + ')');
		}
	}

	public static final void method1055(Class430 arg0, int arg1) {
		try {
			arg0.aLongArray4379[++arg0.anInt4380 - 1] = arg0.aLongArray4372[arg0.anIntArray4394[arg0.anInt4397]];
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "dn.bt(" + ')');
		}
	}
}
