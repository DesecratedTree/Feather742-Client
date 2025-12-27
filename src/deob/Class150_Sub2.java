package deob;

public class Class150_Sub2 extends Class150 {

	public static int anInt7270;

	public Class105 aClass105_7269;

	public Class123 aClass123_7267;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7268;

	public static Class61 aClass61_7271;

	public boolean method1770(int arg0) throws Exception_Sub2 {
		try {
			this.aClass105_7269 = this.aClass_ra_Sub2_1625.method4888("BatchedSprite");
			this.aClass330_Sub15_Sub1_7268 = this.aClass105_7269.method1295("SpriteSampler", (byte) -48);
			this.aClass123_7267 = this.aClass105_7269.method1254("Normal", -154624755);
			this.aClass105_7269.method1258(this.aClass123_7267);
			return true;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aax.i(" + ')');
		}
	}

	public Class150_Sub2(Class_ra_Sub2 arg0) throws Exception_Sub2 {
		super(arg0);
		this.method1770(361672607);
	}

	public void method1768() {
		try {
			this.aClass105_7269.method1249();
			this.aClass105_7269.method1270(this.aClass330_Sub15_Sub1_7268, 0, this.anInterface11_Impl3_1624, (byte) 47);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "aax.r(" + ')');
		}
	}

	public void method1769() {
		this.aClass105_7269.method1249();
		this.aClass105_7269.method1270(this.aClass330_Sub15_Sub1_7268, 0, this.anInterface11_Impl3_1624, (byte) 117);
	}

	public static final void method1771(int arg0) {
		try {
			String var1 = Class19.aString243 == null ? Class228.method2315(-997158659) : Class19.aString243;
			Class532.openLink(var1, false, Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(-924684780) == 5, client.aBoolean9042, client.aBoolean8966, 1546339936);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "aax.ft(" + ')');
		}
	}

	public static void method1772(Class432_Sub1_Sub1_Sub1 arg0, int[] arg1, int arg2, boolean arg3, byte arg4) {
		try {
			boolean var5;
			int var6;
			if (arg0.anIntArray10030 != null) {
				var5 = true;
				for (var6 = 0; var6 < arg0.anIntArray10030.length; var6++) {
					if (arg1[var6] != arg0.anIntArray10030[var6]) {
						var5 = false;
						break;
					}
				}
				Class477 var10 = arg0.aClass477_10032;
				if (var5 && var10.method5966(-262563346)) {
					Class440 var7 = arg0.aClass477_10032.method5986((byte) -83);
					int var8 = var7.anInt4472;
					if (var8 == 1) {
						var10.method5989(arg2, -1634891627);
					}
					if (var8 == 2) {
						var10.method5980((byte) 56);
					}
				}
			}
			var5 = true;
			for (var6 = 0; var6 < arg1.length; var6++) {
				if (arg1[var6] != -1) {
					var5 = false;
				}
				if (arg0.anIntArray10030 == null || arg0.anIntArray10030[var6] == -1 || Class201.aClass436_6511.method5570(arg1[var6], -185548523).anInt4470 >= Class201.aClass436_6511.method5570(arg0.anIntArray10030[var6], 921514568).anInt4470) {
					arg0.anIntArray10030 = arg1;
					arg0.aClass477_10032.method5968(arg2, -1958240973);
					if (arg3) {
						arg0.anInt10006 = arg0.anInt10056;
					}
				}
			}
			if (var5) {
				arg0.anIntArray10030 = arg1;
				arg0.aClass477_10032.method5968(arg2, -1958240973);
				if (arg3) {
					arg0.anInt10006 = arg0.anInt10056;
				}
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "aax.kv(" + ')');
		}
	}

	public static final void method1773(Class430 arg0, int arg1) {
		try {
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub26_7901, arg0.anIntArray4387[--arg0.anInt4376], -1715859229);
			Class435.method5568(1149899447);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aax.aku(" + ')');
		}
	}
}
