package Day9.Assignment;

import java.util.HashSet;

public class Delivery{

    CheckingCriteria checkingCriteria = new CheckingCriteria();

    public void addCity(String name, HashSet<String> cities) throws DuplicateException {
        if(checkingCriteria.hasDuplicate(name, cities)){
            throw new DuplicateException("City already exist!");
        }
        cities.add(name);
    }

    public void displayCities(HashSet<String> cities){
        for(String i: cities){
            System.out.println(i);
        }
    }


}
