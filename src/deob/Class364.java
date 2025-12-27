package deob;

import java.util.Iterator;

public class Class364 {

	public int anInt3808 = -1;

	public int[] anIntArray3809 = null;

	public int[] anIntArray3833 = null;

	public int anInt3811 = 0;

	public int anInt3812 = -1;

	public int anInt3829 = -1;

	public int anInt3814 = -1;

	public int anInt3815 = -1;

	public int anInt3836 = -1;

	public int anInt3817 = -1;

	public int anInt3818 = -1;

	public int anInt3819 = -1;

	public int anInt3851 = -1;

	public int anInt3821 = -1;

	public int anInt3822 = -1;

	public int anInt3823 = -1;

	public int anInt3824 = -1;

	public int anInt3825 = -1;

	public int anInt3826 = -1;

	public int anInt3827 = -1;

	public int anInt3828 = -1;

	public int anInt3840 = -1;

	public int anInt3830 = -1;

	public int anInt3831 = -1;

	public int anInt3832 = 0;

	public int anInt3844 = 0;

	public int anInt3834 = 0;

	public int anInt3837 = 0;

	public int anInt3841 = 0;

	public int anInt3842 = 0;

	public int anInt3843 = 0;

	public int anInt3838 = 0;

	public int anInt3816 = 0;

	public int anInt3839 = 0;

	public int anInt3847 = 0;

	public int anInt3848 = 0;

	public int anInt3849 = -1;

	public int anInt3850 = -1;

	public boolean aBoolean3820 = true;

	public Class362 aClass362_3810;

	public int[] anIntArray3813;

	public int[] anIntArray3835;

	public Class247[] aClass247Array3846;

	public int[][] anIntArrayArray3807;

	public int[][] anIntArrayArray3845;

