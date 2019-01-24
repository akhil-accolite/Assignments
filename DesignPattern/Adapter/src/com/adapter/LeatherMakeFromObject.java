package com.adapter;

public class LeatherMakeFromObject implements OtherLeatherUse {

	private commonLeatherUse use = new commonLeatherUse();

	private static LeatherUse makeUseOf(int x) {

		if (x == 1) {
			LeatherUse l = new LeatherUse();
			l.setUseOfLeather("make wallet");
			return l;
		} else {
			LeatherUse l = new LeatherUse();
			l.setUseOfLeather("make belt");
			return l;
		}
	}

	@Override
	public LeatherUse makeShoes() {
		return use.getLeatherUse();
	}

	@Override
	public LeatherUse makeBelt() {

		return LeatherMakeFromObject.makeUseOf(0);
	}

	@Override
	public LeatherUse makeWallet() {

		return LeatherMakeFromObject.makeUseOf(1);
	}

}
