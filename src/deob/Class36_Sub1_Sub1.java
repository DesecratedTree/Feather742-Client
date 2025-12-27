package deob;

public class Class36_Sub1_Sub1 extends Class36_Sub1 {

	public int anInt9363;

	public int anInt9360;

	public float aFloat9361;

	public float aFloat9362;

	public boolean aBoolean9364;

	public boolean aBoolean9359;

	public static Class36_Sub1_Sub1 method524(Class_ra_Sub1 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
		if (arg0.aBoolean8284 || Class380.method4393(arg1, 689585641) && Class380.method4393(arg2, 113398130)) {
			return new Class36_Sub1_Sub1(arg0, 3553, arg1, arg2, arg3, arg4, arg5, arg6);
		} else if (arg0.aBoolean8411) {
			return new Class36_Sub1_Sub1(arg0, 34037, arg1, arg2, arg3, arg4, arg5, arg6);
		} else {
			return new Class36_Sub1_Sub1(arg0, arg1, arg2, Class136.method1594(arg1, 1698072762), Class136.method1594(arg2, 1956482005), arg4);
		}
	}

	public static Class36_Sub1_Sub1 method525(Class_ra_Sub1 arg0, Class72 arg1, Class86 arg2, int arg3, int arg4) {
		if (arg0.aBoolean8284 || Class380.method4393(arg3, 363332220) && Class380.method4393(arg4, -1933742227)) {
			return new Class36_Sub1_Sub1(arg0, 3553, arg1, arg2, arg3, arg4);
		} else if (arg0.aBoolean8411) {
			return new Class36_Sub1_Sub1(arg0, 34037, arg1, arg2, arg3, arg4);
		} else {
			return new Class36_Sub1_Sub1(arg0, arg1, arg2, arg3, arg4, Class136.method1594(arg3, 2028864730), Class136.method1594(arg4, 1676817059));
		}
	}

