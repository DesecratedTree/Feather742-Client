package deob;

public class Class330_Sub20 extends Class330 {

	public static Class471 aClass471_7649 = new Class471();

	public static Class471 aClass471_7650 = new Class471();

	public static Class497 aClass497_7651 = new Class497(16);

	public static int anInt7660 = 512;

	public static int anInt7663 = 0;

	public static int anInt7664 = 1;

	public static int anInt7665 = 2;

	public static int anInt7666 = 1;

	public int anInt7657 = 0;

	public int anInt7652;

	public int anInt7654;

	public int anInt7655;

	public int anInt7656;

	public int anInt7658;

	public int anInt7659;

	public int anInt7668;

	public int anInt7669;

	public int anInt7670;

	public int anInt7671;

	public int anInt7676;

	public int anInt7677;

	public int anInt7679;

	public int anInt7680;

	public Class330_Sub29_Sub1_Sub1 aClass330_Sub29_Sub1_Sub1_7674;

	public Class330_Sub29_Sub1_Sub1 aClass330_Sub29_Sub1_Sub1_7681;

	public Class330_Sub40_Sub3 aClass330_Sub40_Sub3_7675;

	public Class330_Sub40_Sub3 aClass330_Sub40_Sub3_7683;

	public Class330_Sub41 aClass330_Sub41_7648;

	public Class330_Sub41 aClass330_Sub41_7673;

	public Class473 aClass473_7682;

	public NPC aClass432_Sub1_Sub1_Sub1_Sub2_7661;

	public Player aClass432_Sub1_Sub1_Sub1_Sub1_7667;

	public boolean aBoolean7653;

	public boolean aBoolean7662;

	public boolean aBoolean7672;

	public int[] anIntArray7678;

	public void method3373(byte arg0) {
		try {
			int var2 = this.anInt7655;
			boolean var3 = this.aBoolean7672;
			if (this.aClass473_7682 != null) {
				Class473 var4 = this.aClass473_7682.method5900(client.anInt8987 == 0 ? Class96.anInterface29_866 : Class158.aClass561_6474, (byte) 0);
				if (var4 == null) {
					this.anInt7655 = -1;
					this.aBoolean7672 = false;
					this.anInt7658 = 0;
					this.anInt7659 = 0;
					this.anInt7676 = 0;
					this.anInt7677 = 0;
					this.anIntArray7678 = null;
					this.aBoolean7662 = false;
					this.anInt7680 = 256;
					this.anInt7669 = 256;
					this.anInt7679 = 0;
				} else {
					this.anInt7655 = var4.anInt5650;
					this.aBoolean7672 = var4.aBoolean5615;
					this.anInt7658 = var4.anInt5675 << 9;
					this.anInt7659 = var4.anInt5677;
					this.anInt7676 = var4.anInt5679;
					this.anInt7677 = var4.anInt5628;
					this.anIntArray7678 = var4.anIntArray5681;
					this.aBoolean7662 = var4.aBoolean5616;
					this.anInt7680 = var4.anInt5662;
					this.anInt7669 = var4.anInt5689;
				}
			} else if (this.aClass432_Sub1_Sub1_Sub1_Sub2_7661 != null) {
				int var7 = Class412.method5237(this.aClass432_Sub1_Sub1_Sub1_Sub2_7661, 233416610);
				if (var7 != var2) {
					this.anInt7655 = var7;
					Class551 var5 = this.aClass432_Sub1_Sub1_Sub1_Sub2_7661.aClass551_10251;
					if (var5.anIntArray6326 != null) {
						var5 = var5.method6371(Class158.aClass561_6474, (byte) 37);
					}
					if (var5 == null) {
						this.anInt7679 = 0;
						this.anInt7658 = 0;
						this.anInt7659 = 0;
						this.aBoolean7672 = this.aClass432_Sub1_Sub1_Sub1_Sub2_7661.aClass551_10251.aBoolean6346;
						this.anInt7680 = 256;
						this.anInt7669 = 256;
					} else {
						this.anInt7658 = var5.anInt6343 << 9;
						this.anInt7679 = var5.anInt6290 << 9;
						this.anInt7659 = var5.anInt6320;
						this.aBoolean7672 = var5.aBoolean6346;
						this.anInt7680 = var5.anInt6350;
						this.anInt7669 = var5.anInt6354;
					}
				}
			} else if (this.aClass432_Sub1_Sub1_Sub1_Sub1_7667 != null) {
				this.anInt7655 = Class162.method1918(this.aClass432_Sub1_Sub1_Sub1_Sub1_7667, (byte) -1);
				this.aBoolean7672 = this.aClass432_Sub1_Sub1_Sub1_Sub1_7667.isNPC;
				this.anInt7658 = this.aClass432_Sub1_Sub1_Sub1_Sub1_7667.anInt10236 << 9;
				this.anInt7679 = 0;
				this.anInt7659 = this.aClass432_Sub1_Sub1_Sub1_Sub1_7667.anInt10239;
				this.anInt7680 = 256;
				this.anInt7669 = 256;
			}
			if ((this.anInt7655 != var2 || var3 != this.aBoolean7672) && this.aClass330_Sub40_Sub3_7675 != null) {
				Class511.aClass330_Sub40_Sub4_5951.method3685(this.aClass330_Sub40_Sub3_7675);
				this.aClass330_Sub40_Sub3_7675 = null;
				this.aClass330_Sub29_Sub1_Sub1_7674 = null;
				this.aClass330_Sub41_7648 = null;
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ada.i(" + ')');
		}
	}

	public static final void method3374(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			arg0.anInt4376 -= 2;
			int var4 = arg0.anIntArray4387[arg0.anInt4376];
			int var5 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			Class537 var6 = Class301.aClass543_3059.method6339(var4, -1133420499);
			if (var5 == var6.anInt6235) {
				var3.method1400(var4, -579104111);
			} else {
				var3.method1399(var4, var5, 1774020516);
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ada.hm(" + ')');
		}
	}
}
