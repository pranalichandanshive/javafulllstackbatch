package Assignment;

public class PrimNO {
    public static void main(String[] args) {
      boolean flag;
      int no=17;
      for(int i=2;i<no/2;i++){
          if(no%i==0){
              flag=true;
              break;
          }
          else{
              flag=false;
          }
      }
      if (flag=true){
          System.out.println("Number is Prime");
      }
      else{
          System.out.println("Not a Prime Number");
      }
        System.out.println(true? "prim Number":"Not Prim number");
    }

}
