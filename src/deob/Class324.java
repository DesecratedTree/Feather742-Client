package deob;

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;

public abstract class Class324 {

	public static int anInt3300 = 50;

	public static int anInt3306 = 10;

	public byte[] aByteArray3301;

	public OggSyncState anOggSyncState3304;

	public OggPage anOggPage3307;

	public OggPacket anOggPacket3313;

	public Class497 aClass497_3305;

	public Class330_Sub31_Sub1 aClass330_Sub31_Sub1_3310;

	public Class330_Sub31_Sub2 aClass330_Sub31_Sub2_3311;

	public Class330_Sub31_Sub4 aClass330_Sub31_Sub4_3309;

	public String aString3312;

	public boolean aBoolean3299;

	public boolean aBoolean3302;

	public boolean aBoolean3303;

	public boolean aBoolean3308;

	public void method3182(int arg0) {
		try {
			for (Class330_Sub31 var2 = (Class330_Sub31) this.aClass497_3305.method6099((byte) 3); var2 != null; var2 = (Class330_Sub31) this.aClass497_3305.method6098((short) -32768)) {
				if (var2 instanceof Class330_Sub31_Sub2) {
					Class330_Sub31_Sub2 var3 = (Class330_Sub31_Sub2) var2;
					while ((var3.anInt7723 <= 8 || this.method3191(-1633803161) > (double) var3.method3425(369738377)) && var3.anOggStreamState7724.packetOut(this.anOggPacket3313) == 1) {
						var3.method3410(this.anOggPacket3313, (byte) 17);
					}
				} else if (arg0 == 1900723246) {
					throw new IllegalStateException();
				}
			}
			this.method3190(this.aString3312, 42983231);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "nm.o(" + ')');
		}
	}

	public boolean method3183(int arg0) {
		try {
			if (this.aClass330_Sub31_Sub1_3310 == null) {
				double var2 = (double) this.aClass330_Sub31_Sub4_3309.method3429(1492625308);
				return var2 == 0.0D || (double) Class312.method3111((byte) 26) >= (double) this.aClass330_Sub31_Sub4_3309.method3430(-387739358) + 1000.0D / var2;
			} else {
				return !this.aClass330_Sub31_Sub4_3309.method3431((byte) -25) || this.method3191(1126982676) > this.aClass330_Sub31_Sub4_3309.method3427((byte) 3);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "nm.s(" + ')');
		}
	}

	public void method3184(int arg0) {
		try {
			for (Class330_Sub31 var2 = (Class330_Sub31) this.aClass497_3305.method6099((byte) -23); var2 != null; var2 = (Class330_Sub31) this.aClass497_3305.method6098((short) -32768)) {
				if (this.aClass330_Sub31_Sub4_3309 != var2) {
					while (var2.anOggStreamState7724.packetOut() == 1) {
						var2.method3410(this.anOggPacket3313, (byte) 56);
					}
				} else if (arg0 >= 525431007) {
				}
			}
			if (this.aClass330_Sub31_Sub4_3309 != null) {
				for (int var4 = 0; var4 < 10 && this.method3183(-432857350); var4++) {
					if (this.aClass330_Sub31_Sub4_3309.anOggStreamState7724.packetOut() != 1) {
						this.method3185(-439053011);
						break;
					}
					this.aClass330_Sub31_Sub4_3309.method3410(this.anOggPacket3313, (byte) 77);
				}
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nm.f(" + ')');
		}
	}

	public void method3185(int arg0) {
		try {
			if (!this.aBoolean3302) {
				for (Class330_Sub31 var2 = (Class330_Sub31) this.aClass497_3305.method6099((byte) 48); var2 != null; var2 = (Class330_Sub31) this.aClass497_3305.method6098((short) -32768)) {
					var2.method3413(-337458341);
					var2.anOggStreamState7724.j();
				}
				this.anOggPacket3313.j();
				this.anOggPage3307.j();
				this.anOggSyncState3304.j();
				this.aBoolean3302 = true;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nm.z(" + ')');
		}
	}

	public Class330_Sub31_Sub4 method3186(byte arg0) {
		try {
			return this.aClass330_Sub31_Sub4_3309;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nm.w(" + ')');
		}
	}

	public Class330_Sub31_Sub1 method3187(int arg0) {
		try {
			return this.aClass330_Sub31_Sub1_3310;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nm.n(" + ')');
		}
	}

	public Class330_Sub31_Sub2 method3188(int arg0) {
		try {
			return this.aClass330_Sub31_Sub2_3311;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nm.l(" + ')');
		}
	}

	public void method3189(boolean arg0, byte arg1) {
		try {
			if (this.aClass330_Sub31_Sub1_3310 != null) {
				Class330_Sub40_Sub1 var3 = this.aClass330_Sub31_Sub1_3310.method3419(1292286263);
				if (var3 != null) {
					var3.method3583(arg0, -632648443);
				}
			}
			this.aBoolean3299 = !this.aBoolean3299;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "nm.u(" + ')');
		}
	}

	public void method3190(String arg0, int arg1) {
		try {
			this.aString3312 = arg0;
			if (this.aString3312 == null) {
				this.aClass330_Sub31_Sub2_3311 = null;
			} else {
				if (this.aClass330_Sub31_Sub2_3311 != null && !this.aString3312.equals(this.aClass330_Sub31_Sub2_3311.method3422(-1113295978))) {
					this.aClass330_Sub31_Sub2_3311 = null;
				}
				if (this.aClass330_Sub31_Sub2_3311 == null) {
					for (Class330_Sub31 var3 = (Class330_Sub31) this.aClass497_3305.method6099((byte) -26); var3 != null; var3 = (Class330_Sub31) this.aClass497_3305.method6098((short) -32768)) {
						if (var3 instanceof Class330_Sub31_Sub2) {
							Class330_Sub31_Sub2 var4 = (Class330_Sub31_Sub2) var3;
							if (this.aString3312.equals(var4.method3422(-1023990558))) {
								this.aClass330_Sub31_Sub2_3311 = var4;
								break;
							}
						}
					}
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "nm.k(" + ')');
		}
	}

	public double method3191(int arg0) {
		try {
			if (this.aClass330_Sub31_Sub1_3310 == null) {
				return this.aClass330_Sub31_Sub4_3309 == null ? 0.0D : this.aClass330_Sub31_Sub4_3309.method3427((byte) 3);
			} else {
				return this.aClass330_Sub31_Sub1_3310.method3420(1181725581);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nm.q(" + ')');
		}
	}

	public Class324(int arg0) {
		if (!Class489.method6063(-1102372689).method327("jagtheora", 55579657)) {
			throw new RuntimeException("");
		}
		this.aByteArray3301 = new byte[arg0];
		this.anOggSyncState3304 = new OggSyncState();
		this.anOggPage3307 = new OggPage();
		this.anOggPacket3313 = new OggPacket();
		this.aClass497_3305 = new Class497(8);
	}

	public Class330_Sub31 method3196(int arg0) throws IOException {
		try {
			if (this.aBoolean3302) {
				throw new IllegalStateException();
			} else if (this.aBoolean3308) {
				return null;
			} else {
				int var2;
				while (this.anOggSyncState3304.pageOut(this.anOggPage3307) <= 0) {
					var2 = this.method3181(this.aByteArray3301, (byte) -119);
					if (var2 == -1) {
						this.aBoolean3308 = true;
						return null;
					}
					if (var2 == 0) {
						return null;
					}
					if (!this.anOggSyncState3304.write(this.aByteArray3301, var2)) {
						throw new RuntimeException("");
					}
				}
				var2 = this.anOggPage3307.getSerialNumber();
				if (!this.anOggPage3307.isBOS()) {
					Class330_Sub31 var9 = (Class330_Sub31) this.aClass497_3305.method6094((long) var2);
					if (!var9.anOggStreamState7724.pageIn(this.anOggPage3307)) {
						throw new IllegalStateException();
					}
					return var9;
				}
				OggStreamState var3 = new OggStreamState(var2);
				if (!var3.pageIn(this.anOggPage3307)) {
					throw new IllegalStateException();
				} else if (var3.packetPeek(this.anOggPacket3313) == 1) {
					Class330_Sub31 var4;
					if (this.aClass330_Sub31_Sub4_3309 == null && this.anOggPacket3313.isTheora()) {
						this.aClass330_Sub31_Sub4_3309 = new Class330_Sub31_Sub4(var3);
						var4 = this.aClass330_Sub31_Sub4_3309;
					} else if (this.aClass330_Sub31_Sub1_3310 == null && this.anOggPacket3313.isVorbis()) {
						this.aClass330_Sub31_Sub1_3310 = new Class330_Sub31_Sub1(var3);
						var4 = this.aClass330_Sub31_Sub1_3310;
					} else {
						byte[] var5 = this.anOggPacket3313.getData();
						StringBuilder var6 = new StringBuilder();
						for (int var7 = 1; var7 < var5.length; var7++) {
							if (!Character.isLetterOrDigit((char) var5[var7])) {
								if (arg0 != 1337095293) {
								}
								break;
							}
							var6.append((char) var5[var7]);
						}
						String var10 = var6.toString();
						if (var10.equals("kate")) {
							var4 = new Class330_Sub31_Sub2(var3);
						} else {
							var4 = new Class330_Sub31_Sub3(var3);
						}
					}
					this.aClass497_3305.method6097(var4, (long) var2);
					return var4;
				} else {
					throw new IllegalStateException();
				}
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "nm.j(" + ')');
		}
	}

	public boolean method3197(int arg0) {
		try {
			if (this.aBoolean3302 || this.aBoolean3308) {
				return this.aClass330_Sub31_Sub1_3310 == null || this.aClass330_Sub31_Sub1_3310.method3421((byte) 7) <= 0;
			} else {
				return false;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nm.b(" + ')');
		}
	}

	public void method3198(byte arg0) throws IOException {
		try {
			while (this.aClass330_Sub31_Sub4_3309.anOggStreamState7724.packetOut(this.anOggPacket3313) != 1) {
				Class330_Sub31 var2 = this.method3196(1337095293);
				if (var2 == null) {
					if (this.aBoolean3308) {
						this.method3184(-1885477849);
					}
					return;
				}
				if (this.aClass330_Sub31_Sub2_3311 == var2) {
					this.method3182(-321141857);
				}
			}
			this.aClass330_Sub31_Sub4_3309.method3410(this.anOggPacket3313, (byte) 46);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nm.p(" + ')');
		}
	}

	public void method3199(byte arg0) throws IOException {
		try {
			if (!this.aBoolean3299) {
				while (!this.aBoolean3302) {
					Class330_Sub31 var2;
					if (this.aBoolean3303) {
						var2 = (Class330_Sub31) this.aClass497_3305.method6094((long) this.anOggPage3307.getSerialNumber());
					} else {
						var2 = this.method3196(1337095293);
						if (var2 == null) {
							if (this.aBoolean3308) {
								this.method3184(-1629070816);
							}
							break;
						}
						if (var2 == null) {
							throw new IllegalStateException();
						}
						this.aBoolean3303 = true;
					}
					if (this.aClass330_Sub31_Sub1_3310 == var2) {
						if (this.aClass330_Sub31_Sub1_3310.method3421((byte) 24) >= 50) {
							break;
						}
						while (this.aClass330_Sub31_Sub1_3310.anOggStreamState7724.packetOut(this.anOggPacket3313) == 1) {
							this.aClass330_Sub31_Sub1_3310.method3410(this.anOggPacket3313, (byte) 20);
							this.method3182(1084560151);
							if (this.aClass330_Sub31_Sub4_3309 != null) {
								double var3 = this.aClass330_Sub31_Sub4_3309.method3427((byte) 3);
								for (int var5 = 0; var5 < 10 && this.method3183(-804655726); var5++) {
									this.method3198((byte) -72);
									if (this.aBoolean3302) {
										return;
									}
								}
								if (var3 < this.aClass330_Sub31_Sub4_3309.method3427((byte) 3)) {
									return;
								}
							}
							if (this.aClass330_Sub31_Sub1_3310.method3421((byte) 101) >= 50) {
								return;
							}
						}
					} else if (var2 instanceof Class330_Sub31_Sub2) {
						this.method3182(1230937354);
					} else if (var2 != this.aClass330_Sub31_Sub4_3309) {
						while (var2.anOggStreamState7724.packetOut(this.anOggPacket3313) == 1) {
							if (var2.anInt7723 == 1 && var2 instanceof Class330_Sub31_Sub2) {
								this.method3190(this.aString3312, 2066770735);
							}
							var2.method3410(this.anOggPacket3313, (byte) -15);
						}
					} else if (this.aClass330_Sub31_Sub1_3310 == null && !this.aBoolean3299) {
						for (int var7 = 0; var7 < 10 && this.method3183(-1912888496); var7++) {
							this.method3198((byte) -7);
							if (this.aBoolean3302) {
								return;
							}
						}
						return;
					}
					this.aBoolean3303 = false;
				}
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "nm.i(" + ')');
		}
	}

	public static final void method3200(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub6_7882.method5757(65535) == 1 ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nm.alg(" + ')');
		}
	}

	public static final void method3201(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			if (arg0.anInt1198 == 5) {
				Class464_Sub1.method5734(arg0, arg1, arg2, -1626253272);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "nm.gu(" + ')');
		}
	}

	public static void method3202(NPC arg0, int arg1) {
		try {
			for (Class330_Sub20 var2 = (Class330_Sub20) Class330_Sub20.aClass471_7650.method5869(539664854); var2 != null; var2 = (Class330_Sub20) Class330_Sub20.aClass471_7650.method5873((byte) -102)) {
				if (var2.aClass432_Sub1_Sub1_Sub1_Sub2_7661 == arg0) {
					if (var2.aClass330_Sub40_Sub3_7675 != null) {
						Class511.aClass330_Sub40_Sub4_5951.method3685(var2.aClass330_Sub40_Sub3_7675);
						var2.aClass330_Sub40_Sub3_7675 = null;
					}
					var2.method3252(373408543);
					break;
				}
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nm.s(" + ')');
		}
	}

	public abstract int method3181(byte[] arg0, byte arg1) throws IOException;

	public abstract int method3192(byte[] arg0) throws IOException;

	public abstract int method3193(byte[] arg0) throws IOException;

	public abstract int method3194(byte[] arg0) throws IOException;

	public abstract int method3195(byte[] arg0) throws IOException;
}
