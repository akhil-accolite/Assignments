package com.SOAPcrud;
import java.util.List;

public class implement {
	
	///////////////////////////////////CREATE
	public String create(String name,String id,int age) {
		
		crud.create(name,id,age);
		return "person added";
	}
	///////////////////////////////////READ
	public String read(){
		
		List<Person> ll = crud.getAll();
		
		return ll.toString();		
	}
	////////////////////////////////////UPDATE
	public String update(String name,String id,int age) {
		
		crud.update(name,id,age);
		return "person updated";
	}
	////////////////////////////////////DELETE
	
	public String delete(String id) {
		
		return crud.dele(id);
		
	}
}
