package exceptionHandling;

public class InvalidAmountException extends Exception{
    public InvalidAmountException(String s){
        super(s);
    }
}
