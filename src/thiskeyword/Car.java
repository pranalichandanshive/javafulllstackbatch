package thiskeyword;

public class Car {
    int carNo;
    String carName;
    double price;
    Car( int carNo,String carName,double price){
        this.carNo=carNo;
        this.carName=carName;

        this.price= price;


    }
     void display(){
         System.out.println("**************Car Details**************");
         System.out.println("Car No : " +carNo );
         System.out.println("CarName : "+carName);
         System.out.println("Car price : "+price);

    }
}
class CarImpl{
    public static void main(String[] args) {
        Car c1=new Car(1107,"baleno",900000);
        c1.display();
    }
}

