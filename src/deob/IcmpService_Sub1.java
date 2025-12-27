package deob;

import jaclib.ping.IcmpService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IcmpService_Sub1 extends IcmpService {

	public List aList8865 = new ArrayList();

	public void notify(int arg0) {
		try {
			Iterator var2 = this.aList8865.iterator();
			while (var2.hasNext()) {
				Interface25 var3 = (Interface25) var2.next();
				var3.method292(arg0 == 0, -169269576);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aet.notify(" + ')');
		}
	}

	public void notify(int arg0, int arg1, int arg2) {
		try {
			Iterator var4 = this.aList8865.iterator();
			while (var4.hasNext()) {
				Interface25 var5 = (Interface25) var4.next();
				var5.method293(arg0, arg1, arg2, -1809396048);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "aet.notify(" + ')');
		}
	}

	@ObfuscatedName("IcmpService_Sub1.i(III)V")
	public void i(int arg0, int arg1, int arg2) {
		Iterator var4 = this.aList8865.iterator();
		while (var4.hasNext()) {
			Interface25 var5 = (Interface25) var4.next();
			var5.method293(arg0, arg1, arg2, -1809396048);
		}
	}

	@ObfuscatedName("IcmpService_Sub1.r(I)V")
	public void r(int arg0) {
		Iterator var2 = this.aList8865.iterator();
		while (var2.hasNext()) {
			Interface25 var3 = (Interface25) var2.next();
			var3.method292(arg0 == 0, -169269576);
		}
	}

	@ObfuscatedName("IcmpService_Sub1.j(I)V")
	public void j(int arg0) {
		Iterator var2 = this.aList8865.iterator();
		while (var2.hasNext()) {
			Interface25 var3 = (Interface25) var2.next();
			var3.method292(arg0 == 0, -169269576);
		}
	}

	public static final void method6478(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			if (var3 == -1) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = -1;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class370.aClass268_6770.method2659(var2, 1385760669).method3475((char) var3, -635872567);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aet.ade(" + ')');
		}
	}

	public static byte[] method6479(byte[] arg0, byte arg1) {
		try {
			if (arg0 == null) {
				return null;
			} else {
				byte[] var2 = new byte[arg0.length];
				System.arraycopy(arg0, 0, var2, 0, arg0.length);
				return var2;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aet.r(" + ')');
		}
	}
}
