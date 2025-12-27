package deob;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DIndexBuffer;
import jagdx.IUnknown;
import jagdx.r;

public class Class218 implements Interface9_Impl2 {

	public long aLong8933 = 0L;

	public Class_ra_Sub2_Sub2 aClass_ra_Sub2_Sub2_8929;

	public Class86 aClass86_8930;

	public boolean aBoolean8932;

	public int anInt8931;

	public int anInt8934;

	public Class218(Class_ra_Sub2_Sub2 arg0, Class86 arg1, boolean arg2) {
		this.aClass_ra_Sub2_Sub2_8929 = arg0;
		this.aClass86_8930 = arg1;
		this.aBoolean8932 = arg2;
		this.aClass_ra_Sub2_Sub2_8929.method4993(this);
	}

	public void method103() {
		IDirect3DIndexBuffer.Unlock(this.aLong8933);
	}

	public int method93() {
		return this.anInt8934;
	}

	public Class86 method149() {
		return this.aClass86_8930;
	}

	public void method148(int arg0) {
		this.anInt8934 = this.aClass86_8930.anInt724 * arg0;
		if (this.anInt8934 <= this.anInt8931) {
			return;
		}
		if (this.aLong8933 != 0L) {
			IUnknown.Release(this.aLong8933);
		}
		int var2 = 8;
		byte var3;
		if (this.aBoolean8932) {
			var3 = 0;
			var2 |= 0x200;
		} else {
			var3 = 1;
		}
		this.aLong8933 = IDirect3DDevice.CreateIndexBuffer(this.aClass_ra_Sub2_Sub2_8929.aLong9891, this.anInt8934, var2, this.aClass86_8930 == Class86.aClass86_718 ? 101 : 102, var3);
		this.anInt8931 = this.anInt8934;
	}

	public long method94(int arg0, int arg1) {
		return IDirect3DIndexBuffer.Lock(this.aLong8933, arg0, arg1, this.aBoolean8932 ? 8192 : 0);
	}

	public void method95() {
		IDirect3DIndexBuffer.Unlock(this.aLong8933);
	}

	public void method156(int arg0) {
		this.anInt8934 = this.aClass86_8930.anInt724 * -1700895659 * -1615628035 * arg0;
		if (this.anInt8934 <= this.anInt8931) {
			return;
		}
		if (this.aLong8933 != 0L) {
			IUnknown.Release(this.aLong8933);
		}
		int var2 = 8;
		byte var3;
		if (this.aBoolean8932) {
			var3 = 0;
			var2 |= 0x200;
		} else {
			var3 = 1;
		}
		this.aLong8933 = IDirect3DDevice.CreateIndexBuffer(this.aClass_ra_Sub2_Sub2_8929.aLong9891, this.anInt8934, var2, this.aClass86_8930 == Class86.aClass86_718 ? 101 : 102, var3);
		this.anInt8931 = this.anInt8934;
	}

	public void method53() {
		if (this.aLong8933 != 0L) {
			IUnknown.Release(this.aLong8933);
			this.aLong8933 = 0L;
		}
		this.anInt8931 = 0;
		this.anInt8934 = 0;
		this.aClass_ra_Sub2_Sub2_8929.method4883(this);
	}

	public void method2257() {
		if (this.aLong8933 != 0L) {
			this.aClass_ra_Sub2_Sub2_8929.method5173(this.aLong8933);
			this.aLong8933 = 0L;
		}
		this.anInt8931 = 0;
		this.anInt8934 = 0;
	}

	public boolean method99(int arg0, int arg1, long arg2) {
		return r.j(IDirect3DIndexBuffer.Upload(this.aLong8933, arg0, arg1, this.aBoolean8932 ? 8192 : 0, arg2));
	}

	public void method52() {
		if (this.aLong8933 != 0L) {
			IUnknown.Release(this.aLong8933);
			this.aLong8933 = 0L;
		}
		this.anInt8931 = 0;
		this.anInt8934 = 0;
		this.aClass_ra_Sub2_Sub2_8929.method4883(this);
	}

	public Class86 method147() {
		return this.aClass86_8930;
	}

	public int method96() {
		return this.anInt8934;
	}

	public boolean method98(int arg0, int arg1, long arg2) {
		return r.j(IDirect3DIndexBuffer.Upload(this.aLong8933, arg0, arg1, this.aBoolean8932 ? 8192 : 0, arg2));
	}

	public long method92(int arg0, int arg1) {
		return IDirect3DIndexBuffer.Lock(this.aLong8933, arg0, arg1, this.aBoolean8932 ? 8192 : 0);
	}

	public long method101(int arg0, int arg1) {
		return IDirect3DIndexBuffer.Lock(this.aLong8933, arg0, arg1, this.aBoolean8932 ? 8192 : 0);
	}

	public long method102(int arg0, int arg1) {
		return IDirect3DIndexBuffer.Lock(this.aLong8933, arg0, arg1, this.aBoolean8932 ? 8192 : 0);
	}

	public Class86 method154() {
		return this.aClass86_8930;
	}

	public Class86 method150() {
		return this.aClass86_8930;
	}

	public Class86 method157() {
		return this.aClass86_8930;
	}

	public int method100() {
		return this.anInt8934;
	}

	public Class86 method153() {
		return this.aClass86_8930;
	}

	public boolean method97(int arg0, int arg1, long arg2) {
		return r.j(IDirect3DIndexBuffer.Upload(this.aLong8933, arg0, arg1, this.aBoolean8932 ? 8192 : 0, arg2));
	}

	public Class86 method151() {
		return this.aClass86_8930;
	}

	public Class86 method152() {
		return this.aClass86_8930;
	}

	public void method158(int arg0) {
		this.anInt8934 = this.aClass86_8930.anInt724 * -1700895659 * -1615628035 * arg0;
		if (this.anInt8934 <= this.anInt8931) {
			return;
		}
		if (this.aLong8933 != 0L) {
			IUnknown.Release(this.aLong8933);
		}
		int var2 = 8;
		byte var3;
		if (this.aBoolean8932) {
			var3 = 0;
			var2 |= 0x200;
		} else {
			var3 = 1;
		}
		this.aLong8933 = IDirect3DDevice.CreateIndexBuffer(this.aClass_ra_Sub2_Sub2_8929.aLong9891, this.anInt8934, var2, this.aClass86_8930 == Class86.aClass86_718 ? 101 : 102, var3);
		this.anInt8931 = this.anInt8934;
	}

	public void method155(int arg0) {
		this.anInt8934 = this.aClass86_8930.anInt724 * -1700895659 * -1615628035 * arg0;
		if (this.anInt8934 <= this.anInt8931) {
			return;
		}
		if (this.aLong8933 != 0L) {
			IUnknown.Release(this.aLong8933);
		}
		int var2 = 8;
		byte var3;
		if (this.aBoolean8932) {
			var3 = 0;
			var2 |= 0x200;
		} else {
			var3 = 1;
		}
		this.aLong8933 = IDirect3DDevice.CreateIndexBuffer(this.aClass_ra_Sub2_Sub2_8929.aLong9891, this.anInt8934, var2, this.aClass86_8930 == Class86.aClass86_718 ? 101 : 102, var3);
		this.anInt8931 = this.anInt8934;
	}
}
