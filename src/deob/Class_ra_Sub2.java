package deob;

import jaclib.memory.DirectBufferHelper;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import sun.misc.Unsafe;

public abstract class Class_ra_Sub2 extends Class_ra {

	public Class555 aClass555_8446 = new Class555();

	public int anInt8460 = 4194304;

	public Class471 aClass471_8464 = new Class471();

	public Class247 aClass247_8468 = new Class247();

	public Class249 aClass249_8469 = new Class249();

	public Class247 aClass247_8524 = new Class247();

	public Class247 aClass247_8596 = new Class247();

	public Class249 aClass249_8472 = new Class249();

	public Class249 aClass249_8473 = new Class249();

	public Class247 aClass247_8584 = new Class247();

	public Class249 aClass249_8475 = new Class249();

	public Class247 aClass247_8513 = new Class247();

	public Class249 aClass249_8576 = new Class249();

	public Class249 aClass249_8479 = new Class249();

	public Class260 aClass260_8544 = new Class260();

	public float[] aFloatArray8481 = new float[4];

	public boolean aBoolean8482 = false;

	public Class174 aClass174_8483 = Class174.aClass174_1736;

	public boolean aBoolean8484 = false;

	public Class249 aClass249_8485 = new Class249();

	public Class249 aClass249_8486 = new Class249();

	public boolean aBoolean8487 = false;

	public Class249 aClass249_8488 = new Class249();

	public Class249 aClass249_8477 = new Class249();

	public Class249 aClass249_8577 = this.aClass249_8477;

	public Class249 aClass249_8491 = new Class249();

	public Class249 aClass249_8492 = new Class249();

	public Class249 aClass249_8493 = new Class249();

	public float[][] aFloatArrayArray8494 = new float[6][4];

	public float aFloat8499 = 0.0F;

	public float aFloat8478 = 1.0F;

	public float aFloat8608 = 0.0F;

	public float aFloat8457 = 1.0F;

	public float aFloat8471 = 50.0F;

	public float aFloat8504 = 3584.0F;

	public int anInt8521 = 0;

	public int anInt8506 = 0;

	public int anInt8610 = 0;

	public int anInt8447 = 0;

	public int anInt8597 = 0;

	public int anInt8510 = 0;

	public int anInt8511 = 0;

	public int anInt8512 = 0;

	public int anInt8531 = 0;

	public int anInt8567 = 0;

	public int anInt8515 = 0;

	public int anInt8516 = 0;

	public int anInt8517 = 0;

	public int anInt8518 = 0;

	public boolean aBoolean8519 = true;

	public boolean aBoolean8454 = false;

	public boolean aBoolean8526 = false;

	public boolean aBoolean8522 = false;

	public boolean aBoolean8523 = true;

	public boolean aBoolean8575 = false;

	public float[] aFloatArray8525 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	public float[] aFloatArray8451 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	public float[] aFloatArray8462 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	public float[] aFloatArray8528 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	public int anInt8529 = 16777215;

	public float aFloat8530 = 1.0F;

	public float aFloat8500 = 1.0F;

	public float aFloat8532 = 1.0F;

	public float aFloat8533 = 1.0F;

	public float aFloat8489 = -1.0F;

	public float aFloat8535 = -1.0F;

	public int anInt8539 = 8;

	public int anInt8536 = 3;

	public int anInt8543 = 0;

	public boolean aBoolean8555 = false;

	public Class164[] aClass164Array8558 = new Class164[16];

	public Class192[] aClass192Array8569 = new Class192[2];

	public boolean aBoolean8572 = false;

	public boolean aBoolean8514 = true;

	public int anInt8476 = -1;

	public int anInt8578 = -1;

	public int anInt8560 = 0;

	public int anInt8582 = 1;

	public Class176 aClass176_8583 = Class176.aClass176_1745;

	public boolean aBoolean8546 = true;

	public boolean aBoolean8585 = true;

	public boolean aBoolean8589 = false;

	public Class387_Sub1[] aClass387_Sub1Array8534;

	public Class387_Sub1[] aClass387_Sub1Array8609;

	public Class249 aClass249_8579;

	public Class247 aClass247_8611;

	public int anInt8613;

	public IndexTable aClass280_8527;

	public int anInt8490;

	public int anInt8591;

	public Class188 aClass188_8552;

	public int[] anIntArray8467;

	public Unsafe anUnsafe8461;

	public ByteBuffer aByteBuffer8458;

	public long aLong8459;

	public static int anInt8448 = 1;

	public static int anInt8449 = 2;

	public static int anInt8450 = 4;

	public static int anInt8452 = 55;

	public static int anInt8453 = 7;

	public static int anInt8507 = 100663296;

	public static Object anObject8520 = new Object();

	public static int anInt8550 = 8;

	public static int anInt8568 = 2;

	public static int anInt8574 = 128;

	public static int anInt8586 = 1;

	public static Class249 aClass249_8508 = new Class249();

	public float aFloat8495;

	public float aFloat8497;

	public float aFloat8498;

	public float aFloat8505;

	public float aFloat8580;

	public float aFloat8581;

	public int anInt8445;

	public int anInt8465;

	public int anInt8466;

	public int anInt8480;

	public int anInt8537;

	public int anInt8538;

	public int anInt8540;

	public int anInt8541;

	public int anInt8573;

	public int anInt8588;

	public int anInt8592;

	public int anInt8593;

	public int anInt8599;

	public Class126 aClass126_8562;

	public Class140 aClass140_8474;

	public Class150 aClass150_8561;

	public Class155 aClass155_8542;

	public Class159 aClass159_8590;

	public Class164 aClass164_8557;

	public Class164_Sub1_Sub1 aClass164_Sub1_Sub1_8565;

	public Class164_Sub1_Sub2 aClass164_Sub1_Sub2_8563;

	public Class164_Sub1_Sub2 aClass164_Sub1_Sub2_8564;

	public Class180 aClass180_8470;

	public Class184 aClass184_8602;

	public Class184 aClass184_8603;

	public Class184 aClass184_8604;

	public Class184 aClass184_8605;

	public Class184 aClass184_8606;

	public Class186 aClass186_8455;

	public Class187 aClass187_8556;

	public Class61_Sub1 aClass61_Sub1_8553;

	public Class61_Sub1 aClass61_Sub1_8554;

	public Class77 aClass77_8456;

	public Class92_Sub1 aClass92_Sub1_8570;

	public Interface11_Impl3 anInterface11_Impl3_8503;

	public Interface11_Impl3 anInterface11_Impl3_8551;

	public Interface9_Impl1 anInterface9_Impl1_8501;

	public Interface9_Impl1 anInterface9_Impl1_8587;

	public Interface9_Impl1 anInterface9_Impl1_8600;

	public Interface9_Impl2 anInterface9_Impl2_8559;

	public NativeHeap aNativeHeap8463;

	public boolean aBoolean8496;

	public boolean aBoolean8502;

	public boolean aBoolean8566;

	public boolean aBoolean8571;

	public boolean aBoolean8594;

	public boolean aBoolean8595;

	public boolean aBoolean8598;

	public boolean aBoolean8601;

	public boolean aBoolean8612;

	public Class179[] aClass179Array8547;

	public Class179[] aClass179Array8548;

	public Class181[] aClass181Array8509;

	public Class249[] aClass249Array8545;

	public Class330_Sub14[] aClass330_Sub14Array8607;

	public Interface11[] anInterface11Array8549;

	public Class_ra_Sub2(Interface_ma arg0, IndexTable arg1, int arg2, int arg3) {
		super(arg0);
		new Stream();
		this.aClass387_Sub1Array8534 = new Class387_Sub1[7];
		this.aClass387_Sub1Array8609 = new Class387_Sub1[7];
		this.aClass249_8579 = new Class249();
		this.aClass247_8611 = new Class247();
		this.anInt8613 = -1;
		try {
			this.aClass280_8527 = arg1;
			this.anInt8490 = arg2;
			this.anInt8591 = arg3;
			Class318.method3166(false, true, -1368286637);
			if (this.anInterface_ma4227 == null) {
				this.aClass188_8552 = null;
			} else {
				this.aClass188_8552 = new Class188(this, this.anInterface_ma4227);
			}
			if (this.anInt8591 == 0) {
				this.anIntArray8467 = Console.colorArray;
			} else {
				this.anIntArray8467 = Console.anIntArray4265;
			}
			try {
				Field var5 = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
				var5.setAccessible(true);
				this.anUnsafe8461 = (Unsafe) var5.get(null);
			} catch (Exception var6) {
			}
			this.aByteBuffer8458 = ByteBuffer.allocateDirect(4194304);
			this.aByteBuffer8458.order(ByteOrder.nativeOrder());
			this.aLong8459 = DirectBufferHelper.getDirectBufferAddress(this.aByteBuffer8458);
		} catch (Throwable var7) {
			var7.printStackTrace();
			this.method4781(628001038);
			if (var7 instanceof OutOfMemoryError) {
				throw (OutOfMemoryError) var7;
			}
			throw new RuntimeException("");
		}
		this.bm(this.bx(131072));
	}

	public final void method4882(boolean arg0) {
		if (arg0 != this.aBoolean8502) {
			this.aBoolean8502 = arg0;
			this.method4974();
			this.anInt8540 &= 0xFFFFFFF0;
		}
	}

	public void method4883(Interface8 arg0) {
		this.aClass555_8446.method6397(arg0, -1956893969);
	}

	public void method4884() {
		ArrayList var1 = this.aClass555_8446.method6400((byte) 2);
		Iterator var2 = var1.iterator();
		while (var2.hasNext()) {
			Interface8 var3 = (Interface8) var2.next();
			var3.method53();
		}
	}

	public final void method4885() {
		if (this.aClass174_8483 == Class174.aClass174_1735) {
			return;
		}
		this.aClass174_8483 = Class174.aClass174_1735;
		this.method4919();
		this.method4929();
		this.aClass249_8577 = this.aClass249_8488;
		this.method4930();
		this.method5018();
		this.anInt8540 &= 0xFFFFFFF8;
	}

	public final void method4889(int arg0) {
		switch(arg0) {
			case 0:
				this.method4958(Class179.aClass179_1757, Class179.aClass179_1757);
				break;
			case 1:
				this.method4958(Class179.aClass179_1759, Class179.aClass179_1759);
				break;
			case 2:
				this.method4958(Class179.aClass179_1760, Class179.aClass179_1759);
				break;
			case 3:
				this.method4958(Class179.aClass179_1758, Class179.aClass179_1757);
				break;
			case 4:
				this.method4958(Class179.aClass179_1761, Class179.aClass179_1761);
		}
	}

	public Class113 method4890(byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		try {
			return new Class113(arg0);
		} catch (Exception var4) {
			return null;
		}
	}

	public static boolean method4892() {
		return Class489.method6063(-1102372689).method327("jaclib", -1247511145);
	}

	@ObfuscatedName("Class_ra_Sub2.ih()LClass247;")
	public Class247 ih() {
		return this.aClass247_8524;
	}

	public Class164 method4894(int arg0) {
		return this.aClass164Array8558[arg0];
	}

	public void method4895() {
		this.method5040(7);
		this.method4999();
	}

	@ObfuscatedName("Class_ra_Sub2.ed()Z")
	public final boolean ed() {
		return true;
	}

	public final void method4896() {
		this.anInterface9_Impl1_8600 = this.method4976(false);
		short var1 = 160;
		this.anInterface9_Impl1_8600.method142(var1, 32);
		this.aByteBuffer8458.clear();
		this.aByteBuffer8458.putFloat(0.0F);
		this.aByteBuffer8458.putFloat(0.0F);
		this.aByteBuffer8458.putFloat(0.0F);
		this.aByteBuffer8458.putInt(-1);
		this.aByteBuffer8458.putFloat(0.0F);
		this.aByteBuffer8458.putFloat(0.0F);
		this.aByteBuffer8458.putFloat(0.0F);
		this.aByteBuffer8458.putFloat(0.0F);
		this.aByteBuffer8458.putFloat(0.0F);
		this.aByteBuffer8458.putFloat(1.0F);
		this.aByteBuffer8458.putFloat(0.0F);
		this.aByteBuffer8458.putInt(-1);
		this.aByteBuffer8458.putFloat(0.0F);
		this.aByteBuffer8458.putFloat(1.0F);
		this.aByteBuffer8458.putFloat(0.0F);
		this.aByteBuffer8458.putFloat(1.0F);
		this.aByteBuffer8458.putFloat(1.0F);
		this.aByteBuffer8458.putFloat(1.0F);
		this.aByteBuffer8458.putFloat(0.0F);
		this.aByteBuffer8458.putInt(-1);
		this.aByteBuffer8458.putFloat(1.0F);
		this.aByteBuffer8458.putFloat(1.0F);
		this.aByteBuffer8458.putFloat(1.0F);
		this.aByteBuffer8458.putFloat(1.0F);
		this.aByteBuffer8458.putFloat(1.0F);
		this.aByteBuffer8458.putFloat(0.0F);
		this.aByteBuffer8458.putFloat(0.0F);
		this.aByteBuffer8458.putInt(-1);
		this.aByteBuffer8458.putFloat(1.0F);
		this.aByteBuffer8458.putFloat(0.0F);
		this.aByteBuffer8458.putFloat(1.0F);
		this.aByteBuffer8458.putFloat(0.0F);
		this.aByteBuffer8458.putFloat(0.0F);
		this.aByteBuffer8458.putFloat(0.0F);
		this.aByteBuffer8458.putFloat(0.0F);
		this.aByteBuffer8458.putInt(-1);
		this.aByteBuffer8458.putFloat(0.0F);
		this.aByteBuffer8458.putFloat(0.0F);
		this.aByteBuffer8458.putFloat(0.0F);
		this.aByteBuffer8458.putFloat(0.0F);
		this.anInterface9_Impl1_8600.method97(0, this.aByteBuffer8458.position(), this.aLong8459);
		this.aClass184_8603 = this.method4977(new Class193[] { new Class193(new Class191[] { Class191.aClass191_1863, Class191.aClass191_1862, Class191.aClass191_1864, Class191.aClass191_1864 }) });
	}

	public void method4897(int arg0) {
		if (arg0 != this.anInt8445) {
			this.anInt8445 = arg0;
			this.method4967();
		}
	}

	@ObfuscatedName("Class_ra_Sub2.a()Z")
	public final boolean a() {
		return true;
	}

	@ObfuscatedName("Class_ra_Sub2.em()Z")
	public final boolean em() {
		return true;
	}

	@ObfuscatedName("Class_ra_Sub2.t()Z")
	public final boolean t() {
		return true;
	}

	@ObfuscatedName("Class_ra_Sub2.ay()Z")
	public final boolean ay() {
		return true;
	}

