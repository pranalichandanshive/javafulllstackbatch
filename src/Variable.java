/**
 *local = scope of local variables function only
 * instance - within a class but outside the method
 * static - within a class but outside the method,cannot be local.
 * */

public class Variable {
    int z =30;//instance variable
    static int c = 50;//static variable
    public static void main(String[] args) {
        int a = 10;//local variables
     //        System.out.println(a+c+z);
       // System.out.println(z);
    }
    void display(){
        int a =20;//local variable
        System.out.println(a+c+z);
    }

}

