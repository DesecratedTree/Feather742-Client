package deob;

import jagdx.D3DADAPTER_IDENTIFIER;
import jagdx.D3DCAPS;
import jagdx.D3DDISPLAYMODE;
import jagdx.D3DLIGHT;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DEventQuery;
import jagdx.IDirect3DSurface;
import jagdx.IUnknown;
import jagdx.r;
import jagdx.z;
import java.awt.Canvas;

public class Class_ra_Sub2_Sub2 extends Class_ra_Sub2 {

	public long aLong9910 = 0L;

	public long aLong9891 = 0L;

	public Class471 aClass471_9893 = new Class471();

	public int anInt9894 = 0;

	public long aLong9895 = 0L;

	public long aLong9896 = 0L;

	public long aLong9897 = 0L;

	public boolean aBoolean9898 = false;

	public float[] aFloatArray9913 = new float[16];

	public int anInt9914 = 128;

	public int anInt9916 = 0;

	public long[] aLongArray9900 = new long[this.anInt9914];

	public int anInt9918;

	public int anInt9889;

	public D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS9899;

	public D3DCAPS aD3DCAPS9908;

	public boolean aBoolean9909;

	public boolean aBoolean9911;

	public boolean aBoolean9888;

	public boolean[] aBooleanArray9915;

	public boolean[] aBooleanArray9890;

	public boolean[] aBooleanArray9901;

	public Class189[] aClass189Array9903;

	public boolean[] aBooleanArray9892;

	public int[] anIntArray9904;

	public Class249 aClass249_9905;

	public static int[] anIntArray9917 = new int[] { 77, 80 };

	public static int[] anIntArray9902 = new int[] { 22, 23 };

	public long aLong9907;

	public Class123_Sub1 aClass123_Sub1_9906;

	public boolean aBoolean9912;

	public Class_ra_Sub2_Sub2(int arg0, int arg1, long arg2, long arg3, D3DPRESENT_PARAMETERS arg4, D3DCAPS arg5, Interface_ma arg6, IndexTable arg7, int arg8) {
		super(arg6, arg7, arg8, 0);
		try {
			this.anInt9918 = arg0;
			this.anInt9889 = arg1;
			this.aLong9910 = arg2;
			this.aLong9891 = arg3;
			this.aD3DPRESENT_PARAMETERS9899 = arg4;
			this.aD3DCAPS9908 = arg5;
			this.aLong9895 = D3DLIGHT.Create();
			this.aLong9896 = D3DLIGHT.Create();
			this.aLong9897 = D3DLIGHT.Create();
			this.anInt8592 = this.aD3DCAPS9908.MaxSimultaneousTextures;
			this.anInt8593 = this.aD3DCAPS9908.MaxActiveLights > 0 ? this.aD3DCAPS9908.MaxActiveLights : 8;
			this.aBoolean9909 = (this.aD3DCAPS9908.TextureCaps & 0x2) == 0;
			this.aBoolean8598 = (this.aD3DCAPS9908.TextureCaps & 0x2000) != 0;
			this.aBoolean9911 = (this.aD3DCAPS9908.TextureCaps & 0x10000) != 0;
			this.aBoolean9888 = (this.aD3DCAPS9908.TextureCaps & 0x4000) != 0;
			this.aBoolean8594 = this.aD3DCAPS9908.NumSimultaneousRTs > 0;
			this.aBoolean8595 = this.aD3DCAPS9908.NumSimultaneousRTs > 0;
			this.aBoolean8566 = this.anInt8490 > 0 || IDirect3D.CheckDeviceMultiSampleType(this.aLong9910, this.anInt9918, this.anInt9889, this.aD3DPRESENT_PARAMETERS9899.BackBufferFormat, true, 2) == 0;
			this.aBoolean8496 = this.aD3DCAPS9908.NumSimultaneousRTs > 0 && this.anInt8490 > 0 || IDirect3D.CheckDeviceMultiSampleType(this.aLong9910, this.anInt9918, this.anInt9889, 113, true, 2) == 0;
			this.aBooleanArray9915 = new boolean[this.anInt8592];
			this.aBooleanArray9890 = new boolean[this.anInt8592];
			this.aBooleanArray9901 = new boolean[this.anInt8592];
			this.aClass189Array9903 = new Class189[this.anInt8592];
			this.aBooleanArray9892 = new boolean[this.anInt8592];
			this.anIntArray9904 = new int[this.anInt8592];
			Class247 var12 = new Class247();
			var12.method2463(1.0F, -1.0F, 0.5F);
			var12.method2474(0.0F, 0.0F, 0.5F);
			this.aClass249_9905 = new Class249();
			this.aClass249_9905.method2508(var12);
			IDirect3DDevice.BeginScene(this.aLong9891);
		} catch (Throwable var13) {
			var13.printStackTrace();
			this.method4781(628001038);
			throw new RuntimeException("");
		}
	}

	public final Interface9_Impl1 method5132(boolean arg0) {
		return new Class224(this, arg0);
	}

