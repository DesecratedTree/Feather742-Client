package deob;

import java.awt.Font;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Class338 {

	public List aList3373 = new LinkedList();

	public boolean aBoolean3370 = false;

	public int anInt3371 = 0;

	public int anInt3372 = 0;

	public static Font aFont3374;

	public Class338(boolean arg0) {
		this.aBoolean3370 = arg0;
	}

	public void method3958(Class353 arg0, byte arg1) {
		try {
			Class432_Sub1 var3 = arg0.aClass432_Sub1_3489;
			boolean var4 = true;
			Class80[] var5 = arg0.aClass432_Sub1_3489.aClass80Array8656;
			for (int var6 = 0; var6 < var5.length; var6++) {
				if (var5[var6].aBoolean671) {
					var4 = false;
					break;
				}
			}
			if (!var4) {
				arg0.aClass338_3490 = this;
				Class353 var7;
				if (this.aBoolean3370) {
					Iterator var9 = this.aList3373.iterator();
					while (var9.hasNext()) {
						var7 = (Class353) var9.next();
						if (var7.aClass432_Sub1_3489 == var3) {
							var9.remove();
							Class227.method2312(var7, 1460238150);
						}
					}
				}
				ListIterator var10 = this.aList3373.listIterator();
				while (var10.hasNext()) {
					var7 = (Class353) var10.next();
					if (var3.anInt8657 >= var7.aClass432_Sub1_3489.anInt8657) {
						var10.previous();
						var10.add(arg0);
						return;
					}
				}
				this.aList3373.add(arg0);
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "oc.j(" + ')');
		}
	}

	public void method3959(byte arg0) {
		try {
			Iterator var2 = this.aList3373.iterator();
			while (var2.hasNext()) {
				Class353 var3 = (Class353) var2.next();
				var2.remove();
				Class227.method2312(var3, -1005874397);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "oc.r(" + ')');
		}
	}

	public static void method3960(boolean arg0, Class330_Sub40_Sub2 arg1, byte arg2) {
		try {
			Class95_Sub11.aClass296_7171.method2935(arg1);
			if (arg0) {
				Class546.method6354(Class67.aClass280_581, Class145_Sub1.aClass280_7265, Class428.aClass280_4362, arg1, Class95_Sub11.aClass296_7171, 560802067);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "oc.p(" + ')');
		}
	}
}
