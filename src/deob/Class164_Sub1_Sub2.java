package deob;

public class Class164_Sub1_Sub2 extends Class164_Sub1 {

	public Class249 aClass249_9454 = new Class249();

	public Class249 aClass249_9465 = new Class249();

	public Class260 aClass260_9463 = new Class260();

	public Class261 aClass261_9461 = new Class261();

	public Class261 aClass261_9478 = new Class261();

	public Class261 aClass261_9479 = new Class261();

	public Class261 aClass261_9467 = new Class261();

	public Class260 aClass260_9469 = new Class260();

	public Class261 aClass261_9471 = new Class261();

	public Class260 aClass260_9473 = new Class260();

	public float aFloat9477 = 0.0F;

	public Class155 aClass155_9458;

	public boolean aBoolean9456;

	public boolean aBoolean9451;

	public int anInt9449;

	public int anInt9459;

	public int anInt9474;

	public int anInt9475;

	public int anInt9476;

	public Class123 aClass123_9480;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9450;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9452;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9453;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9455;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9457;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9460;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9462;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9464;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9466;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9468;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9470;

	public Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9472;

	public Class164_Sub1_Sub2(Class_ra_Sub2 arg0, Class155 arg1, boolean arg2) throws Exception_Sub2 {
		super(arg0);
		new Class249();
		this.aClass155_9458 = arg1;
		this.aBoolean9456 = arg2;
		if (arg0.method5051() && arg0.method4886()) {
			this.aBoolean9451 = this.method1939("EnvMappedWater");
		} else {
			this.aBoolean9451 = false;
		}
	}

	public boolean method1947() throws Exception_Sub2 {
		if (!this.aClass155_9458.method1823()) {
			return false;
		}
		this.aClass330_Sub15_Sub1_9460 = this.aClass105_7310.method1295("NormalSampler", (byte) -56);
		this.aClass330_Sub15_Sub1_9452 = this.aClass105_7310.method1295("EnvMapSampler", (byte) -17);
		this.aClass330_Sub15_Sub1_9453 = this.aClass105_7310.method1295("WVPMatrix", (byte) -85);
		this.aClass330_Sub15_Sub1_9455 = this.aClass105_7310.method1295("TexCoordMatrix", (byte) -82);
		this.aClass330_Sub15_Sub1_9457 = this.aClass105_7310.method1295("EyePosAndTime", (byte) 3);
		this.aClass330_Sub15_Sub1_9450 = this.aClass105_7310.method1295("SunDirectionAndExponent", (byte) -99);
		this.aClass330_Sub15_Sub1_9462 = this.aClass105_7310.method1295("SunColourAndWaveExponent", (byte) -54);
		this.aClass330_Sub15_Sub1_9464 = this.aClass105_7310.method1295("WaveIntensityAndBreakWaterDepthAndOffset", (byte) -104);
		this.aClass330_Sub15_Sub1_9466 = this.aClass105_7310.method1295("HeightFogPlane", (byte) -72);
		this.aClass330_Sub15_Sub1_9468 = this.aClass105_7310.method1295("HeightFogColour", (byte) -127);
		this.aClass330_Sub15_Sub1_9470 = this.aClass105_7310.method1295("DistanceFogPlane", (byte) -31);
		this.aClass330_Sub15_Sub1_9472 = this.aClass105_7310.method1295("DistanceFogColour", (byte) -21);
		this.aClass123_9480 = this.aClass105_7310.method1254(this.aBoolean9456 ? "EnvMappedSea" : "EnvMappedWater", -204776510);
		this.aClass105_7310.method1258(this.aClass123_9480);
		return true;
	}

