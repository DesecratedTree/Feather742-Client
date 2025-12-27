package deob;

public class Class510 implements Interface23 {

	public Class367 itemDefinitions = new Class367(64);

	public Class367 aClass367_6773 = new Class367(50);

	public Class399 aClass399_6780 = new Class399(250);

	public Class521 aClass521_6781 = new Class521();

	public Class435 aClass435_6772;

	public Class454 aClass454_6785;

	public boolean aBoolean6774;

	public Class543 aClass543_6782;

	public IndexTable aClass280_6775;

	public IndexTable modelIndex;

	public int anInt6777;

	public String[] otherGroundOptions;

	public String[] otherInventoryOptions;

	public int anInt6783;

	public Class510(Class435 arg0, Class454 arg1, boolean arg2, Class543 arg3, IndexTable arg4, IndexTable arg5) {
		this.aClass435_6772 = arg0;
		this.aClass454_6785 = arg1;
		this.aBoolean6774 = arg2;
		this.aClass543_6782 = arg3;
		this.aClass280_6775 = arg4;
		this.modelIndex = arg5;
		if (this.aClass280_6775 == null) {
			this.anInt6777 = 0;
		} else {
			int var7 = this.aClass280_6775.method2764(1749280935) - 1;
			this.anInt6777 = var7 * Class103.aClass103_934.method1226((byte) 0) + this.aClass280_6775.method2763(var7, -2011555083);
		}
		if (Class435.aClass435_4421 == this.aClass435_6772) {
			this.otherGroundOptions = new String[] { null, null, Class526.aClass526_6047.method6257(this.aClass454_6785, 991479434), null, null, Class526.aClass526_6068.method6257(this.aClass454_6785, 991479434) };
		} else {
			this.otherGroundOptions = new String[] { null, null, Class526.aClass526_6047.method6257(this.aClass454_6785, 991479434), null, null, null };
		}
		this.otherInventoryOptions = new String[] { null, null, null, null, Class526.aClass526_6048.method6257(this.aClass454_6785, 991479434) };
	}

	public void method6166(int arg0) {
		try {
			Class367 var2 = this.aClass367_6773;
			synchronized (this.aClass367_6773) {
				this.aClass367_6773.method4298((byte) 51);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "vc.z(" + ')');
		}
	}

