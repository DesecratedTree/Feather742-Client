package deob;

import java.util.Calendar;
import java.util.TimeZone;

public class Class528 {

	public static long aLong6214 = 1000L;

	public static String[][] aStringArrayArray6216 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" } };

	public static Calendar aCalendar6215 = Calendar.getInstance();

	public static Calendar aCalendar6217 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	public Class528() throws Throwable {
		throw new Error();
	}

	public static void method6271(Class_ra arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		try {
			if ((Class326.aClass61_3321 == null || Class330_Sub36_Sub12.aClass61_9714 == null || Class291.aClass61_2980 == null) && Class540.aClass280_6249.method2750(Class486.anInt5825, 677988541) && Class540.aClass280_6249.method2750(IndexTable.anInt2908, 2015924560) && Class540.aClass280_6249.method2750(Class484.anInt5808, 1607149368)) {
				Class87 var7 = Class53.method643(Class540.aClass280_6249, IndexTable.anInt2908, 0);
				Class330_Sub36_Sub12.aClass61_9714 = arg0.bw(var7, true);
				var7.method998();
				Class99.aClass61_918 = arg0.bw(var7, true);
				Class326.aClass61_3321 = arg0.bw(Class53.method643(Class540.aClass280_6249, Class486.anInt5825, 0), true);
				Class87 var8 = Class53.method643(Class540.aClass280_6249, Class484.anInt5808, 0);
				Class291.aClass61_2980 = arg0.bw(var8, true);
				var8.method998();
				Class150_Sub2.aClass61_7271 = arg0.bw(var8, true);
			}
			if (Class326.aClass61_3321 != null && Class330_Sub36_Sub12.aClass61_9714 != null && Class291.aClass61_2980 != null) {
				int var11 = (arg3 - Class291.aClass61_2980.method681() * 2) / Class326.aClass61_3321.method681();
				int var12;
				for (var12 = 0; var12 < var11; var12++) {
					Class326.aClass61_3321.method687(arg1 + Class291.aClass61_2980.method681() + var12 * Class326.aClass61_3321.method681(), arg4 + arg2 - Class326.aClass61_3321.method682());
				}
				var12 = (arg4 - arg5 - Class291.aClass61_2980.method682()) / Class330_Sub36_Sub12.aClass61_9714.method682();
				for (int var9 = 0; var9 < var12; var9++) {
					Class330_Sub36_Sub12.aClass61_9714.method687(arg1, arg5 + arg2 + var9 * Class330_Sub36_Sub12.aClass61_9714.method682());
					Class99.aClass61_918.method687(arg1 + arg3 - Class99.aClass61_918.method681(), arg5 + arg2 + var9 * Class330_Sub36_Sub12.aClass61_9714.method682());
				}
				Class291.aClass61_2980.method687(arg1, arg2 + arg4 - Class291.aClass61_2980.method682());
				Class150_Sub2.aClass61_7271.method687(arg1 + arg3 - Class291.aClass61_2980.method681(), arg4 + arg2 - Class291.aClass61_2980.method682());
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "vw.ao(" + ')');
		}
	}

	public static boolean method6272(boolean arg0, boolean arg1, String arg2, String arg3, long arg4) {
		try {
			Class360.aBoolean3748 = arg0;
			if (!arg1) {
				Class360.anInt3749 = -1;
			}
			Class360.aBoolean3773 = arg1;
			Class360.username = arg2;
			Class360.password = arg3;
			Class360.aLong3750 = arg4;
			if (!Class360.aBoolean3773 && (Class360.username.equals("") || Class360.password.equals(""))) {
				Class281.method2792(3, -1676918787);
				Class325_Sub1.method3213(954083232);
				return false;
			}
			if (Class360.anInt3791 != 108) {
				Class360.anInt3786 = 0;
				Class360.anInt3756 = -1;
				Class360.anInt3787 = -1;
			}
			Class360.aClass1_3783.aBoolean37 = false;
			Class281.method2792(-3, -730227313);
			Class360.anInt3769 = 12;
			Class360.anInt3779 = 0;
			Class360.anInt3780 = 0;
			return true;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "vw.a(" + ')');
		}
	}
}
