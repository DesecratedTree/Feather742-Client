package deob;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;

@ObfuscatedName("za")
public class za extends Class76_Sub1 implements Interface28 {

	public static boolean aBoolean9298 = false;

	public ja aJa9297;

	public Canvas aCanvas9295;

	public int anInt9294;

	public int anInt9296;

	public static long aLong9299;

	public long nativeid;

	public boolean method863() {
		return true;
	}

	public int method857() {
		return this.anInt9296;
	}

	public void method896(Exception arg0) {
		if (aBoolean9298) {
			if (Class312.method3111((byte) 65) - aLong9299 >= 30000L) {
				throw new RuntimeException(arg0.getMessage());
			}
			this.aCanvas9295.repaint();
		} else {
			aLong9299 = Class312.method3111((byte) 28);
			aBoolean9298 = true;
		}
	}

	public int method874() {
		return this.method883(0, 0);
	}

	public boolean method182() {
		this.aJa9297.PA(this);
		return true;
	}

	public void method876(int arg0, int arg1) {
		this.anInt9294 = arg0;
		this.anInt9296 = arg1;
		this.wa(this.aCanvas9295, arg0, arg1);
		if (this.aJa9297.method4782((byte) 0) == this) {
			this.method174();
		}
	}

	public int method856() {
		return this.anInt9294;
	}

	public void method185() {
		if (this.aJa9297.method4782((byte) 0) == this) {
			this.method862();
		}
		this.ma(true);
		this.nativeid = 0L;
		this.aCanvas9295 = null;
	}

	public void method179() {
		if (this.aJa9297.method4782((byte) 0) == this) {
			this.method862();
		}
		this.ma(true);
		this.nativeid = 0L;
		this.aCanvas9295 = null;
	}

	public boolean method174() {
		this.aJa9297.PA(this);
		return true;
	}

	public boolean method862() {
		return true;
	}

	public int method864() {
		return this.anInt9294;
	}

	public int method858() {
		return this.anInt9294;
	}

	public int method873(int arg0, int arg1) {
		try {
			synchronized (this.aCanvas9295.getTreeLock()) {
				Component var4 = this.aCanvas9295;
				int var5 = 0;
				int var6 = 0;
				int var7 = 0;
				int var8 = this.aCanvas9295.getWidth();
				while (var4 != null) {
					Container var9 = var4.getParent();
					if (var9 instanceof Frame) {
						var7 = ((Frame) var9).getInsets().top;
					}
					if (var9 == null) {
						break;
					}
					var5 += var4.getX();
					var6 += var4.getY();
					int var10 = var4.getWidth();
					if (var10 < var8) {
						var8 = var10;
					}
					var4 = var9;
				}
				this.H(arg0, arg1, var5, var6, this.anInt9294, this.anInt9296, var8, var7);
				aBoolean9298 = false;
				return 0;
			}
		} catch (Exception var13) {
			this.method896(var13);
			return -1;
		}
	}

	public int method855() {
		return this.anInt9296;
	}

	public int method861() {
		return this.anInt9296;
	}

	public boolean method176() {
		this.aJa9297.PA(this);
		return true;
	}

	public za(ja arg0, Canvas arg1, int arg2, int arg3) {
		this.aJa9297 = arg0;
		this.aCanvas9295 = arg1;
		this.anInt9294 = arg2;
		this.anInt9296 = arg3;
		this.n(arg0, this.aCanvas9295, arg2, arg3);
	}

	public boolean method178() {
		this.aJa9297.PA(this);
		return true;
	}

	public int method860() {
		return this.anInt9296;
	}

	public void method180() {
		if (this.aJa9297.method4782((byte) 0) == this) {
			this.method862();
		}
		this.ma(true);
		this.nativeid = 0L;
		this.aCanvas9295 = null;
	}

	public void method181() {
		if (this.aJa9297.method4782((byte) 0) == this) {
			this.method862();
		}
		this.ma(true);
		this.nativeid = 0L;
		this.aCanvas9295 = null;
	}

	public void finalize() {
		if (this.nativeid != 0L) {
			Class71.method827(this, 1711061246);
		}
	}

