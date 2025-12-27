package deob;

@ObfuscatedName("oa")
public class oa implements Interface8_Impl1_Impl1, Interface28 {

	public long nativeid = 0L;

	public int anInt9292;

	public int anInt9293;

	public oa(int arg0, int arg1) {
		this.anInt9292 = arg0;
		this.anInt9293 = arg1;
		this.g(arg0, arg1);
	}

	public int method54() {
		return this.anInt9292;
	}

	public int method55() {
		return this.anInt9293;
	}

	public int method56() {
		return this.anInt9292;
	}

	@ObfuscatedName("oa.ma(Z)V")
	public void ma(boolean arg0) {
		this.za(this.nativeid, arg0);
	}

	public void method53() {
		this.ma(false);
	}

	public int method58() {
		return this.anInt9292;
	}

	public int method61() {
		return this.anInt9293;
	}

	public int method59() {
		return this.anInt9293;
	}

	public int method60() {
		return this.anInt9293;
	}

	public void method52() {
		this.ma(false);
	}

	public int method57() {
		return this.anInt9292;
	}

	@ObfuscatedName("oa.x(Z)V")
	public void x(boolean arg0) {
		this.za(this.nativeid, arg0);
	}

	public void method6480() {
		if (this.nativeid != 0L) {
			Class71.method827(this, 1579662665);
		}
	}

	public void finalize() {
		if (this.nativeid != 0L) {
			Class71.method827(this, 1513751064);
		}
	}

	public void method6481() {
		if (this.nativeid != 0L) {
			Class71.method827(this, 1948540448);
		}
	}

	@ObfuscatedName("oa.q(JZ)V")
	public native void q(long arg0, boolean arg1);

	@ObfuscatedName("oa.g(II)V")
	public native void g(int arg0, int arg1);

	@ObfuscatedName("oa.za(JZ)V")
	public native void za(long arg0, boolean arg1);

	@ObfuscatedName("oa.k(II)V")
	public native void k(int arg0, int arg1);

	@ObfuscatedName("oa.o(II)V")
	public native void o(int arg0, int arg1);

	@ObfuscatedName("oa.j(II)V")
	public native void j(int arg0, int arg1);
}
