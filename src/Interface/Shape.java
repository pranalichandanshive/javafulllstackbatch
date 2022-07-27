package Interface;

import java.util.Scanner;

public interface Shape {
    double calculateArea();
}
class Rect implements Shape{
    int breadth;
    int height;
    Rect(int breadth,int height){
        this.height = height;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return height * breadth;
    }
}
class Circle1 implements Shape{

    double radius;

    public Circle1( double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return (radius*radius)*Math.PI;
    }
}
class Square1 implements Shape{
double length;
double width;

    public Square1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length*width;
    }
}

class ShapeImpl{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("1.Rectangle\n2.Circle\n3.Square\n4.Triangle\n5.Exit");
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            Shape shape;
            switch (ch){
                case 1:
                    System.out.println("Enter breadth & height : ");
                    int breadth = sc.nextInt();
                    int height = sc.nextInt();
                    shape = new Rect(breadth,height);
                    System.out.println("Area of Rectangle "+shape.calculateArea());
                    break;
                case 2:
                    System.out.println("Enter the radius  : ");
                    double r= sc.nextInt();
                    double pi= sc.nextInt();
                    shape = new Circle1(r);
                    System.out.println("Area of Circle1 : "+shape.calculateArea());
                case 3:
                    System.out.println("Enter length & width : ");
                    double length = sc.nextInt();
                    double width = sc.nextInt();
                    shape = new Square1(length,width);
                    System.out.println("Area of Square "+shape.calculateArea());
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }while (ch<=5);
    }
}
