package Topics._17_Polymorphism;
class AeroPlane1{
    public void takeOff(){
        System.out.println("Aeroplane is taking off");
    }
    public void fly(){
        System.out.println("Aeroplane can fly");
    }
}
class CargoPlane1 extends AeroPlane1{
    public void takeOff(){
        System.out.println("Cargo-plane is taking off");
    }

    public void fly() {
        System.out.println("Cargo-plane flies @ lower height");
    }
}
class PassengerPlane1 extends AeroPlane1{
    public void takeOff(){
        System.out.println("Passenger-plane is taking off");
    }


    public void fly() {
        System.out.println("Passenger-plane flies @ medium height");
    }
}

class FighterPlane extends AeroPlane1{
    public void takeOff() {
        System.out.println("Fighter-plane is taking off");
    }


    public void fly() {
        System.out.println("Fighter-plane flies @ high height");
    }
}

class Airport{
    public void poly(AeroPlane1 ref){
    ref.takeOff();
    ref.fly();
    System.out.println("------------------------------------");
    }
}
public class _2_MoreOnPolymorphism {
    public static void main(String[] args) {
        CargoPlane1 cp=new CargoPlane1();
        /*
        new CargoPlane1(); ---> new object of type CargoPlane1();
        cp is the reference variable of type CargoPlane1();

        Reference variable type and  object type should be same.
        Ex : PassengerPlane1 cp=new CargoPlane1(): ---> ERROR

        (Exception : Parent Class)
        Parent class variable can refer to child class object.
        Ex: AeroPlane1 cp=new CargoPlane1(); ---> Right
         */
        PassengerPlane1 pp=new PassengerPlane1();

        FighterPlane fp=new FighterPlane();

         // cp.fly();
        // cp.takeOff();

        // pp.fly();
        // pp.takeOff();

       // fp.fly();
       // fp.takeOff();
        Airport a=new Airport();
        a.poly(cp);
        a.poly(pp);
        a.poly(fp);
    }
}

/*
KeyPoint:
Parent type reference can hold the address of Child type object.
 */

/*
This polymorphism happened at runtime.
 */