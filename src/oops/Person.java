package oops;

import java.util.Scanner;

public class Person {
     String firstname;
     String lastname;
     String address;
     int age;

     void insertData(String fname,String lname,String addr,int a){
         firstname = fname;
         lastname = lname;
         address = addr;
         age = a;

     }

     void display(){
         System.out.println("**********Person Details*********");
         System.out.println("Enter FirstName : "+firstname);
         System.out.println("Enter LastName : "+lastname);
         System.out.println("Enter Address : "+address);
         System.out.println("Enter Age : "+age);
     }
}
class PersonImpl{
    public static void main(String[] args) {
        Person p1 =new Person();

        p1.firstname="Pranali";
        p1.lastname="Chandanshive";
        p1.address="Baramati";
        p1.age=26;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter firstname : ");
        String fname=sc.next();

        System.out.println("Enter LastName : ");
        String lname=sc.next();

        System.out.println("Enter Address : ");
        String addr = sc.next();

        System.out.println("Enter Age : ");
        int age=sc.nextInt();

        Person p2 =new Person();
        p2.insertData(fname,lname,addr,age);

        Person p3 = new Person();
        p3.insertData("Madhuri","Chandanshive","Solapur",50);

        p1.display();
        p2.display();
        p3.display();


    }

}
