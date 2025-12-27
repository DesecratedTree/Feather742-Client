package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class230 {

	public Class367 aClass367_2442 = new Class367(20);

	public Map aMap2444 = null;

	public IndexTable aClass280_2440;

	public IndexTable aClass280_2441;

	public int[] anIntArray2443;

	public static int anInt2445;

	public static Interface_ma anInterface_ma2446;

	public static byte[][] aByteArrayArray2447;

	public Class230(IndexTable arg0, IndexTable arg1, int[] arg2) {
		this.aClass280_2440 = arg0;
		this.aClass280_2441 = arg1;
		if (arg2 == null) {
			this.anIntArray2443 = null;
		} else {
			this.anIntArray2443 = arg2;
		}
	}

	public void method2327(short arg0) {
		try {
			this.aClass367_2442.method4296(520759046);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "jq.l(" + ')');
		}
	}

	public void method2328(byte arg0) {
		try {
			this.aMap2444 = null;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "jq.j(" + ')');
		}
	}

	public int method2329(byte arg0) {
		try {
			return this.method2335(false, -14102233);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "jq.i(" + ')');
		}
	}

	public int method2330(int arg0) {
		try {
			return this.anIntArray2443 == null ? 0 : this.anIntArray2443.length * 2;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "jq.o(" + ')');
		}
	}

	public Object method2331(Interface12 arg0, int arg1, boolean arg2, boolean arg3, byte arg4) {
		try {
			Class485 var6 = this.method2336(arg0, arg1, arg2, arg3, -189977195);
			return var6 == null ? null : var6.anObject5824;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "jq.s(" + ')');
		}
	}

	public void method2332(Interface12 arg0, int arg1) {
		try {
			this.aMap2444 = new HashMap(this.anIntArray2443.length);
			for (int var3 = 0; var3 < this.anIntArray2443.length; var3++) {
				int var4 = this.anIntArray2443[var3];
				Class524 var5 = Class375.method4356(this.aClass280_2441, var4, -1641316415);
				byte[] var6 = this.aClass280_2440.method2761(var4, 2089232975);
				Object var7 = arg0.method170(var6, var5, true, -1035322106);
				this.aMap2444.put(var3, new Class485(var7, var5));
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "jq.r(" + ')');
		}
	}

	public Class524 method2333(Interface12 arg0, int arg1, int arg2) {
		try {
			Class485 var4 = this.method2336(arg0, arg1, true, true, -189977195);
			return var4 == null ? null : (Class524) var4.anObject5823;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "jq.f(" + ')');
		}
	}

	public void method2334(int arg0) {
		try {
			this.aClass367_2442.method4298((byte) 99);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "jq.w(" + ')');
		}
	}

	public int method2335(boolean arg0, int arg1) {
		try {
			if (this.anIntArray2443 == null) {
				return 0;
			} else if (arg0 || this.aMap2444 == null) {
				int var3 = 0;
				for (int var4 = 0; var4 < this.anIntArray2443.length; var4++) {
					int var5 = this.anIntArray2443[var4];
					if (this.aClass280_2440.method2750(var5, -796275983)) {
						var3++;
					}
					if (this.aClass280_2441.method2750(var5, 1304927200)) {
						var3++;
					}
				}
				return var3;
			} else {
				return this.anIntArray2443.length * 2;
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "jq.p(" + ')');
		}
	}

	public Class485 method2336(Interface12 arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
		try {
			if (arg1 == -1) {
				return null;
			}
			if (this.anIntArray2443 != null) {
				for (int var6 = 0; var6 < this.anIntArray2443.length; var6++) {
					if (arg1 == this.anIntArray2443[var6]) {
						return (Class485) this.aMap2444.get(var6);
					}
				}
			}
			Class485 var10 = (Class485) this.aClass367_2442.get((long) (arg1 << 1 | (arg3 ? 1 : 0)));
			if (var10 != null) {
				if (arg2 && var10.anObject5823 == null) {
					Class524 var11 = Class375.method4356(this.aClass280_2441, arg1, -1641316415);
					if (var11 == null) {
						return null;
					}
					var10.anObject5823 = var11;
				}
				return var10;
			}
			byte[] var7 = this.aClass280_2440.method2761(arg1, 2130049196);
			if (var7 == null) {
				return null;
			}
			Class524 var8 = Class375.method4356(this.aClass280_2441, arg1, -1641316415);
			if (var8 == null) {
				return null;
			}
			if (arg2) {
				var10 = new Class485(arg0.method170(var7, var8, arg3, 264194540), var8);
			} else {
				var10 = new Class485(arg0.method170(var7, var8, arg3, -1760059040), null);
			}
			this.aClass367_2442.put(var10, (long) (arg1 << 1 | (arg3 ? 1 : 0)));
			return var10;
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "jq.z(" + ')');
		}
	}

	public void method2337(int arg0, int arg1) {
		try {
			this.aClass367_2442.method4292(arg0, (byte) 27);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "jq.n(" + ')');
		}
	}

	public static final int method2338(int arg0, int arg1, int arg2, int arg3) {
		try {
			if (arg2 > 243) {
				arg1 >>= 0x4;
			} else if (arg2 > 217) {
				arg1 >>= 0x3;
			} else if (arg2 > 192) {
				arg1 >>= 0x2;
			} else if (arg2 > 179) {
				arg1 >>= 0x1;
			}
			return ((arg0 >> 2 & 0x3F) << 10) + (arg1 >> 5 << 7) + (arg2 >> 1);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "jq.k(" + ')');
		}
	}

	public static void method2339(Class545 arg0, int arg1, int arg2, int arg3) {
		try {
			Class430 var4 = Class325_Sub6.method3229((byte) 100);
			Class217.method2252(arg0, arg1, arg2, var4, -1618875482);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "jq.n(" + ')');
		}
	}

	public static final void method2340(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -426233197);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class391.method4603(var3, var4, arg0, -1210377693);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "jq.hc(" + ')');
		}
	}

	public static final void method2341(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 1498606163);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1211;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "jq.rm(" + ')');
		}
	}

	public static boolean method2342(byte arg0, int arg1) {
		try {
			int var2 = arg0 & 0xFF;
			if (var2 == 0) {
				return false;
			} else {
				return var2 < 128 || var2 >= 160 || Class458.aCharArray5564[var2 - 128] != 0;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "jq.i(" + ')');
		}
	}

	public static final void method2343(boolean arg0, int arg1) {
		try {
			client.anInt9022 = 0;
			client.anInt9019 = 0;
			client.anInt8996++;
			Class359.method4238((byte) 2);
			Class468.method5862(arg0, 791376098);
			Class2.decodeNpcMasks(1382868750);
			boolean var2 = false;
			int var3;
			int var4;
			for (var3 = 0; var3 < client.anInt9022; var3++) {
				var4 = client.anIntArray9021[var3];
				Class330_Sub35 var5 = (Class330_Sub35) client.aClass497_9014.method6094((long) var4);
				NPC var6 = (NPC) var5.anObject7733;
				if (var6.anInt10069 != client.anInt8996) {
					if (Class484.aBoolean5782 && Class378.method4380(var4, -1137361974)) {
						Class513.method6194((byte) -25);
					}
					if (var6.aClass551_10251.method6372((byte) 37)) {
						Class324.method3202(var6, -1493180928);
					}
					var6.method5475(null, 1918950667);
					var5.method3252(-816582589);
					var2 = true;
				}
			}
			if (var2) {
				var3 = client.anInt9232;
				client.anInt9232 = client.aClass497_9014.method6096(940963698);
				var4 = 0;
				Iterator var8 = client.aClass497_9014.iterator();
				while (var8.hasNext()) {
					Class330_Sub35 var9 = (Class330_Sub35) var8.next();
					client.aClass330_Sub35Array9015[var4++] = var9;
				}
				for (int var10 = client.anInt9232; var10 < var3; var10++) {
					client.aClass330_Sub35Array9015[var10] = null;
				}
			}
			if (client.aClass1_9025.anInt26 != client.aClass1_9025.aClass330_Sub46_Sub2_17.offset) {
				throw new RuntimeException(client.aClass1_9025.aClass330_Sub46_Sub2_17.offset + " " + client.aClass1_9025.anInt26);
			}
			for (var3 = 0; var3 < client.anInt9017; var3++) {
				if (client.aClass497_9014.method6094((long) client.anIntArray9018[var3]) == null) {
					throw new RuntimeException(var3 + " " + client.anInt9017);
				}
			}
			if (client.anInt9232 - client.anInt9017 != 0) {
				throw new RuntimeException("" + (client.anInt9232 - client.anInt9017));
			}
			for (var3 = 0; var3 < client.anInt9232; var3++) {
				if (((Class432_Sub1_Sub1_Sub1) client.aClass330_Sub35Array9015[var3].anObject7733).anInt10069 != client.anInt8996) {
					throw new RuntimeException("" + ((Class432_Sub1_Sub1_Sub1) client.aClass330_Sub35Array9015[var3].anObject7733).anInt10008);
				}
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "jq.jx(" + ')');
		}
	}

	public static final void method2344(String arg0, byte arg1) {
		try {
			if (arg0 != null) {
				String var2 = Class531.method6297(arg0, -1727356092);
				if (var2 != null) {
					for (int var3 = 0; var3 < client.anInt9256; var3++) {
						Class99 var4 = client.aClass99Array9259[var3];
						String var5 = var4.aString915;
						String var6 = Class531.method6297(var5, -1622823747);
						if (Class432_Sub1_Sub5_Sub2.method5553(arg0, var2, var5, var6, 62316653)) {
							client.anInt9256--;
							for (int var7 = var3; var7 < client.anInt9256; var7++) {
								client.aClass99Array9259[var7] = client.aClass99Array9259[var7 + 1];
							}
							client.anInt9023 = client.anInt9268;
							Class1 var10 = Class426.method5317(1723765424);
							Class330_Sub34 var8 = Class238.method2377(OutgoingPacket.REMOVE_FRIEND_PACKET, var10.aClass488_22, 141943473);
							var8.aClass330_Sub46_Sub2_7729.addByte(Class57.method659(arg0, -874804490), (byte) 36);
							var8.aClass330_Sub46_Sub2_7729.addString(arg0, (byte) -61);
							var10.method378(var8, -79279530);
							break;
						}
					}
				}
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "jq.mc(" + ')');
		}
	}

	public static final void method2345(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class120.method1443(var3, var4, arg0, -71999207);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "jq.kr(" + ')');
		}
	}
}
