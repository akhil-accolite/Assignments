package com.model.observer;

public interface Brain {

	public void register(ObserverNeuron obj);

	public void unregister(ObserverNeuron obj);

	public void notifyObservers();

	public Object getUpdate(ObserverNeuron obj);
}