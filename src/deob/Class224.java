package deob;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexBuffer;
import jagdx.IUnknown;
import jagdx.r;

public class Class224 implements Interface9_Impl1 {

	public long aLong8927 = 0L;

	public Class_ra_Sub2_Sub2 aClass_ra_Sub2_Sub2_8925;

	public boolean aBoolean8926;

	public byte aByte8922;

	public int anInt8923;

	public int anInt8924;

	public Class224(Class_ra_Sub2_Sub2 arg0, boolean arg1) {
		this.aClass_ra_Sub2_Sub2_8925 = arg0;
		this.aBoolean8926 = arg1;
		this.aClass_ra_Sub2_Sub2_8925.method4993(this);
	}

	public long method102(int arg0, int arg1) {
		return IDirect3DVertexBuffer.Lock(this.aLong8927, arg0, arg1, this.aBoolean8926 ? 8192 : 0);
	}

	public int method2299() {
		return this.aByte8922;
	}

	public boolean method142(int arg0, int arg1) {
		this.anInt8923 = arg0;
		this.aByte8922 = (byte) arg1;
		if (this.anInt8923 > this.anInt8924) {
			int var3 = 8;
			byte var4;
			if (this.aBoolean8926) {
				var4 = 0;
				var3 |= 0x200;
			} else {
				var4 = 1;
			}
			if (this.aLong8927 != 0L) {
				IUnknown.Release(this.aLong8927);
			}
			this.aLong8927 = IDirect3DDevice.CreateVertexBuffer(this.aClass_ra_Sub2_Sub2_8925.aLong9891, this.anInt8923, var3, 0, var4);
			this.anInt8924 = this.anInt8923;
		}
		return this.aLong8927 != 0L;
	}

	public boolean method99(int arg0, int arg1, long arg2) {
		return r.j(IDirect3DVertexBuffer.Upload(this.aLong8927, arg0, arg1, this.aBoolean8926 ? 8192 : 0, arg2));
	}

	public void method95() {
		IDirect3DVertexBuffer.Unlock(this.aLong8927);
	}

	public boolean method97(int arg0, int arg1, long arg2) {
		return r.j(IDirect3DVertexBuffer.Upload(this.aLong8927, arg0, arg1, this.aBoolean8926 ? 8192 : 0, arg2));
	}

	public void method53() {
		if (this.aLong8927 != 0L) {
			IUnknown.Release(this.aLong8927);
			this.aLong8927 = 0L;
		}
		this.anInt8924 = 0;
		this.anInt8923 = 0;
		this.aClass_ra_Sub2_Sub2_8925.method4883(this);
	}

	public void method2300() {
		if (this.aLong8927 != 0L) {
			this.aClass_ra_Sub2_Sub2_8925.method5173(this.aLong8927);
			this.aLong8927 = 0L;
			this.anInt8924 = 0;
			this.anInt8923 = 0;
		}
	}

	public void method52() {
		if (this.aLong8927 != 0L) {
			IUnknown.Release(this.aLong8927);
			this.aLong8927 = 0L;
		}
		this.anInt8924 = 0;
		this.anInt8923 = 0;
		this.aClass_ra_Sub2_Sub2_8925.method4883(this);
	}

	public int method93() {
		return this.anInt8923;
	}

	public boolean method144(int arg0, int arg1) {
		this.anInt8923 = arg0;
		this.aByte8922 = (byte) arg1;
		if (this.anInt8923 > this.anInt8924) {
			int var3 = 8;
			byte var4;
			if (this.aBoolean8926) {
				var4 = 0;
				var3 |= 0x200;
			} else {
				var4 = 1;
			}
			if (this.aLong8927 != 0L) {
				IUnknown.Release(this.aLong8927);
			}
			this.aLong8927 = IDirect3DDevice.CreateVertexBuffer(this.aClass_ra_Sub2_Sub2_8925.aLong9891, this.anInt8923, var3, 0, var4);
			this.anInt8924 = this.anInt8923;
		}
		return this.aLong8927 != 0L;
	}

	public boolean method145(int arg0, int arg1) {
		this.anInt8923 = arg0;
		this.aByte8922 = (byte) arg1;
		if (this.anInt8923 > this.anInt8924) {
			int var3 = 8;
			byte var4;
			if (this.aBoolean8926) {
				var4 = 0;
				var3 |= 0x200;
			} else {
				var4 = 1;
			}
			if (this.aLong8927 != 0L) {
				IUnknown.Release(this.aLong8927);
			}
			this.aLong8927 = IDirect3DDevice.CreateVertexBuffer(this.aClass_ra_Sub2_Sub2_8925.aLong9891, this.anInt8923, var3, 0, var4);
			this.anInt8924 = this.anInt8923;
		}
		return this.aLong8927 != 0L;
	}

	public boolean method143(int arg0, int arg1) {
		this.anInt8923 = arg0;
		this.aByte8922 = (byte) arg1;
		if (this.anInt8923 > this.anInt8924) {
			int var3 = 8;
			byte var4;
			if (this.aBoolean8926) {
				var4 = 0;
				var3 |= 0x200;
			} else {
				var4 = 1;
			}
			if (this.aLong8927 != 0L) {
				IUnknown.Release(this.aLong8927);
			}
			this.aLong8927 = IDirect3DDevice.CreateVertexBuffer(this.aClass_ra_Sub2_Sub2_8925.aLong9891, this.anInt8923, var3, 0, var4);
			this.anInt8924 = this.anInt8923;
		}
		return this.aLong8927 != 0L;
	}

	public boolean method146(int arg0, int arg1) {
		this.anInt8923 = arg0;
		this.aByte8922 = (byte) arg1;
		if (this.anInt8923 > this.anInt8924) {
			int var3 = 8;
			byte var4;
			if (this.aBoolean8926) {
				var4 = 0;
				var3 |= 0x200;
			} else {
				var4 = 1;
			}
			if (this.aLong8927 != 0L) {
				IUnknown.Release(this.aLong8927);
			}
			this.aLong8927 = IDirect3DDevice.CreateVertexBuffer(this.aClass_ra_Sub2_Sub2_8925.aLong9891, this.anInt8923, var3, 0, var4);
			this.anInt8924 = this.anInt8923;
		}
		return this.aLong8927 != 0L;
	}

	public int method96() {
		return this.anInt8923;
	}

	public int method100() {
		return this.anInt8923;
	}

	public boolean method98(int arg0, int arg1, long arg2) {
		return r.j(IDirect3DVertexBuffer.Upload(this.aLong8927, arg0, arg1, this.aBoolean8926 ? 8192 : 0, arg2));
	}

	public long method101(int arg0, int arg1) {
		return IDirect3DVertexBuffer.Lock(this.aLong8927, arg0, arg1, this.aBoolean8926 ? 8192 : 0);
	}

	public long method92(int arg0, int arg1) {
		return IDirect3DVertexBuffer.Lock(this.aLong8927, arg0, arg1, this.aBoolean8926 ? 8192 : 0);
	}

	public void method103() {
		IDirect3DVertexBuffer.Unlock(this.aLong8927);
	}

	public long method94(int arg0, int arg1) {
		return IDirect3DVertexBuffer.Lock(this.aLong8927, arg0, arg1, this.aBoolean8926 ? 8192 : 0);
	}
}
