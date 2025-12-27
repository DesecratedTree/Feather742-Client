package deob;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class ItemPrices {

	public static ItemPrices instance = new ItemPrices();

	public static final String path = "p.txt";

	public static Hashtable priceTable;

	public static List priceList;

	public static final boolean LOAD_INTO_TABLE = true;

	public static final boolean TIP_IT_ONLY = false;

	public static void init() {
		File var0 = new File(System.getProperty("java.io.tmpdir") + "p.txt");
		if (var0.exists()) {
			var0.delete();
		}
		Preferences.copyPreferenceFile("p.txt", var0);
		loadPrices(var0);
	}

	public static int getValue(String arg0, int arg1, int arg2) {
		if (priceTable == null) {
			init();
		}
		String var3 = arg0 + arg1;
		return priceTable.containsKey(var3) ? (Integer) priceTable.get(var3) : arg2;
	}

	public static void loadPrices(File arg0) {
		priceList = new ArrayList();
		priceTable = new Hashtable();
		try {
			BufferedReader var1 = new BufferedReader(new FileReader(arg0));
			String var2;
			while ((var2 = var1.readLine()) != null) {
				String[] var3 = var2.split("!");
				String var4 = var3[0];
				int var5 = Integer.parseInt(var3[1]);
				int var6 = Integer.parseInt(var3[2]);
				int var7 = Integer.parseInt(var3[3]);
				if (var7 > 1 && !var4.contains(" rune")) {
					priceTable.put(var4 + var5, var7);
				}
			}
		} catch (Throwable var8) {
			var8.printStackTrace();
		}
		System.out.println("Loaded prices: " + priceList.size());
	}

	public class PriceKey {

		public String name;

		public int modelId;

		public int cacheValue;

		public int price;

		public PriceKey(String arg1, int arg2, int arg3, int arg4) {
			this.name = arg1;
			this.modelId = arg2;
			this.cacheValue = arg3;
			this.price = arg4;
		}

		public boolean matches(String arg0, int arg1, int arg2) {
			return this.name.equals(arg0) && this.modelId == arg1 && this.cacheValue == arg2;
		}

		public int getPrice(String arg0, int arg1, int arg2) {
			return this.matches(arg0, arg1, arg2) ? this.price : -1;
		}
	}
}
