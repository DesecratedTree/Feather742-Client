package deob;

public class Class155 {

	public static int anInt1668 = 16;

	public static int anInt1671 = 128;

	public static int anInt1673 = 128;

	public Interface11_Impl3[] anInterface11_Impl3Array1670 = null;

	public Interface11_Impl2 anInterface11_Impl2_1667 = null;

	public Interface11_Impl3[] anInterface11_Impl3Array1672 = null;

	public Interface11_Impl2 anInterface11_Impl2_1675 = null;

	public Interface11_Impl2 anInterface11_Impl2_1674 = null;

	public Class_ra_Sub2 aClass_ra_Sub2_1665;

	public boolean aBoolean1669;

	public static Object anObject1666;

	public static Object anObject1676;

	public static Object anObject1677;

	public Class155(Class_ra_Sub2 arg0) {
		this.aClass_ra_Sub2_1665 = arg0;
		this.aBoolean1669 = this.aClass_ra_Sub2_1665.aBoolean8598;
		if (this.aBoolean1669 && !this.aClass_ra_Sub2_1665.method4996(Class72.aClass72_613, Class86.aClass86_714)) {
			this.aBoolean1669 = false;
		}
		if (this.aBoolean1669 || this.aClass_ra_Sub2_1665.method5006(Class72.aClass72_613, Class86.aClass86_714)) {
			method1824();
			if (this.aBoolean1669) {
				byte[] var4 = Class400.method4707(anObject1666, false, 1194163879);
				this.anInterface11_Impl2_1667 = this.aClass_ra_Sub2_1665.method4952(Class72.aClass72_613, 128, 128, 16, true, var4);
				byte[] var5 = Class400.method4707(anObject1676, false, -1331925837);
				this.anInterface11_Impl2_1675 = this.aClass_ra_Sub2_1665.method4952(Class72.aClass72_613, 128, 128, 16, true, var5);
			} else {
				this.anInterface11_Impl3Array1670 = new Interface11_Impl3[16];
				int var2;
				byte[] var3;
				for (var2 = 0; var2 < 16; var2++) {
					var3 = Class535.method6312(anObject1666, var2 * 32768, 32768, 1236473345);
					this.anInterface11_Impl3Array1670[var2] = this.aClass_ra_Sub2_1665.method4945(Class72.aClass72_613, 128, 128, true, var3);
				}
				this.anInterface11_Impl3Array1672 = new Interface11_Impl3[16];
				for (var2 = 0; var2 < 16; var2++) {
					var3 = Class535.method6312(anObject1676, var2 * 32768, 32768, 1250977057);
					this.anInterface11_Impl3Array1672[var2] = this.aClass_ra_Sub2_1665.method4945(Class72.aClass72_613, 128, 128, true, var3);
				}
			}
		}
	}

	public boolean method1823() {
		if (!this.aClass_ra_Sub2_1665.aBoolean8598) {
			return false;
		}
		if (this.anInterface11_Impl2_1674 == null) {
			byte[] var1;
			if (anObject1677 == null) {
				var1 = Class319.method3169(128, 128, 16, 8, new Class335_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
				anObject1677 = Class433.method5557(var1, false, (byte) 23);
			}
			var1 = Class400.method4707(anObject1677, false, -1038879541);
			byte[] var2 = new byte[var1.length * 4];
			int var3 = 0;
			for (int var4 = 0; var4 < 16; var4++) {
				int var5 = var4 * 16384;
				int var6 = var5;
				for (int var7 = 0; var7 < 128; var7++) {
					int var8 = var6 + var7 * 128;
					int var9 = var6 + (var7 - 1 & 0x7F) * 128;
					int var10 = var6 + (var7 + 1 & 0x7F) * 128;
					for (int var11 = 0; var11 < 128; var11++) {
						float var12 = (float) ((var1[var9 + var11] & 0xFF) - (var1[var10 + var11] & 0xFF));
						float var13 = (float) ((var1[var8 + (var11 - 1 & 0x7F)] & 0xFF) - (var1[var8 + (var11 + 1 & 0x7F)] & 0xFF));
						float var14 = (float) (128.0D / Math.sqrt((double) (var13 * var13 + 16384.0F + var12 * var12)));
						var2[var3++] = (byte) (var13 * var14 + 127.0F);
						var2[var3++] = (byte) (var14 * 128.0F + 127.0F);
						var2[var3++] = (byte) (var12 * var14 + 127.0F);
						var2[var3++] = var1[var5++];
					}
				}
			}
			this.anInterface11_Impl2_1674 = this.aClass_ra_Sub2_1665.method4952(Class72.aClass72_620, 128, 128, 16, true, var2);
		}
		return this.anInterface11_Impl2_1674 != null;
	}

	public static void method1824() {
		byte[] var1;
		if (anObject1666 == null) {
			Class223_Sub2_Sub1 var0 = new Class223_Sub2_Sub1();
			var1 = var0.method2295(128, 128, 16);
			anObject1666 = Class433.method5557(var1, false, (byte) -48);
		}
		if (anObject1676 == null) {
			Class223_Sub1_Sub1 var2 = new Class223_Sub1_Sub1();
			var1 = var2.method2290(128, 128, 16);
			anObject1676 = Class433.method5557(var1, false, (byte) -49);
		}
	}

	public boolean method1825() {
		return this.aBoolean1669 ? this.anInterface11_Impl2_1667 != null : this.anInterface11_Impl3Array1670 != null;
	}
}
