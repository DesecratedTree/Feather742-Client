package deob;

import java.util.Iterator;

public class Class474 implements Iterator {

	public Class330 aClass330_5698 = null;

	public Class471 aClass471_5696;

	public Class330 aClass330_5697;

	public Class474(Class471 arg0) {
		this.aClass471_5696 = arg0;
		this.aClass330_5697 = this.aClass471_5696.aClass330_5611.aClass330_3340;
		this.aClass330_5698 = null;
	}

	public void method5915(int arg0) {
		try {
			this.aClass330_5697 = this.aClass471_5696.aClass330_5611.aClass330_3340;
			this.aClass330_5698 = null;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tq.z(" + ')');
		}
	}

	public Object next() {
		try {
			Class330 var1 = this.aClass330_5697;
			if (this.aClass471_5696.aClass330_5611 == var1) {
				var1 = null;
				this.aClass330_5697 = null;
			} else {
				this.aClass330_5697 = var1.aClass330_3340;
			}
			this.aClass330_5698 = var1;
			return var1;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "tq.next(" + ')');
		}
	}

	public boolean hasNext() {
		try {
			return this.aClass330_5697 != this.aClass471_5696.aClass330_5611;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "tq.hasNext(" + ')');
		}
	}

	public void remove() {
		try {
			if (this.aClass330_5698 == null) {
				throw new IllegalStateException();
			}
			this.aClass330_5698.method3252(1095534198);
			this.aClass330_5698 = null;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "tq.remove(" + ')');
		}
	}

	public Class330 method5916(int arg0) {
		try {
			this.method5915(-82060898);
			return (Class330) this.next();
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tq.w(" + ')');
		}
	}

	public void method5917(Class471 arg0, int arg1) {
		try {
			this.aClass471_5696 = arg0;
			this.aClass330_5697 = this.aClass471_5696.aClass330_5611.aClass330_3340;
			this.aClass330_5698 = null;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "tq.f(" + ')');
		}
	}

	public static final void method5918(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class545.method6347(1079239502);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tq.aff(" + ')');
		}
	}

	public static final void method5919(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.windowPaneId;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tq.anc(" + ')');
		}
	}

	public static int method5920(int arg0) {
		try {
			return Class119.anInt1395;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "tq.f(" + ')');
		}
	}

	public static void method5921(int arg0, short arg1) {
		try {
			if (client.anInt8995 == 14) {
				Class330_Sub34 var2 = Class238.method2377(OutgoingPacket.aClass234_2560, client.aClass1_9060.aClass488_22, -528813174);
				var2.aClass330_Sub46_Sub2_7729.addByte(arg0, (byte) 68);
				client.aClass1_9060.method378(var2, -1708316307);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tq.s(" + ')');
		}
	}
}
