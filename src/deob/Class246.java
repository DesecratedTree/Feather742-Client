package deob;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.io.InputStream;

public class Class246 implements Interface14 {

	public int anInt6566;

	public int anInt6572;

	public int anInt6576;

	public int anInt6577;

	public int anInt6579;

	public int anInt6580;

	public int anInt6582;

	public int anInt6583;

	public int anInt6585;

	public static int anInt6586;

	public Color aColor6561;

	public Font aFont6562;

	public FontMetrics aFontMetrics6563;

	public Image anImage6564;

	public Image anImage6565;

	public Image anImage6567;

	public Image anImage6568;

	public Image anImage6569;

	public Image anImage6570;

	public Image anImage6571;

	public Image anImage6573;

	public Image anImage6578;

	public Image anImage6584;

	public boolean aBoolean6574;

	public boolean aBoolean6575;

	public boolean aBoolean6581;

	public int method195() {
		return 100;
	}

	public final int method2448(int arg0, int arg1) {
		try {
			return this.aBoolean6575 ? (Class300.anInt3058 - arg0) / 2 : 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "kh.r(" + ')');
		}
	}

	public final int method2449(int arg0, int arg1) {
		try {
			return this.aBoolean6574 ? (Class146.anInt1615 - arg0) / 2 : 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "kh.j(" + ')');
		}
	}

	public void method196(boolean arg0, int arg1) {
		try {
			if (!this.aBoolean6581 && this.aFont6562 == null) {
				try {
					String[] var3 = Class226.method2309(client.aString8964, ',', (byte) -2);
					if (var3.length != 23) {
						this.aBoolean6581 = true;
					}
					this.aBoolean6575 = Boolean.parseBoolean(var3[0]);
					this.aBoolean6574 = Boolean.parseBoolean(var3[1]);
					this.anInt6577 = Class204.method2185(var3[2], (byte) -97);
					this.anInt6576 = Class204.method2185(var3[3], (byte) -11);
					this.anInt6579 = Class204.method2185(var3[4], (byte) -75);
					this.anInt6580 = Class204.method2185(var3[5], (byte) -11);
					this.anInt6566 = Class204.method2185(var3[6], (byte) -8);
					this.anInt6582 = Class204.method2185(var3[7], (byte) -15);
					this.anInt6583 = Class204.method2185(var3[8], (byte) -14);
					this.anInt6572 = Class204.method2185(var3[9], (byte) -46);
					String var4 = var3[10];
					int var5 = Class204.method2185(var3[11], (byte) -105);
					int var6 = Class16.method449(var3[12].substring(2), 16, -1306186069);
					this.aFont6562 = new Font(var4, 0, var5);
					this.aFontMetrics6563 = Class475.aCanvas5700.getFontMetrics(this.aFont6562);
					this.aColor6561 = new Color(var6);
					MediaTracker var7 = new MediaTracker(Class475.aCanvas5700);
					this.anImage6565 = this.method2450(var3[13], (short) -6240);
					var7.addImage(this.anImage6565, 0);
					this.anImage6567 = this.method2450(var3[14], (short) -5786);
					var7.addImage(this.anImage6567, 1);
					this.anImage6584 = this.method2450(var3[15], (short) -7404);
					var7.addImage(this.anImage6584, 2);
					this.anImage6568 = this.method2450(var3[16], (short) 1365);
					var7.addImage(this.anImage6568, 3);
					this.anImage6569 = this.method2450(var3[17], (short) -14251);
					var7.addImage(this.anImage6569, 4);
					this.anImage6570 = this.method2450(var3[18], (short) -22880);
					var7.addImage(this.anImage6570, 5);
					this.anImage6578 = this.method2450(var3[19], (short) 7010);
					var7.addImage(this.anImage6578, 6);
					this.anImage6571 = this.method2450(var3[20], (short) 1918);
					var7.addImage(this.anImage6571, 7);
					this.anImage6573 = this.method2450(var3[21], (short) 9565);
					var7.addImage(this.anImage6573, 8);
					var7.waitForAll();
					this.anInt6585 = Class204.method2185(var3[22], (byte) -77);
				} catch (Exception var34) {
					this.aBoolean6581 = true;
				}
			}
			if (this.aBoolean6581) {
				this.method2451(-1390004513);
			} else {
				Graphics var37 = Class475.aCanvas5700.getGraphics();
				if (var37 == null) {
					Class475.aCanvas5700.repaint();
				} else {
					try {
						int var38 = Class239.aClass240_2592.method2388((byte) -11);
						String var39 = Class239.aClass240_2592.method2393((byte) 0);
						if (Class464_Sub18.anImage8701 == null) {
							Class464_Sub18.anImage8701 = Class475.aCanvas5700.createImage(Class300.anInt3058, Class146.anInt1615);
						}
						Graphics var40 = Class464_Sub18.anImage8701.getGraphics();
						var40.setColor(Color.BLACK);
						var40.fillRect(0, 0, Class300.anInt3058, Class146.anInt1615);
						int var41 = this.anImage6578.getWidth(null);
						int var8 = this.anImage6571.getWidth(null);
						int var9 = this.anImage6573.getWidth(null);
						int var10 = this.anImage6578.getHeight(null);
						int var11 = this.anImage6571.getHeight(null);
						int var12 = this.anImage6573.getHeight(null);
						var40.drawImage(this.anImage6578, this.method2448(var41, 1300214499) + this.anInt6566 - this.anInt6583 / 2, this.method2449(var10, 1082028011) + this.anInt6582, null);
						int var13 = this.anInt6566 - this.anInt6583 / 2 + var41;
						int var14 = this.anInt6583 / 2 + this.anInt6566;
						int var15;
						for (var15 = var13; var15 <= var14; var15 += var9) {
							var40.drawImage(this.anImage6573, this.method2448(var41, 2123939337) + this.anInt6566 + var15, this.method2449(var12, 1082028011) + this.anInt6582, null);
						}
						var40.drawImage(this.anImage6571, this.method2448(var8, 1734012674) + this.anInt6566 + this.anInt6583 / 2, this.method2449(var11, 1082028011) + this.anInt6582, null);
						var15 = this.anImage6584.getWidth(null);
						int var16 = this.anImage6584.getHeight(null);
						int var17 = this.anImage6568.getWidth(null);
						int var18 = this.anImage6568.getHeight(null);
						int var19 = this.anImage6570.getHeight(null);
						int var20 = this.anImage6569.getWidth(null);
						int var21 = this.anImage6569.getHeight(null);
						int var22 = this.anImage6570.getWidth(null);
						int var23 = this.anImage6565.getWidth(null);
						int var24 = this.anImage6567.getWidth(null);
						int var25 = this.method2448(this.anInt6579, 1248529886) + this.anInt6577;
						int var26 = this.method2449(this.anInt6580, 1082028011) + this.anInt6576;
						var40.drawImage(this.anImage6584, var25, (this.anInt6580 - var16) / 2 + var26, null);
						var40.drawImage(this.anImage6568, var25 + this.anInt6579 - var17, var26 + (this.anInt6580 - var18) / 2, null);
						if (this.anImage6564 == null) {
							this.anImage6564 = Class475.aCanvas5700.createImage(this.anInt6579 - var15 - var17, this.anInt6580);
						}
						Graphics var27 = this.anImage6564.getGraphics();
						int var28;
						for (var28 = 0; var28 < this.anInt6579 - var15 - var17; var28 += var20) {
							var27.drawImage(this.anImage6569, var28, 0, null);
						}
						for (var28 = 0; var28 < this.anInt6579 - var15 - var17; var28 += var22) {
							var27.drawImage(this.anImage6570, var28, this.anInt6580 - var19, null);
						}
						var28 = var38 * (this.anInt6579 - var15 - var17) / 100;
						int var33;
						if (var28 > 0) {
							Image var29 = Class475.aCanvas5700.createImage(var28, this.anInt6580 - var21 - var19);
							int var30 = var29.getWidth(null);
							Graphics var31 = var29.getGraphics();
							int var32 = this.anInt6585 * Class129.method1556(-865445024) / 10 % var23;
							for (var33 = var32 - var23; var33 < var30; var33 += var23) {
								var31.drawImage(this.anImage6565, var33, 0, null);
							}
							var27.drawImage(var29, 0, var21, null);
						}
						int var42 = var28;
						var28 = this.anInt6579 - var15 - var17 - var28;
						if (var28 > 0) {
							Image var43 = Class475.aCanvas5700.createImage(var28, this.anInt6580 - var21 - var19);
							int var44 = var43.getWidth(null);
							Graphics var45 = var43.getGraphics();
							for (var33 = 0; var33 < var44; var33 += var24) {
								var45.drawImage(this.anImage6567, var33, 0, null);
							}
							var27.drawImage(var43, var42, var21, null);
						}
						var40.drawImage(this.anImage6564, var25 + var15, var26, null);
						var40.setFont(this.aFont6562);
						var40.setColor(this.aColor6561);
						var40.drawString(var39, var25 + (this.anInt6579 - this.aFontMetrics6563.stringWidth(var39)) / 2, var26 + 4 + this.anInt6580 / 2 + this.anInt6572);
						var37.drawImage(Class464_Sub18.anImage8701, 0, 0, null);
					} catch (Exception var35) {
						this.aBoolean6581 = true;
					}
				}
			}
		} catch (RuntimeException var36) {
			throw Class476.method5964(var36, "kh.i(" + ')');
		}
	}

	public Image method2450(String arg0, short arg1) throws IOException {
		try {
			try {
				InputStream var4 = Class293.anApplet6804.getClass().getClassLoader().getResourceAsStream(arg0);
				byte[] var5 = new byte[4000];
				int var6 = 0;
				int var7;
				while ((var7 = var4.read()) != -1) {
					var5[var6++] = (byte) var7;
				}
				Image var8 = Toolkit.getDefaultToolkit().createImage(var5);
				Image var3 = var8;
				return var3;
			} catch (Exception var9) {
				throw new IOException();
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "kh.p(" + ')');
		}
	}

	public void method2451(int arg0) {
		try {
			Class6.method403(Class239.aClass240_2592.method2388((byte) -43), Class239.aClass240_2592.method2393((byte) 0), client.aColorArray9005[client.anInt8957], client.aColorArray9006[client.anInt8957], client.aColorArray9007[client.anInt8957], 65536);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "kh.o(" + ')');
		}
	}

	public void method203(int arg0) {
	}

	public void method209(byte arg0) {
		try {
			Class146.method1732((byte) -3);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "kh.s(" + ')');
		}
	}

	public boolean method198(long arg0) {
		try {
			return true;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "kh.w(" + ')');
		}
	}

	public void method194() {
	}

	public int method212(int arg0) {
		try {
			return 100;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "kh.z(" + ')');
		}
	}

	public int method199(int arg0) {
		try {
			return 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "kh.n(" + ')');
		}
	}

	public void method208() {
	}

	public void method200(boolean arg0) {
		if (!this.aBoolean6581 && this.aFont6562 == null) {
			try {
				String[] var2 = Class226.method2309(client.aString8964, ',', (byte) -103);
				if (var2.length != 23) {
					this.aBoolean6581 = true;
				}
				this.aBoolean6575 = Boolean.parseBoolean(var2[0]);
				this.aBoolean6574 = Boolean.parseBoolean(var2[1]);
				this.anInt6577 = Class204.method2185(var2[2], (byte) -80) * 1569505781 * 1775182429;
				this.anInt6576 = Class204.method2185(var2[3], (byte) -61) * -1568942051 * 2095950389;
				this.anInt6579 = Class204.method2185(var2[4], (byte) -72) * -515813395 * -1932040731;
				this.anInt6580 = Class204.method2185(var2[5], (byte) -13) * -294649369 * -870350377;
				this.anInt6566 = Class204.method2185(var2[6], (byte) -67) * 1859821005 * -297560315;
				this.anInt6582 = Class204.method2185(var2[7], (byte) -99) * 417529401 * -919760887;
				this.anInt6583 = Class204.method2185(var2[8], (byte) -7) * -422354117 * -513835533;
				this.anInt6572 = Class204.method2185(var2[9], (byte) -9) * 1378743129 * 1476207849;
				String var3 = var2[10];
				int var4 = Class204.method2185(var2[11], (byte) -88);
				int var5 = Class16.method449(var2[12].substring(2), 16, 1283740655);
				this.aFont6562 = new Font(var3, 0, var4);
				this.aFontMetrics6563 = Class475.aCanvas5700.getFontMetrics(this.aFont6562);
				this.aColor6561 = new Color(var5);
				MediaTracker var6 = new MediaTracker(Class475.aCanvas5700);
				this.anImage6565 = this.method2450(var2[13], (short) -25034);
				var6.addImage(this.anImage6565, 0);
				this.anImage6567 = this.method2450(var2[14], (short) -19383);
				var6.addImage(this.anImage6567, 1);
				this.anImage6584 = this.method2450(var2[15], (short) 18026);
				var6.addImage(this.anImage6584, 2);
				this.anImage6568 = this.method2450(var2[16], (short) -12884);
				var6.addImage(this.anImage6568, 3);
				this.anImage6569 = this.method2450(var2[17], (short) -24939);
				var6.addImage(this.anImage6569, 4);
				this.anImage6570 = this.method2450(var2[18], (short) 12564);
				var6.addImage(this.anImage6570, 5);
				this.anImage6578 = this.method2450(var2[19], (short) 1871);
				var6.addImage(this.anImage6578, 6);
				this.anImage6571 = this.method2450(var2[20], (short) 9959);
				var6.addImage(this.anImage6571, 7);
				this.anImage6573 = this.method2450(var2[21], (short) 22936);
				var6.addImage(this.anImage6573, 8);
				var6.waitForAll();
				this.anInt6585 = Class204.method2185(var2[22], (byte) -69) * -23173277 * 96358987;
			} catch (Exception var33) {
				this.aBoolean6581 = true;
			}
		}
		if (this.aBoolean6581) {
			this.method2451(-1390004513);
			return;
		}
		Graphics var35 = Class475.aCanvas5700.getGraphics();
		if (var35 == null) {
			Class475.aCanvas5700.repaint();
			return;
		}
		try {
			int var36 = Class239.aClass240_2592.method2388((byte) -45);
			String var37 = Class239.aClass240_2592.method2393((byte) 0);
			if (Class464_Sub18.anImage8701 == null) {
				Class464_Sub18.anImage8701 = Class475.aCanvas5700.createImage(Class300.anInt3058 * 944530027 * -1969079741, Class146.anInt1615 * -1548608507 * -343519027);
			}
			Graphics var38 = Class464_Sub18.anImage8701.getGraphics();
			var38.setColor(Color.BLACK);
			var38.fillRect(0, 0, Class300.anInt3058 * 944530027 * -1969079741, Class146.anInt1615 * -1548608507 * -343519027);
			int var39 = this.anImage6578.getWidth(null);
			int var7 = this.anImage6571.getWidth(null);
			int var8 = this.anImage6573.getWidth(null);
			int var9 = this.anImage6578.getHeight(null);
			int var10 = this.anImage6571.getHeight(null);
			int var11 = this.anImage6573.getHeight(null);
			var38.drawImage(this.anImage6578, this.method2448(var39, 1258749024) + this.anInt6566 * 1859821005 * -297560315 - this.anInt6583 * -513835533 * -422354117 / 2, this.method2449(var9, 1082028011) + this.anInt6582 * 417529401 * -919760887, null);
			int var12 = this.anInt6566 * 1859821005 * -297560315 - this.anInt6583 * -513835533 * -422354117 / 2 + var39;
			int var13 = this.anInt6583 * -422354117 * -513835533 / 2 + this.anInt6566 * 1859821005 * -297560315;
			int var14;
			for (var14 = var12; var14 <= var13; var14 += var8) {
				var38.drawImage(this.anImage6573, this.method2448(var39, 1867568470) + this.anInt6566 * -297560315 * 1859821005 + var14, this.method2449(var11, 1082028011) + this.anInt6582 * 417529401 * -919760887, null);
			}
			var38.drawImage(this.anImage6571, this.method2448(var7, 1967997948) + this.anInt6566 * -297560315 * 1859821005 + this.anInt6583 * -513835533 * -422354117 / 2, this.method2449(var10, 1082028011) + this.anInt6582 * 417529401 * -919760887, null);
			var14 = this.anImage6584.getWidth(null);
			int var15 = this.anImage6584.getHeight(null);
			int var16 = this.anImage6568.getWidth(null);
			int var17 = this.anImage6568.getHeight(null);
			int var18 = this.anImage6570.getHeight(null);
			int var19 = this.anImage6569.getWidth(null);
			int var20 = this.anImage6569.getHeight(null);
			int var21 = this.anImage6570.getWidth(null);
			int var22 = this.anImage6565.getWidth(null);
			int var23 = this.anImage6567.getWidth(null);
			int var24 = this.method2448(this.anInt6579 * -1932040731 * -515813395, 1300042292) + this.anInt6577 * 1775182429 * 1569505781;
			int var25 = this.method2449(this.anInt6580 * -870350377 * -294649369, 1082028011) + this.anInt6576 * 2095950389 * -1568942051;
			var38.drawImage(this.anImage6584, var24, (this.anInt6580 * -870350377 * -294649369 - var15) / 2 + var25, null);
			var38.drawImage(this.anImage6568, var24 + this.anInt6579 * -1932040731 * -515813395 - var16, var25 + (this.anInt6580 * -870350377 * -294649369 - var17) / 2, null);
			if (this.anImage6564 == null) {
				this.anImage6564 = Class475.aCanvas5700.createImage(this.anInt6579 * -515813395 * -1932040731 - var14 - var16, this.anInt6580 * -870350377 * -294649369);
			}
			Graphics var26 = this.anImage6564.getGraphics();
			int var27;
			for (var27 = 0; var27 < this.anInt6579 * -1932040731 * -515813395 - var14 - var16; var27 += var19) {
				var26.drawImage(this.anImage6569, var27, 0, null);
			}
			for (var27 = 0; var27 < this.anInt6579 * -1932040731 * -515813395 - var14 - var16; var27 += var21) {
				var26.drawImage(this.anImage6570, var27, this.anInt6580 * -294649369 * -870350377 - var18, null);
			}
			var27 = var36 * (this.anInt6579 * -1932040731 * -515813395 - var14 - var16) / 100;
			int var32;
			if (var27 > 0) {
				Image var28 = Class475.aCanvas5700.createImage(var27, this.anInt6580 * -870350377 * -294649369 - var20 - var18);
				int var29 = var28.getWidth(null);
				Graphics var30 = var28.getGraphics();
				int var31 = this.anInt6585 * 96358987 * -23173277 * Class129.method1556(-594989928) / 10 % var22;
				for (var32 = var31 - var22; var32 < var29; var32 += var22) {
					var30.drawImage(this.anImage6565, var32, 0, null);
				}
				var26.drawImage(var28, 0, var20, null);
			}
			int var40 = var27;
			var27 = this.anInt6579 * -515813395 * -1932040731 - var14 - var16 - var27;
			if (var27 > 0) {
				Image var41 = Class475.aCanvas5700.createImage(var27, this.anInt6580 * -294649369 * -870350377 - var20 - var18);
				int var42 = var41.getWidth(null);
				Graphics var43 = var41.getGraphics();
				for (var32 = 0; var32 < var42; var32 += var23) {
					var43.drawImage(this.anImage6567, var32, 0, null);
				}
				var26.drawImage(var41, var40, var20, null);
			}
			var38.drawImage(this.anImage6564, var24 + var14, var25, null);
			var38.setFont(this.aFont6562);
			var38.setColor(this.aColor6561);
			var38.drawString(var37, var24 + (this.anInt6579 * -515813395 * -1932040731 - this.aFontMetrics6563.stringWidth(var37)) / 2, var25 + 4 + this.anInt6580 * -294649369 * -870350377 / 2 + this.anInt6572 * 1476207849 * 1378743129);
			var35.drawImage(Class464_Sub18.anImage8701, 0, 0, null);
		} catch (Exception var34) {
			this.aBoolean6581 = true;
		}
	}

	public void method201(boolean arg0) {
		if (!this.aBoolean6581 && this.aFont6562 == null) {
			try {
				String[] var2 = Class226.method2309(client.aString8964, ',', (byte) -114);
				if (var2.length != 23) {
					this.aBoolean6581 = true;
				}
				this.aBoolean6575 = Boolean.parseBoolean(var2[0]);
				this.aBoolean6574 = Boolean.parseBoolean(var2[1]);
				this.anInt6577 = Class204.method2185(var2[2], (byte) -128) * 1569505781 * 1775182429;
				this.anInt6576 = Class204.method2185(var2[3], (byte) -74) * -1568942051 * 2095950389;
				this.anInt6579 = Class204.method2185(var2[4], (byte) -75) * -515813395 * -1932040731;
				this.anInt6580 = Class204.method2185(var2[5], (byte) -111) * -294649369 * -870350377;
				this.anInt6566 = Class204.method2185(var2[6], (byte) -66) * 1859821005 * -297560315;
				this.anInt6582 = Class204.method2185(var2[7], (byte) -99) * 417529401 * -919760887;
				this.anInt6583 = Class204.method2185(var2[8], (byte) -67) * -422354117 * -513835533;
				this.anInt6572 = Class204.method2185(var2[9], (byte) -7) * 1378743129 * 1476207849;
				String var3 = var2[10];
				int var4 = Class204.method2185(var2[11], (byte) -49);
				int var5 = Class16.method449(var2[12].substring(2), 16, -1647237346);
				this.aFont6562 = new Font(var3, 0, var4);
				this.aFontMetrics6563 = Class475.aCanvas5700.getFontMetrics(this.aFont6562);
				this.aColor6561 = new Color(var5);
				MediaTracker var6 = new MediaTracker(Class475.aCanvas5700);
				this.anImage6565 = this.method2450(var2[13], (short) 16665);
				var6.addImage(this.anImage6565, 0);
				this.anImage6567 = this.method2450(var2[14], (short) -18032);
				var6.addImage(this.anImage6567, 1);
				this.anImage6584 = this.method2450(var2[15], (short) 2572);
				var6.addImage(this.anImage6584, 2);
				this.anImage6568 = this.method2450(var2[16], (short) -4445);
				var6.addImage(this.anImage6568, 3);
				this.anImage6569 = this.method2450(var2[17], (short) -12323);
				var6.addImage(this.anImage6569, 4);
				this.anImage6570 = this.method2450(var2[18], (short) -1741);
				var6.addImage(this.anImage6570, 5);
				this.anImage6578 = this.method2450(var2[19], (short) 3138);
				var6.addImage(this.anImage6578, 6);
				this.anImage6571 = this.method2450(var2[20], (short) -8044);
				var6.addImage(this.anImage6571, 7);
				this.anImage6573 = this.method2450(var2[21], (short) 10397);
				var6.addImage(this.anImage6573, 8);
				var6.waitForAll();
				this.anInt6585 = Class204.method2185(var2[22], (byte) -123) * -23173277 * 96358987;
			} catch (Exception var33) {
				this.aBoolean6581 = true;
			}
		}
		if (this.aBoolean6581) {
			this.method2451(-1390004513);
			return;
		}
		Graphics var35 = Class475.aCanvas5700.getGraphics();
		if (var35 == null) {
			Class475.aCanvas5700.repaint();
			return;
		}
		try {
			int var36 = Class239.aClass240_2592.method2388((byte) -46);
			String var37 = Class239.aClass240_2592.method2393((byte) 0);
			if (Class464_Sub18.anImage8701 == null) {
				Class464_Sub18.anImage8701 = Class475.aCanvas5700.createImage(Class300.anInt3058 * 944530027 * -1969079741, Class146.anInt1615 * -1548608507 * -343519027);
			}
			Graphics var38 = Class464_Sub18.anImage8701.getGraphics();
			var38.setColor(Color.BLACK);
			var38.fillRect(0, 0, Class300.anInt3058 * 944530027 * -1969079741, Class146.anInt1615 * -1548608507 * -343519027);
			int var39 = this.anImage6578.getWidth(null);
			int var7 = this.anImage6571.getWidth(null);
			int var8 = this.anImage6573.getWidth(null);
			int var9 = this.anImage6578.getHeight(null);
			int var10 = this.anImage6571.getHeight(null);
			int var11 = this.anImage6573.getHeight(null);
			var38.drawImage(this.anImage6578, this.method2448(var39, 2045908869) + this.anInt6566 * 1859821005 * -297560315 - this.anInt6583 * -513835533 * -422354117 / 2, this.method2449(var9, 1082028011) + this.anInt6582 * 417529401 * -919760887, null);
			int var12 = this.anInt6566 * 1859821005 * -297560315 - this.anInt6583 * -513835533 * -422354117 / 2 + var39;
			int var13 = this.anInt6583 * -422354117 * -513835533 / 2 + this.anInt6566 * 1859821005 * -297560315;
			int var14;
			for (var14 = var12; var14 <= var13; var14 += var8) {
				var38.drawImage(this.anImage6573, this.method2448(var39, 1738416840) + this.anInt6566 * -297560315 * 1859821005 + var14, this.method2449(var11, 1082028011) + this.anInt6582 * 417529401 * -919760887, null);
			}
			var38.drawImage(this.anImage6571, this.method2448(var7, 2144335930) + this.anInt6566 * -297560315 * 1859821005 + this.anInt6583 * -513835533 * -422354117 / 2, this.method2449(var10, 1082028011) + this.anInt6582 * 417529401 * -919760887, null);
			var14 = this.anImage6584.getWidth(null);
			int var15 = this.anImage6584.getHeight(null);
			int var16 = this.anImage6568.getWidth(null);
			int var17 = this.anImage6568.getHeight(null);
			int var18 = this.anImage6570.getHeight(null);
			int var19 = this.anImage6569.getWidth(null);
			int var20 = this.anImage6569.getHeight(null);
			int var21 = this.anImage6570.getWidth(null);
			int var22 = this.anImage6565.getWidth(null);
			int var23 = this.anImage6567.getWidth(null);
			int var24 = this.method2448(this.anInt6579 * -1932040731 * -515813395, 1234655120) + this.anInt6577 * 1775182429 * 1569505781;
			int var25 = this.method2449(this.anInt6580 * -870350377 * -294649369, 1082028011) + this.anInt6576 * 2095950389 * -1568942051;
			var38.drawImage(this.anImage6584, var24, (this.anInt6580 * -870350377 * -294649369 - var15) / 2 + var25, null);
			var38.drawImage(this.anImage6568, var24 + this.anInt6579 * -1932040731 * -515813395 - var16, var25 + (this.anInt6580 * -870350377 * -294649369 - var17) / 2, null);
			if (this.anImage6564 == null) {
				this.anImage6564 = Class475.aCanvas5700.createImage(this.anInt6579 * -515813395 * -1932040731 - var14 - var16, this.anInt6580 * -870350377 * -294649369);
			}
			Graphics var26 = this.anImage6564.getGraphics();
			int var27;
			for (var27 = 0; var27 < this.anInt6579 * -1932040731 * -515813395 - var14 - var16; var27 += var19) {
				var26.drawImage(this.anImage6569, var27, 0, null);
			}
			for (var27 = 0; var27 < this.anInt6579 * -1932040731 * -515813395 - var14 - var16; var27 += var21) {
				var26.drawImage(this.anImage6570, var27, this.anInt6580 * -294649369 * -870350377 - var18, null);
			}
			var27 = var36 * (this.anInt6579 * -1932040731 * -515813395 - var14 - var16) / 100;
			int var32;
			if (var27 > 0) {
				Image var28 = Class475.aCanvas5700.createImage(var27, this.anInt6580 * -870350377 * -294649369 - var20 - var18);
				int var29 = var28.getWidth(null);
				Graphics var30 = var28.getGraphics();
				int var31 = this.anInt6585 * 96358987 * -23173277 * Class129.method1556(-1507721702) / 10 % var22;
				for (var32 = var31 - var22; var32 < var29; var32 += var22) {
					var30.drawImage(this.anImage6565, var32, 0, null);
				}
				var26.drawImage(var28, 0, var20, null);
			}
			int var40 = var27;
			var27 = this.anInt6579 * -515813395 * -1932040731 - var14 - var16 - var27;
			if (var27 > 0) {
				Image var41 = Class475.aCanvas5700.createImage(var27, this.anInt6580 * -294649369 * -870350377 - var20 - var18);
				int var42 = var41.getWidth(null);
				Graphics var43 = var41.getGraphics();
				for (var32 = 0; var32 < var42; var32 += var23) {
					var43.drawImage(this.anImage6567, var32, 0, null);
				}
				var26.drawImage(var41, var40, var20, null);
			}
			var38.drawImage(this.anImage6564, var24 + var14, var25, null);
			var38.setFont(this.aFont6562);
			var38.setColor(this.aColor6561);
			var38.drawString(var37, var24 + (this.anInt6579 * -515813395 * -1932040731 - this.aFontMetrics6563.stringWidth(var37)) / 2, var25 + 4 + this.anInt6580 * -294649369 * -870350377 / 2 + this.anInt6572 * 1476207849 * 1378743129);
			var35.drawImage(Class464_Sub18.anImage8701, 0, 0, null);
		} catch (Exception var34) {
			this.aBoolean6581 = true;
		}
	}

	public void method202(boolean arg0) {
		if (!this.aBoolean6581 && this.aFont6562 == null) {
			try {
				String[] var2 = Class226.method2309(client.aString8964, ',', (byte) -10);
				if (var2.length != 23) {
					this.aBoolean6581 = true;
				}
				this.aBoolean6575 = Boolean.parseBoolean(var2[0]);
				this.aBoolean6574 = Boolean.parseBoolean(var2[1]);
				this.anInt6577 = Class204.method2185(var2[2], (byte) -97) * 1569505781 * 1775182429;
				this.anInt6576 = Class204.method2185(var2[3], (byte) -113) * -1568942051 * 2095950389;
				this.anInt6579 = Class204.method2185(var2[4], (byte) -93) * -515813395 * -1932040731;
				this.anInt6580 = Class204.method2185(var2[5], (byte) -11) * -294649369 * -870350377;
				this.anInt6566 = Class204.method2185(var2[6], (byte) -65) * 1859821005 * -297560315;
				this.anInt6582 = Class204.method2185(var2[7], (byte) -69) * 417529401 * -919760887;
				this.anInt6583 = Class204.method2185(var2[8], (byte) -114) * -422354117 * -513835533;
				this.anInt6572 = Class204.method2185(var2[9], (byte) -78) * 1378743129 * 1476207849;
				String var3 = var2[10];
				int var4 = Class204.method2185(var2[11], (byte) -72);
				int var5 = Class16.method449(var2[12].substring(2), 16, 657745813);
				this.aFont6562 = new Font(var3, 0, var4);
				this.aFontMetrics6563 = Class475.aCanvas5700.getFontMetrics(this.aFont6562);
				this.aColor6561 = new Color(var5);
				MediaTracker var6 = new MediaTracker(Class475.aCanvas5700);
				this.anImage6565 = this.method2450(var2[13], (short) 9700);
				var6.addImage(this.anImage6565, 0);
				this.anImage6567 = this.method2450(var2[14], (short) -4560);
				var6.addImage(this.anImage6567, 1);
				this.anImage6584 = this.method2450(var2[15], (short) 12102);
				var6.addImage(this.anImage6584, 2);
				this.anImage6568 = this.method2450(var2[16], (short) 17352);
				var6.addImage(this.anImage6568, 3);
				this.anImage6569 = this.method2450(var2[17], (short) -18828);
				var6.addImage(this.anImage6569, 4);
				this.anImage6570 = this.method2450(var2[18], (short) -4852);
				var6.addImage(this.anImage6570, 5);
				this.anImage6578 = this.method2450(var2[19], (short) -19197);
				var6.addImage(this.anImage6578, 6);
				this.anImage6571 = this.method2450(var2[20], (short) -6586);
				var6.addImage(this.anImage6571, 7);
				this.anImage6573 = this.method2450(var2[21], (short) -5594);
				var6.addImage(this.anImage6573, 8);
				var6.waitForAll();
				this.anInt6585 = Class204.method2185(var2[22], (byte) -39) * -23173277 * 96358987;
			} catch (Exception var33) {
				this.aBoolean6581 = true;
			}
		}
		if (this.aBoolean6581) {
			this.method2451(-1390004513);
			return;
		}
		Graphics var35 = Class475.aCanvas5700.getGraphics();
		if (var35 == null) {
			Class475.aCanvas5700.repaint();
			return;
		}
		try {
			int var36 = Class239.aClass240_2592.method2388((byte) -55);
			String var37 = Class239.aClass240_2592.method2393((byte) 0);
			if (Class464_Sub18.anImage8701 == null) {
				Class464_Sub18.anImage8701 = Class475.aCanvas5700.createImage(Class300.anInt3058 * 944530027 * -1969079741, Class146.anInt1615 * -1548608507 * -343519027);
			}
			Graphics var38 = Class464_Sub18.anImage8701.getGraphics();
			var38.setColor(Color.BLACK);
			var38.fillRect(0, 0, Class300.anInt3058 * 944530027 * -1969079741, Class146.anInt1615 * -1548608507 * -343519027);
			int var39 = this.anImage6578.getWidth(null);
			int var7 = this.anImage6571.getWidth(null);
			int var8 = this.anImage6573.getWidth(null);
			int var9 = this.anImage6578.getHeight(null);
			int var10 = this.anImage6571.getHeight(null);
			int var11 = this.anImage6573.getHeight(null);
			var38.drawImage(this.anImage6578, this.method2448(var39, 1387128676) + this.anInt6566 * 1859821005 * -297560315 - this.anInt6583 * -513835533 * -422354117 / 2, this.method2449(var9, 1082028011) + this.anInt6582 * 417529401 * -919760887, null);
			int var12 = this.anInt6566 * 1859821005 * -297560315 - this.anInt6583 * -513835533 * -422354117 / 2 + var39;
			int var13 = this.anInt6583 * -422354117 * -513835533 / 2 + this.anInt6566 * 1859821005 * -297560315;
			int var14;
			for (var14 = var12; var14 <= var13; var14 += var8) {
				var38.drawImage(this.anImage6573, this.method2448(var39, 1290041810) + this.anInt6566 * -297560315 * 1859821005 + var14, this.method2449(var11, 1082028011) + this.anInt6582 * 417529401 * -919760887, null);
			}
			var38.drawImage(this.anImage6571, this.method2448(var7, 1199003214) + this.anInt6566 * -297560315 * 1859821005 + this.anInt6583 * -513835533 * -422354117 / 2, this.method2449(var10, 1082028011) + this.anInt6582 * 417529401 * -919760887, null);
			var14 = this.anImage6584.getWidth(null);
			int var15 = this.anImage6584.getHeight(null);
			int var16 = this.anImage6568.getWidth(null);
			int var17 = this.anImage6568.getHeight(null);
			int var18 = this.anImage6570.getHeight(null);
			int var19 = this.anImage6569.getWidth(null);
			int var20 = this.anImage6569.getHeight(null);
			int var21 = this.anImage6570.getWidth(null);
			int var22 = this.anImage6565.getWidth(null);
			int var23 = this.anImage6567.getWidth(null);
			int var24 = this.method2448(this.anInt6579 * -1932040731 * -515813395, 1605783200) + this.anInt6577 * 1775182429 * 1569505781;
			int var25 = this.method2449(this.anInt6580 * -870350377 * -294649369, 1082028011) + this.anInt6576 * 2095950389 * -1568942051;
			var38.drawImage(this.anImage6584, var24, (this.anInt6580 * -870350377 * -294649369 - var15) / 2 + var25, null);
			var38.drawImage(this.anImage6568, var24 + this.anInt6579 * -1932040731 * -515813395 - var16, var25 + (this.anInt6580 * -870350377 * -294649369 - var17) / 2, null);
			if (this.anImage6564 == null) {
				this.anImage6564 = Class475.aCanvas5700.createImage(this.anInt6579 * -515813395 * -1932040731 - var14 - var16, this.anInt6580 * -870350377 * -294649369);
			}
			Graphics var26 = this.anImage6564.getGraphics();
			int var27;
			for (var27 = 0; var27 < this.anInt6579 * -1932040731 * -515813395 - var14 - var16; var27 += var19) {
				var26.drawImage(this.anImage6569, var27, 0, null);
			}
			for (var27 = 0; var27 < this.anInt6579 * -1932040731 * -515813395 - var14 - var16; var27 += var21) {
				var26.drawImage(this.anImage6570, var27, this.anInt6580 * -294649369 * -870350377 - var18, null);
			}
			var27 = var36 * (this.anInt6579 * -1932040731 * -515813395 - var14 - var16) / 100;
			int var32;
			if (var27 > 0) {
				Image var28 = Class475.aCanvas5700.createImage(var27, this.anInt6580 * -870350377 * -294649369 - var20 - var18);
				int var29 = var28.getWidth(null);
				Graphics var30 = var28.getGraphics();
				int var31 = this.anInt6585 * 96358987 * -23173277 * Class129.method1556(-750792430) / 10 % var22;
				for (var32 = var31 - var22; var32 < var29; var32 += var22) {
					var30.drawImage(this.anImage6565, var32, 0, null);
				}
				var26.drawImage(var28, 0, var20, null);
			}
			int var40 = var27;
			var27 = this.anInt6579 * -515813395 * -1932040731 - var14 - var16 - var27;
			if (var27 > 0) {
				Image var41 = Class475.aCanvas5700.createImage(var27, this.anInt6580 * -294649369 * -870350377 - var20 - var18);
				int var42 = var41.getWidth(null);
				Graphics var43 = var41.getGraphics();
				for (var32 = 0; var32 < var42; var32 += var23) {
					var43.drawImage(this.anImage6567, var32, 0, null);
				}
				var26.drawImage(var41, var40, var20, null);
			}
			var38.drawImage(this.anImage6564, var24 + var14, var25, null);
			var38.setFont(this.aFont6562);
			var38.setColor(this.aColor6561);
			var38.drawString(var37, var24 + (this.anInt6579 * -515813395 * -1932040731 - this.aFontMetrics6563.stringWidth(var37)) / 2, var25 + 4 + this.anInt6580 * -294649369 * -870350377 / 2 + this.anInt6572 * 1476207849 * 1378743129);
			var35.drawImage(Class464_Sub18.anImage8701, 0, 0, null);
		} catch (Exception var34) {
			this.aBoolean6581 = true;
		}
	}

	public void method204() {
		Class146.method1732((byte) 22);
	}

	public void method206() {
	}

	public boolean method211(long arg0) {
		return true;
	}

	public void method207() {
	}

	public int method197() {
		return 100;
	}

	public int method210() {
		return 100;
	}

	public boolean method205(long arg0) {
		return true;
	}

	public boolean method213(long arg0) {
		return true;
	}

	public int method214() {
		return 0;
	}

	public static final void method2452(Class430 arg0, int arg1) throws Exception_Sub4 {
		try {
			arg0.anInt4376 -= 4;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			Class260 var5 = Class260.method2577((float) var2, (float) var3, (float) var4);
			Class401_Sub1.aClass145_Sub1_8249.method1678(var5, (byte) -81);
			var5.method2550();
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "kh.aiz(" + ')');
		}
	}

	public static final void method2453(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			String var4 = (String) arg2.anObjectArray4386[--arg2.anInt4378];
			if (Class278.method2740(var4, arg2, (byte) 0) != null) {
				var4 = var4.substring(0, var4.length() - 1);
			}
			arg0.anObjectArray1182 = Class288.method2886(var4, arg2, 1724575446);
			arg0.aBoolean1293 = true;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "kh.mx(" + ')');
		}
	}
}
