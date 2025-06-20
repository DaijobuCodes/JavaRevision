// Check whether the number is Prime or Not
package Day2;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int i = 2;
        while(i < num){
            if(num % i == 0){
                System.out.println("It is not a prime number");
                break;
            }
            i++;
        }
        if(i == num){
            System.out.println("It is a prime number");
        }
    }
}