	public static Class36_Sub1_Sub1 method526(Class_ra_Sub1 arg0, Class72 arg1, Class86 arg2, int arg3, int arg4, boolean arg5, byte[] arg6, Class72 arg7) {
		if (arg0.aBoolean8284 || Class380.method4393(arg3, -1425966052) && Class380.method4393(arg4, -452281940)) {
			return new Class36_Sub1_Sub1(arg0, 3553, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
		} else if (arg0.aBoolean8411) {
			return new Class36_Sub1_Sub1(arg0, 34037, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
		} else {
			return new Class36_Sub1_Sub1(arg0, arg1, arg2, arg3, arg4, Class136.method1594(arg3, 1942860160), Class136.method1594(arg4, 1778778976), arg6, arg7);
		}
	}

	public static Class36_Sub1_Sub1 method527(Class_ra_Sub1 arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0.aBoolean8284 || Class380.method4393(arg3, -322477643) && Class380.method4393(arg4, -167441293)) {
			return new Class36_Sub1_Sub1(arg0, 3553, arg1, arg2, arg3, arg4, true);
		} else if (arg0.aBoolean8411) {
			return new Class36_Sub1_Sub1(arg0, 34037, arg1, arg2, arg3, arg4, true);
		} else {
			return new Class36_Sub1_Sub1(arg0, arg1, arg2, arg3, arg4, Class136.method1594(arg3, 1896887096), Class136.method1594(arg4, 1615179305), true);
		}
	}

	public Class36_Sub1_Sub1(Class_ra_Sub1 arg0, int arg1, Class72 arg2, Class86 arg3, int arg4, int arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt9363 = arg4;
		this.anInt9360 = arg5;
		if (this.anInt375 == 34037) {
			this.aFloat9361 = arg5;
			this.aFloat9362 = arg4;
			this.aBoolean9364 = false;
		} else {
			this.aFloat9361 = 1.0F;
			this.aFloat9362 = 1.0F;
			this.aBoolean9364 = true;
		}
		this.aBoolean9359 = false;
	}

	public Class36_Sub1_Sub1(Class_ra_Sub1 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt9363 = arg2;
		this.anInt9360 = arg3;
		if (this.anInt375 == 34037) {
			this.aFloat9361 = arg3;
			this.aFloat9362 = arg2;
			this.aBoolean9364 = false;
		} else {
			this.aFloat9361 = 1.0F;
			this.aFloat9362 = 1.0F;
			this.aBoolean9364 = true;
		}
		this.aBoolean9359 = false;
	}

	public Class36_Sub1_Sub1(Class_ra_Sub1 arg0, int arg1, Class72 arg2, Class86 arg3, int arg4, int arg5, boolean arg6, byte[] arg7, Class72 arg8) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, true);
		this.anInt9363 = arg4;
		this.anInt9360 = arg5;
		if (this.anInt375 == 34037) {
			this.aFloat9361 = arg5;
			this.aFloat9362 = arg4;
			this.aBoolean9364 = false;
		} else {
			this.aFloat9361 = 1.0F;
			this.aFloat9362 = 1.0F;
			this.aBoolean9364 = true;
		}
		this.aBoolean9359 = false;
	}

	public void method528(boolean arg0) {
		super.method515(arg0 && !this.aBoolean9359);
	}

	public Class36_Sub1_Sub1(Class_ra_Sub1 arg0, Class72 arg1, Class86 arg2, int arg3, int arg4, int arg5, int arg6) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt9363 = arg3;
		this.anInt9360 = arg4;
		this.aFloat9361 = (float) arg4 / (float) arg6;
		this.aFloat9362 = (float) arg3 / (float) arg5;
		this.aBoolean9364 = false;
		this.aBoolean9359 = true;
		this.method518(false, false);
	}

	public Class36_Sub1_Sub1(Class_ra_Sub1 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
		super(arg0, 3553, Class72.aClass72_620, Class86.aClass86_714, arg3, arg4);
		this.anInt9363 = arg1;
		this.anInt9360 = arg2;
		this.method522(0, arg4 - arg2, arg1, arg2, arg5, 0, 0, true);
		this.aFloat9361 = (float) arg2 / (float) arg4;
		this.aFloat9362 = (float) arg1 / (float) arg3;
		this.aBoolean9364 = false;
		this.aBoolean9359 = true;
		this.method518(false, false);
	}

	public Class36_Sub1_Sub1(Class_ra_Sub1 arg0, Class72 arg1, Class86 arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, Class72 arg8) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt9363 = arg3;
		this.anInt9360 = arg4;
		this.method519(0, arg6 - arg4, arg3, arg4, arg7, arg8, 0, 0, true);
		this.aFloat9361 = (float) arg4 / (float) arg6;
		this.aFloat9362 = (float) arg3 / (float) arg5;
		this.aBoolean9364 = false;
		this.aBoolean9359 = true;
		this.method518(false, false);
	}

	public void method529(boolean arg0) {
		super.method515(arg0 && !this.aBoolean9359);
	}

	public void method515(boolean arg0) {
		super.method515(arg0 && !this.aBoolean9359);
	}

	public Class36_Sub1_Sub1(Class_ra_Sub1 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt9363 = arg4;
		this.anInt9360 = arg5;
		if (this.anInt375 == 34037) {
			this.aFloat9361 = arg5;
			this.aFloat9362 = arg4;
			this.aBoolean9364 = false;
		} else {
			this.aFloat9361 = 1.0F;
			this.aFloat9362 = 1.0F;
			this.aBoolean9364 = true;
		}
		this.aBoolean9359 = false;
	}

	public Class36_Sub1_Sub1(Class_ra_Sub1 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt9363 = arg3;
		this.anInt9360 = arg4;
		this.aFloat9361 = (float) arg4 / (float) arg6;
		this.aFloat9362 = (float) arg3 / (float) arg5;
		this.aBoolean9364 = false;
		this.aBoolean9359 = true;
		this.method518(false, false);
	}

	public void method530(boolean arg0) {
		super.method515(arg0 && !this.aBoolean9359);
	}
}
