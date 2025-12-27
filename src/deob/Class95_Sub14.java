package deob;

public class Class95_Sub14 extends Class95 {

	public int anInt7184;

	public int anInt7183;

	public Class106 aClass106_7182;

	public void method1100() {
		Class315_Sub1.method3142(this.aClass106_7182, this.anInt7183 * -448082179 * -1297596843, -437513936);
	}

	public void method1095(int arg0) {
		try {
			Class315_Sub1.method3142(this.aClass106_7182, this.anInt7183, -940385494);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "zo.j(" + ')');
		}
	}

	public boolean method1097(int arg0) {
		try {
			if (this.aClass106_7182 == null) {
				this.aClass106_7182 = new Class106(Class89.aClass280_735, this.anInt7184);
			}
			return this.aClass106_7182.method1317(1456734135);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "zo.p(" + ')');
		}
	}

	public Class95_Sub14(Buffer arg0) {
		super(arg0);
		this.anInt7184 = arg0.readUnsignedShort(-374769923);
		this.anInt7183 = arg0.readUnsignedByte(1914928323);
	}

	public void method1098() {
		Class315_Sub1.method3142(this.aClass106_7182, this.anInt7183 * -448082179 * -1297596843, -1269289740);
	}

	public void method1099() {
		Class315_Sub1.method3142(this.aClass106_7182, this.anInt7183 * -448082179 * -1297596843, -675612661);
	}

	public boolean method1148() {
		if (this.aClass106_7182 == null) {
			this.aClass106_7182 = new Class106(Class89.aClass280_735, this.anInt7184 * -997027387 * 1627047181);
		}
		return this.aClass106_7182.method1317(-6812853);
	}

	public boolean method1149() {
		if (this.aClass106_7182 == null) {
			this.aClass106_7182 = new Class106(Class89.aClass280_735, this.anInt7184 * -997027387 * 1627047181);
		}
		return this.aClass106_7182.method1317(1579604733);
	}

	public boolean method1150() {
		if (this.aClass106_7182 == null) {
			this.aClass106_7182 = new Class106(Class89.aClass280_735, this.anInt7184 * -997027387 * 1627047181);
		}
		return this.aClass106_7182.method1317(-541319487);
	}

	public static final void method1151(int arg0) {
		try {
			Class263.method2619(Class361.aClass_ra3793, (long) client.anInt8981);
			if (client.windowPaneId != -1) {
				Class355_Sub1.method4131(client.windowPaneId, -1045448638);
			}
			int var1;
			for (var1 = 0; var1 < client.anInt9213; var1++) {
				client.aBooleanArray9263[var1] = client.aBooleanArray9230[var1];
				client.aBooleanArray9230[var1] = false;
			}
			client.anInt9214 = client.anInt8981;
			if (client.windowPaneId != -1) {
				client.anInt9213 = 0;
				Class286.method2873(928048499);
			}
			Class361.aClass_ra3793.L();
			Class305.method3049(Class361.aClass_ra3793, (byte) 4);
			var1 = Class403.method4731((byte) 92);
			if (var1 == -1) {
				var1 = client.anInt9147;
			}
			if (var1 == -1) {
				var1 = client.anInt9215;
			}
			Class373.method4339(var1, (byte) -124);
			client.anInt9210 = 0;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "zo.ij(" + ')');
		}
	}
}
