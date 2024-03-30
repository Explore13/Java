package Topics._19_Interface;


interface A{

   // int num; ---> public static final ---> Have to initialize because of final
    int num=5;

 //  void show(){
    // public abstract void show() ---> abstract method can not have a body
  //  }

    void show();
}
public class _1_What {
    public static void main(String[] args) {
       // System.out.println(num); // num is inside the A class,can not access

        System.out.println(A.num); //public static final // we can access final using Class Name

        // A obj=new A(); A is an abstract class,we can not create an object of abstract class

    }
}
