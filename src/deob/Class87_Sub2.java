package deob;

public class Class87_Sub2 extends Class87 {

	public int anInt7107;

	public int anInt7108;

	public int anInt7109;

	public int anInt7110;

	public int anInt7111;

	public int anInt7112;

	public byte[] aByteArray7114;

	public byte[] aByteArray7115;

	public int[] anIntArray7113;

	public void method1000() {
		byte[] var1 = new byte[this.anInt7112 * this.anInt7107];
		int var2 = 0;
		int var3;
		int var4;
		if (this.aByteArray7115 == null) {
			for (var3 = 0; var3 < this.anInt7112; var3++) {
				for (var4 = this.anInt7107 - 1; var4 >= 0; var4--) {
					var1[var2++] = this.aByteArray7114[var3 + var4 * this.anInt7112];
				}
			}
			this.aByteArray7114 = var1;
		} else {
			byte[] var6 = new byte[this.anInt7112 * this.anInt7107];
			for (var4 = 0; var4 < this.anInt7112; var4++) {
				for (int var5 = this.anInt7107 - 1; var5 >= 0; var5--) {
					var1[var2] = this.aByteArray7114[var4 + var5 * this.anInt7112];
					var6[var2++] = this.aByteArray7115[var4 + var5 * this.anInt7112];
				}
			}
			this.aByteArray7114 = var1;
			this.aByteArray7115 = var6;
		}
		var3 = this.anInt7111;
		this.anInt7111 = this.anInt7109;
		this.anInt7109 = this.anInt7108;
		this.anInt7108 = this.anInt7110;
		this.anInt7110 = this.anInt7111;
		var3 = this.anInt7107;
		this.anInt7107 = this.anInt7112;
		this.anInt7112 = var3;
	}

	public boolean method1044() {
		return true;
	}

	public boolean method985() {
		return this.aByteArray7115 != null;
	}

	public int method986() {
		return this.anInt7112;
	}

	public int method1001(int arg0, int arg1) {
		return this.anIntArray7113[this.aByteArray7114[arg0 + arg1 * this.anInt7112] & 0xFF];
	}

	public int method993() {
		return this.anInt7112 + this.anInt7109 + this.anInt7110;
	}

	public int method1045() {
		return this.anInt7107 + this.anInt7111 + this.anInt7108;
	}

	public void method1027(int arg0) {
		int var2 = this.method993();
		int var3 = this.method1045();
		if (this.anInt7112 == var2 && this.anInt7107 == var3) {
			return;
		}
		int var4 = arg0;
		if (arg0 > this.anInt7109) {
			var4 = this.anInt7109;
		}
		int var5 = arg0;
		if (arg0 + this.anInt7109 + this.anInt7112 > var2) {
			var5 = var2 - this.anInt7109 - this.anInt7112;
		}
		int var6 = arg0;
		if (arg0 > this.anInt7111) {
			var6 = this.anInt7111;
		}
		int var7 = arg0;
		if (arg0 + this.anInt7111 + this.anInt7107 > var3) {
			var7 = var3 - this.anInt7111 - this.anInt7107;
		}
		int var8 = this.anInt7112 + var4 + var5;
		int var9 = this.anInt7107 + var6 + var7;
		byte[] var10 = new byte[var8 * var9];
		int var12;
		int var13;
		int var14;
		if (this.aByteArray7115 == null) {
			for (int var16 = 0; var16 < this.anInt7107; var16++) {
				var12 = var16 * this.anInt7112;
				var13 = (var16 + var6) * var8 + var4;
				for (var14 = 0; var14 < this.anInt7112; var14++) {
					var10[var13++] = this.aByteArray7114[var12++];
				}
			}
		} else {
			byte[] var11 = new byte[var8 * var9];
			var12 = 0;
			while (true) {
				if (var12 >= this.anInt7107) {
					this.aByteArray7115 = var11;
					break;
				}
				var13 = var12 * this.anInt7112;
				var14 = (var12 + var6) * var8 + var4;
				for (int var15 = 0; var15 < this.anInt7112; var15++) {
					var11[var14] = this.aByteArray7115[var13];
					var10[var14++] = this.aByteArray7114[var13++];
				}
				var12++;
			}
		}
		this.anInt7109 -= var4;
		this.anInt7111 -= var6;
		this.anInt7110 -= var5;
		this.anInt7108 -= var7;
		this.anInt7112 = var8;
		this.anInt7107 = var9;
		this.aByteArray7114 = var10;
	}

	public int method988() {
		return this.anInt7110;
	}

	public int method990() {
		return this.anInt7111;
	}

	public int method991() {
		return this.anInt7108;
	}

	public void method992() {
		this.anInt7108 = 0;
		this.anInt7111 = 0;
		this.anInt7110 = 0;
		this.anInt7109 = 0;
	}

	public int method1009() {
		return this.anInt7112;
	}

	public int method1026() {
		return this.anInt7112 + this.anInt7109 + this.anInt7110;
	}

	public void method998() {
		byte[] var1 = this.aByteArray7114;
		int var2;
		int var3;
		int var4;
		if (this.aByteArray7115 == null) {
			for (var2 = this.anInt7107 - 1; var2 >= 0; var2--) {
				var3 = var2 * this.anInt7112;
				var4 = (var2 + 1) * this.anInt7112;
				while (var3 < var4) {
					var4--;
					byte var5 = var1[var3];
					var1[var3] = var1[var4];
					var1[var4] = var5;
					var3++;
				}
			}
		} else {
			byte[] var7 = this.aByteArray7115;
			for (var3 = this.anInt7107 - 1; var3 >= 0; var3--) {
				var4 = var3 * this.anInt7112;
				int var8 = (var3 + 1) * this.anInt7112;
				while (var4 < var8) {
					var8--;
					byte var6 = var1[var4];
					var1[var4] = var1[var8];
					var1[var8] = var6;
					byte var9 = var7[var4];
					var7[var4] = var7[var8];
					var7[var8] = var9;
					var4++;
				}
			}
		}
		var2 = this.anInt7109;
		this.anInt7109 = this.anInt7110;
		this.anInt7110 = var2;
	}

