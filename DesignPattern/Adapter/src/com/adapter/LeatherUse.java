package com.adapter;

public class LeatherUse {

	private String useOfLeather;

	public LeatherUse() {
	}

	public LeatherUse(String useOfLeather) {
		this.useOfLeather = useOfLeather;
	}

	public String getUseOfLeather() {
		return useOfLeather;
	}

	public void setUseOfLeather(String useOfLeather) {
		this.useOfLeather = useOfLeather;
	}
	
	@Override
	public String toString() {
		
		return useOfLeather;
	}

}
