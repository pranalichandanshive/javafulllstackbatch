package Abstraction;

public abstract class Vehicle {
    abstract void start();
    Vehicle(){
        System.out.println("In Vehicle Constructor");
    }
    static void show(){
        System.out.println("In show method");
    }
    final void stop(){
        System.out.println("In stop method");
    }
    void drive(){
        System.out.println("In drive method");
    }
}
class Car extends Vehicle{
     Car() {
         super();

    }

    @Override
    void start() {
        System.out.println("In Car Start Method");
    }

    @Override
    void drive() {
        super.drive();
    }
    static void show(){
        System.out.println("In Car Show Method");
    }

}

class VehicleImpl{
    public static void main(String[] args) {
        Vehicle v1=new Car();
        v1.start();
        v1.drive();
        v1.stop();
        Vehicle.show();

    }
}
