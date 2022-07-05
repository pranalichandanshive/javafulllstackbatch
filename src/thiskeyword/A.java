package thiskeyword;

public class A {
    int n;
    void m(A a){
        System.out.println("call current class method m");

    }
    void n(){
        System.out.println("n method get called");
        m(this);
        System.out.println("Exit from n");

    }

    public static void main(String[] args) {
        A a =new A();
        a.n();

    }
}
