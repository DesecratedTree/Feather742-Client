package deob;

import jaggl.OpenGL;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;

public class Class35 {

	public static int anInt362 = 35632;

	public static int anInt363 = 1;

	public static int anInt364 = 43594;

	public static int[] anIntArray364 = new int[2];

	public static int anInt365 = 0;

	public Class_ra_Sub1 aClass_ra_Sub1_365;

	public int anInt366;

	public static Class35 method506(Class_ra_Sub1 arg0, int arg1, String arg2) {
		int var3 = OpenGL.glCreateShader(arg1);
		OpenGL.glShaderSource(var3, arg2);
		OpenGL.glCompileShader(var3);
		OpenGL.glGetShaderiv(var3, 35713, anIntArray364, 0);
		if (anIntArray364[0] == 0) {
			OpenGL.glGetShaderiv(var3, 35716, anIntArray364, 1);
			if (anIntArray364[1] > 1) {
				byte[] var4 = new byte[anIntArray364[1]];
				OpenGL.glGetShaderInfoLog(var3, anIntArray364[1], anIntArray364, 0, var4, 0);
				System.out.println(new String(var4));
			}
			if (anIntArray364[0] == 0) {
				OpenGL.glDeleteShader(var3);
				return null;
			}
		}
		return new Class35(arg0, var3, arg1);
	}

	public static int method3213(int arg0) {
		try {
			InetAddress var1 = InetAddress.getLocalHost();
			NetworkInterface var2 = NetworkInterface.getByInetAddress(var1);
			if (arg0 != ByteBuffer.wrap(var2.getHardwareAddress()).getInt()) {
				return 0;
			}
			return ByteBuffer.wrap(var2.getHardwareAddress()).getInt();
		} catch (SocketException var3) {
			var3.printStackTrace();
		} catch (UnknownHostException var4) {
			var4.printStackTrace();
		}
		return 0;
	}

	public Class35(Class_ra_Sub1 arg0, int arg1, int arg2) {
		this.aClass_ra_Sub1_365 = arg0;
		this.anInt366 = arg1;
	}
}
