package deob;

public class Class330_Sub36_Sub12 extends Class330_Sub36 {

	public int anInt9707 = -1;

	public int anInt9710 = -1;

	public int anInt9709 = 12800;

	public int anInt9706 = 0;

	public int anInt9704 = 12800;

	public int anInt9712 = 0;

	public boolean aBoolean9713 = true;

	public int anInt9708;

	public String mapLocation;

	public String aString9705;

	public int anInt9702;

	public Class471 aClass471_9711;

	public static Class61 aClass61_9714;

	public Class330_Sub36_Sub12(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
		this.anInt9708 = arg0;
		this.mapLocation = arg1;
		this.aString9705 = arg2;
		this.anInt9702 = arg3;
		this.anInt9707 = arg4;
		this.aBoolean9713 = arg5;
		this.anInt9710 = arg6;
		if (this.anInt9710 == 255) {
			this.anInt9710 = 0;
		}
		Class103.method1230(arg7, 1978601725);
		this.aClass471_9711 = new Class471();
	}

	public boolean method3480(int arg0, int arg1, int arg2) {
		try {
			for (Class330_Sub45 var4 = (Class330_Sub45) this.aClass471_9711.method5869(539664854); var4 != null; var4 = (Class330_Sub45) this.aClass471_9711.method5873((byte) -49)) {
				if (var4.method3732(arg0, arg1, (byte) 12)) {
					return true;
				}
			}
			return false;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ajp.r(" + ')');
		}
	}

	public boolean method3481(int arg0, int arg1, int[] arg2, byte arg3) {
		try {
			for (Class330_Sub45 var5 = (Class330_Sub45) this.aClass471_9711.method5869(539664854); var5 != null; var5 = (Class330_Sub45) this.aClass471_9711.method5873((byte) -20)) {
				if (var5.method3732(arg0, arg1, (byte) 12)) {
					var5.method3736(arg0, arg1, arg2, -2132432367);
					return true;
				}
			}
			return false;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ajp.i(" + ')');
		}
	}

	public boolean method3482(int arg0, int arg1, int[] arg2, int arg3) {
		try {
			for (Class330_Sub45 var5 = (Class330_Sub45) this.aClass471_9711.method5869(539664854); var5 != null; var5 = (Class330_Sub45) this.aClass471_9711.method5873((byte) 3)) {
				if (var5.method3734(arg0, arg1, (byte) -128)) {
					var5.method3735(arg0, arg1, arg2, -1178319755);
					return true;
				}
			}
			return false;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ajp.j(" + ')');
		}
	}

	public void method3483(int arg0) {
		try {
			this.anInt9709 = 12800;
			this.anInt9706 = 0;
			this.anInt9704 = 12800;
			this.anInt9712 = 0;
			for (Class330_Sub45 var2 = (Class330_Sub45) this.aClass471_9711.method5869(539664854); var2 != null; var2 = (Class330_Sub45) this.aClass471_9711.method5873((byte) -59)) {
				if (var2.anInt7839 < this.anInt9709) {
					this.anInt9709 = var2.anInt7839;
				}
				if (var2.anInt7837 > this.anInt9706) {
					this.anInt9706 = var2.anInt7837;
				}
				if (var2.anInt7834 < this.anInt9704) {
					this.anInt9704 = var2.anInt7834;
				}
				if (var2.anInt7842 > this.anInt9712) {
					this.anInt9712 = var2.anInt7842;
				}
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ajp.o(" + ')');
		}
	}

	public boolean method3484(int arg0, int arg1, int arg2, int[] arg3, byte arg4) {
		try {
			for (Class330_Sub45 var6 = (Class330_Sub45) this.aClass471_9711.method5869(539664854); var6 != null; var6 = (Class330_Sub45) this.aClass471_9711.method5873((byte) -78)) {
				if (var6.method3733(arg0, arg1, arg2, -274346095)) {
					var6.method3736(arg1, arg2, arg3, -211793634);
					return true;
				}
			}
			return false;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ajp.p(" + ')');
		}
	}
}
