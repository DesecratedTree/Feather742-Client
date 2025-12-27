package deob;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import jagdx.r;

public class Class76_Sub2_Sub3_Sub1 extends Class76_Sub2_Sub3 {

	public static int anInt10105 = 16;

	public Interface8_Impl1_Impl1_Impl1 anInterface8_Impl1_Impl1_Impl1_10109 = null;

	public Interface8_Impl1_Impl2_Impl3[] anInterface8_Impl1_Impl2_Impl3Array10103 = new Interface8_Impl1_Impl2_Impl3[4];

	public Class_ra_Sub2_Sub2 aClass_ra_Sub2_Sub2_10104;

	public int anInt10106;

	public int anInt10107;

	public int anInt10108;

	public boolean aBoolean10110;

	public Class76_Sub2_Sub3_Sub1(Class_ra_Sub2_Sub2 arg0) {
		super(arg0);
		this.aClass_ra_Sub2_Sub2_10104 = arg0;
	}

	public int method856() {
		return this.anInt10108;
	}

	public int method857() {
		return this.anInt10106;
	}

	public void method900(Interface8_Impl1_Impl1 arg0) {
		Interface8_Impl1_Impl1_Impl1 var2 = (Interface8_Impl1_Impl1_Impl1) arg0;
		if (arg0 == null) {
			this.anInt10107 &= 0xFFFFFFEF;
			this.anInterface8_Impl1_Impl1_Impl1_10109 = null;
			if (this.aBoolean10110) {
				this.method921(0L);
			}
			if (this.anInt10107 == 0) {
				this.anInt10106 = 0;
				this.anInt10108 = 0;
			}
			return;
		}
		if (this.anInt10107 == 0) {
			this.anInt10106 = var2.method55();
			this.anInt10108 = var2.method54();
			this.method919();
		} else if (this.anInt10108 != var2.method54() || this.anInt10106 != var2.method55()) {
			throw new RuntimeException();
		}
		this.anInt10107 |= 0x10;
		this.anInterface8_Impl1_Impl1_Impl1_10109 = var2;
		if (this.aBoolean10110) {
			this.method921(var2.method187());
		}
	}

	public int method860() {
		return this.anInt10106;
	}

	public boolean method920(int arg0, long arg1) {
		return r.j(IDirect3DDevice.SetRenderTarget(this.aClass_ra_Sub2_Sub2_10104.aLong9891, arg0, arg1));
	}

	public boolean method921(long arg0) {
		return r.j(IDirect3DDevice.SetDepthStencilSurface(this.aClass_ra_Sub2_Sub2_10104.aLong9891, arg0));
	}

	public boolean method174() {
		for (int var1 = 0; var1 < 4; var1++) {
			Interface8_Impl1_Impl2_Impl3 var2 = this.anInterface8_Impl1_Impl2_Impl3Array10103[var1];
			if (var2 != null) {
				long var3 = var2.method187();
				this.method920(var1, var3);
			}
		}
		if (this.anInterface8_Impl1_Impl1_Impl1_10109 != null) {
			this.method921(this.anInterface8_Impl1_Impl1_Impl1_10109.method187());
		}
		this.aBoolean10110 = true;
		return super.method174();
	}

	public boolean method862() {
		for (int var1 = 1; var1 < 4; var1++) {
			Interface8_Impl1_Impl2_Impl3 var2 = this.anInterface8_Impl1_Impl2_Impl3Array10103[var1];
			if (var2 != null) {
				this.method920(var1, 0L);
			}
		}
		if (this.anInterface8_Impl1_Impl1_Impl1_10109 != null) {
			this.method921(0L);
		}
		this.aBoolean10110 = false;
		return true;
	}

	public void method903(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
		if (arg6) {
			long var9 = IDirect3DDevice.GetRenderTarget(this.aClass_ra_Sub2_Sub2_10104.aLong9891, 0);
			IDirect3DDevice.StretchRect(this.aClass_ra_Sub2_Sub2_10104.aLong9891, this.anInterface8_Impl1_Impl2_Impl3Array10103[0].method187(), arg0, arg1, arg2, arg3, var9, arg4, arg5, arg2, arg3, 0);
			IUnknown.Release(var9);
		}
	}

