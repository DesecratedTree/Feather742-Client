package deob;

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import java.io.IOException;

public abstract class Class330_Sub31 extends Class330 {

	public OggStreamState anOggStreamState7724;

	public int anInt7723;

	public void method3410(OggPacket arg0, byte arg1) {
		try {
			this.method3411(arg0, 975492153);
			this.anInt7723++;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "adl.r(" + ')');
		}
	}

	public Class330_Sub31(OggStreamState arg0) {
		this.anOggStreamState7724 = arg0;
	}

	public static final void method3416(IComponentDefinitions arg0, Class430 arg1, int arg2) {
		try {
			Class524 var3 = arg0.method1405(Class219.aClass230_2183, client.anInterface12_9243, 2134561875);
			int var4 = arg1.anIntArray4387[--arg1.anInt4376];
			int var5 = arg1.anIntArray4387[--arg1.anInt4376];
			int var6 = var3.method6243(arg0.aString1266, arg0.anInt1210, arg0.anInt1267, var5, var4, Class57.aClass61Array6599, -1718536581);
			arg1.anIntArray4387[++arg1.anInt4376 - 1] = var6;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "adl.qv(" + ')');
		}
	}

	public static final void logout(boolean arg0, int arg1) {
		try {
			Class1[] var2 = client.aClass1Array8963;
			for (int var3 = 0; var3 < var2.length; var3++) {
				Class1 var4 = var2[var3];
				try {
					var4.method381(1906300241);
				} catch (IOException var7) {
				}
				var4.method379(1175619289);
			}
			Class149_Sub1.method1766(859078960);
			Class50.method632(false, (byte) -81);
			client.aClass304_9030.method3003(230127954);
			client.aClass304_9030.method3028(-48236021);
			Class517.method6212(false, -546665429);
			Class456.method5656(1372225037);
			Class400.method4704(2, (byte) 71);
			Class333.musicId = -1;
			Class333.aBoolean3354 = false;
			Class479.method6014(-1890487234);
			Class481.method6020(true, -1727423015);
			Class523.method6237((short) -172);
			Class386.method4438(127580599);
			Class500.method6121((byte) 0);
			if (arg0) {
				Class227.method2311(4, -1188873169);
			} else {
				Class227.method2311(6, -1188873169);
				try {
					Class492.method6078(Class293.anApplet6804, "loggedout", (byte) 1);
				} catch (Throwable var6) {
				}
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "adl.gu(" + ')');
		}
	}

	public static final void method3418(IComponentDefinitions arg0, Class430 arg1, int arg2) {
		try {
			int var3 = arg1.anIntArray4387[--arg1.anInt4376];
			int var4 = arg1.anIntArray4387[--arg1.anInt4376] - 1;
			if (arg0.anInt1238 != 2) {
				throw new RuntimeException("");
			}
			Class551 var5 = Class158_Sub3.aClass553_8875.method6392(arg0.anInt1239, 1057823395);
			if (arg0.aClass538_1362 == null) {
				arg0.aClass538_1362 = new Class538(var5, false);
			}
			arg0.aClass538_1362.aLong6242 = Class116.method1418(735911697);
			if (var4 < 0 || var4 >= var5.anIntArray6297.length) {
				throw new RuntimeException("");
			}
			arg0.aClass538_1362.anIntArray6240[var4] = var3;
			Class404.method4738(arg0, 1351443670);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "adl.qg(" + ')');
		}
	}

	public abstract void method3411(OggPacket arg0, int arg1);

	public abstract void method3412(OggPacket arg0);

	public abstract void method3413(int arg0);

	public abstract void method3414();

	public abstract void method3415();
}