	public Class61 method6167(Class_ra arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Class408 arg6, int arg7) {
		try {
			this.aClass521_6781.anInt6754 = arg0.anInt4226;
			this.aClass521_6781.anInt6759 = arg1;
			this.aClass521_6781.anInt6755 = arg2;
			this.aClass521_6781.anInt6757 = arg3;
			this.aClass521_6781.anInt6753 = arg4;
			this.aClass521_6781.anInt6758 = arg5;
			this.aClass521_6781.aBoolean6756 = arg6 != null;
			return (Class61) this.aClass399_6780.method4688(this.aClass521_6781);
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "vc.j(" + ')');
		}
	}

	public Class61 method6168(Class_ra arg0, Class_ra arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7, int arg8, Class263 arg9, Class408 arg10, short arg11) {
		try {
			if (!arg7) {
				Class61 var13 = this.method6167(arg1, arg2, arg3, arg4, arg5, arg8, arg10, 1880167665);
				if (var13 != null) {
					return var13;
				}
			}
			ItemDefinitions var18 = this.getItemDefinitions(arg2, (byte) -57);
			if (arg3 > 1 && var18.stackIds != null) {
				int var14 = -1;
				for (int var15 = 0; var15 < 10; var15++) {
					if (arg3 >= var18.stackAmounts[var15] && var18.stackAmounts[var15] != 0) {
						var14 = var18.stackIds[var15];
					}
				}
				if (var14 != -1) {
					var18 = this.getItemDefinitions(var14, (byte) -25);
				}
			}
			int[] var19 = var18.method6279(arg0, arg1, arg3, arg4, arg5, arg6, arg8, arg9, arg10, (byte) -34);
			if (var19 == null) {
				return null;
			}
			Class61 var20;
			if (arg7) {
				var20 = arg0.method4795(var19, 0, 36, 36, 32, (byte) -80);
			} else {
				var20 = arg1.method4795(var19, 0, 36, 36, 32, (byte) -89);
			}
			if (!arg7) {
				Class521 var16 = new Class521();
				var16.anInt6754 = arg1.anInt4226;
				var16.anInt6759 = arg2;
				var16.anInt6755 = arg3;
				var16.anInt6757 = arg4;
				var16.anInt6753 = arg5;
				var16.anInt6758 = arg8;
				var16.aBoolean6756 = arg10 != null;
				this.aClass399_6780.method4696(var20, var16);
			}
			return var20;
		} catch (RuntimeException var17) {
			throw Class476.method5964(var17, "vc.i(" + ')');
		}
	}

	public void method6169(boolean arg0, byte arg1) {
		try {
			if (this.aBoolean6774 != arg0) {
				this.aBoolean6774 = arg0;
				this.method6170(-1390004513);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "vc.p(" + ')');
		}
	}

	public void method6170(int arg0) {
		try {
			Class367 var2 = this.itemDefinitions;
			synchronized (this.itemDefinitions) {
				this.itemDefinitions.method4298((byte) 56);
			}
			var2 = this.aClass367_6773;
			synchronized (this.aClass367_6773) {
				this.aClass367_6773.method4298((byte) 15);
			}
			Class399 var10 = this.aClass399_6780;
			synchronized (this.aClass399_6780) {
				this.aClass399_6780.method4692();
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "vc.s(" + ')');
		}
	}

	public void method6171(int arg0) {
		try {
			Class399 var2 = this.aClass399_6780;
			synchronized (this.aClass399_6780) {
				this.aClass399_6780.method4692();
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "vc.f(" + ')');
		}
	}

	public void method6172(int arg0, int arg1) {
		try {
			Class367 var3 = this.itemDefinitions;
			synchronized (this.itemDefinitions) {
				this.itemDefinitions.method4292(arg0, (byte) 115);
			}
			var3 = this.aClass367_6773;
			synchronized (this.aClass367_6773) {
				this.aClass367_6773.method4292(arg0, (byte) 33);
			}
			Class399 var11 = this.aClass399_6780;
			synchronized (this.aClass399_6780) {
				this.aClass399_6780.method4691(arg0);
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "vc.w(" + ')');
		}
	}

	public void method6173(byte arg0) {
		try {
			Class367 var2 = this.itemDefinitions;
			synchronized (this.itemDefinitions) {
				this.itemDefinitions.method4296(322278293);
			}
			var2 = this.aClass367_6773;
			synchronized (this.aClass367_6773) {
				this.aClass367_6773.method4296(-1465132910);
			}
			Class399 var10 = this.aClass399_6780;
			synchronized (this.aClass399_6780) {
				this.aClass399_6780.method4693();
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "vc.n(" + ')');
		}
	}

	public ItemDefinitions getItemDefinitions(int arg0, byte arg1) {
		try {
			Class367 var4 = this.itemDefinitions;
			ItemDefinitions var3;
			synchronized (this.itemDefinitions) {
				var3 = (ItemDefinitions) this.itemDefinitions.get((long) arg0);
			}
			if (var3 != null) {
				return var3;
			}
			IndexTable var5 = this.aClass280_6775;
			byte[] var13;
			synchronized (this.aClass280_6775) {
				var13 = this.aClass280_6775.getFile(Class103.aClass103_934.method1228(arg0, 60502773), Class103.aClass103_934.method1227(arg0, (byte) -84));
			}
			var3 = new ItemDefinitions();
			var3.aClass510_6712 = this;
			var3.anInt6688 = arg0;
			var3.groundOptions = (String[]) this.otherGroundOptions.clone();
			var3.inventoryOptions = (String[]) this.otherInventoryOptions.clone();
			if (var13 != null) {
				var3.method6293(new Buffer(var13), 1740721735);
			}
			var3.method6277((byte) -26);
			if (var3.notedItemId != -1) {
				var3.method6294(this.getItemDefinitions(var3.notedItemId, (byte) -68), this.getItemDefinitions(var3.switchNoteItemId, (byte) -40), (byte) 0);
			}
			if (var3.anInt6720 != -1) {
				var3.method6280(this.getItemDefinitions(var3.anInt6720, (byte) -52), this.getItemDefinitions(var3.anInt6735, (byte) -19), -1476387507);
			}
			if (var3.anInt6728 != -1) {
				var3.method6283(this.getItemDefinitions(var3.anInt6728, (byte) -45), this.getItemDefinitions(var3.anInt6748, (byte) -34), -1580853885);
			}
			if (!this.aBoolean6774 && var3.aBoolean6707) {
				var3.anInt6742 = 0;
				var3.groundOptions = this.otherGroundOptions;
				var3.inventoryOptions = this.otherInventoryOptions;
				var3.aBoolean6702 = false;
				var3.anIntArray6701 = null;
				if (var3.aClass497_6745 != null) {
					boolean var14 = false;
					for (Class330 var6 = var3.aClass497_6745.method6099((byte) -55); var6 != null; var6 = var3.aClass497_6745.method6098((short) -32768)) {
						Class537 var7 = this.aClass543_6782.method6339((int) var6.aLong3341, -237698921);
						if (var7.aBoolean6237) {
							var6.method3252(603654864);
						} else {
							var14 = true;
						}
					}
					if (!var14) {
						var3.aClass497_6745 = null;
					}
				}
			}
			Class367 var15 = this.itemDefinitions;
			synchronized (this.itemDefinitions) {
				this.itemDefinitions.put(var3, (long) arg0);
			}
			return var3;
		} catch (RuntimeException var12) {
			throw Class476.method5964(var12, "vc.r(" + ')');
		}
	}

	public void method6175(int arg0, int arg1) {
		try {
			this.anInt6783 = arg0;
			Class367 var3 = this.aClass367_6773;
			synchronized (this.aClass367_6773) {
				this.aClass367_6773.method4298((byte) 82);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "vc.o(" + ')');
		}
	}
}
