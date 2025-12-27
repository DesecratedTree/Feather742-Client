package deob;

public class Class426 {

	public Class120 aClass120_4346;

	public IComponentDefinitions aClass114_4345;

	public void method5313(byte arg0) {
		try {
			this.aClass120_4346 = null;
			this.aClass114_4345 = null;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "rs.p(" + ')');
		}
	}

	public IComponentDefinitions method5314(int arg0) {
		try {
			return this.aClass120_4346.method1440(this.aClass114_4345.anInt1196, (byte) 26);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "rs.r(" + ')');
		}
	}

	public boolean method5315(Class120 arg0, int arg1, int arg2, byte arg3) {
		try {
			if (arg0 != null) {
				IComponentDefinitions var5 = arg0.method1440(arg1, (byte) 35);
				if (var5 != null) {
					this.aClass120_4346 = arg0;
					this.aClass114_4345 = var5;
					return true;
				}
			}
			this.method5313((byte) 3);
			return false;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "rs.i(" + ')');
		}
	}

	public boolean method5316(int arg0, int arg1, byte arg2) {
		try {
			IComponentDefinitions var4 = Class166.method1993(arg0, arg1, 534399539);
			if (var4 == null) {
				this.method5313((byte) 5);
				return false;
			} else {
				this.aClass120_4346 = Class3.aClass120Array56[arg0 >> 16];
				this.aClass114_4345 = var4;
				return true;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "rs.j(" + ')');
		}
	}

	public static Class1 method5317(int arg0) {
		try {
			return Class226.method2307(client.anInt8995, (byte) 49) ? client.aClass1_9060 : client.aClass1_9025;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "rs.fi(" + ')');
		}
	}

	public static Class401_Sub1 method5318(int arg0) {
		try {
			return Class507.anInt5936 < Class507.aClass401_Sub1Array5935.length ? Class507.aClass401_Sub1Array5935[++Class507.anInt5936 - 1] : null;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "rs.f(" + ')');
		}
	}
}
