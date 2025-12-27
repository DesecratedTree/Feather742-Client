package deob;

public class Class77 {

	public int anInt652;

	public int anInt650;

	public int anInt651;

	public int anInt649;

	public int anInt653;

	public int anInt654;

	public int anInt655;

	public Class77() {
	}

	public Class77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		this.anInt652 = arg0;
		this.anInt650 = arg1;
		this.anInt651 = arg2;
		this.anInt649 = arg3;
		this.anInt653 = arg4;
		this.anInt654 = arg5;
		this.anInt655 = arg6;
	}

	public boolean method925(Class77 arg0, int arg1) {
		try {
			return arg0.anInt652 == this.anInt652 && this.anInt650 == arg0.anInt650 && this.anInt651 == arg0.anInt651 && this.anInt649 == arg0.anInt649 && this.anInt653 == arg0.anInt653 && this.anInt654 == arg0.anInt654 && arg0.anInt655 == this.anInt655;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "dc.r(" + ')');
		}
	}

	public static void method926(int[] arg0, Object[] arg1, int arg2, int arg3, int arg4) {
		try {
			if (arg2 < arg3) {
				int var5 = (arg3 + arg2) / 2;
				int var6 = arg2;
				int var7 = arg0[var5];
				arg0[var5] = arg0[arg3];
				arg0[arg3] = var7;
				Object var8 = arg1[var5];
				arg1[var5] = arg1[arg3];
				arg1[arg3] = var8;
				int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
				for (int var10 = arg2; var10 < arg3; var10++) {
					if (arg0[var10] < var7 + (var10 & var9)) {
						int var11 = arg0[var10];
						arg0[var10] = arg0[var6];
						arg0[var6] = var11;
						Object var12 = arg1[var10];
						arg1[var10] = arg1[var6];
						arg1[var6++] = var12;
					}
				}
				arg0[arg3] = arg0[var6];
				arg0[var6] = var7;
				arg1[arg3] = arg1[var6];
				arg1[var6] = var8;
				method926(arg0, arg1, arg2, var6 - 1, 274180082);
				method926(arg0, arg1, var6 + 1, arg3, 2044493331);
			}
		} catch (RuntimeException var13) {
			throw Class476.method5964(var13, "dc.w(" + ')');
		}
	}

	public static final void method927(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.anIntArray9117[var2];
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "dc.tu(" + ')');
		}
	}

	public static final void method928(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class291.aByte2979;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "dc.wq(" + ')');
		}
	}

	public static final void method929(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			if (client.windowPaneId != -1) {
				if (var2 == 0) {
					arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.windowPaneId;
					return;
				}
				var2--;
			}
			Class330_Sub48 var3 = (Class330_Sub48) client.aClass497_9284.method6099((byte) 34);
			while (var2-- > 0) {
				var3 = (Class330_Sub48) client.aClass497_9284.method6098((short) -32768);
			}
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt7859;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "dc.ano(" + ')');
		}
	}

	public static final void method930(Class430 arg0, int arg1) {
		try {
			if (Class503.aBoolean5914 && Class130.aFrame1498 != null) {
				Class96.method1182(Class448.aClass330_Sub50_5555.aClass464_Sub8_7897.method5763(849297921), -1, -1, false, -931827158);
			}
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			boolean var3 = arg0.anIntArray4387[--arg0.anInt4376] == 1;
			String var4 = Class228.method2315(-997158659) + var2;
			Class532.openLink(var4, var3, Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(13750689) == 5, client.aBoolean9042, client.aBoolean8966, 1045765320);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "dc.afn(" + ')');
		}
	}
}
