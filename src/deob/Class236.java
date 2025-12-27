package deob;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class236 implements Interface8_Impl1_Impl1_Impl1 {

	public Class_ra_Sub2_Sub2 aClass_ra_Sub2_Sub2_10278;

	public int anInt10280;

	public int anInt10281;

	public Class86 aClass86_10282;

	public long aLong10279;

	public int method55() {
		return this.anInt10281;
	}

	public int method54() {
		return this.anInt10280;
	}

	public Class236(Class_ra_Sub2_Sub2 arg0, Class86 arg1, int arg2, int arg3, int arg4) {
		this.aClass_ra_Sub2_Sub2_10278 = arg0;
		this.anInt10280 = arg2;
		this.anInt10281 = arg3;
		this.aClass86_10282 = arg1;
		this.aLong10279 = IDirect3DDevice.CreateDepthStencilSurface(this.aClass_ra_Sub2_Sub2_10278.aLong9891, arg2, arg3, Class_ra_Sub2_Sub2.method5170(this.aClass86_10282), arg4, 0, false);
		this.aClass_ra_Sub2_Sub2_10278.method4993(this);
	}

	public int method58() {
		return this.anInt10280;
	}

	public void method53() {
		if (this.aLong10279 != 0L) {
			IUnknown.Release(this.aLong10279);
			this.aLong10279 = 0L;
		}
		this.aClass_ra_Sub2_Sub2_10278.method4883(this);
	}

	public void method188() {
		if (this.aLong10279 != 0L) {
			this.aClass_ra_Sub2_Sub2_10278.method5173(this.aLong10279);
			this.aLong10279 = 0L;
		}
	}

	public int method60() {
		return this.anInt10281;
	}

	public long method187() {
		return this.aLong10279;
	}

	public void method193() {
		if (this.aLong10279 != 0L) {
			this.aClass_ra_Sub2_Sub2_10278.method5173(this.aLong10279);
			this.aLong10279 = 0L;
		}
	}

	public int method59() {
		return this.anInt10281;
	}

	public int method57() {
		return this.anInt10280;
	}

	public int method61() {
		return this.anInt10281;
	}

	public void method52() {
		if (this.aLong10279 != 0L) {
			IUnknown.Release(this.aLong10279);
			this.aLong10279 = 0L;
		}
		this.aClass_ra_Sub2_Sub2_10278.method4883(this);
	}

	public long method190() {
		return this.aLong10279;
	}

	public long method191() {
		return this.aLong10279;
	}

	public long method192() {
		return this.aLong10279;
	}

	public void method189() {
		if (this.aLong10279 != 0L) {
			this.aClass_ra_Sub2_Sub2_10278.method5173(this.aLong10279);
			this.aLong10279 = 0L;
		}
	}

	public int method56() {
		return this.anInt10280;
	}
}
