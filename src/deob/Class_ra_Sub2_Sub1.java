package deob;

import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;

public class Class_ra_Sub2_Sub1 extends Class_ra_Sub2 {

	public Class471 aClass471_9870 = new Class471();

	public Class471 aClass471_9860 = new Class471();

	public Class471 aClass471_9861 = new Class471();

	public Class471 aClass471_9862 = new Class471();

	public Class471 aClass471_9863 = new Class471();

	public Class471 aClass471_9864 = new Class471();

	public Class471 aClass471_9865 = new Class471();

	public int[] anIntArray9882 = new int[1000];

	public Class266_Sub1[] aClass266_Sub1Array9872 = new Class266_Sub1[16];

	public float[] aFloatArray9858;

	public float[] aFloatArray9887;

	public OpenGL anOpenGL9881;

	public String aString9876;

	public String aString9877;

	public int anInt9859;

	public boolean aBoolean9879;

	public boolean aBoolean9880;

	public boolean aBoolean9867;

	public boolean aBoolean9873;

	public boolean aBoolean9883;

	public int[] anIntArray9874;

	public int anInt9884;

	public int anInt9871;

	public long aLong9866;

	public Class123_Sub2 aClass123_Sub2_9875;

	public Class266_Sub2 aClass266_Sub2_9886;

	public boolean aBoolean9868;

	public boolean aBoolean9869;

	public boolean aBoolean9878;

	public boolean aBoolean9885;

	public Class_ra_Sub2_Sub1(OpenGL arg0, Canvas arg1, long arg2, Interface_ma arg3, IndexTable arg4, int arg5) {
		super(arg3, arg4, arg5, 1);
		new MapBuffer();
		new MapBuffer();
		this.aFloatArray9858 = new float[4];
		this.aFloatArray9887 = new float[16];
		int[] var8 = new int[1];
		try {
			this.anOpenGL9881 = arg0;
			this.anOpenGL9881.j();
			this.aString9876 = OpenGL.glGetString(7936).toLowerCase();
			this.aString9877 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString9876.indexOf("microsoft") != -1 || this.aString9876.indexOf("brian paul") != -1 || this.aString9876.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			String var9 = OpenGL.glGetString(7938);
			String[] var10 = Class226.method2309(var9.replace('.', ' '), ' ', (byte) -64);
			if (var10.length < 2) {
				throw new RuntimeException("");
			}
			int var11;
			try {
				var11 = Class204.method2185(var10[0], (byte) -123);
				int var12 = Class204.method2185(var10[1], (byte) -80);
				this.anInt9859 = var11 * 10 + var12;
			} catch (NumberFormatException var19) {
				throw new RuntimeException("");
			}
			if (this.anInt9859 < 12) {
				throw new RuntimeException("");
			}
			OpenGL.glGetIntegerv(34018, var8, 0);
			this.anInt8592 = var8[0];
			if (this.anInt8592 < 2) {
				throw new RuntimeException("");
			}
			this.anInt8593 = 8;
			this.aBoolean9879 = this.anOpenGL9881.r("GL_ARB_vertex_buffer_object");
			this.aBoolean8566 = this.anOpenGL9881.r("GL_ARB_multisample");
			this.aBoolean9880 = this.anOpenGL9881.r("GL_ARB_texture_rectangle");
			this.anOpenGL9881.r("GL_ARB_texture_cube_map");
			this.aBoolean9867 = this.anOpenGL9881.r("GL_ARB_texture_non_power_of_two");
			this.aBoolean8598 = true;
			this.aBoolean9873 = this.anOpenGL9881.r("GL_ARB_vertex_shader");
			this.anOpenGL9881.r("GL_ARB_vertex_program");
			this.aBoolean9883 = this.anOpenGL9881.r("GL_ARB_fragment_shader");
			this.anOpenGL9881.r("GL_ARB_fragment_program");
			this.anOpenGL9881.r("GL_EXT_framebuffer_object");
			this.anIntArray9874 = new int[this.anInt8592];
			this.aBoolean8594 = this.anOpenGL9881.r("GL_EXT_framebuffer_object");
			this.aBoolean8595 = this.anOpenGL9881.r("GL_EXT_framebuffer_blit");
			this.aBoolean8496 = this.anOpenGL9881.r("GL_EXT_framebuffer_multisample");
			if (!this.method5051() || !this.method4886()) {
				if (!this.anOpenGL9881.r("GL_ARB_multitexture")) {
					throw new RuntimeException("");
				}
				if (!this.anOpenGL9881.r("GL_ARB_texture_env_combine")) {
					throw new RuntimeException("");
				}
			}
			this.anInt9884 = Stream.z() ? 33639 : 5121;
			if (this.aString9877.indexOf("radeon") != -1) {
				var11 = 0;
				boolean var22 = false;
				boolean var13 = false;
				String[] var14 = Class226.method2309(this.aString9877.replace('/', ' '), ' ', (byte) -113);
				for (int var15 = 0; var15 < var14.length; var15++) {
					String var16 = var14[var15];
					try {
						if (var16.length() > 0) {
							if (var16.charAt(0) == 'x' && var16.length() >= 3 && Class72.method829(var16.substring(1, 3), 1100722716)) {
								var16 = var16.substring(1);
								var13 = true;
							}
							if (var16.equals("hd")) {
								var22 = true;
							} else {
								if (var16.startsWith("hd")) {
									var16 = var16.substring(2);
									var22 = true;
								}
								if (var16.length() >= 4 && Class72.method829(var16.substring(0, 4), -1901410822)) {
									var11 = Class204.method2185(var16.substring(0, 4), (byte) -52);
									break;
								}
							}
						}
					} catch (Exception var20) {
					}
				}
				if (!var13 && !var22) {
					if (var11 >= 7000 && var11 <= 7999) {
						this.aBoolean9879 = false;
					}
					if (var11 >= 7000 && var11 <= 9250) {
						this.aBoolean8598 = false;
					}
				}
				this.aBoolean9880 &= this.anOpenGL9881.r("GL_ARB_half_float_pixel");
			}
			if (this.aString9876.indexOf("intel") == -1) {
			}
			if (this.aBoolean9879) {
				try {
					int[] var23 = new int[1];
					OpenGL.glGenBuffersARB(1, var23, 0);
				} catch (Throwable var18) {
					throw new RuntimeException("");
				}
			}
			this.method4805(arg1, new Class76_Sub1_Sub2_Sub2(this, arg1, arg2), 1850446711);
			this.method4784(arg1, 54748574);
			this.method4908(32768, false);
			this.method4908(32768, false);
		} catch (Throwable var21) {
			var21.printStackTrace();
			this.method4781(628001038);
			if (var21 instanceof OutOfMemoryError) {
				throw (OutOfMemoryError) var21;
			}
			throw new RuntimeException("");
		}
	}

