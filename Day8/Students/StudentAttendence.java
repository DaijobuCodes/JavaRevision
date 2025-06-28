package Day8.Students;

import java.util.ArrayList;

public class StudentAttendence {
    public void addStudent(ArrayList<String> students, String name){
        students.add(name);
    }

    public void currentAttendence(ArrayList<String> students){
        System.out.println("The Current Attendence of the class is: ");
        for(String i : students){
            System.out.println(i);
        }
    }

    public void removeStudent(ArrayList<String> students, String name){
        int count = -1;
        for(String i : students){
            if(i.equals(name)){
                students.remove(i);
                count++;
            }
        }
        if(count == -1){
            System.out.println("No student with such name exist!");
        }
    }

    public void checkStudent(ArrayList<String> students, String name){
        int count = -1;
        for(String i : students){
            if(i.equals(name)) {
                System.out.println("Student was Present!");
                count++;
                break;
            }
        }
        if(count == -1){
            System.out.println("The Student was Absent!");
        }
    }

}
