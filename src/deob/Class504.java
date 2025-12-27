package deob;

import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;

public class Class504 {

	public GraphicsDevice aGraphicsDevice5918;

	public DisplayMode aDisplayMode5917;

	public int[] method6136(int arg0) {
		try {
			DisplayMode[] var2 = this.aGraphicsDevice5918.getDisplayModes();
			int[] var3 = new int[var2.length << 2];
			for (int var4 = 0; var4 < var2.length; var4++) {
				var3[var4 << 2] = var2[var4].getWidth();
				var3[(var4 << 2) + 1] = var2[var4].getHeight();
				var3[(var4 << 2) + 2] = var2[var4].getBitDepth();
				var3[(var4 << 2) + 3] = var2[var4].getRefreshRate();
			}
			return var3;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "uv.r(" + ')');
		}
	}

	public void method6137(Frame arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			this.aDisplayMode5917 = this.aGraphicsDevice5918.getDisplayMode();
			if (this.aDisplayMode5917 == null) {
				throw new NullPointerException();
			}
			arg0.setUndecorated(true);
			arg0.enableInputMethods(false);
			this.method6138(arg0, (byte) 1);
			if (arg4 == 0) {
				int var7 = this.aDisplayMode5917.getRefreshRate();
				DisplayMode[] var8 = this.aGraphicsDevice5918.getDisplayModes();
				boolean var9 = false;
				for (int var10 = 0; var10 < var8.length; var10++) {
					if (var8[var10].getWidth() == arg1 && var8[var10].getHeight() == arg2 && var8[var10].getBitDepth() == arg3) {
						int var11 = var8[var10].getRefreshRate();
						if (!var9 || Math.abs(var11 - var7) < Math.abs(arg4 - var7)) {
							arg4 = var11;
							var9 = true;
						}
					}
				}
				if (!var9) {
					arg4 = var7;
				} else if (arg5 != 624416167) {
				}
			}
			this.aGraphicsDevice5918.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
		} catch (RuntimeException var12) {
			throw Class476.method5964(var12, "uv.j(" + ')');
		}
	}

	public void method6138(Frame arg0, byte arg1) {
		try {
			boolean var3 = false;
			Field var4;
			try {
				var4 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
				var4.setAccessible(true);
				boolean var5 = (Boolean) var4.get(this.aGraphicsDevice5918);
				if (var5) {
					var4.set(this.aGraphicsDevice5918, Boolean.FALSE);
					var3 = true;
				}
			} catch (Throwable var8) {
			}
			try {
				this.aGraphicsDevice5918.setFullScreenWindow(arg0);
			} catch (RuntimeException var9) {
				if (var3) {
					try {
						Field var11 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
						var11.set(this.aGraphicsDevice5918, Boolean.TRUE);
					} catch (Throwable var6) {
					}
				}
				throw var9;
			}
			if (var3) {
				try {
					var4 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					var4.set(this.aGraphicsDevice5918, Boolean.TRUE);
				} catch (Throwable var7) {
				}
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "uv.p(" + ')');
		}
	}

	public Class504() throws Exception {
		GraphicsEnvironment var1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice5918 = var1.getDefaultScreenDevice();
		if (!this.aGraphicsDevice5918.isFullScreenSupported()) {
			GraphicsDevice[] var2 = var1.getScreenDevices();
			GraphicsDevice[] var3 = var2;
			for (int var4 = 0; var4 < var3.length; var4++) {
				GraphicsDevice var5 = var3[var4];
				if (var5 != null && var5.isFullScreenSupported()) {
					this.aGraphicsDevice5918 = var5;
					return;
				}
			}
			throw new Exception();
		}
	}

	public void method6139(int arg0) {
		try {
			if (this.aDisplayMode5917 != null) {
				DisplayMode[] var2 = this.aGraphicsDevice5918.getDisplayModes();
				boolean var3 = false;
				DisplayMode[] var4 = var2;
				for (int var5 = 0; var5 < var4.length; var5++) {
					DisplayMode var6 = var4[var5];
					if (var6.equals(this.aDisplayMode5917)) {
						this.aGraphicsDevice5918.setDisplayMode(this.aDisplayMode5917);
						var3 = true;
						break;
					}
				}
				if (!var3) {
					try {
						Field var9 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
						var9.setAccessible(true);
						var9.set(this.aGraphicsDevice5918, null);
					} catch (Throwable var7) {
					}
				}
				this.aDisplayMode5917 = null;
			}
			this.method6138(null, (byte) 1);
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "uv.i(" + ')');
		}
	}
}
