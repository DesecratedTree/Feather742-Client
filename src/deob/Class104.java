package deob;

public class Class104 {

	public int anInt987 = -1;

	public Class109 aClass109_985;

	public Class109 aClass109_990;

	public String aString988;

	public String aString989;

	public int[] anIntArray986;

	public int[] anIntArray991;

	public void method1242(Class115 arg0, byte arg1) {
		try {
			int var3 = arg0.method1413(1257772905);
			this.aClass109_985 = Class464_Sub3.method5747(1683689676)[var3];
			int var4;
			if (this.aClass109_985 == Class109.aClass109_1028) {
				var4 = arg0.method1413(-126767267);
				this.aClass109_990 = Class464_Sub3.method5747(-1515913361)[var4];
				this.anInt987 = arg0.method1413(1728965477);
			}
			this.aString988 = arg0.method1414(-561731319);
			this.aString989 = arg0.method1414(1649217217);
			var4 = arg0.method1413(952116555);
			this.anIntArray986 = new int[var4];
			this.anIntArray991 = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				this.anIntArray986[var5] = arg0.method1413(586790087);
				this.anIntArray991[var5] = arg0.method1413(-399861530);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ef.r(" + ')');
		}
	}

	public static int method1243(CharSequence arg0, int arg1) {
		try {
			int var2 = arg0.length();
			int var3 = 0;
			for (int var4 = 0; var4 < var2; var4++) {
				char var5 = arg0.charAt(var4);
				if (var5 <= 127) {
					var3++;
				} else if (var5 <= 2047) {
					var3 += 2;
				} else {
					var3 += 3;
				}
			}
			return var3;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ef.r(" + ')');
		}
	}

	public static final void method1244(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 3;
			long var2 = (long) arg0.anIntArray4387[arg0.anInt4376];
			long var4 = (long) arg0.anIntArray4387[arg0.anInt4376 + 1];
			long var6 = (long) arg0.anIntArray4387[arg0.anInt4376 + 2];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = (int) (var6 * var2 / var4);
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "ef.zv(" + ')');
		}
	}

	public static final void method1245(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			if (var2 >= 1 && var2 <= 2) {
				Class96.method1182(var2, -1, -1, false, 434078138);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ef.afu(" + ')');
		}
	}

	public static int method1246(long arg0) {
		try {
			return (int) (arg0 / 86400000L) - 11745;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ef.o(" + ')');
		}
	}

	public static final void method1247(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub13_7893.method5785(-391830017) ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ef.apn(" + ')');
		}
	}

	public static final void method1248(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = arg0.aClass154_4391.aByte1644;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ef.xu(" + ')');
		}
	}
}
