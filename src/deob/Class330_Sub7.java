package deob;

public class Class330_Sub7 extends Class330 {

	public int anInt7546 = Integer.MAX_VALUE;

	public int anInt7553 = Integer.MIN_VALUE;

	public int anInt7548 = Integer.MAX_VALUE;

	public int anInt7545 = Integer.MIN_VALUE;

	public int anInt7549 = Integer.MAX_VALUE;

	public int anInt7550 = Integer.MIN_VALUE;

	public int anInt7551 = Integer.MAX_VALUE;

	public int anInt7547 = Integer.MIN_VALUE;

	public Class330_Sub38 aClass330_Sub38_7552;

	public Class330_Sub7(Class330_Sub38 arg0) {
		this.aClass330_Sub38_7552 = arg0;
	}

	public boolean method3277(int arg0, int arg1, short arg2) {
		try {
			if (arg0 >= this.anInt7546 && arg0 <= this.anInt7553 && arg1 >= this.anInt7548 && arg1 <= this.anInt7545) {
				return true;
			} else {
				return arg0 >= this.anInt7549 && arg0 <= this.anInt7550 && arg1 >= this.anInt7551 && arg1 <= this.anInt7547;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ack.r(" + ')');
		}
	}

	public static final void method3278(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			float var3 = Class257.method2541(arg0.anIntArray4387[arg0.anInt4376 + 1]);
			Class330_Sub36_Sub15 var4 = Class401_Sub1.aClass145_Sub1_8249.method1685(var2, 589484696);
			if (var4 == null) {
				throw new RuntimeException("");
			} else if (var4 instanceof Class330_Sub36_Sub15_Sub1) {
				((Class330_Sub36_Sub15_Sub1) var4).method3503(var3, 1464804253);
			} else {
				throw new RuntimeException("");
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ack.ais(" + ')');
		}
	}
}