	public void method1940(Class249 arg0) {
		try {
			Class249 var2 = new Class249();
			var2.method2486(this.aFloat9477, this.aFloat9477, 1.0F, 1.0F);
			var2.method2484(arg0, var2);
			super.method1940(var2);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ahw.h(" + ')');
		}
	}

	public void method1943(boolean arg0) {
		try {
			float var2 = (1.0F - Math.abs(this.aClass_ra_Sub2_1694.aFloatArray8525[1])) * 2.0F + 1.0F;
			float var3 = this.aClass_ra_Sub2_1694.aFloat8489;
			this.aClass_ra_Sub2_1694.aFloat8489 *= var2;
			super.method1943(arg0);
			this.aClass_ra_Sub2_1694.aFloat8489 = var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ahw.ac(" + ')');
		}
	}

	public void method1954(int arg0) {
		try {
			this.aFloat9477 = 2.4414062E-4F;
			short var2 = 256;
			float var3 = 0.3F;
			float var4 = 0.4F;
			float var5 = 0.1F;
			byte var6 = 5;
			this.aClass249_9465.method2486(this.aFloat9477, this.aFloat9477, this.aFloat9477, this.aFloat9477);
			this.aClass261_9461.method2588(-this.aClass_ra_Sub2_1694.aFloatArray8525[0], -this.aClass_ra_Sub2_1694.aFloatArray8525[1], -this.aClass_ra_Sub2_1694.aFloatArray8525[2], 32.0F);
			this.aClass261_9478.method2588(this.aClass_ra_Sub2_1694.aFloat8530, this.aClass_ra_Sub2_1694.aFloat8500, this.aClass_ra_Sub2_1694.aFloat8532, (float) var6);
			this.aClass261_9479.method2588(var5, var4, (float) var2, var3);
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ahw.br(" + ')');
		}
	}

	public void method1955(Class249 arg0) {
		Class249 var2 = new Class249();
		var2.method2486(this.aFloat9477, this.aFloat9477, 1.0F, 1.0F);
		var2.method2484(arg0, var2);
		super.method1940(var2);
	}

	public boolean method1956(int arg0) {
		try {
			return this.aBoolean9451;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ahw.bl(" + ')');
		}
	}

	public void method1957(Class249 arg0) {
		Class249 var2 = new Class249();
		var2.method2486(this.aFloat9477, this.aFloat9477, 1.0F, 1.0F);
		var2.method2484(arg0, var2);
		super.method1940(var2);
	}

	public void method1958(Class249 arg0) {
		Class249 var2 = new Class249();
		var2.method2486(this.aFloat9477, this.aFloat9477, 1.0F, 1.0F);
		var2.method2484(arg0, var2);
		super.method1940(var2);
	}

	public void method1959(short arg0) {
		try {
			this.method1954(-1401707189);
			this.aClass105_7310.method1258(this.aClass123_9480);
			this.aClass105_7310.method1249();
			this.aClass105_7310.method1270(this.aClass330_Sub15_Sub1_9460, 0, this.aClass155_9458.anInterface11_Impl2_1674, (byte) 16);
			this.aClass105_7310.method1270(this.aClass330_Sub15_Sub1_9452, 1, this.aClass_ra_Sub2_1694.method5012(), (byte) 106);
			this.aClass105_7310.method1253(this.aClass330_Sub15_Sub1_9453, this.aClass249_9454, 1521081005);
			this.aClass105_7310.method1269(this.aClass330_Sub15_Sub1_9455, this.aClass249_9465, 1612652822);
			int var2 = 0x1 << (this.anInt9459 & 0x3);
			this.aClass105_7310.method1264(this.aClass330_Sub15_Sub1_9457, this.aClass260_9463.aFloat2716, this.aClass260_9463.aFloat2715, this.aClass260_9463.aFloat2711, (float) (var2 * this.aClass_ra_Sub2_1694.anInt8588 % 40000) / 40000.0F, -775843056);
			this.aClass105_7310.method1266(this.aClass330_Sub15_Sub1_9450, this.aClass261_9461, -1161298992);
			this.aClass105_7310.method1266(this.aClass330_Sub15_Sub1_9462, this.aClass261_9478, -39565434);
			this.aClass105_7310.method1266(this.aClass330_Sub15_Sub1_9464, this.aClass261_9479, -1593364660);
			this.aClass105_7310.method1266(this.aClass330_Sub15_Sub1_9466, this.aClass261_9467, -857444240);
			this.aClass105_7310.method1283(this.aClass330_Sub15_Sub1_9468, this.aClass260_9469, (byte) 14);
			this.aClass105_7310.method1266(this.aClass330_Sub15_Sub1_9470, this.aClass261_9471, -1572718670);
			this.aClass105_7310.method1283(this.aClass330_Sub15_Sub1_9472, this.aClass260_9473, (byte) 39);
			this.aClass_ra_Sub2_1694.method4987(Class199.aClass199_1926, this.anInt9474, this.anInt9475, this.anInt9476, this.anInt9449);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ahw.bk(" + ')');
		}
	}

	public void method1960(boolean arg0) {
		float var2 = (1.0F - Math.abs(this.aClass_ra_Sub2_1694.aFloatArray8525[1])) * 2.0F + 1.0F;
		float var3 = this.aClass_ra_Sub2_1694.aFloat8489;
		this.aClass_ra_Sub2_1694.aFloat8489 *= var2;
		super.method1943(arg0);
		this.aClass_ra_Sub2_1694.aFloat8489 = var3;
	}

	public void method1961(Class249 arg0) {
		Class249 var2 = new Class249();
		var2.method2486(this.aFloat9477, this.aFloat9477, 1.0F, 1.0F);
		var2.method2484(arg0, var2);
		super.method1940(var2);
	}

	public boolean method1938() throws Exception_Sub2 {
		try {
			if (!this.aClass155_9458.method1823()) {
				return false;
			}
			this.aClass330_Sub15_Sub1_9460 = this.aClass105_7310.method1295("NormalSampler", (byte) -118);
			this.aClass330_Sub15_Sub1_9452 = this.aClass105_7310.method1295("EnvMapSampler", (byte) -59);
			this.aClass330_Sub15_Sub1_9453 = this.aClass105_7310.method1295("WVPMatrix", (byte) -83);
			this.aClass330_Sub15_Sub1_9455 = this.aClass105_7310.method1295("TexCoordMatrix", (byte) -120);
			this.aClass330_Sub15_Sub1_9457 = this.aClass105_7310.method1295("EyePosAndTime", (byte) -54);
			this.aClass330_Sub15_Sub1_9450 = this.aClass105_7310.method1295("SunDirectionAndExponent", (byte) -74);
			this.aClass330_Sub15_Sub1_9462 = this.aClass105_7310.method1295("SunColourAndWaveExponent", (byte) -18);
			this.aClass330_Sub15_Sub1_9464 = this.aClass105_7310.method1295("WaveIntensityAndBreakWaterDepthAndOffset", (byte) -99);
			this.aClass330_Sub15_Sub1_9466 = this.aClass105_7310.method1295("HeightFogPlane", (byte) -18);
			this.aClass330_Sub15_Sub1_9468 = this.aClass105_7310.method1295("HeightFogColour", (byte) -23);
			this.aClass330_Sub15_Sub1_9470 = this.aClass105_7310.method1295("DistanceFogPlane", (byte) -116);
			this.aClass330_Sub15_Sub1_9472 = this.aClass105_7310.method1295("DistanceFogColour", (byte) -47);
			this.aClass123_9480 = this.aClass105_7310.method1254(this.aBoolean9456 ? "EnvMappedSea" : "EnvMappedWater", -1592645532);
			this.aClass105_7310.method1258(this.aClass123_9480);
			return true;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "ahw.m(" + ')');
		}
	}

	public static final void method1962(Class430 arg0, int arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			Class330_Sub34 var3 = Class238.method2377(OutgoingPacket.aClass234_2569, client.aClass1_9060.aClass488_22, 787306198);
			var3.aClass330_Sub46_Sub2_7729.addByte(Class57.method659(var2, -1060590012), (byte) 24);
			var3.aClass330_Sub46_Sub2_7729.addString(var2, (byte) -12);
			client.aClass1_9060.method378(var3, -279543881);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ahw.vw(" + ')');
		}
	}
}
