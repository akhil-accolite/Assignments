package com.abstractFactory;

import com.model.Human;
import com.model.Male;

public class MaleFactory implements HumanAbstractFactory {

	private String hair;
	private String height;
	private String strength;

	public MaleFactory(String hair, String height, String strength) {
		this.hair = hair;
		this.height = height;
		this.strength = strength;
	}

	@Override
	public Human recognizeHuman() {

		return new Male(hair, height, strength);

	}
}
