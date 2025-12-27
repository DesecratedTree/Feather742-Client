package deob;

import java.nio.ByteBuffer;
import sun.misc.Unsafe;

public class Class187 {

	public Class161 aClass161_1839 = Class161.aClass161_1687;

	public int anInt1842 = 128;

	public int anInt1848 = 0;

	public float[] aFloatArray1844 = new float[this.anInt1842 * 16];

	public Interface11_Impl3[] anInterface11_Impl3Array1845 = new Interface11_Impl3[this.anInt1842];

	public int[] anIntArray1850 = new int[this.anInt1842];

	public int[] anIntArray1851 = new int[4];

	public Class_ra_Sub2 aClass_ra_Sub2_1846;

	public Interface9_Impl1 anInterface9_Impl1_1840;

	public Class184 aClass184_1843;

	public Interface9_Impl2 anInterface9_Impl2_1849;

	public int anInt1847;

	public Class161 aClass161_1841;

	public Class187(Class_ra_Sub2 arg0, int arg1) {
		this.aClass_ra_Sub2_1846 = arg0;
		this.anInterface9_Impl1_1840 = this.aClass_ra_Sub2_1846.method4976(true);
		this.anInterface9_Impl1_1840.method142(arg1 * 96, 24);
		this.aClass184_1843 = this.aClass_ra_Sub2_1846.method4977(new Class193[] { new Class193(new Class191[] { Class191.aClass191_1863, Class191.aClass191_1864, Class191.aClass191_1862 }) });
		this.anInterface9_Impl2_1849 = this.aClass_ra_Sub2_1846.method4975(false);
		int var3 = arg1 * 6;
		this.anInterface9_Impl2_1849.method148(var3);
		ByteBuffer var4 = this.aClass_ra_Sub2_1846.aByteBuffer8458;
		var4.clear();
		for (int var5 = 0; var5 < arg1; var5++) {
			var4.putShort((short) (var5 * 4));
			var4.putShort((short) (var5 * 4 + 2));
			var4.putShort((short) (var5 * 4 + 1));
			var4.putShort((short) (var5 * 4 + 2));
			var4.putShort((short) (var5 * 4 + 3));
			var4.putShort((short) (var5 * 4 + 1));
		}
		this.anInterface9_Impl2_1849.method97(0, var3 * this.anInterface9_Impl2_1849.method157().anInt724, this.aClass_ra_Sub2_1846.aLong8459);
		this.anInt1847 = arg1;
		this.anInt1848 = 0;
	}

	public void method2083() {
		if (this.anInt1848 != this.anInt1842) {
			return;
		}
		this.anInt1842 *= 2;
		float[] var1 = new float[this.anInt1842 * 16];
		for (int var2 = 0; var2 < this.anInt1848 * 16; var2++) {
			var1[var2] = this.aFloatArray1844[var2];
		}
		this.aFloatArray1844 = var1;
		Interface11_Impl3[] var5 = new Interface11_Impl3[this.anInt1842];
		int[] var3 = new int[this.anInt1842];
		for (int var4 = 0; var4 < this.anInt1848; var4++) {
			var5[var4] = this.anInterface11_Impl3Array1845[var4];
			var3[var4] = this.anIntArray1850[var4];
		}
		this.anInterface11_Impl3Array1845 = var5;
		this.anIntArray1850 = var3;
	}

	public void method2084() {
		this.anInterface9_Impl1_1840.method53();
		this.anInterface9_Impl2_1849.method53();
		this.anInterface9_Impl1_1840 = null;
		this.anInterface9_Impl2_1849 = null;
		this.aClass184_1843 = null;
		this.anInt1848 = 0;
	}

