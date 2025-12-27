package deob;

public class Class41 {

	public static final boolean method549(int arg0, int arg1) {
		return (arg0 & 0x21) != 0;
	}

	public static final boolean method550(int arg0, int arg1) {
		return (arg0 & 0x22) != 0;
	}

	public static final boolean method551(int arg0, int arg1) {
		return (arg0 & 0x34) != 0;
	}

	public static final boolean method552(int arg0, int arg1) {
		return (arg0 & 0x37) != 0;
	}

	public static final boolean method553(int arg0, int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}

	public static final boolean method554(int arg0, int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	public static final boolean method555(int arg0, int arg1) {
		return false;
	}

	public static final boolean method556(int arg0, int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	public static final boolean method557(int arg0, int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	public static final boolean method558(int arg0, int arg1) {
		return (arg0 & 0x800) != 0;
	}

	public static final boolean method559(int arg0, int arg1) {
		return (arg0 & 0x800) != 0;
	}

	public static final boolean method560(int arg0, int arg1) {
		return (arg0 & 0x800) != 0;
	}

	public static final boolean method561(int arg0, int arg1) {
		return (method549(arg0, arg1) | method550(arg0, arg1) | method551(arg0, arg1)) & method573(arg0, arg1);
	}

	public static final boolean method562(int arg0, int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	public static final boolean method563(int arg0, int arg1) {
		return (arg0 & 0x70000) != 0 | method549(arg0, arg1) || method561(arg0, arg1);
	}

	public static final boolean method564(int arg0, int arg1) {
		return method580(arg0, arg1) & method560(arg0, arg1);
	}

	public static final boolean method565(int arg0, int arg1) {
		return (arg0 & 0x70000) != 0 | method550(arg0, arg1) || method561(arg0, arg1);
	}

	public static final boolean method566(int arg0, int arg1) {
		return (arg0 & 0x70000) != 0 | method551(arg0, arg1) || method561(arg0, arg1);
	}

	public static final boolean method567(int arg0, int arg1) {
		if ((arg0 & 0x10000) != 0 | method553(arg0, arg1) || method578(arg0, arg1)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && method575(arg0, arg1);
		}
	}

	public static final boolean method568(int arg0, int arg1) {
		return method554(arg0, arg1) || method575(arg0, arg1);
	}

	public static final boolean method569(int arg0, int arg1) {
		return method555(arg0, arg1) || method577(arg0, arg1);
	}

	public static final boolean method570(int arg0, int arg1) {
		return (arg0 & 0x100100) != 0;
	}

	public static final boolean method571(int arg0, int arg1) {
		return (arg0 & 0x180) != 0;
	}

	public static final boolean method572(int arg0, int arg1) {
		return (arg0 & 0x60000) != 0 | method580(arg0, arg1) || method575(arg0, arg1) || method564(arg0, arg1);
	}

	public static final boolean method573(int arg0, int arg1) {
		return (arg0 & 0x800) != 0;
	}

	public static final boolean method574(int arg0, int arg1) {
		return (arg0 & 0x400) != 0;
	}

	public Class41() throws Throwable {
		throw new Error();
	}

	public static final boolean method575(int arg0, int arg1) {
		if (method558(arg0, arg1)) {
			return (arg0 & 0xB000) != 0 | method554(arg0, arg1) | method570(arg0, arg1) ? true : (arg1 & 0x37) == 0 & (method553(arg0, arg1) | method582(arg0, arg1));
		} else {
			return false;
		}
	}

	public static final boolean method576(int arg0, int arg1) {
		return (arg0 & 0x800) != 0 | method556(arg0, arg1) || method575(arg0, arg1);
	}

	public static final boolean method577(int arg0, int arg1) {
		return method555(arg0, arg1) & method559(arg0, arg1);
	}

	public static final boolean method578(int arg0, int arg1) {
		return ((arg0 & 0x2000) != 0 | method553(arg0, arg1) | method582(arg0, arg1)) & method562(arg0, arg1);
	}

	public static final boolean method579(int arg0, int arg1) {
		return (arg0 & 0x40000) != 0 | method570(arg0, arg1) || method575(arg0, arg1);
	}

	public static final boolean method580(int arg0, int arg1) {
		return (arg0 & 0x10) != 0;
	}

	public static final boolean method581(int arg0, int arg1) {
		return (arg0 & 0x20) != 0;
	}

	public static final boolean method582(int arg0, int arg1) {
		return (arg0 & 0x10000) != 0;
	}
}
