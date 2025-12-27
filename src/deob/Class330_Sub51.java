package deob;

import jaclib.hardware_info.HardwareInfo;
import java.util.HashMap;

public class Class330_Sub51 extends Class330 {

	public static int anInt7913 = 1;

	public static int anInt7914 = 8;

	public static int anInt7915 = 1;

	public static int anInt7916 = 4;

	public static int anInt7919 = 1;

	public static int anInt7920 = 2;

	public static int anInt7921 = 1;

	public static int anInt7922 = 4;

	public static int anInt7923 = 1;

	public static int anInt7924 = 6;

	public static int anInt7925 = 7;

	public static int anInt7927 = 9;

	public static int anInt7928 = 20;

	public static int anInt7929 = 21;

	public static int anInt7931 = 4;

	public static int anInt7932 = 22;

	public static int anInt7933 = 23;

	public static int anInt7934 = 2;

	public static int anInt7935 = 1;

	public static int anInt7943 = 0;

	public static int anInt7945 = 0;

	public static int anInt7949 = 6;

	public static int anInt7953 = 1;

	public static int anInt7954 = 2;

	public int[] anIntArray7958 = new int[3];

	public int anInt7912;

	public boolean aBoolean7918;

	public int anInt7936;

	public int anInt7930;

	public int anInt7926;

	public int anInt7939;

	public int anInt7940;

	public boolean aBoolean7941;

	public int anInt7942;

	public int anInt7917;

	public int anInt7944;

	public int anInt7947;

	public int anInt7946;

	public String aString7956;

	public int anInt7959;

	public int anInt7955;

	public String aString7957;

	public String aString7948;

	public int anInt7937;

	public int anInt7952;

	public String aString7950;

	public String aString7938;

	public String aString7951;

