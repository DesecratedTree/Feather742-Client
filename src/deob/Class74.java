package deob;

import jaggl.OpenGL;

public class Class74 {

	public int anInt634 = 0;

	public int anInt641 = 0;

	public int anInt632 = 1;

	public int anInt640 = 1;

	public Class471 aClass471_628 = new Class471();

	public boolean aBoolean635 = true;

	public boolean aBoolean636 = true;

	public boolean aBoolean631 = true;

	public boolean aBoolean638 = true;

	public Class36_Sub1[] aClass36_Sub1Array639 = new Class36_Sub1[2];

	public boolean aBoolean643 = false;

	public int anInt644 = 0;

	public Class86 aClass86_645 = Class86.aClass86_714;

	public Class_ra_Sub1 aClass_ra_Sub1_630;

	public Class76_Sub2_Sub2 aClass76_Sub2_Sub2_626;

	public Class76_Sub2_Sub2 aClass76_Sub2_Sub2_625;

	public Class76_Sub2_Sub2 aClass76_Sub2_Sub2_627;

	public Class330_Sub36_Sub17 aClass330_Sub36_Sub17_629;

	public Class330_Sub36_Sub17 aClass330_Sub36_Sub17_642;

	public Class36_Sub1 aClass36_Sub1_637;

	public boolean aBoolean633;

	public Class74(Class_ra_Sub1 arg0) {
		this.aClass_ra_Sub1_630 = arg0;
		if (this.aClass_ra_Sub1_630.aBoolean8429 && this.aClass_ra_Sub1_630.aBoolean8411) {
			this.aClass76_Sub2_Sub2_625 = this.aClass76_Sub2_Sub2_626 = new Class76_Sub2_Sub2(this.aClass_ra_Sub1_630);
			if (this.aClass_ra_Sub1_630.anInt8294 > 1 && this.aClass_ra_Sub1_630.aBoolean8413 && this.aClass_ra_Sub1_630.aBoolean8414) {
				this.aClass76_Sub2_Sub2_625 = this.aClass76_Sub2_Sub2_627 = new Class76_Sub2_Sub2(this.aClass_ra_Sub1_630);
			}
		}
	}

	public void method839() {
		this.aClass76_Sub2_Sub2_626 = null;
		this.aClass76_Sub2_Sub2_627 = null;
		this.aClass76_Sub2_Sub2_625 = null;
		this.aClass330_Sub36_Sub17_642 = null;
		this.aClass36_Sub1_637 = null;
		this.aClass36_Sub1Array639 = null;
		this.aClass330_Sub36_Sub17_629 = null;
		if (!this.aClass471_628.method5876(-910151095)) {
			for (Class330 var1 = this.aClass471_628.method5869(539664854); var1 != this.aClass471_628.aClass330_5611; var1 = var1.aClass330_3340) {
				((Class330_Sub19) var1).method3363();
			}
		}
		this.anInt640 = 1;
		this.anInt632 = 1;
	}

	public boolean method840() {
		return this.aClass76_Sub2_Sub2_625 != null;
	}

