package deob;

public class Class159_Sub1 extends Class159 {

	public static int anInt7272 = 2;

	public static int anInt7273 = 0;

	public static int anInt7274 = 7;

	public static int anInt7275 = 1;

	public static int anInt7276 = 1;

	public static int anInt7277 = 4;

	public static int anInt7278 = 1;

	public static int anInt7279 = 1;

	public static int anInt7281 = 0;

	public static int anInt7282 = 1;

	public static int anInt7283 = 2;

	public static int anInt7287 = 6;

	public Class123[] aClass123Array7280 = new Class123[3];

	public int[][] anIntArrayArray7286 = new int[3][7];

	public Class261 aClass261_7288 = new Class261(1.0F, 1.0F, 1.0F, 1.0F);

	public Class261 aClass261_7289 = new Class261(0.0F, 0.0F, 0.0F, 0.0F);

	public Class105 aClass105_7285;

	public int[] anIntArray7284;

	public Class159_Sub1(Class_ra_Sub2 arg0) throws Exception_Sub2 {
		super(arg0);
		this.method1871(-340567095);
	}

	public void method1870(int arg0) {
		try {
			this.aClass105_7285.method1277(this.anIntArray7284[1], 0, this.anInterface11_Impl3_1679, 150190302);
			this.aClass_ra_Sub2_1684.method5103(this.aClass249_1681);
			this.aClass105_7285.method1276(this.anIntArray7284[0], this.aClass249_1681, (byte) 23);
			this.aClass105_7285.method1275(this.anIntArray7284[3], this.aClass249_1682, 1237387935);
			this.aClass105_7285.method1272(this.anIntArray7284[5], this.aClass261_7288.aFloat2717, this.aClass261_7288.aFloat2718, this.aClass261_7288.aFloat2720, this.aClass261_7288.aFloat2719, -1575023223);
			this.aClass105_7285.method1272(this.anIntArray7284[6], this.aClass261_7289.aFloat2717, this.aClass261_7289.aFloat2718, this.aClass261_7289.aFloat2720, this.aClass261_7289.aFloat2719, 226466438);
			this.aClass_ra_Sub2_1684.method5081(0, this.anInterface9_Impl1_1678);
			this.aClass_ra_Sub2_1684.method4978(this.aClass184_1686);
			this.aClass_ra_Sub2_1684.method4898(Class199.aClass199_1929, this.anInt1685, 2);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aaq.l(" + ')');
		}
	}

	public void method1863(int arg0, int arg1) {
		switch(arg0) {
			case 0:
				this.aClass261_7288.method2585(arg1);
				this.aClass261_7289.method2585(0);
				break;
			case 1:
				this.aClass261_7288.method2585(-1);
				this.aClass261_7289.method2585(0);
				break;
			case 2:
				this.aClass261_7288.method2585(arg1);
				this.aClass261_7289.method2585(0);
				break;
			case 3:
				this.aClass261_7288.method2585(arg1 & 0xFF000000 | 0xFFFFFF);
				this.aClass261_7289.method2585(arg1 & 0xFFFFFF);
				break;
			case 4:
				this.aClass261_7288.method2585(-1);
				this.aClass261_7289.method2585(arg1);
				this.aClass261_7289.method2587();
		}
	}

	public void method1862() {
		try {
			this.aClass105_7285.method1258(this.aClass123Array7280[0]);
			this.aClass105_7285.method1249();
			this.anIntArray7284 = this.anIntArrayArray7286[this.aClass105_7285.method1260((short) 22331)];
			this.method1870(1743229862);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "aaq.j(" + ')');
		}
	}

