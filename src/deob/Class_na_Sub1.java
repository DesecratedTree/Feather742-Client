package deob;

public class Class_na_Sub1 extends Class_na {

	public static int anInt10155 = 16;

	public byte[] aByteArray10160;

	public int anInt10156;

	public int anInt10157;

	public int anInt10158;

	public int anInt10159;

	public void method3524(int arg0, int arg1, int arg2, int arg3) {
		this.anInt10158 = arg0;
		this.anInt10156 = arg1;
		this.anInt10157 = arg2 - arg0;
		this.anInt10159 = arg3 - arg1;
	}

	public void method3525() {
		int var1 = -1;
		int var2 = this.aByteArray10160.length - 8;
		while (var1 < var2) {
			var1++;
			this.aByteArray10160[var1] = 0;
			var1++;
			this.aByteArray10160[var1] = 0;
			var1++;
			this.aByteArray10160[var1] = 0;
			var1++;
			this.aByteArray10160[var1] = 0;
			var1++;
			this.aByteArray10160[var1] = 0;
			var1++;
			this.aByteArray10160[var1] = 0;
			var1++;
			this.aByteArray10160[var1] = 0;
			var1++;
			this.aByteArray10160[var1] = 0;
		}
		while (var1 < this.aByteArray10160.length - 1) {
			var1++;
			this.aByteArray10160[var1] = 0;
		}
	}

	public Class_na_Sub1(Class_ra_Sub2 arg0, int arg1, int arg2) {
		this.aByteArray10160 = new byte[arg1 * arg2];
	}

