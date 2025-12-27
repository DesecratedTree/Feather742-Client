package deob;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;

public class Class6 {

	public static float aFloat85 = 255.0F;

	public float aFloat87 = 0.85F;

	public float aFloat104 = 1.0F - this.aFloat87;

	public int anInt88 = 0;

	public int anInt90 = 0;

	public boolean aBoolean91 = false;

	public int anInt92 = 0;

	public int anInt93 = 0;

	public boolean aBoolean111 = true;

	public Class249 aClass249_95 = new Class249();

	public Class247 aClass247_83 = new Class247();

	public Class247 aClass247_98 = new Class247();

	public Class249 aClass249_99 = new Class249();

	public Class249 aClass249_100 = new Class249();

	public int[] anIntArray123 = new int[Class387_Sub3.anInt8222];

	public float[] aFloatArray117 = new float[Class387_Sub3.anInt8222];

	public float[] aFloatArray103 = new float[Class387_Sub3.anInt8222];

	public float[] aFloatArray120 = new float[Class387_Sub3.anInt8222];

	public float[] aFloatArray105 = new float[Class387_Sub3.anInt8222];

	public int[] anIntArray106 = new int[8];

	public int[] anIntArray107 = new int[8];

	public int[] anIntArray108 = new int[8];

	public int[] anIntArray109 = new int[10000];

	public int[] anIntArray110 = new int[10000];

	public float aFloat116 = 1.0F;

	public float aFloat124 = 0.0F;

	public float aFloat118 = 1.0F;

	public float[] aFloatArray97 = new float[2];

	public Class387_Sub3[] aClass387_Sub3Array121 = new Class387_Sub3[7];

	public Class387_Sub3[] aClass387_Sub3Array102 = new Class387_Sub3[7];

	public float[] aFloatArray84 = new float[64];

	public float[] aFloatArray122 = new float[64];

	public float[] aFloatArray125 = new float[64];

	public float[] aFloatArray126 = new float[64];

	public float[] aFloatArray127 = new float[64];

	public float[] aFloatArray89 = new float[3];

	public Class_ra_Sub3 aClass_ra_Sub3_128;

	public Class38 aClass38_94;

	public int[] anIntArray96;

	public float aFloat112;

	public float aFloat113;

	public float aFloat114;

	public float aFloat115;

	public int anInt119;

	public Runnable aRunnable101;

	public boolean aBoolean86;

	public Class6(Class_ra_Sub3 arg0) {
		this.aClass_ra_Sub3_128 = arg0;
		this.aClass38_94 = new Class38(arg0, this);
		int var2;
		for (var2 = 0; var2 < 7; var2++) {
			this.aClass387_Sub3Array121[var2] = new Class387_Sub3(this.aClass_ra_Sub3_128);
			this.aClass387_Sub3Array102[var2] = new Class387_Sub3(this.aClass_ra_Sub3_128);
		}
		this.anIntArray96 = new int[Class387_Sub3.anInt8166];
		for (var2 = 0; var2 < Class387_Sub3.anInt8166; var2++) {
			this.anIntArray96[var2] = -1;
		}
	}

