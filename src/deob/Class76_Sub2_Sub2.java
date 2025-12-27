package deob;

import jaggl.OpenGL;

public class Class76_Sub2_Sub2 extends Class76_Sub2 {

	public Interface8_Impl1_Impl2_Impl2[] anInterface8_Impl1_Impl2_Impl2Array9393 = new Interface8_Impl1_Impl2_Impl2[4];

	public Class_ra_Sub1 aClass_ra_Sub1_9387;

	public int anInt9389;

	public static int anInt9395 = 16;

	public int anInt9388;

	public int anInt9390;

	public int anInt9391;

	public int anInt9392;

	public Interface8_Impl1_Impl2_Impl2 anInterface8_Impl1_Impl2_Impl2_9394;

	public Class76_Sub2_Sub2(Class_ra_Sub1 arg0) {
		if (!arg0.aBoolean8429) {
			throw new IllegalStateException("");
		}
		this.aClass_ra_Sub1_9387 = arg0;
		int[] var2 = new int[1];
		OpenGL.glGenFramebuffersEXT(1, var2, 0);
		this.anInt9389 = var2[0];
	}

	public int method856() {
		return this.anInt9390;
	}

	public int method857() {
		return this.anInt9391;
	}

	public void method916() {
		if (this.anInterface8_Impl1_Impl2_Impl2_9394 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.anInterface8_Impl1_Impl2_Impl2_9394.method2(36096);
		}
	}

