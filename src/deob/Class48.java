package deob;

public class Class48 {

	public int anInt472 = 0;

	public int anInt473 = 0;

	public int anInt474 = 0;

	public Class_ra_Sub1 aClass_ra_Sub1_476;

	public Class47 aClass47_471;

	public Class49[] aClass49Array475;

	public Class49_Sub2 aClass49_Sub2_477;

	public Class48(Class_ra_Sub1 arg0) {
		this.aClass_ra_Sub1_476 = arg0;
		this.aClass47_471 = new Class47(arg0);
		this.aClass49Array475 = new Class49[16];
		this.aClass49Array475[1] = new Class49_Sub7(arg0);
		this.aClass49Array475[2] = new Class49_Sub4(arg0, this.aClass47_471);
		this.aClass49Array475[4] = new Class49_Sub1(arg0, this.aClass47_471);
		this.aClass49Array475[5] = new Class49_Sub5(arg0, this.aClass47_471);
		this.aClass49Array475[6] = new Class49_Sub8(arg0);
		this.aClass49Array475[7] = new Class49_Sub3(arg0);
		this.aClass49Array475[3] = this.aClass49_Sub2_477 = new Class49_Sub2(arg0);
		this.aClass49Array475[8] = new Class49_Sub9(arg0, this.aClass47_471);
		this.aClass49Array475[9] = new Class49_Sub6(arg0, this.aClass47_471);
		if (!this.aClass49Array475[8].method601()) {
			this.aClass49Array475[8] = this.aClass49Array475[4];
		}
		if (!this.aClass49Array475[9].method601()) {
			this.aClass49Array475[9] = this.aClass49Array475[8];
		}
	}

	public boolean method597(int arg0) {
		return this.aClass49Array475[arg0].method601();
	}

	public boolean method598(Class36 arg0, int arg1) {
		if (this.anInt474 == 0) {
			return false;
		} else {
			this.aClass49Array475[this.anInt474 & Integer.MAX_VALUE].method600(arg0, arg1);
			return true;
		}
	}

	public void method599(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
		boolean var6 = arg4 & this.aClass_ra_Sub1_476.method4851();
		if (!var6 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
			if (arg0 == 4) {
				arg2 = arg1;
			}
			arg0 = 2;
		}
		if (arg0 != 0 && arg3) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (this.anInt474 != arg0) {
			if (this.anInt474 != 0) {
				this.aClass49Array475[this.anInt474 & Integer.MAX_VALUE].method604();
			}
			if (arg0 != 0) {
				this.aClass49Array475[arg0 & Integer.MAX_VALUE].method602(arg3);
				this.aClass49Array475[arg0 & Integer.MAX_VALUE].method608(arg3);
				this.aClass49Array475[arg0 & Integer.MAX_VALUE].method606(arg1, arg2);
			}
			this.anInt474 = arg0;
			this.anInt472 = arg1;
			this.anInt473 = arg2;
		} else if (this.anInt474 != 0) {
			this.aClass49Array475[this.anInt474 & Integer.MAX_VALUE].method608(arg3);
			if (this.anInt472 != arg1 || this.anInt473 != arg2) {
				this.aClass49Array475[this.anInt474 & Integer.MAX_VALUE].method606(arg1, arg2);
				this.anInt472 = arg1;
				this.anInt473 = arg2;
			}
		}
	}
}
