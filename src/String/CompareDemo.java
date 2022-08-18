package String;

public class CompareDemo {
    public static void main(String[] args) {
        String s1= "Pune";
        String s2="PUNE";
        String s3=new String("Pune");
        if(s1==s2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        if(s1.equals(s2)){
            System.out.println(:true);
        }
        else {
            System.out.println("false");
        }

    }
}
