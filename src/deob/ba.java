package deob;

@ObfuscatedName("ba")
public class ba extends Class_v implements Interface28 {

	public long nativeid;

	public ba(ja arg0, int arg1) {
		this.sa(arg0, arg1);
	}

	public void finalize() {
		try {
			if (this.nativeid != 0L) {
				Class71.method827(this, -729455472);
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "ba.finalize(" + ')');
		}
	}

	public void method3870() {
		if (this.nativeid != 0L) {
			Class71.method827(this, 1654691965);
		}
	}

	public void method3871() {
		if (this.nativeid != 0L) {
			Class71.method827(this, 224103144);
		}
	}

	@ObfuscatedName("ba.sa(Lja;I)V")
	public native void sa(ja arg0, int arg1);

	@ObfuscatedName("ba.ma(Z)V")
	public native void ma(boolean arg0);

	@ObfuscatedName("ba.ha()V")
	public native void ha();

	@ObfuscatedName("ba.j(Lja;I)V")
	public native void j(ja arg0, int arg1);

	@ObfuscatedName("ba.x(Z)V")
	public native void x(boolean arg0);

	@ObfuscatedName("ba.r(Lja;I)V")
	public native void r(ja arg0, int arg1);

	@ObfuscatedName("ba.o()V")
	public native void o();

	@ObfuscatedName("ba.i(Lja;I)V")
	public native void i(ja arg0, int arg1);

	@ObfuscatedName("ba.p()V")
	public native void p();

	@ObfuscatedName("ba.u()V")
	public native void u();

	@ObfuscatedName("ba.s()V")
	public native void s();
}
