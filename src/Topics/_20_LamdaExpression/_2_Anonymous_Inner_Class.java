package Topics._20_LamdaExpression;

interface Car {
    void drive();
}

/*
class Mercedes implements Car{

    @Override
    public void drive()
    {
        System.out.println("Let's Go...");
    }
}
*/

public class _2_Anonymous_Inner_Class {
    public static void main(String[] args) {
// Car car = new Car(); Can not make object of Interface as it has no implementation
// Car car = new Mercedes();

        Car car = new Car() {
            @Override
            public void drive() {
                System.out.println("Driving..");
            }
        };
        car.drive();
    }
}

/*
Interface needs implementation. So, we created Mercedes class but
suppose we need it only once,then we can make anonymous class.

        {
            @Override
            public void drive() {
                System.out.println("Driving..");
            }
        }

        It is the anonymous class. Actually object is created of Anonymous Class
        which implements Car interface behind the scene.

        As this anonymous class is created inside a class (_2_Anonymous_Inner_Class), it is
        known as "Anonymous Inner Class"

        Note :  Anonymous Class can be used only once.
*/