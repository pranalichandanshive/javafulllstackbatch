package StaticKeyword;

public class Student {
    int rollno;
    String name;
    static String SchoolName;


    void display() {
        System.out.println(rollno + ":" + name + ":" + SchoolName + ":");

    }
}

class StudentImpl {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "amit";
        s1.SchoolName = "jj";

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "amita";
        s2.SchoolName = "jj";

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "amol";
        s3.SchoolName = "Rj";
        s1.display();
        s2.display();
        s3.display();
    }
}
