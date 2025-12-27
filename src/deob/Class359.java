package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class Class359 implements Runnable {

	public int anInt3739 = 0;

	public int anInt3741 = 0;

	public InputStream anInputStream3738;

	public int anInt3736;

	public byte[] aByteArray3737;

	public Thread aThread3740;

	public IOException anIOException3742;

	public Class359(InputStream arg0, int arg1) {
		this.anInputStream3738 = arg0;
		this.anInt3736 = arg1 + 1;
		this.aByteArray3737 = new byte[this.anInt3736];
		this.aThread3740 = new Thread(this);
		this.aThread3740.setDaemon(true);
		this.aThread3740.start();
	}

	public int method4232(byte arg0) throws IOException {
		try {
			synchronized (this) {
				int var3;
				if (this.anInt3739 <= this.anInt3741) {
					var3 = this.anInt3741 - this.anInt3739;
				} else {
					var3 = this.anInt3741 + (this.anInt3736 - this.anInt3739);
				}
				if (this.anIOException3742 != null) {
					throw new IOException(this.anIOException3742.toString());
				}
				this.notifyAll();
				return var3;
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "oz.j(" + ')');
		}
	}

    public void run() {
        try {
            while (true) {
                int space;

                synchronized (this) {
                    if (this.anIOException3742 != null) {
                        return;
                    }

                    if (this.anInt3739 == 0) {
                        space = this.anInt3736 - this.anInt3741 - 1;
                    } else if (this.anInt3739 <= this.anInt3741) {
                        space = this.anInt3736 - this.anInt3741;
                    } else {
                        space = this.anInt3739 - this.anInt3741 - 1;
                    }

                    if (space <= 0) {
                        try {
                            this.wait();   // ✅ now legal
                        } catch (InterruptedException ignored) {
                        }
                        continue;
                    }
                }

                int bytesRead;
                try {
                    bytesRead = this.anInputStream3738.read(
                            this.aByteArray3737,
                            this.anInt3741,
                            space
                    );

                    if (bytesRead == -1) {
                        throw new EOFException();
                    }
                } catch (IOException e) {
                    synchronized (this) {
                        this.anIOException3742 = e;
                        return;
                    }
                }

                synchronized (this) {
                    this.anInt3741 = (this.anInt3741 + bytesRead) % this.anInt3736;
                    this.notifyAll();
                }
            }
        } catch (RuntimeException e) {
            throw Class476.method5964(e, "oz.run()");
        }
    }

	public void method4233(int arg0) {
		try {
			this.anInputStream3738 = new InputStream_Sub1();
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "oz.o(" + ')');
		}
	}

	public void method4234(int arg0) {
		try {
			synchronized (this) {
				if (this.anIOException3742 == null) {
					this.anIOException3742 = new IOException("");
				}
				this.notifyAll();
			}
			try {
				this.aThread3740.join();
			} catch (InterruptedException var4) {
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "oz.p(" + ')');
		}
	}

	public boolean method4235(int arg0, int arg1) throws IOException {
		try {
			if (arg0 <= 0 || arg0 >= this.anInt3736) {
				throw new IOException();
			}
			synchronized (this) {
				int var4;
				if (this.anInt3739 <= this.anInt3741) {
					var4 = this.anInt3741 - this.anInt3739;
				} else {
					var4 = this.anInt3736 - this.anInt3739 + this.anInt3741;
				}
				if (var4 >= arg0) {
					return true;
				} else if (this.anIOException3742 == null) {
					this.notifyAll();
					return false;
				} else {
					throw new IOException(this.anIOException3742.toString());
				}
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "oz.r(" + ')');
		}
	}

	public int method4236(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
		try {
			if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
				throw new IOException();
			}
			synchronized (this) {
				int var6;
				if (this.anInt3739 <= this.anInt3741) {
					var6 = this.anInt3741 - this.anInt3739;
				} else {
					var6 = this.anInt3736 - this.anInt3739 + this.anInt3741;
				}
				if (arg2 > var6) {
					arg2 = var6;
				}
				if (arg2 == 0 && this.anIOException3742 != null) {
					throw new IOException(this.anIOException3742.toString());
				}
				if (this.anInt3739 + arg2 <= this.anInt3736) {
					System.arraycopy(this.aByteArray3737, this.anInt3739, arg0, arg1, arg2);
				} else {
					int var7 = this.anInt3736 - this.anInt3739;
					System.arraycopy(this.aByteArray3737, this.anInt3739, arg0, arg1, var7);
					System.arraycopy(this.aByteArray3737, 0, arg0, var7 + arg1, arg2 - var7);
				}
				this.anInt3739 = (arg2 + this.anInt3739) % this.anInt3736;
				this.notifyAll();
				return arg2;
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "oz.i(" + ')');
		}
	}

	public static final void method4237(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4394[arg0.anInt4397];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = ((Player) arg0.aClass432_Sub1_Sub1_Sub1_4396).aClass65_10249.method780(var2, (byte) 40);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "oz.al(" + ')');
		}
	}

	public static final void method4238(byte arg0) {
		try {
			Class330_Sub46_Sub2 var1 = client.aClass1_9025.aClass330_Sub46_Sub2_17;
			var1.method3820(1283857115);
			int var2 = var1.readBits(8);
			int var3;
			if (var2 < client.anInt9017) {
				for (var3 = var2; var3 < client.anInt9017; var3++) {
					client.anIntArray9021[++client.anInt9022 - 1] = client.anIntArray9018[var3];
				}
			}
			if (var2 > client.anInt9017) {
				throw new RuntimeException();
			}
			client.anInt9017 = 0;
			for (var3 = 0; var3 < var2; var3++) {
				int var4 = client.anIntArray9018[var3];
				NPC var5 = (NPC) ((Class330_Sub35) client.aClass497_9014.method6094((long) var4)).anObject7733;
				int var6 = var1.readBits(1);
				if (var6 == 0) {
					client.anIntArray9018[++client.anInt9017 - 1] = var4;
					var5.anInt10069 = client.anInt8996;
				} else {
					int var7 = var1.readBits(2);
					if (var7 == 0) {
						client.anIntArray9018[++client.anInt9017 - 1] = var4;
						var5.anInt10069 = client.anInt8996;
						client.anIntArray9020[++client.anInt9019 - 1] = var4;
					} else {
						Class293 var8;
						if (var7 == 1) {
							client.anIntArray9018[++client.anInt9017 - 1] = var4;
							var5.anInt10069 = client.anInt8996;
							var8 = (Class293) Class479.method6015(Class476.method5962(-2003654600), var1.readBits(3), (byte) 17);
							var5.method5477(var8, Class299.aClass299_6807.aByte6805, (byte) -32);
							int var9 = var1.readBits(1);
							if (var9 == 1) {
								client.anIntArray9020[++client.anInt9019 - 1] = var4;
							}
						} else if (var7 == 2) {
							client.anIntArray9018[++client.anInt9017 - 1] = var4;
							var5.anInt10069 = client.anInt8996;
							if (var1.readBits(1) == 1) {
								var8 = (Class293) Class479.method6015(Class476.method5962(-1628524193), var1.readBits(3), (byte) 0);
								var5.method5477(var8, Class299.aClass299_6808.aByte6805, (byte) -111);
								Class293 var12 = (Class293) Class479.method6015(Class476.method5962(-2100325618), var1.readBits(3), (byte) 2);
								var5.method5477(var12, Class299.aClass299_6808.aByte6805, (byte) -73);
							} else {
								var8 = (Class293) Class479.method6015(Class476.method5962(-312582088), var1.readBits(3), (byte) 110);
								var5.method5477(var8, Class299.aClass299_6806.aByte6805, (byte) -27);
							}
							int var11 = var1.readBits(1);
							if (var11 == 1) {
								client.anIntArray9020[++client.anInt9019 - 1] = var4;
							}
						} else if (var7 == 3) {
							client.anIntArray9021[++client.anInt9022 - 1] = var4;
						}
					}
				}
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "oz.kp(" + ')');
		}
	}

	public static Class524 method4239(byte arg0) {
		try {
			Class524 var1;
			if (!Class484.aBoolean5807) {
				var1 = Class477_Sub1.aClass524_8749;
			} else if (Class483.aClass263_5775 == null || Class384.aClass524_3969 == null) {
				var1 = Class477_Sub1.aClass524_8749;
			} else {
				var1 = Class384.aClass524_3969;
			}
			Class484.anInt5779 = var1.anInt6033 + var1.anInt6035;
			return var1;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "oz.b(" + ')');
		}
	}

	public static char method4240(char arg0, int arg1) {
		try {
			if (arg0 == 198) {
				return 'E';
			} else if (arg0 == 230) {
				return 'e';
			} else if (arg0 == 223) {
				return 's';
			} else if (arg0 == 338) {
				return 'E';
			} else {
				return (char) (arg0 == 339 ? 'e' : '\u0000');
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "oz.i(" + ')');
		}
	}
}