	public void method401(int arg0) {
		try {
			this.aClass38_94 = new Class38(this.aClass_ra_Sub3_128, this);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ag.r(" + ')');
		}
	}

	public void method402(Runnable arg0, byte arg1) {
		try {
			this.aRunnable101 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ag.j(" + ')');
		}
	}

	public static final void method403(int arg0, String arg1, Color arg2, Color arg3, Color arg4, int arg5) {
		try {
			try {
				Graphics var6 = Class475.aCanvas5700.getGraphics();
				if (Class338.aFont3374 == null) {
					Class338.aFont3374 = new Font("Helvetica", 1, 13);
				}
				if (arg2 == null) {
					arg2 = new Color(140, 17, 17);
				}
				if (arg3 == null) {
					arg3 = new Color(140, 17, 17);
				}
				if (arg4 == null) {
					arg4 = new Color(255, 255, 255);
				}
				int var8;
				int var9;
				try {
					if (Class464_Sub18.anImage8701 == null) {
						Class464_Sub18.anImage8701 = Class475.aCanvas5700.createImage(Class300.anInt3058, Class146.anInt1615);
					}
					Graphics var7 = Class464_Sub18.anImage8701.getGraphics();
					var7.setColor(Color.black);
					var7.fillRect(0, 0, Class300.anInt3058, Class146.anInt1615);
					var8 = Class300.anInt3058 / 2 - 152;
					var9 = Class146.anInt1615 / 2 - 18;
					var7.setColor(arg3);
					var7.drawRect(var8, var9, 303, 33);
					var7.setColor(arg2);
					var7.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
					var7.setColor(Color.black);
					var7.drawRect(var8 + 1, var9 + 1, 301, 31);
					var7.fillRect(var8 + 2 + arg0 * 3, var9 + 2, 300 - arg0 * 3, 30);
					var7.setFont(Class338.aFont3374);
					var7.setColor(arg4);
					var7.drawString(arg1, var8 + (304 - arg1.length() * 6) / 2, var9 + 22);
					if (Class332.aString6613 != null) {
						var7.setFont(Class338.aFont3374);
						var7.setColor(arg4);
						var7.drawString(Class332.aString6613, Class300.anInt3058 / 2 - Class332.aString6613.length() * 6 / 2, Class146.anInt1615 / 2 - 26);
					}
					var6.drawImage(Class464_Sub18.anImage8701, 0, 0, null);
				} catch (Exception var10) {
					var6.setColor(Color.black);
					var6.fillRect(0, 0, Class300.anInt3058, Class146.anInt1615);
					var8 = Class300.anInt3058 / 2 - 152;
					var9 = Class146.anInt1615 / 2 - 18;
					var6.setColor(arg3);
					var6.drawRect(var8, var9, 303, 33);
					var6.setColor(arg2);
					var6.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
					var6.setColor(Color.black);
					var6.drawRect(var8 + 1, var9 + 1, 301, 31);
					var6.fillRect(var8 + 2 + arg0 * 3, var9 + 2, 300 - arg0 * 3, 30);
					var6.setFont(Class338.aFont3374);
					var6.setColor(arg4);
					if (Class332.aString6613 != null) {
						var6.setFont(Class338.aFont3374);
						var6.setColor(arg4);
						var6.drawString(Class332.aString6613, Class300.anInt3058 / 2 - Class332.aString6613.length() * 6 / 2, Class146.anInt1615 / 2 - 26);
					}
					var6.drawString(arg1, var8 + (304 - arg1.length() * 6) / 2, var9 + 22);
				}
			} catch (Exception var11) {
				Class475.aCanvas5700.repaint();
			}
		} catch (RuntimeException var12) {
			throw Class476.method5964(var12, "ag.aj(" + ')');
		}
	}

	public static final void method404(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class439.method5599(var3, var4, false, 2, arg0, (byte) 34);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ag.ho(" + ')');
		}
	}

	public static final void method405(Class430 arg0, byte arg1) {
		try {
			arg0.anInt4376 -= 3;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			Class498.method6110(3, var2 << 16 | var3, var4, "", (byte) -60);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ag.anl(" + ')');
		}
	}

	public static void method406(Class325 arg0, Class325 arg1, byte arg2) {
		try {
			if (arg0.aClass325_3315 != null) {
				arg0.method3204(-661346054);
			}
			arg0.aClass325_3315 = arg1;
			arg0.aClass325_3314 = arg1.aClass325_3314;
			arg0.aClass325_3315.aClass325_3314 = arg0;
			arg0.aClass325_3314.aClass325_3315 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ag.p(" + ')');
		}
	}

	public static final void method407(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 7;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1] << 1;
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			int var5 = arg0.anIntArray4387[arg0.anInt4376 + 3];
			int var6 = arg0.anIntArray4387[arg0.anInt4376 + 4];
			int var7 = arg0.anIntArray4387[arg0.anInt4376 + 5];
			int var8 = arg0.anIntArray4387[arg0.anInt4376 + 6];
			if (var2 >= 0 && var2 < 2 && client.anIntArrayArrayArray9082[var2] != null && var3 >= 0 && var3 < client.anIntArrayArrayArray9082[var2].length) {
				client.anIntArrayArrayArray9082[var2][var3] = new int[] { (var4 >> 14 & 0x3FFF) << 9, var5 << 2, (var4 & 0x3FFF) << 9, var8 };
				client.anIntArrayArrayArray9082[var2][var3 + 1] = new int[] { (var6 >> 14 & 0x3FFF) << 9, var7 << 2, (var6 & 0x3FFF) << 9 };
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "ag.afb(" + ')');
		}
	}

	public static void method408(int arg0, IndexTable arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
		try {
			Class110.anInt1152 = 1;
			Class110.aClass280_1161 = arg1;
			Class110.musicId = arg2;
			Class369.anInt6819 = arg3;
			Class288.aClass330_Sub40_Sub2_2955 = null;
			Class121.volume = arg4;
			Class268.aBoolean2746 = arg5;
			Class457.anInt6843 = arg0;
			Class403.aClass111_4138 = null;
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "ag.n(" + ')');
		}
	}
}
