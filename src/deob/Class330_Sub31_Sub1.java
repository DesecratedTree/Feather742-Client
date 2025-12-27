package deob;

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;

public class Class330_Sub31_Sub1 extends Class330_Sub31 {

	public VorbisInfo aVorbisInfo9594 = new VorbisInfo();

	public VorbisComment aVorbisComment9592 = new VorbisComment();

	public double aDouble9596;

	public int anInt9597;

	public Class330_Sub40_Sub1 aClass330_Sub40_Sub1_9595;

	public Preferences aClass294_9591;

	public DSPState aDSPState9590;

	public VorbisBlock aVorbisBlock9593;

	public Class330_Sub31_Sub1(OggStreamState arg0) {
		super(arg0);
	}

	public Class330_Sub40_Sub1 method3419(int arg0) {
		try {
			return this.aClass330_Sub40_Sub1_9595;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ajo.l(" + ')');
		}
	}

	public void method3412(OggPacket arg0) {
		if (this.anInt7723 * -983895715 * -818353419 < 3) {
			int var5 = this.aVorbisInfo9594.headerIn(this.aVorbisComment9592, arg0);
			if (var5 < 0) {
				throw new IllegalStateException("" + var5);
			}
			if (this.anInt7723 * -983895715 * -818353419 == 2) {
				if (this.aVorbisInfo9594.channels > 2 || this.aVorbisInfo9594.channels < 1) {
					throw new RuntimeException("" + this.aVorbisInfo9594.channels);
				}
				this.aDSPState9590 = new DSPState(this.aVorbisInfo9594);
				this.aVorbisBlock9593 = new VorbisBlock(this.aDSPState9590);
				this.aClass294_9591 = new Preferences(this.aVorbisInfo9594.rate, Class296.anInt3047);
				this.aClass330_Sub40_Sub1_9595 = new Class330_Sub40_Sub1(this.aVorbisInfo9594.channels);
			}
			return;
		}
		if (this.aVorbisBlock9593.synthesis(arg0) == 0) {
			this.aDSPState9590.blockIn(this.aVorbisBlock9593);
		}
		float[][] var2 = this.aDSPState9590.pcmOut(this.aVorbisInfo9594.channels);
		this.aDouble9596 = this.aDSPState9590.granuleTime();
		if (-1.0D == this.aDouble9596) {
			this.aDouble9596 = (float) (this.anInt9597 * -316058849 * 356804831) / (float) this.aVorbisInfo9594.rate;
		}
		this.aDSPState9590.read(var2[0].length);
		this.anInt9597 = (this.anInt9597 * 356804831 + var2[0].length * 356804831) * -316058849;
		Class330_Sub32 var3 = this.aClass330_Sub40_Sub1_9595.method3574(var2[0].length, this.aDouble9596);
		Class397.method4679(var2, var3.aShortArrayArray7725, (byte) 100);
		for (int var4 = 0; var4 < this.aVorbisInfo9594.channels; var4++) {
			var3.aShortArrayArray7725[var4] = this.aClass294_9591.method2918(var3.aShortArrayArray7725[var4], -2065903957);
		}
		this.aClass330_Sub40_Sub1_9595.method3575(var3, (byte) 10);
	}

	public double method3420(int arg0) {
		try {
			double var2 = this.aDouble9596;
			if (this.aClass330_Sub40_Sub1_9595 != null) {
				var2 = this.aClass330_Sub40_Sub1_9595.method3576(-1833838076);
				if (var2 < 0.0D) {
					var2 = this.aDouble9596;
				}
			}
			return var2 - (double) (256.0F / (float) Class296.anInt3047);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ajo.b(" + ')');
		}
	}

	public int method3421(byte arg0) {
		try {
			return this.aClass330_Sub40_Sub1_9595 == null ? 0 : this.aClass330_Sub40_Sub1_9595.method3579(1920490265);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ajo.u(" + ')');
		}
	}

	public void method3413(int arg0) {
		try {
			if (this.aVorbisBlock9593 != null) {
				this.aVorbisBlock9593.j();
			}
			if (this.aDSPState9590 != null) {
				this.aDSPState9590.j();
			}
			this.aVorbisComment9592.j();
			this.aVorbisInfo9594.j();
			if (this.aClass330_Sub40_Sub1_9595 != null) {
				this.aClass330_Sub40_Sub1_9595.method3577((byte) 6);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ajo.i(" + ')');
		}
	}

	public void method3414() {
		if (this.aVorbisBlock9593 != null) {
			this.aVorbisBlock9593.j();
		}
		if (this.aDSPState9590 != null) {
			this.aDSPState9590.j();
		}
		this.aVorbisComment9592.j();
		this.aVorbisInfo9594.j();
		if (this.aClass330_Sub40_Sub1_9595 != null) {
			this.aClass330_Sub40_Sub1_9595.method3577((byte) 6);
		}
	}

	public void method3415() {
		if (this.aVorbisBlock9593 != null) {
			this.aVorbisBlock9593.j();
		}
		if (this.aDSPState9590 != null) {
			this.aDSPState9590.j();
		}
		this.aVorbisComment9592.j();
		this.aVorbisInfo9594.j();
		if (this.aClass330_Sub40_Sub1_9595 != null) {
			this.aClass330_Sub40_Sub1_9595.method3577((byte) 6);
		}
	}

	public void method3411(OggPacket arg0, int arg1) {
		try {
			if (this.anInt7723 < 3) {
				int var7 = this.aVorbisInfo9594.headerIn(this.aVorbisComment9592, arg0);
				if (var7 < 0) {
					throw new IllegalStateException("" + var7);
				}
				if (this.anInt7723 == 2) {
					if (this.aVorbisInfo9594.channels > 2 || this.aVorbisInfo9594.channels < 1) {
						throw new RuntimeException("" + this.aVorbisInfo9594.channels);
					}
					this.aDSPState9590 = new DSPState(this.aVorbisInfo9594);
					this.aVorbisBlock9593 = new VorbisBlock(this.aDSPState9590);
					this.aClass294_9591 = new Preferences(this.aVorbisInfo9594.rate, Class296.anInt3047);
					this.aClass330_Sub40_Sub1_9595 = new Class330_Sub40_Sub1(this.aVorbisInfo9594.channels);
				}
			} else {
				if (this.aVorbisBlock9593.synthesis(arg0) == 0) {
					this.aDSPState9590.blockIn(this.aVorbisBlock9593);
				}
				float[][] var3 = this.aDSPState9590.pcmOut(this.aVorbisInfo9594.channels);
				this.aDouble9596 = this.aDSPState9590.granuleTime();
				if (-1.0D == this.aDouble9596) {
					this.aDouble9596 = (float) this.anInt9597 / (float) this.aVorbisInfo9594.rate;
				}
				this.aDSPState9590.read(var3[0].length);
				this.anInt9597 += var3[0].length;
				Class330_Sub32 var4 = this.aClass330_Sub40_Sub1_9595.method3574(var3[0].length, this.aDouble9596);
				Class397.method4679(var3, var4.aShortArrayArray7725, (byte) 67);
				for (int var5 = 0; var5 < this.aVorbisInfo9594.channels; var5++) {
					var4.aShortArrayArray7725[var5] = this.aClass294_9591.method2918(var4.aShortArrayArray7725[var5], -1808376719);
				}
				this.aClass330_Sub40_Sub1_9595.method3575(var4, (byte) 10);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ajo.j(" + ')');
		}
	}
}
