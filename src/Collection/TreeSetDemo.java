package Collection;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(87);
        numbers.add(84);
        numbers.add(54);
        numbers.add(67);
        numbers.add(93);
        numbers.add(77);
        numbers.add(100);
        numbers.add(1);
        System.out.println(numbers);
        System.out.println(numbers.ceiling(97));
        System.out.println(numbers.floor(97));

    }
}
