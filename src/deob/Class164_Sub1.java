package deob;

public abstract class Class164_Sub1 extends Class164 {

	public static int anInt7291 = 2;

	public static Class249 aClass249_7303 = new Class249();

	public static int anInt7304 = 16;

	public static int anInt7307 = 1;

	public static int anInt7308 = 8;

	public static int anInt7309 = 4;

	public static int anInt7312 = 32;

	public static int anInt7313 = 64;

	public static int anInt7314 = 128;

	public float[] aFloatArray7319 = new float[3];

	public Class249[] aClass249Array7296;

	public int anInt7297;

	public Class105 aClass105_7310;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7290;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7292;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7293;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7294;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7295;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7298;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7299;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7300;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7301;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7302;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7305;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7306;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7311;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7315;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7317;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7318;

	public int[] anIntArray7316;

	public Class164_Sub1(Class_ra_Sub2 arg0) {
		super(arg0);
		new Class247();
		this.aClass249Array7296 = new Class249[this.aClass_ra_Sub2_1694.anInt8592];
		for (int var2 = 0; var2 < this.aClass_ra_Sub2_1694.anInt8592; var2++) {
			this.aClass249Array7296[var2] = new Class249();
		}
	}

	public boolean method1939(String arg0) throws Exception_Sub2 {
		this.aClass105_7310 = this.aClass_ra_Sub2_1694.method4888(arg0);
		if (this.aClass105_7310 == null) {
			throw new Exception_Sub2("");
		}
		this.aClass330_Sub15_Sub1_7302 = this.aClass105_7310.method1281("textureMatrix", 1127792137);
		this.aClass330_Sub15_Sub1_7292 = this.aClass105_7310.method1281("modelMatrix", 1237342142);
		this.aClass330_Sub15_Sub1_7293 = this.aClass105_7310.method1281("viewMatrix", 922359377);
		this.aClass330_Sub15_Sub1_7294 = this.aClass105_7310.method1281("projectionMatrix", 1245346601);
		this.aClass330_Sub15_Sub1_7311 = this.aClass105_7310.method1281("modelViewMatrix", 1173788295);
		this.aClass330_Sub15_Sub1_7290 = this.aClass105_7310.method1281("modelViewProjectionMatrix", 960752334);
		this.aClass330_Sub15_Sub1_7298 = this.aClass105_7310.method1281("viewProjectionMatrix", 1904475018);
		this.aClass330_Sub15_Sub1_7318 = this.aClass105_7310.method1281("ambientColour", 1384095237);
		this.aClass330_Sub15_Sub1_7305 = this.aClass105_7310.method1281("sunDirection", 1723848401);
		this.aClass330_Sub15_Sub1_7317 = this.aClass105_7310.method1281("sunColour", 1472463865);
		this.aClass330_Sub15_Sub1_7315 = this.aClass105_7310.method1281("antiSunColour", 1315593513);
		this.aClass330_Sub15_Sub1_7306 = this.aClass105_7310.method1281("sunExponent", 1143626242);
		this.aClass330_Sub15_Sub1_7299 = this.aClass105_7310.method1281("eyePosition", 1541057655);
		this.aClass330_Sub15_Sub1_7300 = this.aClass105_7310.method1281("eyePositionOS", 1228113707);
		this.aClass330_Sub15_Sub1_7301 = this.aClass105_7310.method1281("sunDirectionOS", 1570458094);
		if (this.method1938()) {
			if (this.aClass105_7310.method1259(870714971) == null) {
				Class123 var2 = this.aClass105_7310.method1288((byte) 0);
				if (var2 == null) {
					throw new Exception_Sub2(this.aClass105_7310.method1252((byte) -4) + "");
				}
				this.aClass105_7310.method1258(var2);
			}
			this.anInt7297 = this.aClass105_7310.method1255((byte) -8);
			this.anIntArray7316 = new int[this.anInt7297];
			return true;
		}
		this.aClass105_7310 = null;
		this.aClass330_Sub15_Sub1_7302 = null;
		this.aClass330_Sub15_Sub1_7292 = null;
		this.aClass330_Sub15_Sub1_7293 = null;
		this.aClass330_Sub15_Sub1_7294 = null;
		this.aClass330_Sub15_Sub1_7311 = null;
		this.aClass330_Sub15_Sub1_7290 = null;
		this.aClass330_Sub15_Sub1_7298 = null;
		this.aClass330_Sub15_Sub1_7318 = null;
		this.aClass330_Sub15_Sub1_7305 = null;
		this.aClass330_Sub15_Sub1_7317 = null;
		this.aClass330_Sub15_Sub1_7315 = null;
		this.aClass330_Sub15_Sub1_7306 = null;
		this.aClass330_Sub15_Sub1_7299 = null;
		this.aClass330_Sub15_Sub1_7300 = null;
		this.aClass330_Sub15_Sub1_7301 = null;
		return false;
	}

