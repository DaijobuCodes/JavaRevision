// Find the Primes from a Given Range
package Day2;

import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range");
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();

        for(int j = num1; j < num2; j++){
            int i =2;
            while(i < j){
                if(j%i == 0){
                    break;
                }
                i++;
            }
            if(i == j){
                System.out.println(i);
            }
        }
        sc.close();
    }

}
