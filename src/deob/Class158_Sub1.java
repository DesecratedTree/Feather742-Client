package deob;

public class Class158_Sub1 extends Class158 {

	public void method1842(boolean arg0, int arg1, int arg2, short arg3) {
		try {
			Class361.aClass_ra3793.bl(arg1 - 2, arg2, this.aClass201_6469.anInt6505 + 4, this.aClass201_6469.anInt6503 + 2, ((Class201_Sub3) this.aClass201_6469).anInt8945, 0);
			Class361.aClass_ra3793.bl(arg1 - 1, arg2 + 1, this.aClass201_6469.anInt6505 + 2, this.aClass201_6469.anInt6503, 0, 0);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "aan.w(" + ')');
		}
	}

	public void method1840(boolean arg0, int arg1, int arg2, int arg3) {
		try {
			int var5 = this.method1839(-1370872478) * this.aClass201_6469.anInt6505 / 10000;
			Class361.aClass_ra3793.B(arg1, arg2 + 2, var5, this.aClass201_6469.anInt6503 - 2, ((Class201_Sub3) this.aClass201_6469).anInt8944, 0);
			Class361.aClass_ra3793.B(arg1 + var5, arg2 + 2, this.aClass201_6469.anInt6505 - var5, this.aClass201_6469.anInt6503 - 2, 0, 0);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "aan.n(" + ')');
		}
	}

	public void method1838(boolean arg0, int arg1, int arg2) {
		int var4 = this.method1839(-567469374) * 1790195679 * this.aClass201_6469.anInt6505 * 1298809887 / 10000;
		Class361.aClass_ra3793.B(arg1, arg2 + 2, var4, this.aClass201_6469.anInt6503 * -2072821429 * 1332822115 - 2, ((Class201_Sub3) this.aClass201_6469).anInt8944 * -523261983 * 397859873, 0);
		Class361.aClass_ra3793.B(arg1 + var4, arg2 + 2, this.aClass201_6469.anInt6505 * 1790195679 * 1298809887 - var4, this.aClass201_6469.anInt6503 * 1332822115 * -2072821429 - 2, 0, 0);
	}

	public void method1841(boolean arg0, int arg1, int arg2) {
		Class361.aClass_ra3793.bl(arg1 - 2, arg2, this.aClass201_6469.anInt6505 * 1298809887 * 1790195679 + 4, this.aClass201_6469.anInt6503 * -2072821429 * 1332822115 + 2, ((Class201_Sub3) this.aClass201_6469).anInt8945 * 549629193 * -2077036231, 0);
		Class361.aClass_ra3793.bl(arg1 - 1, arg2 + 1, this.aClass201_6469.anInt6505 * 1298809887 * 1790195679 + 2, this.aClass201_6469.anInt6503 * -2072821429 * 1332822115, 0, 0);
	}

	public Class158_Sub1(IndexTable arg0, IndexTable arg1, Class201_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	public void method1837(boolean arg0, int arg1, int arg2) {
		int var4 = this.method1839(-1775848316) * 1790195679 * this.aClass201_6469.anInt6505 * 1298809887 / 10000;
		Class361.aClass_ra3793.B(arg1, arg2 + 2, var4, this.aClass201_6469.anInt6503 * -2072821429 * 1332822115 - 2, ((Class201_Sub3) this.aClass201_6469).anInt8944 * -523261983 * 397859873, 0);
		Class361.aClass_ra3793.B(arg1 + var4, arg2 + 2, this.aClass201_6469.anInt6505 * 1790195679 * 1298809887 - var4, this.aClass201_6469.anInt6503 * 1332822115 * -2072821429 - 2, 0, 0);
	}

	public static final void method1847(String arg0, byte arg1) {
		try {
			if (arg0 != null) {
				String var2 = Class531.method6297(arg0, -2111042801);
				if (var2 != null) {
					for (int var3 = 0; var3 < client.anInt9261; var3++) {
						Class75 var4 = client.aClass75Array8982[var3];
						String var5 = var4.aString646;
						String var6 = Class531.method6297(var5, -1790446972);
						if (Class432_Sub1_Sub5_Sub2.method5553(arg0, var2, var5, var6, 236900769)) {
							client.anInt9261--;
							for (int var7 = var3; var7 < client.anInt9261; var7++) {
								client.aClass75Array8982[var7] = client.aClass75Array8982[var7 + 1];
							}
							client.anInt9023 = client.anInt9268;
							Class1 var10 = Class426.method5317(1772923778);
							Class330_Sub34 var8 = Class238.method2377(OutgoingPacket.REMOVE_IGNORE_PACKET, var10.aClass488_22, 1279612929);
							var8.aClass330_Sub46_Sub2_7729.addByte(Class57.method659(arg0, -1144107884), (byte) 79);
							var8.aClass330_Sub46_Sub2_7729.addString(arg0, (byte) -23);
							var10.method378(var8, -1547705612);
							break;
						}
					}
				}
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "aan.mq(" + ')');
		}
	}

	public static final void method1848(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			if (Class263_Sub2.myPlayer.aClass408_10240 != null) {
				int var4;
				for (var4 = 0; var4 < Class151.anIntArray6669.length; var4++) {
					if (Class151.anIntArray6669[var4] == var2) {
						Class263_Sub2.myPlayer.aClass408_10240.method4765(var4, var3, Class425.aClass169_4344, -1640074224);
						return;
					}
				}
				for (var4 = 0; var4 < Class151.anIntArray6667.length; var4++) {
					if (Class151.anIntArray6667[var4] == var2) {
						Class263_Sub2.myPlayer.aClass408_10240.method4765(var4, var3, Class425.aClass169_4344, -1286397419);
						break;
					}
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aan.cb(" + ')');
		}
	}

	public static final void method1849(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			boolean var3 = arg0.anIntArray4387[arg0.anInt4376 + 1] == 1;
			if (Class354_Sub1.aClass497_7990 != null) {
				Class330 var4 = Class354_Sub1.aClass497_7990.method6094((long) var2);
				if (var4 != null && !var3) {
					var4.method3252(1403772349);
				} else if (var4 == null && var3) {
					var4 = new Class330();
					Class354_Sub1.aClass497_7990.method6097(var4, (long) var2);
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aan.afi(" + ')');
		}
	}

	public static int getCacheIndex(int arg0) {
		try {
			if (CacheIndex.cacheIndex == -1) {
				CacheIndex[] var1 = Class277.getCacheIndecies(-1660774536);
				for (int var2 = 0; var2 < var1.length; var2++) {
					CacheIndex var3 = var1[var2];
					if (var3.anInt1448 > CacheIndex.cacheIndex) {
						CacheIndex.cacheIndex = var3.anInt1448;
					}
				}
				CacheIndex.cacheIndex++;
			}
			return CacheIndex.cacheIndex;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aan.i(" + ')');
		}
	}

	public static final void method1851(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			IComponentDefinitions var5 = Class433.method5561(var4, var3, 369012573);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var5 == null ? -1 : var5.anInt1196;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "aan.px(" + ')');
		}
	}
}
