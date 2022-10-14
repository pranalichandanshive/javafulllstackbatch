package filehandling;

import java.io.File;
import java.io.IOException;

public class FileMethod {
    public static void main(String[] args) {
        File file = new File("./src/filehandling/codekul.txt");
        try{
            if(file.createNewFile())
                System.out.println("File is Created");
            else
                System.out.println("File Exists");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Is FIle : "+file.isFile());
        System.out.println("path : "+file.getPath());
        System.out.println("NAME : "+file.getName());
    }
}
