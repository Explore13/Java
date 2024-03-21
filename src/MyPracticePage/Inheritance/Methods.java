package MyPracticePage.Inheritance;

class Animal{
    public void eat()
    {
        System.out.println("Animal eats everything");
    }

    public void sleep()
    {
        System.out.println("Animal can sleep");
    }
}

class Tiger extends Animal{

    @Override
    public void eat() // overriding method
    {
        System.out.println("Tigers eats only Chicken (Overriding Method)");
    }

    public void run() // specialized method
    {
        System.out.println("Tiger can run");
    }
}

class TigerChild extends Tiger{
    @Override
    public void run() {
       super.run();
       System.out.println("Can not run");
    }
}
public class Methods {
    public static void main(String[] args) {
    Tiger tc = new TigerChild();

    }
}
