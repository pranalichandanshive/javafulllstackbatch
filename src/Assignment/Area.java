package Assignment;

public interface Area {
    double pi=3.14;
    double cals(double x,double y);
}
class Rectangle implements Area{
    @Override
    public double cals(double x, double y) {
        return x*y;
    }
}
class Circle implements Area{
    @Override
    public double cals(double x, double y) {
        return pi*x*x;
    }
}
class Square implements Area{
    @Override
    public double cals(double x, double y) {
        return y*y;
    }
}
class Triangle implements Area{
    @Override
    public double cals(double x, double y) {
        return 1/2*x*y;
    }
}
class AreaImpl{
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        Area a;
        a=r;
        System.out.println("Area of rectanlge : "+a.cals(10,20));

    }
}


