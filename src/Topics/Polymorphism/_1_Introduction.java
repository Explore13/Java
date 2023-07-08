package Topics.Polymorphism;
class Aeroplane{
    public void takeOff(){
        System.out.println("Aeroplane is taking off");
    }
    public void fly(){
        System.out.println("Aeroplane can fly");
    }
}

class CargoPlane extends Aeroplane{
    public void takeOff(){
        System.out.println("Cargo-plane is taking off");
    }
    public void fly(){
        System.out.println("It flies @ low height");

    }
}
class PassengerPlane extends Aeroplane{
    public void takeOff(){
        System.out.println("Passenger-plane is taking off");
    }
    public void fly(){
        System.out.println("It flies @ medium height");
    }
}
public class _1_Introduction {
    public static void main(String[] args) {
    CargoPlane cp=new CargoPlane();
    cp.takeOff();
    cp.fly();
    PassengerPlane pp=new PassengerPlane();
    pp.takeOff();
    pp.fly();
        // pp=cp;Error
        /*
        Type of pp : PassengerPlane()
        Type of cp : CargoPlane()

       pp and cp having different type. So, error ...
         */

        Aeroplane ref;
        /*
        Parent Class reference can hold the address of child
        class object.
         */
        ref=cp;
        ref.fly();
        ref.takeOff();

        ref=pp;
        ref.fly();
        ref.takeOff();

        /*
        To achieve polymorphism we have to create parent class
        reference for child class.
         */
    }
}


/*
NOTE: This is not the right way to achieve polymorphism, because
in polymorphism code is reducing but here code is not reducing.
But the concept remains same.
 */
