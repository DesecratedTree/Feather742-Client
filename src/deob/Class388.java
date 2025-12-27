package deob;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Class388 {

	public boolean aBoolean3992 = false;

	public boolean aBoolean3993 = false;

	public int anInt3995 = 0;

	public List aList3998 = new LinkedList();

	public int anInt3999 = 0;

	public List aList4000 = new LinkedList();

	public int anInt4002 = 0;

	public boolean aBoolean4001 = false;

	public boolean aBoolean4003 = false;

	public Class81 aClass81_3996 = new Class81();

	public Class325_Sub3_Sub1_Sub1[] aClass325_Sub3_Sub1_Sub1Array3994 = new Class325_Sub3_Sub1_Sub1[8192];

	public static boolean[] aBooleanArray4006 = new boolean[32];

	public static boolean[] aBooleanArray4005 = new boolean[8];

	public int anInt4004;

	public long aLong3997;

	public long aLong4007;

	public Class388(int arg0, boolean arg1) {
		this.method4562(arg0, arg1);
	}

	public boolean method4561(Class_ra arg0, long arg1) {
		if (this.aLong3997 == this.aLong4007) {
			this.method4569();
		} else {
			this.method4572();
		}
		if (arg1 - this.aLong3997 > 750L) {
			this.method4564();
			return false;
		}
		int var4 = (int) (arg1 - this.aLong4007);
		Iterator var5;
		Class406 var6;
		if (this.aBoolean4001) {
			var5 = this.aList3998.iterator();
			while (var5.hasNext()) {
				var6 = (Class406) var5.next();
				for (int var7 = 0; var7 < var6.aClass210_4176.anInt2048; var7++) {
					var6.method4749(arg0, arg1, 1, !this.aBoolean3993, -2004023818);
				}
			}
			this.aBoolean4001 = false;
		}
		var5 = this.aList3998.iterator();
		while (var5.hasNext()) {
			var6 = (Class406) var5.next();
			var6.method4749(arg0, arg1, var4, !this.aBoolean3993, 2046690814);
		}
		this.aLong4007 = arg1;
		return true;
	}

	public void method4562(int arg0, boolean arg1) {
		Class391.aList4056.add(this);
		this.aLong3997 = arg0;
		this.aLong4007 = arg0;
		this.aBoolean4001 = true;
		this.aBoolean4003 = arg1;
	}

	public void method4563() {
		this.aBoolean4001 = true;
	}

	public void method4564() {
		this.aBoolean3992 = true;
		Iterator var1 = this.aList4000.iterator();
		while (var1.hasNext()) {
			Class330_Sub21 var2 = (Class330_Sub21) var1.next();
			if (var2.aClass208_7685.anInt1968 == 1) {
				var2.method3252(-1370135506);
			}
		}
		for (int var3 = 0; var3 < this.aClass325_Sub3_Sub1_Sub1Array3994.length; var3++) {
			if (this.aClass325_Sub3_Sub1_Sub1Array3994[var3] != null) {
				this.aClass325_Sub3_Sub1_Sub1Array3994[var3].method3221();
				this.aClass325_Sub3_Sub1_Sub1Array3994[var3] = null;
			}
		}
		this.anInt3995 = 0;
		this.aList3998 = new LinkedList();
		this.anInt3999 = 0;
		this.aList4000 = new LinkedList();
		this.anInt4002 = 0;
	}

	public void method4565(long arg0) {
		this.aLong3997 = arg0;
	}

	public void method4566(Class_ra arg0, Class93[] arg1, boolean arg2) {
		for (int var4 = 0; var4 < 32; var4++) {
			aBooleanArray4006[var4] = false;
		}
		Iterator var7 = this.aList3998.iterator();
		while (true) {
			label59: while (var7.hasNext()) {
				Class406 var5 = (Class406) var7.next();
				if (arg1 != null) {
					for (int var6 = 0; var6 < arg1.length; var6++) {
						if (var5.aClass93_4178 == arg1[var6] || var5.aClass93_4178 == arg1[var6].aClass93_833) {
							aBooleanArray4006[var6] = true;
							var5.method4748(674084352);
							var5.aBoolean4187 = false;
							continue label59;
						}
					}
				}
				if (!arg2) {
					if (var5.anInt4180 == 0) {
						var7.remove();
						this.anInt3999--;
					} else {
						var5.aBoolean4187 = true;
					}
				}
			}
			if (arg1 != null) {
				for (int var8 = 0; var8 < arg1.length && var8 != 32 && this.anInt3999 != 32; var8++) {
					if (!aBooleanArray4006[var8]) {
						Class406 var9 = new Class406(arg0, arg1[var8], this, this.aLong3997);
						this.aList3998.add(var9);
						this.anInt3999++;
						aBooleanArray4006[var8] = true;
					}
				}
			}
			return;
		}
	}

	public void method4567(Class356 arg0, Class_ra arg1) {
		this.aClass81_3996.aClass461_675.method5696(217714469);
		Iterator var3 = this.aList3998.iterator();
		while (var3.hasNext()) {
			Class406 var4 = (Class406) var3.next();
			var4.method4750(arg0, arg1, this.aLong4007);
		}
	}

	public void method4568(Class_ra arg0, long arg1, Class93[] arg2, Class64[] arg3, boolean arg4) {
		if (!this.aBoolean3992) {
			this.method4566(arg0, arg2, arg4);
			this.method4575(arg3, arg4);
			this.aLong3997 = arg1;
		}
	}

	public void method4569() {
		this.aBoolean3993 = false;
	}

	public Class81 method4570() {
		return this.aClass81_3996;
	}

	public static Class388 method4571(int arg0, boolean arg1) {
		if (Class391.anInt4057 == Class391.anInt4060) {
			return new Class388(arg0, arg1);
		} else {
			Class388 var2 = Class50.aClass388Array482[Class391.anInt4060];
			Class391.anInt4060 = Class391.anInt4060 + 1 & Class91.anIntArray821[Class391.anInt4053];
			var2.method4562(arg0, arg1);
			return var2;
		}
	}

	public void method4572() {
		this.aBoolean3993 = true;
	}

	public void method4573(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.anInt4004 = arg0;
	}

	public Class81 method4574() {
		this.aClass81_3996.aClass461_675.method5696(90717493);
		for (int var1 = 0; var1 < this.aClass325_Sub3_Sub1_Sub1Array3994.length; var1++) {
			if (this.aClass325_Sub3_Sub1_Sub1Array3994[var1] != null && this.aClass325_Sub3_Sub1_Sub1Array3994[var1].aClass406_10127 != null) {
				this.aClass81_3996.aClass461_675.method5693(this.aClass325_Sub3_Sub1_Sub1Array3994[var1], 72631206);
			}
		}
		return this.aClass81_3996;
	}

	public void method4575(Class64[] arg0, boolean arg1) {
		for (int var3 = 0; var3 < 8; var3++) {
			aBooleanArray4005[var3] = false;
		}
		Iterator var6 = this.aList4000.iterator();
		while (true) {
			label68: while (var6.hasNext()) {
				Class330_Sub21 var4 = (Class330_Sub21) var6.next();
				if (arg0 != null) {
					for (int var5 = 0; var5 < arg0.length; var5++) {
						if (var4.aClass64_7690 == arg0[var5] || var4.aClass64_7690 == arg0[var5].aClass64_562) {
							aBooleanArray4005[var5] = true;
							var4.method3375((byte) 92);
							continue label68;
						}
					}
				}
				if (!arg1) {
					var4.method3252(544644437);
					this.anInt4002--;
					if (var4.method3251(122249317)) {
						var4.method3252(50520538);
						Class391.anInt4061--;
					}
				}
			}
			if (arg0 != null) {
				for (int var7 = 0; var7 < arg0.length && var7 != 8 && this.anInt4002 != 8; var7++) {
					if (!aBooleanArray4005[var7]) {
						Class330_Sub21 var8 = null;
						if (arg0[var7].method771(-1671982278).anInt1968 == 1 && Class391.anInt4061 < 32) {
							var8 = new Class330_Sub21(arg0[var7], this);
							Class391.aClass497_4062.method6097(var8, (long) arg0[var7].anInt564);
							Class391.anInt4061++;
						}
						if (var8 == null) {
							var8 = new Class330_Sub21(arg0[var7], this);
						}
						this.aList4000.add(var8);
						this.anInt4002++;
						aBooleanArray4005[var7] = true;
					}
				}
			}
			return;
		}
	}
}
