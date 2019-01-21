package Manage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class standExec implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (Taxi t1 : stand.tstand) {
			t1.setTimer(3);
			if (t1.getPassengerNo() == 4 || t1.getTimer() == 10) {
				System.out.println("taxi number {" + t1.getNumber()
						+ "} filled with 4 passengers and leaving for location {" + t1.getLocation() + "}");
				taxiQ.getTq().remove(t1);
				stand.standMax--;
			}
		}
	}
}

public class stand {

	static int standMax = 0;

	public static List<Taxi> tstand = new ArrayList<Taxi>();

	stand() {

	}

	public static void main(String[] args) {

		System.out.println("Press something and hit Enter to start the simulation: ");
		Scanner sc = new Scanner(System.in);
		sc.next();

		generatePerson gp = new generatePerson();
		generateTaxi gt = new generateTaxi();
		personQ qp = new personQ();
		taxiQ qt = new taxiQ();
		standExec sx = new standExec();

		Thread tgp = new Thread(gp);
		Thread tgt = new Thread(gt);
		Thread tqp = new Thread(qp);
		Thread tqt = new Thread(qt);
		Thread sxt = new Thread(sx);

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

		executor.scheduleAtFixedRate(tgp, 0, 3, TimeUnit.SECONDS);
		executor.scheduleAtFixedRate(tgt, 0, 10, TimeUnit.SECONDS);
		executor.scheduleAtFixedRate(tqp, 0, 3, TimeUnit.SECONDS);
		executor.scheduleAtFixedRate(tqt, 0, 3, TimeUnit.SECONDS);
		executor.scheduleAtFixedRate(sxt, 0, 3, TimeUnit.SECONDS);

		sc.close();
	}
}