	public void method2085() {
		if (this.anInt1848 == 0) {
			return;
		}
		this.aClass_ra_Sub2_1846.method4943();
		this.aClass_ra_Sub2_1846.method4970(1);
		this.aClass_ra_Sub2_1846.method4979(this.anInterface9_Impl2_1849);
		this.aClass_ra_Sub2_1846.method5081(0, this.anInterface9_Impl1_1840);
		this.aClass_ra_Sub2_1846.method4978(this.aClass184_1843);
		Class150 var1 = this.aClass_ra_Sub2_1846.aClass150_8561;
		Unsafe var2 = this.aClass_ra_Sub2_1846.anUnsafe8461;
		ByteBuffer var3 = this.aClass_ra_Sub2_1846.aByteBuffer8458;
		var3.clear();
		int var4 = (this.anInt1848 + this.anInt1847 - 1) / this.anInt1847;
		int var5 = 0;
		int var6 = 0;
		for (int var7 = 0; var7 < var4; var7++) {
			int var8 = Math.min(this.anInt1847, this.anInt1848 - var5);
			long var9 = this.anInterface9_Impl1_1840.method94(0, var8 * 96);
			int var11 = var7 * this.anInt1847 + var8;
			int var13;
			for (int var12 = var5; var12 < var11; var12++) {
				for (var13 = 0; var13 < 4; var13++) {
					var2.putFloat(var9, this.aFloatArray1844[var6++]);
					var9 += 4L;
					var2.putFloat(var9, this.aFloatArray1844[var6++]);
					var9 += 4L;
					var2.putFloat(var9, 0.0F);
					var9 += 4L;
					var2.putFloat(var9, this.aFloatArray1844[var6++]);
					var9 += 4L;
					var2.putFloat(var9, this.aFloatArray1844[var6++]);
					var9 += 4L;
					var2.putInt(var9, this.anIntArray1850[var12]);
					var9 += 4L;
				}
			}
			this.anInterface9_Impl1_1840.method95();
			Interface11_Impl3 var16 = this.anInterface11_Impl3Array1845[var5];
			var13 = 1;
			int var14 = 0;
			for (int var15 = var5 + 1; var15 < var11; var15++) {
				if (var16 == this.anInterface11_Impl3Array1845[var15]) {
					var13++;
				} else {
					var1.anInterface11_Impl3_1624 = var16;
					var1.method1768();
					this.aClass_ra_Sub2_1846.method4985(this.anInterface9_Impl2_1849, Class199.aClass199_1926, var14 * 4, var13 * 4, var14 * 6, var13 * 2);
					var16 = this.anInterface11_Impl3Array1845[var15];
					var13 = 1;
					var14 = var15 - var5;
				}
			}
			var1.anInterface11_Impl3_1624 = var16;
			var1.method1768();
			this.aClass_ra_Sub2_1846.method4985(this.anInterface9_Impl2_1849, Class199.aClass199_1926, var14 * 4, var13 * 4, var14 * 6, var13 * 2);
			var5 += this.anInt1847;
		}
		this.anInt1848 = 0;
	}

	public void method2086(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, Interface11_Impl3 arg8, int arg9) {
		if ((arg9 & 0xFF000000) == 0) {
			return;
		}
		this.aClass_ra_Sub2_1846.qa(this.anIntArray1851);
		int var11 = this.anIntArray1851[0];
		int var12 = this.anIntArray1851[1];
		int var13 = this.anIntArray1851[2];
		int var14 = this.anIntArray1851[3];
		if (arg0 > (float) var13 || arg1 > (float) var14 || arg2 < (float) var11 || arg3 < (float) var12) {
			return;
		}
		float var15 = arg2 - arg0;
		float var16 = arg3 - arg1;
		float var17 = arg6 - arg4;
		float var18 = arg7 - arg5;
		if (arg0 < (float) var11) {
			arg4 += ((float) var11 - arg0) / var15 * var17;
			arg0 = var11;
		}
		if (arg1 < (float) var12) {
			arg5 += ((float) var12 - arg1) / var16 * var18;
			arg1 = var12;
		}
		if (arg2 > (float) var13) {
			arg6 -= (arg2 - (float) var13) / var15 * var17;
			arg2 = var13;
		}
		if (arg3 > (float) var14) {
			arg7 -= (arg3 - (float) var14) / var16 * var18;
			arg3 = var14;
		}
		this.method2083();
		arg0 = this.method2088(arg0);
		arg1 = this.method2087(arg1);
		arg2 = this.method2088(arg2);
		arg3 = this.method2087(arg3);
		this.aFloatArray1844[this.anInt1848 * 16] = arg0;
		this.aFloatArray1844[this.anInt1848 * 16 + 1] = arg1;
		this.aFloatArray1844[this.anInt1848 * 16 + 2] = arg4;
		this.aFloatArray1844[this.anInt1848 * 16 + 3] = arg5;
		this.aFloatArray1844[this.anInt1848 * 16 + 4] = arg2;
		this.aFloatArray1844[this.anInt1848 * 16 + 5] = arg1;
		this.aFloatArray1844[this.anInt1848 * 16 + 6] = arg6;
		this.aFloatArray1844[this.anInt1848 * 16 + 7] = arg5;
		this.aFloatArray1844[this.anInt1848 * 16 + 8] = arg0;
		this.aFloatArray1844[this.anInt1848 * 16 + 9] = arg3;
		this.aFloatArray1844[this.anInt1848 * 16 + 10] = arg4;
		this.aFloatArray1844[this.anInt1848 * 16 + 11] = arg7;
		this.aFloatArray1844[this.anInt1848 * 16 + 12] = arg2;
		this.aFloatArray1844[this.anInt1848 * 16 + 13] = arg3;
		this.aFloatArray1844[this.anInt1848 * 16 + 14] = arg6;
		this.aFloatArray1844[this.anInt1848 * 16 + 15] = arg7;
		this.anInterface11_Impl3Array1845[this.anInt1848] = arg8;
		this.anIntArray1850[this.anInt1848] = arg9;
		this.anInt1848++;
		if (this.aClass161_1839 == Class161.aClass161_1689) {
			this.method2085();
		}
	}

