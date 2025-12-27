package deob;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.channels.FileChannel;

public class Preferences {

	public static int anInt3007 = 7;

	public static int anInt3008 = 14;

	public static int anInt3009 = 6;

	public int anInt3012;

	public int anInt3011;

	public int[][] anIntArrayArray3010;

	public static final int DEFAULT_BUFFER_SIZE = 4096;

	public static final long FILE_COPY_BUFFER_SIZE = 31457280L;

	public static final long ONE_KB = 1024L;

	public static final long ONE_MB = 1048576L;

	public short[] method2918(short[] arg0, int arg1) {
		try {
			if (this.anIntArrayArray3010 != null) {
				int var3 = (int) ((long) this.anInt3011 * (long) arg0.length / (long) this.anInt3012) + 14;
				int[] var4 = new int[var3];
				int var5 = 0;
				int var6 = 0;
				int var7;
				for (var7 = 0; var7 < arg0.length; var7++) {
					short var8 = arg0[var7];
					int[] var9 = this.anIntArrayArray3010[var6];
					int var10;
					for (var10 = 0; var10 < 14; var10++) {
						var4[var10 + var5] += var8 * var9[var10] >> 2;
					}
					var6 += this.anInt3011;
					var10 = var6 / this.anInt3012;
					var5 += var10;
					var6 -= var10 * this.anInt3012;
				}
				arg0 = new short[var3];
				for (var7 = 0; var7 < var3; var7++) {
					int var12 = var4[var7] + 8192 >> 14;
					if (var12 < -32768) {
						arg0[var7] = -32768;
					} else if (var12 > 32767) {
						arg0[var7] = 32767;
					} else {
						arg0[var7] = (short) var12;
					}
				}
			}
			return arg0;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "mh.j(" + ')');
		}
	}

	public int method2919(int arg0, int arg1) {
		try {
			if (this.anIntArrayArray3010 != null) {
				arg0 = (int) ((long) this.anInt3011 * (long) arg0 / (long) this.anInt3012) + 6;
			}
			return arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "mh.p(" + ')');
		}
	}

	public byte[] method2920(byte[] arg0, byte arg1) {
		try {
			if (this.anIntArrayArray3010 != null) {
				int var3 = (int) ((long) arg0.length * (long) this.anInt3011 / (long) this.anInt3012) + 14;
				int[] var4 = new int[var3];
				int var5 = 0;
				int var6 = 0;
				int var7;
				for (var7 = 0; var7 < arg0.length; var7++) {
					byte var8 = arg0[var7];
					int[] var9 = this.anIntArrayArray3010[var6];
					int var10;
					for (var10 = 0; var10 < 14; var10++) {
						var4[var10 + var5] += var8 * var9[var10];
					}
					var6 += this.anInt3011;
					var10 = var6 / this.anInt3012;
					var5 += var10;
					var6 -= var10 * this.anInt3012;
				}
				arg0 = new byte[var3];
				for (var7 = 0; var7 < var3; var7++) {
					int var12 = var4[var7] + 32768 >> 16;
					if (var12 < -128) {
						arg0[var7] = -128;
					} else if (var12 > 127) {
						arg0[var7] = 127;
					} else {
						arg0[var7] = (byte) var12;
					}
				}
			}
			return arg0;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "mh.r(" + ')');
		}
	}

	public Preferences(int arg0, int arg1) {
		if (arg1 != arg0) {
			int var3 = Class428.method5324(arg0, arg1, 743404989);
			int var16 = arg0 / var3;
			int var17 = arg1 / var3;
			this.anInt3012 = var16;
			this.anInt3011 = var17;
			this.anIntArrayArray3010 = new int[var16][14];
			for (int var4 = 0; var4 < var16; var4++) {
				int[] var5 = this.anIntArrayArray3010[var4];
				double var6 = (double) var4 / (double) var16 + 6.0D;
				int var8 = (int) Math.floor(var6 - 7.0D + 1.0D);
				if (var8 < 0) {
					var8 = 0;
				}
				int var9 = (int) Math.ceil(var6 + 7.0D);
				if (var9 > 14) {
					var9 = 14;
				}
				double var10 = (double) var17 / (double) var16;
				while (var8 < var9) {
					double var12 = ((double) var8 - var6) * 3.141592653589793D;
					double var14 = var10;
					if (var12 < -1.0E-4D || var12 > 1.0E-4D) {
						var14 = var10 * (Math.sin(var12) / var12);
					}
					var14 *= Math.cos(((double) var8 - var6) * 0.2243994752564138D) * 0.46D + 0.54D;
					var5[var8] = (int) Math.floor(var14 * 65536.0D + 0.5D);
					var8++;
				}
			}
		}
	}

	public int method2921(int arg0, int arg1) {
		try {
			if (this.anIntArrayArray3010 != null) {
				arg0 = (int) ((long) this.anInt3011 * (long) arg0 / (long) this.anInt3012);
			}
			return arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "mh.i(" + ')');
		}
	}

	public static Class144 method2922(int arg0, int arg1) {
		try {
			if (Class144.aClass144_1572.anInt1575 == arg0) {
				return Class144.aClass144_1572;
			} else if (arg0 == Class144.aClass144_1576.anInt1575) {
				return Class144.aClass144_1576;
			} else if (Class144.aClass144_1574.anInt1575 == arg0) {
				return Class144.aClass144_1574;
			} else {
				return null;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mh.r(" + ')');
		}
	}

	public static final void method2923(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			arg0.anInt1232 = arg2.anIntArray4387[--arg2.anInt4376];
			Class404.method4738(arg0, 1970192974);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "mh.fu(" + ')');
		}
	}

	public static final void method2924(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = arg0.aClass154_4391.aByte1645;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mh.xe(" + ')');
		}
	}

	public static final void method2925(Class430 arg0, byte arg1) {
		try {
			if (client.aByteArray8959 == null) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 1;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mh.ajg(" + ')');
		}
	}

	public static final void method2926(Class430 arg0, int arg1) {
		try {
			Class472.method5891((String) arg0.anObjectArray4386[--arg0.anInt4378], (byte) -82);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mh.ty(" + ')');
		}
	}

	public static void method2927(Class249 arg0, boolean arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
		try {
			int var9 = client.aClass304_9030.method2993(-194911978);
			int var10 = client.aClass304_9030.method2992(1403532609);
			arg0.method2493(arg2, arg3, arg4, arg5, (float) var10, (float) var9, (float) arg6, (float) arg7);
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "mh.fx(" + ')');
		}
	}

	public static void method2928(String arg0, int arg1) {
		try {
			client.aString9111 = arg0;
			if (Class147.method1739((byte) -48) != Class331.aClass331_3343) {
				try {
					String var2 = Class293.anApplet6804.getParameter(Class219.aClass219_2166.aString2175);
					String var3 = Class293.anApplet6804.getParameter(Class219.aClass219_2151.aString2175);
					String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
					if (arg0.length() == 0) {
						var4 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
					} else {
						var4 = var4 + "; Expires=" + OutgoingPacket.method2368(Class312.method3111((byte) 115) + 94608000000L) + "; Max-Age=" + 94608000L;
					}
					Class492.method6077(Class293.anApplet6804, "document.cookie=\"" + var4 + "\"", -756985264);
				} catch (Throwable var5) {
				}
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "mh.nf(" + ')');
		}
	}

	public static Class490 loadPreferences(String arg0, String arg1, boolean arg2, int arg3) {
		try {
			File var4 = new File(Class60.aFile559, "preferences" + arg0 + ".dat");
			if (var4.exists()) {
				Class490 var13 = null;
				try {
					Class490 var14 = new Class490(var4, "rw", 10000L);
					var13 = var14;
				} catch (IOException var9) {
					var9.printStackTrace();
				}
				return var13;
			}
			String var5 = "";
			if (Class330_Sub26_Sub1.anInt9571 == 33) {
				var5 = "_rc";
			} else if (Class330_Sub26_Sub1.anInt9571 == 34) {
				var5 = "_wip";
			}
			File var6 = new File(Class291.aString2978, "jagex_" + arg1 + "_preferences" + arg0 + var5 + ".dat");
			System.out.println(var6.getAbsolutePath() + " being loaded.");
			Class490 var7;
			Class490 var8;
			if (!arg2 && var6.exists()) {
				label45: {
					try {
						var8 = new Class490(var6, "rw", 10000L);
						var7 = var8;
					} catch (IOException var11) {
						break label45;
					}
					return var7;
				}
			}
			try {
				var8 = new Class490(var4, "rw", 10000L);
				var7 = var8;
			} catch (IOException var10) {
				throw new RuntimeException();
			}
			return var7;
		} catch (RuntimeException var12) {
			throw Class476.method5964(var12, "mh.z(" + ')');
		}
	}

	public static boolean isMac() {
		if (Class550.OSName != null && Class550.OSName.startsWith("mac")) {
			return true;
		} else {
			return Class212.aString6533 != null && Class212.aString6533.startsWith("mac");
		}
	}

	public static File copyPreferenceFile(String arg0, File arg1) {
		ClassLoader var2 = ClientLoader.class.getClassLoader();
		File var3 = null;
		Preferences.URLClassLoaderFileResource var4 = new Preferences.URLClassLoaderFileResource(var2, arg0);
		try {
			var3 = var4.getFile();
			copyFile(var3, arg1);
		} catch (IOException var8) {
			try {
				InputStream var6 = var2.getResourceAsStream(arg0);
				copyInputStreamToFile(var6, arg1);
			} catch (IOException var7) {
				var7.printStackTrace();
			}
		}
		return arg1;
	}

	public static File getResourceAsFile(String arg0) throws IOException {
		ClassLoader var1 = ClientLoader.class.getClassLoader();
		File var2 = null;
		Preferences.URLClassLoaderFileResource var3 = new Preferences.URLClassLoaderFileResource(var1, arg0);
		try {
			var2 = var3.getFile();
		} catch (IOException var5) {
			Preferences.ClasspathResourceFileResource var6 = new Preferences.ClasspathResourceFileResource(var1, arg0);
			var2 = var6.getFile();
		}
		return var2;
	}

	public static void copyInputStreamToFile(InputStream arg0, File arg1) throws IOException {
		try {
			FileOutputStream var2 = openOutputStream(arg1);
			try {
				copy(arg0, var2);
			} finally {
				closeQuietly((OutputStream) var2);
			}
		} finally {
			closeQuietly((Closeable) arg0);
		}
	}

	public static void closeQuietly(OutputStream arg0) {
		closeQuietly((Closeable) arg0);
	}

	public static void closeQuietly(Closeable arg0) {
		try {
			if (arg0 != null) {
				arg0.close();
			}
		} catch (IOException var2) {
		}
	}

	public static FileOutputStream openOutputStream(File arg0) throws IOException {
		return openOutputStream(arg0, false);
	}

	public static FileOutputStream openOutputStream(File arg0, boolean arg1) throws IOException {
		if (arg0.exists()) {
			if (arg0.isDirectory()) {
				throw new IOException("File '" + arg0 + "' exists but is a directory");
			}
			if (!arg0.canWrite()) {
				throw new IOException("File '" + arg0 + "' cannot be written to");
			}
		} else {
			File var2 = arg0.getParentFile();
			if (var2 != null && !var2.mkdirs() && !var2.isDirectory()) {
				throw new IOException("Directory '" + var2 + "' could not be created");
			}
		}
		return new FileOutputStream(arg0, arg1);
	}

	public static int copy(InputStream arg0, OutputStream arg1) throws IOException {
		long var2 = copyLarge(arg0, arg1);
		return var2 > 2147483647L ? -1 : (int) var2;
	}

	public static long copyLarge(InputStream arg0, OutputStream arg1) throws IOException {
		byte[] var2 = new byte[4096];
		long var3 = 0L;
		boolean var5 = false;
		int var6;
		while ((var6 = arg0.read(var2)) != -1) {
			arg1.write(var2, 0, var6);
			var3 += var6;
		}
		return var3;
	}

	public static void copyFile(File arg0, File arg1) throws IOException {
		copyFile(arg0, arg1, true);
	}

	public static void copyFile(File arg0, File arg1, boolean arg2) throws IOException {
		if (arg0 == null) {
			throw new NullPointerException("Source must not be null");
		} else if (arg1 == null) {
			throw new NullPointerException("Destination must not be null");
		} else if (!arg0.exists()) {
			throw new FileNotFoundException("Source '" + arg0 + "' does not exist");
		} else if (arg0.isDirectory()) {
			throw new IOException("Source '" + arg0 + "' exists but is a directory");
		} else if (arg0.getCanonicalPath().equals(arg1.getCanonicalPath())) {
			throw new IOException("Source '" + arg0 + "' and destination '" + arg1 + "' are the same");
		} else {
			File var3 = arg1.getParentFile();
			if (var3 != null && !var3.mkdirs() && !var3.isDirectory()) {
				throw new IOException("Destination '" + var3 + "' directory cannot be created");
			} else if (arg1.exists() && !arg1.canWrite()) {
				throw new IOException("Destination '" + arg1 + "' exists but is read-only");
			} else {
				doCopyFile(arg0, arg1, arg2);
			}
		}
	}

	public static void doCopyFile(File arg0, File arg1, boolean arg2) throws IOException {
		if (arg1.exists() && arg1.isDirectory()) {
			throw new IOException("Destination '" + arg1 + "' exists but is a directory");
		}
		FileInputStream var3 = null;
		FileOutputStream var4 = null;
		FileChannel var5 = null;
		FileChannel var6 = null;
		try {
			var3 = new FileInputStream(arg0);
			var4 = new FileOutputStream(arg1);
			var5 = var3.getChannel();
			var6 = var4.getChannel();
			long var7 = var5.size();
			long var9 = 0L;
			long var11 = 0L;
			while (var9 < var7) {
				var11 = var7 - var9 > 31457280L ? 31457280L : var7 - var9;
				var9 += var6.transferFrom(var5, var9, var11);
			}
		} finally {
			closeQuietly((Closeable) var6);
			closeQuietly((OutputStream) var4);
			closeQuietly((Closeable) var5);
			closeQuietly((Closeable) var3);
		}
		if (arg0.length() != arg1.length()) {
			throw new IOException("Failed to copy full contents from '" + arg0 + "' to '" + arg1 + "'");
		} else if (arg2) {
			arg1.setLastModified(arg0.lastModified());
		}
	}

	public static class ClasspathResourceFileResource implements Preferences.FileResource {

		public String resource;

		@ObfuscatedName("Preferences$ClasspathResourceFileResource.cl")
		public ClassLoader cl;

		public ClasspathResourceFileResource(ClassLoader arg0, String arg1) {
			this.cl = arg0;
			this.resource = arg1;
		}

		public File getFile() throws IOException {
			InputStream var1 = this.cl.getResourceAsStream(this.resource);
			File var2 = File.createTempFile("file", "temp");
			Preferences.copyInputStreamToFile(var1, var2);
			var2.deleteOnExit();
			return var2;
		}
	}

	public interface FileResource {

		File getFile() throws IOException;
	}

	public static class URLClassLoaderFileResource implements Preferences.FileResource {

		public String resource;

		@ObfuscatedName("Preferences$URLClassLoaderFileResource.cl")
		public ClassLoader cl;

		public URLClassLoaderFileResource(ClassLoader arg0, String arg1) {
			this.cl = arg0;
			this.resource = arg1;
		}

		public File getFile() throws IOException {
			File var1 = null;
			if (this.cl instanceof URLClassLoader) {
				URLClassLoader var2 = URLClassLoader.class.cast(this.cl);
				URL var3 = var2.findResource(this.resource);
				if ("file".equals(var3.getProtocol())) {
					try {
						URI var4 = var3.toURI();
						var1 = new File(var4);
					} catch (URISyntaxException var6) {
						IOException var5 = new IOException("Unable to get file through class loader: " + this.cl);
						var5.initCause(var6);
						throw var5;
					}
				}
			}
			if (var1 == null) {
				throw new IOException("Unable to get file through class loader: " + this.cl);
			}
			return var1;
		}
	}
}
