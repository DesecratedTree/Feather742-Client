package deob;

import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

public class Class330_Sub16 extends Class330 {

	public Class_xa_Sub1 aClass_xa_Sub1_7612;

	public Class_ra_Sub1 aClass_ra_Sub1_7613;

	public int anInt7617;

	public float aFloat7618;

	public Class77 aClass77_7615;

	public int[] anIntArray7611;

	public Class34_Sub1 aClass34_Sub1_7614;

	public Class44 aClass44_7616;

	public Stream aStream7620;

	public NativeHeapBuffer aNativeHeapBuffer7619;

	public void method3336(int arg0, int arg1, int arg2, float arg3) {
		int var6;
		int var7;
		if (this.anInt7617 != -1) {
			Class56 var5 = this.aClass_ra_Sub1_7613.anInterface_ma4227.method221(this.anInt7617, 1823902150);
			var6 = var5.aByte529 & 0xFF;
			int var9;
			if (var6 != 0 && var5.aByte525 != 4) {
				if (arg2 < 0) {
					var7 = 0;
				} else if (arg2 > 127) {
					var7 = 16777215;
				} else {
					var7 = arg2 * 131586;
				}
				if (var6 == 256) {
					arg1 = var7;
				} else {
					var9 = 256 - var6;
					arg1 = ((var7 & 0xFF00FF) * var6 + (arg1 & 0xFF00FF) * var9 & 0xFF00FF00) + ((var7 & 0xFF00) * var6 + (arg1 & 0xFF00) * var9 & 0xFF0000) >> 8;
				}
			}
			var7 = var5.aByte534 & 0xFF;
			if (var7 != 0) {
				var7 += 256;
				int var8 = (arg1 >> 16 & 0xFF) * var7;
				if (var8 > 65535) {
					var8 = 65535;
				}
				var9 = (arg1 >> 8 & 0xFF) * var7;
				if (var9 > 65535) {
					var9 = 65535;
				}
				int var10 = (arg1 & 0xFF) * var7;
				if (var10 > 65535) {
					var10 = 65535;
				}
				arg1 = ((var8 & 0xFF00) << 8) + (var9 & 0xFF00) + (var10 >> 8);
			}
		}
		if (arg3 != 1.0F) {
			int var11 = arg1 >> 16 & 0xFF;
			var6 = arg1 >> 8 & 0xFF;
			var7 = arg1 & 0xFF;
			var11 = (int) ((float) var11 * arg3);
			if (var11 < 0) {
				var11 = 0;
			} else if (var11 > 255) {
				var11 = 255;
			}
			var6 = (int) ((float) var6 * arg3);
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}
			var7 = (int) ((float) var7 * arg3);
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}
			arg1 = var11 << 16 | var6 << 8 | var7;
		}
		this.aStream7620.i(arg0 * 4);
		this.aStream7620.p((byte) (arg1 >> 16));
		this.aStream7620.p((byte) (arg1 >> 8));
		this.aStream7620.p((byte) arg1);
	}

	public void method3337(int arg0) {
		this.aNativeHeapBuffer7619 = this.aClass_ra_Sub1_7613.aNativeHeap8308.j(arg0 * 4, true);
		this.aStream7620 = new Stream(this.aNativeHeapBuffer7619);
	}

	public void method3338(int arg0) {
		this.aStream7620.i(arg0 * 4 + 3);
		this.aStream7620.p(-1);
	}

	public void method3339(int arg0, int arg1, int arg2) {
		this.anIntArray7611[arg1 * this.aClass_xa_Sub1_7612.anInt6397 + arg0] |= 0x1 << arg2;
	}

	public void method3340(int[] arg0, int arg1) {
		int var3 = 0;
		Class330_Sub46_Sub1 var4 = this.aClass_ra_Sub1_7613.aClass330_Sub46_Sub1_8381;
		var4.offset = 0;
		int var5;
		int var6;
		short[] var7;
		int var8;
		int var9;
		int var10;
		if (this.aClass_ra_Sub1_7613.aBoolean8407) {
			for (var5 = 0; var5 < arg1; var5++) {
				var6 = arg0[var5];
				var7 = this.aClass_xa_Sub1_7612.aShortArrayArray8756[var6];
				var8 = this.anIntArray7611[var6];
				if (var8 != 0 && var7 != null) {
					var9 = 0;
					var10 = 0;
					while (var10 < var7.length) {
						if ((var8 & 0x1 << var9++) == 0) {
							var10 += 3;
						} else {
							var4.addShort(var7[var10++] & 0xFFFF, (byte) 107);
							var3++;
							var4.addShort(var7[var10++] & 0xFFFF, (byte) 22);
							var3++;
							var4.addShort(var7[var10++] & 0xFFFF, (byte) 106);
							var3++;
						}
					}
				}
			}
		} else {
			for (var5 = 0; var5 < arg1; var5++) {
				var6 = arg0[var5];
				var7 = this.aClass_xa_Sub1_7612.aShortArrayArray8756[var6];
				var8 = this.anIntArray7611[var6];
				if (var8 != 0 && var7 != null) {
					var9 = 0;
					var10 = 0;
					while (var10 < var7.length) {
						if ((var8 & 0x1 << var9++) == 0) {
							var10 += 3;
						} else {
							var4.method3742(var7[var10++] & 0xFFFF, (short) 21964);
							var3++;
							var4.method3742(var7[var10++] & 0xFFFF, (short) 7752);
							var3++;
							var4.method3742(var7[var10++] & 0xFFFF, (short) 1523);
							var3++;
						}
					}
				}
			}
		}
		if (var3 <= 0) {
			return;
		}
		this.aClass34_Sub1_7614.method42(5123, var4.payload, var4.offset);
		this.aClass_ra_Sub1_7613.method4869(this.aClass_xa_Sub1_7612.aClass44_8777, this.aClass_xa_Sub1_7612.aClass44_8767, this.aClass44_7616, this.aClass_xa_Sub1_7612.aClass44_8780);
		this.aClass_ra_Sub1_7613.method4842(this.anInt7617, (this.aClass_xa_Sub1_7612.anInt8761 & 0x7) != 0, (this.aClass_xa_Sub1_7612.anInt8761 & 0x8) != 0);
		if (this.aClass_ra_Sub1_7613.aBoolean8388) {
			this.aClass_ra_Sub1_7613.dz(Integer.MAX_VALUE, this.aClass77_7615);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat7618, 1.0F / this.aFloat7618, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass_ra_Sub1_7613.method4869(this.aClass_xa_Sub1_7612.aClass44_8777, this.aClass_xa_Sub1_7612.aClass44_8767, this.aClass44_7616, this.aClass_xa_Sub1_7612.aClass44_8780);
		this.aClass_ra_Sub1_7613.method4837(this.aClass34_Sub1_7614, 4, 0, var3);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	public void method3341(int arg0) {
		this.aStream7620.f();
		Interface1 var2 = this.aClass_ra_Sub1_7613.method4872(4, this.aNativeHeapBuffer7619, arg0 * 4, false);
		if (var2 instanceof Class46_Sub1) {
			this.aNativeHeapBuffer7619.n();
		}
		this.aClass44_7616 = new Class44(var2, 5121, 4, 0);
		this.aNativeHeapBuffer7619 = null;
		this.aStream7620 = null;
	}

	public Class330_Sub16(Class_xa_Sub1 arg0, int arg1, int arg2, Class77 arg3) {
		this.aClass_xa_Sub1_7612 = arg0;
		this.aClass_ra_Sub1_7613 = this.aClass_xa_Sub1_7612.aClass_ra_Sub1_8757;
		this.anInt7617 = arg1;
		this.aFloat7618 = arg2;
		this.aClass77_7615 = arg3;
		this.anIntArray7611 = new int[this.aClass_xa_Sub1_7612.anInt6397 * this.aClass_xa_Sub1_7612.anInt6393];
		this.aClass34_Sub1_7614 = new Class34_Sub1(this.aClass_ra_Sub1_7613, 5123, null, 1);
	}
}
