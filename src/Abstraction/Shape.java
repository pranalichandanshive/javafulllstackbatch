package Abstraction;

public abstract class Shape {
   abstract double calculateArea();
    void display(){
        System.out.println("Calculating area of diff. shape");

    }

}
class Rectangle extends Shape {
    int breath;
    int height;

    public Rectangle(int breath, int height) {
        this.breath = breath;
        this.height = height;
    }

    @Override
    double calculateArea() {
        double result = breath * height;
        return breath * height;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Area of Rectangle : " + calculateArea());
    }
}
    class Circle extends Shape{
        double pi;
        int radius;

        public Circle(double pi, int radius) {
            this.pi = pi;
            this.radius = radius;
        }

        @Override
        double calculateArea() {
            double area=pi *radius*radius;
            return pi*radius*radius;
        }

        @Override
        void display() {
            super.display();
            System.out.println("Area of circle : "+calculateArea());
        }
    }

class ShapeImpl{
    public static void main(String[] args) {
        Shape shape=new Rectangle(5,7);
        shape.display();
        Shape shape1=new Circle(3.14,3);
        shape1.display();
        }

    }
