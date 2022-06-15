package Assignment;

public class Star2 {
    public static void main(String[] args) {
        int row =5;
        for (int i = 0; i < row; i++)
        {
            for (int j= 0; j < i; j++)
            {
                System.out.println("* ");
            }
            System.out.println();
        }
    }
}