	public boolean method841() {
		if (this.aBoolean636) {
			if (this.aClass330_Sub36_Sub17_642 != null) {
				this.aClass330_Sub36_Sub17_642.method53();
				this.aClass330_Sub36_Sub17_642 = null;
			}
			if (this.aClass36_Sub1_637 != null) {
				this.aClass36_Sub1_637.method509();
				this.aClass36_Sub1_637 = null;
			}
		}
		if (this.aBoolean635) {
			if (this.aClass330_Sub36_Sub17_629 != null) {
				this.aClass330_Sub36_Sub17_629.method53();
				this.aClass330_Sub36_Sub17_629 = null;
			}
			if (this.aClass36_Sub1Array639[0] != null) {
				this.aClass36_Sub1Array639[0].method509();
				this.aClass36_Sub1Array639[0] = null;
			}
			if (this.aClass36_Sub1Array639[1] != null) {
				this.aClass36_Sub1Array639[1].method509();
				this.aClass36_Sub1Array639[1] = null;
			}
		}
		if (this.aBoolean636) {
			if (this.aClass76_Sub2_Sub2_627 != null) {
				this.aClass330_Sub36_Sub17_642 = new Class330_Sub36_Sub17(this.aClass_ra_Sub1_630, Class72.aClass72_610, Class86.aClass86_719, this.anInt632, this.anInt640, this.aClass_ra_Sub1_630.anInt8294);
			}
			if (this.aBoolean643) {
				this.aClass36_Sub1_637 = new Class36_Sub1(this.aClass_ra_Sub1_630, 34037, Class72.aClass72_610, Class86.aClass86_719, this.anInt632, this.anInt640);
			} else if (this.aClass330_Sub36_Sub17_642 == null) {
				this.aClass330_Sub36_Sub17_642 = new Class330_Sub36_Sub17(this.aClass_ra_Sub1_630, Class72.aClass72_610, Class86.aClass86_719, this.anInt632, this.anInt640);
			}
			this.aBoolean636 = false;
			this.aBoolean631 = true;
			this.aBoolean638 = true;
		}
		if (this.aBoolean635) {
			if (this.aClass76_Sub2_Sub2_627 != null) {
				this.aClass330_Sub36_Sub17_629 = new Class330_Sub36_Sub17(this.aClass_ra_Sub1_630, Class72.aClass72_620, this.aClass86_645, this.anInt632, this.anInt640, this.aClass_ra_Sub1_630.anInt8294);
			}
			this.aClass36_Sub1Array639[0] = new Class36_Sub1(this.aClass_ra_Sub1_630, 34037, Class72.aClass72_620, this.aClass86_645, this.anInt632, this.anInt640);
			this.aClass36_Sub1Array639[1] = this.anInt644 > 1 ? new Class36_Sub1(this.aClass_ra_Sub1_630, 34037, Class72.aClass72_620, this.aClass86_645, this.anInt632, this.anInt640) : null;
			this.aBoolean635 = false;
			this.aBoolean631 = true;
			this.aBoolean638 = true;
		}
		if (this.aBoolean631) {
			if (this.aClass76_Sub2_Sub2_627 == null) {
				this.aClass_ra_Sub1_630.method4785(this.aClass76_Sub2_Sub2_626, (byte) 1);
				this.aClass76_Sub2_Sub2_626.method900(null);
				this.aClass76_Sub2_Sub2_626.method901(0, null);
				this.aClass76_Sub2_Sub2_626.method901(1, null);
				this.aClass76_Sub2_Sub2_626.method901(0, this.aClass36_Sub1Array639[0].method523(0));
				this.aClass76_Sub2_Sub2_626.method901(1, this.anInt644 > 1 ? this.aClass36_Sub1Array639[1].method523(0) : null);
				if (this.aBoolean643) {
					this.aClass76_Sub2_Sub2_626.method900(this.aClass36_Sub1_637.method521(0));
				} else {
					this.aClass76_Sub2_Sub2_626.method900(this.aClass330_Sub36_Sub17_642);
				}
				this.aClass_ra_Sub1_630.method4802(this.aClass76_Sub2_Sub2_626, (byte) 0);
			} else {
				this.aClass_ra_Sub1_630.method4785(this.aClass76_Sub2_Sub2_626, (byte) 1);
				this.aClass76_Sub2_Sub2_626.method900(null);
				this.aClass76_Sub2_Sub2_626.method901(0, null);
				this.aClass76_Sub2_Sub2_626.method901(1, null);
				this.aClass76_Sub2_Sub2_626.method901(0, this.aClass36_Sub1Array639[0].method523(0));
				this.aClass76_Sub2_Sub2_626.method901(1, this.anInt644 > 1 ? this.aClass36_Sub1Array639[1].method523(0) : null);
				if (this.aBoolean643) {
					this.aClass76_Sub2_Sub2_626.method900(this.aClass36_Sub1_637.method521(0));
				}
				this.aClass_ra_Sub1_630.method4802(this.aClass76_Sub2_Sub2_626, (byte) 0);
				this.aClass_ra_Sub1_630.method4785(this.aClass76_Sub2_Sub2_627, (byte) 1);
				this.aClass76_Sub2_Sub2_627.method900(null);
				this.aClass76_Sub2_Sub2_627.method901(0, null);
				this.aClass76_Sub2_Sub2_627.method901(0, this.aClass330_Sub36_Sub17_629);
				this.aClass76_Sub2_Sub2_627.method900(this.aClass330_Sub36_Sub17_642);
				this.aClass_ra_Sub1_630.method4802(this.aClass76_Sub2_Sub2_627, (byte) 0);
			}
			this.aBoolean631 = false;
			this.aBoolean638 = true;
		}
		if (this.aBoolean638) {
			this.aClass_ra_Sub1_630.method4785(this.aClass76_Sub2_Sub2_625, (byte) 1);
			this.aBoolean638 = !this.aClass76_Sub2_Sub2_625.method902();
			this.aClass_ra_Sub1_630.method4802(this.aClass76_Sub2_Sub2_625, (byte) 0);
		}
		return !this.aBoolean638;
	}

	public boolean method842(int arg0, int arg1, int arg2, int arg3) {
		if (this.aClass76_Sub2_Sub2_625 == null || this.aClass471_628.method5876(718595951)) {
			return false;
		}
		if (this.anInt632 != arg2 || this.anInt640 != arg3) {
			this.anInt632 = arg2;
			this.anInt640 = arg3;
			for (Class330 var5 = this.aClass471_628.method5869(539664854); var5 != this.aClass471_628.aClass330_5611; var5 = var5.aClass330_3340) {
				((Class330_Sub19) var5).method3349(this.anInt632, this.anInt640);
			}
			this.aBoolean635 = true;
			this.aBoolean636 = true;
			this.aBoolean631 = true;
		}
		if (!this.method841()) {
			return false;
		}
		this.anInt634 = arg0;
		this.anInt641 = arg1;
		this.aBoolean633 = true;
		this.aClass_ra_Sub1_630.method4817(-this.anInt634, this.anInt640 + this.anInt641 - this.aClass_ra_Sub1_630.method4782((byte) 0).method857());
		this.aClass_ra_Sub1_630.method4785(this.aClass76_Sub2_Sub2_625, (byte) 1);
		this.aClass_ra_Sub1_630.ba(3, 0);
		this.aClass76_Sub2_Sub2_625.method918(0);
		return true;
	}

