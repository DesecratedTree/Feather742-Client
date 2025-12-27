package deob;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DTexture;
import java.nio.ByteBuffer;

public class Class229_Sub1 extends Class229 implements Interface11_Impl3 {

	public int anInt8914;

	public int anInt8912;

	public float aFloat8911;

	public float aFloat8913;

	public boolean aBoolean8915;

	public boolean aBoolean8916;

	public int method108() {
		return this.anInt8912;
	}

	public Class229_Sub1(Class_ra_Sub2_Sub2 arg0, Class72 arg1, Class86 arg2, int arg3, int arg4, int arg5, int arg6) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.aClass_ra_Sub2_Sub2_6484.aBoolean9909) {
			this.anInt8914 = arg3;
			this.anInt8912 = arg4;
			this.aFloat8911 = 1.0F;
			this.aFloat8913 = 1.0F;
		} else {
			this.anInt8914 = Class136.method1594(arg3, 1769006695);
			this.anInt8912 = Class136.method1594(arg4, 2030650992);
			this.aFloat8911 = (float) arg3 / (float) this.anInt8914;
			this.aFloat8913 = (float) arg4 / (float) this.anInt8912;
		}
		this.aLong6488 = IDirect3DDevice.CreateTexture(this.aClass_ra_Sub2_Sub2_6484.aLong9891, arg3, arg4, 0, arg5, Class_ra_Sub2_Sub2.method5183(this.aClass72_6485, this.aClass86_6486), arg6);
	}

	public Class229_Sub1(Class_ra_Sub2_Sub2 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
		super(arg0, Class72.aClass72_620, Class86.aClass86_714, arg3 && arg0.aBoolean9888, arg1 * arg2);
		if (this.aClass_ra_Sub2_Sub2_6484.aBoolean9909) {
			this.anInt8914 = arg1;
			this.anInt8912 = arg2;
			this.aFloat8911 = 1.0F;
			this.aFloat8913 = 1.0F;
		} else {
			this.anInt8914 = Class136.method1594(arg1, 1955019530);
			this.anInt8912 = Class136.method1594(arg2, 2013170622);
			this.aFloat8911 = (float) arg1 / (float) this.anInt8914;
			this.aFloat8913 = (float) arg2 / (float) this.anInt8912;
			if (arg1 != this.anInt8914 || arg2 != this.anInt8912) {
				arg4 = this.method2320(arg1, arg2, this.anInt8914, this.anInt8912, arg4, arg5, arg6);
				arg5 = 0;
				arg6 = this.anInt8914;
			}
		}
		if (arg3) {
			this.aLong6488 = IDirect3DDevice.CreateTexture(this.aClass_ra_Sub2_Sub2_6484.aLong9891, this.anInt8914, this.anInt8912, 0, 1024, 21, 1);
		} else {
			this.aLong6488 = IDirect3DDevice.CreateTexture(this.aClass_ra_Sub2_Sub2_6484.aLong9891, this.anInt8914, this.anInt8912, 1, 0, 21, 1);
		}
		if (arg6 == 0) {
			arg6 = this.anInt8914;
		}
		ByteBuffer var8 = this.aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		var8.clear();
		var8.asIntBuffer().put(arg4, arg5, arg6 * this.anInt8912);
		IDirect3DTexture.Upload(this.aLong6488, 0, 0, 0, this.anInt8914, this.anInt8912, arg6 * this.aClass72_6485.anInt609, 0, this.aClass_ra_Sub2_Sub2_6484.aLong8459);
	}

	public Class229_Sub1(Class_ra_Sub2_Sub2 arg0, Class72 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
		super(arg0, arg1, Class86.aClass86_714, arg4 && arg0.aBoolean9888, arg2 * arg3);
		if (this.aClass_ra_Sub2_Sub2_6484.aBoolean9909) {
			this.anInt8914 = arg2;
			this.anInt8912 = arg3;
			this.aFloat8911 = 1.0F;
			this.aFloat8913 = 1.0F;
		} else {
			this.anInt8914 = Class136.method1594(arg2, 1775765356);
			this.anInt8912 = Class136.method1594(arg3, 1896573775);
			this.aFloat8911 = (float) arg2 / (float) this.anInt8914;
			this.aFloat8913 = (float) arg3 / (float) this.anInt8912;
			if (arg2 != this.anInt8914 || arg3 != this.anInt8912) {
				arg5 = this.method2322(arg2, arg3, this.anInt8914, this.anInt8912, arg5, arg6, arg7, arg1.anInt609);
				arg6 = 0;
				arg7 = this.anInt8914;
			}
		}
		if (arg4) {
			this.aLong6488 = IDirect3DDevice.CreateTexture(this.aClass_ra_Sub2_Sub2_6484.aLong9891, this.anInt8914, this.anInt8912, 0, 1024, Class_ra_Sub2_Sub2.method5183(this.aClass72_6485, Class86.aClass86_714), 1);
		} else {
			this.aLong6488 = IDirect3DDevice.CreateTexture(this.aClass_ra_Sub2_Sub2_6484.aLong9891, this.anInt8914, this.anInt8912, 1, 0, Class_ra_Sub2_Sub2.method5183(this.aClass72_6485, Class86.aClass86_714), 1);
		}
		if (arg7 == 0) {
			arg7 = this.anInt8914;
		}
		ByteBuffer var9 = this.aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		var9.clear();
		Class72 var10 = this.aClass72_6485;
		if (this.aClass72_6485 != null) {
		}
		if (var10 == Class72.aClass72_617) {
			var9.put(arg5, arg6, this.anInt8912 * this.anInt8914 / 2);
			IDirect3DTexture.Upload(this.aLong6488, 0, 0, 0, this.anInt8914, this.anInt8912 / 4, this.anInt8914 / 4 * 8, 0, this.aClass_ra_Sub2_Sub2_6484.aLong8459);
		} else {
			Class72 var11 = this.aClass72_6485;
			if (this.aClass72_6485 != null) {
			}
			if (var11 == Class72.aClass72_618) {
				var9.put(arg5, arg6, this.anInt8912 * this.anInt8914);
				IDirect3DTexture.Upload(this.aLong6488, 0, 0, 0, this.anInt8914, this.anInt8912 / 4, this.anInt8914 / 4 * 16, 0, this.aClass_ra_Sub2_Sub2_6484.aLong8459);
			} else {
				var9.put(arg5, arg6, arg7 * this.anInt8912);
				IDirect3DTexture.Upload(this.aLong6488, 0, 0, 0, this.anInt8914, this.anInt8912, arg7 * this.aClass72_6485.anInt609, 0, this.aClass_ra_Sub2_Sub2_6484.aLong8459);
			}
		}
	}

	public Class229_Sub1(Class_ra_Sub2_Sub2 arg0, Class72 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
		super(arg0, arg1, Class86.aClass86_714, arg4 && arg0.aBoolean9888, arg2 * arg3);
		if (this.aClass_ra_Sub2_Sub2_6484.aBoolean9909) {
			this.anInt8914 = arg2;
			this.anInt8912 = arg3;
			this.aFloat8911 = 1.0F;
			this.aFloat8913 = 1.0F;
		} else {
			this.anInt8914 = Class136.method1594(arg2, 2073982620);
			this.anInt8912 = Class136.method1594(arg3, 1980444089);
			this.aFloat8911 = (float) arg2 / (float) this.anInt8914;
			this.aFloat8913 = (float) arg3 / (float) this.anInt8912;
			if (arg2 != this.anInt8914 || arg3 != this.anInt8912) {
				arg5 = this.method2321(arg2, arg3, this.anInt8914, this.anInt8912, arg5, arg6, arg7, arg1.anInt609);
				arg6 = 0;
				arg7 = this.anInt8914;
			}
		}
		if (arg4) {
			this.aLong6488 = IDirect3DDevice.CreateTexture(this.aClass_ra_Sub2_Sub2_6484.aLong9891, this.anInt8914, this.anInt8912, 0, 1024, Class_ra_Sub2_Sub2.method5183(this.aClass72_6485, Class86.aClass86_717), 1);
		} else {
			this.aLong6488 = IDirect3DDevice.CreateTexture(this.aClass_ra_Sub2_Sub2_6484.aLong9891, this.anInt8914, this.anInt8912, 1, 0, Class_ra_Sub2_Sub2.method5183(this.aClass72_6485, Class86.aClass86_717), 1);
		}
		if (arg7 == 0) {
			arg7 = this.anInt8914;
		}
		ByteBuffer var9 = this.aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		var9.clear();
		var9.asFloatBuffer().put(arg5, arg6, arg7 * this.anInt8912 * this.aClass72_6485.anInt609);
		IDirect3DTexture.Upload(this.aLong6488, 0, 0, 0, this.anInt8914, this.anInt8912, arg7 * this.aClass72_6485.anInt609 * 4, 0, this.aClass_ra_Sub2_Sub2_6484.aLong8459);
	}

	public void method166() {
		this.aClass_ra_Sub2_Sub2_6484.method5163(this);
	}

	public float method105(float arg0) {
		return arg0 / (float) this.anInt8914;
	}

	public void method125(int arg0, int arg1, int arg2, int arg3, byte[] arg4, Class72 arg5, int arg6, int arg7) {
		if (this.aClass72_6485 != arg5 || this.aClass86_6486 != Class86.aClass86_714) {
			throw new RuntimeException();
		}
		if (arg7 == 0) {
			arg7 = arg2;
		}
		ByteBuffer var9 = this.aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		var9.clear();
		var9.put(arg4, arg6, arg7 * arg3);
		IDirect3DTexture.Upload(this.aLong6488, 0, arg0, arg1, arg2, arg3, arg7 * this.aClass72_6485.anInt609 * 1612989855 * 2145490527, 0, this.aClass_ra_Sub2_Sub2_6484.aLong8459);
	}

	public void method111(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		if (this.aClass72_6485 != Class72.aClass72_620 || this.aClass86_6486 != Class86.aClass86_714) {
			throw new RuntimeException();
		}
		if (arg6 == 0) {
			arg6 = arg2;
		}
		ByteBuffer var8 = this.aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		var8.clear();
		var8.asIntBuffer().put(arg4, arg5, arg6 * arg3);
		IDirect3DTexture.Upload(this.aLong6488, 0, arg0, arg1, arg2, arg3, arg6 * this.aClass72_6485.anInt609 * 1612989855 * 2145490527, 0, this.aClass_ra_Sub2_Sub2_6484.aLong8459);
	}

	public void method163(Class189 arg0) {
		super.method163(arg0);
	}

	public float method114() {
		return this.aFloat8913;
	}

	public float method106(float arg0) {
		return arg0 / (float) this.anInt8914;
	}

	public long method2318() {
		return this.aLong6488;
	}

	public float method104(float arg0) {
		return arg0 / (float) this.anInt8912;
	}

	public void method109(boolean arg0, boolean arg1) {
		this.aBoolean8915 = arg0;
		this.aBoolean8916 = arg1;
	}

	public void method118(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		if (this.aClass72_6485 != Class72.aClass72_620 || this.aClass86_6486 != Class86.aClass86_714) {
			throw new RuntimeException();
		}
		if (arg6 == 0) {
			arg6 = arg2;
		}
		ByteBuffer var8 = this.aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		var8.clear();
		var8.asIntBuffer().put(arg4, arg5, arg6 * arg3);
		IDirect3DTexture.Upload(this.aLong6488, 0, arg0, arg1, arg2, arg3, arg6 * this.aClass72_6485.anInt609, 0, this.aClass_ra_Sub2_Sub2_6484.aLong8459);
	}

	public void method117(int arg0, int arg1, int arg2, int arg3, byte[] arg4, Class72 arg5, int arg6, int arg7) {
		if (this.aClass72_6485 != arg5 || this.aClass86_6486 != Class86.aClass86_714) {
			throw new RuntimeException();
		}
		if (arg7 == 0) {
			arg7 = arg2;
		}
		ByteBuffer var9 = this.aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		var9.clear();
		var9.put(arg4, arg6, arg7 * arg3);
		IDirect3DTexture.Upload(this.aLong6488, 0, arg0, arg1, arg2, arg3, arg7 * this.aClass72_6485.anInt609, 0, this.aClass_ra_Sub2_Sub2_6484.aLong8459);
	}

	public void method110(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
		if (this.aClass72_6485 != Class72.aClass72_620 || this.aClass86_6486 != Class86.aClass86_714) {
			throw new RuntimeException();
		}
		ByteBuffer var7 = this.aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		var7.clear();
		IDirect3DTexture.Download(this.aLong6488, 0, arg0, arg1, arg2, arg3, arg2 * 4, 0, this.aClass_ra_Sub2_Sub2_6484.aLong8459);
		var7.asIntBuffer().get(arg4, arg5, arg2 * arg3);
	}

	public void method122(boolean arg0, boolean arg1) {
		this.aBoolean8915 = arg0;
		this.aBoolean8916 = arg1;
	}

	public void method165() {
		this.aClass_ra_Sub2_Sub2_6484.method5163(this);
	}

	public int[] method2320(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		int[] var8 = new int[arg2 * arg3];
		if (arg6 == 0) {
			arg6 = arg0;
		}
		for (int var9 = 0; var9 < arg3; var9++) {
			int var10;
			int var11;
			if (var9 >= arg1) {
				var10 = arg2 * (arg1 - 1);
				for (var11 = 0; var11 < arg2; var11++) {
					var8[arg2 * var9 + var11] = var8[var10 + var11];
				}
			} else {
				var10 = arg5 + var9 * arg6;
				for (var11 = 0; var11 < arg0; var11++) {
					var8[arg2 * var9 + var11] = arg4[var10 + var11];
				}
				var11 = arg4[var10 + (arg0 - 1)];
				for (int var12 = arg0; var12 < arg2; var12++) {
					var8[arg2 * var9 + var12] = var11;
				}
			}
		}
		return var8;
	}

	public float[] method2321(int arg0, int arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6, int arg7) {
		float[] var9 = new float[arg2 * arg3 * arg7];
		if (arg6 == 0) {
			arg6 = arg0 * arg7;
		}
		for (int var10 = 0; var10 < arg3; var10++) {
			int var11;
			int var12;
			int var13;
			if (var10 < arg1) {
				var11 = arg5 + var10 * arg6;
				for (var12 = 0; var12 < arg0; var12++) {
					for (var13 = 0; var13 < arg7; var13++) {
						var9[arg2 * var10 * arg7 + var12 * arg7 + var13] = arg4[var11 + var12 * arg7 + var13];
					}
				}
				float[] var15 = new float[arg7];
				for (var13 = 0; var13 < arg7; var13++) {
					var15[var13] = arg4[var11 + (arg0 - 1) * arg7 + var13];
				}
				for (var13 = arg0; var13 < arg2; var13++) {
					for (int var14 = 0; var14 < arg7; var14++) {
						var9[arg2 * var10 * arg7 + var13 * arg7 + var14] = var15[var14];
					}
				}
			} else {
				var11 = arg2 * (arg1 - 1) * arg7;
				for (var12 = 0; var12 < arg2; var12++) {
					for (var13 = 0; var13 < arg7; var13++) {
						var9[arg2 * var10 * arg7 + var12 * arg7 + var13] = var9[var11 + var12 * arg7 + var13];
					}
				}
			}
		}
		return var9;
	}

	public void method164() {
		this.aClass_ra_Sub2_Sub2_6484.method5163(this);
	}

	public Class229_Sub1(Class_ra_Sub2_Sub2 arg0, Class72 arg1, Class86 arg2, int arg3, int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, 0, 1);
	}

	public void method52() {
		super.method53();
	}

	public void method131(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
		if (this.aClass72_6485 != Class72.aClass72_620 || this.aClass86_6486 != Class86.aClass86_714) {
			throw new RuntimeException();
		}
		ByteBuffer var7 = this.aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		var7.clear();
		IDirect3DTexture.Download(this.aLong6488, 0, arg0, arg1, arg2, arg3, arg2 * 4, 0, this.aClass_ra_Sub2_Sub2_6484.aLong8459);
		var7.asIntBuffer().get(arg4, arg5, arg2 * arg3);
	}

	public int method139() {
		return this.anInt8912;
	}

	public float method112(float arg0) {
		return arg0 / (float) this.anInt8912;
	}

	public float method132(float arg0) {
		return arg0 / (float) this.anInt8912;
	}

	public boolean method120() {
		return true;
	}

	public boolean method121() {
		return true;
	}

	public void method128(int arg0, int arg1, int arg2, int arg3, byte[] arg4, Class72 arg5, int arg6, int arg7) {
		if (this.aClass72_6485 != arg5 || this.aClass86_6486 != Class86.aClass86_714) {
			throw new RuntimeException();
		}
		if (arg7 == 0) {
			arg7 = arg2;
		}
		ByteBuffer var9 = this.aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		var9.clear();
		var9.put(arg4, arg6, arg7 * arg3);
		IDirect3DTexture.Upload(this.aLong6488, 0, arg0, arg1, arg2, arg3, arg7 * this.aClass72_6485.anInt609 * 1612989855 * 2145490527, 0, this.aClass_ra_Sub2_Sub2_6484.aLong8459);
	}

	public int method137() {
		return this.anInt8914;
	}

	public void method129(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		if (this.aClass72_6485 != Class72.aClass72_620 || this.aClass86_6486 != Class86.aClass86_714) {
			throw new RuntimeException();
		}
		if (arg6 == 0) {
			arg6 = arg2;
		}
		ByteBuffer var8 = this.aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		var8.clear();
		var8.asIntBuffer().put(arg4, arg5, arg6 * arg3);
		IDirect3DTexture.Upload(this.aLong6488, 0, arg0, arg1, arg2, arg3, arg6 * this.aClass72_6485.anInt609 * 1612989855 * 2145490527, 0, this.aClass_ra_Sub2_Sub2_6484.aLong8459);
	}

	public int method116() {
		return this.anInt8914;
	}

	public void method126(int arg0, int arg1, int arg2, int arg3, byte[] arg4, Class72 arg5, int arg6, int arg7) {
		if (this.aClass72_6485 != arg5 || this.aClass86_6486 != Class86.aClass86_714) {
			throw new RuntimeException();
		}
		if (arg7 == 0) {
			arg7 = arg2;
		}
		ByteBuffer var9 = this.aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		var9.clear();
		var9.put(arg4, arg6, arg7 * arg3);
		IDirect3DTexture.Upload(this.aLong6488, 0, arg0, arg1, arg2, arg3, arg7 * this.aClass72_6485.anInt609 * 1612989855 * 2145490527, 0, this.aClass_ra_Sub2_Sub2_6484.aLong8459);
	}

	public void method127(int arg0, int arg1, int arg2, int arg3, byte[] arg4, Class72 arg5, int arg6, int arg7) {
		if (this.aClass72_6485 != arg5 || this.aClass86_6486 != Class86.aClass86_714) {
			throw new RuntimeException();
		}
		if (arg7 == 0) {
			arg7 = arg2;
		}
		ByteBuffer var9 = this.aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		var9.clear();
		var9.put(arg4, arg6, arg7 * arg3);
		IDirect3DTexture.Upload(this.aLong6488, 0, arg0, arg1, arg2, arg3, arg7 * this.aClass72_6485.anInt609 * 1612989855 * 2145490527, 0, this.aClass_ra_Sub2_Sub2_6484.aLong8459);
	}

	public boolean method136() {
		return false;
	}

	public void method107(int arg0, int arg1, int arg2, int arg3, byte[] arg4, Class72 arg5, int arg6, int arg7) {
		if (this.aClass72_6485 != arg5 || this.aClass86_6486 != Class86.aClass86_714) {
			throw new RuntimeException();
		}
		if (arg7 == 0) {
			arg7 = arg2;
		}
		ByteBuffer var9 = this.aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		var9.clear();
		var9.put(arg4, arg6, arg7 * arg3);
		IDirect3DTexture.Upload(this.aLong6488, 0, arg0, arg1, arg2, arg3, arg7 * this.aClass72_6485.anInt609 * 1612989855 * 2145490527, 0, this.aClass_ra_Sub2_Sub2_6484.aLong8459);
	}

	public void method130(int arg0, int arg1, int arg2, int arg3, byte[] arg4, Class72 arg5, int arg6, int arg7) {
		if (this.aClass72_6485 != arg5 || this.aClass86_6486 != Class86.aClass86_714) {
			throw new RuntimeException();
		}
		if (arg7 == 0) {
			arg7 = arg2;
		}
		ByteBuffer var9 = this.aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		var9.clear();
		var9.put(arg4, arg6, arg7 * arg3);
		IDirect3DTexture.Upload(this.aLong6488, 0, arg0, arg1, arg2, arg3, arg7 * this.aClass72_6485.anInt609 * 1612989855 * 2145490527, 0, this.aClass_ra_Sub2_Sub2_6484.aLong8459);
	}

	public byte[] method2322(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7) {
		byte[] var9 = new byte[arg2 * arg3 * arg7];
		if (arg6 == 0) {
			arg6 = arg0 * arg7;
		}
		for (int var10 = 0; var10 < arg3; var10++) {
			int var11;
			int var12;
			int var13;
			if (var10 < arg1) {
				var11 = arg5 + var10 * arg6;
				for (var12 = 0; var12 < arg0; var12++) {
					for (var13 = 0; var13 < arg7; var13++) {
						var9[arg2 * var10 * arg7 + var12 * arg7 + var13] = arg4[var11 + var12 * arg7 + var13];
					}
				}
				byte[] var15 = new byte[arg7];
				for (var13 = 0; var13 < arg7; var13++) {
					var15[var13] = arg4[var11 + (arg0 - 1) * arg7 + var13];
				}
				for (var13 = arg0; var13 < arg2; var13++) {
					for (int var14 = 0; var14 < arg7; var14++) {
						var9[arg2 * var10 * arg7 + var13 * arg7 + var14] = var15[var14];
					}
				}
			} else {
				var11 = arg2 * (arg1 - 1) * arg7;
				for (var12 = 0; var12 < arg2; var12++) {
					for (var13 = 0; var13 < arg7; var13++) {
						var9[arg2 * var10 * arg7 + var12 * arg7 + var13] = var9[var11 + var12 * arg7 + var13];
					}
				}
			}
		}
		return var9;
	}

	public void method119(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
		if (this.aClass72_6485 != Class72.aClass72_620 || this.aClass86_6486 != Class86.aClass86_714) {
			throw new RuntimeException();
		}
		ByteBuffer var7 = this.aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		var7.clear();
		IDirect3DTexture.Download(this.aLong6488, 0, arg0, arg1, arg2, arg3, arg2 * 4, 0, this.aClass_ra_Sub2_Sub2_6484.aLong8459);
		var7.asIntBuffer().get(arg4, arg5, arg2 * arg3);
	}

	public boolean method115() {
		return false;
	}

	public float method134() {
		return this.aFloat8911;
	}

	public float method135() {
		return this.aFloat8913;
	}

	public float method123() {
		return this.aFloat8911;
	}

	public boolean method113() {
		return true;
	}

	public void method162() {
		this.aClass_ra_Sub2_Sub2_6484.method5163(this);
	}

	public float method133() {
		return this.aFloat8911;
	}

	public void method167(Class189 arg0) {
		super.method163(arg0);
	}

	public long method2323() {
		return this.aLong6488;
	}

	public long method2324() {
		return this.aLong6488;
	}

	public int method124() {
		return this.anInt8912;
	}

	public int method138() {
		return this.anInt8912;
	}

	public void method53() {
		super.method53();
	}

	public int method140() {
		return this.anInt8912;
	}

	public int method141() {
		return this.anInt8912;
	}
}
