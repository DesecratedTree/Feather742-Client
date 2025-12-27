package deob;

import java.io.File;
import javax.swing.filechooser.FileFilter;

public class FileFilter_Sub1 extends FileFilter {

	public Class19 aClass19_6451;

	public Class19 aClass19_6452;

	public String getDescription() {
		try {
			return null;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "agz.getDescription(" + ')');
		}
	}

	public boolean accept(File arg0) {
		try {
			if (this.aClass19_6451.method456(876607843) && arg0.isDirectory()) {
				return true;
			} else {
				return !this.aClass19_6451.method456(-402144774);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "agz.accept(" + ')');
		}
	}

	public FileFilter_Sub1(Class19 arg0, Class19 arg1) {
		this.aClass19_6451 = arg1;
	}

	public static void method6487(int arg0) {
		try {
			if (Class333.aClass326_3362 != null) {
				Class260 var1 = Class260.method2549(Class263_Sub2.myPlayer.method5346().aClass260_2606);
				Class381 var2 = client.aClass304_9030.method3022(423449266);
				var1.aFloat2716 += var2.gameSceneBaseX << 9;
				var1.aFloat2711 += var2.gameSceneBaseY << 9;
				var1.method2579((float) Class333.aClass326_3362.anInt3319, var1.aFloat2715, (float) Class333.aClass326_3362.anInt3317);
				float var3 = var1.method2565();
				var1.method2550();
				float var4 = 0.0F;
				if (var3 < (float) Class333.aClass326_3362.anInt3318) {
					var4 = 1.0F;
				} else if (var3 > (float) Class333.aClass326_3362.anInt3316) {
					var4 = 0.0F;
				} else {
					var3 -= Class333.aClass326_3362.anInt3318;
					var4 = 1.0F - var3 / (float) Class333.aClass326_3362.anInt3320;
				}
				Class374.method4341((int) (var4 * 256.0F), (short) 7091);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "agz.g(" + ')');
		}
	}
}
