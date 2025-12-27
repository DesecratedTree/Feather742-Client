package deob;

import java.io.IOException;

public class Class1 {

	public Class471 aClass471_23 = new Class471();

	public int anInt33 = 0;

	public Buffer aClass330_Sub46_21 = new Buffer(1600);

	public Class330_Sub46_Sub2 aClass330_Sub46_Sub2_17 = new Class330_Sub46_Sub2(15000);

	public IncomingPacket currentIncomingPacket = null;

	public int anInt26 = 0;

	public boolean aBoolean27 = true;

	public int anInt30 = 0;

	public int anInt29 = 0;

	public boolean aBoolean37 = false;

	public Class409 aClass409_38 = new Class409();

	public static int anInt32 = 15000;

	public int anInt18;

	public int anInt28;

	public int anInt31;

	public int anInt34;

	public static int anInt39;

	public Class357 aClass357_19;

	public IncomingPacket aClass222_20;

	public IncomingPacket aClass222_35;

	public IncomingPacket aClass222_36;

	public IsaacCipher aClass488_22;

	public IsaacCipher aClass488_24;

	public Class1() {
		Thread var1 = new Thread(this.aClass409_38);
		var1.setPriority(1);
		var1.start();
	}

	public void method377(int arg0) {
		try {
			this.aClass357_19 = null;
			this.aClass409_38.method4770(null, (short) -26864);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ab.f(" + ')');
		}
	}

	public final void method378(Class330_Sub34 arg0, int arg1) {
		try {
			this.aClass471_23.method5878(arg0, (short) 8192);
			arg0.anInt7730 = arg0.aClass330_Sub46_Sub2_7729.offset;
			arg0.aClass330_Sub46_Sub2_7729.offset = 0;
			this.anInt33 += arg0.anInt7730;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ab.i(" + ')');
		}
	}

	public void method379(int arg0) {
		try {
			if (this.aClass357_19 != null) {
				this.aClass357_19.method4197(1463544803);
				this.aClass357_19 = null;
			}
			this.aClass409_38.method4770(null, (short) -22999);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ab.s(" + ')');
		}
	}

	public Class357 method380(int arg0) {
		try {
			return this.aClass357_19;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ab.z(" + ')');
		}
	}

	public final void method381(int arg0) throws IOException {
		try {
			if (this.aClass357_19 != null && this.anInt33 > 0) {
				this.aClass330_Sub46_21.offset = 0;
				while (true) {
					Class330_Sub34 var2 = (Class330_Sub34) this.aClass471_23.method5869(539664854);
					if (var2 == null) {
						if (arg0 <= -1053848421) {
						}
						break;
					}
					if (var2.anInt7730 > this.aClass330_Sub46_21.payload.length - this.aClass330_Sub46_21.offset) {
						if (arg0 <= -1053848421) {
						}
						break;
					}
					this.aClass330_Sub46_21.method3749(var2.aClass330_Sub46_Sub2_7729.payload, 0, var2.anInt7730, (byte) -19);
					this.anInt33 -= var2.anInt7730;
					var2.method3252(-516875287);
					var2.aClass330_Sub46_Sub2_7729.method3739((byte) -6);
					var2.method3436((byte) -63);
				}
				this.aClass357_19.method4210(this.aClass330_Sub46_21.payload, 0, this.aClass330_Sub46_21.offset, (byte) -38);
				this.anInt34 += this.aClass330_Sub46_21.offset;
				this.anInt29 = 0;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ab.j(" + ')');
		}
	}

	public final void method382(int arg0) {
		try {
			this.aClass471_23.method5866(613065745);
			this.anInt33 = 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ab.r(" + ')');
		}
	}

	public void method383(int arg0) {
		try {
			if (client.anInt8981 % 50 == 0) {
				this.anInt28 = this.anInt34;
				this.anInt34 = 0;
				this.anInt18 = this.anInt31;
				this.anInt31 = 0;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ab.p(" + ')');
		}
	}

	public void method384(Class357 arg0, String arg1, int arg2) {
		try {
			this.aClass357_19 = arg0;
			this.aClass409_38.method4770(arg1, (short) -28342);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ab.o(" + ')');
		}
	}

	public static void method385(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[arg0.anInt4376 - 2] = Class131.aClass407_1502.method4752(arg0.anIntArray4387[arg0.anInt4376 - 2], -1365920612).method4640(Class158.aClass561_6474, arg0.anIntArray4387[arg0.anInt4376 - 1], -628759703) ? 1 : 0;
			arg0.anInt4376--;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ab.d(" + ')');
		}
	}

	public static final void method386(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			arg2.anInt4376 -= 3;
			arg0.anInt1268 = arg2.anIntArray4387[arg2.anInt4376];
			arg0.anInt1279 = arg2.anIntArray4387[arg2.anInt4376 + 1];
			arg0.anInt1267 = arg2.anIntArray4387[arg2.anInt4376 + 2];
			Class404.method4738(arg0, 707454434);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ab.ey(" + ')');
		}
	}

	public static final void method387(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class462.method5704(var3, var4, arg0, (byte) -47);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ab.et(" + ')');
		}
	}

	public static final void method388(Class430 arg0, byte arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class360.anInt3781;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ab.ajr(" + ')');
		}
	}

	public static final void method389(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			if (client.aString8968 == null || var2 >= Class452.anInt5561) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class95_Sub22.aClass13Array7210[var2].anInt169;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ab.wk(" + ')');
		}
	}
}
