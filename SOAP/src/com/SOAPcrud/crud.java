package com.SOAPcrud;

import java.util.ArrayList;
import java.util.List;

public class crud {
public crud(){
		
	}
	
	static List<Person> l = new ArrayList<Person>();
	
	public static void create(String name,String id,int age) {		
		l.add(new Person(name,id,age));
	}
	
	public static List<Person> getAll(){
		
		return l;	
	}
	
	public static void update(String name,String id,int age) {
		
		for(Person pf:l) {
			if(pf.getId()==id) {
				l.remove(pf);
				pf.setId(id);
				pf.setName(name);
				pf.setAge(age);
				l.add(pf);
			}
		}
	}
		
	public static String dele(String id) {
		for(Person p:l) {
			if(p.getId().equals(id)) {
				l.remove(p);
				System.out.println("in if");
				return "deleted";
				
			}
		}
		return "null";
	}
}