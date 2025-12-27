package deob;

public class Class191 {

	public static Class191 aClass191_1863 = new Class191(6, 0, 3, Class86.aClass86_717);

	public static Class191 aClass191_1872 = new Class191(8, 1, 3, Class86.aClass86_717);

	public static int anInt1873 = 16;

	public static Class191 aClass191_1862 = new Class191(1, 2, 4, Class86.aClass86_714);

	public static Class191 aClass191_1861 = new Class191(7, 3, 1, Class86.aClass86_717);

	public static Class191 aClass191_1864 = new Class191(3, 4, 2, Class86.aClass86_717);

	public static Class191 aClass191_1865 = new Class191(0, 5, 3, Class86.aClass86_717);

	public static Class191 aClass191_1866 = new Class191(5, 6, 4, Class86.aClass86_717);

	public static Class191 aClass191_1878 = new Class191(11, 7, 4, Class86.aClass86_717);

	public static Class191 aClass191_1868 = new Class191(10, 8, 4, Class86.aClass86_717);

	public static Class191 aClass191_1869 = new Class191(2, 9, 4, Class86.aClass86_717);

	public static Class191 aClass191_1870 = new Class191(4, 10, 3, Class86.aClass86_717);

	public static Class191 aClass191_1871 = new Class191(9, 11, 3, Class86.aClass86_717);

	public static int anInt1874 = Class64.method779(16, -1003506360);

	public int anInt1860;

	public int anInt1875;

	public int anInt1877;

	public Class86 aClass86_1867;

	public int anInt1876;

	public Class191(int arg0, int arg1, int arg2, Class86 arg3) {
		this.anInt1860 = arg0;
		this.anInt1875 = arg1;
		this.anInt1877 = arg2;
		this.aClass86_1867 = arg3;
		this.anInt1876 = this.anInt1877 * this.aClass86_1867.anInt724;
		if (this.anInt1875 >= 16) {
			throw new RuntimeException();
		}
	}

	public static Class191 method2098(int arg0) {
		switch(arg0) {
			case 0:
				return aClass191_1863;
			case 1:
				return aClass191_1872;
			case 2:
				return aClass191_1862;
			case 3:
				return aClass191_1861;
			case 4:
				return aClass191_1864;
			case 5:
				return aClass191_1865;
			case 6:
				return aClass191_1866;
			default:
				return null;
		}
	}
}
