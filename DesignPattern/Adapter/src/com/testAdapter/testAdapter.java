package com.testAdapter;

import com.adapter.LeatherMakeFromClass;
import com.adapter.LeatherMakeFromObject;
import com.adapter.LeatherUse;
import com.adapter.OtherLeatherUse;

public class testAdapter {

	public static void main(String[] args) {

		testClassAdapter();
		testObjectAdapter();
	}

	private static void testObjectAdapter() {
		OtherLeatherUse l = new LeatherMakeFromObject();
		LeatherUse ls = makeUse(l, 1);
		LeatherUse lb = makeUse(l, 2);
		LeatherUse lw = makeUse(l, 3);

		System.out.println("using Object Adapter=" + ls);
		System.out.println("using Object Adapter=" + lb);
		System.out.println("using Object Adapter=" + lw);
	}

	private static void testClassAdapter() {
		OtherLeatherUse l = new LeatherMakeFromClass();
		LeatherUse ls = makeUse(l, 1);
		LeatherUse lb = makeUse(l, 2);
		LeatherUse lw = makeUse(l, 3);

		System.out.println("using Class Adapter=" + ls.getUseOfLeather().toString());
		System.out.println("using Class Adapter=" + lb.getUseOfLeather().toString());
		System.out.println("using Class Adapter=" + lw.getUseOfLeather().toString());

	}

	private static LeatherUse makeUse(OtherLeatherUse o, int i) {
		switch (i) {
		case 1:
			return o.makeShoes();
		case 2:
			return o.makeBelt();
		case 3:
			return o.makeWallet();
		default:
			return o.makeShoes();
		}
	}
}
