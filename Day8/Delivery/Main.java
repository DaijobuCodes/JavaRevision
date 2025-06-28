package Day8.Delivery;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        HashSet<String> cities = new HashSet<String>();
        DeliverySystem ds = new DeliverySystem();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println();
            System.out.println("Select your option:");
            System.out.println("1. Add City Name");
            System.out.println("2. Display all cities");
            System.out.println("3. Check if the city is available for delivery");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Enter the name of city: ");
                    ds.addCities(cities, sc.nextLine());
                    break;

                case 2:
                    System.out.println("The cities are: ");
                    ds.displayCities(cities);
                    break;

                case 3:
                    System.out.println("Enter the name of City: ");
                    ds.checkDelivery(cities, sc.nextLine());
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Wrong Input, select valid one");
                    break;

            }
        }


    }



}
