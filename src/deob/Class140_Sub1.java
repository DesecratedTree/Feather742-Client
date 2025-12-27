package deob;

public class Class140_Sub1 extends Class140 {

	public static int anInt7231 = 17;

	public static int anInt7233 = 1;

	public static int anInt7234 = 2;

	public static int anInt7235 = 1;

	public static int anInt7236 = 4;

	public static int anInt7237 = 7;

	public static int anInt7238 = 0;

	public static int anInt7239 = 1;

	public static int anInt7240 = 8;

	public static int anInt7242 = 10;

	public static int anInt7243 = 11;

	public static int anInt7244 = 12;

	public static int anInt7245 = 13;

	public static int anInt7246 = 14;

	public static int anInt7247 = 15;

	public static int anInt7248 = 16;

	public static int anInt7249 = 2;

	public static int anInt7250 = 19;

	public static int anInt7251 = 0;

	public static int anInt7252 = 9;

	public static int anInt7253 = 7;

	public static int anInt7254 = 1;

	public static int anInt7255 = 17;

	public static int anInt7256 = 18;

	public static int anInt7257 = 6;

	public static int anInt7258 = 12;

	public Class249 aClass249_7241 = new Class249();

	public Class123[] aClass123Array7259 = new Class123[19];

	public int[][] anIntArrayArray7260 = new int[19][17];

	public Class105 aClass105_7232;

	public static Class285 aClass285_7263;

	public int[] anIntArray7261;

	public static int[][] anIntArrayArray7262;

	public Class140_Sub1(Class_ra_Sub2 arg0) throws Exception_Sub2 {
		super(arg0);
		this.method1641(1547284360);
	}

	public void method1625(boolean arg0) {
		if (arg0) {
			this.aClass105_7232.method1258(this.aClass123Array7259[1]);
		} else {
			this.aClass105_7232.method1258(this.aClass123Array7259[0]);
		}
		this.anIntArray7261 = this.anIntArrayArray7260[this.aClass105_7232.method1260((short) 22739)];
		this.aClass105_7232.method1249();
		this.aClass105_7232.method1277(this.anIntArray7261[2], 0, this.anInterface11_Impl3_1540, 339394112);
		this.aClass105_7232.method1276(this.anIntArray7261[4], this.aClass249_7241, (byte) 35);
		this.aClass105_7232.method1275(this.anIntArray7261[5], this.aClass249_1546, 2140754749);
		this.aClass105_7232.method1272(this.anIntArray7261[7], this.aClass261_1551.aFloat2717, this.aClass261_1551.aFloat2718, this.aClass261_1551.aFloat2720, this.aClass261_1551.aFloat2719, 238527799);
		this.aClass105_7232.method1271(this.anIntArray7261[8], this.aClass260_1547.aFloat2716, this.aClass260_1547.aFloat2715, this.aClass260_1547.aFloat2711, 782692983);
		this.aClass105_7232.method1272(this.anIntArray7261[9], this.aClass261_1548.aFloat2717, this.aClass261_1548.aFloat2718, this.aClass261_1548.aFloat2720, this.aClass261_1548.aFloat2719, -191951282);
		this.aClass105_7232.method1271(this.anIntArray7261[10], this.aClass260_1549.aFloat2716, this.aClass260_1549.aFloat2715, this.aClass260_1549.aFloat2711, 1740466656);
		this.aClass_ra_Sub2_1537.method4987(Class199.aClass199_1926, this.anInt1555 * 25568277 * -634746051, this.anInt1556, this.anInt1557 * -1431655765 * 3, this.anInt1552);
	}

