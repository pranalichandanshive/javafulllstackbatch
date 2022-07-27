package exceptionHandling;

public class FinallyDemo {

    public static void main(String[] args) {
        String msg="PUNE";
        try{
        System.out.println(msg.length());

    }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("in finally block");
        }
        System.out.println("rest of the code");
        }

}
