package Interface;
//interface Example
//In this example, the Printable interface has only one method, and its implementation is provided in the A6 class.
public interface Printable {
    void print();
}
    class A6 implements Printable {
        @Override
        public void print() {
            System.out.println("Helloooo!!");

        }
    }
    class PrintableImpl{
        public static void main(String[] args) {
            A6 obj=new A6();
            obj.print();
        }
    }


