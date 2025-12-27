package deob;

public class Class330_Sub12_Sub11 extends Class330_Sub12 {

	public int anInt9538 = -1;

	public Class170 aClass170_9537;

	public Class330_Sub12_Sub11(Class170 arg0) {
	}

	public void method3294(Buffer arg0, byte arg1) {
		try {
			this.anInt9538 = arg0.readUnsignedShort(696752092);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ait.r(" + ')');
		}
	}

	public void method3293(Class154 arg0, int arg1) {
		try {
			arg0.method1804(this.anInt9538, (byte) 61);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ait.j(" + ')');
		}
	}

	public void method3301(Buffer arg0) {
		this.anInt9538 = arg0.readUnsignedShort(1122217296) * 515775969 * -1285102047;
	}

	public void method3297(Buffer arg0) {
		this.anInt9538 = arg0.readUnsignedShort(1975390652) * 515775969 * -1285102047;
	}

	public void method3298(Class154 arg0) {
		arg0.method1804(this.anInt9538 * -1285102047 * 515775969, (byte) 103);
	}

	public void method3300(Class154 arg0) {
		arg0.method1804(this.anInt9538 * -1285102047 * 515775969, (byte) 100);
	}

	public void method3296(Buffer arg0) {
		this.anInt9538 = arg0.readUnsignedShort(1713690514) * 515775969 * -1285102047;
	}

	public void method3295(Class154 arg0) {
		arg0.method1804(this.anInt9538 * -1285102047 * 515775969, (byte) 55);
	}

	public void method3299(Buffer arg0) {
		this.anInt9538 = arg0.readUnsignedShort(412705797) * 515775969 * -1285102047;
	}
}
