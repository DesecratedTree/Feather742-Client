package deob;

public class Class432 {

	public Class241 aClass241_4409 = new Class241();

	public Class241 aClass241_4401 = new Class241();

	public boolean aBoolean4402 = true;

	public Class241 aClass241_4400 = new Class241();

	public boolean aBoolean4404 = true;

	public Class247 aClass247_4405;

	public boolean aBoolean4403;

	public Class432 aClass432_4407;

	public Class432 aClass432_4408;

	public Class432 aClass432_4406;

	public Class432() {
		new Class249();
		new Class249();
		this.aClass247_4405 = new Class247();
		this.aBoolean4403 = true;
		this.aClass432_4407 = null;
		this.aClass432_4408 = null;
		this.aClass432_4406 = null;
	}

	public final Class241 method5345() {
		return this.aClass241_4409;
	}

	public final Class241 method5346() {
		if (this.aBoolean4402) {
			this.aBoolean4402 = false;
			this.aClass241_4401.method2400(this.aClass241_4409);
			if (this.aClass432_4407 != null) {
				this.aClass241_4401.method2402(this.aClass432_4407.method5346());
			}
		}
		return this.aClass241_4401;
	}

	public final Class241 method5347() {
		if (this.aBoolean4404) {
			this.aBoolean4404 = false;
			this.aClass241_4400.method2400(this.method5346());
			this.aClass241_4400.method2401();
		}
		return this.aClass241_4401;
	}

	public final void method5348(float arg0, float arg1, float arg2) {
		this.aClass241_4409.aClass260_2606.method2553(arg0, arg1, arg2);
		this.method5350();
		if (this.aClass432_4408 != null) {
			this.aClass432_4408.method5351();
		}
	}

	public final void method5349(Class260 arg0) {
		this.aClass241_4409.aClass260_2606.method2582(arg0);
		this.method5350();
		if (this.aClass432_4408 != null) {
			this.aClass432_4408.method5351();
		}
	}

	public final void method5350() {
		this.aBoolean4402 = true;
		this.aBoolean4404 = true;
		this.aBoolean4403 = true;
	}

	public final void method5351() {
		this.method5350();
		if (this.aClass432_4408 != null) {
			this.aClass432_4408.method5351();
		}
		if (this.aClass432_4406 != null) {
			this.aClass432_4406.method5351();
		}
	}

	public final void method5352() {
		Class432 var1;
		if (this.aClass432_4407 != null) {
			var1 = this.aClass432_4407.aClass432_4408;
			if (var1 == this) {
				this.aClass432_4407.aClass432_4408 = this.aClass432_4406;
			} else {
				while (var1.aClass432_4406 != this) {
					var1 = var1.aClass432_4406;
				}
				var1.aClass432_4406 = this.aClass432_4406;
			}
		}
		this.method5350();
		if (this.aClass432_4408 != null) {
			this.aClass432_4408.method5351();
			var1 = this.aClass432_4408;
			while (true) {
				var1.aClass241_4409.method2402(this.aClass241_4409);
				var1.aClass432_4407 = this.aClass432_4407;
				if (var1.aClass432_4406 == null) {
					var1.aClass432_4406 = this.aClass432_4407.aClass432_4408;
					this.aClass432_4407.aClass432_4408 = this.aClass432_4408;
					break;
				}
				var1 = var1.aClass432_4406;
			}
		}
		this.aClass432_4407 = null;
		this.aClass432_4406 = null;
		this.aClass432_4408 = null;
	}

	public final void method5353(Class241 arg0) {
		if (this.aClass432_4407 == null) {
			this.method5354(arg0);
		} else {
			Class241 var2 = new Class241(arg0);
			var2.method2402(this.aClass432_4407.method5347());
			this.method5354(var2);
		}
	}

	public final void method5354(Class241 arg0) {
		this.aClass241_4409.method2400(arg0);
		this.method5350();
		if (this.aClass432_4408 != null) {
			this.aClass432_4408.method5351();
		}
	}

	public final Class247 method5355() {
		if (this.aBoolean4403) {
			this.aBoolean4403 = false;
			this.aClass247_4405.method2456(this.method5346());
		}
		return this.aClass247_4405;
	}

	public final void method5356(Class244 arg0) {
		this.aClass241_4409.aClass244_2607.method2419(arg0);
		this.method5350();
		if (this.aClass432_4408 != null) {
			this.aClass432_4408.method5351();
		}
	}
}
