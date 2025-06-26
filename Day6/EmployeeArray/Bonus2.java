package Day6.EmployeeArray;

public class Bonus2 extends Employees {
    public void calculateUpraisal(Employees employee){
        if(employee.getClass().getSimpleName().equals("PermanentEmployee")){
            System.out.print("The 2% increment in salary is: ");
            float increment = (float) (employee.basesalary*0.02);
            System.out.println(increment);
            employee.basesalary = (increment+employee.basesalary);
            employee.calculateSalary();
            System.out.println("Hence the new salary becomes: "+ employee.finalsalary);
        }
        else {
            ConsultantEmployee ce = (ConsultantEmployee) employee;
            if(ce.hours > 100){
                System.out.print("The hours of employee worked is: ");
                System.out.println(ce.hours);
                float increment = (float) (employee.finalsalary*0.1);
                System.out.println("The increment of 10% is: " + increment);
                employee.finalsalary = (increment+employee.finalsalary);
                System.out.println("Hence the new salary becomes: "+ employee.finalsalary);
            }
            else{
                System.out.println("This employee is not having hours greater than 100 hence no increase in salary.");
            }

        }
    }
}
