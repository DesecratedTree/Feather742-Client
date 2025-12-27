package deob;

import java.nio.ByteBuffer;
import java.util.Vector;

public class Class180 {

	public Vector aVector1778 = new Vector();

	public int anInt1774 = 0;

	public int anInt1769 = 0;

	public Class_ra_Sub2 aClass_ra_Sub2_1772;

	public Class86 aClass86_1766;

	public int anInt1781;

	public int anInt1775;

	public Class184 aClass184_1780;

	public Class76_Sub2 aClass76_Sub2_1762;

	public Class76_Sub2 aClass76_Sub2_1763;

	public Interface11_Impl3_Impl1 anInterface11_Impl3_Impl1_1764;

	public Interface11_Impl3_Impl1 anInterface11_Impl3_Impl1_1767;

	public Interface11_Impl3_Impl1 anInterface11_Impl3_Impl1_1776;

	public Interface8_Impl1_Impl1 anInterface8_Impl1_Impl1_1773;

	public Interface8_Impl1_Impl1 anInterface8_Impl1_Impl1_1782;

	public Interface8_Impl1_Impl2 anInterface8_Impl1_Impl2_1765;

	public Interface8_Impl1_Impl2 anInterface8_Impl1_Impl2_1768;

	public Interface8_Impl1_Impl2 anInterface8_Impl1_Impl2_1770;

	public Interface8_Impl1_Impl2 anInterface8_Impl1_Impl2_1771;

	public Interface9_Impl1 anInterface9_Impl1_1779;

	public boolean aBoolean1777;

	public Class180(Class_ra_Sub2 arg0, int arg1, int arg2) {
		this.aClass_ra_Sub2_1772 = arg0;
		this.aClass86_1766 = Class86.aClass86_714;
		this.anInt1781 = arg1;
		this.anInt1775 = arg2;
	}

	public void method2053() {
		if (this.anInterface9_Impl1_1779 != null) {
			return;
		}
		this.anInterface9_Impl1_1779 = this.aClass_ra_Sub2_1772.method4976(false);
		this.anInterface9_Impl1_1779.method142(12, 4);
		ByteBuffer var1 = this.aClass_ra_Sub2_1772.aByteBuffer8458;
		var1.clear();
		var1.putFloat(0.0F);
		var1.putFloat(1.0F);
		var1.putFloat(2.0F);
		this.anInterface9_Impl1_1779.method97(0, var1.position(), this.aClass_ra_Sub2_1772.aLong8459);
		this.aClass184_1780 = this.aClass_ra_Sub2_1772.method4977(new Class193[] { new Class193(Class191.aClass191_1861) });
	}

	public void method2054() {
		this.aClass_ra_Sub2_1772.method5081(0, this.anInterface9_Impl1_1779);
		this.aClass_ra_Sub2_1772.method4978(this.aClass184_1780);
		this.aClass_ra_Sub2_1772.method4898(Class199.aClass199_1926, 0, 1);
	}

