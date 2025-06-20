// Ask the user whether you want to print the next prime
package Day2;

import java.util.Scanner;

public class NextPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char choice = '\0';
        int num = 2;
        do{
            int i = 2;
            while(i < num){
                if(num%i == 0){
                    break;
                }
                i++;
            }
            if(num == i){
                System.out.println("The prime number is: "+ i);
                System.out.print("Do you want to continue? ");
                choice = sc.next().charAt(0);
            }
            num++;
        }
        while(choice == 'y' || choice == 'Y');

        sc.close();
    }
}
