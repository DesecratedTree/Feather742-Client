package deob;

import java.awt.Canvas;

public abstract class Class76_Sub1_Sub3 extends Class76_Sub1 {

	public Canvas aCanvas9374;

	public Class_ra_Sub3 aClass_ra_Sub3_9375;

	public int anInt9379;

	public int anInt9373;

	public boolean aBoolean9378;

	public static boolean aBoolean9380;

	public float[] aFloatArray9376;

	public int[] anIntArray9377;

	public int method859() {
		return this.anInt9379 * -1841263963 * -287027923;
	}

	public final void method876(int arg0, int arg1) {
		try {
			if (arg0 != this.anInt9379 || arg1 != this.anInt9373) {
				this.anInt9379 = arg0;
				this.anInt9373 = arg1;
				this.method890((byte) 1);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ahz.ac(" + ')');
		}
	}

	public int method856() {
		try {
			return this.anInt9379;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "ahz.r(" + ')');
		}
	}

	public void method890(byte arg0) {
		try {
			this.anIntArray9377 = new int[this.anInt9379 * this.anInt9373];
			this.aFloatArray9376 = new float[this.anInt9373 * this.anInt9379];
			if (this.aBoolean9378) {
				this.aClass_ra_Sub3_9375.method5194(this.anInt9379, this.anInt9373, this.anIntArray9377, this.aFloatArray9376);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ahz.x(" + ')');
		}
	}

	public final boolean method865() {
		this.aBoolean9378 = false;
		return true;
	}

	public final boolean method862() {
		try {
			this.aBoolean9378 = false;
			return true;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "ahz.o(" + ')');
		}
	}

	public int method858() {
		return this.anInt9379 * -1841263963 * -287027923;
	}

	public Class76_Sub1_Sub3(Class_ra_Sub3 arg0, Canvas arg1, int arg2, int arg3) {
		this.aCanvas9374 = arg1;
		this.aClass_ra_Sub3_9375 = arg0;
		this.anInt9379 = arg2;
		this.anInt9373 = arg3;
	}

	public int method855() {
		return this.anInt9373 * -87922577 * -1203505521;
	}

	public int method861() {
		return this.anInt9373 * -87922577 * -1203505521;
	}

	public final boolean method176() {
		this.aClass_ra_Sub3_9375.method5194(this.anInt9379 * -1841263963 * -287027923, this.anInt9373 * -87922577 * -1203505521, this.anIntArray9377, this.aFloatArray9376);
		this.aBoolean9378 = true;
		return true;
	}

	public final boolean method182() {
		this.aClass_ra_Sub3_9375.method5194(this.anInt9379 * -1841263963 * -287027923, this.anInt9373 * -87922577 * -1203505521, this.anIntArray9377, this.aFloatArray9376);
		this.aBoolean9378 = true;
		return true;
	}

	public final boolean method178() {
		this.aClass_ra_Sub3_9375.method5194(this.anInt9379 * -1841263963 * -287027923, this.anInt9373 * -87922577 * -1203505521, this.anIntArray9377, this.aFloatArray9376);
		this.aBoolean9378 = true;
		return true;
	}

	public final boolean method174() {
		try {
			this.aClass_ra_Sub3_9375.method5194(this.anInt9379, this.anInt9373, this.anIntArray9377, this.aFloatArray9376);
			this.aBoolean9378 = true;
			return true;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "ahz.p(" + ')');
		}
	}

	public int method864() {
		return this.anInt9379 * -1841263963 * -287027923;
	}

	public final boolean method863() {
		this.aBoolean9378 = false;
		return true;
	}

	public int method860() {
		return this.anInt9373 * -87922577 * -1203505521;
	}

	public int method857() {
		try {
			return this.anInt9373;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "ahz.j(" + ')');
		}
	}

	public final void method882(int arg0, int arg1) {
		if (arg0 != this.anInt9379 * -1841263963 * -287027923 || arg1 != this.anInt9373 * -1203505521 * -87922577) {
			this.anInt9379 = arg0 * -1841263963 * -287027923;
			this.anInt9373 = arg1 * -87922577 * -1203505521;
			this.method890((byte) 1);
		}
	}

	public static final void method891(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 3;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			if (var3 == -1) {
				throw new RuntimeException();
			}
			Class506 var5 = Class211.aClass505_2062.method6140(var3, 1819989988);
			if (var2 != var5.aChar5921) {
				throw new RuntimeException();
			}
			int[] var6 = var5.method6147(var4, 16777472);
			int var7 = 0;
			if (var6 != null) {
				var7 = var6.length;
			}
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var7;
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "ahz.vv(" + ')');
		}
	}
}
