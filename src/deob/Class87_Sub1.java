package deob;

public class Class87_Sub1 extends Class87 {

	public int anInt7099;

	public int anInt7101;

	public int[] anIntArray7105;

	public int anInt7100;

	public int anInt7102;

	public int anInt7103;

	public int anInt7104;

	public boolean aBoolean7106;

	public int method990() {
		return this.anInt7100;
	}

	public boolean method1044() {
		return false;
	}

	public boolean method985() {
		return this.aBoolean7106;
	}

	public int method986() {
		return this.anInt7099;
	}

	public int method994() {
		return this.anInt7101;
	}

	public void method1029(int arg0) {
		int var2 = 0;
		int[] var3 = new int[this.anInt7099 * this.anInt7101];
		for (int var4 = 0; var4 < this.anInt7101; var4++) {
			for (int var5 = 0; var5 < this.anInt7099; var5++) {
				int var6 = this.anIntArray7105[var2];
				if ((var6 & 0xFF000000) == 0) {
					if (var5 > 0 && (this.anIntArray7105[var2 - 1] & 0xFF000000) != 0) {
						var6 = arg0;
					} else if (var4 > 0 && (this.anIntArray7105[var2 - this.anInt7099] & 0xFF000000) != 0) {
						var6 = arg0;
					} else if (var5 < this.anInt7099 - 1 && (this.anIntArray7105[var2 + 1] & 0xFF000000) != 0) {
						var6 = arg0;
					} else if (var4 < this.anInt7101 - 1 && (this.anIntArray7105[var2 + this.anInt7099] & 0xFF000000) != 0) {
						var6 = arg0;
					}
				}
				var3[var2++] = var6;
			}
		}
		this.anIntArray7105 = var3;
	}

	public void method999() {
		int[] var1 = this.anIntArray7105;
		int var2;
		for (var2 = (this.anInt7101 >> 1) - 1; var2 >= 0; var2--) {
			int var3 = var2 * this.anInt7099;
			int var4 = (this.anInt7101 - var2 - 1) * this.anInt7099;
			for (int var5 = -this.anInt7099; var5 < 0; var5++) {
				int var6 = var1[var3];
				var1[var3] = var1[var4];
				var1[var4] = var6;
				var3++;
				var4++;
			}
		}
		var2 = this.anInt7100;
		this.anInt7100 = this.anInt7103;
		this.anInt7103 = var2;
	}

	public int[] method1037(boolean arg0) {
		if (!arg0 || this.method993() == this.anInt7099 && this.method1045() == this.anInt7101) {
			return this.anIntArray7105;
		}
		int var2 = this.method993();
		int[] var3 = new int[var2 * this.method1045()];
		for (int var4 = 0; var4 < this.anInt7101; var4++) {
			int var5 = var4 * this.anInt7099;
			int var6 = this.anInt7104 + (var4 + this.anInt7100) * var2;
			for (int var7 = 0; var7 < this.anInt7099; var7++) {
				var3[var6++] = this.anIntArray7105[var5];
				var5++;
			}
		}
		return var3;
	}

	public int method989() {
		return this.anInt7102;
	}

	public void method997(int arg0) {
		for (int var2 = this.anInt7101 - 1; var2 > 0; var2--) {
			int var3 = var2 * this.anInt7099;
			for (int var4 = this.anInt7099 - 1; var4 > 0; var4--) {
				if ((this.anIntArray7105[var4 + var3] & 0xFF000000) == 0 && (this.anIntArray7105[var4 + var3 - 1 - this.anInt7099] & 0xFF000000) != 0) {
					this.anIntArray7105[var4 + var3] = arg0;
				}
			}
		}
	}

	public int method991() {
		return this.anInt7103;
	}

	public void method992() {
		this.anInt7103 = 0;
		this.anInt7100 = 0;
		this.anInt7102 = 0;
		this.anInt7104 = 0;
	}

