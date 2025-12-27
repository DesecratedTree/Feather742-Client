package deob;

import jaggl.OpenGL;

public class Class76_Sub2_Sub3_Sub2 extends Class76_Sub2_Sub3 {

	public Interface8_Impl1_Impl2_Impl1[] anInterface8_Impl1_Impl2_Impl1Array10113 = new Interface8_Impl1_Impl2_Impl1[4];

	public Class_ra_Sub2_Sub1 aClass_ra_Sub2_Sub1_10111;

	public int anInt10112;

	public static int anInt10119 = 16;

	public int anInt10114;

	public int anInt10115;

	public int anInt10116;

	public int anInt10117;

	public Interface8_Impl1_Impl2_Impl1 anInterface8_Impl1_Impl2_Impl1_10118;

	public Class76_Sub2_Sub3_Sub2(Class_ra_Sub2_Sub1 arg0) {
		super(arg0);
		this.aClass_ra_Sub2_Sub1_10111 = arg0;
		int[] var2 = new int[1];
		OpenGL.glGenFramebuffersEXT(1, var2, 0);
		this.anInt10112 = var2[0];
	}

	public void method923(int arg0) {
		Interface8_Impl1_Impl2_Impl1 var2 = this.anInterface8_Impl1_Impl2_Impl1Array10113[arg0];
		if (var2 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, arg0 + 36064, 36161, 0);
		} else {
			var2.method217(arg0 + 36064);
		}
	}

	public int method857() {
		return this.anInt10115;
	}

	public int method856() {
		return this.anInt10114;
	}

	public void method900(Interface8_Impl1_Impl1 arg0) {
		Interface8_Impl1_Impl2_Impl1 var2 = (Interface8_Impl1_Impl2_Impl1) arg0;
		if (arg0 == null) {
			this.anInt10116 &= 0xFFFFFFEF;
			this.anInterface8_Impl1_Impl2_Impl1_10118 = null;
			if (this.anInt10116 == 0) {
				this.anInt10115 = 0;
				this.anInt10114 = 0;
			}
		} else {
			if (this.anInt10116 == 0) {
				this.anInt10115 = var2.method55();
				this.anInt10114 = var2.method54();
				this.method919();
			} else if (this.anInt10114 != var2.method54() || this.anInt10115 != var2.method55()) {
				throw new RuntimeException();
			}
			this.anInt10116 |= 0x10;
			this.anInterface8_Impl1_Impl2_Impl1_10118 = var2;
		}
		if (this.aClass_ra_Sub2_Sub1_10111.method4782((byte) 0) == this) {
			this.method924();
		} else {
			this.anInt10117 |= 0x10;
		}
	}

	public void method910(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		int var9 = this.anInt10115;
		int var10 = this.aClass_ra_Sub2_Sub1_10111.method4782((byte) 0).method857();
		int var11 = 0;
		if (arg7) {
			var11 |= 0x100;
		}
		if (arg6) {
			var11 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.anInt10112);
		OpenGL.glBlitFramebufferEXT(arg0, var9 - arg1 - arg3, arg0 + arg2, var9 - arg1, arg4, var10 - arg5 - arg3, arg4 + arg2, var10 - arg5, var11, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	public int method859() {
		return this.anInt10114;
	}

	public boolean method902() {
		int var1 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return var1 == 36053;
	}

	public void method901(int arg0, Interface8_Impl1_Impl2 arg1) {
		int var3 = 0x1 << arg0;
		Interface8_Impl1_Impl2_Impl1 var4 = (Interface8_Impl1_Impl2_Impl1) arg1;
		if (arg1 == null) {
			this.anInt10116 &= ~var3;
			this.anInterface8_Impl1_Impl2_Impl1Array10113[arg0] = null;
			if (this.anInt10116 == 0) {
				this.anInt10115 = 0;
				this.anInt10114 = 0;
			}
		} else {
			if (this.anInt10116 == 0) {
				this.anInt10115 = var4.method55();
				this.anInt10114 = var4.method54();
				this.method919();
			} else if (this.anInt10114 != var4.method54() || this.anInt10115 != var4.method55()) {
				throw new RuntimeException();
			}
			this.anInt10116 |= var3;
			this.anInterface8_Impl1_Impl2_Impl1Array10113[arg0] = var4;
		}
		if (this.aClass_ra_Sub2_Sub1_10111.method4782((byte) 0) == this) {
			this.method923(arg0);
		} else {
			this.anInt10117 |= var3;
		}
	}

	public boolean method862() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	public boolean method865() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	public int method864() {
		return this.anInt10114;
	}

	public int method858() {
		return this.anInt10114;
	}

	public int method860() {
		return this.anInt10115;
	}

	public void method909(int arg0, Interface8_Impl1_Impl2 arg1) {
		int var3 = 0x1 << arg0;
		Interface8_Impl1_Impl2_Impl1 var4 = (Interface8_Impl1_Impl2_Impl1) arg1;
		if (arg1 == null) {
			this.anInt10116 &= ~var3;
			this.anInterface8_Impl1_Impl2_Impl1Array10113[arg0] = null;
			if (this.anInt10116 == 0) {
				this.anInt10115 = 0;
				this.anInt10114 = 0;
			}
		} else {
			if (this.anInt10116 == 0) {
				this.anInt10115 = var4.method55();
				this.anInt10114 = var4.method54();
				this.method919();
			} else if (this.anInt10114 != var4.method54() || this.anInt10115 != var4.method55()) {
				throw new RuntimeException();
			}
			this.anInt10116 |= var3;
			this.anInterface8_Impl1_Impl2_Impl1Array10113[arg0] = var4;
		}
		if (this.aClass_ra_Sub2_Sub1_10111.method4782((byte) 0) == this) {
			this.method923(arg0);
		} else {
			this.anInt10117 |= var3;
		}
	}

	public int method861() {
		return this.anInt10115;
	}

	public int method855() {
		return this.anInt10115;
	}

	public void method905(int arg0, Interface8_Impl1_Impl2 arg1) {
		int var3 = 0x1 << arg0;
		Interface8_Impl1_Impl2_Impl1 var4 = (Interface8_Impl1_Impl2_Impl1) arg1;
		if (arg1 == null) {
			this.anInt10116 &= ~var3;
			this.anInterface8_Impl1_Impl2_Impl1Array10113[arg0] = null;
			if (this.anInt10116 == 0) {
				this.anInt10115 = 0;
				this.anInt10114 = 0;
			}
		} else {
			if (this.anInt10116 == 0) {
				this.anInt10115 = var4.method55();
				this.anInt10114 = var4.method54();
				this.method919();
			} else if (this.anInt10114 != var4.method54() || this.anInt10115 != var4.method55()) {
				throw new RuntimeException();
			}
			this.anInt10116 |= var3;
			this.anInterface8_Impl1_Impl2_Impl1Array10113[arg0] = var4;
		}
		if (this.aClass_ra_Sub2_Sub1_10111.method4782((byte) 0) == this) {
			this.method923(arg0);
		} else {
			this.anInt10117 |= var3;
		}
	}

	public void method906(Interface8_Impl1_Impl1 arg0) {
		Interface8_Impl1_Impl2_Impl1 var2 = (Interface8_Impl1_Impl2_Impl1) arg0;
		if (arg0 == null) {
			this.anInt10116 &= 0xFFFFFFEF;
			this.anInterface8_Impl1_Impl2_Impl1_10118 = null;
			if (this.anInt10116 == 0) {
				this.anInt10115 = 0;
				this.anInt10114 = 0;
			}
		} else {
			if (this.anInt10116 == 0) {
				this.anInt10115 = var2.method55();
				this.anInt10114 = var2.method54();
				this.method919();
			} else if (this.anInt10114 != var2.method54() || this.anInt10115 != var2.method55()) {
				throw new RuntimeException();
			}
			this.anInt10116 |= 0x10;
			this.anInterface8_Impl1_Impl2_Impl1_10118 = var2;
		}
		if (this.aClass_ra_Sub2_Sub1_10111.method4782((byte) 0) == this) {
			this.method924();
		} else {
			this.anInt10117 |= 0x10;
		}
	}

	public boolean method899() {
		int var1 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return var1 == 36053;
	}

	public boolean method904() {
		int var1 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return var1 == 36053;
	}

	public boolean method908() {
		int var1 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return var1 == 36053;
	}

	public boolean method907() {
		int var1 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return var1 == 36053;
	}

	public boolean method176() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt10112);
		for (int var1 = 0; var1 < 4; var1++) {
			if ((this.anInt10117 & 0x1 << var1) != 0) {
				this.method923(var1);
			}
		}
		if ((this.anInt10117 & 0x10) != 0) {
			this.method924();
		}
		this.anInt10117 = 0;
		return super.method174();
	}

	public boolean method182() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt10112);
		for (int var1 = 0; var1 < 4; var1++) {
			if ((this.anInt10117 & 0x1 << var1) != 0) {
				this.method923(var1);
			}
		}
		if ((this.anInt10117 & 0x10) != 0) {
			this.method924();
		}
		this.anInt10117 = 0;
		return super.method174();
	}

	public boolean method178() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt10112);
		for (int var1 = 0; var1 < 4; var1++) {
			if ((this.anInt10117 & 0x1 << var1) != 0) {
				this.method923(var1);
			}
		}
		if ((this.anInt10117 & 0x10) != 0) {
			this.method924();
		}
		this.anInt10117 = 0;
		return super.method174();
	}

	public boolean method863() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	public void method185() {
		if (this.anInt10112 != 0) {
			this.aClass_ra_Sub2_Sub1_10111.method5144(this.anInt10112);
			this.anInt10112 = 0;
		}
	}

	public void method183() {
		if (this.anInt10112 != 0) {
			this.aClass_ra_Sub2_Sub1_10111.method5144(this.anInt10112);
			this.anInt10112 = 0;
		}
	}

	public void method179() {
		if (this.anInt10112 != 0) {
			this.aClass_ra_Sub2_Sub1_10111.method5144(this.anInt10112);
			this.anInt10112 = 0;
		}
	}

	public void method180() {
		if (this.anInt10112 != 0) {
			this.aClass_ra_Sub2_Sub1_10111.method5144(this.anInt10112);
			this.anInt10112 = 0;
		}
	}

	public void method181() {
		if (this.anInt10112 != 0) {
			this.aClass_ra_Sub2_Sub1_10111.method5144(this.anInt10112);
			this.anInt10112 = 0;
		}
	}

	public boolean method174() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt10112);
		for (int var1 = 0; var1 < 4; var1++) {
			if ((this.anInt10117 & 0x1 << var1) != 0) {
				this.method923(var1);
			}
		}
		if ((this.anInt10117 & 0x10) != 0) {
			this.method924();
		}
		this.anInt10117 = 0;
		return super.method174();
	}

	public void method903(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		int var9 = this.anInt10115;
		int var10 = this.aClass_ra_Sub2_Sub1_10111.method4782((byte) 0).method857();
		int var11 = 0;
		if (arg7) {
			var11 |= 0x100;
		}
		if (arg6) {
			var11 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.anInt10112);
		OpenGL.glBlitFramebufferEXT(arg0, var9 - arg1 - arg3, arg0 + arg2, var9 - arg1, arg4, var10 - arg5 - arg3, arg4 + arg2, var10 - arg5, var11, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	public void method924() {
		if (this.anInterface8_Impl1_Impl2_Impl1_10118 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.anInterface8_Impl1_Impl2_Impl1_10118.method217(36096);
		}
	}
}
