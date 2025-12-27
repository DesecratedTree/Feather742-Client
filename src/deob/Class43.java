package deob;

public class Class43 implements Interface8_Impl1_Impl1 {

	public int anInt10071;

	public int anInt10070;

	public float[] aFloatArray10072;

	public static Class276 aClass276_10073;

	public int method57() {
		return this.anInt10071 * -287555689 * 1684680743;
	}

	public int method54() {
		try {
			return this.anInt10071;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "bt.r(" + ')');
		}
	}

	public int method55() {
		try {
			return this.anInt10070;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "bt.i(" + ')');
		}
	}

	public void method53() {
	}

	public int method60() {
		return this.anInt10070 * -190521949 * -308330997;
	}

	public Class43(int arg0, int arg1) {
		this.anInt10071 = arg0;
		this.anInt10070 = arg1;
		this.aFloatArray10072 = new float[this.anInt10070 * this.anInt10071];
	}

	public int method56() {
		return this.anInt10071 * -287555689 * 1684680743;
	}

	public int method59() {
		return this.anInt10070 * -190521949 * -308330997;
	}

	public int method58() {
		return this.anInt10071 * -287555689 * 1684680743;
	}

	public int method61() {
		return this.anInt10070 * -190521949 * -308330997;
	}

	public void method52() {
	}

	public static void method583(IndexTable arg0, int arg1) {
		try {
			Class208.aClass280_1954 = arg0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "bt.r(" + ')');
		}
	}

	public static final void method584(Class430 arg0, int arg1) {
		try {
			if (arg0.anIntArray4387[--arg0.anInt4376] == 1) {
				arg0.anInt4397 += arg0.anIntArray4394[arg0.anInt4397];
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "bt.be(" + ')');
		}
	}

	public static final void method585(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			arg0.anInt1238 = 5;
			arg0.anInt1239 = arg2.anIntArray4387[--arg2.anInt4376];
			if (arg0.anInt1287 == -1 && !arg1.aBoolean1402) {
				Class70.method822(arg0.anInt1196, 622067324);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "bt.ir(" + ')');
		}
	}

	public static boolean method586(char arg0, int arg1) {
		try {
			if (arg0 > 0 && arg0 < 128 || arg0 >= 160 && arg0 <= 255) {
				return true;
			}
			if (arg0 != 0) {
				char[] var2 = Class458.aCharArray5564;
				for (int var3 = 0; var3 < var2.length; var3++) {
					char var4 = var2[var3];
					if (arg0 == var4) {
						return true;
					}
				}
			}
			return false;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "bt.j(" + ')');
		}
	}

	public static final void method587(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 3;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = arg0.aClass154_4391.method1816(var2, var3, var4, (byte) -28);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "bt.xa(" + ')');
		}
	}

	public static final void method588(Class432_Sub1_Sub1_Sub1 arg0, int arg1) {
		try {
			Class477 var2 = arg0.aClass477_10032;
			if (arg0.anInt10038 == client.anInt8981 || !var2.method5966(-1848715708) || var2.method5971(1, 1945279217)) {
				int var3 = arg0.anInt10038 - arg0.anInt10058;
				int var4 = client.anInt8981 - arg0.anInt10058;
				int var5 = arg0.anInt10034 * 512 + arg0.method5453(-1950629435) * 256;
				int var6 = arg0.anInt10045 * 512 + arg0.method5453(-505036223) * 256;
				int var7 = arg0.anInt10057 * 512 + arg0.method5453(-1512752134) * 256;
				int var8 = arg0.anInt10036 * 512 + arg0.method5453(-412961104) * 256;
				Class260 var9 = arg0.method5346().aClass260_2606;
				arg0.method5348((float) ((var7 * var4 + var5 * (var3 - var4)) / var3), (float) var9.aFloat2715, (float) ((var8 * var4 + (var3 - var4) * var6) / var3));
			}
			arg0.anInt10060 = 0;
			arg0.method5411(arg0.anInt10040, false, 1066647297);
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "bt.hj(" + ')');
		}
	}

	public static void method589(int arg0, int arg1, byte arg2) {
		try {
			Class330_Sub34 var3 = Class238.method2377(OutgoingPacket.DIALOGUE_CONTINUE_PACKET, client.aClass1_9025.aClass488_22, 797223972);
			var3.aClass330_Sub46_Sub2_7729.addLEShort(arg1, -676872267);
			var3.aClass330_Sub46_Sub2_7729.addInt1(arg0, (byte) 15);
			client.aClass1_9025.method378(var3, -1427205506);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "bt.ki(" + ')');
		}
	}

	public static final void method590(String arg0, int arg1) {
		try {
			if (arg0 != null) {
				if ((client.anInt9256 < 200 || client.aBoolean9122) && client.anInt9256 < 200) {
					String var2 = Class531.method6297(arg0, -1670105506);
					if (var2 != null) {
						int var3;
						String var5;
						String var6;
						for (var3 = 0; var3 < client.anInt9256; var3++) {
							Class99 var4 = client.aClass99Array9259[var3];
							var5 = Class531.method6297(var4.aString915, -2103703455);
							if (var5 != null && var5.equals(var2)) {
								Class475_Sub2.method5952(4, arg0 + Class526.aClass526_6180.method6257(Class429.aClass454_4369, 991479434), -1314753536);
								return;
							}
							if (var4.aString910 != null) {
								var6 = Class531.method6297(var4.aString910, -1631001495);
								if (var6 != null && var6.equals(var2)) {
									Class475_Sub2.method5952(4, arg0 + Class526.aClass526_6180.method6257(Class429.aClass454_4369, 991479434), -631265340);
									return;
								}
							}
						}
						for (var3 = 0; var3 < client.anInt9261; var3++) {
							Class75 var8 = client.aClass75Array8982[var3];
							var5 = Class531.method6297(var8.aString646, -1847889191);
							if (var5 != null && var5.equals(var2)) {
								Class475_Sub2.method5952(4, Class526.aClass526_6186.method6257(Class429.aClass454_4369, 991479434) + arg0 + Class526.aClass526_6187.method6257(Class429.aClass454_4369, 991479434), -846920675);
								return;
							}
							if (var8.aString647 != null) {
								var6 = Class531.method6297(var8.aString647, -1815882146);
								if (var6 != null && var6.equals(var2)) {
									Class475_Sub2.method5952(4, Class526.aClass526_6186.method6257(Class429.aClass454_4369, 991479434) + arg0 + Class526.aClass526_6187.method6257(Class429.aClass454_4369, 991479434), -2091308795);
									return;
								}
							}
						}
						if (Class531.method6297(Class263_Sub2.myPlayer.aString10221, -2019356879).equals(var2)) {
							Class475_Sub2.method5952(4, Class526.aClass526_6183.method6257(Class429.aClass454_4369, 991479434), -1958470986);
						} else {
							Class1 var9 = Class426.method5317(1865905229);
							Class330_Sub34 var10 = Class238.method2377(OutgoingPacket.ADD_FRIEND_PACKET, var9.aClass488_22, -322332700);
							var10.aClass330_Sub46_Sub2_7729.addByte(Class57.method659(arg0, -821051321), (byte) 56);
							var10.aClass330_Sub46_Sub2_7729.addString(arg0, (byte) -119);
							var9.method378(var10, -1193159166);
						}
					}
				} else {
					Class475_Sub2.method5952(4, Class526.aClass526_6071.method6257(Class429.aClass454_4369, 991479434), -876198841);
				}
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "bt.mv(" + ')');
		}
	}

	public static void method591(int arg0) {
		try {
			Class239.aBoolean2593 = true;
			Class367.aString3863 = Class360.username;
			Class464_Sub4.aString8670 = Class360.password;
			Class330_Sub31.logout(false, 1971153935);
			Class239.aClass258Array2585 = null;
			Class422.aClass277_4322 = null;
			Class227.method2311(12, -1188873169);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "bt.r(" + ')');
		}
	}
}
