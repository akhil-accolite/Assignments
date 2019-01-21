package Manage;

import java.util.Random;

public class generatePerson implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		Random r = new Random();
		String randomName = "QWERTY";

		Person p = new Person(randomName.charAt(r.nextInt(randomName.length())), r.nextInt(5));

		/////////////////////////////////////////* uncomment below lines to not directly send person to person queue*//////////////////////////////////////
		
//		for (Taxi t : stand.tstand) {
//			if (p.getpLocation() == t.getLocation()) {
//				t.updatePassengerNo(1);
//				System.out.println("generated passenger found taxi at stand");
//			} else {
//				System.out.println(
//						"generated passenger couldn't find taxi with same location so added to Passenger Queue");
//				new personQ(p);
//			}
//		}

		System.out.println("********************************************************************************");
		System.out.println("random person generated with name {" + p.getpName() + "}" + " and location {"
				+ p.getpLocation() + "}");
		System.out.println("********************************************************************************");

		new personQ(p);
	}
	
}