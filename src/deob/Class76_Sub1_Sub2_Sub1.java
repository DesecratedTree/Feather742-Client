package deob;

import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSwapChain;
import jagdx.IUnknown;
import jagdx.r;
import java.awt.Canvas;

public class Class76_Sub1_Sub2_Sub1 extends Class76_Sub1_Sub2 implements Interface13 {

	public boolean aBoolean10083 = false;

	public boolean aBoolean10091 = false;

	public Canvas aCanvas10085;

	public Class_ra_Sub2_Sub2 aClass_ra_Sub2_Sub2_10084;

	public int anInt10088;

	public int anInt10089;

	public long aLong10086;

	public long aLong10087;

	public long aLong10090;

	public D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS10092;

	public Class76_Sub1_Sub2_Sub1(Class_ra_Sub2_Sub2 arg0, Canvas arg1, int arg2, int arg3, boolean arg4) {
		super(arg0);
		this.aCanvas10085 = arg1;
		this.aClass_ra_Sub2_Sub2_10084 = arg0;
		this.anInt10088 = arg2;
		this.anInt10089 = arg3;
		this.aBoolean10091 = arg4;
		this.method173();
		this.aClass_ra_Sub2_Sub2_10084.method5158(this);
	}

	public void method882(int arg0, int arg1) {
		this.method179();
		this.anInt10088 = arg0;
		this.anInt10089 = arg1;
		if (this.aBoolean10091) {
			this.aClass_ra_Sub2_Sub2_10084.method5178();
		}
		this.method173();
		super.method876(arg0, arg1);
	}

	public void method173() {
		this.method179();
		this.aD3DPRESENT_PARAMETERS10092 = new D3DPRESENT_PARAMETERS(this.aCanvas10085);
		this.aD3DPRESENT_PARAMETERS10092.Windowed = true;
		this.aD3DPRESENT_PARAMETERS10092.BackBufferCount = 1;
		this.aD3DPRESENT_PARAMETERS10092.BackBufferWidth = this.anInt10088;
		this.aD3DPRESENT_PARAMETERS10092.BackBufferHeight = this.anInt10089;
		if (this.aBoolean10091) {
			this.aLong10086 = IDirect3DDevice.GetSwapChain(this.aClass_ra_Sub2_Sub2_10084.aLong9891, 0);
			this.aLong10087 = IDirect3DSwapChain.GetBackBuffer(this.aLong10086, 0, 0);
			this.aLong10090 = IDirect3DDevice.GetDepthStencilSurface(this.aClass_ra_Sub2_Sub2_10084.aLong9891);
		} else if (Class_ra_Sub2_Sub2.method5172(this.aClass_ra_Sub2_Sub2_10084.anInt9918, this.aClass_ra_Sub2_Sub2_10084.anInt9889, this.aClass_ra_Sub2_Sub2_10084.aLong9910, this.aClass_ra_Sub2_Sub2_10084.anInt8490, this.aD3DPRESENT_PARAMETERS10092)) {
			int var1 = this.aD3DPRESENT_PARAMETERS10092.AutoDepthStencilFormat;
			this.aLong10086 = IDirect3DDevice.CreateAdditionalSwapChain(this.aClass_ra_Sub2_Sub2_10084.aLong9891, this.aD3DPRESENT_PARAMETERS10092);
			this.aLong10087 = IDirect3DSwapChain.GetBackBuffer(this.aLong10086, 0, 0);
			this.aLong10090 = IDirect3DDevice.CreateDepthStencilSurface(this.aClass_ra_Sub2_Sub2_10084.aLong9891, this.anInt10088, this.anInt10089, var1, this.aD3DPRESENT_PARAMETERS10092.MultiSampleType, this.aD3DPRESENT_PARAMETERS10092.MultiSampleQuality, false);
		} else {
			throw new RuntimeException();
		}
		if (this.aBoolean10083) {
			this.method174();
		}
	}

	public int method856() {
		return this.anInt10088;
	}

	public int method873(int arg0, int arg1) {
		return IDirect3DSwapChain.Present(this.aLong10086, 0);
	}