	public int method883(int arg0, int arg1) {
		try {
			synchronized (this.aCanvas9295.getTreeLock()) {
				Component var4 = this.aCanvas9295;
				int var5 = 0;
				int var6 = 0;
				int var7 = 0;
				int var8 = this.aCanvas9295.getWidth();
				while (var4 != null) {
					Container var9 = var4.getParent();
					if (var9 instanceof Frame) {
						var7 = ((Frame) var9).getInsets().top;
					}
					if (var9 == null) {
						break;
					}
					var5 += var4.getX();
					var6 += var4.getY();
					int var10 = var4.getWidth();
					if (var10 < var8) {
						var8 = var10;
					}
					var4 = var9;
				}
				this.H(arg0, arg1, var5, var6, this.anInt9294, this.anInt9296, var8, var7);
				aBoolean9298 = false;
				return 0;
			}
		} catch (Exception var13) {
			this.method896(var13);
			return -1;
		}
	}

	public int method878() {
		return this.method883(0, 0);
	}

	public int method879() {
		return this.method883(0, 0);
	}

	public int method880(int arg0, int arg1) {
		try {
			synchronized (this.aCanvas9295.getTreeLock()) {
				Component var4 = this.aCanvas9295;
				int var5 = 0;
				int var6 = 0;
				int var7 = 0;
				int var8 = this.aCanvas9295.getWidth();
				while (var4 != null) {
					Container var9 = var4.getParent();
					if (var9 instanceof Frame) {
						var7 = ((Frame) var9).getInsets().top;
					}
					if (var9 == null) {
						break;
					}
					var5 += var4.getX();
					var6 += var4.getY();
					int var10 = var4.getWidth();
					if (var10 < var8) {
						var8 = var10;
					}
					var4 = var9;
				}
				this.H(arg0, arg1, var5, var6, this.anInt9294, this.anInt9296, var8, var7);
				aBoolean9298 = false;
				return 0;
			}
		} catch (Exception var13) {
			this.method896(var13);
			return -1;
		}
	}

	public int method881(int arg0, int arg1) {
		try {
			synchronized (this.aCanvas9295.getTreeLock()) {
				Component var4 = this.aCanvas9295;
				int var5 = 0;
				int var6 = 0;
				int var7 = 0;
				int var8 = this.aCanvas9295.getWidth();
				while (var4 != null) {
					Container var9 = var4.getParent();
					if (var9 instanceof Frame) {
						var7 = ((Frame) var9).getInsets().top;
					}
					if (var9 == null) {
						break;
					}
					var5 += var4.getX();
					var6 += var4.getY();
					int var10 = var4.getWidth();
					if (var10 < var8) {
						var8 = var10;
					}
					var4 = var9;
				}
				this.H(arg0, arg1, var5, var6, this.anInt9294, this.anInt9296, var8, var7);
				aBoolean9298 = false;
				return 0;
			}
		} catch (Exception var13) {
			this.method896(var13);
			return -1;
		}
	}

	public int method875(int arg0, int arg1) {
		try {
			synchronized (this.aCanvas9295.getTreeLock()) {
				Component var4 = this.aCanvas9295;
				int var5 = 0;
				int var6 = 0;
				int var7 = 0;
				int var8 = this.aCanvas9295.getWidth();
				while (var4 != null) {
					Container var9 = var4.getParent();
					if (var9 instanceof Frame) {
						var7 = ((Frame) var9).getInsets().top;
					}
					if (var9 == null) {
						break;
					}
					var5 += var4.getX();
					var6 += var4.getY();
					int var10 = var4.getWidth();
					if (var10 < var8) {
						var8 = var10;
					}
					var4 = var9;
				}
				this.H(arg0, arg1, var5, var6, this.anInt9294, this.anInt9296, var8, var7);
				aBoolean9298 = false;
				return 0;
			}
		} catch (Exception var13) {
			this.method896(var13);
			return -1;
		}
	}

