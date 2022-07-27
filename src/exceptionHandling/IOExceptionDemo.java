package exceptionHandling;

import java.io.File;
public class IOExceptionDemo {
    public static void main(String[] args) {
        File file=new File("abc.txt");
//        IoException
//        file.createNewFile();     <-----checkedException or compile time exception occurs
    }
}