	public void method1931() {
		if (this.aClass105_7310 != null) {
			this.aClass105_7310.method1250();
		}
	}

	public void method1940(Class249 arg0) {
		if (this.aClass105_7310 == null || !this.aClass105_7310.method1251() || this.aClass_ra_Sub2_1694.method4954() != 0) {
			return;
		}
		int var2 = this.aClass105_7310.method1260((short) 27185);
		if ((this.anIntArray7316[var2] & 0x80) != 0 && this.aClass330_Sub15_Sub1_7302 != null) {
			this.aClass105_7310.method1269(this.aClass330_Sub15_Sub1_7302, arg0, -152358546);
			this.anIntArray7316[var2] &= 0xFFFFFF7F;
		}
	}

	public void method1941() {
		if (this.aClass105_7310 == null || !this.aClass105_7310.method1251()) {
			return;
		}
		int var1 = this.aClass105_7310.method1260((short) 19206);
		int var2 = this.anIntArray7316[var1];
		if ((var2 & 0x1) != 0 && this.aClass330_Sub15_Sub1_7292 != null) {
			this.aClass105_7310.method1253(this.aClass330_Sub15_Sub1_7292, this.aClass_ra_Sub2_1694.method4980(), -54774495);
		}
		if ((var2 & 0x2) != 0) {
			if (this.aClass330_Sub15_Sub1_7293 != null) {
				this.aClass105_7310.method1253(this.aClass330_Sub15_Sub1_7293, this.aClass_ra_Sub2_1694.method4915(), -420655007);
			}
			if (this.aClass330_Sub15_Sub1_7299 != null) {
				this.aFloatArray7319[0] = 0.0F;
				this.aFloatArray7319[1] = 0.0F;
				this.aFloatArray7319[2] = 0.0F;
				this.aClass_ra_Sub2_1694.cq().method2469(this.aFloatArray7319[0], this.aFloatArray7319[1], this.aFloatArray7319[2], this.aFloatArray7319);
				this.aClass105_7310.method1263(this.aClass330_Sub15_Sub1_7299, this.aFloatArray7319[0], this.aFloatArray7319[1], this.aFloatArray7319[2], 1581561530);
			}
		}
		if ((var2 & 0x10) != 0 && this.aClass330_Sub15_Sub1_7311 != null) {
			this.aClass105_7310.method1253(this.aClass330_Sub15_Sub1_7311, this.aClass_ra_Sub2_1694.method4920(), -1834178160);
		}
		if ((var2 & 0x8) != 0 && this.aClass330_Sub15_Sub1_7295 != null) {
			this.aClass105_7310.method1253(this.aClass330_Sub15_Sub1_7295, this.aClass_ra_Sub2_1694.method4916(), -1022846009);
		}
		if ((var2 & 0x4) != 0 && this.aClass330_Sub15_Sub1_7294 != null) {
			this.aClass105_7310.method1253(this.aClass330_Sub15_Sub1_7294, this.aClass_ra_Sub2_1694.method4922(), 862135127);
		}
		if ((var2 & 0x20) != 0 && this.aClass330_Sub15_Sub1_7290 != null) {
			aClass249_7303.method2484(this.aClass_ra_Sub2_1694.method4920(), this.aClass_ra_Sub2_1694.method4922());
			this.aClass105_7310.method1253(this.aClass330_Sub15_Sub1_7290, aClass249_7303, -1935813097);
		}
		if ((var2 & 0x40) != 0 && this.aClass330_Sub15_Sub1_7298 != null) {
			aClass249_7303.method2484(this.aClass_ra_Sub2_1694.method4915(), this.aClass_ra_Sub2_1694.method4922());
			this.aClass105_7310.method1253(this.aClass330_Sub15_Sub1_7298, aClass249_7303, -1253759497);
		}
		if (this.aClass_ra_Sub2_1694.method4954() == 0 && (this.anIntArray7316[var1] & 0x80) != 0 && this.aClass330_Sub15_Sub1_7302 != null) {
			this.aClass105_7310.method1269(this.aClass330_Sub15_Sub1_7302, this.aClass_ra_Sub2_1694.method5008(), 440604844);
			this.anIntArray7316[var1] &= 0xFFFFFF7F;
		}
		this.anIntArray7316[var1] = 0;
	}

