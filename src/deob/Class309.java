package deob;

public class Class309 {

	public int anInt3200 = 2;

	public int[] anIntArray3195 = new int[2];

	public int[] anIntArray3199 = new int[2];

	public int anInt3196;

	public int anInt3197;

	public int anInt3198;

	public int anInt3201;

	public int anInt3202;

	public int anInt3203;

	public int anInt3204;

	public int anInt3205;

	public Class309() {
		this.anIntArray3195[0] = 0;
		this.anIntArray3195[1] = 65535;
		this.anIntArray3199[0] = 0;
		this.anIntArray3199[1] = 65535;
	}

	public final void method3093(Buffer arg0) {
		this.anInt3196 = arg0.readUnsignedByte(1722023152);
		this.anInt3198 = arg0.readInt((byte) 78);
		this.anInt3197 = arg0.readInt((byte) 77);
		this.method3094(arg0);
	}

	public final void method3094(Buffer arg0) {
		this.anInt3200 = arg0.readUnsignedByte(2067351052);
		this.anIntArray3195 = new int[this.anInt3200];
		this.anIntArray3199 = new int[this.anInt3200];
		for (int var2 = 0; var2 < this.anInt3200; var2++) {
			this.anIntArray3195[var2] = arg0.readUnsignedShort(599821793);
			this.anIntArray3199[var2] = arg0.readUnsignedShort(1746180964);
		}
	}

	public final int method3095(int arg0) {
		if (this.anInt3205 >= this.anInt3201) {
			this.anInt3204 = this.anIntArray3199[this.anInt3202++] << 15;
			if (this.anInt3202 >= this.anInt3200) {
				this.anInt3202 = this.anInt3200 - 1;
			}
			this.anInt3201 = (int) ((double) this.anIntArray3195[this.anInt3202] / 65536.0D * (double) arg0);
			if (this.anInt3201 > this.anInt3205) {
				this.anInt3203 = ((this.anIntArray3199[this.anInt3202] << 15) - this.anInt3204) / (this.anInt3201 - this.anInt3205);
			}
		}
		this.anInt3204 += this.anInt3203;
		this.anInt3205++;
		return this.anInt3204 - this.anInt3203 >> 15;
	}

	public final void method3096() {
		this.anInt3201 = 0;
		this.anInt3202 = 0;
		this.anInt3203 = 0;
		this.anInt3204 = 0;
		this.anInt3205 = 0;
	}
}
