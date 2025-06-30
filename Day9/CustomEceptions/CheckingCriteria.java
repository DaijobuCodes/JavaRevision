package Day9.CustomEceptions;

public class CheckingCriteria {

    public boolean hasLength(String password){
        return password.length() <= 7;
    }

    public boolean hasCaps(String password){
        for(int i=0; i<password.length(); i++){
            char ch = password.charAt(i);
            if(ch >= 65 && ch<=90){
                return true;
            }
        }
        return false;
    }

    public boolean hasDigits(String password){
        for(int i=0; i<password.length(); i++){
            char ch = password.charAt(i);
            if(ch >= 48 && ch<=57){
                return true;
            }
        }
        return false;
    }


}
