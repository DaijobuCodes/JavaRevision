package Day5.EmployeeArray;

public class PermanentEmployee extends Employees{
    public float allowences;

    public void setallowences(){
        System.out.println("Enter the emp allowences: ");
        this.allowences = sc.nextFloat();
        sc.nextLine();
    }

    @Override
    public void calculateSalary() {
        super.calculateSalary();
        this.finalsalary = (12*this.allowences)+this.basesalary;
    }

    @Override
    public void displaySalary() {
        super.displaySalary();
    }
}
