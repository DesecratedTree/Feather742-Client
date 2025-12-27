package deob;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class Class321 implements Interface33 {

	public Hashtable aHashtable7016 = new Hashtable();

	public Hashtable aHashtable7017 = new Hashtable();

	public IndexTable aClass280_7014;

	public String ProcessorDirectory;

	public static int anInt7018;

	public Class321(IndexTable arg0) {
		this.aClass280_7014 = arg0;
		String var2 = "";
		if (Class550.OSName.startsWith("win") || Class550.OSName.startsWith("windows 7")) {
			var2 = var2 + "windows/";
		} else if (Class550.OSName.startsWith("linux")) {
			var2 = var2 + "linux/";
		} else if (Class550.OSName.startsWith("mac")) {
			var2 = var2 + "macos/";
		}
		if (Class550.processorName.startsWith("amd64") || Class550.processorName.startsWith("x86_64")) {
			var2 = var2 + "x86_64/";
		} else if (Class550.processorName.startsWith("i386") || Class550.processorName.startsWith("i486") || Class550.processorName.startsWith("i586") || Class550.processorName.startsWith("x86")) {
			var2 = var2 + "x86/";
		} else if (Class550.processorName.startsWith("ppc")) {
			var2 = var2 + "ppc/";
		} else {
			var2 = var2 + "universal/";
		}
		this.ProcessorDirectory = var2;
	}

	public int method3171(String arg0, byte arg1) {
		try {
			if (this.aHashtable7016.containsKey(arg0)) {
				return 100;
			}
			String var3 = Class70.method814(arg0, 881221455);
			if (var3 == null) {
				return -1;
			}
			String var4 = null;
			if (var4 == null) {
				var4 = this.ProcessorDirectory + var3;
				if (!this.aClass280_7014.method2770(var4, "", 104585600)) {
					return -1;
				}
			}
			if (!this.aClass280_7014.method2773(var4, -144918384)) {
				return this.aClass280_7014.method2775(var4, (byte) -36);
			}
			byte[] var5 = this.aClass280_7014.method2780(var4, "");
			Object var6 = null;
			File var7;
			try {
				var7 = Class207.method2192(var3, -126784919);
			} catch (RuntimeException var12) {
				return -1;
			}
			if (var5 == null || var7 == null) {
				return -1;
			}
			boolean var8 = true;
			byte[] var9 = Class436.method5577(var7, -1773344124);
			if (var9 != null && var5.length == var9.length) {
				for (int var10 = 0; var10 < var9.length; var10++) {
					if (var5[var10] != var9[var10]) {
						var8 = false;
						break;
					}
				}
			} else {
				var8 = false;
			}
			try {
				if (!var8) {
					try {
						FileOutputStream var15 = new FileOutputStream(var7);
						var15.write(var5, 0, var5.length);
						var15.close();
					} catch (IOException var11) {
						throw new RuntimeException();
					}
				}
			} catch (Throwable var13) {
				return -1;
			}
			this.method3172(arg0, var7, (byte) 1);
			return 100;
		} catch (RuntimeException var14) {
			throw Class476.method5964(var14, "nj.j(" + ')');
		}
	}

	public void method3172(String arg0, File arg1, byte arg2) {
		try {
			this.aHashtable7016.put(arg0, arg1);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "nj.i(" + ')');
		}
	}

	public boolean method331(String arg0, int arg1) {
		try {
			return this.aHashtable7016.containsKey(arg0);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "nj.p(" + ')');
		}
	}

	public boolean method3173(String arg0, int arg1) {
		try {
			return this.aHashtable7017.containsKey(arg0);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "nj.o(" + ')');
		}
	}

	public boolean method336() {
		Hashtable var1 = new Hashtable();
		Enumeration var2 = this.aHashtable7017.keys();
		while (var2.hasMoreElements()) {
			String var3 = (String) var2.nextElement();
			var1.put(var3, this.aHashtable7017.get(var3));
		}
		try {
			Class var24 = Class.forName("java.lang.reflect.AccessibleObject");
			Class var4 = Class.forName("java.lang.ClassLoader");
			Field var5 = var4.getDeclaredField("nativeLibraries");
			Method var6 = var24.getDeclaredMethod("setAccessible", Boolean.TYPE);
			var6.invoke(var5, Boolean.TRUE);
			try {
				var2 = this.aHashtable7017.keys();
				while (var2.hasMoreElements()) {
					String var7 = (String) var2.nextElement();
					try {
						File var8 = (File) this.aHashtable7016.get(var7);
						Class var9 = (Class) this.aHashtable7017.get(var7);
						Vector var10 = (Vector) var5.get(var9.getClassLoader());
						for (int var11 = 0; var11 < var10.size(); var11++) {
							try {
								Object var12 = var10.elementAt(var11);
								Field var13 = var12.getClass().getDeclaredField("name");
								var6.invoke(var13, Boolean.TRUE);
								try {
									String var14 = (String) var13.get(var12);
									if (var14 != null && var14.equalsIgnoreCase(var8.getCanonicalPath())) {
										Field var15 = var12.getClass().getDeclaredField("handle");
										Method var16 = var12.getClass().getDeclaredMethod("finalize");
										var6.invoke(var15, Boolean.TRUE);
										var6.invoke(var16, Boolean.TRUE);
										try {
											var16.invoke(var12);
											var15.set(var12, Integer.valueOf(0));
											var1.remove(var7);
										} catch (Throwable var18) {
										}
										var6.invoke(var16, Boolean.FALSE);
										var6.invoke(var15, Boolean.FALSE);
									}
								} catch (Throwable var19) {
								}
								var6.invoke(var13, Boolean.FALSE);
							} catch (Throwable var20) {
							}
						}
					} catch (Throwable var21) {
					}
				}
			} catch (Throwable var22) {
			}
			var6.invoke(var5, Boolean.FALSE);
		} catch (Throwable var23) {
		}
		this.aHashtable7017 = var1;
		return this.aHashtable7017.isEmpty();
	}

	public boolean method330(String arg0) {
		return this.aHashtable7016.containsKey(arg0);
	}

	public boolean method329(String arg0) {
		return this.aHashtable7016.containsKey(arg0);
	}

	public boolean method327(String arg0, int arg1) {
		try {
			return this.method3175(arg0, Class329.class, (byte) 59);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "nj.s(" + ')');
		}
	}

	public boolean method326(String arg0) {
		return this.aHashtable7016.containsKey(arg0);
	}

	public int method3174(String arg0) {
		if (this.aHashtable7016.containsKey(arg0)) {
			return 100;
		}
		String var2 = Class70.method814(arg0, -2003442980);
		if (var2 == null) {
			return -1;
		}
		String var3 = null;
		if (var3 == null) {
			var3 = this.ProcessorDirectory + var2;
			if (!this.aClass280_7014.method2770(var3, "", -353721800)) {
				return -1;
			}
		}
		if (!this.aClass280_7014.method2773(var3, -1571296841)) {
			return this.aClass280_7014.method2775(var3, (byte) 16);
		}
		byte[] var4 = this.aClass280_7014.method2780(var3, "");
		Object var5 = null;
		File var6;
		try {
			var6 = Class207.method2192(var2, -126784919);
		} catch (RuntimeException var11) {
			return -1;
		}
		if (var4 == null || var6 == null) {
			return -1;
		}
		boolean var7 = true;
		byte[] var8 = Class436.method5577(var6, 470206274);
		if (var8 != null && var4.length == var8.length) {
			for (int var9 = 0; var9 < var8.length; var9++) {
				if (var4[var9] != var8[var9]) {
					var7 = false;
					break;
				}
			}
		} else {
			var7 = false;
		}
		try {
			if (!var7) {
				try {
					FileOutputStream var13 = new FileOutputStream(var6);
					var13.write(var4, 0, var4.length);
					var13.close();
				} catch (IOException var10) {
					throw new RuntimeException();
				}
			}
		} catch (Throwable var12) {
			return -1;
		}
		this.method3172(arg0, var6, (byte) 1);
		return 100;
	}

	public boolean method3175(String arg0, Class arg1, byte arg2) {
		try {
			Class var4 = (Class) this.aHashtable7017.get(arg0);
			if (var4 != null) {
				return var4.getClassLoader() == arg1.getClassLoader();
			}
			File var5 = null;
			if (var5 == null) {
				var5 = (File) this.aHashtable7016.get(arg0);
			}
			if (var5 == null) {
				return false;
			}
			boolean var6;
			try {
				var5 = new File(var5.getCanonicalPath());
				Class var7 = Class.forName("java.lang.Runtime");
				Class var8 = Class.forName("java.lang.reflect.AccessibleObject");
				Method var9 = var8.getDeclaredMethod("setAccessible", Boolean.TYPE);
				Method var10 = var7.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				var9.invoke(var10, Boolean.TRUE);
				var10.invoke(Runtime.getRuntime(), arg1, var5.getPath());
				var9.invoke(var10, Boolean.FALSE);
				this.aHashtable7017.put(arg0, arg1);
				var6 = true;
			} catch (NoSuchMethodException var11) {
				System.load(var5.getPath());
				this.aHashtable7017.put(arg0, Class329.class);
				return true;
			} catch (Throwable var12) {
				return false;
			}
			return var6;
		} catch (RuntimeException var13) {
			throw Class476.method5964(var13, "nj.f(" + ')');
		}
	}

	public boolean method335(String arg0) {
		return this.method3175(arg0, Class329.class, (byte) 121);
	}

	public boolean method333(String arg0) {
		return this.method3175(arg0, Class329.class, (byte) 33);
	}

	public boolean method334(String arg0) {
		return this.method3175(arg0, Class329.class, (byte) -82);
	}

	public boolean method328() {
		Hashtable var1 = new Hashtable();
		Enumeration var2 = this.aHashtable7017.keys();
		while (var2.hasMoreElements()) {
			String var3 = (String) var2.nextElement();
			var1.put(var3, this.aHashtable7017.get(var3));
		}
		try {
			Class var24 = Class.forName("java.lang.reflect.AccessibleObject");
			Class var4 = Class.forName("java.lang.ClassLoader");
			Field var5 = var4.getDeclaredField("nativeLibraries");
			Method var6 = var24.getDeclaredMethod("setAccessible", Boolean.TYPE);
			var6.invoke(var5, Boolean.TRUE);
			try {
				var2 = this.aHashtable7017.keys();
				while (var2.hasMoreElements()) {
					String var7 = (String) var2.nextElement();
					try {
						File var8 = (File) this.aHashtable7016.get(var7);
						Class var9 = (Class) this.aHashtable7017.get(var7);
						Vector var10 = (Vector) var5.get(var9.getClassLoader());
						for (int var11 = 0; var11 < var10.size(); var11++) {
							try {
								Object var12 = var10.elementAt(var11);
								Field var13 = var12.getClass().getDeclaredField("name");
								var6.invoke(var13, Boolean.TRUE);
								try {
									String var14 = (String) var13.get(var12);
									if (var14 != null && var14.equalsIgnoreCase(var8.getCanonicalPath())) {
										Field var15 = var12.getClass().getDeclaredField("handle");
										Method var16 = var12.getClass().getDeclaredMethod("finalize");
										var6.invoke(var15, Boolean.TRUE);
										var6.invoke(var16, Boolean.TRUE);
										try {
											var16.invoke(var12);
											var15.set(var12, Integer.valueOf(0));
											var1.remove(var7);
										} catch (Throwable var18) {
										}
										var6.invoke(var16, Boolean.FALSE);
										var6.invoke(var15, Boolean.FALSE);
									}
								} catch (Throwable var19) {
								}
								var6.invoke(var13, Boolean.FALSE);
							} catch (Throwable var20) {
							}
						}
					} catch (Throwable var21) {
					}
				}
			} catch (Throwable var22) {
			}
			var6.invoke(var5, Boolean.FALSE);
		} catch (Throwable var23) {
		}
		this.aHashtable7017 = var1;
		return this.aHashtable7017.isEmpty();
	}

	public boolean method332(byte arg0) {
		try {
			Hashtable var2 = new Hashtable();
			Enumeration var3 = this.aHashtable7017.keys();
			while (var3.hasMoreElements()) {
				String var4 = (String) var3.nextElement();
				var2.put(var4, this.aHashtable7017.get(var4));
			}
			try {
				Class var26 = Class.forName("java.lang.reflect.AccessibleObject");
				Class var5 = Class.forName("java.lang.ClassLoader");
				Field var6 = var5.getDeclaredField("nativeLibraries");
				Method var7 = var26.getDeclaredMethod("setAccessible", Boolean.TYPE);
				var7.invoke(var6, Boolean.TRUE);
				try {
					var3 = this.aHashtable7017.keys();
					while (var3.hasMoreElements()) {
						String var8 = (String) var3.nextElement();
						try {
							File var9 = (File) this.aHashtable7016.get(var8);
							Class var10 = (Class) this.aHashtable7017.get(var8);
							Vector var11 = (Vector) var6.get(var10.getClassLoader());
							for (int var12 = 0; var12 < var11.size(); var12++) {
								try {
									Object var13 = var11.elementAt(var12);
									Field var14 = var13.getClass().getDeclaredField("name");
									var7.invoke(var14, Boolean.TRUE);
									try {
										String var15 = (String) var14.get(var13);
										if (var15 != null && var15.equalsIgnoreCase(var9.getCanonicalPath())) {
											Field var16 = var13.getClass().getDeclaredField("handle");
											Method var17 = var13.getClass().getDeclaredMethod("finalize");
											var7.invoke(var16, Boolean.TRUE);
											var7.invoke(var17, Boolean.TRUE);
											try {
												var17.invoke(var13);
												var16.set(var13, Integer.valueOf(0));
												var2.remove(var8);
											} catch (Throwable var19) {
											}
											var7.invoke(var17, Boolean.FALSE);
											var7.invoke(var16, Boolean.FALSE);
										}
									} catch (Throwable var20) {
									}
									var7.invoke(var14, Boolean.FALSE);
								} catch (Throwable var21) {
								}
							}
						} catch (Throwable var22) {
						}
					}
				} catch (Throwable var23) {
				}
				var7.invoke(var6, Boolean.FALSE);
			} catch (Throwable var24) {
			}
			this.aHashtable7017 = var2;
			return this.aHashtable7017.isEmpty();
		} catch (RuntimeException var25) {
			throw Class476.method5964(var25, "nj.z(" + ')');
		}
	}

	public static final void method3176(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class384.method4422(var3, var4, arg0, -1921545318);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "nj.ff(" + ')');
		}
	}

	public static boolean method3177(int arg0, byte arg1) {
		try {
			return arg0 == 6 || arg0 == 3 || arg0 == 18 || arg0 == 14 || arg0 == 8 || arg0 == 17;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nj.fj(" + ')');
		}
	}

	public static Class330_Sub1 method3178(int arg0, boolean arg1, short arg2) {
		try {
			long var3 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
			return (Class330_Sub1) Class330_Sub1.aClass497_7501.method6094(var3);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "nj.s(" + ')');
		}
	}
}
