package Day6.EmployeeArray;

public class CalculateTax implements GST, IncomeTax, ProvidentFund {
    @Override
    public void calculateGST(Employees employee) {
        float gst = employee.finalsalary * GST_RATE;
        employee.tax += gst;
        System.out.println("GST added: " + gst);
    }

    @Override
    public void calculateIncomeTax(Employees employee) {
        float tax = (employee.finalsalary * INCOME_TAX) / 100;
        employee.tax += tax;
        System.out.println("Income Tax deducted: " + tax);
    }

    @Override
    public void calculatePF(Employees employee) {
        float pf = employee.finalsalary * PF;
        employee.tax += pf;
        System.out.println("Provident Fund deducted: " + pf);
    }

    public void calculateSalaryAfterTax(Employees employee){
        employee.finalsalary = employee.finalsalary - employee.tax;
        System.out.println("The salary after tax deducted will be: " + employee.finalsalary);
    }
}
