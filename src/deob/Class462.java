package deob;

public class Class462 implements Interface27 {

	public int anInt6927;

	public void method304() {
		Class330_Sub34 var1 = Class238.method2377(OutgoingPacket.aClass234_2531, client.aClass1_9025.aClass488_22, -45115829);
		var1.aClass330_Sub46_Sub2_7729.addShort(this.anInt6927 * 1483219373 * -969414107, (byte) 108);
		client.aClass1_9025.method378(var1, -2087241245);
	}

	public void method303(byte arg0) {
		try {
			Class330_Sub34 var2 = Class238.method2377(OutgoingPacket.aClass234_2531, client.aClass1_9025.aClass488_22, 1588842058);
			var2.aClass330_Sub46_Sub2_7729.addShort(this.anInt6927, (byte) 51);
			client.aClass1_9025.method378(var2, -129512208);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "te.r(" + ')');
		}
	}

	public void method302() {
		Class330_Sub34 var1 = Class238.method2377(OutgoingPacket.aClass234_2531, client.aClass1_9025.aClass488_22, 1135087359);
		var1.aClass330_Sub46_Sub2_7729.addShort(this.anInt6927 * 1483219373 * -969414107, (byte) 110);
		client.aClass1_9025.method378(var1, -1094559055);
	}

	public void method305() {
		Class330_Sub34 var1 = Class238.method2377(OutgoingPacket.aClass234_2531, client.aClass1_9025.aClass488_22, 1613431209);
		var1.aClass330_Sub46_Sub2_7729.addShort(this.anInt6927 * 1483219373 * -969414107, (byte) 46);
		client.aClass1_9025.method378(var1, -1397428541);
	}

	public Class462(int arg0) {
		this.anInt6927 = arg0;
	}

	public static void method5702(int arg0) {
		try {
			if (client.anInt8995 == 1 && client.aClass1_9025 != null) {
				while (true) {
					Interface27 var1 = (Interface27) Class493.aLinkedList5864.poll();
					if (var1 == null) {
						if (arg0 <= -1607607683) {
						}
						break;
					}
					var1.method303((byte) 6);
				}
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "te.o(" + ')');
		}
	}

	public static final void method5703(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub5_7890.method5754(-2146318829);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "te.amb(" + ')');
		}
	}

	public static final void method5704(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, byte arg3) {
		try {
			arg0.anInt1264 = arg2.anIntArray4387[--arg2.anInt4376];
			Class404.method4738(arg0, 926550033);
			if (arg0.anInt1287 == -1 && !arg1.aBoolean1402) {
				Class374.method4344(arg0.anInt1196, (byte) 6);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "te.ep(" + ')');
		}
	}
}
