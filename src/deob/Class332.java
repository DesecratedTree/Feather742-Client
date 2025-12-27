package deob;

import jaclib.nanotime.QueryPerformanceCounter;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;

public abstract class Class332 implements Interface16, Runnable, FocusListener, WindowListener {

	public static String aString6601 = "main_file_cache.idx";

	public static long aLong6602 = 20000000L;

	public static int anInt6603 = 0;

	public static int anInt6605 = 32;

	public static long[] aLongArray6606 = new long[32];

	public static long[] aLongArray6616 = new long[32];

	public static int anInt6621 = 1048576;

	public static String aString6622 = "rw";

	public static String aString6623 = "main_file_cache.dat2";

	public static String aString6625 = "main_file_cache.idx255";

	public static String aString6626 = "random.dat";

	public static int anInt6628 = 786432000;

	public static int anInt6630 = 0;

	public static int anInt6631 = 1;

	public static int anInt6611 = 0;

	public static int anInt6612 = 0;

	public static String aString6613 = null;

	public static volatile boolean aBoolean6619 = true;

	public static int anInt6615 = 500;

	public static volatile boolean aBoolean6610 = false;

	public static volatile long aLong6627 = 0L;

	public static boolean aBoolean6618 = false;

	public static volatile boolean aBoolean6639 = true;

	public static Class489 aClass489_6607 = null;

	public static Class489 aClass489_6624 = null;

	public static Class489 aClass489_6614 = null;

	public static Class331 aClass331_6632 = null;

	public static long aLong6633 = 0L;

	public static boolean aBoolean6634 = false;

	public static int anInt6617 = -1;

	public static int anInt6637 = 1;

	public boolean aBoolean6620 = false;

	public boolean aBoolean6638 = false;

	public static int anInt6608;

	public static int anInt6609;

	public static int anInt6635;

	public static int anInt6636;

	public static Class315 aClass315_6604;

	public static String aString6629;

	public static Object[] anObjectArray6640;

