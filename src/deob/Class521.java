package deob;

public class Class521 implements Interface22 {

	public int anInt6753;

	public int anInt6754;

	public int anInt6755;

	public int anInt6757;

	public int anInt6758;

	public int anInt6759;

	public boolean aBoolean6756;

	public boolean method287(Interface22 arg0) {
		try {
			if (!(arg0 instanceof Class521)) {
				return false;
			}
			Class521 var2 = (Class521) arg0;
			if (this.anInt6754 != var2.anInt6754) {
				return false;
			} else if (var2.anInt6759 != this.anInt6759) {
				return false;
			} else if (this.anInt6755 != var2.anInt6755) {
				return false;
			} else if (this.anInt6757 != var2.anInt6757) {
				return false;
			} else if (this.anInt6753 != var2.anInt6753) {
				return false;
			} else if (var2.anInt6758 == this.anInt6758) {
				return var2.aBoolean6756 == this.aBoolean6756;
			} else {
				return false;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "vn.j(" + ')');
		}
	}

	public long method288() {
		try {
			long[] var1 = Buffer.aLongArray7850;
			long var2 = -1L;
			long var5 = var2 >>> 8 ^ var1[(int) ((var2 ^ (long) this.anInt6754) & 0xFFL)];
			long var6 = var5 >>> 8 ^ var1[(int) ((var5 ^ (long) (this.anInt6759 >> 8)) & 0xFFL)];
			long var7 = var6 >>> 8 ^ var1[(int) ((var6 ^ (long) this.anInt6759) & 0xFFL)];
			long var8 = var7 >>> 8 ^ var1[(int) ((var7 ^ (long) (this.anInt6755 >> 24)) & 0xFFL)];
			long var9 = var8 >>> 8 ^ var1[(int) ((var8 ^ (long) (this.anInt6755 >> 16)) & 0xFFL)];
			long var10 = var9 >>> 8 ^ var1[(int) ((var9 ^ (long) (this.anInt6755 >> 8)) & 0xFFL)];
			long var11 = var10 >>> 8 ^ var1[(int) ((var10 ^ (long) this.anInt6755) & 0xFFL)];
			long var12 = var11 >>> 8 ^ var1[(int) ((var11 ^ (long) this.anInt6757) & 0xFFL)];
			long var13 = var12 >>> 8 ^ var1[(int) ((var12 ^ (long) (this.anInt6753 >> 24)) & 0xFFL)];
			long var14 = var13 >>> 8 ^ var1[(int) ((var13 ^ (long) (this.anInt6753 >> 16)) & 0xFFL)];
			long var15 = var14 >>> 8 ^ var1[(int) ((var14 ^ (long) (this.anInt6753 >> 8)) & 0xFFL)];
			long var16 = var15 >>> 8 ^ var1[(int) ((var15 ^ (long) this.anInt6753) & 0xFFL)];
			long var17 = var16 >>> 8 ^ var1[(int) ((var16 ^ (long) this.anInt6758) & 0xFFL)];
			return var17 >>> 8 ^ var1[(int) ((var17 ^ (long) (this.aBoolean6756 ? 1 : 0)) & 0xFFL)];
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "vn.r(" + ')');
		}
	}

	public long method286() {
		long[] var1 = Buffer.aLongArray7850;
		long var2 = -1L;
		long var4 = var2 >>> 8 ^ var1[(int) ((var2 ^ (long) (this.anInt6754 * -1801599599 * 829266801)) & 0xFFL)];
		long var5 = var4 >>> 8 ^ var1[(int) ((var4 ^ (long) (this.anInt6759 * -12920157 * 377596171 >> 8)) & 0xFFL)];
		long var6 = var5 >>> 8 ^ var1[(int) ((var5 ^ (long) (this.anInt6759 * 377596171 * -12920157)) & 0xFFL)];
		long var7 = var6 >>> 8 ^ var1[(int) ((var6 ^ (long) (this.anInt6755 * -1795225091 * -1215030443 >> 24)) & 0xFFL)];
		long var8 = var7 >>> 8 ^ var1[(int) ((var7 ^ (long) (this.anInt6755 * -1795225091 * -1215030443 >> 16)) & 0xFFL)];
		long var9 = var8 >>> 8 ^ var1[(int) ((var8 ^ (long) (this.anInt6755 * -1795225091 * -1215030443 >> 8)) & 0xFFL)];
		long var10 = var9 >>> 8 ^ var1[(int) ((var9 ^ (long) (this.anInt6755 * -1215030443 * -1795225091)) & 0xFFL)];
		long var11 = var10 >>> 8 ^ var1[(int) ((var10 ^ (long) (this.anInt6757 * -49408939 * -203011843)) & 0xFFL)];
		long var12 = var11 >>> 8 ^ var1[(int) ((var11 ^ (long) (this.anInt6753 * -94525101 * 638354139 >> 24)) & 0xFFL)];
		long var13 = var12 >>> 8 ^ var1[(int) ((var12 ^ (long) (this.anInt6753 * 638354139 * -94525101 >> 16)) & 0xFFL)];
		long var14 = var13 >>> 8 ^ var1[(int) ((var13 ^ (long) (this.anInt6753 * 638354139 * -94525101 >> 8)) & 0xFFL)];
		long var15 = var14 >>> 8 ^ var1[(int) ((var14 ^ (long) (this.anInt6753 * 638354139 * -94525101)) & 0xFFL)];
		long var16 = var15 >>> 8 ^ var1[(int) ((var15 ^ (long) (this.anInt6758 * -1549979751 * -530271063)) & 0xFFL)];
		return var16 >>> 8 ^ var1[(int) ((var16 ^ (long) (this.aBoolean6756 ? 1 : 0)) & 0xFFL)];
	}

	public boolean method289(Interface22 arg0) {
		if (!(arg0 instanceof Class521)) {
			return false;
		}
		Class521 var2 = (Class521) arg0;
		if (this.anInt6754 * 829266801 * -1801599599 != var2.anInt6754 * -1801599599 * 829266801) {
			return false;
		} else if (var2.anInt6759 * 377596171 * -12920157 != this.anInt6759 * 377596171 * -12920157) {
			return false;
		} else if (this.anInt6755 * -1215030443 * -1795225091 != var2.anInt6755 * -1215030443 * -1795225091) {
			return false;
		} else if (this.anInt6757 * -49408939 * -203011843 != var2.anInt6757 * -203011843 * -49408939) {
			return false;
		} else if (this.anInt6753 * -94525101 * 638354139 != var2.anInt6753 * -94525101 * 638354139) {
			return false;
		} else if (var2.anInt6758 * -1549979751 * -530271063 == this.anInt6758 * -530271063 * -1549979751) {
			return var2.aBoolean6756 == this.aBoolean6756;
		} else {
			return false;
		}
	}

	public static final void method6224(int arg0) {
		try {
			if (!client.aBoolean9074) {
				client.aFloat9124 += (12.0F - client.aFloat9124) / 2.0F;
				client.aBoolean9038 = true;
				client.aBoolean9074 = true;
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "vn.hf(" + ')');
		}
	}

	public static void method6225(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			Class330_Sub36_Sub3 var5 = Class464_Sub4.method5750(18, (long) arg1 << 32 | (long) arg0);
			var5.method3445((byte) 0);
			var5.anInt9629 = arg2;
			var5.anInt9626 = arg3;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "vn.bg(" + ')');
		}
	}
}
