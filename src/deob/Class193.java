package deob;

public class Class193 {

	public long aLong1881;

	public int anInt1882;

	public Class193(Class191[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			this.method2133(arg0[var2]);
		}
	}

	public final void method2133(Class191 arg0) {
		this.aLong1881 |= arg0.anInt1875 << Class191.anInt1874 * this.anInt1882++;
	}

	public final Class191 method2134(int arg0) {
		return Class191.method2098(this.method2135(arg0));
	}

	public final int method2135(int arg0) {
		return (int) (this.aLong1881 >> Class191.anInt1874 * arg0) & 0xF;
	}

	public final int method2136() {
		return this.anInt1882;
	}

	public Class193(Class191 arg0) {
		this.aLong1881 = arg0.anInt1875;
		this.anInt1882 = 1;
	}
}
