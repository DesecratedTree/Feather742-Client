package deob;

public class Class330_Sub48_Sub4 extends Class330_Sub48 {

	public int anInt9840;

	public boolean method3844() {
		Player var1 = client.players[this.anInt9840 * -971987331 * -1625128235];
		if (var1 == null) {
			return false;
		} else {
			Class220.method2263(Class545.aClass545_7007, this.anInt7859 * -251776905 * 856598855, -1, var1, this.anInt9840 * -971987331 * -1625128235, 938417923);
			return true;
		}
	}

	public Class330_Sub48_Sub4(int arg0, int arg1, int arg2) {
		super(arg0, arg1);
		this.anInt9840 = arg2;
	}

	public boolean method3831(byte arg0) {
		try {
			Player var2 = client.players[this.anInt9840];
			if (var2 == null) {
				return false;
			} else {
				Class220.method2263(Class545.aClass545_7007, this.anInt7859, -1, var2, this.anInt9840, 498610765);
				return true;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ajt.r(" + ')');
		}
	}

	public boolean method3845() {
		Player var1 = client.players[this.anInt9840 * -971987331 * -1625128235];
		if (var1 == null) {
			return false;
		} else {
			Class220.method2263(Class545.aClass545_7007, this.anInt7859 * -251776905 * 856598855, -1, var1, this.anInt9840 * -971987331 * -1625128235, 1518751136);
			return true;
		}
	}

	public boolean method3846() {
		Player var1 = client.players[this.anInt9840 * -971987331 * -1625128235];
		if (var1 == null) {
			return false;
		} else {
			Class220.method2263(Class545.aClass545_7007, this.anInt7859 * -251776905 * 856598855, -1, var1, this.anInt9840 * -971987331 * -1625128235, 976625742);
			return true;
		}
	}

	public static final void method3847(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class263_Sub2.myPlayer.anInt10228;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ajt.ul(" + ')');
		}
	}

	public static final void method3848(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			String var4 = (String) arg2.anObjectArray4386[--arg2.anInt4378];
			if (Class278.method2740(var4, arg2, (byte) 0) != null) {
				var4 = var4.substring(0, var4.length() - 1);
			}
			arg0.anObjectArray1172 = Class288.method2886(var4, arg2, 1894946479);
			arg0.aBoolean1293 = true;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ajt.lh(" + ')');
		}
	}
}
