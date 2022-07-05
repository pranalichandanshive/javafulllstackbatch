package Interface;

public interface Bank1 {
    float rateOfInterest();
}
class SBI implements Bank1{
    @Override
    public float rateOfInterest() {
        return 9.5f;
    }
}
class PNB implements Bank1{
    @Override
    public float rateOfInterest() {
        return 8.5f;
    }
}
class Bank1Impl{
    public static void main(String[] args) {
        Bank1 b=new SBI();
        System.out.println("ROI : "+b.rateOfInterest());
    }
}
