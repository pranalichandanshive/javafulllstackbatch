package Polymorphism.methodoverloading;

public class Addition {
    int add(int no1,int no2){
        return no1+no2;
    }
    int add(int no1,int no2,int no3){
        return no1+no2+no3;
    }
    float add(float f1,int no1){
        return f1+no1;

    }
    float add(int no1,float f1){
        return no1+f1;
    }

    void add(int... no){
        System.out.println("calling variable argument");
    }
}
class AdditionImpl{
    public static void main(String[] args) {
        Addition add1=new Addition();
        System.out.println(add1.add(5,10));
        System.out.println(add1.add(5,52,6));
//        System.out.println(add1.add(3,4.4));
        add1.add();
    }
}
