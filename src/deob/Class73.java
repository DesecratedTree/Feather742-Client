package deob;

public class Class73 {

	public Class367 aClass367_622 = new Class367(6291456, 256);

	public Class_ra_Sub1 aClass_ra_Sub1_623;

	public Interface_ma anInterface_ma624;

	public Class73(Class_ra_Sub1 arg0, Interface_ma arg1) {
		this.aClass_ra_Sub1_623 = arg0;
		this.anInterface_ma624 = arg1;
	}

	public Class36_Sub1 method834(int arg0, int arg1) {
		Class36_Sub1 var3 = (Class36_Sub1) this.aClass367_622.get((long) arg0);
		if (var3 != null) {
			return var3;
		} else if (this.method835(arg0, arg1)) {
			Class56 var4 = this.anInterface_ma624.method221(arg0, 1140965331);
			if (arg1 == -1) {
				arg1 = var4.anInt532;
			}
			Class36_Sub1 var5;
			if (var4.aBoolean508 && this.aClass_ra_Sub1_623.cg()) {
				float[] var7 = this.anInterface_ma624.method222(arg0, 0.7F, arg1, arg1, false, (short) 255);
				var5 = new Class36_Sub1(this.aClass_ra_Sub1_623, 3553, Class72.aClass72_620, Class86.aClass86_716, arg1, arg1, var4.aByte538 != 0, var7, Class72.aClass72_620);
			} else {
				int[] var6;
				if (var4.aClass369_524 != Class369.aClass369_6817 && Class376.method4368(var4.aByte525, -1699327788)) {
					var6 = this.anInterface_ma624.method220(arg0, 0.7F, arg1, arg1, true, -2089138391);
				} else {
					var6 = this.anInterface_ma624.method231(arg0, 0.7F, arg1, arg1, false, -638072524);
				}
				var5 = new Class36_Sub1(this.aClass_ra_Sub1_623, 3553, arg1, arg1, var4.aByte538 != 0, var6, 0, 0, false);
			}
			var5.method518(var4.aBoolean536, var4.aBoolean537);
			this.aClass367_622.method4299(var5, (long) arg0, arg1 * arg1, (byte) -46);
			return var5;
		} else {
			return null;
		}
	}

	public boolean method835(int arg0, int arg1) {
		Class56 var3 = this.anInterface_ma624.method221(arg0, -5820853);
		if (arg1 == -1) {
			arg1 = var3.anInt532;
		}
		if (var3.aBoolean508 && this.aClass_ra_Sub1_623.cg()) {
			return this.anInterface_ma624.method237(arg0, Class377.aClass377_3936, 0.7F, arg1, arg1, false, 2142970166);
		} else if (var3.aClass369_524 != Class369.aClass369_6817 && Class376.method4368(var3.aByte525, -1296929787)) {
			return this.anInterface_ma624.method237(arg0, Class377.aClass377_3934, 0.7F, arg1, arg1, true, 2137453829);
		} else {
			return this.anInterface_ma624.method237(arg0, Class377.aClass377_3935, 0.7F, arg1, arg1, false, 2146024972);
		}
	}

	public void method836() {
		this.aClass367_622.method4292(5, (byte) 42);
	}

	public void method837() {
		this.aClass367_622.method4298((byte) 21);
	}

	public Class36_Sub1 method838(int arg0) {
		return this.method834(arg0, -1);
	}
}
