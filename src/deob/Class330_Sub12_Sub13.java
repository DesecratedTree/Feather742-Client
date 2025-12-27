package deob;

public class Class330_Sub12_Sub13 extends Class330_Sub12 {

	public int anInt9541 = -1;

	public byte aByte9542;

	public Class170 aClass170_9543;

	public Class330_Sub12_Sub13(Class170 arg0) {
	}

	public void method3300(Class154 arg0) {
		arg0.method1807(this.anInt9541 * 381564349 * 461548949, this.aByte9542, 1245010354);
	}

	public void method3294(Buffer arg0, byte arg1) {
		try {
			this.anInt9541 = arg0.readUnsignedShort(55120239);
			this.aByte9542 = arg0.readByte((byte) 11);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aiz.r(" + ')');
		}
	}

	public void method3293(Class154 arg0, int arg1) {
		try {
			arg0.method1807(this.anInt9541, this.aByte9542, 1046654736);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aiz.j(" + ')');
		}
	}

	public void method3301(Buffer arg0) {
		this.anInt9541 = arg0.readUnsignedShort(1626334030) * 461548949 * 381564349;
		this.aByte9542 = arg0.readByte((byte) 63);
	}

	public void method3298(Class154 arg0) {
		arg0.method1807(this.anInt9541 * 381564349 * 461548949, this.aByte9542, -942846863);
	}

	public void method3295(Class154 arg0) {
		arg0.method1807(this.anInt9541 * 381564349 * 461548949, this.aByte9542, 930253111);
	}

	public void method3297(Buffer arg0) {
		this.anInt9541 = arg0.readUnsignedShort(191004785) * 461548949 * 381564349;
		this.aByte9542 = arg0.readByte((byte) -26);
	}

	public void method3299(Buffer arg0) {
		this.anInt9541 = arg0.readUnsignedShort(-37603110) * 461548949 * 381564349;
		this.aByte9542 = arg0.readByte((byte) -44);
	}

	public void method3296(Buffer arg0) {
		this.anInt9541 = arg0.readUnsignedShort(1427224106) * 461548949 * 381564349;
		this.aByte9542 = arg0.readByte((byte) -53);
	}

	public static final void method3308(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			if (var3.aString1283 == null) {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = "";
			} else {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var3.aString1283;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aiz.qo(" + ')');
		}
	}
}
