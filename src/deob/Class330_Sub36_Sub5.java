package deob;

public class Class330_Sub36_Sub5 extends Class330_Sub36 {

	public int anInt9666;

	public static IndexTable aClass280_9664;

	public Class84[] aClass84Array9665;

	public byte[][] aByteArrayArray9663;

	public boolean method3458(int arg0) {
		try {
			if (this.aClass84Array9665 != null) {
				return true;
			}
			if (this.aByteArrayArray9663 == null) {
				IndexTable var2 = aClass280_9664;
				synchronized (aClass280_9664) {
					if (!aClass280_9664.method2777(this.anInt9666, (byte) 34)) {
						return false;
					}
					int[] var3 = aClass280_9664.method2762(this.anInt9666, (byte) -5);
					this.aByteArrayArray9663 = new byte[var3.length][];
					for (int var4 = 0; var4 < var3.length; var4++) {
						this.aByteArrayArray9663[var4] = aClass280_9664.getFile(this.anInt9666, var3[var4]);
					}
				}
			}
			boolean var17 = true;
			int var6;
			for (int var18 = 0; var18 < this.aByteArrayArray9663.length; var18++) {
				byte[] var20 = this.aByteArrayArray9663[var18];
				Buffer var5 = new Buffer(var20);
				var5.offset = 1;
				var6 = var5.readUnsignedShort(-92317940);
				IndexTable var7 = Class469.aClass280_5609;
				synchronized (Class469.aClass280_5609) {
					var17 &= Class469.aClass280_5609.method2750(var6, 496157488);
				}
			}
			if (!var17) {
				return false;
			}
			Class471 var19 = new Class471();
			IndexTable var22 = aClass280_9664;
			int[] var21;
			synchronized (aClass280_9664) {
				var6 = aClass280_9664.method2763(this.anInt9666, -2116078017);
				this.aClass84Array9665 = new Class84[var6];
				var21 = aClass280_9664.method2762(this.anInt9666, (byte) -36);
			}
			for (int var23 = 0; var23 < var21.length; var23++) {
				byte[] var24 = this.aByteArrayArray9663[var23];
				Buffer var25 = new Buffer(var24);
				var25.offset = 1;
				int var8 = var25.readUnsignedShort(1887268214);
				Class330_Sub18 var9 = null;
				for (Class330_Sub18 var10 = (Class330_Sub18) var19.method5869(539664854); var10 != null; var10 = (Class330_Sub18) var19.method5873((byte) -46)) {
					if (var10.anInt7633 == var8) {
						var9 = var10;
						break;
					}
				}
				if (var9 == null) {
					IndexTable var26 = Class469.aClass280_5609;
					synchronized (Class469.aClass280_5609) {
						var9 = new Class330_Sub18(var8, Class469.aClass280_5609.method2761(var8, 96349284));
					}
					var19.method5878(var9, (short) 8192);
				}
				this.aClass84Array9665[var21[var23]] = new Class84(var24, var9);
			}
			this.aByteArrayArray9663 = null;
			return true;
		} catch (RuntimeException var16) {
			throw Class476.method5964(var16, "ajc.j(" + ')');
		}
	}

	public Class330_Sub36_Sub5(int arg0) {
		this.anInt9666 = arg0;
	}

	public boolean method3459(int arg0, int arg1) {
		try {
			return this.aClass84Array9665[arg0].aBoolean699;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ajc.p(" + ')');
		}
	}

	public boolean method3460(int arg0, int arg1) {
		try {
			return this.aClass84Array9665[arg0].aBoolean700;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ajc.o(" + ')');
		}
	}

	public boolean method3461(int arg0, int arg1) {
		try {
			return this.aClass84Array9665[arg0].aBoolean698;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ajc.i(" + ')');
		}
	}

	public static void method3462(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, Class330_Sub36_Sub10 arg7, Class263 arg8, Class524 arg9, int arg10, int arg11, int arg12) {
		try {
			if (arg0 > arg2 && arg0 < arg2 + arg4 && arg1 > arg6 - arg9.anInt6033 - 1 && arg1 < arg9.anInt6035 + arg6 && arg7.aBoolean9692) {
				arg10 = arg11;
			}
			int[] var13 = Class22.method471(arg7, 1955685818);
			String var14 = Class50.method627(arg7, -170465427);
			if (var13 != null) {
				var14 = var14 + Class431.method5343(var13, -1461194327);
			}
			arg8.method2606(var14, arg2 + 3, arg6, arg10, 0, client.aRandom9066, Class382.anInt6680, Class_na.aClass61Array9725, Class444.anIntArray4495, -1490561740);
			if (arg7.aBoolean9696) {
				Class271.aClass61_2757.method687(arg2 + 5 + arg9.method6240(var14, -838393369), arg6 - arg9.anInt6033);
			}
		} catch (RuntimeException var15) {
			throw Class476.method5964(var15, "ajc.ar(" + ')');
		}
	}
}
