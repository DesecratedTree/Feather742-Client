package deob;

import java.io.EOFException;
import java.io.IOException;

public class Class489 {

	public static int anInt5840 = 200000000;

	public long aLong5849 = -1L;

	public long aLong5845 = -1L;

	public int anInt5846 = 0;

	public Class490 aClass490_5841;

	public long aLong5842;

	public long aLong5848;

	public byte[] aByteArray5850;

	public byte[] aByteArray5844;

	public long aLong5847;

	public int anInt5843;

	public long aLong5839;

	public Class489(Class490 arg0, int arg1, int arg2) throws IOException {
		this.aClass490_5841 = arg0;
		this.aLong5848 = this.aLong5842 = arg0.method6066(1742373643);
		this.aByteArray5850 = new byte[arg1];
		this.aByteArray5844 = new byte[arg2];
		this.aLong5847 = 0L;
	}

	public void method6053(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
		try {
			try {
				if ((long) arg2 + this.aLong5847 > this.aLong5848) {
					this.aLong5848 = (long) arg2 + this.aLong5847;
				}
				if (this.aLong5845 != -1L && (this.aLong5847 < this.aLong5845 || this.aLong5847 > (long) this.anInt5846 + this.aLong5845)) {
					this.method6058(-2071072981);
				}
				if (this.aLong5845 != -1L && this.aLong5847 + (long) arg2 > (long) this.aByteArray5844.length + this.aLong5845) {
					int var5 = (int) ((long) this.aByteArray5844.length - (this.aLong5847 - this.aLong5845));
					System.arraycopy(arg0, arg1, this.aByteArray5844, (int) (this.aLong5847 - this.aLong5845), var5);
					this.aLong5847 += var5;
					arg1 += var5;
					arg2 -= var5;
					this.anInt5846 = this.aByteArray5844.length;
					this.method6058(-2085612550);
				}
				if (arg2 > this.aByteArray5844.length) {
					if (this.aLong5839 != this.aLong5847) {
						this.aClass490_5841.method6065(this.aLong5847);
						this.aLong5839 = this.aLong5847;
					}
					this.aClass490_5841.method6068(arg0, arg1, arg2, -1154489731);
					this.aLong5839 += arg2;
					if (this.aLong5839 > this.aLong5842) {
						this.aLong5842 = this.aLong5839;
					}
					long var12 = -1L;
					long var7 = -1L;
					if (this.aLong5847 >= this.aLong5849 && this.aLong5847 < (long) this.anInt5843 + this.aLong5849) {
						var12 = this.aLong5847;
					} else if (this.aLong5849 >= this.aLong5847 && this.aLong5849 < this.aLong5847 + (long) arg2) {
						var12 = this.aLong5849;
					}
					if (this.aLong5847 + (long) arg2 > this.aLong5849 && (long) arg2 + this.aLong5847 <= (long) this.anInt5843 + this.aLong5849) {
						var7 = (long) arg2 + this.aLong5847;
					} else if (this.aLong5849 + (long) this.anInt5843 > this.aLong5847 && this.aLong5849 + (long) this.anInt5843 <= (long) arg2 + this.aLong5847) {
						var7 = this.aLong5849 + (long) this.anInt5843;
					}
					if (var12 > -1L && var7 > var12) {
						int var9 = (int) (var7 - var12);
						System.arraycopy(arg0, (int) ((long) arg1 + var12 - this.aLong5847), this.aByteArray5850, (int) (var12 - this.aLong5849), var9);
					}
					this.aLong5847 += arg2;
				} else if (arg2 > 0) {
					if (this.aLong5845 == -1L) {
						this.aLong5845 = this.aLong5847;
					}
					System.arraycopy(arg0, arg1, this.aByteArray5844, (int) (this.aLong5847 - this.aLong5845), arg2);
					this.aLong5847 += arg2;
					if (this.aLong5847 - this.aLong5845 > (long) this.anInt5846) {
						this.anInt5846 = (int) (this.aLong5847 - this.aLong5845);
					}
				}
			} catch (IOException var10) {
				this.aLong5839 = -1L;
				throw var10;
			}
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "uf.f(" + ')');
		}
	}

	public void method6054(int arg0) throws IOException {
		try {
			this.method6058(-2102590674);
			this.aClass490_5841.method6064(-148524324);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "uf.r(" + ')');
		}
	}

	public void method6055(long arg0) throws IOException {
		try {
			if (arg0 < 0L) {
				throw new IOException();
			}
			this.aLong5847 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "uf.j(" + ')');
		}
	}

	public long method6056(int arg0) {
		try {
			return this.aLong5848;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "uf.i(" + ')');
		}
	}

	public void method6057(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
		try {
			try {
				if (arg2 + arg1 > arg0.length) {
					throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
				}
				if (this.aLong5845 != -1L && this.aLong5847 >= this.aLong5845 && this.aLong5847 + (long) arg2 <= (long) this.anInt5846 + this.aLong5845) {
					System.arraycopy(this.aByteArray5844, (int) (this.aLong5847 - this.aLong5845), arg0, arg1, arg2);
					this.aLong5847 += arg2;
					return;
				}
				long var5 = this.aLong5847;
				int var7 = arg1;
				int var8 = arg2;
				int var9;
				if (this.aLong5847 >= this.aLong5849 && this.aLong5847 < this.aLong5849 + (long) this.anInt5843) {
					var9 = (int) ((long) this.anInt5843 - (this.aLong5847 - this.aLong5849));
					if (var9 > arg2) {
						var9 = arg2;
					}
					System.arraycopy(this.aByteArray5850, (int) (this.aLong5847 - this.aLong5849), arg0, arg1, var9);
					this.aLong5847 += var9;
					arg1 += var9;
					arg2 -= var9;
				}
				if (arg2 > this.aByteArray5850.length) {
					this.aClass490_5841.method6065(this.aLong5847);
					this.aLong5839 = this.aLong5847;
					while (arg2 > 0) {
						var9 = this.aClass490_5841.method6067(arg0, arg1, arg2, (byte) 58);
						if (var9 == -1) {
							if (arg3 != 0) {
								return;
							}
							break;
						}
						this.aLong5839 += var9;
						this.aLong5847 += var9;
						arg1 += var9;
						arg2 -= var9;
					}
				} else if (arg2 > 0) {
					this.method6059((byte) -82);
					var9 = arg2;
					if (arg2 > this.anInt5843) {
						var9 = this.anInt5843;
					}
					System.arraycopy(this.aByteArray5850, 0, arg0, arg1, var9);
					arg1 += var9;
					arg2 -= var9;
					this.aLong5847 += var9;
				}
				if (this.aLong5845 != -1L) {
					if (this.aLong5845 > this.aLong5847 && arg2 > 0) {
						var9 = arg1 + (int) (this.aLong5845 - this.aLong5847);
						if (var9 > arg2 + arg1) {
							var9 = arg2 + arg1;
						}
						while (arg1 < var9) {
							arg0[arg1++] = 0;
							arg2--;
							this.aLong5847++;
						}
					}
					long var16 = -1L;
					long var11 = -1L;
					if (this.aLong5845 >= var5 && this.aLong5845 < (long) var8 + var5) {
						var16 = this.aLong5845;
					} else if (var5 >= this.aLong5845 && var5 < this.aLong5845 + (long) this.anInt5846) {
						var16 = var5;
					}
					if (this.aLong5845 + (long) this.anInt5846 > var5 && (long) this.anInt5846 + this.aLong5845 <= (long) var8 + var5) {
						var11 = (long) this.anInt5846 + this.aLong5845;
					} else if (var5 + (long) var8 > this.aLong5845 && (long) var8 + var5 <= (long) this.anInt5846 + this.aLong5845) {
						var11 = (long) var8 + var5;
					}
					if (var16 > -1L && var11 > var16) {
						int var13 = (int) (var11 - var16);
						System.arraycopy(this.aByteArray5844, (int) (var16 - this.aLong5845), arg0, var7 + (int) (var16 - var5), var13);
						if (var11 > this.aLong5847) {
							arg2 = (int) ((long) arg2 - (var11 - this.aLong5847));
							this.aLong5847 = var11;
						}
					}
				}
			} catch (IOException var14) {
				this.aLong5839 = -1L;
				throw var14;
			}
			if (arg2 > 0) {
				throw new EOFException();
			}
		} catch (RuntimeException var15) {
			throw Class476.method5964(var15, "uf.o(" + ')');
		}
	}

	public void method6058(int arg0) throws IOException {
		try {
			if (this.aLong5845 != -1L) {
				if (this.aLong5839 != this.aLong5845) {
					this.aClass490_5841.method6065(this.aLong5845);
					this.aLong5839 = this.aLong5845;
				}
				this.aClass490_5841.method6068(this.aByteArray5844, 0, this.anInt5846, -1154489731);
				this.aLong5839 += (long) (this.anInt5846 * -655684045) * 831954171L;
				if (this.aLong5839 > this.aLong5842) {
					this.aLong5842 = this.aLong5839;
				}
				long var2 = -1L;
				long var4 = -1L;
				if (this.aLong5845 >= this.aLong5849 && this.aLong5845 < (long) this.anInt5843 + this.aLong5849) {
					var2 = this.aLong5845;
				} else if (this.aLong5849 >= this.aLong5845 && this.aLong5849 < this.aLong5845 + (long) this.anInt5846) {
					var2 = this.aLong5849;
				}
				if (this.aLong5845 + (long) this.anInt5846 > this.aLong5849 && this.aLong5845 + (long) this.anInt5846 <= (long) this.anInt5843 + this.aLong5849) {
					var4 = (long) this.anInt5846 + this.aLong5845;
				} else if ((long) this.anInt5843 + this.aLong5849 > this.aLong5845 && this.aLong5849 + (long) this.anInt5843 <= this.aLong5845 + (long) this.anInt5846) {
					var4 = this.aLong5849 + (long) this.anInt5843;
				}
				if (var2 > -1L && var4 > var2) {
					int var6 = (int) (var4 - var2);
					System.arraycopy(this.aByteArray5844, (int) (var2 - this.aLong5845), this.aByteArray5850, (int) (var2 - this.aLong5849), var6);
				}
				this.aLong5845 = -1L;
				this.anInt5846 = 0;
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "uf.z(" + ')');
		}
	}

	public void method6059(byte arg0) throws IOException {
		try {
			this.anInt5843 = 0;
			if (this.aLong5847 != this.aLong5839) {
				this.aClass490_5841.method6065(this.aLong5847);
				this.aLong5839 = this.aLong5847;
			}
			this.aLong5849 = this.aLong5847;
			while (this.anInt5843 < this.aByteArray5850.length) {
				int var3 = this.aByteArray5850.length - this.anInt5843;
				if (var3 > 200000000) {
					var3 = 200000000;
				}
				int var2 = this.aClass490_5841.method6067(this.aByteArray5850, this.anInt5843, var3, (byte) 8);
				if (var2 == -1) {
					if (arg0 >= -1) {
					}
					break;
				}
				this.aLong5839 += var2;
				this.anInt5843 += var2;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "uf.s(" + ')');
		}
	}

	public void method6060(byte[] arg0, short arg1) throws IOException {
		try {
			this.method6057(arg0, 0, arg0.length, (byte) 0);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "uf.p(" + ')');
		}
	}

	public static final void method6061(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 850500310);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class100.method1208(var3, var4, arg0, 423212371);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "uf.mn(" + ')');
		}
	}

	public static final void method6062(Class430 arg0, byte arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class464_Sub23.aClass350_8712.method4030(34823472);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "uf.vq(" + ')');
		}
	}

	public static Interface33 method6063(int arg0) {
		try {
			if (Class544.anInterface33_6256 == null) {
				throw new IllegalStateException("");
			}
			return Class544.anInterface33_6256;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "uf.j(" + ')');
		}
	}
}
