package Day5.simpleEmployee;

public class PermanentEmployee extends Employees{
    public int hours;
    public float allowences;


    PermanentEmployee(int id, String name, float salary, int hours, float allowences){
        super(id, name, salary);
        this.hours = hours;
        this.allowences = allowences;
    }

    @Override
    public void calcualteSalary() {
        this.finalsalary = (12*this.allowences)+this.salary;
    }

    @Override
    public void displaySalary() {
        super.displaySalary();
    }
}
