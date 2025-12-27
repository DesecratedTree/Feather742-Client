package deob;

import jaclib.nanotime.QueryPerformanceCounter;

public class Class315_Sub2 extends Class315 {

	public long aLong7461 = 0L;

	public long aLong7458 = 0L;

	public long aLong7457 = 0L;

	public long[] aLongArray7460 = new long[10];

	public int anInt7462 = 0;

	public int anInt7459 = 1;

	public Class315_Sub2() {
		this.aLong7458 = this.aLong7461 = QueryPerformanceCounter.nanoTime();
		if (this.aLong7461 == 0L) {
			throw new RuntimeException();
		}
	}

	public long method3125(byte arg0) {
		try {
			this.aLong7461 += this.method3144(1569478359);
			return this.aLong7458 > this.aLong7461 ? (this.aLong7458 - this.aLong7461) / 1000000L : 0L;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aco.p(" + ')');
		}
	}

	public void method3122() {
		this.aLong7457 = 0L * 3645289767062017621L;
		if (this.aLong7458 * -628220625364411139L * -5967653429068341163L > this.aLong7461 * 7636820923378602467L * -8434209449040725045L) {
			this.aLong7461 = (this.aLong7461 * -8434209449040725045L + (this.aLong7458 * -628220625364411139L * -8827772110618625433L - this.aLong7461 * -8434209449040725045L)) * 7636820923378602467L;
		}
	}

	public long method3134(int arg0) {
		try {
			return this.aLong7461;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aco.s(" + ')');
		}
	}

	public long method3144(int arg0) {
		try {
			long var2 = QueryPerformanceCounter.nanoTime();
			long var4 = var2 - this.aLong7457;
			this.aLong7457 = var2;
			if (var4 > -5000000000L && var4 < 5000000000L) {
				this.aLongArray7460[this.anInt7462] = var4;
				this.anInt7462 = (this.anInt7462 + 1) % 10;
				if (this.anInt7459 < 1) {
					this.anInt7459++;
				}
			}
			long var6 = 0L;
			for (int var8 = 1; var8 <= this.anInt7459; var8++) {
				var6 += this.aLongArray7460[(this.anInt7462 - var8 + 10) % 10];
			}
			return var6 / (long) this.anInt7459;
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "aco.m(" + ')');
		}
	}

	public void method3127() {
		this.aLong7457 = 0L * 3645289767062017621L;
		if (this.aLong7458 * -628220625364411139L * -5967653429068341163L > this.aLong7461 * 7636820923378602467L * -8434209449040725045L) {
			this.aLong7461 = (this.aLong7461 * -8434209449040725045L + (this.aLong7458 * -628220625364411139L * -8827772110618625433L - this.aLong7461 * -8434209449040725045L)) * 7636820923378602467L;
		}
	}

	public long method3130() {
		this.aLong7461 = (this.aLong7461 * -8434209449040725045L + this.method3144(2114520300) * -8434209449040725045L) * 7636820923378602467L;
		return this.aLong7458 * -5967653429068341163L * -628220625364411139L > this.aLong7461 * -8434209449040725045L * 7636820923378602467L ? (this.aLong7458 * -628220625364411139L * -5967653429068341163L - this.aLong7461 * 7636820923378602467L * -8434209449040725045L) / 1000000L : 0L;
	}

	public void method3124(byte arg0) {
		try {
			this.aLong7457 = 0L;
			if (this.aLong7458 > this.aLong7461) {
				this.aLong7461 += this.aLong7458 - this.aLong7461;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aco.i(" + ')');
		}
	}

	public void method3129() {
		this.aLong7457 = 0L * 3645289767062017621L;
		if (this.aLong7458 * -628220625364411139L * -5967653429068341163L > this.aLong7461 * 7636820923378602467L * -8434209449040725045L) {
			this.aLong7461 = (this.aLong7461 * -8434209449040725045L + (this.aLong7458 * -628220625364411139L * -8827772110618625433L - this.aLong7461 * -8434209449040725045L)) * 7636820923378602467L;
		}
	}

	public long method3123() {
		return this.aLong7461 * 7636820923378602467L * -8434209449040725045L;
	}

	public long method3131() {
		this.aLong7461 = (this.aLong7461 * -8434209449040725045L + this.method3144(1970501286) * -8434209449040725045L) * 7636820923378602467L;
		return this.aLong7458 * -5967653429068341163L * -628220625364411139L > this.aLong7461 * -8434209449040725045L * 7636820923378602467L ? (this.aLong7458 * -628220625364411139L * -5967653429068341163L - this.aLong7461 * 7636820923378602467L * -8434209449040725045L) / 1000000L : 0L;
	}

	public int method3132(long arg0) {
		if (this.aLong7458 * -628220625364411139L * -5967653429068341163L > this.aLong7461 * 7636820923378602467L * -8434209449040725045L) {
			this.aLong7457 = (this.aLong7457 * 1176766671369746173L + (this.aLong7458 * 2643921447763386881L * -628220625364411139L - this.aLong7461 * -8434209449040725045L * -5460553301235921065L)) * 3645289767062017621L;
			this.aLong7461 = (this.aLong7461 * -8434209449040725045L + (this.aLong7458 * -8827772110618625433L * -628220625364411139L - this.aLong7461 * -8434209449040725045L)) * 7636820923378602467L;
			this.aLong7458 = (this.aLong7458 * -628220625364411139L + arg0 * -628220625364411139L) * -5967653429068341163L;
			return 1;
		}
		int var3 = 0;
		do {
			var3++;
			this.aLong7458 = (this.aLong7458 * -628220625364411139L + arg0 * -628220625364411139L) * -5967653429068341163L;
		} while (var3 < 10 && this.aLong7458 * -5967653429068341163L * -628220625364411139L < this.aLong7461 * -8434209449040725045L * 7636820923378602467L);
		if (this.aLong7458 * -5967653429068341163L * -628220625364411139L < this.aLong7461 * 7636820923378602467L * -8434209449040725045L) {
			this.aLong7458 = this.aLong7461 * -984195251663896233L * -8434209449040725045L * -5967653429068341163L;
		}
		return var3;
	}

	public long method3133() {
		return this.aLong7461 * 7636820923378602467L * -8434209449040725045L;
	}

	public int method3126(long arg0) {
		try {
			if (this.aLong7458 > this.aLong7461) {
				this.aLong7457 += this.aLong7458 - this.aLong7461;
				this.aLong7461 += this.aLong7458 - this.aLong7461;
				this.aLong7458 += arg0;
				return 1;
			}
			int var3 = 0;
			do {
				var3++;
				this.aLong7458 += arg0;
			} while (var3 < 10 && this.aLong7458 < this.aLong7461);
			if (this.aLong7458 < this.aLong7461) {
				this.aLong7458 = this.aLong7461;
			}
			return var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aco.o(" + ')');
		}
	}

	public void method3128() {
		this.aLong7457 = 0L * 3645289767062017621L;
		if (this.aLong7458 * -628220625364411139L * -5967653429068341163L > this.aLong7461 * 7636820923378602467L * -8434209449040725045L) {
			this.aLong7461 = (this.aLong7461 * -8434209449040725045L + (this.aLong7458 * -628220625364411139L * -8827772110618625433L - this.aLong7461 * -8434209449040725045L)) * 7636820923378602467L;
		}
	}
}
