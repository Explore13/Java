package Topics.Inheritance;
class AeroPlane1{
    public  void fly(){ //overridden
        System.out.println("Aeroplane can fly");
    }
    public void takeOff(){
        System.out.println("Aeroplane is taking off");
    }
}
class CargoPlane1 extends AeroPlane1{

    public void fly() { //overriding
        System.out.println("CargoPlane flies @ lower height");
    }
}
class PassengerPlane1 extends AeroPlane1{
    public void fly() { //overriding
        System.out.println("PassengerPlane flies @ Medium height");
    }
}
public class Types_Of_Methods$$Overridden_Method {
    public static void main(String[] args) {
        CargoPlane1 cp=new CargoPlane1();
        cp.fly();
        cp.takeOff();
        PassengerPlane1 pp=new PassengerPlane1();
        pp.fly();
        pp.takeOff();

        AeroPlane1 ap=new AeroPlane1();
        ap.fly();
        ap.takeOff();
    }
}

/*
After Inheritance,we modified the methods inside the child class. The method inside the child class is called overriding method(as I am overriding
the method) and the method in parent class is called overridden method(as it is overridden). Changes only happens in Child Class's Method,not in Parent
Class's method.
 */
