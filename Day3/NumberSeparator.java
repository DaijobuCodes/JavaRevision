// Separate the given number and find the sum of it.
package Day3;

import java.util.Scanner;

public class NumberSeparator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int divider = 10;
        int sum = 0;

        while(true){
            if(num/divider == 0){
                System.out.println(num%divider);
                sum = sum + num%divider;
                break;
            }
                int rem = num % divider;
                num = num/divider;
                sum = sum + rem;
                System.out.println(rem);
        }
        System.out.println("The sum is: "+sum);
    }
}
