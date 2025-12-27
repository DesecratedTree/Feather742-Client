package deob;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.net.URL;
import java.util.Properties;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ClientLoader extends JApplet {

	public static boolean isRS = false;

	public static boolean rsaDisabled = false;

	public static boolean isaacDisabled = true;

	public static int PORT = 43594;

	public static boolean LOBBY_ENABLED = false;

	public static ClientLoader instance = new ClientLoader();

	public static final int SUB_VERSION = 3;

	public static int i2;

	public static final long serialVersionUID = -3815183950296997504L;

	public Properties params;

	public static final boolean DISABLE_USELESS_PACKETS = false;

	@ObfuscatedName("LoaderLocal.IP")
	public static String IP = "127.0.0.1";

	public static void main(String[] arg0) {
		instance.doFrame();
	}

	public static ClientLoader getInstance() {
		return instance;
	}

	public void init() {
		this.setParams();
        this.startClient();
	}

	public void doFrame() {
		this.setParams();
		this.openFrame();
        this.startClient();
	}

	public void openFrame() {
		JFrame var1 = new JFrame("Elveron 742");
		var1.setLayout(new BorderLayout());
		JPanel var2 = new JPanel();
		var2.setLayout(new BorderLayout());
		var2.add(this);
		var2.setPreferredSize(new Dimension(800, 554));
		var1.getContentPane().add(var2, "Center");
		var1.setDefaultCloseOperation(3);
		var1.setSize(800, 554);
		var1.setLocationRelativeTo(null);
		var1.pack();
		var1.setVisible(true);
	}

	public void startClient() {
		client var1 = new client();
		var1.supplyApplet(this);
		var1.init();
		var1.start();
	}

	public void setParams() {
		this.params = new Properties();
		this.params.put("separate_jvm", "true");
		this.params.put("image", "http://www.runescape.com/img/game/splash2.gif");
		this.params.put("centerimage", "true");
		this.params.put("boxborder", "false");
		this.params.put("java_arguments", "-Xmx256m-Xss2m-Dsun.java2d.noddraw=true-XX:CompileThreshold=1500-Xincgc-XX:+UseConcMarkSweepGC-XX:+UseParNewGC");
		this.params.put("boxbgcolor", "black");
		this.params.put("5", "true,false,0,43,200,18,0,21,354,-15,Verdana,11,0xF4ECE9,candy_bar_middle.gif,candy_bar_back.gif,candy_bar_outline_left.gif,candy_bar_outline_right.gif,candy_bar_outline_top.gif,candy_bar_outline_bottom.gif,loadbar_body_left.gif,loadbar_body_right.gif,loadbar_body_fill.gif,6");
		this.params.put("11", "0");
		this.params.put("34", "225");
		this.params.put("30", "MpanIDx68ZShS/0wQc60lSvsuExhgYKEW");
		this.params.put("9", "false");
		this.params.put("32", "7E38D137C0C97EAC1B89C07E1823D93B92621D5FF287F27135B71ECF61D4B07BDF4D957CA0C90F16707EE156B23C4365");
		this.params.put("25", "false");
		this.params.put("0", "gBY1FFD2PtHXiWDimCyWmg");
		this.params.put("12", "false");
		this.params.put("21", "true");
		this.params.put("28", "t6VmPGef1q2SfGVu5*Boi1FauurdIIXIIXzRjGVy4Yo");
		this.params.put("7", "0");
		this.params.put("35", "0");
		this.params.put("24", "");
		this.params.put("-1", "7KYq*VzZDycfkn7KXq98Xg");
		this.params.put("23", "");
		this.params.put("1", "410601069");
		this.params.put("13", "0");
		this.params.put("29", "");
		this.params.put("18", "1");
		this.params.put("6", "28348");
		this.params.put("26", "true");
		this.params.put("10", isRS ? "lobby8.runescape.com" : IP);
		this.params.put("4", "");
		this.params.put("33", "0");
		this.params.put("3", ".runescape.com");
		this.params.put("16", "0");
		this.params.put("15", "false");
		this.params.put("8", "1107");
		this.params.put("14", "false");
		this.params.put("20", "0");
		this.params.put("27", "false");
		this.params.put("2", "");
		this.params.put("haveie6", "false");
	}

	public String getParameter(String arg0) {
		return (String) this.params.get(arg0);
	}

	public URL getDocumentBase() {
		return this.getCodeBase();
	}

	public URL getCodeBase() {
		try {
			return isRS ? new URL("http://world1.runescape.com") : new URL("http://" + IP);
		} catch (Exception var2) {
			var2.printStackTrace();
			return null;
		}
	}
}
