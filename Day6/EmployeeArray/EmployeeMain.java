package Day6.EmployeeArray;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int num = sc.nextInt();
        Employees[] employees = new Employees[num];
        Bonus2 bonus = new Bonus2();
        CalculateTax tax = new CalculateTax();
        for(int i=0; i<num; i++){
            System.out.print("Enter 1 or 2 for Permanent and Consultant resp: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    PermanentEmployee pe = new PermanentEmployee();
                    pe.setid();
                    pe.setname();
                    pe.setbasesalaey();
                    pe.setallowences();
                    pe.calculateSalary();
                    employees[i] = pe;
                    break;
                case 2:
                    ConsultantEmployee ce = new ConsultantEmployee();
                    ce.setid();
                    ce.setname();
                    ce.setbasesalaey();
                    ce.sethours();
                    ce.calculateSalary();
                    employees[i] = ce;
                    break;
                default:
                    System.out.println("Dont put any other thing than 1 or 2");
                    i--;
                    break;
            }
        }

        int count = 1;
        for(Employees emp: employees){
            System.out.println("==========EMPLOYEE-"+count+"==========");
            System.out.println(emp);  //java will automatically add the .toString() function after emp samajla ka
            bonus.calculateUpraisal(emp);
            if(emp instanceof PermanentEmployee){
                tax.calculateIncomeTax(emp);
                tax.calculatePF(emp);
                tax.calculateSalaryAfterTax(emp);
            }
            else{
                tax.calculateGST(emp);
                tax.calculateSalaryAfterTax(emp);
            }
            System.out.println("=================================");
            count++;
        }
        System.out.println();
        boolean duplicate = false;
        for (int i = 0; i < employees.length; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].equals(employees[j])) {
                    duplicate = true;
                    System.out.println("Duplicate ID found for employee ID: " + employees[i].getid());
                    System.out.println("-> " + employees[i]);
                    System.out.println("-> " + employees[j]);
                }
            }
        }
        if (!duplicate) {
            System.out.println("No duplicate employee IDs found.");
        }
    }
}
