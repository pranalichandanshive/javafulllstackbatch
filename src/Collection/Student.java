package Collection;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Student {
    private Integer id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String contactNumber;

    public Student(Integer id, String firstName, String middleName, String lastName, String contactNumber) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
}
class StudentImpl{
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        StudentImpl studentImpl = new StudentImpl();
        int ch;
        do{
            System.out.println("1.Insert");
            System.out.println("2.Update Record");
            System.out.println("3.Delete Record");
            System.out.println("4.Display");
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            switch (ch){
                case 1:
                    Student s = studentImpl.insertStudentData(sc);
                    students.add(s);
                    break;
                case 2:
                    if (students.isEmpty())
                        System.out.println("List is empty");
                    else {
                        studentImpl.updateRecord(sc,students);
                    }
                    break;
                case 3:
                    if (students.isEmpty())
                        System.out.println("List is empty");
//                    else {
//                        studentImpl.deleteRecord(sc,students);
//                    }
                    break;
                case 4:
                    studentImpl.display(students);
            }
        }while (true);
    }

    private void display(List<Student> students){
        Iterator iterator = students.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }

    private void updateRecord(Scanner sc,List<Student> students){
        System.out.println("Enter student id to update record");
        Integer id = sc.nextInt();
        System.out.println("Enter contact number to update record for id "+id);
        String mbl = sc.next();
        System.out.println("Enter fName to update record for id" +id);
        String fName1 = sc.next();
        for(Student s:students){
            if (s.getId() == id){
                s.setContactNumber(mbl);
                s.setFirstName(fName1);
            }
        }



    }
    private Student insertStudentData(Scanner sc) {
        System.out.println("Enter student id");
        Integer id = sc.nextInt();
        System.out.println("Enter first name");
        String fName = sc.next();
        System.out.println("Enter middle name");
        String mName = sc.next();
        System.out.println("Enter last name");
        String lName = sc.next();
        System.out.println("Enter Contact Number");
        String mbl = sc.next();
        Student student = new Student(id,fName,mName,lName,mbl);
        return student;
    }
}
