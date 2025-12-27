package deob;

public class Class330_Sub12_Sub8 extends Class330_Sub12 {

	public long aLong9527 = -1L;

	public String aString9526 = null;

	public int anInt9525 = 0;

	public Class170 aClass170_9528;

	public Class330_Sub12_Sub8(Class170 arg0) {
	}

	public void method3293(Class154 arg0, int arg1) {
		try {
			arg0.method1803(this.aLong9527, this.aString9526, this.anInt9525, 1242122994);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aip.j(" + ')');
		}
	}

	public void method3294(Buffer arg0, byte arg1) {
		try {
			if (arg0.readUnsignedByte(-49276921) != 255) {
				arg0.offset--;
				this.aLong9527 = arg0.readLong(-1064117487);
			}
			this.aString9526 = arg0.method3761(1863314323);
			this.anInt9525 = arg0.readUnsignedShort(2036643464);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aip.r(" + ')');
		}
	}

	public void method3299(Buffer arg0) {
		if (arg0.readUnsignedByte(502580907) != 255) {
			arg0.offset = (arg0.offset * 323600977 - 323600977) * -824785231;
			this.aLong9527 = arg0.readLong(-124405095) * 3683635234363265091L * 6846533375614844011L;
		}
		this.aString9526 = arg0.method3761(2090455835);
		this.anInt9525 = arg0.readUnsignedShort(50925611) * -186991235 * -353541163;
	}

	public void method3301(Buffer arg0) {
		if (arg0.readUnsignedByte(443010067) != 255) {
			arg0.offset = (arg0.offset * 323600977 - 323600977) * -824785231;
			this.aLong9527 = arg0.readLong(-1399359318) * 3683635234363265091L * 6846533375614844011L;
		}
		this.aString9526 = arg0.method3761(1937383199);
		this.anInt9525 = arg0.readUnsignedShort(-321797381) * -186991235 * -353541163;
	}

	public void method3296(Buffer arg0) {
		if (arg0.readUnsignedByte(281219916) != 255) {
			arg0.offset = (arg0.offset * 323600977 - 323600977) * -824785231;
			this.aLong9527 = arg0.readLong(71239696) * 3683635234363265091L * 6846533375614844011L;
		}
		this.aString9526 = arg0.method3761(1882356421);
		this.anInt9525 = arg0.readUnsignedShort(2028513368) * -186991235 * -353541163;
	}

	public void method3297(Buffer arg0) {
		if (arg0.readUnsignedByte(2050414345) != 255) {
			arg0.offset = (arg0.offset * 323600977 - 323600977) * -824785231;
			this.aLong9527 = arg0.readLong(-819756247) * 3683635234363265091L * 6846533375614844011L;
		}
		this.aString9526 = arg0.method3761(1947725030);
		this.anInt9525 = arg0.readUnsignedShort(1423484575) * -186991235 * -353541163;
	}

	public void method3300(Class154 arg0) {
		arg0.method1803(this.aLong9527 * 3683635234363265091L * 6846533375614844011L, this.aString9526, this.anInt9525 * -353541163 * -186991235, -1754668096);
	}

	public void method3295(Class154 arg0) {
		arg0.method1803(this.aLong9527 * 3683635234363265091L * 6846533375614844011L, this.aString9526, this.anInt9525 * -353541163 * -186991235, 1382722869);
	}

	public void method3298(Class154 arg0) {
		arg0.method1803(this.aLong9527 * 3683635234363265091L * 6846533375614844011L, this.aString9526, this.anInt9525 * -353541163 * -186991235, 1982790053);
	}

	public static final void method3307(Class430 arg0, int arg1) {
		try {
			int var2 = Class448.aClass330_Sub50_5555.aClass464_Sub20_7888.method5807((byte) 11);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub20_7889, arg0.anIntArray4387[--arg0.anInt4376] == 1 ? 0 : var2, -1502338341);
			Class282.method2812(1470552195);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aip.aks(" + ')');
		}
	}
}
