package deob;

public class Class214 implements Interface10 {

	public int anInt6534;

	public Class195 aClass195_6535;

	public Class211 aClass211_6536;

	public int anInt6537;

	public int anInt6543;

	public int anInt6541;

	public int anInt6542;

	public int anInt6538;

	public int anInt6539;

	public int anInt6540;

	public boolean aBoolean6544;

	public Class214(int arg0, Class195 arg1, Class211 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
		this.anInt6534 = arg0;
		this.aClass195_6535 = arg1;
		this.aClass211_6536 = arg2;
		this.anInt6537 = arg3;
		this.anInt6543 = arg4;
		this.anInt6541 = arg5;
		this.anInt6542 = arg6;
		this.anInt6538 = arg7;
		this.anInt6539 = arg8;
		this.anInt6540 = arg9;
		this.aBoolean6544 = arg10;
	}

	public Class198 method159(byte arg0) {
		try {
			return Class198.aClass198_1918;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "iz.j(" + ')');
		}
	}

	public Class198 method160() {
		return Class198.aClass198_1918;
	}

	public Class198 method161() {
		return Class198.aClass198_1918;
	}

	public static final void method2233(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 3;
			client.anInt9227 = arg0.anIntArray4387[arg0.anInt4376];
			Class355.aClass496_3639 = Class501.method6123(arg0.anIntArray4387[arg0.anInt4376 + 1], (byte) -31);
			if (Class355.aClass496_3639 == null) {
				Class355.aClass496_3639 = Class496.aClass496_5874;
			}
			client.anInt9264 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			Class1 var2 = Class426.method5317(2120305279);
			Class330_Sub34 var3 = Class238.method2377(OutgoingPacket.aClass234_2541, var2.aClass488_22, 385206242);
			var3.aClass330_Sub46_Sub2_7729.addByte(client.anInt9227, (byte) 92);
			var3.aClass330_Sub46_Sub2_7729.addByte(Class355.aClass496_3639.anInt5876, (byte) 106);
			var3.aClass330_Sub46_Sub2_7729.addByte(client.anInt9264, (byte) 127);
			var2.method378(var3, -1700130675);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "iz.acv(" + ')');
		}
	}

	public static final void method2234(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			int var4 = arg2.anIntArray4387[--arg2.anInt4376];
			if (arg0.anInt1229 != var4) {
				arg0.anInt1229 = var4;
				Class404.method4738(arg0, 1572765708);
			}
			if (arg0.anInt1287 == -1 && !arg1.aBoolean1402) {
				Class313.method3118(arg0.anInt1196, 448400124);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "iz.dl(" + ')');
		}
	}

	public static boolean method2235(int arg0, int arg1, int arg2) {
		try {
			if (!Class484.aBoolean5782) {
				return false;
			}
			int var3 = arg0 >> 16;
			int var4 = arg0 & 0xFFFF;
			if (Class3.aClass120Array56[var3] == null || Class3.aClass120Array56[var3].aClass114Array1400[var4] == null) {
				return false;
			}
			IComponentDefinitions var5 = Class3.aClass120Array56[var3].aClass114Array1400[var4];
			Class330_Sub36_Sub10 var6;
			if (arg1 == -1 && var5.anInt1198 == 0) {
				for (var6 = (Class330_Sub36_Sub10) Class484.aClass471_5791.method5869(539664854); var6 != null; var6 = (Class330_Sub36_Sub10) Class484.aClass471_5791.method5873((byte) -121)) {
					if (var6.anInt9699 == 58 || var6.anInt9699 == 1007 || var6.anInt9699 == 25 || var6.anInt9699 == 57 || var6.anInt9699 == 30) {
						for (IComponentDefinitions var7 = Class95.method1101(var6.anInt9694, 831955338); var7 != null; var7 = Class433.method5561(Class3.aClass120Array56[var7.anInt1196 >> 16], var7, 1540601132)) {
							if (var7.anInt1196 == var5.anInt1196) {
								return true;
							}
						}
					}
				}
			} else {
				for (var6 = (Class330_Sub36_Sub10) Class484.aClass471_5791.method5869(539664854); var6 != null; var6 = (Class330_Sub36_Sub10) Class484.aClass471_5791.method5873((byte) -33)) {
					if (arg1 == var6.anInt9688 && var6.anInt9694 == var5.anInt1196 && (var6.anInt9699 == 58 || var6.anInt9699 == 1007 || var6.anInt9699 == 25 || var6.anInt9699 == 57 || var6.anInt9699 == 30)) {
						return true;
					}
				}
			}
			return false;
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "iz.aj(" + ')');
		}
	}
}
