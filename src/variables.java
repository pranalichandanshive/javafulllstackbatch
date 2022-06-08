/**
*local = scope of local variables function only
 * instance - within a class but outside the method
 * static - within a class but outside the method,cannot be loacl
* */

public class variables {
    int z =30;//instance variable
    static int c = 50;//static variable
    public static void main(String[] args) {
        int a = 10;//local variables
        System.out.println(a);

    }
    void display(){
        int a =20;//local variable
    }
}
