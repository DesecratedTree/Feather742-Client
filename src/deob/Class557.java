package deob;

import java.util.zip.Inflater;

public class Class557 {

	public static int anInt6399;

	public Inflater anInflater6398;

	public Class557() {
		this(-1, 1000000, 1000000);
	}

	public Class557(int arg0, int arg1, int arg2) {
	}

	public byte[] method6452(byte[] arg0, short arg1) {
		try {
			Buffer var3 = new Buffer(arg0);
			var3.offset = arg0.length - 4;
			int var4 = var3.method3806((byte) 105);
			byte[] var5 = new byte[var4];
			var3.offset = 0;
			this.method6453(var3, var5, 646057109);
			return var5;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "xf.r(" + ')');
		}
	}

	public void method6453(Buffer arg0, byte[] arg1, int arg2) {
		try {
			if (arg0.payload[arg0.offset] != 31 || arg0.payload[arg0.offset + 1] != -117) {
				throw new RuntimeException("");
			}
			if (this.anInflater6398 == null) {
				this.anInflater6398 = new Inflater(true);
			}
			try {
				this.anInflater6398.setInput(arg0.payload, arg0.offset + 10, arg0.payload.length - (arg0.offset + 10 + 8));
				this.anInflater6398.inflate(arg1);
			} catch (Exception var5) {
				this.anInflater6398.reset();
				throw new RuntimeException("");
			}
			this.anInflater6398.reset();
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "xf.j(" + ')');
		}
	}

	public static String method6454(int arg0, int arg1, int arg2) {
		try {
			int var3 = arg1 - arg0;
			if (var3 < -9) {
				return Class146.method1738(16711680, -849826454);
			} else if (var3 < -6) {
				return Class146.method1738(16723968, -849826454);
			} else if (var3 < -3) {
				return Class146.method1738(16740352, -849826454);
			} else if (var3 < 0) {
				return Class146.method1738(16756736, -849826454);
			} else if (var3 > 9) {
				return Class146.method1738(65280, -849826454);
			} else if (var3 > 6) {
				return Class146.method1738(4259584, -849826454);
			} else if (var3 > 3) {
				return Class146.method1738(8453888, -849826454);
			} else if (var3 > 0) {
				return Class146.method1738(12648192, -849826454);
			} else {
				return Class146.method1738(16776960, -849826454);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "xf.bx(" + ')');
		}
	}
}
