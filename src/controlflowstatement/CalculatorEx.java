package controlflowstatement;

import java.util.Scanner;

public class CalculatorEx {
    public static void main(String[] args) {

        int no1,no2;
        Scanner sc =new Scanner(System.in);

        char ch;
        int result;

        do{
            System.out.println("Enter no1");
            no1 = sc.nextInt();
            System.out.println("Enter no2");
            no2 = sc.nextInt();

            System.out.println("1.Additin");
            System.out.println("2.Substaction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Modulo");
            System.out.println("Enter your choice");

            int choice = sc.nextInt();
            switch(choice){
                case 1: result=no1 + no2;
                    System.out.println("Addition is : " +result);
                    break;
                case 2: result=no1 - no2;
                    System.out.println("Substraction is : " +result);
                    break;
                case 3: result=no1 * no2;
                    System.out.println("Multiplication is : " +result);
                    break;
                case 4: result=no1 / no2;
                    System.out.println("Division is : " +result);
                    break;
                case 5: result=no1 % no2;
                    System.out.println("Modulo is : " +result);
                    break;
            }
            System.out.println("Do you want to continue?");
            ch = sc.next().charAt(0);

        }while(ch =='Y'|| ch =='y');
    }
}
