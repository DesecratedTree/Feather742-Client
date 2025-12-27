package deob;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Class350_Sub1 extends Class350 implements MouseListener, MouseMotionListener, MouseWheelListener {

	public static int anInt7964 = 2;

	public static int anInt7965 = 4;

	public static int anInt7967 = 1;

	public Class471 aClass471_7970 = new Class471();

	public Class471 aClass471_7966 = new Class471();

	public boolean aBoolean7975;

	public int anInt7963;

	public int anInt7968;

	public int anInt7969;

	public int anInt7971;

	public int anInt7972;

	public int anInt7973;

	public Component aComponent7974;

	public Class350_Sub1(Component arg0, boolean arg1) {
		this.method4066(arg0, 2127022450);
		this.aBoolean7975 = arg1;
	}

	public int method4031(short arg0) {
		try {
			return this.anInt7973;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aes.w(" + ')');
		}
	}

	public boolean method4027(int arg0) {
		try {
			return (this.anInt7968 & 0x1) != 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aes.p(" + ')');
		}
	}

	public void method4062(int arg0) {
		try {
			if (this.aComponent7974 != null) {
				this.aComponent7974.removeMouseWheelListener(this);
				this.aComponent7974.removeMouseMotionListener(this);
				this.aComponent7974.removeMouseListener(this);
				this.aComponent7974 = null;
				this.anInt7968 = 0;
				this.anInt7973 = 0;
				this.anInt7969 = 0;
				this.anInt7972 = 0;
				this.anInt7971 = 0;
				this.anInt7963 = 0;
				this.aClass471_7970 = null;
				this.aClass471_7966 = null;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aes.ak(" + ')');
		}
	}

	public synchronized void method4035() {
		this.anInt7969 = this.anInt7963 * -980891725 * 1518341525 * 1886663887;
		this.anInt7973 = this.anInt7971 * -1703741239 * 2015278581 * -443037963;
		this.anInt7968 = this.anInt7972 * -313456467 * -427392961 * 1825885083;
		Class471 var1 = this.aClass471_7970;
		this.aClass471_7970 = this.aClass471_7966;
		this.aClass471_7966 = var1;
		this.aClass471_7966.method5866(613065745);
	}

	public void method4063(int arg0, int arg1, int arg2) {
		try {
			this.anInt7963 = arg0;
			this.anInt7971 = arg1;
			if (this.aBoolean7975) {
				this.method4065(-1, arg0, arg1, 0, -1666334633);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aes.az(" + ')');
		}
	}

	public Class330_Sub44 method4032(byte arg0) {
		try {
			return (Class330_Sub44) this.aClass471_7970.method5867((short) 8960);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aes.n(" + ')');
		}
	}

	public synchronized void mousePressed(MouseEvent arg0) {
		try {
			int var2 = this.method4064(arg0, -1245575629);
			if (var2 == 1) {
				this.method4065(0, arg0.getX(), arg0.getY(), arg0.getClickCount(), -1666334633);
			} else if (var2 == 4) {
				this.method4065(2, arg0.getX(), arg0.getY(), arg0.getClickCount(), -1666334633);
			} else if (var2 == 2) {
				this.method4065(1, arg0.getX(), arg0.getY(), arg0.getClickCount(), -1666334633);
			}
			this.anInt7972 |= var2;
			if (arg0.isPopupTrigger()) {
				arg0.consume();
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aes.mousePressed(" + ')');
		}
	}

	public boolean method4029(byte arg0) {
		try {
			return (this.anInt7968 & 0x4) != 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aes.s(" + ')');
		}
	}

	public int method4030(int arg0) {
		try {
			return this.anInt7969;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aes.z(" + ')');
		}
	}

	public int method4050() {
		return this.anInt7969 * -1304407505 * 1886663887;
	}

	public void method4033(byte arg0) {
		try {
			this.method4062(-1989131877);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aes.l(" + ')');
		}
	}

	public synchronized void mouseEntered(MouseEvent arg0) {
		try {
			this.method4063(arg0.getX(), arg0.getY(), -2103942339);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aes.mouseEntered(" + ')');
		}
	}

	public synchronized void mouseExited(MouseEvent arg0) {
		try {
			this.method4063(arg0.getX(), arg0.getY(), 947921424);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aes.mouseExited(" + ')');
		}
	}

	public int method4064(MouseEvent arg0, int arg1) {
		try {
			if (arg0.getButton() == 1) {
				return arg0.isMetaDown() ? 4 : 1;
			} else if (arg0.getButton() == 2) {
				return 2;
			} else if (arg0.getButton() == 3) {
				return 4;
			} else {
				return 0;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aes.ah(" + ')');
		}
	}

	public boolean method4049(int arg0) {
		try {
			return (this.anInt7968 & 0x2) != 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aes.o(" + ')');
		}
	}

	public synchronized void mouseReleased(MouseEvent arg0) {
		try {
			int var2 = this.method4064(arg0, 1737727189);
			if ((this.anInt7972 & var2) == 0) {
				var2 = this.anInt7972;
			}
			if ((var2 & 0x1) != 0) {
				this.method4065(3, arg0.getX(), arg0.getY(), arg0.getClickCount(), -1666334633);
			}
			if ((var2 & 0x4) != 0) {
				this.method4065(5, arg0.getX(), arg0.getY(), arg0.getClickCount(), -1666334633);
			}
			if ((var2 & 0x2) != 0) {
				this.method4065(4, arg0.getX(), arg0.getY(), arg0.getClickCount(), -1666334633);
			}
			this.anInt7972 &= ~var2;
			if (arg0.isPopupTrigger()) {
				arg0.consume();
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aes.mouseReleased(" + ')');
		}
	}

	public synchronized void mouseDragged(MouseEvent arg0) {
		try {
			this.method4063(arg0.getX(), arg0.getY(), 2030071356);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aes.mouseDragged(" + ')');
		}
	}

	public synchronized void mouseMoved(MouseEvent arg0) {
		try {
			this.method4063(arg0.getX(), arg0.getY(), -222994134);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aes.mouseMoved(" + ')');
		}
	}

	public boolean method4034() {
		return (this.anInt7968 * -472538477 * 1825885083 & 0x1) != 0;
	}

	public synchronized void method4039(byte arg0) {
		try {
			this.anInt7969 = this.anInt7963;
			this.anInt7973 = this.anInt7971;
			this.anInt7968 = this.anInt7972;
			Class471 var2 = this.aClass471_7970;
			this.aClass471_7970 = this.aClass471_7966;
			this.aClass471_7966 = var2;
			this.aClass471_7966.method5866(613065745);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aes.i(" + ')');
		}
	}

	public synchronized void method4053() {
		this.anInt7969 = this.anInt7963 * -980891725 * 1518341525 * 1886663887;
		this.anInt7973 = this.anInt7971 * -1703741239 * 2015278581 * -443037963;
		this.anInt7968 = this.anInt7972 * -313456467 * -427392961 * 1825885083;
		Class471 var1 = this.aClass471_7970;
		this.aClass471_7970 = this.aClass471_7966;
		this.aClass471_7966 = var1;
		this.aClass471_7966.method5866(613065745);
	}

	public synchronized void method4037() {
		this.anInt7969 = this.anInt7963 * -980891725 * 1518341525 * 1886663887;
		this.anInt7973 = this.anInt7971 * -1703741239 * 2015278581 * -443037963;
		this.anInt7968 = this.anInt7972 * -313456467 * -427392961 * 1825885083;
		Class471 var1 = this.aClass471_7970;
		this.aClass471_7970 = this.aClass471_7966;
		this.aClass471_7966 = var1;
		this.aClass471_7966.method5866(613065745);
	}

	public synchronized void method4038() {
		this.anInt7969 = this.anInt7963 * -980891725 * 1518341525 * 1886663887;
		this.anInt7973 = this.anInt7971 * -1703741239 * 2015278581 * -443037963;
		this.anInt7968 = this.anInt7972 * -313456467 * -427392961 * 1825885083;
		Class471 var1 = this.aClass471_7970;
		this.aClass471_7970 = this.aClass471_7966;
		this.aClass471_7966 = var1;
		this.aClass471_7966.method5866(613065745);
	}

	public boolean method4048() {
		return (this.anInt7968 * -472538477 * 1825885083 & 0x1) != 0;
	}

	public boolean method4040() {
		return (this.anInt7968 * -472538477 * 1825885083 & 0x1) != 0;
	}

	public boolean method4041() {
		return (this.anInt7968 * -472538477 * 1825885083 & 0x1) != 0;
	}

	public boolean method4036() {
		return (this.anInt7968 * -472538477 * 1825885083 & 0x1) != 0;
	}

	public boolean method4044() {
		return (this.anInt7968 * -472538477 * 1825885083 & 0x1) != 0;
	}

	public boolean method4046() {
		return (this.anInt7968 * -472538477 * 1825885083 & 0x2) != 0;
	}

	public boolean method4047() {
		return (this.anInt7968 * -472538477 * 1825885083 & 0x2) != 0;
	}

	public boolean method4043() {
		return (this.anInt7968 * 1825885083 * -472538477 & 0x4) != 0;
	}

	public int method4042() {
		return this.anInt7969 * -1304407505 * 1886663887;
	}

	public Class330_Sub44 method4052() {
		return (Class330_Sub44) this.aClass471_7970.method5867((short) 8960);
	}

	public Class330_Sub44 method4028() {
		return (Class330_Sub44) this.aClass471_7970.method5867((short) 8960);
	}

	public void method4051() {
		this.method4062(-695949486);
	}

	public void method4065(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			Class330_Sub44_Sub2 var6 = Class432_Sub1_Sub4_Sub2.method5544(arg0, arg1, arg2, Class312.method3111((byte) 85), arg3, -588167741);
			this.aClass471_7966.method5878(var6, (short) 8192);
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "aes.ag(" + ')');
		}
	}

	public void method4056() {
		this.method4062(-304039060);
	}

	public void method4057() {
		this.method4062(-660577300);
	}

	public synchronized void mouseClicked(MouseEvent arg0) {
		try {
			if (arg0.isPopupTrigger()) {
				arg0.consume();
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aes.mouseClicked(" + ')');
		}
	}

	public void method4055() {
		this.method4062(-311964972);
	}

	public void method4066(Component arg0, int arg1) {
		try {
			this.method4062(-805395816);
			this.aComponent7974 = arg0;
			this.aComponent7974.addMouseListener(this);
			this.aComponent7974.addMouseMotionListener(this);
			this.aComponent7974.addMouseWheelListener(this);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aes.ab(" + ')');
		}
	}

	public boolean method4045() {
		return (this.anInt7968 * -472538477 * 1825885083 & 0x2) != 0;
	}

	public int method4058() {
		return this.anInt7973 * -443037963 * 2038183261;
	}

	public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
		try {
			int var2 = arg0.getX();
			int var3 = arg0.getY();
			int var4 = arg0.getWheelRotation();
			this.method4065(6, var2, var3, var4, -1666334633);
			arg0.consume();
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aes.mouseWheelMoved(" + ')');
		}
	}

	public static final void method4067(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub7_7891.method5759((byte) -7) ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aes.aqx(" + ')');
		}
	}
}
