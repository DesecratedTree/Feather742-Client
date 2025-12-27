package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer.Info;
import javax.sound.sampled.SourceDataLine;

public class Class296_Sub1 extends Class296 {

	public boolean aBoolean7447 = false;

	public boolean aBoolean7450 = false;

	public int anInt7445;

	public AudioFormat anAudioFormat7449;

	public SourceDataLine aSourceDataLine7446;

	public byte[] aByteArray7448;

	public void method2948() {
		if (this.aBoolean7447) {
			return;
		}
		int var1 = 256;
		if (aBoolean3023) {
			var1 <<= 0x1;
		}
		for (int var2 = 0; var2 < var1; var2++) {
			int var3 = this.anIntArray3028[var2];
			if ((var3 + 8388608 & 0xFF000000) != 0) {
				var3 = var3 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray7448[var2 * 2] = (byte) (var3 >> 8);
			this.aByteArray7448[var2 * 2 + 1] = (byte) (var3 >> 16);
		}
		this.aSourceDataLine7446.write(this.aByteArray7448, 0, var1 << 1);
	}

	public void method2944(Component arg0) {
		Info[] var2 = AudioSystem.getMixerInfo();
		if (var2 != null) {
			Info[] var3 = var2;
			for (int var4 = 0; var4 < var3.length; var4++) {
				Info var5 = var3[var4];
				if (var5 != null) {
					String var6 = var5.getName();
					if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean7450 = true;
					}
				}
			}
		}
		this.anAudioFormat7449 = new AudioFormat((float) anInt3047, 16, aBoolean3023 ? 2 : 1, true, false);
		this.aByteArray7448 = new byte[0x100 << (aBoolean3023 ? 2 : 1)];
	}