	public void method922() {
		if (this.anInterface8_Impl1_Impl1_Impl1_10109 != null) {
			this.anInterface8_Impl1_Impl1_Impl1_10109.method188();
		}
		for (int var1 = 0; var1 < this.anInterface8_Impl1_Impl2_Impl3Array10103.length; var1++) {
			if (this.anInterface8_Impl1_Impl2_Impl3Array10103[var1] != null) {
				this.anInterface8_Impl1_Impl2_Impl3Array10103[var1].method188();
			}
		}
	}

	public boolean method908() {
		return this.anInterface8_Impl1_Impl2_Impl3Array10103[0] != null;
	}

	public int method864() {
		return this.anInt10108;
	}

	public void method905(int arg0, Interface8_Impl1_Impl2 arg1) {
		int var3 = 0x1 << arg0;
		Interface8_Impl1_Impl2_Impl3 var4 = (Interface8_Impl1_Impl2_Impl3) arg1;
		if (arg1 == null) {
			this.anInt10107 &= ~var3;
			this.anInterface8_Impl1_Impl2_Impl3Array10103[arg0] = null;
			if (this.aBoolean10110) {
				this.method920(arg0, 0L);
			}
			if (this.anInt10107 == 0) {
				this.anInt10106 = 0;
				this.anInt10108 = 0;
			}
			return;
		}
		if (this.anInt10107 == 0) {
			this.anInt10106 = var4.method55();
			this.anInt10108 = var4.method54();
			this.method919();
		} else if (this.anInt10108 != var4.method54() || this.anInt10106 != var4.method55()) {
			throw new RuntimeException();
		}
		this.anInt10107 |= var3;
		this.anInterface8_Impl1_Impl2_Impl3Array10103[arg0] = var4;
		if (this.aBoolean10110) {
			this.method920(arg0, var4.method187());
		}
	}

	public int method859() {
		return this.anInt10108;
	}

	public int method855() {
		return this.anInt10106;
	}

	public int method861() {
		return this.anInt10106;
	}

	public boolean method902() {
		return this.anInterface8_Impl1_Impl2_Impl3Array10103[0] != null;
	}

	public void method906(Interface8_Impl1_Impl1 arg0) {
		Interface8_Impl1_Impl1_Impl1 var2 = (Interface8_Impl1_Impl1_Impl1) arg0;
		if (arg0 == null) {
			this.anInt10107 &= 0xFFFFFFEF;
			this.anInterface8_Impl1_Impl1_Impl1_10109 = null;
			if (this.aBoolean10110) {
				this.method921(0L);
			}
			if (this.anInt10107 == 0) {
				this.anInt10106 = 0;
				this.anInt10108 = 0;
			}
			return;
		}
		if (this.anInt10107 == 0) {
			this.anInt10106 = var2.method55();
			this.anInt10108 = var2.method54();
			this.method919();
		} else if (this.anInt10108 != var2.method54() || this.anInt10106 != var2.method55()) {
			throw new RuntimeException();
		}
		this.anInt10107 |= 0x10;
		this.anInterface8_Impl1_Impl1_Impl1_10109 = var2;
		if (this.aBoolean10110) {
			this.method921(var2.method187());
		}
	}

	public boolean method899() {
		return this.anInterface8_Impl1_Impl2_Impl3Array10103[0] != null;
	}

	public boolean method904() {
		return this.anInterface8_Impl1_Impl2_Impl3Array10103[0] != null;
	}

	public boolean method176() {
		for (int var1 = 0; var1 < 4; var1++) {
			Interface8_Impl1_Impl2_Impl3 var2 = this.anInterface8_Impl1_Impl2_Impl3Array10103[var1];
			if (var2 != null) {
				long var3 = var2.method187();
				this.method920(var1, var3);
			}
		}
		if (this.anInterface8_Impl1_Impl1_Impl1_10109 != null) {
			this.method921(this.anInterface8_Impl1_Impl1_Impl1_10109.method187());
		}
		this.aBoolean10110 = true;
		return super.method174();
	}

