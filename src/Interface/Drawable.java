
//      Java Interface Example: Drawable
//
//        In this example, the Drawable interface has only one method.
//        Its implementation is provided by Rectangle and Circle classes.
//        In a real scenario, an interface is defined by someone else,
//        but its implementation is provided by different implementation providers.
//        Moreover, it is used by someone else.
//        The implementation part is hidden by the user who uses the interface.





package Interface;

public interface Drawable {
    void print();
}
class Rectangle implements Drawable {
    @Override
    public void print() {
        System.out.println("Drawing Rectangle");
    }
}

    class Circle implements Drawable {
        @Override
        public void print() {
            System.out.println("Drawing Circle");
        }
    }

        class DrawableImpl{
            public static void main(String[] args) {
                Drawable d=new Circle();
                d.print();
                }

            }



