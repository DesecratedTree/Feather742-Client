package deob;

public class Class330_Sub32 extends Class330 {

	public short[][] aShortArrayArray7725;

	public double aDouble7726;

	public Class330_Sub32(short[][] arg0, double arg1) {
		this.aShortArrayArray7725 = arg0;
		this.aDouble7726 = arg1;
	}

	public long method3433(int arg0) {
		try {
			return (long) (this.aShortArrayArray7725.length << 32 | this.aShortArrayArray7725[0].length);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "adm.r(" + ')');
		}
	}
}
