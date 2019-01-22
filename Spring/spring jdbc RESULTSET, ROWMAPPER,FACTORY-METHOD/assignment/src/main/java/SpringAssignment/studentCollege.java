package SpringAssignment;

public class studentCollege {

	public static Student college(String col) {
		
		Student s = new Student();
		
		if(col.equals("pesu")) {
			s.setCollege("PESU");
		}
		
		if(col.equals("pesit")){
			s.setCollege("PESIT");
		}
		
		return s;
	}
}
