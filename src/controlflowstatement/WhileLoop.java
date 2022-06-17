package controlflowstatement;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
//        if we put null instead of zero then error are occur. <nulltype> cannot be converted to integer
        while(i<5)
        {
            System.out.println("hello");
            i++;
        }
    }
}
