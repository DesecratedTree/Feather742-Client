package deob;

import java.io.IOException;
import java.net.Socket;

public class Class357_Sub1 extends Class357 {

	public Socket aSocket8000;

	public Class359 aClass359_8001;

	public Class345 aClass345_8002;

	public boolean method4194(int arg0, int arg1) throws IOException {
		try {
			return this.aClass359_8001.method4235(arg0, -2044719181);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aeb.j(" + ')');
		}
	}

	public void method4197(int arg0) {
		try {
			this.aClass345_8002.method4004(-2030879973);
			try {
				this.aSocket8000.close();
			} catch (IOException var3) {
			}
			this.aClass359_8001.method4234(65280);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aeb.s(" + ')');
		}
	}

	public int method4204(int arg0) throws IOException {
		try {
			return this.aClass359_8001.method4232((byte) 48);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aeb.i(" + ')');
		}
	}

	public boolean method4199(int arg0) throws IOException {
		return this.aClass359_8001.method4235(arg0, -658678883);
	}

	public void method4210(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
		try {
			this.aClass345_8002.method4006(arg0, arg1, arg2, (byte) -73);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "aeb.o(" + ')');
		}
	}

	public Class357_Sub1(Socket arg0, int arg1) throws IOException {
		this.aSocket8000 = arg0;
		this.aSocket8000.setSoTimeout(30000);
		this.aSocket8000.setTcpNoDelay(true);
		this.aClass359_8001 = new Class359(this.aSocket8000.getInputStream(), arg1);
		this.aClass345_8002 = new Class345(this.aSocket8000.getOutputStream(), arg1);
	}

	public void method4198(short arg0) {
		try {
			this.aClass359_8001.method4233(-48853683);
			this.aClass345_8002.method4005(-129205854);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aeb.f(" + ')');
		}
	}

	public void finalize() {
		try {
			this.method4197(1463544803);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "aeb.finalize(" + ')');
		}
	}

	public int method4202() throws IOException {
		return this.aClass359_8001.method4232((byte) 8);
	}

	public boolean method4200(int arg0) throws IOException {
		return this.aClass359_8001.method4235(arg0, -632452247);
	}

	public int method4207(byte[] arg0, int arg1, int arg2) throws IOException {
		return this.aClass359_8001.method4236(arg0, arg1, arg2, 377082629);
	}

	public void method4196(byte[] arg0, int arg1, int arg2) throws IOException {
		this.aClass345_8002.method4006(arg0, arg1, arg2, (byte) -23);
	}

	public int method4203(byte[] arg0, int arg1, int arg2) throws IOException {
		return this.aClass359_8001.method4236(arg0, arg1, arg2, 1551196575);
	}

	public boolean method4201(int arg0) throws IOException {
		return this.aClass359_8001.method4235(arg0, -851479904);
	}

	public int method4205(byte[] arg0, int arg1, int arg2) throws IOException {
		return this.aClass359_8001.method4236(arg0, arg1, arg2, -994480924);
	}

	public int method4195(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
		try {
			return this.aClass359_8001.method4236(arg0, arg1, arg2, 465986220);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "aeb.p(" + ')');
		}
	}

	public void method4206(byte[] arg0, int arg1, int arg2) throws IOException {
		this.aClass345_8002.method4006(arg0, arg1, arg2, (byte) -94);
	}

	public void method4193() {
		this.aClass345_8002.method4004(-2062238258);
		try {
			this.aSocket8000.close();
		} catch (IOException var2) {
		}
		this.aClass359_8001.method4234(65280);
	}

	public void method4208() {
		this.aClass345_8002.method4004(-2064240908);
		try {
			this.aSocket8000.close();
		} catch (IOException var2) {
		}
		this.aClass359_8001.method4234(65280);
	}

	public void method4209() {
		this.aClass359_8001.method4233(-192128115);
		this.aClass345_8002.method4005(-307280088);
	}
}
