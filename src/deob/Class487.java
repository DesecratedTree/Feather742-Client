package deob;

import java.io.IOException;
import java.net.Socket;

public abstract class Class487 {

	public int anInt5826;

	public String aString5827;

	public Socket method6033(short arg0) throws IOException {
		try {
			return new Socket(this.aString5827, this.anInt5826 * 1320395777);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ud.i(" + ')');
		}
	}

	public static void method6037(int arg0, int arg1, int arg2) {
		try {
			Class330_Sub36_Sub3 var3 = Class464_Sub4.method5750(15, 0L);
			var3.method3445((byte) 0);
			var3.anInt9629 = arg0;
			var3.anInt9626 = arg1;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ud.ao(" + ')');
		}
	}

	public abstract Socket method6034() throws IOException;

	public abstract Socket method6035() throws IOException;

	public abstract Socket method6036(int arg0) throws IOException;
}
