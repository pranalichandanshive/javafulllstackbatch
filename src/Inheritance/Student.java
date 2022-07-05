package Inheritance;

public class Student {
    String name="xyz";
    String div="B";
    int rno =1;

}
class PhysicsMarks extends Student{
    double marks =70;

}
class ChemistryMarks extends Student{
    double marks=80;

}
class MathsMarks extends Student{
    double marks=90;

}
class StudentImpl{
    public static void main(String[] args) {
        MathsMarks mathsMarks=new MathsMarks();
        ChemistryMarks chemistryMarks =new ChemistryMarks();
        PhysicsMarks physicsMarks=new PhysicsMarks();

        double total =mathsMarks.marks +physicsMarks.marks+mathsMarks.marks;
        double percentage=(total/300)*100;
        System.out.println("Student Details");
        System.out.println("Roll No :"+mathsMarks.rno);
        System.out.println("Name :"+mathsMarks.name);
        System.out.println("Div "+mathsMarks.div);
        System.out.println("Percentage : "+percentage);

    }
}

