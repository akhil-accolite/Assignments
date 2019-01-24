package com.model;

public class Female extends Human {

	////////////model class female//////////
	private String hair;
	private String height;
	private String Strength;

	public Female(String hair, String height, String strength) {
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