	public void method2055() {
		this.method2053();
		switch(this.anInt1774) {
			case 0:
				this.aClass86_1766 = Class86.aClass86_714;
				break;
			case 1:
				this.aClass86_1766 = Class86.aClass86_716;
				break;
			case 2:
				this.aClass86_1766 = Class86.aClass86_717;
				break;
			default:
				throw new RuntimeException();
		}
		this.aClass76_Sub2_1762 = this.aClass_ra_Sub2_1772.ag();
		if (this.aClass_ra_Sub2_1772.anInt8490 > 1 && this.aClass_ra_Sub2_1772.aBoolean8595 && this.aClass_ra_Sub2_1772.aBoolean8496) {
			this.aClass76_Sub2_1763 = this.aClass_ra_Sub2_1772.ag();
			this.anInterface8_Impl1_Impl2_1771 = this.aClass_ra_Sub2_1772.az(this.anInt1781, this.anInt1775, Class72.aClass72_620, this.aClass86_1766, this.aClass_ra_Sub2_1772.anInt8490);
			this.anInterface8_Impl1_Impl1_1773 = this.aClass_ra_Sub2_1772.av(this.anInt1781, this.anInt1775, this.aClass_ra_Sub2_1772.anInt8490);
		}
		this.anInterface11_Impl3_Impl1_1764 = this.aClass_ra_Sub2_1772.method4953(Class72.aClass72_620, this.aClass86_1766, this.anInt1781, this.anInt1775);
		this.anInterface8_Impl1_Impl2_1768 = this.anInterface11_Impl3_Impl1_1764.method169(0);
		this.anInterface11_Impl3_Impl1_1776 = this.aClass_ra_Sub2_1772.method4953(Class72.aClass72_620, this.aClass86_1766, this.anInt1781, this.anInt1775);
		this.anInterface8_Impl1_Impl2_1765 = this.anInterface11_Impl3_Impl1_1776.method169(0);
		this.anInterface11_Impl3_Impl1_1767 = this.aClass_ra_Sub2_1772.method4953(Class72.aClass72_620, this.aClass86_1766, this.anInt1781, this.anInt1775);
		this.anInterface8_Impl1_Impl2_1770 = this.anInterface11_Impl3_Impl1_1767.method169(0);
		this.anInterface8_Impl1_Impl1_1782 = this.aClass_ra_Sub2_1772.ah(this.anInt1781, this.anInt1775);
		int var1 = this.aVector1778.size();
		for (int var2 = 0; var2 < var1; var2++) {
			Class192 var3 = (Class192) this.aVector1778.elementAt(var2);
			var3.method2103(this.anInt1781, this.anInt1775);
		}
	}

	public boolean method2056(int arg0, Class192 arg1) {
		if (!arg1.method2099() && !arg1.method2110()) {
			this.method2057(arg1);
			return true;
		}
		this.aVector1778.insertElementAt(arg1, arg0);
		arg1.method2103(this.anInt1781, this.anInt1775);
		int var3 = arg1.method2107();
		if (var3 > this.anInt1774) {
			this.anInt1774 = var3;
		}
		arg1.aBoolean1880 = true;
		return true;
	}

	public void method2057(Class192 arg0) {
		arg0.method2101();
		arg0.aBoolean1880 = false;
		this.aVector1778.removeElement(arg0);
	}

	public boolean method2058(int arg0, int arg1, int arg2, int arg3) {
		if (this.aVector1778.isEmpty()) {
			return false;
		}
		if (this.anInt1781 != arg2 || this.anInt1775 != arg3 || this.aClass_ra_Sub2_1772.anInt8490 != this.anInt1769) {
			this.anInt1769 = this.aClass_ra_Sub2_1772.anInt8490;
			this.anInt1781 = arg2;
			this.anInt1775 = arg3;
			this.method2061();
			this.method2055();
		}
		this.aClass76_Sub2_1762.method901(0, this.anInterface8_Impl1_Impl2_1770);
		if (this.anInterface8_Impl1_Impl1_1782 != null) {
			this.aClass76_Sub2_1762.method900(this.anInterface8_Impl1_Impl1_1782);
		}
		if (this.aClass76_Sub2_1763 == null) {
			this.aClass_ra_Sub2_1772.method4785(this.aClass76_Sub2_1762, (byte) 1);
		} else {
			this.aClass76_Sub2_1763.method901(0, this.anInterface8_Impl1_Impl2_1771);
			this.aClass76_Sub2_1763.method900(this.anInterface8_Impl1_Impl1_1773);
			this.aClass_ra_Sub2_1772.method4785(this.aClass76_Sub2_1763, (byte) 1);
		}
		this.aClass_ra_Sub2_1772.ba(3, -16777216);
		this.aClass_ra_Sub2_1772.method5040(15);
		this.aClass_ra_Sub2_1772.method4971(0);
		if (!this.aClass76_Sub2_1762.method902()) {
			throw new RuntimeException("");
		}
		this.aBoolean1777 = true;
		return true;
	}

