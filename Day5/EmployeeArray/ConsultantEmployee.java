package Day5.EmployeeArray;

public class ConsultantEmployee extends Employees {
    public int hours;

    public void sethours(){
        System.out.println("Enter the emp working hrs: ");
        this.hours = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public void calculateSalary() {
        super.calculateSalary();
        this.finalsalary = (1000*this.hours)+this.basesalary;
    }

    public int gethours(){
        return hours;
    }

    @Override
    public void displaySalary() {
        super.displaySalary();
    }
}
