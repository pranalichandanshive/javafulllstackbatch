/**
 * Operators
 *
 * unary operator(++,--)
 * tilde operator(~)
 * negation (!)
 * arithmetic operator(+,-,*,/,%)
 * shift operator (<<left shift ex.1.x<<3=x*2^3........,>>right shift= X>>3=x/2^3)
 * logical and bitwise operator
 * assignment operator
 * */


public class Operators {
    public static void main(String[] args) {
        int a = 30;
        boolean flag = false;
        System.out.println(a++);
        System.out.println(--a);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(~a);
        System.out.println(!flag);

        int x=10,y=20,z=30;
        System.out.println(x+y);
        System.out.println(y-x);
        System.out.println(x*z);
        System.out.println(z/x);
        System.out.println(z%x);
     //        shift operator
        System.out.println(x<<2);
        System.out.println(x<<3);
        System.out.println(x>>2);
        System.out.println(x>>3);

//        logical & bitwise operator
        System.out.println(x<y && y>z);
        System.out.println(x<y & y>z);
        System.out.println(z<y || y>x);
        System.out.println(z<y | y>x);

//        ternary operator
        System.out.println(x>y ? "x is max":"y is max");

    }
}
//   git config --global user.email "you@example.com"
//        git config --global user.name "Your Name"

