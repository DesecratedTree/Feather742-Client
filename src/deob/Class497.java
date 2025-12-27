package deob;

import java.util.Iterator;
import java.util.Stack;

public class Class497 implements Iterable {

	public int anInt5881 = 0;

	public int anInt5882;

	public Class330[] aClass330Array5878;

	public long aLong5879;

	public static Class267 aClass267_5883;

	public Class330 aClass330_5877;

	public Class330 aClass330_5880;

	public static Class552 aClass552_5884;

	public Class497(int arg0) {
		this.anInt5882 = arg0;
		this.aClass330Array5878 = new Class330[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			Class330 var3 = this.aClass330Array5878[var2] = new Class330();
			var3.aClass330_3340 = var3;
			var3.aClass330_3342 = var3;
		}
	}

	public int method6093(Class330[] arg0, int arg1) {
		try {
			int var3 = 0;
			for (int var4 = 0; var4 < this.anInt5882; var4++) {
				Class330 var5 = this.aClass330Array5878[var4];
				for (Class330 var6 = var5.aClass330_3340; var6 != var5; var6 = var6.aClass330_3340) {
					arg0[var3++] = var6;
				}
			}
			return var3;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "un.i(" + ')');
		}
	}

	public Class330 method6094(long arg0) {
		try {
			this.aLong5879 = arg0;
			Class330 var3 = this.aClass330Array5878[(int) (arg0 & (long) (this.anInt5882 - 1))];
			for (this.aClass330_5880 = var3.aClass330_3340; this.aClass330_5880 != var3; this.aClass330_5880 = this.aClass330_5880.aClass330_3340) {
				if (this.aClass330_5880.aLong3341 == arg0) {
					Class330 var4 = this.aClass330_5880;
					this.aClass330_5880 = this.aClass330_5880.aClass330_3340;
					return var4;
				}
			}
			this.aClass330_5880 = null;
			return null;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "un.r(" + ')');
		}
	}

	public Class330 method6095(int arg0) {
		try {
			if (this.aClass330_5880 == null) {
				return null;
			}
			Class330 var2 = this.aClass330Array5878[(int) (this.aLong5879 & (long) (this.anInt5882 - 1))];
			while (this.aClass330_5880 != var2) {
				if (this.aLong5879 == this.aClass330_5880.aLong3341) {
					Class330 var3 = this.aClass330_5880;
					this.aClass330_5880 = this.aClass330_5880.aClass330_3340;
					return var3;
				}
				this.aClass330_5880 = this.aClass330_5880.aClass330_3340;
			}
			this.aClass330_5880 = null;
			return null;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "un.j(" + ')');
		}
	}

	public int method6096(int arg0) {
		try {
			int var2 = 0;
			for (int var3 = 0; var3 < this.anInt5882; var3++) {
				Class330 var4 = this.aClass330Array5878[var3];
				for (Class330 var5 = var4.aClass330_3340; var5 != var4; var5 = var5.aClass330_3340) {
					var2++;
				}
			}
			return var2;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "un.p(" + ')');
		}
	}

	public void method6097(Class330 arg0, long arg1) {
		try {
			if (arg0.aClass330_3342 != null) {
				arg0.method3252(-1770588869);
			}
			Class330 var4 = this.aClass330Array5878[(int) (arg1 & (long) (this.anInt5882 - 1))];
			arg0.aClass330_3342 = var4.aClass330_3342;
			arg0.aClass330_3340 = var4;
			arg0.aClass330_3342.aClass330_3340 = arg0;
			arg0.aClass330_3340.aClass330_3342 = arg0;
			arg0.aLong3341 = arg1;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "un.o(" + ')');
		}
	}

	public Class330 method6098(short arg0) {
		try {
			Class330 var2;
			if (this.anInt5881 > 0 && this.aClass330_5877 != this.aClass330Array5878[this.anInt5881 - 1]) {
				var2 = this.aClass330_5877;
				this.aClass330_5877 = var2.aClass330_3340;
				return var2;
			}
			while (this.anInt5881 < this.anInt5882) {
				var2 = this.aClass330Array5878[++this.anInt5881 - 1].aClass330_3340;
				if (var2 != this.aClass330Array5878[this.anInt5881 - 1]) {
					this.aClass330_5877 = var2.aClass330_3340;
					return var2;
				}
			}
			return null;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "un.z(" + ')');
		}
	}

	public Iterator iterator() {
		try {
			return new Class508(this);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "un.iterator(" + ')');
		}
	}

	public Class330 method6099(byte arg0) {
		try {
			this.anInt5881 = 0;
			return this.method6098((short) -32768);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "un.f(" + ')');
		}
	}

	public void method6100(int arg0) {
		try {
			for (int var2 = 0; var2 < this.anInt5882; var2++) {
				Class330 var3 = this.aClass330Array5878[var2];
				while (true) {
					Class330 var4 = var3.aClass330_3340;
					if (var4 == var3) {
						if (arg0 != 65280) {
							throw new IllegalStateException();
						}
						break;
					}
					var4.method3252(-487261948);
				}
			}
			this.aClass330_5880 = null;
			this.aClass330_5877 = null;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "un.s(" + ')');
		}
	}

	public static final void method6101(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.aClass75Array8982[var2].aBoolean648 ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "un.xo(" + ')');
		}
	}

	public static boolean method6102(IComponentDefinitions arg0, int arg1) {
		try {
			Class330_Sub2 var2 = client.method3924(arg0);
			if (var2.method3268((byte) 69) > 0) {
				return true;
			} else if (var2.method3267(516693227)) {
				return true;
			} else {
				return arg0.aClass114_1252 != null;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "un.li(" + ')');
		}
	}

	public static void method6103(Player arg0, boolean arg1, int arg2) {
		try {
			if (Class484.anInt5786 < 403) {
				if (arg0 != Class263_Sub2.myPlayer) {
					String var3;
					if (arg0.anInt10231 == 0) {
						boolean var4 = true;
						if (Class263_Sub2.myPlayer.anInt10230 != -1 && arg0.anInt10230 != -1) {
							int var5 = Class263_Sub2.myPlayer.anInt10230 < arg0.anInt10230 ? Class263_Sub2.myPlayer.anInt10230 : arg0.anInt10230;
							int var6 = Class263_Sub2.myPlayer.anInt10228 - arg0.anInt10228;
							if (var6 < 0) {
								var6 = -var6;
							}
							if (var6 > var5) {
								var4 = false;
							}
						}
						String var9 = Class435.aClass435_4416 == client.aClass435_9146 ? Class526.aClass526_6170.method6257(Class429.aClass454_4369, 991479434) : Class526.aClass526_6168.method6257(Class429.aClass454_4369, 991479434);
						if (arg0.anInt10228 >= arg0.anInt10229) {
							var3 = arg0.method5471(true, 1482921348) + (var4 ? Class557.method6454(arg0.anInt10228, Class263_Sub2.myPlayer.anInt10228, -1798420104) : Class146.method1738(16777215, -849826454)) + Class215.aString2080 + var9 + arg0.anInt10228 + Class215.aString2078;
						} else {
							var3 = arg0.method5471(true, 1476832245) + (var4 ? Class557.method6454(arg0.anInt10228, Class263_Sub2.myPlayer.anInt10228, -1798420104) : Class146.method1738(16777215, -849826454)) + Class215.aString2080 + var9 + arg0.anInt10228 + "+" + (arg0.anInt10229 - arg0.anInt10228) + Class215.aString2078;
						}
					} else if (arg0.anInt10231 == -1) {
						var3 = arg0.method5471(true, 1445902852);
					} else {
						var3 = arg0.method5471(true, 1872088037) + Class215.aString2080 + Class526.aClass526_6194.method6257(Class429.aClass454_4369, 991479434) + arg0.anInt10231 + Class215.aString2078;
					}
					if (client.aBoolean9150 && !arg1 && (Class503.anInt5916 & 0x8) != 0) {
						Class360.method4241(client.aString9152, client.aString9154 + " " + Class215.aString2082 + " " + Class146.method1738(16777215, -849826454) + var3, Class271.anInt2756, 15, -1, (long) arg0.anInt10008, 0, 0, true, false, (long) arg0.anInt10008, false, (short) 140);
					}
					if (arg1) {
						Class360.method4241(Class146.method1738(13421772, -849826454) + var3, "", -1, -1, 0, 0L, 0, 0, false, true, (long) arg0.anInt10008, false, (short) 140);
					} else {
						for (int var10 = 7; var10 >= 0; var10--) {
							if (client.aStringArray9167[var10] != null) {
								short var11 = 0;
								if (Class435.aClass435_4421 == client.aClass435_9146 && client.aStringArray9167[var10].equalsIgnoreCase(Class526.aClass526_6163.method6257(Class429.aClass454_4369, 991479434))) {
									if (client.aBoolean9130 && arg0.anInt10228 > Class263_Sub2.myPlayer.anInt10228) {
										var11 = 2000;
									}
									if (Class263_Sub2.myPlayer.anInt10246 == 0 || arg0.anInt10246 == 0) {
										if (arg0.aBoolean10247) {
											var11 = 2000;
										}
									} else if (Class263_Sub2.myPlayer.anInt10246 == arg0.anInt10246) {
										var11 = 2000;
									} else {
										var11 = 0;
									}
								} else if (client.aBooleanArray9136[var10]) {
									var11 = 2000;
								}
								short var13 = (short) (client.aShortArray9133[var10] + var11);
								int var7 = client.anIntArray9134[var10] == -1 ? client.anInt9148 : client.anIntArray9134[var10];
								Class360.method4241(client.aStringArray9167[var10], Class146.method1738(16777215, -849826454) + var3, var7, var13, -1, (long) arg0.anInt10008, 0, 0, true, false, (long) arg0.anInt10008, false, (short) 140);
							}
						}
					}
					if (!arg1) {
						for (Class330_Sub36_Sub10 var12 = (Class330_Sub36_Sub10) Class484.aClass471_5791.method5869(539664854); var12 != null; var12 = (Class330_Sub36_Sub10) Class484.aClass471_5791.method5873((byte) -69)) {
							if (var12.anInt9699 == 23) {
								var12.aString9700 = Class146.method1738(16777215, -849826454) + var3;
								break;
							}
						}
					}
				} else if (client.aBoolean9150 && (Class503.anInt5916 & 0x10) != 0) {
					Class360.method4241(client.aString9152, client.aString9154 + " " + Class215.aString2082 + " " + Class146.method1738(16777215, -849826454) + Class526.aClass526_6179.method6257(Class429.aClass454_4369, 991479434), Class271.anInt2756, 16, -1, 0L, 0, 0, true, false, (long) arg0.anInt10008, false, (short) 140);
				}
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "un.by(" + ')');
		}
	}

	public static final void method6104(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class330_Sub31.method3418(var3, arg0, -2109098938);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "un.qs(" + ')');
		}
	}

	public static Class353 method6105(boolean arg0, byte arg1) {
		try {
			Stack var2 = Class353.aStack3488;
			synchronized (Class353.aStack3488) {
				Class353 var3;
				if (Class353.aStack3488.isEmpty()) {
					var3 = new Class353();
				} else {
					var3 = (Class353) Class353.aStack3488.pop();
				}
				var3.aBoolean3487 = arg0;
				return var3;
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "un.r(" + ')');
		}
	}

	public static final void method6106(Class430 arg0, int arg1) {
		try {
			Class521.method6224(-294721568);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "un.agw(" + ')');
		}
	}
}