	public boolean method907() {
		return this.anInterface8_Impl1_Impl2_Impl3Array10103[0] != null;
	}

	public void method179() {
		if (this.anInterface8_Impl1_Impl1_Impl1_10109 != null) {
			this.anInterface8_Impl1_Impl1_Impl1_10109.method53();
		}
		for (int var1 = 0; var1 < this.anInterface8_Impl1_Impl2_Impl3Array10103.length; var1++) {
			if (this.anInterface8_Impl1_Impl2_Impl3Array10103[var1] != null) {
				this.anInterface8_Impl1_Impl2_Impl3Array10103[var1].method53();
			}
		}
	}

	public boolean method182() {
		for (int var1 = 0; var1 < 4; var1++) {
			Interface8_Impl1_Impl2_Impl3 var2 = this.anInterface8_Impl1_Impl2_Impl3Array10103[var1];
			if (var2 != null) {
				long var3 = var2.method187();
				this.method920(var1, var3);
			}
		}
		if (this.anInterface8_Impl1_Impl1_Impl1_10109 != null) {
			this.method921(this.anInterface8_Impl1_Impl1_Impl1_10109.method187());
		}
		this.aBoolean10110 = true;
		return super.method174();
	}

	public void method901(int arg0, Interface8_Impl1_Impl2 arg1) {
		int var3 = 0x1 << arg0;
		Interface8_Impl1_Impl2_Impl3 var4 = (Interface8_Impl1_Impl2_Impl3) arg1;
		if (arg1 == null) {
			this.anInt10107 &= ~var3;
			this.anInterface8_Impl1_Impl2_Impl3Array10103[arg0] = null;
			if (this.aBoolean10110) {
				this.method920(arg0, 0L);
			}
			if (this.anInt10107 == 0) {
				this.anInt10106 = 0;
				this.anInt10108 = 0;
			}
			return;
		}
		if (this.anInt10107 == 0) {
			this.anInt10106 = var4.method55();
			this.anInt10108 = var4.method54();
			this.method919();
		} else if (this.anInt10108 != var4.method54() || this.anInt10106 != var4.method55()) {
			throw new RuntimeException();
		}
		this.anInt10107 |= var3;
		this.anInterface8_Impl1_Impl2_Impl3Array10103[arg0] = var4;
		if (this.aBoolean10110) {
			this.method920(arg0, var4.method187());
		}
	}

	public boolean method863() {
		for (int var1 = 1; var1 < 4; var1++) {
			Interface8_Impl1_Impl2_Impl3 var2 = this.anInterface8_Impl1_Impl2_Impl3Array10103[var1];
			if (var2 != null) {
				this.method920(var1, 0L);
			}
		}
		if (this.anInterface8_Impl1_Impl1_Impl1_10109 != null) {
			this.method921(0L);
		}
		this.aBoolean10110 = false;
		return true;
	}

	public boolean method865() {
		for (int var1 = 1; var1 < 4; var1++) {
			Interface8_Impl1_Impl2_Impl3 var2 = this.anInterface8_Impl1_Impl2_Impl3Array10103[var1];
			if (var2 != null) {
				this.method920(var1, 0L);
			}
		}
		if (this.anInterface8_Impl1_Impl1_Impl1_10109 != null) {
			this.method921(0L);
		}
		this.aBoolean10110 = false;
		return true;
	}

	public int method858() {
		return this.anInt10108;
	}

	public void method185() {
		if (this.anInterface8_Impl1_Impl1_Impl1_10109 != null) {
			this.anInterface8_Impl1_Impl1_Impl1_10109.method53();
		}
		for (int var1 = 0; var1 < this.anInterface8_Impl1_Impl2_Impl3Array10103.length; var1++) {
			if (this.anInterface8_Impl1_Impl2_Impl3Array10103[var1] != null) {
				this.anInterface8_Impl1_Impl2_Impl3Array10103[var1].method53();
			}
		}
	}

