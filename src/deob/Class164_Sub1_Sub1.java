package deob;

public class Class164_Sub1_Sub1 extends Class164_Sub1 {

	public Class249 aClass249_9437 = new Class249();

	public Class249 aClass249_9446 = new Class249();

	public float[] aFloatArray9434 = new float[4];

	public float[] aFloatArray9443 = new float[4];

	public Class155 aClass155_9442;

	public float aFloat9444;

	public int anInt9431;

	public int anInt9445;

	public int anInt9447;

	public int anInt9448;

	public Class123 aClass123_9435;

	public Class123 aClass123_9439;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9432;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9433;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9436;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9438;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9440;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9441;

	public Class164_Sub1_Sub1(Class_ra_Sub2 arg0, Class155 arg1) throws Exception_Sub2 {
		super(arg0);
		this.aClass155_9442 = arg1;
		if (this.aClass155_9442.method1825() && arg0.method5051()) {
			this.method1939("Waterfall");
		}
	}

	public void method1952(int arg0, int arg1, int arg2) {
		try {
			float var4 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
			float var5 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
			float var6 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
			boolean var7 = (arg0 & 0x80) != 0;
			if (var7) {
				this.aFloatArray9434[0] = var6;
				this.aFloatArray9434[1] = 0.0F;
				this.aFloatArray9434[2] = 0.0F;
				this.aFloatArray9434[3] = 0.0F;
			} else {
				this.aFloatArray9434[0] = 0.0F;
				this.aFloatArray9434[1] = 0.0F;
				this.aFloatArray9434[2] = var6;
				this.aFloatArray9434[3] = 0.0F;
			}
			this.aFloatArray9443[0] = 0.0F;
			this.aFloatArray9443[1] = var6;
			this.aFloatArray9443[2] = 0.0F;
			this.aFloatArray9443[3] = (float) this.aClass_ra_Sub2_1694.anInt8588 * var4 % 1.0F;
			if (this.aClass155_9442.aBoolean1669) {
				this.aFloat9444 = (float) ((double) var5 * (double) this.aClass_ra_Sub2_1694.anInt8588 % 1.0D);
			} else {
				int var8 = (int) (var5 * 16.0F * (float) this.aClass_ra_Sub2_1694.anInt8588);
				this.aClass_ra_Sub2_1694.method4956(this.aClass155_9442.anInterface11_Impl3Array1672[var8 % 16]);
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "ahr.bl(" + ')');
		}
	}

	public void method1953(int arg0) {
		try {
			if (this.aClass155_9442.aBoolean1669) {
				this.aClass105_7310.method1258(this.aClass123_9439);
			} else {
				this.aClass105_7310.method1258(this.aClass123_9435);
			}
			this.aClass105_7310.method1249();
			if (this.aClass155_9442.aBoolean1669) {
				this.aClass105_7310.method1270(this.aClass330_Sub15_Sub1_9441, 0, this.aClass155_9442.anInterface11_Impl2_1675, (byte) 43);
			}
			this.aClass105_7310.method1253(this.aClass330_Sub15_Sub1_9438, this.aClass249_9446, -1543727077);
			this.aClass105_7310.method1253(this.aClass330_Sub15_Sub1_9436, this.aClass249_9437, -550899517);
			this.aClass105_7310.method1266(this.aClass330_Sub15_Sub1_9440, new Class261(this.aFloatArray9434[0], this.aFloatArray9434[1], this.aFloatArray9434[2], this.aFloatArray9434[3]), 658911699);
			this.aClass105_7310.method1266(this.aClass330_Sub15_Sub1_9433, new Class261(this.aFloatArray9443[0], this.aFloatArray9443[1], this.aFloatArray9443[2], this.aFloatArray9443[3]), -55982157);
			this.aClass105_7310.method1266(this.aClass330_Sub15_Sub1_9432, new Class261(this.aFloat9444, 0.0F, 0.0F, 0.0F), 1827940407);
			this.aClass_ra_Sub2_1694.method4987(Class199.aClass199_1926, this.anInt9445, this.anInt9431, this.anInt9447 * 3, this.anInt9448);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ahr.bk(" + ')');
		}
	}

	public boolean method1947() throws Exception_Sub2 {
		this.aClass330_Sub15_Sub1_9438 = this.aClass105_7310.method1295("WorldMatrix", (byte) -2);
		this.aClass330_Sub15_Sub1_9436 = this.aClass105_7310.method1295("WVPMatrix", (byte) -83);
		this.aClass330_Sub15_Sub1_9440 = this.aClass105_7310.method1295("UGenerationPlane", (byte) -56);
		this.aClass330_Sub15_Sub1_9433 = this.aClass105_7310.method1295("VGenerationPlane", (byte) -60);
		this.aClass330_Sub15_Sub1_9432 = this.aClass105_7310.method1295("Time", (byte) -74);
		this.aClass330_Sub15_Sub1_9441 = this.aClass105_7310.method1295("billowSampler3D", (byte) -100);
		if (this.aClass155_9442.aBoolean1669) {
			this.aClass123_9439 = this.aClass105_7310.method1254("Waterfall3D", 973263999);
			this.aClass105_7310.method1258(this.aClass123_9439);
		} else {
			this.aClass123_9435 = this.aClass105_7310.method1254("Waterfall2D", -1675802056);
			this.aClass105_7310.method1258(this.aClass123_9435);
		}
		return true;
	}

	public boolean method1938() throws Exception_Sub2 {
		try {
			this.aClass330_Sub15_Sub1_9438 = this.aClass105_7310.method1295("WorldMatrix", (byte) -53);
			this.aClass330_Sub15_Sub1_9436 = this.aClass105_7310.method1295("WVPMatrix", (byte) -92);
			this.aClass330_Sub15_Sub1_9440 = this.aClass105_7310.method1295("UGenerationPlane", (byte) -102);
			this.aClass330_Sub15_Sub1_9433 = this.aClass105_7310.method1295("VGenerationPlane", (byte) -52);
			this.aClass330_Sub15_Sub1_9432 = this.aClass105_7310.method1295("Time", (byte) -84);
			this.aClass330_Sub15_Sub1_9441 = this.aClass105_7310.method1295("billowSampler3D", (byte) -74);
			if (this.aClass155_9442.aBoolean1669) {
				this.aClass123_9439 = this.aClass105_7310.method1254("Waterfall3D", 318605156);
				this.aClass105_7310.method1258(this.aClass123_9439);
			} else {
				this.aClass123_9435 = this.aClass105_7310.method1254("Waterfall2D", -1892758550);
				this.aClass105_7310.method1258(this.aClass123_9435);
			}
			return true;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "ahr.m(" + ')');
		}
	}
}
