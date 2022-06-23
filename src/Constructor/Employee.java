package Constructor;

public class Employee {
    int id;
    String name;
    String companyName;

    Employee() {
        System.out.println("In Default Ctor");
    }

    void display() {
        System.out.println("Id :" + id);
        System.out.println("name : " + name);
        System.out.println("CompanyName : " + companyName);

    }
}


 class EmployeeImpl{
     public static void main(String[] args) {
         Employee e1 =new Employee();
         e1.display();
         Employee e2 =new Employee();
         e2.display();
     }

 }

