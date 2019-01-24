package com.abstractFactory;

import com.model.Human;

public class HumanFactory {
	
	public static Human recognizeHuman(HumanAbstractFactory factory) {
		
		return factory.recognizeHuman();
	}
}