	public Interface11_Impl3 method5063(Class72 arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5, int arg6) {
		return new Class229_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	public static Class_ra method5156(Canvas arg0, Interface_ma arg1, IndexTable arg2, Integer arg3) {
		Class_ra_Sub2_Sub2 var4 = null;
		try {
			byte var6 = 0;
			byte var7 = 1;
			long var8 = IDirect3D.Direct3DCreate();
			D3DCAPS var10 = new D3DCAPS();
			IDirect3D.GetDeviceCaps(var8, var6, var7, var10);
			if (var10.MaxSimultaneousTextures < 2) {
				throw new RuntimeException("");
			} else if ((var10.TextureOpCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if ((var10.TextureOpCaps & 0x8) == 0) {
				throw new RuntimeException("");
			} else if ((var10.TextureOpCaps & 0x40) == 0) {
				throw new RuntimeException("");
			} else if ((var10.TextureOpCaps & 0x200) == 0) {
				throw new RuntimeException("");
			} else if ((var10.TextureOpCaps & 0x2000000) == 0) {
				throw new RuntimeException("");
			} else if ((var10.SrcBlendCaps & var10.DestBlendCaps & 0x10) == 0) {
				throw new RuntimeException("");
			} else if ((var10.SrcBlendCaps & var10.DestBlendCaps & 0x20) == 0) {
				throw new RuntimeException("");
			} else if ((var10.SrcBlendCaps & var10.DestBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (var10.MaxActiveLights > 0 && var10.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (var10.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				D3DPRESENT_PARAMETERS var11 = new D3DPRESENT_PARAMETERS(arg0);
				var11.Windowed = true;
				var11.EnableAutoDepthStencil = true;
				var11.BackBufferWidth = arg0.getWidth();
				var11.BackBufferHeight = arg0.getHeight();
				var11.BackBufferCount = 1;
				var11.PresentationInterval = Integer.MIN_VALUE;
				if (!method5172(var6, var7, var8, arg3, var11)) {
					throw new RuntimeException("");
				}
				int var12 = 0;
				if ((var10.DevCaps & 0x100000) != 0) {
					var12 |= 0x10;
				}
				long var13 = 0L;
				try {
					var13 = IDirect3D.CreateDeviceContext(var8, var6, var7, arg0, var12 | 0x40, var11);
				} catch (z var16) {
					var13 = IDirect3D.CreateDeviceContext(var8, var6, var7, arg0, var12 & 0xFFEFFFFF | 0x20, var11);
				}
				var4 = new Class_ra_Sub2_Sub2(var6, var7, var8, var13, var11, var10, arg1, arg2, arg3);
				if (!var4.aHashtable4231.containsKey(arg0)) {
					Class377.method4375(arg0, -1433851980);
					var4.method4805(arg0, new Class76_Sub1_Sub2_Sub1(var4, arg0, arg0.getWidth(), arg0.getHeight(), true), 1850446711);
				}
				var4.method4784(arg0, 1072029249);
				var4.method4910();
				return var4;
			}
		} catch (RuntimeException var17) {
			if (var4 != null) {
				var4.u();
			}
			throw var17;
		}
	}

	public final Interface9_Impl1 method4976(boolean arg0) {
		return new Class224(this, arg0);
	}

	public void method5027() {
		for (Class330_Sub35 var1 = (Class330_Sub35) this.aClass471_9893.method5869(539664854); var1 != null; var1 = (Class330_Sub35) this.aClass471_9893.method5873((byte) -116)) {
			Interface13 var2 = (Interface13) var1.anObject7733;
			var2.method173();
			if (var2 == this.aClass76_4228) {
				var2.method174();
			}
		}
		super.method5027();
	}

	public void method4998() {
		for (Class330_Sub35 var1 = (Class330_Sub35) this.aClass471_9893.method5869(539664854); var1 != null; var1 = (Class330_Sub35) this.aClass471_9893.method5873((byte) -90)) {
			Interface13 var2 = (Interface13) var1.anObject7733;
			var2.method179();
		}
		super.method4998();
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.jp()LClass76_Sub2;")
	public Class76_Sub2 jp() {
		return new Class76_Sub2_Sub3_Sub1(this);
	}

	public void method5119() {
		if (this.aClass76_4228 != null) {
			IDirect3DDevice.SetViewport(this.aLong9891, this.anInt8517 + this.anInt8531, this.anInt8518 + this.anInt8567, this.anInt8515, this.anInt8516, this.aFloat8499, this.aFloat8478);
		}
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.f()LClass51;")
	public Class51 f() {
		D3DADAPTER_IDENTIFIER var1 = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(this.aLong9910, this.anInt9918, 0, var1);
		return new Class51(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.w(II)V")
	public void w(int arg0, int arg1) throws Exception_Sub1 {
		IDirect3DDevice.EndScene(this.aLong9891);
		int var3 = this.aClass76_Sub1_4234.method874();
		if (!r.r(var3)) {
			this.anInt9894 = 0;
		} else if (var3 == -2005530520) {
			this.aClass76_Sub1_4234.method179();
			this.method5178();
			((Class76_Sub1_Sub2_Sub1) this.aClass76_Sub1_4234).method173();
		} else if (++this.anInt9894 > 50) {
			throw new Exception_Sub1(var3);
		}
		IDirect3DDevice.BeginScene(this.aLong9891);
		if (this.anInterface_ma4227 != null) {
			this.anInterface_ma4227.method224((short) 442);
		}
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.l()V")
	public void l() {
		long var1 = IDirect3DDevice.CreateEventQuery(this.aLong9891);
		if (r.j(IDirect3DEventQuery.Issue(var1))) {
			while (true) {
				int var3 = IDirect3DEventQuery.IsSignaled(var1);
				if (var3 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		IUnknown.Release(var1);
	}

	public void method5091() {
		if (this.aBoolean8601) {
			int var1 = this.aBooleanArray9901[this.anInt8543] ? method5166(this.aClass179Array8547[this.anInt8543]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong9891, this.anInt8543, 1, var1);
		}
	}

	public void finalize() {
		super.finalize();
	}

	public final void method5079(int arg0, Class175 arg1, boolean arg2, boolean arg3) {
		if (!this.aBoolean8601) {
			return;
		}
		int var5 = 0;
		byte var6;
		switch(arg0) {
			case 1:
				var6 = 3;
				break;
			case 2:
				var6 = 26;
				break;
			default:
				var6 = 2;
		}
		if (arg2) {
			var5 |= 0x20;
		}
		if (arg3) {
			var5 |= 0x10;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong9891, this.anInt8543, var6, method5186(arg1) | var5);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.ag()LClass76_Sub2;")
	public Class76_Sub2 ag() {
		return new Class76_Sub2_Sub3_Sub1(this);
	}

	public void method5086() {
		if (this.aLong9907 != 0L || this.aClass181Array8509[this.anInt8543] == Class181.aClass181_1784) {
			IDirect3DDevice.SetTextureStageState(this.aLong9891, this.anInt8543, 24, 0);
			this.anIntArray9904[this.anInt8543] = 0;
			return;
		}
		if (this.aClass181Array8509[this.anInt8543] == Class181.aClass181_1785) {
			IDirect3DDevice.SetTransform(this.aLong9891, this.anInt8543 + 16, this.aClass249Array8545[this.anInt8543].method2506(this.aFloatArray9913));
		} else {
			IDirect3DDevice.SetTransform(this.aLong9891, this.anInt8543 + 16, this.aClass249Array8545[this.anInt8543].method2514(this.aFloatArray9913));
		}
		int var1 = method5167(this.aClass181Array8509[this.anInt8543]);
		if (var1 != this.anIntArray9904[this.anInt8543]) {
			IDirect3DDevice.SetTextureStageState(this.aLong9891, this.anInt8543, 24, var1);
			this.anIntArray9904[this.anInt8543] = var1;
		}
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.az(IILClass72;LClass86;I)LInterface8_Impl1_Impl2;")
	public Interface8_Impl1_Impl2 az(int arg0, int arg1, Class72 arg2, Class86 arg3, int arg4) {
		return new Class235(this, arg2, arg3, arg0, arg1, arg4);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.ah(II)LInterface8_Impl1_Impl1;")
	public Interface8_Impl1_Impl1 ah(int arg0, int arg1) {
		return new Class236(this, Class86.aClass86_719, arg0, arg1, 0);
	}

	public void method4947(int arg0) {
		if (!this.aBoolean9912) {
			int var2 = (arg0 & 0x2) == 0 ? 3 : 2;
			IDirect3DDevice.SetRenderState(this.aLong9891, 8, var2);
		}
	}

	public Class330_Sub35 method5157(Interface13 arg0) {
		for (Class330_Sub35 var2 = (Class330_Sub35) this.aClass471_9893.method5869(539664854); var2 != null; var2 = (Class330_Sub35) this.aClass471_9893.method5873((byte) -75)) {
			if (var2.anObject7733 == arg0) {
				return var2;
			}
		}
		return null;
	}

	public void method5158(Interface13 arg0) {
		if (this.method5157(arg0) == null) {
			this.aClass471_9893.method5878(new Class330_Sub35(arg0), (short) 8192);
		}
	}

	public void method5159(Interface13 arg0) {
		Class330_Sub35 var2 = this.method5157(arg0);
		if (var2 != null) {
			var2.method3252(1123135813);
		}
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.ar(IIII)[I")
	public int[] ar(int arg0, int arg1, int arg2, int arg3) {
		int[] var5 = null;
		long var6 = IDirect3DDevice.GetRenderTarget(this.aLong9891, 0);
		long var8 = IDirect3DDevice.CreateRenderTarget(this.aLong9891, arg2, arg3, 21, 0, 0, true);
		if (r.j(IDirect3DDevice.StretchRect(this.aLong9891, var6, arg0, arg1, arg2, arg3, var8, 0, 0, arg2, arg3, 1))) {
			var5 = new int[arg2 * arg3];
			IDirect3DSurface.Download(var8, 0, 0, arg2, arg3, arg2 * 4, 16, this.aLong8459);
			this.aByteBuffer8458.clear();
			this.aByteBuffer8458.asIntBuffer().get(var5);
		}
		IUnknown.Release(var6);
		IUnknown.Release(var8);
		return var5;
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.am()V")
	public void am() {
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.cp(LClass92;LClass92;FLClass92;)LClass92;")
	public Class92 cp(Class92 arg0, Class92 arg1, float arg2, Class92 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.ba(II)V")
	public void ba(int arg0, int arg1) {
		IDirect3DDevice.Clear(this.aLong9891, arg0, arg1, 1.0F, 0);
	}

	public void method4912() {
		if (this.aClass76_4228 != null) {
			IDirect3DDevice.SetViewport(this.aLong9891, this.anInt8517 + this.anInt8531, this.anInt8518 + this.anInt8567, this.anInt8515, this.anInt8516, this.aFloat8499, this.aFloat8478);
		}
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.jx(IILClass72;LClass86;I)LInterface8_Impl1_Impl2;")
	public Interface8_Impl1_Impl2 jx(int arg0, int arg1, Class72 arg2, Class86 arg3, int arg4) {
		return new Class235(this, arg2, arg3, arg0, arg1, arg4);
	}

	public void method5160() {
		for (Class330_Sub35 var1 = (Class330_Sub35) this.aClass471_9893.method5869(539664854); var1 != null; var1 = (Class330_Sub35) this.aClass471_9893.method5873((byte) -54)) {
			Interface13 var2 = (Interface13) var1.anObject7733;
			var2.method179();
		}
		super.method4998();
	}

	public final void method5161(long arg0) {
		this.aLong9907 = arg0;
		IDirect3DDevice.SetVertexShader(this.aLong9891, arg0);
	}

	public final void method5162(long arg0) {
		IDirect3DDevice.SetPixelShader(this.aLong9891, arg0);
	}

	public void method5103(Class249 arg0) {
		arg0.method2483(this.aClass249_9905);
	}

	public final void method4985(Interface9_Impl2 arg0, Class199 arg1, int arg2, int arg3, int arg4, int arg5) {
		if (this.aClass123_Sub1_9906 != null) {
			this.aClass123_Sub1_9906.method1515();
		}
		IDirect3DDevice.DrawIndexedPrimitiveIB(this.aLong9891, ((Class218) arg0).aLong8933, 4, 0, arg2, arg3, arg4, arg5);
	}

	public void method4933() {
		IDirect3DDevice.j(this.aLong9891, 14, this.aBoolean8519 && this.aBoolean8454);
	}

	public void method4936() {
		if (this.aBoolean8601) {
			IDirect3DDevice.j(this.aLong9891, 137, this.aBoolean8522 && !this.aBoolean8575);
		}
	}

	public void method4937() {
		if (this.aBoolean8601) {
			D3DLIGHT.SetAmbient(this.aLong9895, this.aFloat8530 * this.aFloat8533, this.aFloat8500 * this.aFloat8533, this.aFloat8532 * this.aFloat8533, 0.0F);
			this.aBoolean9898 = false;
		}
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.av(III)LInterface8_Impl1_Impl1;")
	public Interface8_Impl1_Impl1 av(int arg0, int arg1, int arg2) {
		return new Class236(this, Class86.aClass86_719, arg0, arg1, arg2);
	}

	public void method4959() {
		if (this.aBoolean8601) {
			D3DLIGHT.SetDirection(this.aLong9895, -this.aFloatArray8525[0], -this.aFloatArray8525[1], -this.aFloatArray8525[2]);
			D3DLIGHT.SetDirection(this.aLong9896, -this.aFloatArray8451[0], -this.aFloatArray8451[1], -this.aFloatArray8451[2]);
			this.aBoolean9898 = false;
		}
	}

	public float method4893() {
		return -0.5F;
	}

	public void method4939() {
		if (!this.aBoolean8601 || this.aBoolean9898) {
			return;
		}
		IDirect3DDevice.LightEnable(this.aLong9891, 0, false);
		IDirect3DDevice.LightEnable(this.aLong9891, 1, false);
		IDirect3DDevice.SetLight(this.aLong9891, 0, this.aLong9895);
		IDirect3DDevice.SetLight(this.aLong9891, 1, this.aLong9896);
		IDirect3DDevice.LightEnable(this.aLong9891, 0, true);
		IDirect3DDevice.LightEnable(this.aLong9891, 1, true);
		this.aBoolean9898 = true;
	}

	public void method4981() {
		int var1;
		for (var1 = 0; var1 < this.anInt8538; var1++) {
			Class330_Sub14 var2 = this.aClass330_Sub14Array8607[var1];
			int var3 = var1 + 2;
			int var4 = var2.method3313(-1813601403);
			float var5 = var2.method3317(436407211) / 255.0F;
			D3DLIGHT.SetPosition(this.aLong9897, (float) var2.method3318(-1275163184), (float) var2.method3311((byte) -11), (float) var2.method3312((short) 9042));
			D3DLIGHT.SetDiffuse(this.aLong9897, (float) (var4 >> 16 & 0xFF) * var5, (float) (var4 >> 8 & 0xFF) * var5, (float) (var4 & 0xFF) * var5, 0.0F);
			D3DLIGHT.SetAttenuation(this.aLong9897, 0.0F, 0.0F, 1.0F / (float) (var2.method3316((byte) -80) * var2.method3316((byte) -28)));
			D3DLIGHT.SetRange(this.aLong9897, (float) var2.method3316((byte) -8));
			IDirect3DDevice.SetLight(this.aLong9891, var3, this.aLong9897);
			IDirect3DDevice.LightEnable(this.aLong9891, var3, true);
		}
		while (var1 < this.anInt8537) {
			IDirect3DDevice.LightEnable(this.aLong9891, var1 + 2, false);
			var1++;
		}
	}

	public boolean method5006(Class72 arg0, Class86 arg1) {
		D3DDISPLAYMODE var3 = new D3DDISPLAYMODE();
		return r.j(IDirect3D.GetAdapterDisplayMode(this.aLong9910, this.anInt9918, var3)) && r.j(IDirect3D.CheckDeviceFormat(this.aLong9910, this.anInt9918, this.anInt9889, var3.Format, 0, 3, method5183(arg0, arg1)));
	}

	public final void method5001(int arg0, Class175 arg1, boolean arg2, boolean arg3) {
		if (!this.aBoolean8601) {
			return;
		}
		int var5 = 0;
		byte var6;
		switch(arg0) {
			case 1:
				var6 = 3;
				break;
			case 2:
				var6 = 26;
				break;
			default:
				var6 = 2;
		}
		if (arg2) {
			var5 |= 0x20;
		}
		if (arg3) {
			var5 |= 0x10;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong9891, this.anInt8543, var6, method5186(arg1) | var5);
	}

	public Interface11_Impl3 method4904(Class72 arg0, Class86 arg1, int arg2, int arg3) {
		return new Class229_Sub1(this, arg0, arg1, arg2, arg3);
	}

	public boolean method5057(Class72 arg0, Class86 arg1) {
		D3DDISPLAYMODE var3 = new D3DDISPLAYMODE();
		return r.j(IDirect3D.GetAdapterDisplayMode(this.aLong9910, this.anInt9918, var3)) && r.j(IDirect3D.CheckDeviceFormat(this.aLong9910, this.anInt9918, this.anInt9889, var3.Format, 0, 3, method5183(arg0, arg1)));
	}

	public Interface11_Impl3 method4948(Class72 arg0, int arg1, int arg2, boolean arg3, byte[] arg4, int arg5, int arg6) {
		return new Class229_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	public Interface11_Impl3 method4949(Class72 arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5, int arg6) {
		return new Class229_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	public Interface11_Impl3_Impl1 method4953(Class72 arg0, Class86 arg1, int arg2, int arg3) {
		return new Class229_Sub1_Sub1(this, arg0, arg1, arg2, arg3);
	}

	public Interface11_Impl1 method4951(int arg0, boolean arg1, int[][] arg2) {
		return new Class229_Sub2(this, arg0, arg1, arg2);
	}

	public Interface11_Impl2 method4952(Class72 arg0, int arg1, int arg2, int arg3, boolean arg4, byte[] arg5) {
		return new Class229_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public void method5009(Class184 arg0) {
		Class184_Sub1 var2 = (Class184_Sub1) arg0;
		IDirect3DDevice.SetVertexDeclaration(this.aLong9891, var2.aLong8909);
	}

	public final void method5163(Class229_Sub1 arg0) {
		this.method5165(arg0);
		if (this.aBooleanArray9915[this.anInt8543] != arg0.aBoolean8915) {
			IDirect3DDevice.SetSamplerState(this.aLong9891, this.anInt8543, 1, arg0.aBoolean8915 ? 1 : 3);
			this.aBooleanArray9915[this.anInt8543] = arg0.aBoolean8915;
		}
		if (this.aBooleanArray9890[this.anInt8543] != arg0.aBoolean8916) {
			IDirect3DDevice.SetSamplerState(this.aLong9891, this.anInt8543, 2, arg0.aBoolean8916 ? 1 : 3);
			this.aBooleanArray9890[this.anInt8543] = arg0.aBoolean8916;
		}
	}

	public final void method5164(Class229_Sub3 arg0) {
		this.method5165(arg0);
		if (!this.aBooleanArray9915[this.anInt8543]) {
			IDirect3DDevice.SetSamplerState(this.aLong9891, this.anInt8543, 1, 1);
			this.aBooleanArray9915[this.anInt8543] = true;
		}
		if (!this.aBooleanArray9890[this.anInt8543]) {
			IDirect3DDevice.SetSamplerState(this.aLong9891, this.anInt8543, 2, 1);
			this.aBooleanArray9890[this.anInt8543] = true;
		}
	}

	public void method5059() {
		if (this.aBooleanArray9901[this.anInt8543]) {
			this.aBooleanArray9901[this.anInt8543] = false;
			IDirect3DDevice.SetTexture(this.aLong9891, this.anInt8543, 0L);
			this.method4968();
			this.method5053();
		}
	}

	public void method5076() {
		if (this.aLong9907 != 0L || this.aClass181Array8509[this.anInt8543] == Class181.aClass181_1784) {
			IDirect3DDevice.SetTextureStageState(this.aLong9891, this.anInt8543, 24, 0);
			this.anIntArray9904[this.anInt8543] = 0;
			return;
		}
		if (this.aClass181Array8509[this.anInt8543] == Class181.aClass181_1785) {
			IDirect3DDevice.SetTransform(this.aLong9891, this.anInt8543 + 16, this.aClass249Array8545[this.anInt8543].method2506(this.aFloatArray9913));
		} else {
			IDirect3DDevice.SetTransform(this.aLong9891, this.anInt8543 + 16, this.aClass249Array8545[this.anInt8543].method2514(this.aFloatArray9913));
		}
		int var1 = method5167(this.aClass181Array8509[this.anInt8543]);
		if (var1 != this.anIntArray9904[this.anInt8543]) {
			IDirect3DDevice.SetTextureStageState(this.aLong9891, this.anInt8543, 24, var1);
			this.anIntArray9904[this.anInt8543] = var1;
		}
	}

	public void method5053() {
		if (this.aBoolean8601) {
			int var1 = this.aBooleanArray9901[this.anInt8543] ? method5166(this.aClass179Array8547[this.anInt8543]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong9891, this.anInt8543, 1, var1);
		}
	}

	public void method4968() {
		if (this.aBoolean8601) {
			int var1 = this.aBooleanArray9901[this.anInt8543] ? method5166(this.aClass179Array8548[this.anInt8543]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong9891, this.anInt8543, 4, var1);
		}
	}

	public Class184 method4977(Class193[] arg0) {
		return new Class184_Sub1(this, arg0);
	}

	public final void method4927(int arg0, Class175 arg1, boolean arg2) {
		if (!this.aBoolean8601) {
			return;
		}
		int var4 = 0;
		byte var5;
		switch(arg0) {
			case 1:
				var5 = 6;
				break;
			case 2:
				var5 = 27;
				break;
			default:
				var5 = 5;
		}
		if (arg2) {
			var4 |= 0x10;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong9891, this.anInt8543, var5, method5186(arg1) | var4);
	}

	public final void method5165(Class229 arg0) {
		IDirect3DDevice.SetTexture(this.aLong9891, this.anInt8543, arg0.method2318());
		if (this.aBoolean8601 && !this.aBooleanArray9901[this.anInt8543]) {
			this.aBooleanArray9901[this.anInt8543] = true;
			this.method4968();
			this.method5053();
		}
	}

	public static final int method5166(Class179 arg0) {
		switch(arg0.anInt1756) {
			case 0:
				return 4;
			case 1:
				return 26;
			case 2:
				return 7;
			case 3:
				return 10;
			case 4:
				return 2;
			default:
				throw new IllegalArgumentException();
		}
	}

	public void method4907() {
		IDirect3DDevice.j(this.aLong9891, 27, this.aBoolean8546);
	}

	public static final int method5167(Class181 arg0) {
		switch(arg0.anInt1783) {
			case 0:
				return 3;
			case 1:
				return 4;
			case 2:
				return 2;
			case 3:
			default:
				return 0;
			case 4:
				return 256;
			case 5:
				return 1;
		}
	}

	public void method5040(int arg0) {
		IDirect3DDevice.SetRenderState(this.aLong9891, 168, arg0);
	}

	public void method4992() {
		this.method4938();
		this.method4939();
	}

	public void method5042() {
		IDirect3DDevice.j(this.aLong9891, 7, this.aBoolean8526);
	}

	public void method5112() {
		IDirect3DDevice.j(this.aLong9891, 27, this.aBoolean8546);
	}

	public void method4974() {
		if (this.aBoolean8601) {
			IDirect3DDevice.j(this.aLong9891, 28, this.aBoolean8514 && this.aBoolean8502 && this.anInt8578 >= 0);
		}
	}

	public void method4900() {
		this.aFloat8581 = this.aFloat8504 - (float) this.anInt8560;
		this.aFloat8580 = this.aFloat8581 - (float) this.anInt8578;
		if (this.aFloat8580 < this.aFloat8471) {
			this.aFloat8580 = this.aFloat8471;
		}
		if (this.aBoolean8601) {
			IDirect3DDevice.r(this.aLong9891, 36, this.aFloat8580);
			IDirect3DDevice.r(this.aLong9891, 37, this.aFloat8581);
			IDirect3DDevice.SetRenderState(this.aLong9891, 34, this.anInt8476);
		}
	}

	public void method5168() {
		for (Class330_Sub35 var1 = (Class330_Sub35) this.aClass471_9893.method5869(539664854); var1 != null; var1 = (Class330_Sub35) this.aClass471_9893.method5873((byte) 2)) {
			Interface13 var2 = (Interface13) var1.anObject7733;
			var2.method173();
			if (var2 == this.aClass76_4228) {
				var2.method174();
			}
		}
		super.method5027();
	}

	public final Interface9_Impl2 method4975(boolean arg0) {
		return new Class218(this, Class86.aClass86_718, arg0);
	}

	public void method5054() {
		int var1;
		for (var1 = 0; var1 < this.anInt8538; var1++) {
			Class330_Sub14 var2 = this.aClass330_Sub14Array8607[var1];
			int var3 = var1 + 2;
			int var4 = var2.method3313(-510520199);
			float var5 = var2.method3317(1864218184) / 255.0F;
			D3DLIGHT.SetPosition(this.aLong9897, (float) var2.method3318(522102953), (float) var2.method3311((byte) -18), (float) var2.method3312((short) 5645));
			D3DLIGHT.SetDiffuse(this.aLong9897, (float) (var4 >> 16 & 0xFF) * var5, (float) (var4 >> 8 & 0xFF) * var5, (float) (var4 & 0xFF) * var5, 0.0F);
			D3DLIGHT.SetAttenuation(this.aLong9897, 0.0F, 0.0F, 1.0F / (float) (var2.method3316((byte) 71) * var2.method3316((byte) 75)));
			D3DLIGHT.SetRange(this.aLong9897, (float) var2.method3316((byte) -41));
			IDirect3DDevice.SetLight(this.aLong9891, var3, this.aLong9897);
			IDirect3DDevice.LightEnable(this.aLong9891, var3, true);
		}
		while (var1 < this.anInt8537) {
			IDirect3DDevice.LightEnable(this.aLong9891, var1 + 2, false);
			var1++;
		}
	}

	public void method5090() {
	}

	public void method4978(Class184 arg0) {
		Class184_Sub1 var2 = (Class184_Sub1) arg0;
		IDirect3DDevice.SetVertexDeclaration(this.aLong9891, var2.aLong8909);
	}

	public void method5081(int arg0, Interface9_Impl1 arg1) {
		Class224 var3 = (Class224) arg1;
		IDirect3DDevice.SetStreamSource(this.aLong9891, arg0, var3.aLong8927, 0, var3.method2299());
	}

	public void method4979(Interface9_Impl2 arg0) {
		IDirect3DDevice.SetIndices(this.aLong9891, ((Class218) arg0).aLong8933);
	}

	public final void method4898(Class199 arg0, int arg1, int arg2) {
		if (this.aClass123_Sub1_9906 != null) {
			this.aClass123_Sub1_9906.method1515();
		}
		IDirect3DDevice.DrawPrimitive(this.aLong9891, method5171(arg0), arg1, arg2);
	}

	public Interface11_Impl2 method5069(Class72 arg0, int arg1, int arg2, int arg3, boolean arg4, byte[] arg5) {
		return new Class229_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public boolean method5032(Class72 arg0, Class86 arg1) {
		D3DDISPLAYMODE var3 = new D3DDISPLAYMODE();
		return r.j(IDirect3D.GetAdapterDisplayMode(this.aLong9910, this.anInt9918, var3)) && r.j(IDirect3D.CheckDeviceFormat(this.aLong9910, this.anInt9918, this.anInt9889, var3.Format, 0, 4, method5183(arg0, arg1)));
	}

	public byte[] method5169(String arg0) {
		return this.method4942("dx", arg0);
	}

	public Class105 method4888(String arg0) {
		byte[] var2 = this.method5169(arg0);
		if (var2 == null) {
			return null;
		} else {
			Class113 var3 = this.method4890(var2);
			return new Class105_Sub1(this, var3);
		}
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.g(I)V")
	public final synchronized void g(int arg0) {
		for (int var2 = 0; var2 < this.anInt9916; var2++) {
			IUnknown.Release(this.aLongArray9900[var2]);
		}
		this.anInt9916 = 0;
		super.g(arg0);
	}

	public void method4940() {
		this.method4938();
		this.method4939();
	}

	public static final int method5170(Class86 arg0) {
		if (arg0 == Class86.aClass86_718) {
			return 80;
		} else if (arg0 == Class86.aClass86_719) {
			return 77;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	public static final int method5171(Class199 arg0) {
		switch(arg0.anInt1932) {
			case 0:
				return 4;
			case 1:
				return 6;
			case 2:
				return 1;
			case 3:
				return 3;
			case 4:
				return 5;
			case 5:
				return 2;
			default:
				throw new IllegalArgumentException("");
		}
	}

	public static boolean method5172(int arg0, int arg1, long arg2, int arg3, D3DPRESENT_PARAMETERS arg4) {
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;
		try {
			D3DDISPLAYMODE var10 = new D3DDISPLAYMODE();
			if (r.r(IDirect3D.GetAdapterDisplayMode(arg2, arg0, var10))) {
				return false;
			}
			label77: while (arg3 >= 0) {
				if (arg3 != 1) {
					var8 = arg3;
					for (int var11 = 0; var11 < anIntArray9902.length; var11++) {
						if (IDirect3D.CheckDeviceType(arg2, arg0, arg1, var10.Format, anIntArray9902[var11], true) == 0 && IDirect3D.CheckDeviceFormat(arg2, arg0, arg1, var10.Format, 1, 1, anIntArray9902[var11]) == 0 && (arg3 == 0 || IDirect3D.CheckDeviceMultiSampleType(arg2, arg0, arg1, anIntArray9902[var11], true, var8) == 0)) {
							for (int var12 = 0; var12 < anIntArray9917.length; var12++) {
								if (IDirect3D.CheckDeviceFormat(arg2, arg0, arg1, var10.Format, 2, 1, anIntArray9917[var12]) == 0 && IDirect3D.CheckDepthStencilMatch(arg2, arg0, arg1, var10.Format, anIntArray9902[var11], anIntArray9917[var12]) == 0 && (arg3 == 0 || IDirect3D.CheckDeviceMultiSampleType(arg2, arg0, arg1, anIntArray9917[var11], true, var8) == 0)) {
									var7 = anIntArray9902[var11];
									var6 = anIntArray9917[var12];
									break label77;
								}
							}
						}
					}
				}
				arg3--;
			}
			if (arg3 < 0 || var7 == 0 || var6 == 0) {
				return false;
			}
			arg4.BackBufferFormat = var7;
			arg4.AutoDepthStencilFormat = var6;
			arg4.MultiSampleType = var8;
			arg4.MultiSampleQuality = 0;
			return true;
		} catch (Throwable var13) {
			return false;
		}
	}

	public synchronized void method5173(long arg0) {
		if (this.anInt9916 == this.anInt9914) {
			this.anInt9914 *= 2;
			long[] var3 = new long[this.anInt9914];
			System.arraycopy(this.aLongArray9900, 0, var3, 0, this.anInt9916);
			this.aLongArray9900 = var3;
		}
		this.aLongArray9900[this.anInt9916] = arg0;
		this.anInt9916++;
	}

	public void method4990(int arg0) {
		if (!this.aBoolean9912) {
			int var2 = (arg0 & 0x2) == 0 ? 3 : 2;
			IDirect3DDevice.SetRenderState(this.aLong9891, 8, var2);
		}
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.ak(Ljava/awt/Canvas;II)LClass76_Sub1;")
	public Class76_Sub1 ak(Canvas arg0, int arg1, int arg2) {
		return new Class76_Sub1_Sub2_Sub1(this, arg0, arg1, arg2, false);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.dq()LClass51;")
	public Class51 dq() {
		D3DADAPTER_IDENTIFIER var1 = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(this.aLong9910, this.anInt9918, 0, var1);
		return new Class51(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
	}

	public void method5174() {
		for (Class330_Sub35 var1 = (Class330_Sub35) this.aClass471_9893.method5869(539664854); var1 != null; var1 = (Class330_Sub35) this.aClass471_9893.method5873((byte) -49)) {
			Interface13 var2 = (Interface13) var1.anObject7733;
			var2.method179();
		}
		super.method4998();
	}

	public void method5077() {
		if (this.aBooleanArray9901[this.anInt8543]) {
			this.aBooleanArray9901[this.anInt8543] = false;
			IDirect3DDevice.SetTexture(this.aLong9891, this.anInt8543, 0L);
			this.method4968();
			this.method5053();
		}
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.dj(II)V")
	public void dj(int arg0, int arg1) throws Exception_Sub1 {
		IDirect3DDevice.EndScene(this.aLong9891);
		int var3 = this.aClass76_Sub1_4234.method874();
		if (!r.r(var3)) {
			this.anInt9894 = 0;
		} else if (var3 == -2005530520) {
			this.aClass76_Sub1_4234.method179();
			this.method5178();
			((Class76_Sub1_Sub2_Sub1) this.aClass76_Sub1_4234).method173();
		} else if (++this.anInt9894 > 50) {
			throw new Exception_Sub1(var3);
		}
		IDirect3DDevice.BeginScene(this.aLong9891);
		if (this.anInterface_ma4227 != null) {
			this.anInterface_ma4227.method224((short) -1293);
		}
	}

	public Interface11_Impl3 method5064(Class72 arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5, int arg6) {
		return new Class229_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.dm(II)V")
	public void dm(int arg0, int arg1) throws Exception_Sub1 {
		IDirect3DDevice.EndScene(this.aLong9891);
		int var3 = this.aClass76_Sub1_4234.method874();
		if (!r.r(var3)) {
			this.anInt9894 = 0;
		} else if (var3 == -2005530520) {
			this.aClass76_Sub1_4234.method179();
			this.method5178();
			((Class76_Sub1_Sub2_Sub1) this.aClass76_Sub1_4234).method173();
		} else if (++this.anInt9894 > 50) {
			throw new Exception_Sub1(var3);
		}
		IDirect3DDevice.BeginScene(this.aLong9891);
		if (this.anInterface_ma4227 != null) {
			this.anInterface_ma4227.method224((short) -8160);
		}
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.du()V")
	public void du() {
		long var1 = IDirect3DDevice.CreateEventQuery(this.aLong9891);
		if (r.j(IDirect3DEventQuery.Issue(var1))) {
			while (true) {
				int var3 = IDirect3DEventQuery.IsSignaled(var1);
				if (var3 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		IUnknown.Release(var1);
	}

	public Interface11_Impl1 method5067(int arg0, boolean arg1, int[][] arg2) {
		return new Class229_Sub2(this, arg0, arg1, arg2);
	}

	public void method4997() {
		if (this.aBoolean8601) {
			IDirect3DDevice.j(this.aLong9891, 137, this.aBoolean8522 && !this.aBoolean8575);
		}
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.dx()V")
	public void dx() {
		long var1 = IDirect3DDevice.CreateEventQuery(this.aLong9891);
		if (r.j(IDirect3DEventQuery.Issue(var1))) {
			while (true) {
				int var3 = IDirect3DEventQuery.IsSignaled(var1);
				if (var3 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		IUnknown.Release(var1);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.dd()V")
	public void dd() {
		super.u();
		if (this.aLong9895 != 0L) {
			D3DLIGHT.Destroy(this.aLong9895);
			this.aLong9895 = 0L;
		}
		if (this.aLong9896 != 0L) {
			D3DLIGHT.Destroy(this.aLong9896);
			this.aLong9896 = 0L;
		}
		if (this.aLong9897 != 0L) {
			D3DLIGHT.Destroy(this.aLong9897);
			this.aLong9897 = 0L;
		}
		if (this.aLong9891 != 0L) {
			IDirect3DDevice.Destroy(this.aLong9891);
			this.aLong9891 = 0L;
		}
		if (this.aLong9910 != 0L) {
			IUnknown.Release(this.aLong9910);
			this.aLong9910 = 0L;
		}
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.de()V")
	public void de() {
		super.u();
		if (this.aLong9895 != 0L) {
			D3DLIGHT.Destroy(this.aLong9895);
			this.aLong9895 = 0L;
		}
		if (this.aLong9896 != 0L) {
			D3DLIGHT.Destroy(this.aLong9896);
			this.aLong9896 = 0L;
		}
		if (this.aLong9897 != 0L) {
			D3DLIGHT.Destroy(this.aLong9897);
			this.aLong9897 = 0L;
		}
		if (this.aLong9891 != 0L) {
			IDirect3DDevice.Destroy(this.aLong9891);
			this.aLong9891 = 0L;
		}
		if (this.aLong9910 != 0L) {
			IUnknown.Release(this.aLong9910);
			this.aLong9910 = 0L;
		}
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.dn()V")
	public void dn() {
		super.u();
		if (this.aLong9895 != 0L) {
			D3DLIGHT.Destroy(this.aLong9895);
			this.aLong9895 = 0L;
		}
		if (this.aLong9896 != 0L) {
			D3DLIGHT.Destroy(this.aLong9896);
			this.aLong9896 = 0L;
		}
		if (this.aLong9897 != 0L) {
			D3DLIGHT.Destroy(this.aLong9897);
			this.aLong9897 = 0L;
		}
		if (this.aLong9891 != 0L) {
			IDirect3DDevice.Destroy(this.aLong9891);
			this.aLong9891 = 0L;
		}
		if (this.aLong9910 != 0L) {
			IUnknown.Release(this.aLong9910);
			this.aLong9910 = 0L;
		}
	}

	public void method5014() {
		switch(this.aClass176_8583.anInt1746) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong9891, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong9891, 20, 2);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong9891, 19, 9);
				IDirect3DDevice.SetRenderState(this.aLong9891, 20, 2);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong9891, 19, 5);
				IDirect3DDevice.SetRenderState(this.aLong9891, 20, 6);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong9891, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong9891, 20, 1);
		}
		switch(this.anInt8613) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong9891, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong9891, 208, 1);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong9891, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong9891, 208, 1);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong9891, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong9891, 208, 2);
		}
	}

	public void method5123() {
		this.method4938();
		this.method4939();
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.eo(Z)V")
	public void eo(boolean arg0) {
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.ef(Z)V")
	public void ef(boolean arg0) {
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.eu(Z)V")
	public void eu(boolean arg0) {
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.es(Ljava/awt/Canvas;II)LClass76_Sub1;")
	public Class76_Sub1 es(Canvas arg0, int arg1, int arg2) {
		return new Class76_Sub1_Sub2_Sub1(this, arg0, arg1, arg2, false);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.dw(I)V")
	public final synchronized void dw(int arg0) {
		for (int var2 = 0; var2 < this.anInt9916; var2++) {
			IUnknown.Release(this.aLongArray9900[var2]);
		}
		this.anInt9916 = 0;
		super.g(arg0);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.ft(Ljava/awt/Canvas;II)LClass76_Sub1;")
	public Class76_Sub1 ft(Canvas arg0, int arg1, int arg2) {
		return new Class76_Sub1_Sub2_Sub1(this, arg0, arg1, arg2, false);
	}

	public void method4926(Class184 arg0) {
		Class184_Sub1 var2 = (Class184_Sub1) arg0;
		IDirect3DDevice.SetVertexDeclaration(this.aLong9891, var2.aLong8909);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.fr()V")
	public void fr() {
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.fi(II)V")
	public void fi(int arg0, int arg1) {
		IDirect3DDevice.Clear(this.aLong9891, arg0, arg1, 1.0F, 0);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.fn(II)V")
	public void fn(int arg0, int arg1) {
		IDirect3DDevice.Clear(this.aLong9891, arg0, arg1, 1.0F, 0);
	}

	public void method5033(Class249 arg0) {
		arg0.method2483(this.aClass249_9905);
	}

	public final void method5116(Class199 arg0, int arg1, int arg2, int arg3, int arg4) {
		if (this.aClass123_Sub1_9906 != null) {
			this.aClass123_Sub1_9906.method1515();
		}
		IDirect3DDevice.DrawIndexedPrimitive(this.aLong9891, method5171(arg0), 0, arg1, arg2, arg3, arg4);
	}

	public void method4895() {
		for (int var1 = 0; var1 < this.anInt8592; var1++) {
			IDirect3DDevice.SetSamplerState(this.aLong9891, var1, 7, 2);
			IDirect3DDevice.SetSamplerState(this.aLong9891, var1, 6, 2);
			IDirect3DDevice.SetSamplerState(this.aLong9891, var1, 5, 2);
			IDirect3DDevice.SetSamplerState(this.aLong9891, var1, 1, 1);
			IDirect3DDevice.SetSamplerState(this.aLong9891, var1, 2, 1);
			this.aClass189Array9903[var1] = Class189.aClass189_1856;
			boolean[] var2 = this.aBooleanArray9915;
			this.aBooleanArray9890[var1] = true;
			var2[var1] = true;
			this.aBooleanArray9892[var1] = false;
			this.anIntArray9904[var1] = 0;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong9891, 0, 6, 1);
		IDirect3DDevice.SetRenderState(this.aLong9891, 9, 2);
		IDirect3DDevice.SetRenderState(this.aLong9891, 23, 4);
		IDirect3DDevice.SetRenderState(this.aLong9891, 25, 5);
		IDirect3DDevice.SetRenderState(this.aLong9891, 24, 0);
		IDirect3DDevice.SetRenderState(this.aLong9891, 22, 2);
		IDirect3DDevice.SetRenderState(this.aLong9891, 147, 1);
		IDirect3DDevice.SetRenderState(this.aLong9891, 145, 1);
		IDirect3DDevice.r(this.aLong9891, 38, 0.95F);
		IDirect3DDevice.SetRenderState(this.aLong9891, 35, 3);
		IDirect3DDevice.r(this.aLong9891, 154, 1.0F);
		D3DLIGHT.SetType(this.aLong9895, 3);
		D3DLIGHT.SetType(this.aLong9896, 3);
		D3DLIGHT.SetType(this.aLong9897, 1);
		IDirect3DDevice.SetRenderState(this.aLong9891, 206, 1);
		this.aBoolean9898 = false;
		super.method4895();
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.jy()LClass76_Sub2;")
	public Class76_Sub2 jy() {
		return new Class76_Sub2_Sub3_Sub1(this);
	}

	public void method5126() {
		if (this.aBoolean8601) {
			int var1 = this.aBooleanArray9901[this.anInt8543] ? method5166(this.aClass179Array8548[this.anInt8543]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong9891, this.anInt8543, 4, var1);
		}
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.jk()LClass76_Sub2;")
	public Class76_Sub2 jk() {
		return new Class76_Sub2_Sub3_Sub1(this);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.jv()LClass76_Sub2;")
	public Class76_Sub2 jv() {
		return new Class76_Sub2_Sub3_Sub1(this);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.dk(I)V")
	public final synchronized void dk(int arg0) {
		for (int var2 = 0; var2 < this.anInt9916; var2++) {
			IUnknown.Release(this.aLongArray9900[var2]);
		}
		this.anInt9916 = 0;
		super.g(arg0);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.kb(III)LInterface8_Impl1_Impl1;")
	public Interface8_Impl1_Impl1 kb(int arg0, int arg1, int arg2) {
		return new Class236(this, Class86.aClass86_719, arg0, arg1, arg2);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.kh(III)LInterface8_Impl1_Impl1;")
	public Interface8_Impl1_Impl1 kh(int arg0, int arg1, int arg2) {
		return new Class236(this, Class86.aClass86_719, arg0, arg1, arg2);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.kv(III)LInterface8_Impl1_Impl1;")
	public Interface8_Impl1_Impl1 kv(int arg0, int arg1, int arg2) {
		return new Class236(this, Class86.aClass86_719, arg0, arg1, arg2);
	}

	public void method5175() {
		super.finalize();
	}

	public void method5176() {
		super.finalize();
	}

	public boolean method5021() {
		return (this.aD3DCAPS9908.VertexShaderVersion & 0xFFFF) >= 257;
	}

	public boolean method5022() {
		return (this.aD3DCAPS9908.PixelShaderVersion & 0xFFFF) >= 257;
	}

	public boolean method5023() {
		return (this.aD3DCAPS9908.PixelShaderVersion & 0xFFFF) >= 257;
	}

	public float method5031() {
		return -0.5F;
	}

	public Class105 method5037(String arg0) {
		byte[] var2 = this.method5169(arg0);
		if (var2 == null) {
			return null;
		} else {
			Class113 var3 = this.method4890(var2);
			return new Class105_Sub1(this, var3);
		}
	}

	public Class105 method4923(String arg0) {
		byte[] var2 = this.method5169(arg0);
		if (var2 == null) {
			return null;
		} else {
			Class113 var3 = this.method4890(var2);
			return new Class105_Sub1(this, var3);
		}
	}

	public void method5177() {
		for (int var1 = 0; var1 < this.anInt8592; var1++) {
			IDirect3DDevice.SetSamplerState(this.aLong9891, var1, 7, 2);
			IDirect3DDevice.SetSamplerState(this.aLong9891, var1, 6, 2);
			IDirect3DDevice.SetSamplerState(this.aLong9891, var1, 5, 2);
			IDirect3DDevice.SetSamplerState(this.aLong9891, var1, 1, 1);
			IDirect3DDevice.SetSamplerState(this.aLong9891, var1, 2, 1);
			this.aClass189Array9903[var1] = Class189.aClass189_1856;
			boolean[] var2 = this.aBooleanArray9915;
			this.aBooleanArray9890[var1] = true;
			var2[var1] = true;
			this.aBooleanArray9892[var1] = false;
			this.anIntArray9904[var1] = 0;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong9891, 0, 6, 1);
		IDirect3DDevice.SetRenderState(this.aLong9891, 9, 2);
		IDirect3DDevice.SetRenderState(this.aLong9891, 23, 4);
		IDirect3DDevice.SetRenderState(this.aLong9891, 25, 5);
		IDirect3DDevice.SetRenderState(this.aLong9891, 24, 0);
		IDirect3DDevice.SetRenderState(this.aLong9891, 22, 2);
		IDirect3DDevice.SetRenderState(this.aLong9891, 147, 1);
		IDirect3DDevice.SetRenderState(this.aLong9891, 145, 1);
		IDirect3DDevice.r(this.aLong9891, 38, 0.95F);
		IDirect3DDevice.SetRenderState(this.aLong9891, 35, 3);
		IDirect3DDevice.r(this.aLong9891, 154, 1.0F);
		D3DLIGHT.SetType(this.aLong9895, 3);
		D3DLIGHT.SetType(this.aLong9896, 3);
		D3DLIGHT.SetType(this.aLong9897, 1);
		IDirect3DDevice.SetRenderState(this.aLong9891, 206, 1);
		this.aBoolean9898 = false;
		super.method4895();
	}

	public boolean method5178() {
		int var1 = IDirect3DDevice.TestCooperativeLevel(this.aLong9891);
		if (var1 == 0 || var1 == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface(this.aLong9891, 0L);
			int var2;
			for (var2 = 0; var2 < 4; var2++) {
				IDirect3DDevice.SetRenderTarget(this.aLong9891, var2, 0L);
			}
			for (var2 = 0; var2 < 4; var2++) {
				IDirect3DDevice.SetStreamSource(this.aLong9891, var2, 0L, 0, 0);
			}
			for (var2 = 0; var2 < 4; var2++) {
				IDirect3DDevice.SetTexture(this.aLong9891, var2, 0L);
			}
			IDirect3DDevice.SetIndices(this.aLong9891, 0L);
			this.method4998();
			this.aD3DPRESENT_PARAMETERS9899.BackBufferWidth = 0;
			this.aD3DPRESENT_PARAMETERS9899.BackBufferHeight = 0;
			if (method5172(this.anInt9918, this.anInt9889, this.aLong9910, this.anInt8490, this.aD3DPRESENT_PARAMETERS9899)) {
				var2 = IDirect3DDevice.Reset(this.aLong9891, this.aD3DPRESENT_PARAMETERS9899);
				if (r.j(var2)) {
					this.method5027();
					this.method4895();
					return true;
				}
				System.exit(0);
			}
		}
		return false;
	}

	public void method5179() {
		for (int var1 = 0; var1 < this.anInt8592; var1++) {
			IDirect3DDevice.SetSamplerState(this.aLong9891, var1, 7, 2);
			IDirect3DDevice.SetSamplerState(this.aLong9891, var1, 6, 2);
			IDirect3DDevice.SetSamplerState(this.aLong9891, var1, 5, 2);
			IDirect3DDevice.SetSamplerState(this.aLong9891, var1, 1, 1);
			IDirect3DDevice.SetSamplerState(this.aLong9891, var1, 2, 1);
			this.aClass189Array9903[var1] = Class189.aClass189_1856;
			boolean[] var2 = this.aBooleanArray9915;
			this.aBooleanArray9890[var1] = true;
			var2[var1] = true;
			this.aBooleanArray9892[var1] = false;
			this.anIntArray9904[var1] = 0;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong9891, 0, 6, 1);
		IDirect3DDevice.SetRenderState(this.aLong9891, 9, 2);
		IDirect3DDevice.SetRenderState(this.aLong9891, 23, 4);
		IDirect3DDevice.SetRenderState(this.aLong9891, 25, 5);
		IDirect3DDevice.SetRenderState(this.aLong9891, 24, 0);
		IDirect3DDevice.SetRenderState(this.aLong9891, 22, 2);
		IDirect3DDevice.SetRenderState(this.aLong9891, 147, 1);
		IDirect3DDevice.SetRenderState(this.aLong9891, 145, 1);
		IDirect3DDevice.r(this.aLong9891, 38, 0.95F);
		IDirect3DDevice.SetRenderState(this.aLong9891, 35, 3);
		IDirect3DDevice.r(this.aLong9891, 154, 1.0F);
		D3DLIGHT.SetType(this.aLong9895, 3);
		D3DLIGHT.SetType(this.aLong9896, 3);
		D3DLIGHT.SetType(this.aLong9897, 1);
		IDirect3DDevice.SetRenderState(this.aLong9891, 206, 1);
		this.aBoolean9898 = false;
		super.method4895();
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.in(LClass92;LClass92;FLClass92;)LClass92;")
	public Class92 in(Class92 arg0, Class92 arg1, float arg2, Class92 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	public void method5180() {
		for (Class330_Sub35 var1 = (Class330_Sub35) this.aClass471_9893.method5869(539664854); var1 != null; var1 = (Class330_Sub35) this.aClass471_9893.method5873((byte) -10)) {
			Interface13 var2 = (Interface13) var1.anObject7733;
			var2.method179();
		}
		super.method4998();
	}

	public void method5181() {
		for (int var1 = 0; var1 < this.anInt8592; var1++) {
			IDirect3DDevice.SetSamplerState(this.aLong9891, var1, 7, 2);
			IDirect3DDevice.SetSamplerState(this.aLong9891, var1, 6, 2);
			IDirect3DDevice.SetSamplerState(this.aLong9891, var1, 5, 2);
			IDirect3DDevice.SetSamplerState(this.aLong9891, var1, 1, 1);
			IDirect3DDevice.SetSamplerState(this.aLong9891, var1, 2, 1);
			this.aClass189Array9903[var1] = Class189.aClass189_1856;
			boolean[] var2 = this.aBooleanArray9915;
			this.aBooleanArray9890[var1] = true;
			var2[var1] = true;
			this.aBooleanArray9892[var1] = false;
			this.anIntArray9904[var1] = 0;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong9891, 0, 6, 1);
		IDirect3DDevice.SetRenderState(this.aLong9891, 9, 2);
		IDirect3DDevice.SetRenderState(this.aLong9891, 23, 4);
		IDirect3DDevice.SetRenderState(this.aLong9891, 25, 5);
		IDirect3DDevice.SetRenderState(this.aLong9891, 24, 0);
		IDirect3DDevice.SetRenderState(this.aLong9891, 22, 2);
		IDirect3DDevice.SetRenderState(this.aLong9891, 147, 1);
		IDirect3DDevice.SetRenderState(this.aLong9891, 145, 1);
		IDirect3DDevice.r(this.aLong9891, 38, 0.95F);
		IDirect3DDevice.SetRenderState(this.aLong9891, 35, 3);
		IDirect3DDevice.r(this.aLong9891, 154, 1.0F);
		D3DLIGHT.SetType(this.aLong9895, 3);
		D3DLIGHT.SetType(this.aLong9896, 3);
		D3DLIGHT.SetType(this.aLong9897, 1);
		IDirect3DDevice.SetRenderState(this.aLong9891, 206, 1);
		this.aBoolean9898 = false;
		super.method4895();
	}

	public void method5182() {
		for (int var1 = 0; var1 < this.anInt8592; var1++) {
			IDirect3DDevice.SetSamplerState(this.aLong9891, var1, 7, 2);
			IDirect3DDevice.SetSamplerState(this.aLong9891, var1, 6, 2);
			IDirect3DDevice.SetSamplerState(this.aLong9891, var1, 5, 2);
			IDirect3DDevice.SetSamplerState(this.aLong9891, var1, 1, 1);
			IDirect3DDevice.SetSamplerState(this.aLong9891, var1, 2, 1);
			this.aClass189Array9903[var1] = Class189.aClass189_1856;
			boolean[] var2 = this.aBooleanArray9915;
			this.aBooleanArray9890[var1] = true;
			var2[var1] = true;
			this.aBooleanArray9892[var1] = false;
			this.anIntArray9904[var1] = 0;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong9891, 0, 6, 1);
		IDirect3DDevice.SetRenderState(this.aLong9891, 9, 2);
		IDirect3DDevice.SetRenderState(this.aLong9891, 23, 4);
		IDirect3DDevice.SetRenderState(this.aLong9891, 25, 5);
		IDirect3DDevice.SetRenderState(this.aLong9891, 24, 0);
		IDirect3DDevice.SetRenderState(this.aLong9891, 22, 2);
		IDirect3DDevice.SetRenderState(this.aLong9891, 147, 1);
		IDirect3DDevice.SetRenderState(this.aLong9891, 145, 1);
		IDirect3DDevice.r(this.aLong9891, 38, 0.95F);
		IDirect3DDevice.SetRenderState(this.aLong9891, 35, 3);
		IDirect3DDevice.r(this.aLong9891, 154, 1.0F);
		D3DLIGHT.SetType(this.aLong9895, 3);
		D3DLIGHT.SetType(this.aLong9896, 3);
		D3DLIGHT.SetType(this.aLong9897, 1);
		IDirect3DDevice.SetRenderState(this.aLong9891, 206, 1);
		this.aBoolean9898 = false;
		super.method4895();
	}

	public void method4891(Class249 arg0, Class249 arg1, Class249 arg2) {
		IDirect3DDevice.SetTransform(this.aLong9891, 256, arg0.aFloatArray2631);
		IDirect3DDevice.SetTransform(this.aLong9891, 2, arg1.aFloatArray2631);
		IDirect3DDevice.SetTransform(this.aLong9891, 3, arg2.aFloatArray2631);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.fm(IIII)[I")
	public int[] fm(int arg0, int arg1, int arg2, int arg3) {
		int[] var5 = null;
		long var6 = IDirect3DDevice.GetRenderTarget(this.aLong9891, 0);
		long var8 = IDirect3DDevice.CreateRenderTarget(this.aLong9891, arg2, arg3, 21, 0, 0, true);
		if (r.j(IDirect3DDevice.StretchRect(this.aLong9891, var6, arg0, arg1, arg2, arg3, var8, 0, 0, arg2, arg3, 1))) {
			var5 = new int[arg2 * arg3];
			IDirect3DSurface.Download(var8, 0, 0, arg2, arg3, arg2 * 4, 16, this.aLong8459);
			this.aByteBuffer8458.clear();
			this.aByteBuffer8458.asIntBuffer().get(var5);
		}
		IUnknown.Release(var6);
		IUnknown.Release(var8);
		return var5;
	}

	public float method4887() {
		return -0.5F;
	}

	public void method5049() {
		if (this.aBoolean8601) {
			D3DLIGHT.SetDirection(this.aLong9895, -this.aFloatArray8525[0], -this.aFloatArray8525[1], -this.aFloatArray8525[2]);
			D3DLIGHT.SetDirection(this.aLong9896, -this.aFloatArray8451[0], -this.aFloatArray8451[1], -this.aFloatArray8451[2]);
			this.aBoolean9898 = false;
		}
	}

	public void method5034() {
		IDirect3DDevice.SetScissorRect(this.aLong9891, this.anInt8517 + this.anInt8610, this.anInt8518 + this.anInt8521, this.anInt8447, this.anInt8506);
	}

	public void method4960() {
		IDirect3DDevice.SetScissorRect(this.aLong9891, this.anInt8517 + this.anInt8610, this.anInt8518 + this.anInt8521, this.anInt8447, this.anInt8506);
	}

	public void method5084() {
		IDirect3DDevice.j(this.aLong9891, 174, this.aBoolean8612);
	}

	public void method5010() {
		IDirect3DDevice.j(this.aLong9891, 174, this.aBoolean8612);
	}

	public void method5041() {
		IDirect3DDevice.j(this.aLong9891, 7, this.aBoolean8526);
	}

	public void method5046() {
		if (this.aBoolean8601) {
			D3DLIGHT.SetAmbient(this.aLong9895, this.aFloat8530 * this.aFloat8533, this.aFloat8500 * this.aFloat8533, this.aFloat8532 * this.aFloat8533, 0.0F);
			this.aBoolean9898 = false;
		}
	}

	public void method5043() {
		IDirect3DDevice.j(this.aLong9891, 14, this.aBoolean8519 && this.aBoolean8454);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.dh(Z)V")
	public void dh(boolean arg0) {
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.kp(II)LInterface8_Impl1_Impl1;")
	public Interface8_Impl1_Impl1 kp(int arg0, int arg1) {
		return new Class236(this, Class86.aClass86_719, arg0, arg1, 0);
	}

	public void method5044() {
		if (this.aBoolean8601) {
			IDirect3DDevice.j(this.aLong9891, 137, this.aBoolean8522 && !this.aBoolean8575);
		}
	}

	public void method5045() {
		if (this.aBoolean8601) {
			D3DLIGHT.SetAmbient(this.aLong9895, this.aFloat8530 * this.aFloat8533, this.aFloat8500 * this.aFloat8533, this.aFloat8532 * this.aFloat8533, 0.0F);
			this.aBoolean9898 = false;
		}
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.jw()LClass76_Sub2;")
	public Class76_Sub2 jw() {
		return new Class76_Sub2_Sub3_Sub1(this);
	}

	public void method5075() {
		if (this.aBoolean8601) {
			D3DLIGHT.SetAmbient(this.aLong9895, this.aFloat8530 * this.aFloat8533, this.aFloat8500 * this.aFloat8533, this.aFloat8532 * this.aFloat8533, 0.0F);
			this.aBoolean9898 = false;
		}
	}

	public void method5047() {
		if (!this.aBoolean8601) {
			return;
		}
		float var1 = this.aBoolean8523 ? this.aFloat8489 : 0.0F;
		float var2 = this.aBoolean8523 ? -this.aFloat8535 : 0.0F;
		D3DLIGHT.SetDiffuse(this.aLong9895, var1 * this.aFloat8530, var1 * this.aFloat8500, var1 * this.aFloat8532, 0.0F);
		D3DLIGHT.SetDiffuse(this.aLong9896, var2 * this.aFloat8530, var2 * this.aFloat8500, var2 * this.aFloat8532, 0.0F);
		this.aBoolean9898 = false;
	}

	public Interface11_Impl3 method4950(int arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5) {
		return new Class229_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public void method5030() {
		if (!this.aBoolean8601) {
			return;
		}
		float var1 = this.aBoolean8523 ? this.aFloat8489 : 0.0F;
		float var2 = this.aBoolean8523 ? -this.aFloat8535 : 0.0F;
		D3DLIGHT.SetDiffuse(this.aLong9895, var1 * this.aFloat8530, var1 * this.aFloat8500, var1 * this.aFloat8532, 0.0F);
		D3DLIGHT.SetDiffuse(this.aLong9896, var2 * this.aFloat8530, var2 * this.aFloat8500, var2 * this.aFloat8532, 0.0F);
		this.aBoolean9898 = false;
	}

	public void method5048() {
		if (!this.aBoolean8601) {
			return;
		}
		float var1 = this.aBoolean8523 ? this.aFloat8489 : 0.0F;
		float var2 = this.aBoolean8523 ? -this.aFloat8535 : 0.0F;
		D3DLIGHT.SetDiffuse(this.aLong9895, var1 * this.aFloat8530, var1 * this.aFloat8500, var1 * this.aFloat8532, 0.0F);
		D3DLIGHT.SetDiffuse(this.aLong9896, var2 * this.aFloat8530, var2 * this.aFloat8500, var2 * this.aFloat8532, 0.0F);
		this.aBoolean9898 = false;
	}

	public void method5029() {
		if (this.aBoolean8601) {
			D3DLIGHT.SetDirection(this.aLong9895, -this.aFloatArray8525[0], -this.aFloatArray8525[1], -this.aFloatArray8525[2]);
			D3DLIGHT.SetDirection(this.aLong9896, -this.aFloatArray8451[0], -this.aFloatArray8451[1], -this.aFloatArray8451[2]);
			this.aBoolean9898 = false;
		}
	}

	public void method5120() {
		if (this.aBoolean8601) {
			D3DLIGHT.SetDirection(this.aLong9895, -this.aFloatArray8525[0], -this.aFloatArray8525[1], -this.aFloatArray8525[2]);
			D3DLIGHT.SetDirection(this.aLong9896, -this.aFloatArray8451[0], -this.aFloatArray8451[1], -this.aFloatArray8451[2]);
			this.aBoolean9898 = false;
		}
	}

	public Interface11_Impl3_Impl1 method5073(Class72 arg0, Class86 arg1, int arg2, int arg3) {
		return new Class229_Sub1_Sub1(this, arg0, arg1, arg2, arg3);
	}

	public void method5050() {
		if (!this.aBoolean8601 || this.aBoolean9898) {
			return;
		}
		IDirect3DDevice.LightEnable(this.aLong9891, 0, false);
		IDirect3DDevice.LightEnable(this.aLong9891, 1, false);
		IDirect3DDevice.SetLight(this.aLong9891, 0, this.aLong9895);
		IDirect3DDevice.SetLight(this.aLong9891, 1, this.aLong9896);
		IDirect3DDevice.LightEnable(this.aLong9891, 0, true);
		IDirect3DDevice.LightEnable(this.aLong9891, 1, true);
		this.aBoolean9898 = true;
	}

	public void method5098(Class184 arg0) {
		Class184_Sub1 var2 = (Class184_Sub1) arg0;
		IDirect3DDevice.SetVertexDeclaration(this.aLong9891, var2.aLong8909);
	}

	public void method5052() {
		if (!this.aBoolean8601 || this.aBoolean9898) {
			return;
		}
		IDirect3DDevice.LightEnable(this.aLong9891, 0, false);
		IDirect3DDevice.LightEnable(this.aLong9891, 1, false);
		IDirect3DDevice.SetLight(this.aLong9891, 0, this.aLong9895);
		IDirect3DDevice.SetLight(this.aLong9891, 1, this.aLong9896);
		IDirect3DDevice.LightEnable(this.aLong9891, 0, true);
		IDirect3DDevice.LightEnable(this.aLong9891, 1, true);
		this.aBoolean9898 = true;
	}

	public void method5092() {
		if (this.aBoolean8601) {
			int var1 = this.aBooleanArray9901[this.anInt8543] ? method5166(this.aClass179Array8547[this.anInt8543]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong9891, this.anInt8543, 1, var1);
		}
	}

	public void method5055() {
		int var1;
		for (var1 = 0; var1 < this.anInt8538; var1++) {
			Class330_Sub14 var2 = this.aClass330_Sub14Array8607[var1];
			int var3 = var1 + 2;
			int var4 = var2.method3313(-59578889);
			float var5 = var2.method3317(70437883) / 255.0F;
			D3DLIGHT.SetPosition(this.aLong9897, (float) var2.method3318(-1044499438), (float) var2.method3311((byte) -26), (float) var2.method3312((short) -13255));
			D3DLIGHT.SetDiffuse(this.aLong9897, (float) (var4 >> 16 & 0xFF) * var5, (float) (var4 >> 8 & 0xFF) * var5, (float) (var4 & 0xFF) * var5, 0.0F);
			D3DLIGHT.SetAttenuation(this.aLong9897, 0.0F, 0.0F, 1.0F / (float) (var2.method3316((byte) 56) * var2.method3316((byte) 25)));
			D3DLIGHT.SetRange(this.aLong9897, (float) var2.method3316((byte) -57));
			IDirect3DDevice.SetLight(this.aLong9891, var3, this.aLong9897);
			IDirect3DDevice.LightEnable(this.aLong9891, var3, true);
		}
		while (var1 < this.anInt8537) {
			IDirect3DDevice.LightEnable(this.aLong9891, var1 + 2, false);
			var1++;
		}
	}

	public void method5134(Class249 arg0, Class249 arg1, Class249 arg2) {
		IDirect3DDevice.SetTransform(this.aLong9891, 256, arg0.aFloatArray2631);
		IDirect3DDevice.SetTransform(this.aLong9891, 2, arg1.aFloatArray2631);
		IDirect3DDevice.SetTransform(this.aLong9891, 3, arg2.aFloatArray2631);
	}

	public Class184 method5003(Class193[] arg0) {
		return new Class184_Sub1(this, arg0);
	}

	public boolean method5002(Class72 arg0, Class86 arg1) {
		D3DDISPLAYMODE var3 = new D3DDISPLAYMODE();
		return r.j(IDirect3D.GetAdapterDisplayMode(this.aLong9910, this.anInt9918, var3)) && r.j(IDirect3D.CheckDeviceFormat(this.aLong9910, this.anInt9918, this.anInt9889, var3.Format, 0, 3, method5183(arg0, arg1)));
	}

	public Interface11_Impl3 method5060(Class72 arg0, int arg1, int arg2, boolean arg3, byte[] arg4, int arg5, int arg6) {
		return new Class229_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	public final void method5115(Interface9_Impl2 arg0, Class199 arg1, int arg2, int arg3, int arg4, int arg5) {
		if (this.aClass123_Sub1_9906 != null) {
			this.aClass123_Sub1_9906.method1515();
		}
		IDirect3DDevice.DrawIndexedPrimitiveIB(this.aLong9891, ((Class218) arg0).aLong8933, 4, 0, arg2, arg3, arg4, arg5);
	}

	public Interface11_Impl3 method5058(Class72 arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5, int arg6) {
		return new Class229_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	public Interface11_Impl3 method5062(Class72 arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5, int arg6) {
		return new Class229_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	public float method4901() {
		return -0.5F;
	}

	public Interface11_Impl3_Impl1 method5074(Class72 arg0, Class86 arg1, int arg2, int arg3) {
		return new Class229_Sub1_Sub1(this, arg0, arg1, arg2, arg3);
	}

	public Interface11_Impl3 method5065(int arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5) {
		return new Class229_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public Interface11_Impl3 method5066(int arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5) {
		return new Class229_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public void method5135(boolean arg0) {
		IDirect3DDevice.j(this.aLong9891, 161, arg0);
	}

	public Interface11_Impl1 method4957(int arg0, boolean arg1, int[][] arg2) {
		return new Class229_Sub2(this, arg0, arg1, arg2);
	}

	public Interface11_Impl1 method5068(int arg0, boolean arg1, int[][] arg2) {
		return new Class229_Sub2(this, arg0, arg1, arg2);
	}

	public void method5097() {
		IDirect3DDevice.j(this.aLong9891, 27, this.aBoolean8546);
	}

	public Interface11_Impl2 method5070(Class72 arg0, int arg1, int arg2, int arg3, boolean arg4, byte[] arg5) {
		return new Class229_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public Interface11_Impl2 method5071(Class72 arg0, int arg1, int arg2, int arg3, boolean arg4, byte[] arg5) {
		return new Class229_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public void method4938() {
		if (!this.aBoolean8601) {
			return;
		}
		float var1 = this.aBoolean8523 ? this.aFloat8489 : 0.0F;
		float var2 = this.aBoolean8523 ? -this.aFloat8535 : 0.0F;
		D3DLIGHT.SetDiffuse(this.aLong9895, var1 * this.aFloat8530, var1 * this.aFloat8500, var1 * this.aFloat8532, 0.0F);
		D3DLIGHT.SetDiffuse(this.aLong9896, var2 * this.aFloat8530, var2 * this.aFloat8500, var2 * this.aFloat8532, 0.0F);
		this.aBoolean9898 = false;
	}

	public void method5083() {
		if (this.aLong9907 != 0L || this.aClass181Array8509[this.anInt8543] == Class181.aClass181_1784) {
			IDirect3DDevice.SetTextureStageState(this.aLong9891, this.anInt8543, 24, 0);
			this.anIntArray9904[this.anInt8543] = 0;
			return;
		}
		if (this.aClass181Array8509[this.anInt8543] == Class181.aClass181_1785) {
			IDirect3DDevice.SetTransform(this.aLong9891, this.anInt8543 + 16, this.aClass249Array8545[this.anInt8543].method2506(this.aFloatArray9913));
		} else {
			IDirect3DDevice.SetTransform(this.aLong9891, this.anInt8543 + 16, this.aClass249Array8545[this.anInt8543].method2514(this.aFloatArray9913));
		}
		int var1 = method5167(this.aClass181Array8509[this.anInt8543]);
		if (var1 != this.anIntArray9904[this.anInt8543]) {
			IDirect3DDevice.SetTextureStageState(this.aLong9891, this.anInt8543, 24, var1);
			this.anIntArray9904[this.anInt8543] = var1;
		}
	}

	public Interface11_Impl3 method4899(int arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5) {
		return new Class229_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public void method5078() {
		if (this.aBooleanArray9901[this.anInt8543]) {
			this.aBooleanArray9901[this.anInt8543] = false;
			IDirect3DDevice.SetTexture(this.aLong9891, this.anInt8543, 0L);
			this.method4968();
			this.method5053();
		}
	}

	public void method5096() {
		switch(this.aClass176_8583.anInt1746) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong9891, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong9891, 20, 2);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong9891, 19, 9);
				IDirect3DDevice.SetRenderState(this.aLong9891, 20, 2);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong9891, 19, 5);
				IDirect3DDevice.SetRenderState(this.aLong9891, 20, 6);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong9891, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong9891, 20, 1);
		}
		switch(this.anInt8613) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong9891, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong9891, 208, 1);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong9891, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong9891, 208, 1);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong9891, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong9891, 208, 2);
		}
	}

	public void method4913() {
		IDirect3DDevice.SetScissorRect(this.aLong9891, this.anInt8517 + this.anInt8610, this.anInt8518 + this.anInt8521, this.anInt8447, this.anInt8506);
	}

	public boolean method4886() {
		return (this.aD3DCAPS9908.PixelShaderVersion & 0xFFFF) >= 257;
	}

	public void method5087() {
	}

	public void method5028() {
		if (!this.aBoolean8601) {
			return;
		}
		float var1 = this.aBoolean8523 ? this.aFloat8489 : 0.0F;
		float var2 = this.aBoolean8523 ? -this.aFloat8535 : 0.0F;
		D3DLIGHT.SetDiffuse(this.aLong9895, var1 * this.aFloat8530, var1 * this.aFloat8500, var1 * this.aFloat8532, 0.0F);
		D3DLIGHT.SetDiffuse(this.aLong9896, var2 * this.aFloat8530, var2 * this.aFloat8500, var2 * this.aFloat8532, 0.0F);
		this.aBoolean9898 = false;
	}

	public void method5088() {
	}

	public void method5089() {
	}

	public void method4988() {
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.dt()LClass51;")
	public Class51 dt() {
		D3DADAPTER_IDENTIFIER var1 = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(this.aLong9910, this.anInt9918, 0, var1);
		return new Class51(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
	}

	public void method5093(int arg0) {
		IDirect3DDevice.SetRenderState(this.aLong9891, 168, arg0);
	}

	public void method5094(int arg0) {
		IDirect3DDevice.SetRenderState(this.aLong9891, 168, arg0);
	}

	public void method5095() {
		switch(this.aClass176_8583.anInt1746) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong9891, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong9891, 20, 2);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong9891, 19, 9);
				IDirect3DDevice.SetRenderState(this.aLong9891, 20, 2);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong9891, 19, 5);
				IDirect3DDevice.SetRenderState(this.aLong9891, 20, 6);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong9891, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong9891, 20, 1);
		}
		switch(this.anInt8613) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong9891, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong9891, 208, 1);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong9891, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong9891, 208, 1);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong9891, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong9891, 208, 2);
		}
	}

	public static final int method5183(Class72 arg0, Class86 arg1) {
		switch(arg1.anInt722) {
			case 1:
				switch(arg0.anInt619) {
					case 1:
						return jagdx.i.u;
					case 2:
						return 28;
					case 3:
						return 21;
					case 4:
						return 50;
					case 5:
					default:
						throw new IllegalArgumentException("");
					case 6:
						return 51;
					case 7:
						return 77;
					case 8:
						return jagdx.i.q;
					case 9:
						return 22;
				}
			case 5:
				if (arg0 == Class72.aClass72_620) {
					return 116;
				}
				break;
			case 8:
				if (arg0 == Class72.aClass72_620) {
					return 113;
				}
		}
		throw new IllegalArgumentException("");
	}

	public void method5100() {
		if (this.aBoolean8601) {
			IDirect3DDevice.j(this.aLong9891, 28, this.aBoolean8514 && this.aBoolean8502 && this.anInt8578 >= 0);
		}
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.dl(II)V")
	public void dl(int arg0, int arg1) throws Exception_Sub1 {
		IDirect3DDevice.EndScene(this.aLong9891);
		int var3 = this.aClass76_Sub1_4234.method874();
		if (!r.r(var3)) {
			this.anInt9894 = 0;
		} else if (var3 == -2005530520) {
			this.aClass76_Sub1_4234.method179();
			this.method5178();
			((Class76_Sub1_Sub2_Sub1) this.aClass76_Sub1_4234).method173();
		} else if (++this.anInt9894 > 50) {
			throw new Exception_Sub1(var3);
		}
		IDirect3DDevice.BeginScene(this.aLong9891);
		if (this.anInterface_ma4227 != null) {
			this.anInterface_ma4227.method224((short) 8477);
		}
	}

	public void method5025() {
		this.aFloat8581 = this.aFloat8504 - (float) this.anInt8560;
		this.aFloat8580 = this.aFloat8581 - (float) this.anInt8578;
		if (this.aFloat8580 < this.aFloat8471) {
			this.aFloat8580 = this.aFloat8471;
		}
		if (this.aBoolean8601) {
			IDirect3DDevice.r(this.aLong9891, 36, this.aFloat8580);
			IDirect3DDevice.r(this.aLong9891, 37, this.aFloat8581);
			IDirect3DDevice.SetRenderState(this.aLong9891, 34, this.anInt8476);
		}
	}

	public void method5121() {
		this.aFloat8581 = this.aFloat8504 - (float) this.anInt8560;
		this.aFloat8580 = this.aFloat8581 - (float) this.anInt8578;
		if (this.aFloat8580 < this.aFloat8471) {
			this.aFloat8580 = this.aFloat8471;
		}
		if (this.aBoolean8601) {
			IDirect3DDevice.r(this.aLong9891, 36, this.aFloat8580);
			IDirect3DDevice.r(this.aLong9891, 37, this.aFloat8581);
			IDirect3DDevice.SetRenderState(this.aLong9891, 34, this.anInt8476);
		}
	}

	public void method4991() {
		if (this.aBoolean8601) {
			IDirect3DDevice.j(this.aLong9891, 28, this.aBoolean8514 && this.aBoolean8502 && this.anInt8578 >= 0);
		}
	}

	public final void method5139(int arg0, Class175 arg1, boolean arg2) {
		if (!this.aBoolean8601) {
			return;
		}
		int var4 = 0;
		byte var5;
		switch(arg0) {
			case 1:
				var5 = 6;
				break;
			case 2:
				var5 = 27;
				break;
			default:
				var5 = 5;
		}
		if (arg2) {
			var4 |= 0x10;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong9891, this.anInt8543, var5, method5186(arg1) | var4);
	}

	public void method5101() {
		if (this.aBoolean8601) {
			IDirect3DDevice.j(this.aLong9891, 28, this.aBoolean8514 && this.aBoolean8502 && this.anInt8578 >= 0);
		}
	}

	public void method5102(boolean arg0) {
		IDirect3DDevice.j(this.aLong9891, 161, arg0);
	}

	public Class184 method4931(Class193[] arg0) {
		return new Class184_Sub1(this, arg0);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.df()V")
	public void df() {
		long var1 = IDirect3DDevice.CreateEventQuery(this.aLong9891);
		if (r.j(IDirect3DEventQuery.Issue(var1))) {
			while (true) {
				int var3 = IDirect3DEventQuery.IsSignaled(var1);
				if (var3 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		IUnknown.Release(var1);
	}

	public void method4973() {
		IDirect3DDevice.j(this.aLong9891, 15, this.aBoolean8585);
	}

	public void method5105(Class184 arg0) {
		Class184_Sub1 var2 = (Class184_Sub1) arg0;
		IDirect3DDevice.SetVertexDeclaration(this.aLong9891, var2.aLong8909);
	}

	public void method5106(int arg0, Interface9_Impl1 arg1) {
		Class224 var3 = (Class224) arg1;
		IDirect3DDevice.SetStreamSource(this.aLong9891, arg0, var3.aLong8927, 0, var3.method2299());
	}

	public void method5107(int arg0, Interface9_Impl1 arg1) {
		Class224 var3 = (Class224) arg1;
		IDirect3DDevice.SetStreamSource(this.aLong9891, arg0, var3.aLong8927, 0, var3.method2299());
	}

	public void method5004(Interface9_Impl2 arg0) {
		IDirect3DDevice.SetIndices(this.aLong9891, ((Class218) arg0).aLong8933);
	}

	public void method5108(Interface9_Impl2 arg0) {
		IDirect3DDevice.SetIndices(this.aLong9891, ((Class218) arg0).aLong8933);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.dy()V")
	public void dy() {
		long var1 = IDirect3DDevice.CreateEventQuery(this.aLong9891);
		if (r.j(IDirect3DEventQuery.Issue(var1))) {
			while (true) {
				int var3 = IDirect3DEventQuery.IsSignaled(var1);
				if (var3 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		IUnknown.Release(var1);
	}

	public void method5110(Interface9_Impl2 arg0) {
		IDirect3DDevice.SetIndices(this.aLong9891, ((Class218) arg0).aLong8933);
	}

	public final void method5113(Class199 arg0, int arg1, int arg2) {
		if (this.aClass123_Sub1_9906 != null) {
			this.aClass123_Sub1_9906.method1515();
		}
		IDirect3DDevice.DrawPrimitive(this.aLong9891, method5171(arg0), arg1, arg2);
	}

	public final void method5104(Class199 arg0, int arg1, int arg2) {
		if (this.aClass123_Sub1_9906 != null) {
			this.aClass123_Sub1_9906.method1515();
		}
		IDirect3DDevice.DrawPrimitive(this.aLong9891, method5171(arg0), arg1, arg2);
	}

	public void method5133(Class249 arg0, Class249 arg1, Class249 arg2) {
		IDirect3DDevice.SetTransform(this.aLong9891, 256, arg0.aFloatArray2631);
		IDirect3DDevice.SetTransform(this.aLong9891, 2, arg1.aFloatArray2631);
		IDirect3DDevice.SetTransform(this.aLong9891, 3, arg2.aFloatArray2631);
	}

	public final void method5038(Class199 arg0, int arg1, int arg2, int arg3, int arg4) {
		if (this.aClass123_Sub1_9906 != null) {
			this.aClass123_Sub1_9906.method1515();
		}
		IDirect3DDevice.DrawIndexedPrimitive(this.aLong9891, method5171(arg0), 0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.dc(II)V")
	public void dc(int arg0, int arg1) throws Exception_Sub1 {
		IDirect3DDevice.EndScene(this.aLong9891);
		int var3 = this.aClass76_Sub1_4234.method874();
		if (!r.r(var3)) {
			this.anInt9894 = 0;
		} else if (var3 == -2005530520) {
			this.aClass76_Sub1_4234.method179();
			this.method5178();
			((Class76_Sub1_Sub2_Sub1) this.aClass76_Sub1_4234).method173();
		} else if (++this.anInt9894 > 50) {
			throw new Exception_Sub1(var3);
		}
		IDirect3DDevice.BeginScene(this.aLong9891);
		if (this.anInterface_ma4227 != null) {
			this.anInterface_ma4227.method224((short) -9665);
		}
	}

	public void method5117(int arg0) {
		if (!this.aBoolean9912) {
			int var2 = (arg0 & 0x2) == 0 ? 3 : 2;
			IDirect3DDevice.SetRenderState(this.aLong9891, 8, var2);
		}
	}

	public static Class_ra method5184(Canvas arg0, Interface_ma arg1, IndexTable arg2, Integer arg3) {
		Class_ra_Sub2_Sub2 var4 = null;
		try {
			byte var6 = 0;
			byte var7 = 1;
			long var8 = IDirect3D.Direct3DCreate();
			D3DCAPS var10 = new D3DCAPS();
			IDirect3D.GetDeviceCaps(var8, var6, var7, var10);
			if (var10.MaxSimultaneousTextures < 2) {
				throw new RuntimeException("");
			} else if ((var10.TextureOpCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if ((var10.TextureOpCaps & 0x8) == 0) {
				throw new RuntimeException("");
			} else if ((var10.TextureOpCaps & 0x40) == 0) {
				throw new RuntimeException("");
			} else if ((var10.TextureOpCaps & 0x200) == 0) {
				throw new RuntimeException("");
			} else if ((var10.TextureOpCaps & 0x2000000) == 0) {
				throw new RuntimeException("");
			} else if ((var10.SrcBlendCaps & var10.DestBlendCaps & 0x10) == 0) {
				throw new RuntimeException("");
			} else if ((var10.SrcBlendCaps & var10.DestBlendCaps & 0x20) == 0) {
				throw new RuntimeException("");
			} else if ((var10.SrcBlendCaps & var10.DestBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (var10.MaxActiveLights > 0 && var10.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (var10.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				D3DPRESENT_PARAMETERS var11 = new D3DPRESENT_PARAMETERS(arg0);
				var11.Windowed = true;
				var11.EnableAutoDepthStencil = true;
				var11.BackBufferWidth = arg0.getWidth();
				var11.BackBufferHeight = arg0.getHeight();
				var11.BackBufferCount = 1;
				var11.PresentationInterval = Integer.MIN_VALUE;
				if (!method5172(var6, var7, var8, arg3, var11)) {
					throw new RuntimeException("");
				}
				int var12 = 0;
				if ((var10.DevCaps & 0x100000) != 0) {
					var12 |= 0x10;
				}
				long var13 = 0L;
				try {
					var13 = IDirect3D.CreateDeviceContext(var8, var6, var7, arg0, var12 | 0x40, var11);
				} catch (z var16) {
					var13 = IDirect3D.CreateDeviceContext(var8, var6, var7, arg0, var12 & 0xFFEFFFFF | 0x20, var11);
				}
				var4 = new Class_ra_Sub2_Sub2(var6, var7, var8, var13, var11, var10, arg1, arg2, arg3);
				if (!var4.aHashtable4231.containsKey(arg0)) {
					Class377.method4375(arg0, -1433851980);
					var4.method4805(arg0, new Class76_Sub1_Sub2_Sub1(var4, arg0, arg0.getWidth(), arg0.getHeight(), true), 1850446711);
				}
				var4.method4784(arg0, 729711285);
				var4.method4910();
				return var4;
			}
		} catch (RuntimeException var17) {
			if (var4 != null) {
				var4.u();
			}
			throw var17;
		}
	}

	public final void method4967() {
		if (this.aBoolean8601) {
			IDirect3DDevice.SetRenderState(this.aLong9891, 60, this.anInt8445);
		}
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.u()V")
	public void u() {
		super.u();
		if (this.aLong9895 != 0L) {
			D3DLIGHT.Destroy(this.aLong9895);
			this.aLong9895 = 0L;
		}
		if (this.aLong9896 != 0L) {
			D3DLIGHT.Destroy(this.aLong9896);
			this.aLong9896 = 0L;
		}
		if (this.aLong9897 != 0L) {
			D3DLIGHT.Destroy(this.aLong9897);
			this.aLong9897 = 0L;
		}
		if (this.aLong9891 != 0L) {
			IDirect3DDevice.Destroy(this.aLong9891);
			this.aLong9891 = 0L;
		}
		if (this.aLong9910 != 0L) {
			IUnknown.Release(this.aLong9910);
			this.aLong9910 = 0L;
		}
	}

	public Class105 method4928(String arg0) {
		byte[] var2 = this.method5169(arg0);
		if (var2 == null) {
			return null;
		} else {
			Class113 var3 = this.method4890(var2);
			return new Class105_Sub1(this, var3);
		}
	}

	public void method4934() {
		if (this.aBoolean8601) {
			IDirect3DDevice.j(this.aLong9891, 137, this.aBoolean8522 && !this.aBoolean8575);
		}
	}

	public boolean method5051() {
		return (this.aD3DCAPS9908.VertexShaderVersion & 0xFFFF) >= 257;
	}

	public void method5118() {
		if (this.aClass76_4228 != null) {
			IDirect3DDevice.SetViewport(this.aLong9891, this.anInt8517 + this.anInt8531, this.anInt8518 + this.anInt8567, this.anInt8515, this.anInt8516, this.aFloat8499, this.aFloat8478);
		}
	}

	public void method4932() {
		IDirect3DDevice.j(this.aLong9891, 7, this.aBoolean8526);
	}

	public void method5185() {
		for (Class330_Sub35 var1 = (Class330_Sub35) this.aClass471_9893.method5869(539664854); var1 != null; var1 = (Class330_Sub35) this.aClass471_9893.method5873((byte) -83)) {
			Interface13 var2 = (Interface13) var1.anObject7733;
			var2.method179();
		}
		super.method4998();
	}

	public static final int method5186(Class175 arg0) {
		switch(arg0.anInt1742) {
			case 0:
				return 3;
			case 1:
				return 2;
			case 2:
				return 0;
			case 3:
				return 1;
			default:
				throw new IllegalArgumentException();
		}
	}

	public void method4914() {
		IDirect3DDevice.j(this.aLong9891, 174, this.aBoolean8612);
	}

	public void method4917(Class249 arg0) {
		arg0.method2483(this.aClass249_9905);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.di()V")
	public void di() {
		super.u();
		if (this.aLong9895 != 0L) {
			D3DLIGHT.Destroy(this.aLong9895);
			this.aLong9895 = 0L;
		}
		if (this.aLong9896 != 0L) {
			D3DLIGHT.Destroy(this.aLong9896);
			this.aLong9896 = 0L;
		}
		if (this.aLong9897 != 0L) {
			D3DLIGHT.Destroy(this.aLong9897);
			this.aLong9897 = 0L;
		}
		if (this.aLong9891 != 0L) {
			IDirect3DDevice.Destroy(this.aLong9891);
			this.aLong9891 = 0L;
		}
		if (this.aLong9910 != 0L) {
			IUnknown.Release(this.aLong9910);
			this.aLong9910 = 0L;
		}
	}

	public void method5020(Class249 arg0) {
		arg0.method2483(this.aClass249_9905);
	}

	public void method5122() {
		this.method4938();
		this.method4939();
	}

	public Class105 method5024(String arg0) {
		byte[] var2 = this.method5169(arg0);
		if (var2 == null) {
			return null;
		} else {
			Class113 var3 = this.method4890(var2);
			return new Class105_Sub1(this, var3);
		}
	}

	public void method5124() {
		this.method4938();
		this.method4939();
	}

	public void method5011() {
	}

	public boolean method5125(Class72 arg0, Class86 arg1) {
		D3DDISPLAYMODE var3 = new D3DDISPLAYMODE();
		return r.j(IDirect3D.GetAdapterDisplayMode(this.aLong9910, this.anInt9918, var3)) && r.j(IDirect3D.CheckDeviceFormat(this.aLong9910, this.anInt9918, this.anInt9889, var3.Format, 0, 4, method5183(arg0, arg1)));
	}

	public final void method4987(Class199 arg0, int arg1, int arg2, int arg3, int arg4) {
		if (this.aClass123_Sub1_9906 != null) {
			this.aClass123_Sub1_9906.method1515();
		}
		IDirect3DDevice.DrawIndexedPrimitive(this.aLong9891, method5171(arg0), 0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.iu(LClass92;LClass92;FLClass92;)LClass92;")
	public Class92 iu(Class92 arg0, Class92 arg1, float arg2, Class92 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	public void method5127() {
		if (this.aBoolean8601) {
			int var1 = this.aBooleanArray9901[this.anInt8543] ? method5166(this.aClass179Array8548[this.anInt8543]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong9891, this.anInt8543, 4, var1);
		}
	}

	public final void method5128() {
		if (this.aBoolean8601) {
			IDirect3DDevice.SetRenderState(this.aLong9891, 60, this.anInt8445);
		}
	}

	public void method5129() {
		IDirect3DDevice.j(this.aLong9891, 15, this.aBoolean8585);
	}

	public void method5000() {
		if (!this.aBoolean8601 || this.aBoolean9898) {
			return;
		}
		IDirect3DDevice.LightEnable(this.aLong9891, 0, false);
		IDirect3DDevice.LightEnable(this.aLong9891, 1, false);
		IDirect3DDevice.SetLight(this.aLong9891, 0, this.aLong9895);
		IDirect3DDevice.SetLight(this.aLong9891, 1, this.aLong9896);
		IDirect3DDevice.LightEnable(this.aLong9891, 0, true);
		IDirect3DDevice.LightEnable(this.aLong9891, 1, true);
		this.aBoolean9898 = true;
	}

	public void method4989() {
		IDirect3DDevice.j(this.aLong9891, 15, this.aBoolean8585);
	}

	public final Interface9_Impl2 method5130(boolean arg0) {
		return new Class218(this, Class86.aClass86_718, arg0);
	}

	public final Interface9_Impl1 method5131(boolean arg0) {
		return new Class224(this, arg0);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.fu(Ljava/awt/Canvas;II)LClass76_Sub1;")
	public Class76_Sub1 fu(Canvas arg0, int arg1, int arg2) {
		return new Class76_Sub1_Sub2_Sub1(this, arg0, arg1, arg2, false);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub2.dv(II)V")
	public void dv(int arg0, int arg1) throws Exception_Sub1 {
		IDirect3DDevice.EndScene(this.aLong9891);
		int var3 = this.aClass76_Sub1_4234.method874();
		if (!r.r(var3)) {
			this.anInt9894 = 0;
		} else if (var3 == -2005530520) {
			this.aClass76_Sub1_4234.method179();
			this.method5178();
			((Class76_Sub1_Sub2_Sub1) this.aClass76_Sub1_4234).method173();
		} else if (++this.anInt9894 > 50) {
			throw new Exception_Sub1(var3);
		}
		IDirect3DDevice.BeginScene(this.aLong9891);
		if (this.anInterface_ma4227 != null) {
			this.anInterface_ma4227.method224((short) -711);
		}
	}

	public void method5109(Interface9_Impl2 arg0) {
		IDirect3DDevice.SetIndices(this.aLong9891, ((Class218) arg0).aLong8933);
	}

	public Interface11_Impl3 method5061(Class72 arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5, int arg6) {
		return new Class229_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	public final void method5080(int arg0, Class175 arg1, boolean arg2, boolean arg3) {
		if (!this.aBoolean8601) {
			return;
		}
		int var5 = 0;
		byte var6;
		switch(arg0) {
			case 1:
				var6 = 3;
				break;
			case 2:
				var6 = 26;
				break;
			default:
				var6 = 2;
		}
		if (arg2) {
			var5 |= 0x20;
		}
		if (arg3) {
			var5 |= 0x10;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong9891, this.anInt8543, var6, method5186(arg1) | var5);
	}

	public boolean method5056(Class72 arg0, Class86 arg1) {
		D3DDISPLAYMODE var3 = new D3DDISPLAYMODE();
		return r.j(IDirect3D.GetAdapterDisplayMode(this.aLong9910, this.anInt9918, var3)) && r.j(IDirect3D.CheckDeviceFormat(this.aLong9910, this.anInt9918, this.anInt9889, var3.Format, 0, 3, method5183(arg0, arg1)));
	}

	public void method5035() {
		IDirect3DDevice.j(this.aLong9891, 15, this.aBoolean8585);
	}

	public Interface11_Impl3 method5136(Class72 arg0, Class86 arg1, int arg2, int arg3) {
		return new Class229_Sub1(this, arg0, arg1, arg2, arg3);
	}

	public void method4941(Class249 arg0, Class249 arg1, Class249 arg2) {
		IDirect3DDevice.SetTransform(this.aLong9891, 256, arg0.aFloatArray2631);
		IDirect3DDevice.SetTransform(this.aLong9891, 2, arg1.aFloatArray2631);
		IDirect3DDevice.SetTransform(this.aLong9891, 3, arg2.aFloatArray2631);
	}

	public Interface11_Impl3_Impl1 method5072(Class72 arg0, Class86 arg1, int arg2, int arg3) {
		return new Class229_Sub1_Sub1(this, arg0, arg1, arg2, arg3);
	}

	public Interface11_Impl3 method5137(Class72 arg0, Class86 arg1, int arg2, int arg3) {
		return new Class229_Sub1(this, arg0, arg1, arg2, arg3);
	}

	public Interface11_Impl3 method5138(Class72 arg0, Class86 arg1, int arg2, int arg3) {
		return new Class229_Sub1(this, arg0, arg1, arg2, arg3);
	}

	public boolean method4996(Class72 arg0, Class86 arg1) {
		D3DDISPLAYMODE var3 = new D3DDISPLAYMODE();
		return r.j(IDirect3D.GetAdapterDisplayMode(this.aLong9910, this.anInt9918, var3)) && r.j(IDirect3D.CheckDeviceFormat(this.aLong9910, this.anInt9918, this.anInt9889, var3.Format, 0, 4, method5183(arg0, arg1)));
	}
}
