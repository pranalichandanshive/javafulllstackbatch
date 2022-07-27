package Interface;

public interface Parking {

}
class TwoWheeler implements Parking{
    void show(){
        System.out.println("In Two Wheeler");
    }
}
class FourWheeler{
    void show(){
        System.out.println("In Four Wheeler");
    }

}
class ParkingImpl{
    public static void main(String[] args) {
        TwoWheeler twoWheeler=new TwoWheeler();
        FourWheeler fourWheeler=new FourWheeler();
        if(twoWheeler instanceof Parking){
//            System.out.println("Allow");
fourWheeler.show();
        }
        else {
//            System.out.println("Don't Allow");
            twoWheeler.show();
        }
    }
}