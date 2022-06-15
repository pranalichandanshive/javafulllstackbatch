package controlflowstatement;

public class SwitchEx {
    public static void main(String[] args) {
        int ch =3;
        switch(ch){
            case 1 :
                System.out.println("One");
                break;

            case 2 :
                System.out.println("Two");
                break;
            case 3 :
                System.out.println("Three");
                break;
            case 4 :
                System.out.println("Four");
                break;
            default:
                System.out.println("no match found");
                break;
        }
    }
}
