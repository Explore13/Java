package MyPracticePage.Interface;

interface Road{
    void moveLeft();
    void moveRight();
}

class Car implements Road
{

    @Override
    public void moveLeft() {
        System.out.println("Just moves left");
    }

    @Override
    public void moveRight() {
        System.out.println("Just moves right");
    }
}
public class Interface_Basics {
    public static void main(String[] args) {

        /* Road obj = new Road(); */

        Road obj = new Car();
        obj.moveRight();
        obj.moveLeft();
    }
}
