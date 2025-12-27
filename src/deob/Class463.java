package deob;

public class Class463 {

	public Class367 aClass367_5573 = new Class367(256);

	public Class367 aClass367_5578 = new Class367(500);

	public Class367 aClass367_5579 = new Class367(30);

	public Class367 aClass367_5574 = new Class367(50);

	public Model[] aClass98Array5583 = new Model[4];

	public Class485 aClass485_5582 = new Class485(null, null);

	public Class435 aClass435_5577;

	public Class454 aClass454_5571;

	public boolean aBoolean5584;

	public IndexTable aClass280_5572;

	public IndexTable aClass280_5575;

	public String[] aStringArray5580;

	public static int anInt5576 = 256;

	public int anInt5581;

	public static int anInt5585;

	public Class463(Class435 arg0, Class454 arg1, boolean arg2, IndexTable arg3, IndexTable arg4) {
		this.aClass435_5577 = arg0;
		this.aClass454_5571 = arg1;
		this.aBoolean5584 = arg2;
		this.aClass280_5572 = arg3;
		this.aClass280_5575 = arg4;
		if (this.aClass280_5572 != null) {
			int var6 = this.aClass280_5572.method2764(1867016684) - 1;
			Class103.aClass103_930.method1226((byte) 0);
			this.aClass280_5572.method2763(var6, -2004295678);
		}
		if (Class435.aClass435_4421 == this.aClass435_5577) {
			this.aStringArray5580 = new String[] { null, null, null, null, null, Class526.aClass526_6068.method6257(this.aClass454_5571, 991479434) };
		} else {
			this.aStringArray5580 = new String[] { null, null, null, null, null, null };
		}
	}

	public Class473 method5705(int arg0, byte arg1) {
		try {
			Class367 var4 = this.aClass367_5573;
			Class473 var3;
			synchronized (this.aClass367_5573) {
				var3 = (Class473) this.aClass367_5573.get((long) arg0);
			}
			if (var3 != null) {
				return var3;
			}
			IndexTable var5 = this.aClass280_5572;
			byte[] var12;
			synchronized (this.aClass280_5572) {
				var12 = this.aClass280_5572.getFile(Class103.aClass103_930.method1228(arg0, 1720566382), Class103.aClass103_930.method1227(arg0, (byte) 35));
			}
			var3 = new Class473();
			var3.anInt5657 = arg0;
			var3.aClass463_5671 = this;
			var3.aStringArray5649 = (String[]) this.aStringArray5580.clone();
			if (var12 != null) {
				var3.method5893(new Buffer(var12), -1245006566);
			}
			var3.method5910(743130918);
			if (var3.aBoolean5668) {
				var3.anInt5635 = 0;
				var3.aBoolean5636 = false;
			}
			if (!this.aBoolean5584 && var3.aBoolean5621) {
				var3.aStringArray5649 = null;
				var3.anIntArray5693 = null;
			}
			Class367 var13 = this.aClass367_5573;
			synchronized (this.aClass367_5573) {
				this.aClass367_5573.put(var3, (long) arg0);
			}
			return var3;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "tf.r(" + ')');
		}
	}

	public void method5706(boolean arg0, byte arg1) {
		try {
			if (this.aBoolean5584 != arg0) {
				this.aBoolean5584 = arg0;
				this.method5711(-2123151503);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "tf.j(" + ')');
		}
	}

	public void method5707(int arg0, int arg1) {
		try {
			this.aClass367_5573 = new Class367(arg0);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "tf.p(" + ')');
		}
	}

	public void method5708(int arg0, byte arg1) {
		try {
			Class367 var3 = this.aClass367_5573;
			synchronized (this.aClass367_5573) {
				this.aClass367_5573.method4292(arg0, (byte) 116);
			}
			var3 = this.aClass367_5578;
			synchronized (this.aClass367_5578) {
				this.aClass367_5578.method4292(arg0, (byte) 23);
			}
			var3 = this.aClass367_5579;
			synchronized (this.aClass367_5579) {
				this.aClass367_5579.method4292(arg0, (byte) 28);
			}
			var3 = this.aClass367_5574;
			synchronized (this.aClass367_5574) {
				this.aClass367_5574.method4292(arg0, (byte) 20);
			}
		} catch (RuntimeException var12) {
			throw Class476.method5964(var12, "tf.s(" + ')');
		}
	}

	public void method5709(int arg0) {
		try {
			Class367 var2 = this.aClass367_5573;
			synchronized (this.aClass367_5573) {
				this.aClass367_5573.method4296(301258714);
			}
			var2 = this.aClass367_5578;
			synchronized (this.aClass367_5578) {
				this.aClass367_5578.method4296(1248504925);
			}
			var2 = this.aClass367_5579;
			synchronized (this.aClass367_5579) {
				this.aClass367_5579.method4296(-1348146252);
			}
			var2 = this.aClass367_5574;
			synchronized (this.aClass367_5574) {
				this.aClass367_5574.method4296(-1753319835);
			}
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "tf.f(" + ')');
		}
	}

	public void method5710(int arg0, byte arg1) {
		try {
			this.anInt5581 = arg0;
			Class367 var3 = this.aClass367_5578;
			synchronized (this.aClass367_5578) {
				this.aClass367_5578.method4298((byte) 19);
			}
			var3 = this.aClass367_5579;
			synchronized (this.aClass367_5579) {
				this.aClass367_5579.method4298((byte) 22);
			}
			var3 = this.aClass367_5574;
			synchronized (this.aClass367_5574) {
				this.aClass367_5574.method4298((byte) 86);
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "tf.i(" + ')');
		}
	}

	public void method5711(int arg0) {
		try {
			Class367 var2 = this.aClass367_5573;
			synchronized (this.aClass367_5573) {
				this.aClass367_5573.method4298((byte) 114);
			}
			var2 = this.aClass367_5578;
			synchronized (this.aClass367_5578) {
				this.aClass367_5578.method4298((byte) 35);
			}
			var2 = this.aClass367_5579;
			synchronized (this.aClass367_5579) {
				this.aClass367_5579.method4298((byte) 1);
			}
			var2 = this.aClass367_5574;
			synchronized (this.aClass367_5574) {
				this.aClass367_5574.method4298((byte) 59);
			}
			this.aClass98Array5583 = new Model[4];
			this.aClass485_5582 = new Class485(null, null);
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "tf.o(" + ')');
		}
	}

	public static final void method5712(Class430 arg0, byte arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2 | 0x1 << var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "tf.zk(" + ')');
		}
	}

	public static final void method5713(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class541.method6333(var3, var4, arg0, -1582602249);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "tf.ls(" + ')');
		}
	}
}
