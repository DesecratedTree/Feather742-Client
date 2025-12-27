package deob;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Class57 implements Interface_ma {

	public IndexTable aClass280_6596;

	public IndexTable aClass280_6597;

	public int anInt6595;

	public Class56[] aClass56Array6598;

	public static Class305 aClass305_6600;

	public static Class61[] aClass61Array6599;

	public int method235() {
		return this.anInt6595 * -194072327 * -756608695;
	}

	public int method219(int arg0) {
		try {
			return this.anInt6595;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "cg.r(" + ')');
		}
	}

	public boolean method237(int arg0, Class377 arg1, float arg2, int arg3, int arg4, boolean arg5, int arg6) {
		try {
			boolean var8 = true;
			if (this.aClass56Array6598[arg0].aBoolean508) {
				var8 = this.aClass280_6597.method2750(arg0, -1388100207);
			}
			return var8 & this.aClass280_6596.method2750(arg0, -644820171);
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "cg.j(" + ')');
		}
	}

	public int[] method648(int arg0, int arg1) {
		try {
			int[] var3 = this.method651(arg0, -1853234902);
			for (int var4 = 0; var4 < var3.length; var4++) {
				if ((var3[var4] & 0xFFFFFF) == 0) {
					var3[var4] &= 0xFFFFFF;
				} else {
					var3[var4] |= 0xFF000000;
				}
			}
			return var3;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "cg.i(" + ')');
		}
	}

	public float[] method649(int arg0, int arg1) {
		try {
			int[] var3 = this.method651(arg0, -1853234902);
			if (var3 == null) {
				return null;
			}
			int[] var4 = null;
			int var5 = this.aClass56Array6598[arg0].anInt532;
			int var7;
			if (this.aClass56Array6598[arg0].aBoolean508) {
				byte[] var6 = this.aClass280_6597.method2761(arg0, 1773308989);
				if (var6 != null) {
					try {
						var4 = this.method650(var6, -107277330);
						for (var7 = 0; var7 < var4.length; var7++) {
							var4[var7] &= 0xFFF;
						}
					} catch (IOException var15) {
					}
				}
			}
			if (var4 == null) {
				var4 = new int[var5 * var5];
			}
			float[] var17 = new float[var3.length * 4];
			var7 = 0;
			for (int var8 = 0; var8 < var3.length; var8++) {
				int var9 = var3[var8];
				int var10 = var9 >>> 24;
				int var11 = var9 >> 16 & 0xFF;
				int var12 = var9 >> 8 & 0xFF;
				int var13 = var9 & 0xFF;
				float var14 = (float) var4[var8] * 31.0F / 4096.0F + 1.0F;
				var17[var7++] = var14 * (float) var11 / 255.0F;
				var17[var7++] = (float) var12 * var14 / 255.0F;
				var17[var7++] = var14 * (float) var13 / 255.0F;
				var17[var7++] = (float) var10 / 255.0F;
			}
			return var17;
		} catch (RuntimeException var16) {
			throw Class476.method5964(var16, "cg.o(" + ')');
		}
	}

	public Class56 method221(int arg0, int arg1) {
		try {
			return this.aClass56Array6598[arg0];
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "cg.s(" + ')');
		}
	}

	public void method224(short arg0) {
	}

	public int method225() {
		return this.anInt6595 * -194072327 * -756608695;
	}

	public int[] method231(int arg0, float arg1, int arg2, int arg3, boolean arg4, int arg5) {
		try {
			return this.method651(arg0, -1853234902);
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "cg.w(" + ')');
		}
	}

	public float[] method222(int arg0, float arg1, int arg2, int arg3, boolean arg4, short arg5) {
		try {
			return this.method649(arg0, 218224621);
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "cg.n(" + ')');
		}
	}

	public int[] method650(byte[] arg0, int arg1) throws IOException {
		try {
			BufferedImage var3 = ImageIO.read(new ByteArrayInputStream(arg0));
			if (var3.getType() != 10 && var3.getType() != 0) {
				return var3.getRGB(0, 0, var3.getWidth(), var3.getHeight(), null, 0, var3.getWidth());
			}
			Object var4 = null;
			int[] var9 = var3.getRaster().getPixels(0, 0, var3.getWidth(), var3.getHeight(), (int[]) var4);
			int[] var5 = new int[var3.getWidth() * var3.getHeight()];
			int var6;
			if (var3.getType() == 10) {
				for (var6 = 0; var6 < var5.length; var6++) {
					var5[var6] = (var9[var6] << 16) + -16777216 + (var9[var6] << 8) + var9[var6];
				}
			} else {
				for (var6 = 0; var6 < var5.length; var6++) {
					int var7 = var6 * 2;
					var5[var6] = (var9[var7] << 16) + (var9[var7] << 8) + var9[var7] + (var9[var7 + 1] << 24);
				}
			}
			return var5;
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "cg.l(" + ')');
		}
	}

	public int[] method651(int arg0, int arg1) {
		try {
			byte[] var3 = this.aClass280_6596.method2761(arg0, 391937457);
			if (var3 == null) {
				return null;
			}
			int[] var4;
			try {
				int[] var5 = this.method650(var3, -107277330);
				var4 = var5;
			} catch (IOException var6) {
				return null;
			}
			return var4;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "cg.p(" + ')');
		}
	}

	public int[] method226(int arg0, float arg1, int arg2, int arg3, boolean arg4) {
		return this.method651(arg0, -1853234902);
	}

	public Class57(IndexTable arg0, IndexTable arg1, IndexTable arg2) {
		this.aClass280_6596 = arg1;
		this.aClass280_6597 = arg2;
		Buffer var4 = new Buffer(arg0.getFile(0, 0));
		this.anInt6595 = var4.readUnsignedShort(923327562);
		this.aClass56Array6598 = new Class56[this.anInt6595];
		int var5;
		for (var5 = 0; var5 < this.anInt6595; var5++) {
			if (var4.readUnsignedByte(1748979937) == 1) {
				this.aClass56Array6598[var5] = new Class56();
			}
		}
		for (var5 = 0; var5 < this.anInt6595; var5++) {
			if (this.aClass56Array6598[var5] != null) {
				this.aClass56Array6598[var5].aBoolean533 = var4.readUnsignedByte(2037018342) == 0;
			}
		}
		for (var5 = 0; var5 < this.anInt6595; var5++) {
			if (this.aClass56Array6598[var5] != null) {
				this.aClass56Array6598[var5].anInt532 = Class286.method2872(var4.readUnsignedByte(2120271196), -497372353);
			}
		}
		for (var5 = 0; var5 < this.anInt6595; var5++) {
			if (this.aClass56Array6598[var5] != null) {
				this.aClass56Array6598[var5].aBoolean519 = var4.readUnsignedByte(117129674) == 1;
			}
		}
		for (var5 = 0; var5 < this.anInt6595; var5++) {
			if (this.aClass56Array6598[var5] != null) {
				this.aClass56Array6598[var5].aByte534 = var4.readByte((byte) -15);
			}
		}
		for (var5 = 0; var5 < this.anInt6595; var5++) {
			if (this.aClass56Array6598[var5] != null) {
				this.aClass56Array6598[var5].aByte529 = var4.readByte((byte) 64);
			}
		}
		for (var5 = 0; var5 < this.anInt6595; var5++) {
			if (this.aClass56Array6598[var5] != null) {
				this.aClass56Array6598[var5].aByte525 = var4.readByte((byte) 41);
			}
		}
		for (var5 = 0; var5 < this.anInt6595; var5++) {
			if (this.aClass56Array6598[var5] != null) {
				this.aClass56Array6598[var5].aByte526 = var4.readByte((byte) 22);
			}
		}
		for (var5 = 0; var5 < this.anInt6595; var5++) {
			if (this.aClass56Array6598[var5] != null) {
				this.aClass56Array6598[var5].aShort523 = (short) var4.readUnsignedShort(679553769);
			}
		}
		for (var5 = 0; var5 < this.anInt6595; var5++) {
			if (this.aClass56Array6598[var5] != null) {
				this.aClass56Array6598[var5].aByte531 = var4.readByte((byte) -61);
			}
		}
		for (var5 = 0; var5 < this.anInt6595; var5++) {
			if (this.aClass56Array6598[var5] != null) {
				this.aClass56Array6598[var5].aByte530 = var4.readByte((byte) -22);
			}
		}
		for (var5 = 0; var5 < this.anInt6595; var5++) {
			if (this.aClass56Array6598[var5] != null) {
				this.aClass56Array6598[var5].aBoolean517 = var4.readUnsignedByte(1789346909) == 1;
			}
		}
		for (var5 = 0; var5 < this.anInt6595; var5++) {
			if (this.aClass56Array6598[var5] != null) {
				this.aClass56Array6598[var5].aBoolean514 = var4.readUnsignedByte(1299676868) == 1;
			}
		}
		for (var5 = 0; var5 < this.anInt6595; var5++) {
			if (this.aClass56Array6598[var5] != null) {
				this.aClass56Array6598[var5].aByte538 = var4.readByte((byte) 96);
			}
		}
		for (var5 = 0; var5 < this.anInt6595; var5++) {
			if (this.aClass56Array6598[var5] != null) {
				this.aClass56Array6598[var5].aBoolean536 = var4.readUnsignedByte(63712429) == 1;
			}
		}
		for (var5 = 0; var5 < this.anInt6595; var5++) {
			if (this.aClass56Array6598[var5] != null) {
				this.aClass56Array6598[var5].aBoolean537 = var4.readUnsignedByte(473587085) == 1;
			}
		}
		for (var5 = 0; var5 < this.anInt6595; var5++) {
			if (this.aClass56Array6598[var5] != null) {
				this.aClass56Array6598[var5].aBoolean508 = var4.readUnsignedByte(1781059489) == 1;
			}
		}
		for (var5 = 0; var5 < this.anInt6595; var5++) {
			if (this.aClass56Array6598[var5] != null) {
				this.aClass56Array6598[var5].anInt520 = var4.readUnsignedByte(570105285);
			}
		}
		for (var5 = 0; var5 < this.anInt6595; var5++) {
			if (this.aClass56Array6598[var5] != null) {
				this.aClass56Array6598[var5].anInt527 = var4.readInt((byte) 20);
			}
		}
		for (var5 = 0; var5 < this.anInt6595; var5++) {
			if (this.aClass56Array6598[var5] != null) {
				this.aClass56Array6598[var5].aClass369_524 = (Class369) Class479.method6015(Class300.method2974(-1171009251), var4.readUnsignedByte(128260349), (byte) 6);
			}
		}
	}

	public boolean method228(int arg0, Class377 arg1, float arg2, int arg3, int arg4, boolean arg5) {
		boolean var7 = true;
		if (this.aClass56Array6598[arg0].aBoolean508) {
			var7 = this.aClass280_6597.method2750(arg0, -341415260);
		}
		return var7 & this.aClass280_6596.method2750(arg0, 387951612);
	}

	public boolean method229(int arg0, Class377 arg1, float arg2, int arg3, int arg4, boolean arg5) {
		boolean var7 = true;
		if (this.aClass56Array6598[arg0].aBoolean508) {
			var7 = this.aClass280_6597.method2750(arg0, 1075127438);
		}
		return var7 & this.aClass280_6596.method2750(arg0, -1279341546);
	}

	public int[] method234(int arg0, float arg1, int arg2, int arg3, boolean arg4) {
		return this.method648(arg0, 1175437794);
	}

	public Class56 method230(int arg0) {
		return this.aClass56Array6598[arg0];
	}

	public void method218() {
	}

	public void method232() {
	}

	public void method233() {
	}

	public float[] method238(int arg0, float arg1, int arg2, int arg3, boolean arg4) {
		return this.method649(arg0, 718279427);
	}

	public int[] method223(int arg0, float arg1, int arg2, int arg3, boolean arg4) {
		return this.method651(arg0, -1853234902);
	}

	public int[] method236(int arg0, float arg1, int arg2, int arg3, boolean arg4) {
		return this.method651(arg0, -1853234902);
	}

	public int method227() {
		return this.anInt6595 * -194072327 * -756608695;
	}

	public int[] method220(int arg0, float arg1, int arg2, int arg3, boolean arg4, int arg5) {
		try {
			return this.method648(arg0, 1175437794);
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "cg.z(" + ')');
		}
	}

	public static final int method652(int arg0, int arg1, int arg2, int arg3) {
		try {
			int var4 = arg0 / arg2;
			int var5 = arg0 & arg2 - 1;
			int var6 = arg1 / arg2;
			int var7 = arg1 & arg2 - 1;
			int var8 = Class170.method2039(var4, var6, (byte) -24);
			int var9 = Class170.method2039(var4 + 1, var6, (byte) -102);
			int var10 = Class170.method2039(var4, var6 + 1, (byte) -113);
			int var11 = Class170.method2039(var4 + 1, var6 + 1, (byte) -69);
			int var12 = Class20.method466(var8, var9, var5, arg2, (byte) 40);
			int var13 = Class20.method466(var10, var11, var5, arg2, (byte) 99);
			return Class20.method466(var12, var13, var7, arg2, (byte) 84);
		} catch (RuntimeException var14) {
			throw Class476.method5964(var14, "cg.t(" + ')');
		}
	}

	public static final void method653(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Gfx.method788(var3, arg0, 647540302);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "cg.qz(" + ')');
		}
	}

	public static final void method654(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class556.aClass510_6392.getItemDefinitions(var2, (byte) 6).value;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "cg.abv(" + ')');
		}
	}

	public static final void method655(Class430 arg0, int arg1) {
		try {
			arg0.anInt4378 -= 2;
			String var2 = (String) arg0.anObjectArray4386[arg0.anInt4378];
			String var3 = (String) arg0.anObjectArray4386[arg0.anInt4378 + 1];
			Class243.method2409(var2, var3, 2145635979);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "cg.ajh(" + ')');
		}
	}

	public static void method656(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[arg0.anInt4376 - 1] = Class131.aClass407_1502.method4752(arg0.anIntArray4387[arg0.anInt4376 - 1], -1796414105).anInt4083;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "cg.s(" + ')');
		}
	}

	public static final void method657(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 3;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			Class498.method6110(8, var2 << 16 | var3, var4, "", (byte) -8);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "cg.anm(" + ')');
		}
	}

	public static final void method658(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class473.method5913(var3, var4, arg0, 2112186201);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "cg.cw(" + ')');
		}
	}

	public static int method659(String arg0, int arg1) {
		try {
			return arg0.length() + 1;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "cg.u(" + ')');
		}
	}
}