	public float method2087(float arg0) {
		int var2 = this.aClass_ra_Sub2_1846.method4782((byte) 0).method857();
		return (1.0F - (arg0 + this.aClass_ra_Sub2_1846.method4901()) / (float) var2) * 2.0F - 1.0F;
	}

	public float method2088(float arg0) {
		int var2 = this.aClass_ra_Sub2_1846.method4782((byte) 0).method856();
		return (arg0 + this.aClass_ra_Sub2_1846.method4901()) / (float) var2 * 2.0F - 1.0F;
	}

	public void method2089() {
		this.aClass161_1841 = this.aClass161_1839;
		this.aClass161_1839 = Class161.aClass161_1688;
	}

	public void method2090() {
		if (this.aClass161_1841 != null) {
			this.aClass161_1839 = this.aClass161_1841;
			this.aClass161_1841 = null;
		}
	}

	public Class161 method2091() {
		return this.aClass161_1839;
	}

	public void method2092(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14, float arg15, Interface11_Impl3 arg16, int arg17) {
		if ((arg17 & 0xFF000000) == 0) {
			return;
		}
		this.aClass_ra_Sub2_1846.qa(this.anIntArray1851);
		int var19 = this.anIntArray1851[0];
		int var20 = this.anIntArray1851[1];
		int var21 = this.anIntArray1851[2];
		int var22 = this.anIntArray1851[3];
		byte var23 = 0;
		int var24 = (arg0 < (float) var19 ? 1 : 0) + (arg2 < (float) var19 ? 1 : 0) + (arg4 < (float) var19 ? 1 : 0) + (arg6 < (float) var19 ? 1 : 0);
		if (var24 == 4) {
			return;
		}
		int var33 = var23 | var24;
		var24 = (arg0 > (float) var21 ? 1 : 0) + (arg2 > (float) var21 ? 1 : 0) + (arg4 > (float) var21 ? 1 : 0) + (arg6 > (float) var21 ? 1 : 0);
		if (var24 == 4) {
			return;
		}
		var33 |= var24;
		var24 = (arg1 < (float) var20 ? 1 : 0) + (arg3 < (float) var20 ? 1 : 0) + (arg5 < (float) var20 ? 1 : 0) + (arg7 < (float) var20 ? 1 : 0);
		if (var24 == 4) {
			return;
		}
		var33 |= var24;
		var24 = (arg1 > (float) var22 ? 1 : 0) + (arg3 > (float) var22 ? 1 : 0) + (arg5 > (float) var22 ? 1 : 0) + (arg7 > (float) var22 ? 1 : 0);
		if (var24 == 4) {
			return;
		}
		var33 |= var24;
		if (var33 != 0) {
			this.method2085();
			this.aClass_ra_Sub2_1846.method4787(true);
			this.aClass_ra_Sub2_1846.r(var19, var20, var21, var22);
		}
		this.method2083();
		float var25 = this.method2088(arg0);
		float var26 = this.method2087(arg1);
		float var27 = this.method2088(arg2);
		float var28 = this.method2087(arg3);
		float var29 = this.method2088(arg4);
		float var30 = this.method2087(arg5);
		float var31 = this.method2088(arg6);
		float var32 = this.method2087(arg7);
		this.aFloatArray1844[this.anInt1848 * 16] = var25;
		this.aFloatArray1844[this.anInt1848 * 16 + 1] = var26;
		this.aFloatArray1844[this.anInt1848 * 16 + 2] = arg8;
		this.aFloatArray1844[this.anInt1848 * 16 + 3] = arg9;
		this.aFloatArray1844[this.anInt1848 * 16 + 4] = var27;
		this.aFloatArray1844[this.anInt1848 * 16 + 5] = var28;
		this.aFloatArray1844[this.anInt1848 * 16 + 6] = arg10;
		this.aFloatArray1844[this.anInt1848 * 16 + 7] = arg11;
		this.aFloatArray1844[this.anInt1848 * 16 + 8] = var29;
		this.aFloatArray1844[this.anInt1848 * 16 + 9] = var30;
		this.aFloatArray1844[this.anInt1848 * 16 + 10] = arg12;
		this.aFloatArray1844[this.anInt1848 * 16 + 11] = arg13;
		this.aFloatArray1844[this.anInt1848 * 16 + 12] = var31;
		this.aFloatArray1844[this.anInt1848 * 16 + 13] = var32;
		this.aFloatArray1844[this.anInt1848 * 16 + 14] = arg14;
		this.aFloatArray1844[this.anInt1848 * 16 + 15] = arg15;
		this.anInterface11_Impl3Array1845[this.anInt1848] = arg16;
		this.anIntArray1850[this.anInt1848] = arg17;
		this.anInt1848++;
		if (this.aClass161_1839 == Class161.aClass161_1689 || var33 > 0) {
			this.method2085();
		}
		if (var33 != 0) {
			this.aClass_ra_Sub2_1846.method4787(false);
			this.aClass_ra_Sub2_1846.L();
			this.aClass_ra_Sub2_1846.r(var19, var20, var21, var22);
		}
	}
}
