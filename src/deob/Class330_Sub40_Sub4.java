package deob;

public class Class330_Sub40_Sub4 extends Class330_Sub40 {

	public Class471 aClass471_9786 = new Class471();

	public Class471 aClass471_9787 = new Class471();

	public int anInt9789 = 0;

	public int anInt9788 = -1;

	public void method3683(Class330 arg0, Class330_Sub25 arg1) {
		while (arg0 != this.aClass471_9787.aClass330_5611 && ((Class330_Sub25) arg0).anInt7695 <= arg1.anInt7695) {
			arg0 = arg0.aClass330_3340;
		}
		Class511.method6186(arg1, arg0, -1884670110);
		this.anInt9788 = ((Class330_Sub25) this.aClass471_9787.aClass330_5611.aClass330_3340).anInt7695;
	}

	public final synchronized void method3684(Class330_Sub40 arg0) {
		this.aClass471_9786.method5880(arg0, -1684152681);
	}

	public final synchronized void method3685(Class330_Sub40 arg0) {
		arg0.method3252(-436003041);
	}

	public void method3686() {
		if (this.anInt9789 <= 0) {
			return;
		}
		for (Class330_Sub25 var1 = (Class330_Sub25) this.aClass471_9787.method5869(539664854); var1 != null; var1 = (Class330_Sub25) this.aClass471_9787.method5873((byte) -104)) {
			var1.anInt7695 -= this.anInt9789;
		}
		this.anInt9788 -= this.anInt9789;
		this.anInt9789 = 0;
	}

	public void method3687(int[] arg0, int arg1, int arg2) {
		for (Class330_Sub40 var4 = (Class330_Sub40) this.aClass471_9786.method5869(539664854); var4 != null; var4 = (Class330_Sub40) this.aClass471_9786.method5873((byte) -51)) {
			var4.method3563(arg0, arg1, arg2);
		}
	}

	public void method3688(Class330_Sub25 arg0) {
		arg0.method3252(-819246382);
		arg0.method3379();
		Class330 var2 = this.aClass471_9787.aClass330_5611.aClass330_3340;
		if (var2 == this.aClass471_9787.aClass330_5611) {
			this.anInt9788 = -1;
		} else {
			this.anInt9788 = ((Class330_Sub25) var2).anInt7695;
		}
	}

	public Class330_Sub40 method3558() {
		return (Class330_Sub40) this.aClass471_9786.method5873((byte) -91);
	}

	public Class330_Sub40 method3550() {
		return (Class330_Sub40) this.aClass471_9786.method5873((byte) -120);
	}

	public int method3562() {
		return 0;
	}

	public final synchronized void method3565(int[] arg0, int arg1, int arg2) {
		while (true) {
			if (this.anInt9788 < 0) {
				this.method3687(arg0, arg1, arg2);
			} else if (this.anInt9789 + arg2 < this.anInt9788) {
				this.anInt9789 += arg2;
				this.method3687(arg0, arg1, arg2);
			} else {
				int var4 = this.anInt9788 - this.anInt9789;
				this.method3687(arg0, arg1, var4);
				arg1 += var4;
				arg2 -= var4;
				this.anInt9789 += var4;
				this.method3686();
				Class330_Sub25 var5 = (Class330_Sub25) this.aClass471_9787.method5869(539664854);
				synchronized (var5) {
					int var7 = var5.method3386(this);
					if (var7 < 0) {
						var5.anInt7695 = 0;
						this.method3688(var5);
					} else {
						var5.anInt7695 = var7;
						this.method3683(var5.aClass330_3340, var5);
					}
				}
				if (arg2 != 0) {
					continue;
				}
			}
			return;
		}
	}

	public final synchronized void method3555(int arg0) {
		while (true) {
			if (this.anInt9788 < 0) {
				this.method3689(arg0);
			} else if (this.anInt9789 + arg0 < this.anInt9788) {
				this.anInt9789 += arg0;
				this.method3689(arg0);
			} else {
				int var2 = this.anInt9788 - this.anInt9789;
				this.method3689(var2);
				arg0 -= var2;
				this.anInt9789 += var2;
				this.method3686();
				Class330_Sub25 var3 = (Class330_Sub25) this.aClass471_9787.method5869(539664854);
				synchronized (var3) {
					int var5 = var3.method3386(this);
					if (var5 < 0) {
						var3.anInt7695 = 0;
						this.method3688(var3);
					} else {
						var3.anInt7695 = var5;
						this.method3683(var3.aClass330_3340, var3);
					}
				}
				if (arg0 != 0) {
					continue;
				}
			}
			return;
		}
	}

	public int method3553() {
		return 0;
	}

	public Class330_Sub40 method3556() {
		return (Class330_Sub40) this.aClass471_9786.method5869(539664854);
	}

