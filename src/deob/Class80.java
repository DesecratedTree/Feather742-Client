package deob;

public class Class80 {

	public boolean aBoolean671 = false;

	public int anInt668;

	public int anInt669;

	public int anInt670;

	public int anInt672;

	public int anInt673;

	public boolean method944(int arg0, int arg1) {
		if (!this.aBoolean671) {
			return false;
		}
		int var3 = this.anInt668 - this.anInt669;
		int var4 = this.anInt672 - this.anInt670;
		int var5 = var3 * var3 + var4 * var4;
		int var6 = arg0 * var3 + arg1 * var4 - (this.anInt669 * var3 + this.anInt670 * var4);
		int var7;
		int var8;
		if (var6 <= 0) {
			var7 = this.anInt669 - arg0;
			var8 = this.anInt670 - arg1;
			return var7 * var7 + var8 * var8 < this.anInt673 * this.anInt673;
		} else if (var6 > var5) {
			var7 = this.anInt668 - arg0;
			var8 = this.anInt672 - arg1;
			return var7 * var7 + var8 * var8 < this.anInt673 * this.anInt673;
		} else {
			var6 = (var6 << 10) / var5;
			var7 = this.anInt669 + (var3 * var6 >> 10) - arg0;
			var8 = this.anInt670 + (var4 * var6 >> 10) - arg1;
			return var7 * var7 + var8 * var8 < this.anInt673 * this.anInt673;
		}
	}
}
