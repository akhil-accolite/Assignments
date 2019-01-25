package com.model.observer;

import java.util.ArrayList;
import java.util.List;

public class BodyParts implements Brain {

	private List<ObserverNeuron> observerNeuron;
	private String message;
	private boolean isChanged;
	private final Object mutex = new Object();

	public BodyParts() {
		this.observerNeuron = new ArrayList<>();
	}

	@Override
	public void register(ObserverNeuron obj) {
		if (obj == null)
			throw new NullPointerException("Neuron not reaching body parts");
		synchronized (mutex) {
			if (!observerNeuron.contains(obj))
				observerNeuron.add(obj);
		}
	}

	@Override
	public void unregister(ObserverNeuron obj) {
		synchronized (mutex) {
			observerNeuron.remove(obj);
		}
	}

	@Override
	public void notifyObservers() {
		List<ObserverNeuron> observersLocal = null;

		synchronized (mutex) {
			if (!isChanged)
				return;
			observersLocal = new ArrayList<>(this.observerNeuron);
			this.isChanged = false;
		}
		for (ObserverNeuron obj : observersLocal) {
			obj.update();
		}

	}

	@Override
	public Object getUpdate(ObserverNeuron obj) {
		return this.message;
	}

	public void postMessage(String msg) {
		System.out.println("Message from brain goes BodyParts:" + msg);
		this.message = msg;
		this.isChanged = true;
		notifyObservers();
	}

}