	public int method884(int arg0, int arg1) {
		try {
			synchronized (this.aCanvas9295.getTreeLock()) {
				Component var4 = this.aCanvas9295;
				int var5 = 0;
				int var6 = 0;
				int var7 = 0;
				int var8 = this.aCanvas9295.getWidth();
				while (var4 != null) {
					Container var9 = var4.getParent();
					if (var9 instanceof Frame) {
						var7 = ((Frame) var9).getInsets().top;
					}
					if (var9 == null) {
						break;
					}
					var5 += var4.getX();
					var6 += var4.getY();
					int var10 = var4.getWidth();
					if (var10 < var8) {
						var8 = var10;
					}
					var4 = var9;
				}
				this.H(arg0, arg1, var5, var6, this.anInt9294, this.anInt9296, var8, var7);
				aBoolean9298 = false;
				return 0;
			}
		} catch (Exception var13) {
			this.method896(var13);
			return -1;
		}
	}

	public boolean method865() {
		return true;
	}

	public int method885(int arg0, int arg1) {
		try {
			synchronized (this.aCanvas9295.getTreeLock()) {
				Component var4 = this.aCanvas9295;
				int var5 = 0;
				int var6 = 0;
				int var7 = 0;
				int var8 = this.aCanvas9295.getWidth();
				while (var4 != null) {
					Container var9 = var4.getParent();
					if (var9 instanceof Frame) {
						var7 = ((Frame) var9).getInsets().top;
					}
					if (var9 == null) {
						break;
					}
					var5 += var4.getX();
					var6 += var4.getY();
					int var10 = var4.getWidth();
					if (var10 < var8) {
						var8 = var10;
					}
					var4 = var9;
				}
				this.H(arg0, arg1, var5, var6, this.anInt9294, this.anInt9296, var8, var7);
				aBoolean9298 = false;
				return 0;
			}
		} catch (Exception var13) {
			this.method896(var13);
			return -1;
		}
	}

	public void method897() {
		if (this.nativeid != 0L) {
			Class71.method827(this, 1087476729);
		}
	}

	public void method898() {
		if (this.nativeid != 0L) {
			Class71.method827(this, 1431873371);
		}
	}

	public void method882(int arg0, int arg1) {
		this.anInt9294 = arg0;
		this.anInt9296 = arg1;
		this.wa(this.aCanvas9295, arg0, arg1);
		if (this.aJa9297.method4782((byte) 0) == this) {
			this.method174();
		}
	}

	public void method183() {
		if (this.aJa9297.method4782((byte) 0) == this) {
			this.method862();
		}
		this.ma(true);
		this.nativeid = 0L;
		this.aCanvas9295 = null;
	}

	public int method859() {
		return this.anInt9294;
	}

	public int method877() {
		return this.method883(0, 0);
	}

	@ObfuscatedName("za.ma(Z)V")
	public native void ma(boolean arg0);

	@ObfuscatedName("za.n(Lja;Ljava/awt/Canvas;II)V")
	public native void n(ja arg0, Canvas arg1, int arg2, int arg3);

	@ObfuscatedName("za.H(IIIIIIII)V")
	public native void H(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

	@ObfuscatedName("za.aa(Ljava/awt/Canvas;II)V")
	public native void aa(Canvas arg0, int arg1, int arg2);

	@ObfuscatedName("za.x(Z)V")
	public native void x(boolean arg0);

	@ObfuscatedName("za.wa(Ljava/awt/Canvas;II)V")
	public native void wa(Canvas arg0, int arg1, int arg2);

	@ObfuscatedName("za.ak(Ljava/awt/Canvas;II)V")
	public native void ak(Canvas arg0, int arg1, int arg2);

	@ObfuscatedName("za.y(IIIIIIII)V")
	public native void y(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

	@ObfuscatedName("za.af(IIIIIIII)V")
	public native void af(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

	@ObfuscatedName("za.aq(Ljava/awt/Canvas;II)V")
	public native void aq(Canvas arg0, int arg1, int arg2);

	@ObfuscatedName("za.h(Lja;Ljava/awt/Canvas;II)V")
	public native void h(ja arg0, Canvas arg1, int arg2, int arg3);

	@ObfuscatedName("za.ab(Ljava/awt/Canvas;II)V")
	public native void ab(Canvas arg0, int arg1, int arg2);

	@ObfuscatedName("za.ag(Ljava/awt/Canvas;II)V")
	public native void ag(Canvas arg0, int arg1, int arg2);

	@ObfuscatedName("za.az(Ljava/awt/Canvas;II)V")
	public native void az(Canvas arg0, int arg1, int arg2);
}
