import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import sun.reflect.generics.tree.Tree;

class ListTest{
    public static void main(String[] args) {
        List<Person> pl = new LinkedList<>();

        List<Integer> inte = new LinkedList<>();

        inte.add(1);
        inte.add(2);
        
        System.out.println(inte.contains(1));
    }
}

class treeTest {

    public static void main(String[] args) {
        TreeSet<Person> ptt = new TreeSet<>(new Comparator<Person>() {
            
            @Override
            public int compare(Person p1,Person p2) {
                return p1.getFirstName().compareTo(p2.getFirstName());
            }
        });

        TreeSet<Person> pts = new TreeSet<>((p1,p2) -> p2.getFirstName().compareTo(p1.getFirstName()));

        ptt.add(new Person("akhil","chouhan",21));
        ptt.add(new Person("akh","chan",21));
        ptt.add(new Person("khil","han",21));

        pts.add(new Person("akhil","chouhan",21));
        pts.add(new Person("akh","chan",21));
        pts.add(new Person("khil","han",21));

        for(Person p : ptt){
            System.out.println(p.getFirstName());
        }

        for(Person p : pts){
            System.out.println(p.getFirstName());
        }
    }
}

class MapTest {

    public static void main(String[] args) {
        HashMap<Integer,Character> map = new HashMap<>();
        for (char c='a';c<='z';c++){
            map.put((int)c, c);
        }

        for(Character c : map.values()){
            System.out.println(c);
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
        return this.firstName.compareTo(o.getFirstName());
    }
}