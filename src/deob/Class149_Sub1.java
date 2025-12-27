package deob;

public class Class149_Sub1 extends Class149 {

	public int anInt8866 = 0;

	public static int anInt8867;

	public Class149_Sub1(IndexTable arg0, Class204_Sub1 arg1) {
		super(arg0, arg1);
	}

	public void method87(boolean arg0, byte arg1) {
		try {
			int var3 = this.aClass204_6461.aClass195_6512.method2137(this.aClass61_6459.method318(), client.anInt9207, 1413243459) + this.aClass204_6461.anInt6515;
			int var4 = this.aClass204_6461.aClass211_6514.method2221(this.aClass61_6459.method683(), client.anInt9118, (byte) -52) + this.aClass204_6461.anInt6516;
			this.aClass61_6459.method695((float) (var3 + this.aClass61_6459.method318() / 2), (float) (var4 + this.aClass61_6459.method683() / 2), 4096, this.anInt8866);
			this.anInt8866 += ((Class204_Sub1) this.aClass204_6461).anInt8946;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aaa.j(" + ')');
		}
	}

	public void method90(boolean arg0) {
		int var2 = this.aClass204_6461.aClass195_6512.method2137(this.aClass61_6459.method318(), client.anInt9207 * -1156626901 * 64571523, 1052072856) + this.aClass204_6461.anInt6515 * 889037733 * -25392083;
		int var3 = this.aClass204_6461.aClass211_6514.method2221(this.aClass61_6459.method683(), client.anInt9118 * 1108170155 * -1702167293, (byte) -103) + this.aClass204_6461.anInt6516 * 1843004335 * 722678607;
		this.aClass61_6459.method695((float) (var2 + this.aClass61_6459.method318() / 2), (float) (var3 + this.aClass61_6459.method683() / 2), 4096, this.anInt8866 * -1140231271 * 109457577);
		this.anInt8866 = (this.anInt8866 * -1140231271 + ((Class204_Sub1) this.aClass204_6461).anInt8946 * 1557122543 * 685006583) * 109457577;
	}

	public static final void method1765(Class430 arg0, short arg1) {
		try {
			arg0.anInt4376 -= 3;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			String var5 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			if (var3 == -1) {
				throw new RuntimeException();
			}
			Class506 var6 = Class211.aClass505_2062.method6140(var3, 1588873884);
			if (var2 != var6.aChar5926) {
				throw new RuntimeException();
			} else if (var6.aChar5921 == 's') {
				int[] var7 = var6.method6147(var5, 16777472);
				if (var4 < 0 || var7 == null || var7.length <= var4) {
					throw new RuntimeException();
				}
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var7[var4];
			} else {
				throw new RuntimeException();
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "aaa.vs(" + ')');
		}
	}

	public static final void method1766(int arg0) {
		try {
			Class360.anInt3769 = 1;
			Class360.anInt3775 = -2;
			Class360.anInt3781 = -2;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "aaa.i(" + ')');
		}
	}

	public static void method1767(int arg0, int arg1) {
		try {
			Class330_Sub36_Sub3 var2 = Class464_Sub4.method5750(10, (long) arg0);
			var2.method3444(1908091451);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aaa.x(" + ')');
		}
	}
}
