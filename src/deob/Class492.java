package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

public class Class492 {

	public static void method6077(Applet arg0, String arg1, int arg2) throws Throwable {
		try {
			JSObject.getWindow(arg0).eval(arg1);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ui.r(" + ')');
		}
	}

	public static Object method6078(Applet arg0, String arg1, byte arg2) throws Throwable {
		try {
			return JSObject.getWindow(arg0).call(arg1, null);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ui.j(" + ')');
		}
	}

	public static Object method6079(Applet arg0, String arg1, Object[] arg2, int arg3) throws Throwable {
		try {
			return JSObject.getWindow(arg0).call(arg1, arg2);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ui.i(" + ')');
		}
	}

	public Class492() throws Throwable {
		throw new Error();
	}
}