	public boolean method174() {
		this.aBoolean10083 = true;
		if (r.r(IDirect3DDevice.SetRenderTarget(this.aClass_ra_Sub2_Sub2_10084.aLong9891, 0, this.aLong10087))) {
			return false;
		} else if (r.r(IDirect3DDevice.SetDepthStencilSurface(this.aClass_ra_Sub2_Sub2_10084.aLong9891, this.aLong10090))) {
			return false;
		} else {
			return super.method174();
		}
	}

	public boolean method862() {
		this.aBoolean10083 = false;
		return r.j(IDirect3DDevice.SetDepthStencilSurface(this.aClass_ra_Sub2_Sub2_10084.aLong9891, 0L));
	}

	public boolean method863() {
		this.aBoolean10083 = false;
		return r.j(IDirect3DDevice.SetDepthStencilSurface(this.aClass_ra_Sub2_Sub2_10084.aLong9891, 0L));
	}

	public int method883(int arg0, int arg1) {
		return IDirect3DSwapChain.Present(this.aLong10086, 0);
	}

	public int method855() {
		return this.anInt10089;
	}

	public void method184() {
		this.method179();
		this.aD3DPRESENT_PARAMETERS10092 = new D3DPRESENT_PARAMETERS(this.aCanvas10085);
		this.aD3DPRESENT_PARAMETERS10092.Windowed = true;
		this.aD3DPRESENT_PARAMETERS10092.BackBufferCount = 1;
		this.aD3DPRESENT_PARAMETERS10092.BackBufferWidth = this.anInt10088;
		this.aD3DPRESENT_PARAMETERS10092.BackBufferHeight = this.anInt10089;
		if (this.aBoolean10091) {
			this.aLong10086 = IDirect3DDevice.GetSwapChain(this.aClass_ra_Sub2_Sub2_10084.aLong9891, 0);
			this.aLong10087 = IDirect3DSwapChain.GetBackBuffer(this.aLong10086, 0, 0);
			this.aLong10090 = IDirect3DDevice.GetDepthStencilSurface(this.aClass_ra_Sub2_Sub2_10084.aLong9891);
		} else if (Class_ra_Sub2_Sub2.method5172(this.aClass_ra_Sub2_Sub2_10084.anInt9918, this.aClass_ra_Sub2_Sub2_10084.anInt9889, this.aClass_ra_Sub2_Sub2_10084.aLong9910, this.aClass_ra_Sub2_Sub2_10084.anInt8490, this.aD3DPRESENT_PARAMETERS10092)) {
			int var1 = this.aD3DPRESENT_PARAMETERS10092.AutoDepthStencilFormat;
			this.aLong10086 = IDirect3DDevice.CreateAdditionalSwapChain(this.aClass_ra_Sub2_Sub2_10084.aLong9891, this.aD3DPRESENT_PARAMETERS10092);
			this.aLong10087 = IDirect3DSwapChain.GetBackBuffer(this.aLong10086, 0, 0);
			this.aLong10090 = IDirect3DDevice.CreateDepthStencilSurface(this.aClass_ra_Sub2_Sub2_10084.aLong9891, this.anInt10088, this.anInt10089, var1, this.aD3DPRESENT_PARAMETERS10092.MultiSampleType, this.aD3DPRESENT_PARAMETERS10092.MultiSampleQuality, false);
		} else {
			throw new RuntimeException();
		}
		if (this.aBoolean10083) {
			this.method174();
		}
	}

	public void method888() {
		if (this.aLong10087 != 0L) {
			IUnknown.Release(this.aLong10087);
			this.aLong10087 = 0L;
		}
		if (this.aLong10090 != 0L) {
			IUnknown.Release(this.aLong10090);
			this.aLong10090 = 0L;
		}
		if (this.aLong10086 != 0L) {
			IUnknown.Release(this.aLong10086);
			this.aLong10086 = 0L;
		}
		this.aClass_ra_Sub2_Sub2_10084.method5159(this);
	}

	public void method183() {
		if (this.aLong10087 != 0L) {
			IUnknown.Release(this.aLong10087);
			this.aLong10087 = 0L;
		}
		if (this.aLong10090 != 0L) {
			IUnknown.Release(this.aLong10090);
			this.aLong10090 = 0L;
		}
		if (this.aLong10086 != 0L) {
			IUnknown.Release(this.aLong10086);
			this.aLong10086 = 0L;
		}
		this.aClass_ra_Sub2_Sub2_10084.method5159(this);
	}

