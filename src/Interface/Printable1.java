package Interface;
//Multiple Inheritance in JAVA
//If a class implements multiple interfaces, or an interface extends multiple interfaces,
// it is known as multiple inheritance.
public interface Printable1 {
    void print();
}
interface Showable{
    void show();
}
class A7 implements Printable1,Showable{
    @Override
    public void print() {
        System.out.println("Hellooo");
    }

    @Override
    public void show() {
        System.out.println("World");
    }
}
class Printable1Impl{
    public static void main(String[] args) {
        A7 obj=new A7();
        obj.print();
        obj.show();
    }
}
