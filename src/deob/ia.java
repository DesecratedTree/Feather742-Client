package deob;

@ObfuscatedName("ia")
public class ia extends Class263 implements Interface28 {

	public long nativeid;

	public void method2603(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
		this.GA(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public void finalize() {
		if (this.nativeid != 0L) {
			Class71.method827(this, 1920679800);
		}
	}

	public void method2609(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
		this.GA(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public void method2602(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
		this.GA(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public void method2604(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
		this.GA(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public void method2610(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
		this.GA(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public ia(ja arg0, ba arg1, Class524 arg2, Class87_Sub2[] arg3, Class61[] arg4) {
		super(arg0, arg2);
		byte[][] var6 = new byte[arg3.length][];
		int[] var7 = new int[arg3.length];
		int[] var8 = new int[arg3.length];
		int[] var9 = new int[arg3.length];
		int[] var10 = new int[arg3.length];
		for (int var11 = 0; var11 < arg3.length; var11++) {
			var6[var11] = arg3[var11].aByteArray7114;
			var7[var11] = arg3[var11].anInt7112;
			var8[var11] = arg3[var11].anInt7107;
			var9[var11] = arg3[var11].anInt7109;
			var10[var11] = arg3[var11].anInt7111;
		}
		this.EA(arg0, arg1, var6, arg3[0].anIntArray7113, var7, var8, var9, var10);
	}

	public void method2640() {
		if (this.nativeid != 0L) {
			Class71.method827(this, 36219741);
		}
	}

	public void method2641() {
		if (this.nativeid != 0L) {
			Class71.method827(this, 417897736);
		}
	}

	@ObfuscatedName("ia.EA(Lja;Lba;[[B[I[I[I[I[I)V")
	public native void EA(ja arg0, ba arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);

	@ObfuscatedName("ia.ma(Z)V")
	public native void ma(boolean arg0);

	@ObfuscatedName("ia.GA(CIIIZLClass_ta;II)V")
	public native void GA(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7);

	@ObfuscatedName("ia.c(CIIIZ)V")
	public native void c(char arg0, int arg1, int arg2, int arg3, boolean arg4);

	@ObfuscatedName("ia.UA(CIIIZ)V")
	public native void UA(char arg0, int arg1, int arg2, int arg3, boolean arg4);

	@ObfuscatedName("ia.x(Z)V")
	public native void x(boolean arg0);

	@ObfuscatedName("ia.n(Lja;Lba;[[B[I[I[I[I[I)V")
	public native void n(ja arg0, ba arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);

	@ObfuscatedName("ia.bo(CIIIZLClass_ta;II)V")
	public native void bo(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7);
}
