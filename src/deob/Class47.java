package deob;

public class Class47 {

	public static int anInt458 = 128;

	public static int anInt460 = 128;

	public static int anInt463 = 4000;

	public static int anInt467 = 16;

	public Class36_Sub1[] aClass36_Sub1Array461 = null;

	public Class36_Sub2 aClass36_Sub2_464 = null;

	public Class36_Sub1[] aClass36_Sub1Array465 = null;

	public Class36_Sub2 aClass36_Sub2_466 = null;

	public Class36_Sub2 aClass36_Sub2_459 = null;

	public boolean aBoolean462;

	public static Object anObject468;

	public static Object anObject469;

	public static Object anObject470;

	public Class47(Class_ra_Sub1 arg0) {
		this.aBoolean462 = arg0.aBoolean8419;
		method596(arg0);
		if (this.aBoolean462) {
			byte[] var5 = Class400.method4707(anObject468, false, -214151596);
			this.aClass36_Sub2_464 = new Class36_Sub2(arg0, Class72.aClass72_613, Class86.aClass86_714, 128, 128, 16, var5, Class72.aClass72_613);
			byte[] var6 = Class400.method4707(anObject469, false, -984741985);
			this.aClass36_Sub2_466 = new Class36_Sub2(arg0, Class72.aClass72_613, Class86.aClass86_714, 128, 128, 16, var6, Class72.aClass72_613);
			Class59 var7 = arg0.aClass59_8292;
			if (var7.method670()) {
				var5 = Class400.method4707(anObject470, false, -1297273772);
				this.aClass36_Sub2_459 = new Class36_Sub2(arg0, Class72.aClass72_620, Class86.aClass86_714, 128, 128, 16);
				Class36_Sub2 var4 = new Class36_Sub2(arg0, Class72.aClass72_612, Class86.aClass86_714, 128, 128, 16, var5, Class72.aClass72_612);
				if (var7.method669(this.aClass36_Sub2_459, var4, 2.0F)) {
					this.aClass36_Sub2_459.method516();
				} else {
					this.aClass36_Sub2_459.method510();
					this.aClass36_Sub2_459 = null;
				}
				var4.method510();
			}
		} else {
			this.aClass36_Sub1Array461 = new Class36_Sub1[16];
			int var2;
			byte[] var3;
			for (var2 = 0; var2 < 16; var2++) {
				var3 = Class535.method6312(anObject468, var2 * 32768, 32768, -2137022791);
				this.aClass36_Sub1Array461[var2] = new Class36_Sub1(arg0, 3553, Class72.aClass72_613, Class86.aClass86_714, 128, 128, true, var3, Class72.aClass72_613, false);
			}
			this.aClass36_Sub1Array465 = new Class36_Sub1[16];
			for (var2 = 0; var2 < 16; var2++) {
				var3 = Class535.method6312(anObject469, var2 * 32768, 32768, 1628337887);
				this.aClass36_Sub1Array465[var2] = new Class36_Sub1(arg0, 3553, Class72.aClass72_613, Class86.aClass86_714, 128, 128, true, var3, Class72.aClass72_613, false);
			}
		}
	}

	public static void method596(Class_ra_Sub1 arg0) {
		byte[] var2;
		if (anObject468 == null) {
			Class223_Sub2_Sub2 var1 = new Class223_Sub2_Sub2();
			var2 = var1.method2297(128, 128, 16);
			anObject468 = Class433.method5557(var2, false, (byte) 20);
		}
		if (anObject469 == null) {
			Class223_Sub1_Sub2 var3 = new Class223_Sub1_Sub2();
			var2 = var3.method2292(128, 128, 16);
			anObject469 = Class433.method5557(var2, false, (byte) 16);
		}
		Class59 var4 = arg0.aClass59_8292;
		if (var4.method670() && anObject470 == null) {
			var2 = Class319.method3169(128, 128, 16, 8, new Class335_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
			anObject470 = Class433.method5557(var2, false, (byte) 1);
		}
	}
}
