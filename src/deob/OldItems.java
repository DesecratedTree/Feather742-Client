package deob;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Hashtable;

public class OldItems {

	public static final String path = "olditems.txt";

	public static Hashtable oldItemData2;

	public static final boolean DISABLED = false;

	public static int[] getOldItemData(int arg0) {
		if (oldItemData2 == null) {
			init();
		}
		return (int[]) oldItemData2.get(arg0);
	}

	public static void init() {
		File var0 = new File(System.getProperty("java.io.tmpdir") + "olditems.txt");
		if (var0.exists()) {
			var0.delete();
		}
		Preferences.copyPreferenceFile("olditems.txt", var0);
		loadPrices(var0);
	}

	public static void loadPrices(File arg0) {
		try {
			oldItemData2 = new Hashtable();
			BufferedReader var1 = new BufferedReader(new FileReader(arg0));
			String var2;
			while ((var2 = var1.readLine()) != null) {
				String[] var3 = var2.split(",");
				if (var3.length > 1) {
					int var4 = Integer.parseInt(var3[0]);
					int[] var5 = new int[] { Integer.parseInt(var3[1]), Integer.parseInt(var3[2]), Integer.parseInt(var3[3]), Integer.parseInt(var3[4]), Integer.parseInt(var3[5]), Integer.parseInt(var3[6]), Integer.parseInt(var3[7]), Integer.parseInt(var3[8]), Integer.parseInt(var3[9]), Integer.parseInt(var3[10]), Integer.parseInt(var3[11]), Integer.parseInt(var3[12]), Integer.parseInt(var3[13]) };
					oldItemData2.put(var4, var5);
				}
			}
		} catch (Throwable var6) {
			var6.printStackTrace();
		}
		System.out.println("Loaded prices: " + oldItemData2.size());
	}
}