	public void method999() {
		byte[] var1 = this.aByteArray7114;
		int var2;
		int var3;
		int var4;
		int var5;
		if (this.aByteArray7115 == null) {
			for (var2 = (this.anInt7107 >> 1) - 1; var2 >= 0; var2--) {
				var3 = var2 * this.anInt7112;
				var4 = (this.anInt7107 - var2 - 1) * this.anInt7112;
				for (var5 = -this.anInt7112; var5 < 0; var5++) {
					byte var6 = var1[var3];
					var1[var3] = var1[var4];
					var1[var4] = var6;
					var3++;
					var4++;
				}
			}
		} else {
			byte[] var8 = this.aByteArray7115;
			for (var3 = (this.anInt7107 >> 1) - 1; var3 >= 0; var3--) {
				var4 = var3 * this.anInt7112;
				var5 = (this.anInt7107 - var3 - 1) * this.anInt7112;
				for (int var9 = -this.anInt7112; var9 < 0; var9++) {
					byte var7 = var1[var4];
					var1[var4] = var1[var5];
					var1[var5] = var7;
					byte var10 = var8[var4];
					var8[var4] = var8[var5];
					var8[var5] = var10;
					var4++;
					var5++;
				}
			}
		}
		var2 = this.anInt7111;
		this.anInt7111 = this.anInt7108;
		this.anInt7108 = var2;
	}

	public void method1043(int arg0, int arg1, int arg2) {
		for (int var4 = 1; var4 < this.anIntArray7113.length; var4++) {
			if (this.anIntArray7113[var4] != 1 && this.anIntArray7113[var4] != 16711935) {
				int var5 = this.anIntArray7113[var4] >> 16 & 0xFF;
				var5 += arg0;
				if (var5 < 0) {
					var5 = 0;
				} else if (var5 > 255) {
					var5 = 255;
				}
				int var6 = this.anIntArray7113[var4] >> 8 & 0xFF;
				var6 += arg1;
				if (var6 < 0) {
					var6 = 0;
				} else if (var6 > 255) {
					var6 = 255;
				}
				int var7 = this.anIntArray7113[var4] >> 0 & 0xFF;
				var7 += arg2;
				if (var7 < 0) {
					var7 = 0;
				} else if (var7 > 255) {
					var7 = 255;
				}
				this.anIntArray7113[var4] = var5 << 16 | var6 << 8 | var7;
			}
		}
	}

	public int method989() {
		return this.anInt7110;
	}

	public void method996(int arg0, int arg1, int arg2) {
		for (int var4 = 1; var4 < this.anIntArray7113.length; var4++) {
			if (this.anIntArray7113[var4] != 1 && this.anIntArray7113[var4] != 16711935) {
				int var5 = this.anIntArray7113[var4] >> 16 & 0xFF;
				var5 += arg0;
				if (var5 < 0) {
					var5 = 0;
				} else if (var5 > 255) {
					var5 = 255;
				}
				int var6 = this.anIntArray7113[var4] >> 8 & 0xFF;
				var6 += arg1;
				if (var6 < 0) {
					var6 = 0;
				} else if (var6 > 255) {
					var6 = 255;
				}
				int var7 = this.anIntArray7113[var4] >> 0 & 0xFF;
				var7 += arg2;
				if (var7 < 0) {
					var7 = 0;
				} else if (var7 > 255) {
					var7 = 255;
				}
				this.anIntArray7113[var4] = var5 << 16 | var6 << 8 | var7;
			}
		}
	}

	public int method1003(int arg0, int arg1) {
		return this.anIntArray7113[this.aByteArray7114[arg0 + arg1 * this.anInt7112] & 0xFF];
	}

	public boolean method1005() {
		return true;
	}

	public boolean method1007() {
		return this.aByteArray7115 != null;
	}

	public boolean method1006() {
		return this.aByteArray7115 != null;
	}

	public void method1030(int arg0) {
		int var2 = -1;
		int var3;
		int var5;
		int var6;
		int var7;
		if (this.anIntArray7113.length < 255) {
			for (var3 = 0; var3 < this.anIntArray7113.length; var3++) {
				if (this.anIntArray7113[var3] == arg0) {
					var2 = var3;
					break;
				}
			}
			if (var2 == -1) {
				var2 = this.anIntArray7113.length;
				int[] var16 = new int[this.anIntArray7113.length + 1];
				System.arraycopy(this.anIntArray7113, 0, var16, 0, this.anIntArray7113.length);
				this.anIntArray7113 = var16;
				var16[var2] = arg0;
			}
		} else {
			var3 = Integer.MAX_VALUE;
			int var4 = arg0 >> 16 & 0xFF;
			var5 = arg0 >> 8 & 0xFF;
			var6 = arg0 & 0xFF;
			for (var7 = 0; var7 < this.anIntArray7113.length; var7++) {
				int var8 = this.anIntArray7113[var7];
				int var9 = var8 >> 16 & 0xFF;
				int var10 = var8 >> 8 & 0xFF;
				int var11 = var8 & 0xFF;
				int var12 = var4 - var9;
				if (var12 < 0) {
					var12 = -var12;
				}
				int var13 = var5 - var10;
				if (var13 < 0) {
					var13 = -var13;
				}
				int var14 = var6 - var11;
				if (var14 < 0) {
					var14 = -var14;
				}
				int var15 = var12 + var13 + var14;
				if (var15 < var3) {
					var3 = var15;
					var2 = var7;
				}
			}
		}
		var3 = 0;
		byte[] var17 = new byte[this.anInt7112 * this.anInt7107];
		for (var5 = 0; var5 < this.anInt7107; var5++) {
			for (var6 = 0; var6 < this.anInt7112; var6++) {
				var7 = this.aByteArray7114[var3] & 0xFF;
				if (this.anIntArray7113[var7] == 0) {
					if (var6 > 0 && this.anIntArray7113[this.aByteArray7114[var3 - 1] & 0xFF] != 0) {
						var7 = var2;
					} else if (var5 > 0 && this.anIntArray7113[this.aByteArray7114[var3 - this.anInt7112] & 0xFF] != 0) {
						var7 = var2;
					} else if (var6 < this.anInt7112 - 1 && this.anIntArray7113[this.aByteArray7114[var3 + 1] & 0xFF] != 0) {
						var7 = var2;
					} else if (var5 < this.anInt7107 - 1 && this.anIntArray7113[this.aByteArray7114[var3 + this.anInt7112] & 0xFF] != 0) {
						var7 = var2;
					}
				}
				var17[var3++] = (byte) var7;
			}
		}
		this.aByteArray7114 = var17;
	}

