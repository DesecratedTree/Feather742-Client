package deob;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DTexture;
import jagdx.IUnknown;
import jagdx.r;

public class Class229_Sub1_Sub1 extends Class229_Sub1 implements Interface11_Impl3_Impl1 {

	public boolean method120() {
		return super.method113();
	}

	public Interface8_Impl1_Impl2 method169(int arg0) {
		return new Class237(this, arg0);
	}

	public void method126(int arg0, int arg1, int arg2, int arg3, byte[] arg4, Class72 arg5, int arg6, int arg7) {
		super.method117(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public int method137() {
		return super.method137();
	}

	public int method108() {
		return super.method108();
	}

	public float method106(float arg0) {
		return super.method106(arg0);
	}

	public void method130(int arg0, int arg1, int arg2, int arg3, byte[] arg4, Class72 arg5, int arg6, int arg7) {
		super.method117(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public boolean method113() {
		return super.method113();
	}

	public float method134() {
		return super.method123();
	}

	public void method162() {
		super.method166();
	}

	public void method117(int arg0, int arg1, int arg2, int arg3, byte[] arg4, Class72 arg5, int arg6, int arg7) {
		super.method117(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public void method118(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		super.method118(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	public float method114() {
		return super.method114();
	}

	public boolean method115() {
		return super.method115();
	}

	public void method166() {
		super.method166();
	}

	public void method125(int arg0, int arg1, int arg2, int arg3, byte[] arg4, Class72 arg5, int arg6, int arg7) {
		super.method117(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public boolean method136() {
		return super.method115();
	}

	public void method52() {
		super.method53();
	}

	public int method116() {
		return super.method137();
	}

	public float method105(float arg0) {
		return super.method106(arg0);
	}

	public float method104(float arg0) {
		return super.method104(arg0);
	}

	public void method129(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		super.method118(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	public void method111(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		super.method118(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	public boolean method121() {
		return super.method113();
	}

	public float method123() {
		return super.method123();
	}

	public int method139() {
		return super.method108();
	}

	public void method53() {
		super.method53();
	}

	public void method109(boolean arg0, boolean arg1) {
		super.method109(arg0, arg1);
	}

	public void method122(boolean arg0, boolean arg1) {
		super.method109(arg0, arg1);
	}

	public void method127(int arg0, int arg1, int arg2, int arg3, byte[] arg4, Class72 arg5, int arg6, int arg7) {
		super.method117(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public float method132(float arg0) {
		return super.method104(arg0);
	}

	public void method107(int arg0, int arg1, int arg2, int arg3, byte[] arg4, Class72 arg5, int arg6, int arg7) {
		super.method117(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public void method128(int arg0, int arg1, int arg2, int arg3, byte[] arg4, Class72 arg5, int arg6, int arg7) {
		super.method117(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public void method131(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
		long var7 = IDirect3DTexture.GetSurfaceLevel(this.aLong6488, 0);
		long var9 = IDirect3DDevice.CreateRenderTarget(this.aClass_ra_Sub2_Sub2_6484.aLong9891, arg2, arg3, 21, 0, 0, true);
		if (r.j(IDirect3DDevice.StretchRect(this.aClass_ra_Sub2_Sub2_6484.aLong9891, var7, arg0, arg1, arg2, arg3, var9, 0, 0, arg2, arg3, 1))) {
			IDirect3DSurface.Download(var9, 0, 0, arg2, arg3, arg2 * 4, 16, this.aClass_ra_Sub2_Sub2_6484.aLong8459);
			this.aClass_ra_Sub2_Sub2_6484.aByteBuffer8458.clear();
			this.aClass_ra_Sub2_Sub2_6484.aByteBuffer8458.asIntBuffer().get(arg4);
		}
		IUnknown.Release(var7);
		IUnknown.Release(var9);
	}

	public void method119(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
		long var7 = IDirect3DTexture.GetSurfaceLevel(this.aLong6488, 0);
		long var9 = IDirect3DDevice.CreateRenderTarget(this.aClass_ra_Sub2_Sub2_6484.aLong9891, arg2, arg3, 21, 0, 0, true);
		if (r.j(IDirect3DDevice.StretchRect(this.aClass_ra_Sub2_Sub2_6484.aLong9891, var7, arg0, arg1, arg2, arg3, var9, 0, 0, arg2, arg3, 1))) {
			IDirect3DSurface.Download(var9, 0, 0, arg2, arg3, arg2 * 4, 16, this.aClass_ra_Sub2_Sub2_6484.aLong8459);
			this.aClass_ra_Sub2_Sub2_6484.aByteBuffer8458.clear();
			this.aClass_ra_Sub2_Sub2_6484.aByteBuffer8458.asIntBuffer().get(arg4);
		}
		IUnknown.Release(var7);
		IUnknown.Release(var9);
	}

	public float method133() {
		return super.method123();
	}

	public float method112(float arg0) {
		return super.method104(arg0);
	}

	public float method135() {
		return super.method114();
	}

	public void method163(Class189 arg0) {
		super.method163(arg0);
	}

	public void method164() {
		super.method166();
	}

	public Class229_Sub1_Sub1(Class_ra_Sub2_Sub2 arg0, Class72 arg1, Class86 arg2, int arg3, int arg4) {
		super(arg0, arg1, arg2, arg3, arg4, 1025, 0);
	}

	public void method165() {
		super.method166();
	}

	public void method167(Class189 arg0) {
		super.method163(arg0);
	}

	public int method124() {
		return super.method108();
	}

	public int method138() {
		return super.method108();
	}

	public void method110(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
		long var7 = IDirect3DTexture.GetSurfaceLevel(this.aLong6488, 0);
		long var9 = IDirect3DDevice.CreateRenderTarget(this.aClass_ra_Sub2_Sub2_6484.aLong9891, arg2, arg3, 21, 0, 0, true);
		if (r.j(IDirect3DDevice.StretchRect(this.aClass_ra_Sub2_Sub2_6484.aLong9891, var7, arg0, arg1, arg2, arg3, var9, 0, 0, arg2, arg3, 1))) {
			IDirect3DSurface.Download(var9, 0, 0, arg2, arg3, arg2 * 4, 16, this.aClass_ra_Sub2_Sub2_6484.aLong8459);
			this.aClass_ra_Sub2_Sub2_6484.aByteBuffer8458.clear();
			this.aClass_ra_Sub2_Sub2_6484.aByteBuffer8458.asIntBuffer().get(arg4);
		}
		IUnknown.Release(var7);
		IUnknown.Release(var9);
	}

	public int method140() {
		return super.method108();
	}

	public int method141() {
		return super.method108();
	}

	public Interface8_Impl1_Impl2 method168(int arg0) {
		return new Class237(this, arg0);
	}
}
