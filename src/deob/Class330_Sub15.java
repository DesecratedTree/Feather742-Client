package deob;

import java.io.IOException;
import java.net.Socket;

public class Class330_Sub15 extends Class330 {

	public int anInt7610;

	public String aString7609;

	public static Class357 method3320(Socket arg0, int arg1, int arg2) throws IOException {
		try {
			return new Class357_Sub1(arg0, arg1);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "acu.r(" + ')');
		}
	}

	public static final void method3321(Class430 arg0, int arg1) {
		try {
			if (client.anInt9125 >= 5 && client.anInt9125 <= 9) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 1;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "acu.ue(" + ')');
		}
	}
}
