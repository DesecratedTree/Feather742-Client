package deob;

import java.io.IOException;

public class Class95_Sub11 extends Class95 {

	public static Class296 aClass296_7171;

	public static IndexTable aClass280_7172;

	public static IndexTable clientScriptMap;

	public void method1100() {
		Class10.method426(true, 609697129);
	}

	public void method1099() {
		Class10.method426(true, 609697129);
	}

	public void method1095(int arg0) {
		try {
			Class10.method426(true, 609697129);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "zk.j(" + ')');
		}
	}

	public void method1098() {
		Class10.method426(true, 609697129);
	}

	public Class95_Sub11(Buffer arg0) {
		super(arg0);
	}

	public static void method1129(int arg0, int arg1, int arg2) {
		try {
			if (Class110.anInt1152 != 0) {
				if (arg0 < 0) {
					for (int var3 = 0; var3 < 16; var3++) {
						Class85.anIntArray711[var3] = arg1;
					}
				} else {
					Class85.anIntArray711[arg0] = arg1;
				}
			}
			Class110.aClass330_Sub40_Sub2_1155.method3589(arg0, arg1, 1311262507);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "zk.z(" + ')');
		}
	}

	public static void method1130(byte arg0) {
		try {
			Class490 var1 = null;
			try {
				var1 = Preferences.loadPreferences("2", client.aClass435_9146.aString4422, false, 833381223);
				byte[] var2 = new byte[(int) var1.method6066(1742373643)];
				int var3;
				for (int var4 = 0; var4 < var2.length; var4 += var3) {
					var3 = var1.method6067(var2, var4, var2.length - var4, (byte) 14);
					if (var3 == -1) {
						throw new IOException();
					}
				}
				Class102.method1225(new Buffer(var2), -1430716501);
			} catch (Exception var6) {
			}
			try {
				if (var1 != null) {
					var1.method6064(-476721617);
				}
			} catch (Exception var5) {
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "zk.l(" + ')');
		}
	}

	public static final void method1131(Class430 arg0, byte arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = (var2 & 0x1 << var3) == 0 ? 0 : 1;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "zk.zm(" + ')');
		}
	}
}
