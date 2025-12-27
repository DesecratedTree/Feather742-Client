package deob;

public class Exception_Sub1 extends Exception {

	public int anInt13;

	public Exception_Sub1(int arg0) {
		super("" + arg0);
		this.anInt13 = arg0;
	}

	public int method341(int arg0) {
		try {
			return this.anInt13;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "agd.r(" + ')');
		}
	}

	public static void method342(int arg0, int arg1) {
		try {
			Class111_Sub1.anInt7223 = arg0;
			Class330_Sub44_Sub2.aClass330_Sub44_Sub2Array9830 = new Class330_Sub44_Sub2[arg0];
			Class369.anInt6820 = 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "agd.al(" + ')');
		}
	}
}
