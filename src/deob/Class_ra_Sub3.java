package deob;

import java.awt.Canvas;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public class Class_ra_Sub3 extends Class_ra {

	public boolean aBoolean8648;

	public boolean aBoolean8616;

	public int anInt8621;

	public int anInt8635;

	public int anInt8623;

	public int anInt8624;

	public int anInt8628;

	public int anInt8646;

	public int anInt8645;

	public float[][] aFloatArrayArray8617;

	public float aFloat8637;

	public float aFloat8639;

	public Class367 aClass367_8649;

	public int anInt8651;

	public Class367 aClass367_8644;

	public Class247 aClass247_8629;

	public Class249 aClass249_8632;

	public Class249 aClass249_8633;

	public Class249 aClass249_8634;

	public int anInt8615;

	public float aFloat8640;

	public float aFloat8641;

	public float aFloat8642;

	public float aFloat8643;

	public int anInt8614;

	public int anInt8618;

	public int anInt8619;

	public int anInt8622;

	public int anInt8625;

	public int anInt8626;

	public int anInt8627;

	public int anInt8636;

	public int anInt8638;

	public int anInt8650;

	public static Class330_Sub39 aClass330_Sub39_8652;

	public Class61 aClass61_8631;

	public float[] aFloatArray8620;

	public int[] anIntArray8630;

	public Class6[] aClass6Array8647;

	public Class_ra_Sub3(Interface_ma arg0) {
		super(arg0);
		this.aBoolean8648 = false;
		this.aBoolean8616 = false;
		this.anInt8621 = 0;
		this.anInt8635 = 0;
		this.anInt8623 = 0;
		this.anInt8624 = 0;
		this.anInt8628 = 45823;
		this.anInt8646 = 78642;
		this.anInt8645 = 75518;
		this.aFloatArrayArray8617 = new float[6][4];
		this.aFloat8637 = 1.0F;
		this.aFloat8639 = 0.0F;
		this.aClass367_8649 = new Class367(16);
		this.anInt8651 = -1;
		try {
			this.aClass367_8644 = new Class367(6291456, 256);
			this.aClass247_8629 = new Class247();
			this.aClass249_8632 = new Class249();
			this.aClass249_8633 = new Class249();
			this.aClass249_8634 = new Class249();
			this.method5199(1);
			this.method5208(0);
			Class318.method3166(true, true, -1368286637);
			this.aBoolean8616 = true;
			this.anInt8615 = (int) Class312.method3111((byte) 88);
		} catch (Throwable var3) {
			var3.printStackTrace();
			this.method4781(628001038);
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("Class_ra_Sub3.L()V")
	public void L() {
		this.anInt8621 = 0;
		this.anInt8623 = 0;
		this.anInt8635 = this.anInt8618;
		this.anInt8624 = this.anInt8619;
		this.method5195();
	}

	@ObfuscatedName("Class_ra_Sub3.ga(IIIII)V")
	public void ga(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (this.anIntArray8630 == null || arg0 < this.anInt8621 * 1907727929 * 512290825 || arg0 >= this.anInt8635 * -1071049483 * -711985315) {
			return;
		}
		if (arg1 < this.anInt8623 * 766013039 * -1679642481) {
			arg2 -= this.anInt8623 * 766013039 * -1679642481 - arg1;
			arg1 = this.anInt8623 * -1679642481 * 766013039;
		}
		if (arg2 + arg1 > this.anInt8624 * -550983163 * 31822541) {
			arg2 = this.anInt8624 * -550983163 * 31822541 - arg1;
		}
		int var6 = arg0 + this.anInt8618 * -1504772933 * -29235085 * arg1;
		int var7 = arg3 >>> 24;
		int var8;
		if (arg4 == 0 || arg4 == 1 && var7 == 255) {
			for (var8 = 0; var8 < arg2; var8++) {
				this.anIntArray8630[var6 + var8 * -1504772933 * this.anInt8618 * -29235085] = arg3;
			}
			return;
		}
		int var9;
		int var10;
		int var11;
		if (arg4 == 1) {
			int var13 = (var7 << 24) + ((arg3 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * var7 >> 8 & 0xFF00);
			var8 = 256 - var7;
			for (var9 = 0; var9 < arg2; var9++) {
				var10 = var6 + this.anInt8618 * -29235085 * -1504772933 * var9;
				var11 = this.anIntArray8630[var10];
				int var14 = (var8 * (var11 & 0xFF00) >> 8 & 0xFF00) + (var8 * (var11 & 0xFF00FF) >> 8 & 0xFF00FF);
				this.anIntArray8630[var10] = var14 + var13;
			}
		} else if (arg4 == 2) {
			for (var8 = 0; var8 < arg2; var8++) {
				var9 = var8 * this.anInt8618 * -29235085 * -1504772933 + var6;
				var10 = this.anIntArray8630[var9];
				var11 = var10 + arg3;
				int var12 = (arg3 & 0xFF00FF) + (var10 & 0xFF00FF);
				var10 = (var11 - var12 & 0x10000) + (var12 & 0x1000100);
				this.anIntArray8630[var9] = var11 - var10 | var10 - (var10 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("Class_ra_Sub3.w(II)V")
	public void w(int arg0, int arg1) throws Exception_Sub1 {
		this.aClass76_Sub1_4234.method883(arg0, arg1);
		if (this.anInterface_ma4227 != null) {
			this.anInterface_ma4227.method224((short) -22105);
		}
	}

	@ObfuscatedName("Class_ra_Sub3.G(IIIII)V")
	public void G(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (this.anIntArray8630 == null || arg0 < this.anInt8621 || arg0 >= this.anInt8635) {
			return;
		}
		if (arg1 < this.anInt8623) {
			arg2 -= this.anInt8623 - arg1;
			arg1 = this.anInt8623;
		}
		if (arg2 + arg1 > this.anInt8624) {
			arg2 = this.anInt8624 - arg1;
		}
		int var6 = arg0 + this.anInt8618 * arg1;
		int var7 = arg3 >>> 24;
		int var8;
		if (arg4 == 0 || arg4 == 1 && var7 == 255) {
			for (var8 = 0; var8 < arg2; var8++) {
				this.anIntArray8630[var6 + var8 * this.anInt8618] = arg3;
			}
			return;
		}
		int var9;
		int var10;
		int var11;
		if (arg4 == 1) {
			int var13 = (var7 << 24) + ((arg3 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * var7 >> 8 & 0xFF00);
			var8 = 256 - var7;
			for (var9 = 0; var9 < arg2; var9++) {
				var10 = var6 + this.anInt8618 * var9;
				var11 = this.anIntArray8630[var10];
				int var14 = (var8 * (var11 & 0xFF00) >> 8 & 0xFF00) + (var8 * (var11 & 0xFF00FF) >> 8 & 0xFF00FF);
				this.anIntArray8630[var10] = var14 + var13;
			}
		} else if (arg4 == 2) {
			for (var8 = 0; var8 < arg2; var8++) {
				var9 = var8 * this.anInt8618 + var6;
				var10 = this.anIntArray8630[var9];
				var11 = var10 + arg3;
				int var12 = (arg3 & 0xFF00FF) + (var10 & 0xFF00FF);
				var10 = (var11 - var12 & 0x10000) + (var12 & 0x1000100);
				this.anIntArray8630[var9] = var11 - var10 | var10 - (var10 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("Class_ra_Sub3.kb(III)LInterface8_Impl1_Impl1;")
	public Interface8_Impl1_Impl1 kb(int arg0, int arg1, int arg2) {
		return new Class43(arg0, arg1);
	}

	@ObfuscatedName("Class_ra_Sub3.g(I)V")
	public void g(int arg0) {
		int var2 = arg0 - this.anInt8615;
		for (Class330_Sub13 var3 = (Class330_Sub13) this.aClass367_8644.method4287(-597749787); var3 != null; var3 = (Class330_Sub13) this.aClass367_8644.method4291(-1947425629)) {
			if (var3.aBoolean7602) {
				var3.anInt7604 += var2;
				int var4 = var3.anInt7604 / 50;
				if (var4 > 0) {
					Class56 var5 = this.anInterface_ma4227.method221(var3.anInt7601, -153326671);
					float var6 = (float) var5.anInt532;
					var3.method3310((int) (var6 * ((float) var2 / 1000.0F * (float) var5.aByte531 / 64.0F)), (int) ((float) var5.aByte530 * ((float) var2 / 1000.0F) / 64.0F * var6));
					var3.anInt7604 -= var4 * 50;
				}
				var3.aBoolean7602 = false;
			}
		}
		this.anInt8615 = arg0;
		this.aClass367_8649.method4292(5, (byte) 53);
		this.aClass367_8644.method4292(5, (byte) 5);
	}

	@ObfuscatedName("Class_ra_Sub3.za()I")
	public int za() {
		return 0;
	}

	public boolean method5187() {
		return this.aBoolean8648;
	}

	public void method5188() {
		this.aClass249_8632.method2508(this.aClass247_8629);
		this.aClass249_8634.method2510(this.aClass249_8632);
		this.aClass249_8634.method2483(this.aClass249_8633);
		this.aClass249_8634.method2499(this.aFloatArrayArray8617[0]);
		this.aClass249_8634.method2500(this.aFloatArrayArray8617[1]);
		this.aClass249_8634.method2497(this.aFloatArrayArray8617[2]);
		this.aClass249_8634.method2515(this.aFloatArrayArray8617[3]);
		this.aClass249_8634.method2512(this.aFloatArrayArray8617[4]);
		this.aClass249_8634.method2498(this.aFloatArrayArray8617[5]);
		float var1 = this.aClass249_8633.method2496();
		float var2 = (var1 - 255.0F) * this.aClass249_8633.aFloatArray2631[10] + this.aClass249_8633.aFloatArray2631[14];
		float var3 = this.aClass249_8633.aFloatArray2631[14] + var1 * this.aClass249_8633.aFloatArray2631[10];
		float var4 = var3 - var2;
		for (int var5 = 0; var5 < this.anInt8650; var5++) {
			Class6 var6 = this.aClass6Array8647[var5];
			var6.aFloat87 = var2;
			var6.aFloat104 = var4;
		}
	}

	public boolean method5189(int arg0) {
		Class56 var2 = this.anInterface_ma4227.method221(arg0, 1602848613);
		return this.anInterface_ma4227.method237(arg0, Class377.aClass377_3935, 0.7F, var2.anInt532, var2.anInt532, true, 2136268831);
	}

	public int method5190(int arg0) {
		return this.anInterface_ma4227.method221(arg0, 1785397636).anInt532;
	}

	public Class369 method5191(int arg0) {
		return this.anInterface_ma4227.method221(arg0, 1805175994).aClass369_524;
	}

	public int method5192(int arg0) {
		return this.anInterface_ma4227.method221(arg0, -1397727724).aShort523 & 0xFFFF;
	}

	public boolean method5193(int arg0) {
		return this.anInterface_ma4227.method221(arg0, -1141970423).aBoolean536 || this.anInterface_ma4227.method221(arg0, 1558671525).aBoolean537;
	}

	@ObfuscatedName("Class_ra_Sub3.a()Z")
	public boolean a() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.e()Z")
	public boolean e() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.t()Z")
	public boolean t() {
		return true;
	}

	@ObfuscatedName("Class_ra_Sub3.hs(LModel;IIII)LClass387;")
	public Class387 hs(Model arg0, int arg1, int arg2, int arg3, int arg4) {
		return new Class387_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@ObfuscatedName("Class_ra_Sub3.en()Z")
	public boolean en() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.y()Z")
	public boolean y() {
		return false;
	}

	public void method5194(int arg0, int arg1, int[] arg2, float[] arg3) {
		this.anInt8618 = arg0;
		this.anInt8619 = arg1;
		this.anIntArray8630 = arg2;
		this.aFloatArray8620 = arg3;
		for (int var5 = 0; var5 < this.anInt8650; var5++) {
			this.aClass6Array8647[var5].method401(-1526325919);
		}
		this.L();
		this.au();
	}

	@ObfuscatedName("Class_ra_Sub3.al()Z")
	public boolean al() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.fw(IIIIII)V")
	public void fw(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (this.anIntArray8630 == null) {
			return;
		}
		if (arg0 < this.anInt8621 * 1907727929 * 512290825) {
			arg2 -= this.anInt8621 * 1907727929 * 512290825 - arg0;
			arg0 = this.anInt8621 * 512290825 * 1907727929;
		}
		if (arg1 < this.anInt8623 * 766013039 * -1679642481) {
			arg3 -= this.anInt8623 * 766013039 * -1679642481 - arg1;
			arg1 = this.anInt8623 * -1679642481 * 766013039;
		}
		if (arg2 + arg0 > this.anInt8635 * -711985315 * -1071049483) {
			arg2 = this.anInt8635 * -1071049483 * -711985315 - arg0;
		}
		if (arg1 + arg3 > this.anInt8624 * -550983163 * 31822541) {
			arg3 = this.anInt8624 * 31822541 * -550983163 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt8635 * -1071049483 * -711985315 || arg1 > this.anInt8624 * -550983163 * 31822541) {
			return;
		}
		int var7 = this.anInt8618 * -29235085 * -1504772933 - arg2;
		int var8 = arg0 + arg1 * -1504772933 * this.anInt8618 * -29235085;
		int var9 = arg4 >>> 24;
		int var10;
		int var11;
		int var12;
		if (arg5 != 0 && (arg5 != 1 || var9 != 255)) {
			int var13;
			if (arg5 == 1) {
				int var15 = ((arg4 >>> 8 & 0xFF00FF) * var9 & 0xFF00FF00) + (var9 * (arg4 & 0xFF00FF) >> 8 & 0xFF00FF);
				var10 = 256 - var9;
				for (var11 = 0; var11 < arg3; var11++) {
					for (var12 = -arg2; var12 < 0; var12++) {
						var13 = this.anIntArray8630[var8];
						int var16 = ((var13 & 0xFF00FF) * var10 >> 8 & 0xFF00FF) + (((var13 & 0xFF00FF00) >>> 8) * var10 & 0xFF00FF00);
						this.anIntArray8630[var8++] = var15 + var16;
					}
					var8 += var7;
				}
			} else if (arg5 == 2) {
				for (var10 = 0; var10 < arg3; var10++) {
					for (var11 = -arg2; var11 < 0; var11++) {
						var12 = this.anIntArray8630[var8];
						var13 = arg4 + var12;
						int var14 = (arg4 & 0xFF00FF) + (var12 & 0xFF00FF);
						var12 = (var13 - var14 & 0x10000) + (var14 & 0x1000100);
						this.anIntArray8630[var8++] = var13 - var12 | var12 - (var12 >>> 8);
					}
					var8 += var7;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		var10 = arg2 >> 3;
		var11 = arg2 & 0x7;
		arg2 = var8 - 1;
		for (var12 = -arg3; var12 < 0; var12++) {
			if (var10 > 0) {
				arg0 = var10;
				do {
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (var11 > 0) {
				arg0 = var11;
				do {
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += var7;
		}
	}

	@ObfuscatedName("Class_ra_Sub3.aw()Z")
	public boolean aw() {
		return true;
	}

	@ObfuscatedName("Class_ra_Sub3.dh(Z)V")
	public void dh(boolean arg0) {
	}

	public Class_ra_Sub3(Canvas arg0, Interface_ma arg1, int arg2, int arg3) {
		this(arg1);
		try {
			this.method4780(arg0, arg2, arg3, (short) -15369);
			this.method4784(arg0, -1246938796);
		} catch (Throwable var6) {
			var6.printStackTrace();
			this.method4781(628001038);
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("Class_ra_Sub3.ca()V")
	public void ca() {
	}

	@ObfuscatedName("Class_ra_Sub3.cq()LClass247;")
	public Class247 cq() {
		return new Class247(this.aClass247_8629);
	}

	@ObfuscatedName("Class_ra_Sub3.am()V")
	public void am() {
	}

	@ObfuscatedName("Class_ra_Sub3.iy(FFFFFF)V")
	public void iy(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
	}

	public void method5195() {
		int var1 = this.anInt8635 - this.anInt8621;
		int var2 = this.anInt8624 - this.anInt8623;
		float var3 = this.aFloat8640 = (float) this.anInt8638 / 2.0F;
		float var4 = this.aFloat8642 = (float) this.anInt8614 / 2.0F;
		this.aFloat8641 = (float) this.anInt8636 + var3;
		this.aFloat8643 = (float) this.anInt8622 + var4;
		int var5;
		for (var5 = 0; var5 < this.anInt8650; var5++) {
			Class6 var6 = this.aClass6Array8647[var5];
			Class38 var7 = var6.aClass38_94;
			var7.aFloat391 = var3;
			var7.aFloat420 = var4;
			var7.aFloat411 = this.aFloat8641 - (float) this.anInt8621;
			var7.aFloat392 = this.aFloat8643 - (float) this.anInt8623;
			var7.anInt396 = var1;
			var7.anInt397 = var2;
		}
		var5 = this.anInt8621 + this.anInt8623 * this.anInt8618;
		for (int var8 = this.anInt8623; var8 < this.anInt8624; var8++) {
			for (int var9 = 0; var9 < this.anInt8650; var9++) {
				this.aClass6Array8647[var9].aClass38_94.anIntArray389[var8 - this.anInt8623] = var5;
			}
			var5 += this.anInt8618;
		}
	}

	public void method5196(boolean arg0, boolean arg1, boolean arg2, Class325_Sub3_Sub1 arg3, int arg4, int arg5, float arg6, int arg7) {
		int var9 = arg3.anInt9492;
		int var14 = arg7 << 1;
		if (var9 == -1) {
			this.method5210(arg1, arg4, arg5, arg6, arg7, arg3.anInt9490, 1);
			return;
		}
		if (var9 != this.anInt8651) {
			Class61 var11 = (Class61) this.aClass367_8649.get((long) var9);
			if (var11 == null) {
				int[] var12 = this.method5209(var9);
				if (var12 == null) {
					return;
				}
				int var13 = this.anInterface_ma4227.method221(var9, 781652132).anInt532;
				var11 = this.method4795(var12, 0, var13, var13, var13, (byte) -67);
				this.aClass367_8649.put(var11, (long) var9);
			}
			this.anInt8651 = var9;
			this.aClass61_8631 = var11;
		}
		var14++;
		((Class61_Sub3) this.aClass61_8631).method742(arg0, arg1, arg2, arg4 - arg7, arg5 - arg7, arg6, var14, var14, 0, arg3.anInt9490, 1, 1, false);
	}

	@ObfuscatedName("Class_ra_Sub3.id()V")
	public void id() {
	}

	@ObfuscatedName("Class_ra_Sub3.GA(FF)V")
	public void GA(float arg0, float arg1) {
		this.aFloat8637 = arg1 - arg0;
		this.aFloat8639 = arg0 + arg1 - 1.0F;
		for (int var3 = 0; var3 < this.anInt8650; var3++) {
			Class6 var4 = this.aClass6Array8647[var3];
			Class38 var5 = var4.aClass38_94;
			var5.aFloat395 = this.aFloat8637;
			var5.aFloat394 = this.aFloat8639;
		}
	}

	@ObfuscatedName("Class_ra_Sub3.gn(IIIII)V")
	public void gn(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (this.anIntArray8630 == null) {
			return;
		}
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		int var6 = arg1 - arg2;
		if (var6 < this.anInt8623 * 766013039 * -1679642481) {
			var6 = this.anInt8623 * 766013039 * -1679642481;
		}
		int var7 = arg2 + arg1 + 1;
		if (var7 > this.anInt8624 * -550983163 * 31822541) {
			var7 = this.anInt8624 * 31822541 * -550983163;
		}
		int var8 = var6;
		int var9 = arg2 * arg2;
		int var10 = 0;
		int var11 = arg1 - var6;
		int var12 = var11 * var11;
		int var13 = var12 - var11;
		if (arg1 > var7) {
			arg1 = var7;
		}
		int var14 = arg3 >>> 24;
		int var15;
		int var16;
		int var17;
		int var18;
		if (arg4 == 0 || arg4 == 1 && var14 == 255) {
			while (var8 < arg1) {
				while (var13 <= var9 || var12 <= var9) {
					var12 += var10 + var10;
					var13 += var10++ + var10;
				}
				var15 = arg0 - var10 + 1;
				if (var15 < this.anInt8621 * 1907727929 * 512290825) {
					var15 = this.anInt8621 * 512290825 * 1907727929;
				}
				var16 = arg0 + var10;
				if (var16 > this.anInt8635 * -1071049483 * -711985315) {
					var16 = this.anInt8635 * -711985315 * -1071049483;
				}
				var17 = var15 + this.anInt8618 * -1504772933 * -29235085 * var8;
				for (var18 = var15; var18 < var16; var18++) {
					this.anIntArray8630[var17++] = arg3;
				}
				var8++;
				var12 -= var11-- + var11;
				var13 -= var11 + var11;
			}
			var10 = arg2;
			var11 = var8 - arg1;
			var13 = var11 * var11 + var9;
			var12 = var13 - arg2;
			var13 -= var11;
			while (var8 < var7) {
				while (var13 > var9 && var12 > var9) {
					var13 -= var10-- + var10;
					var12 -= var10 + var10;
				}
				var15 = arg0 - var10;
				if (var15 < this.anInt8621 * 1907727929 * 512290825) {
					var15 = this.anInt8621 * 1907727929 * 512290825;
				}
				var16 = arg0 + var10;
				if (var16 > this.anInt8635 * -1071049483 * -711985315 - 1) {
					var16 = this.anInt8635 * -711985315 * -1071049483 - 1;
				}
				var17 = var15 + this.anInt8618 * -1504772933 * -29235085 * var8;
				for (var18 = var15; var18 <= var16; var18++) {
					this.anIntArray8630[var17++] = arg3;
				}
				var8++;
				var13 += var11 + var11;
				var12 += var11++ + var11;
			}
			return;
		}
		int var19;
		int var20;
		if (arg4 == 1) {
			int var22 = (var14 * (arg3 & 0xFF00) >> 8 & 0xFF00) + ((arg3 & 0xFF00FF) * var14 >> 8 & 0xFF00FF) + (var14 << 24);
			var15 = 256 - var14;
			while (var8 < arg1) {
				while (var13 <= var9 || var12 <= var9) {
					var12 += var10 + var10;
					var13 += var10++ + var10;
				}
				var16 = arg0 - var10 + 1;
				if (var16 < this.anInt8621 * 1907727929 * 512290825) {
					var16 = this.anInt8621 * 512290825 * 1907727929;
				}
				var17 = arg0 + var10;
				if (var17 > this.anInt8635 * -711985315 * -1071049483) {
					var17 = this.anInt8635 * -1071049483 * -711985315;
				}
				var18 = var8 * -1504772933 * this.anInt8618 * -29235085 + var16;
				for (var19 = var16; var19 < var17; var19++) {
					var20 = this.anIntArray8630[var18];
					int var23 = ((var20 & 0xFF00FF) * var15 >> 8 & 0xFF00FF) + ((var20 & 0xFF00) * var15 >> 8 & 0xFF00);
					this.anIntArray8630[var18++] = var23 + var22;
				}
				var8++;
				var12 -= var11-- + var11;
				var13 -= var11 + var11;
			}
			var10 = arg2;
			var11 = -var11;
			var13 = var9 + var11 * var11;
			var12 = var13 - arg2;
			var13 -= var11;
			while (var8 < var7) {
				while (var13 > var9 && var12 > var9) {
					var13 -= var10-- + var10;
					var12 -= var10 + var10;
				}
				var16 = arg0 - var10;
				if (var16 < this.anInt8621 * 512290825 * 1907727929) {
					var16 = this.anInt8621 * 512290825 * 1907727929;
				}
				var17 = arg0 + var10;
				if (var17 > this.anInt8635 * -711985315 * -1071049483 - 1) {
					var17 = this.anInt8635 * -711985315 * -1071049483 - 1;
				}
				var18 = var16 + this.anInt8618 * -1504772933 * -29235085 * var8;
				for (var19 = var16; var19 <= var17; var19++) {
					var20 = this.anIntArray8630[var18];
					var20 = (var15 * (var20 & 0xFF00FF) >> 8 & 0xFF00FF) + (var15 * (var20 & 0xFF00) >> 8 & 0xFF00);
					this.anIntArray8630[var18++] = var22 + var20;
				}
				var8++;
				var13 += var11 + var11;
				var12 += var11++ + var11;
			}
		} else if (arg4 == 2) {
			int var21;
			while (var8 < arg1) {
				while (var13 <= var9 || var12 <= var9) {
					var12 += var10 + var10;
					var13 += var10++ + var10;
				}
				var15 = arg0 - var10 + 1;
				if (var15 < this.anInt8621 * 512290825 * 1907727929) {
					var15 = this.anInt8621 * 512290825 * 1907727929;
				}
				var16 = arg0 + var10;
				if (var16 > this.anInt8635 * -711985315 * -1071049483) {
					var16 = this.anInt8635 * -1071049483 * -711985315;
				}
				var17 = this.anInt8618 * -29235085 * -1504772933 * var8 + var15;
				for (var18 = var15; var18 < var16; var18++) {
					var19 = this.anIntArray8630[var17];
					var20 = arg3 + var19;
					var21 = (var19 & 0xFF00FF) + (arg3 & 0xFF00FF);
					var19 = (var20 - var21 & 0x10000) + (var21 & 0x1000100);
					this.anIntArray8630[var17++] = var20 - var19 | var19 - (var19 >>> 8);
				}
				var8++;
				var12 -= var11-- + var11;
				var13 -= var11 + var11;
			}
			var10 = arg2;
			var11 = -var11;
			var13 = var9 + var11 * var11;
			var12 = var13 - arg2;
			var13 -= var11;
			while (var8 < var7) {
				while (var13 > var9 && var12 > var9) {
					var13 -= var10-- + var10;
					var12 -= var10 + var10;
				}
				var15 = arg0 - var10;
				if (var15 < this.anInt8621 * 1907727929 * 512290825) {
					var15 = this.anInt8621 * 1907727929 * 512290825;
				}
				var16 = var10 + arg0;
				if (var16 > this.anInt8635 * -711985315 * -1071049483 - 1) {
					var16 = this.anInt8635 * -1071049483 * -711985315 - 1;
				}
				var17 = var8 * -1504772933 * this.anInt8618 * -29235085 + var15;
				for (var18 = var15; var18 <= var16; var18++) {
					var19 = this.anIntArray8630[var17];
					var20 = arg3 + var19;
					var21 = (arg3 & 0xFF00FF) + (var19 & 0xFF00FF);
					var19 = (var20 - var21 & 0x10000) + (var21 & 0x1000100);
					this.anIntArray8630[var17++] = var20 - var19 | var19 - (var19 >>> 8);
				}
				var8++;
				var13 += var11 + var11;
				var12 += var11++ + var11;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("Class_ra_Sub3.jc(FFFFFF)V")
	public void jc(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
	}

	public void method5197() {
		if (this.aFloatArray8620 == null) {
			return;
		}
		int var1;
		int var2;
		int var3;
		if (this.anInt8621 == 0 && this.anInt8618 == this.anInt8635 && this.anInt8623 == 0 && this.anInt8619 == this.anInt8624) {
			var1 = this.aFloatArray8620.length;
			var2 = var1 - (var1 & 0x7);
			var3 = 0;
			while (var3 < var2) {
				this.aFloatArray8620[var3++] = 2.1474836E9F;
				this.aFloatArray8620[var3++] = 2.1474836E9F;
				this.aFloatArray8620[var3++] = 2.1474836E9F;
				this.aFloatArray8620[var3++] = 2.1474836E9F;
				this.aFloatArray8620[var3++] = 2.1474836E9F;
				this.aFloatArray8620[var3++] = 2.1474836E9F;
				this.aFloatArray8620[var3++] = 2.1474836E9F;
				this.aFloatArray8620[var3++] = 2.1474836E9F;
			}
			while (var3 < var1) {
				this.aFloatArray8620[var3++] = 2.1474836E9F;
			}
			return;
		}
		var1 = this.anInt8635 - this.anInt8621;
		var2 = this.anInt8624 - this.anInt8623;
		var3 = this.anInt8618 - var1;
		int var4 = this.anInt8621 + this.anInt8623 * this.anInt8618;
		int var5 = var1 >> 3;
		int var6 = var1 & 0x7;
		var1 = var4 - 1;
		for (int var7 = -var2; var7 < 0; var7++) {
			int var8;
			if (var5 > 0) {
				var8 = var5;
				do {
					var1++;
					this.aFloatArray8620[var1] = 2.1474836E9F;
					var1++;
					this.aFloatArray8620[var1] = 2.1474836E9F;
					var1++;
					this.aFloatArray8620[var1] = 2.1474836E9F;
					var1++;
					this.aFloatArray8620[var1] = 2.1474836E9F;
					var1++;
					this.aFloatArray8620[var1] = 2.1474836E9F;
					var1++;
					this.aFloatArray8620[var1] = 2.1474836E9F;
					var1++;
					this.aFloatArray8620[var1] = 2.1474836E9F;
					var1++;
					this.aFloatArray8620[var1] = 2.1474836E9F;
					var8--;
				} while (var8 > 0);
			}
			if (var6 > 0) {
				var8 = var6;
				do {
					var1++;
					this.aFloatArray8620[var1] = 2.1474836E9F;
					var8--;
				} while (var8 > 0);
			}
			var1 += var3;
		}
	}

	@ObfuscatedName("Class_ra_Sub3.o(IIII)V")
	public void o(int arg0, int arg1, int arg2, int arg3) {
		if (this.anInt8621 < arg0) {
			this.anInt8621 = arg0;
		}
		if (this.anInt8623 < arg1) {
			this.anInt8623 = arg1;
		}
		if (this.anInt8635 > arg2) {
			this.anInt8635 = arg2;
		}
		if (this.anInt8624 > arg3) {
			this.anInt8624 = arg3;
		}
		this.method5195();
	}

	@ObfuscatedName("Class_ra_Sub3.qa([I)V")
	public void qa(int[] arg0) {
		arg0[0] = this.anInt8621;
		arg0[1] = this.anInt8623;
		arg0[2] = this.anInt8635;
		arg0[3] = this.anInt8624;
	}

	@ObfuscatedName("Class_ra_Sub3.ba(II)V")
	public void ba(int arg0, int arg1) {
		if ((arg0 & 0x1) != 0) {
			this.B(0, 0, this.anInt8618, this.anInt8619, arg1, 0);
		}
		if ((arg0 & 0x2) != 0) {
			this.method5197();
		}
	}

	@ObfuscatedName("Class_ra_Sub3.kr(Z)V")
	public void kr(boolean arg0) {
		Class6 var2 = this.method5206(Thread.currentThread());
		var2.aBoolean111 = arg0;
	}

	@ObfuscatedName("Class_ra_Sub3.B(IIIIII)V")
	public void B(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (this.anIntArray8630 == null) {
			return;
		}
		if (arg0 < this.anInt8621) {
			arg2 -= this.anInt8621 - arg0;
			arg0 = this.anInt8621;
		}
		if (arg1 < this.anInt8623) {
			arg3 -= this.anInt8623 - arg1;
			arg1 = this.anInt8623;
		}
		if (arg2 + arg0 > this.anInt8635) {
			arg2 = this.anInt8635 - arg0;
		}
		if (arg1 + arg3 > this.anInt8624) {
			arg3 = this.anInt8624 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt8635 || arg1 > this.anInt8624) {
			return;
		}
		int var7 = this.anInt8618 - arg2;
		int var8 = arg0 + arg1 * this.anInt8618;
		int var9 = arg4 >>> 24;
		int var10;
		int var11;
		int var12;
		if (arg5 != 0 && (arg5 != 1 || var9 != 255)) {
			int var13;
			if (arg5 == 1) {
				int var15 = ((arg4 >>> 8 & 0xFF00FF) * var9 & 0xFF00FF00) + (var9 * (arg4 & 0xFF00FF) >> 8 & 0xFF00FF);
				var10 = 256 - var9;
				for (var11 = 0; var11 < arg3; var11++) {
					for (var12 = -arg2; var12 < 0; var12++) {
						var13 = this.anIntArray8630[var8];
						int var16 = ((var13 & 0xFF00FF) * var10 >> 8 & 0xFF00FF) + (((var13 & 0xFF00FF00) >>> 8) * var10 & 0xFF00FF00);
						this.anIntArray8630[var8++] = var15 + var16;
					}
					var8 += var7;
				}
			} else if (arg5 == 2) {
				for (var10 = 0; var10 < arg3; var10++) {
					for (var11 = -arg2; var11 < 0; var11++) {
						var12 = this.anIntArray8630[var8];
						var13 = arg4 + var12;
						int var14 = (arg4 & 0xFF00FF) + (var12 & 0xFF00FF);
						var12 = (var13 - var14 & 0x10000) + (var14 & 0x1000100);
						this.anIntArray8630[var8++] = var13 - var12 | var12 - (var12 >>> 8);
					}
					var8 += var7;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		var10 = arg2 >> 3;
		var11 = arg2 & 0x7;
		arg2 = var8 - 1;
		for (var12 = -arg3; var12 < 0; var12++) {
			if (var10 > 0) {
				arg0 = var10;
				do {
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (var11 > 0) {
				arg0 = var11;
				do {
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += var7;
		}
	}

	@ObfuscatedName("Class_ra_Sub3.ds()V")
	public void ds() {
	}

	@ObfuscatedName("Class_ra_Sub3.CA(IIIII)V")
	public void CA(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (this.anIntArray8630 == null) {
			return;
		}
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		int var6 = arg1 - arg2;
		if (var6 < this.anInt8623) {
			var6 = this.anInt8623;
		}
		int var7 = arg2 + arg1 + 1;
		if (var7 > this.anInt8624) {
			var7 = this.anInt8624;
		}
		int var8 = var6;
		int var9 = arg2 * arg2;
		int var10 = 0;
		int var11 = arg1 - var6;
		int var12 = var11 * var11;
		int var13 = var12 - var11;
		if (arg1 > var7) {
			arg1 = var7;
		}
		int var14 = arg3 >>> 24;
		int var15;
		int var16;
		int var17;
		int var18;
		if (arg4 == 0 || arg4 == 1 && var14 == 255) {
			while (var8 < arg1) {
				while (var13 <= var9 || var12 <= var9) {
					var12 += var10 + var10;
					var13 += var10++ + var10;
				}
				var15 = arg0 - var10 + 1;
				if (var15 < this.anInt8621) {
					var15 = this.anInt8621;
				}
				var16 = arg0 + var10;
				if (var16 > this.anInt8635) {
					var16 = this.anInt8635;
				}
				var17 = var15 + this.anInt8618 * var8;
				for (var18 = var15; var18 < var16; var18++) {
					this.anIntArray8630[var17++] = arg3;
				}
				var8++;
				var12 -= var11-- + var11;
				var13 -= var11 + var11;
			}
			var10 = arg2;
			var11 = var8 - arg1;
			var13 = var11 * var11 + var9;
			var12 = var13 - arg2;
			var13 -= var11;
			while (var8 < var7) {
				while (var13 > var9 && var12 > var9) {
					var13 -= var10-- + var10;
					var12 -= var10 + var10;
				}
				var15 = arg0 - var10;
				if (var15 < this.anInt8621) {
					var15 = this.anInt8621;
				}
				var16 = arg0 + var10;
				if (var16 > this.anInt8635 - 1) {
					var16 = this.anInt8635 - 1;
				}
				var17 = var15 + this.anInt8618 * var8;
				for (var18 = var15; var18 <= var16; var18++) {
					this.anIntArray8630[var17++] = arg3;
				}
				var8++;
				var13 += var11 + var11;
				var12 += var11++ + var11;
			}
			return;
		}
		int var19;
		int var20;
		if (arg4 == 1) {
			int var22 = (var14 * (arg3 & 0xFF00) >> 8 & 0xFF00) + ((arg3 & 0xFF00FF) * var14 >> 8 & 0xFF00FF) + (var14 << 24);
			var15 = 256 - var14;
			while (var8 < arg1) {
				while (var13 <= var9 || var12 <= var9) {
					var12 += var10 + var10;
					var13 += var10++ + var10;
				}
				var16 = arg0 - var10 + 1;
				if (var16 < this.anInt8621) {
					var16 = this.anInt8621;
				}
				var17 = arg0 + var10;
				if (var17 > this.anInt8635) {
					var17 = this.anInt8635;
				}
				var18 = var8 * this.anInt8618 + var16;
				for (var19 = var16; var19 < var17; var19++) {
					var20 = this.anIntArray8630[var18];
					int var23 = ((var20 & 0xFF00FF) * var15 >> 8 & 0xFF00FF) + ((var20 & 0xFF00) * var15 >> 8 & 0xFF00);
					this.anIntArray8630[var18++] = var23 + var22;
				}
				var8++;
				var12 -= var11-- + var11;
				var13 -= var11 + var11;
			}
			var10 = arg2;
			var11 = -var11;
			var13 = var9 + var11 * var11;
			var12 = var13 - arg2;
			var13 -= var11;
			while (var8 < var7) {
				while (var13 > var9 && var12 > var9) {
					var13 -= var10-- + var10;
					var12 -= var10 + var10;
				}
				var16 = arg0 - var10;
				if (var16 < this.anInt8621) {
					var16 = this.anInt8621;
				}
				var17 = arg0 + var10;
				if (var17 > this.anInt8635 - 1) {
					var17 = this.anInt8635 - 1;
				}
				var18 = var16 + this.anInt8618 * var8;
				for (var19 = var16; var19 <= var17; var19++) {
					var20 = this.anIntArray8630[var18];
					var20 = (var15 * (var20 & 0xFF00FF) >> 8 & 0xFF00FF) + (var15 * (var20 & 0xFF00) >> 8 & 0xFF00);
					this.anIntArray8630[var18++] = var22 + var20;
				}
				var8++;
				var13 += var11 + var11;
				var12 += var11++ + var11;
			}
		} else if (arg4 == 2) {
			int var21;
			while (var8 < arg1) {
				while (var13 <= var9 || var12 <= var9) {
					var12 += var10 + var10;
					var13 += var10++ + var10;
				}
				var15 = arg0 - var10 + 1;
				if (var15 < this.anInt8621) {
					var15 = this.anInt8621;
				}
				var16 = arg0 + var10;
				if (var16 > this.anInt8635) {
					var16 = this.anInt8635;
				}
				var17 = this.anInt8618 * var8 + var15;
				for (var18 = var15; var18 < var16; var18++) {
					var19 = this.anIntArray8630[var17];
					var20 = arg3 + var19;
					var21 = (var19 & 0xFF00FF) + (arg3 & 0xFF00FF);
					var19 = (var20 - var21 & 0x10000) + (var21 & 0x1000100);
					this.anIntArray8630[var17++] = var20 - var19 | var19 - (var19 >>> 8);
				}
				var8++;
				var12 -= var11-- + var11;
				var13 -= var11 + var11;
			}
			var10 = arg2;
			var11 = -var11;
			var13 = var9 + var11 * var11;
			var12 = var13 - arg2;
			var13 -= var11;
			while (var8 < var7) {
				while (var13 > var9 && var12 > var9) {
					var13 -= var10-- + var10;
					var12 -= var10 + var10;
				}
				var15 = arg0 - var10;
				if (var15 < this.anInt8621) {
					var15 = this.anInt8621;
				}
				var16 = var10 + arg0;
				if (var16 > this.anInt8635 - 1) {
					var16 = this.anInt8635 - 1;
				}
				var17 = var8 * this.anInt8618 + var15;
				for (var18 = var15; var18 <= var16; var18++) {
					var19 = this.anIntArray8630[var17];
					var20 = arg3 + var19;
					var21 = (arg3 & 0xFF00FF) + (var19 & 0xFF00FF);
					var19 = (var20 - var21 & 0x10000) + (var21 & 0x1000100);
					this.anIntArray8630[var17++] = var20 - var19 | var19 - (var19 >>> 8);
				}
				var8++;
				var13 += var11 + var11;
				var12 += var11++ + var11;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("Class_ra_Sub3.XA(IIIII)V")
	public void XA(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (this.anIntArray8630 == null || arg1 < this.anInt8623 || arg1 >= this.anInt8624) {
			return;
		}
		if (arg0 < this.anInt8621) {
			arg2 -= this.anInt8621 - arg0;
			arg0 = this.anInt8621;
		}
		if (arg2 + arg0 > this.anInt8635) {
			arg2 = this.anInt8635 - arg0;
		}
		int var6 = this.anInt8618 * arg1 + arg0;
		int var7 = arg3 >>> 24;
		int var8;
		if (arg4 == 0 || arg4 == 1 && var7 == 255) {
			for (var8 = 0; var8 < arg2; var8++) {
				this.anIntArray8630[var8 + var6] = arg3;
			}
			return;
		}
		int var9;
		int var10;
		if (arg4 == 1) {
			int var12 = (var7 << 24) + ((arg3 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + (var7 * (arg3 & 0xFF00) >> 8 & 0xFF00);
			var8 = 256 - var7;
			for (var9 = 0; var9 < arg2; var9++) {
				var10 = this.anIntArray8630[var9 + var6];
				int var13 = ((var10 & 0xFF00) * var8 >> 8 & 0xFF00) + ((var10 & 0xFF00FF) * var8 >> 8 & 0xFF00FF);
				this.anIntArray8630[var9 + var6] = var12 + var13;
			}
		} else if (arg4 == 2) {
			for (var8 = 0; var8 < arg2; var8++) {
				var9 = this.anIntArray8630[var8 + var6];
				var10 = var9 + arg3;
				int var11 = (var9 & 0xFF00FF) + (arg3 & 0xFF00FF);
				var9 = (var10 - var11 & 0x10000) + (var11 & 0x1000100);
				this.anIntArray8630[var6 + var8] = var10 - var9 | var9 - (var9 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("Class_ra_Sub3.ak(Ljava/awt/Canvas;II)LClass76_Sub1;")
	public Class76_Sub1 ak(Canvas arg0, int arg1, int arg2) {
		return Class330_Sub26.method3394(this, arg0, arg1, arg2, 1898719342);
	}

	@ObfuscatedName("Class_ra_Sub3.ae(IIII)V")
	public void ae(int arg0, int arg1, int arg2, int arg3) {
		this.anInt8636 = arg0;
		this.anInt8622 = arg1;
		this.anInt8638 = arg2;
		this.anInt8614 = arg3;
		this.method5195();
	}

	public void method5198(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (this.anIntArray8630 == null || arg0 < this.anInt8621 || arg0 >= this.anInt8635) {
			return;
		}
		int var9 = this.anInt8618 * arg1 + arg0;
		int var10 = arg3 >>> 24;
		int var11 = arg5 + arg6;
		int var12 = arg7 % var11;
		int var13;
		if (arg4 == 0 || arg4 == 1 && var10 == 255) {
			var13 = 0;
			while (var13 < arg2) {
				if (var13 + arg1 >= this.anInt8623 && arg1 + var13 < this.anInt8624 && var12 < arg5) {
					this.anIntArray8630[var9 + var13 * this.anInt8618] = arg3;
				}
				var13++;
				var12++;
				var12 %= var11;
			}
			return;
		}
		int var14;
		int var15;
		int var16;
		if (arg4 == 1) {
			int var18 = (var10 << 24) + ((arg3 & 0xFF00) * var10 >> 8 & 0xFF00) + (var10 * (arg3 & 0xFF00FF) >> 8 & 0xFF00FF);
			var13 = 256 - var10;
			var14 = 0;
			while (var14 < arg2) {
				if (var14 + arg1 >= this.anInt8623 && arg1 + var14 < this.anInt8624 && var12 < arg5) {
					var15 = var9 + var14 * this.anInt8618;
					var16 = this.anIntArray8630[var15];
					int var19 = ((var16 & 0xFF00) * var13 >> 8 & 0xFF00) + (var13 * (var16 & 0xFF00FF) >> 8 & 0xFF00FF);
					this.anIntArray8630[var15] = var19 + var18;
				}
				var14++;
				var12++;
				var12 %= var11;
			}
		} else if (arg4 == 2) {
			var13 = 0;
			while (var13 < arg2) {
				if (arg1 + var13 >= this.anInt8623 && arg1 + var13 < this.anInt8624 && var12 < arg5) {
					var14 = var13 * this.anInt8618 + var9;
					var15 = this.anIntArray8630[var14];
					var16 = arg3 + var15;
					int var17 = (arg3 & 0xFF00FF) + (var15 & 0xFF00FF);
					var15 = (var16 - var17 & 0x10000) + (var17 & 0x1000100);
					this.anIntArray8630[var14] = var16 - var15 | var15 - (var15 >>> 8);
				}
				var13++;
				var12++;
				var12 %= var11;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("Class_ra_Sub3.br(IIIIII)V")
	public void br(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (this.anIntArray8630 == null) {
			return;
		}
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.XA(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.XA(arg2 + arg0, arg1, -arg2 + 1, arg4, arg5);
			}
		} else if (arg2 != 0) {
			if (arg3 + arg2 < 0) {
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			int var7;
			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var13;
			int var15;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				int var14 = arg3 << 16;
				var7 = (int) Math.floor((double) var14 / (double) arg2 + 0.5D);
				arg2 += arg0;
				if (arg0 < this.anInt8621) {
					arg1 += var7 * (this.anInt8621 - arg0);
					arg0 = this.anInt8621;
				}
				if (arg2 >= this.anInt8635) {
					arg2 = this.anInt8635 - 1;
				}
				var8 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && var8 == 255) {
					while (arg0 <= arg2) {
						var9 = arg1 >> 16;
						if (var9 >= this.anInt8623 && var9 < this.anInt8624) {
							this.anIntArray8630[var9 * this.anInt8618 + arg0] = arg4;
						}
						arg1 += var7;
						arg0++;
					}
				} else if (arg5 == 1) {
					var15 = ((arg4 & 0xFF00FF) * var8 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * var8 >> 8 & 0xFF00) + (var8 << 24);
					var9 = 256 - var8;
					while (arg0 <= arg2) {
						var10 = arg1 >> 16;
						if (var10 >= this.anInt8623 && var10 < this.anInt8624) {
							var11 = arg0 + var10 * this.anInt8618;
							var12 = this.anIntArray8630[var11];
							int var17 = (var9 * (var12 & 0xFF00FF) >> 8 & 0xFF00FF) + (var9 * (var12 & 0xFF00) >> 8 & 0xFF00);
							this.anIntArray8630[var11] = var17 + var15;
						}
						arg1 += var7;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						var9 = arg1 >> 16;
						if (var9 >= this.anInt8623 && var9 < this.anInt8624) {
							var10 = arg0 + this.anInt8618 * var9;
							var11 = this.anIntArray8630[var10];
							var12 = var11 + arg4;
							var13 = (var11 & 0xFF00FF) + (arg4 & 0xFF00FF);
							var11 = (var12 - var13 & 0x10000) + (var13 & 0x1000100);
							this.anIntArray8630[var10] = var12 - var11 | var11 - (var11 >>> 8);
						}
						arg1 += var7;
						arg0++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				int var16 = arg2 << 16;
				var7 = (int) Math.floor((double) var16 / (double) arg3 + 0.5D);
				arg3 += arg1;
				if (arg1 < this.anInt8623) {
					arg0 += (this.anInt8623 - arg1) * var7;
					arg1 = this.anInt8623;
				}
				if (arg3 >= this.anInt8624) {
					arg3 = this.anInt8624 - 1;
				}
				var8 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && var8 == 255) {
					while (arg1 <= arg3) {
						var9 = arg0 >> 16;
						if (var9 >= this.anInt8621 && var9 < this.anInt8635) {
							this.anIntArray8630[this.anInt8618 * arg1 + var9] = arg4;
						}
						arg0 += var7;
						arg1++;
					}
				} else if (arg5 == 1) {
					var15 = ((arg4 & 0xFF00) * var8 >> 8 & 0xFF00) + ((arg4 & 0xFF00FF) * var8 >> 8 & 0xFF00FF) + (var8 << 24);
					var9 = 256 - var8;
					while (arg1 <= arg3) {
						var10 = arg0 >> 16;
						if (var10 >= this.anInt8621 && var10 < this.anInt8635) {
							var11 = this.anInt8618 * arg1 + var10;
							var12 = this.anIntArray8630[var11];
							var12 = (var9 * (var12 & 0xFF00) >> 8 & 0xFF00) + (var9 * (var12 & 0xFF00FF) >> 8 & 0xFF00FF);
							this.anIntArray8630[var10 + this.anInt8618 * arg1] = var15 + var12;
						}
						arg0 += var7;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						var9 = arg0 >> 16;
						if (var9 >= this.anInt8621 && var9 < this.anInt8635) {
							var10 = var9 + this.anInt8618 * arg1;
							var11 = this.anIntArray8630[var10];
							var12 = arg4 + var11;
							var13 = (var11 & 0xFF00FF) + (arg4 & 0xFF00FF);
							var11 = (var13 & 0x1000100) + (var12 - var13 & 0x10000);
							this.anIntArray8630[var10] = var12 - var11 | var11 - (var11 >>> 8);
						}
						arg0 += var7;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.G(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.G(arg0, arg3 + arg1, -arg3 + 1, arg4, arg5);
		}
	}

	@ObfuscatedName("Class_ra_Sub3.bz(IIIIIIIII)V")
	public void bz(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		if (this.anIntArray8630 == null) {
			return;
		}
		arg2 -= arg0;
		arg3 -= arg1;
		int var10;
		int var24;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method5203(arg0, arg1, arg2 + 1, arg4, arg5, arg6, arg7, arg8);
			} else {
				var10 = arg7 + arg6;
				var24 = arg8 % var10;
				int var25 = arg6 + var10 - var24 - (-arg2 + 1) % var10;
				arg8 = var25 % var10;
				if (arg8 < 0) {
					arg8 += var10;
				}
				this.method5203(arg2 + arg0, arg1, -arg2 + 1, arg4, arg5, arg6, arg7, arg8);
			}
		} else if (arg2 != 0) {
			var24 = arg8 << 8;
			int var22 = arg6 << 8;
			int var23 = arg7 << 8;
			var10 = var22 + var23;
			arg8 = var24 % var10;
			int var11;
			int var12;
			if (arg3 + arg2 < 0) {
				var11 = (int) (Math.sqrt((double) (arg2 * arg2 + arg3 * arg3)) * 256.0D);
				var12 = var11 % var10;
				var24 = var22 + var10 - arg8 - var12;
				arg8 = var24 % var10;
				if (arg8 < 0) {
					arg8 += var10;
				}
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			int var13;
			int var14;
			int var15;
			int var16;
			int var17;
			int var18;
			int var19;
			int var20;
			int var21;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				var20 = arg3 << 16;
				var11 = (int) Math.floor((double) var20 / (double) arg2 + 0.5D);
				var19 = arg2 + arg0;
				var12 = arg4 >>> 24;
				var13 = (int) Math.sqrt((double) ((var11 >> 8) * (var11 >> 8) + 65536));
				if (arg5 == 0 || arg5 == 1 && var12 == 255) {
					while (arg0 <= var19) {
						var14 = arg1 >> 16;
						if (arg0 >= this.anInt8621 && arg0 < this.anInt8635 && var14 >= this.anInt8623 && var14 < this.anInt8624 && arg8 < var22) {
							this.anIntArray8630[var14 * this.anInt8618 + arg0] = arg4;
						}
						arg1 += var11;
						arg0++;
						var24 = arg8 + var13;
						arg8 = var24 % var10;
					}
				} else if (arg5 == 1) {
					var21 = ((arg4 & 0xFF00FF) * var12 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * var12 >> 8 & 0xFF00) + (var12 << 24);
					var14 = 256 - var12;
					while (arg0 <= var19) {
						var15 = arg1 >> 16;
						if (arg0 >= this.anInt8621 && arg0 < this.anInt8635 && var15 >= this.anInt8623 && var15 < this.anInt8624 && arg8 < var22) {
							var16 = arg0 + this.anInt8618 * var15;
							var17 = this.anIntArray8630[var16];
							int var26 = ((var17 & 0xFF00FF) * var14 >> 8 & 0xFF00FF) + (var14 * (var17 & 0xFF00) >> 8 & 0xFF00);
							this.anIntArray8630[var16] = var21 + var26;
						}
						arg1 += var11;
						arg0++;
						var24 = arg8 + var13;
						arg8 = var24 % var10;
					}
				} else if (arg5 == 2) {
					while (arg0 <= var19) {
						var14 = arg1 >> 16;
						if (arg0 >= this.anInt8621 && arg0 < this.anInt8635 && var14 >= this.anInt8623 && var14 < this.anInt8624 && arg8 < var22) {
							var15 = arg0 + var14 * this.anInt8618;
							var16 = this.anIntArray8630[var15];
							var17 = arg4 + var16;
							var18 = (var16 & 0xFF00FF) + (arg4 & 0xFF00FF);
							var16 = (var18 & 0x1000100) + (var17 - var18 & 0x10000);
							this.anIntArray8630[var15] = var17 - var16 | var16 - (var16 >>> 8);
						}
						arg1 += var11;
						arg0++;
						var24 = arg8 + var13;
						arg8 = var24 % var10;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				var19 = arg2 << 16;
				var11 = (int) Math.floor((double) var19 / (double) arg3 + 0.5D);
				var20 = arg3 + arg1;
				var12 = arg4 >>> 24;
				var13 = (int) Math.sqrt((double) ((var11 >> 8) * (var11 >> 8) + 65536));
				if (arg5 == 0 || arg5 == 1 && var12 == 255) {
					while (arg1 <= var20) {
						var14 = arg0 >> 16;
						if (arg1 >= this.anInt8623 && arg1 < this.anInt8624 && var14 >= this.anInt8621 && var14 < this.anInt8635 && arg8 < var22) {
							this.anIntArray8630[this.anInt8618 * arg1 + var14] = arg4;
						}
						arg0 += var11;
						arg1++;
						var24 = arg8 + var13;
						arg8 = var24 % var10;
					}
				} else if (arg5 == 1) {
					var21 = (var12 * (arg4 & 0xFF00FF) >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * var12 >> 8 & 0xFF00) + (var12 << 24);
					var14 = 256 - var12;
					while (arg1 <= var20) {
						var15 = arg0 >> 16;
						if (arg1 >= this.anInt8623 && arg1 < this.anInt8624 && var15 >= this.anInt8621 && var15 < this.anInt8635 && arg8 < var22) {
							var16 = arg1 * this.anInt8618 + var15;
							var17 = this.anIntArray8630[var16];
							var17 = ((var17 & 0xFF00FF) * var14 >> 8 & 0xFF00FF) + (var14 * (var17 & 0xFF00) >> 8 & 0xFF00);
							this.anIntArray8630[var15 + arg1 * this.anInt8618] = var21 + var17;
						}
						arg0 += var11;
						arg1++;
						var24 = arg8 + var13;
						arg8 = var24 % var10;
					}
				} else if (arg5 == 2) {
					while (arg1 <= var20) {
						var14 = arg0 >> 16;
						if (arg1 >= this.anInt8623 && arg1 < this.anInt8624 && var14 >= this.anInt8621 && var14 < this.anInt8635 && arg8 < var22) {
							var15 = var14 + this.anInt8618 * arg1;
							var16 = this.anIntArray8630[var15];
							var17 = var16 + arg4;
							var18 = (arg4 & 0xFF00FF) + (var16 & 0xFF00FF);
							var16 = (var17 - var18 & 0x10000) + (var18 & 0x1000100);
							this.anIntArray8630[var15] = var17 - var16 | var16 - (var16 >>> 8);
						}
						arg0 += var11;
						arg1++;
						var24 = arg8 + var13;
						arg8 = var24 % var10;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.method5198(arg0, arg1, arg3 + 1, arg4, arg5, arg6, arg7, arg8);
		} else {
			var10 = arg6 + arg7;
			var24 = arg8 % var10;
			var24 = arg6 + var10 - var24 - (-arg3 + 1) % var10;
			arg8 = var24 % var10;
			if (arg8 < 0) {
				arg8 += var10;
			}
			this.method5198(arg0, arg3 + arg1, -arg3 + 1, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@ObfuscatedName("Class_ra_Sub3.bi(IIIIIILClass_ta;II)V")
	public void bi(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Class_ta arg6, int arg7, int arg8) {
		if (this.anIntArray8630 == null) {
			return;
		}
		Class_ta_Sub3 var10 = (Class_ta_Sub3) arg6;
		int[] var11 = var10.anIntArray8661;
		int[] var12 = var10.anIntArray8662;
		int var13 = this.anInt8623 > arg8 ? this.anInt8623 : arg8;
		int var14 = this.anInt8624 < var11.length + arg8 ? this.anInt8624 : var11.length + arg8;
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 + arg2 < 0) {
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		int var15;
		int var16;
		int var17;
		int var18;
		int var19;
		int var20;
		int var21;
		int var22;
		int var23;
		int var25;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			int var26 = arg2 << 16;
			var15 = (int) Math.floor((double) var26 / (double) arg3 + 0.5D);
			arg3 += arg1;
			if (arg1 < var13) {
				arg0 += var15 * (var13 - arg1);
				arg1 = var13;
			}
			if (arg3 >= var14) {
				arg3 = var14 - 1;
			}
			var16 = arg4 >>> 24;
			if (arg5 == 0 || arg5 == 1 && var16 == 255) {
				while (arg1 <= arg3) {
					var17 = arg0 >> 16;
					var18 = arg1 - arg8;
					var19 = arg7 + var11[var18];
					if (var17 >= this.anInt8621 && var17 < this.anInt8635 && var17 >= var19 && var17 < var19 + var12[var18]) {
						this.anIntArray8630[this.anInt8618 * arg1 + var17] = arg4;
					}
					arg0 += var15;
					arg1++;
				}
			} else if (arg5 == 1) {
				var25 = ((arg4 & 0xFF00FF) * var16 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * var16 >> 8 & 0xFF00) + (var16 << 24);
				var17 = 256 - var16;
				while (arg1 <= arg3) {
					var18 = arg0 >> 16;
					var19 = arg1 - arg8;
					var20 = arg7 + var11[var19];
					if (var18 >= this.anInt8621 && var18 < this.anInt8635 && var18 >= var20 && var18 < var20 + var12[var19]) {
						var21 = arg1 * this.anInt8618 + var18;
						var22 = this.anIntArray8630[var21];
						var22 = ((var22 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + (var17 * (var22 & 0xFF00) >> 8 & 0xFF00);
						this.anIntArray8630[var18 + arg1 * this.anInt8618] = var25 + var22;
					}
					arg0 += var15;
					arg1++;
				}
			} else if (arg5 == 2) {
				while (arg1 <= arg3) {
					var17 = arg0 >> 16;
					var18 = arg1 - arg8;
					var19 = var11[var18] + arg7;
					if (var17 >= this.anInt8621 && var17 < this.anInt8635 && var17 >= var19 && var17 < var19 + var12[var18]) {
						var20 = this.anInt8618 * arg1 + var17;
						var21 = this.anIntArray8630[var20];
						var22 = var21 + arg4;
						var23 = (arg4 & 0xFF00FF) + (var21 & 0xFF00FF);
						var21 = (var23 & 0x1000100) + (var22 - var23 & 0x10000);
						this.anIntArray8630[var20] = var22 - var21 | var21 - (var21 >>> 8);
					}
					arg0 += var15;
					arg1++;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		int var24 = arg3 << 16;
		var15 = (int) Math.floor((double) var24 / (double) arg2 + 0.5D);
		arg2 += arg0;
		if (arg0 < this.anInt8621) {
			arg1 += (this.anInt8621 - arg0) * var15;
			arg0 = this.anInt8621;
		}
		if (arg2 >= this.anInt8635) {
			arg2 = this.anInt8635 - 1;
		}
		var16 = arg4 >>> 24;
		if (arg5 == 0 || arg5 == 1 && var16 == 255) {
			while (arg0 <= arg2) {
				var17 = arg1 >> 16;
				var18 = var17 - arg8;
				if (var17 >= var13 && var17 < var14) {
					var19 = var11[var18] + arg7;
					if (arg0 >= var19 && arg0 < var12[var18] + var19) {
						this.anIntArray8630[var17 * this.anInt8618 + arg0] = arg4;
					}
				}
				arg1 += var15;
				arg0++;
			}
		} else if (arg5 == 1) {
			var25 = (var16 * (arg4 & 0xFF00FF) >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * var16 >> 8 & 0xFF00) + (var16 << 24);
			var17 = 256 - var16;
			while (arg0 <= arg2) {
				var18 = arg1 >> 16;
				var19 = var18 - arg8;
				if (var18 >= var13 && var18 < var14) {
					var20 = var11[var19] + arg7;
					if (arg0 >= var20 && arg0 < var20 + var12[var19]) {
						var21 = this.anInt8618 * var18 + arg0;
						var22 = this.anIntArray8630[var21];
						int var27 = (var17 * (var22 & 0xFF00) >> 8 & 0xFF00) + (var17 * (var22 & 0xFF00FF) >> 8 & 0xFF00FF);
						this.anIntArray8630[var21] = var27 + var25;
					}
				}
				arg1 += var15;
				arg0++;
			}
		} else if (arg5 == 2) {
			while (arg0 <= arg2) {
				var17 = arg1 >> 16;
				var18 = var17 - arg8;
				if (var17 >= var13 && var17 < var14) {
					var19 = arg7 + var11[var18];
					if (arg0 >= var19 && arg0 < var12[var18] + var19) {
						var20 = arg0 + var17 * this.anInt8618;
						var21 = this.anIntArray8630[var20];
						var22 = var21 + arg4;
						var23 = (arg4 & 0xFF00FF) + (var21 & 0xFF00FF);
						var21 = (var22 - var23 & 0x10000) + (var23 & 0x1000100);
						this.anIntArray8630[var20] = var22 - var21 | var21 - (var21 >>> 8);
					}
				}
				arg1 += var15;
				arg0++;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("Class_ra_Sub3.fq(IIIIII)V")
	public void fq(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		this.XA(arg0, arg1, arg2, arg4, arg5);
		this.XA(arg0, arg3 + arg1 - 1, arg2, arg4, arg5);
		this.G(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.G(arg2 + arg0 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@ObfuscatedName("Class_ra_Sub3.bp(IIIIII)I")
	public int bp(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 0;
		float var8 = this.aClass249_8634.aFloatArray2631[10] * (float) arg2 + (float) arg0 * this.aClass249_8634.aFloatArray2631[2] + this.aClass249_8634.aFloatArray2631[14] + this.aClass249_8634.aFloatArray2631[6] * (float) arg1;
		float var9 = this.aClass249_8634.aFloatArray2631[2] * (float) arg3 + this.aClass249_8634.aFloatArray2631[14] + this.aClass249_8634.aFloatArray2631[6] * (float) arg4 + this.aClass249_8634.aFloatArray2631[10] * (float) arg5;
		float var10 = (float) arg1 * this.aClass249_8634.aFloatArray2631[7] + (float) arg0 * this.aClass249_8634.aFloatArray2631[3] + this.aClass249_8634.aFloatArray2631[15] + (float) arg2 * this.aClass249_8634.aFloatArray2631[11];
		float var11 = (float) arg4 * this.aClass249_8634.aFloatArray2631[7] + this.aClass249_8634.aFloatArray2631[3] * (float) arg3 + this.aClass249_8634.aFloatArray2631[15] + this.aClass249_8634.aFloatArray2631[11] * (float) arg5;
		if (var8 < -var10 && var9 < -var11) {
			var7 |= 0x10;
		} else if (var8 > var10 && var9 > var11) {
			var7 |= 0x20;
		}
		float var12 = (float) arg1 * this.aClass249_8634.aFloatArray2631[4] + this.aClass249_8634.aFloatArray2631[12] + (float) arg0 * this.aClass249_8634.aFloatArray2631[0] + this.aClass249_8634.aFloatArray2631[8] * (float) arg2;
		float var13 = (float) arg4 * this.aClass249_8634.aFloatArray2631[4] + this.aClass249_8634.aFloatArray2631[12] + (float) arg3 * this.aClass249_8634.aFloatArray2631[0] + this.aClass249_8634.aFloatArray2631[8] * (float) arg5;
		if (var12 < -var10 && var13 < -var11) {
			var7 |= 0x1;
		}
		if (var12 > var10 && var13 > var11) {
			var7 |= 0x2;
		}
		float var14 = (float) arg0 * this.aClass249_8634.aFloatArray2631[1] + this.aClass249_8634.aFloatArray2631[13] + (float) arg1 * this.aClass249_8634.aFloatArray2631[5] + this.aClass249_8634.aFloatArray2631[9] * (float) arg2;
		float var15 = this.aClass249_8634.aFloatArray2631[9] * (float) arg5 + this.aClass249_8634.aFloatArray2631[5] * (float) arg4 + this.aClass249_8634.aFloatArray2631[1] * (float) arg3 + this.aClass249_8634.aFloatArray2631[13];
		if (var14 < -var10 && var15 < -var11) {
			var7 |= 0x4;
		}
		if (var14 > var10 && var15 > var11) {
			var7 |= 0x8;
		}
		return var7;
	}

	@ObfuscatedName("Class_ra_Sub3.bx(I)LClass_v;")
	public Class_v bx(int arg0) {
		return null;
	}

	@ObfuscatedName("Class_ra_Sub3.bm(LClass_v;)V")
	public void bm(Class_v arg0) {
	}

	@ObfuscatedName("Class_ra_Sub3.bn(IIZZ)LClass61;")
	public Class61 bn(int arg0, int arg1, boolean arg2, boolean arg3) {
		return arg2 ? new Class61_Sub3_Sub2(this, arg0, arg1) : new Class61_Sub3_Sub1(this, arg0, arg1);
	}

	@ObfuscatedName("Class_ra_Sub3.bu([IIIIIZ)LClass61;")
	public Class61 bu(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		boolean var7 = false;
		int var8 = arg1;
		for (int var9 = 0; var9 < arg4; var9++) {
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = arg0[var8++] >>> 24;
				if (var11 != 0 && var11 != 255) {
					var7 = true;
					return var7 ? new Class61_Sub3_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : new Class61_Sub3_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
				}
			}
		}
		return var7 ? new Class61_Sub3_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : new Class61_Sub3_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("Class_ra_Sub3.bw(LClass87;Z)LClass61;")
	public Class61 bw(Class87 arg0, boolean arg1) {
		int var3 = arg0.method986();
		int var4 = arg0.method994();
		Class61_Sub3 var5;
		if (arg1 && !arg0.method985() && arg0.method1044()) {
			Class87_Sub2 var12 = (Class87_Sub2) arg0;
			int[] var7 = new int[var12.anIntArray7113.length];
			byte[] var8 = new byte[var4 * var3];
			int var9;
			for (var9 = 0; var9 < var4; var9++) {
				int var10 = var9 * var3;
				for (int var11 = 0; var11 < var3; var11++) {
					var8[var11 + var10] = var12.aByteArray7114[var11 + var10];
				}
			}
			for (var9 = 0; var9 < var12.anIntArray7113.length; var9++) {
				var7[var9] = var12.anIntArray7113[var9];
			}
			var5 = new Class61_Sub3_Sub3(this, var8, var7, var3, var4);
		} else {
			int[] var6 = arg0.method1031(false);
			if (arg0.method985()) {
				var5 = new Class61_Sub3_Sub2(this, var6, var3, var4);
			} else {
				var5 = new Class61_Sub3_Sub1(this, var6, var3, var4);
			}
		}
		var5.method717(arg0.method983(), arg0.method990(), arg0.method989(), arg0.method991());
		return var5;
	}

	@ObfuscatedName("Class_ra_Sub3.ke()V")
	public void ke() {
		this.anInt8621 = 0 * 512290825;
		this.anInt8623 = 0 * -1679642481;
		this.anInt8635 = this.anInt8618 * -29235085 * 1677671663 * -1071049483;
		this.anInt8624 = this.anInt8619 * -1710096567 * 1870465245 * 31822541;
		this.method5195();
	}

	@ObfuscatedName("Class_ra_Sub3.be(IIIIIILClass_ta;IIIII)V")
	public void be(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Class_ta arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		if (this.anIntArray8630 == null) {
			return;
		}
		Class_ta_Sub3 var13 = (Class_ta_Sub3) arg6;
		int[] var14 = var13.anIntArray8661;
		int[] var15 = var13.anIntArray8662;
		int var16 = this.anInt8623 > arg8 ? this.anInt8623 : arg8;
		int var17 = this.anInt8624 < var14.length + arg8 ? this.anInt8624 : var14.length + arg8;
		int var34 = arg11 << 8;
		int var32 = arg9 << 8;
		int var33 = arg10 << 8;
		int var18 = var32 + var33;
		arg11 = var34 % var18;
		arg2 -= arg0;
		arg3 -= arg1;
		int var19;
		int var20;
		if (arg3 + arg2 < 0) {
			var19 = (int) (Math.sqrt((double) (arg3 * arg3 + arg2 * arg2)) * 256.0D);
			var20 = var19 % var18;
			var34 = var32 + var18 - arg11 - var20;
			arg11 = var34 % var18;
			if (arg11 < 0) {
				arg11 += var18;
			}
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		int var21;
		int var22;
		int var23;
		int var24;
		int var25;
		int var26;
		int var27;
		int var29;
		int var30;
		int var31;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			var29 = arg2 << 16;
			var19 = (int) Math.floor((double) var29 / (double) arg3 + 0.5D);
			var20 = (int) Math.sqrt((double) ((var19 >> 8) * (var19 >> 8) + 65536));
			var30 = arg3 + arg1;
			var21 = arg4 >>> 24;
			if (arg5 == 0 || arg5 == 1 && var21 == 255) {
				while (arg1 <= var30) {
					var22 = arg0 >> 16;
					var23 = arg1 - arg8;
					if (arg1 >= var16 && arg1 < var17 && var22 >= this.anInt8621 && var22 < this.anInt8635 && arg11 < var32 && var22 >= var14[var23] + arg7 && var22 < var14[var23] + arg7 + var15[var23]) {
						this.anIntArray8630[this.anInt8618 * arg1 + var22] = arg4;
					}
					arg0 += var19;
					arg1++;
					var34 = arg11 + var20;
					arg11 = var34 % var18;
				}
			} else if (arg5 == 1) {
				var31 = (var21 * (arg4 & 0xFF00FF) >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * var21 >> 8 & 0xFF00) + (var21 << 24);
				var22 = 256 - var21;
				while (arg1 <= var30) {
					var23 = arg0 >> 16;
					var24 = arg1 - arg8;
					if (arg1 >= var16 && arg1 < var17 && var23 >= this.anInt8621 && var23 < this.anInt8635 && arg11 < var32 && var23 >= var14[var24] + arg7 && var23 < var15[var24] + var14[var24] + arg7) {
						var25 = var23 + this.anInt8618 * arg1;
						var26 = this.anIntArray8630[var25];
						var26 = (var22 * (var26 & 0xFF00FF) >> 8 & 0xFF00FF) + (var22 * (var26 & 0xFF00) >> 8 & 0xFF00);
						this.anIntArray8630[this.anInt8618 * arg1 + var23] = var31 + var26;
					}
					arg0 += var19;
					arg1++;
					var34 = arg11 + var20;
					arg11 = var34 % var18;
				}
			} else if (arg5 == 2) {
				while (arg1 <= var30) {
					var22 = arg0 >> 16;
					var23 = arg1 - arg8;
					if (arg1 >= var16 && arg1 < var17 && var22 >= this.anInt8621 && var22 < this.anInt8635 && arg11 < var32 && var22 >= var14[var23] + arg7 && var22 < arg7 + var14[var23] + var15[var23]) {
						var24 = var22 + this.anInt8618 * arg1;
						var25 = this.anIntArray8630[var24];
						var26 = var25 + arg4;
						var27 = (var25 & 0xFF00FF) + (arg4 & 0xFF00FF);
						var25 = (var27 & 0x1000100) + (var26 - var27 & 0x10000);
						this.anIntArray8630[var24] = var26 - var25 | var25 - (var25 >>> 8);
					}
					arg0 += var19;
					arg1++;
					var34 = arg11 + var20;
					arg11 = var34 % var18;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		var30 = arg3 << 16;
		var19 = (int) Math.floor((double) var30 / (double) arg2 + 0.5D);
		var29 = arg2 + arg0;
		var20 = arg4 >>> 24;
		var21 = (int) Math.sqrt((double) ((var19 >> 8) * (var19 >> 8) + 65536));
		if (arg5 == 0 || arg5 == 1 && var20 == 255) {
			while (arg0 <= var29) {
				var22 = arg1 >> 16;
				var23 = var22 - arg8;
				if (arg0 >= this.anInt8621 && arg0 < this.anInt8635 && var22 >= var16 && var22 < var17 && arg11 < var32) {
					var24 = arg7 + var14[var23];
					if (arg0 >= var24 && arg0 < var24 + var15[var23]) {
						this.anIntArray8630[this.anInt8618 * var22 + arg0] = arg4;
					}
				}
				arg1 += var19;
				arg0++;
				var34 = arg11 + var21;
				arg11 = var34 % var18;
			}
		} else if (arg5 == 1) {
			var31 = ((arg4 & 0xFF00FF) * var20 >> 8 & 0xFF00FF) + (var20 * (arg4 & 0xFF00) >> 8 & 0xFF00) + (var20 << 24);
			var22 = 256 - var20;
			while (arg0 <= var29) {
				var23 = arg1 >> 16;
				var24 = var23 - arg8;
				if (arg0 >= this.anInt8621 && arg0 < this.anInt8635 && var23 >= var16 && var23 < var17 && arg11 < var32) {
					var25 = var14[var24] + arg7;
					if (arg0 >= var25 && arg0 < var15[var24] + var25) {
						var26 = var23 * this.anInt8618 + arg0;
						var27 = this.anIntArray8630[var26];
						int var35 = ((var27 & 0xFF00) * var22 >> 8 & 0xFF00) + ((var27 & 0xFF00FF) * var22 >> 8 & 0xFF00FF);
						this.anIntArray8630[var26] = var35 + var31;
					}
				}
				arg1 += var19;
				arg0++;
				var34 = arg11 + var21;
				arg11 = var34 % var18;
			}
		} else if (arg5 == 2) {
			while (arg0 <= var29) {
				var22 = arg1 >> 16;
				var23 = var22 - arg8;
				if (arg0 >= this.anInt8621 && arg0 < this.anInt8635 && var22 >= var16 && var22 < var17 && arg11 < var32) {
					var24 = var14[var23] + arg7;
					if (arg0 >= var24 && arg0 < var24 + var15[var23]) {
						var25 = arg0 + this.anInt8618 * var22;
						var26 = this.anIntArray8630[var25];
						var27 = var26 + arg4;
						int var28 = (arg4 & 0xFF00FF) + (var26 & 0xFF00FF);
						var26 = (var28 & 0x1000100) + (var27 - var28 & 0x10000);
						this.anIntArray8630[var25] = var27 - var26 | var26 - (var26 >>> 8);
					}
				}
				arg1 += var19;
				arg0++;
				var34 = arg11 + var21;
				arg11 = var34 % var18;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("Class_ra_Sub3.DA(ILClass_ta;II)V")
	public void DA(int arg0, Class_ta arg1, int arg2, int arg3) {
		if (this.anIntArray8630 == null) {
			return;
		}
		Class_ta_Sub3 var5 = (Class_ta_Sub3) arg1;
		int[] var6 = var5.anIntArray8661;
		int[] var7 = var5.anIntArray8662;
		int var8;
		if (this.anInt8624 < var6.length + arg3) {
			var8 = this.anInt8624 - arg3;
		} else {
			var8 = var6.length;
		}
		int var9;
		if (this.anInt8623 > arg3) {
			var9 = this.anInt8623 - arg3;
			arg3 = this.anInt8623;
		} else {
			var9 = 0;
		}
		if (var8 - var9 <= 0) {
			return;
		}
		int var10 = this.anInt8618 * arg3;
		for (int var11 = var9; var11 < var8; var11++) {
			int var12 = var6[var11] + arg2;
			int var13 = var7[var11];
			if (this.anInt8621 > var12) {
				var13 -= this.anInt8621 - var12;
				var12 = this.anInt8621;
			}
			if (this.anInt8635 < var12 + var13) {
				var13 = this.anInt8635 - var12;
			}
			var12 += var10;
			for (int var14 = -var13; var14 < 0; var14++) {
				this.anIntArray8630[var12++] = arg0;
			}
			var10 += this.anInt8618;
		}
	}

	@ObfuscatedName("Class_ra_Sub3.ce(LClass524;[LClass87_Sub2;Z)LClass263;")
	public Class263 ce(Class524 arg0, Class87_Sub2[] arg1, boolean arg2) {
		int[] var4 = new int[arg1.length];
		int[] var5 = new int[arg1.length];
		boolean var6 = false;
		for (int var7 = 0; var7 < arg1.length; var7++) {
			var4[var7] = arg1[var7].method986();
			var5[var7] = arg1[var7].method994();
			if (arg1[var7].method985()) {
				var6 = true;
			}
		}
		if (arg2) {
			if (var6) {
				return new Class263_Sub2(this, arg0, arg1, var4, var5);
			} else {
				return new Class263_Sub3(this, arg0, arg1, var4, var5);
			}
		} else if (var6) {
			throw new IllegalArgumentException("");
		} else {
			return new Class263_Sub4(this, arg0, arg1, var4, var5);
		}
	}

	@ObfuscatedName("Class_ra_Sub3.at()Z")
	public boolean at() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.cb(LModel;IIII)LClass387;")
	public Class387 cb(Model arg0, int arg1, int arg2, int arg3, int arg4) {
		return new Class387_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@ObfuscatedName("Class_ra_Sub3.fv([I)V")
	public void fv(int[] arg0) {
		arg0[0] = this.anInt8621 * 512290825 * 1907727929;
		arg0[1] = this.anInt8623 * 766013039 * -1679642481;
		arg0[2] = this.anInt8635 * -1071049483 * -711985315;
		arg0[3] = this.anInt8624 * 31822541 * -550983163;
	}

	@ObfuscatedName("Class_ra_Sub3.df()V")
	public void df() {
	}

	@ObfuscatedName("Class_ra_Sub3.cn(II[[I[[IIII)LClass_xa;")
	public Class_xa cn(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
		return new Class_xa_Sub3(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("Class_ra_Sub3.cz()LClass249;")
	public Class249 cz() {
		Class6 var1 = this.method5206(Thread.currentThread());
		return var1.aClass249_95;
	}

	@ObfuscatedName("Class_ra_Sub3.cj()LClass247;")
	public Class247 cj() {
		Class6 var1 = this.method5206(Thread.currentThread());
		return var1.aClass247_83;
	}

	@ObfuscatedName("Class_ra_Sub3.cr()I")
	public int cr() {
		return 0;
	}

	@ObfuscatedName("Class_ra_Sub3.ki(IIIIIILClass_ta;IIIII)V")
	public void ki(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Class_ta arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		if (this.anIntArray8630 == null) {
			return;
		}
		Class_ta_Sub3 var13 = (Class_ta_Sub3) arg6;
		int[] var14 = var13.anIntArray8661;
		int[] var15 = var13.anIntArray8662;
		int var16 = this.anInt8623 * 766013039 * -1679642481 > arg8 ? this.anInt8623 * 766013039 * -1679642481 : arg8;
		int var17 = this.anInt8624 * -550983163 * 31822541 < var14.length + arg8 ? this.anInt8624 * -550983163 * 31822541 : var14.length + arg8;
		int var34 = arg11 << 8;
		int var32 = arg9 << 8;
		int var33 = arg10 << 8;
		int var18 = var32 + var33;
		arg11 = var34 % var18;
		arg2 -= arg0;
		arg3 -= arg1;
		int var19;
		int var20;
		if (arg3 + arg2 < 0) {
			var19 = (int) (Math.sqrt((double) (arg3 * arg3 + arg2 * arg2)) * 256.0D);
			var20 = var19 % var18;
			var34 = var32 + var18 - arg11 - var20;
			arg11 = var34 % var18;
			if (arg11 < 0) {
				arg11 += var18;
			}
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		int var21;
		int var22;
		int var23;
		int var24;
		int var25;
		int var26;
		int var27;
		int var29;
		int var30;
		int var31;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			var29 = arg2 << 16;
			var19 = (int) Math.floor((double) var29 / (double) arg3 + 0.5D);
			var20 = (int) Math.sqrt((double) ((var19 >> 8) * (var19 >> 8) + 65536));
			var30 = arg3 + arg1;
			var21 = arg4 >>> 24;
			if (arg5 == 0 || arg5 == 1 && var21 == 255) {
				while (arg1 <= var30) {
					var22 = arg0 >> 16;
					var23 = arg1 - arg8;
					if (arg1 >= var16 && arg1 < var17 && var22 >= this.anInt8621 * 512290825 * 1907727929 && var22 < this.anInt8635 * -711985315 * -1071049483 && arg11 < var32 && var22 >= var14[var23] + arg7 && var22 < var14[var23] + arg7 + var15[var23]) {
						this.anIntArray8630[this.anInt8618 * -29235085 * -1504772933 * arg1 + var22] = arg4;
					}
					arg0 += var19;
					arg1++;
					var34 = arg11 + var20;
					arg11 = var34 % var18;
				}
			} else if (arg5 == 1) {
				var31 = (var21 * (arg4 & 0xFF00FF) >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * var21 >> 8 & 0xFF00) + (var21 << 24);
				var22 = 256 - var21;
				while (arg1 <= var30) {
					var23 = arg0 >> 16;
					var24 = arg1 - arg8;
					if (arg1 >= var16 && arg1 < var17 && var23 >= this.anInt8621 * 512290825 * 1907727929 && var23 < this.anInt8635 * -711985315 * -1071049483 && arg11 < var32 && var23 >= var14[var24] + arg7 && var23 < var15[var24] + var14[var24] + arg7) {
						var25 = var23 + this.anInt8618 * -29235085 * -1504772933 * arg1;
						var26 = this.anIntArray8630[var25];
						var26 = (var22 * (var26 & 0xFF00FF) >> 8 & 0xFF00FF) + (var22 * (var26 & 0xFF00) >> 8 & 0xFF00);
						this.anIntArray8630[this.anInt8618 * -29235085 * -1504772933 * arg1 + var23] = var31 + var26;
					}
					arg0 += var19;
					arg1++;
					var34 = arg11 + var20;
					arg11 = var34 % var18;
				}
			} else if (arg5 == 2) {
				while (arg1 <= var30) {
					var22 = arg0 >> 16;
					var23 = arg1 - arg8;
					if (arg1 >= var16 && arg1 < var17 && var22 >= this.anInt8621 * 512290825 * 1907727929 && var22 < this.anInt8635 * -1071049483 * -711985315 && arg11 < var32 && var22 >= var14[var23] + arg7 && var22 < arg7 + var14[var23] + var15[var23]) {
						var24 = var22 + this.anInt8618 * -1504772933 * -29235085 * arg1;
						var25 = this.anIntArray8630[var24];
						var26 = var25 + arg4;
						var27 = (var25 & 0xFF00FF) + (arg4 & 0xFF00FF);
						var25 = (var27 & 0x1000100) + (var26 - var27 & 0x10000);
						this.anIntArray8630[var24] = var26 - var25 | var25 - (var25 >>> 8);
					}
					arg0 += var19;
					arg1++;
					var34 = arg11 + var20;
					arg11 = var34 % var18;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		var30 = arg3 << 16;
		var19 = (int) Math.floor((double) var30 / (double) arg2 + 0.5D);
		var29 = arg2 + arg0;
		var20 = arg4 >>> 24;
		var21 = (int) Math.sqrt((double) ((var19 >> 8) * (var19 >> 8) + 65536));
		if (arg5 == 0 || arg5 == 1 && var20 == 255) {
			while (arg0 <= var29) {
				var22 = arg1 >> 16;
				var23 = var22 - arg8;
				if (arg0 >= this.anInt8621 * 512290825 * 1907727929 && arg0 < this.anInt8635 * -711985315 * -1071049483 && var22 >= var16 && var22 < var17 && arg11 < var32) {
					var24 = arg7 + var14[var23];
					if (arg0 >= var24 && arg0 < var24 + var15[var23]) {
						this.anIntArray8630[this.anInt8618 * -29235085 * -1504772933 * var22 + arg0] = arg4;
					}
				}
				arg1 += var19;
				arg0++;
				var34 = arg11 + var21;
				arg11 = var34 % var18;
			}
		} else if (arg5 == 1) {
			var31 = ((arg4 & 0xFF00FF) * var20 >> 8 & 0xFF00FF) + (var20 * (arg4 & 0xFF00) >> 8 & 0xFF00) + (var20 << 24);
			var22 = 256 - var20;
			while (arg0 <= var29) {
				var23 = arg1 >> 16;
				var24 = var23 - arg8;
				if (arg0 >= this.anInt8621 * 1907727929 * 512290825 && arg0 < this.anInt8635 * -1071049483 * -711985315 && var23 >= var16 && var23 < var17 && arg11 < var32) {
					var25 = var14[var24] + arg7;
					if (arg0 >= var25 && arg0 < var15[var24] + var25) {
						var26 = var23 * -1504772933 * this.anInt8618 * -29235085 + arg0;
						var27 = this.anIntArray8630[var26];
						int var35 = ((var27 & 0xFF00) * var22 >> 8 & 0xFF00) + ((var27 & 0xFF00FF) * var22 >> 8 & 0xFF00FF);
						this.anIntArray8630[var26] = var35 + var31;
					}
				}
				arg1 += var19;
				arg0++;
				var34 = arg11 + var21;
				arg11 = var34 % var18;
			}
		} else if (arg5 == 2) {
			while (arg0 <= var29) {
				var22 = arg1 >> 16;
				var23 = var22 - arg8;
				if (arg0 >= this.anInt8621 * 512290825 * 1907727929 && arg0 < this.anInt8635 * -1071049483 * -711985315 && var22 >= var16 && var22 < var17 && arg11 < var32) {
					var24 = var14[var23] + arg7;
					if (arg0 >= var24 && arg0 < var24 + var15[var23]) {
						var25 = arg0 + this.anInt8618 * -1504772933 * -29235085 * var22;
						var26 = this.anIntArray8630[var25];
						var27 = var26 + arg4;
						int var28 = (arg4 & 0xFF00FF) + (var26 & 0xFF00FF);
						var26 = (var28 & 0x1000100) + (var27 - var28 & 0x10000);
						this.anIntArray8630[var25] = var27 - var26 | var26 - (var26 >>> 8);
					}
				}
				arg1 += var19;
				arg0++;
				var34 = arg11 + var21;
				arg11 = var34 % var18;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("Class_ra_Sub3.iv()Z")
	public boolean iv() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.jp()LClass76_Sub2;")
	public Class76_Sub2 jp() {
		return new Class76_Sub2_Sub1(this);
	}

	public void method5199(int arg0) {
		this.anInt8650 = arg0;
		this.aClass6Array8647 = new Class6[this.anInt8650];
		for (int var2 = 0; var2 < this.anInt8650; var2++) {
			this.aClass6Array8647[var2] = new Class6(this);
		}
	}

	@ObfuscatedName("Class_ra_Sub3.cm(LClass81;)V")
	public void cm(Class81 arg0) {
		this.method5200(this.anIntArray8630 != null, this.aFloatArray8620 != null, false, arg0);
	}

	public void method5200(boolean arg0, boolean arg1, boolean arg2, Class81 arg3) {
		Class6 var5 = this.method5206(Thread.currentThread());
		for (Class325_Sub3_Sub1 var6 = (Class325_Sub3_Sub1) arg3.aClass461_675.method5694(1464376272); var6 != null; var6 = (Class325_Sub3_Sub1) arg3.aClass461_675.method5695(-938927049)) {
			int var7 = var6.anInt9497 >> 12;
			int var8 = var6.anInt9493 >> 12;
			int var9 = var6.anInt9489 >> 12;
			float var10 = (float) var9 * this.aClass249_8634.aFloatArray2631[10] + this.aClass249_8634.aFloatArray2631[2] * (float) var7 + this.aClass249_8634.aFloatArray2631[6] * (float) var8 + this.aClass249_8634.aFloatArray2631[14];
			float var11 = this.aClass249_8634.aFloatArray2631[15] + this.aClass249_8634.aFloatArray2631[7] * (float) var8 + this.aClass249_8634.aFloatArray2631[3] * (float) var7 + this.aClass249_8634.aFloatArray2631[11] * (float) var9;
			if (!(var10 < -var11)) {
				float var12 = var10 * this.aFloat8637 / var11 + this.aFloat8639;
				if (!(var10 > var5.aFloat87)) {
					float var13 = this.aClass249_8634.aFloatArray2631[8] * (float) var9 + (float) var7 * this.aClass249_8634.aFloatArray2631[0] + (float) var8 * this.aClass249_8634.aFloatArray2631[4] + this.aClass249_8634.aFloatArray2631[12];
					float var14 = (float) var7 * this.aClass249_8634.aFloatArray2631[1] + this.aClass249_8634.aFloatArray2631[5] * (float) var8 + (float) var9 * this.aClass249_8634.aFloatArray2631[9] + this.aClass249_8634.aFloatArray2631[13];
					if (!(var13 < -var11) && !(var13 > var11) && !(var14 < -var11) && !(var14 > var11)) {
						float var15 = (float) var6.anInt9494 / 4096.0F;
						float var16 = this.aClass249_8633.aFloatArray2631[0] * var15 + var13;
						float var17 = var15 * this.aClass249_8633.aFloatArray2631[3] + var11;
						float var18 = var13 * this.aFloat8640 / var11 + this.aFloat8641;
						float var19 = this.aFloat8643 + this.aFloat8642 * var14 / var11;
						float var20 = this.aFloat8641 + this.aFloat8640 * var16 / var17;
						this.method5196(arg0, arg1, arg2, var6, (int) var18, (int) var19, var12, (int) (var20 < var18 ? var18 - var20 : var20 - var18));
					}
				}
			}
		}
	}

	@ObfuscatedName("Class_ra_Sub3.fb(IIIIII[BII)V")
	public void fb(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
		if (this.anIntArray8630 == null || arg2 <= 0 || arg3 <= 0) {
			return;
		}
		int var10 = 0;
		int var11 = 0;
		int var12 = (arg7 << 16) / arg2;
		int var13 = (arg6.length / arg7 << 16) / arg3;
		int var14 = arg1 * this.anInt8618 * -29235085 * -1504772933 + arg0;
		int var15 = this.anInt8618 * -29235085 * -1504772933 - arg2;
		if (arg1 + arg3 > this.anInt8624 * -550983163 * 31822541) {
			arg3 -= arg1 + arg3 - this.anInt8624 * 31822541 * -550983163;
		}
		int var16;
		if (arg1 < this.anInt8623 * 766013039 * -1679642481) {
			var16 = this.anInt8623 * 766013039 * -1679642481 - arg1;
			arg3 -= var16;
			var14 += var16 * -1504772933 * this.anInt8618 * -29235085;
			var11 += var13 * var16;
		}
		if (arg0 + arg2 > this.anInt8635 * -1071049483 * -711985315) {
			var16 = arg0 + arg2 - this.anInt8635 * -1071049483 * -711985315;
			arg2 -= var16;
			var15 += var16;
		}
		if (arg0 < this.anInt8621 * 512290825 * 1907727929) {
			var16 = this.anInt8621 * 1907727929 * 512290825 - arg0;
			arg2 -= var16;
			var14 += var16;
			var10 += var12 * var16;
			var15 += var16;
		}
		var16 = arg4 >>> 24;
		int var17 = arg5 >>> 24;
		int var18;
		int var19;
		int var20;
		int var21;
		if (arg8 == 0 || arg8 == 1 && var16 == 255 && var17 == 255) {
			var18 = var10;
			for (var19 = -arg3; var19 < 0; var19++) {
				var20 = arg7 * (var11 >> 16);
				for (var21 = -arg2; var21 < 0; var21++) {
					if (arg6[(var10 >> 16) + var20] == 0) {
						this.anIntArray8630[var14++] = arg4;
					} else {
						this.anIntArray8630[var14++] = arg5;
					}
					var10 += var12;
				}
				var11 += var13;
				var10 = var18;
				var14 += var15;
			}
			return;
		}
		int var22;
		int var23;
		int var24;
		int var25;
		if (arg8 == 1) {
			var18 = var10;
			for (var19 = -arg3; var19 < 0; var19++) {
				var20 = arg7 * (var11 >> 16);
				for (var21 = -arg2; var21 < 0; var21++) {
					var22 = arg4;
					if (arg6[(var10 >> 16) + var20] != 0) {
						var22 = arg5;
					}
					var23 = var22 >>> 24;
					var24 = 255 - var23;
					var25 = this.anIntArray8630[var14];
					this.anIntArray8630[var14++] = (var23 * (var22 & 0xFF00) + (var25 & 0xFF00) * var24 & 0xFF0000) + (var24 * (var25 & 0xFF00FF) + (var22 & 0xFF00FF) * var23 & 0xFF00FF00) >> 8;
					var10 += var12;
				}
				var11 += var13;
				var10 = var18;
				var14 += var15;
			}
		} else if (arg8 == 2) {
			var18 = var10;
			for (var19 = -arg3; var19 < 0; var19++) {
				var20 = (var11 >> 16) * arg7;
				for (var21 = -arg2; var21 < 0; var21++) {
					var22 = arg4;
					if (arg6[var20 + (var10 >> 16)] != 0) {
						var22 = arg5;
					}
					if (var22 == 0) {
						var14++;
					} else {
						var23 = this.anIntArray8630[var14];
						var24 = var23 + var22;
						var25 = (var22 & 0xFF00FF) + (var23 & 0xFF00FF);
						var23 = (var24 - var25 & 0x10000) + (var25 & 0x1000100);
						this.anIntArray8630[var14++] = var24 - var23 | var23 - (var23 >>> 8);
					}
					var10 += var12;
				}
				var11 += var13;
				var10 = var18;
				var14 += var15;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method5201(boolean arg0, boolean arg1, boolean arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		if (arg6 == 0 || arg7 == 0) {
			return;
		}
		if (arg8 != 65535) {
			Class56 var13 = this.anInterface_ma4227.method221(arg8, -714431671);
			if (!var13.aBoolean533) {
				if (this.anInt8651 != arg8) {
					Class61 var14 = (Class61) this.aClass367_8649.get((long) arg8);
					if (var14 == null) {
						int[] var15 = this.method5209(arg8);
						if (var15 == null) {
							return;
						}
						int var16 = this.anInterface_ma4227.method221(arg8, 1032948580).anInt532;
						var14 = this.method4795(var15, 0, var16, var16, var16, (byte) -128);
						this.aClass367_8649.put(var14, (long) arg8);
					}
					this.anInt8651 = arg8;
					this.aClass61_8631 = var14;
				}
				((Class61_Sub3) this.aClass61_8631).method742(arg0, arg1, arg2, arg3 - arg6, arg4 - arg7, arg5, arg6 << 1, arg7 << 1, arg10, arg9, arg11, 1, Class369.aClass369_6817 != var13.aClass369_524);
				return;
			}
		}
		this.method5210(arg1, arg3, arg4, arg5, arg6, arg9, arg11);
	}

	@ObfuscatedName("Class_ra_Sub3.ha(IIZZ)LClass61;")
	public Class61 ha(int arg0, int arg1, boolean arg2, boolean arg3) {
		return arg2 ? new Class61_Sub3_Sub2(this, arg0, arg1) : new Class61_Sub3_Sub1(this, arg0, arg1);
	}

	@ObfuscatedName("Class_ra_Sub3.RA(Z)V")
	public void RA(boolean arg0) {
		Class6 var2 = this.method5206(Thread.currentThread());
		var2.aBoolean111 = arg0;
	}

	@ObfuscatedName("Class_ra_Sub3.cc(FFFFFF)V")
	public void cc(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
	}

	@ObfuscatedName("Class_ra_Sub3.ci(LClass249;)V")
	public void ci(Class249 arg0) {
		this.aClass249_8633.method2510(arg0);
		this.method5188();
	}

	@ObfuscatedName("Class_ra_Sub3.gz(IIIIII)V")
	public void gz(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (this.anIntArray8630 == null) {
			return;
		}
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.XA(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.XA(arg2 + arg0, arg1, -arg2 + 1, arg4, arg5);
			}
		} else if (arg2 != 0) {
			if (arg3 + arg2 < 0) {
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			int var7;
			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var13;
			int var15;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				int var14 = arg3 << 16;
				var7 = (int) Math.floor((double) var14 / (double) arg2 + 0.5D);
				arg2 += arg0;
				if (arg0 < this.anInt8621 * 512290825 * 1907727929) {
					arg1 += var7 * (this.anInt8621 * 1907727929 * 512290825 - arg0);
					arg0 = this.anInt8621 * 1907727929 * 512290825;
				}
				if (arg2 >= this.anInt8635 * -1071049483 * -711985315) {
					arg2 = this.anInt8635 * -711985315 * -1071049483 - 1;
				}
				var8 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && var8 == 255) {
					while (arg0 <= arg2) {
						var9 = arg1 >> 16;
						if (var9 >= this.anInt8623 * -1679642481 * 766013039 && var9 < this.anInt8624 * -550983163 * 31822541) {
							this.anIntArray8630[var9 * this.anInt8618 * -29235085 * -1504772933 + arg0] = arg4;
						}
						arg1 += var7;
						arg0++;
					}
				} else if (arg5 == 1) {
					var15 = ((arg4 & 0xFF00FF) * var8 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * var8 >> 8 & 0xFF00) + (var8 << 24);
					var9 = 256 - var8;
					while (arg0 <= arg2) {
						var10 = arg1 >> 16;
						if (var10 >= this.anInt8623 * 766013039 * -1679642481 && var10 < this.anInt8624 * 31822541 * -550983163) {
							var11 = arg0 + var10 * this.anInt8618 * -29235085 * -1504772933;
							var12 = this.anIntArray8630[var11];
							int var17 = (var9 * (var12 & 0xFF00FF) >> 8 & 0xFF00FF) + (var9 * (var12 & 0xFF00) >> 8 & 0xFF00);
							this.anIntArray8630[var11] = var17 + var15;
						}
						arg1 += var7;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						var9 = arg1 >> 16;
						if (var9 >= this.anInt8623 * -1679642481 * 766013039 && var9 < this.anInt8624 * -550983163 * 31822541) {
							var10 = arg0 + this.anInt8618 * -29235085 * -1504772933 * var9;
							var11 = this.anIntArray8630[var10];
							var12 = var11 + arg4;
							var13 = (var11 & 0xFF00FF) + (arg4 & 0xFF00FF);
							var11 = (var12 - var13 & 0x10000) + (var13 & 0x1000100);
							this.anIntArray8630[var10] = var12 - var11 | var11 - (var11 >>> 8);
						}
						arg1 += var7;
						arg0++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				int var16 = arg2 << 16;
				var7 = (int) Math.floor((double) var16 / (double) arg3 + 0.5D);
				arg3 += arg1;
				if (arg1 < this.anInt8623 * -1679642481 * 766013039) {
					arg0 += (this.anInt8623 * 766013039 * -1679642481 - arg1) * var7;
					arg1 = this.anInt8623 * 766013039 * -1679642481;
				}
				if (arg3 >= this.anInt8624 * -550983163 * 31822541) {
					arg3 = this.anInt8624 * 31822541 * -550983163 - 1;
				}
				var8 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && var8 == 255) {
					while (arg1 <= arg3) {
						var9 = arg0 >> 16;
						if (var9 >= this.anInt8621 * 512290825 * 1907727929 && var9 < this.anInt8635 * -1071049483 * -711985315) {
							this.anIntArray8630[this.anInt8618 * -1504772933 * -29235085 * arg1 + var9] = arg4;
						}
						arg0 += var7;
						arg1++;
					}
				} else if (arg5 == 1) {
					var15 = ((arg4 & 0xFF00) * var8 >> 8 & 0xFF00) + ((arg4 & 0xFF00FF) * var8 >> 8 & 0xFF00FF) + (var8 << 24);
					var9 = 256 - var8;
					while (arg1 <= arg3) {
						var10 = arg0 >> 16;
						if (var10 >= this.anInt8621 * 512290825 * 1907727929 && var10 < this.anInt8635 * -1071049483 * -711985315) {
							var11 = this.anInt8618 * -1504772933 * -29235085 * arg1 + var10;
							var12 = this.anIntArray8630[var11];
							var12 = (var9 * (var12 & 0xFF00) >> 8 & 0xFF00) + (var9 * (var12 & 0xFF00FF) >> 8 & 0xFF00FF);
							this.anIntArray8630[var10 + this.anInt8618 * -29235085 * -1504772933 * arg1] = var15 + var12;
						}
						arg0 += var7;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						var9 = arg0 >> 16;
						if (var9 >= this.anInt8621 * 512290825 * 1907727929 && var9 < this.anInt8635 * -711985315 * -1071049483) {
							var10 = var9 + this.anInt8618 * -29235085 * -1504772933 * arg1;
							var11 = this.anIntArray8630[var10];
							var12 = arg4 + var11;
							var13 = (var11 & 0xFF00FF) + (arg4 & 0xFF00FF);
							var11 = (var13 & 0x1000100) + (var12 - var13 & 0x10000);
							this.anIntArray8630[var10] = var12 - var11 | var11 - (var11 >>> 8);
						}
						arg0 += var7;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.G(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.G(arg0, arg3 + arg1, -arg3 + 1, arg4, arg5);
		}
	}

	@ObfuscatedName("Class_ra_Sub3.IA(F)V")
	public void IA(float arg0) {
		this.anInt8645 = (int) (arg0 * 65535.0F);
	}

	@ObfuscatedName("Class_ra_Sub3.m(IFFFFF)V")
	public void m(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		this.anInt8628 = (int) (arg1 * 65535.0F);
		this.anInt8646 = (int) (arg2 * 65535.0F);
		float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3));
		this.anInt8625 = (int) (arg3 * 65535.0F / var7);
		this.anInt8626 = (int) (arg4 * 65535.0F / var7);
		this.anInt8627 = (int) (arg5 * 65535.0F / var7);
	}

	@ObfuscatedName("Class_ra_Sub3.J(I)V")
	public void J(int arg0) {
	}

	@ObfuscatedName("Class_ra_Sub3.ho(LClass524;[LClass87_Sub2;Z)LClass263;")
	public Class263 ho(Class524 arg0, Class87_Sub2[] arg1, boolean arg2) {
		int[] var4 = new int[arg1.length];
		int[] var5 = new int[arg1.length];
		boolean var6 = false;
		for (int var7 = 0; var7 < arg1.length; var7++) {
			var4[var7] = arg1[var7].method986();
			var5[var7] = arg1[var7].method994();
			if (arg1[var7].method985()) {
				var6 = true;
			}
		}
		if (arg2) {
			if (var6) {
				return new Class263_Sub2(this, arg0, arg1, var4, var5);
			} else {
				return new Class263_Sub3(this, arg0, arg1, var4, var5);
			}
		} else if (var6) {
			throw new IllegalArgumentException("");
		} else {
			return new Class263_Sub4(this, arg0, arg1, var4, var5);
		}
	}

	@ObfuscatedName("Class_ra_Sub3.gq(IIIIIII)V")
	public void gq(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (this.anIntArray8630 == null) {
			return;
		}
		Class6 var8 = this.method5206(Thread.currentThread());
		Class38 var9 = var8.aClass38_94;
		int var10 = arg2 - arg0;
		int var11 = arg3 - arg1;
		int var12 = var10 >= 0 ? var10 : -var10;
		int var13 = var11 >= 0 ? var11 : -var11;
		int var14 = var12;
		if (var12 < var13) {
			var14 = var13;
		}
		if (var14 == 0) {
			return;
		}
		int var15 = (var10 << 16) / var14;
		int var16 = (var11 << 16) / var14;
		var10 += var15 >> 16;
		var11 += var16 >> 16;
		if (var16 <= var15) {
			var15 = -var15;
		} else {
			var16 = -var16;
		}
		int var17 = var16 * arg5 >> 17;
		int var18 = var16 * arg5 + 1 >> 17;
		int var19 = arg5 * var15 >> 17;
		int var20 = arg5 * var15 + 1 >> 17;
		int var29 = arg0 - var9.method534();
		int var30 = arg1 - var9.method537();
		int var21 = var17 + var29;
		int var22 = var29 - var18;
		int var23 = var10 + var29 - var18;
		int var24 = var10 + var29 + var17;
		int var25 = var19 + var30;
		int var26 = var30 - var20;
		int var27 = var30 + var11 - var20;
		int var28 = var30 + var11 + var19;
		if (arg6 == 0) {
			var9.anInt402 = 0;
		} else if (arg6 == 1) {
			var9.anInt402 = 255 - (arg4 >>> 24);
		} else {
			throw new IllegalArgumentException();
		}
		this.RA(false);
		var9.aBoolean387 = var21 < 0 || var21 > var9.anInt396 * -71748021 * 1568891747 || var22 < 0 || var22 > var9.anInt396 * -71748021 * 1568891747 || var23 < 0 || var23 > var9.anInt396 * -71748021 * 1568891747;
		var9.method539(true, false, false, (float) var25, (float) var26, (float) var27, (float) var21, (float) var22, (float) var23, 100.0F, 100.0F, 100.0F, arg4);
		var9.aBoolean387 = var21 < 0 || var21 > var9.anInt396 * -71748021 * 1568891747 || var23 < 0 || var23 > var9.anInt396 * -71748021 * 1568891747 || var24 < 0 || var24 > var9.anInt396 * -71748021 * 1568891747;
		var9.method539(true, false, false, (float) var25, (float) var27, (float) var28, (float) var21, (float) var23, (float) var24, 100.0F, 100.0F, 100.0F, arg4);
		this.RA(true);
	}

	@ObfuscatedName("Class_ra_Sub3.js(IIII)V")
	public void js(int arg0, int arg1, int arg2, int arg3) {
	}

	@ObfuscatedName("Class_ra_Sub3.cf(LClass92;)V")
	public void cf(Class92 arg0) {
	}

	@ObfuscatedName("Class_ra_Sub3.jw()LClass76_Sub2;")
	public Class76_Sub2 jw() {
		return new Class76_Sub2_Sub1(this);
	}

	@ObfuscatedName("Class_ra_Sub3.iq(IIIIII)LClass92;")
	public Class92 iq(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return null;
	}

	@ObfuscatedName("Class_ra_Sub3.cg()Z")
	public boolean cg() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.ky()Z")
	public boolean ky() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.by(IIIIIII)V")
	public void by(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (this.anIntArray8630 == null) {
			return;
		}
		Class6 var8 = this.method5206(Thread.currentThread());
		Class38 var9 = var8.aClass38_94;
		int var10 = arg2 - arg0;
		int var11 = arg3 - arg1;
		int var12 = var10 >= 0 ? var10 : -var10;
		int var13 = var11 >= 0 ? var11 : -var11;
		int var14 = var12;
		if (var12 < var13) {
			var14 = var13;
		}
		if (var14 == 0) {
			return;
		}
		int var15 = (var10 << 16) / var14;
		int var16 = (var11 << 16) / var14;
		var10 += var15 >> 16;
		var11 += var16 >> 16;
		if (var16 <= var15) {
			var15 = -var15;
		} else {
			var16 = -var16;
		}
		int var17 = var16 * arg5 >> 17;
		int var18 = var16 * arg5 + 1 >> 17;
		int var19 = arg5 * var15 >> 17;
		int var20 = arg5 * var15 + 1 >> 17;
		int var29 = arg0 - var9.method534();
		int var30 = arg1 - var9.method537();
		int var21 = var17 + var29;
		int var22 = var29 - var18;
		int var23 = var10 + var29 - var18;
		int var24 = var10 + var29 + var17;
		int var25 = var19 + var30;
		int var26 = var30 - var20;
		int var27 = var30 + var11 - var20;
		int var28 = var30 + var11 + var19;
		if (arg6 == 0) {
			var9.anInt402 = 0;
		} else if (arg6 == 1) {
			var9.anInt402 = 255 - (arg4 >>> 24);
		} else {
			throw new IllegalArgumentException();
		}
		this.RA(false);
		var9.aBoolean387 = var21 < 0 || var21 > var9.anInt396 || var22 < 0 || var22 > var9.anInt396 || var23 < 0 || var23 > var9.anInt396;
		var9.method539(true, false, false, (float) var25, (float) var26, (float) var27, (float) var21, (float) var22, (float) var23, 100.0F, 100.0F, 100.0F, arg4);
		var9.aBoolean387 = var21 < 0 || var21 > var9.anInt396 || var23 < 0 || var23 > var9.anInt396 || var24 < 0 || var24 > var9.anInt396;
		var9.method539(true, false, false, (float) var25, (float) var27, (float) var28, (float) var21, (float) var23, (float) var24, 100.0F, 100.0F, 100.0F, arg4);
		this.RA(true);
	}

	@ObfuscatedName("Class_ra_Sub3.ja(ILClass77;)V")
	public void ja(int arg0, Class77 arg1) {
		for (int var3 = 0; var3 < this.aClass6Array8647.length; var3++) {
			this.aClass6Array8647[var3].anInt90 = this.aClass6Array8647[var3].anInt88 * 428165519 * -1381026891 * 1394455919 * 536502941;
			this.aClass6Array8647[var3].anInt92 = arg0 * 1365791405 * 579526949;
			this.aClass6Array8647[var3].anInt88 = arg1.anInt652 * -1037349593 * -194741821 * 536502941;
			this.aClass6Array8647[var3].anInt93 = arg1.anInt650 * -2010008277 * -2137611395 * -1466095361;
			this.aClass6Array8647[var3].aBoolean91 = true;
		}
	}

	@ObfuscatedName("Class_ra_Sub3.ac()Z")
	public boolean ac() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.dz(ILClass77;)V")
	public void dz(int arg0, Class77 arg1) {
		Class6 var3 = this.method5206(Thread.currentThread());
		var3.anInt92 = arg0;
		var3.anInt88 = arg1.anInt652;
		var3.anInt93 = arg1.anInt650;
	}

	@ObfuscatedName("Class_ra_Sub3.cu()Z")
	public boolean cu() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.bk(IIFIIFIIFIIII)V")
	public void bk(int arg0, int arg1, float arg2, int arg3, int arg4, float arg5, int arg6, int arg7, float arg8, int arg9, int arg10, int arg11, int arg12) {
		boolean var14 = this.anIntArray8630 != null;
		boolean var15 = this.aFloatArray8620 != null;
		if (!var14 && !var15) {
			return;
		}
		Class6 var16 = this.method5206(Thread.currentThread());
		Class38 var17 = var16.aClass38_94;
		var17.aBoolean384 = false;
		int var19 = arg0 - this.anInt8621;
		int var21 = arg3 - this.anInt8621;
		int var23 = arg6 - this.anInt8621;
		int var20 = arg1 - this.anInt8623;
		int var22 = arg4 - this.anInt8623;
		int var24 = arg7 - this.anInt8623;
		var17.aBoolean387 = var19 < 0 || var19 > var17.anInt396 || var21 < 0 || var21 > var17.anInt396 || var23 < 0 || var23 > var17.anInt396;
		int var18 = arg9 >>> 24;
		if (arg12 == 0 || arg12 == 1 && var18 == 255) {
			var17.anInt402 = 0;
			var17.aBoolean383 = false;
			var17.method538(var14, var15, false, (float) var20, (float) var22, (float) var24, (float) var19, (float) var21, (float) var23, arg2, arg5, arg8, arg9, arg10, arg11);
		} else if (arg12 == 1) {
			var17.anInt402 = 255 - var18;
			var17.aBoolean383 = false;
			var17.method538(var14, var15, false, (float) var20, (float) var22, (float) var24, (float) var19, (float) var21, (float) var23, arg2, arg5, arg8, arg9, arg10, arg11);
		} else if (arg12 == 2) {
			var17.anInt402 = 128;
			var17.aBoolean383 = true;
			var17.method538(var14, var15, false, (float) var20, (float) var22, (float) var24, (float) var19, (float) var21, (float) var23, arg2, arg5, arg8, arg9, arg10, arg11);
		} else {
			throw new IllegalArgumentException();
		}
		var17.aBoolean384 = true;
	}

	public void method_do(float arg0, float arg1, float arg2, float[] arg3) {
		float var5 = this.aClass249_8634.aFloatArray2631[7] * arg1 + this.aClass249_8634.aFloatArray2631[15] + this.aClass249_8634.aFloatArray2631[3] * arg0 + this.aClass249_8634.aFloatArray2631[11] * arg2;
		float var6 = this.aClass249_8634.aFloatArray2631[12] + arg0 * this.aClass249_8634.aFloatArray2631[0] + this.aClass249_8634.aFloatArray2631[4] * arg1 + arg2 * this.aClass249_8634.aFloatArray2631[8];
		float var7 = this.aClass249_8634.aFloatArray2631[5] * arg1 + this.aClass249_8634.aFloatArray2631[1] * arg0 + this.aClass249_8634.aFloatArray2631[13] + arg2 * this.aClass249_8634.aFloatArray2631[9];
		float var8 = arg1 * this.aClass249_8632.aFloatArray2631[6] + this.aClass249_8632.aFloatArray2631[14] + arg0 * this.aClass249_8632.aFloatArray2631[2] + this.aClass249_8632.aFloatArray2631[10] * arg2;
		arg3[0] = this.aFloat8641 + this.aFloat8640 * var6 / var5;
		arg3[1] = this.aFloat8642 * var7 / var5 + this.aFloat8643;
		arg3[2] = var8;
	}

	@ObfuscatedName("Class_ra_Sub3.hp(II[[I[[IIII)LClass_xa;")
	public Class_xa hp(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
		return new Class_xa_Sub3(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("Class_ra_Sub3.ag()LClass76_Sub2;")
	public Class76_Sub2 ag() {
		return new Class76_Sub2_Sub1(this);
	}

	public Interface8_Impl1_Impl2 method5202(int arg0, int arg1) {
		return new Class12(arg0, arg1);
	}

	@ObfuscatedName("Class_ra_Sub3.az(IILClass72;LClass86;I)LInterface8_Impl1_Impl2;")
	public Interface8_Impl1_Impl2 az(int arg0, int arg1, Class72 arg2, Class86 arg3, int arg4) {
		return this.method5202(arg0, arg1);
	}

	@ObfuscatedName("Class_ra_Sub3.fl([I)V")
	public void fl(int[] arg0) {
		arg0[0] = this.anInt8621 * 512290825 * 1907727929;
		arg0[1] = this.anInt8623 * 766013039 * -1679642481;
		arg0[2] = this.anInt8635 * -1071049483 * -711985315;
		arg0[3] = this.anInt8624 * 31822541 * -550983163;
	}

	@ObfuscatedName("Class_ra_Sub3.dt()LClass51;")
	public Class51 dt() {
		return new Class51(0, "Pure Java", 1, "CPU", 0L);
	}

	@ObfuscatedName("Class_ra_Sub3.dq()LClass51;")
	public Class51 dq() {
		return new Class51(0, "Pure Java", 1, "CPU", 0L);
	}

	@ObfuscatedName("Class_ra_Sub3.dv(II)V")
	public void dv(int arg0, int arg1) throws Exception_Sub1 {
		this.aClass76_Sub1_4234.method883(arg0, arg1);
		if (this.anInterface_ma4227 != null) {
			this.anInterface_ma4227.method224((short) 9872);
		}
	}

	@ObfuscatedName("Class_ra_Sub3.jk()LClass76_Sub2;")
	public Class76_Sub2 jk() {
		return new Class76_Sub2_Sub1(this);
	}

	@ObfuscatedName("Class_ra_Sub3.dj(II)V")
	public void dj(int arg0, int arg1) throws Exception_Sub1 {
		this.aClass76_Sub1_4234.method883(arg0, arg1);
		if (this.anInterface_ma4227 != null) {
			this.anInterface_ma4227.method224((short) -2280);
		}
	}

	@ObfuscatedName("Class_ra_Sub3.dl(II)V")
	public void dl(int arg0, int arg1) throws Exception_Sub1 {
		this.aClass76_Sub1_4234.method883(arg0, arg1);
		if (this.anInterface_ma4227 != null) {
			this.anInterface_ma4227.method224((short) -5235);
		}
	}

	@ObfuscatedName("Class_ra_Sub3.dm(II)V")
	public void dm(int arg0, int arg1) throws Exception_Sub1 {
		this.aClass76_Sub1_4234.method883(arg0, arg1);
		if (this.anInterface_ma4227 != null) {
			this.anInterface_ma4227.method224((short) -8253);
		}
	}

	@ObfuscatedName("Class_ra_Sub3.dy()V")
	public void dy() {
	}

	@ObfuscatedName("Class_ra_Sub3.dx()V")
	public void dx() {
	}

	@ObfuscatedName("Class_ra_Sub3.dd()V")
	public void dd() {
		if (this.aBoolean8616) {
			Class95_Sub12.method1137(true, false, -989563379);
			this.aBoolean8616 = false;
		}
		this.aBoolean8648 = true;
	}

	@ObfuscatedName("Class_ra_Sub3.v()Z")
	public boolean v() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.ex()Z")
	public boolean ex() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.di()V")
	public void di() {
		if (this.aBoolean8616) {
			Class95_Sub12.method1137(true, false, -1644503685);
			this.aBoolean8616 = false;
		}
		this.aBoolean8648 = true;
	}

	@ObfuscatedName("Class_ra_Sub3.ch(II[I[I)LClass_ta;")
	public Class_ta ch(int arg0, int arg1, int[] arg2, int[] arg3) {
		return new Class_ta_Sub3(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("Class_ra_Sub3.dw(I)V")
	public void dw(int arg0) {
		int var2 = arg0 - this.anInt8615 * -2005538129 * 79801423;
		for (Class330_Sub13 var3 = (Class330_Sub13) this.aClass367_8644.method4287(-597749787); var3 != null; var3 = (Class330_Sub13) this.aClass367_8644.method4291(-1947425629)) {
			if (var3.aBoolean7602) {
				var3.anInt7604 += var2;
				int var4 = var3.anInt7604 / 50;
				if (var4 > 0) {
					Class56 var5 = this.anInterface_ma4227.method221(var3.anInt7601, -987025858);
					float var6 = (float) (var5.anInt532 * -1963453415 * -1086060503);
					var3.method3310((int) (var6 * ((float) var2 / 1000.0F * (float) var5.aByte531 / 64.0F)), (int) ((float) var5.aByte530 * ((float) var2 / 1000.0F) / 64.0F * var6));
					var3.anInt7604 -= var4 * 50;
				}
				var3.aBoolean7602 = false;
			}
		}
		this.anInt8615 = arg0 * 79801423 * -2005538129;
		this.aClass367_8649.method4292(5, (byte) 37);
		this.aClass367_8644.method4292(5, (byte) 53);
	}

	@ObfuscatedName("Class_ra_Sub3.ed()Z")
	public boolean ed() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.ar(IIII)[I")
	public int[] ar(int arg0, int arg1, int arg2, int arg3) {
		if (this.anIntArray8630 == null) {
			throw new IllegalStateException("");
		}
		int[] var5 = new int[arg2 * arg3];
		int var6 = 0;
		for (int var7 = 0; var7 < arg3; var7++) {
			int var8 = (var7 + arg1) * this.anInt8618 + arg0;
			for (int var9 = 0; var9 < arg2; var9++) {
				var5[var6++] = this.anIntArray8630[var9 + var8];
			}
		}
		return var5;
	}

	@ObfuscatedName("Class_ra_Sub3.au()V")
	public void au() {
		this.anInt8636 = 0;
		this.anInt8622 = 0;
		this.anInt8638 = this.anInt8618;
		this.anInt8614 = this.anInt8619;
		this.method5195();
	}

	@ObfuscatedName("Class_ra_Sub3.dc(II)V")
	public void dc(int arg0, int arg1) throws Exception_Sub1 {
		this.aClass76_Sub1_4234.method883(arg0, arg1);
		if (this.anInterface_ma4227 != null) {
			this.anInterface_ma4227.method224((short) 27937);
		}
	}

	@ObfuscatedName("Class_ra_Sub3.iu(LClass92;LClass92;FLClass92;)LClass92;")
	public Class92 iu(Class92 arg0, Class92 arg1, float arg2, Class92 arg3) {
		return null;
	}

	@ObfuscatedName("Class_ra_Sub3.ea()Z")
	public boolean ea() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.av(III)LInterface8_Impl1_Impl1;")
	public Interface8_Impl1_Impl1 av(int arg0, int arg1, int arg2) {
		return new Class43(arg0, arg1);
	}

	@ObfuscatedName("Class_ra_Sub3.hr(ILClass_ta;II)V")
	public void hr(int arg0, Class_ta arg1, int arg2, int arg3) {
		if (this.anIntArray8630 == null) {
			return;
		}
		Class_ta_Sub3 var5 = (Class_ta_Sub3) arg1;
		int[] var6 = var5.anIntArray8661;
		int[] var7 = var5.anIntArray8662;
		int var8;
		if (this.anInt8624 * -550983163 * 31822541 < var6.length + arg3) {
			var8 = this.anInt8624 * 31822541 * -550983163 - arg3;
		} else {
			var8 = var6.length;
		}
		int var9;
		if (this.anInt8623 * -1679642481 * 766013039 > arg3) {
			var9 = this.anInt8623 * -1679642481 * 766013039 - arg3;
			arg3 = this.anInt8623 * -1679642481 * 766013039;
		} else {
			var9 = 0;
		}
		if (var8 - var9 <= 0) {
			return;
		}
		int var10 = this.anInt8618 * -1504772933 * -29235085 * arg3;
		for (int var11 = var9; var11 < var8; var11++) {
			int var12 = var6[var11] + arg2;
			int var13 = var7[var11];
			if (this.anInt8621 * 1907727929 * 512290825 > var12) {
				var13 -= this.anInt8621 * 512290825 * 1907727929 - var12;
				var12 = this.anInt8621 * 1907727929 * 512290825;
			}
			if (this.anInt8635 * -1071049483 * -711985315 < var12 + var13) {
				var13 = this.anInt8635 * -1071049483 * -711985315 - var12;
			}
			var12 += var10;
			for (int var14 = -var13; var14 < 0; var14++) {
				this.anIntArray8630[var12++] = arg0;
			}
			var10 += this.anInt8618 * -29235085 * -1504772933;
		}
	}

	@ObfuscatedName("Class_ra_Sub3.el()Z")
	public boolean el() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.ku()Z")
	public boolean ku() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.eh()Z")
	public boolean eh() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.kn(LClass81;)V")
	public void kn(Class81 arg0) {
		this.method5200(this.anIntArray8630 != null, this.aFloatArray8620 != null, false, arg0);
	}

	@ObfuscatedName("Class_ra_Sub3.er()Z")
	public boolean er() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.ib(III)V")
	public void ib(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.aClass6Array8647.length; var4++) {
			Class6 var5 = this.aClass6Array8647[var4];
			var5.anInt88 = (arg0 & 0xFFFFFF) * -1381026891 * 536502941;
			int var6 = var5.anInt88 * -1381026891 * 536502941 >>> 16 & 0xFF;
			if (var6 < 2) {
				var6 = 2;
			}
			int var7 = var5.anInt88 * 536502941 * -1381026891 >> 8 & 0xFF;
			if (var7 < 2) {
				var7 = 2;
			}
			int var8 = var5.anInt88 * -1381026891 * 536502941 & 0xFF;
			if (var8 < 2) {
				var8 = 2;
			}
			var5.anInt88 = (var6 << 16 | var7 << 8 | var8) * -1381026891 * 536502941;
			if (arg1 < 0) {
				var5.aBoolean86 = false;
			} else {
				var5.aBoolean86 = true;
			}
		}
	}

	@ObfuscatedName("Class_ra_Sub3.ee()Z")
	public boolean ee() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.ez()Z")
	public boolean ez() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.ev()Z")
	public boolean ev() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.ep()Z")
	public boolean ep() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.hk(IIIIZ)LClass61;")
	public Class61 hk(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		if (this.anIntArray8630 == null) {
			throw new IllegalStateException("");
		}
		int[] var6 = new int[arg3 * arg2];
		int var7 = arg0 + arg1 * this.anInt8618 * -29235085 * -1504772933;
		int var8 = this.anInt8618 * -29235085 * -1504772933 - arg2;
		for (int var9 = 0; var9 < arg3; var9++) {
			int var10 = var9 * arg2;
			for (int var11 = 0; var11 < arg2; var11++) {
				var6[var11 + var10] = this.anIntArray8630[var7++];
			}
			var7 += var8;
		}
		if (arg4) {
			return new Class61_Sub3_Sub2(this, var6, arg2, arg3);
		} else {
			return new Class61_Sub3_Sub1(this, var6, arg2, arg3);
		}
	}

	@ObfuscatedName("Class_ra_Sub3.et()Z")
	public boolean et() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.ey()Z")
	public boolean ey() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.eq()Z")
	public boolean eq() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.ek()Z")
	public boolean ek() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.eg()Z")
	public boolean eg() {
		return true;
	}

	@ObfuscatedName("Class_ra_Sub3.cy(I)V")
	public void cy(int arg0) {
		Class387_Sub3.anInt8222 = arg0;
		Class387_Sub3.anInt8166 = arg0;
		if (this.anInt8650 > 1) {
			throw new IllegalStateException();
		}
		this.method5199(this.anInt8650);
		this.method5208(0);
	}

	@ObfuscatedName("Class_ra_Sub3.ef(Z)V")
	public void ef(boolean arg0) {
	}

	@ObfuscatedName("Class_ra_Sub3.eu(Z)V")
	public void eu(boolean arg0) {
	}

	@ObfuscatedName("Class_ra_Sub3.es(Ljava/awt/Canvas;II)LClass76_Sub1;")
	public Class76_Sub1 es(Canvas arg0, int arg1, int arg2) {
		return Class330_Sub26.method3394(this, arg0, arg1, arg2, 87336488);
	}

	@ObfuscatedName("Class_ra_Sub3.fu(Ljava/awt/Canvas;II)LClass76_Sub1;")
	public Class76_Sub1 fu(Canvas arg0, int arg1, int arg2) {
		return Class330_Sub26.method3394(this, arg0, arg1, arg2, 1346063531);
	}

	@ObfuscatedName("Class_ra_Sub3.ft(Ljava/awt/Canvas;II)LClass76_Sub1;")
	public Class76_Sub1 ft(Canvas arg0, int arg1, int arg2) {
		return Class330_Sub26.method3394(this, arg0, arg1, arg2, -79830240);
	}

	public void method5203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (this.anIntArray8630 == null || arg1 < this.anInt8623 || arg1 >= this.anInt8624) {
			return;
		}
		int var9 = arg0 + arg1 * this.anInt8618;
		int var10 = arg3 >>> 24;
		int var11 = arg5 + arg6;
		int var12 = arg7 % var11;
		int var13;
		if (arg4 == 0 || arg4 == 1 && var10 == 255) {
			var13 = 0;
			while (var13 < arg2) {
				if (arg0 + var13 >= this.anInt8621 && arg0 + var13 < this.anInt8635 && var12 < arg5) {
					this.anIntArray8630[var13 + var9] = arg3;
				}
				var13++;
				var12++;
				var12 %= var11;
			}
			return;
		}
		int var14;
		int var15;
		if (arg4 == 1) {
			int var17 = ((arg3 & 0xFF00) * var10 >> 8 & 0xFF00) + (var10 * (arg3 & 0xFF00FF) >> 8 & 0xFF00FF) + (var10 << 24);
			var13 = 256 - var10;
			var14 = 0;
			while (var14 < arg2) {
				if (arg0 + var14 >= this.anInt8621 && arg0 + var14 < this.anInt8635 && var12 < arg5) {
					var15 = this.anIntArray8630[var9 + var14];
					int var18 = (var13 * (var15 & 0xFF00FF) >> 8 & 0xFF00FF) + ((var15 & 0xFF00) * var13 >> 8 & 0xFF00);
					this.anIntArray8630[var9 + var14] = var18 + var17;
				}
				var14++;
				var12++;
				var12 %= var11;
			}
		} else if (arg4 == 2) {
			var13 = 0;
			while (var13 < arg2) {
				if (var13 + arg0 >= this.anInt8621 && var13 + arg0 < this.anInt8635 && var12 < arg5) {
					var14 = this.anIntArray8630[var13 + var9];
					var15 = arg3 + var14;
					int var16 = (var14 & 0xFF00FF) + (arg3 & 0xFF00FF);
					var14 = (var15 - var16 & 0x10000) + (var16 & 0x1000100);
					this.anIntArray8630[var9 + var13] = var15 - var14 | var14 - (var14 >>> 8);
				}
				var13++;
				var12++;
				var12 %= var11;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("Class_ra_Sub3.eb()Z")
	public boolean eb() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.fm(IIII)[I")
	public int[] fm(int arg0, int arg1, int arg2, int arg3) {
		if (this.anIntArray8630 == null) {
			throw new IllegalStateException("");
		}
		int[] var5 = new int[arg2 * arg3];
		int var6 = 0;
		for (int var7 = 0; var7 < arg3; var7++) {
			int var8 = (var7 + arg1) * this.anInt8618 * -29235085 * -1504772933 + arg0;
			for (int var9 = 0; var9 < arg2; var9++) {
				var5[var6++] = this.anIntArray8630[var9 + var8];
			}
		}
		return var5;
	}

	@ObfuscatedName("Class_ra_Sub3.fr()V")
	public void fr() {
	}

	public void method5204(int[] arg0) {
		arg0[0] = this.anInt8618 * -29235085 * -1504772933;
		arg0[1] = this.anInt8619 * 1229852533 * 1870465245;
	}

	public void method5205(int[] arg0) {
		arg0[0] = this.anInt8618 * -29235085 * -1504772933;
		arg0[1] = this.anInt8619 * 1229852533 * 1870465245;
	}

	@ObfuscatedName("Class_ra_Sub3.je(ILClass77;)V")
	public void je(int arg0, Class77 arg1) {
		Class6 var3 = this.method5206(Thread.currentThread());
		var3.anInt92 = arg0 * 1365791405 * 579526949;
		var3.anInt88 = arg1.anInt652 * -194741821 * -1037349593 * 536502941;
		var3.anInt93 = arg1.anInt650 * -2137611395 * -2010008277 * -1466095361;
	}

	@ObfuscatedName("Class_ra_Sub3.de()V")
	public void de() {
		if (this.aBoolean8616) {
			Class95_Sub12.method1137(true, false, -1033810037);
			this.aBoolean8616 = false;
		}
		this.aBoolean8648 = true;
	}

	@ObfuscatedName("Class_ra_Sub3.ln()I")
	public int ln() {
		return 0;
	}

	@ObfuscatedName("Class_ra_Sub3.fj(IIII)V")
	public void fj(int arg0, int arg1, int arg2, int arg3) {
		this.anInt8636 = arg0 * 1238685301 * 960350685;
		this.anInt8622 = arg1 * -780345205 * 1359775523;
		this.anInt8638 = arg2 * -1098702653 * 52203499;
		this.anInt8614 = arg3 * 1394695071 * 1426128991;
		this.method5195();
	}

	@ObfuscatedName("Class_ra_Sub3.fa(IIII)V")
	public void fa(int arg0, int arg1, int arg2, int arg3) {
		this.anInt8636 = arg0 * 1238685301 * 960350685;
		this.anInt8622 = arg1 * -780345205 * 1359775523;
		this.anInt8638 = arg2 * -1098702653 * 52203499;
		this.anInt8614 = arg3 * 1394695071 * 1426128991;
		this.method5195();
	}

	@ObfuscatedName("Class_ra_Sub3.fz(FF)V")
	public void fz(float arg0, float arg1) {
		this.aFloat8637 = arg1 - arg0;
		this.aFloat8639 = arg0 + arg1 - 1.0F;
		for (int var3 = 0; var3 < this.anInt8650 * -595900225 * -76798145; var3++) {
			Class6 var4 = this.aClass6Array8647[var3];
			Class38 var5 = var4.aClass38_94;
			var5.aFloat395 = this.aFloat8637;
			var5.aFloat394 = this.aFloat8639;
		}
	}

	@ObfuscatedName("Class_ra_Sub3.ew()Z")
	public boolean ew() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.fy(IIII)V")
	public void fy(int arg0, int arg1, int arg2, int arg3) {
		if (this.anInt8621 * 512290825 * 1907727929 < arg0) {
			this.anInt8621 = arg0 * 1907727929 * 512290825;
		}
		if (this.anInt8623 * 766013039 * -1679642481 < arg1) {
			this.anInt8623 = arg1 * 766013039 * -1679642481;
		}
		if (this.anInt8635 * -711985315 * -1071049483 > arg2) {
			this.anInt8635 = arg2 * -711985315 * -1071049483;
		}
		if (this.anInt8624 * 31822541 * -550983163 > arg3) {
			this.anInt8624 = arg3 * -550983163 * 31822541;
		}
		this.method5195();
	}

	@ObfuscatedName("Class_ra_Sub3.fe(IIII)V")
	public void fe(int arg0, int arg1, int arg2, int arg3) {
		if (this.anInt8621 * 512290825 * 1907727929 < arg0) {
			this.anInt8621 = arg0 * 1907727929 * 512290825;
		}
		if (this.anInt8623 * 766013039 * -1679642481 < arg1) {
			this.anInt8623 = arg1 * 766013039 * -1679642481;
		}
		if (this.anInt8635 * -711985315 * -1071049483 > arg2) {
			this.anInt8635 = arg2 * -711985315 * -1071049483;
		}
		if (this.anInt8624 * 31822541 * -550983163 > arg3) {
			this.anInt8624 = arg3 * -550983163 * 31822541;
		}
		this.method5195();
	}

	public Class6 method5206(Runnable arg0) {
		for (int var2 = 0; var2 < this.anInt8650; var2++) {
			if (this.aClass6Array8647[var2].aRunnable101 == arg0) {
				return this.aClass6Array8647[var2];
			}
		}
		return null;
	}

	@ObfuscatedName("Class_ra_Sub3.gf(IIIIII)I")
	public int gf(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 0;
		float var8 = this.aClass249_8634.aFloatArray2631[10] * (float) arg2 + (float) arg0 * this.aClass249_8634.aFloatArray2631[2] + this.aClass249_8634.aFloatArray2631[14] + this.aClass249_8634.aFloatArray2631[6] * (float) arg1;
		float var9 = this.aClass249_8634.aFloatArray2631[2] * (float) arg3 + this.aClass249_8634.aFloatArray2631[14] + this.aClass249_8634.aFloatArray2631[6] * (float) arg4 + this.aClass249_8634.aFloatArray2631[10] * (float) arg5;
		float var10 = (float) arg1 * this.aClass249_8634.aFloatArray2631[7] + (float) arg0 * this.aClass249_8634.aFloatArray2631[3] + this.aClass249_8634.aFloatArray2631[15] + (float) arg2 * this.aClass249_8634.aFloatArray2631[11];
		float var11 = (float) arg4 * this.aClass249_8634.aFloatArray2631[7] + this.aClass249_8634.aFloatArray2631[3] * (float) arg3 + this.aClass249_8634.aFloatArray2631[15] + this.aClass249_8634.aFloatArray2631[11] * (float) arg5;
		if (var8 < -var10 && var9 < -var11) {
			var7 |= 0x10;
		} else if (var8 > var10 && var9 > var11) {
			var7 |= 0x20;
		}
		float var12 = (float) arg1 * this.aClass249_8634.aFloatArray2631[4] + this.aClass249_8634.aFloatArray2631[12] + (float) arg0 * this.aClass249_8634.aFloatArray2631[0] + this.aClass249_8634.aFloatArray2631[8] * (float) arg2;
		float var13 = (float) arg4 * this.aClass249_8634.aFloatArray2631[4] + this.aClass249_8634.aFloatArray2631[12] + (float) arg3 * this.aClass249_8634.aFloatArray2631[0] + this.aClass249_8634.aFloatArray2631[8] * (float) arg5;
		if (var12 < -var10 && var13 < -var11) {
			var7 |= 0x1;
		}
		if (var12 > var10 && var13 > var11) {
			var7 |= 0x2;
		}
		float var14 = (float) arg0 * this.aClass249_8634.aFloatArray2631[1] + this.aClass249_8634.aFloatArray2631[13] + (float) arg1 * this.aClass249_8634.aFloatArray2631[5] + this.aClass249_8634.aFloatArray2631[9] * (float) arg2;
		float var15 = this.aClass249_8634.aFloatArray2631[9] * (float) arg5 + this.aClass249_8634.aFloatArray2631[5] * (float) arg4 + this.aClass249_8634.aFloatArray2631[1] * (float) arg3 + this.aClass249_8634.aFloatArray2631[13];
		if (var14 < -var10 && var15 < -var11) {
			var7 |= 0x4;
		}
		if (var14 > var10 && var15 > var11) {
			var7 |= 0x8;
		}
		return var7;
	}

	@ObfuscatedName("Class_ra_Sub3.dk(I)V")
	public void dk(int arg0) {
		int var2 = arg0 - this.anInt8615 * -2005538129 * 79801423;
		for (Class330_Sub13 var3 = (Class330_Sub13) this.aClass367_8644.method4287(-597749787); var3 != null; var3 = (Class330_Sub13) this.aClass367_8644.method4291(-1947425629)) {
			if (var3.aBoolean7602) {
				var3.anInt7604 += var2;
				int var4 = var3.anInt7604 / 50;
				if (var4 > 0) {
					Class56 var5 = this.anInterface_ma4227.method221(var3.anInt7601, -495242425);
					float var6 = (float) (var5.anInt532 * -1963453415 * -1086060503);
					var3.method3310((int) (var6 * ((float) var2 / 1000.0F * (float) var5.aByte531 / 64.0F)), (int) ((float) var5.aByte530 * ((float) var2 / 1000.0F) / 64.0F * var6));
					var3.anInt7604 -= var4 * 50;
				}
				var3.aBoolean7602 = false;
			}
		}
		this.anInt8615 = arg0 * 79801423 * -2005538129;
		this.aClass367_8649.method4292(5, (byte) 37);
		this.aClass367_8644.method4292(5, (byte) 64);
	}

	@ObfuscatedName("Class_ra_Sub3.ff([I)V")
	public void ff(int[] arg0) {
		arg0[0] = this.anInt8621 * 512290825 * 1907727929;
		arg0[1] = this.anInt8623 * 766013039 * -1679642481;
		arg0[2] = this.anInt8635 * -1071049483 * -711985315;
		arg0[3] = this.anInt8624 * 31822541 * -550983163;
	}

	@ObfuscatedName("Class_ra_Sub3.fi(II)V")
	public void fi(int arg0, int arg1) {
		if ((arg0 & 0x1) != 0) {
			this.B(0, 0, this.anInt8618 * -29235085 * -1504772933, this.anInt8619 * 1229852533 * 1870465245, arg1, 0);
		}
		if ((arg0 & 0x2) != 0) {
			this.method5197();
		}
	}

	@ObfuscatedName("Class_ra_Sub3.fn(II)V")
	public void fn(int arg0, int arg1) {
		if ((arg0 & 0x1) != 0) {
			this.B(0, 0, this.anInt8618 * -29235085 * -1504772933, this.anInt8619 * 1229852533 * 1870465245, arg1, 0);
		}
		if ((arg0 & 0x2) != 0) {
			this.method5197();
		}
	}

	@ObfuscatedName("Class_ra_Sub3.fd(IIIIII)V")
	public void fd(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (this.anIntArray8630 == null) {
			return;
		}
		if (arg0 < this.anInt8621 * 1907727929 * 512290825) {
			arg2 -= this.anInt8621 * 1907727929 * 512290825 - arg0;
			arg0 = this.anInt8621 * 512290825 * 1907727929;
		}
		if (arg1 < this.anInt8623 * 766013039 * -1679642481) {
			arg3 -= this.anInt8623 * 766013039 * -1679642481 - arg1;
			arg1 = this.anInt8623 * -1679642481 * 766013039;
		}
		if (arg2 + arg0 > this.anInt8635 * -711985315 * -1071049483) {
			arg2 = this.anInt8635 * -1071049483 * -711985315 - arg0;
		}
		if (arg1 + arg3 > this.anInt8624 * -550983163 * 31822541) {
			arg3 = this.anInt8624 * 31822541 * -550983163 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt8635 * -1071049483 * -711985315 || arg1 > this.anInt8624 * -550983163 * 31822541) {
			return;
		}
		int var7 = this.anInt8618 * -29235085 * -1504772933 - arg2;
		int var8 = arg0 + arg1 * -1504772933 * this.anInt8618 * -29235085;
		int var9 = arg4 >>> 24;
		int var10;
		int var11;
		int var12;
		if (arg5 != 0 && (arg5 != 1 || var9 != 255)) {
			int var13;
			if (arg5 == 1) {
				int var15 = ((arg4 >>> 8 & 0xFF00FF) * var9 & 0xFF00FF00) + (var9 * (arg4 & 0xFF00FF) >> 8 & 0xFF00FF);
				var10 = 256 - var9;
				for (var11 = 0; var11 < arg3; var11++) {
					for (var12 = -arg2; var12 < 0; var12++) {
						var13 = this.anIntArray8630[var8];
						int var16 = ((var13 & 0xFF00FF) * var10 >> 8 & 0xFF00FF) + (((var13 & 0xFF00FF00) >>> 8) * var10 & 0xFF00FF00);
						this.anIntArray8630[var8++] = var15 + var16;
					}
					var8 += var7;
				}
			} else if (arg5 == 2) {
				for (var10 = 0; var10 < arg3; var10++) {
					for (var11 = -arg2; var11 < 0; var11++) {
						var12 = this.anIntArray8630[var8];
						var13 = arg4 + var12;
						int var14 = (arg4 & 0xFF00FF) + (var12 & 0xFF00FF);
						var12 = (var13 - var14 & 0x10000) + (var14 & 0x1000100);
						this.anIntArray8630[var8++] = var13 - var12 | var12 - (var12 >>> 8);
					}
					var8 += var7;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		var10 = arg2 >> 3;
		var11 = arg2 & 0x7;
		arg2 = var8 - 1;
		for (var12 = -arg3; var12 < 0; var12++) {
			if (var10 > 0) {
				arg0 = var10;
				do {
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (var11 > 0) {
				arg0 = var11;
				do {
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += var7;
		}
	}

	@ObfuscatedName("Class_ra_Sub3.fx(IIIIII)V")
	public void fx(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (this.anIntArray8630 == null) {
			return;
		}
		if (arg0 < this.anInt8621 * 1907727929 * 512290825) {
			arg2 -= this.anInt8621 * 1907727929 * 512290825 - arg0;
			arg0 = this.anInt8621 * 512290825 * 1907727929;
		}
		if (arg1 < this.anInt8623 * 766013039 * -1679642481) {
			arg3 -= this.anInt8623 * 766013039 * -1679642481 - arg1;
			arg1 = this.anInt8623 * -1679642481 * 766013039;
		}
		if (arg2 + arg0 > this.anInt8635 * -711985315 * -1071049483) {
			arg2 = this.anInt8635 * -1071049483 * -711985315 - arg0;
		}
		if (arg1 + arg3 > this.anInt8624 * -550983163 * 31822541) {
			arg3 = this.anInt8624 * 31822541 * -550983163 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt8635 * -1071049483 * -711985315 || arg1 > this.anInt8624 * -550983163 * 31822541) {
			return;
		}
		int var7 = this.anInt8618 * -29235085 * -1504772933 - arg2;
		int var8 = arg0 + arg1 * -1504772933 * this.anInt8618 * -29235085;
		int var9 = arg4 >>> 24;
		int var10;
		int var11;
		int var12;
		if (arg5 != 0 && (arg5 != 1 || var9 != 255)) {
			int var13;
			if (arg5 == 1) {
				int var15 = ((arg4 >>> 8 & 0xFF00FF) * var9 & 0xFF00FF00) + (var9 * (arg4 & 0xFF00FF) >> 8 & 0xFF00FF);
				var10 = 256 - var9;
				for (var11 = 0; var11 < arg3; var11++) {
					for (var12 = -arg2; var12 < 0; var12++) {
						var13 = this.anIntArray8630[var8];
						int var16 = ((var13 & 0xFF00FF) * var10 >> 8 & 0xFF00FF) + (((var13 & 0xFF00FF00) >>> 8) * var10 & 0xFF00FF00);
						this.anIntArray8630[var8++] = var15 + var16;
					}
					var8 += var7;
				}
			} else if (arg5 == 2) {
				for (var10 = 0; var10 < arg3; var10++) {
					for (var11 = -arg2; var11 < 0; var11++) {
						var12 = this.anIntArray8630[var8];
						var13 = arg4 + var12;
						int var14 = (arg4 & 0xFF00FF) + (var12 & 0xFF00FF);
						var12 = (var13 - var14 & 0x10000) + (var14 & 0x1000100);
						this.anIntArray8630[var8++] = var13 - var12 | var12 - (var12 >>> 8);
					}
					var8 += var7;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		var10 = arg2 >> 3;
		var11 = arg2 & 0x7;
		arg2 = var8 - 1;
		for (var12 = -arg3; var12 < 0; var12++) {
			if (var10 > 0) {
				arg0 = var10;
				do {
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (var11 > 0) {
				arg0 = var11;
				do {
					arg2++;
					this.anIntArray8630[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += var7;
		}
	}

	@ObfuscatedName("Class_ra_Sub3.ei()Z")
	public boolean ei() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.fp(IIIIII[BII)V")
	public void fp(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
		if (this.anIntArray8630 == null || arg2 <= 0 || arg3 <= 0) {
			return;
		}
		int var10 = 0;
		int var11 = 0;
		int var12 = (arg7 << 16) / arg2;
		int var13 = (arg6.length / arg7 << 16) / arg3;
		int var14 = arg1 * this.anInt8618 * -29235085 * -1504772933 + arg0;
		int var15 = this.anInt8618 * -29235085 * -1504772933 - arg2;
		if (arg1 + arg3 > this.anInt8624 * -550983163 * 31822541) {
			arg3 -= arg1 + arg3 - this.anInt8624 * 31822541 * -550983163;
		}
		int var16;
		if (arg1 < this.anInt8623 * 766013039 * -1679642481) {
			var16 = this.anInt8623 * 766013039 * -1679642481 - arg1;
			arg3 -= var16;
			var14 += var16 * -1504772933 * this.anInt8618 * -29235085;
			var11 += var13 * var16;
		}
		if (arg0 + arg2 > this.anInt8635 * -1071049483 * -711985315) {
			var16 = arg0 + arg2 - this.anInt8635 * -1071049483 * -711985315;
			arg2 -= var16;
			var15 += var16;
		}
		if (arg0 < this.anInt8621 * 512290825 * 1907727929) {
			var16 = this.anInt8621 * 1907727929 * 512290825 - arg0;
			arg2 -= var16;
			var14 += var16;
			var10 += var12 * var16;
			var15 += var16;
		}
		var16 = arg4 >>> 24;
		int var17 = arg5 >>> 24;
		int var18;
		int var19;
		int var20;
		int var21;
		if (arg8 == 0 || arg8 == 1 && var16 == 255 && var17 == 255) {
			var18 = var10;
			for (var19 = -arg3; var19 < 0; var19++) {
				var20 = arg7 * (var11 >> 16);
				for (var21 = -arg2; var21 < 0; var21++) {
					if (arg6[(var10 >> 16) + var20] == 0) {
						this.anIntArray8630[var14++] = arg4;
					} else {
						this.anIntArray8630[var14++] = arg5;
					}
					var10 += var12;
				}
				var11 += var13;
				var10 = var18;
				var14 += var15;
			}
			return;
		}
		int var22;
		int var23;
		int var24;
		int var25;
		if (arg8 == 1) {
			var18 = var10;
			for (var19 = -arg3; var19 < 0; var19++) {
				var20 = arg7 * (var11 >> 16);
				for (var21 = -arg2; var21 < 0; var21++) {
					var22 = arg4;
					if (arg6[(var10 >> 16) + var20] != 0) {
						var22 = arg5;
					}
					var23 = var22 >>> 24;
					var24 = 255 - var23;
					var25 = this.anIntArray8630[var14];
					this.anIntArray8630[var14++] = (var23 * (var22 & 0xFF00) + (var25 & 0xFF00) * var24 & 0xFF0000) + (var24 * (var25 & 0xFF00FF) + (var22 & 0xFF00FF) * var23 & 0xFF00FF00) >> 8;
					var10 += var12;
				}
				var11 += var13;
				var10 = var18;
				var14 += var15;
			}
		} else if (arg8 == 2) {
			var18 = var10;
			for (var19 = -arg3; var19 < 0; var19++) {
				var20 = (var11 >> 16) * arg7;
				for (var21 = -arg2; var21 < 0; var21++) {
					var22 = arg4;
					if (arg6[var20 + (var10 >> 16)] != 0) {
						var22 = arg5;
					}
					if (var22 == 0) {
						var14++;
					} else {
						var23 = this.anIntArray8630[var14];
						var24 = var23 + var22;
						var25 = (var22 & 0xFF00FF) + (var23 & 0xFF00FF);
						var23 = (var24 - var25 & 0x10000) + (var25 & 0x1000100);
						this.anIntArray8630[var14++] = var24 - var23 | var23 - (var23 >>> 8);
					}
					var10 += var12;
				}
				var11 += var13;
				var10 = var18;
				var14 += var15;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("Class_ra_Sub3.cd(II)I")
	public int cd(int arg0, int arg1) {
		return arg0 | arg1;
	}

	@ObfuscatedName("Class_ra_Sub3.gb(IIIIII[BII)V")
	public void gb(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
		if (this.anIntArray8630 == null || arg2 <= 0 || arg3 <= 0) {
			return;
		}
		int var10 = 0;
		int var11 = 0;
		int var12 = (arg7 << 16) / arg2;
		int var13 = (arg6.length / arg7 << 16) / arg3;
		int var14 = arg1 * this.anInt8618 * -29235085 * -1504772933 + arg0;
		int var15 = this.anInt8618 * -29235085 * -1504772933 - arg2;
		if (arg1 + arg3 > this.anInt8624 * -550983163 * 31822541) {
			arg3 -= arg1 + arg3 - this.anInt8624 * 31822541 * -550983163;
		}
		int var16;
		if (arg1 < this.anInt8623 * 766013039 * -1679642481) {
			var16 = this.anInt8623 * 766013039 * -1679642481 - arg1;
			arg3 -= var16;
			var14 += var16 * -1504772933 * this.anInt8618 * -29235085;
			var11 += var13 * var16;
		}
		if (arg0 + arg2 > this.anInt8635 * -1071049483 * -711985315) {
			var16 = arg0 + arg2 - this.anInt8635 * -1071049483 * -711985315;
			arg2 -= var16;
			var15 += var16;
		}
		if (arg0 < this.anInt8621 * 512290825 * 1907727929) {
			var16 = this.anInt8621 * 1907727929 * 512290825 - arg0;
			arg2 -= var16;
			var14 += var16;
			var10 += var12 * var16;
			var15 += var16;
		}
		var16 = arg4 >>> 24;
		int var17 = arg5 >>> 24;
		int var18;
		int var19;
		int var20;
		int var21;
		if (arg8 == 0 || arg8 == 1 && var16 == 255 && var17 == 255) {
			var18 = var10;
			for (var19 = -arg3; var19 < 0; var19++) {
				var20 = arg7 * (var11 >> 16);
				for (var21 = -arg2; var21 < 0; var21++) {
					if (arg6[(var10 >> 16) + var20] == 0) {
						this.anIntArray8630[var14++] = arg4;
					} else {
						this.anIntArray8630[var14++] = arg5;
					}
					var10 += var12;
				}
				var11 += var13;
				var10 = var18;
				var14 += var15;
			}
			return;
		}
		int var22;
		int var23;
		int var24;
		int var25;
		if (arg8 == 1) {
			var18 = var10;
			for (var19 = -arg3; var19 < 0; var19++) {
				var20 = arg7 * (var11 >> 16);
				for (var21 = -arg2; var21 < 0; var21++) {
					var22 = arg4;
					if (arg6[(var10 >> 16) + var20] != 0) {
						var22 = arg5;
					}
					var23 = var22 >>> 24;
					var24 = 255 - var23;
					var25 = this.anIntArray8630[var14];
					this.anIntArray8630[var14++] = (var23 * (var22 & 0xFF00) + (var25 & 0xFF00) * var24 & 0xFF0000) + (var24 * (var25 & 0xFF00FF) + (var22 & 0xFF00FF) * var23 & 0xFF00FF00) >> 8;
					var10 += var12;
				}
				var11 += var13;
				var10 = var18;
				var14 += var15;
			}
		} else if (arg8 == 2) {
			var18 = var10;
			for (var19 = -arg3; var19 < 0; var19++) {
				var20 = (var11 >> 16) * arg7;
				for (var21 = -arg2; var21 < 0; var21++) {
					var22 = arg4;
					if (arg6[var20 + (var10 >> 16)] != 0) {
						var22 = arg5;
					}
					if (var22 == 0) {
						var14++;
					} else {
						var23 = this.anIntArray8630[var14];
						var24 = var23 + var22;
						var25 = (var22 & 0xFF00FF) + (var23 & 0xFF00FF);
						var23 = (var24 - var25 & 0x10000) + (var25 & 0x1000100);
						this.anIntArray8630[var14++] = var24 - var23 | var23 - (var23 >>> 8);
					}
					var10 += var12;
				}
				var11 += var13;
				var10 = var18;
				var14 += var15;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("Class_ra_Sub3.hx(II[[I[[IIII)LClass_xa;")
	public Class_xa hx(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
		return new Class_xa_Sub3(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("Class_ra_Sub3.gd(IIIII)V")
	public void gd(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (this.anIntArray8630 == null || arg1 < this.anInt8623 * -1679642481 * 766013039 || arg1 >= this.anInt8624 * 31822541 * -550983163) {
			return;
		}
		if (arg0 < this.anInt8621 * 512290825 * 1907727929) {
			arg2 -= this.anInt8621 * 512290825 * 1907727929 - arg0;
			arg0 = this.anInt8621 * 1907727929 * 512290825;
		}
		if (arg2 + arg0 > this.anInt8635 * -1071049483 * -711985315) {
			arg2 = this.anInt8635 * -711985315 * -1071049483 - arg0;
		}
		int var6 = this.anInt8618 * -1504772933 * -29235085 * arg1 + arg0;
		int var7 = arg3 >>> 24;
		int var8;
		if (arg4 == 0 || arg4 == 1 && var7 == 255) {
			for (var8 = 0; var8 < arg2; var8++) {
				this.anIntArray8630[var8 + var6] = arg3;
			}
			return;
		}
		int var9;
		int var10;
		if (arg4 == 1) {
			int var12 = (var7 << 24) + ((arg3 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + (var7 * (arg3 & 0xFF00) >> 8 & 0xFF00);
			var8 = 256 - var7;
			for (var9 = 0; var9 < arg2; var9++) {
				var10 = this.anIntArray8630[var9 + var6];
				int var13 = ((var10 & 0xFF00) * var8 >> 8 & 0xFF00) + ((var10 & 0xFF00FF) * var8 >> 8 & 0xFF00FF);
				this.anIntArray8630[var9 + var6] = var12 + var13;
			}
		} else if (arg4 == 2) {
			for (var8 = 0; var8 < arg2; var8++) {
				var9 = this.anIntArray8630[var8 + var6];
				var10 = var9 + arg3;
				int var11 = (var9 & 0xFF00FF) + (arg3 & 0xFF00FF);
				var9 = (var10 - var11 & 0x10000) + (var11 & 0x1000100);
				this.anIntArray8630[var6 + var8] = var10 - var9 | var9 - (var9 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("Class_ra_Sub3.gp(LClass_v;)V")
	public void gp(Class_v arg0) {
	}

	@ObfuscatedName("Class_ra_Sub3.r(IIII)V")
	public void r(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt8618) {
			arg2 = this.anInt8618;
		}
		if (arg3 > this.anInt8619) {
			arg3 = this.anInt8619;
		}
		this.anInt8621 = arg0;
		this.anInt8635 = arg2;
		this.anInt8623 = arg1;
		this.anInt8624 = arg3;
		this.method5195();
	}

	@ObfuscatedName("Class_ra_Sub3.gj(IIIII)V")
	public void gj(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (this.anIntArray8630 == null || arg0 < this.anInt8621 * 1907727929 * 512290825 || arg0 >= this.anInt8635 * -1071049483 * -711985315) {
			return;
		}
		if (arg1 < this.anInt8623 * 766013039 * -1679642481) {
			arg2 -= this.anInt8623 * 766013039 * -1679642481 - arg1;
			arg1 = this.anInt8623 * -1679642481 * 766013039;
		}
		if (arg2 + arg1 > this.anInt8624 * -550983163 * 31822541) {
			arg2 = this.anInt8624 * -550983163 * 31822541 - arg1;
		}
		int var6 = arg0 + this.anInt8618 * -1504772933 * -29235085 * arg1;
		int var7 = arg3 >>> 24;
		int var8;
		if (arg4 == 0 || arg4 == 1 && var7 == 255) {
			for (var8 = 0; var8 < arg2; var8++) {
				this.anIntArray8630[var6 + var8 * -1504772933 * this.anInt8618 * -29235085] = arg3;
			}
			return;
		}
		int var9;
		int var10;
		int var11;
		if (arg4 == 1) {
			int var13 = (var7 << 24) + ((arg3 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * var7 >> 8 & 0xFF00);
			var8 = 256 - var7;
			for (var9 = 0; var9 < arg2; var9++) {
				var10 = var6 + this.anInt8618 * -29235085 * -1504772933 * var9;
				var11 = this.anIntArray8630[var10];
				int var14 = (var8 * (var11 & 0xFF00) >> 8 & 0xFF00) + (var8 * (var11 & 0xFF00FF) >> 8 & 0xFF00FF);
				this.anIntArray8630[var10] = var14 + var13;
			}
		} else if (arg4 == 2) {
			for (var8 = 0; var8 < arg2; var8++) {
				var9 = var8 * this.anInt8618 * -29235085 * -1504772933 + var6;
				var10 = this.anIntArray8630[var9];
				var11 = var10 + arg3;
				int var12 = (arg3 & 0xFF00FF) + (var10 & 0xFF00FF);
				var10 = (var11 - var12 & 0x10000) + (var12 & 0x1000100);
				this.anIntArray8630[var9] = var11 - var10 | var10 - (var10 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("Class_ra_Sub3.gl(IIIII)V")
	public void gl(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (this.anIntArray8630 == null || arg0 < this.anInt8621 * 1907727929 * 512290825 || arg0 >= this.anInt8635 * -1071049483 * -711985315) {
			return;
		}
		if (arg1 < this.anInt8623 * 766013039 * -1679642481) {
			arg2 -= this.anInt8623 * 766013039 * -1679642481 - arg1;
			arg1 = this.anInt8623 * -1679642481 * 766013039;
		}
		if (arg2 + arg1 > this.anInt8624 * -550983163 * 31822541) {
			arg2 = this.anInt8624 * -550983163 * 31822541 - arg1;
		}
		int var6 = arg0 + this.anInt8618 * -1504772933 * -29235085 * arg1;
		int var7 = arg3 >>> 24;
		int var8;
		if (arg4 == 0 || arg4 == 1 && var7 == 255) {
			for (var8 = 0; var8 < arg2; var8++) {
				this.anIntArray8630[var6 + var8 * -1504772933 * this.anInt8618 * -29235085] = arg3;
			}
			return;
		}
		int var9;
		int var10;
		int var11;
		if (arg4 == 1) {
			int var13 = (var7 << 24) + ((arg3 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * var7 >> 8 & 0xFF00);
			var8 = 256 - var7;
			for (var9 = 0; var9 < arg2; var9++) {
				var10 = var6 + this.anInt8618 * -29235085 * -1504772933 * var9;
				var11 = this.anIntArray8630[var10];
				int var14 = (var8 * (var11 & 0xFF00) >> 8 & 0xFF00) + (var8 * (var11 & 0xFF00FF) >> 8 & 0xFF00FF);
				this.anIntArray8630[var10] = var14 + var13;
			}
		} else if (arg4 == 2) {
			for (var8 = 0; var8 < arg2; var8++) {
				var9 = var8 * this.anInt8618 * -29235085 * -1504772933 + var6;
				var10 = this.anIntArray8630[var9];
				var11 = var10 + arg3;
				int var12 = (arg3 & 0xFF00FF) + (var10 & 0xFF00FF);
				var10 = (var11 - var12 & 0x10000) + (var12 & 0x1000100);
				this.anIntArray8630[var9] = var11 - var10 | var10 - (var10 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("Class_ra_Sub3.dg(ILClass77;)V")
	public void dg(int arg0, Class77 arg1) {
		for (int var3 = 0; var3 < this.aClass6Array8647.length; var3++) {
			this.aClass6Array8647[var3].anInt90 = this.aClass6Array8647[var3].anInt88;
			this.aClass6Array8647[var3].anInt92 = arg0;
			this.aClass6Array8647[var3].anInt88 = arg1.anInt652;
			this.aClass6Array8647[var3].anInt93 = arg1.anInt650;
			this.aClass6Array8647[var3].aBoolean91 = true;
		}
	}

	@ObfuscatedName("Class_ra_Sub3.cw(LClass247;)V")
	public void cw(Class247 arg0) {
		this.aClass247_8629 = arg0;
		this.method5188();
	}

	@ObfuscatedName("Class_ra_Sub3.gw(IIIIIILClass_ta;II)V")
	public void gw(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Class_ta arg6, int arg7, int arg8) {
		if (this.anIntArray8630 == null) {
			return;
		}
		Class_ta_Sub3 var10 = (Class_ta_Sub3) arg6;
		int[] var11 = var10.anIntArray8661;
		int[] var12 = var10.anIntArray8662;
		int var13 = this.anInt8623 * 766013039 * -1679642481 > arg8 ? this.anInt8623 * -1679642481 * 766013039 : arg8;
		int var14 = this.anInt8624 * 31822541 * -550983163 < var11.length + arg8 ? this.anInt8624 * -550983163 * 31822541 : var11.length + arg8;
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 + arg2 < 0) {
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		int var15;
		int var16;
		int var17;
		int var18;
		int var19;
		int var20;
		int var21;
		int var22;
		int var23;
		int var25;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			int var26 = arg2 << 16;
			var15 = (int) Math.floor((double) var26 / (double) arg3 + 0.5D);
			arg3 += arg1;
			if (arg1 < var13) {
				arg0 += var15 * (var13 - arg1);
				arg1 = var13;
			}
			if (arg3 >= var14) {
				arg3 = var14 - 1;
			}
			var16 = arg4 >>> 24;
			if (arg5 == 0 || arg5 == 1 && var16 == 255) {
				while (arg1 <= arg3) {
					var17 = arg0 >> 16;
					var18 = arg1 - arg8;
					var19 = arg7 + var11[var18];
					if (var17 >= this.anInt8621 * 1907727929 * 512290825 && var17 < this.anInt8635 * -1071049483 * -711985315 && var17 >= var19 && var17 < var19 + var12[var18]) {
						this.anIntArray8630[this.anInt8618 * -29235085 * -1504772933 * arg1 + var17] = arg4;
					}
					arg0 += var15;
					arg1++;
				}
			} else if (arg5 == 1) {
				var25 = ((arg4 & 0xFF00FF) * var16 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * var16 >> 8 & 0xFF00) + (var16 << 24);
				var17 = 256 - var16;
				while (arg1 <= arg3) {
					var18 = arg0 >> 16;
					var19 = arg1 - arg8;
					var20 = arg7 + var11[var19];
					if (var18 >= this.anInt8621 * 1907727929 * 512290825 && var18 < this.anInt8635 * -711985315 * -1071049483 && var18 >= var20 && var18 < var20 + var12[var19]) {
						var21 = arg1 * -1504772933 * this.anInt8618 * -29235085 + var18;
						var22 = this.anIntArray8630[var21];
						var22 = ((var22 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + (var17 * (var22 & 0xFF00) >> 8 & 0xFF00);
						this.anIntArray8630[var18 + arg1 * this.anInt8618 * -29235085 * -1504772933] = var25 + var22;
					}
					arg0 += var15;
					arg1++;
				}
			} else if (arg5 == 2) {
				while (arg1 <= arg3) {
					var17 = arg0 >> 16;
					var18 = arg1 - arg8;
					var19 = var11[var18] + arg7;
					if (var17 >= this.anInt8621 * 512290825 * 1907727929 && var17 < this.anInt8635 * -1071049483 * -711985315 && var17 >= var19 && var17 < var19 + var12[var18]) {
						var20 = this.anInt8618 * -29235085 * -1504772933 * arg1 + var17;
						var21 = this.anIntArray8630[var20];
						var22 = var21 + arg4;
						var23 = (arg4 & 0xFF00FF) + (var21 & 0xFF00FF);
						var21 = (var23 & 0x1000100) + (var22 - var23 & 0x10000);
						this.anIntArray8630[var20] = var22 - var21 | var21 - (var21 >>> 8);
					}
					arg0 += var15;
					arg1++;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		int var24 = arg3 << 16;
		var15 = (int) Math.floor((double) var24 / (double) arg2 + 0.5D);
		arg2 += arg0;
		if (arg0 < this.anInt8621 * 1907727929 * 512290825) {
			arg1 += (this.anInt8621 * 512290825 * 1907727929 - arg0) * var15;
			arg0 = this.anInt8621 * 1907727929 * 512290825;
		}
		if (arg2 >= this.anInt8635 * -1071049483 * -711985315) {
			arg2 = this.anInt8635 * -711985315 * -1071049483 - 1;
		}
		var16 = arg4 >>> 24;
		if (arg5 == 0 || arg5 == 1 && var16 == 255) {
			while (arg0 <= arg2) {
				var17 = arg1 >> 16;
				var18 = var17 - arg8;
				if (var17 >= var13 && var17 < var14) {
					var19 = var11[var18] + arg7;
					if (arg0 >= var19 && arg0 < var12[var18] + var19) {
						this.anIntArray8630[var17 * -1504772933 * this.anInt8618 * -29235085 + arg0] = arg4;
					}
				}
				arg1 += var15;
				arg0++;
			}
		} else if (arg5 == 1) {
			var25 = (var16 * (arg4 & 0xFF00FF) >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * var16 >> 8 & 0xFF00) + (var16 << 24);
			var17 = 256 - var16;
			while (arg0 <= arg2) {
				var18 = arg1 >> 16;
				var19 = var18 - arg8;
				if (var18 >= var13 && var18 < var14) {
					var20 = var11[var19] + arg7;
					if (arg0 >= var20 && arg0 < var20 + var12[var19]) {
						var21 = this.anInt8618 * -1504772933 * -29235085 * var18 + arg0;
						var22 = this.anIntArray8630[var21];
						int var27 = (var17 * (var22 & 0xFF00) >> 8 & 0xFF00) + (var17 * (var22 & 0xFF00FF) >> 8 & 0xFF00FF);
						this.anIntArray8630[var21] = var27 + var25;
					}
				}
				arg1 += var15;
				arg0++;
			}
		} else if (arg5 == 2) {
			while (arg0 <= arg2) {
				var17 = arg1 >> 16;
				var18 = var17 - arg8;
				if (var17 >= var13 && var17 < var14) {
					var19 = arg7 + var11[var18];
					if (arg0 >= var19 && arg0 < var12[var18] + var19) {
						var20 = arg0 + var17 * this.anInt8618 * -29235085 * -1504772933;
						var21 = this.anIntArray8630[var20];
						var22 = var21 + arg4;
						var23 = (arg4 & 0xFF00FF) + (var21 & 0xFF00FF);
						var21 = (var22 - var23 & 0x10000) + (var23 & 0x1000100);
						this.anIntArray8630[var20] = var22 - var21 | var21 - (var21 >>> 8);
					}
				}
				arg1 += var15;
				arg0++;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("Class_ra_Sub3.ge(IIIIIII)V")
	public void ge(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (this.anIntArray8630 == null) {
			return;
		}
		Class6 var8 = this.method5206(Thread.currentThread());
		Class38 var9 = var8.aClass38_94;
		int var10 = arg2 - arg0;
		int var11 = arg3 - arg1;
		int var12 = var10 >= 0 ? var10 : -var10;
		int var13 = var11 >= 0 ? var11 : -var11;
		int var14 = var12;
		if (var12 < var13) {
			var14 = var13;
		}
		if (var14 == 0) {
			return;
		}
		int var15 = (var10 << 16) / var14;
		int var16 = (var11 << 16) / var14;
		var10 += var15 >> 16;
		var11 += var16 >> 16;
		if (var16 <= var15) {
			var15 = -var15;
		} else {
			var16 = -var16;
		}
		int var17 = var16 * arg5 >> 17;
		int var18 = var16 * arg5 + 1 >> 17;
		int var19 = arg5 * var15 >> 17;
		int var20 = arg5 * var15 + 1 >> 17;
		int var29 = arg0 - var9.method534();
		int var30 = arg1 - var9.method537();
		int var21 = var17 + var29;
		int var22 = var29 - var18;
		int var23 = var10 + var29 - var18;
		int var24 = var10 + var29 + var17;
		int var25 = var19 + var30;
		int var26 = var30 - var20;
		int var27 = var30 + var11 - var20;
		int var28 = var30 + var11 + var19;
		if (arg6 == 0) {
			var9.anInt402 = 0;
		} else if (arg6 == 1) {
			var9.anInt402 = 255 - (arg4 >>> 24);
		} else {
			throw new IllegalArgumentException();
		}
		this.RA(false);
		var9.aBoolean387 = var21 < 0 || var21 > var9.anInt396 * -71748021 * 1568891747 || var22 < 0 || var22 > var9.anInt396 * -71748021 * 1568891747 || var23 < 0 || var23 > var9.anInt396 * -71748021 * 1568891747;
		var9.method539(true, false, false, (float) var25, (float) var26, (float) var27, (float) var21, (float) var22, (float) var23, 100.0F, 100.0F, 100.0F, arg4);
		var9.aBoolean387 = var21 < 0 || var21 > var9.anInt396 * -71748021 * 1568891747 || var23 < 0 || var23 > var9.anInt396 * -71748021 * 1568891747 || var24 < 0 || var24 > var9.anInt396 * -71748021 * 1568891747;
		var9.method539(true, false, false, (float) var25, (float) var27, (float) var28, (float) var21, (float) var23, (float) var24, 100.0F, 100.0F, 100.0F, arg4);
		this.RA(true);
	}

	@ObfuscatedName("Class_ra_Sub3.gh(IIIIIII)V")
	public void gh(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (this.anIntArray8630 == null) {
			return;
		}
		Class6 var8 = this.method5206(Thread.currentThread());
		Class38 var9 = var8.aClass38_94;
		int var10 = arg2 - arg0;
		int var11 = arg3 - arg1;
		int var12 = var10 >= 0 ? var10 : -var10;
		int var13 = var11 >= 0 ? var11 : -var11;
		int var14 = var12;
		if (var12 < var13) {
			var14 = var13;
		}
		if (var14 == 0) {
			return;
		}
		int var15 = (var10 << 16) / var14;
		int var16 = (var11 << 16) / var14;
		var10 += var15 >> 16;
		var11 += var16 >> 16;
		if (var16 <= var15) {
			var15 = -var15;
		} else {
			var16 = -var16;
		}
		int var17 = var16 * arg5 >> 17;
		int var18 = var16 * arg5 + 1 >> 17;
		int var19 = arg5 * var15 >> 17;
		int var20 = arg5 * var15 + 1 >> 17;
		int var29 = arg0 - var9.method534();
		int var30 = arg1 - var9.method537();
		int var21 = var17 + var29;
		int var22 = var29 - var18;
		int var23 = var10 + var29 - var18;
		int var24 = var10 + var29 + var17;
		int var25 = var19 + var30;
		int var26 = var30 - var20;
		int var27 = var30 + var11 - var20;
		int var28 = var30 + var11 + var19;
		if (arg6 == 0) {
			var9.anInt402 = 0;
		} else if (arg6 == 1) {
			var9.anInt402 = 255 - (arg4 >>> 24);
		} else {
			throw new IllegalArgumentException();
		}
		this.RA(false);
		var9.aBoolean387 = var21 < 0 || var21 > var9.anInt396 * -71748021 * 1568891747 || var22 < 0 || var22 > var9.anInt396 * -71748021 * 1568891747 || var23 < 0 || var23 > var9.anInt396 * -71748021 * 1568891747;
		var9.method539(true, false, false, (float) var25, (float) var26, (float) var27, (float) var21, (float) var22, (float) var23, 100.0F, 100.0F, 100.0F, arg4);
		var9.aBoolean387 = var21 < 0 || var21 > var9.anInt396 * -71748021 * 1568891747 || var23 < 0 || var23 > var9.anInt396 * -71748021 * 1568891747 || var24 < 0 || var24 > var9.anInt396 * -71748021 * 1568891747;
		var9.method539(true, false, false, (float) var25, (float) var27, (float) var28, (float) var21, (float) var23, (float) var24, 100.0F, 100.0F, 100.0F, arg4);
		this.RA(true);
	}

	public Class330_Sub14 method4799(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
		return null;
	}

	@ObfuscatedName("Class_ra_Sub3.gu(IIIIIII)V")
	public void gu(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (this.anIntArray8630 == null) {
			return;
		}
		Class6 var8 = this.method5206(Thread.currentThread());
		Class38 var9 = var8.aClass38_94;
		int var10 = arg2 - arg0;
		int var11 = arg3 - arg1;
		int var12 = var10 >= 0 ? var10 : -var10;
		int var13 = var11 >= 0 ? var11 : -var11;
		int var14 = var12;
		if (var12 < var13) {
			var14 = var13;
		}
		if (var14 == 0) {
			return;
		}
		int var15 = (var10 << 16) / var14;
		int var16 = (var11 << 16) / var14;
		var10 += var15 >> 16;
		var11 += var16 >> 16;
		if (var16 <= var15) {
			var15 = -var15;
		} else {
			var16 = -var16;
		}
		int var17 = var16 * arg5 >> 17;
		int var18 = var16 * arg5 + 1 >> 17;
		int var19 = arg5 * var15 >> 17;
		int var20 = arg5 * var15 + 1 >> 17;
		int var29 = arg0 - var9.method534();
		int var30 = arg1 - var9.method537();
		int var21 = var17 + var29;
		int var22 = var29 - var18;
		int var23 = var10 + var29 - var18;
		int var24 = var10 + var29 + var17;
		int var25 = var19 + var30;
		int var26 = var30 - var20;
		int var27 = var30 + var11 - var20;
		int var28 = var30 + var11 + var19;
		if (arg6 == 0) {
			var9.anInt402 = 0;
		} else if (arg6 == 1) {
			var9.anInt402 = 255 - (arg4 >>> 24);
		} else {
			throw new IllegalArgumentException();
		}
		this.RA(false);
		var9.aBoolean387 = var21 < 0 || var21 > var9.anInt396 * -71748021 * 1568891747 || var22 < 0 || var22 > var9.anInt396 * -71748021 * 1568891747 || var23 < 0 || var23 > var9.anInt396 * -71748021 * 1568891747;
		var9.method539(true, false, false, (float) var25, (float) var26, (float) var27, (float) var21, (float) var22, (float) var23, 100.0F, 100.0F, 100.0F, arg4);
		var9.aBoolean387 = var21 < 0 || var21 > var9.anInt396 * -71748021 * 1568891747 || var23 < 0 || var23 > var9.anInt396 * -71748021 * 1568891747 || var24 < 0 || var24 > var9.anInt396 * -71748021 * 1568891747;
		var9.method539(true, false, false, (float) var25, (float) var27, (float) var28, (float) var21, (float) var23, (float) var24, 100.0F, 100.0F, 100.0F, arg4);
		this.RA(true);
	}

	@ObfuscatedName("Class_ra_Sub3.cl(IIIIII)LClass92;")
	public Class92 cl(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return null;
	}

	@ObfuscatedName("Class_ra_Sub3.gv(IIIIII)I")
	public int gv(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 0;
		float var8 = this.aClass249_8634.aFloatArray2631[10] * (float) arg2 + (float) arg0 * this.aClass249_8634.aFloatArray2631[2] + this.aClass249_8634.aFloatArray2631[14] + this.aClass249_8634.aFloatArray2631[6] * (float) arg1;
		float var9 = this.aClass249_8634.aFloatArray2631[2] * (float) arg3 + this.aClass249_8634.aFloatArray2631[14] + this.aClass249_8634.aFloatArray2631[6] * (float) arg4 + this.aClass249_8634.aFloatArray2631[10] * (float) arg5;
		float var10 = (float) arg1 * this.aClass249_8634.aFloatArray2631[7] + (float) arg0 * this.aClass249_8634.aFloatArray2631[3] + this.aClass249_8634.aFloatArray2631[15] + (float) arg2 * this.aClass249_8634.aFloatArray2631[11];
		float var11 = (float) arg4 * this.aClass249_8634.aFloatArray2631[7] + this.aClass249_8634.aFloatArray2631[3] * (float) arg3 + this.aClass249_8634.aFloatArray2631[15] + this.aClass249_8634.aFloatArray2631[11] * (float) arg5;
		if (var8 < -var10 && var9 < -var11) {
			var7 |= 0x10;
		} else if (var8 > var10 && var9 > var11) {
			var7 |= 0x20;
		}
		float var12 = (float) arg1 * this.aClass249_8634.aFloatArray2631[4] + this.aClass249_8634.aFloatArray2631[12] + (float) arg0 * this.aClass249_8634.aFloatArray2631[0] + this.aClass249_8634.aFloatArray2631[8] * (float) arg2;
		float var13 = (float) arg4 * this.aClass249_8634.aFloatArray2631[4] + this.aClass249_8634.aFloatArray2631[12] + (float) arg3 * this.aClass249_8634.aFloatArray2631[0] + this.aClass249_8634.aFloatArray2631[8] * (float) arg5;
		if (var12 < -var10 && var13 < -var11) {
			var7 |= 0x1;
		}
		if (var12 > var10 && var13 > var11) {
			var7 |= 0x2;
		}
		float var14 = (float) arg0 * this.aClass249_8634.aFloatArray2631[1] + this.aClass249_8634.aFloatArray2631[13] + (float) arg1 * this.aClass249_8634.aFloatArray2631[5] + this.aClass249_8634.aFloatArray2631[9] * (float) arg2;
		float var15 = this.aClass249_8634.aFloatArray2631[9] * (float) arg5 + this.aClass249_8634.aFloatArray2631[5] * (float) arg4 + this.aClass249_8634.aFloatArray2631[1] * (float) arg3 + this.aClass249_8634.aFloatArray2631[13];
		if (var14 < -var10 && var15 < -var11) {
			var7 |= 0x4;
		}
		if (var14 > var10 && var15 > var11) {
			var7 |= 0x8;
		}
		return var7;
	}

	@ObfuscatedName("Class_ra_Sub3.c(III)V")
	public void c(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.aClass6Array8647.length; var4++) {
			Class6 var5 = this.aClass6Array8647[var4];
			var5.anInt88 = arg0 & 0xFFFFFF;
			int var6 = var5.anInt88 >>> 16 & 0xFF;
			if (var6 < 2) {
				var6 = 2;
			}
			int var7 = var5.anInt88 >> 8 & 0xFF;
			if (var7 < 2) {
				var7 = 2;
			}
			int var8 = var5.anInt88 & 0xFF;
			if (var8 < 2) {
				var8 = 2;
			}
			var5.anInt88 = var6 << 16 | var7 << 8 | var8;
			if (arg1 < 0) {
				var5.aBoolean86 = false;
			} else {
				var5.aBoolean86 = true;
			}
		}
	}

	@ObfuscatedName("Class_ra_Sub3.gs(I)LClass_v;")
	public Class_v gs(int arg0) {
		return null;
	}

	@ObfuscatedName("Class_ra_Sub3.dr(FFF[F)V")
	public void dr(float arg0, float arg1, float arg2, float[] arg3) {
		float var5 = this.aClass249_8634.aFloatArray2631[10] * arg2 + arg1 * this.aClass249_8634.aFloatArray2631[6] + arg0 * this.aClass249_8634.aFloatArray2631[2] + this.aClass249_8634.aFloatArray2631[14];
		float var6 = this.aClass249_8634.aFloatArray2631[15] + arg0 * this.aClass249_8634.aFloatArray2631[3] + arg1 * this.aClass249_8634.aFloatArray2631[7] + this.aClass249_8634.aFloatArray2631[11] * arg2;
		if (var5 < -var6 || var5 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		float var7 = arg1 * this.aClass249_8634.aFloatArray2631[4] + arg0 * this.aClass249_8634.aFloatArray2631[0] + this.aClass249_8634.aFloatArray2631[12] + this.aClass249_8634.aFloatArray2631[8] * arg2;
		if (var7 < -var6 || var7 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		float var8 = this.aClass249_8634.aFloatArray2631[13] + arg0 * this.aClass249_8634.aFloatArray2631[1] + this.aClass249_8634.aFloatArray2631[5] * arg1 + arg2 * this.aClass249_8634.aFloatArray2631[9];
		if (var8 < -var6 || var8 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			float var9 = this.aClass249_8632.aFloatArray2631[14] + arg0 * this.aClass249_8632.aFloatArray2631[2] + arg1 * this.aClass249_8632.aFloatArray2631[6] + this.aClass249_8632.aFloatArray2631[10] * arg2;
			arg3[0] = this.aFloat8641 + this.aFloat8640 * var7 / var6;
			arg3[1] = this.aFloat8643 + this.aFloat8642 * var8 / var6;
			arg3[2] = var9;
		}
	}

	@ObfuscatedName("Class_ra_Sub3.gc(LClass_v;)V")
	public void gc(Class_v arg0) {
	}

	@ObfuscatedName("Class_ra_Sub3.du()V")
	public void du() {
	}

	@ObfuscatedName("Class_ra_Sub3.gk(IIIIIIIII)V")
	public void gk(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		if (this.anIntArray8630 == null) {
			return;
		}
		arg2 -= arg0;
		arg3 -= arg1;
		int var10;
		int var24;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method5203(arg0, arg1, arg2 + 1, arg4, arg5, arg6, arg7, arg8);
			} else {
				var10 = arg7 + arg6;
				var24 = arg8 % var10;
				int var25 = arg6 + var10 - var24 - (-arg2 + 1) % var10;
				arg8 = var25 % var10;
				if (arg8 < 0) {
					arg8 += var10;
				}
				this.method5203(arg2 + arg0, arg1, -arg2 + 1, arg4, arg5, arg6, arg7, arg8);
			}
		} else if (arg2 != 0) {
			var24 = arg8 << 8;
			int var22 = arg6 << 8;
			int var23 = arg7 << 8;
			var10 = var22 + var23;
			arg8 = var24 % var10;
			int var11;
			int var12;
			if (arg3 + arg2 < 0) {
				var11 = (int) (Math.sqrt((double) (arg2 * arg2 + arg3 * arg3)) * 256.0D);
				var12 = var11 % var10;
				var24 = var22 + var10 - arg8 - var12;
				arg8 = var24 % var10;
				if (arg8 < 0) {
					arg8 += var10;
				}
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			int var13;
			int var14;
			int var15;
			int var16;
			int var17;
			int var18;
			int var19;
			int var20;
			int var21;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				var20 = arg3 << 16;
				var11 = (int) Math.floor((double) var20 / (double) arg2 + 0.5D);
				var19 = arg2 + arg0;
				var12 = arg4 >>> 24;
				var13 = (int) Math.sqrt((double) ((var11 >> 8) * (var11 >> 8) + 65536));
				if (arg5 == 0 || arg5 == 1 && var12 == 255) {
					while (arg0 <= var19) {
						var14 = arg1 >> 16;
						if (arg0 >= this.anInt8621 * 1907727929 * 512290825 && arg0 < this.anInt8635 * -1071049483 * -711985315 && var14 >= this.anInt8623 * 766013039 * -1679642481 && var14 < this.anInt8624 * -550983163 * 31822541 && arg8 < var22) {
							this.anIntArray8630[var14 * -1504772933 * this.anInt8618 * -29235085 + arg0] = arg4;
						}
						arg1 += var11;
						arg0++;
						var24 = arg8 + var13;
						arg8 = var24 % var10;
					}
				} else if (arg5 == 1) {
					var21 = ((arg4 & 0xFF00FF) * var12 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * var12 >> 8 & 0xFF00) + (var12 << 24);
					var14 = 256 - var12;
					while (arg0 <= var19) {
						var15 = arg1 >> 16;
						if (arg0 >= this.anInt8621 * 1907727929 * 512290825 && arg0 < this.anInt8635 * -1071049483 * -711985315 && var15 >= this.anInt8623 * 766013039 * -1679642481 && var15 < this.anInt8624 * -550983163 * 31822541 && arg8 < var22) {
							var16 = arg0 + this.anInt8618 * -1504772933 * -29235085 * var15;
							var17 = this.anIntArray8630[var16];
							int var26 = ((var17 & 0xFF00FF) * var14 >> 8 & 0xFF00FF) + (var14 * (var17 & 0xFF00) >> 8 & 0xFF00);
							this.anIntArray8630[var16] = var21 + var26;
						}
						arg1 += var11;
						arg0++;
						var24 = arg8 + var13;
						arg8 = var24 % var10;
					}
				} else if (arg5 == 2) {
					while (arg0 <= var19) {
						var14 = arg1 >> 16;
						if (arg0 >= this.anInt8621 * 512290825 * 1907727929 && arg0 < this.anInt8635 * -1071049483 * -711985315 && var14 >= this.anInt8623 * 766013039 * -1679642481 && var14 < this.anInt8624 * -550983163 * 31822541 && arg8 < var22) {
							var15 = arg0 + var14 * this.anInt8618 * -29235085 * -1504772933;
							var16 = this.anIntArray8630[var15];
							var17 = arg4 + var16;
							var18 = (var16 & 0xFF00FF) + (arg4 & 0xFF00FF);
							var16 = (var18 & 0x1000100) + (var17 - var18 & 0x10000);
							this.anIntArray8630[var15] = var17 - var16 | var16 - (var16 >>> 8);
						}
						arg1 += var11;
						arg0++;
						var24 = arg8 + var13;
						arg8 = var24 % var10;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				var19 = arg2 << 16;
				var11 = (int) Math.floor((double) var19 / (double) arg3 + 0.5D);
				var20 = arg3 + arg1;
				var12 = arg4 >>> 24;
				var13 = (int) Math.sqrt((double) ((var11 >> 8) * (var11 >> 8) + 65536));
				if (arg5 == 0 || arg5 == 1 && var12 == 255) {
					while (arg1 <= var20) {
						var14 = arg0 >> 16;
						if (arg1 >= this.anInt8623 * -1679642481 * 766013039 && arg1 < this.anInt8624 * 31822541 * -550983163 && var14 >= this.anInt8621 * 1907727929 * 512290825 && var14 < this.anInt8635 * -711985315 * -1071049483 && arg8 < var22) {
							this.anIntArray8630[this.anInt8618 * -1504772933 * -29235085 * arg1 + var14] = arg4;
						}
						arg0 += var11;
						arg1++;
						var24 = arg8 + var13;
						arg8 = var24 % var10;
					}
				} else if (arg5 == 1) {
					var21 = (var12 * (arg4 & 0xFF00FF) >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * var12 >> 8 & 0xFF00) + (var12 << 24);
					var14 = 256 - var12;
					while (arg1 <= var20) {
						var15 = arg0 >> 16;
						if (arg1 >= this.anInt8623 * -1679642481 * 766013039 && arg1 < this.anInt8624 * -550983163 * 31822541 && var15 >= this.anInt8621 * 512290825 * 1907727929 && var15 < this.anInt8635 * -1071049483 * -711985315 && arg8 < var22) {
							var16 = arg1 * this.anInt8618 * -29235085 * -1504772933 + var15;
							var17 = this.anIntArray8630[var16];
							var17 = ((var17 & 0xFF00FF) * var14 >> 8 & 0xFF00FF) + (var14 * (var17 & 0xFF00) >> 8 & 0xFF00);
							this.anIntArray8630[var15 + arg1 * -1504772933 * this.anInt8618 * -29235085] = var21 + var17;
						}
						arg0 += var11;
						arg1++;
						var24 = arg8 + var13;
						arg8 = var24 % var10;
					}
				} else if (arg5 == 2) {
					while (arg1 <= var20) {
						var14 = arg0 >> 16;
						if (arg1 >= this.anInt8623 * -1679642481 * 766013039 && arg1 < this.anInt8624 * -550983163 * 31822541 && var14 >= this.anInt8621 * 1907727929 * 512290825 && var14 < this.anInt8635 * -1071049483 * -711985315 && arg8 < var22) {
							var15 = var14 + this.anInt8618 * -1504772933 * -29235085 * arg1;
							var16 = this.anIntArray8630[var15];
							var17 = var16 + arg4;
							var18 = (arg4 & 0xFF00FF) + (var16 & 0xFF00FF);
							var16 = (var17 - var18 & 0x10000) + (var18 & 0x1000100);
							this.anIntArray8630[var15] = var17 - var16 | var16 - (var16 >>> 8);
						}
						arg0 += var11;
						arg1++;
						var24 = arg8 + var13;
						arg8 = var24 % var10;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.method5198(arg0, arg1, arg3 + 1, arg4, arg5, arg6, arg7, arg8);
		} else {
			var10 = arg6 + arg7;
			var24 = arg8 % var10;
			var24 = arg6 + var10 - var24 - (-arg3 + 1) % var10;
			arg8 = var24 % var10;
			if (arg8 < 0) {
				arg8 += var10;
			}
			this.method5198(arg0, arg3 + arg1, -arg3 + 1, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@ObfuscatedName("Class_ra_Sub3.hz(IIZZ)LClass61;")
	public Class61 hz(int arg0, int arg1, boolean arg2, boolean arg3) {
		return arg2 ? new Class61_Sub3_Sub2(this, arg0, arg1) : new Class61_Sub3_Sub1(this, arg0, arg1);
	}

	@ObfuscatedName("Class_ra_Sub3.hm([IIIIIZ)LClass61;")
	public Class61 hm(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		boolean var7 = false;
		int var8 = arg1;
		for (int var9 = 0; var9 < arg4; var9++) {
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = arg0[var8++] >>> 24;
				if (var11 != 0 && var11 != 255) {
					var7 = true;
					return var7 ? new Class61_Sub3_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : new Class61_Sub3_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
				}
			}
		}
		return var7 ? new Class61_Sub3_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : new Class61_Sub3_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("Class_ra_Sub3.hv([IIIIIZ)LClass61;")
	public Class61 hv(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		boolean var7 = false;
		int var8 = arg1;
		for (int var9 = 0; var9 < arg4; var9++) {
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = arg0[var8++] >>> 24;
				if (var11 != 0 && var11 != 255) {
					var7 = true;
					return var7 ? new Class61_Sub3_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : new Class61_Sub3_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
				}
			}
		}
		return var7 ? new Class61_Sub3_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : new Class61_Sub3_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("Class_ra_Sub3.hi(LClass87;Z)LClass61;")
	public Class61 hi(Class87 arg0, boolean arg1) {
		int var3 = arg0.method986();
		int var4 = arg0.method994();
		Class61_Sub3 var5;
		if (arg1 && !arg0.method985() && arg0.method1044()) {
			Class87_Sub2 var12 = (Class87_Sub2) arg0;
			int[] var7 = new int[var12.anIntArray7113.length];
			byte[] var8 = new byte[var4 * var3];
			int var9;
			for (var9 = 0; var9 < var4; var9++) {
				int var10 = var9 * var3;
				for (int var11 = 0; var11 < var3; var11++) {
					var8[var11 + var10] = var12.aByteArray7114[var11 + var10];
				}
			}
			for (var9 = 0; var9 < var12.anIntArray7113.length; var9++) {
				var7[var9] = var12.anIntArray7113[var9];
			}
			var5 = new Class61_Sub3_Sub3(this, var8, var7, var3, var4);
		} else {
			int[] var6 = arg0.method1031(false);
			if (arg0.method985()) {
				var5 = new Class61_Sub3_Sub2(this, var6, var3, var4);
			} else {
				var5 = new Class61_Sub3_Sub1(this, var6, var3, var4);
			}
		}
		var5.method717(arg0.method983(), arg0.method990(), arg0.method989(), arg0.method991());
		return var5;
	}

	@ObfuscatedName("Class_ra_Sub3.hq(LClass87;Z)LClass61;")
	public Class61 hq(Class87 arg0, boolean arg1) {
		int var3 = arg0.method986();
		int var4 = arg0.method994();
		Class61_Sub3 var5;
		if (arg1 && !arg0.method985() && arg0.method1044()) {
			Class87_Sub2 var12 = (Class87_Sub2) arg0;
			int[] var7 = new int[var12.anIntArray7113.length];
			byte[] var8 = new byte[var4 * var3];
			int var9;
			for (var9 = 0; var9 < var4; var9++) {
				int var10 = var9 * var3;
				for (int var11 = 0; var11 < var3; var11++) {
					var8[var11 + var10] = var12.aByteArray7114[var11 + var10];
				}
			}
			for (var9 = 0; var9 < var12.anIntArray7113.length; var9++) {
				var7[var9] = var12.anIntArray7113[var9];
			}
			var5 = new Class61_Sub3_Sub3(this, var8, var7, var3, var4);
		} else {
			int[] var6 = arg0.method1031(false);
			if (arg0.method985()) {
				var5 = new Class61_Sub3_Sub2(this, var6, var3, var4);
			} else {
				var5 = new Class61_Sub3_Sub1(this, var6, var3, var4);
			}
		}
		var5.method717(arg0.method983(), arg0.method990(), arg0.method989(), arg0.method991());
		return var5;
	}

	@ObfuscatedName("Class_ra_Sub3.ah(II)LInterface8_Impl1_Impl1;")
	public Interface8_Impl1_Impl1 ah(int arg0, int arg1) {
		return new Class43(arg0, arg1);
	}

	@ObfuscatedName("Class_ra_Sub3.hl(IIIIZ)LClass61;")
	public Class61 hl(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		if (this.anIntArray8630 == null) {
			throw new IllegalStateException("");
		}
		int[] var6 = new int[arg3 * arg2];
		int var7 = arg0 + arg1 * this.anInt8618 * -29235085 * -1504772933;
		int var8 = this.anInt8618 * -29235085 * -1504772933 - arg2;
		for (int var9 = 0; var9 < arg3; var9++) {
			int var10 = var9 * arg2;
			for (int var11 = 0; var11 < arg2; var11++) {
				var6[var11 + var10] = this.anIntArray8630[var7++];
			}
			var7 += var8;
		}
		if (arg4) {
			return new Class61_Sub3_Sub2(this, var6, arg2, arg3);
		} else {
			return new Class61_Sub3_Sub1(this, var6, arg2, arg3);
		}
	}

	@ObfuscatedName("Class_ra_Sub3.hf(IIIIZ)LClass61;")
	public Class61 hf(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		if (this.anIntArray8630 == null) {
			throw new IllegalStateException("");
		}
		int[] var6 = new int[arg3 * arg2];
		int var7 = arg0 + arg1 * this.anInt8618 * -29235085 * -1504772933;
		int var8 = this.anInt8618 * -29235085 * -1504772933 - arg2;
		for (int var9 = 0; var9 < arg3; var9++) {
			int var10 = var9 * arg2;
			for (int var11 = 0; var11 < arg2; var11++) {
				var6[var11 + var10] = this.anIntArray8630[var7++];
			}
			var7 += var8;
		}
		if (arg4) {
			return new Class61_Sub3_Sub2(this, var6, arg2, arg3);
		} else {
			return new Class61_Sub3_Sub1(this, var6, arg2, arg3);
		}
	}

	@ObfuscatedName("Class_ra_Sub3.ht(IIIIZ)LClass61;")
	public Class61 ht(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		if (this.anIntArray8630 == null) {
			throw new IllegalStateException("");
		}
		int[] var6 = new int[arg3 * arg2];
		int var7 = arg0 + arg1 * this.anInt8618 * -29235085 * -1504772933;
		int var8 = this.anInt8618 * -29235085 * -1504772933 - arg2;
		for (int var9 = 0; var9 < arg3; var9++) {
			int var10 = var9 * arg2;
			for (int var11 = 0; var11 < arg2; var11++) {
				var6[var11 + var10] = this.anIntArray8630[var7++];
			}
			var7 += var8;
		}
		if (arg4) {
			return new Class61_Sub3_Sub2(this, var6, arg2, arg3);
		} else {
			return new Class61_Sub3_Sub1(this, var6, arg2, arg3);
		}
	}

	@ObfuscatedName("Class_ra_Sub3.hc(II[I[I)LClass_ta;")
	public Class_ta hc(int arg0, int arg1, int[] arg2, int[] arg3) {
		return new Class_ta_Sub3(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("Class_ra_Sub3.hy(II[I[I)LClass_ta;")
	public Class_ta hy(int arg0, int arg1, int[] arg2, int[] arg3) {
		return new Class_ta_Sub3(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("Class_ra_Sub3.hu(ILClass_ta;II)V")
	public void hu(int arg0, Class_ta arg1, int arg2, int arg3) {
		if (this.anIntArray8630 == null) {
			return;
		}
		Class_ta_Sub3 var5 = (Class_ta_Sub3) arg1;
		int[] var6 = var5.anIntArray8661;
		int[] var7 = var5.anIntArray8662;
		int var8;
		if (this.anInt8624 * -550983163 * 31822541 < var6.length + arg3) {
			var8 = this.anInt8624 * 31822541 * -550983163 - arg3;
		} else {
			var8 = var6.length;
		}
		int var9;
		if (this.anInt8623 * -1679642481 * 766013039 > arg3) {
			var9 = this.anInt8623 * -1679642481 * 766013039 - arg3;
			arg3 = this.anInt8623 * -1679642481 * 766013039;
		} else {
			var9 = 0;
		}
		if (var8 - var9 <= 0) {
			return;
		}
		int var10 = this.anInt8618 * -1504772933 * -29235085 * arg3;
		for (int var11 = var9; var11 < var8; var11++) {
			int var12 = var6[var11] + arg2;
			int var13 = var7[var11];
			if (this.anInt8621 * 1907727929 * 512290825 > var12) {
				var13 -= this.anInt8621 * 512290825 * 1907727929 - var12;
				var12 = this.anInt8621 * 1907727929 * 512290825;
			}
			if (this.anInt8635 * -1071049483 * -711985315 < var12 + var13) {
				var13 = this.anInt8635 * -1071049483 * -711985315 - var12;
			}
			var12 += var10;
			for (int var14 = -var13; var14 < 0; var14++) {
				this.anIntArray8630[var12++] = arg0;
			}
			var10 += this.anInt8618 * -29235085 * -1504772933;
		}
	}

	@ObfuscatedName("Class_ra_Sub3.fo(IIII)V")
	public void fo(int arg0, int arg1, int arg2, int arg3) {
		this.anInt8636 = arg0 * 1238685301 * 960350685;
		this.anInt8622 = arg1 * -780345205 * 1359775523;
		this.anInt8638 = arg2 * -1098702653 * 52203499;
		this.anInt8614 = arg3 * 1394695071 * 1426128991;
		this.method5195();
	}

	@ObfuscatedName("Class_ra_Sub3.ay()Z")
	public boolean ay() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.hw(I)V")
	public void hw(int arg0) {
		Class387_Sub3.anInt8222 = arg0;
		Class387_Sub3.anInt8166 = arg0;
		if (this.anInt8650 * -595900225 * -76798145 > 1) {
			throw new IllegalStateException();
		}
		this.method5199(this.anInt8650 * -595900225 * -76798145);
		this.method5208(0);
	}

	@ObfuscatedName("Class_ra_Sub3.hn(I)V")
	public void hn(int arg0) {
		Class387_Sub3.anInt8222 = arg0;
		Class387_Sub3.anInt8166 = arg0;
		if (this.anInt8650 * -595900225 * -76798145 > 1) {
			throw new IllegalStateException();
		}
		this.method5199(this.anInt8650 * -595900225 * -76798145);
		this.method5208(0);
	}

	@ObfuscatedName("Class_ra_Sub3.dp()I")
	public int dp() {
		return 0;
	}

	@ObfuscatedName("Class_ra_Sub3.hg(LModel;IIII)LClass387;")
	public Class387 hg(Model arg0, int arg1, int arg2, int arg3, int arg4) {
		return new Class387_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@ObfuscatedName("Class_ra_Sub3.hb(LModel;IIII)LClass387;")
	public Class387 hb(Model arg0, int arg1, int arg2, int arg3, int arg4) {
		return new Class387_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@ObfuscatedName("Class_ra_Sub3.he(II)I")
	public int he(int arg0, int arg1) {
		int var3 = arg0 | 0x20800;
		return var3 & arg1 ^ arg1;
	}

	@ObfuscatedName("Class_ra_Sub3.hd(II)I")
	public int hd(int arg0, int arg1) {
		return arg0 | arg1;
	}

	@ObfuscatedName("Class_ra_Sub3.hj(II)I")
	public int hj(int arg0, int arg1) {
		return arg0 | arg1;
	}

	@ObfuscatedName("Class_ra_Sub3.gx(IIIII)V")
	public void gx(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (this.anIntArray8630 == null || arg1 < this.anInt8623 * -1679642481 * 766013039 || arg1 >= this.anInt8624 * 31822541 * -550983163) {
			return;
		}
		if (arg0 < this.anInt8621 * 512290825 * 1907727929) {
			arg2 -= this.anInt8621 * 512290825 * 1907727929 - arg0;
			arg0 = this.anInt8621 * 1907727929 * 512290825;
		}
		if (arg2 + arg0 > this.anInt8635 * -1071049483 * -711985315) {
			arg2 = this.anInt8635 * -711985315 * -1071049483 - arg0;
		}
		int var6 = this.anInt8618 * -1504772933 * -29235085 * arg1 + arg0;
		int var7 = arg3 >>> 24;
		int var8;
		if (arg4 == 0 || arg4 == 1 && var7 == 255) {
			for (var8 = 0; var8 < arg2; var8++) {
				this.anIntArray8630[var8 + var6] = arg3;
			}
			return;
		}
		int var9;
		int var10;
		if (arg4 == 1) {
			int var12 = (var7 << 24) + ((arg3 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + (var7 * (arg3 & 0xFF00) >> 8 & 0xFF00);
			var8 = 256 - var7;
			for (var9 = 0; var9 < arg2; var9++) {
				var10 = this.anIntArray8630[var9 + var6];
				int var13 = ((var10 & 0xFF00) * var8 >> 8 & 0xFF00) + ((var10 & 0xFF00FF) * var8 >> 8 & 0xFF00FF);
				this.anIntArray8630[var9 + var6] = var12 + var13;
			}
		} else if (arg4 == 2) {
			for (var8 = 0; var8 < arg2; var8++) {
				var9 = this.anIntArray8630[var8 + var6];
				var10 = var9 + arg3;
				int var11 = (var9 & 0xFF00FF) + (arg3 & 0xFF00FF);
				var9 = (var10 - var11 & 0x10000) + (var11 & 0x1000100);
				this.anIntArray8630[var6 + var8] = var10 - var9 | var9 - (var9 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("Class_ra_Sub3.cp(LClass92;LClass92;FLClass92;)LClass92;")
	public Class92 cp(Class92 arg0, Class92 arg1, float arg2, Class92 arg3) {
		return null;
	}

	public Class330_Sub14 method5207(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
		return null;
	}

	@ObfuscatedName("Class_ra_Sub3.ii(I[LClass330_Sub14;)V")
	public void ii(int arg0, Class330_Sub14[] arg1) {
	}

	@ObfuscatedName("Class_ra_Sub3.cs()LClass249;")
	public Class249 cs() {
		return new Class249(this.aClass249_8633);
	}

	@ObfuscatedName("Class_ra_Sub3.ih()LClass247;")
	public Class247 ih() {
		return new Class247(this.aClass247_8629);
	}

	@ObfuscatedName("Class_ra_Sub3.ic()LClass249;")
	public Class249 ic() {
		return new Class249(this.aClass249_8633);
	}

	@ObfuscatedName("Class_ra_Sub3.gi(I)LClass_v;")
	public Class_v gi(int arg0) {
		return null;
	}

	@ObfuscatedName("Class_ra_Sub3.fh(IIII)V")
	public void fh(int arg0, int arg1, int arg2, int arg3) {
		if (this.anInt8621 * 512290825 * 1907727929 < arg0) {
			this.anInt8621 = arg0 * 1907727929 * 512290825;
		}
		if (this.anInt8623 * 766013039 * -1679642481 < arg1) {
			this.anInt8623 = arg1 * 766013039 * -1679642481;
		}
		if (this.anInt8635 * -711985315 * -1071049483 > arg2) {
			this.anInt8635 = arg2 * -711985315 * -1071049483;
		}
		if (this.anInt8624 * 31822541 * -550983163 > arg3) {
			this.anInt8624 = arg3 * -550983163 * 31822541;
		}
		this.method5195();
	}

	@ObfuscatedName("Class_ra_Sub3.ck(I[LClass330_Sub14;)V")
	public void ck(int arg0, Class330_Sub14[] arg1) {
	}

	public void method5208(int arg0) {
		this.aClass6Array8647[arg0].method402(Thread.currentThread(), (byte) -46);
	}

	@ObfuscatedName("Class_ra_Sub3.bj(IIIIZ)LClass61;")
	public Class61 bj(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		if (this.anIntArray8630 == null) {
			throw new IllegalStateException("");
		}
		int[] var6 = new int[arg3 * arg2];
		int var7 = arg0 + arg1 * this.anInt8618;
		int var8 = this.anInt8618 - arg2;
		for (int var9 = 0; var9 < arg3; var9++) {
			int var10 = var9 * arg2;
			for (int var11 = 0; var11 < arg2; var11++) {
				var6[var11 + var10] = this.anIntArray8630[var7++];
			}
			var7 += var8;
		}
		if (arg4) {
			return new Class61_Sub3_Sub2(this, var6, arg2, arg3);
		} else {
			return new Class61_Sub3_Sub1(this, var6, arg2, arg3);
		}
	}

	public int[] method5209(int arg0) {
		Class367 var3 = this.aClass367_8644;
		Class330_Sub13 var2;
		synchronized (this.aClass367_8644) {
			var2 = (Class330_Sub13) this.aClass367_8644.get((long) arg0 | Long.MIN_VALUE);
			if (var2 == null) {
				Class56 var4 = this.anInterface_ma4227.method221(arg0, 50750209);
				int var5 = var4.anInt532;
				if (!this.anInterface_ma4227.method237(arg0, Class377.aClass377_3935, 0.7F, var5, var5, true, 2141049440)) {
					return null;
				}
				int[] var6;
				if (var4.aClass369_524 == Class369.aClass369_6817) {
					var6 = this.anInterface_ma4227.method231(arg0, 0.7F, var5, var5, true, 1430007319);
				} else {
					var6 = this.anInterface_ma4227.method220(arg0, 0.7F, var5, var5, true, -1671756861);
				}
				var2 = new Class330_Sub13(arg0, var5, var6, var4.aClass369_524 != Class369.aClass369_6815);
				this.aClass367_8644.method4299(var2, (long) arg0 | Long.MIN_VALUE, var5 * var5, (byte) -30);
			}
		}
		var2.aBoolean7602 = true;
		return var2.method3309();
	}

	@ObfuscatedName("Class_ra_Sub3.bl(IIIIII)V")
	public void bl(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		this.XA(arg0, arg1, arg2, arg4, arg5);
		this.XA(arg0, arg3 + arg1 - 1, arg2, arg4, arg5);
		this.G(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.G(arg2 + arg0 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@ObfuscatedName("Class_ra_Sub3.l()V")
	public void l() {
	}

	@ObfuscatedName("Class_ra_Sub3.ir(LClass249;)V")
	public void ir(Class249 arg0) {
		this.aClass249_8633.method2510(arg0);
		this.method5188();
	}

	@ObfuscatedName("Class_ra_Sub3.io()LClass249;")
	public Class249 io() {
		return new Class249(this.aClass249_8633);
	}

	public void method5210(boolean arg0, int arg1, int arg2, float arg3, int arg4, int arg5, int arg6) {
		if (this.anIntArray8630 == null) {
			return;
		}
		if (arg4 < 0) {
			arg4 = -arg4;
		}
		int var8 = arg2 - arg4;
		if (var8 < this.anInt8623) {
			var8 = this.anInt8623;
		}
		int var9 = arg2 + arg4 + 1;
		if (var9 > this.anInt8624) {
			var9 = this.anInt8624;
		}
		int var10 = var8;
		int var11 = arg4 * arg4;
		int var12 = 0;
		int var13 = arg2 - var8;
		int var14 = var13 * var13;
		int var15 = var14 - var13;
		if (arg2 > var9) {
			arg2 = var9;
		}
		int var16 = arg5 >>> 24;
		int var17;
		int var18;
		int var19;
		int var20;
		if (arg6 == 0 || arg6 == 1 && var16 == 255) {
			while (var10 < arg2) {
				while (var15 <= var11 || var14 <= var11) {
					var14 += var12 + var12;
					var15 += var12++ + var12;
				}
				var17 = arg1 - var12 + 1;
				if (var17 < this.anInt8621) {
					var17 = this.anInt8621;
				}
				var18 = arg1 + var12;
				if (var18 > this.anInt8635) {
					var18 = this.anInt8635;
				}
				var19 = this.anInt8618 * var10 + var17;
				for (var20 = var17; var20 < var18; var20++) {
					if (!arg0 || arg3 < this.aFloatArray8620[var19]) {
						this.anIntArray8630[var19] = arg5;
					}
					var19++;
				}
				var10++;
				var14 -= var13-- + var13;
				var15 -= var13 + var13;
			}
			var12 = arg4;
			var13 = var10 - arg2;
			var15 = var13 * var13 + var11;
			var14 = var15 - arg4;
			var15 -= var13;
			while (var10 < var9) {
				while (var15 > var11 && var14 > var11) {
					var15 -= var12-- + var12;
					var14 -= var12 + var12;
				}
				var17 = arg1 - var12;
				if (var17 < this.anInt8621) {
					var17 = this.anInt8621;
				}
				var18 = var12 + arg1;
				if (var18 > this.anInt8635 - 1) {
					var18 = this.anInt8635 - 1;
				}
				var19 = this.anInt8618 * var10 + var17;
				for (var20 = var17; var20 <= var18; var20++) {
					if (!arg0 || arg3 < this.aFloatArray8620[var19]) {
						this.anIntArray8630[var19] = arg5;
					}
					var19++;
				}
				var10++;
				var15 += var13 + var13;
				var14 += var13++ + var13;
			}
			return;
		}
		int var21;
		int var22;
		if (arg6 == 1) {
			int var24 = ((arg5 & 0xFF00) * var16 >> 8 & 0xFF00) + (var16 * (arg5 & 0xFF00FF) >> 8 & 0xFF00FF) + (var16 << 24);
			var17 = 256 - var16;
			while (var10 < arg2) {
				while (var15 <= var11 || var14 <= var11) {
					var14 += var12 + var12;
					var15 += var12++ + var12;
				}
				var18 = arg1 - var12 + 1;
				if (var18 < this.anInt8621) {
					var18 = this.anInt8621;
				}
				var19 = arg1 + var12;
				if (var19 > this.anInt8635) {
					var19 = this.anInt8635;
				}
				var20 = var10 * this.anInt8618 + var18;
				for (var21 = var18; var21 < var19; var21++) {
					if (!arg0 || arg3 < this.aFloatArray8620[var20]) {
						var22 = this.anIntArray8630[var20];
						int var25 = ((var22 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var22 & 0xFF00) * var17 >> 8 & 0xFF00);
						this.anIntArray8630[var20] = var25 + var24;
					}
					var20++;
				}
				var10++;
				var14 -= var13-- + var13;
				var15 -= var13 + var13;
			}
			var12 = arg4;
			var13 = -var13;
			var15 = var11 + var13 * var13;
			var14 = var15 - arg4;
			var15 -= var13;
			while (var10 < var9) {
				while (var15 > var11 && var14 > var11) {
					var15 -= var12-- + var12;
					var14 -= var12 + var12;
				}
				var18 = arg1 - var12;
				if (var18 < this.anInt8621) {
					var18 = this.anInt8621;
				}
				var19 = var12 + arg1;
				if (var19 > this.anInt8635 - 1) {
					var19 = this.anInt8635 - 1;
				}
				var20 = var10 * this.anInt8618 + var18;
				for (var21 = var18; var21 <= var19; var21++) {
					if (!arg0 || arg3 < this.aFloatArray8620[var20]) {
						var22 = this.anIntArray8630[var20];
						var22 = ((var22 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + (var17 * (var22 & 0xFF00) >> 8 & 0xFF00);
						this.anIntArray8630[var20] = var24 + var22;
					}
					var20++;
				}
				var10++;
				var15 += var13 + var13;
				var14 += var13++ + var13;
			}
		} else if (arg6 == 2) {
			int var23;
			while (var10 < arg2) {
				while (var15 <= var11 || var14 <= var11) {
					var14 += var12 + var12;
					var15 += var12++ + var12;
				}
				var17 = arg1 - var12 + 1;
				if (var17 < this.anInt8621) {
					var17 = this.anInt8621;
				}
				var18 = arg1 + var12;
				if (var18 > this.anInt8635) {
					var18 = this.anInt8635;
				}
				var19 = this.anInt8618 * var10 + var17;
				for (var20 = var17; var20 < var18; var20++) {
					if (!arg0 || arg3 < this.aFloatArray8620[var19]) {
						var21 = this.anIntArray8630[var19];
						var22 = var21 + arg5;
						var23 = (arg5 & 0xFF00FF) + (var21 & 0xFF00FF);
						var21 = (var23 & 0x1000100) + (var22 - var23 & 0x10000);
						this.anIntArray8630[var19] = var22 - var21 | var21 - (var21 >>> 8);
					}
					var19++;
				}
				var10++;
				var14 -= var13-- + var13;
				var15 -= var13 + var13;
			}
			var12 = arg4;
			var13 = -var13;
			var15 = var13 * var13 + var11;
			var14 = var15 - arg4;
			var15 -= var13;
			while (var10 < var9) {
				while (var15 > var11 && var14 > var11) {
					var15 -= var12-- + var12;
					var14 -= var12 + var12;
				}
				var17 = arg1 - var12;
				if (var17 < this.anInt8621) {
					var17 = this.anInt8621;
				}
				var18 = var12 + arg1;
				if (var18 > this.anInt8635 - 1) {
					var18 = this.anInt8635 - 1;
				}
				var19 = var17 + this.anInt8618 * var10;
				for (var20 = var17; var20 <= var18; var20++) {
					if (!arg0 || arg3 < this.aFloatArray8620[var19]) {
						var21 = this.anIntArray8630[var19];
						var22 = var21 + arg5;
						var23 = (var21 & 0xFF00FF) + (arg5 & 0xFF00FF);
						var21 = (var22 - var23 & 0x10000) + (var23 & 0x1000100);
						this.anIntArray8630[var19] = var22 - var21 | var21 - (var21 >>> 8);
					}
					var19++;
				}
				var10++;
				var15 += var13 + var13;
				var14 += var13++ + var13;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("Class_ra_Sub3.ij(F)V")
	public void ij(float arg0) {
		this.anInt8645 = (int) (arg0 * 65535.0F) * -1109799723 * -581366659;
	}

	@ObfuscatedName("Class_ra_Sub3.ia(F)V")
	public void ia(float arg0) {
		this.anInt8645 = (int) (arg0 * 65535.0F) * -1109799723 * -581366659;
	}

	@ObfuscatedName("Class_ra_Sub3.ik(IFFFFF)V")
	public void ik(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		this.anInt8628 = (int) (arg1 * 65535.0F) * -557706933 * -149426077;
		this.anInt8646 = (int) (arg2 * 65535.0F) * -781081669 * -1270371981;
		float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3));
		this.anInt8625 = (int) (arg3 * 65535.0F / var7) * 1565949885 * 1926837141;
		this.anInt8626 = (int) (arg4 * 65535.0F / var7) * 951383331 * -1582112117;
		this.anInt8627 = (int) (arg5 * 65535.0F / var7) * -2011013933 * -1580311717;
	}

	@ObfuscatedName("Class_ra_Sub3.iz(IFFFFF)V")
	public void iz(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		this.anInt8628 = (int) (arg1 * 65535.0F) * -557706933 * -149426077;
		this.anInt8646 = (int) (arg2 * 65535.0F) * -781081669 * -1270371981;
		float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3));
		this.anInt8625 = (int) (arg3 * 65535.0F / var7) * 1565949885 * 1926837141;
		this.anInt8626 = (int) (arg4 * 65535.0F / var7) * 951383331 * -1582112117;
		this.anInt8627 = (int) (arg5 * 65535.0F / var7) * -2011013933 * -1580311717;
	}

	@ObfuscatedName("Class_ra_Sub3.il(I)V")
	public void il(int arg0) {
	}

	@ObfuscatedName("Class_ra_Sub3.iw(I)V")
	public void iw(int arg0) {
	}

	@ObfuscatedName("Class_ra_Sub3.fc(IIII)V")
	public void fc(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt8618 * -29235085 * -1504772933) {
			arg2 = this.anInt8618 * -29235085 * -1504772933;
		}
		if (arg3 > this.anInt8619 * 1870465245 * 1229852533) {
			arg3 = this.anInt8619 * 1870465245 * 1229852533;
		}
		this.anInt8621 = arg0 * 1907727929 * 512290825;
		this.anInt8635 = arg2 * -711985315 * -1071049483;
		this.anInt8623 = arg1 * 766013039 * -1679642481;
		this.anInt8624 = arg3 * -550983163 * 31822541;
		this.method5195();
	}

	@ObfuscatedName("Class_ra_Sub3.gt(IIZZ)LClass61;")
	public Class61 gt(int arg0, int arg1, boolean arg2, boolean arg3) {
		return arg2 ? new Class61_Sub3_Sub2(this, arg0, arg1) : new Class61_Sub3_Sub1(this, arg0, arg1);
	}

	@ObfuscatedName("Class_ra_Sub3.ig(III)V")
	public void ig(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.aClass6Array8647.length; var4++) {
			Class6 var5 = this.aClass6Array8647[var4];
			var5.anInt88 = (arg0 & 0xFFFFFF) * -1381026891 * 536502941;
			int var6 = var5.anInt88 * -1381026891 * 536502941 >>> 16 & 0xFF;
			if (var6 < 2) {
				var6 = 2;
			}
			int var7 = var5.anInt88 * 536502941 * -1381026891 >> 8 & 0xFF;
			if (var7 < 2) {
				var7 = 2;
			}
			int var8 = var5.anInt88 * -1381026891 * 536502941 & 0xFF;
			if (var8 < 2) {
				var8 = 2;
			}
			var5.anInt88 = (var6 << 16 | var7 << 8 | var8) * -1381026891 * 536502941;
			if (arg1 < 0) {
				var5.aBoolean86 = false;
			} else {
				var5.aBoolean86 = true;
			}
		}
	}

	@ObfuscatedName("Class_ra_Sub3.ix(IIIIII)LClass92;")
	public Class92 ix(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return null;
	}

	@ObfuscatedName("Class_ra_Sub3.gm(IIZZ)LClass61;")
	public Class61 gm(int arg0, int arg1, boolean arg2, boolean arg3) {
		return arg2 ? new Class61_Sub3_Sub2(this, arg0, arg1) : new Class61_Sub3_Sub1(this, arg0, arg1);
	}

	@ObfuscatedName("Class_ra_Sub3.ip(IIIIII)LClass92;")
	public Class92 ip(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return null;
	}

	@ObfuscatedName("Class_ra_Sub3.u()V")
	public void u() {
		if (this.aBoolean8616) {
			Class95_Sub12.method1137(true, false, 966191256);
			this.aBoolean8616 = false;
		}
		this.aBoolean8648 = true;
	}

	@ObfuscatedName("Class_ra_Sub3.in(LClass92;LClass92;FLClass92;)LClass92;")
	public Class92 in(Class92 arg0, Class92 arg1, float arg2, Class92 arg3) {
		return null;
	}

	@ObfuscatedName("Class_ra_Sub3.is(LClass92;)V")
	public void is(Class92 arg0) {
	}

	@ObfuscatedName("Class_ra_Sub3.gr(IIIIII)V")
	public void gr(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (this.anIntArray8630 == null) {
			return;
		}
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.XA(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.XA(arg2 + arg0, arg1, -arg2 + 1, arg4, arg5);
			}
		} else if (arg2 != 0) {
			if (arg3 + arg2 < 0) {
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			int var7;
			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var13;
			int var15;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				int var14 = arg3 << 16;
				var7 = (int) Math.floor((double) var14 / (double) arg2 + 0.5D);
				arg2 += arg0;
				if (arg0 < this.anInt8621 * 512290825 * 1907727929) {
					arg1 += var7 * (this.anInt8621 * 1907727929 * 512290825 - arg0);
					arg0 = this.anInt8621 * 1907727929 * 512290825;
				}
				if (arg2 >= this.anInt8635 * -1071049483 * -711985315) {
					arg2 = this.anInt8635 * -711985315 * -1071049483 - 1;
				}
				var8 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && var8 == 255) {
					while (arg0 <= arg2) {
						var9 = arg1 >> 16;
						if (var9 >= this.anInt8623 * -1679642481 * 766013039 && var9 < this.anInt8624 * -550983163 * 31822541) {
							this.anIntArray8630[var9 * this.anInt8618 * -29235085 * -1504772933 + arg0] = arg4;
						}
						arg1 += var7;
						arg0++;
					}
				} else if (arg5 == 1) {
					var15 = ((arg4 & 0xFF00FF) * var8 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * var8 >> 8 & 0xFF00) + (var8 << 24);
					var9 = 256 - var8;
					while (arg0 <= arg2) {
						var10 = arg1 >> 16;
						if (var10 >= this.anInt8623 * 766013039 * -1679642481 && var10 < this.anInt8624 * 31822541 * -550983163) {
							var11 = arg0 + var10 * this.anInt8618 * -29235085 * -1504772933;
							var12 = this.anIntArray8630[var11];
							int var17 = (var9 * (var12 & 0xFF00FF) >> 8 & 0xFF00FF) + (var9 * (var12 & 0xFF00) >> 8 & 0xFF00);
							this.anIntArray8630[var11] = var17 + var15;
						}
						arg1 += var7;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						var9 = arg1 >> 16;
						if (var9 >= this.anInt8623 * -1679642481 * 766013039 && var9 < this.anInt8624 * -550983163 * 31822541) {
							var10 = arg0 + this.anInt8618 * -29235085 * -1504772933 * var9;
							var11 = this.anIntArray8630[var10];
							var12 = var11 + arg4;
							var13 = (var11 & 0xFF00FF) + (arg4 & 0xFF00FF);
							var11 = (var12 - var13 & 0x10000) + (var13 & 0x1000100);
							this.anIntArray8630[var10] = var12 - var11 | var11 - (var11 >>> 8);
						}
						arg1 += var7;
						arg0++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				int var16 = arg2 << 16;
				var7 = (int) Math.floor((double) var16 / (double) arg3 + 0.5D);
				arg3 += arg1;
				if (arg1 < this.anInt8623 * -1679642481 * 766013039) {
					arg0 += (this.anInt8623 * 766013039 * -1679642481 - arg1) * var7;
					arg1 = this.anInt8623 * 766013039 * -1679642481;
				}
				if (arg3 >= this.anInt8624 * -550983163 * 31822541) {
					arg3 = this.anInt8624 * 31822541 * -550983163 - 1;
				}
				var8 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && var8 == 255) {
					while (arg1 <= arg3) {
						var9 = arg0 >> 16;
						if (var9 >= this.anInt8621 * 512290825 * 1907727929 && var9 < this.anInt8635 * -1071049483 * -711985315) {
							this.anIntArray8630[this.anInt8618 * -1504772933 * -29235085 * arg1 + var9] = arg4;
						}
						arg0 += var7;
						arg1++;
					}
				} else if (arg5 == 1) {
					var15 = ((arg4 & 0xFF00) * var8 >> 8 & 0xFF00) + ((arg4 & 0xFF00FF) * var8 >> 8 & 0xFF00FF) + (var8 << 24);
					var9 = 256 - var8;
					while (arg1 <= arg3) {
						var10 = arg0 >> 16;
						if (var10 >= this.anInt8621 * 512290825 * 1907727929 && var10 < this.anInt8635 * -1071049483 * -711985315) {
							var11 = this.anInt8618 * -1504772933 * -29235085 * arg1 + var10;
							var12 = this.anIntArray8630[var11];
							var12 = (var9 * (var12 & 0xFF00) >> 8 & 0xFF00) + (var9 * (var12 & 0xFF00FF) >> 8 & 0xFF00FF);
							this.anIntArray8630[var10 + this.anInt8618 * -29235085 * -1504772933 * arg1] = var15 + var12;
						}
						arg0 += var7;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						var9 = arg0 >> 16;
						if (var9 >= this.anInt8621 * 512290825 * 1907727929 && var9 < this.anInt8635 * -711985315 * -1071049483) {
							var10 = var9 + this.anInt8618 * -29235085 * -1504772933 * arg1;
							var11 = this.anIntArray8630[var10];
							var12 = arg4 + var11;
							var13 = (var11 & 0xFF00FF) + (arg4 & 0xFF00FF);
							var11 = (var13 & 0x1000100) + (var12 - var13 & 0x10000);
							this.anIntArray8630[var10] = var12 - var11 | var11 - (var11 >>> 8);
						}
						arg0 += var7;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.G(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.G(arg0, arg3 + arg1, -arg3 + 1, arg4, arg5);
		}
	}

	@ObfuscatedName("Class_ra_Sub3.it()Z")
	public boolean it() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.em()Z")
	public boolean em() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.ie()Z")
	public boolean ie() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.f()LClass51;")
	public Class51 f() {
		return new Class51(0, "Pure Java", 1, "CPU", 0L);
	}

	@ObfuscatedName("Class_ra_Sub3.kl(LClass247;)V")
	public void kl(Class247 arg0) {
		this.aClass247_8629 = arg0;
		this.method5188();
	}

	@ObfuscatedName("Class_ra_Sub3.ju(FFFFFF)V")
	public void ju(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
	}

	@ObfuscatedName("Class_ra_Sub3.jn(IIII)V")
	public void jn(int arg0, int arg1, int arg2, int arg3) {
	}

	@ObfuscatedName("Class_ra_Sub3.jg(IIII)V")
	public void jg(int arg0, int arg1, int arg2, int arg3) {
	}

	@ObfuscatedName("Class_ra_Sub3.ji(IIII)V")
	public void ji(int arg0, int arg1, int arg2, int arg3) {
	}

	@ObfuscatedName("Class_ra_Sub3.db(IIII)V")
	public void db(int arg0, int arg1, int arg2, int arg3) {
	}

	@ObfuscatedName("Class_ra_Sub3.jt()V")
	public void jt() {
	}

	@ObfuscatedName("Class_ra_Sub3.eo(Z)V")
	public void eo(boolean arg0) {
	}

	@ObfuscatedName("Class_ra_Sub3.jm(ILClass77;)V")
	public void jm(int arg0, Class77 arg1) {
		for (int var3 = 0; var3 < this.aClass6Array8647.length; var3++) {
			this.aClass6Array8647[var3].anInt90 = this.aClass6Array8647[var3].anInt88 * 428165519 * -1381026891 * 1394455919 * 536502941;
			this.aClass6Array8647[var3].anInt92 = arg0 * 1365791405 * 579526949;
			this.aClass6Array8647[var3].anInt88 = arg1.anInt652 * -1037349593 * -194741821 * 536502941;
			this.aClass6Array8647[var3].anInt93 = arg1.anInt650 * -2010008277 * -2137611395 * -1466095361;
			this.aClass6Array8647[var3].aBoolean91 = true;
		}
	}

	@ObfuscatedName("Class_ra_Sub3.jo(ILClass77;)V")
	public void jo(int arg0, Class77 arg1) {
		for (int var3 = 0; var3 < this.aClass6Array8647.length; var3++) {
			this.aClass6Array8647[var3].anInt90 = this.aClass6Array8647[var3].anInt88 * 428165519 * -1381026891 * 1394455919 * 536502941;
			this.aClass6Array8647[var3].anInt92 = arg0 * 1365791405 * 579526949;
			this.aClass6Array8647[var3].anInt88 = arg1.anInt652 * -1037349593 * -194741821 * 536502941;
			this.aClass6Array8647[var3].anInt93 = arg1.anInt650 * -2010008277 * -2137611395 * -1466095361;
			this.aClass6Array8647[var3].aBoolean91 = true;
		}
	}

	@ObfuscatedName("Class_ra_Sub3.jf(ILClass77;)V")
	public void jf(int arg0, Class77 arg1) {
		for (int var3 = 0; var3 < this.aClass6Array8647.length; var3++) {
			this.aClass6Array8647[var3].anInt90 = this.aClass6Array8647[var3].anInt88 * 428165519 * -1381026891 * 1394455919 * 536502941;
			this.aClass6Array8647[var3].anInt92 = arg0 * 1365791405 * 579526949;
			this.aClass6Array8647[var3].anInt88 = arg1.anInt652 * -1037349593 * -194741821 * 536502941;
			this.aClass6Array8647[var3].anInt93 = arg1.anInt650 * -2010008277 * -2137611395 * -1466095361;
			this.aClass6Array8647[var3].aBoolean91 = true;
		}
	}

	@ObfuscatedName("Class_ra_Sub3.jb(ILClass77;)V")
	public void jb(int arg0, Class77 arg1) {
		for (int var3 = 0; var3 < this.aClass6Array8647.length; var3++) {
			this.aClass6Array8647[var3].anInt90 = this.aClass6Array8647[var3].anInt88 * 428165519 * -1381026891 * 1394455919 * 536502941;
			this.aClass6Array8647[var3].anInt92 = arg0 * 1365791405 * 579526949;
			this.aClass6Array8647[var3].anInt88 = arg1.anInt652 * -1037349593 * -194741821 * 536502941;
			this.aClass6Array8647[var3].anInt93 = arg1.anInt650 * -2010008277 * -2137611395 * -1466095361;
			this.aClass6Array8647[var3].aBoolean91 = true;
		}
	}

	@ObfuscatedName("Class_ra_Sub3.jj(ILClass77;)V")
	public void jj(int arg0, Class77 arg1) {
		Class6 var3 = this.method5206(Thread.currentThread());
		var3.anInt92 = arg0 * 1365791405 * 579526949;
		var3.anInt88 = arg1.anInt652 * -194741821 * -1037349593 * 536502941;
		var3.anInt93 = arg1.anInt650 * -2137611395 * -2010008277 * -1466095361;
	}

	public void method4803(int[] arg0) {
		arg0[0] = this.anInt8618;
		arg0[1] = this.anInt8619;
	}

	@ObfuscatedName("Class_ra_Sub3.jq(ILClass77;)V")
	public void jq(int arg0, Class77 arg1) {
		Class6 var3 = this.method5206(Thread.currentThread());
		var3.anInt92 = arg0 * 1365791405 * 579526949;
		var3.anInt88 = arg1.anInt652 * -194741821 * -1037349593 * 536502941;
		var3.anInt93 = arg1.anInt650 * -2137611395 * -2010008277 * -1466095361;
	}

	@ObfuscatedName("Class_ra_Sub3.jh()V")
	public void jh() {
		for (int var1 = 0; var1 < this.aClass6Array8647.length; var1++) {
			this.aClass6Array8647[var1].anInt88 = this.aClass6Array8647[var1].anInt90 * -1381026891 * 428165519 * 1394455919 * 536502941;
			this.aClass6Array8647[var1].aBoolean91 = false;
		}
	}

	@ObfuscatedName("Class_ra_Sub3.jr(IIFIIFIIFIIII)V")
	public void jr(int arg0, int arg1, float arg2, int arg3, int arg4, float arg5, int arg6, int arg7, float arg8, int arg9, int arg10, int arg11, int arg12) {
		boolean var14 = this.anIntArray8630 != null;
		boolean var15 = this.aFloatArray8620 != null;
		if (!var14 && !var15) {
			return;
		}
		Class6 var16 = this.method5206(Thread.currentThread());
		Class38 var17 = var16.aClass38_94;
		var17.aBoolean384 = false;
		int var19 = arg0 - this.anInt8621 * 1907727929 * 512290825;
		int var21 = arg3 - this.anInt8621 * 1907727929 * 512290825;
		int var23 = arg6 - this.anInt8621 * 1907727929 * 512290825;
		int var20 = arg1 - this.anInt8623 * 766013039 * -1679642481;
		int var22 = arg4 - this.anInt8623 * 766013039 * -1679642481;
		int var24 = arg7 - this.anInt8623 * 766013039 * -1679642481;
		var17.aBoolean387 = var19 < 0 || var19 > var17.anInt396 * -71748021 * 1568891747 || var21 < 0 || var21 > var17.anInt396 * -71748021 * 1568891747 || var23 < 0 || var23 > var17.anInt396 * -71748021 * 1568891747;
		int var18 = arg9 >>> 24;
		if (arg12 == 0 || arg12 == 1 && var18 == 255) {
			var17.anInt402 = 0;
			var17.aBoolean383 = false;
			var17.method538(var14, var15, false, (float) var20, (float) var22, (float) var24, (float) var19, (float) var21, (float) var23, arg2, arg5, arg8, arg9, arg10, arg11);
		} else if (arg12 == 1) {
			var17.anInt402 = 255 - var18;
			var17.aBoolean383 = false;
			var17.method538(var14, var15, false, (float) var20, (float) var22, (float) var24, (float) var19, (float) var21, (float) var23, arg2, arg5, arg8, arg9, arg10, arg11);
		} else if (arg12 == 2) {
			var17.anInt402 = 128;
			var17.aBoolean383 = true;
			var17.method538(var14, var15, false, (float) var20, (float) var22, (float) var24, (float) var19, (float) var21, (float) var23, arg2, arg5, arg8, arg9, arg10, arg11);
		} else {
			throw new IllegalArgumentException();
		}
		var17.aBoolean384 = true;
	}

	@ObfuscatedName("Class_ra_Sub3.jd(FFF[F)V")
	public void jd(float arg0, float arg1, float arg2, float[] arg3) {
		float var5 = this.aClass249_8634.aFloatArray2631[7] * arg1 + this.aClass249_8634.aFloatArray2631[15] + this.aClass249_8634.aFloatArray2631[3] * arg0 + this.aClass249_8634.aFloatArray2631[11] * arg2;
		float var6 = this.aClass249_8634.aFloatArray2631[12] + arg0 * this.aClass249_8634.aFloatArray2631[0] + this.aClass249_8634.aFloatArray2631[4] * arg1 + arg2 * this.aClass249_8634.aFloatArray2631[8];
		float var7 = this.aClass249_8634.aFloatArray2631[5] * arg1 + this.aClass249_8634.aFloatArray2631[1] * arg0 + this.aClass249_8634.aFloatArray2631[13] + arg2 * this.aClass249_8634.aFloatArray2631[9];
		float var8 = arg1 * this.aClass249_8632.aFloatArray2631[6] + this.aClass249_8632.aFloatArray2631[14] + arg0 * this.aClass249_8632.aFloatArray2631[2] + this.aClass249_8632.aFloatArray2631[10] * arg2;
		arg3[0] = this.aFloat8641 + this.aFloat8640 * var6 / var5;
		arg3[1] = this.aFloat8642 * var7 / var5 + this.aFloat8643;
		arg3[2] = var8;
	}

	@ObfuscatedName("Class_ra_Sub3.jz(FFF[F)V")
	public void jz(float arg0, float arg1, float arg2, float[] arg3) {
		float var5 = this.aClass249_8634.aFloatArray2631[7] * arg1 + this.aClass249_8634.aFloatArray2631[15] + this.aClass249_8634.aFloatArray2631[3] * arg0 + this.aClass249_8634.aFloatArray2631[11] * arg2;
		float var6 = this.aClass249_8634.aFloatArray2631[12] + arg0 * this.aClass249_8634.aFloatArray2631[0] + this.aClass249_8634.aFloatArray2631[4] * arg1 + arg2 * this.aClass249_8634.aFloatArray2631[8];
		float var7 = this.aClass249_8634.aFloatArray2631[5] * arg1 + this.aClass249_8634.aFloatArray2631[1] * arg0 + this.aClass249_8634.aFloatArray2631[13] + arg2 * this.aClass249_8634.aFloatArray2631[9];
		float var8 = arg1 * this.aClass249_8632.aFloatArray2631[6] + this.aClass249_8632.aFloatArray2631[14] + arg0 * this.aClass249_8632.aFloatArray2631[2] + this.aClass249_8632.aFloatArray2631[10] * arg2;
		arg3[0] = this.aFloat8641 + this.aFloat8640 * var6 / var5;
		arg3[1] = this.aFloat8642 * var7 / var5 + this.aFloat8643;
		arg3[2] = var8;
	}

	@ObfuscatedName("Class_ra_Sub3.jl(FFF[F)V")
	public void jl(float arg0, float arg1, float arg2, float[] arg3) {
		float var5 = this.aClass249_8634.aFloatArray2631[10] * arg2 + arg1 * this.aClass249_8634.aFloatArray2631[6] + arg0 * this.aClass249_8634.aFloatArray2631[2] + this.aClass249_8634.aFloatArray2631[14];
		float var6 = this.aClass249_8634.aFloatArray2631[15] + arg0 * this.aClass249_8634.aFloatArray2631[3] + arg1 * this.aClass249_8634.aFloatArray2631[7] + this.aClass249_8634.aFloatArray2631[11] * arg2;
		if (var5 < -var6 || var5 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		float var7 = arg1 * this.aClass249_8634.aFloatArray2631[4] + arg0 * this.aClass249_8634.aFloatArray2631[0] + this.aClass249_8634.aFloatArray2631[12] + this.aClass249_8634.aFloatArray2631[8] * arg2;
		if (var7 < -var6 || var7 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		float var8 = this.aClass249_8634.aFloatArray2631[13] + arg0 * this.aClass249_8634.aFloatArray2631[1] + this.aClass249_8634.aFloatArray2631[5] * arg1 + arg2 * this.aClass249_8634.aFloatArray2631[9];
		if (var8 < -var6 || var8 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			float var9 = this.aClass249_8632.aFloatArray2631[14] + arg0 * this.aClass249_8632.aFloatArray2631[2] + arg1 * this.aClass249_8632.aFloatArray2631[6] + this.aClass249_8632.aFloatArray2631[10] * arg2;
			arg3[0] = this.aFloat8641 + this.aFloat8640 * var7 / var6;
			arg3[1] = this.aFloat8643 + this.aFloat8642 * var8 / var6;
			arg3[2] = var9;
		}
	}

	public void method_if(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.aClass6Array8647.length; var4++) {
			Class6 var5 = this.aClass6Array8647[var4];
			var5.anInt88 = (arg0 & 0xFFFFFF) * -1381026891 * 536502941;
			int var6 = var5.anInt88 * -1381026891 * 536502941 >>> 16 & 0xFF;
			if (var6 < 2) {
				var6 = 2;
			}
			int var7 = var5.anInt88 * 536502941 * -1381026891 >> 8 & 0xFF;
			if (var7 < 2) {
				var7 = 2;
			}
			int var8 = var5.anInt88 * -1381026891 * 536502941 & 0xFF;
			if (var8 < 2) {
				var8 = 2;
			}
			var5.anInt88 = (var6 << 16 | var7 << 8 | var8) * -1381026891 * 536502941;
			if (arg1 < 0) {
				var5.aBoolean86 = false;
			} else {
				var5.aBoolean86 = true;
			}
		}
	}

	@ObfuscatedName("Class_ra_Sub3.jy()LClass76_Sub2;")
	public Class76_Sub2 jy() {
		return new Class76_Sub2_Sub1(this);
	}

	@ObfuscatedName("Class_ra_Sub3.ej()Z")
	public boolean ej() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.im()V")
	public void im() {
	}

	@ObfuscatedName("Class_ra_Sub3.jv()LClass76_Sub2;")
	public Class76_Sub2 jv() {
		return new Class76_Sub2_Sub1(this);
	}

	@ObfuscatedName("Class_ra_Sub3.go(LClass_v;)V")
	public void go(Class_v arg0) {
	}

	@ObfuscatedName("Class_ra_Sub3.jx(IILClass72;LClass86;I)LInterface8_Impl1_Impl2;")
	public Interface8_Impl1_Impl2 jx(int arg0, int arg1, Class72 arg2, Class86 arg3, int arg4) {
		return this.method5202(arg0, arg1);
	}

	@ObfuscatedName("Class_ra_Sub3.kp(II)LInterface8_Impl1_Impl1;")
	public Interface8_Impl1_Impl1 kp(int arg0, int arg1) {
		return new Class43(arg0, arg1);
	}

	@ObfuscatedName("Class_ra_Sub3.kh(III)LInterface8_Impl1_Impl1;")
	public Interface8_Impl1_Impl1 kh(int arg0, int arg1, int arg2) {
		return new Class43(arg0, arg1);
	}

	@ObfuscatedName("Class_ra_Sub3.kv(III)LInterface8_Impl1_Impl1;")
	public Interface8_Impl1_Impl1 kv(int arg0, int arg1, int arg2) {
		return new Class43(arg0, arg1);
	}

	@ObfuscatedName("Class_ra_Sub3.kj()Z")
	public boolean kj() {
		return true;
	}

	@ObfuscatedName("Class_ra_Sub3.ka()Z")
	public boolean ka() {
		return true;
	}

	@ObfuscatedName("Class_ra_Sub3.km()Z")
	public boolean km() {
		return true;
	}

	@ObfuscatedName("Class_ra_Sub3.ct(II)I")
	public int ct(int arg0, int arg1) {
		int var3 = arg0 | 0x20800;
		return var3 & arg1 ^ arg1;
	}

	@ObfuscatedName("Class_ra_Sub3.fg(IIII)V")
	public void fg(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt8618 * -29235085 * -1504772933) {
			arg2 = this.anInt8618 * -29235085 * -1504772933;
		}
		if (arg3 > this.anInt8619 * 1870465245 * 1229852533) {
			arg3 = this.anInt8619 * 1870465245 * 1229852533;
		}
		this.anInt8621 = arg0 * 1907727929 * 512290825;
		this.anInt8635 = arg2 * -711985315 * -1071049483;
		this.anInt8623 = arg1 * 766013039 * -1679642481;
		this.anInt8624 = arg3 * -550983163 * 31822541;
		this.method5195();
	}

	@ObfuscatedName("Class_ra_Sub3.kt(IIIIIILClass_ta;IIIII)V")
	public void kt(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Class_ta arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		if (this.anIntArray8630 == null) {
			return;
		}
		Class_ta_Sub3 var13 = (Class_ta_Sub3) arg6;
		int[] var14 = var13.anIntArray8661;
		int[] var15 = var13.anIntArray8662;
		int var16 = this.anInt8623 * 766013039 * -1679642481 > arg8 ? this.anInt8623 * 766013039 * -1679642481 : arg8;
		int var17 = this.anInt8624 * -550983163 * 31822541 < var14.length + arg8 ? this.anInt8624 * -550983163 * 31822541 : var14.length + arg8;
		int var34 = arg11 << 8;
		int var32 = arg9 << 8;
		int var33 = arg10 << 8;
		int var18 = var32 + var33;
		arg11 = var34 % var18;
		arg2 -= arg0;
		arg3 -= arg1;
		int var19;
		int var20;
		if (arg3 + arg2 < 0) {
			var19 = (int) (Math.sqrt((double) (arg3 * arg3 + arg2 * arg2)) * 256.0D);
			var20 = var19 % var18;
			var34 = var32 + var18 - arg11 - var20;
			arg11 = var34 % var18;
			if (arg11 < 0) {
				arg11 += var18;
			}
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		int var21;
		int var22;
		int var23;
		int var24;
		int var25;
		int var26;
		int var27;
		int var29;
		int var30;
		int var31;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			var29 = arg2 << 16;
			var19 = (int) Math.floor((double) var29 / (double) arg3 + 0.5D);
			var20 = (int) Math.sqrt((double) ((var19 >> 8) * (var19 >> 8) + 65536));
			var30 = arg3 + arg1;
			var21 = arg4 >>> 24;
			if (arg5 == 0 || arg5 == 1 && var21 == 255) {
				while (arg1 <= var30) {
					var22 = arg0 >> 16;
					var23 = arg1 - arg8;
					if (arg1 >= var16 && arg1 < var17 && var22 >= this.anInt8621 * 512290825 * 1907727929 && var22 < this.anInt8635 * -711985315 * -1071049483 && arg11 < var32 && var22 >= var14[var23] + arg7 && var22 < var14[var23] + arg7 + var15[var23]) {
						this.anIntArray8630[this.anInt8618 * -29235085 * -1504772933 * arg1 + var22] = arg4;
					}
					arg0 += var19;
					arg1++;
					var34 = arg11 + var20;
					arg11 = var34 % var18;
				}
			} else if (arg5 == 1) {
				var31 = (var21 * (arg4 & 0xFF00FF) >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * var21 >> 8 & 0xFF00) + (var21 << 24);
				var22 = 256 - var21;
				while (arg1 <= var30) {
					var23 = arg0 >> 16;
					var24 = arg1 - arg8;
					if (arg1 >= var16 && arg1 < var17 && var23 >= this.anInt8621 * 512290825 * 1907727929 && var23 < this.anInt8635 * -711985315 * -1071049483 && arg11 < var32 && var23 >= var14[var24] + arg7 && var23 < var15[var24] + var14[var24] + arg7) {
						var25 = var23 + this.anInt8618 * -29235085 * -1504772933 * arg1;
						var26 = this.anIntArray8630[var25];
						var26 = (var22 * (var26 & 0xFF00FF) >> 8 & 0xFF00FF) + (var22 * (var26 & 0xFF00) >> 8 & 0xFF00);
						this.anIntArray8630[this.anInt8618 * -29235085 * -1504772933 * arg1 + var23] = var31 + var26;
					}
					arg0 += var19;
					arg1++;
					var34 = arg11 + var20;
					arg11 = var34 % var18;
				}
			} else if (arg5 == 2) {
				while (arg1 <= var30) {
					var22 = arg0 >> 16;
					var23 = arg1 - arg8;
					if (arg1 >= var16 && arg1 < var17 && var22 >= this.anInt8621 * 512290825 * 1907727929 && var22 < this.anInt8635 * -1071049483 * -711985315 && arg11 < var32 && var22 >= var14[var23] + arg7 && var22 < arg7 + var14[var23] + var15[var23]) {
						var24 = var22 + this.anInt8618 * -1504772933 * -29235085 * arg1;
						var25 = this.anIntArray8630[var24];
						var26 = var25 + arg4;
						var27 = (var25 & 0xFF00FF) + (arg4 & 0xFF00FF);
						var25 = (var27 & 0x1000100) + (var26 - var27 & 0x10000);
						this.anIntArray8630[var24] = var26 - var25 | var25 - (var25 >>> 8);
					}
					arg0 += var19;
					arg1++;
					var34 = arg11 + var20;
					arg11 = var34 % var18;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		var30 = arg3 << 16;
		var19 = (int) Math.floor((double) var30 / (double) arg2 + 0.5D);
		var29 = arg2 + arg0;
		var20 = arg4 >>> 24;
		var21 = (int) Math.sqrt((double) ((var19 >> 8) * (var19 >> 8) + 65536));
		if (arg5 == 0 || arg5 == 1 && var20 == 255) {
			while (arg0 <= var29) {
				var22 = arg1 >> 16;
				var23 = var22 - arg8;
				if (arg0 >= this.anInt8621 * 512290825 * 1907727929 && arg0 < this.anInt8635 * -711985315 * -1071049483 && var22 >= var16 && var22 < var17 && arg11 < var32) {
					var24 = arg7 + var14[var23];
					if (arg0 >= var24 && arg0 < var24 + var15[var23]) {
						this.anIntArray8630[this.anInt8618 * -29235085 * -1504772933 * var22 + arg0] = arg4;
					}
				}
				arg1 += var19;
				arg0++;
				var34 = arg11 + var21;
				arg11 = var34 % var18;
			}
		} else if (arg5 == 1) {
			var31 = ((arg4 & 0xFF00FF) * var20 >> 8 & 0xFF00FF) + (var20 * (arg4 & 0xFF00) >> 8 & 0xFF00) + (var20 << 24);
			var22 = 256 - var20;
			while (arg0 <= var29) {
				var23 = arg1 >> 16;
				var24 = var23 - arg8;
				if (arg0 >= this.anInt8621 * 1907727929 * 512290825 && arg0 < this.anInt8635 * -1071049483 * -711985315 && var23 >= var16 && var23 < var17 && arg11 < var32) {
					var25 = var14[var24] + arg7;
					if (arg0 >= var25 && arg0 < var15[var24] + var25) {
						var26 = var23 * -1504772933 * this.anInt8618 * -29235085 + arg0;
						var27 = this.anIntArray8630[var26];
						int var35 = ((var27 & 0xFF00) * var22 >> 8 & 0xFF00) + ((var27 & 0xFF00FF) * var22 >> 8 & 0xFF00FF);
						this.anIntArray8630[var26] = var35 + var31;
					}
				}
				arg1 += var19;
				arg0++;
				var34 = arg11 + var21;
				arg11 = var34 % var18;
			}
		} else if (arg5 == 2) {
			while (arg0 <= var29) {
				var22 = arg1 >> 16;
				var23 = var22 - arg8;
				if (arg0 >= this.anInt8621 * 512290825 * 1907727929 && arg0 < this.anInt8635 * -1071049483 * -711985315 && var22 >= var16 && var22 < var17 && arg11 < var32) {
					var24 = var14[var23] + arg7;
					if (arg0 >= var24 && arg0 < var24 + var15[var23]) {
						var25 = arg0 + this.anInt8618 * -1504772933 * -29235085 * var22;
						var26 = this.anIntArray8630[var25];
						var27 = var26 + arg4;
						int var28 = (arg4 & 0xFF00FF) + (var26 & 0xFF00FF);
						var26 = (var28 & 0x1000100) + (var27 - var28 & 0x10000);
						this.anIntArray8630[var25] = var27 - var26 | var26 - (var26 >>> 8);
					}
				}
				arg1 += var19;
				arg0++;
				var34 = arg11 + var21;
				arg11 = var34 % var18;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("Class_ra_Sub3.dn()V")
	public void dn() {
		if (this.aBoolean8616) {
			Class95_Sub12.method1137(true, false, -1538880482);
			this.aBoolean8616 = false;
		}
		this.aBoolean8648 = true;
	}

	@ObfuscatedName("Class_ra_Sub3.kc()LClass249;")
	public Class249 kc() {
		Class6 var1 = this.method5206(Thread.currentThread());
		return var1.aClass249_95;
	}

	@ObfuscatedName("Class_ra_Sub3.kf()LClass249;")
	public Class249 kf() {
		Class6 var1 = this.method5206(Thread.currentThread());
		return var1.aClass249_95;
	}

	@ObfuscatedName("Class_ra_Sub3.kx()LClass247;")
	public Class247 kx() {
		Class6 var1 = this.method5206(Thread.currentThread());
		return var1.aClass247_83;
	}

	@ObfuscatedName("Class_ra_Sub3.kw()LClass247;")
	public Class247 kw() {
		Class6 var1 = this.method5206(Thread.currentThread());
		return var1.aClass247_83;
	}

	@ObfuscatedName("Class_ra_Sub3.O()V")
	public void O() {
		for (int var1 = 0; var1 < this.aClass6Array8647.length; var1++) {
			this.aClass6Array8647[var1].anInt88 = this.aClass6Array8647[var1].anInt90;
			this.aClass6Array8647[var1].aBoolean91 = false;
		}
	}

	@ObfuscatedName("Class_ra_Sub3.kk()V")
	public void kk() {
		this.anInt8636 = 0 * 960350685;
		this.anInt8622 = 0 * 1359775523;
		this.anInt8638 = this.anInt8618 * -1418534287 * -29235085 * 52203499;
		this.anInt8614 = this.anInt8619 * 873410731 * 1870465245 * 1426128991;
		this.method5195();
	}

	@ObfuscatedName("Class_ra_Sub3.kq()V")
	public void kq() {
		this.anInt8636 = 0 * 960350685;
		this.anInt8622 = 0 * 1359775523;
		this.anInt8638 = this.anInt8618 * -1418534287 * -29235085 * 52203499;
		this.anInt8614 = this.anInt8619 * 873410731 * 1870465245 * 1426128991;
		this.method5195();
	}

	@ObfuscatedName("Class_ra_Sub3.ec()Z")
	public boolean ec() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub3.kg()V")
	public void kg() {
		this.anInt8636 = 0 * 960350685;
		this.anInt8622 = 0 * 1359775523;
		this.anInt8638 = this.anInt8618 * -1418534287 * -29235085 * 52203499;
		this.anInt8614 = this.anInt8619 * 873410731 * 1870465245 * 1426128991;
		this.method5195();
	}

	@ObfuscatedName("Class_ra_Sub3.ko()V")
	public void ko() {
		this.anInt8621 = 0 * 512290825;
		this.anInt8623 = 0 * -1679642481;
		this.anInt8635 = this.anInt8618 * -29235085 * 1677671663 * -1071049483;
		this.anInt8624 = this.anInt8619 * -1710096567 * 1870465245 * 31822541;
		this.method5195();
	}

	@ObfuscatedName("Class_ra_Sub3.kz()V")
	public void kz() {
		this.anInt8621 = 0 * 512290825;
		this.anInt8623 = 0 * -1679642481;
		this.anInt8635 = this.anInt8618 * -29235085 * 1677671663 * -1071049483;
		this.anInt8624 = this.anInt8619 * -1710096567 * 1870465245 * 31822541;
		this.method5195();
	}

	@ObfuscatedName("Class_ra_Sub3.N(IIIIII[BII)V")
	public void N(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
		if (this.anIntArray8630 == null || arg2 <= 0 || arg3 <= 0) {
			return;
		}
		int var10 = 0;
		int var11 = 0;
		int var12 = (arg7 << 16) / arg2;
		int var13 = (arg6.length / arg7 << 16) / arg3;
		int var14 = arg1 * this.anInt8618 + arg0;
		int var15 = this.anInt8618 - arg2;
		if (arg1 + arg3 > this.anInt8624) {
			arg3 -= arg1 + arg3 - this.anInt8624;
		}
		int var16;
		if (arg1 < this.anInt8623) {
			var16 = this.anInt8623 - arg1;
			arg3 -= var16;
			var14 += var16 * this.anInt8618;
			var11 += var13 * var16;
		}
		if (arg0 + arg2 > this.anInt8635) {
			var16 = arg0 + arg2 - this.anInt8635;
			arg2 -= var16;
			var15 += var16;
		}
		if (arg0 < this.anInt8621) {
			var16 = this.anInt8621 - arg0;
			arg2 -= var16;
			var14 += var16;
			var10 += var12 * var16;
			var15 += var16;
		}
		var16 = arg4 >>> 24;
		int var17 = arg5 >>> 24;
		int var18;
		int var19;
		int var20;
		int var21;
		if (arg8 == 0 || arg8 == 1 && var16 == 255 && var17 == 255) {
			var18 = var10;
			for (var19 = -arg3; var19 < 0; var19++) {
				var20 = arg7 * (var11 >> 16);
				for (var21 = -arg2; var21 < 0; var21++) {
					if (arg6[(var10 >> 16) + var20] == 0) {
						this.anIntArray8630[var14++] = arg4;
					} else {
						this.anIntArray8630[var14++] = arg5;
					}
					var10 += var12;
				}
				var11 += var13;
				var10 = var18;
				var14 += var15;
			}
			return;
		}
		int var22;
		int var23;
		int var24;
		int var25;
		if (arg8 == 1) {
			var18 = var10;
			for (var19 = -arg3; var19 < 0; var19++) {
				var20 = arg7 * (var11 >> 16);
				for (var21 = -arg2; var21 < 0; var21++) {
					var22 = arg4;
					if (arg6[(var10 >> 16) + var20] != 0) {
						var22 = arg5;
					}
					var23 = var22 >>> 24;
					var24 = 255 - var23;
					var25 = this.anIntArray8630[var14];
					this.anIntArray8630[var14++] = (var23 * (var22 & 0xFF00) + (var25 & 0xFF00) * var24 & 0xFF0000) + (var24 * (var25 & 0xFF00FF) + (var22 & 0xFF00FF) * var23 & 0xFF00FF00) >> 8;
					var10 += var12;
				}
				var11 += var13;
				var10 = var18;
				var14 += var15;
			}
		} else if (arg8 == 2) {
			var18 = var10;
			for (var19 = -arg3; var19 < 0; var19++) {
				var20 = (var11 >> 16) * arg7;
				for (var21 = -arg2; var21 < 0; var21++) {
					var22 = arg4;
					if (arg6[var20 + (var10 >> 16)] != 0) {
						var22 = arg5;
					}
					if (var22 == 0) {
						var14++;
					} else {
						var23 = this.anIntArray8630[var14];
						var24 = var23 + var22;
						var25 = (var22 & 0xFF00FF) + (var23 & 0xFF00FF);
						var23 = (var24 - var25 & 0x10000) + (var25 & 0x1000100);
						this.anIntArray8630[var14++] = var24 - var23 | var23 - (var23 >>> 8);
					}
					var10 += var12;
				}
				var11 += var13;
				var10 = var18;
				var14 += var15;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("Class_ra_Sub3.kd(LClass247;)V")
	public void kd(Class247 arg0) {
		this.aClass247_8629 = arg0;
		this.method5188();
	}

	@ObfuscatedName("Class_ra_Sub3.ks(Z)V")
	public void ks(boolean arg0) {
		Class6 var2 = this.method5206(Thread.currentThread());
		var2.aBoolean111 = arg0;
	}

	@ObfuscatedName("Class_ra_Sub3.lp(Z)V")
	public void lp(boolean arg0) {
		Class6 var2 = this.method5206(Thread.currentThread());
		var2.aBoolean111 = arg0;
	}

	@ObfuscatedName("Class_ra_Sub3.lo()I")
	public int lo() {
		return 0;
	}

	public static void method5211(byte arg0) {
		try {
			if (Class5.anInt75 < 102) {
				Class5.anInt75 += 6;
			}
			int var1;
			if (Class5.anInt79 != -1 && Class5.aLong74 < Class312.method3111((byte) 87)) {
				for (var1 = Class5.anInt79; var1 < Class380.aStringArray3960.length; var1++) {
					if (Class380.aStringArray3960[var1].startsWith("pause")) {
						int var2 = 5;
						try {
							var2 = Integer.parseInt(Class380.aStringArray3960[var1].substring(6));
						} catch (Exception var9) {
						}
						Class56.panelBoxMessage("Pausing for " + var2 + " seconds...", 496170579);
						Class5.anInt79 = var1 + 1;
						Class5.aLong74 = Class312.method3111((byte) 45) + (long) (var2 * 1000);
						return;
					}
					Class5.aString73 = Class380.aStringArray3960[var1];
					Class201.method2164(false, (byte) 10);
				}
				Class5.anInt79 = -1;
			}
			if (client.mouseNotches != 0) {
				Class5.anInt77 -= client.mouseNotches * 5;
				if (Class5.anInt77 >= Class5.anInt71) {
					Class5.anInt77 = Class5.anInt71 - 1;
				}
				if (Class5.anInt77 < 0) {
					Class5.anInt77 = 0;
				}
				client.mouseNotches = 0;
			}
			for (var1 = 0; var1 < client.anInt9000; var1++) {
				Interface18 var12 = client.anInterface18Array9001[var1];
				int var3 = var12.method264((byte) 0);
				char var4 = var12.method270(2125862514);
				int var5 = var12.method268((byte) -2);
				if (var3 == 84) {
					Class201.method2164(false, (byte) 10);
				}
				if (var3 == 80) {
					Class201.method2164(true, (byte) 10);
				} else if (var3 == 66 && (var5 & 0x4) != 0) {
					if (Class391.aClipboard4063 != null) {
						String var13 = "";
						for (int var14 = Class5.aStringArray68.length - 1; var14 >= 0; var14--) {
							if (Class5.aStringArray68[var14] != null && Class5.aStringArray68[var14].length() > 0) {
								var13 = var13 + Class5.aStringArray68[var14] + '\n';
							}
						}
						Class391.aClipboard4063.setContents(new StringSelection(var13), null);
					}
				} else if (var3 == 67 && (var5 & 0x4) != 0) {
					if (Class391.aClipboard4063 != null) {
						try {
							Transferable var6 = Class391.aClipboard4063.getContents(null);
							if (var6 != null) {
								String var7 = (String) var6.getTransferData(DataFlavor.stringFlavor);
								if (var7 != null) {
									String[] var8 = Class226.method2309(var7, '\n', (byte) -79);
									Class352.method4072(var8, -2039971238);
								}
							}
						} catch (Exception var10) {
						}
					}
				} else if (var3 == 85 && Class5.anInt76 > 0) {
					Class5.aString73 = Class5.aString73.substring(0, Class5.anInt76 - 1) + Class5.aString73.substring(Class5.anInt76);
					Class5.anInt76--;
				} else if (var3 == 101 && Class5.anInt76 < Class5.aString73.length()) {
					Class5.aString73 = Class5.aString73.substring(0, Class5.anInt76) + Class5.aString73.substring(Class5.anInt76 + 1);
				} else if (var3 == 96 && Class5.anInt76 > 0) {
					Class5.anInt76--;
				} else if (var3 == 97 && Class5.anInt76 < Class5.aString73.length()) {
					Class5.anInt76++;
				} else if (var3 == 102) {
					Class5.anInt76 = 0;
				} else if (var3 == 103) {
					Class5.anInt76 = Class5.aString73.length();
				} else if (var3 == 104 && Class5.anInt72 < Class5.aStringArray68.length) {
					Class5.anInt72++;
					Class64.method773(536357521);
					Class5.anInt76 = Class5.aString73.length();
				} else if (var3 == 105 && Class5.anInt72 > 0) {
					Class5.anInt72--;
					Class64.method773(536357521);
					Class5.anInt76 = Class5.aString73.length();
				} else if (Class263.method2614(var4, 1123940032) || "\\/.:, _-+[]~@".indexOf(var4) != -1) {
					Class5.aString73 = Class5.aString73.substring(0, Class5.anInt76) + client.anInterface18Array9001[var1].method270(1715018809) + Class5.aString73.substring(Class5.anInt76);
					Class5.anInt76++;
				}
			}
			client.anInt9000 = 0;
			client.anInt9003 = 0;
			Class464.method5726(-1398862787);
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "yx.z(" + ')');
		}
	}

	public static void method5212(Player arg0, int arg1) {
		try {
			Class330_Sub20 var2 = (Class330_Sub20) Class330_Sub20.aClass497_7651.method6094((long) arg0.anInt10008);
			if (var2 == null) {
				Class_ra.method4809(arg0.aByte8658, arg0.anIntArray10018[0], arg0.anIntArray10059[0], 0, null, null, arg0, -467956056);
			} else {
				var2.method3373((byte) -31);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "yx.z(" + ')');
		}
	}

	public static Class325_Sub1 method5213(int arg0) {
		try {
			Class325_Sub1 var1 = (Class325_Sub1) Class325_Sub1.aClass467_7476.method5853((byte) 14);
			if (var1 == null) {
				return new Class325_Sub1();
			} else {
				Class325_Sub1.anInt7472--;
				return var1;
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "yx.j(" + ')');
		}
	}

	public static boolean method5214(int arg0) {
		try {
			boolean var1;
			try {
				Class557 var2 = new Class557();
				byte[] var3 = var2.method6452(Class248.aByteArray6592, (short) 32128);
				Class306.method3052(var3, 1808341042);
				var1 = true;
			} catch (Exception var4) {
				return false;
			}
			return var1;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "yx.p(" + ')');
		}
	}

	public static final void method5215(Class430 arg0, byte arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = ((Class432_Sub1) arg0.anInterface2_4389).method5363(-1876483656);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "yx.arv(" + ')');
		}
	}

	public static final void method5216(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class515.method6205(var3, var4, arg0, 505514871);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "yx.ha(" + ')');
		}
	}

	public static void method5217(int arg0, String arg1, int arg2) {
		try {
			Class330_Sub36_Sub3 var3 = Class464_Sub4.method5750(2, (long) arg0);
			var3.method3445((byte) 0);
			var3.aString9649 = arg1;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "yx.aj(" + ')');
		}
	}

	public static boolean method5218(Class330_Sub46_Sub2 arg0, int arg1, int arg2) {
		try {
			int var3 = arg0.readBits(2);
			int var4;
			int var5;
			int var9;
			int var10;
			int var11;
			if (var3 == 0) {
				if (arg0.readBits(1) != 0) {
					method5218(arg0, arg1, 1988269557);
				}
				var4 = arg0.readBits(6);
				var5 = arg0.readBits(6);
				boolean var17 = arg0.readBits(1) == 1;
				if (var17) {
					Class15.anIntArray196[++Class15.anInt197 - 1] = arg1;
				}
				if (client.players[arg1] != null) {
					throw new RuntimeException();
				}
				Class26 var18 = Class15.aClass26Array198[arg1];
				Player var19 = client.players[arg1] = new Player(client.aClass304_9030.method3023(-400722441));
				var19.anInt10008 = arg1;
				if (Class15.aClass330_Sub46Array191[arg1] != null) {
					var19.sendAppearance(Class15.aClass330_Sub46Array191[arg1], 774123157);
				}
				var19.method5411(var18.anInt310, true, -99369797);
				var19.anInt10028 = var18.anInt309;
				var9 = var18.anInt313;
				var10 = var9 >> 28;
				var11 = var9 >> 14 & 0xFF;
				int var12 = var9 & 0xFF;
				Class381 var13 = client.aClass304_9030.method3022(-1066348782);
				int var14 = var4 + (var11 << 6) - var13.gameSceneBaseX;
				int var15 = var5 + (var12 << 6) - var13.gameSceneBaseY;
				var19.aBoolean10234 = var18.aBoolean312;
				var19.aBoolean10247 = var18.aBoolean311;
				var19.aByteArray10017[0] = Class15.aByteArray190[arg1];
				var19.aByte8658 = var19.aByte8654 = (byte) var10;
				if (client.aClass304_9030.method2995(665548251).method2788(var14, var15, (byte) -72)) {
					var19.aByte8654++;
				}
				var19.method5463(var14, var15, (short) 1007);
				var19.aBoolean10243 = false;
				Class15.aClass26Array198[arg1] = null;
				return true;
			} else if (var3 == 1) {
				var4 = arg0.readBits(2);
				var5 = Class15.aClass26Array198[arg1].anInt313;
				Class15.aClass26Array198[arg1].anInt313 = (var5 & 0xFFFFFFF) + ((var4 + (var5 >> 28) & 0x3) << 28);
				return false;
			} else {
				int var6;
				int var7;
				int var8;
				if (var3 != 2) {
					var4 = arg0.readBits(18);
					var5 = var4 >> 16;
					var6 = var4 >> 8 & 0xFF;
					var7 = var4 & 0xFF;
					var8 = Class15.aClass26Array198[arg1].anInt313;
					var9 = (var8 >> 28) + var5 & 0x3;
					var10 = (var8 >> 14) + var6 & 0xFF;
					var11 = var7 + var8 & 0xFF;
					Class15.aClass26Array198[arg1].anInt313 = (var10 << 14) + (var9 << 28) + var11;
					return false;
				}
				var4 = arg0.readBits(5);
				var5 = var4 >> 3;
				var6 = var4 & 0x7;
				var7 = Class15.aClass26Array198[arg1].anInt313;
				var8 = (var7 >> 28) + var5 & 0x3;
				var9 = var7 >> 14 & 0xFF;
				var10 = var7 & 0xFF;
				if (var6 == 0) {
					var9--;
					var10--;
				}
				if (var6 == 1) {
					var10--;
				}
				if (var6 == 2) {
					var9++;
					var10--;
				}
				if (var6 == 3) {
					var9--;
				}
				if (var6 == 4) {
					var9++;
				}
				if (var6 == 5) {
					var9--;
					var10++;
				}
				if (var6 == 6) {
					var10++;
				}
				if (var6 == 7) {
					var9++;
					var10++;
				}
				Class15.aClass26Array198[arg1].anInt313 = (var9 << 14) + (var8 << 28) + var10;
				return false;
			}
		} catch (RuntimeException var16) {
			throw Class476.method5964(var16, "yx.s(" + ')');
		}
	}
}