	public boolean method843(Class330_Sub19 arg0) {
		if (this.aClass76_Sub2_Sub2_625 != null) {
			if (arg0.method3345() || arg0.method3347()) {
				this.aClass471_628.method5878(arg0, (short) 8192);
				this.method846();
				if (this.method841()) {
					if (this.anInt632 != -1 && this.anInt640 != -1) {
						arg0.method3349(this.anInt632, this.anInt640);
					}
					arg0.aBoolean7646 = true;
					return true;
				}
			}
			this.method844(arg0);
		}
		return false;
	}

	public void method844(Class330_Sub19 arg0) {
		arg0.aBoolean7646 = false;
		arg0.method3363();
		arg0.method3252(808515459);
		this.method846();
	}

	public void method845() {
		if (!this.aBoolean633) {
			return;
		}
		if (this.aClass76_Sub2_Sub2_627 != null) {
			this.aClass_ra_Sub1_630.method4802(this.aClass76_Sub2_Sub2_627, (byte) 0);
			this.aClass_ra_Sub1_630.method4785(this.aClass76_Sub2_Sub2_626, (byte) 1);
			this.aClass76_Sub2_Sub2_626.method918(0);
			this.aClass76_Sub2_Sub2_627.method903(0, 0, this.anInt632, this.anInt640, 0, 0, true, this.aBoolean643);
		}
		this.aClass_ra_Sub1_630.method4838();
		this.aClass_ra_Sub1_630.method4859(0);
		this.aClass_ra_Sub1_630.method4836(1);
		this.aClass_ra_Sub1_630.L();
		int var1 = 0;
		int var2 = 1;
		Class330_Sub19 var3;
		for (Class330_Sub19 var4 = (Class330_Sub19) this.aClass471_628.method5869(539664854); var4 != null; var4 = var3) {
			var3 = (Class330_Sub19) this.aClass471_628.method5873((byte) -81);
			int var5 = var4.method3356();
			for (int var6 = 0; var6 < var5; var6++) {
				var4.method3352(var6, this.aClass36_Sub1Array639[var1], this.aClass36_Sub1_637);
				if (var3 == null && var6 == var5 - 1) {
					this.aClass_ra_Sub1_630.method4802(this.aClass76_Sub2_Sub2_626, (byte) 0);
					this.aClass_ra_Sub1_630.method4817(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt640);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt634, this.anInt641);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt634, this.anInt641 + this.anInt640);
					OpenGL.glTexCoord2f((float) this.anInt632, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt634 + this.anInt632, this.anInt641 + this.anInt640);
					OpenGL.glTexCoord2f((float) this.anInt632, (float) this.anInt640);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt634 + this.anInt632, this.anInt641);
					OpenGL.glEnd();
				} else {
					this.aClass76_Sub2_Sub2_626.method918(var2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt640);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, this.anInt640);
					OpenGL.glTexCoord2f((float) this.anInt632, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt632, this.anInt640);
					OpenGL.glTexCoord2f((float) this.anInt632, (float) this.anInt640);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt632, 0);
					OpenGL.glEnd();
				}
				var4.method3351(var6);
				var2 = var2 + 1 & 0x1;
				var1 = var1 + 1 & 0x1;
			}
		}
		this.aBoolean633 = false;
	}

	public void method846() {
		int var1 = 0;
		boolean var2 = false;
		Class86 var3 = Class86.aClass86_714;
		for (Class330_Sub19 var4 = (Class330_Sub19) this.aClass471_628.method5869(539664854); var4 != null; var4 = (Class330_Sub19) this.aClass471_628.method5873((byte) -6)) {
			Class86 var5 = var4.method3354();
			if (var5.anInt724 > var3.anInt724) {
				var3 = var5;
			}
			var2 |= var4.method3353();
			var1 += var4.method3356();
		}
		if (var3 != this.aClass86_645) {
			this.aClass86_645 = var3;
			this.aBoolean635 = true;
		}
		int var6 = this.anInt644 > 2 ? 2 : this.anInt644;
		int var7 = var1 > 2 ? 2 : var1;
		if (var6 != var7) {
			this.aBoolean635 = true;
			this.aBoolean631 = true;
		}
		if (var2 != this.aBoolean643) {
			this.aBoolean643 = var2;
			this.aBoolean636 = true;
		}
		this.anInt644 = var1;
	}
}
