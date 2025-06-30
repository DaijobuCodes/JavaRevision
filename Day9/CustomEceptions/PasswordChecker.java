package Day9.CustomEceptions;

public class PasswordChecker extends CheckingCriteria {

    CheckingCriteria ch = new CheckingCriteria();

    boolean checkPassword(String password) throws PasswordFormatException {
        if(ch.hasLength(password))
            throw new PasswordFormatException("The min length should be 8.");

        else if(!ch.hasDigits(password)){
            throw new PasswordFormatException("There should be atleast one digit in your password!");
        }

        else if(!ch.hasCaps(password)){
            throw new PasswordFormatException("There should be atleast one uppercase in your password!");
        }

        return true;

    }
}