package exceptionHandling;

public class InsufficientBalance extends Exception{
    public InsufficientBalance(String s){
        super(s);
    }
}
