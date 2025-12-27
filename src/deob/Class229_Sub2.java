package deob;

import jagdx.IDirect3DCubeTexture;
import jagdx.IDirect3DDevice;
import java.nio.ByteBuffer;

public class Class229_Sub2 extends Class229 implements Interface11_Impl1 {

	public int anInt8917;

	public void method166() {
		this.aClass_ra_Sub2_Sub2_6484.method5165(this);
	}

	public void method164() {
		this.aClass_ra_Sub2_Sub2_6484.method5165(this);
	}

	public void method53() {
		super.method53();
	}

	public void method163(Class189 arg0) {
		super.method163(arg0);
	}

	public void method52() {
		super.method53();
	}

	public Class229_Sub2(Class_ra_Sub2_Sub2 arg0, int arg1, boolean arg2, int[][] arg3) {
		super(arg0, Class72.aClass72_620, Class86.aClass86_714, arg2 && arg0.aBoolean9911, arg1 * arg1 * 6);
		this.anInt8917 = arg1;
		if (this.aBoolean6487) {
			this.aLong6488 = IDirect3DDevice.CreateCubeTexture(this.aClass_ra_Sub2_Sub2_6484.aLong9891, this.anInt8917, 0, 1024, 21, 1);
		} else {
			this.aLong6488 = IDirect3DDevice.CreateCubeTexture(this.aClass_ra_Sub2_Sub2_6484.aLong9891, this.anInt8917, 1, 0, 21, 1);
		}
		ByteBuffer var5 = this.aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		for (int var6 = 0; var6 < 6; var6++) {
			var5.clear();
			var5.asIntBuffer().put(arg3[var6]);
			IDirect3DCubeTexture.Upload(this.aLong6488, var6, 0, 0, 0, this.anInt8917, this.anInt8917, this.anInt8917 * 4, 0, this.aClass_ra_Sub2_Sub2_6484.aLong8459);
		}
	}

	public void method162() {
		this.aClass_ra_Sub2_Sub2_6484.method5165(this);
	}

	public void method165() {
		this.aClass_ra_Sub2_Sub2_6484.method5165(this);
	}

	public void method167(Class189 arg0) {
		super.method163(arg0);
	}
}