	public void supplyApplet(Applet arg0) {
		try {
			Class293.anApplet6804 = arg0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nv.supplyApplet(" + ')');
		}
	}

	public final void method3878(Class318 arg0, String arg1, String arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
		try {
			try {
				this.method3892(Class331.aClass331_3344, arg7, (byte) 1);
				anInt6609 = Class300.anInt3058 = arg0.method3154(1978419644);
				Class520.anInt6017 = Class146.anInt1615 = arg0.method3155((byte) 8);
				anInt6611 = 0;
				anInt6612 = 0;
				if (Class147.method1739((byte) -49) == Class331.aClass331_3345) {
					anInt6609 += arg0.method3156(1481579281) * 2;
					Class520.anInt6017 += arg0.method3157((byte) 0) * 2;
					this.method3881(arg0.method3153(-819003973), -1184595387);
				}
				RuntimeException_Sub2.anApplet6443 = Class293.anApplet6804;
				this.method3879(arg1, arg2, arg3, arg4, arg5, arg6, 675863176);
			} catch (Throwable var11) {
				Class207.method2195(null, var11, -306254718);
				this.method3890("crash", -450435261);
			}
		} catch (RuntimeException var12) {
			throw Class476.method5964(var12, "nv.r(" + ')');
		}
	}

	public final void method3879(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) throws Exception {
		try {
			Class197.anInt1913 = arg3;
			Class330_Sub26_Sub1.anInt9571 = arg2;
			Exception_Sub2.anInt15 = arg4;
			RuntimeException_Sub2.anInt6441 = arg5;
			Class556.aString6391 = "Unknown";
			Class116.aString1375 = "1.1";
			try {
				Class556.aString6391 = System.getProperty("java.vendor");
				Class116.aString1375 = System.getProperty("java.version");
			} catch (Exception var20) {
			}
			try {
				Class314.aString3255 = System.getProperty("os.name");
			} catch (Exception var19) {
				Class314.aString3255 = "Unknown";
			}
			Class212.aString6533 = Class314.aString3255.toLowerCase();
			try {
				Class152.aString1629 = System.getProperty("os.arch").toLowerCase();
			} catch (Exception var18) {
				Class152.aString1629 = "";
			}
			try {
				aString6629 = System.getProperty("os.version").toLowerCase();
			} catch (Exception var17) {
				aString6629 = "";
			}
			try {
				Class291.aString2978 = System.getProperty("user.home");
				if (Class291.aString2978 != null) {
					Class291.aString2978 = Class291.aString2978 + "/";
				}
			} catch (Exception var16) {
			}
			try {
				if (Class212.aString6533.startsWith("win")) {
					if (Class291.aString2978 == null) {
						Class291.aString2978 = System.getenv("USERPROFILE");
					}
				} else if (Class291.aString2978 == null) {
					Class291.aString2978 = System.getenv("HOME");
				}
				if (Class291.aString2978 != null) {
					Class291.aString2978 = Class291.aString2978 + "/";
				}
			} catch (Exception var15) {
			}
			if (Class291.aString2978 == null) {
				Class291.aString2978 = "~/";
			}
			try {
				Class170.anEventQueue1724 = Toolkit.getDefaultToolkit().getSystemEventQueue();
			} catch (Throwable var14) {
			}
			Class455.aStringArray5562 = new String[] { "c:/elvycache/", "/elvycache/", "c:/windows/", "c:/winnt/", "c:/", Class291.aString2978, "/tmp/", "" };
			Class22.aStringArray303 = new String[] { ".rn_cache_" + Class330_Sub26_Sub1.anInt9571, ".file_store_" + Class330_Sub26_Sub1.anInt9571 };
			int var8 = 0;
			int var11;
			label151: while (var8 < 4) {
				Class60.aFile559 = this.method3904(arg0, arg1, var8, 559009002);
				if (!Class60.aFile559.exists()) {
					Class60.aFile559.mkdirs();
				}
				File[] var9 = Class60.aFile559.listFiles();
				if (var9 == null) {
					break;
				}
				File[] var10 = var9;
				var11 = 0;
				while (true) {
					if (var11 >= var10.length) {
						break label151;
					}
					File var12 = var10[var11];
					if (!this.method3900(var12, false, -254652209)) {
						if (arg6 <= -16777216) {
							throw new IllegalStateException();
						}
						var8++;
						break;
					}
					var11++;
				}
			}
			File var22 = new File(Class60.aFile559, "preferences" + "" + ".dat");
			if (!var22.exists()) {
				System.out.println(var22.getAbsolutePath() + " doesn't exist.");
				Preferences.copyPreferenceFile("preferences" + "" + ".dat", var22);
				if (!var22.exists()) {
					System.out.println(var22.getAbsolutePath() + " still doesn't exist.");
				}
			}
			var22 = new File(Class60.aFile559, "preferences" + "2" + ".dat");
			if (!var22.exists()) {
				System.out.println(var22.getAbsolutePath() + " doesn't exist.");
				Preferences.copyPreferenceFile("preferences" + "2" + ".dat", var22);
				if (!var22.exists()) {
					System.out.println(var22.getAbsolutePath() + " still doesn't exist.");
				}
			}
			Class464_Sub2.method5739(Class60.aFile559, -1156589125);
			Class75.method852(-1395436150);
			aClass489_6624 = new Class489(new Class490(Class207.method2192("main_file_cache.dat2", -126784919), "rw", 786432000L), 5200, 0);
			aClass489_6614 = new Class489(new Class490(Class207.method2192("main_file_cache.idx255", -126784919), "rw", 1048576L), 6000, 0);
			Class440.aClass489Array4481 = new Class489[Class197.anInt1913];
			for (int var23 = 0; var23 < Class197.anInt1913; var23++) {
				Class440.aClass489Array4481[var23] = new Class489(new Class490(Class207.method2192("main_file_cache.idx" + var23, -126784919), "rw", 1048576L), 6000, 0);
			}
			try {
				Class203.aClass504_6790 = new Class504();
			} catch (Exception var13) {
				Class503.aBoolean5914 = false;
			}
			Gfx.aClass323_577 = new Class323();
			ThreadGroup var24 = Thread.currentThread().getThreadGroup();
			for (ThreadGroup var25 = var24.getParent(); var25 != null; var25 = var25.getParent()) {
				var24 = var25;
			}
			Thread[] var26 = new Thread[1000];
			var24.enumerate(var26);
			for (var11 = 0; var11 < var26.length; var11++) {
				if (var26[var11] != null && var26[var11].getName().startsWith("AWT")) {
					var26[var11].setPriority(1);
				}
			}
			Thread var27 = new Thread(this);
			var27.setDaemon(true);
			var27.start();
			var27.setPriority(1);
		} catch (RuntimeException var21) {
			throw Class476.method5964(var21, "nv.j(" + ')');
		}
	}

	public boolean method3880(File arg0, int arg1) {
		try {
			if (arg0 == null) {
				return false;
			} else if (!arg0.exists()) {
				return false;
			} else if (!arg0.isDirectory()) {
				return false;
			} else if (arg0.listFiles().length != 0) {
				return false;
			} else if (this.method3900(new File(arg0, "test.dat"), true, -1330938325)) {
				this.method3908(arg0, Class60.aFile559, 1295811465);
				return true;
			} else {
				return false;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "nv.p(" + ')');
		}
	}

	public synchronized void method3881(String arg0, int arg1) {
		try {
			Class267.aFrame2740 = new Frame();
			Class267.aFrame2740.setTitle(arg0);
			Class267.aFrame2740.setResizable(true);
			Class267.aFrame2740.addWindowListener(this);
			Class267.aFrame2740.setBackground(Color.black);
			Class267.aFrame2740.setVisible(true);
			Class267.aFrame2740.toFront();
			Insets var3 = Class267.aFrame2740.getInsets();
			Class267.aFrame2740.setSize(var3.left + anInt6609 + var3.right, Class520.anInt6017 + var3.top + var3.bottom);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "nv.x(" + ')');
		}
	}

