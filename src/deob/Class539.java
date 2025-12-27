package deob;

public class Class539 {

	public boolean aBoolean6245;

	public Class548[] aClass548Array6246;

	public static Class296 aClass296_6244;

	public Class539(boolean arg0, Class548[] arg1) {
		this.aBoolean6245 = arg0;
		this.aClass548Array6246 = arg1;
	}

	public static Class208 method6326(int arg0, int arg1) {
		try {
			Class208 var2 = (Class208) Class208.aClass367_1966.get((long) arg0);
			if (var2 != null) {
				return var2;
			}
			byte[] var3 = Class208.aClass280_1954.getFile(1, arg0);
			var2 = new Class208();
			var2.anInt1967 = arg0;
			if (var3 != null) {
				var2.method2197(new Buffer(var3), (byte) -32);
			}
			var2.method2196(2141145355);
			if (var2.anInt1968 == 2 && Class208.aClass497_1964.method6094((long) arg0) == null) {
				Class208.aClass497_1964.method6097(new Class330_Sub23(Class208.anInt1979), (long) arg0);
				Class208.aClass208Array1963[++Class208.anInt1979 - 1] = var2;
			}
			Class208.aClass367_1966.put(var2, (long) arg0);
			return var2;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "wi.j(" + ')');
		}
	}
}