	public int method983() {
		return this.anInt7109;
	}

	public int method1041() {
		return this.anInt7108;
	}

	public int method1010() {
		return this.anInt7112;
	}

	public int method1047(int arg0, int arg1) {
		return this.anIntArray7113[this.aByteArray7114[arg0 + arg1 * this.anInt7112] & 0xFF];
	}

	public int method1012() {
		return this.anInt7112 + this.anInt7109 + this.anInt7110;
	}

	public void method995(int arg0) {
		int var2 = this.method993();
		int var3 = this.method1045();
		if (this.anInt7112 == var2 && this.anInt7107 == var3) {
			return;
		}
		int var4 = arg0;
		if (arg0 > this.anInt7109) {
			var4 = this.anInt7109;
		}
		int var5 = arg0;
		if (arg0 + this.anInt7109 + this.anInt7112 > var2) {
			var5 = var2 - this.anInt7109 - this.anInt7112;
		}
		int var6 = arg0;
		if (arg0 > this.anInt7111) {
			var6 = this.anInt7111;
		}
		int var7 = arg0;
		if (arg0 + this.anInt7111 + this.anInt7107 > var3) {
			var7 = var3 - this.anInt7111 - this.anInt7107;
		}
		int var8 = this.anInt7112 + var4 + var5;
		int var9 = this.anInt7107 + var6 + var7;
		byte[] var10 = new byte[var8 * var9];
		int var12;
		int var13;
		int var14;
		if (this.aByteArray7115 == null) {
			for (int var16 = 0; var16 < this.anInt7107; var16++) {
				var12 = var16 * this.anInt7112;
				var13 = (var16 + var6) * var8 + var4;
				for (var14 = 0; var14 < this.anInt7112; var14++) {
					var10[var13++] = this.aByteArray7114[var12++];
				}
			}
		} else {
			byte[] var11 = new byte[var8 * var9];
			var12 = 0;
			while (true) {
				if (var12 >= this.anInt7107) {
					this.aByteArray7115 = var11;
					break;
				}
				var13 = var12 * this.anInt7112;
				var14 = (var12 + var6) * var8 + var4;
				for (int var15 = 0; var15 < this.anInt7112; var15++) {
					var11[var14] = this.aByteArray7115[var13];
					var10[var14++] = this.aByteArray7114[var13++];
				}
				var12++;
			}
		}
		this.anInt7109 -= var4;
		this.anInt7111 -= var6;
		this.anInt7110 -= var5;
		this.anInt7108 -= var7;
		this.anInt7112 = var8;
		this.anInt7107 = var9;
		this.aByteArray7114 = var10;
	}

	public boolean method1008() {
		return this.aByteArray7115 != null;
	}

	public int method1019() {
		return this.anInt7107 + this.anInt7111 + this.anInt7108;
	}

	public int method1016() {
		return this.anInt7107 + this.anInt7111 + this.anInt7108;
	}

	public int method1017() {
		return this.anInt7109;
	}

	public int method1028() {
		return this.anInt7109;
	}

	public void method1035() {
		byte[] var1 = new byte[this.anInt7112 * this.anInt7107];
		int var2 = 0;
		int var3;
		int var4;
		if (this.aByteArray7115 == null) {
			for (var3 = 0; var3 < this.anInt7112; var3++) {
				for (var4 = this.anInt7107 - 1; var4 >= 0; var4--) {
					var1[var2++] = this.aByteArray7114[var3 + var4 * this.anInt7112];
				}
			}
			this.aByteArray7114 = var1;
		} else {
			byte[] var6 = new byte[this.anInt7112 * this.anInt7107];
			for (var4 = 0; var4 < this.anInt7112; var4++) {
				for (int var5 = this.anInt7107 - 1; var5 >= 0; var5--) {
					var1[var2] = this.aByteArray7114[var4 + var5 * this.anInt7112];
					var6[var2++] = this.aByteArray7115[var4 + var5 * this.anInt7112];
				}
			}
			this.aByteArray7114 = var1;
			this.aByteArray7115 = var6;
		}
		var3 = this.anInt7111;
		this.anInt7111 = this.anInt7109;
		this.anInt7109 = this.anInt7108;
		this.anInt7108 = this.anInt7110;
		this.anInt7110 = this.anInt7111;
		var3 = this.anInt7107;
		this.anInt7107 = this.anInt7112;
		this.anInt7112 = var3;
	}

	public int method1018() {
		return this.anInt7110;
	}

	public int method987() {
		return this.anInt7111;
	}

	public int method984() {
		return this.anInt7111;
	}

