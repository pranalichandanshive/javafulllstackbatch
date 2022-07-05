package FinalKeyword;

public class Person {
    int  empId;
    String name;
    final String PAN_NO="ASDFG3456P";
    final String AADHAR_NO;
    final String MOBILE_NO;
    static final String BIRTH_DATE;
    static {
        BIRTH_DATE = "15/09/1998";
    }

    public Person(String aadhar_no, String mobile_no) {
        AADHAR_NO =aadhar_no ;
        MOBILE_NO =mobile_no;
    }
    void display(){
        System.out.println(AADHAR_NO+"\n"+BIRTH_DATE+"\n"+MOBILE_NO+"\n"+PAN_NO+"\n");
    }
}
class PersonImpl{
    public static void main(String[] args) {
        Person person=new Person("567845983456","986754645");
        person.display();
    }
}