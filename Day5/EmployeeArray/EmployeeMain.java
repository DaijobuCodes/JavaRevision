package Day5.EmployeeArray;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int num = sc.nextInt();
        Employees[] employees = new Employees[num];
        Bonus2 bonus = new Bonus2();
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
                    System.out.println("Dont put any other thing than 1 0r 2");
                    i--;
                    break;

            }
        }

        for(Employees emp: employees){
            emp.displaySalary();
            bonus.calculateUpraisal(emp);
        }
    }
}
