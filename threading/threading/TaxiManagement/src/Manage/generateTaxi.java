package Manage;

import java.util.Random;

public class generateTaxi implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		Random r = new Random();

		Taxi t = new Taxi(r.nextInt(10) + 10, 0);
		taxiQ.addTaxi(t);
		t.setTimer(1);
		System.out.println("********************************************************************************");
		System.out.println("taxi generated with taxi number {" + t.getNumber() + "}");
		System.out.println("********************************************************************************");
	}

}