package Assignment;

import java.util.Scanner;

public class EvenOddNo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your number : ");
        int no = sc.nextInt();
        if(no % 2 == 0)
        {
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
}
