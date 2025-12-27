package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Class355_Sub1 extends Class355 implements KeyListener, FocusListener {

	public static int anInt7993 = 112;

	public static int anInt7994 = 128;

	public static int[] anIntArray7999 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 0, 0, 0, 0, 0, 0, 150, 151, 152, 153, 0, 100, 0, 0, 0, 0, 160, 161, 162, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	public Class471 aClass471_7998 = new Class471();

	public Class471 aClass471_7996 = new Class471();

	public boolean[] aBooleanArray7995 = new boolean[112];

	public Component aComponent7997;

	public Class355_Sub1(Component arg0) {
		Class102.method1224(433580414);
		this.method4126(arg0, (byte) 1);
	}

	public boolean method4112(int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray7995[arg0] : false;
	}

	public void method4126(Component arg0, byte arg1) {
		try {
			this.method4130(231162162);
			this.aComponent7997 = arg0;
			this.aComponent7997.addKeyListener(this);
			this.aComponent7997.addFocusListener(this);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aez.u(" + ')');
		}
	}

	public boolean isKeyHeld(int arg0, int arg1) {
		try {
			return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray7995[arg0] : false;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aez.i(" + ')');
		}
	}

	public void method4127(int arg0, char arg1, int arg2, int arg3) {
		try {
			Class330_Sub33 var5 = new Class330_Sub33();
			var5.anInt6645 = arg0;
			var5.aChar6649 = arg1;
			var5.anInt6646 = arg2;
			var5.aLong6648 = Class312.method3111((byte) 96);
			this.aClass471_7996.method5878(var5, (short) 8192);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "aez.g(" + ')');
		}
	}

	public Interface18 method4114(int arg0) {
		try {
			return (Interface18) this.aClass471_7998.method5867((short) 8960);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aez.p(" + ')');
		}
	}

	public synchronized void focusLost(FocusEvent arg0) {
		try {
			this.method4127(-1, '\u0000', 0, 1019032679);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aez.focusLost(" + ')');
		}
	}

	public synchronized void method4107(byte arg0) {
		try {
			this.aClass471_7998.method5866(613065745);
			for (Class330_Sub33 var2 = (Class330_Sub33) this.aClass471_7996.method5867((short) 8960); var2 != null; var2 = (Class330_Sub33) this.aClass471_7996.method5867((short) 8960)) {
				var2.anInt6644 = this.method4129((byte) -46);
				if (var2.anInt6645 == 0) {
					if (!this.aBooleanArray7995[var2.anInt6646]) {
						Class330_Sub33 var6 = new Class330_Sub33();
						var6.anInt6645 = 0;
						var6.aChar6649 = (char) 65535;
						var6.anInt6646 = var2.anInt6646;
						var6.aLong6648 = var2.aLong6648;
						var6.anInt6644 = var2.anInt6644;
						this.aClass471_7998.method5878(var6, (short) 8192);
						this.aBooleanArray7995[var2.anInt6646] = true;
					}
					var2.anInt6645 = 2;
					this.aClass471_7998.method5878(var2, (short) 8192);
				} else if (var2.anInt6645 == 1) {
					if (this.aBooleanArray7995[var2.anInt6646]) {
						this.aClass471_7998.method5878(var2, (short) 8192);
						this.aBooleanArray7995[var2.anInt6646] = false;
					}
				} else if (var2.anInt6645 == -1) {
					for (int var3 = 0; var3 < 112; var3++) {
						if (this.aBooleanArray7995[var3]) {
							Class330_Sub33 var4 = new Class330_Sub33();
							var4.anInt6645 = 1;
							var4.aChar6649 = (char) 65535;
							var4.anInt6646 = var3;
							var4.aLong6648 = var2.aLong6648;
							var4.anInt6644 = var2.anInt6644;
							this.aClass471_7998.method5878(var4, (short) 8192);
							this.aBooleanArray7995[var3] = false;
						}
					}
				} else if (var2.anInt6645 == 3) {
					this.aClass471_7998.method5878(var2, (short) 8192);
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aez.j(" + ')');
		}
	}

	public void method4110(byte arg0) {
		try {
			this.method4130(1133349892);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aez.o(" + ')');
		}
	}

	public void method4128(KeyEvent arg0, int arg1, int arg2) {
		try {
			int var4 = arg0.getKeyCode();
			if (var4 == 0) {
				var4 = 0;
			} else if (var4 >= 0 && var4 < anIntArray7999.length) {
				var4 = anIntArray7999[var4];
				if (arg1 == 0 && (var4 & 0x80) != 0) {
					var4 = 0;
				} else {
					var4 &= 0xFFFFFF7F;
				}
			} else {
				var4 = 0;
			}
			if (var4 != 0) {
				this.method4127(arg1, (char) 65535, var4, 1019032679);
				arg0.consume();
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aez.c(" + ')');
		}
	}

	public synchronized void keyPressed(KeyEvent arg0) {
		try {
			this.method4128(arg0, 0, -736620667);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aez.keyPressed(" + ')');
		}
	}

	public synchronized void keyTyped(KeyEvent arg0) {
		try {
			boolean var2 = SpecialKeys.type(arg0);
			char var3 = arg0.getKeyChar();
			if (!var2 && var3 != 65535 && Class43.method586(var3, -400649713)) {
				this.method4127(3, var3, -1, 1019032679);
				arg0.consume();
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aez.keyTyped(" + ')');
		}
	}

	public void focusGained(FocusEvent arg0) {
	}

	public int method4129(byte arg0) {
		try {
			int var2 = 0;
			if (this.aBooleanArray7995[81]) {
				var2 |= 0x1;
			}
			if (this.aBooleanArray7995[82]) {
				var2 |= 0x4;
			}
			if (this.aBooleanArray7995[86]) {
				var2 |= 0x2;
			}
			return var2;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aez.d(" + ')');
		}
	}

	public void method4109() {
		this.method4130(1309565073);
	}

	public Interface18 method4111() {
		return (Interface18) this.aClass471_7998.method5867((short) 8960);
	}

	public synchronized void method4116() {
		this.aClass471_7998.method5866(613065745);
		for (Class330_Sub33 var1 = (Class330_Sub33) this.aClass471_7996.method5867((short) 8960); var1 != null; var1 = (Class330_Sub33) this.aClass471_7996.method5867((short) 8960)) {
			var1.anInt6644 = this.method4129((byte) -128) * 160262395 * -357801421;
			if (var1.anInt6645 * -557589195 * 353062173 == 0) {
				if (!this.aBooleanArray7995[var1.anInt6646 * 1773750945 * -1579083423]) {
					Class330_Sub33 var4 = new Class330_Sub33();
					var4.anInt6645 = 0 * 353062173;
					var4.aChar6649 = (char) 65535;
					var4.anInt6646 = var1.anInt6646 * -1579083423 * 1773750945;
					var4.aLong6648 = var1.aLong6648 * -2600115034841157323L * -5992662257843988195L;
					var4.anInt6644 = var1.anInt6644 * 160262395 * -357801421;
					this.aClass471_7998.method5878(var4, (short) 8192);
					this.aBooleanArray7995[var1.anInt6646 * -1579083423 * 1773750945] = true;
				}
				var1.anInt6645 = -1115178390 * 353062173;
				this.aClass471_7998.method5878(var1, (short) 8192);
			} else if (var1.anInt6645 * -557589195 * 353062173 == 1) {
				if (this.aBooleanArray7995[var1.anInt6646 * -1579083423 * 1773750945]) {
					this.aClass471_7998.method5878(var1, (short) 8192);
					this.aBooleanArray7995[var1.anInt6646 * -1579083423 * 1773750945] = false;
				}
			} else if (var1.anInt6645 * -557589195 * 353062173 == -1) {
				for (int var2 = 0; var2 < 112; var2++) {
					if (this.aBooleanArray7995[var2]) {
						Class330_Sub33 var3 = new Class330_Sub33();
						var3.anInt6645 = -557589195 * 353062173;
						var3.aChar6649 = (char) 65535;
						var3.anInt6646 = var2 * -1579083423 * 1773750945;
						var3.aLong6648 = var1.aLong6648 * -2600115034841157323L * -5992662257843988195L;
						var3.anInt6644 = var1.anInt6644 * 160262395 * -357801421;
						this.aClass471_7998.method5878(var3, (short) 8192);
						this.aBooleanArray7995[var2] = false;
					}
				}
			} else if (var1.anInt6645 * -557589195 * 353062173 == 3) {
				this.aClass471_7998.method5878(var1, (short) 8192);
			}
		}
	}

	public synchronized void method4115() {
		this.aClass471_7998.method5866(613065745);
		for (Class330_Sub33 var1 = (Class330_Sub33) this.aClass471_7996.method5867((short) 8960); var1 != null; var1 = (Class330_Sub33) this.aClass471_7996.method5867((short) 8960)) {
			var1.anInt6644 = this.method4129((byte) -7) * 160262395 * -357801421;
			if (var1.anInt6645 * -557589195 * 353062173 == 0) {
				if (!this.aBooleanArray7995[var1.anInt6646 * 1773750945 * -1579083423]) {
					Class330_Sub33 var4 = new Class330_Sub33();
					var4.anInt6645 = 0 * 353062173;
					var4.aChar6649 = (char) 65535;
					var4.anInt6646 = var1.anInt6646 * -1579083423 * 1773750945;
					var4.aLong6648 = var1.aLong6648 * -2600115034841157323L * -5992662257843988195L;
					var4.anInt6644 = var1.anInt6644 * 160262395 * -357801421;
					this.aClass471_7998.method5878(var4, (short) 8192);
					this.aBooleanArray7995[var1.anInt6646 * -1579083423 * 1773750945] = true;
				}
				var1.anInt6645 = -1115178390 * 353062173;
				this.aClass471_7998.method5878(var1, (short) 8192);
			} else if (var1.anInt6645 * -557589195 * 353062173 == 1) {
				if (this.aBooleanArray7995[var1.anInt6646 * -1579083423 * 1773750945]) {
					this.aClass471_7998.method5878(var1, (short) 8192);
					this.aBooleanArray7995[var1.anInt6646 * -1579083423 * 1773750945] = false;
				}
			} else if (var1.anInt6645 * -557589195 * 353062173 == -1) {
				for (int var2 = 0; var2 < 112; var2++) {
					if (this.aBooleanArray7995[var2]) {
						Class330_Sub33 var3 = new Class330_Sub33();
						var3.anInt6645 = -557589195 * 353062173;
						var3.aChar6649 = (char) 65535;
						var3.anInt6646 = var2 * -1579083423 * 1773750945;
						var3.aLong6648 = var1.aLong6648 * -2600115034841157323L * -5992662257843988195L;
						var3.anInt6644 = var1.anInt6644 * 160262395 * -357801421;
						this.aClass471_7998.method5878(var3, (short) 8192);
						this.aBooleanArray7995[var2] = false;
					}
				}
			} else if (var1.anInt6645 * -557589195 * 353062173 == 3) {
				this.aClass471_7998.method5878(var1, (short) 8192);
			}
		}
	}

	public void method4113() {
		this.method4130(1046217439);
	}

	public void method4130(int arg0) {
		try {
			if (this.aComponent7997 != null) {
				this.aComponent7997.removeKeyListener(this);
				this.aComponent7997.removeFocusListener(this);
				this.aComponent7997 = null;
				for (int var2 = 0; var2 < 112; var2++) {
					this.aBooleanArray7995[var2] = false;
				}
				this.aClass471_7998.method5866(613065745);
				this.aClass471_7996.method5866(613065745);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aez.x(" + ')');
		}
	}

	public synchronized void keyReleased(KeyEvent arg0) {
		try {
			SpecialKeys.release(arg0);
			this.method4128(arg0, 1, -155170632);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aez.keyReleased(" + ')');
		}
	}

	public static final void method4131(int arg0, int arg1) {
		try {
			if (Class397_Sub1.method4681(arg0, null, -1532244766)) {
				Class330.method3255(Class3.aClass120Array56[arg0].aClass114Array1400, -1, (byte) 107);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aez.lr(" + ')');
		}
	}
}
