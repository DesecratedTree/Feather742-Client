package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Class506 {

	public String aString5923 = "null";

	public int anInt5927 = 0;

	public char aChar5921;

	public char aChar5926;

	public int anInt5924;

	public HashMap aHashMap5928;

	public Map aMap5925;

	public Object[] anObjectArray5922;

	public void method6142(Buffer arg0, int arg1, int arg2) {
		try {
			if (arg1 == 1) {
				this.aChar5926 = Class127.method1546(arg0.readByte((byte) 52), -1876839012);
			} else if (arg1 == 2) {
				this.aChar5921 = Class127.method1546(arg0.readByte((byte) 73), -2044637400);
			} else if (arg1 == 3) {
				this.aString5923 = arg0.readString(-967113629);
			} else if (arg1 == 4) {
				this.anInt5924 = arg0.readInt((byte) 52);
			} else {
				int var4;
				int var5;
				if (arg1 == 5 || arg1 == 6) {
					this.anInt5927 = arg0.readUnsignedShort(1911403885);
					this.aMap5925 = new HashMap(this.anInt5927);
					for (var4 = 0; var4 < this.anInt5927; var4++) {
						var5 = arg0.readInt((byte) 59);
						Object var6;
						if (arg1 == 5) {
							var6 = arg0.readString(-62627479);
						} else {
							var6 = Integer.valueOf(arg0.readInt((byte) 49));
						}
						this.aMap5925.put(Integer.valueOf(var5), var6);
					}
				} else if (arg1 == 7 || arg1 == 8) {
					var4 = arg0.readUnsignedShort(1026066243);
					this.anInt5927 = arg0.readUnsignedShort(2048176061);
					this.anObjectArray5922 = new Object[var4];
					for (var5 = 0; var5 < this.anInt5927; var5++) {
						int var8 = arg0.readUnsignedShort(1967644521);
						if (arg1 == 7) {
							this.anObjectArray5922[var8] = arg0.readString(-462775013);
						} else {
							this.anObjectArray5922[var8] = Integer.valueOf(arg0.readInt((byte) 93));
						}
					}
				}
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ux.j(" + ')');
		}
	}

	public int method6143(int arg0, int arg1) {
		try {
			Object var3 = this.method6145(arg0, (byte) -15);
			return var3 == null ? this.anInt5924 : (Integer) var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ux.i(" + ')');
		}
	}

	public String method6144(int arg0, byte arg1) {
		try {
			Object var3 = this.method6145(arg0, (byte) -115);
			return var3 == null ? this.aString5923 : (String) var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ux.p(" + ')');
		}
	}

	public Object method6145(int arg0, byte arg1) {
		try {
			if (this.anObjectArray5922 == null) {
				return this.aMap5925 == null ? null : this.aMap5925.get(Integer.valueOf(arg0));
			} else if (arg0 >= 0 && arg0 < this.anObjectArray5922.length) {
				return this.anObjectArray5922[arg0];
			} else {
				return null;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ux.o(" + ')');
		}
	}

	public boolean method6146(Object arg0, byte arg1) {
		try {
			if (this.anInt5927 == 0) {
				return false;
			} else {
				if (this.aHashMap5928 == null) {
					this.method6149(16711680);
				}
				return this.aHashMap5928.containsKey(arg0);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ux.s(" + ')');
		}
	}

	public int[] method6147(Object arg0, int arg1) {
		try {
			if (this.anInt5927 == 0) {
				return null;
			} else {
				if (this.aHashMap5928 == null) {
					this.method6149(16711680);
				}
				return (int[]) this.aHashMap5928.get(arg0);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ux.f(" + ')');
		}
	}

	public int method6148(int arg0) {
		try {
			return this.anInt5927;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ux.z(" + ')');
		}
	}

	public void method6149(int arg0) {
		try {
			HashMap var2 = new HashMap();
			List var5;
			Iterator var11;
			Entry var12;
			if (this.anObjectArray5922 == null) {
				if (this.aMap5925 == null) {
					throw new IllegalStateException();
				}
				var11 = this.aMap5925.entrySet().iterator();
				while (var11.hasNext()) {
					var12 = (Entry) var11.next();
					Object var13 = var12.getValue();
					List var6 = (List) var2.get(var13);
					if (var6 == null) {
						var6 = new LinkedList();
						var2.put(var13, var6);
					}
					var6.add(var12.getKey());
				}
			} else {
				for (int var3 = 0; var3 < this.anObjectArray5922.length; var3++) {
					if (this.anObjectArray5922[var3] != null) {
						Object var4 = this.anObjectArray5922[var3];
						var5 = (List) var2.get(var4);
						if (var5 == null) {
							var5 = new LinkedList();
							var2.put(var4, var5);
						}
						var5.add(Integer.valueOf(var3));
					} else if (arg0 != 16711680) {
						return;
					}
				}
			}
			this.aHashMap5928 = new HashMap();
			var11 = var2.entrySet().iterator();
			while (var11.hasNext()) {
				var12 = (Entry) var11.next();
				var5 = (List) var12.getValue();
				int[] var14 = new int[var5.size()];
				int var7 = 0;
				Iterator var8 = var5.iterator();
				while (var8.hasNext()) {
					Integer var9 = (Integer) var8.next();
					var14[var7++] = var9;
				}
				if (this.anObjectArray5922 == null) {
					Arrays.sort(var14);
				}
				this.aHashMap5928.put(var12.getKey(), var14);
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "ux.w(" + ')');
		}
	}

	public void method6150(Buffer arg0, int arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(1699817699);
				if (var3 == 0) {
					if (arg1 != 1505010051) {
					}
					return;
				}
				this.method6142(arg0, var3, -1278885461);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ux.r(" + ')');
		}
	}

	public static final void method6151(byte arg0) {
		try {
			if (!client.aBoolean9075) {
				client.aFloat9072 += (24.0F - client.aFloat9072) / 2.0F;
				client.aBoolean9038 = true;
				client.aBoolean9075 = true;
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "ux.hc(" + ')');
		}
	}
}
