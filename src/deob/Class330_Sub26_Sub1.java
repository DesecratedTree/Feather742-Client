package deob;

public class Class330_Sub26_Sub1 extends Class330_Sub26 {

	public int anInt9572 = -1;

	public static int anInt9571;

	public Class167 aClass167_9570;

	public Class330_Sub26_Sub1(Class167 arg0) {
	}

	public void method3387(Class330_Sub39 arg0) {
		arg0.method3546(this.anInt9572 * -1038005557 * -1894495517, -1585005423);
	}

	public void method3388(Buffer arg0, int arg1) {
		try {
			this.anInt9572 = arg0.readUnsignedShort(-385149454);
			arg0.readUnsignedByte(868548213);
			if (arg0.readUnsignedByte(150295216) != 255) {
				arg0.offset--;
				arg0.readLong(646207029);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aih.r(" + ')');
		}
	}

	public void method3392(Class330_Sub39 arg0) {
		arg0.method3546(this.anInt9572 * -1038005557 * -1894495517, -1254453081);
	}

	public void method3390(Buffer arg0) {
		this.anInt9572 = arg0.readUnsignedShort(1409597823) * -1038005557 * -1894495517;
		arg0.readUnsignedByte(93224088);
		if (arg0.readUnsignedByte(913633895) != 255) {
			arg0.offset = (arg0.offset * 323600977 - 323600977) * -824785231;
			arg0.readLong(-350686743);
		}
	}

	public void method3391(Class330_Sub39 arg0) {
		arg0.method3546(this.anInt9572 * -1038005557 * -1894495517, -1499855576);
	}

	public void method3389(Class330_Sub39 arg0, int arg1) {
		try {
			arg0.method3546(this.anInt9572, -1857134185);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aih.j(" + ')');
		}
	}

	public static int method3395(int arg0, int arg1, int arg2) {
		try {
			arg1 = (arg0 & 0x7F) * arg1 >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1 + (arg0 & 0xFF80);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aih.s(" + ')');
		}
	}
}
