package deob;

public class Class434 implements Interface12 {

	public static IndexTable aClass280_6560;

	public static Class61[] aClass61Array6559;

	public Object method170(byte[] arg0, Class524 arg1, boolean arg2, int arg3) {
		try {
			return Class361.aClass_ra3793.ce(arg1, (Class87_Sub2[]) Class53.method639(arg0), arg2);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "s.r(" + ')');
		}
	}

	public Object method172(byte[] arg0, Class524 arg1, boolean arg2) {
		return Class361.aClass_ra3793.ce(arg1, (Class87_Sub2[]) Class53.method639(arg0), arg2);
	}

	public Object method171(byte[] arg0, Class524 arg1, boolean arg2) {
		return Class361.aClass_ra3793.ce(arg1, (Class87_Sub2[]) Class53.method639(arg0), arg2);
	}

	public static Class351 method5563(IndexTable arg0, String arg1, boolean arg2, byte arg3) {
		try {
			int var4 = arg0.method2754(arg1, 323600977);
			if (var4 == -1) {
				return new Class351(0);
			}
			int[] var5 = arg0.method2762(var4, (byte) -88);
			Class351 var6 = new Class351(var5.length);
			int var7 = 0;
			int var8 = 0;
			while (true) {
				while (var7 < var6.anInt3479) {
					Buffer var9 = new Buffer(arg0.getFile(var4, var5[var8++]));
					int var10 = var9.readInt((byte) 16);
					int var11 = var9.readUnsignedShort(1103021742);
					int var12 = var9.readUnsignedByte(1231139689);
					if (!arg2 && var12 == 1) {
						var6.anInt3479--;
					} else {
						var6.anIntArray3480[var7] = var10;
						var6.anIntArray3481[var7] = var11;
						var7++;
					}
				}
				return var6;
			}
		} catch (RuntimeException var13) {
			throw Class476.method5964(var13, "s.r(" + ')');
		}
	}

	public static final boolean method5564(int arg0) {
		try {
			return Class360.anInt3769 != 1;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "s.s(" + ')');
		}
	}

	public static final void method5565(Class430 arg0, byte arg1) throws Exception_Sub4 {
		try {
			arg0.anInt4376 -= 4;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			Class260 var5 = Class260.method2577((float) var2, (float) var3, (float) var4);
			Class401_Sub1.aClass145_Sub1_8249.method1716(var5, 1090972539);
			var5.method2550();
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "s.aif(" + ')');
		}
	}

	public static final void method5566(byte arg0) {
		try {
			if (!client.aBoolean9074) {
				client.aFloat9124 += (-12.0F - client.aFloat9124) / 2.0F;
				client.aBoolean9038 = true;
				client.aBoolean9074 = true;
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "s.ht(" + ')');
		}
	}

	public static final void method5567(Class430 arg0, int arg1) {
		try {
			if (client.aBoolean9198) {
				Class232.aClass232_2455.method2357(1777116072);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "s.apx(" + ')');
		}
	}
}
