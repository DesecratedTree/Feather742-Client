package deob;

@ObfuscatedName("ea")
public class ea extends Class263 implements Interface28 {

	public long nativeid;

	public void method2604(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
		this.P(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public void finalize() {
		if (this.nativeid != 0L) {
			Class71.method827(this, 582868949);
		}
	}

	public ea(ja arg0, ba arg1, Class524 arg2, Class87_Sub2[] arg3, Class61[] arg4) {
		super(arg0, arg2);
		byte[][] var6 = new byte[arg3.length][];
		int[] var7 = new int[arg3.length];
		int[] var8 = new int[arg3.length];
		int[] var9 = new int[arg3.length];
		int[] var10 = new int[arg3.length];
		for (int var11 = 0; var11 < arg3.length; var11++) {
			Class87_Sub2 var12 = arg3[var11];
			if (var12.aByteArray7115 == null) {
				byte[] var13 = var12.aByteArray7114;
				byte[] var14 = var6[var11] = new byte[var13.length];
				for (int var15 = 0; var15 < var13.length; var15++) {
					var14[var15] = (byte) (var13[var15] == 0 ? 0 : -1);
				}
			} else {
				var6[var11] = var12.aByteArray7115;
			}
			var7[var11] = var12.anInt7112;
			var8[var11] = var12.anInt7107;
			var9[var11] = var12.anInt7109;
			var10[var11] = var12.anInt7111;
		}
		this.n(arg0, arg1, var6, var7, var8, var9, var10);
	}

	public void method2609(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
		this.P(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public void method2610(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
		this.P(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public void method2638() {
		if (this.nativeid != 0L) {
			Class71.method827(this, -263526615);
		}
	}

	public void method2639() {
		if (this.nativeid != 0L) {
			Class71.method827(this, 684387192);
		}
	}

	public void method2602(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
		this.P(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public void method2603(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
		this.P(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@ObfuscatedName("ea.n(Lja;Lba;[[B[I[I[I[I)V")
	public native void n(ja arg0, ba arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);

	@ObfuscatedName("ea.P(CIIIZLClass_ta;II)V")
	public native void P(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7);

	@ObfuscatedName("ea.bt(CIIIZLClass_ta;II)V")
	public native void bt(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7);

	@ObfuscatedName("ea.UA(CIIIZ)V")
	public native void UA(char arg0, int arg1, int arg2, int arg3, boolean arg4);

	@ObfuscatedName("ea.c(CIIIZ)V")
	public native void c(char arg0, int arg1, int arg2, int arg3, boolean arg4);

	@ObfuscatedName("ea.ma(Z)V")
	public native void ma(boolean arg0);

	@ObfuscatedName("ea.bc(CIIIZLClass_ta;II)V")
	public native void bc(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7);

	@ObfuscatedName("ea.x(Z)V")
	public native void x(boolean arg0);

	@ObfuscatedName("ea.bo(Lja;Lba;[[B[I[I[I[I)V")
	public native void bo(ja arg0, ba arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);
}