	public int method857() {
		return this.anInt10089;
	}

	public int method884(int arg0, int arg1) {
		return IDirect3DSwapChain.Present(this.aLong10086, 0);
	}

	public int method860() {
		return this.anInt10089;
	}

	public int method859() {
		return this.anInt10088;
	}

	public int method861() {
		return this.anInt10089;
	}

	public boolean method176() {
		this.aBoolean10083 = true;
		if (r.r(IDirect3DDevice.SetRenderTarget(this.aClass_ra_Sub2_Sub2_10084.aLong9891, 0, this.aLong10087))) {
			return false;
		} else if (r.r(IDirect3DDevice.SetDepthStencilSurface(this.aClass_ra_Sub2_Sub2_10084.aLong9891, this.aLong10090))) {
			return false;
		} else {
			return super.method174();
		}
	}

	public boolean method182() {
		this.aBoolean10083 = true;
		if (r.r(IDirect3DDevice.SetRenderTarget(this.aClass_ra_Sub2_Sub2_10084.aLong9891, 0, this.aLong10087))) {
			return false;
		} else if (r.r(IDirect3DDevice.SetDepthStencilSurface(this.aClass_ra_Sub2_Sub2_10084.aLong9891, this.aLong10090))) {
			return false;
		} else {
			return super.method174();
		}
	}

	public boolean method178() {
		this.aBoolean10083 = true;
		if (r.r(IDirect3DDevice.SetRenderTarget(this.aClass_ra_Sub2_Sub2_10084.aLong9891, 0, this.aLong10087))) {
			return false;
		} else if (r.r(IDirect3DDevice.SetDepthStencilSurface(this.aClass_ra_Sub2_Sub2_10084.aLong9891, this.aLong10090))) {
			return false;
		} else {
			return super.method174();
		}
	}

	public void method175() {
		this.method179();
		this.aD3DPRESENT_PARAMETERS10092 = new D3DPRESENT_PARAMETERS(this.aCanvas10085);
		this.aD3DPRESENT_PARAMETERS10092.Windowed = true;
		this.aD3DPRESENT_PARAMETERS10092.BackBufferCount = 1;
		this.aD3DPRESENT_PARAMETERS10092.BackBufferWidth = this.anInt10088;
		this.aD3DPRESENT_PARAMETERS10092.BackBufferHeight = this.anInt10089;
		if (this.aBoolean10091) {
			this.aLong10086 = IDirect3DDevice.GetSwapChain(this.aClass_ra_Sub2_Sub2_10084.aLong9891, 0);
			this.aLong10087 = IDirect3DSwapChain.GetBackBuffer(this.aLong10086, 0, 0);
			this.aLong10090 = IDirect3DDevice.GetDepthStencilSurface(this.aClass_ra_Sub2_Sub2_10084.aLong9891);
		} else if (Class_ra_Sub2_Sub2.method5172(this.aClass_ra_Sub2_Sub2_10084.anInt9918, this.aClass_ra_Sub2_Sub2_10084.anInt9889, this.aClass_ra_Sub2_Sub2_10084.aLong9910, this.aClass_ra_Sub2_Sub2_10084.anInt8490, this.aD3DPRESENT_PARAMETERS10092)) {
			int var1 = this.aD3DPRESENT_PARAMETERS10092.AutoDepthStencilFormat;
			this.aLong10086 = IDirect3DDevice.CreateAdditionalSwapChain(this.aClass_ra_Sub2_Sub2_10084.aLong9891, this.aD3DPRESENT_PARAMETERS10092);
			this.aLong10087 = IDirect3DSwapChain.GetBackBuffer(this.aLong10086, 0, 0);
			this.aLong10090 = IDirect3DDevice.CreateDepthStencilSurface(this.aClass_ra_Sub2_Sub2_10084.aLong9891, this.anInt10088, this.anInt10089, var1, this.aD3DPRESENT_PARAMETERS10092.MultiSampleType, this.aD3DPRESENT_PARAMETERS10092.MultiSampleQuality, false);
		} else {
			throw new RuntimeException();
		}
		if (this.aBoolean10083) {
			this.method174();
		}
	}

