package Day9.CustomEceptions;

import java.util.Scanner;

public class Main extends CheckingCriteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PasswordChecker passwordChecker = new PasswordChecker();

        while(true){
            System.out.print("Enter a password: ");
            String password = sc.nextLine();
            boolean isValid = false;
            try {
                isValid = passwordChecker.checkPassword(password);
                System.out.println(isValid);
                System.out.println("Your Password is set Successfully!");
                return;
            } catch (PasswordFormatException e) {
                System.out.println(isValid);
                System.out.println(e.getMessage());
            }
        }

    }
}
