package Day8.Employee;

import java.util.HashMap;
import java.util.Scanner;

public class Main extends Employees{
    public static void main(String[] args){
        HashMap<Integer, Employees> employees = new HashMap<>();
        HR hr = new HR();
        Employees employee = new Employees();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println();
            System.out.println("select an option:");
            System.out.println("1. To add an employee");
            System.out.println("2. To remove the employee");
            System.out.println("3. To fetch the employee");
            System.out.println("4. To exit");
            System.out.println("5. To Display");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    hr.addNewEmployee(employees, sc.nextInt(), sc.nextLine());
                    break;

                case 2:
                    hr.removeEmployee(employees, sc.nextInt());
                    break;

                case 3:
                    hr.fetchEmployee(employees, sc.nextInt());
                    break;

                case 4:
                    return;

                case 5:
                    hr.displayAll(employees);

                default:
                    System.out.println("Please select the valid input");
            }
        }
    }

}
