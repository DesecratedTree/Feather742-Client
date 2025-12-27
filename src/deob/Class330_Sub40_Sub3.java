package deob;

public abstract class Class330_Sub40_Sub3 extends Class330_Sub40 {

	public int anInt9771;

	public int anInt9772;

	public int anInt9773;

	public int anInt9774;

	public int anInt9775;

	public int anInt9776;

	public int anInt9777;

	public int anInt9778;

	public int anInt9779;

	public int anInt9780;

	public int anInt9781;

	public int anInt9782;

	public int anInt9783;

	public int anInt9785;

	public boolean aBoolean9784;

	public final int method3551() {
		try {
			int var1 = this.anInt9775 * 3 >> 6;
			var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
			if (this.anInt9781 == 0) {
				var1 -= var1 * this.anInt9782 / (((Class330_Sub29_Sub1) this.aClass330_Sub29_7770).method3407() << 8);
			} else if (this.anInt9781 >= 0) {
				var1 -= this.anInt9777 * var1 / ((Class330_Sub29_Sub1) this.aClass330_Sub29_7770).method3407();
			}
			return var1 > 255 ? 255 : var1;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "aiq.r(" + ')');
		}
	}

	public final synchronized boolean method3623(int arg0) {
		try {
			return this.anInt9771 != 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aiq.ax(" + ')');
		}
	}

	public final synchronized void method3624(int arg0, int arg1) {
		try {
			this.anInt9781 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aiq.ad(" + ')');
		}
	}

	public final synchronized void method3625(int arg0, byte arg1) {
		try {
			this.method3626(arg0 << 6, this.method3627((short) 255), -2053048090);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aiq.an(" + ')');
		}
	}

	public final synchronized void method3626(int arg0, int arg1, int arg2) {
		try {
			this.anInt9773 = arg0;
			this.anInt9774 = arg1;
			this.anInt9771 = 0;
			this.method3635((byte) 42);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aiq.aa(" + ')');
		}
	}

	public final synchronized int method3627(short arg0) {
		try {
			return this.anInt9774 < 0 ? -1 : this.anInt9774;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aiq.ak(" + ')');
		}
	}

	public final synchronized void method3628(boolean arg0, byte arg1) {
		try {
			this.anInt9772 = (this.anInt9772 >>> 31) + (this.anInt9772 ^ this.anInt9772 >> 31);
			if (arg0) {
				this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aiq.az(" + ')');
		}
	}

	public final synchronized boolean method3629(int arg0) {
		try {
			return this.anInt9782 < 0 || this.anInt9782 >= ((Class330_Sub29_Sub1) this.aClass330_Sub29_7770).method3407() << 8;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aiq.ah(" + ')');
		}
	}

	public final synchronized void method3630(int arg0, int arg1, int arg2) {
		try {
			this.method3642(arg0, arg1, this.method3627((short) 255), (byte) -57);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aiq.ar(" + ')');
		}
	}

	public final Class330_Sub40 method3559() {
		return null;
	}

	public final synchronized void method3631(int arg0, int arg1) {
		try {
			if (arg0 == 0) {
				this.method3643(0, -768598449);
				this.method3252(-316872665);
			} else if (this.anInt9783 == 0 && this.anInt9776 == 0) {
				this.anInt9771 = 0;
				this.anInt9773 = 0;
				this.anInt9775 = 0;
				this.method3252(1532226367);
			} else {
				int var3 = -this.anInt9775;
				if (this.anInt9775 > var3) {
					var3 = this.anInt9775;
				}
				if (-this.anInt9783 > var3) {
					var3 = -this.anInt9783;
				}
				if (this.anInt9783 > var3) {
					var3 = this.anInt9783;
				}
				if (-this.anInt9776 > var3) {
					var3 = -this.anInt9776;
				}
				if (this.anInt9776 > var3) {
					var3 = this.anInt9776;
				}
				if (arg0 > var3) {
					arg0 = var3;
				}
				this.anInt9771 = arg0;
				this.anInt9773 = Integer.MIN_VALUE;
				this.anInt9778 = -this.anInt9775 / arg0;
				this.anInt9785 = -this.anInt9783 / arg0;
				this.anInt9780 = -this.anInt9776 / arg0;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aiq.au(" + ')');
		}
	}

	public final synchronized void method3632(int arg0, byte arg1) {
		try {
			if (this.anInt9772 < 0) {
				this.anInt9772 = -arg0;
			} else {
				this.anInt9772 = arg0;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aiq.ae(" + ')');
		}
	}

	public final synchronized int method3633(byte arg0) {
		try {
			return this.anInt9772 < 0 ? -this.anInt9772 : this.anInt9772;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aiq.ao(" + ')');
		}
	}

	public final boolean method3634(int arg0) {
		try {
			int var2 = this.anInt9773;
			int var3;
			int var4;
			if (Integer.MIN_VALUE == var2) {
				var4 = 0;
				var3 = 0;
				var2 = 0;
			} else {
				var3 = Class219.method2260(var2, this.anInt9774, 21571103);
				var4 = Class330_Sub26_Sub4.method3397(var2, this.anInt9774, (byte) 9);
			}
			if (this.anInt9775 != var2 || this.anInt9783 != var3 || var4 != this.anInt9776) {
				if (this.anInt9775 < var2) {
					this.anInt9778 = 1;
					this.anInt9771 = var2 - this.anInt9775;
				} else if (this.anInt9775 > var2) {
					this.anInt9778 = -1;
					this.anInt9771 = this.anInt9775 - var2;
				} else {
					this.anInt9778 = 0;
				}
				if (this.anInt9783 < var3) {
					this.anInt9785 = 1;
					if (this.anInt9771 == 0 || this.anInt9771 > var3 - this.anInt9783) {
						this.anInt9771 = var3 - this.anInt9783;
					}
				} else if (this.anInt9783 > var3) {
					this.anInt9785 = -1;
					if (this.anInt9771 == 0 || this.anInt9771 > this.anInt9783 - var3) {
						this.anInt9771 = this.anInt9783 - var3;
					}
				} else {
					this.anInt9785 = 0;
				}
				if (this.anInt9776 < var4) {
					this.anInt9780 = 1;
					if (this.anInt9771 == 0 || this.anInt9771 > var4 - this.anInt9776) {
						this.anInt9771 = var4 - this.anInt9776;
					}
				} else if (this.anInt9776 > var4) {
					this.anInt9780 = -1;
					if (this.anInt9771 == 0 || this.anInt9771 > this.anInt9776 - var4) {
						this.anInt9771 = this.anInt9776 - var4;
					}
				} else {
					this.anInt9780 = 0;
				}
				return false;
			} else if (this.anInt9773 == Integer.MIN_VALUE) {
				this.anInt9773 = 0;
				this.anInt9776 = 0;
				this.anInt9783 = 0;
				this.anInt9775 = 0;
				this.method3252(-273436567);
				return true;
			} else {
				this.method3635((byte) 98);
				return false;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aiq.bg(" + ')');
		}
	}

	public final synchronized void method3555(int arg0) {
		try {
			if (this.anInt9771 > 0) {
				if (arg0 >= this.anInt9771) {
					if (this.anInt9773 == Integer.MIN_VALUE) {
						this.anInt9773 = 0;
						this.anInt9776 = 0;
						this.anInt9783 = 0;
						this.anInt9775 = 0;
						this.method3252(-1319347134);
						arg0 = this.anInt9771;
					}
					this.anInt9771 = 0;
					this.method3635((byte) 112);
				} else {
					this.anInt9775 += arg0 * this.anInt9778;
					this.anInt9783 += arg0 * this.anInt9785;
					this.anInt9776 += arg0 * this.anInt9780;
					this.anInt9771 -= arg0;
				}
			}
			int var2 = this.anInt9777 << 8;
			int var3 = this.anInt9779 << 8;
			int var4 = ((Class330_Sub29_Sub1) this.aClass330_Sub29_7770).method3407() << 8;
			int var5 = var3 - var2;
			if (var5 <= 0) {
				this.anInt9781 = 0;
			}
			if (this.anInt9782 < 0) {
				if (this.anInt9772 <= 0) {
					this.method3641((short) -4116);
					this.method3252(1451577568);
					return;
				}
				this.anInt9782 = 0;
			}
			if (this.anInt9782 >= var4) {
				if (this.anInt9772 >= 0) {
					this.method3641((short) 5984);
					this.method3252(1420155488);
					return;
				}
				this.anInt9782 = var4 - 1;
			}
			this.anInt9782 += arg0 * this.anInt9772;
			if (this.anInt9781 >= 0) {
				if (this.anInt9781 > 0) {
					if (this.aBoolean9784) {
						label122: {
							if (this.anInt9772 < 0) {
								if (this.anInt9782 >= var2) {
									return;
								}
								this.anInt9782 = var2 + var2 - 1 - this.anInt9782;
								this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
								if (--this.anInt9781 == 0) {
									break label122;
								}
							}
							do {
								if (this.anInt9782 < var3) {
									return;
								}
								this.anInt9782 = var3 + var3 - 1 - this.anInt9782;
								this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
								if (--this.anInt9781 == 0) {
									break;
								}
								if (this.anInt9782 >= var2) {
									return;
								}
								this.anInt9782 = var2 + var2 - 1 - this.anInt9782;
								this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
							} while (--this.anInt9781 != 0);
						}
					} else {
						label153: {
							int var6;
							if (this.anInt9772 < 0) {
								if (this.anInt9782 < var2) {
									var6 = (var3 - 1 - this.anInt9782) / var5;
									if (var6 >= this.anInt9781) {
										this.anInt9782 += var5 * this.anInt9781;
										this.anInt9781 = 0;
										break label153;
									}
									this.anInt9782 += var5 * var6;
									this.anInt9781 -= var6;
								}
							} else if (this.anInt9782 >= var3) {
								var6 = (this.anInt9782 - var2) / var5;
								if (var6 >= this.anInt9781) {
									this.anInt9782 -= this.anInt9781 * var5;
									this.anInt9781 = 0;
									break label153;
								}
								this.anInt9782 -= var5 * var6;
								this.anInt9781 -= var6;
							}
							return;
						}
					}
				}
				if (this.anInt9772 < 0) {
					if (this.anInt9782 < 0) {
						this.anInt9782 = -1;
						this.method3641((short) 10933);
						this.method3252(1213461018);
					}
				} else if (this.anInt9782 >= var4) {
					this.anInt9782 = var4;
					this.method3641((short) 11968);
					this.method3252(405345125);
				}
			} else if (this.aBoolean9784) {
				if (this.anInt9772 < 0) {
					if (this.anInt9782 >= var2) {
						return;
					}
					this.anInt9782 = var2 + var2 - 1 - this.anInt9782;
					this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
				}
				while (this.anInt9782 >= var3) {
					this.anInt9782 = var3 + var3 - 1 - this.anInt9782;
					this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
					if (this.anInt9782 >= var2) {
						break;
					}
					this.anInt9782 = var2 + var2 - 1 - this.anInt9782;
					this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
				}
			} else if (this.anInt9772 < 0) {
				if (this.anInt9782 < var2) {
					this.anInt9782 = var3 - 1 - (var3 - 1 - this.anInt9782) % var5;
				}
			} else if (this.anInt9782 >= var3) {
				this.anInt9782 = (this.anInt9782 - var2) % var5 + var2;
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "aiq.f(" + ')');
		}
	}

	public final Class330_Sub40 method3552() {
		try {
			return null;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "aiq.j(" + ')');
		}
	}

	public final Class330_Sub40 method3550() {
		try {
			return null;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "aiq.i(" + ')');
		}
	}

	public final void method3635(byte arg0) {
		try {
			this.anInt9775 = this.anInt9773;
			this.anInt9783 = Class219.method2260(this.anInt9773, this.anInt9774, 1429592846);
			this.anInt9776 = Class330_Sub26_Sub4.method3397(this.anInt9773, this.anInt9774, (byte) 20);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aiq.aj(" + ')');
		}
	}

	public final Class330_Sub40 method3556() {
		return null;
	}

	public final Class330_Sub40 method3557() {
		return null;
	}

	public final Class330_Sub40 method3558() {
		return null;
	}

	public final int method3560() {
		return this.anInt9773 * 1488581567 * 1089731647 == 0 && this.anInt9771 * 424994781 * 807250037 == 0 ? 0 : 1;
	}

	public final synchronized void method3568(int arg0) {
		if (this.anInt9771 * 807250037 * 424994781 > 0) {
			if (arg0 >= this.anInt9771 * 807250037 * 424994781) {
				if (this.anInt9773 * 1488581567 * 1089731647 == Integer.MIN_VALUE) {
					this.anInt9773 = 0 * 1488581567;
					this.anInt9776 = 0 * 111438813;
					this.anInt9783 = 0 * 1694000393;
					this.anInt9775 = 0 * -2092094291;
					this.method3252(1555925032);
					arg0 = this.anInt9771 * 807250037 * 424994781;
				}
				this.anInt9771 = 0 * 424994781;
				this.method3635((byte) 104);
			} else {
				this.anInt9775 = (this.anInt9775 * 1875449637 + arg0 * this.anInt9778 * 39705771 * 241122819 * 1875449637) * -2092094291;
				this.anInt9783 = (this.anInt9783 * -1883326151 + arg0 * -1883326151 * 1941232607 * this.anInt9785 * 1108516895) * 1694000393;
				this.anInt9776 = (this.anInt9776 * -1178319755 + arg0 * -1178319755 * -2020606751 * this.anInt9780 * 588138273) * 111438813;
				this.anInt9771 = (this.anInt9771 * 807250037 - arg0 * 807250037) * 424994781;
			}
		}
		int var2 = this.anInt9777 * 216574687 * 1968541983 << 8;
		int var3 = this.anInt9779 * -1955085031 * 2094253865 << 8;
		int var4 = ((Class330_Sub29_Sub1) this.aClass330_Sub29_7770).method3407() << 8;
		int var5 = var3 - var2;
		if (var5 <= 0) {
			this.anInt9781 = 0 * -1618882239;
		}
		if (this.anInt9782 * 2144077895 * -558816905 < 0) {
			if (this.anInt9772 * 598541319 * -542430793 <= 0) {
				this.method3641((short) -6205);
				this.method3252(-2096198180);
				return;
			}
			this.anInt9782 = 0 * -558816905;
		}
		if (this.anInt9782 * 2144077895 * -558816905 >= var4) {
			if (this.anInt9772 * 598541319 * -542430793 >= 0) {
				this.method3641((short) 2897);
				this.method3252(700742672);
				return;
			}
			this.anInt9782 = (var4 - 1) * 2144077895 * -558816905;
		}
		this.anInt9782 = (this.anInt9782 * 2144077895 + arg0 * 598541319 * this.anInt9772 * -542430793 * 2144077895) * -558816905;
		if (this.anInt9781 * 1578352321 * -1618882239 >= 0) {
			if (this.anInt9781 * 1578352321 * -1618882239 > 0) {
				if (this.aBoolean9784) {
					label119: {
						int var10002;
						if (this.anInt9772 * 598541319 * -542430793 < 0) {
							if (this.anInt9782 * -558816905 * 2144077895 >= var2) {
								return;
							}
							this.anInt9782 = (var2 + var2 - 1 - this.anInt9782 * -558816905 * 2144077895) * 2144077895 * -558816905;
							this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
							var10002 = this.anInt9781 * 1578352321 - 1578352321;
							this.anInt9781 = (this.anInt9781 * 1578352321 - 1578352321) * -1618882239;
							if (var10002 * -1618882239 == 0) {
								break label119;
							}
						}
						do {
							if (this.anInt9782 * -558816905 * 2144077895 < var3) {
								return;
							}
							this.anInt9782 = (var3 + var3 - 1 - this.anInt9782 * -558816905 * 2144077895) * 2144077895 * -558816905;
							this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
							var10002 = this.anInt9781 * 1578352321 - 1578352321;
							this.anInt9781 = (this.anInt9781 * 1578352321 - 1578352321) * -1618882239;
							if (var10002 * -1618882239 == 0) {
								break;
							}
							if (this.anInt9782 * -558816905 * 2144077895 >= var2) {
								return;
							}
							this.anInt9782 = (var2 + var2 - 1 - this.anInt9782 * -558816905 * 2144077895) * 2144077895 * -558816905;
							this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
							var10002 = this.anInt9781 * 1578352321 - 1578352321;
							this.anInt9781 = (this.anInt9781 * 1578352321 - 1578352321) * -1618882239;
						} while (var10002 * -1618882239 != 0);
					}
				} else {
					int var6;
					if (this.anInt9772 * -542430793 * 598541319 < 0) {
						if (this.anInt9782 * -558816905 * 2144077895 >= var2) {
							return;
						}
						var6 = (var3 - 1 - this.anInt9782 * -558816905 * 2144077895) / var5;
						if (var6 < this.anInt9781 * 1578352321 * -1618882239) {
							this.anInt9782 = (this.anInt9782 * 2144077895 + var5 * 2144077895 * var6) * -558816905;
							this.anInt9781 = (this.anInt9781 * 1578352321 - var6 * 1578352321) * -1618882239;
							return;
						}
						this.anInt9782 = (this.anInt9782 * 2144077895 + var5 * this.anInt9781 * 1578352321 * -1618882239 * 2144077895) * -558816905;
						this.anInt9781 = 0 * -1618882239;
					} else if (this.anInt9782 * 2144077895 * -558816905 >= var3) {
						var6 = (this.anInt9782 * -558816905 * 2144077895 - var2) / var5;
						if (var6 < this.anInt9781 * -1618882239 * 1578352321) {
							this.anInt9782 = (this.anInt9782 * 2144077895 - var5 * var6 * 2144077895) * -558816905;
							this.anInt9781 = (this.anInt9781 * 1578352321 - var6 * 1578352321) * -1618882239;
							return;
						}
						this.anInt9782 = (this.anInt9782 * 2144077895 - this.anInt9781 * 1578352321 * -1618882239 * var5 * 2144077895) * -558816905;
						this.anInt9781 = 0 * -1618882239;
					} else {
						return;
					}
				}
			}
			if (this.anInt9772 * -542430793 * 598541319 < 0) {
				if (this.anInt9782 * -558816905 * 2144077895 < 0) {
					this.anInt9782 = -558816905 * -2144077895;
					this.method3641((short) 4590);
					this.method3252(-956612483);
				}
			} else if (this.anInt9782 * -558816905 * 2144077895 >= var4) {
				this.anInt9782 = var4 * 2144077895 * -558816905;
				this.method3641((short) -13831);
				this.method3252(-1335582296);
			}
		} else if (this.aBoolean9784) {
			if (this.anInt9772 * -542430793 * 598541319 < 0) {
				if (this.anInt9782 * -558816905 * 2144077895 >= var2) {
					return;
				}
				this.anInt9782 = (var2 + var2 - 1 - this.anInt9782 * -558816905 * 2144077895) * 2144077895 * -558816905;
				this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
			}
			while (this.anInt9782 * -558816905 * 2144077895 >= var3) {
				this.anInt9782 = (var3 + var3 - 1 - this.anInt9782 * 2144077895 * -558816905) * 2144077895 * -558816905;
				this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
				if (this.anInt9782 * -558816905 * 2144077895 >= var2) {
					break;
				}
				this.anInt9782 = (var2 + var2 - 1 - this.anInt9782 * 2144077895 * -558816905) * 2144077895 * -558816905;
				this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
			}
		} else if (this.anInt9772 * -542430793 * 598541319 < 0) {
			if (this.anInt9782 * 2144077895 * -558816905 < var2) {
				this.anInt9782 = (var3 - 1 - (var3 - 1 - this.anInt9782 * 2144077895 * -558816905) % var5) * 2144077895 * -558816905;
			}
		} else if (this.anInt9782 * 2144077895 * -558816905 >= var3) {
			this.anInt9782 = ((this.anInt9782 * -558816905 * 2144077895 - var2) % var5 + var2) * 2144077895 * -558816905;
		}
	}

	public final int method3553() {
		return this.anInt9773 * 1488581567 * 1089731647 == 0 && this.anInt9771 * 424994781 * 807250037 == 0 ? 0 : 1;
	}

	public final int method3567() {
		return this.anInt9773 * 1488581567 * 1089731647 == 0 && this.anInt9771 * 424994781 * 807250037 == 0 ? 0 : 1;
	}

	public final synchronized void method3636(int arg0, int arg1) {
		try {
			this.method3626(this.method3644(1859454861), arg0, -2132070499);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aiq.aq(" + ')');
		}
	}

	public final int method3561() {
		return this.anInt9773 * 1488581567 * 1089731647 == 0 && this.anInt9771 * 424994781 * 807250037 == 0 ? 0 : 1;
	}

	public final synchronized void method3566(int arg0) {
		if (this.anInt9771 * 807250037 * 424994781 > 0) {
			if (arg0 >= this.anInt9771 * 807250037 * 424994781) {
				if (this.anInt9773 * 1488581567 * 1089731647 == Integer.MIN_VALUE) {
					this.anInt9773 = 0 * 1488581567;
					this.anInt9776 = 0 * 111438813;
					this.anInt9783 = 0 * 1694000393;
					this.anInt9775 = 0 * -2092094291;
					this.method3252(1349230406);
					arg0 = this.anInt9771 * 807250037 * 424994781;
				}
				this.anInt9771 = 0 * 424994781;
				this.method3635((byte) 24);
			} else {
				this.anInt9775 = (this.anInt9775 * 1875449637 + arg0 * this.anInt9778 * 39705771 * 241122819 * 1875449637) * -2092094291;
				this.anInt9783 = (this.anInt9783 * -1883326151 + arg0 * -1883326151 * 1941232607 * this.anInt9785 * 1108516895) * 1694000393;
				this.anInt9776 = (this.anInt9776 * -1178319755 + arg0 * -1178319755 * -2020606751 * this.anInt9780 * 588138273) * 111438813;
				this.anInt9771 = (this.anInt9771 * 807250037 - arg0 * 807250037) * 424994781;
			}
		}
		int var2 = this.anInt9777 * 216574687 * 1968541983 << 8;
		int var3 = this.anInt9779 * -1955085031 * 2094253865 << 8;
		int var4 = ((Class330_Sub29_Sub1) this.aClass330_Sub29_7770).method3407() << 8;
		int var5 = var3 - var2;
		if (var5 <= 0) {
			this.anInt9781 = 0 * -1618882239;
		}
		if (this.anInt9782 * 2144077895 * -558816905 < 0) {
			if (this.anInt9772 * 598541319 * -542430793 <= 0) {
				this.method3641((short) -22201);
				this.method3252(478741045);
				return;
			}
			this.anInt9782 = 0 * -558816905;
		}
		if (this.anInt9782 * 2144077895 * -558816905 >= var4) {
			if (this.anInt9772 * 598541319 * -542430793 >= 0) {
				this.method3641((short) -15624);
				this.method3252(-1284006641);
				return;
			}
			this.anInt9782 = (var4 - 1) * 2144077895 * -558816905;
		}
		this.anInt9782 = (this.anInt9782 * 2144077895 + arg0 * 598541319 * this.anInt9772 * -542430793 * 2144077895) * -558816905;
		if (this.anInt9781 * 1578352321 * -1618882239 >= 0) {
			if (this.anInt9781 * 1578352321 * -1618882239 > 0) {
				if (this.aBoolean9784) {
					label119: {
						int var10002;
						if (this.anInt9772 * 598541319 * -542430793 < 0) {
							if (this.anInt9782 * -558816905 * 2144077895 >= var2) {
								return;
							}
							this.anInt9782 = (var2 + var2 - 1 - this.anInt9782 * -558816905 * 2144077895) * 2144077895 * -558816905;
							this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
							var10002 = this.anInt9781 * 1578352321 - 1578352321;
							this.anInt9781 = (this.anInt9781 * 1578352321 - 1578352321) * -1618882239;
							if (var10002 * -1618882239 == 0) {
								break label119;
							}
						}
						do {
							if (this.anInt9782 * -558816905 * 2144077895 < var3) {
								return;
							}
							this.anInt9782 = (var3 + var3 - 1 - this.anInt9782 * -558816905 * 2144077895) * 2144077895 * -558816905;
							this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
							var10002 = this.anInt9781 * 1578352321 - 1578352321;
							this.anInt9781 = (this.anInt9781 * 1578352321 - 1578352321) * -1618882239;
							if (var10002 * -1618882239 == 0) {
								break;
							}
							if (this.anInt9782 * -558816905 * 2144077895 >= var2) {
								return;
							}
							this.anInt9782 = (var2 + var2 - 1 - this.anInt9782 * -558816905 * 2144077895) * 2144077895 * -558816905;
							this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
							var10002 = this.anInt9781 * 1578352321 - 1578352321;
							this.anInt9781 = (this.anInt9781 * 1578352321 - 1578352321) * -1618882239;
						} while (var10002 * -1618882239 != 0);
					}
				} else {
					int var6;
					if (this.anInt9772 * -542430793 * 598541319 < 0) {
						if (this.anInt9782 * -558816905 * 2144077895 >= var2) {
							return;
						}
						var6 = (var3 - 1 - this.anInt9782 * -558816905 * 2144077895) / var5;
						if (var6 < this.anInt9781 * 1578352321 * -1618882239) {
							this.anInt9782 = (this.anInt9782 * 2144077895 + var5 * 2144077895 * var6) * -558816905;
							this.anInt9781 = (this.anInt9781 * 1578352321 - var6 * 1578352321) * -1618882239;
							return;
						}
						this.anInt9782 = (this.anInt9782 * 2144077895 + var5 * this.anInt9781 * 1578352321 * -1618882239 * 2144077895) * -558816905;
						this.anInt9781 = 0 * -1618882239;
					} else if (this.anInt9782 * 2144077895 * -558816905 >= var3) {
						var6 = (this.anInt9782 * -558816905 * 2144077895 - var2) / var5;
						if (var6 < this.anInt9781 * -1618882239 * 1578352321) {
							this.anInt9782 = (this.anInt9782 * 2144077895 - var5 * var6 * 2144077895) * -558816905;
							this.anInt9781 = (this.anInt9781 * 1578352321 - var6 * 1578352321) * -1618882239;
							return;
						}
						this.anInt9782 = (this.anInt9782 * 2144077895 - this.anInt9781 * 1578352321 * -1618882239 * var5 * 2144077895) * -558816905;
						this.anInt9781 = 0 * -1618882239;
					} else {
						return;
					}
				}
			}
			if (this.anInt9772 * -542430793 * 598541319 < 0) {
				if (this.anInt9782 * -558816905 * 2144077895 < 0) {
					this.anInt9782 = -558816905 * -2144077895;
					this.method3641((short) -6426);
					this.method3252(1182462327);
				}
			} else if (this.anInt9782 * -558816905 * 2144077895 >= var4) {
				this.anInt9782 = var4 * 2144077895 * -558816905;
				this.method3641((short) -3577);
				this.method3252(-1012276847);
			}
		} else if (this.aBoolean9784) {
			if (this.anInt9772 * -542430793 * 598541319 < 0) {
				if (this.anInt9782 * -558816905 * 2144077895 >= var2) {
					return;
				}
				this.anInt9782 = (var2 + var2 - 1 - this.anInt9782 * -558816905 * 2144077895) * 2144077895 * -558816905;
				this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
			}
			while (this.anInt9782 * -558816905 * 2144077895 >= var3) {
				this.anInt9782 = (var3 + var3 - 1 - this.anInt9782 * 2144077895 * -558816905) * 2144077895 * -558816905;
				this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
				if (this.anInt9782 * -558816905 * 2144077895 >= var2) {
					break;
				}
				this.anInt9782 = (var2 + var2 - 1 - this.anInt9782 * 2144077895 * -558816905) * 2144077895 * -558816905;
				this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
			}
		} else if (this.anInt9772 * -542430793 * 598541319 < 0) {
			if (this.anInt9782 * 2144077895 * -558816905 < var2) {
				this.anInt9782 = (var3 - 1 - (var3 - 1 - this.anInt9782 * 2144077895 * -558816905) % var5) * 2144077895 * -558816905;
			}
		} else if (this.anInt9782 * 2144077895 * -558816905 >= var3) {
			this.anInt9782 = ((this.anInt9782 * -558816905 * 2144077895 - var2) % var5 + var2) * 2144077895 * -558816905;
		}
	}

	public final synchronized void method3569(int arg0) {
		if (this.anInt9771 * 807250037 * 424994781 > 0) {
			if (arg0 >= this.anInt9771 * 807250037 * 424994781) {
				if (this.anInt9773 * 1488581567 * 1089731647 == Integer.MIN_VALUE) {
					this.anInt9773 = 0 * 1488581567;
					this.anInt9776 = 0 * 111438813;
					this.anInt9783 = 0 * 1694000393;
					this.anInt9775 = 0 * -2092094291;
					this.method3252(679621980);
					arg0 = this.anInt9771 * 807250037 * 424994781;
				}
				this.anInt9771 = 0 * 424994781;
				this.method3635((byte) 49);
			} else {
				this.anInt9775 = (this.anInt9775 * 1875449637 + arg0 * this.anInt9778 * 39705771 * 241122819 * 1875449637) * -2092094291;
				this.anInt9783 = (this.anInt9783 * -1883326151 + arg0 * -1883326151 * 1941232607 * this.anInt9785 * 1108516895) * 1694000393;
				this.anInt9776 = (this.anInt9776 * -1178319755 + arg0 * -1178319755 * -2020606751 * this.anInt9780 * 588138273) * 111438813;
				this.anInt9771 = (this.anInt9771 * 807250037 - arg0 * 807250037) * 424994781;
			}
		}
		int var2 = this.anInt9777 * 216574687 * 1968541983 << 8;
		int var3 = this.anInt9779 * -1955085031 * 2094253865 << 8;
		int var4 = ((Class330_Sub29_Sub1) this.aClass330_Sub29_7770).method3407() << 8;
		int var5 = var3 - var2;
		if (var5 <= 0) {
			this.anInt9781 = 0 * -1618882239;
		}
		if (this.anInt9782 * 2144077895 * -558816905 < 0) {
			if (this.anInt9772 * 598541319 * -542430793 <= 0) {
				this.method3641((short) -8347);
				this.method3252(1391106390);
				return;
			}
			this.anInt9782 = 0 * -558816905;
		}
		if (this.anInt9782 * 2144077895 * -558816905 >= var4) {
			if (this.anInt9772 * 598541319 * -542430793 >= 0) {
				this.method3641((short) -18903);
				this.method3252(967431429);
				return;
			}
			this.anInt9782 = (var4 - 1) * 2144077895 * -558816905;
		}
		this.anInt9782 = (this.anInt9782 * 2144077895 + arg0 * 598541319 * this.anInt9772 * -542430793 * 2144077895) * -558816905;
		if (this.anInt9781 * 1578352321 * -1618882239 >= 0) {
			if (this.anInt9781 * 1578352321 * -1618882239 > 0) {
				if (this.aBoolean9784) {
					label119: {
						int var10002;
						if (this.anInt9772 * 598541319 * -542430793 < 0) {
							if (this.anInt9782 * -558816905 * 2144077895 >= var2) {
								return;
							}
							this.anInt9782 = (var2 + var2 - 1 - this.anInt9782 * -558816905 * 2144077895) * 2144077895 * -558816905;
							this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
							var10002 = this.anInt9781 * 1578352321 - 1578352321;
							this.anInt9781 = (this.anInt9781 * 1578352321 - 1578352321) * -1618882239;
							if (var10002 * -1618882239 == 0) {
								break label119;
							}
						}
						do {
							if (this.anInt9782 * -558816905 * 2144077895 < var3) {
								return;
							}
							this.anInt9782 = (var3 + var3 - 1 - this.anInt9782 * -558816905 * 2144077895) * 2144077895 * -558816905;
							this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
							var10002 = this.anInt9781 * 1578352321 - 1578352321;
							this.anInt9781 = (this.anInt9781 * 1578352321 - 1578352321) * -1618882239;
							if (var10002 * -1618882239 == 0) {
								break;
							}
							if (this.anInt9782 * -558816905 * 2144077895 >= var2) {
								return;
							}
							this.anInt9782 = (var2 + var2 - 1 - this.anInt9782 * -558816905 * 2144077895) * 2144077895 * -558816905;
							this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
							var10002 = this.anInt9781 * 1578352321 - 1578352321;
							this.anInt9781 = (this.anInt9781 * 1578352321 - 1578352321) * -1618882239;
						} while (var10002 * -1618882239 != 0);
					}
				} else {
					int var6;
					if (this.anInt9772 * -542430793 * 598541319 < 0) {
						if (this.anInt9782 * -558816905 * 2144077895 >= var2) {
							return;
						}
						var6 = (var3 - 1 - this.anInt9782 * -558816905 * 2144077895) / var5;
						if (var6 < this.anInt9781 * 1578352321 * -1618882239) {
							this.anInt9782 = (this.anInt9782 * 2144077895 + var5 * 2144077895 * var6) * -558816905;
							this.anInt9781 = (this.anInt9781 * 1578352321 - var6 * 1578352321) * -1618882239;
							return;
						}
						this.anInt9782 = (this.anInt9782 * 2144077895 + var5 * this.anInt9781 * 1578352321 * -1618882239 * 2144077895) * -558816905;
						this.anInt9781 = 0 * -1618882239;
					} else if (this.anInt9782 * 2144077895 * -558816905 >= var3) {
						var6 = (this.anInt9782 * -558816905 * 2144077895 - var2) / var5;
						if (var6 < this.anInt9781 * -1618882239 * 1578352321) {
							this.anInt9782 = (this.anInt9782 * 2144077895 - var5 * var6 * 2144077895) * -558816905;
							this.anInt9781 = (this.anInt9781 * 1578352321 - var6 * 1578352321) * -1618882239;
							return;
						}
						this.anInt9782 = (this.anInt9782 * 2144077895 - this.anInt9781 * 1578352321 * -1618882239 * var5 * 2144077895) * -558816905;
						this.anInt9781 = 0 * -1618882239;
					} else {
						return;
					}
				}
			}
			if (this.anInt9772 * -542430793 * 598541319 < 0) {
				if (this.anInt9782 * -558816905 * 2144077895 < 0) {
					this.anInt9782 = -558816905 * -2144077895;
					this.method3641((short) -9814);
					this.method3252(-648738971);
				}
			} else if (this.anInt9782 * -558816905 * 2144077895 >= var4) {
				this.anInt9782 = var4 * 2144077895 * -558816905;
				this.method3641((short) 17852);
				this.method3252(-932593065);
			}
		} else if (this.aBoolean9784) {
			if (this.anInt9772 * -542430793 * 598541319 < 0) {
				if (this.anInt9782 * -558816905 * 2144077895 >= var2) {
					return;
				}
				this.anInt9782 = (var2 + var2 - 1 - this.anInt9782 * -558816905 * 2144077895) * 2144077895 * -558816905;
				this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
			}
			while (this.anInt9782 * -558816905 * 2144077895 >= var3) {
				this.anInt9782 = (var3 + var3 - 1 - this.anInt9782 * 2144077895 * -558816905) * 2144077895 * -558816905;
				this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
				if (this.anInt9782 * -558816905 * 2144077895 >= var2) {
					break;
				}
				this.anInt9782 = (var2 + var2 - 1 - this.anInt9782 * 2144077895 * -558816905) * 2144077895 * -558816905;
				this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
			}
		} else if (this.anInt9772 * -542430793 * 598541319 < 0) {
			if (this.anInt9782 * 2144077895 * -558816905 < var2) {
				this.anInt9782 = (var3 - 1 - (var3 - 1 - this.anInt9782 * 2144077895 * -558816905) % var5) * 2144077895 * -558816905;
			}
		} else if (this.anInt9782 * 2144077895 * -558816905 >= var3) {
			this.anInt9782 = ((this.anInt9782 * -558816905 * 2144077895 - var2) % var5 + var2) * 2144077895 * -558816905;
		}
	}

	public final int method3637() {
		int var1 = this.anInt9775 * 1875449637 * -1981315577 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.anInt9781 * 1578352321 * -1618882239 == 0) {
			var1 -= var1 * this.anInt9782 * 2144077895 * -558816905 / (((Class330_Sub29_Sub1) this.aClass330_Sub29_7770).method3407() << 8);
		} else if (this.anInt9781 * -1618882239 * 1578352321 >= 0) {
			var1 -= this.anInt9777 * 216574687 * 1968541983 * var1 / ((Class330_Sub29_Sub1) this.aClass330_Sub29_7770).method3407();
		}
		return var1 > 255 ? 255 : var1;
	}

	public final int method3638() {
		int var1 = this.anInt9775 * 1875449637 * -1981315577 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.anInt9781 * 1578352321 * -1618882239 == 0) {
			var1 -= var1 * this.anInt9782 * 2144077895 * -558816905 / (((Class330_Sub29_Sub1) this.aClass330_Sub29_7770).method3407() << 8);
		} else if (this.anInt9781 * -1618882239 * 1578352321 >= 0) {
			var1 -= this.anInt9777 * 216574687 * 1968541983 * var1 / ((Class330_Sub29_Sub1) this.aClass330_Sub29_7770).method3407();
		}
		return var1 > 255 ? 255 : var1;
	}

	public final int method3562() {
		try {
			return this.anInt9773 == 0 && this.anInt9771 == 0 ? 0 : 1;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "aiq.p(" + ')');
		}
	}

	public final int method3639() {
		int var1 = this.anInt9775 * 1875449637 * -1981315577 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.anInt9781 * 1578352321 * -1618882239 == 0) {
			var1 -= var1 * this.anInt9782 * 2144077895 * -558816905 / (((Class330_Sub29_Sub1) this.aClass330_Sub29_7770).method3407() << 8);
		} else if (this.anInt9781 * -1618882239 * 1578352321 >= 0) {
			var1 -= this.anInt9777 * 216574687 * 1968541983 * var1 / ((Class330_Sub29_Sub1) this.aClass330_Sub29_7770).method3407();
		}
		return var1 > 255 ? 255 : var1;
	}

	public final int method3640() {
		int var1 = this.anInt9775 * 1875449637 * -1981315577 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.anInt9781 * 1578352321 * -1618882239 == 0) {
			var1 -= var1 * this.anInt9782 * 2144077895 * -558816905 / (((Class330_Sub29_Sub1) this.aClass330_Sub29_7770).method3407() << 8);
		} else if (this.anInt9781 * -1618882239 * 1578352321 >= 0) {
			var1 -= this.anInt9777 * 216574687 * 1968541983 * var1 / ((Class330_Sub29_Sub1) this.aClass330_Sub29_7770).method3407();
		}
		return var1 > 255 ? 255 : var1;
	}

	public final int method3554() {
		return this.anInt9773 * 1488581567 * 1089731647 == 0 && this.anInt9771 * 424994781 * 807250037 == 0 ? 0 : 1;
	}

	public final void method3641(short arg0) {
		try {
			if (this.anInt9771 != 0) {
				if (this.anInt9773 == Integer.MIN_VALUE) {
					this.anInt9773 = 0;
				}
				this.anInt9771 = 0;
				this.method3635((byte) 67);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aiq.av(" + ')');
		}
	}

	public final synchronized void method3642(int arg0, int arg1, int arg2, byte arg3) {
		try {
			if (arg0 == 0) {
				this.method3626(arg1, arg2, -1971862604);
			} else {
				int var5 = Class219.method2260(arg1, arg2, 1509623502);
				int var6 = Class330_Sub26_Sub4.method3397(arg1, arg2, (byte) 112);
				if (var5 == this.anInt9783 && var6 == this.anInt9776) {
					this.anInt9771 = 0;
				} else {
					int var7 = arg1 - this.anInt9775;
					if (this.anInt9775 - arg1 > var7) {
						var7 = this.anInt9775 - arg1;
					}
					if (var5 - this.anInt9783 > var7) {
						var7 = var5 - this.anInt9783;
					}
					if (this.anInt9783 - var5 > var7) {
						var7 = this.anInt9783 - var5;
					}
					if (var6 - this.anInt9776 > var7) {
						var7 = var6 - this.anInt9776;
					}
					if (this.anInt9776 - var6 > var7) {
						var7 = this.anInt9776 - var6;
					}
					if (arg0 > var7) {
						arg0 = var7;
					}
					this.anInt9771 = arg0;
					this.anInt9773 = arg1;
					this.anInt9774 = arg2;
					this.anInt9778 = (arg1 - this.anInt9775) / arg0;
					this.anInt9785 = (var5 - this.anInt9783) / arg0;
					this.anInt9780 = (var6 - this.anInt9776) / arg0;
				}
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "aiq.am(" + ')');
		}
	}

	public final synchronized void method3643(int arg0, int arg1) {
		try {
			this.method3626(arg0, this.method3627((short) 255), -2139242206);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aiq.af(" + ')');
		}
	}

	public final int method3570() {
		return this.anInt9773 * 1488581567 * 1089731647 == 0 && this.anInt9771 * 424994781 * 807250037 == 0 ? 0 : 1;
	}

	public final synchronized int method3644(int arg0) {
		try {
			return this.anInt9773 == Integer.MIN_VALUE ? 0 : this.anInt9773;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aiq.ab(" + ')');
		}
	}

	public final synchronized void method3645(int arg0, int arg1) {
		try {
			int var3 = ((Class330_Sub29_Sub1) this.aClass330_Sub29_7770).method3407() << 8;
			if (arg0 < -1) {
				arg0 = -1;
			}
			if (arg0 > var3) {
				arg0 = var3;
			}
			this.anInt9782 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aiq.ag(" + ')');
		}
	}

	public final int method3646() {
		int var1 = this.anInt9775 * 1875449637 * -1981315577 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.anInt9781 * 1578352321 * -1618882239 == 0) {
			var1 -= var1 * this.anInt9782 * 2144077895 * -558816905 / (((Class330_Sub29_Sub1) this.aClass330_Sub29_7770).method3407() << 8);
		} else if (this.anInt9781 * -1618882239 * 1578352321 >= 0) {
			var1 -= this.anInt9777 * 216574687 * 1968541983 * var1 / ((Class330_Sub29_Sub1) this.aClass330_Sub29_7770).method3407();
		}
		return var1 > 255 ? 255 : var1;
	}

	public abstract void method3565(int[] arg0, int arg1, int arg2);

	public abstract void method3564(int[] arg0, int arg1, int arg2);
}
