package com.model.observer;

public class Testobserver {

	public static void main(String[] args) {
		// create subject Brain
		BodyParts bp = new BodyParts();

		// create observers
		ObserverNeuron obj1 = new SpinalChord("neuron hands: ");
		ObserverNeuron obj2 = new SpinalChord("neuron legs: ");
		ObserverNeuron obj3 = new SpinalChord("neuron body: ");

		// register observers to the subject
		bp.register(obj1);
		bp.register(obj2);
		bp.register(obj3);

		// attach observer to subject
		obj1.setBrain(bp);
		obj2.setBrain(bp);
		obj3.setBrain(bp);

		// check if any update is available
		obj3.update();

		// now send message to subject
		bp.postMessage("\n\nNew message to body parts: wake up body part");
	}

}