	public Class330_Sub51(boolean arg0) {
		if (arg0) {
			if (Class212.aString6533.startsWith("win")) {
				this.anInt7912 = 1;
			} else if (Class212.aString6533.startsWith("mac")) {
				this.anInt7912 = 2;
			} else if (Class212.aString6533.startsWith("linux")) {
				this.anInt7912 = 3;
			} else {
				this.anInt7912 = 4;
			}
			if (Class152.aString1629.startsWith("amd64") || Class152.aString1629.startsWith("x86_64")) {
				this.aBoolean7918 = true;
			} else {
				this.aBoolean7918 = false;
			}
			if (this.anInt7912 == 1) {
				if (Class332.aString6629.indexOf("4.0") != -1) {
					this.anInt7936 = -591685631;
				} else if (Class332.aString6629.indexOf("4.1") != -1) {
					this.anInt7936 = -1183371262;
				} else if (Class332.aString6629.indexOf("4.9") != -1) {
					this.anInt7936 = -1775056893;
				} else if (Class332.aString6629.indexOf("5.0") != -1) {
					this.anInt7936 = 1928224772;
				} else if (Class332.aString6629.indexOf("5.1") != -1) {
					this.anInt7936 = 1336539141;
				} else if (Class332.aString6629.indexOf("5.2") != -1) {
					this.anInt7936 = -438517752;
				} else if (Class332.aString6629.indexOf("6.0") != -1) {
					this.anInt7936 = 744853510;
				} else if (Class332.aString6629.indexOf("6.1") != -1) {
					this.anInt7936 = 153167879;
				} else if (Class332.aString6629.indexOf("6.2") != -1) {
					this.anInt7936 = -1030203383;
				}
			} else if (this.anInt7912 == 2) {
				if (Class332.aString6629.indexOf("10.4") != -1) {
					this.anInt7936 = 1051189268;
				} else if (Class332.aString6629.indexOf("10.5") != -1) {
					this.anInt7936 = 459503637;
				} else if (Class332.aString6629.indexOf("10.6") != -1) {
					this.anInt7936 = -132181994;
				} else if (Class332.aString6629.indexOf("10.7") != -1) {
					this.anInt7936 = -723867625;
				}
			}
			if (Class556.aString6391.toLowerCase().indexOf("sun") != -1) {
				this.anInt7930 = -1441388077;
			} else if (Class556.aString6391.toLowerCase().indexOf("microsoft") != -1) {
				this.anInt7930 = 1412191142;
			} else if (Class556.aString6391.toLowerCase().indexOf("apple") == -1) {
				this.anInt7930 = -1470585012;
			} else {
				this.anInt7930 = -29196935;
			}
			int var2 = 2;
			int var3 = 0;
			char var4;
			try {
				while (var2 < Class116.aString1375.length()) {
					var4 = Class116.aString1375.charAt(var2);
					if (var4 < '0' || var4 > '9') {
						break;
					}
					var3 = var4 - '0' + var3 * 10;
					var2++;
				}
			} catch (Exception var18) {
			}
			this.anInt7926 = var3 * 1984962533;
			var2 = Class116.aString1375.indexOf(46, 2) + 1;
			var3 = 0;
			try {
				while (var2 < Class116.aString1375.length()) {
					var4 = Class116.aString1375.charAt(var2);
					if (var4 < '0' || var4 > '9') {
						break;
					}
					var3 = var4 - '0' + var3 * 10;
					var2++;
				}
			} catch (Exception var17) {
			}
			this.anInt7939 = var3 * 1167404831;
			var2 = Class116.aString1375.indexOf(95, 4) + 1;
			var3 = 0;
			try {
				while (var2 < Class116.aString1375.length()) {
					var4 = Class116.aString1375.charAt(var2);
					if (var4 < '0' || var4 > '9') {
						break;
					}
					var3 = var3 * 10 + (var4 - '0');
					var2++;
				}
			} catch (Exception var16) {
			}
			this.anInt7940 = var3;
			this.aBoolean7941 = false;
			this.anInt7942 = Class332.anInt6617 * 814500603;
			if (this.anInt7926 * 154600941 > 3) {
				this.anInt7917 = Class332.anInt6637 * 146989801;
			} else {
				this.anInt7917 = 0;
			}
			try {
				int[] var19 = HardwareInfo.getCPUInfo();
				if (var19 != null && var19.length == 3) {
					this.anInt7944 = var19[0] * 672863451;
					this.anInt7947 = var19[1];
					this.anInt7946 = var19[2] * -108594153;
				}
				int[] var5 = HardwareInfo.getRawCPUInfo();
				int var7;
				int var9;
				int var10;
				int var11;
				if (var5 != null && var5.length % 5 == 0) {
					HashMap var6 = new HashMap();
					for (var7 = 0; var7 < var5.length / 5; var7++) {
						int var8 = var5[var7 * 5];
						var9 = var5[var7 * 5 + 1];
						var10 = var5[var7 * 5 + 2];
						var11 = var5[var7 * 5 + 3];
						int var12 = var5[var7 * 5 + 4];
						Class494 var13 = new Class494(var8, var9, var10, var11, var12);
						var6.put(var8, var13);
					}
					Class494 var21 = (Class494) var6.get(0);
					if (var21 != null) {
						Buffer var22 = new Buffer(13);
						var22.method3813(var21.anInt5869, (byte) 17);
						var22.method3813(var21.anInt5865, (byte) 103);
						var22.method3813(var21.anInt5868, (byte) 53);
						var22.offset = 0;
						this.aString7956 = var22.readString(512996154);
					}
					Class494 var24 = (Class494) var6.get(1);
					if (var24 != null) {
						this.anInt7959 = var24.anInt5866 * -1076097815;
						var9 = var24.anInt5869 * 462387065;
						this.anInt7955 = (var9 >> 16 & 0xFF) * -1229830977;
						this.anIntArray7958[0] = var24.anInt5868 * -1141938305;
						this.anIntArray7958[1] = var24.anInt5865 * 727587631;
					}
					Class494 var26 = (Class494) var6.get(-2147483647);
					if (var26 != null) {
						this.anIntArray7958[2] = var26.anInt5865 * 727587631;
					}
					Buffer var28 = new Buffer(49);
					for (var11 = -2147483646; var11 <= -2147483644; var11++) {
						Class494 var30 = (Class494) var6.get(var11);
						if (var30 != null) {
							var28.method3813(var26.anInt5866, (byte) 85);
							var28.method3813(var26.anInt5869, (byte) 106);
							var28.method3813(var26.anInt5868, (byte) 124);
							var28.method3813(var26.anInt5865, (byte) 100);
						}
					}
					var28.offset = 0;
					this.aString7957 = var28.readString(-1784035682);
				}
				String[][] var20 = HardwareInfo.getDXDiagDisplayDevicesProps();
				String var25;
				if (var20 != null && var20.length > 0 && var20[0] != null) {
					for (var7 = 0; var7 < var20[0].length; var7 += 2) {
						if (var20[0][var7].equalsIgnoreCase("szDescription")) {
							this.aString7948 = var20[0][var7 + 1];
						} else if (var20[0][var7].equalsIgnoreCase("szDriverDateEnglish")) {
							var25 = var20[0][var7 + 1];
							try {
								var9 = var25.indexOf("/");
								var10 = var25.indexOf("/", var9 + 1);
								this.anInt7937 = Integer.parseInt(var25.substring(0, var9));
								this.anInt7952 = Integer.parseInt(var25.substring(var10 + 1, var25.indexOf(" ", var10))) * -1242885135;
							} catch (Exception var14) {
							}
						}
					}
				}
				String[] var23 = HardwareInfo.getDXDiagSystemProps();
				if (var23 != null) {
					var25 = "";
					String var27 = "";
					String var29 = "";
					for (var11 = 0; var11 < var23.length; var11 += 2) {
						if (var23[var11].equalsIgnoreCase("dwDirectXVersionMajor")) {
							var25 = var23[var11 + 1];
						} else if (var23[var11].equalsIgnoreCase("dwDirectXVersionMinor")) {
							var27 = var23[var11 + 1];
						} else if (var23[var11].equalsIgnoreCase("dwDirectXVersionLetter")) {
							var29 = var23[var11 + 1];
						}
					}
					this.aString7950 = var25 + "." + var27 + var29;
				}
			} catch (Throwable var15) {
				this.anInt7946 = 0;
			}
		}
		if (this.aString7948 == null) {
			this.aString7948 = "";
		}
		if (this.aString7938 == null) {
			this.aString7938 = "";
		}
		if (this.aString7950 == null) {
			this.aString7950 = "";
		}
		if (this.aString7951 == null) {
			this.aString7951 = "";
		}
		if (this.aString7956 == null) {
			this.aString7956 = "";
		}
		if (this.aString7957 == null) {
			this.aString7957 = "";
		}
		this.method3862((byte) 3);
	}