	public void method1000() {
		int[] var1 = new int[this.anInt7099 * this.anInt7101];
		int var2 = 0;
		int var3;
		for (var3 = 0; var3 < this.anInt7099; var3++) {
			for (int var4 = this.anInt7101 - 1; var4 >= 0; var4--) {
				var1[var2++] = this.anIntArray7105[var3 + var4 * this.anInt7099];
			}
		}
		this.anIntArray7105 = var1;
		var3 = this.anInt7100;
		this.anInt7100 = this.anInt7104;
		this.anInt7104 = this.anInt7103;
		this.anInt7103 = this.anInt7102;
		this.anInt7102 = this.anInt7100;
		var3 = this.anInt7101;
		this.anInt7101 = this.anInt7099;
		this.anInt7099 = var3;
	}

	public void method1034(int arg0) {
		int var2 = 0;
		int[] var3 = new int[this.anInt7099 * this.anInt7101];
		for (int var4 = 0; var4 < this.anInt7101; var4++) {
			for (int var5 = 0; var5 < this.anInt7099; var5++) {
				int var6 = this.anIntArray7105[var2];
				if ((var6 & 0xFF000000) == 0) {
					if (var5 > 0 && (this.anIntArray7105[var2 - 1] & 0xFF000000) != 0) {
						var6 = arg0;
					} else if (var4 > 0 && (this.anIntArray7105[var2 - this.anInt7099] & 0xFF000000) != 0) {
						var6 = arg0;
					} else if (var5 < this.anInt7099 - 1 && (this.anIntArray7105[var2 + 1] & 0xFF000000) != 0) {
						var6 = arg0;
					} else if (var4 < this.anInt7101 - 1 && (this.anIntArray7105[var2 + this.anInt7099] & 0xFF000000) != 0) {
						var6 = arg0;
					}
				}
				var3[var2++] = var6;
			}
		}
		this.anIntArray7105 = var3;
	}

	public boolean method1007() {
		return this.aBoolean7106;
	}

	public void method998() {
		int[] var1 = this.anIntArray7105;
		int var2;
		for (var2 = this.anInt7101 - 1; var2 >= 0; var2--) {
			int var3 = var2 * this.anInt7099;
			int var4 = (var2 + 1) * this.anInt7099;
			while (var3 < var4) {
				var4--;
				int var5 = var1[var3];
				var1[var3] = var1[var4];
				var1[var4] = var5;
				var3++;
			}
		}
		var2 = this.anInt7104;
		this.anInt7104 = this.anInt7102;
		this.anInt7102 = var2;
	}

	public void method1027(int arg0) {
		int var2 = this.method993();
		int var3 = this.method1045();
		if (this.anInt7099 == var2 && this.anInt7101 == var3) {
			return;
		}
		int var4 = arg0;
		if (arg0 > this.anInt7104) {
			var4 = this.anInt7104;
		}
		int var5 = arg0;
		if (arg0 + this.anInt7104 + this.anInt7099 > var2) {
			var5 = var2 - this.anInt7104 - this.anInt7099;
		}
		int var6 = arg0;
		if (arg0 > this.anInt7100) {
			var6 = this.anInt7100;
		}
		int var7 = arg0;
		if (arg0 + this.anInt7100 + this.anInt7101 > var3) {
			var7 = var3 - this.anInt7100 - this.anInt7101;
		}
		int var8 = this.anInt7099 + var4 + var5;
		int var9 = this.anInt7101 + var6 + var7;
		int[] var10 = new int[var8 * var9];
		for (int var11 = 0; var11 < this.anInt7101; var11++) {
			int var12 = var11 * this.anInt7099;
			int var13 = (var11 + var6) * var8 + var4;
			for (int var14 = 0; var14 < this.anInt7099; var14++) {
				var10[var13++] = this.anIntArray7105[var12++];
			}
		}
		this.anInt7104 -= var4;
		this.anInt7100 -= var6;
		this.anInt7102 -= var5;
		this.anInt7103 -= var7;
		this.anInt7099 = var8;
		this.anInt7101 = var9;
		this.anIntArray7105 = var10;
	}

	public int method1021(int arg0, int arg1) {
		return this.anIntArray7105[arg0 + arg1 * this.anInt7099];
	}

