package deob;

public class Class95_Sub17 extends Class95 {

	public int anInt7192;

	public int anInt7191;

	public static int anInt7193;

	public void method1098() {
		Class62.method767(this.anInt7192 * -907690349 * -818344037, 0, this.anInt7191 * 971787539 * 234063131, 1691835845);
	}

	public void method1100() {
		Class62.method767(this.anInt7192 * -907690349 * -818344037, 0, this.anInt7191 * 971787539 * 234063131, 55946479);
	}

	public Class95_Sub17(Buffer arg0) {
		super(arg0);
		this.anInt7192 = arg0.readUnsignedShort(667251924);
		this.anInt7191 = arg0.readUnsignedByte(-139914095);
	}

	public void method1095(int arg0) {
		try {
			Class62.method767(this.anInt7192, 0, this.anInt7191, 378178871);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "zr.j(" + ')');
		}
	}

	public void method1099() {
		Class62.method767(this.anInt7192 * -907690349 * -818344037, 0, this.anInt7191 * 971787539 * 234063131, 649227307);
	}

	public static final void method1158(Class432_Sub1_Sub1_Sub1 arg0, byte arg1) {
		try {
			int var2 = arg0.anInt10058 - client.anInt8981;
			int var3 = arg0.anInt10034 * 512 + arg0.method5453(-1588046513) * 256;
			int var4 = arg0.anInt10045 * 512 + arg0.method5453(-822870954) * 256;
			Class260 var5 = arg0.method5346().aClass260_2606;
			arg0.method5348((float) ((var3 - (int) var5.aFloat2716) / var2 + (int) var5.aFloat2716), (float) var5.aFloat2715, (float) ((int) var5.aFloat2711 + (var4 - (int) var5.aFloat2711) / var2));
			arg0.anInt10060 = 0;
			arg0.method5410(arg0.anInt10040, (byte) -45);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "zr.hd(" + ')');
		}
	}

	public static final void method1159(int arg0) {
		try {
			for (Class325_Sub1 var1 = (Class325_Sub1) client.aClass467_9096.method5853((byte) 12); var1 != null; var1 = (Class325_Sub1) client.aClass467_9096.method5853((byte) 4)) {
				Class149.method1760(var1, -128201692);
			}
			byte var5 = 0;
			byte var2 = 3;
			int var3;
			if (client.anInt8987 == 0) {
				for (var3 = var5; var3 <= var2; var3++) {
					client.method3919(var3);
				}
				client.method3920();
			} else {
				client.method3927();
				for (var3 = var5; var3 <= var2; var3++) {
					client.method3912();
					client.method3915(var3);
					client.method3919(var3);
				}
				client.method3916();
				client.method3920();
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "zr.ip(" + ')');
		}
	}

	public static final void method1160(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, byte arg3) {
		try {
			int var4 = arg2.anIntArray4387[--arg2.anInt4376];
			if (arg0.anInt1345 != var4) {
				if (var4 == -1) {
					arg0.aClass477_1344 = null;
				} else {
					if (arg0.aClass477_1344 == null) {
						arg0.aClass477_1344 = new Class477_Sub1();
					}
					arg0.aClass477_1344.method5988(var4, (byte) -23);
				}
				arg0.anInt1345 = var4;
				Class404.method4738(arg0, 2120775554);
			}
			if (arg0.anInt1287 == -1 && !arg1.aBoolean1402) {
				Class558.method6457(arg0.anInt1196, 694142557);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "zr.ej(" + ')');
		}
	}
}
