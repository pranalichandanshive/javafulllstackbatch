package Assignment;

public class Pyramid {
    public static void main(String[] args) {
//        int no = 5;
        for(int i=1;i<=4;i++)
        {
            for(int j=4;j>=i;j--)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
