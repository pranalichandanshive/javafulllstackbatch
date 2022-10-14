package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map <Integer,String> map=new HashMap<>();
        map.put(1,"amita");
        map.put(2,"prajakta");
        map.put(3,"sanjana");
        map.put(4,"janhavi");
        map.put(5,"pranali");
        System.out.println(map);
        map.put(3,"piyusha");
        System.out.println(map);
        map.put(null,null);
        map.put(null,"sony");
        map.put(6,null);
        System.out.println(map);
        System.out.println(map.get(5));
        Iterator iterator=map.entrySet().iterator();


    }
}
