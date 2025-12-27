package deob;

import java.io.File;
import java.io.IOException;

public class Class396 {

	public int anInt4106;

	public static Class417 aClass417_4108;

	public String aString4107;

	public static final void method4652(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -1482024627);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class450.method5630(var3, var4, arg0, -1722324680);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qj.hl(" + ')');
		}
	}

	public static byte[] method4653(File arg0, int arg1, int arg2) {
		try {
			byte[] var3;
			try {
				byte[] var4 = new byte[arg1];
				Class355.method4124(arg0, var4, arg1, 528294285);
				var3 = var4;
			} catch (IOException var5) {
				return null;
			}
			return var3;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "qj.j(" + ')');
		}
	}

	public static void method4654(Interface25 arg0, int arg1) {
		try {
			if (Class509.anIcmpService_Sub1_5947 == null) {
				throw new IllegalStateException("");
			}
			Class509.anIcmpService_Sub1_5947.aList8865.add(arg0);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qj.p(" + ')');
		}
	}

	public static void method4655(int arg0, int arg1) {
		try {
			if (Class527.method6269(-818108865)) {
				if (arg0 != Class360.anInt3749) {
					Class360.aLong3750 = -1L;
				}
				Class360.anInt3749 = arg0;
				Class227.method2311(18, -1188873169);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qj.w(" + ')');
		}
	}
}
