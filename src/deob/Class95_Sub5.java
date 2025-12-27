package deob;

public class Class95_Sub5 extends Class95 {

	public int anInt7145;

	public int anInt7142;

	public int anInt7143;

	public int anInt7144;

	public int anInt7141;

	public static Class422 aClass422_7146;

	public Class95_Sub5(Buffer arg0) {
		super(arg0);
		this.anInt7145 = arg0.readUnsignedShort(1163437215);
		this.anInt7142 = arg0.readUnsignedShort(932455748);
		this.anInt7143 = arg0.readUnsignedShort(100248835);
		this.anInt7144 = arg0.readUnsignedShort(718225832);
		this.anInt7141 = arg0.readUnsignedShort(325840605);
	}

	public void method1095(int arg0) {
		try {
			Class437.method5587(this.anInt7145, this.anInt7143, this.anInt7142, 100, 100, false, (byte) 14);
			Class157.method1834(this.anInt7144, this.anInt7141, 0, (byte) -90);
			client.aBoolean9039 = true;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "zd.j(" + ')');
		}
	}

	public void method1100() {
		Class437.method5587(this.anInt7145 * -625289201 * 1544623855, this.anInt7143 * 625806505 * 1245075353, this.anInt7142 * 1921488835 * 1317966059, 100, 100, false, (byte) 14);
		Class157.method1834(this.anInt7144 * 1433260091 * -668169997, this.anInt7141 * 1280411749 * 415361389, 0, (byte) -68);
		client.aBoolean9039 = true;
	}

	public void method1098() {
		Class437.method5587(this.anInt7145 * -625289201 * 1544623855, this.anInt7143 * 625806505 * 1245075353, this.anInt7142 * 1921488835 * 1317966059, 100, 100, false, (byte) 14);
		Class157.method1834(this.anInt7144 * 1433260091 * -668169997, this.anInt7141 * 1280411749 * 415361389, 0, (byte) -78);
		client.aBoolean9039 = true;
	}

	public void method1099() {
		Class437.method5587(this.anInt7145 * -625289201 * 1544623855, this.anInt7143 * 625806505 * 1245075353, this.anInt7142 * 1921488835 * 1317966059, 100, 100, false, (byte) 14);
		Class157.method1834(this.anInt7144 * 1433260091 * -668169997, this.anInt7141 * 1280411749 * 415361389, 0, (byte) 54);
		client.aBoolean9039 = true;
	}

	public static void method1122(Buffer arg0, byte arg1) {
		try {
			int var2 = arg0.readSmart(-1328942451);
			Class315.aClass396Array3257 = new Class396[var2];
			int var3;
			for (var3 = 0; var3 < var2; var3++) {
				Class315.aClass396Array3257[var3] = new Class396();
				Class315.aClass396Array3257[var3].anInt4106 = arg0.readSmart(-328085595);
				Class315.aClass396Array3257[var3].aString4107 = arg0.readJagString((byte) 6);
			}
			Class125.anInt1458 = arg0.readSmart(-1898602598);
			Class509.anInt5946 = arg0.readSmart(-2086449085);
			Class398.anInt4118 = arg0.readSmart(49940895);
			Class132.aClass401_Sub1Array1505 = new Class401_Sub1[Class509.anInt5946 - Class125.anInt1458 + 1];
			for (var3 = 0; var3 < Class398.anInt4118; var3++) {
				int var4 = arg0.readSmart(-573404998);
				Class401_Sub1 var5 = Class132.aClass401_Sub1Array1505[var4] = new Class401_Sub1();
				var5.anInt4127 = arg0.readUnsignedByte(2140647806);
				var5.anInt4131 = arg0.readInt((byte) 10);
				var5.anInt8245 = Class125.anInt1458 + var4;
				var5.aString8246 = arg0.readJagString((byte) 6);
				var5.aString8247 = arg0.readJagString((byte) 6);
			}
			Class527.anInt6213 = arg0.readInt((byte) 16);
			Class398.aBoolean4117 = true;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "zd.i(" + ')');
		}
	}
}
