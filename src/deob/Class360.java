package deob;

public class Class360 {

	public static int anInt3743 = 55;

	public static int anInt3744 = 288;

	public static int anInt3746 = 96;

	public static int anInt3747 = 182;

	public static int anInt3751 = 4;

	public static int anInt3752 = 1;

	public static int anInt3755 = 40;

	public static int anInt3757 = 68;

	public static int anInt3758 = 78;

	public static int anInt3759 = 108;

	public static int anInt3761 = 155;

	public static int anInt3762 = 115;

	public static int anInt3763 = 122;

	public static int anInt3764 = 137;

	public static int anInt3765 = 227;

	public static int anInt3766 = 12;

	public static int anInt3767 = 168;

	public static int anInt3768 = 172;

	public static int anInt3770 = 193;

	public static int anInt3771 = 204;

	public static int anInt3772 = 215;

	public static boolean aBoolean3773 = false;

	public static int anInt3774 = 236;

	public static int anInt3778 = 140;

	public static int anInt3788 = 34;

	public static int anInt3789 = 87;

	public static int anInt3790 = 103;

	public static boolean aBoolean3748 = false;

	public static int anInt3749 = -1;

	public static long aLong3750 = -1L;

	public static int anInt3769 = 1;

	public static long aLong3776 = 0L;

	public static String username = "";

	public static String password = "";

	public static int anInt3779 = 0;

	public static int anInt3780 = 0;

	public static int anInt3781 = -2;

	public static int anInt3775 = -2;

	public static int anInt3760 = -2;

	public static int anInt3784 = -1;

	public static int anInt3785 = -1;

	public static int anInt3786 = 0;

	public static int anInt3787 = -1;

	public static int anInt3756 = -1;

	public static int anInt3753 = 0;

	public static boolean lobby = false;

	public static int anInt3754 = 0;

	public static boolean aBoolean3792 = false;

	public static int anInt3791;

	public static Class1 aClass1_3783;

	public Class360() throws Throwable {
		throw new Error();
	}

	public static void method4241(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11, short arg12) {
		try {
			if (!Class484.aBoolean5782 && Class484.anInt5786 < 520) {
				int var17 = arg2 == -1 ? client.anInt9147 : arg2;
				Class330_Sub36_Sub10 var15 = new Class330_Sub36_Sub10(arg0, arg1, var17, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
				Class153.method1793(var15, (byte) 124);
			}
		} catch (RuntimeException var16) {
			throw Class476.method5964(var16, "p.u(" + ')');
		}
	}

	public static boolean method4242(int arg0) {
		try {
			return Class110.anInt1152 != 0;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "p.q(" + ')');
		}
	}

	public static Class95 method4243(Buffer arg0, int arg1) {
		try {
			int var2 = arg0.readUnsignedByte(1779729665);
			Class558 var3 = Class394.method4632(var2, (byte) 54);
			Class95 var4 = null;
			switch(var3.anInt6426) {
				case 0:
					var4 = new Class95_Sub8(arg0);
					break;
				case 1:
					var4 = new Class95_Sub15(arg0);
					break;
				case 2:
					var4 = new Class95_Sub2(arg0);
					break;
				case 3:
					var4 = new Class95_Sub13(arg0);
					break;
				case 4:
					var4 = new Class95_Sub22(arg0);
					break;
				case 5:
					var4 = new Class95_Sub5(arg0);
					break;
				case 6:
					var4 = new Class95_Sub21(arg0);
					break;
				case 7:
					var4 = new Class95_Sub7(arg0);
					break;
				case 8:
					var4 = new Class95_Sub3(arg0, 0, 0);
					break;
				case 9:
					var4 = new Class95_Sub20(arg0, true);
					break;
				case 10:
					var4 = new Class95_Sub1(arg0);
					break;
				case 11:
					var4 = new Class95_Sub3(arg0, 0, 1);
					break;
				case 12:
					var4 = new Class95_Sub18(arg0);
					break;
				case 13:
					var4 = new Class95_Sub10(arg0);
				case 14:
				case 21:
				case 24:
				default:
					break;
				case 15:
					var4 = new Class95_Sub12_Sub2(arg0);
					break;
				case 16:
					var4 = new Class95_Sub20(arg0, false);
					break;
				case 17:
					var4 = new Class95_Sub14(arg0);
					break;
				case 18:
					var4 = new Class95_Sub12_Sub1(arg0);
					break;
				case 19:
					var4 = new Class95_Sub3(arg0, 1, 0);
					break;
				case 20:
					var4 = new Class95_Sub4(arg0);
					break;
				case 22:
					var4 = new Class95_Sub9(arg0);
					break;
				case 23:
					var4 = new Class95_Sub19(arg0);
					break;
				case 25:
					var4 = new Class95_Sub11(arg0);
					break;
				case 26:
					var4 = new Class95_Sub17(arg0);
					break;
				case 27:
					var4 = new Class95_Sub16(arg0);
					break;
				case 28:
					var4 = new Class95_Sub23(arg0);
					break;
				case 29:
					var4 = new Class95_Sub3(arg0, 1, 1);
					break;
				case 30:
					var4 = new Class95_Sub6(arg0);
			}
			return var4;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "p.r(" + ')');
		}
	}

	public static String method4244(long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return null;
			} else if (arg0 % 37L == 0L) {
				return null;
			} else {
				int var2 = 0;
				for (long var3 = arg0; var3 != 0L; var3 /= 37L) {
					var2++;
				}
				StringBuilder var7 = new StringBuilder(var2);
				while (arg0 != 0L) {
					long var4 = arg0;
					arg0 /= 37L;
					var7.append(Class443.aCharArray4493[(int) (var4 - arg0 * 37L)]);
				}
				return var7.reverse().toString();
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "p.j(" + ')');
		}
	}

	public static final void method4245(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class110.method1362(var3, var4, arg0, (byte) 116);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "p.mt(" + ')');
		}
	}

	public static final void method4246(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			if (Class3.aClass120Array56[var2] == null) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class3.aClass120Array56[var2].aClass114Array1400[var3].anInt1195;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "p.anp(" + ')');
		}
	}
}
