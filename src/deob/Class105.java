package deob;

import java.awt.Frame;

public abstract class Class105 {

	public static Interface5 anInterface5_994 = new Class101();

	public int anInt998 = -1;

	public String aString996;

	public int anInt992;

	public Class135 aClass135_999;

	public int anInt997;

	public Class135 aClass135_995;

	public Class123[] aClass123Array993;

	public Class105(Class_ra_Sub2 arg0, Class113 arg1) {
		this.aString996 = arg1.aString1166;
		this.anInt992 = arg1.aClass104Array1165.length;
		this.aClass135_999 = new Class135(this.anInt992, anInterface5_994);
		int var3;
		for (var3 = 0; var3 < this.anInt992; var3++) {
			this.aClass135_999.method1582(var3, arg1.aClass104Array1165[var3].aString988, this.method1261(arg1.aClass104Array1165[var3]), -660533354);
		}
		this.anInt997 = arg1.aClass104Array1169.length;
		this.aClass135_995 = new Class135(this.anInt997, anInterface5_994);
		for (var3 = 0; var3 < this.anInt997; var3++) {
			this.aClass135_995.method1582(var3, arg1.aClass104Array1169[var3].aString988, this.method1261(arg1.aClass104Array1169[var3]), -754497349);
		}
		this.aClass123Array993 = new Class123[arg1.aClass118Array1170.length];
		for (var3 = 0; var3 < arg1.aClass118Array1170.length; var3++) {
			this.aClass123Array993[var3] = this.method1278(arg0, arg1.aClass118Array1170[var3]);
		}
	}