	public void method3862(byte arg0) {
		try {
			if (this.aString7948.length() > 40) {
				this.aString7948 = this.aString7948.substring(0, 40);
			}
			if (this.aString7938.length() > 40) {
				this.aString7938 = this.aString7938.substring(0, 40);
			}
			if (this.aString7950.length() > 10) {
				this.aString7950 = this.aString7950.substring(0, 10);
			}
			if (this.aString7951.length() > 10) {
				this.aString7951 = this.aString7951.substring(0, 10);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aer.r(" + ')');
		}
	}

	public void method3863(Buffer arg0, int arg1) {
		try {
			arg0.addByte(6, (byte) 127);
			arg0.addByte(this.anInt7912 * -899739143, (byte) 20);
			arg0.addByte(this.aBoolean7918 ? 1 : 0, (byte) 94);
			arg0.addByte(this.anInt7936, (byte) 46);
			arg0.addByte(this.anInt7930, (byte) 87);
			arg0.addByte(this.anInt7926 * -1235770795, (byte) 60);
			arg0.addByte(this.anInt7939 * 688728211, (byte) 105);
			arg0.addByte(this.anInt7940 * 787709071, (byte) 92);
			arg0.addByte(this.aBoolean7941 ? 1 : 0, (byte) 87);
			arg0.addShort(this.anInt7942, (byte) 23);
			arg0.addByte(this.anInt7917, (byte) 3);
			arg0.method3743(this.anInt7946 * -140064631, -1050205881);
			arg0.addShort(this.anInt7947 * 1637600515, (byte) 92);
			arg0.method3794(this.aString7948, 614248632);
			arg0.method3794(this.aString7938, 400943458);
			arg0.method3794(this.aString7950, -764561767);
			arg0.method3794(this.aString7951, -692562270);
			arg0.addByte(this.anInt7937 * -188313993, (byte) 53);
			arg0.addShort(this.anInt7952 * -1249585143, (byte) 78);
			arg0.method3794(this.aString7956, 1964359268);
			arg0.method3794(this.aString7957, -880009250);
			arg0.addByte(this.anInt7944 * -698350865, (byte) 93);
			arg0.addByte(this.anInt7955, (byte) 92);
			for (int var3 = 0; var3 < this.anIntArray7958.length; var3++) {
				arg0.addInt(this.anIntArray7958[var3], 1965508160);
			}
			arg0.addInt(this.anInt7959, 1965508160);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aer.j(" + ')');
		}
	}

	public int method3864(int arg0) {
		try {
			byte var2 = 38;
			int var4 = var2 + Class158_Sub3.method1856(this.aString7948, -1844058675);
			int var5 = var4 + Class158_Sub3.method1856(this.aString7938, -1844058675);
			int var6 = var5 + Class158_Sub3.method1856(this.aString7950, -1844058675);
			int var7 = var6 + Class158_Sub3.method1856(this.aString7951, -1844058675);
			int var8 = var7 + Class158_Sub3.method1856(this.aString7956, -1844058675);
			return var8 + Class158_Sub3.method1856(this.aString7957, -1844058675);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aer.i(" + ')');
		}
	}

	public static final void method3865(Class430 arg0, short arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			if (var2 < 0 || var2 > 1) {
				var2 = 0;
			}
			Class243.method2411(var2 == 1, -1537125612);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aer.akg(" + ')');
		}
	}
}
