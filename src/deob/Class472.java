package deob;

import java.util.Iterator;

public class Class472 implements Iterable {

	public Class330_Sub36 aClass330_Sub36_5613 = new Class330_Sub36();

	public Class330_Sub36 aClass330_Sub36_5614;

	public Class472() {
		this.aClass330_Sub36_5613.aClass330_Sub36_7735 = this.aClass330_Sub36_5613;
		this.aClass330_Sub36_5613.aClass330_Sub36_7736 = this.aClass330_Sub36_5613;
	}

	public void method5883(Class330_Sub36 arg0, int arg1) {
		try {
			if (arg0.aClass330_Sub36_7736 != null) {
				arg0.method3439((byte) -123);
			}
			arg0.aClass330_Sub36_7736 = this.aClass330_Sub36_5613.aClass330_Sub36_7736;
			arg0.aClass330_Sub36_7735 = this.aClass330_Sub36_5613;
			arg0.aClass330_Sub36_7736.aClass330_Sub36_7735 = arg0;
			arg0.aClass330_Sub36_7735.aClass330_Sub36_7736 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "to.j(" + ')');
		}
	}

	public Class330_Sub36 method5884(byte arg0) {
		try {
			return this.method5885(null, (byte) -115);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "to.s(" + ')');
		}
	}

	public Class330_Sub36 method5885(Class330_Sub36 arg0, byte arg1) {
		try {
			Class330_Sub36 var3;
			if (arg0 == null) {
				var3 = this.aClass330_Sub36_5613.aClass330_Sub36_7735;
			} else {
				var3 = arg0;
			}
			if (this.aClass330_Sub36_5613 == var3) {
				this.aClass330_Sub36_5614 = null;
				return null;
			} else {
				this.aClass330_Sub36_5614 = var3.aClass330_Sub36_7735;
				return var3;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "to.f(" + ')');
		}
	}

	public Class330_Sub36 method5886(short arg0) {
		try {
			Class330_Sub36 var2 = this.aClass330_Sub36_5614;
			if (this.aClass330_Sub36_5613 == var2) {
				this.aClass330_Sub36_5614 = null;
				return null;
			} else {
				this.aClass330_Sub36_5614 = var2.aClass330_Sub36_7735;
				return var2;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "to.z(" + ')');
		}
	}

	public int method5887(int arg0) {
		try {
			int var2 = 0;
			for (Class330_Sub36 var3 = this.aClass330_Sub36_5613.aClass330_Sub36_7735; var3 != this.aClass330_Sub36_5613; var3 = var3.aClass330_Sub36_7735) {
				var2++;
			}
			return var2;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "to.w(" + ')');
		}
	}

	public Iterator iterator() {
		try {
			return new Class479(this);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "to.iterator(" + ')');
		}
	}

	public Class330_Sub36 method5888(int arg0) {
		try {
			Class330_Sub36 var2 = this.aClass330_Sub36_5613.aClass330_Sub36_7735;
			if (this.aClass330_Sub36_5613 == var2) {
				return null;
			} else {
				var2.method3439((byte) -38);
				return var2;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "to.o(" + ')');
		}
	}

	public void method5889(int arg0) {
		try {
			while (this.aClass330_Sub36_5613 != this.aClass330_Sub36_5613.aClass330_Sub36_7735) {
				this.aClass330_Sub36_5613.aClass330_Sub36_7735.method3439((byte) -16);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "to.r(" + ')');
		}
	}

	public static void method5890(IndexTable arg0, int arg1) {
		try {
			Class125.anInt1451 = arg0.method2754("p11_full", 323600977);
			Class125.anInt1452 = arg0.method2754("p12_full", 323600977);
			Class125.anInt1453 = arg0.method2754("b12_full", 323600977);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "to.r(" + ')');
		}
	}

	public static void method5891(String arg0, byte arg1) {
		try {
			if (client.aBoolean9150 && (Class503.anInt5916 & 0x18) != 0) {
				boolean var2 = false;
				int var3 = Class15.anInt192;
				int[] var4 = Class15.anIntArray187;
				for (int var5 = 0; var5 < var3; var5++) {
					Player var6 = client.players[var4[var5]];
					if (var6.aString10221 != null && var6.aString10221.equalsIgnoreCase(arg0) && (Class263_Sub2.myPlayer == var6 && (Class503.anInt5916 & 0x10) != 0 || (Class503.anInt5916 & 0x8) != 0)) {
						Class330_Sub34 var7 = Class238.method2377(OutgoingPacket.INTERFACE_ON_PLAYER_PACKET, client.aClass1_9025.aClass488_22, 219564089);
						var7.aClass330_Sub46_Sub2_7729.addLEShortA(client.anInt9104, -177405465);
						var7.aClass330_Sub46_Sub2_7729.addInt(Class368.anInt3869, 1965508160);
						var7.aClass330_Sub46_Sub2_7729.addLEShort(var4[var5], -676872267);
						var7.aClass330_Sub46_Sub2_7729.addByteA(0, (byte) -12);
						var7.aClass330_Sub46_Sub2_7729.addLEShort(client.anInt9151, -676872267);
						client.aClass1_9025.method378(var7, -1229357745);
						int var8 = var6.method5453(-429665138);
						Class263_Sub2.method2622(var6.anIntArray10018[0], var6.anIntArray10059[0], true, Class274.method2704(var6.anIntArray10018[0], var6.anIntArray10059[0], var8, var8, 0, (short) 8960), 2021620088);
						var2 = true;
						break;
					}
				}
				if (!var2) {
					Class475_Sub2.method5952(4, Class526.aClass526_6201.method6257(Class429.aClass454_4369, 991479434) + arg0, -494832051);
				}
				if (client.aBoolean9150) {
					Class490.method6071(-1799482790);
				}
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "to.ky(" + ')');
		}
	}

	public static final void method5892(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.method3924(var3).method3265((byte) 1);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "to.qu(" + ')');
		}
	}
}
