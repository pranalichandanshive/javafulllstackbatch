package Collection;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> map=new TreeMap<>();
        map.put(105,"Maharashtra");
        map.put(103,"MP");
        map.put(101,"Goa");
        System.out.println(map);
//        map.put(null,"kerala");   throw null pointer exception
        map.put(100,null);
        System.out.println(map);
    }
}
