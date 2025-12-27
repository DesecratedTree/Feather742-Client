package deob;

import java.util.Calendar;

public class Class95_Sub2 extends Class95 {

	public int anInt7120;

	public int anInt7119;

	public int anInt7118;

	public Class95_Sub2(Buffer arg0) {
		super(arg0);
		this.anInt7120 = arg0.readUnsignedShort(903863929);
		this.anInt7119 = arg0.readUnsignedShort(1244011079);
		this.anInt7118 = arg0.readUnsignedByte(566553593);
	}

	public void method1098() {
		Class85 var1 = Class96.aClass85Array854[this.anInt7120 * 905120373 * 834074077];
		Class89 var2 = Class96.aClass89Array862[this.anInt7119 * -1132769973 * -1970416541];
		var2.method1056(var1, this.anInt7118 * -1739090965 * 1179516099, 1985092595);
	}

	public void method1100() {
		Class85 var1 = Class96.aClass85Array854[this.anInt7120 * 905120373 * 834074077];
		Class89 var2 = Class96.aClass89Array862[this.anInt7119 * -1132769973 * -1970416541];
		var2.method1056(var1, this.anInt7118 * -1739090965 * 1179516099, 322516079);
	}

	public void method1095(int arg0) {
		try {
			Class85 var2 = Class96.aClass85Array854[this.anInt7120];
			Class89 var3 = Class96.aClass89Array862[this.anInt7119];
			var3.method1056(var2, this.anInt7118, 979792392);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aaf.j(" + ')');
		}
	}

	public void method1099() {
		Class85 var1 = Class96.aClass85Array854[this.anInt7120 * 905120373 * 834074077];
		Class89 var2 = Class96.aClass89Array862[this.anInt7119 * -1132769973 * -1970416541];
		var2.method1056(var1, this.anInt7118 * -1739090965 * 1179516099, 1706964216);
	}

	public static String method1109(long arg0, int arg1, boolean arg2, int arg3) {
		try {
			Calendar var5;
			if (arg2) {
				Class22.method475(arg0);
				var5 = Class528.aCalendar6217;
			} else {
				Class452.method5637(arg0);
				var5 = Class528.aCalendar6215;
			}
			int var6 = var5.get(5);
			int var7 = var5.get(2) + 1;
			int var8 = var5.get(1);
			int var9 = var5.get(11);
			int var10 = var5.get(12);
			return Integer.toString(var6 / 10) + var6 % 10 + "/" + var7 / 10 + var7 % 10 + "/" + var8 % 100 / 10 + var8 % 10 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "aaf.i(" + ')');
		}
	}

	public static Class352 method1110(Class432_Sub1_Sub1 arg0, int arg1) {
		try {
			Class352 var2;
			if (Class352.aClass352_3485 == null) {
				var2 = new Class352();
			} else {
				var2 = Class352.aClass352_3485;
				Class352.aClass352_3485 = Class352.aClass352_3485.aClass352_3483;
				var2.aClass352_3483 = null;
				Class352.anInt3482--;
			}
			var2.aClass432_Sub1_Sub1_3484 = arg0;
			return var2;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aaf.r(" + ')');
		}
	}
}
