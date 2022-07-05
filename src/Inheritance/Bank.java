package Inheritance;
//singlelevel inheritance
public class Bank {
    int bankNo;
    String ifsCode;

}
class Sbibank extends Bank{
    String address;
    String branchCode;
    String contactNo;
    void display(){
        System.out.println(branchCode);
        System.out.println(address);
        System.out.println(bankNo);
        System.out.println(ifsCode);
        System.out.println(contactNo);


    }

}
class BankImpl{
    public static void main(String[] args) {
        Sbibank sbiBank = new Sbibank();
        sbiBank.address="Kothrud ,pune";
        sbiBank.branchCode="SBI10034";
        sbiBank.bankNo=4567;
        sbiBank.ifsCode="SBI0000045";
        sbiBank.contactNo="98657432";
        sbiBank.display();


    }
}
