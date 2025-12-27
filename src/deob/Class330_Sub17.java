package deob;

public class Class330_Sub17 extends Class330 {

	public int anInt7625;

	public int anInt7622;

	public int anInt7627;

	public int anInt7624;

	public int anInt7628;

	public int anInt7621;

	public int anInt7623;

	public int anInt7626;

	public int anInt7629;

	public Class330_Sub17(Buffer arg0) {
		int var2 = arg0.readInt((byte) 94);
		this.anInt7625 = var2 >>> 28;
		this.anInt7622 = var2 >>> 14 & 0x3FFF;
		this.anInt7627 = var2 & 0x3FFF;
		this.anInt7624 = arg0.readUnsignedByte(1657586499);
		this.anInt7628 = arg0.readUnsignedByte(1297016395);
		this.anInt7621 = arg0.readUnsignedByte(1579865698);
		this.anInt7623 = arg0.readUnsignedByte(882237985);
		this.anInt7626 = arg0.readUnsignedByte(1240712095);
		this.anInt7629 = arg0.readUnsignedByte(108629629);
	}
}
