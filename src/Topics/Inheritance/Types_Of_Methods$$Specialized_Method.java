package Topics.Inheritance;
class AeroPlane2{
    public  void fly(){
        System.out.println("Aeroplane can fly");
    }
    public void takeOff(){
        System.out.println("Aeroplane is taking off");
    }
}
class CargoPlane2 extends AeroPlane1{

    public void fly() {
        System.out.println("CargoPlane flies @ lower height");
    }

    public void carryGood(){
        System.out.println("CargoPlane Carries Goods");
    }
}
class PassengerPlane2 extends AeroPlane1{
    public void fly() {
        System.out.println("PassengerPlane flies @ Medium height");
    }
    public void carryPassenger(){
        System.out.println("PassengerPlane Carries Passengers");
    }
}
public class Types_Of_Methods$$Specialized_Method {
    public static void main(String[] args) {
        CargoPlane2 cp=new CargoPlane2();
        cp.fly();
        cp.takeOff();
        PassengerPlane2 pp=new PassengerPlane2();
        pp.fly();
        pp.takeOff();

        AeroPlane2 ap=new AeroPlane2();
        ap.fly();
        ap.takeOff();
    }
}
/*
Such method which is in the child class but is not present in parent class is called Specialized method.
 */