	public boolean method1641(int arg0) throws Exception_Sub2 {
		try {
			this.aClass105_7232 = this.aClass_ra_Sub2_1537.method4888("Model");
			Class330_Sub15_Sub1 var2 = this.aClass105_7232.method1295("DiffuseSampler", (byte) -8);
			Class330_Sub15_Sub1 var3 = this.aClass105_7232.method1295("EnvironmentSampler", (byte) -94);
			Class330_Sub15_Sub1 var4 = this.aClass105_7232.method1295("PointLightsPosAndRadiusSq", (byte) -68);
			Class330_Sub15_Sub1 var5 = this.aClass105_7232.method1295("PointLightsDiffuseColour", (byte) -38);
			Class330_Sub15_Sub1 var6 = this.aClass105_7232.method1295("WVPMatrix", (byte) -90);
			Class330_Sub15_Sub1 var7 = this.aClass105_7232.method1295("TexCoordMatrix", (byte) -95);
			Class330_Sub15_Sub1 var8 = this.aClass105_7232.method1295("HeightFogPlane", (byte) -40);
			Class330_Sub15_Sub1 var9 = this.aClass105_7232.method1295("HeightFogColour", (byte) -33);
			Class330_Sub15_Sub1 var10 = this.aClass105_7232.method1295("DistanceFogPlane", (byte) -69);
			Class330_Sub15_Sub1 var11 = this.aClass105_7232.method1295("DistanceFogColour", (byte) -76);
			Class330_Sub15_Sub1 var12 = this.aClass105_7232.method1295("SunDir", (byte) -114);
			Class330_Sub15_Sub1 var13 = this.aClass105_7232.method1295("SunColour", (byte) -15);
			Class330_Sub15_Sub1 var14 = this.aClass105_7232.method1295("AntiSunColour", (byte) -1);
			Class330_Sub15_Sub1 var15 = this.aClass105_7232.method1295("AmbientColour", (byte) -55);
			Class330_Sub15_Sub1 var16 = this.aClass105_7232.method1295("EyePos", (byte) -113);
			Class330_Sub15_Sub1 var17 = this.aClass105_7232.method1295("SpecularExponent", (byte) -123);
			Class330_Sub15_Sub1 var18 = this.aClass105_7232.method1295("WorldMatrix", (byte) -73);
			this.aClass123Array7259[0] = this.aClass105_7232.method1254("Unlit", 2030539961);
			this.aClass123Array7259[1] = this.aClass105_7232.method1254("Unlit_IgnoreAlpha", -1588159107);
			this.aClass123Array7259[17] = this.aClass105_7232.method1254("UnderwaterGround", 1501625474);
			this.aClass123Array7259[18] = this.aClass105_7232.method1254("UnderwaterGroundSpecular", 660160270);
			int var19;
			for (var19 = 0; var19 <= 4; var19++) {
				this.aClass123Array7259[var19 + 2] = this.aClass105_7232.method1254("Standard_" + var19 + "PointLights", -40580657);
				this.aClass123Array7259[var19 + 7] = this.aClass105_7232.method1254("Specular_" + var19 + "PointLights", -2108981766);
				this.aClass123Array7259[var19 + 12] = this.aClass105_7232.method1254("EnvironmentalMapping_" + var19 + "PointLights", -361394437);
			}
			for (var19 = 0; var19 < 19; var19++) {
				int var20 = this.aClass105_7232.method1297(this.aClass123Array7259[var19], -835070531);
				this.anIntArrayArray7260[var19][2] = var2.method3328(var20);
				this.anIntArrayArray7260[var19][3] = var3.method3328(var20);
				this.anIntArrayArray7260[var19][1] = var4.method3328(var20);
				this.anIntArrayArray7260[var19][0] = var5.method3328(var20);
				this.anIntArrayArray7260[var19][4] = var6.method3328(var20);
				this.anIntArrayArray7260[var19][5] = var7.method3328(var20);
				this.anIntArrayArray7260[var19][7] = var8.method3328(var20);
				this.anIntArrayArray7260[var19][8] = var9.method3328(var20);
				this.anIntArrayArray7260[var19][9] = var10.method3328(var20);
				this.anIntArrayArray7260[var19][10] = var11.method3328(var20);
				this.anIntArrayArray7260[var19][11] = var12.method3328(var20);
				this.anIntArrayArray7260[var19][12] = var13.method3328(var20);
				this.anIntArrayArray7260[var19][13] = var14.method3328(var20);
				this.anIntArrayArray7260[var19][14] = var15.method3328(var20);
				this.anIntArrayArray7260[var19][6] = var16.method3328(var20);
				this.anIntArrayArray7260[var19][15] = var18.method3328(var20);
				this.anIntArrayArray7260[var19][16] = var17.method3328(var20);
			}
			this.aClass105_7232.method1258(this.aClass123Array7259[2]);
			return true;
		} catch (RuntimeException var21) {
			throw Class476.method5964(var21, "aad.ac(" + ')');
		}
	}