	public void method1033() {
		byte[] var1 = this.aByteArray7114;
		int var2;
		int var3;
		int var4;
		if (this.aByteArray7115 == null) {
			for (var2 = this.anInt7107 - 1; var2 >= 0; var2--) {
				var3 = var2 * this.anInt7112;
				var4 = (var2 + 1) * this.anInt7112;
				while (var3 < var4) {
					var4--;
					byte var5 = var1[var3];
					var1[var3] = var1[var4];
					var1[var4] = var5;
					var3++;
				}
			}
		} else {
			byte[] var7 = this.aByteArray7115;
			for (var3 = this.anInt7107 - 1; var3 >= 0; var3--) {
				var4 = var3 * this.anInt7112;
				int var8 = (var3 + 1) * this.anInt7112;
				while (var4 < var8) {
					var8--;
					byte var6 = var1[var4];
					var1[var4] = var1[var8];
					var1[var8] = var6;
					byte var9 = var7[var4];
					var7[var4] = var7[var8];
					var7[var8] = var9;
					var4++;
				}
			}
		}
		var2 = this.anInt7109;
		this.anInt7109 = this.anInt7110;
		this.anInt7110 = var2;
	}

	public int method1023() {
		return this.anInt7108;
	}

	public void method1024() {
		this.anInt7108 = 0;
		this.anInt7111 = 0;
		this.anInt7110 = 0;
		this.anInt7109 = 0;
	}

	public void method1025() {
		this.anInt7108 = 0;
		this.anInt7111 = 0;
		this.anInt7110 = 0;
		this.anInt7109 = 0;
	}

	public void method1013() {
		this.anInt7108 = 0;
		this.anInt7111 = 0;
		this.anInt7110 = 0;
		this.anInt7109 = 0;
	}

	public void method997(int arg0) {
		int var2 = -1;
		int var3;
		int var4;
		int var5;
		if (this.anIntArray7113.length < 255) {
			for (var3 = 0; var3 < this.anIntArray7113.length; var3++) {
				if (this.anIntArray7113[var3] == arg0) {
					var2 = var3;
					break;
				}
			}
			if (var2 == -1) {
				var2 = this.anIntArray7113.length;
				int[] var16 = new int[this.anIntArray7113.length + 1];
				System.arraycopy(this.anIntArray7113, 0, var16, 0, this.anIntArray7113.length);
				this.anIntArray7113 = var16;
				var16[var2] = arg0;
			}
		} else {
			var3 = Integer.MAX_VALUE;
			var4 = arg0 >> 16 & 0xFF;
			var5 = arg0 >> 8 & 0xFF;
			int var6 = arg0 & 0xFF;
			for (int var7 = 0; var7 < this.anIntArray7113.length; var7++) {
				int var8 = this.anIntArray7113[var7];
				int var9 = var8 >> 16 & 0xFF;
				int var10 = var8 >> 8 & 0xFF;
				int var11 = var8 & 0xFF;
				int var12 = var4 - var9;
				if (var12 < 0) {
					var12 = -var12;
				}
				int var13 = var5 - var10;
				if (var13 < 0) {
					var13 = -var13;
				}
				int var14 = var6 - var11;
				if (var14 < 0) {
					var14 = -var14;
				}
				int var15 = var12 + var13 + var14;
				if (var15 < var3) {
					var3 = var15;
					var2 = var7;
				}
			}
		}
		for (var3 = this.anInt7107 - 1; var3 > 0; var3--) {
			var4 = var3 * this.anInt7112;
			for (var5 = this.anInt7112 - 1; var5 > 0; var5--) {
				if (this.anIntArray7113[this.aByteArray7114[var5 + var4] & 0xFF] == 0 && this.anIntArray7113[this.aByteArray7114[var5 + var4 - 1 - this.anInt7112] & 0xFF] != 0) {
					this.aByteArray7114[var5 + var4] = (byte) var2;
				}
			}
		}
	}

	public void method1002(int arg0) {
		int var2 = this.method993();
		int var3 = this.method1045();
		if (this.anInt7112 == var2 && this.anInt7107 == var3) {
			return;
		}
		int var4 = arg0;
		if (arg0 > this.anInt7109) {
			var4 = this.anInt7109;
		}
		int var5 = arg0;
		if (arg0 + this.anInt7109 + this.anInt7112 > var2) {
			var5 = var2 - this.anInt7109 - this.anInt7112;
		}
		int var6 = arg0;
		if (arg0 > this.anInt7111) {
			var6 = this.anInt7111;
		}
		int var7 = arg0;
		if (arg0 + this.anInt7111 + this.anInt7107 > var3) {
			var7 = var3 - this.anInt7111 - this.anInt7107;
		}
		int var8 = this.anInt7112 + var4 + var5;
		int var9 = this.anInt7107 + var6 + var7;
		byte[] var10 = new byte[var8 * var9];
		int var12;
		int var13;
		int var14;
		if (this.aByteArray7115 == null) {
			for (int var16 = 0; var16 < this.anInt7107; var16++) {
				var12 = var16 * this.anInt7112;
				var13 = (var16 + var6) * var8 + var4;
				for (var14 = 0; var14 < this.anInt7112; var14++) {
					var10[var13++] = this.aByteArray7114[var12++];
				}
			}
		} else {
			byte[] var11 = new byte[var8 * var9];
			var12 = 0;
			while (true) {
				if (var12 >= this.anInt7107) {
					this.aByteArray7115 = var11;
					break;
				}
				var13 = var12 * this.anInt7112;
				var14 = (var12 + var6) * var8 + var4;
				for (int var15 = 0; var15 < this.anInt7112; var15++) {
					var11[var14] = this.aByteArray7115[var13];
					var10[var14++] = this.aByteArray7114[var13++];
				}
				var12++;
			}
		}
		this.anInt7109 -= var4;
		this.anInt7111 -= var6;
		this.anInt7110 -= var5;
		this.anInt7108 -= var7;
		this.anInt7112 = var8;
		this.anInt7107 = var9;
		this.aByteArray7114 = var10;
	}

