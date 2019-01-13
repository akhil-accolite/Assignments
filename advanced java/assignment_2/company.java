import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class company {
    private String cname;
    private address a;

    company(String cname, address a) {
        this.cname = cname;
        this.a = a;
    }

    address getAdd() {
        return this.a;
    }

    public String getCname() {
        return cname;
    }

    @Override
    public String toString() {
        return this.cname;
    }

    @Override
    public int hashCode() {
        return this.cname.hashCode();
    }
}

class address {
    private String city;
    private String state;

    address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    ///////////////////////////////////////////// getters
    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    ///////////////////////////////////////////// setters
    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return this.city + " " + this.state;
    }
}

class employee implements Comparable<employee> {

    String name;
    Integer id;
    int age;

    employee(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    /////////////////////////////////////////////// getters
    public String getName() {
        return this.name;
    }

    public int getID() {
        return this.id;
    }

    public int getAge() {
        return this.age;
    }

    /////////////////////////////////////////////// setters
    public void setName(String name) {
        this.name = name;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " " + this.id + " " + this.age;
    }

    @Override
    public int compareTo(employee e) {

        if (this.age == e.getAge()) {
            return 0;
        } else if (this.age > e.getAge()) {
            return -1;
        } else
            return 1;
    }
}

class empLessThan30 {
    public static void main(String[] args) {

        System.out.println("(Assignment 1 used TreeSet) displaying employees having age less than 30");

        TreeSet<employee> et = new TreeSet<employee>();

        et.add(new employee("akhil", 1, 31));
        et.add(new employee("akh", 2, 22));
        et.add(new employee("khil", 3, 23));
        et.add(new employee("il", 4, 21));
        et.add(new employee("akhi", 5, 42));
        et.add(new employee("hil", 6, 23));
        et.add(new employee("akhl", 7, 21));

        for (employee e : et) {
            if (e.age < 30) {
                System.out.println(e.toString());
            }
        }
    }
}

class sortOnAgeIdName {

    public static void main(String[] args) {

        System.out.println(
                "(Assignment 2 Used TreeSet and compare method to compare) decended sorting on age id and name");

        List<employee> el = new ArrayList<employee>();

        el.add(new employee("akhil", 1, 31));
        el.add(new employee("akh", 2, 22));
        el.add(new employee("khil", 3, 23));
        el.add(new employee("il", 4, 21));
        el.add(new employee("akhi", 5, 42));
        el.add(new employee("hil", 6, 23));
        el.add(new employee("akhl", 7, 21));

        System.out.println("PRESS KEY " + "\n" + "Age : 1" + "\n" + "ID : 2" + "\n" + "Name : 3" + "\n" + "EXIT : 4");

        Scanner sc = new Scanner(System.in);

        while (true) {
            switch (sc.nextInt()) {
            case 1:
                Collections.sort(el);
                for (employee e : el) {
                    System.out.println(e.toString());
                }
                break;

            case 2:
                TreeSet<employee> eti = new TreeSet<>(new Comparator<employee>() {

                    @Override
                    public int compare(employee p1, employee p2) {

                        Integer pt1 = p1.getID();
                        Integer pt2 = p2.getID();

                        return pt1.compareTo(pt2);
                    }
                });
                eti.addAll(el);

                for (employee e : eti) {
                    System.out.println(e.toString());
                }

                break;

            case 3:
                TreeSet<employee> etn = new TreeSet<>((p1, p2) -> p2.getName().compareTo(p1.getName()));
                etn.addAll(el);

                for (employee e : etn) {
                    System.out.println(e.toString());
                }

                break;

            default:
                System.exit(0);
            }

            sc.close();
        }
    }
}

class allcompanyInCity {

    public static HashMap<String, ArrayList<String>> getcompany(ArrayList<company> cl) {

        HashMap<String, ArrayList<String>> mp = new HashMap<String, ArrayList<String>>();

        for (company c : cl) {
            if (!mp.containsKey(c.getAdd().getCity())) {
                ArrayList<String> al = new ArrayList<>();
                al.add(c.getCname());
                mp.put(c.getAdd().getCity(), al);
            }

            else {
                ArrayList<String> l = mp.get(c.getAdd().getCity());
                l.add(c.getCname());
                mp.put(c.getAdd().getCity(), l);

            }
        }
        return mp;
    }

    public static void main(String[] args) {

        ArrayList<company> cl = new ArrayList<company>();
        // MultiMap map = new MultiValueMap();

        cl.add(new company("accolite", new address("bangalore", "karnataka")));
        cl.add(new company("accolite", new address("bombay", "maharashtra")));
        cl.add(new company("affine", new address("bangalore", "karnataka")));
        cl.add(new company("infosys", new address("bangalore", "karnataka")));
        cl.add(new company("infosys", new address("mysore", "karnataka")));
        cl.add(new company("cisco", new address("bangalore", "karnataka")));
        cl.add(new company("accolite", new address("delhi", "delhi")));

        HashMap<String, ArrayList<String>> cmp = getcompany(cl);
        for (String c : cmp.keySet()) {
            System.out.print(c+" ");
            System.out.print("[ ");
            for (String cm : cmp.get(c)) {
                System.out.print(cm+" ");
            }
            System.out.println("]");
        }

    }

}