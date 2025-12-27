package deob;

import java.util.Random;

public class Class546 {

	public static int anInt6259 = 0;

	public IndexTable aClass280_6261;

	public Class539[] aClass539Array6260;

	public int anInt6258;

	public Class539 method6350(int arg0, int arg1, byte arg2) {
		try {
			if (this.anInt6258 == -1) {
				return new Class539(false, new Class548[0]);
			} else {
				Class548 var4 = new Class548(this.anInt6258, arg0, arg1);
				return new Class539(false, new Class548[] { var4 });
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "wp.r(" + ')');
		}
	}

	public Class542 method6351(int arg0, int arg1) {
		try {
			byte[] var3 = this.aClass280_6261.getFile(arg0, 0);
			Class542 var4 = new Class542();
			var4.method6335(new Buffer(var3), 1859886289);
			return var4;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "wp.j(" + ')');
		}
	}

	public Class548[] method6352(int arg0, byte arg1) {
		try {
			if (arg0 < 0 || arg0 >= this.aClass539Array6260.length) {
				return this.method6350(0, 0, (byte) 7).aClass548Array6246;
			}
			Class539 var3 = this.aClass539Array6260[arg0];
			if (!var3.aBoolean6245 || var3.aClass548Array6246.length <= 1) {
				return var3.aClass548Array6246;
			}
			int var4 = this.anInt6258 == -1 ? 0 : 1;
			Random var5 = new Random();
			Class548[] var6 = new Class548[var3.aClass548Array6246.length];
			System.arraycopy(var3.aClass548Array6246, 0, var6, 0, var6.length);
			for (int var7 = var4; var7 < var6.length; var7++) {
				int var8 = Class9.method423(var5, var6.length - var4, (byte) -57) + var4;
				Class548 var9 = var3.aClass548Array6246[var7];
				var6[var7] = var6[var8];
				var6[var8] = var9;
			}
			return var6;
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "wp.i(" + ')');
		}
	}

	public boolean method6353(int arg0) {
		try {
			return this.anInt6258 != -1;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "wp.p(" + ')');
		}
	}

	public Class546(Class435 arg0, Class454 arg1, IndexTable arg2) {
		this.aClass280_6261 = arg2;
		Buffer var4 = new Buffer(this.aClass280_6261.getFile(0, 0));
		int var5 = var4.payload == null || var4.payload.length < 1 ? -1 : var4.readUnsignedByte(1910478454);
		if (var5 < 4) {
			this.aClass539Array6260 = new Class539[0];
			this.anInt6258 = -1;
		} else {
			int var6 = var4.readUnsignedByte(-59563274);
			Class198[] var7 = Class477.method5991(-1913687013);
			boolean var8 = true;
			int var9;
			int var10;
			if (var6 == var7.length) {
				for (var9 = 0; var9 < var7.length; var9++) {
					var10 = var4.readUnsignedByte(1936332582);
					if (var7[var9].anInt1924 != var10) {
						var8 = false;
						break;
					}
				}
			} else {
				var8 = false;
			}
			if (var8) {
				var9 = var4.readUnsignedByte(946016435);
				var10 = var4.readUnsignedByte(271665175);
				int var11;
				int var12;
				if (var5 > 2) {
					this.anInt6258 = var4.readShort(-1100583751);
					var11 = var4.readUnsignedTriByte(-1401356047);
					var12 = var4.readUnsignedShort(1753303885);
				} else {
					this.anInt6258 = -1;
					var11 = 0;
					var12 = 0;
				}
				this.aClass539Array6260 = new Class539[var10 + 1];
				int var13;
				for (var13 = 0; var13 < var9; var13++) {
					int var14 = var4.readUnsignedByte(1879415788);
					boolean var15 = var4.readUnsignedByte(1787680740) == 1;
					int var16 = var4.readUnsignedShort(88583319);
					Class548[] var17;
					int var18;
					int var19;
					int var20;
					int var21;
					if (this.anInt6258 == -1) {
						var17 = new Class548[var16];
						for (var18 = 0; var18 < var16; var18++) {
							var19 = var4.readUnsignedShort(849943233);
							var20 = var4.readUnsignedTriByte(-1401356047);
							var21 = var4.readUnsignedShort(463511609);
							var17[var18] = new Class548(var19, var20, var21);
						}
						this.aClass539Array6260[var14] = new Class539(var15, var17);
					} else {
						var17 = new Class548[var16 + 1];
						var17[0] = new Class548(this.anInt6258, var11, var12);
						for (var18 = 0; var18 < var16; var18++) {
							var19 = var4.readUnsignedShort(-426081100);
							var20 = var4.readUnsignedTriByte(-1401356047);
							var21 = var4.readUnsignedShort(-361614569);
							var17[var18 + 1] = new Class548(var19, var20, var21);
						}
					}
					this.aClass539Array6260[var14] = new Class539(var15, var17);
				}
				for (var13 = 0; var13 < var10 + 1; var13++) {
					if (this.aClass539Array6260[var13] == null) {
						this.aClass539Array6260[var13] = this.method6350(var11, var12, (byte) 16);
					}
				}
			} else {
				this.aClass539Array6260 = new Class539[0];
				this.anInt6258 = -1;
			}
		}
	}

	public static boolean method6354(IndexTable arg0, IndexTable arg1, IndexTable arg2, Class330_Sub40_Sub2 arg3, Class296 arg4, int arg5) {
		try {
			Class110.aClass280_1160 = arg0;
			Class110.aClass280_1153 = arg1;
			Class110.aClass280_1154 = arg2;
			Class110.aClass330_Sub40_Sub2_1155 = arg3;
			Class539.aClass296_6244 = arg4;
			Class85.anIntArray711 = new int[16];
			for (int var6 = 0; var6 < 16; var6++) {
				Class85.anIntArray711[var6] = 255;
			}
			return true;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "wp.r(" + ')');
		}
	}
}