	public void method1942(int arg0, Class247 arg1) {
		if (this.aClass330_Sub15_Sub1_7300 == null) {
			return;
		}
		Class249 var3 = this.aClass_ra_Sub2_1694.method4916();
		float[] var4 = new float[] { var3.aFloatArray2631[12], var3.aFloatArray2631[13], var3.aFloatArray2631[14] };
		float[] var5 = new float[] { 0.0F, 0.0F, 0.0F };
		var3.method2482(var5);
		float[] var6 = new float[] { 0.0F, 0.0F, 0.0F };
		this.aClass_ra_Sub2_1694.cq().method2465(0.0F, 0.0F, 0.0F, var6);
		arg1.method2470(var4);
		this.aClass105_7310.method1263(this.aClass330_Sub15_Sub1_7300, var4[0], var4[1], var4[2], 1397514283);
	}

	public void method1943(boolean arg0) {
		if (this.aClass105_7310 == null || !this.aClass105_7310.method1251()) {
			return;
		}
		if (this.aClass330_Sub15_Sub1_7318 != null) {
			this.aClass105_7310.method1263(this.aClass330_Sub15_Sub1_7318, this.aClass_ra_Sub2_1694.aFloat8530 * this.aClass_ra_Sub2_1694.aFloat8533, this.aClass_ra_Sub2_1694.aFloat8500 * this.aClass_ra_Sub2_1694.aFloat8533, this.aClass_ra_Sub2_1694.aFloat8532 * this.aClass_ra_Sub2_1694.aFloat8533, 1111659654);
		}
		if (this.aClass330_Sub15_Sub1_7305 != null) {
			this.aClass105_7310.method1263(this.aClass330_Sub15_Sub1_7305, this.aClass_ra_Sub2_1694.aFloatArray8525[0], this.aClass_ra_Sub2_1694.aFloatArray8525[1], this.aClass_ra_Sub2_1694.aFloatArray8525[2], 1647060285);
		}
		if (this.aClass330_Sub15_Sub1_7317 != null) {
			this.aClass105_7310.method1263(this.aClass330_Sub15_Sub1_7317, this.aClass_ra_Sub2_1694.aFloat8530 * this.aClass_ra_Sub2_1694.aFloat8489, this.aClass_ra_Sub2_1694.aFloat8500 * this.aClass_ra_Sub2_1694.aFloat8489, this.aClass_ra_Sub2_1694.aFloat8532 * this.aClass_ra_Sub2_1694.aFloat8489, -1696258946);
		}
		if (this.aClass330_Sub15_Sub1_7315 != null) {
			this.aClass105_7310.method1263(this.aClass330_Sub15_Sub1_7315, -this.aClass_ra_Sub2_1694.aFloat8530 * this.aClass_ra_Sub2_1694.aFloat8535, -this.aClass_ra_Sub2_1694.aFloat8500 * this.aClass_ra_Sub2_1694.aFloat8535, -this.aClass_ra_Sub2_1694.aFloat8532 * this.aClass_ra_Sub2_1694.aFloat8535, 1575103287);
		}
		if (this.aClass330_Sub15_Sub1_7306 != null) {
			this.aClass105_7310.method1301(this.aClass330_Sub15_Sub1_7306, Math.abs(this.aClass_ra_Sub2_1694.aFloatArray8525[1]) * 928.0F + 64.0F, (byte) -67);
		}
	}

