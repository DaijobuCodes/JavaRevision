package Day6.EmployeeArray;

public class ConsultantEmployee extends Employees implements IncomeTax {
    public int hours;

    public void sethours() {
        System.out.println("Enter the emp working hrs: ");
        this.hours = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public void calculateSalary() {
        super.calculateSalary();
        this.finalsalary = (1000 * this.hours) + this.basesalary;
    }

    @Override
    public void calculateIncomeTax(Employees employee) {
        float taxAmount = (employee.finalsalary * INCOME_TAX) / 100;
        employee.finalsalary -= taxAmount;
        System.out.println("Income tax of " + taxAmount + " has been deducted.");
    }

    @Override
    public void displaySalary() {
        super.displaySalary();
        System.out.println("Working hours: " + hours);
    }

    @Override
    public String toString() {
        return super.toString() + ", hours=" + hours ;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ConsultantEmployee))
            return false;
        return super.equals(obj);
    }
}
