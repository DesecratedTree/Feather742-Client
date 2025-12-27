package deob;

import java.math.BigInteger;

public class Class277 {

	public Class285 aClass285_2866;

	public Class267 aClass267_2862;

	public BigInteger aBigInteger2864;

	public BigInteger aBigInteger2865;

	public Class330_Sub36_Sub16_Sub2 aClass330_Sub36_Sub16_Sub2_2868;

	public Buffer aClass330_Sub46_2867;

	public Class282_Sub1[] aClass282_Sub1Array2863;

	public boolean method2731(int arg0) {
		try {
			if (this.aClass330_Sub46_2867 != null) {
				return true;
			}
			if (this.aClass330_Sub36_Sub16_Sub2_2868 == null) {
				if (this.aClass285_2866.method2833((byte) 2)) {
					return false;
				}
				this.aClass330_Sub36_Sub16_Sub2_2868 = this.aClass285_2866.method2832(255, 255, (byte) 0, true, (byte) -51);
			}
			if (this.aClass330_Sub36_Sub16_Sub2_2868.aBoolean9721) {
				return false;
			}
			Buffer var2 = new Buffer(this.aClass330_Sub36_Sub16_Sub2_2868.method3511(356740128));
			var2.offset = 5;
			int var3 = var2.readUnsignedByte(32868645);
			var2.offset += var3 * 72;
			byte[] var4 = new byte[var2.payload.length - var2.offset];
			var2.readBytes(var4, 0, var4.length, 1274334002);
			byte[] var5;
			if (this.aBigInteger2864 == null || this.aBigInteger2865 == null || ClientLoader.rsaDisabled) {
				var5 = var4;
			} else {
				BigInteger var6 = new BigInteger(var4);
				BigInteger var7 = var6.modPow(this.aBigInteger2864, this.aBigInteger2865);
				var5 = var7.toByteArray();
			}
			if (var5.length != 65) {
			}
			Class562.method6473(var2.payload, 5, var2.offset - var4.length - 5, (byte) -7);
			int var12;
			for (var12 = 0; var12 < 64; var12++) {
			}
			this.aClass330_Sub46_2867 = var2;
			if (this.aClass282_Sub1Array2863 == null) {
				this.aClass282_Sub1Array2863 = new Class282_Sub1[var3];
			} else {
				for (var12 = 0; var12 < this.aClass282_Sub1Array2863.length; var12++) {
					if (this.aClass282_Sub1Array2863[var12] != null) {
						this.aClass330_Sub46_2867.offset = var12 * 72 + 6;
						int var8 = this.aClass330_Sub46_2867.readInt((byte) 88);
						int var9 = this.aClass330_Sub46_2867.readInt((byte) 91);
						byte[] var10 = new byte[64];
						this.aClass330_Sub46_2867.readBytes(var10, 0, 64, 1274334002);
						this.aClass282_Sub1Array2863[var12].method2824(var8, var10, var9, -269584475);
					} else if (arg0 != 946379215) {
					}
				}
			}
			return true;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "ln.r(" + ')');
		}
	}

	public Class282_Sub1 method2732(int arg0, Class339 arg1, Class339 arg2, short arg3) {
		try {
			return this.method2733(arg0, arg1, arg2, true, -1856574829);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ln.j(" + ')');
		}
	}

	public Class282_Sub1 method2733(int arg0, Class339 arg1, Class339 arg2, boolean arg3, int arg4) {
		try {
			if (this.aClass330_Sub46_2867 == null) {
				throw new RuntimeException();
			} else if (arg0 < 0 || arg0 >= this.aClass282_Sub1Array2863.length) {
				throw new RuntimeException();
			} else if (this.aClass282_Sub1Array2863[arg0] == null) {
				this.aClass330_Sub46_2867.offset = arg0 * 72 + 6;
				int var6 = this.aClass330_Sub46_2867.readInt((byte) 121);
				int var7 = this.aClass330_Sub46_2867.readInt((byte) 26);
				byte[] var8 = new byte[64];
				this.aClass330_Sub46_2867.readBytes(var8, 0, 64, 1274334002);
				Class282_Sub1 var9 = new Class282_Sub1(arg0, arg1, arg2, this.aClass285_2866, this.aClass267_2862, var6, var8, var7, arg3);
				this.aClass282_Sub1Array2863[arg0] = var9;
				return var9;
			} else {
				return this.aClass282_Sub1Array2863[arg0];
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "ln.i(" + ')');
		}
	}

	public void method2734(int arg0) {
		try {
			if (this.aClass282_Sub1Array2863 != null) {
				int var2;
				for (var2 = 0; var2 < this.aClass282_Sub1Array2863.length; var2++) {
					if (this.aClass282_Sub1Array2863[var2] != null) {
						this.aClass282_Sub1Array2863[var2].method2815(-754236084);
					}
				}
				for (var2 = 0; var2 < this.aClass282_Sub1Array2863.length; var2++) {
					if (this.aClass282_Sub1Array2863[var2] != null) {
						this.aClass282_Sub1Array2863[var2].method2816((byte) 125);
					}
				}
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ln.p(" + ')');
		}
	}

	public Class277(Class285 arg0, Class267 arg1, BigInteger arg2, BigInteger arg3) {
		this.aClass285_2866 = arg0;
		this.aClass267_2862 = arg1;
		this.aBigInteger2864 = arg2;
		this.aBigInteger2865 = arg3;
		if (!this.aClass285_2866.method2833((byte) 2)) {
			this.aClass330_Sub36_Sub16_Sub2_2868 = this.aClass285_2866.method2832(255, 255, (byte) 0, true, (byte) -25);
		}
	}

	public static final void method2735(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			if (arg0.anIntArray4387[arg0.anInt4376] == arg0.anIntArray4387[arg0.anInt4376 + 1]) {
				arg0.anInt4397 += arg0.anIntArray4394[arg0.anInt4397];
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ln.v(" + ')');
		}
	}

	public static CacheIndex[] getCacheIndecies(int arg0) {
		try {
			return new CacheIndex[] { CacheIndex.aClass124_1426, CacheIndex.INDEX_10, CacheIndex.INDEX_27, CacheIndex.INDEX_20, CacheIndex.INDEX_13, CacheIndex.INDEX_11, CacheIndex.INDEX_3, CacheIndex.INDEX_12, CacheIndex.INDEX_18, CacheIndex.INDEX_6, CacheIndex.INDEX_15, CacheIndex.INDEX_14, CacheIndex.INDEX_9, CacheIndex.INDEX_22, CacheIndex.INDEX_35, CacheIndex.INDEX_23, CacheIndex.INDEX_2, CacheIndex.INDEX_28, CacheIndex.INDEX_7, CacheIndex.INDEX_29, CacheIndex.INDEX_30, CacheIndex.INDEX_17, CacheIndex.INDEX_37, CacheIndex.INDEX_33, CacheIndex.INDEX_8, CacheIndex.INDEX_4, CacheIndex.INDEX_5, CacheIndex.INDEX_19, CacheIndex.INDEX_16, CacheIndex.INDEX_31, CacheIndex.INDEX_1, CacheIndex.INDEX_36, CacheIndex.INDEX_25, CacheIndex.INDEX_32, CacheIndex.INDEX_24, CacheIndex.INDEX_21, CacheIndex.INDEX_34, CacheIndex.INDEX_26 };
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "ln.r(" + ')');
		}
	}
}
