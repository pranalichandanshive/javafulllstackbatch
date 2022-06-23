package Constructor;

public class Person
{
    int id;
    String name;
//parameterless constructor
  Person()
     {
    System.out.println("Default Ctor");
     }
//parameterised constructor
  Person(int i,String nm)
     {
    id =i;
    name=nm;
     }
  Person(String nm)
  {
    name =nm;
  }
  void display()
  {
    System.out.println("id : "+id);
    System.out.println("name : " +name);
  }
}
class PersonImpl{
    public static void main(String[] args) {
        Person p1 =new Person(5,"pranali");
        p1.display();
        Person p2 =new Person("Ashutosh");
        p2.display();
        Person p3 =new Person();
        p3.display();

    }
}
