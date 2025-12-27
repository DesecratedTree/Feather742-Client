package deob;

public class Class407 {

	public IndexTable aClass280_4196;

	public int anInt4197;

	public Class395[] aClass395Array4198;

	public Class407(Class435 arg0, Class454 arg1, IndexTable arg2, boolean arg3) {
		this.aClass280_4196 = arg2;
		if (this.aClass280_4196 == null) {
			this.anInt4197 = 0;
		} else {
			this.anInt4197 = this.aClass280_4196.method2763(Class103.aClass103_959.anInt982, -2049992517);
		}
		if (arg3) {
			this.aClass395Array4198 = new Class395[this.anInt4197];
			for (int var5 = 0; var5 < this.anInt4197; var5++) {
				IndexTable var7 = this.aClass280_4196;
				byte[] var6;
				synchronized (this.aClass280_4196) {
					var6 = this.aClass280_4196.getFile(Class103.aClass103_959.anInt982, var5);
				}
				Class395 var10 = new Class395();
				if (var6 != null) {
					var10.method4635(new Buffer(var6), -292477397);
				}
				var10.method4645(-122396692);
				this.aClass395Array4198[var5] = var10;
				this.aClass395Array4198[var5].aClass407_4090 = this;
			}
		}
	}

	public Class395 method4752(int arg0, int arg1) {
		try {
			return this.aClass395Array4198[arg0];
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qx.r(" + ')');
		}
	}

	public int method4753(Interface29 arg0, int arg1) {
		try {
			int var3 = 0;
			for (int var4 = 0; var4 < this.anInt4197; var4++) {
				Class395 var5 = this.method4752(var4, -1688473696);
				if (var5.method4636(arg0, -1939811453)) {
					var3 += var5.anInt4083;
				}
			}
			return var3;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "qx.j(" + ')');
		}
	}

	public static final void method4754(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			int var3 = client.aClass286Array9234[var2].method2868(2034062860);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3 == 0 ? 1 : 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qx.yx(" + ')');
		}
	}

	public static final void method4755(Class430 arg0, int arg1) {
		try {
			Class330_Sub28 var2 = (Class330_Sub28) arg0.anObjectArray4386[--arg0.anInt4378];
			if (Class401_Sub1.aClass145_Sub1_8249.method1718(2031388488) != Class146.aClass146_1607) {
				throw new RuntimeException();
			}
			Class475_Sub4 var3 = (Class475_Sub4) Class401_Sub1.aClass145_Sub1_8249.method1715(254385052);
			var3.method5956(var2, -160088326);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qx.ahr(" + ')');
		}
	}

	public static final void method4756(Class430 arg0, int arg1) {
		try {
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub25_7896, arg0.anIntArray4387[--arg0.anInt4376] == 1 ? 2 : 0, -1400058673);
			client.aClass304_9030.method3032(-628584915);
			Class435.method5568(1535525093);
			client.aBoolean9194 = false;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qx.akb(" + ')');
		}
	}
}
