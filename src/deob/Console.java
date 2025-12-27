package deob;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Console {

	public static int anInt4262 = 0;

	public static int anInt4261 = 0;

	public static Class421 aClass421_4266;

	public static int[] anIntArray4263;

	public static int[] anIntArray4265;

	public static int[] colorArray;

	public Console() throws Throwable {
		throw new Error();
	}

	public static final void method5240(Class430 arg0, int arg1) {
		try {
			if (Class238.aClass355_2583.isKeyHeld(82, 50964531)) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 1;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "rf.adb(" + ')');
		}
	}

	public static void execute(String arg0) {
		try {
			int var16;
			int var20;
			label349: {
				try {
					if (arg0.equalsIgnoreCase("commands") || arg0.equalsIgnoreCase("help")) {
						Class56.panelBoxMessage("commands - This command", 217077475);
						Class56.panelBoxMessage("cls - Clear console", -1411631737);
						Class56.panelBoxMessage("displayfps - Toggle FPS and other information", 1315064010);
						Class56.panelBoxMessage("renderer - Print graphics renderer information", 930159840);
						Class56.panelBoxMessage("heap - Print java memory information", 33489331);
						Class56.panelBoxMessage("getcamerapos - Print location and direction of camera for use in bug reports", -331045150);
						Class56.panelBoxMessage("voices - Turn voices on or off", -331045150);
						Class56.panelBoxMessage("addvoice/removevoice - Add or remove a player's name from the voices list", -331045150);
						Class56.panelBoxMessage("zoomin/zoomout - Zoom in or zoom out", -331045150);
					} else if (arg0.equalsIgnoreCase("cls")) {
						Class5.anInt71 = 0;
						Class5.anInt77 = 0;
					} else if (arg0.startsWith("changecolors")) {
						var20 = Integer.parseInt(arg0.split(" ")[1]);
						var16 = Integer.parseInt(arg0.split(" ")[2]);
						ItemDefinitions.changeColors(var20, var16);
					} else {
						String var22;
						if (arg0.equalsIgnoreCase("zoomin")) {
							SpecialKeys.displayTheatre(1);
						} else if (arg0.equalsIgnoreCase("zoomout")) {
							SpecialKeys.displayTheatre(-1);
						} else if (arg0.equalsIgnoreCase("displayfps")) {
							client.aBoolean8983 = !client.aBoolean8983;
							if (client.aBoolean8983) {
								Class56.panelBoxMessage("FPS on", 93254474);
							} else {
								Class56.panelBoxMessage("FPS off", -1679027115);
							}
						} else if (arg0.equals("renderer")) {
							Class51 var1 = Class361.aClass_ra3793.f();
							Class56.panelBoxMessage("Toolkit ID: " + Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(869655613), -563122681);
							Class56.panelBoxMessage("Vendor: " + var1.anInt488, 1436551699);
							Class56.panelBoxMessage("Name: " + var1.aString483, 130719993);
							Class56.panelBoxMessage("Version: " + var1.anInt490, -650994340);
							Class56.panelBoxMessage("Device: " + var1.aString484, -1812085083);
							Class56.panelBoxMessage("Driver Version: " + var1.aLong492, -709372634);
						} else if (arg0.equals("heap")) {
							Class56.panelBoxMessage("Heap: " + Class332.anInt6617 + "MB", 851660487);
						} else {
							if (!arg0.equalsIgnoreCase("getcamerapos")) {
								break label349;
							}
							Class381 var12 = client.aClass304_9030.method3022(-187074499);
							Class56.panelBoxMessage("Pos: " + Class263_Sub2.myPlayer.aByte8658 + "," + ((Class471.anInt5612 >> 9) + var12.gameSceneBaseX >> 6) + "," + ((Class325_Sub3.anInt7484 >> 9) + var12.gameSceneBaseY >> 6) + "," + ((Class471.anInt5612 >> 9) + var12.gameSceneBaseX & 0x3F) + "," + ((Class325_Sub3.anInt7484 >> 9) + var12.gameSceneBaseY & 0x3F) + " Height: " + (Class431.method5342(Class471.anInt5612, Class325_Sub3.anInt7484, Class263_Sub2.myPlayer.aByte8658, 1996761881) - Gfx.anInt578), 74641516);
							Class56.panelBoxMessage("Look: " + Class263_Sub2.myPlayer.aByte8658 + "," + (var12.gameSceneBaseX + Class150_Sub2.anInt7270 >> 6) + "," + (Class330_Sub39.anInt7766 + var12.gameSceneBaseY >> 6) + "," + (Class150_Sub2.anInt7270 + var12.gameSceneBaseX & 0x3F) + "," + (Class330_Sub39.anInt7766 + var12.gameSceneBaseY & 0x3F) + " Height: " + (Class431.method5342(Class150_Sub2.anInt7270, Class330_Sub39.anInt7766, Class263_Sub2.myPlayer.aByte8658, 1996761881) - Class366.anInt3856), 524539179);
						}
					}
				} catch (Exception var9) {
					var9.printStackTrace();
					Class56.panelBoxMessage(Class526.aClass526_6139.method6257(Class429.aClass454_4369, 991479434), 1164951932);
				}
				return;
			}
			if (Class457.aClass457_6834 != Class404.aClass457_4162 || client.anInt9182 >= 2) {
				try {
					if (arg0.equalsIgnoreCase("wm1")) {
						Class96.method1182(1, -1, -1, false, -1188403631);
						if (Class545.method6347(1079239502) == 1) {
							Class56.panelBoxMessage("Success", 1452127608);
						} else {
							Class56.panelBoxMessage("Failure", 1347710540);
						}
						return;
					}
					if (arg0.equalsIgnoreCase("wm2")) {
						Class96.method1182(2, -1, -1, false, 207484190);
						if (Class545.method6347(1079239502) == 2) {
							Class56.panelBoxMessage("Success", -1390408702);
						} else {
							Class56.panelBoxMessage("Failure", -2039683645);
						}
						return;
					}
					if (Class503.aBoolean5914 && arg0.equalsIgnoreCase("wm3")) {
						Class96.method1182(3, 1024, 768, false, 500293700);
						if (Class545.method6347(1079239502) == 3) {
							Class56.panelBoxMessage("Success", -1506610275);
						} else {
							Class56.panelBoxMessage("Failure", 2142657040);
						}
						return;
					}
					Class330_Sub34 var15;
					if (arg0.startsWith("setlobby ")) {
						var20 = -1;
						var15 = null;
						String var11 = arg0.substring(9);
						int var18 = var11.indexOf(32);
						if (var18 == -1) {
							Class56.panelBoxMessage("Failure", -567029659);
							return;
						}
						try {
							var20 = Integer.parseInt(var11.substring(0, var18));
						} catch (NumberFormatException var5) {
						}
						if (var20 == -1) {
							Class56.panelBoxMessage("Failure", -523890696);
							return;
						}
						String var4 = var11.substring(var18 + 1).trim() + ".elveron.org";
						Class273.method2683(var4, var20, -1019977290);
						Class56.panelBoxMessage("Success", -930515047);
						return;
					}
					if (arg0.equalsIgnoreCase("tk0")) {
						Class171.method2046(0, false, 1592920186);
						if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(-1258817812) == 0) {
							Class56.panelBoxMessage("Success", 130798371);
							Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub23_7908, 0, 525979833);
							Class435.method5568(1714181576);
							client.aBoolean9194 = false;
						} else {
							Class56.panelBoxMessage("Failure", -1675557792);
						}
						return;
					}
					if (arg0.equalsIgnoreCase("tk1")) {
						Class171.method2046(1, false, -571581890);
						if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(677222180) == 1) {
							Class56.panelBoxMessage("Success", -1599774868);
							Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub23_7908, 1, -1294708163);
							Class435.method5568(2063196158);
							client.aBoolean9194 = false;
						} else {
							Class56.panelBoxMessage("Failure", -1887360609);
						}
						return;
					}
					if (arg0.equalsIgnoreCase("tk2")) {
						Class171.method2046(2, false, 1993347373);
						if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(-1115136947) == 2) {
							Class56.panelBoxMessage("Success", -134410441);
							Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub23_7908, 2, -1265686675);
							Class435.method5568(1650338802);
							client.aBoolean9194 = false;
						} else {
							Class56.panelBoxMessage("Failure", -1053896501);
						}
						return;
					}
					if (arg0.equalsIgnoreCase("tk3")) {
						Class171.method2046(3, false, 1277022802);
						if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(-1120470991) == 3) {
							Class56.panelBoxMessage("Success", 147005115);
							Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub23_7908, 3, 1945399125);
							Class435.method5568(1768990869);
							client.aBoolean9194 = false;
						} else {
							Class56.panelBoxMessage("Failure", -116730447);
						}
						return;
					}
					if (arg0.equalsIgnoreCase("tk5")) {
						Class171.method2046(5, false, -546015094);
						if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(348763082) == 5) {
							Class56.panelBoxMessage("Success", 586536021);
							Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub23_7908, 5, -1685255816);
							Class435.method5568(1648947477);
							client.aBoolean9194 = false;
						} else {
							Class56.panelBoxMessage("Failure", 1073590096);
						}
						return;
					}
					if (arg0.equalsIgnoreCase("clientdrop")) {
						if (client.anInt8995 == 1) {
							Class291_Sub1.method2907(-1358731369);
						} else if (client.anInt8995 == 16) {
							client.aClass1_9025.aBoolean37 = true;
						}
						return;
					}
					if (arg0.equalsIgnoreCase("breakcon")) {
						Class1[] var21 = client.aClass1Array8963;
						for (var16 = 0; var16 < var21.length; var16++) {
							Class1 var17 = var21[var16];
							if (var17.method380(2090846548) != null) {
								var17.method380(2107724039).method4198((short) -1008);
							}
						}
						Class140_Sub1.aClass285_7263.method2831(252096199);
						return;
					}
					if (arg0.startsWith("getclientvarpbit")) {
						var20 = Integer.parseInt(arg0.substring(17));
						Class56.panelBoxMessage("varpbit=" + Class158.aClass561_6474.method310(var20, -685300503), 1671552469);
						return;
					}
					if (arg0.startsWith("getclientvarp")) {
						var20 = Integer.parseInt(arg0.substring(14));
						Class56.panelBoxMessage("varp=" + Class158.aClass561_6474.method306(var20, 969701794), 1505940898);
						return;
					}
					String[] var19;
					if (arg0.startsWith("directlogin")) {
						var19 = Class226.method2309(arg0.substring(12), ' ', (byte) -15);
						if (var19.length == 2) {
							Class138.method1605(var19[0], var19[1], 1743689662);
						}
						return;
					}
					if (arg0.startsWith("snlogin ")) {
						var19 = Class226.method2309(arg0.substring(8), ' ', (byte) -16);
						var16 = Integer.parseInt(var19[0]);
						Class396.method4655(var16, 189729556);
						return;
					}
					File var13;
					if (arg0.startsWith("setoutput ")) {
						var13 = new File(arg0.substring(10));
						if (var13.exists()) {
							var13 = new File(arg0.substring(10) + "." + Class312.method3111((byte) 117) + ".log");
							if (var13.exists()) {
								Class56.panelBoxMessage("file already exists!", 155792082);
								return;
							}
						}
						if (Class215.aFileOutputStream2086 != null) {
							Class215.aFileOutputStream2086.close();
							Class215.aFileOutputStream2086 = null;
						}
						try {
							Class215.aFileOutputStream2086 = new FileOutputStream(var13);
						} catch (FileNotFoundException var6) {
							Class56.panelBoxMessage("Could not create " + var13.getName(), -2047691667);
						} catch (SecurityException var7) {
							Class56.panelBoxMessage("Cannot write to " + var13.getName(), 1383320568);
						}
						return;
					}
					if (arg0.equals("closeoutput")) {
						if (Class215.aFileOutputStream2086 != null) {
							Class215.aFileOutputStream2086.close();
						}
						Class215.aFileOutputStream2086 = null;
						return;
					}
					if (arg0.startsWith("runscript ")) {
						var13 = new File(arg0.substring(10));
						if (!var13.exists()) {
							Class56.panelBoxMessage("No such file", 1854339861);
							return;
						}
						byte[] var2 = Class436.method5577(var13, 689170094);
						if (var2 == null) {
							Class56.panelBoxMessage("Failed to read file", -1424851114);
							return;
						}
						String[] var3 = Class226.method2309(Class421.method5291(Class300.method2977(var2, (byte) 0), '\r', "", -1794164394), '\n', (byte) -111);
						Class352.method4072(var3, -2039971238);
					}
					if (client.anInt8995 == 1 || client.anInt8995 == 15) {
						Class1 var14 = Class426.method5317(1995385596);
						var15 = Class238.method2377(OutgoingPacket.COMMAND_PACKET, var14.aClass488_22, 250372184);
						var15.aClass330_Sub46_Sub2_7729.addByte(arg0.length() + 3, (byte) 115);
						var15.aClass330_Sub46_Sub2_7729.addByte(0, (byte) 122);
						var15.aClass330_Sub46_Sub2_7729.addByte(0, (byte) 10);
						var15.aClass330_Sub46_Sub2_7729.addString(arg0, (byte) -21);
						var14.method378(var15, -1876950532);
					}
				} catch (Exception var8) {
					Class56.panelBoxMessage(Class526.aClass526_6139.method6257(Class429.aClass454_4369, 991479434), -2147346070);
					return;
				}
			}
			if (client.anInt8995 != 1 && client.anInt8995 != 15) {
				Class56.panelBoxMessage(Class526.aClass526_6040.method6257(Class429.aClass454_4369, 991479434) + arg0, 1838240178);
			}
		} catch (RuntimeException var10) {
			var10.printStackTrace();
			throw Class476.method5964(var10, "rf.x(" + ')');
		}
	}

	public static final void method5242(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class556.aClass510_6392.getItemDefinitions(var2, (byte) -57).anInt6751;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "rf.aby(" + ')');
		}
	}

	public static final void method5243(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -287236116);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class439.method5599(var3, var4, true, 0, arg0, (byte) 37);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "rf.hb(" + ')');
		}
	}
}
