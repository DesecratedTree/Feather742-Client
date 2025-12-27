package deob;

public class Class330_Sub22 extends Class330 {

	public long aLong7692;

	public Class330_Sub22(long arg0) {
		this.aLong7692 = arg0;
	}

	public static final void method3376(Class430 arg0, byte arg1) {
		try {
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub17_7910, arg0.anIntArray4387[--arg0.anInt4376] == 1 ? 1 : 0, -673737262);
			Class376.method4366((byte) -111);
			Class435.method5568(1289932142);
			client.aBoolean9194 = false;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "adc.akr(" + ')');
		}
	}

	public static void method3377(int arg0, byte arg1) {
		try {
			Class330_Sub36_Sub3 var2 = Class464_Sub4.method5750(6, (long) arg0);
			var2.method3444(1908091451);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "adc.n(" + ')');
		}
	}

	public static int[][] method3378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, boolean arg7, int arg8) {
		try {
			int[][] var9 = new int[arg1][arg0];
			Class330_Sub49_Sub1 var10 = new Class330_Sub49_Sub1();
			var10.aBoolean9853 = arg7;
			var10.anInt9850 = arg3;
			var10.anInt9851 = arg4;
			var10.anInt9852 = arg5;
			var10.anInt9846 = (int) (arg6 * 4096.0F);
			var10.method3850(981708906);
			Class511.method6178(arg0, arg1, (byte) 24);
			for (int var11 = 0; var11 < arg1; var11++) {
				var10.method3849(var11, var9[var11], (byte) -118);
			}
			return var9;
		} catch (RuntimeException var12) {
			throw Class476.method5964(var12, "adc.s(" + ')');
		}
	}
}
