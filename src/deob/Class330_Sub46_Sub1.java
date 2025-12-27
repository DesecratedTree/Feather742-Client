package deob;

import jaclib.memory.Stream;

public class Class330_Sub46_Sub1 extends Buffer {

	public void method3818(float arg0) {
		int var2 = Stream.floatToRawIntBits(arg0);
		this.payload[++this.offset - 1] = (byte) var2;
		this.payload[++this.offset - 1] = (byte) (var2 >> 8);
		this.payload[++this.offset - 1] = (byte) (var2 >> 16);
		this.payload[++this.offset - 1] = (byte) (var2 >> 24);
	}

	public void method3819(float arg0) {
		int var2 = Stream.floatToRawIntBits(arg0);
		this.payload[++this.offset - 1] = (byte) (var2 >> 24);
		this.payload[++this.offset - 1] = (byte) (var2 >> 16);
		this.payload[++this.offset - 1] = (byte) (var2 >> 8);
		this.payload[++this.offset - 1] = (byte) var2;
	}

	public Class330_Sub46_Sub1(int arg0) {
		super(arg0);
	}
}
