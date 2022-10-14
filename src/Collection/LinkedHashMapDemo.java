package Collection;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map =new LinkedHashMap<>();
        map.put(1,"Amit");
        map.put(2,"mitali");
        map.put(3,"tanay");
        map.put(4,"sita");
        map.put(5,"Abhi");
        System.out.println(map);
        map.put(null,null);
        map.put(3,null);
        map.put(null,"pranali");
        System.out.println(map);
    }
}
