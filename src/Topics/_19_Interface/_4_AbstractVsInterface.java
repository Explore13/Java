package Topics._19_Interface;

abstract class AbstractClass{
    abstract public void abstractMethod();

    public void show()
    {
        System.out.println("Inside the Abstract Class");
    }
}

interface Interface
{
    void interfaceMethod();
}
public class _4_AbstractVsInterface {
    public static void main(String[] args) {
        /*
        -----------------Abstract------------------------
        1. Partial Implementation
        2. Abstract class can contain normal methods
        3. Their can be normal variables and also public static final
        4. We can have constructor
       */

        /*
        -----------------Interface------------------------
        1. No object Creation
        2. Every method is public and abstract, no normal method
        3. Can not declare method like private, protected final, static, synchronized, native, strictfp etc
        4. Every variable is private static final
        5. No constructor
       */


    }
}
