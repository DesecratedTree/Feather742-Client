package deob;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import java.nio.ByteBuffer;

public class Class184_Sub1 extends Class184 {

	public long aLong8909 = 0L;

	public Class_ra_Sub2_Sub2 aClass_ra_Sub2_Sub2_8910;

	public Class184_Sub1(Class_ra_Sub2_Sub2 arg0, Class193[] arg1) {
		super(arg1);
		this.aClass_ra_Sub2_Sub2_8910 = arg0;
		byte var3 = 0;
		ByteBuffer var4 = this.aClass_ra_Sub2_Sub2_8910.aByteBuffer8458;
		var4.clear();
		for (short var5 = 0; var5 < this.aClass193Array6483.length; var5++) {
			short var6 = 0;
			Class193 var7 = this.aClass193Array6483[var5];
			for (int var8 = 0; var8 < var7.method2136(); var8++) {
				Class191 var9 = var7.method2134(var8);
				if (var9 == Class191.aClass191_1863) {
					this.method2075(var4, var5, var6, (byte) 2, (byte) 0, (byte) 0, (byte) 0);
				} else if (var9 == Class191.aClass191_1872) {
					this.method2075(var4, var5, var6, (byte) 2, (byte) 0, (byte) 3, (byte) 0);
				} else if (var9 == Class191.aClass191_1862) {
					this.method2075(var4, var5, var6, (byte) 4, (byte) 0, (byte) 10, (byte) 0);
				} else {
					byte var14;
					byte var15;
					byte var16;
					byte var17;
					if (var9 == Class191.aClass191_1861) {
						var14 = 0;
						var15 = 0;
						var16 = 5;
						var17 = var3++;
						this.method2075(var4, var5, var6, var14, var15, var16, var17);
					} else if (var9 == Class191.aClass191_1864) {
						var14 = 1;
						var15 = 0;
						var16 = 5;
						var17 = var3++;
						this.method2075(var4, var5, var6, var14, var15, var16, var17);
					} else if (var9 == Class191.aClass191_1865) {
						var14 = 2;
						var15 = 0;
						var16 = 5;
						var17 = var3++;
						this.method2075(var4, var5, var6, var14, var15, var16, var17);
					} else if (var9 == Class191.aClass191_1866) {
						var14 = 3;
						var15 = 0;
						var16 = 5;
						var17 = var3++;
						this.method2075(var4, var5, var6, var14, var15, var16, var17);
					}
				}
				var6 = (short) (var6 + var9.anInt1876);
			}
		}
		this.method2075(var4, (short) 255, (short) 0, (byte) 17, (byte) 0, (byte) 0, (byte) 0);
		this.aLong8909 = IDirect3DDevice.CreateVertexDeclaration(this.aClass_ra_Sub2_Sub2_8910.aLong9891, this.aClass_ra_Sub2_Sub2_8910.aLong8459);
		this.aClass_ra_Sub2_Sub2_8910.method4993(this);
	}

	public void method2075(ByteBuffer arg0, short arg1, short arg2, byte arg3, byte arg4, byte arg5, byte arg6) {
		arg0.putShort(arg1);
		arg0.putShort(arg2);
		arg0.put(arg3);
		arg0.put(arg4);
		arg0.put(arg5);
		arg0.put(arg6);
	}

	public void method53() {
		if (this.aLong8909 != 0L) {
			IUnknown.Release(this.aLong8909);
			this.aLong8909 = 0L;
		}
		this.aClass_ra_Sub2_Sub2_8910.method4883(this);
	}

	public void method52() {
		if (this.aLong8909 != 0L) {
			IUnknown.Release(this.aLong8909);
			this.aLong8909 = 0L;
		}
		this.aClass_ra_Sub2_Sub2_8910.method4883(this);
	}

	public void method2076() {
		if (this.aLong8909 != 0L) {
			this.aClass_ra_Sub2_Sub2_8910.method5173(this.aLong8909);
			this.aLong8909 = 0L;
		}
	}
}
