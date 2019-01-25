package com.model.observer;

public class SpinalChord implements ObserverNeuron {

	private String name;
	private Brain brain;

	public SpinalChord(String nm) {
		this.name = nm;
	}

	@Override
	public void update() {
		String msg = (String) brain.getUpdate(this);
		if (msg == null) {
			System.out.println(name + " BODY SLEEPING NO MESSAGE");
		} else
			System.out.println(name + "BODY WAKE UP ASSIGNED SOME FUNCTION" + msg);
	}

	@Override
	public void setBrain(Brain sub) {
		this.brain = sub;
	}

}