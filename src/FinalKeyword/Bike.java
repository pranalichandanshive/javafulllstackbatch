package FinalKeyword;

public class Bike {
   final void run(){
        System.out.println("runing");
    }
}
class Activa extends Bike{
//    void run(){........error..we cannot override method
//        System.out.println(" run");
//    }
}
class BIkeImpl{
    public static void main(String[] args) {
        Activa active=new Activa();
//        activa.run();

    }
}