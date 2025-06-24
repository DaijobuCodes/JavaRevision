package Day4;

import java.util.Scanner;

public class Students1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int std_num = sc.nextInt();

        for(int i=0; i<std_num; i++){
            Students s = new Students();
            System.out.println("====Student " + (i+1) + "=====");
            s.setID();
            s.setName();
            s.setSubjects();
            s.setMarks();
            s.calculatePercentage();
            s.calculateGrade();
            s.displayDetails();
        }

    }
}
