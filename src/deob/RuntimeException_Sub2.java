package deob;

import java.applet.Applet;

public class RuntimeException_Sub2 extends RuntimeException {

	public String aString6444;

	public Throwable aThrowable6445;

	public static int anInt6441;

	public static long aLong6442;

	public static Applet anApplet6443;

	public static String aString6440;

	public RuntimeException_Sub2(Throwable arg0, String arg1) {
		this.aString6444 = arg1;
		this.aThrowable6445 = arg0;
		this.initCause(arg0);
	}

	public static boolean method6482(String arg0, int arg1, int arg2) {
		try {
			return Class239.method2379(arg0, arg1, "openjs", (byte) 0);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aky.i(" + ')');
		}
	}
}
