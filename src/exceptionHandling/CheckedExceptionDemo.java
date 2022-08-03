package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {
    void m1() throws FileNotFoundException{
        FileInputStream fis=new FileInputStream("abc.txt");
    }
    void m2() throws FileNotFoundException{
        m1();
    }
    void m3() throws FileNotFoundException{
        m2();
    }

    public static void main(String[] args) {
        CheckedExceptionDemo demo = new CheckedExceptionDemo();
        try{
            demo.m3();

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("Rest Of The Code");
    }
}
