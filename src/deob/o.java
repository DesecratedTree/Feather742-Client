package deob;

@ObfuscatedName("o")
public class o extends Class76_Sub2 {

	public fa aFa9398 = null;

	public oa anOa9399 = null;

	public int anInt9401 = 0;

	public int anInt9397 = 0;

	public ja aJa9400;

	public o(ja arg0) {
		this.aJa9400 = arg0;
	}

	public void method910(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
		long var9 = 0L;
		long var11 = 0L;
		if (this.aFa9398 == null) {
			arg6 = false;
		} else {
			var9 = this.aFa9398.nativeid;
		}
		if (this.anOa9399 == null) {
			arg7 = false;
		} else {
			var11 = this.anOa9399.nativeid;
		}
		this.BA(this.aJa9400.nativeid, var9, var11, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public boolean method182() {
		this.aJa9400.d(this.aFa9398 == null ? 0L : this.aFa9398.nativeid, this.anOa9399 == null ? 0L : this.anOa9399.nativeid);
		return true;
	}

	public void method185() {
	}

	public boolean method174() {
		this.aJa9400.d(this.aFa9398 == null ? 0L : this.aFa9398.nativeid, this.anOa9399 == null ? 0L : this.anOa9399.nativeid);
		return true;
	}

	public boolean method862() {
		return true;
	}

	public void method900(Interface8_Impl1_Impl1 arg0) {
		if (this.aFa9398 != null && arg0 != null && (this.aFa9398.method54() != arg0.method54() || this.aFa9398.method55() != arg0.method55())) {
			throw new RuntimeException();
		}
		this.anOa9399 = (oa) arg0;
		if (arg0 != null) {
			this.anInt9401 = arg0.method54();
			this.anInt9397 = arg0.method55();
		} else if (this.aFa9398 == null) {
			this.anInt9401 = 0;
			this.anInt9397 = 0;
		}
		if (this.aJa9400.method4782((byte) 0) == this) {
			this.method174();
		}
	}

	public int method857() {
		return this.anInt9397;
	}

	public void method903(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
		long var9 = 0L;
		long var11 = 0L;
		if (this.aFa9398 == null) {
			arg6 = false;
		} else {
			var9 = this.aFa9398.nativeid;
		}
		if (this.anOa9399 == null) {
			arg7 = false;
		} else {
			var11 = this.anOa9399.nativeid;
		}
		this.BA(this.aJa9400.nativeid, var9, var11, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public boolean method176() {
		this.aJa9400.d(this.aFa9398 == null ? 0L : this.aFa9398.nativeid, this.anOa9399 == null ? 0L : this.anOa9399.nativeid);
		return true;
	}

	public int method864() {
		return this.anInt9401;
	}

	public int method858() {
		return this.anInt9401;
	}

	public int method859() {
		return this.anInt9401;
	}

	public int method860() {
		return this.anInt9397;
	}

	public int method856() {
		return this.anInt9401;
	}

	public void method179() {
	}

	public void method909(int arg0, Interface8_Impl1_Impl2 arg1) {
		if (arg0 != 0) {
			throw new RuntimeException();
		} else if (this.anOa9399 == null || arg1 == null || this.anOa9399.method54() == arg1.method54() && this.anOa9399.method55() == arg1.method55()) {
			this.aFa9398 = (fa) arg1;
			if (arg1 != null) {
				this.anInt9401 = arg1.method54();
				this.anInt9397 = arg1.method55();
			} else if (this.anOa9399 == null) {
				this.anInt9401 = 0;
				this.anInt9397 = 0;
			}
			if (this.aJa9400.method4782((byte) 0) == this) {
				this.method174();
			}
		} else {
			throw new RuntimeException();
		}
	}

	public void method905(int arg0, Interface8_Impl1_Impl2 arg1) {
		if (arg0 != 0) {
			throw new RuntimeException();
		} else if (this.anOa9399 == null || arg1 == null || this.anOa9399.method54() == arg1.method54() && this.anOa9399.method55() == arg1.method55()) {
			this.aFa9398 = (fa) arg1;
			if (arg1 != null) {
				this.anInt9401 = arg1.method54();
				this.anInt9397 = arg1.method55();
			} else if (this.anOa9399 == null) {
				this.anInt9401 = 0;
				this.anInt9397 = 0;
			}
			if (this.aJa9400.method4782((byte) 0) == this) {
				this.method174();
			}
		} else {
			throw new RuntimeException();
		}
	}

	public void method906(Interface8_Impl1_Impl1 arg0) {
		if (this.aFa9398 != null && arg0 != null && (this.aFa9398.method54() != arg0.method54() || this.aFa9398.method55() != arg0.method55())) {
			throw new RuntimeException();
		}
		this.anOa9399 = (oa) arg0;
		if (arg0 != null) {
			this.anInt9401 = arg0.method54();
			this.anInt9397 = arg0.method55();
		} else if (this.aFa9398 == null) {
			this.anInt9401 = 0;
			this.anInt9397 = 0;
		}
		if (this.aJa9400.method4782((byte) 0) == this) {
			this.method174();
		}
	}

	public boolean method899() {
		return true;
	}

	public void method183() {
	}

	public boolean method908() {
		return true;
	}

	public boolean method907() {
		return true;
	}

	public int method861() {
		return this.anInt9397;
	}

	public boolean method178() {
		this.aJa9400.d(this.aFa9398 == null ? 0L : this.aFa9398.nativeid, this.anOa9399 == null ? 0L : this.anOa9399.nativeid);
		return true;
	}

	public boolean method904() {
		return true;
	}

	public boolean method865() {
		return true;
	}

	public boolean method902() {
		return true;
	}

	public boolean method863() {
		return true;
	}

	public void method180() {
	}

	public void method181() {
	}

	public void method901(int arg0, Interface8_Impl1_Impl2 arg1) {
		if (arg0 != 0) {
			throw new RuntimeException();
		} else if (this.anOa9399 == null || arg1 == null || this.anOa9399.method54() == arg1.method54() && this.anOa9399.method55() == arg1.method55()) {
			this.aFa9398 = (fa) arg1;
			if (arg1 != null) {
				this.anInt9401 = arg1.method54();
				this.anInt9397 = arg1.method55();
			} else if (this.anOa9399 == null) {
				this.anInt9401 = 0;
				this.anInt9397 = 0;
			}
			if (this.aJa9400.method4782((byte) 0) == this) {
				this.method174();
			}
		} else {
			throw new RuntimeException();
		}
	}

	public int method855() {
		return this.anInt9397;
	}

	@ObfuscatedName("o.ai(JJJIIIIIIZZ)V")
	public native void ai(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);

	@ObfuscatedName("o.BA(JJJIIIIIIZZ)V")
	public native void BA(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);

	@ObfuscatedName("o.as(JJJIIIIIIZZ)V")
	public native void as(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);
}
