package deob;

public class Class330_Sub28 extends Class330 {

	public static Class330_Sub28[] aClass330_Sub28Array7718 = new Class330_Sub28[0];

	public int anInt7716;

	public int anInt7714;

	public int anInt7717;

	public int anInt7719;

	public static int anInt7715;

	public Class260 method3400(int arg0) {
		try {
			return new Class260((float) this.anInt7714, (float) this.anInt7717, (float) this.anInt7719);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "adi.i(" + ')');
		}
	}

	public void method3401(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			this.anInt7716 = arg0;
			this.anInt7714 = arg1;
			this.anInt7717 = arg2;
			this.anInt7719 = arg3;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "adi.j(" + ')');
		}
	}

	public String toString() {
		try {
			return "Level: " + this.anInt7716 + " Coord: " + this.anInt7714 + "," + this.anInt7717 + "," + this.anInt7719 + " Coord Split: " + (this.anInt7714 >> 15) + "," + (this.anInt7719 >> 15) + "," + (this.anInt7714 >> 9 & 0x3F) + "," + (this.anInt7719 >> 9 & 0x3F) + "," + (this.anInt7714 & 0x1FF) + "," + (this.anInt7719 & 0x1FF);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "adi.toString(" + ')');
		}
	}

	public Class330_Sub28(int arg0, int arg1, int arg2, int arg3) {
		this.anInt7716 = arg0;
		this.anInt7714 = arg1;
		this.anInt7717 = arg2;
		this.anInt7719 = arg3;
	}
}