	@ObfuscatedName("Class_ra_Sub2.gt(IIZZ)LClass61;")
	public final Class61 gt(int arg0, int arg1, boolean arg2, boolean arg3) {
		return new Class61_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("Class_ra_Sub2.al()Z")
	public final boolean al() {
		return true;
	}

	@ObfuscatedName("Class_ra_Sub2.at()Z")
	public final boolean at() {
		return true;
	}

	public final void method4902() {
		this.aBoolean8484 = false;
		if (this.aClass174_8483 == Class174.aClass174_1737) {
			this.method5085();
			this.method4930();
		}
	}

	public Class161 method4903() {
		return this.aClass187_8556 == null ? Class161.aClass161_1688 : this.aClass187_8556.method2091();
	}

	@ObfuscatedName("Class_ra_Sub2.dp()I")
	public final int dp() {
		return this.anInt8466 + this.anInt8465 + this.anInt8480;
	}

	public void method4797() {
		if (this.aClass187_8556 != null) {
			this.aClass187_8556.method2090();
		}
	}

	public void method4905() {
		this.method4906();
	}

	public void method4906() {
		this.method4902();
		this.method5099();
		this.method4924();
		this.au();
		this.L();
	}

	@ObfuscatedName("Class_ra_Sub2.il(I)V")
	public final void il(int arg0) {
		this.anInt8536 = 0 * -1431655765 * 3;
		while (arg0 > 1) {
			this.anInt8536 = (this.anInt8536 * -1431655765 * 3 + 1) * -1431655765 * 3;
			arg0 >>= 0x1;
		}
		this.anInt8539 = 0x1 << this.anInt8536 * -1431655765 * 3;
	}

	@ObfuscatedName("Class_ra_Sub2.ca()V")
	public final void ca() {
		if (this.aClass192Array8569[1] != null && this.aClass192Array8569[1].method2106()) {
			this.aClass180_8470.method2057(this.aClass192Array8569[1]);
			this.aClass188_8552.method2096();
		}
	}

	@ObfuscatedName("Class_ra_Sub2.cg()Z")
	public final boolean cg() {
		return this.aClass192Array8569[1] != null && this.aClass192Array8569[1].method2106();
	}

	@ObfuscatedName("Class_ra_Sub2.fh(IIII)V")
	public final void fh(int arg0, int arg1, int arg2, int arg3) {
		int var5;
		int var6;
		if (this.aClass76_4228 == null) {
			var5 = 0;
			var6 = 0;
		} else {
			var6 = this.aClass76_4228.method856();
			var5 = this.aClass76_4228.method857();
		}
		int var8 = arg0 >= 0 ? arg0 : 0;
		int var10 = arg2 <= var6 ? arg2 : var6;
		int var9 = arg1 >= 0 ? arg1 : 0;
		int var11 = arg3 <= var5 ? arg3 : var5;
		boolean var7 = false;
		if (this.anInt8610 < var8) {
			this.anInt8610 = var8;
			var7 = true;
		}
		if (this.anInt8447 > var10) {
			this.anInt8447 = var10;
			var7 = true;
		}
		if (this.anInt8521 < var9) {
			this.anInt8521 = var9;
			var7 = true;
		}
		if (this.anInt8506 > var11) {
			this.anInt8506 = var11;
			var7 = true;
		}
		if (!var7) {
			return;
		}
		if (!this.aBoolean8612 && (this.aBoolean8555 || this.method4903() == Class161.aClass161_1688)) {
			this.aBoolean8612 = true;
			this.method4914();
		}
		this.method4913();
	}

	@ObfuscatedName("Class_ra_Sub2.ds()V")
	public final void ds() {
		this.aClass180_8470.method2059();
	}

	@ObfuscatedName("Class_ra_Sub2.bx(I)LClass_v;")
	public final Class_v bx(int arg0) {
		Class_v_Sub1 var2 = new Class_v_Sub1(arg0);
		this.aClass471_8464.method5878(var2, (short) 8192);
		return var2;
	}

	@ObfuscatedName("Class_ra_Sub2.bm(LClass_v;)V")
	public final void bm(Class_v arg0) {
		this.aNativeHeap8463 = ((Class_v_Sub1) arg0).aNativeHeap9856;
	}

	public final NativeHeapBuffer method4908(int arg0, boolean arg1) {
		return this.aNativeHeap8463.j(arg0, arg1);
	}

	public final Interface9_Impl2 method4909(int arg0) {
		if (this.anInterface9_Impl2_8559.method93() < arg0 * 2) {
			this.anInterface9_Impl2_8559.method148(arg0);
		}
		return this.anInterface9_Impl2_8559;
	}

	@ObfuscatedName("Class_ra_Sub2.za()I")
	public final int za() {
		return this.anInt8466 + this.anInt8465 + this.anInt8480;
	}

	@ObfuscatedName("Class_ra_Sub2.bn(IIZZ)LClass61;")
	public final Class61 bn(int arg0, int arg1, boolean arg2, boolean arg3) {
		return new Class61_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("Class_ra_Sub2.bw(LClass87;Z)LClass61;")
	public final Class61 bw(Class87 arg0, boolean arg1) {
		Class61 var3;
		if (arg0.method986() == 0 || arg0.method994() == 0) {
			var3 = this.method4795(new int[] { 0 }, 0, 1, 1, 1, (byte) -70);
		} else {
			int[] var4 = arg0.method1031(false);
			var3 = this.method4795(var4, 0, arg0.method986(), arg0.method986(), arg0.method994(), (byte) -78);
		}
		var3.method717(arg0.method983(), arg0.method990(), arg0.method989(), arg0.method991());
		return var3;
	}

	@ObfuscatedName("Class_ra_Sub2.bu([IIIIIZ)LClass61;")
	public final Class61 bu(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		return new Class61_Sub1(this, arg3, arg4, arg0, arg1, arg2);
	}

	@ObfuscatedName("Class_ra_Sub2.bj(IIIIZ)LClass61;")
	public final Class61 bj(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		Class61_Sub1 var6 = new Class61_Sub1(this, arg2, arg3, arg4, false);
		var6.method737(0, 0, arg2, arg3, arg0, arg1);
		return var6;
	}

	@ObfuscatedName("Class_ra_Sub2.ce(LClass524;[LClass87_Sub2;Z)LClass263;")
	public final Class263 ce(Class524 arg0, Class87_Sub2[] arg1, boolean arg2) {
		return new Class263_Sub5(this, arg0, arg1, arg2);
	}

	@ObfuscatedName("Class_ra_Sub2.ch(II[I[I)LClass_ta;")
	public final Class_ta ch(int arg0, int arg1, int[] arg2, int[] arg3) {
		return Class_ta_Sub1.method5682(this, arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("Class_ra_Sub2.jq(ILClass77;)V")
	public final void jq(int arg0, Class77 arg1) {
		if (!this.aBoolean8571) {
			throw new RuntimeException("");
		}
		this.anInt8573 = arg0;
		this.aClass77_8456 = arg1;
		if (this.aBoolean8572) {
			this.aClass164Array8558[3].method1930();
			this.aClass164Array8558[3].method1929();
		}
	}

	@ObfuscatedName("Class_ra_Sub2.di()V")
	public void di() {
		if (this.aBoolean8589) {
			return;
		}
		this.method4998();
		this.aClass188_8552.method2096();
		for (Class330 var1 = this.aClass471_8464.method5869(539664854); var1 != null; var1 = this.aClass471_8464.method5873((byte) -119)) {
			((Class_v_Sub1) var1).method3872();
		}
		Class95_Sub12.method1137(false, true, 85010205);
		int var2;
		for (var2 = 0; var2 < this.aClass164Array8558.length; var2++) {
			if (this.aClass164Array8558[var2] != null) {
				this.aClass164Array8558[var2].method1932();
				this.aClass164Array8558[var2] = null;
			}
		}
		for (var2 = 0; var2 < this.aClass192Array8569.length; var2++) {
			if (this.aClass192Array8569[var2] != null) {
				this.aClass192Array8569[var2].method2122();
				this.aClass192Array8569[var2] = null;
			}
		}
		this.method4884();
		this.g(0);
		this.aBoolean8589 = true;
	}

	@ObfuscatedName("Class_ra_Sub2.ct(II)I")
	public final int ct(int arg0, int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@ObfuscatedName("Class_ra_Sub2.cd(II)I")
	public final int cd(int arg0, int arg1) {
		return arg0 | arg1;
	}

	@ObfuscatedName("Class_ra_Sub2.cn(II[[I[[IIII)LClass_xa;")
	public final Class_xa cn(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
		return new Class_xa_Sub2(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("Class_ra_Sub2.cz()LClass249;")
	public final Class249 cz() {
		return this.aClass249_8579;
	}

	public final void method4910() {
		this.anInterface11Array8549 = new Interface11[this.anInt8592];
		this.aClass249Array8545 = new Class249[this.anInt8592];
		this.aClass181Array8509 = new Class181[this.anInt8592];
		this.aClass179Array8547 = new Class179[this.anInt8592];
		this.aClass179Array8548 = new Class179[this.anInt8592];
		for (int var1 = 0; var1 < this.anInt8592; var1++) {
			this.aClass179Array8548[var1] = Class179.aClass179_1757;
			this.aClass179Array8547[var1] = Class179.aClass179_1757;
			this.aClass181Array8509[var1] = Class181.aClass181_1784;
			this.aClass249Array8545[var1] = new Class249();
		}
		this.aClass330_Sub14Array8607 = new Class330_Sub14[this.anInt8593 - 2];
		int[] var3 = new int[] { -1 };
		this.anInterface11_Impl3_8551 = this.method4950(1, 1, false, var3, 0, 0);
		var3[0] = -16777216;
		this.anInterface11_Impl3_8503 = this.method4950(1, 1, false, var3, 0, 0);
		this.bm(new Class_v_Sub1(262144));
		this.aClass184_8606 = this.method4977(new Class193[] { new Class193(new Class191[] { Class191.aClass191_1863, Class191.aClass191_1864 }) });
		this.method4977(new Class193[] { new Class193(new Class191[] { Class191.aClass191_1863, Class191.aClass191_1862 }) });
		this.aClass184_8605 = this.method4977(new Class193[] { new Class193(Class191.aClass191_1863), new Class193(Class191.aClass191_1862), new Class193(Class191.aClass191_1864), new Class193(Class191.aClass191_1872) });
		this.aClass184_8604 = this.method4977(new Class193[] { new Class193(Class191.aClass191_1863), new Class193(Class191.aClass191_1862), new Class193(Class191.aClass191_1864) });
		for (int var2 = 0; var2 < 7; var2++) {
			this.aClass387_Sub1Array8534[var2] = new Class387_Sub1(this, 0, 0, false, false);
			this.aClass387_Sub1Array8609[var2] = new Class387_Sub1(this, 0, 0, true, true);
		}
		this.method5039();
		this.anInterface9_Impl2_8559 = this.method4975(true);
		this.method4895();
		this.ag();
		this.L();
		this.am();
		this.aClass61_Sub1_8553 = new Class61_Sub1(this, this.anInterface11_Impl3_8551);
		this.aClass61_Sub1_8554 = new Class61_Sub1(this, this.anInterface11_Impl3_8503);
		this.ba(3, 0);
	}

	@ObfuscatedName("Class_ra_Sub2.cl(IIIIII)LClass92;")
	public final Class92 cl(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return new Class92_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("Class_ra_Sub2.cf(LClass92;)V")
	public final void cf(Class92 arg0) {
		this.aClass92_Sub1_8570 = (Class92_Sub1) arg0;
	}

	@ObfuscatedName("Class_ra_Sub2.ht(IIIIZ)LClass61;")
	public final Class61 ht(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		Class61_Sub1 var6 = new Class61_Sub1(this, arg2, arg3, arg4, false);
		var6.method737(0, 0, arg2, arg3, arg0, arg1);
		return var6;
	}

	@ObfuscatedName("Class_ra_Sub2.ae(IIII)V")
	public void ae(int arg0, int arg1, int arg2, int arg3) {
		this.anInt8597 = arg0;
		this.anInt8510 = arg1;
		this.anInt8511 = arg2;
		this.anInt8512 = arg3;
		this.method5018();
	}

	@ObfuscatedName("Class_ra_Sub2.GA(FF)V")
	public void GA(float arg0, float arg1) {
		this.aFloat8608 = arg0;
		this.aFloat8457 = arg1;
		this.method5018();
	}

	@ObfuscatedName("Class_ra_Sub2.qa([I)V")
	public final void qa(int[] arg0) {
		arg0[0] = this.anInt8610;
		arg0[1] = this.anInt8521;
		arg0[2] = this.anInt8447;
		arg0[3] = this.anInt8506;
	}

	@ObfuscatedName("Class_ra_Sub2.L()V")
	public final void L() {
		if (this.aClass76_4228 == null) {
			this.anInt8506 = 0;
			this.anInt8447 = 0;
			this.anInt8521 = 0;
			this.anInt8610 = 0;
		} else {
			this.anInt8521 = 0;
			this.anInt8610 = 0;
			this.anInt8447 = this.aClass76_4228.method856();
			this.anInt8506 = this.aClass76_4228.method857();
		}
		if (this.aBoolean8612) {
			this.aBoolean8612 = false;
			this.method4914();
		}
	}

	@ObfuscatedName("Class_ra_Sub2.ke()V")
	public final void ke() {
		if (this.aClass76_4228 == null) {
			this.anInt8506 = 0;
			this.anInt8447 = 0;
			this.anInt8521 = 0;
			this.anInt8610 = 0;
		} else {
			this.anInt8521 = 0;
			this.anInt8610 = 0;
			this.anInt8447 = this.aClass76_4228.method856();
			this.anInt8506 = this.aClass76_4228.method857();
		}
		if (this.aBoolean8612) {
			this.aBoolean8612 = false;
			this.method4914();
		}
	}

	@ObfuscatedName("Class_ra_Sub2.o(IIII)V")
	public final void o(int arg0, int arg1, int arg2, int arg3) {
		int var5;
		int var6;
		if (this.aClass76_4228 == null) {
			var5 = 0;
			var6 = 0;
		} else {
			var6 = this.aClass76_4228.method856();
			var5 = this.aClass76_4228.method857();
		}
		int var8 = arg0 >= 0 ? arg0 : 0;
		int var10 = arg2 <= var6 ? arg2 : var6;
		int var9 = arg1 >= 0 ? arg1 : 0;
		int var11 = arg3 <= var5 ? arg3 : var5;
		boolean var7 = false;
		if (this.anInt8610 < var8) {
			this.anInt8610 = var8;
			var7 = true;
		}
		if (this.anInt8447 > var10) {
			this.anInt8447 = var10;
			var7 = true;
		}
		if (this.anInt8521 < var9) {
			this.anInt8521 = var9;
			var7 = true;
		}
		if (this.anInt8506 > var11) {
			this.anInt8506 = var11;
			var7 = true;
		}
		if (!var7) {
			return;
		}
		if (!this.aBoolean8612 && (this.aBoolean8555 || this.method4903() == Class161.aClass161_1688)) {
			this.aBoolean8612 = true;
			this.method4914();
		}
		this.method4913();
	}

	public void method4911() {
		if (this.aClass187_8556 != null) {
			this.aClass187_8556.method2090();
		}
	}

	public final Class249 method4915() {
		return this.aClass174_8483 == Class174.aClass174_1735 ? this.aClass249_8472 : aClass249_8508;
	}

	public final Class249 method4916() {
		return this.aClass174_8483 == Class174.aClass174_1735 ? this.aClass249_8473 : aClass249_8508;
	}

	@ObfuscatedName("Class_ra_Sub2.cw(LClass247;)V")
	public final void cw(Class247 arg0) {
		this.aClass247_8524 = arg0;
		this.aClass249_8472.method2508(this.aClass247_8524);
		this.aClass247_8596.method2454(arg0);
		this.aClass247_8596.method2459();
		this.aClass249_8473.method2508(this.aClass247_8596);
		this.method4918();
		if (this.aClass174_8483 == Class174.aClass174_1735) {
			this.method4919();
		}
	}

	@ObfuscatedName("Class_ra_Sub2.cq()LClass247;")
	public Class247 cq() {
		return this.aClass247_8524;
	}

	public final void method4918() {
		this.aClass249_8492.method2510(this.aClass249_8472);
		this.aClass249_8492.method2483(this.aClass249_8488);
		this.aClass249_8492.method2499(this.aFloatArrayArray8494[0]);
		this.aClass249_8492.method2500(this.aFloatArrayArray8494[1]);
		this.aClass249_8492.method2497(this.aFloatArrayArray8494[2]);
		this.aClass249_8492.method2515(this.aFloatArrayArray8494[3]);
		this.aClass249_8492.method2512(this.aFloatArrayArray8494[4]);
		this.aClass249_8492.method2498(this.aFloatArrayArray8494[5]);
		this.aClass249_8493.method2510(this.aClass249_8492);
		this.method5103(this.aClass249_8493);
	}

	@ObfuscatedName("Class_ra_Sub2.cs()LClass249;")
	public final Class249 cs() {
		return this.aClass249_8488;
	}

	public final void method4919() {
		this.aBoolean8482 = false;
	}

	public Class249 method4920() {
		if (this.aClass174_8483 == Class174.aClass174_1735) {
			if (!this.aBoolean8482) {
				this.method4972();
			}
			return this.aClass249_8475;
		} else {
			return this.aClass249_8469;
		}
	}

	public final Class249 method4921() {
		return this.aClass249_8493;
	}

	public final Class249 method4922() {
		return this.aClass249_8491;
	}

	public final void method4924() {
		if (this.aClass174_8483 == Class174.aClass174_1736) {
			return;
		}
		Class174 var1 = this.aClass174_8483;
		this.aClass174_8483 = Class174.aClass174_1736;
		if (var1 == Class174.aClass174_1735) {
			this.method4919();
		}
		this.aClass249_8577 = this.aClass249_8477;
		this.method4930();
		this.method5018();
		this.anInt8540 &= 0xFFFFFFF0;
	}

	public final void method4925() {
		if (this.aClass174_8483 == Class174.aClass174_1737) {
			return;
		}
		Class174 var1 = this.aClass174_8483;
		this.aClass174_8483 = Class174.aClass174_1737;
		if (var1 == Class174.aClass174_1735) {
			this.method4919();
		}
		this.method5085();
		this.aClass249_8577 = this.aClass249_8485;
		this.method4930();
		this.method5018();
		this.anInt8540 &= 0xFFFFFFF7;
	}

	@ObfuscatedName("Class_ra_Sub2.fg(IIII)V")
	public final void fg(int arg0, int arg1, int arg2, int arg3) {
		int var5;
		int var6;
		if (this.aClass76_4228 == null) {
			var5 = 0;
			var6 = 0;
		} else {
			var6 = this.aClass76_4228.method856();
			var5 = this.aClass76_4228.method857();
		}
		if (arg0 <= 0 && arg2 >= var6 - 1 && arg1 <= 0 && arg3 >= var5 - 1) {
			this.L();
			return;
		}
		this.anInt8610 = arg0 >= 0 ? arg0 : 0;
		this.anInt8447 = arg2 <= var6 ? arg2 : var6;
		this.anInt8521 = arg1 >= 0 ? arg1 : 0;
		this.anInt8506 = arg3 <= var5 ? arg3 : var5;
		if (!this.aBoolean8612 && (this.aBoolean8555 || this.method4903() == Class161.aClass161_1688)) {
			this.aBoolean8612 = true;
			this.method4914();
		}
		this.method4913();
	}

	public final void method4929() {
		if (!this.aBoolean8487) {
			this.aBoolean8487 = true;
		}
	}

	public final void method4930() {
		this.aClass249_8491.method2510(this.aClass249_8577);
		this.method5103(this.aClass249_8491);
		this.aFloat8504 = (this.aClass249_8491.aFloatArray2631[14] - this.aClass249_8491.aFloatArray2631[15]) / (this.aClass249_8491.aFloatArray2631[11] - this.aClass249_8491.aFloatArray2631[10]);
		this.aFloat8471 = -this.aClass249_8491.aFloatArray2631[14] / this.aClass249_8491.aFloatArray2631[10];
		this.method5015();
	}

	@ObfuscatedName("Class_ra_Sub2.RA(Z)V")
	public final void RA(boolean arg0) {
		this.aBoolean8519 = arg0;
		this.method4933();
	}

	@ObfuscatedName("Class_ra_Sub2.u()V")
	public void u() {
		if (this.aBoolean8589) {
			return;
		}
		this.method4998();
		this.aClass188_8552.method2096();
		for (Class330 var1 = this.aClass471_8464.method5869(539664854); var1 != null; var1 = this.aClass471_8464.method5873((byte) -68)) {
			((Class_v_Sub1) var1).method3872();
		}
		Class95_Sub12.method1137(false, true, -1141041502);
		int var2;
		for (var2 = 0; var2 < this.aClass164Array8558.length; var2++) {
			if (this.aClass164Array8558[var2] != null) {
				this.aClass164Array8558[var2].method1932();
				this.aClass164Array8558[var2] = null;
			}
		}
		for (var2 = 0; var2 < this.aClass192Array8569.length; var2++) {
			if (this.aClass192Array8569[var2] != null) {
				this.aClass192Array8569[var2].method2122();
				this.aClass192Array8569[var2] = null;
			}
		}
		this.method4884();
		this.g(0);
		this.aBoolean8589 = true;
	}

	public void method_do(float arg0, float arg1, float arg2, float[] arg3) {
		float var5 = this.aClass249_8492.aFloatArray2631[15] + this.aClass249_8492.aFloatArray2631[3] * arg0 + this.aClass249_8492.aFloatArray2631[7] * arg1 + this.aClass249_8492.aFloatArray2631[11] * arg2;
		float var6 = this.aClass249_8492.aFloatArray2631[12] + this.aClass249_8492.aFloatArray2631[0] * arg0 + this.aClass249_8492.aFloatArray2631[4] * arg1 + this.aClass249_8492.aFloatArray2631[8] * arg2;
		float var7 = this.aClass249_8492.aFloatArray2631[13] + this.aClass249_8492.aFloatArray2631[1] * arg0 + this.aClass249_8492.aFloatArray2631[5] * arg1 + this.aClass249_8492.aFloatArray2631[9] * arg2;
		float var8 = this.aClass249_8472.aFloatArray2631[14] + this.aClass249_8472.aFloatArray2631[2] * arg0 + this.aClass249_8472.aFloatArray2631[6] * arg1 + this.aClass249_8472.aFloatArray2631[10] * arg2;
		arg3[0] = this.aFloat8495 + this.aFloat8505 * var6 / var5;
		arg3[1] = this.aFloat8497 + this.aFloat8498 * var7 / var5;
		arg3[2] = var8;
	}

	@ObfuscatedName("Class_ra_Sub2.bp(IIIIII)I")
	public int bp(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 0;
		float var8 = this.aClass249_8492.aFloatArray2631[14] + this.aClass249_8492.aFloatArray2631[2] * (float) arg0 + this.aClass249_8492.aFloatArray2631[6] * (float) arg1 + this.aClass249_8492.aFloatArray2631[10] * (float) arg2;
		float var9 = this.aClass249_8492.aFloatArray2631[14] + this.aClass249_8492.aFloatArray2631[2] * (float) arg3 + this.aClass249_8492.aFloatArray2631[6] * (float) arg4 + this.aClass249_8492.aFloatArray2631[10] * (float) arg5;
		float var10 = this.aClass249_8492.aFloatArray2631[15] + this.aClass249_8492.aFloatArray2631[3] * (float) arg0 + this.aClass249_8492.aFloatArray2631[7] * (float) arg1 + this.aClass249_8492.aFloatArray2631[11] * (float) arg2;
		float var11 = this.aClass249_8492.aFloatArray2631[15] + this.aClass249_8492.aFloatArray2631[3] * (float) arg3 + this.aClass249_8492.aFloatArray2631[7] * (float) arg4 + this.aClass249_8492.aFloatArray2631[11] * (float) arg5;
		if (var8 < -var10 && var9 < -var11) {
			var7 |= 0x10;
		} else if (var8 > var10 && var9 > var11) {
			var7 |= 0x20;
		}
		float var12 = this.aClass249_8492.aFloatArray2631[12] + this.aClass249_8492.aFloatArray2631[0] * (float) arg0 + this.aClass249_8492.aFloatArray2631[4] * (float) arg1 + this.aClass249_8492.aFloatArray2631[8] * (float) arg2;
		float var13 = this.aClass249_8492.aFloatArray2631[12] + this.aClass249_8492.aFloatArray2631[0] * (float) arg3 + this.aClass249_8492.aFloatArray2631[4] * (float) arg4 + this.aClass249_8492.aFloatArray2631[8] * (float) arg5;
		if (var12 < -var10 && var13 < -var11) {
			var7 |= 0x1;
		}
		if (var12 > var10 && var13 > var11) {
			var7 |= 0x2;
		}
		float var14 = this.aClass249_8492.aFloatArray2631[13] + this.aClass249_8492.aFloatArray2631[1] * (float) arg0 + this.aClass249_8492.aFloatArray2631[5] * (float) arg1 + this.aClass249_8492.aFloatArray2631[9] * (float) arg2;
		float var15 = this.aClass249_8492.aFloatArray2631[13] + this.aClass249_8492.aFloatArray2631[1] * (float) arg3 + this.aClass249_8492.aFloatArray2631[5] * (float) arg4 + this.aClass249_8492.aFloatArray2631[9] * (float) arg5;
		if (var14 < -var10 && var15 < -var11) {
			var7 |= 0x4;
		}
		if (var14 > var10 && var15 > var11) {
			var7 |= 0x8;
		}
		return var7;
	}

	@ObfuscatedName("Class_ra_Sub2.cr()I")
	public final int cr() {
		return this.anInt8593 - 2;
	}

	@ObfuscatedName("Class_ra_Sub2.ck(I[LClass330_Sub14;)V")
	public final void ck(int arg0, Class330_Sub14[] arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			this.aClass330_Sub14Array8607[var3] = arg1[var3];
		}
		this.anInt8538 = arg0;
		if (this.aClass174_8483 == Class174.aClass174_1735) {
			this.method5007();
		}
	}

	public void method4935() {
		if (this.aClass187_8556 != null) {
			this.aClass187_8556.method2085();
		}
	}

	@ObfuscatedName("Class_ra_Sub2.m(IFFFFF)V")
	public final void m(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		boolean var7 = this.anInt8529 != arg0;
		if (var7 || this.aFloat8489 != arg1 || this.aFloat8535 != arg2) {
			this.anInt8529 = arg0;
			this.aFloat8489 = arg1;
			this.aFloat8535 = arg2;
			if (var7) {
				this.aFloat8530 = (float) (this.anInt8529 & 0xFF0000) / 1.671168E7F;
				this.aFloat8500 = (float) (this.anInt8529 & 0xFF00) / 65280.0F;
				this.aFloat8532 = (float) (this.anInt8529 & 0xFF) / 255.0F;
				this.method4937();
			}
			this.method4938();
		}
		if (this.aFloatArray8462[0] != arg3 || this.aFloatArray8462[1] != arg4 || this.aFloatArray8462[2] != arg5) {
			this.aFloatArray8462[0] = arg3;
			this.aFloatArray8462[1] = arg4;
			this.aFloatArray8462[2] = arg5;
			this.aFloatArray8528[0] = -arg3;
			this.aFloatArray8528[1] = -arg4;
			this.aFloatArray8528[2] = -arg5;
			float var8 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray8525[0] = arg3 * var8;
			this.aFloatArray8525[1] = arg4 * var8;
			this.aFloatArray8525[2] = arg5 * var8;
			this.aFloatArray8451[0] = -this.aFloatArray8525[0];
			this.aFloatArray8451[1] = -this.aFloatArray8525[1];
			this.aFloatArray8451[2] = -this.aFloatArray8525[2];
			this.method4959();
			this.anInt8541 = (int) (arg3 * 256.0F / arg4);
			this.anInt8599 = (int) (arg5 * 256.0F / arg4);
		}
		this.method4939();
	}

	@ObfuscatedName("Class_ra_Sub2.J(I)V")
	public final void J(int arg0) {
		this.anInt8536 = 0;
		while (arg0 > 1) {
			this.anInt8536++;
			arg0 >>= 0x1;
		}
		this.anInt8539 = 0x1 << this.anInt8536;
	}

	@ObfuscatedName("Class_ra_Sub2.v()Z")
	public final boolean v() {
		return this.aClass192Array8569[1] != null;
	}

	public byte[] method4942(String arg0, String arg1) {
		return this.aClass280_8527.method2780(arg0, arg1);
	}

	public final void method4943() {
		if (this.anInt8540 == 2) {
			return;
		}
		this.method4925();
		this.method4882(false);
		this.method4995(false);
		this.method5005(false);
		this.method4962(false);
		this.anInt8540 = 2;
	}

	public final Interface11_Impl3 method4944(int arg0, int arg1, boolean arg2, int[] arg3) {
		return this.method4950(arg0, arg1, arg2, arg3, 0, 0);
	}

	public final Interface11_Impl3 method4945(Class72 arg0, int arg1, int arg2, boolean arg3, byte[] arg4) {
		return this.method4948(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	public final Interface11_Impl3 method4946(Class72 arg0, int arg1, int arg2, boolean arg3, float[] arg4) {
		return this.method4949(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	public final int method4954() {
		return this.anInt8543;
	}

	public final void method4955(int arg0) {
		if (this.anInt8543 != arg0) {
			this.anInt8543 = arg0;
			this.method4988();
		}
	}

	public final void method4956(Interface11 arg0) {
		if (this.anInterface11Array8549[this.anInt8543] == arg0) {
			return;
		}
		this.anInterface11Array8549[this.anInt8543] = arg0;
		if (arg0 == null) {
			this.anInterface11_Impl3_8551.method166();
		} else {
			arg0.method166();
		}
		this.anInt8540 &= 0xFFFFFFFE;
	}

	public void method4787(boolean arg0) {
		this.aBoolean8555 = arg0;
	}

	public final void method4958(Class179 arg0, Class179 arg1) {
		boolean var3 = false;
		if (this.aClass179Array8547[this.anInt8543] != arg0) {
			this.aClass179Array8547[this.anInt8543] = arg0;
			this.method5053();
			var3 = true;
		}
		if (this.aClass179Array8548[this.anInt8543] != arg1) {
			this.aClass179Array8548[this.anInt8543] = arg1;
			this.method4968();
			var3 = true;
		}
		if (var3) {
			this.anInt8540 &= 0xFFFFFFF2;
		}
	}

	public final void method4961(int arg0, Class175 arg1) {
		this.method4927(arg0, arg1, false);
	}

	@ObfuscatedName("Class_ra_Sub2.hf(IIIIZ)LClass61;")
	public final Class61 hf(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		Class61_Sub1 var6 = new Class61_Sub1(this, arg2, arg3, arg4, false);
		var6.method737(0, 0, arg2, arg3, arg0, arg1);
		return var6;
	}

	public final void method4962(boolean arg0) {
		if (arg0 != this.aBoolean8454) {
			this.aBoolean8454 = arg0;
			this.method4933();
			this.anInt8540 &= 0xFFFFFFF0;
		}
	}

	@ObfuscatedName("Class_ra_Sub2.hn(I)V")
	public final void hn(int arg0) {
	}

	public final Class249 method4963() {
		return this.aClass249Array8545[this.anInt8543];
	}

	public final void method4964(Class181 arg0) {
		this.aClass181Array8509[this.anInt8543] = arg0;
		this.method4966();
	}

	public final void method4965() {
		if (this.aClass181Array8509[this.anInt8543] != Class181.aClass181_1784) {
			this.aClass181Array8509[this.anInt8543] = Class181.aClass181_1784;
			this.aClass249Array8545[this.anInt8543].method2516();
			this.method4966();
		}
	}

	public final void method4966() {
		this.method5076();
	}

	@ObfuscatedName("Class_ra_Sub2.dr(FFF[F)V")
	public void dr(float arg0, float arg1, float arg2, float[] arg3) {
		float var5 = this.aClass249_8492.aFloatArray2631[14] + this.aClass249_8492.aFloatArray2631[2] * arg0 + this.aClass249_8492.aFloatArray2631[6] * arg1 + this.aClass249_8492.aFloatArray2631[10] * arg2;
		float var6 = this.aClass249_8492.aFloatArray2631[15] + this.aClass249_8492.aFloatArray2631[3] * arg0 + this.aClass249_8492.aFloatArray2631[7] * arg1 + this.aClass249_8492.aFloatArray2631[11] * arg2;
		if (var5 < -var6 || var5 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		float var7 = this.aClass249_8492.aFloatArray2631[12] + this.aClass249_8492.aFloatArray2631[0] * arg0 + this.aClass249_8492.aFloatArray2631[4] * arg1 + this.aClass249_8492.aFloatArray2631[8] * arg2;
		if (var7 < -var6 || var7 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		float var8 = this.aClass249_8492.aFloatArray2631[13] + this.aClass249_8492.aFloatArray2631[1] * arg0 + this.aClass249_8492.aFloatArray2631[5] * arg1 + this.aClass249_8492.aFloatArray2631[9] * arg2;
		if (var8 < -var6 || var8 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			float var9 = this.aClass249_8472.aFloatArray2631[14] + this.aClass249_8472.aFloatArray2631[2] * arg0 + this.aClass249_8472.aFloatArray2631[6] * arg1 + this.aClass249_8472.aFloatArray2631[10] * arg2;
			arg3[0] = this.aFloat8495 + this.aFloat8505 * var7 / var6;
			arg3[1] = this.aFloat8497 + this.aFloat8498 * var8 / var6;
			arg3[2] = var9;
		}
	}

	@ObfuscatedName("Class_ra_Sub2.y()Z")
	public final boolean y() {
		return true;
	}

	public Class77 method4969() {
		return this.aClass77_8456;
	}

	@ObfuscatedName("Class_ra_Sub2.dz(ILClass77;)V")
	public final void dz(int arg0, Class77 arg1) {
		if (!this.aBoolean8571) {
			throw new RuntimeException("");
		}
		this.anInt8573 = arg0;
		this.aClass77_8456 = arg1;
		if (this.aBoolean8572) {
			this.aClass164Array8558[3].method1930();
			this.aClass164Array8558[3].method1929();
		}
	}

	@ObfuscatedName("Class_ra_Sub2.ju(FFFFFF)V")
	public final void ju(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		Class192_Sub1.aFloat7341 = arg0;
		Class192_Sub1.aFloat7340 = arg1;
		Class192_Sub1.aFloat7339 = arg2;
		Class192_Sub1.aFloat7342 = arg5;
	}

	public final void method4970(int arg0) {
		if (this.anInt8582 == arg0) {
			return;
		}
		Class176 var2;
		boolean var3;
		boolean var4;
		if (arg0 == 1) {
			var2 = Class176.aClass176_1745;
			var3 = true;
			var4 = true;
		} else if (arg0 == 2) {
			var2 = Class176.aClass176_1744;
			var3 = false;
			var4 = true;
		} else if (arg0 == 128) {
			var2 = Class176.aClass176_1743;
			var3 = true;
			var4 = true;
		} else {
			var2 = Class176.aClass176_1747;
			var3 = false;
			var4 = false;
		}
		if (var3 != this.aBoolean8585) {
			this.aBoolean8585 = var3;
			this.method4973();
		}
		if (var4 != this.aBoolean8546) {
			this.aBoolean8546 = var4;
			this.method5112();
		}
		if (var2 != this.aClass176_8583) {
			this.aClass176_8583 = var2;
			this.method5014();
		}
		this.anInt8582 = arg0;
		this.anInt8540 &= 0xFFFFFFF3;
	}

	public final void method4971(int arg0) {
		if (this.anInt8613 != arg0) {
			this.anInt8613 = arg0;
			this.method5014();
		}
	}

	public Class247 method4972() {
		if (this.aClass174_8483 != Class174.aClass174_1735) {
			return this.aClass247_8468;
		}
		if (!this.aBoolean8482) {
			this.aClass247_8584.method2454(this.aClass247_8468);
			this.aClass247_8584.method2467(this.aClass247_8524);
			this.aClass249_8475.method2508(this.aClass247_8584);
			this.aBoolean8482 = true;
		}
		return this.aClass247_8584;
	}

	@ObfuscatedName("Class_ra_Sub2.is(LClass92;)V")
	public final void is(Class92 arg0) {
		this.aClass92_Sub1_8570 = (Class92_Sub1) arg0;
	}

	@ObfuscatedName("Class_ra_Sub2.gb(IIIIII[BII)V")
	public final void gb(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
	}

	@ObfuscatedName("Class_ra_Sub2.gl(IIIII)V")
	public final void gl(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.br(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@ObfuscatedName("Class_ra_Sub2.jl(FFF[F)V")
	public void jl(float arg0, float arg1, float arg2, float[] arg3) {
		float var5 = this.aClass249_8492.aFloatArray2631[14] + this.aClass249_8492.aFloatArray2631[2] * arg0 + this.aClass249_8492.aFloatArray2631[6] * arg1 + this.aClass249_8492.aFloatArray2631[10] * arg2;
		float var6 = this.aClass249_8492.aFloatArray2631[15] + this.aClass249_8492.aFloatArray2631[3] * arg0 + this.aClass249_8492.aFloatArray2631[7] * arg1 + this.aClass249_8492.aFloatArray2631[11] * arg2;
		if (var5 < -var6 || var5 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		float var7 = this.aClass249_8492.aFloatArray2631[12] + this.aClass249_8492.aFloatArray2631[0] * arg0 + this.aClass249_8492.aFloatArray2631[4] * arg1 + this.aClass249_8492.aFloatArray2631[8] * arg2;
		if (var7 < -var6 || var7 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		float var8 = this.aClass249_8492.aFloatArray2631[13] + this.aClass249_8492.aFloatArray2631[1] * arg0 + this.aClass249_8492.aFloatArray2631[5] * arg1 + this.aClass249_8492.aFloatArray2631[9] * arg2;
		if (var8 < -var6 || var8 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			float var9 = this.aClass249_8472.aFloatArray2631[14] + this.aClass249_8472.aFloatArray2631[2] * arg0 + this.aClass249_8472.aFloatArray2631[6] * arg1 + this.aClass249_8472.aFloatArray2631[10] * arg2;
			arg3[0] = this.aFloat8495 + this.aFloat8505 * var7 / var6;
			arg3[1] = this.aFloat8497 + this.aFloat8498 * var8 / var6;
			arg3[2] = var9;
		}
	}

	@ObfuscatedName("Class_ra_Sub2.DA(ILClass_ta;II)V")
	public final void DA(int arg0, Class_ta arg1, int arg2, int arg3) {
		this.RA(false);
		this.aClass61_Sub1_8554.method703(0.0F, 0.0F, (float) this.method4782((byte) 0).method856(), 0.0F, 0.0F, (float) this.method4782((byte) 0).method857(), 0, arg1, arg2, arg3);
		this.RA(true);
	}

	@ObfuscatedName("Class_ra_Sub2.B(IIIIII)V")
	public final void B(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (this.aBoolean8519) {
			this.RA(false);
			this.aClass61_Sub1_8553.method691(arg0, arg1, arg2, arg3, 0, arg4, arg5);
			this.RA(true);
		} else {
			this.aClass61_Sub1_8553.method691(arg0, arg1, arg2, arg3, 0, arg4, arg5);
		}
	}

	@ObfuscatedName("Class_ra_Sub2.bl(IIIIII)V")
	public final void bl(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var8 = arg2 - 1;
		int var9 = arg3 - 1;
		byte var7 = 0;
		if (this instanceof Class_ra_Sub2_Sub1) {
			var7 = -1;
		}
		this.br(arg0, arg1 + var7, arg0 + var8, arg1 + var7, arg4, arg5);
		this.br(arg0, arg1 + var9 + var7, arg0 + var8, arg1 + var9 + var7, arg4, arg5);
		this.br(arg0, arg1, arg0, arg1 + var9, arg4, arg5);
		this.br(arg0 + var8, arg1, arg0 + var8, arg1 + var9, arg4, arg5);
	}

	@ObfuscatedName("Class_ra_Sub2.N(IIIIII[BII)V")
	public final void N(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
	}

	@ObfuscatedName("Class_ra_Sub2.bk(IIFIIFIIFIIII)V")
	public final void bk(int arg0, int arg1, float arg2, int arg3, int arg4, float arg5, int arg6, int arg7, float arg8, int arg9, int arg10, int arg11, int arg12) {
	}

	@ObfuscatedName("Class_ra_Sub2.CA(IIIII)V")
	public final void CA(int arg0, int arg1, int arg2, int arg3, int arg4) {
	}

	@ObfuscatedName("Class_ra_Sub2.XA(IIIII)V")
	public final void XA(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.br(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	public Class249 method4980() {
		return this.aClass249_8469;
	}

	@ObfuscatedName("Class_ra_Sub2.br(IIIIII)V")
	public final void br(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		this.by(arg0, arg1, arg2, arg3, arg4, 1, arg5);
	}

	@ObfuscatedName("Class_ra_Sub2.be(IIIIIILClass_ta;IIIII)V")
	public void be(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Class_ta arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
	}

	@ObfuscatedName("Class_ra_Sub2.bi(IIIIIILClass_ta;II)V")
	public final void bi(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Class_ta arg6, int arg7, int arg8) {
	}

	@ObfuscatedName("Class_ra_Sub2.by(IIIIIII)V")
	public final void by(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var14 = (int) ((float) arg0 + 1.0F);
		int var16 = (int) ((float) arg1 + 1.0F);
		int var18 = (int) ((float) arg2 + 1.0F);
		int var19 = (int) ((float) arg3 + 1.0F);
		float var8 = (float) (var18 - var14);
		float var9 = (float) (var19 - var16);
		float var10 = 1.0F / (float) Math.sqrt((double) (var8 * var8 + var9 * var9));
		float var20 = var8 * var10;
		float var21 = var9 * var10;
		int var15 = (int) ((float) var14 - var20);
		int var17 = (int) ((float) var16 - var21);
		float var11 = -var21;
		float var13 = var11 * 0.5F * (float) arg5;
		float var12 = var20 * 0.5F * (float) arg5;
		this.aClass61_Sub1_8553.method715((float) var15 - var13, (float) var17 - var12, (float) var18 - var13, (float) var19 - var12, (float) var15 + var13, (float) var17 + var12, 0, arg4, arg6);
	}

	@ObfuscatedName("Class_ra_Sub2.cm(LClass81;)V")
	public final void cm(Class81 arg0) {
		this.aClass186_8455.method2079(this, arg0);
	}

	public final void method4982() {
		this.method5081(0, this.anInterface9_Impl1_8587);
		this.method4978(this.aClass184_8602);
		this.method4898(Class199.aClass199_1930, 0, 1);
	}

	public final void method4983() {
		this.method4984(Class199.aClass199_1929, 2);
	}

	public final void method4984(Class199 arg0, int arg1) {
		this.method5081(0, this.anInterface9_Impl1_8600);
		this.method4978(this.aClass184_8603);
		this.method4898(arg0, 0, arg1);
	}

	public final void method4986() {
		this.anInterface9_Impl1_8587 = this.method4976(true);
		this.anInterface9_Impl1_8587.method142(24, 12);
		this.aClass184_8602 = this.method4977(new Class193[] { new Class193(Class191.aClass191_1863) });
	}

	@ObfuscatedName("Class_ra_Sub2.dd()V")
	public void dd() {
		if (this.aBoolean8589) {
			return;
		}
		this.method4998();
		this.aClass188_8552.method2096();
		for (Class330 var1 = this.aClass471_8464.method5869(539664854); var1 != null; var1 = this.aClass471_8464.method5873((byte) -24)) {
			((Class_v_Sub1) var1).method3872();
		}
		Class95_Sub12.method1137(false, true, 2006123752);
		int var2;
		for (var2 = 0; var2 < this.aClass164Array8558.length; var2++) {
			if (this.aClass164Array8558[var2] != null) {
				this.aClass164Array8558[var2].method1932();
				this.aClass164Array8558[var2] = null;
			}
		}
		for (var2 = 0; var2 < this.aClass192Array8569.length; var2++) {
			if (this.aClass192Array8569[var2] != null) {
				this.aClass192Array8569[var2].method2122();
				this.aClass192Array8569[var2] = null;
			}
		}
		this.method4884();
		this.g(0);
		this.aBoolean8589 = true;
	}

	@ObfuscatedName("Class_ra_Sub2.de()V")
	public void de() {
		if (this.aBoolean8589) {
			return;
		}
		this.method4998();
		this.aClass188_8552.method2096();
		for (Class330 var1 = this.aClass471_8464.method5869(539664854); var1 != null; var1 = this.aClass471_8464.method5873((byte) -21)) {
			((Class_v_Sub1) var1).method3872();
		}
		Class95_Sub12.method1137(false, true, 1332184512);
		int var2;
		for (var2 = 0; var2 < this.aClass164Array8558.length; var2++) {
			if (this.aClass164Array8558[var2] != null) {
				this.aClass164Array8558[var2].method1932();
				this.aClass164Array8558[var2] = null;
			}
		}
		for (var2 = 0; var2 < this.aClass192Array8569.length; var2++) {
			if (this.aClass192Array8569[var2] != null) {
				this.aClass192Array8569[var2].method2122();
				this.aClass192Array8569[var2] = null;
			}
		}
		this.method4884();
		this.g(0);
		this.aBoolean8589 = true;
	}

	@ObfuscatedName("Class_ra_Sub2.dn()V")
	public void dn() {
		if (this.aBoolean8589) {
			return;
		}
		this.method4998();
		this.aClass188_8552.method2096();
		for (Class330 var1 = this.aClass471_8464.method5869(539664854); var1 != null; var1 = this.aClass471_8464.method5873((byte) 7)) {
			((Class_v_Sub1) var1).method3872();
		}
		Class95_Sub12.method1137(false, true, 1566762825);
		int var2;
		for (var2 = 0; var2 < this.aClass164Array8558.length; var2++) {
			if (this.aClass164Array8558[var2] != null) {
				this.aClass164Array8558[var2].method1932();
				this.aClass164Array8558[var2] = null;
			}
		}
		for (var2 = 0; var2 < this.aClass192Array8569.length; var2++) {
			if (this.aClass192Array8569[var2] != null) {
				this.aClass192Array8569[var2].method2122();
				this.aClass192Array8569[var2] = null;
			}
		}
		this.method4884();
		this.g(0);
		this.aBoolean8589 = true;
	}

	public void method4796() {
		if (this.aClass187_8556 != null) {
			this.aClass187_8556.method2089();
		}
	}

	@ObfuscatedName("Class_ra_Sub2.dw(I)V")
	public void dw(int arg0) {
		if (this.aClass188_8552 != null) {
			this.aClass188_8552.method2097();
		}
		this.anInt8588 = arg0 & Integer.MAX_VALUE;
	}

	@ObfuscatedName("Class_ra_Sub2.fb(IIIIII[BII)V")
	public final void fb(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
	}

	@ObfuscatedName("Class_ra_Sub2.IA(F)V")
	public final void IA(float arg0) {
		if (this.aFloat8533 != arg0) {
			this.aFloat8533 = arg0;
			this.method4937();
			this.method4939();
		}
	}

	@ObfuscatedName("Class_ra_Sub2.er()Z")
	public final boolean er() {
		return true;
	}

	@ObfuscatedName("Class_ra_Sub2.ew()Z")
	public final boolean ew() {
		return true;
	}

	@ObfuscatedName("Class_ra_Sub2.el()Z")
	public final boolean el() {
		return true;
	}

	@ObfuscatedName("Class_ra_Sub2.ei()Z")
	public final boolean ei() {
		return true;
	}

	@ObfuscatedName("Class_ra_Sub2.fd(IIIIII)V")
	public final void fd(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (this.aBoolean8519) {
			this.RA(false);
			this.aClass61_Sub1_8553.method691(arg0, arg1, arg2, arg3, 0, arg4, arg5);
			this.RA(true);
		} else {
			this.aClass61_Sub1_8553.method691(arg0, arg1, arg2, arg3, 0, arg4, arg5);
		}
	}

	@ObfuscatedName("Class_ra_Sub2.ee()Z")
	public final boolean ee() {
		return true;
	}

	@ObfuscatedName("Class_ra_Sub2.ez()Z")
	public final boolean ez() {
		return true;
	}

	@ObfuscatedName("Class_ra_Sub2.ex()Z")
	public final boolean ex() {
		return true;
	}

	@ObfuscatedName("Class_ra_Sub2.ir(LClass249;)V")
	public final void ir(Class249 arg0) {
		this.aClass249_8488.method2510(arg0);
		this.method4918();
		if (this.aClass174_8483 == Class174.aClass174_1735) {
			this.method4930();
		}
	}

	@ObfuscatedName("Class_ra_Sub2.ep()Z")
	public final boolean ep() {
		return this.aBoolean8566;
	}

	public void method4993(Interface8 arg0) {
		this.aClass555_8446.method6396(arg0, anObject8520, (byte) -112);
	}

	@ObfuscatedName("Class_ra_Sub2.et()Z")
	public final boolean et() {
		return true;
	}

	@ObfuscatedName("Class_ra_Sub2.ey()Z")
	public final boolean ey() {
		return true;
	}

	@ObfuscatedName("Class_ra_Sub2.eq()Z")
	public final boolean eq() {
		return true;
	}

	@ObfuscatedName("Class_ra_Sub2.ek()Z")
	public final boolean ek() {
		return true;
	}

	public final void method4994(int arg0, int arg1) {
		this.anInt8517 = arg0;
		this.anInt8518 = arg1;
		this.method4912();
		this.method4913();
	}

	@ObfuscatedName("Class_ra_Sub2.eg()Z")
	public final boolean eg() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub2.fo(IIII)V")
	public void fo(int arg0, int arg1, int arg2, int arg3) {
		this.anInt8597 = arg0;
		this.anInt8510 = arg1;
		this.anInt8511 = arg2;
		this.anInt8512 = arg3;
		this.method5018();
	}

	@ObfuscatedName("Class_ra_Sub2.fj(IIII)V")
	public void fj(int arg0, int arg1, int arg2, int arg3) {
		this.anInt8597 = arg0;
		this.anInt8510 = arg1;
		this.anInt8511 = arg2;
		this.anInt8512 = arg3;
		this.method5018();
	}

	@ObfuscatedName("Class_ra_Sub2.fa(IIII)V")
	public void fa(int arg0, int arg1, int arg2, int arg3) {
		this.anInt8597 = arg0;
		this.anInt8510 = arg1;
		this.anInt8511 = arg2;
		this.anInt8512 = arg3;
		this.method5018();
	}

	@ObfuscatedName("Class_ra_Sub2.fz(FF)V")
	public void fz(float arg0, float arg1) {
		this.aFloat8608 = arg0;
		this.aFloat8457 = arg1;
		this.method5018();
	}

	@ObfuscatedName("Class_ra_Sub2.fc(IIII)V")
	public final void fc(int arg0, int arg1, int arg2, int arg3) {
		int var5;
		int var6;
		if (this.aClass76_4228 == null) {
			var5 = 0;
			var6 = 0;
		} else {
			var6 = this.aClass76_4228.method856();
			var5 = this.aClass76_4228.method857();
		}
		if (arg0 <= 0 && arg2 >= var6 - 1 && arg1 <= 0 && arg3 >= var5 - 1) {
			this.L();
			return;
		}
		this.anInt8610 = arg0 >= 0 ? arg0 : 0;
		this.anInt8447 = arg2 <= var6 ? arg2 : var6;
		this.anInt8521 = arg1 >= 0 ? arg1 : 0;
		this.anInt8506 = arg3 <= var5 ? arg3 : var5;
		if (!this.aBoolean8612 && (this.aBoolean8555 || this.method4903() == Class161.aClass161_1688)) {
			this.aBoolean8612 = true;
			this.method4914();
		}
		this.method4913();
	}

	public final void method4995(boolean arg0) {
		if (arg0 != this.aBoolean8522) {
			this.aBoolean8522 = arg0;
			this.method4936();
			this.anInt8540 &= 0xFFFFFFF8;
		}
	}

	@ObfuscatedName("Class_ra_Sub2.fy(IIII)V")
	public final void fy(int arg0, int arg1, int arg2, int arg3) {
		int var5;
		int var6;
		if (this.aClass76_4228 == null) {
			var5 = 0;
			var6 = 0;
		} else {
			var6 = this.aClass76_4228.method856();
			var5 = this.aClass76_4228.method857();
		}
		int var8 = arg0 >= 0 ? arg0 : 0;
		int var10 = arg2 <= var6 ? arg2 : var6;
		int var9 = arg1 >= 0 ? arg1 : 0;
		int var11 = arg3 <= var5 ? arg3 : var5;
		boolean var7 = false;
		if (this.anInt8610 < var8) {
			this.anInt8610 = var8;
			var7 = true;
		}
		if (this.anInt8447 > var10) {
			this.anInt8447 = var10;
			var7 = true;
		}
		if (this.anInt8521 < var9) {
			this.anInt8521 = var9;
			var7 = true;
		}
		if (this.anInt8506 > var11) {
			this.anInt8506 = var11;
			var7 = true;
		}
		if (!var7) {
			return;
		}
		if (!this.aBoolean8612 && (this.aBoolean8555 || this.method4903() == Class161.aClass161_1688)) {
			this.aBoolean8612 = true;
			this.method4914();
		}
		this.method4913();
	}

	@ObfuscatedName("Class_ra_Sub2.fe(IIII)V")
	public final void fe(int arg0, int arg1, int arg2, int arg3) {
		int var5;
		int var6;
		if (this.aClass76_4228 == null) {
			var5 = 0;
			var6 = 0;
		} else {
			var6 = this.aClass76_4228.method856();
			var5 = this.aClass76_4228.method857();
		}
		int var8 = arg0 >= 0 ? arg0 : 0;
		int var10 = arg2 <= var6 ? arg2 : var6;
		int var9 = arg1 >= 0 ? arg1 : 0;
		int var11 = arg3 <= var5 ? arg3 : var5;
		boolean var7 = false;
		if (this.anInt8610 < var8) {
			this.anInt8610 = var8;
			var7 = true;
		}
		if (this.anInt8447 > var10) {
			this.anInt8447 = var10;
			var7 = true;
		}
		if (this.anInt8521 < var9) {
			this.anInt8521 = var9;
			var7 = true;
		}
		if (this.anInt8506 > var11) {
			this.anInt8506 = var11;
			var7 = true;
		}
		if (!var7) {
			return;
		}
		if (!this.aBoolean8612 && (this.aBoolean8555 || this.method4903() == Class161.aClass161_1688)) {
			this.aBoolean8612 = true;
			this.method4914();
		}
		this.method4913();
	}

	@ObfuscatedName("Class_ra_Sub2.fl([I)V")
	public final void fl(int[] arg0) {
		arg0[0] = this.anInt8610;
		arg0[1] = this.anInt8521;
		arg0[2] = this.anInt8447;
		arg0[3] = this.anInt8506;
	}

	@ObfuscatedName("Class_ra_Sub2.fv([I)V")
	public final void fv(int[] arg0) {
		arg0[0] = this.anInt8610;
		arg0[1] = this.anInt8521;
		arg0[2] = this.anInt8447;
		arg0[3] = this.anInt8506;
	}

	@ObfuscatedName("Class_ra_Sub2.ff([I)V")
	public final void ff(int[] arg0) {
		arg0[0] = this.anInt8610;
		arg0[1] = this.anInt8521;
		arg0[2] = this.anInt8447;
		arg0[3] = this.anInt8506;
	}

	@ObfuscatedName("Class_ra_Sub2.fq(IIIIII)V")
	public final void fq(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var8 = arg2 - 1;
		int var9 = arg3 - 1;
		byte var7 = 0;
		if (this instanceof Class_ra_Sub2_Sub1) {
			var7 = -1;
		}
		this.br(arg0, arg1 + var7, arg0 + var8, arg1 + var7, arg4, arg5);
		this.br(arg0, arg1 + var9 + var7, arg0 + var8, arg1 + var9 + var7, arg4, arg5);
		this.br(arg0, arg1, arg0, arg1 + var9, arg4, arg5);
		this.br(arg0 + var8, arg1, arg0 + var8, arg1 + var9, arg4, arg5);
	}

	@ObfuscatedName("Class_ra_Sub2.hj(II)I")
	public final int hj(int arg0, int arg1) {
		return arg0 | arg1;
	}

	@ObfuscatedName("Class_ra_Sub2.fx(IIIIII)V")
	public final void fx(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (this.aBoolean8519) {
			this.RA(false);
			this.aClass61_Sub1_8553.method691(arg0, arg1, arg2, arg3, 0, arg4, arg5);
			this.RA(true);
		} else {
			this.aClass61_Sub1_8553.method691(arg0, arg1, arg2, arg3, 0, arg4, arg5);
		}
	}

	@ObfuscatedName("Class_ra_Sub2.fw(IIIIII)V")
	public final void fw(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (this.aBoolean8519) {
			this.RA(false);
			this.aClass61_Sub1_8553.method691(arg0, arg1, arg2, arg3, 0, arg4, arg5);
			this.RA(true);
		} else {
			this.aClass61_Sub1_8553.method691(arg0, arg1, arg2, arg3, 0, arg4, arg5);
		}
	}

	@ObfuscatedName("Class_ra_Sub2.fp(IIIIII[BII)V")
	public final void fp(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
	}

	@ObfuscatedName("Class_ra_Sub2.im()V")
	public final void im() {
		if (this.aClass192Array8569[1] != null && this.aClass192Array8569[1].method2106()) {
			this.aClass180_8470.method2057(this.aClass192Array8569[1]);
			this.aClass188_8552.method2096();
		}
	}

	@ObfuscatedName("Class_ra_Sub2.ig(III)V")
	public final void ig(int arg0, int arg1, int arg2) {
		if (this.anInt8476 == arg0 && this.anInt8578 == arg1 && this.anInt8560 == arg2) {
			return;
		}
		this.anInt8476 = arg0;
		this.anInt8578 = arg1;
		this.anInt8560 = arg2;
		this.method5015();
		this.method4974();
	}

	@ObfuscatedName("Class_ra_Sub2.dk(I)V")
	public void dk(int arg0) {
		if (this.aClass188_8552 != null) {
			this.aClass188_8552.method2097();
		}
		this.anInt8588 = arg0 & Integer.MAX_VALUE;
	}

	@ObfuscatedName("Class_ra_Sub2.jr(IIFIIFIIFIIII)V")
	public final void jr(int arg0, int arg1, float arg2, int arg3, int arg4, float arg5, int arg6, int arg7, float arg8, int arg9, int arg10, int arg11, int arg12) {
	}

	@ObfuscatedName("Class_ra_Sub2.ga(IIIII)V")
	public final void ga(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.br(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@ObfuscatedName("Class_ra_Sub2.gm(IIZZ)LClass61;")
	public final Class61 gm(int arg0, int arg1, boolean arg2, boolean arg3) {
		return new Class61_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("Class_ra_Sub2.gz(IIIIII)V")
	public final void gz(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		this.by(arg0, arg1, arg2, arg3, arg4, 1, arg5);
	}

	public void method4998() {
		this.aClass180_8470.method2061();
		this.anInterface9_Impl1_8600.method53();
		this.anInterface9_Impl1_8587.method53();
		this.anInterface9_Impl1_8501.method53();
		for (int var1 = 0; var1 < 7; var1++) {
			this.aClass387_Sub1Array8609[var1].method4511();
		}
		this.aClass186_8455.method2080();
		this.anInterface9_Impl2_8559.method53();
		this.aClass187_8556.method2084();
		this.aClass187_8556 = null;
	}

	public final void method4999() {
		this.method4937();
		this.method4938();
		this.method4936();
		this.method5007();
		this.method4959();
		this.method4939();
		this.method4940();
		this.method4932();
		this.method4933();
		this.method4974();
		this.method4900();
		this.method5112();
		this.method5014();
		this.method4973();
		for (int var1 = this.anInt8592 - 1; var1 >= 0; var1--) {
			this.method4955(var1);
			this.method5053();
			this.method4968();
			this.method4965();
		}
		this.method4967();
		this.method4912();
	}

	@ObfuscatedName("Class_ra_Sub2.ge(IIIIIII)V")
	public final void ge(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var14 = (int) ((float) arg0 + 1.0F);
		int var16 = (int) ((float) arg1 + 1.0F);
		int var18 = (int) ((float) arg2 + 1.0F);
		int var19 = (int) ((float) arg3 + 1.0F);
		float var8 = (float) (var18 - var14);
		float var9 = (float) (var19 - var16);
		float var10 = 1.0F / (float) Math.sqrt((double) (var8 * var8 + var9 * var9));
		float var20 = var8 * var10;
		float var21 = var9 * var10;
		int var15 = (int) ((float) var14 - var20);
		int var17 = (int) ((float) var16 - var21);
		float var11 = -var21;
		float var13 = var11 * 0.5F * (float) arg5;
		float var12 = var20 * 0.5F * (float) arg5;
		this.aClass61_Sub1_8553.method715((float) var15 - var13, (float) var17 - var12, (float) var18 - var13, (float) var19 - var12, (float) var15 + var13, (float) var17 + var12, 0, arg4, arg6);
	}

	@ObfuscatedName("Class_ra_Sub2.gq(IIIIIII)V")
	public final void gq(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var14 = (int) ((float) arg0 + 1.0F);
		int var16 = (int) ((float) arg1 + 1.0F);
		int var18 = (int) ((float) arg2 + 1.0F);
		int var19 = (int) ((float) arg3 + 1.0F);
		float var8 = (float) (var18 - var14);
		float var9 = (float) (var19 - var16);
		float var10 = 1.0F / (float) Math.sqrt((double) (var8 * var8 + var9 * var9));
		float var20 = var8 * var10;
		float var21 = var9 * var10;
		int var15 = (int) ((float) var14 - var20);
		int var17 = (int) ((float) var16 - var21);
		float var11 = -var21;
		float var13 = var11 * 0.5F * (float) arg5;
		float var12 = var20 * 0.5F * (float) arg5;
		this.aClass61_Sub1_8553.method715((float) var15 - var13, (float) var17 - var12, (float) var18 - var13, (float) var19 - var12, (float) var15 + var13, (float) var17 + var12, 0, arg4, arg6);
	}

	@ObfuscatedName("Class_ra_Sub2.gu(IIIIIII)V")
	public final void gu(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var14 = (int) ((float) arg0 + 1.0F);
		int var16 = (int) ((float) arg1 + 1.0F);
		int var18 = (int) ((float) arg2 + 1.0F);
		int var19 = (int) ((float) arg3 + 1.0F);
		float var8 = (float) (var18 - var14);
		float var9 = (float) (var19 - var16);
		float var10 = 1.0F / (float) Math.sqrt((double) (var8 * var8 + var9 * var9));
		float var20 = var8 * var10;
		float var21 = var9 * var10;
		int var15 = (int) ((float) var14 - var20);
		int var17 = (int) ((float) var16 - var21);
		float var11 = -var21;
		float var13 = var11 * 0.5F * (float) arg5;
		float var12 = var20 * 0.5F * (float) arg5;
		this.aClass61_Sub1_8553.method715((float) var15 - var13, (float) var17 - var12, (float) var18 - var13, (float) var19 - var12, (float) var15 + var13, (float) var17 + var12, 0, arg4, arg6);
	}

	@ObfuscatedName("Class_ra_Sub2.gf(IIIIII)I")
	public int gf(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 0;
		float var8 = this.aClass249_8492.aFloatArray2631[14] + this.aClass249_8492.aFloatArray2631[2] * (float) arg0 + this.aClass249_8492.aFloatArray2631[6] * (float) arg1 + this.aClass249_8492.aFloatArray2631[10] * (float) arg2;
		float var9 = this.aClass249_8492.aFloatArray2631[14] + this.aClass249_8492.aFloatArray2631[2] * (float) arg3 + this.aClass249_8492.aFloatArray2631[6] * (float) arg4 + this.aClass249_8492.aFloatArray2631[10] * (float) arg5;
		float var10 = this.aClass249_8492.aFloatArray2631[15] + this.aClass249_8492.aFloatArray2631[3] * (float) arg0 + this.aClass249_8492.aFloatArray2631[7] * (float) arg1 + this.aClass249_8492.aFloatArray2631[11] * (float) arg2;
		float var11 = this.aClass249_8492.aFloatArray2631[15] + this.aClass249_8492.aFloatArray2631[3] * (float) arg3 + this.aClass249_8492.aFloatArray2631[7] * (float) arg4 + this.aClass249_8492.aFloatArray2631[11] * (float) arg5;
		if (var8 < -var10 && var9 < -var11) {
			var7 |= 0x10;
		} else if (var8 > var10 && var9 > var11) {
			var7 |= 0x20;
		}
		float var12 = this.aClass249_8492.aFloatArray2631[12] + this.aClass249_8492.aFloatArray2631[0] * (float) arg0 + this.aClass249_8492.aFloatArray2631[4] * (float) arg1 + this.aClass249_8492.aFloatArray2631[8] * (float) arg2;
		float var13 = this.aClass249_8492.aFloatArray2631[12] + this.aClass249_8492.aFloatArray2631[0] * (float) arg3 + this.aClass249_8492.aFloatArray2631[4] * (float) arg4 + this.aClass249_8492.aFloatArray2631[8] * (float) arg5;
		if (var12 < -var10 && var13 < -var11) {
			var7 |= 0x1;
		}
		if (var12 > var10 && var13 > var11) {
			var7 |= 0x2;
		}
		float var14 = this.aClass249_8492.aFloatArray2631[13] + this.aClass249_8492.aFloatArray2631[1] * (float) arg0 + this.aClass249_8492.aFloatArray2631[5] * (float) arg1 + this.aClass249_8492.aFloatArray2631[9] * (float) arg2;
		float var15 = this.aClass249_8492.aFloatArray2631[13] + this.aClass249_8492.aFloatArray2631[1] * (float) arg3 + this.aClass249_8492.aFloatArray2631[5] * (float) arg4 + this.aClass249_8492.aFloatArray2631[9] * (float) arg5;
		if (var14 < -var10 && var15 < -var11) {
			var7 |= 0x4;
		}
		if (var14 > var10 && var15 > var11) {
			var7 |= 0x8;
		}
		return var7;
	}

	@ObfuscatedName("Class_ra_Sub2.je(ILClass77;)V")
	public final void je(int arg0, Class77 arg1) {
		if (!this.aBoolean8571) {
			throw new RuntimeException("");
		}
		this.anInt8573 = arg0;
		this.aClass77_8456 = arg1;
		if (this.aBoolean8572) {
			this.aClass164Array8558[3].method1930();
			this.aClass164Array8558[3].method1929();
		}
	}

	@ObfuscatedName("Class_ra_Sub2.gi(I)LClass_v;")
	public final Class_v gi(int arg0) {
		Class_v_Sub1 var2 = new Class_v_Sub1(arg0);
		this.aClass471_8464.method5878(var2, (short) 8192);
		return var2;
	}

	@ObfuscatedName("Class_ra_Sub2.gs(I)LClass_v;")
	public final Class_v gs(int arg0) {
		Class_v_Sub1 var2 = new Class_v_Sub1(arg0);
		this.aClass471_8464.method5878(var2, (short) 8192);
		return var2;
	}

	@ObfuscatedName("Class_ra_Sub2.go(LClass_v;)V")
	public final void go(Class_v arg0) {
		this.aNativeHeap8463 = ((Class_v_Sub1) arg0).aNativeHeap9856;
	}

	@ObfuscatedName("Class_ra_Sub2.gp(LClass_v;)V")
	public final void gp(Class_v arg0) {
		this.aNativeHeap8463 = ((Class_v_Sub1) arg0).aNativeHeap9856;
	}

	@ObfuscatedName("Class_ra_Sub2.gc(LClass_v;)V")
	public final void gc(Class_v arg0) {
		this.aNativeHeap8463 = ((Class_v_Sub1) arg0).aNativeHeap9856;
	}

	@ObfuscatedName("Class_ra_Sub2.hz(IIZZ)LClass61;")
	public final Class61 hz(int arg0, int arg1, boolean arg2, boolean arg3) {
		return new Class61_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("Class_ra_Sub2.ha(IIZZ)LClass61;")
	public final Class61 ha(int arg0, int arg1, boolean arg2, boolean arg3) {
		return new Class61_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("Class_ra_Sub2.hm([IIIIIZ)LClass61;")
	public final Class61 hm(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		return new Class61_Sub1(this, arg3, arg4, arg0, arg1, arg2);
	}

	@ObfuscatedName("Class_ra_Sub2.hv([IIIIIZ)LClass61;")
	public final Class61 hv(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		return new Class61_Sub1(this, arg3, arg4, arg0, arg1, arg2);
	}

	@ObfuscatedName("Class_ra_Sub2.hi(LClass87;Z)LClass61;")
	public final Class61 hi(Class87 arg0, boolean arg1) {
		Class61 var3;
		if (arg0.method986() == 0 || arg0.method994() == 0) {
			var3 = this.method4795(new int[] { 0 }, 0, 1, 1, 1, (byte) -29);
		} else {
			int[] var4 = arg0.method1031(false);
			var3 = this.method4795(var4, 0, arg0.method986(), arg0.method986(), arg0.method994(), (byte) -67);
		}
		var3.method717(arg0.method983(), arg0.method990(), arg0.method989(), arg0.method991());
		return var3;
	}

	@ObfuscatedName("Class_ra_Sub2.ea()Z")
	public final boolean ea() {
		return true;
	}

	@ObfuscatedName("Class_ra_Sub2.hk(IIIIZ)LClass61;")
	public final Class61 hk(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		Class61_Sub1 var6 = new Class61_Sub1(this, arg2, arg3, arg4, false);
		var6.method737(0, 0, arg2, arg3, arg0, arg1);
		return var6;
	}

	@ObfuscatedName("Class_ra_Sub2.he(II)I")
	public final int he(int arg0, int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@ObfuscatedName("Class_ra_Sub2.hc(II[I[I)LClass_ta;")
	public final Class_ta hc(int arg0, int arg1, int[] arg2, int[] arg3) {
		return Class_ta_Sub1.method5682(this, arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("Class_ra_Sub2.hy(II[I[I)LClass_ta;")
	public final Class_ta hy(int arg0, int arg1, int[] arg2, int[] arg3) {
		return Class_ta_Sub1.method5682(this, arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("Class_ra_Sub2.hw(I)V")
	public final void hw(int arg0) {
	}

	@ObfuscatedName("Class_ra_Sub2.hs(LModel;IIII)LClass387;")
	public final Class387 hs(Model arg0, int arg1, int arg2, int arg3, int arg4) {
		return new Class387_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@ObfuscatedName("Class_ra_Sub2.hg(LModel;IIII)LClass387;")
	public final Class387 hg(Model arg0, int arg1, int arg2, int arg3, int arg4) {
		return new Class387_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@ObfuscatedName("Class_ra_Sub2.hb(LModel;IIII)LClass387;")
	public final Class387 hb(Model arg0, int arg1, int arg2, int arg3, int arg4) {
		return new Class387_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@ObfuscatedName("Class_ra_Sub2.ik(IFFFFF)V")
	public final void ik(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		boolean var7 = this.anInt8529 * -16777217 * 16777215 != arg0;
		if (var7 || this.aFloat8489 != arg1 || this.aFloat8535 != arg2) {
			this.anInt8529 = arg0 * -16777217 * 16777215;
			this.aFloat8489 = arg1;
			this.aFloat8535 = arg2;
			if (var7) {
				this.aFloat8530 = (float) (this.anInt8529 * -16777217 * 16777215 & 0xFF0000) / 1.671168E7F;
				this.aFloat8500 = (float) (this.anInt8529 * -16777217 * 16777215 & 0xFF00) / 65280.0F;
				this.aFloat8532 = (float) (this.anInt8529 * -16777217 * 16777215 & 0xFF) / 255.0F;
				this.method4937();
			}
			this.method4938();
		}
		if (this.aFloatArray8462[0] != arg3 || this.aFloatArray8462[1] != arg4 || this.aFloatArray8462[2] != arg5) {
			this.aFloatArray8462[0] = arg3;
			this.aFloatArray8462[1] = arg4;
			this.aFloatArray8462[2] = arg5;
			this.aFloatArray8528[0] = -arg3;
			this.aFloatArray8528[1] = -arg4;
			this.aFloatArray8528[2] = -arg5;
			float var8 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray8525[0] = arg3 * var8;
			this.aFloatArray8525[1] = arg4 * var8;
			this.aFloatArray8525[2] = arg5 * var8;
			this.aFloatArray8451[0] = -this.aFloatArray8525[0];
			this.aFloatArray8451[1] = -this.aFloatArray8525[1];
			this.aFloatArray8451[2] = -this.aFloatArray8525[2];
			this.method4959();
			this.anInt8541 = (int) (arg3 * 256.0F / arg4);
			this.anInt8599 = (int) (arg5 * 256.0F / arg4);
		}
		this.method4939();
	}

	@ObfuscatedName("Class_ra_Sub2.hx(II[[I[[IIII)LClass_xa;")
	public final Class_xa hx(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
		return new Class_xa_Sub2(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("Class_ra_Sub2.hp(II[[I[[IIII)LClass_xa;")
	public final Class_xa hp(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
		return new Class_xa_Sub2(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("Class_ra_Sub2.ii(I[LClass330_Sub14;)V")
	public final void ii(int arg0, Class330_Sub14[] arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			this.aClass330_Sub14Array8607[var3] = arg1[var3];
		}
		this.anInt8538 = arg0;
		if (this.aClass174_8483 == Class174.aClass174_1735) {
			this.method5007();
		}
	}

	@ObfuscatedName("Class_ra_Sub2.io()LClass249;")
	public final Class249 io() {
		return this.aClass249_8488;
	}

	@ObfuscatedName("Class_ra_Sub2.ic()LClass249;")
	public final Class249 ic() {
		return this.aClass249_8488;
	}

	@ObfuscatedName("Class_ra_Sub2.ia(F)V")
	public final void ia(float arg0) {
		if (this.aFloat8533 != arg0) {
			this.aFloat8533 = arg0;
			this.method4937();
			this.method4939();
		}
	}

	public final void method5005(boolean arg0) {
		if (arg0 != this.aBoolean8526) {
			this.aBoolean8526 = arg0;
			this.method4932();
			this.anInt8540 &= 0xFFFFFFF0;
		}
	}

	@ObfuscatedName("Class_ra_Sub2.iz(IFFFFF)V")
	public final void iz(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		boolean var7 = this.anInt8529 * -16777217 * 16777215 != arg0;
		if (var7 || this.aFloat8489 != arg1 || this.aFloat8535 != arg2) {
			this.anInt8529 = arg0 * -16777217 * 16777215;
			this.aFloat8489 = arg1;
			this.aFloat8535 = arg2;
			if (var7) {
				this.aFloat8530 = (float) (this.anInt8529 * -16777217 * 16777215 & 0xFF0000) / 1.671168E7F;
				this.aFloat8500 = (float) (this.anInt8529 * -16777217 * 16777215 & 0xFF00) / 65280.0F;
				this.aFloat8532 = (float) (this.anInt8529 * -16777217 * 16777215 & 0xFF) / 255.0F;
				this.method4937();
			}
			this.method4938();
		}
		if (this.aFloatArray8462[0] != arg3 || this.aFloatArray8462[1] != arg4 || this.aFloatArray8462[2] != arg5) {
			this.aFloatArray8462[0] = arg3;
			this.aFloatArray8462[1] = arg4;
			this.aFloatArray8462[2] = arg5;
			this.aFloatArray8528[0] = -arg3;
			this.aFloatArray8528[1] = -arg4;
			this.aFloatArray8528[2] = -arg5;
			float var8 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray8525[0] = arg3 * var8;
			this.aFloatArray8525[1] = arg4 * var8;
			this.aFloatArray8525[2] = arg5 * var8;
			this.aFloatArray8451[0] = -this.aFloatArray8525[0];
			this.aFloatArray8451[1] = -this.aFloatArray8525[1];
			this.aFloatArray8451[2] = -this.aFloatArray8525[2];
			this.method4959();
			this.anInt8541 = (int) (arg3 * 256.0F / arg4);
			this.anInt8599 = (int) (arg5 * 256.0F / arg4);
		}
		this.method4939();
	}

	@ObfuscatedName("Class_ra_Sub2.iw(I)V")
	public final void iw(int arg0) {
		this.anInt8536 = 0 * -1431655765 * 3;
		while (arg0 > 1) {
			this.anInt8536 = (this.anInt8536 * -1431655765 * 3 + 1) * -1431655765 * 3;
			arg0 >>= 0x1;
		}
		this.anInt8539 = 0x1 << this.anInt8536 * -1431655765 * 3;
	}

	@ObfuscatedName("Class_ra_Sub2.cc(FFFFFF)V")
	public final void cc(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		Class192_Sub1.aFloat7341 = arg0;
		Class192_Sub1.aFloat7340 = arg1;
		Class192_Sub1.aFloat7339 = arg2;
		Class192_Sub1.aFloat7342 = arg5;
	}

	@ObfuscatedName("Class_ra_Sub2.ib(III)V")
	public final void ib(int arg0, int arg1, int arg2) {
		if (this.anInt8476 == arg0 && this.anInt8578 == arg1 && this.anInt8560 == arg2) {
			return;
		}
		this.anInt8476 = arg0;
		this.anInt8578 = arg1;
		this.anInt8560 = arg2;
		this.method5015();
		this.method4974();
	}

	@ObfuscatedName("Class_ra_Sub2.ku()Z")
	public final boolean ku() {
		return this.aClass192Array8569[1] != null;
	}

	@ObfuscatedName("Class_ra_Sub2.ix(IIIIII)LClass92;")
	public final Class92 ix(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return new Class92_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("Class_ra_Sub2.iq(IIIIII)LClass92;")
	public final Class92 iq(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return new Class92_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("Class_ra_Sub2.ip(IIIIII)LClass92;")
	public final Class92 ip(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return new Class92_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("Class_ra_Sub2.kl(LClass247;)V")
	public final void kl(Class247 arg0) {
		this.aClass247_8524 = arg0;
		this.aClass249_8472.method2508(this.aClass247_8524);
		this.aClass247_8596.method2454(arg0);
		this.aClass247_8596.method2459();
		this.aClass249_8473.method2508(this.aClass247_8596);
		this.method4918();
		if (this.aClass174_8483 == Class174.aClass174_1735) {
			this.method4919();
		}
	}

	@ObfuscatedName("Class_ra_Sub2.iv()Z")
	public final boolean iv() {
		if (this.aClass192Array8569[1] == null || this.aClass192Array8569[1].method2106()) {
			return false;
		}
		boolean var1 = this.aClass180_8470.method2062(this.aClass192Array8569[1]);
		if (var1) {
			this.aClass188_8552.method2096();
		}
		return var1;
	}

	@ObfuscatedName("Class_ra_Sub2.it()Z")
	public final boolean it() {
		if (this.aClass192Array8569[1] == null || this.aClass192Array8569[1].method2106()) {
			return false;
		}
		boolean var1 = this.aClass180_8470.method2062(this.aClass192Array8569[1]);
		if (var1) {
			this.aClass188_8552.method2096();
		}
		return var1;
	}

	public final void method5007() {
		if (this.method5082()) {
			this.method4981();
		}
		this.anInt8537 = this.anInt8538;
		this.anInt8538 = 0;
	}

	@ObfuscatedName("Class_ra_Sub2.ie()Z")
	public final boolean ie() {
		return this.aClass192Array8569[1] != null && this.aClass192Array8569[1].method2106();
	}

	public void method4804() {
		if (this.aClass187_8556 != null) {
			this.aClass187_8556.method2085();
		}
	}

	@ObfuscatedName("Class_ra_Sub2.jc(FFFFFF)V")
	public final void jc(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		Class192_Sub1.aFloat7341 = arg0;
		Class192_Sub1.aFloat7340 = arg1;
		Class192_Sub1.aFloat7339 = arg2;
		Class192_Sub1.aFloat7342 = arg5;
	}

	public final Class249 method5008() {
		return this.aClass249Array8545[this.anInt8543];
	}

	@ObfuscatedName("Class_ra_Sub2.jn(IIII)V")
	public final void jn(int arg0, int arg1, int arg2, int arg3) {
		this.aClass180_8470.method2058(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("Class_ra_Sub2.jg(IIII)V")
	public final void jg(int arg0, int arg1, int arg2, int arg3) {
		this.aClass180_8470.method2058(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("Class_ra_Sub2.hl(IIIIZ)LClass61;")
	public final Class61 hl(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		Class61_Sub1 var6 = new Class61_Sub1(this, arg2, arg3, arg4, false);
		var6.method737(0, 0, arg2, arg3, arg0, arg1);
		return var6;
	}

	@ObfuscatedName("Class_ra_Sub2.jm(ILClass77;)V")
	public final void jm(int arg0, Class77 arg1) {
		this.anInt8573 = arg0;
		this.aClass77_8456 = arg1;
		this.aBoolean8571 = true;
	}

	@ObfuscatedName("Class_ra_Sub2.jo(ILClass77;)V")
	public final void jo(int arg0, Class77 arg1) {
		this.anInt8573 = arg0;
		this.aClass77_8456 = arg1;
		this.aBoolean8571 = true;
	}

	@ObfuscatedName("Class_ra_Sub2.jf(ILClass77;)V")
	public final void jf(int arg0, Class77 arg1) {
		this.anInt8573 = arg0;
		this.aClass77_8456 = arg1;
		this.aBoolean8571 = true;
	}

	@ObfuscatedName("Class_ra_Sub2.ec()Z")
	public final boolean ec() {
		return this.aBoolean8566;
	}

	@ObfuscatedName("Class_ra_Sub2.jj(ILClass77;)V")
	public final void jj(int arg0, Class77 arg1) {
		if (!this.aBoolean8571) {
			throw new RuntimeException("");
		}
		this.anInt8573 = arg0;
		this.aClass77_8456 = arg1;
		if (this.aBoolean8572) {
			this.aClass164Array8558[3].method1930();
			this.aClass164Array8558[3].method1929();
		}
	}

	@ObfuscatedName("Class_ra_Sub2.g(I)V")
	public void g(int arg0) {
		if (this.aClass188_8552 != null) {
			this.aClass188_8552.method2097();
		}
		this.anInt8588 = arg0 & Integer.MAX_VALUE;
	}

	public final Interface11_Impl1 method5012() {
		return this.aClass92_Sub1_8570 == null ? null : this.aClass92_Sub1_8570.method1074();
	}

	@ObfuscatedName("Class_ra_Sub2.jh()V")
	public final void jh() {
		this.aBoolean8571 = false;
	}

	@ObfuscatedName("Class_ra_Sub2.lo()I")
	public final int lo() {
		return this.anInt8593 - 2;
	}

	@ObfuscatedName("Class_ra_Sub2.G(IIIII)V")
	public final void G(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.br(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	public final void method5013() {
		if (this.anInt8540 == 8) {
			return;
		}
		this.method4885();
		this.method4882(true);
		this.method5005(true);
		this.method4962(true);
		this.method4970(1);
		this.anInt8540 = 8;
	}

	@ObfuscatedName("Class_ra_Sub2.ka()Z")
	public final boolean ka() {
		return true;
	}

	@ObfuscatedName("Class_ra_Sub2.km()Z")
	public final boolean km() {
		return true;
	}

	@ObfuscatedName("Class_ra_Sub2.ky()Z")
	public final boolean ky() {
		return this.aClass192Array8569[1] != null;
	}

	@ObfuscatedName("Class_ra_Sub2.kt(IIIIIILClass_ta;IIIII)V")
	public void kt(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Class_ta arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
	}

	@ObfuscatedName("Class_ra_Sub2.ki(IIIIIILClass_ta;IIIII)V")
	public void ki(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Class_ta arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
	}

	@ObfuscatedName("Class_ra_Sub2.kc()LClass249;")
	public final Class249 kc() {
		return this.aClass249_8579;
	}

	@ObfuscatedName("Class_ra_Sub2.en()Z")
	public final boolean en() {
		return true;
	}

	@ObfuscatedName("Class_ra_Sub2.kx()LClass247;")
	public final Class247 kx() {
		return this.aClass247_8611;
	}

	@ObfuscatedName("Class_ra_Sub2.gn(IIIII)V")
	public final void gn(int arg0, int arg1, int arg2, int arg3, int arg4) {
	}

	@ObfuscatedName("Class_ra_Sub2.kk()V")
	public void kk() {
		this.anInt8597 = 0;
		this.anInt8510 = 0;
		this.anInt8511 = this.aClass76_4228.method856();
		this.anInt8512 = this.aClass76_4228.method857();
		this.method5018();
	}

	@ObfuscatedName("Class_ra_Sub2.kq()V")
	public void kq() {
		this.anInt8597 = 0;
		this.anInt8510 = 0;
		this.anInt8511 = this.aClass76_4228.method856();
		this.anInt8512 = this.aClass76_4228.method857();
		this.method5018();
	}

	@ObfuscatedName("Class_ra_Sub2.kg()V")
	public void kg() {
		this.anInt8597 = 0;
		this.anInt8510 = 0;
		this.anInt8511 = this.aClass76_4228.method856();
		this.anInt8512 = this.aClass76_4228.method857();
		this.method5018();
	}

	@ObfuscatedName("Class_ra_Sub2.ko()V")
	public final void ko() {
		if (this.aClass76_4228 == null) {
			this.anInt8506 = 0;
			this.anInt8447 = 0;
			this.anInt8521 = 0;
			this.anInt8610 = 0;
		} else {
			this.anInt8521 = 0;
			this.anInt8610 = 0;
			this.anInt8447 = this.aClass76_4228.method856();
			this.anInt8506 = this.aClass76_4228.method857();
		}
		if (this.aBoolean8612) {
			this.aBoolean8612 = false;
			this.method4914();
		}
	}

	@ObfuscatedName("Class_ra_Sub2.kz()V")
	public final void kz() {
		if (this.aClass76_4228 == null) {
			this.anInt8506 = 0;
			this.anInt8447 = 0;
			this.anInt8521 = 0;
			this.anInt8610 = 0;
		} else {
			this.anInt8521 = 0;
			this.anInt8610 = 0;
			this.anInt8447 = this.aClass76_4228.method856();
			this.anInt8506 = this.aClass76_4228.method857();
		}
		if (this.aBoolean8612) {
			this.aBoolean8612 = false;
			this.method4914();
		}
	}

	public final void method5015() {
		if (this.aClass164_8557 != null) {
			this.aClass164_8557.method1929();
		}
		this.method4900();
	}

	@ObfuscatedName("Class_ra_Sub2.kd(LClass247;)V")
	public final void kd(Class247 arg0) {
		this.aClass247_8524 = arg0;
		this.aClass249_8472.method2508(this.aClass247_8524);
		this.aClass247_8596.method2454(arg0);
		this.aClass247_8596.method2459();
		this.aClass249_8473.method2508(this.aClass247_8596);
		this.method4918();
		if (this.aClass174_8483 == Class174.aClass174_1735) {
			this.method4919();
		}
	}

	@ObfuscatedName("Class_ra_Sub2.ks(Z)V")
	public final void ks(boolean arg0) {
		this.aBoolean8519 = arg0;
		this.method4933();
	}

	@ObfuscatedName("Class_ra_Sub2.kr(Z)V")
	public final void kr(boolean arg0) {
		this.aBoolean8519 = arg0;
		this.method4933();
	}

	@ObfuscatedName("Class_ra_Sub2.lp(Z)V")
	public final void lp(boolean arg0) {
		this.aBoolean8519 = arg0;
		this.method4933();
	}

	@ObfuscatedName("Class_ra_Sub2.ln()I")
	public final int ln() {
		return this.anInt8593 - 2;
	}

	public void method5016(boolean arg0) {
		this.aBoolean8555 = arg0;
	}

	public void method5017(boolean arg0) {
		this.aBoolean8555 = arg0;
	}

	@ObfuscatedName("Class_ra_Sub2.cb(LModel;IIII)LClass387;")
	public final Class387 cb(Model arg0, int arg1, int arg2, int arg3, int arg4) {
		return new Class387_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	public final void method5018() {
		if (this.aClass174_8483 == Class174.aClass174_1735) {
			this.anInt8531 = this.anInt8597;
			this.anInt8567 = this.anInt8510;
			this.anInt8515 = this.anInt8511;
			this.anInt8516 = this.anInt8512;
			this.aFloat8499 = this.aFloat8608;
			this.aFloat8478 = this.aFloat8457;
		} else {
			this.anInt8531 = 0;
			this.anInt8567 = 0;
			this.anInt8515 = this.aClass76_4228.method856();
			this.anInt8516 = this.aClass76_4228.method857();
			this.aFloat8499 = 0.0F;
			this.aFloat8478 = 1.0F;
		}
		this.method4912();
		this.aFloat8505 = (float) this.anInt8511 / 2.0F;
		this.aFloat8498 = (float) this.anInt8512 / 2.0F;
		this.aFloat8495 = (float) this.anInt8597 + this.aFloat8505;
		this.aFloat8497 = (float) this.anInt8510 + this.aFloat8498;
	}

	public void method5019() {
		if (this.aClass187_8556 != null) {
			this.aClass187_8556.method2090();
		}
	}

	@ObfuscatedName("Class_ra_Sub2.ej()Z")
	public final boolean ej() {
		return true;
	}

	@ObfuscatedName("Class_ra_Sub2.ji(IIII)V")
	public final void ji(int arg0, int arg1, int arg2, int arg3) {
		this.aClass180_8470.method2058(arg0, arg1, arg2, arg3);
	}

	public boolean method5026(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		this.aByteBuffer8458.clear();
		this.aByteBuffer8458.putFloat(arg0);
		this.aByteBuffer8458.putFloat(arg1);
		this.aByteBuffer8458.putFloat(arg2);
		this.aByteBuffer8458.putFloat(arg3);
		this.aByteBuffer8458.putFloat(arg4);
		this.aByteBuffer8458.putFloat(arg5);
		return this.anInterface9_Impl1_8587.method97(0, this.aByteBuffer8458.position(), this.aLong8459);
	}

	public void method5027() {
		this.aClass180_8470.method2055();
		for (int var1 = 0; var1 < this.aClass192Array8569.length; var1++) {
			if (this.aClass192Array8569[var1] != null && this.aClass192Array8569[var1].method2106()) {
				this.aClass192Array8569[var1].method2102();
			}
		}
		this.aClass186_8455 = new Class186(this);
		this.method4896();
		this.method4986();
		this.method5036();
		this.aClass186_8455.method2077(this);
		this.aClass187_8556 = new Class187(this, 1024);
	}

	@ObfuscatedName("Class_ra_Sub2.ci(LClass249;)V")
	public final void ci(Class249 arg0) {
		this.aClass249_8488.method2510(arg0);
		this.method4918();
		if (this.aClass174_8483 == Class174.aClass174_1735) {
			this.method4930();
		}
	}

	@ObfuscatedName("Class_ra_Sub2.O()V")
	public final void O() {
		this.aBoolean8571 = false;
	}

	@ObfuscatedName("Class_ra_Sub2.ac()Z")
	public final boolean ac() {
		return this.aBoolean8566;
	}

	@ObfuscatedName("Class_ra_Sub2.hu(ILClass_ta;II)V")
	public final void hu(int arg0, Class_ta arg1, int arg2, int arg3) {
		this.RA(false);
		this.aClass61_Sub1_8554.method703(0.0F, 0.0F, (float) this.method4782((byte) 0).method856(), 0.0F, 0.0F, (float) this.method4782((byte) 0).method857(), 0, arg1, arg2, arg3);
		this.RA(true);
	}

	@ObfuscatedName("Class_ra_Sub2.dg(ILClass77;)V")
	public final void dg(int arg0, Class77 arg1) {
		this.anInt8573 = arg0;
		this.aClass77_8456 = arg1;
		this.aBoolean8571 = true;
	}

	@ObfuscatedName("Class_ra_Sub2.gk(IIIIIIIII)V")
	public void gk(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		float var10 = (float) arg2 - (float) arg0;
		float var11 = (float) arg3 - (float) arg1;
		if (var10 == 0.0F && var11 == 0.0F) {
			var10 = 1.0F;
		} else {
			float var12 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
			var10 *= var12;
			var11 *= var12;
		}
		this.method4925();
		Class164 var24 = this.aClass164Array8558[13];
		var24.method1928();
		var24.method1927(arg4);
		this.method4970(arg5);
		var24.method1933();
		this.method5135(false);
		int var23 = arg8 % (arg7 + arg6);
		float var13 = var10 * (float) arg6;
		float var14 = var11 * (float) arg6;
		float var15 = 0.0F;
		float var16 = 0.0F;
		float var17 = var13;
		float var18 = var14;
		if (var23 > arg6) {
			var15 = var10 * (float) (arg6 + arg7 - var23);
			var16 = var11 * (float) (arg6 + arg7 - var23);
		} else {
			var17 = var10 * (float) (arg6 - var23);
			var18 = var11 * (float) (arg6 - var23);
		}
		float var19 = (float) arg0 + var15;
		float var20 = (float) arg1 + var16;
		float var21 = var10 * (float) arg7;
		float var22 = var11 * (float) arg7;
		while (true) {
			if (arg2 > arg0) {
				if (var19 > (float) arg2) {
					break;
				}
				if (var19 + var17 > (float) arg2) {
					var17 = (float) arg2 - var19;
				}
			} else {
				if (var19 < (float) arg2) {
					break;
				}
				if (var19 + var17 < (float) arg2) {
					var17 = (float) arg2 - var19;
				}
			}
			if (arg3 > arg1) {
				if (var20 > (float) arg3) {
					break;
				}
				if (var20 + var18 > (float) arg3) {
					var18 = (float) arg3 - var20;
				}
			} else {
				if (var20 < (float) arg3) {
					break;
				}
				if (var20 + var18 < (float) arg3) {
					var18 = (float) arg3 - var20;
				}
			}
			if (!this.method5026(var19, var20, 0.0F, var19 + var17, var20 + var18, 0.0F)) {
				return;
			}
			this.method4982();
			var19 += var21 + var17;
			var20 += var22 + var18;
			var17 = var13;
			var18 = var14;
		}
		this.method5135(true);
		var24.method1931();
	}

	@ObfuscatedName("Class_ra_Sub2.kj()Z")
	public final boolean kj() {
		return true;
	}

	@ObfuscatedName("Class_ra_Sub2.kw()LClass247;")
	public final Class247 kw() {
		return this.aClass247_8611;
	}

	@ObfuscatedName("Class_ra_Sub2.gr(IIIIII)V")
	public final void gr(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		this.by(arg0, arg1, arg2, arg3, arg4, 1, arg5);
	}

	@ObfuscatedName("Class_ra_Sub2.gd(IIIII)V")
	public final void gd(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.br(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@ObfuscatedName("Class_ra_Sub2.kn(LClass81;)V")
	public final void kn(Class81 arg0) {
		this.aClass186_8455.method2079(this, arg0);
	}

	@ObfuscatedName("Class_ra_Sub2.hq(LClass87;Z)LClass61;")
	public final Class61 hq(Class87 arg0, boolean arg1) {
		Class61 var3;
		if (arg0.method986() == 0 || arg0.method994() == 0) {
			var3 = this.method4795(new int[] { 0 }, 0, 1, 1, 1, (byte) -6);
		} else {
			int[] var4 = arg0.method1031(false);
			var3 = this.method4795(var4, 0, arg0.method986(), arg0.method986(), arg0.method994(), (byte) -84);
		}
		var3.method717(arg0.method983(), arg0.method990(), arg0.method989(), arg0.method991());
		return var3;
	}

	@ObfuscatedName("Class_ra_Sub2.cy(I)V")
	public final void cy(int arg0) {
	}

	@ObfuscatedName("Class_ra_Sub2.ho(LClass524;[LClass87_Sub2;Z)LClass263;")
	public final Class263 ho(Class524 arg0, Class87_Sub2[] arg1, boolean arg2) {
		return new Class263_Sub5(this, arg0, arg1, arg2);
	}

	@ObfuscatedName("Class_ra_Sub2.id()V")
	public final void id() {
		if (this.aClass192Array8569[1] != null && this.aClass192Array8569[1].method2106()) {
			this.aClass180_8470.method2057(this.aClass192Array8569[1]);
			this.aClass188_8552.method2096();
		}
	}

	@ObfuscatedName("Class_ra_Sub2.aw()Z")
	public final boolean aw() {
		return false;
	}

	@ObfuscatedName("Class_ra_Sub2.kf()LClass249;")
	public final Class249 kf() {
		return this.aClass249_8579;
	}

	public final void method5036() {
		this.anInterface9_Impl1_8501 = this.method4976(false);
		this.anInterface9_Impl1_8501.method142(3096, 12);
		this.aByteBuffer8458.clear();
		this.aByteBuffer8458.putFloat(0.0F);
		this.aByteBuffer8458.putFloat(0.0F);
		this.aByteBuffer8458.putFloat(0.0F);
		for (int var1 = 0; var1 <= 256; var1++) {
			double var2 = (double) (var1 * 2) * 3.141592653589793D / 256.0D;
			float var4 = (float) Math.cos(var2);
			float var5 = (float) Math.sin(var2);
			this.aByteBuffer8458.putFloat(var5);
			this.aByteBuffer8458.putFloat(var4);
			this.aByteBuffer8458.putFloat(0.0F);
		}
		this.anInterface9_Impl1_8501.method97(0, this.aByteBuffer8458.position(), this.aLong8459);
	}

	public final void method5039() {
		this.aClass155_8542 = new Class155(this);
		this.aBoolean8601 = false;
		try {
			this.aClass140_8474 = new Class140_Sub1(this);
			this.aClass159_8590 = new Class159_Sub1(this);
			this.aClass150_8561 = new Class150_Sub2(this);
			this.aClass126_8562 = new Class126_Sub2(this);
			this.aClass164_Sub1_Sub2_8563 = new Class164_Sub1_Sub2(this, this.aClass155_8542, false);
			this.aClass164_Sub1_Sub2_8564 = new Class164_Sub1_Sub2(this, this.aClass155_8542, true);
			this.aClass164_Sub1_Sub1_8565 = new Class164_Sub1_Sub1(this, this.aClass155_8542);
		} catch (Exception var3) {
			var3.printStackTrace();
			this.aClass140_8474 = new Class140_Sub2(this);
			this.aClass159_8590 = new Class159_Sub2(this);
			this.aClass150_8561 = new Class150_Sub1(this);
			this.aClass126_8562 = new Class126_Sub1(this);
			this.aClass164_Sub1_Sub2_8563 = null;
			this.aClass164_Sub1_Sub2_8564 = null;
			this.aClass164_Sub1_Sub1_8565 = null;
			this.aBoolean8601 = true;
		}
		int var1;
		int var2;
		if (this.aClass76_4228 == null) {
			var1 = 0;
			var2 = 0;
		} else {
			var2 = this.aClass76_4228.method856();
			var1 = this.aClass76_4228.method857();
		}
		this.aClass180_8470 = new Class180(this, var2, var1);
		if (!this.aBoolean8601) {
			this.aClass192Array8569[1] = new Class192_Sub1(this);
			this.aClass180_8470.method2062(this.aClass192Array8569[1]);
		}
		if (this.aClass164_8557 != null) {
			this.aClass164_8557.method1931();
			this.aClass164_8557 = null;
		}
		this.method5027();
	}

	@ObfuscatedName("Class_ra_Sub2.gj(IIIII)V")
	public final void gj(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.br(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@ObfuscatedName("Class_ra_Sub2.bz(IIIIIIIII)V")
	public void bz(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		float var10 = (float) arg2 - (float) arg0;
		float var11 = (float) arg3 - (float) arg1;
		if (var10 == 0.0F && var11 == 0.0F) {
			var10 = 1.0F;
		} else {
			float var12 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
			var10 *= var12;
			var11 *= var12;
		}
		this.method4925();
		Class164 var24 = this.aClass164Array8558[13];
		var24.method1928();
		var24.method1927(arg4);
		this.method4970(arg5);
		var24.method1933();
		this.method5135(false);
		int var23 = arg8 % (arg7 + arg6);
		float var13 = var10 * (float) arg6;
		float var14 = var11 * (float) arg6;
		float var15 = 0.0F;
		float var16 = 0.0F;
		float var17 = var13;
		float var18 = var14;
		if (var23 > arg6) {
			var15 = var10 * (float) (arg6 + arg7 - var23);
			var16 = var11 * (float) (arg6 + arg7 - var23);
		} else {
			var17 = var10 * (float) (arg6 - var23);
			var18 = var11 * (float) (arg6 - var23);
		}
		float var19 = (float) arg0 + var15;
		float var20 = (float) arg1 + var16;
		float var21 = var10 * (float) arg7;
		float var22 = var11 * (float) arg7;
		while (true) {
			if (arg2 > arg0) {
				if (var19 > (float) arg2) {
					break;
				}
				if (var19 + var17 > (float) arg2) {
					var17 = (float) arg2 - var19;
				}
			} else {
				if (var19 < (float) arg2) {
					break;
				}
				if (var19 + var17 < (float) arg2) {
					var17 = (float) arg2 - var19;
				}
			}
			if (arg3 > arg1) {
				if (var20 > (float) arg3) {
					break;
				}
				if (var20 + var18 > (float) arg3) {
					var18 = (float) arg3 - var20;
				}
			} else {
				if (var20 < (float) arg3) {
					break;
				}
				if (var20 + var18 < (float) arg3) {
					var18 = (float) arg3 - var20;
				}
			}
			if (!this.method5026(var19, var20, 0.0F, var19 + var17, var20 + var18, 0.0F)) {
				return;
			}
			this.method4982();
			var19 += var21 + var17;
			var20 += var22 + var18;
			var17 = var13;
			var18 = var14;
		}
		this.method5135(true);
		var24.method1931();
	}

	@ObfuscatedName("Class_ra_Sub2.jb(ILClass77;)V")
	public final void jb(int arg0, Class77 arg1) {
		this.anInt8573 = arg0;
		this.aClass77_8456 = arg1;
		this.aBoolean8571 = true;
	}

	@ObfuscatedName("Class_ra_Sub2.js(IIII)V")
	public final void js(int arg0, int arg1, int arg2, int arg3) {
		this.aClass180_8470.method2058(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("Class_ra_Sub2.r(IIII)V")
	public final void r(int arg0, int arg1, int arg2, int arg3) {
		int var5;
		int var6;
		if (this.aClass76_4228 == null) {
			var5 = 0;
			var6 = 0;
		} else {
			var6 = this.aClass76_4228.method856();
			var5 = this.aClass76_4228.method857();
		}
		if (arg0 <= 0 && arg2 >= var6 - 1 && arg1 <= 0 && arg3 >= var5 - 1) {
			this.L();
			return;
		}
		this.anInt8610 = arg0 >= 0 ? arg0 : 0;
		this.anInt8447 = arg2 <= var6 ? arg2 : var6;
		this.anInt8521 = arg1 >= 0 ? arg1 : 0;
		this.anInt8506 = arg3 <= var5 ? arg3 : var5;
		if (!this.aBoolean8612 && (this.aBoolean8555 || this.method4903() == Class161.aClass161_1688)) {
			this.aBoolean8612 = true;
			this.method4914();
		}
		this.method4913();
	}

	@ObfuscatedName("Class_ra_Sub2.ja(ILClass77;)V")
	public final void ja(int arg0, Class77 arg1) {
		this.anInt8573 = arg0;
		this.aClass77_8456 = arg1;
		this.aBoolean8571 = true;
	}

	@ObfuscatedName("Class_ra_Sub2.eb()Z")
	public final boolean eb() {
		return true;
	}

	@ObfuscatedName("Class_ra_Sub2.hd(II)I")
	public final int hd(int arg0, int arg1) {
		return arg0 | arg1;
	}

	@ObfuscatedName("Class_ra_Sub2.ij(F)V")
	public final void ij(float arg0) {
		if (this.aFloat8533 != arg0) {
			this.aFloat8533 = arg0;
			this.method4937();
			this.method4939();
		}
	}

	@ObfuscatedName("Class_ra_Sub2.hr(ILClass_ta;II)V")
	public final void hr(int arg0, Class_ta arg1, int arg2, int arg3) {
		this.RA(false);
		this.aClass61_Sub1_8554.method703(0.0F, 0.0F, (float) this.method4782((byte) 0).method856(), 0.0F, 0.0F, (float) this.method4782((byte) 0).method857(), 0, arg1, arg2, arg3);
		this.RA(true);
	}

	public final boolean method5082() {
		return this.aBoolean8601;
	}

	@ObfuscatedName("Class_ra_Sub2.gv(IIIIII)I")
	public int gv(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 0;
		float var8 = this.aClass249_8492.aFloatArray2631[14] + this.aClass249_8492.aFloatArray2631[2] * (float) arg0 + this.aClass249_8492.aFloatArray2631[6] * (float) arg1 + this.aClass249_8492.aFloatArray2631[10] * (float) arg2;
		float var9 = this.aClass249_8492.aFloatArray2631[14] + this.aClass249_8492.aFloatArray2631[2] * (float) arg3 + this.aClass249_8492.aFloatArray2631[6] * (float) arg4 + this.aClass249_8492.aFloatArray2631[10] * (float) arg5;
		float var10 = this.aClass249_8492.aFloatArray2631[15] + this.aClass249_8492.aFloatArray2631[3] * (float) arg0 + this.aClass249_8492.aFloatArray2631[7] * (float) arg1 + this.aClass249_8492.aFloatArray2631[11] * (float) arg2;
		float var11 = this.aClass249_8492.aFloatArray2631[15] + this.aClass249_8492.aFloatArray2631[3] * (float) arg3 + this.aClass249_8492.aFloatArray2631[7] * (float) arg4 + this.aClass249_8492.aFloatArray2631[11] * (float) arg5;
		if (var8 < -var10 && var9 < -var11) {
			var7 |= 0x10;
		} else if (var8 > var10 && var9 > var11) {
			var7 |= 0x20;
		}
		float var12 = this.aClass249_8492.aFloatArray2631[12] + this.aClass249_8492.aFloatArray2631[0] * (float) arg0 + this.aClass249_8492.aFloatArray2631[4] * (float) arg1 + this.aClass249_8492.aFloatArray2631[8] * (float) arg2;
		float var13 = this.aClass249_8492.aFloatArray2631[12] + this.aClass249_8492.aFloatArray2631[0] * (float) arg3 + this.aClass249_8492.aFloatArray2631[4] * (float) arg4 + this.aClass249_8492.aFloatArray2631[8] * (float) arg5;
		if (var12 < -var10 && var13 < -var11) {
			var7 |= 0x1;
		}
		if (var12 > var10 && var13 > var11) {
			var7 |= 0x2;
		}
		float var14 = this.aClass249_8492.aFloatArray2631[13] + this.aClass249_8492.aFloatArray2631[1] * (float) arg0 + this.aClass249_8492.aFloatArray2631[5] * (float) arg1 + this.aClass249_8492.aFloatArray2631[9] * (float) arg2;
		float var15 = this.aClass249_8492.aFloatArray2631[13] + this.aClass249_8492.aFloatArray2631[1] * (float) arg3 + this.aClass249_8492.aFloatArray2631[5] * (float) arg4 + this.aClass249_8492.aFloatArray2631[9] * (float) arg5;
		if (var14 < -var10 && var15 < -var11) {
			var7 |= 0x4;
		}
		if (var14 > var10 && var15 > var11) {
			var7 |= 0x8;
		}
		return var7;
	}

	@ObfuscatedName("Class_ra_Sub2.e()Z")
	public final boolean e() {
		return true;
	}

	@ObfuscatedName("Class_ra_Sub2.c(III)V")
	public final void c(int arg0, int arg1, int arg2) {
		if (this.anInt8476 == arg0 && this.anInt8578 == arg1 && this.anInt8560 == arg2) {
			return;
		}
		this.anInt8476 = arg0;
		this.anInt8578 = arg1;
		this.anInt8560 = arg2;
		this.method5015();
		this.method4974();
	}

	public final void method5085() {
		if (this.aBoolean8484) {
			return;
		}
		int var1;
		int var2;
		if (this.aClass76_4228 == null) {
			var1 = 0;
			var2 = 0;
		} else {
			var2 = this.aClass76_4228.method856();
			var1 = this.aClass76_4228.method857();
		}
		Class249 var3 = this.aClass249_8485;
		if (var2 == 0 || var1 == 0) {
			var3.method2516();
		} else {
			var3.method2489(0.0F, (float) var2, 0.0F, (float) var1, -1.0F, 1.0F);
		}
		this.aClass249_8486.method2510(var3);
		this.method5103(this.aClass249_8486);
		this.aBoolean8484 = true;
	}

	@ObfuscatedName("Class_ra_Sub2.au()V")
	public void au() {
		this.anInt8597 = 0;
		this.anInt8510 = 0;
		this.anInt8511 = this.aClass76_4228.method856();
		this.anInt8512 = this.aClass76_4228.method857();
		this.method5018();
	}

	@ObfuscatedName("Class_ra_Sub2.db(IIII)V")
	public final void db(int arg0, int arg1, int arg2, int arg3) {
		this.aClass180_8470.method2058(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("Class_ra_Sub2.cj()LClass247;")
	public final Class247 cj() {
		return this.aClass247_8611;
	}

	@ObfuscatedName("Class_ra_Sub2.jd(FFF[F)V")
	public void jd(float arg0, float arg1, float arg2, float[] arg3) {
		float var5 = this.aClass249_8492.aFloatArray2631[15] + this.aClass249_8492.aFloatArray2631[3] * arg0 + this.aClass249_8492.aFloatArray2631[7] * arg1 + this.aClass249_8492.aFloatArray2631[11] * arg2;
		float var6 = this.aClass249_8492.aFloatArray2631[12] + this.aClass249_8492.aFloatArray2631[0] * arg0 + this.aClass249_8492.aFloatArray2631[4] * arg1 + this.aClass249_8492.aFloatArray2631[8] * arg2;
		float var7 = this.aClass249_8492.aFloatArray2631[13] + this.aClass249_8492.aFloatArray2631[1] * arg0 + this.aClass249_8492.aFloatArray2631[5] * arg1 + this.aClass249_8492.aFloatArray2631[9] * arg2;
		float var8 = this.aClass249_8472.aFloatArray2631[14] + this.aClass249_8472.aFloatArray2631[2] * arg0 + this.aClass249_8472.aFloatArray2631[6] * arg1 + this.aClass249_8472.aFloatArray2631[10] * arg2;
		arg3[0] = this.aFloat8495 + this.aFloat8505 * var6 / var5;
		arg3[1] = this.aFloat8497 + this.aFloat8498 * var7 / var5;
		arg3[2] = var8;
	}

	@ObfuscatedName("Class_ra_Sub2.iy(FFFFFF)V")
	public final void iy(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		Class192_Sub1.aFloat7341 = arg0;
		Class192_Sub1.aFloat7340 = arg1;
		Class192_Sub1.aFloat7339 = arg2;
		Class192_Sub1.aFloat7342 = arg5;
	}

	@ObfuscatedName("Class_ra_Sub2.eh()Z")
	public final boolean eh() {
		return true;
	}

	public final void method5099() {
		this.aBoolean8487 = false;
		this.method4929();
		if (this.aClass174_8483 == Class174.aClass174_1735) {
			this.method4930();
		}
	}

	public final void method_if(int arg0, int arg1, int arg2) {
		if (this.anInt8476 == arg0 && this.anInt8578 == arg1 && this.anInt8560 == arg2) {
			return;
		}
		this.anInt8476 = arg0;
		this.anInt8578 = arg1;
		this.anInt8560 = arg2;
		this.method5015();
		this.method4974();
	}

	@ObfuscatedName("Class_ra_Sub2.cu()Z")
	public final boolean cu() {
		if (this.aClass192Array8569[1] == null || this.aClass192Array8569[1].method2106()) {
			return false;
		}
		boolean var1 = this.aClass180_8470.method2062(this.aClass192Array8569[1]);
		if (var1) {
			this.aClass188_8552.method2096();
		}
		return var1;
	}

	public void method5111() {
		if (this.aClass187_8556 != null) {
			this.aClass187_8556.method2089();
		}
	}

	public final void method5114(int arg0, Class175 arg1) {
		this.method5001(arg0, arg1, false, false);
	}

	@ObfuscatedName("Class_ra_Sub2.ev()Z")
	public final boolean ev() {
		return this.aBoolean8566;
	}

	@ObfuscatedName("Class_ra_Sub2.gx(IIIII)V")
	public final void gx(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.br(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@ObfuscatedName("Class_ra_Sub2.gw(IIIIIILClass_ta;II)V")
	public final void gw(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Class_ta arg6, int arg7, int arg8) {
	}

	@ObfuscatedName("Class_ra_Sub2.jz(FFF[F)V")
	public void jz(float arg0, float arg1, float arg2, float[] arg3) {
		float var5 = this.aClass249_8492.aFloatArray2631[15] + this.aClass249_8492.aFloatArray2631[3] * arg0 + this.aClass249_8492.aFloatArray2631[7] * arg1 + this.aClass249_8492.aFloatArray2631[11] * arg2;
		float var6 = this.aClass249_8492.aFloatArray2631[12] + this.aClass249_8492.aFloatArray2631[0] * arg0 + this.aClass249_8492.aFloatArray2631[4] * arg1 + this.aClass249_8492.aFloatArray2631[8] * arg2;
		float var7 = this.aClass249_8492.aFloatArray2631[13] + this.aClass249_8492.aFloatArray2631[1] * arg0 + this.aClass249_8492.aFloatArray2631[5] * arg1 + this.aClass249_8492.aFloatArray2631[9] * arg2;
		float var8 = this.aClass249_8472.aFloatArray2631[14] + this.aClass249_8472.aFloatArray2631[2] * arg0 + this.aClass249_8472.aFloatArray2631[6] * arg1 + this.aClass249_8472.aFloatArray2631[10] * arg2;
		arg3[0] = this.aFloat8495 + this.aFloat8505 * var6 / var5;
		arg3[1] = this.aFloat8497 + this.aFloat8498 * var7 / var5;
		arg3[2] = var8;
	}

	@ObfuscatedName("Class_ra_Sub2.jt()V")
	public final void jt() {
		this.aClass180_8470.method2059();
	}

	@ObfuscatedName("Class_ra_Sub2.gh(IIIIIII)V")
	public final void gh(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var14 = (int) ((float) arg0 + 1.0F);
		int var16 = (int) ((float) arg1 + 1.0F);
		int var18 = (int) ((float) arg2 + 1.0F);
		int var19 = (int) ((float) arg3 + 1.0F);
		float var8 = (float) (var18 - var14);
		float var9 = (float) (var19 - var16);
		float var10 = 1.0F / (float) Math.sqrt((double) (var8 * var8 + var9 * var9));
		float var20 = var8 * var10;
		float var21 = var9 * var10;
		int var15 = (int) ((float) var14 - var20);
		int var17 = (int) ((float) var16 - var21);
		float var11 = -var21;
		float var13 = var11 * 0.5F * (float) arg5;
		float var12 = var20 * 0.5F * (float) arg5;
		this.aClass61_Sub1_8553.method715((float) var15 - var13, (float) var17 - var12, (float) var18 - var13, (float) var19 - var12, (float) var15 + var13, (float) var17 + var12, 0, arg4, arg6);
	}

	public abstract boolean method4886();

	public abstract float method4887();

	public abstract Class105 method4888(String arg0);

	public abstract void method4891(Class249 arg0, Class249 arg1, Class249 arg2);

	public abstract float method4893();

	public abstract void method4898(Class199 arg0, int arg1, int arg2);

	public abstract Interface11_Impl3 method4899(int arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5);

	public abstract void method4900();

	public abstract float method4901();

	public abstract Interface11_Impl3 method4904(Class72 arg0, Class86 arg1, int arg2, int arg3);

	public abstract void method4907();

	public abstract void method4912();

	public abstract void method4913();

	public abstract void method4914();

	public abstract void method4917(Class249 arg0);

	public abstract Class105 method4923(String arg0);

	public abstract void method4926(Class184 arg0);

	public abstract void method4927(int arg0, Class175 arg1, boolean arg2);

	public abstract Class105 method4928(String arg0);

	public abstract Class184 method4931(Class193[] arg0);

	public abstract void method4932();

	public abstract void method4933();

	public abstract void method4934();

	public abstract void method4936();

	public abstract void method4937();

	public abstract void method4938();

	public abstract void method4939();

	public abstract void method4940();

	public abstract void method4941(Class249 arg0, Class249 arg1, Class249 arg2);

	public abstract void method4947(int arg0);

	public abstract Interface11_Impl3 method4948(Class72 arg0, int arg1, int arg2, boolean arg3, byte[] arg4, int arg5, int arg6);

	public abstract Interface11_Impl3 method4949(Class72 arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5, int arg6);

	public abstract Interface11_Impl3 method4950(int arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5);

	public abstract Interface11_Impl1 method4951(int arg0, boolean arg1, int[][] arg2);

	public abstract Interface11_Impl2 method4952(Class72 arg0, int arg1, int arg2, int arg3, boolean arg4, byte[] arg5);

	public abstract Interface11_Impl3_Impl1 method4953(Class72 arg0, Class86 arg1, int arg2, int arg3);

	public abstract Interface11_Impl1 method4957(int arg0, boolean arg1, int[][] arg2);

	public abstract void method4959();

	public abstract void method4960();

	public abstract void method4967();

	public abstract void method4968();

	public abstract void method4973();

	public abstract void method4974();

	public abstract Interface9_Impl2 method4975(boolean arg0);

	public abstract Interface9_Impl1 method4976(boolean arg0);

	public abstract Class184 method4977(Class193[] arg0);

	public abstract void method4978(Class184 arg0);

	public abstract void method4979(Interface9_Impl2 arg0);

	public abstract void method4981();

	public abstract void method4985(Interface9_Impl2 arg0, Class199 arg1, int arg2, int arg3, int arg4, int arg5);

	public abstract void method4987(Class199 arg0, int arg1, int arg2, int arg3, int arg4);

	public abstract void method4988();

	public abstract void method4989();

	public abstract void method4990(int arg0);

	public abstract void method4991();

	public abstract void method4992();

	public abstract boolean method4996(Class72 arg0, Class86 arg1);

	public abstract void method4997();

	public abstract void method5000();

	public abstract void method5001(int arg0, Class175 arg1, boolean arg2, boolean arg3);

	public abstract boolean method5002(Class72 arg0, Class86 arg1);

	public abstract Class184 method5003(Class193[] arg0);

	public abstract void method5004(Interface9_Impl2 arg0);

	public abstract boolean method5006(Class72 arg0, Class86 arg1);

	public abstract void method5009(Class184 arg0);

	public abstract void method5010();

	public abstract void method5011();

	public abstract void method5014();

	public abstract void method5020(Class249 arg0);

	public abstract boolean method5021();

	public abstract boolean method5022();

	public abstract boolean method5023();

	public abstract Class105 method5024(String arg0);

	public abstract void method5025();

	public abstract void method5028();

	public abstract void method5029();

	public abstract void method5030();

	public abstract float method5031();

	public abstract boolean method5032(Class72 arg0, Class86 arg1);

	public abstract void method5033(Class249 arg0);

	public abstract void method5034();

	public abstract void method5035();

	public abstract Class105 method5037(String arg0);

	public abstract void method5038(Class199 arg0, int arg1, int arg2, int arg3, int arg4);

	public abstract void method5040(int arg0);

	public abstract void method5041();

	public abstract void method5042();

	public abstract void method5043();

	public abstract void method5044();

	public abstract void method5045();

	public abstract void method5046();

	public abstract void method5047();

	public abstract void method5048();

	public abstract void method5049();

	public abstract void method5050();

	public abstract boolean method5051();

	public abstract void method5052();

	public abstract void method5053();

	public abstract void method5054();

	public abstract void method5055();

	public abstract boolean method5056(Class72 arg0, Class86 arg1);

	public abstract boolean method5057(Class72 arg0, Class86 arg1);

	public abstract Interface11_Impl3 method5058(Class72 arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5, int arg6);

	public abstract void method5059();

	public abstract Interface11_Impl3 method5060(Class72 arg0, int arg1, int arg2, boolean arg3, byte[] arg4, int arg5, int arg6);

	public abstract Interface11_Impl3 method5061(Class72 arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5, int arg6);

	public abstract Interface11_Impl3 method5062(Class72 arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5, int arg6);

	public abstract Interface11_Impl3 method5063(Class72 arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5, int arg6);

	public abstract Interface11_Impl3 method5064(Class72 arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5, int arg6);

	public abstract Interface11_Impl3 method5065(int arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5);

	public abstract Interface11_Impl3 method5066(int arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5);

	public abstract Interface11_Impl1 method5067(int arg0, boolean arg1, int[][] arg2);

	public abstract Interface11_Impl1 method5068(int arg0, boolean arg1, int[][] arg2);

	public abstract Interface11_Impl2 method5069(Class72 arg0, int arg1, int arg2, int arg3, boolean arg4, byte[] arg5);

	public abstract Interface11_Impl2 method5070(Class72 arg0, int arg1, int arg2, int arg3, boolean arg4, byte[] arg5);

	public abstract Interface11_Impl2 method5071(Class72 arg0, int arg1, int arg2, int arg3, boolean arg4, byte[] arg5);

	public abstract Interface11_Impl3_Impl1 method5072(Class72 arg0, Class86 arg1, int arg2, int arg3);

	public abstract Interface11_Impl3_Impl1 method5073(Class72 arg0, Class86 arg1, int arg2, int arg3);

	public abstract Interface11_Impl3_Impl1 method5074(Class72 arg0, Class86 arg1, int arg2, int arg3);

	public abstract void method5075();

	public abstract void method5076();

	public abstract void method5077();

	public abstract void method5078();

	public abstract void method5079(int arg0, Class175 arg1, boolean arg2, boolean arg3);

	public abstract void method5080(int arg0, Class175 arg1, boolean arg2, boolean arg3);

	public abstract void method5081(int arg0, Interface9_Impl1 arg1);

	public abstract void method5083();

	public abstract void method5084();

	public abstract void method5086();

	public abstract void method5087();

	public abstract void method5088();

	public abstract void method5089();

	public abstract void method5090();

	public abstract void method5091();

	public abstract void method5092();

	public abstract void method5093(int arg0);

	public abstract void method5094(int arg0);

	public abstract void method5095();

	public abstract void method5096();

	public abstract void method5097();

	public abstract void method5098(Class184 arg0);

	public abstract void method5100();

	public abstract void method5101();

	public abstract void method5102(boolean arg0);

	public abstract void method5103(Class249 arg0);

	public abstract void method5104(Class199 arg0, int arg1, int arg2);

	public abstract void method5105(Class184 arg0);

	public abstract void method5106(int arg0, Interface9_Impl1 arg1);

	public abstract void method5107(int arg0, Interface9_Impl1 arg1);

	public abstract void method5108(Interface9_Impl2 arg0);

	public abstract void method5109(Interface9_Impl2 arg0);

	public abstract void method5110(Interface9_Impl2 arg0);

	public abstract void method5112();

	public abstract void method5113(Class199 arg0, int arg1, int arg2);

	public abstract void method5115(Interface9_Impl2 arg0, Class199 arg1, int arg2, int arg3, int arg4, int arg5);

	public abstract void method5116(Class199 arg0, int arg1, int arg2, int arg3, int arg4);

	public abstract void method5117(int arg0);

	public abstract void method5118();

	public abstract void method5119();

	public abstract void method5120();

	public abstract void method5121();

	public abstract void method5122();

	public abstract void method5123();

	public abstract void method5124();

	public abstract boolean method5125(Class72 arg0, Class86 arg1);

	public abstract void method5126();

	public abstract void method5127();

	public abstract void method5128();

	public abstract void method5129();

	public abstract Interface9_Impl2 method5130(boolean arg0);

	public abstract Interface9_Impl1 method5131(boolean arg0);

	public abstract Interface9_Impl1 method5132(boolean arg0);

	public abstract void method5133(Class249 arg0, Class249 arg1, Class249 arg2);

	public abstract void method5134(Class249 arg0, Class249 arg1, Class249 arg2);

	public abstract void method5135(boolean arg0);

	public abstract Interface11_Impl3 method5136(Class72 arg0, Class86 arg1, int arg2, int arg3);

	public abstract Interface11_Impl3 method5137(Class72 arg0, Class86 arg1, int arg2, int arg3);

	public abstract Interface11_Impl3 method5138(Class72 arg0, Class86 arg1, int arg2, int arg3);

	public abstract void method5139(int arg0, Class175 arg1, boolean arg2);
}