	public boolean method865() {
		this.aBoolean10083 = false;
		return r.j(IDirect3DDevice.SetDepthStencilSurface(this.aClass_ra_Sub2_Sub2_10084.aLong9891, 0L));
	}

	public void method185() {
		if (this.aLong10087 != 0L) {
			IUnknown.Release(this.aLong10087);
			this.aLong10087 = 0L;
		}
		if (this.aLong10090 != 0L) {
			IUnknown.Release(this.aLong10090);
			this.aLong10090 = 0L;
		}
		if (this.aLong10086 != 0L) {
			IUnknown.Release(this.aLong10086);
			this.aLong10086 = 0L;
		}
		this.aClass_ra_Sub2_Sub2_10084.method5159(this);
	}

	public void method180() {
		if (this.aLong10087 != 0L) {
			IUnknown.Release(this.aLong10087);
			this.aLong10087 = 0L;
		}
		if (this.aLong10090 != 0L) {
			IUnknown.Release(this.aLong10090);
			this.aLong10090 = 0L;
		}
		if (this.aLong10086 != 0L) {
			IUnknown.Release(this.aLong10086);
			this.aLong10086 = 0L;
		}
		this.aClass_ra_Sub2_Sub2_10084.method5159(this);
	}

	public void method876(int arg0, int arg1) {
		this.method179();
		this.anInt10088 = arg0;
		this.anInt10089 = arg1;
		if (this.aBoolean10091) {
			this.aClass_ra_Sub2_Sub2_10084.method5178();
		}
		this.method173();
		super.method876(arg0, arg1);
	}

	public int method877() {
		return IDirect3DSwapChain.Present(this.aLong10086, 0);
	}

	public int method879() {
		return IDirect3DSwapChain.Present(this.aLong10086, 0);
	}

	public int method880(int arg0, int arg1) {
		return IDirect3DSwapChain.Present(this.aLong10086, 0);
	}

	public int method881(int arg0, int arg1) {
		return IDirect3DSwapChain.Present(this.aLong10086, 0);
	}

	public int method875(int arg0, int arg1) {
		return IDirect3DSwapChain.Present(this.aLong10086, 0);
	}

	public int method858() {
		return this.anInt10088;
	}

	public int method878() {
		return IDirect3DSwapChain.Present(this.aLong10086, 0);
	}

	public int method885(int arg0, int arg1) {
		return IDirect3DSwapChain.Present(this.aLong10086, 0);
	}

	public int method874() {
		return IDirect3DSwapChain.Present(this.aLong10086, 0);
	}

	public void method177() {
		this.method179();
		this.aD3DPRESENT_PARAMETERS10092 = new D3DPRESENT_PARAMETERS(this.aCanvas10085);
		this.aD3DPRESENT_PARAMETERS10092.Windowed = true;
		this.aD3DPRESENT_PARAMETERS10092.BackBufferCount = 1;
		this.aD3DPRESENT_PARAMETERS10092.BackBufferWidth = this.anInt10088;
		this.aD3DPRESENT_PARAMETERS10092.BackBufferHeight = this.anInt10089;
		if (this.aBoolean10091) {
			this.aLong10086 = IDirect3DDevice.GetSwapChain(this.aClass_ra_Sub2_Sub2_10084.aLong9891, 0);
			this.aLong10087 = IDirect3DSwapChain.GetBackBuffer(this.aLong10086, 0, 0);
			this.aLong10090 = IDirect3DDevice.GetDepthStencilSurface(this.aClass_ra_Sub2_Sub2_10084.aLong9891);
		} else if (Class_ra_Sub2_Sub2.method5172(this.aClass_ra_Sub2_Sub2_10084.anInt9918, this.aClass_ra_Sub2_Sub2_10084.anInt9889, this.aClass_ra_Sub2_Sub2_10084.aLong9910, this.aClass_ra_Sub2_Sub2_10084.anInt8490, this.aD3DPRESENT_PARAMETERS10092)) {
			int var1 = this.aD3DPRESENT_PARAMETERS10092.AutoDepthStencilFormat;
			this.aLong10086 = IDirect3DDevice.CreateAdditionalSwapChain(this.aClass_ra_Sub2_Sub2_10084.aLong9891, this.aD3DPRESENT_PARAMETERS10092);
			this.aLong10087 = IDirect3DSwapChain.GetBackBuffer(this.aLong10086, 0, 0);
			this.aLong10090 = IDirect3DDevice.CreateDepthStencilSurface(this.aClass_ra_Sub2_Sub2_10084.aLong9891, this.anInt10088, this.anInt10089, var1, this.aD3DPRESENT_PARAMETERS10092.MultiSampleType, this.aD3DPRESENT_PARAMETERS10092.MultiSampleQuality, false);
		} else {
			throw new RuntimeException();
		}
		if (this.aBoolean10083) {
			this.method174();
		}
	}

