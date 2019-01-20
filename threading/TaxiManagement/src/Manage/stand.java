package Manage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

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
		
		Thread tgp = new Thread(gp);
		Thread tgt = new Thread(gt);
		Thread tqp = new Thread(qp);
		Thread tqt = new Thread(qt);

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

		executor.scheduleAtFixedRate(tgp, 0, 3, TimeUnit.SECONDS);
		executor.scheduleAtFixedRate(tgt, 0, 10, TimeUnit.SECONDS);
		executor.scheduleAtFixedRate(tqp, 0, 3, TimeUnit.SECONDS);
		executor.scheduleAtFixedRate(tqt, 0, 3, TimeUnit.SECONDS);

		sc.close();
	}
}
