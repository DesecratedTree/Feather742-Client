package deob;

public class Class330_Sub36_Sub13 extends Class330_Sub36 {

	public String aString9717;

	public Class472 aClass472_9716;

	public int anInt9715;

	public int method3485(byte arg0) {
		try {
			return this.aClass472_9716.aClass330_Sub36_5613.aClass330_Sub36_7735 == this.aClass472_9716.aClass330_Sub36_5613 ? -1 : ((Class330_Sub36_Sub10) this.aClass472_9716.aClass330_Sub36_5613.aClass330_Sub36_7735).anInt9699;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ajq.r(" + ')');
		}
	}

	public boolean method3486(Class330_Sub36_Sub10 arg0, int arg1) {
		try {
			boolean var3 = true;
			arg0.method3439((byte) 0);
			Class330_Sub36_Sub10 var4 = (Class330_Sub36_Sub10) this.aClass472_9716.method5884((byte) 71);
			while (var4 != null) {
				if (Class232.method2361(arg0.anInt9699, var4.anInt9699, 1853612053)) {
					Class333.method3930(arg0, var4, 2142166849);
					this.anInt9715++;
					return !var3;
				}
				var4 = (Class330_Sub36_Sub10) this.aClass472_9716.method5886((short) 8192);
				var3 = false;
			}
			this.aClass472_9716.method5883(arg0, -2073976774);
			this.anInt9715++;
			return var3;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ajq.j(" + ')');
		}
	}

	public boolean method3487(Class330_Sub36_Sub10 arg0, byte arg1) {
		try {
			int var3 = this.method3485((byte) -17);
			arg0.method3439((byte) -87);
			this.anInt9715--;
			if (this.anInt9715 != 0) {
				return var3 != this.method3485((byte) -90);
			}
			this.method3252(-170886213);
			this.method3439((byte) -51);
			Class484.anInt5790--;
			Class484.aClass367_5796.put(this, arg0.aLong9695);
			return false;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ajq.i(" + ')');
		}
	}

	public Class330_Sub36_Sub13(String arg0) {
		this.aString9717 = arg0;
		this.aClass472_9716 = new Class472();
	}
}