	public void method1637() {
		this.aClass105_7232.method1258(this.aClass123Array7259[17]);
		this.anIntArray7261 = this.anIntArrayArray7260[this.aClass105_7232.method1260((short) 16123)];
		this.aClass105_7232.method1249();
		this.method1642(0, 958214782);
	}

	public void method1640() {
		try {
			this.aClass105_7232.method1258(this.aClass123Array7259[17]);
			this.anIntArray7261 = this.anIntArrayArray7260[this.aClass105_7232.method1260((short) 13463)];
			this.aClass105_7232.method1249();
			this.method1642(0, -1291318167);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "aad.f(" + ')');
		}
	}

	public void method1642(int arg0, int arg1) {
		try {
			this.aClass105_7232.method1277(this.anIntArray7261[2], 0, this.anInterface11_Impl3_1540, 456948631);
			this.aClass105_7232.method1276(this.anIntArray7261[4], this.aClass249_7241, (byte) -47);
			this.aClass105_7232.method1275(this.anIntArray7261[5], this.aClass249_1546, 1091527861);
			this.aClass105_7232.method1272(this.anIntArray7261[7], this.aClass261_1551.aFloat2717, this.aClass261_1551.aFloat2718, this.aClass261_1551.aFloat2720, this.aClass261_1551.aFloat2719, -160430548);
			this.aClass105_7232.method1271(this.anIntArray7261[8], this.aClass260_1547.aFloat2716, this.aClass260_1547.aFloat2715, this.aClass260_1547.aFloat2711, 705762425);
			this.aClass105_7232.method1272(this.anIntArray7261[9], this.aClass261_1548.aFloat2717, this.aClass261_1548.aFloat2718, this.aClass261_1548.aFloat2720, this.aClass261_1548.aFloat2719, -1092345873);
			this.aClass105_7232.method1271(this.anIntArray7261[10], this.aClass260_1549.aFloat2716, this.aClass260_1549.aFloat2715, this.aClass260_1549.aFloat2711, 1922047705);
			this.aClass105_7232.method1257(this.anIntArray7261[11], this.aClass260_1542, (byte) 18);
			this.aClass105_7232.method1257(this.anIntArray7261[12], this.aClass260_1544, (byte) 8);
			this.aClass105_7232.method1257(this.anIntArray7261[13], this.aClass260_1543, (byte) 70);
			this.aClass105_7232.method1257(this.anIntArray7261[14], this.aClass260_1553, (byte) -67);
			if (arg0 > 0) {
				this.aClass105_7232.method1274(this.anIntArray7261[1], this.aFloatArray1539, arg0 * 4, -1094674830);
				this.aClass105_7232.method1274(this.anIntArray7261[0], this.aFloatArray1538, arg0 * 4, -396516896);
			}
			this.aClass_ra_Sub2_1537.method4987(Class199.aClass199_1926, this.anInt1555, this.anInt1556, this.anInt1557, this.anInt1552);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aad.al(" + ')');
		}
	}

	public void method1620(int arg0) {
		try {
			this.aClass105_7232.method1258(this.aClass123Array7259[arg0 + 2]);
			this.anIntArray7261 = this.anIntArrayArray7260[this.aClass105_7232.method1260((short) 25445)];
			this.aClass105_7232.method1249();
			this.method1642(arg0, -639338987);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aad.p(" + ')');
		}
	}

	public void method1635(int arg0) {
		this.aClass105_7232.method1258(this.aClass123Array7259[arg0 + 12]);
		this.anIntArray7261 = this.anIntArrayArray7260[this.aClass105_7232.method1260((short) 6407)];
		this.aClass105_7232.method1249();
		this.aClass105_7232.method1290(this.anIntArray7261[15], this.aClass249_1554, 16711680);
		this.aClass105_7232.method1271(this.anIntArray7261[6], this.aClass260_1536.aFloat2716, this.aClass260_1536.aFloat2715, this.aClass260_1536.aFloat2711, 1471000575);
		this.aClass105_7232.method1277(this.anIntArray7261[3], 1, this.anInterface11_Impl1_1550, 1821365610);
		this.method1642(arg0, -156623319);
	}

	public void method1626(Class249 arg0) {
		this.aClass249_7241.method2510(arg0);
		this.aClass249_7241.method2483(this.aClass_ra_Sub2_1537.aClass249_8493);
	}

	public void method1634() {
		this.aClass105_7232.method1258(this.aClass123Array7259[17]);
		this.anIntArray7261 = this.anIntArrayArray7260[this.aClass105_7232.method1260((short) 16962)];
		this.aClass105_7232.method1249();
		this.method1642(0, -61559458);
	}

	public void method1616(int arg0) {
		this.aClass105_7232.method1258(this.aClass123Array7259[arg0 + 2]);
		this.anIntArray7261 = this.anIntArrayArray7260[this.aClass105_7232.method1260((short) 26333)];
		this.aClass105_7232.method1249();
		this.method1642(arg0, 496311991);
	}

	public void method1636() {
		try {
			this.aClass105_7232.method1258(this.aClass123Array7259[18]);
			this.anIntArray7261 = this.anIntArrayArray7260[this.aClass105_7232.method1260((short) 20181)];
			this.aClass105_7232.method1249();
			this.aClass105_7232.method1271(this.anIntArray7261[6], this.aClass260_1536.aFloat2716, this.aClass260_1536.aFloat2715, this.aClass260_1536.aFloat2711, 1972052423);
			this.aClass105_7232.method1272(this.anIntArray7261[16], this.aFloat1541, this.aFloat1545, 0.0F, 0.0F, 607809851);
			this.method1642(0, 1113234041);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "aad.z(" + ')');
		}
	}

	public void method1628(int arg0) {
		this.aClass105_7232.method1258(this.aClass123Array7259[arg0 + 2]);
		this.anIntArray7261 = this.anIntArrayArray7260[this.aClass105_7232.method1260((short) 30217)];
		this.aClass105_7232.method1249();
		this.method1642(arg0, 1201778204);
	}

	public void method1619(boolean arg0) {
		try {
			if (arg0) {
				this.aClass105_7232.method1258(this.aClass123Array7259[1]);
			} else {
				this.aClass105_7232.method1258(this.aClass123Array7259[0]);
			}
			this.anIntArray7261 = this.anIntArrayArray7260[this.aClass105_7232.method1260((short) 32376)];
			this.aClass105_7232.method1249();
			this.aClass105_7232.method1277(this.anIntArray7261[2], 0, this.anInterface11_Impl3_1540, 297484471);
			this.aClass105_7232.method1276(this.anIntArray7261[4], this.aClass249_7241, (byte) 97);
			this.aClass105_7232.method1275(this.anIntArray7261[5], this.aClass249_1546, 1132900161);
			this.aClass105_7232.method1272(this.anIntArray7261[7], this.aClass261_1551.aFloat2717, this.aClass261_1551.aFloat2718, this.aClass261_1551.aFloat2720, this.aClass261_1551.aFloat2719, 1166021065);
			this.aClass105_7232.method1271(this.anIntArray7261[8], this.aClass260_1547.aFloat2716, this.aClass260_1547.aFloat2715, this.aClass260_1547.aFloat2711, 590799154);
			this.aClass105_7232.method1272(this.anIntArray7261[9], this.aClass261_1548.aFloat2717, this.aClass261_1548.aFloat2718, this.aClass261_1548.aFloat2720, this.aClass261_1548.aFloat2719, 1762575212);
			this.aClass105_7232.method1271(this.anIntArray7261[10], this.aClass260_1549.aFloat2716, this.aClass260_1549.aFloat2715, this.aClass260_1549.aFloat2711, 1597542796);
			this.aClass_ra_Sub2_1537.method4987(Class199.aClass199_1926, this.anInt1555, this.anInt1556, this.anInt1557, this.anInt1552);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aad.i(" + ')');
		}
	}

	public void method1622(int arg0) {
		try {
			this.aClass105_7232.method1258(this.aClass123Array7259[arg0 + 12]);
			this.anIntArray7261 = this.anIntArrayArray7260[this.aClass105_7232.method1260((short) 25755)];
			this.aClass105_7232.method1249();
			this.aClass105_7232.method1290(this.anIntArray7261[15], this.aClass249_1554, 16711680);
			this.aClass105_7232.method1271(this.anIntArray7261[6], this.aClass260_1536.aFloat2716, this.aClass260_1536.aFloat2715, this.aClass260_1536.aFloat2711, 1172375118);
			this.aClass105_7232.method1277(this.anIntArray7261[3], 1, this.anInterface11_Impl1_1550, 484229479);
			this.method1642(arg0, -2126199263);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aad.s(" + ')');
		}
	}

	public void method1631(int arg0) {
		this.aClass105_7232.method1258(this.aClass123Array7259[arg0 + 7]);
		this.anIntArray7261 = this.anIntArrayArray7260[this.aClass105_7232.method1260((short) 23602)];
		this.aClass105_7232.method1249();
		this.aClass105_7232.method1271(this.anIntArray7261[6], this.aClass260_1536.aFloat2716, this.aClass260_1536.aFloat2715, this.aClass260_1536.aFloat2711, 1342826392);
		this.aClass105_7232.method1272(this.anIntArray7261[16], this.aFloat1541, this.aFloat1545, 0.0F, 0.0F, 45065713);
		this.method1642(arg0, 990640412);
	}

	public void method1632(int arg0) {
		this.aClass105_7232.method1258(this.aClass123Array7259[arg0 + 7]);
		this.anIntArray7261 = this.anIntArrayArray7260[this.aClass105_7232.method1260((short) 22122)];
		this.aClass105_7232.method1249();
		this.aClass105_7232.method1271(this.anIntArray7261[6], this.aClass260_1536.aFloat2716, this.aClass260_1536.aFloat2715, this.aClass260_1536.aFloat2711, 911494539);
		this.aClass105_7232.method1272(this.anIntArray7261[16], this.aFloat1541, this.aFloat1545, 0.0F, 0.0F, -884278636);
		this.method1642(arg0, -1696233009);
	}

	public void method1633(int arg0) {
		this.aClass105_7232.method1258(this.aClass123Array7259[arg0 + 7]);
		this.anIntArray7261 = this.anIntArrayArray7260[this.aClass105_7232.method1260((short) 2952)];
		this.aClass105_7232.method1249();
		this.aClass105_7232.method1271(this.anIntArray7261[6], this.aClass260_1536.aFloat2716, this.aClass260_1536.aFloat2715, this.aClass260_1536.aFloat2711, 1764623423);
		this.aClass105_7232.method1272(this.anIntArray7261[16], this.aFloat1541, this.aFloat1545, 0.0F, 0.0F, -194615020);
		this.method1642(arg0, 1035257286);
	}

	public void method1618(Class249 arg0) {
		try {
			this.aClass249_7241.method2510(arg0);
			this.aClass249_7241.method2483(this.aClass_ra_Sub2_1537.aClass249_8493);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aad.j(" + ')');
		}
	}

	public void method1624(int arg0) {
		this.aClass105_7232.method1258(this.aClass123Array7259[arg0 + 12]);
		this.anIntArray7261 = this.anIntArrayArray7260[this.aClass105_7232.method1260((short) 30985)];
		this.aClass105_7232.method1249();
		this.aClass105_7232.method1290(this.anIntArray7261[15], this.aClass249_1554, 16711680);
		this.aClass105_7232.method1271(this.anIntArray7261[6], this.aClass260_1536.aFloat2716, this.aClass260_1536.aFloat2715, this.aClass260_1536.aFloat2711, 1913320933);
		this.aClass105_7232.method1277(this.anIntArray7261[3], 1, this.anInterface11_Impl1_1550, 1126782473);
		this.method1642(arg0, -140096896);
	}

	public void method1621(int arg0) {
		try {
			this.aClass105_7232.method1258(this.aClass123Array7259[arg0 + 7]);
			this.anIntArray7261 = this.anIntArrayArray7260[this.aClass105_7232.method1260((short) 17151)];
			this.aClass105_7232.method1249();
			this.aClass105_7232.method1271(this.anIntArray7261[6], this.aClass260_1536.aFloat2716, this.aClass260_1536.aFloat2715, this.aClass260_1536.aFloat2711, 868863820);
			this.aClass105_7232.method1272(this.anIntArray7261[16], this.aFloat1541, this.aFloat1545, 0.0F, 0.0F, -1290981317);
			this.method1642(arg0, -133870213);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aad.o(" + ')');
		}
	}

	public void method1629(int arg0) {
		this.aClass105_7232.method1258(this.aClass123Array7259[arg0 + 7]);
		this.anIntArray7261 = this.anIntArrayArray7260[this.aClass105_7232.method1260((short) 2854)];
		this.aClass105_7232.method1249();
		this.aClass105_7232.method1271(this.anIntArray7261[6], this.aClass260_1536.aFloat2716, this.aClass260_1536.aFloat2715, this.aClass260_1536.aFloat2711, 1373198945);
		this.aClass105_7232.method1272(this.anIntArray7261[16], this.aFloat1541, this.aFloat1545, 0.0F, 0.0F, -1300363426);
		this.method1642(arg0, 924249857);
	}

	public void method1638() {
		this.aClass105_7232.method1258(this.aClass123Array7259[17]);
		this.anIntArray7261 = this.anIntArrayArray7260[this.aClass105_7232.method1260((short) 6022)];
		this.aClass105_7232.method1249();
		this.method1642(0, 599098735);
	}

	public void method1627() {
		this.aClass105_7232.method1258(this.aClass123Array7259[17]);
		this.anIntArray7261 = this.anIntArrayArray7260[this.aClass105_7232.method1260((short) 16603)];
		this.aClass105_7232.method1249();
		this.method1642(0, -16554755);
	}

	public void method1623() {
		this.aClass105_7232.method1258(this.aClass123Array7259[18]);
		this.anIntArray7261 = this.anIntArrayArray7260[this.aClass105_7232.method1260((short) 30477)];
		this.aClass105_7232.method1249();
		this.aClass105_7232.method1271(this.anIntArray7261[6], this.aClass260_1536.aFloat2716, this.aClass260_1536.aFloat2715, this.aClass260_1536.aFloat2711, 1820147396);
		this.aClass105_7232.method1272(this.anIntArray7261[16], this.aFloat1541, this.aFloat1545, 0.0F, 0.0F, 1181573345);
		this.method1642(0, 31638629);
	}

	public void method1630(int arg0) {
		this.aClass105_7232.method1258(this.aClass123Array7259[arg0 + 7]);
		this.anIntArray7261 = this.anIntArrayArray7260[this.aClass105_7232.method1260((short) 26668)];
		this.aClass105_7232.method1249();
		this.aClass105_7232.method1271(this.anIntArray7261[6], this.aClass260_1536.aFloat2716, this.aClass260_1536.aFloat2715, this.aClass260_1536.aFloat2711, 1046251100);
		this.aClass105_7232.method1272(this.anIntArray7261[16], this.aFloat1541, this.aFloat1545, 0.0F, 0.0F, 988156311);
		this.method1642(arg0, 435764114);
	}

	public void method1639(int arg0) {
		this.aClass105_7232.method1258(this.aClass123Array7259[arg0 + 2]);
		this.anIntArray7261 = this.anIntArrayArray7260[this.aClass105_7232.method1260((short) 5984)];
		this.aClass105_7232.method1249();
		this.method1642(arg0, 757835354);
	}
}
