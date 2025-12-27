package deob;

import jagdx.IUnknown;

public abstract class Class229 implements Interface8 {

	public long aLong6488 = 0L;

	public Class_ra_Sub2_Sub2 aClass_ra_Sub2_Sub2_6484;

	public Class72 aClass72_6485;

	public Class86 aClass86_6486;

	public boolean aBoolean6487;

	public Class229(Class_ra_Sub2_Sub2 arg0, Class72 arg1, Class86 arg2, boolean arg3, int arg4) {
		this.aClass_ra_Sub2_Sub2_6484 = arg0;
		this.aClass72_6485 = arg1;
		this.aClass86_6486 = arg2;
		this.aBoolean6487 = arg3;
		this.aClass_ra_Sub2_Sub2_6484.method4993(this);
	}

	public long method2318() {
		return this.aLong6488;
	}

	public void method163(Class189 arg0) {
	}

	public void method53() {
		if (this.aLong6488 != 0L) {
			IUnknown.Release(this.aLong6488);
			this.aLong6488 = 0L;
		}
		this.aClass_ra_Sub2_Sub2_6484.method4883(this);
	}

	public void method52() {
		if (this.aLong6488 != 0L) {
			IUnknown.Release(this.aLong6488);
			this.aLong6488 = 0L;
		}
		this.aClass_ra_Sub2_Sub2_6484.method4883(this);
	}

	public void method2319() {
		if (this.aLong6488 != 0L) {
			this.aClass_ra_Sub2_Sub2_6484.method5173(this.aLong6488);
			this.aLong6488 = 0L;
		}
	}
}
