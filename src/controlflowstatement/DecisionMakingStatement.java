package controlflowstatement;

public class DecisionMakingStatement {
    public static void main(String[] args) {
        String city ="pune";
        if(city == "pune")
            System.out.println("You are from pune");
        else
            System.out.println("You are from mumbai");
        if(city == "mumbai")
            System.out.println("u r from mumbai");
        else if(city =="Goa")
            System.out.println("u r from goa");
        else
            System.out.println("you are from pune");

        String country = "india";
        if(country == "india"){
            if(city == "goa") {
                System.out.println("goa is in india");
            }
                else if(city == "pune"){
                        System.out.println("pune is in india");
                    }
                    else{
                        System.out.println("your from other country");
                    }
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



        }


