package deob;

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.DecoderContext;
import jagtheora.theora.Frame;
import jagtheora.theora.GranulePos;
import jagtheora.theora.SetupInfo;
import jagtheora.theora.TheoraComment;
import jagtheora.theora.TheoraInfo;

public class Class330_Sub31_Sub4 extends Class330_Sub31 {

	public static int anInt9608 = 1024;

	public static int anInt9623 = 2048;

	public SetupInfo aSetupInfo9615 = new SetupInfo();

	public TheoraInfo aTheoraInfo9610 = new TheoraInfo();

	public TheoraComment aTheoraComment9611 = new TheoraComment();

	public double aDouble9607;

	public int anInt9619;

	public int anInt9620;

	public long aLong9616;

	public DecoderContext aDecoderContext9612;

	public Frame aFrame9614;

	public GranulePos aGranulePos9621;

	public Object anObject9622;

	public boolean aBoolean9609;

	public boolean aBoolean9613;

	public boolean aBoolean9617;

	public boolean aBoolean9618;

	public Class330_Sub31_Sub4(OggStreamState arg0) {
		super(arg0);
	}

	public double method3427(byte arg0) {
		try {
			return this.aDouble9607;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ajz.b(" + ')');
		}
	}

	public void method3428(int arg0, int arg1) {
		try {
			this.anInt9620 = arg0;
			if (this.aBoolean9617) {
				if (this.anInt9620 > this.anInt9619) {
					this.anInt9620 = this.anInt9619;
				}
				if (this.anInt9620 < 0) {
					this.anInt9620 = 0;
				}
				this.aDecoderContext9612.setPostProcessingLevel(this.anInt9620);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ajz.n(" + ')');
		}
	}

	public float method3429(int arg0) {
		try {
			return this.aBoolean9617 && !this.aTheoraInfo9610.r() ? (float) this.aTheoraInfo9610.fpsNumerator / (float) this.aTheoraInfo9610.fpsDenominator : 0.0F;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ajz.l(" + ')');
		}
	}

	public long method3430(int arg0) {
		try {
			return this.aLong9616;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ajz.u(" + ')');
		}
	}

	public void method3412(OggPacket arg0) {
		int var2;
		if (!this.aBoolean9617) {
			var2 = this.aSetupInfo9615.decodeHeader(this.aTheoraInfo9610, this.aTheoraComment9611, arg0);
			if (var2 == 0) {
				this.aBoolean9617 = true;
				if (this.aTheoraInfo9610.frameWidth > 2048 || this.aTheoraInfo9610.frameHeight > 1024) {
					throw new IllegalStateException();
				}
				this.aDecoderContext9612 = new DecoderContext(this.aTheoraInfo9610, this.aSetupInfo9615);
				this.aGranulePos9621 = new GranulePos();
				this.aFrame9614 = new Frame(this.aTheoraInfo9610.frameWidth, this.aTheoraInfo9610.frameHeight);
				this.anInt9619 = this.aDecoderContext9612.getMaxPostProcessingLevel() * -469712635 * -341384243;
				this.method3428(this.anInt9620 * -534008793 * 1369375639, -1867337667);
			} else if (var2 < 0) {
				throw new IllegalStateException("" + var2);
			}
			return;
		}
		this.aLong9616 = Class312.method3111((byte) 90) * -5588995573861709507L * -9036900450658019819L;
		var2 = this.aDecoderContext9612.decodePacketIn(arg0, this.aGranulePos9621);
		if (var2 < 0) {
			throw new IllegalStateException("" + var2);
		}
		this.aDecoderContext9612.granuleFrame(this.aGranulePos9621);
		this.aDouble9607 = this.aDecoderContext9612.granuleTime(this.aGranulePos9621);
		if (this.aBoolean9609) {
			boolean var3 = arg0.isKeyFrame() == 1;
			if (!var3) {
				return;
			}
			this.aBoolean9609 = false;
		}
		if (!this.aBoolean9618 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext9612.decodeFrame(this.aFrame9614) != 0) {
				throw new IllegalStateException("" + var2);
			}
			this.aBoolean9613 = true;
		}
	}

	public boolean method3431(byte arg0) {
		try {
			return this.aBoolean9617;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ajz.x(" + ')');
		}
	}

	public Object method3432(Interface17 arg0, int arg1) {
		try {
			if (this.aFrame9614 == null) {
				return null;
			} else if (this.aBoolean9613 || this.anObject9622 == null) {
				this.anObject9622 = arg0.method261(this.aFrame9614.pixels, 0, this.aFrame9614.r, this.aFrame9614.r, this.aFrame9614.j, false, -1798977563);
				this.aBoolean9613 = false;
				return this.anObject9622;
			} else {
				return this.anObject9622;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ajz.c(" + ')');
		}
	}

	public void method3414() {
		if (this.aFrame9614 != null) {
			this.aFrame9614.j();
		}
		if (this.aDecoderContext9612 != null) {
			this.aDecoderContext9612.j();
			this.aDecoderContext9612 = null;
		}
		if (this.aGranulePos9621 != null) {
			this.aGranulePos9621.j();
			this.aGranulePos9621 = null;
		}
		this.aTheoraInfo9610.j();
		this.aTheoraComment9611.j();
		this.aSetupInfo9615.j();
	}

	public void method3413(int arg0) {
		try {
			if (this.aFrame9614 != null) {
				this.aFrame9614.j();
			}
			if (this.aDecoderContext9612 != null) {
				this.aDecoderContext9612.j();
				this.aDecoderContext9612 = null;
			}
			if (this.aGranulePos9621 != null) {
				this.aGranulePos9621.j();
				this.aGranulePos9621 = null;
			}
			this.aTheoraInfo9610.j();
			this.aTheoraComment9611.j();
			this.aSetupInfo9615.j();
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ajz.i(" + ')');
		}
	}

	public void method3411(OggPacket arg0, int arg1) {
		try {
			int var3;
			if (this.aBoolean9617) {
				this.aLong9616 = Class312.method3111((byte) 35);
				var3 = this.aDecoderContext9612.decodePacketIn(arg0, this.aGranulePos9621);
				if (var3 < 0) {
					throw new IllegalStateException("" + var3);
				}
				this.aDecoderContext9612.granuleFrame(this.aGranulePos9621);
				this.aDouble9607 = this.aDecoderContext9612.granuleTime(this.aGranulePos9621);
				if (this.aBoolean9609) {
					boolean var4 = arg0.isKeyFrame() == 1;
					if (!var4) {
						return;
					}
					this.aBoolean9609 = false;
				}
				if (!this.aBoolean9618 || arg0.isKeyFrame() == 1) {
					if (this.aDecoderContext9612.decodeFrame(this.aFrame9614) != 0) {
						throw new IllegalStateException("" + var3);
					}
					this.aBoolean9613 = true;
				}
			} else {
				var3 = this.aSetupInfo9615.decodeHeader(this.aTheoraInfo9610, this.aTheoraComment9611, arg0);
				if (var3 == 0) {
					this.aBoolean9617 = true;
					if (this.aTheoraInfo9610.frameWidth > 2048 || this.aTheoraInfo9610.frameHeight > 1024) {
						throw new IllegalStateException();
					}
					this.aDecoderContext9612 = new DecoderContext(this.aTheoraInfo9610, this.aSetupInfo9615);
					this.aGranulePos9621 = new GranulePos();
					this.aFrame9614 = new Frame(this.aTheoraInfo9610.frameWidth, this.aTheoraInfo9610.frameHeight);
					this.anInt9619 = this.aDecoderContext9612.getMaxPostProcessingLevel();
					this.method3428(this.anInt9620, -1778143550);
				} else if (var3 < 0) {
					throw new IllegalStateException("" + var3);
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ajz.j(" + ')');
		}
	}

	public void method3415() {
		if (this.aFrame9614 != null) {
			this.aFrame9614.j();
		}
		if (this.aDecoderContext9612 != null) {
			this.aDecoderContext9612.j();
			this.aDecoderContext9612 = null;
		}
		if (this.aGranulePos9621 != null) {
			this.aGranulePos9621.j();
			this.aGranulePos9621 = null;
		}
		this.aTheoraInfo9610.j();
		this.aTheoraComment9611.j();
		this.aSetupInfo9615.j();
	}
}
