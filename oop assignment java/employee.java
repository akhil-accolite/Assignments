import java.util.Scanner;
import java.lang.*; 

class employee{

    int salary;
    String empname;

    void addMan(){
        System.out.println("added manager "+empname);
    }

    void addDev(){
        System.out.println("added developer "+empname);
    }
}

class manager extends employee{

    //inheritence example

    manager(){
        System.out.println("enter the manager name");
        Scanner sc = new Scanner(System.in);
        super.empname = sc.next(); 
        super.addMan();
        sc.close();
    }
}

class developer extends employee{

    developer(){
        System.out.println("enter the developer name");
        Scanner sc = new Scanner(System.in);
        super.empname = sc.next(); 
        super.addDev();
        sc.close();
    }
}

class Main{

    public static void main(String[] args) {
        
        System.out.println("add manager and developer");

        developer d = new developer();
        manager m = new manager();

    }
}