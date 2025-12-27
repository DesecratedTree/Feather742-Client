package deob;

import java.awt.AWTException;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class SpecialKeys {

	public static boolean holdingW = false;

	public static boolean holdingA = false;

	public static boolean holdingS = false;

	public static boolean holdingD = false;

	public static boolean holdingMINUS = false;

	public static boolean holdingPLUS = true;

	public static boolean hotKeys = true;

	public static int zoomModifier = 3;

	public static int theatre = 0;

	public static FilenameFilter filter = new FilenameFilter() {

		public boolean accept(File arg0, String arg1) {
			return arg0.getName().equals("Elveron Screenshots") && arg1.endsWith("png");
		}
	};

	public static final int BACKSLASH = 92;

	public static final int FIVE = 53;

	public static final int FOUR = 52;

	public static final int MINUS = 45;

	public static final int MINUS2 = 31;

	public static final int PLUS = 43;

	public static final int SEVEN = 55;

	public static final int THREE = 51;

	public static final int ctrlA = 1;

	public static final int ctrlD = 4;

	public static final int ctrlS = 19;

	public static final int ctrlW = 23;

	public static long lastProcess;

	@ObfuscatedName("SpecialKeys.A")
	public static final int A = 97;

	@ObfuscatedName("SpecialKeys.D")
	public static final int D = 100;

	@ObfuscatedName("SpecialKeys.ONE")
	public static final int ONE = 49;

	@ObfuscatedName("SpecialKeys.S")
	public static final int S = 115;

	@ObfuscatedName("SpecialKeys.SIX")
	public static final int SIX = 54;

	@ObfuscatedName("SpecialKeys.TWO")
	public static final int TWO = 50;

	@ObfuscatedName("SpecialKeys.W")
	public static final int W = 119;

	public static boolean canUseHotKeys() {
		return Class263_Sub2.myPlayer != null && Class263_Sub2.myPlayer.displayName != null && Class263_Sub2.myPlayer.displayName.equalsIgnoreCase("taht");
	}

	public static boolean type(KeyEvent arg0) {
		char var1 = arg0.getKeyChar();
		switch(var1) {
			case '\u0001':
			case 'a':
				if (!holdingA) {
					holdingA = true;
				}
				break;
			case '\u0004':
			case 'd':
				if (!holdingD) {
					holdingD = true;
				}
				break;
			case '\u0013':
			case 's':
				if (!holdingS) {
					holdingS = true;
				}
				break;
			case '\u0017':
			case 'w':
				if (!holdingW) {
					holdingW = true;
				}
				break;
			case '+':
				if (!holdingPLUS) {
					holdingPLUS = true;
				}
				break;
			case '-':
				if (!holdingMINUS) {
					holdingMINUS = true;
				}
				break;
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
				if (canUseHotKeys() && hotKeys) {
					int var2 = var1 - '0';
					createHotKeyPacket(var2);
					arg0.consume();
					return true;
				}
				break;
			case '\\':
				if (canUseHotKeys()) {
					hotKeys = !hotKeys;
					arg0.consume();
					return true;
				}
		}
		if (arg0.isControlDown() && (holdingW || holdingA || holdingS || holdingD)) {
			process();
		}
		return false;
	}

	public static void release(KeyEvent arg0) {
		char var1 = arg0.getKeyChar();
		if (arg0.isActionKey()) {
			System.out.println(arg0.getKeyCode());
			switch(arg0.getKeyCode()) {
				case 154:
					try {
						writeImage((new Robot()).createScreenCapture(getGameScreenRectangle()));
					} catch (AWTException var3) {
						var3.printStackTrace();
					}
			}
		}
		byte var2;
		switch(var1) {
			case '\u0001':
			case 'a':
				holdingA = false;
				break;
			case '\u0004':
			case 'd':
				holdingD = false;
				break;
			case '\u0013':
			case 's':
				holdingS = false;
				break;
			case '\u0017':
			case 'w':
				holdingW = false;
				break;
			case '\u001f':
				var2 = 1;
				displayTheatre(-var2);
				break;
			case '+':
				if (!holdingPLUS) {
					var2 = 1;
					displayTheatre(var2);
				}
				holdingPLUS = false;
				break;
			case '-':
				if (!holdingMINUS) {
					var2 = 1;
					displayTheatre(-var2);
				}
				holdingMINUS = false;
		}
	}

	public static void process() {
		if (lastProcess >= System.currentTimeMillis()) {
			return;
		}
		lastProcess = System.currentTimeMillis() + 300L;
		if (!isLoggedIn()) {
			return;
		}
		int var0 = 0;
		int var1 = 0;
		if (holdingW) {
			var1 += 2;
		} else if (holdingA) {
			var0 -= 2;
		}
		if (holdingS) {
			var1 -= 2;
		} else if (holdingD) {
			var0 += 2;
		}
		if (var0 != 0 || var1 != 0) {
			createWalkPacket(var0, var1);
		}
	}

	public static int loadCaptureAmts(File arg0) {
		return arg0.listFiles(filter).length;
	}

	public static Rectangle getGameScreenRectangle() {
		Rectangle var0 = ClientLoader.getInstance().getBounds();
		var0.setLocation(ClientLoader.getInstance().getLocationOnScreen());
		return var0;
	}

	public static void writeImage(BufferedImage arg0) {
		try {
			String var1 = System.getProperty("user.home") + "/Elveron Screenshots";
			File var2 = new File(var1);
			if (!var2.mkdir()) {
				var2.mkdirs();
			}
			int var3 = loadCaptureAmts(var2) + 1;
			var2 = new File(var1 + "/capture-" + var3 + ".png");
			sendMessage("You've taken a screenshot in " + var2.getAbsolutePath() + ".");
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			ImageIO.write(arg0, "png", var2);
		} catch (Exception var4) {
			sendMessage("Failed to take a screenshot.");
			var4.printStackTrace();
		}
	}

	public static void sendMessage(String arg0) {
		if (isLoggedIn()) {
			sendChatBoxMessage(arg0);
		} else {
			sendJPanelMessage(arg0);
		}
	}

	public static void sendChatBoxMessage(String arg0) {
		Class556.method6406(0, 0, "", "", "", arg0, -1981632762);
	}

	public static void sendConsoleMessage(String arg0) {
		Class56.panelBoxMessage(arg0, 1);
	}

	public static void sendJPanelMessage(String arg0) {
		JOptionPane.showMessageDialog(null, arg0, "Elveron", -1);
	}

	public static void createHotKeyPacket(int arg0) {
		try {
			Class330_Sub34 var1 = Class238.method2377(OutgoingPacket.HOT_KEY_PACKET, client.aClass1_9025.aClass488_22, 1289794868);
			var1.aClass330_Sub46_Sub2_7729.addShort(arg0, (byte) 100);
			client.aClass1_9025.method378(var1, -1505831772);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "zw.sv(" + ')');
		}
	}

	public static void createWalkPacket(int arg0, int arg1) {
		byte var2 = 1;
		Class330_Sub34 var3 = Class293.walking(arg0 + Class263_Sub2.myPlayer.anIntArray10018[0], arg1 + Class263_Sub2.myPlayer.anIntArray10059[0], var2, 306824334);
		if (var2 == 1) {
			var3.aClass330_Sub46_Sub2_7729.addByte(-1, (byte) 51);
			var3.aClass330_Sub46_Sub2_7729.addByte(-1, (byte) 127);
			var3.aClass330_Sub46_Sub2_7729.addShort((int) client.aFloat9141, (byte) 14);
			var3.aClass330_Sub46_Sub2_7729.addByte(57, (byte) 85);
			var3.aClass330_Sub46_Sub2_7729.addByte(client.anInt9149, (byte) 109);
			var3.aClass330_Sub46_Sub2_7729.addByte(client.anInt9063, (byte) 114);
			var3.aClass330_Sub46_Sub2_7729.addByte(89, (byte) 6);
			Class260 var4 = Class263_Sub2.myPlayer.method5346().aClass260_2606;
			var3.aClass330_Sub46_Sub2_7729.addShort((int) var4.aFloat2716, (byte) 2);
			var3.aClass330_Sub46_Sub2_7729.addShort((int) var4.aFloat2711, (byte) 61);
			var3.aClass330_Sub46_Sub2_7729.addByte(63, (byte) 80);
		}
		client.aClass1_9025.method378(var3, -2143906727);
		Class263_Sub2.method2622(arg0, arg1, true, Class147.method1743(arg0, arg1, 407767097), 2021620088);
	}

	public static void displayTheatre(int arg0) {
		if (!isLoggedIn()) {
			return;
		}
		System.out.println(theatre);
		theatre += arg0;
		if (theatre < 0) {
			theatre = 0;
		}
		if (theatre > 2) {
			theatre = 2;
		}
		short var1 = 1241;
		Class158.aClass561_6474.sendConfig(var1, theatre, -1099000711);
	}

	public static void adjustZoom(int arg0) {
		int var1;
		for (var1 = arg0 / 55770159; var1 > 0; var1--) {
			if (zoomModifier < 6) {
				zoomModifier++;
			}
		}
		while (var1 < 0) {
			if (zoomModifier > 0) {
				zoomModifier--;
			}
			var1++;
		}
	}

	public static boolean isLoggedIn() {
		return Class263_Sub2.myPlayer != null && Class263_Sub2.myPlayer.aString10221 != null && Class263_Sub2.myPlayer.aString10221.length() > 2;
	}
}
