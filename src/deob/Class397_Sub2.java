package deob;

import java.util.LinkedList;
import java.util.Queue;

public class Class397_Sub2 extends Class397 {

	public Queue aQueue8244 = new LinkedList();

	public void method4674() {
		Class330_Sub44_Sub1 var1 = (Class330_Sub44_Sub1) this.aQueue8244.poll();
		if (var1 == null) {
			return;
		}
		Class330_Sub34 var2 = Class238.method2377(OutgoingPacket.aClass234_2529, client.aClass1_9025.aClass488_22, 1529257414);
		var2.aClass330_Sub46_Sub2_7729.addShortA(this.method4659(var1, 65535, 369986761), -1219491771);
		var2.aClass330_Sub46_Sub2_7729.method3777(var1.method3728((byte) 2) << 1 | var1.method3729(15132902) & 0x1, 5244230);
		var2.aClass330_Sub46_Sub2_7729.addLEInt(var1.method3710((byte) 69) | var1.method3711(1521581068) << 16, -2107203830);
		client.aClass1_9025.method378(var2, -990626825);
		var1.method3714(-1797026990);
	}

	public void method4682(Buffer arg0, Class330_Sub44_Sub1 arg1, int arg2) {
		try {
			arg0.addByte(arg1.method3729(1386621498), (byte) 54);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aeu.at(" + ')');
		}
	}

	public void method4662(int arg0) {
		try {
			Class330_Sub44_Sub1 var2 = (Class330_Sub44_Sub1) this.aQueue8244.poll();
			if (var2 != null) {
				Class330_Sub34 var3 = Class238.method2377(OutgoingPacket.aClass234_2529, client.aClass1_9025.aClass488_22, -243561677);
				var3.aClass330_Sub46_Sub2_7729.addShortA(this.method4659(var2, 65535, -1353277479), -1923041846);
				var3.aClass330_Sub46_Sub2_7729.method3777(var2.method3728((byte) 2) << 1 | var2.method3729(1660742792) & 0x1, 23115214);
				var3.aClass330_Sub46_Sub2_7729.addLEInt(var2.method3710((byte) -31) | var2.method3711(1890236544) << 16, -2028369411);
				client.aClass1_9025.method378(var3, -449243582);
				var2.method3714(-1382640461);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aeu.f(" + ')');
		}
	}

	public boolean method4663(int arg0) {
		try {
			return !this.aQueue8244.isEmpty() || this.aLong4109 < Class312.method3111((byte) 124) - 2000L;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aeu.z(" + ')');
		}
	}

	public Class330_Sub34 method4664(int arg0) {
		try {
			return Class238.method2377(OutgoingPacket.aClass234_2566, client.aClass1_9025.aClass488_22, 1973880242);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aeu.w(" + ')');
		}
	}

	public void method4665() {
		Class330_Sub44_Sub1 var1 = (Class330_Sub44_Sub1) this.aQueue8244.poll();
		if (var1 == null) {
			return;
		}
		Class330_Sub34 var2 = Class238.method2377(OutgoingPacket.aClass234_2529, client.aClass1_9025.aClass488_22, 690243530);
		var2.aClass330_Sub46_Sub2_7729.addShortA(this.method4659(var1, 65535, 1883690274), -1214867576);
		var2.aClass330_Sub46_Sub2_7729.method3777(var1.method3728((byte) 2) << 1 | var1.method3729(1437159430) & 0x1, 1458485344);
		var2.aClass330_Sub46_Sub2_7729.addLEInt(var1.method3710((byte) 2) | var1.method3711(328592958) << 16, -2119342207);
		client.aClass1_9025.method378(var2, -1452659867);
		var1.method3714(-777391456);
	}

	public int method4671() {
		return 1;
	}

	public void method4661(Buffer arg0, Class330_Sub44 arg1, byte arg2) {
		try {
			this.method4682(arg0, (Class330_Sub44_Sub1) arg1, 1510357776);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aeu.s(" + ')');
		}
	}

	public void method4672(Buffer arg0, Class330_Sub44 arg1) {
		this.method4682(arg0, (Class330_Sub44_Sub1) arg1, 937458279);
	}

	public void method4658(Buffer arg0, Class330_Sub44 arg1) {
		this.method4682(arg0, (Class330_Sub44_Sub1) arg1, 1457020410);
	}

	public void method4683(Class330_Sub44_Sub1 arg0, int arg1) {
		try {
			this.aQueue8244.add(arg0);
			if (this.aQueue8244.size() > 10) {
				this.aQueue8244.poll();
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aeu.al(" + ')');
		}
	}

	public void method4666() {
		Class330_Sub44_Sub1 var1 = (Class330_Sub44_Sub1) this.aQueue8244.poll();
		if (var1 == null) {
			return;
		}
		Class330_Sub34 var2 = Class238.method2377(OutgoingPacket.aClass234_2529, client.aClass1_9025.aClass488_22, 1291146733);
		var2.aClass330_Sub46_Sub2_7729.addShortA(this.method4659(var1, 65535, -484002938), -1097689748);
		var2.aClass330_Sub46_Sub2_7729.method3777(var1.method3728((byte) 2) << 1 | var1.method3729(28823761) & 0x1, 1556254189);
		var2.aClass330_Sub46_Sub2_7729.addLEInt(var1.method3710((byte) -31) | var1.method3711(1245112278) << 16, -2037425181);
		client.aClass1_9025.method378(var2, -802492897);
		var1.method3714(-1590026328);
	}

	public boolean method4668() {
		return !this.aQueue8244.isEmpty() || this.aLong4109 * 8681372172046252423L * 2239718308571069495L < Class312.method3111((byte) 24) - 2000L;
	}

	public Class330_Sub34 method4657() {
		return Class238.method2377(OutgoingPacket.aClass234_2566, client.aClass1_9025.aClass488_22, 19474366);
	}

	public Class330_Sub34 method4675() {
		return Class238.method2377(OutgoingPacket.aClass234_2566, client.aClass1_9025.aClass488_22, 757493463);
	}

	public int method4660(int arg0) {
		try {
			return 1;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aeu.o(" + ')');
		}
	}

	public int method4670() {
		return 1;
	}

	public boolean method4667() {
		return !this.aQueue8244.isEmpty() || this.aLong4109 * 8681372172046252423L * 2239718308571069495L < Class312.method3111((byte) 59) - 2000L;
	}

	public void method4676(Buffer arg0, Class330_Sub44 arg1) {
		this.method4682(arg0, (Class330_Sub44_Sub1) arg1, 1979086036);
	}
}