	public int method864() {
		return this.anInt10088;
	}

	public void method179() {
		if (this.aLong10087 != 0L) {
			IUnknown.Release(this.aLong10087);
			this.aLong10087 = 0L;
		}
		if (this.aLong10090 != 0L) {
			IUnknown.Release(this.aLong10090);
			this.aLong10090 = 0L;
		}
		if (this.aLong10086 != 0L) {
			IUnknown.Release(this.aLong10086);
			this.aLong10086 = 0L;
		}
		this.aClass_ra_Sub2_Sub2_10084.method5159(this);
	}

	public void method186() {
		this.method179();
		this.aD3DPRESENT_PARAMETERS10092 = new D3DPRESENT_PARAMETERS(this.aCanvas10085);
		this.aD3DPRESENT_PARAMETERS10092.Windowed = true;
		this.aD3DPRESENT_PARAMETERS10092.BackBufferCount = 1;
		this.aD3DPRESENT_PARAMETERS10092.BackBufferWidth = this.anInt10088;
		this.aD3DPRESENT_PARAMETERS10092.BackBufferHeight = this.anInt10089;
		if (this.aBoolean10091) {
			this.aLong10086 = IDirect3DDevice.GetSwapChain(this.aClass_ra_Sub2_Sub2_10084.aLong9891, 0);
			this.aLong10087 = IDirect3DSwapChain.GetBackBuffer(this.aLong10086, 0, 0);
			this.aLong10090 = IDirect3DDevice.GetDepthStencilSurface(this.aClass_ra_Sub2_Sub2_10084.aLong9891);
		} else if (Class_ra_Sub2_Sub2.method5172(this.aClass_ra_Sub2_Sub2_10084.anInt9918, this.aClass_ra_Sub2_Sub2_10084.anInt9889, this.aClass_ra_Sub2_Sub2_10084.aLong9910, this.aClass_ra_Sub2_Sub2_10084.anInt8490, this.aD3DPRESENT_PARAMETERS10092)) {
			int var1 = this.aD3DPRESENT_PARAMETERS10092.AutoDepthStencilFormat;
			this.aLong10086 = IDirect3DDevice.CreateAdditionalSwapChain(this.aClass_ra_Sub2_Sub2_10084.aLong9891, this.aD3DPRESENT_PARAMETERS10092);
			this.aLong10087 = IDirect3DSwapChain.GetBackBuffer(this.aLong10086, 0, 0);
			this.aLong10090 = IDirect3DDevice.CreateDepthStencilSurface(this.aClass_ra_Sub2_Sub2_10084.aLong9891, this.anInt10088, this.anInt10089, var1, this.aD3DPRESENT_PARAMETERS10092.MultiSampleType, this.aD3DPRESENT_PARAMETERS10092.MultiSampleQuality, false);
		} else {
			throw new RuntimeException();
		}
		if (this.aBoolean10083) {
			this.method174();
		}
	}

	public void method181() {
		if (this.aLong10087 != 0L) {
			IUnknown.Release(this.aLong10087);
			this.aLong10087 = 0L;
		}
		if (this.aLong10090 != 0L) {
			IUnknown.Release(this.aLong10090);
			this.aLong10090 = 0L;
		}
		if (this.aLong10086 != 0L) {
			IUnknown.Release(this.aLong10086);
			this.aLong10086 = 0L;
		}
		this.aClass_ra_Sub2_Sub2_10084.method5159(this);
	}
}
