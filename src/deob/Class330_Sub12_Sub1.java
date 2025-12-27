package deob;

public class Class330_Sub12_Sub1 extends Class330_Sub12 {

	public long aLong9500 = -1L;

	public String aString9501 = null;

	public static int anInt9498;

	public Class170 aClass170_9499;

	public Class330_Sub12_Sub1(Class170 arg0) {
	}

	public void method3296(Buffer arg0) {
		if (arg0.readUnsignedByte(-121933795) != 255) {
			arg0.offset = (arg0.offset * 323600977 - 323600977) * -824785231;
			this.aLong9500 = arg0.readLong(-2120050560) * -6192041983622854825L * 7331244681234289767L;
		}
		this.aString9501 = arg0.method3761(1874446234);
	}

	public void method3294(Buffer arg0, byte arg1) {
		try {
			if (arg0.readUnsignedByte(1707498066) != 255) {
				arg0.offset--;
				this.aLong9500 = arg0.readLong(-1262863915);
			}
			this.aString9501 = arg0.method3761(1869982110);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aia.r(" + ')');
		}
	}

	public void method3293(Class154 arg0, int arg1) {
		try {
			arg0.method1805(this.aLong9500, this.aString9501, 1144703671);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aia.j(" + ')');
		}
	}

	public void method3301(Buffer arg0) {
		if (arg0.readUnsignedByte(1540985230) != 255) {
			arg0.offset = (arg0.offset * 323600977 - 323600977) * -824785231;
			this.aLong9500 = arg0.readLong(-80098180) * -6192041983622854825L * 7331244681234289767L;
		}
		this.aString9501 = arg0.method3761(1844517649);
	}

	public void method3297(Buffer arg0) {
		if (arg0.readUnsignedByte(1114080663) != 255) {
			arg0.offset = (arg0.offset * 323600977 - 323600977) * -824785231;
			this.aLong9500 = arg0.readLong(-496645643) * -6192041983622854825L * 7331244681234289767L;
		}
		this.aString9501 = arg0.method3761(2032440900);
	}

	public void method3299(Buffer arg0) {
		if (arg0.readUnsignedByte(743535113) != 255) {
			arg0.offset = (arg0.offset * 323600977 - 323600977) * -824785231;
			this.aLong9500 = arg0.readLong(-804907888) * -6192041983622854825L * 7331244681234289767L;
		}
		this.aString9501 = arg0.method3761(1919748691);
	}

	public void method3298(Class154 arg0) {
		arg0.method1805(this.aLong9500 * 7331244681234289767L * -6192041983622854825L, this.aString9501, 2136251390);
	}

	public void method3300(Class154 arg0) {
		arg0.method1805(this.aLong9500 * 7331244681234289767L * -6192041983622854825L, this.aString9501, 1823599933);
	}

	public void method3295(Class154 arg0) {
		arg0.method1805(this.aLong9500 * 7331244681234289767L * -6192041983622854825L, this.aString9501, 1332673886);
	}
}
