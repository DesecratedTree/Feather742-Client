package deob;

public class Class330_Sub12_Sub5 extends Class330_Sub12 {

	public byte aByte9514;

	public byte aByte9516;

	public byte aByte9517;

	public byte aByte9518;

	public Class170 aClass170_9515;

	public boolean aBoolean9513;

	public void method3299(Buffer arg0) {
		this.aBoolean9513 = arg0.readUnsignedByte(452807622) == 1;
		this.aByte9518 = arg0.readByte((byte) -1);
		this.aByte9514 = arg0.readByte((byte) 18);
		this.aByte9516 = arg0.readByte((byte) -61);
		this.aByte9517 = arg0.readByte((byte) -12);
	}

	public void method3294(Buffer arg0, byte arg1) {
		try {
			this.aBoolean9513 = arg0.readUnsignedByte(-24628967) == 1;
			this.aByte9518 = arg0.readByte((byte) 16);
			this.aByte9514 = arg0.readByte((byte) 92);
			this.aByte9516 = arg0.readByte((byte) -31);
			this.aByte9517 = arg0.readByte((byte) 118);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aig.r(" + ')');
		}
	}

	public void method3293(Class154 arg0, int arg1) {
		try {
			arg0.aBoolean1642 = this.aBoolean9513;
			arg0.aByte1638 = this.aByte9518;
			arg0.aByte1644 = this.aByte9514;
			arg0.aByte1645 = this.aByte9516;
			arg0.aByte1635 = this.aByte9517;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aig.j(" + ')');
		}
	}

	public void method3301(Buffer arg0) {
		this.aBoolean9513 = arg0.readUnsignedByte(-55188686) == 1;
		this.aByte9518 = arg0.readByte((byte) -18);
		this.aByte9514 = arg0.readByte((byte) 0);
		this.aByte9516 = arg0.readByte((byte) -14);
		this.aByte9517 = arg0.readByte((byte) -44);
	}

	public void method3297(Buffer arg0) {
		this.aBoolean9513 = arg0.readUnsignedByte(2066507963) == 1;
		this.aByte9518 = arg0.readByte((byte) -12);
		this.aByte9514 = arg0.readByte((byte) -64);
		this.aByte9516 = arg0.readByte((byte) -41);
		this.aByte9517 = arg0.readByte((byte) 80);
	}

	public void method3298(Class154 arg0) {
		arg0.aBoolean1642 = this.aBoolean9513;
		arg0.aByte1638 = this.aByte9518;
		arg0.aByte1644 = this.aByte9514;
		arg0.aByte1645 = this.aByte9516;
		arg0.aByte1635 = this.aByte9517;
	}

	public void method3296(Buffer arg0) {
		this.aBoolean9513 = arg0.readUnsignedByte(320417743) == 1;
		this.aByte9518 = arg0.readByte((byte) 36);
		this.aByte9514 = arg0.readByte((byte) 73);
		this.aByte9516 = arg0.readByte((byte) 29);
		this.aByte9517 = arg0.readByte((byte) 11);
	}

	public void method3295(Class154 arg0) {
		arg0.aBoolean1642 = this.aBoolean9513;
		arg0.aByte1638 = this.aByte9518;
		arg0.aByte1644 = this.aByte9514;
		arg0.aByte1645 = this.aByte9516;
		arg0.aByte1635 = this.aByte9517;
	}

	public void method3300(Class154 arg0) {
		arg0.aBoolean1642 = this.aBoolean9513;
		arg0.aByte1638 = this.aByte9518;
		arg0.aByte1644 = this.aByte9514;
		arg0.aByte1645 = this.aByte9516;
		arg0.aByte1635 = this.aByte9517;
	}

	public Class330_Sub12_Sub5(Class170 arg0) {
	}

	public static final void method3304(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -276132717);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class395.method4646(var3, var4, arg0, 2069283165);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aig.hi(" + ')');
		}
	}
}
