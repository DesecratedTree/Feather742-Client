package deob;

public class Class34 {

	public Class_ra_Sub1 aClass_ra_Sub1_361;

	public jaclib.memory.Buffer aBuffer360;

	public void method505(byte[] arg0, int arg1) {
		if (this.aBuffer360 == null || this.aBuffer360.r() < arg1) {
			this.aBuffer360 = this.aClass_ra_Sub1_361.aNativeHeap8308.j(arg1, false);
		}
		this.aBuffer360.i(arg0, 0, 0, arg1);
	}

	public Class34(Class_ra_Sub1 arg0, jaclib.memory.Buffer arg1) {
		this.aClass_ra_Sub1_361 = arg0;
		this.aBuffer360 = arg1;
	}

	public Class34(Class_ra_Sub1 arg0, byte[] arg1, int arg2) {
		this.aClass_ra_Sub1_361 = arg0;
		this.aBuffer360 = this.aClass_ra_Sub1_361.aNativeHeap8308.j(arg2, false);
		if (arg1 != null) {
			this.aBuffer360.i(arg1, 0, 0, arg2);
		}
	}
}
