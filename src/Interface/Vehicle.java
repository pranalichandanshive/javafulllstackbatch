package Interface;

public interface Vehicle {
}
interface Engine{

}
class Car implements Vehicle{
  void show(){
      System.out.println("car is a vehicle");
  }

}
class Bike implements Engine{
void show(){
    System.out.println("is a Engine");
}

}
class VehicleImpl {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        if (car instanceof Vehicle) {
            car.show();

        } else {
            bike.show();


        }
    }
}