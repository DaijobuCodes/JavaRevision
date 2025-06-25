package Day5.EmployeeArray;

import java.util.Scanner;

public class Employees {
    private int id;
    protected float basesalary;
    protected float finalsalary;
    private String name;

    Scanner sc = new Scanner(System.in);

//    Employees(int id, String name, float basesalary){
//        System.out.println("This is Employee");
//        this.id = id;
//        this.name = name;
//        this.basesalary = basesalary;
//    }

    public void setid(){
        System.out.println("Enter the emp id: ");
        this.id = sc.nextInt();
        sc.nextLine();
    }

    public void setname(){
        System.out.println("Enter the emp name: ");
        this.name = sc.nextLine();
        sc.nextLine();
    }

    public void setbasesalaey(){
        System.out.println("Enter the emp basesalary: ");
        this.basesalary = sc.nextFloat();
        sc.nextLine();
    }

    public void calculateSalary(){

    }

    public void displaySalary(){
        System.out.println("The net salary of "+this.name+" is: "+ this.finalsalary);
    }
}
