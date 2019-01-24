package com.adapter;

public class LeatherMakeFromClass extends commonLeatherUse implements OtherLeatherUse {

	
	private LeatherUse makeUseOf(int x) {
		
		if(x==1) {
			return new LeatherUse("make wallet");
		}
		else {
			return new LeatherUse("make belt");
		}
	}
	@Override
	public LeatherUse makeShoes() {
	
		return getLeatherUse();
	}

	@Override
	public LeatherUse makeBelt() {

		return makeUseOf(0);
	}

	@Override
	public LeatherUse makeWallet() {

		return makeUseOf(1);
	}

}