	public void method1944(int arg0) {
		for (int var2 = 0; var2 < this.anInt7297; var2++) {
			this.anIntArray7316[var2] |= 0x80 << arg0;
		}
	}

	public void method1945() {
		this.method1943(this.aClass_ra_Sub2_1694.aBoolean8522);
		this.method1940(this.aClass_ra_Sub2_1694.method5008());
		this.method1941();
		this.method1929();
	}

	public void method1933() {
		this.method1946(Class247.aClass247_2621);
	}

	public void method1935() {
		if (this.aClass105_7310 != null) {
			this.aClass105_7310.method1250();
		}
	}

	public void method1929() {
	}

	public void method1936() {
		this.aClass105_7310.method1249();
		this.anIntArray7316[this.aClass105_7310.method1260((short) 28737)] = -1;
		this.method1949(0);
		this.method1945();
	}

	public void method1934() {
		if (this.aClass105_7310 != null) {
			this.aClass105_7310.method1250();
		}
	}

	public void method1946(Class247 arg0) {
		Class249 var2 = this.aClass_ra_Sub2_1694.aClass249_8576;
		var2.method2508(arg0);
		int var3 = this.aClass105_7310.method1260((short) 21807);
		if (this.aClass330_Sub15_Sub1_7292 != null) {
			this.aClass105_7310.method1253(this.aClass330_Sub15_Sub1_7292, var2, -1562833230);
			this.anIntArray7316[var3] &= 0xFFFFFFFE;
		}
		if (this.aClass330_Sub15_Sub1_7311 != null) {
			aClass249_7303.method2484(var2, this.aClass_ra_Sub2_1694.method4915());
			this.aClass105_7310.method1253(this.aClass330_Sub15_Sub1_7311, aClass249_7303, 936693781);
			this.anIntArray7316[var3] &= 0xFFFFFFEF;
		}
		if (this.aClass330_Sub15_Sub1_7290 != null) {
			aClass249_7303.method2484(var2, this.aClass_ra_Sub2_1694.method4921());
			this.aClass105_7310.method1253(this.aClass330_Sub15_Sub1_7290, aClass249_7303, -535740538);
			this.anIntArray7316[var3] &= 0xFFFFFFDF;
		}
		this.method1942(var3, arg0);
		this.method1948(var3, arg0);
	}

	public void method1937() {
		this.method1946(Class247.aClass247_2621);
	}

	public void method1948(int arg0, Class247 arg1) {
		if (this.aClass330_Sub15_Sub1_7301 != null) {
			float[] var3 = new float[] { this.aClass_ra_Sub2_1694.aFloatArray8525[0], this.aClass_ra_Sub2_1694.aFloatArray8525[1], this.aClass_ra_Sub2_1694.aFloatArray8525[2] };
			arg1.method2471(var3);
			this.aClass105_7310.method1263(this.aClass330_Sub15_Sub1_7301, var3[0], var3[1], var3[2], -148619825);
		}
	}

	public void method1949(int arg0) {
		this.aClass249Array7296[0].method2516();
		this.method1944(arg0);
	}

	public void method1950() {
	}

	public void method1951() {
	}

	public void method1928() {
		this.aClass105_7310.method1249();
		this.anIntArray7316[this.aClass105_7310.method1260((short) 18204)] = -1;
		this.method1949(0);
		this.method1945();
	}

	public abstract boolean method1938() throws Exception_Sub2;

	public abstract boolean method1947() throws Exception_Sub2;
}
