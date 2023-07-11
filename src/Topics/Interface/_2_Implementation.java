package Topics.Interface;
interface A1 {
    void show();
}
interface X
{
    void abc();
}
class B implements A1,X
{
   public void show(){
        System.out.println("In show");
    }


    public void abc() {
        System.out.println("In abc");
    }
}
public class _2_Implementation {
    public static void main(String[] args) {

        /*
        A1 obj=new B();
        obj.show();
        obj.abc(); ---> Error
        When we make a reference of A named obj,it only knows things which is in A1
        abc is not there inside the A1
        */

        B obj =new B();
        obj.abc();
        obj.show();
    }
}
/*
1. Inside the interface, methods are only declared not defined.
2. Variables are public static final and methods are public abstract.
3. One class can implement more than one interface.
4. One interface can extend another interface.

Interface to Class ---> implements
Class to Class ---> extends
 */