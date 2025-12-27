package deob;

public class Class394 {

	public float aFloat4070;

	public float aFloat4071;

	public float aFloat4072;

	public float aFloat4073;

	public float aFloat4078;

	public float aFloat4079;

	public int anInt4075;

	public int anInt4076;

	public int anInt4080;

	public Class260 aClass260_4074;

	public Class308 aClass308_4081;

	public Class92 aClass92_4077;

	public static client aClient4082;

	public void method4620(Class394 arg0, byte arg1) {
		try {
			this.anInt4080 = arg0.anInt4080;
			this.aFloat4071 = arg0.aFloat4071;
			this.aFloat4072 = arg0.aFloat4072;
			this.aFloat4070 = arg0.aFloat4070;
			this.aClass260_4074.method2582(arg0.aClass260_4074);
			this.anInt4075 = arg0.anInt4075;
			this.anInt4076 = arg0.anInt4076;
			this.aClass92_4077 = arg0.aClass92_4077;
			this.aFloat4073 = arg0.aFloat4073;
			this.aFloat4079 = arg0.aFloat4079;
			this.aFloat4078 = arg0.aFloat4078;
			this.aClass308_4081 = arg0.aClass308_4081;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qh.j(" + ')');
		}
	}

	public Class394(Buffer arg0, Class389 arg1) {
		this.method4621(arg0, arg1, -1336222368);
	}

	public void method4621(Buffer arg0, Class389 arg1, int arg2) {
		try {
			int var4 = arg0.readUnsignedByte(611304848);
			if (Class448.aClass330_Sub50_5555.aClass464_Sub2_7868.method5736((byte) 0) == 1 && Class361.aClass_ra3793.cr() > 0) {
				if ((var4 & 0x1) == 0) {
					this.anInt4080 = Class389.anInt4030;
				} else {
					this.anInt4080 = arg0.readInt((byte) 116);
				}
				if ((var4 & 0x2) == 0) {
					this.aFloat4071 = 1.1523438F;
				} else {
					this.aFloat4071 = (float) arg0.readUnsignedShort(710869081) / 256.0F;
				}
				if ((var4 & 0x4) == 0) {
					this.aFloat4072 = 0.69921875F;
				} else {
					this.aFloat4072 = (float) arg0.readUnsignedShort(28671638) / 256.0F;
				}
				if ((var4 & 0x8) == 0) {
					this.aFloat4070 = 1.2F;
				} else {
					this.aFloat4070 = (float) arg0.readUnsignedShort(548533644) / 256.0F;
				}
			} else {
				if ((var4 & 0x1) != 0) {
					arg0.readInt((byte) 47);
				}
				if ((var4 & 0x2) != 0) {
					arg0.readUnsignedShort(1196205047);
				}
				if ((var4 & 0x4) != 0) {
					arg0.readUnsignedShort(414225799);
				}
				if ((var4 & 0x8) != 0) {
					arg0.readUnsignedShort(1242208948);
				}
				this.anInt4080 = Class389.anInt4030;
				this.aFloat4070 = 1.2F;
				this.aFloat4072 = 0.69921875F;
				this.aFloat4071 = 1.1523438F;
			}
			if ((var4 & 0x10) == 0) {
				this.aClass260_4074 = Class260.method2577(-50.0F, -60.0F, -50.0F);
			} else {
				this.aClass260_4074 = Class260.method2577((float) arg0.readShort(-1100583751), (float) arg0.readShort(-1100583751), (float) arg0.readShort(-1100583751));
			}
			if ((var4 & 0x20) == 0) {
				this.anInt4075 = Class389.anInt4032;
			} else {
				this.anInt4075 = arg0.readInt((byte) 74);
			}
			if ((var4 & 0x40) == 0) {
				this.anInt4076 = 0;
			} else {
				this.anInt4076 = arg0.readUnsignedShort(721256539);
			}
			if ((var4 & 0x80) == 0) {
				this.aClass92_4077 = Class389.aClass92_4018;
			} else {
				int var5 = arg0.readUnsignedShort(1967249978);
				int var6 = arg0.readUnsignedShort(926325521);
				int var7 = arg0.readUnsignedShort(238475685);
				int var8 = arg0.readUnsignedShort(349608184);
				int var9 = arg0.readUnsignedShort(1244404082);
				int var10 = arg0.readUnsignedShort(1907820569);
				this.aClass92_4077 = arg1.method4579(var5, var6, var7, var8, var9, var10, (byte) -25);
			}
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "qh.p(" + ')');
		}
	}

	public void method4622(Buffer arg0, int arg1) {
		try {
			this.aFloat4073 = (float) (arg0.readUnsignedByte(379453161) * 8) / 255.0F;
			this.aFloat4079 = (float) (arg0.readUnsignedByte(1194215653) * 8) / 255.0F;
			this.aFloat4078 = (float) (arg0.readUnsignedByte(859528611) * 8) / 255.0F;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qh.o(" + ')');
		}
	}

	public void method4623(Buffer arg0, Class389 arg1, byte arg2) {
		try {
			int var4 = arg0.readUnsignedShort(2143273692);
			int var5 = arg0.readShort(-1100583751);
			int var6 = arg0.readShort(-1100583751);
			int var7 = arg0.readShort(-1100583751);
			int var8 = arg0.readUnsignedShort(1319051336);
			Class406.anInt4195 = var8;
			this.aClass308_4081 = arg1.method4587(var4, var5, var6, var7, 1286236960);
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "qh.s(" + ')');
		}
	}

