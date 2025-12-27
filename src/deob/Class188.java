package deob;

public class Class188 {

	public Class367 aClass367_1854 = new Class367(6291456, 256);

	public Class_ra_Sub2 aClass_ra_Sub2_1852;

	public Interface_ma anInterface_ma1853;

	public Class188(Class_ra_Sub2 arg0, Interface_ma arg1) {
		this.aClass_ra_Sub2_1852 = arg0;
		this.anInterface_ma1853 = arg1;
	}

	public Interface11_Impl3 method2093(int arg0) {
		return this.method2094(arg0, -1);
	}

	public Interface11_Impl3 method2094(int arg0, int arg1) {
		long var3 = (long) (arg1 << 16 | arg0);
		Interface11_Impl3 var5 = (Interface11_Impl3) this.aClass367_1854.get(var3);
		if (var5 != null) {
			return var5;
		} else if (this.method2095(arg0, arg1)) {
			Class56 var6 = this.anInterface_ma1853.method221(arg0, -813319685);
			if (arg1 == -1) {
				arg1 = var6.anInt532;
			}
			Interface11_Impl3 var7;
			if (var6.aBoolean508 && this.aClass_ra_Sub2_1852.cg()) {
				float[] var9 = this.anInterface_ma1853.method222(arg0, 0.7F, arg1, arg1, false, (short) 255);
				var7 = this.aClass_ra_Sub2_1852.method4946(Class72.aClass72_620, arg1, arg1, true, var9);
			} else {
				int[] var8;
				if (var6.aClass369_524 != Class369.aClass369_6817 && Class376.method4368(var6.aByte525, -1670036614)) {
					var8 = this.anInterface_ma1853.method220(arg0, 0.7F, arg1, arg1, true, -1960772341);
				} else {
					var8 = this.anInterface_ma1853.method231(arg0, 0.7F, arg1, arg1, false, 112182405);
				}
				var7 = this.aClass_ra_Sub2_1852.method4944(arg1, arg1, true, var8);
			}
			var7.method109(var6.aBoolean536, var6.aBoolean537);
			this.aClass367_1854.method4299(var7, var3, arg1 * arg1, (byte) -14);
			return var7;
		} else {
			return null;
		}
	}

	public boolean method2095(int arg0, int arg1) {
		Class56 var3 = this.anInterface_ma1853.method221(arg0, -151610705);
		if (arg1 == -1) {
			arg1 = var3.anInt532;
		}
		if (var3.aBoolean508 && this.aClass_ra_Sub2_1852.cg()) {
			return this.anInterface_ma1853.method237(arg0, Class377.aClass377_3936, 0.7F, arg1, arg1, false, 2141126910);
		} else if (var3.aClass369_524 != Class369.aClass369_6817 && Class376.method4368(var3.aByte525, -1335288073)) {
			return this.anInterface_ma1853.method237(arg0, Class377.aClass377_3934, 0.7F, arg1, arg1, true, 2144547057);
		} else {
			return this.anInterface_ma1853.method237(arg0, Class377.aClass377_3935, 0.7F, arg1, arg1, false, 2134928037);
		}
	}

	public void method2096() {
		this.aClass367_1854.method4298((byte) 118);
	}

	public void method2097() {
		this.aClass367_1854.method4292(5, (byte) 122);
	}
}