	public void method2950(int arg0) throws LineUnavailableException {
		if (this.aSourceDataLine7446 != null) {
			if (!this.aBoolean7447) {
				throw new IllegalStateException("");
			}
			if (arg0 == this.anInt7445) {
				this.aBoolean7447 = false;
				return;
			}
			if (!this.method2952()) {
				return;
			}
		}
		try {
			javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat7449, arg0 << (aBoolean3023 ? 2 : 1));
			this.aSourceDataLine7446 = (SourceDataLine) AudioSystem.getLine(var2);
			this.aSourceDataLine7446.open();
			this.aSourceDataLine7446.start();
			this.anInt7445 = arg0;
			this.aBoolean7447 = false;
		} catch (LineUnavailableException var3) {
			if (IsaacCipher.method6046(arg0, 838000016) == 1) {
				this.aBoolean7447 = true;
				throw var3;
			}
			this.method2949(Class136.method1594(arg0, 1864323992));
		}
	}

	public int method2951() {
		return this.anInt7445 - (this.aSourceDataLine7446.available() >> (aBoolean3023 ? 2 : 1));
	}

	public void method2945(boolean arg0) {
		if (arg0) {
			this.method2952();
			return;
		}
		try {
			this.method2946();
		} catch (LineUnavailableException var3) {
		}
		this.aBoolean7447 = true;
	}

	public boolean method2952() {
		boolean var1 = false;
		if (this.aSourceDataLine7446 != null) {
			Thread var2 = new Thread(new Class303(this));
			var2.start();
			try {
				try {
					var2.join(2000L);
				} catch (InterruptedException var4) {
					if (this.aSourceDataLine7446 != null) {
						this.aSourceDataLine7446 = null;
						this.method2939();
					}
					var1 = true;
					return var1;
				}
				if (this.aSourceDataLine7446 != null) {
					this.aSourceDataLine7446 = null;
					this.method2939();
				}
				var1 = true;
			} catch (RuntimeException var5) {
				if (this.aSourceDataLine7446 != null) {
					this.aSourceDataLine7446 = null;
					this.method2939();
				}
				var1 = true;
				throw var5;
			}
		}
		return var1;
	}

	public void method2946() throws LineUnavailableException {
		if (this.aBoolean7447) {
			return;
		}
		this.aSourceDataLine7446.flush();
		if (this.aBoolean7450 && this.method2952()) {
			javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat7449, this.anInt7445 << (aBoolean3023 ? 2 : 1));
			this.aSourceDataLine7446 = (SourceDataLine) AudioSystem.getLine(var1);
			this.aSourceDataLine7446.open();
			this.aSourceDataLine7446.start();
		}
	}

	public void method2953(Component arg0) {
		Info[] var2 = AudioSystem.getMixerInfo();
		if (var2 != null) {
			Info[] var3 = var2;
			for (int var4 = 0; var4 < var3.length; var4++) {
				Info var5 = var3[var4];
				if (var5 != null) {
					String var6 = var5.getName();
					if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean7450 = true;
					}
				}
			}
		}
		this.anAudioFormat7449 = new AudioFormat((float) anInt3047, 16, aBoolean3023 ? 2 : 1, true, false);
		this.aByteArray7448 = new byte[0x100 << (aBoolean3023 ? 2 : 1)];
	}

	public void method2954(int arg0) throws LineUnavailableException {
		if (this.aSourceDataLine7446 != null) {
			if (!this.aBoolean7447) {
				throw new IllegalStateException("");
			}
			if (arg0 == this.anInt7445) {
				this.aBoolean7447 = false;
				return;
			}
			if (!this.method2952()) {
				return;
			}
		}
		try {
			javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat7449, arg0 << (aBoolean3023 ? 2 : 1));
			this.aSourceDataLine7446 = (SourceDataLine) AudioSystem.getLine(var2);
			this.aSourceDataLine7446.open();
			this.aSourceDataLine7446.start();
			this.anInt7445 = arg0;
			this.aBoolean7447 = false;
		} catch (LineUnavailableException var3) {
			if (IsaacCipher.method6046(arg0, 1883748665) == 1) {
				this.aBoolean7447 = true;
				throw var3;
			}
			this.method2949(Class136.method1594(arg0, 1997628858));
		}
	}

	public int method2940() {
		return this.anInt7445 - (this.aSourceDataLine7446.available() >> (aBoolean3023 ? 2 : 1));
	}

	public int method2955() {
		return this.anInt7445 - (this.aSourceDataLine7446.available() >> (aBoolean3023 ? 2 : 1));
	}

	public void method2956() {
		if (this.aBoolean7447) {
			return;
		}
		int var1 = 256;
		if (aBoolean3023) {
			var1 <<= 0x1;
		}
		for (int var2 = 0; var2 < var1; var2++) {
			int var3 = this.anIntArray3028[var2];
			if ((var3 + 8388608 & 0xFF000000) != 0) {
				var3 = var3 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray7448[var2 * 2] = (byte) (var3 >> 8);
			this.aByteArray7448[var2 * 2 + 1] = (byte) (var3 >> 16);
		}
		this.aSourceDataLine7446.write(this.aByteArray7448, 0, var1 << 1);
	}

	public void method2949(int arg0) throws LineUnavailableException {
		if (this.aSourceDataLine7446 != null) {
			if (!this.aBoolean7447) {
				throw new IllegalStateException("");
			}
			if (arg0 == this.anInt7445) {
				this.aBoolean7447 = false;
				return;
			}
			if (!this.method2952()) {
				return;
			}
		}
		try {
			javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat7449, arg0 << (aBoolean3023 ? 2 : 1));
			this.aSourceDataLine7446 = (SourceDataLine) AudioSystem.getLine(var2);
			this.aSourceDataLine7446.open();
			this.aSourceDataLine7446.start();
			this.anInt7445 = arg0;
			this.aBoolean7447 = false;
		} catch (LineUnavailableException var3) {
			if (IsaacCipher.method6046(arg0, 1436644909) == 1) {
				this.aBoolean7447 = true;
				throw var3;
			}
			this.method2949(Class136.method1594(arg0, 1827040006));
		}
	}

	public void method2957(Component arg0) {
		Info[] var2 = AudioSystem.getMixerInfo();
		if (var2 != null) {
			Info[] var3 = var2;
			for (int var4 = 0; var4 < var3.length; var4++) {
				Info var5 = var3[var4];
				if (var5 != null) {
					String var6 = var5.getName();
					if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean7450 = true;
					}
				}
			}
		}
		this.anAudioFormat7449 = new AudioFormat((float) anInt3047, 16, aBoolean3023 ? 2 : 1, true, false);
		this.aByteArray7448 = new byte[0x100 << (aBoolean3023 ? 2 : 1)];
	}

	public void method2958() {
		if (this.aBoolean7447) {
			return;
		}
		int var1 = 256;
		if (aBoolean3023) {
			var1 <<= 0x1;
		}
		for (int var2 = 0; var2 < var1; var2++) {
			int var3 = this.anIntArray3028[var2];
			if ((var3 + 8388608 & 0xFF000000) != 0) {
				var3 = var3 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray7448[var2 * 2] = (byte) (var3 >> 8);
			this.aByteArray7448[var2 * 2 + 1] = (byte) (var3 >> 16);
		}
		this.aSourceDataLine7446.write(this.aByteArray7448, 0, var1 << 1);
	}

	public void method2959(boolean arg0) {
		if (arg0) {
			this.method2952();
			return;
		}
		try {
			this.method2946();
		} catch (LineUnavailableException var3) {
		}
		this.aBoolean7447 = true;
	}

	public void method2960() {
		if (this.aBoolean7447) {
			return;
		}
		int var1 = 256;
		if (aBoolean3023) {
			var1 <<= 0x1;
		}
		for (int var2 = 0; var2 < var1; var2++) {
			int var3 = this.anIntArray3028[var2];
			if ((var3 + 8388608 & 0xFF000000) != 0) {
				var3 = var3 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray7448[var2 * 2] = (byte) (var3 >> 8);
			this.aByteArray7448[var2 * 2 + 1] = (byte) (var3 >> 16);
		}
		this.aSourceDataLine7446.write(this.aByteArray7448, 0, var1 << 1);
	}

	public void method2961() throws LineUnavailableException {
		if (this.aBoolean7447) {
			return;
		}
		this.aSourceDataLine7446.flush();
		if (this.aBoolean7450 && this.method2952()) {
			javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat7449, this.anInt7445 << (aBoolean3023 ? 2 : 1));
			this.aSourceDataLine7446 = (SourceDataLine) AudioSystem.getLine(var1);
			this.aSourceDataLine7446.open();
			this.aSourceDataLine7446.start();
		}
	}

	public void method2962() throws LineUnavailableException {
		if (this.aBoolean7447) {
			return;
		}
		this.aSourceDataLine7446.flush();
		if (this.aBoolean7450 && this.method2952()) {
			javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat7449, this.anInt7445 << (aBoolean3023 ? 2 : 1));
			this.aSourceDataLine7446 = (SourceDataLine) AudioSystem.getLine(var1);
			this.aSourceDataLine7446.open();
			this.aSourceDataLine7446.start();
		}
	}

	public void method2963() throws LineUnavailableException {
		if (this.aBoolean7447) {
			return;
		}
		this.aSourceDataLine7446.flush();
		if (this.aBoolean7450 && this.method2952()) {
			javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat7449, this.anInt7445 << (aBoolean3023 ? 2 : 1));
			this.aSourceDataLine7446 = (SourceDataLine) AudioSystem.getLine(var1);
			this.aSourceDataLine7446.open();
			this.aSourceDataLine7446.start();
		}
	}

	public void method2964(boolean arg0) {
		if (arg0) {
			this.method2952();
			return;
		}
		try {
			this.method2946();
		} catch (LineUnavailableException var3) {
		}
		this.aBoolean7447 = true;
	}
}
