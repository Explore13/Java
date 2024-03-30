package Topics._18_Polymorphism;

/*
Abstract = No body inside
Only for class and methods.
Not for variables,constructions
 */
abstract class AeroPlane2{
 /*
 public void takeOff() {
      System.out.println("Aeroplane is taking off");
  }
  public void fly(){
      System.out.println("Aeroplane can fly");
  }

  If any method is not implemented anywhere, then we can
  change this method to an abstract method,here takeOff and fly
  are not used in anywhere. values are changing in every child class.
  So we will make it abstract
  */

    abstract public void takeOff();
    abstract public void fly();

    /*
    If minimum one method is abstract in the class, then we have to make
    the class abstract.

    Abstract method is such methods that do not contain an implementation
    or body. Abstract method means it will be overridden by the subclass that
    inherits from the abstract class.
    */


    public void landing(){
        System.out.println("Aeroplane is landing");
    }

    /*
    When we add landing() method then the abstraction becomes
    impure abstraction. Before that every method were abstract,
    so the abstraction was pure abstraction.
     */
    /*
    Conclusion :
    Abstract class can hold both abstract method and non-abstract
    method.
     */
}
 class CargoPlane2 extends AeroPlane2
{
    /*
    takeOff() ---> Overriding Method
    fly() ---> Overriding Method
    landing() --->  Inherited Method
    alert() ---> Specialized Method
    */
    @Override
    public void takeOff() {
        System.out.println("Cargo-Plane is taking off");
    }
    @Override
    public void fly() {
        System.out.println("Cargo-Plane flies @lower height");
    }

    /* Specialized Method */
    public void alert(){
    System.out.println("Alert !!!");
}
}
class PassengerPlane2 extends AeroPlane2
{
    /*
    takeOff() ---> Overriding Method
    fly() ---> Overriding Method
    landing() --->  Inherited Method
    */

    @Override
    public void takeOff() {
        System.out.println("Passenger-Plane is taking off");
    }

    @Override
    public void fly() {
        System.out.println("Passenger-Plane flies @medium height");
    }
}
public class _3_Abstraction$AbstractKeyword {
    public static void main(String[] args) {
        AeroPlane2 ref1=new CargoPlane2();
        /*
        For the Abstract class
        We can make reference of Abstract class type but cannot
        make object of Abstract class type
        */
        ref1.fly();
        ref1.takeOff();
        ref1.landing();
        /*
        ref1.alert();
        We can not access directly of a child class using
        parent class reference. We have to cast this to achieve this.
         */

        ((CargoPlane2)ref1).alert();
        /*
        Casting the type of reference variable ref1 (AeroPlane2 to CargoPlane2)
        This is called Down Casting because from Parent Class Reference to Child
        class reference.
        */

        AeroPlane2 ref3=new PassengerPlane2();

        ref3.takeOff();
        ref3.fly();
        ref1.landing();

        /* AeroPlane2 ref=new AeroPlane2();

        We can not make an object of Abstract Class. Because
        abstract method has no implementation/body. So,it is an
        incomplete class, We can not make object of an incomplete
        class.
         */
    }
}