	public final void update(Graphics arg0) {
		try {
			this.method241(arg0);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nv.update(" + ')');
		}
	}

	public void method3882(Container arg0, int arg1) {
		try {
			arg0.setBackground(Color.black);
			arg0.setLayout(null);
			arg0.add(Class475.aCanvas5700);
			Class475.aCanvas5700.setSize(Class300.anInt3058, Class146.anInt1615);
			Class475.aCanvas5700.setVisible(true);
			if (arg0 == Class267.aFrame2740) {
				Insets var3 = Class267.aFrame2740.getInsets();
				Class475.aCanvas5700.setLocation(var3.left + anInt6611, anInt6612 + var3.top);
			} else {
				Class475.aCanvas5700.setLocation(anInt6611, anInt6612);
			}
			Class475.aCanvas5700.addFocusListener(this);
			Class475.aCanvas5700.requestFocus();
			Class76_Sub1_Sub3.aBoolean9380 = true;
			aBoolean6639 = true;
			Class475.aCanvas5700.setFocusTraversalKeysEnabled(false);
			aBoolean6619 = true;
			aBoolean6610 = false;
			aLong6627 = Class312.method3111((byte) 74);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "nv.c(" + ')');
		}
	}

	public final boolean method3884(byte arg0) {
		try {
			String var2 = Class293.anApplet6804.getDocumentBase().getHost().toLowerCase();
			if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
				return true;
			} else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
				return true;
			} else if (var2.equals("stellardawn.com") || var2.endsWith(".stellardawn.com")) {
				return true;
			} else if (var2.endsWith("127.0.0.1")) {
				return true;
			} else if (var2.contains("elveron.no-ip.org") || var2.contains("192.99.200.222")) {
				return true;
			} else {
				while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
					var2 = var2.substring(0, var2.length() - 1);
				}
				return var2.endsWith("192.168.1.") ? true : true;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nv.e(" + ')');
		}
	}

	public void run() {
		try {
			try {
				try {
					this.method3885(1062864240);
				} catch (ThreadDeath var2) {
					throw var2;
				} catch (Throwable var3) {
					Class207.method2195(this.method3886(732713930), var3, -306254718);
					this.method3890("crash", -1023255260);
					this.method3888(true, -1413853800);
					return;
				}
				this.method3888(true, -504562400);
			} catch (RuntimeException var4) {
				this.method3888(true, 1147040293);
				throw var4;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "nv.run(" + ')');
		}
	}

	public void method3885(int arg0) {
		try {
			if (Class556.aString6391 != null) {
				String var2 = Class556.aString6391.toLowerCase();
				if (var2.indexOf("sun") != -1 || var2.indexOf("apple") != -1) {
					String var3 = Class116.aString1375;
					if (var3.equals("1.1") || var3.startsWith("1.1.") || var3.equals("1.2") || var3.startsWith("1.2.") || var3.equals("1.3") || var3.startsWith("1.3.") || var3.equals("1.4") || var3.startsWith("1.4.") || var3.equals("1.5") || var3.startsWith("1.5.") || var3.equals("1.6.0")) {
						this.method3890("wrongjava", -764074340);
						return;
					}
					if (var3.startsWith("1.6.0_")) {
						int var4;
						for (var4 = 6; var4 < var3.length() && Class67.method795(var3.charAt(var4), (short) 30164); var4++) {
						}
						String var5 = var3.substring(6, var4);
						if (Class72.method829(var5, 1416815884) && Class204.method2185(var5, (byte) -76) < 10) {
							this.method3890("wrongjava", -141255499);
							return;
						}
					}
				}
			}
			Class432_Sub1_Sub3_Sub1.method5526((byte) 54).setFocusCycleRoot(true);
			anInt6617 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
			anInt6637 = Runtime.getRuntime().availableProcessors();
			this.method3901((byte) -21);
			this.method3898(-553488135);
			aClass315_6604 = Class93.method1087((byte) -102);
			while (aLong6633 == 0L || Class312.method3111((byte) 95) < aLong6633) {
				anInt6636 = aClass315_6604.method3135(aLong6602);
				for (int var7 = 0; var7 < anInt6636; var7++) {
					this.method3893(1149689938);
				}
				this.method3887(-2117112672);
				Class285.method2862(Class475.aCanvas5700, -852498511);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "nv.m(" + ')');
		}
	}

	public String method3886(int arg0) {
		try {
			return null;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nv.v(" + ')');
		}
	}

	public void method3887(int arg0) {
		try {
			long var2 = Class312.method3111((byte) 77);
			long var4 = aLongArray6606[Class451.anInt6642];
			aLongArray6606[Class451.anInt6642] = var2;
			Class451.anInt6642 = Class451.anInt6642 + 1 & 0x1F;
			if (var4 != 0L && var2 > var4) {
				int var6 = (int) (var2 - var4);
				anInt6603 = ((var6 >> 1) + 32000) / var6;
			}
			if (++anInt6615 - 1 > 50) {
				anInt6615 -= 50;
				aBoolean6619 = true;
				Class475.aCanvas5700.setSize(Class300.anInt3058, Class146.anInt1615);
				Class475.aCanvas5700.setVisible(true);
				if (Class267.aFrame2740 != null && Class130.aFrame1498 == null) {
					Insets var8 = Class267.aFrame2740.getInsets();
					Class475.aCanvas5700.setLocation(var8.left + anInt6611, var8.top + anInt6612);
				} else {
					Class475.aCanvas5700.setLocation(anInt6611, anInt6612);
				}
			}
			this.method3889((byte) -52);
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "nv.y(" + ')');
		}
	}

	public final synchronized void method241(Graphics arg0) {
		try {
			if (!aBoolean6634) {
				aBoolean6619 = true;
				if (Class312.method3111((byte) 33) - aLong6627 > 1000L) {
					Rectangle var2 = arg0.getClipBounds();
					if (var2 == null || var2.width >= anInt6609 && var2.height >= Class520.anInt6017) {
						aBoolean6610 = true;
					}
				}
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nv.paint(" + ')');
		}
	}

	public final void method3888(boolean arg0, int arg1) {
		try {
			synchronized (this) {
				if (aBoolean6634) {
					return;
				}
				aBoolean6634 = true;
			}
			try {
				this.method3903(1368964899);
			} catch (Exception var7) {
			}
			try {
				aClass489_6624.method6054(-306678499);
				for (int var3 = 0; var3 < Class197.anInt1913; var3++) {
					Class440.aClass489Array4481[var3].method6054(-1999662828);
				}
				aClass489_6614.method6054(-274595212);
				aClass489_6607.method6054(-1472163246);
			} catch (Exception var8) {
			}
			if (this.aBoolean6638) {
				try {
					QueryPerformanceCounter.quit();
				} catch (Throwable var6) {
				}
			}
			Class71.method825(true, (short) -6428);
			if (Class384.method4421((byte) 76)) {
				Class489.method6063(-1102372689).method332((byte) 116);
			}
			if (Class475.aCanvas5700 != null) {
				try {
					Class475.aCanvas5700.removeFocusListener(this);
					Class475.aCanvas5700.getParent().remove(Class475.aCanvas5700);
				} catch (Exception var5) {
				}
			}
			if (Class267.aFrame2740 != null) {
				Class267.aFrame2740.setVisible(false);
				Class267.aFrame2740.dispose();
				Class267.aFrame2740 = null;
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "nv.ay(" + ')');
		}
	}

	public void start() {
		try {
			if (!aBoolean6634) {
				aLong6633 = 0L;
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "nv.start(" + ')');
		}
	}

	public final void windowDeiconified(WindowEvent arg0) {
	}

	public void destroy() {
		try {
			if (!aBoolean6634) {
				aLong6633 = Class312.method3111((byte) 75);
				Class464_Sub21.method5813(5000L);
				this.method3888(false, -479606648);
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "nv.destroy(" + ')');
		}
	}

	public final void focusGained(FocusEvent arg0) {
		try {
			aBoolean6639 = true;
			aBoolean6619 = true;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nv.focusGained(" + ')');
		}
	}

	public final void focusLost(FocusEvent arg0) {
		try {
			aBoolean6639 = false;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nv.focusLost(" + ')');
		}
	}

	public final void windowActivated(WindowEvent arg0) {
	}

	public final void windowClosing(WindowEvent arg0) {
		try {
			aBoolean6618 = true;
			this.destroy();
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nv.windowClosing(" + ')');
		}
	}

	public final void windowDeactivated(WindowEvent arg0) {
	}

	public final void windowIconified(WindowEvent arg0) {
	}

	public final void windowOpened(WindowEvent arg0) {
	}

	public void method3890(String arg0, int arg1) {
		try {
			if (!this.aBoolean6620) {
				this.aBoolean6620 = true;
				System.out.println("error_game_" + arg0);
				try {
					Class492.method6078(Class293.anApplet6804, "loggedout", (byte) 1);
				} catch (Throwable var5) {
				}
				try {
					Class293.anApplet6804.getAppletContext().showDocument(new URL("http://elveron.org/" + "error_game_" + arg0 + ".ws"), "_top");
				} catch (Exception var4) {
				}
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "nv.ad(" + ')');
		}
	}

	public boolean method3891(byte arg0) {
		try {
			return Class489.method6063(-1102372689).method327("jagtheora", 838091566);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nv.af(" + ')');
		}
	}

	public void method3892(Class331 arg0, boolean arg1, byte arg2) {
		try {
			if (arg0 == null) {
				throw new NullPointerException();
			} else if (arg0 == Class331.aClass331_3344 || arg0 == Class331.aClass331_3343) {
				aClass331_6632 = arg0;
				if (Class331.aClass331_3343 != aClass331_6632 && arg1) {
					aClass331_6632 = Class331.aClass331_3345;
				}
			} else {
				throw new IllegalStateException();
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "nv.aq(" + ')');
		}
	}

	public void method3893(int arg0) {
		try {
			long var2 = Class312.method3111((byte) 119);
			long var4 = aLongArray6616[anInt6608];
			aLongArray6616[anInt6608] = var2;
			anInt6608 = anInt6608 + 1 & 0x1F;
			if (var4 != 0L && var2 <= var4) {
			}
			synchronized (this) {
				Class76_Sub1_Sub3.aBoolean9380 = aBoolean6639;
			}
			this.method3883((byte) -42);
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "nv.h(" + ')');
		}
	}

	public void method242(Applet arg0) {
		Class293.anApplet6804 = arg0;
	}

	public void method252(Applet arg0) {
		Class293.anApplet6804 = arg0;
	}

	public boolean method3900(File arg0, boolean arg1, int arg2) {
		try {
			boolean var4;
			try {
				RandomAccessFile var5 = new RandomAccessFile(arg0, "rw");
				int var6 = var5.read();
				var5.seek(0L);
				var5.write(var6);
				var5.seek(0L);
				var5.close();
				if (arg1) {
					arg0.delete();
				}
				var4 = true;
			} catch (Exception var7) {
				return false;
			}
			return var4;
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "nv.s(" + ')');
		}
	}

	public synchronized void method3901(byte arg0) {
		try {
			this.method3906(-987136161);
			Container var2 = Class432_Sub1_Sub3_Sub1.method5526((byte) 68);
			Class475.aCanvas5700 = new Canvas_Sub1(var2);
			this.method3882(var2, 1438883820);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nv.g(" + ')');
		}
	}

	public void stop() {
		try {
			if (!aBoolean6634) {
				aLong6633 = Class312.method3111((byte) 29) + 4000L;
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "nv.stop(" + ')');
		}
	}

	public boolean method3902(short arg0) {
		try {
			this.aBoolean6638 = Class489.method6063(-1102372689).method327("jaclib", -1337218933);
			if (this.aBoolean6638) {
				try {
					QueryPerformanceCounter.init();
				} catch (Throwable var3) {
				}
			}
			return this.aBoolean6638;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "nv.an(" + ')');
		}
	}

	public void method244(Applet arg0) {
		Class293.anApplet6804 = arg0;
	}

	public File method3904(String arg0, String arg1, int arg2, int arg3) {
		try {
			String var5 = arg2 == 0 ? "" : "" + arg2;
			Class398.aFile4116 = new File(Class291.aString2978, "rn_cl_" + arg0 + "_" + arg1 + var5 + ".dat");
			String var6 = null;
			String var7 = null;
			boolean var8 = false;
			int var10;
			File var20;
			if (Class398.aFile4116.exists()) {
				try {
					Class490 var9 = new Class490(Class398.aFile4116, "rw", 10000L);
					Buffer var11 = new Buffer((int) var9.method6066(1742373643));
					while (var11.offset < var11.payload.length) {
						var10 = var9.method6067(var11.payload, var11.offset, var11.payload.length - var11.offset, (byte) 83);
						if (var10 == -1) {
							throw new IOException();
						}
						var11.offset += var10;
					}
					var11.offset = 0;
					var10 = var11.readUnsignedByte(1436566972);
					if (var10 < 1 || var10 > 3) {
						throw new IOException("" + var10);
					}
					int var12 = 0;
					if (var10 > 1) {
						var12 = var11.readUnsignedByte(1685879586);
					}
					if (var10 <= 2) {
						var6 = var11.readJagString((byte) 6);
						if (var12 == 1) {
							var7 = var11.readJagString((byte) 6);
						}
					} else {
						var6 = var11.method3804(-1057524025);
						if (var12 == 1) {
							var7 = var11.method3804(-1898776352);
						}
					}
					var9.method6064(-1941031576);
				} catch (IOException var18) {
					var18.printStackTrace();
				}
				if (var6 != null) {
					var20 = new File(var6);
					if (!var20.exists()) {
						var6 = null;
					}
				}
				if (var6 != null) {
					var20 = new File(var6, "test.dat");
					if (!this.method3900(var20, true, 1333923828)) {
						var6 = null;
					}
				}
			}
			if (var6 == null && arg2 == 0) {
				label106: for (int var21 = 0; var21 < Class22.aStringArray303.length; var21++) {
					for (var10 = 0; var10 < Class455.aStringArray5562.length; var10++) {
						File var23 = new File(Class455.aStringArray5562[var10] + Class22.aStringArray303[var21] + File.separatorChar + arg0 + File.separatorChar);
						if (var23.exists() && this.method3900(new File(var23, "test.dat"), true, 472896489)) {
							var6 = var23.toString();
							var8 = true;
							break label106;
						}
					}
				}
			}
			if (var6 == null) {
				var6 = Class291.aString2978 + File.separatorChar + "elvycache" + var5 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
				var8 = true;
			}
			if (var7 != null) {
				var20 = new File(var7);
				File var22 = new File(var6);
				try {
					File[] var24 = var20.listFiles();
					File[] var25 = var24;
					for (int var13 = 0; var13 < var25.length; var13++) {
						File var14 = var25[var13];
						File var15 = new File(var22, var14.getName());
						boolean var16 = var14.renameTo(var15);
						if (!var16) {
							throw new IOException();
						}
					}
				} catch (Exception var17) {
					var17.printStackTrace();
				}
				var8 = true;
			}
			if (var8) {
				this.method3908(new File(var6), null, 1367213427);
			}
			return new File(var6);
		} catch (RuntimeException var19) {
			throw Class476.method5964(var19, "nv.i(" + ')');
		}
	}

	public final void windowClosed(WindowEvent arg0) {
	}

	public void method246() {
		if (!aBoolean6634) {
			aLong6633 = 0L * -3305886959092370751L;
		}
	}

	public void method247() {
		if (!aBoolean6634) {
			aLong6633 = 0L * -3305886959092370751L;
		}
	}

	public void method248() {
		if (!aBoolean6634) {
			aLong6633 = 0L * -3305886959092370751L;
		}
	}

	public void method249() {
		if (!aBoolean6634) {
			aLong6633 = (Class312.method3111((byte) 66) + 4000L) * -3296245712228999871L * -3305886959092370751L;
		}
	}

	public void method250() {
		if (!aBoolean6634) {
			aLong6633 = (Class312.method3111((byte) 88) + 4000L) * -3296245712228999871L * -3305886959092370751L;
		}
	}

	public void method251() {
		if (!aBoolean6634) {
			aLong6633 = Class312.method3111((byte) 3) * -3296245712228999871L * -3305886959092370751L;
			Class464_Sub21.method5813(5000L);
			this.method3888(false, 1059359432);
		}
	}

	public final void method240(Graphics arg0) {
		this.method241(arg0);
	}

	public final synchronized void method254(Graphics arg0) {
		if (aBoolean6634) {
			return;
		}
		aBoolean6619 = true;
		if (Class312.method3111((byte) 104) - aLong6627 * -8798482640098983969L * 5057132460779437087L > 1000L) {
			Rectangle var2 = arg0.getClipBounds();
			if (var2 == null || var2.width >= anInt6609 * 1458663577 * -1408375895 && var2.height >= Class520.anInt6017 * 394893517 * 1944065029) {
				aBoolean6610 = true;
			}
		}
	}

	public final void method253(Graphics arg0) {
		this.method241(arg0);
	}

	public void method243() {
		if (!aBoolean6634) {
			aLong6633 = (Class312.method3111((byte) 127) + 4000L) * -3296245712228999871L * -3305886959092370751L;
		}
	}

	public void method245() {
		if (!aBoolean6634) {
			aLong6633 = 0L * -3305886959092370751L;
		}
	}

	public void method3906(int arg0) {
		try {
			if (Class475.aCanvas5700 != null) {
				Class475.aCanvas5700.removeFocusListener(this);
				Class475.aCanvas5700.getParent().setBackground(Color.black);
				Class475.aCanvas5700.getParent().remove(Class475.aCanvas5700);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nv.a(" + ')');
		}
	}

	public final void method239(Graphics arg0) {
		this.method241(arg0);
	}

	public void method3908(File arg0, File arg1, int arg2) {
		try {
			try {
				Class490 var4 = new Class490(Class398.aFile4116, "rw", 10000L);
				Buffer var5 = new Buffer(500);
				var5.addByte(3, (byte) 77);
				var5.addByte(arg1 == null ? 0 : 1, (byte) 12);
				var5.method3799(arg0.getPath(), (byte) -80);
				if (arg1 != null) {
					var5.method3799(arg1.getPath(), (byte) -55);
				}
				var4.method6068(var5.payload, 0, var5.offset, -1154489731);
				var4.method6064(-889895048);
			} catch (IOException var6) {
				var6.printStackTrace();
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "nv.o(" + ')');
		}
	}

	public static int method3909(int arg0) {
		try {
			int var1 = Class134.aClass258_1518.anInt2703;
			if (var1 < Class239.aClass258Array2585.length - 1) {
				Class134.aClass258_1518 = Class239.aClass258Array2585[var1 + 1];
			}
			return 100;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "nv.f(" + ')');
		}
	}

	public static final void method3910(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -1791037003);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1348;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "nv.rc(" + ')');
		}
	}

	public abstract void init();

	public abstract void method3883(byte arg0);

	public abstract void method3889(byte arg0);

	public abstract void method3894();

	public abstract void method3895();

	public abstract void method3896();

	public abstract void method3897();

	public abstract void method3898(int arg0);

	public abstract void method3899();

	public abstract void method3903(int arg0);

	public abstract void method3905();

	public abstract void method255();

	public abstract void method258();

	public abstract void method257();

	public abstract void method259();

	public abstract void method3907();

	public abstract void method256();
}
