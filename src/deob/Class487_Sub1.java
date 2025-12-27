package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

public class Class487_Sub1 extends Class487 {

	public static String aString8753 = "java.net.useSystemProxies";

	public ProxySelector aProxySelector8754 = ProxySelector.getDefault();

	public Socket method6035() throws IOException {
		boolean var1 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!var1) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		boolean var2 = this.anInt5826 * 1320395777 == 443;
		List var3;
		List var4;
		try {
			var3 = this.aProxySelector8754.select(new URI((var2 ? "https" : "http") + "://" + this.aString5827));
			var4 = this.aProxySelector8754.select(new URI((var2 ? "http" : "https") + "://" + this.aString5827));
		} catch (URISyntaxException var15) {
			return this.method6033((short) 18708);
		}
		var3.addAll(var4);
		Object[] var5 = var3.toArray();
		IOException_Sub1 var6 = null;
		Object[] var7 = var5;
		for (int var8 = 0; var8 < var7.length; var8++) {
			Object var9 = var7[var8];
			Proxy var10 = (Proxy) var9;
			try {
				Socket var12 = this.method6038(var10, -838580961);
				if (var12 != null) {
					return var12;
				}
			} catch (IOException_Sub1 var13) {
				var6 = var13;
			} catch (IOException var14) {
			}
		}
		if (var6 != null) {
			throw var6;
		}
		return this.method6033((short) 13419);
	}

	public Socket method6038(Proxy arg0, int arg1) throws IOException {
		try {
			if (arg0.type() == Type.DIRECT) {
				return this.method6033((short) 27097);
			}
			SocketAddress var3 = arg0.address();
			if (!(var3 instanceof InetSocketAddress)) {
				return null;
			}
			InetSocketAddress var4 = (InetSocketAddress) var3;
			if (arg0.type() == Type.HTTP) {
				String var16 = null;
				try {
					Class var6 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
					Method var7 = var6.getDeclaredMethod("getProxyAuth", Class.forName("java.lang.String"), Integer.TYPE);
					var7.setAccessible(true);
					Object var8 = var7.invoke(null, var4.getHostName(), Integer.valueOf(var4.getPort()));
					if (var8 != null) {
						Method var9 = var6.getDeclaredMethod("supportsPreemptiveAuthorization");
						var9.setAccessible(true);
						if ((Boolean) var9.invoke(var8)) {
							Method var10 = var6.getDeclaredMethod("getHeaderName");
							var10.setAccessible(true);
							Method var11 = var6.getDeclaredMethod("getHeaderValue", Class.forName("java.net.URL"), Class.forName("java.lang.String"));
							var11.setAccessible(true);
							String var12 = (String) var10.invoke(var8);
							String var13 = (String) var11.invoke(var8, new URL("https://" + this.aString5827 + "/"), "https");
							var16 = var12 + ": " + var13;
						}
					}
				} catch (Exception var14) {
				}
				return this.method6039(var4.getHostName(), var4.getPort(), var16, -1964047254);
			} else if (arg0.type() == Type.SOCKS) {
				Socket var5 = new Socket(arg0);
				var5.connect(new InetSocketAddress(this.aString5827, this.anInt5826 * 1320395777));
				return var5;
			} else {
				return null;
			}
		} catch (RuntimeException var15) {
			throw Class476.method5964(var15, "agq.z(" + ')');
		}
	}

	public Socket method6034() throws IOException {
		boolean var1 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!var1) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		boolean var2 = this.anInt5826 * 1320395777 == 443;
		List var3;
		List var4;
		try {
			var3 = this.aProxySelector8754.select(new URI((var2 ? "https" : "http") + "://" + this.aString5827));
			var4 = this.aProxySelector8754.select(new URI((var2 ? "http" : "https") + "://" + this.aString5827));
		} catch (URISyntaxException var15) {
			return this.method6033((short) 6623);
		}
		var3.addAll(var4);
		Object[] var5 = var3.toArray();
		IOException_Sub1 var6 = null;
		Object[] var7 = var5;
		for (int var8 = 0; var8 < var7.length; var8++) {
			Object var9 = var7[var8];
			Proxy var10 = (Proxy) var9;
			try {
				Socket var12 = this.method6038(var10, -1591044308);
				if (var12 != null) {
					return var12;
				}
			} catch (IOException_Sub1 var13) {
				var6 = var13;
			} catch (IOException var14) {
			}
		}
		if (var6 != null) {
			throw var6;
		}
		return this.method6033((short) 15869);
	}

	public Socket method6039(String arg0, int arg1, String arg2, int arg3) throws IOException {
		try {
			Socket var5 = new Socket(arg0, arg1);
			var5.setSoTimeout(10000);
			OutputStream var6 = var5.getOutputStream();
			if (arg2 == null) {
				var6.write(("CONNECT " + this.aString5827 + ":" + this.anInt5826 * 1320395777 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
			} else {
				var6.write(("CONNECT " + this.aString5827 + ":" + this.anInt5826 * 1320395777 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
			}
			var6.flush();
			BufferedReader var7 = new BufferedReader(new InputStreamReader(var5.getInputStream()));
			String var8 = var7.readLine();
			if (var8 != null) {
				label59: {
					if (!var8.startsWith("HTTP/1.0 200") && !var8.startsWith("HTTP/1.1 200")) {
						if (!var8.startsWith("HTTP/1.0 407") && !var8.startsWith("HTTP/1.1 407")) {
							break label59;
						}
						int var9 = 0;
						String var10 = "proxy-authenticate: ";
						var8 = var7.readLine();
						while (var8 != null && var9 < 50) {
							if (var8.toLowerCase().startsWith(var10)) {
								var8 = var8.substring(var10.length()).trim();
								int var11 = var8.indexOf(32);
								if (var11 != -1) {
									var8 = var8.substring(0, var11);
								}
								throw new IOException_Sub1(var8);
							}
							var8 = var7.readLine();
							var9++;
						}
						throw new IOException_Sub1("");
					}
					return var5;
				}
			}
			var6.close();
			var7.close();
			var5.close();
			return null;
		} catch (RuntimeException var12) {
			throw Class476.method5964(var12, "agq.w(" + ')');
		}
	}

	public Socket method6036(int arg0) throws IOException {
		try {
			boolean var2 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
			if (!var2) {
				System.setProperty("java.net.useSystemProxies", "true");
			}
			boolean var3 = this.anInt5826 * 1320395777 == 443;
			List var4;
			List var5;
			try {
				var4 = this.aProxySelector8754.select(new URI((var3 ? "https" : "http") + "://" + this.aString5827));
				var5 = this.aProxySelector8754.select(new URI((var3 ? "http" : "https") + "://" + this.aString5827));
			} catch (URISyntaxException var14) {
				return this.method6033((short) 13748);
			}
			var4.addAll(var5);
			Object[] var6 = var4.toArray();
			IOException_Sub1 var7 = null;
			Object[] var8 = var6;
			for (int var9 = 0; var9 < var8.length; var9++) {
				Object var10 = var8[var9];
				Proxy var11 = (Proxy) var10;
				try {
					Socket var13 = this.method6038(var11, -709740602);
					if (var13 != null) {
						Socket var12 = var13;
						return var12;
					}
				} catch (IOException_Sub1 var15) {
					var7 = var15;
				} catch (IOException var16) {
				}
			}
			if (var7 != null) {
				throw var7;
			}
			return this.method6033((short) 28412);
		} catch (RuntimeException var17) {
			throw Class476.method5964(var17, "agq.j(" + ')');
		}
	}

	public static Class299[] method6040(int arg0) {
		try {
			return new Class299[] { Class299.aClass299_6809, Class299.aClass299_6806, Class299.aClass299_6808, Class299.aClass299_6807 };
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "agq.r(" + ')');
		}
	}

	public static boolean method6041(int arg0, int arg1) {
		try {
			if (arg0 == 18 || arg0 == 19 || arg0 == 20 || arg0 == 21 || arg0 == 22 || arg0 == 1004) {
				return true;
			} else {
				return arg0 == 17;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "agq.bk(" + ')');
		}
	}
}
