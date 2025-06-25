package Day5.EmployeeArray;

public class Bonus extends Employees{
    public void calculateUpraisal(Employees employee){
        System.out.print("The increment in salary is: ");
        float increment = (float) (employee.basesalary*0.02);
        System.out.println(increment);
        employee.basesalary = (increment+employee.basesalary);
        employee.calculateSalary();
        System.out.println("Hence the new salary becomes: "+ employee.finalsalary);
    }
}