	public void method1034(int arg0) {
		int var2 = -1;
		int var3;
		int var5;
		int var6;
		int var7;
		if (this.anIntArray7113.length < 255) {
			for (var3 = 0; var3 < this.anIntArray7113.length; var3++) {
				if (this.anIntArray7113[var3] == arg0) {
					var2 = var3;
					break;
				}
			}
			if (var2 == -1) {
				var2 = this.anIntArray7113.length;
				int[] var16 = new int[this.anIntArray7113.length + 1];
				System.arraycopy(this.anIntArray7113, 0, var16, 0, this.anIntArray7113.length);
				this.anIntArray7113 = var16;
				var16[var2] = arg0;
			}
		} else {
			var3 = Integer.MAX_VALUE;
			int var4 = arg0 >> 16 & 0xFF;
			var5 = arg0 >> 8 & 0xFF;
			var6 = arg0 & 0xFF;
			for (var7 = 0; var7 < this.anIntArray7113.length; var7++) {
				int var8 = this.anIntArray7113[var7];
				int var9 = var8 >> 16 & 0xFF;
				int var10 = var8 >> 8 & 0xFF;
				int var11 = var8 & 0xFF;
				int var12 = var4 - var9;
				if (var12 < 0) {
					var12 = -var12;
				}
				int var13 = var5 - var10;
				if (var13 < 0) {
					var13 = -var13;
				}
				int var14 = var6 - var11;
				if (var14 < 0) {
					var14 = -var14;
				}
				int var15 = var12 + var13 + var14;
				if (var15 < var3) {
					var3 = var15;
					var2 = var7;
				}
			}
		}
		var3 = 0;
		byte[] var17 = new byte[this.anInt7112 * this.anInt7107];
		for (var5 = 0; var5 < this.anInt7107; var5++) {
			for (var6 = 0; var6 < this.anInt7112; var6++) {
				var7 = this.aByteArray7114[var3] & 0xFF;
				if (this.anIntArray7113[var7] == 0) {
					if (var6 > 0 && this.anIntArray7113[this.aByteArray7114[var3 - 1] & 0xFF] != 0) {
						var7 = var2;
					} else if (var5 > 0 && this.anIntArray7113[this.aByteArray7114[var3 - this.anInt7112] & 0xFF] != 0) {
						var7 = var2;
					} else if (var6 < this.anInt7112 - 1 && this.anIntArray7113[this.aByteArray7114[var3 + 1] & 0xFF] != 0) {
						var7 = var2;
					} else if (var5 < this.anInt7107 - 1 && this.anIntArray7113[this.aByteArray7114[var3 + this.anInt7112] & 0xFF] != 0) {
						var7 = var2;
					}
				}
				var17[var3++] = (byte) var7;
			}
		}
		this.aByteArray7114 = var17;
	}

	public int method1014() {
		return this.anInt7107 + this.anInt7111 + this.anInt7108;
	}

	public void method1022(int arg0) {
		int var2 = -1;
		int var3;
		int var5;
		int var6;
		int var7;
		if (this.anIntArray7113.length < 255) {
			for (var3 = 0; var3 < this.anIntArray7113.length; var3++) {
				if (this.anIntArray7113[var3] == arg0) {
					var2 = var3;
					break;
				}
			}
			if (var2 == -1) {
				var2 = this.anIntArray7113.length;
				int[] var16 = new int[this.anIntArray7113.length + 1];
				System.arraycopy(this.anIntArray7113, 0, var16, 0, this.anIntArray7113.length);
				this.anIntArray7113 = var16;
				var16[var2] = arg0;
			}
		} else {
			var3 = Integer.MAX_VALUE;
			int var4 = arg0 >> 16 & 0xFF;
			var5 = arg0 >> 8 & 0xFF;
			var6 = arg0 & 0xFF;
			for (var7 = 0; var7 < this.anIntArray7113.length; var7++) {
				int var8 = this.anIntArray7113[var7];
				int var9 = var8 >> 16 & 0xFF;
				int var10 = var8 >> 8 & 0xFF;
				int var11 = var8 & 0xFF;
				int var12 = var4 - var9;
				if (var12 < 0) {
					var12 = -var12;
				}
				int var13 = var5 - var10;
				if (var13 < 0) {
					var13 = -var13;
				}
				int var14 = var6 - var11;
				if (var14 < 0) {
					var14 = -var14;
				}
				int var15 = var12 + var13 + var14;
				if (var15 < var3) {
					var3 = var15;
					var2 = var7;
				}
			}
		}
		var3 = 0;
		byte[] var17 = new byte[this.anInt7112 * this.anInt7107];
		for (var5 = 0; var5 < this.anInt7107; var5++) {
			for (var6 = 0; var6 < this.anInt7112; var6++) {
				var7 = this.aByteArray7114[var3] & 0xFF;
				if (this.anIntArray7113[var7] == 0) {
					if (var6 > 0 && this.anIntArray7113[this.aByteArray7114[var3 - 1] & 0xFF] != 0) {
						var7 = var2;
					} else if (var5 > 0 && this.anIntArray7113[this.aByteArray7114[var3 - this.anInt7112] & 0xFF] != 0) {
						var7 = var2;
					} else if (var6 < this.anInt7112 - 1 && this.anIntArray7113[this.aByteArray7114[var3 + 1] & 0xFF] != 0) {
						var7 = var2;
					} else if (var5 < this.anInt7107 - 1 && this.anIntArray7113[this.aByteArray7114[var3 + this.anInt7112] & 0xFF] != 0) {
						var7 = var2;
					}
				}
				var17[var3++] = (byte) var7;
			}
		}
		this.aByteArray7114 = var17;
	}

