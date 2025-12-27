package deob;

public class Class95_Sub1 extends Class95 {

	public int anInt7117;

	public int anInt7116;

	public Class95_Sub1(Buffer arg0) {
		super(arg0);
		this.anInt7117 = arg0.readUnsignedShort(784156759);
		this.anInt7116 = arg0.readInt((byte) 43);
	}

	public void method1100() {
		client.anInt8969 = client.anInt8981 * 502167573 * 659076639 * 646655779;
		client.anInt9043 = (client.anInt8981 * 659076639 * 251377275 + this.anInt7117 * -1476799791 * -1737837611) * -1114955027;
		Class119.anInt1398 = client.anInt9044 * 1749608367 * -427114855 * -137644505;
		Class166_Sub1.anInt7324 = client.anInt9045 * -338808869 * -198718745 * 1532586421;
		Class404.anInt4160 = client.anInt9070 * 922968097 * -121693463 * -1562288807 * 1130636257;
		Class554.anInt6378 = client.anInt9047 * 801297641 * -801864245 * 506755043 * 1616069465;
		client.anInt9044 = (this.anInt7116 * 1158756593 * -1479624687 >>> 24) * -427114855 * 1217836457;
		client.anInt9045 = (-1479624687 * this.anInt7116 * 1158756593 >>> 16 & 0xFF) * -338808869 * -1716898733;
		client.anInt9070 = (this.anInt7116 * 1158756593 * -1479624687 >>> 8 & 0xFF) * 922968097 * 1130636257;
		client.anInt9047 = (this.anInt7116 * -1479624687 * 1158756593 & 0xFF) * 801297641 * 1616069465;
	}

	public void method1095(int arg0) {
		try {
			client.anInt8969 = client.anInt8981;
			client.anInt9043 = client.anInt8981 + this.anInt7117;
			Class119.anInt1398 = client.anInt9044;
			Class166_Sub1.anInt7324 = client.anInt9045;
			Class404.anInt4160 = client.anInt9070;
			Class554.anInt6378 = client.anInt9047;
			client.anInt9044 = this.anInt7116 >>> 24;
			client.anInt9045 = this.anInt7116 >>> 16 & 0xFF;
			client.anInt9070 = this.anInt7116 >>> 8 & 0xFF;
			client.anInt9047 = this.anInt7116 & 0xFF;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aac.j(" + ')');
		}
	}

	public void method1098() {
		client.anInt8969 = client.anInt8981 * 502167573 * 659076639 * 646655779;
		client.anInt9043 = (client.anInt8981 * 659076639 * 251377275 + this.anInt7117 * -1476799791 * -1737837611) * -1114955027;
		Class119.anInt1398 = client.anInt9044 * 1749608367 * -427114855 * -137644505;
		Class166_Sub1.anInt7324 = client.anInt9045 * -338808869 * -198718745 * 1532586421;
		Class404.anInt4160 = client.anInt9070 * 922968097 * -121693463 * -1562288807 * 1130636257;
		Class554.anInt6378 = client.anInt9047 * 801297641 * -801864245 * 506755043 * 1616069465;
		client.anInt9044 = (this.anInt7116 * 1158756593 * -1479624687 >>> 24) * -427114855 * 1217836457;
		client.anInt9045 = (-1479624687 * this.anInt7116 * 1158756593 >>> 16 & 0xFF) * -338808869 * -1716898733;
		client.anInt9070 = (this.anInt7116 * 1158756593 * -1479624687 >>> 8 & 0xFF) * 922968097 * 1130636257;
		client.anInt9047 = (this.anInt7116 * -1479624687 * 1158756593 & 0xFF) * 801297641 * 1616069465;
	}

	public void method1099() {
		client.anInt8969 = client.anInt8981 * 502167573 * 659076639 * 646655779;
		client.anInt9043 = (client.anInt8981 * 659076639 * 251377275 + this.anInt7117 * -1476799791 * -1737837611) * -1114955027;
		Class119.anInt1398 = client.anInt9044 * 1749608367 * -427114855 * -137644505;
		Class166_Sub1.anInt7324 = client.anInt9045 * -338808869 * -198718745 * 1532586421;
		Class404.anInt4160 = client.anInt9070 * 922968097 * -121693463 * -1562288807 * 1130636257;
		Class554.anInt6378 = client.anInt9047 * 801297641 * -801864245 * 506755043 * 1616069465;
		client.anInt9044 = (this.anInt7116 * 1158756593 * -1479624687 >>> 24) * -427114855 * 1217836457;
		client.anInt9045 = (-1479624687 * this.anInt7116 * 1158756593 >>> 16 & 0xFF) * -338808869 * -1716898733;
		client.anInt9070 = (this.anInt7116 * 1158756593 * -1479624687 >>> 8 & 0xFF) * 922968097 * 1130636257;
		client.anInt9047 = (this.anInt7116 * -1479624687 * 1158756593 & 0xFF) * 801297641 * 1616069465;
	}

	public static final void method1107(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			if (client.anInt8987 == 2) {
				int var8 = Class15.anInt192;
				int[] var9 = Class15.anIntArray187;
				int var10;
				for (var10 = 0; var10 < var8; var10++) {
					Player var11 = client.players[var9[var10]];
					if (var11 != null) {
						var11.method5419(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 330563254);
					}
				}
				for (var10 = 0; var10 < client.anInt9017; var10++) {
					int var14 = client.anIntArray9018[var10];
					Class330_Sub35 var12 = (Class330_Sub35) client.aClass497_9014.method6094((long) var14);
					if (var12 != null) {
						((Class432_Sub1_Sub1_Sub1) var12.anObject7733).method5419(arg0, arg1, arg2, arg3, arg4, arg5, arg6, -1778604232);
					}
				}
			}
		} catch (RuntimeException var13) {
			throw Class476.method5964(var13, "aac.ja(" + ')');
		}
	}

	public static final void method1108(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 548232157);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class541.method6333(var3, var4, arg0, 557901561);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aac.lw(" + ')');
		}
	}
}