	public boolean method1871(int arg0) throws Exception_Sub2 {
		try {
			this.aClass105_7285 = this.aClass_ra_Sub2_1684.method4888("Sprite");
			Class330_Sub15_Sub1 var2 = this.aClass105_7285.method1295("WVPMatrix", (byte) -80);
			Class330_Sub15_Sub1 var3 = this.aClass105_7285.method1295("SpriteSampler", (byte) -60);
			Class330_Sub15_Sub1 var4 = this.aClass105_7285.method1295("MaskSampler", (byte) -37);
			Class330_Sub15_Sub1 var5 = this.aClass105_7285.method1295("MulColour", (byte) -111);
			Class330_Sub15_Sub1 var6 = this.aClass105_7285.method1295("AddColour", (byte) -62);
			Class330_Sub15_Sub1 var7 = this.aClass105_7285.method1295("SpriteTexCoordMatrix", (byte) -30);
			Class330_Sub15_Sub1 var8 = this.aClass105_7285.method1295("MaskTexCoordMatrix", (byte) -25);
			this.aClass123Array7280[0] = this.aClass105_7285.method1254("Normal", -674339294);
			this.aClass123Array7280[1] = this.aClass105_7285.method1254("Masked", 905720121);
			this.aClass123Array7280[2] = this.aClass105_7285.method1254("AlphaTex", -1920807624);
			for (int var9 = 0; var9 < 3; var9++) {
				int var10 = this.aClass105_7285.method1297(this.aClass123Array7280[var9], 1498926310);
				this.anIntArrayArray7286[var9][0] = var2.method3328(var10);
				this.anIntArrayArray7286[var9][1] = var3.method3328(var10);
				this.anIntArrayArray7286[var9][2] = var4.method3328(var10);
				this.anIntArrayArray7286[var9][5] = var5.method3328(var10);
				this.anIntArrayArray7286[var9][6] = var6.method3328(var10);
				this.anIntArrayArray7286[var9][3] = var7.method3328(var10);
				this.anIntArrayArray7286[var9][4] = var8.method3328(var10);
			}
			this.aClass105_7285.method1258(this.aClass123Array7280[0]);
			return true;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "aaq.n(" + ')');
		}
	}

	public void method1868(int arg0, int arg1) {
		switch(arg0) {
			case 0:
				this.aClass261_7288.method2585(arg1);
				this.aClass261_7289.method2585(0);
				break;
			case 1:
				this.aClass261_7288.method2585(-1);
				this.aClass261_7289.method2585(0);
				break;
			case 2:
				this.aClass261_7288.method2585(arg1);
				this.aClass261_7289.method2585(0);
				break;
			case 3:
				this.aClass261_7288.method2585(arg1 & 0xFF000000 | 0xFFFFFF);
				this.aClass261_7289.method2585(arg1 & 0xFFFFFF);
				break;
			case 4:
				this.aClass261_7288.method2585(-1);
				this.aClass261_7289.method2585(arg1);
				this.aClass261_7289.method2587();
		}
	}

	public void method1861(int arg0, int arg1) {
		try {
			switch(arg0) {
				case 0:
					this.aClass261_7288.method2585(arg1);
					this.aClass261_7289.method2585(0);
					break;
				case 1:
					this.aClass261_7288.method2585(-1);
					this.aClass261_7289.method2585(0);
					break;
				case 2:
					this.aClass261_7288.method2585(arg1);
					this.aClass261_7289.method2585(0);
					break;
				case 3:
					this.aClass261_7288.method2585(arg1 & 0xFF000000 | 0xFFFFFF);
					this.aClass261_7289.method2585(arg1 & 0xFFFFFF);
					break;
				case 4:
					this.aClass261_7288.method2585(-1);
					this.aClass261_7289.method2585(arg1);
					this.aClass261_7289.method2587();
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aaq.r(" + ')');
		}
	}

	public void method1867() {
		this.aClass105_7285.method1258(this.aClass123Array7280[0]);
		this.aClass105_7285.method1249();
		this.anIntArray7284 = this.anIntArrayArray7286[this.aClass105_7285.method1260((short) 6107)];
		this.method1870(1146235875);
	}

	public void method1866() {
		this.aClass105_7285.method1258(this.aClass123Array7280[0]);
		this.aClass105_7285.method1249();
		this.anIntArray7284 = this.anIntArrayArray7286[this.aClass105_7285.method1260((short) 25562)];
		this.method1870(1270734426);
	}

	public void method1869() {
		this.aClass105_7285.method1258(this.aClass123Array7280[1]);
		this.aClass105_7285.method1249();
		this.anIntArray7284 = this.anIntArrayArray7286[this.aClass105_7285.method1260((short) 15985)];
		this.aClass105_7285.method1277(this.anIntArray7284[2], 1, this.anInterface11_Impl3_1680, 738987933);
		this.aClass105_7285.method1275(this.anIntArray7284[4], this.aClass249_1683, 1220914387);
		this.method1870(1806203994);
	}

	public void method1865(int arg0, int arg1) {
		switch(arg0) {
			case 0:
				this.aClass261_7288.method2585(arg1);
				this.aClass261_7289.method2585(0);
				break;
			case 1:
				this.aClass261_7288.method2585(-1);
				this.aClass261_7289.method2585(0);
				break;
			case 2:
				this.aClass261_7288.method2585(arg1);
				this.aClass261_7289.method2585(0);
				break;
			case 3:
				this.aClass261_7288.method2585(arg1 & 0xFF000000 | 0xFFFFFF);
				this.aClass261_7289.method2585(arg1 & 0xFFFFFF);
				break;
			case 4:
				this.aClass261_7288.method2585(-1);
				this.aClass261_7289.method2585(arg1);
				this.aClass261_7289.method2587();
		}
	}

	public void method1864() {
		try {
			this.aClass105_7285.method1258(this.aClass123Array7280[1]);
			this.aClass105_7285.method1249();
			this.anIntArray7284 = this.anIntArrayArray7286[this.aClass105_7285.method1260((short) 27276)];
			this.aClass105_7285.method1277(this.anIntArray7284[2], 1, this.anInterface11_Impl3_1680, 1960661862);
			this.aClass105_7285.method1275(this.anIntArray7284[4], this.aClass249_1683, 1184016074);
			this.method1870(1356838694);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "aaq.i(" + ')');
		}
	}

	public static final void method1872(Class430 arg0, int arg1) {
		try {
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = arg0.aClass154_4391.aString1640;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aaq.xm(" + ')');
		}
	}

	public static final void method1873(Class430 arg0, byte arg1) {
		try {
			byte var2 = Class263_Sub2.myPlayer.aByte8658;
			Class260 var3 = Class263_Sub2.myPlayer.method5346().aClass260_2606;
			Class381 var4 = client.aClass304_9030.method3022(-2134418104);
			int var5 = ((int) var3.aFloat2716 >> 9) + var4.gameSceneBaseX;
			int var6 = var4.gameSceneBaseY + ((int) var3.aFloat2711 >> 9);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = (var5 << 14) + (var2 << 28) + var6;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "aaq.te(" + ')');
		}
	}

	public static final void method1874(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 884248047);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1184;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aaq.rh(" + ')');
		}
	}

	public static final void method1875(int arg0) {
		try {
			Class255.method2540(Class361.aClass_ra3793, (byte) 8);
			if (client.anInt9262 != Class85.anInt712) {
				Class282.method2812(1470552195);
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "aaq.gm(" + ')');
		}
	}
}
