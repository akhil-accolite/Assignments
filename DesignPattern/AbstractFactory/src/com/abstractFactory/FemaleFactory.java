package com.abstractFactory;

import com.model.Human;
import com.model.Female;

public class FemaleFactory implements HumanAbstractFactory {

	private String hair;
	private String height;
	private String strength;

	public FemaleFactory(String hair, String height, String strength) {
		this.hair = hair;
		this.height = height;
		this.strength = strength;
	}

	@Override
	public Human recognizeHuman() {

		return new Female(hair, height, strength);

	}
}
