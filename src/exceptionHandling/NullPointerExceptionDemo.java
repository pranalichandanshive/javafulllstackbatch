package exceptionHandling;

import java.util.Locale;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        System.out.println(a[6]);

        String name = null;
        System.out.println(name.toLowerCase());
    }
}