	public boolean method4624(Class394 arg0, byte arg1) {
		try {
			return this.anInt4080 == arg0.anInt4080 && this.aFloat4071 == arg0.aFloat4071 && arg0.aFloat4072 == this.aFloat4072 && arg0.aFloat4070 == this.aFloat4070 && this.aFloat4079 == arg0.aFloat4079 && arg0.aFloat4073 == this.aFloat4073 && arg0.aFloat4078 == this.aFloat4078 && arg0.anInt4075 == this.anInt4075 && arg0.anInt4076 == this.anInt4076 && this.aClass92_4077 == arg0.aClass92_4077 && this.aClass308_4081 == arg0.aClass308_4081;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qh.f(" + ')');
		}
	}

	public Class308 method4625(byte arg0) {
		try {
			return this.aClass308_4081;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qh.w(" + ')');
		}
	}

	public void method4626(Class_ra arg0, Class394 arg1, Class394 arg2, float arg3, int arg4) {
		try {
			this.anInt4080 = Class442.method5612(arg1.anInt4080, arg2.anInt4080, arg3 * 255.0F, -1027106511);
			this.aFloat4072 = arg1.aFloat4072 + (arg2.aFloat4072 - arg1.aFloat4072) * arg3;
			this.aFloat4070 = arg3 * (arg2.aFloat4070 - arg1.aFloat4070) + arg1.aFloat4070;
			this.aFloat4071 = arg3 * (arg2.aFloat4071 - arg1.aFloat4071) + arg1.aFloat4071;
			this.aFloat4078 = arg1.aFloat4078 + (arg2.aFloat4078 - arg1.aFloat4078) * arg3;
			this.aFloat4073 = arg1.aFloat4073 + arg3 * (arg2.aFloat4073 - arg1.aFloat4073);
			this.aFloat4079 = (arg2.aFloat4079 - arg1.aFloat4079) * arg3 + arg1.aFloat4079;
			this.anInt4075 = Class442.method5612(arg1.anInt4075, arg2.anInt4075, arg3 * 255.0F, -1027106511);
			this.anInt4076 = (int) ((float) (arg2.anInt4076 - arg1.anInt4076) * arg3 + (float) arg1.anInt4076);
			if (arg2.aClass92_4077 != arg1.aClass92_4077) {
				this.aClass92_4077 = arg0.cp(arg1.aClass92_4077, arg2.aClass92_4077, arg3, this.aClass92_4077);
			}
			if (arg2.aClass308_4081 != arg1.aClass308_4081) {
				if (arg1.aClass308_4081 == null) {
					this.aClass308_4081 = arg2.aClass308_4081;
					if (this.aClass308_4081 != null) {
						this.aClass308_4081.method3083((int) (arg3 * 255.0F), 0, (short) -29335);
					}
				} else {
					this.aClass308_4081 = arg1.aClass308_4081;
					if (this.aClass308_4081 != null) {
						this.aClass308_4081.method3083((int) (arg3 * 255.0F), 255, (short) -14081);
					}
				}
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "qh.i(" + ')');
		}
	}

	public void method4627(int arg0) {
		try {
			this.anInt4080 = Class389.anInt4030;
			this.aClass260_4074 = Class260.method2577(-50.0F, -60.0F, -50.0F);
			this.aFloat4071 = 1.1523438F;
			this.aFloat4072 = 0.69921875F;
			this.aFloat4070 = 1.2F;
			this.anInt4075 = Class389.anInt4032;
			this.anInt4076 = 0;
			this.aClass92_4077 = Class389.aClass92_4018;
			this.aFloat4073 = 1.0F;
			this.aFloat4079 = 0.25F;
			this.aFloat4078 = 1.0F;
			this.aClass308_4081 = Class389.aClass308_4019;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qh.r(" + ')');
		}
	}

	public Class394() {
		this.method4627(-690027286);
	}

	public int method4628(byte arg0) {
		try {
			return this.anInt4075;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qh.z(" + ')');
		}
	}

	public static final void method4629(Class430 arg0, int arg1) {
		try {
			Class1 var2 = Class426.method5317(2090874676);
			Class330_Sub34 var3 = Class238.method2377(OutgoingPacket.QUICK_CHAT_PACKET, var2.aClass488_22, 2012265974);
			var3.aClass330_Sub46_Sub2_7729.addByte(0, (byte) 10);
			int var4 = var3.aClass330_Sub46_Sub2_7729.offset;
			var3.aClass330_Sub46_Sub2_7729.addByte(1, (byte) 51);
			var3.aClass330_Sub46_Sub2_7729.addShort(arg0.aClass209_4385.anInt1981, (byte) 81);
			arg0.aClass209_4385.aClass330_Sub36_Sub4_1982.method3450(var3.aClass330_Sub46_Sub2_7729, arg0.aClass209_4385.anIntArray1983, (byte) 11);
			var3.aClass330_Sub46_Sub2_7729.method3751(var3.aClass330_Sub46_Sub2_7729.offset - var4, 1286488270);
			var2.method378(var3, -1254933758);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qh.adj(" + ')');
		}
	}

	public static final void method4630(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub3_7880.method5716(var2, -921769091);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qh.aqp(" + ')');
		}
	}

	public static long method4631(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
		try {
			Class528.aCalendar6217.clear();
			Class528.aCalendar6217.set(arg5, arg4, arg3, arg2, arg1, arg0);
			return Class528.aCalendar6217.getTime().getTime();
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "qh.w(" + ')');
		}
	}

	public static Class558 method4632(int arg0, byte arg1) {
		try {
			Class558[] var2 = Class252.method2526((byte) 15);
			Class558[] var3 = var2;
			for (int var4 = 0; var4 < var3.length; var4++) {
				Class558 var5 = var3[var4];
				if (var5.anInt6416 == arg0) {
					return var5;
				}
			}
			return null;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "qh.j(" + ')');
		}
	}
}