	public void method4263(Buffer arg0, int arg1, short arg2) {
		try {
			if (arg1 == 1) {
				this.anInt3808 = arg0.readBigSmart(-576116940);
				this.anInt3814 = arg0.readBigSmart(-1585061554);
			} else if (arg1 == 2) {
				this.anInt3822 = arg0.readBigSmart(-1411553350);
			} else if (arg1 == 3) {
				this.anInt3823 = arg0.readBigSmart(-1480499342);
			} else if (arg1 == 4) {
				this.anInt3824 = arg0.readBigSmart(-540782746);
			} else if (arg1 == 5) {
				this.anInt3825 = arg0.readBigSmart(-1496081365);
			} else if (arg1 == 6) {
				this.anInt3818 = arg0.readBigSmart(-1050933577);
			} else if (arg1 == 7) {
				this.anInt3819 = arg0.readBigSmart(-1385428941);
			} else if (arg1 == 8) {
				this.anInt3851 = arg0.readBigSmart(-1004150763);
			} else if (arg1 == 9) {
				this.anInt3821 = arg0.readBigSmart(-2038630014);
			} else if (arg1 == 26) {
				this.anInt3832 = (short) (arg0.readUnsignedByte(1776683059) * 4);
				this.anInt3844 = (short) (arg0.readUnsignedByte(-16697713) * 4);
			} else {
				int var4;
				int var5;
				if (arg1 == 27) {
					if (this.anIntArrayArray3807 == null) {
						this.anIntArrayArray3807 = new int[this.aClass362_3810.aClass421_3797.disabledEquipmentSlots.length][];
					}
					var4 = arg0.readUnsignedByte(1043550624);
					this.anIntArrayArray3807[var4] = new int[6];
					for (var5 = 0; var5 < 6; var5++) {
						this.anIntArrayArray3807[var4][var5] = arg0.readShort(-1100583751);
					}
				} else if (arg1 == 28) {
					var4 = arg0.readUnsignedByte(1871450145);
					this.anIntArray3813 = new int[var4];
					for (var5 = 0; var5 < var4; var5++) {
						this.anIntArray3813[var5] = arg0.readUnsignedByte(1477043522);
						if (this.anIntArray3813[var5] == 255) {
							this.anIntArray3813[var5] = -1;
						}
					}
				} else if (arg1 == 29) {
					this.anInt3841 = arg0.readUnsignedByte(898391674);
				} else if (arg1 == 30) {
					this.anInt3842 = arg0.readUnsignedShort(293525829);
				} else if (arg1 == 31) {
					this.anInt3843 = arg0.readUnsignedByte(-49694834);
				} else if (arg1 == 32) {
					this.anInt3838 = arg0.readUnsignedShort(1356091463);
				} else if (arg1 == 33) {
					this.anInt3816 = arg0.readShort(-1100583751);
				} else if (arg1 == 34) {
					this.anInt3839 = arg0.readUnsignedByte(1337624526);
				} else if (arg1 == 35) {
					this.anInt3847 = arg0.readUnsignedShort(1933644625);
				} else if (arg1 == 36) {
					this.anInt3848 = arg0.readShort(-1100583751);
				} else if (arg1 == 37) {
					this.anInt3849 = arg0.readUnsignedByte(890749434);
				} else if (arg1 == 38) {
					this.anInt3812 = arg0.readBigSmart(-1678557745);
				} else if (arg1 == 39) {
					this.anInt3829 = arg0.readBigSmart(-1400370243);
				} else if (arg1 == 40) {
					this.anInt3815 = arg0.readBigSmart(-730405997);
				} else if (arg1 == 41) {
					this.anInt3836 = arg0.readBigSmart(-548138118);
				} else if (arg1 == 42) {
					this.anInt3817 = arg0.readBigSmart(-1294998486);
				} else if (arg1 == 43) {
					arg0.readUnsignedShort(2137503065);
				} else if (arg1 == 44) {
					arg0.readUnsignedShort(-352491944);
				} else if (arg1 == 45) {
					this.anInt3850 = arg0.readUnsignedShort(420530526);
				} else if (arg1 == 46) {
					this.anInt3826 = arg0.readBigSmart(-1145522059);
				} else if (arg1 == 47) {
					this.anInt3827 = arg0.readBigSmart(-1365262005);
				} else if (arg1 == 48) {
					this.anInt3828 = arg0.readBigSmart(-1533647488);
				} else if (arg1 == 49) {
					this.anInt3840 = arg0.readBigSmart(-1591346907);
				} else if (arg1 == 50) {
					this.anInt3830 = arg0.readBigSmart(-910694591);
				} else if (arg1 == 51) {
					this.anInt3831 = arg0.readBigSmart(-830976505);
				} else if (arg1 == 52) {
					var4 = arg0.readUnsignedByte(2038938932);
					this.anIntArray3809 = new int[var4];
					this.anIntArray3833 = new int[var4];
					for (var5 = 0; var5 < var4; var5++) {
						this.anIntArray3809[var5] = arg0.readBigSmart(-760383607);
						int var6 = arg0.readUnsignedByte(242614240);
						this.anIntArray3833[var5] = var6;
						this.anInt3811 += var6;
					}
				} else if (arg1 == 53) {
					this.aBoolean3820 = false;
				} else if (arg1 == 54) {
					this.anInt3834 = arg0.readUnsignedByte(2097990924) << 6;
					this.anInt3837 = arg0.readUnsignedByte(1165314998) << 6;
				} else if (arg1 == 55) {
					if (this.anIntArray3835 == null) {
						this.anIntArray3835 = new int[this.aClass362_3810.aClass421_3797.disabledEquipmentSlots.length];
					}
					var4 = arg0.readUnsignedByte(1617720532);
					this.anIntArray3835[var4] = arg0.readUnsignedShort(-171514234);
				} else if (arg1 == 56) {
					if (this.anIntArrayArray3845 == null) {
						this.anIntArrayArray3845 = new int[this.aClass362_3810.aClass421_3797.disabledEquipmentSlots.length][];
					}
					var4 = arg0.readUnsignedByte(796499186);
					this.anIntArrayArray3845[var4] = new int[3];
					for (var5 = 0; var5 < 3; var5++) {
						this.anIntArrayArray3845[var4][var5] = arg0.readShort(-1100583751);
					}
				}
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "pe.j(" + ')');
		}
	}

	public boolean method4264(int arg0, int arg1) {
		try {
			if (arg0 == -1) {
				return false;
			} else if (arg0 == this.anInt3808) {
				return true;
			} else {
				if (this.anIntArray3809 != null) {
					for (int var3 = 0; var3 < this.anIntArray3809.length; var3++) {
						if (this.anIntArray3809[var3] == arg0) {
							return true;
						}
					}
				}
				return false;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "pe.p(" + ')');
		}
	}

