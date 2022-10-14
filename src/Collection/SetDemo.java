package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> country=new HashSet<>();
        Set<String> States = new HashSet<>();

        country.add("india");
        country.add("USA");
        country.add("Nepal");
        country.add("China");
        country.add(null);

        System.out.println(country);
        States.add("Maharashrtra");
        States.add("kerala");
        States.add("Punjab");
        States.add("Mp");

      country.addAll(States);
        System.out.println(country);


    }


}
