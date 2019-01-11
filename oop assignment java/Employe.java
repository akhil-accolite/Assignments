import java.util.Scanner;
import java.lang.*; 

class employee{

    private int salary; //------------->>>>>>>>>>>encapsulation
    private String empname;
    static String company = "accolite";
    static String prev = "PESIT";

    void nothing(int sal,String n){
        employee e = new employee();
        e.salary = sal;
        e.empname = n;

        System.out.println(e.salary);
        System.out.println(e.empname);
    }

    void addMan(String empname,int sal){
        System.out.println("added manager "+empname);
        System.out.println("gets salary: "+sal);
    }

    void addDev(String empname,int sal){
        System.out.println("added developer: "+empname);
        System.out.println("gets salary: "+sal);
    }

    static void retriveCompany(){//------------------>>>>>>>static method calling a static variable company by instance of employee class
        System.out.println(company);
    }

    void retriveCompany(int n){ // ------------------>>>>>>>>method retrieveCompany overloaded
        employee e = new employee(); //--------------->>>>>>>non static method calling a static variable prev by instance of employee class
        System.out.println(e.prev);
    }
}

class manager extends employee{ //--------------->>>>>>>inheritence example

    manager(){                  //--------------->>>>>>>constructor
        System.out.println("enter the manager's name and salary");
        Scanner in = new Scanner(System.in);
        String empname = in.next(); 
        int salary = in.nextInt();
        super.addMan(empname,salary);
    }

    @Override                               //----------------->>>>>>>>>>overriding example with override annotation
    void addMan(String empname,int sal){
        System.out.println("added overridden Manager: "+empname);
        System.out.println("gets overridden salary: "+sal);
    }
}

class developer extends employee{

    void adddevel(){
        System.out.println("enter the developer's name and salary");
        Scanner sc = new Scanner(System.in);
        String empname = sc.next();
        int salary = sc.nextInt(); 
        super.addDev(empname,salary);
    }

}

class Main{

    public static void main(String[] args) {
        
        manager m = new manager();
        developer d = new developer();
        d.adddevel();

        m.addMan("overriding manager", 123123);//

        employee e = new employee();
        
        e.retriveCompany();
        e.retriveCompany(1); //overloaded method called
        e.nothing(123, "someguy");
    }
}