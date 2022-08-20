package StaticKeyword;

public class Employee {
    int empNO;
    String empName;
    static String companyName;
    static void show(){
        companyName="Codkul";
    }
    void display(){
        companyName="Codkul";
    }

}
class EmployeeImpl{
    public static void main(String[] args) {
        Employee.show();
        Employee e =new Employee();
        e.display();
        System.out.println();
    }
}