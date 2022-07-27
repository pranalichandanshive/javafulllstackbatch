package Interface;
//Question .1) Multiple inheritance is not supported through class in java,
// but it is possible by an interface, why?
//---------------------------------------------------------------------------
//ANSWER :-
//As we have explained in the inheritance chapter,
// multiple inheritance is not supported in the case of class because of ambiguity.
//  However, it is supported in case of an interface because there is no ambiguity.
//   It is because its implementation is provided by the implementation class.
interface Printable2{
    void print();
}
interface Showable2{
    void print();
}

class TI3 implements Printable2, Showable2{
    public void print(){System.out.println("Hello");}
    public static void main(String args[]){
        TI3 obj = new TI3();
        obj.print();
    }
}
//As you can see in the above example,
// Printable2 and Showable2 interface have same methods but its implementation
// is provided by class TI3,
// so there is no ambiguity.

