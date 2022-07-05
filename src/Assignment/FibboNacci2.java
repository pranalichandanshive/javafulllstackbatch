package Assignment;

public class FibboNacci2 {
    public static void main(String[] args) {
        int no1=0,no2=1;
        int limit=10;
        System.out.println(no1+ "\n"+no2);
        while(limit>0){
            int next=no1+no2;
            System.out.println(next);
            no1=no2;
            no2=next;
            limit--;
        }
    }
}
