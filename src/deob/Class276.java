package deob;

import java.util.LinkedList;

public class Class276 implements Runnable {

	public volatile boolean aBoolean2859 = false;

	public LinkedList aLinkedList2860 = new LinkedList();

	public Class304 aClass304_2858 = new Class304(true);

	public static String aString2861;

	public void method2719(Class463 arg0, int arg1) {
		try {
			this.aClass304_2858.method3002(arg0, -837249133);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "lm.r(" + ')');
		}
	}

	public void method2720(Class300 arg0, int arg1) {
		try {
			if (OutgoingPacketManager.aClass310_3213 == arg0.aClass310_3057) {
				this.aClass304_2858.method3032(1774313103);
			} else {
				this.aClass304_2858.method3026(arg0, 1597150420);
			}
			for (boolean var3 = this.aClass304_2858.method3017(186314141); !var3; var3 = this.aClass304_2858.method3017(186314141)) {
			}
			this.aClass304_2858.method3004((byte) 5);
			client.aClass304_9030.method3004((byte) 6);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "lm.f(" + ')');
		}
	}

	public Class304 method2721(byte arg0) {
		try {
			return this.aClass304_2858;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "lm.p(" + ')');
		}
	}

	public void method2722(Class304 arg0, int arg1) {
		try {
			this.aClass304_2858 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "lm.o(" + ')');
		}
	}

	public void run() {
		try {
			while (true) {
				this.method2723(1292775964);
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "lm.run(" + ')');
		}
	}

	public void method2723(int arg0) {
		try {
			Object var2 = null;
			LinkedList var4 = this.aLinkedList2860;
			Class300 var3;
			synchronized (this.aLinkedList2860) {
				try {
					this.aLinkedList2860.wait();
				} catch (InterruptedException var7) {
				}
				var3 = (Class300) this.aLinkedList2860.pollFirst();
			}
			try {
				try {
					if (var3 != null) {
						this.aBoolean2859 = true;
						this.method2720(var3, -611781178);
					}
				} catch (Exception var9) {
					this.aBoolean2859 = false;
					return;
				}
				this.aBoolean2859 = false;
			} catch (RuntimeException var10) {
				this.aBoolean2859 = false;
				throw var10;
			}
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "lm.s(" + ')');
		}
	}

	public boolean method2724(int arg0) {
		try {
			return this.aBoolean2859;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "lm.i(" + ')');
		}
	}

	public void method2725(Class300 arg0, byte arg1) {
		try {
			LinkedList var3 = this.aLinkedList2860;
			synchronized (this.aLinkedList2860) {
				this.aLinkedList2860.add(arg0);
				this.aLinkedList2860.notify();
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "lm.j(" + ')');
		}
	}

	public static final void method2726(Class430 arg0, byte arg1) {
		try {
			if (client.anInt8995 != 15 || Class434.method5564(-1999354701)) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 1;
			} else if (Class507.aBoolean5933) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			} else if (Class507.aLong5934 > Class312.method3111((byte) 26) - 1000L) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 1;
			} else {
				Class507.aBoolean5933 = true;
				Class330_Sub34 var2 = Class238.method2377(OutgoingPacket.aClass234_2488, client.aClass1_9060.aClass488_22, 668972296);
				var2.aClass330_Sub46_Sub2_7729.addInt(Class527.anInt6213, 1965508160);
				client.aClass1_9060.method378(var2, -744094747);
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "lm.amj(" + ')');
		}
	}

	public static final void method2727(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub25_7896.method5828(635277037) ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "lm.apz(" + ')');
		}
	}

	public static final void method2728(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub10_7873.method5716(var2, -1253947663);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "lm.aqk(" + ')');
		}
	}

	public static final void method2729(Class432_Sub1 arg0, int arg1, boolean arg2, int arg3) {
		try {
			int var4;
			int var5;
			if (arg0 instanceof Class432_Sub1_Sub1 && arg0 instanceof Interface2) {
				Class432_Sub1_Sub1 var10 = (Class432_Sub1_Sub1) arg0;
				int var7 = var10.aShort9920 - var10.aShort9922 + 1 << 9;
				int var8 = var10.aShort9923 - var10.aShort9921 + 1 << 9;
				var4 = (var10.aShort9922 << 9) + var7 / 2;
				var5 = var8 / 2 + (var10.aShort9921 << 9);
			} else {
				Class260 var6 = arg0.method5346().aClass260_2606;
				var4 = (int) var6.aFloat2716;
				var5 = (int) var6.aFloat2711;
			}
			Class208.method2205(arg0.aByte8658, var4, var5, 0, arg1, arg2, 1536669850);
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "lm.jf(" + ')');
		}
	}

	public static void method2730(int arg0, IndexTable arg1, int arg2, int arg3, int arg4, boolean arg5, Class111 arg6, int arg7) {
		try {
			if (arg0 > 0) {
				Class110.anInt1152 = 1;
				Class110.aClass280_1161 = arg1;
				Class110.musicId = arg2;
				Class369.anInt6819 = arg3;
				Class288.aClass330_Sub40_Sub2_2955 = null;
				Class121.volume = arg4;
				Class268.aBoolean2746 = arg5;
				Class457.anInt6843 = Class110.aClass330_Sub40_Sub2_1155.method3587(751327566) / arg0;
				if (Class457.anInt6843 < 1) {
					Class457.anInt6843 = 1;
				}
				Class403.aClass111_4138 = arg6;
			} else {
				if (arg6 != null) {
					arg6.method1364(-1324158633);
				}
				Class217.method2255(arg1, arg2, arg3, arg4, arg5, -1917428320);
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "lm.b(" + ')');
		}
	}
}
