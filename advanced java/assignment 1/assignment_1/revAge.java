import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class listTest {
	public static void main(String[] args) {

		List<Person> al = new ArrayList<Person>();

		Person p1 = new Person("akhil", "chouhan", 21);
		Person p2 = new Person("khil", "chouhan", 22);
		Person p3 = new Person("a", "chouhan", 23);
		Person p4 = new Person("akh", "chouhan", 24);

		al.add(p3);
		al.add(p4);
		al.add(p1);
		al.add(p2);

		Collections.sort(al);

		for(Person p : al){
			System.out.println(p.getAge()+" "+p.getFirstName()+" "+p.getLastName());
		}

	}
}

class Person implements Comparable<Person> {
	private String firstName;
	private String lastName;
	private int age;

	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String str) {
		this.firstName = str;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String str) {
		this.lastName = str;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int i) {
		this.age = i;
	}

	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		return this.firstName.equals(p.getFirstName());
	}

	@Override
	public int hashCode() {
		return this.firstName.hashCode();
	}

	@Override
    public int compareTo(Person o) {
        if(this.age == o.getAge()){
			return 0;
		}
		else if(this.age>o.getAge()){
			return -1;
		}
		else
			return 1;
	}

	@Override
	public String toString() {
		return this.firstName + " " + this.lastName + " " + this.age;
	}
}