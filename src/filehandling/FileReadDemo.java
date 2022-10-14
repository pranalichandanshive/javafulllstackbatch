package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadDemo {
    public static void main(String[] args) {

        File file =new File("./src/filehandling/input.txt");
        if(file.exists())
        {
            try{
                Scanner sc=new Scanner(file);
                while(sc.hasNext()){
                    System.out.println(sc.next());
                }
            }catch (FileNotFoundException e){
                System.out.println(e.getMessage());
            }
        }else {
            System.out.println("File not Found");
        }
    }
}
