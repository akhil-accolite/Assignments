package Manage;

import java.util.ArrayList;
import java.util.List;

public class taxiQ implements Runnable {

	private static List<Taxi> tq = new ArrayList<Taxi>();

	public taxiQ(Taxi t) {
		tq.add(t);
	}

	public taxiQ() {

	}

	public static List<Taxi> getTq() {
		return tq;
	}

	public void setTq(List<Taxi> tq) {
		taxiQ.tq = tq;
	}

	public Taxi TaxiPop() {
		return tq.remove(0);
	}

	public static void addTaxi(Taxi t) {

		tq.add(t);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("taxi queue checks if taxi stand is empty");

		if (stand.standMax < 10) {
			if (!tq.isEmpty()) {
				Taxi tInStand = tq.remove(0);
				tInStand.updateLocation(personQ.readTopPerson());
				stand.tstand.add(tInStand);
				System.out.println(
						"taxi from taxi queue goes into taxi stand with location {" + tInStand.getLocation() + "}");
				stand.standMax++;
			}
			
		}

		for(Taxi t1:stand.tstand) {
//			t1.setTimer(3);
			if(t1.getPassengerNo()==4) {
				System.out.println("taxi number {"+t1.getNumber()+"} filled with 4 passengers or TIMER EXCEEDED leaving for location {"+t1.getLocation()+"}");
				tq.remove(t1);
				stand.standMax--;
			}
		}
	}
}