	public int method1004(int arg0, int arg1) {
		return this.anIntArray7105[arg0 + arg1 * this.anInt7099];
	}

	public void method996(int arg0, int arg1, int arg2) {
		for (int var4 = 1; var4 < this.anIntArray7105.length; var4++) {
			int var5 = this.anIntArray7105[var4] >> 16 & 0xFF;
			var5 += arg0;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}
			int var6 = this.anIntArray7105[var4] >> 8 & 0xFF;
			var6 += arg1;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}
			int var7 = this.anIntArray7105[var4] >> 0 & 0xFF;
			var7 += arg2;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}
			this.anIntArray7105[var4] = this.anIntArray7105[var4] & 0xFF000000 | var5 << 16 | var6 << 8 | var7;
		}
	}

	public int method993() {
		return this.anInt7099 + this.anInt7104 + this.anInt7102;
	}

	public boolean method1005() {
		return false;
	}

	public boolean method1015() {
		return false;
	}

	public boolean method1006() {
		return this.aBoolean7106;
	}

	public void method1024() {
		this.anInt7103 = 0;
		this.anInt7100 = 0;
		this.anInt7102 = 0;
		this.anInt7104 = 0;
	}

	public int method1028() {
		return this.anInt7104;
	}

	public int method1009() {
		return this.anInt7099;
	}

	public int method1010() {
		return this.anInt7099;
	}

	public int method1011() {
		return this.anInt7101;
	}

	public int method1012() {
		return this.anInt7099 + this.anInt7104 + this.anInt7102;
	}

	public int method1026() {
		return this.anInt7099 + this.anInt7104 + this.anInt7102;
	}

	public int method1014() {
		return this.anInt7101 + this.anInt7100 + this.anInt7103;
	}

	public int method1019() {
		return this.anInt7101 + this.anInt7100 + this.anInt7103;
	}

	public boolean method1008() {
		return this.aBoolean7106;
	}

	public void method1013() {
		this.anInt7103 = 0;
		this.anInt7100 = 0;
		this.anInt7102 = 0;
		this.anInt7104 = 0;
	}

	public void method995(int arg0) {
		int var2 = this.method993();
		int var3 = this.method1045();
		if (this.anInt7099 == var2 && this.anInt7101 == var3) {
			return;
		}
		int var4 = arg0;
		if (arg0 > this.anInt7104) {
			var4 = this.anInt7104;
		}
		int var5 = arg0;
		if (arg0 + this.anInt7104 + this.anInt7099 > var2) {
			var5 = var2 - this.anInt7104 - this.anInt7099;
		}
		int var6 = arg0;
		if (arg0 > this.anInt7100) {
			var6 = this.anInt7100;
		}
		int var7 = arg0;
		if (arg0 + this.anInt7100 + this.anInt7101 > var3) {
			var7 = var3 - this.anInt7100 - this.anInt7101;
		}
		int var8 = this.anInt7099 + var4 + var5;
		int var9 = this.anInt7101 + var6 + var7;
		int[] var10 = new int[var8 * var9];
		for (int var11 = 0; var11 < this.anInt7101; var11++) {
			int var12 = var11 * this.anInt7099;
			int var13 = (var11 + var6) * var8 + var4;
			for (int var14 = 0; var14 < this.anInt7099; var14++) {
				var10[var13++] = this.anIntArray7105[var12++];
			}
		}
		this.anInt7104 -= var4;
		this.anInt7100 -= var6;
		this.anInt7102 -= var5;
		this.anInt7103 -= var7;
		this.anInt7099 = var8;
		this.anInt7101 = var9;
		this.anIntArray7105 = var10;
	}

	public int method1018() {
		return this.anInt7102;
	}

	public int method988() {
		return this.anInt7102;
	}

	public int method1045() {
		return this.anInt7101 + this.anInt7100 + this.anInt7103;
	}

	public int method984() {
		return this.anInt7100;
	}

	public int method1041() {
		return this.anInt7103;
	}

	public int method1023() {
		return this.anInt7103;
	}

	public int method987() {
		return this.anInt7100;
	}

	public void method1025() {
		this.anInt7103 = 0;
		this.anInt7100 = 0;
		this.anInt7102 = 0;
		this.anInt7104 = 0;
	}

	public int method983() {
		return this.anInt7104;
	}

	public int method1047(int arg0, int arg1) {
		return this.anIntArray7105[arg0 + arg1 * this.anInt7099];
	}

	public void method1002(int arg0) {
		int var2 = this.method993();
		int var3 = this.method1045();
		if (this.anInt7099 == var2 && this.anInt7101 == var3) {
			return;
		}
		int var4 = arg0;
		if (arg0 > this.anInt7104) {
			var4 = this.anInt7104;
		}
		int var5 = arg0;
		if (arg0 + this.anInt7104 + this.anInt7099 > var2) {
			var5 = var2 - this.anInt7104 - this.anInt7099;
		}
		int var6 = arg0;
		if (arg0 > this.anInt7100) {
			var6 = this.anInt7100;
		}
		int var7 = arg0;
		if (arg0 + this.anInt7100 + this.anInt7101 > var3) {
			var7 = var3 - this.anInt7100 - this.anInt7101;
		}
		int var8 = this.anInt7099 + var4 + var5;
		int var9 = this.anInt7101 + var6 + var7;
		int[] var10 = new int[var8 * var9];
		for (int var11 = 0; var11 < this.anInt7101; var11++) {
			int var12 = var11 * this.anInt7099;
			int var13 = (var11 + var6) * var8 + var4;
			for (int var14 = 0; var14 < this.anInt7099; var14++) {
				var10[var13++] = this.anIntArray7105[var12++];
			}
		}
		this.anInt7104 -= var4;
		this.anInt7100 -= var6;
		this.anInt7102 -= var5;
		this.anInt7103 -= var7;
		this.anInt7099 = var8;
		this.anInt7101 = var9;
		this.anIntArray7105 = var10;
	}

	public Class87_Sub1(int arg0, int arg1, int[] arg2) {
		this.anInt7099 = arg0;
		this.anInt7101 = arg1;
		this.anIntArray7105 = arg2;
	}

	public void method1030(int arg0) {
		int var2 = 0;
		int[] var3 = new int[this.anInt7099 * this.anInt7101];
		for (int var4 = 0; var4 < this.anInt7101; var4++) {
			for (int var5 = 0; var5 < this.anInt7099; var5++) {
				int var6 = this.anIntArray7105[var2];
				if ((var6 & 0xFF000000) == 0) {
					if (var5 > 0 && (this.anIntArray7105[var2 - 1] & 0xFF000000) != 0) {
						var6 = arg0;
					} else if (var4 > 0 && (this.anIntArray7105[var2 - this.anInt7099] & 0xFF000000) != 0) {
						var6 = arg0;
					} else if (var5 < this.anInt7099 - 1 && (this.anIntArray7105[var2 + 1] & 0xFF000000) != 0) {
						var6 = arg0;
					} else if (var4 < this.anInt7101 - 1 && (this.anIntArray7105[var2 + this.anInt7099] & 0xFF000000) != 0) {
						var6 = arg0;
					}
				}
				var3[var2++] = var6;
			}
		}
		this.anIntArray7105 = var3;
	}

	public void method1022(int arg0) {
		int var2 = 0;
		int[] var3 = new int[this.anInt7099 * this.anInt7101];
		for (int var4 = 0; var4 < this.anInt7101; var4++) {
			for (int var5 = 0; var5 < this.anInt7099; var5++) {
				int var6 = this.anIntArray7105[var2];
				if ((var6 & 0xFF000000) == 0) {
					if (var5 > 0 && (this.anIntArray7105[var2 - 1] & 0xFF000000) != 0) {
						var6 = arg0;
					} else if (var4 > 0 && (this.anIntArray7105[var2 - this.anInt7099] & 0xFF000000) != 0) {
						var6 = arg0;
					} else if (var5 < this.anInt7099 - 1 && (this.anIntArray7105[var2 + 1] & 0xFF000000) != 0) {
						var6 = arg0;
					} else if (var4 < this.anInt7101 - 1 && (this.anIntArray7105[var2 + this.anInt7099] & 0xFF000000) != 0) {
						var6 = arg0;
					}
				}
				var3[var2++] = var6;
			}
		}
		this.anIntArray7105 = var3;
	}

	public void method1032(int arg0) {
		for (int var2 = this.anInt7101 - 1; var2 > 0; var2--) {
			int var3 = var2 * this.anInt7099;
			for (int var4 = this.anInt7099 - 1; var4 > 0; var4--) {
				if ((this.anIntArray7105[var4 + var3] & 0xFF000000) == 0 && (this.anIntArray7105[var4 + var3 - 1 - this.anInt7099] & 0xFF000000) != 0) {
					this.anIntArray7105[var4 + var3] = arg0;
				}
			}
		}
	}

	public void method1033() {
		int[] var1 = this.anIntArray7105;
		int var2;
		for (var2 = this.anInt7101 - 1; var2 >= 0; var2--) {
			int var3 = var2 * this.anInt7099;
			int var4 = (var2 + 1) * this.anInt7099;
			while (var3 < var4) {
				var4--;
				int var5 = var1[var3];
				var1[var3] = var1[var4];
				var1[var4] = var5;
				var3++;
			}
		}
		var2 = this.anInt7104;
		this.anInt7104 = this.anInt7102;
		this.anInt7102 = var2;
	}

	public void method1020() {
		int[] var1 = this.anIntArray7105;
		int var2;
		for (var2 = (this.anInt7101 >> 1) - 1; var2 >= 0; var2--) {
			int var3 = var2 * this.anInt7099;
			int var4 = (this.anInt7101 - var2 - 1) * this.anInt7099;
			for (int var5 = -this.anInt7099; var5 < 0; var5++) {
				int var6 = var1[var3];
				var1[var3] = var1[var4];
				var1[var4] = var6;
				var3++;
				var4++;
			}
		}
		var2 = this.anInt7100;
		this.anInt7100 = this.anInt7103;
		this.anInt7103 = var2;
	}

	public void method1035() {
		int[] var1 = new int[this.anInt7099 * this.anInt7101];
		int var2 = 0;
		int var3;
		for (var3 = 0; var3 < this.anInt7099; var3++) {
			for (int var4 = this.anInt7101 - 1; var4 >= 0; var4--) {
				var1[var2++] = this.anIntArray7105[var3 + var4 * this.anInt7099];
			}
		}
		this.anIntArray7105 = var1;
		var3 = this.anInt7100;
		this.anInt7100 = this.anInt7104;
		this.anInt7104 = this.anInt7103;
		this.anInt7103 = this.anInt7102;
		this.anInt7102 = this.anInt7100;
		var3 = this.anInt7101;
		this.anInt7101 = this.anInt7099;
		this.anInt7099 = var3;
	}

	public int method1016() {
		return this.anInt7101 + this.anInt7100 + this.anInt7103;
	}

	public int[] method1031(boolean arg0) {
		if (!arg0 || this.method993() == this.anInt7099 && this.method1045() == this.anInt7101) {
			return this.anIntArray7105;
		}
		int var2 = this.method993();
		int[] var3 = new int[var2 * this.method1045()];
		for (int var4 = 0; var4 < this.anInt7101; var4++) {
			int var5 = var4 * this.anInt7099;
			int var6 = this.anInt7104 + (var4 + this.anInt7100) * var2;
			for (int var7 = 0; var7 < this.anInt7099; var7++) {
				var3[var6++] = this.anIntArray7105[var5];
				var5++;
			}
		}
		return var3;
	}

	public int[] method1038(boolean arg0) {
		if (!arg0 || this.method993() == this.anInt7099 && this.method1045() == this.anInt7101) {
			return this.anIntArray7105;
		}
		int var2 = this.method993();
		int[] var3 = new int[var2 * this.method1045()];
		for (int var4 = 0; var4 < this.anInt7101; var4++) {
			int var5 = var4 * this.anInt7099;
			int var6 = this.anInt7104 + (var4 + this.anInt7100) * var2;
			for (int var7 = 0; var7 < this.anInt7099; var7++) {
				var3[var6++] = this.anIntArray7105[var5];
				var5++;
			}
		}
		return var3;
	}

	public void method1039(int arg0, int arg1, int arg2) {
		for (int var4 = 1; var4 < this.anIntArray7105.length; var4++) {
			int var5 = this.anIntArray7105[var4] >> 16 & 0xFF;
			var5 += arg0;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}
			int var6 = this.anIntArray7105[var4] >> 8 & 0xFF;
			var6 += arg1;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}
			int var7 = this.anIntArray7105[var4] >> 0 & 0xFF;
			var7 += arg2;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}
			this.anIntArray7105[var4] = this.anIntArray7105[var4] & 0xFF000000 | var5 << 16 | var6 << 8 | var7;
		}
	}

	public void method1040(int arg0, int arg1, int arg2) {
		for (int var4 = 1; var4 < this.anIntArray7105.length; var4++) {
			int var5 = this.anIntArray7105[var4] >> 16 & 0xFF;
			var5 += arg0;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}
			int var6 = this.anIntArray7105[var4] >> 8 & 0xFF;
			var6 += arg1;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}
			int var7 = this.anIntArray7105[var4] >> 0 & 0xFF;
			var7 += arg2;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}
			this.anIntArray7105[var4] = this.anIntArray7105[var4] & 0xFF000000 | var5 << 16 | var6 << 8 | var7;
		}
	}

	public void method1043(int arg0, int arg1, int arg2) {
		for (int var4 = 1; var4 < this.anIntArray7105.length; var4++) {
			int var5 = this.anIntArray7105[var4] >> 16 & 0xFF;
			var5 += arg0;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}
			int var6 = this.anIntArray7105[var4] >> 8 & 0xFF;
			var6 += arg1;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}
			int var7 = this.anIntArray7105[var4] >> 0 & 0xFF;
			var7 += arg2;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}
			this.anIntArray7105[var4] = this.anIntArray7105[var4] & 0xFF000000 | var5 << 16 | var6 << 8 | var7;
		}
	}

	public void method1042(int arg0, int arg1, int arg2) {
		for (int var4 = 1; var4 < this.anIntArray7105.length; var4++) {
			int var5 = this.anIntArray7105[var4] >> 16 & 0xFF;
			var5 += arg0;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}
			int var6 = this.anIntArray7105[var4] >> 8 & 0xFF;
			var6 += arg1;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}
			int var7 = this.anIntArray7105[var4] >> 0 & 0xFF;
			var7 += arg2;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}
			this.anIntArray7105[var4] = this.anIntArray7105[var4] & 0xFF000000 | var5 << 16 | var6 << 8 | var7;
		}
	}

	public int method1001(int arg0, int arg1) {
		return this.anIntArray7105[arg0 + arg1 * this.anInt7099];
	}

	public void method1036() {
		int[] var1 = new int[this.anInt7099 * this.anInt7101];
		int var2 = 0;
		int var3;
		for (var3 = 0; var3 < this.anInt7099; var3++) {
			for (int var4 = this.anInt7101 - 1; var4 >= 0; var4--) {
				var1[var2++] = this.anIntArray7105[var3 + var4 * this.anInt7099];
			}
		}
		this.anIntArray7105 = var1;
		var3 = this.anInt7100;
		this.anInt7100 = this.anInt7104;
		this.anInt7104 = this.anInt7103;
		this.anInt7103 = this.anInt7102;
		this.anInt7102 = this.anInt7100;
		var3 = this.anInt7101;
		this.anInt7101 = this.anInt7099;
		this.anInt7099 = var3;
	}

	public int method1003(int arg0, int arg1) {
		return this.anIntArray7105[arg0 + arg1 * this.anInt7099];
	}

	public int method1046(int arg0, int arg1) {
		return this.anIntArray7105[arg0 + arg1 * this.anInt7099];
	}

	public int method1017() {
		return this.anInt7104;
	}
}
