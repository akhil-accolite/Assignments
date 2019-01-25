package com.testPattern;

import com.abstractFactory.FemaleFactory;
import com.abstractFactory.HumanFactory;
import com.abstractFactory.MaleFactory;
import com.model.Human;


///////tester class//////
public class testPattern {

	private static void testAbstractFactory() {

		Human male = HumanFactory.recognizeHuman(new MaleFactory("short", "long", "more"));
		Human female = HumanFactory.recognizeHuman(new FemaleFactory("long", "short", "less"));

		System.out.println("recognized male: " + male.toString());
		System.out.println("recognized female: " + female.toString());
	}

	public static void main(String[] args) {
		testAbstractFactory();
	}
}
