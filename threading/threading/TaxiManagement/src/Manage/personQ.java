package Manage;

import java.util.ArrayList;
import java.util.List;

public class personQ implements Runnable {

	private static List<Person> pq = new ArrayList<Person>();

	public personQ(Person p) {
		pq.add(p);
	}

	public personQ() {
	}

	public static List<Person> getPq() {
		return pq;
	}

	public void setPq(List<Person> pq) {
		personQ.pq = pq;
	}

	public static int readTopPerson() {

		return pq.get(0).getpLocation();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("persons from queue checks the taxi in taxi stand");
		
		for (Person p : pq) {
			for(Taxi t:stand.tstand) {
				
				System.out.println("//////////////////////////");
				System.out.println(t.getLocation());
				System.out.println(p.getpLocation());
				System.out.println("//////////////////////////");
				
				if(p.getpLocation()==t.getLocation()) {
					System.out.println("passenger "+p.getpName()+" alloted taxi number "+t.getNumber());
					t.updatePassengerNo(1);
					//pq.remove(p);
					System.out.println("taxi with taxi number {"+t.getNumber()+"} has "+t.getPassengerNo()+" passengers now");
				}
				else {
					System.out.println("No person has taxi going to their location now");
				}
			}
		}
	}
}
