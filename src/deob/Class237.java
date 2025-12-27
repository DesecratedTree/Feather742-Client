package deob;

import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

public class Class237 implements Interface8_Impl1_Impl2_Impl3, Interface8_Impl1_Impl1_Impl1 {

	public int anInt10284;

	public Class229_Sub1_Sub1 aClass229_Sub1_Sub1_10283;

	public long aLong10285;

	public int method60() {
		return this.aClass229_Sub1_Sub1_10283.method108();
	}

	public int method59() {
		return this.aClass229_Sub1_Sub1_10283.method108();
	}

	public long method190() {
		if (this.aLong10285 == 0L) {
			this.aLong10285 = IDirect3DTexture.GetSurfaceLevel(this.aClass229_Sub1_Sub1_10283.aLong6488, this.anInt10284);
		}
		return this.aLong10285;
	}

	public long method187() {
		if (this.aLong10285 == 0L) {
			this.aLong10285 = IDirect3DTexture.GetSurfaceLevel(this.aClass229_Sub1_Sub1_10283.aLong6488, this.anInt10284);
		}
		return this.aLong10285;
	}

	public void method53() {
		if (this.aLong10285 != 0L) {
			IUnknown.Release(this.aLong10285);
			this.aLong10285 = 0L;
		}
		this.aClass229_Sub1_Sub1_10283.aClass_ra_Sub2_Sub2_6484.method4883(this);
	}

	public void method188() {
		if (this.aLong10285 != 0L) {
			this.aClass229_Sub1_Sub1_10283.aClass_ra_Sub2_Sub2_6484.method5173(this.aLong10285);
			this.aLong10285 = 0L;
		}
	}

	public int method58() {
		return this.aClass229_Sub1_Sub1_10283.method137();
	}

	public Class237(Class229_Sub1_Sub1 arg0, int arg1) {
		this.anInt10284 = arg1;
		this.aClass229_Sub1_Sub1_10283 = arg0;
		this.aClass229_Sub1_Sub1_10283.aClass_ra_Sub2_Sub2_6484.method4993(this);
	}

	public int method55() {
		return this.aClass229_Sub1_Sub1_10283.method108();
	}

	public int method56() {
		return this.aClass229_Sub1_Sub1_10283.method137();
	}

	public int method61() {
		return this.aClass229_Sub1_Sub1_10283.method108();
	}

	public void method52() {
		if (this.aLong10285 != 0L) {
			IUnknown.Release(this.aLong10285);
			this.aLong10285 = 0L;
		}
		this.aClass229_Sub1_Sub1_10283.aClass_ra_Sub2_Sub2_6484.method4883(this);
	}

	public int method57() {
		return this.aClass229_Sub1_Sub1_10283.method137();
	}

	public int method54() {
		return this.aClass229_Sub1_Sub1_10283.method137();
	}

	public long method191() {
		if (this.aLong10285 == 0L) {
			this.aLong10285 = IDirect3DTexture.GetSurfaceLevel(this.aClass229_Sub1_Sub1_10283.aLong6488, this.anInt10284);
		}
		return this.aLong10285;
	}

	public long method192() {
		if (this.aLong10285 == 0L) {
			this.aLong10285 = IDirect3DTexture.GetSurfaceLevel(this.aClass229_Sub1_Sub1_10283.aLong6488, this.anInt10284);
		}
		return this.aLong10285;
	}

	public void method189() {
		if (this.aLong10285 != 0L) {
			this.aClass229_Sub1_Sub1_10283.aClass_ra_Sub2_Sub2_6484.method5173(this.aLong10285);
			this.aLong10285 = 0L;
		}
	}

	public void method193() {
		if (this.aLong10285 != 0L) {
			this.aClass229_Sub1_Sub1_10283.aClass_ra_Sub2_Sub2_6484.method5173(this.aLong10285);
			this.aLong10285 = 0L;
		}
	}
}