	public void method917(int arg0) {
		Interface8_Impl1_Impl2_Impl2 var2 = this.anInterface8_Impl1_Impl2_Impl2Array9393[arg0];
		if (var2 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, arg0 + 36064, 36161, 0);
		} else {
			var2.method2(arg0 + 36064);
		}
	}

	public boolean method174() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt9389);
		for (int var1 = 0; var1 < 4; var1++) {
			if ((this.anInt9388 & 0x1 << var1) != 0) {
				this.method917(var1);
			}
		}
		if ((this.anInt9388 & 0x10) != 0) {
			this.method916();
		}
		this.anInt9388 = 0;
		this.aClass_ra_Sub1_9387.method4813();
		return true;
	}

	public void method183() {
		if (this.anInt9389 != 0) {
			this.aClass_ra_Sub1_9387.method4860(this.anInt9389);
			this.anInt9389 = 0;
		}
	}

	public boolean method176() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt9389);
		for (int var1 = 0; var1 < 4; var1++) {
			if ((this.anInt9388 & 0x1 << var1) != 0) {
				this.method917(var1);
			}
		}
		if ((this.anInt9388 & 0x10) != 0) {
			this.method916();
		}
		this.anInt9388 = 0;
		this.aClass_ra_Sub1_9387.method4813();
		return true;
	}

	public boolean method862() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	public void method918(int arg0) {
		OpenGL.glDrawBuffer(arg0 + 36064);
	}

	public void method903(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		int var9 = this.anInt9391;
		int var10 = this.aClass_ra_Sub1_9387.method4782((byte) 0).method857();
		int var11 = 0;
		if (arg7) {
			var11 |= 0x100;
		}
		if (arg6) {
			var11 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.anInt9389);
		OpenGL.glBlitFramebufferEXT(arg0, var9 - arg1 - arg3, arg0 + arg2, var9 - arg1, arg4, var10 - arg5 - arg3, arg4 + arg2, var10 - arg5, var11, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	public void method910(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		int var9 = this.anInt9391;
		int var10 = this.aClass_ra_Sub1_9387.method4782((byte) 0).method857();
		int var11 = 0;
		if (arg7) {
			var11 |= 0x100;
		}
		if (arg6) {
			var11 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.anInt9389);
		OpenGL.glBlitFramebufferEXT(arg0, var9 - arg1 - arg3, arg0 + arg2, var9 - arg1, arg4, var10 - arg5 - arg3, arg4 + arg2, var10 - arg5, var11, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	public int method858() {
		return this.anInt9390;
	}

	public int method864() {
		return this.anInt9390;
	}

	public int method859() {
		return this.anInt9390;
	}

	public boolean method899() {
		int var1 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return var1 == 36053;
	}

	public void method900(Interface8_Impl1_Impl1 arg0) {
		Interface8_Impl1_Impl2_Impl2 var2 = (Interface8_Impl1_Impl2_Impl2) arg0;
		if (arg0 == null) {
			this.anInt9392 &= 0xFFFFFFEF;
			this.anInterface8_Impl1_Impl2_Impl2_9394 = null;
			if (this.anInt9392 == 0) {
				this.anInt9391 = 0;
				this.anInt9390 = 0;
			}
		} else {
			if ((this.anInt9392 | 0x10) == 16) {
				this.anInt9391 = var2.method55();
				this.anInt9390 = var2.method54();
				if (this.aClass_ra_Sub1_9387.method4782((byte) 0) == this) {
					this.aClass_ra_Sub1_9387.method4866();
				}
			} else if (this.anInt9390 != var2.method54() || this.anInt9391 != var2.method55()) {
				throw new RuntimeException();
			}
			this.anInt9392 |= 0x10;
			this.anInterface8_Impl1_Impl2_Impl2_9394 = var2;
		}
		if (this.aClass_ra_Sub1_9387.method4782((byte) 0) == this) {
			this.method916();
		} else {
			this.anInt9388 |= 0x10;
		}
	}

	public int method855() {
		return this.anInt9391;
	}

	public int method861() {
		return this.anInt9391;
	}

	public boolean method904() {
		int var1 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return var1 == 36053;
	}

	public void method905(int arg0, Interface8_Impl1_Impl2 arg1) {
		int var3 = 0x1 << arg0;
		Interface8_Impl1_Impl2_Impl2 var4 = (Interface8_Impl1_Impl2_Impl2) arg1;
		if (arg1 == null) {
			this.anInt9392 &= ~var3;
			this.anInterface8_Impl1_Impl2_Impl2Array9393[arg0] = null;
			if (this.anInt9392 == 0) {
				this.anInt9391 = 0;
				this.anInt9390 = 0;
			}
		} else {
			if ((this.anInt9392 | var3) == var3) {
				this.anInt9391 = var4.method55();
				this.anInt9390 = var4.method54();
				if (this.aClass_ra_Sub1_9387.method4782((byte) 0) == this) {
					this.aClass_ra_Sub1_9387.method4866();
				}
			} else if (this.anInt9390 != var4.method54() || this.anInt9391 != var4.method55()) {
				throw new RuntimeException();
			}
			this.anInt9392 |= var3;
			this.anInterface8_Impl1_Impl2_Impl2Array9393[arg0] = var4;
		}
		if (this.aClass_ra_Sub1_9387.method4782((byte) 0) == this) {
			this.method917(arg0);
		} else {
			this.anInt9388 |= var3;
		}
	}

	public void method906(Interface8_Impl1_Impl1 arg0) {
		Interface8_Impl1_Impl2_Impl2 var2 = (Interface8_Impl1_Impl2_Impl2) arg0;
		if (arg0 == null) {
			this.anInt9392 &= 0xFFFFFFEF;
			this.anInterface8_Impl1_Impl2_Impl2_9394 = null;
			if (this.anInt9392 == 0) {
				this.anInt9391 = 0;
				this.anInt9390 = 0;
			}
		} else {
			if ((this.anInt9392 | 0x10) == 16) {
				this.anInt9391 = var2.method55();
				this.anInt9390 = var2.method54();
				if (this.aClass_ra_Sub1_9387.method4782((byte) 0) == this) {
					this.aClass_ra_Sub1_9387.method4866();
				}
			} else if (this.anInt9390 != var2.method54() || this.anInt9391 != var2.method55()) {
				throw new RuntimeException();
			}
			this.anInt9392 |= 0x10;
			this.anInterface8_Impl1_Impl2_Impl2_9394 = var2;
		}
		if (this.aClass_ra_Sub1_9387.method4782((byte) 0) == this) {
			this.method916();
		} else {
			this.anInt9388 |= 0x10;
		}
	}

	public boolean method902() {
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

	public boolean method182() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt9389);
		for (int var1 = 0; var1 < 4; var1++) {
			if ((this.anInt9388 & 0x1 << var1) != 0) {
				this.method917(var1);
			}
		}
		if ((this.anInt9388 & 0x10) != 0) {
			this.method916();
		}
		this.anInt9388 = 0;
		this.aClass_ra_Sub1_9387.method4813();
		return true;
	}

	public boolean method178() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt9389);
		for (int var1 = 0; var1 < 4; var1++) {
			if ((this.anInt9388 & 0x1 << var1) != 0) {
				this.method917(var1);
			}
		}
		if ((this.anInt9388 & 0x10) != 0) {
			this.method916();
		}
		this.anInt9388 = 0;
		this.aClass_ra_Sub1_9387.method4813();
		return true;
	}

	public boolean method863() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	public boolean method865() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	public void method185() {
		if (this.anInt9389 != 0) {
			this.aClass_ra_Sub1_9387.method4860(this.anInt9389);
			this.anInt9389 = 0;
		}
	}

	public void method180() {
		if (this.anInt9389 != 0) {
			this.aClass_ra_Sub1_9387.method4860(this.anInt9389);
			this.anInt9389 = 0;
		}
	}

	public void method181() {
		if (this.anInt9389 != 0) {
			this.aClass_ra_Sub1_9387.method4860(this.anInt9389);
			this.anInt9389 = 0;
		}
	}

	public void method909(int arg0, Interface8_Impl1_Impl2 arg1) {
		int var3 = 0x1 << arg0;
		Interface8_Impl1_Impl2_Impl2 var4 = (Interface8_Impl1_Impl2_Impl2) arg1;
		if (arg1 == null) {
			this.anInt9392 &= ~var3;
			this.anInterface8_Impl1_Impl2_Impl2Array9393[arg0] = null;
			if (this.anInt9392 == 0) {
				this.anInt9391 = 0;
				this.anInt9390 = 0;
			}
		} else {
			if ((this.anInt9392 | var3) == var3) {
				this.anInt9391 = var4.method55();
				this.anInt9390 = var4.method54();
				if (this.aClass_ra_Sub1_9387.method4782((byte) 0) == this) {
					this.aClass_ra_Sub1_9387.method4866();
				}
			} else if (this.anInt9390 != var4.method54() || this.anInt9391 != var4.method55()) {
				throw new RuntimeException();
			}
			this.anInt9392 |= var3;
			this.anInterface8_Impl1_Impl2_Impl2Array9393[arg0] = var4;
		}
		if (this.aClass_ra_Sub1_9387.method4782((byte) 0) == this) {
			this.method917(arg0);
		} else {
			this.anInt9388 |= var3;
		}
	}

	public void method179() {
		if (this.anInt9389 != 0) {
			this.aClass_ra_Sub1_9387.method4860(this.anInt9389);
			this.anInt9389 = 0;
		}
	}

	public int method860() {
		return this.anInt9391;
	}

	public void method901(int arg0, Interface8_Impl1_Impl2 arg1) {
		int var3 = 0x1 << arg0;
		Interface8_Impl1_Impl2_Impl2 var4 = (Interface8_Impl1_Impl2_Impl2) arg1;
		if (arg1 == null) {
			this.anInt9392 &= ~var3;
			this.anInterface8_Impl1_Impl2_Impl2Array9393[arg0] = null;
			if (this.anInt9392 == 0) {
				this.anInt9391 = 0;
				this.anInt9390 = 0;
			}
		} else {
			if ((this.anInt9392 | var3) == var3) {
				this.anInt9391 = var4.method55();
				this.anInt9390 = var4.method54();
				if (this.aClass_ra_Sub1_9387.method4782((byte) 0) == this) {
					this.aClass_ra_Sub1_9387.method4866();
				}
			} else if (this.anInt9390 != var4.method54() || this.anInt9391 != var4.method55()) {
				throw new RuntimeException();
			}
			this.anInt9392 |= var3;
			this.anInterface8_Impl1_Impl2_Impl2Array9393[arg0] = var4;
		}
		if (this.aClass_ra_Sub1_9387.method4782((byte) 0) == this) {
			this.method917(arg0);
		} else {
			this.anInt9388 |= var3;
		}
	}
}