	public static final void method3526(byte[] arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 >= arg4) {
			return;
		}
		arg1 += arg3;
		int var11 = arg4 - arg3 >> 2;
		while (true) {
			var11--;
			if (var11 < 0) {
				var11 = arg4 - arg3 & 0x3;
				while (true) {
					var11--;
					if (var11 < 0) {
						return;
					}
					arg0[arg1++] = 1;
				}
			}
			int var5 = arg1 + 1;
			arg0[arg1] = 1;
			int var6 = var5 + 1;
			arg0[var5] = 1;
			int var7 = var6 + 1;
			arg0[var6] = 1;
			arg1 = var7 + 1;
			arg0[var7] = 1;
		}
	}

	public void method3527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 0;
		if (arg1 != arg0) {
			var7 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		int var8 = 0;
		if (arg2 != arg1) {
			var8 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		int var9 = 0;
		if (arg2 != arg0) {
			var9 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg1 < arg2) {
				arg5 = arg3 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= var9 * arg0;
					arg3 -= var7 * arg0;
					arg0 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= var8 * arg1;
					arg1 = 0;
				}
				if (arg0 != arg1 && var9 < var7 || arg0 == arg1 && var9 > var8) {
					arg2 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt10157;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method3526(this.aByteArray10160, arg0, 0, arg5 >> 16, arg4 >> 16);
								arg5 += var9;
								arg4 += var8;
								arg0 += this.anInt10157;
							}
						}
						method3526(this.aByteArray10160, arg0, 0, arg5 >> 16, arg3 >> 16);
						arg5 += var9;
						arg3 += var7;
						arg0 += this.anInt10157;
					}
				} else {
					arg2 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt10157;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method3526(this.aByteArray10160, arg0, 0, arg4 >> 16, arg5 >> 16);
								arg5 += var9;
								arg4 += var8;
								arg0 += this.anInt10157;
							}
						}
						method3526(this.aByteArray10160, arg0, 0, arg3 >> 16, arg5 >> 16);
						arg5 += var9;
						arg3 += var7;
						arg0 += this.anInt10157;
					}
				}
			} else {
				arg4 = arg3 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= var9 * arg0;
					arg3 -= var7 * arg0;
					arg0 = 0;
				}
				arg5 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= var8 * arg2;
					arg2 = 0;
				}
				if (arg0 != arg2 && var9 < var7 || arg0 == arg2 && var8 > var7) {
					arg1 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt10157;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method3526(this.aByteArray10160, arg0, 0, arg5 >> 16, arg3 >> 16);
								arg5 += var8;
								arg3 += var7;
								arg0 += this.anInt10157;
							}
						}
						method3526(this.aByteArray10160, arg0, 0, arg4 >> 16, arg3 >> 16);
						arg4 += var9;
						arg3 += var7;
						arg0 += this.anInt10157;
					}
				} else {
					arg1 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt10157;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method3526(this.aByteArray10160, arg0, 0, arg3 >> 16, arg5 >> 16);
								arg5 += var8;
								arg3 += var7;
								arg0 += this.anInt10157;
							}
						}
						method3526(this.aByteArray10160, arg0, 0, arg3 >> 16, arg4 >> 16);
						arg4 += var9;
						arg3 += var7;
						arg0 += this.anInt10157;
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg2 < arg0) {
				arg3 = arg4 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= var7 * arg1;
					arg4 -= var8 * arg1;
					arg1 = 0;
				}
				arg5 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= var9 * arg2;
					arg2 = 0;
				}
				if ((arg1 == arg2 || var7 >= var8) && (arg1 != arg2 || var7 <= var9)) {
					arg0 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt10157;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method3526(this.aByteArray10160, arg1, 0, arg5 >> 16, arg3 >> 16);
								arg3 += var7;
								arg5 += var9;
								arg1 += this.anInt10157;
							}
						}
						method3526(this.aByteArray10160, arg1, 0, arg4 >> 16, arg3 >> 16);
						arg3 += var7;
						arg4 += var8;
						arg1 += this.anInt10157;
					}
				} else {
					arg0 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt10157;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method3526(this.aByteArray10160, arg1, 0, arg3 >> 16, arg5 >> 16);
								arg3 += var7;
								arg5 += var9;
								arg1 += this.anInt10157;
							}
						}
						method3526(this.aByteArray10160, arg1, 0, arg3 >> 16, arg4 >> 16);
						arg3 += var7;
						arg4 += var8;
						arg1 += this.anInt10157;
					}
				}
			} else {
				arg5 = arg4 <<= 0x10;
				if (arg1 < 0) {
					arg5 -= var7 * arg1;
					arg4 -= var8 * arg1;
					arg1 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= var9 * arg0;
					arg0 = 0;
				}
				if (var7 < var8) {
					arg2 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt10157;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method3526(this.aByteArray10160, arg1, 0, arg3 >> 16, arg4 >> 16);
								arg3 += var9;
								arg4 += var8;
								arg1 += this.anInt10157;
							}
						}
						method3526(this.aByteArray10160, arg1, 0, arg5 >> 16, arg4 >> 16);
						arg5 += var7;
						arg4 += var8;
						arg1 += this.anInt10157;
					}
				} else {
					arg2 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt10157;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method3526(this.aByteArray10160, arg1, 0, arg4 >> 16, arg3 >> 16);
								arg3 += var9;
								arg4 += var8;
								arg1 += this.anInt10157;
							}
						}
						method3526(this.aByteArray10160, arg1, 0, arg4 >> 16, arg5 >> 16);
						arg5 += var7;
						arg4 += var8;
						arg1 += this.anInt10157;
					}
				}
			}
		} else if (arg0 < arg1) {
			arg4 = arg5 <<= 0x10;
			if (arg2 < 0) {
				arg4 -= var8 * arg2;
				arg5 -= var9 * arg2;
				arg2 = 0;
			}
			arg3 <<= 0x10;
			if (arg0 < 0) {
				arg3 -= var7 * arg0;
				arg0 = 0;
			}
			if (var8 < var9) {
				arg1 -= arg0;
				arg0 -= arg2;
				arg2 *= this.anInt10157;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							method3526(this.aByteArray10160, arg2, 0, arg4 >> 16, arg3 >> 16);
							arg4 += var8;
							arg3 += var7;
							arg2 += this.anInt10157;
						}
					}
					method3526(this.aByteArray10160, arg2, 0, arg4 >> 16, arg5 >> 16);
					arg4 += var8;
					arg5 += var9;
					arg2 += this.anInt10157;
				}
			} else {
				arg1 -= arg0;
				arg0 -= arg2;
				arg2 *= this.anInt10157;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							method3526(this.aByteArray10160, arg2, 0, arg3 >> 16, arg4 >> 16);
							arg4 += var8;
							arg3 += var7;
							arg2 += this.anInt10157;
						}
					}
					method3526(this.aByteArray10160, arg2, 0, arg5 >> 16, arg4 >> 16);
					arg4 += var8;
					arg5 += var9;
					arg2 += this.anInt10157;
				}
			}
		} else {
			arg3 = arg5 <<= 0x10;
			if (arg2 < 0) {
				arg3 -= var8 * arg2;
				arg5 -= var9 * arg2;
				arg2 = 0;
			}
			arg4 <<= 0x10;
			if (arg1 < 0) {
				arg4 -= var7 * arg1;
				arg1 = 0;
			}
			if (var8 < var9) {
				arg0 -= arg1;
				arg1 -= arg2;
				arg2 *= this.anInt10157;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							method3526(this.aByteArray10160, arg2, 0, arg4 >> 16, arg5 >> 16);
							arg4 += var7;
							arg5 += var9;
							arg2 += this.anInt10157;
						}
					}
					method3526(this.aByteArray10160, arg2, 0, arg3 >> 16, arg5 >> 16);
					arg3 += var8;
					arg5 += var9;
					arg2 += this.anInt10157;
				}
			} else {
				arg0 -= arg1;
				arg1 -= arg2;
				arg2 *= this.anInt10157;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							method3526(this.aByteArray10160, arg2, 0, arg5 >> 16, arg4 >> 16);
							arg4 += var7;
							arg5 += var9;
							arg2 += this.anInt10157;
						}
					}
					method3526(this.aByteArray10160, arg2, 0, arg5 >> 16, arg3 >> 16);
					arg3 += var8;
					arg5 += var9;
					arg2 += this.anInt10157;
				}
			}
		}
	}

	public boolean method3528(int arg0, int arg1) {
		return this.aByteArray10160.length >= arg0 * arg1;
	}
}