	public void method1032(int arg0) {
		int var2 = -1;
		int var3;
		int var4;
		int var5;
		if (this.anIntArray7113.length < 255) {
			for (var3 = 0; var3 < this.anIntArray7113.length; var3++) {
				if (this.anIntArray7113[var3] == arg0) {
					var2 = var3;
					break;
				}
			}
			if (var2 == -1) {
				var2 = this.anIntArray7113.length;
				int[] var16 = new int[this.anIntArray7113.length + 1];
				System.arraycopy(this.anIntArray7113, 0, var16, 0, this.anIntArray7113.length);
				this.anIntArray7113 = var16;
				var16[var2] = arg0;
			}
		} else {
			var3 = Integer.MAX_VALUE;
			var4 = arg0 >> 16 & 0xFF;
			var5 = arg0 >> 8 & 0xFF;
			int var6 = arg0 & 0xFF;
			for (int var7 = 0; var7 < this.anIntArray7113.length; var7++) {
				int var8 = this.anIntArray7113[var7];
				int var9 = var8 >> 16 & 0xFF;
				int var10 = var8 >> 8 & 0xFF;
				int var11 = var8 & 0xFF;
				int var12 = var4 - var9;
				if (var12 < 0) {
					var12 = -var12;
				}
				int var13 = var5 - var10;
				if (var13 < 0) {
					var13 = -var13;
				}
				int var14 = var6 - var11;
				if (var14 < 0) {
					var14 = -var14;
				}
				int var15 = var12 + var13 + var14;
				if (var15 < var3) {
					var3 = var15;
					var2 = var7;
				}
			}
		}
		for (var3 = this.anInt7107 - 1; var3 > 0; var3--) {
			var4 = var3 * this.anInt7112;
			for (var5 = this.anInt7112 - 1; var5 > 0; var5--) {
				if (this.anIntArray7113[this.aByteArray7114[var5 + var4] & 0xFF] == 0 && this.anIntArray7113[this.aByteArray7114[var5 + var4 - 1 - this.anInt7112] & 0xFF] != 0) {
					this.aByteArray7114[var5 + var4] = (byte) var2;
				}
			}
		}
	}

	public int[] method1031(boolean arg0) {
		int[] var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		if (arg0) {
			var3 = this.method993();
			var2 = new int[var3 * this.method1045()];
			if (this.aByteArray7115 == null) {
				for (var4 = 0; var4 < this.anInt7107; var4++) {
					var5 = var4 * this.anInt7112;
					var6 = this.anInt7109 + (var4 + this.anInt7111) * var3;
					for (var7 = 0; var7 < this.anInt7112; var7++) {
						int var8 = this.anIntArray7113[this.aByteArray7114[var5++] & 0xFF];
						if (var8 == 0) {
							var2[var6++] = 0;
						} else {
							var2[var6++] = var8 | 0xFF000000;
						}
					}
				}
			} else {
				for (var4 = 0; var4 < this.anInt7107; var4++) {
					var5 = var4 * this.anInt7112;
					var6 = this.anInt7109 + (var4 + this.anInt7111) * var3;
					for (var7 = 0; var7 < this.anInt7112; var7++) {
						var2[var6++] = this.aByteArray7115[var5] << 24 | this.anIntArray7113[this.aByteArray7114[var5] & 0xFF];
						var5++;
					}
				}
			}
		} else {
			var2 = new int[this.anInt7112 * this.anInt7107];
			var3 = 0;
			var4 = 0;
			if (this.aByteArray7115 == null) {
				for (var5 = 0; var5 < this.anInt7107; var5++) {
					for (var6 = 0; var6 < this.anInt7112; var6++) {
						var7 = this.anIntArray7113[this.aByteArray7114[var3++] & 0xFF];
						var2[var4++] = var7 == 0 ? 0 : var7 | 0xFF000000;
					}
				}
			} else {
				for (var5 = 0; var5 < this.anInt7107; var5++) {
					for (var6 = 0; var6 < this.anInt7112; var6++) {
						var2[var4++] = this.aByteArray7115[var3] << 24 | this.anIntArray7113[this.aByteArray7114[var3] & 0xFF];
						var3++;
					}
				}
			}
		}
		return var2;
	}

	public void method1020() {
		byte[] var1 = this.aByteArray7114;
		int var2;
		int var3;
		int var4;
		int var5;
		if (this.aByteArray7115 == null) {
			for (var2 = (this.anInt7107 >> 1) - 1; var2 >= 0; var2--) {
				var3 = var2 * this.anInt7112;
				var4 = (this.anInt7107 - var2 - 1) * this.anInt7112;
				for (var5 = -this.anInt7112; var5 < 0; var5++) {
					byte var6 = var1[var3];
					var1[var3] = var1[var4];
					var1[var4] = var6;
					var3++;
					var4++;
				}
			}
		} else {
			byte[] var8 = this.aByteArray7115;
			for (var3 = (this.anInt7107 >> 1) - 1; var3 >= 0; var3--) {
				var4 = var3 * this.anInt7112;
				var5 = (this.anInt7107 - var3 - 1) * this.anInt7112;
				for (int var9 = -this.anInt7112; var9 < 0; var9++) {
					byte var7 = var1[var4];
					var1[var4] = var1[var5];
					var1[var5] = var7;
					byte var10 = var8[var4];
					var8[var4] = var8[var5];
					var8[var5] = var10;
					var4++;
					var5++;
				}
			}
		}
		var2 = this.anInt7111;
		this.anInt7111 = this.anInt7108;
		this.anInt7108 = var2;
	}

	public int method1011() {
		return this.anInt7107;
	}

