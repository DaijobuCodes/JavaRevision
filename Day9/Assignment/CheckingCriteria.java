package Day9.Assignment;

import java.util.HashSet;


public class CheckingCriteria {

    public boolean hasDuplicate(String city, HashSet<String> cities){
        for(String i: cities){
            if(i.equals(city)){
                return true;
            }
        }
        return false;
    }
}
