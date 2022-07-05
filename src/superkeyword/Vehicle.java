package superkeyword;

public class Vehicle {
    int vehicleCode;
    String vehicleType;

    public Vehicle(int vehicleCode, String vehicleType) {
        this.vehicleCode = vehicleCode;
        this.vehicleType = vehicleType;
    }
}
class Bike extends Vehicle{
    String brand;
    String model;
    String bikeName;

    public Bike(int vehicleCode, String vehicleType, String brand, String model, String bikeName) {

        super(vehicleCode, vehicleType);
//        public Bike(String brand, String model, String bikeName) {
//            this(101,"scooty","tvs","124cc","access");
//            this.brand = brand;
//            this.model = model;
//            this.bikeName = bikeName;
//
//        } either use this keyword or super keyword
        this.brand = brand;
        this.model = model;
        this.bikeName = bikeName;


    }

    public Bike(int vehicleCode, String vehicleType) {
        super(vehicleCode, vehicleType);
    }





    void display(){
        System.out.println("Vehicle Code : "+super.vehicleCode);
        System.out.println("Vehicle Type : "+super.vehicleType);
        System.out.println("Brand Name : "+brand);
        System.out.println("Model Name : "+model);
        System.out.println("Bike Name : "+bikeName);

    }
}
class VehicleImpl{
    public static void main(String[] args) {
        Bike bike=new Bike(101,"bike","hero","125cc","splender");
        bike.display();
    }
}