package com.model;

public class Male extends Human {

////////////model class male//////////
	private String hair;
	private String height;
	private String Strength;

	public Male(String hair, String height, String strength) {
		this.hair = hair;
		this.height = height;
		this.Strength = strength;
	}

	@Override
	public String getHair() {
		return hair;
	}

	@Override
	public String getHeight() {
		return height;
	}

	@Override
	public String getStrength() {
		return Strength;
	}

}
