package deob;

public abstract class Class432_Sub1 extends Class432 {

	public Class356 aClass356_8655;

	public byte aByte8654;

	public byte aByte8658;

	public int anInt8657;

	public Class432_Sub1 aClass432_Sub1_8653;

	public Class80[] aClass80Array8656;

	public int method5359(int arg0) {
		try {
			return 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aex.fp(" + ')');
		}
	}

	public int method5363(int arg0) {
		try {
			return -this.method5370(-47698181);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aex.bc(" + ')');
		}
	}

	public int method5371(int arg0, int arg1, Class330_Sub14[] arg2, byte arg3) {
		try {
			long var5 = this.aClass356_8655.aLongArrayArrayArray3652[this.aByte8658][arg0][arg1];
			long var7 = 0L;
			int var9 = 0;
			int var10;
			while (var7 <= 48L) {
				var10 = (int) (var5 >> (int) var7 & 0xFFFFL);
				if (var10 <= 0) {
					break;
				}
				arg2[var9++] = this.aClass356_8655.aClass349Array3679[var10 - 1].aClass330_Sub14_3467;
				var7 += 16L;
			}
			for (var10 = var9; var10 < 4; var10++) {
				arg2[var10] = null;
			}
			return var9;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "aex.gd(" + ')');
		}
	}

	public void method5373(int arg0, int arg1) {
		try {
			this.aClass80Array8656 = new Class80[arg0];
			for (int var3 = 0; var3 < this.aClass80Array8656.length; var3++) {
				this.aClass80Array8656[var3] = new Class80();
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aex.gj(" + ')');
		}
	}

	public Class432_Sub1(Class356 arg0) {
		this.aClass356_8655 = arg0;
	}

	public abstract Class348 method5357(Class_ra arg0);

	public abstract boolean method5358(Class_ra arg0, int arg1, int arg2, int arg3);

	public abstract boolean method5360(short arg0);

	public abstract void method5361(Class_ra arg0);

	public abstract Class348 method5362(Class_ra arg0);

	public abstract int method5364();

	public abstract boolean method5365(Class_ra arg0);

	public abstract int method5366();

	public abstract boolean method5367(byte arg0);

	public abstract int method5368(Class330_Sub14[] arg0, byte arg1);

	public abstract void method5369(Class_ra arg0, Class432_Sub1 arg1, int arg2, int arg3, int arg4, boolean arg5);

	public abstract int method5370(int arg0);

	public abstract boolean method5372(Class_ra arg0, int arg1);

	public abstract boolean method5374();

	public abstract boolean method5375();

	public abstract boolean method5376();

	public abstract boolean method5377();

	public abstract boolean method5378();

	public abstract boolean method5379();

	public abstract Class353 method5380(Class_ra arg0);

	public abstract int method5381();

	public abstract boolean method5382(int arg0);

	public abstract Class348 method5383(Class_ra arg0, int arg1);

	public abstract void method5384();

	public abstract Class348 method5385(Class_ra arg0);

	public abstract Class348 method5386(Class_ra arg0);

	public abstract void method5387();

	public abstract Class348 method5388(Class_ra arg0);

	public abstract boolean method5389(Class_ra arg0, int arg1, int arg2);

	public abstract boolean method5390(Class_ra arg0, int arg1, int arg2);

	public abstract boolean method5391();

	public abstract void method5392(Class_ra arg0, Class432_Sub1 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6);

	public abstract void method5393(int arg0);

	public abstract int method5394();

	public abstract boolean method5395(int arg0);

	public abstract void method5396(Class_ra arg0, Class432_Sub1 arg1, int arg2, int arg3, int arg4, boolean arg5);

	public abstract void method5397(Class_ra arg0, Class432_Sub1 arg1, int arg2, int arg3, int arg4, boolean arg5);

	public abstract int method5398(Class330_Sub14[] arg0);

	public abstract int method5399(Class330_Sub14[] arg0);

	public abstract boolean method5400(Class_ra arg0);

	public abstract Class348 method5401(Class_ra arg0);

	public abstract boolean method5402(Class_ra arg0);

	public abstract boolean method5403();

	public abstract void method5404(Class_ra arg0, int arg1);

	public abstract Class353 method5405(Class_ra arg0, int arg1);
}
