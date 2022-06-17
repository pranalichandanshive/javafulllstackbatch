package Assignment;

public class SwitchEx2 {
    public static void main(String[] args){
        String ch = "Mar";
        switch(ch){
            case "Jan" :
                System.out.println("Janvary");
                break;
            case "Feb" :
                System.out.println("February");
                break;
            case "Mar" :
                System.out.println("March");
                break;
            case "Apr" :
                System.out.println("April");
                break;
            default:
                System.out.println("none");
                break;
        }
    }
}
