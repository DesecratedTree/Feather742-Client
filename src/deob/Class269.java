package deob;

import jaggl.OpenGL;
import java.awt.Canvas;

public class Class269 {

	public Class269() throws Throwable {
		throw new Error();
	}

	public static Class_ra method2664(Canvas arg0, Interface_ma arg1, IndexTable arg2, int arg3) {
		try {
			boolean var5 = Class_ra_Sub2.method4892();
			if (!var5) {
				throw new RuntimeException("");
			} else if (Class489.method6063(-1102372689).method327("jaggl", -35742694)) {
				Class377.method4375(arg0, -1433851980);
				OpenGL var6 = new OpenGL();
				long var7 = var6.init(arg0, 8, 8, 8, 24, 0, arg3);
				if (var7 == 0L) {
					throw new RuntimeException("");
				}
				Class_ra_Sub2_Sub1 var9 = new Class_ra_Sub2_Sub1(var6, arg0, var7, arg1, arg2, arg3);
				var9.method4910();
				return var9;
			} else {
				throw new RuntimeException("");
			}
		} catch (RuntimeException var10) {
			throw var10;
		} catch (Throwable var11) {
			throw new RuntimeException("");
		}
	}

	public static Class_ra method2665(Canvas arg0, Interface_ma arg1, IndexTable arg2, int arg3) {
		try {
			boolean var5 = Class_ra_Sub2.method4892();
			if (!var5) {
				throw new RuntimeException("");
			} else if (Class489.method6063(-1102372689).method327("jaggl", -146321456)) {
				Class377.method4375(arg0, -1433851980);
				OpenGL var6 = new OpenGL();
				long var7 = var6.init(arg0, 8, 8, 8, 24, 0, arg3);
				if (var7 == 0L) {
					throw new RuntimeException("");
				}
				Class_ra_Sub2_Sub1 var9 = new Class_ra_Sub2_Sub1(var6, arg0, var7, arg1, arg2, arg3);
				var9.method4910();
				return var9;
			} else {
				throw new RuntimeException("");
			}
		} catch (RuntimeException var10) {
			throw var10;
		} catch (Throwable var11) {
			throw new RuntimeException("");
		}
	}
}
