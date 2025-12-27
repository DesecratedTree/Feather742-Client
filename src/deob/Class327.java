package deob;

import java.util.Iterator;
import java.util.LinkedList;

public class Class327 {

	public static int anInt3327 = 0;

	public int anInt3323;

	public int anInt3325;

	public int[] anIntArray3322;

	public int[] anIntArray3326;

	public LinkedList aLinkedList3324;

	public Class387 method3232(Class_ra arg0, short arg1) {
		try {
			Model var3 = Model.loadModel(Class95_Sub12.aClass280_7177, this.anInt3323, 0);
			if (var3 == null) {
				return null;
			} else {
				if (var3.anInt881 < 13) {
					var3.method1196(2);
				}
				return arg0.cb(var3, 2048, anInt3327, 64, 768);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "np.r(" + ')');
		}
	}

	public void method3233(Class356 arg0, byte arg1) {
		try {
			if (arg0 != null && this.anInt3325 > 0) {
				this.method3235(arg0, (byte) -86);
				Iterator var3 = this.aLinkedList3324.iterator();
				while (var3.hasNext()) {
					Class432_Sub1_Sub1_Sub3 var4 = (Class432_Sub1_Sub1_Sub3) var3.next();
					arg0.method4145(var4, false, 1361862418);
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "np.j(" + ')');
		}
	}

	public void method3234(Class356 arg0, int arg1) {
		try {
			if (arg0 != null && this.aLinkedList3324 != null) {
				Iterator var3 = this.aLinkedList3324.iterator();
				while (var3.hasNext()) {
					Class432_Sub1_Sub1_Sub3 var4 = (Class432_Sub1_Sub1_Sub3) var3.next();
					arg0.method4181(var4.aByte8658, var4.aShort9922, var4.aShort9921, new Class336(var4), (byte) 112);
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "np.i(" + ')');
		}
	}

	public void method3235(Class356 arg0, byte arg1) {
		try {
			this.aLinkedList3324 = new LinkedList();
			Class281 var3 = client.aClass304_9030.method2995(811206633);
			Class381 var4 = client.aClass304_9030.method3022(1149668435);
			Class381 var5 = new Class381(Class85.anInt712, this.anIntArray3322[0], this.anIntArray3326[0]);
			for (int var6 = 1; var6 < this.anInt3325; var6++) {
				Class381 var7 = new Class381(Class85.anInt712, this.anIntArray3322[var6], this.anIntArray3326[var6]);
				while (var7.gameSceneBaseX != var5.gameSceneBaseX || var7.gameSceneBaseY != var5.gameSceneBaseY) {
					if (var5.gameSceneBaseX < var7.gameSceneBaseX) {
						var5.gameSceneBaseX++;
					} else if (var5.gameSceneBaseX > var7.gameSceneBaseX) {
						var5.gameSceneBaseX--;
					}
					if (var5.gameSceneBaseY < var7.gameSceneBaseY) {
						var5.gameSceneBaseY++;
					} else if (var5.gameSceneBaseY > var7.gameSceneBaseY) {
						var5.gameSceneBaseY--;
					}
					int var8 = Class85.anInt712;
					int var9 = var5.gameSceneBaseX - var4.gameSceneBaseX;
					int var10 = var5.gameSceneBaseY - var4.gameSceneBaseY;
					if (var9 >= 0 && var9 < arg0.anInt3667 && var10 >= 0 && var10 < arg0.anInt3654) {
						int var11 = (var9 << 9) + 256;
						int var12 = (var10 << 9) + 256;
						if (var3.method2788(var9, var10, (byte) -14)) {
							var8++;
						}
						this.aLinkedList3324.add(new Class432_Sub1_Sub1_Sub3(arg0, this, Class85.anInt712, var8, var11, Class431.method5342(var11, var12, Class85.anInt712, 1996761881), var12));
					}
				}
				var5 = var7;
			}
		} catch (RuntimeException var13) {
			throw Class476.method5964(var13, "np.p(" + ')');
		}
	}

	public Class327(Class_ra arg0, Buffer arg1, int arg2) {
		this.anInt3323 = arg2;
		this.anInt3325 = arg1.method3764((byte) -27);
		this.anIntArray3322 = new int[this.anInt3325];
		this.anIntArray3326 = new int[this.anInt3325];
		int var4 = arg1.readUnsignedShort(1906561826);
		int var5 = arg1.readUnsignedShort(196863845);
		for (int var6 = 0; var6 < this.anInt3325; var6++) {
			this.anIntArray3322[var6] = var4 + arg1.readByte((byte) 11);
			this.anIntArray3326[var6] = var5 + arg1.readByte((byte) -30);
		}
		this.method3232(arg0, (short) 27740);
	}

	public static final void method3236(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4394[arg0.anInt4397];
			Class158.aClass561_6474.method6464(var2, arg0.anIntArray4387[--arg0.anInt4376], 735096694);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "np.m(" + ')');
		}
	}

	public static final void method3237(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class330_Sub48_Sub4.method3848(var3, var4, arg0, 861085587);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "np.lj(" + ')');
		}
	}

	public static final void method3238(Class430 arg0, int arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			if (var2.startsWith(Class325_Sub4.method3225(0, 770024746)) || var2.startsWith(Class325_Sub4.method3225(1, 1970276429))) {
				var2 = var2.substring(7);
			}
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class113.method1385(var2, (byte) 2);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "np.xr(" + ')');
		}
	}

	public static final void method3239(Class430 arg0, byte arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class360.anInt3753;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "np.ajy(" + ')');
		}
	}

	public static ClientScript method3240(int arg0, byte arg1) {
		try {
			ClientScript var2 = (ClientScript) Class424.aClass378_4326.method4377((long) arg0);
			if (var2 != null) {
				return var2;
			}
			byte[] var3 = Class543.aClass280_6255.getFile(arg0, 0);
			if (var3 == null || var3.length <= 1) {
				return null;
			}
			try {
				var2 = Class403.method4730(var3, -2134721354);
			} catch (Exception var5) {
				throw new RuntimeException(var5.getMessage() + " " + arg0);
			}
			Class424.aClass378_4326.method4378(var2, (long) arg0);
			return var2;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "np.j(" + ')');
		}
	}

	public static final void method3241(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1210;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "np.pd(" + ')');
		}
	}
}
