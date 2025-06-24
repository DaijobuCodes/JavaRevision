//Get the Student data and calculate the result for it using Array of Objects and Getters and Setters

package Day4;

import java.util.Scanner;

public class Students {
    private int id;
    private String name;
    private int[] marks;
    private float percentage;
    private String grade;
    Scanner sc = new Scanner(System.in);

    public void setID(){
        System.out.print("Enter ID: ");
        this.id = sc.nextInt();
    }

    public void setName(){
        System.out.print("Enter Name: ");
        sc.nextLine();
        this.name = sc.nextLine();
    }

    public void setSubjects(){
        System.out.print("Enter the no. of subjects: ");
        int n = sc.nextInt();
        this.marks = new int[n];
    }

    public void setMarks(){
        for(int i = 0; i < this.marks.length; i++){
            System.out.print("Enter the subject " + i + " marks: ");
            int n = sc.nextInt();
            this.marks[i] = n;
        }
    }

    public void calculatePercentage(){
        int sum=0;
        int subs = this.marks.length;
        for(int mark : this.marks){
            sum = sum + mark;
        }
        this.percentage = ((float) sum / (subs * 100)) * 100;
    }

    public void calculateGrade() {
        if (percentage <= 35) {
            this.grade = "F";
        } else if (percentage < 60) {
            this.grade = "C";
        } else if (percentage < 75) {
            this.grade = "B";
        } else if (percentage < 90) {
            this.grade = "A";
        } else {
            this.grade = "A+";
        }
    }

    public void displayDetails(){
        System.out.println(this.id + " : " + this.name);
        System.out.print("The marks are: ");
        for (int mark : this.marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
        System.out.println("The percentage is: " + this.percentage);
        System.out.println("The grade is: " + this.grade);
    }

}

