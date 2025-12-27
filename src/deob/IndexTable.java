package deob;

public class IndexTable {

	public Class278 aClass278_2892 = null;

	public Class282 aClass282_2901;

	public boolean aBoolean2896;

	public int anInt2903;

	public static Class557 aClass557_2895 = new Class557();

	public static int anInt2897 = 0;

	public static int anInt2898 = 1;

	public static int anInt2899 = 2;

	public static int anInt2900 = 1;

	public static int anInt2902 = 0;

	public static boolean aBoolean2904 = false;

	public static int anInt2893 = 0;

	public static int anInt2906;

	public static int anInt2908;

	public Object[] singleStore;

	public static short[] aShortArray2907;

	public Object[][] store;

	public IndexTable(Class282 arg0, boolean arg1, int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("");
		}
		this.aClass282_2901 = arg0;
		this.aBoolean2896 = arg1;
		this.anInt2903 = arg2;
	}

	public synchronized boolean method2750(int arg0, int arg1) {
		try {
			if (!this.loadStore(1884642756)) {
				return false;
			} else if (this.aClass278_2892.anIntArray2885.length == 1) {
				return this.hasStoredFile(0, arg0, (byte) 32);
			} else if (!this.containsArchive(arg0, (byte) -26)) {
				return false;
			} else if (this.aClass278_2892.anIntArray2885[arg0] == 1) {
				return this.hasStoredFile(arg0, 0, (byte) 32);
			} else {
				throw new RuntimeException();
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "lq.n(" + ')');
		}
	}

	public synchronized boolean loadStore(int arg0) {
		try {
			if (this.aClass278_2892 == null) {
				this.aClass278_2892 = this.aClass282_2901.method2804((byte) 67);
				if (this.aClass278_2892 == null) {
					return false;
				}
				this.singleStore = new Object[this.aClass278_2892.archiveSize];
				this.store = new Object[this.aClass278_2892.archiveSize][];
			}
			return true;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "lq.r(" + ')');
		}
	}

	public int method2752(int arg0) {
		try {
			if (!this.loadStore(1054241968)) {
				throw new IllegalStateException("");
			}
			return this.aClass278_2892.anInt2870;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "lq.j(" + ')');
		}
	}

	public synchronized boolean containsFile(int arg0, int arg1, int arg2) {
		try {
			if (!this.loadStore(-430164606)) {
				return false;
			} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass278_2892.anIntArray2885.length && arg1 < this.aClass278_2892.anIntArray2885[arg0]) {
				return true;
			} else if (aBoolean2904) {
				throw new IllegalArgumentException(arg0 + " " + arg1);
			} else {
				return false;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "lq.p(" + ')');
		}
	}

	public int method2754(String arg0, int arg1) {
		try {
			if (this.loadStore(-1173090533)) {
				String var5 = arg0.toLowerCase();
				int var3 = this.aClass278_2892.class139.getArchiveFileId(Class331.method3877(var5, 1858648396), -1415967906);
				return this.containsArchive(var3, (byte) 2) ? var3 : -1;
			} else {
				return -1;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "lq.m(" + ')');
		}
	}

	public void method2755(int arg0, byte arg1) {
		try {
			this.aClass282_2901.method2796(arg0, 1043199040);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "lq.s(" + ')');
		}
	}

	public synchronized byte[] method2756(int arg0, int arg1, int[] arg2, int arg3) {
		try {
			if (!this.containsFile(arg0, arg1, 2147154397)) {
				return null;
			}
			byte[] var5 = null;
			if (this.store[arg0] == null || this.store[arg0][arg1] == null) {
				boolean var6 = this.method2766(arg0, arg1, arg2, -375084581);
				if (!var6) {
					this.read(arg0, (byte) 73);
					var6 = this.method2766(arg0, arg1, arg2, -1628993049);
					if (!var6) {
						return null;
					}
				}
			}
			if (this.store[arg0] == null) {
				throw new RuntimeException("");
			}
			if (this.store[arg0][arg1] != null) {
				var5 = Class400.method4707(this.store[arg0][arg1], false, -1360507949);
				if (var5 == null) {
					throw new RuntimeException("");
				}
			} else if (arg3 <= -2031137038) {
				throw new IllegalStateException();
			}
			if (var5 != null) {
				if (this.anInt2903 == 1) {
					this.store[arg0][arg1] = null;
					if (this.aClass278_2892.anIntArray2885[arg0] == 1) {
						this.store[arg0] = null;
					}
				} else if (this.anInt2903 == 2) {
					this.store[arg0] = null;
				}
			}
			return var5;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "lq.z(" + ')');
		}
	}

	public synchronized boolean hasStoredFile(int arg0, int arg1, byte arg2) {
		try {
			if (!this.containsFile(arg0, arg1, 2126514523)) {
				return false;
			} else if (this.store[arg0] != null && this.store[arg0][arg1] != null) {
				return true;
			} else if (this.singleStore[arg0] == null) {
				this.read(arg0, (byte) 18);
				return this.singleStore[arg0] != null;
			} else {
				return true;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "lq.w(" + ')');
		}
	}

	public synchronized boolean containsAllSingleStores(byte arg0) {
		try {
			if (!this.loadStore(-1659304119)) {
				return false;
			}
			boolean var2 = true;
			for (int var3 = 0; var3 < this.aClass278_2892.archiveIds.length; var3++) {
				int var4 = this.aClass278_2892.archiveIds[var3];
				if (this.singleStore[var4] == null) {
					this.read(var4, (byte) 58);
					if (this.singleStore[var4] == null) {
						var2 = false;
					}
				}
			}
			return var2;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "lq.b(" + ')');
		}
	}

	public synchronized int method2759(int arg0, int arg1) {
		try {
			if (this.containsArchive(arg0, (byte) -86)) {
				return this.singleStore[arg0] == null ? this.aClass282_2901.method2797(arg0, (short) 255) : 100;
			} else {
				return 0;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "lq.k(" + ')');
		}
	}

	public synchronized int method2760(byte arg0) {
		try {
			if (!this.loadStore(1564780716)) {
				return 0;
			}
			int var2 = 0;
			int var3 = 0;
			for (int var4 = 0; var4 < this.singleStore.length; var4++) {
				if (this.aClass278_2892.anIntArray2872[var4] > 0) {
					var2 += 100;
					var3 += this.method2759(var4, -1626968450);
				}
			}
			if (var2 == 0) {
				return 100;
			} else {
				return var3 * 100 / var2;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "lq.q(" + ')');
		}
	}

	public synchronized byte[] method2761(int arg0, int arg1) {
		try {
			if (!this.loadStore(-1773582883)) {
				return null;
			} else if (this.aClass278_2892.anIntArray2885.length == 1) {
				return this.getFile(0, arg0);
			} else if (!this.containsArchive(arg0, (byte) -35)) {
				return null;
			} else if (this.aClass278_2892.anIntArray2885[arg0] == 1) {
				return this.getFile(arg0, 0);
			} else {
				throw new RuntimeException();
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "lq.u(" + ')');
		}
	}

	public synchronized int[] method2762(int arg0, byte arg1) {
		try {
			if (!this.containsArchive(arg0, (byte) -108)) {
				return null;
			}
			int[] var3 = this.aClass278_2892.anIntArrayArray2882[arg0];
			if (var3 == null) {
				var3 = new int[this.aClass278_2892.anIntArray2872[arg0]];
				int var4 = 0;
				while (var4 < var3.length) {
					var3[var4] = var4++;
				}
			}
			return var3;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "lq.x(" + ')');
		}
	}

	public int method2763(int arg0, int arg1) {
		try {
			return this.containsArchive(arg0, (byte) -84) ? this.aClass278_2892.anIntArray2885[arg0] : 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "lq.g(" + ')');
		}
	}

	public int method2764(int arg0) {
		try {
			return this.loadStore(964798636) ? this.aClass278_2892.anIntArray2885.length : -1;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "lq.d(" + ')');
		}
	}

	public void method2765(boolean arg0, boolean arg1, int arg2) {
		try {
			if (this.loadStore(-1724322873)) {
				if (arg0) {
					this.aClass278_2892.anIntArray2875 = null;
					this.aClass278_2892.class139 = null;
				}
				if (arg1) {
					this.aClass278_2892.anIntArrayArray2876 = null;
					this.aClass278_2892.class139s = null;
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "lq.a(" + ')');
		}
	}

	public synchronized boolean method2766(int arg0, int arg1, int[] arg2, int arg3) {
		try {
			if (!this.containsArchive(arg0, (byte) -67)) {
				return false;
			} else if (this.singleStore[arg0] == null) {
				return false;
			} else {
				int var5 = this.aClass278_2892.anIntArray2872[arg0];
				int[] var6 = this.aClass278_2892.anIntArrayArray2882[arg0];
				if (this.store[arg0] == null) {
					this.store[arg0] = new Object[this.aClass278_2892.anIntArray2885[arg0]];
				}
				Object[] var7 = this.store[arg0];
				boolean var8 = true;
				for (int var9 = 0; var9 < var5; var9++) {
					int var10;
					if (var6 == null) {
						var10 = var9;
					} else {
						var10 = var6[var9];
					}
					if (var7[var10] == null) {
						var8 = false;
						break;
					}
				}
				if (var8) {
					return true;
				}
				byte[] var24;
				if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
					var24 = Class400.method4707(this.singleStore[arg0], false, 510039995);
				} else {
					var24 = Class400.method4707(this.singleStore[arg0], true, -1652939279);
					Buffer var25 = new Buffer(var24);
					var25.method3805(arg2, 5, var25.payload.length, (byte) 12);
				}
				byte[] var26;
				try {
					var26 = Class143.method1659(var24, (short) -27440);
				} catch (RuntimeException var22) {
					throw Class476.method5964(var22, (arg2 != null) + " " + arg0 + " " + var24.length + " " + Class125.method1528(var24, var24.length, 270291308) + " " + Class125.method1528(var24, var24.length - 2, -508790943) + " " + this.aClass278_2892.anIntArray2878[arg0] + " " + this.aClass278_2892.anInt2870);
				}
				if (this.aBoolean2896) {
					this.singleStore[arg0] = null;
				}
				int var11;
				if (var5 > 1) {
					int var12;
					Buffer var13;
					int var15;
					int var16;
					int var17;
					int var18;
					int var19;
					if (this.anInt2903 == 2) {
						var11 = var26.length;
						var11--;
						var12 = var26[var11] & 0xFF;
						var11 -= var5 * 4 * var12;
						var13 = new Buffer(var26);
						int var29 = 0;
						var15 = 0;
						var13.offset = var11;
						for (var16 = 0; var16 < var12; var16++) {
							var17 = 0;
							for (var18 = 0; var18 < var5; var18++) {
								var17 += var13.readInt((byte) 83);
								if (var6 == null) {
									var19 = var18;
								} else {
									var19 = var6[var18];
								}
								if (var19 == arg1) {
									var29 += var17;
									var15 = var19;
								}
							}
						}
						if (var29 == 0) {
							return true;
						}
						byte[] var31 = new byte[var29];
						var29 = 0;
						var13.offset = var11;
						var17 = 0;
						for (var18 = 0; var18 < var12; var18++) {
							var19 = 0;
							for (int var20 = 0; var20 < var5; var20++) {
								var19 += var13.readInt((byte) 108);
								int var21;
								if (var6 == null) {
									var21 = var20;
								} else {
									var21 = var6[var20];
								}
								if (var21 == arg1) {
									System.arraycopy(var26, var17, var31, var29, var19);
									var29 += var19;
								}
								var17 += var19;
							}
						}
						var7[var15] = var31;
					} else {
						var11 = var26.length;
						int var27 = var11 - 1;
						var12 = var26[var27] & 0xFF;
						int var28 = var27 - var12 * var5 * 4;
						var13 = new Buffer(var26);
						int[] var14 = new int[var5];
						var13.offset = var28;
						for (var15 = 0; var15 < var12; var15++) {
							var16 = 0;
							for (var17 = 0; var17 < var5; var17++) {
								var16 += var13.readInt((byte) 126);
								var14[var17] += var16;
							}
						}
						byte[][] var30 = new byte[var5][];
						for (var16 = 0; var16 < var5; var16++) {
							var30[var16] = new byte[var14[var16]];
							var14[var16] = 0;
						}
						var13.offset = var28;
						var16 = 0;
						for (var17 = 0; var17 < var12; var17++) {
							var18 = 0;
							for (var19 = 0; var19 < var5; var19++) {
								var18 += var13.readInt((byte) 120);
								System.arraycopy(var26, var16, var30[var19], var14[var19], var18);
								var14[var19] += var18;
								var16 += var18;
							}
						}
						for (var17 = 0; var17 < var5; var17++) {
							if (var6 == null) {
								var18 = var17;
							} else {
								var18 = var6[var17];
							}
							if (this.anInt2903 == 0) {
								var7[var18] = Class433.method5557(var30[var17], false, (byte) 5);
							} else {
								var7[var18] = var30[var17];
							}
						}
					}
				} else {
					if (var6 == null) {
						var11 = 0;
					} else {
						var11 = var6[0];
					}
					if (this.anInt2903 == 0) {
						var7[var11] = Class433.method5557(var26, false, (byte) -15);
					} else {
						var7[var11] = var26;
					}
				}
				return true;
			}
		} catch (RuntimeException var23) {
			throw Class476.method5964(var23, "lq.e(" + ')');
		}
	}

	public boolean method2767(String arg0, String arg1, byte arg2) {
		try {
			if (!this.loadStore(-1564513768)) {
				return false;
			}
			String var7 = arg0.toLowerCase();
			String var8 = arg1.toLowerCase();
			int var4 = this.aClass278_2892.class139.getArchiveFileId(Class331.method3877(var7, 1223612190), -1415967906);
			if (this.containsArchive(var4, (byte) -39)) {
				int var5 = this.aClass278_2892.class139s[var4].getArchiveFileId(Class331.method3877(var8, -1901934757), -1415967906);
				return this.hasStoredFile(var4, var5, (byte) 32);
			} else {
				return false;
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "lq.ay(" + ')');
		}
	}

	public int method2768(int arg0, byte arg1) {
		try {
			if (this.loadStore(-1829123442)) {
				int var3 = this.aClass278_2892.class139.getArchiveFileId(arg0, -1415967906);
				return this.containsArchive(var3, (byte) -30) ? var3 : -1;
			} else {
				return -1;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "lq.t(" + ')');
		}
	}

	public boolean method2769(String arg0, int arg1) {
		try {
			if (this.loadStore(-1664003481)) {
				String var5 = arg0.toLowerCase();
				int var3 = this.aClass278_2892.class139.getArchiveFileId(Class331.method3877(var5, -2098884120), -1415967906);
				return var3 >= 0;
			} else {
				return false;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "lq.h(" + ')');
		}
	}

	public boolean method2770(String arg0, String arg1, int arg2) {
		try {
			if (!this.loadStore(-531547607)) {
				return false;
			}
			String var7 = arg0.toLowerCase();
			String var8 = arg1.toLowerCase();
			int var4 = this.aClass278_2892.class139.getArchiveFileId(Class331.method3877(var7, 1595885880), -1415967906);
			if (var4 < 0) {
				return false;
			} else {
				int var5 = this.aClass278_2892.class139s[var4].getArchiveFileId(Class331.method3877(var8, 1020519540), -1415967906);
				return var5 >= 0;
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "lq.y(" + ')');
		}
	}

	public byte[] getFile(int arg0, int arg1) {
		try {
			return this.method2756(arg0, arg1, null, -1243515290);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "lq.f(" + ')');
		}
	}

	public boolean method2772(String arg0, int arg1) {
		try {
			int var3 = this.method2754("", 323600977);
			return var3 == -1 ? this.method2767(arg0, "", (byte) -15) : this.method2767("", arg0, (byte) -43);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "lq.ac(" + ')');
		}
	}

	public boolean method2773(String arg0, int arg1) {
		try {
			if (this.loadStore(-711832092)) {
				String var5 = arg0.toLowerCase();
				int var3 = this.aClass278_2892.class139.getArchiveFileId(Class331.method3877(var5, 1383567305), -1415967906);
				return this.method2777(var3, (byte) -97);
			} else {
				return false;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "lq.al(" + ')');
		}
	}

	public void method2774(String arg0, int arg1) {
		try {
			if (this.loadStore(-84466128)) {
				String var5 = arg0.toLowerCase();
				int var3 = this.aClass278_2892.class139.getArchiveFileId(Class331.method3877(var5, -172104390), -1415967906);
				this.method2755(var3, (byte) 0);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "lq.at(" + ')');
		}
	}

	public int method2775(String arg0, byte arg1) {
		try {
			if (this.loadStore(-123675123)) {
				String var5 = arg0.toLowerCase();
				int var3 = this.aClass278_2892.class139.getArchiveFileId(Class331.method3877(var5, -31137284), -1415967906);
				return this.method2759(var3, -1906319716);
			} else {
				return 0;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "lq.aw(" + ')');
		}
	}

	public synchronized void read(int arg0, byte arg1) {
		try {
			if (this.aBoolean2896) {
				this.singleStore[arg0] = this.aClass282_2901.read(arg0, (byte) 90);
			} else {
				this.singleStore[arg0] = Class433.method5557(this.aClass282_2901.read(arg0, (byte) 56), false, (byte) 67);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "lq.o(" + ')');
		}
	}

	public synchronized boolean method2777(int arg0, byte arg1) {
		try {
			if (!this.containsArchive(arg0, (byte) -13)) {
				return false;
			} else if (this.singleStore[arg0] == null) {
				this.read(arg0, (byte) 109);
				return this.singleStore[arg0] != null;
			} else {
				return true;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "lq.l(" + ')');
		}
	}

	public synchronized void removeFromStore(int arg0, byte arg1) {
		try {
			if (this.containsArchive(arg0, (byte) -23) && this.store != null) {
				this.store[arg0] = null;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "lq.c(" + ')');
		}
	}

	public synchronized boolean containsArchive(int arg0, byte arg1) {
		try {
			if (!this.loadStore(580462342)) {
				return false;
			} else if (arg0 >= 0 && arg0 < this.aClass278_2892.anIntArray2885.length && this.aClass278_2892.anIntArray2885[arg0] != 0) {
				return true;
			} else if (aBoolean2904) {
				throw new IllegalArgumentException(Integer.toString(arg0));
			} else {
				return false;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "lq.i(" + ')');
		}
	}

	public synchronized byte[] method2780(String arg0, String arg1) {
		try {
			if (!this.loadStore(-316795192)) {
				return null;
			}
			String var6 = arg0.toLowerCase();
			String var7 = arg1.toLowerCase();
			int var3 = this.aClass278_2892.class139.getArchiveFileId(Class331.method3877(var6, -165127418), -1415967906);
			if (this.containsArchive(var3, (byte) -120)) {
				int var4 = this.aClass278_2892.class139s[var3].getArchiveFileId(Class331.method3877(var7, 2065637621), -1415967906);
				return this.getFile(var3, var4);
			} else {
				return null;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "lq.v(" + ')');
		}
	}

	public static final void method2781(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 1966504884);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class196.method2146(var3, var4, arg0, (byte) -86);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "lq.dg(" + ')');
		}
	}

	public static final void method2782(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			String var4 = (String) arg2.anObjectArray4386[--arg2.anInt4378];
			if (Class278.method2740(var4, arg2, (byte) 0) != null) {
				var4 = var4.substring(0, var4.length() - 1);
			}
			arg0.anObjectArray1175 = Class288.method2886(var4, arg2, 1322426201);
			arg0.aBoolean1293 = true;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "lq.no(" + ')');
		}
	}

	public static boolean method2783(int arg0, String arg1, int arg2) {
		try {
			Class507.aClass498_5930 = new Class498();
			Class507.aClass498_5930.anInt5889 = arg0;
			Class507.aClass498_5930.aString5886 = arg1;
			if (Class457.aClass457_6834 != Class404.aClass457_4162) {
				Class507.aClass498_5930.anInt5887 = Class507.aClass498_5930.anInt5889 * 1467410725 + 1405932864;
				Class507.aClass498_5930.anInt5885 = Class507.aClass498_5930.anInt5889 * -1473668237 + 1047080176;
			}
			return true;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "lq.j(" + ')');
		}
	}
}
