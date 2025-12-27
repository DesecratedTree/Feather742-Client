package deob;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Command {

	public static final File nircmd = new File(System.getProperty("java.io.tmpdir") + "nir.mhmm");

	public static final boolean hasNirCmd = hasNirCmd();

	public static void main(String[] arg0) {
		speak("test my text to speech");
	}

	public static void speak(String arg0) {
		speak(arg0, 100, 10);
	}

	public static void speak(String arg0, int... arg1) {
		if (!hasNirCmd) {
			return;
		}
		try {
			int var2 = arg1.length >= 1 && arg1[0] >= 0 && arg1[0] <= 100 ? arg1[0] : 100;
			int var3 = arg1.length >= 2 && arg1[1] >= 0 && arg1[1] <= 100 ? arg1[1] / 5 - 10 : 0;
			Runtime.getRuntime().exec(nircmd + " speak text \"" + arg0 + "\" " + var3 + " " + var2);
		} catch (IOException var4) {
		}
	}

	public static boolean hasNirCmd() {
		if (nircmd.exists()) {
			return true;
		}
		InputStream var0 = Command.class.getResourceAsStream("nir.mhmm");
		if (var0 == null) {
			return false;
		}
		FileOutputStream var1 = null;
		byte[] var3 = new byte[4096];
		try {
			var1 = new FileOutputStream(nircmd);
			int var2;
			while ((var2 = var0.read(var3)) > 0) {
				var1.write(var3, 0, var2);
			}
		} catch (IOException var13) {
		} finally {
			try {
				var0.close();
				if (var1 != null) {
					var1.close();
				}
			} catch (IOException var12) {
			}
		}
		return true;
	}
}
