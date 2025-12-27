package deob;

public class Class330_Sub26_Sub3 extends Class330_Sub26 {

	public byte aByte9578;

	public byte aByte9579;

	public Class167 aClass167_9580;

	public String aString9577;

	public void method3391(Class330_Sub39 arg0) {
		arg0.aString7757 = this.aString9577;
		if (this.aString9577 != null) {
			arg0.aByte7764 = this.aByte9578;
			arg0.aByte7765 = this.aByte9579;
		}
	}

	public void method3388(Buffer arg0, int arg1) {
		try {
			this.aString9577 = arg0.method3761(1797122681);
			if (this.aString9577 != null) {
				arg0.readUnsignedByte(1453451408);
				this.aByte9578 = arg0.readByte((byte) -2);
				this.aByte9579 = arg0.readByte((byte) -23);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aio.r(" + ')');
		}
	}

	public void method3389(Class330_Sub39 arg0, int arg1) {
		try {
			arg0.aString7757 = this.aString9577;
			if (this.aString9577 != null) {
				arg0.aByte7764 = this.aByte9578;
				arg0.aByte7765 = this.aByte9579;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aio.j(" + ')');
		}
	}

	public void method3390(Buffer arg0) {
		this.aString9577 = arg0.method3761(1962340130);
		if (this.aString9577 != null) {
			arg0.readUnsignedByte(-35595207);
			this.aByte9578 = arg0.readByte((byte) 61);
			this.aByte9579 = arg0.readByte((byte) 0);
		}
	}

	public void method3387(Class330_Sub39 arg0) {
		arg0.aString7757 = this.aString9577;
		if (this.aString9577 != null) {
			arg0.aByte7764 = this.aByte9578;
			arg0.aByte7765 = this.aByte9579;
		}
	}

	public Class330_Sub26_Sub3(Class167 arg0) {
	}

	public void method3392(Class330_Sub39 arg0) {
		arg0.aString7757 = this.aString9577;
		if (this.aString9577 != null) {
			arg0.aByte7764 = this.aByte9578;
			arg0.aByte7765 = this.aByte9579;
		}
	}

	public static void method3396(int arg0, byte arg1) {
		try {
			if (Class527.method6269(1974121162)) {
				if (Class360.anInt3749 != arg0) {
					Class360.aLong3750 = -1L;
				}
				Class360.anInt3749 = arg0;
				client.aClass1_9060.method379(1175619289);
				Class227.method2311(3, -1188873169);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aio.l(" + ')');
		}
	}
}
