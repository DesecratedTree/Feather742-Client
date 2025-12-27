package deob;

import java.awt.Container;
import java.awt.Frame;
import java.io.File;
import javax.swing.JFileChooser;

public class Class19 implements Runnable {

	public File aFile241 = null;

	public boolean aBoolean242 = false;

	public String aString240;

	public boolean aBoolean239;

	public static String aString243;

	public Class19(String arg0, boolean arg1) {
		this.aString240 = arg0;
		this.aBoolean239 = arg1;
		(new Thread(this)).start();
	}

	public boolean method454(int arg0) {
		try {
			return this.aBoolean242;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "at.j(" + ')');
		}
	}

	public File method455(int arg0) {
		try {
			return this.aFile241;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "at.r(" + ')');
		}
	}

	public boolean method456(int arg0) {
		try {
			return this.aBoolean239;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "at.i(" + ')');
		}
	}

	public void run() {
		try {
			Container var1 = Class432_Sub1_Sub3_Sub1.method5526((byte) 124);
			Frame var2 = null;
			if (Class267.aFrame2740 == null) {
				while (var1 != null) {
					if (var1 instanceof Frame) {
						var2 = (Frame) var1;
						break;
					}
					var1 = var1.getParent();
				}
			} else {
				var2 = Class267.aFrame2740;
			}
			if (var2 == null) {
				throw new RuntimeException("");
			}
			JFileChooser var3 = new JFileChooser("");
			var3.setDialogTitle(this.aString240);
			var3.setFileFilter(new FileFilter_Sub1(this, this));
			var3.setFileSelectionMode(1);
			var3.setAcceptAllFileFilterUsed(false);
			int var4 = var3.showOpenDialog(var2);
			if (var4 == 0) {
				this.aFile241 = var3.getSelectedFile();
			}
			this.aBoolean242 = true;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "at.run(" + ')');
		}
	}

	public static void method457(int arg0, String arg1, int arg2, short arg3) {
		try {
			ClientScript var4 = IsaacCipher.method6051(Class545.aClass545_6994, arg0, -1, (byte) -66);
			if (var4 != null) {
				Class430 var5 = Class325_Sub6.method3229((byte) 71);
				var5.anIntArray4388 = new int[var4.anInt9676];
				var5.anObjectArray4375 = new String[var4.anInt9672];
				var5.anObjectArray4375[0] = arg1;
				var5.anIntArray4388[0] = arg2;
				Class330_Sub12.method3302(var4, 200000, var5, -1871065489);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "at.b(" + ')');
		}
	}

	public static final void method458(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			if (client.anInt9257 == 2 && var2 >= 0 && var2 < client.anInt9256) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.aClass99Array9259[var2].anInt914;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "at.xg(" + ')');
		}
	}

	public static final void method459(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			Class458.method5670(var2, var3 >> 14 & 0x3FFF, var3 & 0x3FFF, false, -1491137655);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "at.aed(" + ')');
		}
	}

	public static final void method460(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub18_7877.method5801((byte) 7);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "at.alm(" + ')');
		}
	}

	public static final void method461(Class430 arg0, int arg1) {
		try {
			if (Class401_Sub1.aClass145_Sub1_8249.method1718(2126958485) != Class146.aClass146_1609) {
				throw new RuntimeException();
			}
			Class475_Sub2 var2 = (Class475_Sub2) Class401_Sub1.aClass145_Sub1_8249.method1715(1760245012);
			var2.method5948(Class374.aClass245_6659, -1, (short) -5463);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "at.aha(" + ')');
		}
	}

	public static void method462(int arg0) {
		try {
			Class330_Sub34 var1 = Class238.method2377(OutgoingPacket.SCREEN_PACKET, client.aClass1_9025.aClass488_22, 2093421754);
			var1.aClass330_Sub46_Sub2_7729.addByte(Class545.method6347(1079239502), (byte) 78);
			var1.aClass330_Sub46_Sub2_7729.addShort(Class300.anInt3058, (byte) 54);
			var1.aClass330_Sub46_Sub2_7729.addShort(Class146.anInt1615, (byte) 51);
			var1.aClass330_Sub46_Sub2_7729.addByte(Class448.aClass330_Sub50_5555.aClass464_Sub9_7874.method5766((byte) 1), (byte) 9);
			client.aClass1_9025.method378(var1, -524378012);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "at.ga(" + ')');
		}
	}

	public static Class501[] method463(int arg0) {
		try {
			if (Class317.aClass501Array3278 == null) {
				Class501[] var1 = Class3.method396(Class203.aClass504_6790, 16711935);
				Class501[] var2 = new Class501[var1.length];
				int var3 = 0;
				int var4 = Class448.aClass330_Sub50_5555.aClass464_Sub5_7890.method5754(-1866616639);
				label85: for (int var5 = 0; var5 < var1.length; var5++) {
					Class501 var6 = var1[var5];
					if (var6.anInt5895 > 0 && var6.anInt5895 < 24) {
						if (arg0 <= -120809114) {
						}
					} else if (var6.anInt5897 >= 800) {
						if (var6.anInt5896 >= 600) {
							if (var4 == 2) {
								if (var6.anInt5897 > 800) {
									continue;
								}
								if (var6.anInt5896 > 600) {
									if (arg0 <= -120809114) {
										throw new IllegalStateException();
									}
									continue;
								}
							}
							if (var4 == 1) {
								if (var6.anInt5897 > 1024) {
									continue;
								}
								if (var6.anInt5896 > 768) {
									if (arg0 <= -120809114) {
									}
									continue;
								}
							}
							for (int var7 = 0; var7 < var3; var7++) {
								Class501 var8 = var2[var7];
								if (var6.anInt5897 == var8.anInt5897 && var6.anInt5896 == var8.anInt5896) {
									if (var6.anInt5895 > var8.anInt5895) {
										var2[var7] = var6;
									}
									continue label85;
								}
							}
							var2[var3] = var6;
							var3++;
						} else if (arg0 <= -120809114) {
						}
					}
				}
				Class317.aClass501Array3278 = new Class501[var3];
				System.arraycopy(var2, 0, Class317.aClass501Array3278, 0, var3);
				int[] var10 = new int[Class317.aClass501Array3278.length];
				for (int var11 = 0; var11 < Class317.aClass501Array3278.length; var11++) {
					Class501 var12 = Class317.aClass501Array3278[var11];
					var10[var11] = var12.anInt5896 * var12.anInt5897;
				}
				Class398.method4686(var10, Class317.aClass501Array3278, -1552717966);
			}
			return Class317.aClass501Array3278;
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "at.hm(" + ')');
		}
	}
}
