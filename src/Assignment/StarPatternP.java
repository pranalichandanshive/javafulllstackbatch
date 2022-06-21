package Assignment;

public class StarPatternP {
    public static void main(String[] args) {
        for(int i=0;i<7;i++){
            for(int j=0;j<3;j++){
                if(j==0||j==i+1||i+j==4){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
