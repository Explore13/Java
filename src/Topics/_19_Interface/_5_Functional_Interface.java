package Topics._19_Interface;

import java.lang.annotation.Inherited;

interface App {
    void show();

    default void config() // non-static method
    {
        System.out.println("Java 8 ka feature hain guysssss");
    }

    static void abc() // static method
    {
        System.out.println("A static method inside the App");
    }
}

class Dev implements App{
    public void show()
    {
        System.out.println("Show method");
    }

    @Override
    public void config() {
        System.out.println("Hello bro, I am overridden");
    }

//    public static abc()
//    {
//        System.out.println("Can not be overridden");
//    }
}
public class _5_Functional_Interface {
    public static void main(String[] args) {
        App.abc(); // static methods can be called only using class or interface name
        // App.config(); non-static method needs object to be called
        App a = new Dev();
        a.config();
        a.show();
    }
}


/*
# Java 8 Features :
1. default Methods in interfaces
2. static methods in interfaces
3. Functional interfaces

Note :  class-name or interface-name ---> static reference

# Interface having 3 types :
i) Single Abstract Method Interface ( SAM ) : Only one abstract method
ii) Normal Interface : Multiple abstract methods
iii) Marker Interface : No abstract methods

Note : In Java 8 Single Abstract Method Interface is called as Functional Interface

# Functional Interface :
- If any Java Interface allows only one abstract method then it is called
a "Functional Interface"
- To make any interface as Functional Interface then we have to use the following
annotation just above the interface.  @FunctionalInterface
- Ex: java.lang.Runnable, java.Comparable

 */