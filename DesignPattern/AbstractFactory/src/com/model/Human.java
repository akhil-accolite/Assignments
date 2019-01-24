package com.model;

public abstract class Human {

	
	/////abstract class///
	public abstract String getHair();
	public abstract String getHeight();
	public abstract String getStrength();
	
	@Override
	public String toString() {
	
		return "[Hair: "+this.getHair()+" Height: "+this.getHeight()+" Strength: "+this.getStrength()+"]";
	}
}
