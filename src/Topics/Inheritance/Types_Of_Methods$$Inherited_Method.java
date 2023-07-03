package Topics.Inheritance;
class AeroPlane
{
    public void takeOff(){
        System.out.println("AeroPlane is taking off");
    }
    public void fly(){
        System.out.println("Aeroplane is Flying");
    }
}

class CargoPlane extends AeroPlane
{

}
class PassengerPlane extends AeroPlane
{

}
public class Types_Of_Methods$$Inherited_Method {
    public static void main(String[] args) {
        CargoPlane cp=new CargoPlane();
        cp.takeOff();
        cp.fly();
    PassengerPlane pp=new PassengerPlane();
    pp.takeOff();
    pp.fly();
    }
}

/*
Here all the methods of Parent Class (AeroPlane) are inherited to child classes (CargoPlane , PassengerPlane).
Nothing has been changed. Values are same as it is. (We used the methods as it is)
 */