	public void method1036() {
		byte[] var1 = new byte[this.anInt7112 * this.anInt7107];
		int var2 = 0;
		int var3;
		int var4;
		if (this.aByteArray7115 == null) {
			for (var3 = 0; var3 < this.anInt7112; var3++) {
				for (var4 = this.anInt7107 - 1; var4 >= 0; var4--) {
					var1[var2++] = this.aByteArray7114[var3 + var4 * this.anInt7112];
				}
			}
			this.aByteArray7114 = var1;
		} else {
			byte[] var6 = new byte[this.anInt7112 * this.anInt7107];
			for (var4 = 0; var4 < this.anInt7112; var4++) {
				for (int var5 = this.anInt7107 - 1; var5 >= 0; var5--) {
					var1[var2] = this.aByteArray7114[var4 + var5 * this.anInt7112];
					var6[var2++] = this.aByteArray7115[var4 + var5 * this.anInt7112];
				}
			}
			this.aByteArray7114 = var1;
			this.aByteArray7115 = var6;
		}
		var3 = this.anInt7111;
		this.anInt7111 = this.anInt7109;
		this.anInt7109 = this.anInt7108;
		this.anInt7108 = this.anInt7110;
		this.anInt7110 = this.anInt7111;
		var3 = this.anInt7107;
		this.anInt7107 = this.anInt7112;
		this.anInt7112 = var3;
	}

	public int[] method1037(boolean arg0) {
		int[] var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		if (arg0) {
			var3 = this.method993();
			var2 = new int[var3 * this.method1045()];
			if (this.aByteArray7115 == null) {
				for (var4 = 0; var4 < this.anInt7107; var4++) {
					var5 = var4 * this.anInt7112;
					var6 = this.anInt7109 + (var4 + this.anInt7111) * var3;
					for (var7 = 0; var7 < this.anInt7112; var7++) {
						int var8 = this.anIntArray7113[this.aByteArray7114[var5++] & 0xFF];
						if (var8 == 0) {
							var2[var6++] = 0;
						} else {
							var2[var6++] = var8 | 0xFF000000;
						}
					}
				}
			} else {
				for (var4 = 0; var4 < this.anInt7107; var4++) {
					var5 = var4 * this.anInt7112;
					var6 = this.anInt7109 + (var4 + this.anInt7111) * var3;
					for (var7 = 0; var7 < this.anInt7112; var7++) {
						var2[var6++] = this.aByteArray7115[var5] << 24 | this.anIntArray7113[this.aByteArray7114[var5] & 0xFF];
						var5++;
					}
				}
			}
		} else {
			var2 = new int[this.anInt7112 * this.anInt7107];
			var3 = 0;
			var4 = 0;
			if (this.aByteArray7115 == null) {
				for (var5 = 0; var5 < this.anInt7107; var5++) {
					for (var6 = 0; var6 < this.anInt7112; var6++) {
						var7 = this.anIntArray7113[this.aByteArray7114[var3++] & 0xFF];
						var2[var4++] = var7 == 0 ? 0 : var7 | 0xFF000000;
					}
				}
			} else {
				for (var5 = 0; var5 < this.anInt7107; var5++) {
					for (var6 = 0; var6 < this.anInt7112; var6++) {
						var2[var4++] = this.aByteArray7115[var3] << 24 | this.anIntArray7113[this.aByteArray7114[var3] & 0xFF];
						var3++;
					}
				}
			}
		}
		return var2;
	}

	public int[] method1038(boolean arg0) {
		int[] var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		if (arg0) {
			var3 = this.method993();
			var2 = new int[var3 * this.method1045()];
			if (this.aByteArray7115 == null) {
				for (var4 = 0; var4 < this.anInt7107; var4++) {
					var5 = var4 * this.anInt7112;
					var6 = this.anInt7109 + (var4 + this.anInt7111) * var3;
					for (var7 = 0; var7 < this.anInt7112; var7++) {
						int var8 = this.anIntArray7113[this.aByteArray7114[var5++] & 0xFF];
						if (var8 == 0) {
							var2[var6++] = 0;
						} else {
							var2[var6++] = var8 | 0xFF000000;
						}
					}
				}
			} else {
				for (var4 = 0; var4 < this.anInt7107; var4++) {
					var5 = var4 * this.anInt7112;
					var6 = this.anInt7109 + (var4 + this.anInt7111) * var3;
					for (var7 = 0; var7 < this.anInt7112; var7++) {
						var2[var6++] = this.aByteArray7115[var5] << 24 | this.anIntArray7113[this.aByteArray7114[var5] & 0xFF];
						var5++;
					}
				}
			}
		} else {
			var2 = new int[this.anInt7112 * this.anInt7107];
			var3 = 0;
			var4 = 0;
			if (this.aByteArray7115 == null) {
				for (var5 = 0; var5 < this.anInt7107; var5++) {
					for (var6 = 0; var6 < this.anInt7112; var6++) {
						var7 = this.anIntArray7113[this.aByteArray7114[var3++] & 0xFF];
						var2[var4++] = var7 == 0 ? 0 : var7 | 0xFF000000;
					}
				}
			} else {
				for (var5 = 0; var5 < this.anInt7107; var5++) {
					for (var6 = 0; var6 < this.anInt7112; var6++) {
						var2[var4++] = this.aByteArray7115[var3] << 24 | this.anIntArray7113[this.aByteArray7114[var3] & 0xFF];
						var3++;
					}
				}
			}
		}
		return var2;
	}

	public void method1039(int arg0, int arg1, int arg2) {
		for (int var4 = 1; var4 < this.anIntArray7113.length; var4++) {
			if (this.anIntArray7113[var4] != 1 && this.anIntArray7113[var4] != 16711935) {
				int var5 = this.anIntArray7113[var4] >> 16 & 0xFF;
				var5 += arg0;
				if (var5 < 0) {
					var5 = 0;
				} else if (var5 > 255) {
					var5 = 255;
				}
				int var6 = this.anIntArray7113[var4] >> 8 & 0xFF;
				var6 += arg1;
				if (var6 < 0) {
					var6 = 0;
				} else if (var6 > 255) {
					var6 = 255;
				}
				int var7 = this.anIntArray7113[var4] >> 0 & 0xFF;
				var7 += arg2;
				if (var7 < 0) {
					var7 = 0;
				} else if (var7 > 255) {
					var7 = 255;
				}
				this.anIntArray7113[var4] = var5 << 16 | var6 << 8 | var7;
			}
		}
	}

