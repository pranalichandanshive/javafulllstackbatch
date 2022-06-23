package thiskeyword;
/**
 * 3.used to invoked current class constructor*/
public class Bike {
    int bikeNo;
    String bikeName;

    public Bike() {
        this(101,"Activa");
        System.out.println("In Default Constructor");
    }

    public Bike(int bikeNo, String bikeName) {
        System.out.println("In Paramitersied Constructor");
        this.bikeNo = bikeNo;
        this.bikeName = bikeName;
    }
    void display(){
        System.out.println("Bike Details");
        System.out.println("BikeNo : " +bikeNo);
        System.out.println("BikeName : " +bikeName);
    }
}
class BikeImpl{
    public static void main(String[] args) {
        Bike bike=new Bike();
        bike.display();
    }
}
