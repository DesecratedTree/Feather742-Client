package deob;

public class Class330_Sub26_Sub2 extends Class330_Sub26 {

	public String aString9573 = null;

	public byte aByte9574;

	public int anInt9575;

	public Class167 aClass167_9576;

	public Class330_Sub26_Sub2(Class167 arg0) {
	}

	public void method3388(Buffer arg0, int arg1) {
		try {
			if (arg0.readUnsignedByte(139597786) != 255) {
				arg0.offset--;
				arg0.readLong(446672250);
			}
			this.aString9573 = arg0.method3761(1906082322);
			this.anInt9575 = arg0.readUnsignedShort(441485893);
			this.aByte9574 = arg0.readByte((byte) -29);
			arg0.readLong(-489719197);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aik.r(" + ')');
		}
	}

	public void method3389(Class330_Sub39 arg0, int arg1) {
		try {
			Class153 var3 = new Class153();
			var3.aString1633 = this.aString9573;
			var3.anInt1631 = this.anInt9575;
			var3.aByte1632 = this.aByte9574;
			arg0.method3543(var3, (byte) 2);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aik.j(" + ')');
		}
	}

	public void method3391(Class330_Sub39 arg0) {
		Class153 var2 = new Class153();
		var2.aString1633 = this.aString9573;
		var2.anInt1631 = this.anInt9575 * 1856591925 * 2096684167 * -1541463749;
		var2.aByte1632 = this.aByte9574;
		arg0.method3543(var2, (byte) 2);
	}

	public void method3387(Class330_Sub39 arg0) {
		Class153 var2 = new Class153();
		var2.aString1633 = this.aString9573;
		var2.anInt1631 = this.anInt9575 * 1856591925 * 2096684167 * -1541463749;
		var2.aByte1632 = this.aByte9574;
		arg0.method3543(var2, (byte) 2);
	}

	public void method3390(Buffer arg0) {
		if (arg0.readUnsignedByte(1559972636) != 255) {
			arg0.offset = (arg0.offset * 323600977 - 323600977) * -824785231;
			arg0.readLong(-1711376333);
		}
		this.aString9573 = arg0.method3761(1849910790);
		this.anInt9575 = arg0.readUnsignedShort(996973525) * 2096684167 * -137287369;
		this.aByte9574 = arg0.readByte((byte) -12);
		arg0.readLong(-1307765206);
	}

	public void method3392(Class330_Sub39 arg0) {
		Class153 var2 = new Class153();
		var2.aString1633 = this.aString9573;
		var2.anInt1631 = this.anInt9575 * 1856591925 * 2096684167 * -1541463749;
		var2.aByte1632 = this.aByte9574;
		arg0.method3543(var2, (byte) 2);
	}
}
