package deob;

import java.awt.Point;

@ObfuscatedName("Gfx")
public class Gfx {

	public Class477 aClass477_573;

	public int anInt572;

	public int anInt575;

	public static int anInt578;

	public int height;

	public static Class323 aClass323_577;

	@ObfuscatedName("Gfx.id")
	public int id = -1;

	public Gfx(Class432_Sub1_Sub1_Sub1 arg0) {
		this.aClass477_573 = new Class477_Sub2(arg0, false);
	}

	public static final void method788(IComponentDefinitions arg0, Class430 arg1, int arg2) {
		try {
			Class524 var3 = arg0.method1405(Class219.aClass230_2183, client.anInterface12_9243, 2130672865);
			int var4 = arg1.anIntArray4387[--arg1.anInt4376];
			Point var5 = var3.method6242(arg0.aString1266, arg0.anInt1210, arg0.anInt1267, var4, Class57.aClass61Array6599, 1054666483);
			arg1.anIntArray4387[++arg1.anInt4376 - 1] = var5.x;
			arg1.anIntArray4387[++arg1.anInt4376 - 1] = var5.y;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "cr.qh(" + ')');
		}
	}

	public static final void method789(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			arg0.aString1194 = (String) arg2.anObjectArray4386[--arg2.anInt4378];
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "cr.jo(" + ')');
		}
	}
}
