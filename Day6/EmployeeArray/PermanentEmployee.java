package Day6.EmployeeArray;

public class PermanentEmployee extends Employees {
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

    @Override
    public String toString() {
        return super.toString() + ", allowances=" + allowences;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof PermanentEmployee)) return false;
        return super.equals(obj);
    }
}