	public void method2059() {
		if (!this.aBoolean1777) {
			return;
		}
		if (this.aClass76_Sub2_1763 != null) {
			this.aClass_ra_Sub2_1772.method4802(this.aClass76_Sub2_1763, (byte) 0);
			this.aClass_ra_Sub2_1772.method4785(this.aClass76_Sub2_1762, (byte) 1);
			this.aClass76_Sub2_1763.method903(0, 0, this.anInt1781, this.anInt1775, 0, 0, true, this.anInterface8_Impl1_Impl1_1782 != null);
		}
		this.method2060();
		this.aBoolean1777 = false;
	}

	public void method2060() {
		this.aClass_ra_Sub2_1772.method4787(true);
		this.aClass_ra_Sub2_1772.method4943();
		this.aClass_ra_Sub2_1772.method4970(0);
		this.aClass_ra_Sub2_1772.method4889(1);
		this.aClass_ra_Sub2_1772.L();
		this.aClass76_Sub2_1762.method900(null);
		this.aClass_ra_Sub2_1772.method4994(0, 0);
		int var1 = this.aVector1778.size();
		this.anInterface11_Impl3_Impl1_1767.method115();
		for (int var2 = 0; var2 < var1; var2++) {
			Class192 var3 = (Class192) this.aVector1778.elementAt(var2);
			int var4 = var3.method2105();
			boolean var5 = var2 == var1 - 1;
			for (int var6 = 0; var6 < var4; var6++) {
				if (var5 && var6 == var4 - 1) {
					this.aClass_ra_Sub2_1772.method4802(this.aClass76_Sub2_1762, (byte) 0);
				} else {
					this.aClass76_Sub2_1762.method901(0, this.anInterface8_Impl1_Impl2_1765);
				}
				Interface11_Impl3_Impl1 var7 = this.anInterface11_Impl3_Impl1_1764;
				if (var6 == 0) {
					var7 = this.anInterface11_Impl3_Impl1_1767;
				}
				var3.method2104(var6, this.aClass76_Sub2_1762, var7, this.anInterface8_Impl1_Impl1_1782, this.anInterface11_Impl3_Impl1_1767);
				this.method2054();
				var3.method2120(var6);
				Interface11_Impl3_Impl1 var8 = this.anInterface11_Impl3_Impl1_1764;
				this.anInterface11_Impl3_Impl1_1764 = this.anInterface11_Impl3_Impl1_1776;
				this.anInterface11_Impl3_Impl1_1776 = var8;
				Interface8_Impl1_Impl2 var9 = this.anInterface8_Impl1_Impl2_1768;
				this.anInterface8_Impl1_Impl2_1768 = this.anInterface8_Impl1_Impl2_1765;
				this.anInterface8_Impl1_Impl2_1765 = var9;
			}
		}
		this.aClass_ra_Sub2_1772.method4970(1);
		this.aClass_ra_Sub2_1772.method4889(0);
		this.aClass_ra_Sub2_1772.method4787(false);
	}

	public void method2061() {
		if (this.aClass76_Sub2_1763 != null) {
			this.aClass76_Sub2_1763.method179();
			this.aClass76_Sub2_1763 = null;
		}
		if (this.anInterface8_Impl1_Impl2_1771 != null) {
			this.anInterface8_Impl1_Impl2_1771.method53();
			this.anInterface8_Impl1_Impl2_1771 = null;
		}
		if (this.anInterface8_Impl1_Impl1_1773 != null) {
			this.anInterface8_Impl1_Impl1_1773.method53();
			this.anInterface8_Impl1_Impl1_1773 = null;
		}
		this.aClass76_Sub2_1762.method179();
		this.anInterface8_Impl1_Impl2_1768.method53();
		this.anInterface8_Impl1_Impl2_1765.method53();
		this.anInterface8_Impl1_Impl2_1770.method53();
		this.anInterface11_Impl3_Impl1_1764.method53();
		this.anInterface11_Impl3_Impl1_1776.method53();
		this.anInterface11_Impl3_Impl1_1767.method53();
		this.anInterface8_Impl1_Impl1_1782.method53();
		int var1 = this.aVector1778.size();
		for (int var2 = 0; var2 < var1; var2++) {
			Class192 var3 = (Class192) this.aVector1778.elementAt(var2);
			var3.method2101();
		}
	}

	public boolean method2062(Class192 arg0) {
		return this.method2056(this.aVector1778.size(), arg0);
	}
}
