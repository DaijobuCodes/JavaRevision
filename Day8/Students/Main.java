package Day8.Students;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends StudentAttendence{
    public static void main(String[] args){
        ArrayList<String> students = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        StudentAttendence sa = new StudentAttendence();


        while(true){
            System.out.println();
            System.out.println("Select the following option:");
            System.out.println("1. To add student to the register");
            System.out.println("2. To remove the student name");
            System.out.println("3. To check the current attendence");
            System.out.println("4. To check the student is absent or present");
            System.out.println("5. To exit");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter the student name: ");
                    sa.addStudent(students, sc.nextLine());
                    break;
                case 2:
                    System.out.print("Enter the student name: ");
                    sa.removeStudent(students, sc.nextLine());
                    break;
                case 3:
                    sa.currentAttendence(students);
                    break;
                case 4:
                    System.out.print("Enter the student name: ");
                    sa.checkStudent(students, sc.nextLine());
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Select a valid option");
                    break;
            }
        }
    }
}
