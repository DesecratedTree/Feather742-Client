package deob;

public class Class108 {

	public static long aLong1024;

	public static long aLong1025;

	public Class108() throws Throwable {
		throw new Error();
	}

	public static Class470 method1343(byte arg0) {
		try {
			return Class556.aClass470_6390 == null ? Class470.aClass470_6875 : Class556.aClass470_6390;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "ej.z(" + ')');
		}
	}

	public static final void method1344(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4394[arg0.anInt4397];
			Class158.aClass561_6474.method6465(var2, arg0.anIntArray4387[--arg0.anInt4376], (short) 985);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ej.aj(" + ')');
		}
	}

	public static final void method1345(Class430 arg0, byte arg1) {
		try {
			boolean var2 = arg0.anIntArray4387[--arg0.anInt4376] != 0;
			if (Class263_Sub2.myPlayer.aClass408_10240 != null) {
				Class263_Sub2.myPlayer.aClass408_10240.method4763(var2, 690590901);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ej.cd(" + ')');
		}
	}

	public static final void method1346(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			ItemDefinitions var3 = Class556.aClass510_6392.getItemDefinitions(var2, (byte) -28);
			if (var3.notedItemId == -1 && var3.switchNoteItemId >= 0) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.switchNoteItemId;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ej.abh(" + ')');
		}
	}

	public static final void method1347(Class430 arg0, int arg1) {
		try {
			Class1 var2 = Class426.method5317(2042041932);
			Class330_Sub34 var3 = Class238.method2377(OutgoingPacket.QUICK_CHAT_PACKET, var2.aClass488_22, 129921125);
			var3.aClass330_Sub46_Sub2_7729.addByte(0, (byte) 33);
			int var4 = var3.aClass330_Sub46_Sub2_7729.offset;
			var3.aClass330_Sub46_Sub2_7729.addByte(0, (byte) 84);
			var3.aClass330_Sub46_Sub2_7729.addShort(arg0.aClass209_4385.anInt1981, (byte) 9);
			arg0.aClass209_4385.aClass330_Sub36_Sub4_1982.method3450(var3.aClass330_Sub46_Sub2_7729, arg0.aClass209_4385.anIntArray1983, (byte) 47);
			var3.aClass330_Sub46_Sub2_7729.method3751(var3.aClass330_Sub46_Sub2_7729.offset - var4, 668968603);
			var2.method378(var3, -1523612624);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ej.adu(" + ')');
		}
	}

	public static final void method1348(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class263.aClass321_2734.method3173("jagtheora", 1585716873) ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ej.aps(" + ')');
		}
	}

	public static boolean method1349(int arg0, int arg1, int arg2, byte arg3) {
		try {
			Class356 var4 = client.aClass304_9030.method3023(-400722441);
			boolean var5 = true;
			Interface2 var6 = (Interface2) var4.method4154(arg0, arg1, arg2, -2040838155);
			if (var6 != null) {
				var5 &= Class202.method2173(var6, 415703703);
			}
			var6 = (Interface2) var4.method4158(arg0, arg1, arg2, client.anInterface19_9266, (byte) -79);
			if (var6 != null) {
				var5 &= Class202.method2173(var6, 415703703);
			}
			var6 = (Interface2) var4.method4177(arg0, arg1, arg2, 1315717432);
			if (var6 != null) {
				var5 &= Class202.method2173(var6, 415703703);
			}
			return var5;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ej.s(" + ')');
		}
	}

	public static void method1350(int arg0) {
		try {
			Class166_Sub1 var1 = (Class166_Sub1) Class50.aClass145_Sub1_480.method1707(1599556569);
			Class475_Sub3 var2 = (Class475_Sub3) Class50.aClass145_Sub1_480.method1715(1895948341);
			Class260 var3 = var1.method1968((byte) -1);
			Class244 var4 = var2.method5954(1365900914);
			if (client.aClass114_9163 != null) {
				int var5 = client.aClass114_9163.anInt1210;
				int var6 = client.aClass114_9163.anInt1348;
				float var7 = 1000.0F;
				float var8 = (float) (Math.atan((double) ((float) var5 / 2.0F / var7)) * 2.0D);
				float var9 = (float) (Math.atan((double) ((float) var6 / 2.0F / var7)) * 2.0D);
				try {
					Class50.aClass145_Sub1_480.method1690(var8, var9, -1943771105);
				} catch (Exception_Sub4 var11) {
				}
			}
			if (Class464_Sub23.aClass350_8712.method4049(-1047527986)) {
				Class244 var13 = Class244.method2428();
				var13.method2427(1.0F, 0.0F, 0.0F, (float) (Class464_Sub23.aClass350_8712.method4031((short) 17036) - Class242.anInt6984) / 200.0F);
				var4.method2429(var13);
				Class260 var15 = Class260.method2577(0.0F, 1.0F, 0.0F);
				var15.method2570(var4);
				Class244 var17 = Class244.method2428();
				var17.method2425(var15, (float) (Class50.anInt481 - Class464_Sub23.aClass350_8712.method4030(34823472)) / 200.0F);
				var4.method2429(var17);
				var2.method5953(var4, -800915631);
			}
			Class50.anInt481 = Class464_Sub23.aClass350_8712.method4030(34823472);
			Class242.anInt6984 = Class464_Sub23.aClass350_8712.method4031((short) 30831);
			var4.method2423();
			Class260 var14;
			if (Class238.aClass355_2583.isKeyHeld(98, -893714581)) {
				var14 = Class260.method2577(0.0F, 0.0F, 25.0F);
				var14.method2570(var4);
				var14.aFloat2715 *= -1.0F;
				var3.method2558(var14);
			}
			if (Class238.aClass355_2583.isKeyHeld(99, -1987727458)) {
				var14 = Class260.method2577(0.0F, 0.0F, -25.0F);
				var14.method2570(var4);
				var14.aFloat2715 *= -1.0F;
				var3.method2558(var14);
			}
			if (Class238.aClass355_2583.isKeyHeld(96, -623461895)) {
				var14 = Class260.method2577(-25.0F, 0.0F, 0.0F);
				var14.method2570(var4);
				var14.aFloat2715 *= -1.0F;
				var3.method2558(var14);
			}
			if (Class238.aClass355_2583.isKeyHeld(97, -537416079)) {
				var14 = Class260.method2577(25.0F, 0.0F, 0.0F);
				var14.method2570(var4);
				var14.aFloat2715 *= -1.0F;
				var3.method2558(var14);
			}
			Class330_Sub28 var16 = new Class330_Sub28(0, (int) var3.aFloat2716, (int) var3.aFloat2715, (int) var3.aFloat2711);
			var1.method1997(var16, (byte) 112);
			Class50.aClass145_Sub1_480.method1677(0.02F, client.aClass304_9030.method2996(Class85.anInt712, 1875135057), client.aClass304_9030.method3001((byte) 30).anIntArrayArrayArray2793, -276171327);
		} catch (RuntimeException var12) {
			throw Class476.method5964(var12, "ej.p(" + ')');
		}
	}

	public static final void method1351(Class430 arg0, byte arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			Class69.method798(var2, (short) 8192);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ej.sh(" + ')');
		}
	}
}
