package deob;

public class Class348 {

	public int anInt3442;

	public int anInt3436;

	public int anInt3437;

	public int anInt3438;

	public int anInt3439;

	public int anInt3441;

	public int anInt3435;

	public int anInt3443;

	public int anInt3440;

	public int anInt3444;

	public boolean method4019(int arg0, int arg1, int arg2) {
		if (arg0 < this.anInt3439 || arg0 > this.anInt3441) {
			return false;
		} else if (arg1 < this.anInt3435 || arg1 > this.anInt3443) {
			return false;
		} else if (arg2 >= this.anInt3440 && arg2 <= this.anInt3444) {
			int var4 = arg0 - this.anInt3442;
			int var5 = arg2 - this.anInt3437;
			return var4 * var4 + var5 * var5 < this.anInt3438;
		} else {
			return false;
		}
	}

	public Class348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		this.anInt3442 = arg0;
		this.anInt3436 = arg1;
		this.anInt3437 = arg2;
		this.anInt3438 = arg3 * arg3;
		this.anInt3439 = this.anInt3442 + arg4;
		this.anInt3441 = this.anInt3442 + arg5;
		this.anInt3435 = this.anInt3436 + arg6;
		this.anInt3443 = this.anInt3436 + arg7;
		this.anInt3440 = this.anInt3437 + arg8;
		this.anInt3444 = this.anInt3437 + arg9;
	}

	public void method4020(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		this.anInt3442 = arg0;
		this.anInt3436 = arg1;
		this.anInt3437 = arg2;
		this.anInt3438 = arg3 * arg3;
		this.anInt3439 = this.anInt3442 + arg4;
		this.anInt3441 = this.anInt3442 + arg5;
		this.anInt3435 = this.anInt3436 + arg6;
		this.anInt3443 = this.anInt3436 + arg7;
		this.anInt3440 = this.anInt3437 + arg8;
		this.anInt3444 = this.anInt3437 + arg9;
	}
}
