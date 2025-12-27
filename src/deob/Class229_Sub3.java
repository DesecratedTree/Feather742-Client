package deob;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVolumeTexture;
import java.nio.ByteBuffer;

public class Class229_Sub3 extends Class229 implements Interface11_Impl2 {

	public int anInt8920;

	public int anInt8919;

	public int anInt8918;

	public void method163(Class189 arg0) {
		super.method163(arg0);
	}

	public long method2318() {
		return this.aLong6488;
	}

	public void method166() {
		this.aClass_ra_Sub2_Sub2_6484.method5164(this);
	}

	public void method52() {
		super.method53();
	}

	public void method165() {
		this.aClass_ra_Sub2_Sub2_6484.method5164(this);
	}

	public void method53() {
		super.method53();
	}

	public void method164() {
		this.aClass_ra_Sub2_Sub2_6484.method5164(this);
	}

	public void method162() {
		this.aClass_ra_Sub2_Sub2_6484.method5164(this);
	}

	public long method2325() {
		return this.aLong6488;
	}

	public void method167(Class189 arg0) {
		super.method163(arg0);
	}

	public long method2326() {
		return this.aLong6488;
	}

	public Class229_Sub3(Class_ra_Sub2_Sub2 arg0, Class72 arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6) {
		super(arg0, arg1, Class86.aClass86_714, false, arg2 * arg3 * arg4);
		this.anInt8920 = arg2;
		this.anInt8919 = arg3;
		this.anInt8918 = arg4;
		this.aLong6488 = IDirect3DDevice.CreateVolumeTexture(this.aClass_ra_Sub2_Sub2_6484.aLong9891, arg2, arg3, arg4, 1, 0, Class_ra_Sub2_Sub2.method5183(arg1, this.aClass86_6486), 1);
		ByteBuffer var8 = this.aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		var8.clear();
		var8.put(arg6);
		IDirect3DVolumeTexture.Upload(this.aLong6488, 0, 0, 0, 0, this.anInt8920, this.anInt8919, this.anInt8918, this.anInt8920 * arg1.anInt609, 0, this.aClass_ra_Sub2_Sub2_6484.aLong8459);
	}
}
