package deob;

import java.security.MessageDigest;

public class Encrypt {

	public static String encryptSHA1(String arg0) {
		String var1 = null;
		try {
			var1 = byteArrayToHexString(hash(arg0));
		} catch (Exception var3) {
			var3.printStackTrace();
		}
		return var1;
	}

	public static byte[] hash(String arg0) throws Exception {
		MessageDigest var1 = MessageDigest.getInstance("SHA-1");
		var1.reset();
		var1.update(arg0.getBytes());
		return var1.digest();
	}

	public static String byteArrayToHexString(byte[] arg0) {
		StringBuffer var1 = new StringBuffer(arg0.length * 2);
		for (int var2 = 0; var2 < arg0.length; var2++) {
			int var3 = arg0[var2] & 0xFF;
			if (var3 < 16) {
				var1.append('0');
			}
			var1.append(Integer.toHexString(var3));
		}
		return var1.toString();
	}
}
