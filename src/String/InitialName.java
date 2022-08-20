package String;

import java.util.Scanner;

public class InitialName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name=sc.nextLine();
        String []nameArray= name.split(" ");
        System.out.println(nameArray.length);
//        for(String s : nameArray){
//            System.out.println(s);
//        }
//       char firstInital =nameArray[0].toUpperCase().charAt(0);
//        char middleInitial=nameArray[1].toUpperCase().charAt(0);
//        String initialName = firstInital+"."+middleInitial+"."+nameArray[2];
//        System.out.println(initialName);

        char firstInital =nameArray[0].toUpperCase().charAt(0);
        char middleInitial=nameArray[1].toUpperCase().charAt(0);
        System.out.println(nameArray[2].substring(0,1).toUpperCase());
        String lastName = nameArray[2].substring(0,1).toUpperCase().concat(nameArray[2].substring(1));
        String initialName = firstInital+"."+middleInitial+"."+lastName;
        System.out.println(initialName);
    }
}