	public void method180() {
		if (this.anInterface8_Impl1_Impl1_Impl1_10109 != null) {
			this.anInterface8_Impl1_Impl1_Impl1_10109.method53();
		}
		for (int var1 = 0; var1 < this.anInterface8_Impl1_Impl2_Impl3Array10103.length; var1++) {
			if (this.anInterface8_Impl1_Impl2_Impl3Array10103[var1] != null) {
				this.anInterface8_Impl1_Impl2_Impl3Array10103[var1].method53();
			}
		}
	}

	public void method910(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
		if (arg6) {
			long var9 = IDirect3DDevice.GetRenderTarget(this.aClass_ra_Sub2_Sub2_10104.aLong9891, 0);
			IDirect3DDevice.StretchRect(this.aClass_ra_Sub2_Sub2_10104.aLong9891, this.anInterface8_Impl1_Impl2_Impl3Array10103[0].method187(), arg0, arg1, arg2, arg3, var9, arg4, arg5, arg2, arg3, 0);
			IUnknown.Release(var9);
		}
	}

	public void method183() {
		if (this.anInterface8_Impl1_Impl1_Impl1_10109 != null) {
			this.anInterface8_Impl1_Impl1_Impl1_10109.method53();
		}
		for (int var1 = 0; var1 < this.anInterface8_Impl1_Impl2_Impl3Array10103.length; var1++) {
			if (this.anInterface8_Impl1_Impl2_Impl3Array10103[var1] != null) {
				this.anInterface8_Impl1_Impl2_Impl3Array10103[var1].method53();
			}
		}
	}

	public void method909(int arg0, Interface8_Impl1_Impl2 arg1) {
		int var3 = 0x1 << arg0;
		Interface8_Impl1_Impl2_Impl3 var4 = (Interface8_Impl1_Impl2_Impl3) arg1;
		if (arg1 == null) {
			this.anInt10107 &= ~var3;
			this.anInterface8_Impl1_Impl2_Impl3Array10103[arg0] = null;
			if (this.aBoolean10110) {
				this.method920(arg0, 0L);
			}
			if (this.anInt10107 == 0) {
				this.anInt10106 = 0;
				this.anInt10108 = 0;
			}
			return;
		}
		if (this.anInt10107 == 0) {
			this.anInt10106 = var4.method55();
			this.anInt10108 = var4.method54();
			this.method919();
		} else if (this.anInt10108 != var4.method54() || this.anInt10106 != var4.method55()) {
			throw new RuntimeException();
		}
		this.anInt10107 |= var3;
		this.anInterface8_Impl1_Impl2_Impl3Array10103[arg0] = var4;
		if (this.aBoolean10110) {
			this.method920(arg0, var4.method187());
		}
	}

	public boolean method178() {
		for (int var1 = 0; var1 < 4; var1++) {
			Interface8_Impl1_Impl2_Impl3 var2 = this.anInterface8_Impl1_Impl2_Impl3Array10103[var1];
			if (var2 != null) {
				long var3 = var2.method187();
				this.method920(var1, var3);
			}
		}
		if (this.anInterface8_Impl1_Impl1_Impl1_10109 != null) {
			this.method921(this.anInterface8_Impl1_Impl1_Impl1_10109.method187());
		}
		this.aBoolean10110 = true;
		return super.method174();
	}

	public void method181() {
		if (this.anInterface8_Impl1_Impl1_Impl1_10109 != null) {
			this.anInterface8_Impl1_Impl1_Impl1_10109.method53();
		}
		for (int var1 = 0; var1 < this.anInterface8_Impl1_Impl2_Impl3Array10103.length; var1++) {
			if (this.anInterface8_Impl1_Impl2_Impl3Array10103[var1] != null) {
				this.anInterface8_Impl1_Impl2_Impl3Array10103[var1].method53();
			}
		}
	}
}
