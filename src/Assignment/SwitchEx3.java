package Assignment;

import java.util.Scanner;


public class SwitchEx3 {
    public static void main(String[] args) {
        Scanner  sc =new Scanner(System.in);
        System.out.println("Enter any character : ");
        String ch = sc.next();
        switch(ch){
            case "jan" :
                System.out.println("Janvary");
                break;
            case "feb" :
                System.out.println("February");
                break;
            case "mar" :
                System.out.println("March");
                break;
            case "apr" :
                System.out.println("April");
                break;
            default:
                System.out.println("none");
                break;
        }
    }
}
