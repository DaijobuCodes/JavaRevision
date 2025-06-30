package Day9.CustomEceptions;

public class PasswordFormatException extends Exception{

    public PasswordFormatException(String message) {
        super(message);
    }
}