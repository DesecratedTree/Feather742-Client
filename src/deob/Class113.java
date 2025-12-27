package deob;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

public class Class113 {

	public static int anInt1167 = 256;

	public static int anInt1168 = 4;

	public static int anInt1171 = 2;

	public String aString1166;

	public Class104[] aClass104Array1165;

	public Class104[] aClass104Array1169;

	public Class118[] aClass118Array1170;

	public void method1382(byte[] arg0, int arg1) throws Exception_Sub3 {
		try {
			Class115 var3 = new Class115(arg0);
			int var4 = var3.method1413(-1703485212);
			if (var4 != 4) {
				throw new Exception_Sub3(this, var4, 4);
			}
			this.aString1166 = var3.method1414(6389687);
			this.aClass104Array1165 = new Class104[var3.method1413(1239041316)];
			this.aClass104Array1169 = new Class104[var3.method1413(111054093)];
			this.aClass118Array1170 = new Class118[var3.method1413(39232375)];
			int var5;
			for (var5 = 0; var5 < this.aClass104Array1165.length; var5++) {
				this.aClass104Array1165[var5] = new Class104();
				this.aClass104Array1165[var5].method1242(var3, (byte) 60);
			}
			for (var5 = 0; var5 < this.aClass104Array1169.length; var5++) {
				this.aClass104Array1169[var5] = new Class104();
				this.aClass104Array1169[var5].method1242(var3, (byte) 66);
			}
			for (var5 = 0; var5 < this.aClass118Array1170.length; var5++) {
				this.aClass118Array1170[var5] = new Class118();
				this.aClass118Array1170[var5].method1427(var3, -1923739953);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "eo.r(" + ')');
		}
	}

	public Class113(byte[] arg0) throws Exception_Sub3 {
		this.method1382(arg0, -1263523592);
	}

	public static final void method1383(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 1200779758);
			int var4 = arg0.anIntArray4387[--arg0.anInt4376];
			int var6 = var4 - 1;
			if (var3.aStringArray1284 == null || var6 >= var3.aStringArray1284.length || var3.aStringArray1284[var6] == null) {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = "";
			} else {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var3.aStringArray1284[var6];
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "eo.su(" + ')');
		}
	}

	public static void method1384(int arg0) {
		try {
			if (Class130.aFrame1498 == null) {
				int var1 = client.anInt6611;
				int var2 = client.anInt6612;
				int var3 = client.anInt6609 - Class300.anInt3058 - var1;
				int var4 = Class520.anInt6017 - Class146.anInt1615 - var2;
				if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
					try {
						Container var5 = Class432_Sub1_Sub3_Sub1.method5526((byte) 85);
						int var6 = 0;
						int var7 = 0;
						if (Class267.aFrame2740 == var5) {
							Insets var8 = Class267.aFrame2740.getInsets();
							var6 = var8.left;
							var7 = var8.top;
						}
						Graphics var11 = var5.getGraphics();
						var11.setColor(Color.black);
						if (var1 > 0) {
							var11.fillRect(var6, var7, var1, Class520.anInt6017);
						}
						if (var2 > 0) {
							var11.fillRect(var6, var7, client.anInt6609, var2);
						}
						if (var3 > 0) {
							var11.fillRect(client.anInt6609 + var6 - var3, var7, var3, Class520.anInt6017);
						}
						if (var4 > 0) {
							var11.fillRect(var6, var7 + Class520.anInt6017 - var4, client.anInt6609, var4);
						}
					} catch (Exception var9) {
					}
				}
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "eo.gr(" + ')');
		}
	}

	public static final int method1385(String arg0, byte arg1) {
		try {
			if (arg0 == null) {
				return -1;
			}
			for (int var2 = 0; var2 < client.anInt9256; var2++) {
				if (arg0.equalsIgnoreCase(client.aClass99Array9259[var2].aString915)) {
					return var2;
				}
			}
			return -1;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "eo.mz(" + ')');
		}
	}

	public static String method1386(Buffer arg0, int arg1) {
		try {
			String var2;
			try {
				int var3 = arg0.readSmart(-967628430);
				if (var3 > 32767) {
					var3 = 32767;
				}
				byte[] var4 = new byte[var3];
				arg0.offset += Class142.aClass143_1567.method1657(arg0.payload, arg0.offset, var4, 0, var3, -779423509);
				String var5 = Class125.method1525(var4, 0, var3, (byte) 1);
				var2 = var5;
			} catch (Exception var6) {
				var2 = "Cabbage";
			}
			return var2;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "eo.i(" + ')');
		}
	}
}
