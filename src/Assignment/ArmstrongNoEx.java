package Assignment;

import java.util.Scanner;

public class ArmstrongNoEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no : ");
        int no =sc.nextInt();
        int t1 =no;
        int length=0;
        while(t1 != 0){
            t1 = t1/10;
            length = length +1;
        }
        int t2 =no;
        int arm = 0;
        int rem;

        while(t2 != 0){
           int mul =1;
           rem = t2%10;
           for(int i=0;i<=length;i++)
           {
               mul = mul * rem;
           }
           arm = arm + mul;
           t2 = t2/10;

        }
if(no==arm)
{
    System.out.println("Number not Armstrong");
}
else {
    System.out.println("Number is Armstrong");
}

    }
}
