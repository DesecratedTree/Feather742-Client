package deob;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.LinkedList;

public class FileUtilities {

	public static final int BUFFER = 1024;

	public static boolean exists(String arg0) {
		File var1 = new File(arg0);
		return var1.exists();
	}

	public static ByteBuffer fileBuffer(String arg0) throws IOException {
		File var1 = new File(arg0);
		if (!var1.exists()) {
			return null;
		}
		FileInputStream var2 = new FileInputStream(arg0);
		byte[] var3 = new byte[1024];
		try {
			ByteBuffer var5 = ByteBuffer.allocate(var2.available() + 1);
			int var4;
			while ((var4 = var2.read(var3, 0, 1024)) != -1) {
				var5.put(var3, 0, var4);
			}
			var5.flip();
			ByteBuffer var6 = var5;
			return var6;
		} finally {
			if (var2 != null) {
				var2.close();
			}
			var2 = null;
		}
	}

	public static void writeBufferToFile(String arg0, ByteBuffer arg1) throws IOException {
		File var2 = new File(arg0);
		if (!var2.exists()) {
			var2.createNewFile();
		}
		FileOutputStream var3 = new FileOutputStream(arg0);
		var3.write(arg1.array(), 0, arg1.remaining());
		var3.flush();
		var3.close();
	}

	public static LinkedList readFile(String arg0) throws IOException {
		LinkedList var1 = new LinkedList();
		BufferedReader var2 = null;
		try {
			var2 = new BufferedReader(new FileReader(arg0));
			String var3;
			while ((var3 = var2.readLine()) != null) {
				var1.add(var3);
			}
		} finally {
			if (var2 != null) {
				var2.close();
				var2 = null;
			}
		}
		return var1;
	}
}
