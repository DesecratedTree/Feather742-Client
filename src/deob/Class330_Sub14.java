package deob;

public class Class330_Sub14 extends Class330 {

	public Class260 aClass260_7608 = new Class260();

	public int anInt7606;

	public int anInt7607;

	public float aFloat7605;

	public Class330_Sub14(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
		this.aClass260_7608.method2553((float) arg0, (float) arg1, (float) arg2);
		this.anInt7606 = arg3;
		this.anInt7607 = arg4;
		this.aFloat7605 = arg5;
	}

	public final int method3311(byte arg0) {
		try {
			return (int) this.aClass260_7608.aFloat2715;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "act.j(" + ')');
		}
	}

	public final int method3312(short arg0) {
		try {
			return (int) this.aClass260_7608.aFloat2711;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "act.i(" + ')');
		}
	}

	public final int method3313(int arg0) {
		try {
			return this.anInt7607;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "act.o(" + ')');
		}
	}

	public void method3314(float arg0, int arg1) {
		try {
			this.aFloat7605 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "act.f(" + ')');
		}
	}

	public void method3315(int arg0, int arg1, int arg2, byte arg3) {
		try {
			this.aClass260_7608.method2553((float) arg0, (float) arg1, (float) arg2);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "act.z(" + ')');
		}
	}

	public final int method3316(byte arg0) {
		try {
			return this.anInt7606;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "act.p(" + ')');
		}
	}

	public final float method3317(int arg0) {
		try {
			return this.aFloat7605;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "act.s(" + ')');
		}
	}

	public final int method3318(int arg0) {
		try {
			return (int) this.aClass260_7608.aFloat2716;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "act.r(" + ')');
		}
	}

	public static void method3319(byte arg0) {
		try {
			for (Class330_Sub36_Sub13 var1 = (Class330_Sub36_Sub13) Class484.aClass472_5793.method5884((byte) 35); var1 != null; var1 = (Class330_Sub36_Sub13) Class484.aClass472_5793.method5886((short) 8192)) {
				if (var1.anInt9715 > 1) {
					var1.anInt9715 = 0;
					Class484.aClass367_5796.put(var1, ((Class330_Sub36_Sub10) var1.aClass472_9716.aClass330_Sub36_5613.aClass330_Sub36_7735).aLong9695);
					var1.aClass472_9716.method5889(-655404096);
				}
			}
			Class484.anInt5790 = 0;
			Class484.anInt5786 = 0;
			Class484.aClass471_5791.method5866(613065745);
			Class484.aClass497_5803.method6100(65280);
			Class484.aClass472_5793.method5889(-561632490);
			Class484.aBoolean5782 = false;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "act.ac(" + ')');
		}
	}
}