	public void method4912() {
		if (this.aClass76_4228 != null) {
			OpenGL.glViewport(this.anInt8517 + this.anInt8531, this.anInt8518 + this.aClass76_4228.method857() - this.anInt8567 - this.anInt8516, this.anInt8515, this.anInt8516);
		}
		OpenGL.glDepthRange(this.aFloat8499, this.aFloat8478);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.kb(III)LInterface8_Impl1_Impl1;")
	public Interface8_Impl1_Impl1 kb(int arg0, int arg1, int arg2) {
		return new Class264(this, Class72.aClass72_610, Class86.aClass86_719, arg0, arg1, arg2);
	}

	public boolean method5051() {
		return this.aBoolean9873;
	}

	public boolean method4886() {
		return this.aBoolean9883;
	}

	public void method4895() {
		OpenGL.glDepthFunc(515);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		for (int var1 = this.anInt8592 - 1; var1 >= 0; var1--) {
			OpenGL.glActiveTexture(var1 + 33984);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		float[] var4 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (int var2 = 0; var2 < 8; var2++) {
			int var3 = var2 + 16384;
			OpenGL.glLightfv(var3, 4608, var4, 0);
			OpenGL.glLightf(var3, 4615, 0.0F);
			OpenGL.glLightf(var3, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL9881.setSwapInterval(0);
		super.method4895();
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.fi(II)V")
	public void fi(int arg0, int arg1) {
		int var3 = 0;
		if ((arg0 & 0x1) != 0) {
			OpenGL.glClearColor((float) (arg1 & 0xFF0000) / 1.671168E7F, (float) (arg1 & 0xFF00) / 65280.0F, (float) (arg1 & 0xFF) / 255.0F, (float) (arg1 >>> 24) / 255.0F);
			var3 = 16384;
		}
		if ((arg0 & 0x2) != 0) {
			this.method4962(true);
			var3 |= 0x100;
		}
		if ((arg0 & 0x4) != 0) {
			var3 |= 0x400;
		}
		OpenGL.glClear(var3);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.w(II)V")
	public void w(int arg0, int arg1) throws Exception_Sub1 {
		this.aClass76_Sub1_4234.method874();
		if (this.anInterface_ma4227 != null) {
			this.anInterface_ma4227.method224((short) 9633);
		}
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.l()V")
	public void l() {
		OpenGL.glFinish();
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.u()V")
	public void u() {
		super.u();
		if (this.anOpenGL9881 != null) {
			this.anOpenGL9881.i();
			this.anOpenGL9881.release();
			this.anOpenGL9881 = null;
		}
	}

	public float method4901() {
		return 0.0F;
	}

	public final synchronized void method5140(int arg0, int arg1) {
		Class330_Sub23 var3 = new Class330_Sub23(arg1);
		var3.aLong3341 = (long) arg0 * -1420004262915178823L * -6154793640677333111L;
		this.aClass471_9863.method5878(var3, (short) 8192);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.ag()LClass76_Sub2;")
	public Class76_Sub2 ag() {
		return new Class76_Sub2_Sub3_Sub2(this);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.az(IILClass72;LClass86;I)LInterface8_Impl1_Impl2;")
	public Interface8_Impl1_Impl2 az(int arg0, int arg1, Class72 arg2, Class86 arg3, int arg4) {
		return new Class264(this, arg2, arg3, arg0, arg1, arg4);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.ah(II)LInterface8_Impl1_Impl1;")
	public Interface8_Impl1_Impl1 ah(int arg0, int arg1) {
		return new Class264(this, Class72.aClass72_610, Class86.aClass86_719, arg0, arg1);
	}

	public void method4913() {
		if (this.aClass76_4228 == null) {
			return;
		}
		int var1 = this.anInt8517 + this.anInt8610;
		int var2 = this.anInt8518 + this.aClass76_4228.method857() - this.anInt8506;
		int var3 = this.anInt8447 - this.anInt8610;
		int var4 = this.anInt8506 - this.anInt8521;
		if (var3 < 0) {
			var3 = 0;
		}
		if (var4 < 0) {
			var4 = 0;
		}
		OpenGL.glScissor(var1, var2, var3, var4);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.ar(IIII)[I")
	public int[] ar(int arg0, int arg1, int arg2, int arg3) {
		int[] var5 = new int[arg2 * arg3];
		int var6 = this.aClass76_4228.method857();
		for (int var7 = 0; var7 < arg3; var7++) {
			OpenGL.glReadPixelsi(arg0, var6 - arg1 - var7 - 1, arg2, 1, 32993, this.anInt9884, var5, var7 * arg2);
		}
		return var5;
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.am()V")
	public void am() {
		if (this.aClass76_4228 == null) {
			return;
		}
		int var1 = this.aClass76_4228.method856();
		int var2 = this.aClass76_4228.method857();
		if (var1 <= 0 && var2 <= 0) {
			return;
		}
		int var3 = this.anInt8531;
		int var4 = this.anInt8567;
		int var5 = this.anInt8515;
		int var6 = this.anInt8516;
		this.au();
		int var7 = this.anInt8610;
		int var8 = this.anInt8447;
		int var9 = this.anInt8521;
		int var10 = this.anInt8506;
		this.L();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method4924();
		this.method4882(false);
		this.method4995(false);
		this.method5005(false);
		this.method4962(false);
		this.method4956(null);
		this.method4889(1);
		this.method4970(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, var1, var2, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.r(var7, var9, var8, var10);
		this.ae(var3, var4, var5, var6);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.cp(LClass92;LClass92;FLClass92;)LClass92;")
	public Class92 cp(Class92 arg0, Class92 arg1, float arg2, Class92 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.ba(II)V")
	public void ba(int arg0, int arg1) {
		int var3 = 0;
		if ((arg0 & 0x1) != 0) {
			OpenGL.glClearColor((float) (arg1 & 0xFF0000) / 1.671168E7F, (float) (arg1 & 0xFF00) / 65280.0F, (float) (arg1 & 0xFF) / 255.0F, (float) (arg1 >>> 24) / 255.0F);
			var3 = 16384;
		}
		if ((arg0 & 0x2) != 0) {
			this.method4962(true);
			var3 |= 0x100;
		}
		if ((arg0 & 0x4) != 0) {
			var3 |= 0x400;
		}
		OpenGL.glClear(var3);
	}

	public Interface11_Impl1 method4957(int arg0, boolean arg1, int[][] arg2) {
		return new Class287_Sub4(this, arg0, arg1, arg2);
	}

	public void method5103(Class249 arg0) {
		float[] var2 = arg0.aFloatArray2631;
		var2[1] = -var2[1];
		var2[5] = -var2[5];
		var2[9] = -var2[9];
		var2[13] = -var2[13];
	}

	public void method4914() {
		if (this.aBoolean8612) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	public void method4891(Class249 arg0, Class249 arg1, Class249 arg2) {
		OpenGL.glMatrixMode(5888);
		this.aClass249_8576.method2484(arg0, arg1);
		OpenGL.glLoadMatrixf(this.aClass249_8576.aFloatArray2631, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(arg2.aFloatArray2631, 0);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.kp(II)LInterface8_Impl1_Impl1;")
	public Interface8_Impl1_Impl1 kp(int arg0, int arg1) {
		return new Class264(this, Class72.aClass72_610, Class86.aClass86_719, arg0, arg1);
	}

	public void method4932() {
		if (this.aBoolean8526) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	public void method4933() {
		OpenGL.glDepthMask(this.aBoolean8519 && this.aBoolean8454);
	}

	public void method4936() {
		if (this.aBoolean8522 && !this.aBoolean8575) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	public void method4937() {
		this.aFloatArray9858[0] = this.aFloat8533 * this.aFloat8530;
		this.aFloatArray9858[1] = this.aFloat8533 * this.aFloat8500;
		this.aFloatArray9858[2] = this.aFloat8533 * this.aFloat8532;
		this.aFloatArray9858[3] = 1.0F;
		OpenGL.glLightModelfv(2899, this.aFloatArray9858, 0);
	}

	public void method4938() {
		this.aFloatArray9858[0] = this.aFloat8489 * this.aFloat8530;
		this.aFloatArray9858[1] = this.aFloat8489 * this.aFloat8500;
		this.aFloatArray9858[2] = this.aFloat8489 * this.aFloat8532;
		this.aFloatArray9858[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, this.aFloatArray9858, 0);
		this.aFloatArray9858[0] = -this.aFloat8535 * this.aFloat8530;
		this.aFloatArray9858[1] = -this.aFloat8535 * this.aFloat8500;
		this.aFloatArray9858[2] = -this.aFloat8535 * this.aFloat8532;
		this.aFloatArray9858[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, this.aFloatArray9858, 0);
	}

	public Interface11_Impl3_Impl1 method4953(Class72 arg0, Class86 arg1, int arg2, int arg3) {
		if (this.aBoolean9867 || Class380.method4393(arg2, -1770953543) && Class380.method4393(arg3, -804954767)) {
			return new Class287_Sub1(this, arg0, arg1, arg2, arg3);
		} else if (this.aBoolean9880) {
			return new Class287_Sub3(this, arg0, arg1, arg2, arg3);
		} else {
			return new Class287_Sub1(this, arg0, arg1, Class136.method1594(arg2, 1978039454), Class136.method1594(arg3, 1916518060));
		}
	}

	public void method4940() {
		if (this.aBoolean8523) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	public void method4939() {
	}

	public void method4981() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass249_8472.aFloatArray2631, 0);
		int var1;
		for (var1 = 0; var1 < this.anInt8538; var1++) {
			Class330_Sub14 var2 = this.aClass330_Sub14Array8607[var1];
			int var3 = var2.method3313(-1620080167);
			int var4 = var1 + 16386;
			float var5 = var2.method3317(-1896832950) / 255.0F;
			this.aFloatArray9858[0] = var2.method3318(1689977080);
			this.aFloatArray9858[1] = var2.method3311((byte) 87);
			this.aFloatArray9858[2] = var2.method3312((short) 23812);
			this.aFloatArray9858[3] = 1.0F;
			OpenGL.glLightfv(var4, 4611, this.aFloatArray9858, 0);
			this.aFloatArray9858[0] = (float) (var3 >> 16 & 0xFF) * var5;
			this.aFloatArray9858[1] = (float) (var3 >> 8 & 0xFF) * var5;
			this.aFloatArray9858[2] = (float) (var3 & 0xFF) * var5;
			this.aFloatArray9858[3] = 1.0F;
			OpenGL.glLightfv(var4, 4609, this.aFloatArray9858, 0);
			OpenGL.glLightf(var4, 4617, 1.0F / (float) (var2.method3316((byte) -26) * var2.method3316((byte) 27)));
			OpenGL.glEnable(var4);
		}
		while (var1 < this.anInt8537) {
			OpenGL.glDisable(var1 + 16386);
			var1++;
		}
	}

	public boolean method5006(Class72 arg0, Class86 arg1) {
		return true;
	}

	public boolean method4996(Class72 arg0, Class86 arg1) {
		return this.aBoolean8598;
	}

	public void method4959() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass249_8472.aFloatArray2631, 0);
		OpenGL.glLightfv(16384, 4611, this.aFloatArray8525, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray8451, 0);
	}

	public Interface11_Impl3 method4950(int arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5) {
		if (this.aBoolean9867 || Class380.method4393(arg0, -1023175086) && Class380.method4393(arg1, -62169526)) {
			return new Class287_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
		} else if (this.aBoolean9880) {
			return new Class287_Sub3(this, arg0, arg1, arg3, arg4, arg5);
		} else {
			Class287_Sub1 var7 = new Class287_Sub1(this, Class72.aClass72_620, Class86.aClass86_714, Class136.method1594(arg0, 2075018079), Class136.method1594(arg1, 1521900395));
			var7.method118(0, 0, arg0, arg1, arg3, arg4, arg5);
			return var7;
		}
	}

	public Interface11_Impl3 method4948(Class72 arg0, int arg1, int arg2, boolean arg3, byte[] arg4, int arg5, int arg6) {
		if (this.aBoolean9867 || Class380.method4393(arg1, -45630524) && Class380.method4393(arg2, -1978414178)) {
			return new Class287_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		} else if (this.aBoolean9880) {
			return new Class287_Sub3(this, arg0, arg1, arg2, arg4, arg5, arg6);
		} else {
			Class287_Sub1 var8 = new Class287_Sub1(this, arg0, Class86.aClass86_714, Class136.method1594(arg1, 1621893774), Class136.method1594(arg2, 1806360288));
			var8.method117(0, 0, arg1, arg2, arg4, arg0, arg5, arg6);
			return var8;
		}
	}

	public Interface11_Impl3 method4949(Class72 arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5, int arg6) {
		if (this.aBoolean9867 || Class380.method4393(arg1, -314339209) && Class380.method4393(arg2, -1538044097)) {
			return new Class287_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		} else if (this.aBoolean9880) {
			return new Class287_Sub3(this, arg0, arg1, arg2, arg4, arg5, arg6);
		} else {
			Class287_Sub1 var8 = new Class287_Sub1(this, arg0, Class86.aClass86_717, Class136.method1594(arg1, 1570863363), Class136.method1594(arg2, 1521347640));
			var8.method2883(0, 0, arg1, arg2, arg4, arg0, arg5, arg6);
			return var8;
		}
	}

	public void method5102(boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	public Class184 method5003(Class193[] arg0) {
		return new Class184_Sub2(arg0);
	}

	public Interface11_Impl2 method4952(Class72 arg0, int arg1, int arg2, int arg3, boolean arg4, byte[] arg5) {
		return new Class287_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public void method5059() {
		int var1 = this.anIntArray9874[this.anInt8543];
		if (var1 != 0) {
			this.anIntArray9874[this.anInt8543] = 0;
			OpenGL.glBindTexture(var1, 0);
			OpenGL.glDisable(var1);
		}
	}

	public void method5076() {
		OpenGL.glMatrixMode(5890);
		if (this.aClass181Array8509[this.anInt8543] == Class181.aClass181_1784) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(this.aClass249Array8545[this.anInt8543].method2514(this.aFloatArray9887), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.eu(Z)V")
	public void eu(boolean arg0) {
	}

	public void method5053() {
		OpenGL.glTexEnvi(8960, 34161, method5142(this.aClass179Array8547[this.anInt8543]));
	}

	public static int method5141(Class72 arg0, Class86 arg1) {
		if (arg1 == Class86.aClass86_714) {
			switch(arg0.anInt619) {
				case 1:
					return 33779;
				case 2:
					return 6406;
				case 3:
					return 6408;
				case 4:
					return 6409;
				case 5:
				case 7:
				default:
					throw new IllegalArgumentException();
				case 6:
					return 6410;
				case 8:
					return 33777;
				case 9:
					return 6407;
			}
		} else if (arg1 == Class86.aClass86_718) {
			switch(arg0.anInt619) {
				case 2:
					return 32830;
				case 3:
					return 32859;
				case 4:
					return 32834;
				case 5:
				case 8:
				default:
					throw new IllegalArgumentException();
				case 6:
					return 36219;
				case 7:
					return 33189;
				case 9:
					return 32852;
			}
		} else if (arg1 == Class86.aClass86_719) {
			switch(arg0.anInt619) {
				case 7:
					return 33190;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class86.aClass86_716) {
			switch(arg0.anInt619) {
				case 2:
					return 34844;
				case 3:
					return 34842;
				case 4:
					return 34846;
				case 5:
				case 7:
				case 8:
				default:
					throw new IllegalArgumentException();
				case 6:
					return 34847;
				case 9:
					return 34843;
			}
		} else if (arg1 == Class86.aClass86_717) {
			switch(arg0.anInt619) {
				case 2:
					return 34838;
				case 3:
					return 34836;
				case 4:
					return 34840;
				case 5:
				case 7:
				case 8:
				default:
					throw new IllegalArgumentException();
				case 6:
					return 34841;
				case 9:
					return 34837;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method5135(boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	public Interface11_Impl3 method4899(int arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5) {
		if (this.aBoolean9867 || Class380.method4393(arg0, 789365925) && Class380.method4393(arg1, -183526405)) {
			return new Class287_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
		} else if (this.aBoolean9880) {
			return new Class287_Sub3(this, arg0, arg1, arg3, arg4, arg5);
		} else {
			Class287_Sub1 var7 = new Class287_Sub1(this, Class72.aClass72_620, Class86.aClass86_714, Class136.method1594(arg0, 1641977151), Class136.method1594(arg1, 1516385880));
			var7.method118(0, 0, arg0, arg1, arg3, arg4, arg5);
			return var7;
		}
	}

	public final void method4967() {
		this.aFloatArray9858[0] = (float) (this.anInt8445 & 0xFF0000) / 1.671168E7F;
		this.aFloatArray9858[1] = (float) (this.anInt8445 & 0xFF00) / 65280.0F;
		this.aFloatArray9858[2] = (float) (this.anInt8445 & 0xFF) / 255.0F;
		this.aFloatArray9858[3] = (float) (this.anInt8445 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, this.aFloatArray9858, 0);
	}

	public static final int method5142(Class179 arg0) {
		if (arg0 == Class179.aClass179_1759) {
			return 7681;
		} else if (arg0 == Class179.aClass179_1757) {
			return 8448;
		} else if (arg0 == Class179.aClass179_1760) {
			return 34165;
		} else if (arg0 == Class179.aClass179_1758) {
			return 260;
		} else if (arg0 == Class179.aClass179_1761) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public static final int method5143(Class175 arg0) {
		if (arg0 == Class175.aClass175_1739) {
			return 5890;
		} else if (arg0 == Class175.aClass175_1740) {
			return 34167;
		} else if (arg0 == Class175.aClass175_1738) {
			return 34168;
		} else if (arg0 == Class175.aClass175_1741) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method4973() {
		if (this.aBoolean8585) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.iu(LClass92;LClass92;FLClass92;)LClass92;")
	public Class92 iu(Class92 arg0, Class92 arg1, float arg2, Class92 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	public void method5112() {
		if (this.aBoolean8546) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	public void method4974() {
		if (this.aBoolean8514 && this.aBoolean8502 && this.anInt8578 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	public final void method5079(int arg0, Class175 arg1, boolean arg2, boolean arg3) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, method5143(arg1));
		if (arg2) {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 769 : 768);
		}
	}

	public final Interface9_Impl2 method4975(boolean arg0) {
		return new Class266_Sub2(this, Class86.aClass86_718, arg0);
	}

	public Class184 method4977(Class193[] arg0) {
		return new Class184_Sub2(arg0);
	}

	public void method5040(int arg0) {
		OpenGL.glColorMask((arg0 & 0x1) != 0, (arg0 & 0x2) != 0, (arg0 & 0x4) != 0, (arg0 & 0x8) != 0);
	}

	public void method4979(Interface9_Impl2 arg0) {
		this.aClass266_Sub2_9886 = (Class266_Sub2) arg0;
		this.aClass266_Sub2_9886.method2647();
	}

	public void method4978(Class184 arg0) {
		Class193[] var2 = arg0.aClass193Array6483;
		int var3 = 0;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		int var7;
		for (var7 = 0; var7 < var2.length; var7++) {
			Class193 var8 = var2[var7];
			Class266_Sub1 var9 = this.aClass266_Sub1Array9872[var7];
			int var10 = 0;
			int var11 = var9.method2648();
			long var12 = var9.method2646();
			var9.method2647();
			for (int var14 = 0; var14 < var8.method2136(); var14++) {
				Class191 var15 = var8.method2134(var14);
				switch(var15.anInt1860) {
					case 0:
						OpenGL.glClientActiveTexture(var3++ + 33984);
						OpenGL.glTexCoordPointer(3, 5126, var11, var12 + (long) var10);
						break;
					case 1:
						OpenGL.glColorPointer(4, 5121, var11, var12 + (long) var10);
						var4 = true;
					case 2:
					case 4:
					default:
						break;
					case 3:
						OpenGL.glClientActiveTexture(var3++ + 33984);
						OpenGL.glTexCoordPointer(2, 5126, var11, var12 + (long) var10);
						break;
					case 5:
						OpenGL.glClientActiveTexture(var3++ + 33984);
						OpenGL.glTexCoordPointer(4, 5126, var11, var12 + (long) var10);
						break;
					case 6:
						OpenGL.glVertexPointer(3, 5126, var11, var12 + (long) var10);
						var6 = true;
						break;
					case 7:
						OpenGL.glClientActiveTexture(var3++ + 33984);
						OpenGL.glTexCoordPointer(1, 5126, var11, var12 + (long) var10);
						break;
					case 8:
						OpenGL.glNormalPointer(5126, var11, var12 + (long) var10);
						var5 = true;
				}
				var10 += var15.anInt1876;
			}
		}
		if (this.aBoolean9868 != var6) {
			if (var6) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean9868 = var6;
		}
		if (this.aBoolean9878 != var5) {
			if (var5) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean9878 = var5;
		}
		if (this.aBoolean9869 != var4) {
			if (var4) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean9869 = var4;
		}
		if (this.anInt9871 < var3) {
			for (var7 = this.anInt9871; var7 < var3; var7++) {
				OpenGL.glClientActiveTexture(var7 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt9871 = var3;
		} else if (this.anInt9871 > var3) {
			for (var7 = var3; var7 < this.anInt9871; var7++) {
				OpenGL.glClientActiveTexture(var7 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt9871 = var3;
		}
	}

	public final void method4898(Class199 arg0, int arg1, int arg2) {
		byte var4;
		int var5;
		if (arg0 == Class199.aClass199_1930) {
			var4 = 1;
			var5 = arg2 * 2;
		} else if (arg0 == Class199.aClass199_1927) {
			var4 = 3;
			var5 = arg2 + 1;
		} else if (arg0 == Class199.aClass199_1926) {
			var4 = 4;
			var5 = arg2 * 3;
		} else if (arg0 == Class199.aClass199_1929) {
			var4 = 6;
			var5 = arg2 + 2;
		} else if (arg0 == Class199.aClass199_1931) {
			var4 = 5;
			var5 = arg2 + 2;
		} else {
			var4 = 0;
			var5 = arg2;
		}
		OpenGL.glDrawArrays(var4, arg1, var5);
	}

	public final void method4985(Interface9_Impl2 arg0, Class199 arg1, int arg2, int arg3, int arg4, int arg5) {
		byte var7;
		int var8;
		if (arg1 == Class199.aClass199_1930) {
			var7 = 1;
			var8 = arg5 * 2;
		} else if (arg1 == Class199.aClass199_1927) {
			var7 = 3;
			var8 = arg5 + 1;
		} else if (arg1 == Class199.aClass199_1926) {
			var7 = 4;
			var8 = arg5 * 3;
		} else if (arg1 == Class199.aClass199_1929) {
			var7 = 6;
			var8 = arg5 + 2;
		} else if (arg1 == Class199.aClass199_1931) {
			var7 = 5;
			var8 = arg5 + 2;
		} else {
			var7 = 0;
			var8 = arg5;
		}
		Class86 var9 = arg0.method157();
		Class266_Sub2 var10 = (Class266_Sub2) arg0;
		var10.method2647();
		OpenGL.glDrawElements(var7, var8, method5147(var9), var10.method2646() + (long) (arg4 * var9.anInt724));
	}

	public void method4926(Class184 arg0) {
		Class193[] var2 = arg0.aClass193Array6483;
		int var3 = 0;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		int var7;
		for (var7 = 0; var7 < var2.length; var7++) {
			Class193 var8 = var2[var7];
			Class266_Sub1 var9 = this.aClass266_Sub1Array9872[var7];
			int var10 = 0;
			int var11 = var9.method2648();
			long var12 = var9.method2646();
			var9.method2647();
			for (int var14 = 0; var14 < var8.method2136(); var14++) {
				Class191 var15 = var8.method2134(var14);
				switch(var15.anInt1860) {
					case 0:
						OpenGL.glClientActiveTexture(var3++ + 33984);
						OpenGL.glTexCoordPointer(3, 5126, var11, var12 + (long) var10);
						break;
					case 1:
						OpenGL.glColorPointer(4, 5121, var11, var12 + (long) var10);
						var4 = true;
					case 2:
					case 4:
					default:
						break;
					case 3:
						OpenGL.glClientActiveTexture(var3++ + 33984);
						OpenGL.glTexCoordPointer(2, 5126, var11, var12 + (long) var10);
						break;
					case 5:
						OpenGL.glClientActiveTexture(var3++ + 33984);
						OpenGL.glTexCoordPointer(4, 5126, var11, var12 + (long) var10);
						break;
					case 6:
						OpenGL.glVertexPointer(3, 5126, var11, var12 + (long) var10);
						var6 = true;
						break;
					case 7:
						OpenGL.glClientActiveTexture(var3++ + 33984);
						OpenGL.glTexCoordPointer(1, 5126, var11, var12 + (long) var10);
						break;
					case 8:
						OpenGL.glNormalPointer(5126, var11, var12 + (long) var10);
						var5 = true;
				}
				var10 += var15.anInt1876;
			}
		}
		if (this.aBoolean9868 != var6) {
			if (var6) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean9868 = var6;
		}
		if (this.aBoolean9878 != var5) {
			if (var5) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean9878 = var5;
		}
		if (this.aBoolean9869 != var4) {
			if (var4) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean9869 = var4;
		}
		if (this.anInt9871 < var3) {
			for (var7 = this.anInt9871; var7 < var3; var7++) {
				OpenGL.glClientActiveTexture(var7 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt9871 = var3;
		} else if (this.anInt9871 > var3) {
			for (var7 = var3; var7 < this.anInt9871; var7++) {
				OpenGL.glClientActiveTexture(var7 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt9871 = var3;
		}
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.g(I)V")
	public final synchronized void g(int arg0) {
		int var2 = 0;
		int var4 = arg0 & Integer.MAX_VALUE;
		Class330_Sub23 var3;
		while (!this.aClass471_9860.method5876(37268610)) {
			var3 = (Class330_Sub23) this.aClass471_9860.method5867((short) 8960);
			this.anIntArray9882[var2++] = (int) var3.aLong3341;
			this.anInt8466 -= var3.anInt7693;
			if (var2 == 1000) {
				OpenGL.glDeleteBuffersARB(var2, this.anIntArray9882, 0);
				var2 = 0;
			}
		}
		if (var2 > 0) {
			OpenGL.glDeleteBuffersARB(var2, this.anIntArray9882, 0);
			var2 = 0;
		}
		while (!this.aClass471_9861.method5876(1086542814)) {
			var3 = (Class330_Sub23) this.aClass471_9861.method5867((short) 8960);
			this.anIntArray9882[var2++] = (int) var3.aLong3341;
			this.anInt8465 -= var3.anInt7693;
			if (var2 == 1000) {
				OpenGL.glDeleteTextures(var2, this.anIntArray9882, 0);
				var2 = 0;
			}
		}
		if (var2 > 0) {
			OpenGL.glDeleteTextures(var2, this.anIntArray9882, 0);
			var2 = 0;
		}
		while (!this.aClass471_9862.method5876(-1892107307)) {
			var3 = (Class330_Sub23) this.aClass471_9862.method5867((short) 8960);
			this.anIntArray9882[var2++] = var3.anInt7693;
			if (var2 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(var2, this.anIntArray9882, 0);
				var2 = 0;
			}
		}
		if (var2 > 0) {
			OpenGL.glDeleteFramebuffersEXT(var2, this.anIntArray9882, 0);
			var2 = 0;
		}
		while (!this.aClass471_9863.method5876(636937035)) {
			var3 = (Class330_Sub23) this.aClass471_9863.method5867((short) 8960);
			this.anIntArray9882[var2++] = (int) var3.aLong3341;
			this.anInt8480 -= var3.anInt7693;
			if (var2 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(var2, this.anIntArray9882, 0);
				var2 = 0;
			}
		}
		if (var2 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(var2, this.anIntArray9882, 0);
			boolean var5 = false;
		}
		while (!this.aClass471_9870.method5876(-1132499480)) {
			var3 = (Class330_Sub23) this.aClass471_9870.method5867((short) 8960);
			OpenGL.glDeleteLists((int) var3.aLong3341, var3.anInt7693);
		}
		Class330 var6;
		while (!this.aClass471_9864.method5876(29904755)) {
			var6 = this.aClass471_9864.method5867((short) 8960);
			OpenGL.glDeleteProgram((int) var6.aLong3341);
		}
		while (!this.aClass471_9865.method5876(-1729174058)) {
			var6 = this.aClass471_9865.method5867((short) 8960);
			OpenGL.glDeleteShader((int) var6.aLong3341);
		}
		while (!this.aClass471_9870.method5876(-223661267)) {
			var3 = (Class330_Sub23) this.aClass471_9870.method5867((short) 8960);
			OpenGL.glDeleteLists((int) var3.aLong3341, var3.anInt7693);
		}
		if (this.za() > 100663296 && Class312.method3111((byte) 107) > this.aLong9866 + 60000L) {
			System.gc();
			this.aLong9866 = Class312.method3111((byte) 91);
		}
		super.g(var4);
	}

	public void method4941(Class249 arg0, Class249 arg1, Class249 arg2) {
		OpenGL.glMatrixMode(5888);
		this.aClass249_8576.method2484(arg0, arg1);
		OpenGL.glLoadMatrixf(this.aClass249_8576.aFloatArray2631, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(arg2.aFloatArray2631, 0);
	}

	public final Interface9_Impl2 method5130(boolean arg0) {
		return new Class266_Sub2(this, Class86.aClass86_718, arg0);
	}

	public final synchronized void method5144(int arg0) {
		Class330_Sub23 var2 = new Class330_Sub23(arg0);
		this.aClass471_9862.method5878(var2, (short) 8192);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.dx()V")
	public void dx() {
		OpenGL.glFinish();
	}

	public final synchronized void method5145(long arg0) {
		Class330 var3 = new Class330();
		var3.aLong3341 = arg0;
		this.aClass471_9865.method5878(var3, (short) 8192);
	}

	public final synchronized void method5146(int arg0) {
		Class330 var2 = new Class330();
		var2.aLong3341 = arg0;
		this.aClass471_9864.method5878(var2, (short) 8192);
	}

	public static final int method5147(Class86 arg0) {
		switch(arg0.anInt722) {
			case 0:
				return 5122;
			case 1:
				return 5121;
			case 2:
			default:
				return 5121;
			case 3:
				return 5125;
			case 4:
				return 5124;
			case 5:
				return 5126;
			case 6:
				return 5123;
			case 7:
				return 5120;
			case 8:
				return 5131;
		}
	}

	public void method5035() {
		if (this.aBoolean8585) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	public void method4947(int arg0) {
		if (!this.aBoolean9885) {
			OpenGL.glPolygonMode(1028, (arg0 & 0x2) == 0 ? 6914 : 6913);
		}
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.dh(Z)V")
	public void dh(boolean arg0) {
	}

	public void method5110(Interface9_Impl2 arg0) {
		this.aClass266_Sub2_9886 = (Class266_Sub2) arg0;
		this.aClass266_Sub2_9886.method2647();
	}

	public boolean method5057(Class72 arg0, Class86 arg1) {
		return true;
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.dq()LClass51;")
	public Class51 dq() {
		int var1 = -1;
		if (this.aString9876.indexOf("nvidia") != -1) {
			var1 = 4318;
		} else if (this.aString9876.indexOf("intel") != -1) {
			var1 = 32902;
		} else if (this.aString9876.indexOf("ati") != -1) {
			var1 = 4098;
		}
		return new Class51(var1, "OpenGL", this.anInt9859, this.aString9877, 0L);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.dv(II)V")
	public void dv(int arg0, int arg1) throws Exception_Sub1 {
		this.aClass76_Sub1_4234.method874();
		if (this.anInterface_ma4227 != null) {
			this.anInterface_ma4227.method224((short) -66);
		}
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.dc(II)V")
	public void dc(int arg0, int arg1) throws Exception_Sub1 {
		this.aClass76_Sub1_4234.method874();
		if (this.anInterface_ma4227 != null) {
			this.anInterface_ma4227.method224((short) 29545);
		}
	}

	public void method5046() {
		this.aFloatArray9858[0] = this.aFloat8533 * this.aFloat8530;
		this.aFloatArray9858[1] = this.aFloat8533 * this.aFloat8500;
		this.aFloatArray9858[2] = this.aFloat8533 * this.aFloat8532;
		this.aFloatArray9858[3] = 1.0F;
		OpenGL.glLightModelfv(2899, this.aFloatArray9858, 0);
	}

	public Interface11_Impl2 method5070(Class72 arg0, int arg1, int arg2, int arg3, boolean arg4, byte[] arg5) {
		return new Class287_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.dm(II)V")
	public void dm(int arg0, int arg1) throws Exception_Sub1 {
		this.aClass76_Sub1_4234.method874();
		if (this.anInterface_ma4227 != null) {
			this.anInterface_ma4227.method224((short) 4341);
		}
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.du()V")
	public void du() {
		OpenGL.glFinish();
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.df()V")
	public void df() {
		OpenGL.glFinish();
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.dy()V")
	public void dy() {
		OpenGL.glFinish();
	}

	public Class184 method4931(Class193[] arg0) {
		return new Class184_Sub2(arg0);
	}

	public Class105 method4888(String arg0) {
		byte[] var2 = this.method5148(arg0);
		if (var2 == null) {
			return null;
		} else {
			Class113 var3 = this.method4890(var2);
			return new Class105_Sub2(this, var3);
		}
	}

	public Interface11_Impl3 method4904(Class72 arg0, Class86 arg1, int arg2, int arg3) {
		return this.method4953(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.dn()V")
	public void dn() {
		super.u();
		if (this.anOpenGL9881 != null) {
			this.anOpenGL9881.i();
			this.anOpenGL9881.release();
			this.anOpenGL9881 = null;
		}
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.di()V")
	public void di() {
		super.u();
		if (this.anOpenGL9881 != null) {
			this.anOpenGL9881.i();
			this.anOpenGL9881.release();
			this.anOpenGL9881 = null;
		}
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.dk(I)V")
	public final synchronized void dk(int arg0) {
		int var2 = 0;
		int var4 = arg0 & Integer.MAX_VALUE;
		Class330_Sub23 var3;
		while (!this.aClass471_9860.method5876(1111976838)) {
			var3 = (Class330_Sub23) this.aClass471_9860.method5867((short) 8960);
			this.anIntArray9882[var2++] = (int) (var3.aLong3341 * -1420004262915178823L * -6154793640677333111L);
			this.anInt8466 -= var3.anInt7693 * -457940705 * 393599711;
			if (var2 == 1000) {
				OpenGL.glDeleteBuffersARB(var2, this.anIntArray9882, 0);
				var2 = 0;
			}
		}
		if (var2 > 0) {
			OpenGL.glDeleteBuffersARB(var2, this.anIntArray9882, 0);
			var2 = 0;
		}
		while (!this.aClass471_9861.method5876(-1046701393)) {
			var3 = (Class330_Sub23) this.aClass471_9861.method5867((short) 8960);
			this.anIntArray9882[var2++] = (int) (var3.aLong3341 * -1420004262915178823L * -6154793640677333111L);
			this.anInt8465 -= var3.anInt7693 * -457940705 * 393599711;
			if (var2 == 1000) {
				OpenGL.glDeleteTextures(var2, this.anIntArray9882, 0);
				var2 = 0;
			}
		}
		if (var2 > 0) {
			OpenGL.glDeleteTextures(var2, this.anIntArray9882, 0);
			var2 = 0;
		}
		while (!this.aClass471_9862.method5876(-219964446)) {
			var3 = (Class330_Sub23) this.aClass471_9862.method5867((short) 8960);
			this.anIntArray9882[var2++] = var3.anInt7693 * -457940705 * 393599711;
			if (var2 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(var2, this.anIntArray9882, 0);
				var2 = 0;
			}
		}
		if (var2 > 0) {
			OpenGL.glDeleteFramebuffersEXT(var2, this.anIntArray9882, 0);
			var2 = 0;
		}
		while (!this.aClass471_9863.method5876(841540192)) {
			var3 = (Class330_Sub23) this.aClass471_9863.method5867((short) 8960);
			this.anIntArray9882[var2++] = (int) (var3.aLong3341 * -1420004262915178823L * -6154793640677333111L);
			this.anInt8480 -= var3.anInt7693 * -457940705 * 393599711;
			if (var2 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(var2, this.anIntArray9882, 0);
				var2 = 0;
			}
		}
		if (var2 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(var2, this.anIntArray9882, 0);
			boolean var5 = false;
		}
		while (!this.aClass471_9870.method5876(-1631488153)) {
			var3 = (Class330_Sub23) this.aClass471_9870.method5867((short) 8960);
			OpenGL.glDeleteLists((int) (var3.aLong3341 * -1420004262915178823L * -6154793640677333111L), var3.anInt7693 * -457940705 * 393599711);
		}
		Class330 var6;
		while (!this.aClass471_9864.method5876(-875624737)) {
			var6 = this.aClass471_9864.method5867((short) 8960);
			OpenGL.glDeleteProgram((int) (var6.aLong3341 * -1420004262915178823L * -6154793640677333111L));
		}
		while (!this.aClass471_9865.method5876(1265620823)) {
			var6 = this.aClass471_9865.method5867((short) 8960);
			OpenGL.glDeleteShader((int) (var6.aLong3341 * -1420004262915178823L * -6154793640677333111L));
		}
		while (!this.aClass471_9870.method5876(-1669605966)) {
			var3 = (Class330_Sub23) this.aClass471_9870.method5867((short) 8960);
			OpenGL.glDeleteLists((int) (var3.aLong3341 * -1420004262915178823L * -6154793640677333111L), var3.anInt7693 * -457940705 * 393599711);
		}
		if (this.za() > 100663296 && Class312.method3111((byte) 69) > this.aLong9866 + 60000L) {
			System.gc();
			this.aLong9866 = Class312.method3111((byte) 22);
		}
		super.g(var4);
	}

	public void method5090() {
		OpenGL.glActiveTexture(this.anInt8543 + 33984);
	}

	public void method4988() {
		OpenGL.glActiveTexture(this.anInt8543 + 33984);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.ef(Z)V")
	public void ef(boolean arg0) {
	}

	public final void method5104(Class199 arg0, int arg1, int arg2) {
		byte var4;
		int var5;
		if (arg0 == Class199.aClass199_1930) {
			var4 = 1;
			var5 = arg2 * 2;
		} else if (arg0 == Class199.aClass199_1927) {
			var4 = 3;
			var5 = arg2 + 1;
		} else if (arg0 == Class199.aClass199_1926) {
			var4 = 4;
			var5 = arg2 * 3;
		} else if (arg0 == Class199.aClass199_1929) {
			var4 = 6;
			var5 = arg2 + 2;
		} else if (arg0 == Class199.aClass199_1931) {
			var4 = 5;
			var5 = arg2 + 2;
		} else {
			var4 = 0;
			var5 = arg2;
		}
		OpenGL.glDrawArrays(var4, arg1, var5);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.es(Ljava/awt/Canvas;II)LClass76_Sub1;")
	public Class76_Sub1 es(Canvas arg0, int arg1, int arg2) {
		return new Class76_Sub1_Sub2_Sub2(this, arg0);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.fu(Ljava/awt/Canvas;II)LClass76_Sub1;")
	public Class76_Sub1 fu(Canvas arg0, int arg1, int arg2) {
		return new Class76_Sub1_Sub2_Sub2(this, arg0);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.ft(Ljava/awt/Canvas;II)LClass76_Sub1;")
	public Class76_Sub1 ft(Canvas arg0, int arg1, int arg2) {
		return new Class76_Sub1_Sub2_Sub2(this, arg0);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.fm(IIII)[I")
	public int[] fm(int arg0, int arg1, int arg2, int arg3) {
		int[] var5 = new int[arg2 * arg3];
		int var6 = this.aClass76_4228.method857();
		for (int var7 = 0; var7 < arg3; var7++) {
			OpenGL.glReadPixelsi(arg0, var6 - arg1 - var7 - 1, arg2, 1, 32993, this.anInt9884 * -1466767273 * 33639, var5, var7 * arg2);
		}
		return var5;
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.fr()V")
	public void fr() {
		if (this.aClass76_4228 == null) {
			return;
		}
		int var1 = this.aClass76_4228.method856();
		int var2 = this.aClass76_4228.method857();
		if (var1 <= 0 && var2 <= 0) {
			return;
		}
		int var3 = this.anInt8531;
		int var4 = this.anInt8567;
		int var5 = this.anInt8515;
		int var6 = this.anInt8516;
		this.au();
		int var7 = this.anInt8610;
		int var8 = this.anInt8447;
		int var9 = this.anInt8521;
		int var10 = this.anInt8506;
		this.L();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method4924();
		this.method4882(false);
		this.method4995(false);
		this.method5005(false);
		this.method4962(false);
		this.method4956(null);
		this.method4889(1);
		this.method4970(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, var1, var2, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.r(var7, var9, var8, var10);
		this.ae(var3, var4, var5, var6);
	}

	public final void method4927(int arg0, Class175 arg1, boolean arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, method5143(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, arg2 ? 771 : 770);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.fn(II)V")
	public void fn(int arg0, int arg1) {
		int var3 = 0;
		if ((arg0 & 0x1) != 0) {
			OpenGL.glClearColor((float) (arg1 & 0xFF0000) / 1.671168E7F, (float) (arg1 & 0xFF00) / 65280.0F, (float) (arg1 & 0xFF) / 255.0F, (float) (arg1 >>> 24) / 255.0F);
			var3 = 16384;
		}
		if ((arg0 & 0x2) != 0) {
			this.method4962(true);
			var3 |= 0x100;
		}
		if ((arg0 & 0x4) != 0) {
			var3 |= 0x400;
		}
		OpenGL.glClear(var3);
	}

	public byte[] method5148(String arg0) {
		return this.method4942("gl", arg0);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.in(LClass92;LClass92;FLClass92;)LClass92;")
	public Class92 in(Class92 arg0, Class92 arg1, float arg2, Class92 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.jw()LClass76_Sub2;")
	public Class76_Sub2 jw() {
		return new Class76_Sub2_Sub3_Sub2(this);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.jy()LClass76_Sub2;")
	public Class76_Sub2 jy() {
		return new Class76_Sub2_Sub3_Sub2(this);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.jp()LClass76_Sub2;")
	public Class76_Sub2 jp() {
		return new Class76_Sub2_Sub3_Sub2(this);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.jk()LClass76_Sub2;")
	public Class76_Sub2 jk() {
		return new Class76_Sub2_Sub3_Sub2(this);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.ak(Ljava/awt/Canvas;II)LClass76_Sub1;")
	public Class76_Sub1 ak(Canvas arg0, int arg1, int arg2) {
		return new Class76_Sub1_Sub2_Sub2(this, arg0);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.jx(IILClass72;LClass86;I)LInterface8_Impl1_Impl2;")
	public Interface8_Impl1_Impl2 jx(int arg0, int arg1, Class72 arg2, Class86 arg3, int arg4) {
		return new Class264(this, arg2, arg3, arg0, arg1, arg4);
	}

	public void method4900() {
		this.aFloat8581 = this.aFloat8504 - (float) this.anInt8560;
		this.aFloat8580 = this.aFloat8581 - (float) this.anInt8578;
		if (this.aFloat8580 < this.aFloat8471) {
			this.aFloat8580 = this.aFloat8471;
		}
		if (!this.aBoolean8601) {
			return;
		}
		OpenGL.glFogf(2915, this.aFloat8580);
		OpenGL.glFogf(2916, this.aFloat8581);
		this.aFloatArray9858[0] = (float) (this.anInt8476 & 0xFF0000) / 1.671168E7F;
		this.aFloatArray9858[1] = (float) (this.anInt8476 & 0xFF00) / 65280.0F;
		this.aFloatArray9858[2] = (float) (this.anInt8476 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, this.aFloatArray9858, 0);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.kh(III)LInterface8_Impl1_Impl1;")
	public Interface8_Impl1_Impl1 kh(int arg0, int arg1, int arg2) {
		return new Class264(this, Class72.aClass72_610, Class86.aClass86_719, arg0, arg1, arg2);
	}

	public Interface11_Impl1 method4951(int arg0, boolean arg1, int[][] arg2) {
		return new Class287_Sub4(this, arg0, arg1, arg2);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.kv(III)LInterface8_Impl1_Impl1;")
	public Interface8_Impl1_Impl1 kv(int arg0, int arg1, int arg2) {
		return new Class264(this, Class72.aClass72_610, Class86.aClass86_719, arg0, arg1, arg2);
	}

	public boolean method5021() {
		return this.aBoolean9873;
	}

	public void method5092() {
		OpenGL.glTexEnvi(8960, 34161, method5142(this.aClass179Array8547[this.anInt8543]));
	}

	public boolean method5023() {
		return this.aBoolean9883;
	}

	public Class105 method5024(String arg0) {
		byte[] var2 = this.method5148(arg0);
		if (var2 == null) {
			return null;
		} else {
			Class113 var3 = this.method4890(var2);
			return new Class105_Sub2(this, var3);
		}
	}

	public Class105 method4928(String arg0) {
		byte[] var2 = this.method5148(arg0);
		if (var2 == null) {
			return null;
		} else {
			Class113 var3 = this.method4890(var2);
			return new Class105_Sub2(this, var3);
		}
	}

	public Class105 method5037(String arg0) {
		byte[] var2 = this.method5148(arg0);
		if (var2 == null) {
			return null;
		} else {
			Class113 var3 = this.method4890(var2);
			return new Class105_Sub2(this, var3);
		}
	}

	public Class105 method4923(String arg0) {
		byte[] var2 = this.method5148(arg0);
		if (var2 == null) {
			return null;
		} else {
			Class113 var3 = this.method4890(var2);
			return new Class105_Sub2(this, var3);
		}
	}

	public void method5149() {
		OpenGL.glDepthFunc(515);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		for (int var1 = this.anInt8592 - 1; var1 >= 0; var1--) {
			OpenGL.glActiveTexture(var1 + 33984);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		float[] var4 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (int var2 = 0; var2 < 8; var2++) {
			int var3 = var2 + 16384;
			OpenGL.glLightfv(var3, 4608, var4, 0);
			OpenGL.glLightf(var3, 4615, 0.0F);
			OpenGL.glLightf(var3, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL9881.setSwapInterval(0);
		super.method4895();
	}

	public void method5150() {
		OpenGL.glDepthFunc(515);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		for (int var1 = this.anInt8592 - 1; var1 >= 0; var1--) {
			OpenGL.glActiveTexture(var1 + 33984);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		float[] var4 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (int var2 = 0; var2 < 8; var2++) {
			int var3 = var2 + 16384;
			OpenGL.glLightfv(var3, 4608, var4, 0);
			OpenGL.glLightf(var3, 4615, 0.0F);
			OpenGL.glLightf(var3, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL9881.setSwapInterval(0);
		super.method4895();
	}

	public void method5151() {
		OpenGL.glDepthFunc(515);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		for (int var1 = this.anInt8592 - 1; var1 >= 0; var1--) {
			OpenGL.glActiveTexture(var1 + 33984);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		float[] var4 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (int var2 = 0; var2 < 8; var2++) {
			int var3 = var2 + 16384;
			OpenGL.glLightfv(var3, 4608, var4, 0);
			OpenGL.glLightf(var3, 4615, 0.0F);
			OpenGL.glLightf(var3, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL9881.setSwapInterval(0);
		super.method4895();
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.jv()LClass76_Sub2;")
	public Class76_Sub2 jv() {
		return new Class76_Sub2_Sub3_Sub2(this);
	}

	public float method4887() {
		return 0.0F;
	}

	public float method5031() {
		return 0.0F;
	}

	public void method5100() {
		if (this.aBoolean8514 && this.aBoolean8502 && this.anInt8578 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	public void method4960() {
		if (this.aClass76_4228 == null) {
			return;
		}
		int var1 = this.anInt8517 + this.anInt8610;
		int var2 = this.anInt8518 + this.aClass76_4228.method857() - this.anInt8506;
		int var3 = this.anInt8447 - this.anInt8610;
		int var4 = this.anInt8506 - this.anInt8521;
		if (var3 < 0) {
			var3 = 0;
		}
		if (var4 < 0) {
			var4 = 0;
		}
		OpenGL.glScissor(var1, var2, var3, var4);
	}

	public void method5084() {
		if (this.aBoolean8612) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	public void method5010() {
		if (this.aBoolean8612) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	public void method5041() {
		if (this.aBoolean8526) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	public void method5106(int arg0, Interface9_Impl1 arg1) {
		this.aClass266_Sub1Array9872[arg0] = (Class266_Sub1) arg1;
	}

	public void method5043() {
		OpenGL.glDepthMask(this.aBoolean8519 && this.aBoolean8454);
	}

	public void method4934() {
		if (this.aBoolean8522 && !this.aBoolean8575) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	public void method5129() {
		if (this.aBoolean8585) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	public void method5044() {
		if (this.aBoolean8522 && !this.aBoolean8575) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	public void method5045() {
		this.aFloatArray9858[0] = this.aFloat8533 * this.aFloat8530;
		this.aFloatArray9858[1] = this.aFloat8533 * this.aFloat8500;
		this.aFloatArray9858[2] = this.aFloat8533 * this.aFloat8532;
		this.aFloatArray9858[3] = 1.0F;
		OpenGL.glLightModelfv(2899, this.aFloatArray9858, 0);
	}

	public static int method5152(Class72 arg0) {
		switch(arg0.anInt619) {
			case 2:
				return 6406;
			case 3:
				return 6408;
			case 4:
				return 6409;
			case 5:
			case 8:
			default:
				throw new IllegalStateException();
			case 6:
				return 6410;
			case 7:
				return 6402;
			case 9:
				return 6407;
		}
	}

	public void method5047() {
		this.aFloatArray9858[0] = this.aFloat8489 * this.aFloat8530;
		this.aFloatArray9858[1] = this.aFloat8489 * this.aFloat8500;
		this.aFloatArray9858[2] = this.aFloat8489 * this.aFloat8532;
		this.aFloatArray9858[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, this.aFloatArray9858, 0);
		this.aFloatArray9858[0] = -this.aFloat8535 * this.aFloat8530;
		this.aFloatArray9858[1] = -this.aFloat8535 * this.aFloat8500;
		this.aFloatArray9858[2] = -this.aFloat8535 * this.aFloat8532;
		this.aFloatArray9858[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, this.aFloatArray9858, 0);
	}

	public void method5028() {
		this.aFloatArray9858[0] = this.aFloat8489 * this.aFloat8530;
		this.aFloatArray9858[1] = this.aFloat8489 * this.aFloat8500;
		this.aFloatArray9858[2] = this.aFloat8489 * this.aFloat8532;
		this.aFloatArray9858[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, this.aFloatArray9858, 0);
		this.aFloatArray9858[0] = -this.aFloat8535 * this.aFloat8530;
		this.aFloatArray9858[1] = -this.aFloat8535 * this.aFloat8500;
		this.aFloatArray9858[2] = -this.aFloat8535 * this.aFloat8532;
		this.aFloatArray9858[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, this.aFloatArray9858, 0);
	}

	public void method5030() {
		this.aFloatArray9858[0] = this.aFloat8489 * this.aFloat8530;
		this.aFloatArray9858[1] = this.aFloat8489 * this.aFloat8500;
		this.aFloatArray9858[2] = this.aFloat8489 * this.aFloat8532;
		this.aFloatArray9858[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, this.aFloatArray9858, 0);
		this.aFloatArray9858[0] = -this.aFloat8535 * this.aFloat8530;
		this.aFloatArray9858[1] = -this.aFloat8535 * this.aFloat8500;
		this.aFloatArray9858[2] = -this.aFloat8535 * this.aFloat8532;
		this.aFloatArray9858[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, this.aFloatArray9858, 0);
	}

	public void method5094(int arg0) {
		OpenGL.glColorMask((arg0 & 0x1) != 0, (arg0 & 0x2) != 0, (arg0 & 0x4) != 0, (arg0 & 0x8) != 0);
	}

	public void method5029() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass249_8472.aFloatArray2631, 0);
		OpenGL.glLightfv(16384, 4611, this.aFloatArray8525, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray8451, 0);
	}

	public void method5120() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass249_8472.aFloatArray2631, 0);
		OpenGL.glLightfv(16384, 4611, this.aFloatArray8525, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray8451, 0);
	}

	public void method5075() {
		this.aFloatArray9858[0] = this.aFloat8533 * this.aFloat8530;
		this.aFloatArray9858[1] = this.aFloat8533 * this.aFloat8500;
		this.aFloatArray9858[2] = this.aFloat8533 * this.aFloat8532;
		this.aFloatArray9858[3] = 1.0F;
		OpenGL.glLightModelfv(2899, this.aFloatArray9858, 0);
	}

	public void method5050() {
	}

	public void method5000() {
	}

	public void method5052() {
	}

	public void method5054() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass249_8472.aFloatArray2631, 0);
		int var1;
		for (var1 = 0; var1 < this.anInt8538; var1++) {
			Class330_Sub14 var2 = this.aClass330_Sub14Array8607[var1];
			int var3 = var2.method3313(-475485492);
			int var4 = var1 + 16386;
			float var5 = var2.method3317(1919382823) / 255.0F;
			this.aFloatArray9858[0] = var2.method3318(644464650);
			this.aFloatArray9858[1] = var2.method3311((byte) -68);
			this.aFloatArray9858[2] = var2.method3312((short) -21260);
			this.aFloatArray9858[3] = 1.0F;
			OpenGL.glLightfv(var4, 4611, this.aFloatArray9858, 0);
			this.aFloatArray9858[0] = (float) (var3 >> 16 & 0xFF) * var5;
			this.aFloatArray9858[1] = (float) (var3 >> 8 & 0xFF) * var5;
			this.aFloatArray9858[2] = (float) (var3 & 0xFF) * var5;
			this.aFloatArray9858[3] = 1.0F;
			OpenGL.glLightfv(var4, 4609, this.aFloatArray9858, 0);
			OpenGL.glLightf(var4, 4617, 1.0F / (float) (var2.method3316((byte) 5) * var2.method3316((byte) 119)));
			OpenGL.glEnable(var4);
		}
		while (var1 < this.anInt8537) {
			OpenGL.glDisable(var1 + 16386);
			var1++;
		}
	}

	public void method5055() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass249_8472.aFloatArray2631, 0);
		int var1;
		for (var1 = 0; var1 < this.anInt8538; var1++) {
			Class330_Sub14 var2 = this.aClass330_Sub14Array8607[var1];
			int var3 = var2.method3313(-1778455672);
			int var4 = var1 + 16386;
			float var5 = var2.method3317(953191646) / 255.0F;
			this.aFloatArray9858[0] = var2.method3318(-1158904577);
			this.aFloatArray9858[1] = var2.method3311((byte) 50);
			this.aFloatArray9858[2] = var2.method3312((short) 15252);
			this.aFloatArray9858[3] = 1.0F;
			OpenGL.glLightfv(var4, 4611, this.aFloatArray9858, 0);
			this.aFloatArray9858[0] = (float) (var3 >> 16 & 0xFF) * var5;
			this.aFloatArray9858[1] = (float) (var3 >> 8 & 0xFF) * var5;
			this.aFloatArray9858[2] = (float) (var3 & 0xFF) * var5;
			this.aFloatArray9858[3] = 1.0F;
			OpenGL.glLightfv(var4, 4609, this.aFloatArray9858, 0);
			OpenGL.glLightf(var4, 4617, 1.0F / (float) (var2.method3316((byte) 79) * var2.method3316((byte) -63)));
			OpenGL.glEnable(var4);
		}
		while (var1 < this.anInt8537) {
			OpenGL.glDisable(var1 + 16386);
			var1++;
		}
	}

	public boolean method5056(Class72 arg0, Class86 arg1) {
		return true;
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.dw(I)V")
	public final synchronized void dw(int arg0) {
		int var2 = 0;
		int var4 = arg0 & Integer.MAX_VALUE;
		Class330_Sub23 var3;
		while (!this.aClass471_9860.method5876(-102906035)) {
			var3 = (Class330_Sub23) this.aClass471_9860.method5867((short) 8960);
			this.anIntArray9882[var2++] = (int) (var3.aLong3341 * -1420004262915178823L * -6154793640677333111L);
			this.anInt8466 -= var3.anInt7693 * -457940705 * 393599711;
			if (var2 == 1000) {
				OpenGL.glDeleteBuffersARB(var2, this.anIntArray9882, 0);
				var2 = 0;
			}
		}
		if (var2 > 0) {
			OpenGL.glDeleteBuffersARB(var2, this.anIntArray9882, 0);
			var2 = 0;
		}
		while (!this.aClass471_9861.method5876(-406315395)) {
			var3 = (Class330_Sub23) this.aClass471_9861.method5867((short) 8960);
			this.anIntArray9882[var2++] = (int) (var3.aLong3341 * -1420004262915178823L * -6154793640677333111L);
			this.anInt8465 -= var3.anInt7693 * -457940705 * 393599711;
			if (var2 == 1000) {
				OpenGL.glDeleteTextures(var2, this.anIntArray9882, 0);
				var2 = 0;
			}
		}
		if (var2 > 0) {
			OpenGL.glDeleteTextures(var2, this.anIntArray9882, 0);
			var2 = 0;
		}
		while (!this.aClass471_9862.method5876(518166947)) {
			var3 = (Class330_Sub23) this.aClass471_9862.method5867((short) 8960);
			this.anIntArray9882[var2++] = var3.anInt7693 * -457940705 * 393599711;
			if (var2 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(var2, this.anIntArray9882, 0);
				var2 = 0;
			}
		}
		if (var2 > 0) {
			OpenGL.glDeleteFramebuffersEXT(var2, this.anIntArray9882, 0);
			var2 = 0;
		}
		while (!this.aClass471_9863.method5876(-1725147006)) {
			var3 = (Class330_Sub23) this.aClass471_9863.method5867((short) 8960);
			this.anIntArray9882[var2++] = (int) (var3.aLong3341 * -1420004262915178823L * -6154793640677333111L);
			this.anInt8480 -= var3.anInt7693 * -457940705 * 393599711;
			if (var2 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(var2, this.anIntArray9882, 0);
				var2 = 0;
			}
		}
		if (var2 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(var2, this.anIntArray9882, 0);
			boolean var5 = false;
		}
		while (!this.aClass471_9870.method5876(-475333014)) {
			var3 = (Class330_Sub23) this.aClass471_9870.method5867((short) 8960);
			OpenGL.glDeleteLists((int) (var3.aLong3341 * -1420004262915178823L * -6154793640677333111L), var3.anInt7693 * -457940705 * 393599711);
		}
		Class330 var6;
		while (!this.aClass471_9864.method5876(-990317992)) {
			var6 = this.aClass471_9864.method5867((short) 8960);
			OpenGL.glDeleteProgram((int) (var6.aLong3341 * -1420004262915178823L * -6154793640677333111L));
		}
		while (!this.aClass471_9865.method5876(-1454184216)) {
			var6 = this.aClass471_9865.method5867((short) 8960);
			OpenGL.glDeleteShader((int) (var6.aLong3341 * -1420004262915178823L * -6154793640677333111L));
		}
		while (!this.aClass471_9870.method5876(549894719)) {
			var3 = (Class330_Sub23) this.aClass471_9870.method5867((short) 8960);
			OpenGL.glDeleteLists((int) (var3.aLong3341 * -1420004262915178823L * -6154793640677333111L), var3.anInt7693 * -457940705 * 393599711);
		}
		if (this.za() > 100663296 && Class312.method3111((byte) 40) > this.aLong9866 + 60000L) {
			System.gc();
			this.aLong9866 = Class312.method3111((byte) 29);
		}
		super.g(var4);
	}

	public boolean method5002(Class72 arg0, Class86 arg1) {
		return true;
	}

	public Interface11_Impl3 method5060(Class72 arg0, int arg1, int arg2, boolean arg3, byte[] arg4, int arg5, int arg6) {
		if (this.aBoolean9867 || Class380.method4393(arg1, -2054600731) && Class380.method4393(arg2, 960925079)) {
			return new Class287_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		} else if (this.aBoolean9880) {
			return new Class287_Sub3(this, arg0, arg1, arg2, arg4, arg5, arg6);
		} else {
			Class287_Sub1 var8 = new Class287_Sub1(this, arg0, Class86.aClass86_714, Class136.method1594(arg1, 1976613001), Class136.method1594(arg2, 1608068725));
			var8.method117(0, 0, arg1, arg2, arg4, arg0, arg5, arg6);
			return var8;
		}
	}

	public Interface11_Impl3 method5061(Class72 arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5, int arg6) {
		if (this.aBoolean9867 || Class380.method4393(arg1, -1415751977) && Class380.method4393(arg2, -761510533)) {
			return new Class287_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		} else if (this.aBoolean9880) {
			return new Class287_Sub3(this, arg0, arg1, arg2, arg4, arg5, arg6);
		} else {
			Class287_Sub1 var8 = new Class287_Sub1(this, arg0, Class86.aClass86_717, Class136.method1594(arg1, 1917758967), Class136.method1594(arg2, 1742723956));
			var8.method2883(0, 0, arg1, arg2, arg4, arg0, arg5, arg6);
			return var8;
		}
	}

	public Interface11_Impl3 method5058(Class72 arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5, int arg6) {
		if (this.aBoolean9867 || Class380.method4393(arg1, -1933225047) && Class380.method4393(arg2, 128762110)) {
			return new Class287_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		} else if (this.aBoolean9880) {
			return new Class287_Sub3(this, arg0, arg1, arg2, arg4, arg5, arg6);
		} else {
			Class287_Sub1 var8 = new Class287_Sub1(this, arg0, Class86.aClass86_717, Class136.method1594(arg1, 1559860839), Class136.method1594(arg2, 1813145913));
			var8.method2883(0, 0, arg1, arg2, arg4, arg0, arg5, arg6);
			return var8;
		}
	}

	public Interface11_Impl3 method5062(Class72 arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5, int arg6) {
		if (this.aBoolean9867 || Class380.method4393(arg1, 836563610) && Class380.method4393(arg2, -1258857758)) {
			return new Class287_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		} else if (this.aBoolean9880) {
			return new Class287_Sub3(this, arg0, arg1, arg2, arg4, arg5, arg6);
		} else {
			Class287_Sub1 var8 = new Class287_Sub1(this, arg0, Class86.aClass86_717, Class136.method1594(arg1, 1674152218), Class136.method1594(arg2, 2118488861));
			var8.method2883(0, 0, arg1, arg2, arg4, arg0, arg5, arg6);
			return var8;
		}
	}

	public Interface11_Impl3 method5063(Class72 arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5, int arg6) {
		if (this.aBoolean9867 || Class380.method4393(arg1, 701767635) && Class380.method4393(arg2, -2055905156)) {
			return new Class287_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		} else if (this.aBoolean9880) {
			return new Class287_Sub3(this, arg0, arg1, arg2, arg4, arg5, arg6);
		} else {
			Class287_Sub1 var8 = new Class287_Sub1(this, arg0, Class86.aClass86_717, Class136.method1594(arg1, 1697457998), Class136.method1594(arg2, 1849465390));
			var8.method2883(0, 0, arg1, arg2, arg4, arg0, arg5, arg6);
			return var8;
		}
	}

	public void method5108(Interface9_Impl2 arg0) {
		this.aClass266_Sub2_9886 = (Class266_Sub2) arg0;
		this.aClass266_Sub2_9886.method2647();
	}

	public Interface11_Impl3 method5065(int arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5) {
		if (this.aBoolean9867 || Class380.method4393(arg0, -1411737207) && Class380.method4393(arg1, 359445776)) {
			return new Class287_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
		} else if (this.aBoolean9880) {
			return new Class287_Sub3(this, arg0, arg1, arg3, arg4, arg5);
		} else {
			Class287_Sub1 var7 = new Class287_Sub1(this, Class72.aClass72_620, Class86.aClass86_714, Class136.method1594(arg0, 2096027057), Class136.method1594(arg1, 2040319133));
			var7.method118(0, 0, arg0, arg1, arg3, arg4, arg5);
			return var7;
		}
	}

	public Interface11_Impl3 method5066(int arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5) {
		if (this.aBoolean9867 || Class380.method4393(arg0, -1245209624) && Class380.method4393(arg1, -727192166)) {
			return new Class287_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
		} else if (this.aBoolean9880) {
			return new Class287_Sub3(this, arg0, arg1, arg3, arg4, arg5);
		} else {
			Class287_Sub1 var7 = new Class287_Sub1(this, Class72.aClass72_620, Class86.aClass86_714, Class136.method1594(arg0, 1953789863), Class136.method1594(arg1, 2094671142));
			var7.method118(0, 0, arg0, arg1, arg3, arg4, arg5);
			return var7;
		}
	}

	public Interface11_Impl1 method5067(int arg0, boolean arg1, int[][] arg2) {
		return new Class287_Sub4(this, arg0, arg1, arg2);
	}

	public boolean method5125(Class72 arg0, Class86 arg1) {
		return this.aBoolean8598;
	}

	public Interface11_Impl1 method5068(int arg0, boolean arg1, int[][] arg2) {
		return new Class287_Sub4(this, arg0, arg1, arg2);
	}

	public Interface11_Impl2 method5069(Class72 arg0, int arg1, int arg2, int arg3, boolean arg4, byte[] arg5) {
		return new Class287_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public float method4893() {
		return 0.0F;
	}

	public Interface11_Impl2 method5071(Class72 arg0, int arg1, int arg2, int arg3, boolean arg4, byte[] arg5) {
		return new Class287_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public Interface11_Impl3_Impl1 method5072(Class72 arg0, Class86 arg1, int arg2, int arg3) {
		if (this.aBoolean9867 || Class380.method4393(arg2, -1679453720) && Class380.method4393(arg3, -1386949722)) {
			return new Class287_Sub1(this, arg0, arg1, arg2, arg3);
		} else if (this.aBoolean9880) {
			return new Class287_Sub3(this, arg0, arg1, arg2, arg3);
		} else {
			return new Class287_Sub1(this, arg0, arg1, Class136.method1594(arg2, 1537566577), Class136.method1594(arg3, 1740006028));
		}
	}

	public Interface11_Impl3_Impl1 method5073(Class72 arg0, Class86 arg1, int arg2, int arg3) {
		if (this.aBoolean9867 || Class380.method4393(arg2, -1224212556) && Class380.method4393(arg3, 471363156)) {
			return new Class287_Sub1(this, arg0, arg1, arg2, arg3);
		} else if (this.aBoolean9880) {
			return new Class287_Sub3(this, arg0, arg1, arg2, arg3);
		} else {
			return new Class287_Sub1(this, arg0, arg1, Class136.method1594(arg2, 1585641615), Class136.method1594(arg3, 1580817859));
		}
	}

	public Interface11_Impl3_Impl1 method5074(Class72 arg0, Class86 arg1, int arg2, int arg3) {
		if (this.aBoolean9867 || Class380.method4393(arg2, 960965628) && Class380.method4393(arg3, -604601719)) {
			return new Class287_Sub1(this, arg0, arg1, arg2, arg3);
		} else if (this.aBoolean9880) {
			return new Class287_Sub3(this, arg0, arg1, arg2, arg3);
		} else {
			return new Class287_Sub1(this, arg0, arg1, Class136.method1594(arg2, 1535806863), Class136.method1594(arg3, 1919844722));
		}
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.dd()V")
	public void dd() {
		super.u();
		if (this.anOpenGL9881 != null) {
			this.anOpenGL9881.i();
			this.anOpenGL9881.release();
			this.anOpenGL9881 = null;
		}
	}

	public void method5078() {
		int var1 = this.anIntArray9874[this.anInt8543];
		if (var1 != 0) {
			this.anIntArray9874[this.anInt8543] = 0;
			OpenGL.glBindTexture(var1, 0);
			OpenGL.glDisable(var1);
		}
	}

	public void method4990(int arg0) {
		if (!this.aBoolean9885) {
			OpenGL.glPolygonMode(1028, (arg0 & 0x2) == 0 ? 6914 : 6913);
		}
	}

	public final void method5080(int arg0, Class175 arg1, boolean arg2, boolean arg3) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, method5143(arg1));
		if (arg2) {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 769 : 768);
		}
	}

	public void method5048() {
		this.aFloatArray9858[0] = this.aFloat8489 * this.aFloat8530;
		this.aFloatArray9858[1] = this.aFloat8489 * this.aFloat8500;
		this.aFloatArray9858[2] = this.aFloat8489 * this.aFloat8532;
		this.aFloatArray9858[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, this.aFloatArray9858, 0);
		this.aFloatArray9858[0] = -this.aFloat8535 * this.aFloat8530;
		this.aFloatArray9858[1] = -this.aFloat8535 * this.aFloat8500;
		this.aFloatArray9858[2] = -this.aFloat8535 * this.aFloat8532;
		this.aFloatArray9858[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, this.aFloatArray9858, 0);
	}

	public void method5086() {
		OpenGL.glMatrixMode(5890);
		if (this.aClass181Array8509[this.anInt8543] == Class181.aClass181_1784) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(this.aClass249Array8545[this.anInt8543].method2514(this.aFloatArray9887), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	public void method5087() {
		OpenGL.glActiveTexture(this.anInt8543 + 33984);
	}

	public void method5011() {
		OpenGL.glActiveTexture(this.anInt8543 + 33984);
	}

	public final void method4987(Class199 arg0, int arg1, int arg2, int arg3, int arg4) {
		byte var6;
		int var7;
		if (arg0 == Class199.aClass199_1930) {
			var6 = 1;
			var7 = arg4 * 2;
		} else if (arg0 == Class199.aClass199_1927) {
			var6 = 3;
			var7 = arg4 + 1;
		} else if (arg0 == Class199.aClass199_1926) {
			var6 = 4;
			var7 = arg4 * 3;
		} else if (arg0 == Class199.aClass199_1929) {
			var6 = 6;
			var7 = arg4 + 2;
		} else if (arg0 == Class199.aClass199_1931) {
			var6 = 5;
			var7 = arg4 + 2;
		} else {
			var6 = 0;
			var7 = arg4;
		}
		Class86 var8 = this.aClass266_Sub2_9886.method157();
		OpenGL.glDrawElements(var6, var7, method5147(var8), this.aClass266_Sub2_9886.method2646() + (long) (arg3 * var8.anInt724));
	}

	public void method5089() {
		OpenGL.glActiveTexture(this.anInt8543 + 33984);
	}

	public void method5081(int arg0, Interface9_Impl1 arg1) {
		this.aClass266_Sub1Array9872[arg0] = (Class266_Sub1) arg1;
	}

	public void method5091() {
		OpenGL.glTexEnvi(8960, 34161, method5142(this.aClass179Array8547[this.anInt8543]));
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.f()LClass51;")
	public Class51 f() {
		int var1 = -1;
		if (this.aString9876.indexOf("nvidia") != -1) {
			var1 = 4318;
		} else if (this.aString9876.indexOf("intel") != -1) {
			var1 = 32902;
		} else if (this.aString9876.indexOf("ati") != -1) {
			var1 = 4098;
		}
		return new Class51(var1, "OpenGL", this.anInt9859, this.aString9877, 0L);
	}

	public void method5093(int arg0) {
		OpenGL.glColorMask((arg0 & 0x1) != 0, (arg0 & 0x2) != 0, (arg0 & 0x4) != 0, (arg0 & 0x8) != 0);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.eo(Z)V")
	public void eo(boolean arg0) {
	}

	public void method5095() {
		byte var1 = 0;
		byte var2 = 0;
		if (this.anInt8613 == 0) {
			var1 = 0;
			var2 = 0;
		} else if (this.anInt8613 == 1) {
			var1 = 1;
			var2 = 0;
		} else if (this.anInt8613 == 2) {
			var1 = 1;
			var2 = 1;
		}
		if (this.aClass176_8583 == Class176.aClass176_1745) {
			OpenGL.glBlendFuncSeparate(770, 771, var1, var2);
		} else if (this.aClass176_8583 == Class176.aClass176_1744) {
			OpenGL.glBlendFuncSeparate(1, 1, var1, var2);
		} else if (this.aClass176_8583 == Class176.aClass176_1743) {
			OpenGL.glBlendFuncSeparate(774, 1, var1, var2);
		}
	}

	public void method5096() {
		byte var1 = 0;
		byte var2 = 0;
		if (this.anInt8613 == 0) {
			var1 = 0;
			var2 = 0;
		} else if (this.anInt8613 == 1) {
			var1 = 1;
			var2 = 0;
		} else if (this.anInt8613 == 2) {
			var1 = 1;
			var2 = 1;
		}
		if (this.aClass176_8583 == Class176.aClass176_1745) {
			OpenGL.glBlendFuncSeparate(770, 771, var1, var2);
		} else if (this.aClass176_8583 == Class176.aClass176_1744) {
			OpenGL.glBlendFuncSeparate(1, 1, var1, var2);
		} else if (this.aClass176_8583 == Class176.aClass176_1743) {
			OpenGL.glBlendFuncSeparate(774, 1, var1, var2);
		}
	}

	public void method5097() {
		if (this.aBoolean8546) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	public void method4907() {
		if (this.aBoolean8546) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	public void method5025() {
		this.aFloat8581 = this.aFloat8504 - (float) this.anInt8560;
		this.aFloat8580 = this.aFloat8581 - (float) this.anInt8578;
		if (this.aFloat8580 < this.aFloat8471) {
			this.aFloat8580 = this.aFloat8471;
		}
		if (!this.aBoolean8601) {
			return;
		}
		OpenGL.glFogf(2915, this.aFloat8580);
		OpenGL.glFogf(2916, this.aFloat8581);
		this.aFloatArray9858[0] = (float) (this.anInt8476 & 0xFF0000) / 1.671168E7F;
		this.aFloatArray9858[1] = (float) (this.anInt8476 & 0xFF00) / 65280.0F;
		this.aFloatArray9858[2] = (float) (this.anInt8476 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, this.aFloatArray9858, 0);
	}

	public void method5121() {
		this.aFloat8581 = this.aFloat8504 - (float) this.anInt8560;
		this.aFloat8580 = this.aFloat8581 - (float) this.anInt8578;
		if (this.aFloat8580 < this.aFloat8471) {
			this.aFloat8580 = this.aFloat8471;
		}
		if (!this.aBoolean8601) {
			return;
		}
		OpenGL.glFogf(2915, this.aFloat8580);
		OpenGL.glFogf(2916, this.aFloat8581);
		this.aFloatArray9858[0] = (float) (this.anInt8476 & 0xFF0000) / 1.671168E7F;
		this.aFloatArray9858[1] = (float) (this.anInt8476 & 0xFF00) / 65280.0F;
		this.aFloatArray9858[2] = (float) (this.anInt8476 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, this.aFloatArray9858, 0);
	}

	public void method4991() {
		if (this.aBoolean8514 && this.aBoolean8502 && this.anInt8578 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	public void method5014() {
		byte var1 = 0;
		byte var2 = 0;
		if (this.anInt8613 == 0) {
			var1 = 0;
			var2 = 0;
		} else if (this.anInt8613 == 1) {
			var1 = 1;
			var2 = 0;
		} else if (this.anInt8613 == 2) {
			var1 = 1;
			var2 = 1;
		}
		if (this.aClass176_8583 == Class176.aClass176_1745) {
			OpenGL.glBlendFuncSeparate(770, 771, var1, var2);
		} else if (this.aClass176_8583 == Class176.aClass176_1744) {
			OpenGL.glBlendFuncSeparate(1, 1, var1, var2);
		} else if (this.aClass176_8583 == Class176.aClass176_1743) {
			OpenGL.glBlendFuncSeparate(774, 1, var1, var2);
		}
	}

	public void method5101() {
		if (this.aBoolean8514 && this.aBoolean8502 && this.anInt8578 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	public boolean method5022() {
		return this.aBoolean9883;
	}

	public void method5122() {
		if (this.aBoolean8523) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.dt()LClass51;")
	public Class51 dt() {
		int var1 = -1;
		if (this.aString9876.indexOf("nvidia") != -1) {
			var1 = 4318;
		} else if (this.aString9876.indexOf("intel") != -1) {
			var1 = 32902;
		} else if (this.aString9876.indexOf("ati") != -1) {
			var1 = 4098;
		}
		return new Class51(var1, "OpenGL", this.anInt9859, this.aString9877, 0L);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.dl(II)V")
	public void dl(int arg0, int arg1) throws Exception_Sub1 {
		this.aClass76_Sub1_4234.method874();
		if (this.anInterface_ma4227 != null) {
			this.anInterface_ma4227.method224((short) -17745);
		}
	}

	public void method5126() {
		OpenGL.glTexEnvi(8960, 34162, method5142(this.aClass179Array8548[this.anInt8543]));
	}

	public void method5105(Class184 arg0) {
		Class193[] var2 = arg0.aClass193Array6483;
		int var3 = 0;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		int var7;
		for (var7 = 0; var7 < var2.length; var7++) {
			Class193 var8 = var2[var7];
			Class266_Sub1 var9 = this.aClass266_Sub1Array9872[var7];
			int var10 = 0;
			int var11 = var9.method2648();
			long var12 = var9.method2646();
			var9.method2647();
			for (int var14 = 0; var14 < var8.method2136(); var14++) {
				Class191 var15 = var8.method2134(var14);
				switch(var15.anInt1860) {
					case 0:
						OpenGL.glClientActiveTexture(var3++ + 33984);
						OpenGL.glTexCoordPointer(3, 5126, var11, var12 + (long) var10);
						break;
					case 1:
						OpenGL.glColorPointer(4, 5121, var11, var12 + (long) var10);
						var4 = true;
					case 2:
					case 4:
					default:
						break;
					case 3:
						OpenGL.glClientActiveTexture(var3++ + 33984);
						OpenGL.glTexCoordPointer(2, 5126, var11, var12 + (long) var10);
						break;
					case 5:
						OpenGL.glClientActiveTexture(var3++ + 33984);
						OpenGL.glTexCoordPointer(4, 5126, var11, var12 + (long) var10);
						break;
					case 6:
						OpenGL.glVertexPointer(3, 5126, var11, var12 + (long) var10);
						var6 = true;
						break;
					case 7:
						OpenGL.glClientActiveTexture(var3++ + 33984);
						OpenGL.glTexCoordPointer(1, 5126, var11, var12 + (long) var10);
						break;
					case 8:
						OpenGL.glNormalPointer(5126, var11, var12 + (long) var10);
						var5 = true;
				}
				var10 += var15.anInt1876;
			}
		}
		if (this.aBoolean9868 != var6) {
			if (var6) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean9868 = var6;
		}
		if (this.aBoolean9878 != var5) {
			if (var5) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean9878 = var5;
		}
		if (this.aBoolean9869 != var4) {
			if (var4) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean9869 = var4;
		}
		if (this.anInt9871 < var3) {
			for (var7 = this.anInt9871; var7 < var3; var7++) {
				OpenGL.glClientActiveTexture(var7 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt9871 = var3;
		} else if (this.anInt9871 > var3) {
			for (var7 = var3; var7 < this.anInt9871; var7++) {
				OpenGL.glClientActiveTexture(var7 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt9871 = var3;
		}
	}

	public void method5077() {
		int var1 = this.anIntArray9874[this.anInt8543];
		if (var1 != 0) {
			this.anIntArray9874[this.anInt8543] = 0;
			OpenGL.glBindTexture(var1, 0);
			OpenGL.glDisable(var1);
		}
	}

	public Interface11_Impl3 method5064(Class72 arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5, int arg6) {
		if (this.aBoolean9867 || Class380.method4393(arg1, 95614722) && Class380.method4393(arg2, 828697199)) {
			return new Class287_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		} else if (this.aBoolean9880) {
			return new Class287_Sub3(this, arg0, arg1, arg2, arg4, arg5, arg6);
		} else {
			Class287_Sub1 var8 = new Class287_Sub1(this, arg0, Class86.aClass86_717, Class136.method1594(arg1, 2039110197), Class136.method1594(arg2, 1925192184));
			var8.method2883(0, 0, arg1, arg2, arg4, arg0, arg5, arg6);
			return var8;
		}
	}

	public void method5107(int arg0, Interface9_Impl1 arg1) {
		this.aClass266_Sub1Array9872[arg0] = (Class266_Sub1) arg1;
	}

	public final synchronized void method5153(int arg0, int arg1) {
		Class330_Sub23 var3 = new Class330_Sub23(arg1);
		var3.aLong3341 = (long) arg0 * -1420004262915178823L * -6154793640677333111L;
		this.aClass471_9861.method5878(var3, (short) 8192);
	}

	public final Interface9_Impl1 method5132(boolean arg0) {
		return new Class266_Sub1(this, arg0);
	}

	public void method5109(Interface9_Impl2 arg0) {
		this.aClass266_Sub2_9886 = (Class266_Sub2) arg0;
		this.aClass266_Sub2_9886.method2647();
	}

	public void method5049() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass249_8472.aFloatArray2631, 0);
		OpenGL.glLightfv(16384, 4611, this.aFloatArray8525, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray8451, 0);
	}

	public final void method5113(Class199 arg0, int arg1, int arg2) {
		byte var4;
		int var5;
		if (arg0 == Class199.aClass199_1930) {
			var4 = 1;
			var5 = arg2 * 2;
		} else if (arg0 == Class199.aClass199_1927) {
			var4 = 3;
			var5 = arg2 + 1;
		} else if (arg0 == Class199.aClass199_1926) {
			var4 = 4;
			var5 = arg2 * 3;
		} else if (arg0 == Class199.aClass199_1929) {
			var4 = 6;
			var5 = arg2 + 2;
		} else if (arg0 == Class199.aClass199_1931) {
			var4 = 5;
			var5 = arg2 + 2;
		} else {
			var4 = 0;
			var5 = arg2;
		}
		OpenGL.glDrawArrays(var4, arg1, var5);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.av(III)LInterface8_Impl1_Impl1;")
	public Interface8_Impl1_Impl1 av(int arg0, int arg1, int arg2) {
		return new Class264(this, Class72.aClass72_610, Class86.aClass86_719, arg0, arg1, arg2);
	}

	public final void method5115(Interface9_Impl2 arg0, Class199 arg1, int arg2, int arg3, int arg4, int arg5) {
		byte var7;
		int var8;
		if (arg1 == Class199.aClass199_1930) {
			var7 = 1;
			var8 = arg5 * 2;
		} else if (arg1 == Class199.aClass199_1927) {
			var7 = 3;
			var8 = arg5 + 1;
		} else if (arg1 == Class199.aClass199_1926) {
			var7 = 4;
			var8 = arg5 * 3;
		} else if (arg1 == Class199.aClass199_1929) {
			var7 = 6;
			var8 = arg5 + 2;
		} else if (arg1 == Class199.aClass199_1931) {
			var7 = 5;
			var8 = arg5 + 2;
		} else {
			var7 = 0;
			var8 = arg5;
		}
		Class86 var9 = arg0.method157();
		Class266_Sub2 var10 = (Class266_Sub2) arg0;
		var10.method2647();
		OpenGL.glDrawElements(var7, var8, method5147(var9), var10.method2646() + (long) (arg4 * var9.anInt724 * -1700895659 * -1615628035));
	}

	public final void method5038(Class199 arg0, int arg1, int arg2, int arg3, int arg4) {
		byte var6;
		int var7;
		if (arg0 == Class199.aClass199_1930) {
			var6 = 1;
			var7 = arg4 * 2;
		} else if (arg0 == Class199.aClass199_1927) {
			var6 = 3;
			var7 = arg4 + 1;
		} else if (arg0 == Class199.aClass199_1926) {
			var6 = 4;
			var7 = arg4 * 3;
		} else if (arg0 == Class199.aClass199_1929) {
			var6 = 6;
			var7 = arg4 + 2;
		} else if (arg0 == Class199.aClass199_1931) {
			var6 = 5;
			var7 = arg4 + 2;
		} else {
			var6 = 0;
			var7 = arg4;
		}
		Class86 var8 = this.aClass266_Sub2_9886.method157();
		OpenGL.glDrawElements(var6, var7, method5147(var8), this.aClass266_Sub2_9886.method2646() + (long) (arg3 * var8.anInt724 * -1700895659 * -1615628035));
	}

	public final void method5116(Class199 arg0, int arg1, int arg2, int arg3, int arg4) {
		byte var6;
		int var7;
		if (arg0 == Class199.aClass199_1930) {
			var6 = 1;
			var7 = arg4 * 2;
		} else if (arg0 == Class199.aClass199_1927) {
			var6 = 3;
			var7 = arg4 + 1;
		} else if (arg0 == Class199.aClass199_1926) {
			var6 = 4;
			var7 = arg4 * 3;
		} else if (arg0 == Class199.aClass199_1929) {
			var6 = 6;
			var7 = arg4 + 2;
		} else if (arg0 == Class199.aClass199_1931) {
			var6 = 5;
			var7 = arg4 + 2;
		} else {
			var6 = 0;
			var7 = arg4;
		}
		Class86 var8 = this.aClass266_Sub2_9886.method157();
		OpenGL.glDrawElements(var6, var7, method5147(var8), this.aClass266_Sub2_9886.method2646() + (long) (arg3 * var8.anInt724 * -1700895659 * -1615628035));
	}

	public void method4997() {
		if (this.aBoolean8522 && !this.aBoolean8575) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	public void method5117(int arg0) {
		if (!this.aBoolean9885) {
			OpenGL.glPolygonMode(1028, (arg0 & 0x2) == 0 ? 6914 : 6913);
		}
	}

	public void method5118() {
		if (this.aClass76_4228 != null) {
			OpenGL.glViewport(this.anInt8517 + this.anInt8531, this.anInt8518 + this.aClass76_4228.method857() - this.anInt8567 - this.anInt8516, this.anInt8515, this.anInt8516);
		}
		OpenGL.glDepthRange(this.aFloat8499, this.aFloat8478);
	}

	public void method5119() {
		if (this.aClass76_4228 != null) {
			OpenGL.glViewport(this.anInt8517 + this.anInt8531, this.anInt8518 + this.aClass76_4228.method857() - this.anInt8567 - this.anInt8516, this.anInt8515, this.anInt8516);
		}
		OpenGL.glDepthRange(this.aFloat8499, this.aFloat8478);
	}

	public void method4917(Class249 arg0) {
		float[] var2 = arg0.aFloatArray2631;
		var2[1] = -var2[1];
		var2[5] = -var2[5];
		var2[9] = -var2[9];
		var2[13] = -var2[13];
	}

	public void method5033(Class249 arg0) {
		float[] var2 = arg0.aFloatArray2631;
		var2[1] = -var2[1];
		var2[5] = -var2[5];
		var2[9] = -var2[9];
		var2[13] = -var2[13];
	}

	public void method5020(Class249 arg0) {
		float[] var2 = arg0.aFloatArray2631;
		var2[1] = -var2[1];
		var2[5] = -var2[5];
		var2[9] = -var2[9];
		var2[13] = -var2[13];
	}

	public void method5042() {
		if (this.aBoolean8526) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	public final synchronized void method5154(int arg0, int arg1) {
		Class330_Sub23 var3 = new Class330_Sub23(arg1);
		var3.aLong3341 = arg0;
		this.aClass471_9860.method5878(var3, (short) 8192);
	}

	public void method4992() {
		if (this.aBoolean8523) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	public void method5124() {
		if (this.aBoolean8523) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	public boolean method5032(Class72 arg0, Class86 arg1) {
		return this.aBoolean8598;
	}

	public void method5083() {
		OpenGL.glMatrixMode(5890);
		if (this.aClass181Array8509[this.anInt8543] == Class181.aClass181_1784) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(this.aClass249Array8545[this.anInt8543].method2514(this.aFloatArray9887), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	public void method4968() {
		OpenGL.glTexEnvi(8960, 34162, method5142(this.aClass179Array8548[this.anInt8543]));
	}

	public void method5127() {
		OpenGL.glTexEnvi(8960, 34162, method5142(this.aClass179Array8548[this.anInt8543]));
	}

	public final void method5128() {
		this.aFloatArray9858[0] = (float) (this.anInt8445 & 0xFF0000) / 1.671168E7F;
		this.aFloatArray9858[1] = (float) (this.anInt8445 & 0xFF00) / 65280.0F;
		this.aFloatArray9858[2] = (float) (this.anInt8445 & 0xFF) / 255.0F;
		this.aFloatArray9858[3] = (float) (this.anInt8445 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, this.aFloatArray9858, 0);
	}

	public final Interface9_Impl1 method4976(boolean arg0) {
		return new Class266_Sub1(this, arg0);
	}

	public void method4989() {
		if (this.aBoolean8585) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	public void method5004(Interface9_Impl2 arg0) {
		this.aClass266_Sub2_9886 = (Class266_Sub2) arg0;
		this.aClass266_Sub2_9886.method2647();
	}

	public final Interface9_Impl1 method5131(boolean arg0) {
		return new Class266_Sub1(this, arg0);
	}

	public void method5034() {
		if (this.aClass76_4228 == null) {
			return;
		}
		int var1 = this.anInt8517 + this.anInt8610;
		int var2 = this.anInt8518 + this.aClass76_4228.method857() - this.anInt8506;
		int var3 = this.anInt8447 - this.anInt8610;
		int var4 = this.anInt8506 - this.anInt8521;
		if (var3 < 0) {
			var3 = 0;
		}
		if (var4 < 0) {
			var4 = 0;
		}
		OpenGL.glScissor(var1, var2, var3, var4);
	}

	public final void method5001(int arg0, Class175 arg1, boolean arg2, boolean arg3) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, method5143(arg1));
		if (arg2) {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 769 : 768);
		}
	}

	public void method5133(Class249 arg0, Class249 arg1, Class249 arg2) {
		OpenGL.glMatrixMode(5888);
		this.aClass249_8576.method2484(arg0, arg1);
		OpenGL.glLoadMatrixf(this.aClass249_8576.aFloatArray2631, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(arg2.aFloatArray2631, 0);
	}

	public void method5134(Class249 arg0, Class249 arg1, Class249 arg2) {
		OpenGL.glMatrixMode(5888);
		this.aClass249_8576.method2484(arg0, arg1);
		OpenGL.glLoadMatrixf(this.aClass249_8576.aFloatArray2631, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(arg2.aFloatArray2631, 0);
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.de()V")
	public void de() {
		super.u();
		if (this.anOpenGL9881 != null) {
			this.anOpenGL9881.i();
			this.anOpenGL9881.release();
			this.anOpenGL9881 = null;
		}
	}

	public Interface11_Impl3 method5136(Class72 arg0, Class86 arg1, int arg2, int arg3) {
		return this.method4953(arg0, arg1, arg2, arg3);
	}

	public Interface11_Impl3 method5137(Class72 arg0, Class86 arg1, int arg2, int arg3) {
		return this.method4953(arg0, arg1, arg2, arg3);
	}

	public Interface11_Impl3 method5138(Class72 arg0, Class86 arg1, int arg2, int arg3) {
		return this.method4953(arg0, arg1, arg2, arg3);
	}

	public final void method5139(int arg0, Class175 arg1, boolean arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, method5143(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, arg2 ? 771 : 770);
	}

	public void method5009(Class184 arg0) {
		Class193[] var2 = arg0.aClass193Array6483;
		int var3 = 0;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		int var7;
		for (var7 = 0; var7 < var2.length; var7++) {
			Class193 var8 = var2[var7];
			Class266_Sub1 var9 = this.aClass266_Sub1Array9872[var7];
			int var10 = 0;
			int var11 = var9.method2648();
			long var12 = var9.method2646();
			var9.method2647();
			for (int var14 = 0; var14 < var8.method2136(); var14++) {
				Class191 var15 = var8.method2134(var14);
				switch(var15.anInt1860) {
					case 0:
						OpenGL.glClientActiveTexture(var3++ + 33984);
						OpenGL.glTexCoordPointer(3, 5126, var11, var12 + (long) var10);
						break;
					case 1:
						OpenGL.glColorPointer(4, 5121, var11, var12 + (long) var10);
						var4 = true;
					case 2:
					case 4:
					default:
						break;
					case 3:
						OpenGL.glClientActiveTexture(var3++ + 33984);
						OpenGL.glTexCoordPointer(2, 5126, var11, var12 + (long) var10);
						break;
					case 5:
						OpenGL.glClientActiveTexture(var3++ + 33984);
						OpenGL.glTexCoordPointer(4, 5126, var11, var12 + (long) var10);
						break;
					case 6:
						OpenGL.glVertexPointer(3, 5126, var11, var12 + (long) var10);
						var6 = true;
						break;
					case 7:
						OpenGL.glClientActiveTexture(var3++ + 33984);
						OpenGL.glTexCoordPointer(1, 5126, var11, var12 + (long) var10);
						break;
					case 8:
						OpenGL.glNormalPointer(5126, var11, var12 + (long) var10);
						var5 = true;
				}
				var10 += var15.anInt1876;
			}
		}
		if (this.aBoolean9868 != var6) {
			if (var6) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean9868 = var6;
		}
		if (this.aBoolean9878 != var5) {
			if (var5) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean9878 = var5;
		}
		if (this.aBoolean9869 != var4) {
			if (var4) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean9869 = var4;
		}
		if (this.anInt9871 < var3) {
			for (var7 = this.anInt9871; var7 < var3; var7++) {
				OpenGL.glClientActiveTexture(var7 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt9871 = var3;
		} else if (this.anInt9871 > var3) {
			for (var7 = var3; var7 < this.anInt9871; var7++) {
				OpenGL.glClientActiveTexture(var7 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt9871 = var3;
		}
	}

	public void method5098(Class184 arg0) {
		Class193[] var2 = arg0.aClass193Array6483;
		int var3 = 0;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		int var7;
		for (var7 = 0; var7 < var2.length; var7++) {
			Class193 var8 = var2[var7];
			Class266_Sub1 var9 = this.aClass266_Sub1Array9872[var7];
			int var10 = 0;
			int var11 = var9.method2648();
			long var12 = var9.method2646();
			var9.method2647();
			for (int var14 = 0; var14 < var8.method2136(); var14++) {
				Class191 var15 = var8.method2134(var14);
				switch(var15.anInt1860) {
					case 0:
						OpenGL.glClientActiveTexture(var3++ + 33984);
						OpenGL.glTexCoordPointer(3, 5126, var11, var12 + (long) var10);
						break;
					case 1:
						OpenGL.glColorPointer(4, 5121, var11, var12 + (long) var10);
						var4 = true;
					case 2:
					case 4:
					default:
						break;
					case 3:
						OpenGL.glClientActiveTexture(var3++ + 33984);
						OpenGL.glTexCoordPointer(2, 5126, var11, var12 + (long) var10);
						break;
					case 5:
						OpenGL.glClientActiveTexture(var3++ + 33984);
						OpenGL.glTexCoordPointer(4, 5126, var11, var12 + (long) var10);
						break;
					case 6:
						OpenGL.glVertexPointer(3, 5126, var11, var12 + (long) var10);
						var6 = true;
						break;
					case 7:
						OpenGL.glClientActiveTexture(var3++ + 33984);
						OpenGL.glTexCoordPointer(1, 5126, var11, var12 + (long) var10);
						break;
					case 8:
						OpenGL.glNormalPointer(5126, var11, var12 + (long) var10);
						var5 = true;
				}
				var10 += var15.anInt1876;
			}
		}
		if (this.aBoolean9868 != var6) {
			if (var6) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean9868 = var6;
		}
		if (this.aBoolean9878 != var5) {
			if (var5) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean9878 = var5;
		}
		if (this.aBoolean9869 != var4) {
			if (var4) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean9869 = var4;
		}
		if (this.anInt9871 < var3) {
			for (var7 = this.anInt9871; var7 < var3; var7++) {
				OpenGL.glClientActiveTexture(var7 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt9871 = var3;
		} else if (this.anInt9871 > var3) {
			for (var7 = var3; var7 < this.anInt9871; var7++) {
				OpenGL.glClientActiveTexture(var7 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt9871 = var3;
		}
	}

	@ObfuscatedName("Class_ra_Sub2_Sub1.dj(II)V")
	public void dj(int arg0, int arg1) throws Exception_Sub1 {
		this.aClass76_Sub1_4234.method874();
		if (this.anInterface_ma4227 != null) {
			this.anInterface_ma4227.method224((short) -2000);
		}
	}

	public void method5155() {
		OpenGL.glDepthFunc(515);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		for (int var1 = this.anInt8592 - 1; var1 >= 0; var1--) {
			OpenGL.glActiveTexture(var1 + 33984);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		float[] var4 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (int var2 = 0; var2 < 8; var2++) {
			int var3 = var2 + 16384;
			OpenGL.glLightfv(var3, 4608, var4, 0);
			OpenGL.glLightf(var3, 4615, 0.0F);
			OpenGL.glLightf(var3, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL9881.setSwapInterval(0);
		super.method4895();
	}

	public void method5088() {
		OpenGL.glActiveTexture(this.anInt8543 + 33984);
	}

	public void method5123() {
		if (this.aBoolean8523) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}
}
