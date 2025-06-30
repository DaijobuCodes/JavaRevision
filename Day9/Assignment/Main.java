package Day9.Assignment;

import Day9.CustomEceptions.PasswordFormatException;

import java.util.HashSet;
import java.util.Scanner;

public class Main extends CheckingCriteria {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<String>();
        Delivery delivery = new Delivery();
        Scanner sc = new Scanner(System.in);
        CheckingCriteria checkingCriteria = new CheckingCriteria();

        cities.add("Pune");
        cities.add("Mumbai");

        System.out.print("Enter the name of city: ");
        String name = sc.nextLine();
        try {
            delivery.addCity(name, cities);
        } catch (DuplicateException e) {
            System.out.println(e.getMessage());
        }

        delivery.displayCities(cities);


    }
}