	public String method1252(byte arg0) {
		try {
			return this.aString996;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "eg.p(" + ')');
		}
	}

	public final void method1253(Class330_Sub15_Sub1 arg0, Class249 arg1, int arg2) {
		try {
			this.aClass123Array993[this.anInt998].method1461(arg0, arg1);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "eg.h(" + ')');
		}
	}

	public Class123 method1254(String arg0, int arg1) throws Exception_Sub2_Sub1 {
		try {
			Class123[] var3 = this.aClass123Array993;
			for (int var4 = 0; var4 < var3.length; var4++) {
				Class123 var5 = var3[var4];
				String var6 = var5.method1491(1893570361);
				if (var6 != null && var6.equals(arg0)) {
					if (!var5.method1454()) {
						throw new Exception_Sub2_Sub1(arg0);
					}
					return var5;
				}
			}
			throw new Exception_Sub2_Sub1(arg0);
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "eg.s(" + ')');
		}
	}

	public final int method1255(byte arg0) {
		try {
			return this.aClass123Array993.length;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "eg.f(" + ')');
		}
	}

	public final Class123 method1256(int arg0, int arg1) {
		try {
			return this.aClass123Array993[arg0];
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "eg.z(" + ')');
		}
	}

	public final void method1257(int arg0, Class260 arg1, byte arg2) {
		try {
			this.aClass123Array993[this.anInt998].method1463(arg0, arg1.aFloat2716, arg1.aFloat2715, arg1.aFloat2711);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "eg.ac(" + ')');
		}
	}

	public final Class123 method1259(int arg0) {
		try {
			return this.anInt998 >= 0 ? this.aClass123Array993[this.anInt998] : null;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "eg.b(" + ')');
		}
	}

	public final int method1260(short arg0) {
		try {
			return this.anInt998;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "eg.k(" + ')');
		}
	}

	public final void method1262(Class330_Sub15_Sub1 arg0, float arg1, float arg2, byte arg3) {
		try {
			this.aClass123Array993[this.anInt998].method1456(arg0, arg1, arg2);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "eg.x(" + ')');
		}
	}

	public final void method1263(Class330_Sub15_Sub1 arg0, float arg1, float arg2, float arg3, int arg4) {
		try {
			this.aClass123Array993[this.anInt998].method1457(arg0, arg1, arg2, arg3);
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "eg.g(" + ')');
		}
	}

	public final void method1264(Class330_Sub15_Sub1 arg0, float arg1, float arg2, float arg3, float arg4, int arg5) {
		try {
			this.aClass123Array993[this.anInt998].method1475(arg0, arg1, arg2, arg3, arg4);
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "eg.d(" + ')');
		}
	}

	public void method1265() {
	}

	public final void method1266(Class330_Sub15_Sub1 arg0, Class261 arg1, int arg2) {
		try {
			this.aClass123Array993[this.anInt998].method1475(arg0, arg1.aFloat2717, arg1.aFloat2718, arg1.aFloat2720, arg1.aFloat2719);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "eg.a(" + ')');
		}
	}

	public final void method1267(Class330_Sub15_Sub1 arg0, float[] arg1, int arg2) {
		try {
			this.aClass123Array993[this.anInt998].method1494(arg0, arg1, arg1.length);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "eg.e(" + ')');
		}
	}

	public final void method1268(Class330_Sub15_Sub1 arg0, int arg1, short arg2) {
		try {
			float var4 = (float) (arg1 >> 16 & 0xFF) / 255.0F;
			float var5 = (float) (arg1 >> 8 & 0xFF) / 255.0F;
			float var6 = (float) (arg1 & 0xFF) / 255.0F;
			float var7 = (float) (arg1 >> 24 & 0xFF) / 255.0F;
			this.method1264(arg0, var4, var5, var6, var7, -236422392);
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "eg.m(" + ')');
		}
	}

	public final void method1269(Class330_Sub15_Sub1 arg0, Class249 arg1, int arg2) {
		try {
			this.aClass123Array993[this.anInt998].method1460(arg0, arg1);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "eg.t(" + ')');
		}
	}

	public final void method1270(Class330_Sub15_Sub1 arg0, int arg1, Interface11 arg2, byte arg3) {
		try {
			this.aClass123Array993[this.anInt998].method1462(arg0, arg1, arg2);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "eg.y(" + ')');
		}
	}

	public final void method1271(int arg0, float arg1, float arg2, float arg3, int arg4) {
		try {
			this.aClass123Array993[this.anInt998].method1463(arg0, arg1, arg2, arg3);
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "eg.v(" + ')');
		}
	}

	public final void method1272(int arg0, float arg1, float arg2, float arg3, float arg4, int arg5) {
		try {
			this.aClass123Array993[this.anInt998].method1464(arg0, arg1, arg2, arg3, arg4);
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "eg.ay(" + ')');
		}
	}

	public final void method1274(int arg0, float[] arg1, int arg2, int arg3) {
		try {
			this.aClass123Array993[this.anInt998].method1488(arg0, arg1, arg2);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "eg.al(" + ')');
		}
	}

	public final void method1275(int arg0, Class249 arg1, int arg2) {
		try {
			this.aClass123Array993[this.anInt998].method1466(arg0, arg1);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "eg.aw(" + ')');
		}
	}

	public final void method1276(int arg0, Class249 arg1, byte arg2) {
		try {
			this.aClass123Array993[this.anInt998].method1467(arg0, arg1);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "eg.ap(" + ')');
		}
	}

	public final void method1277(int arg0, int arg1, Interface11 arg2, int arg3) {
		try {
			this.aClass123Array993[this.anInt998].method1468(arg0, arg1, arg2);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "eg.ai(" + ')');
		}
	}

	public int method1279(int arg0) {
		try {
			return this.anInt997;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "eg.aj(" + ')');
		}
	}

	public Class330_Sub15_Sub1 method1280(int arg0, int arg1) {
		try {
			return (Class330_Sub15_Sub1) this.aClass135_995.method1579(arg0, 1993020690);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "eg.ax(" + ')');
		}
	}

	public Class330_Sub15_Sub1 method1281(String arg0, int arg1) {
		try {
			return (Class330_Sub15_Sub1) this.aClass135_995.method1580(arg0, (byte) -23);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "eg.ad(" + ')');
		}
	}

	public int method1282(byte arg0) {
		try {
			return this.anInt992;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "eg.an(" + ')');
		}
	}

	public final void method1283(Class330_Sub15_Sub1 arg0, Class260 arg1, byte arg2) {
		try {
			this.aClass123Array993[this.anInt998].method1457(arg0, arg1.aFloat2716, arg1.aFloat2715, arg1.aFloat2711);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "eg.c(" + ')');
		}
	}

	public Class123 method1288(byte arg0) {
		try {
			Class123[] var2 = this.aClass123Array993;
			for (int var3 = 0; var3 < var2.length; var3++) {
				Class123 var4 = var2[var3];
				if (var4.method1454()) {
					return var4;
				}
			}
			return null;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "eg.n(" + ')');
		}
	}

	public final void method1290(int arg0, Class249 arg1, int arg2) {
		try {
			this.aClass123Array993[this.anInt998].method1498(arg0, arg1);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "eg.at(" + ')');
		}
	}

	public Class330_Sub15_Sub1 method1295(String arg0, byte arg1) throws Exception_Sub2_Sub2 {
		try {
			Class330_Sub15_Sub1 var3 = (Class330_Sub15_Sub1) this.aClass135_999.method1580(arg0, (byte) -27);
			if (var3 == null) {
				throw new Exception_Sub2_Sub2(arg0);
			}
			return var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "eg.as(" + ')');
		}
	}

	public int method1297(Class123 arg0, int arg1) {
		try {
			for (int var3 = 0; var3 < this.aClass123Array993.length; var3++) {
				if (arg0 == this.aClass123Array993[var3]) {
					return var3;
				}
			}
			return -1;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "eg.w(" + ')');
		}
	}

	public Class330_Sub15_Sub1 method1298(int arg0, int arg1) {
		try {
			return (Class330_Sub15_Sub1) this.aClass135_999.method1579(arg0, 1911106709);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "eg.af(" + ')');
		}
	}

	public final void method1301(Class330_Sub15_Sub1 arg0, float arg1, byte arg2) {
		try {
			this.aClass123Array993[this.anInt998].method1455(arg0, arg1);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "eg.u(" + ')');
		}
	}

	public static void method1305(Class_ra arg0, int arg1) {
		try {
			int var2 = Class89.anInt736;
			int var3 = Class85.anInt713;
			int var4 = Class550.anInt6288;
			int var5 = Class406.anInt4194 - 3;
			byte var6 = 20;
			if (Class483.aClass263_5775 == null || Class384.aClass524_3969 == null) {
				Class483.aClass263_5775 = (Class263) Class219.aClass230_2183.method2331(client.anInterface12_9243, Class457.anInt6842, true, true, (byte) 61);
				Class384.aClass524_3969 = Class219.aClass230_2183.method2333(client.anInterface12_9243, Class457.anInt6842, 898484130);
				if (Class483.aClass263_5775 != null && Class384.aClass524_3969 != null) {
					Class513.method6194((byte) -33);
					int var16 = var2 + var4 / 2;
					if (var16 + var4 > Class300.anInt3058) {
						var16 = Class300.anInt3058 - var4;
					}
					if (var16 < 0) {
						var16 = 0;
					}
					Class330.method3258(var16, Class85.anInt713, -1547661022);
					return;
				}
			}
			Class263 var7;
			if (Class483.aClass263_5775 == null || Class384.aClass524_3969 == null) {
				var7 = Class166_Sub3_Sub2.aClass263_9483;
			} else {
				var7 = Class483.aClass263_5775;
			}
			Class524 var8 = Class359.method4239((byte) 25);
			Class212.method2226(arg0, Class89.anInt736, Class85.anInt713, Class550.anInt6288, Class406.anInt4194, var6, var7, var8, Class526.aClass526_6062.method6257(Class429.aClass454_4369, 991479434), 1634538191);
			int var9 = 255 - Class452.anInt5560 - Class484.anInt5809;
			if (var9 < 0) {
				var9 = 0;
			}
			int var10 = Class464_Sub23.aClass350_8712.method4030(34823472);
			int var11 = Class464_Sub23.aClass350_8712.method4031((short) 24395);
			int var12;
			Class330_Sub36_Sub10 var13;
			int var14;
			Class330_Sub36_Sub13 var17;
			if (Class484.aBoolean5783) {
				var12 = 0;
				for (var17 = (Class330_Sub36_Sub13) Class484.aClass472_5793.method5884((byte) 42); var17 != null; var17 = (Class330_Sub36_Sub13) Class484.aClass472_5793.method5886((short) 8192)) {
					var14 = var8.anInt6033 + var6 + var3 + 1 + var12 * Class484.anInt5779;
					if (var10 > Class89.anInt736 && var10 < Class550.anInt6288 + Class89.anInt736 && var11 > var14 - var8.anInt6033 - 1 && var11 < var8.anInt6035 + var14 && (var17.anInt9715 > 1 || ((Class330_Sub36_Sub10) var17.aClass472_9716.aClass330_Sub36_5613.aClass330_Sub36_7735).aBoolean9692)) {
						arg0.B(Class89.anInt736, var14 - var8.anInt6033, Class550.anInt6288, Class484.anInt5779, var9 << 24 | Class_na.anInt9724, 1);
					}
					var12++;
				}
				if (Class484.aClass330_Sub36_Sub13_5784 != null) {
					Class212.method2226(arg0, Class62.anInt561, Class246.anInt6586, Class116.anInt1374, Class95_Sub13.anInt7181, var6, var7, var8, Class484.aClass330_Sub36_Sub13_5784.aString9717, 1799963507);
					var12 = 0;
					for (var13 = (Class330_Sub36_Sub10) Class484.aClass330_Sub36_Sub13_5784.aClass472_9716.method5884((byte) 125); var13 != null; var13 = (Class330_Sub36_Sub10) Class484.aClass330_Sub36_Sub13_5784.aClass472_9716.method5886((short) 8192)) {
						var14 = var6 + Class246.anInt6586 + var8.anInt6033 + 1 + var12 * Class484.anInt5779;
						if (var10 > Class62.anInt561 && var10 < Class62.anInt561 + Class116.anInt1374 && var11 > var14 - var8.anInt6033 - 1 && var11 < var8.anInt6035 + var14 && var13.aBoolean9692) {
							arg0.B(Class62.anInt561, var14 - var8.anInt6033, Class116.anInt1374, Class484.anInt5779, var9 << 24 | Class_na.anInt9724, 1);
						}
						var12++;
					}
					Class528.method6271(arg0, Class62.anInt561, Class246.anInt6586, Class116.anInt1374, Class95_Sub13.anInt7181, var6, 1647852795);
				}
			} else {
				var12 = 0;
				for (var13 = (Class330_Sub36_Sub10) Class484.aClass471_5791.method5869(539664854); var13 != null; var13 = (Class330_Sub36_Sub10) Class484.aClass471_5791.method5873((byte) -122)) {
					var14 = var8.anInt6033 + var6 + var3 + 1 + (Class484.anInt5786 - 1 - var12) * Class484.anInt5779;
					if (var10 > Class89.anInt736 && var10 < Class550.anInt6288 + Class89.anInt736 && var11 > var14 - var8.anInt6033 - 1 && var11 < var14 + var8.anInt6035 && var13.aBoolean9692) {
						arg0.B(Class89.anInt736, var14 - var8.anInt6033, Class550.anInt6288, Class484.anInt5779, var9 << 24 | Class_na.anInt9724, 1);
					}
					var12++;
				}
			}
			Class528.method6271(arg0, Class89.anInt736, Class85.anInt713, Class550.anInt6288, Class406.anInt4194, var6, 2068124805);
			if (Class484.aBoolean5783) {
				var12 = 0;
				for (var17 = (Class330_Sub36_Sub13) Class484.aClass472_5793.method5884((byte) 79); var17 != null; var17 = (Class330_Sub36_Sub13) Class484.aClass472_5793.method5886((short) 8192)) {
					var14 = var6 + Class85.anInt713 + var8.anInt6033 + 1 + var12 * Class484.anInt5779;
					if (var17.anInt9715 == 1) {
						Class330_Sub36_Sub5.method3462(var10, var11, Class89.anInt736, Class85.anInt713, Class550.anInt6288, Class406.anInt4194, var14, (Class330_Sub36_Sub10) var17.aClass472_9716.aClass330_Sub36_5613.aClass330_Sub36_7735, var7, var8, Class451.anInt6643 | 0xFF000000, Class171.anInt1727 | 0xFF000000, -1723018933);
					} else {
						Class392.method4613(var10, var11, Class89.anInt736, Class85.anInt713, Class550.anInt6288, Class406.anInt4194, var14, var17, var7, var8, Class451.anInt6643 | 0xFF000000, Class171.anInt1727 | 0xFF000000, 2123201560);
					}
					var12++;
				}
				if (Class484.aClass330_Sub36_Sub13_5784 != null) {
					var12 = 0;
					for (var13 = (Class330_Sub36_Sub10) Class484.aClass330_Sub36_Sub13_5784.aClass472_9716.method5884((byte) 127); var13 != null; var13 = (Class330_Sub36_Sub10) Class484.aClass330_Sub36_Sub13_5784.aClass472_9716.method5886((short) 8192)) {
						var14 = Class246.anInt6586 + 1 + var6 + var8.anInt6033 + var12 * Class484.anInt5779;
						Class330_Sub36_Sub5.method3462(var10, var11, Class62.anInt561, Class246.anInt6586, Class116.anInt1374, Class95_Sub13.anInt7181, var14, var13, var7, var8, Class451.anInt6643 | 0xFF000000, Class171.anInt1727 | 0xFF000000, -2035093866);
						var12++;
					}
				}
			} else {
				var12 = 0;
				for (var13 = (Class330_Sub36_Sub10) Class484.aClass471_5791.method5869(539664854); var13 != null; var13 = (Class330_Sub36_Sub10) Class484.aClass471_5791.method5873((byte) -40)) {
					var14 = Class484.anInt5779 * (Class484.anInt5786 - 1 - var12) + 1 + var3 + var6 + var8.anInt6033;
					Class330_Sub36_Sub5.method3462(var10, var11, var2, var3, var4, var5, var14, var13, var7, var8, Class451.anInt6643 | 0xFF000000, Class171.anInt1727 | 0xFF000000, -1743813553);
					var12++;
				}
			}
		} catch (RuntimeException var15) {
			throw Class476.method5964(var15, "eg.bg(" + ')');
		}
	}

	public static void method1306(Class432_Sub1_Sub1_Sub1 arg0, int arg1) {
		try {
			if (arg0 instanceof NPC) {
				NPC var2 = (NPC) arg0;
				if (var2.aClass551_10251 != null) {
					Class411.method5233(var2, var2.aByte8658 != Class263_Sub2.myPlayer.aByte8658, 217522972);
				}
			} else if (arg0 instanceof Player) {
				Player var4 = (Player) arg0;
				Class497.method6103(var4, Class263_Sub2.myPlayer.aByte8658 != var4.aByte8658, -7972581);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "eg.c(" + ')');
		}
	}

	public static final void method1307(Class430 arg0, short arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			Class330_Sub34 var3 = Class238.method2377(OutgoingPacket.aClass234_2515, client.aClass1_9025.aClass488_22, 1746076126);
			var3.aClass330_Sub46_Sub2_7729.addByte(var2.length() + 1, (byte) 83);
			var3.aClass330_Sub46_Sub2_7729.addString(var2, (byte) -14);
			client.aClass1_9025.method378(var3, -1666030416);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "eg.tg(" + ')');
		}
	}

	public static void method1308(String[] arg0, int[] arg1, int arg2) {
		try {
			Class208.method2206(arg0, arg1, 0, arg0.length - 1, -666175109);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "eg.i(" + ')');
		}
	}

	public static Frame method1309(Class504 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			if (arg3 == 0) {
				Class501[] var6 = Class3.method396(arg0, 16711935);
				if (var6 == null) {
					return null;
				}
				boolean var7 = false;
				for (int var8 = 0; var8 < var6.length; var8++) {
					if (arg1 == var6[var8].anInt5897 && var6[var8].anInt5896 == arg2 && (arg4 == 0 || arg4 == var6[var8].anInt5898) && (!var7 || var6[var8].anInt5895 > arg3)) {
						arg3 = var6[var8].anInt5895;
						var7 = true;
					}
				}
				if (!var7) {
					return null;
				}
			}
			Frame var10 = new Frame("Jagex Full Screen");
			var10.setResizable(false);
			arg0.method6137(var10, arg1, arg2, arg3, arg4, 624416167);
			return var10;
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "eg.j(" + ')');
		}
	}

	public static int method1310(byte[][] arg0, byte[][] arg1, int[] arg2, byte[] arg3, int[] arg4, int arg5, int arg6, byte arg7) {
		try {
			int var8 = arg2[arg5];
			int var9 = arg4[arg5] + var8;
			int var10 = arg2[arg6];
			int var11 = var10 + arg4[arg6];
			int var12 = var8;
			if (var10 > var8) {
				var12 = var10;
			}
			int var13 = var9;
			if (var11 < var9) {
				var13 = var11;
			}
			int var14 = arg3[arg5] & 0xFF;
			if ((arg3[arg6] & 0xFF) < var14) {
				var14 = arg3[arg6] & 0xFF;
			}
			byte[] var15 = arg1[arg5];
			byte[] var16 = arg0[arg6];
			int var17 = var12 - var8;
			int var18 = var12 - var10;
			for (int var19 = var12; var19 < var13; var19++) {
				int var20 = var15[var17++] + var16[var18++];
				if (var20 < var14) {
					var14 = var20;
				}
			}
			return -var14;
		} catch (RuntimeException var21) {
			throw Class476.method5964(var21, "eg.i(" + ')');
		}
	}

	public static final void method1311(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 3;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			Class498.method6110(7, var2 << 16 | var3, var4, "", (byte) -124);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "eg.anr(" + ')');
		}
	}

	public static final void method1312(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class413.anInt4260;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "eg.aob(" + ')');
		}
	}

	public abstract void method1249();

	public abstract void method1250();

	public abstract boolean method1251();

	public abstract boolean method1258(Class123 arg0);

	public abstract Class330_Sub15_Sub1 method1261(Class104 arg0);

	public abstract void method1273();

	public abstract Class123 method1278(Class_ra_Sub2 arg0, Class118 arg1);

	public abstract void method1284();

	public abstract void method1285();

	public abstract void method1286();

	public abstract boolean method1287();

	public abstract Class123 method1289(Class_ra_Sub2 arg0, Class118 arg1);

	public abstract boolean method1291(Class123 arg0);

	public abstract boolean method1292(Class123 arg0);

	public abstract boolean method1293(Class123 arg0);

	public abstract void method1294();

	public abstract Class123 method1296(Class_ra_Sub2 arg0, Class118 arg1);

	public abstract Class123 method1299(Class_ra_Sub2 arg0, Class118 arg1);

	public abstract boolean method1300();

	public abstract Class123 method1302(Class_ra_Sub2 arg0, Class118 arg1);

	public abstract boolean method1303();

	public abstract Class330_Sub15_Sub1 method1304(Class104 arg0);
}