	public Class247[] method4265(int arg0) {
		try {
			if (this.aClass247Array3846 != null) {
				return this.aClass247Array3846;
			} else if (this.anIntArrayArray3807 == null) {
				return null;
			} else {
				this.aClass247Array3846 = new Class247[this.anIntArrayArray3807.length];
				for (int var2 = 0; var2 < this.anIntArrayArray3807.length; var2++) {
					int var3 = 0;
					int var4 = 0;
					int var5 = 0;
					int var6 = 0;
					int var7 = 0;
					int var8 = 0;
					if (this.anIntArrayArray3807[var2] != null) {
						var3 = this.anIntArrayArray3807[var2][0];
						var4 = this.anIntArrayArray3807[var2][1];
						var5 = this.anIntArrayArray3807[var2][2];
						var6 = this.anIntArrayArray3807[var2][3] << 3;
						var7 = this.anIntArrayArray3807[var2][4] << 3;
						var8 = this.anIntArrayArray3807[var2][5] << 3;
					}
					if (var3 != 0 || var4 != 0 || var5 != 0 || var6 != 0 || var7 != 0 || var8 != 0) {
						Class247 var9 = this.aClass247Array3846[var2] = new Class247();
						if (var8 != 0) {
							var9.method2462(0.0F, 0.0F, 1.0F, Class257.method2541(var8));
						}
						if (var6 != 0) {
							var9.method2462(1.0F, 0.0F, 0.0F, Class257.method2541(var6));
						}
						if (var7 != 0) {
							var9.method2462(0.0F, 1.0F, 0.0F, Class257.method2541(var7));
						}
						var9.method2474((float) var3, (float) var4, (float) var5);
					} else if (arg0 == 1644604508) {
					}
				}
				return this.aClass247Array3846;
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "pe.o(" + ')');
		}
	}

	public int[] method4266(byte arg0) {
		try {
			Class497 var2 = new Class497(16);
			Class511.method6181(this.anInt3808, var2, (byte) -78);
			int[] var3;
			int var4;
			if (this.anIntArray3809 != null) {
				var3 = this.anIntArray3809;
				for (var4 = 0; var4 < var3.length; var4++) {
					int var5 = var3[var4];
					Class511.method6181(var5, var2, (byte) -77);
				}
			}
			Class511.method6181(this.anInt3812, var2, (byte) -42);
			Class511.method6181(this.anInt3829, var2, (byte) -27);
			Class511.method6181(this.anInt3814, var2, (byte) -65);
			Class511.method6181(this.anInt3815, var2, (byte) -33);
			Class511.method6181(this.anInt3836, var2, (byte) -92);
			Class511.method6181(this.anInt3817, var2, (byte) -63);
			Class511.method6181(this.anInt3818, var2, (byte) -127);
			Class511.method6181(this.anInt3819, var2, (byte) -6);
			Class511.method6181(this.anInt3851, var2, (byte) -45);
			Class511.method6181(this.anInt3821, var2, (byte) -81);
			Class511.method6181(this.anInt3822, var2, (byte) -58);
			Class511.method6181(this.anInt3823, var2, (byte) -55);
			Class511.method6181(this.anInt3824, var2, (byte) -14);
			Class511.method6181(this.anInt3825, var2, (byte) -35);
			Class511.method6181(this.anInt3826, var2, (byte) -74);
			Class511.method6181(this.anInt3827, var2, (byte) -92);
			Class511.method6181(this.anInt3828, var2, (byte) -34);
			Class511.method6181(this.anInt3840, var2, (byte) -80);
			Class511.method6181(this.anInt3830, var2, (byte) -79);
			Class511.method6181(this.anInt3831, var2, (byte) -116);
			var3 = new int[var2.method6096(-780566500)];
			var4 = 0;
			Iterator var8 = var2.iterator();
			while (var8.hasNext()) {
				Class330 var6 = (Class330) var8.next();
				var3[var4++] = (int) var6.aLong3341;
			}
			return var3;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "pe.s(" + ')');
		}
	}

	public void method4267(Buffer arg0, byte arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(262430065);
				if (var3 == 0) {
					if (arg1 != -1) {
					}
					return;
				}
				this.method4263(arg0, var3, (short) 255);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "pe.r(" + ')');
		}
	}

	public int method4268(int arg0) {
		try {
			if (this.anInt3808 != -1) {
				return this.anInt3808;
			} else if (this.anIntArray3809 == null) {
				return -1;
			} else {
				int var2 = (int) (Math.random() * (double) this.anInt3811);
				int var3;
				for (var3 = 0; var2 >= this.anIntArray3833[var3]; var3++) {
					var2 -= this.anIntArray3833[var3];
				}
				return this.anIntArray3809[var3];
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "pe.i(" + ')');
		}
	}
}
