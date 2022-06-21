package oops;

import java.util.Scanner;

public class Student {
    int rno;
    String name;
    String address;
    float age;

    void insertData(int r, String nm, String addr, float a) {
        rno = r;
        name = nm;
        address = addr;
        age = a;
    }

    void display() {
        System.out.println("*******Student Details************");
        System.out.println("Rollno : " + rno);
        System.out.println("Name : " + name);
        System.out.println("address : " + address);
        System.out.println("age : " + age);
    }
}

    class StudentImpl {
        public static void main(String[] args) {
            Student s1 = new Student();
            s1.rno = 1;
            s1.name = "abc";
            s1.address = "kothrud,pune";
            s1.age = 5.5f;

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter rno");
            int rno = sc.nextInt();

            System.out.println("Enter name");
            String nm = sc.next();

            System.out.println("Enter address");
            String addr = sc.next();

            System.out.println("Enter age");
            float age = sc.nextFloat();

            Student s2 = new Student();
            s2.insertData(rno, nm, addr, age);
            s1.display();
            s2.display();

            Student s3 =new Student();
            s3.insertData(5,"panu","nashik",9);
            s3.display();

        }

    }

