package Day8.Delivery;

import java.util.HashSet;

public class DeliverySystem {
    public void addCities(HashSet<String> cities, String city){
        cities.add(city);
        System.out.println("The city: " + city + " has been added to the Cities List.");
    }

    public void displayCities(HashSet<String> cities){
        for(String i : cities){
            System.out.println(i);
        }
    }

    public void checkDelivery(HashSet<String> cities, String city){
        int count = -1;
        for(String i : cities){
            if(i.equals(city)){
                System.out.println("Yes delivery is available");
                count++;
            }
        }
        if(count ==-1){
            System.out.println("No the delivery is not available");
        }
    }
}