	public void method1040(int arg0, int arg1, int arg2) {
		for (int var4 = 1; var4 < this.anIntArray7113.length; var4++) {
			if (this.anIntArray7113[var4] != 1 && this.anIntArray7113[var4] != 16711935) {
				int var5 = this.anIntArray7113[var4] >> 16 & 0xFF;
				var5 += arg0;
				if (var5 < 0) {
					var5 = 0;
				} else if (var5 > 255) {
					var5 = 255;
				}
				int var6 = this.anIntArray7113[var4] >> 8 & 0xFF;
				var6 += arg1;
				if (var6 < 0) {
					var6 = 0;
				} else if (var6 > 255) {
					var6 = 255;
				}
				int var7 = this.anIntArray7113[var4] >> 0 & 0xFF;
				var7 += arg2;
				if (var7 < 0) {
					var7 = 0;
				} else if (var7 > 255) {
					var7 = 255;
				}
				this.anIntArray7113[var4] = var5 << 16 | var6 << 8 | var7;
			}
		}
	}

	public int method994() {
		return this.anInt7107;
	}

	public void method1042(int arg0, int arg1, int arg2) {
		for (int var4 = 1; var4 < this.anIntArray7113.length; var4++) {
			if (this.anIntArray7113[var4] != 1 && this.anIntArray7113[var4] != 16711935) {
				int var5 = this.anIntArray7113[var4] >> 16 & 0xFF;
				var5 += arg0;
				if (var5 < 0) {
					var5 = 0;
				} else if (var5 > 255) {
					var5 = 255;
				}
				int var6 = this.anIntArray7113[var4] >> 8 & 0xFF;
				var6 += arg1;
				if (var6 < 0) {
					var6 = 0;
				} else if (var6 > 255) {
					var6 = 255;
				}
				int var7 = this.anIntArray7113[var4] >> 0 & 0xFF;
				var7 += arg2;
				if (var7 < 0) {
					var7 = 0;
				} else if (var7 > 255) {
					var7 = 255;
				}
				this.anIntArray7113[var4] = var5 << 16 | var6 << 8 | var7;
			}
		}
	}

	public void method1029(int arg0) {
		int var2 = -1;
		int var3;
		int var5;
		int var6;
		int var7;
		if (this.anIntArray7113.length < 255) {
			for (var3 = 0; var3 < this.anIntArray7113.length; var3++) {
				if (this.anIntArray7113[var3] == arg0) {
					var2 = var3;
					break;
				}
			}
			if (var2 == -1) {
				var2 = this.anIntArray7113.length;
				int[] var16 = new int[this.anIntArray7113.length + 1];
				System.arraycopy(this.anIntArray7113, 0, var16, 0, this.anIntArray7113.length);
				this.anIntArray7113 = var16;
				var16[var2] = arg0;
			}
		} else {
			var3 = Integer.MAX_VALUE;
			int var4 = arg0 >> 16 & 0xFF;
			var5 = arg0 >> 8 & 0xFF;
			var6 = arg0 & 0xFF;
			for (var7 = 0; var7 < this.anIntArray7113.length; var7++) {
				int var8 = this.anIntArray7113[var7];
				int var9 = var8 >> 16 & 0xFF;
				int var10 = var8 >> 8 & 0xFF;
				int var11 = var8 & 0xFF;
				int var12 = var4 - var9;
				if (var12 < 0) {
					var12 = -var12;
				}
				int var13 = var5 - var10;
				if (var13 < 0) {
					var13 = -var13;
				}
				int var14 = var6 - var11;
				if (var14 < 0) {
					var14 = -var14;
				}
				int var15 = var12 + var13 + var14;
				if (var15 < var3) {
					var3 = var15;
					var2 = var7;
				}
			}
		}
		var3 = 0;
		byte[] var17 = new byte[this.anInt7112 * this.anInt7107];
		for (var5 = 0; var5 < this.anInt7107; var5++) {
			for (var6 = 0; var6 < this.anInt7112; var6++) {
				var7 = this.aByteArray7114[var3] & 0xFF;
				if (this.anIntArray7113[var7] == 0) {
					if (var6 > 0 && this.anIntArray7113[this.aByteArray7114[var3 - 1] & 0xFF] != 0) {
						var7 = var2;
					} else if (var5 > 0 && this.anIntArray7113[this.aByteArray7114[var3 - this.anInt7112] & 0xFF] != 0) {
						var7 = var2;
					} else if (var6 < this.anInt7112 - 1 && this.anIntArray7113[this.aByteArray7114[var3 + 1] & 0xFF] != 0) {
						var7 = var2;
					} else if (var5 < this.anInt7107 - 1 && this.anIntArray7113[this.aByteArray7114[var3 + this.anInt7112] & 0xFF] != 0) {
						var7 = var2;
					}
				}
				var17[var3++] = (byte) var7;
			}
		}
		this.aByteArray7114 = var17;
	}

	public int method1004(int arg0, int arg1) {
		return this.anIntArray7113[this.aByteArray7114[arg0 + arg1 * this.anInt7112] & 0xFF];
	}

	public int method1021(int arg0, int arg1) {
		return this.anIntArray7113[this.aByteArray7114[arg0 + arg1 * this.anInt7112] & 0xFF];
	}

	public int method1046(int arg0, int arg1) {
		return this.anIntArray7113[this.aByteArray7114[arg0 + arg1 * this.anInt7112] & 0xFF];
	}

	public boolean method1015() {
		return true;
	}
}
