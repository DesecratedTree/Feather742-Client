package deob;

public class Class330_Sub12_Sub7 extends Class330_Sub12 {

	public int anInt9522;

	public int anInt9523;

	public Class170 aClass170_9524;

	public void method3299(Buffer arg0) {
		this.anInt9522 = arg0.readInt((byte) 52) * -2096904639 * 1960790465;
		this.anInt9523 = arg0.readInt((byte) 86) * 580253667 * 945751499;
	}

	public void method3294(Buffer arg0, byte arg1) {
		try {
			this.anInt9522 = arg0.readInt((byte) 10);
			this.anInt9523 = arg0.readInt((byte) 26);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aim.r(" + ')');
		}
	}

	public void method3293(Class154 arg0, int arg1) {
		try {
			arg0.method1809(this.anInt9522, this.anInt9523, -1521875508);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aim.j(" + ')');
		}
	}

	public void method3301(Buffer arg0) {
		this.anInt9522 = arg0.readInt((byte) 117) * -2096904639 * 1960790465;
		this.anInt9523 = arg0.readInt((byte) 105) * 580253667 * 945751499;
	}

	public void method3300(Class154 arg0) {
		arg0.method1809(this.anInt9522 * -2096904639 * 1960790465, this.anInt9523 * 580253667 * 945751499, -79844219);
	}

	public void method3296(Buffer arg0) {
		this.anInt9522 = arg0.readInt((byte) 87) * -2096904639 * 1960790465;
		this.anInt9523 = arg0.readInt((byte) 84) * 580253667 * 945751499;
	}

	public Class330_Sub12_Sub7(Class170 arg0) {
	}

	public void method3297(Buffer arg0) {
		this.anInt9522 = arg0.readInt((byte) 10) * -2096904639 * 1960790465;
		this.anInt9523 = arg0.readInt((byte) 35) * 580253667 * 945751499;
	}

	public void method3295(Class154 arg0) {
		arg0.method1809(this.anInt9522 * -2096904639 * 1960790465, this.anInt9523 * 580253667 * 945751499, -431462742);
	}

	public void method3298(Class154 arg0) {
		arg0.method1809(this.anInt9522 * -2096904639 * 1960790465, this.anInt9523 * 580253667 * 945751499, -1970245224);
	}

	public static final void method3306(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 1929141284);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class250.method2517(var3, var4, arg0, (byte) 3);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aim.dy(" + ')');
		}
	}
}
