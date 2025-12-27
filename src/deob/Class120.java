package deob;

public class Class120 {

	public IComponentDefinitions[] aClass114Array1400;

	public boolean aBoolean1402;

	public IComponentDefinitions[] aClass114Array1401;

	public IComponentDefinitions method1440(int arg0, byte arg1) {
		try {
			if ((arg0 & 0xFFFF) >= this.aClass114Array1400.length) {
				return null;
			} else if (arg0 >>> 16 == this.aClass114Array1400[0].anInt1196 >>> 16) {
				return this.aClass114Array1400[arg0 & 0xFFFF];
			} else {
				throw new IllegalArgumentException();
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ev.i(" + ')');
		}
	}

	public IComponentDefinitions[] method1441(int arg0) {
		try {
			if (this.aClass114Array1401 == null) {
				int var2 = this.aClass114Array1400.length;
				this.aClass114Array1401 = new IComponentDefinitions[var2];
				System.arraycopy(this.aClass114Array1400, 0, this.aClass114Array1401, 0, this.aClass114Array1400.length);
			}
			return this.aClass114Array1401;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ev.j(" + ')');
		}
	}

	public Class120(boolean arg0, IComponentDefinitions[] arg1) {
		this.aClass114Array1400 = arg1;
		this.aBoolean1402 = arg0;
	}

	public IComponentDefinitions[] method1442(byte arg0) {
		try {
			return this.aClass114Array1401 == null ? this.aClass114Array1400 : this.aClass114Array1401;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ev.r(" + ')');
		}
	}

	public static final void method1443(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			String var4 = (String) arg2.anObjectArray4386[--arg2.anInt4378];
			if (Class278.method2740(var4, arg2, (byte) 0) != null) {
				var4 = var4.substring(0, var4.length() - 1);
			}
			arg0.anObjectArray1295 = Class288.method2886(var4, arg2, 1417883268);
			arg0.aBoolean1293 = true;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ev.kd(" + ')');
		}
	}

	public static final void method1444(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class556.aClass510_6392.getItemDefinitions(var2, (byte) -77).aBoolean6707 ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ev.abt(" + ')');
		}
	}
}
