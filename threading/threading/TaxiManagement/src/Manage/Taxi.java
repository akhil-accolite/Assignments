package Manage;

class Taxi {

	private int tNumber;
	private int tLocation = 0;
	private int passengerNo = 0;
	private int timerCount = 0;

	public Taxi(int tNumber, int tLocation) {
		this.tNumber = tNumber;
		this.tLocation = tLocation;
	}

	public int getNumber() {
		return tNumber;
	}

	public int getLocation() {
		return tLocation;
	}

	public void updateLocation(int tqn) {
		this.tLocation = tqn;
	}

	public int getPassengerNo() {
		return passengerNo;
	}

	public void updatePassengerNo(int pn) {
		this.passengerNo += pn;
	}
	
	public int getTimer() {
		return timerCount;
	}
	
	public void setTimer(int count) {
	 this.timerCount += count;
	}
}
