package deob;

public class Class126_Sub2 extends Class126 {

	public Class249 aClass249_7226 = new Class249();

	public Class105 aClass105_7230;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7224;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7225;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7227;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7228;

	public static IndexTable aClass280_7229;

	public Class126_Sub2(Class_ra_Sub2 arg0) throws Exception_Sub2 {
		super(arg0);
		this.method1539(1018441152);
	}

	public boolean method1539(int arg0) throws Exception_Sub2 {
		try {
			this.aClass105_7230 = this.aClass_ra_Sub2_1463.method4888("Particle");
			this.aClass330_Sub15_Sub1_7227 = this.aClass105_7230.method1295("WVPMatrix", (byte) -52);
			this.aClass330_Sub15_Sub1_7225 = this.aClass105_7230.method1295("DiffuseSampler", (byte) -32);
			this.aClass330_Sub15_Sub1_7228 = this.aClass105_7230.method1295("TexCoordMatrix", (byte) 2);
			this.aClass330_Sub15_Sub1_7224 = this.aClass105_7230.method1295("DiffuseColour", (byte) -90);
			this.aClass105_7230.method1258(this.aClass105_7230.method1288((byte) 0));
			return true;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aau.z(" + ')');
		}
	}

	public void method1534(int arg0) {
		try {
			this.method1540((byte) -5);
			this.aClass_ra_Sub2_1463.method4987(Class199.aClass199_1926, 0, arg0 * 4, 0, arg0 * 2);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aau.j(" + ')');
		}
	}

	public void method1533() {
		try {
			this.method1540((byte) -89);
			this.aClass_ra_Sub2_1463.method4983();
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "aau.i(" + ')');
		}
	}

	public void method1540(byte arg0) {
		try {
			this.aClass105_7230.method1258(this.aClass105_7230.method1288((byte) 0));
			this.aClass105_7230.method1249();
			this.aClass105_7230.method1270(this.aClass330_Sub15_Sub1_7225, 0, this.anInterface11_Impl3_1461, (byte) 90);
			this.aClass105_7230.method1253(this.aClass330_Sub15_Sub1_7227, this.aClass249_7226, 1242099992);
			this.aClass105_7230.method1269(this.aClass330_Sub15_Sub1_7228, this.aClass249_1460, 93394716);
			this.aClass105_7230.method1268(this.aClass330_Sub15_Sub1_7224, this.anInt1462, (short) -24266);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aau.w(" + ')');
		}
	}

	public void method1535(Class249 arg0) {
		this.aClass249_7226.method2510(arg0);
		this.aClass249_7226.method2483(this.aClass_ra_Sub2_1463.aClass249_8493);
	}

	public void method1531(int arg0) {
		this.method1540((byte) -3);
		this.aClass_ra_Sub2_1463.method4987(Class199.aClass199_1926, 0, arg0 * 4, 0, arg0 * 2);
	}

	public void method1537() {
		this.method1540((byte) 0);
		this.aClass_ra_Sub2_1463.method4983();
	}

	public void method1532(Class249 arg0) {
		try {
			this.aClass249_7226.method2510(arg0);
			this.aClass249_7226.method2483(this.aClass_ra_Sub2_1463.aClass249_8493);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aau.r(" + ')');
		}
	}

	public void method1536(int arg0) {
		this.method1540((byte) 1);
		this.aClass_ra_Sub2_1463.method4987(Class199.aClass199_1926, 0, arg0 * 4, 0, arg0 * 2);
	}

	public static final void method1541(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class117 var3 = Class144.method1668(var2, (byte) 16);
			String var4 = "";
			if (var3 != null && var3.aString1384 != null) {
				var4 = var3.aString1384;
			}
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var4;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aau.ace(" + ')');
		}
	}
}
