package deob;

public class Class330_Sub26_Sub4 extends Class330_Sub26 {

	public int anInt9584 = -1;

	public byte aByte9583;

	public int anInt9581;

	public Class167 aClass167_9585;

	public String aString9582;

	public Class330_Sub26_Sub4(Class167 arg0) {
	}

	public void method3388(Buffer arg0, int arg1) {
		try {
			this.anInt9584 = arg0.readUnsignedShort(587975754);
			this.aByte9583 = arg0.readByte((byte) -24);
			this.anInt9581 = arg0.readUnsignedShort(1957129971);
			arg0.readLong(-1452160008);
			this.aString9582 = arg0.readString(-1636034263);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aiu.r(" + ')');
		}
	}

	public void method3391(Class330_Sub39 arg0) {
		Class153 var2 = arg0.aClass153Array7759[this.anInt9584 * 305981795 * -811868085];
		var2.aByte1632 = this.aByte9583;
		var2.anInt1631 = this.anInt9581 * 1544788037 * -462727465 * -1541463749;
		var2.aString1633 = this.aString9582;
	}

	public void method3389(Class330_Sub39 arg0, int arg1) {
		try {
			Class153 var3 = arg0.aClass153Array7759[this.anInt9584];
			var3.aByte1632 = this.aByte9583;
			var3.anInt1631 = this.anInt9581;
			var3.aString1633 = this.aString9582;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aiu.j(" + ')');
		}
	}

	public void method3387(Class330_Sub39 arg0) {
		Class153 var2 = arg0.aClass153Array7759[this.anInt9584 * 305981795 * -811868085];
		var2.aByte1632 = this.aByte9583;
		var2.anInt1631 = this.anInt9581 * 1544788037 * -462727465 * -1541463749;
		var2.aString1633 = this.aString9582;
	}

	public void method3390(Buffer arg0) {
		this.anInt9584 = arg0.readUnsignedShort(698430737) * 305981795 * -811868085;
		this.aByte9583 = arg0.readByte((byte) 60);
		this.anInt9581 = arg0.readUnsignedShort(716344699) * 1544788037 * -1158169971;
		arg0.readLong(31317552);
		this.aString9582 = arg0.readString(778677552);
	}

	public void method3392(Class330_Sub39 arg0) {
		Class153 var2 = arg0.aClass153Array7759[this.anInt9584 * 305981795 * -811868085];
		var2.aByte1632 = this.aByte9583;
		var2.anInt1631 = this.anInt9581 * 1544788037 * -462727465 * -1541463749;
		var2.aString1633 = this.aString9582;
	}

	public static final int method3397(int arg0, int arg1, byte arg2) {
		try {
			return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aiu.as(" + ')');
		}
	}
}
