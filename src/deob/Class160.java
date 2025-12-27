package deob;

public class Class160 {

	public static final boolean method1878(int arg0, int arg1) {
		return (arg0 & 0x21) != 0;
	}

	public static final boolean method1879(int arg0, int arg1) {
		return (arg0 & 0x22) != 0;
	}

	public static final boolean method1880(int arg0, int arg1) {
		return (arg0 & 0x34) != 0;
	}

	public static final boolean method1881(int arg0, int arg1) {
		return (arg0 & 0x37) != 0;
	}

	public static final boolean method1882(int arg0, int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}

	public static final boolean method1883(int arg0, int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	public static final boolean method1884(int arg0, int arg1) {
		return (arg0 & 0x100) != 0;
	}

	public static final boolean method1885(int arg0, int arg1) {
		boolean var2 = (arg1 & 0x37) == 0 ? method1908(arg0, arg1) : method1893(arg0, arg1);
		return (arg0 & 0x10000) != 0 | method1882(arg0, arg1) | var2;
	}

	public Class160() throws Throwable {
		throw new Error();
	}

	public static final boolean method1886(int arg0, int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	public static final boolean method1887(int arg0, int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	public static final boolean method1888(int arg0, int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	public static final boolean method1889(int arg0, int arg1) {
		return (arg0 & 0x800) != 0;
	}

	public static final boolean method1890(int arg0, int arg1) {
		return (arg0 & 0x800) != 0;
	}

	public static final boolean method1891(int arg0, int arg1) {
		return (arg0 & 0x800) != 0;
	}

	public static final boolean method1892(int arg0, int arg1) {
		return (method1878(arg0, arg1) | method1879(arg0, arg1) | method1880(arg0, arg1)) & method1899(arg0, arg1);
	}

	public static final boolean method1893(int arg0, int arg1) {
		return method1888(arg0, arg1) & ((arg0 & 0x2000) != 0 | method1882(arg0, arg1) | method1887(arg0, arg1));
	}

	public static final boolean method1894(int arg0, int arg1) {
		return method1906(arg0, arg1) & method1890(arg0, arg1);
	}

	public static final boolean method1895(int arg0, int arg1) {
		return method1910(arg0, arg1) & method1891(arg0, arg1);
	}

	public static final boolean method1896(int arg0, int arg1) {
		return (arg0 & 0x70000) != 0 || method1878(arg0, arg1) || method1892(arg0, arg1);
	}

	public static final boolean method1897(int arg0, int arg1) {
		return (arg0 & 0x70000) != 0 || method1879(arg0, arg1) || method1892(arg0, arg1);
	}

	public static final boolean method1898(int arg0, int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	public static final boolean method1899(int arg0, int arg1) {
		return (arg0 & 0x800) != 0;
	}

	public static final boolean method1900(int arg0, int arg1) {
		return (arg0 & 0x40000) != 0 | method1884(arg0, arg1) || method1908(arg0, arg1);
	}

	public static final boolean method1901(int arg0, int arg1) {
		return method1906(arg0, arg1) || method1894(arg0, arg1);
	}

	public static final boolean method1902(int arg0, int arg1) {
		return (arg0 & 0x180) != 0;
	}

	public static final boolean method1903(int arg0, int arg1) {
		return (arg0 & 0x20) != 0;
	}

	public static final boolean method1904(int arg0, int arg1) {
		return (arg0 & 0x400) != 0;
	}

	public static final boolean method1905(int arg0, int arg1) {
		return (arg0 & 0x800) != 0 | method1898(arg0, arg1) || method1908(arg0, arg1);
	}

	public static final boolean method1906(int arg0, int arg1) {
		return false;
	}

	public static final boolean method1907(int arg0, int arg1) {
		return (arg0 & 0x60000) != 0 | method1910(arg0, arg1) || method1895(arg0, arg1);
	}

	public static final boolean method1908(int arg0, int arg1) {
		if (method1889(arg0, arg1)) {
			return (arg0 & 0x9000) != 0 | method1883(arg0, arg1) | method1884(arg0, arg1) ? true : (arg1 & 0x37) == 0 & ((arg0 & 0x2000) != 0 | method1882(arg0, arg1) | method1887(arg0, arg1));
		} else {
			return false;
		}
	}

	public static final boolean method1909(int arg0, int arg1) {
		return (arg0 & 0x70000) != 0 || method1880(arg0, arg1) || method1892(arg0, arg1);
	}

	public static final boolean method1910(int arg0, int arg1) {
		return (arg0 & 0x10) != 0;
	}

	public static final boolean method1911(int arg0, int arg1) {
		return method1883(arg0, arg1) || method1908(arg0, arg1);
	}
}
