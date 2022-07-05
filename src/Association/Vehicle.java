package Association;

public class Vehicle {
    int wheels;
    String vehicleType;
    String brand;
}

class Car extends Vehicle {
    String segment;
    String model;
    String varient;
    Engine engine;
    MPlayer mPlayer;
//    above engine and mpplayer is aggregation method use.
void display() {
//    System.out.println(companyName + " \n" + price);
//    System.out.println(engineType + "\n" + cc + "\n" + strock);
//        System.out.println(brand + "\n" + vehicleType + "\n" + model + "\n" + segment + "\n" + varient);

}
}

class Engine {
    int stroke;
    String engineType;
    int cc;
}

class MPlayer {
    String companyName;

    double price;



}

class VehicleImpl {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Suzuki";
        car.vehicleType = "Car";
        car.model = "Swift";
        car.segment = "Hashback";
        car.varient = "Diesel";


        Engine suzukiEngine = new Engine();
        suzukiEngine.engineType = "BS6";
        suzukiEngine.cc = 1296;
        suzukiEngine.stroke = 4;
        car.engine = suzukiEngine;

        MPlayer sonyPlayer = new MPlayer();
        sonyPlayer.companyName = "Sony";
        sonyPlayer.price = 3400;
        car.mPlayer = sonyPlayer;

//        car.display();
//        suzukiEngine.display();

//        sonyPlayer.display();


    }
}

