package deob;

public class Class95_Sub4 extends Class95 {

	public int anInt7136;

	public int anInt7137;

	public int anInt7138;

	public int anInt7139;

	public Class316 aClass316_7140;

	public void method1100() {
		this.aClass316_7140 = Class115.method1415(this.anInt7136 * 1521498731 * 1761321539, this.anInt7139 * -955780629 * 1162849987, 0, this.anInt7137 * 1640046189 * -49308827, this.anInt7138 * 2065618017 * -819802207, (byte) -1);
	}

	public void method1095(int arg0) {
		try {
			this.aClass316_7140 = Class115.method1415(this.anInt7136, this.anInt7139, 0, this.anInt7137, this.anInt7138, (byte) -1);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aaj.j(" + ')');
		}
	}

	public void method1096(int arg0) {
		try {
			if (this.aClass316_7140 != null) {
				OutgoingPacket.method2367(this.aClass316_7140, -1899021805);
				this.aClass316_7140 = null;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aaj.i(" + ')');
		}
	}

	public void method1115() {
		if (this.aClass316_7140 != null) {
			OutgoingPacket.method2367(this.aClass316_7140, -1191676273);
			this.aClass316_7140 = null;
		}
	}

	public void method1098() {
		this.aClass316_7140 = Class115.method1415(this.anInt7136 * 1521498731 * 1761321539, this.anInt7139 * -955780629 * 1162849987, 0, this.anInt7137 * 1640046189 * -49308827, this.anInt7138 * 2065618017 * -819802207, (byte) -1);
	}

	public void method1099() {
		this.aClass316_7140 = Class115.method1415(this.anInt7136 * 1521498731 * 1761321539, this.anInt7139 * -955780629 * 1162849987, 0, this.anInt7137 * 1640046189 * -49308827, this.anInt7138 * 2065618017 * -819802207, (byte) -1);
	}

	public void method1116() {
		if (this.aClass316_7140 != null) {
			OutgoingPacket.method2367(this.aClass316_7140, -1066973104);
			this.aClass316_7140 = null;
		}
	}

	public void method1117() {
		if (this.aClass316_7140 != null) {
			OutgoingPacket.method2367(this.aClass316_7140, 644429656);
			this.aClass316_7140 = null;
		}
	}

	public void method1118() {
		if (this.aClass316_7140 != null) {
			OutgoingPacket.method2367(this.aClass316_7140, -1118204377);
			this.aClass316_7140 = null;
		}
	}

	public void method1119() {
		if (this.aClass316_7140 != null) {
			OutgoingPacket.method2367(this.aClass316_7140, -2069508326);
			this.aClass316_7140 = null;
		}
	}

	public Class95_Sub4(Buffer arg0) {
		super(arg0);
		this.anInt7136 = arg0.readUnsignedShort(1158192536);
		this.anInt7137 = arg0.readUnsignedByte(-67544279);
		this.anInt7138 = arg0.readUnsignedByte(602997771);
		this.anInt7139 = arg0.readUnsignedByte(1549796556);
	}

	public static final void method1120(Class430 arg0, int arg1) {
		try {
			Class506.method6151((byte) 0);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aaj.ago(" + ')');
		}
	}

	public static final void method1121(Class430 arg0, byte arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			String var4 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			if (var2 == 99) {
				Class56.panelBoxMessage(var4, 922182874);
			} else if (var2 == 98) {
				Class154.method1821(var4, 1997365395);
			} else {
				Class556.method6406(var2, var3, "", "", "", var4, -2003361900);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aaj.tb(" + ')');
		}
	}
}
