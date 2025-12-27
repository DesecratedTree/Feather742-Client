package deob;

public class Class315_Sub1 extends Class315 {

	public long aLong7451 = 0L;

	public long aLong7456 = 0L;

	public long aLong7453 = 0L;

	public long[] aLongArray7452 = new long[10];

	public int anInt7455 = 0;

	public int anInt7454 = 1;

	public Class315_Sub1() {
		this.aLong7451 = System.nanoTime();
		this.aLong7456 = System.nanoTime();
	}

	public void method3124(byte arg0) {
		try {
			this.aLong7453 = 0L;
			if (this.aLong7456 > this.aLong7451) {
				this.aLong7451 += this.aLong7456 - this.aLong7451;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "abm.i(" + ')');
		}
	}

	public void method3129() {
		this.aLong7453 = 0L * 6753135946378412613L;
		if (this.aLong7456 * 7483737380390534193L * -8292750810611426095L > this.aLong7451 * 5071007148181978583L * -230295620616796697L) {
			this.aLong7451 = (this.aLong7451 * 5071007148181978583L + (this.aLong7456 * 8124533024894302759L * -8292750810611426095L - this.aLong7451 * 5071007148181978583L)) * -230295620616796697L;
		}
	}

	public long method3125(byte arg0) {
		try {
			this.aLong7451 += this.method3141((byte) 61);
			return this.aLong7456 > this.aLong7451 ? (this.aLong7456 - this.aLong7451) / 1000000L : 0L;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "abm.p(" + ')');
		}
	}

	public int method3126(long arg0) {
		try {
			if (this.aLong7456 > this.aLong7451) {
				this.aLong7453 += this.aLong7456 - this.aLong7451;
				this.aLong7451 += this.aLong7456 - this.aLong7451;
				this.aLong7456 += arg0;
				return 1;
			}
			int var3 = 0;
			do {
				var3++;
				this.aLong7456 += arg0;
			} while (var3 < 10 && this.aLong7456 < this.aLong7451);
			if (this.aLong7456 < this.aLong7451) {
				this.aLong7456 = this.aLong7451;
			}
			return var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "abm.o(" + ')');
		}
	}

	public long method3134(int arg0) {
		try {
			return this.aLong7451;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "abm.s(" + ')');
		}
	}

	public long method3141(byte arg0) {
		try {
			long var2 = System.nanoTime();
			long var4 = var2 - this.aLong7453;
			this.aLong7453 = var2;
			if (var4 > -5000000000L && var4 < 5000000000L) {
				this.aLongArray7452[this.anInt7455] = var4;
				this.anInt7455 = (this.anInt7455 + 1) % 10;
				if (this.anInt7454 < 1) {
					this.anInt7454++;
				}
			}
			long var6 = 0L;
			for (int var8 = 1; var8 <= this.anInt7454; var8++) {
				var6 += this.aLongArray7452[(this.anInt7455 - var8 + 10) % 10];
			}
			return var6 / (long) this.anInt7454;
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "abm.m(" + ')');
		}
	}

	public void method3127() {
		this.aLong7453 = 0L * 6753135946378412613L;
		if (this.aLong7456 * 7483737380390534193L * -8292750810611426095L > this.aLong7451 * 5071007148181978583L * -230295620616796697L) {
			this.aLong7451 = (this.aLong7451 * 5071007148181978583L + (this.aLong7456 * 8124533024894302759L * -8292750810611426095L - this.aLong7451 * 5071007148181978583L)) * -230295620616796697L;
		}
	}

	public int method3132(long arg0) {
		if (this.aLong7456 * 7483737380390534193L * -8292750810611426095L > this.aLong7451 * 5071007148181978583L * -230295620616796697L) {
			this.aLong7453 = (this.aLong7453 * 5611218515399622797L + (this.aLong7456 * 1692267118597678845L * -8292750810611426095L - this.aLong7451 * 5071007148181978583L * 3212842177632124987L)) * 6753135946378412613L;
			this.aLong7451 = (this.aLong7451 * 5071007148181978583L + (this.aLong7456 * -8292750810611426095L * 8124533024894302759L - this.aLong7451 * 5071007148181978583L)) * -230295620616796697L;
			this.aLong7456 = (this.aLong7456 * -8292750810611426095L + arg0 * -8292750810611426095L) * 7483737380390534193L;
			return 1;
		}
		int var3 = 0;
		do {
			var3++;
			this.aLong7456 = (this.aLong7456 * -8292750810611426095L + arg0 * -8292750810611426095L) * 7483737380390534193L;
		} while (var3 < 10 && this.aLong7456 * -8292750810611426095L * 7483737380390534193L < this.aLong7451 * 5071007148181978583L * -230295620616796697L);
		if (this.aLong7456 * 7483737380390534193L * -8292750810611426095L < this.aLong7451 * 5071007148181978583L * -230295620616796697L) {
			this.aLong7456 = this.aLong7451 * 7839755107425228183L * 5071007148181978583L * 7483737380390534193L;
		}
		return var3;
	}

	public void method3128() {
		this.aLong7453 = 0L * 6753135946378412613L;
		if (this.aLong7456 * 7483737380390534193L * -8292750810611426095L > this.aLong7451 * 5071007148181978583L * -230295620616796697L) {
			this.aLong7451 = (this.aLong7451 * 5071007148181978583L + (this.aLong7456 * 8124533024894302759L * -8292750810611426095L - this.aLong7451 * 5071007148181978583L)) * -230295620616796697L;
		}
	}

	public long method3130() {
		this.aLong7451 = (this.aLong7451 * 5071007148181978583L + this.method3141((byte) 54) * 5071007148181978583L) * -230295620616796697L;
		return this.aLong7456 * -8292750810611426095L * 7483737380390534193L > this.aLong7451 * 5071007148181978583L * -230295620616796697L ? (this.aLong7456 * 7483737380390534193L * -8292750810611426095L - this.aLong7451 * 5071007148181978583L * -230295620616796697L) / 1000000L : 0L;
	}

	public long method3131() {
		this.aLong7451 = (this.aLong7451 * 5071007148181978583L + this.method3141((byte) 67) * 5071007148181978583L) * -230295620616796697L;
		return this.aLong7456 * -8292750810611426095L * 7483737380390534193L > this.aLong7451 * 5071007148181978583L * -230295620616796697L ? (this.aLong7456 * 7483737380390534193L * -8292750810611426095L - this.aLong7451 * 5071007148181978583L * -230295620616796697L) / 1000000L : 0L;
	}

	public void method3122() {
		this.aLong7453 = 0L * 6753135946378412613L;
		if (this.aLong7456 * 7483737380390534193L * -8292750810611426095L > this.aLong7451 * 5071007148181978583L * -230295620616796697L) {
			this.aLong7451 = (this.aLong7451 * 5071007148181978583L + (this.aLong7456 * 8124533024894302759L * -8292750810611426095L - this.aLong7451 * 5071007148181978583L)) * -230295620616796697L;
		}
	}

	public long method3133() {
		return this.aLong7451 * -230295620616796697L * 5071007148181978583L;
	}

	public long method3123() {
		return this.aLong7451 * -230295620616796697L * 5071007148181978583L;
	}

	public static void method3142(Class106 arg0, int arg1, int arg2) {
		try {
			int var5 = arg1 * Class448.aClass330_Sub50_5555.aClass464_Sub30_7898.method5841(-1817737087) >> 8;
			if (arg0 == null) {
				Class365.method4271(-1851069635);
			} else {
				Class83.method965(arg0, var5, 1936728164);
				Class444.method5618(-1328599937);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "abm.a(" + ')');
		}
	}

	public static void method3143(byte arg0) {
		try {
			if (client.anInt8995 == 6 && !Class434.method5564(-1788858406) && !Class509.method6165(47374417)) {
				Class227.method2311(8, -1188873169);
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "abm.r(" + ')');
		}
	}
}