	public Class330_Sub40 method3557() {
		return (Class330_Sub40) this.aClass471_9786.method5873((byte) -125);
	}

	public void method3689(int arg0) {
		for (Class330_Sub40 var2 = (Class330_Sub40) this.aClass471_9786.method5869(539664854); var2 != null; var2 = (Class330_Sub40) this.aClass471_9786.method5873((byte) -31)) {
			var2.method3555(arg0);
		}
	}

	public Class330_Sub40 method3559() {
		return (Class330_Sub40) this.aClass471_9786.method5873((byte) -107);
	}

	public int method3560() {
		return 0;
	}

	public int method3570() {
		return 0;
	}

	public Class330_Sub40 method3552() {
		return (Class330_Sub40) this.aClass471_9786.method5869(539664854);
	}

	public int method3554() {
		return 0;
	}

	public final synchronized void method3564(int[] arg0, int arg1, int arg2) {
		while (true) {
			if (this.anInt9788 < 0) {
				this.method3687(arg0, arg1, arg2);
			} else if (this.anInt9789 + arg2 < this.anInt9788) {
				this.anInt9789 += arg2;
				this.method3687(arg0, arg1, arg2);
			} else {
				int var4 = this.anInt9788 - this.anInt9789;
				this.method3687(arg0, arg1, var4);
				arg1 += var4;
				arg2 -= var4;
				this.anInt9789 += var4;
				this.method3686();
				Class330_Sub25 var5 = (Class330_Sub25) this.aClass471_9787.method5869(539664854);
				synchronized (var5) {
					int var7 = var5.method3386(this);
					if (var7 < 0) {
						var5.anInt7695 = 0;
						this.method3688(var5);
					} else {
						var5.anInt7695 = var7;
						this.method3683(var5.aClass330_3340, var5);
					}
				}
				if (arg2 != 0) {
					continue;
				}
			}
			return;
		}
	}

	public final synchronized void method3566(int arg0) {
		while (true) {
			if (this.anInt9788 < 0) {
				this.method3689(arg0);
			} else if (this.anInt9789 + arg0 < this.anInt9788) {
				this.anInt9789 += arg0;
				this.method3689(arg0);
			} else {
				int var2 = this.anInt9788 - this.anInt9789;
				this.method3689(var2);
				arg0 -= var2;
				this.anInt9789 += var2;
				this.method3686();
				Class330_Sub25 var3 = (Class330_Sub25) this.aClass471_9787.method5869(539664854);
				synchronized (var3) {
					int var5 = var3.method3386(this);
					if (var5 < 0) {
						var3.anInt7695 = 0;
						this.method3688(var3);
					} else {
						var3.anInt7695 = var5;
						this.method3683(var3.aClass330_3340, var3);
					}
				}
				if (arg0 != 0) {
					continue;
				}
			}
			return;
		}
	}

	public final synchronized void method3569(int arg0) {
		while (true) {
			if (this.anInt9788 < 0) {
				this.method3689(arg0);
			} else if (this.anInt9789 + arg0 < this.anInt9788) {
				this.anInt9789 += arg0;
				this.method3689(arg0);
			} else {
				int var2 = this.anInt9788 - this.anInt9789;
				this.method3689(var2);
				arg0 -= var2;
				this.anInt9789 += var2;
				this.method3686();
				Class330_Sub25 var3 = (Class330_Sub25) this.aClass471_9787.method5869(539664854);
				synchronized (var3) {
					int var5 = var3.method3386(this);
					if (var5 < 0) {
						var3.anInt7695 = 0;
						this.method3688(var3);
					} else {
						var3.anInt7695 = var5;
						this.method3683(var3.aClass330_3340, var3);
					}
				}
				if (arg0 != 0) {
					continue;
				}
			}
			return;
		}
	}

	public final synchronized void method3568(int arg0) {
		while (true) {
			if (this.anInt9788 < 0) {
				this.method3689(arg0);
			} else if (this.anInt9789 + arg0 < this.anInt9788) {
				this.anInt9789 += arg0;
				this.method3689(arg0);
			} else {
				int var2 = this.anInt9788 - this.anInt9789;
				this.method3689(var2);
				arg0 -= var2;
				this.anInt9789 += var2;
				this.method3686();
				Class330_Sub25 var3 = (Class330_Sub25) this.aClass471_9787.method5869(539664854);
				synchronized (var3) {
					int var5 = var3.method3386(this);
					if (var5 < 0) {
						var3.anInt7695 = 0;
						this.method3688(var3);
					} else {
						var3.anInt7695 = var5;
						this.method3683(var3.aClass330_3340, var3);
					}
				}
				if (arg0 != 0) {
					continue;
				}
			}
			return;
		}
	}

	public int method3561() {
		return 0;
	}

	public int method3567() {
		return 0;
	}
}
