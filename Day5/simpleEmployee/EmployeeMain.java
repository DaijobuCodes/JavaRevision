package Day5.simpleEmployee;

public class EmployeeMain {
    public static void main(String[] args){
        PermanentEmployee pr = new PermanentEmployee(12, "Yash", 10000, 23, 4000);
        pr.calcualteSalary();
        pr.displaySalary();
    }
}
