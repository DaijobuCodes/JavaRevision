package Day5.simpleEmployee;

public class Employees {
    public int id;
    public String name;
    public float salary;
    public float finalsalary;

    Employees(int id, String name, float salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displaySalary(){
        System.out.println("Salary is: " + this.finalsalary);
    }

    public void calcualteSalary(){

    }
}
