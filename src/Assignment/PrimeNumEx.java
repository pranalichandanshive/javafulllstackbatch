package Assignment;

import java.util.Scanner;

public class PrimeNumEx {
    public static void main(String atgs[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int no = sc.nextInt();
        int temp=0;

        for(int i =2;i<=no-i;i++) {
            if (i % 2 == 0) {
                temp = temp + 1;
            }
        }
            if(temp > 0)
            {
                System.out.println("Prime Number");
            }
            else
            {
                System.out.println("Not a prime Number");
            }
        }
    }

