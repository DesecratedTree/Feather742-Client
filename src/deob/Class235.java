package deob;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class235 implements Interface8_Impl1_Impl2_Impl3 {

	public Class_ra_Sub2_Sub2 aClass_ra_Sub2_Sub2_10292;

	public int anInt10293;

	public int anInt10294;

	public Class72 aClass72_10295;

	public Class86 aClass86_10291;

	public long aLong10290;

	public void method52() {
		if (this.aLong10290 != 0L) {
			IUnknown.Release(this.aLong10290);
			this.aLong10290 = 0L;
		}
		this.aClass_ra_Sub2_Sub2_10292.method4883(this);
	}

	public int method59() {
		return this.anInt10294;
	}

	public int method55() {
		return this.anInt10294;
	}

	public long method187() {
		return this.aLong10290;
	}

	public void method53() {
		if (this.aLong10290 != 0L) {
			IUnknown.Release(this.aLong10290);
			this.aLong10290 = 0L;
		}
		this.aClass_ra_Sub2_Sub2_10292.method4883(this);
	}

	public void method188() {
		if (this.aLong10290 != 0L) {
			this.aClass_ra_Sub2_Sub2_10292.method5173(this.aLong10290);
			this.aLong10290 = 0L;
		}
	}

	public int method58() {
		return this.anInt10293;
	}

	public int method57() {
		return this.anInt10293;
	}

	public int method56() {
		return this.anInt10293;
	}

	public long method191() {
		return this.aLong10290;
	}

	public int method60() {
		return this.anInt10294;
	}

	public int method61() {
		return this.anInt10294;
	}

	public long method192() {
		return this.aLong10290;
	}

	public int method54() {
		return this.anInt10293;
	}

	public Class235(Class_ra_Sub2_Sub2 arg0, Class72 arg1, Class86 arg2, int arg3, int arg4, int arg5) {
		this.aClass_ra_Sub2_Sub2_10292 = arg0;
		this.anInt10293 = arg3;
		this.anInt10294 = arg4;
		this.aClass72_10295 = arg1;
		this.aClass86_10291 = arg2;
		this.aLong10290 = IDirect3DDevice.CreateRenderTarget(this.aClass_ra_Sub2_Sub2_10292.aLong9891, arg3, arg4, Class_ra_Sub2_Sub2.method5183(this.aClass72_10295, this.aClass86_10291), arg5, 0, false);
		this.aClass_ra_Sub2_Sub2_10292.method4993(this);
	}

	public long method190() {
		return this.aLong10290;
	}

	public void method189() {
		if (this.aLong10290 != 0L) {
			this.aClass_ra_Sub2_Sub2_10292.method5173(this.aLong10290);
			this.aLong10290 = 0L;
		}
	}

	public void method193() {
		if (this.aLong10290 != 0L) {
			this.aClass_ra_Sub2_Sub2_10292.method5173(this.aLong10290);
			this.aLong10290 = 0L;
		}
	}
}
